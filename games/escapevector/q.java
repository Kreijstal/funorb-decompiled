/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends hc {
    int field_M;
    private int field_D;
    static java.math.BigInteger field_O;
    static String field_F;
    static boolean field_P;
    private static boolean[] field_N;
    private static boolean[] field_Q;
    static String field_H;
    private static boolean[] field_I;
    static boolean[][] field_E;
    static String[] field_L;
    int field_J;
    static Sprite field_G;
    private kn field_K;

    final boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        String stackIn_29_2 = null;
        int var14 = EscapeVector.obfuscationControl;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          int var8_int = -this.field_M + (param1 - param4);
          int var9 = -(2 * this.field_M) + this.field_g;
          if (var8_int > var9) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_D / var9;
          if (param6 != 1) {
            if (param6 != 2) {
              return true;
            }
            int var10 = 2147483647;
            int var11 = -1;
            for (int var12 = 0; this.field_K.a(true) > var12; var12++) {
              int var13 = -var8_int + this.field_K.a(-49, var12);
              var13 = var13 * var13;
              if (var13 < var10) {
                var10 = var13;
                var11 = var12;
              }
            }
            if (var11 >= 0) {
              this.field_K.c(0, var11);
            }
          } else {
            this.field_K.a(var8_int, (byte) -51);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_28_0 = var8;
          StringBuilder stackIn_28_1 = new StringBuilder().append("q.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param6).append(')').toString());
        }
    }

    final int e(byte param0) {
        if (param0 != 98) {
          return 116;
        }
        return this.field_K.a(true);
    }

    final int b(int param0, byte param1) {
        if (param0 < 0) {
          return -1;
        }
        if (this.field_K.a(true) <= param0) {
          return -1;
        }
        if (param1 == 97) {
          return this.field_K.a(-109, param0);
        }
        this.field_D = 112;
        return this.field_K.a(-109, param0);
    }

    public static void a(byte param0) {
        field_Q = null;
        field_H = null;
        field_L = null;
        field_O = null;
        field_I = null;
        field_G = null;
        field_N = null;
        if (param0 > 6) {
          field_F = null;
          field_E = (boolean[][]) null;
          return;
        }
        field_N = (boolean[]) null;
        field_F = null;
        field_E = (boolean[][]) null;
    }

    final int k(int param0) {
        if (param0 == -1) {
          return this.field_D;
        }
        hm var3 = (hm) null;
        this.a(-27, -35, (byte) -19, -117, -67, (hm) null, 21);
        return this.field_D;
    }

    final static void c(int param0, byte param1) {
        if (param1 < -60) {
          c var2 = om.field_c;
          var2.a(param0, true);
          var2.f(1, -123);
          var2.f(0, -123);
          return;
        }
        field_P = true;
        c var2Lifetime1 = om.field_c;
        var2Lifetime1.a(param0, true);
        var2Lifetime1.f(1, -123);
        var2Lifetime1.f(0, -123);
    }

    private q() throws Throwable {
        throw new Error();
    }

    static {
        field_O = new java.math.BigInteger("65537");
        field_H = "Unpacking music";
        field_F = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_N = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
        field_I = new boolean[]{true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
        field_L = new String[]{"layer0", "layer1", "layer2", "layer3"};
        field_Q = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
        field_E = new boolean[][]{field_N, field_N, field_Q, field_I};
    }
}
