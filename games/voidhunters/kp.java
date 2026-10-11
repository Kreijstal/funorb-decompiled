/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            kp.a(9);
          }
          stackIn_3_0 = new nc(frb.a(228, 95));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kp.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void e(int param0) {
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        kla var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var6Lifetime1;
        var10 = VoidHunters.field_G;
        try {
          var1_int = 0;
          var2 = -1;
          if (param0 > -19) {
            kp.e(-126);
          }
          var3 = -1;
          var4 = -1;
          var5 = feb.a(og.field_r, true);
          for (var6 = 0; dma.field_j > var6; var6++) {
            var7 = -1;
            var8 = -1;
            for (var9 = 0; var9 < dma.field_g; var9++) {
              if (dma.field_i[var1_int] != 0) {
                var8 = var9;
                if (var7 == -1) {
                  var7 = var9;
                }
              }
              var1_int++;
            }
            boolean decompiledFrameRemainder0 = true;
            if (-1 != var7) {
              if (var2 != -1 && (!(Math.abs(var2 - var7) < 8) ||
                !(8 > Math.abs(-var8 + var3)))) {
                nr.a(var5, var3, var6, 2, var4, var2);
                var2 = -1;
                var3 = -1;
                if ((var7 != -1)) {
                  var3 = var8;
                  var2 = var7;
                  var4 = var6;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (var2 == -1) {
                  var4 = var6;
                }
                var2 = var7;
                var3 = var8;
              }
            } else {
              if (var2 != -1) {
                var3 = -1;
                var2 = -1;
              }
            }
          }
          if (var2 != -1) {
            var6Lifetime1 = dma.field_j;
            nr.a(var5, var3, var6Lifetime1, 2, var4, var2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "kp.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 <= 22) {
          field_o = (String) null;
        }
        field_o = null;
    }

    kp(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = "Private";
    }
}
