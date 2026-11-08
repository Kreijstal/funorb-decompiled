/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class WelcomeDialog extends MessageDialog {
    static String field_J;
    static int[] field_F;
    static int field_G;
    static UiLayoutNode[] field_H;
    static int field_I;

    final static PlayerInputEvent createKeypressEvent(int param0, int param1, int param2) {
        if (param0 != 1) {
          return (PlayerInputEvent) null;
        }
        return new PlayerInputEvent(1, param1, param2, (byte) 0, (byte) 0);
    }

    WelcomeDialog() {
        super(23);
    }

    final static boolean negate(boolean param0, byte param1) {
        if (param1 != -48) {
          WelcomeDialog.releaseStatics(120);
        }
        return !param0 ? true : false;
    }

    final static void c(int param0, boolean param1) {
        if (param0 != 100) {
          WelcomeDialog.c(23, true);
        }
        PlayerPortraitCacheEntry.a(true, param1, (byte) 39);
    }

    final void handleResult(int param0, int param1) {
        super.handleResult(75, param1);
        if (param0 < 60) {
          return;
        }
        if (param1 == 1) {
          MatchHudRoutingSupport.a((byte) 29, true, NineSlicePanelPainter.field_f);
        }
    }

    final static PlayerStats a(long param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        PlayerStats stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_19_3;
        PlayerStats stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_25_3;
        PlayerStats stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_31_3;
        long var6;
        Random var8;
        PlayerStats var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var10Lifetime1;
        int var13Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        var16 = Kickabout.field_G;
        param2 = param2 & 15;
        if (param3 > -37) {
          WelcomeDialog.a(-62L, -5, -19, -99, -27);
        }
        var6 = param0;
        var6 = var6 ^ (long)(2 + param4);
        var6 = ModalPanel.rotateLeftLong(4, (byte) -80, var6);
        var6 = var6 ^ (long)(1 + param1);
        var6 = ModalPanel.rotateLeftLong(4, (byte) 115, var6);
        var6 = var6 ^ (long)(1 + param2);
        var6 = ModalPanel.rotateLeftLong(4, (byte) -119, var6);
        var8 = new Random(var6);
        var9 = new PlayerStats();
        var9.field_c = true;
        if (param4 == -1) {
          var9.archetype = param1 / 2;
          if (var9.archetype == 2) {
            var9.archetype = 3;
          } else {
            if (var9.archetype == 3) {
              var9.archetype = 2;
            }
          }
          var10 = 50 + param1 % 2 * 50;
          var9.tackle = var10;
          var9.power = var10;
          var9.experience = 0;
          var9.speed = var10;
          var11 = 1;
          if (2 == var9.archetype) {
            var11 = 3;
          }
          var9.trinketIds = new int[var11];
          if (var9.archetype == 2) {
            var9.trinketIds[0] = 3;
            for (var12 = 1; var9.trinketIds.length > var12; var12++) {
              var9.trinketIds[var12] = ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-115, 4, var8);
            }
          } else {
            for (var12 = 0; var12 < var9.trinketIds.length; var12++) {
              if (2 == param1) {
                var9.trinketIds[var12] = 0;
              } else {
                if (param1 > 2 &&
                  5 > param1) {
                  var9.trinketIds[var12] = ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-118, 2, var8);
                } else {
                  var9.trinketIds[var12] = ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(120, 3, var8);
                }
              }
            }
          }
        } else {
          stackIn_6_0 = (3 <= param4) ? 2 : 3;
          var10 = stackIn_6_0;
          var9.archetype = param1 / var10;
          if (var9.archetype == 2) {
            var9.archetype = 3;
          } else {
            if (var9.archetype == 3) {
              var9.archetype = 2;
            }
          }
          if (param4 < 2 &&
            var9.archetype == 2) {
            var9.archetype = 3;
          }
          var11 = 40 + ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-69, 4, var8) * 10;
          if (var9.archetype == 0) {
            stackIn_18_0 = var9;
            stackIn_18_1 = ServerTextTemplate.field_d[param4];
            stackIn_18_2 = 86;
            if (param4 == 0) {
              stackIn_19_3 = 6;
            } else {
              stackIn_19_3 = 11;
            }
            stackIn_18_0.tackle = stackIn_18_1 + ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(stackIn_18_2, stackIn_19_3, var8);
            var9.speed = var11 * var9.tackle / 100;
            var9.power = (100 - var11) * var9.tackle / 100;
          }
          if (var9.archetype == 3) {
            stackIn_24_0 = var9;
            stackIn_24_1 = ServerTextTemplate.field_d[param4];
            stackIn_24_2 = -60;
            if (param4 == 0) {
              stackIn_25_3 = 6;
            } else {
              stackIn_25_3 = 11;
            }
            stackIn_24_0.speed = stackIn_24_1 + ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(stackIn_24_2, stackIn_25_3, var8);
            var9.tackle = var11 * var9.speed / 100;
            var9.power = (100 - var11) * var9.speed / 100;
          }
          if (var9.archetype == 1) {
            stackIn_30_0 = var9;
            stackIn_30_1 = ServerTextTemplate.field_d[param4];
            stackIn_30_2 = -66;
            if (param4 == 0) {
              stackIn_31_3 = 6;
            } else {
              stackIn_31_3 = 11;
            }
            stackIn_30_0.power = stackIn_30_1 + ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(stackIn_30_2, stackIn_31_3, var8);
            var9.speed = var9.power * var11 / 100;
            var9.tackle = (-var11 + 100) * var9.power / 100;
          }
          if (2 == var9.archetype) {
            var12 = ServerTextTemplate.field_d[param4] + ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-41, 11, var8);
            var11 = ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(81, 3, var8) * 10 + 60;
            var9.tackle = var12 * var11 / 100;
            var11 = 60 + ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-90, 3, var8) * 10;
            var9.speed = var12 * var11 / 100;
            var11 = 60 + ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(127, 3, var8) * 10;
            var9.power = var12 * var11 / 100;
          }
          var9.experience = 0;
          if (var9.tackle > 80) {
            var9.tackle = 80;
          }
          if (var9.speed > 80) {
            var9.speed = 80;
          }
          if (var9.power > 80) {
            var9.power = 80;
          }
          var12 = 0;
          if (var9.archetype != 2) {
            var12++;
            if (param4 >= 4 &&
              ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(89, 2, var8) == 0) {
              var12++;
            }
          } else {
            var12++;
            if (param4 >= 5) {
              var12++;
            }
            if (0 == ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-73, 2, var8)) {
              var12++;
            }
          }
          var9.trinketIds = new int[var12];
          if (2 == var9.archetype) {
            var9.trinketIds[0] = 3;
            for (var13 = 1; var9.trinketIds.length > var13; var13++) {
              var14 = ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-89, 100, var8);
              for (var15 = 0; var15 < LoginDialog.field_eb[param4].length; var15++) {
                if (var14 > LoginDialog.field_eb[param4][var15]) {
                  var14 = var14 - LoginDialog.field_eb[param4][var15];
                  continue;
                }
                var9.trinketIds[var13] = var15;
                break;
              }
            }
          } else {
            for (var13 = 0; var9.trinketIds.length > var13; var13++) {
              {
                if (param4 >= 2) {
                  var14 = ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(122, 100, var8);
                  var17 = 0;
                  var15 = var17;
                  while (SingleChildContainer.field_v[param4].length > var17) {
                    if (var14 <= SingleChildContainer.field_v[param4][var17]) {
                      var9.trinketIds[var13] = var17;
                      break;
                    }
                    var14 = var14 - SingleChildContainer.field_v[param4][var17];
                    var17++;
                  }
                } else {
                  var9.trinketIds[var13] = 0;
                }
              }
            }
          }
        }
        var9.initialIndex = ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-67, TrinketCatalog.field_a.length, var8);
        var9.surnameIndex = ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-98, BuyPlayerDialog.field_G[var9.archetype].length - 1, var8) + 1;
        var10Lifetime1 = ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-62, 5, var8);
        var11Lifetime1 = ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-114, 3, var8);
        var12Lifetime1 = ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-41, 3, var8);
        var13Lifetime1 = var12Lifetime1;
        var13Lifetime1 = var13Lifetime1 | var11Lifetime1 << 4;
        var13Lifetime1 = var13Lifetime1 | var10Lifetime1 << 8;
        var9.appearance = var13Lifetime1;
        return var9;
    }

    public static void releaseStatics(int param0) {
        field_H = null;
        field_F = null;
        if (param0 != 100) {
          WelcomeDialog.negate(false, (byte) -43);
        }
        field_J = null;
    }

    static {
        field_J = "To server list";
        field_F = CachedTextLayout.c(-23091);
        field_I = 0;
    }
}
