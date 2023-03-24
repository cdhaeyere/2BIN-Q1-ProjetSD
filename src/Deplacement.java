public class Deplacement {
  private final int lineId;
  private final String lineNumber;
  private final Station origin;
  private Station destination;
  private final Station direction;
  private final TransportType transportType;
  private int duration;
  private final int waitingTime;
  private int nbTroncon;

  public Deplacement(int lineId, String lineNumber, Station origin, Station destination, int waitingTime, int duration,
      int nbTroncon, TransportType transportType, Station direction) {
    this.lineId = lineId;
    this.lineNumber = lineNumber;
    this.origin = origin;
    this.destination = destination;
    this.direction = direction;
    this.transportType = transportType;
    this.duration = duration;
    this.waitingTime = waitingTime;
    this.nbTroncon = nbTroncon;
  }

  public int getLineId() {
    return lineId;
  }

  public void setDestination(Station destination) {
    this.destination = destination;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration += duration;
  }

  public void addTroncon() {
    this.nbTroncon++;
  }

  @Override
  public String toString() {
    return "Deplacement[" +
        "ligne= '" + lineNumber +
        ", départ= " + origin +
        ", arrivee= " + destination +
        ", attente moyenne= " + waitingTime +
        ", duree= " + duration +
        ", nbTroncon=" + nbTroncon +
        ", type= " + transportType +
        ", direction=" + direction +
        ']';
  }
}
