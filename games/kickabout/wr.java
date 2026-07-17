/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wr extends mo {
    static ff field_h;
    static int field_j;
    int[] field_k;
    boolean[] field_i;
    static int field_f;
    static String field_g;
    static int field_l;

    final void a(int param0, int param1, int param2) {
        if (!((wr) this).field_i[param0]) {
          L0: {
            if (param2 != 0) {
              if (param2 != 1) {
                break L0;
              } else {
                if (-1 + ws.field_b.length <= ((wr) this).field_k[param0]) {
                  break L0;
                } else {
                  ((wr) this).field_k[param0] = ((wr) this).field_k[param0] + 1;
                  break L0;
                }
              }
            } else {
              if (param2 != 1) {
                break L0;
              } else {
                if (-1 + ws.field_b.length <= ((wr) this).field_k[param0]) {
                  break L0;
                } else {
                  ((wr) this).field_k[param0] = ((wr) this).field_k[param0] + 1;
                  break L0;
                }
              }
            }
          }
          if (param1 == 1) {
            L1: {
              if (param2 == 2) {
                ((wr) this).field_i[param0] = true;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
            return;
        }
        field_g = null;
    }

    final static int a(int param0, ml param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var6_int = param1.l(1, 59);
            if (var6_int != 0) {
              if (var6_int == 1) {
                stackOut_7_0 = param2 + param1.l(param0, 59);
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                throw new IllegalStateException();
              }
            } else {
              L1: {
                if (param3 > 0) {
                  stackOut_3_0 = param1.l(param3, 59);
                  stackIn_4_0 = stackOut_3_0;
                  break L1;
                } else {
                  stackOut_2_0 = 0;
                  stackIn_4_0 = stackOut_2_0;
                  break L1;
                }
              }
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("wr.E(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + 1 + 41);
        }
        return stackIn_8_0;
    }

    final void c(ml param0, int param1) {
        try {
            ((wr) this).field_k[0] = param0.l(3, 59);
            if (param1 != 2) {
                Object var4 = null;
                wr.a((java.awt.Canvas) null, 103);
            }
            ((wr) this).field_k[1] = param0.l(3, 59);
            ((wr) this).field_i[0] = mu.a(param0, (byte) -39);
            ((wr) this).field_i[1] = mu.a(param0, (byte) -39);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "wr.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static String[] a(String param0, int param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        String[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var9 = (CharSequence) (Object) param0;
              var3_int = wn.a(param2, param1 + -2, var9);
              if (param1 == 2) {
                break L1;
              } else {
                field_f = 25;
                break L1;
              }
            }
            var4 = new String[1 + var3_int];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var3_int) {
                var4[var3_int] = param0.substring(var6);
                stackOut_8_0 = (String[]) var4;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param2 == param0.charAt(var8)) {
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = param0.substring(var6, var8);
                    var6 = 1 + var8;
                    var7++;
                    continue L2;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("wr.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_9_0;
    }

    final boolean a(byte param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 76 / ((param0 - 57) / 37);
            if (!((wr) this).field_i[0]) {
              break L1;
            } else {
              if (!((wr) this).field_i[1]) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    public final String toString() {
        return "AgentFormation\tteam0=" + ((wr) this).field_k[0] + "/" + ((wr) this).field_i[0] + "\tteam1=" + ((wr) this).field_k[1] + "/" + ((wr) this).field_i[1];
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (vj.field_c == 11) {
                dn.a(-127);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ik.a(hw.field_j, ts.field_b, m.field_h, (byte) 84);
              su.a(param1 ^ -23390, 0, 0, param0);
              if (param1 == -14142) {
                break L2;
              } else {
                var3 = null;
                String[] discarded$2 = wr.a((String) null, -39, 'ￜ');
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("wr.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final void a(byte param0, mo param1) {
        wr var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        wr var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var6 = (wr) (Object) param1;
            var3 = var6;
            var4 = 0;
            L1: while (true) {
              if (var4 >= 2) {
                L2: {
                  if (param0 <= -52) {
                    break L2;
                  } else {
                    wr.a(false);
                    break L2;
                  }
                }
                break L0;
              } else {
                var6.field_k[var4] = var6.field_k[var4];
                var6.field_i[var4] = var6.field_i[var4];
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("wr.R(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    public wr() {
        ((wr) this).field_k = new int[2];
        ((wr) this).field_i = new boolean[2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 1;
        field_f = 0;
        field_h = new ff(6, 0, 4, 2);
        field_l = -1;
        field_g = "in the Semi-Finals";
    }
}
