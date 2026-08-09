/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static String[] field_b;
    int field_a;
    private fr field_c;
    static String field_d;
    static boolean field_e;

    protected final void finalize() throws Throwable {
        this.field_c.a(this.field_a, (byte) 113);
        super.finalize();
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, boolean param6) {
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
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
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param4 > param5) {
              if (param3 > 1 + param5) {
                L1: {
                  if (param3 <= param5 - -5) {
                    break L1;
                  } else {
                    if (param0 == param1) {
                      break L1;
                    } else {
                      var7_int = (param0 & param1 & 1) + (param0 >> 429166529) - -(param1 >> 1439930241);
                      var8 = param5;
                      var9 = param1;
                      var10 = param0;
                      var11 = param5;
                      L2: while (true) {
                        if (param3 <= var11) {
                          vk.a(var9, param1, param2, var8, param4, param5, param6);
                          vk.a(param0, var10, (byte) -107, param3, param4, var8, param6);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var12 = pd.field_q[var11];
                            if (!param6) {
                              stackIn_23_0 = uc.field_c[var12];
                              break L3;
                            } else {
                              stackIn_23_0 = lj.field_a[var12];
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_23_0;
                            if (var13 <= var7_int) {
                              if (var13 > var10) {
                                var10 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              L5: {
                                pd.field_q[var11] = pd.field_q[var8];
                                if (var13 < var9) {
                                  var9 = var13;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              incrementValue$0 = var8;
                              var8++;
                              pd.field_q[incrementValue$0] = var12;
                              break L4;
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                var7_int = -1 + param3;
                L6: while (true) {
                  if (var7_int <= param5) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param5;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = pd.field_q[var8];
                          var10 = pd.field_q[1 + var8];
                          if (jl.a(var10, var9, param6, (byte) 98)) {
                            pd.field_q[var8] = var10;
                            pd.field_q[var8 + 1] = var9;
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
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var7), "vk.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    final static void a(int param0) {
        if (param0 > -31) {
            vk.a(-31);
        }
        qr.field_c = new jn();
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 429166529) {
            vk.a(100, 10, (byte) 96, 17, -1, -25, true);
        }
        field_d = null;
    }

    vk(fr param0, int param1, int param2) {
        try {
            this.field_a = param2;
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "vk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = new String[]{"Placing enemies...", "Placing terrain..."};
        field_d = null;
    }
}
