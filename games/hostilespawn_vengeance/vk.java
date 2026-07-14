/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends uh {
    static bd field_p;

    vk(long param0, String param1) {
        super(param0, param1);
    }

    final static void c(int param0) {
        en var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != 8) {
          field_p = null;
          var1 = s.field_b;
          L0: while (true) {
            if (!ac.a(24501)) {
              return;
            } else {
              var1.i(19319, 8);
              var1.field_i = var1.field_i + 1;
              var2 = var1.field_i + 1;
              ln.a(var1, (byte) -111);
              s.field_b.a(-var2 + var1.field_i, -19720);
              continue L0;
            }
          }
        } else {
          var1 = s.field_b;
          L1: while (true) {
            if (!ac.a(24501)) {
              return;
            } else {
              var1.i(19319, 8);
              var1.field_i = var1.field_i + 1;
              var2 = var1.field_i + 1;
              ln.a(var1, (byte) -111);
              s.field_b.a(-var2 + var1.field_i, -19720);
              continue L1;
            }
          }
        }
    }

    final bl a(boolean param0) {
        if (param0) {
            bl discarded$0 = ((vk) this).a(false);
            return re.field_i;
        }
        return re.field_i;
    }

    public static void d(int param0) {
        field_p = null;
        int var1 = 117 / ((72 - param0) / 52);
    }

    static {
    }
}
