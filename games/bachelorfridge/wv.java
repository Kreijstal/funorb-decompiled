/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wv extends pu {
    static sna field_l;

    public static void b(int param0) {
        if (param0 > -55) {
          wv.b(-52);
        }
        field_l = null;
    }

    final static void a(byte param0, byte[] param1) {
        int var2_int = 0;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        String var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var8Lifetime1;
        var12 = BachelorFridge.field_y;
        try {
          lka.field_E = qs.a(false, new lu(param1));
          if (param0 >= -16) {
            field_l = (sna) null;
          }
          gfa.field_a = new wca[-1 + lka.field_E.length];
          for (var2_int = 1; var2_int < lka.field_E.length; var2_int++) {
            var3 = Integer.parseInt(lka.field_E[var2_int][0]);
            var4 = lka.field_E[var2_int][3];
            var5 = lka.field_E[var2_int][4];
            var6 = m.a(var2_int, (byte) 98, 1);
            var7 = kka.a(var2_int, -55, 2);
            var8 = new int[13];
            var13 = w.field_h[var2_int - 1];
            var15 = var13;
            var8Lifetime1 = var15;
            var9 = lka.field_E[var2_int][15];
            if (7 != var6) {
              if (var6 == 6) {
                var8Lifetime1[1] = m.a(var2_int, (byte) 105, 5);
                var8Lifetime1[4] = kka.a(var2_int, -67, 6);
                var8Lifetime1[7] = kka.a(var2_int, -72, 7);
                var8Lifetime1[10] = kka.a(var2_int, -124, 8);
              } else {
                var8Lifetime1[1] = m.a(var2_int, (byte) 30, 5);
                var8Lifetime1[4] = m.a(var2_int, (byte) 99, 6);
                var8Lifetime1[7] = kka.a(var2_int, 68, 7);
                var8Lifetime1[10] = kka.a(var2_int, 61, 8);
              }
            } else {
              var13[1] = kka.a(var2_int, 95, 5);
              var13[4] = kka.a(var2_int, 85, 6);
              var13[7] = kka.a(var2_int, -41, 7);
              var13[10] = kka.a(var2_int, -75, 8);
            }
            var10 = ch.a((byte) 91, var2_int);
            var16 = new int[4];
            var14 = var16;
            var11 = var14;
            var11[0] = vc.a(var2_int, 10, -16306);
            var11[1] = vc.a(var2_int, 11, -16306);
            var11[2] = vc.a(var2_int, 12, -16306);
            var11[3] = vc.a(var2_int, 13, -16306);
            ob.a(var4, var10, var16, var9, var7, (byte) 22, var7, var5, uma.field_P[var3], var15);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("wv.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
    }
}
