/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends ab {
    private int field_A;
    private byte[] field_g;
    static er[] field_r;
    static od field_v;
    private int field_z;
    private t field_p;
    private rk field_s;
    private jl field_q;
    static cr field_e;
    private tk field_w;
    private int field_t;
    static String field_u;
    private qh field_k;
    private qh field_i;
    static String field_y;
    private ff field_x;
    private byte[] field_l;
    private nj field_j;
    private boolean field_m;
    private nj field_h;
    private int field_B;
    private boolean field_n;
    private long field_o;
    private boolean field_f;

    final static void d(byte param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (null == eh.field_b) {
                    break L3;
                  } else {
                    if (null != qb.field_b) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                qb.field_b = new int[256];
                eh.field_b = new int[256];
                var1_int = 0;
                L4: while (true) {
                  if (256 <= var1_int) {
                    break L2;
                  } else {
                    var2 = 6.283185307179586 * ((double)var1_int / 255.0);
                    eh.field_b[var1_int] = (int)(4096.0 * Math.sin(var2));
                    qb.field_b[var1_int] = (int)(Math.cos(var2) * 4096.0);
                    var1_int++;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      if (var4 == 0) {
                        continue L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var1_int = -28 / ((param0 - -6) / 43);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) (Object) runtimeException, "uk.D(" + param0 + 41);
        }
    }

    final void a(byte param0) {
        if (!(null != ((uk) this).field_i)) {
            return;
        }
        ((uk) this).field_n = true;
        if (((uk) this).field_j == null) {
            ((uk) this).field_j = new nj();
        }
        if (param0 < 74) {
            ((uk) this).field_h = null;
        }
    }

    public static void b(byte param0) {
        field_u = null;
        field_v = null;
        field_e = null;
        field_y = null;
        field_r = null;
        int var1 = -43 % 0;
    }

    final byte[] a(boolean param0, int param1) {
        if (!param0) {
            uk.b((byte) 0);
        }
        rk var3 = this.a(101, 0, param1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.a((byte) -106);
        var3.c(2);
        return var4;
    }

    final void c(byte param0) {
        li var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (null != ((uk) this).field_j) {
          if (param0 == -94) {
            if (((uk) this).a(true) != null) {
              var2 = ((uk) this).field_h.a((byte) 100);
              L0: while (true) {
                L1: {
                  if (var2 == null) {
                    break L1;
                  } else {
                    var3 = (int)var2.field_k;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L2: {
                        L3: {
                          L4: {
                            if (var3 < 0) {
                              break L4;
                            } else {
                              if (~var3 <= ~((uk) this).field_x.field_p) {
                                break L4;
                              } else {
                                if (((uk) this).field_x.field_h[var3] != 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var2.c(param0 + 96);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                        L5: {
                          if (((uk) this).field_g[var3] != 0) {
                            break L5;
                          } else {
                            rk discarded$4 = this.a(101, 1, var3);
                            break L5;
                          }
                        }
                        L6: {
                          if (((uk) this).field_g[var3] == -1) {
                            rk discarded$5 = this.a(-66, 2, var3);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (1 != ((uk) this).field_g[var3]) {
                          break L2;
                        } else {
                          var2.c(2);
                          break L2;
                        }
                      }
                      var2 = ((uk) this).field_h.b(27);
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
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        int var2_int = 0;
        rk var2 = null;
        li var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_131_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_133_0 = 0;
        int stackOut_133_1 = 0;
        int stackOut_129_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_64_0 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (null == ((uk) this).field_j) {
            break L0;
          } else {
            if (((uk) this).a(true) != null) {
              L1: {
                if (((uk) this).field_m) {
                  break L1;
                } else {
                  L2: {
                    if (!((uk) this).field_n) {
                      break L2;
                    } else {
                      var2_int = 1;
                      var3 = ((uk) this).field_j.a((byte) 100);
                      L3: while (true) {
                        L4: {
                          L5: {
                            L6: {
                              if (var3 == null) {
                                break L6;
                              } else {
                                var4 = (int)var3.field_k;
                                stackOut_7_0 = -2;
                                stackOut_7_1 = ~((uk) this).field_g[var4];
                                stackIn_17_0 = stackOut_7_0;
                                stackIn_17_1 = stackOut_7_1;
                                stackIn_8_0 = stackOut_7_0;
                                stackIn_8_1 = stackOut_7_1;
                                if (var5 != 0) {
                                  L7: while (true) {
                                    if (stackIn_17_0 >= stackIn_17_1) {
                                      break L5;
                                    } else {
                                      stackOut_18_0 = ((uk) this).field_x.field_h[((uk) this).field_B];
                                      stackIn_31_0 = stackOut_18_0;
                                      stackIn_19_0 = stackOut_18_0;
                                      if (var5 != 0) {
                                        break L4;
                                      } else {
                                        L8: {
                                          L9: {
                                            if (stackIn_19_0 != 0) {
                                              break L9;
                                            } else {
                                              ((uk) this).field_B = ((uk) this).field_B + 1;
                                              if (var5 == 0) {
                                                break L8;
                                              } else {
                                                break L9;
                                              }
                                            }
                                          }
                                          L10: {
                                            if (!((uk) this).field_w.f(6)) {
                                              break L10;
                                            } else {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L5;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (((uk) this).field_g[((uk) this).field_B] != 1) {
                                              rk discarded$6 = this.a(-102, 2, ((uk) this).field_B);
                                              break L11;
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (1 == ((uk) this).field_g[((uk) this).field_B]) {
                                              break L12;
                                            } else {
                                              var3 = new li();
                                              var3.field_k = (long)((uk) this).field_B;
                                              ((uk) this).field_j.a(var3, false);
                                              var2_int = 0;
                                              break L12;
                                            }
                                          }
                                          ((uk) this).field_B = ((uk) this).field_B + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L5;
                                          }
                                        }
                                        stackOut_16_0 = ((uk) this).field_B;
                                        stackOut_16_1 = ((uk) this).field_x.field_h.length;
                                        stackIn_17_0 = stackOut_16_0;
                                        stackIn_17_1 = stackOut_16_1;
                                        continue L7;
                                      }
                                    }
                                  }
                                } else {
                                  L13: {
                                    if (stackIn_8_0 != stackIn_8_1) {
                                      rk discarded$7 = this.a(123, 2, var4);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    L15: {
                                      if (((uk) this).field_g[var4] == 1) {
                                        break L15;
                                      } else {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L14;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    var3.c(2);
                                    break L14;
                                  }
                                  var3 = ((uk) this).field_j.b(88);
                                  if (var5 == 0) {
                                    continue L3;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L16: while (true) {
                              stackOut_133_0 = ((uk) this).field_B;
                              stackOut_133_1 = ((uk) this).field_x.field_h.length;
                              stackIn_131_0 = stackOut_133_0;
                              stackIn_131_1 = stackOut_133_1;
                              if (stackIn_131_0 >= stackIn_131_1) {
                                break L5;
                              } else {
                                stackOut_129_0 = ((uk) this).field_x.field_h[((uk) this).field_B];
                                stackIn_31_0 = stackOut_129_0;
                                stackIn_130_0 = stackOut_129_0;
                                if (var5 != 0) {
                                  break L4;
                                } else {
                                  stackOut_130_0 = stackIn_130_0;
                                  stackIn_127_0 = stackOut_130_0;
                                  L17: {
                                    if (stackIn_127_0 != 0) {
                                      break L17;
                                    } else {
                                      ((uk) this).field_B = ((uk) this).field_B + 1;
                                      if (var5 == 0) {
                                        continue L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  L18: {
                                    if (!((uk) this).field_w.f(6)) {
                                      break L18;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L5;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L19: {
                                    if (((uk) this).field_g[((uk) this).field_B] != 1) {
                                      rk discarded$8 = this.a(-102, 2, ((uk) this).field_B);
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (1 == ((uk) this).field_g[((uk) this).field_B]) {
                                      break L20;
                                    } else {
                                      var3 = new li();
                                      var3.field_k = (long)((uk) this).field_B;
                                      ((uk) this).field_j.a(var3, false);
                                      var2_int = 0;
                                      break L20;
                                    }
                                  }
                                  ((uk) this).field_B = ((uk) this).field_B + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_30_0 = var2_int;
                          stackIn_31_0 = stackOut_30_0;
                          break L4;
                        }
                        L21: {
                          if (stackIn_31_0 != 0) {
                            ((uk) this).field_n = false;
                            ((uk) this).field_B = 0;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        if (var5 == 0) {
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  ((uk) this).field_j = null;
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              var2_int = 1;
              var3 = ((uk) this).field_j.a((byte) 100);
              L22: while (true) {
                L23: {
                  L24: {
                    L25: {
                      if (var3 == null) {
                        break L25;
                      } else {
                        var4 = (int)var3.field_k;
                        stackOut_39_0 = ~((uk) this).field_g[var4];
                        stackOut_39_1 = -1;
                        stackIn_50_0 = stackOut_39_0;
                        stackIn_50_1 = stackOut_39_1;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        if (var5 != 0) {
                          L26: while (true) {
                            if (stackIn_50_0 >= stackIn_50_1) {
                              break L24;
                            } else {
                              stackOut_51_0 = ((uk) this).field_x.field_h[((uk) this).field_B];
                              stackIn_65_0 = stackOut_51_0;
                              stackIn_52_0 = stackOut_51_0;
                              if (var5 != 0) {
                                break L23;
                              } else {
                                L27: {
                                  L28: {
                                    if (stackIn_52_0 != 0) {
                                      break L28;
                                    } else {
                                      ((uk) this).field_B = ((uk) this).field_B + 1;
                                      if (var5 == 0) {
                                        break L27;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  L29: {
                                    if (((uk) this).field_p.field_d >= 250) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L24;
                                      } else {
                                        break L29;
                                      }
                                    } else {
                                      break L29;
                                    }
                                  }
                                  L30: {
                                    if (((uk) this).field_g[((uk) this).field_B] != 0) {
                                      break L30;
                                    } else {
                                      rk discarded$9 = this.a(92, 1, ((uk) this).field_B);
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    if (((uk) this).field_g[((uk) this).field_B] == 0) {
                                      var3 = new li();
                                      var3.field_k = (long)((uk) this).field_B;
                                      var2_int = 0;
                                      ((uk) this).field_j.a(var3, false);
                                      break L31;
                                    } else {
                                      break L31;
                                    }
                                  }
                                  ((uk) this).field_B = ((uk) this).field_B + 1;
                                  if (var5 == 0) {
                                    break L27;
                                  } else {
                                    break L24;
                                  }
                                }
                                stackOut_49_0 = ((uk) this).field_B;
                                stackOut_49_1 = ((uk) this).field_x.field_h.length;
                                stackIn_50_0 = stackOut_49_0;
                                stackIn_50_1 = stackOut_49_1;
                                continue L26;
                              }
                            }
                          }
                        } else {
                          L32: {
                            if (stackIn_40_0 == stackIn_40_1) {
                              rk discarded$10 = this.a(112, 1, var4);
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                          L33: {
                            L34: {
                              if (0 == ((uk) this).field_g[var4]) {
                                break L34;
                              } else {
                                var3.c(2);
                                if (var5 == 0) {
                                  break L33;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            var2_int = 0;
                            break L33;
                          }
                          var3 = ((uk) this).field_j.b(27);
                          if (var5 == 0) {
                            continue L22;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    L35: while (true) {
                      stackOut_110_0 = ((uk) this).field_B;
                      stackOut_110_1 = ((uk) this).field_x.field_h.length;
                      stackIn_108_0 = stackOut_110_0;
                      stackIn_108_1 = stackOut_110_1;
                      if (stackIn_108_0 >= stackIn_108_1) {
                        break L24;
                      } else {
                        stackOut_106_0 = ((uk) this).field_x.field_h[((uk) this).field_B];
                        stackIn_65_0 = stackOut_106_0;
                        stackIn_107_0 = stackOut_106_0;
                        if (var5 != 0) {
                          break L23;
                        } else {
                          stackOut_107_0 = stackIn_107_0;
                          stackIn_104_0 = stackOut_107_0;
                          L36: {
                            if (stackIn_104_0 != 0) {
                              break L36;
                            } else {
                              ((uk) this).field_B = ((uk) this).field_B + 1;
                              if (var5 == 0) {
                                continue L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                          L37: {
                            if (((uk) this).field_p.field_d >= 250) {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L24;
                              } else {
                                break L37;
                              }
                            } else {
                              break L37;
                            }
                          }
                          L38: {
                            if (((uk) this).field_g[((uk) this).field_B] != 0) {
                              break L38;
                            } else {
                              rk discarded$11 = this.a(92, 1, ((uk) this).field_B);
                              break L38;
                            }
                          }
                          L39: {
                            if (((uk) this).field_g[((uk) this).field_B] == 0) {
                              var3 = new li();
                              var3.field_k = (long)((uk) this).field_B;
                              var2_int = 0;
                              ((uk) this).field_j.a(var3, false);
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                          ((uk) this).field_B = ((uk) this).field_B + 1;
                          if (var5 == 0) {
                            continue L35;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                  }
                  stackOut_64_0 = var2_int;
                  stackIn_65_0 = stackOut_64_0;
                  break L23;
                }
                if (stackIn_65_0 == 0) {
                  break L0;
                } else {
                  ((uk) this).field_B = 0;
                  ((uk) this).field_m = false;
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        }
        L40: {
          if (param0 >= 86) {
            break L40;
          } else {
            ((uk) this).a((byte) 81);
            break L40;
          }
        }
        L41: {
          if (!((uk) this).field_f) {
            break L41;
          } else {
            L42: {
              if (~gk.a(85) > ~((uk) this).field_o) {
                break L42;
              } else {
                var2 = (rk) (Object) ((uk) this).field_q.b(0);
                L43: while (true) {
                  L44: {
                    if (var2 == null) {
                      break L44;
                    } else {
                      if (var5 != 0) {
                        break L42;
                      } else {
                        L45: {
                          L46: {
                            if (!var2.field_z) {
                              break L46;
                            } else {
                              if (var5 == 0) {
                                break L45;
                              } else {
                                break L46;
                              }
                            }
                          }
                          L47: {
                            if (var2.field_t) {
                              break L47;
                            } else {
                              var2.field_t = true;
                              if (var5 == 0) {
                                break L45;
                              } else {
                                break L47;
                              }
                            }
                          }
                          if (var2.field_u) {
                            var2.c(2);
                            break L45;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                        var2 = (rk) (Object) ((uk) this).field_q.c(-86);
                        if (var5 == 0) {
                          continue L43;
                        } else {
                          break L44;
                        }
                      }
                    }
                  }
                  ((uk) this).field_o = 1000L + gk.a(127);
                  break L42;
                }
              }
            }
            break L41;
          }
        }
    }

    final ff a(boolean param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        Object stackIn_31_0 = null;
        tk stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        int stackIn_31_5 = 0;
        Object stackIn_32_0 = null;
        tk stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        int stackIn_32_5 = 0;
        Object stackIn_33_0 = null;
        tk stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        int stackIn_33_5 = 0;
        int stackIn_33_6 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_30_0 = null;
        tk stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        int stackOut_30_5 = 0;
        Object stackOut_32_0 = null;
        tk stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        int stackOut_32_5 = 0;
        int stackOut_32_6 = 0;
        Object stackOut_31_0 = null;
        tk stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        int stackOut_31_5 = 0;
        int stackOut_31_6 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (null != ((uk) this).field_x) {
          return ((uk) this).field_x;
        } else {
          L0: {
            if (((uk) this).field_s != null) {
              break L0;
            } else {
              if (!((uk) this).field_w.a(20)) {
                ((uk) this).field_s = (rk) (Object) ((uk) this).field_w.a(((uk) this).field_t, 255, true, (byte) 0, false);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((uk) this).field_s.field_z) {
            L1: {
              var5 = ((uk) this).field_s.a((byte) -106);
              var2 = var5;
              if (param0) {
                break L1;
              } else {
                ((uk) this).field_l = null;
                break L1;
              }
            }
            L2: {
              if (!(((uk) this).field_s instanceof nq)) {
                try {
                  L3: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((uk) this).field_x = new ff(var5, ((uk) this).field_z, ((uk) this).field_l);
                      break L3;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    ((uk) this).field_w.e(0);
                    ((uk) this).field_x = null;
                    if (!((uk) this).field_w.a(20)) {
                      break L4;
                    } else {
                      ((uk) this).field_s = null;
                      if (var4 != 0) {
                        break L4;
                      } else {
                        return null;
                      }
                    }
                  }
                  L5: {
                    stackOut_30_0 = this;
                    stackOut_30_1 = ((uk) this).field_w;
                    stackOut_30_2 = ((uk) this).field_t;
                    stackOut_30_3 = 255;
                    stackOut_30_4 = 1;
                    stackOut_30_5 = 0;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_32_1 = stackOut_30_1;
                    stackIn_32_2 = stackOut_30_2;
                    stackIn_32_3 = stackOut_30_3;
                    stackIn_32_4 = stackOut_30_4;
                    stackIn_32_5 = stackOut_30_5;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    stackIn_31_2 = stackOut_30_2;
                    stackIn_31_3 = stackOut_30_3;
                    stackIn_31_4 = stackOut_30_4;
                    stackIn_31_5 = stackOut_30_5;
                    if (param0) {
                      stackOut_32_0 = this;
                      stackOut_32_1 = (tk) (Object) stackIn_32_1;
                      stackOut_32_2 = stackIn_32_2;
                      stackOut_32_3 = stackIn_32_3;
                      stackOut_32_4 = stackIn_32_4;
                      stackOut_32_5 = stackIn_32_5;
                      stackOut_32_6 = 0;
                      stackIn_33_0 = stackOut_32_0;
                      stackIn_33_1 = stackOut_32_1;
                      stackIn_33_2 = stackOut_32_2;
                      stackIn_33_3 = stackOut_32_3;
                      stackIn_33_4 = stackOut_32_4;
                      stackIn_33_5 = stackOut_32_5;
                      stackIn_33_6 = stackOut_32_6;
                      break L5;
                    } else {
                      stackOut_31_0 = this;
                      stackOut_31_1 = (tk) (Object) stackIn_31_1;
                      stackOut_31_2 = stackIn_31_2;
                      stackOut_31_3 = stackIn_31_3;
                      stackOut_31_4 = stackIn_31_4;
                      stackOut_31_5 = stackIn_31_5;
                      stackOut_31_6 = 1;
                      stackIn_33_0 = stackOut_31_0;
                      stackIn_33_1 = stackOut_31_1;
                      stackIn_33_2 = stackOut_31_2;
                      stackIn_33_3 = stackOut_31_3;
                      stackIn_33_4 = stackOut_31_4;
                      stackIn_33_5 = stackOut_31_5;
                      stackIn_33_6 = stackOut_31_6;
                      break L5;
                    }
                  }
                  ((uk) this).field_s = (rk) (Object) ((tk) (Object) stackIn_33_1).a(stackIn_33_2, stackIn_33_3, stackIn_33_4 != 0, (byte) stackIn_33_5, stackIn_33_6 != 0);
                  return null;
                }
                if (((uk) this).field_k != null) {
                  nq discarded$1 = ((uk) this).field_p.a(-19932, ((uk) this).field_t, ((uk) this).field_k, var5);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                try {
                  L6: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((uk) this).field_x = new ff(var5, ((uk) this).field_z, ((uk) this).field_l);
                      if (~((uk) this).field_x.field_c == ~((uk) this).field_A) {
                        break L6;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L7: {
                    var3 = decompiledCaughtException;
                    ((uk) this).field_x = null;
                    if (!((uk) this).field_w.a(20)) {
                      break L7;
                    } else {
                      ((uk) this).field_s = null;
                      if (var4 != 0) {
                        break L7;
                      } else {
                        return null;
                      }
                    }
                  }
                  ((uk) this).field_s = (rk) (Object) ((uk) this).field_w.a(((uk) this).field_t, 255, true, (byte) 0, false);
                  return null;
                }
                break L2;
              }
            }
            L8: {
              if (((uk) this).field_i != null) {
                ((uk) this).field_g = new byte[((uk) this).field_x.field_p];
                break L8;
              } else {
                break L8;
              }
            }
            ((uk) this).field_s = null;
            return ((uk) this).field_x;
          } else {
            return null;
          }
        }
    }

    private final rk a(int param0, int param1, int param2) {
        int var4 = 0;
        Object var5 = null;
        byte[] var6 = null;
        Exception var7 = null;
        RuntimeException var7_ref = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var8_int = 0;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        byte stackIn_46_0 = 0;
        byte stackIn_46_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        Object stackIn_61_0 = null;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        byte stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        byte stackOut_45_0 = 0;
        byte stackOut_45_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        Object stackOut_60_0 = null;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          var4 = 38 / ((33 - param0) / 55);
          var5 = (Object) (Object) (rk) (Object) ((uk) this).field_q.a((long)param2, (byte) 64);
          if (var5 == null) {
            break L0;
          } else {
            if (0 != param1) {
              break L0;
            } else {
              if (((rk) var5).field_u) {
                break L0;
              } else {
                if (!((rk) var5).field_z) {
                  break L0;
                } else {
                  ((rk) var5).c(2);
                  var5 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var5 != null) {
            break L1;
          } else {
            L2: {
              L3: {
                if (0 != param1) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (((uk) this).field_i == null) {
                        break L5;
                      } else {
                        if (-1 != ((uk) this).field_g[param2]) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (!((uk) this).field_w.a(20)) {
                      var5 = (Object) (Object) ((uk) this).field_w.a(param2, ((uk) this).field_t, true, (byte) 2, false);
                      if (var11 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    } else {
                      return null;
                    }
                  }
                  var5 = (Object) (Object) ((uk) this).field_p.a(true, ((uk) this).field_i, param2);
                  if (var11 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                if (param1 != 1) {
                  break L6;
                } else {
                  if (null == ((uk) this).field_i) {
                    throw new RuntimeException();
                  } else {
                    var5 = (Object) (Object) ((uk) this).field_p.a(((uk) this).field_i, param2, (byte) 48);
                    if (var11 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              if (param1 == 2) {
                if (((uk) this).field_i == null) {
                  throw new RuntimeException();
                } else {
                  if (((uk) this).field_g[param2] != -1) {
                    throw new RuntimeException();
                  } else {
                    if (!((uk) this).field_w.f(6)) {
                      var5 = (Object) (Object) ((uk) this).field_w.a(param2, ((uk) this).field_t, false, (byte) 2, false);
                      break L2;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                throw new RuntimeException();
              }
            }
            ((uk) this).field_q.a((li) var5, (long)param2, false);
            break L1;
          }
        }
        if (!((rk) var5).field_z) {
          var6 = ((rk) var5).a((byte) -106);
          if (!(var5 instanceof nq)) {
            try {
              L7: {
                L8: {
                  if (var6 == null) {
                    break L8;
                  } else {
                    if (var6.length > 2) {
                      kc.field_d.reset();
                      kc.field_d.update(var6, 0, var6.length + -2);
                      var7_int = (int)kc.field_d.getValue();
                      if (((uk) this).field_x.field_j[param2] != var7_int) {
                        throw new RuntimeException();
                      } else {
                        L9: {
                          L10: {
                            if (null == ((uk) this).field_x.field_s) {
                              break L10;
                            } else {
                              if (((uk) this).field_x.field_s[param2] != null) {
                                var8 = ((uk) this).field_x.field_s[param2];
                                var9 = de.a(0, (byte) -126, var6.length + -2, var6);
                                var10 = 0;
                                L11: while (true) {
                                  if (var10 >= 64) {
                                    break L10;
                                  } else {
                                    stackOut_80_0 = ~var9[var10];
                                    stackOut_80_1 = ~var8[var10];
                                    stackIn_95_0 = stackOut_80_0;
                                    stackIn_95_1 = stackOut_80_1;
                                    stackIn_81_0 = stackOut_80_0;
                                    stackIn_81_1 = stackOut_80_1;
                                    if (var11 != 0) {
                                      decompiledRegionSelector0 = 1;
                                      break L7;
                                    } else {
                                      if (stackIn_81_0 == stackIn_81_1) {
                                        var10++;
                                        if (var11 == 0) {
                                          continue L11;
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                ((uk) this).field_w.field_m = 0;
                                ((uk) this).field_w.field_j = 0;
                                break L9;
                              }
                            }
                          }
                          ((uk) this).field_w.field_m = 0;
                          ((uk) this).field_w.field_j = 0;
                          break L9;
                        }
                        decompiledRegionSelector0 = 0;
                        break L7;
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var7_ref = (RuntimeException) (Object) decompiledCaughtException;
              ((uk) this).field_w.e(0);
              ((rk) var5).c(2);
              if (((rk) var5).field_u) {
                L12: {
                  if (!((uk) this).field_w.a(20)) {
                    var5 = (Object) (Object) ((uk) this).field_w.a(param2, ((uk) this).field_t, true, (byte) 2, false);
                    ((uk) this).field_q.a((li) var5, (long)param2, false);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L13: {
              L14: {
                if (decompiledRegionSelector0 == 0) {
                  var6[-2 + var6.length] = (byte)(((uk) this).field_x.field_l[param2] >>> 8);
                  var6[var6.length + -1] = (byte)((uk) this).field_x.field_l[param2];
                  if (null != ((uk) this).field_i) {
                    nq discarded$1 = ((uk) this).field_p.a(-19932, param2, ((uk) this).field_i, var6);
                    stackOut_94_0 = ((uk) this).field_g[param2];
                    stackOut_94_1 = 1;
                    stackIn_95_0 = stackOut_94_0;
                    stackIn_95_1 = stackOut_94_1;
                    break L14;
                  } else {
                    break L13;
                  }
                } else {
                  break L14;
                }
              }
              if (stackIn_95_0 == stackIn_95_1) {
                break L13;
              } else {
                ((uk) this).field_g[param2] = (byte) 1;
                break L13;
              }
            }
            L15: {
              if (((rk) var5).field_u) {
                break L15;
              } else {
                ((rk) var5).c(2);
                break L15;
              }
            }
            return (rk) var5;
          } else {
            try {
              L16: {
                L17: {
                  if (var6 == null) {
                    break L17;
                  } else {
                    if (var6.length <= 2) {
                      break L17;
                    } else {
                      kc.field_d.reset();
                      kc.field_d.update(var6, 0, -2 + var6.length);
                      var7_int = (int)kc.field_d.getValue();
                      if (((uk) this).field_x.field_j[param2] == var7_int) {
                        L18: {
                          L19: {
                            if (null == ((uk) this).field_x.field_s) {
                              break L19;
                            } else {
                              if (((uk) this).field_x.field_s[param2] != null) {
                                var8 = ((uk) this).field_x.field_s[param2];
                                var9 = de.a(0, (byte) -91, -2 + var6.length, var6);
                                var10 = 0;
                                L20: while (true) {
                                  if (var10 >= 64) {
                                    break L19;
                                  } else {
                                    stackOut_45_0 = var8[var10];
                                    stackOut_45_1 = var9[var10];
                                    stackIn_51_0 = stackOut_45_0;
                                    stackIn_51_1 = stackOut_45_1;
                                    stackIn_46_0 = stackOut_45_0;
                                    stackIn_46_1 = stackOut_45_1;
                                    if (var11 != 0) {
                                      break L18;
                                    } else {
                                      if (stackIn_46_0 != stackIn_46_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var10++;
                                        if (var11 == 0) {
                                          continue L20;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L19;
                              }
                            }
                          }
                          stackOut_50_0 = var6[var6.length - 1] & 255;
                          stackOut_50_1 = (var6[var6.length - 2] & 255) << 8;
                          stackIn_51_0 = stackOut_50_0;
                          stackIn_51_1 = stackOut_50_1;
                          break L18;
                        }
                        var8_int = stackIn_51_0 + stackIn_51_1;
                        if (~(((uk) this).field_x.field_l[param2] & 65535) == ~var8_int) {
                          L21: {
                            if (((uk) this).field_g[param2] != 1) {
                              L22: {
                                if (((uk) this).field_g[param2] == 0) {
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              ((uk) this).field_g[param2] = (byte) 1;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          L23: {
                            if (!((rk) var5).field_u) {
                              ((rk) var5).c(2);
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          stackOut_60_0 = var5;
                          stackIn_61_0 = stackOut_60_0;
                          break L16;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L24: {
                var7 = (Exception) (Object) decompiledCaughtException;
                ((uk) this).field_g[param2] = (byte) -1;
                ((rk) var5).c(2);
                if (((rk) var5).field_u) {
                  if (!((uk) this).field_w.a(20)) {
                    var5 = (Object) (Object) ((uk) this).field_w.a(param2, ((uk) this).field_t, true, (byte) 2, false);
                    ((uk) this).field_q.a((li) var5, (long)param2, false);
                    break L24;
                  } else {
                    break L24;
                  }
                } else {
                  break L24;
                }
              }
              return null;
            }
            return (rk) (Object) stackIn_61_0;
          }
        } else {
          return null;
        }
    }

    final static void a(r param0, r param1, int param2) {
        try {
            if (param2 < 115) {
                field_u = null;
            }
            oc.field_r = param0;
            hd.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "uk.I(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final int b(int param0, int param1) {
        if (param1 != 57) {
            return 100;
        }
        rk var3 = (rk) (Object) ((uk) this).field_q.a((long)param0, (byte) 64);
        if (var3 == null) {
            return 0;
        }
        return var3.i(109);
    }

    uk(int param0, qh param1, qh param2, tk param3, t param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
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
        ((uk) this).field_q = new jl(16);
        ((uk) this).field_B = 0;
        ((uk) this).field_h = new nj();
        ((uk) this).field_o = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((uk) this).field_t = param0;
                ((uk) this).field_i = param1;
                if (null == ((uk) this).field_i) {
                  break L2;
                } else {
                  ((uk) this).field_m = true;
                  ((uk) this).field_j = new nj();
                  if (!Vertigo2.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((uk) this).field_m = false;
              break L1;
            }
            L3: {
              ((uk) this).field_l = param6;
              ((uk) this).field_w = param3;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((uk) this).field_f = stackIn_7_1 != 0;
              ((uk) this).field_A = param7;
              ((uk) this).field_z = param5;
              ((uk) this).field_k = param2;
              ((uk) this).field_p = param4;
              if (((uk) this).field_k == null) {
                break L4;
              } else {
                ((uk) this).field_s = (rk) (Object) ((uk) this).field_p.a(true, ((uk) this).field_k, ((uk) this).field_t);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("uk.<init>(").append(param0).append(44);
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
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
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
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "No options available";
    }
}
