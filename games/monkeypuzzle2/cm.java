/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends ua implements ql {
    private String[] field_C;
    static String[] field_E;
    static le[] field_F;
    private t[] field_A;
    static te field_D;
    static String[] field_z;
    private sh field_H;
    static String field_B;
    static String field_G;

    final static void k(int param0) {
        if (!ad.a(false)) {
            return;
        }
        jk.a(-95, false, param0);
    }

    final static void a(int param0, byte param1) {
        hi.field_c = param0 >> 4 & 3;
        int var2 = -51;
        if (!(hi.field_c <= 2)) {
            hi.field_c = 2;
        }
        o.field_a = (14 & param0) >> 2;
        if (2 < o.field_a) {
            o.field_a = 2;
        }
        ak.field_v = param0 & 3;
        if (!(ak.field_v <= 2)) {
            ak.field_v = 2;
        }
    }

    final void a(String[] param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        lc var4 = null;
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
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((cm) this).field_u.b((byte) 121);
              if (param0 == null) {
                break L1;
              } else {
                if (0 != param0.length) {
                  var3_int = param0.length;
                  ((cm) this).field_C = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var3_int <= var4_int) {
                      var4 = new lc(t.field_z, 0, 1);
                      ((cm) this).field_A = new t[var3_int + 1];
                      if (param1 == 560186724) {
                        var5 = 0;
                        L3: while (true) {
                          if (var5 >= var3_int) {
                            ((cm) this).field_A[var3_int] = new t(lf.field_b, (of) this);
                            ((cm) this).field_A[var3_int].field_h = (ml) (Object) var4;
                            ((cm) this).field_A[var3_int].a(15, 13361, 0, 100, var3_int * 16 + 36);
                            ((cm) this).b((byte) -89, (we) (Object) ((cm) this).field_A[var3_int]);
                            break L0;
                          } else {
                            ((cm) this).field_A[var5] = new t(((cm) this).field_C[var5], (of) this);
                            ((cm) this).field_A[var5].field_h = (ml) (Object) var4;
                            ((cm) this).field_A[var5].field_m = ad.field_j;
                            ((cm) this).field_A[var5].a(15, 13361, 0, 80, 20 + var5 * 16);
                            ((cm) this).b((byte) -104, (we) (Object) ((cm) this).field_A[var5]);
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      ((cm) this).field_C[var4_int] = pj.a((byte) 83, (CharSequence) (Object) param0[var4_int]).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            ((cm) this).field_C = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("cm.J(");
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
          throw la.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
    }

    cm(sh param0) {
        super(0, 0, 0, 0, (ml) null);
        try {
            ((cm) this).field_H = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "cm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_F = null;
        field_E = null;
        field_G = null;
        if (param0 < 104) {
            field_G = null;
        }
        field_B = null;
        field_z = null;
        field_D = null;
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, -20)) {
              if (98 != param2) {
                if (99 != param2) {
                  var5_int = -16 % ((param3 - 37) / 50);
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = ((cm) this).b(param0, false);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = ((cm) this).a((byte) 88, param0);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("cm.V(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
            return;
        }
        ta var5 = t.field_z;
        if (!(((cm) this).field_C == null)) {
            int discarded$0 = var5.a(dh.field_a, ((cm) this).field_r + param3, param2 + ((cm) this).field_e, ((cm) this).field_l, 20, 16777215, -1, 0, 0, var5.field_C - -var5.field_D);
        }
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
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
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 7) {
                break L1;
              } else {
                cm.d((byte) 77);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              if (((cm) this).field_C.length <= var6_int) {
                L3: {
                  if (param4 != ((cm) this).field_A[((cm) this).field_C.length]) {
                    break L3;
                  } else {
                    ((cm) this).field_H.a(param3 ^ 207);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (param4 == ((cm) this).field_A[var6_int]) {
                    ((cm) this).field_H.a(((cm) this).field_C[var6_int], -94);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("cm.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw la.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final static void a(int param0) {
        le var1 = null;
        RuntimeException var1_ref = null;
        le var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1 = new le(540, 140);
            mc.a(-8497, var1);
            ig.b();
            ge.d();
            uj.field_i = 0;
            ec.b(-128);
            var2 = var1.d();
            var3 = 0;
            L1: while (true) {
              if (var3 >= 15) {
                ca.field_f.e();
                var1.e(0, 0);
                tj.b(653);
                break L0;
              } else {
                var2.e(-2, -2, 16777215);
                ge.b(4, 4, 0, 0, 540, 140);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1_ref, "cm.B(" + 15 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_D = new te(4, 1, 1, 1);
        field_B = "Names should contain a maximum of 12 characters";
    }
}
