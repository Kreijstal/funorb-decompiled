/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends tj {
    int field_w;
    private boolean field_x;
    private int field_s;
    ji field_B;
    ji field_p;
    ji field_u;
    private int[] field_m;
    w field_C;
    int field_r;
    w field_n;
    w field_F;
    private int[] field_o;
    private int field_z;
    private static long[] field_D;
    boolean field_l;
    static nd field_G;
    static bd field_y;
    static gd field_v;
    static boolean field_t;
    static boolean field_q;
    static String field_E;
    static String field_A;

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param1 <= 0) {
                var4 = 96;
                stackOut_4_0 = var3_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3_int = var3_int << 1 | 1 & param2;
                param2 = param2 >>> 1;
                param1--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var3, "kd.R(" + 117 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_5_0;
    }

    private final void a(int param0, w param1, w param2) {
        try {
            ((kd) this).field_F = param2;
            ((kd) this).field_s = 1048576;
            ((kd) this).field_C = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "kd.S(" + -9 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0, w param1, byte param2, int param3) {
        RuntimeException var5 = null;
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
            param1.a(param0, -1, (byte) -89);
            param1.c(param3, 127);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("kd.T(").append(param0).append(44);
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
          throw wg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 38 + 44 + param3 + 41);
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        oc var5 = null;
        int var6 = 0;
        oj var6_ref_oj = null;
        qm var7 = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (ha.field_t != param0) {
              L1: {
                var2_int = ln.field_a.field_d;
                var3 = ln.field_a.field_a;
                if (param1 == 1) {
                  break L1;
                } else {
                  field_v = null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  L4: {
                    nh.field_E.a(-1, 8360, -1);
                    ha.field_t = param0;
                    var5 = new oc();
                    var6 = ha.field_t;
                    if (0 == var6) {
                      break L4;
                    } else {
                      if (var6 == 6) {
                        break L4;
                      } else {
                        if (var6 != 1) {
                          if (var6 != 2) {
                            if (var6 == 3) {
                              var4 = 0;
                              L5: while (true) {
                                L6: {
                                  if (~el.field_j >= ~var4) {
                                    break L6;
                                  } else {
                                    if (mm.field_m[var4].field_i != 8) {
                                      var4++;
                                      continue L5;
                                    } else {
                                      nh.field_E.a((byte) 46, mm.field_m[var4].field_j);
                                      break L6;
                                    }
                                  }
                                }
                                if (0 != bm.field_c) {
                                  break L3;
                                } else {
                                  if (nh.field_E.field_e != -1) {
                                    break L3;
                                  } else {
                                    kd.a(0, param1);
                                    eh.field_c.a(lm.field_A[3], 100, wj.field_O);
                                    r.field_a = 0;
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              if (var6 == 5) {
                                nh.field_E.a(40, 8360, 110);
                                break L2;
                              } else {
                                if (9 != var6) {
                                  if (var6 != 4) {
                                    if (10 == var6) {
                                      var6 = 0;
                                      var4 = 0;
                                      L7: while (true) {
                                        L8: {
                                          if (var4 >= dk.field_o) {
                                            break L8;
                                          } else {
                                            if (2 <= var6) {
                                              break L8;
                                            } else {
                                              L9: {
                                                var7 = vj.field_w[var4];
                                                if (var7.field_i < 49) {
                                                  break L9;
                                                } else {
                                                  if (var7.field_i > 52) {
                                                    break L9;
                                                  } else {
                                                    var6++;
                                                    nh.field_E.a((byte) 46, var7.field_j);
                                                    break L9;
                                                  }
                                                }
                                              }
                                              var4++;
                                              continue L7;
                                            }
                                          }
                                        }
                                        break L2;
                                      }
                                    } else {
                                      if (13 != var6) {
                                        if (var6 != 14) {
                                          if (var6 != 12) {
                                            break L3;
                                          } else {
                                            var4 = 0;
                                            L10: while (true) {
                                              if (~var4 <= ~ll.field_a) {
                                                if (nh.field_E.field_e != -1) {
                                                  break L3;
                                                } else {
                                                  kd.a(0, 1);
                                                  eh.field_c.a(lm.field_A[3], 100, wj.field_O);
                                                  break L2;
                                                }
                                              } else {
                                                L11: {
                                                  if (wh.field_b[var4].field_i == 2) {
                                                    if (11 != wh.field_b[var4].field_h) {
                                                      break L11;
                                                    } else {
                                                      nh.field_E.a((byte) 46, wh.field_b[var4].field_j);
                                                      break L11;
                                                    }
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                                var4++;
                                                continue L10;
                                              }
                                            }
                                          }
                                        } else {
                                          if (0 != bm.field_c) {
                                            break L3;
                                          } else {
                                            var4 = 0;
                                            L12: while (true) {
                                              if (var4 >= el.field_j) {
                                                break L3;
                                              } else {
                                                if (mm.field_m[var4].field_i == 127) {
                                                  nh.field_E.a((byte) 46, mm.field_m[var4].field_j);
                                                  break L2;
                                                } else {
                                                  var4++;
                                                  continue L12;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        nh.field_E.a(-1, 8360, -1);
                                        break L2;
                                      }
                                    }
                                  } else {
                                    var4 = 0;
                                    L13: while (true) {
                                      if (~var4 <= ~el.field_j) {
                                        break L3;
                                      } else {
                                        var6_ref_oj = mm.field_m[var4];
                                        if (var6_ref_oj.field_i != 125) {
                                          var4++;
                                          continue L13;
                                        } else {
                                          nh.field_E.a(-5 + var6_ref_oj.field_j.field_e, 8360, var6_ref_oj.field_j.field_g);
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
                          } else {
                            var4 = -1 + el.field_j;
                            L14: while (true) {
                              L15: {
                                if (0 > var4) {
                                  break L15;
                                } else {
                                  if (mm.field_m[var4].field_i == 4) {
                                    nh.field_E.a((byte) 46, mm.field_m[var4].field_j);
                                    break L15;
                                  } else {
                                    var4--;
                                    continue L14;
                                  }
                                }
                              }
                              if (nh.field_E.field_e != -1) {
                                break L3;
                              } else {
                                kd.a(0, param1);
                                eh.field_c.a(lm.field_A[3], 100, wj.field_O);
                                break L2;
                              }
                            }
                          }
                        } else {
                          var4 = 0;
                          L16: while (true) {
                            if (~el.field_j >= ~var4) {
                              break L3;
                            } else {
                              if (125 != mm.field_m[var4].field_i) {
                                var4++;
                                continue L16;
                              } else {
                                nh.field_E.a((byte) 46, mm.field_m[var4].field_j);
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var5.field_e = 0;
                  L17: while (true) {
                    if (~var2_int >= ~var5.field_e) {
                      if (bm.field_c == 0) {
                        L18: {
                          if (0 != rl.field_c) {
                            break L18;
                          } else {
                            if (bj.field_a) {
                              nh.field_E.a(45, 8360, 37);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                        if (1 != rl.field_c) {
                          break L3;
                        } else {
                          if (!tg.field_a) {
                            break L3;
                          } else {
                            nh.field_E.a(45, 8360, 37);
                            break L2;
                          }
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      var5.field_g = 0;
                      L19: while (true) {
                        if (~var3 >= ~var5.field_g) {
                          var5.field_e = var5.field_e + 1;
                          continue L17;
                        } else {
                          L20: {
                            var6 = ln.field_a.field_y[var5.b(-4)];
                            if (148 != var6) {
                              break L20;
                            } else {
                              nh.field_E.a(-1 + var5.field_e, 8360, -1 + var5.field_g);
                              break L20;
                            }
                          }
                          L21: {
                            if (157 != var6) {
                              break L21;
                            } else {
                              nh.field_E.a(-2 + var5.field_e, 8360, var5.field_g + -2);
                              break L21;
                            }
                          }
                          var5.field_g = var5.field_g + 1;
                          continue L19;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "kd.P(" + param0 + 44 + param1 + 41);
        }
    }

    final synchronized void a(int param0, byte param1, boolean param2, int param3, ji param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_32_0 = 0;
        w stackIn_41_0 = null;
        w stackIn_42_0 = null;
        w stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        w stackIn_51_0 = null;
        w stackIn_52_0 = null;
        w stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        w stackOut_50_0 = null;
        w stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        w stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        w stackOut_40_0 = null;
        w stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        w stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((kd) this).field_x) {
                break L1;
              } else {
                if (param2) {
                  L2: {
                    if (0 < ((kd) this).field_w) {
                      L3: {
                        if (null != ((kd) this).field_p) {
                          ((kd) this).field_F.e(4491);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((kd) this).field_p = param4;
                      if (param4 != null) {
                        ((kd) this).field_F.a(false, (byte) 20, param4);
                        this.a(param3, ((kd) this).field_F, (byte) 38, param5);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (null == ((kd) this).field_u) {
                          break L4;
                        } else {
                          ((kd) this).field_C.e(4491);
                          break L4;
                        }
                      }
                      ((kd) this).field_u = param4;
                      if (param4 != null) {
                        ((kd) this).field_C.a(false, (byte) 28, param4);
                        this.a(param3, ((kd) this).field_C, (byte) 38, param5);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              stackOut_17_0 = this;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (!param2) {
                stackOut_19_0 = this;
                stackOut_19_1 = 0;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L5;
              } else {
                stackOut_18_0 = this;
                stackOut_18_1 = 1;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L5;
              }
            }
            ((kd) this).field_x = stackIn_20_1 != 0;
            if (param4 == ((kd) this).field_p) {
              ((kd) this).field_w = param0;
              this.a(param3, ((kd) this).field_F, (byte) 38, param5);
              return;
            } else {
              if (((kd) this).field_u != param4) {
                L6: {
                  if (null != ((kd) this).field_p) {
                    if (((kd) this).field_u == null) {
                      var7_int = 0;
                      break L6;
                    } else {
                      L7: {
                        if (524288 <= ((kd) this).field_s) {
                          stackOut_31_0 = 0;
                          stackIn_32_0 = stackOut_31_0;
                          break L7;
                        } else {
                          stackOut_30_0 = 1;
                          stackIn_32_0 = stackOut_30_0;
                          break L7;
                        }
                      }
                      var7_int = stackIn_32_0;
                      break L6;
                    }
                  } else {
                    var7_int = 1;
                    break L6;
                  }
                }
                L8: {
                  if (var7_int == 0) {
                    L9: {
                      if (((kd) this).field_u != null) {
                        ((kd) this).field_C.e(4491);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      ((kd) this).field_u = param4;
                      if (param4 != null) {
                        L11: {
                          stackOut_50_0 = ((kd) this).field_C;
                          stackIn_52_0 = stackOut_50_0;
                          stackIn_51_0 = stackOut_50_0;
                          if (param2) {
                            stackOut_52_0 = (w) (Object) stackIn_52_0;
                            stackOut_52_1 = 0;
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            break L11;
                          } else {
                            stackOut_51_0 = (w) (Object) stackIn_51_0;
                            stackOut_51_1 = 1;
                            stackIn_53_0 = stackOut_51_0;
                            stackIn_53_1 = stackOut_51_1;
                            break L11;
                          }
                        }
                        ((w) (Object) stackIn_53_0).a(stackIn_53_1 != 0, (byte) 40, param4);
                        this.a(param3, ((kd) this).field_C, (byte) 38, param5);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    ((kd) this).field_w = -param0;
                    break L8;
                  } else {
                    L12: {
                      if (((kd) this).field_p != null) {
                        ((kd) this).field_F.e(4491);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      ((kd) this).field_p = param4;
                      if (param4 != null) {
                        L14: {
                          stackOut_40_0 = ((kd) this).field_F;
                          stackIn_42_0 = stackOut_40_0;
                          stackIn_41_0 = stackOut_40_0;
                          if (param2) {
                            stackOut_42_0 = (w) (Object) stackIn_42_0;
                            stackOut_42_1 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            stackIn_43_1 = stackOut_42_1;
                            break L14;
                          } else {
                            stackOut_41_0 = (w) (Object) stackIn_41_0;
                            stackOut_41_1 = 1;
                            stackIn_43_0 = stackOut_41_0;
                            stackIn_43_1 = stackOut_41_1;
                            break L14;
                          }
                        }
                        ((w) (Object) stackIn_43_0).a(stackIn_43_1 != 0, (byte) 116, param4);
                        this.a(param3, ((kd) this).field_F, (byte) 38, param5);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    ((kd) this).field_w = param0;
                    break L8;
                  }
                }
                var8 = -111 / ((param1 - -45) / 34);
                break L0;
              } else {
                ((kd) this).field_w = -param0;
                this.a(param3, ((kd) this).field_C, (byte) 38, param5);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var7;
            stackOut_57_1 = new StringBuilder().append("kd.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param4 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L15;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L15;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + 44 + param5 + 41);
        }
    }

    final synchronized void a(int param0, boolean param1) {
        ((kd) this).field_z = param0;
        if (!param1) {
            ((kd) this).field_x = false;
        }
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_32_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (0 >= ((kd) this).field_z) {
              ((kd) this).c(param2);
              return;
            } else {
              L1: {
                if (!((kd) this).field_x) {
                  break L1;
                } else {
                  L2: {
                    if (((kd) this).field_w <= 0) {
                      break L2;
                    } else {
                      if (!((kd) this).field_F.f(323697071)) {
                        ((kd) this).field_w = -((kd) this).field_w;
                        ((kd) this).field_p = null;
                        ((kd) this).field_x = false;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((kd) this).field_w >= 0) {
                    break L1;
                  } else {
                    if (((kd) this).field_C.f(323697071)) {
                      break L1;
                    } else {
                      ((kd) this).field_u = null;
                      ((kd) this).field_w = -((kd) this).field_w;
                      ((kd) this).field_x = false;
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = (((kd) this).field_s >> 12) * ((kd) this).field_z / 256;
                var5 = -var4_int + ((kd) this).field_z;
                if (((kd) this).field_w != 0) {
                  ((kd) this).field_s = ((kd) this).field_s + ((kd) this).field_w * param2;
                  if (1048576 > ((kd) this).field_s) {
                    if (((kd) this).field_s <= 0) {
                      ((kd) this).field_s = 0;
                      if (((kd) this).field_x) {
                        break L3;
                      } else {
                        ((kd) this).field_w = 0;
                        if (((kd) this).field_l) {
                          break L3;
                        } else {
                          L4: {
                            if (null == ((kd) this).field_p) {
                              break L4;
                            } else {
                              ((kd) this).field_F.e(4491);
                              break L4;
                            }
                          }
                          ((kd) this).field_p = null;
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    ((kd) this).field_s = 1048576;
                    if (((kd) this).field_x) {
                      break L3;
                    } else {
                      ((kd) this).field_w = 0;
                      if (!((kd) this).field_l) {
                        L5: {
                          if (null == ((kd) this).field_u) {
                            break L5;
                          } else {
                            ((kd) this).field_C.e(4491);
                            break L5;
                          }
                        }
                        ((kd) this).field_u = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (!ug.field_b) {
                  stackOut_31_0 = param2;
                  stackIn_32_0 = stackOut_31_0;
                  break L6;
                } else {
                  stackOut_30_0 = param2 << 1;
                  stackIn_32_0 = stackOut_30_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_32_0;
                if (256 <= ((kd) this).field_r) {
                  break L7;
                } else {
                  L8: {
                    if (null != ((kd) this).field_p) {
                      break L8;
                    } else {
                      if (null == ((kd) this).field_u) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int != 256) {
                    if (var5 != 256) {
                      L9: {
                        L10: {
                          if (null == ((kd) this).field_m) {
                            break L10;
                          } else {
                            if (var6 <= ((kd) this).field_m.length) {
                              kf.a(((kd) this).field_m, 0, var6);
                              kf.a(((kd) this).field_o, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        ((kd) this).field_o = new int[var6];
                        ((kd) this).field_m = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((kd) this).field_F.b(((kd) this).field_m, 0, param2);
                        ((kd) this).field_C.b(((kd) this).field_o, 0, param2);
                        if (ug.field_b) {
                          param1 = param1 << 1;
                          stackOut_47_0 = param1 << 1;
                          stackIn_48_0 = stackOut_47_0;
                          break L11;
                        } else {
                          stackOut_46_0 = param1;
                          stackIn_48_0 = stackOut_46_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_48_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (((kd) this).field_m[var8] * var4_int + var5 * ((kd) this).field_o[var8] >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      ((kd) this).field_C.b(param0, param1, param2);
                      break L7;
                    }
                  } else {
                    ((kd) this).field_F.b(param0, param1, param2);
                    break L7;
                  }
                }
              }
              L13: {
                L14: {
                  if (null == ((kd) this).field_B) {
                    break L14;
                  } else {
                    if (((kd) this).field_r != 0) {
                      L15: {
                        L16: {
                          if (null == ((kd) this).field_m) {
                            break L16;
                          } else {
                            if (~((kd) this).field_m.length <= ~var6) {
                              kf.a(((kd) this).field_m, 0, var6);
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        ((kd) this).field_o = new int[var6];
                        ((kd) this).field_m = new int[var6];
                        break L15;
                      }
                      L17: {
                        ((kd) this).field_n.b(((kd) this).field_m, 0, param2);
                        if (ug.field_b) {
                          param1 = param1 << 1;
                          stackOut_61_0 = param1 << 1;
                          stackIn_62_0 = stackOut_61_0;
                          break L17;
                        } else {
                          stackOut_60_0 = param1;
                          stackIn_62_0 = stackOut_60_0;
                          break L17;
                        }
                      }
                      var7 = stackIn_62_0;
                      var8 = ((kd) this).field_z * ((kd) this).field_r / 256;
                      var9 = ((kd) this).field_z - var8;
                      var10 = 0;
                      L18: while (true) {
                        if (var6 <= var10) {
                          break L14;
                        } else {
                          param0[var7 - -var10] = var9 * param0[var10 + var7] + var8 * ((kd) this).field_m[var10] >> 8;
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                break L13;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var4;
            stackOut_66_1 = new StringBuilder().append("kd.A(");
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L19;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L19;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static boolean a(byte param0) {
        return ie.field_c != null && ie.field_c.b(28433);
    }

    final tj b() {
        return null;
    }

    final tj d() {
        return null;
    }

    final synchronized int c() {
        return 2;
    }

    final synchronized void c(int param0) {
        int var3 = 0;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if (((kd) this).field_s <= 0) {
            break L0;
          } else {
            if (((kd) this).field_p == null) {
              break L0;
            } else {
              ((kd) this).field_F.c(param0);
              break L0;
            }
          }
        }
        L1: {
          if (1048576 <= ((kd) this).field_s) {
            break L1;
          } else {
            if (null != ((kd) this).field_u) {
              ((kd) this).field_C.c(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (((kd) this).field_r <= 0) {
            break L2;
          } else {
            if (((kd) this).field_B != null) {
              ((kd) this).field_n.c(param0);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (!((kd) this).field_x) {
            break L3;
          } else {
            L4: {
              if (((kd) this).field_w <= 0) {
                break L4;
              } else {
                if (!((kd) this).field_F.f(323697071)) {
                  ((kd) this).field_w = -((kd) this).field_w;
                  ((kd) this).field_x = false;
                  ((kd) this).field_p = null;
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            if (((kd) this).field_w >= 0) {
              break L3;
            } else {
              if (!((kd) this).field_C.f(323697071)) {
                ((kd) this).field_x = false;
                ((kd) this).field_u = null;
                ((kd) this).field_w = -((kd) this).field_w;
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        L5: {
          if (0 != ((kd) this).field_w) {
            ((kd) this).field_s = ((kd) this).field_s + ((kd) this).field_w * param0;
            if (1048576 > ((kd) this).field_s) {
              L6: {
                if (0 < ((kd) this).field_s) {
                  break L6;
                } else {
                  ((kd) this).field_s = 0;
                  if (!((kd) this).field_x) {
                    ((kd) this).field_w = 0;
                    if (!((kd) this).field_l) {
                      L7: {
                        if (null == ((kd) this).field_p) {
                          break L7;
                        } else {
                          ((kd) this).field_F.e(4491);
                          break L7;
                        }
                      }
                      ((kd) this).field_p = null;
                      break L6;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              break L5;
            } else {
              ((kd) this).field_s = 1048576;
              if (!((kd) this).field_x) {
                ((kd) this).field_w = 0;
                if (!((kd) this).field_l) {
                  L8: {
                    if (null == ((kd) this).field_u) {
                      break L8;
                    } else {
                      ((kd) this).field_C.e(4491);
                      break L8;
                    }
                  }
                  ((kd) this).field_u = null;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            }
          } else {
            break L5;
          }
        }
    }

    public static void c(byte param0) {
        field_G = null;
        field_y = null;
        field_E = null;
        field_v = null;
        field_D = null;
        field_A = null;
    }

    final boolean a(ji param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
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
            L1: {
              if (param1 >= 2) {
                break L1;
              } else {
                field_D = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0 == ((kd) this).field_p) {
                  break L3;
                } else {
                  if (((kd) this).field_u != param0) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("kd.V(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0 != 0;
    }

    kd(w param0, w param1, w param2) {
        ((kd) this).field_r = 0;
        ((kd) this).field_z = 256;
        ((kd) this).field_l = false;
        try {
            this.a(-9, param1, param0);
            ((kd) this).field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "kd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_D = new long[256];
        var2 = 0;
        L0: while (true) {
          if (256 <= var2) {
            field_G = new nd(7, 0, 1, 1);
            field_t = false;
            field_E = "I need to plant these charges to stop the influx of critters.";
            field_A = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_D[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((1L & var0) == 1L) {
                  var0 = -3932672073523589310L ^ var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
