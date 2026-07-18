/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static le field_e;
    private int field_b;
    static String field_a;
    private boolean field_f;
    private int field_d;
    private int[] field_c;

    final static String a(int param0) {
        if (!(vh.field_n >= 2)) {
            return nc.field_Z;
        }
        if (!(null == lf.field_a)) {
            if (!(lf.field_a.b(-1))) {
                return de.field_b;
            }
            return mi.field_e;
        }
        if (!(og.field_g.b(-1))) {
            return jj.field_B;
        }
        if (!og.field_g.b((byte) 91, "commonui")) {
            return kj.field_z + " - " + og.field_g.a((byte) -41, "commonui") + "%";
        }
        if (!(am.field_b.b(-1))) {
            return bk.field_a;
        }
        if (!am.field_b.b((byte) -103, "commonui")) {
            return hi.field_e + " - " + am.field_b.a((byte) -97, "commonui") + "%";
        }
        int var1 = 87 % ((param0 - -3) / 57);
        if (!wb.field_b.b(-1)) {
            return ge.field_i;
        }
        if (!(wb.field_b.c(7715))) {
            return fa.field_c + " - " + wb.field_b.a(20147) + "%";
        }
        return ql.field_f;
    }

    final int b(int param0) {
        if (param0 != 1) {
            field_e = null;
        }
        return ((tj) this).field_b + 1;
    }

    private final void a(int param0, int param1, int param2) {
        if (!(param0 <= ((tj) this).field_b)) {
            ((tj) this).field_b = param0;
        }
        if (!(((tj) this).field_c.length > param0)) {
            this.a(param0, true);
        }
        ((tj) this).field_c[param0] = param1;
        if (param2 != -11784) {
            ((tj) this).field_f = true;
        }
    }

    private final int c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        var3 = ((tj) this).field_c.length;
        L0: while (true) {
          if (var3 > param0) {
            return var3;
          } else {
            if (((tj) this).field_f) {
              if (0 == var3) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * ((tj) this).field_d;
                continue L0;
              }
            } else {
              var3 = var3 + ((tj) this).field_d;
              continue L0;
            }
          }
        }
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
            ((tj) this).field_b = -70;
        }
        if (((tj) this).field_b < param1) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        return ((tj) this).field_c[param1];
    }

    final static String a(int param0, boolean param1, boolean param2) {
        int var4 = 0;
        if (param2) {
            var4 += 4;
        }
        if (param1) {
            var4 += 2;
        }
        return ee.field_d[var4];
    }

    final static void a(be param0, java.awt.Frame param1) {
        eb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param0.a((byte) -120, param1);
              L2: while (true) {
                if (var3.field_a != 0) {
                  if (var3.field_a != 1) {
                    hb.a(100L, 101);
                    continue L1;
                  } else {
                    param1.setVisible(false);
                    param1.dispose();
                    break L0;
                  }
                } else {
                  hb.a(10L, 109);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("tj.F(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + -23144 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        int[] var4 = new int[this.c(param0, -1)];
        int[] var3 = var4;
        mk.a(((tj) this).field_c, 0, var4, 0, ((tj) this).field_c.length);
        ((tj) this).field_c = var4;
    }

    public static void a() {
        field_e = null;
        field_a = null;
    }

    final static String a(int param0, int param1, int param2, byte[] param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var13 = new char[param0];
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var4 = var10;
            var5 = 0;
            var6 = param2;
            L1: while (true) {
              if (var6 >= param0) {
                stackOut_13_0 = new String(var13, 0, var5);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                L2: {
                  var7 = 255 & param3[var6 + param1];
                  if (var7 != 0) {
                    L3: {
                      if (128 > var7) {
                        break L3;
                      } else {
                        if (var7 >= 160) {
                          break L3;
                        } else {
                          L4: {
                            var8 = fe.field_a[var7 - 128];
                            if (var8 == 0) {
                              var8 = 63;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var7 = var8;
                          break L3;
                        }
                      }
                    }
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = (char)var7;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4_ref;
            stackOut_15_1 = new StringBuilder().append("tj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (vl.a(false, param2, -125)) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= param2.length()) {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  int discarded$15 = -22118;
                  if (!vg.a(param2.charAt(var3_int))) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("tj.A(").append(false).append(',').append(0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final void b(int param0, int param1) {
        this.a(((tj) this).field_b + param0, param1, param0 ^ -11783);
    }

    final static hj c() {
        int var4_int = 0;
        int var5 = OrbDefence.field_D ? 1 : 0;
        int var1 = wh.field_b[0] * m.field_a[0];
        byte[] var2 = fl.field_a[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = vc.field_g[vi.a(255, (int) var2[var4_int])];
        }
        hj var4 = new hj(sg.field_B, he.field_r, jd.field_g[0], wc.field_a[0], wh.field_b[0], m.field_a[0], var3);
        md.a((byte) -125);
        return var4;
    }

    private tj() throws Throwable {
        throw new Error();
    }

    final void a(int param0, int param1) {
        L0: {
          if (param0 < 0) {
            break L0;
          } else {
            if (((tj) this).field_b < param0) {
              break L0;
            } else {
              L1: {
                if (param1 == -3344) {
                  break L1;
                } else {
                  String discarded$2 = tj.a(-117);
                  break L1;
                }
              }
              L2: {
                if (param0 == ((tj) this).field_b) {
                  break L2;
                } else {
                  mk.a(((tj) this).field_c, 1 + param0, ((tj) this).field_c, param0, ((tj) this).field_b + -param0);
                  break L2;
                }
              }
              ((tj) this).field_b = ((tj) this).field_b - 1;
              return;
            }
          }
        }
        throw new ArrayIndexOutOfBoundsException(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
        field_e = new le();
    }
}
