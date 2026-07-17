/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    final static void a(int param0, int param1, int param2, int param3, kc[] param4, int param5, int param6, int param7, int param8, ee param9, kc[] param10, int param11, boolean param12, boolean param13, ee param14) {
        try {
            Object var16 = null;
            af.a(param14, param5, param2, 0, (byte) -120, af.field_jb, param3, param6, 0, param0, 480, (kc[]) null, param1, param10, param8, param11, param9, wg.field_a, param7, ca.field_b, param4);
            if (!param12) {
                we.a(-28);
            }
            mh.a(0, param13);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "we.G(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + (param9 != null ? "{...}" : "null") + 44 + (param10 != null ? "{...}" : "null") + 44 + param11 + 44 + param12 + 44 + param13 + 44 + (param14 != null ? "{...}" : "null") + 41);
        }
    }

    final static nc a(String param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        nc stackIn_3_0 = null;
        nc stackIn_7_0 = null;
        nc stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        nc stackIn_26_0 = null;
        Object stackIn_32_0 = null;
        nc stackIn_43_0 = null;
        nc stackIn_48_0 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_6_0 = null;
        nc stackOut_12_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        nc stackOut_25_0 = null;
        nc stackOut_42_0 = null;
        nc stackOut_47_0 = null;
        Object stackOut_31_0 = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var6 = Main.field_T;
        try {
          var2_int = param0.length();
          if (var2_int != 0) {
            if (var2_int > 64) {
              stackOut_6_0 = dj.field_f;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (param0.charAt(0) == 34) {
                if (34 != param0.charAt(-1 + var2_int)) {
                  stackOut_12_0 = ij.field_i;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  var3 = 0;
                  var4 = 1;
                  L0: while (true) {
                    if (~(-1 + var2_int) < ~var4) {
                      L1: {
                        var5 = param0.charAt(var4);
                        if (var5 == 92) {
                          L2: {
                            if (var3 != 0) {
                              stackOut_21_0 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              break L2;
                            } else {
                              stackOut_20_0 = 1;
                              stackIn_22_0 = stackOut_20_0;
                              break L2;
                            }
                          }
                          var3 = stackIn_22_0;
                          break L1;
                        } else {
                          L3: {
                            if (var5 != 34) {
                              break L3;
                            } else {
                              if (var3 != 0) {
                                break L3;
                              } else {
                                stackOut_25_0 = ij.field_i;
                                stackIn_26_0 = stackOut_25_0;
                                return stackIn_26_0;
                              }
                            }
                          }
                          var3 = 0;
                          break L1;
                        }
                      }
                      var4++;
                      continue L0;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                var3 = 0;
                if (param1 == 34) {
                  var4 = 0;
                  L4: while (true) {
                    if (var2_int > var4) {
                      var5 = param0.charAt(var4);
                      if (var5 == 46) {
                        L5: {
                          if (var4 == 0) {
                            break L5;
                          } else {
                            if (~var4 == ~(var2_int - 1)) {
                              break L5;
                            } else {
                              if (var3 != 0) {
                                break L5;
                              } else {
                                var3 = 1;
                                var4++;
                                var4++;
                                continue L4;
                              }
                            }
                          }
                        }
                        stackOut_42_0 = ij.field_i;
                        stackIn_43_0 = stackOut_42_0;
                        return stackIn_43_0;
                      } else {
                        if (rb.field_f.indexOf(var5) == -1) {
                          stackOut_47_0 = ij.field_i;
                          stackIn_48_0 = stackOut_47_0;
                          return stackIn_48_0;
                        } else {
                          var3 = 0;
                          var4++;
                          var4++;
                          continue L4;
                        }
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_31_0 = null;
                  stackIn_32_0 = stackOut_31_0;
                  return (nc) (Object) stackIn_32_0;
                }
              }
            }
          } else {
            stackOut_2_0 = ec.field_j;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var2;
            stackOut_55_1 = new StringBuilder().append("we.C(");
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param0 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L6;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + 44 + param1 + 41);
        }
    }

    final static void a(int param0, String param1) {
        if (param0 > -91) {
            return;
        }
        try {
            ia.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "we.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static long a(byte param0) {
        return id.a(85) - uk.field_a;
    }

    final static void b(int param0) {
        if (!vg.field_d) {
            throw new IllegalStateException();
        }
        tj.field_K = true;
        gh.a((byte) 59, false);
        cd.field_e = 0;
    }

    final static void a(int param0) {
        pj.field_a = cg.b(true);
        sd.field_c = new j();
        nf.a(true, (byte) -2, true);
        if (param0 != 0) {
            Object var2 = null;
            we.a(27, (String) null);
        }
    }

    final static kc[] a(int param0, int param1) {
        kc[] var4 = new kc[9];
        kc[] var2 = var4;
        int var3 = -115 / ((-7 - param0) / 45);
        var4[4] = te.a(64, -128, param1);
        return var2;
    }

    static {
    }
}
