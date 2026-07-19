/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static String field_a;

    final static void a(byte param0) {
        om.field_s.field_a = 0;
        om.field_s.field_e = 0;
        if (param0 != -26) {
            a.a(-100);
        }
    }

    final static vj a(String param0, int param1) {
        RuntimeException var2 = null;
        vj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        vj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -6728) {
                break L1;
              } else {
                a.a((byte) 115);
                break L1;
              }
            }
            stackOut_2_0 = new vj(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("a.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0) {
        if (!tl.field_g) {
          if (mf.field_f != null) {
            if (mf.field_f.field_o) {
              oj.field_B = oj.field_B & (mf.field_f.field_s ^ -1);
              i.field_o = i.field_o | mf.field_f.field_s;
              mf.field_f = null;
              tl.field_g = true;
              if (!tl.field_g) {
                if (param0 != 0) {
                  a.a(false);
                  return;
                } else {
                  return;
                }
              } else {
                tg.a((byte) -124);
                if (param0 != 0) {
                  a.a(false);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (!tl.field_g) {
                if (param0 != 0) {
                  a.a(false);
                  return;
                } else {
                  return;
                }
              } else {
                tg.a((byte) -124);
                if (param0 != 0) {
                  a.a(false);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            L0: {
              mf.field_f = ij.a(param0 ^ -108, 4);
              if (mf.field_f.field_o) {
                oj.field_B = oj.field_B & (mf.field_f.field_s ^ -1);
                i.field_o = i.field_o | mf.field_f.field_s;
                mf.field_f = null;
                tl.field_g = true;
                break L0;
              } else {
                break L0;
              }
            }
            if (!tl.field_g) {
              if (param0 != 0) {
                a.a(false);
                return;
              } else {
                return;
              }
            } else {
              tg.a((byte) -124);
              if (param0 != 0) {
                a.a(false);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (tl.field_g) {
            tg.a((byte) -124);
            if (param0 == 0) {
              return;
            } else {
              a.a(false);
              return;
            }
          } else {
            if (param0 == 0) {
              return;
            } else {
              a.a(false);
              return;
            }
          }
        }
    }

    final static bm a(mi param0, int param1, int param2, byte param3) {
        int var4_int = 0;
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
          var4_int = 83 % ((param3 - -25) / 50);
          if (mc.a(param2, param1, param0, (byte) 119)) {
            return ei.o(85);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("a.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(boolean param0) {
        vj discarded$0 = null;
        if (param0) {
            String var2 = (String) null;
            discarded$0 = a.a((String) null, -30);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_a = "<col=FFFFFF>Spread fire:</col> carefully tuned to send blasts into every corner of the tunnel, this weapon will hit everything. If you need precision, you'll get it at close range.";
    }
}
