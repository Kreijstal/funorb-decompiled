/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sg extends ta {
    boolean field_A;
    static int field_B;
    static String field_E;
    private sk field_C;
    static String field_F;
    private int field_D;

    private final int e(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            ((sg) this).field_A = false;
            break L0;
          }
        }
        L1: {
          if (!((sg) this).field_A) {
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          } else {
            if (this == (Object) (Object) ((sg) this).field_C.k(3469)) {
              stackOut_5_0 = 256;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            } else {
              stackOut_4_0 = 0;
              stackIn_7_0 = stackOut_4_0;
              break L1;
            }
          }
        }
        return stackIn_7_0;
    }

    final void a(int param0, byte param1, int param2) {
        ((sg) this).a(ed.field_a + -param2 >> 1, lh.field_d + -param0 >> 1, param0, (byte) -90, param2);
        if (param1 != -81) {
            field_E = null;
        }
    }

    boolean l(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 194) {
            break L0;
          } else {
            int discarded$2 = this.e(true);
            break L0;
          }
        }
        L1: {
          L2: {
            ((sg) this).field_D = this.e(false);
            if (((sg) this).field_D != 0) {
              break L2;
            } else {
              if (((sg) this).field_A) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    boolean d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var2 = this.e(param0);
          var3 = var2 + -((sg) this).field_D;
          if (var3 <= 0) {
            break L0;
          } else {
            ((sg) this).field_D = ((sg) this).field_D + (var3 + 7) / 8;
            break L0;
          }
        }
        L1: {
          if (var3 >= 0) {
            break L1;
          } else {
            ((sg) this).field_D = ((sg) this).field_D + (-16 + (var3 - -1)) / 16;
            break L1;
          }
        }
        L2: {
          L3: {
            if (0 != ((sg) this).field_D) {
              break L3;
            } else {
              if (0 != var2) {
                break L3;
              } else {
                if (((sg) this).field_A) {
                  break L3;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
            }
          }
          stackOut_8_0 = 0;
          stackIn_9_0 = stackOut_8_0;
          break L2;
        }
        return stackIn_9_0 != 0;
    }

    final static void k() {
        Object var2 = null;
        ed.a((String) null, 0, "");
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (((sg) this).field_D == 0) {
          return;
        } else {
          if (((sg) this).field_D < 256) {
            L0: {
              L1: {
                if (me.field_f == null) {
                  break L1;
                } else {
                  if (((sg) this).field_m > me.field_f.field_o) {
                    break L1;
                  } else {
                    if (me.field_f.field_k < ((sg) this).field_r) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
              me.field_f = new hj(((sg) this).field_m, ((sg) this).field_r);
              break L0;
            }
            de.a(param2 ^ -1048454, me.field_f);
            ul.d();
            ((sg) this).a(0, 0, -9111);
            super.a(-param0 - ((sg) this).field_n, param1, param2, -((sg) this).field_s + -param3);
            int discarded$2 = -105;
            oc.g();
            me.field_f.a(param3 + ((sg) this).field_s, param0 - -((sg) this).field_n, ((sg) this).field_D);
            return;
          } else {
            if (param1 == 0) {
              ((sg) this).a(param3 - -((sg) this).field_s, param0 + ((sg) this).field_n, -9111);
              super.a(param0, param1, param2, param3);
              return;
            } else {
              return;
            }
          }
        }
    }

    sg(sk param0, int param1, int param2) {
        super(ed.field_a + -param1 >> 1, -param2 + lh.field_d >> 1, param1, param2, (td) null);
        try {
            ((sg) this).field_C = param0;
            ((sg) this).field_A = false;
            ((sg) this).field_D = 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "sg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void a(int param0, int param1, int param2);

    final static boolean c() {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            if (hi.field_k < 10) {
              break L1;
            } else {
              if (d.field_k) {
                break L1;
              } else {
                if (p.a(23236)) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final static e a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        e var7 = null;
        int var8 = 0;
        e stackIn_4_0 = null;
        e stackIn_8_0 = null;
        e stackIn_11_0 = null;
        e stackIn_16_0 = null;
        e stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        e stackOut_3_0 = null;
        e stackOut_7_0 = null;
        e stackOut_18_0 = null;
        e stackOut_15_0 = null;
        e stackOut_10_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_3_0 = oc.field_M;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (var2_int > 255) {
                stackOut_7_0 = vj.field_c;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var3 = g.a(-121, '.', param1);
                if (var3.length >= 2) {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      int discarded$2 = 118;
                      stackOut_18_0 = dh.a(var3[-1 + var3.length]);
                      stackIn_19_0 = stackOut_18_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = eg.b(0, var6);
                      if (var7 == null) {
                        var5++;
                        continue L1;
                      } else {
                        stackOut_15_0 = (e) var7;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      }
                    }
                  }
                } else {
                  stackOut_10_0 = oc.field_M;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("sg.QB(").append(-1326).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L2;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_19_0;
    }

    final pj b(byte param0) {
        pj var2 = super.b(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (pj) this;
    }

    public static void a() {
        field_F = null;
        field_E = null;
        int var1 = 15;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Passwords must be between 5 and 20 characters long";
    }
}
