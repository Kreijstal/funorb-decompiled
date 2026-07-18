/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e extends en {
    static boolean field_l;
    static cn field_j;
    static int field_d;
    static String field_g;
    static String field_i;
    private String field_h;
    private String field_m;
    static String field_k;
    static int field_e;
    private String field_f;

    e(String param0) {
        this((String) null, param0, param0);
    }

    public static void c(byte param0) {
        field_k = null;
        field_i = null;
        field_j = null;
        field_g = null;
        if (param0 != 29) {
            e.c((byte) -101);
        }
    }

    final cn b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        cn var5 = null;
        if (((e) this).field_m == null) {
          return null;
        } else {
          var2 = db.field_v.b(((e) this).field_m);
          var3 = db.field_v.field_H - -db.field_v.field_E;
          var4 = 87 % ((param0 - -58) / 35);
          var5 = new cn(var2, var3);
          jh.a(var5);
          db.field_v.b(((e) this).field_m, 0, db.field_v.field_H, 16777215, -1);
          jh.b();
          return var5;
        }
    }

    e(String param0, String param1, String param2) {
        try {
            ((e) this).field_h = param1;
            ((e) this).field_m = param2;
            ((e) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, sa param1) {
        try {
            if (param0 != 0) {
                field_e = -78;
            }
            param1.a(false, ck.field_H.a(((e) this).field_f, (byte) -48), (byte) 91, ck.field_H.a(((e) this).field_h, (byte) -48), 16777215);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "e.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Death Knight";
        field_g = "Revive this <%0>, allowing them to fight again, at a cost of <%1> Treasure.";
        field_i = "Fail to spot the dart launchers hidden in this room and a raider will find himself peppered with sharp bits of metal.<br><br>This trap is poisonous, and may kill raiders if they fail a <%defence> roll against this room's <%attack>.";
        field_e = 20;
    }
}
