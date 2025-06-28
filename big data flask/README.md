# 📊 Big Data Jobs Analysis - Flask Web Application

Welcome to my **Big Data Jobs Analysis** project! This is a comprehensive web application built with Flask that analyzes data science job market trends, skills requirements, and salary insights. 

## 🎯 What This Project Does

This application helps you understand the current state of the data science job market by analyzing real job data. It provides:

- **Job Market Insights**: Explore different data science job families and their distributions
- **Skills Analysis**: Discover the most in-demand skills in the industry
- **Salary Trends**: Understand compensation patterns across experience levels
- **Interactive Visualizations**: Beautiful charts and graphs to visualize the data
- **Career Recommendations**: Get insights to guide your career decisions

## 🚀 Features

### 📈 Data Analysis Dashboard
- **Competence Level Analysis**: See how experience levels are distributed across job titles
- **Skills Clustering**: Understand which skills are most commonly required together
- **Job Family Overview**: Explore different categories of data science roles
- **Interactive Heatmaps**: Visualize correlations between different job aspects

### 🎨 Interactive Visualizations
- **Pie Charts**: Distribution of competence levels
- **Bar Charts**: Skills frequency analysis
- **Heatmaps**: Correlation analysis between job factors
- **Word Clouds**: Most common skills visualization

### 📊 Data Processing
- **Data Preprocessing**: Clean and prepare the dataset for analysis
- **Missing Value Handling**: Intelligent handling of incomplete data
- **Feature Engineering**: Create new insights from existing data
- **Statistical Analysis**: Comprehensive statistical insights

## 🛠️ Technology Stack

- **Backend**: Flask (Python web framework)
- **Data Processing**: Pandas, NumPy
- **Visualization**: Matplotlib, Seaborn, Plotly
- **Machine Learning**: Scikit-learn
- **Text Processing**: NLTK, WordCloud
- **Frontend**: HTML, CSS, Bootstrap

## 📦 Installation & Setup

### Prerequisites
- Python 3.8 or higher
- pip (Python package installer)

### Step 1: Clone the Repository
```bash
git clone https://github.com/deepthireddy246/big-data-flask.git
cd big-data-flask
```

### Step 2: Install Dependencies
```bash
pip install -r requirements.txt
```

### Step 3: Run the Application
```bash
python app.py
```

### Step 4: Access the Application
Open your web browser and go to: `http://localhost:5000`

## 📁 Project Structure

```
big-data-flask/
├── app.py                 # Main Flask application
├── requirements.txt       # Python dependencies
├── Task_4.py             # Job title grouping functionality
├── Task_5.py             # Advanced analysis and visualization
├── task2_3.py            # Skills processing
├── download_stopwords.py # NLTK stopwords downloader
├── dataset/
│   └── Data Science Jobs Salaries.csv  # Main dataset
├── templates/            # HTML templates
│   ├── homepage.html
│   ├── data_analysis.html
│   ├── skills.html
│   ├── competence_levels.html
│   ├── recommendation.html
│   ├── result.html
│   └── skills_analysis.html
├── plots/               # Generated visualizations
│   ├── competence level heatmap.png
│   ├── distribution competence level bar.png
│   ├── job family overview.png
│   ├── pie chart.png
│   └── word cloud.png
├── video/               # Demo video
└── jupiter file/        # Jupyter notebook
```

## 🎮 How to Use

### 1. **Homepage** (`/`)
- Start here to get an overview of the application
- Navigate to different analysis sections

### 2. **Data Preprocessing** (`/preprocess`)
- View the raw dataset
- See how data is cleaned and prepared
- Understand missing value patterns

### 3. **Skills Analysis** (`/skills`)
- Explore the most in-demand skills
- See skills frequency across job postings
- Understand skill requirements by job family

### 4. **Competence Levels** (`/competence_levels`)
- View experience level distributions
- Interactive pie chart visualization
- Understand career progression patterns

### 5. **Data Analysis Dashboard** (`/data_analysis`)
- Comprehensive analysis with multiple visualizations
- Skills clustering analysis
- Job family overview with statistics

### 6. **Skills Analysis** (`/skills_analysis`)
- Advanced skills analysis
- Job families overview
- Skill clusters and rankings

### 7. **Recommendations** (`/recommendations`)
- Career guidance based on analysis
- Industry insights and trends
- Professional development tips

## 📊 Dataset Information

The application uses the **Data Science Jobs Salaries** dataset, which includes:
- Job titles and descriptions
- Salary information (various currencies)
- Experience levels (Entry, Mid, Senior, Executive)
- Company information
- Remote work preferences
- Skills and requirements

## 🔧 Customization

### Adding New Analysis
1. Create a new Python function in the appropriate task file
2. Add a new route in `app.py`
3. Create a corresponding HTML template
4. Update the navigation

### Modifying Visualizations
- Edit the plotting functions in `Task_5.py`
- Customize colors, styles, and layouts
- Add new chart types as needed

### Dataset Updates
- Replace the CSV file in the `dataset/` folder
- Update preprocessing steps in `app.py` if needed
- Adjust analysis parameters for new data

## 🤝 Contributing

I welcome contributions! Here's how you can help:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/AmazingFeature`)
3. **Commit** your changes (`git commit -m 'Add some AmazingFeature'`)
4. **Push** to the branch (`git push origin feature/AmazingFeature`)
5. **Open** a Pull Request

## 📝 Future Enhancements

- [ ] Real-time data updates
- [ ] User authentication system
- [ ] Personalized recommendations
- [ ] API endpoints for external access
- [ ] Mobile-responsive design improvements
- [ ] Advanced machine learning models
- [ ] Export functionality for reports

## 🐛 Troubleshooting

### Common Issues

**Port already in use:**
```bash
# Kill the process using port 5000
lsof -ti:5000 | xargs kill -9
```

**Missing dependencies:**
```bash
# Reinstall requirements
pip install -r requirements.txt --force-reinstall
```

**Dataset not found:**
- Ensure the CSV file is in the `dataset/` folder
- Check file permissions

## 📞 Support

If you encounter any issues or have questions:
- Create an issue on GitHub
- Check the troubleshooting section above
- Review the code comments for guidance

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 🙏 Acknowledgments

- Data Science Jobs Salaries dataset contributors
- Flask community for the excellent framework
- Open source libraries that made this project possible

---

