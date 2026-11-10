/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogLayerFrameHelpers {
    static Sprite[] field_a;

    final static void processDialogLayerFrame(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = ZombieDawn.field_J;
        try {
          if (!ArmySoldier.hasActiveDialog((byte) -80)) {
            if (DisplayState.field_b != null &&
              DisplayState.field_b.field_a) {
              FullscreenExitHelpers.exitFullscreen((byte) -71);
              CivilianHuman.field_xb.addDialog(new FullscreenErrorDialog(CivilianHuman.field_xb, LoginAndPacketHelpers.field_b), true);
            }
            return;
          }
          if (param0 > -100) {
            return;
          }
          CivilianHuman.field_xb.processPointerFrame(DebouncedValidator.field_a, Human.field_eb, true, true);
          CivilianHuman.field_xb.advanceDialogAnimations(-128);
          while (TileMap.pollKeyEvent(102)) {
            CivilianHuman.field_xb.processKeyInput(PasswordValidator.field_i, (byte) 106, WeightedLruCache.field_c);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1), "mk.A(" + param0 + ')');
        }
    }

    final static void choosePlayOffline(byte param0) {
        if (param0 != -121) {
          return;
        }
        NetworkArchiveRequest.setPendingAccountAction(-123, 4);
    }

    public static void releaseStatics(int param0) {
        if (param0 != 4) {
          DialogLayerFrameHelpers.releaseStatics(-103);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
    }
}
