/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ArchiveFactoryHelpers {
    static int[] field_e;
    static int field_h;
    static String field_c;
    static String field_f;
    static int[] field_g;
    static int field_i;
    static int field_d;
    static int field_b;
    static int[] field_a;

    final static Archive createResourceArchive(boolean param0, int param1, boolean param2, int param3, byte param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          CachedArchiveSource var8 = null;
          Archive stackIn_16_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            var7 = null;
            if (LoadingProgressDialog.field_ab.field_g != null) {
              PatchNoteUsage.field_r = new BufferedFile(LoadingProgressDialog.field_ab.field_g, 5200, 0);
              LoadingProgressDialog.field_ab.field_g = null;
              var6 = new SectorCacheStore(255, PatchNoteUsage.field_r, new BufferedFile(LoadingProgressDialog.field_ab.field_b, 12000, 0), 2097152);
            }
            if (param4 < 18) {
              field_c = (String) null;
            }
            if (PatchNoteUsage.field_r != null) {
              if (TransitionPhase.field_b == null) {
                TransitionPhase.field_b = new BufferedFile[LoadingProgressDialog.field_ab.field_m.length];
              }
              if (null == TransitionPhase.field_b[param1]) {
                TransitionPhase.field_b[param1] = new BufferedFile(LoadingProgressDialog.field_ab.field_m[param1], 12000, 0);
                LoadingProgressDialog.field_ab.field_m[param1] = null;
              }
              var7 = new SectorCacheStore(param1, PatchNoteUsage.field_r, TransitionPhase.field_b[param1], 2097152);
            }
            var8 = CacheEntry.field_u.openProvider(param1, 80, (SectorCacheStore) (var7), (SectorCacheStore) (var6), param2);
            if (param0) {
              var8.startPrefetch(5127);
            }
            stackIn_16_0 = new Archive(var8, param5, param3);
            return stackIn_16_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.net.URL decorateSessionUrl(java.net.URL param0, byte param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (param1 >= -101) {
            ArchiveFactoryHelpers.releaseStatics(125);
          }
          var4 = null;
          if (FullscreenCanvasHelpers.field_s != null &&
            !FullscreenCanvasHelpers.field_s.equals(param2.getParameter("settings"))) {
            var3 = FullscreenCanvasHelpers.field_s;
            var4 = var3;
            var4 = var3;
          }
          if (DiskCacheWorker.field_g != null &&
            !DiskCacheWorker.field_g.equals(param2.getParameter("session"))) {
            var4 = DiskCacheWorker.field_g;
          }
          stackIn_10_0 = MenuInputState.rewriteUrlPathParameters((String) (var3), param0, -1, -103, (String) (var4));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ai.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        field_a = null;
        field_f = null;
        field_e = null;
        field_c = null;
        if (param0 != 13408) {
          ArchiveFactoryHelpers.checkReconnecting((byte) 74);
        }
    }

    final static boolean checkReconnecting(byte param0) {
        SoundEffectLibrary.field_e = true;
        if (param0 != 105) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          ArchiveFactoryHelpers.decorateSessionUrl((java.net.URL) null, (byte) -1, (java.applet.Applet) null);
        }
        ArchiveProvider.field_c = ClockAndTextHelpers.monotonicMillis(0) + 15000L;
        return DisplayNameForm.field_R == 11 ? true : false;
    }

    final static int findMenuOptionAt(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = TetraLink.field_J;
        try {
          var3_int = 0;
          var5 = -117 / ((param2 - 78) / 35);
          var4 = ValidationStatusIcon.field_Q;
          while (var3_int < ArchiveProvider.field_b.length) {
            var6 = PendingMove.field_c[var3_int];
            if (var6 >= 0) {
              var7 = ServerConnectionHelpers.measureText(true, 1, ArchiveProvider.field_b[var3_int]);
              var8 = IconLabelItem.field_Nb - (var7 >> 1);
              var4 = var4 + MenuLabelGlobals.field_e;
              if (AnimationSequence.containsPoint(param1, var8 - ChatReceiveHelpers.field_a, var4, param0, (ChatReceiveHelpers.field_a << 1) + var7, (PacketDiagnosticsHelpers.field_q << 1) + ViewportController.field_n, -124)) {
                stackIn_8_0 = var6;
                return stackIn_8_0;
              }
              var4 = var4 + (ViewportController.field_n + MenuLabelGlobals.field_e + (PacketDiagnosticsHelpers.field_q << 1));
            } else {
              var4 = var4 + UiComponent.field_wb;
            }
            var3_int++;
          }
          stackIn_12_0 = -1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var3), "ai.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static IndexedSprite createDecodedIndexedSprite(byte param0) {
        if (param0 <= 85) {
          field_h = -20;
        }
        IndexedSprite var1 = new IndexedSprite(ImageProducerRasterBuffer.field_l, PasswordValidator.field_w, QuickChatCategory.field_x[0], ViewportController.field_t[0], IntrusiveDeque.field_h[0], ErrorPrintHelpers.field_e[0], JoinGameTextGlobals.field_a[0], LobbyResourceHelpers.field_c);
        DecodedSpriteBuffers.clearDecodedSpriteData(-104);
        return var1;
    }

    final static int getCommonUiLoadPercent(byte param0) {
        if (GrowableIntList.field_a < 2) {
          return 0;
        }
        if (0 != Js5Transport.field_l) {
          if (DebouncedValidator.field_i != null) {
            if (!DebouncedValidator.field_i.ensureIndexLoaded(107)) {
              return 14;
            }
            if (!DebouncedValidator.field_i.hasGroupName("", 0)) {
              return 29;
            }
            if (!DebouncedValidator.field_i.loadGroupByName("", (byte) -81)) {
              return 29;
            }
          }
          if (!LoadingScreenHelpers.field_i.ensureIndexLoaded(121)) {
            return 43;
          }
          if (!LoadingScreenHelpers.field_i.loadGroupByName("commonui", (byte) -87)) {
            return 57;
          }
          if (!ConnectionTimingHelpers.field_a.ensureIndexLoaded(91)) {
            return 71;
          }
          if (!ConnectionTimingHelpers.field_a.loadGroupByName("commonui", (byte) -123)) {
            return 80;
          }
          if (!LinkTextPainter.field_b.ensureIndexLoaded(88)) {
            return 82;
          }
          if (!LinkTextPainter.field_b.areAllGroupsLoaded(false)) {
            return 86;
          }
        } else {
          if (!LoadingScreenHelpers.field_i.ensureIndexLoaded(121)) {
            return 20;
          }
          if (!LoadingScreenHelpers.field_i.loadGroupByName("commonui", (byte) -128)) {
            return 40;
          }
          if (!ConnectionTimingHelpers.field_a.ensureIndexLoaded(114)) {
            return 50;
          }
          if (!ConnectionTimingHelpers.field_a.loadGroupByName("commonui", (byte) -75)) {
            return 60;
          }
          if (!LinkTextPainter.field_b.ensureIndexLoaded(100)) {
            return 70;
          }
          if (!LinkTextPainter.field_b.areAllGroupsLoaded(false)) {
            return 80;
          }
        }
        if (param0 <= -14) {
          return 100;
        }
        return 82;
    }

    static {
        field_f = "Time: <%0>";
        field_i = 0;
        field_c = "Switch to 2D mode";
        field_e = new int[4];
        field_a = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
