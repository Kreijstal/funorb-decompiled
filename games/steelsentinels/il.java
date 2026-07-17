/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int[][] field_c;
    int field_h;
    static String field_e;
    int field_a;
    static String field_b;
    int[] field_f;
    static String field_g;
    static String field_d;

    final static wk[] a(int param0, int param1, int param2, cm param3) {
        RuntimeException var4 = null;
        wk[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        wk[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (wa.a((byte) 30, param0, param2, param3)) {
              L1: {
                if (param1 == 20178) {
                  break L1;
                } else {
                  field_d = null;
                  break L1;
                }
              }
              stackOut_5_0 = jb.g(param1 ^ 20181);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("il.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final static void a(int param0) {
        if (param0 <= 97) {
            return;
        }
        Object var2 = null;
        nc.a("", (String) null, -54);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (param1 != 0) {
            break L0;
          } else {
            if (sg.field_c == param0) {
              break L0;
            } else {
              sg.field_c = param0;
              cn.field_l = true;
              b.a(param2, (byte) -118);
              break L0;
            }
          }
        }
        L1: {
          if (param3 == -18853) {
            break L1;
          } else {
            field_b = null;
            break L1;
          }
        }
        L2: {
          if (param1 != 1) {
            if (param1 != 2) {
              break L2;
            } else {
              if (param0 == fi.field_y) {
                break L2;
              } else {
                fi.field_y = param0;
                cn.field_l = true;
                b.a(param2, (byte) -100);
                break L2;
              }
            }
          } else {
            if (param1 != 2) {
              break L2;
            } else {
              if (param0 == fi.field_y) {
                break L2;
              } else {
                fi.field_y = param0;
                cn.field_l = true;
                b.a(param2, (byte) -100);
                break L2;
              }
            }
          }
        }
    }

    public static void c(int param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        field_g = null;
        field_b = null;
    }

    il(int param0, int param1, int param2) {
        ((il) this).field_h = param0;
        ((il) this).field_a = param1;
        ((il) this).field_f = new int[1 + param2];
    }

    final static void d(int param0) {
        if (!de.field_d) {
            throw new IllegalStateException();
        }
        il.a(-7, 91, 38, 66);
        if (!(ch.field_O == null)) {
            ch.field_O.m(106);
        }
        String var1 = fi.e(35);
        jd.field_kb = new pm(var1, (String) null, true, false, false);
        ag.field_p.a((lh) (Object) ci.field_a, -114);
        ci.field_a.c((lh) (Object) jd.field_kb, -22908735);
        ci.field_a.i((byte) -14);
    }

    final static void a(boolean param0, byte param1) {
        qc.field_V.a(param0, (byte) 126);
        pl var2 = ve.field_b;
        if (param1 > -108) {
            return;
        }
        if (!(var2 == null)) {
            var2.a(qc.field_V.field_Rb, qc.field_V.field_cb, (byte) -128);
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = SteelSentinels.field_G;
          if (null == ((il) this).field_f) {
            break L0;
          } else {
            if (((il) this).field_f.length == 0) {
              break L0;
            } else {
              var3 = 1;
              L1: while (true) {
                if (var3 >= ((il) this).field_f.length) {
                  L2: {
                    if (param0 > 58) {
                      break L2;
                    } else {
                      field_e = null;
                      break L2;
                    }
                  }
                  return -1 + ((il) this).field_f.length;
                } else {
                  if (param1 < ((il) this).field_f[var3 + -1] + ((il) this).field_f[var3] >> 1) {
                    return var3 - 1;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            il.a(-87);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((il) this).field_f == null) {
              break L2;
            } else {
              if (((il) this).field_f.length != 0) {
                stackOut_6_0 = ((il) this).field_f[-1 + ((il) this).field_f.length];
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "You appear to be telling someone your password - please don't!";
        field_b = "Please select an option in the '<%0>' row.";
        field_g = "Time: <col=ffffff><%0></col>";
        field_d = "foe";
    }
}
