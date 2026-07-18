/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends rf {
    private int[] field_r;
    private int[] field_A;
    static int[] field_i;
    private ft[][] field_E;
    private int[] field_F;
    private int field_C;
    private int[] field_w;
    private int[] field_B;
    private int[] field_p;
    int[] field_m;
    private int field_t;
    private int[] field_o;
    int[] field_z;
    private int[] field_D;
    int[] field_G;
    private ph field_n;
    private ft[][] field_K;
    private int[] field_I;
    private int[] field_s;
    private int[] field_N;
    private k field_M;
    private int[] field_J;
    private int[] field_l;
    private long field_j;
    private boolean field_k;
    private int field_q;
    private long field_u;
    private um field_L;
    private int field_H;
    private ap field_x;
    private boolean field_v;
    private int field_y;

    private final void a(int param0, int param1, byte param2) {
        try {
            int var4_int = 47 % ((param2 - 51) / 61);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "hk.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!((hk) this).field_M.c()) {
                  break L2;
                } else {
                  var4_int = ((hk) this).field_M.field_e * ((hk) this).field_C / tk.field_f;
                  L3: while (true) {
                    L4: {
                      var5 = (long)param2 * (long)var4_int + ((hk) this).field_j;
                      if (0L > ((hk) this).field_u - var5) {
                        break L4;
                      } else {
                        ((hk) this).field_j = var5;
                        if (var8 != 0) {
                          break L1;
                        } else {
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L5: {
                      var7 = (int)((((hk) this).field_u + -((hk) this).field_j + ((long)var4_int - 1L)) / (long)var4_int);
                      ((hk) this).field_j = ((hk) this).field_j + (long)var4_int * (long)var7;
                      ((hk) this).field_L.b(param0, param1, var7);
                      param1 = param1 + var7;
                      this.a((byte) 53);
                      param2 = param2 - var7;
                      if (((hk) this).field_M.c()) {
                        break L5;
                      } else {
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var8 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              ((hk) this).field_L.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("hk.M(");
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
          throw pn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(ft param0, boolean param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
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
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var4_int = param0.field_x.field_g.length;
                  if (!param1) {
                    break L3;
                  } else {
                    if (param0.field_x.field_f) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var5 = (int)((long)var4_int * (long)((hk) this).field_z[param0.field_m] >> -1841327162);
                if (!AceOfSkies.field_G) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var6 = var4_int + (var4_int - param0.field_x.field_h);
              var5 = (int)((long)var6 * (long)((hk) this).field_z[param0.field_m] >> 815925510);
              var4_int = var4_int << 8;
              if (~var4_int >= ~var5) {
                param0.field_e.a(true);
                var5 = -var5 + (-1 + var4_int + var4_int);
                break L1;
              } else {
                break L1;
              }
            }
            L4: {
              if (param2) {
                break L4;
              } else {
                ((hk) this).field_y = -43;
                break L4;
              }
            }
            param0.field_e.e(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("hk.OA(");
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
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        try {
            if (param1 < 126) {
                ((hk) this).field_k = false;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "hk.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 != 127) {
            return;
        }
        try {
            ((hk) this).field_N[param2] = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "hk.EA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  this.b(-1, (byte) 67);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.a(true, -1);
              break L1;
            }
            L3: {
              if (param1 == 12705) {
                break L3;
              } else {
                this.b(-31, -4);
                break L3;
              }
            }
            this.c(-1, false);
            var3_int = 0;
            L4: while (true) {
              L5: {
                L6: {
                  if (var3_int >= 16) {
                    break L6;
                  } else {
                    ((hk) this).field_I[var3_int] = ((hk) this).field_F[var3_int];
                    var3_int++;
                    if (var4 != 0) {
                      break L5;
                    } else {
                      if (var4 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                var3_int = 0;
                break L5;
              }
              L7: while (true) {
                L8: {
                  L9: {
                    if (var3_int >= 16) {
                      break L9;
                    } else {
                      ((hk) this).field_s[var3_int] = pg.a(-128, ((hk) this).field_F[var3_int]);
                      var3_int++;
                      if (var4 != 0) {
                        break L8;
                      } else {
                        if (var4 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  break L8;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "hk.O(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized rf a() {
        RuntimeException var1 = null;
        Object stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "hk.A()");
        }
        return (rf) (Object) stackIn_1_0;
    }

    private final void a(boolean param0, int param1) {
        RuntimeException runtimeException = null;
        ft var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_16_0 = false;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var3 = (ft) (Object) ((hk) this).field_L.field_k.d(268435455);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    stackOut_3_0 = param1;
                    stackIn_17_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 < 0) {
                            break L5;
                          } else {
                            if (~var3.field_m == ~param1) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (var3.field_p >= 0) {
                          break L4;
                        } else {
                          ((hk) this).field_E[var3.field_m][var3.field_n] = null;
                          var3.field_p = 0;
                          break L4;
                        }
                      }
                      var3 = (ft) (Object) ((hk) this).field_L.field_k.b((byte) 103);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_16_0 = param0;
                stackIn_17_0 = stackOut_16_0 ? 1 : 0;
                break L2;
              }
              L6: {
                if (stackIn_17_0 == 1) {
                  break L6;
                } else {
                  ((hk) this).field_s = null;
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) (Object) runtimeException, "hk.G(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized int d() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "hk.IA()");
        }
        return stackIn_1_0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        ft var5 = null;
        RuntimeException var5_ref = null;
        ft var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var5 = ((hk) this).field_E[param3][param1];
            if (null == var5) {
              return;
            } else {
              L1: {
                L2: {
                  L3: {
                    ((hk) this).field_E[param3][param1] = null;
                    if (param2 != (((hk) this).field_G[param3] & 2)) {
                      break L3;
                    } else {
                      var5.field_p = 0;
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var6 = (ft) (Object) ((hk) this).field_L.field_k.d(268435455);
                  L4: while (true) {
                    if (var6 == null) {
                      break L2;
                    } else {
                      if (var7 != 0) {
                        break L1;
                      } else {
                        L5: {
                          if (~var6.field_m != ~var5.field_m) {
                            break L5;
                          } else {
                            if (0 <= var6.field_p) {
                              break L5;
                            } else {
                              if (var5 != var6) {
                                var5.field_p = 0;
                                if (var7 == 0) {
                                  break L2;
                                } else {
                                  break L5;
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var6 = (ft) (Object) ((hk) this).field_L.field_k.b((byte) 103);
                        if (var7 == 0) {
                          continue L4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                break L1;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var5_ref, "hk.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void g(int param0) {
        RuntimeException runtimeException = null;
        ml var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 0) {
              var2 = (ml) (Object) ((hk) this).field_n.a(false);
              L1: while (true) {
                L2: {
                  L3: {
                    if (null == var2) {
                      break L3;
                    } else {
                      var2.a(true);
                      var2 = (ml) (Object) ((hk) this).field_n.a(0);
                      if (var3 != 0) {
                        break L2;
                      } else {
                        if (var3 == 0) {
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) (Object) runtimeException, "hk.N(" + param0 + ')');
        }
    }

    final synchronized void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((hk) this).field_M.c()) {
                  var2_int = ((hk) this).field_C * ((hk) this).field_M.field_e / tk.field_f;
                  L3: while (true) {
                    L4: {
                      var3 = ((hk) this).field_j - -((long)param0 * (long)var2_int);
                      if (((hk) this).field_u + -var3 < 0L) {
                        break L4;
                      } else {
                        ((hk) this).field_j = var3;
                        if (var6 != 0) {
                          break L1;
                        } else {
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L5: {
                      var5 = (int)((((hk) this).field_u - ((hk) this).field_j + (long)var2_int + -1L) / (long)var2_int);
                      ((hk) this).field_j = ((hk) this).field_j + (long)var5 * (long)var2_int;
                      ((hk) this).field_L.a(var5);
                      param0 = param0 - var5;
                      this.a((byte) 54);
                      if (((hk) this).field_M.c()) {
                        break L5;
                      } else {
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var6 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              ((hk) this).field_L.a(param0);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "hk.B(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        RuntimeException var3 = null;
        ft var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 < -111) {
              L1: {
                L2: {
                  if ((2 & ((hk) this).field_G[param1]) != 0) {
                    var3_ref = (ft) (Object) ((hk) this).field_L.field_k.d(268435455);
                    L3: while (true) {
                      if (null == var3_ref) {
                        break L2;
                      } else {
                        if (var4 != 0) {
                          break L1;
                        } else {
                          L4: {
                            if (~var3_ref.field_m != ~param1) {
                              break L4;
                            } else {
                              if (null != ((hk) this).field_E[param1][var3_ref.field_n]) {
                                break L4;
                              } else {
                                if (0 <= var3_ref.field_p) {
                                  break L4;
                                } else {
                                  var3_ref.field_p = 0;
                                  break L4;
                                }
                              }
                            }
                          }
                          var3_ref = (ft) (Object) ((hk) this).field_L.field_k.b((byte) 103);
                          if (var4 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "hk.GA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        ft var5_ref = null;
        ml var5_ref2 = null;
        al var6 = null;
        int var6_int = 0;
        ft var7 = null;
        int var8 = 0;
        ft var9 = null;
        int var10 = 0;
        ft stackIn_7_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_28_0 = null;
        ft stackIn_28_1 = null;
        Object stackIn_30_0 = null;
        ft stackIn_30_1 = null;
        Object stackIn_32_0 = null;
        ft stackIn_32_1 = null;
        Object stackIn_33_0 = null;
        ft stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        RuntimeException decompiledCaughtException = null;
        ft stackOut_6_0 = null;
        wf stackOut_16_0 = null;
        Object stackOut_27_0 = null;
        ft stackOut_27_1 = null;
        Object stackOut_32_0 = null;
        ft stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        Object stackOut_28_0 = null;
        ft stackOut_28_1 = null;
        Object stackOut_30_0 = null;
        ft stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                this.a(64, param2, 0, param3);
                if (0 != (2 & ((hk) this).field_G[param3])) {
                  var5_ref = (ft) (Object) ((hk) this).field_L.field_k.a((byte) -70);
                  L3: while (true) {
                    if (null == var5_ref) {
                      break L2;
                    } else {
                      stackOut_6_0 = (ft) var5_ref;
                      stackIn_17_0 = (Object) (Object) stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var10 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (~stackIn_7_0.field_m != ~param3) {
                            break L4;
                          } else {
                            if (0 <= var5_ref.field_p) {
                              break L4;
                            } else {
                              ((hk) this).field_E[param3][var5_ref.field_n] = null;
                              ((hk) this).field_E[param3][param2] = var5_ref;
                              var6_int = var5_ref.field_w + (var5_ref.field_q * var5_ref.field_u >> -591741908);
                              var5_ref.field_w = var5_ref.field_w + (-var5_ref.field_n + param2 << -2030902424);
                              var5_ref.field_q = 4096;
                              var5_ref.field_n = param2;
                              var5_ref.field_u = -var5_ref.field_w + var6_int;
                              return;
                            }
                          }
                        }
                        var5_ref = (ft) (Object) ((hk) this).field_L.field_k.a(110);
                        if (var10 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_16_0 = ((hk) this).field_n.a((byte) 106, (long)((hk) this).field_I[param3]);
              stackIn_17_0 = (Object) (Object) stackOut_16_0;
              break L1;
            }
            var5_ref2 = (ml) (Object) stackIn_17_0;
            if (var5_ref2 == null) {
              return;
            } else {
              var6 = var5_ref2.field_f[param2];
              if (null != var6) {
                L5: {
                  L6: {
                    var8 = 5 / ((-31 - param0) / 43);
                    var7 = new ft();
                    var7.field_y = var5_ref2;
                    var7.field_m = param3;
                    var7.field_x = var6;
                    var7.field_r = var5_ref2.field_o[param2];
                    var7.field_f = var5_ref2.field_e[param2];
                    var7.field_n = param2;
                    var7.field_h = 1024 + var5_ref2.field_k[param2] * var5_ref2.field_i * (param1 * param1) >> 2103000043;
                    var7.field_v = var5_ref2.field_q[param2] & 255;
                    var7.field_w = (param2 << 842833992) - (var5_ref2.field_n[param2] & 32767);
                    var7.field_g = 0;
                    var7.field_p = -1;
                    var7.field_A = 0;
                    var7.field_s = 0;
                    var7.field_k = 0;
                    if (((hk) this).field_z[param3] != 0) {
                      break L6;
                    } else {
                      var7.field_e = su.a(var6, this.b((byte) -113, var7), this.a((byte) -67, var7), this.b(77, var7));
                      if (var10 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    var7.field_e = su.a(var6, this.b((byte) -126, var7), 0, this.b(85, var7));
                    stackOut_27_0 = this;
                    stackOut_27_1 = (ft) var7;
                    stackIn_32_0 = stackOut_27_0;
                    stackIn_32_1 = stackOut_27_1;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    if (var5_ref2.field_n[param2] >= 0) {
                      stackOut_32_0 = this;
                      stackOut_32_1 = (ft) (Object) stackIn_32_1;
                      stackOut_32_2 = 0;
                      stackIn_33_0 = stackOut_32_0;
                      stackIn_33_1 = stackOut_32_1;
                      stackIn_33_2 = stackOut_32_2;
                      break L7;
                    } else {
                      stackOut_28_0 = this;
                      stackOut_28_1 = (ft) (Object) stackIn_28_1;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      stackOut_30_0 = this;
                      stackOut_30_1 = (ft) (Object) stackIn_30_1;
                      stackOut_30_2 = 1;
                      stackIn_33_0 = stackOut_30_0;
                      stackIn_33_1 = stackOut_30_1;
                      stackIn_33_2 = stackOut_30_2;
                      break L7;
                    }
                  }
                  ((hk) this).a(stackIn_33_1, stackIn_33_2 != 0, true);
                  break L5;
                }
                L8: {
                  if (var5_ref2.field_n[param2] < 0) {
                    var7.field_e.d(-1);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (var7.field_f < 0) {
                    break L9;
                  } else {
                    L10: {
                      var9 = ((hk) this).field_K[param3][var7.field_f];
                      if (null == var9) {
                        break L10;
                      } else {
                        if (var9.field_p < 0) {
                          ((hk) this).field_E[param3][var9.field_n] = null;
                          var9.field_p = 0;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    ((hk) this).field_K[param3][var7.field_f] = var7;
                    break L9;
                  }
                }
                ((hk) this).field_L.field_k.a(120, (wf) (Object) var7);
                ((hk) this).field_E[param3][param2] = var7;
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var5, "hk.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((hk) this).field_o[param0] = param1;
              if (param2 == 3830) {
                break L1;
              } else {
                int discarded$2 = this.b((byte) 103, (ft) null);
                break L1;
              }
            }
            ((hk) this).field_m[param0] = (int)(0.5 + Math.pow(2.0, (double)param1 * 0.00054931640625) * 2097152.0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var4, "hk.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized rf b() {
        RuntimeException var1 = null;
        um stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        um stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = ((hk) this).field_L;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "hk.L()");
        }
        return (rf) (Object) stackIn_1_0;
    }

    private final void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        byte stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = ((hk) this).field_H;
              var3 = ((hk) this).field_q;
              var4 = ((hk) this).field_u;
              if (null == ((hk) this).field_x) {
                break L1;
              } else {
                if (((hk) this).field_y == var3) {
                  this.a(122, ((hk) this).field_v, ((hk) this).field_k, ((hk) this).field_x);
                  this.a((byte) 92);
                  return;
                } else {
                  break L1;
                }
              }
            }
            L2: while (true) {
              stackOut_9_0 = ~var3;
              stackOut_9_1 = ~((hk) this).field_q;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_10_0 != stackIn_10_1) {
                      break L5;
                    } else {
                      L6: while (true) {
                        stackOut_11_0 = var3;
                        stackOut_11_1 = ((hk) this).field_M.field_f[var2_int];
                        stackIn_48_0 = stackOut_11_0;
                        stackIn_48_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (var7 != 0) {
                          break L4;
                        } else {
                          L7: {
                            if (stackIn_12_0 != stackIn_12_1) {
                              break L7;
                            } else {
                              ((hk) this).field_M.a(var2_int);
                              var6 = ((hk) this).field_M.e(var2_int);
                              stackOut_13_0 = -2;
                              stackOut_13_1 = ~var6;
                              stackIn_10_0 = stackOut_13_0;
                              stackIn_10_1 = stackOut_13_1;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              if (var7 != 0) {
                                continue L3;
                              } else {
                                if (stackIn_14_0 != stackIn_14_1) {
                                  L8: {
                                    if ((128 & var6) != 0) {
                                      this.b(-128, var6);
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  ((hk) this).field_M.c(var2_int);
                                  ((hk) this).field_M.f(var2_int);
                                  if (var7 == 0) {
                                    continue L6;
                                  } else {
                                    break L7;
                                  }
                                } else {
                                  ((hk) this).field_M.a();
                                  ((hk) this).field_M.f(var2_int);
                                  if (!((hk) this).field_M.g()) {
                                    break L7;
                                  } else {
                                    if (((hk) this).field_x != null) {
                                      ((hk) this).a(((hk) this).field_k, -2029711608, ((hk) this).field_x);
                                      this.a((byte) 122);
                                      return;
                                    } else {
                                      L9: {
                                        if (!((hk) this).field_k) {
                                          break L9;
                                        } else {
                                          if (var3 == 0) {
                                            break L9;
                                          } else {
                                            ((hk) this).field_M.a(var4);
                                            if (var7 == 0) {
                                              break L7;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                      }
                                      this.b(true, 12705);
                                      ((hk) this).field_M.d();
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var2_int = ((hk) this).field_M.e();
                          var3 = ((hk) this).field_M.field_f[var2_int];
                          var4 = ((hk) this).field_M.d(var3);
                          if (var7 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  L10: {
                    ((hk) this).field_H = var2_int;
                    ((hk) this).field_q = var3;
                    ((hk) this).field_u = var4;
                    if (((hk) this).field_x == null) {
                      break L10;
                    } else {
                      if (var3 > ((hk) this).field_y) {
                        ((hk) this).field_q = ((hk) this).field_y;
                        ((hk) this).field_H = -1;
                        ((hk) this).field_u = ((hk) this).field_M.d(((hk) this).field_q);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  stackOut_47_0 = param0;
                  stackOut_47_1 = 16;
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  break L4;
                }
                L11: {
                  if (stackIn_48_0 >= stackIn_48_1) {
                    break L11;
                  } else {
                    boolean discarded$1 = ((hk) this).a(-128, (ft) null);
                    break L11;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "hk.Q(" + param0 + ')');
        }
    }

    private final void c(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (0 <= param0) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  ((hk) this).field_N = null;
                  break L1;
                }
              }
              ((hk) this).field_J[param0] = 12800;
              ((hk) this).field_p[param0] = 8192;
              ((hk) this).field_w[param0] = 16383;
              ((hk) this).field_N[param0] = 8192;
              ((hk) this).field_A[param0] = 0;
              ((hk) this).field_r[param0] = 8192;
              this.a((byte) -116, param0);
              this.a(param0, (byte) 4);
              ((hk) this).field_G[param0] = 0;
              ((hk) this).field_D[param0] = 32767;
              ((hk) this).field_B[param0] = 256;
              ((hk) this).field_z[param0] = 0;
              this.c(param0, 8192, 3830);
              break L0;
            } else {
              param0 = 0;
              L2: while (true) {
                L3: {
                  if (param0 >= 16) {
                    break L3;
                  } else {
                    this.c(param0, false);
                    param0++;
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "hk.BA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void a(int param0, int param1) {
        try {
            ((hk) this).field_C = param0;
            if (param1 > -102) {
                ((hk) this).field_J = null;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "hk.U(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void d(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -125) {
                break L1;
              } else {
                ((hk) this).field_r = null;
                break L1;
              }
            }
            this.a(2097152, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "hk.NA(" + param0 + ')');
        }
    }

    final synchronized void a(boolean param0, int param1, ap param2) {
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
              this.a(param1 ^ -2029711495, true, param0, param2);
              if (param1 == -2029711608) {
                break L1;
              } else {
                ((hk) this).a(43);
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
            stackOut_3_1 = new StringBuilder().append("hk.MA(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    private final synchronized void a(int param0, boolean param1, boolean param2, ap param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            this.a(2097152, param1);
            ((hk) this).field_M.a(param3.field_e);
            ((hk) this).field_j = 0L;
            ((hk) this).field_k = param2;
            var5_int = ((hk) this).field_M.f();
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var6 >= var5_int) {
                    break L3;
                  } else {
                    ((hk) this).field_M.a(var6);
                    ((hk) this).field_M.c(var6);
                    ((hk) this).field_M.f(var6);
                    var6++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((hk) this).field_H = ((hk) this).field_M.e();
                break L2;
              }
              L4: {
                if (param0 > 110) {
                  break L4;
                } else {
                  this.a(-102, (byte) -90);
                  break L4;
                }
              }
              ((hk) this).field_q = ((hk) this).field_M.field_f[((hk) this).field_H];
              ((hk) this).field_u = ((hk) this).field_M.d(((hk) this).field_q);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("hk.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param2 != ((hk) this).field_I[param0]) {
                  ((hk) this).field_I[param0] = param2;
                  var4_int = 0;
                  L3: while (true) {
                    if (128 <= var4_int) {
                      break L2;
                    } else {
                      ((hk) this).field_K[param0][var4_int] = null;
                      var4_int++;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              if (param1 >= 50) {
                break L1;
              } else {
                rf discarded$2 = ((hk) this).b();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var4, "hk.HA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, ft param1) {
        RuntimeException var3 = null;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (null == param1.field_e) {
              L1: {
                if (param1.field_p >= 0) {
                  param1.c(-125);
                  if (0 >= param1.field_f) {
                    break L1;
                  } else {
                    if (((hk) this).field_K[param1.field_m][param1.field_f] == param1) {
                      ((hk) this).field_K[param1.field_m][param1.field_f] = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              stackOut_13_0 = 1;
              stackIn_14_0 = stackOut_13_0;
              return stackIn_14_0 != 0;
            } else {
              if (param0 == 0) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("hk.I(").append(param0).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final synchronized boolean a(int param0, int param1, ap param2, gk param3, ob param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        ub var8 = null;
        int var9 = 0;
        ml var10 = null;
        int var11 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param2.b();
              var6_int = 1;
              var7 = null;
              if (~param1 >= param0) {
                break L1;
              } else {
                var7 = (Object) (Object) new int[]{param1};
                break L1;
              }
            }
            var8 = (ub) (Object) param2.field_f.a(false);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var8) {
                    break L4;
                  } else {
                    var9 = (int)var8.field_b;
                    var10 = (ml) (Object) ((hk) this).field_n.a((byte) 106, (long)var9);
                    if (var11 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (null == var10) {
                            L7: {
                              var10 = gu.a(var9, param3, 16652);
                              if (var10 == null) {
                                var6_int = 0;
                                if (var11 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              } else {
                                break L7;
                              }
                            }
                            ((hk) this).field_n.a(param0 ^ -98, (long)var9, (wf) (Object) var10);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (!var10.a(var8.field_e, (int[]) var7, param4, 5193)) {
                          var6_int = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var8 = (ub) (Object) param2.field_f.a(param0 + 1);
                      if (var11 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (var6_int == 0) {
                  break L3;
                } else {
                  param2.a();
                  break L3;
                }
              }
              stackOut_25_0 = var6_int;
              stackIn_26_0 = stackOut_25_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("hk.J(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L9;
            }
          }
          L10: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param4 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L10;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
        return stackIn_26_0 != 0;
    }

    final synchronized void b(int param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ((hk) this).field_v = false;
                break L1;
              }
            }
            ((hk) this).field_t = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "hk.H(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -115) {
                break L1;
              } else {
                ((hk) this).field_o = null;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (param2 < 0) {
                    break L4;
                  } else {
                    ((hk) this).field_l[param2] = param1;
                    if (var5 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var4_int = 0;
                L5: while (true) {
                  if (var4_int >= 16) {
                    break L3;
                  } else {
                    ((hk) this).field_l[var4_int] = param1;
                    var4_int++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L5;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var4, "hk.KA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int b(int param0, ft param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            var3_int = ((hk) this).field_p[param1.field_m];
            if (param0 > 54) {
              if (var3_int >= 8192) {
                stackOut_6_0 = -((-param1.field_v + 128) * (16384 - var3_int) - -32 >> 479149670) + 16384;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = var3_int * param1.field_v - -32 >> 289377862;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -42;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("hk.JA(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0;
    }

    private final int a(byte param0, ft param1) {
        RuntimeException var3 = null;
        dh var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            if (((hk) this).field_l[param1.field_m] != 0) {
              L1: {
                var3_ref = param1.field_r;
                var4 = 4096 + ((hk) this).field_w[param1.field_m] * ((hk) this).field_J[param1.field_m] >> 1390034221;
                var4 = 16384 + var4 * var4 >> 1302806831;
                var4 = 16384 + var4 * param1.field_h >> 1410798607;
                var4 = 128 + ((hk) this).field_t * var4 >> -1784802136;
                var4 = ((hk) this).field_l[param1.field_m] * var4 - -128 >> -543142776;
                if (param0 == -67) {
                  break L1;
                } else {
                  ((hk) this).field_u = 112L;
                  break L1;
                }
              }
              L2: {
                if (0 >= var3_ref.field_b) {
                  break L2;
                } else {
                  var4 = (int)(0.5 + Math.pow(0.5, (double)var3_ref.field_b * ((double)param1.field_A * 0.00001953125)) * (double)var4);
                  break L2;
                }
              }
              L3: {
                if (var3_ref.field_g == null) {
                  break L3;
                } else {
                  L4: {
                    var5 = param1.field_s;
                    var6 = var3_ref.field_g[param1.field_g + 1];
                    if (param1.field_g >= var3_ref.field_g.length - 2) {
                      break L4;
                    } else {
                      var7 = 65280 & var3_ref.field_g[param1.field_g] << -2087311320;
                      var8 = (var3_ref.field_g[2 + param1.field_g] & 255) << 1858141288;
                      var6 = var6 + (var5 - var7) * (-var6 + var3_ref.field_g[param1.field_g + 3]) / (-var7 + var8);
                      break L4;
                    }
                  }
                  var4 = var4 * var6 + 32 >> 553654502;
                  break L3;
                }
              }
              L5: {
                if (0 >= param1.field_p) {
                  break L5;
                } else {
                  if (var3_ref.field_e != null) {
                    L6: {
                      var5 = param1.field_p;
                      var6 = var3_ref.field_e[param1.field_k - -1];
                      if (~param1.field_k > ~(var3_ref.field_e.length - 2)) {
                        var7 = (255 & var3_ref.field_e[param1.field_k]) << -2029711608;
                        var8 = (255 & var3_ref.field_e[param1.field_k - -2]) << 86640264;
                        var6 = var6 + (-var6 + var3_ref.field_e[param1.field_k + 3]) * (var5 - var7) / (-var7 + var8);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4 = var4 * var6 + 32 >> 411440006;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              stackOut_23_0 = var4;
              stackIn_24_0 = stackOut_23_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("hk.C(").append(param0).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L7;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
        return stackIn_24_0;
    }

    private final synchronized void a(int param0, boolean param1) {
        try {
            ((hk) this).field_M.d();
            ((hk) this).field_x = null;
            this.b(param1, 12705);
            if (param0 != 2097152) {
                this.a(-3, true);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "hk.DA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = param1 & 240;
            if (var3_int != 128) {
              if (144 == var3_int) {
                L1: {
                  L2: {
                    var4 = param1 & 15;
                    var5 = 127 & param1 >> -544703320;
                    var6 = 127 & param1 >> -1959037360;
                    if (var6 <= 0) {
                      break L2;
                    } else {
                      this.b(35, var6, var5, var4);
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.a(64, var5, param0 + 128, var4);
                  break L1;
                }
                return;
              } else {
                if (var3_int == 160) {
                  var4 = 15 & param1;
                  var5 = param1 >> -1389716088 & 127;
                  var6 = (param1 & 8337132) >> -385328656;
                  this.a(var6, (byte) 127, var4, var5);
                  return;
                } else {
                  L3: {
                    if (param0 == -128) {
                      break L3;
                    } else {
                      ((hk) this).field_s = null;
                      break L3;
                    }
                  }
                  if (var3_int != 176) {
                    if (var3_int != 192) {
                      if (var3_int == 208) {
                        var4 = param1 & 15;
                        var5 = (32723 & param1) >> -12639416;
                        this.a(var4, var5, (byte) -34);
                        return;
                      } else {
                        if (var3_int == 224) {
                          var4 = 15 & param1;
                          var5 = (param1 >> -293195479 & 16256) - -(127 & param1 >> -2058178520);
                          this.a(param0 + 255, var5, var4);
                          return;
                        } else {
                          var3_int = 255 & param1;
                          if (var3_int == 255) {
                            this.b(true, param0 + 12833);
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    } else {
                      var4 = 15 & param1;
                      var5 = (32710 & param1) >> -952052664;
                      this.a(var4, (byte) 101, ((hk) this).field_s[var4] + var5);
                      return;
                    }
                  } else {
                    L4: {
                      var4 = param1 & 15;
                      var5 = 127 & param1 >> -1875940440;
                      var6 = param1 >> 260667280 & 127;
                      if (var5 != 0) {
                        break L4;
                      } else {
                        ((hk) this).field_s[var4] = pg.a(((hk) this).field_s[var4], -2080769) + (var6 << 637857966);
                        break L4;
                      }
                    }
                    L5: {
                      if (32 == var5) {
                        ((hk) this).field_s[var4] = pg.a(-16257, ((hk) this).field_s[var4]) + (var6 << -1449387449);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (1 != var5) {
                        break L6;
                      } else {
                        ((hk) this).field_A[var4] = pg.a(-16257, ((hk) this).field_A[var4]) + (var6 << 383813287);
                        break L6;
                      }
                    }
                    L7: {
                      if (var5 == 33) {
                        ((hk) this).field_A[var4] = var6 + pg.a(((hk) this).field_A[var4], -128);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (var5 != 5) {
                        break L8;
                      } else {
                        ((hk) this).field_r[var4] = pg.a(-16257, ((hk) this).field_r[var4]) + (var6 << -1638062137);
                        break L8;
                      }
                    }
                    L9: {
                      if (var5 != 37) {
                        break L9;
                      } else {
                        ((hk) this).field_r[var4] = var6 + pg.a(((hk) this).field_r[var4], -128);
                        break L9;
                      }
                    }
                    L10: {
                      if (7 == var5) {
                        ((hk) this).field_J[var4] = pg.a(((hk) this).field_J[var4], -16257) + (var6 << 964509767);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var5 != 39) {
                        break L11;
                      } else {
                        ((hk) this).field_J[var4] = var6 + pg.a(((hk) this).field_J[var4], -128);
                        break L11;
                      }
                    }
                    L12: {
                      if (var5 != 10) {
                        break L12;
                      } else {
                        ((hk) this).field_p[var4] = (var6 << -1441055481) + pg.a(-16257, ((hk) this).field_p[var4]);
                        break L12;
                      }
                    }
                    L13: {
                      if (var5 != 42) {
                        break L13;
                      } else {
                        ((hk) this).field_p[var4] = var6 + pg.a(((hk) this).field_p[var4], -128);
                        break L13;
                      }
                    }
                    L14: {
                      if (var5 == 11) {
                        ((hk) this).field_w[var4] = (var6 << -583906745) + pg.a(-16257, ((hk) this).field_w[var4]);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (43 != var5) {
                        break L15;
                      } else {
                        ((hk) this).field_w[var4] = var6 + pg.a(((hk) this).field_w[var4], -128);
                        break L15;
                      }
                    }
                    L16: {
                      if (64 != var5) {
                        break L16;
                      } else {
                        L17: {
                          if (var6 < 64) {
                            break L17;
                          } else {
                            ((hk) this).field_G[var4] = vo.a(((hk) this).field_G[var4], 1);
                            if (var8 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        ((hk) this).field_G[var4] = pg.a(((hk) this).field_G[var4], -2);
                        break L16;
                      }
                    }
                    L18: {
                      if (65 == var5) {
                        L19: {
                          if (var6 >= 64) {
                            break L19;
                          } else {
                            this.a((byte) -126, var4);
                            ((hk) this).field_G[var4] = pg.a(((hk) this).field_G[var4], -3);
                            if (var8 == 0) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        ((hk) this).field_G[var4] = vo.a(((hk) this).field_G[var4], 2);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L20: {
                      if (var5 == 99) {
                        ((hk) this).field_D[var4] = (var6 << -913265241) + pg.a(((hk) this).field_D[var4], 127);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if (var5 != 98) {
                        break L21;
                      } else {
                        ((hk) this).field_D[var4] = pg.a(16256, ((hk) this).field_D[var4]) - -var6;
                        break L21;
                      }
                    }
                    L22: {
                      if (var5 == 101) {
                        ((hk) this).field_D[var4] = (var6 << 1873769255) + pg.a(((hk) this).field_D[var4], 127) + 16384;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      if (var5 != 100) {
                        break L23;
                      } else {
                        ((hk) this).field_D[var4] = pg.a(16256, ((hk) this).field_D[var4]) + 16384 + var6;
                        break L23;
                      }
                    }
                    L24: {
                      if (120 != var5) {
                        break L24;
                      } else {
                        this.b(var4, (byte) 95);
                        break L24;
                      }
                    }
                    L25: {
                      if (var5 != 121) {
                        break L25;
                      } else {
                        this.c(var4, false);
                        break L25;
                      }
                    }
                    L26: {
                      if (123 != var5) {
                        break L26;
                      } else {
                        this.a(true, var4);
                        break L26;
                      }
                    }
                    L27: {
                      if (var5 != 6) {
                        break L27;
                      } else {
                        var7 = ((hk) this).field_D[var4];
                        if (16384 != var7) {
                          break L27;
                        } else {
                          ((hk) this).field_B[var4] = (var6 << -956481817) + pg.a(((hk) this).field_B[var4], -16257);
                          break L27;
                        }
                      }
                    }
                    L28: {
                      if (var5 == 38) {
                        var7 = ((hk) this).field_D[var4];
                        if (var7 != 16384) {
                          break L28;
                        } else {
                          ((hk) this).field_B[var4] = var6 + pg.a(((hk) this).field_B[var4], -128);
                          break L28;
                        }
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (var5 == 16) {
                        ((hk) this).field_z[var4] = (var6 << -24230713) + pg.a(((hk) this).field_z[var4], -16257);
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    L30: {
                      if (var5 != 48) {
                        break L30;
                      } else {
                        ((hk) this).field_z[var4] = pg.a(-128, ((hk) this).field_z[var4]) + var6;
                        break L30;
                      }
                    }
                    L31: {
                      if (var5 == 81) {
                        L32: {
                          if (64 > var6) {
                            break L32;
                          } else {
                            ((hk) this).field_G[var4] = vo.a(((hk) this).field_G[var4], 4);
                            if (var8 == 0) {
                              break L31;
                            } else {
                              break L32;
                            }
                          }
                        }
                        this.a(var4, (byte) 4);
                        ((hk) this).field_G[var4] = pg.a(((hk) this).field_G[var4], -5);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    L33: {
                      if (var5 == 17) {
                        this.c(var4, (((hk) this).field_o[var4] & -16257) + (var6 << 2126190759), 3830);
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    L34: {
                      if (var5 != 49) {
                        break L34;
                      } else {
                        this.c(var4, var6 + (-128 & ((hk) this).field_o[var4]), param0 ^ -3722);
                        break L34;
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              var4 = 15 & param1;
              var5 = (param1 & 32672) >> -1270347576;
              var6 = (8343301 & param1) >> -714142320;
              this.a(var6, var5, 0, var4);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "hk.T(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int b(byte param0, ft param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        dh var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              var3_int = (param1.field_u * param1.field_q >> -2138420020) + param1.field_w;
              var3_int = var3_int + (((hk) this).field_B[param1.field_m] * (-8192 + ((hk) this).field_N[param1.field_m]) >> 1424702124);
              var4 = param1.field_r;
              if (param0 <= -56) {
                break L1;
              } else {
                this.b(-101, (byte) 115);
                break L1;
              }
            }
            L2: {
              if (var4.field_i <= 0) {
                break L2;
              } else {
                L3: {
                  if (var4.field_j > 0) {
                    break L3;
                  } else {
                    if (((hk) this).field_A[param1.field_m] <= 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_j << 1156292610;
                  var6 = var4.field_a << -1374848415;
                  if (~param1.field_j > ~var6) {
                    var5 = param1.field_j * var5 / var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var5 = var5 + (((hk) this).field_A[param1.field_m] >> 1287252487);
                var7 = Math.sin((double)(511 & param1.field_z) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)((double)(256 * param1.field_x.field_i) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)tk.field_f + 0.5);
              if (1 <= var5) {
                stackOut_18_0 = var5;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_16_0 = 1;
                stackIn_19_0 = stackOut_16_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("hk.LA(").append(param0).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L6;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_19_0;
    }

    final boolean a(int param0, int param1, boolean param2, ft param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        dh var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_18_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_117_0 = 0;
        int stackIn_119_0 = 0;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        String stackIn_124_2 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_128_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        int stackOut_118_0 = 0;
        int stackOut_116_0 = 0;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        String stackOut_123_2 = null;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        String stackOut_121_2 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.field_i = tk.field_f / 100;
              if (0 > param3.field_p) {
                break L1;
              } else {
                L2: {
                  if (null == param3.field_e) {
                    break L2;
                  } else {
                    if (param3.field_e.f()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param3.a(11821);
                  param3.c(-127);
                  if (param3.field_f <= 0) {
                    break L3;
                  } else {
                    if (param3 == ((hk) this).field_K[param3.field_m][param3.field_f]) {
                      ((hk) this).field_K[param3.field_m][param3.field_f] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_17_0 = 1;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              }
            }
            L4: {
              var6_int = param3.field_q;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, (double)((hk) this).field_r[param3.field_m] * 0.0004921259842519685) + 0.5);
                  if (var6_int >= 0) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param3.field_q = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param3.field_e.g(this.b((byte) -76, param3));
              var7 = param3.field_r;
              param3.field_j = param3.field_j + 1;
              var8 = param2 ? 1 : 0;
              param3.field_z = param3.field_z + var7.field_i;
              var9 = 0.000005086263020833333 * (double)((param3.field_n + -60 << 280871336) - -(param3.field_q * param3.field_u >> 717621484));
              if (var7.field_b <= 0) {
                break L6;
              } else {
                L7: {
                  L8: {
                    if (var7.field_f <= 0) {
                      break L8;
                    } else {
                      param3.field_A = param3.field_A + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_f * var9));
                      if (var11 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param3.field_A = param3.field_A + 128;
                  break L7;
                }
                if (819200 > var7.field_b * param3.field_A) {
                  break L6;
                } else {
                  var8 = 1;
                  break L6;
                }
              }
            }
            L9: {
              if (var7.field_g == null) {
                break L9;
              } else {
                L10: {
                  L11: {
                    if (0 < var7.field_h) {
                      break L11;
                    } else {
                      param3.field_s = param3.field_s + 128;
                      if (var11 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  param3.field_s = param3.field_s + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_h * var9));
                  break L10;
                }
                L12: while (true) {
                  L13: {
                    L14: {
                      if (~param3.field_g <= ~(-2 + var7.field_g.length)) {
                        break L14;
                      } else {
                        stackOut_46_0 = ~((255 & var7.field_g[2 + param3.field_g]) << -1068432120);
                        stackOut_46_1 = ~param3.field_s;
                        stackIn_54_0 = stackOut_46_0;
                        stackIn_54_1 = stackOut_46_1;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        if (var11 != 0) {
                          break L13;
                        } else {
                          if (stackIn_47_0 <= stackIn_47_1) {
                            break L14;
                          } else {
                            param3.field_g = param3.field_g + 2;
                            if (var11 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    stackOut_53_0 = param3.field_g;
                    stackOut_53_1 = var7.field_g.length + -2;
                    stackIn_54_0 = stackOut_53_0;
                    stackIn_54_1 = stackOut_53_1;
                    break L13;
                  }
                  if (stackIn_54_0 != stackIn_54_1) {
                    break L9;
                  } else {
                    if (var7.field_g[param3.field_g + 1] == 0) {
                      var8 = 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
            L15: {
              if (0 > param3.field_p) {
                break L15;
              } else {
                if (var7.field_e == null) {
                  break L15;
                } else {
                  if (0 != (1 & ((hk) this).field_G[param3.field_m])) {
                    break L15;
                  } else {
                    L16: {
                      if (param3.field_f < 0) {
                        break L16;
                      } else {
                        if (param3 == ((hk) this).field_K[param3.field_m][param3.field_f]) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        if (var7.field_l > 0) {
                          break L18;
                        } else {
                          param3.field_p = param3.field_p + 128;
                          if (var11 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      param3.field_p = param3.field_p + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
                      break L17;
                    }
                    L19: while (true) {
                      L20: {
                        L21: {
                          if (~(-2 + var7.field_e.length) >= ~param3.field_k) {
                            break L21;
                          } else {
                            stackOut_83_0 = ~param3.field_p;
                            stackOut_83_1 = ~(65280 & var7.field_e[param3.field_k - -2] << 1732155304);
                            stackIn_91_0 = stackOut_83_0;
                            stackIn_91_1 = stackOut_83_1;
                            stackIn_84_0 = stackOut_83_0;
                            stackIn_84_1 = stackOut_83_1;
                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (stackIn_84_0 >= stackIn_84_1) {
                                break L21;
                              } else {
                                param3.field_k = param3.field_k + 2;
                                if (var11 == 0) {
                                  continue L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                        stackOut_90_0 = ~(-2 + var7.field_e.length);
                        stackOut_90_1 = ~param3.field_k;
                        stackIn_91_0 = stackOut_90_0;
                        stackIn_91_1 = stackOut_90_1;
                        break L20;
                      }
                      if (stackIn_91_0 == stackIn_91_1) {
                        var8 = 1;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                }
              }
            }
            if (var8 == 0) {
              param3.field_e.a(param3.field_i, this.a((byte) -67, param3), this.b(67, param3));
              stackOut_118_0 = 0;
              stackIn_119_0 = stackOut_118_0;
              break L0;
            } else {
              L22: {
                L23: {
                  param3.field_e.h(param3.field_i);
                  if (null != param4) {
                    break L23;
                  } else {
                    param3.field_e.a(param0);
                    if (var11 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                param3.field_e.b(param4, param1, param0);
                break L22;
              }
              L24: {
                if (!param3.field_e.j()) {
                  break L24;
                } else {
                  ((hk) this).field_L.field_i.b((rf) (Object) param3.field_e);
                  break L24;
                }
              }
              L25: {
                param3.a(11821);
                if (param3.field_p >= 0) {
                  param3.c(-123);
                  if (param3.field_f <= 0) {
                    break L25;
                  } else {
                    if (((hk) this).field_K[param3.field_m][param3.field_f] == param3) {
                      ((hk) this).field_K[param3.field_m][param3.field_f] = null;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                } else {
                  break L25;
                }
              }
              stackOut_116_0 = 1;
              stackIn_117_0 = stackOut_116_0;
              return stackIn_117_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackOut_120_0 = (RuntimeException) var6;
            stackOut_120_1 = new StringBuilder().append("hk.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_123_0 = stackOut_120_0;
            stackIn_123_1 = stackOut_120_1;
            stackIn_121_0 = stackOut_120_0;
            stackIn_121_1 = stackOut_120_1;
            if (param3 == null) {
              stackOut_123_0 = (RuntimeException) (Object) stackIn_123_0;
              stackOut_123_1 = (StringBuilder) (Object) stackIn_123_1;
              stackOut_123_2 = "null";
              stackIn_124_0 = stackOut_123_0;
              stackIn_124_1 = stackOut_123_1;
              stackIn_124_2 = stackOut_123_2;
              break L26;
            } else {
              stackOut_121_0 = (RuntimeException) (Object) stackIn_121_0;
              stackOut_121_1 = (StringBuilder) (Object) stackIn_121_1;
              stackOut_121_2 = "{...}";
              stackIn_124_0 = stackOut_121_0;
              stackIn_124_1 = stackOut_121_1;
              stackIn_124_2 = stackOut_121_2;
              break L26;
            }
          }
          L27: {
            stackOut_124_0 = (RuntimeException) (Object) stackIn_124_0;
            stackOut_124_1 = ((StringBuilder) (Object) stackIn_124_1).append(stackIn_124_2).append(',');
            stackIn_127_0 = stackOut_124_0;
            stackIn_127_1 = stackOut_124_1;
            stackIn_125_0 = stackOut_124_0;
            stackIn_125_1 = stackOut_124_1;
            if (param4 == null) {
              stackOut_127_0 = (RuntimeException) (Object) stackIn_127_0;
              stackOut_127_1 = (StringBuilder) (Object) stackIn_127_1;
              stackOut_127_2 = "null";
              stackIn_128_0 = stackOut_127_0;
              stackIn_128_1 = stackOut_127_1;
              stackIn_128_2 = stackOut_127_2;
              break L27;
            } else {
              stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
              stackOut_125_1 = (StringBuilder) (Object) stackIn_125_1;
              stackOut_125_2 = "{...}";
              stackIn_128_0 = stackOut_125_0;
              stackIn_128_1 = stackOut_125_1;
              stackIn_128_2 = stackOut_125_2;
              break L27;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_128_0, stackIn_128_2 + ')');
        }
        return stackIn_119_0 != 0;
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        if (param1) {
            return;
        }
        try {
            this.b(2993, param0, param2);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "hk.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void e(int param0) {
        try {
            field_i = null;
            if (param0 != -543142776) {
                field_i = null;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "hk.R(" + param0 + ')');
        }
    }

    final synchronized boolean f(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == 32119) {
                break L1;
              } else {
                ((hk) this).field_z = null;
                break L1;
              }
            }
            stackOut_3_0 = ((hk) this).field_M.c();
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "hk.D(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void b(int param0, int param1, int param2) {
        try {
            ((hk) this).field_F[param2] = param1;
            ((hk) this).field_s[param2] = pg.a(-128, param1);
            this.a(param2, (byte) 100, param1);
            if (param0 != 2993) {
                this.a(-27, (byte) -89, -25);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "hk.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, byte param1) {
        RuntimeException runtimeException = null;
        ft var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        byte stackOut_24_0 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var3 = (ft) (Object) ((hk) this).field_L.field_k.d(268435455);
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = param0;
                    stackIn_25_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 < 0) {
                            break L5;
                          } else {
                            if (var3.field_m != param0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (var3.field_e != null) {
                            L7: {
                              var3.field_e.h(tk.field_f / 100);
                              if (!var3.field_e.j()) {
                                break L7;
                              } else {
                                ((hk) this).field_L.field_i.b((rf) (Object) var3.field_e);
                                break L7;
                              }
                            }
                            var3.a(11821);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L8: {
                          if (var3.field_p >= 0) {
                            break L8;
                          } else {
                            ((hk) this).field_E[var3.field_m][var3.field_n] = null;
                            break L8;
                          }
                        }
                        var3.c(-124);
                        break L4;
                      }
                      var3 = (ft) (Object) ((hk) this).field_L.field_k.b((byte) 103);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_24_0 = param1;
                stackIn_25_0 = stackOut_24_0;
                break L2;
              }
              L9: {
                if (stackIn_25_0 > 65) {
                  break L9;
                } else {
                  ((hk) this).field_w = null;
                  break L9;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) (Object) runtimeException, "hk.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        ft var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 4) {
                break L1;
              } else {
                boolean discarded$2 = ((hk) this).a(6, 126, (ap) null, (gk) null, (ob) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (0 == (4 & ((hk) this).field_G[param0])) {
                  break L3;
                } else {
                  var3 = (ft) (Object) ((hk) this).field_L.field_k.d(268435455);
                  L4: while (true) {
                    if (null == var3) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L5: {
                          if (~var3.field_m != ~param0) {
                            break L5;
                          } else {
                            var3.field_t = 0;
                            break L5;
                          }
                        }
                        var3 = (ft) (Object) ((hk) this).field_L.field_k.b((byte) 103);
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3_ref, "hk.PA(" + param0 + ',' + param1 + ')');
        }
    }

    public hk() {
        ((hk) this).field_r = new int[16];
        ((hk) this).field_A = new int[16];
        ((hk) this).field_F = new int[16];
        ((hk) this).field_w = new int[16];
        ((hk) this).field_p = new int[16];
        ((hk) this).field_B = new int[16];
        ((hk) this).field_o = new int[16];
        ((hk) this).field_D = new int[16];
        ((hk) this).field_t = 256;
        ((hk) this).field_m = new int[16];
        ((hk) this).field_z = new int[16];
        ((hk) this).field_G = new int[16];
        ((hk) this).field_K = new ft[16][128];
        ((hk) this).field_N = new int[16];
        ((hk) this).field_J = new int[16];
        ((hk) this).field_l = new int[16];
        ((hk) this).field_s = new int[16];
        ((hk) this).field_E = new ft[16][128];
        ((hk) this).field_I = new int[16];
        ((hk) this).field_C = 1000000;
        ((hk) this).field_M = new k();
        ((hk) this).field_L = new um((hk) this);
        try {
            ((hk) this).field_n = new ph(128);
            ((hk) this).a((byte) -122, 256, -1);
            this.b(true, 12705);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "hk.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[8192];
    }
}
