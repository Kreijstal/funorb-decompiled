/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BoundedUrlRequest implements Runnable {
    static String field_c;
    static String field_h;
    private SystemTask readerTask;
    private DataInputStream input;
    private SystemTask urlTask;
    private PacketBuffer response;
    private java.net.URL url;
    private SystemTaskService tasks;
    static int field_d;
    private SystemTask socketTask;
    private int stage;

    final static void writePendingRatings(int opcode, int guard) {
        int var3 = EscapeVector.obfuscationControl;
        try {
          if (guard < 44) {
            return;
          }
          RatingQuery var4 = (RatingQuery) (LegacyStyleNode.field_s.first(false));
          while (var4 != null) {
            SpriteLoadTask.writeRatingQuery(var4, true, opcode);
            var4 = (RatingQuery) (LegacyStyleNode.field_s.next((byte) 70));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "ad.A(" + opcode + ',' + guard + ')');
        }
    }

    public static void releaseStatics(int guard) {
        field_c = null;
        field_h = null;
        if (guard != -1) {
          field_d = -109;
        }
    }

    final PacketBuffer completedResponse(int guard) {
        if (this.stage == 3) {
          return this.response;
        }
        if (guard < -12) {
          return null;
        }
        return (PacketBuffer) null;
    }

    public final void run() {
        try {
          Object var1 = null;
          Throwable var3 = null;
          int var4 = EscapeVector.obfuscationControl;
          try {
            while (this.response.payload.length > this.response.position) {
              int var1_int = this.input.read(this.response.payload, this.response.position, -this.response.position + this.response.payload.length);
              if (0 <= var1_int) {
                this.response.position = this.response.position + var1_int;
                continue;
              }
              break;
            }
            if (this.response.payload.length == this.response.position) {
              throw BoundedUrlRequest.<RuntimeException>rethrowUnchecked(new Exception("HG1: " + this.response.payload.length + " " + this.url));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.stage = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            Throwable decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            Object var2 = this;
            synchronized (var2) {
              this.finalize();
              this.stage = this.stage + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        if (null != this.urlTask) {
          if (null != this.urlTask.result) {
            try {
              ((DataInputStream) (this.urlTask.result)).close();
            } catch (Exception exception) {
            }
          }
          this.urlTask = null;
        }
        if (this.socketTask != null) {
          if (this.socketTask.result != null) {
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

    final synchronized boolean pollCompletion(int guard) {
        if (this.stage >= 2) {
          return true;
        }
        if (0 == this.stage) {
          if (null == this.urlTask) {
            this.urlTask = this.tasks.openUrlStream((byte) -12, this.url);
          }
          if (this.urlTask.status == 0) {
            return false;
          }
          if (this.urlTask.status != 1) {
            this.urlTask = null;
            this.stage = this.stage + 1;
            return false;
          }
        }
        if (1 == this.stage) {
          if (this.socketTask == null) {
            this.socketTask = this.tasks.openSocket(443, 4, this.url.getHost());
          }
          if (this.socketTask.status == 0) {
            return false;
          }
          if (1 != this.socketTask.status) {
            this.socketTask = null;
            this.stage = this.stage + 1;
            return false;
          }
        }
        if (null == this.input) {
          try {
            if (this.stage == 0) {
              this.input = (DataInputStream) (this.urlTask.result);
            }
            if (1 == this.stage) {
              java.net.Socket var4 = (java.net.Socket) (this.socketTask.result);
              var4.setSoTimeout(10000);
              OutputStream var3 = var4.getOutputStream();
              var3.write(17);
              CharSequence var5 = (CharSequence) ((Object) ("JAGGRAB " + this.url.getFile() + "\n\n"));
              var3.write(LegacyButton.encodeCp1252((byte) -14, var5));
              this.input = new DataInputStream(var4.getInputStream());
            }
            this.response.position = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            Throwable decompiledCaughtException = decompiledCaughtParameter0;
            IOException var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.stage = this.stage + 1;
            if (this.readerTask != null) {
              if (this.readerTask.status == 0) {
                return false;
              }
              if (1 == this.readerTask.status) {
                if (guard == 17) {
                  return false;
                }
                BoundedUrlRequest.writePendingRatings(49, -88);
                return false;
              }
              this.finalize();
              this.stage = this.stage + 1;
              if (guard == 17) {
                return false;
              }
              BoundedUrlRequest.writePendingRatings(49, -88);
              return false;
            }
            this.readerTask = this.tasks.startThread(true, 5, (Runnable) (this));
            if (this.readerTask.status == 0) {
              return false;
            }
            if (1 == this.readerTask.status) {
              if (guard == 17) {
                return false;
              }
              BoundedUrlRequest.writePendingRatings(49, -88);
              return false;
            }
            this.finalize();
            this.stage = this.stage + 1;
            if (guard == 17) {
              return false;
            }
            BoundedUrlRequest.writePendingRatings(49, -88);
            return false;
          }
        }
        if (this.readerTask == null) {
          this.readerTask = this.tasks.startThread(true, 5, (Runnable) (this));
        }
        if (this.readerTask.status == 0) {
          return false;
        }
        if (1 != this.readerTask.status) {
          this.finalize();
          this.stage = this.stage + 1;
        }
        if (guard != 17) {
          BoundedUrlRequest.writePendingRatings(49, -88);
        }
        return false;
    }

    BoundedUrlRequest(SystemTaskService tasks, java.net.URL url, int capacity) {
        try {
          this.tasks = tasks;
          this.url = url;
          this.response = new PacketBuffer(capacity);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ad.<init>(" + (tasks != null ? "{...}" : "null") + ',' + (url != null ? "{...}" : "null") + ',' + capacity + ')');
        }
    }

    static {
        field_h = "Updates will sent to the email address you've given";
        field_c = "Total score: ";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException rethrowUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
