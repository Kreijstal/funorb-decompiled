/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends IntrusiveNode {
    int field_m;
    int field_v;
    static String field_g;
    int field_i;
    int field_E;
    static boolean[][] field_k;
    int field_t;
    static Sprite field_j;
    static int[] field_n;
    int field_o;
    PcmSampleStream field_C;
    int field_B;
    nj field_h;
    int field_l;
    MusicPatch field_x;
    int field_D;
    int field_A;
    int field_p;
    int field_q;
    int field_w;
    static String field_u;
    int field_y;
    PcmSample field_f;
    int field_r;
    int field_s;
    int field_z;

    final static int wrapBalancedText(BitmapFont param0, boolean param1, String param2, String[] param3, int param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
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
        int var6Lifetime1;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5_int = param0.textWidth(param2);
          if (var5_int <= param4 &&
            param2.indexOf("<br>") == -1) {
            param3[0] = param2;
            stackIn_5_0 = 1;
            return stackIn_5_0;
          }
          var6 = (param4 + (var5_int - 1)) / param4;
          param4 = var5_int / var6;
          if (param1) {
            stackIn_8_0 = 66;
            return stackIn_8_0;
          }
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param2.length();
          for (var9 = 0; var9 < var8; var9++) {
            var10 = param2.charAt(var9);
            if (var10 == 32 ||
              var10 == 45) {
              var11 = param2.substring(var7, 1 + var9).trim();
              var12 = param0.textWidth(var11);
              if (var12 >= param4) {
                var7 = 1 + var9;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param3[incrementValue$1] = var11;
              }
            }
            if (var10 == 62 &&
              param2.regionMatches(var9 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param3[incrementValue$2] = param2.substring(var7, -3 + var9).trim();
              var7 = var9 + 1;
            }
          }
          if (var8 > var7) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param3[incrementValue$0] = param2.substring(var7, var8).trim();
          }
          stackIn_30_0 = var6Lifetime1;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("mb.A(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param3 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param4).append(')').toString());
        }
    }

    final static int bitLength(byte param0, int param1) {
        if (param0 != -31) {
          return -96;
        }
        int var2 = 0;
        if (param1 < 0 ||
          param1 >= 65536) {
          var2 += 16;
          param1 = param1 >>> 16;
        }
        if (param1 >= 256) {
          param1 = param1 >>> 8;
          var2 += 8;
        }
        if (param1 >= 16) {
          param1 = param1 >>> 4;
          var2 += 4;
        }
        if (4 <= param1) {
          var2 += 2;
          param1 = param1 >>> 2;
        }
        if (1 <= param1) {
          var2++;
          param1 = param1 >>> 1;
        }
        return var2 + param1;
    }

    final void releaseReferences(byte param0) {
        this.field_x = null;
        if (param0 != 71) {
          this.field_l = -91;
        }
        this.field_f = null;
        this.field_h = null;
        this.field_C = null;
    }

    public static void releaseStatics(boolean param0) {
        field_n = null;
        if (param0) {
          field_j = (Sprite) null;
        }
        field_k = (boolean[][]) null;
        field_j = null;
        field_g = null;
        field_u = null;
    }

    mb() {
    }

    static {
        field_g = "Please log in to access this feature.";
        field_n = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_u = "The following settings need to be changed:  ";
    }
}
