/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mm {
    int field_f;
    int field_c;
    static ji[] field_a;
    static float field_d;
    static ah field_e;
    int[] field_h;
    java.awt.Image field_b;
    static String field_g;

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    public static void b() {
        field_e = null;
        field_g = null;
        field_a = null;
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final static boolean a(vk param0) {
        RuntimeException var2 = null;
        wm var3 = null;
        int var4 = 0;
        int var5 = 0;
        ei var6 = null;
        int stackIn_6_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_87_0 = 0;
        vk stackIn_93_0 = null;
        int stackIn_97_0 = 0;
        int stackIn_100_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_78_0 = 0;
        vk stackOut_91_0 = null;
        int stackOut_65_0 = 0;
        int stackOut_68_0 = 0;
        vk stackOut_90_0 = null;
        int stackOut_56_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_47_0 = 0;
        vk stackOut_89_0 = null;
        int stackOut_43_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_36_0 = 0;
        vk stackOut_88_0 = null;
        int stackOut_99_0 = 0;
        int stackOut_96_0 = 0;
        vk stackOut_92_0 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            if (param0.field_r) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              L1: {
                if (param0.field_j != null) {
                  break L1;
                } else {
                  var6 = new ei();
                  var3 = (wm) (Object) param0.field_m.b((byte) 85);
                  L2: while (true) {
                    if (var3 == null) {
                      var3 = (wm) (Object) param0.field_k.b((byte) 101);
                      L3: while (true) {
                        if (var3 == null) {
                          param0.field_j = new om[var6.field_e];
                          var4 = 0;
                          L4: while (true) {
                            if (var6.field_e <= var4) {
                              param0.field_n = 0;
                              break L1;
                            } else {
                              param0.field_j[var4] = (om) var6.field_b[var4];
                              var4++;
                              continue L4;
                            }
                          }
                        } else {
                          var4 = 0;
                          L5: while (true) {
                            L6: {
                              if (var4 >= var6.field_e) {
                                var6.a((Object) (Object) var3.field_E, (byte) 6);
                                break L6;
                              } else {
                                if (var6.field_b[var4] != (Object) (Object) var3.field_E) {
                                  var4++;
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var3 = (wm) (Object) param0.field_k.c((byte) 105);
                            continue L3;
                          }
                        }
                      }
                    } else {
                      var4 = 0;
                      L7: while (true) {
                        L8: {
                          if (var4 >= var6.field_e) {
                            var6.a((Object) (Object) var3.field_E, (byte) 6);
                            break L8;
                          } else {
                            if (var6.field_b[var4] != (Object) (Object) var3.field_E) {
                              var4++;
                              continue L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var3 = (wm) (Object) param0.field_m.c((byte) -70);
                        continue L2;
                      }
                    }
                  }
                }
              }
              L9: {
                L10: {
                  if (param0.field_o != 0) {
                    if (param0.field_o != 1) {
                      L11: {
                        if (2 != param0.field_o) {
                          if (param0.field_o != 3) {
                            L12: {
                              if (param0.field_o != 4) {
                                L13: {
                                  if (param0.field_o == 5) {
                                    if (null == ha.field_i.a(8192)) {
                                      stackOut_82_0 = 0;
                                      stackIn_83_0 = stackOut_82_0;
                                      return stackIn_83_0 != 0;
                                    } else {
                                      if (null == kc.field_b.a(8192)) {
                                        stackOut_86_0 = 0;
                                        stackIn_87_0 = stackOut_86_0;
                                        return stackIn_87_0 != 0;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  } else {
                                    if (param0.field_o == 6) {
                                      if (hg.field_Q.a(8192) == null) {
                                        stackOut_75_0 = 0;
                                        stackIn_76_0 = stackOut_75_0;
                                        return stackIn_76_0 != 0;
                                      } else {
                                        if (null != fd.field_e.a(8192)) {
                                          break L13;
                                        } else {
                                          stackOut_78_0 = 0;
                                          stackIn_79_0 = stackOut_78_0;
                                          return stackIn_79_0 != 0;
                                        }
                                      }
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                stackOut_91_0 = (vk) param0;
                                stackIn_93_0 = stackOut_91_0;
                                break L9;
                              } else {
                                if (ug.field_b.a(8192) == null) {
                                  stackOut_65_0 = 0;
                                  stackIn_66_0 = stackOut_65_0;
                                  return stackIn_66_0 != 0;
                                } else {
                                  if (ha.field_i.a(8192) != null) {
                                    break L12;
                                  } else {
                                    stackOut_68_0 = 0;
                                    stackIn_69_0 = stackOut_68_0;
                                    return stackIn_69_0 != 0;
                                  }
                                }
                              }
                            }
                            stackOut_90_0 = (vk) param0;
                            stackIn_93_0 = stackOut_90_0;
                            break L9;
                          } else {
                            if (null == kc.field_b.a(8192)) {
                              stackOut_56_0 = 0;
                              stackIn_57_0 = stackOut_56_0;
                              return stackIn_57_0 != 0;
                            } else {
                              if (null == ug.field_b.a(8192)) {
                                stackOut_60_0 = 0;
                                stackIn_61_0 = stackOut_60_0;
                                return stackIn_61_0 != 0;
                              } else {
                                break L11;
                              }
                            }
                          }
                        } else {
                          if (a.field_F.a(8192) != null) {
                            if (lk.field_a.a(8192) == null) {
                              stackOut_51_0 = 0;
                              stackIn_52_0 = stackOut_51_0;
                              return stackIn_52_0 != 0;
                            } else {
                              break L11;
                            }
                          } else {
                            stackOut_47_0 = 0;
                            stackIn_48_0 = stackOut_47_0;
                            return stackIn_48_0 != 0;
                          }
                        }
                      }
                      stackOut_89_0 = (vk) param0;
                      stackIn_93_0 = stackOut_89_0;
                      break L9;
                    } else {
                      if (a.field_F.a(8192) != null) {
                        if (hf.field_h.a(8192) != null) {
                          break L10;
                        } else {
                          stackOut_43_0 = 0;
                          stackIn_44_0 = stackOut_43_0;
                          return stackIn_44_0 != 0;
                        }
                      } else {
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        return stackIn_41_0 != 0;
                      }
                    }
                  } else {
                    if (null == ol.field_h.a(8192)) {
                      stackOut_33_0 = 0;
                      stackIn_34_0 = stackOut_33_0;
                      return stackIn_34_0 != 0;
                    } else {
                      if (fd.field_e.a(8192) != null) {
                        break L10;
                      } else {
                        stackOut_36_0 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        return stackIn_37_0 != 0;
                      }
                    }
                  }
                }
                stackOut_88_0 = (vk) param0;
                stackIn_93_0 = stackOut_88_0;
                break L9;
              }
              L14: while (true) {
                if (~stackIn_93_0.field_j.length >= ~param0.field_n) {
                  stackOut_99_0 = 1;
                  stackIn_100_0 = stackOut_99_0;
                  break L0;
                } else {
                  if (!param0.field_j[param0.field_n].b((byte) 48)) {
                    stackOut_96_0 = 0;
                    stackIn_97_0 = stackOut_96_0;
                    return stackIn_97_0 != 0;
                  } else {
                    param0.field_n = param0.field_n + 1;
                    stackOut_92_0 = (vk) param0;
                    stackIn_93_0 = stackOut_92_0;
                    continue L14;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var2 = decompiledCaughtException;
            stackOut_101_0 = (RuntimeException) var2;
            stackOut_101_1 = new StringBuilder().append("mm.F(");
            stackIn_103_0 = stackOut_101_0;
            stackIn_103_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param0 == null) {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "null";
              stackIn_104_0 = stackOut_103_0;
              stackIn_104_1 = stackOut_103_1;
              stackIn_104_2 = stackOut_103_2;
              break L15;
            } else {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "{...}";
              stackIn_104_0 = stackOut_102_0;
              stackIn_104_1 = stackOut_102_1;
              stackIn_104_2 = stackOut_102_2;
              break L15;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_104_0, stackIn_104_2 + 44 + -65 + 41);
        }
        return stackIn_100_0 != 0;
    }

    final static sh a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        sh stackIn_3_0 = null;
        sh stackIn_7_0 = null;
        sh stackIn_13_0 = null;
        int stackIn_21_0 = 0;
        sh stackIn_26_0 = null;
        sh stackIn_39_0 = null;
        sh stackIn_43_0 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        sh stackOut_6_0 = null;
        sh stackOut_12_0 = null;
        sh stackOut_25_0 = null;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        sh stackOut_42_0 = null;
        sh stackOut_38_0 = null;
        sh stackOut_2_0 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var6 = HoldTheLine.field_D;
        try {
          var2_int = param0.length();
          if (var2_int != 0) {
            if (var2_int > 64) {
              stackOut_6_0 = wb.field_h;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (34 == param0.charAt(0)) {
                if (34 != param0.charAt(-1 + var2_int)) {
                  stackOut_12_0 = qj.field_F;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  var3 = 0;
                  var4 = 1;
                  L0: while (true) {
                    if (var4 < -1 + var2_int) {
                      L1: {
                        var5 = param0.charAt(var4);
                        if (var5 != 92) {
                          L2: {
                            if (var5 != 34) {
                              break L2;
                            } else {
                              if (var3 == 0) {
                                stackOut_25_0 = qj.field_F;
                                stackIn_26_0 = stackOut_25_0;
                                return stackIn_26_0;
                              } else {
                                break L2;
                              }
                            }
                          }
                          var3 = 0;
                          break L1;
                        } else {
                          L3: {
                            if (var3 != 0) {
                              stackOut_20_0 = 0;
                              stackIn_21_0 = stackOut_20_0;
                              break L3;
                            } else {
                              stackOut_19_0 = 1;
                              stackIn_21_0 = stackOut_19_0;
                              break L3;
                            }
                          }
                          var3 = stackIn_21_0;
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
                  if (var4 < var2_int) {
                    L5: {
                      var5 = param0.charAt(var4);
                      if (var5 != 46) {
                        if (-1 != qk.field_I.indexOf(var5)) {
                          var3 = 0;
                          break L5;
                        } else {
                          stackOut_42_0 = qj.field_F;
                          stackIn_43_0 = stackOut_42_0;
                          return stackIn_43_0;
                        }
                      } else {
                        L6: {
                          if (var4 == 0) {
                            break L6;
                          } else {
                            if (var4 == var2_int - 1) {
                              break L6;
                            } else {
                              if (var3 == 0) {
                                var3 = 1;
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        stackOut_38_0 = qj.field_F;
                        stackIn_39_0 = stackOut_38_0;
                        return stackIn_39_0;
                      }
                    }
                    var4++;
                    continue L4;
                  } else {
                    return null;
                  }
                }
              }
            }
          } else {
            stackOut_2_0 = fo.field_k;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var2;
            stackOut_47_1 = new StringBuilder().append("mm.B(");
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L7;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L7;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + 44 + 34 + 41);
        }
    }

    final void a(boolean param0) {
        if (param0) {
            field_d = -1.6866915225982666f;
        }
        tc.a(((mm) this).field_h, ((mm) this).field_f, ((mm) this).field_c);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ah();
        field_g = "Unpacking graphics";
    }
}
