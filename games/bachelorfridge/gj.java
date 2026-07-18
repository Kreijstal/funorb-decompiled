/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gj extends dfa {
    int field_L;
    int field_db;
    fs field_e;
    jo field_s;
    sfa field_Z;
    private int[] field_v;
    private boolean field_eb;
    int field_u;
    private ng field_W;
    int[] field_T;
    eaa field_fb;
    private int field_B;
    eaa field_j;
    private int field_t;
    static kv field_F;
    int field_U;
    private boolean field_d;
    private sna field_bb;
    private eaa field_X;
    int field_p;
    ad field_P;
    sfa[] field_Y;
    private boolean field_Q;
    private int field_f;
    private pfa field_A;
    boolean field_l;
    ad[][] field_o;
    private int field_H;
    boolean field_m;
    private int field_I;
    boolean field_w;
    int field_g;
    int field_k;
    private int field_R;
    private sna field_C;
    private kv field_x;
    private int field_q;
    ad[] field_G;
    boolean field_J;
    boolean field_r;
    int field_M;
    kj[][] field_D;
    private sna field_z;
    int field_n;
    op field_h;
    boolean field_ab;
    private int field_K;
    int field_V;
    boolean field_cb;
    private int field_N;
    private sna field_O;
    private eaa field_S;
    private int field_i;
    private up field_y;
    private int field_E;

    final void a(ad param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param1 == -52) {
                  break L1;
                } else {
                  ((gj) this).a(-9, (ad) null, -49);
                  break L1;
                }
              }
              L2: {
                ((gj) this).a(param1 + 8007);
                if (((gj) this).field_A != null) {
                  break L2;
                } else {
                  ((gj) this).field_A = new pfa((gj) this, ((gj) this).field_z, param0);
                  break L2;
                }
              }
              ((gj) this).field_A.a(0, param0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("gj.AA(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
    }

    private final void s(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        kj var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_19_0 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~((gj) this).field_h.field_z >= ~var2_int) {
                    break L3;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_20_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      var3 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (~var3 <= ~((gj) this).field_h.field_B) {
                              break L6;
                            } else {
                              var4 = ((gj) this).field_D[var2_int][var3];
                              if (var5 != 0) {
                                break L5;
                              } else {
                                L7: {
                                  if (null == var4) {
                                    break L7;
                                  } else {
                                    if (var4.b(74)) {
                                      ((gj) this).field_D[var2_int][var3] = var4.field_b;
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var3++;
                                if (var5 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var2_int++;
                          break L5;
                        }
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_19_0 = param0;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              }
              L8: {
                if (stackIn_20_0 == 32307) {
                  break L8;
                } else {
                  ((gj) this).field_K = -53;
                  break L8;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) (Object) runtimeException, "gj.I(" + param0 + ')');
        }
    }

    final void m(int param0) {
        try {
            qm.a(param0, 7758);
            ((gj) this).field_l = false;
            lf.field_c = 1;
            ((gj) this).field_J = false;
            ((gj) this).field_ab = false;
            ((gj) this).field_P = null;
            ((gj) this).field_w = false;
            ((gj) this).field_Z = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gj.D(" + param0 + ')');
        }
    }

    final int a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -18254) {
                break L1;
              } else {
                ((gj) this).b(-102, 39);
                break L1;
              }
            }
            stackOut_3_0 = ((gj) this).field_h.field_a[param2][param1].field_n;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var4, "gj.FA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    private final void q(int param0) {
        RuntimeException var2 = null;
        tia var2_ref = null;
        at var3 = null;
        vca var4 = null;
        ad[][] var5 = null;
        int var6 = 0;
        ad[] var7 = null;
        ad[] var8 = null;
        int var9 = 0;
        ad var10 = null;
        int var11 = 0;
        int var12 = 0;
        tia stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_38_0 = 0;
        boolean stackIn_56_0 = false;
        RuntimeException decompiledCaughtException = null;
        tia stackOut_3_0 = null;
        bw stackOut_10_0 = null;
        int stackOut_37_0 = 0;
        boolean stackOut_55_0 = false;
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            this.s(32307);
            var2_ref = (tia) (Object) ((gj) this).field_fb.b((byte) 90);
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_ref == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = (tia) var2_ref;
                    stackIn_11_0 = (Object) (Object) stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (((tia) (Object) stackIn_4_0).a(-59)) {
                          break L4;
                        } else {
                          var2_ref.a(false);
                          break L4;
                        }
                      }
                      var2_ref = (tia) (Object) ((gj) this).field_fb.c(0);
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_10_0 = ((gj) this).field_j.b((byte) 90);
                stackIn_11_0 = (Object) (Object) stackOut_10_0;
                break L2;
              }
              L5: {
                var3 = (at) (Object) stackIn_11_0;
                if (var3 != null) {
                  if (!var3.b(21807)) {
                    break L5;
                  } else {
                    var3.a(false);
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              var4 = (vca) (Object) ((gj) this).field_S.b((byte) 90);
              L6: while (true) {
                L7: {
                  L8: {
                    if (null == var4) {
                      break L8;
                    } else {
                      if (var12 != 0) {
                        break L7;
                      } else {
                        L9: {
                          if (!var4.b(false)) {
                            break L9;
                          } else {
                            var4.a(false);
                            break L9;
                          }
                        }
                        var4 = (vca) (Object) ((gj) this).field_S.c(0);
                        if (var12 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  if (null != ((gj) this).field_o) {
                    break L7;
                  } else {
                    return;
                  }
                }
                var5 = ((gj) this).field_o;
                if (param0 == 17) {
                  var6 = 0;
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (var5.length <= var6) {
                          break L12;
                        } else {
                          var7 = var5[var6];
                          if (var12 != 0) {
                            break L11;
                          } else {
                            L13: {
                              L14: {
                                if (var7 == null) {
                                  break L14;
                                } else {
                                  var8 = var7;
                                  var9 = 0;
                                  L15: while (true) {
                                    stackOut_37_0 = ~var9;
                                    stackIn_38_0 = stackOut_37_0;
                                    L16: while (true) {
                                      if (stackIn_38_0 <= ~var8.length) {
                                        break L14;
                                      } else {
                                        var10 = var8[var9];
                                        if (var12 != 0) {
                                          break L13;
                                        } else {
                                          L17: {
                                            L18: {
                                              if (var10 != null) {
                                                break L18;
                                              } else {
                                                if (var12 == 0) {
                                                  break L17;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                            L19: {
                                              var10.a(104);
                                              var11 = 1;
                                              if (39 != var10.field_s.field_y) {
                                                break L19;
                                              } else {
                                                var11 = 0;
                                                break L19;
                                              }
                                            }
                                            L20: {
                                              if (17 == var10.field_s.field_y) {
                                                var11 = 2;
                                                break L20;
                                              } else {
                                                break L20;
                                              }
                                            }
                                            L21: {
                                              if (28 != var10.field_s.field_y) {
                                                break L21;
                                              } else {
                                                var11 = 3;
                                                break L21;
                                              }
                                            }
                                            L22: while (true) {
                                              var11--;
                                              if (0 > var11) {
                                                break L17;
                                              } else {
                                                var10.field_f.c(11);
                                                stackOut_55_0 = var10.field_f.field_u.field_e;
                                                stackIn_38_0 = stackOut_55_0 ? 1 : 0;
                                                stackIn_56_0 = stackOut_55_0;
                                                if (var12 != 0) {
                                                  continue L16;
                                                } else {
                                                  if (stackIn_56_0) {
                                                    var10.b(false);
                                                    if (var12 == 0) {
                                                      continue L22;
                                                    } else {
                                                      break L17;
                                                    }
                                                  } else {
                                                    continue L22;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var9++;
                                          if (var12 == 0) {
                                            continue L15;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var6++;
                              break L13;
                            }
                            if (var12 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      break L11;
                    }
                    break L0;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.N(" + param0 + ')');
        }
    }

    private final void a(boolean param0, ad param1) {
        aj var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              ((gj) this).m(10);
              if (!param0) {
                break L1;
              } else {
                this.a((rk[]) null, (op) null, -93, 119);
                break L1;
              }
            }
            L2: {
              ((gj) this).field_P = param1;
              if (((gj) this).field_P == null) {
                break L2;
              } else {
                qm.a(33, 7758);
                ((gj) this).field_q = param1.field_s.field_x;
                ((gj) this).field_E = param1.field_s.field_J;
                ((gj) this).field_s.a((byte) -57, param1.field_s.field_J, param1.field_s.field_x);
                var3 = ((gj) this).field_s.a(param1.field_s.field_J, (byte) -91, param1.field_s.field_x);
                ((gj) this).field_W.c(-80 + var3.field_a, -40 + var3.field_c, -40);
                ((gj) this).field_J = true;
                ((gj) this).field_f = 5;
                uca.a(20, (byte) -63);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("gj.A(").append(param0).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final void a(int param0, ad param1, int param2, int param3, ad param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                var6_int = param4.field_s.field_x;
                var7 = param4.field_s.field_J;
                if (param4.field_s.field_y == 43) {
                  var8 = 0;
                  L3: while (true) {
                    if (~param2 >= ~var8) {
                      break L2;
                    } else {
                      stackOut_6_0 = 2;
                      stackOut_6_1 = param3;
                      stackIn_33_0 = stackOut_6_0;
                      stackIn_33_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_7_0 != stackIn_7_1) {
                              break L5;
                            } else {
                              ((gj) this).field_h.b((byte) -76, 29, param4.field_s.field_x - var8, param4.field_s.field_J);
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (param3 != 4) {
                              break L6;
                            } else {
                              ((gj) this).field_h.b((byte) 66, 29, param4.field_s.field_x + var8, param4.field_s.field_J);
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (1 != param3) {
                              break L7;
                            } else {
                              ((gj) this).field_h.b((byte) -122, 29, param4.field_s.field_x, param4.field_s.field_J + -var8);
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (3 == param3) {
                            ((gj) this).field_h.b((byte) -72, 29, param4.field_s.field_x, param4.field_s.field_J - -var8);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var8++;
                        if (var9 == 0) {
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
              stackOut_32_0 = 2;
              stackOut_32_1 = param3;
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              break L1;
            }
            L8: {
              L9: {
                if (stackIn_33_0 == stackIn_33_1) {
                  break L9;
                } else {
                  L10: {
                    if (param3 == 4) {
                      break L10;
                    } else {
                      L11: {
                        if (param3 == 1) {
                          break L11;
                        } else {
                          if (param3 != 3) {
                            break L8;
                          } else {
                            var7 = var7 + param2;
                            if (var9 == 0) {
                              break L8;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      var7 = var7 - param2;
                      if (var9 == 0) {
                        break L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var6_int = var6_int + param2;
                  if (var9 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              var6_int = var6_int - param2;
              break L8;
            }
            L12: {
              if (param0 == 132) {
                break L12;
              } else {
                gj.a((byte) 117, (ema) null);
                break L12;
              }
            }
            L13: {
              if (param4.field_s.field_y != 40) {
                break L13;
              } else {
                param4.field_s.field_y = 0;
                break L13;
              }
            }
            this.a(param4, var7, param1, var6_int, (byte) -97);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var6 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var6;
            stackOut_55_1 = new StringBuilder().append("gj.PB(").append(param0).append(',');
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param1 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L14;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L14;
            }
          }
          L15: {
            stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
            stackOut_59_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_62_0 = stackOut_59_0;
            stackIn_62_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param4 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L15;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L15;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ')');
        }
    }

    private final void a(int param0, kv param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                ((gj) this).field_K = 121;
                break L1;
              }
            }
            ((gj) this).field_S.a((bw) (Object) new vca(param1, 20, 30, 50), true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("gj.DB(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final ad b(aga param0, int param1) {
        ad var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_4_0 = null;
        ad stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        ad stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (param0 == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (ad) (Object) stackIn_4_0;
            } else {
              L1: {
                var3 = ((gj) this).field_o[param0.field_D][param0.field_u];
                if (param1 == -23990) {
                  break L1;
                } else {
                  ((gj) this).field_m = true;
                  break L1;
                }
              }
              stackOut_8_0 = (ad) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("gj.LB(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final void b(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        vca var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_23_0 = null;
        ad stackIn_23_1 = null;
        Object stackIn_63_0 = null;
        ad stackIn_63_1 = null;
        fea stackIn_101_0 = null;
        String stackIn_101_1 = null;
        int stackIn_101_2 = 0;
        int stackIn_101_3 = 0;
        fea stackIn_103_0 = null;
        String stackIn_103_1 = null;
        int stackIn_103_2 = 0;
        int stackIn_103_3 = 0;
        fea stackIn_104_0 = null;
        String stackIn_104_1 = null;
        int stackIn_104_2 = 0;
        int stackIn_104_3 = 0;
        int stackIn_104_4 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_22_0 = null;
        ad stackOut_22_1 = null;
        Object stackOut_62_0 = null;
        ad stackOut_62_1 = null;
        fea stackOut_100_0 = null;
        String stackOut_100_1 = null;
        int stackOut_100_2 = 0;
        int stackOut_100_3 = 0;
        fea stackOut_103_0 = null;
        String stackOut_103_1 = null;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        int stackOut_103_4 = 0;
        fea stackOut_101_0 = null;
        String stackOut_101_1 = null;
        int stackOut_101_2 = 0;
        int stackOut_101_3 = 0;
        int stackOut_101_4 = 0;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              dg.d();
              dg.a(0, 0, 640, i.field_a.field_rb);
              if (param0 >= 29) {
                break L1;
              } else {
                boolean discarded$3 = ((gj) this).a((aga) null, -122);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (0 != ((gj) this).field_h.field_A) {
                    break L4;
                  } else {
                    if (0 == ((gj) this).field_K) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (null == ((gj) this).field_s) {
                    break L5;
                  } else {
                    ((gj) this).field_s.c(-32095);
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    this.g((byte) -86);
                    if (((gj) this).field_M == 0) {
                      break L7;
                    } else {
                      L8: {
                        qn.field_g.e(-qn.field_g.field_q + 640, 0);
                        if (((gj) this).field_n < 0) {
                          break L8;
                        } else {
                          if (((gj) this).field_cb) {
                            break L8;
                          } else {
                            var3_int = (int)(Math.sin((double)dj.field_c.field_L / 10.0 * 0.5) * 5.0);
                            var4 = 1;
                            var5 = 0;
                            L9: while (true) {
                              L10: {
                                if (~var5 <= ~((gj) this).field_G.length) {
                                  break L10;
                                } else {
                                  stackOut_22_0 = null;
                                  stackOut_22_1 = ((gj) this).field_G[var5];
                                  stackIn_63_0 = stackOut_22_0;
                                  stackIn_63_1 = stackOut_22_1;
                                  stackIn_23_0 = stackOut_22_0;
                                  stackIn_23_1 = stackOut_22_1;
                                  if (var6 != 0) {
                                    break L6;
                                  } else {
                                    L11: {
                                      L12: {
                                        if (stackIn_23_0 != (Object) (Object) stackIn_23_1) {
                                          break L12;
                                        } else {
                                          if (var6 == 0) {
                                            break L11;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      if (((gj) this).field_G[var5].field_l) {
                                        break L11;
                                      } else {
                                        var4 = 0;
                                        break L11;
                                      }
                                    }
                                    var5++;
                                    if (var6 == 0) {
                                      continue L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              L13: {
                                if (var4 == 0) {
                                  break L13;
                                } else {
                                  ((gj) this).field_x.e(-8 + (((gj) this).field_C.field_kb + -(var3_int >> -925336095)), -(var3_int >> 851710049) + ((gj) this).field_C.field_rb - 7, var3_int + 16 + ((gj) this).field_C.field_sb, ((gj) this).field_C.field_p + (16 + var3_int), 256);
                                  break L13;
                                }
                              }
                              L14: {
                                ica.field_t.e(574, 64);
                                if (((gj) this).field_C.field_T) {
                                  fla.field_s.e(574, 64);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              int discarded$4 = b.field_t.a(ms.field_q, 580, 41, 40, 30, 0, -1, 1, 0, 10);
                              break L8;
                            }
                          }
                        }
                      }
                      L15: {
                        if (null == ((gj) this).field_G) {
                          break L15;
                        } else {
                          this.g(-1);
                          break L15;
                        }
                      }
                      L16: {
                        if (((gj) this).field_n < 0) {
                          fb.field_r.e(-fb.field_r.field_q + b.field_t.a(pj.field_a) - -20, 5);
                          b.field_t.c(pj.field_a, 5, -8 + b.field_t.field_u, 0, -1);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      if (((gj) this).field_Y == null) {
                        break L7;
                      } else {
                        if (((gj) this).field_Y[0] != null) {
                          this.e((byte) 93);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L17: {
                    if (((gj) this).field_M == 0) {
                      break L17;
                    } else {
                      this.b(-92);
                      break L17;
                    }
                  }
                  L18: {
                    this.g((byte) -63);
                    dg.a(0, 0, 640, i.field_a.field_rb);
                    if (!((gj) this).field_eb) {
                      break L18;
                    } else {
                      ((gj) this).field_O.a(true, 7802);
                      break L18;
                    }
                  }
                  stackOut_62_0 = null;
                  stackOut_62_1 = ((gj) this).field_P;
                  stackIn_63_0 = stackOut_62_0;
                  stackIn_63_1 = stackOut_62_1;
                  break L6;
                }
                L19: {
                  if (stackIn_63_0 == (Object) (Object) stackIn_63_1) {
                    break L19;
                  } else {
                    if (!((gj) this).field_J) {
                      break L19;
                    } else {
                      if (((gj) this).field_P.field_s.field_I <= 0) {
                        break L19;
                      } else {
                        ((gj) this).field_W.a(0, -98, -10);
                        break L19;
                      }
                    }
                  }
                }
                var3_ref = (vca) (Object) ((gj) this).field_S.b((byte) 90);
                L20: while (true) {
                  L21: {
                    L22: {
                      if (var3_ref == null) {
                        break L22;
                      } else {
                        var3_ref.a(240, 320, false);
                        var3_ref = (vca) (Object) ((gj) this).field_S.c(0);
                        if (var6 != 0) {
                          break L21;
                        } else {
                          if (var6 == 0) {
                            continue L20;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                    if (!((gj) this).field_e.field_a) {
                      break L21;
                    } else {
                      L23: {
                        nna.field_w.e(0, -nna.field_w.field_p + i.field_a.field_rb);
                        var4 = 16776960;
                        if (wma.field_b <= 0) {
                          break L23;
                        } else {
                          if (((gj) this).field_L % 40 <= 20) {
                            break L23;
                          } else {
                            var4 = 16711680;
                            break L23;
                          }
                        }
                      }
                      ej.a(38, var4, pn.field_e, true, 12 + (-nna.field_w.field_p + i.field_a.field_rb - -jha.field_g.field_u), -100);
                      break L21;
                    }
                  }
                  if (var6 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L24: {
                L25: {
                  if (((gj) this).field_n >= 0) {
                    break L25;
                  } else {
                    ew.field_r.e(120, 100);
                    int discarded$5 = jha.field_g.a(cba.field_b, 230, 160, 200, 200, 16777215, -1, 1, 0, 14);
                    if (var6 == 0) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
                ((gj) this).field_y.a(65793);
                break L24;
              }
              if (null == ((gj) this).field_A) {
                break L2;
              } else {
                ((gj) this).field_A.a(false);
                break L2;
              }
            }
            L26: {
              if (hea.field_r >= 2) {
                L27: {
                  var3_int = ((gj) this).field_h.c((byte) -10);
                  jha.field_g.a("Client: " + Integer.toHexString(var3_int), 320, 20, 8421631, -1);
                  jha.field_g.a("Server: " + Integer.toHexString(((gj) this).field_g), 320, 40, 8421504, -1);
                  var4 = var3_int ^ ((gj) this).field_g;
                  stackOut_100_0 = jha.field_g;
                  stackOut_100_1 = "Diff: " + Integer.toHexString(var4);
                  stackOut_100_2 = 320;
                  stackOut_100_3 = 60;
                  stackIn_103_0 = stackOut_100_0;
                  stackIn_103_1 = stackOut_100_1;
                  stackIn_103_2 = stackOut_100_2;
                  stackIn_103_3 = stackOut_100_3;
                  stackIn_101_0 = stackOut_100_0;
                  stackIn_101_1 = stackOut_100_1;
                  stackIn_101_2 = stackOut_100_2;
                  stackIn_101_3 = stackOut_100_3;
                  if (var4 == 0) {
                    stackOut_103_0 = (fea) (Object) stackIn_103_0;
                    stackOut_103_1 = (String) (Object) stackIn_103_1;
                    stackOut_103_2 = stackIn_103_2;
                    stackOut_103_3 = stackIn_103_3;
                    stackOut_103_4 = 8421504;
                    stackIn_104_0 = stackOut_103_0;
                    stackIn_104_1 = stackOut_103_1;
                    stackIn_104_2 = stackOut_103_2;
                    stackIn_104_3 = stackOut_103_3;
                    stackIn_104_4 = stackOut_103_4;
                    break L27;
                  } else {
                    stackOut_101_0 = (fea) (Object) stackIn_101_0;
                    stackOut_101_1 = (String) (Object) stackIn_101_1;
                    stackOut_101_2 = stackIn_101_2;
                    stackOut_101_3 = stackIn_101_3;
                    stackOut_101_4 = 16711680;
                    stackIn_104_0 = stackOut_101_0;
                    stackIn_104_1 = stackOut_101_1;
                    stackIn_104_2 = stackOut_101_2;
                    stackIn_104_3 = stackOut_101_3;
                    stackIn_104_4 = stackOut_101_4;
                    break L27;
                  }
                }
                ((fea) (Object) stackIn_104_0).a(stackIn_104_1, stackIn_104_2, stackIn_104_3, stackIn_104_4, -1);
                break L26;
              } else {
                break L26;
              }
            }
            L28: {
              dg.c();
              if (((gj) this).field_d) {
                this.f(8910);
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (null != ((gj) this).field_A) {
                ((gj) this).field_A.a(false);
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (af.field_a) {
                kla.b(true);
                break L30;
              } else {
                break L30;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "gj.L(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(boolean param0) {
        RuntimeException var2 = null;
        Object stackIn_1_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        try {
          L0: {
            L1: {
              stackOut_0_0 = this;
              stackIn_3_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (((gj) this).field_h.field_N) {
                stackOut_3_0 = this;
                stackOut_3_1 = 2;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_1_0 = this;
                stackOut_1_1 = 1;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              ((gj) this).field_M = stackIn_4_1;
              uca.a(23, (byte) -54);
              if (((gj) this).field_h.field_e <= 0) {
                uca.a(29, (byte) 111);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ((gj) this).d((byte) 52);
              if (!param0) {
                break L3;
              } else {
                sfa discarded$2 = ((gj) this).b((ad) null, false);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.SA(" + param0 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        uea var4 = null;
        if (param0 != 30996) {
            return;
        }
        try {
            ((gj) this).field_h.field_a[param1][param2].field_m = true;
            var4 = new uea((gj) this, param1, param2, 16711680);
            ((kj) (Object) var4).a(0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gj.UA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean a(ad param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (((gj) this).field_h.field_o == 3) {
              if (((gj) this).field_h.a((byte) -124, param0.field_s.field_D, param0.field_s.field_x, param0.field_s.field_J)) {
                L1: {
                  if (param1) {
                    break L1;
                  } else {
                    ((gj) this).n(-89);
                    break L1;
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("gj.EB(");
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void d(int param0) {
        RuntimeException var2 = null;
        ad var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        t var8 = null;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var2_ref = ((gj) this).field_G[((gj) this).field_Z.field_h.field_f];
              ((gj) this).field_H = ((gj) this).field_s.field_h;
              ((gj) this).field_N = ((gj) this).field_s.field_s;
              if (0 > ((gj) this).field_N) {
                break L1;
              } else {
                if (~((gj) this).field_h.field_z >= ~((gj) this).field_N) {
                  break L1;
                } else {
                  if (((gj) this).field_H < 0) {
                    break L1;
                  } else {
                    if (((gj) this).field_h.field_B <= ((gj) this).field_H) {
                      break L1;
                    } else {
                      L2: {
                        L3: {
                          var3 = 124 % ((-58 - param0) / 54);
                          var4 = var2_ref.field_s.field_x;
                          var5 = var2_ref.field_s.field_J;
                          var6 = un.a(126, ((gj) this).field_H + -var5, ((gj) this).field_N - var4);
                          var7 = 0;
                          if (((gj) this).field_N - var4 == 0) {
                            break L3;
                          } else {
                            L4: {
                              if (0 != -var5 + ((gj) this).field_H) {
                                break L4;
                              } else {
                                var7 = Math.abs(((gj) this).field_N - var4);
                                if (var9 == 0) {
                                  break L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var7 = 255;
                            if (var9 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var7 = Math.abs(-var5 + ((gj) this).field_H);
                        break L2;
                      }
                      L5: {
                        L6: {
                          var8 = (t) (Object) al.a(-98, ((gj) this).field_P.field_s.field_o.field_g.field_b[((gj) this).field_P.field_s.field_m[((gj) this).field_db]]);
                          if (var7 < var8.field_w) {
                            break L6;
                          } else {
                            if (~var2_ref.field_s.c(87, ((gj) this).field_P.field_s.field_o.field_g.field_b[((gj) this).field_P.field_s.field_m[((gj) this).field_db]]) > ~var7) {
                              break L6;
                            } else {
                              L7: {
                                L8: {
                                  if (var8.field_j == 80) {
                                    break L8;
                                  } else {
                                    if (var8.field_j != 81) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                if (((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_l == null) {
                                  break L7;
                                } else {
                                  ((gj) this).m(10);
                                  lf.field_c = 0;
                                  ((gj) this).field_f = 5;
                                  return;
                                }
                              }
                              L9: {
                                if (var8.field_p == 2) {
                                  var7++;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              L10: {
                                if (var8.field_p == 3) {
                                  var7++;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              L11: {
                                if (0 == var6) {
                                  break L11;
                                } else {
                                  ((gj) this).field_P.field_s.field_s = var6;
                                  break L11;
                                }
                              }
                              ((hia) (Object) ((gj) this).field_Z).field_j = var6;
                              ((hia) (Object) ((gj) this).field_Z).field_k = var7 - 1;
                              this.k(-1);
                              ((gj) this).field_ab = false;
                              uca.a(25, (byte) 114);
                              if (var9 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        ((gj) this).m(10);
                        break L5;
                      }
                      lf.field_c = 0;
                      ((gj) this).field_f = 5;
                      break L0;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.W(" + param0 + ')');
        }
    }

    private final boolean i(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 > 76) {
                break L1;
              } else {
                ad discarded$2 = ((gj) this).a(28, (ad) null);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (((gj) this).field_h.field_z <= var2_int) {
                    break L4;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_19_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      var3 = stackIn_7_0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (var3 >= ((gj) this).field_h.field_B) {
                              break L7;
                            } else {
                              if (var4 != 0) {
                                break L6;
                              } else {
                                if (null == ((gj) this).field_D[var2_int][var3]) {
                                  var3++;
                                  if (var4 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                } else {
                                  stackOut_13_0 = 1;
                                  stackIn_14_0 = stackOut_13_0;
                                  return stackIn_14_0 != 0;
                                }
                              }
                            }
                          }
                          var2_int++;
                          break L6;
                        }
                        if (var4 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.Q(" + param0 + ')');
        }
        return stackIn_19_0 != 0;
    }

    private final void e(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        sfa var3 = null;
        oha var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 > 90) {
              L1: {
                L2: {
                  if (((gj) this).field_K <= 0) {
                    break L2;
                  } else {
                    if (((gj) this).field_Y[0] != null) {
                      var2_int = 0;
                      L3: while (true) {
                        if (var2_int >= ((gj) this).field_Y.length) {
                          break L2;
                        } else {
                          var3 = ((gj) this).field_Y[var2_int];
                          if (var9 != 0) {
                            break L1;
                          } else {
                            L4: {
                              if (var3 != null) {
                                break L4;
                              } else {
                                if (var9 == 0) {
                                  break L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L5: {
                              var4 = al.a(-110, var3.field_g);
                              hh.field_b[var4.field_h].e(var3.field_h.field_f * 39 + 16, 28);
                              if (hh.field_b[var4.field_h].a(39 * var3.field_h.field_f + 16, 28, mk.field_p, gd.field_m)) {
                                var5 = 640;
                                var6 = 480;
                                var7 = 4 + mk.field_p;
                                var8 = gd.field_m + 4;
                                sd.a(((gj) this).field_G[var3.field_h.field_f].field_s.a(var4, -5313), var7, var4, (byte) 74, var8, var5, var6);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var2_int++;
                            if (var9 == 0) {
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
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.MB(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ib stackIn_42_0 = null;
        ib stackIn_60_0 = null;
        RuntimeException decompiledCaughtException = null;
        ib stackOut_41_0 = null;
        ib stackOut_58_0 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = 0;
                if (~((gj) this).field_h.field_J < ~((gj) this).field_h.field_A) {
                  break L2;
                } else {
                  var2_int = Math.max(ad.field_h.a(cd.field_o[((gj) this).field_h.field_o + -1]), ad.field_h.a(tw.field_b));
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2_int = ad.field_h.a(cd.field_o[((gj) this).field_h.field_o + -1]);
              break L1;
            }
            L3: {
              L4: {
                dg.a(635 + (-var2_int - 10), -eja.field_w.field_p + i.field_a.field_rb - 26, var2_int - -20, 32, 7, 65793, 128);
                if (~((gj) this).field_h.field_J >= ~((gj) this).field_h.field_A) {
                  break L4;
                } else {
                  ad.field_h.b(lga.a(true, new String[2], eb.field_q), 630, -12 + i.field_a.field_rb - eja.field_w.field_p, 0, -1);
                  if (var7 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ad.field_h.b(tw.field_b, 630, i.field_a.field_rb + -eja.field_w.field_p + -12, 0, -1);
              break L3;
            }
            L5: {
              if (param0 <= -61) {
                break L5;
              } else {
                sfa discarded$1 = ((gj) this).b((ad) null, true);
                break L5;
              }
            }
            ad.field_h.b(cd.field_o[-1 + ((gj) this).field_h.field_o], 630, -eja.field_w.field_p + i.field_a.field_rb, 0, -1);
            var3 = -(((gj) this).field_h.field_d * 132) + 592;
            eja.field_w.e(var3, 4 + -eja.field_w.field_p + i.field_a.field_rb);
            var4 = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if (~var4 <= ~((gj) this).field_h.field_d) {
                    break L8;
                  } else {
                    var5 = var4 * 132 + 40;
                    b.field_t.a(((gj) this).field_h.field_y[var4], var3 + (var5 + 67), 10 + -eja.field_w.field_p + (i.field_a.field_rb - -12), var4 + 2, -1);
                    dg.a(7 + (var3 + var5), 14 + -eja.field_w.field_p + i.field_a.field_rb + 10, 130, 16, 7, 65793, 128);
                    if (var7 != 0) {
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          L11: {
                            L12: {
                              L13: {
                                L14: {
                                  if (((gj) this).field_h.field_o == 1) {
                                    break L14;
                                  } else {
                                    L15: {
                                      if (((gj) this).field_h.field_o != 2) {
                                        break L15;
                                      } else {
                                        var6 = 0;
                                        L16: while (true) {
                                          L17: {
                                            if (var6 >= ((gj) this).field_T[var4]) {
                                              break L17;
                                            } else {
                                              sj.field_k[0].a(10 + var5 + var3 - -(var6 * 14), -eja.field_w.field_p + i.field_a.field_rb + 22);
                                              var6++;
                                              if (var7 != 0) {
                                                break L13;
                                              } else {
                                                if (var7 == 0) {
                                                  continue L16;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                          }
                                          if (var7 == 0) {
                                            break L13;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                    if (3 != ((gj) this).field_h.field_o) {
                                      break L13;
                                    } else {
                                      var6 = 0;
                                      L18: while (true) {
                                        L19: {
                                          if (~var6 <= ~((gj) this).field_h.field_C[var4]) {
                                            break L19;
                                          } else {
                                            ela.field_j[0].a(var6 * 14 + var3 + (var5 + 10), 12 + i.field_a.field_rb + (-eja.field_w.field_p + 10));
                                            var6++;
                                            if (var7 != 0) {
                                              break L13;
                                            } else {
                                              if (var7 == 0) {
                                                continue L18;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                        }
                                        if (var7 == 0) {
                                          break L13;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                }
                                var6 = 0;
                                L20: while (true) {
                                  if (7 <= var6) {
                                    break L13;
                                  } else {
                                    stackOut_41_0 = ((gj) this).field_h.field_S[var4];
                                    stackIn_60_0 = stackOut_41_0;
                                    stackIn_42_0 = stackOut_41_0;
                                    if (var7 != 0) {
                                      break L12;
                                    } else {
                                      L21: {
                                        if (stackIn_42_0.field_b[var6] == null) {
                                          break L21;
                                        } else {
                                          L22: {
                                            if (((gj) this).field_h.field_S[var4].field_b[var6].i(-124)) {
                                              kn.field_g.c(18 * var6 + (var3 + var5 - -12), 27 + -eja.field_w.field_p + i.field_a.field_rb, kn.field_g.field_q >> -1849158335, kn.field_g.field_p >> -1649755039, 192);
                                              if (var7 == 0) {
                                                break L21;
                                              } else {
                                                break L22;
                                              }
                                            } else {
                                              break L22;
                                            }
                                          }
                                          ((gj) this).field_o[var4][var6].field_f.a(1024, 10 + (-eja.field_w.field_p + i.field_a.field_rb + -12), 256, 8, 1024, 18 * var6 + var3 + var5 - 20);
                                          break L21;
                                        }
                                      }
                                      var6++;
                                      if (var7 == 0) {
                                        continue L20;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              if (((gj) this).field_h.a((byte) -60, var4)) {
                                break L10;
                              } else {
                                if (((gj) this).field_h.b((byte) 106, var4)) {
                                  break L11;
                                } else {
                                  stackOut_58_0 = ((gj) this).field_h.field_S[var4];
                                  stackIn_60_0 = stackOut_58_0;
                                  break L12;
                                }
                              }
                            }
                            if (stackIn_60_0.field_c) {
                              b.field_t.a(cf.field_a, 72 + (-5 + var3 + var5), 50 + (i.field_a.field_rb + -eja.field_w.field_p), 0, -1);
                              if (var7 == 0) {
                                break L9;
                              } else {
                                break L11;
                              }
                            } else {
                              break L9;
                            }
                          }
                          b.field_t.a(cka.field_w, 72 + (-5 + var5 - -var3), 26 + (-eja.field_w.field_p + (i.field_a.field_rb + 24)), 0, -1);
                          if (var7 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                        b.field_t.a(lga.a(true, new String[1], ts.field_p), 72 + var3 + (var5 - 5), 50 + i.field_a.field_rb - eja.field_w.field_p, 0, -1);
                        break L9;
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
                break L7;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.E(" + param0 + ')');
        }
    }

    private final void a(int param0, rk[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              ((gj) this).field_z = mka.a(13558251, param0, 13558251, (byte) -128, (po) (Object) jha.field_g, 13558251, 16777215, 13558251);
              ((gj) this).field_z.field_db = op.field_I;
              ((gj) this).field_z.field_eb = wd.field_w;
              ((gj) this).field_z.field_A = bla.field_p;
              ((gj) this).field_z.field_N = 1;
              ((gj) this).field_z.field_B = 12;
              ((gj) this).field_W = new ng((gj) this, ((gj) this).field_z);
              if (null == param1) {
                break L1;
              } else {
                ((gj) this).field_y = new up((gj) this, ((gj) this).field_z, param1);
                break L1;
              }
            }
            ((gj) this).field_C = new sna("endturn", ((gj) this).field_z, 574, 64, 50, 24, ms.field_q);
            ((gj) this).field_O = new sna("cancelorder", (sna) null, 15, 125, 32, 32, "");
            ((gj) this).field_O.field_v = hh.field_b[2];
            ((gj) this).field_bb = new sna("abortorder", (sna) null, 15, 125, 16, 16, "");
            ((gj) this).field_bb.field_v = fe.field_j;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("gj.JB(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    private final void a(boolean param0, byte param1, gm param2, int param3) {
        RuntimeException var5 = null;
        gm stackIn_4_0 = null;
        gm stackIn_6_0 = null;
        gm stackIn_8_0 = null;
        gm stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        gm stackIn_11_0 = null;
        gm stackIn_13_0 = null;
        gm stackIn_15_0 = null;
        gm stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        gm stackOut_3_0 = null;
        gm stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        gm stackOut_4_0 = null;
        gm stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        gm stackOut_10_0 = null;
        gm stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        gm stackOut_11_0 = null;
        gm stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (param1 == -88) {
              L1: {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    L3: {
                      stackOut_3_0 = (gm) param2;
                      stackIn_8_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (param3 <= 0) {
                        stackOut_8_0 = (gm) (Object) stackIn_8_0;
                        stackOut_8_1 = 1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        break L3;
                      } else {
                        stackOut_4_0 = (gm) (Object) stackIn_4_0;
                        stackIn_6_0 = stackOut_4_0;
                        stackOut_6_0 = (gm) (Object) stackIn_6_0;
                        stackOut_6_1 = 3;
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        break L3;
                      }
                    }
                    stackIn_9_0.field_i = stackIn_9_1;
                    if (BachelorFridge.field_y == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  stackOut_10_0 = (gm) param2;
                  stackIn_15_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (param3 <= 0) {
                    stackOut_15_0 = (gm) (Object) stackIn_15_0;
                    stackOut_15_1 = 2;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    break L4;
                  } else {
                    stackOut_11_0 = (gm) (Object) stackIn_11_0;
                    stackIn_13_0 = stackOut_11_0;
                    stackOut_13_0 = (gm) (Object) stackIn_13_0;
                    stackOut_13_1 = 4;
                    stackIn_16_0 = stackOut_13_0;
                    stackIn_16_1 = stackOut_13_1;
                    break L4;
                  }
                }
                stackIn_16_0.field_i = stackIn_16_1;
                break L1;
              }
              param2.field_l = Math.abs(param3);
              ((gj) this).field_P.field_s.field_s = param2.field_i;
              this.k(-1);
              ((gj) this).field_l = false;
              uca.a(21, (byte) 122);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("gj.TA(").append(param0).append(',').append(param1).append(',');
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
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param3 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        cj var3_ref = null;
        at var4_ref_at = null;
        int var4 = 0;
        int var5 = 0;
        eaa stackIn_43_0 = null;
        at stackIn_43_1 = null;
        eaa stackIn_45_0 = null;
        at stackIn_45_1 = null;
        eaa stackIn_46_0 = null;
        at stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        int stackIn_92_0 = 0;
        Object stackIn_100_0 = null;
        Object stackIn_102_0 = null;
        Object stackIn_104_0 = null;
        Object stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        RuntimeException decompiledCaughtException = null;
        eaa stackOut_42_0 = null;
        at stackOut_42_1 = null;
        eaa stackOut_45_0 = null;
        at stackOut_45_1 = null;
        int stackOut_45_2 = 0;
        eaa stackOut_43_0 = null;
        at stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        int stackOut_91_0 = 0;
        int stackOut_89_0 = 0;
        Object stackOut_99_0 = null;
        Object stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        Object stackOut_100_0 = null;
        Object stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (3 == kaa.field_m) {
                break L1;
              } else {
                if (kaa.field_m == -5) {
                  break L1;
                } else {
                  L2: {
                    if (af.field_a) {
                      ic.a(69);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (((gj) this).field_e.field_a) {
                      ((gj) this).field_p = ((gj) this).field_p - 1;
                      ((gj) this).field_u = ((gj) this).field_u - 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (null != ((gj) this).field_s) {
                      ((gj) this).field_s.b((byte) 81);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (!param1) {
                      break L5;
                    } else {
                      boolean discarded$1 = ((gj) this).h((byte) 126);
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      this.q(17);
                      if (((gj) this).field_h.field_A == 0) {
                        break L7;
                      } else {
                        L8: {
                          if (!((gj) this).field_h.field_r) {
                            break L8;
                          } else {
                            if (null == ((gj) this).field_h.field_p) {
                              break L8;
                            } else {
                              if (((gj) this).field_Q) {
                                break L8;
                              } else {
                                ((gj) this).field_X.a((bw) (Object) ((gj) this).field_h.field_p, true);
                                ((gj) this).field_Q = true;
                                break L8;
                              }
                            }
                          }
                        }
                        L9: {
                          if (!((gj) this).field_j.e(12917)) {
                            break L9;
                          } else {
                            if (!((gj) this).field_fb.e(12917)) {
                              break L9;
                            } else {
                              L10: {
                                if (((gj) this).field_X.e(12917)) {
                                  break L10;
                                } else {
                                  L11: {
                                    var3_ref = (cj) (Object) ((gj) this).field_X.a(false);
                                    var4_ref_at = var3_ref.a(5, (gj) this);
                                    stackOut_42_0 = ((gj) this).field_j;
                                    stackOut_42_1 = (at) var4_ref_at;
                                    stackIn_45_0 = stackOut_42_0;
                                    stackIn_45_1 = stackOut_42_1;
                                    stackIn_43_0 = stackOut_42_0;
                                    stackIn_43_1 = stackOut_42_1;
                                    if (param1) {
                                      stackOut_45_0 = (eaa) (Object) stackIn_45_0;
                                      stackOut_45_1 = (at) (Object) stackIn_45_1;
                                      stackOut_45_2 = 0;
                                      stackIn_46_0 = stackOut_45_0;
                                      stackIn_46_1 = stackOut_45_1;
                                      stackIn_46_2 = stackOut_45_2;
                                      break L11;
                                    } else {
                                      stackOut_43_0 = (eaa) (Object) stackIn_43_0;
                                      stackOut_43_1 = (at) (Object) stackIn_43_1;
                                      stackOut_43_2 = 1;
                                      stackIn_46_0 = stackOut_43_0;
                                      stackIn_46_1 = stackOut_43_1;
                                      stackIn_46_2 = stackOut_43_2;
                                      break L11;
                                    }
                                  }
                                  ((eaa) (Object) stackIn_46_0).a((bw) (Object) stackIn_46_1, stackIn_46_2 != 0);
                                  if (var5 == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (!this.i(108)) {
                                L12: {
                                  if (!((gj) this).field_h.field_r) {
                                    break L12;
                                  } else {
                                    ((gj) this).e(-122);
                                    break L12;
                                  }
                                }
                                ((gj) this).field_e.d((byte) -16);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        ((gj) this).field_L = ((gj) this).field_L + 1;
                        if (!param0) {
                          return;
                        } else {
                          L13: {
                            var3_int = 1;
                            if (!((gj) this).field_e.field_a) {
                              break L13;
                            } else {
                              L14: {
                                L15: {
                                  L16: {
                                    L17: {
                                      if (!vs.field_d) {
                                        break L17;
                                      } else {
                                        if (lna.field_q) {
                                          break L16;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    if (!lb.g((byte) -59)) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                  var3_int = 0;
                                  if (var5 == 0) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                                if (mk.field_p <= 0) {
                                  break L14;
                                } else {
                                  if (~mk.field_p <= ~nna.field_w.field_q) {
                                    break L14;
                                  } else {
                                    if (~(i.field_a.field_rb + -nna.field_w.field_p) <= ~gd.field_m) {
                                      break L14;
                                    } else {
                                      if (~i.field_a.field_rb >= ~gd.field_m) {
                                        break L14;
                                      } else {
                                        if (lf.field_c == 1) {
                                          L18: {
                                            if (wj.field_g) {
                                              stackOut_91_0 = 0;
                                              stackIn_92_0 = stackOut_91_0;
                                              break L18;
                                            } else {
                                              stackOut_89_0 = 1;
                                              stackIn_92_0 = stackOut_89_0;
                                              break L18;
                                            }
                                          }
                                          wj.field_g = stackIn_92_0 != 0;
                                          lf.field_c = 0;
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (!wj.field_g) {
                                break L13;
                              } else {
                                var3_int = 0;
                                break L13;
                              }
                            }
                          }
                          L19: {
                            L20: {
                              if (((gj) this).field_M == 1) {
                                break L20;
                              } else {
                                if (((gj) this).field_M != 2) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            L21: {
                              stackOut_99_0 = this;
                              stackIn_104_0 = stackOut_99_0;
                              stackIn_100_0 = stackOut_99_0;
                              if (param1) {
                                stackOut_104_0 = this;
                                stackOut_104_1 = 0;
                                stackIn_105_0 = stackOut_104_0;
                                stackIn_105_1 = stackOut_104_1;
                                break L21;
                              } else {
                                stackOut_100_0 = this;
                                stackIn_102_0 = stackOut_100_0;
                                stackOut_102_0 = this;
                                stackOut_102_1 = 1;
                                stackIn_105_0 = stackOut_102_0;
                                stackIn_105_1 = stackOut_102_1;
                                break L21;
                              }
                            }
                            this.d(stackIn_105_1 != 0);
                            break L19;
                          }
                          L22: {
                            if (0 != ((gj) this).field_M) {
                              break L22;
                            } else {
                              ((gj) this).field_P = null;
                              break L22;
                            }
                          }
                          L23: {
                            if (((gj) this).field_s == null) {
                              break L23;
                            } else {
                              if (!((gj) this).field_fb.e(12917)) {
                                break L23;
                              } else {
                                if (!((gj) this).field_j.e(12917)) {
                                  break L23;
                                } else {
                                  L24: {
                                    var4 = 0;
                                    if (var3_int == 0) {
                                      break L24;
                                    } else {
                                      L25: {
                                        L26: {
                                          if (wga.field_q[98]) {
                                            break L26;
                                          } else {
                                            if (wga.field_q[sm.field_r]) {
                                              break L26;
                                            } else {
                                              break L25;
                                            }
                                          }
                                        }
                                        ((gj) this).field_s.a(0, 8, 2962);
                                        var4 = 1;
                                        break L25;
                                      }
                                      L27: {
                                        L28: {
                                          if (wga.field_q[99]) {
                                            break L28;
                                          } else {
                                            if (wga.field_q[rq.field_g]) {
                                              break L28;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                        var4 = 1;
                                        ((gj) this).field_s.a(0, -8, 2962);
                                        break L27;
                                      }
                                      L29: {
                                        L30: {
                                          if (wga.field_q[96]) {
                                            break L30;
                                          } else {
                                            if (wga.field_q[oq.field_a]) {
                                              break L30;
                                            } else {
                                              break L29;
                                            }
                                          }
                                        }
                                        var4 = 1;
                                        ((gj) this).field_s.a(8, 0, 2962);
                                        break L29;
                                      }
                                      L31: {
                                        if (wga.field_q[97]) {
                                          break L31;
                                        } else {
                                          if (wga.field_q[vk.field_s]) {
                                            break L31;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                      ((gj) this).field_s.a(-8, 0, 2962);
                                      var4 = 1;
                                      break L24;
                                    }
                                  }
                                  L32: {
                                    if (nd.field_h != 4) {
                                      break L32;
                                    } else {
                                      ((gj) this).field_s.a(mk.field_p + -((gj) this).field_R, gd.field_m - ((gj) this).field_t, 2962);
                                      ((gj) this).field_t = gd.field_m;
                                      var4 = 1;
                                      ((gj) this).field_R = mk.field_p;
                                      break L32;
                                    }
                                  }
                                  if (var4 != 0) {
                                    uca.a(40, (byte) -126);
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                          }
                          L33: {
                            if (((gj) this).field_f > 0) {
                              ((gj) this).field_f = ((gj) this).field_f - 1;
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                          if (var5 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    L34: {
                      if (((gj) this).field_A != null) {
                        if (((gj) this).field_A.a(-214844415)) {
                          break L34;
                        } else {
                          ((gj) this).field_A = null;
                          break L34;
                        }
                      } else {
                        break L34;
                      }
                    }
                    if (((gj) this).field_n >= 0) {
                      ((gj) this).field_y.a((byte) 108);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "gj.IA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, ad param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              var4_int = param1.field_s.a(32, (byte) 109) ? 1 : 0;
              boolean discarded$5 = param1.field_s.k(-2049, param2);
              param1.a(24831, 45, kna.field_g[param2]);
              if (param0 == -16007) {
                break L1;
              } else {
                ((gj) this).field_g = -44;
                break L1;
              }
            }
            L2: {
              if (var4_int == 0) {
                break L2;
              } else {
                if (!param1.field_s.a(32, (byte) -110)) {
                  ((gj) this).b(param1, (ad) null, true);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("gj.V(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ')');
        }
    }

    private final void k(int param0) {
        RuntimeException runtimeException = null;
        int[] var2 = null;
        int var3 = 0;
        sfa var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            qm.a(10, 7758);
            int fieldTemp$2 = ((gj) this).field_U;
            ((gj) this).field_U = ((gj) this).field_U + 1;
            ((gj) this).field_Y[fieldTemp$2] = ((gj) this).field_Z;
            ((gj) this).field_G[((gj) this).field_Z.field_h.field_f].field_l = true;
            ((gj) this).field_w = false;
            ((gj) this).field_P = null;
            ((gj) this).field_ab = false;
            ((gj) this).field_l = false;
            ((gj) this).field_Z = null;
            ((gj) this).field_J = false;
            var2 = new int[7];
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 >= 7) {
                    break L3;
                  } else {
                    var4 = ((gj) this).field_Y[var3];
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (var4 != null) {
                            break L5;
                          } else {
                            var2[var3] = 2147483646;
                            if (var5 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var2[var3] = -((gj) this).field_G[var4.field_h.field_f].field_s.field_v;
                        break L4;
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
                L6: {
                  if (param0 == -1) {
                    break L6;
                  } else {
                    ((gj) this).field_x = null;
                    break L6;
                  }
                }
                dk.a((Object[]) (Object) ((gj) this).field_Y, (byte) 94, var2);
                ((gj) this).field_f = 5;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) (Object) runtimeException, "gj.RB(" + param0 + ')');
        }
    }

    private final boolean r(int param0) {
        RuntimeException var2 = null;
        hd var2_ref = null;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_68_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_72_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                this.a(28, (rk[]) null);
                break L1;
              }
            }
            var2_ref = (hd) (Object) ur.field_e[((gj) this).field_Z.field_g];
            if (var2_ref.c(0) == 0) {
              L2: {
                if (var2_ref.field_j != 130) {
                  break L2;
                } else {
                  L3: {
                    if (((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_l != null) {
                      break L3;
                    } else {
                      if (!((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].e(-123)) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_68_0 = 0;
                  stackIn_69_0 = stackOut_68_0;
                  return stackIn_69_0 != 0;
                }
              }
              stackOut_70_0 = 1;
              stackIn_71_0 = stackOut_70_0;
              return stackIn_71_0 != 0;
            } else {
              if (var2_ref.c(0) == 1) {
                stackOut_57_0 = 1;
                stackIn_58_0 = stackOut_57_0;
                return stackIn_58_0 != 0;
              } else {
                L4: {
                  if (var2_ref.c(0) != 3) {
                    if (var2_ref.c(0) != 2) {
                      break L4;
                    } else {
                      L5: {
                        if (((gj) this).field_N != ((gj) this).field_P.field_s.field_x - -1) {
                          break L5;
                        } else {
                          if (((gj) this).field_P.field_s.field_J != ((gj) this).field_H) {
                            break L5;
                          } else {
                            stackOut_35_0 = 1;
                            stackIn_36_0 = stackOut_35_0;
                            return stackIn_36_0 != 0;
                          }
                        }
                      }
                      L6: {
                        if (((gj) this).field_N != -1 + ((gj) this).field_P.field_s.field_x) {
                          break L6;
                        } else {
                          if (~((gj) this).field_P.field_s.field_J != ~((gj) this).field_H) {
                            break L6;
                          } else {
                            stackOut_41_0 = 1;
                            stackIn_42_0 = stackOut_41_0;
                            return stackIn_42_0 != 0;
                          }
                        }
                      }
                      L7: {
                        if (~((gj) this).field_P.field_s.field_x != ~((gj) this).field_N) {
                          break L7;
                        } else {
                          if (~(1 + ((gj) this).field_P.field_s.field_J) == ~((gj) this).field_H) {
                            stackOut_55_0 = 1;
                            stackIn_56_0 = stackOut_55_0;
                            return stackIn_56_0 != 0;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (((gj) this).field_P.field_s.field_x != ((gj) this).field_N) {
                        break L4;
                      } else {
                        if (~((gj) this).field_H != ~(((gj) this).field_P.field_s.field_J - 1)) {
                          break L4;
                        } else {
                          stackOut_53_0 = 1;
                          stackIn_54_0 = stackOut_53_0;
                          return stackIn_54_0 != 0;
                        }
                      }
                    }
                  } else {
                    L8: {
                      if (93 != var2_ref.field_j) {
                        break L8;
                      } else {
                        if (((gj) this).field_h.c(((gj) this).field_N, ((gj) this).field_H, -123) == null) {
                          break L8;
                        } else {
                          if (((gj) this).field_h.c(((gj) this).field_N, ((gj) this).field_H, 127).field_A) {
                            stackOut_21_0 = 1;
                            stackIn_22_0 = stackOut_21_0;
                            return stackIn_22_0 != 0;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    if (((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_l != null) {
                      stackOut_26_0 = 1;
                      stackIn_27_0 = stackOut_26_0;
                      return stackIn_27_0 != 0;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_72_0 = 0;
                stackIn_73_0 = stackOut_72_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.CB(" + param0 + ')');
        }
        return stackIn_73_0 != 0;
    }

    private final void g(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        ad[] var4 = null;
        int var5 = 0;
        ad var6 = null;
        aga var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var2_int = 14;
              var3 = ((gj) this).field_h.field_S[((gj) this).field_n].a((byte) -43);
              fb.field_r.e(var3 * 39 + -fb.field_r.field_q, 5);
              if (param0 == -1) {
                break L1;
              } else {
                ((gj) this).field_n = 83;
                break L1;
              }
            }
            var4 = ((gj) this).field_G;
            var5 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var4.length >= ~var5) {
                    break L4;
                  } else {
                    var6 = var4[var5];
                    if (var10 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (var6 == null) {
                          break L5;
                        } else {
                          L6: {
                            var7 = var6.field_s;
                            uga.field_C.e(-17 + var2_int, 6);
                            if (null == ((gj) this).field_P) {
                              break L6;
                            } else {
                              if (((gj) this).field_P.field_s.field_u != var7.field_u) {
                                break L6;
                              } else {
                                if (~((gj) this).field_P.field_s.field_D != ~var7.field_D) {
                                  break L6;
                                } else {
                                  ((gj) this).field_x.d(var2_int + -17, 1, 128);
                                  break L6;
                                }
                              }
                            }
                          }
                          L7: {
                            L8: {
                              if (!var6.field_s.i(100)) {
                                break L8;
                              } else {
                                kn.field_g.a(var2_int, 15, 192);
                                if (var10 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var6.field_f.a(2048, -43, 255, 8, 2048, var2_int + -66);
                            break L7;
                          }
                          L9: {
                            var8 = -7 + var2_int;
                            var9 = 11;
                            if (var6.field_s.i(param0 ^ -111)) {
                              break L9;
                            } else {
                              b.field_t.c("" + var7.field_v, var8 - 4, 6 + var9, 2 + ((gj) this).field_n, -1);
                              break L9;
                            }
                          }
                          var2_int += 40;
                          break L5;
                        }
                      }
                      var5++;
                      if (var10 == 0) {
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
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.HB(" + param0 + ')');
        }
    }

    final void a(int param0, byte param1) {
        RuntimeException var3 = null;
        sfa var3_ref = null;
        int var4 = 0;
        int var5_int = 0;
        ad var5 = null;
        aga var6 = null;
        sfa var6_ref = null;
        gm var7 = null;
        sfa[] var7_array = null;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_13_0 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                int fieldTemp$1 = ((gj) this).field_U - 1;
                ((gj) this).field_U = ((gj) this).field_U - 1;
                var3_ref = ((gj) this).field_Y[fieldTemp$1];
                var4 = ((gj) this).field_U;
                if (param0 == -1) {
                  break L2;
                } else {
                  var5_int = 0;
                  L3: while (true) {
                    if (((gj) this).field_Y.length <= var5_int) {
                      break L2;
                    } else {
                      stackOut_4_0 = this;
                      stackIn_14_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        L4: {
                          var6_ref = ((gj) this).field_Y[var5_int];
                          if (var6_ref == null) {
                            break L4;
                          } else {
                            if (param0 == var6_ref.field_h.field_f) {
                              var3_ref = var6_ref;
                              var4 = var5_int;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5_int++;
                        if (var9 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_13_0 = this;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            }
            L5: {
              var5 = ((gj) this).field_G[var3_ref.field_h.field_f];
              var5.field_l = false;
              var6 = var5.field_s;
              if (var3_ref instanceof gm) {
                L6: {
                  var7 = (gm) (Object) var3_ref;
                  if (var7.field_i == 2) {
                    break L6;
                  } else {
                    L7: {
                      if (var7.field_i != 4) {
                        break L7;
                      } else {
                        ((gj) this).field_h.field_a[var7.field_l + var6.field_x][var6.field_J].field_g = false;
                        if (var9 == 0) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (var7.field_i == 3) {
                        break L8;
                      } else {
                        if (1 == var7.field_i) {
                          ((gj) this).field_h.field_a[var6.field_x][-var7.field_l + var6.field_J].field_g = false;
                          if (var9 == 0) {
                            break L5;
                          } else {
                            break L8;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    ((gj) this).field_h.field_a[var6.field_x][var6.field_J + var7.field_l].field_g = false;
                    if (var9 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                ((gj) this).field_h.field_a[-var7.field_l + var6.field_x][var6.field_J].field_g = false;
                break L5;
              } else {
                break L5;
              }
            }
            L9: {
              var8 = 25 / ((param1 - 70) / 54);
              var4++;
              var7_array = new sfa[((gj) this).field_Y.length];
              if (var4 > 0) {
                bl.a((Object[]) (Object) ((gj) this).field_Y, 0, (Object[]) (Object) var7_array, 0, -1 + var4);
                bl.a((Object[]) (Object) ((gj) this).field_Y, var4, (Object[]) (Object) var7_array, var4 + -1, -var4 + ((gj) this).field_Y.length + -1);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              ((gj) this).field_Y = var7_array;
              if (((gj) this).field_P != var5) {
                break L10;
              } else {
                ((gj) this).field_W.a(-95);
                break L10;
              }
            }
            ((gj) this).field_ab = false;
            ((gj) this).field_w = false;
            ((gj) this).field_l = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "gj.HA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void f(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((gj) this).field_s == null) {
                break L1;
              } else {
                if (((gj) this).field_s.field_q < 0) {
                  break L1;
                } else {
                  if (~((gj) this).field_s.field_q <= ~((gj) this).field_h.field_z) {
                    break L1;
                  } else {
                    if (((gj) this).field_s.field_r < 0) {
                      break L1;
                    } else {
                      if (((gj) this).field_h.field_B > ((gj) this).field_s.field_r) {
                        L2: {
                          var2_int = mk.field_p;
                          var3 = gd.field_m;
                          var4 = ((gj) this).a(-18254, ((gj) this).field_s.field_r, ((gj) this).field_s.field_q);
                          var5 = ad.field_h.c(od.field_w[((gj) this).a(-18254, ((gj) this).field_s.field_r, ((gj) this).field_s.field_q)].field_d, 100) - -20;
                          var6 = 20 + ad.field_h.c(od.field_w[((gj) this).a(-18254, ((gj) this).field_s.field_r, ((gj) this).field_s.field_q)].field_a, 100);
                          var5 = Math.max(var5, var6);
                          if (640 >= var2_int + var5) {
                            break L2;
                          } else {
                            var2_int = var2_int + (640 - var2_int + -var5);
                            break L2;
                          }
                        }
                        L3: {
                          var7 = 20 + ad.field_h.a(od.field_w[((gj) this).a(-18254, ((gj) this).field_s.field_r, ((gj) this).field_s.field_q)].field_d, 100, 12) - -ad.field_h.a(od.field_w[((gj) this).a(-18254, ((gj) this).field_s.field_r, ((gj) this).field_s.field_q)].field_a, 100, 12);
                          if (i.field_a.field_rb >= var7 + var3) {
                            break L3;
                          } else {
                            var3 = var3 + (i.field_a.field_rb + -var3 - var7);
                            break L3;
                          }
                        }
                        dg.a(var2_int, var3, var5, var7, 5, 65793, 192);
                        ad.field_h.a(od.field_w[var4].field_a, var2_int + (var5 >> 26126817), var3 - -15, 0, -1);
                        int discarded$1 = ad.field_h.a(od.field_w[var4].field_d, 10 + var2_int, var3 + 20, -20 + var5, 80, 0, -1, 1, 0, 12);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L4: {
              if (param0 == 8910) {
                break L4;
              } else {
                ((gj) this).field_q = 34;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.U(" + param0 + ')');
        }
    }

    final ad a(int param0, ad param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        ad var4 = null;
        Object stackIn_5_0 = null;
        ad stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        ad stackOut_12_0 = null;
        Object stackOut_4_0 = null;
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
              var3 = ((gj) this).field_h.a((byte) -120, param1.field_s);
              if (param0 == 21915) {
                break L1;
              } else {
                boolean discarded$2 = this.a((aga) null, (byte) 21);
                break L1;
              }
            }
            if (null != var3) {
              L2: {
                var4 = new ad(var3);
                param1.c((byte) -73);
                var4.c((byte) -102);
                if (var3.field_D != ((gj) this).field_n) {
                  break L2;
                } else {
                  ((gj) this).field_G[var3.field_u] = var4;
                  if (((gj) this).field_K >= var3.field_u + 1) {
                    break L2;
                  } else {
                    ((gj) this).field_K = var3.field_u - -1;
                    break L2;
                  }
                }
              }
              ((gj) this).field_o[var3.field_D][var3.field_u] = var4;
              stackOut_12_0 = (ad) var4;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (ad) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("gj.P(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_13_0;
    }

    private final boolean a(aga param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 101 % ((param1 - -59) / 36);
              if (~((gj) this).field_n != ~param0.field_D) {
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
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("gj.G(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final sfa b(ad param0, boolean param1) {
        sfa[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        sfa var5 = null;
        int var6 = 0;
        sfa stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        sfa stackOut_13_0 = null;
        Object stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ((gj) this).field_bb = null;
                break L1;
              }
            }
            var3 = ((gj) this).field_Y;
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var4 >= var3.length) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var5 = var3[var4];
                      if (var5 != null) {
                        break L5;
                      } else {
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (~param0.field_s.field_u != ~var5.field_h.field_f) {
                      break L4;
                    } else {
                      stackOut_13_0 = (sfa) var5;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    }
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_16_0 = null;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("gj.JA(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
        return (sfa) (Object) stackIn_17_0;
    }

    final void a(ad param0, ad param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_6_0 = null;
        ad stackIn_6_1 = null;
        ad stackIn_6_2 = null;
        Object stackIn_8_0 = null;
        ad stackIn_8_1 = null;
        ad stackIn_8_2 = null;
        Object stackIn_9_0 = null;
        ad stackIn_9_1 = null;
        ad stackIn_9_2 = null;
        int stackIn_9_3 = 0;
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
        Object stackOut_5_0 = null;
        ad stackOut_5_1 = null;
        ad stackOut_5_2 = null;
        Object stackOut_8_0 = null;
        ad stackOut_8_1 = null;
        ad stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        Object stackOut_6_0 = null;
        ad stackOut_6_1 = null;
        ad stackOut_6_2 = null;
        int stackOut_6_3 = 0;
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
        try {
          L0: {
            if (param0.field_s.a(((gj) this).field_h.field_a[param1.field_s.field_x][param1.field_s.field_J].field_n, param2)) {
              if (!param1.field_s.a(((gj) this).field_h.field_a[param0.field_s.field_x][param0.field_s.field_J].field_n, false)) {
                return;
              } else {
                L1: {
                  var4_int = param0.field_s.field_x;
                  var5 = param0.field_s.field_J;
                  param0.field_s.field_x = param1.field_s.field_x;
                  param0.field_s.field_J = param1.field_s.field_J;
                  param1.field_s.field_x = var4_int;
                  param1.field_s.field_J = var5;
                  ((gj) this).b(param0, param1, true);
                  stackOut_5_0 = this;
                  stackOut_5_1 = (ad) param1;
                  stackOut_5_2 = (ad) param0;
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_8_1 = stackOut_5_1;
                  stackIn_8_2 = stackOut_5_2;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  if (param2) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = (ad) (Object) stackIn_8_1;
                    stackOut_8_2 = (ad) (Object) stackIn_8_2;
                    stackOut_8_3 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    stackIn_9_3 = stackOut_8_3;
                    break L1;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = (ad) (Object) stackIn_6_1;
                    stackOut_6_2 = (ad) (Object) stackIn_6_2;
                    stackOut_6_3 = 1;
                    stackIn_9_0 = stackOut_6_0;
                    stackIn_9_1 = stackOut_6_1;
                    stackIn_9_2 = stackOut_6_2;
                    stackIn_9_3 = stackOut_6_3;
                    break L1;
                  }
                }
                ((gj) this).b(stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0);
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("gj.PA(");
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
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
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ')');
        }
    }

    final void b(byte param0) {
        eaa var3 = null;
        try {
            int var2_int = 62 / ((param0 - -16) / 44);
            var3 = ((gj) this).field_h.field_U;
            var3.a(((gj) this).field_X, 12632256);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gj.IB(" + param0 + ')');
        }
    }

    final void b(ad param0, ad param1, boolean param2) {
        RuntimeException var4 = null;
        wia var4_ref = null;
        eda var5_ref_eda = null;
        int var5 = 0;
        nj var5_ref_nj = null;
        jha var5_ref_jha = null;
        int var6 = 0;
        Object var7 = null;
        int var7_int = 0;
        int var8 = 0;
        ek var8_ref_ek = null;
        int[] var9 = null;
        jha var10 = null;
        int var11 = 0;
        int stackIn_54_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            var4_ref = param0.field_s.field_w.field_a[param0.field_s.field_x][param0.field_s.field_J];
            var4_ref.field_l = param0.field_s;
            if (!param0.field_s.a(32, (byte) 61)) {
              L1: {
                if (param2) {
                  break L1;
                } else {
                  ((gj) this).field_x = null;
                  break L1;
                }
              }
              L2: {
                if (21 == var4_ref.field_n) {
                  var5_ref_eda = new eda((gj) this, param0.field_s.field_x, param0.field_s.field_J, param0.field_f, ((gj) this).field_s.field_k.field_b[93]);
                  ((kj) (Object) var5_ref_eda).a(0);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (!od.field_w[var4_ref.field_n].field_b) {
                  break L3;
                } else {
                  if (!var4_ref.field_m) {
                    break L3;
                  } else {
                    if (!this.a(param0, param2)) {
                      break L3;
                    } else {
                      if (33 != param0.field_s.field_y) {
                        L4: {
                          L5: {
                            L6: {
                              if (var4_ref.a(-36) == 16) {
                                break L6;
                              } else {
                                if (var4_ref.a(-36) == 18) {
                                  break L6;
                                } else {
                                  if (17 == var4_ref.a(-36)) {
                                    break L6;
                                  } else {
                                    if (19 != var4_ref.a(-36)) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            aba.a((byte) -53, 16);
                            var5_ref_nj = new nj((gj) this, param0.field_s.field_x, param0.field_s.field_J, od.field_w[var4_ref.field_n].field_f);
                            ((kj) (Object) var5_ref_nj).a(0);
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                          L7: {
                            L8: {
                              if (var4_ref.a(-36) == 4) {
                                break L8;
                              } else {
                                if (var4_ref.a(-36) == 6) {
                                  break L8;
                                } else {
                                  if (5 == var4_ref.a(-36)) {
                                    break L8;
                                  } else {
                                    if (var4_ref.a(-36) != 7) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                            }
                            aba.a((byte) -52, 15);
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L7;
                            }
                          }
                          var5_ref_jha = new jha((gj) this, param0.field_s.field_x, param0.field_s.field_J, param0.field_s.field_D);
                          ((kj) (Object) var5_ref_jha).a(0);
                          break L4;
                        }
                        param0.a(24831, 11, kna.field_g[var4_ref.a(-36)]);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L9: {
                if (var4_ref.field_n != 38) {
                  stackOut_53_0 = 0;
                  stackIn_54_0 = stackOut_53_0;
                  break L9;
                } else {
                  stackOut_51_0 = 1;
                  stackIn_54_0 = stackOut_51_0;
                  break L9;
                }
              }
              L10: {
                var5 = stackIn_54_0;
                if (var4_ref.field_j != 0) {
                  stackOut_57_0 = 0;
                  stackIn_58_0 = stackOut_57_0;
                  break L10;
                } else {
                  stackOut_55_0 = 1;
                  stackIn_58_0 = stackOut_55_0;
                  break L10;
                }
              }
              L11: {
                var6 = stackIn_58_0;
                param0.field_s.a(var4_ref, -122);
                if (var5 == 0) {
                  break L11;
                } else {
                  L12: {
                    L13: {
                      if (var6 != 0) {
                        break L13;
                      } else {
                        var7 = (Object) (Object) new oia((gj) this, param0.field_s.field_x, param0.field_s.field_J);
                        var8_ref_ek = new ek((gj) this, param0, 75);
                        ((gj) this).field_j.a((bw) (Object) var8_ref_ek, param2);
                        if (var11 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    var7 = (Object) (Object) new bn((gj) this, param0.field_s.field_x, param0.field_s.field_J);
                    var8_ref_ek = new ek((gj) this, param0, -30);
                    ((gj) this).field_j.a((bw) (Object) var8_ref_ek, true);
                    break L12;
                  }
                  ((kj) var7).a(0);
                  break L11;
                }
              }
              var7 = (Object) (Object) param0.field_s.field_w.field_i;
              var8 = 0;
              L14: while (true) {
                L15: {
                  L16: {
                    if (var8 >= ((Object[]) var7).length) {
                      break L16;
                    } else {
                      var9 = (int[]) ((Object[]) var7)[var8];
                      stackOut_67_0 = param0.field_s.field_x;
                      stackOut_67_1 = var9[0];
                      stackIn_84_0 = stackOut_67_0;
                      stackIn_84_1 = stackOut_67_1;
                      stackIn_68_0 = stackOut_67_0;
                      stackIn_68_1 = stackOut_67_1;
                      if (var11 != 0) {
                        break L15;
                      } else {
                        L17: {
                          if (stackIn_68_0 != stackIn_68_1) {
                            break L17;
                          } else {
                            if (~var9[1] == ~param0.field_s.field_J) {
                              L18: {
                                var10 = new jha((gj) this, param0.field_s.field_x, param0.field_s.field_J, param0.field_s.field_D);
                                ((kj) (Object) var10).a(0);
                                if (param0.field_s.field_D != ((gj) this).field_n) {
                                  break L18;
                                } else {
                                  aba.a((byte) 43, 17);
                                  if (var11 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              aba.a((byte) -117, 18);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                        }
                        var8++;
                        if (var11 == 0) {
                          continue L14;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  stackOut_83_0 = 3;
                  stackOut_83_1 = ((gj) this).field_h.field_o;
                  stackIn_84_0 = stackOut_83_0;
                  stackIn_84_1 = stackOut_83_1;
                  break L15;
                }
                L19: {
                  if (stackIn_84_0 == stackIn_84_1) {
                    L20: {
                      if (param0.field_s.g((byte) 85)) {
                        var7_int = ((gj) this).field_h.b((byte) 99, param0.field_s);
                        ((gj) this).field_h.field_c[var7_int] = new int[2];
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    if (!this.a((byte) -87, param0)) {
                      break L19;
                    } else {
                      var7 = (Object) (Object) new bu((gj) this, param0.field_s.field_x, param0.field_s.field_J, param0.field_s.field_D);
                      ((kj) var7).a(0);
                      ((gj) this).field_h.a(((gj) this).field_h.b((byte) 121, param0.field_s), (byte) 97);
                      ((gj) this).field_h.field_C[param0.field_s.field_D] = ((gj) this).field_h.field_C[param0.field_s.field_D] + 1;
                      param0.field_s.field_y = 0;
                      param0.a(((gj) this).c(param0.field_s.field_D, 2271), 46, gka.field_r);
                      break L19;
                    }
                  } else {
                    break L19;
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
          L21: {
            var4 = decompiledCaughtException;
            stackOut_93_0 = (RuntimeException) var4;
            stackOut_93_1 = new StringBuilder().append("gj.F(");
            stackIn_96_0 = stackOut_93_0;
            stackIn_96_1 = stackOut_93_1;
            stackIn_94_0 = stackOut_93_0;
            stackIn_94_1 = stackOut_93_1;
            if (param0 == null) {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L21;
            } else {
              stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
              stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
              stackOut_94_2 = "{...}";
              stackIn_97_0 = stackOut_94_0;
              stackIn_97_1 = stackOut_94_1;
              stackIn_97_2 = stackOut_94_2;
              break L21;
            }
          }
          L22: {
            stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
            stackOut_97_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_97_2).append(',');
            stackIn_100_0 = stackOut_97_0;
            stackIn_100_1 = stackOut_97_1;
            stackIn_98_0 = stackOut_97_0;
            stackIn_98_1 = stackOut_97_1;
            if (param1 == null) {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L22;
            } else {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "{...}";
              stackIn_101_0 = stackOut_98_0;
              stackIn_101_1 = stackOut_98_1;
              stackIn_101_2 = stackOut_98_2;
              break L22;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_101_0, stackIn_101_2 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException var2 = null;
        sfa[] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        sfa var5 = null;
        ad var6 = null;
        aga var7 = null;
        gm var8 = null;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            var2_array = ((gj) this).field_Y;
            var3 = -17 % ((-79 - param0) / 47);
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 >= var2_array.length) {
                    break L3;
                  } else {
                    var5 = var2_array[var4];
                    if (var9 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var5 == null) {
                          break L4;
                        } else {
                          var6 = ((gj) this).field_G[var5.field_h.field_f];
                          var7 = var6.field_s;
                          var6.field_l = false;
                          if (var5 instanceof gm) {
                            L5: {
                              var8 = (gm) (Object) var5;
                              if (var8.field_i != 2) {
                                break L5;
                              } else {
                                ((gj) this).field_h.field_a[-var8.field_l + var7.field_x][var7.field_J].field_g = false;
                                if (var9 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              if (4 == var8.field_i) {
                                break L6;
                              } else {
                                L7: {
                                  if (3 != var8.field_i) {
                                    break L7;
                                  } else {
                                    ((gj) this).field_h.field_a[var7.field_x][var8.field_l + var7.field_J].field_g = false;
                                    if (var9 == 0) {
                                      break L4;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                if (var8.field_i != 1) {
                                  break L4;
                                } else {
                                  ((gj) this).field_h.field_a[var7.field_x][var7.field_J + -var8.field_l].field_g = false;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            ((gj) this).field_h.field_a[var7.field_x - -var8.field_l][var7.field_J].field_g = false;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var4++;
                      if (var9 == 0) {
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
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.AB(" + param0 + ')');
        }
    }

    private final void a(ad param0, int param1, ad param2, int param3, byte param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
              param0.field_s.field_w.field_a[param0.field_s.field_x][param0.field_s.field_J].field_l = null;
              if (param4 <= -35) {
                break L1;
              } else {
                ad discarded$2 = ((gj) this).a(-101, (ad) null);
                break L1;
              }
            }
            param0.field_s.field_J = param1;
            param0.field_s.field_x = param3;
            ((gj) this).b(param0, param2, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("gj.J(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void f(byte param0) {
        try {
            if (param0 != 50) {
                ((gj) this).field_L = 11;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gj.H(" + param0 + ')');
        }
    }

    private final void a(int param0, String param1, int param2) {
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
              ((gj) this).field_S.a((bw) (Object) new vca((po) (Object) taa.field_u, param1, param0, 8192, 20, 30, 50, 80), true);
              if (param2 == -22468) {
                break L1;
              } else {
                boolean discarded$3 = this.a((byte) -101, (ad) null);
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
            stackOut_3_1 = new StringBuilder().append("gj.LA(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ')');
        }
    }

    final void e(int param0) {
        kv var2 = null;
        dg.g(0, 0, 640, 480);
        if (param0 >= -54) {
            return;
        }
        try {
            var2 = new kv(640, 480);
            fc.a(480, 640, var2, 0, (byte) 124, 0);
            eq.a(var2, (gj) this, (byte) -111);
            sia.field_h = false;
            lg.a(true, 3, false);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gj.GA(" + param0 + ')');
        }
    }

    final void b(int param0, int param1) {
        t var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ((gj) this).field_P) {
                break L1;
              } else {
                if (!this.a(((gj) this).field_P.field_s, (byte) -107)) {
                  break L1;
                } else {
                  if (!((gj) this).field_P.field_s.a(9, (byte) -110)) {
                    L2: {
                      ((gj) this).field_l = false;
                      ((gj) this).field_w = false;
                      if (param1 == -1) {
                        break L2;
                      } else {
                        ((gj) this).a((ad) null, (byte) -47);
                        break L2;
                      }
                    }
                    qm.a(10, param1 ^ -7759);
                    ((gj) this).field_db = param0;
                    var3 = (t) (Object) al.a(116, ((gj) this).field_P.field_s.field_o.field_g.field_b[((gj) this).field_P.field_s.field_m[((gj) this).field_db]]);
                    ((gj) this).field_P.a(16776960, 41, var3.field_f);
                    ((gj) this).field_Z = (sfa) (Object) new hia(al.a(94, ((gj) this).field_P.field_s.field_o.field_g.field_b[((gj) this).field_P.field_s.field_m[((gj) this).field_db]]).field_j, ((gj) this).field_P.field_s);
                    ((gj) this).field_ab = true;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3_ref, "gj.DA(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean a(byte param0, ad param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
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
            if (((gj) this).field_h.field_o == 3) {
              L1: {
                var3_int = -37 % ((param0 - 30) / 32);
                if (!((gj) this).field_h.b(param1.field_s, (byte) 114)) {
                  break L1;
                } else {
                  if (!param1.field_s.g((byte) 85)) {
                    break L1;
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
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("gj.VA(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static void a(byte param0, eaa param1, Random param2, int param3) {
        RuntimeException runtimeException = null;
        cia var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var5 = -16 / ((param0 - 55) / 40);
            var4 = (cia) (Object) param1.b((byte) 90);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var4) {
                    break L3;
                  } else {
                    boolean discarded$3 = var4.b(true);
                    var4 = (cia) (Object) param1.c(0);
                    if (var6 != 0) {
                      break L2;
                    } else {
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
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("gj.RA(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
    }

    final void d(byte param0) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 > 2) {
              if (!((gj) this).field_h.field_r) {
                L1: {
                  L2: {
                    ((gj) this).field_s.a(-22048);
                    if (((gj) this).field_h.field_J - 1 != ((gj) this).field_h.field_A) {
                      break L2;
                    } else {
                      this.a(3, wga.field_r);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (((gj) this).field_M != 1) {
                      break L3;
                    } else {
                      this.a(3, ph.field_C);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (((gj) this).field_M != 2) {
                    break L1;
                  } else {
                    this.a(3, fv.field_y);
                    break L1;
                  }
                }
                L4: {
                  L5: {
                    if (((gj) this).field_G != null) {
                      var2 = null;
                      var3 = 0;
                      L6: while (true) {
                        L7: {
                          if (var3 >= 7) {
                            break L7;
                          } else {
                            if (var5 != 0) {
                              break L4;
                            } else {
                              L8: {
                                if (null == ((gj) this).field_G[var3]) {
                                  break L8;
                                } else {
                                  if (((gj) this).field_G[var3].field_s.i(-102)) {
                                    break L8;
                                  } else {
                                    var2 = (Object) (Object) ((gj) this).field_G[var3];
                                    break L7;
                                  }
                                }
                              }
                              var3++;
                              continue L6;
                            }
                          }
                        }
                        if (0 < ((gj) this).field_h.field_S[((gj) this).field_n].b((byte) 97)) {
                          var3 = -(128 * (((ad) var2).field_s.field_x - ((ad) var2).field_s.field_J) >> 1150498337) + 256;
                          var4 = 208 - ((((ad) var2).field_s.field_J + ((ad) var2).field_s.field_x) * 64 >> 1063327873);
                          ((gj) this).field_j.a((bw) (Object) new fu((gj) this, ((gj) this).field_s.field_b, ((gj) this).field_s.field_B, var3, var4), true);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  ((gj) this).field_h.j(-1);
                  ((gj) this).field_h.field_j = new sfa[((gj) this).field_h.field_d][7];
                  this.j(-15503);
                  break L4;
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
          var2 = (Object) (Object) decompiledCaughtException;
          throw pe.a((Throwable) var2, "gj.C(" + param0 + ')');
        }
    }

    final static void a(byte param0, ema param1) {
        RuntimeException runtimeException = null;
        ema var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_12_0 = 0;
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
            param1.a(false);
            var2 = (ema) (Object) aa.field_l.b((byte) 90);
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (null == var2) {
                      break L4;
                    } else {
                      stackOut_3_0 = var2.a(0, param1);
                      stackIn_14_0 = stackOut_3_0 ? 1 : 0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        if (!stackIn_4_0) {
                          break L4;
                        } else {
                          var2 = (ema) (Object) aa.field_l.c(0);
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  L5: {
                    if (null != var2) {
                      break L5;
                    } else {
                      aa.field_l.a((bw) (Object) param1, true);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  stackOut_12_0 = -106;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
                nr.a((byte) stackIn_14_0, (bw) (Object) var2, (bw) (Object) param1);
                break L2;
              }
              var3 = 113 % ((param0 - -10) / 47);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) runtimeException;
            stackOut_17_1 = new StringBuilder().append("gj.OB(").append(param0).append(',');
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

    final void a(int param0, int param1, ad param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -118) {
                break L1;
              } else {
                ((gj) this).b((byte) -56);
                break L1;
              }
            }
            ((gj) this).a(132, (ad) null, param1, param3, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("gj.M(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        hd var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ((gj) this).field_P) {
                break L1;
              } else {
                if (!this.a(((gj) this).field_P.field_s, (byte) -124)) {
                  break L1;
                } else {
                  ((gj) this).field_l = false;
                  ((gj) this).field_ab = false;
                  qm.a(10, 7758);
                  ((gj) this).field_db = param1;
                  var3_ref = (hd) (Object) al.a(-103, ((gj) this).field_P.field_s.field_o.field_g.field_b[((gj) this).field_P.field_s.field_m[((gj) this).field_db]]);
                  if (param0 == 16776960) {
                    L2: {
                      var4 = 0;
                      if (119 != var3_ref.field_j) {
                        break L2;
                      } else {
                        L3: {
                          var5 = ((gj) this).field_h.field_O;
                          var4 = 1;
                          if (var5 < 31) {
                            break L3;
                          } else {
                            var5++;
                            break L3;
                          }
                        }
                        var3_ref = (hd) (Object) al.a(94, var5 + 88);
                        ((gj) this).field_P.a(16776960, param0 ^ 16777086, var3_ref.field_f);
                        break L2;
                      }
                    }
                    L4: {
                      L5: {
                        ((gj) this).field_Z = (sfa) (Object) new td(var3_ref.field_j, ((gj) this).field_P.field_s, var4 != 0);
                        if (!var3_ref.e(-2)) {
                          break L5;
                        } else {
                          ((gj) this).field_w = true;
                          if (BachelorFridge.field_y == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.k(-1);
                      break L4;
                    }
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "gj.NB(" + param0 + ',' + param1 + ')');
        }
    }

    final void l(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        aga var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        boolean stackOut_25_0 = false;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            ((gj) this).field_y = null;
            ((gj) this).field_K = 0;
            if (param0 <= -56) {
              var2_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_int >= ((gj) this).field_h.field_d) {
                      break L3;
                    } else {
                      stackOut_5_0 = 0;
                      stackIn_26_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        var3 = stackIn_6_0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (var3 >= 7) {
                                break L6;
                              } else {
                                var4 = ((gj) this).field_h.field_S[var2_int].field_b[var3];
                                if (var5 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (null == var4) {
                                      break L7;
                                    } else {
                                      L8: {
                                        ((gj) this).field_o[var2_int][var3] = new ad(var4);
                                        if (var2_int == ((gj) this).field_n) {
                                          ((gj) this).field_K = ((gj) this).field_K + 1;
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      }
                                      if (0 >= var4.field_I) {
                                        ((gj) this).field_o[var2_int][var3].b(-1, 5);
                                        ((gj) this).field_o[var2_int][var3].field_f.field_u.a((byte) -84);
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var3++;
                                  if (var5 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var2_int++;
                            break L5;
                          }
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  ((gj) this).field_h.j(-1);
                  ((gj) this).field_s = new jo((gj) this);
                  this.j(-15503);
                  stackOut_25_0 = af.field_a;
                  stackIn_26_0 = stackOut_25_0 ? 1 : 0;
                  break L2;
                }
                L9: {
                  if (stackIn_26_0 != 0) {
                    ((gj) this).field_h.field_a[3][6].field_h = 20;
                    ((gj) this).field_h.field_a[3][6].field_n = 39;
                    ((gj) this).field_h.field_a[4][5].field_n = 39;
                    ((gj) this).field_h.field_a[4][5].field_h = 20;
                    ((gj) this).field_h.field_a[0][2].field_n = 39;
                    ((gj) this).field_h.field_a[0][2].field_h = 20;
                    ((gj) this).field_h.field_e = 3;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                aq.a(1 + ((gj) this).field_h.field_E, -1);
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.O(" + param0 + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        String var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -1) {
              return;
            } else {
              if (2 == ((gj) this).field_M) {
                L1: {
                  L2: {
                    if (~((gj) this).field_n == ~param1) {
                      break L2;
                    } else {
                      var4 = lga.a(true, new String[2], pja.field_c);
                      this.a(16711680, var4, -22468);
                      if (BachelorFridge.field_y == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4 = lga.a(true, new String[1], nu.field_g);
                  this.a(65280, var4, -22468);
                  break L1;
                }
                L3: {
                  if (param0 == 640) {
                    break L3;
                  } else {
                    ((gj) this).field_P = null;
                    break L3;
                  }
                }
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) (Object) runtimeException, "gj.WA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void o(int param0) {
        ad var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        hd var7 = null;
        td var8 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = ((gj) this).field_G[((gj) this).field_Z.field_h.field_f];
              ((gj) this).field_H = ((gj) this).field_s.field_h;
              ((gj) this).field_N = ((gj) this).field_s.field_s;
              if (((gj) this).field_N < 0) {
                break L1;
              } else {
                if (~((gj) this).field_N <= ~((gj) this).field_h.field_z) {
                  break L1;
                } else {
                  if (((gj) this).field_H < 0) {
                    break L1;
                  } else {
                    if (~((gj) this).field_H <= ~((gj) this).field_h.field_B) {
                      break L1;
                    } else {
                      L2: {
                        var3 = var2.field_s.field_x;
                        if (param0 == -17) {
                          break L2;
                        } else {
                          ((gj) this).field_K = -53;
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          var4 = var2.field_s.field_J;
                          var5 = un.a(param0 + 105, -var4 + ((gj) this).field_H, -var3 + ((gj) this).field_N);
                          if (this.r(param0 + 19)) {
                            break L4;
                          } else {
                            ((gj) this).m(param0 + 27);
                            if (BachelorFridge.field_y == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          var6 = null;
                          var7 = (hd) (Object) ur.field_e[((gj) this).field_Z.field_g];
                          if (var7.c(0) == 3) {
                            var6 = (Object) (Object) ((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_l;
                            if (var7.field_j != 93) {
                              break L5;
                            } else {
                              var6 = (Object) (Object) ((gj) this).field_h.c(((gj) this).field_N, ((gj) this).field_H, param0 + 19);
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (var5 != 0) {
                            ((gj) this).field_P.field_s.field_s = var5;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          var8 = (td) (Object) ((gj) this).field_Z;
                          var8.field_i = var5;
                          var8.field_k = ((gj) this).field_N;
                          var8.field_n = ((gj) this).field_H;
                          if (var6 == null) {
                            break L7;
                          } else {
                            var8.field_j = new nq((aga) var6);
                            break L7;
                          }
                        }
                        this.k(-1);
                        ((gj) this).field_w = false;
                        break L3;
                      }
                      ((gj) this).field_f = 5;
                      lf.field_c = 0;
                      break L0;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2_ref, "gj.KB(" + param0 + ')');
        }
    }

    final void a(int param0, ad param1, byte param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            this.a(param1, param3, (ad) null, param0, (byte) -126);
            var5_int = 108 % ((-45 - param2) / 42);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("gj.R(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, ad[] param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int[][] var4_array = null;
        int var5 = 0;
        ad var6 = null;
        aga var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4_int >= param1.length) {
                    break L3;
                  } else {
                    ((gj) this).field_G[var4_int] = param1[var4_int];
                    ((gj) this).field_G[var4_int].field_s.field_u = var4_int;
                    var4_int++;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (!param2) {
                  break L2;
                } else {
                  ((gj) this).field_v = null;
                  break L2;
                }
              }
              var4_array = ((gj) this).field_h.field_L.b(((gj) this).field_n, -73);
              var5 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (7 <= var5) {
                      break L6;
                    } else {
                      var6 = ((gj) this).field_G[var5];
                      if (var10 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (null == var6) {
                            break L7;
                          } else {
                            if (var4_array.length > var5) {
                              var7 = var6.field_s;
                              var8 = var4_array[var5][0];
                              var9 = var4_array[var5][1];
                              var7.field_J = var9;
                              var7.field_x = var8;
                              var7.field_u = var5;
                              ((gj) this).field_h.a(var7, 1, ((gj) this).field_n, var5);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var5++;
                        if (var10 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  ((gj) this).field_h.g(127);
                  this.j(-15503);
                  ((gj) this).field_e.a(0, param0);
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("gj.K(").append(param0).append(',');
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
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L8;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param2 + ')');
        }
    }

    final boolean a(aga param0, int param1) {
        RuntimeException var3 = null;
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
              if (param1 == 2) {
                break L1;
              } else {
                ((gj) this).h(-33);
                break L1;
              }
            }
            L2: {
              if (~param0.field_D != ~((gj) this).field_n) {
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
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("gj.S(");
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final void a(rk[] param0, op param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              ((gj) this).field_h = param1;
              ((gj) this).field_n = param3;
              this.a(13558251, param0);
              ((gj) this).field_o = new ad[((gj) this).field_h.field_d][7];
              if (((gj) this).field_n < 0) {
                break L1;
              } else {
                ((gj) this).field_G = ((gj) this).field_o[((gj) this).field_n];
                break L1;
              }
            }
            L2: {
              ((gj) this).field_K = 0;
              if (0 != ((gj) this).field_h.field_A) {
                ((gj) this).l(param2 ^ -19211);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param2 == 19273) {
                break L3;
              } else {
                ((gj) this).e(-67);
                break L3;
              }
            }
            ((gj) this).field_D = new kj[((gj) this).field_h.field_z][((gj) this).field_h.field_B];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("gj.MA(");
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
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean c(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = ((gj) this).field_B + -mk.field_p;
              if (param0 == -3985) {
                break L1;
              } else {
                ad discarded$2 = ((gj) this).a(117, (ad) null);
                break L1;
              }
            }
            L2: {
              var3 = -gd.field_m + ((gj) this).field_I;
              if (var2_int * var2_int - -(var3 * var3) <= 64) {
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
          throw pe.a((Throwable) (Object) var2, "gj.BB(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final void b(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 4;
            if (!((gj) this).field_cb) {
              if (null == ((gj) this).field_A) {
                L1: {
                  if (jc.field_r <= 3) {
                    break L1;
                  } else {
                    if (jc.field_r >= 50) {
                      break L1;
                    } else {
                      if (nfa.field_a <= var2_int) {
                        break L1;
                      } else {
                        if (~(8 + ((gj) this).field_h.field_k * 39) < ~nfa.field_a) {
                          var3 = -1;
                          var3 = (nfa.field_a - 4) / 39;
                          if (lf.field_c == 0) {
                            break L1;
                          } else {
                            if (~((gj) this).field_h.field_k < ~var3) {
                              if (null != ((gj) this).field_G[var3]) {
                                ((gj) this).field_q = ((gj) this).field_G[var3].field_s.field_x;
                                ((gj) this).field_E = ((gj) this).field_G[var3].field_s.field_J;
                                this.a(false, ((gj) this).a(((gj) this).field_E, false, ((gj) this).field_q));
                                if (nd.field_h == 4) {
                                  ((gj) this).a(((gj) this).field_P, (byte) -52);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              } else {
                                return;
                              }
                            } else {
                              break L1;
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    ((gj) this).field_g = 103;
                    break L2;
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
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.KA(" + param0 + ')');
        }
    }

    private final void d(boolean param0) {
        RuntimeException var2 = null;
        aj var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_142_0 = 0;
        Object stackIn_235_0 = null;
        int stackIn_235_1 = 0;
        Object stackIn_235_2 = null;
        int stackIn_235_3 = 0;
        Object stackIn_237_0 = null;
        int stackIn_237_1 = 0;
        Object stackIn_237_2 = null;
        int stackIn_237_3 = 0;
        Object stackIn_239_0 = null;
        int stackIn_239_1 = 0;
        Object stackIn_239_2 = null;
        int stackIn_239_3 = 0;
        Object stackIn_240_0 = null;
        int stackIn_240_1 = 0;
        Object stackIn_240_2 = null;
        int stackIn_240_3 = 0;
        int stackIn_240_4 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_141_0 = 0;
        int stackOut_139_0 = 0;
        Object stackOut_234_0 = null;
        int stackOut_234_1 = 0;
        Object stackOut_234_2 = null;
        int stackOut_234_3 = 0;
        Object stackOut_239_0 = null;
        int stackOut_239_1 = 0;
        Object stackOut_239_2 = null;
        int stackOut_239_3 = 0;
        int stackOut_239_4 = 0;
        Object stackOut_235_0 = null;
        int stackOut_235_1 = 0;
        Object stackOut_235_2 = null;
        int stackOut_235_3 = 0;
        Object stackOut_237_0 = null;
        int stackOut_237_1 = 0;
        Object stackOut_237_2 = null;
        int stackOut_237_3 = 0;
        int stackOut_237_4 = 0;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (((gj) this).field_n >= 0) {
                ((gj) this).field_C.a(19842, true);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((gj) this).field_W.a(param0);
              if (((gj) this).field_P == null) {
                break L2;
              } else {
                if (!((gj) this).field_J) {
                  break L2;
                } else {
                  var2_ref = ((gj) this).field_s.a(((gj) this).field_P.field_s.field_J, (byte) 56, ((gj) this).field_P.field_s.field_x);
                  ((gj) this).field_W.b(-3, var2_ref.field_c + -40, -90 + var2_ref.field_a);
                  break L2;
                }
              }
            }
            L3: {
              if (lf.field_c != 1) {
                break L3;
              } else {
                if (((gj) this).field_C.field_T) {
                  break L3;
                } else {
                  if (!((gj) this).field_O.field_T) {
                    L4: {
                      if (((gj) this).field_M != 1) {
                        break L4;
                      } else {
                        if (((gj) this).field_l) {
                          this.c((byte) 122);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (((gj) this).field_M != 2) {
                        break L5;
                      } else {
                        if (!((gj) this).field_ab) {
                          break L5;
                        } else {
                          this.d(18);
                          break L5;
                        }
                      }
                    }
                    if (!((gj) this).field_w) {
                      break L3;
                    } else {
                      this.o(-17);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
            }
            L6: {
              if (lf.field_c == 2) {
                ((gj) this).field_R = mk.field_p;
                ((gj) this).field_B = mk.field_p;
                ((gj) this).field_t = gd.field_m;
                ((gj) this).field_I = gd.field_m;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((gj) this).field_cb) {
                break L7;
              } else {
                if (null != ((gj) this).field_A) {
                  break L7;
                } else {
                  if (((gj) this).field_s == null) {
                    break L7;
                  } else {
                    if (((gj) this).field_l) {
                      break L7;
                    } else {
                      if (((gj) this).field_ab) {
                        break L7;
                      } else {
                        if (((gj) this).field_O.field_T) {
                          break L7;
                        } else {
                          if (((gj) this).field_f <= 0) {
                            if ((nd.field_h & 4) != 0) {
                              break L7;
                            } else {
                              if (-1 == ((gj) this).field_B) {
                                break L7;
                              } else {
                                if (((gj) this).field_J) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (this.c(-3985)) {
                                      break L8;
                                    } else {
                                      L9: {
                                        var2_ref = ((gj) this).field_s.b(mk.field_p, 9, gd.field_m);
                                        if (null != var2_ref) {
                                          ((gj) this).field_q = var2_ref.field_c;
                                          ((gj) this).field_E = var2_ref.field_a;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        if (((gj) this).field_q < 0) {
                                          break L10;
                                        } else {
                                          if (((gj) this).field_q >= ((gj) this).field_h.field_z) {
                                            break L10;
                                          } else {
                                            if (((gj) this).field_E < 0) {
                                              break L10;
                                            } else {
                                              if (((gj) this).field_E >= ((gj) this).field_h.field_B) {
                                                break L10;
                                              } else {
                                                if (((gj) this).field_h.field_a[((gj) this).field_q][((gj) this).field_E].field_l == null) {
                                                  break L10;
                                                } else {
                                                  if (((gj) this).field_h.field_a[((gj) this).field_q][((gj) this).field_E].field_l.field_D != ((gj) this).field_n) {
                                                    break L10;
                                                  } else {
                                                    ((gj) this).a(((gj) this).a(((gj) this).field_E, false, ((gj) this).field_q), (byte) -52);
                                                    if (var3 == 0) {
                                                      break L8;
                                                    } else {
                                                      break L10;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      ((gj) this).field_d = true;
                                      ((gj) this).field_i = 150;
                                      break L8;
                                    }
                                  }
                                  ((gj) this).field_B = -1;
                                  break L7;
                                }
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L11: {
              if (null == ((gj) this).field_P) {
                break L11;
              } else {
                if (0 != (4 & nd.field_h)) {
                  break L11;
                } else {
                  if (((gj) this).field_B == -1) {
                    break L11;
                  } else {
                    if (((gj) this).field_J) {
                      L12: {
                        if (this.c(-3985)) {
                          break L12;
                        } else {
                          ((gj) this).m(10);
                          qm.a(34, 7758);
                          ((gj) this).field_f = 5;
                          break L12;
                        }
                      }
                      ((gj) this).field_B = -1;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
              }
            }
            L13: {
              if (null == ((gj) this).field_A) {
                break L13;
              } else {
                if (!((gj) this).field_A.a(-214844415)) {
                  ((gj) this).field_A = null;
                  break L13;
                } else {
                  break L13;
                }
              }
            }
            L14: {
              L15: {
                if (null != ((gj) this).field_Y[0]) {
                  break L15;
                } else {
                  ((gj) this).field_O.field_T = false;
                  if (var3 == 0) {
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
              L16: {
                if (((gj) this).field_eb) {
                  ((gj) this).field_O.a(19842, true);
                  break L16;
                } else {
                  break L16;
                }
              }
              if (!((gj) this).field_eb) {
                break L14;
              } else {
                if (((gj) this).field_O.field_R != 1) {
                  break L14;
                } else {
                  L17: {
                    L18: {
                      if (null == ((gj) this).field_P) {
                        break L18;
                      } else {
                        if (((gj) this).field_P.field_s.field_D == ((gj) this).field_n) {
                          stackOut_141_0 = ((gj) this).field_P.field_s.field_u;
                          stackIn_142_0 = stackOut_141_0;
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    stackOut_139_0 = -1;
                    stackIn_142_0 = stackOut_139_0;
                    break L17;
                  }
                  var2_int = stackIn_142_0;
                  ((gj) this).a(var2_int, (byte) 127);
                  break L14;
                }
              }
            }
            L19: {
              if (((gj) this).field_cb) {
                break L19;
              } else {
                if (!((gj) this).field_m) {
                  break L19;
                } else {
                  if (((gj) this).field_A != null) {
                    break L19;
                  } else {
                    L20: {
                      if (((gj) this).field_J) {
                        L21: {
                          if (((gj) this).field_P == null) {
                            break L21;
                          } else {
                            if (((gj) this).field_P.field_s.a(10, (byte) -82)) {
                              break L21;
                            } else {
                              if (!((gj) this).field_P.field_s.a(2, (byte) 122)) {
                                ((gj) this).field_W.b((byte) 118);
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        if (((gj) this).field_W.field_l.field_R != 1) {
                          break L20;
                        } else {
                          ((gj) this).a(((gj) this).field_P, (byte) -52);
                          ((gj) this).field_J = false;
                          lf.field_c = 0;
                          break L20;
                        }
                      } else {
                        break L20;
                      }
                    }
                    L22: {
                      if (((gj) this).field_C.field_R != 1) {
                        break L22;
                      } else {
                        if (((gj) this).field_l) {
                          break L22;
                        } else {
                          if (((gj) this).field_ab) {
                            break L22;
                          } else {
                            if (((gj) this).field_w) {
                              break L22;
                            } else {
                              if (((gj) this).field_cb) {
                                break L22;
                              } else {
                                if (!cm.field_v) {
                                  break L22;
                                } else {
                                  this.a((byte) -126);
                                  ((gj) this).field_cb = true;
                                  ((gj) this).field_J = false;
                                  ((gj) this).field_e.a(false, ((gj) this).field_Y, ((gj) this).field_h.field_A);
                                  uca.a(22, (byte) 103);
                                  qm.a(35, 7758);
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    ((gj) this).field_k = ((gj) this).field_k - 1;
                    break L19;
                  }
                }
              }
            }
            L23: {
              if (1 < ((gj) this).field_k) {
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (((gj) this).field_cb) {
                break L24;
              } else {
                if (((gj) this).field_A != null) {
                  break L24;
                } else {
                  if (((gj) this).field_s == null) {
                    break L24;
                  } else {
                    if (((gj) this).field_l) {
                      break L24;
                    } else {
                      if (((gj) this).field_ab) {
                        break L24;
                      } else {
                        if (((gj) this).field_O.field_T) {
                          break L24;
                        } else {
                          if (((gj) this).field_f > 0) {
                            break L24;
                          } else {
                            if (((gj) this).field_J) {
                              break L24;
                            } else {
                              if (1 != lf.field_c) {
                                break L24;
                              } else {
                                ((gj) this).field_E = ((gj) this).field_s.field_h;
                                ((gj) this).field_q = ((gj) this).field_s.field_s;
                                if (nd.field_h != 1) {
                                  break L24;
                                } else {
                                  if (0 > ((gj) this).field_q) {
                                    break L24;
                                  } else {
                                    if (~((gj) this).field_h.field_z >= ~((gj) this).field_q) {
                                      break L24;
                                    } else {
                                      if (((gj) this).field_E < 0) {
                                        break L24;
                                      } else {
                                        if (((gj) this).field_E >= ((gj) this).field_h.field_B) {
                                          break L24;
                                        } else {
                                          if (null == ((gj) this).field_h.field_a[((gj) this).field_q][((gj) this).field_E].field_l) {
                                            break L24;
                                          } else {
                                            if (~((gj) this).field_n != ~((gj) this).field_h.field_a[((gj) this).field_q][((gj) this).field_E].field_l.field_D) {
                                              break L24;
                                            } else {
                                              L25: {
                                                stackOut_234_0 = this;
                                                stackOut_234_1 = 0;
                                                stackOut_234_2 = this;
                                                stackOut_234_3 = ((gj) this).field_E;
                                                stackIn_239_0 = stackOut_234_0;
                                                stackIn_239_1 = stackOut_234_1;
                                                stackIn_239_2 = stackOut_234_2;
                                                stackIn_239_3 = stackOut_234_3;
                                                stackIn_235_0 = stackOut_234_0;
                                                stackIn_235_1 = stackOut_234_1;
                                                stackIn_235_2 = stackOut_234_2;
                                                stackIn_235_3 = stackOut_234_3;
                                                if (param0) {
                                                  stackOut_239_0 = this;
                                                  stackOut_239_1 = stackIn_239_1;
                                                  stackOut_239_2 = this;
                                                  stackOut_239_3 = stackIn_239_3;
                                                  stackOut_239_4 = 0;
                                                  stackIn_240_0 = stackOut_239_0;
                                                  stackIn_240_1 = stackOut_239_1;
                                                  stackIn_240_2 = stackOut_239_2;
                                                  stackIn_240_3 = stackOut_239_3;
                                                  stackIn_240_4 = stackOut_239_4;
                                                  break L25;
                                                } else {
                                                  stackOut_235_0 = this;
                                                  stackOut_235_1 = stackIn_235_1;
                                                  stackOut_235_2 = this;
                                                  stackOut_235_3 = stackIn_235_3;
                                                  stackIn_237_0 = stackOut_235_0;
                                                  stackIn_237_1 = stackOut_235_1;
                                                  stackIn_237_2 = stackOut_235_2;
                                                  stackIn_237_3 = stackOut_235_3;
                                                  stackOut_237_0 = this;
                                                  stackOut_237_1 = stackIn_237_1;
                                                  stackOut_237_2 = this;
                                                  stackOut_237_3 = stackIn_237_3;
                                                  stackOut_237_4 = 1;
                                                  stackIn_240_0 = stackOut_237_0;
                                                  stackIn_240_1 = stackOut_237_1;
                                                  stackIn_240_2 = stackOut_237_2;
                                                  stackIn_240_3 = stackOut_237_3;
                                                  stackIn_240_4 = stackOut_237_4;
                                                  break L25;
                                                }
                                              }
                                              this.a(stackIn_240_1 != 0, ((gj) this).a(stackIn_240_3, stackIn_240_4 != 0, ((gj) this).field_q));
                                              break L24;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L26: {
              if (!((gj) this).field_d) {
                break L26;
              } else {
                ((gj) this).field_i = ((gj) this).field_i - 1;
                if (((gj) this).field_i > 0) {
                  break L26;
                } else {
                  ((gj) this).field_d = false;
                  break L26;
                }
              }
            }
            L27: {
              if (((gj) this).field_n >= 0) {
                this.b(true);
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (!((gj) this).field_e.field_a) {
                break L28;
              } else {
                if (((gj) this).field_cb) {
                  break L28;
                } else {
                  if (((gj) this).field_u > 500) {
                    break L28;
                  } else {
                    L29: {
                      if (null != ((gj) this).field_Z) {
                        ((gj) this).m(10);
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    this.a((byte) 126);
                    ((gj) this).field_cb = true;
                    ((gj) this).field_J = false;
                    ((gj) this).field_e.a(false, ((gj) this).field_Y, ((gj) this).field_h.field_A);
                    break L28;
                  }
                }
              }
            }
            L30: {
              if (((gj) this).field_p == 250) {
                qm.a(36, 7758);
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (((gj) this).field_n < 0) {
                break L31;
              } else {
                L32: {
                  if (((gj) this).field_h.field_S[((gj) this).field_n].field_c) {
                    break L32;
                  } else {
                    if (!((gj) this).field_h.b((byte) 61, ((gj) this).field_n)) {
                      break L31;
                    } else {
                      break L32;
                    }
                  }
                }
                if (((gj) this).field_cb) {
                  break L31;
                } else {
                  this.a((byte) 54);
                  ((gj) this).field_cb = true;
                  ((gj) this).field_J = false;
                  break L31;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.OA(" + param0 + ')');
        }
    }

    public static void p(int param0) {
        try {
            field_F = null;
            if (param0 != -1) {
                field_F = null;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gj.GB(" + param0 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException var2 = null;
        gm var2_ref = null;
        ad var3 = null;
        int var4 = 0;
        tv var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_42_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var2_ref = (gm) (Object) ((gj) this).field_Z;
              var3 = ((gj) this).field_G[((gj) this).field_Z.field_h.field_f];
              ((gj) this).field_N = ((gj) this).field_s.field_s;
              ((gj) this).field_H = ((gj) this).field_s.field_h;
              if (((gj) this).field_N < 0) {
                break L1;
              } else {
                if (~((gj) this).field_h.field_z >= ~((gj) this).field_N) {
                  break L1;
                } else {
                  if (((gj) this).field_H < 0) {
                    break L1;
                  } else {
                    if (~((gj) this).field_h.field_B >= ~((gj) this).field_H) {
                      break L1;
                    } else {
                      L2: {
                        var4 = var3.field_s.f((byte) 127);
                        var5 = (tv) (Object) ur.field_e[var2_ref.field_g];
                        if (param0 > 103) {
                          break L2;
                        } else {
                          ((gj) this).b(102, -121);
                          break L2;
                        }
                      }
                      L3: {
                        if (32 == var3.field_s.field_y) {
                          break L3;
                        } else {
                          if (((gj) this).field_h.field_E != 0) {
                            break L3;
                          } else {
                            if (((gj) this).field_h.field_a[var3.field_s.field_x][var3.field_s.field_J].field_i) {
                              break L3;
                            } else {
                              var4 = var4 >> 1;
                              break L3;
                            }
                          }
                        }
                      }
                      L4: {
                        if (hl.a((byte) 100, var2_ref.field_g)) {
                          var4 = var4 << 1;
                          var4 = var4 + var5.field_l;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          L7: {
                            if (~var3.field_s.field_x != ~((gj) this).field_N) {
                              break L7;
                            } else {
                              if (!((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_g) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (((gj) this).field_H != var3.field_s.field_J) {
                              break L8;
                            } else {
                              if (((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_g) {
                                break L8;
                              } else {
                                var6 = -var3.field_s.field_x + ((gj) this).field_N;
                                ((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_g = true;
                                var7 = Math.abs(var6);
                                L9: while (true) {
                                  L10: {
                                    L11: {
                                      if (var7 <= 0) {
                                        break L11;
                                      } else {
                                        stackOut_41_0 = var6;
                                        stackIn_77_0 = stackOut_41_0;
                                        stackIn_42_0 = stackOut_41_0;
                                        if (var8 != 0) {
                                          break L10;
                                        } else {
                                          L12: {
                                            if (stackIn_42_0 > 0) {
                                              break L12;
                                            } else {
                                              if (var6 < 0) {
                                                L13: {
                                                  L14: {
                                                    if (0 > -var7 + var3.field_s.field_x) {
                                                      break L14;
                                                    } else {
                                                      if (!var3.field_s.a(((gj) this).field_h.field_a[-var7 + var3.field_s.field_x][var3.field_s.field_J].field_n, false)) {
                                                        break L14;
                                                      } else {
                                                        break L13;
                                                      }
                                                    }
                                                  }
                                                  var6 = -(var7 + -1);
                                                  if (-var7 + ((gj) this).field_q > 0) {
                                                    break L13;
                                                  } else {
                                                    if (var8 == 0) {
                                                      break L11;
                                                    } else {
                                                      break L13;
                                                    }
                                                  }
                                                }
                                                var7--;
                                                if (var8 == 0) {
                                                  continue L9;
                                                } else {
                                                  break L12;
                                                }
                                              } else {
                                                continue L9;
                                              }
                                            }
                                          }
                                          L15: {
                                            L16: {
                                              if (var3.field_s.field_x - -var7 >= ((gj) this).field_h.field_z) {
                                                break L16;
                                              } else {
                                                if (!var3.field_s.a(((gj) this).field_h.field_a[var7 + var3.field_s.field_x][var3.field_s.field_J].field_n, false)) {
                                                  break L16;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            var6 = var7 - 1;
                                            if (~(((gj) this).field_q + var7) > ~(-1 + ((gj) this).field_h.field_z)) {
                                              break L15;
                                            } else {
                                              if (var8 == 0) {
                                                break L11;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          var7--;
                                          if (var8 == 0) {
                                            continue L9;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_76_0 = 0;
                                    stackIn_77_0 = stackOut_76_0;
                                    break L10;
                                  }
                                  L17: {
                                    L18: {
                                      L19: {
                                        if (stackIn_77_0 == var6) {
                                          break L19;
                                        } else {
                                          if (Math.abs(var6) <= var4) {
                                            break L18;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      ((gj) this).m(10);
                                      ((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_g = false;
                                      if (var8 == 0) {
                                        break L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                    this.a(false, (byte) -88, var2_ref, var6);
                                    break L17;
                                  }
                                  if (var8 == 0) {
                                    break L5;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          ((gj) this).m(10);
                          ((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_g = false;
                          if (var8 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                        ((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_g = true;
                        var6 = ((gj) this).field_H + -var3.field_s.field_J;
                        var7 = Math.abs(var6);
                        L20: while (true) {
                          L21: {
                            L22: {
                              if (var7 <= 0) {
                                break L22;
                              } else {
                                stackOut_92_0 = -1;
                                stackOut_92_1 = ~var6;
                                stackIn_124_0 = stackOut_92_0;
                                stackIn_124_1 = stackOut_92_1;
                                stackIn_93_0 = stackOut_92_0;
                                stackIn_93_1 = stackOut_92_1;
                                if (var8 != 0) {
                                  break L21;
                                } else {
                                  L23: {
                                    if (stackIn_93_0 > stackIn_93_1) {
                                      break L23;
                                    } else {
                                      if (var6 < 0) {
                                        L24: {
                                          L25: {
                                            if (var3.field_s.field_J + -var7 < 0) {
                                              break L25;
                                            } else {
                                              if (var3.field_s.a(((gj) this).field_h.field_a[var3.field_s.field_x][-var7 + var3.field_s.field_J].field_n, false)) {
                                                break L24;
                                              } else {
                                                break L25;
                                              }
                                            }
                                          }
                                          var6 = -(-1 + var7);
                                          if (var3.field_s.field_J - var7 > 0) {
                                            break L24;
                                          } else {
                                            if (var8 == 0) {
                                              break L22;
                                            } else {
                                              break L24;
                                            }
                                          }
                                        }
                                        var7--;
                                        if (var8 == 0) {
                                          continue L20;
                                        } else {
                                          break L23;
                                        }
                                      } else {
                                        continue L20;
                                      }
                                    }
                                  }
                                  L26: {
                                    L27: {
                                      if (~((gj) this).field_h.field_B >= ~(var3.field_s.field_J - -var7)) {
                                        break L27;
                                      } else {
                                        if (var3.field_s.a(((gj) this).field_h.field_a[var3.field_s.field_x][var7 + var3.field_s.field_J].field_n, false)) {
                                          break L26;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    var6 = -1 + var7;
                                    if (~((gj) this).field_h.field_B < ~(var3.field_s.field_J + var7)) {
                                      break L26;
                                    } else {
                                      if (var8 == 0) {
                                        break L22;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                  var7--;
                                  if (var8 == 0) {
                                    continue L20;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            stackOut_123_0 = -1;
                            stackOut_123_1 = ~var6;
                            stackIn_124_0 = stackOut_123_0;
                            stackIn_124_1 = stackOut_123_1;
                            break L21;
                          }
                          L28: {
                            L29: {
                              if (stackIn_124_0 == stackIn_124_1) {
                                break L29;
                              } else {
                                if (~Math.abs(var6) >= ~var4) {
                                  break L28;
                                } else {
                                  break L29;
                                }
                              }
                            }
                            ((gj) this).m(10);
                            ((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_g = false;
                            if (var8 == 0) {
                              break L5;
                            } else {
                              break L28;
                            }
                          }
                          this.a(true, (byte) -88, var2_ref, var6);
                          break L5;
                        }
                      }
                      ((gj) this).field_N = -1;
                      ((gj) this).field_H = -1;
                      break L0;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.NA(" + param0 + ')');
        }
    }

    private final void b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ej.a(592, 16776960, fha.field_j[-1 + ((gj) this).field_M][0], true, 16, 86);
              ej.a(592, 16776960, fha.field_j[-1 + ((gj) this).field_M][1], true, 30, -66);
              if (((gj) this).field_e.field_a) {
                ika.a(3, 2, 563, 16777215, -54, 52, ((gj) this).field_p / 50, 256);
                ika.a(3, 1, 597, 16777215, -120, 52, ((gj) this).field_p / 50, 256);
                break L1;
              } else {
                break L1;
              }
            }
            var2_int = 63 / ((param0 - 66) / 46);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.BA(" + param0 + ')');
        }
    }

    final void a(int param0) {
        if (param0 != 7955) {
            return;
        }
        try {
            if (((gj) this).field_A != null) {
                ((gj) this).field_A.d(15204352);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gj.B(" + param0 + ')');
        }
    }

    final void n(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = -90 % ((47 - param0) / 50);
            if (((gj) this).field_h.field_o != 2) {
              return;
            } else {
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var3 <= ~((gj) this).field_h.field_i.length) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (-1 != ((gj) this).field_h.field_i[var3][2]) {
                            ((gj) this).field_T[((gj) this).field_h.field_i[var3][2]] = ((gj) this).field_T[((gj) this).field_h.field_i[var3][2]] + 1;
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
                  break L2;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) (Object) runtimeException, "gj.T(" + param0 + ')');
        }
    }

    gj(op param0, int param1, rk[] param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var5_array = null;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var8 = BachelorFridge.field_y;
        ((gj) this).field_B = -1;
        ((gj) this).field_I = -1;
        ((gj) this).field_r = true;
        ((gj) this).field_d = false;
        try {
          L0: {
            this.a(param2, param0, 19273, param1);
            ((gj) this).field_e = new fs((gj) this, param3);
            ((gj) this).field_j = new eaa();
            ((gj) this).field_X = new eaa();
            this.j(-15503);
            ((gj) this).field_S = new eaa();
            ((gj) this).field_fb = new eaa();
            ((gj) this).field_v = new int[255];
            var5_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5_int >= 255) {
                    break L3;
                  } else {
                    ((gj) this).field_v[var5_int] = 256 * var5_int;
                    var5_int++;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((gj) this).field_T = new int[param0.field_d];
                break L2;
              }
              L4: {
                if (0 != param0.field_A) {
                  break L4;
                } else {
                  lna.field_q = false;
                  break L4;
                }
              }
              wj.field_g = lna.field_q;
              var5_array = new int[256];
              var6_int = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (var6_int >= 256) {
                      break L7;
                    } else {
                      var5_array[var6_int] = 65793 * var6_int;
                      var6_int++;
                      if (var8 != 0) {
                        break L6;
                      } else {
                        if (var8 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  ((gj) this).field_x = new kv(45, 45);
                  ((gj) this).field_x.b();
                  dg.a(352, 352, 352, 255, var5_array);
                  hga.field_U.a((byte) 120);
                  break L6;
                }
                var6 = nga.field_i;
                var7 = 0;
                L8: while (true) {
                  L9: {
                    L10: {
                      if (var7 >= 8) {
                        break L10;
                      } else {
                        var6[var7] = 0;
                        var7++;
                        if (var8 != 0) {
                          break L9;
                        } else {
                          if (var8 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    break L9;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("gj.<init>(");
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L11;
            }
          }
          L12: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',');
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L12;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L12;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param3 + ')');
        }
    }

    final boolean h(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 115) {
              L1: {
                L2: {
                  if (null == ((gj) this).field_A) {
                    break L2;
                  } else {
                    if (!((gj) this).field_A.field_b) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.QB(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void h(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        kv var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            if (13 == gf.field_k) {
              L1: {
                var2_int = 1;
                if (!((gj) this).field_e.field_a) {
                  break L1;
                } else {
                  L2: {
                    if (((gj) this).field_n < 0) {
                      break L2;
                    } else {
                      if ((1 << ((gj) this).field_n & ((gj) this).field_h.field_s) != 0) {
                        break L2;
                      } else {
                        L3: {
                          if (((gj) this).field_h.field_r) {
                            break L3;
                          } else {
                            var2_int = 2;
                            if (var4 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        dg.g(0, 0, 640, 480);
                        var3 = new kv(640, 480);
                        fc.a(480, 640, var3, 0, (byte) -90, 0);
                        eq.a(var3, (gj) this, (byte) -111);
                        sia.field_h = false;
                        var2_int = 3;
                        if (var4 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var2_int = 4;
                  break L1;
                }
              }
              lg.a(true, var2_int, false);
              return;
            } else {
              L4: {
                if (param0 == 480) {
                  break L4;
                } else {
                  ((gj) this).a(96, (ad) null, -66);
                  break L4;
                }
              }
              L5: {
                if (gf.field_k == 102) {
                  ((gj) this).field_s.a((byte) -57, ((gj) this).field_E, ((gj) this).field_q);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (hea.field_r < 2) {
                  break L6;
                } else {
                  if (gf.field_k != 50) {
                    break L6;
                  } else {
                    if (!wga.field_q[82]) {
                      break L6;
                    } else {
                      sja.field_fb.c(93, (byte) 113);
                      System.out.println("--- STATE DUMP REQUESTED ---");
                      System.out.println(((gj) this).field_h.k((byte) -72));
                      System.out.println("--- STATE DUMP ENDS ---");
                      break L6;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "gj.EA(" + param0 + ')');
        }
    }

    final ad a(int param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        ad stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        ad stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ((gj) this).field_X = null;
                break L1;
              }
            }
            stackOut_3_0 = ((gj) this).b(((gj) this).field_h.field_a[param2][param0].field_l, -23990);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var4, "gj.QA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final void a(byte param0, int param1) {
        tv var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((gj) this).field_P == null) {
                break L1;
              } else {
                if (!this.a(((gj) this).field_P.field_s, (byte) 19)) {
                  break L1;
                } else {
                  if (!((gj) this).field_P.field_s.a(8, (byte) 55)) {
                    L2: {
                      qm.a(10, 7758);
                      ((gj) this).field_ab = false;
                      ((gj) this).field_w = false;
                      ((gj) this).field_l = true;
                      if (param0 <= -28) {
                        break L2;
                      } else {
                        boolean discarded$2 = this.c(107);
                        break L2;
                      }
                    }
                    ((gj) this).field_db = param1;
                    var3 = (tv) (Object) al.a(-113, ((gj) this).field_P.field_s.field_o.field_g.field_b[((gj) this).field_P.field_s.field_m[((gj) this).field_db]]);
                    ((gj) this).field_P.a(16776960, 89, var3.field_f);
                    ((gj) this).field_Z = (sfa) (Object) new gm(((gj) this).field_P.field_s.field_o.field_g.field_b[((gj) this).field_P.field_s.field_m[((gj) this).field_db]], ((gj) this).field_P.field_s);
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3_ref, "gj.CA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void j(int param0) {
        RuntimeException runtimeException = null;
        ad[][] var2 = null;
        int var3 = 0;
        ad[] var4 = null;
        ad[] var5 = null;
        int var6 = 0;
        ad var7 = null;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_20_0 = 0;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                ((gj) this).field_U = 0;
                ((gj) this).field_Y = new sfa[7];
                if (null == ((gj) this).field_o) {
                  break L2;
                } else {
                  var2 = ((gj) this).field_o;
                  var3 = 0;
                  L3: while (true) {
                    if (~var2.length >= ~var3) {
                      break L2;
                    } else {
                      var4 = var2[var3];
                      var5 = var4;
                      stackOut_4_0 = 0;
                      stackIn_21_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var8 != 0) {
                        break L1;
                      } else {
                        var6 = stackIn_5_0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (~var6 <= ~var5.length) {
                                break L6;
                              } else {
                                var7 = var5[var6];
                                if (var8 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (var7 == null) {
                                      break L7;
                                    } else {
                                      var7.field_l = false;
                                      if (var7.field_s.field_I > 0) {
                                        var7.b(false);
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var6++;
                                  if (var8 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var3++;
                            break L5;
                          }
                          if (var8 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_20_0 = param0;
              stackIn_21_0 = stackOut_20_0;
              break L1;
            }
            L8: {
              if (stackIn_21_0 == -15503) {
                break L8;
              } else {
                this.a((ad) null, -22, (ad) null, -20, (byte) -100);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) (Object) runtimeException, "gj.SB(" + param0 + ')');
        }
    }

    final int c(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3_int = 8421504;
              if (param1 == 2271) {
                break L1;
              } else {
                ((gj) this).field_I = 87;
                break L1;
              }
            }
            L2: {
              if (param0 == -1) {
                break L2;
              } else {
                L3: {
                  if (param0 != 0) {
                    break L3;
                  } else {
                    var3_int = 16711680;
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (param0 != 1) {
                    break L4;
                  } else {
                    var3_int = 6735384;
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (param0 != 2) {
                    break L5;
                  } else {
                    var3_int = 16776960;
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                if (param0 == 3) {
                  var3_int = 33243;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            stackOut_23_0 = var3_int;
            stackIn_24_0 = stackOut_23_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "gj.FB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_24_0;
    }

    static {
    }
}
