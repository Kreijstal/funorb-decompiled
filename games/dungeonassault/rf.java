/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rf extends ii {
    private ji field_R;
    static String field_L;
    static fm field_K;
    boolean field_T;
    static int field_M;
    static cn field_Q;
    static ob field_O;
    static byte[][] field_P;
    private int field_U;
    static boolean field_S;
    static String[] field_N;

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_U == 0) {
          return;
        }
        if (this.field_U >= 256) {
          if (param0 != 0) {
            return;
          }
          this.a(param3 + this.field_v, param1 + this.field_q, false);
          super.a(param0, param1, param2 ^ 0, param3);
          return;
        }
        if (np.field_F == null ||
          !(this.field_x <= np.field_F.field_y) ||
          !(np.field_F.field_v >= this.field_s)) {
          np.field_F = new cn(this.field_x, this.field_s);
        }
        lm.a(np.field_F, (byte) -102);
        gf.a();
        this.a(0, 0, false);
        super.a(param0, -param1 - this.field_q, param2, -this.field_v - param3);
        ti.c(true);
        np.field_F.d(param1 + this.field_q, param3 + this.field_v, this.field_U);
    }

    final void b(int param0, int param1, int param2) {
        int var4 = -125 % ((param0 - 70) / 48);
        this.b(0, param2, -param1 + vf.field_x >> 1, -param2 + hn.field_t >> 1, param1);
    }

    final static q[] a(int param0, byte param1, nh param2, int param3) {
        RuntimeException var4 = null;
        q[] stackIn_5_0 = null;
        q[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!kk.a(param2, 1, param3, param0)) {
            return null;
          }
          if (param1 == -71) {
            stackIn_7_0 = vl.d(-89);
            return stackIn_7_0;
          }
          stackIn_5_0 = (q[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("rf.HA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    rf(ji param0, int param1, int param2) {
        super(hn.field_t - param1 >> 1, -param2 + vf.field_x >> 1, param1, param2, (ca) null);
        try {
          this.field_R = param0;
          this.field_U = 0;
          this.field_T = false;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "rf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static q a(int param0) {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        int var2Lifetime1;
        if (param0 != 10) {
          return (q) null;
        }
        q var4 = new q(14, 11, 2);
        q var1 = var4;
        var4.field_i[1] = 65793;
        for (var2 = 0; var2 < 6; var2++) {
          og.a(var2 * 2 + 1, (byte) -75, 10 - var2, var1, 5 - var2, (byte) 1);
        }
        for (var2Lifetime1 = 6; var2Lifetime1 < 11; var2Lifetime1++) {
          og.a(3, (byte) -78, -var2Lifetime1 + 10, var1, 4, (byte) 1);
        }
        return var1;
    }

    public static void b(boolean param0) {
        field_P = (byte[][]) null;
        field_N = null;
        field_O = null;
        field_L = null;
        field_Q = null;
        field_K = null;
        if (param0) {
          field_K = (fm) null;
        }
    }

    boolean f(byte param0) {
        int var2;
        int var3;
        boolean stackIn_13_0 = false;
        var2 = this.j(78);
        if (param0 != -90) {
          this.field_R = (ji) null;
        }
        var3 = -this.field_U + var2;
        if (var3 > 0) {
          this.field_U = this.field_U + (8 + var3 - 1) / 8;
        }
        if (var3 < 0) {
          this.field_U = this.field_U + (-15 + var3) / 16;
        }
        stackIn_13_0 = (0 == this.field_U) && (var2 == 0) && (!this.field_T);
        return stackIn_13_0;
    }

    private final int j(int param0) {
        if (param0 < 61) {
          nh var3 = (nh) null;
          rf.a(0, (byte) 10, (nh) null, -24);
        }
        return this.field_T ? this.field_R.i(32) != this ? 0 : 256 : 0;
    }

    boolean i(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 462) {
          rf.a(-12);
        }
        this.field_U = this.j(98);
        stackIn_6_0 = (this.field_U == 0) && (!this.field_T);
        return stackIn_6_0;
    }

    abstract void a(int param0, int param1, boolean param2);

    final lm g(int param0) {
        lm var2 = super.g(param0 ^ 0);
        if (var2 != null) {
          return var2;
        }
        if (param0 != -20311) {
          this.f((byte) 104);
        }
        return (lm) (this);
    }

    static {
        field_L = "Waiting for fonts";
        field_M = 2;
        field_N = new String[]{"Intimidate", "The frenzied, violent babbling of the <%0> does not make it easy for your raiders to sneak around a dungeon, but any monster they do encounter will have their <%attack> reduced by fear."};
    }
}
