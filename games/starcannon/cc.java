/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends qf {
    static boolean field_l;
    static String field_k;
    private fe field_m;
    private fe field_n;
    static boolean field_j;

    cc(fe param0, fe param1, fe param2) {
        super(param0);
        try {
          this.field_m = param1;
          this.field_n = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final p a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        p stackIn_4_0 = null;
        p stackIn_8_0 = null;
        p stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -26188) {
            field_j = true;
          }
          var3 = this.field_m.field_k.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_4_0 = sb.field_n;
            return stackIn_4_0;
          }
          if (!kb.a(var3, var4, -28169)) {
            stackIn_8_0 = sb.field_n;
            return stackIn_8_0;
          }
          if (!this.a(5, param0)) {
            return bf.field_x;
          }
          stackIn_12_0 = sb.field_n;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("cc.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_m.field_k.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            return null;
          }
          if (param1) {
            field_k = (String) null;
          }
          var5 = var4;
          if (md.a(-1, var5)) {
            stackIn_7_0 = eb.field_g;
            return stackIn_7_0;
          }
          if (la.a((byte) 96, var5)) {
            stackIn_10_0 = wc.field_e;
            return stackIn_10_0;
          }
          if (nc.a(-68, var5)) {
            stackIn_13_0 = rg.field_K;
            return stackIn_13_0;
          }
          if (this.a(5, param0)) {
            stackIn_16_0 = vh.field_s;
            return stackIn_16_0;
          }
          if (var3.length() <= 0) {
            stackIn_19_0 = nc.field_a;
            return stackIn_19_0;
          }
          if (k.a(19272, var5, var3)) {
            stackIn_22_0 = fa.field_t;
            return stackIn_22_0;
          }
          if (ia.a(var5, (byte) -16, var3)) {
            stackIn_26_0 = pc.field_c;
            return stackIn_26_0;
          }
          if (!bj.a(var5, var3, true)) {
            stackIn_31_0 = eb.field_g;
            return stackIn_31_0;
          }
          stackIn_29_0 = fa.field_t;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_34_0 = var3_ref;
          stackIn_34_1 = new StringBuilder().append("cc.A(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean a(int param0, String param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            var8 = (String) null;
            discarded$1 = this.a(87, (String) null);
          }
          var9 = this.field_n.field_k.toLowerCase();
          var4 = param1.toLowerCase();
          if (var9.length() > 0 &&
            0 < var4.length()) {
            var5 = var9.lastIndexOf("@");
            if (var5 >= 0) {
              if (var9.length() - 1 <= var5) {
                return false;
              }
              var6 = var9.substring(0, var5);
              var7 = var9.substring(1 + var5);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              stackIn_14_0 = (var4.indexOf(var7) >= 0);
              return stackIn_14_0;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("cc.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void e(byte param0) {
        if (param0 > -53) {
          return;
        }
        field_k = null;
    }

    final static int a(CharSequence param0, int param1, boolean param2, int param3) {
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          if (param3 > -48) {
            stackIn_2_0 = -112;
            return stackIn_2_0;
          }
          if (param1 >= 2 &&
            param1 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param0.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param0.charAt(var8);
              if ((var8 == 0) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param2))) {
                if (var9 >= 48 &&
                  57 >= var9) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= param1) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param1;
                if (var10 / param1 != var6) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_43_0 = var6;
            return stackIn_43_0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("cc.C(");
          if (param0 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        CharSequence var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 20755) {
            var6 = (CharSequence) null;
            cc.a(103, (CharSequence) null);
          }
          var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(97 + (-65 + var5));
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (48 > var5 ||
              57 < var5)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_21_0 = new String(var8);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("cc.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static hl[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        hl[] var10;
        hl[] var11_ref_hl__;
        int var11;
        int var12;
        hl var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        hl[] var10Lifetime1;
        var15 = StarCannon.field_A;
        var9 = param7 + (param0 + param2);
        var10 = new hl[]{new hl(var9, var9), new hl(param6, var9), new hl(var9, var9), new hl(var9, param6), new hl(64, 64), new hl(var9, param6), new hl(var9, var9), new hl(param6, var9), new hl(var9, var9)};
        var11_ref_hl__ = var10;
        for (var12 = 0; var12 < var11_ref_hl__.length; var12++) {
          var13 = var11_ref_hl__[var12];
          for (var14 = 0; var13.field_B.length > var14; var14++) {
            var13.field_B[var14] = param5;
          }
        }
        var10Lifetime1 = var11_ref_hl__;
        for (var11 = 0; param0 > var11; var11++) {
          for (var12Lifetime1 = 0; var9 > var12Lifetime1; var12Lifetime1++) {
            var10Lifetime1[6].field_B[(-var11 + (var9 - 1)) * var9 + var12Lifetime1] = param3;
            var10Lifetime1[8].field_B[var12Lifetime1 + (-1 + (-var11 + var9)) * var9] = param3;
            var10Lifetime1[2].field_B[-var11 + var9 - (1 - var12Lifetime1 * var9)] = param3;
            var10Lifetime1[8].field_B[-var11 + var9 + (-1 + var9 * var12Lifetime1)] = param3;
          }
        }
        if (param4 != 3) {
          return (hl[]) null;
        }
        for (var11Lifetime1 = 0; param0 > var11Lifetime1; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10Lifetime1[0].field_B[var12Lifetime2 + var9 * var11Lifetime1] = param8;
            var10Lifetime1[0].field_B[var9 * var12Lifetime2 + var11Lifetime1] = param8;
            if (var9 - var11Lifetime1 > var12Lifetime2) {
              var10Lifetime1[2].field_B[var9 * var11Lifetime1 + var12Lifetime2] = param8;
              var10Lifetime1[6].field_B[var11Lifetime1 + var9 * var12Lifetime2] = param8;
            }
          }
        }
        for (var11Lifetime2 = 0; param6 > var11Lifetime2; var11Lifetime2++) {
          for (var12Lifetime3 = 0; param0 > var12Lifetime3; var12Lifetime3++) {
            var10Lifetime1[7].field_B[(-var12Lifetime3 + (var9 - 1)) * param6 + var11Lifetime2] = param3;
            var10Lifetime1[5].field_B[var9 + (-1 - var12Lifetime3 + var11Lifetime2 * var9)] = param3;
            var10Lifetime1[1].field_B[param6 * var12Lifetime3 + var11Lifetime2] = param8;
            var10Lifetime1[3].field_B[var11Lifetime2 * var9 + var12Lifetime3] = param8;
          }
        }
        for (var11Lifetime3 = 0; param6 >> 1 > var11Lifetime3; var11Lifetime3++) {
          for (var12Lifetime4 = 0; param2 > var12Lifetime4; var12Lifetime4++) {
            var10Lifetime1[1].field_B[var11Lifetime3 + param6 * (-var12Lifetime4 + (var9 - 1))] = param1;
            var10Lifetime1[3].field_B[var9 * var11Lifetime3 - var12Lifetime4 - 1 + var9] = param1;
            var10Lifetime1[7].field_B[var11Lifetime3 + var12Lifetime4 * param6] = param1;
            var10Lifetime1[5].field_B[var9 * var11Lifetime3 + var12Lifetime4] = param1;
          }
        }
        return var10Lifetime1;
    }

    static {
        field_j = true;
        field_k = "ARROW KEYS    Fly Ship";
    }
}
