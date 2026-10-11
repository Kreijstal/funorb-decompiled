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
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (s.field_c == -1 &&
            cb.field_n == -1) {
            s.field_c = pd.field_k;
            cb.field_n = bb.field_b;
          }
          boolean decompiledFrameRemainder0 = true;
          rq.field_e = rq.field_e + 1;
          if (param0 == null) {
            decompiledFrameRemainder0 = (jq.field_d == null);
          } else {
            decompiledFrameRemainder0 = !(param0.equals(jq.field_d));
          }
          if (decompiledFrameRemainder0) {
            if (!sc.field_q) {
              if (ri.field_F <= rq.field_e) {
                stackIn_16_0 = (rq.field_e < ri.field_F + de.field_i) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 0;
            }
            var2_int = stackIn_16_0;
            if (param0 == null) {
              rq.field_e = 0;
            } else {
              if (sc.field_q) {
                rq.field_e = ri.field_F;
              } else {
                if (var2_int == 0) {
                  rq.field_e = 0;
                } else {
                  rq.field_e = ri.field_F;
                }
              }
            }
            if (param0 != null) {
              sc.field_q = false;
            } else {
              if (var2_int != 0) {
                sc.field_q = true;
              }
            }
            rs.field_Fb = cb.field_n;
            ra.field_g = s.field_c;
          }
          jq.field_d = param0;
          if (!sc.field_q &&
            rq.field_e < ri.field_F &&
            r.field_d) {
            rq.field_e = 0;
            rs.field_Fb = cb.field_n;
            ra.field_g = s.field_c;
          }
          s.field_c = -1;
          if (param1 != 0) {
            field_F = (int[]) null;
          }
          cb.field_n = -1;
          if (sc.field_q &&
            rq.field_e == t.field_f) {
            sc.field_q = false;
            rq.field_e = 0;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("vj.A(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String g(byte param0) {
        if (!(ma.field_p >= 2)) {
          return de.field_h;
        }
        if (es.field_j != null) {
          if (!es.field_j.b((byte) 107)) {
            return i.field_a;
          }
          return ns.field_xb;
        }
        if (!rq.field_g.b((byte) 13)) {
          return fa.field_J;
        }
        if (!rq.field_g.a("commonui", 77)) {
          return ii.field_r + " - " + rq.field_g.a("commonui", (byte) 65) + "%";
        }
        if (!tq.field_f.b((byte) -69)) {
          return rq.field_h;
        }
        if (!tq.field_f.a("commonui", -91)) {
          return on.field_h + " - " + tq.field_f.a("commonui", (byte) 28) + "%";
        }
        int var1 = 32 % ((param0 - 15) / 52);
        if (!l.field_g.b((byte) -2)) {
          return ed.field_e;
        }
        if (!l.field_g.a(-1)) {
          return jh.field_v + " - " + l.field_g.d(100) + "%";
        }
        return ea.field_d;
    }

    public static void f(byte param0) {
        field_F = null;
        field_I = null;
        field_G = null;
        if (param0 == 111) {
          field_E = null;
          field_B = null;
          field_A = null;
          field_H = null;
          return;
        }
        vj.i(-3);
        field_E = null;
        field_B = null;
        field_A = null;
        field_H = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        super.a(param0, param1, param2, param3, param4 + 0, param5);
        fr var8 = oa.field_b;
        if (param4 != -600269855) {
          return;
        }
        try {
          if (var8 != null &&
            this.a(param0, 87, param3, param1, param2)) {
            if (this.field_u instanceof lf) {
              ((lf) (this.field_u)).a(-27619, this, var8);
              oa.field_b = null;
              return;
            }
            if (var8.field_u instanceof lf) {
              ((lf) (var8.field_u)).a(param4 ^ 600248316, this, var8);
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
          if (ue.field_a == ee.field_l) {
            return aa.field_G;
          }
          return oj.field_Ib;
        }
        if (ue.field_a == ee.field_l) {
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
          field_A[var0] = 65793 * (var0 >> 2);
          field_I[var0] = var0 * 65536;
          field_G[var0] = ee.a(we.a(var0, -1912602370) << 7, var0);
          field_H[var0] = (var0 >> 1) * 65537;
        }
    }
}
