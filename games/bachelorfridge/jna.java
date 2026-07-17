/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jna extends bw {
    static int[] field_f;

    final static void a(int param0, int param1, int param2, boolean param3, String param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (0 != oi.field_w.field_R) {
                if (!hl.field_I) {
                  if (sea.field_j) {
                    fk.d(120);
                    break L1;
                  } else {
                    lna.field_q = true;
                    break L1;
                  }
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (lna.field_q) {
                int discarded$13 = 20;
                qfa.a(param0, param6, param7, (byte) -115, param6, param4, param5, param1);
                bi.field_h.a(19842, param3);
                if (!param3) {
                  break L2;
                } else {
                  L3: {
                    if (ub.field_k.field_R == 0) {
                      break L3;
                    } else {
                      lna.field_q = false;
                      break L3;
                    }
                  }
                  if (qq.field_k.field_R != 0) {
                    bea.d(param2 ^ 125);
                    lna.field_q = false;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            if (param2 == -1) {
              break L0;
            } else {
              jna.a(20);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var8;
            stackOut_18_1 = new StringBuilder().append("jna.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final void a(int param0, lu param1) {
        try {
            ((jna) this).field_c = param1.c(-99);
            if (param0 > -43) {
                field_f = null;
            }
            int discarded$0 = param1.f(-55);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jna.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static kv[] a(int param0, int param1, byte param2, int param3) {
        kv[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        kv[] var7 = null;
        var6 = BachelorFridge.field_y;
        var7 = new kv[9];
        var4 = var7;
        var7[0] = ik.b(1, param3, 2);
        var5 = 1;
        L0: while (true) {
          if (9 <= var5) {
            var4[4] = ik.b(64, param0, 2);
            return var4;
          } else {
            var7[var5] = var7[0];
            var5++;
            continue L0;
          }
        }
    }

    jna() {
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 30862) {
          var2 = null;
          jna.a(-29, 74, 14, false, (String) null, -5, 108, 69);
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    final static void a(boolean param0, boolean param1) {
        wia.a(param1, (byte) 31);
        kh.a((byte) -74, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[256];
    }
}
