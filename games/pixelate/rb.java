/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class rb extends de {
    static String field_r;
    static int field_q;
    static int field_o;
    static String[] field_p;

    final void a(int param0, int param1, boolean param2) {
        try {
            jn.field_v = -1;
            jm.field_j = -1;
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "rb.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final String d(int param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (param1 == 7698) {
                break L1;
              } else {
                ((rb) this).a(-110, 30, true);
                break L1;
              }
            }
            if (param0 != 0) {
              stackOut_6_0 = we.field_o[((rb) this).field_k[param0]];
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = ge.field_b;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "rb.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    private final int f(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 < -95) {
              L1: {
                if (((rb) this).field_l != 9) {
                  stackOut_6_0 = de.field_n;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = go.field_k;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = -69;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "rb.I(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    private final boolean c(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 > 90) {
                break L1;
              } else {
                ((rb) this).b(6);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (8 != ((rb) this).field_l) {
                    break L4;
                  } else {
                    if (param0 < 16) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!this.a((byte) 66, param0)) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                } else {
                  break L3;
                }
              }
              stackOut_10_0 = 1;
              stackIn_13_0 = stackOut_10_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "rb.K(" + param0 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final int a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            stackOut_3_0 = ((rb) this).a(param0, (byte) 90) - -this.e(-112, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "rb.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final int b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var3_int = 25 / ((param0 - -13) / 37);
            stackOut_0_0 = ((rb) this).field_d;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "rb.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    private final int e(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 >= tn.field_n.length) {
                    break L3;
                  } else {
                    stackOut_3_0 = 1 << var3 & this.f(-111);
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 > 0) {
                          var2_int++;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var3++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_10_0 = var2_int;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "rb.V(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ob var3 = null;
        tc var4 = null;
        int var5 = 0;
        tf var6_ref_tf = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        tf var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (9 != ((rb) this).field_l) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2_int = stackIn_5_0;
              var3 = rk.field_e;
              if (param0 == 11) {
                break L2;
              } else {
                rk discarded$2 = rb.b(-94, (byte) 78);
                break L2;
              }
            }
            var4 = qj.field_e;
            gj.field_W[6].b(0, 45);
            ((rb) this).b((byte) -71);
            var5 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (~var5 <= ~tn.field_n.length) {
                    break L5;
                  } else {
                    var6_ref_tf = this.b((byte) 37, var5);
                    stackOut_10_0 = this.a((byte) 66, var5);
                    stackIn_30_0 = stackOut_10_0 ? 1 : 0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var15 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          if (stackIn_11_0) {
                            break L7;
                          } else {
                            if (var2_int != 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (!this.c(var5, (byte) 97)) {
                          break L6;
                        } else {
                          L8: {
                            var7 = this.d(var5, (byte) -54);
                            var8 = this.f(-111, var5);
                            if (~var5 != ~jm.field_j) {
                              break L8;
                            } else {
                              t.a(var7 - 3, -3 + var8, 38, 38, 6, 0, 128);
                              break L8;
                            }
                          }
                          L9: {
                            if (~var5 == ~jn.field_v) {
                              t.e(var7 - 3, var8 + -3, 38, 38, 6, 16777215);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var6_ref_tf.e(var7, var8);
                          break L6;
                        }
                      }
                      var5++;
                      if (var15 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_29_0 = ~jm.field_j;
                stackIn_30_0 = stackOut_29_0;
                break L4;
              }
              L10: {
                if (stackIn_30_0 == 0) {
                  stackOut_33_0 = jn.field_v;
                  stackIn_34_0 = stackOut_33_0;
                  break L10;
                } else {
                  stackOut_31_0 = jm.field_j;
                  stackIn_34_0 = stackOut_31_0;
                  break L10;
                }
              }
              L11: {
                L12: {
                  L13: {
                    var5 = stackIn_34_0;
                    if (-1 != var5) {
                      break L13;
                    } else {
                      int discarded$3 = var3.a(th.field_a, 30, 280, 580, 400, 0, -1, 1, 0, 30);
                      if (!jg.a((byte) 109)) {
                        break L12;
                      } else {
                        var6 = 280 + ((rb) this).field_d >> -269366303;
                        var4.b(mj.field_h, 320, var6, 16777215, 0);
                        if (var15 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  L14: {
                    L15: {
                      var6 = var3.field_z + var3.field_D;
                      var7 = var4.field_D + (var4.field_z - -3);
                      var3.b(tn.field_n[var5], 320, 280, 0, -1);
                      var8 = this.a((byte) 66, var5) ? 1 : 0;
                      if (var8 != 0) {
                        break L15;
                      } else {
                        var3.b(bf.field_t, 320, var6 + 280, 1, -1);
                        if (var15 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    var3.b(co.field_d, 320, 280 - -var6, 0, -1);
                    break L14;
                  }
                  var9 = this.b((byte) 37, var5);
                  var9.b(60, 120);
                  var10 = var4.a(this.a(true, var5), 120, 320, 400, 400, 16777215, 0, 0, 0, var7);
                  var11 = 320 + (var7 * var10 + 24);
                  var4.a(to.field_p + ri.field_c[var5], 120, var11, 16777215, 0);
                  var11 = var11 + (4 + var7);
                  var4.a(fh.field_K, 120, var11, 16777215, 0);
                  var12 = var4.c(fh.field_K) + 120;
                  var13 = var11;
                  var14 = 0;
                  L16: while (true) {
                    if (var14 >= ri.field_e[var5]) {
                      break L12;
                    } else {
                      vn.field_c.b((vn.field_c.field_A >> -1663174463) * var14 + var12, -vn.field_c.field_B + (var13 + 4));
                      var14++;
                      if (var15 != 0) {
                        break L11;
                      } else {
                        if (var15 == 0) {
                          continue L16;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                }
                break L11;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "rb.H(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_2_0 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            if (param0 == 4) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (~tn.field_n.length >= ~var4_int) {
                      break L3;
                    } else {
                      stackOut_5_0 = this.c(var4_int, (byte) 95);
                      stackIn_26_0 = stackOut_5_0 ? 1 : 0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_6_0) {
                              break L5;
                            } else {
                              if (var7 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var5 = this.d(var4_int, (byte) -89);
                          var6 = this.f(124, var4_int);
                          if (~var5 <= ~param1) {
                            break L4;
                          } else {
                            if (~var6 <= ~param2) {
                              break L4;
                            } else {
                              if (~param1 <= ~(var5 - -32)) {
                                break L4;
                              } else {
                                if (param2 >= var6 - -32) {
                                  break L4;
                                } else {
                                  stackOut_22_0 = var4_int;
                                  stackIn_23_0 = stackOut_22_0;
                                  return stackIn_23_0;
                                }
                              }
                            }
                          }
                        }
                        var4_int++;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_25_0 = -1;
                  stackIn_26_0 = stackOut_25_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 126;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "rb.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_26_0;
    }

    final int a(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = -40;
              var4 = 0;
              if (param1 == 90) {
                break L1;
              } else {
                field_q = 120;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (~((rb) this).field_g.field_h >= ~var4) {
                    break L4;
                  } else {
                    var3_int = var3_int + (40 + this.e(param1 + -207, var4));
                    var4++;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var4 = 640 + -var3_int >> 1091059201;
                break L3;
              }
              var5 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (param0 <= var5) {
                      break L7;
                    } else {
                      stackOut_12_0 = var4 + (this.e(-118, var5) + 40);
                      stackIn_15_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var6 != 0) {
                        break L6;
                      } else {
                        var4 = stackIn_13_0;
                        var5++;
                        if (var6 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  stackOut_14_0 = var4;
                  stackIn_15_0 = stackOut_14_0;
                  break L6;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "rb.T(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    private final String a(boolean param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0) {
              L1: {
                if (param1 != 10) {
                  break L1;
                } else {
                  if (!this.a((byte) 66, param1)) {
                    stackOut_9_0 = dq.field_a;
                    stackIn_10_0 = stackOut_9_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_7_0 = qa.field_a[param1];
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "rb.M(" + param0 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final void c(byte param0) {
        if (param0 >= -13) {
            return;
        }
        try {
            la.a(((rb) this).field_l, nc.field_a, false, -25528);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "rb.L(" + param0 + ')');
        }
    }

    rb(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    private final int d(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_15_0 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (16 > param0) {
              stackOut_4_0 = 264 + 40 * (param0 % 8);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var3_int = 40 * this.e(16);
              var4 = (-var3_int + 320) / 2 + 264;
              var5 = 68 % ((39 - param1) / 56);
              var6 = 16;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~param0 >= ~var6) {
                      break L3;
                    } else {
                      stackOut_8_0 = this.a((byte) 66, var6);
                      stackIn_16_0 = stackOut_8_0 ? 1 : 0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_9_0) {
                            var4 += 40;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var6++;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_15_0 = var4;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "rb.W(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    private final tf b(byte param0, int param1) {
        RuntimeException var3 = null;
        tf stackIn_8_0 = null;
        tf stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        tf stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        tf stackOut_9_0 = null;
        tf stackOut_7_0 = null;
        tf stackOut_14_0 = null;
        Object stackOut_12_0 = null;
        try {
          L0: {
            if (this.a((byte) 66, param1)) {
              stackOut_9_0 = oo.field_c[param1];
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            } else {
              L1: {
                if (!gq.d(param0 ^ 96)) {
                  break L1;
                } else {
                  if (!qi.field_p[param1]) {
                    break L1;
                  } else {
                    stackOut_7_0 = gd.field_i;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
              if (param0 == 37) {
                stackOut_14_0 = pj.field_a;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                stackOut_12_0 = null;
                stackIn_13_0 = stackOut_12_0;
                return (tf) (Object) stackIn_13_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "rb.Q(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    private final boolean a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 66) {
                break L1;
              } else {
                field_o = -28;
                break L1;
              }
            }
            L2: {
              if (0 >= (1 << param1 & this.f(-109))) {
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
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "rb.R(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final int f(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              var4 = -118 / ((param0 - 91) / 33);
              if (this.e(16) == 0) {
                stackOut_3_0 = 150;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 130;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            var3_int = stackIn_4_0;
            stackOut_4_0 = var3_int - -(param1 / 8 * 40);
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "rb.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final void e(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.e((byte) -94);
              if (param0 <= -64) {
                break L1;
              } else {
                field_q = 92;
                break L1;
              }
            }
            L2: {
              jn.field_v = this.b(4, uf.field_d, bg.field_k);
              if (jn.field_v == -1) {
                break L2;
              } else {
                if (nm.field_c != 1) {
                  break L2;
                } else {
                  L3: {
                    pp discarded$2 = mc.a(128, -126);
                    if (~jn.field_v != ~jm.field_j) {
                      break L3;
                    } else {
                      jm.field_j = -1;
                      if (!Pixelate.field_H) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  jm.field_j = jn.field_v;
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "rb.O(" + param0 + ')');
        }
    }

    final void b(int param0) {
        if (param0 > -35) {
            return;
        }
        try {
            ((rb) this).field_g.a(114, 0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "rb.C(" + param0 + ')');
        }
    }

    final static rk b(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        double var4 = 0.0;
        rk stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        rk stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var2_int = -(param0 * 2) + 140;
              if (param1 >= 26) {
                break L1;
              } else {
                field_o = 88;
                break L1;
              }
            }
            var3 = 3 + ok.a(tg.field_f, -124, 17);
            var4 = (double)(param0 - 10) / 10.0 + 7.0;
            stackOut_3_0 = new rk(var2_int, var3, of.a(var4, 65536));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "rb.BA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public static void b(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                rk discarded$2 = rb.b(3, (byte) 57);
                break L1;
              }
            }
            field_p = null;
            field_r = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "rb.J(" + param0 + ')');
        }
    }

    private final int e(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 < -107) {
              L1: {
                stackOut_3_0 = rk.field_e.c(this.d(param1, 7698));
                stackIn_6_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (0 != param1) {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = sn.field_m.field_A;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_7_1 = stackOut_4_1;
                  break L1;
                }
              }
              stackOut_7_0 = stackIn_7_0 - -stackIn_7_1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_1_0 = 80;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "rb.AA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final void a(byte param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        String var4 = null;
        tf var5 = null;
        tf stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        tf stackOut_6_0 = null;
        tf stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = this.d(param2, 7698);
                if (param2 != 1) {
                  break L2;
                } else {
                  if (((rb) this).field_k[param2] == 23) {
                    stackOut_6_0 = oc.field_S;
                    stackIn_7_0 = stackOut_6_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = oc.field_N;
              stackIn_7_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              L4: {
                var5 = stackIn_7_0;
                if (param2 == 0) {
                  break L4;
                } else {
                  super.a(var4, param1, param2, var5, (byte) 124);
                  if (!Pixelate.field_H) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((rb) this).a(param1, var4, var5, -6, ((rb) this).a(0, (byte) 90) - -((rb) this).a(0, false) >> -1505320223);
              break L3;
            }
            L5: {
              if (param0 <= -116) {
                break L5;
              } else {
                rk discarded$2 = rb.b(40, (byte) -112);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "rb.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Email: ";
    }
}
