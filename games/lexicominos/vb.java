/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends kd {
    int field_h;
    int field_o;
    int field_q;
    static ja field_r;
    int field_n;
    static ng field_m;
    int field_p;
    static aj field_l;
    int field_j;
    static int field_i;
    static String field_k;

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int[] param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param5 != -95) {
            field_m = (ng) null;
          }
          while (true) {
            param2--;
            if (0 > param2) {
              return;
            }
            var17 = param6;
            var10 = var17;
            var11 = param8;
            var12 = param4;
            var13 = param1;
            var14 = param9;
            var15 = (16711422 & var17[var11]) >> 1;
            var10[var11] = vg.a(var13 >> 9, 65280) + vg.a(var12 >> 1, 16711680) + (vg.a(var14, 33440375) >> 17) + var15;
            param9 = param9 + param3;
            param4 = param4 + param0;
            param1 = param1 + param7;
            param8++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("vb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        if (param0 < 66) {
          return;
        }
        field_m = null;
        field_r = null;
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (jd.a((byte) -16, param1)) {
            return true;
          }
          var7 = hb.field_a;
          var2 = var7;
          var3 = 97 % ((28 - param0) / 61);
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (~param1 == ~var5) {
              return true;
            }
          }
          var2Lifetime1 = n.field_l;
          var3Lifetime1 = 0;
          while (true) {
            if (var3Lifetime1 >= var2Lifetime1.length) {
              return false;
            }
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (var4Lifetime1 != param1) {
              var3Lifetime1++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref), "vb.C(" + param0 + ',' + param1 + ')');
        }
    }

    vb(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_p = param1;
        this.field_h = param4;
        this.field_n = param0;
        this.field_j = param2;
        this.field_q = param3;
        this.field_o = param5;
    }

    static {
        field_m = new ng();
        field_l = new aj(4, 1, 1, 1);
        field_k = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
