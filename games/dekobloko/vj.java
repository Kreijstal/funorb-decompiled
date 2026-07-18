/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static String[] field_e;
    static ji field_a;
    static int[] field_d;
    bh field_c;
    private bh field_b;

    final boolean b(int param0) {
        if (param0 >= -1) {
            field_d = null;
        }
        return ((vj) this).field_c.field_b == ((vj) this).field_c ? true : false;
    }

    final void c(int param0) {
        bh var2 = null;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = client.field_A ? 1 : 0;
          if (param0 >= 104) {
            break L0;
          } else {
            var4 = null;
            ((vj) this).a((bh) null, 114);
            break L0;
          }
        }
        L1: while (true) {
          var2 = ((vj) this).field_c.field_b;
          if (((vj) this).field_c != var2) {
            var2.b((byte) 120);
            continue L1;
          } else {
            ((vj) this).field_b = null;
            return;
          }
        }
    }

    final bh d(int param0) {
        if (param0 >= -23) {
            return null;
        }
        bh var2 = ((vj) this).field_c.field_a;
        if (((vj) this).field_c == var2) {
            return null;
        }
        var2.b((byte) 115);
        return var2;
    }

    final void a(int param0, bh param1, vj param2) {
        bh var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var4 = ((vj) this).field_c.field_a;
              ((vj) this).field_c.field_a = param1.field_a;
              param1.field_a.field_b = ((vj) this).field_c;
              if (param0 <= -95) {
                break L1;
              } else {
                ((vj) this).field_b = null;
                break L1;
              }
            }
            L2: {
              if (param1 == ((vj) this).field_c) {
                break L2;
              } else {
                param1.field_a = param2.field_c.field_a;
                param1.field_a.field_b = param1;
                var4.field_b = param2.field_c;
                param2.field_c.field_a = var4;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("vj.M(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          L4: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final bh a(int param0, bh param1) {
        bh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        bh stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        bh stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 1) {
                break L1;
              } else {
                boolean discarded$2 = ((vj) this).b(-55);
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                var3 = param1;
                break L2;
              } else {
                var3 = ((vj) this).field_c.field_b;
                break L2;
              }
            }
            if (((vj) this).field_c != var3) {
              ((vj) this).field_b = var3.field_b;
              stackOut_8_0 = (bh) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((vj) this).field_b = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (bh) (Object) stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("vj.I(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0;
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        Object var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = client.field_A ? 1 : 0;
        try {
          L0: {
            cm.field_f.b(-30693);
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 32) {
                var1_int = 0;
                L2: while (true) {
                  if (var1_int >= 32) {
                    L3: {
                      vm.field_r = 0;
                      if (param0) {
                        break L3;
                      } else {
                        var3 = null;
                        ck[] discarded$2 = vj.a((ck) null, -91);
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    jd.field_Ub[var1_int] = 0L;
                    var1_int++;
                    continue L2;
                  }
                }
              } else {
                sf.field_y[var1_int] = 0L;
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "vj.H(" + param0 + ')');
        }
    }

    final bh c(boolean param0) {
        if (!param0) {
            field_d = null;
        }
        bh var2 = ((vj) this).field_b;
        if (!(var2 != ((vj) this).field_c)) {
            ((vj) this).field_b = null;
            return null;
        }
        ((vj) this).field_b = var2.field_a;
        return var2;
    }

    public static void b() {
        field_e = null;
        field_a = null;
        field_d = null;
    }

    final static ck[] a(ck param0, int param1) {
        ck[] var2 = null;
        RuntimeException var2_ref = null;
        ck[] var3 = null;
        ck[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 32169) {
                break L1;
              } else {
                qm[] discarded$2 = vj.e(-16);
                break L1;
              }
            }
            var3 = new ck[9];
            var2 = var3;
            var3[4] = param0;
            stackOut_2_0 = (ck[]) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("vj.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final bh c(byte param0) {
        int var2 = -55 / ((param0 - -17) / 35);
        bh var3 = ((vj) this).field_c.field_b;
        if (!(var3 != ((vj) this).field_c)) {
            ((vj) this).field_b = null;
            return null;
        }
        ((vj) this).field_b = var3.field_b;
        return var3;
    }

    final void a(bh param0, int param1) {
        if (!(param0.field_a == null)) {
            param0.b((byte) 124);
        }
        param0.field_b = ((vj) this).field_c;
        param0.field_a = ((vj) this).field_c.field_a;
        if (param1 != 2777) {
            return;
        }
        try {
            param0.field_a.field_b = param0;
            param0.field_b.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "vj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final bh d(boolean param0) {
        if (!param0) {
            return null;
        }
        bh var2 = ((vj) this).field_b;
        if (!(var2 != ((vj) this).field_c)) {
            ((vj) this).field_b = null;
            return null;
        }
        ((vj) this).field_b = var2.field_b;
        return var2;
    }

    final bh b(boolean param0) {
        if (!param0) {
            return null;
        }
        bh var2 = ((vj) this).field_c.field_a;
        if (((vj) this).field_c == var2) {
            ((vj) this).field_b = null;
            return null;
        }
        ((vj) this).field_b = var2.field_a;
        return var2;
    }

    final void b(bh param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0.field_a != null) {
                param0.b((byte) 115);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param0.field_b = ((vj) this).field_c.field_b;
              param0.field_a = ((vj) this).field_c;
              param0.field_a.field_b = param0;
              param0.field_b.field_a = param0;
              if (param1 == 7143) {
                break L2;
              } else {
                bh discarded$2 = ((vj) this).d(false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("vj.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final bh a(int param0) {
        bh var2 = ((vj) this).field_c.field_b;
        if (((vj) this).field_c == var2) {
            return null;
        }
        var2.b((byte) 108);
        if (param0 != 4) {
            return null;
        }
        return var2;
    }

    final int a(byte param0) {
        int var5 = client.field_A ? 1 : 0;
        int var2 = 0;
        int var3 = 60 % ((param0 - 13) / 50);
        bh var4 = ((vj) this).field_c.field_b;
        while (((vj) this).field_c != var4) {
            var2++;
            var4 = var4.field_b;
        }
        return var2;
    }

    public vj() {
        ((vj) this).field_c = new bh();
        ((vj) this).field_c.field_a = ((vj) this).field_c;
        ((vj) this).field_c.field_b = ((vj) this).field_c;
    }

    final static qm[] e(int param0) {
        if (param0 != -23521) {
            vj.a(false);
        }
        return new qm[]{nh.field_i, ta.field_a, ie.field_d, gf.field_e, ul.field_e, oi.field_d, nk.field_f, vk.field_d, rg.field_g, wg.field_a, de.field_U, qm.field_g, rf.field_k, gh.field_c};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
    }
}
