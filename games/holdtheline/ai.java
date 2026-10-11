/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ai {
    static tf field_a;
    static go field_b;
    static hj field_c;

    final static boolean a(int param0) {
        if (param0 > -59) {
          field_c = (hj) null;
          return true;
        }
        return true;
    }

    final static void a(gn param0, int[] param1, int param2) {
        try {
          int var3_int = 0;
          int var4 = 0;
          int var6 = HoldTheLine.field_D;
          try {
            if (param2 > -73) {
              ai.a(-18);
            }
            for (var3_int = 0; var3_int < 6; var3_int++) {
              for (var4 = 0; pc.field_l[var3_int] > var4; var4++) {
                if (tk.field_c[var3_int][var4].field_r) {
                  try {
                    tk.field_c[var3_int][var4] = lm.a(param0.a(tk.field_c[var3_int][var4].field_h, 0, param1, ""), (byte) 123);
                  } catch (IOException iOException) {
                    String var7 = (String) null;
                    throw new RuntimeException((String) null);
                  }
                }
              }
            }
            vf.field_v = true;
          } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ai.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, ui param1) {
        try {
          if (param0 != -123) {
            field_b = (go) null;
          }
          pk.field_H.b(param1.field_j);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ai.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, qk param4, int param5, int param6, int param7) {
        int stackIn_17_0 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        uj stackIn_39_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        uj var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        ui var41 = null;
        int[] var42 = null;
        qk var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = HoldTheLine.field_D;
        try {
          var45 = param4;
          if (var45.field_r != null &&
            var45.field_l > 1) {
            var61 = var45.field_r;
            ta.a(0, 0, pk.field_I, (byte) -83, var61);
          } else {
            hm.a((byte) 126);
          }
          var55 = new int[param4.field_o];
          var50 = var55;
          var42 = var50;
          var8 = var42;
          var65 = new int[param4.field_o];
          var63 = kf.field_T;
          if (param0 != -4006) {
            var41 = (ui) null;
            ai.a((byte) -11, (ui) null);
          }
          var64 = gb.field_q;
          var62 = u.field_S;
          for (var13 = 0; param4.field_o > var13; var13++) {
            var14 = param2 * var62[var13] + (param6 * var63[var13] + param1 * var64[var13]) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 < 0) {
              stackIn_17_0 = 128;
            } else {
              if (var14 < 128) {
                stackIn_17_0 = 128 + var14;
              } else {
                stackIn_17_0 = 256;
              }
            }
            var14Lifetime2 = stackIn_17_0;
            var15 = param7 * var62[var13] + (var63[var13] * param5 + param3 * var64[var13]) >> 8;
            stackIn_19_0 = qf.field_i;
            if (var15 >= 0) {
              stackIn_20_1 = var15;
            } else {
              stackIn_20_1 = -var15;
            }
            var15Lifetime2 = stackIn_19_0[stackIn_20_1];
            var14Lifetime2 = var14Lifetime2 * (-var15Lifetime2 + 256) >>> 8;
            var55[var13] = var14Lifetime2;
            var65[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; rb.field_t > var13Lifetime1; var13Lifetime1++) {
            var14Lifetime1 = al.field_b[var13Lifetime1];
            var15Lifetime1 = param4.field_w[var14Lifetime1];
            var16 = param4.field_Q[var14Lifetime1];
            var17 = param4.field_P[var14Lifetime1];
            if (param4.field_e[var14Lifetime1] >= kf.field_T.length) {
              stackIn_26_0 = -1;
            } else {
              stackIn_26_0 = param4.field_e[var14Lifetime1];
            }
            var18 = stackIn_26_0;
            if (kf.field_T.length <= param4.field_K[var14Lifetime1]) {
              stackIn_29_0 = -1;
            } else {
              stackIn_29_0 = param4.field_K[var14Lifetime1];
            }
            var19 = stackIn_29_0;
            if (kf.field_T.length <= param4.field_x[var14Lifetime1]) {
              stackIn_32_0 = -1;
            } else {
              stackIn_32_0 = param4.field_x[var14Lifetime1];
            }
            var20 = stackIn_32_0;
            if (kl.field_s != null &&
              param4.field_t != null &&
              var14Lifetime1 < param4.field_t.length &&
              param4.field_t[var14Lifetime1] != -1 &&
              param4.field_t[var14Lifetime1] < kl.field_s.length) {
              stackIn_39_0 = kl.field_s[param4.field_t[var14Lifetime1]];
            } else {
              stackIn_39_0 = null;
            }
            var21 = stackIn_39_0;
            var22 = gd.field_d[var15Lifetime1];
            var23 = om.field_p[var15Lifetime1];
            var24 = gd.field_d[var16];
            var25 = om.field_p[var16];
            var26 = gd.field_d[var17];
            var27 = om.field_p[var17];
            if (var19 == var18 &&
              var19 == var20) {
              var28 = var55[var18];
              var29 = var65[var18];
              if (var21 == null) {
                stackIn_44_0 = 8355711;
              } else {
                stackIn_44_0 = var21.field_g;
              }
              var30 = stackIn_44_0;
              var31 = 16711935 & var30;
              var32 = 65280 & var30;
              var33 = (-16711711 & var31 * var28) >>> 8 | var28 * var32 >>> 8 & 1241579264;
              var33 = var33 + 65793 * var29;
              wl.a(var23, 8355711 & var33 >> 1, (byte) 102, var22, var26, var27, var24, var25);
            } else {
              var28 = var55[var18];
              var29 = var55[var19];
              var30 = var55[var20];
              var31 = var65[var18];
              var32 = var65[var19];
              var33 = var65[var20];
              if (var21 != null) {
                stackIn_48_0 = var21.field_g;
              } else {
                stackIn_48_0 = 8355711;
              }
              var34 = stackIn_48_0;
              var35 = 16711935 & var34;
              var36 = 65280 & var34;
              var37 = (var35 * var28 & -16711770) >>> 8 | var36 * var28 >>> 8 & -1727987968;
              var38 = var35 * var29 >>> 8 & 2080309503 | -1660879104 & var36 * var29 >>> 8;
              var38 = var38 + 65793 * var32;
              var39 = var30 * var36 >>> 8 & 738262784 | (-16711779 & var35 * var30) >>> 8;
              var37 = var37 + var31 * 65793;
              var39 = var39 + var33 * 65793;
              ll.a(var23, (var38 & 65313) >> 8, var22, var39 >> 16, var24, 255 & var39, 255 & var38, 255 & var37 >> 8, -27987, 255 & var37, var27, var26, (var39 & 65402) >> 8, var37 >> 16, var38 >> 16, var25);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_53_0 = var8_ref;
          stackIn_53_1 = new StringBuilder().append("ai.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 > -109) {
          return;
        }
        field_a = null;
    }

    static {
    }
}
