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
          if (wa.a((byte) 30, param0, param2, param3)) {
            int discarded$2 = 7;
            return jb.g();
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("il.H(").append(param0).append(',').append(20178).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final static void a(int param0) {
        if (param0 <= 97) {
            return;
        }
        Object var2 = null;
        nc.a("", (String) null, -54);
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 == 0) {
            if (~sg.field_c != ~param0) {
                sg.field_c = param0;
                cn.field_l = true;
                b.a(param2, (byte) -118);
            }
        }
        if (param1 == 1) {
            if (!(~param0 == ~pm.field_Z)) {
                pm.field_Z = param0;
                cn.field_l = true;
                b.a(param2, (byte) -96);
            }
        }
        if (param1 == 2) {
            if (~param0 != ~fi.field_y) {
                fi.field_y = param0;
                cn.field_l = true;
                b.a(param2, (byte) -100);
            }
        }
    }

    public static void c() {
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

    final static void d() {
        if (!de.field_d) {
            throw new IllegalStateException();
        }
        int discarded$10 = 66;
        il.a(-7, 91, 38);
        if (!(ch.field_O == null)) {
            ch.field_O.m(106);
        }
        int discarded$11 = 35;
        String var1 = fi.e();
        jd.field_kb = new pm(var1, (String) null, true, false, false);
        ag.field_p.a((lh) (Object) ci.field_a, -114);
        ci.field_a.c((lh) (Object) jd.field_kb, -22908735);
        ci.field_a.i((byte) -14);
    }

    final static void a(boolean param0) {
        qc.field_V.a(param0, (byte) 126);
        pl var2 = ve.field_b;
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
