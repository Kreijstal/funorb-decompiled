/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk extends gn {
    static int[] field_g;
    int[] field_e;
    boolean field_f;
    static String[] field_h;

    final static ut[] a(int param0, int param1, byte param2, sj param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 75 / ((72 - param2) / 47);
          if (cu.a(param1, param3, param0, 117)) {
            return wp.a(-125);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("dk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5;
        int var6;
        int var7;
        int var8;
        sj var9;
        sj var9Lifetime1;
        sj var9Lifetime2;
        var5 = param4 * 52 + param0;
        var6 = var5 + 52;
        var7 = 75 * param3 + param2;
        var8 = 75 + var7;
        boolean decompiledFrameRemainder0 = true;
        if (0 < param4) {
          var5++;
          if (param4 < 2) {
            var6--;
          }
        } else {
          if (param4 >= 2) {
            if (2 > param3) {
              var8--;
              decompiledFrameRemainder0 = false;
            }
            else {
              if (0 < param3) {
                var7++;
                if (param1 > -95) {
                  var9 = (sj) null;
                  dk.a(72, -51, (byte) 107, (sj) null);
                }
                pt.a(var6, -22914, var5, var8, var7);
                return;
              }
              if (param1 <= -95) {
                pt.a(var6, -22914, var5, var8, var7);
                return;
              }
              var9Lifetime2 = (sj) null;
              dk.a(72, -51, (byte) 107, (sj) null);
              pt.a(var6, -22914, var5, var8, var7);
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            var6--;
          }
        }
        if ((decompiledFrameRemainder0) &&
          (2 > param3)) {
          var8--;
        }
        if (0 < param3) {
          var7++;
        }
        if (param1 > -95) {
          var9Lifetime1 = (sj) null;
          dk.a(72, -51, (byte) 107, (sj) null);
        }
        pt.a(var6, -22914, var5, var8, var7);
    }

    public static void a(int param0) {
        field_h = null;
        field_g = null;
        if (param0 != 7571) {
          field_g = (int[]) null;
        }
    }

    dk() {
        this.field_f = false;
    }

    static {
        field_h = new String[]{"THE TANK", "THE KEEPER", "THE RANGER", "THE HOTSHOT", "THE ELITE"};
    }
}
