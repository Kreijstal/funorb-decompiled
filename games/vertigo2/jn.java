/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static String field_d;
    static fi field_g;
    private lo field_e;
    private r field_f;
    private r field_a;
    static int field_c;
    static er[] field_b;

    final q a(int param0, int param1) {
        q var3 = null;
        q var3_ref = null;
        byte[] var4 = null;
        var3 = (q) ((jn) this).field_e.b((long)param1, (byte) 74);
        if (var3 == null) {
          L0: {
            if (32768 <= param1) {
              var4 = ((jn) this).field_a.a(1, param1 & 32767, (byte) -93);
              break L0;
            } else {
              var4 = ((jn) this).field_f.a(1, param1, (byte) -22);
              break L0;
            }
          }
          var3_ref = new q();
          if (param0 != 1) {
            L1: {
              q discarded$1 = ((jn) this).a(65, -27);
              if (var4 != null) {
                var3_ref.a(new ed(var4), -88);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (32768 <= param1) {
                var3_ref.a((byte) 93);
                break L2;
              } else {
                break L2;
              }
            }
            ((jn) this).field_e.a((long)param1, (Object) (Object) var3_ref, (byte) -86);
            return var3_ref;
          } else {
            L3: {
              if (var4 != null) {
                var3_ref.a(new ed(var4), -88);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (32768 <= param1) {
                var3_ref.a((byte) 93);
                break L4;
              } else {
                break L4;
              }
            }
            ((jn) this).field_e.a((long)param1, (Object) (Object) var3_ref, (byte) -86);
            return var3_ref;
          }
        } else {
          return var3;
        }
    }

    final static void a(li param0, li param1, int param2) {
        if (param2 == 18724) {
          if (param0.field_a != null) {
            param0.c(2);
            param0.field_c = param1;
            param0.field_a = param1.field_a;
            param0.field_a.field_c = param0;
            param0.field_c.field_a = param0;
            return;
          } else {
            param0.field_c = param1;
            param0.field_a = param1.field_a;
            param0.field_a.field_c = param0;
            param0.field_c.field_a = param0;
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0) {
        ga.a(nl.field_e, param0, param0 ^ 82);
        ga.a(nq.field_G, 6, 86);
        ga.a(ir.field_e, 8, param0 ^ 126);
        ga.a(aa.field_Jb, 13, 80);
        if (!mm.b(-12942)) {
            ga.a(po.field_c, 18, 127);
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_b = null;
        field_d = null;
        if (param0 < 37) {
            field_d = null;
        }
    }

    jn(int param0, r param1, r param2, jh param3) {
        ((jn) this).field_e = new lo(64);
        ((jn) this).field_f = param1;
        ((jn) this).field_a = param2;
        if (((jn) this).field_f != null) {
            int discarded$0 = ((jn) this).field_f.b(1, (byte) -99);
        }
        if (((jn) this).field_a != null) {
            int discarded$1 = ((jn) this).field_a.b(1, (byte) -29);
        }
    }

    final static void a(int param0, int param1, java.awt.Component param2, int param3, boolean param4, int param5, db param6, jj param7) {
        dd.a(param0, param4, 10);
        ri.field_r = dd.a(param7, param2, 0, param3);
        mh.field_d = dd.a(param7, param2, 1, param1);
        il.field_g = new fp();
        wp.field_a = param1 * 1000 / param0;
        mh.field_d.a((sn) (Object) il.field_g);
        qc.field_v = param6;
        qc.field_v.c(-82, nd.field_k);
        if (param5 != 18246) {
            field_c = 51;
        } else {
            ri.field_r.a((sn) (Object) qc.field_v);
            return;
        }
        ri.field_r.a((sn) (Object) qc.field_v);
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != -4765) {
            return;
        }
        or.field_c = param0;
        ek.field_E = param2;
    }

    final static void a(int[] param0, int param1, fb param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        param6 = param6 - param0[0];
        param3 = param3 - param0[1];
        param1 = param1 - param0[2];
        var9 = param1 * param0[11] + (param3 * param0[param7] + param0[9] * param6) >> -520546743;
        if (-6401 > (var9 ^ -1)) {
          var10 = (param8 << -2087932880) / var9;
          var11 = (param5 << -2106350256) / var9;
          var12 = -(var10 >> 104451425) + ((param0[5] * param1 + param3 * param0[4] + param0[3] * param6) / var9 + bi.field_d - -oo.field_l);
          var13 = oo.field_e + bi.field_f + (param6 * param0[6] - -(param3 * param0[7]) + param1 * param0[8]) / var9 + -(var11 >> 308374017);
          if (-257 == (param4 ^ -1)) {
            param2.a(var12, var13, var10, var11);
            return;
          } else {
            param2.a(var12, var13, var10, var11, param4);
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Names should contain a maximum of 12 characters";
        field_c = 1;
    }
}
