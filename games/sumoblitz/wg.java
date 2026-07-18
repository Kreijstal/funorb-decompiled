/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    private on field_a;
    int field_b;

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = hh.field_f;
            L1: while (true) {
              if (bf.field_c.length <= var3_int) {
                stackOut_14_0 = -1;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                L2: {
                  var5 = eb.field_a[var3_int];
                  if (var5 < 0) {
                    var4 = var4 + fn.field_t;
                    var3_int++;
                    break L2;
                  } else {
                    var6 = gt.a((byte) -59, bf.field_c[var3_int], true);
                    var7 = oj.field_a - (var6 >> 1);
                    var4 = var4 + qc.field_a;
                    if (oc.a(var4, (byte) 122, param2, var7 + -dw.field_b, ga.field_h + (ag.field_b << 1), param0, (dw.field_b << 1) + var6)) {
                      stackOut_6_0 = var5;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0;
                    } else {
                      var4 = var4 + (qc.field_a + (ag.field_b << 1) - -ga.field_h);
                      var3_int++;
                      break L2;
                    }
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3, "wg.A(" + param0 + ',' + 1882601153 + ',' + param2 + ')');
        }
        return stackIn_15_0;
    }

    final static int a(int param0, int param1) {
        if (param0 >= -113) {
            return 84;
        }
        if (param1 < 0) {
            param1 = -param1;
        }
        int var2 = 0;
        if (param1 > 65535) {
            var2 = var2 | 16;
            param1 = param1 >>> 16;
        }
        if (param1 > 255) {
            var2 = var2 | 8;
            param1 = param1 >>> 8;
        }
        if (!(param1 <= 15)) {
            var2 = var2 | 4;
            param1 = param1 >>> 4;
        }
        if (!(3 >= param1)) {
            param1 = param1 >>> 2;
            var2 = var2 | 2;
        }
        if (param1 > 1) {
            param1 = param1 >>> 1;
            var2 = var2 | 1;
        }
        return var2;
    }

    protected final void finalize() throws Throwable {
        ((wg) this).field_a.a(((wg) this).field_b, (byte) -96);
        super.finalize();
    }

    wg(on param0, int param1, int param2) {
        try {
            ((wg) this).field_b = param2;
            ((wg) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "wg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static wb a(int param0, int param1, int param2) {
        wb var3 = null;
        int var4 = 0;
        int var5 = 0;
        wb var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var6 = new wb(param0, param0);
        var3 = var6;
        var4 = 0;
        L0: while (true) {
          if (var3.field_C.length <= var4) {
            if (param2 != 3) {
              return null;
            } else {
              return var3;
            }
          } else {
            var6.field_C[var4] = param1;
            var4++;
            continue L0;
          }
        }
    }

    static {
    }
}
