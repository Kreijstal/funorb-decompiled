/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_e;
    volatile boolean field_a;
    static int[] field_b;
    static vn[] field_c;
    static uh field_d;

    public static void c(int param0) {
        if (param0 < 39) {
            dj var2 = (dj) null;
            la.a((dj) null, 13, (dj) null, (byte) 28, -8);
            field_c = null;
            field_b = null;
            field_d = null;
            return;
        }
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final static void a(int param0) {
        u[] var1 = null;
        int var2 = 0;
        u var3 = null;
        int var4 = 0;
        u[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var5 = ij.field_L;
              var1 = var5;
              if (param0 >= 17) {
                break L1;
              } else {
                la.a((byte) 114);
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= var5.length) {
                break L0;
              } else {
                var3 = var5[var2];
                var3.c(-23);
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "la.G(" + param0 + ')');
        }
    }

    final void a(ec param0, byte param1) {
        RuntimeException runtimeException = null;
        java.awt.Graphics var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              jb.a(113, this.field_e, param0);
              if (param1 > 112) {
                break L1;
              } else {
                var4 = (java.awt.Graphics) null;
                this.paint((java.awt.Graphics) null);
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

            stackIn_5_1 = new StringBuilder().append("la.B(");

            if (param0 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static int b(int param0) {
        if (param0 != 0) {
            field_d = (uh) null;
            return ae.field_a;
        }
        return ae.field_a;
    }

    public final void update(java.awt.Graphics param0) {
    }

    la() {
    }

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 >= 57) {
                break L0;
              } else {
                field_b = (int[]) null;
                break L0;
              }
            }
            if (null != ce.field_t) {
              try {
                L1: {
                  ce.field_t.a(0, 0L);
                  ce.field_t.a(122, fj.field_g.field_h, fj.field_g.field_j, 24);
                  break L1;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
                fj.field_g.field_j = fj.field_g.field_j + 24;
                return;
              }
              fj.field_g.field_j = fj.field_g.field_j + 24;
              return;
            } else {
              fj.field_g.field_j = fj.field_g.field_j + 24;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_a = true;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "la.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static oi a(dj param0, int param1, dj param2, byte param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        oi stackIn_5_0 = null;
        oi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ph.a(param4, 31043, param1, param2)) {
              if (param3 <= -96) {
                stackIn_7_0 = kk.a(-16491, param0.a((byte) 51, param4, param1));
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (oi) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("la.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (oi) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static vk a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        vk var5 = null;
        vk stackIn_4_0 = null;
        vk stackIn_8_0 = null;
        vk stackIn_11_0 = null;
        vk stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (-1 != (param0.length() ^ -1)) {
                  var2_int = param0.indexOf('@');
                  if (var2_int == -1) {
                    stackIn_8_0 = bg.field_l;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(var2_int - -1);
                    var5 = be.a(var3, (byte) -65);
                    if (var5 == null) {
                      L2: {
                        if (param1 <= -57) {
                          break L2;
                        } else {
                          field_d = (uh) null;
                          break L2;
                        }
                      }
                      stackIn_15_0 = of.a(var4, 8947848);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_11_0 = (vk) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = qd.field_b;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("la.A(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static {
    }
}
