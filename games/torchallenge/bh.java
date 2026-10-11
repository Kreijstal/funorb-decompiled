/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends ma {
    static kh field_o;
    private dj field_s;
    static int field_t;
    static boolean field_p;
    static boolean field_r;
    static String[] field_m;
    private dj field_n;
    static lj field_q;

    final rj a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        rj stackIn_3_0 = null;
        rj stackIn_6_0 = null;
        rj stackIn_9_0 = null;
        rj stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_s.field_v.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_3_0 = lk.field_c;
            return stackIn_3_0;
          }
          if (!mh.a(var3, true, var4)) {
            stackIn_6_0 = lk.field_c;
            return stackIn_6_0;
          }
          if (param0 != 24) {
            stackIn_9_0 = (rj) null;
            return stackIn_9_0;
          }
          if (!this.a(param0 - 25, param1)) {
            return tf.field_w;
          }
          stackIn_13_0 = lk.field_c;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("bh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_q = null;
        if (param0 != 1) {
          field_p = true;
        }
        field_o = null;
        field_m = null;
    }

    final static void a(int param0, int param1, int param2, int param3, ka[] param4, int param5, int param6, ka[] param7, int param8, int param9, int param10, int param11, int param12, int param13, eg param14, int param15, int param16, int param17, ka[] param18, int param19, eg param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          ee.a(param10, param19, new h(param18), param2, param3, param0, 0, param1, param13, param11, param12, param17, param14, param5, param20, param6, param9, new h(param4), param8, new h(param7), param15);
          var21_int = -19 / ((-15 - param16) / 38);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_4_0 = var21;
          stackIn_4_1 = new StringBuilder().append("bh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param19).append(',');
          if (param20 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    bh(dj param0, dj param1, dj param2) {
        super(param0);
        try {
          this.field_n = param2;
          this.field_s = param1;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_n.field_v.toLowerCase();
          var4 = param1.toLowerCase();
          if (~var3.length() < param0) {
            if (var4.length() <= 0) {
              return false;
            }
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0 &&
              -1 + var3.length() > var5) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(1 + var5);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (0 <= var4.indexOf(var7)) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("bh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void d(byte param0) {
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 >= -123) {
            bh.f(-13);
          }
          var1_int = 0;
          var2 = 0;
          var3 = 0;
          var4 = 0;
          var5 = 0;
          var6 = 0;
          var7 = 0;
          for (var10 = 0; var10 < -1 + rd.field_p[rf.field_ib]; var10++) {
            var6 = var1_int;
            var1_int = var1_int + fa.field_m[rf.field_ib][var10];
            var7 = var1_int;
            if (var1_int <= nd.field_e) {
              continue;
            }
            wj.field_e = var10;
            break;
          }
          var5Lifetime1 = qk.field_nb[rf.field_ib][wj.field_e + 1][1];
          var9 = -var6 + var7;
          var3Lifetime1 = qk.field_nb[rf.field_ib][wj.field_e + 1][0];
          var4Lifetime1 = qk.field_nb[rf.field_ib][wj.field_e][1];
          var8 = nd.field_e - var6;
          var2Lifetime1 = qk.field_nb[rf.field_ib][wj.field_e][0];
          if (var9 != 0) {
            cg.field_e[1] = (var4Lifetime1 << 4) + ((var5Lifetime1 - var4Lifetime1) * var8 << 4) / var9;
            cg.field_e[0] = (var2Lifetime1 << 4) + ((-var2Lifetime1 + var3Lifetime1) * var8 << 4) / var9;
          } else {
            cg.field_e[0] = var2Lifetime1 << 4;
            cg.field_e[1] = var4Lifetime1 << 4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "bh.B(" + param0 + ')');
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_s.field_v.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            return null;
          }
          var5 = var4;
          if (gi.a((byte) 89, var5)) {
            stackIn_6_0 = oh.field_c;
            return stackIn_6_0;
          }
          if (li.a((byte) -82, var5)) {
            stackIn_10_0 = rd.field_j;
            return stackIn_10_0;
          }
          if (param1 != -24) {
            stackIn_13_0 = (String) null;
            return stackIn_13_0;
          }
          if (qf.a(-8503, var5)) {
            stackIn_17_0 = ah.field_c;
            return stackIn_17_0;
          }
          if (this.a(-1, param0)) {
            stackIn_21_0 = pd.field_a;
            return stackIn_21_0;
          }
          if (var6.length() <= 0) {
            stackIn_35_0 = ol.field_i;
            return stackIn_35_0;
          }
          if (kc.a(var6, (byte) 59, var5)) {
            stackIn_25_0 = wc.field_f;
            return stackIn_25_0;
          }
          if (bc.a((byte) -127, var5, var6)) {
            stackIn_28_0 = k.field_k;
            return stackIn_28_0;
          }
          if (!ja.a(var5, 94, var6)) {
            stackIn_33_0 = oh.field_c;
            return stackIn_33_0;
          }
          stackIn_31_0 = wc.field_f;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("bh.C(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_r = true;
        field_p = false;
    }
}
