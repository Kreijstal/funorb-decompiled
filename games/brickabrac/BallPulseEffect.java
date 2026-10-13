/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BallPulseEffect extends IntrusiveNode {
    static String field_i;
    private int y256;
    private int ageTicks;
    static RgbSprite arcticMidSprite;
    static RgbSprite parisCharacterSprite;
    static SoftwareFramebuffer framebuffer;
    static ResourceArchive field_j;
    static UiComponent field_n;
    private int x256;
    static String field_o;

    public static void a(int param0) {
        field_n = null;
        field_o = null;
        parisCharacterSprite = null;
        int var1 = 82 % ((param0 - 35) / 55);
        arcticMidSprite = null;
        field_i = null;
        field_j = null;
        framebuffer = null;
    }

    final boolean advance(byte obfuscationGuard) {
        int fieldTemp$0 = 0;
        if (obfuscationGuard >= 47) {
          fieldTemp$0 = this.ageTicks + 1;
          this.ageTicks = this.ageTicks + 1;
          return fieldTemp$0 < 40 ? true : false;
        }
        field_o = (String) null;
        int fieldTemp$1 = this.ageTicks + 1;
        this.ageTicks = this.ageTicks + 1;
        return fieldTemp$1 < 40 ? true : false;
    }

    final static void a(ResourceArchive param0, AudioMixer param1, int param2, int param3) {
        try {
          BoundedFile.field_i = wn.a((byte) -98) * param2 / 1000;
          if (param3 < 91) {
            AudioMixer var5 = (AudioMixer) null;
            BallPulseEffect.a((ResourceArchive) null, (AudioMixer) null, -127, -72);
          }
          ck.a(-2196, param0);
          bm.loadLogoMeshes((byte) -70, param0);
          AchievementSubmission.a(param0, 115);
          ScorePopup.initializeMeshLighting(-37);
          fl.e(-41);
          MatchResultScreen.field_t = -BoundedFile.field_i + 0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "kc.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void draw(int scaleDivisor, int destinationX, int destinationY, boolean obfuscationGuard) {
        int var5 = (int)((Math.exp((double)((float)(-this.ageTicks) / 20.0f)) - Math.exp(-2.0)) * 200.0);
        int var6 = this.pulseSize((byte) 116);
        AchievementMaskRequest.a(destinationY + (this.y256 >> 8) / scaleDivisor, var6 / (scaleDivisor << 1), (-this.ageTicks + 40 << 8) / 40, var5, -94, var6 / scaleDivisor, (this.x256 >> 8) / scaleDivisor + destinationX);
        if (obfuscationGuard) {
          return;
        }
        this.advance((byte) -61);
    }

    final static RgbSprite[] a(int param0, boolean param1) {
        RgbSprite[] var3 = new RgbSprite[9];
        RgbSprite[] var2 = var3;
        if (!param1) {
          var3[4] = hd.a(param0, 64, (byte) -6);
          return var2;
        }
        BallPulseEffect.$cfr$intArgs$a$a948187ac0af(-5, false);
        var3[4] = hd.a(param0, 64, (byte) -6);
        return var2;
    }

    private final int pulseSize(byte obfuscationGuard) {
        int var2 = -80 / ((obfuscationGuard - 72) / 33);
        return this.ageTicks * (-this.ageTicks + 100) / 20 - 5;
    }

    final static gb a(byte param0, boolean param1) {
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        BitPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        BitPacketBuffer var8 = null;
        wd var9 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        var8 = jl.incomingPackets;
        var2 = var8;
        var3 = var8.readUnsignedByte(param0 + 188);
        gj.field_a = 127 & var3;
        if (param0 != 67) {
          BallPulseEffect.a(73, true);
        }
        stackIn_5_0 = ((var3 & 128) != 0);
        ji.field_f = stackIn_5_0;
        nh.field_b = var8.readUnsignedByte(255);
        an.field_k = var8.readLong(-32768);
        if (gj.field_a == 2) {
          gb.field_h = var8.readUnsignedShort(65280);
          LevelCompleteScreen.field_H = var8.readUnsignedMedium((byte) -34);
        } else {
          gb.field_h = 0;
          LevelCompleteScreen.field_H = 0;
        }
        stackIn_11_0 = (var8.readUnsignedByte(255) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        HalloweenBackground.field_t = var8.readCp1252String(-1);
        if (var4 != 0) {
          nd.field_g = var8.readCp1252String(-1);
        } else {
          nd.field_g = HalloweenBackground.field_t;
        }
        if (1 != gj.field_a &&
          4 != gj.field_a) {
          MusicVoice.field_E = 0;
          sl.field_y = null;
        } else {
          MusicVoice.field_E = var8.readUnsignedShort(param0 ^ 65347);
          sl.field_y = var8.readCp1252String(-1);
        }
        if (!param1) {
          gd.field_d = bj.readCompressedString(80, (byte) 76, var8);
          BoundedFile.field_m = null;
          return new gb(param1);
        }
        var5 = var8.readUnsignedShort(65280);
        try {
          var9 = nh.field_c.a(var5, true);
          gd.field_d = var9.h(-3);
          if (nd.field_g.equals(tb.field_cb)) {
            stackIn_24_0 = null;
          } else {
            stackIn_24_0 = var9.field_u;
          }
          BoundedFile.field_m = stackIn_24_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          rk.a("CC1", (Throwable) ((Object) var6), param0 ^ 16);
          BoundedFile.field_m = null;
          gd.field_d = null;
          return new gb(param1);
        }
        return new gb(param1);
    }

    BallPulseEffect(int x256, int y256) {
        this.x256 = x256;
        this.y256 = y256;
    }

    static {
        field_i = "Waiting for music";
        field_o = "Average rating";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static gb $cfr$intArgs$a$a948187ac0af(int param0, boolean param1) {
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        BitPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        BitPacketBuffer var8 = null;
        wd var9 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        var8 = jl.incomingPackets;
        var2 = var8;
        var3 = var8.readUnsignedByte(param0 + 188);
        gj.field_a = 127 & var3;
        if (param0 != 67) {
          BallPulseEffect.a(73, true);
        }
        stackIn_5_0 = ((var3 & 128) != 0);
        ji.field_f = stackIn_5_0;
        nh.field_b = var8.readUnsignedByte(255);
        an.field_k = var8.readLong(-32768);
        if (gj.field_a == 2) {
          gb.field_h = var8.readUnsignedShort(65280);
          LevelCompleteScreen.field_H = var8.readUnsignedMedium((byte) -34);
        } else {
          gb.field_h = 0;
          LevelCompleteScreen.field_H = 0;
        }
        stackIn_11_0 = (var8.readUnsignedByte(255) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        HalloweenBackground.field_t = var8.readCp1252String(-1);
        if (var4 != 0) {
          nd.field_g = var8.readCp1252String(-1);
        } else {
          nd.field_g = HalloweenBackground.field_t;
        }
        if (1 != gj.field_a &&
          4 != gj.field_a) {
          MusicVoice.field_E = 0;
          sl.field_y = null;
        } else {
          MusicVoice.field_E = var8.readUnsignedShort(param0 ^ 65347);
          sl.field_y = var8.readCp1252String(-1);
        }
        if (!param1) {
          gd.field_d = bj.readCompressedString(80, (byte) 76, var8);
          BoundedFile.field_m = null;
          return new gb(param1);
        }
        var5 = var8.readUnsignedShort(65280);
        try {
          var9 = nh.field_c.a(var5, true);
          gd.field_d = var9.h(-3);
          if (nd.field_g.equals(tb.field_cb)) {
            stackIn_24_0 = null;
          } else {
            stackIn_24_0 = var9.field_u;
          }
          BoundedFile.field_m = stackIn_24_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          rk.a("CC1", (Throwable) ((Object) var6), param0 ^ 16);
          BoundedFile.field_m = null;
          gd.field_d = null;
          return new gb(param1);
        }
        return new gb(param1);
    }
}
