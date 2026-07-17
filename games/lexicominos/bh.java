/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends nl {
    private java.nio.ByteBuffer field_d;

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        cg var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = -95 % ((25 - param0) / 50);
            var3 = (cg) (Object) ca.field_n.a(true);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                Lexicominos.a(-17800, var3, 2);
                var3 = (cg) (Object) ca.field_n.f(2);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "bh.E(" + param0 + 44 + 2 + 41);
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 0) {
            Object var3 = null;
            boolean discarded$0 = bh.a(true, (CharSequence) null, -76);
        }
        tg.a(param1, true, 114);
    }

    final void a(byte[] param0, boolean param1) {
        try {
            if (!param1) {
                ((bh) this).field_d = null;
            }
            ((bh) this).field_d = java.nio.ByteBuffer.allocateDirect(param0.length);
            java.nio.Buffer discarded$0 = ((bh) this).field_d.position(0);
            java.nio.ByteBuffer discarded$1 = ((bh) this).field_d.put(param0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "bh.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void b(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            nl.a(param1, 0, true, -123, rb.field_a, r.field_D, pf.field_o);
            if (param0 == 83) {
              var2_int = 0;
              L1: while (true) {
                if (var2_int >= pf.field_o) {
                  L2: {
                    nl.a(param1 + param1, param1, false, -93, l.field_G, ve.field_d, pf.field_o - -param1);
                    if (param1 < pf.field_o) {
                      pf.field_o = param1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  ff.field_a[var2_int - -param1] = var2_int;
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "bh.C(" + param0 + 44 + param1 + 41);
        }
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param2 <= -68) {
              if (!bb.a(param1, param0, -1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                var3_int = 0;
                L1: while (true) {
                  if (param1.length() <= var3_int) {
                    stackOut_15_0 = 1;
                    stackIn_16_0 = stackOut_15_0;
                    break L0;
                  } else {
                    if (!ee.a(-125, param1.charAt(var3_int))) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    } else {
                      var3_int++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("bh.B(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 41);
        }
        return stackIn_16_0 != 0;
    }

    final byte[] a(byte param0) {
        byte[] var3 = new byte[((bh) this).field_d.capacity()];
        byte[] var2 = var3;
        if (param0 != -121) {
            return null;
        }
        java.nio.Buffer discarded$0 = ((bh) this).field_d.position(0);
        java.nio.ByteBuffer discarded$1 = ((bh) this).field_d.get(var3);
        return var3;
    }

    bh() {
    }

    static {
    }
}
