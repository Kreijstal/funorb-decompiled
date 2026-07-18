/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class f {
    static int[] field_c;
    static BitSet field_e;
    static int field_b;
    private cva[] field_d;
    private csa[] field_f;
    private int field_a;

    final void a(csa param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        cva var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (null == ((f) this).field_d) {
              return;
            } else {
              ((f) this).field_f = new csa[((f) this).field_d.length];
              if (!param1) {
                var3_int = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (~var3_int <= ~((f) this).field_d.length) {
                        break L3;
                      } else {
                        var4 = ((f) this).field_d[var3_int];
                        ((f) this).field_f[var3_int] = param0.a(var4.field_d, var4.field_a, 20);
                        var3_int++;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    ((f) this).field_d = null;
                    this.a(0);
                    break L2;
                  }
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("f.A(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3_int = 0;
        csa[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_24_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        Object stackOut_23_0 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3_int = param0;
            L1: while (true) {
              L2: {
                if (((f) this).field_f.length <= var3_int) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (null == ((f) this).field_f[var3_int]) {
                        break L4;
                      } else {
                        if (!((f) this).field_f[var3_int].k((byte) -115)) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    ((f) this).field_f[var3_int] = null;
                    var2_int++;
                    break L3;
                  }
                  var3_int++;
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = new csa[-var2_int + ((f) this).field_f.length];
              var2_int = 0;
              var4 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (~((f) this).field_f.length >= ~var4) {
                      break L7;
                    } else {
                      stackOut_13_0 = this;
                      stackIn_24_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (var5 != 0) {
                        break L6;
                      } else {
                        L8: {
                          L9: {
                            if (((f) this).field_f[var4] != null) {
                              break L9;
                            } else {
                              if (var5 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var3[var2_int] = ((f) this).field_f[var4];
                          var2_int++;
                          break L8;
                        }
                        var4++;
                        if (var5 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  stackOut_23_0 = this;
                  stackIn_24_0 = stackOut_23_0;
                  break L6;
                }
                ((f) this).field_f = var3;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "f.E(" + param0 + ')');
        }
    }

    final lj[] a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3_int = 0;
        lj[] var3 = null;
        csa var4_ref_csa = null;
        int var4 = 0;
        lj var5 = null;
        csa var5_ref = null;
        lj var6 = null;
        int var7 = 0;
        Object stackIn_16_0 = null;
        csa[] stackIn_20_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        csa[] stackOut_19_0 = null;
        lj[] stackOut_25_0 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (((f) this).field_f.length <= var3_int) {
                    break L3;
                  } else {
                    var4_ref_csa = ((f) this).field_f[var3_int];
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var4_ref_csa == null) {
                          break L4;
                        } else {
                          L5: {
                            var5 = var4_ref_csa.u(-91);
                            if (var5 != null) {
                              break L5;
                            } else {
                              if (var7 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var2_int++;
                          break L4;
                        }
                      }
                      var3_int++;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == -103) {
                  break L2;
                } else {
                  stackOut_15_0 = null;
                  stackIn_16_0 = stackOut_15_0;
                  return (lj[]) (Object) stackIn_16_0;
                }
              }
              var3 = new lj[var2_int];
              var2_int = 0;
              var4 = 0;
              L6: while (true) {
                L7: {
                  L8: {
                    if (((f) this).field_f.length <= var4) {
                      break L8;
                    } else {
                      stackOut_19_0 = ((f) this).field_f;
                      stackIn_26_0 = (Object) (Object) stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (var7 != 0) {
                        break L7;
                      } else {
                        L9: {
                          var5_ref = stackIn_20_0[var4];
                          if (null == var5_ref) {
                            break L9;
                          } else {
                            var6 = var5_ref.u(param0 + -24);
                            if (null == var6) {
                              break L9;
                            } else {
                              var3[var2_int] = var6;
                              var2_int++;
                              break L9;
                            }
                          }
                        }
                        var4++;
                        if (var7 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_25_0 = (lj[]) var3;
                  stackIn_26_0 = (Object) (Object) stackOut_25_0;
                  break L7;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "f.C(" + param0 + ')');
        }
        return (lj[]) (Object) stackIn_26_0;
    }

    final static String a(int param0, boolean param1, int param2, long param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_44_0 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 44;
              var7 = 46;
              if (0 == param2) {
                var6_int = 46;
                var7 = 44;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 2) {
                var7 = 160;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var8 = 0;
              if (param3 >= 0L) {
                break L3;
              } else {
                var8 = 1;
                param3 = -param3;
                break L3;
              }
            }
            L4: {
              var9 = new StringBuilder(26);
              if (param4 > 0) {
                var10 = 0;
                L5: while (true) {
                  L6: {
                    if (param4 <= var10) {
                      break L6;
                    } else {
                      var11 = (int)param3;
                      param3 = param3 / 10L;
                      StringBuilder discarded$6 = var9.append((char)(-((int)param3 * 10) + var11 + 48));
                      var10++;
                      if (var12 != 0) {
                        break L4;
                      } else {
                        if (var12 == 0) {
                          continue L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  StringBuilder discarded$7 = var9.append((char) var6_int);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L7: {
              if (param0 == 2843) {
                break L7;
              } else {
                int discarded$8 = f.a(true);
                break L7;
              }
            }
            var10 = 0;
            L8: while (true) {
              L9: {
                L10: {
                  L11: {
                    var11 = (int)param3;
                    param3 = param3 / 10L;
                    StringBuilder discarded$9 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
                    if (param3 != 0L) {
                      break L11;
                    } else {
                      if (var12 != 0) {
                        break L10;
                      } else {
                        if (var12 == 0) {
                          break L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  if (!param1) {
                    break L10;
                  } else {
                    var10++;
                    if (0 == var10 % 3) {
                      StringBuilder discarded$10 = var9.append((char) var7);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                if (var12 == 0) {
                  continue L8;
                } else {
                  break L9;
                }
              }
              L12: {
                if (var8 != 0) {
                  StringBuilder discarded$11 = var9.append('-');
                  break L12;
                } else {
                  break L12;
                }
              }
              stackOut_44_0 = var9.reverse().toString();
              stackIn_45_0 = stackOut_44_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var6, "f.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_45_0;
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              vo.field_b = false;
              if (kga.field_n != null) {
                kga.field_n.a(true);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var1_int = -18 % ((-10 - param0) / 43);
              if (bta.field_q != 0) {
                ufa.a(true);
                break L2;
              } else {
                break L2;
              }
            }
            wv.field_j = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "f.G(" + param0 + ')');
        }
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        double var1_double = 0.0;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        byte stackOut_35_0 = 0;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != bt.field_h) {
                break L1;
              } else {
                bt.field_h = new int[65536];
                if (var23 == 0) {
                  var1_double = Math.random() * 0.03 - 0.015 + 0.7;
                  var3 = 0;
                  var4 = 0;
                  L2: while (true) {
                    stackOut_5_0 = -513;
                    stackOut_5_1 = ~var4;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (stackIn_6_0 >= stackIn_6_1) {
                            break L5;
                          } else {
                            var5 = 360.0f * ((float)(var4 >> 508759011) / 64.0f + 0.0078125f);
                            var6 = 0.0625f + (float)(7 & var4) / 8.0f;
                            stackOut_7_0 = 0;
                            stackIn_36_0 = stackOut_7_0;
                            stackIn_8_0 = stackOut_7_0;
                            if (var23 != 0) {
                              break L4;
                            } else {
                              var7 = stackIn_8_0;
                              L6: while (true) {
                                L7: {
                                  if (var7 >= 128) {
                                    break L7;
                                  } else {
                                    var8 = (float)var7 / 128.0f;
                                    var9 = 0.0f;
                                    var10 = 0.0f;
                                    var11 = 0.0f;
                                    var12 = var5 / 60.0f;
                                    var13 = (int)var12;
                                    var14 = var13 % 6;
                                    var15 = var12 - (float)var13;
                                    var16 = (-var6 + 1.0f) * var8;
                                    var17 = var8 * (1.0f - var15 * var6);
                                    var18 = var8 * (-(var6 * (1.0f - var15)) + 1.0f);
                                    stackOut_10_0 = 0;
                                    stackOut_10_1 = var14;
                                    stackIn_6_0 = stackOut_10_0;
                                    stackIn_6_1 = stackOut_10_1;
                                    stackIn_11_0 = stackOut_10_0;
                                    stackIn_11_1 = stackOut_10_1;
                                    if (var23 != 0) {
                                      continue L3;
                                    } else {
                                      L8: {
                                        L9: {
                                          if (stackIn_11_0 != stackIn_11_1) {
                                            break L9;
                                          } else {
                                            var9 = var8;
                                            var11 = var16;
                                            var10 = var18;
                                            if (var23 == 0) {
                                              break L8;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        L10: {
                                          if (var14 == 1) {
                                            break L10;
                                          } else {
                                            L11: {
                                              if (var14 == 2) {
                                                break L11;
                                              } else {
                                                L12: {
                                                  if (var14 == 3) {
                                                    break L12;
                                                  } else {
                                                    L13: {
                                                      if (var14 == 4) {
                                                        break L13;
                                                      } else {
                                                        if (var14 != 5) {
                                                          break L8;
                                                        } else {
                                                          var11 = var17;
                                                          var9 = var8;
                                                          var10 = var16;
                                                          if (var23 == 0) {
                                                            break L8;
                                                          } else {
                                                            break L13;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var11 = var8;
                                                    var9 = var18;
                                                    var10 = var16;
                                                    if (var23 == 0) {
                                                      break L8;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                                var10 = var17;
                                                var11 = var8;
                                                var9 = var16;
                                                if (var23 == 0) {
                                                  break L8;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                            var9 = var16;
                                            var11 = var18;
                                            var10 = var8;
                                            if (var23 == 0) {
                                              break L8;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        var9 = var17;
                                        var10 = var8;
                                        var11 = var16;
                                        break L8;
                                      }
                                      var9 = (float)Math.pow((double)var9, var1_double);
                                      var10 = (float)Math.pow((double)var10, var1_double);
                                      var11 = (float)Math.pow((double)var11, var1_double);
                                      var19 = (int)(256.0f * var9);
                                      var20 = (int)(256.0f * var10);
                                      var21 = (int)(var11 * 256.0f);
                                      var22 = var21 + ((var19 << 1215244016) + -16777216) - -(var20 << -2110225432);
                                      int incrementValue$1 = var3;
                                      var3++;
                                      bt.field_h[incrementValue$1] = var22;
                                      var7++;
                                      if (var23 == 0) {
                                        continue L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                var4++;
                                if (var23 == 0) {
                                  continue L2;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        stackOut_35_0 = param0;
                        stackIn_36_0 = stackOut_35_0;
                        break L4;
                      }
                      L14: {
                        if (stackIn_36_0 == 58) {
                          break L14;
                        } else {
                          f.b((byte) 1);
                          break L14;
                        }
                      }
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "f.F(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        try {
            field_e = null;
            field_c = null;
            if (param0 != 24641) {
                field_b = -112;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "f.H(" + param0 + ')');
        }
    }

    final static int a(boolean param0) {
        RuntimeException var1 = null;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                f.b((byte) -68);
                break L1;
              }
            }
            L2: {
              if (!lca.a(param0)) {
                break L2;
              } else {
                if (null != wu.field_a.a((byte) 127)) {
                  stackOut_9_0 = wu.field_a.a((byte) -73).field_i;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            stackOut_7_0 = -1;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "f.I(" + param0 + ')');
        }
        return stackIn_10_0;
    }

    f(int param0, int param1) {
        try {
            ((f) this).field_a = param0;
            ((f) this).field_f = new csa[]{};
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "f.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    f(int param0, int param1, int param2, kh param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        cva[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        cva stackIn_5_2 = null;
        cva stackIn_5_3 = null;
        cva[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        cva stackIn_7_2 = null;
        cva stackIn_7_3 = null;
        cva[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        cva stackIn_9_2 = null;
        cva stackIn_9_3 = null;
        cva[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        cva stackIn_10_2 = null;
        cva stackIn_10_3 = null;
        int stackIn_10_4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        cva[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        cva stackOut_4_2 = null;
        cva stackOut_4_3 = null;
        cva[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        cva stackOut_9_2 = null;
        cva stackOut_9_3 = null;
        int stackOut_9_4 = 0;
        cva[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        cva stackOut_5_2 = null;
        cva stackOut_5_3 = null;
        cva[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        cva stackOut_7_2 = null;
        cva stackOut_7_3 = null;
        int stackOut_7_4 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            ((f) this).field_a = param0;
            var5_int = param3.b((byte) 44, iia.d(param0, 22972));
            ((f) this).field_f = new csa[var5_int];
            ((f) this).field_d = new cva[var5_int];
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var6 <= ~var5_int) {
                    break L3;
                  } else {
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        stackOut_4_0 = ((f) this).field_d;
                        stackOut_4_1 = var6;
                        stackOut_4_2 = null;
                        stackOut_4_3 = null;
                        stackIn_9_0 = stackOut_4_0;
                        stackIn_9_1 = stackOut_4_1;
                        stackIn_9_2 = stackOut_4_2;
                        stackIn_9_3 = stackOut_4_3;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        stackIn_5_2 = stackOut_4_2;
                        stackIn_5_3 = stackOut_4_3;
                        if (param3.b((byte) 44, 1) != 1) {
                          stackOut_9_0 = (cva[]) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = null;
                          stackOut_9_3 = null;
                          stackOut_9_4 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          stackIn_10_2 = stackOut_9_2;
                          stackIn_10_3 = stackOut_9_3;
                          stackIn_10_4 = stackOut_9_4;
                          break L4;
                        } else {
                          stackOut_5_0 = (cva[]) (Object) stackIn_5_0;
                          stackOut_5_1 = stackIn_5_1;
                          stackOut_5_2 = null;
                          stackOut_5_3 = null;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          stackIn_7_2 = stackOut_5_2;
                          stackIn_7_3 = stackOut_5_3;
                          stackOut_7_0 = (cva[]) (Object) stackIn_7_0;
                          stackOut_7_1 = stackIn_7_1;
                          stackOut_7_2 = null;
                          stackOut_7_3 = null;
                          stackOut_7_4 = 1;
                          stackIn_10_0 = stackOut_7_0;
                          stackIn_10_1 = stackOut_7_1;
                          stackIn_10_2 = stackOut_7_2;
                          stackIn_10_3 = stackOut_7_3;
                          stackIn_10_4 = stackOut_7_4;
                          break L4;
                        }
                      }
                      stackIn_10_0[stackIn_10_1] = new cva(stackIn_10_4 != 0, param3.b((byte) 44, 8));
                      var6++;
                      if (var7 == 0) {
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
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("f.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final void a(kh param0, int param1, csa param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
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
        RuntimeException decompiledCaughtException = null;
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
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 105) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            this.a(0);
            param0.a((byte) 44, ((f) this).field_f.length, iia.d(((f) this).field_a, 22972));
            var4_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (((f) this).field_f.length <= var4_int) {
                    break L4;
                  } else {
                    if (var5 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (param2 == ((f) this).field_f[var4_int].o((byte) -48)) {
                            break L6;
                          } else {
                            param0.a((byte) 73, 0, 1);
                            param0.a((byte) 111, ((f) this).field_f[var4_int].n(31974).a((byte) 62), 8);
                            if (var5 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        param0.a((byte) -127, 1, 1);
                        param0.a((byte) -126, ((f) this).field_f[var4_int].i((byte) 84).a((byte) 115), 8);
                        break L5;
                      }
                      var4_int++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("f.B(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    static {
    }
}
