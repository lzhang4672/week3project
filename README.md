# Finance Stock Analyzer :bar_chart:

## Project Domain
Finance (Stocks)

## :pencil: Description
The proposed application serves as a powerful tool for making informed decisions on stock investments.

### How it Works
1. **User Input**: Takes a stock ticker as input.
2. **Data Aggregation**: Scrapes the internet for news articles, forum discussions, and other content.
3. **Summary**: Generates a comprehensive summary and overview of the queried company.
4. **Caching**: Temporarily caches scraped data for a while in a database. When user queries for a company or stock, the program will first check if there is already previously cached data so it does not need to re-scrape the same content. Cached data will be deleted after some set period of time to avoid outdated data.

### Features
- Summarizes relevant recent news. 
- Provides technical details sourced from stock info APIs (e.g., market cap, price, etc.).

To achieve these functionalities, we rely on stock info APIs and NLP APIs like OpenAI's ChatGPT.

## :warning: Challenges
- **Costly APIs**: Many forums (Twitter, Reddit) and news providers (Google News) either have pricey APIs or no API support.
- **Our Solution**: Leverage web scraping libraries for manual data aggregation.

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