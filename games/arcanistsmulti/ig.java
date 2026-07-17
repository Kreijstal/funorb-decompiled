/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static boolean[] field_a;
    private int field_e;
    static String field_d;
    static int field_g;
    private int field_f;
    private gb field_b;
    private pk field_c;

    final static void a(boolean param0, vg param1, int param2, byte param3, int param4) {
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
        int stackIn_10_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
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
        int stackOut_9_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
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
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = jl.a((byte) -79, (-param4 + param2) * 3);
              var6 = param4 * 3;
              tl.e((byte) -79);
              var7 = -10 + var5_int;
              if (param1.field_F <= 0) {
                break L1;
              } else {
                if (param1.field_H == null) {
                  break L1;
                } else {
                  int discarded$1 = -24000;
                  im.d();
                  break L1;
                }
              }
            }
            ol.field_i = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (param1.field_G <= var8) {
                    break L4;
                  } else {
                    var9 = param1.field_U[var8];
                    var10 = param1.field_T[var8];
                    var11 = param1.field_O[var8];
                    stackOut_9_0 = 0;
                    stackIn_49_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_10_0 == 0) {
                            break L6;
                          } else {
                            var12 = ud.field_p[var9];
                            var13 = v.field_g[var9];
                            var14 = -var12 + ud.field_p[var10];
                            var15 = -var12 + ud.field_p[var11];
                            var16 = -var13 + v.field_g[var10];
                            var17 = v.field_g[var11] - var13;
                            if (-(var15 * var16) + var14 * var17 < 0) {
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
                          var12 = eg.field_a[var9];
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
                        var13 = eg.field_a[var10];
                        if (var13 == -2147483648) {
                          break L5;
                        } else {
                          L8: {
                            var14 = eg.field_a[var11];
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
                            var15 = -var6 + var14 + (var13 + var12);
                            if (var7 < 0) {
                              stackOut_29_0 = var15 << -var7;
                              stackIn_30_0 = stackOut_29_0;
                              break L9;
                            } else {
                              stackOut_27_0 = var15 >> var7;
                              stackIn_30_0 = stackOut_27_0;
                              break L9;
                            }
                          }
                          var16 = -stackIn_30_0 + (-1 + kl.field_B.length);
                          var17 = kl.field_B[var16];
                          L10: while (true) {
                            L11: {
                              L12: {
                                if (0 == var17 >> 4) {
                                  break L12;
                                } else {
                                  var16--;
                                  stackOut_32_0 = 0;
                                  stackOut_32_1 = var16;
                                  stackIn_40_0 = stackOut_32_0;
                                  stackIn_40_1 = stackOut_32_1;
                                  stackIn_33_0 = stackOut_32_0;
                                  stackIn_33_1 = stackOut_32_1;
                                  if (var19 != 0) {
                                    break L11;
                                  } else {
                                    L13: {
                                      if (stackIn_33_0 > stackIn_33_1) {
                                        System.err.println("Out of range!");
                                        if (var19 == 0) {
                                          break L5;
                                        } else {
                                          break L13;
                                        }
                                      } else {
                                        break L13;
                                      }
                                    }
                                    var17 = kl.field_B[var16];
                                    if (var19 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              stackOut_39_0 = var17;
                              stackOut_39_1 = var16 << 4;
                              stackIn_40_0 = stackOut_39_0;
                              stackIn_40_1 = stackOut_39_1;
                              break L11;
                            }
                            L14: {
                              var18 = stackIn_40_0 + stackIn_40_1;
                              w.field_Lb[var18] = var8;
                              kl.field_B[var16] = 1 + var17;
                              if (param1.field_F <= 0) {
                                break L14;
                              } else {
                                if (null == param1.field_H) {
                                  break L14;
                                } else {
                                  jb.field_s[param1.field_H[var8]] = jb.field_s[param1.field_H[var8]] + 1;
                                  break L14;
                                }
                              }
                            }
                            ol.field_i = ol.field_i + 1;
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
                stackOut_48_0 = 0;
                stackIn_49_0 = stackOut_48_0;
                break L3;
              }
              L15: {
                L16: {
                  if (stackIn_49_0 >= param1.field_F) {
                    break L16;
                  } else {
                    if (param1.field_H == null) {
                      break L16;
                    } else {
                      var8 = 0;
                      var9 = 0;
                      L17: while (true) {
                        if (~jb.field_s.length >= ~var9) {
                          break L16;
                        } else {
                          var10 = jb.field_s[var9];
                          jb.field_s[var9] = var8;
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
                    }
                  }
                }
                break L15;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var5;
            stackOut_60_1 = new StringBuilder().append("ig.H(").append(0).append(44);
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
              break L18;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_64_0 = stackOut_61_0;
              stackIn_64_1 = stackOut_61_1;
              stackIn_64_2 = stackOut_61_2;
              break L18;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + 44 + param2 + 44 + -79 + 44 + param4 + 41);
        }
    }

    private final void a(byte param0, int param1, long param2, Object param3) {
        nn var6 = null;
        nh var6_ref = null;
        RuntimeException var6_ref2 = null;
        int var7 = 0;
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
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (~param1 < ~((ig) this).field_e) {
              throw new IllegalStateException();
            } else {
              this.a(-104, param2);
              ((ig) this).field_f = ((ig) this).field_f - param1;
              L1: while (true) {
                L2: {
                  if (((ig) this).field_f >= 0) {
                    break L2;
                  } else {
                    var6 = (nn) (Object) ((ig) this).field_b.b(31);
                    int discarded$2 = 2147483647;
                    this.a(var6);
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var6_ref = new nh(param3, param1);
                  ((ig) this).field_c.a((byte) -68, (pg) (Object) var6_ref, param2);
                  ((ig) this).field_b.a((byte) 37, (tf) (Object) var6_ref);
                  ((nn) (Object) var6_ref).field_k = 0L;
                  if (param0 < -99) {
                    break L3;
                  } else {
                    this.a((byte) -27, 45, 65L, (Object) null);
                    break L3;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6_ref2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6_ref2;
            stackOut_12_1 = new StringBuilder().append("ig.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    private final void a(int param0, long param1) {
        RuntimeException var4 = null;
        nn var4_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_ref = (nn) (Object) ((ig) this).field_c.a((byte) -79, param1);
            int discarded$1 = 2147483647;
            this.a(var4_ref);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "ig.B(" + -104 + 44 + param1 + 41);
        }
    }

    final void a(Object param0, long param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a((byte) -102, 1, param1, param0);
              if (param2 < -59) {
                break L1;
              } else {
                ((ig) this).field_c = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ig.C(");
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
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(nn param0) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                param0.a(true);
                param0.a((byte) 88);
                ((ig) this).field_f = ((ig) this).field_f + param0.field_r;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ig.E(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + 2147483647 + 41);
        }
    }

    final Object a(long param0, boolean param1) {
        nn var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        nh var6 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var4 = (nn) (Object) ((ig) this).field_c.a((byte) 118, param0);
            if (var4 != null) {
              var5 = var4.e((byte) 110);
              if (!param1) {
                if (var5 == null) {
                  var4.a(true);
                  var4.a((byte) 88);
                  ((ig) this).field_f = ((ig) this).field_f + var4.field_r;
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  L1: {
                    L2: {
                      if (var4.f((byte) 96)) {
                        break L2;
                      } else {
                        ((ig) this).field_b.a((byte) 37, (tf) (Object) var4);
                        var4.field_k = 0L;
                        if (!ArcanistsMulti.field_G) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var6 = new nh(var5, var4.field_r);
                    ((ig) this).field_c.a((byte) -99, (pg) (Object) var6, var4.field_e);
                    ((ig) this).field_b.a((byte) 37, (tf) (Object) var6);
                    ((nn) (Object) var6).field_k = 0L;
                    var4.a(true);
                    var4.a((byte) 88);
                    break L1;
                  }
                  stackOut_16_0 = var5;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4_ref, "ig.D(" + param0 + 44 + param1 + 41);
        }
        return stackIn_17_0;
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_a = null;
            field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "ig.A(" + 0 + 41);
        }
    }

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (ce.field_h > 0) {
                if (!pg.field_d) {
                  break L1;
                } else {
                  de.b(0, 0, de.field_e, n.field_g.field_nb);
                  gm.field_h.a(param1, true);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (sm.field_a > 0) {
                  break L3;
                } else {
                  if (oo.field_y <= 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (!so.field_j) {
                break L2;
              } else {
                de.b(0, 0, de.field_e, n.field_g.field_nb);
                nl.field_Fb.a(param1, true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ig.F(" + 0 + 44 + param1 + 41);
        }
    }

    ig(int param0) {
        this(param0, param0);
    }

    private ig(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        ((ig) this).field_b = new gb();
        try {
          L0: {
            ((ig) this).field_e = param0;
            ((ig) this).field_f = param0;
            var3_int = 1;
            L1: while (true) {
              L2: {
                if (~param0 >= ~(var3_int - -var3_int)) {
                  break L2;
                } else {
                  if (~param1 >= ~var3_int) {
                    break L2;
                  } else {
                    var3_int = var3_int + var3_int;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              ((ig) this).field_c = new pk(var3_int);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "ig.<init>(" + param0 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Show chat (<%0> unread messages)";
        field_a = new boolean[]{true, false, true, false, true, true, true, false, false, false, false, false, false, false, true, false, false, false, false, false, true, true, true, true, true, true, true, true, false, false, false, true, true, false, false, false, true, true, true, false, true, false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
        field_g = 64;
    }
}
