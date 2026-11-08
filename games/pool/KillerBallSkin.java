/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KillerBallSkin extends BallSkin {
    static String createDisplayname;
    static Sprite field_n;
    static UiComponent field_p;
    static int[] field_r;
    static String unpackingMusic;
    static int[] field_o;
    static int field_m;

    final static void a(int param0, boolean param1, boolean param2, MusicTrack param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        RuntimeException var4_ref = null;
        try {
          if (AnimatedNotification.field_u != param3) {
            var4 = RankingsScreen.field_N;
            synchronized (var4) {
              RankingsScreen.field_N.setChannelVolumeScale((byte) -121, -1, 256);
              AnimatedNotification.field_u = param3;
              RankingsScreen.field_N.loadScoreAndResetSynthesis(param3, param1, (byte) -14, param2);
            }
          }
          if (param0 != 256) {
            field_p = (UiComponent) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_11_0 = var4_ref;
          stackIn_11_1 = new StringBuilder().append("ac.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final int ballColor(int param0, boolean param1) {
        int var3;
        int var4;
        ResourceArchive var5;
        int var3Lifetime1;
        var4 = Pool.field_O;
        if (param1) {
          var3 = param0;
          if (var3 == 0) {
            return 13421772;
          }
          if (1 == var3) {
            return this.c(91, 0);
          }
          if (var3 == 2) {
            return this.c(91, 0);
          }
          if (var3 == 3) {
            return this.c(91, 0);
          }
          if (var3 == 4) {
            return this.c(91, 0);
          }
          if (5 == var3) {
            return this.c(91, 0);
          }
          if (6 == var3) {
            return this.c(91, 0);
          }
          if (7 == var3) {
            return this.c(91, 0);
          }
          if (var3 == 8) {
            return 3355443;
          }
          if (var3 == 9) {
            return this.c(101, 1);
          }
          if (10 == var3) {
            return this.c(101, 1);
          }
          if (var3 == 11) {
            return this.c(101, 1);
          }
          if (var3 == 12) {
            return this.c(101, 1);
          }
          if (13 == var3) {
            return this.c(101, 1);
          }
          if (var3 == 14) {
            return this.c(101, 1);
          }
          if (var3 != 15) {
            return 16711935;
          }
          return this.c(101, 1);
        }
        var5 = (ResourceArchive) null;
        this.loadTopBarSprites(-117, (ResourceArchive) null);
        var3Lifetime1 = param0;
        if (var3Lifetime1 == 0) {
          return 13421772;
        }
        if (1 == var3Lifetime1) {
          return this.c(91, 0);
        }
        if (var3Lifetime1 == 2) {
          return this.c(91, 0);
        }
        if (var3Lifetime1 == 3) {
          return this.c(91, 0);
        }
        if (var3Lifetime1 == 4) {
          return this.c(91, 0);
        }
        if (5 == var3Lifetime1) {
          return this.c(91, 0);
        }
        if (6 == var3Lifetime1) {
          return this.c(91, 0);
        }
        if (7 == var3Lifetime1) {
          return this.c(91, 0);
        }
        if (var3Lifetime1 == 8) {
          return 3355443;
        }
        if (var3Lifetime1 == 9) {
          return this.c(101, 1);
        }
        if (10 == var3Lifetime1) {
          return this.c(101, 1);
        }
        if (var3Lifetime1 == 11) {
          return this.c(101, 1);
        }
        if (var3Lifetime1 == 12) {
          return this.c(101, 1);
        }
        if (13 == var3Lifetime1) {
          return this.c(101, 1);
        }
        if (var3Lifetime1 == 14) {
          return this.c(101, 1);
        }
        if (var3Lifetime1 == 15) {
          return this.c(101, 1);
        }
        return 16711935;
    }

    final String groupName(byte param0, int param1) {
        if (param0 < 9) {
          return (String) null;
        }
        if (param1 == 0) {
          return MembershipBenefitsLoader.ballsetEnglishGroup0;
        }
        return MembershipBenefitsLoader.ballsetEnglishGroup0;
    }

    final boolean c(int param0) {
        if (param0 != 2) {
          unpackingMusic = (String) null;
          return false;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        if (param0 >= 78) {
          createDisplayname = null;
          field_n = null;
          unpackingMusic = null;
          field_p = null;
          field_o = null;
          field_r = null;
          return;
        }
        KillerBallSkin.releaseStatics(94);
        createDisplayname = null;
        field_n = null;
        unpackingMusic = null;
        field_p = null;
        field_o = null;
        field_r = null;
    }

    private final int c(int param0, int param1) {
        if (param0 <= 75) {
          KillerBallSkin.releaseStatics(-122);
          if (param1 == 0) {
            return 13158;
          }
          if (param1 == 1) {
            return 6715289;
          }
          return 16777215;
        }
        if (param1 == 0) {
          return 13158;
        }
        if (param1 == 1) {
          return 6715289;
        }
        return 16777215;
    }

    final void loadTopBarSprites(int param0, ResourceArchive param1) {
        try {
          if (param0 != 198123656) {
            this.c(45);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ac.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0, byte param1) {
        int var2 = 99 % ((-11 - param1) / 49);
        ArrayWidgetGroup.field_M = ArrayWidgetGroup.field_M + param0;
        AccountStateQuery.field_q = (Js5Transport.field_q.field_y + CollisionContact.field_h.maxAscent >> 1) + ArrayWidgetGroup.field_M;
    }

    final void loadBallMeshes(ResourceArchive param0, byte param1) {
        MeshBuilder dupTemp$0 = null;
        if (this.field_a != null) {
          return;
        }
        try {
          this.field_a = new MeshBuilder[16];
          this.field_a[0] = this.createSphereMesh(-930305852);
          dupTemp$0 = MeshBuilder.loadFromArchive(param0, "", "balls/ball_killer_red");
          this.field_a[15] = dupTemp$0;
          this.field_a[14] = dupTemp$0;
          this.field_a[13] = dupTemp$0;
          this.field_a[12] = dupTemp$0;
          this.field_a[11] = dupTemp$0;
          this.field_a[10] = dupTemp$0;
          this.field_a[9] = dupTemp$0;
          this.field_a[7] = dupTemp$0;
          this.field_a[6] = dupTemp$0;
          this.field_a[5] = dupTemp$0;
          this.field_a[4] = dupTemp$0;
          this.field_a[3] = dupTemp$0;
          this.field_a[2] = dupTemp$0;
          this.field_a[1] = dupTemp$0;
          this.field_a[8] = MeshBuilder.loadFromArchive(param0, "", "balls/ball_killer_black");
          if (param1 != 117) {
            this.c(40);
          }
          this.field_a[1].scaleVertices(8, 8, 8, 4);
          this.field_a[8].scaleVertices(8, 8, 8, 4);
          IsaacCipher.a(this.field_a[1], 0);
          IsaacCipher.a(this.field_a[8], 0);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ac.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    KillerBallSkin() {
        this.field_g = false;
    }

    static {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        createDisplayname = "Player Name: ";
        unpackingMusic = "Unpacking music";
        field_r = new int[]{2, 20, 21, 49, 6, 5, 9};
        field_o = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
          var4 = (long)((var0 << 1) - 1);
          var6 = (long)((var0 << 1) + 1);
          var2 = (int)(-32768L + (var4 * var4 >> 18));
          var3 = (int)(-32768L + (var6 * var6 >> 18));
          if (field_o.length <= var3) {
            var3 = -1 + field_o.length;
          }
          for (var1 = var2 >= 0 ? var2 : 0; var3 >= var1; var1++) {
            field_o[var1] = var0;
          }
        }
        field_m = -1;
    }
}
