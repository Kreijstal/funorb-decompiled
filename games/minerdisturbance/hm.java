/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends jc {
    static String[] field_J;
    static String field_M;
    static String field_L;
    static String field_N;
    private ta field_K;

    final static void d() {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = MinerDisturbance.field_ab;
        try {
          L0: {
            int discarded$19 = 127;
            if (tk.b()) {
              boolean discarded$20 = ll.field_a.a(true, ql.field_c, cl.field_T, 0);
              ll.field_a.o(-256);
              L1: while (true) {
                if (!mm.b((byte) 118)) {
                  break L0;
                } else {
                  boolean discarded$21 = ll.field_a.a((byte) -65, lj.field_t, ud.field_c);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (null == kf.field_d) {
                  break L2;
                } else {
                  if (kf.field_d.field_b) {
                    ng.a((byte) 81);
                    ll.field_a.b(1, (fe) (Object) new bh(ll.field_a, od.field_k));
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "hm.Q(" + 22 + 41);
        }
    }

    final void b(int param0, fe param1) {
        cc var3 = null;
        try {
            if (!(param1 instanceof cc)) {
                throw new IllegalArgumentException();
            }
            if (param0 != 1) {
                ((hm) this).n(31);
            }
            var3 = (cc) (Object) param1;
            ((hm) this).field_K.a((pi) (Object) var3, 27862);
            var3.field_K = true;
            boolean discarded$0 = var3.a((fe) this, 127);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "hm.P(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void o(int param0) {
        int var4 = MinerDisturbance.field_ab;
        if (param0 != -256) {
            return;
        }
        hh var2 = new hh(((hm) this).field_K);
        cc var3 = (cc) (Object) var2.d(param0 + -19608);
        while (var3 != null) {
            if (var3.n(-4)) {
                var3.b(34);
            }
            var3 = (cc) (Object) var2.a(12537);
        }
        ((hm) this).field_I = (fe) (Object) ((hm) this).e((byte) 83);
    }

    public hm() {
        super(0, 0, od.field_n, ae.field_c, (ad) null, (rm) null);
        ((hm) this).field_K = new ta();
    }

    public static void c(byte param0) {
        field_M = null;
        field_N = null;
        if (param0 < 111) {
            field_J = null;
        }
        field_L = null;
        field_J = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var7 = MinerDisturbance.field_ab;
        if (null != ((hm) this).field_A) {
            ((hm) this).field_A.a(12088, param1, (fe) this, param2, true);
        }
        hh var5 = new hh(((hm) this).field_K);
        if (param0 != 4) {
            ((hm) this).a(false);
        }
        fe var6 = (fe) (Object) var5.a(true);
        while (var6 != null) {
            var6.a((byte) 4, param1 + ((hm) this).field_u, ((hm) this).field_t + param2, param3);
            var6 = (fe) (Object) var5.c(-127);
        }
    }

    final static int f() {
        return mj.field_p;
    }

    final void n(int param0) {
        int var4 = MinerDisturbance.field_ab;
        hh var2 = new hh(((hm) this).field_K);
        cc var3 = (cc) (Object) var2.d(-19864);
        while (var3 != null) {
            var3.field_K = false;
            var3 = (cc) (Object) var2.a(12537);
        }
        if (param0 != 21974) {
            field_J = null;
        }
        ((hm) this).field_I = null;
    }

    final fe m(int param0) {
        hh var2 = null;
        cc var3 = null;
        int var4 = 0;
        L0: {
          var4 = MinerDisturbance.field_ab;
          if (param0 == -21923) {
            break L0;
          } else {
            field_J = null;
            break L0;
          }
        }
        var2 = new hh(((hm) this).field_K);
        var3 = (cc) (Object) var2.d(-19864);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_K) {
              var3 = (cc) (Object) var2.a(12537);
              continue L1;
            } else {
              return var3.m(124);
            }
          } else {
            return null;
          }
        }
    }

    final void a(boolean param0) {
        int var4 = MinerDisturbance.field_ab;
        if (!param0) {
            field_L = null;
        }
        hh var2 = new hh(((hm) this).field_K);
        cc var3 = (cc) (Object) var2.d(-19864);
        while (var3 != null) {
            if (var3.a(false)) {
                var3.b(34);
            }
            var3 = (cc) (Object) var2.a(12537);
        }
    }

    final cc e(byte param0) {
        hh var2 = null;
        cc var3 = null;
        int var4 = 0;
        L0: {
          var4 = MinerDisturbance.field_ab;
          var2 = new hh(((hm) this).field_K);
          var3 = (cc) (Object) var2.d(-19864);
          if (param0 == 83) {
            break L0;
          } else {
            hm.c((byte) 111);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_K) {
              var3 = (cc) (Object) var2.a(12537);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final static gj a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        gj var7 = null;
        int var8 = 0;
        gj stackIn_3_0 = null;
        gj stackIn_6_0 = null;
        gj stackIn_9_0 = null;
        gj stackIn_14_0 = null;
        gj stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        gj stackOut_16_0 = null;
        gj stackOut_13_0 = null;
        gj stackOut_8_0 = null;
        gj stackOut_5_0 = null;
        gj stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          L0: {
            var2_int = param0.length();
            if (0 != var2_int) {
              if (var2_int <= 255) {
                var3 = h.a('.', true, param0);
                if (var3.length >= 2) {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      stackOut_16_0 = ql.a(true, var3[var3.length - 1]);
                      stackIn_17_0 = stackOut_16_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      int discarded$2 = 1;
                      var7 = rg.a(var6);
                      if (var7 == null) {
                        var5++;
                        continue L1;
                      } else {
                        stackOut_13_0 = (gj) var7;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      }
                    }
                  }
                } else {
                  stackOut_8_0 = dh.field_d;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = ec.field_d;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = dh.field_d;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("hm.L(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + 1 + 41);
        }
        return stackIn_17_0;
    }

    final static sj a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        sj[] var4 = null;
        int var5 = 0;
        sj var6 = null;
        int var7 = 0;
        sj stackIn_4_0 = null;
        sj stackIn_9_0 = null;
        sj stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        sj stackOut_3_0 = null;
        sj stackOut_11_0 = null;
        sj stackOut_8_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            var2 = kn.a("jagex-last-login-method", (byte) 114, param1);
            if (var2 == null) {
              stackOut_3_0 = li.field_d;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var3 = 0;
              int discarded$2 = 111;
              var4 = im.b();
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4.length) {
                  stackOut_11_0 = li.field_d;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  var6 = var4[var5];
                  if (!var6.a(2, var2)) {
                    var5++;
                    continue L1;
                  } else {
                    stackOut_8_0 = (sj) var6;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2_ref;
            stackOut_13_1 = new StringBuilder().append("hm.N(").append(28).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Waiting for sound effects";
        field_J = new String[]{"Throw caution to the wind and take some trusty dynamite into the mine. It's vital for making short work of stubborn boulders. Press <img=19> to plant and then beat a swift retreat. Does not work underwater.", "Throw caution to the wind and take some trusty dynamite into the Super Volcano. It's vital for making short work of stubborn boulders. Press <img=19> to plant and then beat a swift retreat. Does not work underwater."};
        field_L = "That name is not available";
        field_N = "Ranking: Boreal Brave";
    }
}
