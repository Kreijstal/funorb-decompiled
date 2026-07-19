/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends ma {
    static vh field_o;
    int field_r;
    int field_p;
    int field_l;
    int field_q;
    gi field_s;
    static String field_n;
    int field_m;
    static int field_t;

    final static int a(int param0, int param1) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = param1;
            if (-1 < (param0 ^ -1)) {
              break L1;
            } else {
              if (65536 > param0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param0 = param0 >>> 16;
          var2 += 16;
          break L0;
        }
        L2: {
          if (param0 >= 256) {
            param0 = param0 >>> 8;
            var2 += 8;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (16 > param0) {
            break L3;
          } else {
            var2 += 4;
            param0 = param0 >>> 4;
            break L3;
          }
        }
        L4: {
          if (-5 >= (param0 ^ -1)) {
            var2 += 2;
            param0 = param0 >>> 2;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param0 >= 1) {
            param0 = param0 >>> 1;
            var2++;
            break L5;
          } else {
            break L5;
          }
        }
        return param0 + var2;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        int var7 = this.field_q + param5;
        int var8 = param1 - -this.field_m;
        qh.e(var8 + -1, var7, this.field_l - -1, param0, param2);
        qh.e(var8 + -1, param3 + var7 + this.field_r, 1 + this.field_l, param0, param2);
        if (!(!param4)) {
            qh.g(var8 - 2, var7, this.field_r, param0, param2);
        }
        if (this.field_s == null) {
            qh.g(this.field_l + var8, var7, this.field_r, param0, param2);
        } else {
            this.field_s.a(param0, param1, param2, -1, false, param5);
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        oc var4_ref_oc = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        oc var17 = null;
        int var18 = 0;
        int[] var19 = null;
        int[] var20 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            eh.field_p = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = qe.field_S.length;
            var20 = new int[var1_int];
            var19 = var20;
            var2 = var19;
            var3 = 0;
            L1: while (true) {
              if (var1_int <= var3) {
                L2: {
                  var3 = eh.field_p[9] >> 806221640;
                  var4 = eh.field_p[10] >> -1730645656;
                  var5 = eh.field_p[11] >> 2116712104;
                  var6 = im.field_fc << -875367676;
                  var7 = 0;
                  var8 = af.c((byte) -123, var6) >> -428853080;
                  var9 = o.a(var6, (byte) 83) >> 899847720;
                  if ((wn.field_i ^ -1) == 0) {
                    break L2;
                  } else {
                    if (0 == (gg.field_f ^ -1)) {
                      break L2;
                    } else {
                      var9 = -128;
                      var7 = -320 + wn.field_i;
                      var8 = -gg.field_f + 240;
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var8 * var8 + (var7 * var7 - -(var9 * var9))));
                var7 = (int)((double)var7 * var10);
                var8 = (int)((double)var8 * var10);
                var9 = (int)((double)var9 * var10);
                var12 = -var3 + var7;
                var13 = -var4 + var8;
                var14 = -var5 + var9;
                if (param0 == -21818) {
                  var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var13 * var13 + var12 * var12));
                  var12 = (int)((double)var12 * var10);
                  var14 = (int)((double)var14 * var10);
                  var13 = (int)((double)var13 * var10);
                  var15 = 0;
                  L3: while (true) {
                    if (qe.field_S.length <= var15) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var16 = 0;
                      var17_int = 1;
                      L4: while (true) {
                        if (var17_int >= qe.field_S.length) {
                          var20[var16] = -2147483648;
                          var17 = qe.field_S[var16];
                          qe.b(0, var16);
                          var18 = 0;
                          L5: while (true) {
                            if (-4 >= (var18 ^ -1)) {
                              ve.a(param0 + 21815, false, eh.field_p, false, true, li.field_b, var17);
                              kj.a(var14, 8355711, var17, var8, var13, var9, var12, var7);
                              var15++;
                              continue L3;
                            } else {
                              li.field_b[var18] = li.field_b[var18] + qp.field_gc[var15][var18];
                              var18++;
                              continue L5;
                            }
                          }
                        } else {
                          if (var20[var17_int] > var20[var16]) {
                            var16 = var17_int;
                            var17_int++;
                            continue L4;
                          } else {
                            var17_int++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var4_ref_oc = qe.field_S[var3];
                var4_ref_oc.a((byte) 87);
                qe.b(0, var3);
                var5 = var4_ref_oc.field_n - -var4_ref_oc.field_q >> 337205185;
                var6 = var4_ref_oc.field_b + var4_ref_oc.field_N >> -2080439007;
                var7 = var4_ref_oc.field_f + var4_ref_oc.field_F >> 1740837217;
                var8 = eh.field_p[9] >> 186407874;
                var9 = eh.field_p[10] >> 1996404354;
                var10_int = eh.field_p[11] >> -2113781918;
                var11 = var10_int * li.field_b[5] + (var8 * li.field_b[3] + var9 * li.field_b[4]) >> -1584759730;
                var12 = li.field_b[8] * var10_int + li.field_b[6] * var8 - -(var9 * li.field_b[7]) >> -1379719762;
                var13 = li.field_b[10] * var9 + (li.field_b[9] * var8 + li.field_b[11] * var10_int) >> 19470606;
                var2[var3] = var7 * var13 + (var11 * var5 + var12 * var6) >> -1509651472;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "gi.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        if (!param0) {
            field_o = (vh) null;
        }
        field_o = null;
    }

    final static ij a(boolean param0, int param1, String param2, String param3) {
        ij var4 = null;
        RuntimeException var4_ref = null;
        ij stackIn_3_0 = null;
        ij stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ij stackOut_2_0 = null;
        ij stackOut_6_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (me.a(-2, param1) == null) {
              var4 = new ij(param1);
              var4.a(param2, (byte) 120, param3);
              nd.field_i.b((byte) -20, var4);
              stackOut_2_0 = (ij) (var4);
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!param0) {
                stackOut_6_0 = (ij) null;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4_ref);
            stackOut_9_1 = new StringBuilder().append("gi.E(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          L2: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    gi(int param0) {
        this.field_s = null;
        this.field_p = param0;
    }

    static {
        field_n = "That name is not available";
    }
}
