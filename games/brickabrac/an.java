/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an extends pj implements hf, ph {
    ug field_l;
    static String[] field_j;
    static String field_g;
    static th field_i;
    static int field_h;
    static long field_k;

    public static void c(byte param0) {
        field_j = null;
        field_i = null;
        field_g = null;
        if (param0 >= -22) {
            an.c((byte) 116);
        }
    }

    final qh c(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qh stackIn_2_0 = null;
        qh stackIn_6_0 = null;
        qh stackIn_9_0 = null;
        qh stackIn_13_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var2_int = this.field_l.a((byte) -89);
            if (param0 == 4) {
              var3 = this.field_l.i((byte) -117);
              var4 = this.field_l.i(5390);
              var5 = un.a(1);
              if (1890 > var4) {
                stackIn_6_0 = lp.field_xb;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var4 <= -3 + var5) {
                  if (!p.a((byte) -49, var2_int, var4, var3)) {
                    stackIn_13_0 = lp.field_xb;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = lp.field_xb;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = (qh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return lp.field_xb;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return ae.field_c;
              } else {
                return stackIn_13_0;
              }
            }
          }
        }
    }

    public final void a(vb param0, int param1) {
        try {
            if (param1 != -40) {
                field_i = (th) null;
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "an.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(vb param0, byte param1) {
        try {
            this.a(false);
            if (param1 > -39) {
                this.c(113);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "an.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String b(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var2_int = this.field_l.a((byte) -93);
            var3 = this.field_l.i((byte) -117);
            var4 = this.field_l.i(5390);
            if (param0 == 28600) {
              L1: {
                var5 = un.a(1);
                if ((var4 ^ -1) > -1891) {
                  break L1;
                } else {
                  if (var5 + -3 >= var4) {
                    if (!p.a((byte) -49, var2_int, var4, var3)) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      stackIn_10_0 = null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_7_0 = rd.a(ig.field_J, new String[]{"1890", Integer.toString(-3 + var5)}, (byte) 103);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 2;
            break L2;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return hj.field_Rb;
            } else {
              return (String) ((Object) stackIn_10_0);
            }
          }
        }
    }

    final static void d(byte param0) {
        int var1_int = 0;
        int var2 = BrickABrac.field_J ? 1 : 0;
        try {
            for (var1_int = 0; var1_int < mm.field_Sb; var1_int++) {
                jk.field_s[var1_int] = null;
            }
            if (param0 != -56) {
                field_i = (th) null;
            }
            mm.field_Sb = 0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "an.R(" + param0 + ')');
        }
    }

    public final boolean a(byte param0) {
        if (param0 > -27) {
            field_k = 93L;
        }
        return this.field_l.h((byte) -124);
    }

    public an() {
    }

    static {
        field_g = "Show chat (1 unread message)";
        field_i = new th(4, 1, 1, 1);
    }
}
