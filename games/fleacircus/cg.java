/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends gi {
    private ah field_x;
    private hc field_n;
    private rf field_j;
    private ah field_r;
    static int field_y;
    private w field_f;
    private int field_A;
    static String field_v;
    private byte[] field_i;
    static fh field_h;
    static volatile long field_z;
    private int field_e;
    private byte[] field_u;
    private int field_m;
    private af field_o;
    private dl field_g;
    private boolean field_t;
    private boolean field_q;
    private int field_l;
    private vc field_p;
    private vc field_s;
    private boolean field_k;
    private long field_w;

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -105) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            cl.field_b = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "cg.E(" + param0 + ',' + param1 + ')');
        }
    }

    final rf a(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        rf stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_43_0 = null;
        rf stackIn_55_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_42_0 = null;
        Object stackOut_29_0 = null;
        rf stackOut_54_0 = null;
        Object stackOut_12_0 = null;
        rf stackOut_2_0 = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (null == ((cg) this).field_j) {
              L1: {
                if (((cg) this).field_g != null) {
                  break L1;
                } else {
                  if (!((cg) this).field_f.a(param0 + 1805)) {
                    ((cg) this).field_g = (dl) (Object) ((cg) this).field_f.a(param0 ^ -1745, true, ((cg) this).field_m, 255, (byte) 0);
                    break L1;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (rf) (Object) stackIn_9_0;
                  }
                }
              }
              if (!((cg) this).field_g.field_q) {
                L2: {
                  var2_array = ((cg) this).field_g.g(100);
                  if (!(((cg) this).field_g instanceof qh)) {
                    try {
                      L3: {
                        if (var2_array != null) {
                          ((cg) this).field_j = new rf(var2_array, ((cg) this).field_A, ((cg) this).field_u);
                          break L3;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        L5: {
                          var3 = decompiledCaughtException;
                          ((cg) this).field_f.a((byte) 80);
                          ((cg) this).field_j = null;
                          if (!((cg) this).field_f.a(param0 + 1612)) {
                            break L5;
                          } else {
                            ((cg) this).field_g = null;
                            if (var4 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        ((cg) this).field_g = (dl) (Object) ((cg) this).field_f.a(127, true, ((cg) this).field_m, 255, (byte) 0);
                        break L4;
                      }
                      stackOut_42_0 = null;
                      stackIn_43_0 = stackOut_42_0;
                      return (rf) (Object) stackIn_43_0;
                    }
                    if (null != ((cg) this).field_r) {
                      qh discarded$1 = ((cg) this).field_o.a(83, ((cg) this).field_m, ((cg) this).field_r, var2_array);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    try {
                      L6: {
                        if (var2_array == null) {
                          throw new RuntimeException();
                        } else {
                          ((cg) this).field_j = new rf(var2_array, ((cg) this).field_A, ((cg) this).field_u);
                          if (~((cg) this).field_e == ~((cg) this).field_j.field_t) {
                            break L6;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L7: {
                        L8: {
                          var3 = decompiledCaughtException;
                          ((cg) this).field_j = null;
                          if (!((cg) this).field_f.a(-95)) {
                            break L8;
                          } else {
                            ((cg) this).field_g = null;
                            if (var4 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        ((cg) this).field_g = (dl) (Object) ((cg) this).field_f.a(127, true, ((cg) this).field_m, 255, (byte) 0);
                        break L7;
                      }
                      stackOut_29_0 = null;
                      stackIn_30_0 = stackOut_29_0;
                      return (rf) (Object) stackIn_30_0;
                    }
                    break L2;
                  }
                }
                L9: {
                  if (param0 == -1712) {
                    break L9;
                  } else {
                    ((cg) this).c(117);
                    break L9;
                  }
                }
                L10: {
                  if (null == ((cg) this).field_x) {
                    break L10;
                  } else {
                    ((cg) this).field_i = new byte[((cg) this).field_j.field_i];
                    break L10;
                  }
                }
                ((cg) this).field_g = null;
                stackOut_54_0 = ((cg) this).field_j;
                stackIn_55_0 = stackOut_54_0;
                break L0;
              } else {
                stackOut_12_0 = null;
                stackIn_13_0 = stackOut_12_0;
                return (rf) (Object) stackIn_13_0;
              }
            } else {
              stackOut_2_0 = ((cg) this).field_j;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "cg.H(" + param0 + ')');
        }
        return stackIn_55_0;
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((cg) this).field_x == null) {
              return;
            } else {
              L1: {
                if (param0 < -57) {
                  break L1;
                } else {
                  dl discarded$2 = this.a(81, -1, 27);
                  break L1;
                }
              }
              L2: {
                ((cg) this).field_q = true;
                if (((cg) this).field_p == null) {
                  ((cg) this).field_p = new vc();
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "cg.F(" + param0 + ')');
        }
    }

    final int a(int param0, byte param1) {
        dl var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == -5) {
                break L1;
              } else {
                byte[] discarded$2 = ((cg) this).b(60, true);
                break L1;
              }
            }
            var3 = (dl) (Object) ((cg) this).field_n.a((long)param0, param1 ^ 1105);
            if (null != var3) {
              stackOut_6_0 = var3.f(8651);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var3_ref, "cg.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        dl var2_ref = null;
        int var2_int = 0;
        lh var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_64_0 = 0;
        byte stackIn_64_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_101_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_63_0 = 0;
        byte stackOut_63_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        int stackOut_100_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 119) {
                break L1;
              } else {
                field_z = -93L;
                break L1;
              }
            }
            L2: {
              if (null == ((cg) this).field_p) {
                break L2;
              } else {
                if (((cg) this).a(-1712) != null) {
                  L3: {
                    if (((cg) this).field_t) {
                      break L3;
                    } else {
                      L4: {
                        if (!((cg) this).field_q) {
                          break L4;
                        } else {
                          var2_int = 1;
                          var3 = ((cg) this).field_p.c((byte) 47);
                          L5: while (true) {
                            L6: {
                              L7: {
                                L8: {
                                  if (null == var3) {
                                    break L8;
                                  } else {
                                    var4 = (int)var3.field_c;
                                    stackOut_15_0 = ~((cg) this).field_i[var4];
                                    stackOut_15_1 = -2;
                                    stackIn_28_0 = stackOut_15_0;
                                    stackIn_28_1 = stackOut_15_1;
                                    stackIn_16_0 = stackOut_15_0;
                                    stackIn_16_1 = stackOut_15_1;
                                    if (var5 != 0) {
                                      L9: while (true) {
                                        if (stackIn_28_0 <= stackIn_28_1) {
                                          break L7;
                                        } else {
                                          stackOut_29_0 = -1;
                                          stackIn_54_0 = stackOut_29_0;
                                          stackIn_30_0 = stackOut_29_0;
                                          if (var5 != 0) {
                                            break L6;
                                          } else {
                                            stackOut_30_0 = stackIn_30_0;
                                            stackIn_32_0 = stackOut_30_0;
                                            L10: {
                                              L11: {
                                                if (stackIn_32_0 != ~((cg) this).field_j.field_f[((cg) this).field_l]) {
                                                  break L11;
                                                } else {
                                                  ((cg) this).field_l = ((cg) this).field_l + 1;
                                                  if (var5 == 0) {
                                                    break L10;
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                              }
                                              L12: {
                                                if (((cg) this).field_f.b(113)) {
                                                  var2_int = 0;
                                                  if (var5 == 0) {
                                                    break L7;
                                                  } else {
                                                    break L12;
                                                  }
                                                } else {
                                                  break L12;
                                                }
                                              }
                                              L13: {
                                                if (((cg) this).field_i[((cg) this).field_l] != 1) {
                                                  dl discarded$4 = this.a(2, 2, ((cg) this).field_l);
                                                  break L13;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                              L14: {
                                                if (((cg) this).field_i[((cg) this).field_l] != 1) {
                                                  var3 = new lh();
                                                  var3.field_c = (long)((cg) this).field_l;
                                                  var2_int = 0;
                                                  ((cg) this).field_p.a(false, var3);
                                                  break L14;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                              ((cg) this).field_l = ((cg) this).field_l + 1;
                                              if (var5 == 0) {
                                                break L10;
                                              } else {
                                                break L7;
                                              }
                                            }
                                            stackOut_27_0 = ((cg) this).field_j.field_f.length;
                                            stackOut_27_1 = ((cg) this).field_l;
                                            stackIn_28_0 = stackOut_27_0;
                                            stackIn_28_1 = stackOut_27_1;
                                            continue L9;
                                          }
                                        }
                                      }
                                    } else {
                                      L15: {
                                        if (stackIn_16_0 == stackIn_16_1) {
                                          break L15;
                                        } else {
                                          dl discarded$5 = this.a(2, 2, var4);
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        L17: {
                                          if (((cg) this).field_i[var4] != 1) {
                                            break L17;
                                          } else {
                                            var3.c(-1);
                                            if (var5 == 0) {
                                              break L16;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        var2_int = 0;
                                        break L16;
                                      }
                                      var3 = ((cg) this).field_p.b((byte) -105);
                                      if (var5 == 0) {
                                        continue L5;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                L18: while (true) {
                                  stackOut_27_0 = ((cg) this).field_j.field_f.length;
                                  stackOut_27_1 = ((cg) this).field_l;
                                  stackIn_28_0 = stackOut_27_0;
                                  stackIn_28_1 = stackOut_27_1;
                                  if (stackIn_28_0 <= stackIn_28_1) {
                                    break L7;
                                  } else {
                                    stackOut_29_0 = -1;
                                    stackIn_54_0 = stackOut_29_0;
                                    stackIn_30_0 = stackOut_29_0;
                                    if (var5 != 0) {
                                      break L6;
                                    } else {
                                      stackOut_30_0 = stackIn_30_0;
                                      stackIn_32_0 = stackOut_30_0;
                                      L19: {
                                        if (stackIn_32_0 != ~((cg) this).field_j.field_f[((cg) this).field_l]) {
                                          break L19;
                                        } else {
                                          ((cg) this).field_l = ((cg) this).field_l + 1;
                                          if (var5 == 0) {
                                            continue L18;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      L20: {
                                        if (((cg) this).field_f.b(113)) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L7;
                                          } else {
                                            break L20;
                                          }
                                        } else {
                                          break L20;
                                        }
                                      }
                                      L21: {
                                        if (((cg) this).field_i[((cg) this).field_l] != 1) {
                                          dl discarded$4 = this.a(2, 2, ((cg) this).field_l);
                                          break L21;
                                        } else {
                                          break L21;
                                        }
                                      }
                                      L22: {
                                        if (((cg) this).field_i[((cg) this).field_l] != 1) {
                                          var3 = new lh();
                                          var3.field_c = (long)((cg) this).field_l;
                                          var2_int = 0;
                                          ((cg) this).field_p.a(false, var3);
                                          break L22;
                                        } else {
                                          break L22;
                                        }
                                      }
                                      ((cg) this).field_l = ((cg) this).field_l + 1;
                                      if (var5 == 0) {
                                        continue L18;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_53_0 = var2_int;
                              stackIn_54_0 = stackOut_53_0;
                              break L6;
                            }
                            L23: {
                              if (stackIn_54_0 == 0) {
                                break L23;
                              } else {
                                ((cg) this).field_q = false;
                                ((cg) this).field_l = 0;
                                break L23;
                              }
                            }
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      ((cg) this).field_p = null;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = 1;
                  var3 = ((cg) this).field_p.c((byte) 47);
                  L24: while (true) {
                    L25: {
                      L26: {
                        L27: {
                          if (var3 == null) {
                            break L27;
                          } else {
                            var4 = (int)var3.field_c;
                            stackOut_63_0 = 0;
                            stackOut_63_1 = ((cg) this).field_i[var4];
                            stackIn_75_0 = stackOut_63_0;
                            stackIn_75_1 = stackOut_63_1;
                            stackIn_64_0 = stackOut_63_0;
                            stackIn_64_1 = stackOut_63_1;
                            if (var5 != 0) {
                              L28: while (true) {
                                if (stackIn_75_0 >= stackIn_75_1) {
                                  break L26;
                                } else {
                                  stackOut_76_0 = -1;
                                  stackIn_101_0 = stackOut_76_0;
                                  stackIn_77_0 = stackOut_76_0;
                                  if (var5 != 0) {
                                    break L25;
                                  } else {
                                    stackOut_77_0 = stackIn_77_0;
                                    stackIn_79_0 = stackOut_77_0;
                                    L29: {
                                      L30: {
                                        if (stackIn_79_0 == ~((cg) this).field_j.field_f[((cg) this).field_l]) {
                                          ((cg) this).field_l = ((cg) this).field_l + 1;
                                          if (var5 == 0) {
                                            break L29;
                                          } else {
                                            break L30;
                                          }
                                        } else {
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (((cg) this).field_o.field_d >= 250) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L26;
                                          } else {
                                            break L31;
                                          }
                                        } else {
                                          break L31;
                                        }
                                      }
                                      L32: {
                                        if (((cg) this).field_i[((cg) this).field_l] == 0) {
                                          dl discarded$6 = this.a(2, 1, ((cg) this).field_l);
                                          break L32;
                                        } else {
                                          break L32;
                                        }
                                      }
                                      L33: {
                                        if (0 == ((cg) this).field_i[((cg) this).field_l]) {
                                          var3 = new lh();
                                          var3.field_c = (long)((cg) this).field_l;
                                          var2_int = 0;
                                          ((cg) this).field_p.a(false, var3);
                                          break L33;
                                        } else {
                                          break L33;
                                        }
                                      }
                                      ((cg) this).field_l = ((cg) this).field_l + 1;
                                      if (var5 == 0) {
                                        break L29;
                                      } else {
                                        break L26;
                                      }
                                    }
                                    stackOut_74_0 = ((cg) this).field_l;
                                    stackOut_74_1 = ((cg) this).field_j.field_f.length;
                                    stackIn_75_0 = stackOut_74_0;
                                    stackIn_75_1 = stackOut_74_1;
                                    continue L28;
                                  }
                                }
                              }
                            } else {
                              L34: {
                                if (stackIn_64_0 == stackIn_64_1) {
                                  dl discarded$7 = this.a(2, 1, var4);
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                              L35: {
                                L36: {
                                  if (((cg) this).field_i[var4] != 0) {
                                    break L36;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L35;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                                var3.c(-1);
                                break L35;
                              }
                              var3 = ((cg) this).field_p.b((byte) -105);
                              if (var5 == 0) {
                                continue L24;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        L37: while (true) {
                          stackOut_74_0 = ((cg) this).field_l;
                          stackOut_74_1 = ((cg) this).field_j.field_f.length;
                          stackIn_75_0 = stackOut_74_0;
                          stackIn_75_1 = stackOut_74_1;
                          if (stackIn_75_0 >= stackIn_75_1) {
                            break L26;
                          } else {
                            stackOut_76_0 = -1;
                            stackIn_101_0 = stackOut_76_0;
                            stackIn_77_0 = stackOut_76_0;
                            if (var5 != 0) {
                              break L25;
                            } else {
                              stackOut_77_0 = stackIn_77_0;
                              stackIn_79_0 = stackOut_77_0;
                              L38: {
                                if (stackIn_79_0 == ~((cg) this).field_j.field_f[((cg) this).field_l]) {
                                  ((cg) this).field_l = ((cg) this).field_l + 1;
                                  if (var5 == 0) {
                                    continue L37;
                                  } else {
                                    break L38;
                                  }
                                } else {
                                  break L38;
                                }
                              }
                              L39: {
                                if (((cg) this).field_o.field_d >= 250) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L26;
                                  } else {
                                    break L39;
                                  }
                                } else {
                                  break L39;
                                }
                              }
                              L40: {
                                if (((cg) this).field_i[((cg) this).field_l] == 0) {
                                  dl discarded$6 = this.a(2, 1, ((cg) this).field_l);
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                              L41: {
                                if (0 == ((cg) this).field_i[((cg) this).field_l]) {
                                  var3 = new lh();
                                  var3.field_c = (long)((cg) this).field_l;
                                  var2_int = 0;
                                  ((cg) this).field_p.a(false, var3);
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                              ((cg) this).field_l = ((cg) this).field_l + 1;
                              if (var5 == 0) {
                                continue L37;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                      }
                      stackOut_100_0 = var2_int;
                      stackIn_101_0 = stackOut_100_0;
                      break L25;
                    }
                    if (stackIn_101_0 == 0) {
                      break L2;
                    } else {
                      ((cg) this).field_l = 0;
                      ((cg) this).field_t = false;
                      break L2;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            L42: {
              if (!((cg) this).field_k) {
                break L42;
              } else {
                if (~((cg) this).field_w >= ~lj.a((byte) -56)) {
                  var2_ref = (dl) (Object) ((cg) this).field_n.a(true);
                  L43: while (true) {
                    L44: {
                      if (var2_ref == null) {
                        break L44;
                      } else {
                        if (var5 != 0) {
                          break L42;
                        } else {
                          L45: {
                            if (var2_ref.field_q) {
                              break L45;
                            } else {
                              L46: {
                                if (var2_ref.field_r) {
                                  break L46;
                                } else {
                                  var2_ref.field_r = true;
                                  if (var5 == 0) {
                                    break L45;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              if (!var2_ref.field_v) {
                                throw new RuntimeException();
                              } else {
                                var2_ref.c(-1);
                                break L45;
                              }
                            }
                          }
                          var2_ref = (dl) (Object) ((cg) this).field_n.b((byte) 97);
                          if (var5 == 0) {
                            continue L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    ((cg) this).field_w = 1000L + lj.a((byte) -28);
                    break L42;
                  }
                } else {
                  break L42;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "cg.A(" + param0 + ')');
        }
    }

    final static void a(java.math.BigInteger param0, int param1, ni param2, ni param3, java.math.BigInteger param4) {
        RuntimeException var5 = null;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
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
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -104) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            qi.a(param4, param2.field_i, 0, param2.field_k, param3, param0, (byte) -60);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("cg.G(");
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
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    private final dl a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_59_0 = null;
        Object stackIn_66_0 = null;
        byte stackIn_84_0 = 0;
        byte stackIn_84_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        Object stackIn_104_0 = null;
        Object stackIn_111_0 = null;
        byte stackIn_130_0 = 0;
        byte stackIn_130_1 = 0;
        Object stackIn_146_0 = null;
        byte stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        Object stackIn_157_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_31_0 = null;
        Object stackOut_58_0 = null;
        Object stackOut_65_0 = null;
        byte stackOut_129_0 = 0;
        byte stackOut_129_1 = 0;
        Object stackOut_145_0 = null;
        byte stackOut_148_0 = 0;
        int stackOut_148_1 = 0;
        Object stackOut_156_0 = null;
        byte stackOut_83_0 = 0;
        byte stackOut_83_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        Object stackOut_103_0 = null;
        Object stackOut_110_0 = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                int discarded$2 = ((cg) this).a(-58, (byte) -93);
                break L1;
              }
            }
            L2: {
              var4 = (Object) (Object) (dl) (Object) ((cg) this).field_n.a((long)param2, -1110);
              if (var4 == null) {
                break L2;
              } else {
                if (param1 != 0) {
                  break L2;
                } else {
                  if (((dl) var4).field_v) {
                    break L2;
                  } else {
                    if (((dl) var4).field_q) {
                      ((dl) var4).c(-1);
                      var4 = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            L3: {
              if (var4 == null) {
                L4: {
                  L5: {
                    if (0 != param1) {
                      break L5;
                    } else {
                      L6: {
                        if (null == ((cg) this).field_x) {
                          break L6;
                        } else {
                          if (((cg) this).field_i[param2] != -1) {
                            var4 = (Object) (Object) ((cg) this).field_o.a(param2, ((cg) this).field_x, true);
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (((cg) this).field_f.a(-112)) {
                          break L7;
                        } else {
                          var4 = (Object) (Object) ((cg) this).field_f.a(param0 + 125, true, param2, ((cg) this).field_m, (byte) 2);
                          if (var10 == 0) {
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      stackOut_31_0 = null;
                      stackIn_32_0 = stackOut_31_0;
                      return (dl) (Object) stackIn_32_0;
                    }
                  }
                  L8: {
                    if (param1 != 1) {
                      break L8;
                    } else {
                      if (((cg) this).field_x == null) {
                        throw new RuntimeException();
                      } else {
                        var4 = (Object) (Object) ((cg) this).field_o.a(126, param2, ((cg) this).field_x);
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  if (param1 != 2) {
                    throw new RuntimeException();
                  } else {
                    if (null == ((cg) this).field_x) {
                      throw new RuntimeException();
                    } else {
                      if (((cg) this).field_i[param2] == -1) {
                        L9: {
                          if (((cg) this).field_f.b(-49)) {
                            break L9;
                          } else {
                            var4 = (Object) (Object) ((cg) this).field_f.a(127, false, param2, ((cg) this).field_m, (byte) 2);
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L9;
                            }
                          }
                        }
                        stackOut_58_0 = null;
                        stackIn_59_0 = stackOut_58_0;
                        return (dl) (Object) stackIn_59_0;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                ((cg) this).field_n.a((lh) var4, true, (long)param2);
                break L3;
              } else {
                break L3;
              }
            }
            if (((dl) var4).field_q) {
              stackOut_65_0 = null;
              stackIn_66_0 = stackOut_65_0;
              return (dl) (Object) stackIn_66_0;
            } else {
              var5 = ((dl) var4).g(100);
              if (!(var4 instanceof qh)) {
                try {
                  L10: {
                    L11: {
                      if (null == var5) {
                        break L11;
                      } else {
                        if (var5.length <= 2) {
                          break L11;
                        } else {
                          ql.field_j.reset();
                          ql.field_j.update(var5, 0, var5.length + -2);
                          var6_int = (int)ql.field_j.getValue();
                          if (var6_int != ((cg) this).field_j.field_u[param2]) {
                            throw new RuntimeException();
                          } else {
                            L12: {
                              if (((cg) this).field_j.field_o == null) {
                                break L12;
                              } else {
                                if (null == ((cg) this).field_j.field_o[param2]) {
                                  break L12;
                                } else {
                                  var7 = ((cg) this).field_j.field_o[param2];
                                  var8 = kb.a(var5, var5.length + -2, (byte) 99, 0);
                                  var9 = 0;
                                  L13: while (true) {
                                    if (var9 >= 64) {
                                      break L12;
                                    } else {
                                      stackOut_129_0 = var8[var9];
                                      stackOut_129_1 = var7[var9];
                                      stackIn_150_0 = stackOut_129_0;
                                      stackIn_150_1 = stackOut_129_1;
                                      stackIn_130_0 = stackOut_129_0;
                                      stackIn_130_1 = stackOut_129_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L10;
                                      } else {
                                        if (stackIn_130_0 == stackIn_130_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L13;
                                          } else {
                                            break L12;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            ((cg) this).field_f.field_c = 0;
                            ((cg) this).field_f.field_b = 0;
                            decompiledRegionSelector0 = 1;
                            break L10;
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L14: {
                    var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                    ((cg) this).field_f.a((byte) 88);
                    ((dl) var4).c(param0 ^ -3);
                    if (!((dl) var4).field_v) {
                      break L14;
                    } else {
                      if (!((cg) this).field_f.a(-99)) {
                        var4 = (Object) (Object) ((cg) this).field_f.a(param0 ^ 125, true, param2, ((cg) this).field_m, (byte) 2);
                        ((cg) this).field_n.a((lh) var4, true, (long)param2);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  stackOut_145_0 = null;
                  stackIn_146_0 = stackOut_145_0;
                  return (dl) (Object) stackIn_146_0;
                }
                L15: {
                  L16: {
                    if (decompiledRegionSelector0 == 0) {
                      break L16;
                    } else {
                      var5[var5.length - 2] = (byte)(((cg) this).field_j.field_n[param2] >>> 932087816);
                      var5[-1 + var5.length] = (byte)((cg) this).field_j.field_n[param2];
                      if (null == ((cg) this).field_x) {
                        break L15;
                      } else {
                        qh discarded$3 = ((cg) this).field_o.a(param0 + -125, param2, ((cg) this).field_x, var5);
                        stackOut_148_0 = ((cg) this).field_i[param2];
                        stackOut_148_1 = 1;
                        stackIn_150_0 = stackOut_148_0;
                        stackIn_150_1 = stackOut_148_1;
                        break L16;
                      }
                    }
                  }
                  if (stackIn_150_0 != stackIn_150_1) {
                    ((cg) this).field_i[param2] = (byte) 1;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L17: {
                  if (((dl) var4).field_v) {
                    break L17;
                  } else {
                    ((dl) var4).c(-1);
                    break L17;
                  }
                }
                stackOut_156_0 = var4;
                stackIn_157_0 = stackOut_156_0;
                break L0;
              } else {
                try {
                  L18: {
                    L19: {
                      if (null == var5) {
                        break L19;
                      } else {
                        if (2 < var5.length) {
                          ql.field_j.reset();
                          ql.field_j.update(var5, 0, var5.length - 2);
                          var6_int = (int)ql.field_j.getValue();
                          if (~var6_int == ~((cg) this).field_j.field_u[param2]) {
                            L20: {
                              L21: {
                                if (((cg) this).field_j.field_o == null) {
                                  break L21;
                                } else {
                                  if (((cg) this).field_j.field_o[param2] == null) {
                                    break L21;
                                  } else {
                                    var7 = ((cg) this).field_j.field_o[param2];
                                    var8 = kb.a(var5, -2 + var5.length, (byte) 124, 0);
                                    var9 = 0;
                                    L22: while (true) {
                                      if (var9 >= 64) {
                                        break L21;
                                      } else {
                                        stackOut_83_0 = var8[var9];
                                        stackOut_83_1 = var7[var9];
                                        stackIn_91_0 = stackOut_83_0;
                                        stackIn_91_1 = stackOut_83_1;
                                        stackIn_84_0 = stackOut_83_0;
                                        stackIn_84_1 = stackOut_83_1;
                                        if (var10 != 0) {
                                          break L20;
                                        } else {
                                          if (stackIn_84_0 == stackIn_84_1) {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L22;
                                            } else {
                                              break L21;
                                            }
                                          } else {
                                            throw new RuntimeException();
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_90_0 = (var5[-2 + var5.length] & 255) << 519320712;
                              stackOut_90_1 = var5[var5.length + -1] & 255;
                              stackIn_91_0 = stackOut_90_0;
                              stackIn_91_1 = stackOut_90_1;
                              break L20;
                            }
                            var7_int = stackIn_91_0 + stackIn_91_1;
                            if (~(65535 & ((cg) this).field_j.field_n[param2]) != ~var7_int) {
                              throw new RuntimeException();
                            } else {
                              L23: {
                                if (((cg) this).field_i[param2] != 1) {
                                  L24: {
                                    if (((cg) this).field_i[param2] != 0) {
                                      break L24;
                                    } else {
                                      break L24;
                                    }
                                  }
                                  ((cg) this).field_i[param2] = (byte) 1;
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              L25: {
                                if (((dl) var4).field_v) {
                                  break L25;
                                } else {
                                  ((dl) var4).c(-1);
                                  break L25;
                                }
                              }
                              stackOut_103_0 = var4;
                              stackIn_104_0 = stackOut_103_0;
                              break L18;
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L26: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    ((cg) this).field_i[param2] = (byte) -1;
                    ((dl) var4).c(param0 + -3);
                    if (!((dl) var4).field_v) {
                      break L26;
                    } else {
                      if (((cg) this).field_f.a(-92)) {
                        break L26;
                      } else {
                        var4 = (Object) (Object) ((cg) this).field_f.a(param0 ^ 125, true, param2, ((cg) this).field_m, (byte) 2);
                        ((cg) this).field_n.a((lh) var4, true, (long)param2);
                        break L26;
                      }
                    }
                  }
                  stackOut_110_0 = null;
                  stackIn_111_0 = stackOut_110_0;
                  return (dl) (Object) stackIn_111_0;
                }
                return (dl) (Object) stackIn_104_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw pf.a((Throwable) var4, "cg.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (dl) (Object) stackIn_157_0;
    }

    final void a(boolean param0) {
        RuntimeException runtimeException = null;
        lh var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (!param0) {
              if (null == ((cg) this).field_p) {
                return;
              } else {
                if (((cg) this).a(-1712) != null) {
                  var2 = ((cg) this).field_s.c((byte) 47);
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var2 == null) {
                          break L3;
                        } else {
                          var3 = (int)var2.field_c;
                          if (var4 != 0) {
                            break L2;
                          } else {
                            L4: {
                              L5: {
                                L6: {
                                  if (var3 < 0) {
                                    break L6;
                                  } else {
                                    if (((cg) this).field_j.field_i <= var3) {
                                      break L6;
                                    } else {
                                      if (((cg) this).field_j.field_f[var3] != 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                var2.c(-1);
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                              L7: {
                                if (((cg) this).field_i[var3] == 0) {
                                  dl discarded$2 = this.a(2, 1, var3);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              L8: {
                                if (((cg) this).field_i[var3] == -1) {
                                  dl discarded$3 = this.a(2, 2, var3);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              if (((cg) this).field_i[var3] != 1) {
                                break L4;
                              } else {
                                var2.c(-1);
                                break L4;
                              }
                            }
                            var2 = ((cg) this).field_s.b((byte) -105);
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
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pf.a((Throwable) (Object) runtimeException, "cg.I(" + param0 + ')');
        }
    }

    final byte[] b(int param0, boolean param1) {
        dl var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var3 = this.a(2, 0, param0);
            if (null != var3) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  ((cg) this).field_A = 116;
                  break L1;
                }
              }
              var4 = var3.g(100);
              var3.c(-1);
              stackOut_6_0 = (byte[]) var4;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var3_ref, "cg.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    public static void b(int param0) {
        try {
            field_h = null;
            field_v = null;
            if (param0 != 1) {
                cg.a((java.math.BigInteger) null, -72, (ni) null, (ni) null, (java.math.BigInteger) null);
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "cg.C(" + param0 + ')');
        }
    }

    cg(int param0, ah param1, ah param2, w param3, af param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        ((cg) this).field_n = new hc(16);
        ((cg) this).field_l = 0;
        ((cg) this).field_s = new vc();
        ((cg) this).field_w = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((cg) this).field_m = param0;
                ((cg) this).field_x = param1;
                if (((cg) this).field_x == null) {
                  break L2;
                } else {
                  ((cg) this).field_t = true;
                  ((cg) this).field_p = new vc();
                  if (!fleas.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((cg) this).field_t = false;
              break L1;
            }
            L3: {
              ((cg) this).field_e = param7;
              ((cg) this).field_u = param6;
              ((cg) this).field_r = param2;
              ((cg) this).field_k = param8;
              ((cg) this).field_o = param4;
              ((cg) this).field_f = param3;
              ((cg) this).field_A = param5;
              if (null == ((cg) this).field_r) {
                break L3;
              } else {
                ((cg) this).field_g = (dl) (Object) ((cg) this).field_o.a(((cg) this).field_m, ((cg) this).field_r, true);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var10;
            stackOut_9_1 = new StringBuilder().append("cg.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
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
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param5).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param6 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Type your email address again to make sure it's correct";
        field_z = 0L;
        field_h = new fh(4, 1, 1, 1);
    }
}
