/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static String field_b;
    static int[] field_a;
    static int[] field_c;

    final static void a(byte param0, int param1) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        f var4 = (f) (Object) cm.field_l.b(12623);
        while (var4 != null) {
            pb.a(32, param1, var4);
            var4 = (f) (Object) cm.field_l.a(0);
        }
        if (param0 != -64) {
            field_c = null;
        }
        pg var2 = hn.field_q.b(12623);
        while (var2 != null) {
            ik.a(param1, 0);
            var2 = hn.field_q.a(0);
        }
    }

    final static void a(String param0, boolean param1, int param2) {
        u.field_k = true;
        di.field_h = param1 ? true : false;
        vf.field_k = new ed(p.field_b, go.field_k, param0, hk.field_s, di.field_h);
        if (param2 != -1) {
            return;
        }
        p.field_b.b((qm) (Object) vf.field_k, 15637);
    }

    final static void a(int param0, kc param1, int param2, kc param3, byte[] param4, kc param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        qf.field_a = -1L;
        sa.field_Db = param9;
        in.field_Nb = param4;
        vf.field_l = param4.length;
        wi.field_f = null;
        om.field_x = null;
        gh.field_E = new byte[(7 + sa.field_Db) / 8];
        dn.field_Db = false;
        var10 = 0;
        var11 = 0;
        L0: while (true) {
          if (var11 >= in.field_Nb.length) {
            L1: {
              var10 = (var10 - -7) / 8;
              ng.field_D = new byte[var10];
              if (param1.field_G != null) {
                break L1;
              } else {
                param1.field_G = new vn();
                break L1;
              }
            }
            L2: {
              gm.field_j = param1.field_G;
              gm.field_j.c(-124);
              bc.field_c = new mo(param7);
              ki.field_q = 0;
              oe.field_b = 0;
              jh.field_e = -1;
              sk.field_e = -1;
              if (null != param3.field_G) {
                break L2;
              } else {
                param3.field_G = new vn();
                break L2;
              }
            }
            L3: {
              vh.field_a = param3.field_G;
              vh.field_a.c(param2 + 13049);
              nk.field_q = new mo(param6);
              if (null == param5.field_G) {
                param5.field_G = new vn();
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              ph.field_a = param5.field_G;
              ph.field_a.c(-124);
              kn.field_qb = new mo(param8);
              ba.field_a = 0L;
              if (param2 == -13173) {
                break L4;
              } else {
                field_a = null;
                break L4;
              }
            }
            vd.field_i = param0;
            return;
          } else {
            var10 = var10 + (in.field_Nb[var11] & 255);
            var11++;
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 > -38) {
            jn.a((byte) 117, -75);
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Living minions are vulnerable to being captured from death damage.<br>Undead minions absorb death damage, but light damage hurts them more.<br>Arcane minions can neither be healed or zombified.";
        field_a = new int[]{55, 56, 57};
    }
}
