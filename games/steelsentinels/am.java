/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static String[] field_d;
    static NodeDeque field_c;
    static RgbSprite[] field_f;
    static boolean field_b;
    static String field_a;
    static String field_e;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_a = null;
        if (param0 == 2) {
          field_f = null;
          field_d = null;
          return;
        }
        am.a(5);
        field_f = null;
        field_d = null;
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = SteelSentinels.obfuscationControl;
        int var1Lifetime1;
        mg.a(jk.field_j, 7411, 5);
        mg.a(bj.field_b, 7411, 6);
        mg.a(SentinelDesigner.field_d, 7411, 8);
        mg.a(a.field_h, 7411, 13);
        mg.a(id.field_cc, 7411, 14);
        mg.a(ql.field_ac, 7411, 20);
        gd.field_sb = null;
        if (rd.field_b <= 0) {
          mg.a(od.field_k, 7411, 6);
          mg.a(ug.field_H, 7411, 8);
          var1 = 111 / ((param0 + 35) / 35);
          if (rd.field_b <= 0) {
            mg.a(nc.field_h, 7411, 19);
            if (ArticulatedPart.f((byte) -128)) {
              ti.field_A[34] = oe.field_l;
            }
            if (!vi.l(13539)) {
              mg.a(NodeDeque.field_c, 7411, 1);
              mg.a(qi.field_f, 7411, 2);
              mg.a(vb.field_b, 7411, 3);
              mg.a(ri.field_a, 7411, 4);
            }
            return;
          }
          mg.a(DualNodeDeque.field_c, 7411, 0);
          mg.a(fa.field_c, 7411, 19);
          if (ArticulatedPart.f((byte) -128)) {
            ti.field_A[34] = oe.field_l;
          }
          if (!vi.l(13539)) {
            mg.a(NodeDeque.field_c, 7411, 1);
            mg.a(qi.field_f, 7411, 2);
            mg.a(vb.field_b, 7411, 3);
            mg.a(ri.field_a, 7411, 4);
          }
          return;
        }
        mg.a(bj.field_b, 7411, 6);
        mg.a(SentinelDesigner.field_d, 7411, 8);
        var1Lifetime1 = 111 / ((param0 + 35) / 35);
        if (rd.field_b <= 0) {
          mg.a(nc.field_h, 7411, 19);
          if (ArticulatedPart.f((byte) -128)) {
            ti.field_A[34] = oe.field_l;
          }
          if (!vi.l(13539)) {
            mg.a(NodeDeque.field_c, 7411, 1);
            mg.a(qi.field_f, 7411, 2);
            mg.a(vb.field_b, 7411, 3);
            mg.a(ri.field_a, 7411, 4);
          }
          return;
        }
        mg.a(DualNodeDeque.field_c, 7411, 0);
        mg.a(fa.field_c, 7411, 19);
        if (ArticulatedPart.f((byte) -128)) {
          ti.field_A[34] = oe.field_l;
        }
        if (!vi.l(13539)) {
          mg.a(NodeDeque.field_c, 7411, 1);
          mg.a(qi.field_f, 7411, 2);
          mg.a(vb.field_b, 7411, 3);
          mg.a(ri.field_a, 7411, 4);
        }
    }

    static {
        field_a = "Breaking real-world laws";
        field_e = "Page <%0> of <%1>";
        field_d = new String[]{"Chassis", "Components", "Weapons", "Modules"};
    }
}
