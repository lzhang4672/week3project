# Finance Stock Analyzer :bar_chart:

## Project Domain
Finance (Stocks)

## :pencil: Description
The proposed application serves as a powerful tool for making informed decisions on stock investments.

### How it Works
1. **User Input**: Takes a stock ticker as input.
2. **Data Aggregation**: Scrapes the internet for news articles, forum discussions, and other content.
3. **Data Cleaning and Preprocessing**: Handles data cleaning to ensure the quality and consistency of the scraped information. Uses Natural Language Processing (NLP) techniques to preprocess and structure textual data (for example filter words with strong sentiment). If we are web scraping for articles we may return something that contains html tags, text for ads, text in a messagebox or forms that may not be part of the article. These excess texts will fill up the word limit for each request we send to OpenAI, so it will need to be filtered out. 
4. **Summary**: Generates a comprehensive summary and overview of the queried company. Includes a sentiment analysis to assess market sentiment surrounding the company.
5. **Caching**: Temporarily caches scraped data for a while in a database. When user queries for a company or stock, the program will first check if there is already previously cached data so it does not need to re-scrape the same content. Cached data will be deleted after some set period of time to avoid outdated data.

### Features
**Technical Details:**
- Provides technical details sourced from stock info APIs (e.g., market cap, price, etc.).
- Utilizes reliable stock info APIs like Alpha Vantage to fetch real-time market data.
**User Dashboard:**
Develops a user-friendly dashboard for easy access to summarized information.
Allows users to save favorite companies and view historical data.
**Custom Alerts:**
Enables users to set custom alerts for specific stock events (e.g., price thresholds, news updates).
Integrates with notification services like email or SMS for timely alerts.

To achieve these functionalities, we rely on stock info APIs and NLP APIs like OpenAI's ChatGPT.

## :warning: Challenges
- **Costly APIs**: Many forums (Twitter, Reddit) and news providers (Google News) either have pricey APIs or no API support.
- **Our Solution**: Leverage web scraping libraries for manual data aggregation. One tool we can use is Selenium. This will also allow us to access dynamic websites, which broadens the websites we can scrape, therefore it can speed up the scraping process (because we get less failed returns) and allow us to access more information (dynamic websites are becoming more popular).
- **Reliability of proposed NLP Techniques**:
    - OpenAI may generate unexpected text or format when given a prompt. For example given the same prompt multiple times, it could generate a summarized text sometimes, but other times it may output an error
    - Some toolkits are unable to pick up embedded semantic meaning and may output a wrong sentiment analysis.

## :link: Resources
- **Stock Info APIs**
    - [Market Data API Documentation](https://docs.marketdata.app/api)
    - [Alpha Vantage](https://www.alphavantage.co)

- **ChatGPT API**
    - [OpenAI API Guide](https://platform.openai.com/docs/guides/gpt)

- **Database API**
  - [Java Database Connectivity](https://docs.oracle.com/javase/tutorial/jdbc/basics/index.html) (uses SQL, not sure if we want to consider MongoDB)

## Tool Screenshots
[![Screenshot-2023-09-28-203518.png](https://i.postimg.cc/KvTgCgw9/Screenshot-2023-09-28-203518.png)](https://postimg.cc/56x0Cjxv)

## Sample Output
{"s":"ok","symbol":["AAPL"],"ask":[170.85],"askSize":[1],"bid":[170.8],"bidSize":[1],"mid":[170.8],"last":[170.8],
"change":[null],"changepct":[null],"volume":[56284078],"updated":[1695947136]}

## Technical Problems Blocking Output
N/A
