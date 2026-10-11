/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class li implements Runnable {
    private op field_j;
    private op field_b;
    private ec field_g;
    static v field_i;
    private DataInputStream field_e;
    static String field_f;
    private de field_a;
    private java.net.URL field_d;
    private op field_k;
    static v[] field_h;
    private int field_c;

    public static void b(int param0) {
        int var1 = 121 / ((30 - param0) / 34);
        field_i = null;
        field_f = null;
        field_h = null;
    }

    final synchronized boolean a(int param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_c >= 2) {
          return true;
        }
        boolean decompiledFrameRemainder1 = true;
        if (0 == this.field_c) {
          if (null == this.field_b) {
            this.field_b = this.field_g.a(7645, this.field_d);
          }
          if (0 == this.field_b.field_f) {
            return false;
          }
          if (this.field_b.field_f != 1) {
            this.field_b = null;
            decompiledFrameRemainder1 = false;
          }
        }
        if (decompiledFrameRemainder1) {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_c == 1) {
            if (null == this.field_k) {
              this.field_k = this.field_g.a(2, this.field_d.getHost(), 443);
            }
            if (this.field_k.field_f == 0) {
              return false;
            }
            if (this.field_k.field_f != 1) {
              this.field_k = null;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            if (null == this.field_e) {
              try {
                if (this.field_c == 0) {
                  this.field_e = (DataInputStream) (this.field_b.field_d);
                }
                if (this.field_c == 1) {
                  var4 = (java.net.Socket) (this.field_k.field_d);
                  var4.setSoTimeout(10000);
                  var3 = var4.getOutputStream();
                  var3.write(17);
                  var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_d.getFile() + "\n\n"));
                  var3.write(pd.a((byte) 67, var5));
                  this.field_e = new DataInputStream(var4.getInputStream());
                }
                this.field_a.field_j = 0;
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = (IOException) (Object) decompiledCaughtException;
                this.finalize();
                this.field_c = this.field_c + 1;
              }
            }
            if (param0 <= 53) {
              this.field_g = (ec) null;
            }
            if (null == this.field_j) {
              this.field_j = this.field_g.a(5, (Runnable) (this), true);
            }
            if (this.field_j.field_f == 0) {
              return false;
            }
            if (this.field_j.field_f == 1) {
              return false;
            }
            this.finalize();
          }
        }
        this.field_c = this.field_c + 1;
        return false;
    }

    final static void a(int param0, wk param1) {
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ZombieDawn.field_J;
        try {
          if (sh.field_e == 1 &&
            og.field_A) {
            var2_int = param1.a(ne.field_c.a(true), (byte) -92);
            var3 = param1.a(ne.field_c.f(param0 ^ -237220996), 0);
            var4 = fb.a(1311979239, (int)(3L * tp.field_p << 5)) >> 15;
            stackIn_7_0 = -8;
            if (var4 < 0) {
              stackIn_8_1 = var2_int;
            } else {
              stackIn_8_1 = var2_int - var4;
            }
            var5 = stackIn_7_0 + stackIn_8_1;
            if (var4 >= 0) {
              stackIn_11_0 = var2_int;
            } else {
              stackIn_11_0 = -var4 + var2_int;
            }
            var6 = stackIn_11_0 + 8;
            bi.a(var5, -1 + var3, -var5 + var6, 3, 0, 128);
            for (var7 = 0; var7 < 100; var7++) {
              if (0 < pl.field_t[var7].field_H) {
                var8 = param1.a(pl.field_t[var7].a(true), (byte) -108) + 4;
                var9 = 4 + param1.a(pl.field_t[var7].f(237239984), 0);
                bi.a(var8, var9, 0);
              }
            }
          }
          if (param0 == -18996) {
            return;
          }
          field_h = (v[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("li.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
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
          var4 = ZombieDawn.field_J;
          try {
            while (this.field_a.field_j < this.field_a.field_h.length) {
              var1_int = this.field_e.read(this.field_a.field_h, this.field_a.field_j, -this.field_a.field_j + this.field_a.field_h.length);
              if (var1_int >= 0) {
                this.field_a.field_j = this.field_a.field_j + var1_int;
                continue;
              }
              break;
            }
            if (this.field_a.field_j == this.field_a.field_h.length) {
              throw li.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_a.field_h.length + " " + this.field_d));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_c = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_c = this.field_c + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        bi.a(vh.field_b, id.field_M + 84, 640, 335, 0, 128);
        hk.field_H.b(vh.field_b, id.field_M + 84);
        if (param0) {
          field_h = (v[]) null;
        }
    }

    li(ec param0, java.net.URL param1, int param2) {
        try {
          this.field_d = param1;
          this.field_g = param0;
          this.field_a = new de(param2);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final de a(byte param0) {
        if (param0 != -118) {
          return (de) null;
        }
        if (this.field_c == 3) {
          return this.field_a;
        }
        return null;
    }

    protected final void finalize() {
        if (this.field_b != null) {
          if (null != this.field_b.field_d) {
            try {
              ((DataInputStream) (this.field_b.field_d)).close();
            } catch (Exception exception) {
            }
          }
          this.field_b = null;
        }
        if (null != this.field_k) {
          if (this.field_k.field_d != null) {
            try {
              ((java.net.Socket) (this.field_k.field_d)).close();
            } catch (Exception exception) {
            }
          }
          this.field_k = null;
        }
        if (null != this.field_e) {
          try {
            this.field_e.close();
          } catch (Exception exception) {
          }
          this.field_e = null;
        }
        this.field_j = null;
    }

    static {
        field_f = "<%0>/<%1>";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
