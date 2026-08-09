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
            var4 = (fb) ((Object) bj.field_O.b((byte) 89));
            L1: while (true) {
              if (var4 == null) {
                var5 = (jg) ((Object) pc.field_e.b((byte) 86));
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
                    var5 = (jg) ((Object) pc.field_e.c((byte) 90));
                    continue L2;
                  }
                }
              } else {
                dn.a(var4, param0, 111);
                var4 = (fb) ((Object) bj.field_O.c((byte) 87));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "la.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_j = null;
        field_f = null;
        if (param0 > -52) {
          field_h = (String) null;
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
        byte[] var2;
        byte[] var3;
        var3 = new byte[this.field_i.capacity()];
        var2 = var3;
        this.field_i.position(0);
        if (param0 < 14) {
          return (byte[]) null;
        } else {
          this.field_i.get(var3);
          return var3;
        }
    }

    final void a(int param0, byte[] param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_i = java.nio.ByteBuffer.allocateDirect(param1.length);
              this.field_i.position(0);
              this.field_i.put(param1);
              if (param0 > 94) {
                break L1;
              } else {
                field_f = (String[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("la.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        field_h = "1pt";
        field_k = new e(15, 0, 1, 0);
    }
}
