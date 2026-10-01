/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static String field_e;
    static qc field_d;
    static Sprite[] field_g;
    static double field_a;
    static Sprite[] field_b;
    static volatile boolean field_f;
    static int field_c;

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        GameplayEntity var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Geoblox.field_C;
        try {
          L0: {
            pf.field_D = true;
            var1 = (GameplayEntity) ((Object) a.attachedEntities.firstForIteration(0));
            L1: while (var1 != null) {
              var1.advanceEntityAnimation(true);
              if (6 == var1.entitySpriteKindId) {
                pf.field_D = false;
                if (var1.animationFrameIndex >= 3) {
                  ra.availableEntities.addLast(-67, var1);
                }
              }
              var1 = (GameplayEntity) ((Object) a.attachedEntities.nextForIteration(1));
            }
            var2 = 12 % ((-69 - param0) / 38);
            var1 = (GameplayEntity) ((Object) bh.field_c.firstForIteration(0));
            L2: while (var1 != null) {
              L3: {
                var1.advanceEntityAnimation(true);
                if (5 != var1.entitySpriteKindId) {
                  if ((var1.entitySpriteKindId ^ -1) != -8) {
                    if ((var1.entitySpriteKindId ^ -1) != -9) {
                      break L3;
                    }
                  }
                }
                pf.field_D = false;
                if (var1.animationFrameIndex >= 3) {
                  ra.availableEntities.addLast(-115, var1);
                }
              }
              var1 = (GameplayEntity) ((Object) bh.field_c.nextForIteration(1));
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "fc.B(" + param0 + ')');
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        if (!((hj.field_a ^ -1) != -12)) {
            w.a(31);
        }
        if (!param0) {
            return;
        }
        try {
            qc.a(pb.field_s, oi.field_e, lb.field_a, (byte) -40);
            i.a(0, (byte) 117, param1, 0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "fc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_g = null;
        if (param0 < -79) {
            field_d = null;
            field_e = null;
            return;
        }
        fc.a(-17);
        field_d = null;
        field_e = null;
    }

    static {
        field_e = "Music: ";
        field_d = new qc(256);
        field_a = 0.0;
        field_f = false;
    }
}
