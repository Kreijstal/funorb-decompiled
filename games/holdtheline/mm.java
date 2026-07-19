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

    public static void b(boolean param0) {
        field_e = null;
        if (param0) {
            field_e = (ah) null;
        }
        field_g = null;
        field_a = null;
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final static boolean a(vk param0, int param1) {
        RuntimeException var2 = null;
        wm var3 = null;
        int var4 = 0;
        int var5 = 0;
        ei var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_88_0 = 0;
        vk stackIn_94_0 = null;
        int stackIn_98_0 = 0;
        int stackIn_101_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_79_0 = 0;
        vk stackOut_92_0 = null;
        int stackOut_66_0 = 0;
        int stackOut_69_0 = 0;
        vk stackOut_91_0 = null;
        int stackOut_57_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_48_0 = 0;
        vk stackOut_90_0 = null;
        int stackOut_44_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_37_0 = 0;
        vk stackOut_89_0 = null;
        int stackOut_100_0 = 0;
        int stackOut_97_0 = 0;
        vk stackOut_93_0 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        int stackOut_2_0 = 0;
        var5 = HoldTheLine.field_D;
        if (param1 == -65) {
          try {
            L0: {
              if (param0.field_r) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L1: {
                  if (param0.field_j != null) {
                    break L1;
                  } else {
                    var6 = new ei();
                    var3 = (wm) ((Object) param0.field_m.b((byte) 85));
                    L2: while (true) {
                      if (var3 == null) {
                        var3 = (wm) ((Object) param0.field_k.b((byte) 101));
                        L3: while (true) {
                          if (var3 == null) {
                            param0.field_j = new om[var6.field_e];
                            var4 = 0;
                            L4: while (true) {
                              if (var6.field_e <= var4) {
                                param0.field_n = 0;
                                break L1;
                              } else {
                                param0.field_j[var4] = (om) (var6.field_b[var4]);
                                var4++;
                                continue L4;
                              }
                            }
                          } else {
                            var4 = 0;
                            L5: while (true) {
                              L6: {
                                if (var4 >= var6.field_e) {
                                  var6.a(var3.field_E, (byte) 6);
                                  break L6;
                                } else {
                                  if (var6.field_b[var4] != var3.field_E) {
                                    var4++;
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var3 = (wm) ((Object) param0.field_k.c((byte) 105));
                              continue L3;
                            }
                          }
                        }
                      } else {
                        var4 = 0;
                        L7: while (true) {
                          L8: {
                            if (var4 >= var6.field_e) {
                              var6.a(var3.field_E, (byte) 6);
                              break L8;
                            } else {
                              if (var6.field_b[var4] != var3.field_E) {
                                var4++;
                                continue L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3 = (wm) ((Object) param0.field_m.c((byte) -70));
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
                            if ((param0.field_o ^ -1) != -4) {
                              L12: {
                                if (param0.field_o != 4) {
                                  L13: {
                                    if ((param0.field_o ^ -1) == -6) {
                                      if (null == ha.field_i.a(8192)) {
                                        stackOut_83_0 = 0;
                                        stackIn_84_0 = stackOut_83_0;
                                        decompiledRegionSelector0 = 13;
                                        break L0;
                                      } else {
                                        if (null == kc.field_b.a(8192)) {
                                          stackOut_87_0 = 0;
                                          stackIn_88_0 = stackOut_87_0;
                                          decompiledRegionSelector0 = 14;
                                          break L0;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    } else {
                                      if (-7 == (param0.field_o ^ -1)) {
                                        if (hg.field_Q.a(param1 ^ -8257) == null) {
                                          stackOut_76_0 = 0;
                                          stackIn_77_0 = stackOut_76_0;
                                          decompiledRegionSelector0 = 11;
                                          break L0;
                                        } else {
                                          if (null != fd.field_e.a(8192)) {
                                            break L13;
                                          } else {
                                            stackOut_79_0 = 0;
                                            stackIn_80_0 = stackOut_79_0;
                                            decompiledRegionSelector0 = 12;
                                            break L0;
                                          }
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  stackOut_92_0 = (vk) (param0);
                                  stackIn_94_0 = stackOut_92_0;
                                  break L9;
                                } else {
                                  if (ug.field_b.a(8192) == null) {
                                    stackOut_66_0 = 0;
                                    stackIn_67_0 = stackOut_66_0;
                                    decompiledRegionSelector0 = 9;
                                    break L0;
                                  } else {
                                    if (ha.field_i.a(8192) != null) {
                                      break L12;
                                    } else {
                                      stackOut_69_0 = 0;
                                      stackIn_70_0 = stackOut_69_0;
                                      decompiledRegionSelector0 = 10;
                                      break L0;
                                    }
                                  }
                                }
                              }
                              stackOut_91_0 = (vk) (param0);
                              stackIn_94_0 = stackOut_91_0;
                              break L9;
                            } else {
                              if (null == kc.field_b.a(8192)) {
                                stackOut_57_0 = 0;
                                stackIn_58_0 = stackOut_57_0;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              } else {
                                if (null == ug.field_b.a(8192)) {
                                  stackOut_61_0 = 0;
                                  stackIn_62_0 = stackOut_61_0;
                                  decompiledRegionSelector0 = 8;
                                  break L0;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          } else {
                            if (a.field_F.a(8192) != null) {
                              if (lk.field_a.a(8192) == null) {
                                stackOut_52_0 = 0;
                                stackIn_53_0 = stackOut_52_0;
                                decompiledRegionSelector0 = 6;
                                break L0;
                              } else {
                                break L11;
                              }
                            } else {
                              stackOut_48_0 = 0;
                              stackIn_49_0 = stackOut_48_0;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            }
                          }
                        }
                        stackOut_90_0 = (vk) (param0);
                        stackIn_94_0 = stackOut_90_0;
                        break L9;
                      } else {
                        if (a.field_F.a(param1 + 8257) != null) {
                          if (hf.field_h.a(8192) != null) {
                            break L10;
                          } else {
                            stackOut_44_0 = 0;
                            stackIn_45_0 = stackOut_44_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        } else {
                          stackOut_41_0 = 0;
                          stackIn_42_0 = stackOut_41_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    } else {
                      if (null == ol.field_h.a(param1 ^ -8257)) {
                        stackOut_34_0 = 0;
                        stackIn_35_0 = stackOut_34_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        if (fd.field_e.a(param1 ^ -8257) != null) {
                          break L10;
                        } else {
                          stackOut_37_0 = 0;
                          stackIn_38_0 = stackOut_37_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  stackOut_89_0 = (vk) (param0);
                  stackIn_94_0 = stackOut_89_0;
                  break L9;
                }
                L14: while (true) {
                  if (stackIn_94_0.field_j.length <= param0.field_n) {
                    stackOut_100_0 = 1;
                    stackIn_101_0 = stackOut_100_0;
                    decompiledRegionSelector0 = 16;
                    break L0;
                  } else {
                    if (!param0.field_j[param0.field_n].b((byte) 48)) {
                      stackOut_97_0 = 0;
                      stackIn_98_0 = stackOut_97_0;
                      decompiledRegionSelector0 = 15;
                      break L0;
                    } else {
                      param0.field_n = param0.field_n + 1;
                      stackOut_93_0 = (vk) (param0);
                      stackIn_94_0 = stackOut_93_0;
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
              stackOut_102_0 = (RuntimeException) (var2);
              stackOut_102_1 = new StringBuilder().append("mm.F(");
              stackIn_104_0 = stackOut_102_0;
              stackIn_104_1 = stackOut_102_1;
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              if (param0 == null) {
                stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
                stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
                stackOut_104_2 = "null";
                stackIn_105_0 = stackOut_104_0;
                stackIn_105_1 = stackOut_104_1;
                stackIn_105_2 = stackOut_104_2;
                break L15;
              } else {
                stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
                stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
                stackOut_103_2 = "{...}";
                stackIn_105_0 = stackOut_103_0;
                stackIn_105_1 = stackOut_103_1;
                stackIn_105_2 = stackOut_103_2;
                break L15;
              }
            }
            throw kk.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ',' + param1 + ')');
          }
          if (decompiledRegionSelector0 == 0) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 1) {
              return stackIn_35_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 2) {
                return stackIn_38_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 3) {
                  return stackIn_42_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 4) {
                    return stackIn_45_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 5) {
                      return stackIn_49_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 6) {
                        return stackIn_53_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 7) {
                          return stackIn_58_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 8) {
                            return stackIn_62_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 9) {
                              return stackIn_67_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 10) {
                                return stackIn_70_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 11) {
                                  return stackIn_77_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 12) {
                                    return stackIn_80_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 13) {
                                      return stackIn_84_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 14) {
                                        return stackIn_88_0 != 0;
                                      } else {
                                        if (decompiledRegionSelector0 == 15) {
                                          return stackIn_98_0 != 0;
                                        } else {
                                          return stackIn_101_0 != 0;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          stackOut_2_0 = 0;
          stackIn_3_0 = stackOut_2_0;
          return stackIn_3_0 != 0;
        }
    }

    final static sh a(String param0, int param1) {
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
        int decompiledRegionSelector0 = 0;
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
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if ((var2_int ^ -1) < -65) {
                stackOut_6_0 = wb.field_h;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((char)param1 == param0.charAt(0)) {
                  if (34 != param0.charAt(-1 + var2_int)) {
                    stackOut_12_0 = qj.field_F;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      if (var4 < -1 + var2_int) {
                        L2: {
                          var5 = param0.charAt(var4);
                          if (var5 != 92) {
                            L3: {
                              if (var5 != 34) {
                                break L3;
                              } else {
                                if (var3 == 0) {
                                  stackOut_25_0 = qj.field_F;
                                  stackIn_26_0 = stackOut_25_0;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            var3 = 0;
                            break L2;
                          } else {
                            L4: {
                              if (var3 != 0) {
                                stackOut_20_0 = 0;
                                stackIn_21_0 = stackOut_20_0;
                                break L4;
                              } else {
                                stackOut_19_0 = 1;
                                stackIn_21_0 = stackOut_19_0;
                                break L4;
                              }
                            }
                            var3 = stackIn_21_0;
                            break L2;
                          }
                        }
                        var4++;
                        continue L1;
                      } else {
                        return null;
                      }
                    }
                  }
                } else {
                  var3 = 0;
                  var4 = 0;
                  L5: while (true) {
                    if (var4 < var2_int) {
                      L6: {
                        var5 = param0.charAt(var4);
                        if (var5 != 46) {
                          if (-1 != qk.field_I.indexOf(var5)) {
                            var3 = 0;
                            break L6;
                          } else {
                            stackOut_42_0 = qj.field_F;
                            stackIn_43_0 = stackOut_42_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        } else {
                          L7: {
                            if (var4 == 0) {
                              break L7;
                            } else {
                              if (var4 == var2_int - 1) {
                                break L7;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          stackOut_38_0 = qj.field_F;
                          stackIn_39_0 = stackOut_38_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                      var4++;
                      continue L5;
                    } else {
                      return null;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = fo.field_k;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) (var2);
            stackOut_47_1 = new StringBuilder().append("mm.B(");
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L8;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L8;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_39_0;
                } else {
                  return stackIn_43_0;
                }
              }
            }
          }
        }
    }

    final void a(boolean param0) {
        if (param0) {
            field_d = -1.6866915225982666f;
        }
        tc.a(this.field_h, this.field_f, this.field_c);
    }

    static {
        field_e = new ah();
        field_g = "Unpacking graphics";
    }
}
