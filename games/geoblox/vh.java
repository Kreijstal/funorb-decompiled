/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends ee implements pl {
    private String[] field_C;
    private hk[] field_I;
    private ta field_J;
    static qg field_D;
    static dm[] field_H;
    static dm field_G;
    static String field_E;

    final static na a(int param0, rh param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        na stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        na stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (mf.a(param0, param2, 123, param1)) {
              stackOut_3_0 = ab.a(104);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (na) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("vh.A(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + true + ')');
        }
        return stackIn_4_0;
    }

    final static boolean g(int param0) {
        return oc.field_e != null && pk.field_l.a(true);
    }

    final static String f(int param0) {
        if (param0 != 100) {
            String discarded$0 = vh.f(29);
        }
        if (kd.field_b == tf.field_d) {
            return rh.field_i;
        }
        if (!ih.field_c.a(-113)) {
            return ih.field_c.b(param0 + 19391);
        }
        if (si.field_g == tf.field_d) {
            return ih.field_c.b(19491);
        }
        return b.field_a;
    }

    public static void b(boolean param0) {
        field_H = null;
        field_D = null;
        field_E = null;
        field_G = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) 88, param3);
        if (!(param3 == 0)) {
            return;
        }
        m var5 = ng.field_F;
        int var6 = -69 / ((1 - param2) / 43);
        if (!(((vh) this).field_C == null)) {
            int discarded$0 = var5.a(ab.field_e, ((vh) this).field_v + param0, param1 + ((vh) this).field_m, ((vh) this).field_r, 20, 16777215, -1, 0, 0, var5.field_q + var5.field_o);
        }
    }

    vh(ta param0) {
        super(0, 0, 0, 0, (dh) null);
        try {
            ((vh) this).field_J = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "vh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_10_0 = false;
        boolean stackOut_7_0 = false;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 13) {
                break L1;
              } else {
                field_E = null;
                break L1;
              }
            }
            if (super.a(param0, param1, param2, param3)) {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (param0 != 98) {
                if (99 != param0) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = ((vh) this).a(param3, -110);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                stackOut_7_0 = ((vh) this).a(7305, param3);
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("vh.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            if (param1 == -20) {
              var6_int = 0;
              L1: while (true) {
                if (((vh) this).field_C.length <= var6_int) {
                  L2: {
                    if (((vh) this).field_I[((vh) this).field_C.length] != param4) {
                      break L2;
                    } else {
                      ((vh) this).field_J.a((byte) 83);
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  L3: {
                    if (((vh) this).field_I[var6_int] == param4) {
                      ((vh) this).field_J.a(((vh) this).field_C[var6_int], 20);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var6_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("vh.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
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
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final void a(byte param0, String[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        fh var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = Geoblox.field_C;
        try {
          L0: {
            ((vh) this).field_z.c((byte) -98);
            if (param0 == 126) {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if (param1.length != 0) {
                    var3_int = param1.length;
                    ((vh) this).field_C = new String[var3_int];
                    var4_int = 0;
                    L2: while (true) {
                      if (var3_int <= var4_int) {
                        var4 = new fh(ng.field_F, 0, 1);
                        ((vh) this).field_I = new hk[var3_int + 1];
                        var5 = 0;
                        L3: while (true) {
                          if (var5 >= var3_int) {
                            ((vh) this).field_I[var3_int] = new hk(ll.field_a, (bb) this);
                            ((vh) this).field_I[var3_int].field_q = (dh) (Object) var4;
                            ((vh) this).field_I[var3_int].a(15, 100, (byte) -59, 16 + (var3_int * 16 + 20), 0);
                            ((vh) this).b((byte) -122, (el) (Object) ((vh) this).field_I[var3_int]);
                            break L0;
                          } else {
                            ((vh) this).field_I[var5] = new hk(((vh) this).field_C[var5], (bb) this);
                            ((vh) this).field_I[var5].field_q = (dh) (Object) var4;
                            ((vh) this).field_I[var5].field_j = ml.field_u;
                            ((vh) this).field_I[var5].a(15, 80, (byte) -14, var5 * 16 + 20, 0);
                            ((vh) this).b((byte) -126, (el) (Object) ((vh) this).field_I[var5]);
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        ((vh) this).field_C[var4_int] = p.a((CharSequence) (Object) param1[var4_int], param0 + -123).replace(' ', ' ');
                        var4_int++;
                        continue L2;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              ((vh) this).field_C = null;
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("vh.E(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new qg(0);
        field_E = "Welcome to Geoblox, a game where you earn points for matching geoblox by shape or colour. Just make sure you don't allow your falling geoblox to get out of control and stack outside of the play area!<br><br>To play Geoblox, you need to rotate the play area by pressing and holding the <img=0> or <img=1> arrow keys. Press <img=2> and then experiment with left and right rotation until the next tip comes up. Press <img=2> to continue.";
    }
}
