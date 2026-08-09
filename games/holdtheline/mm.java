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
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_89_0 = 0;
        vk stackIn_95_0 = null;
        int stackIn_99_0 = 0;
        int stackIn_102_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var3 = null;
        wm var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ei var6 = null;
        var3 = null;
        var5 = HoldTheLine.field_D;
        if (param1 == -65) {
          try {
            L0: {
              if (param0.field_r) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L1: {
                  if (param0.field_j != null) {
                    break L1;
                  } else {
                    var6 = new ei();
                    var3_ref = (wm) ((Object) param0.field_m.b((byte) 85));
                    L2: while (true) {
                      if (var3_ref == null) {
                        var3_ref = (wm) ((Object) param0.field_k.b((byte) 101));
                        L3: while (true) {
                          if (var3_ref == null) {
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
                                  var6.a(var3_ref.field_E, (byte) 6);
                                  break L6;
                                } else {
                                  if (var6.field_b[var4] != var3_ref.field_E) {
                                    var4++;
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var3_ref = (wm) ((Object) param0.field_k.c((byte) 105));
                              continue L3;
                            }
                          }
                        }
                      } else {
                        var4 = 0;
                        L7: while (true) {
                          L8: {
                            if (var4 >= var6.field_e) {
                              var6.a(var3_ref.field_E, (byte) 6);
                              break L8;
                            } else {
                              if (var6.field_b[var4] != var3_ref.field_E) {
                                var4++;
                                continue L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3_ref = (wm) ((Object) param0.field_m.c((byte) -70));
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
                                        stackIn_85_0 = 0;
                                        decompiledRegionSelector0 = 13;
                                        break L0;
                                      } else {
                                        if (null == kc.field_b.a(8192)) {
                                          stackIn_89_0 = 0;
                                          decompiledRegionSelector0 = 14;
                                          break L0;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    } else {
                                      if (-7 == (param0.field_o ^ -1)) {
                                        if (hg.field_Q.a(param1 ^ -8257) == null) {
                                          stackIn_78_0 = 0;
                                          decompiledRegionSelector0 = 11;
                                          break L0;
                                        } else {
                                          if (null != fd.field_e.a(8192)) {
                                            break L13;
                                          } else {
                                            stackIn_81_0 = 0;
                                            decompiledRegionSelector0 = 12;
                                            break L0;
                                          }
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  stackIn_95_0 = (vk) (param0);
                                  break L9;
                                } else {
                                  if (ug.field_b.a(8192) == null) {
                                    stackIn_68_0 = 0;
                                    decompiledRegionSelector0 = 9;
                                    break L0;
                                  } else {
                                    if (ha.field_i.a(8192) != null) {
                                      break L12;
                                    } else {
                                      stackIn_71_0 = 0;
                                      decompiledRegionSelector0 = 10;
                                      break L0;
                                    }
                                  }
                                }
                              }
                              stackIn_95_0 = (vk) (param0);
                              break L9;
                            } else {
                              if (null == kc.field_b.a(8192)) {
                                stackIn_59_0 = 0;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              } else {
                                if (null == ug.field_b.a(8192)) {
                                  stackIn_63_0 = 0;
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
                                stackIn_54_0 = 0;
                                decompiledRegionSelector0 = 6;
                                break L0;
                              } else {
                                break L11;
                              }
                            } else {
                              stackIn_50_0 = 0;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            }
                          }
                        }
                        stackIn_95_0 = (vk) (param0);
                        break L9;
                      } else {
                        if (a.field_F.a(param1 + 8257) != null) {
                          if (hf.field_h.a(8192) != null) {
                            break L10;
                          } else {
                            stackIn_46_0 = 0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        } else {
                          stackIn_43_0 = 0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    } else {
                      if (null == ol.field_h.a(param1 ^ -8257)) {
                        stackIn_36_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        if (fd.field_e.a(param1 ^ -8257) != null) {
                          break L10;
                        } else {
                          stackIn_39_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  stackIn_95_0 = (vk) (param0);
                  break L9;
                }
                L14: while (true) {
                  if (stackIn_95_0.field_j.length <= param0.field_n) {
                    stackIn_102_0 = 1;
                    decompiledRegionSelector0 = 16;
                    break L0;
                  } else {
                    if (!param0.field_j[param0.field_n].b((byte) 48)) {
                      stackIn_99_0 = 0;
                      decompiledRegionSelector0 = 15;
                      break L0;
                    } else {
                      param0.field_n = param0.field_n + 1;
                      stackIn_95_0 = (vk) (param0);
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
              stackIn_105_0 = (RuntimeException) (var2);

              stackIn_105_1 = new StringBuilder().append("mm.F(");

              if (param0 == null) {
                stackIn_106_0 = (RuntimeException) ((Object) stackIn_105_0);
                stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
                stackIn_106_2 = "null";
                break L15;
              } else {
                stackIn_106_0 = (RuntimeException) ((Object) stackIn_105_0);
                stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
                stackIn_106_2 = "{...}";
                break L15;
              }
            }
            throw kk.a((Throwable) ((Object) stackIn_106_0), stackIn_106_2 + ',' + param1 + ')');
          }
          if (decompiledRegionSelector0 == 0) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 1) {
              return stackIn_36_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 2) {
                return stackIn_39_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 3) {
                  return stackIn_43_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 4) {
                    return stackIn_46_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 5) {
                      return stackIn_50_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 6) {
                        return stackIn_54_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 7) {
                          return stackIn_59_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 8) {
                            return stackIn_63_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 9) {
                              return stackIn_68_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 10) {
                                return stackIn_71_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 11) {
                                  return stackIn_78_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 12) {
                                    return stackIn_81_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 13) {
                                      return stackIn_85_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 14) {
                                        return stackIn_89_0 != 0;
                                      } else {
                                        if (decompiledRegionSelector0 == 15) {
                                          return stackIn_99_0 != 0;
                                        } else {
                                          return stackIn_102_0 != 0;
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
          stackIn_3_0 = 0;
          return stackIn_3_0 != 0;
        }
    }

    final static sh a(String param0, int param1) {
        sh stackIn_3_0 = null;
        sh stackIn_7_0 = null;
        sh stackIn_13_0 = null;
        int stackIn_21_0 = 0;
        sh stackIn_26_0 = null;
        sh stackIn_39_0 = null;
        sh stackIn_43_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if ((var2_int ^ -1) < -65) {
                stackIn_7_0 = wb.field_h;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((char)param1 == param0.charAt(0)) {
                  if (34 != param0.charAt(-1 + var2_int)) {
                    stackIn_13_0 = qj.field_F;
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
                                  stackIn_26_0 = qj.field_F;
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
                                stackIn_21_0 = 0;
                                break L4;
                              } else {
                                stackIn_21_0 = 1;
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
                            stackIn_43_0 = qj.field_F;
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
                          stackIn_39_0 = qj.field_F;
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
              stackIn_3_0 = fo.field_k;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_49_0 = (RuntimeException) (var2);

            stackIn_49_1 = new StringBuilder().append("mm.B(");

            if (param0 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L8;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
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
