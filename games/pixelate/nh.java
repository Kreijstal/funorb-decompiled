/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    static String field_d;
    static String field_c;
    static int[] field_a;
    static int field_b;

    final static ae c(byte param0) {
        int var1;
        int var2;
        int var3;
        int var4;
        ae var5;
        int var6;
        var6 = Pixelate.field_H ? 1 : 0;
        var3 = -63 / ((param0 + 27) / 63);
        do {
          var1 = od.a((byte) 41, 65536, -65536);
          var2 = od.a((byte) 41, 65536, -65536);
          var4 = od.a((byte) 41, 65536, -65536);
        } while (0 == var1 &&
          0 == var2 &&
          var4 == 0);
        var5 = new ae(var1, var2, var4);
        var5.a((byte) -7);
        return var5;
    }

    public static void b(byte param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 <= 61) {
          nh.b((byte) -92);
        }
    }

    final static void a(byte param0) {
        int var1 = rk.field_e.g(16711680);
        int var2 = rk.field_e.g(16777215);
        if (param0 <= 54) {
          field_c = (String) null;
        }
        int var3 = rk.field_e.field_R[0].length;
        rk.field_e.field_R = new int[4][];
        int[] array$0 = new int[var3];
        rk.field_e.field_R[0] = array$0;
        rk.field_e.field_R[0][var1] = 65793;
        rk.field_e.field_R[0][var2] = 16777215;
        int[] array$1 = new int[var3];
        rk.field_e.field_R[1] = array$1;
        rk.field_e.field_R[1][var1] = 65793;
        rk.field_e.field_R[1][var2] = 16711680;
        int[] array$2 = new int[var3];
        rk.field_e.field_R[2] = array$2;
        rk.field_e.field_R[2][var1] = 65793;
        rk.field_e.field_R[2][var2] = 11184810;
        int[] array$3 = new int[var3];
        rk.field_e.field_R[3] = array$3;
        rk.field_e.field_R[3][var1] = 65793;
        rk.field_e.field_R[3][var2] = 4473924;
    }

    final static long a(CharSequence param0, int param1) {
        int var5 = 0;
        long stackIn_25_0 = 0L;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          var2_long = 0L;
          var4 = param0.length();
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (65 <= var6 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(-65 + var6 + 1);
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(-97 + var6 + 1);
            } else {
              if (48 <= var6 &&
                57 >= var6) {
                var2_long = var2_long + (long)(-48 + var6 + 27);
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (0L == var2_long % 37L) {
            if (0L != var2_long) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          if (param1 != -29667) {
            field_c = (String) null;
          }
          stackIn_25_0 = var2_long;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("nh.A(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          if (param4 < 99) {
            field_d = (String) null;
          }
          if (param2 < t.field_e) {
            param5 = param5 - (t.field_e - param2);
            param2 = t.field_e;
          }
          if (param5 + param2 > t.field_h) {
            param5 = -param2 + t.field_h;
          }
          if (t.field_f > param3) {
            param0 = param0 - (-param3 + t.field_f);
            param3 = t.field_f;
          }
          if (param0 + param3 > t.field_a) {
            param0 = t.field_a - param3;
          }
          if (0 < param5 &&
            param0 > 0) {
            var6_int = param2 + param3 * t.field_j;
            var7 = -param5 + t.field_j;
            for (param3 = -param0; param3 < 0; param3++) {
              for (param2 = -param5; param2 < 0; param2++) {
                var8 = t.field_k[var6_int];
                if ((var8 & 65280) >> 8 > param1 &&
                  (255 & var8 >> 8) >= (var8 >> 16 & 255)) {
                  var9 = ((16711680 & var8) >> 15) - 60;
                  if (var9 > 255) {
                    var9 = 255;
                  }
                  var10 = 65280 & var8;
                  var10 = (var10 >> 1) - (var10 >> 5) & 65280;
                  var11 = (255 & var8) >> 3;
                  t.field_k[var6_int] = bq.a(var11, bq.a(var10, var9 << 16));
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var6), "nh.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_c = "This game is full.";
        field_a = new int[4];
        field_d = "Mute this player for 48 hours";
    }
}
