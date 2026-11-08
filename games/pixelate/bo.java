/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    int field_l;
    static String field_a;
    static QuickChatMenu field_h;
    int field_i;
    static String field_f;
    static String field_k;
    int field_g;
    static String field_b;
    int field_j;
    static IntrusiveDeque field_d;
    static int[] field_c;
    static long field_e;

    final static void resendSaveDataRequests(int param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        SaveDataRequest var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          var4 = (SaveDataRequest) (wk.field_g.first(1504642273));
          while (var4 != null) {
            dq.sendSaveDataRequest(param0, -18989, var4);
            var4 = (SaveDataRequest) (wk.field_g.next(param1 + 1504642266));
          }
          if (param1 != 7) {
            field_k = (String) null;
          }
          var2 = bq.field_a.first(1504642273);
          while (var2 != null) {
            AlphaContainer.sendSavedDataRequest(true, param0);
            var2 = bq.field_a.next(1504642273);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var2_ref), "bo.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_c = null;
        field_a = null;
        field_h = null;
        field_f = null;
        if (param0) {
          field_d = null;
          field_k = null;
          field_b = null;
          return;
        }
    }

    final static byte[] packCompletedPuzzleMask(int param0) {
        byte[] var2 = new byte[8];
        byte[] var1 = var2;
        var2[6] = (byte)(int)FullscreenFocusCanvas.longAnd(255L, CheckboxPainter.field_h >> 48);
        var2[2] = (byte)(int)FullscreenFocusCanvas.longAnd((long)param0, CheckboxPainter.field_h >> 16);
        var2[3] = (byte)(int)FullscreenFocusCanvas.longAnd(CheckboxPainter.field_h >> 24, 255L);
        var2[5] = (byte)(int)FullscreenFocusCanvas.longAnd(CheckboxPainter.field_h >> 40, 255L);
        var2[1] = (byte)(int)FullscreenFocusCanvas.longAnd(255L, CheckboxPainter.field_h >> 8);
        var2[0] = (byte)(int)FullscreenFocusCanvas.longAnd(CheckboxPainter.field_h >> 0, 255L);
        var2[4] = (byte)(int)FullscreenFocusCanvas.longAnd(255L, CheckboxPainter.field_h >> 32);
        var2[7] = (byte)(int)FullscreenFocusCanvas.longAnd(255L, CheckboxPainter.field_h >> 56);
        return var2;
    }

    final static int getDaysInMonth(byte param0, int param1, int param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (param2 != 1) {
          var3 = 54 / ((43 - param0) / 45);
          return gb.field_e[param2];
        }
        if (NodeHashTableIterator.isLeapYear(false, param1)) {
          return 29;
        }
        var3Lifetime1 = 54 / ((43 - param0) / 45);
        return gb.field_e[param2];
    }

    static {
        int var0 = 0;
        field_a = "A Night to Remember";
        field_f = "Back";
        field_b = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_k = "Retry";
        field_d = new IntrusiveDeque();
        field_c = new int[16];
        for (var0 = 0; field_c.length > var0; var0++) {
          field_c[var0] = 256 / field_c.length * 65793 * var0;
        }
    }
}
