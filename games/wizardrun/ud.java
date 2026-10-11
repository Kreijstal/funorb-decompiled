/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ud implements Runnable {
    private jh field_h;
    private int field_g;
    private java.net.URL field_d;
    static sd field_c;
    private DataInputStream field_f;
    private vh field_k;
    private jh field_j;
    private jh field_e;
    static String field_a;
    static va field_b;
    private va field_i;

    final va b(int param0) {
        if (~this.field_g != param0) {
          return null;
        }
        return this.field_i;
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          if (param0 <= 35) {
            ud.a(-40, -128);
          }
          if (ri.field_a < 10) {
            var3_int = 0;
            if (pk.field_o) {
              pk.field_o = false;
              var3_int = 1;
            }
            ug.a(10487, var3_int != 0, dl.a(true), wj.g(17325), sa.field_e);
            return;
          }
          if (!w.a((byte) -117)) {
            ed.d();
            dg.a(320, 240, (byte) -97);
            fc.a((byte) 80, 0, param2, 0);
            return;
          }
          if (ml.field_t != 0) {
            uc.a(false, param2);
            return;
          }
          uk.a((byte) -123, param1, false);
          fc.a((byte) 80, 0, param2, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ud.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 240) {
          java.awt.Canvas var2 = (java.awt.Canvas) null;
          ud.a((byte) -25, true, (java.awt.Canvas) null);
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
          var4 = wizardrun.field_H;
          try {
            while (this.field_i.field_m < this.field_i.field_k.length) {
              var1_int = this.field_f.read(this.field_i.field_k, this.field_i.field_m, this.field_i.field_k.length - this.field_i.field_m);
              if (0 <= var1_int) {
                this.field_i.field_m = this.field_i.field_m + var1_int;
                continue;
              }
              break;
            }
            if (this.field_i.field_m == this.field_i.field_k.length) {
              throw ud.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_i.field_k.length + " " + this.field_d));
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

    final static void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        dc var5 = null;
        sc var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = wizardrun.field_H;
        try {
          var5 = (dc) (v.field_d.b((byte) 111));
          while (var5 != null) {
            de.a(-14149, param0, var5);
            var5 = (dc) (v.field_d.d(8192));
          }
          var3 = 105 % ((param1 + 34) / 40);
          var6 = (sc) (tg.field_c.b((byte) 118));
          while (var6 != null) {
            ld.a(param0, var6, 0);
            var6 = (sc) (tg.field_c.d(8192));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "ud.B(" + param0 + ',' + param1 + ')');
        }
    }

    protected final void finalize() {
        if (this.field_h != null) {
          if (this.field_h.field_e != null) {
            try {
              ((DataInputStream) (this.field_h.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_h = null;
        }
        if (null != this.field_j) {
          if (null != this.field_j.field_e) {
            try {
              ((java.net.Socket) (this.field_j.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_j = null;
        }
        if (null != this.field_f) {
          try {
            this.field_f.close();
          } catch (Exception exception) {
          }
          this.field_f = null;
        }
        this.field_e = null;
    }

    final synchronized boolean c(int param0) {
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
            this.field_h = this.field_k.a(this.field_d, 127);
          }
          if (this.field_h.field_a == 0) {
            return false;
          }
          if (this.field_h.field_a != 1) {
            this.field_h = null;
            this.field_g = this.field_g + 1;
            return false;
          }
        }
        if (1 == this.field_g) {
          if (null == this.field_j) {
            this.field_j = this.field_k.a(this.field_d.getHost(), 443, (byte) -20);
          }
          if (this.field_j.field_a == 0) {
            return false;
          }
          if (this.field_j.field_a != 1) {
            this.field_g = this.field_g + 1;
            this.field_j = null;
            return false;
          }
        }
        if (this.field_f != null) {
          if (this.field_e == null) {
            this.field_e = this.field_k.a((byte) -82, (Runnable) (this), 5);
          }
          if (0 == this.field_e.field_a) {
            return false;
          }
          if (param0 <= 71) {
            ud.a(-20);
          }
          if (this.field_e.field_a == 1) {
            return false;
          }
          this.finalize();
          this.field_g = this.field_g + 1;
          return false;
        }
        try {
          if (this.field_g == 0) {
            this.field_f = (DataInputStream) (this.field_h.field_e);
          }
          if (this.field_g == 1) {
            var4 = (java.net.Socket) (this.field_j.field_e);
            var4.setSoTimeout(10000);
            var3 = var4.getOutputStream();
            var3.write(17);
            var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_d.getFile() + "\n\n"));
            var3.write(wh.a((byte) -111, var5));
            this.field_f = new DataInputStream(var4.getInputStream());
          }
          this.field_i.field_m = 0;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (IOException) (Object) decompiledCaughtException;
          this.finalize();
          this.field_g = this.field_g + 1;
          if (this.field_e == null) {
            this.field_e = this.field_k.a((byte) -82, (Runnable) (this), 5);
          }
          if (0 == this.field_e.field_a) {
            return false;
          }
          if (param0 > 71) {
            if (this.field_e.field_a != 1) {
              this.finalize();
              this.field_g = this.field_g + 1;
            }
            return false;
          }
          ud.a(-20);
          if (this.field_e.field_a != 1) {
            this.finalize();
            this.field_g = this.field_g + 1;
          }
          return false;
        }
        if (this.field_e == null) {
          this.field_e = this.field_k.a((byte) -82, (Runnable) (this), 5);
        }
        if (0 == this.field_e.field_a) {
          return false;
        }
        if (param0 <= 71) {
          ud.a(-20);
        }
        if (this.field_e.field_a != 1) {
          this.finalize();
          this.field_g = this.field_g + 1;
        }
        return false;
    }

    final static void a(o param0, boolean param1) {
        if (param1) {
          return;
        }
        try {
          ph.d(-31782);
          ed.a(param0.field_B, param0.field_x, param0.field_s);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "ud.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ud(vh param0, java.net.URL param1, int param2) {
        try {
          this.field_d = param1;
          this.field_k = param0;
          this.field_i = new va(param2);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = new sd(2);
        field_a = "Return to game";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
