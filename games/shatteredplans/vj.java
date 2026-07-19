/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends qs {
    static pf field_E;
    private static int[] field_G;
    static int[] field_F;
    private static int[] field_A;
    static int field_C;
    private static int[] field_I;
    private static int[] field_H;
    static String field_B;

    final static void a(String param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (s.field_c != -1) {
                break L1;
              } else {
                if (0 != (cb.field_n ^ -1)) {
                  break L1;
                } else {
                  s.field_c = pd.field_k;
                  cb.field_n = bb.field_b;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                rq.field_e = rq.field_e + 1;
                if (param0 == null) {
                  if (jq.field_d != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (param0.equals(jq.field_d)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!sc.field_q) {
                  if (ri.field_F <= rq.field_e) {
                    if (rq.field_e < ri.field_F - -de.field_i) {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_16_0 = stackOut_13_0;
                      break L4;
                    }
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_16_0 = stackOut_11_0;
                    break L4;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_16_0 = stackOut_9_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_16_0;
                if (param0 == null) {
                  rq.field_e = 0;
                  break L5;
                } else {
                  if (sc.field_q) {
                    rq.field_e = ri.field_F;
                    break L5;
                  } else {
                    if (var2_int == 0) {
                      rq.field_e = 0;
                      break L5;
                    } else {
                      rq.field_e = ri.field_F;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (param0 != null) {
                  sc.field_q = false;
                  break L6;
                } else {
                  if (var2_int == 0) {
                    break L6;
                  } else {
                    sc.field_q = true;
                    break L6;
                  }
                }
              }
              rs.field_Fb = cb.field_n;
              ra.field_g = s.field_c;
              break L2;
            }
            L7: {
              jq.field_d = param0;
              if (sc.field_q) {
                break L7;
              } else {
                if (rq.field_e >= ri.field_F) {
                  break L7;
                } else {
                  if (r.field_d) {
                    rq.field_e = 0;
                    rs.field_Fb = cb.field_n;
                    ra.field_g = s.field_c;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L8: {
              s.field_c = -1;
              if (param1 == 0) {
                break L8;
              } else {
                field_F = (int[]) null;
                break L8;
              }
            }
            L9: {
              cb.field_n = -1;
              if (!sc.field_q) {
                break L9;
              } else {
                if (rq.field_e != t.field_f) {
                  break L9;
                } else {
                  sc.field_q = false;
                  rq.field_e = 0;
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var2);
            stackOut_40_1 = new StringBuilder().append("vj.A(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L10;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L10;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param1 + ')');
        }
    }

    final static String g(byte param0) {
        if (!(-3 >= (ma.field_p ^ -1))) {
            return de.field_h;
        }
        if (es.field_j != null) {
            if (!(es.field_j.b((byte) 107))) {
                return i.field_a;
            }
            return ns.field_xb;
        }
        if (!(rq.field_g.b((byte) 13))) {
            return fa.field_J;
        }
        if (!(rq.field_g.a("commonui", 77))) {
            return ii.field_r + " - " + rq.field_g.a("commonui", (byte) 65) + "%";
        }
        if (!(tq.field_f.b((byte) -69))) {
            return rq.field_h;
        }
        if (!tq.field_f.a("commonui", -91)) {
            return on.field_h + " - " + tq.field_f.a("commonui", (byte) 28) + "%";
        }
        int var1 = 32 % ((param0 - 15) / 52);
        if (!(l.field_g.b((byte) -2))) {
            return ed.field_e;
        }
        if (!(l.field_g.a(-1))) {
            return jh.field_v + " - " + l.field_g.d(100) + "%";
        }
        return ea.field_d;
    }

    public static void f(byte param0) {
        String discarded$2 = null;
        field_F = null;
        field_I = null;
        field_G = null;
        if (param0 != 111) {
          discarded$2 = vj.i(-3);
          field_E = null;
          field_B = null;
          field_A = null;
          field_H = null;
          return;
        } else {
          field_E = null;
          field_B = null;
          field_A = null;
          field_H = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        RuntimeException var7 = null;
        fr var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            super.a(param0, param1, param2, param3, param4 + 0, param5);
            var8 = oa.field_b;
            if (param4 == -600269855) {
              L1: {
                if (var8 == null) {
                  break L1;
                } else {
                  if (!this.a(param0, 87, param3, param1, param2)) {
                    break L1;
                  } else {
                    if (!(this.field_u instanceof lf)) {
                      if (!(var8.field_u instanceof lf)) {
                        break L1;
                      } else {
                        ((lf) ((Object) var8.field_u)).a(param4 ^ 600248316, (vj) (this), var8);
                        oa.field_b = null;
                        return;
                      }
                    } else {
                      ((lf) ((Object) this.field_u)).a(-27619, (vj) (this), var8);
                      oa.field_b = null;
                      return;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var7);
            stackOut_9_1 = new StringBuilder().append("vj.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param5 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private vj(int param0, int param1, int param2, int param3, iq param4, ko param5, vg param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_z = param6;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "vj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static String i(int param0) {
        if (param0 >= -90) {
            field_B = (String) null;
            if (!(ue.field_a != ee.field_l)) {
                return aa.field_G;
            }
            return oj.field_Ib;
        }
        if (!(ue.field_a != ee.field_l)) {
            return aa.field_G;
        }
        return oj.field_Ib;
    }

    static {
        int var0 = 0;
        field_E = new pf();
        field_F = new int[256];
        field_G = new int[256];
        field_I = new int[256];
        field_H = new int[256];
        field_A = new int[256];
        field_B = "Diplomacy";
        for (var0 = 0; 256 > var0; var0++) {
            field_F[var0] = 65793 * var0;
            field_A[var0] = 65793 * (var0 >> 140729538);
            field_I[var0] = var0 * 65536;
            field_G[var0] = ee.a(we.a(var0, -1912602370) << 242378823, var0);
            field_H[var0] = (var0 >> -107959071) * 65537;
        }
    }
}
