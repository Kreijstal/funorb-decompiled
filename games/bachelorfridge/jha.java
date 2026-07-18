/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jha extends kj {
    private kv field_h;
    static fea field_g;
    private int field_k;
    static byte[] field_j;
    private int field_f;
    static eaa field_i;

    public static void c(byte param0) {
        field_g = null;
        field_j = null;
        field_i = null;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = (int)(128.0 * (1.0 - Math.cos(3.141592653589793 * (double)((jha) this).field_f / 32.0)));
        super.a(param0, param1 + param1, param2);
        ((jha) this).field_h.a(param2, param0, var4);
    }

    jha(gj param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        kv var5 = null;
        try {
            ((jha) this).field_f = 64;
            ((jha) this).field_k = param3;
            var5 = param0.field_s.field_p;
            ((jha) this).field_h = new kv(var5.field_q, var5.field_p);
            bu.a(0, ((jha) this).field_h);
            var5.e(0, 0, 16777215);
            db.b(73);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static kv a(vr param0, byte param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (g.a(param2, param3, -30744, param0)) {
            return ws.a((byte) 98);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("jha.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 4 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static sna c(int param0) {
        return mt.c(0);
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            ((jha) this).field_h = null;
        }
    }

    final boolean b(int param0) {
        int[][] var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[][] var7 = null;
        int[][] var8 = null;
        int[] var9 = null;
        int[][] var10 = null;
        int[] var11 = null;
        int[][] var12 = null;
        int[] var13 = null;
        int[][] var14 = null;
        int[] var15 = null;
        var6 = BachelorFridge.field_y;
        if (param0 > 21) {
          int fieldTemp$2 = ((jha) this).field_f - 1;
          ((jha) this).field_f = ((jha) this).field_f - 1;
          if (fieldTemp$2 <= 0) {
            return true;
          } else {
            if (32 == ((jha) this).field_f) {
              var14 = ((jha) this).field_e.field_h.field_i;
              var12 = var14;
              var10 = var12;
              var8 = var10;
              var7 = var8;
              var2 = var7;
              var3 = 0;
              L0: while (true) {
                if (var3 >= var14.length) {
                  return false;
                } else {
                  var15 = var14[var3];
                  var13 = var15;
                  var11 = var13;
                  var9 = var11;
                  var4 = var9;
                  if (((jha) this).field_d == var15[0]) {
                    if (var15[1] == ((jha) this).field_c) {
                      L1: {
                        var5 = var15[2];
                        if (-1 != var5) {
                          ((jha) this).field_e.field_T[var5] = ((jha) this).field_e.field_T[var5] - 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      var4[2] = ((jha) this).field_k;
                      ((jha) this).field_e.field_T[((jha) this).field_k] = ((jha) this).field_e.field_T[((jha) this).field_k] + 1;
                      var3++;
                      continue L0;
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new byte[]{(byte) 5, (byte) 3, (byte) 4, (byte) 3, (byte) 4};
        field_i = null;
    }
}
