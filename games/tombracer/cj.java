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
        if (param0 <= 22) {
            return;
        }
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
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_24_0 = false;
        int stackIn_27_0 = 0;
        boolean stackIn_30_0 = false;
        int stackIn_32_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        boolean stackOut_23_0 = false;
        int stackOut_26_0 = 0;
        boolean stackOut_29_0 = false;
        int stackOut_21_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (uga.field_n == km.field_p) {
              L1: {
                if (param1 == 0) {
                  break L1;
                } else {
                  field_e = (String) null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var2_long = bva.b((byte) -107);
                  if (-1 == (ga.field_H ^ -1)) {
                    break L3;
                  } else {
                    if (-1 < (gt.field_b ^ -1)) {
                      L4: {
                        var4_ref_rha = (rha) ((Object) vn.field_a.f(-80));
                        if (var4_ref_rha == null) {
                          break L4;
                        } else {
                          if ((var2_long ^ -1L) >= (var4_ref_rha.field_f ^ -1L)) {
                            break L4;
                          } else {
                            var4_ref_rha.p(115);
                            uca.field_d = var4_ref_rha.field_g.length;
                            vc.field_q.field_h = 0;
                            var5_int = 0;
                            L5: while (true) {
                              L6: {
                                L7: {
                                  if (var5_int >= uca.field_d) {
                                    break L7;
                                  } else {
                                    vc.field_q.field_g[var5_int] = var4_ref_rha.field_g[var5_int];
                                    var5_int++;
                                    if (var7 != 0) {
                                      break L6;
                                    } else {
                                      if (var7 == 0) {
                                        continue L5;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                vua.field_B = hla.field_xb;
                                hla.field_xb = ufa.field_c;
                                ufa.field_c = oka.field_z;
                                oka.field_z = var4_ref_rha.field_i;
                                break L6;
                              }
                              stackOut_17_0 = 1;
                              stackIn_18_0 = stackOut_17_0;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                          }
                        }
                      }
                      stackOut_20_0 = -1;
                      stackIn_22_0 = stackOut_20_0;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_19_0 = -1;
                stackIn_22_0 = stackOut_19_0;
                break L2;
              }
              L8: while (true) {
                L9: {
                  L10: {
                    if (stackIn_22_0 >= (gt.field_b ^ -1)) {
                      break L10;
                    } else {
                      vc.field_q.field_h = 0;
                      stackOut_23_0 = ama.a(1, -1);
                      stackIn_30_0 = stackOut_23_0;
                      stackIn_24_0 = stackOut_23_0;
                      if (var7 != 0) {
                        break L9;
                      } else {
                        if (!stackIn_24_0) {
                          stackOut_26_0 = 0;
                          stackIn_27_0 = stackOut_26_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          gt.field_b = vc.field_q.j(-83);
                          vc.field_q.field_h = 0;
                          uca.field_d = param0[gt.field_b];
                          break L10;
                        }
                      }
                    }
                  }
                  stackOut_29_0 = cla.g(param1 + 0);
                  stackIn_30_0 = stackOut_29_0;
                  break L9;
                }
                if (stackIn_30_0) {
                  L11: {
                    if (0 == ga.field_H) {
                      break L11;
                    } else {
                      L12: {
                        var4 = ga.field_H;
                        if (0.0 == al.field_h) {
                          break L12;
                        } else {
                          var4 = (int)((double)var4 + lpa.field_p.nextGaussian() * al.field_h);
                          if (-1 >= (var4 ^ -1)) {
                            break L12;
                          } else {
                            var4 = 0;
                            break L12;
                          }
                        }
                      }
                      var5 = new rha(var2_long - -(long)var4, gt.field_b, new byte[uca.field_d]);
                      var6 = 0;
                      L13: while (true) {
                        L14: {
                          L15: {
                            if (var6 >= uca.field_d) {
                              break L15;
                            } else {
                              var5.field_g[var6] = vc.field_q.field_g[var6];
                              var6++;
                              if (var7 != 0) {
                                break L14;
                              } else {
                                if (var7 == 0) {
                                  continue L13;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                          vn.field_a.b((byte) -98, var5);
                          gt.field_b = -1;
                          break L14;
                        }
                        if (var7 == 0) {
                          stackOut_21_0 = -1;
                          stackIn_22_0 = stackOut_21_0;
                          continue L8;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  vua.field_B = hla.field_xb;
                  hla.field_xb = ufa.field_c;
                  ufa.field_c = oka.field_z;
                  oka.field_z = gt.field_b;
                  gt.field_b = -1;
                  stackOut_44_0 = 1;
                  stackIn_45_0 = stackOut_44_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  stackOut_31_0 = 0;
                  stackIn_32_0 = stackOut_31_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var2 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) (var2);
            stackOut_46_1 = new StringBuilder().append("cj.A(");
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L16;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L16;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_27_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_32_0 != 0;
              } else {
                return stackIn_45_0 != 0;
              }
            }
          }
        }
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 instanceof kd) {
                stackOut_3_0 = (ae) (param0);
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (ae) ((Object) stackOut_2_0);
                break L1;
              }
            }
            L2: {
              var12 = (kd) ((Object) stackIn_4_0);
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            bea.e(param1 + param0.field_i, param3 + param0.field_n, param0.field_m, param0.field_p, this.field_f);
            var7 = -(var12.field_E * 2) + param0.field_m;
            var8 = param1 - -param0.field_i + var12.field_E;
            var9 = param0.field_n + param3 + var12.field_C;
            bea.a(var8, var9, var8 - -var7, var9, this.field_a);
            if (param2 == 16777215) {
              var10 = var12.c(-3) - 1;
              L3: while (true) {
                L4: {
                  L5: {
                    if (0 > var10) {
                      break L5;
                    } else {
                      bea.e(var12.a(var10, (byte) -14) * var7 / var12.b(24857) + var8, var9, this.field_d, this.field_c);
                      var10--;
                      if (var11 != 0) {
                        break L4;
                      } else {
                        if (var11 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (this.field_b == null) {
                    break L4;
                  } else {
                    this.field_b.a(var12.field_o, var7 / 2 + var8, var12.field_C + var9 - -this.field_b.field_m, this.field_g, this.field_h);
                    return;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var6);
            stackOut_15_1 = new StringBuilder().append("cj.B(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    cj(il param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_f = param4;
            this.field_d = param5;
            this.field_c = param6;
            this.field_b = param0;
            this.field_g = param1;
            this.field_h = param2;
            this.field_a = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_e = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
