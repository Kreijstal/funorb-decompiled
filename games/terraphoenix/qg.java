/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static int field_a;

    final static byte[] a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        dh var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] stackIn_19_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        try {
          var9 = new dh(param1);
          var3 = var9.a(-16384);
          var4 = var9.f((byte) -107);
          if (0 <= var4 && (eg.field_h == 0 ||
            !(var4 > eg.field_h))) {
            if (~var3 == param0) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.a(var4, 0, 93, var13);
              stackIn_21_0 = var5;
              return stackIn_21_0;
            }
            var5_int = var9.f((byte) -107);
            if (var5_int >= 0 && (eg.field_h == 0 ||
              !(eg.field_h < var5_int))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (var3 != 1) {
                var7 = wj.field_c;
                synchronized (var7) {
                  wj.field_c.a(var9, 10, var12);
                }
              } else {
                ih.a(var12, var5_int, param1, var4, 9);
              }
              stackIn_19_0 = var6;
              return stackIn_19_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("qg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[][] fieldTemp$4 = null;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var2 = 0;
        int dupTemp$8 = 0;
        byte[][] arrayValue$9 = null;
        byte[] var2_ref_byte__;
        byte[] var3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (param1 == 100 &&
          0 < nl.field_b) {
          fieldTemp$4 = il.field_b;
          fieldTemp$5 = nl.field_b - 1;
          nl.field_b = nl.field_b - 1;
          var2_ref_byte__ = fieldTemp$4[fieldTemp$5];
          il.field_b[nl.field_b] = null;
          return var2_ref_byte__;
        }
        if (param1 == 5000 &&
          mg.field_o > 0) {
          fieldTemp$6 = mg.field_o - 1;
          mg.field_o = mg.field_o - 1;
          var2_ref_byte__Lifetime1 = na.field_Z[fieldTemp$6];
          na.field_Z[mg.field_o] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param1 == 30000 &&
          g.field_cb > 0) {
          fieldTemp$7 = g.field_cb - 1;
          g.field_cb = g.field_cb - 1;
          var2_ref_byte__Lifetime2 = dg.field_e[fieldTemp$7];
          dg.field_e[g.field_cb] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (null != ol.field_Kb) {
          for (var2 = 0; tc.field_c.length > var2; var2++) {
            if (param1 == tc.field_c[var2] &&
              ba.field_g[var2] > 0) {
              dupTemp$8 = ba.field_g[var2] - 1;
              arrayValue$9 = ol.field_Kb[var2];
              ba.field_g[var2] = dupTemp$8;
              var3 = arrayValue$9[dupTemp$8];
              ol.field_Kb[var2][ba.field_g[var2]] = null;
              return var3;
            }
          }
        }
        if (param0 <= 19) {
          field_a = -93;
        }
        return new byte[param1];
    }

    final static ud a(byte param0, fa param1, String param2, fa param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ud stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param3.c(-1, param2);
          if (param0 != 94) {
            qg.a(83, -23);
          }
          var6 = param3.a(-128, var5_int, param4);
          stackIn_3_0 = wl.a(param1, var5_int, param3, var6, -121);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("qg.D(").append(param0).append(',');
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(ci param0, int param1, byte param2, int param3, int param4, int param5) {
        int var17 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int var19 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var15Lifetime1;
        int var18Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        int var15Lifetime4;
        var19 = Terraphoenix.field_V;
        try {
          param5 = param5 + param4;
          param1 = param1 + param0.field_p;
          param4 = param4 - (-15 + param0.field_u);
          param4 = param4 + param0.field_v;
          var6_int = param1 + l.field_k * param4;
          var7 = 0;
          var8 = param1;
          var9 = param4;
          var10 = param0.field_t;
          var11 = param0.field_r;
          var12 = -var11 + l.field_k;
          if (param4 < l.field_d) {
            var14 = l.field_d - param4;
            var10 = var10 - var14;
            var7 = var7 + var14 * var11;
            var6_int = var6_int + l.field_k * var14;
            param4 = l.field_d;
            var9 = var9 + var14;
          }
          var13 = 0;
          if (param1 < l.field_b) {
            var14Lifetime1 = -param1 + l.field_b;
            var6_int = var6_int + var14Lifetime1;
            var12 = var12 + var14Lifetime1;
            param1 = l.field_b;
            var13 = var13 + var14Lifetime1;
            var8 = var8 + var14Lifetime1;
            var7 = var7 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
          }
          if (param4 + var10 > l.field_c) {
            var10 = var10 - (-l.field_c + (param4 + var10));
          }
          if (var11 + param1 > l.field_f) {
            var14Lifetime2 = -l.field_f + var11 + param1;
            var13 = var13 + var14Lifetime2;
            var12 = var12 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
          }
          if (param2 != 0) {
            qg.a(113, 32);
          }
          if (var11 > 0 &&
            var10 > 0) {
            var14Lifetime3 = var8;
            var16 = -(var11 >> 2);
            var11 = -(var11 & 3);
            for (var17 = -var10; var17 < 0; var17++) {
              for (var18 = var16; 0 > var18; var18++) {
                incrementValue$2 = var7;
                var7++;
                var15 = param0.field_z[incrementValue$2];
                if (var15 != 0 &&
                  gd.field_a[var8][var9] <= param5) {
                  incrementValue$3 = var8;
                  var8++;
                  gd.field_a[incrementValue$3][var9] = param5;
                  incrementValue$4 = var6_int;
                  var6_int++;
                  pj.a((byte) 95, true, param3, var15, incrementValue$4);
                } else {
                  var8++;
                  var6_int++;
                }
                incrementValue$5 = var7;
                var7++;
                var15Lifetime2 = param0.field_z[incrementValue$5];
                if (var15Lifetime2 != 0 &&
                  param5 >= gd.field_a[var8][var9]) {
                  incrementValue$6 = var8;
                  var8++;
                  gd.field_a[incrementValue$6][var9] = param5;
                  incrementValue$7 = var6_int;
                  var6_int++;
                  pj.a((byte) 57, true, param3, var15Lifetime2, incrementValue$7);
                } else {
                  var8++;
                  var6_int++;
                }
                incrementValue$8 = var7;
                var7++;
                var15Lifetime3 = param0.field_z[incrementValue$8];
                if (var15Lifetime3 != 0 &&
                  param5 >= gd.field_a[var8][var9]) {
                  incrementValue$9 = var8;
                  var8++;
                  gd.field_a[incrementValue$9][var9] = param5;
                  incrementValue$10 = var6_int;
                  var6_int++;
                  pj.a((byte) 50, true, param3, var15Lifetime3, incrementValue$10);
                } else {
                  var8++;
                  var6_int++;
                }
                incrementValue$11 = var7;
                var7++;
                var15Lifetime4 = param0.field_z[incrementValue$11];
                if (0 != var15Lifetime4 &&
                  param5 >= gd.field_a[var8][var9]) {
                  incrementValue$12 = var8;
                  var8++;
                  gd.field_a[incrementValue$12][var9] = param5;
                  incrementValue$13 = var6_int;
                  var6_int++;
                  pj.a((byte) 40, true, param3, var15Lifetime4, incrementValue$13);
                } else {
                  var6_int++;
                  var8++;
                }
              }
              var8 = var14Lifetime3;
              for (var18Lifetime1 = var11; var18Lifetime1 < 0; var18Lifetime1++) {
                incrementValue$0 = var7;
                var7++;
                var15Lifetime1 = param0.field_z[incrementValue$0];
                if (0 == var15Lifetime1) {
                  var6_int++;
                } else {
                  incrementValue$1 = var6_int;
                  var6_int++;
                  pj.a((byte) 106, true, param3, var15Lifetime1, incrementValue$1);
                }
              }
              var9++;
              if (param0.field_t + (param4 - 15) <= var9) {
                param5++;
              }
              var7 = var7 + var13;
              var6_int = var6_int + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_53_0 = var6;
          stackIn_53_1 = new StringBuilder().append("qg.B(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_a = 0;
    }
}
