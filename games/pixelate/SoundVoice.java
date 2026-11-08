/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundVoice extends IntrusiveNode {
    static boolean field_q;
    static int field_n;
    static String field_l;
    static String[][] field_m;
    static int field_p;
    static String field_k;
    PcmSampleStream field_o;

    final static String readSettingsCookie(java.applet.Applet param0, byte param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_9_0 = null;
          String stackIn_16_0 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = Pixelate.field_H ? 1 : 0;
          try {
            try {
              var9 = param0.getParameter("cookieprefix");
              var3 = var9 + "settings";
              if (param1 != -85) {
                SoundVoice.closeFullscreenCanvas(122);
              }
              var4 = (String) (JavaScriptBridge.callWindowFunction("getcookies", (byte) -43, param0));
              var5 = Puzzle.split(var4, (byte) -37, ';');
              for (var6 = 0; var6 < var5.length; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_9_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (ArchiveProvider.field_c == null) {
              return param0.getParameter("settings");
            }
            stackIn_16_0 = ArchiveProvider.field_c;
            return stackIn_16_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("ln.D(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(byte param0) {
        field_m = (String[][]) null;
        if (param0 != -113) {
          field_m = (String[][]) null;
        }
        field_l = null;
        field_k = null;
    }

    SoundVoice(int param0) {
        this.field_o = PcmSampleStream.createAtRatePercent(SecondaryNodeDeque.field_f[param0], 100, NightToRememberBackground.field_m[param0]);
        TextLayoutLine.playSoundEffect(-21317, this.field_o);
    }

    final static void closeFullscreenCanvas(int param0) {
        if (param0 <= 11) {
          return;
        }
        if (null == GridSize.field_f) {
          return;
        }
        MenuInputState.removeCanvasInputListeners(GridSize.field_f, 0);
        GridSize.field_f.closeFrame(6511, AchievementMaskRequest.field_k);
        GridSize.field_f = null;
        if (GzipDecoder.field_c != null) {
          GzipDecoder.field_c.restoreSavedSize(-101);
        }
        NameAvailabilityValidator.field_u.requestFocus();
    }

    final static void rasterTriangle(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = Pixelate.field_H ? 1 : 0;
        if (param6 != 100) {
          field_k = (String) null;
        }
        if (param1 <= param3) {
          if (param3 >= param4) {
            if (param1 >= param4) {
              AccountServerRequestHelpers.rasterFlatMeshTriangle(param2, param1, param3, param5, param7, SoftwareRasterizer.field_k, false, param0, param4);
            } else {
              AccountServerRequestHelpers.rasterFlatMeshTriangle(param0, param4, param3, param5, param7, SoftwareRasterizer.field_k, false, param2, param1);
            }
          } else {
            AccountServerRequestHelpers.rasterFlatMeshTriangle(param7, param3, param4, param5, param0, SoftwareRasterizer.field_k, false, param2, param1);
          }
        } else {
          if (param4 <= param1) {
            if (param4 <= param3) {
              AccountServerRequestHelpers.rasterFlatMeshTriangle(param7, param3, param1, param5, param2, SoftwareRasterizer.field_k, false, param0, param4);
            } else {
              AccountServerRequestHelpers.rasterFlatMeshTriangle(param0, param4, param1, param5, param2, SoftwareRasterizer.field_k, false, param7, param3);
            }
          } else {
            AccountServerRequestHelpers.rasterFlatMeshTriangle(param2, param1, param4, param5, param0, SoftwareRasterizer.field_k, false, param7, param3);
          }
        }
    }

    static {
        field_q = true;
        field_l = "No options available";
        field_k = "Members";
        field_p = 0;
    }
}
