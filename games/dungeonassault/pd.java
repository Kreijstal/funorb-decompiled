/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends rj {
    int field_H;
    private int field_F;
    static od field_J;
    int field_D;
    int field_C;
    int field_z;
    static String field_E;
    static String field_B;
    static ef field_A;
    static String field_G;

    final void a(int param0, int param1) {
        this.field_z = this.field_z + this.field_H * param1;
        if (this.field_C < this.field_z) {
          this.field_z = this.field_C;
        }
        if (param0 != 1) {
          this.a(-97, (byte) 28, -122);
        }
        if (0 > this.field_z) {
          this.field_z = 0;
        }
    }

    public static void c(byte param0) {
        field_B = null;
        field_G = null;
        field_A = null;
        field_E = null;
        if (param0 < 69) {
          return;
        }
        field_J = null;
    }

    final void d(int param0, int param1, int param2) {
        if (0 == this.field_F) {
          return;
        }
        int var4 = this.a(param2, true);
        if (var4 > this.field_C) {
          var4 = this.field_C;
        }
        if (var4 < 0) {
          var4 = 0;
        }
        this.field_z = var4;
        if (param1 != 128) {
          pd.c(57, 88, (byte) -82);
        }
    }

    final void b(int param0, int param1) {
        if (param0 != 4973) {
          pd.c(-62, 37, (byte) -14);
        }
        this.a(param1 >> 5, -18566, param1, param1 >> 4);
    }

    final static boolean c(int param0, int param1, byte param2) {
        int var3;
        boolean stackIn_6_0 = false;
        var3 = -8 / ((param2 - 14) / 43);
        stackIn_6_0 = (vf.field_w - 16 <= param1) && (16 + (vf.field_w + 200) > param1) && (param0 >= -32 + qc.field_w) && (32 + (wi.field_kb + qc.field_w) > param0);
        return stackIn_6_0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        this.field_H = param0 <= 0 ? 1 : param0;
        if (param1 != -18566) {
          this.field_F = 45;
        }
        this.field_D = param3 > 0 ? param3 : 1;
        this.field_C = param2;
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ud.a((java.awt.Component) ((Object) param0), -1);
          gn.a((byte) 127, (java.awt.Component) ((Object) param0));
          if (param1 != -32) {
            field_B = (String) null;
          }
          if (bn.field_j != null) {
            bn.field_j.a(false, (java.awt.Component) ((Object) param0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("pd.R(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          sm.a(param1, 31500, "");
          if (param0 != 5189) {
            pd.c(66, -39, (byte) -110);
          }
          fk.a(param0 ^ 5137, param1);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "pd.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (67 > param2) {
          param2 = 47;
        }
        super.a(param0, param1, param2);
        this.field_F = -20 + param2;
    }

    final void b(int param0, int param1, int param2) {
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        var7 = DungeonAssault.field_K;
        var4 = param0 + this.field_t;
        var5 = this.field_i + param2;
        bp.a(var5, hm.field_q, var4, (byte) 99);
        bp.a(this.field_F + var5 + 10, qf.field_f, var4, (byte) 99);
        for (var6 = 0; var6 < 7; var6++) {
          te.b(var6 + (6 + var4), var5 + 11, this.field_F - 2, kc.field_M);
        }
        for (var6Lifetime1 = 0; var6Lifetime1 < 3; var6Lifetime1++) {
          qe.b(-var6Lifetime1 + var4 + 5, 11 + var5, this.field_F - 2, 0, 192 - var6Lifetime1 * 64);
          qe.b(var6Lifetime1 + (13 + var4), var5 + 11, -2 + this.field_F, 0, (3 - var6Lifetime1) * 64);
        }
        for (var6Lifetime2 = 1; -1 + this.field_F > var6Lifetime2; var6Lifetime2++) {
          qe.a(var4 + 7, var5 + 10 + var6Lifetime2, 5, 0, -(var6Lifetime2 * 80 / this.field_F) + 144);
        }
        bo.field_Kb.h(var4, var5);
        if (param1 != 8187) {
          return;
        }
        ud.field_y.h(var4, this.field_F + var5 + 10);
        if (this.field_F < 2 * qh.field_q.field_v) {
          if (0 == this.field_C) {
            stackIn_19_0 = 0;
          } else {
            stackIn_19_0 = this.field_z * (-23 + this.field_F) / this.field_C;
          }
          var6Lifetime3 = stackIn_19_0;
          gf.e(var4 + 4, var6Lifetime3 + var5 + 5, qh.field_q.field_y + (4 + var4), qh.field_q.field_v / 2 + (var6Lifetime3 + 10) + (var5 + 5));
          bp.a(10 + var5 + var6Lifetime3, ji.field_G, var4 + 4, (byte) 99);
          bp.a(var5 - (-10 - var6Lifetime3) - 23, ji.field_G, 4 + var4, (byte) 99);
          gf.b();
          qh.field_q.c(var4 + 4, var6Lifetime3 + var5 + 10, qh.field_q.field_y, qh.field_q.field_v / 2);
        } else {
          if (this.field_C == 0) {
            stackIn_15_0 = 0;
          } else {
            stackIn_15_0 = this.field_z * (this.field_F - 46) / this.field_C;
          }
          var6Lifetime3 = stackIn_15_0;
          bp.a(var6Lifetime3 + (10 + var5), ji.field_G, 4 + var4, (byte) 99);
          qh.field_q.h(var4 + 4, var6Lifetime3 + 10 + var5);
        }
    }

    pd(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, 19, param3, param2);
        this.field_z = param5;
        this.field_F = param3 - 20;
        this.b(4973, param4);
    }

    final void a(int param0, byte param1, int param2) {
        int var4;
        if (param1 > -59) {
          return;
        }
        if (this.field_F == 0) {
          return;
        }
        var4 = this.a(param0, true);
        if (var4 > this.field_z) {
          this.field_z = this.field_z + this.field_D;
        } else {
          if (var4 < this.field_z) {
            this.field_z = this.field_z - this.field_D;
          }
        }
        if (this.field_C < this.field_z) {
          this.field_z = this.field_C;
        }
        if (this.field_z < 0) {
          this.field_z = 0;
        }
    }

    private final int a(int param0, boolean param1) {
        int var3 = 0;
        if (!param1) {
          this.b(34, -43, 108);
        }
        if (qh.field_q.field_v * 2 > this.field_F) {
          var3 = (param0 - 16) * this.field_C / (-23 + this.field_F);
        } else {
          var3 = this.field_C * (-33 + param0) / (this.field_F - 46);
        }
        return var3;
    }

    static {
        field_J = new od();
        field_G = "Giant Spider";
        field_B = "Sound: ";
    }
}
