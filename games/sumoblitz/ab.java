/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ab {
    static te field_a;
    static Object field_b;
    static String field_d;
    static String field_e;
    static int field_c;

    abstract void a(float param0, int param1, float param2, float param3, int param4, int param5, int param6, float[] param7, int param8, float param9, int param10);

    final static void a(int param0, jn param1, ah param2, int param3, int param4, int param5, byte param6) {
        float[] dupTemp$0 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        float[] var9 = null;
        int var10 = 0;
        Object var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float[] var15 = null;
        float[] var9Lifetime1;
        float[] var9Lifetime2;
        float[] var9Lifetime1Lifetime1;
        int var8Lifetime1;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          stackIn_4_0 = (ul.field_f != 1) ? 0 : 1;
          var7_int = stackIn_4_0;
          var8 = 0;
          while (true) {
            stackIn_8_0 = (var7_int == 0) ? 30 : 15;
            if (stackIn_8_0 > var8) {
              var9 = new float[]{0.0f, (float)(-(fi.a(param3, he.field_o, (byte) -96) + 1))};
              var15 = kt.a((byte) -33, var9, (float)((double)(2048.0f / (float)var8) * 0.017453292519943295 + 0.0));
              var14 = var15;
              var12 = var14;
              var9Lifetime2 = var12;
              param1.a((ms) (new cl(64, (int)var15[0] << 11, (int)var15[1] << 11, param0, -(int)var15[0] << 8, -(int)var15[1] << 8, 0, param2)), (byte) 39);
              var8++;
              continue;
            }
            break;
          }
          if (param6 <= 92) {
            var11 = (Object) null;
            ab.a(false, (Object) null, -86);
          }
          var8Lifetime1 = 0;
          while (true) {
            stackIn_16_0 = (var7_int != 0) ? 15 : 30;
            if (stackIn_16_0 <= var8Lifetime1) {
              return;
            }
            var9Lifetime1 = new float[]{0.0f, (float)(-(1 + fi.a(param3, he.field_o, (byte) -96)))};
            dupTemp$0 = kt.a((byte) -52, var9Lifetime1, (float)(0.0 + (double)(2048.0f / (float)var8Lifetime1) * 0.017453292519943295));
            var13 = dupTemp$0;
            var9Lifetime1Lifetime1 = dupTemp$0;
            param1.a((ms) (new cl(64, (int)var13[0] << 11, (int)var13[1] << 11, param0, -(int)var13[0] << 8, -(int)var13[1] << 8, 1, param2)), (byte) 39);
            var8Lifetime1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_21_0 = var7;
          stackIn_21_1 = new StringBuilder().append("ab.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static byte[] a(boolean param0, Object param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        nn var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (param1 instanceof byte[]) {
            var3 = (byte[]) (param1);
            if (!param0) {
              stackIn_8_0 = var3;
              return stackIn_8_0;
            }
            stackIn_6_0 = cp.a(var3, param2 ^ 0);
            return stackIn_6_0;
          }
          if (param2 != 0) {
            ab.a(-28);
          }
          if (!(param1 instanceof nn)) {
            throw new IllegalArgumentException();
          }
          var4 = (nn) (param1);
          stackIn_13_0 = var4.a(false);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ab.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 64) {
          return;
        }
        field_e = null;
        field_b = null;
    }

    static {
        field_e = "Achieved";
        field_d = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
