/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static String field_b;
    static int field_e;
    static um field_h;
    static boolean field_f;
    static fo field_g;
    static int field_d;
    static int field_a;
    static boolean field_c;

    final static String a(String param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        bv var5 = null;
        CharSequence var6 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        Object stackOut_21_0 = null;
        String stackOut_19_0 = null;
        String stackOut_16_0 = null;
        String stackOut_13_0 = null;
        String stackOut_10_0 = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -29) {
                break L1;
              } else {
                se.a(93);
                break L1;
              }
            }
            var6 = (CharSequence) ((Object) param0);
            if (!hg.a((byte) -90, var6)) {
              stackOut_4_0 = bc.field_d;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!gt.a(param0, (byte) -114)) {
                if (2 == th.field_a) {
                  if (!si.a(param0, -3404)) {
                    if (-101 < (vg.field_p ^ -1)) {
                      if (!jj.a(89, param0)) {
                        var5 = vl.field_n;
                        var5.h(32161, param1);
                        var5.field_q = var5.field_q + 1;
                        var4 = var5.field_q;
                        var5.b(1, 2);
                        var5.b(param0, 13851);
                        var5.e(var5.field_q + -var4, 5930);
                        stackOut_21_0 = null;
                        stackIn_22_0 = stackOut_21_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        stackOut_19_0 = fo.a(4800, ql.field_p, new String[]{param0});
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackOut_16_0 = wh.field_d;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackOut_13_0 = fo.a(4800, ts.field_k, new String[]{param0});
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_10_0 = ct.field_m;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_7_0 = am.field_F;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("se.A(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L2;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    return (String) ((Object) stackIn_22_0);
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_f = false;
            field_b = null;
            field_g = null;
            field_h = null;
            return;
        }
        field_b = null;
        field_g = null;
        field_h = null;
    }

    final static wk[] a(byte param0) {
        wk[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var12 = null;
        int[] var14 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        boolean stackIn_3_0 = false;
        int stackIn_22_0 = 0;
        boolean stackOut_2_0 = false;
        byte stackOut_21_0 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var1 = new wk[iw.field_n];
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (iw.field_n <= var2) {
                break L2;
              } else {
                var3 = c.field_e[var2] * qm.field_K[var2];
                var17 = vj.field_j[var2];
                stackOut_2_0 = ne.field_e[var2];
                stackIn_22_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var8 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      L5: {
                        if (stackIn_3_0) {
                          break L5;
                        } else {
                          var9 = new int[var3];
                          var6_int = 0;
                          L6: while (true) {
                            L7: {
                              if (var6_int >= var3) {
                                var1[var2] = new wk(lg.field_d, wr.field_J, j.field_e[var2], iq.field_g[var2], qm.field_K[var2], c.field_e[var2], var9);
                                break L7;
                              } else {
                                var9[var6_int] = qv.field_j[rn.a(255, (int) var17[var6_int])];
                                var6_int++;
                                if (var8 != 0) {
                                  break L7;
                                } else {
                                  continue L6;
                                }
                              }
                            }
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var18 = cq.field_z[var2];
                      var14 = new int[var3];
                      var12 = var14;
                      var6 = var12;
                      var7 = 0;
                      L8: while (true) {
                        if (var3 <= var7) {
                          var1[var2] = (wk) ((Object) new nj(lg.field_d, wr.field_J, j.field_e[var2], iq.field_g[var2], qm.field_K[var2], c.field_e[var2], var14));
                          break L4;
                        } else {
                          var6[var7] = oe.c(qv.field_j[rn.a((int) var17[var7], 255)], rn.a((int) var18[var7], 255) << -1607052648);
                          var7++;
                          if (var8 != 0) {
                            break L3;
                          } else {
                            continue L8;
                          }
                        }
                      }
                    }
                    var2++;
                    break L3;
                  }
                  if (var8 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_21_0 = param0;
            stackIn_22_0 = stackOut_21_0;
            break L1;
          }
          if (stackIn_22_0 != 32) {
            return (wk[]) null;
          } else {
            rj.d((byte) 101);
            return var1;
          }
        }
    }

    static {
        field_b = "Enter name of friend to delete from list";
        field_a = 480;
        field_c = false;
        field_f = false;
    }
}
