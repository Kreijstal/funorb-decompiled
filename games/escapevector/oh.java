/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends hg {
    int field_l;
    static String field_p;
    int field_r;
    int field_s;
    static String field_g;
    int field_q;
    int field_i;
    int field_h;
    static ee field_n;
    int field_o;
    int field_m;
    static String field_k;
    int field_j;

    final static void a(vj param0, boolean param1, int param2, boolean param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        rh.field_O[0] = gk.field_a.nextInt();
        rh.field_O[1] = gk.field_a.nextInt();
        qj.field_a.field_m = 0;
        rh.field_O[2] = (int)(va.field_b >> -714347936);
        rh.field_O[3] = (int)va.field_b;
        qj.field_a.a((byte) 126, rh.field_O[0]);
        qj.field_a.a((byte) 123, rh.field_O[1]);
        qj.field_a.a((byte) 124, rh.field_O[2]);
        qj.field_a.a((byte) 126, rh.field_O[3]);
        jm.a(0, qj.field_a);
        qj.field_a.h(13, param2);
        param0.a(qj.field_a, (byte) -121);
        om.field_c.field_m = 0;
        if (!param1) {
          L0: {
            om.field_c.f(16, -123);
            om.field_c.field_m = om.field_c.field_m + 2;
            var5 = om.field_c.field_m;
            om.field_c.a((byte) 123, jm.field_L);
            om.field_c.a(ck.field_q, (byte) -23);
            var6 = 0;
            if (!ej.field_d) {
              break L0;
            } else {
              var6 = var6 | 1;
              break L0;
            }
          }
          L1: {
            if (!jc.field_b) {
              break L1;
            } else {
              var6 = var6 | 4;
              break L1;
            }
          }
          L2: {
            if (param3) {
              var6 = var6 | 8;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (null == p.field_i) {
              break L3;
            } else {
              var6 = var6 | 16;
              break L3;
            }
          }
          L4: {
            om.field_c.f(var6, param4 + -24);
            var7 = tf.a(param4 ^ 98, oc.d((byte) -120));
            if (var7 == null) {
              var7 = "";
              break L4;
            } else {
              break L4;
            }
          }
          om.field_c.a(var7, 101);
          if (param4 != -99) {
            return;
          } else {
            L5: {
              if (p.field_i != null) {
                om.field_c.a((byte) 100, p.field_i);
                break L5;
              } else {
                break L5;
              }
            }
            bn.a(param4 ^ -99, (n) (Object) om.field_c, qj.field_a, q.field_O, cf.field_c);
            om.field_c.i(-var5 + om.field_c.field_m, 32614);
            rn.a(-1, param4 + 30884);
            return;
          }
        } else {
          L6: {
            om.field_c.f(18, -123);
            om.field_c.field_m = om.field_c.field_m + 2;
            var5 = om.field_c.field_m;
            om.field_c.a((byte) 123, jm.field_L);
            om.field_c.a(ck.field_q, (byte) -23);
            var6 = 0;
            if (!ej.field_d) {
              break L6;
            } else {
              var6 = var6 | 1;
              break L6;
            }
          }
          L7: {
            if (!jc.field_b) {
              break L7;
            } else {
              var6 = var6 | 4;
              break L7;
            }
          }
          L8: {
            if (param3) {
              var6 = var6 | 8;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (null == p.field_i) {
              break L9;
            } else {
              var6 = var6 | 16;
              break L9;
            }
          }
          L10: {
            om.field_c.f(var6, param4 + -24);
            var7 = tf.a(param4 ^ 98, oc.d((byte) -120));
            if (var7 == null) {
              var7 = "";
              break L10;
            } else {
              break L10;
            }
          }
          om.field_c.a(var7, 101);
          if (param4 != -99) {
            return;
          } else {
            L11: {
              if (p.field_i != null) {
                om.field_c.a((byte) 100, p.field_i);
                break L11;
              } else {
                break L11;
              }
            }
            bn.a(param4 ^ -99, (n) (Object) om.field_c, qj.field_a, q.field_O, cf.field_c);
            om.field_c.i(-var5 + om.field_c.field_m, 32614);
            rn.a(-1, param4 + 30884);
            return;
          }
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 != -20) {
          var2 = null;
          oh.a((vj) null, true, 101, true, (byte) -46);
          field_p = null;
          field_k = null;
          field_n = null;
          field_g = null;
          return;
        } else {
          field_p = null;
          field_k = null;
          field_n = null;
          field_g = null;
          return;
        }
    }

    oh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Extra thrust";
        field_n = new ee("usename");
        field_k = " - activate shield";
    }
}
