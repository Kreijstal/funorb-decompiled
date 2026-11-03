/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static String gameoptPlayersdontqualifySelectgametab;
    static int field_d;
    static UiComponent field_b;
    static int field_e;
    static int[][][] field_a;

    final static boolean a(int param0, int[] param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_6_0 = ((param1[param2 >> 5] & 1 << (param2 & 31)) == 0);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("t.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static String formatPacketDump(int param0) {
        String var1;
        int var2;
        int var3;
        int var4;
        String var8;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        String var1Lifetime1;
        String var1Lifetime2;
        String var1Lifetime3;
        if (param0 > 81) {
          var14 = "(" + NodeHashTableIterator.field_e + " " + DialRenderer.field_g + " " + MenuSelection.field_l + ") " + Bzip2DecoderState.field_c;
          var1 = var14;
          if (ScrollPane.field_Pb <= 0) {
            return var1;
          }
          var1Lifetime3 = var14 + ":";
          for (var2 = 0; ScrollPane.field_Pb > var2; var2++) {
            var15 = var1Lifetime3 + ' ';
            var3 = PlayerContextMenu.field_e.payload[var2] & 255;
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 >= 10) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            var16 = var15 + (char)var4;
            if (var3 < 10) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var1Lifetime3 = var16 + (char)var3;
          }
          return var1Lifetime3;
        }
        field_b = (UiComponent) null;
        var8 = "(" + NodeHashTableIterator.field_e + " " + DialRenderer.field_g + " " + MenuSelection.field_l + ") " + Bzip2DecoderState.field_c;
        var1Lifetime1 = var8;
        if (ScrollPane.field_Pb <= 0) {
          return var1Lifetime1;
        }
        var1Lifetime2 = var8 + ":";
        for (var2Lifetime1 = 0; ScrollPane.field_Pb > var2Lifetime1; var2Lifetime1++) {
          var12 = var1Lifetime2 + ' ';
          var3Lifetime1 = PlayerContextMenu.field_e.payload[var2Lifetime1] & 255;
          var4Lifetime1 = var3Lifetime1 >> 4;
          var3Lifetime1 = var3Lifetime1 & 15;
          if (var4Lifetime1 >= 10) {
            var4Lifetime1 += 55;
          } else {
            var4Lifetime1 += 48;
          }
          var13 = var12 + (char)var4Lifetime1;
          if (var3Lifetime1 < 10) {
            var3Lifetime1 += 48;
          } else {
            var3Lifetime1 += 55;
          }
          var1Lifetime2 = var13 + (char)var3Lifetime1;
        }
        return var1Lifetime2;
    }

    final static int hashString(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length();
          var3 = 0;
          if (param0 != 29050) {
            gameoptPlayersdontqualifySelectgametab = (String) null;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var3 = (var3 << 5) + (-var3 + vi.encodeCp1252Char(param1.charAt(var4), true));
          }
          stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("t.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (!MouseHandler.hasAccountOverlay(param0 - 6709)) {
            if (MatchingTextValidator.field_u != null &&
              MatchingTextValidator.field_u.focusLost) {
              tq.d((byte) -124);
              PlasmaTableScene.field_cb.showDialog(new FullscreenErrorDialog(PlasmaTableScene.field_cb, AchievementsScreen.field_K), 30000);
            }
            return;
          }
          if (param0 != -11) {
            t.b(-62);
          }
          PlasmaTableScene.field_cb.processPointerFrame(-122, sa.field_p, true, RankingsScreen.field_M);
          PlasmaTableScene.field_cb.advanceDialogAnimations((byte) 122);
          while (LabeledChildWidget.h(127)) {
            PlasmaTableScene.field_cb.dispatchKeyInputOrRequestFocus(-81, IterableDualLinkDeque.field_a, ml.field_b);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "t.F(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        field_a = (int[][][]) null;
        gameoptPlayersdontqualifySelectgametab = null;
        field_b = null;
        if (param0 > -16) {
          field_a = (int[][][]) null;
        }
    }

    final static void a(int param0, boolean param1) {
        if (null != sa.field_f) {
          SoftwareRasterizer.darkenRectangle(SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipTop, SoftwareRasterizer.clipRight - SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipBottom - SoftwareRasterizer.clipTop);
          sa.field_f.drawRoot((byte) -79, param1);
        }
        if (param0 == 48) {
          return;
        }
        t.b(-101);
    }

    final static void a(int param0, boolean param1, boolean param2) {
        String var4 = (String) null;
        tg.a(-124, param1, param2, (String) null);
        int var3 = -51 / ((param0 - 59) / 47);
    }

    static {
        gameoptPlayersdontqualifySelectgametab = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_e = 0;
    }
}
