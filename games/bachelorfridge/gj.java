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
        if (param0 == null) {
            return;
        }
        try {
            if (param1 != -52) {
                Object var4 = null;
                ((gj) this).a(-9, (ad) null, -49);
            }
            ((gj) this).a(param1 + 8007);
            if (((gj) this).field_A == null) {
                ((gj) this).field_A = new pfa((gj) this, ((gj) this).field_z, param0);
            }
            ((gj) this).field_A.a(0, param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gj.AA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void s(int param0) {
        int var2 = 0;
        int var3 = 0;
        kj var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_13_0 = 0;
        var5 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (((gj) this).field_h.field_z <= var2) {
                break L2;
              } else {
                stackOut_2_0 = 0;
                stackIn_14_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var5 != 0) {
                  break L1;
                } else {
                  var3 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var3 >= ((gj) this).field_h.field_B) {
                          break L5;
                        } else {
                          var4 = ((gj) this).field_D[var2][var3];
                          if (var5 != 0) {
                            break L4;
                          } else {
                            L6: {
                              if (var4 == null) {
                                break L6;
                              } else {
                                if (var4.b(74)) {
                                  ((gj) this).field_D[var2][var3] = var4.field_b;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var3++;
                            if (var5 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var2++;
                      break L4;
                    }
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_13_0 = 32307;
            stackIn_14_0 = stackOut_13_0;
            break L1;
          }
          L7: {
            if (stackIn_14_0 == 32307) {
              break L7;
            } else {
              ((gj) this).field_K = -53;
              break L7;
            }
          }
          return;
        }
    }

    final void m(int param0) {
        qm.a(param0, 7758);
        ((gj) this).field_l = false;
        lf.field_c = 1;
        ((gj) this).field_J = false;
        ((gj) this).field_ab = false;
        ((gj) this).field_P = null;
        ((gj) this).field_w = false;
        ((gj) this).field_Z = null;
    }

    final int a(int param0, int param1, int param2) {
        if (param0 != -18254) {
            ((gj) this).b(-102, 39);
        }
        return ((gj) this).field_h.field_a[param2][param1].field_n;
    }

    private final void q(int param0) {
        tia var2 = null;
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
        tia stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_25_0 = 0;
        boolean stackIn_39_0 = false;
        tia stackOut_2_0 = null;
        bw stackOut_6_0 = null;
        int stackOut_24_0 = 0;
        boolean stackOut_38_0 = false;
        var12 = BachelorFridge.field_y;
        this.s(32307);
        var2 = (tia) (Object) ((gj) this).field_fb.b((byte) 90);
        L0: while (true) {
          L1: {
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                stackOut_2_0 = (tia) var2;
                stackIn_7_0 = (Object) (Object) stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var12 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (((tia) (Object) stackIn_3_0).a(-59)) {
                      break L3;
                    } else {
                      var2.a(false);
                      break L3;
                    }
                  }
                  var2 = (tia) (Object) ((gj) this).field_fb.c(0);
                  if (var12 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_6_0 = ((gj) this).field_j.b((byte) 90);
            stackIn_7_0 = (Object) (Object) stackOut_6_0;
            break L1;
          }
          L4: {
            var3 = (at) (Object) stackIn_7_0;
            if (var3 != null) {
              if (!var3.b(21807)) {
                break L4;
              } else {
                var3.a(false);
                break L4;
              }
            } else {
              break L4;
            }
          }
          var4 = (vca) (Object) ((gj) this).field_S.b((byte) 90);
          L5: while (true) {
            L6: {
              L7: {
                if (var4 == null) {
                  break L7;
                } else {
                  if (var12 != 0) {
                    break L6;
                  } else {
                    L8: {
                      if (!var4.b(false)) {
                        break L8;
                      } else {
                        var4.a(false);
                        break L8;
                      }
                    }
                    var4 = (vca) (Object) ((gj) this).field_S.c(0);
                    if (var12 == 0) {
                      continue L5;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              if (null != ((gj) this).field_o) {
                break L6;
              } else {
                return;
              }
            }
            var5 = ((gj) this).field_o;
            var6 = 0;
            L9: while (true) {
              L10: {
                if (var5.length <= var6) {
                  break L10;
                } else {
                  var7 = var5[var6];
                  if (var12 != 0) {
                    break L10;
                  } else {
                    L11: {
                      L12: {
                        if (var7 == null) {
                          break L12;
                        } else {
                          var8 = var7;
                          var9 = 0;
                          L13: while (true) {
                            stackOut_24_0 = var9;
                            stackIn_25_0 = stackOut_24_0;
                            L14: while (true) {
                              if (stackIn_25_0 >= var8.length) {
                                break L12;
                              } else {
                                var10 = var8[var9];
                                if (var12 != 0) {
                                  break L11;
                                } else {
                                  L15: {
                                    L16: {
                                      if (var10 != null) {
                                        break L16;
                                      } else {
                                        if (var12 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    L17: {
                                      var10.a(104);
                                      var11 = 1;
                                      if (39 != var10.field_s.field_y) {
                                        break L17;
                                      } else {
                                        var11 = 0;
                                        break L17;
                                      }
                                    }
                                    L18: {
                                      if (17 == var10.field_s.field_y) {
                                        var11 = 2;
                                        break L18;
                                      } else {
                                        break L18;
                                      }
                                    }
                                    L19: {
                                      if (28 != var10.field_s.field_y) {
                                        break L19;
                                      } else {
                                        var11 = 3;
                                        break L19;
                                      }
                                    }
                                    L20: while (true) {
                                      var11--;
                                      if (0 > var11) {
                                        break L15;
                                      } else {
                                        var10.field_f.c(11);
                                        stackOut_38_0 = var10.field_f.field_u.field_e;
                                        stackIn_25_0 = stackOut_38_0 ? 1 : 0;
                                        stackIn_39_0 = stackOut_38_0;
                                        if (var12 != 0) {
                                          continue L14;
                                        } else {
                                          if (stackIn_39_0) {
                                            var10.b(false);
                                            if (var12 == 0) {
                                              continue L20;
                                            } else {
                                              break L15;
                                            }
                                          } else {
                                            continue L20;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var9++;
                                  if (var12 == 0) {
                                    continue L13;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var6++;
                      break L11;
                    }
                    if (var12 == 0) {
                      continue L9;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    private final void a(boolean param0, ad param1) {
        RuntimeException runtimeException = null;
        aj var3 = null;
        Object var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              ((gj) this).m(10);
              if (!param0) {
                break L1;
              } else {
                var4 = null;
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
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("gj.A(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final void a(int param0, ad param1, int param2, int param3, ad param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
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
                      stackOut_5_0 = 2;
                      stackOut_5_1 = param3;
                      stackIn_20_0 = stackOut_5_0;
                      stackIn_20_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_6_0 != stackIn_6_1) {
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
              stackOut_19_0 = 2;
              stackOut_19_1 = param3;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              break L1;
            }
            L8: {
              L9: {
                if (stackIn_20_0 == stackIn_20_1) {
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
                var10 = null;
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
            stackOut_34_0 = (RuntimeException) var6;
            stackOut_34_1 = new StringBuilder().append("gj.PB(").append(param0).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L14;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L14;
            }
          }
          L15: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param4 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L15;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L15;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 41);
        }
    }

    private final void a(int param0, kv param1) {
        try {
            if (param0 != 3) {
                ((gj) this).field_K = 121;
            }
            ((gj) this).field_S.a((bw) (Object) new vca(param1, 20, 30, 50), true);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gj.DB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final ad b(aga param0, int param1) {
        ad var3 = null;
        RuntimeException var3_ref = null;
        ad stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ad stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var3 = ((gj) this).field_o[param0.field_D][param0.field_u];
                if (param1 == -23990) {
                  break L1;
                } else {
                  ((gj) this).field_m = true;
                  break L1;
                }
              }
              stackOut_5_0 = (ad) var3;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("gj.LB(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0;
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        vca var8 = null;
        Object stackIn_12_0 = null;
        ad stackIn_12_1 = null;
        Object stackIn_16_0 = null;
        ad stackIn_16_1 = null;
        fea stackIn_64_0 = null;
        String stackIn_64_1 = null;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        fea stackIn_65_0 = null;
        String stackIn_65_1 = null;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        fea stackIn_66_0 = null;
        String stackIn_66_1 = null;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        Object stackOut_11_0 = null;
        ad stackOut_11_1 = null;
        fea stackOut_63_0 = null;
        String stackOut_63_1 = null;
        int stackOut_63_2 = 0;
        int stackOut_63_3 = 0;
        fea stackOut_65_0 = null;
        String stackOut_65_1 = null;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        fea stackOut_64_0 = null;
        String stackOut_64_1 = null;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        int stackOut_64_4 = 0;
        L0: {
          var6 = BachelorFridge.field_y;
          dg.d();
          dg.a(0, 0, 640, i.field_a.field_rb);
          if (param0 >= 29) {
            break L0;
          } else {
            var7 = null;
            boolean discarded$3 = ((gj) this).a((aga) null, -122);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (0 != ((gj) this).field_h.field_A) {
                break L3;
              } else {
                if (0 == ((gj) this).field_K) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (null == ((gj) this).field_s) {
                break L4;
              } else {
                ((gj) this).field_s.c(-32095);
                break L4;
              }
            }
            L5: {
              L6: {
                this.g((byte) -86);
                if (((gj) this).field_M == 0) {
                  break L6;
                } else {
                  L7: {
                    qn.field_g.e(-qn.field_g.field_q + 640, 0);
                    if (((gj) this).field_n < 0) {
                      break L7;
                    } else {
                      if (((gj) this).field_cb) {
                        break L7;
                      } else {
                        var3 = (int)(Math.sin((double)dj.field_c.field_L / 10.0 * 0.5) * 5.0);
                        var4 = 1;
                        var5 = 0;
                        if (var5 >= ((gj) this).field_G.length) {
                          L8: {
                            if (var4 == 0) {
                              break L8;
                            } else {
                              ((gj) this).field_x.e(-8 + (((gj) this).field_C.field_kb + -(var3 >> 1)), -(var3 >> 1) + ((gj) this).field_C.field_rb - 7, var3 + 16 + ((gj) this).field_C.field_sb, ((gj) this).field_C.field_p + (16 + var3), 256);
                              break L8;
                            }
                          }
                          L9: {
                            ica.field_t.e(574, 64);
                            if (((gj) this).field_C.field_T) {
                              fla.field_s.e(574, 64);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          int discarded$4 = b.field_t.a(ms.field_q, 580, 41, 40, 30, 0, -1, 1, 0, 10);
                          break L7;
                        } else {
                          stackOut_11_0 = null;
                          stackOut_11_1 = ((gj) this).field_G[var5];
                          stackIn_16_0 = stackOut_11_0;
                          stackIn_16_1 = stackOut_11_1;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          if (var6 != 0) {
                            if (stackIn_16_0 == (Object) (Object) stackIn_16_1) {
                              break L5;
                            } else {
                              if (!((gj) this).field_J) {
                                break L5;
                              } else {
                                if (((gj) this).field_P.field_s.field_I <= 0) {
                                  break L5;
                                } else {
                                  ((gj) this).field_W.a(0, -98, -10);
                                  break L5;
                                }
                              }
                            }
                          } else {
                            if (stackIn_12_0 == (Object) (Object) stackIn_12_1) {
                              break L5;
                            } else {
                              if (!((gj) this).field_J) {
                                break L5;
                              } else {
                                if (((gj) this).field_P.field_s.field_I <= 0) {
                                  break L5;
                                } else {
                                  ((gj) this).field_W.a(0, -98, -10);
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L10: {
                    if (null == ((gj) this).field_G) {
                      break L10;
                    } else {
                      this.g(-1);
                      break L10;
                    }
                  }
                  L11: {
                    if (((gj) this).field_n < 0) {
                      fb.field_r.e(-fb.field_r.field_q + b.field_t.a(pj.field_a) - -20, 5);
                      b.field_t.c(pj.field_a, 5, -8 + b.field_t.field_u, 0, -1);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  if (((gj) this).field_Y == null) {
                    break L6;
                  } else {
                    if (((gj) this).field_Y[0] != null) {
                      this.e((byte) 93);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              L12: {
                if (((gj) this).field_M == 0) {
                  break L12;
                } else {
                  this.b(-92);
                  break L12;
                }
              }
              L13: {
                this.g((byte) -63);
                dg.a(0, 0, 640, i.field_a.field_rb);
                if (!((gj) this).field_eb) {
                  break L13;
                } else {
                  ((gj) this).field_O.a(true, 7802);
                  break L13;
                }
              }
              if (null == ((gj) this).field_P) {
                break L5;
              } else {
                if (!((gj) this).field_J) {
                  break L5;
                } else {
                  if (((gj) this).field_P.field_s.field_I <= 0) {
                    break L5;
                  } else {
                    ((gj) this).field_W.a(0, -98, -10);
                    break L5;
                  }
                }
              }
            }
            var8 = (vca) (Object) ((gj) this).field_S.b((byte) 90);
            L14: while (true) {
              L15: {
                L16: {
                  if (var8 == null) {
                    break L16;
                  } else {
                    var8.a(240, 320, false);
                    var8 = (vca) (Object) ((gj) this).field_S.c(0);
                    if (var6 != 0) {
                      break L15;
                    } else {
                      if (var6 == 0) {
                        continue L14;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
                if (!((gj) this).field_e.field_a) {
                  break L15;
                } else {
                  L17: {
                    nna.field_w.e(0, -nna.field_w.field_p + i.field_a.field_rb);
                    var4 = 16776960;
                    if (wma.field_b <= 0) {
                      break L17;
                    } else {
                      if (((gj) this).field_L % 40 <= 20) {
                        break L17;
                      } else {
                        var4 = 16711680;
                        break L17;
                      }
                    }
                  }
                  ej.a(38, var4, pn.field_e, true, 12 + (-nna.field_w.field_p + i.field_a.field_rb - -jha.field_g.field_u), -100);
                  break L15;
                }
              }
              if (var6 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L18: {
            L19: {
              if (((gj) this).field_n >= 0) {
                break L19;
              } else {
                ew.field_r.e(120, 100);
                int discarded$5 = jha.field_g.a(cba.field_b, 230, 160, 200, 200, 16777215, -1, 1, 0, 14);
                if (var6 == 0) {
                  break L18;
                } else {
                  break L19;
                }
              }
            }
            ((gj) this).field_y.a(65793);
            break L18;
          }
          if (null == ((gj) this).field_A) {
            break L1;
          } else {
            ((gj) this).field_A.a(false);
            break L1;
          }
        }
        L20: {
          if (hea.field_r >= 2) {
            L21: {
              var3 = ((gj) this).field_h.c((byte) -10);
              jha.field_g.a("Client: " + Integer.toHexString(var3), 320, 20, 8421631, -1);
              jha.field_g.a("Server: " + Integer.toHexString(((gj) this).field_g), 320, 40, 8421504, -1);
              var4 = var3 ^ ((gj) this).field_g;
              stackOut_63_0 = jha.field_g;
              stackOut_63_1 = "Diff: " + Integer.toHexString(var4);
              stackOut_63_2 = 320;
              stackOut_63_3 = 60;
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              stackIn_65_3 = stackOut_63_3;
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              stackIn_64_3 = stackOut_63_3;
              if (var4 == 0) {
                stackOut_65_0 = (fea) (Object) stackIn_65_0;
                stackOut_65_1 = (String) (Object) stackIn_65_1;
                stackOut_65_2 = stackIn_65_2;
                stackOut_65_3 = stackIn_65_3;
                stackOut_65_4 = 8421504;
                stackIn_66_0 = stackOut_65_0;
                stackIn_66_1 = stackOut_65_1;
                stackIn_66_2 = stackOut_65_2;
                stackIn_66_3 = stackOut_65_3;
                stackIn_66_4 = stackOut_65_4;
                break L21;
              } else {
                stackOut_64_0 = (fea) (Object) stackIn_64_0;
                stackOut_64_1 = (String) (Object) stackIn_64_1;
                stackOut_64_2 = stackIn_64_2;
                stackOut_64_3 = stackIn_64_3;
                stackOut_64_4 = 16711680;
                stackIn_66_0 = stackOut_64_0;
                stackIn_66_1 = stackOut_64_1;
                stackIn_66_2 = stackOut_64_2;
                stackIn_66_3 = stackOut_64_3;
                stackIn_66_4 = stackOut_64_4;
                break L21;
              }
            }
            ((fea) (Object) stackIn_66_0).a(stackIn_66_1, stackIn_66_2, stackIn_66_3, stackIn_66_4, -1);
            break L20;
          } else {
            break L20;
          }
        }
        L22: {
          dg.c();
          if (((gj) this).field_d) {
            this.f(8910);
            break L22;
          } else {
            break L22;
          }
        }
        L23: {
          if (null != ((gj) this).field_A) {
            ((gj) this).field_A.a(false);
            break L23;
          } else {
            break L23;
          }
        }
        L24: {
          if (af.field_a) {
            kla.b(true);
            break L24;
          } else {
            break L24;
          }
        }
    }

    final void c(boolean param0) {
        ((gj) this).field_M = !((gj) this).field_h.field_N ? 1 : 2;
        uca.a(23, (byte) -54);
        if (!(((gj) this).field_h.field_e > 0)) {
            uca.a(29, (byte) 111);
        }
        ((gj) this).d((byte) 52);
        if (param0) {
            Object var3 = null;
            sfa discarded$0 = ((gj) this).b((ad) null, false);
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param0 != 30996) {
            return;
        }
        ((gj) this).field_h.field_a[param1][param2].field_m = true;
        uea var4 = new uea((gj) this, param1, param2, 16711680);
        ((kj) (Object) var4).a(0);
    }

    private final boolean a(ad param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
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
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("gj.EB(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_9_0 != 0;
    }

    private final void d(int param0) {
        ad var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        t var8 = null;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        var2 = ((gj) this).field_G[((gj) this).field_Z.field_h.field_f];
        ((gj) this).field_H = ((gj) this).field_s.field_h;
        ((gj) this).field_N = ((gj) this).field_s.field_s;
        if (0 > ((gj) this).field_N) {
          return;
        } else {
          L0: {
            if (((gj) this).field_h.field_z <= ((gj) this).field_N) {
              break L0;
            } else {
              if (((gj) this).field_H < 0) {
                break L0;
              } else {
                if (((gj) this).field_h.field_B <= ((gj) this).field_H) {
                  break L0;
                } else {
                  L1: {
                    L2: {
                      var3 = 0;
                      var4 = var2.field_s.field_x;
                      var5 = var2.field_s.field_J;
                      var6 = un.a(126, ((gj) this).field_H + -var5, ((gj) this).field_N - var4);
                      var7 = 0;
                      if (((gj) this).field_N - var4 == 0) {
                        break L2;
                      } else {
                        L3: {
                          if (0 != -var5 + ((gj) this).field_H) {
                            break L3;
                          } else {
                            var7 = Math.abs(((gj) this).field_N - var4);
                            if (var9 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var7 = 255;
                        if (var9 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var7 = Math.abs(-var5 + ((gj) this).field_H);
                    break L1;
                  }
                  L4: {
                    var8 = (t) (Object) al.a(-98, ((gj) this).field_P.field_s.field_o.field_g.field_b[((gj) this).field_P.field_s.field_m[((gj) this).field_db]]);
                    if (var7 >= var8.field_w) {
                      L5: {
                        if (var2.field_s.c(87, ((gj) this).field_P.field_s.field_o.field_g.field_b[((gj) this).field_P.field_s.field_m[((gj) this).field_db]]) < var7) {
                          break L5;
                        } else {
                          L6: {
                            L7: {
                              if (var8.field_j == 80) {
                                break L7;
                              } else {
                                if (var8.field_j != 81) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            if (((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_l == null) {
                              break L6;
                            } else {
                              ((gj) this).m(10);
                              lf.field_c = 0;
                              ((gj) this).field_f = 5;
                              return;
                            }
                          }
                          L8: {
                            if (var8.field_p == 2) {
                              var7++;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            if (var8.field_p == 3) {
                              var7++;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            if (0 == var6) {
                              break L10;
                            } else {
                              ((gj) this).field_P.field_s.field_s = var6;
                              break L10;
                            }
                          }
                          ((hia) (Object) ((gj) this).field_Z).field_j = var6;
                          ((hia) (Object) ((gj) this).field_Z).field_k = var7 - 1;
                          this.k(-1);
                          ((gj) this).field_ab = false;
                          uca.a(25, (byte) 114);
                          if (var9 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      ((gj) this).m(10);
                      break L4;
                    } else {
                      ((gj) this).m(10);
                      break L4;
                    }
                  }
                  lf.field_c = 0;
                  ((gj) this).field_f = 5;
                  return;
                }
              }
            }
          }
          return;
        }
    }

    private final boolean i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        var4 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          L1: {
            if (((gj) this).field_h.field_z <= var2) {
              break L1;
            } else {
              stackOut_2_0 = 0;
              stackIn_12_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (var4 != 0) {
                return stackIn_12_0 != 0;
              } else {
                var3 = stackIn_3_0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var3 >= ((gj) this).field_h.field_B) {
                        break L4;
                      } else {
                        if (var4 != 0) {
                          break L3;
                        } else {
                          if (null == ((gj) this).field_D[var2][var3]) {
                            var3++;
                            if (var4 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          } else {
                            return true;
                          }
                        }
                      }
                    }
                    var2++;
                    break L3;
                  }
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    private final void e(byte param0) {
        int var2 = 0;
        sfa var3 = null;
        oha var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = BachelorFridge.field_y;
          if (((gj) this).field_K <= 0) {
            break L0;
          } else {
            if (((gj) this).field_Y[0] != null) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= ((gj) this).field_Y.length) {
                  break L0;
                } else {
                  var3 = ((gj) this).field_Y[var2];
                  if (var9 != 0) {
                    break L0;
                  } else {
                    L2: {
                      if (var3 != null) {
                        break L2;
                      } else {
                        if (var9 == 0) {
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L3: {
                      var4 = al.a(-110, var3.field_g);
                      hh.field_b[var4.field_h].e(var3.field_h.field_f * 39 + 16, 28);
                      if (hh.field_b[var4.field_h].a(39 * var3.field_h.field_f + 16, 28, mk.field_p, gd.field_m)) {
                        var5 = 640;
                        var6 = 480;
                        var7 = 4 + mk.field_p;
                        var8 = gd.field_m + 4;
                        sd.a(((gj) this).field_G[var3.field_h.field_f].field_s.a(var4, -5313), var7, var4, (byte) 74, var8, var5, var6);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var2++;
                    if (var9 == 0) {
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
        }
    }

    private final void g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        ib stackIn_16_0 = null;
        ib stackIn_25_0 = null;
        ib stackIn_48_0 = null;
        ib stackIn_57_0 = null;
        ib stackIn_66_0 = null;
        ib stackOut_15_0 = null;
        ib stackOut_24_0 = null;
        ib stackOut_47_0 = null;
        ib stackOut_56_0 = null;
        ib stackOut_65_0 = null;
        L0: {
          L1: {
            var7 = BachelorFridge.field_y;
            var2 = 0;
            if (((gj) this).field_h.field_J > ((gj) this).field_h.field_A) {
              break L1;
            } else {
              var2 = Math.max(ad.field_h.a(cd.field_o[((gj) this).field_h.field_o + -1]), ad.field_h.a(tw.field_b));
              if (var7 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = ad.field_h.a(cd.field_o[((gj) this).field_h.field_o + -1]);
          break L0;
        }
        L2: {
          L3: {
            dg.a(635 + (-var2 - 10), -eja.field_w.field_p + i.field_a.field_rb - 26, var2 - -20, 32, 7, 65793, 128);
            if (((gj) this).field_h.field_J <= ((gj) this).field_h.field_A) {
              break L3;
            } else {
              ad.field_h.b(lga.a(true, new String[2], eb.field_q), 630, -12 + i.field_a.field_rb - eja.field_w.field_p, 0, -1);
              if (var7 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          ad.field_h.b(tw.field_b, 630, i.field_a.field_rb + -eja.field_w.field_p + -12, 0, -1);
          break L2;
        }
        L4: {
          if (param0 <= -61) {
            break L4;
          } else {
            var8 = null;
            sfa discarded$1 = ((gj) this).b((ad) null, true);
            break L4;
          }
        }
        ad.field_h.b(cd.field_o[-1 + ((gj) this).field_h.field_o], 630, -eja.field_w.field_p + i.field_a.field_rb, 0, -1);
        var3 = -(((gj) this).field_h.field_d * 132) + 592;
        eja.field_w.e(var3, 4 + -eja.field_w.field_p + i.field_a.field_rb);
        var4 = 0;
        L5: while (true) {
          L6: {
            if (var4 >= ((gj) this).field_h.field_d) {
              break L6;
            } else {
              var5 = var4 * 132 + 40;
              b.field_t.a(((gj) this).field_h.field_y[var4], var3 + (var5 + 67), 10 + -eja.field_w.field_p + (i.field_a.field_rb - -12), var4 + 2, -1);
              dg.a(7 + (var3 + var5), 14 + -eja.field_w.field_p + i.field_a.field_rb + 10, 130, 16, 7, 65793, 128);
              if (var7 != 0) {
                break L6;
              } else {
                L7: {
                  L8: {
                    L9: {
                      L10: {
                        L11: {
                          L12: {
                            if (((gj) this).field_h.field_o != 1) {
                              break L12;
                            } else {
                              var6 = 0;
                              L13: while (true) {
                                if (7 <= var6) {
                                  break L11;
                                } else {
                                  stackOut_15_0 = ((gj) this).field_h.field_S[var4];
                                  stackIn_66_0 = stackOut_15_0;
                                  stackIn_16_0 = stackOut_15_0;
                                  if (var7 != 0) {
                                    break L10;
                                  } else {
                                    L14: {
                                      if (stackIn_16_0.field_b[var6] == null) {
                                        break L14;
                                      } else {
                                        L15: {
                                          if (((gj) this).field_h.field_S[var4].field_b[var6].i(-124)) {
                                            kn.field_g.c(18 * var6 + (var3 + var5 - -12), 27 + -eja.field_w.field_p + i.field_a.field_rb, kn.field_g.field_q >> 1, kn.field_g.field_p >> 1, 192);
                                            if (var7 == 0) {
                                              break L14;
                                            } else {
                                              break L15;
                                            }
                                          } else {
                                            break L15;
                                          }
                                        }
                                        ((gj) this).field_o[var4][var6].field_f.a(1024, 10 + (-eja.field_w.field_p + i.field_a.field_rb + -12), 256, 8, 1024, 18 * var6 + var3 + var5 - 20);
                                        break L14;
                                      }
                                    }
                                    var6++;
                                    if (var7 == 0) {
                                      continue L13;
                                    } else {
                                      var6 = 0;
                                      L16: while (true) {
                                        if (7 <= var6) {
                                          break L11;
                                        } else {
                                          stackOut_24_0 = ((gj) this).field_h.field_S[var4];
                                          stackIn_66_0 = stackOut_24_0;
                                          stackIn_25_0 = stackOut_24_0;
                                          if (var7 != 0) {
                                            break L10;
                                          } else {
                                            L17: {
                                              if (stackIn_25_0.field_b[var6] == null) {
                                                break L17;
                                              } else {
                                                L18: {
                                                  if (((gj) this).field_h.field_S[var4].field_b[var6].i(-124)) {
                                                    kn.field_g.c(18 * var6 + (var3 + var5 - -12), 27 + -eja.field_w.field_p + i.field_a.field_rb, kn.field_g.field_q >> 1, kn.field_g.field_p >> 1, 192);
                                                    if (var7 == 0) {
                                                      break L17;
                                                    } else {
                                                      break L18;
                                                    }
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                                ((gj) this).field_o[var4][var6].field_f.a(1024, 10 + (-eja.field_w.field_p + i.field_a.field_rb + -12), 256, 8, 1024, 18 * var6 + var3 + var5 - 20);
                                                break L17;
                                              }
                                            }
                                            var6++;
                                            if (var7 == 0) {
                                              continue L16;
                                            } else {
                                              break L12;
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
                          L19: {
                            if (((gj) this).field_h.field_o != 2) {
                              break L19;
                            } else {
                              var6 = 0;
                              L20: while (true) {
                                L21: {
                                  if (var6 >= ((gj) this).field_T[var4]) {
                                    break L21;
                                  } else {
                                    sj.field_k[0].a(10 + var5 + var3 - -(var6 * 14), -eja.field_w.field_p + i.field_a.field_rb + 22);
                                    var6++;
                                    if (var7 != 0) {
                                      break L11;
                                    } else {
                                      if (var7 == 0) {
                                        continue L20;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                }
                                if (var7 == 0) {
                                  break L11;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                          if (3 != ((gj) this).field_h.field_o) {
                            break L11;
                          } else {
                            var6 = 0;
                            L22: while (true) {
                              L23: {
                                if (var6 >= ((gj) this).field_h.field_C[var4]) {
                                  break L23;
                                } else {
                                  ela.field_j[0].a(var6 * 14 + var3 + (var5 + 10), 12 + i.field_a.field_rb + (-eja.field_w.field_p + 10));
                                  var6++;
                                  if (var7 != 0) {
                                    break L11;
                                  } else {
                                    if (var7 == 0) {
                                      continue L22;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                              }
                              if (var7 == 0) {
                                break L11;
                              } else {
                                var6 = 0;
                                L24: while (true) {
                                  if (7 <= var6) {
                                    break L11;
                                  } else {
                                    stackOut_47_0 = ((gj) this).field_h.field_S[var4];
                                    stackIn_66_0 = stackOut_47_0;
                                    stackIn_48_0 = stackOut_47_0;
                                    if (var7 != 0) {
                                      break L10;
                                    } else {
                                      L25: {
                                        if (stackIn_48_0.field_b[var6] == null) {
                                          break L25;
                                        } else {
                                          L26: {
                                            if (((gj) this).field_h.field_S[var4].field_b[var6].i(-124)) {
                                              kn.field_g.c(18 * var6 + (var3 + var5 - -12), 27 + -eja.field_w.field_p + i.field_a.field_rb, kn.field_g.field_q >> 1, kn.field_g.field_p >> 1, 192);
                                              if (var7 == 0) {
                                                break L25;
                                              } else {
                                                break L26;
                                              }
                                            } else {
                                              break L26;
                                            }
                                          }
                                          ((gj) this).field_o[var4][var6].field_f.a(1024, 10 + (-eja.field_w.field_p + i.field_a.field_rb + -12), 256, 8, 1024, 18 * var6 + var3 + var5 - 20);
                                          break L25;
                                        }
                                      }
                                      var6++;
                                      if (var7 == 0) {
                                        continue L24;
                                      } else {
                                        var6 = 0;
                                        L27: while (true) {
                                          if (7 <= var6) {
                                            break L11;
                                          } else {
                                            stackOut_56_0 = ((gj) this).field_h.field_S[var4];
                                            stackIn_66_0 = stackOut_56_0;
                                            stackIn_57_0 = stackOut_56_0;
                                            if (var7 != 0) {
                                              break L10;
                                            } else {
                                              L28: {
                                                if (stackIn_57_0.field_b[var6] == null) {
                                                  break L28;
                                                } else {
                                                  L29: {
                                                    if (((gj) this).field_h.field_S[var4].field_b[var6].i(-124)) {
                                                      kn.field_g.c(18 * var6 + (var3 + var5 - -12), 27 + -eja.field_w.field_p + i.field_a.field_rb, kn.field_g.field_q >> 1, kn.field_g.field_p >> 1, 192);
                                                      if (var7 == 0) {
                                                        break L28;
                                                      } else {
                                                        break L29;
                                                      }
                                                    } else {
                                                      break L29;
                                                    }
                                                  }
                                                  ((gj) this).field_o[var4][var6].field_f.a(1024, 10 + (-eja.field_w.field_p + i.field_a.field_rb + -12), 256, 8, 1024, 18 * var6 + var3 + var5 - 20);
                                                  break L28;
                                                }
                                              }
                                              var6++;
                                              if (var7 == 0) {
                                                continue L27;
                                              } else {
                                                break L11;
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
                        if (((gj) this).field_h.a((byte) -60, var4)) {
                          break L8;
                        } else {
                          if (((gj) this).field_h.b((byte) 106, var4)) {
                            break L9;
                          } else {
                            stackOut_65_0 = ((gj) this).field_h.field_S[var4];
                            stackIn_66_0 = stackOut_65_0;
                            break L10;
                          }
                        }
                      }
                      if (stackIn_66_0.field_c) {
                        b.field_t.a(cf.field_a, 72 + (-5 + var3 + var5), 50 + (i.field_a.field_rb + -eja.field_w.field_p), 0, -1);
                        if (var7 == 0) {
                          break L7;
                        } else {
                          break L9;
                        }
                      } else {
                        break L7;
                      }
                    }
                    b.field_t.a(cka.field_w, 72 + (-5 + var5 - -var3), 26 + (-eja.field_w.field_p + (i.field_a.field_rb + 24)), 0, -1);
                    if (var7 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                  b.field_t.a(lga.a(true, new String[1], ts.field_p), 72 + var3 + (var5 - 5), 50 + i.field_a.field_rb - eja.field_w.field_p, 0, -1);
                  break L7;
                }
                var4++;
                if (var7 == 0) {
                  continue L5;
                } else {
                  break L6;
                }
              }
            }
          }
          return;
        }
    }

    private final void a(int param0, rk[] param1) {
        try {
            ((gj) this).field_z = mka.a(13558251, param0, 13558251, (byte) -128, (po) (Object) jha.field_g, 13558251, 16777215, 13558251);
            ((gj) this).field_z.field_db = op.field_I;
            ((gj) this).field_z.field_eb = wd.field_w;
            ((gj) this).field_z.field_A = bla.field_p;
            ((gj) this).field_z.field_N = 1;
            ((gj) this).field_z.field_B = 12;
            ((gj) this).field_W = new ng((gj) this, ((gj) this).field_z);
            if (param1 != null) {
                ((gj) this).field_y = new up((gj) this, ((gj) this).field_z, param1);
            }
            ((gj) this).field_C = new sna("endturn", ((gj) this).field_z, 574, 64, 50, 24, ms.field_q);
            ((gj) this).field_O = new sna("cancelorder", (sna) null, 15, 125, 32, 32, "");
            ((gj) this).field_O.field_v = hh.field_b[2];
            ((gj) this).field_bb = new sna("abortorder", (sna) null, 15, 125, 16, 16, "");
            ((gj) this).field_bb.field_v = fe.field_j;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gj.JB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(boolean param0, byte param1, gm param2, int param3) {
        RuntimeException runtimeException = null;
        gm stackIn_4_0 = null;
        gm stackIn_5_0 = null;
        gm stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        gm stackIn_8_0 = null;
        gm stackIn_9_0 = null;
        gm stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        gm stackOut_3_0 = null;
        gm stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        gm stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        gm stackOut_7_0 = null;
        gm stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        gm stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (param3 <= 0) {
                        stackOut_5_0 = (gm) (Object) stackIn_5_0;
                        stackOut_5_1 = 1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        break L3;
                      } else {
                        stackOut_4_0 = (gm) (Object) stackIn_4_0;
                        stackOut_4_1 = 3;
                        stackIn_6_0 = stackOut_4_0;
                        stackIn_6_1 = stackOut_4_1;
                        break L3;
                      }
                    }
                    stackIn_6_0.field_i = stackIn_6_1;
                    if (BachelorFridge.field_y == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  stackOut_7_0 = (gm) param2;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (param3 <= 0) {
                    stackOut_9_0 = (gm) (Object) stackIn_9_0;
                    stackOut_9_1 = 2;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L4;
                  } else {
                    stackOut_8_0 = (gm) (Object) stackIn_8_0;
                    stackOut_8_1 = 4;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L4;
                  }
                }
                stackIn_10_0.field_i = stackIn_10_1;
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
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("gj.TA(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 41);
        }
    }

    final void a(boolean param0, boolean param1) {
        int var3 = 0;
        cj var3_ref_cj = null;
        at var4_ref_at = null;
        int var4 = 0;
        int var5 = 0;
        eaa stackIn_24_0 = null;
        at stackIn_24_1 = null;
        eaa stackIn_25_0 = null;
        at stackIn_25_1 = null;
        eaa stackIn_26_0 = null;
        at stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_51_0 = 0;
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        eaa stackOut_23_0 = null;
        at stackOut_23_1 = null;
        eaa stackOut_25_0 = null;
        at stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        eaa stackOut_24_0 = null;
        at stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        Object stackOut_57_0 = null;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        var5 = BachelorFridge.field_y;
        if (3 == kaa.field_m) {
          return;
        } else {
          if (kaa.field_m == -5) {
            return;
          } else {
            L0: {
              if (af.field_a) {
                ic.a(69);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (((gj) this).field_e.field_a) {
                ((gj) this).field_p = ((gj) this).field_p - 1;
                ((gj) this).field_u = ((gj) this).field_u - 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != ((gj) this).field_s) {
                ((gj) this).field_s.b((byte) 81);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param1) {
                break L3;
              } else {
                boolean discarded$1 = ((gj) this).h((byte) 126);
                break L3;
              }
            }
            L4: {
              L5: {
                this.q(17);
                if (((gj) this).field_h.field_A == 0) {
                  break L5;
                } else {
                  L6: {
                    if (!((gj) this).field_h.field_r) {
                      break L6;
                    } else {
                      if (null == ((gj) this).field_h.field_p) {
                        break L6;
                      } else {
                        if (((gj) this).field_Q) {
                          break L6;
                        } else {
                          ((gj) this).field_X.a((bw) (Object) ((gj) this).field_h.field_p, true);
                          ((gj) this).field_Q = true;
                          break L6;
                        }
                      }
                    }
                  }
                  L7: {
                    if (!((gj) this).field_j.e(12917)) {
                      break L7;
                    } else {
                      if (!((gj) this).field_fb.e(12917)) {
                        break L7;
                      } else {
                        L8: {
                          if (((gj) this).field_X.e(12917)) {
                            break L8;
                          } else {
                            L9: {
                              var3_ref_cj = (cj) (Object) ((gj) this).field_X.a(false);
                              var4_ref_at = var3_ref_cj.a(5, (gj) this);
                              stackOut_23_0 = ((gj) this).field_j;
                              stackOut_23_1 = (at) var4_ref_at;
                              stackIn_25_0 = stackOut_23_0;
                              stackIn_25_1 = stackOut_23_1;
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              if (param1) {
                                stackOut_25_0 = (eaa) (Object) stackIn_25_0;
                                stackOut_25_1 = (at) (Object) stackIn_25_1;
                                stackOut_25_2 = 0;
                                stackIn_26_0 = stackOut_25_0;
                                stackIn_26_1 = stackOut_25_1;
                                stackIn_26_2 = stackOut_25_2;
                                break L9;
                              } else {
                                stackOut_24_0 = (eaa) (Object) stackIn_24_0;
                                stackOut_24_1 = (at) (Object) stackIn_24_1;
                                stackOut_24_2 = 1;
                                stackIn_26_0 = stackOut_24_0;
                                stackIn_26_1 = stackOut_24_1;
                                stackIn_26_2 = stackOut_24_2;
                                break L9;
                              }
                            }
                            ((eaa) (Object) stackIn_26_0).a((bw) (Object) stackIn_26_1, stackIn_26_2 != 0);
                            if (var5 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (!this.i(108)) {
                          L10: {
                            if (!((gj) this).field_h.field_r) {
                              break L10;
                            } else {
                              ((gj) this).e(-122);
                              break L10;
                            }
                          }
                          ((gj) this).field_e.d((byte) -16);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  ((gj) this).field_L = ((gj) this).field_L + 1;
                  if (!param0) {
                    return;
                  } else {
                    L11: {
                      var3 = 1;
                      if (!((gj) this).field_e.field_a) {
                        break L11;
                      } else {
                        L12: {
                          L13: {
                            L14: {
                              L15: {
                                if (!vs.field_d) {
                                  break L15;
                                } else {
                                  if (lna.field_q) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              if (!lb.g((byte) -59)) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                            var3 = 0;
                            if (var5 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                          if (mk.field_p <= 0) {
                            break L12;
                          } else {
                            if (mk.field_p >= nna.field_w.field_q) {
                              break L12;
                            } else {
                              if (i.field_a.field_rb + -nna.field_w.field_p >= gd.field_m) {
                                break L12;
                              } else {
                                if (i.field_a.field_rb <= gd.field_m) {
                                  break L12;
                                } else {
                                  if (lf.field_c == 1) {
                                    L16: {
                                      if (wj.field_g) {
                                        stackOut_50_0 = 0;
                                        stackIn_51_0 = stackOut_50_0;
                                        break L16;
                                      } else {
                                        stackOut_49_0 = 1;
                                        stackIn_51_0 = stackOut_49_0;
                                        break L16;
                                      }
                                    }
                                    wj.field_g = stackIn_51_0 != 0;
                                    lf.field_c = 0;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (!wj.field_g) {
                          break L11;
                        } else {
                          var3 = 0;
                          break L11;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        if (((gj) this).field_M == 1) {
                          break L18;
                        } else {
                          if (((gj) this).field_M != 2) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L19: {
                        stackOut_57_0 = this;
                        stackIn_59_0 = stackOut_57_0;
                        stackIn_58_0 = stackOut_57_0;
                        if (param1) {
                          stackOut_59_0 = this;
                          stackOut_59_1 = 0;
                          stackIn_60_0 = stackOut_59_0;
                          stackIn_60_1 = stackOut_59_1;
                          break L19;
                        } else {
                          stackOut_58_0 = this;
                          stackOut_58_1 = 1;
                          stackIn_60_0 = stackOut_58_0;
                          stackIn_60_1 = stackOut_58_1;
                          break L19;
                        }
                      }
                      this.d(stackIn_60_1 != 0);
                      break L17;
                    }
                    L20: {
                      if (0 != ((gj) this).field_M) {
                        break L20;
                      } else {
                        ((gj) this).field_P = null;
                        break L20;
                      }
                    }
                    L21: {
                      if (((gj) this).field_s == null) {
                        break L21;
                      } else {
                        if (!((gj) this).field_fb.e(12917)) {
                          break L21;
                        } else {
                          if (!((gj) this).field_j.e(12917)) {
                            break L21;
                          } else {
                            L22: {
                              var4 = 0;
                              if (var3 == 0) {
                                break L22;
                              } else {
                                L23: {
                                  L24: {
                                    if (wga.field_q[98]) {
                                      break L24;
                                    } else {
                                      if (wga.field_q[sm.field_r]) {
                                        break L24;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                  ((gj) this).field_s.a(0, 8, 2962);
                                  var4 = 1;
                                  break L23;
                                }
                                L25: {
                                  L26: {
                                    if (wga.field_q[99]) {
                                      break L26;
                                    } else {
                                      if (wga.field_q[rq.field_g]) {
                                        break L26;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  var4 = 1;
                                  ((gj) this).field_s.a(0, -8, 2962);
                                  break L25;
                                }
                                L27: {
                                  L28: {
                                    if (wga.field_q[96]) {
                                      break L28;
                                    } else {
                                      if (wga.field_q[oq.field_a]) {
                                        break L28;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  var4 = 1;
                                  ((gj) this).field_s.a(8, 0, 2962);
                                  break L27;
                                }
                                L29: {
                                  if (wga.field_q[97]) {
                                    break L29;
                                  } else {
                                    if (wga.field_q[vk.field_s]) {
                                      break L29;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                                ((gj) this).field_s.a(-8, 0, 2962);
                                var4 = 1;
                                break L22;
                              }
                            }
                            L30: {
                              if (nd.field_h != 4) {
                                break L30;
                              } else {
                                ((gj) this).field_s.a(mk.field_p + -((gj) this).field_R, gd.field_m - ((gj) this).field_t, 2962);
                                ((gj) this).field_t = gd.field_m;
                                var4 = 1;
                                ((gj) this).field_R = mk.field_p;
                                break L30;
                              }
                            }
                            if (var4 != 0) {
                              uca.a(40, (byte) -126);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                    }
                    L31: {
                      if (((gj) this).field_f > 0) {
                        ((gj) this).field_f = ((gj) this).field_f - 1;
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    if (var5 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              L32: {
                if (((gj) this).field_A != null) {
                  if (((gj) this).field_A.a(-214844415)) {
                    break L32;
                  } else {
                    ((gj) this).field_A = null;
                    break L32;
                  }
                } else {
                  break L32;
                }
              }
              if (((gj) this).field_n >= 0) {
                ((gj) this).field_y.a((byte) 108);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        }
    }

    final void a(int param0, ad param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param1.field_s.a(32, (byte) 109) ? 1 : 0;
              boolean discarded$19 = param1.field_s.k(-2049, param2);
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
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("gj.V(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 41);
        }
    }

    private final void k(int param0) {
        int[] var2 = null;
        int var3 = 0;
        sfa var4 = null;
        int var5 = 0;
        int[] var6 = null;
        var5 = BachelorFridge.field_y;
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
        var6 = new int[7];
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var3 >= 7) {
                break L2;
              } else {
                var4 = ((gj) this).field_Y[var3];
                if (var5 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      if (var4 != null) {
                        break L4;
                      } else {
                        var6[var3] = 2147483646;
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var6[var3] = -((gj) this).field_G[var4.field_h.field_f].field_s.field_v;
                    break L3;
                  }
                  var3++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            dk.a((Object[]) (Object) ((gj) this).field_Y, (byte) 94, var6);
            ((gj) this).field_f = 5;
            break L1;
          }
          return;
        }
    }

    private final boolean r(int param0) {
        hd var2 = null;
        Object var3 = null;
        int stackIn_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          if (param0 == 2) {
            break L0;
          } else {
            var3 = null;
            this.a(28, (rk[]) null);
            break L0;
          }
        }
        var2 = (hd) (Object) ur.field_e[((gj) this).field_Z.field_g];
        if (-1 == var2.c(0)) {
          if (var2.field_j != 130) {
            return true;
          } else {
            L1: {
              L2: {
                if (((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_l != null) {
                  break L2;
                } else {
                  if (!((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].e(-123)) {
                    break L2;
                  } else {
                    stackOut_30_0 = 1;
                    stackIn_32_0 = stackOut_30_0;
                    break L1;
                  }
                }
              }
              stackOut_31_0 = 0;
              stackIn_32_0 = stackOut_31_0;
              break L1;
            }
            return stackIn_32_0 != 0;
          }
        } else {
          L3: {
            if (-2 == var2.c(0)) {
              break L3;
            } else {
              if (var2.c(0) != 3) {
                L4: {
                  if (var2.c(0) != 2) {
                    break L4;
                  } else {
                    L5: {
                      if (((gj) this).field_N != ((gj) this).field_P.field_s.field_x - -1) {
                        break L5;
                      } else {
                        if (((gj) this).field_P.field_s.field_J != ((gj) this).field_H) {
                          break L5;
                        } else {
                          return true;
                        }
                      }
                    }
                    L6: {
                      if (((gj) this).field_N != -1 + ((gj) this).field_P.field_s.field_x) {
                        break L6;
                      } else {
                        if (((gj) this).field_P.field_s.field_J != ((gj) this).field_H) {
                          break L6;
                        } else {
                          return true;
                        }
                      }
                    }
                    L7: {
                      if (((gj) this).field_P.field_s.field_x != ((gj) this).field_N) {
                        break L7;
                      } else {
                        if (1 + ((gj) this).field_P.field_s.field_J == ((gj) this).field_H) {
                          break L3;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (((gj) this).field_P.field_s.field_x != ((gj) this).field_N) {
                      break L4;
                    } else {
                      if (((gj) this).field_H != ((gj) this).field_P.field_s.field_J - 1) {
                        break L4;
                      } else {
                        return true;
                      }
                    }
                  }
                }
                return false;
              } else {
                L8: {
                  if (93 != var2.field_j) {
                    break L8;
                  } else {
                    if (((gj) this).field_h.c(((gj) this).field_N, ((gj) this).field_H, -123) == null) {
                      break L8;
                    } else {
                      if (((gj) this).field_h.c(((gj) this).field_N, ((gj) this).field_H, 127).field_A) {
                        return true;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                if (((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_l != null) {
                  return true;
                } else {
                  return false;
                }
              }
            }
          }
          return true;
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        ad[] var4 = null;
        int var5 = 0;
        ad var6 = null;
        aga var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = BachelorFridge.field_y;
        var2 = 14;
        var3 = ((gj) this).field_h.field_S[((gj) this).field_n].a((byte) -43);
        fb.field_r.e(var3 * 39 + -fb.field_r.field_q, 5);
        var4 = ((gj) this).field_G;
        var5 = 0;
        L0: while (true) {
          L1: {
            if (var4.length <= var5) {
              break L1;
            } else {
              var6 = var4[var5];
              if (var10 != 0) {
                break L1;
              } else {
                L2: {
                  if (var6 == null) {
                    break L2;
                  } else {
                    L3: {
                      var7 = var6.field_s;
                      uga.field_C.e(-17 + var2, 6);
                      if (null == ((gj) this).field_P) {
                        break L3;
                      } else {
                        if (((gj) this).field_P.field_s.field_u != var7.field_u) {
                          break L3;
                        } else {
                          if (((gj) this).field_P.field_s.field_D != var7.field_D) {
                            break L3;
                          } else {
                            ((gj) this).field_x.d(var2 + -17, 1, 128);
                            break L3;
                          }
                        }
                      }
                    }
                    L4: {
                      L5: {
                        if (!var6.field_s.i(100)) {
                          break L5;
                        } else {
                          kn.field_g.a(var2, 15, 192);
                          if (var10 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var6.field_f.a(2048, -43, 255, 8, 2048, var2 + -66);
                      break L4;
                    }
                    L6: {
                      var8 = -7 + var2;
                      var9 = 11;
                      if (var6.field_s.i(110)) {
                        break L6;
                      } else {
                        b.field_t.c("" + var7.field_v, var8 - 4, 6 + var9, 2 + ((gj) this).field_n, -1);
                        break L6;
                      }
                    }
                    var2 += 40;
                    break L2;
                  }
                }
                var5++;
                if (var10 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          return;
        }
    }

    final void a(int param0, byte param1) {
        sfa var3 = null;
        int var4 = 0;
        int var5_int = 0;
        ad var5 = null;
        aga var6 = null;
        sfa var6_ref = null;
        gm var7 = null;
        sfa[] var7_array = null;
        int var8 = 0;
        int var9 = 0;
        gm var10 = null;
        aga var11 = null;
        Object stackIn_4_0 = null;
        Object stackIn_10_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_9_0 = null;
        L0: {
          L1: {
            var9 = BachelorFridge.field_y;
            int fieldTemp$1 = ((gj) this).field_U - 1;
            ((gj) this).field_U = ((gj) this).field_U - 1;
            var3 = ((gj) this).field_Y[fieldTemp$1];
            var4 = ((gj) this).field_U;
            if (param0 == -1) {
              break L1;
            } else {
              var5_int = 0;
              L2: while (true) {
                if (((gj) this).field_Y.length <= var5_int) {
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackIn_10_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var9 != 0) {
                    break L0;
                  } else {
                    L3: {
                      var6_ref = ((gj) this).field_Y[var5_int];
                      if (var6_ref == null) {
                        break L3;
                      } else {
                        if (param0 == var6_ref.field_h.field_f) {
                          var3 = var6_ref;
                          var4 = var5_int;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5_int++;
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_9_0 = this;
          stackIn_10_0 = stackOut_9_0;
          break L0;
        }
        L4: {
          var5 = ((gj) this).field_G[var3.field_h.field_f];
          var5.field_l = false;
          var11 = var5.field_s;
          var6 = var5.field_s;
          if (var3 instanceof gm) {
            L5: {
              var10 = (gm) (Object) var3;
              var7 = var10;
              if (var7.field_i == 2) {
                break L5;
              } else {
                L6: {
                  if (var7.field_i != 4) {
                    break L6;
                  } else {
                    ((gj) this).field_h.field_a[var10.field_l + var11.field_x][var11.field_J].field_g = false;
                    if (var9 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var7.field_i == 3) {
                    break L7;
                  } else {
                    if (1 == var7.field_i) {
                      ((gj) this).field_h.field_a[var11.field_x][-var7.field_l + var11.field_J].field_g = false;
                      if (var9 == 0) {
                        break L4;
                      } else {
                        break L7;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                ((gj) this).field_h.field_a[var11.field_x][var11.field_J + var10.field_l].field_g = false;
                if (var9 == 0) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            ((gj) this).field_h.field_a[-var7.field_l + var11.field_x][var11.field_J].field_g = false;
            break L4;
          } else {
            break L4;
          }
        }
        L8: {
          var8 = 25 / ((param1 - 70) / 54);
          var4++;
          var7_array = new sfa[((gj) this).field_Y.length];
          if (var4 > 0) {
            bl.a((Object[]) (Object) ((gj) this).field_Y, 0, (Object[]) (Object) var7_array, 0, -1 + var4);
            bl.a((Object[]) (Object) ((gj) this).field_Y, var4, (Object[]) (Object) var7_array, var4 + -1, -var4 + ((gj) this).field_Y.length + -1);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          ((gj) this).field_Y = var7_array;
          if (((gj) this).field_P != var5) {
            break L9;
          } else {
            ((gj) this).field_W.a(-95);
            break L9;
          }
        }
        ((gj) this).field_ab = false;
        ((gj) this).field_w = false;
        ((gj) this).field_l = false;
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((gj) this).field_s == null) {
            break L0;
          } else {
            if (((gj) this).field_s.field_q < 0) {
              break L0;
            } else {
              if (((gj) this).field_s.field_q >= ((gj) this).field_h.field_z) {
                break L0;
              } else {
                if (((gj) this).field_s.field_r < 0) {
                  break L0;
                } else {
                  if (((gj) this).field_h.field_B > ((gj) this).field_s.field_r) {
                    L1: {
                      var2 = mk.field_p;
                      var3 = gd.field_m;
                      var4 = ((gj) this).a(-18254, ((gj) this).field_s.field_r, ((gj) this).field_s.field_q);
                      var5 = ad.field_h.c(od.field_w[((gj) this).a(-18254, ((gj) this).field_s.field_r, ((gj) this).field_s.field_q)].field_d, 100) - -20;
                      var6 = 20 + ad.field_h.c(od.field_w[((gj) this).a(-18254, ((gj) this).field_s.field_r, ((gj) this).field_s.field_q)].field_a, 100);
                      var5 = Math.max(var5, var6);
                      if (640 >= var2 + var5) {
                        break L1;
                      } else {
                        var2 = var2 + (640 - var2 + -var5);
                        break L1;
                      }
                    }
                    L2: {
                      var7 = 20 + ad.field_h.a(od.field_w[((gj) this).a(-18254, ((gj) this).field_s.field_r, ((gj) this).field_s.field_q)].field_d, 100, 12) - -ad.field_h.a(od.field_w[((gj) this).a(-18254, ((gj) this).field_s.field_r, ((gj) this).field_s.field_q)].field_a, 100, 12);
                      if (i.field_a.field_rb >= var7 + var3) {
                        break L2;
                      } else {
                        var3 = var3 + (i.field_a.field_rb + -var3 - var7);
                        break L2;
                      }
                    }
                    dg.a(var2, var3, var5, var7, 5, 65793, 192);
                    ad.field_h.a(od.field_w[var4].field_a, var2 + (var5 >> 1), var3 - -15, 0, -1);
                    int discarded$1 = ad.field_h.a(od.field_w[var4].field_d, 10 + var2, var3 + 20, -20 + var5, 80, 0, -1, 1, 0, 12);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
        }
    }

    final ad a(int param0, ad param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        ad var4 = null;
        Object var5 = null;
        aga var6 = null;
        Object stackIn_4_0 = null;
        ad stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ad stackOut_8_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var6 = ((gj) this).field_h.a((byte) -120, param1.field_s);
              var3 = var6;
              if (param0 == 21915) {
                break L1;
              } else {
                var5 = null;
                boolean discarded$2 = this.a((aga) null, (byte) 21);
                break L1;
              }
            }
            if (var3 != null) {
              L2: {
                var4 = new ad(var3);
                param1.c((byte) -73);
                var4.c((byte) -102);
                if (var3.field_D != ((gj) this).field_n) {
                  break L2;
                } else {
                  ((gj) this).field_G[var6.field_u] = var4;
                  if (((gj) this).field_K >= var3.field_u + 1) {
                    break L2;
                  } else {
                    ((gj) this).field_K = var3.field_u - -1;
                    break L2;
                  }
                }
              }
              ((gj) this).field_o[var6.field_D][var6.field_u] = var4;
              stackOut_8_0 = (ad) var4;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (ad) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("gj.P(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    private final boolean a(aga param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 101 % ((param1 - -59) / 36);
              if (((gj) this).field_n != param0.field_D) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("gj.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final sfa b(ad param0, boolean param1) {
        sfa[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        sfa var5 = null;
        int var6 = 0;
        sfa[] var7 = null;
        sfa stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        sfa stackOut_10_0 = null;
        Object stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
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
            var7 = ((gj) this).field_Y;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 < var7.length) {
                L3: {
                  L4: {
                    var5 = var7[var4];
                    if (var5 != null) {
                      break L4;
                    } else {
                      if (var6 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param0.field_s.field_u != var5.field_h.field_f) {
                    break L3;
                  } else {
                    stackOut_10_0 = (sfa) var5;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                }
                var4++;
                if (var6 == 0) {
                  continue L2;
                } else {
                  stackOut_13_0 = null;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("gj.JA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
        }
        return (sfa) (Object) stackIn_14_0;
    }

    final void a(ad param0, ad param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        if (!param0.field_s.a(((gj) this).field_h.field_a[param1.field_s.field_x][param1.field_s.field_J].field_n, param2)) {
            return;
        }
        if (!(param1.field_s.a(((gj) this).field_h.field_a[param0.field_s.field_x][param0.field_s.field_J].field_n, false))) {
            return;
        }
        try {
            var4_int = param0.field_s.field_x;
            var5 = param0.field_s.field_J;
            param0.field_s.field_x = param1.field_s.field_x;
            param0.field_s.field_J = param1.field_s.field_J;
            param1.field_s.field_x = var4_int;
            param1.field_s.field_J = var5;
            ((gj) this).b(param0, param1, true);
            ((gj) this).b(param1, param0, !param2 ? true : false);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gj.PA(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void b(byte param0) {
        int var2 = 62 / ((param0 - -16) / 44);
        eaa var3 = ((gj) this).field_h.field_U;
        var3.a(((gj) this).field_X, 12632256);
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
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
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
                              if (-17 == var4_ref.a(-36)) {
                                break L6;
                              } else {
                                if (-19 == var4_ref.a(-36)) {
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
                if (-39 != var4_ref.field_n) {
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L9;
                } else {
                  stackOut_29_0 = 1;
                  stackIn_31_0 = stackOut_29_0;
                  break L9;
                }
              }
              L10: {
                var5 = stackIn_31_0;
                if (-1 != var4_ref.field_j) {
                  stackOut_33_0 = 0;
                  stackIn_34_0 = stackOut_33_0;
                  break L10;
                } else {
                  stackOut_32_0 = 1;
                  stackIn_34_0 = stackOut_32_0;
                  break L10;
                }
              }
              L11: {
                var6 = stackIn_34_0;
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
                  if (var8 >= ((Object[]) var7).length) {
                    stackOut_50_0 = 3;
                    stackOut_50_1 = ((gj) this).field_h.field_o;
                    stackIn_51_0 = stackOut_50_0;
                    stackIn_51_1 = stackOut_50_1;
                    break L15;
                  } else {
                    var9 = (int[]) ((Object[]) var7)[var8];
                    stackOut_41_0 = param0.field_s.field_x;
                    stackOut_41_1 = var9[0];
                    stackIn_51_0 = stackOut_41_0;
                    stackIn_51_1 = stackOut_41_1;
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    if (var11 != 0) {
                      break L15;
                    } else {
                      L16: {
                        if (stackIn_42_0 != stackIn_42_1) {
                          break L16;
                        } else {
                          if (var9[1] == param0.field_s.field_J) {
                            L17: {
                              var10 = new jha((gj) this, param0.field_s.field_x, param0.field_s.field_J, param0.field_s.field_D);
                              ((kj) (Object) var10).a(0);
                              if (param0.field_s.field_D != ((gj) this).field_n) {
                                break L17;
                              } else {
                                aba.a((byte) 43, 17);
                                if (var11 == 0) {
                                  break L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            aba.a((byte) -117, 18);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                      var8++;
                      continue L14;
                    }
                  }
                }
                L18: {
                  if (stackIn_51_0 == stackIn_51_1) {
                    L19: {
                      if (param0.field_s.g((byte) 85)) {
                        var7_int = ((gj) this).field_h.b((byte) 99, param0.field_s);
                        ((gj) this).field_h.field_c[var7_int] = new int[2];
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    if (!this.a((byte) -87, param0)) {
                      break L18;
                    } else {
                      var7 = (Object) (Object) new bu((gj) this, param0.field_s.field_x, param0.field_s.field_J, param0.field_s.field_D);
                      ((kj) var7).a(0);
                      ((gj) this).field_h.a(((gj) this).field_h.b((byte) 121, param0.field_s), (byte) 97);
                      ((gj) this).field_h.field_C[param0.field_s.field_D] = ((gj) this).field_h.field_C[param0.field_s.field_D] + 1;
                      param0.field_s.field_y = 0;
                      param0.a(((gj) this).c(param0.field_s.field_D, 2271), 46, gka.field_r);
                      break L18;
                    }
                  } else {
                    break L18;
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
          L20: {
            var4 = decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var4;
            stackOut_59_1 = new StringBuilder().append("gj.F(");
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param0 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L20;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L20;
            }
          }
          L21: {
            stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
            stackOut_62_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(44);
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param1 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L21;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L21;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + 44 + param2 + 41);
        }
    }

    private final void a(byte param0) {
        sfa[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        sfa var5 = null;
        ad var6 = null;
        aga var7 = null;
        gm var8 = null;
        int var9 = 0;
        sfa[] var10 = null;
        var9 = BachelorFridge.field_y;
        var10 = ((gj) this).field_Y;
        var2 = var10;
        var3 = -17 % ((-79 - param0) / 47);
        var4 = 0;
        L0: while (true) {
          L1: {
            if (var4 >= var10.length) {
              break L1;
            } else {
              var5 = var10[var4];
              if (var9 != 0) {
                break L1;
              } else {
                L2: {
                  if (var5 == null) {
                    break L2;
                  } else {
                    var6 = ((gj) this).field_G[var5.field_h.field_f];
                    var7 = var6.field_s;
                    var6.field_l = false;
                    if (var5 instanceof gm) {
                      L3: {
                        var8 = (gm) (Object) var5;
                        if (var8.field_i != 2) {
                          break L3;
                        } else {
                          ((gj) this).field_h.field_a[-var8.field_l + var7.field_x][var7.field_J].field_g = false;
                          if (var9 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (4 == var8.field_i) {
                          break L4;
                        } else {
                          L5: {
                            if (3 != var8.field_i) {
                              break L5;
                            } else {
                              ((gj) this).field_h.field_a[var7.field_x][var8.field_l + var7.field_J].field_g = false;
                              if (var9 == 0) {
                                break L2;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (var8.field_i != 1) {
                            break L2;
                          } else {
                            ((gj) this).field_h.field_a[var7.field_x][var7.field_J + -var8.field_l].field_g = false;
                            if (var9 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      ((gj) this).field_h.field_a[var7.field_x - -var8.field_l][var7.field_J].field_g = false;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var4++;
                if (var9 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          return;
        }
    }

    private final void a(ad param0, int param1, ad param2, int param3, byte param4) {
        try {
            param0.field_s.field_w.field_a[param0.field_s.field_x][param0.field_s.field_J].field_l = null;
            if (param4 > -35) {
                Object var7 = null;
                ad discarded$0 = ((gj) this).a(-101, (ad) null);
            }
            param0.field_s.field_J = param1;
            param0.field_s.field_x = param3;
            ((gj) this).b(param0, param2, true);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gj.J(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void f(byte param0) {
        if (param0 != 50) {
            ((gj) this).field_L = 11;
        }
    }

    private final void a(int param0, String param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((gj) this).field_S.a((bw) (Object) new vca((po) (Object) taa.field_u, param1, param0, 8192, 20, 30, 50, 80), true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("gj.LA(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -22468 + 41);
        }
    }

    final void e(int param0) {
        dg.g(0, 0, 640, 480);
        if (param0 >= -54) {
            return;
        }
        kv var2 = new kv(640, 480);
        fc.a(480, 640, var2, 0, (byte) 124, 0);
        eq.a(var2, (gj) this, (byte) -111);
        sia.field_h = false;
        lg.a(true, 3, false);
    }

    final void b(int param0, int param1) {
        t var3 = null;
        Object var4 = null;
        if (null == ((gj) this).field_P) {
          return;
        } else {
          L0: {
            if (!this.a(((gj) this).field_P.field_s, (byte) -107)) {
              break L0;
            } else {
              if (!((gj) this).field_P.field_s.a(9, (byte) -110)) {
                L1: {
                  ((gj) this).field_l = false;
                  ((gj) this).field_w = false;
                  if (param1 == -1) {
                    break L1;
                  } else {
                    var4 = null;
                    ((gj) this).a((ad) null, (byte) -47);
                    break L1;
                  }
                }
                qm.a(10, param1 ^ -7759);
                ((gj) this).field_db = param0;
                var3 = (t) (Object) al.a(116, ((gj) this).field_P.field_s.field_o.field_g.field_b[((gj) this).field_P.field_s.field_m[((gj) this).field_db]]);
                ((gj) this).field_P.a(16776960, 41, var3.field_f);
                ((gj) this).field_Z = (sfa) (Object) new hia(al.a(94, ((gj) this).field_P.field_s.field_o.field_g.field_b[((gj) this).field_P.field_s.field_m[((gj) this).field_db]]).field_j, ((gj) this).field_P.field_s);
                ((gj) this).field_ab = true;
                return;
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    private final boolean a(byte param0, ad param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
                    stackOut_5_0 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0 != 0;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
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
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("gj.VA(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0 != 0;
    }

    final static void a(byte param0, eaa param1, Random param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        cia var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var5 = -16 / ((param0 - 55) / 40);
            var7 = (cia) (Object) param1.b((byte) 90);
            L1: while (true) {
              L2: {
                if (var7 == null) {
                  break L2;
                } else {
                  boolean discarded$2 = var7.b(true);
                  var7 = (cia) (Object) param1.c(0);
                  if (var6 != 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (var6 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("gj.RA(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void d(byte param0) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (param0 > 2) {
          if (!((gj) this).field_h.field_r) {
            L0: {
              L1: {
                ((gj) this).field_s.a(-22048);
                if (((gj) this).field_h.field_J - 1 != ((gj) this).field_h.field_A) {
                  break L1;
                } else {
                  this.a(3, wga.field_r);
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (((gj) this).field_M != 1) {
                  break L2;
                } else {
                  this.a(3, ph.field_C);
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              if (((gj) this).field_M != 2) {
                break L0;
              } else {
                this.a(3, fv.field_y);
                break L0;
              }
            }
            L3: {
              L4: {
                if (((gj) this).field_G != null) {
                  var2 = null;
                  var3 = 0;
                  L5: while (true) {
                    L6: {
                      if (var3 >= 7) {
                        break L6;
                      } else {
                        if (var5 != 0) {
                          break L3;
                        } else {
                          L7: {
                            if (null == ((gj) this).field_G[var3]) {
                              break L7;
                            } else {
                              if (((gj) this).field_G[var3].field_s.i(-102)) {
                                break L7;
                              } else {
                                var2 = (Object) (Object) ((gj) this).field_G[var3];
                                break L6;
                              }
                            }
                          }
                          var3++;
                          continue L5;
                        }
                      }
                    }
                    if (0 < ((gj) this).field_h.field_S[((gj) this).field_n].b((byte) 97)) {
                      var3 = -(128 * (((ad) var2).field_s.field_x - ((ad) var2).field_s.field_J) >> 1) + 256;
                      var4 = 208 - ((((ad) var2).field_s.field_J + ((ad) var2).field_s.field_x) * 64 >> 1);
                      ((gj) this).field_j.a((bw) (Object) new fu((gj) this, ((gj) this).field_s.field_b, ((gj) this).field_s.field_B, var3, var4), true);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
              ((gj) this).field_h.j(-1);
              ((gj) this).field_h.field_j = new sfa[((gj) this).field_h.field_d][7];
              this.j(-15503);
              break L3;
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(byte param0, ema param1) {
        RuntimeException runtimeException = null;
        ema var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            param1.a(false);
            var2 = (ema) (Object) aa.field_l.b((byte) 90);
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var2 == null) {
                      break L4;
                    } else {
                      stackOut_3_0 = var2.a(0, param1);
                      stackIn_10_0 = stackOut_3_0 ? 1 : 0;
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
                    if (var2 != null) {
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
                  stackOut_9_0 = -106;
                  stackIn_10_0 = stackOut_9_0;
                  break L3;
                }
                nr.a((byte) stackIn_10_0, (bw) (Object) var2, (bw) (Object) param1);
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
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("gj.OB(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final void a(int param0, int param1, ad param2, int param3) {
        try {
            if (param0 >= -118) {
                ((gj) this).b((byte) -56);
            }
            ((gj) this).a(132, (ad) null, param1, param3, param2);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gj.M(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1) {
        hd var3 = null;
        int var4 = 0;
        int var5 = 0;
        if (null != ((gj) this).field_P) {
            if (!(this.a(((gj) this).field_P.field_s, (byte) -124))) {
                return;
            }
            ((gj) this).field_l = false;
            ((gj) this).field_ab = false;
            qm.a(10, 7758);
            ((gj) this).field_db = param1;
            var3 = (hd) (Object) al.a(-103, ((gj) this).field_P.field_s.field_o.field_g.field_b[((gj) this).field_P.field_s.field_m[((gj) this).field_db]]);
            if (param0 != 16776960) {
                return;
            }
            var4 = 0;
            if (119 == var3.field_j) {
                var5 = ((gj) this).field_h.field_O;
                var4 = 1;
                if (var5 >= 31) {
                    var5++;
                }
                var3 = (hd) (Object) al.a(94, var5 + 88);
                ((gj) this).field_P.a(16776960, param0 ^ 16777086, var3.field_f);
            }
            ((gj) this).field_Z = (sfa) (Object) new td(var3.field_j, ((gj) this).field_P.field_s, var4 != 0);
            if (!var3.e(-2)) {
                this.k(-1);
            } else {
                ((gj) this).field_w = true;
                if (BachelorFridge.field_y != 0) {
                    this.k(-1);
                }
            }
            return;
        }
    }

    final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        aga var4 = null;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_4_0 = 0;
        boolean stackOut_18_0 = false;
        var5 = BachelorFridge.field_y;
        ((gj) this).field_y = null;
        ((gj) this).field_K = 0;
        if (param0 <= -56) {
          var2 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var2 >= ((gj) this).field_h.field_d) {
                  break L2;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_19_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    var3 = stackIn_5_0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (var3 >= 7) {
                            break L5;
                          } else {
                            var4 = ((gj) this).field_h.field_S[var2].field_b[var3];
                            if (var5 != 0) {
                              break L4;
                            } else {
                              L6: {
                                if (var4 == null) {
                                  break L6;
                                } else {
                                  L7: {
                                    ((gj) this).field_o[var2][var3] = new ad(var4);
                                    if (var2 == ((gj) this).field_n) {
                                      ((gj) this).field_K = ((gj) this).field_K + 1;
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  if (0 >= var4.field_I) {
                                    ((gj) this).field_o[var2][var3].b(-1, 5);
                                    ((gj) this).field_o[var2][var3].field_f.field_u.a((byte) -84);
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var3++;
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var2++;
                        break L4;
                      }
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              ((gj) this).field_h.j(-1);
              ((gj) this).field_s = new jo((gj) this);
              this.j(-15503);
              stackOut_18_0 = af.field_a;
              stackIn_19_0 = stackOut_18_0 ? 1 : 0;
              break L1;
            }
            L8: {
              if (stackIn_19_0 != 0) {
                ((gj) this).field_h.field_a[3][6].field_h = 20;
                ((gj) this).field_h.field_a[3][6].field_n = 39;
                ((gj) this).field_h.field_a[4][5].field_n = 39;
                ((gj) this).field_h.field_a[4][5].field_h = 20;
                ((gj) this).field_h.field_a[0][2].field_n = 39;
                ((gj) this).field_h.field_a[0][2].field_h = 20;
                ((gj) this).field_h.field_e = 3;
                break L8;
              } else {
                break L8;
              }
            }
            aq.a(1 + ((gj) this).field_h.field_E, -1);
            return;
          }
        } else {
          return;
        }
    }

    final void c(int param0, int param1, int param2) {
        String var4 = null;
        if (param1 == -1) {
          return;
        } else {
          if (2 == ((gj) this).field_M) {
            L0: {
              L1: {
                if (((gj) this).field_n == param1) {
                  break L1;
                } else {
                  var4 = lga.a(true, new String[2], pja.field_c);
                  this.a(16711680, var4, -22468);
                  if (BachelorFridge.field_y == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              var4 = lga.a(true, new String[1], nu.field_g);
              this.a(65280, var4, -22468);
              break L0;
            }
            L2: {
              if (param0 == 640) {
                break L2;
              } else {
                ((gj) this).field_P = null;
                break L2;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    private final void o(int param0) {
        ad var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        hd var7 = null;
        td var8 = null;
        var2 = ((gj) this).field_G[((gj) this).field_Z.field_h.field_f];
        ((gj) this).field_H = ((gj) this).field_s.field_h;
        ((gj) this).field_N = ((gj) this).field_s.field_s;
        if (((gj) this).field_N < 0) {
          return;
        } else {
          L0: {
            if (~((gj) this).field_N <= ~((gj) this).field_h.field_z) {
              break L0;
            } else {
              if (((gj) this).field_H < 0) {
                break L0;
              } else {
                if (~((gj) this).field_H <= ~((gj) this).field_h.field_B) {
                  break L0;
                } else {
                  L1: {
                    L2: {
                      var3 = var2.field_s.field_x;
                      var4 = var2.field_s.field_J;
                      var5 = un.a(88, -var4 + ((gj) this).field_H, -var3 + ((gj) this).field_N);
                      if (this.r(2)) {
                        break L2;
                      } else {
                        ((gj) this).m(10);
                        if (BachelorFridge.field_y == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L3: {
                      var6 = null;
                      var7 = (hd) (Object) ur.field_e[((gj) this).field_Z.field_g];
                      if (var7.c(0) == 3) {
                        var6 = (Object) (Object) ((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_l;
                        if (var7.field_j != 93) {
                          break L3;
                        } else {
                          var6 = (Object) (Object) ((gj) this).field_h.c(((gj) this).field_N, ((gj) this).field_H, 2);
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (var5 != 0) {
                        ((gj) this).field_P.field_s.field_s = var5;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      var8 = (td) (Object) ((gj) this).field_Z;
                      var8.field_i = var5;
                      var8.field_k = ((gj) this).field_N;
                      var8.field_n = ((gj) this).field_H;
                      if (var6 == null) {
                        break L5;
                      } else {
                        var8.field_j = new nq((aga) var6);
                        break L5;
                      }
                    }
                    this.k(-1);
                    ((gj) this).field_w = false;
                    break L1;
                  }
                  ((gj) this).field_f = 5;
                  lf.field_c = 0;
                  return;
                }
              }
            }
          }
          return;
        }
    }

    final void a(int param0, ad param1, byte param2, int param3) {
        try {
            this.a(param1, param3, (ad) null, param0, (byte) -126);
            int var5_int = 108 % ((-45 - param2) / 42);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gj.R(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
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
        int[][] var11 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
              var11 = ((gj) this).field_h.field_L.b(((gj) this).field_n, -73);
              var4_array = var11;
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
                          if (var6 == null) {
                            break L7;
                          } else {
                            if (var11.length > var5) {
                              var7 = var6.field_s;
                              var8 = var11[var5][0];
                              var9 = var11[var5][1];
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
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("gj.K(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 41);
        }
    }

    final boolean a(aga param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
              if (param0.field_D != ((gj) this).field_n) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("gj.S(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
        return stackIn_5_0 != 0;
    }

    private final void a(rk[] param0, op param1, int param2, int param3) {
        try {
            ((gj) this).field_h = param1;
            ((gj) this).field_n = param3;
            this.a(13558251, param0);
            ((gj) this).field_o = new ad[((gj) this).field_h.field_d][7];
            if (((gj) this).field_n >= 0) {
                ((gj) this).field_G = ((gj) this).field_o[((gj) this).field_n];
            }
            ((gj) this).field_K = 0;
            if (!(0 == ((gj) this).field_h.field_A)) {
                ((gj) this).l(param2 ^ -19211);
            }
            if (param2 != 19273) {
                ((gj) this).e(-67);
            }
            ((gj) this).field_D = new kj[((gj) this).field_h.field_z][((gj) this).field_h.field_B];
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gj.MA(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final boolean c(int param0) {
        int var2 = ((gj) this).field_B + -mk.field_p;
        if (param0 != -3985) {
            Object var4 = null;
            ad discarded$0 = ((gj) this).a(117, (ad) null);
        }
        int var3 = -gd.field_m + ((gj) this).field_I;
        return var2 * var2 - -(var3 * var3) > 64 ? true : false;
    }

    private final void b(boolean param0) {
        int var3 = 0;
        int var2 = 4;
        if (((gj) this).field_cb) {
            return;
        }
        if (null != ((gj) this).field_A) {
            return;
        }
        if (jc.field_r > 3) {
            if (jc.field_r < 50) {
                if (nfa.field_a > var2) {
                    if (!(8 + ((gj) this).field_h.field_k * 39 <= nfa.field_a)) {
                        var3 = -1;
                        var3 = (nfa.field_a - 4) / 39;
                        if (lf.field_c != 0) {
                            if (!(((gj) this).field_h.field_k <= var3)) {
                                if (null == ((gj) this).field_G[var3]) {
                                    return;
                                }
                                ((gj) this).field_q = ((gj) this).field_G[var3].field_s.field_x;
                                ((gj) this).field_E = ((gj) this).field_G[var3].field_s.field_J;
                                this.a(false, ((gj) this).a(((gj) this).field_E, false, ((gj) this).field_q));
                                if (!(nd.field_h != 4)) {
                                    ((gj) this).a(((gj) this).field_P, (byte) -52);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final void d(boolean param0) {
        aj var2_ref_aj = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          if (((gj) this).field_n >= 0) {
            ((gj) this).field_C.a(19842, true);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          ((gj) this).field_W.a(false);
          if (((gj) this).field_P == null) {
            break L1;
          } else {
            if (!((gj) this).field_J) {
              break L1;
            } else {
              var2_ref_aj = ((gj) this).field_s.a(((gj) this).field_P.field_s.field_J, (byte) 56, ((gj) this).field_P.field_s.field_x);
              ((gj) this).field_W.b(-3, var2_ref_aj.field_c + -40, -90 + var2_ref_aj.field_a);
              break L1;
            }
          }
        }
        L2: {
          if (lf.field_c != 1) {
            break L2;
          } else {
            if (((gj) this).field_C.field_T) {
              break L2;
            } else {
              if (!((gj) this).field_O.field_T) {
                L3: {
                  if (((gj) this).field_M != 1) {
                    break L3;
                  } else {
                    if (((gj) this).field_l) {
                      this.c((byte) 122);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (((gj) this).field_M != 2) {
                    break L4;
                  } else {
                    if (!((gj) this).field_ab) {
                      break L4;
                    } else {
                      this.d(18);
                      break L4;
                    }
                  }
                }
                if (!((gj) this).field_w) {
                  break L2;
                } else {
                  this.o(-17);
                  break L2;
                }
              } else {
                break L2;
              }
            }
          }
        }
        L5: {
          if (lf.field_c == 2) {
            ((gj) this).field_R = mk.field_p;
            ((gj) this).field_B = mk.field_p;
            ((gj) this).field_t = gd.field_m;
            ((gj) this).field_I = gd.field_m;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (((gj) this).field_cb) {
            break L6;
          } else {
            if (null != ((gj) this).field_A) {
              break L6;
            } else {
              if (((gj) this).field_s == null) {
                break L6;
              } else {
                if (((gj) this).field_l) {
                  break L6;
                } else {
                  if (((gj) this).field_ab) {
                    break L6;
                  } else {
                    if (((gj) this).field_O.field_T) {
                      break L6;
                    } else {
                      if (((gj) this).field_f <= 0) {
                        if ((nd.field_h & 4) != 0) {
                          break L6;
                        } else {
                          if (-1 == ((gj) this).field_B) {
                            break L6;
                          } else {
                            if (((gj) this).field_J) {
                              break L6;
                            } else {
                              L7: {
                                if (this.c(-3985)) {
                                  break L7;
                                } else {
                                  L8: {
                                    var2_ref_aj = ((gj) this).field_s.b(mk.field_p, 9, gd.field_m);
                                    if (var2_ref_aj != null) {
                                      ((gj) this).field_q = var2_ref_aj.field_c;
                                      ((gj) this).field_E = var2_ref_aj.field_a;
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  L9: {
                                    if (((gj) this).field_q < 0) {
                                      break L9;
                                    } else {
                                      if (((gj) this).field_q >= ((gj) this).field_h.field_z) {
                                        break L9;
                                      } else {
                                        if (((gj) this).field_E < 0) {
                                          break L9;
                                        } else {
                                          if (((gj) this).field_E >= ((gj) this).field_h.field_B) {
                                            break L9;
                                          } else {
                                            if (((gj) this).field_h.field_a[((gj) this).field_q][((gj) this).field_E].field_l == null) {
                                              break L9;
                                            } else {
                                              if (((gj) this).field_h.field_a[((gj) this).field_q][((gj) this).field_E].field_l.field_D != ((gj) this).field_n) {
                                                break L9;
                                              } else {
                                                ((gj) this).a(((gj) this).a(((gj) this).field_E, false, ((gj) this).field_q), (byte) -52);
                                                if (var3 == 0) {
                                                  break L7;
                                                } else {
                                                  break L9;
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
                                  break L7;
                                }
                              }
                              ((gj) this).field_B = -1;
                              break L6;
                            }
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L10: {
          if (null == ((gj) this).field_P) {
            break L10;
          } else {
            if (0 != (4 & nd.field_h)) {
              break L10;
            } else {
              if (((gj) this).field_B == -1) {
                break L10;
              } else {
                if (((gj) this).field_J) {
                  L11: {
                    if (this.c(-3985)) {
                      break L11;
                    } else {
                      ((gj) this).m(10);
                      qm.a(34, 7758);
                      ((gj) this).field_f = 5;
                      break L11;
                    }
                  }
                  ((gj) this).field_B = -1;
                  break L10;
                } else {
                  break L10;
                }
              }
            }
          }
        }
        L12: {
          if (null == ((gj) this).field_A) {
            break L12;
          } else {
            if (!((gj) this).field_A.a(-214844415)) {
              ((gj) this).field_A = null;
              break L12;
            } else {
              break L12;
            }
          }
        }
        L13: {
          L14: {
            if (null != ((gj) this).field_Y[0]) {
              break L14;
            } else {
              ((gj) this).field_O.field_T = false;
              if (var3 == 0) {
                break L13;
              } else {
                break L14;
              }
            }
          }
          L15: {
            if (((gj) this).field_eb) {
              ((gj) this).field_O.a(19842, true);
              break L15;
            } else {
              break L15;
            }
          }
          if (!((gj) this).field_eb) {
            break L13;
          } else {
            if (((gj) this).field_O.field_R != 1) {
              break L13;
            } else {
              L16: {
                L17: {
                  if (null == ((gj) this).field_P) {
                    break L17;
                  } else {
                    if (((gj) this).field_P.field_s.field_D == ((gj) this).field_n) {
                      stackOut_71_0 = ((gj) this).field_P.field_s.field_u;
                      stackIn_72_0 = stackOut_71_0;
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
                stackOut_70_0 = -1;
                stackIn_72_0 = stackOut_70_0;
                break L16;
              }
              var2 = stackIn_72_0;
              ((gj) this).a(var2, (byte) 127);
              break L13;
            }
          }
        }
        L18: {
          if (((gj) this).field_cb) {
            break L18;
          } else {
            if (!((gj) this).field_m) {
              break L18;
            } else {
              if (((gj) this).field_A != null) {
                break L18;
              } else {
                L19: {
                  if (((gj) this).field_J) {
                    L20: {
                      if (((gj) this).field_P == null) {
                        break L20;
                      } else {
                        if (((gj) this).field_P.field_s.a(10, (byte) -82)) {
                          break L20;
                        } else {
                          if (!((gj) this).field_P.field_s.a(2, (byte) 122)) {
                            ((gj) this).field_W.b((byte) 118);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    if (((gj) this).field_W.field_l.field_R != 1) {
                      break L19;
                    } else {
                      ((gj) this).a(((gj) this).field_P, (byte) -52);
                      ((gj) this).field_J = false;
                      lf.field_c = 0;
                      break L19;
                    }
                  } else {
                    break L19;
                  }
                }
                L21: {
                  if (((gj) this).field_C.field_R != 1) {
                    break L21;
                  } else {
                    if (((gj) this).field_l) {
                      break L21;
                    } else {
                      if (((gj) this).field_ab) {
                        break L21;
                      } else {
                        if (((gj) this).field_w) {
                          break L21;
                        } else {
                          if (((gj) this).field_cb) {
                            break L21;
                          } else {
                            if (!cm.field_v) {
                              break L21;
                            } else {
                              this.a((byte) -126);
                              ((gj) this).field_cb = true;
                              ((gj) this).field_J = false;
                              ((gj) this).field_e.a(false, ((gj) this).field_Y, ((gj) this).field_h.field_A);
                              uca.a(22, (byte) 103);
                              qm.a(35, 7758);
                              break L21;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                ((gj) this).field_k = ((gj) this).field_k - 1;
                break L18;
              }
            }
          }
        }
        L22: {
          if (1 < ((gj) this).field_k) {
            break L22;
          } else {
            break L22;
          }
        }
        L23: {
          if (((gj) this).field_cb) {
            break L23;
          } else {
            if (((gj) this).field_A != null) {
              break L23;
            } else {
              if (((gj) this).field_s == null) {
                break L23;
              } else {
                if (((gj) this).field_l) {
                  break L23;
                } else {
                  if (((gj) this).field_ab) {
                    break L23;
                  } else {
                    if (((gj) this).field_O.field_T) {
                      break L23;
                    } else {
                      if (((gj) this).field_f > 0) {
                        break L23;
                      } else {
                        if (((gj) this).field_J) {
                          break L23;
                        } else {
                          if (1 != lf.field_c) {
                            break L23;
                          } else {
                            ((gj) this).field_E = ((gj) this).field_s.field_h;
                            ((gj) this).field_q = ((gj) this).field_s.field_s;
                            if (nd.field_h != 1) {
                              break L23;
                            } else {
                              if (0 > ((gj) this).field_q) {
                                break L23;
                              } else {
                                if (~((gj) this).field_h.field_z >= ~((gj) this).field_q) {
                                  break L23;
                                } else {
                                  if (((gj) this).field_E < 0) {
                                    break L23;
                                  } else {
                                    if (((gj) this).field_E >= ((gj) this).field_h.field_B) {
                                      break L23;
                                    } else {
                                      if (null == ((gj) this).field_h.field_a[((gj) this).field_q][((gj) this).field_E].field_l) {
                                        break L23;
                                      } else {
                                        if (~((gj) this).field_n != ~((gj) this).field_h.field_a[((gj) this).field_q][((gj) this).field_E].field_l.field_D) {
                                          break L23;
                                        } else {
                                          this.a(false, ((gj) this).a(((gj) this).field_E, true, ((gj) this).field_q));
                                          break L23;
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
        L24: {
          if (!((gj) this).field_d) {
            break L24;
          } else {
            ((gj) this).field_i = ((gj) this).field_i - 1;
            if (((gj) this).field_i > 0) {
              break L24;
            } else {
              ((gj) this).field_d = false;
              break L24;
            }
          }
        }
        L25: {
          if (((gj) this).field_n >= 0) {
            this.b(true);
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          if (!((gj) this).field_e.field_a) {
            break L26;
          } else {
            if (((gj) this).field_cb) {
              break L26;
            } else {
              if (((gj) this).field_u > 500) {
                break L26;
              } else {
                L27: {
                  if (null != ((gj) this).field_Z) {
                    ((gj) this).m(10);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                this.a((byte) 126);
                ((gj) this).field_cb = true;
                ((gj) this).field_J = false;
                ((gj) this).field_e.a(false, ((gj) this).field_Y, ((gj) this).field_h.field_A);
                break L26;
              }
            }
          }
        }
        L28: {
          if (((gj) this).field_p == 250) {
            qm.a(36, 7758);
            break L28;
          } else {
            break L28;
          }
        }
        L29: {
          if (((gj) this).field_n < 0) {
            break L29;
          } else {
            L30: {
              L31: {
                if (((gj) this).field_h.field_S[((gj) this).field_n].field_c) {
                  break L31;
                } else {
                  if (!((gj) this).field_h.b((byte) 61, ((gj) this).field_n)) {
                    break L30;
                  } else {
                    break L31;
                  }
                }
              }
              if (((gj) this).field_cb) {
                break L30;
              } else {
                this.a((byte) 54);
                ((gj) this).field_cb = true;
                ((gj) this).field_J = false;
                break L29;
              }
            }
            break L29;
          }
        }
    }

    public static void p(int param0) {
        field_F = null;
        if (param0 != -1) {
            field_F = null;
        }
    }

    private final void c(byte param0) {
        gm var2 = null;
        ad var3 = null;
        int var4 = 0;
        tv var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gm var9 = null;
        int stackIn_21_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        var8 = BachelorFridge.field_y;
        var9 = (gm) (Object) ((gj) this).field_Z;
        var2 = var9;
        var3 = ((gj) this).field_G[((gj) this).field_Z.field_h.field_f];
        ((gj) this).field_N = ((gj) this).field_s.field_s;
        ((gj) this).field_H = ((gj) this).field_s.field_h;
        if (((gj) this).field_N < 0) {
          return;
        } else {
          L0: {
            if (((gj) this).field_h.field_z <= ((gj) this).field_N) {
              break L0;
            } else {
              if (((gj) this).field_H < 0) {
                break L0;
              } else {
                if (((gj) this).field_h.field_B <= ((gj) this).field_H) {
                  break L0;
                } else {
                  L1: {
                    var4 = var3.field_s.f((byte) 127);
                    var5 = (tv) (Object) ur.field_e[var9.field_g];
                    if (32 == var3.field_s.field_y) {
                      break L1;
                    } else {
                      if (((gj) this).field_h.field_E != 0) {
                        break L1;
                      } else {
                        if (((gj) this).field_h.field_a[var3.field_s.field_x][var3.field_s.field_J].field_i) {
                          break L1;
                        } else {
                          var4 = var4 >> 1;
                          break L1;
                        }
                      }
                    }
                  }
                  L2: {
                    if (hl.a((byte) 100, var2.field_g)) {
                      var4 = var4 << 1;
                      var4 = var4 + var5.field_l;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      L5: {
                        if (var3.field_s.field_x != ((gj) this).field_N) {
                          break L5;
                        } else {
                          if (!((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_g) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (((gj) this).field_H != var3.field_s.field_J) {
                          break L6;
                        } else {
                          if (((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_g) {
                            break L6;
                          } else {
                            var6 = -var3.field_s.field_x + ((gj) this).field_N;
                            ((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_g = true;
                            var7 = Math.abs(var6);
                            L7: while (true) {
                              L8: {
                                L9: {
                                  if (var7 <= 0) {
                                    break L9;
                                  } else {
                                    stackOut_20_0 = var6;
                                    stackIn_41_0 = stackOut_20_0;
                                    stackIn_21_0 = stackOut_20_0;
                                    if (var8 != 0) {
                                      break L8;
                                    } else {
                                      L10: {
                                        if (stackIn_21_0 > 0) {
                                          break L10;
                                        } else {
                                          if (var6 < 0) {
                                            L11: {
                                              L12: {
                                                if (0 > -var7 + var3.field_s.field_x) {
                                                  break L12;
                                                } else {
                                                  if (!var3.field_s.a(((gj) this).field_h.field_a[-var7 + var3.field_s.field_x][var3.field_s.field_J].field_n, false)) {
                                                    break L12;
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                              }
                                              var6 = -(var7 + -1);
                                              if (-var7 + ((gj) this).field_q > 0) {
                                                break L11;
                                              } else {
                                                if (var8 == 0) {
                                                  break L9;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                            var7--;
                                            if (var8 == 0) {
                                              continue L7;
                                            } else {
                                              break L10;
                                            }
                                          } else {
                                            continue L7;
                                          }
                                        }
                                      }
                                      L13: {
                                        L14: {
                                          if (var3.field_s.field_x - -var7 >= ((gj) this).field_h.field_z) {
                                            break L14;
                                          } else {
                                            if (!var3.field_s.a(((gj) this).field_h.field_a[var7 + var3.field_s.field_x][var3.field_s.field_J].field_n, false)) {
                                              break L14;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        var6 = var7 - 1;
                                        if (((gj) this).field_q + var7 < -1 + ((gj) this).field_h.field_z) {
                                          break L13;
                                        } else {
                                          if (var8 == 0) {
                                            break L9;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      var7--;
                                      if (var8 == 0) {
                                        continue L7;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                stackOut_40_0 = 0;
                                stackIn_41_0 = stackOut_40_0;
                                break L8;
                              }
                              L15: {
                                L16: {
                                  L17: {
                                    if (stackIn_41_0 == var6) {
                                      break L17;
                                    } else {
                                      if (Math.abs(var6) <= var4) {
                                        break L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  ((gj) this).m(10);
                                  ((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_g = false;
                                  if (var8 == 0) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                                this.a(false, (byte) -88, var2, var6);
                                break L15;
                              }
                              if (var8 == 0) {
                                break L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      ((gj) this).m(10);
                      ((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_g = false;
                      if (var8 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                    ((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_g = true;
                    var6 = ((gj) this).field_H + -var3.field_s.field_J;
                    var7 = Math.abs(var6);
                    L18: while (true) {
                      L19: {
                        L20: {
                          if (var7 <= 0) {
                            break L20;
                          } else {
                            stackOut_52_0 = -1;
                            stackOut_52_1 = ~var6;
                            stackIn_73_0 = stackOut_52_0;
                            stackIn_73_1 = stackOut_52_1;
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            if (var8 != 0) {
                              break L19;
                            } else {
                              L21: {
                                if (stackIn_53_0 > stackIn_53_1) {
                                  break L21;
                                } else {
                                  if (var6 < 0) {
                                    L22: {
                                      L23: {
                                        if (var3.field_s.field_J + -var7 < 0) {
                                          break L23;
                                        } else {
                                          if (var3.field_s.a(((gj) this).field_h.field_a[var3.field_s.field_x][-var7 + var3.field_s.field_J].field_n, false)) {
                                            break L22;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                      var6 = -(-1 + var7);
                                      if (var3.field_s.field_J - var7 > 0) {
                                        break L22;
                                      } else {
                                        if (var8 == 0) {
                                          break L20;
                                        } else {
                                          break L22;
                                        }
                                      }
                                    }
                                    var7--;
                                    if (var8 == 0) {
                                      continue L18;
                                    } else {
                                      break L21;
                                    }
                                  } else {
                                    continue L18;
                                  }
                                }
                              }
                              L24: {
                                L25: {
                                  if (((gj) this).field_h.field_B <= var3.field_s.field_J - -var7) {
                                    break L25;
                                  } else {
                                    if (var3.field_s.a(((gj) this).field_h.field_a[var3.field_s.field_x][var7 + var3.field_s.field_J].field_n, false)) {
                                      break L24;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                                var6 = -1 + var7;
                                if (((gj) this).field_h.field_B > var3.field_s.field_J + var7) {
                                  break L24;
                                } else {
                                  if (var8 == 0) {
                                    break L20;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              var7--;
                              if (var8 == 0) {
                                continue L18;
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                        stackOut_72_0 = -1;
                        stackOut_72_1 = ~var6;
                        stackIn_73_0 = stackOut_72_0;
                        stackIn_73_1 = stackOut_72_1;
                        break L19;
                      }
                      L26: {
                        L27: {
                          if (stackIn_73_0 == stackIn_73_1) {
                            break L27;
                          } else {
                            if (Math.abs(var6) <= var4) {
                              break L26;
                            } else {
                              break L27;
                            }
                          }
                        }
                        ((gj) this).m(10);
                        ((gj) this).field_h.field_a[((gj) this).field_N][((gj) this).field_H].field_g = false;
                        if (var8 == 0) {
                          break L3;
                        } else {
                          break L26;
                        }
                      }
                      this.a(true, (byte) -88, var2, var6);
                      break L3;
                    }
                  }
                  ((gj) this).field_N = -1;
                  ((gj) this).field_H = -1;
                  return;
                }
              }
            }
          }
          return;
        }
    }

    private final void b(int param0) {
        ej.a(592, 16776960, fha.field_j[-1 + ((gj) this).field_M][0], true, 16, 86);
        ej.a(592, 16776960, fha.field_j[-1 + ((gj) this).field_M][1], true, 30, -66);
        if (!(!((gj) this).field_e.field_a)) {
            ika.a(3, 2, 563, 16777215, -54, 52, ((gj) this).field_p / 50, 256);
            ika.a(3, 1, 597, 16777215, -120, 52, ((gj) this).field_p / 50, 256);
        }
        int var2 = -21;
    }

    final void a(int param0) {
        if (param0 != 7955) {
            return;
        }
        if (((gj) this).field_A != null) {
            ((gj) this).field_A.d(15204352);
        }
    }

    final void n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        var2 = -90 % ((47 - param0) / 50);
        if (((gj) this).field_h.field_o != 2) {
          return;
        } else {
          var3 = 0;
          L0: while (true) {
            L1: {
              if (var3 >= ((gj) this).field_h.field_i.length) {
                break L1;
              } else {
                if (var4 != 0) {
                  break L1;
                } else {
                  L2: {
                    if (-1 != ((gj) this).field_h.field_i[var3][2]) {
                      ((gj) this).field_T[((gj) this).field_h.field_i[var3][2]] = ((gj) this).field_T[((gj) this).field_h.field_i[var3][2]] + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var3++;
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return;
          }
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
        int[] var9 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
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
              var9 = new int[256];
              var5_array = var9;
              var6_int = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (var6_int >= 256) {
                      break L7;
                    } else {
                      var9[var6_int] = 65793 * var6_int;
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
                    if (var7 >= 8) {
                      break L9;
                    } else {
                      var6[var7] = 0;
                      var7++;
                      if (var8 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        if (var8 == 0) {
                          continue L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("gj.<init>(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L10;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L10;
            }
          }
          L11: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L11;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L11;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param3 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean h(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 115) {
          L0: {
            L1: {
              if (null == ((gj) this).field_A) {
                break L1;
              } else {
                if (!((gj) this).field_A.field_b) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final void h(int param0) {
        int var2 = 0;
        kv var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = BachelorFridge.field_y;
        if (13 == gf.field_k) {
          L0: {
            var2 = 1;
            if (!((gj) this).field_e.field_a) {
              break L0;
            } else {
              L1: {
                if (((gj) this).field_n < 0) {
                  break L1;
                } else {
                  if ((1 << ((gj) this).field_n & ((gj) this).field_h.field_s) != 0) {
                    break L1;
                  } else {
                    L2: {
                      if (((gj) this).field_h.field_r) {
                        break L2;
                      } else {
                        var2 = 2;
                        if (var4 == 0) {
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    dg.g(0, 0, 640, 480);
                    var3 = new kv(640, 480);
                    fc.a(480, 640, var3, 0, (byte) -90, 0);
                    eq.a(var3, (gj) this, (byte) -111);
                    sia.field_h = false;
                    var2 = 3;
                    if (var4 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var2 = 4;
              break L0;
            }
          }
          lg.a(true, var2, false);
          return;
        } else {
          L3: {
            if (param0 == 480) {
              break L3;
            } else {
              var5 = null;
              ((gj) this).a(96, (ad) null, -66);
              break L3;
            }
          }
          L4: {
            if (gf.field_k == 102) {
              ((gj) this).field_s.a((byte) -57, ((gj) this).field_E, ((gj) this).field_q);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (hea.field_r < 2) {
              break L5;
            } else {
              if (gf.field_k != 50) {
                break L5;
              } else {
                if (!wga.field_q[82]) {
                  break L5;
                } else {
                  sja.field_fb.c(93, (byte) 113);
                  System.out.println("--- STATE DUMP REQUESTED ---");
                  System.out.println(((gj) this).field_h.k((byte) -72));
                  System.out.println("--- STATE DUMP ENDS ---");
                  break L5;
                }
              }
            }
          }
          return;
        }
    }

    final ad a(int param0, boolean param1, int param2) {
        if (param1) {
            ((gj) this).field_X = null;
        }
        return ((gj) this).b(((gj) this).field_h.field_a[param2][param0].field_l, -23990);
    }

    final void a(byte param0, int param1) {
        tv var3 = null;
        if (((gj) this).field_P == null) {
          return;
        } else {
          L0: {
            if (!this.a(((gj) this).field_P.field_s, (byte) 19)) {
              break L0;
            } else {
              if (!((gj) this).field_P.field_s.a(8, (byte) 55)) {
                L1: {
                  qm.a(10, 7758);
                  ((gj) this).field_ab = false;
                  ((gj) this).field_w = false;
                  ((gj) this).field_l = true;
                  if (param0 <= -28) {
                    break L1;
                  } else {
                    boolean discarded$2 = this.c(107);
                    break L1;
                  }
                }
                ((gj) this).field_db = param1;
                var3 = (tv) (Object) al.a(-113, ((gj) this).field_P.field_s.field_o.field_g.field_b[((gj) this).field_P.field_s.field_m[((gj) this).field_db]]);
                ((gj) this).field_P.a(16776960, 89, var3.field_f);
                ((gj) this).field_Z = (sfa) (Object) new gm(((gj) this).field_P.field_s.field_o.field_g.field_b[((gj) this).field_P.field_s.field_m[((gj) this).field_db]], ((gj) this).field_P.field_s);
                return;
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    private final void j(int param0) {
        ad[][] var2 = null;
        int var3 = 0;
        ad[] var4 = null;
        ad[] var5 = null;
        int var6 = 0;
        ad var7 = null;
        int var8 = 0;
        Object var9 = null;
        ad[][] var10 = null;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          L1: {
            var8 = BachelorFridge.field_y;
            ((gj) this).field_U = 0;
            ((gj) this).field_Y = new sfa[7];
            if (null == ((gj) this).field_o) {
              break L1;
            } else {
              var10 = ((gj) this).field_o;
              var2 = var10;
              var3 = 0;
              L2: while (true) {
                if (var10.length <= var3) {
                  break L1;
                } else {
                  var4 = var10[var3];
                  var5 = var4;
                  stackOut_3_0 = 0;
                  stackIn_15_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var8 != 0) {
                    break L0;
                  } else {
                    var6 = stackIn_4_0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (var6 >= var5.length) {
                            break L5;
                          } else {
                            var7 = var5[var6];
                            if (var8 != 0) {
                              break L4;
                            } else {
                              L6: {
                                if (var7 == null) {
                                  break L6;
                                } else {
                                  var7.field_l = false;
                                  if (var7.field_s.field_I > 0) {
                                    var7.b(false);
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var6++;
                              if (var8 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var3++;
                        break L4;
                      }
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_14_0 = -15503;
          stackIn_15_0 = stackOut_14_0;
          break L0;
        }
        L7: {
          if (stackIn_15_0 == -15503) {
            break L7;
          } else {
            var9 = null;
            this.a((ad) null, -22, (ad) null, -20, (byte) -100);
            break L7;
          }
        }
    }

    final int c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          var3 = 8421504;
          if (param1 == 2271) {
            break L0;
          } else {
            ((gj) this).field_I = 87;
            break L0;
          }
        }
        L1: {
          if (param0 == -1) {
            break L1;
          } else {
            L2: {
              if (param0 != 0) {
                break L2;
              } else {
                var3 = 16711680;
                if (var4 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 != 1) {
                break L3;
              } else {
                var3 = 6735384;
                if (var4 == 0) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 != 2) {
                break L4;
              } else {
                var3 = 16776960;
                if (var4 == 0) {
                  break L1;
                } else {
                  break L4;
                }
              }
            }
            if (param0 == 3) {
              var3 = 33243;
              break L1;
            } else {
              break L1;
            }
          }
        }
        return var3;
    }

    static {
    }
}
