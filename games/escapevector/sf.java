/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    private int field_q;
    private int field_r;
    private int field_h;
    private int field_g;
    private int field_l;
    private int field_i;
    private int field_f;
    private int field_a;
    private int field_j;
    static hf field_d;
    private int field_p;
    static int[] field_m;
    static String field_n;
    static int field_c;
    private int field_k;
    static ed[] field_b;
    private int field_o;
    static hh[] field_e;

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        int stackIn_14_0 = 0;
        boolean stackIn_16_0 = false;
        boolean stackIn_18_0 = false;
        int stackIn_25_0 = 0;
        Object stackIn_32_0 = null;
        boolean stackIn_39_0 = false;
        int stackIn_50_0 = 0;
        Object stackIn_52_0 = null;
        String stackIn_54_0 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        boolean stackOut_15_0 = false;
        boolean stackOut_16_0 = false;
        int stackOut_13_0 = 0;
        int stackOut_24_0 = 0;
        boolean stackOut_38_0 = false;
        int stackOut_49_0 = 0;
        String stackOut_53_0 = null;
        Object stackOut_51_0 = null;
        Object stackOut_31_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            if (param1 != null) {
              var2_int = 0;
              var3 = param1.length();
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        if (~var2_int <= ~var3) {
                          break L5;
                        } else {
                          stackOut_6_0 = fd.a(true, param1.charAt(var2_int));
                          stackIn_14_0 = stackOut_6_0 ? 1 : 0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var9 != 0) {
                            L6: while (true) {
                              if (stackIn_14_0 <= var2_int) {
                                break L3;
                              } else {
                                stackOut_15_0 = fd.a(true, param1.charAt(var3 - 1));
                                stackIn_25_0 = stackOut_15_0 ? 1 : 0;
                                stackIn_16_0 = stackOut_15_0;
                                if (var9 != 0) {
                                  break L2;
                                } else {
                                  stackOut_16_0 = stackIn_16_0;
                                  stackIn_18_0 = stackOut_16_0;
                                  if (!stackIn_18_0) {
                                    break L3;
                                  } else {
                                    var3--;
                                    if (var9 == 0) {
                                      stackOut_13_0 = var3;
                                      stackIn_14_0 = stackOut_13_0;
                                      continue L6;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (!stackIn_7_0) {
                              break L5;
                            } else {
                              var2_int++;
                              if (var9 == 0) {
                                continue L1;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      L7: while (true) {
                        stackOut_13_0 = var3;
                        stackIn_14_0 = stackOut_13_0;
                        if (stackIn_14_0 <= var2_int) {
                          break L3;
                        } else {
                          stackOut_15_0 = fd.a(true, param1.charAt(var3 - 1));
                          stackIn_25_0 = stackOut_15_0 ? 1 : 0;
                          stackIn_16_0 = stackOut_15_0;
                          if (var9 != 0) {
                            break L2;
                          } else {
                            stackOut_16_0 = stackIn_16_0;
                            stackIn_18_0 = stackOut_16_0;
                            if (!stackIn_18_0) {
                              break L3;
                            } else {
                              var3--;
                              if (var9 == 0) {
                                continue L7;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  stackOut_24_0 = -var2_int + var3;
                  stackIn_25_0 = stackOut_24_0;
                  break L2;
                }
                L8: {
                  var4 = stackIn_25_0;
                  if (var4 < 1) {
                    break L8;
                  } else {
                    if (12 < var4) {
                      break L8;
                    } else {
                      L9: {
                        var5 = new StringBuilder(var4);
                        if (param0 <= -65) {
                          break L9;
                        } else {
                          sf.a(true);
                          break L9;
                        }
                      }
                      var6 = var2_int;
                      L10: while (true) {
                        L11: {
                          L12: {
                            if (~var6 <= ~var3) {
                              break L12;
                            } else {
                              var7 = param1.charAt(var6);
                              stackOut_38_0 = d.a((char) var7, -11217);
                              stackIn_50_0 = stackOut_38_0 ? 1 : 0;
                              stackIn_39_0 = stackOut_38_0;
                              if (var9 != 0) {
                                break L11;
                              } else {
                                L13: {
                                  L14: {
                                    if (stackIn_39_0) {
                                      break L14;
                                    } else {
                                      if (var9 == 0) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  var8 = eo.a(227, (char) var7);
                                  if (0 == var8) {
                                    break L13;
                                  } else {
                                    StringBuilder discarded$1 = var5.append((char) var8);
                                    break L13;
                                  }
                                }
                                var6++;
                                if (var9 == 0) {
                                  continue L10;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          stackOut_49_0 = var5.length();
                          stackIn_50_0 = stackOut_49_0;
                          break L11;
                        }
                        if (stackIn_50_0 != 0) {
                          stackOut_53_0 = var5.toString();
                          stackIn_54_0 = stackOut_53_0;
                          break L0;
                        } else {
                          stackOut_51_0 = null;
                          stackIn_52_0 = stackOut_51_0;
                          return (String) (Object) stackIn_52_0;
                        }
                      }
                    }
                  }
                }
                stackOut_31_0 = null;
                stackIn_32_0 = stackOut_31_0;
                return (String) (Object) stackIn_32_0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var2 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var2;
            stackOut_55_1 = new StringBuilder().append("sf.B(").append(param0).append(',');
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param1 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L15;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L15;
            }
          }
          throw t.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + ')');
        }
        return stackIn_54_0;
    }

    final void b(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((sf) this).field_a = ((sf) this).field_a + param1;
              ((sf) this).field_j = ((sf) this).field_j + param1;
              ((sf) this).field_l = ((sf) this).field_l + param1;
              ((sf) this).field_h = ((sf) this).field_h + param1;
              ((sf) this).field_f = ((sf) this).field_f + param1;
              ((sf) this).field_r = ((sf) this).field_r + param1;
              if (param0 == -1) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            ((sf) this).field_o = ((sf) this).field_o + param1;
            ((sf) this).field_j = ((sf) this).field_j + param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "sf.G(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 136) {
                break L1;
              } else {
                ((sf) this).d(42, -12);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "sf.H(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        if (param1 != 3748) {
            return;
        }
        try {
            ((sf) this).field_q = ((sf) this).field_q | 1 << param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "sf.L(" + param0 + ',' + param1 + ')');
        }
    }

    final int[] c(int param0) {
        RuntimeException var2 = null;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((sf) this).a((byte) -83);
                break L1;
              }
            }
            this.c(136, this.b(~param0));
            stackOut_3_0 = new int[]{((sf) this).field_j, ((sf) this).field_l, ((sf) this).field_q, ((sf) this).field_o};
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "sf.J(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void d(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 136) {
                break L1;
              } else {
                ((sf) this).a((byte) 23);
                break L1;
              }
            }
            ((sf) this).field_r = ((sf) this).field_r + param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "sf.F(" + param0 + ',' + param1 + ')');
        }
    }

    final int[] d(int param0) {
        RuntimeException var2 = null;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 31304) {
                break L1;
              } else {
                int[] discarded$2 = ((sf) this).c(97);
                break L1;
              }
            }
            this.c(param0 + -31168, this.b(-1));
            stackOut_3_0 = new int[]{((sf) this).field_j, ((sf) this).field_l, 0, ((sf) this).field_o};
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "sf.A(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final int b(int param0) {
        oe var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var2 = ma.field_a;
            if (null != var2) {
              L1: {
                var3 = var2.field_ob;
                var4 = var2.field_fc;
                var3 = tj.a(var4, (byte) 126, var3);
                if (param0 == -1) {
                  break L1;
                } else {
                  ((sf) this).b(90, -103);
                  break L1;
                }
              }
              stackOut_6_0 = var3;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2_ref, "sf.I(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final void a(byte param0) {
        try {
            int var2_int = -78 / ((param0 - -73) / 35);
            ((sf) this).field_f = ((sf) this).field_f + ((sf) this).field_p;
            ((sf) this).field_h = ((sf) this).field_h + ((sf) this).field_i;
            ((sf) this).field_j = ((sf) this).field_j + ((sf) this).field_g;
            ((sf) this).field_r = ((sf) this).field_r + ((sf) this).field_p;
            ((sf) this).field_l = ((sf) this).field_l + ((sf) this).field_g;
            ((sf) this).field_a = ((sf) this).field_a + ((sf) this).field_i;
            ((sf) this).field_j = ((sf) this).field_j + ((sf) this).field_k;
            ((sf) this).field_o = ((sf) this).field_o + ((sf) this).field_k;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "sf.E(" + param0 + ')');
        }
    }

    final static tk a(String param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        tk stackIn_5_0 = null;
        tk stackIn_10_0 = null;
        tk stackIn_16_0 = null;
        int stackIn_26_0 = 0;
        tk stackIn_36_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_43_0 = null;
        tk stackIn_57_0 = null;
        tk stackIn_65_0 = null;
        Object stackIn_69_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        tk stackOut_4_0 = null;
        tk stackOut_9_0 = null;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        tk stackOut_35_0 = null;
        Object stackOut_39_0 = null;
        tk stackOut_15_0 = null;
        tk stackOut_56_0 = null;
        tk stackOut_64_0 = null;
        Object stackOut_68_0 = null;
        Object stackOut_42_0 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_4_0 = mf.field_d;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (var2_int > 64) {
                stackOut_9_0 = d.field_c;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                if (34 == param0.charAt(0)) {
                  if (param0.charAt(var2_int - 1) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      L2: {
                        if (var4 >= var2_int - 1) {
                          break L2;
                        } else {
                          L3: {
                            L4: {
                              var5 = param0.charAt(var4);
                              if (var5 == 92) {
                                L5: {
                                  if (var3 != 0) {
                                    stackOut_25_0 = 0;
                                    stackIn_26_0 = stackOut_25_0;
                                    break L5;
                                  } else {
                                    stackOut_23_0 = 1;
                                    stackIn_26_0 = stackOut_23_0;
                                    break L5;
                                  }
                                }
                                var3 = stackIn_26_0;
                                if (var6 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                            L6: {
                              if (34 != var5) {
                                break L6;
                              } else {
                                if (var3 == 0) {
                                  stackOut_35_0 = wh.field_p;
                                  stackIn_36_0 = stackOut_35_0;
                                  return stackIn_36_0;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var3 = 0;
                            break L3;
                          }
                          var4++;
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_39_0 = null;
                      stackIn_40_0 = stackOut_39_0;
                      return (tk) (Object) stackIn_40_0;
                    }
                  } else {
                    stackOut_15_0 = wh.field_p;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  }
                } else {
                  if (param1 == 119) {
                    var3 = 0;
                    var4 = 0;
                    L7: while (true) {
                      L8: {
                        if (var4 >= var2_int) {
                          break L8;
                        } else {
                          L9: {
                            L10: {
                              var5 = param0.charAt(var4);
                              if (var5 == 46) {
                                L11: {
                                  if (var4 == 0) {
                                    break L11;
                                  } else {
                                    if (~(var2_int + -1) == ~var4) {
                                      break L11;
                                    } else {
                                      if (var3 == 0) {
                                        var3 = 1;
                                        if (var6 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                stackOut_56_0 = wh.field_p;
                                stackIn_57_0 = stackOut_56_0;
                                return stackIn_57_0;
                              } else {
                                break L10;
                              }
                            }
                            if (en.field_g.indexOf(var5) == -1) {
                              stackOut_64_0 = wh.field_p;
                              stackIn_65_0 = stackOut_64_0;
                              return stackIn_65_0;
                            } else {
                              var3 = 0;
                              break L9;
                            }
                          }
                          var4++;
                          if (var6 == 0) {
                            continue L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      stackOut_68_0 = null;
                      stackIn_69_0 = stackOut_68_0;
                      break L0;
                    }
                  } else {
                    stackOut_42_0 = null;
                    stackIn_43_0 = stackOut_42_0;
                    return (tk) (Object) stackIn_43_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var2;
            stackOut_70_1 = new StringBuilder().append("sf.C(");
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L12;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L12;
            }
          }
          throw t.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ',' + param1 + ')');
        }
        return (tk) (Object) stackIn_69_0;
    }

    final int[] a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_0_0 = null;
        try {
          L0: {
            this.c(136, this.b(-1));
            var2_int = 0 / ((1 - param0) / 35);
            stackOut_0_0 = new int[]{((sf) this).field_r, ((sf) this).field_h, ((sf) this).field_f, ((sf) this).field_a};
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "sf.K(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_e = null;
              field_b = null;
              field_d = null;
              if (!param0) {
                break L1;
              } else {
                String discarded$2 = sf.a(27, (CharSequence) null);
                break L1;
              }
            }
            field_n = null;
            field_m = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "sf.D(" + param0 + ')');
        }
    }

    sf(int param0) {
        ((sf) this).field_h = 136;
        ((sf) this).field_g = 203;
        ((sf) this).field_a = 10;
        ((sf) this).field_f = 30589;
        ((sf) this).field_l = 247;
        ((sf) this).field_j = 201;
        ((sf) this).field_i = 50;
        ((sf) this).field_q = 0;
        ((sf) this).field_p = 65;
        ((sf) this).field_o = 10325;
        ((sf) this).field_k = 7;
        ((sf) this).field_r = 138;
        try {
            ((sf) this).b(-1, param0);
            ((sf) this).a((byte) -19);
            this.c(136, this.b(-1));
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "sf.<init>(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new hf();
        field_n = "Legend";
        field_c = 0;
        field_m = new int[4];
        field_e = new hh[17];
    }
}
