/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kha {
    static String field_a;
    int field_d;
    int[] field_c;
    int field_b;

    final int a(boolean param0) {
        if (param0) {
          if (this.field_c != null) {
            if (0 == this.field_c.length) {
              return 0;
            } else {
              return this.field_c[-1 + this.field_c.length];
            }
          } else {
            return 0;
          }
        } else {
          this.field_d = -57;
          if (this.field_c != null) {
            if (0 == this.field_c.length) {
              return 0;
            } else {
              return this.field_c[-1 + this.field_c.length];
            }
          } else {
            return 0;
          }
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_c != null) {
          if (0 != this.field_c.length) {
            var3 = 1;
            L0: while (true) {
              L1: {
                if (var3 >= this.field_c.length) {
                  break L1;
                } else {
                  var6 = this.field_c[var3 - 1] - -this.field_c[var3] >> 1614274689 ^ -1;
                  var5 = param0 ^ -1;
                  if (var4 != 0) {
                    if (var5 != var6) {
                      field_a = (String) null;
                      return -1 + this.field_c.length;
                    } else {
                      return -1 + this.field_c.length;
                    }
                  } else {
                    if (var5 <= var6) {
                      var3++;
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    } else {
                      return var3 + -1;
                    }
                  }
                }
              }
              if (param1 != -1) {
                field_a = (String) null;
                return -1 + this.field_c.length;
              } else {
                return -1 + this.field_c.length;
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
            field_a = (String) null;
        }
    }

    final static java.awt.Frame a(fia param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        dh[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        dh[] var10 = null;
        naa var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_11_0 = 0;
        int stackIn_23_0 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_31_0 = null;
        java.awt.Frame stackIn_34_0 = null;
        Object stackIn_37_0 = null;
        java.awt.Frame stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_22_0 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_6_0 = null;
        java.awt.Frame stackOut_38_0 = null;
        Object stackOut_36_0 = null;
        java.awt.Frame stackOut_33_0 = null;
        Object stackOut_30_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0.a((byte) 69)) {
              L1: {
                if (param4 != 0) {
                  break L1;
                } else {
                  var10 = af.a(66, param0);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var8 >= var10.length) {
                            break L4;
                          } else {
                            stackOut_10_0 = var10[var8].field_a;
                            stackIn_23_0 = stackOut_10_0;
                            stackIn_11_0 = stackOut_10_0;
                            if (var9 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_11_0 != param5) {
                                  break L5;
                                } else {
                                  if (param2 == var10[var8].field_c) {
                                    L6: {
                                      if (-1 == (param1 ^ -1)) {
                                        break L6;
                                      } else {
                                        if (var10[var8].field_b != param1) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    L7: {
                                      if (var7_int == 0) {
                                        break L7;
                                      } else {
                                        if (var10[var8].field_d <= param4) {
                                          break L5;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var7_int = 1;
                                    param4 = var10[var8].field_d;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var8++;
                              if (var9 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackOut_22_0 = var7_int;
                        stackIn_23_0 = stackOut_22_0;
                        break L3;
                      }
                      if (stackIn_23_0 != 0) {
                        break L1;
                      } else {
                        stackOut_24_0 = null;
                        stackIn_25_0 = stackOut_24_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var11 = param0.a(param4, param1, param2, (byte) 66, param5);
              L8: while (true) {
                L9: {
                  if (var11.field_b != 0) {
                    break L9;
                  } else {
                    vja.a(0, 10L);
                    if (var9 == 0) {
                      continue L8;
                    } else {
                      break L9;
                    }
                  }
                }
                var7 = (java.awt.Frame) (var11.field_f);
                if (var7 != null) {
                  if (param3 == 10) {
                    if ((var11.field_b ^ -1) != -3) {
                      stackOut_38_0 = (java.awt.Frame) (var7);
                      stackIn_39_0 = stackOut_38_0;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      vf.a(31637, param0, var7);
                      stackOut_36_0 = null;
                      stackIn_37_0 = stackOut_36_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    stackOut_33_0 = (java.awt.Frame) null;
                    stackIn_34_0 = stackOut_33_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  stackOut_30_0 = null;
                  stackIn_31_0 = stackOut_30_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var6);
            stackOut_40_1 = new StringBuilder().append("kha.A(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L10;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_7_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_25_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.awt.Frame) ((Object) stackIn_31_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_34_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (java.awt.Frame) ((Object) stackIn_37_0);
                  } else {
                    return stackIn_39_0;
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
