/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jf {
    static uf field_a;
    static int field_b;
    static go field_c;
    static oa field_d;

    final static void a(int param0, int param1, byte param2, int param3) {
        da var5;
        if (-1 == on.field_v[param1][param3] ||
          !(on.field_v[param1][param3] <= param0)) {
          on.field_v[param1][param3] = param0;
          tn.a(0);
        }
        if (param2 != 62) {
          var5 = (da) null;
          jf.a((short[]) null, -26, (da) null, true);
        }
    }

    final static boolean a(in param0, qm param1, int param2, int param3, in param4, int param5, int param6, qm param7, int param8) {
        int var20_int = 0;
        int var9_int = 0;
        int var10 = 0;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        int var22 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        float var20Lifetime1;
        float var21Lifetime1;
        var22 = HoldTheLine.field_D;
        try {
          var9_int = -param7.field_h + param1.field_h;
          var10 = -param7.field_f + param1.field_f;
          var11 = Math.abs(param0.field_j * param4.field_j + param0.field_g * param4.field_g);
          var12 = Math.abs(-(param0.field_g * param4.field_j) + param0.field_j * param4.field_g);
          var13 = var12;
          var14 = var11;
          var15 = param4.field_j * (float)var9_int + (float)var10 * param4.field_g;
          var16 = (float)var9_int * param4.field_g - (float)var10 * param4.field_j;
          var17 = (float)var10 * param0.field_g + param0.field_j * (float)var9_int;
          var18 = param0.field_g * (float)var9_int - param0.field_j * (float)var10;
          le.field_s[0] = (float)(-param5) + (-(var13 * (float)param6) - var11 * (float)param3 + Math.abs(var15));
          if (param8 != 7527) {
            field_a = (uf) null;
          }
          if (le.field_s[0] > 0.0f) {
            return false;
          }
          le.field_s[1] = -(var14 * (float)param6) - var12 * (float)param3 + Math.abs(var16) - (float)param2;
          if (le.field_s[1] > 0.0f) {
            return false;
          }
          le.field_s[2] = -((float)param2 * var12) - (float)param5 * var11 + Math.abs(var17) - (float)param3;
          if (le.field_s[2] > 0.0f) {
            return false;
          }
          le.field_s[3] = Math.abs(var18) - (var14 * (float)param2 + (float)param5 * var13) - (float)param6;
          if (0.0f < le.field_s[3]) {
            return false;
          }
          ek.field_o = 0;
          var19 = le.field_s[0];
          for (var20_int = 1; var20_int < 4; var20_int++) {
            if (var19 < le.field_s[var20_int]) {
              var19 = le.field_s[var20_int];
              ek.field_o = var20_int * 2;
            }
          }
          kk.field_k = -var19;
          if (ek.field_o == 0) {
            vl.field_c = new in(param4);
            var20 = ln.a(-29407, param0.a(param4, (byte) -10)) * param0.field_j * (float)param3 - ln.a(-29407, param0.a(param4, true)) * param0.field_g * (float)param6;
            var21 = (float)param3 * (ln.a(-29407, param0.a(param4, (byte) -10)) * param0.field_g) + ln.a(-29407, param0.a(param4, true)) * param0.field_j * (float)param6;
            if (var15 > 0.0f) {
              vl.field_c.a(-1.0f, -1);
              var21 = -var21;
              var20 = -var20;
              ek.field_o = ek.field_o + 1;
            }
            mm.field_d = var20 + (float)param1.field_h;
            lk.field_b = (float)param1.field_f + var21;
            return true;
          }
          if (ek.field_o == 2) {
            vl.field_c = param4.a((byte) -74);
            var20Lifetime1 = (float)param3 * (ln.a(-29407, param0.a(param4, true)) * param0.field_j) + (float)param6 * (ln.a(param8 - 36934, param0.a(param4, (byte) -10)) * param0.field_g);
            var21Lifetime1 = (float)param3 * (ln.a(-29407, param0.a(param4, true)) * param0.field_g) - (float)param6 * (ln.a(-29407, param0.a(param4, (byte) -10)) * param0.field_j);
            if (0.0f < var16) {
              vl.field_c.a(-1.0f, -1);
              var21Lifetime1 = -var21Lifetime1;
              ek.field_o = ek.field_o + 1;
              var20Lifetime1 = -var20Lifetime1;
            }
            mm.field_d = (float)param1.field_h + var20Lifetime1;
            lk.field_b = (float)param1.field_f + var21Lifetime1;
          } else {
            if (ek.field_o != 4) {
              vl.field_c = param0.a((byte) -81);
              var20Lifetime1 = ln.a(param8 ^ -28602, param4.a(param0, true)) * param4.field_j * (float)param5 + (float)param2 * (ln.a(-29407, param4.a(param0, (byte) -10)) * param4.field_g);
              var21Lifetime1 = (float)param5 * (ln.a(-29407, param4.a(param0, true)) * param4.field_g) - ln.a(param8 - 36934, param4.a(param0, (byte) -10)) * param4.field_j * (float)param2;
              if (var18 > 0.0f) {
                vl.field_c.a(-1.0f, -1);
                var21Lifetime1 = -var21Lifetime1;
                var20Lifetime1 = -var20Lifetime1;
                ek.field_o = ek.field_o + 1;
              }
              lk.field_b = var21Lifetime1 + (float)param7.field_f;
              mm.field_d = (float)param7.field_h + var20Lifetime1;
            } else {
              vl.field_c = new in(param0);
              var20Lifetime1 = (float)param5 * (ln.a(-29407, param4.a(param0, (byte) -10)) * param4.field_j) - ln.a(-29407, param4.a(param0, true)) * param4.field_g * (float)param2;
              var21Lifetime1 = (float)param5 * (ln.a(-29407, param4.a(param0, (byte) -10)) * param4.field_g) + ln.a(-29407, param4.a(param0, true)) * param4.field_j * (float)param2;
              if (0.0f < var17) {
                vl.field_c.a(-1.0f, param8 - 7528);
                ek.field_o = ek.field_o + 1;
                var20Lifetime1 = -var20Lifetime1;
                var21Lifetime1 = -var21Lifetime1;
              }
              mm.field_d = var20Lifetime1 + (float)param7.field_h;
              lk.field_b = var21Lifetime1 + (float)param7.field_f;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_47_0 = var9;
          stackIn_47_1 = new StringBuilder().append("jf.B(");
          if (param0 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
          if (param1 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          stackIn_56_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param8).append(')').toString());
        }
    }

    abstract void a(java.awt.Component param0, byte param1);

    abstract int a(byte param0);

    final static short[] a(short[] param0, int param1, da param2, boolean param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = HoldTheLine.field_D;
        try {
          var4_int = param2.h(param1, 7);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (short[]) (stackIn_3_0);
          }
          if (param3) {
            field_a = (uf) null;
          }
          if (param0 == null ||
            param0.length != var4_int) {
            param0 = new short[var4_int];
          }
          var5 = param2.h(4, 7);
          var6 = (short)param2.h(16, 7);
          if (0 >= var5) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (short)(var6 + param2.h(var5, 7));
            }
          }
          stackIn_18_0 = (short[]) (param0);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("jf.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_d = null;
        if (param0 != 106) {
          jf.a(-4);
        }
        field_a = null;
        field_c = null;
    }

    final static void a(int param0) {
        int fieldTemp$1 = 0;
        if (param0 != 4) {
          field_c = (go) null;
        }
        if (rc.field_c.length > kn.field_a) {
          fieldTemp$1 = kn.field_a;
          kn.field_a = kn.field_a + 1;
          kf.field_q = rc.field_c[fieldTemp$1];
        } else {
          kf.field_q = null;
        }
    }

    abstract void a(java.awt.Component param0, int param1);

    static {
        field_b = -1;
    }
}
