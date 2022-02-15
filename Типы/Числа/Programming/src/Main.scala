import scala.math.BigDecimal.RoundingMode.HALF_UP

def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
  weight.*(1 - potatoWaterRatio)./(1 - crispsWaterRatio).setScale(5, HALF_UP)
}