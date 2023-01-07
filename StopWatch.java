import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;
    private Instant start;
    private Instant end;
    public StopWatch()
    {
        long millis=System.currentTimeMillis();
        this.startTime=new Date(millis);
    }
    public Date getStartTime()
    {
        return startTime;
    }
    public Date getEndTime()
    {
        return endTime;
    }
    public void start()
    {
        long millis=System.currentTimeMillis();
        this.startTime=new Date(millis);
        this.start=Instant.now();
    }
    public void end()
    {
        long milliss=System.currentTimeMillis();
        this.endTime=new Date(milliss);
        this.end=Instant.now();
    }
    public long getTimeElapsed()
    {
        return Duration.between(this.start,this.end).toSeconds();
    }
}
