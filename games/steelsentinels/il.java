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
        if (!wa.a((byte) 30, param0, param2, param3)) {
            return null;
        }
        if (param1 != 20178) {
            field_d = null;
        }
        return jb.g(param1 ^ 20181);
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
          if (-2 != (param1 ^ -1)) {
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
        if (param0 >= -14) {
            il.a(false, (byte) 111);
        }
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
        if (param0 != 0) {
            il.a(-7, 91, 38, 66);
        }
        if (!(ch.field_O == null)) {
            ch.field_O.m(106);
        }
        String var1 = fi.e(35);
        jd.field_kb = new pm(var1, (String) null, true, false, false);
        ag.field_p.a((lh) (Object) ci.field_a, -114);
        ci.field_a.c((lh) (Object) jd.field_kb, param0 + -22908735);
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
        int var4 = SteelSentinels.field_G;
        if (null != ((il) this).field_f) {
            // ifeq L24
        } else {
            return 0;
        }
        for (var3 = 1; var3 < ((il) this).field_f.length; var3++) {
            if (!(param1 >= ((il) this).field_f[var3 + -1] + ((il) this).field_f[var3] >> -1125118719)) {
                return var3 - 1;
            }
        }
        if (param0 <= 58) {
            field_e = null;
        }
        return -1 + ((il) this).field_f.length;
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
