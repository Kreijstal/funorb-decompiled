/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he {
    private ca[] field_e;
    private int field_d;
    static String field_i;
    static String[] field_f;
    private long field_j;
    private ca field_g;
    static aj field_c;
    static String field_b;
    static dg field_h;
    static String field_a;

    final void a(ca param0, long param1, byte param2) {
        ca var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (null != param0.field_m) {
                param0.b(12);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var5 = ((he) this).field_e[(int)(param1 & (long)(((he) this).field_d - 1))];
              param0.field_l = var5;
              param0.field_m = var5.field_m;
              param0.field_m.field_l = param0;
              param0.field_l.field_m = param0;
              if (param2 == 64) {
                break L2;
              } else {
                he.a(-19);
                break L2;
              }
            }
            param0.field_j = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5_ref;
            stackOut_9_1 = new StringBuilder().append("he.C(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, pk param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_12_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_48_0 = 0;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        var19 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = kb.a((-param3 + param0) * 3, 16);
            var6 = param3 * 3;
            var7 = var5_int + -10;
            int discarded$1 = 102;
            oj.a();
            if (param2 >= 103) {
              L1: {
                if (param1.field_N <= 0) {
                  break L1;
                } else {
                  if (param1.field_J == null) {
                    break L1;
                  } else {
                    ug.a((byte) 122);
                    break L1;
                  }
                }
              }
              wb.field_i = 0;
              var8 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (~param1.field_H >= ~var8) {
                      break L4;
                    } else {
                      var9 = param1.field_a[var8];
                      var10 = param1.field_k[var8];
                      var11 = param1.field_B[var8];
                      stackOut_11_0 = 0;
                      stackIn_49_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var19 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_12_0 == 0) {
                              break L6;
                            } else {
                              var12 = ej.field_c[var9];
                              var13 = fk.field_d[var9];
                              var14 = -var12 + ej.field_c[var10];
                              var15 = -var12 + ej.field_c[var11];
                              var16 = fk.field_d[var10] + -var13;
                              var17 = fk.field_d[var11] - var13;
                              if (-(var16 * var15) + var14 * var17 < 0) {
                                break L6;
                              } else {
                                if (var19 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L7: {
                            var12 = qd.field_a[var9];
                            if (var12 != -2147483648) {
                              break L7;
                            } else {
                              if (var19 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var13 = qd.field_a[var10];
                          if (var13 == -2147483648) {
                            break L5;
                          } else {
                            var14 = qd.field_a[var11];
                            if (-2147483648 == var14) {
                              break L5;
                            } else {
                              L8: {
                                var15 = -var6 + var14 + (var13 + var12);
                                if (0 > var7) {
                                  stackOut_28_0 = var15 << -var7;
                                  stackIn_29_0 = stackOut_28_0;
                                  break L8;
                                } else {
                                  stackOut_26_0 = var15 >> var7;
                                  stackIn_29_0 = stackOut_26_0;
                                  break L8;
                                }
                              }
                              var16 = -stackIn_29_0 + qg.field_b.length + -1;
                              var17 = qg.field_b[var16];
                              L9: while (true) {
                                L10: {
                                  L11: {
                                    if (var17 >> 4 == 0) {
                                      break L11;
                                    } else {
                                      var16--;
                                      stackOut_31_0 = -1;
                                      stackOut_31_1 = ~var16;
                                      stackIn_40_0 = stackOut_31_0;
                                      stackIn_40_1 = stackOut_31_1;
                                      stackIn_32_0 = stackOut_31_0;
                                      stackIn_32_1 = stackOut_31_1;
                                      if (var19 != 0) {
                                        break L10;
                                      } else {
                                        L12: {
                                          if (stackIn_32_0 >= stackIn_32_1) {
                                            break L12;
                                          } else {
                                            System.err.println("Out of range!");
                                            if (var19 == 0) {
                                              break L5;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        var17 = qg.field_b[var16];
                                        if (var19 == 0) {
                                          continue L9;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_39_0 = var16 << 4;
                                  stackOut_39_1 = -var17;
                                  stackIn_40_0 = stackOut_39_0;
                                  stackIn_40_1 = stackOut_39_1;
                                  break L10;
                                }
                                L13: {
                                  var18 = stackIn_40_0 - stackIn_40_1;
                                  bf.field_a[var18] = var8;
                                  qg.field_b[var16] = var17 - -1;
                                  if (param1.field_N <= 0) {
                                    break L13;
                                  } else {
                                    if (param1.field_J == null) {
                                      break L13;
                                    } else {
                                      bd.field_l[param1.field_J[var8]] = bd.field_l[param1.field_J[var8]] + 1;
                                      break L13;
                                    }
                                  }
                                }
                                wb.field_i = wb.field_i + 1;
                                break L5;
                              }
                            }
                          }
                        }
                        var8++;
                        if (var19 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_48_0 = ~param1.field_N;
                  stackIn_49_0 = stackOut_48_0;
                  break L3;
                }
                L14: {
                  L15: {
                    if (stackIn_49_0 >= -1) {
                      break L15;
                    } else {
                      if (null == param1.field_J) {
                        break L15;
                      } else {
                        var8 = 0;
                        var9 = 0;
                        L16: while (true) {
                          if (bd.field_l.length <= var9) {
                            break L15;
                          } else {
                            var10 = bd.field_l[var9];
                            bd.field_l[var9] = var8;
                            var8 = var8 + var10;
                            var9++;
                            if (var19 != 0) {
                              break L14;
                            } else {
                              if (var19 == 0) {
                                continue L16;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  break L14;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var5 = decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var5;
            stackOut_60_1 = new StringBuilder().append("he.E(").append(param0).append(',');
            stackIn_63_0 = stackOut_60_0;
            stackIn_63_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L17;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_64_0 = stackOut_61_0;
              stackIn_64_1 = stackOut_61_1;
              stackIn_64_2 = stackOut_61_2;
              break L17;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + ',' + param2 + ',' + param3 + ',' + false + ')');
        }
    }

    final ca b(int param0) {
        ca var2 = null;
        RuntimeException var2_ref = null;
        ca var3 = null;
        int var4 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        ca stackIn_13_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        ca stackOut_12_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (((he) this).field_g != null) {
              var2 = ((he) this).field_e[(int)((long)(((he) this).field_d + -1) & ((he) this).field_j)];
              if (param0 < -73) {
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var2 == ((he) this).field_g) {
                        break L3;
                      } else {
                        stackOut_8_0 = this;
                        stackIn_16_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          if (~((he) this).field_g.field_j != ~((he) this).field_j) {
                            ((he) this).field_g = ((he) this).field_g.field_l;
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          } else {
                            var3 = ((he) this).field_g;
                            ((he) this).field_g = ((he) this).field_g.field_l;
                            stackOut_12_0 = (ca) var3;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0;
                          }
                        }
                      }
                    }
                    stackOut_15_0 = this;
                    stackIn_16_0 = stackOut_15_0;
                    break L2;
                  }
                  ((he) this).field_g = null;
                  stackOut_16_0 = null;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (ca) (Object) stackIn_6_0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ca) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2_ref, "he.B(" + param0 + ')');
        }
        return (ca) (Object) stackIn_17_0;
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                int discarded$2 = 0;
                he.a(52, (pk) null, -70, 88);
                break L1;
              }
            }
            field_i = null;
            field_c = null;
            field_h = null;
            field_f = null;
            field_b = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "he.D(" + param0 + ')');
        }
    }

    he(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        ca var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            ((he) this).field_d = param0;
            ((he) this).field_e = new ca[param0];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var2_int <= ~param0) {
                    break L3;
                  } else {
                    ca dupTemp$2 = new ca();
                    ((he) this).field_e[var2_int] = dupTemp$2;
                    var3 = dupTemp$2;
                    var3.field_m = var3;
                    var3.field_l = var3;
                    var2_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ld.a((Throwable) (Object) runtimeException, "he.<init>(" + param0 + ')');
        }
    }

    final ca a(long param0, boolean param1) {
        ca var4 = null;
        RuntimeException var4_ref = null;
        ca var5 = null;
        int var6 = 0;
        Object stackIn_7_0 = null;
        ca stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        ca stackOut_10_0 = null;
        Object stackOut_13_0 = null;
        Object stackOut_14_0 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ((he) this).field_j = param0;
              if (param1) {
                break L1;
              } else {
                he.a(-81);
                break L1;
              }
            }
            var4 = ((he) this).field_e[(int)((long)(-1 + ((he) this).field_d) & param0)];
            ((he) this).field_g = var4.field_l;
            L2: while (true) {
              L3: {
                L4: {
                  if (((he) this).field_g == var4) {
                    break L4;
                  } else {
                    stackOut_6_0 = this;
                    stackIn_14_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (~((he) this).field_g.field_j != ~param0) {
                        ((he) this).field_g = ((he) this).field_g.field_l;
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      } else {
                        var5 = ((he) this).field_g;
                        ((he) this).field_g = ((he) this).field_g.field_l;
                        stackOut_10_0 = (ca) var5;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0;
                      }
                    }
                  }
                }
                stackOut_13_0 = this;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              }
              ((he) this).field_g = null;
              stackOut_14_0 = null;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var4_ref, "he.A(" + param0 + ',' + param1 + ')');
        }
        return (ca) (Object) stackIn_15_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Orb coins: <%0>";
        field_f = new String[]{"By rating", "By win percentage"};
        field_c = new aj(11, 0, 1, 2);
        field_b = "Unfortunately you are not eligible to create an account.";
        field_h = new dg();
        field_a = "Cancel";
    }
}
