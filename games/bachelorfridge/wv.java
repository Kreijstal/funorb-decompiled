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
        RuntimeException var2 = null;
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
        int[] var17 = null;
        int[] var18 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            lka.field_E = qs.a(false, new lu(param1));
            gfa.field_a = new wca[-1 + lka.field_E.length];
            var2_int = 1;
            L1: while (true) {
              if (var2_int >= lka.field_E.length) {
                break L0;
              } else {
                L2: {
                  var3 = Integer.parseInt(lka.field_E[var2_int][0]);
                  var4 = lka.field_E[var2_int][3];
                  var5 = lka.field_E[var2_int][4];
                  var6 = m.a(var2_int, (byte) 98, 1);
                  var7 = kka.a(var2_int, -55, 2);
                  var8 = new int[13];
                  var13 = w.field_h[var2_int + -1];
                  var15 = var13;
                  var8 = var15;
                  var9 = lka.field_E[var2_int][15];
                  if (7 != var6) {
                    if (var6 == 6) {
                      var8[1] = m.a(var2_int, (byte) 105, 5);
                      var8[4] = kka.a(var2_int, -67, 6);
                      var8[7] = kka.a(var2_int, -72, 7);
                      var8[10] = kka.a(var2_int, -124, 8);
                      break L2;
                    } else {
                      var8[1] = m.a(var2_int, (byte) 30, 5);
                      var8[4] = m.a(var2_int, (byte) 99, 6);
                      var8[7] = kka.a(var2_int, 68, 7);
                      var8[10] = kka.a(var2_int, 61, 8);
                      break L2;
                    }
                  } else {
                    var13[1] = kka.a(var2_int, 95, 5);
                    var13[4] = kka.a(var2_int, 85, 6);
                    var13[7] = kka.a(var2_int, -41, 7);
                    var13[10] = kka.a(var2_int, -75, 8);
                    break L2;
                  }
                }
                var10 = ch.a((byte) 91, var2_int);
                var18 = new int[4];
                var17 = var18;
                var16 = var17;
                var14 = var16;
                var11 = var14;
                int discarded$4 = -16306;
                var11[0] = vc.a(var2_int, 10);
                int discarded$5 = -16306;
                var11[1] = vc.a(var2_int, 11);
                int discarded$6 = -16306;
                var11[2] = vc.a(var2_int, 12);
                int discarded$7 = -16306;
                var11[3] = vc.a(var2_int, 13);
                ob.a(var4, var10, var18, var9, var7, (byte) 22, var7, var5, uma.field_P[var3], var15);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("wv.B(").append(-73).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    static {
    }
}
