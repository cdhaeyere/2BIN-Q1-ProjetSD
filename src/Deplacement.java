public class Deplacement {
  private int lineId;
  private String lineNumber;
  private Station origin;
  private Station destination;
  private Station direction;
  private TransportType transportType;
  private int duration;
  private int waitingTime;
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

  public void setLineId(int lineId) {
    this.lineId = lineId;
  }

  public String getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
  }

  public Station getOrigin() {
    return origin;
  }

  public void setOrigin(Station origin) {
    this.origin = origin;
  }

  public Station getDestination() {
    return destination;
  }

  public void setDestination(Station destination) {
    this.destination = destination;
  }

  public Station getDirection() {
    return direction;
  }

  public void setDirection(Station direction) {
    this.direction = direction;
  }

  public TransportType getTransportType() {
    return transportType;
  }

  public void setTransportType(TransportType transportType) {
    this.transportType = transportType;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration += duration;
  }

  public int getWaitingTime() {
    return waitingTime;
  }

  public void setWaitingTime(int waitingTime) {
    this.waitingTime = waitingTime;
  }

  public int getNbTroncon() {
    return nbTroncon;
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
