/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class w {
    static char[] field_c;
    static boolean avatarShockPending;
    static TextTemplateArgumentType field_d;
    static String mouseOverIconText;
    static String[] gameSoundResourceNames;
    static String field_e;

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        param7--;
        while (param7 >= 0) {
          for (var9 = param6 - 1; var9 >= 0; var9--) {
            if (param0[param1] <= 1) {
              param1++;
              continue;
            }
            param2 = param1 - 1;
            param3 = param1 + 1;
            param4 = param1 - SoftwareRasterizer.stride;
            param5 = param1 + SoftwareRasterizer.stride;
            if (param0[param4 + 1] == 0) {
              param0[param4 + 1] = 1;
            }
            if (param0[param5 + 1] == 0) {
              param0[param5 + 1] = 1;
            }
            if (param0[param4 - 1] == 0) {
              param0[param4 - 1] = 1;
            }
            if (param0[param5 - 1] == 0) {
              param0[param5 - 1] = 1;
            }
            if (param0[param2] == 0) {
              param0[param2] = 1;
            }
            if (param0[param3] == 0) {
              param0[param3] = 1;
            }
            if (param0[param4] == 0) {
              param0[param4] = 1;
            }
            if (param0[param5] == 0) {
              param0[param5] = 1;
            }
            if (param0[param2 - 1] == 0) {
              param0[param2 - 1] = 1;
            }
            if (param0[param3 + 1] == 0) {
              param0[param3 + 1] = 1;
            }
            if (param0[param4 - SoftwareRasterizer.stride] == 0) {
              param0[param4 - SoftwareRasterizer.stride] = 1;
            }
            if (param0[param5 + SoftwareRasterizer.stride] != 0) {
              param1++;
              continue;
            }
            param0[param5 + SoftwareRasterizer.stride] = 1;
            param1++;
          }
          param1 = param1 + param8;
          param7--;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        mouseOverIconText = null;
        if (param0 < 51) {
            gameSoundResourceNames = (String[]) null;
        }
        field_d = null;
        field_c = null;
        gameSoundResourceNames = null;
    }

    final static PaletteBitmapFont loadPaletteFont(String groupName, ResourceArchive glyphGraphicsArchive, ResourceArchive fontMetricsArchive, boolean methodGuard, String resourceName) {
        int archiveGroupId = 0;
        RuntimeException fontFailureForContext = null;
        int archiveFileId = 0;
        PaletteBitmapFont fontBeforeReturn = null;
        RuntimeException fontFailureBeforeDescriptions = null;
        StringBuilder fontMessagePrefix = null;
        String groupNameDescription = null;
        StringBuilder fontMessageAfterFirstDescription = null;
        String glyphArchiveDescription = null;
        StringBuilder fontMessageAfterSecondDescription = null;
        String metricsArchiveDescription = null;
        StringBuilder fontMessageAfterThirdDescription = null;
        String resourceNameDescription = null;
        RuntimeException caughtFontFailure = null;
        try {
          if (!methodGuard) {
            gameSoundResourceNames = (String[]) null;
          }
          archiveGroupId = glyphGraphicsArchive.findGroupId((byte) 127, groupName);
          archiveFileId = glyphGraphicsArchive.findFileId(resourceName, -107, archiveGroupId);
          fontBeforeReturn = ValidationMessageWidget.loadPaletteFontById(fontMetricsArchive, archiveGroupId, -128, glyphGraphicsArchive, archiveFileId);
          return fontBeforeReturn;
        } catch (java.lang.RuntimeException fontFailure) {
          caughtFontFailure = fontFailure;
          fontFailureForContext = caughtFontFailure;
          fontFailureBeforeDescriptions = fontFailureForContext;
          fontMessagePrefix = new StringBuilder().append("w.A(");
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          fontMessageAfterFirstDescription = ((StringBuilder) (Object) fontMessagePrefix).append(groupNameDescription).append(',');
          if (glyphGraphicsArchive == null) {
            glyphArchiveDescription = "null";
          } else {
            glyphArchiveDescription = "{...}";
          }
          fontMessageAfterSecondDescription = ((StringBuilder) (Object) fontMessageAfterFirstDescription).append(glyphArchiveDescription).append(',');
          if (fontMetricsArchive == null) {
            metricsArchiveDescription = "null";
          } else {
            metricsArchiveDescription = "{...}";
          }
          fontMessageAfterThirdDescription = ((StringBuilder) (Object) fontMessageAfterSecondDescription).append(metricsArchiveDescription).append(',').append(methodGuard).append(',');
          if (resourceName == null) {
            resourceNameDescription = "null";
          } else {
            resourceNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) fontFailureBeforeDescriptions), ((StringBuilder) (Object) fontMessageAfterThirdDescription).append(resourceNameDescription).append(')').toString());
        }
    }

    final static boolean a(boolean param0, int param1) {
        try {
            PacketBuffer var4 = null;
            PacketBuffer var5 = null;
            if (null == NetworkArchiveRequest.field_B) {
                NetworkArchiveRequest.field_B = GameplayEntity.field_D.requestSocket(NetworkArchiveRequest.field_x, MultiHandleSliderWidget.field_I, false);
            }
            if (param1 != 52) {
                field_d = (TextTemplateArgumentType) null;
            }
            if (!(NetworkArchiveRequest.field_B.status != 0)) {
                return false;
            }
            long dupTemp$0 = oa.a(param1 ^ -12500);
            CanvasResizeController.field_r = dupTemp$0;
            AudioService.field_e = dupTemp$0;
            if (1 != NetworkArchiveRequest.field_B.status) {
                PacketBuffer.currentProtocolStage = AchievementQuery.field_h;
            } else {
                try {
                    SpriteCheckboxRenderer.field_e = new BufferedSocket((java.net.Socket) (NetworkArchiveRequest.field_B.result), GameplayEntity.field_D);
                    var4 = eh.field_d;
                    var5 = var4;
                    CacheReference.field_q.position = 0;
                    var5.position = 0;
                    MidiNoteMixer.field_o = param0 ? -2 : -1;
                    dc.field_b = param0 ? -2 : -1;
                    VisualPropertyNode.field_n = param0 ? -2 : -1;
                    PacketBuffer.currentProtocolStage = IterableNodeHashTable.field_d;
                    ke.writeConnectionHeader(qe.field_b, true, ok.field_f, EmailAvailabilityValidator.field_l, CacheReference.field_q);
                    NanoFrameTimer.a(param1 ^ -53, -1);
                } catch (IOException iOException) {
                    PacketBuffer.currentProtocolStage = AchievementQuery.field_h;
                }
            }
            NetworkArchiveRequest.field_B = null;
            return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9;
        for (var8 = -param5; var8 < 0; var8++) {
          var9 = param3 + param4 - 3;
          while (param3 < var9) {
            if (param0[param3] == 0) {
              param0[param3] = param1[param2];
            }
            param3++;
            param2++;
            if (param0[param3] == 0) {
              param0[param3] = param1[param2];
            }
            param3++;
            param2++;
            if (param0[param3] == 0) {
              param0[param3] = param1[param2];
            }
            param3++;
            param2++;
            if (param0[param3] != 0) {
              param3++;
              param2++;
              continue;
            }
            param0[param3] = param1[param2];
            param3++;
            param2++;
          }
          var9 += 3;
          while (param3 < var9) {
            if (param0[param3] != 0) {
              param3++;
              param2++;
              continue;
            }
            param0[param3] = param1[param2];
            param3++;
            param2++;
          }
          param3 = param3 + param6;
          param2 = param2 + param7;
        }
    }

    final static void a(Sprite param0, int param1, int param2) {
        int var9 = 0;
        param1 = param1 + param0.trimX;
        param2 = param2 + param0.trimY;
        int var3 = param1 + param2 * SoftwareRasterizer.stride;
        int var4 = 0;
        int var5 = param0.height;
        int var6 = param0.width;
        int var7 = SoftwareRasterizer.stride - var6;
        int var8 = 0;
        if (param2 < SoftwareRasterizer.clipTop) {
            var9 = SoftwareRasterizer.clipTop - param2;
            var5 = var5 - var9;
            param2 = SoftwareRasterizer.clipTop;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * SoftwareRasterizer.stride;
        }
        if (param2 + var5 > SoftwareRasterizer.clipBottom) {
            var5 = var5 - (param2 + var5 - SoftwareRasterizer.clipBottom);
        }
        if (param1 < SoftwareRasterizer.clipLeft) {
            var9 = SoftwareRasterizer.clipLeft - param1;
            var6 = var6 - var9;
            param1 = SoftwareRasterizer.clipLeft;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param1 + var6 > SoftwareRasterizer.clipRight) {
            var9 = param1 + var6 - SoftwareRasterizer.clipRight;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        w.a(SoftwareRasterizer.framebuffer, param0.pixels, var4, var3, var6, var5, var7, var8);
    }

    final static void a(int param0) {
        int var1 = -58 % ((param0 + 28) / 50);
    }

    static {
        field_c = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        mouseOverIconText = "Mouse over an icon for details";
        field_d = new TextTemplateArgumentType(1, 2, 2, 0);
        field_e = "Countdown";
        gameSoundResourceNames = new String[]{"menu_select", "jewel_1", "jewel_2", "jewel_3", "space_1", "space_2", "space_3", "sun_1", "sun_2", "sun_3", "baking_1", "baking_2", "baking_3", "germs_1", "germs_2", "germs_3", "sport_1", "sport_2", "sport_3", "sweets_1", "sweets_2", "sweets_3", "cry", "to_angry", "to_excited", "to_happy", "to_unhappy", "electric_shock", "bubble_swell", "button_bleep", "geom_rain", "geom_vanish", "bonus", "round_clear"};
    }
}
