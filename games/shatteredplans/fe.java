/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends vd {
    private String field_F;
    static int[] field_v;
    static nd[] field_C;
    static int[] field_x;
    static String field_z;
    static int[] field_u;
    private int field_G;
    private bi field_D;
    static nd[] field_y;
    static nd[] field_H;
    private int field_K;
    static String field_E;
    static int field_B;
    static int field_A;
    static qr field_w;
    static int field_J;

    public static void g(int param0) {
        field_w = null;
        field_v = null;
        field_C = null;
        field_E = null;
        field_x = null;
        if (param0 != 128) {
          return;
        }
        field_z = null;
        field_H = null;
        field_u = null;
        field_y = null;
    }

    final void a(int param0) {
        if (!this.field_s) {
          return;
        }
        if (this.field_K != -1) {
          gf.d(this.field_k, this.field_t, this.field_m, this.field_i, this.field_K);
        }
        if (null != this.field_D) {
          this.field_D.f((this.field_m - this.field_D.field_z) / 2 + this.field_k, (-this.field_D.field_w + this.field_i) / 2 + this.field_t);
        }
        int var2 = -72 % ((67 - param0) / 47);
        if (null != this.field_F) {
          rs.field_Cb.c(this.field_F, this.field_m / 2 + this.field_k + 1, (rs.field_Cb.field_J + rs.field_Cb.field_q) / 4 + this.field_t + this.field_i / 2, this.field_G, -1);
        }
    }

    final static void f(int param0) {
        mg.field_C = false;
        el.field_b = false;
        qj.a((byte) -127, param0);
        ee.field_l = oj.field_Fb;
        fj.field_s = oj.field_Fb;
    }

    final void a(byte param0, int param1, String param2) {
        try {
          this.field_G = param1;
          this.field_F = param2;
          int var4_int = -8 / ((52 - param0) / 41);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "fe.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, byte[] param1, byte[] param2, int param3, int[] param4, String[] param5, int param6, bc param7, bc param8, String[][] param9, bc param10, bi[][] param11, String[] param12, bi[][] param13, String[][] param14, nk[] param15, int param16, int[] param17, String[] param18, int param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          m.a((byte) -52, param17, param10, param15, param8);
          bq.a(27770, param8);
          if (param16 > -113) {
            fe.g(125);
          }
          tb.a(param6, param4, param9, param14, param8, param18, param12, param11, param19, param13, param3, param5, param1, -7966, param2);
          ak.a(param7, (byte) -81, param0, param8);
          ir.l(1062);
          in.a((byte) -83);
          te.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("fe.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param8 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param9 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param10 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param11 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param12 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param13 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param14 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param15 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param18 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param19).append(')').toString());
        }
    }

    fe(int param0, int param1, int param2, int param3, int param4, bi param5, String param6, int param7) {
        super(param0, param1, param2, param3);
        try {
          this.field_G = param7;
          this.field_K = param4;
          this.field_F = param6;
          this.field_D = param5;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "fe.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    static {
        int var0_int = 0;
        int var4 = 0;
        int var0_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        field_z = "Watch Introduction";
        field_E = "Please send me news and updates (I can unsubscribe at any time)";
        field_x = new int[256];
        field_u = new int[256];
        field_v = new int[7];
        for (var0_int = 0; var0_int < 256; var0_int++) {
          field_u[var0_int] = 65793 * var0_int;
          field_x[var0_int] = ee.a(ee.a(var0_int >> 1 << 8, var0_int), var0_int >> 2 << 16);
        }
        int var5 = 0;
        var0_intLifetime1 = var5;
        while (var5 < 3) {
          field_v[var5] = 4210752 * (1 + var5);
          field_v[6 - var5] = 4210752 + var5 * 4210752;
          var5++;
        }
        field_v[3] = 16777215;
        int[] var0 = new int[]{256, 251, 245, 239, 219, 215, 161, 157, 154, 150, 146, 144, 316, 306, 612, 604, 599, 774, 777};
        int[] var1 = new int[]{199, 209, 223, 235, 214, 227, 289, 302, 313, 327, 338, 351, 247, 267, 180, 209, 240, 235, 258};
        int[] var2 = new int[]{327, 239, 128, 326, 639, 717, 529, 507, 132, 195, 772, 777, 211, 319, 84, 202, 717, 303, 235, 193};
        int[] var3 = new int[]{395, 478, 553, 617, 475, 615, 611, 384, 552, 628, 492, 403, 401, 348, 627, 393, 615, 509, 500, 545};
        field_y = new nd[12];
        for (var4 = 0; 12 > var4; var4++) {
          field_y[var4] = new nd(var0[var4], var1[var4], 80);
        }
        field_H = new nd[7];
        for (var4Lifetime1 = 0; var4Lifetime1 < 7; var4Lifetime1++) {
          field_H[var4Lifetime1] = new nd(var0[var4Lifetime1 + 12], var1[var4Lifetime1 + 12], 144);
        }
        field_C = new nd[var2.length];
        for (var4Lifetime2 = 0; var4Lifetime2 < var2.length; var4Lifetime2++) {
          field_C[var4Lifetime2] = new nd(var2[var4Lifetime2], var3[var4Lifetime2], 240);
        }
        field_J = 0;
    }
}
