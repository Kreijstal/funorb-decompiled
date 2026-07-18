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
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -10) {
                break L1;
              } else {
                ((aga) this).field_K = null;
                break L1;
              }
            }
            var3 = ur.field_e[param1];
            if (((aga) this).field_y != 44) {
              if (((aga) this).field_y != 29) {
                L2: {
                  if (35 != ((aga) this).field_y) {
                    break L2;
                  } else {
                    if (1 < var3.field_l) {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0 != 0;
                    } else {
                      break L2;
                    }
                  }
                }
                if (((aga) this).field_y != 2) {
                  L3: {
                    if (((aga) this).field_y != 9) {
                      break L3;
                    } else {
                      if (var3.field_a != 1) {
                        break L3;
                      } else {
                        stackOut_24_0 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0 != 0;
                      }
                    }
                  }
                  L4: {
                    if (((aga) this).field_y != 8) {
                      break L4;
                    } else {
                      if (var3.field_a == 2) {
                        stackOut_32_0 = 0;
                        stackIn_33_0 = stackOut_32_0;
                        return stackIn_33_0 != 0;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (54 == ((aga) this).field_y) {
                    stackOut_37_0 = 0;
                    stackIn_38_0 = stackOut_37_0;
                    return stackIn_38_0 != 0;
                  } else {
                    stackOut_39_0 = 1;
                    stackIn_40_0 = stackOut_39_0;
                    break L0;
                  }
                } else {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0 != 0;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3_ref, "aga.U(" + param0 + ',' + param1 + ')');
        }
        return stackIn_40_0 != 0;
    }

    final boolean f(int param0, int param1) {
        oha var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              var3 = ur.field_e[param1];
              var4 = ((aga) this).b(param1, (byte) -127);
              if (var3.field_g == param0) {
                break L1;
              } else {
                if (~((aga) this).field_K[var4] == ~(1 + var3.field_g)) {
                  break L1;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3_ref, "aga.OA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final static void d() {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            int discarded$2 = 106;
            var1 = dr.c();
            if (null != var1) {
              mn.field_l = new hca(var1[0], var1[1], kda.b(97));
              uka.field_h = new hca(320, 400, bf.field_h[wca.field_n].field_j);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1_ref, "aga.GA(" + false + ')');
        }
    }

    final void a(boolean param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        oha var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (((aga) this).field_y == 0) {
                break L1;
              } else {
                if (((aga) this).field_y != 35) {
                  ((aga) this).field_C = ((aga) this).field_C - 1;
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
                boolean discarded$2 = ((aga) this).a(19, (byte) -77);
                break L2;
              }
            }
            var4_int = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var4_int >= ((aga) this).field_K.length) {
                    break L5;
                  } else {
                    if (var6 != 0) {
                      break L4;
                    } else {
                      L6: {
                        if (((aga) this).field_m[var4_int] == -1) {
                          break L6;
                        } else {
                          var5 = ur.field_e[((aga) this).field_o.field_g.field_b[((aga) this).field_m[var4_int]]];
                          if (~((aga) this).field_K[var4_int] <= ~var5.field_g) {
                            break L6;
                          } else {
                            ((aga) this).field_K[var4_int] = ((aga) this).field_K[var4_int] + 1;
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
          throw pe.a((Throwable) (Object) var4, "aga.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J].field_n != 23) {
                    break L3;
                  } else {
                    if (!((aga) this).field_w.a(((aga) this).field_J, (byte) 124, ((aga) this).field_x)) {
                      break L3;
                    } else {
                      if (((aga) this).field_D == 0) {
                        break L3;
                      } else {
                        if (!((aga) this).g((byte) 85)) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                L4: {
                  if (24 != ((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J].field_n) {
                    break L4;
                  } else {
                    if (!((aga) this).field_w.a(((aga) this).field_J, (byte) 120, ((aga) this).field_x)) {
                      break L4;
                    } else {
                      if (((aga) this).field_D == 1) {
                        break L4;
                      } else {
                        if (((aga) this).g((byte) 85)) {
                          break L4;
                        } else {
                          ((aga) this).b((byte) 125, 25);
                          ((aga) this).field_w.field_T.field_G[1] = true;
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
                  if (25 != ((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J].field_n) {
                    break L5;
                  } else {
                    if (!((aga) this).field_w.a(((aga) this).field_J, (byte) 115, ((aga) this).field_x)) {
                      break L5;
                    } else {
                      if (((aga) this).field_D == 2) {
                        break L5;
                      } else {
                        if (((aga) this).g((byte) 85)) {
                          break L5;
                        } else {
                          ((aga) this).b((byte) 115, 26);
                          ((aga) this).field_w.field_T.field_G[2] = true;
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
                if (((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J].field_n != 26) {
                  break L1;
                } else {
                  if (!((aga) this).field_w.a(((aga) this).field_J, (byte) 121, ((aga) this).field_x)) {
                    break L1;
                  } else {
                    if (((aga) this).field_D == 3) {
                      break L1;
                    } else {
                      if (!((aga) this).g((byte) 85)) {
                        ((aga) this).b((byte) 114, 27);
                        ((aga) this).field_w.field_T.field_G[3] = true;
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
              ((aga) this).b((byte) 115, 24);
              ((aga) this).field_w.field_T.field_G[0] = true;
              break L1;
            }
            L6: {
              L7: {
                if (!((aga) this).i(23, 118)) {
                  break L7;
                } else {
                  if (!((aga) this).g((byte) 85)) {
                    break L7;
                  } else {
                    if (((aga) this).field_D != 0) {
                      break L7;
                    } else {
                      L8: {
                        ((aga) this).field_w.field_C[((aga) this).field_D] = ((aga) this).field_w.field_C[((aga) this).field_D] + 1;
                        ((aga) this).field_w.field_T.field_s[((aga) this).field_D] = ((aga) this).field_w.field_T.field_s[((aga) this).field_D] + 1;
                        var2_int = ((aga) this).field_w.b((byte) 65, (aga) this);
                        if (var2_int == -1) {
                          break L8;
                        } else {
                          ((aga) this).field_w.a(var2_int, (byte) 82);
                          ((aga) this).field_y = 0;
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
                  if (!((aga) this).i(24, -105)) {
                    break L10;
                  } else {
                    if (!((aga) this).g((byte) 85)) {
                      break L10;
                    } else {
                      if (1 == ((aga) this).field_D) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                L11: {
                  L12: {
                    if (!((aga) this).i(25, 127)) {
                      break L12;
                    } else {
                      if (!((aga) this).g((byte) 85)) {
                        break L12;
                      } else {
                        if (((aga) this).field_D == 2) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  if (!((aga) this).i(26, 125)) {
                    break L6;
                  } else {
                    if (!((aga) this).g((byte) 85)) {
                      break L6;
                    } else {
                      if (((aga) this).field_D == 3) {
                        L13: {
                          ((aga) this).field_w.field_C[((aga) this).field_D] = ((aga) this).field_w.field_C[((aga) this).field_D] + 1;
                          ((aga) this).field_w.field_T.field_s[((aga) this).field_D] = ((aga) this).field_w.field_T.field_s[((aga) this).field_D] + 1;
                          var2_int = ((aga) this).field_w.b((byte) 63, (aga) this);
                          if (-1 == var2_int) {
                            break L13;
                          } else {
                            ((aga) this).field_w.a(var2_int, (byte) 78);
                            ((aga) this).field_y = 0;
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
                  ((aga) this).field_w.field_C[((aga) this).field_D] = ((aga) this).field_w.field_C[((aga) this).field_D] + 1;
                  ((aga) this).field_w.field_T.field_s[((aga) this).field_D] = ((aga) this).field_w.field_T.field_s[((aga) this).field_D] + 1;
                  var2_int = ((aga) this).field_w.b((byte) 116, (aga) this);
                  if (var2_int != -1) {
                    ((aga) this).field_w.a(var2_int, (byte) 121);
                    ((aga) this).field_y = 0;
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
              ((aga) this).field_w.field_C[((aga) this).field_D] = ((aga) this).field_w.field_C[((aga) this).field_D] + 1;
              ((aga) this).field_w.field_T.field_s[((aga) this).field_D] = ((aga) this).field_w.field_T.field_s[((aga) this).field_D] + 1;
              var2_int = ((aga) this).field_w.b((byte) 51, (aga) this);
              if (var2_int == -1) {
                break L6;
              } else {
                ((aga) this).field_w.a(var2_int, (byte) 120);
                ((aga) this).field_y = 0;
                break L6;
              }
            }
            L15: {
              if (!((aga) this).field_w.a(((aga) this).field_D, ((aga) this).field_x, ((aga) this).field_J, (byte) -41)) {
                break L15;
              } else {
                if (!((aga) this).g((byte) 85)) {
                  ((aga) this).field_w.a(((aga) this).field_D, (byte) 65);
                  break L15;
                } else {
                  break L15;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "aga.K(" + 77 + ')');
        }
    }

    final void j(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        aga var3 = null;
        int var4 = 0;
        aga stackIn_14_0 = null;
        aga stackIn_33_0 = null;
        RuntimeException decompiledCaughtException = null;
        aga stackOut_13_0 = null;
        Object stackOut_32_0 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 <= -98) {
              L1: {
                if (((aga) this).field_w.field_o != 3) {
                  break L1;
                } else {
                  if (((aga) this).g((byte) 85)) {
                    int discarded$1 = 1;
                    this.c();
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                L3: {
                  if (31 != ((aga) this).field_y) {
                    break L3;
                  } else {
                    var2_int = 0;
                    L4: while (true) {
                      if (var2_int >= 7) {
                        break L3;
                      } else {
                        var3 = ((aga) this).field_w.field_S[((aga) this).field_D].field_b[var2_int];
                        stackOut_13_0 = (aga) var3;
                        stackIn_33_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_14_0 != null) {
                                break L6;
                              } else {
                                if (var4 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              if (!var3.i(-106)) {
                                break L7;
                              } else {
                                if (var4 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            if (var2_int == ((aga) this).field_u) {
                              break L5;
                            } else {
                              var3.h(121, ((aga) this).field_t);
                              break L5;
                            }
                          }
                          var2_int++;
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
                ((aga) this).field_I = 0;
                ((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J].field_l = null;
                ((aga) this).field_C = 0;
                stackOut_32_0 = this;
                stackIn_33_0 = (aga) (Object) stackOut_32_0;
                break L2;
              }
              this.field_y = 0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "aga.BA(" + param0 + ')');
        }
    }

    final void c(int param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        oha var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = 56 % ((param1 - 57) / 59);
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (((aga) this).field_m.length <= var5) {
                    break L3;
                  } else {
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (((aga) this).field_m[var5] == -1) {
                          break L4;
                        } else {
                          L5: {
                            var6 = ur.field_e[((aga) this).field_o.field_g.field_b[((aga) this).field_m[var5]]];
                            if (var6.field_j != 3) {
                              break L5;
                            } else {
                              if (var7 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (~((aga) this).field_K[var5] < ~var6.field_g) {
                            break L4;
                          } else {
                            L6: {
                              if (~param0 == ~var4) {
                                ((aga) this).field_K[var5] = -3 + var6.field_g;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            var4++;
                            break L4;
                          }
                        }
                      }
                      var5++;
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
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) (Object) runtimeException, "aga.H(" + param0 + ',' + param1 + ')');
        }
    }

    private final void h() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((aga) this).field_t = (int)it.field_c[((aga) this).field_k[0]];
              if (~((aga) this).field_I >= ~((aga) this).field_t) {
                break L1;
              } else {
                ((aga) this).field_I = ((aga) this).field_t;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "aga.R(" + -2 + ')');
        }
    }

    final void j(int param0, int param1) {
        oha var3 = ur.field_e[((aga) this).field_o.field_g.field_b[((aga) this).field_m[param0]]];
        if (param1 != 0) {
            return;
        }
        try {
            ((aga) this).field_K[param0] = var3.field_g + 1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "aga.M(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0, byte param1) {
        RuntimeException runtimeException = null;
        oha var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((aga) this).field_y != 42) {
              L1: {
                var3 = ur.field_e[param0];
                if (param1 <= -78) {
                  break L1;
                } else {
                  ((aga) this).j(-35, -54);
                  break L1;
                }
              }
              L2: {
                L3: {
                  var4 = ((aga) this).b(param0, (byte) -113);
                  if (!var3.a(-125)) {
                    break L3;
                  } else {
                    ((aga) this).field_K[var4] = 2 + var3.field_g;
                    if (BachelorFridge.field_y == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                ((aga) this).field_K[var4] = 0;
                break L2;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) (Object) runtimeException, "aga.A(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(rha param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        oha var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              param0.a((Object) (Object) (((aga) this).field_u + ": " + ((aga) this).field_o.field_f), 4819);
              param0.a(109, 2);
              param0.a((Object) (Object) ("x: " + ((aga) this).field_x + " y: " + ((aga) this).field_J), 4819);
              param0.a((Object) (Object) ("hp: " + ((aga) this).field_I + "/" + ((aga) this).field_t), 4819);
              var3_int = 99 % ((-30 - param1) / 56);
              if (((aga) this).field_F != 0) {
                param0.a((Object) (Object) ("splitid: " + ((aga) this).field_F), 4819);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((aga) this).field_y != 0) {
                param0.a((Object) (Object) ("status: " + pna.field_zb[((aga) this).field_y].field_d + " (" + ((aga) this).field_C + " turns)"), 4819);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (37 != ((aga) this).field_y) {
                break L3;
              } else {
                param0.a((Object) (Object) ("friendly: " + ((aga) this).field_E), 4819);
                break L3;
              }
            }
            L4: {
              if (((aga) this).field_H != 0) {
                param0.a((Object) (Object) ("shield: " + ((aga) this).field_H), 4819);
                break L4;
              } else {
                break L4;
              }
            }
            var4 = 0;
            L5: while (true) {
              L6: {
                L7: {
                  if (var4 >= 5) {
                    break L7;
                  } else {
                    var5 = ((aga) this).field_m[var4];
                    if (var8 != 0) {
                      break L6;
                    } else {
                      L8: {
                        L9: {
                          if (-1 != var5) {
                            break L9;
                          } else {
                            if (var8 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          var6 = al.a(-80, ((aga) this).field_o.field_g.field_b[var5]);
                          var7 = ((aga) this).field_K[var4];
                          if (var7 != 0) {
                            break L10;
                          } else {
                            param0.a((Object) (Object) ("move " + var4 + ": " + var6.field_f), 4819);
                            if (var8 == 0) {
                              break L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                        param0.a((Object) (Object) ("move " + var4 + ": " + var6.field_f + " (cooldown " + var7 + ")"), 4819);
                        break L8;
                      }
                      var4++;
                      if (var8 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                param0.a((Object) (Object) ("Creature checksum: " + Integer.toString(((aga) this).g(96), 16)), 4819);
                param0.a(115, -2);
                break L6;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("aga.N(");
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L11;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L11;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param1 + ')');
        }
    }

    final boolean i(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        try {
          L0: {
            L1: {
              if (((aga) this).field_x <= 0) {
                break L1;
              } else {
                if (~((aga) this).field_w.field_a[-1 + ((aga) this).field_x][((aga) this).field_J].field_n == ~param0) {
                  stackOut_24_0 = 1;
                  stackIn_25_0 = stackOut_24_0;
                  return stackIn_25_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (~((aga) this).field_x <= ~(((aga) this).field_w.field_z + -1)) {
                break L2;
              } else {
                if (((aga) this).field_w.field_a[1 + ((aga) this).field_x][((aga) this).field_J].field_n != param0) {
                  break L2;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                }
              }
            }
            L3: {
              if (((aga) this).field_J <= 0) {
                break L3;
              } else {
                if (param0 != ((aga) this).field_w.field_a[((aga) this).field_x][-1 + ((aga) this).field_J].field_n) {
                  break L3;
                } else {
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0 != 0;
                }
              }
            }
            L4: {
              if (~(((aga) this).field_w.field_B - 1) >= ~((aga) this).field_J) {
                break L4;
              } else {
                if (~param0 != ~((aga) this).field_w.field_a[((aga) this).field_x][1 + ((aga) this).field_J].field_n) {
                  break L4;
                } else {
                  stackOut_22_0 = 1;
                  stackIn_23_0 = stackOut_22_0;
                  return stackIn_23_0 != 0;
                }
              }
            }
            var3_int = 36 % ((param1 - 83) / 33);
            stackOut_26_0 = 0;
            stackIn_27_0 = stackOut_26_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "aga.T(" + param0 + ',' + param1 + ')');
        }
        return stackIn_27_0 != 0;
    }

    final String b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String stackIn_7_0 = null;
        String stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        String stackOut_7_0 = null;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = -91 % ((-21 - param0) / 54);
                if (0 > ((aga) this).field_D) {
                  break L2;
                } else {
                  if (((aga) this).field_w.field_y.length <= ((aga) this).field_D) {
                    break L2;
                  } else {
                    stackOut_4_0 = ((aga) this).field_w.field_y[((aga) this).field_D];
                    stackIn_7_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = Integer.toString(((aga) this).field_D);
              stackIn_7_0 = stackOut_6_0;
              break L1;
            }
            var3 = stackIn_7_0;
            stackOut_7_0 = "owner: " + var3 + " pos: " + ((aga) this).field_u + " type: " + ((aga) this).field_o.field_f;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "aga.O(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    private final void h(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((aga) this).field_I = ((aga) this).field_I + param1;
              if (((aga) this).field_I > ((aga) this).field_t) {
                param1 = param1 + (-((aga) this).field_I + ((aga) this).field_t);
                ((aga) this).field_I = ((aga) this).field_t;
                break L1;
              } else {
                break L1;
              }
            }
            ((aga) this).field_w.field_T.field_F[((aga) this).field_D] = ((aga) this).field_w.field_T.field_F[((aga) this).field_D] + param1;
            var3_int = -86 % ((param0 - 38) / 58);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "aga.DA(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean g(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        try {
          L0: {
            if (((aga) this).field_y == 33) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (((aga) this).field_y != 3) {
                  break L1;
                } else {
                  param1 = param1 >> 1;
                  break L1;
                }
              }
              var3_int = -36 / ((param0 - -23) / 44);
              if (((aga) this).field_H > 0) {
                L2: {
                  ((aga) this).field_H = ((aga) this).field_H - param1;
                  if (((aga) this).field_H <= 0) {
                    ((aga) this).b((byte) 125, 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0 != 0;
              } else {
                L3: {
                  if (37 != ((aga) this).field_y) {
                    break L3;
                  } else {
                    if (param1 == 0) {
                      break L3;
                    } else {
                      ((aga) this).b((byte) 116, 0);
                      break L3;
                    }
                  }
                }
                if (param1 < 0) {
                  this.h(-24, -param1);
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  return stackIn_26_0 != 0;
                } else {
                  L4: {
                    L5: {
                      if (29 == ((aga) this).field_y) {
                        break L5;
                      } else {
                        if (((aga) this).field_y == 44) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((aga) this).b((byte) 115, 0);
                    break L4;
                  }
                  ((aga) this).field_I = ((aga) this).field_I - param1;
                  ((aga) this).field_w.field_T.field_b[((aga) this).field_D] = ((aga) this).field_w.field_T.field_b[((aga) this).field_D] + param1;
                  if (((aga) this).field_I > 0) {
                    stackOut_37_0 = 0;
                    stackIn_38_0 = stackOut_37_0;
                    break L0;
                  } else {
                    ((aga) this).j(-122);
                    stackOut_35_0 = 1;
                    stackIn_36_0 = stackOut_35_0;
                    return stackIn_36_0 != 0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "aga.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_38_0 != 0;
    }

    final void a(wia param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_126_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        String stackOut_123_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (((aga) this).a(32, (byte) -66)) {
              return;
            } else {
              L1: {
                var3_int = param0.field_n;
                if (!od.field_w[((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J].field_n].field_b) {
                  break L1;
                } else {
                  if (!((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J].field_m) {
                    break L1;
                  } else {
                    if (((aga) this).g((byte) 85)) {
                      break L1;
                    } else {
                      if (33 == ((aga) this).field_y) {
                        break L1;
                      } else {
                        L2: {
                          L3: {
                            if (var3_int == 11) {
                              break L3;
                            } else {
                              L4: {
                                if (var3_int != 10) {
                                  break L4;
                                } else {
                                  ((aga) this).b((byte) 126, 18);
                                  ((aga) this).field_w.field_T.field_e[((aga) this).field_D] = ((aga) this).field_w.field_T.field_e[((aga) this).field_D] + 1;
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L5: {
                                if (var3_int != 7) {
                                  break L5;
                                } else {
                                  ((aga) this).b((byte) 111, 4);
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L6: {
                                if (var3_int != 6) {
                                  break L6;
                                } else {
                                  ((aga) this).b((byte) 120, 16);
                                  ((aga) this).field_w.field_T.field_e[((aga) this).field_D] = ((aga) this).field_w.field_T.field_e[((aga) this).field_D] + 1;
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
                                    if (28 != ((aga) this).field_y) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                L9: {
                                  if (var3_int != 8) {
                                    break L9;
                                  } else {
                                    ((aga) this).b((byte) 126, 17);
                                    ((aga) this).field_w.field_T.field_e[((aga) this).field_D] = ((aga) this).field_w.field_T.field_e[((aga) this).field_D] + 1;
                                    if (var5 == 0) {
                                      break L2;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L10: {
                                  if (var3_int == 13) {
                                    break L10;
                                  } else {
                                    L11: {
                                      if (var3_int == 12) {
                                        break L11;
                                      } else {
                                        if (29 == var3_int) {
                                          ((aga) this).b((byte) 126, 12);
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
                                    ((aga) this).b((byte) 113, 19);
                                    ((aga) this).field_w.field_T.field_e[((aga) this).field_D] = ((aga) this).field_w.field_T.field_e[((aga) this).field_D] + 1;
                                    if (var5 == 0) {
                                      break L2;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                ((aga) this).b((byte) 116, 7);
                                if (var5 == 0) {
                                  break L2;
                                } else {
                                  break L7;
                                }
                              }
                              ((aga) this).b((byte) 127, 5);
                              if (var5 == 0) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          ((aga) this).b((byte) 110, 6);
                          break L2;
                        }
                        L12: {
                          if (((aga) this).field_w.a(((aga) this).field_J, (byte) 120, ((aga) this).field_x)) {
                            break L12;
                          } else {
                            if (29 == var3_int) {
                              break L12;
                            } else {
                              ((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J].field_m = false;
                              break L12;
                            }
                          }
                        }
                        L13: {
                          L14: {
                            if (((aga) this).field_w.a(((aga) this).field_J, (byte) 117, ((aga) this).field_x)) {
                              break L14;
                            } else {
                              ((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J].field_j = 5;
                              if (var5 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          ((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J].field_j = -1;
                          break L13;
                        }
                        ((aga) this).d(-127);
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
                    ((aga) this).j(-114);
                    ((aga) this).field_A = false;
                    if (var5 == 0) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                if (var3_int == 38) {
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
                    boolean discarded$1 = ((aga) this).g(-67, 75);
                    break L17;
                  }
                  ((aga) this).field_w.b((byte) 47, 0, ((aga) this).field_x, ((aga) this).field_J);
                  break L15;
                } else {
                  break L15;
                }
              }
              L19: {
                if (param1 < -20) {
                  break L19;
                } else {
                  ((aga) this).field_v = -90;
                  break L19;
                }
              }
              L20: {
                if (((aga) this).field_w.field_o != 3) {
                  break L20;
                } else {
                  var4 = ((aga) this).field_w.a(1845, ((aga) this).field_J, ((aga) this).field_x);
                  if (-1 != var4) {
                    L21: {
                      if (~((aga) this).field_D != ~var4) {
                        break L21;
                      } else {
                        ((aga) this).field_w.a(((aga) this).field_D, (byte) 46);
                        ((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J].field_m = false;
                        if (var5 == 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    if (!((aga) this).g((byte) 85)) {
                      ((aga) this).b((byte) 111, var4 + 24);
                      ((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J].field_m = false;
                      ((aga) this).field_w.field_T.field_G[var4] = true;
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
                if (((aga) this).field_w.field_o != 3) {
                  break L22;
                } else {
                  if (!((aga) this).g((byte) 85)) {
                    break L22;
                  } else {
                    var4 = ((aga) this).field_w.b((byte) 65, (aga) this);
                    ((aga) this).field_w.field_c[var4] = new int[2];
                    break L22;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var3 = decompiledCaughtException;
            stackOut_122_0 = (RuntimeException) var3;
            stackOut_122_1 = new StringBuilder().append("aga.D(");
            stackIn_125_0 = stackOut_122_0;
            stackIn_125_1 = stackOut_122_1;
            stackIn_123_0 = stackOut_122_0;
            stackIn_123_1 = stackOut_122_1;
            if (param0 == null) {
              stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
              stackOut_125_1 = (StringBuilder) (Object) stackIn_125_1;
              stackOut_125_2 = "null";
              stackIn_126_0 = stackOut_125_0;
              stackIn_126_1 = stackOut_125_1;
              stackIn_126_2 = stackOut_125_2;
              break L23;
            } else {
              stackOut_123_0 = (RuntimeException) (Object) stackIn_123_0;
              stackOut_123_1 = (StringBuilder) (Object) stackIn_123_1;
              stackOut_123_2 = "{...}";
              stackIn_126_0 = stackOut_123_0;
              stackIn_126_1 = stackOut_123_1;
              stackIn_126_2 = stackOut_123_2;
              break L23;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_126_0, stackIn_126_2 + ',' + param1 + ')');
        }
    }

    final int c(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        oha var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 > 110) {
                break L1;
              } else {
                ((aga) this).a((byte) -104, (lu) null);
                break L1;
              }
            }
            var2_int = 0;
            var3 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var3 <= ~((aga) this).field_m.length) {
                    break L4;
                  } else {
                    stackOut_6_0 = ~((aga) this).field_m[var3];
                    stackIn_15_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_7_0 == 0) {
                          break L5;
                        } else {
                          var4 = ur.field_e[((aga) this).field_o.field_g.field_b[((aga) this).field_m[var3]]];
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
                stackOut_14_0 = var2_int;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "aga.W(" + param0 + ')');
        }
        return stackIn_15_0;
    }

    final void a(wia param0, lc param1, eaa param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        rv var6 = null;
        int var7_int = 0;
        int[] var7 = null;
        oha var8 = null;
        int var9 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        String stackOut_124_2 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        String stackOut_134_2 = null;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        String stackOut_132_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var5_int = param0.field_n;
              var6 = new rv();
              if (((aga) this).field_y == 0) {
                break L1;
              } else {
                if (35 == ((aga) this).field_y) {
                  break L1;
                } else {
                  if (((aga) this).field_y != 31) {
                    if (0 < ((aga) this).field_C) {
                      break L1;
                    } else {
                      if (((aga) this).g((byte) 85)) {
                        break L1;
                      } else {
                        if (((aga) this).field_H <= 0) {
                          var6.a(true, (pp) (Object) new ks(new nq((aga) this)));
                          ((aga) this).field_y = 0;
                          ((aga) this).d(114);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (((aga) this).field_y != 42) {
                break L2;
              } else {
                if (!((aga) this).field_G) {
                  break L2;
                } else {
                  var6.a(true, (pp) (Object) new ks(new nq((aga) this)));
                  ((aga) this).field_y = 0;
                  ((aga) this).d(param3 ^ -15);
                  break L2;
                }
              }
            }
            if (param3 == 121) {
              var7_int = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (~((aga) this).field_K.length >= ~var7_int) {
                      break L5;
                    } else {
                      stackOut_30_0 = 0;
                      stackOut_30_1 = ~((aga) this).field_m[var7_int];
                      stackIn_46_0 = stackOut_30_0;
                      stackIn_46_1 = stackOut_30_1;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      if (var9 != 0) {
                        break L4;
                      } else {
                        L6: {
                          L7: {
                            if (stackIn_31_0 != stackIn_31_1) {
                              break L7;
                            } else {
                              if (var9 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var8 = ur.field_e[((aga) this).field_o.field_g.field_b[((aga) this).field_m[var7_int]]];
                          if (((aga) this).field_K[var7_int] != var8.field_g) {
                            break L6;
                          } else {
                            if (var8.field_g != 0) {
                              ((aga) this).j(var7_int, 0);
                              var6.a(true, (pp) (Object) new kt(new nq(((aga) this).field_D, ((aga) this).field_u), var7_int));
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var7_int++;
                        if (var9 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  stackOut_45_0 = 1;
                  stackOut_45_1 = ((aga) this).field_y;
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  break L4;
                }
                L8: {
                  if (stackIn_46_0 != stackIn_46_1) {
                    break L8;
                  } else {
                    var6.a(true, (pp) (Object) new qq(new nq(((aga) this).field_D, ((aga) this).field_u), -1, 5));
                    break L8;
                  }
                }
                L9: {
                  if (((aga) this).field_y == 12) {
                    var6.a(true, (pp) (Object) new qq(new nq(((aga) this).field_D, ((aga) this).field_u), -1, 20));
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (((aga) this).field_y != 14) {
                    break L10;
                  } else {
                    L11: {
                      var7_int = -((aga) this).field_I + ((aga) this).field_t;
                      if (var7_int > 5) {
                        var7_int = 5;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    if (var7_int <= 0) {
                      break L10;
                    } else {
                      var6.a(true, (pp) (Object) new qq(new nq(((aga) this).field_D, ((aga) this).field_u), -1, -var7_int));
                      break L10;
                    }
                  }
                }
                L12: {
                  if (44 == ((aga) this).field_y) {
                    var6.a(true, (pp) (Object) new qq(new nq(((aga) this).field_D, ((aga) this).field_u), -1, -20));
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (((aga) this).field_y == 53) {
                    var6.a(true, (pp) (Object) new qq(new nq(((aga) this).field_D, ((aga) this).field_u), -1, 10));
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (((aga) this).field_y == 32) {
                    break L14;
                  } else {
                    L15: {
                      if (var5_int != 29) {
                        break L15;
                      } else {
                        var6.a(true, (pp) (Object) new lia(new nq(((aga) this).field_D, ((aga) this).field_u), 0, 12));
                        break L15;
                      }
                    }
                    L16: {
                      if (var5_int != 14) {
                        break L16;
                      } else {
                        L17: {
                          var7_int = -((aga) this).field_I + ((aga) this).field_t;
                          if (var7_int > 5) {
                            var7_int = 5;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        if (var7_int > 0) {
                          var6.a(true, (pp) (Object) new lia(new nq(((aga) this).field_D, ((aga) this).field_u), -var7_int, -1));
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (21 == var5_int) {
                        var6.a(true, (pp) (Object) new lia(new nq(((aga) this).field_D, ((aga) this).field_u), ((aga) this).field_I, -1));
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if (15 == var5_int) {
                        var6.a(true, (pp) (Object) new lia(new nq(((aga) this).field_D, ((aga) this).field_u), 5, -1));
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    if (var5_int == 16) {
                      var6.a(true, (pp) (Object) new lia(new nq(((aga) this).field_D, ((aga) this).field_u), 0, kla.a(14, ((aga) this).field_p, param3 + 2147483527) + 1));
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
                L20: {
                  var7 = this.e(36, 73);
                  if (null == var7) {
                    break L20;
                  } else {
                    var6.a(true, (pp) (Object) new lia(new nq(((aga) this).field_D, ((aga) this).field_u), -30, -1));
                    break L20;
                  }
                }
                L21: {
                  if (var5_int != 36) {
                    break L21;
                  } else {
                    var6.a(true, (pp) (Object) new lia(new nq(((aga) this).field_D, ((aga) this).field_u), -30, -1));
                    break L21;
                  }
                }
                L22: {
                  if (((aga) this).field_w.field_R) {
                    L23: {
                      if (((aga) this).field_x == 0) {
                        break L23;
                      } else {
                        if (0 == ((aga) this).field_J) {
                          break L23;
                        } else {
                          if (~(((aga) this).field_w.field_z - 1) == ~((aga) this).field_x) {
                            break L23;
                          } else {
                            if (((aga) this).field_w.field_B + -1 == ((aga) this).field_J) {
                              break L23;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                    }
                    param1.a((jm) (Object) new ns(new nq((aga) this)), (byte) 75);
                    ((aga) this).field_w.field_R = false;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L24: {
                  if (var6.field_m.g(0) <= 0) {
                    break L24;
                  } else {
                    param2.a((bw) (Object) var6, true);
                    break L24;
                  }
                }
                var6.a(((aga) this).field_w, false);
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var5 = decompiledCaughtException;
            stackOut_123_0 = (RuntimeException) var5;
            stackOut_123_1 = new StringBuilder().append("aga.CA(");
            stackIn_126_0 = stackOut_123_0;
            stackIn_126_1 = stackOut_123_1;
            stackIn_124_0 = stackOut_123_0;
            stackIn_124_1 = stackOut_123_1;
            if (param0 == null) {
              stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
              stackOut_126_1 = (StringBuilder) (Object) stackIn_126_1;
              stackOut_126_2 = "null";
              stackIn_127_0 = stackOut_126_0;
              stackIn_127_1 = stackOut_126_1;
              stackIn_127_2 = stackOut_126_2;
              break L25;
            } else {
              stackOut_124_0 = (RuntimeException) (Object) stackIn_124_0;
              stackOut_124_1 = (StringBuilder) (Object) stackIn_124_1;
              stackOut_124_2 = "{...}";
              stackIn_127_0 = stackOut_124_0;
              stackIn_127_1 = stackOut_124_1;
              stackIn_127_2 = stackOut_124_2;
              break L25;
            }
          }
          L26: {
            stackOut_127_0 = (RuntimeException) (Object) stackIn_127_0;
            stackOut_127_1 = ((StringBuilder) (Object) stackIn_127_1).append(stackIn_127_2).append(',');
            stackIn_130_0 = stackOut_127_0;
            stackIn_130_1 = stackOut_127_1;
            stackIn_128_0 = stackOut_127_0;
            stackIn_128_1 = stackOut_127_1;
            if (param1 == null) {
              stackOut_130_0 = (RuntimeException) (Object) stackIn_130_0;
              stackOut_130_1 = (StringBuilder) (Object) stackIn_130_1;
              stackOut_130_2 = "null";
              stackIn_131_0 = stackOut_130_0;
              stackIn_131_1 = stackOut_130_1;
              stackIn_131_2 = stackOut_130_2;
              break L26;
            } else {
              stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
              stackOut_128_1 = (StringBuilder) (Object) stackIn_128_1;
              stackOut_128_2 = "{...}";
              stackIn_131_0 = stackOut_128_0;
              stackIn_131_1 = stackOut_128_1;
              stackIn_131_2 = stackOut_128_2;
              break L26;
            }
          }
          L27: {
            stackOut_131_0 = (RuntimeException) (Object) stackIn_131_0;
            stackOut_131_1 = ((StringBuilder) (Object) stackIn_131_1).append(stackIn_131_2).append(',');
            stackIn_134_0 = stackOut_131_0;
            stackIn_134_1 = stackOut_131_1;
            stackIn_132_0 = stackOut_131_0;
            stackIn_132_1 = stackOut_131_1;
            if (param2 == null) {
              stackOut_134_0 = (RuntimeException) (Object) stackIn_134_0;
              stackOut_134_1 = (StringBuilder) (Object) stackIn_134_1;
              stackOut_134_2 = "null";
              stackIn_135_0 = stackOut_134_0;
              stackIn_135_1 = stackOut_134_1;
              stackIn_135_2 = stackOut_134_2;
              break L27;
            } else {
              stackOut_132_0 = (RuntimeException) (Object) stackIn_132_0;
              stackOut_132_1 = (StringBuilder) (Object) stackIn_132_1;
              stackOut_132_2 = "{...}";
              stackIn_135_0 = stackOut_132_0;
              stackIn_135_1 = stackOut_132_1;
              stackIn_135_2 = stackOut_132_2;
              break L27;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_135_0, stackIn_135_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, aga param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        try {
          L0: {
            if (param2 == 2) {
              L1: {
                if (null == param1) {
                  break L1;
                } else {
                  if (~param1.field_D == ~((aga) this).field_D) {
                    break L1;
                  } else {
                    if (0 <= param0) {
                      ((aga) this).field_w.field_T.field_f[param1.field_D] = ((aga) this).field_w.field_T.field_f[param1.field_D] + param0;
                      ((aga) this).field_w.field_T.field_n[param1.field_D] = ((aga) this).field_w.field_T.field_n[param1.field_D] + param0;
                      ((aga) this).field_w.field_T.field_b[((aga) this).field_D] = ((aga) this).field_w.field_T.field_b[((aga) this).field_D] + param0;
                      ((aga) this).field_w.field_T.field_g[((aga) this).field_D] = ((aga) this).field_w.field_T.field_g[((aga) this).field_D] + 1;
                      ((aga) this).field_w.field_T.field_y[param1.field_D] = ((aga) this).field_w.field_T.field_y[param1.field_D] + 1;
                      ((aga) this).field_w.field_T.field_E[param1.field_D] = ((aga) this).field_w.field_T.field_E[param1.field_D] + 1;
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
                    ((aga) this).field_w.field_T.field_F[param1.field_D] = ((aga) this).field_w.field_T.field_F[param1.field_D] - param0;
                    if (~param1.field_D == ~((aga) this).field_D) {
                      break L2;
                    } else {
                      ((aga) this).field_w.field_T.field_j[((aga) this).field_D] = true;
                      break L2;
                    }
                  }
                }
              }
              if (!((aga) this).g(param2 + 72, param0)) {
                stackOut_36_0 = 0;
                stackIn_37_0 = stackOut_36_0;
                break L0;
              } else {
                L3: {
                  if (param1 == null) {
                    break L3;
                  } else {
                    ((aga) this).field_w.field_T.field_w[param1.field_D] = ((aga) this).field_w.field_T.field_w[param1.field_D] + 1;
                    if (20 != param1.field_o.field_b) {
                      break L3;
                    } else {
                      if (((aga) this).field_o.field_b != 3) {
                        break L3;
                      } else {
                        ((aga) this).field_w.field_T.field_x[param1.field_D] = true;
                        break L3;
                      }
                    }
                  }
                }
                stackOut_34_0 = 1;
                stackIn_35_0 = stackOut_34_0;
                return stackIn_35_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var4;
            stackOut_38_1 = new StringBuilder().append("aga.JA(").append(param0).append(',');
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L4;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + param2 + ')');
        }
        return stackIn_37_0 != 0;
    }

    final void f(int param0) {
        RuntimeException var2 = null;
        int[][] var2_array = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            ((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J].field_l = (aga) this;
            if (!((aga) this).a(param0, (byte) 126)) {
              ((aga) this).a(((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J], -83);
              var2_array = ((aga) this).field_w.field_i;
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var2_array.length >= ~var3) {
                      break L3;
                    } else {
                      var4 = var2_array[var3];
                      stackOut_5_0 = ~((aga) this).field_x;
                      stackOut_5_1 = ~var4[0];
                      stackIn_21_0 = stackOut_5_0;
                      stackIn_21_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_6_0 != stackIn_6_1) {
                            break L4;
                          } else {
                            if (((aga) this).field_J == var4[1]) {
                              L5: {
                                if (~var4[2] != ~((aga) this).field_D) {
                                  ((aga) this).field_w.field_T.field_A[((aga) this).field_D] = ((aga) this).field_w.field_T.field_A[((aga) this).field_D] + 1;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              var4[2] = ((aga) this).field_D;
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
                  stackOut_20_0 = -4;
                  stackOut_20_1 = ~((aga) this).field_w.field_o;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L2;
                }
                L6: {
                  if (stackIn_21_0 != stackIn_21_1) {
                    break L6;
                  } else {
                    int discarded$1 = 77;
                    this.e();
                    break L6;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "aga.FA(" + param0 + ')');
        }
    }

    final boolean a(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              var3_int = -40 % ((-5 - param1) / 58);
              if (~((aga) this).field_y != ~param0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "aga.NA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final boolean g(byte param0) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 85) {
                break L1;
              } else {
                boolean discarded$2 = ((aga) this).c((byte) -17, 73);
                break L1;
              }
            }
            L2: {
              if (((aga) this).field_y < 24) {
                break L2;
              } else {
                if (27 < ((aga) this).field_y) {
                  break L2;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "aga.PA(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final int f(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((aga) this).field_k[1] > 0) {
              if (param0 > 117) {
                stackOut_6_0 = ((aga) this).field_k[1] + 2;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 35;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 2;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "aga.MA(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(Random param0, boolean param1, eaa param2, int param3) {
        rea var4 = null;
        RuntimeException var4_ref = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var4 = (rea) (Object) param2.b((byte) 90);
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          int fieldTemp$2 = var4.field_n + var4.field_h;
                          var4.field_n = var4.field_n + var4.field_h;
                          if (0 <= fieldTemp$2) {
                            break L5;
                          } else {
                            var4.a(false);
                            if (var5 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var4.field_l = var4.field_l + var4.field_o;
                        int discarded$3 = kla.a(50, param0, -2147483648);
                        break L4;
                      }
                      var4 = (rea) (Object) param2.c(0);
                      if (var5 == 0) {
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
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4_ref;
            stackOut_15_1 = new StringBuilder().append("aga.EA(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(true).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L7;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param3 + ')');
        }
    }

    final boolean k(int param0, int param1) {
        RuntimeException var3 = null;
        double var3_double = 0.0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (28 != ((aga) this).field_y) {
                break L1;
              } else {
                if (5 == param1) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            if (((aga) this).field_y != 31) {
              if (!((aga) this).g((byte) 85)) {
                L2: {
                  if (param1 != 42) {
                    break L2;
                  } else {
                    ((aga) this).field_G = false;
                    break L2;
                  }
                }
                if (param0 == -2049) {
                  L3: {
                    ((aga) this).field_y = param1;
                    ((aga) this).field_C = 1 + is.field_b[((aga) this).field_y];
                    if (16 == param1) {
                      L4: {
                        var3_double = 100.0 * ((double)((aga) this).field_I / it.field_c[((aga) this).field_k[0]]);
                        var5 = ((aga) this).field_k[0] + 1;
                        if (var5 <= 5) {
                          break L4;
                        } else {
                          var5 = 5;
                          break L4;
                        }
                      }
                      ((aga) this).field_I = (int)(var3_double * it.field_c[var5] / 100.0);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  stackOut_26_0 = 1;
                  stackIn_27_0 = stackOut_26_0;
                  break L0;
                } else {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0 != 0;
                }
              } else {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0 != 0;
              }
            } else {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "aga.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_27_0 != 0;
    }

    private final int[] e(int param0, int param1) {
        RuntimeException var3 = null;
        int[] stackIn_11_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_25_0 = null;
        int[] stackIn_27_0 = null;
        Object stackIn_32_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_26_0 = null;
        int[] stackOut_10_0 = null;
        int[] stackOut_16_0 = null;
        int[] stackOut_24_0 = null;
        Object stackOut_31_0 = null;
        try {
          L0: {
            L1: {
              if (0 >= ((aga) this).field_x) {
                break L1;
              } else {
                if (((aga) this).field_w.field_a[-1 + ((aga) this).field_x][((aga) this).field_J].field_n == 36) {
                  stackOut_26_0 = new int[]{((aga) this).field_x + -1, ((aga) this).field_J};
                  stackIn_27_0 = stackOut_26_0;
                  return stackIn_27_0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (((aga) this).field_x >= -1 + ((aga) this).field_w.field_z) {
                break L2;
              } else {
                if (36 != ((aga) this).field_w.field_a[1 + ((aga) this).field_x][((aga) this).field_J].field_n) {
                  break L2;
                } else {
                  stackOut_10_0 = new int[]{1 + ((aga) this).field_x, ((aga) this).field_J};
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            }
            L3: {
              if (((aga) this).field_J <= 0) {
                break L3;
              } else {
                if (((aga) this).field_w.field_a[((aga) this).field_x][-1 + ((aga) this).field_J].field_n != 36) {
                  break L3;
                } else {
                  stackOut_16_0 = new int[]{((aga) this).field_x, ((aga) this).field_J + -1};
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                }
              }
            }
            L4: {
              if (-1 + ((aga) this).field_w.field_B <= ((aga) this).field_J) {
                break L4;
              } else {
                if (((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J + 1].field_n == 36) {
                  stackOut_24_0 = new int[]{((aga) this).field_x, ((aga) this).field_J - -1};
                  stackIn_25_0 = stackOut_24_0;
                  return stackIn_25_0;
                } else {
                  break L4;
                }
              }
            }
            stackOut_31_0 = null;
            stackIn_32_0 = stackOut_31_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "aga.G(" + 36 + ',' + 73 + ')');
        }
        return (int[]) (Object) stackIn_32_0;
    }

    final boolean a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!param1) {
              L1: {
                if (((aga) this).field_w.field_o != 3) {
                  break L1;
                } else {
                  if (~((aga) this).field_D != ~((aga) this).field_w.b(false, param0)) {
                    break L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
              if (32 == ((aga) this).field_y) {
                stackOut_12_0 = 1;
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0 != 0;
              } else {
                stackOut_14_0 = ju.c(23745, param0);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "aga.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    aga(rk param0, op param1, int param2, int param3) {
        super(param0);
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = BachelorFridge.field_y;
        ((aga) this).field_A = true;
        try {
          L0: {
            ((aga) this).field_w = param1;
            ((aga) this).field_D = param2;
            ((aga) this).field_F = 0;
            ((aga) this).field_u = param3;
            ((aga) this).field_t = (int)it.field_c[((aga) this).field_k[0]];
            ((aga) this).field_I = ((aga) this).field_t;
            ((aga) this).field_s = 4;
            ((aga) this).field_K = new int[((aga) this).field_m.length];
            var5_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5_int >= ((aga) this).field_K.length) {
                    break L3;
                  } else {
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (((aga) this).field_m[var5_int] == -1) {
                          break L4;
                        } else {
                          ((aga) this).field_K[var5_int] = 0;
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
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("aga.<init>(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final aga b(boolean param0) {
        aga var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        aga stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        aga stackOut_11_0 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            var2 = new aga((rk) this, ((aga) this).field_w, ((aga) this).field_D, ((aga) this).field_u);
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 >= 4) {
                    break L3;
                  } else {
                    ((aga) this).field_k[var3] = ((aga) this).field_k[var3] >> 1;
                    var2.field_k[var3] = var2.field_k[var3] - ((aga) this).field_k[var3];
                    var3++;
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
                ((aga) this).field_t = ((aga) this).field_t >> 1;
                var2.field_t = var2.field_t - ((aga) this).field_t;
                ((aga) this).field_I = ((aga) this).field_I >> 1;
                var2.field_x = ((aga) this).field_x;
                break L2;
              }
              L4: {
                if (param0) {
                  break L4;
                } else {
                  ((aga) this).b((byte) -95, 67);
                  break L4;
                }
              }
              var2.field_J = ((aga) this).field_J;
              ((aga) this).field_F = 5 + ((aga) this).field_u + 17 * ((aga) this).field_D;
              var2.field_F = 5 + ((aga) this).field_u + 17 * ((aga) this).field_D;
              var2.field_I = ((aga) this).field_I;
              stackOut_11_0 = (aga) var2;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2_ref, "aga.KA(" + param0 + ')');
        }
        return stackIn_12_0;
    }

    private final void c() {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = ((aga) this).field_w.b((byte) 122, (aga) this);
              if (((aga) this).g((byte) 85)) {
                ((aga) this).field_y = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((aga) this).field_w.field_c[var2_int] = new int[2];
              if (((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J].field_n != 21) {
                break L2;
              } else {
                ((aga) this).field_w.a(var2_int, (byte) 115);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "aga.J(" + true + ')');
        }
    }

    final void a(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                ((aga) this).field_y = 87;
                break L1;
              }
            }
            ((aga) this).field_w.field_T.field_i[((aga) this).field_D] = ((aga) this).field_w.field_T.field_i[((aga) this).field_D] + 1;
            ((aga) this).field_x = param1;
            ((aga) this).field_J = param0;
            ((aga) this).f(32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var4, "aga.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        var5 = BachelorFridge.field_y;
        try {
          var3_int = 79 / ((param1 - -47) / 57);
          var4 = 0;
          L0: while (true) {
            L1: {
              if (~((aga) this).field_m.length >= ~var4) {
                break L1;
              } else {
                L2: {
                  if (((aga) this).field_m[var4] == -1) {
                    break L2;
                  } else {
                    if (~param0 != ~((aga) this).field_o.field_g.field_b[((aga) this).field_m[var4]]) {
                      break L2;
                    } else {
                      stackOut_7_0 = var4;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    }
                  }
                }
                var4++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalStateException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "aga.LA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = ((aga) this).field_x;
                var5 = ((aga) this).field_J;
                if (param2 != 2) {
                  break L2;
                } else {
                  var4_int = var4_int - param1;
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param2 != 4) {
                  break L3;
                } else {
                  var4_int = var4_int + param1;
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param2 == 1) {
                  break L4;
                } else {
                  if (param2 != 3) {
                    break L1;
                  } else {
                    var5 = var5 + param1;
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var5 = var5 - param1;
              break L1;
            }
            L5: {
              if (!param0) {
                break L5;
              } else {
                ((aga) this).field_H = 110;
                break L5;
              }
            }
            L6: {
              L7: {
                if (((aga) this).field_y != 43) {
                  break L7;
                } else {
                  var6 = 0;
                  L8: while (true) {
                    if (param1 <= var6) {
                      break L7;
                    } else {
                      stackOut_21_0 = param2;
                      stackOut_21_1 = 2;
                      stackIn_47_0 = stackOut_21_0;
                      stackIn_47_1 = stackOut_21_1;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      if (var7 != 0) {
                        break L6;
                      } else {
                        L9: {
                          L10: {
                            if (stackIn_22_0 != stackIn_22_1) {
                              break L10;
                            } else {
                              ((aga) this).field_w.b((byte) -49, 29, -var6 + ((aga) this).field_x, ((aga) this).field_J);
                              if (var7 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            if (param2 == 4) {
                              break L11;
                            } else {
                              L12: {
                                if (param2 == 1) {
                                  break L12;
                                } else {
                                  if (param2 == 3) {
                                    ((aga) this).field_w.b((byte) -54, 29, ((aga) this).field_x, var6 + ((aga) this).field_J);
                                    if (var7 == 0) {
                                      break L9;
                                    } else {
                                      break L12;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              ((aga) this).field_w.b((byte) -80, 29, ((aga) this).field_x, -var6 + ((aga) this).field_J);
                              if (var7 == 0) {
                                break L9;
                              } else {
                                break L11;
                              }
                            }
                          }
                          ((aga) this).field_w.b((byte) 50, 29, ((aga) this).field_x + var6, ((aga) this).field_J);
                          break L9;
                        }
                        var6++;
                        if (var7 == 0) {
                          continue L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_46_0 = -41;
              stackOut_46_1 = ~((aga) this).field_y;
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              break L6;
            }
            L13: {
              if (stackIn_47_0 == stackIn_47_1) {
                ((aga) this).field_y = 0;
                break L13;
              } else {
                break L13;
              }
            }
            this.a(var4_int, var5, (byte) 17);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var4, "aga.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(boolean param0, int param1) {
        oha var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
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
                var3 = ur.field_e[param1];
                var4 = ((aga) this).b(param1, (byte) 30);
                if (~(var3.field_g - -2) != ~((aga) this).field_K[var4]) {
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
          var3_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3_ref, "aga.Q(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(byte param0, lu param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
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
        RuntimeException decompiledCaughtException = null;
        lu stackOut_11_0 = null;
        lu stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        lu stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              super.a((byte) -74, param1);
              param1.b(((aga) this).field_I, -126);
              param1.b(((aga) this).field_t, -119);
              param1.d(((aga) this).field_D, 0);
              param1.d(((aga) this).field_u, 0);
              param1.d(((aga) this).field_F, 0);
              param1.d(((aga) this).field_x, 0);
              param1.d(((aga) this).field_J, 0);
              param1.d(((aga) this).field_s, 0);
              param1.d(((aga) this).field_y, 0);
              param1.d(((aga) this).field_C, 0);
              param1.d(((aga) this).field_E, 0);
              if (param0 < -21) {
                break L1;
              } else {
                ((aga) this).field_A = true;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (5 <= var3_int) {
                    break L4;
                  } else {
                    param1.d(((aga) this).field_K[var3_int], 0);
                    var3_int++;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                param1.d(((aga) this).field_H, 0);
                break L3;
              }
              L5: {
                stackOut_11_0 = (lu) param1;
                stackIn_14_0 = stackOut_11_0;
                stackIn_12_0 = stackOut_11_0;
                if (!((aga) this).field_A) {
                  stackOut_14_0 = (lu) (Object) stackIn_14_0;
                  stackOut_14_1 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L5;
                } else {
                  stackOut_12_0 = (lu) (Object) stackIn_12_0;
                  stackOut_12_1 = 1;
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_15_1 = stackOut_12_1;
                  break L5;
                }
              }
              ((lu) (Object) stackIn_15_0).d(stackIn_15_1, 0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("aga.AA(").append(param0).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              bl.a(((aga) this).field_o.field_l, 0, ((aga) this).field_k, 0, ((aga) this).field_k.length);
              if (((aga) this).a(84, 0, ((aga) this).field_m)) {
                ((aga) this).field_k[0] = ((aga) this).field_k[0] + 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!((aga) this).a(85, 0, ((aga) this).field_m)) {
                break L2;
              } else {
                ((aga) this).field_k[1] = ((aga) this).field_k[1] + 1;
                break L2;
              }
            }
            L3: {
              if (!((aga) this).a(86, 0, ((aga) this).field_m)) {
                break L3;
              } else {
                ((aga) this).field_k[2] = ((aga) this).field_k[2] + 1;
                break L3;
              }
            }
            L4: {
              if (!((aga) this).a(87, 0, ((aga) this).field_m)) {
                break L4;
              } else {
                ((aga) this).field_k[3] = ((aga) this).field_k[3] + 1;
                break L4;
              }
            }
            L5: {
              if (((aga) this).field_y == 7) {
                ((aga) this).field_k[3] = ((aga) this).field_k[3] - 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (6 == ((aga) this).field_y) {
                ((aga) this).field_k[2] = ((aga) this).field_k[2] - 1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((aga) this).field_y != 5) {
                break L7;
              } else {
                ((aga) this).field_k[1] = ((aga) this).field_k[1] - 1;
                break L7;
              }
            }
            L8: {
              if (((aga) this).field_y == 4) {
                ((aga) this).field_k[0] = ((aga) this).field_k[0] - 1;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (((aga) this).field_y == 18) {
                ((aga) this).field_k[2] = ((aga) this).field_k[2] + 1;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (16 != ((aga) this).field_y) {
                break L10;
              } else {
                ((aga) this).field_k[0] = ((aga) this).field_k[0] + 1;
                break L10;
              }
            }
            L11: {
              if (((aga) this).field_y == 17) {
                ((aga) this).field_k[1] = ((aga) this).field_k[1] + 1;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (((aga) this).field_y != 19) {
                break L12;
              } else {
                ((aga) this).field_k[3] = ((aga) this).field_k[3] + 1;
                break L12;
              }
            }
            L13: {
              if (((aga) this).field_y != 28) {
                break L13;
              } else {
                ((aga) this).field_k[1] = 5;
                break L13;
              }
            }
            L14: {
              L15: {
                if (((aga) this).field_y != 35) {
                  break L15;
                } else {
                  var2_int = 0;
                  L16: while (true) {
                    if (var2_int >= ((aga) this).field_k.length) {
                      break L15;
                    } else {
                      ((aga) this).field_k[var2_int] = 0;
                      var2_int++;
                      if (var3 != 0) {
                        break L14;
                      } else {
                        if (var3 == 0) {
                          continue L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                }
              }
              var2_int = 0;
              break L14;
            }
            L17: while (true) {
              L18: {
                L19: {
                  if (4 <= var2_int) {
                    break L19;
                  } else {
                    stackOut_55_0 = ~((aga) this).field_k[var2_int];
                    stackOut_55_1 = -1;
                    stackIn_69_0 = stackOut_55_0;
                    stackIn_69_1 = stackOut_55_1;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    if (var3 != 0) {
                      break L18;
                    } else {
                      stackOut_56_0 = stackIn_56_0;
                      stackOut_56_1 = stackIn_56_1;
                      stackIn_58_0 = stackOut_56_0;
                      stackIn_58_1 = stackOut_56_1;
                      L20: {
                        if (stackIn_58_0 <= stackIn_58_1) {
                          break L20;
                        } else {
                          ((aga) this).field_k[var2_int] = 0;
                          break L20;
                        }
                      }
                      L21: {
                        if (((aga) this).field_k[var2_int] > 5) {
                          ((aga) this).field_k[var2_int] = 5;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      var2_int++;
                      if (var3 == 0) {
                        continue L17;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
                int discarded$1 = -2;
                this.h();
                stackOut_68_0 = 75;
                stackOut_68_1 = (param0 - -49) / 38;
                stackIn_69_0 = stackOut_68_0;
                stackIn_69_1 = stackOut_68_1;
                break L18;
              }
              var2_int = stackIn_69_0 % stackIn_69_1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "aga.B(" + param0 + ')');
        }
    }

    final boolean i(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = 33 / ((param0 - -7) / 62);
              if (((aga) this).field_I > 0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "aga.S(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    private final void a(int param0, int param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((aga) this).field_w.field_a[((aga) this).field_x][((aga) this).field_J].field_l = null;
            ((aga) this).field_w.field_T.field_i[((aga) this).field_D] = ((aga) this).field_w.field_T.field_i[((aga) this).field_D] + (Math.abs(-param0 + ((aga) this).field_x) - -Math.abs(((aga) this).field_J - param1));
            ((aga) this).field_x = param0;
            ((aga) this).field_J = param1;
            ((aga) this).f(32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var4, "aga.IA(" + param0 + ',' + param1 + ',' + 17 + ')');
        }
    }

    final void b(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 109) {
              var3_int = ((aga) this).field_y;
              if (((aga) this).k(-2049, param1)) {
                L1: {
                  if (var3_int != 32) {
                    break L1;
                  } else {
                    if (32 == ((aga) this).field_y) {
                      break L1;
                    } else {
                      ((aga) this).f(32);
                      break L1;
                    }
                  }
                }
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "aga.HA(" + param0 + ',' + param1 + ')');
        }
    }

    final int g(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_5_0 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var2_int = ((aga) this).field_o.field_b * 74741;
              var2_int = var2_int ^ 37 * (5753 * ((aga) this).field_x - -((aga) this).field_J);
              var2_int = var2_int << 5 | var2_int >>> 27;
              var2_int = var2_int ^ ((aga) this).field_I * 912487 - -(57123 * ((aga) this).field_t);
              var2_int = var2_int << 15 | var2_int >>> 17;
              var2_int = var2_int ^ ((aga) this).field_D * 8676 + 78767 * ((aga) this).field_u;
              if (param0 >= 86) {
                break L1;
              } else {
                ((aga) this).field_v = 3;
                break L1;
              }
            }
            if (!((aga) this).i(-100)) {
              L2: {
                var2_int = var2_int << 1 | var2_int >>> 31;
                if (((aga) this).field_F == 0) {
                  break L2;
                } else {
                  var2_int = var2_int ^ ((aga) this).field_F * 7;
                  var2_int = var2_int >>> 20 | var2_int << 12;
                  break L2;
                }
              }
              L3: {
                if (((aga) this).field_y != 0) {
                  var2_int = var2_int ^ (((aga) this).field_C + 575 * ((aga) this).field_y) * 91911;
                  var2_int = var2_int << 24 | var2_int >>> 8;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (((aga) this).field_y == 37) {
                  var2_int = var2_int ^ 74821 * ((aga) this).field_E;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (0 == ((aga) this).field_H) {
                  break L5;
                } else {
                  var2_int = var2_int ^ 54857 * ((aga) this).field_H;
                  var2_int = var2_int << 19 | var2_int >>> 13;
                  break L5;
                }
              }
              var3 = 0;
              L6: while (true) {
                L7: {
                  L8: {
                    if (var3 >= 5) {
                      break L8;
                    } else {
                      var4 = ((aga) this).field_m[var3];
                      stackOut_21_0 = var4;
                      stackIn_31_0 = stackOut_21_0;
                      stackIn_22_0 = stackOut_21_0;
                      if (var5 != 0) {
                        break L7;
                      } else {
                        L9: {
                          L10: {
                            if (stackIn_22_0 != -1) {
                              break L10;
                            } else {
                              if (var5 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var2_int = var2_int ^ 753 * (var4 + var3 * 1921);
                          break L9;
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_30_0 = var2_int;
                  stackIn_31_0 = stackOut_30_0;
                  break L7;
                }
                break L0;
              }
            } else {
              stackOut_5_0 = var2_int;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "aga.P(" + param0 + ')');
        }
        return stackIn_31_0;
    }

    static {
    }
}
