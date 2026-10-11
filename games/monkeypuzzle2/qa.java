/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qa implements Runnable {
    private gk field_e;
    private java.net.URL field_f;
    static le field_i;
    private DataInputStream field_l;
    private int field_k;
    private ic field_g;
    static pj field_d;
    static String field_b;
    private md field_h;
    private ic field_j;
    static int field_a;
    private ic field_c;

    final static void a(byte param0, gg param1, int param2, int param3) {
        hh.field_u = param1;
        wg.field_h = param2;
        if (param0 != -39) {
          return;
        }
        try {
          rb.field_cb = param3;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "qa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 > 20) {
          field_i = null;
          field_b = null;
          return;
        }
        gg var2 = (gg) null;
        qa.a((byte) -50, (gg) null, 114, 54);
        field_i = null;
        field_b = null;
    }

    final gk a(int param0) {
        if (param0 < 13) {
          field_d = (pj) null;
          if (this.field_k == 3) {
            return this.field_e;
          }
          return null;
        }
        if (this.field_k == 3) {
          return this.field_e;
        }
        return null;
    }

    final synchronized boolean c(int param0) {
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        IOException var3 = null;
        OutputStream var4 = null;
        java.net.Socket var5 = null;
        CharSequence var6 = null;
        if (this.field_k >= 2) {
          return true;
        }
        if (this.field_k == 0) {
          if (this.field_j == null) {
            this.field_j = this.field_h.a((byte) 112, this.field_f);
          }
          if (this.field_j.field_g == 0) {
            return false;
          }
          if (this.field_j.field_g != 1) {
            this.field_k = this.field_k + 1;
            this.field_j = null;
            return false;
          }
        }
        if (1 == this.field_k) {
          if (this.field_g == null) {
            this.field_g = this.field_h.a(this.field_f.getHost(), 0, 443);
          }
          if (this.field_g.field_g == 0) {
            return false;
          }
          if (1 != this.field_g.field_g) {
            this.field_k = this.field_k + 1;
            this.field_g = null;
            return false;
          }
        }
        var2 = -62 / ((-17 - param0) / 60);
        if (null == this.field_l) {
          try {
            if (0 == this.field_k) {
              this.field_l = (DataInputStream) (this.field_j.field_b);
            }
            if (1 == this.field_k) {
              var5 = (java.net.Socket) (this.field_g.field_b);
              var5.setSoTimeout(10000);
              var4 = var5.getOutputStream();
              var4.write(17);
              var6 = (CharSequence) ((Object) ("JAGGRAB " + this.field_f.getFile() + "\n\n"));
              var4.write(pj.a(3231, var6));
              this.field_l = new DataInputStream(var5.getInputStream());
            }
            this.field_e.field_h = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_k = this.field_k + 1;
          }
        }
        if (this.field_c == null) {
          this.field_c = this.field_h.a((Runnable) (this), 5, 0);
        }
        if (this.field_c.field_g == 0) {
          return false;
        }
        if (this.field_c.field_g == 1) {
          return false;
        }
        this.finalize();
        this.field_k = this.field_k + 1;
        return false;
    }

    protected final void finalize() {
        if (null != this.field_j) {
          if (null != this.field_j.field_b) {
            try {
              ((DataInputStream) (this.field_j.field_b)).close();
            } catch (Exception exception) {
            }
          }
          this.field_j = null;
        }
        if (this.field_g != null) {
          if (null != this.field_g.field_b) {
            try {
              ((java.net.Socket) (this.field_g.field_b)).close();
            } catch (Exception exception) {
            }
          }
          this.field_g = null;
        }
        if (null != this.field_l) {
          try {
            this.field_l.close();
          } catch (Exception exception) {
          }
          this.field_l = null;
        }
        this.field_c = null;
    }

    final static int b(int param0) {
        if (param0 < 120) {
          field_a = -111;
          return je.field_c;
        }
        return je.field_c;
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          try {
            while (this.field_e.field_h < this.field_e.field_g.length) {
              var1_int = this.field_l.read(this.field_e.field_g, this.field_e.field_h, -this.field_e.field_h + this.field_e.field_g.length);
              if (var1_int >= 0) {
                this.field_e.field_h = this.field_e.field_h + var1_int;
                continue;
              }
              break;
            }
            if (this.field_e.field_h == this.field_e.field_g.length) {
              throw qa.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_e.field_g.length + " " + this.field_f));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_k = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
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

    qa(md param0, java.net.URL param1, int param2) {
        try {
          this.field_h = param0;
          this.field_f = param1;
          this.field_e = new gk(param2);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "qa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Change display name";
        field_d = new pj();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
