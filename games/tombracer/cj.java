/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj implements isa {
    private int field_a;
    private int field_d;
    static String field_e;
    private int field_f;
    private int field_h;
    private il field_b;
    private int field_c;
    private int field_g;

    public static void a(int param0) {
        field_e = null;
    }

    final static boolean a(int[] param0, int param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        rha var4_ref_rha = null;
        int var4 = 0;
        int var5_int = 0;
        rha var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (uga.field_n == km.field_p) {
              L1: {
                field_e = null;
                var2_long = bva.b((byte) -107);
                if (ga.field_H == 0) {
                  break L1;
                } else {
                  if (gt.field_b < 0) {
                    L2: {
                      var4_ref_rha = (rha) (Object) vn.field_a.f(-80);
                      if (var4_ref_rha == null) {
                        break L2;
                      } else {
                        if (~var2_long >= ~var4_ref_rha.field_f) {
                          break L2;
                        } else {
                          var4_ref_rha.p(115);
                          uca.field_d = var4_ref_rha.field_g.length;
                          vc.field_q.field_h = 0;
                          var5_int = 0;
                          L3: while (true) {
                            if (~var5_int <= ~uca.field_d) {
                              vua.field_B = hla.field_xb;
                              hla.field_xb = ufa.field_c;
                              ufa.field_c = oka.field_z;
                              oka.field_z = var4_ref_rha.field_i;
                              stackOut_12_0 = 1;
                              stackIn_13_0 = stackOut_12_0;
                              return stackIn_13_0 != 0;
                            } else {
                              vc.field_q.field_g[var5_int] = var4_ref_rha.field_g[var5_int];
                              var5_int++;
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L4: while (true) {
                L5: {
                  if (gt.field_b >= 0) {
                    break L5;
                  } else {
                    vc.field_q.field_h = 0;
                    if (!ama.a(1, -1)) {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0 != 0;
                    } else {
                      gt.field_b = vc.field_q.j(-83);
                      vc.field_q.field_h = 0;
                      uca.field_d = param0[gt.field_b];
                      break L5;
                    }
                  }
                }
                if (cla.g(0)) {
                  if (0 == ga.field_H) {
                    vua.field_B = hla.field_xb;
                    hla.field_xb = ufa.field_c;
                    ufa.field_c = oka.field_z;
                    oka.field_z = gt.field_b;
                    gt.field_b = -1;
                    stackOut_32_0 = 1;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    L6: {
                      var4 = ga.field_H;
                      if (0.0 == al.field_h) {
                        break L6;
                      } else {
                        var4 = (int)((double)var4 + lpa.field_p.nextGaussian() * al.field_h);
                        if (var4 >= 0) {
                          break L6;
                        } else {
                          var4 = 0;
                          break L6;
                        }
                      }
                    }
                    var5 = new rha(var2_long - -(long)var4, gt.field_b, new byte[uca.field_d]);
                    var6 = 0;
                    L7: while (true) {
                      if (~var6 <= ~uca.field_d) {
                        vn.field_a.b((byte) -98, (vg) (Object) var5);
                        gt.field_b = -1;
                        continue L4;
                      } else {
                        var5.field_g[var6] = vc.field_q.field_g[var6];
                        var6++;
                        continue L7;
                      }
                    }
                  }
                } else {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var2;
            stackOut_34_1 = new StringBuilder().append("cj.A(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L8;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + 0 + ')');
        }
        return stackIn_33_0 != 0;
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        kd var12 = null;
        ae stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 instanceof kd) {
                stackOut_3_0 = (ae) param0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (ae) (Object) stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (kd) (Object) stackIn_4_0;
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            bea.e(param1 + param0.field_i, param3 + param0.field_n, param0.field_m, param0.field_p, ((cj) this).field_f);
            var7 = -(var12.field_E * 2) + param0.field_m;
            var8 = param1 - -param0.field_i + var12.field_E;
            var9 = param0.field_n + param3 + var12.field_C;
            bea.a(var8, var9, var8 - -var7, var9, ((cj) this).field_a);
            if (param2 == 16777215) {
              var10 = var12.c(-3) - 1;
              L3: while (true) {
                if (0 > var10) {
                  L4: {
                    if (((cj) this).field_b == null) {
                      break L4;
                    } else {
                      ((cj) this).field_b.a(var12.field_o, var7 / 2 + var8, var12.field_C + var9 - -((cj) this).field_b.field_m, ((cj) this).field_g, ((cj) this).field_h);
                      break L4;
                    }
                  }
                  break L0;
                } else {
                  bea.e(var12.a(var10, (byte) -14) * var7 / var12.b(24857) + var8, var9, ((cj) this).field_d, ((cj) this).field_c);
                  var10--;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("cj.B(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    cj(il param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((cj) this).field_f = param4;
            ((cj) this).field_d = param5;
            ((cj) this).field_c = param6;
            ((cj) this).field_b = param0;
            ((cj) this).field_g = param1;
            ((cj) this).field_h = param2;
            ((cj) this).field_a = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
