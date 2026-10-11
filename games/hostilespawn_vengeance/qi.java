/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends vd implements qk {
    private dg field_F;
    private String field_I;
    static bd field_H;
    private int[] field_M;
    static int field_N;
    private int field_E;
    static String field_G;
    private ph[] field_K;
    private vm field_L;
    static int field_J;

    final static pg[] a(int param0, byte param1, int param2, gb param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        pg[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!rl.a(2884, param3, param0, param2)) {
            stackIn_2_0 = null;
            return (pg[]) (stackIn_2_0);
          }
          if (param1 <= 112) {
            qi.a(true, true);
          }
          stackIn_6_0 = he.c(-123);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("qi.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void b(int param0, int param1) {
        ph[] var7 = null;
        ph[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_E < param1) {
          var7 = new ph[param1];
          var3 = var7;
          var4 = new int[param1];
          for (var5 = param0; this.field_E > var5; var5++) {
            var7[var5] = this.field_K[var5];
            var4[var5] = this.field_M[var5];
          }
          this.field_K = var3;
          this.field_E = param1;
          this.field_M = var4;
          return;
        }
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          var6_int = 87 % ((param4 + 63) / 52);
          var7 = 0;
          while (true) {
            if (this.field_E <= var7) {
              return;
            }
            if (this.field_K[var7] != param3) {
              var7++;
              continue;
            }
            break;
          }
          var8 = this.field_M[var7];
          if (var8 == -1) {
            this.field_F.g((byte) 103);
            return;
          }
          g.a((byte) -125, this.field_M[var7]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("qi.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    final ph a(mh param0, String param1, int param2) {
        ph var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ph stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ph(param1, param0);
          var4.field_h = (nn) ((Object) new ke());
          var5 = -2 + this.field_x;
          this.a(this.field_s, 0, 0, 0, this.field_x + 34);
          var4.a(this.field_s - 14, var5, param2 - 30, 7, param2);
          this.a(51448, var4);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("qi.P(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(int param0, byte param1) {
        ga.field_b = param0;
        if (uh.field_l != null) {
          uh.field_l.b((byte) -93, param0);
        }
        if (param1 < -80) {
          if (null != ha.field_w) {
            ha.field_w.a(param0, true);
          }
          return;
        }
        field_J = -51;
        if (null != ha.field_w) {
          ha.field_w.a(param0, true);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 >= 42) {
          super.a(param0, param1, (byte) 80, param3);
          this.field_L.a(this.field_I, param1 - (-this.field_v - 14), this.field_m + param0 + 10, this.field_s - 28, this.field_x, 16777215, -1, 0, 0, this.field_L.field_y);
          return;
        }
        gb var6 = (gb) null;
        qi.a(79, (byte) 30, -49, (gb) null);
        super.a(param0, param1, (byte) 80, param3);
        this.field_L.a(this.field_I, param1 - (-this.field_v - 14), this.field_m + param0 + 10, this.field_s - 28, this.field_x, 16777215, -1, 0, 0, this.field_L.field_y);
    }

    final static jj a(boolean param0, boolean param1) {
        jj var2 = null;
        jj var2Lifetime1;
        if (!param1) {
          var2 = new jj(true);
          var2.field_c = param0 ? true : false;
          return var2;
        }
        field_G = (String) null;
        var2Lifetime1 = new jj(true);
        var2Lifetime1.field_c = param0 ? true : false;
        return var2Lifetime1;
    }

    final void a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = this.field_E;
          this.b(0, 1 + var4_int);
          this.field_K[var4_int] = this.a((mh) (this), param2, 30);
          this.field_M[var4_int] = param1;
          if (param0 == 22770) {
            return;
          }
          qi.j(17);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("qi.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_G = null;
        field_H = null;
        if (param0 <= 48) {
          qi.j(-55);
        }
    }

    qi(dg param0, vm param1, String param2) {
        super(0, 0, 288, 0, (nn) null);
        int var4_int = 0;
        this.field_E = 0;
        try {
          this.field_F = param0;
          this.field_I = param2;
          this.field_L = param1;
          var4_int = null == this.field_I ? 0 : this.field_L.b(this.field_I, 260, this.field_L.field_y);
          this.a(288, 0, 0, 0, 22 + var4_int);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "qi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_N = 0;
        field_J = 0;
    }
}
