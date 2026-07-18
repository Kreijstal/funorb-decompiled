/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    final static void a(int param0, int param1, int param2, int param3, kc[] param4, int param5, int param6, int param7, int param8, ee param9, kc[] param10, int param11, boolean param12, boolean param13, ee param14) {
        try {
            Object var16 = null;
            af.a(param14, 320, param2, 0, (byte) -120, af.field_jb, 6, 18, 0, 240, 480, (kc[]) null, param1, param10, 2, 18, param9, wg.field_a, 18, ca.field_b, param4);
            mh.a(0, param13);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "we.G(" + 240 + ',' + param1 + ',' + param2 + ',' + 6 + ',' + (param4 != null ? "{...}" : "null") + ',' + 320 + ',' + 18 + ',' + 18 + ',' + 2 + ',' + (param9 != null ? "{...}" : "null") + ',' + (param10 != null ? "{...}" : "null") + ',' + 18 + ',' + true + ',' + param13 + ',' + (param14 != null ? "{...}" : "null") + ')');
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
        nc stackIn_42_0 = null;
        nc stackIn_47_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_6_0 = null;
        nc stackOut_12_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        nc stackOut_25_0 = null;
        nc stackOut_41_0 = null;
        nc stackOut_46_0 = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
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
                      stackOut_41_0 = ij.field_i;
                      stackIn_42_0 = stackOut_41_0;
                      return stackIn_42_0;
                    } else {
                      if (rb.field_f.indexOf(var5) == -1) {
                        stackOut_46_0 = ij.field_i;
                        stackIn_47_0 = stackOut_46_0;
                        return stackIn_47_0;
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
            stackOut_54_0 = (RuntimeException) var2;
            stackOut_54_1 = new StringBuilder().append("we.C(");
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param0 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L6;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + ',' + 34 + ')');
        }
    }

    final static void a(int param0, String param1) {
        try {
            ia.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "we.E(" + -119 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
