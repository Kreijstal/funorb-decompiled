/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gv extends rqa {
    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          gv.a((vfa) null, -90);
          si.a(59, 62, param0[0].a(98));
          return new nc((Object) (Object) "void");
        } else {
          si.a(59, 62, param0[0].a(98));
          return new nc((Object) (Object) "void");
        }
    }

    final static void a(int param0, int param1, int param2) {
        be var3 = null;
        Object var4 = null;
        var3 = new be();
        var3.field_b = param1;
        var3.field_a = param0;
        rkb.a(0, (tv) (Object) var3, dpa.field_p, 70);
        if (param2 != -10923) {
          var4 = null;
          gv.a((vfa) null, -41);
          return;
        } else {
          return;
        }
    }

    gv(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(vfa param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 > 9) {
          efb.field_b = param0;
          if (null != efb.field_b) {
            if (!efb.field_b.field_b) {
              mb.h(0, 124);
              return;
            } else {
              mb.h(1, 124);
              return;
            }
          } else {
            stackOut_9_0 = 0;
            stackIn_11_0 = stackOut_9_0;
            mb.h(stackIn_11_0, 124);
            return;
          }
        } else {
          gv.a(-34, -13, 122);
          efb.field_b = param0;
          if (null == efb.field_b) {
            mb.h(0, 124);
            return;
          } else {
            L0: {
              if (efb.field_b.field_b) {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 0;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            mb.h(stackIn_5_0, 124);
            return;
          }
        }
    }

    static {
    }
}
