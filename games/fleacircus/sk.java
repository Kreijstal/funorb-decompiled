/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sk implements Runnable {
    private DataInputStream field_b;
    private int field_g;
    private java.net.URL field_c;
    private od field_e;
    private ni field_d;
    private ce field_f;
    private od field_h;
    private od field_a;

    final ni a(int param0) {
        if (param0 < 83) {
          return (ni) null;
        }
        if (this.field_g != 3) {
          return null;
        }
        return this.field_d;
    }

    final synchronized boolean c(byte param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_g >= 2) {
          return true;
        }
        if (this.field_g == 0) {
          if (this.field_h == null) {
            this.field_h = this.field_f.a(this.field_c, -34);
          }
          if (this.field_h.field_b == 0) {
            return false;
          }
          if (1 != this.field_h.field_b) {
            this.field_h = null;
            this.field_g = this.field_g + 1;
            return false;
          }
        }
        if (param0 <= 41) {
          this.field_c = (java.net.URL) null;
        }
        if (1 == this.field_g) {
          if (null == this.field_e) {
            this.field_e = this.field_f.a(443, (byte) 32, this.field_c.getHost());
          }
          if (0 == this.field_e.field_b) {
            return false;
          }
          if (this.field_e.field_b != 1) {
            this.field_e = null;
            this.field_g = this.field_g + 1;
            return false;
          }
        }
        if (this.field_b == null) {
          try {
            if (this.field_g == 0) {
              this.field_b = (DataInputStream) (this.field_h.field_e);
            }
            if (1 == this.field_g) {
              var4 = (java.net.Socket) (this.field_e.field_e);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_c.getFile() + "\n\n"));
              var3.write(ea.a(-18428, var5));
              this.field_b = new DataInputStream(var4.getInputStream());
            }
            this.field_d.field_i = 0;
            decompiledRegionSelector0 = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_g = this.field_g + 1;
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
            if (this.field_a == null) {
              this.field_a = this.field_f.a(4532, (Runnable) (this), 5);
            }
            if (this.field_a.field_b == 0) {
              return false;
            }
            if (this.field_a.field_b == 1) {
              return false;
            }
            this.finalize();
            this.field_g = this.field_g + 1;
            return false;
          }
        }
        if (this.field_a == null) {
          this.field_a = this.field_f.a(4532, (Runnable) (this), 5);
        }
        if (this.field_a.field_b == 0) {
          return false;
        }
        if (this.field_a.field_b != 1) {
          this.finalize();
          this.field_g = this.field_g + 1;
        }
        return false;
    }

    final static void a(int param0, String param1) {
        if (param0 != 0) {
          return;
        }
        System.out.println("Error: " + tj.a("%0a", param1, "\n", (byte) -66));
    }

    final static void b(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          var6 = ed.field_c;
          var1 = var6;
          var2 = 0;
          var3 = var6.length;
          if (param0 > -75) {
            var5 = (String) null;
            sk.a(-77, (String) null);
          }
          while (var3 > var2) {
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1_ref), "sk.D(" + param0 + ')');
        }
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = fleas.field_A ? 1 : 0;
          try {
            while (this.field_d.field_i < this.field_d.field_k.length) {
              var1_int = this.field_b.read(this.field_d.field_k, this.field_d.field_i, -this.field_d.field_i + this.field_d.field_k.length);
              if (0 <= var1_int) {
                this.field_d.field_i = this.field_d.field_i + var1_int;
                continue;
              }
              break;
            }
            if (this.field_d.field_i == this.field_d.field_k.length) {
              throw sk.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_d.field_k.length + " " + this.field_c));
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

    final static java.awt.Container a(byte param0) {
        if (cb.field_t != null) {
          return (java.awt.Container) ((Object) cb.field_t);
        }
        if (param0 <= 19) {
          return (java.awt.Container) null;
        }
        return (java.awt.Container) ((Object) rl.a((byte) -117));
    }

    sk(ce param0, java.net.URL param1, int param2) {
        try {
          this.field_f = param0;
          this.field_c = param1;
          this.field_d = new ni(param2);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "sk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, qc param1, int param2, int param3, qc param4, int param5) {
        id.field_c = param5;
        if (param3 != 443) {
          return;
        }
        try {
          ae.field_c = param2;
          ge.field_h = param0;
          qg.field_b = param1;
          ub.field_a = param4;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "sk.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    protected final void finalize() {
        if (null != this.field_h) {
          if (this.field_h.field_e != null) {
            try {
              ((DataInputStream) (this.field_h.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_h = null;
        }
        if (this.field_e != null) {
          if (this.field_e.field_e != null) {
            try {
              ((java.net.Socket) (this.field_e.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_e = null;
        }
        if (null != this.field_b) {
          try {
            this.field_b.close();
          } catch (Exception exception) {
          }
          this.field_b = null;
        }
        this.field_a = null;
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
