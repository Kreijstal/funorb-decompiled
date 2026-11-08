/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextLayoutLine {
    static int[][] field_c;
    int field_h;
    static String field_e;
    int field_a;
    static String field_b;
    int[] field_f;
    static String field_g;
    static String field_d;

    final static RgbSprite[] loadSpritesFromArchive(int param0, int param1, int param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        RgbSprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!StatefulTextPainter.loadSpriteSheet((byte) 30, param0, param2, param3)) {
            return null;
          }
          if (param1 != 20178) {
            field_d = (String) null;
          }
          stackIn_6_0 = Explosion.buildRgbSprites(param1 ^ 20181);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("il.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void showEmptyLoginForm(int param0) {
        if (param0 <= 97) {
          return;
        }
        String var2 = (String) null;
        WeightedLruCache.openLoginForm("", (String) null, -54);
    }

    final static void setChatFilterMode(int param0, int param1, int param2, int param3) {
        if (param1 == 0 &&
          BufferedSocket.field_c != param0) {
          BufferedSocket.field_c = param0;
          TextWidgetPainter.field_l = true;
          DialWidgetPainter.sendOptionByte(param2, (byte) -118);
        }
        if (param3 != -18853) {
          field_b = (String) null;
        }
        if (param1 == 1 &&
          param0 != LoginForm.field_Z) {
          LoginForm.field_Z = param0;
          TextWidgetPainter.field_l = true;
          DialWidgetPainter.sendOptionByte(param2, (byte) -96);
        }
        if (param1 == 2 &&
          param0 != CachedArchiveProvider.field_y) {
          CachedArchiveProvider.field_y = param0;
          TextWidgetPainter.field_l = true;
          DialWidgetPainter.sendOptionByte(param2, (byte) -100);
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 >= -14) {
          TextLayoutLine.drawRootScenes(false, (byte) 111);
        }
        field_d = null;
        field_e = null;
        field_c = (int[][]) null;
        field_g = null;
        field_b = null;
    }

    TextLayoutLine(int param0, int param1, int param2) {
        this.field_h = param0;
        this.field_a = param1;
        this.field_f = new int[1 + param2];
    }

    final static void showLoginForm(int param0) {
        if (!LoginMethod.field_d) {
          throw new IllegalStateException();
        }
        if (param0 != 0) {
          TextLayoutLine.setChatFilterMode(-7, 91, 38, 66);
        }
        if (ArrayWidgetContainer.field_O != null) {
          ArrayWidgetContainer.field_O.closeDialog(106);
        }
        String var1 = CachedArchiveProvider.getLoginNameOrDefault(35);
        AccountNoticeDialog.field_kb = new LoginForm(var1, (String) null, true, false, false);
        GradientOutlineTextPainter.field_p.pushPanel(ClientErrorSupport.field_a, -114);
        ClientErrorSupport.field_a.transitionToContent(AccountNoticeDialog.field_kb, param0 - 22908735);
        ClientErrorSupport.field_a.finishTransition((byte) -14);
    }

    final static void drawRootScenes(boolean param0, byte param1) {
        DisplayNameForm.field_V.drawFullScreen(param0, (byte) 126);
        BirthDateEntryPanel var2 = AssetDecoders.field_b;
        if (param1 > -108) {
          return;
        }
        if (var2 != null) {
          var2.render(DisplayNameForm.field_V.field_Rb, DisplayNameForm.field_V.field_cb, (byte) -128);
        }
    }

    final int characterIndexAt(byte param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = SteelSentinels.obfuscationControl;
        if (null != this.field_f &&
          this.field_f.length != 0) {
          for (var3 = 1; var3 < this.field_f.length; var3++) {
            if (param1 < (this.field_f[var3 - 1] + this.field_f[var3] >> 1)) {
              return var3 - 1;
            }
          }
          if (param0 <= 58) {
            field_e = (String) null;
          }
          return -1 + this.field_f.length;
        }
        return 0;
    }

    final int width(int param0) {
        int stackIn_7_0 = 0;
        if (param0 != -1) {
          TextLayoutLine.showEmptyLoginForm(-87);
        }
        if (this.field_f != null &&
          this.field_f.length != 0) {
          stackIn_7_0 = this.field_f[-1 + this.field_f.length];
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    static {
        field_e = "You appear to be telling someone your password - please don't!";
        field_b = "Please select an option in the '<%0>' row.";
        field_g = "Time: <col=ffffff><%0></col>";
        field_d = "foe";
    }
}
