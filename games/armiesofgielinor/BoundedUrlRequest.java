/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BoundedUrlRequest implements Runnable {
    static String field_d;
    private java.net.URL url;
    private PlatformTask readerTask;
    private PlatformTask urlStreamTask;
    private PacketBuffer response;
    private int state;
    static int[] field_k;
    static String field_c;
    static int field_j;
    static String field_g;
    private PlatformTaskService platformService;
    static String field_f;
    static String field_e;
    private PlatformTask socketTask;
    private DataInputStream input;

    protected final void finalize() {
        if (this.urlStreamTask != null) {
          if (this.urlStreamTask.result != null) {
            try {
              ((DataInputStream) (this.urlStreamTask.result)).close();
            } catch (Exception exception) {
            }
          }
          this.urlStreamTask = null;
        }
        if (null != this.socketTask) {
          if (null != this.socketTask.result) {
            try {
              ((java.net.Socket) (this.socketTask.result)).close();
            } catch (Exception exception) {
            }
          }
          this.socketTask = null;
        }
        if (null != this.input) {
          try {
            this.input.close();
          } catch (Exception exception) {
          }
          this.input = null;
        }
        this.readerTask = null;
    }

    final synchronized boolean poll(int pendingStatus) {
        Throwable caughtFailure = null;
        IOException ioFailure = null;
        OutputStream socketOutput = null;
        java.net.Socket socket = null;
        CharSequence grabRequest = null;
        if (this.state >= 2) {
          return true;
        }
        if (this.state == 0) {
          if (this.urlStreamTask == null) {
            this.urlStreamTask = this.platformService.openUrlStreamAsync(this.url, false);
          }
          if (0 == this.urlStreamTask.status) {
            return false;
          }
          if (this.urlStreamTask.status != 1) {
            this.state = this.state + 1;
            this.urlStreamTask = null;
            return false;
          }
        }
        if (this.state == 1) {
          if (null == this.socketTask) {
            this.socketTask = this.platformService.openSocketAsync(443, (byte) 124, this.url.getHost());
          }
          if (this.socketTask.status == 0) {
            return false;
          }
          if (1 != this.socketTask.status) {
            this.socketTask = null;
            this.state = this.state + 1;
            return false;
          }
        }
        if (null != this.input) {
          if (this.readerTask == null) {
            this.readerTask = this.platformService.startThreadAsync(5, 0, (Runnable) (this));
          }
          if (pendingStatus == this.readerTask.status) {
            return false;
          }
          if (this.readerTask.status == 1) {
            return false;
          }
          this.finalize();
          this.state = this.state + 1;
          return false;
        }
        try {
          if (this.state == 0) {
            this.input = (DataInputStream) (this.urlStreamTask.result);
          }
          if (1 == this.state) {
            socket = (java.net.Socket) (this.socketTask.result);
            socket.setSoTimeout(10000);
            socketOutput = socket.getOutputStream();
            socketOutput.write(17);
            grabRequest = (CharSequence) ((Object) ("JAGGRAB " + this.url.getFile() + "\n\n"));
            socketOutput.write(nr.encodeSingleByteText(grabRequest, false));
            this.input = new DataInputStream(socket.getInputStream());
          }
          this.response.position = 0;
        } catch (java.io.IOException caughtIoFailure) {
          caughtFailure = caughtIoFailure;
          ioFailure = (IOException) (Object) caughtFailure;
          this.finalize();
          this.state = this.state + 1;
          if (this.readerTask != null) {
            if (pendingStatus == this.readerTask.status) {
              return false;
            }
            if (this.readerTask.status == 1) {
              return false;
            }
            this.finalize();
            this.state = this.state + 1;
            return false;
          }
          this.readerTask = this.platformService.startThreadAsync(5, 0, (Runnable) (this));
          if (pendingStatus == this.readerTask.status) {
            return false;
          }
          if (this.readerTask.status == 1) {
            return false;
          }
          this.finalize();
          this.state = this.state + 1;
          return false;
        }
        if (this.readerTask == null) {
          this.readerTask = this.platformService.startThreadAsync(5, 0, (Runnable) (this));
        }
        if (pendingStatus == this.readerTask.status) {
          return false;
        }
        if (this.readerTask.status != 1) {
          this.finalize();
          this.state = this.state + 1;
        }
        return false;
    }

    public final void run() {
        try {
          int bytesRead = 0;
          Object completionMonitorOrFailure = null;
          Object failureMonitor = null;
          Throwable unusedFailure = null;
          int obfuscationControl = 0;
          Throwable caughtFailure = null;
          obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            while (this.response.payload.length > this.response.position) {
              bytesRead = this.input.read(this.response.payload, this.response.position, -this.response.position + this.response.payload.length);
              if (0 <= bytesRead) {
                this.response.position = this.response.position + bytesRead;
                continue;
              }
              break;
            }
            if (this.response.position == this.response.payload.length) {
              throw BoundedUrlRequest.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.response.payload.length + " " + this.url));
            }
            completionMonitorOrFailure = this;
            synchronized (completionMonitorOrFailure) {
              this.finalize();
              this.state = 3;
            }
            return;
          } catch (java.lang.Exception caughtReadFailure) {
            caughtFailure = caughtReadFailure;
            completionMonitorOrFailure = (Exception) (Object) caughtFailure;
            failureMonitor = this;
            synchronized (failureMonitor) {
              this.finalize();
              this.state = this.state + 1;
            }
            return;
          }
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    final PacketBuffer getResultForState(int requiredState) {
        if (requiredState != this.state) {
          return null;
        }
        return this.response;
    }

    public static void a(byte param0) {
        field_f = null;
        field_k = null;
        if (param0 < 48) {
          return;
        }
        field_e = null;
        field_d = null;
        field_c = null;
        field_g = null;
    }

    BoundedUrlRequest(PlatformTaskService platformService, java.net.URL url, int capacity) {
        try {
          this.platformService = platformService;
          this.url = url;
          this.response = new PacketBuffer(capacity);
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "fa.<init>(" + (platformService != null ? "{...}" : "null") + ',' + (url != null ? "{...}" : "null") + ',' + capacity + ')');
        }
    }

    static {
        field_d = "Name is available";
        field_k = new int[8192];
        field_j = -1;
        field_g = "Escort all allied leaders to the map exit.";
        field_c = "Hide game chat";
        field_e = "Offer unrated rematch";
        field_f = "(Guard)";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
