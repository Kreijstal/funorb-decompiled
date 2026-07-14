/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static int field_b;
    static String field_a;
    static dd[] field_c;
    static vh field_e;
    static long field_d;

    final static void a(lr param0, boolean param1, di param2) {
        int var3 = 0;
        sf var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        int[] var16 = null;
        di stackIn_4_0 = null;
        di stackIn_5_0 = null;
        di stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        di stackOut_3_0 = null;
        di stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        di stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        var9 = Pool.field_O;
        var3 = gj.field_S;
        e.field_a = new vh(0L, (vh) null);
        if (param2 == null) {
          var10 = null;
          tc.a((Throwable) null, "QC1", -8555);
          return;
        } else {
          L0: {
            stackOut_3_0 = (di) param2;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (!param1) {
              stackOut_5_0 = (di) (Object) stackIn_5_0;
              stackOut_5_1 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L0;
            } else {
              stackOut_4_0 = (di) (Object) stackIn_4_0;
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L0;
            }
          }
          stackIn_6_0.field_i = stackIn_6_1 != 0;
          param2.field_k = 0;
          jp.field_N = new ee(var3, param2, param2);
          o.field_x = new wh(var3, param2, param2, (si) (Object) new wp());
          var4 = nk.c(2);
          if (var4 != null) {
            gp.a((byte) 58, var4);
            var12 = null;
            tp.field_i = id.a(1127256, 0, 0, 4020342, 1513239, 65793, 5138823, 1513239, 65793, (lr) null, 8947848, 2245737, 65793);
            bf.field_c = id.a(0, 0, 16764006, 0, 0, 0, 0, 0, 0, param0, 0, 0, 0);
            br.field_J = id.a(0, 0, 16777215, 0, 0, 0, 0, 0, 0, param0, 0, 0, 0);
            var5 = qh.field_l;
            var6 = qh.field_f;
            var16 = qh.field_d;
            ue.field_c = new dd(10, 14);
            ue.field_c.e();
            var8 = 2;
            L1: while (true) {
              if ((var8 ^ -1) <= -8) {
                qh.a(var16, var5, var6);
                w.field_b = hk.a(br.field_J, bf.field_c, var4, tp.field_i, (byte) 112);
                e.field_a.field_T = new ko();
                return;
              } else {
                qh.b(var8, var8 - -1, 14 + -(var8 << -2015615903), 16777215);
                var8++;
                continue L1;
              }
            }
          } else {
            var11 = null;
            tc.a((Throwable) null, "QC2", -8555);
            return;
          }
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = -31 % ((param2 - -32) / 54);
        while (0 < param1) {
            var3 = var3 << 460871489 | 1 & param0;
            param0 = param0 >>> 1;
            param1--;
        }
        return var3;
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8, int param9, int param10) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        L0: {
          if (0 != param10) {
            break L0;
          } else {
            if (-1 != (param4 ^ -1)) {
              break L0;
            } else {
              return -1;
            }
          }
        }
        if (param9 == param1) {
          return wh.a(param7, param9, param0, param5, param6, param3, param10, param2, param4, 98);
        } else {
          if (param7 != param3) {
            if (param8 == 98) {
              L1: {
                var11 = -param9 + param1;
                var12 = -param3 + param7;
                var13 = var12;
                var14 = -var11;
                var15 = rf.a(aj.a(var13, false, var13) + aj.a(var14, false, var14), -128);
                if (0L < od.a((long)var13, (long)param10, false) - -od.a((long)var14, (long)param4, false)) {
                  param9 = param9 - lh.a(var15, (byte) -73, (long)(var13 * param6));
                  param3 = param3 - lh.a(var15, (byte) -90, (long)(var14 * param6));
                  break L1;
                } else {
                  param9 = param9 + lh.a(var15, (byte) -95, (long)(var13 * param6));
                  param3 = param3 + lh.a(var15, (byte) -111, (long)(param6 * var14));
                  break L1;
                }
              }
              var16 = aj.a(var11, false, param4) - aj.a(var12, false, param10);
              if (-1 == (var16 ^ -1)) {
                return -1;
              } else {
                L2: {
                  var17 = lh.a(var16, (byte) -82, (long)(aj.a(var12, false, param5 + -param9) + -aj.a(var11, false, -param3 + param2)));
                  if ((var17 ^ -1) >= -1) {
                    break L2;
                  } else {
                    if (var17 <= -param0 + 65536) {
                      var18 = lh.a(var11, (byte) -110, (long)(-param9 + param5 - -aj.a(var17, false, param10)));
                      if (-1 < var18) {
                        break L2;
                      } else {
                        if (-65537 < var18) {
                          break L2;
                        } else {
                          return var17 - -param0;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                return -1;
              }
            } else {
              return -7;
            }
          } else {
            return cq.a(param3, param6, (byte) -112, param2, param10, param5, param0, param9, param4, param1);
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        if (param0 != -13679) {
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You potted the 8 ball illegally. I will re-spot it for you so you can continue.";
    }
}
