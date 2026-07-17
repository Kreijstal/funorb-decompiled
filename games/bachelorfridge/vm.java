/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vm {
    in field_f;
    static sna field_i;
    static String field_g;
    in field_a;
    in field_c;
    in field_l;
    long field_b;
    lu field_n;
    int field_j;
    lu field_d;
    volatile int field_k;
    volatile int field_e;
    byte field_m;
    qfa field_h;

    final static String a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              var3 = new char[var2_int];
              if (param1 >= 102) {
                break L1;
              } else {
                vm.a(false, -62, 51, (ma) null, true);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var4 >= var2_int) {
                  break L3;
                } else {
                  var3[-1 + var2_int - var4] = param0.charAt(var4);
                  var4++;
                  if (var5 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = new String(var3);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("vm.J(");
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
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_8_0;
    }

    abstract void b(byte param0);

    final int d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((vm) this).field_e = 112;
                break L1;
              }
            }
            stackOut_3_0 = ((vm) this).field_f.b(true) - -((vm) this).field_a.b(true);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "vm.G(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final qfa a(int param0, int param1, int param2, byte param3, boolean param4) {
        long var6_long = 0L;
        RuntimeException var6 = null;
        qfa var8 = null;
        Object stackIn_2_0 = null;
        qfa stackIn_19_0 = null;
        RuntimeException decompiledCaughtException = null;
        qfa stackOut_18_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param2 > 120) {
              L1: {
                L2: {
                  var6_long = ((long)param0 << 32) + (long)param1;
                  var8 = new qfa();
                  var8.field_q = param4;
                  var8.field_h = var6_long;
                  var8.field_s = param3;
                  if (param4) {
                    break L2;
                  } else {
                    if (((vm) this).a(-117) >= 20) {
                      throw new RuntimeException();
                    } else {
                      ((vm) this).field_c.a((eo) (Object) var8, (byte) 110);
                      if (BachelorFridge.field_y == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                if (((vm) this).d((byte) 0) >= 20) {
                  throw new RuntimeException();
                } else {
                  ((vm) this).field_f.a((eo) (Object) var8, (byte) -120);
                  break L1;
                }
              }
              stackOut_18_0 = (qfa) var8;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (qfa) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var6, "vm.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_19_0;
    }

    final static void a(boolean param0, int param1, int param2, ma param3, boolean param4) {
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
        boolean stackIn_13_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0 = false;
        int stackOut_26_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_40_0 = 0;
        byte stackOut_50_0 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        var19 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0) {
              L1: {
                var5_int = mda.a((-param1 + param2) * 3, 16);
                var6 = param1 * 3;
                var7 = var5_int + -10;
                int discarded$2 = 89;
                qh.c();
                if (param3.field_n <= 0) {
                  break L1;
                } else {
                  if (param3.field_d != null) {
                    int discarded$3 = -11163;
                    ej.a();
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              lq.field_y = 0;
              var8 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (param3.field_K <= var8) {
                      break L4;
                    } else {
                      var9 = param3.field_C[var8];
                      var10 = param3.field_h[var8];
                      var11 = param3.field_t[var8];
                      stackOut_12_0 = param4;
                      stackIn_51_0 = stackOut_12_0 ? 1 : 0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var19 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (!stackIn_13_0) {
                              break L6;
                            } else {
                              var12 = du.field_e[var9];
                              var13 = ew.field_s[var9];
                              var14 = -var12 + du.field_e[var10];
                              var15 = -var12 + du.field_e[var11];
                              var16 = -var13 + ew.field_s[var10];
                              var17 = -var13 + ew.field_s[var11];
                              if (-(var15 * var16) + var14 * var17 >= 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var12 = dl.field_i[var9];
                          if (-2147483648 == var12) {
                            break L5;
                          } else {
                            L7: {
                              var13 = dl.field_i[var10];
                              if (var13 != -2147483648) {
                                break L7;
                              } else {
                                if (var19 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              var14 = dl.field_i[var11];
                              if (var14 != -2147483648) {
                                break L8;
                              } else {
                                if (var19 == 0) {
                                  break L5;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              var15 = var12 - (-var13 + (-var14 + var6));
                              stackOut_26_0 = -1 + wa.field_m.length;
                              stackIn_29_0 = stackOut_26_0;
                              stackIn_27_0 = stackOut_26_0;
                              if (var7 >= 0) {
                                stackOut_29_0 = stackIn_29_0;
                                stackOut_29_1 = var15 >> var7;
                                stackIn_30_0 = stackOut_29_0;
                                stackIn_30_1 = stackOut_29_1;
                                break L9;
                              } else {
                                stackOut_27_0 = stackIn_27_0;
                                stackOut_27_1 = var15 << -var7;
                                stackIn_30_0 = stackOut_27_0;
                                stackIn_30_1 = stackOut_27_1;
                                break L9;
                              }
                            }
                            var16 = stackIn_30_0 + -stackIn_30_1;
                            var17 = wa.field_m[var16];
                            L10: while (true) {
                              L11: {
                                L12: {
                                  if (var17 >> 4 == 0) {
                                    break L12;
                                  } else {
                                    var16--;
                                    stackOut_32_0 = var16;
                                    stackIn_41_0 = stackOut_32_0;
                                    stackIn_33_0 = stackOut_32_0;
                                    if (var19 != 0) {
                                      break L11;
                                    } else {
                                      L13: {
                                        if (stackIn_33_0 >= 0) {
                                          break L13;
                                        } else {
                                          System.err.println("Out of range!");
                                          if (var19 == 0) {
                                            break L5;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      var17 = wa.field_m[var16];
                                      if (var19 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                stackOut_40_0 = var17 + (var16 << 4);
                                stackIn_41_0 = stackOut_40_0;
                                break L11;
                              }
                              L14: {
                                var18 = stackIn_41_0;
                                ci.field_q[var18] = var8;
                                wa.field_m[var16] = 1 + var17;
                                if (param3.field_n <= 0) {
                                  break L14;
                                } else {
                                  if (param3.field_d != null) {
                                    fg.field_a[param3.field_d[var8]] = fg.field_a[param3.field_d[var8]] + 1;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              lq.field_y = lq.field_y + 1;
                              break L5;
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
                  stackOut_50_0 = param3.field_n;
                  stackIn_51_0 = stackOut_50_0;
                  break L3;
                }
                L15: {
                  L16: {
                    if (stackIn_51_0 <= 0) {
                      break L16;
                    } else {
                      if (param3.field_d != null) {
                        var8 = 0;
                        var9 = 0;
                        L17: while (true) {
                          if (var9 >= fg.field_a.length) {
                            break L16;
                          } else {
                            var10 = fg.field_a[var9];
                            fg.field_a[var9] = var8;
                            var8 = var8 + var10;
                            var9++;
                            if (var19 != 0) {
                              break L15;
                            } else {
                              if (var19 == 0) {
                                continue L17;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      } else {
                        break L16;
                      }
                    }
                  }
                  break L15;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) var5;
            stackOut_64_1 = new StringBuilder().append("vm.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_67_0 = stackOut_64_0;
            stackIn_67_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param3 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L18;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_68_0 = stackOut_65_0;
              stackIn_68_1 = stackOut_65_1;
              stackIn_68_2 = stackOut_65_2;
              break L18;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + 44 + param4 + 41);
        }
    }

    abstract void a(boolean param0, Object param1, int param2);

    final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 <= -114) {
              stackOut_3_0 = ((vm) this).field_c.b(true) - -((vm) this).field_l.b(true);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -97;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "vm.K(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    abstract boolean c(byte param0);

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!param0) {
              L1: {
                if (20 > ((vm) this).a(-118)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "vm.C(" + param0 + 41);
        }
        return stackIn_7_0 != 0;
    }

    abstract void c(int param0);

    public static void a() {
        try {
            field_i = null;
            int var1_int = -1;
            field_g = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vm.H(" + -87 + 41);
        }
    }

    final boolean b(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 20) {
                break L1;
              } else {
                ((vm) this).field_b = -117L;
                break L1;
              }
            }
            L2: {
              if (((vm) this).d((byte) 0) < 20) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "vm.L(" + param0 + 41);
        }
        return stackIn_7_0 != 0;
    }

    vm() {
        ((vm) this).field_f = new in();
        ((vm) this).field_a = new in();
        ((vm) this).field_c = new in();
        ((vm) this).field_l = new in();
        ((vm) this).field_n = new lu(6);
        ((vm) this).field_e = 0;
        ((vm) this).field_m = (byte) 0;
        ((vm) this).field_k = 0;
        ((vm) this).field_d = new lu(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Fisticuffs</col>";
    }
}
