/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterStateSnapshot extends IntrusiveNode {
    int field_j;
    int field_g;
    int field_e;
    int field_l;
    int field_f;
    int[] field_h;
    static int field_k;
    int field_i;

    final void captureRasterState(byte param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_j = param5;
          this.field_h = param3;
          int var9_int = -116 % ((param0 + 20) / 50);
          this.field_l = param1;
          this.field_f = param6;
          this.field_g = param4;
          this.field_e = param2;
          this.field_i = param7;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "qg.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        Object var12;
        RenderedBall var12_ref;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        var12 = null;
        var12_ref = (RenderedBall) (et.field_d.field_V);
        if (param3 != var12_ref.positionX) {
          var5 = var12_ref.positionX;
          var6 = var12_ref.positionY;
          stackIn_33_0 = (var5 >= param3) ? 0 : 1;
          var7 = stackIn_33_0;
          stackIn_36_0 = (param1 <= var6) ? 0 : 1;
          var8 = stackIn_36_0;
          var9 = (param3 >> 16) - var12_ref.pixelX(true);
          var10 = (param1 >> 16) - var12_ref.pixelY(879306160);
          if (param0 != 2235) {
            RasterStateSnapshot.a(-120, 112, -101, 49);
          }
          var11 = GameKeyHandler.a(var10 * var10 + var9 * var9, (byte) 80);
          if (0 == var11) {
            var5 = param3;
            var6 = param1;
          } else {
            var6 = var6 + (param2 * var10 << 16) / var11;
            var5 = var5 + (param2 * var9 << 16) / var11;
            if (var8 != 0 &&
              var6 > param1 ||
              var8 == 0 &&
              var6 < param1) {
              var6 = param1;
            }
            if (var7 != 0 &&
              var5 > param3) {
              var5 = param3;
            } else {
              if (var7 == 0 &&
                param3 > var5) {
                var5 = param3;
              }
            }
          }
        } else {
          if (var12_ref.positionY == param1) {
            return true;
          }
          var5 = var12_ref.positionX;
          var6 = var12_ref.positionY;
          stackIn_6_0 = (var5 >= param3) ? 0 : 1;
          var7 = stackIn_6_0;
          stackIn_9_0 = (param1 <= var6) ? 0 : 1;
          var8 = stackIn_9_0;
          var9 = (param3 >> 16) - var12_ref.pixelX(true);
          var10 = (param1 >> 16) - var12_ref.pixelY(879306160);
          if (param0 != 2235) {
            RasterStateSnapshot.a(-120, 112, -101, 49);
          }
          var11 = GameKeyHandler.a(var10 * var10 + var9 * var9, (byte) 80);
          if (0 == var11) {
            var5 = param3;
            var6 = param1;
          } else {
            var6 = var6 + (param2 * var10 << 16) / var11;
            var5 = var5 + (param2 * var9 << 16) / var11;
            if (var8 != 0 &&
              var6 > param1 ||
              var8 == 0 &&
              var6 < param1) {
              var6 = param1;
            }
            if (var7 != 0 &&
              var5 > param3) {
              var5 = param3;
              var12_ref.a(var5, var12_ref.height, (byte) 26, var6);
              return false;
            }
            if (var7 == 0 &&
              param3 > var5) {
              var5 = param3;
            }
          }
        }
        var12_ref.a(var5, var12_ref.height, (byte) 26, var6);
        return false;
    }

    RasterStateSnapshot() {
    }

    final static void a(int param0) {
        DualLinkNode var1 = null;
        int var2 = Kickabout.field_G;
        DualLinkNode var1Lifetime1;
        try {
          StripedProgressBar.field_y = 0;
          ListingRow.field_d = 0;
          BufferedSocket.field_h = null;
          GameplayHelpScreen.field_I.clear(22997);
          qn.field_b.clear(22997);
          var1 = AvailabilityCheckRequest.field_b.b((byte) 72);
          while (var1 != null) {
            var1.unlinkSecondary(-104);
            var1 = AvailabilityCheckRequest.field_b.a(0);
          }
          var1Lifetime1 = HighScoreQuery.field_m.b((byte) 72);
          while (var1Lifetime1 != null) {
            var1Lifetime1.unlinkSecondary(param0 - 106);
            var1Lifetime1 = HighScoreQuery.field_m.a(0);
          }
          PitchCoordinateSupport.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "qg.A(" + param0 + ')');
        }
    }

    static {
    }
}
