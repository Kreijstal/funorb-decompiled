/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends pi {
    static int field_n;
    int[] field_p;
    boolean field_o;

    final static void a() {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        ld var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        sl var11 = null;
        ki var12 = null;
        ld var13 = null;
        ki var14 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = MinerDisturbance.field_ab;
        try {
          L0: {
            var13 = kj.field_a;
            var2 = var13.d((byte) -54);
            if (0 == var2) {
              int discarded$2 = 0;
              var10 = hk.b();
              var3 = var10;
              var9 = var10;
              var4 = var9;
              var5 = var13;
              var6 = ((sb) (Object) var5).d((byte) -54);
              var7 = 0;
              L1: while (true) {
                if (var6 <= var7) {
                  var12 = (ki) (Object) on.field_v.b(110);
                  if (var12 != null) {
                    var12.field_p = var3;
                    var12.field_o = true;
                    var12.b(34);
                    break L0;
                  } else {
                    si.a(-36);
                    return;
                  }
                } else {
                  var9[var7] = ((sb) (Object) var5).b((byte) 118);
                  var7++;
                  continue L1;
                }
              }
            } else {
              if (var2 != 1) {
                if (var2 == 2) {
                  var14 = (ki) (Object) on.field_v.b(64);
                  if (var14 == null) {
                    si.a(-79);
                    return;
                  } else {
                    int discarded$3 = 0;
                    var14.field_p = hk.b();
                    var14.field_o = true;
                    var14.b(34);
                    return;
                  }
                } else {
                  di.a((Throwable) null, 1, "A1: " + hj.a((byte) 116));
                  si.a(-110);
                  return;
                }
              } else {
                var11 = (sl) (Object) tc.field_v.b(101);
                if (var11 == null) {
                  si.a(-95);
                  return;
                } else {
                  var11.b(34);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "ki.A(" + -15003 + ')');
        }
    }

    final static ea[] a(int param0, bj param1, int param2, byte param3) {
        RuntimeException var4 = null;
        Object var5 = null;
        ea[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ea[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (cn.a(param0, param3 ^ -261, param2, param1)) {
              L1: {
                if (param3 == -7) {
                  break L1;
                } else {
                  var5 = null;
                  ea[] discarded$2 = ki.a(-56, (bj) null, -11, (byte) 16);
                  break L1;
                }
              }
              stackOut_5_0 = wc.a(-29);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("ki.B(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    ki() {
        ((ki) this).field_o = false;
    }

    static {
    }
}
