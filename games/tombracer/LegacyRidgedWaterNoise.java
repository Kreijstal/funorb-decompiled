/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class LegacyRidgedWaterNoise extends RidgedNoise3D {
    private byte[] field_t;

    final byte[] generate(int param0, int param1, int param2, int param3) {
        this.field_t = new byte[2 * (param0 * param1 * param3)];
        if (param2 == 0) {
          this.generateVolume(param3, param0, param1, (byte) -90);
          return this.field_t;
        }
        this.writeVoxel(true, (byte) 84, 122);
        this.generateVolume(param3, param0, param1, (byte) -90);
        return this.field_t;
    }

    final static int splitIntoBalancedLines(BitmapFont param0, String param1, int param2, int param3, String[] param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        String[] var14 = null;
        int var6Lifetime1;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          if (param3 != 1) {
            var14 = (String[]) null;
            LegacyRidgedWaterNoise.splitIntoBalancedLines((BitmapFont) null, (String) null, -117, -80, (String[]) null);
          }
          var5_int = param0.stringWidth(param1);
          if (var5_int <= param2 &&
            param1.indexOf("<br>") == -1) {
            param4[0] = param1;
            stackIn_6_0 = 1;
            return stackIn_6_0;
          }
          var6 = (var5_int + (param2 - 1)) / param2;
          param2 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param1.length();
          for (var9 = 0; var8 > var9; var9++) {
            var10 = param1.charAt(var9);
            if (var10 == 32 ||
              45 == var10) {
              var11 = param1.substring(var7, 1 + var9).trim();
              var12 = param0.stringWidth(var11);
              if (param2 <= var12) {
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param4[incrementValue$1] = var11;
                var7 = 1 + var9;
              }
            }
            if (var10 == 62 &&
              param1.regionMatches(var9 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param4[incrementValue$2] = param1.substring(var7, -3 + var9).trim();
              var7 = var9 + 1;
            }
          }
          if (var7 < var8) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param4[incrementValue$0] = param1.substring(var7, var8).trim();
          }
          stackIn_26_0 = var6Lifetime1;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("ama.K(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final void writeVoxel(boolean param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int incrementValue$0 = 0;
        if (!param0) {
          var4 = param2 * 2;
          var5 = param1 & 255;
          incrementValue$0 = var4;
          var4++;
          this.field_t[incrementValue$0] = (byte)(var5 * 3 >> 5);
          this.field_t[var4] = (byte)(3 * var5 >> 5);
          return;
        }
    }

    final static boolean ensureGamePacketBytes(int param0, int param1) {
        try {
          int var2_int = 0;
          IOException var2 = null;
          Throwable decompiledCaughtException = null;
          if (WeaveOperator.field_q.position >= param0) {
            return true;
          }
          if (OpenGlTransform3D.field_e == null) {
            return false;
          }
          try {
            var2_int = OpenGlTransform3D.field_e.available(~param1);
            if (var2_int <= 0) {
              if (~var2_int > param1) {
                DropAnimation.closeGameSocket(60);
                return false;
              }
              if (rf.millisSinceLastReceive((byte) -121) <= 30000L) {
                return false;
              }
              DropAnimation.closeGameSocket(60);
              return false;
            }
            if (var2_int > -WeaveOperator.field_q.position + param0) {
              var2_int = -WeaveOperator.field_q.position + param0;
            }
            OpenGlTransform3D.field_e.readFully(param1 + 1, WeaveOperator.field_q.position, WeaveOperator.field_q.payload, var2_int);
            MiscItemBehaviour.field_s = bva.currentTimeMillis((byte) -107);
            WeaveOperator.field_q.position = WeaveOperator.field_q.position + var2_int;
            if (param0 > WeaveOperator.field_q.position) {
              return false;
            }
            WeaveOperator.field_q.position = 0;
            return true;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            DropAnimation.closeGameSocket(60);
            return false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    LegacyRidgedWaterNoise() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    static {
    }
}
