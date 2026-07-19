/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends jc {
    static String[] field_J;
    static String field_M;
    static String field_L;
    static String field_N;
    private ta field_K;

    final static void d(byte param0) {
        boolean discarded$15 = false;
        boolean discarded$16 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param0 == 22) {
                break L1;
              } else {
                field_J = (String[]) null;
                break L1;
              }
            }
            if (tk.b(127)) {
              discarded$15 = ll.field_a.a(true, ql.field_c, cl.field_T, 0);
              ll.field_a.o(-256);
              L2: while (true) {
                if (!mm.b((byte) 118)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  discarded$16 = ll.field_a.a((byte) -65, lj.field_t, ud.field_c);
                  continue L2;
                }
              }
            } else {
              L3: {
                if (null == kf.field_d) {
                  break L3;
                } else {
                  if (kf.field_d.field_b) {
                    ng.a((byte) 81);
                    ll.field_a.b(param0 ^ 23, new bh(ll.field_a, od.field_k));
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "hm.Q(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0, fe param1) {
        cc var3 = null;
        boolean discarded$0 = false;
        try {
            if (!(param1 instanceof cc)) {
                throw new IllegalArgumentException();
            }
            if (param0 != 1) {
                this.n(31);
            }
            var3 = (cc) ((Object) param1);
            this.field_K.a(var3, 27862);
            var3.field_K = true;
            discarded$0 = var3.a((fe) (this), 127);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "hm.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void o(int param0) {
        int var4 = MinerDisturbance.field_ab;
        if (param0 != -256) {
            return;
        }
        hh var2 = new hh(this.field_K);
        cc var3 = (cc) ((Object) var2.d(param0 + -19608));
        while (var3 != null) {
            if (var3.n(-4)) {
                var3.b(34);
            }
            var3 = (cc) ((Object) var2.a(12537));
        }
        this.field_I = (fe) ((Object) this.e((byte) 83));
    }

    public hm() {
        super(0, 0, od.field_n, ae.field_c, (ad) null, (rm) null);
        this.field_K = new ta();
    }

    public static void c(byte param0) {
        field_M = null;
        field_N = null;
        if (param0 < 111) {
            field_J = (String[]) null;
        }
        field_L = null;
        field_J = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var7 = MinerDisturbance.field_ab;
        if (null != this.field_A) {
            this.field_A.a(12088, param1, (fe) (this), param2, true);
        }
        hh var5 = new hh(this.field_K);
        if (param0 != 4) {
            this.a(false);
        }
        fe var6 = (fe) ((Object) var5.a(true));
        while (var6 != null) {
            var6.a((byte) 4, param1 + this.field_u, this.field_t + param2, param3);
            var6 = (fe) ((Object) var5.c(-127));
        }
    }

    final static int f(byte param0) {
        if (param0 != -67) {
            field_N = (String) null;
        }
        return mj.field_p;
    }

    final void n(int param0) {
        int var4 = MinerDisturbance.field_ab;
        hh var2 = new hh(this.field_K);
        cc var3 = (cc) ((Object) var2.d(-19864));
        while (var3 != null) {
            var3.field_K = false;
            var3 = (cc) ((Object) var2.a(12537));
        }
        if (param0 != 21974) {
            field_J = (String[]) null;
        }
        this.field_I = null;
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
            field_J = (String[]) null;
            break L0;
          }
        }
        var2 = new hh(this.field_K);
        var3 = (cc) ((Object) var2.d(-19864));
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_K) {
              var3 = (cc) ((Object) var2.a(12537));
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
            field_L = (String) null;
        }
        hh var2 = new hh(this.field_K);
        cc var3 = (cc) ((Object) var2.d(-19864));
        while (var3 != null) {
            if (var3.a(false)) {
                var3.b(34);
            }
            var3 = (cc) ((Object) var2.a(12537));
        }
    }

    final cc e(byte param0) {
        hh var2 = null;
        cc var3 = null;
        int var4 = 0;
        L0: {
          var4 = MinerDisturbance.field_ab;
          var2 = new hh(this.field_K);
          var3 = (cc) ((Object) var2.d(-19864));
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
              var3 = (cc) ((Object) var2.a(12537));
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final static gj a(String param0, boolean param1) {
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
        gj stackIn_16_0 = null;
        gj stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        gj stackOut_18_0 = null;
        gj stackOut_15_0 = null;
        gj stackOut_8_0 = null;
        gj stackOut_5_0 = null;
        gj stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          L0: {
            var2_int = param0.length();
            if (0 != var2_int) {
              if ((var2_int ^ -1) >= -256) {
                var3 = h.a('.', param1, param0);
                if ((var3.length ^ -1) <= -3) {
                  L1: {
                    if (param1) {
                      break L1;
                    } else {
                      hm.c((byte) 7);
                      break L1;
                    }
                  }
                  var4 = var3;
                  var5 = 0;
                  L2: while (true) {
                    if (var4.length <= var5) {
                      stackOut_18_0 = ql.a(param1, var3[var3.length - 1]);
                      stackIn_19_0 = stackOut_18_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = rg.a(var6, true);
                      if (var7 == null) {
                        var5++;
                        continue L2;
                      } else {
                        stackOut_15_0 = (gj) (var7);
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackOut_8_0 = dh.field_d;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = ec.field_d;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = dh.field_d;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var2);
            stackOut_20_1 = new StringBuilder().append("hm.L(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                return stackIn_19_0;
              }
            }
          }
        }
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
        int decompiledRegionSelector0 = 0;
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
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = 121 % ((-63 - param0) / 48);
              var4 = im.b(111);
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4.length) {
                  stackOut_11_0 = li.field_d;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var6 = var4[var5];
                  if (!var6.a(2, var2)) {
                    var5++;
                    continue L1;
                  } else {
                    stackOut_8_0 = (sj) (var6);
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2_ref);
            stackOut_13_1 = new StringBuilder().append("hm.N(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    static {
        field_M = "Waiting for sound effects";
        field_J = new String[]{"Throw caution to the wind and take some trusty dynamite into the mine. It's vital for making short work of stubborn boulders. Press <img=19> to plant and then beat a swift retreat. Does not work underwater.", "Throw caution to the wind and take some trusty dynamite into the Super Volcano. It's vital for making short work of stubborn boulders. Press <img=19> to plant and then beat a swift retreat. Does not work underwater."};
        field_L = "That name is not available";
        field_N = "Ranking: Boreal Brave";
    }
}
