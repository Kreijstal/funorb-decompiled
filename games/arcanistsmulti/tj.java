/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends tl {
    static lg field_t;
    static String field_y;
    private byte[] field_E;
    private int field_i;
    static qb[] field_A;
    private di field_n;
    private byte[] field_w;
    private int field_q;
    static int field_C;
    private pa field_s;
    static int[] field_u;
    private int field_v;
    static kc field_o;
    private be field_D;
    private be field_F;
    private jk field_k;
    private ve field_x;
    private lk field_B;
    private vn field_h;
    private int field_p;
    private vn field_m;
    private boolean field_l;
    private boolean field_j;
    private boolean field_z;
    private long field_r;

    final static fe a(int param0, int param1) {
        fe var2 = null;
        RuntimeException var2_ref = null;
        fe stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        fe stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var2 = new fe();
              if (param1 == -21402) {
                break L1;
              } else {
                tj.b(68);
                break L1;
              }
            }
            i.field_e.b((pg) (Object) var2, -1);
            gb.a(param0, true);
            stackOut_3_0 = (fe) var2;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2_ref, "tj.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void g(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == ((tj) this).field_F) {
              return;
            } else {
              L1: {
                ((tj) this).field_l = true;
                if (param0 == 53) {
                  break L1;
                } else {
                  ((tj) this).field_x = null;
                  break L1;
                }
              }
              L2: {
                if (null == ((tj) this).field_h) {
                  ((tj) this).field_h = new vn();
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "tj.J(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        pg var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        pg stackIn_21_0 = null;
        pg stackIn_23_0 = null;
        pg stackIn_25_0 = null;
        pg stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        RuntimeException decompiledCaughtException = null;
        pg stackOut_20_0 = null;
        pg stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        pg stackOut_21_0 = null;
        pg stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (((tj) this).field_h != null) {
              if (((tj) this).d((byte) 122) == null) {
                return;
              } else {
                if (!param0) {
                  var2_ref = ((tj) this).field_m.b(12623);
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (null == var2_ref) {
                          break L3;
                        } else {
                          var3 = (int)var2_ref.field_e;
                          if (var4 != 0) {
                            break L2;
                          } else {
                            L4: {
                              L5: {
                                L6: {
                                  if (var3 < 0) {
                                    break L6;
                                  } else {
                                    if (((tj) this).field_k.field_f <= var3) {
                                      break L6;
                                    } else {
                                      if (((tj) this).field_k.field_b[var3] != 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                L7: {
                                  stackOut_20_0 = (pg) var2_ref;
                                  stackIn_25_0 = stackOut_20_0;
                                  stackIn_21_0 = stackOut_20_0;
                                  if (param0) {
                                    stackOut_25_0 = (pg) (Object) stackIn_25_0;
                                    stackOut_25_1 = 0;
                                    stackIn_26_0 = stackOut_25_0;
                                    stackIn_26_1 = stackOut_25_1;
                                    break L7;
                                  } else {
                                    stackOut_21_0 = (pg) (Object) stackIn_21_0;
                                    stackIn_23_0 = stackOut_21_0;
                                    stackOut_23_0 = (pg) (Object) stackIn_23_0;
                                    stackOut_23_1 = 1;
                                    stackIn_26_0 = stackOut_23_0;
                                    stackIn_26_1 = stackOut_23_1;
                                    break L7;
                                  }
                                }
                                ((pg) (Object) stackIn_26_0).a(stackIn_26_1 != 0);
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                              L8: {
                                if (0 == ((tj) this).field_E[var3]) {
                                  ve discarded$2 = this.a(1, -103, var3);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              L9: {
                                if (((tj) this).field_E[var3] != -1) {
                                  break L9;
                                } else {
                                  ve discarded$3 = this.a(2, 62, var3);
                                  break L9;
                                }
                              }
                              if (((tj) this).field_E[var3] != 1) {
                                break L4;
                              } else {
                                var2_ref.a(true);
                                break L4;
                              }
                            }
                            var2_ref = ((tj) this).field_m.a(0);
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      break L2;
                    }
                    break L0;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "tj.P(" + param0 + ')');
        }
    }

    final static String a(int param0, String[] param1, String param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        StringBuilder var7 = null;
        String var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_24_0 = 0;
        boolean stackIn_29_0 = false;
        String stackIn_47_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_23_0 = 0;
        boolean stackOut_28_0 = false;
        String stackOut_46_0 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = param2.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6 = param2.indexOf("<%", var5);
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 >= ~var6) {
                      break L4;
                    } else {
                      if (var12 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_5_0 = var6;
                  stackOut_5_1 = 2;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  L5: while (true) {
                    var5 = stackIn_7_0 + stackIn_7_1;
                    L6: while (true) {
                      L7: {
                        if (~var3_int >= ~var5) {
                          break L7;
                        } else {
                          stackOut_9_0 = e.a(30, param2.charAt(var5));
                          stackIn_3_0 = stackOut_9_0 ? 1 : 0;
                          stackIn_10_0 = stackOut_9_0;
                          if (var12 != 0) {
                            continue L2;
                          } else {
                            if (!stackIn_10_0) {
                              break L7;
                            } else {
                              var5++;
                              if (var12 == 0) {
                                continue L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      var7_ref = param2.substring(var6 + 2, var5);
                      if (!fi.a((CharSequence) (Object) var7_ref, 10)) {
                        continue L1;
                      } else {
                        stackOut_15_0 = ~var5;
                        stackOut_15_1 = ~var3_int;
                        stackIn_7_0 = stackOut_15_0;
                        stackIn_7_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (var12 != 0) {
                          continue L5;
                        } else {
                          L8: {
                            if (stackIn_16_0 <= stackIn_16_1) {
                              break L8;
                            } else {
                              if (param2.charAt(var5) != 62) {
                                break L8;
                              } else {
                                var5++;
                                var8 = dc.a((CharSequence) (Object) var7_ref, 126);
                                var4 = var4 + (param1[var8].length() + -var5 - -var6);
                                break L8;
                              }
                            }
                          }
                          if (var12 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                var6 = -96 % ((param0 - 51) / 62);
                var7 = new StringBuilder(var4);
                var8 = 0;
                var5 = 0;
                L9: while (true) {
                  var9 = param2.indexOf("<%", var5);
                  stackOut_23_0 = -1;
                  stackIn_24_0 = stackOut_23_0;
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (stackIn_24_0 < ~var9) {
                          break L12;
                        } else {
                          if (var12 != 0) {
                            break L11;
                          } else {
                            var5 = var9 - -2;
                            L13: while (true) {
                              L14: {
                                if (~var3_int >= ~var5) {
                                  break L14;
                                } else {
                                  stackOut_28_0 = e.a(30, param2.charAt(var5));
                                  stackIn_24_0 = stackOut_28_0 ? 1 : 0;
                                  stackIn_29_0 = stackOut_28_0;
                                  if (var12 != 0) {
                                    continue L10;
                                  } else {
                                    if (!stackIn_29_0) {
                                      break L14;
                                    } else {
                                      var5++;
                                      if (var12 == 0) {
                                        continue L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                              }
                              L15: {
                                var10 = param2.substring(2 + var9, var5);
                                if (fi.a((CharSequence) (Object) var10, 10)) {
                                  break L15;
                                } else {
                                  if (var12 == 0) {
                                    continue L9;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              L16: {
                                if (var5 >= var3_int) {
                                  break L16;
                                } else {
                                  if (param2.charAt(var5) == 62) {
                                    var5++;
                                    var11 = dc.a((CharSequence) (Object) var10, 127);
                                    StringBuilder discarded$3 = var7.append(param2.substring(var8, var9));
                                    var8 = var5;
                                    StringBuilder discarded$4 = var7.append(param1[var11]);
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              if (var12 == 0) {
                                continue L9;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                      }
                      StringBuilder discarded$5 = var7.append(param2.substring(var8));
                      break L11;
                    }
                    stackOut_46_0 = var7.toString();
                    stackIn_47_0 = stackOut_46_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var3;
            stackOut_48_1 = new StringBuilder().append("tj.K(").append(param0).append(',');
            stackIn_51_0 = stackOut_48_0;
            stackIn_51_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param1 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L17;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_52_0 = stackOut_49_0;
              stackIn_52_1 = stackOut_49_1;
              stackIn_52_2 = stackOut_49_2;
              break L17;
            }
          }
          L18: {
            stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',');
            stackIn_55_0 = stackOut_52_0;
            stackIn_55_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param2 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L18;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_56_0 = stackOut_53_0;
              stackIn_56_1 = stackOut_53_1;
              stackIn_56_2 = stackOut_53_2;
              break L18;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + ')');
        }
        return stackIn_47_0;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -69) {
                break L1;
              } else {
                fe discarded$2 = tj.a(118, 80);
                break L1;
              }
            }
            stackOut_3_0 = gn.field_e.a(param0, "", -1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("tj.Q(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(boolean param0, byte param1) {
        try {
            sc.a(false, false, param0);
            if (param1 >= -93) {
                field_t = null;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "tj.R(" + param0 + ',' + param1 + ')');
        }
    }

    final void f(byte param0) {
        RuntimeException var2 = null;
        ve var2_ref = null;
        int var2_int = 0;
        pg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_62_0 = 0;
        byte stackIn_62_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        boolean stackIn_107_0 = false;
        int stackIn_128_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_61_0 = 0;
        byte stackOut_61_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        boolean stackOut_106_0 = false;
        byte stackOut_127_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((tj) this).field_h) {
                  break L2;
                } else {
                  if (null == ((tj) this).d((byte) 119)) {
                    return;
                  } else {
                    L3: {
                      if (!((tj) this).field_j) {
                        break L3;
                      } else {
                        var2_int = 1;
                        var3 = ((tj) this).field_h.b(12623);
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (null == var3) {
                                break L6;
                              } else {
                                var4 = (int)var3.field_e;
                                stackOut_11_0 = -1;
                                stackOut_11_1 = ~((tj) this).field_E[var4];
                                stackIn_23_0 = stackOut_11_0;
                                stackIn_23_1 = stackOut_11_1;
                                stackIn_12_0 = stackOut_11_0;
                                stackIn_12_1 = stackOut_11_1;
                                if (var5 != 0) {
                                  L7: while (true) {
                                    if (stackIn_23_0 >= stackIn_23_1) {
                                      break L5;
                                    } else {
                                      stackOut_24_0 = ~((tj) this).field_k.field_b[((tj) this).field_p];
                                      stackOut_24_1 = -1;
                                      stackIn_129_0 = stackOut_24_0;
                                      stackIn_129_1 = stackOut_24_1;
                                      stackIn_25_0 = stackOut_24_0;
                                      stackIn_25_1 = stackOut_24_1;
                                      if (var5 != 0) {
                                        break L1;
                                      } else {
                                        stackOut_25_0 = stackIn_25_0;
                                        stackOut_25_1 = stackIn_25_1;
                                        stackIn_27_0 = stackOut_25_0;
                                        stackIn_27_1 = stackOut_25_1;
                                        L8: {
                                          L9: {
                                            if (stackIn_27_0 != stackIn_27_1) {
                                              break L9;
                                            } else {
                                              ((tj) this).field_p = ((tj) this).field_p + 1;
                                              if (var5 == 0) {
                                                break L8;
                                              } else {
                                                break L9;
                                              }
                                            }
                                          }
                                          L10: {
                                            if (250 <= ((tj) this).field_s.field_d) {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L5;
                                              } else {
                                                break L10;
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                          L11: {
                                            if (((tj) this).field_E[((tj) this).field_p] == 0) {
                                              ve discarded$5 = this.a(1, 85, ((tj) this).field_p);
                                              break L11;
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (0 == ((tj) this).field_E[((tj) this).field_p]) {
                                              var3 = new pg();
                                              var3.field_e = (long)((tj) this).field_p;
                                              ((tj) this).field_h.b(var3, -1);
                                              var2_int = 0;
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                          ((tj) this).field_p = ((tj) this).field_p + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L5;
                                          }
                                        }
                                        stackOut_22_0 = ((tj) this).field_p;
                                        stackOut_22_1 = ((tj) this).field_k.field_b.length;
                                        stackIn_23_0 = stackOut_22_0;
                                        stackIn_23_1 = stackOut_22_1;
                                        continue L7;
                                      }
                                    }
                                  }
                                } else {
                                  L13: {
                                    if (stackIn_12_0 == stackIn_12_1) {
                                      ve discarded$6 = this.a(1, 96, var4);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    L15: {
                                      if (((tj) this).field_E[var4] != 0) {
                                        break L15;
                                      } else {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L14;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    var3.a(true);
                                    break L14;
                                  }
                                  var3 = ((tj) this).field_h.a(0);
                                  if (var5 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L16: while (true) {
                              stackOut_22_0 = ((tj) this).field_p;
                              stackOut_22_1 = ((tj) this).field_k.field_b.length;
                              stackIn_23_0 = stackOut_22_0;
                              stackIn_23_1 = stackOut_22_1;
                              if (stackIn_23_0 >= stackIn_23_1) {
                                break L5;
                              } else {
                                stackOut_24_0 = ~((tj) this).field_k.field_b[((tj) this).field_p];
                                stackOut_24_1 = -1;
                                stackIn_129_0 = stackOut_24_0;
                                stackIn_129_1 = stackOut_24_1;
                                stackIn_25_0 = stackOut_24_0;
                                stackIn_25_1 = stackOut_24_1;
                                if (var5 != 0) {
                                  break L1;
                                } else {
                                  stackOut_25_0 = stackIn_25_0;
                                  stackOut_25_1 = stackIn_25_1;
                                  stackIn_27_0 = stackOut_25_0;
                                  stackIn_27_1 = stackOut_25_1;
                                  L17: {
                                    if (stackIn_27_0 != stackIn_27_1) {
                                      break L17;
                                    } else {
                                      ((tj) this).field_p = ((tj) this).field_p + 1;
                                      if (var5 == 0) {
                                        continue L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  L18: {
                                    if (250 <= ((tj) this).field_s.field_d) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L5;
                                      } else {
                                        break L18;
                                      }
                                    } else {
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (((tj) this).field_E[((tj) this).field_p] == 0) {
                                      ve discarded$5 = this.a(1, 85, ((tj) this).field_p);
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (0 == ((tj) this).field_E[((tj) this).field_p]) {
                                      var3 = new pg();
                                      var3.field_e = (long)((tj) this).field_p;
                                      ((tj) this).field_h.b(var3, -1);
                                      var2_int = 0;
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  ((tj) this).field_p = ((tj) this).field_p + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          L21: {
                            if (var2_int != 0) {
                              ((tj) this).field_p = 0;
                              ((tj) this).field_j = false;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L22: {
                      if (((tj) this).field_l) {
                        break L22;
                      } else {
                        ((tj) this).field_h = null;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L22;
                        }
                      }
                    }
                    var2_int = 1;
                    var3 = ((tj) this).field_h.b(12623);
                    L23: while (true) {
                      L24: {
                        L25: {
                          if (null == var3) {
                            break L25;
                          } else {
                            var4 = (int)var3.field_e;
                            stackOut_61_0 = 1;
                            stackOut_61_1 = ((tj) this).field_E[var4];
                            stackIn_74_0 = stackOut_61_0;
                            stackIn_74_1 = stackOut_61_1;
                            stackIn_62_0 = stackOut_61_0;
                            stackIn_62_1 = stackOut_61_1;
                            if (var5 != 0) {
                              L26: while (true) {
                                if (stackIn_74_0 >= stackIn_74_1) {
                                  break L24;
                                } else {
                                  stackOut_75_0 = -1;
                                  stackOut_75_1 = ~((tj) this).field_k.field_b[((tj) this).field_p];
                                  stackIn_129_0 = stackOut_75_0;
                                  stackIn_129_1 = stackOut_75_1;
                                  stackIn_76_0 = stackOut_75_0;
                                  stackIn_76_1 = stackOut_75_1;
                                  if (var5 != 0) {
                                    break L1;
                                  } else {
                                    stackOut_76_0 = stackIn_76_0;
                                    stackOut_76_1 = stackIn_76_1;
                                    stackIn_78_0 = stackOut_76_0;
                                    stackIn_78_1 = stackOut_76_1;
                                    L27: {
                                      L28: {
                                        if (stackIn_78_0 != stackIn_78_1) {
                                          break L28;
                                        } else {
                                          ((tj) this).field_p = ((tj) this).field_p + 1;
                                          if (var5 == 0) {
                                            break L27;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                      L29: {
                                        if (!((tj) this).field_B.b(-21)) {
                                          break L29;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L24;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      L30: {
                                        if (1 != ((tj) this).field_E[((tj) this).field_p]) {
                                          ve discarded$7 = this.a(2, 61, ((tj) this).field_p);
                                          break L30;
                                        } else {
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (((tj) this).field_E[((tj) this).field_p] == 1) {
                                          break L31;
                                        } else {
                                          var3 = new pg();
                                          var3.field_e = (long)((tj) this).field_p;
                                          ((tj) this).field_h.b(var3, -1);
                                          var2_int = 0;
                                          break L31;
                                        }
                                      }
                                      ((tj) this).field_p = ((tj) this).field_p + 1;
                                      if (var5 == 0) {
                                        break L27;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    stackOut_73_0 = ~((tj) this).field_k.field_b.length;
                                    stackOut_73_1 = ~((tj) this).field_p;
                                    stackIn_74_0 = stackOut_73_0;
                                    stackIn_74_1 = stackOut_73_1;
                                    continue L26;
                                  }
                                }
                              }
                            } else {
                              L32: {
                                if (stackIn_62_0 == stackIn_62_1) {
                                  break L32;
                                } else {
                                  ve discarded$8 = this.a(2, -114, var4);
                                  break L32;
                                }
                              }
                              L33: {
                                L34: {
                                  if (((tj) this).field_E[var4] != 1) {
                                    break L34;
                                  } else {
                                    var3.a(true);
                                    if (var5 == 0) {
                                      break L33;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L33;
                              }
                              var3 = ((tj) this).field_h.a(0);
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        L35: while (true) {
                          stackOut_73_0 = ~((tj) this).field_k.field_b.length;
                          stackOut_73_1 = ~((tj) this).field_p;
                          stackIn_74_0 = stackOut_73_0;
                          stackIn_74_1 = stackOut_73_1;
                          if (stackIn_74_0 >= stackIn_74_1) {
                            break L24;
                          } else {
                            stackOut_75_0 = -1;
                            stackOut_75_1 = ~((tj) this).field_k.field_b[((tj) this).field_p];
                            stackIn_129_0 = stackOut_75_0;
                            stackIn_129_1 = stackOut_75_1;
                            stackIn_76_0 = stackOut_75_0;
                            stackIn_76_1 = stackOut_75_1;
                            if (var5 != 0) {
                              break L1;
                            } else {
                              stackOut_76_0 = stackIn_76_0;
                              stackOut_76_1 = stackIn_76_1;
                              stackIn_78_0 = stackOut_76_0;
                              stackIn_78_1 = stackOut_76_1;
                              L36: {
                                if (stackIn_78_0 != stackIn_78_1) {
                                  break L36;
                                } else {
                                  ((tj) this).field_p = ((tj) this).field_p + 1;
                                  if (var5 == 0) {
                                    continue L35;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              L37: {
                                if (!((tj) this).field_B.b(-21)) {
                                  break L37;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L24;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              L38: {
                                if (1 != ((tj) this).field_E[((tj) this).field_p]) {
                                  ve discarded$7 = this.a(2, 61, ((tj) this).field_p);
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                              L39: {
                                if (((tj) this).field_E[((tj) this).field_p] == 1) {
                                  break L39;
                                } else {
                                  var3 = new pg();
                                  var3.field_e = (long)((tj) this).field_p;
                                  ((tj) this).field_h.b(var3, -1);
                                  var2_int = 0;
                                  break L39;
                                }
                              }
                              ((tj) this).field_p = ((tj) this).field_p + 1;
                              if (var5 == 0) {
                                continue L35;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                      }
                      if (var2_int == 0) {
                        break L2;
                      } else {
                        ((tj) this).field_p = 0;
                        ((tj) this).field_l = false;
                        break L2;
                      }
                    }
                  }
                }
              }
              L40: {
                L41: {
                  if (!((tj) this).field_z) {
                    break L41;
                  } else {
                    if (~((tj) this).field_r >= ~qj.b(-26572)) {
                      var2_ref = (ve) (Object) ((tj) this).field_n.a(10);
                      L42: while (true) {
                        L43: {
                          if (null == var2_ref) {
                            break L43;
                          } else {
                            stackOut_106_0 = var2_ref.field_p;
                            stackIn_128_0 = stackOut_106_0 ? 1 : 0;
                            stackIn_107_0 = stackOut_106_0;
                            if (var5 != 0) {
                              break L40;
                            } else {
                              L44: {
                                L45: {
                                  if (!stackIn_107_0) {
                                    break L45;
                                  } else {
                                    if (var5 == 0) {
                                      break L44;
                                    } else {
                                      break L45;
                                    }
                                  }
                                }
                                L46: {
                                  if (!var2_ref.field_n) {
                                    break L46;
                                  } else {
                                    if (!var2_ref.field_q) {
                                      throw new RuntimeException();
                                    } else {
                                      var2_ref.a(true);
                                      if (var5 == 0) {
                                        break L44;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                }
                                var2_ref.field_n = true;
                                break L44;
                              }
                              var2_ref = (ve) (Object) ((tj) this).field_n.c(-87);
                              if (var5 == 0) {
                                continue L42;
                              } else {
                                break L43;
                              }
                            }
                          }
                        }
                        ((tj) this).field_r = qj.b(-26572) - -1000L;
                        break L41;
                      }
                    } else {
                      break L41;
                    }
                  }
                }
                stackOut_127_0 = param0;
                stackIn_128_0 = stackOut_127_0;
                break L40;
              }
              stackOut_128_0 = stackIn_128_0;
              stackOut_128_1 = 54;
              stackIn_129_0 = stackOut_128_0;
              stackIn_129_1 = stackOut_128_1;
              break L1;
            }
            L47: {
              if (stackIn_129_0 >= stackIn_129_1) {
                break L47;
              } else {
                int discarded$9 = ((tj) this).a(15, (byte) -128);
                break L47;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "tj.O(" + param0 + ')');
        }
    }

    final jk d(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        jk stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_54_0 = null;
        jk stackIn_59_0 = null;
        RuntimeException decompiledCaughtException = null;
        jk stackOut_4_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_32_0 = null;
        Object stackOut_53_0 = null;
        jk stackOut_58_0 = null;
        Object stackOut_17_0 = null;
        Object stackOut_14_0 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (null != ((tj) this).field_k) {
              stackOut_4_0 = ((tj) this).field_k;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                if (((tj) this).field_x == null) {
                  if (!((tj) this).field_B.c((byte) -66)) {
                    ((tj) this).field_x = (ve) (Object) ((tj) this).field_B.a(((tj) this).field_i, true, 255, (byte) -80, (byte) 0);
                    break L1;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (jk) (Object) stackIn_11_0;
                  }
                } else {
                  break L1;
                }
              }
              if (!((tj) this).field_x.field_p) {
                var2_array = ((tj) this).field_x.c(-42);
                if (param0 > 74) {
                  L2: {
                    L3: {
                      if (((tj) this).field_x instanceof ea) {
                        break L3;
                      } else {
                        try {
                          L4: {
                            if (null == var2_array) {
                              throw new RuntimeException();
                            } else {
                              ((tj) this).field_k = new jk(var2_array, ((tj) this).field_q, ((tj) this).field_w);
                              break L4;
                            }
                          }
                        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L5: {
                            L6: {
                              var3 = decompiledCaughtException;
                              ((tj) this).field_B.a((byte) 0);
                              ((tj) this).field_k = null;
                              if (((tj) this).field_B.c((byte) -71)) {
                                break L6;
                              } else {
                                ((tj) this).field_x = (ve) (Object) ((tj) this).field_B.a(((tj) this).field_i, true, 255, (byte) -80, (byte) 0);
                                if (var4 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            ((tj) this).field_x = null;
                            break L5;
                          }
                          stackOut_32_0 = null;
                          stackIn_33_0 = stackOut_32_0;
                          return (jk) (Object) stackIn_33_0;
                        }
                        if (null != ((tj) this).field_D) {
                          ea discarded$1 = ((tj) this).field_s.a(((tj) this).field_i, 93, var2_array, ((tj) this).field_D);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    try {
                      L7: {
                        if (var2_array == null) {
                          throw new RuntimeException();
                        } else {
                          ((tj) this).field_k = new jk(var2_array, ((tj) this).field_q, ((tj) this).field_w);
                          if (((tj) this).field_v != ((tj) this).field_k.field_g) {
                            throw new RuntimeException();
                          } else {
                            break L7;
                          }
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L8: {
                        L9: {
                          var3 = decompiledCaughtException;
                          ((tj) this).field_k = null;
                          if (((tj) this).field_B.c((byte) 52)) {
                            break L9;
                          } else {
                            ((tj) this).field_x = (ve) (Object) ((tj) this).field_B.a(((tj) this).field_i, true, 255, (byte) -80, (byte) 0);
                            if (var4 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ((tj) this).field_x = null;
                        break L8;
                      }
                      stackOut_53_0 = null;
                      stackIn_54_0 = stackOut_53_0;
                      return (jk) (Object) stackIn_54_0;
                    }
                    break L2;
                  }
                  L10: {
                    ((tj) this).field_x = null;
                    if (((tj) this).field_F == null) {
                      break L10;
                    } else {
                      ((tj) this).field_E = new byte[((tj) this).field_k.field_f];
                      break L10;
                    }
                  }
                  stackOut_58_0 = ((tj) this).field_k;
                  stackIn_59_0 = stackOut_58_0;
                  break L0;
                } else {
                  stackOut_17_0 = null;
                  stackIn_18_0 = stackOut_17_0;
                  return (jk) (Object) stackIn_18_0;
                }
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (jk) (Object) stackIn_15_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "tj.D(" + param0 + ')');
        }
        return stackIn_59_0;
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              rk.field_O = null;
              if (param0 >= 62) {
                break L1;
              } else {
                field_C = -45;
                break L1;
              }
            }
            qn.field_ob = null;
            mj.field_p = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "tj.I(" + param0 + ')');
        }
    }

    private final ve a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        int var6 = 0;
        RuntimeException var7 = null;
        Exception var7_ref = null;
        int var7_int = 0;
        byte[] var8_ref_byte__ = null;
        int var8 = 0;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_51_0 = null;
        Object stackIn_55_0 = null;
        byte stackIn_74_0 = 0;
        byte stackIn_74_1 = 0;
        Object stackIn_90_0 = null;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        Object stackIn_101_0 = null;
        byte stackIn_120_0 = 0;
        byte stackIn_120_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        Object stackIn_140_0 = null;
        Object stackIn_149_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_50_0 = null;
        Object stackOut_27_0 = null;
        byte stackOut_119_0 = 0;
        byte stackOut_119_1 = 0;
        int stackOut_126_0 = 0;
        int stackOut_126_1 = 0;
        Object stackOut_139_0 = null;
        byte stackOut_73_0 = 0;
        byte stackOut_73_1 = 0;
        Object stackOut_89_0 = null;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        Object stackOut_100_0 = null;
        Object stackOut_54_0 = null;
        Object stackOut_148_0 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          try {
            L0: {
              var4 = (Object) (Object) (ve) (Object) ((tj) this).field_n.a((long)param2, -77);
              if (var4 == null) {
                break L0;
              } else {
                if (param0 != 0) {
                  break L0;
                } else {
                  if (((ve) var4).field_q) {
                    break L0;
                  } else {
                    if (!((ve) var4).field_p) {
                      break L0;
                    } else {
                      ((ve) var4).a(true);
                      var4 = null;
                      break L0;
                    }
                  }
                }
              }
            }
            L1: {
              if (var4 != null) {
                break L1;
              } else {
                L2: {
                  if (0 != param0) {
                    L3: {
                      if (param0 != 1) {
                        break L3;
                      } else {
                        if (null == ((tj) this).field_F) {
                          throw new RuntimeException();
                        } else {
                          var4 = (Object) (Object) ((tj) this).field_s.a(param2, true, ((tj) this).field_F);
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (param0 == 2) {
                      if (null != ((tj) this).field_F) {
                        if (((tj) this).field_E[param2] == -1) {
                          L4: {
                            if (((tj) this).field_B.b(-21)) {
                              break L4;
                            } else {
                              var4 = (Object) (Object) ((tj) this).field_B.a(param2, false, ((tj) this).field_i, (byte) -80, (byte) 2);
                              if (var11 == 0) {
                                break L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                          stackOut_50_0 = null;
                          stackIn_51_0 = stackOut_50_0;
                          return (ve) (Object) stackIn_51_0;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    L5: {
                      if (((tj) this).field_F == null) {
                        break L5;
                      } else {
                        if (((tj) this).field_E[param2] == -1) {
                          break L5;
                        } else {
                          var4 = (Object) (Object) ((tj) this).field_s.a(((tj) this).field_F, param2, -6833);
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (((tj) this).field_B.c((byte) -91)) {
                        break L6;
                      } else {
                        var4 = (Object) (Object) ((tj) this).field_B.a(param2, true, ((tj) this).field_i, (byte) -80, (byte) 2);
                        if (var11 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackOut_27_0 = null;
                    stackIn_28_0 = stackOut_27_0;
                    return (ve) (Object) stackIn_28_0;
                  }
                }
                ((tj) this).field_n.a((pg) var4, true, (long)param2);
                break L1;
              }
            }
            if (!((ve) var4).field_p) {
              var6 = 103 / ((param1 - -54) / 43);
              var5 = ((ve) var4).c(-74);
              if (var4 instanceof ea) {
                L7: {
                  if (null == var5) {
                    break L7;
                  } else {
                    if (var5.length <= 2) {
                      break L7;
                    } else {
                      co.field_g.reset();
                      co.field_g.update(var5, 0, var5.length + -2);
                      var7_int = (int)co.field_g.getValue();
                      if (var7_int != ((tj) this).field_k.field_h[param2]) {
                        throw new RuntimeException();
                      } else {
                        L8: {
                          L9: {
                            if (((tj) this).field_k.field_k == null) {
                              break L9;
                            } else {
                              if (null == ((tj) this).field_k.field_k[param2]) {
                                break L9;
                              } else {
                                var8_ref_byte__ = ((tj) this).field_k.field_k[param2];
                                var9 = nn.a(-2 + var5.length, (byte) -93, var5, 0);
                                var10 = 0;
                                L10: while (true) {
                                  if (64 <= var10) {
                                    break L9;
                                  } else {
                                    stackOut_119_0 = var9[var10];
                                    stackOut_119_1 = var8_ref_byte__[var10];
                                    stackIn_127_0 = stackOut_119_0;
                                    stackIn_127_1 = stackOut_119_1;
                                    stackIn_120_0 = stackOut_119_0;
                                    stackIn_120_1 = stackOut_119_1;
                                    if (var11 != 0) {
                                      break L8;
                                    } else {
                                      if (stackIn_120_0 != stackIn_120_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var10++;
                                        if (var11 == 0) {
                                          continue L10;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_126_0 = (var5[var5.length + -2] & 255) << 828893896;
                          stackOut_126_1 = 255 & var5[-1 + var5.length];
                          stackIn_127_0 = stackOut_126_0;
                          stackIn_127_1 = stackOut_126_1;
                          break L8;
                        }
                        var8 = stackIn_127_0 + stackIn_127_1;
                        if (~var8 == ~(((tj) this).field_k.field_y[param2] & 65535)) {
                          L11: {
                            if (((tj) this).field_E[param2] == 1) {
                              break L11;
                            } else {
                              L12: {
                                if (((tj) this).field_E[param2] != 0) {
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              ((tj) this).field_E[param2] = (byte) 1;
                              break L11;
                            }
                          }
                          L13: {
                            if (!((ve) var4).field_q) {
                              ((ve) var4).a(true);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          stackOut_139_0 = var4;
                          stackIn_140_0 = stackOut_139_0;
                          return (ve) (Object) stackIn_140_0;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              } else {
                try {
                  L14: {
                    L15: {
                      if (null == var5) {
                        break L15;
                      } else {
                        if (var5.length > 2) {
                          co.field_g.reset();
                          co.field_g.update(var5, 0, -2 + var5.length);
                          var7_int = (int)co.field_g.getValue();
                          if (((tj) this).field_k.field_h[param2] != var7_int) {
                            throw new RuntimeException();
                          } else {
                            L16: {
                              if (((tj) this).field_k.field_k == null) {
                                break L16;
                              } else {
                                if (((tj) this).field_k.field_k[param2] == null) {
                                  break L16;
                                } else {
                                  var8_ref_byte__ = ((tj) this).field_k.field_k[param2];
                                  var9 = nn.a(var5.length - 2, (byte) -93, var5, 0);
                                  var10 = 0;
                                  L17: while (true) {
                                    if (var10 >= 64) {
                                      break L16;
                                    } else {
                                      stackOut_73_0 = var9[var10];
                                      stackOut_73_1 = var8_ref_byte__[var10];
                                      stackIn_94_0 = stackOut_73_0;
                                      stackIn_94_1 = stackOut_73_1;
                                      stackIn_74_0 = stackOut_73_0;
                                      stackIn_74_1 = stackOut_73_1;
                                      if (var11 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L14;
                                      } else {
                                        if (stackIn_74_0 != stackIn_74_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var10++;
                                          if (var11 == 0) {
                                            continue L17;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            ((tj) this).field_B.field_i = 0;
                            ((tj) this).field_B.field_o = 0;
                            decompiledRegionSelector0 = 1;
                            break L14;
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L18: {
                    var7 = (RuntimeException) (Object) decompiledCaughtException;
                    ((tj) this).field_B.a((byte) 0);
                    ((ve) var4).a(true);
                    if (!((ve) var4).field_q) {
                      break L18;
                    } else {
                      if (!((tj) this).field_B.c((byte) 16)) {
                        var4 = (Object) (Object) ((tj) this).field_B.a(param2, true, ((tj) this).field_i, (byte) -80, (byte) 2);
                        ((tj) this).field_n.a((pg) var4, true, (long)param2);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                  }
                  stackOut_89_0 = null;
                  stackIn_90_0 = stackOut_89_0;
                  return (ve) (Object) stackIn_90_0;
                }
                L19: {
                  L20: {
                    if (decompiledRegionSelector0 == 0) {
                      break L20;
                    } else {
                      var5[var5.length - 2] = (byte)(((tj) this).field_k.field_y[param2] >>> -886375416);
                      var5[-1 + var5.length] = (byte)((tj) this).field_k.field_y[param2];
                      if (((tj) this).field_F == null) {
                        break L19;
                      } else {
                        ea discarded$1 = ((tj) this).field_s.a(param2, 115, var5, ((tj) this).field_F);
                        stackOut_92_0 = -2;
                        stackOut_92_1 = ~((tj) this).field_E[param2];
                        stackIn_94_0 = stackOut_92_0;
                        stackIn_94_1 = stackOut_92_1;
                        break L20;
                      }
                    }
                  }
                  if (stackIn_94_0 != stackIn_94_1) {
                    ((tj) this).field_E[param2] = (byte) 1;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L21: {
                  if (((ve) var4).field_q) {
                    break L21;
                  } else {
                    ((ve) var4).a(true);
                    break L21;
                  }
                }
                stackOut_100_0 = var4;
                stackIn_101_0 = stackOut_100_0;
                return (ve) (Object) stackIn_101_0;
              }
            } else {
              stackOut_54_0 = null;
              stackIn_55_0 = stackOut_54_0;
              return (ve) (Object) stackIn_55_0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L22: {
              var7_ref = (Exception) (Object) decompiledCaughtException;
              ((tj) this).field_E[param2] = (byte) -1;
              ((ve) var4).a(true);
              if (((ve) var4).field_q) {
                if (!((tj) this).field_B.c((byte) 67)) {
                  var4 = (Object) (Object) ((tj) this).field_B.a(param2, true, ((tj) this).field_i, (byte) -80, (byte) 2);
                  ((tj) this).field_n.a((pg) var4, true, (long)param2);
                  break L22;
                } else {
                  break L22;
                }
              } else {
                break L22;
              }
            }
            stackOut_148_0 = null;
            stackIn_149_0 = stackOut_148_0;
            return (ve) (Object) stackIn_149_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw aa.a((Throwable) var4, "tj.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final byte[] a(int param0, boolean param1) {
        ve var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var3 = this.a(0, 55, param0);
            if (var3 != null) {
              var4 = var3.c(-108);
              var3.a(param1);
              stackOut_3_0 = (byte[]) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3_ref, "tj.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_A = null;
              field_u = null;
              field_o = null;
              if (param0 >= 65) {
                break L1;
              } else {
                tj.a(true, (byte) -36);
                break L1;
              }
            }
            field_t = null;
            field_y = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "tj.N(" + param0 + ')');
        }
    }

    final int a(int param0, byte param1) {
        ve var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              var3 = (ve) (Object) ((tj) this).field_n.a((long)param0, -43);
              if (param1 >= 119) {
                break L1;
              } else {
                ((tj) this).f((byte) -99);
                break L1;
              }
            }
            if (var3 != null) {
              stackOut_6_0 = var3.e((byte) -121);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3_ref, "tj.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    tj(int param0, be param1, be param2, lk param3, pa param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        ((tj) this).field_n = new di(16);
        ((tj) this).field_p = 0;
        ((tj) this).field_m = new vn();
        ((tj) this).field_r = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((tj) this).field_F = param1;
                ((tj) this).field_i = param0;
                if (((tj) this).field_F != null) {
                  break L2;
                } else {
                  ((tj) this).field_j = false;
                  if (!ArcanistsMulti.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((tj) this).field_j = true;
              ((tj) this).field_h = new vn();
              break L1;
            }
            L3: {
              ((tj) this).field_z = param8;
              ((tj) this).field_D = param2;
              ((tj) this).field_v = param7;
              ((tj) this).field_s = param4;
              ((tj) this).field_w = param6;
              ((tj) this).field_q = param5;
              ((tj) this).field_B = param3;
              if (((tj) this).field_D == null) {
                break L3;
              } else {
                ((tj) this).field_x = (ve) (Object) ((tj) this).field_s.a(((tj) this).field_D, ((tj) this).field_i, -6833);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var10;
            stackOut_9_1 = new StringBuilder().append("tj.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param5).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param6 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L8;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "<%0> is offering a rematch.";
        field_C = 9;
    }
}
