/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static SpriteData[] titleFontSpriteData;
    static int field_d;
    static String field_b;
    static byte[] field_c;

    public static void a(int param0) {
        if (param0 != 480) {
          return;
        }
        field_c = null;
        titleFontSpriteData = null;
        field_b = null;
    }

    final static PcmSample[] a(ResourceArchive param0, int param1, ResourceArchive param2, String[] param3, boolean[] param4) {
        String stackIn_15_2 = null;
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          PcmSample[] var5 = new PcmSample[param3.length];
          for (int var6 = 0; var6 < var5.length; var6++) {
            if (param4 != null &&
              param4[var6]) {
              var5[var6] = t.a(param0, "", param3[var6]).a();
            } else {
              var5[var6] = bj.a(param2, "", param3[var6]).a();
            }
          }
          if (param1 >= -72) {
            titleFontSpriteData = (SpriteData[]) null;
          }
          PcmSample[] stackIn_11_0 = var5;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var5_ref;
          StringBuilder stackIn_14_1 = new StringBuilder().append("nc.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    static {
        field_d = 480;
        field_b = "Type your password again to make sure it's correct";
    }
}
