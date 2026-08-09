/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends de implements ih, wr {
    static byte[][][] field_j;
    af field_h;
    static int field_k;
    static boolean field_m;
    static fj field_l;
    static String[] field_n;
    static String field_i;

    final ba a(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ba stackIn_2_0 = null;
        ba stackIn_6_0 = null;
        ba stackIn_10_0 = null;
        ba stackIn_13_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var2_int = this.field_h.a(-32410);
            var3 = this.field_h.i(0);
            if (param0 >= 24) {
              var4 = this.field_h.c(false);
              var5 = hd.b(false);
              if (var4 < 1890) {
                stackIn_6_0 = ir.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var5 + -3 < var4) {
                  stackIn_10_0 = ir.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (vg.a(-4151, var3, var2_int, var4)) {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    stackIn_13_0 = ir.field_a;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_2_0 = (ba) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return ir.field_a;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return qm.field_G;
              } else {
                return stackIn_13_0;
              }
            }
          }
        }
    }

    public static void g(int param0) {
        field_l = null;
        if (param0 != -3) {
          df.g(-60);
          field_n = null;
          field_j = (byte[][][]) null;
          field_i = null;
          return;
        } else {
          field_n = null;
          field_j = (byte[][][]) null;
          field_i = null;
          return;
        }
    }

    public df() {
    }

    public final void a(int param0, kp param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 >= -10) {
                field_m = false;
                this.b(18340);
                break L1;
              } else {
                this.b(18340);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("df.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    public final boolean c(int param0) {
        if (param0 != -12211) {
            this.c(1);
            return this.field_h.e(false);
        }
        return this.field_h.e(false);
    }

    final String f(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 < -68) {
          try {
            L0: {
              L1: {
                var2_int = this.field_h.a(-32410);
                var3 = this.field_h.i(0);
                var4 = this.field_h.c(false);
                var5 = hd.b(false);
                if (1890 > var4) {
                  break L1;
                } else {
                  if (var4 <= -3 + var5) {
                    if (!vg.a(-4151, var3, var2_int, var4)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_9_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_6_0 = Vertigo2.a(new String[]{"1890", Integer.toString(-3 + var5)}, ea.field_f, 7);
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
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 1) {
              return lb.field_a;
            } else {
              return (String) ((Object) stackIn_9_0);
            }
          }
        } else {
          return (String) null;
        }
    }

    public final void a(byte param0, kp param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 16) {
                break L1;
              } else {
                field_j = (byte[][][]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("df.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        field_n = new String[]{"By rating", "By win percentage"};
        field_i = "Type your email address again to make sure it's correct";
    }
}
