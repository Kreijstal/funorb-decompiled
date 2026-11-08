/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TutorialChoiceDialog extends MessageDialog {
    static String field_G;
    static String field_F;
    static boolean field_H;
    static String field_K;
    static String field_I;
    static int field_J;

    public static void h(byte param0) {
        field_F = null;
        field_G = null;
        if (param0 < -108) {
          field_K = null;
          field_I = null;
          return;
        }
        ResourceArchive var2 = (ResourceArchive) null;
        TutorialChoiceDialog.a(90, 5, (ResourceArchive) null, 24);
        field_K = null;
        field_I = null;
    }

    final static MouseWheelInput g(byte param0) {
        try {
          Throwable var1 = null;
          MouseWheelInput stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != 3) {
              TutorialChoiceDialog.h((byte) -117);
            }
            stackIn_3_0 = (MouseWheelInput) (Class.forName("AwtMouseWheelInput").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static IndexedSprite a(int param0, int param1, ResourceArchive param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        IndexedSprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!RankingRowFactory.decodeSpriteSheetFromArchive(param0, param2, param1, param3 ^ 123)) {
            stackIn_2_0 = null;
            return (IndexedSprite) (stackIn_2_0);
          }
          if (param3 != 2) {
            field_G = (String) null;
          }
          stackIn_6_0 = ModalPanel.h((byte) -128);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("aw.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void handleResult(int param0, int param1) {
        super.handleResult(100, param1);
        if (param1 == 2) {
          return;
        }
        AuctionsScreen.startComputerMatch(10, param1 == 0 ? true : false);
        if (param0 > 60) {
          return;
        }
        field_H = true;
    }

    TutorialChoiceDialog() {
        super(8);
    }

    final boolean handleKey(int param0, byte param1, char param2) {
        boolean discarded$2 = super.handleKey(param0, param1, param2);
        if (param0 == 13) {
          this.handleResult(78, 2);
          return true;
        }
        return true;
    }

    static {
        field_I = "Connecting to<br>friend server...";
        field_F = "Advertising websites";
        field_K = "Trap Mouse: Disabled";
        field_G = "Type your email address again to make sure it's correct";
    }
}
