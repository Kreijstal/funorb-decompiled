/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kha {
    static String field_a;
    int field_d;
    int[] field_c;
    int field_b;

    final int a(boolean param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            this.field_d = -57;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_c == null) {
              break L2;
            } else {
              if (0 == this.field_c.length) {
                break L2;
              } else {
                stackIn_6_0 = this.field_c[-1 + this.field_c.length];
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_c == null || 0 == this.field_c.length) {
            return 0;
        }
        for (var3 = 1; var3 < this.field_c.length; var3++) {
            if ((param0 ^ -1) > (this.field_c[var3 - 1] - -this.field_c[var3] >> 1614274689 ^ -1)) {
                return var3 + -1;
            }
        }
        if (param1 != -1) {
            field_a = (String) null;
        }
        return -1 + this.field_c.length;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
            field_a = (String) null;
        }
    }

    final static java.awt.Frame a(fia param0, int param1, int param2, int param3, int param4, int param5) {
        Object stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_32_0 = null;
        java.awt.Frame stackIn_35_0 = null;
        Object stackIn_38_0 = null;
        java.awt.Frame stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dh[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        dh[] var10 = null;
        naa var11 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0.a((byte) 69)) {
              L1: {
                if (param4 != 0) {
                  break L1;
                } else {
                  var10 = af.a(66, param0);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackIn_26_0 = null;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        if (var10[var8].field_a == param5) {
                          L3: {
                            if (param2 == var10[var8].field_c) {
                              L4: {
                                if (-1 == (param1 ^ -1)) {
                                  break L4;
                                } else {
                                  if (var10[var8].field_b == param1) {
                                    break L4;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_d > param4) {
                                    break L5;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                              var7_int = 1;
                              param4 = var10[var8].field_d;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          var8++;
                          continue L2;
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    stackIn_7_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var11 = param0.a(param4, param1, param2, (byte) 66, param5);
              L6: while (true) {
                if (var11.field_b != 0) {
                  var7 = (java.awt.Frame) (var11.field_f);
                  if (var7 != null) {
                    if (param3 == 10) {
                      if ((var11.field_b ^ -1) != -3) {
                        stackIn_40_0 = (java.awt.Frame) (var7);
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        vf.a(31637, param0, var7);
                        stackIn_38_0 = null;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_35_0 = (java.awt.Frame) null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_32_0 = null;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  vja.a(0, 10L);
                  continue L6;
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
          L7: {
            var6_ref = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var6_ref);

            stackIn_43_1 = new StringBuilder().append("kha.A(");

            if (param0 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L7;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_7_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_26_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.awt.Frame) ((Object) stackIn_32_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_35_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (java.awt.Frame) ((Object) stackIn_38_0);
                  } else {
                    return stackIn_40_0;
                  }
                }
              }
            }
          }
        }
    }

    static int b(int param0, int param1) {
        return param0 ^ param1;
    }

    kha(int param0, int param1, int param2) {
        this.field_b = param1;
        this.field_d = param0;
        this.field_c = new int[param2 + 1];
    }

    static {
        field_a = "500+";
    }
}
