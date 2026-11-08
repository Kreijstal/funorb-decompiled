/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordValidator extends TextFieldValidator {
    static BoardView field_r;
    static SceneWidget field_o;
    static byte[] field_s;
    private EditableTextWidget field_n;
    static int field_m;
    static String field_q;
    private EditableTextWidget field_p;

    final ValidationState validateText(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        ValidationState stackIn_2_0 = null;
        ValidationState stackIn_5_0 = null;
        ValidationState stackIn_8_0 = null;
        ValidationState stackIn_11_0 = null;
        ValidationState stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_n.field_q.toLowerCase();
          var4 = param0.toLowerCase();
          if (!param1) {
            stackIn_2_0 = (ValidationState) null;
            return stackIn_2_0;
          }
          if (var4.length() == 0) {
            stackIn_5_0 = LobbyFrameHelpers.field_a;
            return stackIn_5_0;
          }
          if (!Matrix3.isAcceptablePassword(var4, var3, (byte) -4)) {
            stackIn_8_0 = LobbyFrameHelpers.field_a;
            return stackIn_8_0;
          }
          if (!this.containsEmailPart(126, param0)) {
            stackIn_13_0 = RetroBlock.field_g;
            return stackIn_13_0;
          }
          stackIn_11_0 = LobbyFrameHelpers.field_a;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("g.D(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final String describeText(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_n.field_q.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (param0 >= -76) {
            field_m = 16;
          }
          var5 = var4;
          if (PolygonClipHelpers.hasInvalidPasswordLength((byte) 34, var5)) {
            stackIn_7_0 = MusicCrossfadeStream.field_y;
            return stackIn_7_0;
          }
          if (IntrusiveDequeCursor.containsNonAlphanumeric(var5, 64)) {
            stackIn_11_0 = ResizableModalPanel.field_R;
            return stackIn_11_0;
          }
          if (VolumeControlledVoice.isAllSameChar(var5, 73)) {
            stackIn_14_0 = AgeValidator.field_n;
            return stackIn_14_0;
          }
          if (this.containsEmailPart(125, param1)) {
            stackIn_17_0 = KiteTailSegment.field_c;
            return stackIn_17_0;
          }
          if (var6.length() <= 0) {
            stackIn_20_0 = LoginMethodGlobals.field_a;
            return stackIn_20_0;
          }
          if (DateInputWidget.containsTextOrReverse(var5, var6, (byte) 78)) {
            stackIn_23_0 = StrongCacheReference.field_w;
            return stackIn_23_0;
          }
          if (CipherPacketBuffer.containsForwardOrReversed(var5, (byte) -47, var6)) {
            stackIn_27_0 = MeshDecodeHelpers.field_b;
            return stackIn_27_0;
          }
          if (!ReportAbuseHelpers.containsForwardOrReversed(var5, var6, 95)) {
            return MusicCrossfadeStream.field_y;
          }
          stackIn_31_0 = StrongCacheReference.field_w;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("g.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static SceneWidget getFriendListContent(boolean param0) {
        if (param0) {
          return (SceneWidget) null;
        }
        return ScoreMarkerBar.field_z.field_Fb;
    }

    private final boolean containsEmailPart(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 124) {
            PasswordValidator.animateLogoMeshes(-44, -114);
          }
          var3 = this.field_p.field_q.toLowerCase();
          var4 = param1.toLowerCase();
          if (var3.length() > 0 &&
            var4.length() > 0) {
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0 &&
              var5 < -1 + var3.length()) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(1 + var5);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (var4.indexOf(var7) < 0) {
                return false;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("g.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void animateLogoMeshes(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        int var4Lifetime2;
        int var5Lifetime2;
        var6 = Pixelate.field_H ? 1 : 0;
        var2 = 0;
        var3 = GameModeCard.field_f;
        if (var3 < 5) {
          var2 = var3 * var3 * 8192 / 1100;
        } else {
          if (var3 < 105) {
            var2 = (var3 * 16384 - 40960) / 220;
            if (param1 <= 29) {
              return;
            }
            var4 = 1;
            var5 = 0;
            if (param0 == 1) {
              var5 = 1;
            }
            if (param0 == 3) {
              var4 = -1;
            }
            if (4 == param0) {
              var4 = 1;
              var5 = 1;
            }
            if (param0 == 5) {
              var4 = -1;
              var5 = 1;
            }
            if (param0 == 6) {
              var4 = 1;
              var5 = -1;
            }
            if (param0 == 7 ||
              param0 == 8) {
              var4 = -1;
              var5 = -1;
            }
            if (param0 == 11) {
              var4 = -1;
            }
            if (12 == param0) {
              var4 = -1;
              var5 = -1;
            }
            if (13 == param0) {
              var4 = 1;
              var5 = -1;
            }
            if (param0 == 14) {
              var5 = 1;
              var4 = -1;
            }
            if (param0 == 15) {
              var4 = 1;
              var5 = 1;
            }
            ReportAbuseDialog.field_Hb = TextButton.buildRotationMatrix(var5 * var2, var4 * var2, (byte) 7);
            return;
          }
          if (120 > var3) {
            var3 = -var3 + 120;
            var2 = 8192 - 8192 * var3 * var3 / 3300;
            if (param1 <= 29) {
              return;
            }
            var4Lifetime2 = 1;
            var5Lifetime2 = 0;
            if (param0 == 1) {
              var5Lifetime2 = 1;
            }
            if (param0 == 3) {
              var4Lifetime2 = -1;
            }
            if (4 == param0) {
              var4Lifetime2 = 1;
              var5Lifetime2 = 1;
            }
            if (param0 == 5) {
              var4Lifetime2 = -1;
              var5Lifetime2 = 1;
            }
            if (param0 == 6) {
              var4Lifetime2 = 1;
              var5Lifetime2 = -1;
            }
            if (param0 == 7) {
              var4Lifetime2 = -1;
              var5Lifetime2 = -1;
            } else {
              if (param0 == 8) {
                var4Lifetime2 = -1;
                var5Lifetime2 = -1;
              }
            }
            if (param0 == 11) {
              var4Lifetime2 = -1;
            }
            if (12 == param0) {
              var4Lifetime2 = -1;
              var5Lifetime2 = -1;
            }
            if (13 == param0) {
              var4Lifetime2 = 1;
              var5Lifetime2 = -1;
            }
            if (param0 == 14) {
              var5Lifetime2 = 1;
              var4Lifetime2 = -1;
            }
            if (param0 == 15) {
              var4Lifetime2 = 1;
              var5Lifetime2 = 1;
            }
            ReportAbuseDialog.field_Hb = TextButton.buildRotationMatrix(var5Lifetime2 * var2, var4Lifetime2 * var2, (byte) 7);
            return;
          }
        }
        if (param1 <= 29) {
          return;
        }
        var4Lifetime1 = 1;
        var5Lifetime1 = 0;
        if (param0 == 1) {
          var5Lifetime1 = 1;
        }
        if (param0 == 3) {
          var4Lifetime1 = -1;
        }
        if (4 == param0) {
          var4Lifetime1 = 1;
          var5Lifetime1 = 1;
        }
        if (param0 == 5) {
          var4Lifetime1 = -1;
          var5Lifetime1 = 1;
        }
        if (param0 == 6) {
          var4Lifetime1 = 1;
          var5Lifetime1 = -1;
        }
        if (param0 == 7 ||
          param0 == 8) {
          var4Lifetime1 = -1;
          var5Lifetime1 = -1;
        }
        if (param0 == 11) {
          var4Lifetime1 = -1;
        }
        if (12 == param0) {
          var4Lifetime1 = -1;
          var5Lifetime1 = -1;
        }
        if (13 == param0) {
          var4Lifetime1 = 1;
          var5Lifetime1 = -1;
        }
        if (param0 == 14) {
          var5Lifetime1 = 1;
          var4Lifetime1 = -1;
        }
        if (param0 == 15) {
          var4Lifetime1 = 1;
          var5Lifetime1 = 1;
        }
        ReportAbuseDialog.field_Hb = TextButton.buildRotationMatrix(var5Lifetime1 * var2, var4Lifetime1 * var2, (byte) 7);
    }

    PasswordValidator(EditableTextWidget param0, EditableTextWidget param1, EditableTextWidget param2) {
        super(param0);
        try {
          this.field_p = param2;
          this.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "g.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static RankingTableRequest getRankingTableRequest(int param0, byte param1, int param2, int param3, int param4) {
        RankingTableRequest var5;
        int var6;
        int var7;
        RankingTableRequest var5Lifetime1;
        var7 = Pixelate.field_H ? 1 : 0;
        var6 = 27 % ((param1 - 25) / 44);
        var5 = (RankingTableRequest) (DialWidgetPainter.field_c.first(1504642273));
        while (var5 != null) {
          if (param4 == var5.field_o) {
            return var5;
          }
          var5 = (RankingTableRequest) (DialWidgetPainter.field_c.next(1504642273));
        }
        var5Lifetime1 = new RankingTableRequest();
        var5Lifetime1.field_s = param2;
        var5Lifetime1.field_m = param3;
        var5Lifetime1.field_o = param4;
        DialWidgetPainter.field_c.addLast(22125, var5Lifetime1);
        LobbyPlayer.sendRankingTableRequest(param0, var5Lifetime1, 65536);
        return var5Lifetime1;
    }

    public static void clearStatics(int param0) {
        field_r = null;
        field_q = null;
        field_s = null;
        field_o = null;
        if (param0 != -30055) {
          PasswordValidator.animateLogoMeshes(-18, -13);
        }
    }

    static {
        field_m = 2;
        field_q = "Loading graphics";
    }
}
