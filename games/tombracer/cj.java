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
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        rha var4_ref_rha = null;
        int var4 = 0;
        int var5_int = 0;
        rha var5 = null;
        int var6 = 0;
        int var7 = 0;
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
                var2_long = bva.b((byte) -107);
                if (-1 == (ga.field_H ^ -1)) {
                  break L2;
                } else {
                  if (-1 < (gt.field_b ^ -1)) {
                    var4_ref_rha = (rha) ((Object) vn.field_a.f(-80));
                    if (var4_ref_rha == null) {
                      break L2;
                    } else {
                      if ((var2_long ^ -1L) >= (var4_ref_rha.field_f ^ -1L)) {
                        break L2;
                      } else {
                        var4_ref_rha.p(115);
                        uca.field_d = var4_ref_rha.field_g.length;
                        vc.field_q.field_h = 0;
                        var5_int = 0;
                        L3: while (true) {
                          if (var5_int >= uca.field_d) {
                            vua.field_B = hla.field_xb;
                            hla.field_xb = ufa.field_c;
                            ufa.field_c = oka.field_z;
                            oka.field_z = var4_ref_rha.field_i;
                            stackIn_15_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            vc.field_q.field_g[var5_int] = var4_ref_rha.field_g[var5_int];
                            var5_int++;
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L4: while (true) {
                L5: {
                  if (-1 >= (gt.field_b ^ -1)) {
                    break L5;
                  } else {
                    vc.field_q.field_h = 0;
                    if (!ama.a(1, -1)) {
                      stackIn_21_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      gt.field_b = vc.field_q.j(-83);
                      vc.field_q.field_h = 0;
                      uca.field_d = param0[gt.field_b];
                      break L5;
                    }
                  }
                }
                if (cla.g(param1 + 0)) {
                  if (0 == ga.field_H) {
                    vua.field_B = hla.field_xb;
                    hla.field_xb = ufa.field_c;
                    ufa.field_c = oka.field_z;
                    oka.field_z = gt.field_b;
                    gt.field_b = -1;
                    stackIn_35_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    L6: {
                      var4 = ga.field_H;
                      if (0.0 == al.field_h) {
                        break L6;
                      } else {
                        var4 = (int)((double)var4 + lpa.field_p.nextGaussian() * al.field_h);
                        if (-1 >= (var4 ^ -1)) {
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
                      if (var6 >= uca.field_d) {
                        vn.field_a.b((byte) -98, var5);
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
                  stackIn_25_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var2);

            stackIn_38_1 = new StringBuilder().append("cj.A(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L8;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0 != 0;
              } else {
                return stackIn_35_0 != 0;
              }
            }
          }
        }
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        ae stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        kd var12 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 instanceof kd) {
                stackIn_4_0 = (ae) (param0);
                break L1;
              } else {
                stackIn_4_0 = null;
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
                if (0 > var10) {
                  L4: {
                    if (this.field_b == null) {
                      break L4;
                    } else {
                      this.field_b.a(var12.field_o, var7 / 2 + var8, var12.field_C + var9 - -this.field_b.field_m, this.field_g, this.field_h);
                      break L4;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  bea.e(var12.a(var10, (byte) -14) * var7 / var12.b(24857) + var8, var9, this.field_d, this.field_c);
                  var10--;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("cj.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
