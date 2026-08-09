/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends lg implements sv, ft {
    cj field_g;
    static hd field_f;
    static int field_d;
    static kg[] field_e;

    final static void a(boolean param0, hd param1) {
        hd var4 = null;
        hd var5 = null;
        int var3 = Kickabout.field_G;
        try {
            var4 = (hd) ((Object) param1.field_jb.g(24009));
            hd var2 = var4;
            while (var4 != null) {
                var4.field_J = 0;
                var4.field_mb = 0;
                var4.field_L = 0;
                var4.field_v = 0;
                var5 = (hd) ((Object) param1.field_jb.c(33));
                var5 = var5;
            }
            if (!param0) {
                field_e = (kg[]) null;
            }
            param1.field_J = 0;
            param1.field_mb = 0;
            param1.field_L = 0;
            param1.field_v = 0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "hl.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, ga param1) {
        try {
            int var3_int = -20 % ((8 - param0) / 47);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "hl.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String e(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = this.field_g.l(92);
              var3 = this.field_g.h((byte) 48);
              var4 = this.field_g.m(param0);
              var5 = th.b((byte) 113);
              if ((var4 ^ -1) > -1891) {
                break L1;
              } else {
                if (var4 > var5 - 3) {
                  break L1;
                } else {
                  if (!cl.a(true, var4, var2_int, var3)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
            }
            stackIn_4_0 = vo.a((byte) -18, sb.field_e, new String[]{"1890", Integer.toString(var5 + -3)});
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 1;
            break L2;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return rr.field_c;
        }
    }

    public static void f(int param0) {
        field_f = null;
        field_e = null;
        if (param0 != -3) {
            field_f = (hd) null;
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
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var2_int = this.field_g.l(94);
            var3 = this.field_g.h((byte) 48);
            var4 = this.field_g.m(-1);
            var5 = th.b((byte) 108);
            if ((var4 ^ -1) > -1891) {
              stackIn_3_0 = jt.field_Bb;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var5 + -3 >= var4) {
                L1: {
                  if (param0) {
                    stackIn_10_0 = 0;
                    break L1;
                  } else {
                    stackIn_10_0 = 1;
                    break L1;
                  }
                }
                if (!cl.a(stackIn_10_0 != 0, var4, var2_int, var3)) {
                  stackIn_13_0 = jt.field_Bb;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    if (!param0) {
                      break L2;
                    } else {
                      this.field_g = (cj) null;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_6_0 = jt.field_Bb;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          numberFormatException = (NumberFormatException) (Object) decompiledCaughtException;
          return jt.field_Bb;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return he.field_yb;
            }
          }
        }
    }

    public final boolean a(byte param0) {
        if (param0 != -28) {
            this.a((byte) 110);
            return this.field_g.b(true);
        }
        return this.field_g.b(true);
    }

    public final void a(byte param0, ga param1) {
        try {
            this.a(113);
            if (param0 <= 65) {
                field_d = 37;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "hl.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
