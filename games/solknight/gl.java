/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gl {
    private int field_j;
    private int field_b;
    private int field_k;
    private int field_d;
    private int field_c;
    private int field_h;
    private int field_o;
    private ni field_i;
    private int field_e;
    private int field_a;
    private int field_f;
    private int field_p;
    private float field_l;
    static java.util.zip.CRC32 field_g;
    private int field_q;
    private boolean field_m;
    private int field_n;
    static kb field_s;
    private int field_t;
    private int field_r;

    private final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = SolKnight.field_L ? 1 : 0;
        var2 = this.field_h;
        var3 = this.field_o;
        if (!this.b((byte) -91)) {
          this.field_m = false;
        } else {
          if (this.field_f >= var2) {
            if (var2 < this.field_b) {
              var2 = this.field_b;
            }
          } else {
            var2 = this.field_f;
          }
          if (this.field_e >= var3) {
            if (this.field_q > var3) {
              var3 = this.field_q;
            }
          } else {
            var3 = this.field_e;
          }
          if (param0 >= -51) {
            this.a(-106, -107, -71);
          }
          if (0.0f < this.field_l) {
            var4 = (int)(0.5f + (float)var3 * this.field_l);
            if (var4 > var2) {
              var3 = (int)((float)var2 / this.field_l);
            } else {
              if (var2 > var4) {
                var2 = var4;
              }
            }
          }
          if (var2 != ec.field_h) {
            this.field_i.a(false, var2, var3);
          } else {
            if (cf.field_d != var3) {
              this.field_i.a(false, var2, var3);
            }
          }
          if (this.field_h > 0) {
            ib.field_j = (this.field_h - ec.field_h) / 2;
          }
        }
    }

    final void a(int param0) {
        int fieldTemp$0 = 0;
        if (dj.field_k != null) {
          return;
        }
        if (param0 >= ob.field_l) {
          this.field_m = false;
        }
        if (this.field_m) {
          fieldTemp$0 = this.field_r - 1;
          this.field_r = this.field_r - 1;
          if (fieldTemp$0 > 0) {
            return;
          }
          this.field_r = this.field_a;
          if (bi.field_a >= this.field_j) {
            this.b(-110);
          } else {
            this.field_m = false;
          }
          return;
        }
        if (ec.field_h < this.field_h) {
          ib.field_j = (this.field_h - ec.field_h) / 2;
        } else {
          if (this.field_h > 0) {
            ib.field_j = 0;
          }
        }
        if (this.field_c == ec.field_h &&
          cf.field_d == this.field_k) {
          return;
        }
        this.field_i.a(false, this.field_c, this.field_k);
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = ml.a("", -30614, '_', param2);
          if (param1 <= 60) {
            return true;
          }
          var3 = ji.a(21762, param0);
          stackIn_8_0 = (param2.indexOf(param0) != -1) || (param2.indexOf(var3) != -1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("gl.J(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static int a(String param0, int param1, String param2, int param3, int param4, String param5, boolean param6) {
        mb var7 = null;
        RuntimeException var7_ref = null;
        mb var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 140) {
            stackIn_2_0 = 122;
            return stackIn_2_0;
          }
          var7 = new mb(param2);
          var8 = new mb(param5);
          stackIn_4_0 = vb.a(param3, param4, param6, param0, var8, var7, -21760);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("gl.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(boolean param0) {
        this.field_i.a(param0, this.field_p, this.field_t);
    }

    final jg b(boolean param0) {
        this.field_t = cf.field_d;
        this.field_p = ec.field_h;
        this.field_i.a(param0, this.field_n, this.field_d);
        jd.field_p = false;
        jg var2 = g.a(this.field_d, 0, wh.field_c, this.field_n, (byte) -81, 0);
        if (var2 == null) {
          this.a(false);
        }
        return var2;
    }

    final static void a(byte param0) {
        o var1 = null;
        o var2 = null;
        int var3 = 0;
        int var4 = SolKnight.field_L ? 1 : 0;
        try {
          var1 = new o(540, 140);
          cl.a(-104, var1);
          hk.a();
          mi.a();
          ad.field_h = 0;
          ee.g(101);
          var2 = var1.c();
          var3 = 0;
          if (param0 != 28) {
            String var5 = (String) null;
            gl.a((String) null, -104, (String) null);
          }
          while (var3 < 15) {
            var2.d(-2, -2, 16777215);
            mi.d(4, 4, 0, 0, 540, 140);
            var3++;
          }
          tg.field_I.a();
          var1.f(0, 0);
          mf.e(4096);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "gl.H(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != -25195) {
          return;
        }
        this.field_h = param1;
        this.field_o = param0;
    }

    final boolean b(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -91) {
          this.field_n = -40;
        }
        stackIn_6_0 = (bi.field_a >= this.field_j) && (ob.field_l > 0);
        return stackIn_6_0;
    }

    final static int a(int param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 92) {
            field_g = (java.util.zip.CRC32) null;
          }
          stackIn_3_0 = ki.a(-27129, param1, param0, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        if (param0 != 95) {
          return;
        }
        field_s = null;
        field_g = null;
    }

    private gl() throws Throwable {
        throw new Error();
    }

    static {
        field_g = new java.util.zip.CRC32();
        field_s = new kb();
    }
}
