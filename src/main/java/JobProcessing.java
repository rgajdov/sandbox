public interface JobProcessing {

    default int processJob(int code) {
        if (code == 1) {
            return 1;
        }
        return 0;
    }
}
