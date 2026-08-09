/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends ip {
    static cn[] field_o;
    static int field_p;
    private be field_q;
    private String field_m;
    static int field_n;
    static cn field_r;
    private boolean field_s;

    public static void d(byte param0) {
        field_r = null;
        if (param0 != 75) {
            field_o = (cn[]) null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_q.a(param1, 65) == pd.field_J) {
              stackIn_3_0 = this.field_q.a((byte) 96, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.a(param1, 60) != pd.field_J) {
                L1: {
                  if (param0 >= 44) {
                    break L1;
                  } else {
                    var4 = (String) null;
                    this.a((byte) 49, (String) null);
                    break L1;
                  }
                }
                stackIn_10_0 = sh.field_b;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = pj.field_n;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("ga.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final od a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        me var4 = null;
        od stackIn_2_0 = null;
        od stackIn_7_0 = null;
        od stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -10 / ((5 - param1) / 44);
            if (this.field_q.a(param0, 104) != pd.field_J) {
              L1: {
                if (!param0.equals(this.field_m)) {
                  var4 = gk.a(-115, param0);
                  if (var4.b(36)) {
                    this.field_m = param0;
                    this.field_s = var4.a((byte) 109);
                    break L1;
                  } else {
                    stackIn_7_0 = oc.field_A;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (this.field_s) {
                  stackIn_12_0 = c.field_d;
                  break L2;
                } else {
                  stackIn_12_0 = pd.field_J;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = pd.field_J;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("ga.C(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final static java.awt.Frame a(qg param0, int param1, int param2, int param3, int param4, int param5) {
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_34_0 = null;
        java.awt.Frame stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ki[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        ki[] var10 = null;
        pn var11 = null;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0.a(50)) {
              L1: {
                if (param2 == 0) {
                  var10 = kc.a(param0, 10);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var10.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackIn_24_0 = null;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        L3: {
                          if (param1 != var10[var8].field_g) {
                            break L3;
                          } else {
                            if (var10[var8].field_d != param5) {
                              break L3;
                            } else {
                              L4: {
                                if (param3 == 0) {
                                  break L4;
                                } else {
                                  if (var10[var8].field_a != param3) {
                                    break L3;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_b > param2) {
                                    break L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              param2 = var10[var8].field_b;
                              var7_int = 1;
                              break L3;
                            }
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackIn_8_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              L6: {
                var11 = param0.a((byte) -102, param3, param1, param2, param5);
                if (param4 > 99) {
                  break L6;
                } else {
                  field_o = (cn[]) null;
                  break L6;
                }
              }
              L7: while (true) {
                if (-1 != (var11.field_c ^ -1)) {
                  var7 = (java.awt.Frame) (var11.field_f);
                  if (var7 != null) {
                    if (2 != var11.field_c) {
                      stackIn_36_0 = (java.awt.Frame) (var7);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      ng.a(param0, 48, var7);
                      stackIn_34_0 = null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_31_0 = null;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  pj.a(0, 10L);
                  continue L7;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6_ref = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var6_ref);

            stackIn_39_1 = new StringBuilder().append("ga.B(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L8;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L8;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_8_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_24_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.awt.Frame) ((Object) stackIn_31_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (java.awt.Frame) ((Object) stackIn_34_0);
                } else {
                  return stackIn_36_0;
                }
              }
            }
          }
        }
    }

    ga(rm param0, rm param1) {
        super(param0);
        this.field_m = "";
        this.field_s = false;
        try {
            this.field_q = new be(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = 250;
        field_n = 1;
    }
}
