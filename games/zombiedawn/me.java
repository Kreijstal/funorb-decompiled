/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends wo {
    static String[][][] field_Fb;
    static int field_Gb;
    static int field_Db;
    private int field_Eb;
    static String field_Hb;
    static int field_Bb;
    static String field_Cb;

    me(int param0, int param1, int param2) {
        super(param0, param1, param2);
        ((me) this).field_Eb = -72 + (so.c(144) + param0);
    }

    public static void x() {
        field_Fb = null;
        field_Cb = null;
        field_Hb = null;
    }

    final int j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        ((me) this).n(103);
        var2 = -1 + ((me) this).field_ub;
        var3 = this.f(var2, 0);
        if (param0 <= -42) {
          var4 = 1;
          L0: while (true) {
            if (((me) this).field_ub - 1 <= var4) {
              L1: {
                if (-1 + ((me) this).field_ub != var2) {
                  break L1;
                } else {
                  var2 = -1;
                  break L1;
                }
              }
              return var2;
            } else {
              var5 = this.f(var4, 0);
              if (var3 < var5) {
                var2 = var4;
                var3 = var5;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 122;
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        L0: {
          if (((me) this).f(237239984) < 0) {
            break L0;
          } else {
            if (((me) this).f(237239984) <= dj.field_e.field_H.field_p) {
              var2 = -66 % ((param0 - 66) / 50);
              super.d((byte) 118);
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final void g(int param0) {
        super.g(99);
        if (((me) this).f(237239984) - 48 > dj.field_e.field_H.field_p) {
            ((me) this).b(-27598);
            ((me) this).d(0);
            if (param0 > 95) {
                return;
            }
            ((me) this).field_Eb = 110;
            return;
        }
        if (param0 <= 95) {
            ((me) this).field_Eb = 110;
            return;
        }
    }

    final void l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ((me) this).field_F = 0;
        super.l(param0);
        var2 = ((me) this).field_Eb;
        var3 = 672;
        if (var3 - 24 <= ((me) this).f(237239984)) {
          ((me) this).field_Y = ((me) this).a(true);
          ((me) this).field_X = 48 + ((me) this).f(param0 + 237239932);
          ((me) this).c(0, ((me) this).field_D);
          ((me) this).e(1, param0 + -6956);
          ((me) this).g(param0 + 45);
          return;
        } else {
          if (((me) this).f(237239984) >= 96) {
            if (((me) this).field_F != 0) {
              return;
            } else {
              ((me) this).a(var2, (byte) 115, var3);
              return;
            }
          } else {
            ((me) this).field_Y = ((me) this).a(true);
            ((me) this).field_X = 48 + ((me) this).f(param0 + 237239932);
            ((me) this).c(0, ((me) this).field_D);
            ((me) this).e(1, param0 + -6956);
            ((me) this).g(param0 + 45);
            return;
          }
        }
    }

    final static java.awt.Frame a(byte param0, int param1, int param2, ec param3, int param4, int param5) {
        RuntimeException var6 = null;
        re[] var6_array = null;
        int var7 = 0;
        int var8_int = 0;
        java.awt.Frame var8 = null;
        int var9 = 0;
        re[] var10 = null;
        op var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_31_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var9 = ZombieDawn.field_J;
        try {
          L0: {
            if (param3.c(10)) {
              L1: {
                if (param4 == 0) {
                  var10 = ud.a(0, param3);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7 = 0;
                    var8_int = 0;
                    L2: while (true) {
                      if (var10.length <= var8_int) {
                        if (var7 != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        L3: {
                          if (var10[var8_int].field_a != param1) {
                            break L3;
                          } else {
                            if (var10[var8_int].field_d == param5) {
                              if (var10[var8_int].field_f != 0) {
                                break L3;
                              } else {
                                L4: {
                                  if (var7 == 0) {
                                    break L4;
                                  } else {
                                    if (param4 >= var10[var8_int].field_b) {
                                      break L3;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                var7 = 1;
                                param4 = var10[var8_int].field_b;
                                break L3;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var8_int++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    return (java.awt.Frame) (Object) stackIn_8_0;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param3.a(param4, 1525233840, param5, 0, param1);
              var7 = 0;
              L5: while (true) {
                if (0 != var11.field_f) {
                  var8 = (java.awt.Frame) var11.field_d;
                  if (var8 != null) {
                    if (2 == var11.field_f) {
                      jb.a(-41, var8, param3);
                      stackOut_31_0 = null;
                      stackIn_32_0 = stackOut_31_0;
                      break L0;
                    } else {
                      return var8;
                    }
                  } else {
                    return null;
                  }
                } else {
                  ld.a(10L, (byte) 118);
                  continue L5;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (java.awt.Frame) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var6;
            stackOut_33_1 = new StringBuilder().append("me.G(").append(114).append(',').append(param1).append(',').append(0).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param3 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L6;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L6;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param4 + ',' + param5 + ')');
        }
        return (java.awt.Frame) (Object) stackIn_32_0;
    }

    private final int f(int param0, int param1) {
        if (qd.field_f[param0] < 0) {
            return 0;
        }
        if (h.field_e[param0] == -1) {
            return 0;
        }
        return qd.field_f[param0] * h.field_e[param0];
    }

    final void a(wk param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            var3_int = param0.a(((me) this).a(true), (byte) -99);
            var4 = param0.a(((me) this).f(237239984), param1 ^ param1);
            bi.d(var3_int, var4, ((me) this).field_pb, 65535);
            bi.e(var3_int, var4, param0.a(((me) this).field_Y, (byte) -71), param0.a(((me) this).field_X, 0), 16711935);
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((me) this).field_ub) {
                break L0;
              } else {
                var6 = param0.a(((me) this).field_jb[var5], (byte) -114);
                var7 = param0.a(((me) this).field_gb[var5], 0);
                bi.b(var6 - 1, var7 - 1, 3, 3, 0);
                bi.a(var6, var7, 65280);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("me.L(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = new String[][][]{new String[6][], new String[6][], new String[6][], new String[0][], new String[6][], new String[5][], new String[6][], new String[6][]};
        field_Hb = "Achievements this game:";
        field_Bb = 480;
        field_Gb = 50;
        field_Cb = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
