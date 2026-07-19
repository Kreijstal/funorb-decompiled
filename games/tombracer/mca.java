/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mca {
    short[] field_a;
    byte[] field_b;
    static String field_d;
    short[] field_e;
    short[] field_c;

    final static boolean a(byte param0, int param1) {
        boolean discarded$7 = false;
        if (0 != param1) {
          if (pl.a((byte) 64) != param1) {
            if (param0 == 6) {
              if (!vpa.a(114)) {
                if (mq.field_e != null) {
                  if (!mq.field_e.a((byte) -102, param1)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              discarded$7 = mca.a((byte) 65, -116);
              if (!vpa.a(114)) {
                if (mq.field_e != null) {
                  if (!mq.field_e.a((byte) -102, param1)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a(kb param0, int param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        kh var7 = null;
        kh var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var7 = ql.field_k;
            var8 = var7;
            var8.k(param2, -2988);
            var8.field_h = var8.field_h + 1;
            var4 = var8.field_h;
            var8.i(1, 0);
            var8.f(-1477662136, param0.field_l);
            var8.f(-1477662136, param0.field_f);
            var8.f(param1 ^ -1477662136, param0.field_n);
            var8.a(param0.field_i, (byte) -36);
            var8.a(param0.field_g, (byte) -75);
            var8.a(param0.field_k, (byte) -63);
            var8.a(param0.field_j, (byte) 124);
            var8.i(param0.field_o.length, 0);
            var5 = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 >= param0.field_o.length) {
                    break L3;
                  } else {
                    var7.a(param0.field_o[var5], (byte) 96);
                    var5++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                discarded$1 = var8.g(var4, 64);
                var8.d(-var4 + var8.field_h, (byte) 72);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("mca.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 0) {
            field_d = (String) null;
        }
    }

    static {
        field_d = "Please enter your date of birth to enable chat:";
    }
}
