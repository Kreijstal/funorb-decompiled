/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends ej {
    static go field_g;
    static String[] field_f;
    static String field_h;
    private java.nio.ByteBuffer field_i;
    static e field_k;
    static int[] field_j;

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        fb var4 = null;
        jg var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            var4 = (fb) (Object) bj.field_O.b((byte) 89);
            L1: while (true) {
              if (var4 == null) {
                var5 = (jg) (Object) pc.field_e.b((byte) 86);
                L2: while (true) {
                  if (var5 == null) {
                    if (param1 == 0) {
                      break L0;
                    } else {
                      la.a(41, -85);
                      return;
                    }
                  } else {
                    gd.a(var5, (byte) 86, param0);
                    var5 = (jg) (Object) pc.field_e.c((byte) 90);
                    continue L2;
                  }
                }
              } else {
                dn.a(var4, param0, 111);
                var4 = (fb) (Object) bj.field_O.c((byte) 87);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "la.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_j = null;
        field_f = null;
        if (param0 > -52) {
          field_h = null;
          field_k = null;
          field_h = null;
          field_g = null;
          return;
        } else {
          field_k = null;
          field_h = null;
          field_g = null;
          return;
        }
    }

    la() {
    }

    final byte[] a(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[((la) this).field_i.capacity()];
        var2 = var3;
        java.nio.Buffer discarded$9 = ((la) this).field_i.position(0);
        if (param0 < 14) {
          return null;
        } else {
          java.nio.ByteBuffer discarded$10 = ((la) this).field_i.get(var3);
          return var3;
        }
    }

    final void a(int param0, byte[] param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((la) this).field_i = java.nio.ByteBuffer.allocateDirect(param1.length);
              java.nio.Buffer discarded$4 = ((la) this).field_i.position(0);
              java.nio.ByteBuffer discarded$5 = ((la) this).field_i.put(param1);
              if (param0 > 94) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("la.B(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "1pt";
        field_k = new e(15, 0, 1, 0);
    }
}
