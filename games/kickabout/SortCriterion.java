/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SortCriterion {
    static SortCriterion field_k;
    static int[] field_j;
    static String field_b;
    int field_i;
    static String field_c;
    static TournamentLobbyScreen field_l;
    static ConsoleExpression[] field_a;
    static DualLinkHashTable field_f;
    static String field_d;
    static ResourceArchive field_h;
    static String field_m;
    static String[] field_g;
    static String field_e;

    final static void a(boolean param0, byte param1) {
        AuctionLogEntry.drawSharedChatInterface(param0, 0);
        if (param1 >= -20) {
          field_a = (ConsoleExpression[]) null;
        }
        ContextMenuItem.drawSharedPopups(true, param0);
    }

    abstract int directionCount(int param0);

    final static IndexedSprite[] a(int param0, int param1, boolean param2, byte param3, int param4, int param5) {
        Sprite[] array$0 = null;
        IndexedSprite[][] stackIn_3_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        IndexedSprite[] var6;
        IndexedSprite[][] var7;
        Sprite[][] var8;
        int var9;
        int var10;
        int var11;
        IndexedSprite var11_ref_kg;
        int var12;
        int var13;
        int var15;
        IndexedSprite var15_ref_kg;
        Sprite var16;
        int var16_int;
        int var17;
        PlayerModelPreview[] var18_ref_nr__;
        int var18;
        int var19;
        PlayerModelPreview var20;
        int var21;
        PlayerModelPreview[][] var22;
        Sprite var23;
        PlayerModelPreview[][] var24;
        int var10Lifetime1;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16_intLifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var19Lifetime1;
        int var16_intLifetime2;
        int var19Lifetime1Lifetime1;
        int var9Lifetime1;
        var21 = Kickabout.field_G;
        var6 = new IndexedSprite[6];
        if (!param2) {
          stackIn_3_0 = LoginCredentials.field_c;
        } else {
          stackIn_3_0 = LineupView.field_s;
        }
        var7 = stackIn_3_0;
        var8 = new Sprite[var7.length][];
        for (var9 = 0; var9 < var8.length; var9++) {
          array$0 = new Sprite[var7[var9].length];
          var8[var9] = array$0;
          for (var10 = 0; var10 < var8[var9].length; var10++) {
            var11_ref_kg = var7[var9][var10];
            var8[var9][var10] = var11_ref_kg.toRgbSprite();
            LoginForm.tintSpriteForSurface(var8[var9][var10], 20684);
          }
        }
        stackIn_12_0 = (!param2) ? 59 : 50;
        var9Lifetime1 = stackIn_12_0;
        if (param3 > -65) {
          return (IndexedSprite[]) null;
        }
        stackIn_17_0 = (param2) ? 34 : 33;
        var10Lifetime1 = stackIn_17_0;
        stackIn_20_0 = (param2) ? 40 : 20;
        var11 = stackIn_20_0;
        stackIn_23_0 = (!param2) ? 4 : 0;
        var12 = stackIn_23_0;
        stackIn_26_0 = (!param2) ? 5 : 3;
        var13 = stackIn_26_0;
        if (!NanoTickClock.field_n) {
          var23 = OverlayLayerSupport.a(param2, param5, (byte) 95);
          PacketBuffer.pushSpriteRaster(121, var23);
          for (var15 = 0; var13 > var15; var15++) {
            if (!param2 ||
              var15 < 2) {
              var16_int = 0;
              var8[0][var15].draw(var16_int, 0);
              var16_int = var16_int + var8[0][var15].field_o;
              for (var17 = 0; var17 < param5; var17++) {
                var8[1][var15].draw(var16_int, 0);
                var16_int = var16_int + var8[1][var15].field_o;
              }
              var8[2][var15].draw(var16_int, 0);
            }
          }
          TeamManagementScreen.e(123);
          var15_ref_kg = SoftwareDrawingSupport.toIndexedSprite(var23);
          for (var16_intLifetime2 = 0; var16_intLifetime2 < 6; var16_intLifetime2++) {
            var6[var16_intLifetime2] = var15_ref_kg;
          }
          return var6;
        }
        var22 = new PlayerModelPreview[var13][param5 + 2];
        var24 = var22;
        for (var15Lifetime1 = 0; var22.length > var15Lifetime1; var15Lifetime1++) {
          for (var16_intLifetime1 = 0; var16_intLifetime1 < var22[0].length; var16_intLifetime1++) {
            regionExit1: {
              if (LoggedPossession.a((byte) -24, 256) <= param1) {
                var17Lifetime1 = 39 + var16_intLifetime1 * var10Lifetime1 + var15Lifetime1;
                var18 = var9Lifetime1 + var15Lifetime1 * var11;
                var19 = LoggedPossession.a((byte) -24, 5);
                if (param2) {
                  var18 = var18 + LoggedPossession.a((byte) -24, 5);
                } else {
                  if (var15Lifetime1 == 0) {
                    if (0 != var19 &&
                      var19 != 2) {
                      var22[var15Lifetime1][var16_intLifetime1] = new PlayerModelPreview(var17Lifetime1, var18, var12, var19);
                      break regionExit1;
                    }
                    var19++;
                  }
                }
                var22[var15Lifetime1][var16_intLifetime1] = new PlayerModelPreview(var17Lifetime1, var18, var12, var19);
              }
            }
          }
        }
        for (var15Lifetime2 = 0; 6 > var15Lifetime2; var15Lifetime2++) {
          DelayedServerPacket.a(100, 9863, (-param0 + param4) * var15Lifetime2 / 6 + param0);
          var16 = OverlayLayerSupport.a(param2, param5, (byte) 95);
          PacketBuffer.pushSpriteRaster(-101, var16);
          for (var17Lifetime2 = 0; var13 > var17Lifetime2; var17Lifetime2++) {
            var18_ref_nr__ = var24[var17Lifetime2];
            for (var19Lifetime1 = 0; var19Lifetime1 < var18_ref_nr__.length; var19Lifetime1++) {
              var20 = var18_ref_nr__[var19Lifetime1];
              if (var20 != null) {
                var20.drawSpectatorFrame(var15Lifetime2, -2);
              }
            }
            if (!param2 ||
              2 > var17Lifetime2) {
              var18Lifetime1 = 0;
              var8[0][var17Lifetime2].draw(var18Lifetime1, 0);
              var18Lifetime1 = var18Lifetime1 + var8[0][var17Lifetime2].field_o;
              for (var19Lifetime1Lifetime1 = 0; param5 > var19Lifetime1Lifetime1; var19Lifetime1Lifetime1++) {
                var8[1][var17Lifetime2].draw(var18Lifetime1, 0);
                var18Lifetime1 = var18Lifetime1 + var8[1][var17Lifetime2].field_o;
              }
              var8[2][var17Lifetime2].draw(var18Lifetime1, 0);
            }
          }
          TeamManagementScreen.e(119);
          var6[var15Lifetime2] = SoftwareDrawingSupport.toIndexedSprite(var16);
        }
        return var6;
    }

    public static void releaseStatics(byte param0) {
        field_l = null;
        field_g = null;
        field_e = null;
        field_a = null;
        field_j = null;
        field_c = null;
        field_b = null;
        if (param0 <= 86) {
          SortCriterion.releaseStatics((byte) -80);
        }
        field_m = null;
        field_f = null;
        field_k = null;
        field_h = null;
        field_d = null;
    }

    abstract int compare(int param0, Object param1, Object param2);

    final void cycleDirection(boolean param0, int param1) {
        if (param1 <= 62) {
          field_c = (String) null;
        }
        if (param0) {
          this.field_i = (this.field_i + 1) % this.directionCount(-125);
        } else {
          this.field_i = 0;
        }
    }

    static {
        field_b = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_j = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_m = "This game has been updated! Please reload this page.";
        field_k = (SortCriterion) ((Object) new PlayerValueSortCriterion());
        field_e = "<%0> has been removed.";
        field_g = new String[]{"total goals", "posession"};
    }
}
