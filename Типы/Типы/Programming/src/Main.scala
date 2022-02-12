

def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {

  1 / sigma / scala.math.sqrt(2 * scala.math.Pi) * scala.math.exp(-(x - mu) * (x - mu) / 2 / sigma /
    sigma)


}