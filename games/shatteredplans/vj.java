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
        int stackIn_16_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
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
                      stackIn_16_0 = 1;
                      break L4;
                    } else {
                      stackIn_16_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_16_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_16_0 = 0;
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
            stackIn_42_0 = (RuntimeException) (var2);

            stackIn_42_1 = new StringBuilder().append("vj.A(");

            if (param0 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L10;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
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
        field_F = null;
        field_I = null;
        field_G = null;
        if (param0 != 111) {
          vj.i(-3);
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
        super.a(param0, param1, param2, param3, param4 + 0, param5);
        fr var8 = oa.field_b;
        if (param4 != -600269855) {
            return;
        }
        try {
            if (var8 != null && this.a(param0, 87, param3, param1, param2)) {
                if (this.field_u instanceof lf) {
                    ((lf) ((Object) this.field_u)).a(-27619, (vj) (this), var8);
                    oa.field_b = null;
                    return;
                }
                if (var8.field_u instanceof lf) {
                    ((lf) ((Object) var8.field_u)).a(param4 ^ 600248316, (vj) (this), var8);
                    oa.field_b = null;
                    return;
                }
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "vj.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
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
