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
        Object var4_ref = null;
        sa var4_ref_sa = null;
        int var4 = 0;
        int var5_int = 0;
        sa var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var4_ref = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (jj.field_Y != ef.field_e) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                L2: {
                  var2_long = je.a(1);
                  if (0 == rh.field_i) {
                    break L2;
                  } else {
                    if (qg.field_a < 0) {
                      L3: {
                        var4_ref_sa = (sa) (Object) jl.field_h.a((byte) 51);
                        if (null == var4_ref_sa) {
                          break L3;
                        } else {
                          if (~var2_long >= ~var4_ref_sa.field_h) {
                            break L3;
                          } else {
                            var4_ref_sa.c(10);
                            te.field_O = var4_ref_sa.field_k.length;
                            te.field_N.field_m = 0;
                            var5_int = 0;
                            L4: while (true) {
                              if (var5_int >= te.field_O) {
                                nf.field_U = kl.field_b;
                                kl.field_b = jg.field_e;
                                jg.field_e = ob.field_h;
                                ob.field_h = var4_ref_sa.field_j;
                                stackOut_19_0 = 1;
                                stackIn_20_0 = stackOut_19_0;
                                return stackIn_20_0 != 0;
                              } else {
                                te.field_N.field_l[var5_int] = var4_ref_sa.field_k[var5_int];
                                var5_int++;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                      stackOut_23_0 = qg.field_a;
                      stackIn_26_0 = stackOut_23_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_21_0 = qg.field_a;
                stackIn_26_0 = stackOut_21_0;
                break L1;
              }
              L5: while (true) {
                L6: {
                  if (stackIn_26_0 >= 0) {
                    break L6;
                  } else {
                    te.field_N.field_m = 0;
                    if (bf.c(114, 1)) {
                      qg.field_a = te.field_N.l(27310);
                      te.field_N.field_m = 0;
                      te.field_O = param0[qg.field_a];
                      break L6;
                    } else {
                      return false;
                    }
                  }
                }
                if (!qd.b((byte) 127)) {
                  stackOut_33_0 = 0;
                  stackIn_34_0 = stackOut_33_0;
                  return stackIn_34_0 != 0;
                } else {
                  if (rh.field_i == 0) {
                    nf.field_U = kl.field_b;
                    kl.field_b = jg.field_e;
                    jg.field_e = ob.field_h;
                    ob.field_h = qg.field_a;
                    qg.field_a = -1;
                    stackOut_44_0 = 1;
                    stackIn_45_0 = stackOut_44_0;
                    break L0;
                  } else {
                    L7: {
                      var4 = rh.field_i;
                      if (hb.field_n == 0.0) {
                        break L7;
                      } else {
                        var4 = (int)((double)var4 + ib.field_i.nextGaussian() * hb.field_n);
                        if (0 <= var4) {
                          break L7;
                        } else {
                          var4 = 0;
                          break L7;
                        }
                      }
                    }
                    var5 = new sa(var2_long - -(long)var4, qg.field_a, new byte[te.field_O]);
                    var6 = 0;
                    L8: while (true) {
                      if (var6 >= te.field_O) {
                        jl.field_h.a((gg) (Object) var5, -7044);
                        qg.field_a = -1;
                        stackOut_25_0 = qg.field_a;
                        stackIn_26_0 = stackOut_25_0;
                        continue L5;
                      } else {
                        var5.field_k[var6] = te.field_N.field_l[var6];
                        var6++;
                        continue L8;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var2;
            stackOut_46_1 = new StringBuilder().append("lf.E(");
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L9;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L9;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + 44 + 122 + 41);
        }
        return stackIn_45_0 != 0;
    }

    public static void b(int param0) {
        field_a = null;
        field_f = null;
        field_e = null;
        field_b = null;
        field_d = null;
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
        fg stackIn_10_0 = null;
        fg stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        fg stackOut_4_0 = null;
        fg stackOut_12_0 = null;
        fg stackOut_9_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
                if (var5 >= var4.length) {
                  stackOut_12_0 = SolKnight.field_D;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  var6 = var4[var5];
                  if (!var6.a(-126, var3)) {
                    var5++;
                    continue L1;
                  } else {
                    stackOut_9_0 = (fg) var6;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("lf.F(").append(param0).append(44);
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L2;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_13_0;
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
