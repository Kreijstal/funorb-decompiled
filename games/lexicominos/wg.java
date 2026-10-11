/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wg implements Runnable {
    static int[] field_j;
    private DataInputStream field_g;
    private wf field_i;
    private ei field_f;
    private int field_d;
    private ei field_h;
    private ab field_a;
    static int field_e;
    private java.net.URL field_c;
    private ei field_b;

    protected final void finalize() {
        if (null != this.field_f) {
          if (this.field_f.field_g != null) {
            try {
              ((DataInputStream) (this.field_f.field_g)).close();
            } catch (Exception exception) {
            }
          }
          this.field_f = null;
        }
        if (null != this.field_h) {
          if (null != this.field_h.field_g) {
            try {
              ((java.net.Socket) (this.field_h.field_g)).close();
            } catch (Exception exception) {
            }
          }
          this.field_h = null;
        }
        if (this.field_g != null) {
          try {
            this.field_g.close();
          } catch (Exception exception) {
          }
          this.field_g = null;
        }
        this.field_b = null;
    }

    final static int b(int param0) {
        if (param0 != 13174) {
          wg.b(57);
          return 1;
        }
        return 1;
    }

    public static void c(int param0) {
        if (param0 <= 115) {
          field_e = -22;
          field_j = null;
          return;
        }
        field_j = null;
    }

    final wf a(byte param0) {
        if (param0 != -65) {
          return (wf) null;
        }
        if (this.field_d == 3) {
          return this.field_i;
        }
        return null;
    }

    final synchronized boolean a(int param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_d >= 2) {
          return true;
        }
        if (0 == this.field_d) {
          if (null == this.field_f) {
            this.field_f = this.field_a.a(-23816, this.field_c);
          }
          if (0 == this.field_f.field_b) {
            return false;
          }
          if (1 != this.field_f.field_b) {
            this.field_d = this.field_d + 1;
            this.field_f = null;
            return false;
          }
        }
        if (param0 < 38) {
          this.field_c = (java.net.URL) null;
        }
        if (this.field_d == 1) {
          if (null == this.field_h) {
            this.field_h = this.field_a.a(443, (byte) 125, this.field_c.getHost());
          }
          if (0 == this.field_h.field_b) {
            return false;
          }
          if (this.field_h.field_b != 1) {
            this.field_d = this.field_d + 1;
            this.field_h = null;
            return false;
          }
        }
        if (null != this.field_g) {
          if (this.field_b == null) {
            this.field_b = this.field_a.a((Runnable) (this), false, 5);
          }
          if (this.field_b.field_b == 0) {
            return false;
          }
          if (this.field_b.field_b == 1) {
            return false;
          }
          this.finalize();
          this.field_d = this.field_d + 1;
          return false;
        }
        try {
          if (this.field_d == 0) {
            this.field_g = (DataInputStream) (this.field_f.field_g);
          }
          if (this.field_d == 1) {
            var4 = (java.net.Socket) (this.field_h.field_g);
            var4.setSoTimeout(10000);
            var3 = var4.getOutputStream();
            var3.write(17);
            var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_c.getFile() + "\n\n"));
            var3.write(cl.a((byte) -98, var5));
            this.field_g = new DataInputStream(var4.getInputStream());
          }
          this.field_i.field_h = 0;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (IOException) (Object) decompiledCaughtException;
          this.finalize();
          this.field_d = this.field_d + 1;
          if (this.field_b == null) {
            this.field_b = this.field_a.a((Runnable) (this), false, 5);
          }
          if (this.field_b.field_b == 0) {
            return false;
          }
          if (this.field_b.field_b == 1) {
            return false;
          }
          this.finalize();
          this.field_d = this.field_d + 1;
          return false;
        }
        if (this.field_b == null) {
          this.field_b = this.field_a.a((Runnable) (this), false, 5);
        }
        if (this.field_b.field_b == 0) {
          return false;
        }
        if (this.field_b.field_b != 1) {
          this.finalize();
          this.field_d = this.field_d + 1;
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
          var4 = Lexicominos.field_L ? 1 : 0;
          try {
            while (this.field_i.field_h < this.field_i.field_j.length) {
              var1_int = this.field_g.read(this.field_i.field_j, this.field_i.field_h, -this.field_i.field_h + this.field_i.field_j.length);
              if (var1_int >= 0) {
                this.field_i.field_h = this.field_i.field_h + var1_int;
                continue;
              }
              break;
            }
            if (this.field_i.field_h == this.field_i.field_j.length) {
              throw wg.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_i.field_j.length + " " + this.field_c));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_d = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_d = this.field_d + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    wg(ab param0, java.net.URL param1, int param2) {
        try {
          this.field_a = param0;
          this.field_c = param1;
          this.field_i = new wf(param2);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "wg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_j = new int[8192];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
