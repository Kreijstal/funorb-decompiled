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
        int var4 = 47 % ((param2 - 51) / 61);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!this.field_M.c()) {
                    break L3;
                  } else {
                    var4_int = this.field_M.field_e * this.field_C / tk.field_f;
                    L4: while (true) {
                      L5: {
                        var5 = (long)param2 * (long)var4_int + this.field_j;
                        if (0L > this.field_u - var5) {
                          break L5;
                        } else {
                          this.field_j = var5;
                          if (var8 != 0) {
                            break L2;
                          } else {
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      L6: {
                        var7 = (int)((this.field_u + -this.field_j + ((long)var4_int - 1L)) / (long)var4_int);
                        this.field_j = this.field_j + (long)var4_int * (long)var7;
                        this.field_L.b(param0, param1, var7);
                        param1 = param1 + var7;
                        this.a((byte) 53);
                        param2 = param2 - var7;
                        if (this.field_M.c()) {
                          break L6;
                        } else {
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (var8 == 0) {
                        continue L4;
                      } else {
                        this.field_L.b(param0, param1, param2);
                        break L1;
                      }
                    }
                  }
                }
                this.field_L.b(param0, param1, param2);
                break L2;
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("hk.M(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L7;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L7;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(ft param0, boolean param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
                var5 = (int)((long)var4_int * (long)this.field_z[param0.field_m] >> -1841327162);
                if (!AceOfSkies.field_G) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var6 = var4_int + (var4_int - param0.field_x.field_h);
              var5 = (int)((long)var6 * (long)this.field_z[param0.field_m] >> 815925510);
              var4_int = var4_int << 8;
              if ((var4_int ^ -1) >= (var5 ^ -1)) {
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
                this.field_y = -43;
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
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("hk.OA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        if (param1 < 126) {
            this.field_k = false;
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 != 127) {
            return;
        }
        this.field_N[param2] = param1;
    }

    private final void b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          L1: {
            var4 = AceOfSkies.field_G ? 1 : 0;
            if (!param0) {
              break L1;
            } else {
              this.b(-1, (byte) 67);
              if (var4 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.a(true, -1);
          break L0;
        }
        L2: {
          if (param1 == 12705) {
            break L2;
          } else {
            this.b(-31, -4);
            break L2;
          }
        }
        this.c(-1, false);
        var3 = 0;
        L3: while (true) {
          L4: {
            L5: {
              if (-17 >= (var3 ^ -1)) {
                break L5;
              } else {
                this.field_I[var3] = this.field_F[var3];
                var3++;
                if (var4 != 0) {
                  break L4;
                } else {
                  if (var4 == 0) {
                    continue L3;
                  } else {
                    break L5;
                  }
                }
              }
            }
            var3 = 0;
            break L4;
          }
          L6: while (true) {
            L7: {
              if (var3 >= 16) {
                break L7;
              } else {
                this.field_s[var3] = pg.a(-128, this.field_F[var3]);
                var3++;
                if (var4 != 0) {
                  break L7;
                } else {
                  if (var4 == 0) {
                    continue L6;
                  } else {
                    break L7;
                  }
                }
              }
            }
            return;
          }
        }
    }

    final synchronized rf a() {
        return null;
    }

    private final void a(boolean param0, int param1) {
        ft var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        var4 = AceOfSkies.field_G ? 1 : 0;
        var3 = (ft) ((Object) this.field_L.field_k.d(268435455));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackOut_2_0 = param1;
                stackIn_10_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      if (stackIn_3_0 < 0) {
                        break L4;
                      } else {
                        if ((var3.field_m ^ -1) == (param1 ^ -1)) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (-1 >= (var3.field_p ^ -1)) {
                      break L3;
                    } else {
                      this.field_E[var3.field_m][var3.field_n] = null;
                      var3.field_p = 0;
                      break L3;
                    }
                  }
                  var3 = (ft) ((Object) this.field_L.field_k.b((byte) 103));
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_9_0 = param0;
            stackIn_10_0 = stackOut_9_0 ? 1 : 0;
            break L1;
          }
          L5: {
            if (stackIn_10_0 == 1) {
              break L5;
            } else {
              this.field_s = (int[]) null;
              break L5;
            }
          }
          return;
        }
    }

    final synchronized int d() {
        return 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        ft var6 = null;
        int var7 = 0;
        ft var8 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        var8 = this.field_E[param3][param1];
        if (var8 == null) {
          return;
        } else {
          L0: {
            L1: {
              this.field_E[param3][param1] = null;
              if (param2 != (this.field_G[param3] & 2)) {
                break L1;
              } else {
                var8.field_p = 0;
                if (var7 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (ft) ((Object) this.field_L.field_k.d(268435455));
            L2: while (true) {
              L3: {
                if (var6 == null) {
                  break L3;
                } else {
                  if (var7 != 0) {
                    break L0;
                  } else {
                    L4: {
                      if ((var6.field_m ^ -1) != (var8.field_m ^ -1)) {
                        break L4;
                      } else {
                        if (0 <= var6.field_p) {
                          break L4;
                        } else {
                          if (var8 != var6) {
                            var8.field_p = 0;
                            if (var7 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var6 = (ft) ((Object) this.field_L.field_k.b((byte) 103));
                    if (var7 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
          return;
        }
    }

    final synchronized void g(int param0) {
        int var3 = 0;
        ml var4 = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        if (param0 == 0) {
          var4 = (ml) ((Object) this.field_n.a(false));
          L0: while (true) {
            L1: {
              if (var4 == null) {
                break L1;
              } else {
                var4.a(true);
                var4 = (ml) ((Object) this.field_n.a(0));
                if (var3 != 0) {
                  break L1;
                } else {
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = AceOfSkies.field_G ? 1 : 0;
            if (this.field_M.c()) {
              var2 = this.field_C * this.field_M.field_e / tk.field_f;
              L2: while (true) {
                L3: {
                  var3 = this.field_j - -((long)param0 * (long)var2);
                  if (this.field_u + -var3 < 0L) {
                    break L3;
                  } else {
                    this.field_j = var3;
                    if (var6 != 0) {
                      break L0;
                    } else {
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  var5 = (int)((this.field_u - this.field_j + (long)var2 + -1L) / (long)var2);
                  this.field_j = this.field_j + (long)var5 * (long)var2;
                  this.field_L.a(var5);
                  param0 = param0 - var5;
                  this.a((byte) 54);
                  if (this.field_M.c()) {
                    break L4;
                  } else {
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var6 == 0) {
                  continue L2;
                } else {
                  this.field_L.a(param0);
                  break L0;
                }
              }
            } else {
              break L1;
            }
          }
          this.field_L.a(param0);
          break L0;
        }
    }

    private final void a(byte param0, int param1) {
        ft var3 = null;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (param0 < -111) {
          L0: {
            if ((2 & this.field_G[param1] ^ -1) != -1) {
              var3 = (ft) ((Object) this.field_L.field_k.d(268435455));
              L1: while (true) {
                if (var3 == null) {
                  break L0;
                } else {
                  if (var4 != 0) {
                    break L0;
                  } else {
                    L2: {
                      if ((var3.field_m ^ -1) != (param1 ^ -1)) {
                        break L2;
                      } else {
                        if (null != this.field_E[param1][var3.field_n]) {
                          break L2;
                        } else {
                          if (0 <= var3.field_p) {
                            break L2;
                          } else {
                            var3.field_p = 0;
                            break L2;
                          }
                        }
                      }
                    }
                    var3 = (ft) ((Object) this.field_L.field_k.b((byte) 103));
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        ft var5 = null;
        al var6 = null;
        int var6_int = 0;
        ft var7 = null;
        int var8 = 0;
        ft var9 = null;
        int var10 = 0;
        ml var11 = null;
        ml var12 = null;
        ft stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_19_0 = null;
        ft stackIn_19_1 = null;
        Object stackIn_20_0 = null;
        ft stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        ft stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        ft stackOut_4_0 = null;
        wf stackOut_9_0 = null;
        Object stackOut_18_0 = null;
        ft stackOut_18_1 = null;
        Object stackOut_20_0 = null;
        ft stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        Object stackOut_19_0 = null;
        ft stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        L0: {
          L1: {
            var10 = AceOfSkies.field_G ? 1 : 0;
            this.a(64, param2, 0, param3);
            if (0 != (2 & this.field_G[param3])) {
              var5 = (ft) ((Object) this.field_L.field_k.a((byte) -70));
              L2: while (true) {
                if (var5 == null) {
                  break L1;
                } else {
                  stackOut_4_0 = (ft) (var5);
                  stackIn_10_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var10 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if ((stackIn_5_0.field_m ^ -1) != (param3 ^ -1)) {
                        break L3;
                      } else {
                        if (0 <= var5.field_p) {
                          break L3;
                        } else {
                          this.field_E[param3][var5.field_n] = null;
                          this.field_E[param3][param2] = var5;
                          var6_int = var5.field_w + (var5.field_q * var5.field_u >> -591741908);
                          var5.field_w = var5.field_w + (-var5.field_n + param2 << -2030902424);
                          var5.field_q = 4096;
                          var5.field_n = param2;
                          var5.field_u = -var5.field_w + var6_int;
                          return;
                        }
                      }
                    }
                    var5 = (ft) ((Object) this.field_L.field_k.a(110));
                    if (var10 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          stackOut_9_0 = this.field_n.a((byte) 106, (long)this.field_I[param3]);
          stackIn_10_0 = stackOut_9_0;
          break L0;
        }
        var11 = (ml) ((Object) stackIn_10_0);
        var12 = var11;
        if (var12 == null) {
          return;
        } else {
          var6 = var11.field_f[param2];
          if (var6 != null) {
            L4: {
              L5: {
                var8 = 5 / ((-31 - param0) / 43);
                var7 = new ft();
                var7.field_y = var12;
                var7.field_m = param3;
                var7.field_x = var6;
                var7.field_r = var11.field_o[param2];
                var7.field_f = var11.field_e[param2];
                var7.field_n = param2;
                var7.field_h = 1024 + var11.field_k[param2] * var12.field_i * (param1 * param1) >> 2103000043;
                var7.field_v = var11.field_q[param2] & 255;
                var7.field_w = (param2 << 842833992) - (var11.field_n[param2] & 32767);
                var7.field_g = 0;
                var7.field_p = -1;
                var7.field_A = 0;
                var7.field_s = 0;
                var7.field_k = 0;
                if (-1 != (this.field_z[param3] ^ -1)) {
                  break L5;
                } else {
                  var7.field_e = su.a(var6, this.b((byte) -113, var7), this.a((byte) -67, var7), this.b(77, var7));
                  if (var10 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                var7.field_e = su.a(var6, this.b((byte) -126, var7), 0, this.b(85, var7));
                stackOut_18_0 = this;
                stackOut_18_1 = (ft) (var7);
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (-1 >= (var11.field_n[param2] ^ -1)) {
                  stackOut_20_0 = this;
                  stackOut_20_1 = (ft) ((Object) stackIn_20_1);
                  stackOut_20_2 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  break L6;
                } else {
                  stackOut_19_0 = this;
                  stackOut_19_1 = (ft) ((Object) stackIn_19_1);
                  stackOut_19_2 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  break L6;
                }
              }
              this.a(stackIn_21_1, stackIn_21_2 != 0, true);
              break L4;
            }
            L7: {
              if (-1 < (var11.field_n[param2] ^ -1)) {
                var7.field_e.d(-1);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (-1 < (var7.field_f ^ -1)) {
                break L8;
              } else {
                L9: {
                  var9 = this.field_K[param3][var7.field_f];
                  if (var9 == null) {
                    break L9;
                  } else {
                    if (var9.field_p < 0) {
                      this.field_E[param3][var9.field_n] = null;
                      var9.field_p = 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                this.field_K[param3][var7.field_f] = var7;
                break L8;
              }
            }
            this.field_L.field_k.a(120, var7);
            this.field_E[param3][param2] = var7;
            return;
          } else {
            return;
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        int discarded$0 = 0;
        this.field_o[param0] = param1;
        if (param2 != 3830) {
            discarded$0 = this.b((byte) 103, (ft) null);
        }
        this.field_m[param0] = (int)(0.5 + Math.pow(2.0, (double)param1 * 0.00054931640625) * 2097152.0);
    }

    final synchronized rf b() {
        return (rf) ((Object) this.field_L);
    }

    private final void a(byte param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        byte stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        L0: {
          var7 = AceOfSkies.field_G ? 1 : 0;
          var2 = this.field_H;
          var3 = this.field_q;
          var4 = this.field_u;
          if (null == this.field_x) {
            break L0;
          } else {
            if (this.field_y == var3) {
              this.a(122, this.field_v, this.field_k, this.field_x);
              this.a((byte) 92);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          stackOut_4_0 = var3 ^ -1;
          stackOut_4_1 = this.field_q ^ -1;
          stackIn_5_0 = stackOut_4_0;
          stackIn_5_1 = stackOut_4_1;
          L2: while (true) {
            L3: {
              L4: {
                if (stackIn_5_0 != stackIn_5_1) {
                  break L4;
                } else {
                  L5: while (true) {
                    stackOut_6_0 = var3;
                    stackOut_6_1 = this.field_M.field_f[var2];
                    stackIn_29_0 = stackOut_6_0;
                    stackIn_29_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      L6: {
                        if (stackIn_7_0 != stackIn_7_1) {
                          break L6;
                        } else {
                          this.field_M.a(var2);
                          var6 = this.field_M.e(var2);
                          stackOut_8_0 = -2;
                          stackOut_8_1 = var6 ^ -1;
                          stackIn_5_0 = stackOut_8_0;
                          stackIn_5_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (var7 != 0) {
                            continue L2;
                          } else {
                            if (stackIn_9_0 != stackIn_9_1) {
                              L7: {
                                if ((128 & var6 ^ -1) != -1) {
                                  this.b(-128, var6);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              this.field_M.c(var2);
                              this.field_M.f(var2);
                              if (var7 == 0) {
                                continue L5;
                              } else {
                                break L6;
                              }
                            } else {
                              this.field_M.a();
                              this.field_M.f(var2);
                              if (!this.field_M.g()) {
                                break L6;
                              } else {
                                if (this.field_x != null) {
                                  this.a(this.field_k, -2029711608, this.field_x);
                                  this.a((byte) 122);
                                  return;
                                } else {
                                  L8: {
                                    if (!this.field_k) {
                                      break L8;
                                    } else {
                                      if ((var3 ^ -1) == -1) {
                                        break L8;
                                      } else {
                                        this.field_M.a(var4);
                                        if (var7 == 0) {
                                          break L6;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                  this.b(true, 12705);
                                  this.field_M.d();
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                      var2 = this.field_M.e();
                      var3 = this.field_M.field_f[var2];
                      var4 = this.field_M.d(var3);
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L9: {
                this.field_H = var2;
                this.field_q = var3;
                this.field_u = var4;
                if (this.field_x == null) {
                  break L9;
                } else {
                  if (var3 > this.field_y) {
                    this.field_q = this.field_y;
                    this.field_H = -1;
                    this.field_u = this.field_M.d(this.field_q);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              stackOut_28_0 = param0;
              stackOut_28_1 = 16;
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              break L3;
            }
            L10: {
              if (stackIn_29_0 >= stackIn_29_1) {
                break L10;
              } else {
                discarded$1 = this.a(-128, (ft) null);
                break L10;
              }
            }
            return;
          }
        }
    }

    private final void c(int param0, boolean param1) {
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (0 <= param0) {
          L0: {
            if (!param1) {
              break L0;
            } else {
              this.field_N = (int[]) null;
              break L0;
            }
          }
          this.field_J[param0] = 12800;
          this.field_p[param0] = 8192;
          this.field_w[param0] = 16383;
          this.field_N[param0] = 8192;
          this.field_A[param0] = 0;
          this.field_r[param0] = 8192;
          this.a((byte) -116, param0);
          this.a(param0, (byte) 4);
          this.field_G[param0] = 0;
          this.field_D[param0] = 32767;
          this.field_B[param0] = 256;
          this.field_z[param0] = 0;
          this.c(param0, 8192, 3830);
          return;
        } else {
          param0 = 0;
          L1: while (true) {
            if ((param0 ^ -1) <= -17) {
              return;
            } else {
              this.c(param0, false);
              param0++;
              if (var4 == 0) {
                continue L1;
              } else {
                return;
              }
            }
          }
        }
    }

    final synchronized void a(int param0, int param1) {
        this.field_C = param0;
        if (param1 > -102) {
            this.field_J = (int[]) null;
        }
    }

    final synchronized void d(int param0) {
        if (param0 >= -125) {
            this.field_r = (int[]) null;
        }
        this.a(2097152, true);
    }

    final synchronized void a(boolean param0, int param1, ap param2) {
        try {
            this.a(param1 ^ -2029711495, true, param0, param2);
            if (param1 != -2029711608) {
                this.a(43);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "hk.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void a(int param0, boolean param1, boolean param2, ap param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.a(2097152, param1);
              this.field_M.a(param3.field_e);
              this.field_j = 0L;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param2) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((hk) (this)).field_k = stackIn_4_1 != 0;
            var5_int = this.field_M.f();
            var6 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var6 >= var5_int) {
                    break L4;
                  } else {
                    this.field_M.a(var6);
                    this.field_M.c(var6);
                    this.field_M.f(var6);
                    var6++;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.field_H = this.field_M.e();
                break L3;
              }
              L5: {
                if (param0 > 110) {
                  break L5;
                } else {
                  this.a(-102, (byte) -90);
                  break L5;
                }
              }
              this.field_q = this.field_M.field_f[this.field_H];
              this.field_u = this.field_M.d(this.field_q);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (runtimeException);
            stackOut_14_1 = new StringBuilder().append("hk.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2) {
        rf discarded$2 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = AceOfSkies.field_G ? 1 : 0;
            if (param2 != this.field_I[param0]) {
              this.field_I[param0] = param2;
              var4 = 0;
              L2: while (true) {
                if (128 <= var4) {
                  break L1;
                } else {
                  this.field_K[param0][var4] = null;
                  var4++;
                  if (var5 != 0) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          if (param1 >= 50) {
            break L0;
          } else {
            discarded$2 = this.b();
            break L0;
          }
        }
    }

    final boolean a(int param0, ft param1) {
        RuntimeException var3 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (null == param1.field_e) {
              if (param1.field_p >= 0) {
                L1: {
                  param1.c(-125);
                  if (0 >= param1.field_f) {
                    break L1;
                  } else {
                    if (this.field_K[param1.field_m][param1.field_f] == param1) {
                      this.field_K[param1.field_m][param1.field_f] = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return true;
              }
            } else {
              if (param0 == 0) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("hk.I(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final synchronized boolean a(int param0, int param1, ap param2, gk param3, ob param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        ub var8 = null;
        int var9 = 0;
        int var11 = 0;
        ml var12 = null;
        ml var13 = null;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param2.b();
              var6_int = 1;
              var7 = null;
              if ((param1 ^ -1) >= param0) {
                break L1;
              } else {
                var7 = new int[]{param1};
                break L1;
              }
            }
            var8 = (ub) ((Object) param2.field_f.a(false));
            L2: while (true) {
              L3: {
                L4: {
                  if (var8 == null) {
                    break L4;
                  } else {
                    var9 = (int)var8.field_b;
                    var12 = (ml) ((Object) this.field_n.a((byte) 106, (long)var9));
                    if (var11 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (var12 == null) {
                            L7: {
                              var13 = gu.a(var9, param3, 16652);
                              if (var13 == null) {
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
                            this.field_n.a(param0 ^ -98, (long)var9, var13);
                            if (!var13.a(var8.field_e, (int[]) (var7), param4, 5193)) {
                              break L6;
                            } else {
                              break L5;
                            }
                          } else {
                            if (!var12.a(var8.field_e, (int[]) (var7), param4, 5193)) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var6_int = 0;
                        break L5;
                      }
                      var8 = (ub) ((Object) param2.field_f.a(param0 + 1));
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
              stackOut_18_0 = var6_int;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var6);
            stackOut_20_1 = new StringBuilder().append("hk.J(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          L9: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param4 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final synchronized void b(int param0, boolean param1) {
        if (param1) {
            this.field_v = false;
        }
        this.field_t = param0;
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = AceOfSkies.field_G ? 1 : 0;
          if (param0 < -115) {
            break L0;
          } else {
            this.field_o = (int[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-1 < (param2 ^ -1)) {
              break L2;
            } else {
              this.field_l[param2] = param1;
              if (var5 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          var4 = 0;
          L3: while (true) {
            if (var4 >= 16) {
              break L1;
            } else {
              this.field_l[var4] = param1;
              var4++;
              if (var5 != 0) {
                break L1;
              } else {
                if (var5 == 0) {
                  continue L3;
                } else {
                  break L1;
                }
              }
            }
          }
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var3_int = this.field_p[param1.field_m];
            if (param0 > 54) {
              if ((var3_int ^ -1) <= -8193) {
                stackOut_6_0 = -((-param1.field_v + 128) * (16384 - var3_int) - -32 >> 479149670) + 16384;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = var3_int * param1.field_v - -32 >> 289377862;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = -42;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("hk.JA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    private final int a(byte param0, ft param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        dh var9 = null;
        dh var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (this.field_l[param1.field_m] != 0) {
              L1: {
                var9 = param1.field_r;
                var10 = var9;
                var4 = 4096 + this.field_w[param1.field_m] * this.field_J[param1.field_m] >> 1390034221;
                var4 = 16384 + var4 * var4 >> 1302806831;
                var4 = 16384 + var4 * param1.field_h >> 1410798607;
                var4 = 128 + this.field_t * var4 >> -1784802136;
                var4 = this.field_l[param1.field_m] * var4 - -128 >> -543142776;
                if (param0 == -67) {
                  break L1;
                } else {
                  this.field_u = 112L;
                  break L1;
                }
              }
              L2: {
                if (0 >= var10.field_b) {
                  break L2;
                } else {
                  var4 = (int)(0.5 + Math.pow(0.5, (double)var10.field_b * ((double)param1.field_A * 0.00001953125)) * (double)var4);
                  break L2;
                }
              }
              L3: {
                if (var10.field_g == null) {
                  break L3;
                } else {
                  L4: {
                    var5 = param1.field_s;
                    var6 = var10.field_g[param1.field_g + 1];
                    if (param1.field_g >= var10.field_g.length - 2) {
                      break L4;
                    } else {
                      var7 = 65280 & var9.field_g[param1.field_g] << -2087311320;
                      var8 = (var10.field_g[2 + param1.field_g] & 255) << 1858141288;
                      var6 = var6 + (var5 - var7) * (-var6 + var10.field_g[param1.field_g + 3]) / (-var7 + var8);
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
                  if (var10.field_e != null) {
                    L6: {
                      var5 = param1.field_p;
                      var6 = var10.field_e[param1.field_k - -1];
                      if ((param1.field_k ^ -1) > (var10.field_e.length - 2 ^ -1)) {
                        var7 = (255 & var9.field_e[param1.field_k]) << -2029711608;
                        var8 = (255 & var10.field_e[param1.field_k - -2]) << 86640264;
                        var6 = var6 + (-var6 + var10.field_e[param1.field_k + 3]) * (var5 - var7) / (-var7 + var8);
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
              stackOut_18_0 = var4;
              stackIn_19_0 = stackOut_18_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("hk.C(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_19_0;
        }
    }

    private final synchronized void a(int param0, boolean param1) {
        this.field_M.d();
        this.field_x = null;
        this.b(param1, 12705);
        if (param0 != 2097152) {
            this.a(-3, true);
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        var3 = param1 & 240;
        if ((var3 ^ -1) != -129) {
          L0: {
            if (144 == var3) {
              L1: {
                var4 = param1 & 15;
                var5 = 127 & param1 >> -544703320;
                var6 = 127 & param1 >> -1959037360;
                if ((var6 ^ -1) >= -1) {
                  break L1;
                } else {
                  this.b(35, var6, var5, var4);
                  if (var8 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              this.a(64, var5, param0 + 128, var4);
              return;
            } else {
              if (var3 == 160) {
                var4 = 15 & param1;
                var5 = param1 >> -1389716088 & 127;
                var6 = (param1 & 8337132) >> -385328656;
                this.a(var6, (byte) 127, var4, var5);
                return;
              } else {
                L2: {
                  if (param0 == -128) {
                    break L2;
                  } else {
                    this.field_s = (int[]) null;
                    break L2;
                  }
                }
                if (-177 != (var3 ^ -1)) {
                  if ((var3 ^ -1) != -193) {
                    if ((var3 ^ -1) == -209) {
                      var4 = param1 & 15;
                      var5 = (32723 & param1) >> -12639416;
                      this.a(var4, var5, (byte) -34);
                      return;
                    } else {
                      if (var3 == 224) {
                        var4 = 15 & param1;
                        var5 = (param1 >> -293195479 & 16256) - -(127 & param1 >> -2058178520);
                        this.a(param0 + 255, var5, var4);
                        return;
                      } else {
                        var3 = 255 & param1;
                        if (-256 == (var3 ^ -1)) {
                          this.b(true, param0 + 12833);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    var4 = 15 & param1;
                    var5 = (32710 & param1) >> -952052664;
                    this.a(var4, (byte) 101, this.field_s[var4] + var5);
                    return;
                  }
                } else {
                  L3: {
                    var4 = param1 & 15;
                    var5 = 127 & param1 >> -1875940440;
                    var6 = param1 >> 260667280 & 127;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      this.field_s[var4] = pg.a(this.field_s[var4], -2080769) + (var6 << 637857966);
                      break L3;
                    }
                  }
                  L4: {
                    if (32 == var5) {
                      this.field_s[var4] = pg.a(-16257, this.field_s[var4]) + (var6 << -1449387449);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (1 != var5) {
                      break L5;
                    } else {
                      this.field_A[var4] = pg.a(-16257, this.field_A[var4]) + (var6 << 383813287);
                      break L5;
                    }
                  }
                  L6: {
                    if (var5 == 33) {
                      this.field_A[var4] = var6 + pg.a(this.field_A[var4], -128);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((var5 ^ -1) != -6) {
                      break L7;
                    } else {
                      this.field_r[var4] = pg.a(-16257, this.field_r[var4]) + (var6 << -1638062137);
                      break L7;
                    }
                  }
                  L8: {
                    if (-38 != (var5 ^ -1)) {
                      break L8;
                    } else {
                      this.field_r[var4] = var6 + pg.a(this.field_r[var4], -128);
                      break L8;
                    }
                  }
                  L9: {
                    if (7 == var5) {
                      this.field_J[var4] = pg.a(this.field_J[var4], -16257) + (var6 << 964509767);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (-40 != (var5 ^ -1)) {
                      break L10;
                    } else {
                      this.field_J[var4] = var6 + pg.a(this.field_J[var4], -128);
                      break L10;
                    }
                  }
                  L11: {
                    if (var5 != 10) {
                      break L11;
                    } else {
                      this.field_p[var4] = (var6 << -1441055481) + pg.a(-16257, this.field_p[var4]);
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 != 42) {
                      break L12;
                    } else {
                      this.field_p[var4] = var6 + pg.a(this.field_p[var4], -128);
                      break L12;
                    }
                  }
                  L13: {
                    if (-12 == (var5 ^ -1)) {
                      this.field_w[var4] = (var6 << -583906745) + pg.a(-16257, this.field_w[var4]);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (43 != var5) {
                      break L14;
                    } else {
                      this.field_w[var4] = var6 + pg.a(this.field_w[var4], -128);
                      break L14;
                    }
                  }
                  L15: {
                    if (64 != var5) {
                      break L15;
                    } else {
                      L16: {
                        if (var6 < 64) {
                          break L16;
                        } else {
                          this.field_G[var4] = vo.a(this.field_G[var4], 1);
                          if (var8 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      this.field_G[var4] = pg.a(this.field_G[var4], -2);
                      break L15;
                    }
                  }
                  L17: {
                    if (65 == var5) {
                      L18: {
                        if (var6 >= 64) {
                          break L18;
                        } else {
                          this.a((byte) -126, var4);
                          this.field_G[var4] = pg.a(this.field_G[var4], -3);
                          if (var8 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      this.field_G[var4] = vo.a(this.field_G[var4], 2);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L19: {
                    if ((var5 ^ -1) == -100) {
                      this.field_D[var4] = (var6 << -913265241) + pg.a(this.field_D[var4], 127);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (-99 != (var5 ^ -1)) {
                      break L20;
                    } else {
                      this.field_D[var4] = pg.a(16256, this.field_D[var4]) - -var6;
                      break L20;
                    }
                  }
                  L21: {
                    if ((var5 ^ -1) == -102) {
                      this.field_D[var4] = (var6 << 1873769255) + pg.a(this.field_D[var4], 127) + 16384;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (-101 != (var5 ^ -1)) {
                      break L22;
                    } else {
                      this.field_D[var4] = pg.a(16256, this.field_D[var4]) + 16384 + var6;
                      break L22;
                    }
                  }
                  L23: {
                    if (120 != var5) {
                      break L23;
                    } else {
                      this.b(var4, (byte) 95);
                      break L23;
                    }
                  }
                  L24: {
                    if ((var5 ^ -1) != -122) {
                      break L24;
                    } else {
                      this.c(var4, false);
                      break L24;
                    }
                  }
                  L25: {
                    if (123 != var5) {
                      break L25;
                    } else {
                      this.a(true, var4);
                      break L25;
                    }
                  }
                  L26: {
                    if (var5 != 6) {
                      break L26;
                    } else {
                      var7 = this.field_D[var4];
                      if (16384 != var7) {
                        break L26;
                      } else {
                        this.field_B[var4] = (var6 << -956481817) + pg.a(this.field_B[var4], -16257);
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (var5 == 38) {
                      var7 = this.field_D[var4];
                      if ((var7 ^ -1) != -16385) {
                        break L27;
                      } else {
                        this.field_B[var4] = var6 + pg.a(this.field_B[var4], -128);
                        break L27;
                      }
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (-17 == (var5 ^ -1)) {
                      this.field_z[var4] = (var6 << -24230713) + pg.a(this.field_z[var4], -16257);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if ((var5 ^ -1) != -49) {
                      break L29;
                    } else {
                      this.field_z[var4] = pg.a(-128, this.field_z[var4]) + var6;
                      break L29;
                    }
                  }
                  L30: {
                    if (var5 == 81) {
                      L31: {
                        if (64 > var6) {
                          break L31;
                        } else {
                          this.field_G[var4] = vo.a(this.field_G[var4], 4);
                          if (var8 == 0) {
                            break L30;
                          } else {
                            break L31;
                          }
                        }
                      }
                      this.a(var4, (byte) 4);
                      this.field_G[var4] = pg.a(this.field_G[var4], -5);
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  L32: {
                    if ((var5 ^ -1) == -18) {
                      this.c(var4, (this.field_o[var4] & -16257) + (var6 << 2126190759), 3830);
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  if (-50 != (var5 ^ -1)) {
                    break L0;
                  } else {
                    this.c(var4, var6 + (-128 & this.field_o[var4]), param0 ^ -3722);
                    return;
                  }
                }
              }
            }
          }
          return;
        } else {
          var4 = 15 & param1;
          var5 = (param1 & 32672) >> -1270347576;
          var6 = (8343301 & param1) >> -714142320;
          this.a(var6, var5, 0, var4);
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
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var3_int = (param1.field_u * param1.field_q >> -2138420020) + param1.field_w;
              var3_int = var3_int + (this.field_B[param1.field_m] * (-8192 + this.field_N[param1.field_m]) >> 1424702124);
              var4 = param1.field_r;
              if (param0 <= -56) {
                break L1;
              } else {
                this.b(-101, (byte) 115);
                break L1;
              }
            }
            L2: {
              if ((var4.field_i ^ -1) >= -1) {
                break L2;
              } else {
                L3: {
                  if (-1 > (var4.field_j ^ -1)) {
                    break L3;
                  } else {
                    if (this.field_A[param1.field_m] <= 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_j << 1156292610;
                  var6 = var4.field_a << -1374848415;
                  if ((param1.field_j ^ -1) > (var6 ^ -1)) {
                    var5 = param1.field_j * var5 / var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var5 = var5 + (this.field_A[param1.field_m] >> 1287252487);
                var7 = Math.sin((double)(511 & param1.field_z) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)((double)(256 * param1.field_x.field_i) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)tk.field_f + 0.5);
              if (1 <= var5) {
                stackOut_12_0 = var5;
                stackIn_13_0 = stackOut_12_0;
                break L5;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("hk.LA(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    final boolean a(int param0, int param1, boolean param2, ft param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        dh var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_70_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
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
                  if ((param3.field_f ^ -1) >= -1) {
                    break L3;
                  } else {
                    if (param3 == this.field_K[param3.field_m][param3.field_f]) {
                      this.field_K[param3.field_m][param3.field_f] = null;
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param3.field_q;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, (double)this.field_r[param3.field_m] * 0.0004921259842519685) + 0.5);
                  if (-1 >= (var6_int ^ -1)) {
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
              if ((var7.field_b ^ -1) >= -1) {
                break L6;
              } else {
                L7: {
                  L8: {
                    if (-1 <= (var7.field_f ^ -1)) {
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
                      if ((param3.field_g ^ -1) <= (-2 + var7.field_g.length ^ -1)) {
                        break L14;
                      } else {
                        stackOut_29_0 = (255 & var7.field_g[2 + param3.field_g]) << -1068432120 ^ -1;
                        stackOut_29_1 = param3.field_s ^ -1;
                        stackIn_34_0 = stackOut_29_0;
                        stackIn_34_1 = stackOut_29_1;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        if (var11 != 0) {
                          break L13;
                        } else {
                          if (stackIn_30_0 <= stackIn_30_1) {
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
                    stackOut_33_0 = param3.field_g;
                    stackOut_33_1 = var7.field_g.length + -2;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    break L13;
                  }
                  if (stackIn_34_0 != stackIn_34_1) {
                    break L9;
                  } else {
                    if ((var7.field_g[param3.field_g + 1] ^ -1) == -1) {
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
                  if (0 != (1 & this.field_G[param3.field_m])) {
                    break L15;
                  } else {
                    L16: {
                      if (param3.field_f < 0) {
                        break L16;
                      } else {
                        if (param3 == this.field_K[param3.field_m][param3.field_f]) {
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
                          if ((-2 + var7.field_e.length ^ -1) >= (param3.field_k ^ -1)) {
                            break L21;
                          } else {
                            stackOut_49_0 = param3.field_p ^ -1;
                            stackOut_49_1 = 65280 & var7.field_e[param3.field_k - -2] << 1732155304 ^ -1;
                            stackIn_54_0 = stackOut_49_0;
                            stackIn_54_1 = stackOut_49_1;
                            stackIn_50_0 = stackOut_49_0;
                            stackIn_50_1 = stackOut_49_1;
                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (stackIn_50_0 >= stackIn_50_1) {
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
                        stackOut_53_0 = -2 + var7.field_e.length ^ -1;
                        stackOut_53_1 = param3.field_k ^ -1;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        break L20;
                      }
                      if (stackIn_54_0 == stackIn_54_1) {
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
              stackOut_72_0 = 0;
              stackIn_73_0 = stackOut_72_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L22: {
                L23: {
                  param3.field_e.h(param3.field_i);
                  if (param4 != null) {
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
                  this.field_L.field_i.b(param3.field_e);
                  break L24;
                }
              }
              L25: {
                param3.a(11821);
                if (param3.field_p >= 0) {
                  param3.c(-123);
                  if ((param3.field_f ^ -1) >= -1) {
                    break L25;
                  } else {
                    if (this.field_K[param3.field_m][param3.field_f] == param3) {
                      this.field_K[param3.field_m][param3.field_f] = null;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                } else {
                  break L25;
                }
              }
              stackOut_70_0 = 1;
              stackIn_71_0 = stackOut_70_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) (var6);
            stackOut_74_1 = new StringBuilder().append("hk.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param3 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L26;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L26;
            }
          }
          L27: {
            stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',');
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param4 == null) {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L27;
            } else {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L27;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_71_0 != 0;
          } else {
            return stackIn_73_0 != 0;
          }
        }
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        if (param1) {
            return;
        }
        this.b(2993, param0, param2);
    }

    public static void e(int param0) {
        field_i = null;
        if (param0 != -543142776) {
            field_i = (int[]) null;
        }
    }

    final synchronized boolean f(int param0) {
        if (param0 != 32119) {
            this.field_z = (int[]) null;
        }
        return this.field_M.c();
    }

    private final void b(int param0, int param1, int param2) {
        this.field_F[param2] = param1;
        this.field_s[param2] = pg.a(-128, param1);
        this.a(param2, (byte) 100, param1);
        if (param0 != 2993) {
            this.a(-27, (byte) -89, -25);
        }
    }

    private final void b(int param0, byte param1) {
        ft var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_2_0 = 0;
        byte stackOut_15_0 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        var3 = (ft) ((Object) this.field_L.field_k.d(268435455));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackOut_2_0 = param0;
                stackIn_16_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      if (stackIn_3_0 < 0) {
                        break L4;
                      } else {
                        if (var3.field_m != param0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var3.field_e != null) {
                        L6: {
                          var3.field_e.h(tk.field_f / 100);
                          if (!var3.field_e.j()) {
                            break L6;
                          } else {
                            this.field_L.field_i.b(var3.field_e);
                            break L6;
                          }
                        }
                        var3.a(11821);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L7: {
                      if (var3.field_p >= 0) {
                        break L7;
                      } else {
                        this.field_E[var3.field_m][var3.field_n] = null;
                        break L7;
                      }
                    }
                    var3.c(-124);
                    break L3;
                  }
                  var3 = (ft) ((Object) this.field_L.field_k.b((byte) 103));
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_15_0 = param1;
            stackIn_16_0 = stackOut_15_0;
            break L1;
          }
          L8: {
            if (stackIn_16_0 > 65) {
              break L8;
            } else {
              this.field_w = (int[]) null;
              break L8;
            }
          }
          return;
        }
    }

    private final void a(int param0, byte param1) {
        boolean discarded$2 = false;
        ft var3 = null;
        int var4 = 0;
        L0: {
          var4 = AceOfSkies.field_G ? 1 : 0;
          if (param1 == 4) {
            break L0;
          } else {
            discarded$2 = this.a(6, 126, (ap) null, (gk) null, (ob) null);
            break L0;
          }
        }
        L1: {
          if (0 == (4 & this.field_G[param0])) {
            break L1;
          } else {
            var3 = (ft) ((Object) this.field_L.field_k.d(268435455));
            L2: while (true) {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (var4 != 0) {
                    break L1;
                  } else {
                    L4: {
                      if ((var3.field_m ^ -1) != (param0 ^ -1)) {
                        break L4;
                      } else {
                        var3.field_t = 0;
                        break L4;
                      }
                    }
                    var3 = (ft) ((Object) this.field_L.field_k.b((byte) 103));
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L1;
            }
          }
        }
    }

    public hk() {
        this.field_r = new int[16];
        this.field_A = new int[16];
        this.field_F = new int[16];
        this.field_w = new int[16];
        this.field_p = new int[16];
        this.field_B = new int[16];
        this.field_o = new int[16];
        this.field_D = new int[16];
        this.field_t = 256;
        this.field_m = new int[16];
        this.field_z = new int[16];
        this.field_G = new int[16];
        this.field_K = new ft[16][128];
        this.field_N = new int[16];
        this.field_J = new int[16];
        this.field_l = new int[16];
        this.field_s = new int[16];
        this.field_E = new ft[16][128];
        this.field_I = new int[16];
        this.field_C = 1000000;
        this.field_M = new k();
        this.field_L = new um((hk) (this));
        this.field_n = new ph(128);
        this.a((byte) -122, 256, -1);
        this.b(true, 12705);
    }

    static {
        field_i = new int[8192];
    }
}
