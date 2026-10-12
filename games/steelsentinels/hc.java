/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends ug {
    static int field_V;
    static nk[] field_bb;
    private String field_U;
    private boolean field_db;
    private int field_Y;
    static String field_cb;
    static volatile int field_G;
    private mi field_Z;
    private int field_ab;
    static int[] field_W;
    static int[] field_X;
    private int field_T;
    static String field_S;
    static int[] field_eb;
    static int[] field_R;

    final String e(int param0) {
        int var2 = this.field_J.field_C ? 1 : 0;
        this.field_J.field_C = this.field_C;
        String var3 = this.field_J.e(param0);
        this.field_J.field_C = var2 != 0 ? true : false;
        return var3;
    }

    final static void a(int param0, int param1) {
        if (param1 != 0) {
          hc.f((byte) -69);
        }
        ma.field_V = param0;
    }

    final static nn a(int param0, pn param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        nn var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        nn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = mn.a(22230, param3, param1, param5, param2, param4);
          var6 = var8;
          if (var8 == null) {
            stackIn_2_0 = null;
            return (nn) (stackIn_2_0);
          }
          var7 = new nn();
          var7.field_d = var8;
          var7.field_d.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, param0, param5, param3);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_4_0 = var7;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("hc.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = this.field_o + param2;
        int var6 = param0 + this.field_z;
        super.a(param0, (byte) -123, param2, param3);
        if (param3 != 0) {
          return;
        }
        if (param1 > -99) {
          hc.a(104, -35);
        }
        int var7 = this.field_db ? -(this.field_ab * 2) - this.field_T + this.field_x : 0;
        this.field_Z.a(this.field_U, var7 + (var5 + this.field_ab), var6 + this.field_ab, -this.field_ab + this.field_T, -(this.field_ab * 2) + this.field_E, this.field_Y, -1, !this.field_db ? 2 : 0, 1, this.field_Z.field_G);
    }

    hc(int param0, int param1, int param2, int param3, lh param4, boolean param5, int param6, int param7, mi param8, int param9, String param10) {
        super(param0, param1, param2, param3, (qk) null, (tn) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.field_Z = param8;
          this.field_T = param6;
          this.field_J = param4;
          this.field_ab = param7;
          stackIn_4_1 = (param5);
          this.field_db = stackIn_4_1;
          this.field_Y = param9;
          this.field_U = param10;
          var12_int = this.field_T - this.field_ab;
          var13 = this.field_Z.a(param10, var12_int, this.field_Z.field_G) + this.field_ab * 2;
          if (param3 < var13) {
            this.a(param0, (byte) -110, param1, param2, var13);
          } else {
            var13 = param3;
          }
          if (this.field_db) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = 2 * this.field_ab + this.field_T;
          }
          var14 = stackIn_10_0;
          this.field_J.a(var14, (byte) -84, this.field_ab + (var13 - param3 >> 1), -(3 * this.field_ab) + (-this.field_T + param2), param3 - 2 * this.field_ab);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("hc.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_eb = null;
        if (param0 < 1) {
          field_V = 37;
        }
        field_cb = null;
        field_S = null;
        field_R = null;
        field_X = null;
        field_bb = null;
        field_W = null;
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        field_cb = "Configuration";
        field_V = 0;
        field_G = -1;
        field_S = "Try changing the following settings:  ";
        field_X = new int[250];
        field_eb = new int[32];
        field_W = new int[32];
        field_R = new int[32];
        for (var0 = 0; var0 < 32; var0++) {
          field_W[var0] = var0 * 771;
          field_eb[var0] = var0 * 197376;
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < 16; var0Lifetime1++) {
          field_W[16 + var0Lifetime1] = vn.a(field_W[16 + var0Lifetime1], var0Lifetime1 * 393216);
          field_eb[16 + var0Lifetime1] = vn.a(field_eb[16 + var0Lifetime1], 6 * var0Lifetime1);
        }
        for (var0Lifetime2 = 0; var0Lifetime2 < 32; var0Lifetime2++) {
          field_X[var0Lifetime2] = 257 * var0Lifetime2;
          field_X[-var0Lifetime2 + 63] = var0Lifetime2 * 257;
          field_X[-(2 * var0Lifetime2) + 249] = 8224 + (-(var0Lifetime2 * 257) + 65536 * (32 - var0Lifetime2));
          field_X[249 + (-(2 * var0Lifetime2) - 1)] = (-var0Lifetime2 + 32) * 65536 + (8224 - var0Lifetime2 * 257);
        }
    }
}
