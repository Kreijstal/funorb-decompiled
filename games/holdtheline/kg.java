/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private mg[] field_d;
    private boolean field_c;
    static e field_a;
    private int field_b;
    private String field_f;
    private boolean field_e;

    public static void a() {
        field_a = null;
        int var1 = 0;
    }

    final static int a(byte param0, vk param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            if (param1.field_r) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param1.field_j == null) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                L1: {
                  if (param0 >= 6) {
                    break L1;
                  } else {
                    var6 = null;
                    int discarded$1 = kg.a((byte) 14, (vk) null);
                    break L1;
                  }
                }
                L2: {
                  var2_int = 0;
                  if (0 != param1.field_o) {
                    if (param1.field_o == 1) {
                      L3: {
                        if (!a.field_F.b((byte) 10)) {
                          break L3;
                        } else {
                          var2_int += 16;
                          break L3;
                        }
                      }
                      if (hf.field_h.b((byte) 10)) {
                        var2_int += 16;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      if (2 != param1.field_o) {
                        if (param1.field_o == 3) {
                          L4: {
                            if (!kc.field_b.b((byte) 10)) {
                              break L4;
                            } else {
                              var2_int += 16;
                              break L4;
                            }
                          }
                          if (!ug.field_b.b((byte) 10)) {
                            break L2;
                          } else {
                            var2_int += 16;
                            break L2;
                          }
                        } else {
                          if (4 != param1.field_o) {
                            if (5 != param1.field_o) {
                              if (param1.field_o == 6) {
                                L5: {
                                  if (hg.field_Q.b((byte) 10)) {
                                    var2_int += 16;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                if (fd.field_e.b((byte) 10)) {
                                  var2_int += 16;
                                  break L2;
                                } else {
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            } else {
                              L6: {
                                if (!ha.field_i.b((byte) 10)) {
                                  break L6;
                                } else {
                                  var2_int += 16;
                                  break L6;
                                }
                              }
                              if (!kc.field_b.b((byte) 10)) {
                                break L2;
                              } else {
                                var2_int += 16;
                                break L2;
                              }
                            }
                          } else {
                            L7: {
                              if (ug.field_b.b((byte) 10)) {
                                var2_int += 16;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            if (ha.field_i.b((byte) 10)) {
                              var2_int += 16;
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                      } else {
                        L8: {
                          if (a.field_F.b((byte) 10)) {
                            var2_int += 16;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        if (!lk.field_a.b((byte) 10)) {
                          break L2;
                        } else {
                          var2_int += 16;
                          break L2;
                        }
                      }
                    }
                  } else {
                    L9: {
                      if (ol.field_h.b((byte) 10)) {
                        var2_int += 16;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (!fd.field_e.b((byte) 10)) {
                      break L2;
                    } else {
                      var2_int += 16;
                      break L2;
                    }
                  }
                }
                var3 = 0;
                var4 = 0;
                L10: while (true) {
                  if (param1.field_j.length <= var4) {
                    var2_int = var2_int + var3 * 224 / param1.field_j.length;
                    stackOut_63_0 = var2_int;
                    stackIn_64_0 = stackOut_63_0;
                    break L0;
                  } else {
                    L11: {
                      if (param1.field_j[var4].field_c) {
                        var3++;
                        var4++;
                        break L11;
                      } else {
                        var4++;
                        break L11;
                      }
                    }
                    var4++;
                    continue L10;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var2;
            stackOut_65_1 = new StringBuilder().append("kg.B(").append(param0).append(',');
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param1 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L12;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L12;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + ')');
        }
        return stackIn_64_0;
    }

    final mg[] a(int param0) {
        hj[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        hj[] var5 = null;
        hj[] var6 = null;
        hj[] var7 = null;
        var4 = HoldTheLine.field_D;
        if (param0 == 16) {
          if (((kg) this).field_d == null) {
            var7 = le.a(((kg) this).field_f, -120);
            var5 = var7;
            var2 = var5;
            if (var2 == null) {
              return ((kg) this).field_d;
            } else {
              ((kg) this).field_d = new mg[var7.length];
              var3 = 0;
              L0: while (true) {
                if (var7.length <= var3) {
                  return ((kg) this).field_d;
                } else {
                  ((kg) this).field_d[var3] = new mg(var7[var3], ((kg) this).field_b, ((kg) this).field_c, ((kg) this).field_e);
                  var3++;
                  continue L0;
                }
              }
            }
          } else {
            return ((kg) this).field_d;
          }
        } else {
          ((kg) this).field_d = null;
          if (((kg) this).field_d == null) {
            var6 = le.a(((kg) this).field_f, -120);
            var5 = var6;
            var2 = var5;
            if (var2 != null) {
              ((kg) this).field_d = new mg[var6.length];
              var3 = 0;
              L1: while (true) {
                if (var6.length > var3) {
                  ((kg) this).field_d[var3] = new mg(var6[var3], ((kg) this).field_b, ((kg) this).field_c, ((kg) this).field_e);
                  var3++;
                  continue L1;
                } else {
                  return ((kg) this).field_d;
                }
              }
            } else {
              return ((kg) this).field_d;
            }
          } else {
            return ((kg) this).field_d;
          }
        }
    }

    kg(String param0) {
        try {
            ((kg) this).field_d = null;
            ((kg) this).field_b = 4096;
            ((kg) this).field_c = false;
            ((kg) this).field_f = param0;
            ((kg) this).field_e = false;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "kg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    kg(String param0, boolean param1, boolean param2) {
        try {
            ((kg) this).field_f = param0;
            ((kg) this).field_d = null;
            ((kg) this).field_b = 4096;
            ((kg) this).field_e = param2 ? true : false;
            ((kg) this).field_c = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "kg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new e(9, 0, 4, 1);
    }
}
