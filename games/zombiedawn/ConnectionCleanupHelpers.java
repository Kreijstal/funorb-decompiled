/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ConnectionCleanupHelpers {
    static PendingIntArrayRequest field_b;
    static int[] field_a;

    final static void cleanupPopupUi(int param0) {
        if (null != MessageDialogContent.field_S) {
          MessageDialogContent.field_S.removeHiddenDialogs((byte) -36);
        }
        if (NameCharacterHelpers.field_c != null) {
          NameCharacterHelpers.field_c.stopProgressAnimation(-31361);
        }
        if (param0 != 31431) {
          return;
        }
        ArchivePreloader.resetTooltipState(0);
    }

    final static void renderLogoGlow(byte param0) {
        Sprite var1 = null;
        Sprite var2 = null;
        int var4 = 0;
        int var5 = ZombieDawn.field_J;
        try {
          var1 = new Sprite(540, 140);
          ContentTransitionDialog.setRasterTarget((byte) -122, var1);
          TriangleRasterizer.useRasterClip();
          Rasterizer.clear();
          LevelNavigation.field_x = 0;
          BloodSplat.buildLogoModelFrame(30549);
          var2 = var1.copySprite();
          int var3 = 1 / ((4 - param0) / 43);
          for (var4 = 0; var4 < 15; var4++) {
            var2.drawSilhouette(-2, -2, 16777215);
            Rasterizer.blurRectangle(4, 4, 0, 0, 540, 140);
          }
          MinigunGunner.field_Pb.setAsRenderTarget();
          var1.drawHalfSize(0, 0);
          SingleChildWidget.popRasterState(-21189);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "hg.F(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 140) {
          field_a = (int[]) null;
        }
        field_b = null;
        field_a = null;
    }

    final static SocialListEntry findEntryByName(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        SocialListEntry var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        SocialListEntry stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawn.field_J;
        try {
          if (null == BufferedFile.field_j) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (0 == param1.length()) {
            stackIn_7_0 = null;
            return (SocialListEntry) (stackIn_7_0);
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = CheckboxWidget.normalizeDisplayName(var6, -47);
          if (var2 == null) {
            stackIn_10_0 = null;
            return (SocialListEntry) (stackIn_10_0);
          }
          var3 = (SocialListEntry) (BufferedFile.field_j.get(93, (long)var2.hashCode()));
          while (true) {
            if (var3 == null) {
              var4 = -121 % ((60 - param0) / 32);
              stackIn_18_0 = null;
              return (SocialListEntry) (stackIn_18_0);
            }
            var7 = (CharSequence) ((Object) var3.field_lb);
            var4_ref_String = CheckboxWidget.normalizeDisplayName(var7, -124);
            if (!var4_ref_String.equals(var2)) {
              var3 = (SocialListEntry) (BufferedFile.field_j.getNextWithSameKey((byte) -113));
              continue;
            }
            break;
          }
          stackIn_15_0 = var3;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("hg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static Sprite loadSprite(int param0, int param1, Js5Archive param2, int param3) {
        RuntimeException var4 = null;
        Sprite stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Sprite stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -2) {
            stackIn_2_0 = (Sprite) null;
            return stackIn_2_0;
          }
          if (SpriteSheetArchiveHelpers.decodeSpriteSheetFromArchive(param1, 31043, param0, param2)) {
            stackIn_7_0 = Scrollbar.buildFirstDecodedSprite((byte) 72);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (Sprite) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("hg.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void closeArchiveConnections(int param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var2 = null;
          var3 = ZombieDawn.field_J;
          try {
            if (null != SpatialBucket.field_c) {
              SpatialBucket.field_c.closeConnection(31239);
            }
            if (LoginDialogGlobals.field_d != null) {
              LoginDialogGlobals.field_d.shutdown(true);
            }
            if (param0 != 0) {
              ConnectionCleanupHelpers.closeArchiveConnections(-94);
            }
            if (null != AchievementBanner.field_j) {
              try {
                AchievementBanner.field_j.close(463);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (ViewportController.field_v != null) {
              for (var1_int = 0; var1_int < ViewportController.field_v.length; var1_int++) {
                if (ViewportController.field_v[var1_int] != null) {
                  try {
                    ViewportController.field_v[var1_int].close(463);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw ExceptionWrapper.wrapException((Throwable) ((Object) var1), "hg.C(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new int[16];
    }
}
