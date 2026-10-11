/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends pg {
    int field_o;
    int field_j;
    int field_m;
    int field_g;
    vl field_h;
    static String field_k;
    static String field_l;
    int field_n;
    static ll[] field_i;

    final static void d(byte param0) {
        int incrementValue$0 = 0;
        int var6 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int[][] var4 = null;
        int var5 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        int var3Lifetime1;
        int var3Lifetime2;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var8 = new byte[27];
          var10 = var8;
          var9 = var10;
          var1 = var9;
          var2 = 0;
          incrementValue$0 = var2;
          var2++;
          var8[incrementValue$0] = (byte) 0;
          for (var3 = 0; 4 > var3; var3++) {
            var4 = (int[][]) null;
            if (var3 == 0) {
              var4 = ld.field_n;
            }
            if (var3 == 1) {
              var4 = ud.field_z;
            }
            if (var3 == 2) {
              var4 = ug.field_d;
            }
            if (var3 == 3) {
              var4 = hi.field_b;
            }
            var5 = -1;
            for (var6 = 0; var6 < var4.length; var6++) {
              if (~var4[var6][0] == ~kg.field_d[var3][0] &&
                var4[var6][1] == kg.field_d[var3][1] &&
                kg.field_d[var3][2] == var4[var6][2]) {
                var5 = (byte)var6;
              }
            }
            if (var5 != -1) {
              incrementValue$3 = var2;
              var2++;
              var1[incrementValue$3] = (byte)var5;
            } else {
              incrementValue$4 = var2;
              var2++;
              var1[incrementValue$4] = (byte) 0;
            }
          }
          for (var3Lifetime1 = 0; 6 > var3Lifetime1; var3Lifetime1++) {
            incrementValue$2 = var2;
            var2++;
            var1[incrementValue$2] = (byte)so.field_c[var3Lifetime1];
          }
          if (param0 <= 59) {
            field_l = (String) null;
          }
          for (var3Lifetime2 = 0; 16 > var3Lifetime2; var3Lifetime2++) {
            incrementValue$1 = var2;
            var2++;
            var1[incrementValue$1] = (byte)b.field_f[var3Lifetime2];
          }
          if (!lc.a((byte) 112)) {
            tf.a(6, -25866, var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "vl.C(" + param0 + ')');
        }
    }

    final static void a(byte param0, ij param1) {
        try {
          int var2_int = 72 % ((param0 - 77) / 38);
          co.field_f.a(param1, 9);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_l = null;
        field_i = null;
        if (param0 > -66) {
          field_i = (ll[]) null;
        }
    }

    final static String a(byte param0, CharSequence param1) {
        int var5 = 0;
        int var2_int = 0;
        int var3 = 0;
        char[] var4 = null;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        String stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = 21 / ((param0 - 40) / 54);
          if (var2_int > 20) {
            var2_int = 20;
          }
          var9 = new char[var2_int];
          var8 = var9;
          var4 = var8;
          for (var5 = 0; var2_int > var5; var5++) {
            var6 = param1.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var4[var5] = (char)(var6 + 32);
            } else if ((var6 < 97 ||
              122 < var6) &&
              (var6 < 48 ||
              var6 > 57)) {
              var4[var5] = (char)95;
            } else {
              var4[var5] = (char)var6;
            }
          }
          stackIn_19_0 = new String(var9);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("vl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (!vh.field_n) {
          lo.field_q = (1600 + lo.field_q * 120) / 128;
        } else {
          lo.field_q = 120 * lo.field_q / 128;
        }
        if (param0 != 128) {
          ij var2 = (ij) null;
          vl.a((byte) 37, (ij) null);
        }
    }

    vl(int param0, int param1, int param2, int param3, int param4) {
        this.field_o = param1;
        this.field_j = param0;
        this.field_n = param4;
        this.field_g = param3;
        this.field_m = param2;
    }

    static {
        field_k = "This is a <col=ff80ff><shad=0>level 3</col></shad> spell and is unavailable unless you also put 5 other spells from the <%0> into your spellbook. You currently only have <%1>";
        field_l = "Choose the spells you wish your Arcanist to take into battle.<br>Select a spellbook from the top of the screen, then select your spells from the wheel to the left. You can remove spells from your spellbook by clicking on the icons above.";
    }
}
