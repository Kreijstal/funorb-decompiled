/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static int field_a;
    static rh field_c;
    static int field_b;

    public static void b(int param0) {
        field_c = null;
        if (param0 < 121) {
            field_b = 78;
        }
    }

    final static void drawAttachedEntities(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        GameplayEntity var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Geoblox.field_C;
        try {
          L0: {
            var3 = (GameplayEntity) ((Object) a.attachedEntities.firstForIteration(0));
            L1: while (var3 != null) {
              var3.drawEntityAtPosition(1643839728);
              var3 = (GameplayEntity) ((Object) a.attachedEntities.nextForIteration(1));
            }
            if (param0 == 7838) {
              break L0;
            } else {
              dc.b(-80);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "dc.A(" + param0 + ')');
        }
    }

    static {
        field_b = -1;
    }
}
