/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static String decisionButtonPass;
    static int field_e;
    static String unableToAddIgnore;
    static ResourceArchive field_h;
    static ResourceArchive field_c;
    static UiComponent field_b;
    static String fsAcceptCountdownSing;
    static int field_a;
    static int field_f;
    static UiComponent field_d;

    final static void handleSocialListUpdate(int param0) {
        int stackIn_44_0 = 0;
        LobbyPlayer stackIn_51_0 = null;
        boolean stackIn_52_1 = false;
        LobbyPlayer stackIn_111_0 = null;
        boolean stackIn_112_1 = false;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var4_long = 0L;
        LobbyPlayer var4_ref_im = null;
        LobbyGame var5 = null;
        int var5_int = 0;
        int var6 = 0;
        LobbyGame var7 = null;
        LobbyPlayer var8 = null;
        int var9 = 0;
        LobbyPlayer var9_ref_im = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        LobbyGame var13 = null;
        Object var16 = null;
        LobbyGame var16_ref = null;
        Object var17 = null;
        Object var18 = null;
        LobbyGame var18_ref = null;
        Object var19 = null;
        LobbyPlayer var20 = null;
        Object var21 = null;
        LobbyGame var21_ref = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        LobbyPlayer var25 = null;
        LobbyPlayer var26 = null;
        LobbyPlayer var27 = null;
        String var28 = null;
        String var29 = null;
        LobbyPlayer var30 = null;
        LobbyPlayer var31 = null;
        LobbyGame var32 = null;
        LobbyGame var33 = null;
        LobbyPlayer var34 = null;
        LobbyGame var35 = null;
        LobbyPlayer var4_ref_imLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        long var4_longLifetime1;
        long var4_longLifetime2;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var4Lifetime4;
        int var4Lifetime5;
        int var4Lifetime6;
        long var4_longLifetime2Lifetime1;
        int var6Lifetime1Lifetime1;
        var17 = null;
        var19 = null;
        var18 = null;
        var21 = null;
        var16 = null;
        var12 = Pool.field_O;
        try {
          var1 = PlayerContextMenu.field_e;
          var2 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(-113);
          var3 = -75 % ((-53 - param0) / 36);
          if (var2 != 0 &&
            var2 != 1 &&
            var2 != 2 &&
            var2 != 3 &&
            var2 != 4) {
            if (var2 == 5) {
              var4_long = ((PacketBuffer) ((Object) var1)).readLong(-412303328);
              var23 = ((PacketBuffer) ((Object) var1)).j(-68);
              var22 = ((PacketBuffer) ((Object) var1)).j(-104);
              var24 = ((PacketBuffer) ((Object) var1)).j(-29);
              var25 = mg.a(0, var4_long);
              var9_ref_im = var25;
              stackIn_44_0 = (var22.equals("")) ? 0 : 1;
              var10 = stackIn_44_0;
              if (var25 != null) {
                if (var10 != 0) {
                  var25.updateNames(var23, (byte) 1, var24);
                }
              } else {
                var9_ref_im = new LobbyPlayer(var23, var24, var4_long);
                ln.field_n.put(-6946, var4_long, var9_ref_im);
              }
              var9_ref_im.field_Mb = rl.monotonicTimeMillis((byte) -99) - (long)((PacketBuffer) ((Object) var1)).readInt(true);
              var9_ref_im.field_Rb = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-1034);
              var11 = ((PacketBuffer) ((Object) var1)).k(118);
              stackIn_51_0 = var9_ref_im;
              stackIn_52_1 = (0 != (var11 & 1));
              stackIn_51_0.field_Pb = stackIn_52_1;
              var9_ref_im.field_Xb = var11 >> 1;
              var9_ref_im.field_bc = ((PacketBuffer) ((Object) var1)).readUnsignedByte(-68);
              var9_ref_im.field_Nb = ((PacketBuffer) ((Object) var1)).readUnsignedByte(-75);
              DialWidget.a(var9_ref_im, -93);
              return;
            }
            if (6 == var2) {
              var4_longLifetime1 = ((PacketBuffer) ((Object) var1)).readLong(-412303328);
              var6 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(-113);
              var26 = mg.a(0, var4_longLifetime1);
              if (var26 != null) {
                if (var26.field_Yb) {
                  PoolMatchController.field_jb = PoolMatchController.field_jb - 1;
                  var26.field_Yb = false;
                }
                if (var6 != 0) {
                  var26.field_gc = AudioService.field_f;
                  var26.field_hc = var6;
                } else {
                  var26.unlink((byte) -117);
                }
                var26.a(false);
              }
              return;
            }
            if (var2 == 7) {
              var34 = (LobbyPlayer) (IntrusiveNode.field_i.c((byte) -72));
              while (var34 != null) {
                var34.unlink((byte) -117);
                var34.a(false);
                var34 = (LobbyPlayer) (IntrusiveNode.field_i.f((byte) -5));
              }
              PoolMatchController.field_jb = 0;
              return;
            }
            if (var2 == 8) {
              var4 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-1034);
              var5 = (LobbyGame) (lf.field_a.findFirst((long)var4, false));
              if (var5 == null) {
                var5 = new LobbyGame(dr.field_c);
                lf.field_a.put(-6946, (long)var4, var5);
              }
              d.a(var5, -13, var1, true);
              TextureCache.a(-115, var5);
              return;
            }
            if (9 == var2) {
              var4Lifetime4 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-1034);
              var5_int = ((PacketBuffer) ((Object) var1)).readUnsignedByte(-117);
              var16_ref = (LobbyGame) (lf.field_a.findFirst((long)var4Lifetime4, false));
              var33 = var16_ref;
              if (var16_ref == null) {
                return;
              }
              if (0 == var5_int) {
                var33.unlink((byte) -117);
              } else {
                var16_ref.field_Mb = AudioService.field_f;
                var16_ref.field_Fc = var5_int;
              }
              var33.a(false);
              return;
            }
            if (var2 == 10) {
              var35 = (LobbyGame) (NetworkGameClient.field_A.c((byte) 83));
              while (var35 != null) {
                var35.unlink((byte) -117);
                var35.a(false);
                var35 = (LobbyGame) (NetworkGameClient.field_A.f((byte) -5));
              }
              return;
            }
            if (11 != var2 &&
              var2 != 12) {
              if (var2 == 13) {
                var4Lifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-1034);
                var5_intLifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(-98);
                var18_ref = (LobbyGame) (lf.field_a.findFirst((long)var4Lifetime5, false));
                if (var18_ref != null) {
                  var18_ref.field_fc = false;
                  var13 = var18_ref;
                  var7 = var13;
                  if (var5_intLifetime1 != 0) {
                    var18_ref.field_Mb = AudioService.field_f;
                    var18_ref.field_Fc = var5_intLifetime1;
                  }
                  var13.field_Xb = false;
                  TextureCache.a(-75, var18_ref);
                }
                return;
              }
              if (var2 != 14 &&
                16 != var2) {
                if (var2 != 15 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var4_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong(-412303328);
                    var28 = ((PacketBuffer) ((Object) var1)).j(-46);
                    var29 = ((PacketBuffer) ((Object) var1)).j(-40);
                    var8 = QuickChatHelpDialog.b(var4_longLifetime2, 0);
                    if (var8 == null) {
                      var8 = new LobbyPlayer(var28, var29, var4_longLifetime2);
                      LobbyPlayer.field_Qb.put(-6946, var4_longLifetime2, var8);
                      HighscoresScreen.field_L.field_mc = HighscoresScreen.field_L.field_mc + 1;
                    }
                    var8.field_Rb = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-1034);
                    var9 = ((PacketBuffer) ((Object) var1)).k(-82);
                    stackIn_111_0 = var8;
                    stackIn_112_1 = ((var9 & 1) != 0);
                    stackIn_111_0.field_Pb = stackIn_112_1;
                    var8.field_Xb = var9 >> 1;
                    var8.field_bc = ((PacketBuffer) ((Object) var1)).readUnsignedByte(-96);
                    var8.field_Nb = ((PacketBuffer) ((Object) var1)).readUnsignedByte(-92);
                    ck.field_W.b((byte) 89, var8);
                    return;
                  }
                  if (var2 == 19) {
                    var4_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong(-412303328);
                    var6Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(-128);
                    var20 = QuickChatHelpDialog.b(var4_longLifetime2, 0);
                    var27 = var20;
                    if (var27 == null) {
                      return;
                    }
                    if (0 == var6Lifetime1) {
                      var27.unlink((byte) -117);
                    } else {
                      var27.field_gc = AudioService.field_f;
                      var27.field_hc = var6Lifetime1;
                    }
                    var27.a(false);
                    HighscoresScreen.field_L.field_mc = HighscoresScreen.field_L.field_mc - 1;
                    return;
                  }
                  if (20 == var2) {
                    d.a(HighscoresScreen.field_L, -116, var1, false);
                    return;
                  }
                  if (var2 == 21) {
                    var4Lifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-1034);
                    if (var4Lifetime5 != 0) {
                      StrongCacheEntry.field_K = rl.monotonicTimeMillis((byte) -124) + (long)var4Lifetime5;
                      return;
                    }
                    StrongCacheEntry.field_K = 0L;
                    return;
                  }
                  if (var2 == 22) {
                    mg.field_d = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-1034);
                    TutorialSelectScreen.field_I = ((PacketBuffer) ((Object) var1)).k(-66);
                    return;
                  }
                  if (var2 == 23) {
                    BitmapTextLayout.field_m = ((PacketBuffer) ((Object) var1)).readLong(-412303328);
                    return;
                  }
                  GrowableIntList.reportClientError((Throwable) null, "L1: " + t.formatPacketDump(120), -8555);
                  dn.c(-119);
                  return;
                }
                var4_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong(-412303328);
                var6Lifetime1Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(-77);
                var30 = mg.a(0, var4_longLifetime2);
                if (var30 == null) {
                  return;
                }
                if (0 != var6Lifetime1Lifetime1) {
                  var30.field_gc = AudioService.field_f;
                  var30.field_hc = var6Lifetime1Lifetime1;
                }
                if (15 == var2) {
                  var30.field_mc = false;
                } else {
                  if (var30.field_Yb) {
                    PoolMatchController.field_jb = PoolMatchController.field_jb - 1;
                    var30.field_Yb = false;
                  }
                }
                DialWidget.a(var30, -94);
                return;
              }
              var4_longLifetime2Lifetime1 = ((PacketBuffer) ((Object) var1)).readLong(-412303328);
              var31 = mg.a(0, var4_longLifetime2Lifetime1);
              if (var31 == null) {
                return;
              }
              if (var2 == 14) {
                var31.field_mc = true;
              } else {
                if (!var31.field_Yb) {
                  var31.field_Yb = true;
                  PoolMatchController.field_jb = PoolMatchController.field_jb + 1;
                }
              }
              DialWidget.a(var31, -118);
              return;
            }
            var4Lifetime6 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-1034);
            var21_ref = (LobbyGame) (lf.field_a.findFirst((long)var4Lifetime6, false));
            var32 = var21_ref;
            if (var32 != null) {
              if (11 != var2) {
                var32.field_fc = true;
              } else {
                var32.field_Xb = true;
              }
              TextureCache.a(-94, var32);
            }
            return;
          }
          var4_ref_im = (LobbyPlayer) (ck.field_W.c((byte) -33));
          while (var4_ref_im != null) {
            var4_ref_im.unlink((byte) -117);
            var4_ref_im.a(false);
            var4_ref_im = (LobbyPlayer) (ck.field_W.f((byte) -5));
          }
          var4_ref_imLifetime1 = (LobbyPlayer) (ln.field_n.firstForIteration((byte) -126));
          while (var4_ref_imLifetime1 != null) {
            if (var4_ref_imLifetime1.field_mc ||
              var4_ref_imLifetime1.field_Yb) {
              if (var4_ref_imLifetime1.field_Yb) {
                var4_ref_imLifetime1.field_Yb = false;
                PoolMatchController.field_jb = PoolMatchController.field_jb - 1;
              }
              var4_ref_imLifetime1.field_mc = false;
              DialWidget.a(var4_ref_imLifetime1, -111);
            }
            var4_ref_imLifetime1 = (LobbyPlayer) (ln.field_n.nextForIteration(127));
          }
          if (var2 == 1 &&
            HighscoresScreen.field_L != null) {
            nl.field_d = HighscoresScreen.field_L.field_Ob;
          }
          if (var2 != 4) {
            HighscoresScreen.field_L = null;
          } else {
            var4Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-1034);
            HighscoresScreen.field_L = new LobbyGame(dr.field_c);
            HighscoresScreen.field_L.a((long)var4Lifetime1, 45);
            d.a(HighscoresScreen.field_L, 119, var1, false);
            StrongCacheEntry.field_K = 0L;
          }
          if (var2 != 2 &&
            var2 != 3) {
            tp.field_e = null;
          } else {
            if (tp.field_e == null) {
              tp.field_e = new LobbyGame(dr.field_c);
            }
          }
          if (3 != var2) {
            LobbyGame.field_Ac = false;
            return;
          }
          LobbyGame.field_Ac = true;
          for (var4Lifetime2 = 0; var4Lifetime2 < md.field_c.length; var4Lifetime2++) {
            md.field_c[var4Lifetime2] = ((PacketBuffer) ((Object) var1)).readByte((byte) 105);
          }
          pm.field_l = ((PacketBuffer) ((Object) var1)).readUnsignedByte(-67);
          FreePlayRules.field_l = ((PacketBuffer) ((Object) var1)).readUnsignedByte(-108);
          for (var4Lifetime3 = 0; AgeValidator.field_s.length > var4Lifetime3; var4Lifetime3++) {
            AgeValidator.field_s[var4Lifetime3] = ((PacketBuffer) ((Object) var1)).readByte((byte) 105);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "rl.A(" + param0 + ')');
        }
    }

    final synchronized static long monotonicTimeMillis(byte param0) {
        if (param0 >= -92) {
          return 45L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < ProxySocketConnector.field_g) {
          CheckboxWidget.field_S = CheckboxWidget.field_S + (-var1 + ProxySocketConnector.field_g);
        }
        ProxySocketConnector.field_g = var1;
        return var1 + CheckboxWidget.field_S;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 > -88) {
          field_b = (UiComponent) null;
        }
        field_b = null;
        decisionButtonPass = null;
        field_h = null;
        fsAcceptCountdownSing = null;
        field_c = null;
        unableToAddIgnore = null;
    }

    static {
        unableToAddIgnore = "Unable to add name - system busy";
        decisionButtonPass = "Pass";
        fsAcceptCountdownSing = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
