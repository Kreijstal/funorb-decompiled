/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rhb extends rqa {
    static String field_o;

    public static void a() {
        field_o = null;
    }

    rhb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, int[] param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        c var4_ref_c = null;
        int var4 = 0;
        int var5_int = 0;
        c var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (tc.field_c == sp.field_o) {
              L1: {
                var2_long = wt.a(false);
                if (0 == cd.field_c) {
                  break L1;
                } else {
                  if (kcb.field_p < 0) {
                    var4_ref_c = (c) (Object) mlb.field_q.d(0);
                    if (var4_ref_c == null) {
                      break L1;
                    } else {
                      if (var4_ref_c.field_e < var2_long) {
                        var4_ref_c.b(-3846);
                        vja.field_a = var4_ref_c.field_f.length;
                        qga.field_b.field_e = 0;
                        var5_int = 0;
                        L2: while (true) {
                          if (var5_int >= vja.field_a) {
                            iq.field_a = foa.field_o;
                            foa.field_o = fd.field_r;
                            fd.field_r = ow.field_a;
                            ow.field_a = var4_ref_c.field_d;
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            return stackIn_14_0 != 0;
                          } else {
                            qga.field_b.field_h[var5_int] = var4_ref_c.field_f[var5_int];
                            var5_int++;
                            continue L2;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L3: while (true) {
                L4: {
                  if (0 <= kcb.field_p) {
                    break L4;
                  } else {
                    qga.field_b.field_e = 0;
                    if (boa.a(1, 30000)) {
                      kcb.field_p = qga.field_b.o(255);
                      qga.field_b.field_e = 0;
                      vja.field_a = param1[kcb.field_p];
                      break L4;
                    } else {
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0 != 0;
                    }
                  }
                }
                if (!ci.b((byte) 51)) {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  return stackIn_23_0 != 0;
                } else {
                  if (cd.field_c == 0) {
                    iq.field_a = foa.field_o;
                    foa.field_o = fd.field_r;
                    fd.field_r = ow.field_a;
                    ow.field_a = kcb.field_p;
                    kcb.field_p = -1;
                    stackOut_32_0 = 1;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    L5: {
                      var4 = cd.field_c;
                      if (aib.field_c == 0.0) {
                        break L5;
                      } else {
                        var4 = (int)((double)var4 + jeb.field_b.nextGaussian() * aib.field_c);
                        if (var4 >= 0) {
                          break L5;
                        } else {
                          var4 = 0;
                          break L5;
                        }
                      }
                    }
                    var5 = new c((long)var4 + var2_long, kcb.field_p, new byte[vja.field_a]);
                    var6 = 0;
                    L6: while (true) {
                      if (var6 >= vja.field_a) {
                        mlb.field_q.b(-10258, (ksa) (Object) var5);
                        kcb.field_p = -1;
                        continue L3;
                      } else {
                        var5.field_f[var6] = qga.field_b.field_h[var6];
                        var6++;
                        continue L6;
                      }
                    }
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
          L7: {
            var2 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var2;
            stackOut_34_1 = new StringBuilder().append("rhb.C(").append(0).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L7;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 41);
        }
        return stackIn_33_0 != 0;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
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
            if (param1 < -119) {
              stackOut_3_0 = new nc((Object) (Object) frb.a(225, 79));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("rhb.A(");
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
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Real-life threats";
    }
}
