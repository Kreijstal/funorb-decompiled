/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends lg implements sv, ft {
    cj field_g;
    static hd field_f;
    static int field_d;
    static kg[] field_e;

    final static void a(boolean param0, hd param1) {
        hd var2 = null;
        int var3 = 0;
        hd var4 = null;
        hd var5 = null;
        var3 = Kickabout.field_G;
        var4 = (hd) (Object) param1.field_jb.g(24009);
        var2 = var4;
        L0: while (true) {
          if (var4 == null) {
            if (!param0) {
              field_e = null;
              param1.field_J = 0;
              param1.field_mb = 0;
              param1.field_L = 0;
              param1.field_v = 0;
              return;
            } else {
              param1.field_J = 0;
              param1.field_mb = 0;
              param1.field_L = 0;
              param1.field_v = 0;
              return;
            }
          } else {
            var4.field_J = 0;
            var4.field_mb = 0;
            var4.field_L = 0;
            var4.field_v = 0;
            var5 = (hd) (Object) param1.field_jb.c(33);
            var5 = var5;
            continue L0;
          }
        }
    }

    public final void a(int param0, ga param1) {
        int var3 = -20 % ((8 - param0) / 47);
    }

    final String e(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var2_int = ((hl) this).field_g.l(92);
              var3 = ((hl) this).field_g.h((byte) 48);
              var4 = ((hl) this).field_g.m(param0);
              var5 = th.b((byte) 113);
              if ((var4 ^ -1) > -1891) {
                break L1;
              } else {
                if (var4 > var5 - 3) {
                  break L1;
                } else {
                  if (!cl.a(true, var4, var2_int, var3)) {
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
            }
            stackOut_3_0 = vo.a((byte) -18, sb.field_e, new String[2]);
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        return rr.field_c;
    }

    public static void f(int param0) {
        field_f = null;
        field_e = null;
        if (param0 != -3) {
            field_f = null;
        }
    }

    public hl() {
    }

    final rv a(boolean param0) {
        NumberFormatException numberFormatException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        rv stackIn_3_0 = null;
        rv stackIn_6_0 = null;
        int stackIn_10_0 = 0;
        rv stackIn_13_0 = null;
        Throwable decompiledCaughtException = null;
        rv stackOut_2_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        rv stackOut_12_0 = null;
        rv stackOut_5_0 = null;
        try {
          L0: {
            var2_int = ((hl) this).field_g.l(94);
            var3 = ((hl) this).field_g.h((byte) 48);
            var4 = ((hl) this).field_g.m(-1);
            var5 = th.b((byte) 108);
            if ((var4 ^ -1) > -1891) {
              stackOut_2_0 = jt.field_Bb;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (var5 + -3 >= var4) {
                L1: {
                  if (param0) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                if (cl.a(stackIn_10_0 == 0, var4, var2_int, var3)) {
                  stackOut_12_0 = jt.field_Bb;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  L2: {
                    if (!param0) {
                      break L2;
                    } else {
                      ((hl) this).field_g = null;
                      break L2;
                    }
                  }
                  break L0;
                }
              } else {
                stackOut_5_0 = jt.field_Bb;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          numberFormatException = (NumberFormatException) (Object) decompiledCaughtException;
          return jt.field_Bb;
        }
        return he.field_yb;
    }

    public final boolean a(byte param0) {
        if (param0 != -28) {
            boolean discarded$0 = ((hl) this).a((byte) 110);
            return ((hl) this).field_g.b(true);
        }
        return ((hl) this).field_g.b(true);
    }

    public final void a(byte param0, ga param1) {
        ((hl) this).a(113);
        if (param0 <= 65) {
            field_d = 37;
        }
    }

    static {
    }
}
