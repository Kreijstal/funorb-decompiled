/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dt {
    static MusicTrack field_c;
    static String field_b;
    static int[] menuLeft;

    final static void a(int param0) {
        if (null != um.field_m) {
          um.field_m.d();
        }
        if (param0 != 0) {
          field_b = (String) null;
        }
        if (null != RendererBitmapFont.field_a) {
          RendererBitmapFont.field_a.d();
        }
    }

    final static PcmSample[][] a(ResourceArchive param0, int param1, boolean[] param2, ResourceArchive param3, String[][] param4) {
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        String stackIn_27_2 = null;
        int var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          PcmSample[][] var9 = new PcmSample[param4.length][];
          PcmSample[][] var5 = var9;
          int var6 = 0;
          if (param1 != 19501) {
            field_c = (MusicTrack) null;
          }
          while (var6 < var9.length) {
            PcmSample[] array$0 = new PcmSample[param4[var6].length];
            var5[var6] = array$0;
            for (int var7 = 0; var9[var6].length > var7; var7++) {
              if (param2 != null &&
                param2[var6]) {
                var9[var6][var7] = t.a(param0, "", param4[var6][var7]).a();
              } else {
                var9[var6][var7] = bj.a(param3, "", param4[var6][var7]).a();
              }
            }
            var6++;
          }
          PcmSample[][] stackIn_14_0 = var5;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var5_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("dt.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          StringBuilder stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_c = null;
        if (param0 != 13748) {
          return;
        }
        menuLeft = null;
        field_b = null;
    }

    final static void b(int param0) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int[] var5 = hs.field_a;
          int[] var1 = var5;
          int var2 = 0;
          if (param0 != 8) {
            field_b = (String) null;
          }
          int var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1_ref), "dt.D(" + param0 + ')');
        }
    }

    static {
        menuLeft = new int[8];
    }
}
