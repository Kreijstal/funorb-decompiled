/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends ii implements vg {
    private ck field_T;
    static boolean field_O;
    static int[] field_S;
    static int field_X;
    static String field_N;
    static nh field_U;
    static cn field_R;
    static nh field_W;
    private ck field_Z;
    static tk field_K;
    static String field_Y;
    static cn field_Q;
    static int field_M;
    static int[] field_P;
    private ck field_V;

    public ia() {
        super(0, 0, 476, 225, (ca) null);
        this.field_V = new ck(qp.field_c, (pg) null);
        this.field_Z = new ck(pp.field_I, (pg) null);
        this.field_T = new ck(kd.field_b, (pg) null);
        na var1 = new na();
        this.field_V.field_o = (ca) ((Object) var1);
        this.field_Z.field_o = (ca) ((Object) var1);
        this.field_T.field_o = (ca) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        this.field_Z.b(0, var4, -var2 + (-48 + this.field_s), -var3 + this.field_x >> 1, 30);
        this.field_T.b(0, var4, -48 + (this.field_s - var2), (this.field_x - var3 >> 1) - (-var4 - var2), 30);
        this.field_V.b(0, var3, this.field_s - 78 - 2 * var2, this.field_x - var3 >> 1, 30);
        this.field_Z.field_n = (pg) (this);
        this.field_V.field_n = (pg) (this);
        this.field_T.field_n = (pg) (this);
        this.field_V.field_i = hj.field_U;
        this.field_T.field_i = oh.field_n;
        this.b((byte) -69, this.field_Z);
        this.b((byte) -75, this.field_V);
        this.b((byte) -120, this.field_T);
    }

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        lm var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DungeonAssault.field_K;
        try {
          if (param1 != 98) {
            var8 = (lm) null;
            this.a((lm) null, 'ﾀ', -77, (byte) 92);
          }
          if (this.field_Z == param0) {
            rc.b(112);
            return;
          }
          if (this.field_V == param0) {
            nh.c(true);
            return;
          }
          if (param0 != this.field_T) {
            return;
          }
          kd.a(param1 ^ 102);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("ia.FA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param1 + this.field_q;
        int var6 = param3 + this.field_v;
        lp.field_C.a(he.field_q, var5 + 20, 20 + var6, this.field_x - 40, this.field_s - 50, 16777215, -1, 1, 0, lp.field_C.field_H);
        super.a(param0, param1, param2, param3);
    }

    final static cn a(String param0, int param1, String param2, int param3, int param4, String param5, nh param6) {
        int var9 = 0;
        byte[] var7 = null;
        RuntimeException var7_ref = null;
        cn var8 = null;
        int var10 = 0;
        byte[] var11 = null;
        cn stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = DungeonAssault.field_K;
        try {
          if (param3 != 2316) {
            field_M = -95;
          }
          var11 = pi.a(param2, param3 - 2316, param5, param0, param4, param1, param6);
          var7 = var11;
          if (var11 == null) {
            return null;
          }
          var8 = new cn(var11, (java.awt.Component) ((Object) fi.d(false)));
          for (var9 = 0; var8.field_B.length > var9; var9++) {
            var8.field_B[var9] = nb.a(var8.field_B[var9], 16777215);
          }
          stackIn_10_0 = var8;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_13_0 = var7_ref;
          stackIn_13_1 = new StringBuilder().append("ia.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param6 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_Y = null;
        field_W = null;
        if (param0) {
          field_K = null;
          field_N = null;
          field_S = null;
          field_U = null;
          field_Q = null;
          field_P = null;
          field_R = null;
          return;
        }
        field_O = true;
        field_K = null;
        field_N = null;
        field_S = null;
        field_U = null;
        field_Q = null;
        field_P = null;
        field_R = null;
    }

    final static String a(int param0, se param1, String param2, int param3) {
        String var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          if (param0 >= param1.b(param2)) {
            stackIn_3_0 = (String) (param2);
            return stackIn_3_0;
          }
          if (param3 != 0) {
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          var4 = "...";
          do {
            param2 = param2.substring(0, -1 + param2.length());
          } while (param0 < param1.b(param2 + var4));
          stackIn_10_0 = param2 + var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("ia.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, (byte) 126)) {
            return true;
          }
          if (98 == param2) {
            stackIn_6_0 = this.a(param0, (byte) 71);
            return stackIn_6_0;
          }
          if (param3 < 55) {
            field_U = (nh) null;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_11_0 = this.a((byte) -5, param0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ia.W(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_S = new int[4];
        field_Y = "RAID";
        field_O = false;
        field_N = "The <%0> lets loose his first attack with ferocious rage!";
        field_M = 0;
        field_X = 0;
        field_P = wa.b(-1);
        int[] var1 = field_P;
        var1[0] = mp.a(var1[0], 131072);
        int[] var2 = field_P;
        var2[1] = mp.a(var2[1], 8);
    }
}
