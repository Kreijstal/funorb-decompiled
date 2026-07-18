/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends bj implements qb {
    private hc field_J;
    static int field_H;
    private hc field_G;
    private hc field_I;

    public l() {
        super(0, 0, 476, 225, (db) null);
        ((l) this).field_I = new hc(pc.field_g, (wn) null);
        ((l) this).field_G = new hc(c.field_p, (wn) null);
        ((l) this).field_J = new hc(cj.field_c, (wn) null);
        ck var1 = new ck();
        ((l) this).field_I.field_s = (db) (Object) var1;
        ((l) this).field_G.field_s = (db) (Object) var1;
        ((l) this).field_J.field_s = (db) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> 1;
        ((l) this).field_G.a(var4, ((l) this).field_x - (48 - -var2), -var3 + ((l) this).field_g >> 1, true, 30);
        ((l) this).field_J.a(var4, -48 + (((l) this).field_x - var2), (((l) this).field_g + -var3 >> 1) + (var4 - -var2), true, 30);
        ((l) this).field_I.a(var3, -78 + (((l) this).field_x + -(2 * var2)), -var3 + ((l) this).field_g >> 1, true, 30);
        ((l) this).field_G.field_q = (wn) this;
        ((l) this).field_I.field_q = (wn) this;
        ((l) this).field_J.field_q = (wn) this;
        ((l) this).field_I.field_i = mm.field_c;
        ((l) this).field_J.field_i = lf.field_G;
        ((l) this).b((hm) (Object) ((l) this).field_G, false);
        ((l) this).b((hm) (Object) ((l) this).field_I, false);
        ((l) this).b((hm) (Object) ((l) this).field_J, false);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param1 <= 85) {
          ((l) this).field_J = null;
          var5 = ((l) this).field_k - -param3;
          var6 = param0 + ((l) this).field_j;
          int discarded$2 = sb.field_a.a(q.field_F, var5 + 20, var6 + 20, ((l) this).field_g + -40, ((l) this).field_x + -50, 16777215, -1, 1, 0, sb.field_a.field_r);
          super.a(param0, (byte) 99, param2, param3);
          return;
        } else {
          var5 = ((l) this).field_k - -param3;
          var6 = param0 + ((l) this).field_j;
          int discarded$3 = sb.field_a.a(q.field_F, var5 + 20, var6 + 20, ((l) this).field_g + -40, ((l) this).field_x + -50, 16777215, -1, 1, 0, sb.field_a.field_r);
          super.a(param0, (byte) 99, param2, param3);
          return;
        }
    }

    final static boolean a(byte param0) {
        if (param0 < -30) {
          if (!aj.b(-127)) {
            if (mg.field_b < 2) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_H = -87;
          if (!aj.b(-127)) {
            if (mg.field_b < 2) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
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
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (((l) this).field_G != param0) {
                if (((l) this).field_I == param0) {
                  int discarded$2 = -83;
                  fe.a();
                  break L1;
                } else {
                  if (((l) this).field_J == param0) {
                    bm.a(4);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                eh.b(-74);
                break L1;
              }
            }
            if (param3 == 1) {
              break L0;
            } else {
              boolean discarded$3 = l.a((byte) -64);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("l.K(");
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_9_0 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_8_0 = 0;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 71)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param2 != 98) {
                if (param3 >= 0) {
                  if (param2 == 99) {
                    stackOut_12_0 = ((l) this).a(param0, true);
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  stackOut_8_0 = 1;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              } else {
                stackOut_5_0 = ((l) this).a((byte) 22, param0);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("l.G(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_13_0;
    }

    final static int a(int param0, int param1) {
        if (!qd.a(param1, -99)) {
            return -1;
        }
        return param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = 4;
    }
}
