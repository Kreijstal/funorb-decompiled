/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wi {
    int field_d;
    static long field_h;
    int field_a;
    int field_f;
    int field_c;
    int field_e;
    int field_g;
    static String field_b;

    final static boolean a(int param0, int param1, CharSequence param2, boolean param3) {
        int var8 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        CharSequence var12 = null;
        var11 = CrazyCrystals.field_B;
        try {
          if (2 <= param1 &&
            param1 <= 36) {
            var4_int = 0;
            if (param0 != 48) {
              var12 = (CharSequence) null;
              wi.a(-107, 91, (CharSequence) null, true);
            }
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param3))) {
                if (48 <= var9 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  90 >= var9) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  return false;
                }
                if (param1 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param1;
                if (var10 / param1 != var6) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            stackIn_42_0 = var5;
            return stackIn_42_0 != 0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("wi.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(')').toString());
        }
    }

    final static ef a(int param0, wj[] param1, byte[] param2) {
        int var8 = 0;
        ef stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        byte[][] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        byte[][] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        byte[][] var20 = null;
        var9 = CrazyCrystals.field_B;
        try {
          if (param1.length != 256) {
            throw new IllegalArgumentException();
          }
          var16 = new int[256];
          var11 = var16;
          var10 = var11;
          var3 = var10;
          var17 = new int[256];
          var12 = var17;
          var4 = var12;
          var18 = new int[256];
          var13 = var18;
          var5 = var13;
          var19 = new int[256];
          var14 = var19;
          var6 = var14;
          var20 = new byte[256][];
          var15 = var20;
          var7 = var15;
          for (var8 = param0; 256 > var8; var8++) {
            var10[var8] = param1[var8].field_g;
            var4[var8] = param1[var8].field_d;
            var5[var8] = param1[var8].field_f;
            var6[var8] = param1[var8].field_e;
            var7[var8] = param1[var8].field_j;
          }
          stackIn_8_0 = new ef(param2, var16, var17, var18, var19, var20);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("wi.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    abstract void a(int param0, int param1);

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          field_b = (String) null;
        }
    }

    final static void a(int param0, dl[] param1, int param2, int param3, byte param4, int param5) {
        try {
          qc.a(192, param2, param3, param1, param0, param5, 2);
          if (param4 != -71) {
            field_b = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "wi.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
        field_b = "This is earth.<br>Dig your way through it<br>to get to the crystals.";
    }
}
