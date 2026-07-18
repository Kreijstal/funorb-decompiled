/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lf {
    static String field_e;
    static volatile int field_c;
    static aa field_a;
    static ad field_d;
    static char[] field_f;
    static String field_b;

    abstract void a(java.awt.Component param0, int param1);

    final static boolean a(int[] param0, int param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        sa var4_ref_sa = null;
        int var4 = 0;
        int var5_int = 0;
        sa var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_30_0 = false;
        int stackIn_34_0 = 0;
        boolean stackIn_37_0 = false;
        int stackIn_40_0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_26_0 = 0;
        boolean stackOut_29_0 = false;
        int stackOut_33_0 = 0;
        boolean stackOut_36_0 = false;
        int stackOut_39_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (jj.field_Y != ef.field_e) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (param1 == 122) {
                L1: {
                  var2_long = je.a(1);
                  if (0 == rh.field_i) {
                    break L1;
                  } else {
                    if (qg.field_a < 0) {
                      var4_ref_sa = (sa) (Object) jl.field_h.a((byte) 51);
                      if (null == var4_ref_sa) {
                        break L1;
                      } else {
                        if (~var2_long >= ~var4_ref_sa.field_h) {
                          break L1;
                        } else {
                          var4_ref_sa.c(10);
                          te.field_O = var4_ref_sa.field_k.length;
                          te.field_N.field_m = 0;
                          var5_int = 0;
                          L2: while (true) {
                            L3: {
                              L4: {
                                if (var5_int >= te.field_O) {
                                  break L4;
                                } else {
                                  te.field_N.field_l[var5_int] = var4_ref_sa.field_k[var5_int];
                                  var5_int++;
                                  if (var7 != 0) {
                                    break L3;
                                  } else {
                                    if (var7 == 0) {
                                      continue L2;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                              nf.field_U = kl.field_b;
                              kl.field_b = jg.field_e;
                              jg.field_e = ob.field_h;
                              ob.field_h = var4_ref_sa.field_j;
                              break L3;
                            }
                            stackOut_26_0 = 1;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0 != 0;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                L5: while (true) {
                  L6: {
                    L7: {
                      if (qg.field_a >= 0) {
                        break L7;
                      } else {
                        te.field_N.field_m = 0;
                        stackOut_29_0 = bf.c(114, 1);
                        stackIn_37_0 = stackOut_29_0;
                        stackIn_30_0 = stackOut_29_0;
                        if (var7 != 0) {
                          break L6;
                        } else {
                          if (stackIn_30_0) {
                            qg.field_a = te.field_N.l(27310);
                            te.field_N.field_m = 0;
                            te.field_O = param0[qg.field_a];
                            break L7;
                          } else {
                            stackOut_33_0 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            return stackIn_34_0 != 0;
                          }
                        }
                      }
                    }
                    stackOut_36_0 = qd.b((byte) 127);
                    stackIn_37_0 = stackOut_36_0;
                    break L6;
                  }
                  if (!stackIn_37_0) {
                    stackOut_39_0 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    return stackIn_40_0 != 0;
                  } else {
                    L8: {
                      if (rh.field_i == 0) {
                        break L8;
                      } else {
                        L9: {
                          var4 = rh.field_i;
                          if (hb.field_n == 0.0) {
                            break L9;
                          } else {
                            var4 = (int)((double)var4 + ib.field_i.nextGaussian() * hb.field_n);
                            if (0 <= var4) {
                              break L9;
                            } else {
                              var4 = 0;
                              break L9;
                            }
                          }
                        }
                        var5 = new sa(var2_long - -(long)var4, qg.field_a, new byte[te.field_O]);
                        var6 = 0;
                        L10: while (true) {
                          L11: {
                            L12: {
                              if (~var6 <= ~te.field_O) {
                                break L12;
                              } else {
                                var5.field_k[var6] = te.field_N.field_l[var6];
                                var6++;
                                if (var7 != 0) {
                                  break L11;
                                } else {
                                  if (var7 == 0) {
                                    continue L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            jl.field_h.a((gg) (Object) var5, -7044);
                            qg.field_a = -1;
                            break L11;
                          }
                          if (var7 == 0) {
                            continue L5;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    nf.field_U = kl.field_b;
                    kl.field_b = jg.field_e;
                    jg.field_e = ob.field_h;
                    ob.field_h = qg.field_a;
                    qg.field_a = -1;
                    stackOut_53_0 = 1;
                    stackIn_54_0 = stackOut_53_0;
                    break L0;
                  }
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var2;
            stackOut_55_1 = new StringBuilder().append("lf.E(");
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param0 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L13;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L13;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + ',' + param1 + ')');
        }
        return stackIn_54_0 != 0;
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 18609) {
                break L1;
              } else {
                fg discarded$2 = lf.a((byte) -36, (java.applet.Applet) null);
                break L1;
              }
            }
            field_a = null;
            field_f = null;
            field_e = null;
            field_b = null;
            field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var1, "lf.D(" + param0 + ')');
        }
    }

    abstract int a(int param0);

    abstract void a(java.awt.Component param0, boolean param1);

    final static fg a(byte param0, java.applet.Applet param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        fg[] var4 = null;
        int var5 = 0;
        fg var6 = null;
        int var7 = 0;
        fg stackIn_5_0 = null;
        fg stackIn_9_0 = null;
        fg stackIn_13_0 = null;
        fg stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        fg stackOut_4_0 = null;
        fg stackOut_8_0 = null;
        fg stackOut_12_0 = null;
        fg stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = -56 % ((param0 - 51) / 35);
            var3 = na.a("jagex-last-login-method", param1, -32574);
            if (null == var3) {
              stackOut_4_0 = SolKnight.field_D;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var4 = cl.d((byte) -30);
              var5 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var5 <= ~var4.length) {
                      break L3;
                    } else {
                      var6 = var4[var5];
                      stackOut_8_0 = (fg) var6;
                      stackIn_16_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (!((fg) (Object) stackIn_9_0).a(-126, var3)) {
                          var5++;
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          stackOut_12_0 = (fg) var6;
                          stackIn_13_0 = stackOut_12_0;
                          return stackIn_13_0;
                        }
                      }
                    }
                  }
                  stackOut_15_0 = SolKnight.field_D;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("lf.F(").append(param0).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_16_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_a = null;
        field_f = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        field_b = "Not yet achieved";
    }
}
