/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteStorage {
    static QuickChatCommandType field_c;
    static String field_a;
    static boolean field_d;
    static String field_b;

    final static void definePaletteColours(int param0, int param1, int param2, int param3, int param4) {
        int[] array$1 = null;
        int var5_int = 0;
        int var6 = 0;
        java.awt.Component var7 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ZombieDawn.field_J;
        try {
          array$1 = new int[ProgressMessageDialog.field_jb.field_O[0].length];
          ProgressMessageDialog.field_jb.field_O[param1] = array$1;
          ProgressMessageDialog.field_jb.field_O[param1][HotspotTextWidget.field_L] = param0;
          if (param4 < 65) {
            var7 = (java.awt.Component) null;
            ByteStorage.detachKeyboardInput((java.awt.Component) null, -32);
          }
          ProgressMessageDialog.field_jb.field_O[param1][DialWidgetPainter.field_c] = param2;
          ProgressMessageDialog.field_jb.field_O[param1][Zombie.field_nb[0]] = param3;
          for (var5_int = 1; Zombie.field_nb.length > var5_int; var5_int++) {
            ProgressMessageDialog.field_jb.field_O[param1][Zombie.field_nb[var5_int]] = AbstractSprite.darkenColor(ProgressMessageDialog.field_jb.field_O[param1][Zombie.field_nb[var5_int - 1]], (byte) 91);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var5), "rf.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int getFullscreenPromptWidth(boolean param0) {
        if (param0) {
          return -124;
        }
        return -RasterCanvasSizeTarget.field_c + ScrollViewport.field_E;
    }

    abstract byte[] getBytes(byte param0);

    final static void detachKeyboardInput(java.awt.Component param0, int param1) {
        try {
          param0.removeKeyListener(KeyHandlerHolder.field_c);
          param0.removeFocusListener(KeyHandlerHolder.field_c);
          LoginPanel.field_F = -1;
          if (param1 > -11) {
            field_c = (QuickChatCommandType) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "rf.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 != 11021) {
          field_c = (QuickChatCommandType) null;
          field_a = null;
          field_c = null;
          return;
        }
        field_a = null;
        field_c = null;
    }

    abstract void setBytes(int param0, byte[] param1);

    static {
        field_c = new QuickChatCommandType(2, 4, 4, 0);
        field_a = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_d = false;
        field_b = "To server list";
    }
}
