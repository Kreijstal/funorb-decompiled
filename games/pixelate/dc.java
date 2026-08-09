/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static byte[] field_b;
    static ak field_a;

    final static void a(byte param0, java.awt.Frame param1, cb param2) {
        ei var3 = null;
        int var4 = 0;
        cb var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -124) {
                break L1;
              } else {
                var5 = (cb) null;
                dc.a((byte) 3, (java.awt.Frame) null, (cb) null);
                break L1;
              }
            }
            L2: while (true) {
              var3 = param2.a(param1, -84);
              L3: while (true) {
                if (-1 != (var3.field_b ^ -1)) {
                  if (var3.field_b == 1) {
                    param1.setVisible(false);
                    param1.dispose();
                    break L0;
                  } else {
                    vg.a(100L, (byte) 23);
                    continue L2;
                  }
                } else {
                  vg.a(10L, (byte) 23);
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("dc.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 == -1) {
            return;
        }
        field_a = (ak) null;
    }

    static {
    }
}
