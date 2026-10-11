/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class gd extends rj {
    cn field_K;
    nn field_M;
    cn field_H;
    int field_C;
    static String field_D;
    static String field_J;
    static qk field_G;
    static cn field_A;
    cn field_z;
    cn field_I;
    int field_L;
    boolean field_F;
    static cn field_E;
    boolean field_B;
    cn field_N;

    private gd(cn param0, cn param1, cn param2, cn param3, cn param4, int param5, int param6, int param7) {
        super(param5, param6, param0.field_y, param0.field_v, param7);
        try {
          this.field_H = param3;
          this.field_K = param0;
          this.field_F = true;
          this.field_I = param2;
          this.field_z = param1;
          this.field_N = param4;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "gd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    void b(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_32_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        cf var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        cf var13Lifetime1;
        cf var13Lifetime2;
        cf var13Lifetime3;
        cf var13Lifetime4;
        cf var13Lifetime5;
        var12 = DungeonAssault.field_K;
        if (!this.field_F) {
          return;
        }
        var4 = param0 + this.field_t;
        var5 = this.field_i + param2;
        if (!this.field_w) {
          this.field_K.h(var4, var5);
          if (param1 == 8187) {
            return;
          }
          var13 = (cf) null;
          gd.a(31, (cf) null);
          return;
        }
        if (this.field_B) {
          stackIn_6_0 = mo.field_a;
        } else {
          stackIn_6_0 = this.field_L;
        }
        var6 = stackIn_6_0;
        var7 = var6 - this.field_C >> 2;
        if (var7 > 64) {
          var7 = 64;
        }
        var8 = var7 - mo.field_a + this.field_L;
        if (this.field_B) {
          this.field_H.h(var4, var5);
          if (this.field_B) {
            var9 = var7;
          } else {
            this.field_K.h(var4, param2 + this.field_i);
            var9 = var8;
            this.field_H.d(var4, var5, 4 * var9);
          }
          var10 = (int)((double)var9 * (2.0 + te.c(mo.field_a, 1, 0.125)));
          if (var10 < 0) {
            var10 = 0;
          }
          this.field_N.b(var4, var5, var10);
          if (param1 == 8187) {
            return;
          }
          var13Lifetime1 = (cf) null;
          gd.a(31, (cf) null);
          return;
        }
        if (0 < var8) {
          this.field_H.h(var4, var5);
          if (this.field_B) {
            var9Lifetime1 = var7;
          } else {
            this.field_K.h(var4, param2 + this.field_i);
            var9Lifetime1 = var8;
            this.field_H.d(var4, var5, 4 * var9Lifetime1);
          }
          var10Lifetime1 = (int)((double)var9Lifetime1 * (2.0 + te.c(mo.field_a, 1, 0.125)));
          if (var10Lifetime1 < 0) {
            var10Lifetime1 = 0;
          }
          this.field_N.b(var4, var5, var10Lifetime1);
          if (param1 == 8187) {
            return;
          }
          var13Lifetime2 = (cf) null;
          gd.a(31, (cf) null);
          return;
        }
        if (this != wi.field_ob) {
          stackIn_32_0 = this.field_p;
        } else {
          stackIn_32_0 = mo.field_a;
        }
        var9Lifetime2 = stackIn_32_0;
        var7Lifetime1 = -this.field_m + var9Lifetime2 >> 2;
        if (var7Lifetime1 > 64) {
          var7Lifetime1 = 64;
        }
        var8Lifetime1 = var7Lifetime1 + (-mo.field_a + this.field_p);
        if (this == wi.field_ob) {
          if (this != wi.field_ob) {
            this.field_K.h(var4, param2 + this.field_i);
            var10Lifetime2 = var8Lifetime1;
            this.field_z.d(var4, var5, 4 * var10Lifetime2);
          } else {
            this.field_z.h(var4, var5);
            var10Lifetime2 = var7Lifetime1;
          }
          var11 = (int)((double)var10Lifetime2 * (te.c(mo.field_a, 1, 0.125) + 2.0));
          if (var11 < 0) {
            var11 = 0;
          }
          this.field_I.b(var4, var5, var11);
          if (param1 == 8187) {
            return;
          }
          var13Lifetime3 = (cf) null;
          gd.a(31, (cf) null);
          return;
        }
        if (0 >= var8Lifetime1) {
          this.field_K.h(var4, var5);
          if (param1 == 8187) {
            return;
          }
          var13Lifetime4 = (cf) null;
          gd.a(31, (cf) null);
          return;
        }
        if (this != wi.field_ob) {
          this.field_K.h(var4, param2 + this.field_i);
          var10Lifetime3 = var8Lifetime1;
          this.field_z.d(var4, var5, 4 * var10Lifetime3);
        } else {
          this.field_z.h(var4, var5);
          var10Lifetime3 = var7Lifetime1;
        }
        var11Lifetime1 = (int)((double)var10Lifetime3 * (te.c(mo.field_a, 1, 0.125) + 2.0));
        if (var11Lifetime1 < 0) {
          var11Lifetime1 = 0;
        }
        this.field_I.b(var4, var5, var11Lifetime1);
        if (param1 == 8187) {
          return;
        }
        var13Lifetime5 = (cf) null;
        gd.a(31, (cf) null);
        return;
    }

    final static o a(int param0, cf param1) {
        fa var2 = null;
        RuntimeException var2_ref = null;
        cf var3 = null;
        o stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 64) {
            var3 = (cf) null;
            gd.a(119, (cf) null);
          }
          var2 = cf.a(100, param1.field_e, param1.field_a);
          stackIn_3_0 = new o(var2, param1.field_a);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("gd.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        g.field_Hb = param0;
        if (fc.a(mn.field_b, (byte) -123)) {
          bf.field_f[mn.field_b].c();
        }
        gd.a(64, mh.field_f);
        te.b();
        co.field_G = new vj(0, param1, 640, 480, 64);
        mn.field_b = param2;
        dc.field_z = param2;
        bd.field_f = 0;
        if (!fc.a(dc.field_z, (byte) -123)) {
          if (dc.field_z != -1) {
            return;
          }
          if (null == ik.field_e) {
            return;
          }
          ik.field_e.f((byte) -127);
          return;
        }
        System.gc();
        bf.field_f[dc.field_z].b(param3);
        if (dc.field_z == 12) {
          m.a(param1 ^ 115, param3);
          return;
        }
    }

    private final void a(boolean param0, cn param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_z = param1;
          this.field_K = param1;
          stackIn_3_1 = !(param0);
          super.a(stackIn_3_1, this.field_K.field_y, this.field_K.field_v);
          if (param0) {
            return;
          }
          this.a(127, (byte) 31, -35);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("gd.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (param0) {
          this.field_F = true;
          throw new RuntimeException("Unsupported");
        }
        throw new RuntimeException("Unsupported");
    }

    final static int a(Random param0, boolean param1) {
        int fieldTemp$1 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_G = (qk) null;
          }
          var2_int = uj.a(param0, 37, h.field_j);
          var3 = wl.field_e[var2_int];
          fieldTemp$1 = h.field_j - 1;
          h.field_j = h.field_j - 1;
          wl.field_e[var2_int] = wl.field_e[fieldTemp$1];
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gd.P(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var5 = DungeonAssault.field_K;
        if (param1 >= -59) {
          this.field_K = (cn) null;
          super.a(param0, (byte) -113, param2);
          if (this.field_B) {
            if (this.field_M == null) {
              this.field_L = mo.field_a;
              this.field_B = false;
              return;
            }
            this.field_M.a((byte) -86, this);
            return;
          }
          if (null == this.field_M) {
            this.field_C = mo.field_a;
            this.field_B = true;
            return;
          }
          this.field_M.a(this, -256);
          return;
        }
        super.a(param0, (byte) -113, param2);
        if (this.field_B) {
          if (this.field_M == null) {
            this.field_L = mo.field_a;
            this.field_B = false;
            return;
          }
          this.field_M.a((byte) -86, this);
          return;
        }
        if (null == this.field_M) {
          this.field_C = mo.field_a;
          this.field_B = true;
          return;
        }
        this.field_M.a(this, -256);
    }

    gd(int param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param3, param4);
        this.field_F = true;
    }

    gd(cn param0, cn param1, cn param2, cn param3, cn param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 0);
    }

    public static void e(int param0) {
        field_A = null;
        field_D = null;
        field_J = null;
        field_E = null;
        if (param0 == 0) {
          field_G = null;
          return;
        }
        gd.a(-53, 48, -37, false);
        field_G = null;
    }

    final void a(cn param0, cn param1, cn param2, cn param3, byte param4, cn param5) {
        this.a(true, param1);
        this.field_H = param0;
        this.field_z = param3;
        this.field_N = param2;
        if (param4 <= 101) {
          return;
        }
        try {
          this.field_I = param5;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "gd.M(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_J = "Connection restored.";
        field_D = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
