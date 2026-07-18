/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj implements cl {
    static String field_e;
    private int field_s;
    private int field_t;
    static cn field_o;
    static int field_u;
    private pj field_h;
    static String field_p;
    private int[][] field_w;
    private wm field_k;
    private cn field_f;
    private int field_q;
    static volatile boolean field_g;
    static String field_j;
    static int field_m;
    private wm field_i;
    private int field_l;
    private cn field_c;
    private rh[][] field_v;
    private cn field_b;
    static int field_r;
    private int[] field_a;
    private int[] field_n;
    private cn field_d;

    public final void a(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((lj) this).field_c = null;
                break L1;
              }
            }
            L2: {
              if (((lj) this).field_t <= 0) {
                break L2;
              } else {
                var2_int = (((lj) this).field_t << 8) / 80;
                var3 = ((lj) this).field_h.field_B;
                var4 = var3 / 7;
                var5 = var3 % 7;
                var6 = -224 - (-((var5 + var4) * 32) - ((lj) this).field_q);
                var7 = -24 + (24 * (var4 + -var5) + (168 + ((lj) this).field_l));
                ((lj) this).field_b.b(var6, var7, var2_int);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "lj.C(" + param0 + ')');
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
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
            param0.setFocusTraversalKeysEnabled(false);
            var2_int = -126 % ((21 - param1) / 40);
            param0.addKeyListener((java.awt.event.KeyListener) (Object) in.field_C);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) in.field_C);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("lj.N(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw vk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, ph param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 > 2) {
              this.a(param4.field_a, -32, param3, param2, param0);
              param4.d(param2, param0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("lj.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    public final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        rh[] var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        rh var5_ref = null;
        int[] var6 = null;
        int var7 = 0;
        rh[] var8 = null;
        int var9 = 0;
        rh var10 = null;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        Object stackIn_64_0 = null;
        Object stackIn_82_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        Object stackOut_63_0 = null;
        Object stackOut_81_0 = null;
        var11 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param0 == -30876) {
                break L1;
              } else {
                int discarded$1 = this.a(false, 55);
                break L1;
              }
            }
            L2: while (true) {
              stackOut_4_0 = var2_int;
              stackOut_4_1 = 49;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_5_0 >= stackIn_5_1) {
                      break L5;
                    } else {
                      stackOut_6_0 = ((lj) this).field_h.field_p.a(var2_int, (byte) 122);
                      stackIn_28_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var11 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (!stackIn_7_0) {
                            break L6;
                          } else {
                            ((lj) this).field_n[var2_int] = ((lj) this).field_n[var2_int] + 4;
                            break L6;
                          }
                        }
                        L7: {
                          if (((lj) this).field_n[var2_int] > 256) {
                            ((lj) this).field_n[var2_int] = 256;
                            if ((3 & mo.field_a) != 0) {
                              break L7;
                            } else {
                              if (null == ((lj) this).field_v[var2_int]) {
                                break L7;
                              } else {
                                var3 = ((lj) this).field_v[var2_int];
                                var4 = 0;
                                L8: while (true) {
                                  if (var3.length <= var4) {
                                    break L7;
                                  } else {
                                    var5_ref = var3[var4];
                                    var5_ref.field_a = var5_ref.field_a - 1;
                                    stackOut_21_0 = -236;
                                    stackOut_21_1 = ~var5_ref.field_a;
                                    stackIn_5_0 = stackOut_21_0;
                                    stackIn_5_1 = stackOut_21_1;
                                    stackIn_22_0 = stackOut_21_0;
                                    stackIn_22_1 = stackOut_21_1;
                                    if (var11 != 0) {
                                      continue L3;
                                    } else {
                                      L9: {
                                        if (stackIn_22_0 < stackIn_22_1) {
                                          var5_ref.field_a = 235;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      }
                                      var4++;
                                      if (var11 == 0) {
                                        continue L8;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                        var2_int++;
                        if (var11 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  stackOut_27_0 = ~((lj) this).field_s;
                  stackIn_28_0 = stackOut_27_0;
                  break L4;
                }
                L10: {
                  L11: {
                    L12: {
                      L13: {
                        if (stackIn_28_0 == 0) {
                          break L13;
                        } else {
                          if (((lj) this).field_s + 160 <= mo.field_a) {
                            break L13;
                          } else {
                            L14: {
                              var2_int = mo.field_a - ((lj) this).field_s;
                              if (16 <= var2_int) {
                                if (var2_int >= 72) {
                                  stackOut_38_0 = -(2 * var2_int) + 400;
                                  stackIn_39_0 = stackOut_38_0;
                                  break L14;
                                } else {
                                  stackOut_36_0 = 256;
                                  stackIn_39_0 = stackOut_36_0;
                                  break L14;
                                }
                              } else {
                                stackOut_33_0 = var2_int * 16;
                                stackIn_39_0 = stackOut_33_0;
                                break L14;
                              }
                            }
                            var3_int = stackIn_39_0;
                            var4 = je.field_d.length;
                            var5 = new int[var4];
                            var6 = new int[var4];
                            var7 = 0;
                            L15: while (true) {
                              L16: {
                                L17: {
                                  if (~var7 <= ~var4) {
                                    break L17;
                                  } else {
                                    var5[var7] = hj.a((byte) 113, 12582912, var3_int, je.field_d[var7]);
                                    var6[var7] = hj.a((byte) 127, 65793, var3_int, rg.field_P[var7]);
                                    var7++;
                                    if (var11 != 0) {
                                      break L16;
                                    } else {
                                      if (var11 == 0) {
                                        continue L15;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                                var7 = 0;
                                break L16;
                              }
                              L18: while (true) {
                                stackOut_46_0 = -50;
                                stackOut_46_1 = ~var7;
                                stackIn_47_0 = stackOut_46_0;
                                stackIn_47_1 = stackOut_46_1;
                                L19: while (true) {
                                  L20: {
                                    if (stackIn_47_0 >= stackIn_47_1) {
                                      break L20;
                                    } else {
                                      if (var11 != 0) {
                                        break L12;
                                      } else {
                                        L21: {
                                          if (null == ((lj) this).field_v[var7]) {
                                            break L21;
                                          } else {
                                            var8 = ((lj) this).field_v[var7];
                                            var9 = 0;
                                            L22: while (true) {
                                              if (~var9 <= ~var8.length) {
                                                break L21;
                                              } else {
                                                var10 = var8[var9];
                                                var10.field_e = var5[((lj) this).field_a[var7]];
                                                var10.field_h = var6[((lj) this).field_a[var7]];
                                                stackOut_54_0 = ~var2_int;
                                                stackOut_54_1 = -121;
                                                stackIn_47_0 = stackOut_54_0;
                                                stackIn_47_1 = stackOut_54_1;
                                                stackIn_55_0 = stackOut_54_0;
                                                stackIn_55_1 = stackOut_54_1;
                                                if (var11 != 0) {
                                                  continue L19;
                                                } else {
                                                  L23: {
                                                    if (stackIn_55_0 > stackIn_55_1) {
                                                      var10.field_a = 256;
                                                      break L23;
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                  var9++;
                                                  if (var11 == 0) {
                                                    continue L22;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var7++;
                                        if (var11 == 0) {
                                          continue L18;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var2_int = 0;
                      L24: while (true) {
                        if (49 <= var2_int) {
                          break L12;
                        } else {
                          stackOut_63_0 = this;
                          stackIn_82_0 = stackOut_63_0;
                          stackIn_64_0 = stackOut_63_0;
                          if (var11 != 0) {
                            break L11;
                          } else {
                            L25: {
                              L26: {
                                L27: {
                                  if (((lj) this).field_v[var2_int] != null) {
                                    break L27;
                                  } else {
                                    if (var11 == 0) {
                                      break L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var3 = ((lj) this).field_v[var2_int];
                                var4 = 0;
                                L28: while (true) {
                                  if (~var4 <= ~var3.length) {
                                    break L26;
                                  } else {
                                    var5_ref = var3[var4];
                                    var5_ref.field_e = je.field_d[((lj) this).field_a[var2_int]];
                                    var5_ref.field_h = rg.field_P[((lj) this).field_a[var2_int]];
                                    var4++;
                                    if (var11 != 0) {
                                      break L25;
                                    } else {
                                      if (var11 == 0) {
                                        continue L28;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                }
                              }
                              var2_int++;
                              break L25;
                            }
                            if (var11 == 0) {
                              continue L24;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                    }
                    if (((lj) this).field_t > 0) {
                      stackOut_81_0 = this;
                      stackIn_82_0 = stackOut_81_0;
                      break L11;
                    } else {
                      break L10;
                    }
                  }
                  ((lj) this).field_t = ((lj) this).field_t - 1;
                  break L10;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "lj.E(" + param0 + ')');
        }
    }

    public final void a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (0 < param2) {
                  break L2;
                } else {
                  if (!param0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param2 % 30 < 15) {
                  break L3;
                } else {
                  ec.a(((lj) this).field_l, ((lj) this).field_q + -224, (byte) -72, ((lj) this).field_f, 16711680, 256);
                  if (DungeonAssault.field_K == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              ((lj) this).field_f.b(-224 + ((lj) this).field_q, ((lj) this).field_l, 256);
              break L1;
            }
            L4: {
              if (param1 == -1723) {
                break L4;
              } else {
                ((lj) this).field_l = -37;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var4, "lj.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 % 7 == 0) {
                break L1;
              } else {
                if (((lj) this).field_i.a(-(param1 / 7) + (param1 - 1), (byte) 87)) {
                  var3_int = var3_int | 1;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 % 7 == 6) {
                break L2;
              } else {
                if (!((lj) this).field_i.a(-(param1 / 7) + param1, (byte) 123)) {
                  break L2;
                } else {
                  var3_int = var3_int | 2;
                  break L2;
                }
              }
            }
            L3: {
              if (!param0) {
                break L3;
              } else {
                ((lj) this).b(-31);
                break L3;
              }
            }
            L4: {
              if (param1 <= 6) {
                break L4;
              } else {
                if (((lj) this).field_i.a(param1 + 35, (byte) 122)) {
                  var3_int = var3_int | 4;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param1 >= 42) {
                break L5;
              } else {
                if (!((lj) this).field_i.a(param1 + 42, (byte) 118)) {
                  break L5;
                } else {
                  var3_int = var3_int | 8;
                  break L5;
                }
              }
            }
            stackOut_27_0 = var3_int;
            stackIn_28_0 = stackOut_27_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "lj.U(" + param0 + ',' + param1 + ')');
        }
        return stackIn_28_0;
    }

    public static void d(int param0) {
        field_j = null;
        field_p = null;
        if (param0 < 53) {
            return;
        }
        try {
            field_o = null;
            field_e = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "lj.M(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        cn var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            var7_ref = fm.b(param1 + -29348, param3);
            if (null == var7_ref) {
              return;
            } else {
              L1: {
                L2: {
                  if (param2 == param1) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        var8 = var7_ref.field_E * param2 >> 8;
                        var9 = param2 * var7_ref.field_G >> 8;
                        if (param4 != 256) {
                          break L4;
                        } else {
                          var7_ref.c(-(var8 >> 1) + param0, param5 + -var9, var8, var9);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var7_ref.d(param0 - (var8 >> 1), -var9 + param5, var8, var9, param4);
                      break L3;
                    }
                    if (var10 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L5: {
                  if (param4 == 256) {
                    break L5;
                  } else {
                    var7_ref.d(-(var7_ref.field_E >> 1) + param0, param5 + -var7_ref.field_G, param4);
                    if (var10 == 0) {
                      break L1;
                    } else {
                      break L5;
                    }
                  }
                }
                var7_ref.h(param0 + -(var7_ref.field_E >> 1), -var7_ref.field_G + param5);
                break L1;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var7, "lj.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7 = -95 % ((43 - param2) / 50);
              var6_int = ((lj) this).field_h.field_h[param1].field_a;
              if (((lj) this).field_h.field_p.a(param1, (byte) 106)) {
                break L1;
              } else {
                if (param1 != 24) {
                  var6_int = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            i.field_r[var6_int].e(param4, param0 + 1, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "lj.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        boolean stackIn_40_0 = false;
        int stackIn_69_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        boolean stackOut_39_0 = false;
        int stackOut_68_0 = 0;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              jh.c();
              if (null != ((lj) this).field_c) {
                break L1;
              } else {
                ((lj) this).field_c = new cn(448, 356);
                ((lj) this).field_f = new cn(480, 388);
                ((lj) this).field_f.field_w = -16;
                ((lj) this).field_f.field_A = -16;
                break L1;
              }
            }
            ((lj) this).field_c.e();
            gf.a();
            var2_int = 0;
            L2: while (true) {
              stackOut_5_0 = -8;
              stackIn_6_0 = stackOut_5_0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_6_0 >= ~var2_int) {
                      break L5;
                    } else {
                      var3 = 32 * (6 - var2_int);
                      var4 = var2_int * 24;
                      var5 = -var2_int + 6;
                      stackOut_7_0 = 0;
                      stackIn_33_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var8 != 0) {
                        break L4;
                      } else {
                        var6 = stackIn_8_0;
                        L6: while (true) {
                          L7: {
                            if (~var6 <= ~(1 + var2_int)) {
                              break L7;
                            } else {
                              var7 = 16777215;
                              stackOut_10_0 = ((lj) this).field_h.field_m.a(var5, (byte) 92);
                              stackIn_6_0 = stackOut_10_0 ? 1 : 0;
                              stackIn_11_0 = stackOut_10_0;
                              if (var8 != 0) {
                                continue L3;
                              } else {
                                L8: {
                                  L9: {
                                    if (!stackIn_11_0) {
                                      break L9;
                                    } else {
                                      if (((lj) this).field_h.field_j.a(var5, (byte) 86)) {
                                        break L9;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  var7 = 0;
                                  break L8;
                                }
                                L10: {
                                  if (0 == var5) {
                                    break L10;
                                  } else {
                                    if (6 == var5) {
                                      break L10;
                                    } else {
                                      ri.field_d[5].e(var3, var4, var7);
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  if (6 == var5) {
                                    break L11;
                                  } else {
                                    if (var5 == 48) {
                                      break L11;
                                    } else {
                                      ri.field_d[4].e(32 + var3, var4, var7);
                                      break L11;
                                    }
                                  }
                                }
                                this.b(var4, var5, -75, var7, var3);
                                var5 += 8;
                                var6++;
                                var3 += 64;
                                if (var8 == 0) {
                                  continue L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var8 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  stackOut_32_0 = 7;
                  stackIn_33_0 = stackOut_32_0;
                  break L4;
                }
                var2_int = stackIn_33_0;
                L12: while (true) {
                  stackOut_34_0 = 13;
                  stackIn_35_0 = stackOut_34_0;
                  L13: while (true) {
                    L14: {
                      L15: {
                        if (stackIn_35_0 <= var2_int) {
                          break L15;
                        } else {
                          var3 = 32 * (-6 + var2_int);
                          var4 = var2_int * 24;
                          var5 = var2_int * 7 + -42;
                          stackOut_36_0 = 0;
                          stackIn_69_0 = stackOut_36_0;
                          stackIn_37_0 = stackOut_36_0;
                          if (var8 != 0) {
                            break L14;
                          } else {
                            var6 = stackIn_37_0;
                            L16: while (true) {
                              L17: {
                                if (var6 >= 13 - var2_int) {
                                  break L17;
                                } else {
                                  var7 = 16777215;
                                  stackOut_39_0 = ((lj) this).field_h.field_m.a(var5, (byte) 106);
                                  stackIn_35_0 = stackOut_39_0 ? 1 : 0;
                                  stackIn_40_0 = stackOut_39_0;
                                  if (var8 != 0) {
                                    continue L13;
                                  } else {
                                    L18: {
                                      L19: {
                                        if (!stackIn_40_0) {
                                          break L19;
                                        } else {
                                          if (((lj) this).field_h.field_j.a(var5, (byte) 74)) {
                                            break L19;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      var7 = 0;
                                      break L18;
                                    }
                                    L20: {
                                      ri.field_d[5].e(var3, var4, var7);
                                      ri.field_d[4].e(var3 + 32, var4, var7);
                                      this.b(var4, var5, 115, var7, var3);
                                      if (var6 != 0) {
                                        break L20;
                                      } else {
                                        if (var5 == 0) {
                                          break L20;
                                        } else {
                                          if (var5 == 42) {
                                            break L20;
                                          } else {
                                            ri.field_d[5].e(var3 - -32, 24 + var4, 0);
                                            break L20;
                                          }
                                        }
                                      }
                                    }
                                    L21: {
                                      if (var6 != 12 - var2_int) {
                                        break L21;
                                      } else {
                                        if (42 == var5) {
                                          break L21;
                                        } else {
                                          if (48 != var5) {
                                            ri.field_d[4].e(var3, var4 - -24, 0);
                                            break L21;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                    var5 += 8;
                                    var6++;
                                    var3 += 64;
                                    if (var8 == 0) {
                                      continue L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                              }
                              var2_int++;
                              if (var8 == 0) {
                                continue L12;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                      stackOut_68_0 = param0;
                      stackIn_69_0 = stackOut_68_0;
                      break L14;
                    }
                    L22: {
                      if (stackIn_69_0 == -20827) {
                        break L22;
                      } else {
                        ((lj) this).field_w = null;
                        break L22;
                      }
                    }
                    ((lj) this).field_f.e();
                    gf.a();
                    ((lj) this).field_c.e(16, 16, 16744448);
                    gf.d(8, 8, 0, 0, ((lj) this).field_f.field_y, ((lj) this).field_f.field_v);
                    ((lj) this).field_c.e(16, 16, 0);
                    jh.b();
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "lj.J(" + param0 + ')');
        }
    }

    public final void a(byte param0) {
        try {
            int var2_int = -126 / ((4 - param0) / 45);
            ((lj) this).field_s = mo.field_a;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "lj.H(" + param0 + ')');
        }
    }

    public final int b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 19091) {
                break L1;
              } else {
                ((lj) this).field_s = 60;
                break L1;
              }
            }
            L2: {
              param2 = param2 - ((lj) this).field_l;
              param0 = param0 - ((lj) this).field_q;
              var4_int = (3 * param0 - (-672 + 4 * (-168 + param2))) / 192;
              var5 = (param2 * 4 + param0 * 3) / 192;
              if (var4_int < 0) {
                break L2;
              } else {
                if (var5 < 0) {
                  break L2;
                } else {
                  if (var4_int >= 7) {
                    break L2;
                  } else {
                    if (var5 >= 7) {
                      break L2;
                    } else {
                      stackOut_13_0 = var5 * 7 - -var4_int;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    }
                  }
                }
              }
            }
            stackOut_15_0 = -1;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var4, "lj.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_16_0;
    }

    public final gg b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        gg stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        gg stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var3_int = param0 % 7;
              var4 = param0 / 7;
              if (param1 == -15390) {
                break L1;
              } else {
                this.a(-20, -18, 83, -99, 20, -65);
                break L1;
              }
            }
            stackOut_3_0 = new gg(-192 + (32 * (var3_int + var4) + ((lj) this).field_q), 168 + (24 * (var4 + -var3_int) + ((lj) this).field_l));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "lj.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(cn param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int[] var12_ref_int__ = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        boolean stackIn_18_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_17_0 = false;
        int stackOut_24_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var19 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param1 == -32) {
                break L1;
              } else {
                this.b(-31, -114, 86, -38, -41);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != ((lj) this).field_h) {
                  break L3;
                } else {
                  L4: {
                    var10 = 256;
                    var11 = 10066329;
                    if (gm.field_d.field_L[param2].field_a != 0) {
                      break L4;
                    } else {
                      var10 = 128;
                      break L4;
                    }
                  }
                  var6_int = var10 * (192 - -((16711680 & var11) >> 18)) / 255;
                  var7 = var10 * (192 - -(63 & var11 >> 10)) / 255;
                  var8 = var10 * ((var11 >> 2 & 63) + 192) / 255;
                  if (var19 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (((lj) this).field_h.field_p.a(param2, (byte) 89)) {
                  break L5;
                } else {
                  L6: {
                    if (param2 != 24) {
                      break L6;
                    } else {
                      var6_int = 96;
                      var8 = 0;
                      var7 = 48;
                      if (var19 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var6_int = 0;
                  var7 = 0;
                  var8 = 0;
                  var10_ref_int__ = ((lj) this).field_h.a((byte) 120, param2);
                  var11 = 0;
                  var12_ref_int__ = var10_ref_int__;
                  var13 = 0;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (~var12_ref_int__.length >= ~var13) {
                          break L9;
                        } else {
                          var14 = var12_ref_int__[var13];
                          stackOut_17_0 = ((lj) this).field_h.field_p.a(var14, (byte) 80);
                          stackIn_25_0 = stackOut_17_0 ? 1 : 0;
                          stackIn_18_0 = stackOut_17_0;
                          if (var19 != 0) {
                            break L8;
                          } else {
                            L10: {
                              if (stackIn_18_0) {
                                var15 = this.a((byte) -103, var14);
                                var16 = je.field_d[((lj) this).field_a[var14]];
                                var6_int = var6_int + (192 + ((16711680 & var16) >> 18)) * var15 / 255;
                                var7 = var7 + (192 - -(var16 >> 10 & 63)) * var15 / 255;
                                var8 = var8 + (192 - -((var16 & 255) >> 2)) * var15 / 255;
                                var11++;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            var13++;
                            if (var19 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      stackOut_24_0 = var11;
                      stackIn_25_0 = stackOut_24_0;
                      break L8;
                    }
                    L11: {
                      if (stackIn_25_0 <= 0) {
                        break L11;
                      } else {
                        var12 = 4 * var11;
                        var7 = var7 / var12;
                        var6_int = var6_int / var12;
                        var8 = var8 / var12;
                        break L11;
                      }
                    }
                    var7 += 16;
                    var6_int += 16;
                    var8 += 16;
                    var9 = var6_int - (-(var7 << 1) - var8) >> 2;
                    if (var19 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              var9 = this.a((byte) -72, param2);
              var10 = je.field_d[((lj) this).field_a[param2]];
              var8 = (192 + ((255 & var10) >> 2)) * var9 / 255;
              var6_int = (192 - -((var10 & 16711680) >> 18)) * var9 / 255;
              var7 = var9 * ((var10 >> 10 & 63) + 192) / 255;
              if (((lj) this).field_s != -1) {
                var11 = mo.field_a - ((lj) this).field_s;
                if (var11 < 200) {
                  L12: {
                    if (var11 >= 16) {
                      if (72 > var11) {
                        stackOut_40_0 = 256;
                        stackIn_41_0 = stackOut_40_0;
                        break L12;
                      } else {
                        stackOut_38_0 = -(2 * var11) + 400;
                        stackIn_41_0 = stackOut_38_0;
                        break L12;
                      }
                    } else {
                      stackOut_35_0 = var11 * 16;
                      stackIn_41_0 = stackOut_35_0;
                      break L12;
                    }
                  }
                  var12 = stackIn_41_0;
                  var8 = var8 * (256 + -var12) >>> 8;
                  var7 = (-var12 + 256) * var7 >>> 8;
                  var6_int = (var12 >> 1) + ((-var12 + 256) * var6_int >>> 8);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            var10 = 0;
            var11 = param3 + param0.field_w + gf.field_i * (param0.field_A + param4);
            var12 = -param0.field_y + gf.field_i;
            var14 = -param0.field_v;
            L13: while (true) {
              L14: {
                L15: {
                  if (var14 >= 0) {
                    break L15;
                  } else {
                    if (var19 != 0) {
                      break L14;
                    } else {
                      var13 = -param0.field_y;
                      L16: while (true) {
                        L17: {
                          L18: {
                            if (var13 >= 0) {
                              break L18;
                            } else {
                              var15 = param0.field_B[var10];
                              stackOut_47_0 = ~var15;
                              stackOut_47_1 = -1;
                              stackIn_54_0 = stackOut_47_0;
                              stackIn_54_1 = stackOut_47_1;
                              stackIn_48_0 = stackOut_47_0;
                              stackIn_48_1 = stackOut_47_1;
                              if (var19 != 0) {
                                break L17;
                              } else {
                                L19: {
                                  if (stackIn_48_0 == stackIn_48_1) {
                                    break L19;
                                  } else {
                                    var16 = var15 & 16711680;
                                    var17 = var15 & 65280;
                                    var17 = var17 * var7;
                                    var18 = 255 & var15;
                                    var16 = var16 * var6_int;
                                    var18 = var18 * var8;
                                    var15 = 65280 & var18 | (16711680 & var17 | var16 & -16777216);
                                    gf.field_b[var11] = mp.a(var15 >>> 8, -16777216);
                                    break L19;
                                  }
                                }
                                var11++;
                                var13++;
                                var10++;
                                if (var19 == 0) {
                                  continue L16;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                          stackOut_53_0 = var11;
                          stackOut_53_1 = var12;
                          stackIn_54_0 = stackOut_53_0;
                          stackIn_54_1 = stackOut_53_1;
                          break L17;
                        }
                        var11 = stackIn_54_0 + stackIn_54_1;
                        var14++;
                        if (var19 == 0) {
                          continue L13;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                }
                break L14;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_56_0 = (RuntimeException) var6;
            stackOut_56_1 = new StringBuilder().append("lj.R(");
            stackIn_59_0 = stackOut_56_0;
            stackIn_59_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L20;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_60_0 = stackOut_57_0;
              stackIn_60_1 = stackOut_57_1;
              stackIn_60_2 = stackOut_57_2;
              break L20;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              jh.c();
              if (((lj) this).field_d == null) {
                ((lj) this).field_d = new cn(64, 68);
                ((lj) this).field_b = new cn(96, 100);
                ((lj) this).field_b.field_w = -16;
                ((lj) this).field_b.field_A = -16;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((lj) this).field_d.e();
              gf.a();
              var4_int = 0;
              var5 = 0;
              ri.field_d[5].e(var4_int, var5, 16777215);
              ri.field_d[4].e(var4_int + 32, var5, 16777215);
              this.b(var5, param2, -127, 16777215, var4_int);
              ((lj) this).field_b.e();
              gf.a();
              ((lj) this).field_d.e(16, 16, param1);
              gf.d(16, 16, 0, 0, ((lj) this).field_b.field_y, ((lj) this).field_b.field_v);
              ((lj) this).field_d.e(16, 16, 0);
              jh.b();
              ((lj) this).field_t = 80;
              if (param0 == -9398) {
                break L2;
              } else {
                this.a(-70, -121, 96, 85, 77);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var4, "lj.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        hb[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_35_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_33_0 = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            var5_int = 0;
            var6 = new hb[4];
            var7 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (4 <= var7) {
                      break L4;
                    } else {
                      stackOut_3_0 = this;
                      stackIn_35_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var8 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (((lj) this).field_h.field_A[var7] == null) {
                            break L5;
                          } else {
                            if ((6 & ((lj) this).field_h.field_A[var7].field_o) != 0) {
                              break L5;
                            } else {
                              int incrementValue$1 = var5_int;
                              var5_int++;
                              var6[incrementValue$1] = ((lj) this).field_h.field_A[var7];
                              break L5;
                            }
                          }
                        }
                        var7++;
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (0 == var5_int) {
                    return;
                  } else {
                    L6: {
                      if (var5_int == 1) {
                        break L6;
                      } else {
                        L7: {
                          if (2 == var5_int) {
                            break L7;
                          } else {
                            L8: {
                              if (var5_int != 3) {
                                break L8;
                              } else {
                                this.a(param1 + 20, 256, 128, var6[0].field_c, param2, param3 + 37);
                                this.a(44 + param1, 256, 128, var6[1].field_c, param2, param3 - -37);
                                this.a(param1 + 32, 256, 128, var6[2].field_c, param2, 48 + param3);
                                if (var8 == 0) {
                                  break L2;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            this.a(param1 - -32, 256, 96, var6[0].field_c, param2, 31 + param3);
                            this.a(param1 - -16, 256, 96, var6[1].field_c, param2, param3 + 41);
                            this.a(48 + param1, 256, 96, var6[2].field_c, param2, 41 + param3);
                            this.a(32 + param1, 256, 96, var6[3].field_c, param2, 51 + param3);
                            if (var8 == 0) {
                              break L2;
                            } else {
                              break L7;
                            }
                          }
                        }
                        this.a(22 + param1, 256, 144, var6[0].field_c, param2, 45 + param3);
                        this.a(42 + param1, 256, 144, var6[1].field_c, param2, param3 - -45);
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackOut_33_0 = this;
                    stackIn_35_0 = stackOut_33_0;
                    break L3;
                  }
                }
                this.a(param1 - -32, 256, 192, var6[0].field_c, param2, param3 + 45);
                break L2;
              }
              var7 = -60 % ((param0 - -54) / 39);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var5, "lj.V(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        ai var7 = null;
        int var7_int = 0;
        cn var7_ref = null;
        int[] var7_array = null;
        rh[] var7_array2 = null;
        int var8 = 0;
        int var9_int = 0;
        rh var9 = null;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param3 == -25) {
                break L1;
              } else {
                field_u = -46;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != ((lj) this).field_h) {
                  break L3;
                } else {
                  L4: {
                    var7 = gm.field_d.field_L[param2];
                    if (qj.field_c[param2] != null) {
                      var7 = qj.field_c[param2];
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var5_int = var7.field_a;
                  var6 = 1;
                  if (var10 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var5_int = ((lj) this).field_h.field_h[param2].field_a;
              var6 = ((lj) this).field_h.field_p.a(param2, (byte) 106) ? 1 : 0;
              break L2;
            }
            L5: {
              L6: {
                if (var6 != 0) {
                  break L6;
                } else {
                  if (param2 == 24) {
                    break L6;
                  } else {
                    L7: {
                      this.a(i.field_r[0], -32, param2, param0, param1 + 1);
                      if (param2 <= 6) {
                        break L7;
                      } else {
                        var7_int = param2 - 7;
                        if (!((lj) this).field_h.field_p.a(var7_int, (byte) 110)) {
                          break L7;
                        } else {
                          if (!((lj) this).field_i.a(var7_int + 42, (byte) 78)) {
                            break L7;
                          } else {
                            ec.a(18 + param1, param0, (byte) -80, mf.field_b[0], (je.field_d[((lj) this).field_a[var7_int]] >> 1 & 8355711) + 8421504, this.a((byte) -11, var7_int) >> 2);
                            break L7;
                          }
                        }
                      }
                    }
                    L8: {
                      if (param2 % 7 != 6) {
                        var7_int = 1 + param2;
                        if (!((lj) this).field_h.field_p.a(var7_int, (byte) 93)) {
                          break L8;
                        } else {
                          if (!((lj) this).field_i.a(param2 + -(param2 / 7), (byte) 121)) {
                            break L8;
                          } else {
                            ec.a(param1 + 18, param0, (byte) -90, mf.field_b[1], 8421504 + (8355711 & je.field_d[((lj) this).field_a[var7_int]] >> 1), this.a((byte) -8, var7_int) >> 2);
                            break L8;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param2 >= 42) {
                        break L9;
                      } else {
                        var7_int = 7 + param2;
                        if (!((lj) this).field_h.field_p.a(var7_int, (byte) 104)) {
                          break L9;
                        } else {
                          if (((lj) this).field_i.a(param2 + 42, (byte) 97)) {
                            ec.a(param1 + 18, param0, (byte) -128, mf.field_b[2], (8355711 & je.field_d[((lj) this).field_a[var7_int]] >> 1) + 8421504, this.a((byte) -67, var7_int) >> 2);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    if (0 == param2 % 7) {
                      break L5;
                    } else {
                      L10: {
                        var7_int = -1 + param2;
                        if (!((lj) this).field_h.field_p.a(var7_int, (byte) 114)) {
                          break L10;
                        } else {
                          if (((lj) this).field_i.a(var7_int - var7_int / 7, (byte) 101)) {
                            ec.a(18 + param1, param0, (byte) -105, mf.field_b[3], ((je.field_d[((lj) this).field_a[var7_int]] & 16711422) >> 1) + 8421504, this.a((byte) -36, var7_int) >> 2);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      if (var10 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              }
              L11: {
                L12: {
                  if (var6 != 0) {
                    break L12;
                  } else {
                    L13: {
                      if (var5_int == 0) {
                        break L13;
                      } else {
                        i.field_r[var5_int].h(param0, param1 + 1);
                        if (var10 == 0) {
                          break L11;
                        } else {
                          break L13;
                        }
                      }
                    }
                    var7_int = ((lj) this).field_h.d(param2, 30813);
                    mc.field_w[var7_int].h(param0, 1 + param1);
                    if (var10 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                L14: {
                  L15: {
                    if (var5_int != 0) {
                      break L15;
                    } else {
                      var7_int = this.a(false, param2);
                      this.a(mc.field_w[var7_int], -32, param2, param0, param1 - 7);
                      if (var10 == 0) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  this.a(i.field_r[var5_int], -32, param2, param0, param1 + 1);
                  if (gh.field_i[var5_int].field_g != 2) {
                    break L14;
                  } else {
                    L16: {
                      if (((lj) this).field_h == null) {
                        break L16;
                      } else {
                        if (!((lj) this).field_h.field_j.a(param2, (byte) 101)) {
                          break L16;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var7_ref = jb.a((byte) -70, var5_int);
                    if (var7_ref == null) {
                      break L14;
                    } else {
                      L17: {
                        if (null != ((lj) this).field_h) {
                          break L17;
                        } else {
                          if (null == var7_ref) {
                            break L14;
                          } else {
                            var8 = var7_ref.field_E * 5 >> 3;
                            var9_int = var7_ref.field_G * 5 >> 3;
                            var7_ref.c(param0 + (-var8 + 48 >> 1), 40 + (param1 + -var9_int), var8, var9_int);
                            if (var10 == 0) {
                              break L14;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      var7_ref.h(-(var7_ref.field_y >> 1) + (param0 - -32), -var7_ref.field_v + (24 + (21 + param1)));
                      break L14;
                    }
                  }
                }
                if (((lj) this).field_h == null) {
                  break L11;
                } else {
                  L18: {
                    L19: {
                      L20: {
                        if (((lj) this).field_v[param2] == null) {
                          break L20;
                        } else {
                          var7_array = ((lj) this).field_w[param2];
                          var8 = 0;
                          L21: while (true) {
                            L22: {
                              if (~var8 <= ~var7_array.length) {
                                break L22;
                              } else {
                                var9_int = var7_array[var8];
                                sn.field_c[var9_int].h(param0, param1);
                                var8++;
                                if (var10 != 0) {
                                  break L20;
                                } else {
                                  if (var10 == 0) {
                                    continue L21;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            var7_array2 = ((lj) this).field_v[param2];
                            var8 = 0;
                            L23: while (true) {
                              if (~var7_array2.length >= ~var8) {
                                break L20;
                              } else {
                                var9 = var7_array2[var8];
                                var9.e();
                                var8++;
                                if (var10 != 0) {
                                  break L19;
                                } else {
                                  if (var10 == 0) {
                                    continue L23;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (param2 > 6) {
                        break L19;
                      } else {
                        break L18;
                      }
                    }
                    var7_int = -7 + param2;
                    if (!((lj) this).field_h.field_p.a(var7_int, (byte) 106)) {
                      break L18;
                    } else {
                      if (!((lj) this).field_i.a(var7_int - -42, (byte) 86)) {
                        break L18;
                      } else {
                        ec.a(18 + param1, param0, (byte) -111, mf.field_b[0], 8421504 - -((16711422 & je.field_d[((lj) this).field_a[var7_int]]) >> 1), this.a((byte) -39, var7_int) >> 2);
                        break L18;
                      }
                    }
                  }
                  L24: {
                    if (param2 % 7 != 6) {
                      var7_int = param2 + 1;
                      if (!((lj) this).field_h.field_p.a(var7_int, (byte) 110)) {
                        break L24;
                      } else {
                        if (!((lj) this).field_i.a(-(param2 / 7) + param2, (byte) 92)) {
                          break L24;
                        } else {
                          ec.a(param1 - -18, param0, (byte) -82, mf.field_b[1], ((je.field_d[((lj) this).field_a[var7_int]] & 16711422) >> 1) + 8421504, this.a((byte) -57, var7_int) >> 2);
                          break L24;
                        }
                      }
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (param2 >= 42) {
                      break L25;
                    } else {
                      var7_int = 7 + param2;
                      if (!((lj) this).field_h.field_p.a(var7_int, (byte) 93)) {
                        break L25;
                      } else {
                        if (!((lj) this).field_i.a(param2 + 42, (byte) 92)) {
                          break L25;
                        } else {
                          ec.a(param1 + 18, param0, (byte) -111, mf.field_b[2], 8421504 + ((je.field_d[((lj) this).field_a[var7_int]] & 16711422) >> 1), this.a((byte) -56, var7_int) >> 2);
                          break L25;
                        }
                      }
                    }
                  }
                  if (param2 % 7 == 0) {
                    break L11;
                  } else {
                    var7_int = param2 + -1;
                    if (!((lj) this).field_h.field_p.a(var7_int, (byte) 69)) {
                      break L11;
                    } else {
                      if (((lj) this).field_i.a(var7_int + -(var7_int / 7), (byte) 67)) {
                        ec.a(18 + param1, param0, (byte) -104, mf.field_b[3], 8421504 - -(8355711 & je.field_d[((lj) this).field_a[var7_int]] >> 1), this.a((byte) -52, var7_int) >> 2);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
              }
              if (((lj) this).field_h != null) {
                L26: {
                  if (((lj) this).field_h.field_q != param2) {
                    break L26;
                  } else {
                    this.a((byte) 56, param0, 256, param1);
                    if (var10 == 0) {
                      break L5;
                    } else {
                      break L26;
                    }
                  }
                }
                if (~param2 != ~((lj) this).field_h.field_B) {
                  break L5;
                } else {
                  if (gh.field_i[var5_int].field_g != 2) {
                    L27: {
                      var7_ref = fm.b(-29092, ((lj) this).field_h.field_u.field_c);
                      if (null == var7_ref) {
                        break L27;
                      } else {
                        var7_ref.d((64 + -var7_ref.field_y >> 1) + param0, -var7_ref.field_v + param1 - -45, 80);
                        break L27;
                      }
                    }
                    this.a((byte) -107, param0, 80, param1);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var5, "lj.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    lj(go param0, int param1, int param2) {
        this(param1, param2);
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
            ((lj) this).field_h = param0.field_Y;
            ((lj) this).field_i = ((lj) this).field_h.field_v;
            ((lj) this).field_a = new int[49];
            ((lj) this).field_n = new int[49];
            ((lj) this).field_w = new int[49][];
            ((lj) this).field_v = new rh[49][];
            ((lj) this).field_k = new wm(84);
            ((lj) this).field_s = -1;
            ((lj) this).a(15122, 0);
            ((lj) this).a(15122, 6);
            ((lj) this).a(15122, 42);
            ((lj) this).a(15122, 48);
            this.c((byte) 125);
            ((lj) this).b(-20827);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("lj.<init>(");
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
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(int param0) {
        if (param0 != 2985) {
            return;
        }
        try {
            ((lj) this).field_t = 0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "lj.D(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        try {
            ((lj) this).field_w[param1][param0] = param4;
            var6_int = 1 + ((lj) this).field_q + (32 * (param1 / 7 - -(param1 % 7)) - 224 - -ud.field_w[param4]);
            int var8 = -118 / ((param2 - 32) / 44);
            var7 = -21 + r.field_b[param4] + (168 - -(24 * (-(param1 % 7) + param1 / 7))) + ((lj) this).field_l;
            ((lj) this).field_a[param1] = param3;
            ((lj) this).field_v[param1][param0] = new rh(var6_int, var7, 20, 40, je.field_d[param3], rg.field_P[param3], 256);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "lj.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_13_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_199_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_196_0 = 0;
        var13 = DungeonAssault.field_K;
        try {
          L0: {
            nb.field_d.h(13 + (-320 + (((lj) this).field_q + 79)), ((lj) this).field_l - -13);
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (168 < var2_int) {
                    break L3;
                  } else {
                    gf.b(-(var2_int * 4 / 3) + ((lj) this).field_q, var2_int + (18 + ((lj) this).field_l), 8 * var2_int / 3, 0);
                    gf.b(-(4 * var2_int / 3) + ((lj) this).field_q, -var2_int + 354 + ((lj) this).field_l, 8 * var2_int / 3, 0);
                    var2_int++;
                    if (var13 != 0) {
                      break L2;
                    } else {
                      if (var13 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == -55) {
                  break L2;
                } else {
                  ((lj) this).field_n = null;
                  break L2;
                }
              }
              var2_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_int >= 7) {
                      break L6;
                    } else {
                      var3 = -(32 * (1 + var2_int)) + ((lj) this).field_q;
                      var4 = var2_int * 24 + ((lj) this).field_l;
                      var5 = -var2_int + 6;
                      stackOut_12_0 = 0;
                      stackIn_119_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var13 != 0) {
                        break L5;
                      } else {
                        var6 = stackIn_13_0;
                        L7: while (true) {
                          L8: {
                            L9: {
                              if (1 + var2_int <= var6) {
                                break L9;
                              } else {
                                if (var13 != 0) {
                                  break L8;
                                } else {
                                  L10: {
                                    L11: {
                                      if (null == ((lj) this).field_h) {
                                        break L11;
                                      } else {
                                        if (!((lj) this).field_h.field_p.a(var5, (byte) 104)) {
                                          stackOut_24_0 = 0;
                                          stackIn_25_0 = stackOut_24_0;
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    stackOut_22_0 = 1;
                                    stackIn_25_0 = stackOut_22_0;
                                    break L10;
                                  }
                                  L12: {
                                    L13: {
                                      var7 = stackIn_25_0;
                                      if (var6 != 0) {
                                        break L13;
                                      } else {
                                        if (var5 == 0) {
                                          break L12;
                                        } else {
                                          if (var5 != 6) {
                                            this.a(var4, 9, var3, var5, ua.field_b[5]);
                                            if (var13 == 0) {
                                              break L12;
                                            } else {
                                              break L13;
                                            }
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                    L14: {
                                      L15: {
                                        var8 = -7 + var5;
                                        if (var7 != 0) {
                                          break L15;
                                        } else {
                                          if (!((lj) this).field_h.field_p.a(var8, (byte) 67)) {
                                            stackOut_41_0 = 0;
                                            stackIn_42_0 = stackOut_41_0;
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      stackOut_39_0 = 1;
                                      stackIn_42_0 = stackOut_39_0;
                                      break L14;
                                    }
                                    L16: {
                                      var9 = stackIn_42_0;
                                      var10 = 5;
                                      if (var9 != 0) {
                                        var11 = ((lj) this).field_i.a(42 + var8, (byte) 123) ? 1 : 0;
                                        if (var11 != 0) {
                                          L17: {
                                            L18: {
                                              if (((lj) this).field_h == null) {
                                                break L18;
                                              } else {
                                                L19: {
                                                  L20: {
                                                    if (((lj) this).field_h.field_j.a(var5, (byte) 110)) {
                                                      break L20;
                                                    } else {
                                                      if (~((lj) this).field_h.field_B != ~var5) {
                                                        break L19;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  if (((lj) this).field_h.field_j.a(var8, (byte) 103)) {
                                                    break L18;
                                                  } else {
                                                    if (~var8 != ~((lj) this).field_h.field_B) {
                                                      break L19;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                }
                                                stackOut_63_0 = 0;
                                                stackIn_64_0 = stackOut_63_0;
                                                break L17;
                                              }
                                            }
                                            stackOut_61_0 = 1;
                                            stackIn_64_0 = stackOut_61_0;
                                            break L17;
                                          }
                                          L21: {
                                            var12 = stackIn_64_0;
                                            if (var12 != 0) {
                                              stackOut_67_0 = 1;
                                              stackIn_68_0 = stackOut_67_0;
                                              break L21;
                                            } else {
                                              stackOut_65_0 = 3;
                                              stackIn_68_0 = stackOut_65_0;
                                              break L21;
                                            }
                                          }
                                          var10 = stackIn_68_0;
                                          break L16;
                                        } else {
                                          break L16;
                                        }
                                      } else {
                                        break L16;
                                      }
                                    }
                                    this.a(var4, param0 ^ -31, var3, var5, ua.field_b[var10]);
                                    break L12;
                                  }
                                  L22: {
                                    L23: {
                                      if (~var2_int != ~var6) {
                                        break L23;
                                      } else {
                                        if (var5 == 6) {
                                          break L22;
                                        } else {
                                          if (var5 != 48) {
                                            this.a(var4, 121, 32 + var3, var5, ua.field_b[4]);
                                            if (var13 == 0) {
                                              break L22;
                                            } else {
                                              break L23;
                                            }
                                          } else {
                                            break L22;
                                          }
                                        }
                                      }
                                    }
                                    L24: {
                                      L25: {
                                        var8 = var5 - -1;
                                        if (var7 != 0) {
                                          break L25;
                                        } else {
                                          if (!((lj) this).field_h.field_p.a(var8, (byte) 89)) {
                                            stackOut_86_0 = 0;
                                            stackIn_87_0 = stackOut_86_0;
                                            break L24;
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                      stackOut_84_0 = 1;
                                      stackIn_87_0 = stackOut_84_0;
                                      break L24;
                                    }
                                    L26: {
                                      var9 = stackIn_87_0;
                                      var10 = 4;
                                      if (var9 != 0) {
                                        var11 = ((lj) this).field_i.a(-(var5 / 7) + var5, (byte) 90) ? 1 : 0;
                                        if (var11 != 0) {
                                          L27: {
                                            L28: {
                                              if (((lj) this).field_h == null) {
                                                break L28;
                                              } else {
                                                L29: {
                                                  L30: {
                                                    if (((lj) this).field_h.field_j.a(var5, (byte) 66)) {
                                                      break L30;
                                                    } else {
                                                      if (var5 != ((lj) this).field_h.field_B) {
                                                        break L29;
                                                      } else {
                                                        break L30;
                                                      }
                                                    }
                                                  }
                                                  if (((lj) this).field_h.field_j.a(var8, (byte) 80)) {
                                                    break L28;
                                                  } else {
                                                    if (~var8 != ~((lj) this).field_h.field_B) {
                                                      break L29;
                                                    } else {
                                                      break L28;
                                                    }
                                                  }
                                                }
                                                stackOut_108_0 = 0;
                                                stackIn_109_0 = stackOut_108_0;
                                                break L27;
                                              }
                                            }
                                            stackOut_106_0 = 1;
                                            stackIn_109_0 = stackOut_106_0;
                                            break L27;
                                          }
                                          L31: {
                                            var12 = stackIn_109_0;
                                            if (var12 == 0) {
                                              stackOut_112_0 = 2;
                                              stackIn_113_0 = stackOut_112_0;
                                              break L31;
                                            } else {
                                              stackOut_110_0 = 0;
                                              stackIn_113_0 = stackOut_110_0;
                                              break L31;
                                            }
                                          }
                                          var10 = stackIn_113_0;
                                          break L26;
                                        } else {
                                          break L26;
                                        }
                                      } else {
                                        break L26;
                                      }
                                    }
                                    this.a(var4, param0 + 85, 32 + var3, var5, ua.field_b[var10]);
                                    break L22;
                                  }
                                  this.a(var3, var4, var5, -25);
                                  var6++;
                                  var3 += 64;
                                  var5 += 8;
                                  if (var13 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            var2_int++;
                            break L8;
                          }
                          if (var13 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  stackOut_118_0 = 7;
                  stackIn_119_0 = stackOut_118_0;
                  break L5;
                }
                var2_int = stackIn_119_0;
                L32: while (true) {
                  L33: {
                    L34: {
                      if (var2_int >= 13) {
                        break L34;
                      } else {
                        var3 = -(32 * (-var2_int + 13)) + ((lj) this).field_q;
                        var4 = var2_int * 24 + ((lj) this).field_l;
                        var5 = 7 * var2_int - 42;
                        if (var13 != 0) {
                          break L33;
                        } else {
                          var6 = 0;
                          L35: while (true) {
                            L36: {
                              L37: {
                                if (13 - var2_int <= var6) {
                                  break L37;
                                } else {
                                  if (var13 != 0) {
                                    break L36;
                                  } else {
                                    L38: {
                                      L39: {
                                        if (((lj) this).field_h == null) {
                                          break L39;
                                        } else {
                                          if (!((lj) this).field_h.field_p.a(var5, (byte) 75)) {
                                            stackOut_133_0 = 0;
                                            stackIn_134_0 = stackOut_133_0;
                                            break L38;
                                          } else {
                                            break L39;
                                          }
                                        }
                                      }
                                      stackOut_131_0 = 1;
                                      stackIn_134_0 = stackOut_131_0;
                                      break L38;
                                    }
                                    L40: {
                                      L41: {
                                        var7 = stackIn_134_0;
                                        var8 = -7 + var5;
                                        if (var7 != 0) {
                                          break L41;
                                        } else {
                                          if (!((lj) this).field_h.field_p.a(var8, (byte) 122)) {
                                            stackOut_140_0 = 0;
                                            stackIn_141_0 = stackOut_140_0;
                                            break L40;
                                          } else {
                                            break L41;
                                          }
                                        }
                                      }
                                      stackOut_138_0 = 1;
                                      stackIn_141_0 = stackOut_138_0;
                                      break L40;
                                    }
                                    L42: {
                                      var9 = stackIn_141_0;
                                      var10 = 5;
                                      if (var9 != 0) {
                                        var11 = ((lj) this).field_i.a(42 + var8, (byte) 121) ? 1 : 0;
                                        if (var11 != 0) {
                                          L43: {
                                            L44: {
                                              if (((lj) this).field_h == null) {
                                                break L44;
                                              } else {
                                                L45: {
                                                  L46: {
                                                    if (((lj) this).field_h.field_j.a(var5, (byte) 68)) {
                                                      break L46;
                                                    } else {
                                                      if (~var5 != ~((lj) this).field_h.field_B) {
                                                        break L45;
                                                      } else {
                                                        break L46;
                                                      }
                                                    }
                                                  }
                                                  if (((lj) this).field_h.field_j.a(var8, (byte) 103)) {
                                                    break L44;
                                                  } else {
                                                    if (~((lj) this).field_h.field_B != ~var8) {
                                                      break L45;
                                                    } else {
                                                      break L44;
                                                    }
                                                  }
                                                }
                                                stackOut_162_0 = 0;
                                                stackIn_163_0 = stackOut_162_0;
                                                break L43;
                                              }
                                            }
                                            stackOut_160_0 = 1;
                                            stackIn_163_0 = stackOut_160_0;
                                            break L43;
                                          }
                                          L47: {
                                            var12 = stackIn_163_0;
                                            if (var12 != 0) {
                                              stackOut_166_0 = 1;
                                              stackIn_167_0 = stackOut_166_0;
                                              break L47;
                                            } else {
                                              stackOut_164_0 = 3;
                                              stackIn_167_0 = stackOut_164_0;
                                              break L47;
                                            }
                                          }
                                          var10 = stackIn_167_0;
                                          break L42;
                                        } else {
                                          break L42;
                                        }
                                      } else {
                                        break L42;
                                      }
                                    }
                                    L48: {
                                      L49: {
                                        var8 = var5 - -1;
                                        this.a(var4, 5, var3, var5, ua.field_b[var10]);
                                        var10 = 4;
                                        if (var7 != 0) {
                                          break L49;
                                        } else {
                                          if (!((lj) this).field_h.field_p.a(var8, (byte) 95)) {
                                            stackOut_174_0 = 0;
                                            stackIn_175_0 = stackOut_174_0;
                                            break L48;
                                          } else {
                                            break L49;
                                          }
                                        }
                                      }
                                      stackOut_172_0 = 1;
                                      stackIn_175_0 = stackOut_172_0;
                                      break L48;
                                    }
                                    L50: {
                                      var9 = stackIn_175_0;
                                      if (var9 == 0) {
                                        break L50;
                                      } else {
                                        var11 = ((lj) this).field_i.a(-(var5 / 7) + var5, (byte) 116) ? 1 : 0;
                                        if (var11 != 0) {
                                          L51: {
                                            L52: {
                                              if (null == ((lj) this).field_h) {
                                                break L52;
                                              } else {
                                                L53: {
                                                  L54: {
                                                    if (((lj) this).field_h.field_j.a(var5, (byte) 88)) {
                                                      break L54;
                                                    } else {
                                                      if (var5 != ((lj) this).field_h.field_B) {
                                                        break L53;
                                                      } else {
                                                        break L54;
                                                      }
                                                    }
                                                  }
                                                  if (((lj) this).field_h.field_j.a(var8, (byte) 70)) {
                                                    break L52;
                                                  } else {
                                                    if (var8 != ((lj) this).field_h.field_B) {
                                                      break L53;
                                                    } else {
                                                      break L52;
                                                    }
                                                  }
                                                }
                                                stackOut_194_0 = 0;
                                                stackIn_195_0 = stackOut_194_0;
                                                break L51;
                                              }
                                            }
                                            stackOut_192_0 = 1;
                                            stackIn_195_0 = stackOut_192_0;
                                            break L51;
                                          }
                                          L55: {
                                            var12 = stackIn_195_0;
                                            if (var12 != 0) {
                                              stackOut_198_0 = 0;
                                              stackIn_199_0 = stackOut_198_0;
                                              break L55;
                                            } else {
                                              stackOut_196_0 = 2;
                                              stackIn_199_0 = stackOut_196_0;
                                              break L55;
                                            }
                                          }
                                          var10 = stackIn_199_0;
                                          break L50;
                                        } else {
                                          break L50;
                                        }
                                      }
                                    }
                                    L56: {
                                      this.a(var4, 115, var3 - -32, var5, ua.field_b[var10]);
                                      this.a(var3, var4, var5, -25);
                                      if (var6 != 0) {
                                        break L56;
                                      } else {
                                        if (var5 == 0) {
                                          break L56;
                                        } else {
                                          if (42 != var5) {
                                            ua.field_b[4].h(var3, var4 - -24);
                                            break L56;
                                          } else {
                                            break L56;
                                          }
                                        }
                                      }
                                    }
                                    L57: {
                                      if (~var6 != ~(12 - var2_int)) {
                                        break L57;
                                      } else {
                                        if (var5 == 42) {
                                          break L57;
                                        } else {
                                          if (var5 == 48) {
                                            break L57;
                                          } else {
                                            ua.field_b[5].h(32 + var3, var4 + 24);
                                            break L57;
                                          }
                                        }
                                      }
                                    }
                                    var3 += 64;
                                    var6++;
                                    var5 += 8;
                                    if (var13 == 0) {
                                      continue L35;
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                              }
                              var2_int++;
                              break L36;
                            }
                            if (var13 == 0) {
                              continue L32;
                            } else {
                              break L34;
                            }
                          }
                        }
                      }
                    }
                    break L33;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "lj.G(" + param0 + ')');
        }
    }

    public final void a(int param0, int param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        int stackOut_14_0 = 0;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            if (null == ((lj) this).field_w[param1]) {
              L1: {
                var3_array = ((lj) this).field_h.b(param1, (byte) -36);
                var4 = 0;
                if (param0 == 15122) {
                  break L1;
                } else {
                  ((lj) this).field_w = null;
                  break L1;
                }
              }
              var5_ref_int__ = var3_array;
              var6 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (~var6 <= ~var5_ref_int__.length) {
                      break L4;
                    } else {
                      var7_int = var5_ref_int__[var6];
                      stackOut_8_0 = ((lj) this).field_k.a(var7_int, (byte) 88);
                      stackIn_15_0 = stackOut_8_0 ? 1 : 0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var10 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_9_0) {
                            break L5;
                          } else {
                            var4++;
                            break L5;
                          }
                        }
                        var6++;
                        if (var10 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_14_0 = oi.b(0, 5);
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                }
                L6: {
                  L7: {
                    L8: {
                      var5 = stackIn_15_0;
                      if (var4 > 0) {
                        break L8;
                      } else {
                        ((lj) this).field_v[param1] = new rh[0];
                        ((lj) this).field_w[param1] = new int[0];
                        if (var10 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    ((lj) this).field_v[param1] = new rh[var4];
                    ((lj) this).field_w[param1] = new int[var4];
                    var6 = 0;
                    var7 = var3_array;
                    var8 = 0;
                    L9: while (true) {
                      if (~var8 <= ~var7.length) {
                        break L7;
                      } else {
                        var9 = var7[var8];
                        if (var10 != 0) {
                          break L6;
                        } else {
                          L10: {
                            if (((lj) this).field_k.a(var9, (byte) 93)) {
                              break L10;
                            } else {
                              L11: {
                                ((lj) this).field_k.a(var9, param0 + -15183);
                                if (~var9 != ~(-(param1 / 7) + (param1 - 1))) {
                                  break L11;
                                } else {
                                  int incrementValue$4 = var6;
                                  var6++;
                                  this.a(incrementValue$4, param1, param0 + -15007, var5, 6);
                                  break L11;
                                }
                              }
                              L12: {
                                if (~var9 == ~(param1 + -(param1 / 7))) {
                                  int incrementValue$5 = var6;
                                  var6++;
                                  this.a(incrementValue$5, param1, 98, var5, 3);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              L13: {
                                if (~(param1 + 35) != ~var9) {
                                  break L13;
                                } else {
                                  int incrementValue$6 = var6;
                                  var6++;
                                  this.a(incrementValue$6, param1, param0 + -15007, var5, 1);
                                  break L13;
                                }
                              }
                              if (var9 != param1 + 42) {
                                break L10;
                              } else {
                                int incrementValue$7 = var6;
                                var6++;
                                this.a(incrementValue$7, param1, 100, var5, 4);
                                break L10;
                              }
                            }
                          }
                          var8++;
                          if (var10 == 0) {
                            continue L9;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  break L6;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "lj.K(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        byte stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 49) {
                    break L3;
                  } else {
                    stackOut_3_0 = ~var2_int;
                    stackOut_3_1 = -1;
                    stackIn_23_0 = stackOut_3_0;
                    stackIn_23_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 == stackIn_4_1) {
                          break L4;
                        } else {
                          if (var2_int == 6) {
                            break L4;
                          } else {
                            if (42 == var2_int) {
                              break L4;
                            } else {
                              if (var2_int == 48) {
                                break L4;
                              } else {
                                if (!((lj) this).field_h.field_p.a(var2_int, (byte) 73)) {
                                  break L4;
                                } else {
                                  ((lj) this).a(15122, var2_int);
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      var2_int++;
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_22_0 = param0;
                stackOut_22_1 = 123;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                break L2;
              }
              L5: {
                if (stackIn_23_0 > stackIn_23_1) {
                  break L5;
                } else {
                  ((lj) this).field_c = null;
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "lj.Q(" + param0 + ')');
        }
    }

    private final int a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = ((lj) this).field_n[param1];
                if (var3_int >= 256) {
                  break L2;
                } else {
                  var4 = (int)(256.0 * (1.0 - Math.exp((double)(-var3_int) / 40.0)));
                  var5 = (int)((1.0 - Math.cos((double)var3_int * 3.141592653589793 / 128.0)) * 64.0);
                  var3_int = var4 + var5;
                  if (DungeonAssault.field_K == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3_int = 256;
              break L1;
            }
            L3: {
              var3_int = (int)((double)var3_int + 48.0 * te.c(param1, mo.field_a, 0.03125));
              if (param0 <= -1) {
                break L3;
              } else {
                ((lj) this).field_n = null;
                break L3;
              }
            }
            L4: {
              var3_int = var3_int >> 1;
              if (var3_int >= 40) {
                break L4;
              } else {
                var3_int = 40;
                break L4;
              }
            }
            stackOut_8_0 = var3_int;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "lj.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    private lj(int param0, int param1) {
        ((lj) this).field_c = null;
        ((lj) this).field_d = null;
        try {
            ((lj) this).field_l = -168 + param1;
            ((lj) this).field_q = param0;
            ((lj) this).field_i = gm.field_d.field_k;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "lj.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    lj(go param0, lj param1) {
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
        ((lj) this).field_c = null;
        ((lj) this).field_d = null;
        try {
          L0: {
            ((lj) this).field_q = param1.field_q;
            ((lj) this).field_l = param1.field_l;
            ((lj) this).field_h = param0.field_Y;
            ((lj) this).field_a = param1.field_a;
            ((lj) this).field_n = param1.field_n;
            ((lj) this).field_v = param1.field_v;
            ((lj) this).field_w = param1.field_w;
            ((lj) this).field_k = param1.field_k;
            ((lj) this).field_s = -1;
            ((lj) this).field_i = ((lj) this).field_h.field_v;
            this.c((byte) 126);
            ((lj) this).b(-20827);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("lj.<init>(");
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
          throw vk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 100;
        field_p = "Raider wins!";
        field_j = "Your initial Renown after the next reset will be increased by 100.";
        field_r = 200;
        field_g = false;
    }
}
