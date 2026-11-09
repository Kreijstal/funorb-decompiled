/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class JaggrabDownloader implements Runnable {
    private PlatformTask field_c;
    private DataInputStream field_h;
    private java.net.URL field_a;
    private PacketBuffer field_d;
    private int field_g;
    private PlatformTask field_f;
    private PlatformTask field_e;
    static int displayDialogY;
    private PlatformTaskDispatcher field_b;
    static PrimitiveType POINTS;

    protected final void finalize() {
        if (this.field_e != null) {
          if (null != this.field_e.result) {
            try {
              ((DataInputStream) (this.field_e.result)).close();
            } catch (Exception exception) {
            }
          }
          this.field_e = null;
        }
        if (this.field_f != null) {
          if (null != this.field_f.result) {
            try {
              ((java.net.Socket) (this.field_f.result)).close();
            } catch (Exception exception) {
            }
          }
          this.field_f = null;
        }
        if (null != this.field_h) {
          try {
            this.field_h.close();
          } catch (Exception exception) {
          }
          this.field_h = null;
        }
        this.field_c = null;
    }

    final synchronized boolean a(byte param0) {
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        IOException var3 = null;
        OutputStream var4 = null;
        java.net.Socket var5 = null;
        CharSequence var6 = null;
        if (this.field_g >= 2) {
          return true;
        }
        var2 = 4 / ((param0 + 41) / 43);
        if (this.field_g == 0) {
          if (this.field_e == null) {
            this.field_e = this.field_b.openUrlStream((byte) 107, this.field_a);
          }
          if (0 == this.field_e.status) {
            return false;
          }
          if (1 != this.field_e.status) {
            this.field_e = null;
            this.field_g = this.field_g + 1;
            return false;
          }
        }
        if (this.field_g == 1) {
          if (this.field_f == null) {
            this.field_f = this.field_b.openDirectSocket((byte) 51, this.field_a.getHost(), 443);
          }
          if (this.field_f.status == 0) {
            return false;
          }
          if (this.field_f.status != 1) {
            this.field_f = null;
            this.field_g = this.field_g + 1;
            return false;
          }
        }
        if (this.field_h != null) {
          if (null == this.field_c) {
            this.field_c = this.field_b.startThread(true, (Runnable) (this), 5);
          }
          if (0 == this.field_c.status) {
            return false;
          }
          if (this.field_c.status == 1) {
            return false;
          }
          this.finalize();
          this.field_g = this.field_g + 1;
          return false;
        }
        try {
          if (0 == this.field_g) {
            this.field_h = (DataInputStream) (this.field_e.result);
          }
          if (this.field_g == 1) {
            var5 = (java.net.Socket) (this.field_f.result);
            var5.setSoTimeout(10000);
            var4 = var5.getOutputStream();
            var4.write(17);
            var6 = (CharSequence) ((Object) ("JAGGRAB " + this.field_a.getFile() + "\n\n"));
            var4.write(GameInstructions.a(var6, (byte) 32));
            this.field_h = new DataInputStream(var5.getInputStream());
          }
          this.field_d.position = 0;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (IOException) (Object) decompiledCaughtException;
          this.finalize();
          this.field_g = this.field_g + 1;
          if (null == this.field_c) {
            this.field_c = this.field_b.startThread(true, (Runnable) (this), 5);
          }
          if (0 == this.field_c.status) {
            return false;
          }
          if (this.field_c.status == 1) {
            return false;
          }
          this.finalize();
          this.field_g = this.field_g + 1;
          return false;
        }
        if (null == this.field_c) {
          this.field_c = this.field_b.startThread(true, (Runnable) (this), 5);
        }
        if (0 == this.field_c.status) {
          return false;
        }
        if (this.field_c.status != 1) {
          this.finalize();
          this.field_g = this.field_g + 1;
        }
        return false;
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = Sumoblitz.field_L ? 1 : 0;
          try {
            while (this.field_d.position < this.field_d.payload.length) {
              var1_int = this.field_h.read(this.field_d.payload, this.field_d.position, -this.field_d.position + this.field_d.payload.length);
              if (var1_int >= 0) {
                this.field_d.position = this.field_d.position + var1_int;
                continue;
              }
              break;
            }
            if (this.field_d.payload.length == this.field_d.position) {
              throw JaggrabDownloader.<RuntimeException>rethrowUnchecked(new Exception("HG1: " + this.field_d.payload.length + " " + this.field_a));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_g = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_g = this.field_g + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final PacketBuffer completedDownload(byte guard) {
        if (3 == this.field_g) {
          return this.field_d;
        }
        if (guard != 126) {
          this.field_a = (java.net.URL) null;
          return null;
        }
        return null;
    }

    JaggrabDownloader(PlatformTaskDispatcher param0, java.net.URL param1, int param2) {
        try {
          this.field_b = param0;
          this.field_a = param1;
          this.field_d = new PacketBuffer(param2);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 < 121) {
          JaggrabDownloader.releaseStatics(82);
          POINTS = null;
          return;
        }
        POINTS = null;
    }

    static {
        POINTS = new PrimitiveType();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException rethrowUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
