/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends uh {
    static bd field_p;

    vk(long param0, String param1) {
        super(param0, param1);
    }

    final static void c(int param0) {
        int fieldTemp$2 = 0;
        en var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 8) {
                break L1;
              } else {
                field_p = (bd) null;
                break L1;
              }
            }
            var1 = s.field_b;
            L2: while (true) {
              if (!ac.a(24501)) {
                break L0;
              } else {
                var1.i(19319, 8);
                fieldTemp$2 = var1.field_i + 1;
                var1.field_i = var1.field_i + 1;
                var2 = fieldTemp$2;
                ln.a(var1, (byte) -111);
                s.field_b.a(-var2 + var1.field_i, -19720);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1_ref), "vk.D(" + param0 + ')');
        }
    }

    final bl a(boolean param0) {
        if (param0) {
            this.a(false);
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
