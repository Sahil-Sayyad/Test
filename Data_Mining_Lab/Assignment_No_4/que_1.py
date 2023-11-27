# Consider following observations/data.And Apply simple linear regression and find
# out estimated coefficients b0 and b1.(use numpy package)
# x = [0,1,2,3,4,5,6,7,8,9,11,13]
# y = [1,3,2,5,7,8,8,9,10,12,16,18]

import numpy as np
import matplotlib.pyplot as plt

def estimate_coef(x,y):
    #number of observations/points
    n = np.size(x)
    #mean of x and y vector
    m_x = np.mean(x)
    m_y = np.mean(y)
    #calculating cross-derivation and dervatition 
    ss_xy = np.sum(y*x)-n*m_y*m_x
    ss_xx = np.sum(x*x)-n+m_x*m_y
    #calculating regression coefficients.
    b_1 = ss_xy / ss_xx
    b_0 = m_y - b_1 * m_x

    return (b_0,b_1)

def plot_regression_line(x,y,h):
    #plotting the actual points as scatter plot.
    plt.scatter(x,y,color = 'm',marker='0')
    #predicted response vector
    y_pred = h[0] + h[1] * x
    #plotting the regression line
    plt.plot(x,y_pred,color='g')
    #putting label
    plt.xlabel('X')
    plt.ylabel('Y')
    #function to showplot
    plt.show()


# def main():
    #obseration/ data
    x = np.array([0,1,2,3,4,5,6,7,8,9,11,13])
    y = np.array([1,3,2,5,7,8,8,9,10,12,16])
    #estimating coefficients
    b = estimate_coef(x,y)
    print("Estimated coefficients : \nb_0 = {}\\nb_1 = {}",format(b[0],b[1]))
    #plotting regression time 
    plot_regression_line(x,y,b)

    # if_name == '_main_'
    
# main()










