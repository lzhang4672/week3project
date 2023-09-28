# Finance Stock Analyzer :bar_chart:

## Project Domain
Finance (Stocks)

## :pencil: Description
The proposed application serves as a powerful tool for making informed decisions on stock investments.

### How it Works
1. **User Input**: Takes a stock ticker as input.
2. **Data Aggregation**: Scrapes the internet for news articles, forum discussions, and other content.
3. **Summary**: Generates a comprehensive summary and overview of the queried company.

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
