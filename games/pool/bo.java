/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    static String field_b;
    static dd[] field_a;

    final static int b(int param0, int param1) {
        if (param0 != -65536) {
          bo.a((byte) -16);
          if (param1 < 0) {
            if (param1 >= -65536) {
              return -un.field_a[-param1 >> 5];
            }
            return un.field_a[134217728 / -param1] - 2048;
          }
          if (65536 >= param1) {
            return un.field_a[param1 >> 5];
          }
          return -un.field_a[134217728 / param1] + 2048;
        }
        if (param1 < 0) {
          if (param1 >= -65536) {
            return -un.field_a[-param1 >> 5];
          }
          return un.field_a[134217728 / -param1] - 2048;
        }
        if (65536 >= param1) {
          return un.field_a[param1 >> 5];
        }
        return -un.field_a[134217728 / param1] + 2048;
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 != 45) {
          return;
        }
        field_b = null;
    }

    final static tq a(int param0, int param1) {
        tq var2 = null;
        if (param1 >= 9) {
          var2 = new tq();
          hb.field_j.b((byte) 127, var2);
          kp.a(1, param0);
          return var2;
        }
        return (tq) null;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, byte param7, int param8, int[] param9, byte param10) {
        int var16 = 0;
        int var21 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        try {
          param3 = param3 & -4;
          var11_int = -66 % ((71 - param2) / 36);
          param5 = param5 & -4;
          param8 = param8 & -4;
          param6 = param6 & -4;
          param0 = param0 & -4;
          param4 = param4 & -4;
          kk.a(param8, param6, param0, param4, param5, param3, 1727215554);
          var12 = -na.field_f + la.field_f;
          var13 = wm.field_Nb - or.field_a;
          var14 = var13 * var13 + var12 * var12 >> 2;
          if (var14 == 0) {
            return;
          }
          var15 = (int)(Math.sqrt((double)((float)var14 / 4.0f)) * 4.0);
          for (var16 = ic.field_a; var16 < na.field_c; var16 += 4) {
            var17 = -or.field_a + var16;
            var18 = -wm.field_Nb + var16;
            var19 = var17 * var13;
            var20 = var17 * var12;
            for (var21 = hd.field_I; wh.field_f > var21; var21 += 4) {
              var22 = -na.field_f + var21;
              var23 = var21 - la.field_f;
              var24 = var22 * var12 + var19 >> 2;
              if ((0 != param7 ||
                !(0 > var22 * ng.field_w + fr.field_u * var17)) && (param10 != 0 ||
                !(0 <= var23 * ne.field_q + var18 * di.field_h))) {
                if (2 != param7 &&
                  var24 < 0) {
                  var25 = (int)Math.sqrt((double)(var22 * var22 + var17 * var17));
                  if (param6 >= var25) {
                    qh.b(var21 >> 2, var16 >> 2, param9[param1 - var25 * param1 / param6]);
                  }
                } else if (param10 != 2 &&
                  var14 < var24) {
                  var25 = (int)Math.sqrt((double)(var18 * var18 + var23 * var23));
                  if (param3 >= var25) {
                    qh.b(var21 >> 2, var16 >> 2, param9[param1 - param1 * var25 / param3]);
                  }
                } else {
                  var25 = var13 * var22 - var20 >> 2;
                  if (var25 < 0) {
                    var25 = -var25;
                  }
                  var26 = ((var14 - var24) * param6 + var24 * param3) / var14;
                  if (var25 < var15 * var26 >> 2) {
                    qh.b(var21 >> 2, var16 >> 2, param9[param1 - (var25 << 2) * param1 / var26 / var15]);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_32_0 = var11;
          stackIn_32_1 = new StringBuilder().append("bo.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param10).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int[] var3 = null;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = wp.field_g;
        synchronized (var1) {
          cd.field_b = ho.field_v;
          qk.field_g = qk.field_g + 1;
          wn.field_i = we.field_l;
          gg.field_f = wn.field_k;
          re.field_c = m.field_d;
          m.field_d = false;
          ne.field_s = kj.field_c;
          lq.field_W = pq.field_f;
          ua.field_o = ne.field_o;
          kj.field_c = 0;
        }
        if (param0 >= 86) {
          return;
        }
        var3 = (int[]) null;
        bo.$cfr$intArgs$a$29f688675a86(94, 67, 67, -120, -99, 36, -121, 15, 19, (int[]) null, 9);
    }

    final static boolean a(int param0, byte param1) {
        boolean stackIn_5_0 = false;
        boolean stackIn_11_0 = false;
        boolean stackIn_24_0 = false;
        boolean stackIn_30_0 = false;
        boolean stackIn_37_0 = false;
        if (param1 == 43) {
          if (param0 < 0) {
            stackIn_24_0 = ((param0 + 1) % 4 == 0);
            return stackIn_24_0;
          }
          if (param0 < 1582) {
            stackIn_30_0 = (0 == param0 % 4);
            return stackIn_30_0;
          }
          if (param0 % 4 != 0) {
            return false;
          }
          if (param0 % 100 != 0) {
            return true;
          }
          stackIn_37_0 = (param0 % 400 == 0);
          return stackIn_37_0;
        }
        field_a = (dd[]) null;
        if (param0 < 0) {
          stackIn_5_0 = ((param0 + 1) % 4 == 0);
          return stackIn_5_0;
        }
        if (param0 < 1582) {
          stackIn_11_0 = (0 == param0 % 4);
          return stackIn_11_0;
        }
        if (param0 % 4 != 0) {
          return false;
        }
        if (param0 % 100 != 0) {
          return true;
        }
        if (param0 % 400 == 0) {
          return true;
        }
        return false;
    }

    final static void a(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          var1_int = lq.field_T[0];
          if (param0 >= -85) {
            bo.a(53, (byte) 68);
          }
          for (var2 = 1; lq.field_T.length > var2; var2++) {
            var3 = lq.field_T[var2];
            qn.a(tl.field_I, var2 << 4, tl.field_I, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "bo.B(" + param0 + ')');
        }
    }

    static {
        field_b = "Break";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$29f688675a86(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9, int param10) {
        int var16 = 0;
        int var21 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        try {
          param3 = param3 & -4;
          var11_int = -66 % ((71 - param2) / 36);
          param5 = param5 & -4;
          param8 = param8 & -4;
          param6 = param6 & -4;
          param0 = param0 & -4;
          param4 = param4 & -4;
          kk.a(param8, param6, param0, param4, param5, param3, 1727215554);
          var12 = -na.field_f + la.field_f;
          var13 = wm.field_Nb - or.field_a;
          var14 = var13 * var13 + var12 * var12 >> 2;
          if (var14 == 0) {
            return;
          }
          var15 = (int)(Math.sqrt((double)((float)var14 / 4.0f)) * 4.0);
          for (var16 = ic.field_a; var16 < na.field_c; var16 += 4) {
            var17 = -or.field_a + var16;
            var18 = -wm.field_Nb + var16;
            var19 = var17 * var13;
            var20 = var17 * var12;
            for (var21 = hd.field_I; wh.field_f > var21; var21 += 4) {
              var22 = -na.field_f + var21;
              var23 = var21 - la.field_f;
              var24 = var22 * var12 + var19 >> 2;
              if ((0 != param7 ||
                !(0 > var22 * ng.field_w + fr.field_u * var17)) && (param10 != 0 ||
                !(0 <= var23 * ne.field_q + var18 * di.field_h))) {
                if (2 != param7 &&
                  var24 < 0) {
                  var25 = (int)Math.sqrt((double)(var22 * var22 + var17 * var17));
                  if (param6 >= var25) {
                    qh.b(var21 >> 2, var16 >> 2, param9[param1 - var25 * param1 / param6]);
                  }
                } else if (param10 != 2 &&
                  var14 < var24) {
                  var25 = (int)Math.sqrt((double)(var18 * var18 + var23 * var23));
                  if (param3 >= var25) {
                    qh.b(var21 >> 2, var16 >> 2, param9[param1 - param1 * var25 / param3]);
                  }
                } else {
                  var25 = var13 * var22 - var20 >> 2;
                  if (var25 < 0) {
                    var25 = -var25;
                  }
                  var26 = ((var14 - var24) * param6 + var24 * param3) / var14;
                  if (var25 < var15 * var26 >> 2) {
                    qh.b(var21 >> 2, var16 >> 2, param9[param1 - (var25 << 2) * param1 / var26 / var15]);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_32_0 = var11;
          stackIn_32_1 = new StringBuilder().append("bo.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param10).append(')').toString());
        }
    }
}
