public class JobImpl implements JobProcessing {

    private int code;

    public JobImpl() {

    }

    @Override
    public int processJob(int code) {
        return 2;
        //return JobProcessing.super.processJob(code);

    }
}
