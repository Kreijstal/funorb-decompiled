/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TikiBallSkin extends BallSkin {
    static int[][] field_o;
    static String[] doubleplusungoodShot;
    static int field_n;
    static Sprite[] field_m;

    final void loadBallMeshes(ResourceArchive param0, byte param1) {
        MeshBuilder dupTemp$1 = null;
        if (null != this.field_a) {
          return;
        }
        this.field_a = new MeshBuilder[16];
        this.field_a[0] = MeshBuilder.loadFromArchive(param0, "", "balls/TIKI/tiki_ball_white");
        MeshBuilder dupTemp$0 = MeshBuilder.loadFromArchive(param0, "", "balls/TIKI/tiki_ball_1");
        this.field_a[7] = dupTemp$0;
        this.field_a[6] = dupTemp$0;
        this.field_a[5] = dupTemp$0;
        this.field_a[4] = dupTemp$0;
        this.field_a[3] = dupTemp$0;
        this.field_a[2] = dupTemp$0;
        this.field_a[1] = dupTemp$0;
        if (param1 != 117) {
          return;
        }
        try {
          this.field_a[8] = MeshBuilder.loadFromArchive(param0, "", "balls/TIKI/tiki_ball_black");
          dupTemp$1 = MeshBuilder.loadFromArchive(param0, "", "balls/TIKI/tiki_ball_2");
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
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "jr.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int themeColorForGroup(byte param0, int param1) {
        if (param0 >= -110) {
          TikiBallSkin.expireLobbyRowTransitions(-76);
        }
        if (param1 != 0) {
          if (param1 == 1) {
            return 6697779;
          }
          return 16777215;
        }
        return 7824981;
    }

    final boolean usesNumberedBallLabels(int obfuscationGuard) {
        if (obfuscationGuard != 2) {
          field_n = -44;
          return false;
        }
        return false;
    }

    final int ballColor(int param0, boolean param1) {
        int var3;
        int var4;
        var4 = Pool.field_O;
        if (!param1) {
          this.usesNumberedBallLabels(13);
        }
        var3 = param0;
        if (var3 == 0) {
          return 13421772;
        }
        if (1 != var3 &&
          var3 != 2 &&
          var3 != 3 &&
          4 != var3 &&
          var3 != 5 &&
          6 != var3 &&
          var3 != 7) {
          if (8 == var3) {
            return 3355443;
          }
          if (var3 != 9 &&
            10 != var3 &&
            var3 != 11 &&
            12 != var3 &&
            var3 != 13) {
            if (14 == var3) {
              return this.themeColorForGroup((byte) -118, 1);
            }
            if (var3 != 15) {
              return 16711935;
            }
          }
          return this.themeColorForGroup((byte) -118, 1);
        }
        return this.themeColorForGroup((byte) -113, 0);
    }

    final static byte[] whirlpoolDigest(int length, byte obfuscationGuard, byte[] source, int offset) {
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        WhirlpoolHasher var5 = null;
        byte[] var6 = null;
        var7 = Pool.field_O;
        try {
          if (0 < offset) {
            var8 = new byte[length];
            var4 = var8;
            for (var5_int = 0; var5_int < length; var5_int++) {
              var8[var5_int] = source[var5_int + offset];
            }
          } else {
            var4 = source;
          }
          var5 = new WhirlpoolHasher();
          var5.reset(false);
          var5.updateBits(var4, 0, (long)(8 * length));
          var6 = new byte[64];
          if (obfuscationGuard >= -42) {
            TikiBallSkin.releaseStatics(-82);
          }
          var5.finish(var6, (byte) 105, 0);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("jr.E(").append(length).append(',').append(obfuscationGuard).append(',');
          if (source == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(offset).append(')').toString());
        }
    }

    final String groupName(byte param0, int param1) {
        if (param0 < 9) {
          this.usesNumberedBallLabels(-109);
        }
        return 0 == param1 ? BirthDateValidator.ballsetSpaceGroup0 : TransformRotationSupport.field_g;
    }

    final void loadTopBarSprites(int param0, ResourceArchive param1) {
        try {
          this.field_e = NameEntryPopup.loadSpritesByName(param0 ^ param0, "", param1, "top_bar_balls_jungle");
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "jr.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_m = null;
        doubleplusungoodShot = null;
        field_o = (int[][]) null;
        if (param0 != 10860) {
          field_o = (int[][]) null;
        }
    }

    final static void expireLobbyRowTransitions(int obfuscationGuard) {
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        LobbyPlayer var1 = null;
        LobbyGame var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        LobbyPlayer var1Lifetime1;
        var2 = Pool.field_O;
        try {
          var1 = (LobbyPlayer) (IntrusiveNode.field_i.last((byte) -48));
          while (var1 != null) {
            if (var1.field_gc > 0) {
              var1.field_gc = var1.field_gc - 1;
              if (var1.field_gc == 0) {
                var1.field_hc = 0;
                if (var1.isUnindexed(true)) {
                  var1.unlink((byte) -117);
                }
              }
            }
            var1 = (LobbyPlayer) (IntrusiveNode.field_i.previous((byte) -5));
          }
          var1_ref = (LobbyGame) (NetworkGameClient.field_A.last((byte) 123));
          while (var1_ref != null) {
            if (var1_ref.field_Mb > 0) {
              var1_ref.field_Mb = var1_ref.field_Mb - 1;
              if (var1_ref.field_Mb == 0) {
                var1_ref.field_Fc = 0;
                if (var1_ref.isUnindexed(-14144)) {
                  var1_ref.unlink((byte) -117);
                }
              }
            }
            var1_ref = (LobbyGame) (NetworkGameClient.field_A.previous((byte) -5));
          }
          if (obfuscationGuard != -8) {
            return;
          }
          var1Lifetime1 = (LobbyPlayer) (ValidationMessageWidget.field_W.last((byte) 65));
          while (var1Lifetime1 != null) {
            stackIn_24_0 = ~var1Lifetime1.field_gc;
            if (stackIn_24_0 < -1) {
              var1Lifetime1.field_gc = var1Lifetime1.field_gc - 1;
              if (0 != var1Lifetime1.field_gc) {
                var1Lifetime1 = (LobbyPlayer) (ValidationMessageWidget.field_W.previous((byte) -5));
                continue;
              }
              var1Lifetime1.field_hc = 0;
              if (var1Lifetime1.isUnindexed(true)) {
                var1Lifetime1.unlink((byte) -117);
              }
            }
            var1Lifetime1 = (LobbyPlayer) (ValidationMessageWidget.field_W.previous((byte) -5));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref2), "jr.F(" + obfuscationGuard + ')');
        }
    }

    final static Sprite[] createPanelSprites(int param0, byte param1, int param2) {
        if (param1 != 20) {
          return (Sprite[]) null;
        }
        return TutorialFactory.createPanelSpritesWithCenter(1, 4578, param0, param2);
    }

    TikiBallSkin() {
    }

    static {
        doubleplusungoodShot = new String[]{"Horrendous!", "Horrific!", "How disappointing..."};
        field_n = 0;
    }
}
