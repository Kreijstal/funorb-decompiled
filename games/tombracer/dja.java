/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dja extends nv implements ut {
    static jea field_p;
    private jma field_n;
    static int field_r;
    private boolean field_q;
    private int field_o;
    private int field_t;
    static String[] field_s;

    public static void l(int param0) {
        field_s = null;
        if (param0 != 1) {
            field_r = 91;
        }
        field_p = null;
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            int discarded$0 = ((dja) this).c(56);
        }
        param0 = fs.a((byte) 122, param0, ((dja) this).field_t);
        return ((dja) this).field_n.a(105, param0);
    }

    final void k(int param0) {
        int var2 = 0;
        npa var3 = null;
        ffa[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (!((dja) this).field_n.f((byte) -56)) {
            break L0;
          } else {
            ((dja) this).c(false);
            break L0;
          }
        }
        var2 = 0;
        var3 = ((dja) this).b(true).field_u;
        var4 = var3.a((byte) -26, (ffa) (Object) ((dja) this).field_g);
        var5 = 0;
        L1: while (true) {
          if (var5 >= var4.length) {
            ((dja) this).field_t = var2;
            var5 = 0;
            if (param0 == 5418) {
              L2: {
                if (0 >= var2) {
                  break L2;
                } else {
                  if (((dja) this).field_o > var2) {
                    break L2;
                  } else {
                    var5 = 1;
                    break L2;
                  }
                }
              }
              ((dja) this).field_n.a((byte) -14, var5 != 0);
              return;
            } else {
              return;
            }
          } else {
            int discarded$7 = -103;
            if (this.a(var4[var5])) {
              var2 = var2 + var4[var5].b(75);
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    public final int c(int param0) {
        if (param0 != 17832) {
            ((dja) this).k(121);
        }
        return 3364198;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -127, ((dja) this).field_o, 8);
            param1.a((byte) -128, !((dja) this).field_q ? 0 : 1, 1);
            ((dja) this).field_n.a(((dja) this).h((byte) 117), (byte) 117, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "dja.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    dja(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            ((dja) this).field_o = param1.b((byte) 44, 8);
            if (param0.field_E <= 10) {
                ((dja) this).field_o = ((dja) this).field_o / 5;
            }
            if (9 <= param0.field_E) {
                ((dja) this).field_q = 1 != param1.b((byte) 44, 1) ? false : true;
            }
            ((dja) this).field_n = new jma(15, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "dja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final int b(int param0) {
        int var2 = 33 % ((param0 - -46) / 45);
        return ((dja) this).field_o;
    }

    dja(la param0, boolean param1) {
        super(param0, param1);
        try {
            ((dja) this).field_o = 50;
            ((dja) this).field_n = new jma(15);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "dja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
            field_s = null;
        }
        return 17;
    }

    public final int g(byte param0) {
        if (param0 != -108) {
            return -69;
        }
        return 8969727;
    }

    public final jma k(byte param0) {
        if (param0 >= -67) {
            ((dja) this).field_q = true;
        }
        return ((dja) this).field_n;
    }

    final void a(int param0, boolean param1) {
        ((dja) this).field_o = param0;
        if (!param1) {
            dja.l(56);
        }
    }

    private final boolean a(ffa param0) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param0.a(124)) {
              if ((Object) (Object) ((dja) this).field_g == (Object) (Object) param0) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              } else {
                L1: {
                  if (!((dja) this).field_q) {
                    if (io.a(((dja) this).field_g.c(-73), param0.e(9648), (byte) -89, ((dja) this).field_g.a((byte) 55), param0.d(3), ((dja) this).field_g.e(9648), param0.a((byte) 55), param0.c(-43), ((dja) this).field_g.d(3))) {
                      break L1;
                    } else {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    }
                  } else {
                    if (ck.a(param0.d(3), param0.a((byte) 55), ((dja) this).field_g.d(3), ((dja) this).field_g.c(-113), ((dja) this).field_g.a((byte) 55), param0.e(9648), (byte) 67, ((dja) this).field_g.e(9648), param0.c(-51))) {
                      break L1;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0 != 0;
                    }
                  }
                }
                stackOut_14_0 = 1;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("dja.P(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + -103 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final void g(int param0) {
        super.g(param0);
        ((dja) this).field_n.a((byte) 48, ((dja) this).h((byte) 125));
    }

    public final int j(byte param0) {
        if (param0 != -108) {
            ((dja) this).field_q = true;
        }
        return ((dja) this).field_t;
    }

    final static boolean a(byte param0, char param1) {
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            L2: {
              var2 = -39 % ((param0 - -76) / 36);
              if (param1 < 65) {
                break L2;
              } else {
                if (param1 <= 90) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param1 < 97) {
                break L3;
              } else {
                if (param1 > 122) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L0;
        }
        return stackIn_8_0 != 0;
    }

    final static boolean a() {
        if (hka.field_b != null) {
            if (hka.field_b.a(13)) {
                wp.a(-1);
                return true;
            }
        }
        if (null != fj.field_c) {
            if (!(!fj.field_c.b(true))) {
                fj.field_c = null;
                wp.a(-1);
                return true;
            }
        }
        if (!(!bc.a(true))) {
            return true;
        }
        if (mda.b(13, (byte) -44, 12, 15)) {
            return true;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 7;
    }
}
