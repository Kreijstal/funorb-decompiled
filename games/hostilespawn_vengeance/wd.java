/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static gb field_a;
    static bd field_b;

    public static void a(byte param0) {
        if (param0 != 69) {
            field_b = (bd) null;
        }
        field_a = null;
        field_b = null;
    }

    final static boolean a(int param0, int[] param1) {
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        ei var4_ref_ei = null;
        int var4 = 0;
        int var5_int = 0;
        ei var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (ci.field_d != rc.field_a) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2_long = hn.a((byte) 80);
                if (-1 == (bl.field_b ^ -1)) {
                  break L1;
                } else {
                  if ((tc.field_a ^ -1) <= -1) {
                    break L1;
                  } else {
                    var4_ref_ei = (ei) ((Object) ck.field_u.g(-69));
                    if (var4_ref_ei == null) {
                      break L1;
                    } else {
                      if ((var4_ref_ei.field_j ^ -1L) > (var2_long ^ -1L)) {
                        var4_ref_ei.b(-115);
                        jd.field_q = var4_ref_ei.field_r.length;
                        sc.field_g.field_i = 0;
                        var5_int = 0;
                        L2: while (true) {
                          if (var5_int >= jd.field_q) {
                            bj.field_f = ae.field_u;
                            ae.field_u = ne.field_o;
                            ne.field_o = wa.field_k;
                            wa.field_k = var4_ref_ei.field_s;
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            sc.field_g.field_n[var5_int] = var4_ref_ei.field_r[var5_int];
                            var5_int++;
                            continue L2;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              if (param0 == 23278) {
                L3: while (true) {
                  L4: {
                    if (-1 < (tc.field_a ^ -1)) {
                      sc.field_g.field_i = 0;
                      if (re.c((byte) 33, 1)) {
                        tc.field_a = sc.field_g.p(param0 + -23214);
                        sc.field_g.field_i = 0;
                        jd.field_q = param1[tc.field_a];
                        break L4;
                      } else {
                        stackIn_22_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (eb.a(13372)) {
                    if (-1 == (bl.field_b ^ -1)) {
                      bj.field_f = ae.field_u;
                      ae.field_u = ne.field_o;
                      ne.field_o = wa.field_k;
                      wa.field_k = tc.field_a;
                      tc.field_a = -1;
                      stackIn_37_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      L5: {
                        var4 = bl.field_b;
                        if (sb.field_a == 0.0) {
                          break L5;
                        } else {
                          var4 = (int)((double)var4 + jk.field_b.nextGaussian() * sb.field_a);
                          if (0 > var4) {
                            var4 = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var5 = new ei(var2_long + (long)var4, tc.field_a, new byte[jd.field_q]);
                      var6 = 0;
                      L6: while (true) {
                        if (jd.field_q <= var6) {
                          ck.field_u.a(var5, 111);
                          tc.field_a = -1;
                          continue L3;
                        } else {
                          var5.field_r[var6] = sc.field_g.field_n[var6];
                          var6++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    stackIn_26_0 = 0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              } else {
                stackIn_17_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var2);

            stackIn_40_1 = new StringBuilder().append("wd.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L7;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L7;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_26_0 != 0;
                } else {
                  return stackIn_37_0 != 0;
                }
              }
            }
          }
        }
    }

    static {
    }
}
