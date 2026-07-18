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
        int var1_int = 0;
        RuntimeException var1 = null;
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
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "uk.D(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == ((uk) this).field_i) {
              return;
            } else {
              L1: {
                ((uk) this).field_n = true;
                if (((uk) this).field_j != null) {
                  break L1;
                } else {
                  ((uk) this).field_j = new nj();
                  break L1;
                }
              }
              L2: {
                if (param0 >= 74) {
                  break L2;
                } else {
                  ((uk) this).field_h = null;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var2, "uk.B(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        try {
            field_u = null;
            field_v = null;
            field_e = null;
            field_y = null;
            field_r = null;
            int var1_int = -43 % ((param0 - 23) / 39);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "uk.G(" + param0 + ')');
        }
    }

    final byte[] a(boolean param0, int param1) {
        rk var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                uk.b((byte) 0);
                break L1;
              }
            }
            var3 = this.a(101, 0, param1);
            if (null != var3) {
              var4 = var3.a((byte) -106);
              var3.c(2);
              stackOut_6_0 = (byte[]) var4;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (byte[]) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var3_ref, "uk.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        li var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (null != ((uk) this).field_j) {
              if (param0 == -94) {
                if (((uk) this).a(true) != null) {
                  var2_ref = ((uk) this).field_h.a((byte) 100);
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (null == var2_ref) {
                          break L3;
                        } else {
                          var3 = (int)var2_ref.field_k;
                          if (var4 != 0) {
                            break L2;
                          } else {
                            L4: {
                              L5: {
                                L6: {
                                  if (var3 < 0) {
                                    break L6;
                                  } else {
                                    if (~var3 <= ~((uk) this).field_x.field_p) {
                                      break L6;
                                    } else {
                                      if (((uk) this).field_x.field_h[var3] != 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                var2_ref.c(param0 + 96);
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                              L7: {
                                if (((uk) this).field_g[var3] != 0) {
                                  break L7;
                                } else {
                                  rk discarded$2 = this.a(101, 1, var3);
                                  break L7;
                                }
                              }
                              L8: {
                                if (((uk) this).field_g[var3] == -1) {
                                  rk discarded$3 = this.a(-66, 2, var3);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              if (1 != ((uk) this).field_g[var3]) {
                                break L4;
                              } else {
                                var2_ref.c(2);
                                break L4;
                              }
                            }
                            var2_ref = ((uk) this).field_h.b(27);
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
          throw wn.a((Throwable) (Object) var2, "uk.C(" + param0 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        rk var2_ref = null;
        li var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_91_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_90_0 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ((uk) this).field_j) {
                break L1;
              } else {
                if (((uk) this).a(true) != null) {
                  L2: {
                    if (((uk) this).field_m) {
                      break L2;
                    } else {
                      L3: {
                        if (!((uk) this).field_n) {
                          break L3;
                        } else {
                          var2_int = 1;
                          var3 = ((uk) this).field_j.a((byte) 100);
                          L4: while (true) {
                            L5: {
                              L6: {
                                L7: {
                                  if (null == var3) {
                                    break L7;
                                  } else {
                                    var4 = (int)var3.field_k;
                                    stackOut_10_0 = -2;
                                    stackOut_10_1 = ~((uk) this).field_g[var4];
                                    stackIn_22_0 = stackOut_10_0;
                                    stackIn_22_1 = stackOut_10_1;
                                    stackIn_11_0 = stackOut_10_0;
                                    stackIn_11_1 = stackOut_10_1;
                                    if (var5 != 0) {
                                      L8: while (true) {
                                        if (stackIn_22_0 >= stackIn_22_1) {
                                          break L6;
                                        } else {
                                          stackOut_23_0 = ((uk) this).field_x.field_h[((uk) this).field_B];
                                          stackIn_44_0 = stackOut_23_0;
                                          stackIn_24_0 = stackOut_23_0;
                                          if (var5 != 0) {
                                            break L5;
                                          } else {
                                            stackOut_24_0 = stackIn_24_0;
                                            stackIn_26_0 = stackOut_24_0;
                                            L9: {
                                              L10: {
                                                if (stackIn_26_0 != 0) {
                                                  break L10;
                                                } else {
                                                  ((uk) this).field_B = ((uk) this).field_B + 1;
                                                  if (var5 == 0) {
                                                    break L9;
                                                  } else {
                                                    break L10;
                                                  }
                                                }
                                              }
                                              L11: {
                                                if (!((uk) this).field_w.f(6)) {
                                                  break L11;
                                                } else {
                                                  var2_int = 0;
                                                  if (var5 == 0) {
                                                    break L6;
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                              }
                                              L12: {
                                                if (((uk) this).field_g[((uk) this).field_B] != 1) {
                                                  rk discarded$4 = this.a(-102, 2, ((uk) this).field_B);
                                                  break L12;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                              L13: {
                                                if (1 == ((uk) this).field_g[((uk) this).field_B]) {
                                                  break L13;
                                                } else {
                                                  var3 = new li();
                                                  var3.field_k = (long)((uk) this).field_B;
                                                  ((uk) this).field_j.a(var3, false);
                                                  var2_int = 0;
                                                  break L13;
                                                }
                                              }
                                              ((uk) this).field_B = ((uk) this).field_B + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L6;
                                              }
                                            }
                                            stackOut_21_0 = ((uk) this).field_B;
                                            stackOut_21_1 = ((uk) this).field_x.field_h.length;
                                            stackIn_22_0 = stackOut_21_0;
                                            stackIn_22_1 = stackOut_21_1;
                                            continue L8;
                                          }
                                        }
                                      }
                                    } else {
                                      L14: {
                                        if (stackIn_11_0 != stackIn_11_1) {
                                          rk discarded$5 = this.a(123, 2, var4);
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        L16: {
                                          if (((uk) this).field_g[var4] == 1) {
                                            break L16;
                                          } else {
                                            var2_int = 0;
                                            if (var5 == 0) {
                                              break L15;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        var3.c(2);
                                        break L15;
                                      }
                                      var3 = ((uk) this).field_j.b(88);
                                      if (var5 == 0) {
                                        continue L4;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                L17: while (true) {
                                  stackOut_21_0 = ((uk) this).field_B;
                                  stackOut_21_1 = ((uk) this).field_x.field_h.length;
                                  stackIn_22_0 = stackOut_21_0;
                                  stackIn_22_1 = stackOut_21_1;
                                  if (stackIn_22_0 >= stackIn_22_1) {
                                    break L6;
                                  } else {
                                    stackOut_23_0 = ((uk) this).field_x.field_h[((uk) this).field_B];
                                    stackIn_44_0 = stackOut_23_0;
                                    stackIn_24_0 = stackOut_23_0;
                                    if (var5 != 0) {
                                      break L5;
                                    } else {
                                      stackOut_24_0 = stackIn_24_0;
                                      stackIn_26_0 = stackOut_24_0;
                                      L18: {
                                        if (stackIn_26_0 != 0) {
                                          break L18;
                                        } else {
                                          ((uk) this).field_B = ((uk) this).field_B + 1;
                                          if (var5 == 0) {
                                            continue L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      L19: {
                                        if (!((uk) this).field_w.f(6)) {
                                          break L19;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L6;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      L20: {
                                        if (((uk) this).field_g[((uk) this).field_B] != 1) {
                                          rk discarded$4 = this.a(-102, 2, ((uk) this).field_B);
                                          break L20;
                                        } else {
                                          break L20;
                                        }
                                      }
                                      L21: {
                                        if (1 == ((uk) this).field_g[((uk) this).field_B]) {
                                          break L21;
                                        } else {
                                          var3 = new li();
                                          var3.field_k = (long)((uk) this).field_B;
                                          ((uk) this).field_j.a(var3, false);
                                          var2_int = 0;
                                          break L21;
                                        }
                                      }
                                      ((uk) this).field_B = ((uk) this).field_B + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_43_0 = var2_int;
                              stackIn_44_0 = stackOut_43_0;
                              break L5;
                            }
                            L22: {
                              if (stackIn_44_0 != 0) {
                                ((uk) this).field_n = false;
                                ((uk) this).field_B = 0;
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            if (var5 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((uk) this).field_j = null;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int = 1;
                  var3 = ((uk) this).field_j.a((byte) 100);
                  L23: while (true) {
                    L24: {
                      L25: {
                        L26: {
                          if (null == var3) {
                            break L26;
                          } else {
                            var4 = (int)var3.field_k;
                            stackOut_53_0 = ~((uk) this).field_g[var4];
                            stackOut_53_1 = -1;
                            stackIn_66_0 = stackOut_53_0;
                            stackIn_66_1 = stackOut_53_1;
                            stackIn_54_0 = stackOut_53_0;
                            stackIn_54_1 = stackOut_53_1;
                            if (var5 != 0) {
                              L27: while (true) {
                                if (stackIn_66_0 >= stackIn_66_1) {
                                  break L25;
                                } else {
                                  stackOut_67_0 = ((uk) this).field_x.field_h[((uk) this).field_B];
                                  stackIn_91_0 = stackOut_67_0;
                                  stackIn_68_0 = stackOut_67_0;
                                  if (var5 != 0) {
                                    break L24;
                                  } else {
                                    stackOut_68_0 = stackIn_68_0;
                                    stackIn_70_0 = stackOut_68_0;
                                    L28: {
                                      L29: {
                                        if (stackIn_70_0 != 0) {
                                          break L29;
                                        } else {
                                          ((uk) this).field_B = ((uk) this).field_B + 1;
                                          if (var5 == 0) {
                                            break L28;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      L30: {
                                        if (((uk) this).field_p.field_d >= 250) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L25;
                                          } else {
                                            break L30;
                                          }
                                        } else {
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (((uk) this).field_g[((uk) this).field_B] != 0) {
                                          break L31;
                                        } else {
                                          rk discarded$6 = this.a(92, 1, ((uk) this).field_B);
                                          break L31;
                                        }
                                      }
                                      L32: {
                                        if (((uk) this).field_g[((uk) this).field_B] == 0) {
                                          var3 = new li();
                                          var3.field_k = (long)((uk) this).field_B;
                                          var2_int = 0;
                                          ((uk) this).field_j.a(var3, false);
                                          break L32;
                                        } else {
                                          break L32;
                                        }
                                      }
                                      ((uk) this).field_B = ((uk) this).field_B + 1;
                                      if (var5 == 0) {
                                        break L28;
                                      } else {
                                        break L25;
                                      }
                                    }
                                    stackOut_65_0 = ((uk) this).field_B;
                                    stackOut_65_1 = ((uk) this).field_x.field_h.length;
                                    stackIn_66_0 = stackOut_65_0;
                                    stackIn_66_1 = stackOut_65_1;
                                    continue L27;
                                  }
                                }
                              }
                            } else {
                              L33: {
                                if (stackIn_54_0 == stackIn_54_1) {
                                  rk discarded$7 = this.a(112, 1, var4);
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                              L34: {
                                L35: {
                                  if (0 == ((uk) this).field_g[var4]) {
                                    break L35;
                                  } else {
                                    var3.c(2);
                                    if (var5 == 0) {
                                      break L34;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L34;
                              }
                              var3 = ((uk) this).field_j.b(27);
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                        L36: while (true) {
                          stackOut_65_0 = ((uk) this).field_B;
                          stackOut_65_1 = ((uk) this).field_x.field_h.length;
                          stackIn_66_0 = stackOut_65_0;
                          stackIn_66_1 = stackOut_65_1;
                          if (stackIn_66_0 >= stackIn_66_1) {
                            break L25;
                          } else {
                            stackOut_67_0 = ((uk) this).field_x.field_h[((uk) this).field_B];
                            stackIn_91_0 = stackOut_67_0;
                            stackIn_68_0 = stackOut_67_0;
                            if (var5 != 0) {
                              break L24;
                            } else {
                              stackOut_68_0 = stackIn_68_0;
                              stackIn_70_0 = stackOut_68_0;
                              L37: {
                                if (stackIn_70_0 != 0) {
                                  break L37;
                                } else {
                                  ((uk) this).field_B = ((uk) this).field_B + 1;
                                  if (var5 == 0) {
                                    continue L36;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              L38: {
                                if (((uk) this).field_p.field_d >= 250) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L25;
                                  } else {
                                    break L38;
                                  }
                                } else {
                                  break L38;
                                }
                              }
                              L39: {
                                if (((uk) this).field_g[((uk) this).field_B] != 0) {
                                  break L39;
                                } else {
                                  rk discarded$6 = this.a(92, 1, ((uk) this).field_B);
                                  break L39;
                                }
                              }
                              L40: {
                                if (((uk) this).field_g[((uk) this).field_B] == 0) {
                                  var3 = new li();
                                  var3.field_k = (long)((uk) this).field_B;
                                  var2_int = 0;
                                  ((uk) this).field_j.a(var3, false);
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                              ((uk) this).field_B = ((uk) this).field_B + 1;
                              if (var5 == 0) {
                                continue L36;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                      }
                      stackOut_90_0 = var2_int;
                      stackIn_91_0 = stackOut_90_0;
                      break L24;
                    }
                    if (stackIn_91_0 == 0) {
                      break L1;
                    } else {
                      ((uk) this).field_B = 0;
                      ((uk) this).field_m = false;
                      break L1;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            L41: {
              if (param0 >= 86) {
                break L41;
              } else {
                ((uk) this).a((byte) 81);
                break L41;
              }
            }
            L42: {
              if (!((uk) this).field_f) {
                break L42;
              } else {
                if (~gk.a(85) > ~((uk) this).field_o) {
                  break L42;
                } else {
                  var2_ref = (rk) (Object) ((uk) this).field_q.b(0);
                  L43: while (true) {
                    L44: {
                      if (var2_ref == null) {
                        break L44;
                      } else {
                        if (var5 != 0) {
                          break L42;
                        } else {
                          L45: {
                            L46: {
                              if (!var2_ref.field_z) {
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
                              if (var2_ref.field_t) {
                                break L47;
                              } else {
                                var2_ref.field_t = true;
                                if (var5 == 0) {
                                  break L45;
                                } else {
                                  break L47;
                                }
                              }
                            }
                            if (var2_ref.field_u) {
                              var2_ref.c(2);
                              break L45;
                            } else {
                              throw new RuntimeException();
                            }
                          }
                          var2_ref = (rk) (Object) ((uk) this).field_q.c(-86);
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
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var2, "uk.A(" + param0 + ')');
        }
    }

    final ff a(boolean param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ff stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_49_0 = null;
        tk stackIn_49_1 = null;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        int stackIn_49_4 = 0;
        int stackIn_49_5 = 0;
        Object stackIn_51_0 = null;
        tk stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        int stackIn_51_4 = 0;
        int stackIn_51_5 = 0;
        Object stackIn_53_0 = null;
        tk stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        int stackIn_53_4 = 0;
        int stackIn_53_5 = 0;
        Object stackIn_54_0 = null;
        tk stackIn_54_1 = null;
        int stackIn_54_2 = 0;
        int stackIn_54_3 = 0;
        int stackIn_54_4 = 0;
        int stackIn_54_5 = 0;
        int stackIn_54_6 = 0;
        Object stackIn_56_0 = null;
        ff stackIn_66_0 = null;
        RuntimeException decompiledCaughtException = null;
        ff stackOut_4_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_48_0 = null;
        tk stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        int stackOut_48_4 = 0;
        int stackOut_48_5 = 0;
        Object stackOut_53_0 = null;
        tk stackOut_53_1 = null;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        int stackOut_53_4 = 0;
        int stackOut_53_5 = 0;
        int stackOut_53_6 = 0;
        Object stackOut_49_0 = null;
        tk stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        int stackOut_49_4 = 0;
        int stackOut_49_5 = 0;
        Object stackOut_51_0 = null;
        tk stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        int stackOut_51_4 = 0;
        int stackOut_51_5 = 0;
        int stackOut_51_6 = 0;
        Object stackOut_55_0 = null;
        Object stackOut_36_0 = null;
        ff stackOut_65_0 = null;
        Object stackOut_16_0 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (null != ((uk) this).field_x) {
              stackOut_4_0 = ((uk) this).field_x;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                if (((uk) this).field_s != null) {
                  break L1;
                } else {
                  if (((uk) this).field_w.a(20)) {
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    return (ff) (Object) stackIn_13_0;
                  } else {
                    ((uk) this).field_s = (rk) (Object) ((uk) this).field_w.a(((uk) this).field_t, 255, true, (byte) 0, false);
                    break L1;
                  }
                }
              }
              if (!((uk) this).field_s.field_z) {
                L2: {
                  var2_array = ((uk) this).field_s.a((byte) -106);
                  if (param0) {
                    break L2;
                  } else {
                    ((uk) this).field_l = null;
                    break L2;
                  }
                }
                L3: {
                  if (!(((uk) this).field_s instanceof nq)) {
                    try {
                      L4: {
                        if (null == var2_array) {
                          throw new RuntimeException();
                        } else {
                          ((uk) this).field_x = new ff(var2_array, ((uk) this).field_z, ((uk) this).field_l);
                          break L4;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        L6: {
                          var3 = decompiledCaughtException;
                          ((uk) this).field_w.e(0);
                          ((uk) this).field_x = null;
                          if (!((uk) this).field_w.a(20)) {
                            break L6;
                          } else {
                            ((uk) this).field_s = null;
                            if (var4 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          stackOut_48_0 = this;
                          stackOut_48_1 = ((uk) this).field_w;
                          stackOut_48_2 = ((uk) this).field_t;
                          stackOut_48_3 = 255;
                          stackOut_48_4 = 1;
                          stackOut_48_5 = 0;
                          stackIn_53_0 = stackOut_48_0;
                          stackIn_53_1 = stackOut_48_1;
                          stackIn_53_2 = stackOut_48_2;
                          stackIn_53_3 = stackOut_48_3;
                          stackIn_53_4 = stackOut_48_4;
                          stackIn_53_5 = stackOut_48_5;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          stackIn_49_2 = stackOut_48_2;
                          stackIn_49_3 = stackOut_48_3;
                          stackIn_49_4 = stackOut_48_4;
                          stackIn_49_5 = stackOut_48_5;
                          if (param0) {
                            stackOut_53_0 = this;
                            stackOut_53_1 = (tk) (Object) stackIn_53_1;
                            stackOut_53_2 = stackIn_53_2;
                            stackOut_53_3 = stackIn_53_3;
                            stackOut_53_4 = stackIn_53_4;
                            stackOut_53_5 = stackIn_53_5;
                            stackOut_53_6 = 0;
                            stackIn_54_0 = stackOut_53_0;
                            stackIn_54_1 = stackOut_53_1;
                            stackIn_54_2 = stackOut_53_2;
                            stackIn_54_3 = stackOut_53_3;
                            stackIn_54_4 = stackOut_53_4;
                            stackIn_54_5 = stackOut_53_5;
                            stackIn_54_6 = stackOut_53_6;
                            break L7;
                          } else {
                            stackOut_49_0 = this;
                            stackOut_49_1 = (tk) (Object) stackIn_49_1;
                            stackOut_49_2 = stackIn_49_2;
                            stackOut_49_3 = stackIn_49_3;
                            stackOut_49_4 = stackIn_49_4;
                            stackOut_49_5 = stackIn_49_5;
                            stackIn_51_0 = stackOut_49_0;
                            stackIn_51_1 = stackOut_49_1;
                            stackIn_51_2 = stackOut_49_2;
                            stackIn_51_3 = stackOut_49_3;
                            stackIn_51_4 = stackOut_49_4;
                            stackIn_51_5 = stackOut_49_5;
                            stackOut_51_0 = this;
                            stackOut_51_1 = (tk) (Object) stackIn_51_1;
                            stackOut_51_2 = stackIn_51_2;
                            stackOut_51_3 = stackIn_51_3;
                            stackOut_51_4 = stackIn_51_4;
                            stackOut_51_5 = stackIn_51_5;
                            stackOut_51_6 = 1;
                            stackIn_54_0 = stackOut_51_0;
                            stackIn_54_1 = stackOut_51_1;
                            stackIn_54_2 = stackOut_51_2;
                            stackIn_54_3 = stackOut_51_3;
                            stackIn_54_4 = stackOut_51_4;
                            stackIn_54_5 = stackOut_51_5;
                            stackIn_54_6 = stackOut_51_6;
                            break L7;
                          }
                        }
                        ((uk) this).field_s = (rk) (Object) ((tk) (Object) stackIn_54_1).a(stackIn_54_2, stackIn_54_3, stackIn_54_4 != 0, (byte) stackIn_54_5, stackIn_54_6 != 0);
                        break L5;
                      }
                      stackOut_55_0 = null;
                      stackIn_56_0 = stackOut_55_0;
                      return (ff) (Object) stackIn_56_0;
                    }
                    if (((uk) this).field_k != null) {
                      nq discarded$1 = ((uk) this).field_p.a(-19932, ((uk) this).field_t, ((uk) this).field_k, var2_array);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    try {
                      L8: {
                        if (var2_array == null) {
                          throw new RuntimeException();
                        } else {
                          ((uk) this).field_x = new ff(var2_array, ((uk) this).field_z, ((uk) this).field_l);
                          if (~((uk) this).field_x.field_c == ~((uk) this).field_A) {
                            break L8;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L9: {
                        L10: {
                          var3 = decompiledCaughtException;
                          ((uk) this).field_x = null;
                          if (!((uk) this).field_w.a(20)) {
                            break L10;
                          } else {
                            ((uk) this).field_s = null;
                            if (var4 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        ((uk) this).field_s = (rk) (Object) ((uk) this).field_w.a(((uk) this).field_t, 255, true, (byte) 0, false);
                        break L9;
                      }
                      stackOut_36_0 = null;
                      stackIn_37_0 = stackOut_36_0;
                      return (ff) (Object) stackIn_37_0;
                    }
                    break L3;
                  }
                }
                L11: {
                  if (((uk) this).field_i != null) {
                    ((uk) this).field_g = new byte[((uk) this).field_x.field_p];
                    break L11;
                  } else {
                    break L11;
                  }
                }
                ((uk) this).field_s = null;
                stackOut_65_0 = ((uk) this).field_x;
                stackIn_66_0 = stackOut_65_0;
                break L0;
              } else {
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                return (ff) (Object) stackIn_17_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var2, "uk.F(" + param0 + ')');
        }
        return stackIn_66_0;
    }

    private final rk a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
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
        Object stackIn_26_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_59_0 = null;
        byte stackIn_80_0 = 0;
        byte stackIn_80_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        Object stackIn_100_0 = null;
        Object stackIn_109_0 = null;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        Object stackIn_145_0 = null;
        int stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        Object stackIn_157_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_25_0 = null;
        Object stackOut_53_0 = null;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        Object stackOut_144_0 = null;
        byte stackOut_149_0 = 0;
        int stackOut_149_1 = 0;
        Object stackOut_156_0 = null;
        byte stackOut_79_0 = 0;
        byte stackOut_79_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        Object stackOut_99_0 = null;
        Object stackOut_108_0 = null;
        Object stackOut_58_0 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 38 / ((33 - param0) / 55);
              var5 = (Object) (Object) (rk) (Object) ((uk) this).field_q.a((long)param2, (byte) 64);
              if (var5 == null) {
                break L1;
              } else {
                if (0 != param1) {
                  break L1;
                } else {
                  if (((rk) var5).field_u) {
                    break L1;
                  } else {
                    if (!((rk) var5).field_z) {
                      break L1;
                    } else {
                      ((rk) var5).c(2);
                      var5 = null;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (var5 != null) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (0 != param1) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          if (((uk) this).field_i == null) {
                            break L6;
                          } else {
                            if (-1 != ((uk) this).field_g[param2]) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (!((uk) this).field_w.a(20)) {
                          var5 = (Object) (Object) ((uk) this).field_w.a(param2, ((uk) this).field_t, true, (byte) 2, false);
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        } else {
                          stackOut_25_0 = null;
                          stackIn_26_0 = stackOut_25_0;
                          return (rk) (Object) stackIn_26_0;
                        }
                      }
                      var5 = (Object) (Object) ((uk) this).field_p.a(true, ((uk) this).field_i, param2);
                      if (var11 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L7: {
                    if (param1 != 1) {
                      break L7;
                    } else {
                      if (null == ((uk) this).field_i) {
                        throw new RuntimeException();
                      } else {
                        var5 = (Object) (Object) ((uk) this).field_p.a(((uk) this).field_i, param2, (byte) 48);
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L7;
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
                          break L3;
                        } else {
                          stackOut_53_0 = null;
                          stackIn_54_0 = stackOut_53_0;
                          return (rk) (Object) stackIn_54_0;
                        }
                      }
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
                ((uk) this).field_q.a((li) var5, (long)param2, false);
                break L2;
              }
            }
            if (!((rk) var5).field_z) {
              var6 = ((rk) var5).a((byte) -106);
              if (!(var5 instanceof nq)) {
                try {
                  L8: {
                    L9: {
                      if (null == var6) {
                        break L9;
                      } else {
                        if (var6.length > 2) {
                          kc.field_d.reset();
                          kc.field_d.update(var6, 0, var6.length + -2);
                          var7_int = (int)kc.field_d.getValue();
                          if (((uk) this).field_x.field_j[param2] != var7_int) {
                            throw new RuntimeException();
                          } else {
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
                                      stackOut_128_0 = ~var9[var10];
                                      stackOut_128_1 = ~var8[var10];
                                      stackIn_150_0 = stackOut_128_0;
                                      stackIn_150_1 = stackOut_128_1;
                                      stackIn_129_0 = stackOut_128_0;
                                      stackIn_129_1 = stackOut_128_1;
                                      if (var11 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L8;
                                      } else {
                                        if (stackIn_129_0 == stackIn_129_1) {
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
                                  break L10;
                                }
                              }
                            }
                            ((uk) this).field_w.field_m = 0;
                            ((uk) this).field_w.field_j = 0;
                            decompiledRegionSelector0 = 1;
                            break L8;
                          }
                        } else {
                          break L9;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L12: {
                    var7_ref = (RuntimeException) (Object) decompiledCaughtException;
                    ((uk) this).field_w.e(0);
                    ((rk) var5).c(2);
                    if (!((rk) var5).field_u) {
                      break L12;
                    } else {
                      if (!((uk) this).field_w.a(20)) {
                        var5 = (Object) (Object) ((uk) this).field_w.a(param2, ((uk) this).field_t, true, (byte) 2, false);
                        ((uk) this).field_q.a((li) var5, (long)param2, false);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  stackOut_144_0 = null;
                  stackIn_145_0 = stackOut_144_0;
                  return (rk) (Object) stackIn_145_0;
                }
                L13: {
                  L14: {
                    if (decompiledRegionSelector0 == 0) {
                      break L14;
                    } else {
                      var6[-2 + var6.length] = (byte)(((uk) this).field_x.field_l[param2] >>> 1155415752);
                      var6[var6.length + -1] = (byte)((uk) this).field_x.field_l[param2];
                      if (null != ((uk) this).field_i) {
                        nq discarded$1 = ((uk) this).field_p.a(-19932, param2, ((uk) this).field_i, var6);
                        stackOut_149_0 = ((uk) this).field_g[param2];
                        stackOut_149_1 = 1;
                        stackIn_150_0 = stackOut_149_0;
                        stackIn_150_1 = stackOut_149_1;
                        break L14;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (stackIn_150_0 == stackIn_150_1) {
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
                stackOut_156_0 = var5;
                stackIn_157_0 = stackOut_156_0;
                break L0;
              } else {
                try {
                  L16: {
                    L17: {
                      if (null == var6) {
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
                                        stackOut_79_0 = var8[var10];
                                        stackOut_79_1 = var9[var10];
                                        stackIn_87_0 = stackOut_79_0;
                                        stackIn_87_1 = stackOut_79_1;
                                        stackIn_80_0 = stackOut_79_0;
                                        stackIn_80_1 = stackOut_79_1;
                                        if (var11 != 0) {
                                          break L18;
                                        } else {
                                          if (stackIn_80_0 != stackIn_80_1) {
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
                              stackOut_86_0 = var6[var6.length - 1] & 255;
                              stackOut_86_1 = (var6[var6.length - 2] & 255) << -1727840152;
                              stackIn_87_0 = stackOut_86_0;
                              stackIn_87_1 = stackOut_86_1;
                              break L18;
                            }
                            var8_int = stackIn_87_0 + stackIn_87_1;
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
                              stackOut_99_0 = var5;
                              stackIn_100_0 = stackOut_99_0;
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
                  stackOut_108_0 = null;
                  stackIn_109_0 = stackOut_108_0;
                  return (rk) (Object) stackIn_109_0;
                }
                return (rk) (Object) stackIn_100_0;
              }
            } else {
              stackOut_58_0 = null;
              stackIn_59_0 = stackOut_58_0;
              return (rk) (Object) stackIn_59_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          throw wn.a((Throwable) (Object) var4, "uk.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (rk) (Object) stackIn_157_0;
    }

    final static void a(r param0, r param1, int param2) {
        RuntimeException var3 = null;
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
              if (param2 >= 115) {
                break L1;
              } else {
                field_u = null;
                break L1;
              }
            }
            oc.field_r = param0;
            hd.field_b = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("uk.I(");
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
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
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ')');
        }
    }

    final int b(int param0, int param1) {
        rk var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 == 57) {
              var3 = (rk) (Object) ((uk) this).field_q.a((long)param0, (byte) 64);
              if (null != var3) {
                stackOut_6_0 = var3.i(109);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 100;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var3_ref, "uk.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    uk(int param0, qh param1, qh param2, tk param3, t param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
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
              ((uk) this).field_f = param8;
              ((uk) this).field_A = param7;
              ((uk) this).field_z = param5;
              ((uk) this).field_k = param2;
              ((uk) this).field_p = param4;
              if (((uk) this).field_k != null) {
                ((uk) this).field_s = (rk) (Object) ((uk) this).field_p.a(true, ((uk) this).field_k, ((uk) this).field_t);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("uk.<init>(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
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
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param5).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param6 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L8;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "No options available";
    }
}
