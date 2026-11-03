/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends IntrusiveNode {
    static boolean field_k;
    static HoverTooltip field_m;
    static Sprite field_j;
    static UiLayoutNode field_f;
    static ff field_l;
    static int field_g;
    static String field_e;
    static int field_i;
    static String field_h;

    final static void a(boolean param0, int param1) {
        ScrollPane.field_Jb.a(new PromotionDialog(param1), 3);
        if (!param0) {
          k.loadStreetScenery(-78);
        }
    }

    final static int loadStreetScenery(int param0) {
        if (vk.field_b) {
          return -1;
        }
        if (param0 > -121) {
          k.a(true, -119);
          if (bo.field_Cb.a(false, "street")) {
            vk.field_b = true;
            oo.field_b = ng.a("cars", "street", 2, bo.field_Cb);
            so.field_d = ng.a("signs", "street", 2, bo.field_Cb);
            PacketBuffer.field_h = ng.a("cracks", "street", 2, bo.field_Cb);
            return -1;
          }
          return bo.field_Cb.a("street", -16248);
        }
        if (bo.field_Cb.a(false, "street")) {
          vk.field_b = true;
          oo.field_b = ng.a("cars", "street", 2, bo.field_Cb);
          so.field_d = ng.a("signs", "street", 2, bo.field_Cb);
          PacketBuffer.field_h = ng.a("cracks", "street", 2, bo.field_Cb);
          return -1;
        }
        return bo.field_Cb.a("street", -16248);
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 > -28) {
          return;
        }
        field_e = null;
        field_l = null;
        field_h = null;
        field_m = null;
        field_j = null;
    }

    private k() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "Played";
        field_l = new ff(15, 0, 1, 0);
        field_i = 0;
        field_h = "LINE-UP";
    }
}
