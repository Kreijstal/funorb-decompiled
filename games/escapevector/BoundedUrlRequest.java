/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BoundedUrlRequest implements Runnable {
    static String field_c;
    static String field_h;
    private SystemTask field_g;
    private DataInputStream field_b;
    private SystemTask field_e;
    private PacketBuffer field_i;
    private java.net.URL field_j;
    private SystemTaskService field_f;
    static int field_d;
    private SystemTask field_a;
    private int field_k;

    final static void a(int param0, int param1) {
        int var3 = EscapeVector.obfuscationControl;
        try {
          if (param1 < 44) {
            return;
          }
          rl var4 = (rl) (cd.field_s.first(false));
          while (var4 != null) {
            qh.a(var4, true, param0);
            var4 = (rl) (cd.field_s.next((byte) 70));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "ad.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int guard) {
        field_c = null;
        field_h = null;
        if (guard != -1) {
          field_d = -109;
        }
    }

    final PacketBuffer c(int param0) {
        if (this.field_k == 3) {
          return this.field_i;
        }
        if (param0 < -12) {
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
            while (this.field_i.payload.length > this.field_i.position) {
              int var1_int = this.field_b.read(this.field_i.payload, this.field_i.position, -this.field_i.position + this.field_i.payload.length);
              if (0 <= var1_int) {
                this.field_i.position = this.field_i.position + var1_int;
                continue;
              }
              break;
            }
            if (this.field_i.payload.length == this.field_i.position) {
              throw BoundedUrlRequest.<RuntimeException>rethrowUnchecked(new Exception("HG1: " + this.field_i.payload.length + " " + this.field_j));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_k = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            Throwable decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            Object var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_k = this.field_k + 1;
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
        if (null != this.field_e) {
          if (null != this.field_e.field_b) {
            try {
              ((DataInputStream) (this.field_e.field_b)).close();
            } catch (Exception exception) {
            }
          }
          this.field_e = null;
        }
        if (this.field_a != null) {
          if (this.field_a.field_b != null) {
            try {
              ((java.net.Socket) (this.field_a.field_b)).close();
            } catch (Exception exception) {
            }
          }
          this.field_a = null;
        }
        if (null != this.field_b) {
          try {
            this.field_b.close();
          } catch (Exception exception) {
          }
          this.field_b = null;
        }
        this.field_g = null;
    }

    final synchronized boolean a(int param0) {
        if (this.field_k >= 2) {
          return true;
        }
        if (0 == this.field_k) {
          if (null == this.field_e) {
            this.field_e = this.field_f.a((byte) -12, this.field_j);
          }
          if (this.field_e.field_f == 0) {
            return false;
          }
          if (this.field_e.field_f != 1) {
            this.field_e = null;
            this.field_k = this.field_k + 1;
            return false;
          }
        }
        if (1 == this.field_k) {
          if (this.field_a == null) {
            this.field_a = this.field_f.a(443, 4, this.field_j.getHost());
          }
          if (this.field_a.field_f == 0) {
            return false;
          }
          if (1 != this.field_a.field_f) {
            this.field_a = null;
            this.field_k = this.field_k + 1;
            return false;
          }
        }
        if (null == this.field_b) {
          try {
            if (this.field_k == 0) {
              this.field_b = (DataInputStream) (this.field_e.field_b);
            }
            if (1 == this.field_k) {
              java.net.Socket var4 = (java.net.Socket) (this.field_a.field_b);
              var4.setSoTimeout(10000);
              OutputStream var3 = var4.getOutputStream();
              var3.write(17);
              CharSequence var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_j.getFile() + "\n\n"));
              var3.write(dk.a((byte) -14, var5));
              this.field_b = new DataInputStream(var4.getInputStream());
            }
            this.field_i.position = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            Throwable decompiledCaughtException = decompiledCaughtParameter0;
            IOException var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_k = this.field_k + 1;
            if (this.field_g != null) {
              if (this.field_g.field_f == 0) {
                return false;
              }
              if (1 == this.field_g.field_f) {
                if (param0 == 17) {
                  return false;
                }
                BoundedUrlRequest.a(49, -88);
                return false;
              }
              this.finalize();
              this.field_k = this.field_k + 1;
              if (param0 == 17) {
                return false;
              }
              BoundedUrlRequest.a(49, -88);
              return false;
            }
            this.field_g = this.field_f.a(true, 5, (Runnable) (this));
            if (this.field_g.field_f == 0) {
              return false;
            }
            if (1 == this.field_g.field_f) {
              if (param0 == 17) {
                return false;
              }
              BoundedUrlRequest.a(49, -88);
              return false;
            }
            this.finalize();
            this.field_k = this.field_k + 1;
            if (param0 == 17) {
              return false;
            }
            BoundedUrlRequest.a(49, -88);
            return false;
          }
        }
        if (this.field_g == null) {
          this.field_g = this.field_f.a(true, 5, (Runnable) (this));
        }
        if (this.field_g.field_f == 0) {
          return false;
        }
        if (1 != this.field_g.field_f) {
          this.finalize();
          this.field_k = this.field_k + 1;
        }
        if (param0 != 17) {
          BoundedUrlRequest.a(49, -88);
        }
        return false;
    }

    BoundedUrlRequest(SystemTaskService param0, java.net.URL param1, int param2) {
        try {
          this.field_f = param0;
          this.field_j = param1;
          this.field_i = new PacketBuffer(param2);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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
