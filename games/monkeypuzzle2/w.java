/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w {
    static cj field_c;
    static le[] field_b;
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3) {
        ki.field_s = param0;
        lc.field_e = param2;
        qj.field_D = param1;
        if (param3 != -21734) {
            de var5 = (de) null;
            w.a(-62, 77, (de) null);
        }
    }

    final static void a(int param0, int param1, de param2) {
        hb var3 = null;
        try {
            var3 = gf.field_c;
            var3.b(true, param1);
            if (param0 > -69) {
                field_b = (le[]) null;
            }
            var3.b(5, -49152);
            var3.b(0, -49152);
            var3.c(param2.field_k, 85);
            var3.b(param2.field_h, -49152);
            var3.b(param2.field_e, -49152);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "w.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 >= -8) {
            field_b = (le[]) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param6 <= param3) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (1 + param3 >= param2) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param3 - -5 >= param2) {
                    break L1;
                  } else {
                    if (param1 != param5) {
                      var7_int = (param1 >> 1567357409) + ((param5 >> -1898454591) + (1 & (param1 & param5)));
                      var8 = param3;
                      var9 = param1;
                      var10 = param5;
                      var11 = param3;
                      L2: while (true) {
                        if (param2 <= var11) {
                          L3: {
                            if (param0 < -65) {
                              break L3;
                            } else {
                              w.a(-28, 119);
                              break L3;
                            }
                          }
                          w.a((byte) -80, param1, var8, param3, param4, var9, param6);
                          w.a((byte) -74, var10, param2, var8, param4, param5, param6);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L4: {
                            var12 = hl.field_f[var11];
                            if (param4) {
                              stackIn_26_0 = gi.field_e[var12];
                              break L4;
                            } else {
                              stackIn_26_0 = cj.field_c[var12];
                              break L4;
                            }
                          }
                          L5: {
                            var13 = stackIn_26_0;
                            if (var13 > var7_int) {
                              hl.field_f[var11] = hl.field_f[var8];
                              incrementValue$0 = var8;
                              var8++;
                              hl.field_f[incrementValue$0] = var12;
                              if (var9 <= var13) {
                                break L5;
                              } else {
                                var9 = var13;
                                break L5;
                              }
                            } else {
                              if (var10 < var13) {
                                var10 = var13;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = param2 + -1;
                L6: while (true) {
                  if (var7_int <= param3) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param3;
                    L7: while (true) {
                      if (var7_int <= var8) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = hl.field_f[var8];
                          var10 = hl.field_f[var8 - -1];
                          if (e.a(param4, var10, var9, (byte) 126)) {
                            hl.field_f[var8] = var10;
                            hl.field_f[var8 - -1] = var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var7), "w.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static int a(int param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -18694) {
                break L1;
              } else {
                w.a(-3, 81, 26, 15);
                break L1;
              }
            }
            stackIn_3_0 = rc.a(0, param0, 40, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("w.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1) {
        L0: {
          ol.field_e = param1;
          if (null != vl.field_h) {
            vl.field_h.a(ol.field_e * 80 / 256);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -1) {
          w.a((byte) -106, -49, -97, -73, false, 7, -74);
          return;
        } else {
          return;
        }
    }

    static {
        field_a = "Checking";
    }
}
