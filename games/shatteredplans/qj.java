/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static int field_g;
    static byte[] field_f;
    static String field_c;
    static int field_e;
    static String field_a;
    static int field_b;
    static String field_d;

    final static void a(sq param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        String var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        lm var9 = null;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        String[] var13 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            te.field_c = 0;
            if (param0 != null) {
              L1: {
                var2_int = rs.field_Cb.field_J + rs.field_Cb.field_q;
                var3 = -6 + param0.field_j + -20;
                var4 = uq.field_m.a(5607, param0.field_c);
                var12 = vi.a((nq) (Object) rs.field_Cb, (byte) 109, var4, new int[1]);
                var6 = var12.length;
                ra.a(-106);
                if (0 >= var6) {
                  eh.field_L = null;
                  break L1;
                } else {
                  eh.field_L = new bi[var6];
                  eh.field_L[0] = new bi(var3, var2_int);
                  eh.field_L[0].e();
                  rs.field_Cb.d(var12[0], 0, rs.field_Cb.field_J, 16777215, -1);
                  var7 = 1;
                  L2: while (true) {
                    if (var7 >= var6) {
                      break L1;
                    } else {
                      eh.field_L[var7] = new bi(var3, var2_int);
                      eh.field_L[var7].e();
                      rs.field_Cb.d(var12[var7], 0, rs.field_Cb.field_J, 16777215, -1);
                      var7++;
                      continue L2;
                    }
                  }
                }
              }
              if (param1 == -1) {
                L3: {
                  if (param0.field_f == null) {
                    rg.field_f = null;
                    oi.field_i = null;
                    sp.field_m = null;
                    break L3;
                  } else {
                    var7 = param0.field_f.length;
                    rg.field_f = new int[var7];
                    sp.field_m = new bi[var7][];
                    oi.field_i = new bi[var7][];
                    var8 = 0;
                    L4: while (true) {
                      if (var7 <= var8) {
                        break L3;
                      } else {
                        var9 = param0.field_f[var8];
                        var4 = uq.field_m.a(5607, var9.field_b);
                        var13 = vi.a((nq) (Object) rs.field_Cb, (byte) 121, var4, new int[1]);
                        var6 = var13.length;
                        oi.field_i[var8] = new bi[var6];
                        sp.field_m[var8] = new bi[var6];
                        var10 = 0;
                        L5: while (true) {
                          if (var10 >= var6) {
                            var8++;
                            continue L4;
                          } else {
                            oi.field_i[var8][var10] = new bi(var3, var2_int);
                            oi.field_i[var8][var10].e();
                            rs.field_Cb.d(var13[var10], 0, rs.field_Cb.field_J, 16777215, -1);
                            sp.field_m[var8][var10] = oi.field_i[var8][var10].g();
                            sp.field_m[var8][var10].e();
                            gf.b(1, 1, 0, 0, var3, var2_int);
                            var10++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                }
                cg.i(0);
                break L0;
              } else {
                return;
              }
            } else {
              sp.field_m = null;
              eh.field_L = null;
              oi.field_i = null;
              rg.field_f = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("qj.F(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 41);
        }
    }

    public static void a(byte param0) {
        if (param0 != -20) {
            qj.a((byte) 115);
        }
        field_d = null;
        field_a = null;
        field_c = null;
        field_f = null;
    }

    final static boolean a(boolean param0, CharSequence param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = param2.length();
            var4 = param1.length();
            if (var4 <= var3_int) {
              L1: {
                var5 = 0;
                if (param0) {
                  break L1;
                } else {
                  var9 = null;
                  boolean discarded$2 = qj.a(true, (CharSequence) null, (CharSequence) null);
                  break L1;
                }
              }
              L2: while (true) {
                if (var5 >= var4) {
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L3: {
                    var6 = param2.charAt(var5);
                    var7 = param1.charAt(var5);
                    if (var7 == var6) {
                      break L3;
                    } else {
                      if (Character.toLowerCase((char) var6) == Character.toLowerCase((char) var7)) {
                        break L3;
                      } else {
                        if (Character.toUpperCase((char) var6) == Character.toUpperCase((char) var7)) {
                          break L3;
                        } else {
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0 != 0;
                        }
                      }
                    }
                  }
                  var5++;
                  continue L2;
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
          L4: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("qj.B(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final static void b(byte param0) {
        int var1 = 15;
    }

    final static void a(byte param0, int param1) {
        if (param0 != -127) {
            return;
        }
        cr.field_b = param1;
    }

    final static qa a(byte param0, dc param1, ob param2) {
        ln var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        qa stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        qa stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -63) {
                break L1;
              } else {
                qj.a((byte) 55);
                break L1;
              }
            }
            var3 = mg.a(param1, param2, 20);
            var4 = param2.f(-20976);
            stackOut_2_0 = new qa(var3, var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("qj.D(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_c = "Click or press F10 to open Quick Chat";
        field_a = "Encouraging rule breaking";
        field_d = "Our territory is currently short of <%0>, so to build more fleets we should concentrate on acquiring ";
    }
}
