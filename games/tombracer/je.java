/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends haa {
    int field_G;
    int field_K;
    static nh field_E;
    int field_H;
    Object[] field_I;
    private rla field_J;
    private il field_F;

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        String var10 = null;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (0 != param3) {
              return;
            } else {
              L1: {
                var5_int = param0 + ((je) this).field_i;
                var6 = param1 + ((je) this).field_n;
                bea.e(var5_int, var6, ((je) this).field_m, ((je) this).field_p, param2);
                var7 = ((je) this).field_G;
                if (((je) this).field_H == -1) {
                  break L1;
                } else {
                  var7 = ((je) this).field_H;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (((je) this).field_I != null) {
                    var8 = 0;
                    L4: while (true) {
                      if (~var8 <= ~((je) this).field_I.length) {
                        break L3;
                      } else {
                        var9 = ((je) this).field_I[var8];
                        var10 = var9.toString();
                        if (var11 != 0) {
                          break L2;
                        } else {
                          L5: {
                            if (~var7 == ~var8) {
                              bea.c(2 + var5_int, 4 + var6, -4 + ((je) this).field_m, ((je) this).field_K, 2188450, 128);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var6 = var6 + ((je) this).field_K;
                          ((je) this).field_F.c(var10, var5_int + 2, var6, 10000536, -1);
                          var8++;
                          if (var11 == 0) {
                            continue L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var5, "je.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final Object d(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 > 113) {
              L1: {
                L2: {
                  if (null == ((je) this).field_I) {
                    break L2;
                  } else {
                    if (((je) this).field_G != -1) {
                      stackOut_9_0 = ((je) this).field_I[((je) this).field_G];
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_7_0 = null;
                stackIn_10_0 = stackOut_7_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "je.J(" + param0 + ')');
        }
        return stackIn_10_0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_30_0 = 0;
        int stackOut_25_0 = 0;
        try {
          L0: {
            var6_int = 100 / ((-38 - param2) / 50);
            ((je) this).field_H = -1;
            if (!((je) this).field_J.field_G) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (!((je) this).field_J.field_F.field_A.field_f) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                if (((je) this).field_I == null) {
                  stackOut_13_0 = super.a(param0, param1, -107, param3, param4);
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                } else {
                  L1: {
                    param0 = param0 - (param1 - -((je) this).field_i);
                    param3 = param3 - (((je) this).field_n + param4);
                    if (param0 < 0) {
                      break L1;
                    } else {
                      if (0 > param3) {
                        break L1;
                      } else {
                        if (param0 > ((je) this).field_m) {
                          break L1;
                        } else {
                          if (param3 <= ((je) this).field_p) {
                            L2: {
                              ((je) this).field_H = param3 / ((je) this).field_K;
                              if (((je) this).field_I.length > ((je) this).field_H) {
                                break L2;
                              } else {
                                ((je) this).field_H = -1;
                                break L2;
                              }
                            }
                            stackOut_30_0 = 1;
                            stackIn_31_0 = stackOut_30_0;
                            break L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  return stackIn_26_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var6, "je.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_31_0 != 0;
    }

    final static iu a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        byte[] var2 = null;
        int[] var3 = null;
        int var4_int = 0;
        iu var4 = null;
        int var5 = 0;
        Object stackIn_9_0 = null;
        iu stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        iu stackOut_10_0 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = mq.field_b[0] * iga.field_m[0];
            var2 = ck.field_c[0];
            var3 = new int[var1_int];
            var4_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var4_int <= ~var1_int) {
                    break L3;
                  } else {
                    var3[var4_int] = mga.field_g[sea.c(255, (int) var2[var4_int])];
                    var4_int++;
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
                if (param0 == 69) {
                  break L2;
                } else {
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  return (iu) (Object) stackIn_9_0;
                }
              }
              var4 = new iu(ika.field_a, kba.field_s, ak.field_p[0], pg.field_C[0], mq.field_b[0], iga.field_m[0], var3);
              loa.a((byte) 113);
              stackOut_10_0 = (iu) var4;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "je.M(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    public static void g(byte param0) {
        try {
            field_E = null;
            if (param0 > -117) {
                iu discarded$0 = je.a((byte) 41);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "je.E(" + param0 + ')');
        }
    }

    final int c(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 23112) {
                break L1;
              } else {
                ((je) this).field_I[10] = ((je) this).field_I[0];
                break L1;
              }
            }
            L2: {
              if (null == ((je) this).field_I) {
                stackOut_6_0 = 200;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = ((je) this).field_K * (1 + ((je) this).field_I.length * 2) >> 1266672129;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "je.H(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    private final void a(Object[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            ((je) this).field_H = -1;
            if (param1 == 0) {
              L1: {
                ((je) this).field_I = param0;
                ((je) this).field_G = param2;
                if (null == param0) {
                  break L1;
                } else {
                  L2: {
                    if (((je) this).field_G < -1) {
                      break L2;
                    } else {
                      if (((je) this).field_G < ((je) this).field_I.length) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  throw new IllegalStateException();
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("je.F(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.b(param0, param1, param2, -109);
              if (param3 <= -40) {
                break L1;
              } else {
                ((je) this).field_I[3] = ((je) this).field_I[1];
                break L1;
              }
            }
            L2: {
              param0 = param0 - ((je) this).field_n;
              param2 = param2 - ((je) this).field_i;
              if (((je) this).field_I == null) {
                break L2;
              } else {
                var5_int = param0 / ((je) this).field_K;
                if (var5_int < 0) {
                  break L2;
                } else {
                  if (var5_int < ((je) this).field_I.length) {
                    ((je) this).field_G = var5_int;
                    ((je) this).field_J.a(99);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var5, "je.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    je(rla param0, il param1, Object[] param2, int param3) {
        super((ae) (Object) param0);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            ((je) this).field_F = param1;
            ((je) this).field_J = param0;
            ((je) this).field_K = ((je) this).field_F.field_w + ((je) this).field_F.field_k;
            this.a(param2, 0, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("je.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
