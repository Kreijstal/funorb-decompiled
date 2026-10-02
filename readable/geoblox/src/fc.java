/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static String musicLabelText;
    static ByteArrayBuffer field_d;
    static Sprite[] blackOrbFrames;
    static double field_a;
    static Sprite[] avatarEyeFrames;
    static volatile boolean pointerActivityPending;
    static int field_c;

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        GameplayEntity var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Geoblox.field_C;
        try {
          pf.field_D = true;
          var1 = (GameplayEntity) ((Object) a.attachedEntities.firstForIteration(0));
          L0: while (var1 != null) {
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
          var1 = (GameplayEntity) ((Object) bh.transientEntities.firstForIteration(0));
          L1: while (var1 != null) {
            L2: {
              var1.advanceEntityAnimation(true);
              if (5 != var1.entitySpriteKindId) {
                if (var1.entitySpriteKindId != 7) {
                  if (var1.entitySpriteKindId != 8) {
                    break L2;
                  }
                }
              }
              pf.field_D = false;
              if (var1.animationFrameIndex >= 3) {
                ra.availableEntities.addLast(-115, var1);
              }
            }
            var1 = (GameplayEntity) ((Object) bh.transientEntities.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "fc.B(" + param0 + ')');
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        if (!(hj.field_a != 11)) {
            w.a(31);
        }
        if (!param0) {
            return;
        }
        try {
            ByteArrayBuffer.a(ArchiveRequest.field_s, oi.field_e, lb.field_a, (byte) -40);
            i.a(0, (byte) 117, param1, 0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "fc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        avatarEyeFrames = null;
        blackOrbFrames = null;
        if (param0 < -79) {
            field_d = null;
            musicLabelText = null;
            return;
        }
        fc.a(-17);
        field_d = null;
        musicLabelText = null;
    }

    static {
        musicLabelText = "Music: ";
        field_d = new ByteArrayBuffer(256);
        field_a = 0.0;
        pointerActivityPending = false;
    }
}
