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
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var1 = s.field_b;
            L1: while (true) {
              if (!ac.a(24501)) {
                break L0;
              } else {
                var1.i(19319, 8);
                int fieldTemp$5 = var1.field_i + 1;
                var1.field_i = var1.field_i + 1;
                var2 = fieldTemp$5;
                ln.a(var1, (byte) -111);
                s.field_b.a(-var2 + var1.field_i, -19720);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1_ref, "vk.D(" + 8 + 41);
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
        int var1 = -117;
    }

    static {
    }
}
