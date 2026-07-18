/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static wd field_e;
    static pa field_i;
    static String field_f;
    static int field_g;
    private wt field_b;
    static vd[] field_a;
    private er field_d;
    private int field_c;
    private ph field_h;

    final static void a(String param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            rs.field_x = param0;
            oi.a(12, 20665);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("qk.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + false + ')');
        }
    }

    final static ll[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        ll[] var10 = null;
        ll[] var11_ref_ll__ = null;
        int var11 = 0;
        int var12 = 0;
        ll var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = AceOfSkies.field_G ? 1 : 0;
        var9 = param4 + (param1 + param5);
        var10 = new ll[]{new ll(var9, var9), new ll(param0, var9), new ll(var9, var9), new ll(var9, param0), new ll(64, 64), new ll(var9, param0), new ll(var9, var9), new ll(param0, var9), new ll(var9, var9)};
        var11_ref_ll__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_ll__.length) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= param4) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= param4) {
                    var11 = 0;
                    L3: while (true) {
                      if (param0 <= var11) {
                        L4: {
                          var11 = 0;
                          if (param7 <= -89) {
                            break L4;
                          } else {
                            ll[] discarded$1 = qk.a(-50, 101, 116, 1, 33, 12, 71, 24, -27);
                            break L4;
                          }
                        }
                        L5: while (true) {
                          if (param0 >> 1 <= var11) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (param5 <= var12) {
                                var11++;
                                continue L5;
                              } else {
                                var10[1].field_x[var11 + (-1 + (-var12 + var9)) * param0] = param6;
                                var10[3].field_x[var9 * var11 + -1 + (var9 - var12)] = param6;
                                var10[7].field_x[var12 * param0 - -var11] = param6;
                                var10[5].field_x[var9 * var11 + var12] = param6;
                                var12++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (param4 <= var12) {
                            var11++;
                            continue L3;
                          } else {
                            var10[7].field_x[(-1 + -var12 + var9) * param0 + var11] = param2;
                            var10[5].field_x[-var12 - (-var9 + 1 - var11 * var9)] = param2;
                            var10[1].field_x[var12 * param0 - -var11] = param3;
                            var10[3].field_x[var9 * var11 + var12] = param3;
                            var12++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var9 > var12) {
                        var10[0].field_x[var11 * var9 + var12] = param3;
                        var10[0].field_x[var11 + var12 * var9] = param3;
                        if (var9 + -var11 > var12) {
                          var10[2].field_x[var11 * var9 + var12] = param3;
                          var10[6].field_x[var11 + var9 * var12] = param3;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      } else {
                        var11++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var12 < var9) {
                    var10[6].field_x[var9 * (-var11 + (var9 + -1)) + var12] = param2;
                    var10[8].field_x[(-var11 + (var9 - 1)) * var9 + var12] = param2;
                    var10[2].field_x[-var11 - -var9 + (-1 + var12 * var9)] = param2;
                    var10[8].field_x[-var11 - (-var9 + 1) + var12 * var9] = param2;
                    var12++;
                    continue L9;
                  } else {
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_ll__[var12];
            var14 = 0;
            L10: while (true) {
              if (var14 >= var13.field_x.length) {
                var12++;
                continue L0;
              } else {
                var13.field_x[var14] = param8;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_f = null;
        field_i = null;
    }

    final void a(wt param0, int param1, long param2) {
        wt var5 = null;
        try {
            if (((qk) this).field_c != 0) {
                ((qk) this).field_c = ((qk) this).field_c - 1;
            } else {
                var5 = ((qk) this).field_d.b(param1 + -18522);
                var5.c(-126);
                var5.d(-119);
                if (((qk) this).field_b == var5) {
                    var5 = ((qk) this).field_d.b(param1 + -18522);
                    var5.c(-128);
                    var5.d(param1 + -125);
                }
            }
            ((qk) this).field_h.a(125, param2, (wf) (Object) param0);
            ((qk) this).field_d.a(param1, param0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "qk.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a() {
        wo var1 = (wo) (Object) pu.field_b.b(4095);
        if (var1 == null) {
            var1 = new wo();
        }
        var1.a(vp.field_i, 251, vp.field_c, vp.field_f, vp.field_b, vp.field_d, vp.field_j, vp.field_k);
        bo.field_i.a(104, (wf) (Object) var1);
    }

    final wt a(byte param0, long param1) {
        if (param0 != -27) {
            field_g = 50;
        }
        wt var4 = (wt) (Object) ((qk) this).field_h.a((byte) 106, param1);
        if (!(var4 == null)) {
            ((qk) this).field_d.a(2, var4);
        }
        return var4;
    }

    qk(int param0) {
        ((qk) this).field_b = new wt();
        ((qk) this).field_d = new er();
        ((qk) this).field_c = param0;
        int var2 = 1;
        while (param0 > var2 + var2) {
            var2 = var2 + var2;
        }
        ((qk) this).field_h = new ph(var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "You have 1 unread message!";
    }
}
