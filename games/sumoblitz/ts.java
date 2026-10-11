/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ts {
    static int field_a;
    static hr[] field_e;
    static int field_c;
    static boolean field_d;
    int field_b;
    int field_f;

    public static void a(int param0) {
        if (param0 != -13252) {
          return;
        }
        field_e = null;
    }

    final static void a(int param0, jn param1, int param2, int param3, int param4, int param5) {
        float[] dupTemp$0 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        float[] var8 = null;
        int var9 = 0;
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var8Lifetime1;
        float[] var8Lifetime2;
        float[] var8Lifetime1Lifetime1;
        int var7Lifetime1;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          stackIn_4_0 = (ul.field_f != 1) ? 0 : 1;
          var6_int = stackIn_4_0;
          if (param2 != -16240) {
            return;
          }
          var7 = 0;
          while (true) {
            stackIn_10_0 = (var6_int == 0) ? 20 : 10;
            if (stackIn_10_0 > var7) {
              var8 = new float[]{0.0f, (float)(-(fi.a(param3, he.field_o, (byte) -96) + 1))};
              var13 = kt.a((byte) -124, var8, (float)((double)(2048.0f / (float)var7) * 0.017453292519943295 + 0.0));
              var12 = var13;
              var10 = var12;
              var8Lifetime2 = var10;
              param1.a((ms) (new vt(64, param0, param5, param4, (int)var13[0] << 8, (int)var13[1] << 8, 0)), (byte) 39);
              var7++;
              continue;
            }
            break;
          }
          var7Lifetime1 = 0;
          while (true) {
            stackIn_17_0 = ~var7Lifetime1;
            if (var6_int == 0) {
              stackIn_18_1 = 20;
            } else {
              stackIn_18_1 = 10;
            }
            if (stackIn_17_0 <= ~stackIn_18_1) {
              return;
            }
            var8Lifetime1 = new float[]{0.0f, (float)(-(fi.a(param3, he.field_o, (byte) -96) + 1))};
            dupTemp$0 = kt.a((byte) -10, var8Lifetime1, (float)(0.0 + 0.017453292519943295 * (double)(2048.0f / (float)var7Lifetime1)));
            var11 = dupTemp$0;
            var8Lifetime1Lifetime1 = dupTemp$0;
            param1.a((ms) (new vt(64, param0, param5, param4, (int)var11[0] << 8, (int)var11[1] << 8, 1)), (byte) 39);
            var7Lifetime1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ts.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ts(int param0, int param1, int param2, int param3) {
        this.field_f = param3;
        this.field_b = param0;
    }

    static {
    }
}
