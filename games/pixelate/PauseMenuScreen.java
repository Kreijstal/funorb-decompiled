/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PauseMenuScreen extends MenuScreen {
    static String[] field_p;
    static boolean field_o;
    static int field_q;

    final void onCancel(byte param0) {
        if (param0 >= -13) {
          PauseMenuScreen.isGameConnectionOpen(false);
        }
    }

    final void handleInput(byte param0) {
        int var2 = ro.advanceSlideshow(-36, !pe.requestLeaveServer(false) ? true : false);
        if (param0 >= -64) {
          return;
        }
        if (3 == var2) {
          if (null != ib.field_f) {
            SoundVoice.closeFullscreenCanvas(75);
          }
          ListRequest.openSubscribePage(AudioService.getApplet(13867), -60);
        }
        if (var2 == 1) {
          la.changeScreen(MidiPcmStream.field_t, 0, false, -25528);
        }
        if (var2 == 2) {
          la.changeScreen(MidiPcmStream.field_t, 0, true, -25528);
        }
    }

    final void draw(int param0) {
        if (KiteBackground.loadMembersBenefitsAssets(3782)) {
          mc.drawBenefitsScreen(12);
        }
        if (param0 != 11) {
          field_q = 43;
        }
    }

    final static void initializeChatColours(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          Js5ArchiveManager.field_b = new int[4];
          Js5ArchiveManager.field_b[2] = 12554336;
          Js5ArchiveManager.field_b[0] = 6322367;
          Js5ArchiveManager.field_b[1] = 12542143;
          Js5ArchiveManager.field_b[3] = 11321184;
          Js5ArchiveManager.field_i = new int[512];
          if (param0 != 2071) {
            return;
          }
          for (var1_int = 0; var1_int < Js5ArchiveManager.field_i.length; var1_int++) {
            var2 = var1_int * 4 / Js5ArchiveManager.field_i.length;
            if (var2 != 3) {
              stackIn_7_0 = var2 + 1;
            } else {
              stackIn_7_0 = 0;
            }
            var3 = stackIn_7_0;
            var3 = Js5ArchiveManager.field_b[var3];
            var2 = Js5ArchiveManager.field_b[var2];
            var4 = Js5ArchiveManager.field_i.length >> 2;
            var5 = var1_int % var4;
            var6 = var4 - var5;
            Js5ArchiveManager.field_i[var1_int] = cm.bitAnd(cm.bitAnd(var3, 65280) * var5 / var4, 65280) + (cm.bitAnd(16711935, var5 * cm.bitAnd(16711935, var3) / var4) + cm.bitAnd(var6 * cm.bitAnd(var2, 65280) / var4, 65280) + cm.bitAnd(16711935, cm.bitAnd(var2, 16711935) * var6 / var4));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var1), "ol.I(" + param0 + ')');
        }
    }

    PauseMenuScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        field_p = null;
    }

    final static boolean isGameConnectionOpen(boolean param0) {
        boolean stackIn_6_0 = false;
        if (!param0) {
          field_p = (String[]) null;
        }
        stackIn_6_0 = (null != NodeHashTableIterator.field_e) && (Pixelate.field_G == GameModeSelectScreen.field_s);
        return stackIn_6_0;
    }

    static {
        field_p = new String[]{"Hold '<col=ffff00>SPACE</col>' to make pieces drop quickly."};
        field_q = 0;
    }
}
