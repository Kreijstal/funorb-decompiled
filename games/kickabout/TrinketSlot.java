/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrinketSlot extends UiLayoutNode implements PopupCard {
    private ArgbSprite field_Cb;
    private String field_Hb;
    static DualLinkHashTable field_Eb;
    private String field_Gb;
    Trinket field_Bb;
    static int[] field_zb;
    private String field_yb;
    static String field_Ab;
    static String field_Fb;
    static int[] field_Db;

    final void h(byte param0) {
        if (this.field_gb) {
          AnimationSkeleton.a((byte) 100, this);
        }
        if (param0 != 30) {
          this.h((byte) 44);
        }
    }

    public final void drawCentered(int param0, int param1, int param2) {
        int var4 = this.getWidth(0);
        int var5 = this.getHeight(param1 ^ 24);
        int var6 = -(var4 >> 1) + param2;
        int var7 = -(var5 >> 1) + param0;
        SoftwareRasterizer.fillRectangleAlpha(var6, var7, var4, var5, 52479, 60);
        if (this.field_Bb.field_h != 0) {
          SoftwareRasterizer.fillRectangleAlpha(var6, var7, var4, 50, 16777215, 60);
        }
        SoftwareRasterizer.e(var6, var7, var4, var5, 65793);
        ConsoleTokenCursor.field_d.c(this.field_yb, -10 + (var6 + var4), 22 + var7, 16777215, 65793);
        ConsoleTokenCursor.field_d.c(this.field_Hb, -10 + (var6 + var4), var7 + 36, 16777215, 65793);
        if (param1 != 23) {
          this.field_Hb = (String) null;
        }
        this.field_Cb.c(var6 + 8, 9 + var7);
        if (0 != this.field_Bb.field_h) {
          SoftwareRasterizer.drawHorizontalLine(var6, var7 + 50, var4, 65793);
          ConsoleTokenCursor.field_d.a(this.field_Gb, 5 + var6, var7 + 50, var4 - 10, var5 - 50 - 2, 16777215, 65793, 0, 1, 12);
        }
    }

    final static MeshData a(boolean param0, int param1, boolean[][] param2, byte param3, boolean[][] param4, int param5, int param6) {
        MeshData[] array$0 = null;
        MeshData stackIn_7_0;
        MeshData stackIn_7_1;
        MeshData[] stackIn_7_2;
        MeshData[] stackIn_7_3;
        int stackIn_7_4;
        MeshData stackIn_8_0 = null;
        MeshData stackIn_8_1 = null;
        MeshData stackIn_8_5 = null;
        MeshData stackIn_12_0 = null;
        int stackIn_29_0 = 0;
        int stackIn_45_0 = 0;
        MeshData stackIn_53_0 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8_int = 0;
        MeshData var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        MeshData var12 = null;
        int var13 = 0;
        int var14 = 0;
        short[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        MeshData var24 = null;
        int var25 = 0;
        MeshData var26 = null;
        short[] var30 = null;
        int var9Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        var23 = Kickabout.field_G;
        try {
          var24 = new MeshData(new MeshData[]{IndexedSpriteState.field_j[param1]}, 1);
          var26 = var24;
          if (param0) {
            var8_int = WidgetTheme.field_e[param1];
            for (var9 = 0; var9 < var26.field_H.length; var9++) {
              var24.field_H[var9] = var24.field_H[var9] * 3;
              var26.field_l[var9] = var8_int + (-var8_int + var24.field_l[var9]) * 3;
            }
          }
          array$0 = new MeshData[2];
          stackIn_7_0 = null;
          stackIn_7_1 = null;
          stackIn_7_2 = array$0;
          stackIn_7_3 = array$0;
          stackIn_7_4 = 1;
          if (param1 == 4) {
            stackIn_8_0 = null;
            stackIn_8_1 = null;
            stackIn_8_5 = RowRangeRequest.field_k;
          } else {
            stackIn_8_0 = null;
            stackIn_8_1 = null;
            stackIn_8_5 = PacketBuffer.field_m[param1];
          }
          stackIn_7_3[stackIn_7_4] = stackIn_8_5;
          var8 = new MeshData(stackIn_7_2, 2);
          var10 = -10 % ((param3 + 49) / 51);
          var9Lifetime1 = (short)param5;
          var11 = (short)param6;
          var12 = new MeshData(var8, true, false, true, true);
          if (param2 == null &&
            param4 == null) {
            stackIn_12_0 = var12;
            return stackIn_12_0;
          }
          var30 = var8.field_p;
          var16 = var12.field_p;
          if (param1 != 4) {
            var13 = -9284;
            for (var17 = 0; var30.length > var17; var17++) {
              if (var30[var17] == var13) {
                var16[var17] = (short)AuctionBidDialog.field_K[param1][0];
              }
            }
          }
          if (param2 != null) {
            var17Lifetime1 = 0;
            for (var18 = 0; var18 < param2.length; var18++) {
              var19 = 20;
              for (var20 = 0; var20 < param2[0].length; var20++) {
                var21 = var20;
                stackIn_29_0 = (param2[-var18 + 12][var21]) ? var11 : var9Lifetime1;
                var14 = stackIn_29_0;
                var13Lifetime1 = HuffmanCodec.a(var19, var17Lifetime1, -67, 7);
                var19 += 5;
                for (var22 = 0; var30.length > var22; var22++) {
                  if (~var30[var22] == ~var13Lifetime1) {
                    var16[var22] = (short)var14;
                  }
                }
              }
              var17Lifetime1 += 3;
            }
          }
          if (param4 != null) {
            var17Lifetime2 = 0;
            for (var18Lifetime1 = 0; param4.length > var18Lifetime1; var18Lifetime1++) {
              var19Lifetime1 = 20;
              for (var20Lifetime1 = 0; var20Lifetime1 < param4[0].length; var20Lifetime1++) {
                var21Lifetime1 = 9 - var20Lifetime1;
                stackIn_45_0 = (param4[12 - var18Lifetime1][var21Lifetime1]) ? var11 : var9Lifetime1;
                var14Lifetime1 = stackIn_45_0;
                var13Lifetime2 = HuffmanCodec.a(var19Lifetime1, var17Lifetime2, -45, 6);
                var19Lifetime1 += 5;
                var25 = 0;
                var22Lifetime1 = var25;
                while (var30.length > var25) {
                  if (~var30[var25] == ~var13Lifetime2) {
                    var16[var25] = (short)var14Lifetime1;
                  }
                  var25++;
                }
              }
              var17Lifetime2 += 3;
            }
          }
          stackIn_53_0 = var12;
          return stackIn_53_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_56_0 = var7;
          stackIn_56_1 = new StringBuilder().append("pu.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          stackIn_59_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public final int getWidth(int param0) {
        if (param0 != 0) {
          return -18;
        }
        return 150;
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        InstrumentEnvelope.field_a.field_n = 0;
        InstrumentEnvelope.field_a.writeByte(122, 12);
        InstrumentEnvelope.field_a.writeInt(-43, TrinketUnlockNotice.field_d.nextInt());
        InstrumentEnvelope.field_a.writeInt(-111, TrinketUnlockNotice.field_d.nextInt());
        InstrumentEnvelope.field_a.writeByte(102, param3);
        InstrumentEnvelope.field_a.writeByte(112, param2);
        InstrumentEnvelope.field_a.writeShort(-1207444472, param1);
        InstrumentEnvelope.field_a.rsaEncrypt(CascadingMenu.field_Nb, ManagerAction.field_h, 38);
        or.field_d.b(18, (byte) -83);
        int fieldTemp$0 = or.field_d.field_n + 1;
        or.field_d.field_n = or.field_d.field_n + 1;
        int var4 = fieldTemp$0;
        or.field_d.writeBytes(0, InstrumentEnvelope.field_a.field_n, 1991220144, InstrumentEnvelope.field_a.field_f);
        or.field_d.backpatchByteLength(62, -var4 + or.field_d.field_n);
        int var5 = 83 % ((40 - param0) / 43);
    }

    public final int getHeight(int param0) {
        int var2 = 50;
        if (param0 != 15) {
          return -84;
        }
        if (this.field_Bb.field_h != 0) {
          var2 = var2 + (20 + ConsoleTokenCursor.field_d.paragraphHeight(us.field_h[this.field_Bb.field_h], this.getWidth(param0 ^ 15) - 10, 12));
        }
        return var2;
    }

    public static void releaseStatics(byte param0) {
        field_Ab = null;
        field_Fb = null;
        field_Db = null;
        int var1 = -80 / ((-13 - param0) / 32);
        field_zb = null;
        field_Eb = null;
    }

    TrinketSlot(Trinket param0, boolean param1) {
        try {
          this.field_mb = 32;
          this.field_q = 32;
          this.field_Bb = param0;
          this.field_Cb = param0.d(false);
          this.field_N = (Sprite) ((Object) this.field_Cb);
          if (param1) {
            this.field_q = this.field_q >> 1;
            this.field_mb = this.field_mb >> 1;
            this.field_N = (Sprite) ((Object) SpritePixelSupport.downscaleArgbByHalf(this.field_Cb));
          }
          this.field_yb = ValidationState.field_b[this.field_Bb.field_h].toUpperCase();
          this.field_Hb = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, DebugConsole.field_u, new String[]{wq.field_a[this.field_Bb.field_k]}).toLowerCase();
          if (0 == this.field_Bb.field_h) {
            this.field_yb = '(' + this.field_yb + ')';
          } else {
            this.field_yb = '"' + this.field_yb + '"';
          }
          this.field_Gb = us.field_h[this.field_Bb.field_h];
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "pu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_Ab = "Unable to add name - system busy";
        field_zb = new int[2];
        field_Db = new int[7];
        field_Fb = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
