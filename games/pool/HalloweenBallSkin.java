/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HalloweenBallSkin extends BallSkin {
    static MusicTrack field_m;
    static String mbFullAccess1;

    public static void releaseStatics(byte param0) {
        field_m = null;
        if (param0 >= -5) {
          return;
        }
        mbFullAccess1 = null;
    }

    final static void i(int param0) {
        if (param0 != 3) {
          return;
        }
        ea.field_z = false;
        ViewportController.field_y = 0 == PlayerContextMenu.field_e.readUnsignedByte(-83) ? true : false;
    }

    final int ballColor(int param0, boolean param1) {
        if (0 == param0) {
          return 16777215;
        }
        if (param0 == 8) {
          return 3355443;
        }
        if (!param1) {
          this.groupName((byte) -72, -37);
        }
        return 7824981;
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        char[] var5 = null;
        char[] var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (td.isAlphanumeric(param0, (byte) 123)) {
            return true;
          }
          var5 = LinkButtonPainter.field_d;
          var2 = var5;
          var3 = 0;
          while (var3 < var5.length) {
            var4 = var5[var3];
            if (param0 != var4) {
              var3++;
              continue;
            }
            return true;
          }
          var6 = MusicPatch.field_o;
          var2Lifetime1 = var6;
          var7 = 0;
          var3Lifetime1 = var7;
          while (var7 < var6.length) {
            var4Lifetime1 = var6[var7];
            if (param0 == var4Lifetime1) {
              return true;
            }
            var7++;
          }
          if (param1 > 123) {
            return false;
          }
          HalloweenBallSkin.a('￉', (byte) 82);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "ul.F(" + param0 + ',' + param1 + ')');
        }
    }

    final String groupName(byte param0, int param1) {
        if (param0 < 9) {
          return (String) null;
        }
        return ae.ballsetEnglishGroup0;
    }

    final void a(int param0, byte param1, Ball[] param2) {
        int var4_int = 0;
        int var5 = 0;
        MeshBuilder var6 = null;
        MeshBuilder stackIn_7_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 != -37) {
            HalloweenBallSkin.releaseStatics((byte) 26);
          }
          for (var4_int = 0; var4_int < 14; var4_int++) {
            var5 = 1 - (-var4_int - var4_int / 7);
            if (param0 == var5) {
              stackIn_7_0 = QuickChatCategoryDefinition.field_E;
            } else {
              stackIn_7_0 = DisplayNamePanel.field_P;
            }
            var6 = stackIn_7_0;
            if (this.field_a[var5] != var6) {
              this.field_a[var5] = var6;
              this.a(false, param2[var5].renderTransform, var5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ul.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static String a(byte param0, String param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        SocialListEntry var7 = null;
        SocialListEntry var8 = null;
        CipherPacketBuffer var9 = null;
        CharSequence var10 = null;
        try {
          var10 = (CharSequence) ((Object) param1);
          if (!ProgressBarWidget.a(-25908, var10)) {
            stackIn_3_0 = ModelInstance.invalidName;
            return stackIn_3_0;
          }
          if (2 != th.field_a) {
            stackIn_6_0 = ShotRecord.unableToDeleteFriend;
            return stackIn_6_0;
          }
          var8 = gf.a(-83, param1);
          if (var8 == null) {
            stackIn_10_0 = AccountWelcomePanel.substituteTemplateArguments(new String[]{param1}, -1, IntrusiveDequeCursor.friendnotfound);
            return stackIn_10_0;
          }
          SoundCache.field_k.a(var8, 0);
          while (true) {
            var7 = (SocialListEntry) (SoundCache.field_k.f((byte) -5));
            if (var7 != null) {
              var7.insertionIndex = var7.insertionIndex - 1;
              continue;
            }
            break;
          }
          var8.unlink((byte) -117);
          var8.a(false);
          AccountWelcomePanel.field_S = AccountWelcomePanel.field_S - 1;
          var9 = JaggrabDownloader.field_j;
          var9.writeCipheredOpcode(false, param2);
          var9.position = var9.position + 1;
          var6 = -10 % ((param0 - 20) / 53);
          var5 = var9.position;
          var9.writeByte(1, false);
          var9.a(-9946, param1);
          var9.writeByteLengthPrefix(var9.position - var5, true);
          stackIn_15_0 = null;
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ul.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean c(int param0) {
        if (param0 != 2) {
          return true;
        }
        return false;
    }

    final void loadTopBarSprites(int param0, ResourceArchive param1) {
        try {
          if (param0 != 198123656) {
            mbFullAccess1 = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ul.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void loadBallMeshes(ResourceArchive param0, byte param1) {
        if (param1 != 117) {
          Ball[] var4 = (Ball[]) null;
          this.a(-110, (byte) 38, (Ball[]) null);
        }
        if (this.field_a != null) {
          return;
        }
        try {
          DisplayNamePanel.field_P = MeshBuilder.loadFromArchive(param0, "", "balls/TIKI/tiki_ball_halloween");
          QuickChatCategoryDefinition.field_E = MeshBuilder.loadFromArchive(param0, "", "balls/TIKI/tiki_ball_halloween_lit");
          DisplayNamePanel.field_P.scaleVertices(8, 8, 8, 8);
          QuickChatCategoryDefinition.field_E.scaleVertices(8, 8, 8, 8);
          this.field_a = new MeshBuilder[16];
          this.field_a[0] = PoolGameModel.field_B[2].field_a[0];
          this.field_a[15] = DisplayNamePanel.field_P;
          this.field_a[14] = DisplayNamePanel.field_P;
          this.field_a[13] = DisplayNamePanel.field_P;
          this.field_a[12] = DisplayNamePanel.field_P;
          this.field_a[11] = DisplayNamePanel.field_P;
          this.field_a[10] = DisplayNamePanel.field_P;
          this.field_a[9] = DisplayNamePanel.field_P;
          this.field_a[7] = DisplayNamePanel.field_P;
          this.field_a[6] = DisplayNamePanel.field_P;
          this.field_a[5] = DisplayNamePanel.field_P;
          this.field_a[4] = DisplayNamePanel.field_P;
          this.field_a[3] = DisplayNamePanel.field_P;
          this.field_a[2] = DisplayNamePanel.field_P;
          this.field_a[1] = DisplayNamePanel.field_P;
          this.field_a[8] = PoolGameModel.field_B[2].field_a[8];
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ul.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    HalloweenBallSkin() {
        this.field_g = false;
    }

    static {
        mbFullAccess1 = "FULL ACCESS";
    }
}
