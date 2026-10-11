/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static int field_a;
    static dd[] field_f;
    static boolean field_c;
    static String field_d;
    static String field_b;
    static int field_e;

    final static vh a(byte param0) {
        if (param0 != 1) {
          field_a = 112;
          return vb.field_m.field_Rb;
        }
        return vb.field_m.field_Rb;
    }

    public static void a(int param0) {
        if (param0 == 28882) {
          field_b = null;
          field_d = null;
          field_f = null;
          return;
        }
        hh.a((byte) -23, -113);
        field_b = null;
        field_d = null;
        field_f = null;
    }

    final static short a(byte param0, int param1) {
        float stackIn_7_0 = 0.0f;
        float stackIn_14_0 = 0.0f;
        float stackIn_34_0 = 0.0f;
        short stackIn_35_0 = 0;
        RuntimeException decompiledCaughtException = null;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        try {
          var2_float = (float)((param1 & 16711680) >> 16) / 255.0f;
          var3 = (float)((param1 & 65280) >> 8) / 255.0f;
          var4 = (float)(255 & param1) / 255.0f;
          if (var3 < var2_float) {
            stackIn_7_0 = (!(var4 < var2_float)) ? var4 : var2_float;
          } else {
            stackIn_7_0 = (!(var3 > var4)) ? var4 : var3;
          }
          var5 = stackIn_7_0;
          var7 = 105 % ((param0 + 62) / 40);
          if (var2_float < var3) {
            stackIn_14_0 = (!(var2_float < var4)) ? var4 : var2_float;
          } else {
            stackIn_14_0 = (var3 < var4) ? var3 : var4;
          }
          var6 = stackIn_14_0;
          if (var6 == var5) {
            var8 = 0.0f;
          } else {
            if (var5 != var2_float) {
              if (var3 != var5) {
                var8 = 4.0f + (var2_float - var3) / (var5 - var6);
              } else {
                var8 = 2.0f + (-var2_float + var4) / (-var6 + var5);
              }
            } else {
              var8 = (var3 - var4) / (-var6 + var5);
            }
          }
          for (var8 = var8 / 6.0f; var8 < 0.0f; var8 = var8 + 1.0f) {
          }
          var10 = (var5 + var6) / 2.0f;
          while (var8 > 1.0f) {
            var8 = var8 - 1.0f;
          }
          if (var10 != 0.0f &&
            var5 != var6) {
            if (0.5f > var10) {
              stackIn_34_0 = (var5 - var6) / (2.0f * var10);
            } else {
              stackIn_34_0 = (-var6 + var5) / (-(2.0f * var10) + 2.0f);
            }
          } else {
            stackIn_34_0 = 0.0f;
          }
          var9 = stackIn_34_0;
          var11 = (int)(var8 * 63.0f + 0.5f);
          var12 = (int)(0.5f + var9 * 7.0f);
          var13 = (int)(0.5f + var10 * 127.0f);
          stackIn_35_0 = (short)(var12 << 7 | var11 << 10 | var13);
          return stackIn_35_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "hh.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_c = true;
        field_a = 0;
        field_b = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_d = "Unrated game";
    }
}
