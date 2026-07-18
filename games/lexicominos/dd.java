/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dd {
    static db field_f;
    int field_c;
    static String field_d;
    int[] field_b;
    java.awt.Image field_e;
    int field_a;

    abstract void a(boolean param0, int param1, int param2, java.awt.Component param3);

    final static void a(int param0, int param1) {
        th var2 = ed.field_q;
        var2.h(6, 0);
        var2.c(1, -1);
        var2.c(0, -1);
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if (!(0 != param1)) {
            return 0;
        }
        if (param1 > 0) {
            var2 = 1;
            if (!(param1 <= 65535)) {
                param1 = param1 >> 16;
                var2 += 16;
            }
            if (!(param1 <= 255)) {
                var2 += 8;
                param1 = param1 >> 8;
            }
            if (!(param1 <= 15)) {
                var2 += 4;
                param1 = param1 >> 4;
            }
            if (param1 > 3) {
                param1 = param1 >> 2;
                var2 += 2;
            }
            if (param1 > 1) {
                param1 = param1 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (!(param1 >= -65536)) {
            var2 += 16;
            param1 = param1 >> 16;
        }
        if (param1 < -256) {
            param1 = param1 >> 8;
            var2 += 8;
        }
        if (!(param1 >= -16)) {
            var2 += 4;
            param1 = param1 >> 4;
        }
        if (!(param1 >= -4)) {
            param1 = param1 >> 2;
            var2 += 2;
        }
        if (param1 < -2) {
            var2++;
            param1 = param1 >> 1;
        }
        return var2;
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        if (param1) {
            var4 += 4;
        }
        if (!(!param0)) {
            var4 += 2;
        }
        return sb.field_c[var4];
    }

    abstract void a(int param0, java.awt.Graphics param1, byte param2, int param3);

    public static void a(int param0) {
        field_d = null;
        field_f = null;
    }

    final static void a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (var2_int >= param0.length) {
                var2_int = var2_int / 3;
                L2: while (true) {
                  if (var2_int <= 0) {
                    break L0;
                  } else {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= var2_int) {
                        var2_int = var2_int / 3;
                        continue L2;
                      } else {
                        vh.a((byte) -42, var2_int, param0, var3);
                        var3++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var2_int = 1 + 3 * var2_int;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("dd.H(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + -23588 + ')');
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
            return;
        }
        lf.a(((dd) this).field_b, ((dd) this).field_a, ((dd) this).field_c);
    }

    static {
    }
}
