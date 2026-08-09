/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aga extends rk {
    int field_x;
    int field_J;
    int field_E;
    int field_I;
    boolean field_A;
    boolean field_G;
    int field_F;
    int field_s;
    op field_w;
    int field_y;
    int field_v;
    int field_u;
    int field_C;
    int field_t;
    boolean field_z;
    int field_D;
    int field_H;
    int[] field_K;

    final boolean c(byte param0, int param1) {
        oha var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -10) {
                break L1;
              } else {
                this.field_K = (int[]) null;
                break L1;
              }
            }
            var3 = ur.field_e[param1];
            if ((this.field_y ^ -1) != -45) {
              if (this.field_y != 29) {
                L2: {
                  if (35 != this.field_y) {
                    break L2;
                  } else {
                    if (1 < var3.field_l) {
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                if (-3 != (this.field_y ^ -1)) {
                  L3: {
                    if (this.field_y != 9) {
                      break L3;
                    } else {
                      if ((var3.field_a ^ -1) != -2) {
                        break L3;
                      } else {
                        stackIn_25_0 = 0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    }
                  }
                  L4: {
                    if ((this.field_y ^ -1) != -9) {
                      break L4;
                    } else {
                      if ((var3.field_a ^ -1) == -3) {
                        stackIn_33_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (54 == this.field_y) {
                    stackIn_38_0 = 0;
                    decompiledRegionSelector0 = 6;
                    break L0;
                  } else {
                    stackIn_40_0 = 1;
                    decompiledRegionSelector0 = 7;
                    break L0;
                  }
                } else {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3_ref), "aga.U(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_25_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_33_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_38_0 != 0;
                    } else {
                      return stackIn_40_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final boolean f(int param0, int param1) {
        oha var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = ur.field_e[param1];
              var4 = this.b(param1, (byte) -127);
              if (var3.field_g == param0) {
                break L1;
              } else {
                if ((this.field_K[var4] ^ -1) == (1 + var3.field_g ^ -1)) {
                  break L1;
                } else {
                  stackIn_9_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_7_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3_ref), "aga.OA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final static void d(boolean param0) {
        int[] var1 = dr.c(106);
        if (param0) {
            return;
        }
        if (null == var1) {
            return;
        }
        try {
            mn.field_l = new hca(var1[0], var1[1], kda.b(97));
            uka.field_h = new hca(320, 400, bf.field_h[wca.field_n].field_j);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "aga.GA(" + param0 + ')');
        }
    }

    final void a(boolean param0, byte param1, int param2) {
        int var4_int = 0;
        oha var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if ((this.field_y ^ -1) == -1) {
                break L1;
              } else {
                if (this.field_y != 35) {
                  this.field_C = this.field_C - 1;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 < -7) {
                break L2;
              } else {
                this.a(19, (byte) -77);
                break L2;
              }
            }
            var4_int = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var4_int >= this.field_K.length) {
                    break L5;
                  } else {
                    if (var6 != 0) {
                      break L4;
                    } else {
                      L6: {
                        if ((this.field_m[var4_int] ^ -1) == 0) {
                          break L6;
                        } else {
                          var5 = ur.field_e[this.field_o.field_g.field_b[this.field_m[var4_int]]];
                          if ((this.field_K[var4_int] ^ -1) <= (var5.field_g ^ -1)) {
                            break L6;
                          } else {
                            this.field_K[var4_int] = this.field_K[var4_int] + 1;
                            break L6;
                          }
                        }
                      }
                      var4_int++;
                      if (var6 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var4), "aga.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 > 50) {
              L1: {
                L2: {
                  L3: {
                    if (-24 != (this.field_w.field_a[this.field_x][this.field_J].field_n ^ -1)) {
                      break L3;
                    } else {
                      if (!this.field_w.a(this.field_J, (byte) 124, this.field_x)) {
                        break L3;
                      } else {
                        if (-1 == (this.field_D ^ -1)) {
                          break L3;
                        } else {
                          if (!this.g((byte) 85)) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  L4: {
                    if (24 != this.field_w.field_a[this.field_x][this.field_J].field_n) {
                      break L4;
                    } else {
                      if (!this.field_w.a(this.field_J, (byte) 120, this.field_x)) {
                        break L4;
                      } else {
                        if (-2 == (this.field_D ^ -1)) {
                          break L4;
                        } else {
                          if (this.g((byte) 85)) {
                            break L4;
                          } else {
                            this.b((byte) 125, 25);
                            this.field_w.field_T.field_G[1] = true;
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                  L5: {
                    if (25 != this.field_w.field_a[this.field_x][this.field_J].field_n) {
                      break L5;
                    } else {
                      if (!this.field_w.a(this.field_J, (byte) 115, this.field_x)) {
                        break L5;
                      } else {
                        if (this.field_D == 2) {
                          break L5;
                        } else {
                          if (this.g((byte) 85)) {
                            break L5;
                          } else {
                            this.b((byte) 115, 26);
                            this.field_w.field_T.field_G[2] = true;
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                  }
                  if ((this.field_w.field_a[this.field_x][this.field_J].field_n ^ -1) != -27) {
                    break L1;
                  } else {
                    if (!this.field_w.a(this.field_J, (byte) 121, this.field_x)) {
                      break L1;
                    } else {
                      if ((this.field_D ^ -1) == -4) {
                        break L1;
                      } else {
                        if (!this.g((byte) 85)) {
                          this.b((byte) 114, 27);
                          this.field_w.field_T.field_G[3] = true;
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                this.b((byte) 115, 24);
                this.field_w.field_T.field_G[0] = true;
                break L1;
              }
              L6: {
                L7: {
                  if (!this.i(23, 118)) {
                    break L7;
                  } else {
                    if (!this.g((byte) 85)) {
                      break L7;
                    } else {
                      if (-1 != (this.field_D ^ -1)) {
                        break L7;
                      } else {
                        L8: {
                          this.field_w.field_C[this.field_D] = this.field_w.field_C[this.field_D] + 1;
                          this.field_w.field_T.field_s[this.field_D] = this.field_w.field_T.field_s[this.field_D] + 1;
                          var2_int = this.field_w.b((byte) 65, (aga) (this));
                          if (0 == (var2_int ^ -1)) {
                            break L8;
                          } else {
                            this.field_w.a(var2_int, (byte) 82);
                            this.field_y = 0;
                            break L8;
                          }
                        }
                        if (var3 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                L9: {
                  L10: {
                    if (!this.i(24, -105)) {
                      break L10;
                    } else {
                      if (!this.g((byte) 85)) {
                        break L10;
                      } else {
                        if (1 == this.field_D) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (!this.i(25, 127)) {
                        break L12;
                      } else {
                        if (!this.g((byte) 85)) {
                          break L12;
                        } else {
                          if (this.field_D == 2) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    if (!this.i(26, 125)) {
                      break L6;
                    } else {
                      if (!this.g((byte) 85)) {
                        break L6;
                      } else {
                        if (this.field_D == 3) {
                          L13: {
                            this.field_w.field_C[this.field_D] = this.field_w.field_C[this.field_D] + 1;
                            this.field_w.field_T.field_s[this.field_D] = this.field_w.field_T.field_s[this.field_D] + 1;
                            var2_int = this.field_w.b((byte) 63, (aga) (this));
                            if (-1 == var2_int) {
                              break L13;
                            } else {
                              this.field_w.a(var2_int, (byte) 78);
                              this.field_y = 0;
                              break L13;
                            }
                          }
                          if (var3 == 0) {
                            break L6;
                          } else {
                            break L11;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L14: {
                    this.field_w.field_C[this.field_D] = this.field_w.field_C[this.field_D] + 1;
                    this.field_w.field_T.field_s[this.field_D] = this.field_w.field_T.field_s[this.field_D] + 1;
                    var2_int = this.field_w.b((byte) 116, (aga) (this));
                    if (var2_int != -1) {
                      this.field_w.a(var2_int, (byte) 121);
                      this.field_y = 0;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  if (var3 == 0) {
                    break L6;
                  } else {
                    break L9;
                  }
                }
                this.field_w.field_C[this.field_D] = this.field_w.field_C[this.field_D] + 1;
                this.field_w.field_T.field_s[this.field_D] = this.field_w.field_T.field_s[this.field_D] + 1;
                var2_int = this.field_w.b((byte) 51, (aga) (this));
                if (var2_int == -1) {
                  break L6;
                } else {
                  this.field_w.a(var2_int, (byte) 120);
                  this.field_y = 0;
                  break L6;
                }
              }
              L15: {
                if (!this.field_w.a(this.field_D, this.field_x, this.field_J, (byte) -41)) {
                  break L15;
                } else {
                  if (!this.g((byte) 85)) {
                    this.field_w.a(this.field_D, (byte) 65);
                    break L15;
                  } else {
                    break L15;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void j(int param0) {
        int var2_int = 0;
        aga var3 = null;
        int var4 = 0;
        aga stackIn_14_0 = null;
        Object stackIn_33_0 = null;
        int decompiledRegionSelector0 = 0;
        aga stackOut_13_0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 <= -98) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if ((this.field_w.field_o ^ -1) != -4) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (this.g((byte) 85)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.c(true);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (31 != this.field_y) {
                            statePc = 32;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2_int = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-8 >= (var2_int ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3 = this.field_w.field_S[this.field_D].field_b[var2_int];
                        stackOut_13_0 = (aga) (var3);
                        stackIn_33_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var4 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 != null) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var4 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (!var3.i(-106)) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var4 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var2_int == this.field_u) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var3.h(121, this.field_t);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var2_int++;
                        if (var4 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        this.field_I = 0;
                        this.field_w.field_a[this.field_x][this.field_J].field_l = null;
                        this.field_C = 0;
                        stackIn_33_0 = this;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        ((aga) (this)).field_y = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw pe.a((Throwable) ((Object) var2), "aga.BA(" + param0 + ')');
                }
                case 36: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        oha var6 = null;
        int var7 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 56 % ((param1 - 57) / 59);
                        var4 = 0;
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (this.field_m.length <= var5) {
                            statePc = 24;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var7 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (this.field_m[var5] == -1) {
                            statePc = 21;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = ur.field_e[this.field_o.field_g.field_b[this.field_m[var5]]];
                        if (var6.field_j != 3) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((this.field_K[var5] ^ -1) < (var6.field_g ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((param0 ^ -1) == (var4 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.field_K[var5] = -3 + var6.field_g;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var4++;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw pe.a((Throwable) ((Object) runtimeException), "aga.H(" + param0 + ',' + param1 + ')');
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.field_t = (int)it.field_c[this.field_k[0]];
              if ((this.field_I ^ -1) >= (this.field_t ^ -1)) {
                break L1;
              } else {
                this.field_I = this.field_t;
                break L1;
              }
            }
            L2: {
              if (param0 == -2) {
                break L2;
              } else {
                this.c((byte) 99, -101);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.R(" + param0 + ')');
        }
    }

    final void j(int param0, int param1) {
        oha var3 = ur.field_e[this.field_o.field_g.field_b[this.field_m[param0]]];
        if (param1 != 0) {
            return;
        }
        try {
            this.field_K[param0] = var3.field_g + 1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "aga.M(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0, byte param1) {
        RuntimeException runtimeException = null;
        oha var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_y ^ -1) != -43) {
              L1: {
                var3 = ur.field_e[param0];
                if (param1 <= -78) {
                  break L1;
                } else {
                  this.j(-35, -54);
                  break L1;
                }
              }
              L2: {
                L3: {
                  var4 = this.b(param0, (byte) -113);
                  if (!var3.a(-125)) {
                    break L3;
                  } else {
                    this.field_K[var4] = 2 + var3.field_g;
                    if (BachelorFridge.field_y == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.field_K[var4] = 0;
                break L2;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) runtimeException), "aga.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(rha param0, byte param1) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        oha var6 = null;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param0.a(this.field_u + ": " + this.field_o.field_f, 4819);
                        param0.a(109, 2);
                        param0.a("x: " + this.field_x + " y: " + this.field_J, 4819);
                        param0.a("hp: " + this.field_I + "/" + this.field_t, 4819);
                        var3_int = 99 % ((-30 - param1) / 56);
                        if (this.field_F != 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param0.a("splitid: " + this.field_F, 4819);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.field_y != 0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param0.a("status: " + pna.field_zb[this.field_y].field_d + " (" + this.field_C + " turns)", 4819);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (37 != this.field_y) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param0.a("friendly: " + this.field_E, 4819);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((this.field_H ^ -1) != -1) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        param0.a("shield: " + this.field_H, 4819);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var4 >= 5) {
                            statePc = 32;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5 = this.field_m[var4];
                        if (var8 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (-1 != var5) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var8 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var6 = al.a(-80, this.field_o.field_g.field_b[var5]);
                        var7 = this.field_K[var4];
                        if (var7 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param0.a("move " + var4 + ": " + var6.field_f, 4819);
                        if (var8 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        param0.a("move " + var4 + ": " + var6.field_f + " (cooldown " + var7 + ")", 4819);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var4++;
                        if (var8 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        param0.a("Creature checksum: " + Integer.toString(this.g(96), 16), 4819);
                        param0.a(115, -2);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_37_0 = (RuntimeException) (var3);
                    stackIn_35_0 = stackIn_37_0;
                    stackIn_37_1 = new StringBuilder().append("aga.N(");
                    stackIn_35_1 = stackIn_37_1;
                    if (param0 == null) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_35_1);
                    stackIn_38_2 = "{...}";
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_38_2 = "null";
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    throw pe.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param1 + ')');
                }
                case 39: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean i(int param0, int param1) {
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if ((this.field_x ^ -1) >= -1) {
                break L1;
              } else {
                if ((this.field_w.field_a[-1 + this.field_x][this.field_J].field_n ^ -1) == (param0 ^ -1)) {
                  stackIn_25_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if ((this.field_x ^ -1) <= (this.field_w.field_z + -1 ^ -1)) {
                break L2;
              } else {
                if (this.field_w.field_a[1 + this.field_x][this.field_J].field_n != param0) {
                  break L2;
                } else {
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              if (-1 <= (this.field_J ^ -1)) {
                break L3;
              } else {
                if (param0 != this.field_w.field_a[this.field_x][-1 + this.field_J].field_n) {
                  break L3;
                } else {
                  stackIn_17_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            L4: {
              if ((this.field_w.field_B - 1 ^ -1) >= (this.field_J ^ -1)) {
                break L4;
              } else {
                if ((param0 ^ -1) != (this.field_w.field_a[this.field_x][1 + this.field_J].field_n ^ -1)) {
                  break L4;
                } else {
                  stackIn_23_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
            var3_int = 36 % ((param1 - 83) / 33);
            stackIn_27_0 = 0;
            decompiledRegionSelector0 = 4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.T(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0 != 0;
              } else {
                return stackIn_27_0 != 0;
              }
            }
          }
        }
    }

    final String b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String stackIn_7_0 = null;
        String stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = -91 % ((-21 - param0) / 54);
                if (0 > this.field_D) {
                  break L2;
                } else {
                  if (this.field_w.field_y.length <= this.field_D) {
                    break L2;
                  } else {
                    stackIn_7_0 = this.field_w.field_y[this.field_D];
                    break L1;
                  }
                }
              }
              stackIn_7_0 = Integer.toString(this.field_D);
              break L1;
            }
            var3 = stackIn_7_0;
            stackIn_8_0 = "owner: " + var3 + " pos: " + this.field_u + " type: " + this.field_o.field_f;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.O(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    private final void h(int param0, int param1) {
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_I = this.field_I + param1;
              if (this.field_I > this.field_t) {
                param1 = param1 + (-this.field_I + this.field_t);
                this.field_I = this.field_t;
                break L1;
              } else {
                break L1;
              }
            }
            this.field_w.field_T.field_F[this.field_D] = this.field_w.field_T.field_F[this.field_D] + param1;
            var3_int = -86 % ((param0 - 38) / 58);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.DA(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean g(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          L0: {
            if (-34 == (this.field_y ^ -1)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (-4 != (this.field_y ^ -1)) {
                  break L1;
                } else {
                  param1 = param1 >> 1;
                  break L1;
                }
              }
              var3_int = -36 / ((param0 - -23) / 44);
              if ((this.field_H ^ -1) < -1) {
                L2: {
                  this.field_H = this.field_H - param1;
                  if (this.field_H <= 0) {
                    this.b((byte) 125, 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackIn_15_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  if (37 != this.field_y) {
                    break L3;
                  } else {
                    if ((param1 ^ -1) == -1) {
                      break L3;
                    } else {
                      this.b((byte) 116, 0);
                      break L3;
                    }
                  }
                }
                if ((param1 ^ -1) > -1) {
                  this.h(-24, -param1);
                  stackIn_26_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      if (29 == this.field_y) {
                        break L5;
                      } else {
                        if ((this.field_y ^ -1) == -45) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.b((byte) 115, 0);
                    break L4;
                  }
                  this.field_I = this.field_I - param1;
                  this.field_w.field_T.field_b[this.field_D] = this.field_w.field_T.field_b[this.field_D] + param1;
                  if (this.field_I > 0) {
                    stackIn_38_0 = 0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    this.j(-122);
                    stackIn_36_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.L(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_26_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_36_0 != 0;
              } else {
                return stackIn_38_0 != 0;
              }
            }
          }
        }
    }

    final void a(wia param0, int param1) {
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_126_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (this.a(32, (byte) -66)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param0.field_n;
                if (!od.field_w[this.field_w.field_a[this.field_x][this.field_J].field_n].field_b) {
                  break L1;
                } else {
                  if (!this.field_w.field_a[this.field_x][this.field_J].field_m) {
                    break L1;
                  } else {
                    if (this.g((byte) 85)) {
                      break L1;
                    } else {
                      if (33 == this.field_y) {
                        break L1;
                      } else {
                        L2: {
                          L3: {
                            if ((var3_int ^ -1) == -12) {
                              break L3;
                            } else {
                              L4: {
                                if (var3_int != 10) {
                                  break L4;
                                } else {
                                  this.b((byte) 126, 18);
                                  this.field_w.field_T.field_e[this.field_D] = this.field_w.field_T.field_e[this.field_D] + 1;
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L5: {
                                if (-8 != (var3_int ^ -1)) {
                                  break L5;
                                } else {
                                  this.b((byte) 111, 4);
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L6: {
                                if ((var3_int ^ -1) != -7) {
                                  break L6;
                                } else {
                                  this.b((byte) 120, 16);
                                  this.field_w.field_T.field_e[this.field_D] = this.field_w.field_T.field_e[this.field_D] + 1;
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              L7: {
                                L8: {
                                  if (9 != var3_int) {
                                    break L8;
                                  } else {
                                    if (28 != this.field_y) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                L9: {
                                  if ((var3_int ^ -1) != -9) {
                                    break L9;
                                  } else {
                                    this.b((byte) 126, 17);
                                    this.field_w.field_T.field_e[this.field_D] = this.field_w.field_T.field_e[this.field_D] + 1;
                                    if (var5 == 0) {
                                      break L2;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L10: {
                                  if (-14 == (var3_int ^ -1)) {
                                    break L10;
                                  } else {
                                    L11: {
                                      if (var3_int == 12) {
                                        break L11;
                                      } else {
                                        if (29 == var3_int) {
                                          this.b((byte) 126, 12);
                                          if (var5 == 0) {
                                            break L2;
                                          } else {
                                            break L11;
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                    this.b((byte) 113, 19);
                                    this.field_w.field_T.field_e[this.field_D] = this.field_w.field_T.field_e[this.field_D] + 1;
                                    if (var5 == 0) {
                                      break L2;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                this.b((byte) 116, 7);
                                if (var5 == 0) {
                                  break L2;
                                } else {
                                  break L7;
                                }
                              }
                              this.b((byte) 127, 5);
                              if (var5 == 0) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          this.b((byte) 110, 6);
                          break L2;
                        }
                        L12: {
                          if (this.field_w.a(this.field_J, (byte) 120, this.field_x)) {
                            break L12;
                          } else {
                            if (29 == var3_int) {
                              break L12;
                            } else {
                              this.field_w.field_a[this.field_x][this.field_J].field_m = false;
                              break L12;
                            }
                          }
                        }
                        L13: {
                          L14: {
                            if (this.field_w.a(this.field_J, (byte) 117, this.field_x)) {
                              break L14;
                            } else {
                              this.field_w.field_a[this.field_x][this.field_J].field_j = 5;
                              if (var5 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          this.field_w.field_a[this.field_x][this.field_J].field_j = -1;
                          break L13;
                        }
                        this.d(-127);
                        break L1;
                      }
                    }
                  }
                }
              }
              L15: {
                L16: {
                  if (21 != var3_int) {
                    break L16;
                  } else {
                    this.j(-114);
                    this.field_A = false;
                    if (var5 == 0) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                if (-39 == (var3_int ^ -1)) {
                  L17: {
                    L18: {
                      if (0 != param0.field_j) {
                        break L18;
                      } else {
                        this.h(-23, 30);
                        if (var5 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    this.g(-67, 75);
                    break L17;
                  }
                  this.field_w.b((byte) 47, 0, this.field_x, this.field_J);
                  break L15;
                } else {
                  break L15;
                }
              }
              L19: {
                if (param1 < -20) {
                  break L19;
                } else {
                  this.field_v = -90;
                  break L19;
                }
              }
              L20: {
                if (this.field_w.field_o != 3) {
                  break L20;
                } else {
                  var4 = this.field_w.a(1845, this.field_J, this.field_x);
                  if (-1 != var4) {
                    L21: {
                      if ((this.field_D ^ -1) != (var4 ^ -1)) {
                        break L21;
                      } else {
                        this.field_w.a(this.field_D, (byte) 46);
                        this.field_w.field_a[this.field_x][this.field_J].field_m = false;
                        if (var5 == 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    if (!this.g((byte) 85)) {
                      this.b((byte) 111, var4 + 24);
                      this.field_w.field_a[this.field_x][this.field_J].field_m = false;
                      this.field_w.field_T.field_G[var4] = true;
                      break L20;
                    } else {
                      break L20;
                    }
                  } else {
                    break L20;
                  }
                }
              }
              L22: {
                if (this.field_w.field_o != 3) {
                  break L22;
                } else {
                  if (!this.g((byte) 85)) {
                    break L22;
                  } else {
                    var4 = this.field_w.b((byte) 65, (aga) (this));
                    this.field_w.field_c[var4] = new int[]{this.field_x, this.field_J};
                    break L22;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var3 = decompiledCaughtException;
            stackIn_125_0 = (RuntimeException) (var3);

            stackIn_125_1 = new StringBuilder().append("aga.D(");

            if (param0 == null) {
              stackIn_126_0 = (RuntimeException) ((Object) stackIn_125_0);
              stackIn_126_1 = (StringBuilder) ((Object) stackIn_125_1);
              stackIn_126_2 = "null";
              break L23;
            } else {
              stackIn_126_0 = (RuntimeException) ((Object) stackIn_125_0);
              stackIn_126_1 = (StringBuilder) ((Object) stackIn_125_1);
              stackIn_126_2 = "{...}";
              break L23;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_126_0), stackIn_126_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int c(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        oha var4 = null;
        int var5 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 > 110) {
                break L1;
              } else {
                this.a((byte) -104, (lu) null);
                break L1;
              }
            }
            var2_int = 0;
            var3 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if ((var3 ^ -1) <= (this.field_m.length ^ -1)) {
                    break L4;
                  } else {
                    stackIn_15_0 = this.field_m[var3] ^ -1;

                    if (var5 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_15_0 == 0) {
                          break L5;
                        } else {
                          var4 = ur.field_e[this.field_o.field_g.field_b[this.field_m[var3]]];
                          if (3 == var4.field_j) {
                            break L5;
                          } else {
                            var2_int++;
                            break L5;
                          }
                        }
                      }
                      var3++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_15_0 = var2_int;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.W(" + param0 + ')');
        }
        return stackIn_15_0;
    }

    final void a(wia param0, lc param1, eaa param2, byte param3) {
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_127_2 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        String stackIn_131_2 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        String stackIn_135_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        rv var6 = null;
        int var7_int = 0;
        int[] var7 = null;
        oha var8 = null;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = param0.field_n;
                        var6 = new rv();
                        if (-1 == (this.field_y ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (35 == this.field_y) {
                            statePc = 20;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.field_y != 31) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (0 < this.field_C) {
                            statePc = 20;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (this.g((byte) 85)) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-1 <= (this.field_H ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var6.a(true, new ks(new nq((aga) (this))));
                        this.field_y = 0;
                        this.d(114);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (-43 != (this.field_y ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!this.field_G) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var6.a(true, new ks(new nq((aga) (this))));
                        this.field_y = 0;
                        this.d(param3 ^ -15);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param3 == 121) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return;
                }
                case 28: {
                    try {
                        var7_int = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((this.field_K.length ^ -1) >= (var7_int ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_46_0 = 0;
                        stackIn_31_0 = stackIn_46_0;
                        stackIn_46_1 = this.field_m[var7_int] ^ -1;
                        stackIn_31_1 = stackIn_46_1;
                        if (var9 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 != stackIn_31_1) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var9 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var8 = ur.field_e[this.field_o.field_g.field_b[this.field_m[var7_int]]];
                        if (this.field_K[var7_int] != var8.field_g) {
                            statePc = 44;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var8.field_g != 0) {
                            statePc = 43;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        this.j(var7_int, 0);
                        var6.a(true, new kt(new nq(this.field_D, this.field_u), var7_int));
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var7_int++;
                        if (var9 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = 1;
                        stackIn_46_1 = this.field_y;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (stackIn_46_0 != stackIn_46_1) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var6.a(true, new qq(new nq(this.field_D, this.field_u), -1, 5));
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (this.field_y == 12) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var6.a(true, new qq(new nq(this.field_D, this.field_u), -1, 20));
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (-15 != (this.field_y ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var7_int = -this.field_I + this.field_t;
                        if (-6 > (var7_int ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var7_int = 5;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var7_int <= 0) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var6.a(true, new qq(new nq(this.field_D, this.field_u), -1, -var7_int));
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (44 == this.field_y) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var6.a(true, new qq(new nq(this.field_D, this.field_u), -1, -20));
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (this.field_y == 53) {
                            statePc = 68;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var6.a(true, new qq(new nq(this.field_D, this.field_u), -1, 10));
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if ((this.field_y ^ -1) == -33) {
                            statePc = 96;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if ((var5_int ^ -1) != -30) {
                            statePc = 75;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var6.a(true, new lia(new nq(this.field_D, this.field_u), 0, 12));
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var5_int != 14) {
                            statePc = 84;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var7_int = -this.field_I + this.field_t;
                        if (var7_int > 5) {
                            statePc = 79;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var7_int = 5;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var7_int > 0) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var6.a(true, new lia(new nq(this.field_D, this.field_u), -var7_int, -1));
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (21 == var5_int) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var6.a(true, new lia(new nq(this.field_D, this.field_u), this.field_I, -1));
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (15 == var5_int) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var6.a(true, new lia(new nq(this.field_D, this.field_u), 5, -1));
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if ((var5_int ^ -1) == -17) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var6.a(true, new lia(new nq(this.field_D, this.field_u), 0, kla.a(14, this.field_p, param3 + 2147483527) + 1));
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var7 = this.e(36, 73);
                        if (null == var7) {
                            statePc = 99;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var6.a(true, new lia(new nq(this.field_D, this.field_u), -30, -1));
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var5_int != 36) {
                            statePc = 102;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var6.a(true, new lia(new nq(this.field_D, this.field_u), -30, -1));
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (this.field_w.field_R) {
                            statePc = 105;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (-1 == (this.field_x ^ -1)) {
                            statePc = 117;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (0 == this.field_J) {
                            statePc = 117;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if ((this.field_w.field_z - 1 ^ -1) == (this.field_x ^ -1)) {
                            statePc = 117;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (this.field_w.field_B + -1 == this.field_J) {
                            statePc = 117;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        param1.a(new ns(new nq((aga) (this))), (byte) 75);
                        this.field_w.field_R = false;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (var6.field_m.g(0) <= 0) {
                            statePc = 121;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        param2.a(var6, true);
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var6.a(this.field_w, false);
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 123: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_126_0 = (RuntimeException) (var5);
                    stackIn_124_0 = stackIn_126_0;
                    stackIn_126_1 = new StringBuilder().append("aga.CA(");
                    stackIn_124_1 = stackIn_126_1;
                    if (param0 == null) {
                        statePc = 126;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    stackIn_127_0 = (RuntimeException) ((Object) stackIn_124_0);
                    stackIn_127_1 = (StringBuilder) ((Object) stackIn_124_1);
                    stackIn_127_2 = "{...}";
                    statePc = 127;
                    continue stateLoop;
                }
                case 126: {
                    stackIn_127_0 = (RuntimeException) ((Object) stackIn_126_0);
                    stackIn_127_1 = (StringBuilder) ((Object) stackIn_126_1);
                    stackIn_127_2 = "null";
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    stackIn_130_0 = (RuntimeException) ((Object) stackIn_127_0);
                    stackIn_128_0 = stackIn_130_0;
                    stackIn_130_1 = ((StringBuilder) (Object) stackIn_127_1).append(stackIn_127_2).append(',');
                    stackIn_128_1 = stackIn_130_1;
                    if (param1 == null) {
                        statePc = 130;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackIn_131_0 = (RuntimeException) ((Object) stackIn_128_0);
                    stackIn_131_1 = (StringBuilder) ((Object) stackIn_128_1);
                    stackIn_131_2 = "{...}";
                    statePc = 131;
                    continue stateLoop;
                }
                case 130: {
                    stackIn_131_0 = (RuntimeException) ((Object) stackIn_130_0);
                    stackIn_131_1 = (StringBuilder) ((Object) stackIn_130_1);
                    stackIn_131_2 = "null";
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    stackIn_134_0 = (RuntimeException) ((Object) stackIn_131_0);
                    stackIn_132_0 = stackIn_134_0;
                    stackIn_134_1 = ((StringBuilder) (Object) stackIn_131_1).append(stackIn_131_2).append(',');
                    stackIn_132_1 = stackIn_134_1;
                    if (param2 == null) {
                        statePc = 134;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    stackIn_135_0 = (RuntimeException) ((Object) stackIn_132_0);
                    stackIn_135_1 = (StringBuilder) ((Object) stackIn_132_1);
                    stackIn_135_2 = "{...}";
                    statePc = 135;
                    continue stateLoop;
                }
                case 134: {
                    stackIn_135_0 = (RuntimeException) ((Object) stackIn_134_0);
                    stackIn_135_1 = (StringBuilder) ((Object) stackIn_134_1);
                    stackIn_135_2 = "null";
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    throw pe.a((Throwable) ((Object) stackIn_135_0), stackIn_135_2 + ',' + param3 + ')');
                }
                case 136: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, aga param1, byte param2) {
        int stackIn_2_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            if (param2 == 2) {
              L1: {
                if (null == param1) {
                  break L1;
                } else {
                  if ((param1.field_D ^ -1) == (this.field_D ^ -1)) {
                    break L1;
                  } else {
                    if (0 <= param0) {
                      this.field_w.field_T.field_f[param1.field_D] = this.field_w.field_T.field_f[param1.field_D] + param0;
                      this.field_w.field_T.field_n[param1.field_D] = this.field_w.field_T.field_n[param1.field_D] + param0;
                      this.field_w.field_T.field_b[this.field_D] = this.field_w.field_T.field_b[this.field_D] + param0;
                      this.field_w.field_T.field_g[this.field_D] = this.field_w.field_T.field_g[this.field_D] + 1;
                      this.field_w.field_T.field_y[param1.field_D] = this.field_w.field_T.field_y[param1.field_D] + 1;
                      this.field_w.field_T.field_E[param1.field_D] = this.field_w.field_T.field_E[param1.field_D] + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param1 == null) {
                  break L2;
                } else {
                  if (0 <= param0) {
                    break L2;
                  } else {
                    this.field_w.field_T.field_F[param1.field_D] = this.field_w.field_T.field_F[param1.field_D] - param0;
                    if ((param1.field_D ^ -1) == (this.field_D ^ -1)) {
                      break L2;
                    } else {
                      this.field_w.field_T.field_j[this.field_D] = true;
                      break L2;
                    }
                  }
                }
              }
              if (!this.g(param2 + 72, param0)) {
                stackIn_37_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L3: {
                  if (param1 == null) {
                    break L3;
                  } else {
                    this.field_w.field_T.field_w[param1.field_D] = this.field_w.field_T.field_w[param1.field_D] + 1;
                    if (20 != param1.field_o.field_b) {
                      break L3;
                    } else {
                      if (-4 != (this.field_o.field_b ^ -1)) {
                        break L3;
                      } else {
                        this.field_w.field_T.field_x[param1.field_D] = true;
                        break L3;
                      }
                    }
                  }
                }
                stackIn_35_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var4);

            stackIn_41_1 = new StringBuilder().append("aga.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L4;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_35_0 != 0;
          } else {
            return stackIn_37_0 != 0;
          }
        }
    }

    final void f(int param0) {
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[][] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            this.field_w.field_a[this.field_x][this.field_J].field_l = (aga) (this);
            if (!this.a(param0, (byte) 126)) {
              this.a(this.field_w.field_a[this.field_x][this.field_J], -83);
              var2 = this.field_w.field_i;
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var2.length ^ -1) >= (var3 ^ -1)) {
                      break L3;
                    } else {
                      var4 = var2[var3];
                      stackIn_21_0 = this.field_x ^ -1;

                      stackIn_21_1 = var4[0] ^ -1;

                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_21_0 != stackIn_21_1) {
                            break L4;
                          } else {
                            if (this.field_J == var4[1]) {
                              L5: {
                                if ((var4[2] ^ -1) != (this.field_D ^ -1)) {
                                  this.field_w.field_T.field_A[this.field_D] = this.field_w.field_T.field_A[this.field_D] + 1;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              var4[2] = this.field_D;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackIn_21_0 = -4;
                  stackIn_21_1 = this.field_w.field_o ^ -1;
                  break L2;
                }
                L6: {
                  if (stackIn_21_0 != stackIn_21_1) {
                    break L6;
                  } else {
                    this.e(77);
                    break L6;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "aga.FA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = -40 % ((-5 - param1) / 58);
              if ((this.field_y ^ -1) != (param0 ^ -1)) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.NA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final boolean g(byte param0) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 85) {
                break L1;
              } else {
                this.c((byte) -17, 73);
                break L1;
              }
            }
            L2: {
              if ((this.field_y ^ -1) > -25) {
                break L2;
              } else {
                if (27 < this.field_y) {
                  break L2;
                } else {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_10_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.PA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final int f(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_k[1] > 0) {
              if (param0 > 117) {
                stackIn_7_0 = this.field_k[1] + 2;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 35;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 2;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.MA(" + param0 + ')');
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

    final static void a(Random param0, boolean param1, eaa param2, int param3) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        rea var4 = null;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = (rea) ((Object) param2.b((byte) 90));
                        if (param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (var4 == null) {
                            statePc = 24;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        fieldTemp$1 = var4.field_n + var4.field_h;
                        var4.field_n = var4.field_n + var4.field_h;
                        if (0 <= fieldTemp$1) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4.a(false);
                        if (var5 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4.field_l = var4.field_l + var4.field_o;
                        kla.a(50, param0, -2147483648);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4 = (rea) ((Object) param2.c(0));
                        if (var5 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (runtimeException);
                    stackIn_16_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("aga.EA(");
                    stackIn_16_1 = stackIn_18_1;
                    if (param0 == null) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_0 = stackIn_22_0;
                    stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');
                    stackIn_20_1 = stackIn_22_1;
                    if (param2 == null) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    throw pe.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean k(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if (28 != this.field_y) {
                break L1;
              } else {
                if (5 == param1) {
                  stackIn_7_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if ((this.field_y ^ -1) != -32) {
              if (!this.g((byte) 85)) {
                L2: {
                  if (param1 != 42) {
                    break L2;
                  } else {
                    this.field_G = false;
                    break L2;
                  }
                }
                if (param0 == -2049) {
                  L3: {
                    this.field_y = param1;
                    this.field_C = 1 + is.field_b[this.field_y];
                    if (16 == param1) {
                      L4: {
                        var3_double = 100.0 * ((double)this.field_I / it.field_c[this.field_k[0]]);
                        var5 = this.field_k[0] + 1;
                        if (-6 <= (var5 ^ -1)) {
                          break L4;
                        } else {
                          var5 = 5;
                          break L4;
                        }
                      }
                      this.field_I = (int)(var3_double * it.field_c[var5] / 100.0);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  stackIn_27_0 = 1;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_27_0 != 0;
              }
            }
          }
        }
    }

    private final int[] e(int param0, int param1) {
        int[] stackIn_11_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_25_0 = null;
        int[] stackIn_27_0 = null;
        Object stackIn_32_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (0 >= this.field_x) {
                break L1;
              } else {
                if ((param0 ^ -1) == (this.field_w.field_a[-1 + this.field_x][this.field_J].field_n ^ -1)) {
                  stackIn_27_0 = new int[]{this.field_x + -1, this.field_J};
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_x >= -1 + this.field_w.field_z) {
                break L2;
              } else {
                if (param0 != this.field_w.field_a[1 + this.field_x][this.field_J].field_n) {
                  break L2;
                } else {
                  stackIn_11_0 = new int[]{1 + this.field_x, this.field_J};
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              if (-1 <= (this.field_J ^ -1)) {
                break L3;
              } else {
                if (this.field_w.field_a[this.field_x][-1 + this.field_J].field_n != param0) {
                  break L3;
                } else {
                  stackIn_17_0 = new int[]{this.field_x, this.field_J + -1};
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            L4: {
              if (-1 + this.field_w.field_B <= this.field_J) {
                break L4;
              } else {
                if ((this.field_w.field_a[this.field_x][this.field_J + 1].field_n ^ -1) == (param0 ^ -1)) {
                  stackIn_25_0 = new int[]{this.field_x, this.field_J - -1};
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param1 >= 69) {
                break L5;
              } else {
                this.field_K = (int[]) null;
                break L5;
              }
            }
            stackIn_32_0 = null;
            decompiledRegionSelector0 = 4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.G(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0;
              } else {
                return (int[]) ((Object) stackIn_32_0);
              }
            }
          }
        }
    }

    final boolean a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_15_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1) {
              L1: {
                if (this.field_w.field_o != 3) {
                  break L1;
                } else {
                  if ((this.field_D ^ -1) != (this.field_w.b(false, param0) ^ -1)) {
                    break L1;
                  } else {
                    stackIn_8_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              if (32 == this.field_y) {
                stackIn_13_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_15_0 = ju.c(23745, param0);
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    aga(rk param0, op param1, int param2, int param3) {
        super(param0);
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        this.field_A = true;
        try {
          L0: {
            this.field_w = param1;
            this.field_D = param2;
            this.field_F = 0;
            this.field_u = param3;
            this.field_t = (int)it.field_c[this.field_k[0]];
            this.field_I = this.field_t;
            this.field_s = 4;
            this.field_K = new int[this.field_m.length];
            var5_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5_int >= this.field_K.length) {
                    break L3;
                  } else {
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (0 == (this.field_m[var5_int] ^ -1)) {
                          break L4;
                        } else {
                          this.field_K[var5_int] = 0;
                          break L4;
                        }
                      }
                      var5_int++;
                      if (var6 == 0) {
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
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("aga.<init>(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final aga b(boolean param0) {
        aga var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        aga stackIn_12_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new aga((rk) (this), this.field_w, this.field_D, this.field_u);
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 >= 4) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_k[var3] = this.field_k[var3] >> 1;
                        var2.field_k[var3] = var2.field_k[var3] - this.field_k[var3];
                        var3++;
                        if (var4 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_t = this.field_t >> 1;
                        var2.field_t = var2.field_t - this.field_t;
                        this.field_I = this.field_I >> 1;
                        var2.field_x = this.field_x;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.b((byte) -95, 67);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2.field_J = this.field_J;
                        this.field_F = 5 + this.field_u + 17 * this.field_D;
                        var2.field_F = 5 + this.field_u + 17 * this.field_D;
                        var2.field_I = this.field_I;
                        stackIn_12_0 = (aga) (var2);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw pe.a((Throwable) ((Object) var2_ref), "aga.KA(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = this.field_w.b((byte) 122, (aga) (this));
              if (this.g((byte) 85)) {
                this.field_y = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_w.field_c[var2_int] = new int[]{this.field_x, this.field_J};
              if ((this.field_w.field_a[this.field_x][this.field_J].field_n ^ -1) != -22) {
                break L2;
              } else {
                this.field_w.a(var2_int, (byte) 115);
                break L2;
              }
            }
            L3: {
              if (param0) {
                break L3;
              } else {
                this.field_H = 56;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) runtimeException), "aga.J(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                this.field_y = 87;
                break L1;
              }
            }
            this.field_w.field_T.field_i[this.field_D] = this.field_w.field_T.field_i[this.field_D] + 1;
            this.field_x = param1;
            this.field_J = param0;
            this.f(32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var4), "aga.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = 79 / ((param1 - -47) / 57);
            var4 = 0;
            L1: while (true) {
              L2: {
                if ((this.field_m.length ^ -1) >= (var4 ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (this.field_m[var4] == -1) {
                      break L3;
                    } else {
                      if ((param0 ^ -1) != (this.field_o.field_g.field_b[this.field_m[var4]] ^ -1)) {
                        break L3;
                      } else {
                        stackIn_8_0 = var4;
                        break L0;
                      }
                    }
                  }
                  var4++;
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.LA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final void a(boolean param0, int param1, int param2) {
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = this.field_x;
                        var5 = this.field_J;
                        if (param2 != 2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4_int = var4_int - param1;
                        if (var7 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param2 != 4) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4_int = var4_int + param1;
                        if (var7 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-2 == (param2 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-4 != (param2 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5 = var5 + param1;
                        if (var7 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = var5 - param1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!param0) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_H = 110;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (this.field_y != 43) {
                            statePc = 46;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var6 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param1 <= var6) {
                            statePc = 46;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_47_0 = param2;
                        stackIn_22_0 = stackIn_47_0;
                        stackIn_47_1 = 2;
                        stackIn_22_1 = stackIn_47_1;
                        if (var7 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 != stackIn_22_1) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.field_w.b((byte) -49, 29, -var6 + this.field_x, this.field_J);
                        if (var7 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-5 == (param2 ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (-2 == (param2 ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((param2 ^ -1) == -4) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        this.field_w.b((byte) -54, 29, this.field_x, var6 + this.field_J);
                        if (var7 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.field_w.b((byte) -80, 29, this.field_x, -var6 + this.field_J);
                        if (var7 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        this.field_w.b((byte) 50, 29, this.field_x + var6, this.field_J);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var6++;
                        if (var7 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = -41;
                        stackIn_47_1 = this.field_y ^ -1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 == stackIn_47_1) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.field_y = 0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        this.a(var4_int, var5, (byte) 17);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw pe.a((Throwable) ((Object) var4), "aga.F(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                case 53: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(boolean param0, int param1) {
        oha var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                var3 = ur.field_e[param1];
                var4 = this.b(param1, (byte) 30);
                if ((var3.field_g - -2 ^ -1) != (this.field_K[var4] ^ -1)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3_ref), "aga.Q(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final void a(byte param0, lu param1) {
        lu stackIn_12_0 = null;
        lu stackIn_14_0 = null;
        lu stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        super.a((byte) -74, param1);
                        param1.b(this.field_I, -126);
                        param1.b(this.field_t, -119);
                        param1.d(this.field_D, 0);
                        param1.d(this.field_u, 0);
                        param1.d(this.field_F, 0);
                        param1.d(this.field_x, 0);
                        param1.d(this.field_J, 0);
                        param1.d(this.field_s, 0);
                        param1.d(this.field_y, 0);
                        param1.d(this.field_C, 0);
                        param1.d(this.field_E, 0);
                        if (param0 < -21) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_A = true;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (5 <= var3_int) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param1.d(this.field_K[var3_int], 0);
                        var3_int++;
                        if (var4 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param1.d(this.field_H, 0);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_14_0 = (lu) (param1);
                        stackIn_12_0 = stackIn_14_0;
                        if (!this.field_A) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_15_0 = (lu) ((Object) stackIn_12_0);
                        stackIn_15_1 = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = (lu) ((Object) stackIn_14_0);
                        stackIn_15_1 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((lu) (Object) stackIn_15_0).d(stackIn_15_1, 0);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (var3);
                    stackIn_18_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("aga.AA(").append(param0).append(',');
                    stackIn_18_1 = stackIn_20_1;
                    if (param1 == null) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw pe.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(int param0) {
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        bl.a(this.field_o.field_l, 0, this.field_k, 0, this.field_k.length);
                        if (this.a(84, 0, this.field_m)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_k[0] = this.field_k[0] + 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!this.a(85, 0, this.field_m)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_k[1] = this.field_k[1] + 1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!this.a(86, 0, this.field_m)) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_k[2] = this.field_k[2] + 1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!this.a(87, 0, this.field_m)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_k[3] = this.field_k[3] + 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (this.field_y == 7) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_k[3] = this.field_k[3] - 1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (6 == this.field_y) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.field_k[2] = this.field_k[2] - 1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((this.field_y ^ -1) != -6) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_k[1] = this.field_k[1] - 1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (this.field_y == 4) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.field_k[0] = this.field_k[0] - 1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (this.field_y == 18) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        this.field_k[2] = this.field_k[2] + 1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (16 != this.field_y) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.field_k[0] = this.field_k[0] + 1;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (-18 == (this.field_y ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        this.field_k[1] = this.field_k[1] + 1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (this.field_y != 19) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        this.field_k[3] = this.field_k[3] + 1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (this.field_y != 28) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        this.field_k[1] = 5;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((this.field_y ^ -1) != -36) {
                            statePc = 53;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var2_int = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var2_int >= this.field_k.length) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.field_k[var2_int] = 0;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var3 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var2_int = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (4 <= var2_int) {
                            statePc = 68;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackIn_69_0 = this.field_k[var2_int] ^ -1;
                        stackIn_56_0 = stackIn_69_0;
                        stackIn_69_1 = -1;
                        stackIn_56_1 = stackIn_69_1;
                        if (var3 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_58_0 = stackIn_56_0;
                        stackIn_58_1 = stackIn_56_1;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0 <= stackIn_58_1) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        this.field_k[var2_int] = 0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (-6 > (this.field_k[var2_int] ^ -1)) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        this.field_k[var2_int] = 5;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var2_int++;
                        if (var3 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        this.h(-2);
                        stackIn_69_0 = 75;
                        stackIn_69_1 = (param0 - -49) / 38;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var2_int = stackIn_69_0 % stackIn_69_1;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 71: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw pe.a((Throwable) ((Object) var2), "aga.B(" + param0 + ')');
                }
                case 72: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean i(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 33 / ((param0 - -7) / 62);
              if (-1 > (this.field_I ^ -1)) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.S(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    private final void a(int param0, int param1, byte param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              this.field_w.field_a[this.field_x][this.field_J].field_l = null;
              if (param2 == 17) {
                break L1;
              } else {
                this.field_K = (int[]) null;
                break L1;
              }
            }
            this.field_w.field_T.field_i[this.field_D] = this.field_w.field_T.field_i[this.field_D] + (Math.abs(-param0 + this.field_x) - -Math.abs(this.field_J - param1));
            this.field_x = param0;
            this.field_J = param1;
            this.f(32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var4), "aga.IA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(byte param0, int param1) {
        int var3_int = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param0 >= 109) {
              var3_int = this.field_y;
              if (this.k(-2049, param1)) {
                L1: {
                  if (-33 != (var3_int ^ -1)) {
                    break L1;
                  } else {
                    if (32 == this.field_y) {
                      break L1;
                    } else {
                      this.f(32);
                      break L1;
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.HA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final int g(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_31_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = this.field_o.field_b * 74741;
                        var2_int = var2_int ^ 37 * (5753 * this.field_x - -this.field_J);
                        var2_int = var2_int << 1212477925 | var2_int >>> -2016712933;
                        var2_int = var2_int ^ this.field_I * 912487 - -(57123 * this.field_t);
                        var2_int = var2_int << 1978912847 | var2_int >>> -364927151;
                        var2_int = var2_int ^ this.field_D * 8676 + 78767 * this.field_u;
                        if (param0 >= 86) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_v = 3;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!this.i(-100)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = var2_int;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        var2_int = var2_int << -645984351 | var2_int >>> 466826367;
                        if ((this.field_F ^ -1) == -1) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int = var2_int ^ this.field_F * 7;
                        var2_int = var2_int >>> 1941728148 | var2_int << 1307651948;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((this.field_y ^ -1) != -1) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2_int = var2_int ^ (this.field_C + 575 * this.field_y) * 91911;
                        var2_int = var2_int << 146141592 | var2_int >>> 125531400;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (this.field_y == 37) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var2_int = var2_int ^ 74821 * this.field_E;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (0 == this.field_H) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var2_int = var2_int ^ 54857 * this.field_H;
                        var2_int = var2_int << 577853363 | var2_int >>> -1055839635;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var3 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((var3 ^ -1) <= -6) {
                            statePc = 30;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4 = this.field_m[var3];
                        stackIn_31_0 = var4;
                        stackIn_22_0 = stackIn_31_0;
                        if (var5 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 != -1) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var5 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var2_int = var2_int ^ 753 * (var4 + var3 * 1921);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var3++;
                        if (var5 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = var2_int;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return stackIn_31_0;
                }
                case 32: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw pe.a((Throwable) ((Object) var2), "aga.P(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
