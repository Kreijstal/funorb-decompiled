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
        long var2 = 0L;
        rha var4_ref_rha = null;
        int var4 = 0;
        int var5_int = 0;
        rha var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        if (uga.field_n == km.field_p) {
          L0: {
            if (param1 == 0) {
              break L0;
            } else {
              field_e = null;
              break L0;
            }
          }
          L1: {
            var2 = bva.b((byte) -107);
            if (-1 == ga.field_H) {
              break L1;
            } else {
              if (-1 > gt.field_b) {
                var4_ref_rha = (rha) (Object) vn.field_a.f(-80);
                if (var4_ref_rha == null) {
                  break L1;
                } else {
                  if ((var2 ^ -1L) >= (var4_ref_rha.field_f ^ -1L)) {
                    break L1;
                  } else {
                    var4_ref_rha.p(115);
                    uca.field_d = var4_ref_rha.field_g.length;
                    vc.field_q.field_h = 0;
                    var5_int = 0;
                    L2: while (true) {
                      if (var5_int >= uca.field_d) {
                        vua.field_B = hla.field_xb;
                        hla.field_xb = ufa.field_c;
                        ufa.field_c = oka.field_z;
                        oka.field_z = var4_ref_rha.field_i;
                        return true;
                      } else {
                        vc.field_q.field_g[var5_int] = var4_ref_rha.field_g[var5_int];
                        var5_int++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
          }
          L3: while (true) {
            L4: {
              if (-1 >= (gt.field_b ^ -1)) {
                break L4;
              } else {
                vc.field_q.field_h = 0;
                if (!ama.a(1, -1)) {
                  return false;
                } else {
                  gt.field_b = vc.field_q.j(-83);
                  vc.field_q.field_h = 0;
                  uca.field_d = param0[gt.field_b];
                  break L4;
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
                return true;
              } else {
                L5: {
                  var4 = ga.field_H;
                  if (0.0 == al.field_h) {
                    break L5;
                  } else {
                    var4 = (int)((double)var4 + lpa.field_p.nextGaussian() * al.field_h);
                    if (-1 >= (var4 ^ -1)) {
                      break L5;
                    } else {
                      var4 = 0;
                      break L5;
                    }
                  }
                }
                var5 = new rha(var2 - -(long)var4, gt.field_b, new byte[uca.field_d]);
                var6 = 0;
                L6: while (true) {
                  if (var6 >= uca.field_d) {
                    vn.field_a.b((byte) -98, (vg) (Object) var5);
                    gt.field_b = -1;
                    continue L3;
                  } else {
                    var5.field_g[var6] = vc.field_q.field_g[var6];
                    var6++;
                    continue L6;
                  }
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        kd var12 = null;
        ae stackIn_3_0 = null;
        ae stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          if (param0 instanceof kd) {
            stackOut_2_0 = (ae) param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (ae) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (kd) (Object) stackIn_3_0;
          if (var12 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        bea.e(param1 + param0.field_i, param3 + param0.field_n, param0.field_m, param0.field_p, ((cj) this).field_f);
        var7 = -(var12.field_E * 2) + param0.field_m;
        var8 = param1 - -param0.field_i + var12.field_E;
        var9 = param0.field_n + param3 + var12.field_C;
        bea.a(var8, var9, var8 - -var7, var9, ((cj) this).field_a);
        if (param2 == 16777215) {
          var10 = var12.c(-3) - 1;
          L2: while (true) {
            if (0 > var10) {
              L3: {
                if (((cj) this).field_b == null) {
                  break L3;
                } else {
                  ((cj) this).field_b.a(var12.field_o, var7 / 2 + var8, var12.field_C + var9 - -((cj) this).field_b.field_m, ((cj) this).field_g, ((cj) this).field_h);
                  break L3;
                }
              }
              return;
            } else {
              bea.e(var12.a(var10, (byte) -14) * var7 / var12.b(24857) + var8, var9, ((cj) this).field_d, ((cj) this).field_c);
              var10--;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    cj(il param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((cj) this).field_f = param4;
        ((cj) this).field_d = param5;
        ((cj) this).field_c = param6;
        ((cj) this).field_b = param0;
        ((cj) this).field_g = param1;
        ((cj) this).field_h = param2;
        ((cj) this).field_a = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
