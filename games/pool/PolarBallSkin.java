/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PolarBallSkin extends BallSkin {
    static boolean field_q;
    static PcmSample field_l;
    static int field_p;
    static String createPassword;
    static int field_o;
    static boolean[][] field_m;

    final void loadBallMeshes(ResourceArchive param0, byte param1) {
        MeshBuilder dupTemp$0 = null;
        MeshBuilder dupTemp$1 = null;
        if (this.field_a != null) {
          return;
        }
        try {
          if (param1 != 117) {
            field_q = true;
          }
          this.field_a = new MeshBuilder[16];
          this.field_a[0] = MeshBuilder.loadFromArchive(param0, "", "balls/POLAR/polar_ball_white");
          dupTemp$0 = MeshBuilder.loadFromArchive(param0, "", "balls/POLAR/polar_ball_1");
          this.field_a[7] = dupTemp$0;
          this.field_a[6] = dupTemp$0;
          this.field_a[5] = dupTemp$0;
          this.field_a[4] = dupTemp$0;
          this.field_a[3] = dupTemp$0;
          this.field_a[2] = dupTemp$0;
          this.field_a[1] = dupTemp$0;
          this.field_a[8] = MeshBuilder.loadFromArchive(param0, "", "balls/POLAR/polar_ball_black");
          dupTemp$1 = MeshBuilder.loadFromArchive(param0, "", "balls/POLAR/polar_ball_2");
          this.field_a[15] = dupTemp$1;
          this.field_a[14] = dupTemp$1;
          this.field_a[13] = dupTemp$1;
          this.field_a[12] = dupTemp$1;
          this.field_a[11] = dupTemp$1;
          this.field_a[10] = dupTemp$1;
          this.field_a[9] = dupTemp$1;
          this.field_a[0].scaleVertices(8, 8, 8, 8);
          this.field_a[1].scaleVertices(8, 8, 8, 8);
          this.field_a[8].scaleVertices(8, 8, 8, 8);
          this.field_a[9].scaleVertices(8, 8, 8, 8);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "to.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int b(int param0, byte param1) {
        if (param1 != -102) {
          field_o = 0;
          if (param0 == 0) {
            return 13158;
          }
          if (param0 != 1) {
            return 16777215;
          }
          return 6715289;
        }
        if (param0 == 0) {
          return 13158;
        }
        if (param0 != 1) {
          return 16777215;
        }
        return 6715289;
    }

    PolarBallSkin() {
    }

    final boolean c(int param0) {
        if (param0 != 2) {
          this.groupName((byte) -23, 90);
          return false;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        field_l = null;
        createPassword = null;
        if (param0 != 8) {
          PolarBallSkin.a((byte) 80, true);
          field_m = (boolean[][]) null;
          return;
        }
        field_m = (boolean[][]) null;
    }

    final int ballColor(int param0, boolean param1) {
        int var3;
        int var4;
        var4 = Pool.field_O;
        var3 = param0;
        if (var3 == 0) {
          return 13421772;
        }
        if (1 == var3) {
          return this.b(0, (byte) -102);
        }
        if (2 == var3) {
          return this.b(0, (byte) -102);
        }
        if (var3 == 3) {
          return this.b(0, (byte) -102);
        }
        if (4 == var3) {
          return this.b(0, (byte) -102);
        }
        if (var3 == 5) {
          return this.b(0, (byte) -102);
        }
        if (var3 == 6) {
          return this.b(0, (byte) -102);
        }
        if (var3 == 7) {
          return this.b(0, (byte) -102);
        }
        if (var3 == 8) {
          return 3355443;
        }
        if (var3 == 9) {
          return this.b(1, (byte) -102);
        }
        if (var3 == 10) {
          return this.b(1, (byte) -102);
        }
        if (var3 == 11) {
          return this.b(1, (byte) -102);
        }
        if (var3 == 12) {
          return this.b(1, (byte) -102);
        }
        if (var3 == 13) {
          return this.b(1, (byte) -102);
        }
        if (var3 == 14) {
          return this.b(1, (byte) -102);
        }
        if (var3 == 15) {
          return this.b(1, (byte) -102);
        }
        if (param1) {
          return 16711935;
        }
        field_q = true;
        return 16711935;
    }

    final void loadTopBarSprites(int param0, ResourceArchive param1) {
        if (param0 != 198123656) {
          return;
        }
        try {
          this.field_e = NameEntryPopup.a(0, "", param1, "top_bar_balls_polar");
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "to.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        TabbedPane.field_Ub.renderWidgetPassesAndTooltip(0, (byte) 92, 0);
        int var2 = -32 % ((37 - param0) / 60);
    }

    final String groupName(byte param0, int param1) {
        if (param0 >= 9) {
          return param1 == 0 ? AnimatedNotification.ballsetPolarGroup0 : WhirlpoolHasher.ballsetPolarGroup1;
        }
        field_l = (PcmSample) null;
        return param1 == 0 ? AnimatedNotification.ballsetPolarGroup0 : WhirlpoolHasher.ballsetPolarGroup1;
    }

    final static LoginMethod[] a(byte param0) {
        if (param0 == -66) {
          return new LoginMethod[]{SocialListEntry.field_Xb, SocketArchiveNetworkClient.field_v, BitmapTextLayout.field_l};
        }
        field_p = 19;
        return new LoginMethod[]{SocialListEntry.field_Xb, SocketArchiveNetworkClient.field_v, BitmapTextLayout.field_l};
    }

    static {
        field_p = 0;
        field_q = false;
        createPassword = "Password: ";
        field_m = new boolean[][]{new boolean[]{false, false, false, false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false, false, false, false}, new boolean[]{false, false}};
    }
}
