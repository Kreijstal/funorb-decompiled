/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends hl {
    private cd field_q;
    private int field_l;
    private int field_d;
    private pc field_s;
    private sg field_g;
    private ab field_n;
    private ml field_v;
    private byte[] field_w;
    private sg field_m;
    private na field_i;
    private int field_k;
    private byte[] field_x;
    static oi field_t;
    private oi field_p;
    private int field_o;
    static int field_f;
    private oi field_u;
    private boolean field_j;
    private boolean field_r;
    private boolean field_e;
    private long field_h;

    final void a(int param0) {
        RuntimeException var2 = null;
        wl var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            if (null == ((fh) this).field_p) {
              return;
            } else {
              if (((fh) this).b(false) == null) {
                return;
              } else {
                L1: {
                  if (param0 == -3) {
                    break L1;
                  } else {
                    fh.c(16, 122);
                    break L1;
                  }
                }
                var2_ref = ((fh) this).field_u.b((byte) 72);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var2_ref == null) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_e;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (~var3 <= ~((fh) this).field_s.field_s) {
                                    break L7;
                                  } else {
                                    if (0 != ((fh) this).field_s.field_p[var3]) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var2_ref.a(false);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (((fh) this).field_w[var3] != 0) {
                                break L8;
                              } else {
                                ml discarded$2 = this.a(-23529, 1, var3);
                                break L8;
                              }
                            }
                            L9: {
                              if (-1 == ((fh) this).field_w[var3]) {
                                ml discarded$3 = this.a(-23529, 2, var3);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            if (((fh) this).field_w[var3] != 1) {
                              break L5;
                            } else {
                              var2_ref.a(false);
                              break L5;
                            }
                          }
                          var2_ref = ((fh) this).field_u.d(param0 ^ -8195);
                          if (var4 == 0) {
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "fh.K(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ml var2_ref = null;
        wl var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_15_0 = 0;
        byte stackIn_15_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_98_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        byte stackOut_14_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        int stackOut_97_0 = 0;
        var5 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 == 25) {
                break L1;
              } else {
                ((fh) this).field_o = -118;
                break L1;
              }
            }
            L2: {
              if (((fh) this).field_p != null) {
                if (null == ((fh) this).b(false)) {
                  return;
                } else {
                  L3: {
                    if (!((fh) this).field_r) {
                      break L3;
                    } else {
                      var2_int = 1;
                      var3 = ((fh) this).field_p.b((byte) 83);
                      L4: while (true) {
                        L5: {
                          L6: {
                            L7: {
                              if (null == var3) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_e;
                                stackOut_14_0 = 0;
                                stackOut_14_1 = ((fh) this).field_w[var4];
                                stackIn_26_0 = stackOut_14_0;
                                stackIn_26_1 = stackOut_14_1;
                                stackIn_15_0 = stackOut_14_0;
                                stackIn_15_1 = stackOut_14_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_26_0 <= stackIn_26_1) {
                                      break L6;
                                    } else {
                                      stackOut_27_0 = ((fh) this).field_s.field_p[((fh) this).field_o];
                                      stackIn_50_0 = stackOut_27_0;
                                      stackIn_28_0 = stackOut_27_0;
                                      if (var5 != 0) {
                                        break L5;
                                      } else {
                                        stackOut_28_0 = stackIn_28_0;
                                        stackIn_30_0 = stackOut_28_0;
                                        L9: {
                                          L10: {
                                            if (stackIn_30_0 == 0) {
                                              ((fh) this).field_o = ((fh) this).field_o + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                          L11: {
                                            if (((fh) this).field_q.field_b >= 250) {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L6;
                                              } else {
                                                break L11;
                                              }
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (0 != ((fh) this).field_w[((fh) this).field_o]) {
                                              break L12;
                                            } else {
                                              ml discarded$4 = this.a(-23529, 1, ((fh) this).field_o);
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (0 == ((fh) this).field_w[((fh) this).field_o]) {
                                              var3 = new wl();
                                              var3.field_e = (long)((fh) this).field_o;
                                              var2_int = 0;
                                              ((fh) this).field_p.a(var3, false);
                                              break L13;
                                            } else {
                                              break L13;
                                            }
                                          }
                                          ((fh) this).field_o = ((fh) this).field_o + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_25_0 = ((fh) this).field_s.field_p.length;
                                        stackOut_25_1 = ((fh) this).field_o;
                                        stackIn_26_0 = stackOut_25_0;
                                        stackIn_26_1 = stackOut_25_1;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_15_0 == stackIn_15_1) {
                                      ml discarded$5 = this.a(-23529, 1, var4);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (((fh) this).field_w[var4] != 0) {
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
                                    var3.a(false);
                                    break L15;
                                  }
                                  var3 = ((fh) this).field_p.d(8192);
                                  if (var5 == 0) {
                                    continue L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_25_0 = ((fh) this).field_s.field_p.length;
                              stackOut_25_1 = ((fh) this).field_o;
                              stackIn_26_0 = stackOut_25_0;
                              stackIn_26_1 = stackOut_25_1;
                              if (stackIn_26_0 <= stackIn_26_1) {
                                break L6;
                              } else {
                                stackOut_27_0 = ((fh) this).field_s.field_p[((fh) this).field_o];
                                stackIn_50_0 = stackOut_27_0;
                                stackIn_28_0 = stackOut_27_0;
                                if (var5 != 0) {
                                  break L5;
                                } else {
                                  stackOut_28_0 = stackIn_28_0;
                                  stackIn_30_0 = stackOut_28_0;
                                  L18: {
                                    if (stackIn_30_0 == 0) {
                                      ((fh) this).field_o = ((fh) this).field_o + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L18;
                                      }
                                    } else {
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (((fh) this).field_q.field_b >= 250) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L19;
                                      }
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (0 != ((fh) this).field_w[((fh) this).field_o]) {
                                      break L20;
                                    } else {
                                      ml discarded$4 = this.a(-23529, 1, ((fh) this).field_o);
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (0 == ((fh) this).field_w[((fh) this).field_o]) {
                                      var3 = new wl();
                                      var3.field_e = (long)((fh) this).field_o;
                                      var2_int = 0;
                                      ((fh) this).field_p.a(var3, false);
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                  ((fh) this).field_o = ((fh) this).field_o + 1;
                                  if (var5 == 0) {
                                    continue L17;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_49_0 = var2_int;
                          stackIn_50_0 = stackOut_49_0;
                          break L5;
                        }
                        L22: {
                          if (stackIn_50_0 != 0) {
                            ((fh) this).field_o = 0;
                            ((fh) this).field_r = false;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L23: {
                    if (((fh) this).field_j) {
                      break L23;
                    } else {
                      ((fh) this).field_p = null;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L23;
                      }
                    }
                  }
                  var2_int = 1;
                  var3 = ((fh) this).field_p.b((byte) 73);
                  L24: while (true) {
                    L25: {
                      L26: {
                        L27: {
                          if (null == var3) {
                            break L27;
                          } else {
                            var4 = (int)var3.field_e;
                            stackOut_62_0 = ~((fh) this).field_w[var4];
                            stackOut_62_1 = -2;
                            stackIn_75_0 = stackOut_62_0;
                            stackIn_75_1 = stackOut_62_1;
                            stackIn_63_0 = stackOut_62_0;
                            stackIn_63_1 = stackOut_62_1;
                            if (var5 != 0) {
                              L28: while (true) {
                                if (stackIn_75_0 >= stackIn_75_1) {
                                  break L26;
                                } else {
                                  stackOut_76_0 = ((fh) this).field_s.field_p[((fh) this).field_o];
                                  stackIn_98_0 = stackOut_76_0;
                                  stackIn_77_0 = stackOut_76_0;
                                  if (var5 != 0) {
                                    break L25;
                                  } else {
                                    stackOut_77_0 = stackIn_77_0;
                                    stackIn_79_0 = stackOut_77_0;
                                    L29: {
                                      L30: {
                                        if (stackIn_79_0 != 0) {
                                          break L30;
                                        } else {
                                          ((fh) this).field_o = ((fh) this).field_o + 1;
                                          if (var5 == 0) {
                                            break L29;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                      L31: {
                                        if (((fh) this).field_i.c(-21)) {
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
                                        if (1 == ((fh) this).field_w[((fh) this).field_o]) {
                                          break L32;
                                        } else {
                                          ml discarded$6 = this.a(-23529, 2, ((fh) this).field_o);
                                          break L32;
                                        }
                                      }
                                      L33: {
                                        if (((fh) this).field_w[((fh) this).field_o] == 1) {
                                          break L33;
                                        } else {
                                          var3 = new wl();
                                          var3.field_e = (long)((fh) this).field_o;
                                          ((fh) this).field_p.a(var3, false);
                                          var2_int = 0;
                                          break L33;
                                        }
                                      }
                                      ((fh) this).field_o = ((fh) this).field_o + 1;
                                      if (var5 == 0) {
                                        break L29;
                                      } else {
                                        break L26;
                                      }
                                    }
                                    stackOut_74_0 = ((fh) this).field_o;
                                    stackOut_74_1 = ((fh) this).field_s.field_p.length;
                                    stackIn_75_0 = stackOut_74_0;
                                    stackIn_75_1 = stackOut_74_1;
                                    continue L28;
                                  }
                                }
                              }
                            } else {
                              L34: {
                                if (stackIn_63_0 != stackIn_63_1) {
                                  ml discarded$7 = this.a(-23529, 2, var4);
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                              L35: {
                                L36: {
                                  if (((fh) this).field_w[var4] != 1) {
                                    break L36;
                                  } else {
                                    var3.a(false);
                                    if (var5 == 0) {
                                      break L35;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L35;
                              }
                              var3 = ((fh) this).field_p.d(8192);
                              if (var5 == 0) {
                                continue L24;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        L37: while (true) {
                          stackOut_74_0 = ((fh) this).field_o;
                          stackOut_74_1 = ((fh) this).field_s.field_p.length;
                          stackIn_75_0 = stackOut_74_0;
                          stackIn_75_1 = stackOut_74_1;
                          if (stackIn_75_0 >= stackIn_75_1) {
                            break L26;
                          } else {
                            stackOut_76_0 = ((fh) this).field_s.field_p[((fh) this).field_o];
                            stackIn_98_0 = stackOut_76_0;
                            stackIn_77_0 = stackOut_76_0;
                            if (var5 != 0) {
                              break L25;
                            } else {
                              stackOut_77_0 = stackIn_77_0;
                              stackIn_79_0 = stackOut_77_0;
                              L38: {
                                if (stackIn_79_0 != 0) {
                                  break L38;
                                } else {
                                  ((fh) this).field_o = ((fh) this).field_o + 1;
                                  if (var5 == 0) {
                                    continue L37;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              L39: {
                                if (((fh) this).field_i.c(-21)) {
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
                                if (1 == ((fh) this).field_w[((fh) this).field_o]) {
                                  break L40;
                                } else {
                                  ml discarded$6 = this.a(-23529, 2, ((fh) this).field_o);
                                  break L40;
                                }
                              }
                              L41: {
                                if (((fh) this).field_w[((fh) this).field_o] == 1) {
                                  break L41;
                                } else {
                                  var3 = new wl();
                                  var3.field_e = (long)((fh) this).field_o;
                                  ((fh) this).field_p.a(var3, false);
                                  var2_int = 0;
                                  break L41;
                                }
                              }
                              ((fh) this).field_o = ((fh) this).field_o + 1;
                              if (var5 == 0) {
                                continue L37;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                      }
                      stackOut_97_0 = var2_int;
                      stackIn_98_0 = stackOut_97_0;
                      break L25;
                    }
                    if (stackIn_98_0 != 0) {
                      ((fh) this).field_o = 0;
                      ((fh) this).field_j = false;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            L42: {
              if (!((fh) this).field_e) {
                break L42;
              } else {
                if (~d.a((byte) 100) <= ~((fh) this).field_h) {
                  var2_ref = (ml) (Object) ((fh) this).field_n.b((byte) -114);
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
                              if (!var2_ref.field_s) {
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
                              if (!var2_ref.field_q) {
                                break L47;
                              } else {
                                if (!var2_ref.field_r) {
                                  throw new RuntimeException();
                                } else {
                                  var2_ref.a(false);
                                  if (var5 == 0) {
                                    break L45;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                            }
                            var2_ref.field_q = true;
                            break L45;
                          }
                          var2_ref = (ml) (Object) ((fh) this).field_n.b(param0 ^ 24);
                          if (var5 == 0) {
                            continue L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    ((fh) this).field_h = 1000L + d.a((byte) 67);
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
          throw bd.a((Throwable) (Object) var2, "fh.F(" + param0 + ')');
        }
    }

    private final ml a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        Object stackIn_101_0 = null;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        Object stackIn_113_0 = null;
        byte stackIn_131_0 = 0;
        byte stackIn_131_1 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        Object stackIn_152_0 = null;
        Object stackIn_159_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_42_0 = null;
        Object stackOut_56_0 = null;
        Object stackOut_62_0 = null;
        byte stackOut_130_0 = 0;
        byte stackOut_130_1 = 0;
        int stackOut_137_0 = 0;
        int stackOut_137_1 = 0;
        Object stackOut_151_0 = null;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        Object stackOut_100_0 = null;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        Object stackOut_112_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_158_0 = null;
        var10 = wizardrun.field_H;
        try {
          try {
            if (param0 == -23529) {
              L0: {
                var4 = (Object) (Object) (ml) (Object) ((fh) this).field_n.a(1, (long)param2);
                if (var4 == null) {
                  break L0;
                } else {
                  if (param1 != 0) {
                    break L0;
                  } else {
                    if (((ml) var4).field_r) {
                      break L0;
                    } else {
                      if (!((ml) var4).field_s) {
                        break L0;
                      } else {
                        ((ml) var4).a(false);
                        var4 = null;
                        break L0;
                      }
                    }
                  }
                }
              }
              L1: {
                if (null == var4) {
                  L2: {
                    L3: {
                      if (param1 == 0) {
                        break L3;
                      } else {
                        L4: {
                          if (param1 != 1) {
                            break L4;
                          } else {
                            if (null == ((fh) this).field_g) {
                              throw new RuntimeException();
                            } else {
                              var4 = (Object) (Object) ((fh) this).field_q.a((byte) -46, param2, ((fh) this).field_g);
                              if (var10 == 0) {
                                break L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        if (param1 == 2) {
                          if (null != ((fh) this).field_g) {
                            if (((fh) this).field_w[param2] != -1) {
                              throw new RuntimeException();
                            } else {
                              if (!((fh) this).field_i.c(-21)) {
                                var4 = (Object) (Object) ((fh) this).field_i.a(((fh) this).field_d, param2, (byte) -73, (byte) 2, false);
                                if (var10 == 0) {
                                  break L2;
                                } else {
                                  break L3;
                                }
                              } else {
                                stackOut_42_0 = null;
                                stackIn_43_0 = stackOut_42_0;
                                return (ml) (Object) stackIn_43_0;
                              }
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                    L5: {
                      if (((fh) this).field_g == null) {
                        break L5;
                      } else {
                        if (((fh) this).field_w[param2] == -1) {
                          break L5;
                        } else {
                          var4 = (Object) (Object) ((fh) this).field_q.a(param2, 1, ((fh) this).field_g);
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (((fh) this).field_i.a(3473)) {
                        break L6;
                      } else {
                        var4 = (Object) (Object) ((fh) this).field_i.a(((fh) this).field_d, param2, (byte) -85, (byte) 2, true);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackOut_56_0 = null;
                    stackIn_57_0 = stackOut_56_0;
                    return (ml) (Object) stackIn_57_0;
                  }
                  ((fh) this).field_n.a((wl) var4, param0 + 23462, (long)param2);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (((ml) var4).field_s) {
                stackOut_62_0 = null;
                stackIn_63_0 = stackOut_62_0;
                return (ml) (Object) stackIn_63_0;
              } else {
                var5 = ((ml) var4).d(95);
                if (var4 instanceof sk) {
                  L7: {
                    if (var5 == null) {
                      break L7;
                    } else {
                      if (var5.length > 2) {
                        rk.field_j.reset();
                        rk.field_j.update(var5, 0, -2 + var5.length);
                        var6_int = (int)rk.field_j.getValue();
                        if (((fh) this).field_s.field_q[param2] != var6_int) {
                          throw new RuntimeException();
                        } else {
                          L8: {
                            L9: {
                              if (null == ((fh) this).field_s.field_j) {
                                break L9;
                              } else {
                                if (null == ((fh) this).field_s.field_j[param2]) {
                                  break L9;
                                } else {
                                  var7_ref_byte__ = ((fh) this).field_s.field_j[param2];
                                  var8 = id.a(var5, 0, -2 + var5.length, 0);
                                  var9 = 0;
                                  L10: while (true) {
                                    if (64 <= var9) {
                                      break L9;
                                    } else {
                                      stackOut_130_0 = var8[var9];
                                      stackOut_130_1 = var7_ref_byte__[var9];
                                      stackIn_138_0 = stackOut_130_0;
                                      stackIn_138_1 = stackOut_130_1;
                                      stackIn_131_0 = stackOut_130_0;
                                      stackIn_131_1 = stackOut_130_1;
                                      if (var10 != 0) {
                                        break L8;
                                      } else {
                                        if (stackIn_131_0 != stackIn_131_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L10;
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
                            stackOut_137_0 = (255 & var5[var5.length + -2]) << 1080720936;
                            stackOut_137_1 = -(var5[-1 + var5.length] & 255);
                            stackIn_138_0 = stackOut_137_0;
                            stackIn_138_1 = stackOut_137_1;
                            break L8;
                          }
                          var7 = stackIn_138_0 - stackIn_138_1;
                          if (~var7 != ~(65535 & ((fh) this).field_s.field_n[param2])) {
                            throw new RuntimeException();
                          } else {
                            L11: {
                              if (((fh) this).field_w[param2] != 1) {
                                L12: {
                                  if (((fh) this).field_w[param2] != 0) {
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                ((fh) this).field_w[param2] = (byte) 1;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L13: {
                              if (!((ml) var4).field_r) {
                                ((ml) var4).a(false);
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            stackOut_151_0 = var4;
                            stackIn_152_0 = stackOut_151_0;
                            return (ml) (Object) stackIn_152_0;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                  throw new RuntimeException();
                } else {
                  try {
                    L14: {
                      L15: {
                        if (var5 == null) {
                          break L15;
                        } else {
                          if (var5.length <= 2) {
                            break L15;
                          } else {
                            rk.field_j.reset();
                            rk.field_j.update(var5, 0, -2 + var5.length);
                            var6_int = (int)rk.field_j.getValue();
                            if (~((fh) this).field_s.field_q[param2] != ~var6_int) {
                              throw new RuntimeException();
                            } else {
                              L16: {
                                if (null == ((fh) this).field_s.field_j) {
                                  break L16;
                                } else {
                                  if (null != ((fh) this).field_s.field_j[param2]) {
                                    var7_ref_byte__ = ((fh) this).field_s.field_j[param2];
                                    var8 = id.a(var5, 0, var5.length + -2, 0);
                                    var9 = 0;
                                    L17: while (true) {
                                      if (64 <= var9) {
                                        break L16;
                                      } else {
                                        stackOut_84_0 = ~var8[var9];
                                        stackOut_84_1 = ~var7_ref_byte__[var9];
                                        stackIn_106_0 = stackOut_84_0;
                                        stackIn_106_1 = stackOut_84_1;
                                        stackIn_85_0 = stackOut_84_0;
                                        stackIn_85_1 = stackOut_84_1;
                                        if (var10 != 0) {
                                          decompiledRegionSelector0 = 0;
                                          break L14;
                                        } else {
                                          if (stackIn_85_0 == stackIn_85_1) {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L17;
                                            } else {
                                              break L16;
                                            }
                                          } else {
                                            throw new RuntimeException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              ((fh) this).field_i.field_k = 0;
                              ((fh) this).field_i.field_n = 0;
                              decompiledRegionSelector0 = 1;
                              break L14;
                            }
                          }
                        }
                      }
                      throw new RuntimeException();
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L18: {
                      var6 = (RuntimeException) (Object) decompiledCaughtException;
                      ((fh) this).field_i.a(true);
                      ((ml) var4).a(false);
                      if (((ml) var4).field_r) {
                        if (!((fh) this).field_i.a(3473)) {
                          var4 = (Object) (Object) ((fh) this).field_i.a(((fh) this).field_d, param2, (byte) -125, (byte) 2, true);
                          ((fh) this).field_n.a((wl) var4, -115, (long)param2);
                          break L18;
                        } else {
                          break L18;
                        }
                      } else {
                        break L18;
                      }
                    }
                    stackOut_100_0 = null;
                    stackIn_101_0 = stackOut_100_0;
                    return (ml) (Object) stackIn_101_0;
                  }
                  L19: {
                    L20: {
                      if (decompiledRegionSelector0 == 0) {
                        break L20;
                      } else {
                        var5[-2 + var5.length] = (byte)(((fh) this).field_s.field_n[param2] >>> 359382024);
                        var5[var5.length - 1] = (byte)((fh) this).field_s.field_n[param2];
                        if (null != ((fh) this).field_g) {
                          sk discarded$1 = ((fh) this).field_q.a((byte) -124, ((fh) this).field_g, var5, param2);
                          stackOut_105_0 = -2;
                          stackOut_105_1 = ~((fh) this).field_w[param2];
                          stackIn_106_0 = stackOut_105_0;
                          stackIn_106_1 = stackOut_105_1;
                          break L20;
                        } else {
                          break L19;
                        }
                      }
                    }
                    if (stackIn_106_0 == stackIn_106_1) {
                      break L19;
                    } else {
                      ((fh) this).field_w[param2] = (byte) 1;
                      break L19;
                    }
                  }
                  L21: {
                    if (((ml) var4).field_r) {
                      break L21;
                    } else {
                      ((ml) var4).a(false);
                      break L21;
                    }
                  }
                  stackOut_112_0 = var4;
                  stackIn_113_0 = stackOut_112_0;
                  return (ml) (Object) stackIn_113_0;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ml) (Object) stackIn_3_0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L22: {
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((fh) this).field_w[param2] = (byte) -1;
              ((ml) var4).a(false);
              if (((ml) var4).field_r) {
                if (((fh) this).field_i.a(3473)) {
                  break L22;
                } else {
                  var4 = (Object) (Object) ((fh) this).field_i.a(((fh) this).field_d, param2, (byte) -123, (byte) 2, true);
                  ((fh) this).field_n.a((wl) var4, -103, (long)param2);
                  break L22;
                }
              } else {
                break L22;
              }
            }
            stackOut_158_0 = null;
            stackIn_159_0 = stackOut_158_0;
            return (ml) (Object) stackIn_159_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw bd.a((Throwable) var4, "fh.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b(byte param0) {
        try {
            field_t = null;
            if (param0 != -8) {
                field_t = null;
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "fh.D(" + param0 + ')');
        }
    }

    final static void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        ai var2 = null;
        nj var2_ref = null;
        int var3 = 0;
        ai stackIn_6_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        ai stackOut_5_0 = null;
        wl stackOut_7_0 = null;
        var3 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var2 = (ai) (Object) field_t.b((byte) 100);
              if (param0 == -28323) {
                break L1;
              } else {
                fh.b((byte) 68);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var2 == null) {
                    break L4;
                  } else {
                    og.a(var2, param1, 123);
                    stackOut_5_0 = (ai) (Object) field_t.d(8192);
                    stackIn_8_0 = (Object) (Object) stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var3 != 0) {
                      break L3;
                    } else {
                      var2 = stackIn_6_0;
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_7_0 = pc.field_l.b((byte) 91);
                stackIn_8_0 = (Object) (Object) stackOut_7_0;
                break L3;
              }
              var2_ref = (nj) (Object) stackIn_8_0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (var2_ref == null) {
                      break L7;
                    } else {
                      ri.a(var2_ref, param1, (byte) 121);
                      var2_ref = (nj) (Object) pc.field_l.d(8192);
                      if (var3 != 0) {
                        break L6;
                      } else {
                        if (var3 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  break L6;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw bd.a((Throwable) (Object) runtimeException, "fh.G(" + param0 + ',' + param1 + ')');
        }
    }

    final byte[] a(byte param0, int param1) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        try {
          L0: {
            var3 = this.a(-23529, 0, param1);
            if (var3 == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              L1: {
                var4 = var3.d(95);
                if (param0 < -21) {
                  break L1;
                } else {
                  fh.c(-33, -78);
                  break L1;
                }
              }
              var3.a(false);
              stackOut_8_0 = (byte[]) var4;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3_ref, "fh.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final static void c(int param0, int param1) {
        RuntimeException runtimeException = null;
        of var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var2 = (of) (Object) bh.field_b.b((byte) 96);
              if (param1 == 0) {
                break L1;
              } else {
                field_f = 48;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var2 == null) {
                    break L4;
                  } else {
                    di.a(var2, param0, (byte) -81);
                    var2 = (of) (Object) bh.field_b.d(param1 ^ 8192);
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
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
          runtimeException = decompiledCaughtException;
          throw bd.a((Throwable) (Object) runtimeException, "fh.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 11682) {
                break L1;
              } else {
                fh.b(-2, 121);
                break L1;
              }
            }
            param1 = (param1 & 1431655765) - -((param1 & -1431655765) >>> 734649505);
            param1 = ((param1 & -858993460) >>> -840074718) + (858993459 & param1);
            param1 = param1 - -(param1 >>> 1817374596) & 252645135;
            param1 = param1 + (param1 >>> -781462488);
            param1 = param1 + (param1 >>> -679920880);
            stackOut_3_0 = 255 & param1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "fh.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void a(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((fh) this).field_g != null) {
              L1: {
                var2_int = -38 / ((-32 - param0) / 59);
                ((fh) this).field_j = true;
                if (null != ((fh) this).field_p) {
                  break L1;
                } else {
                  ((fh) this).field_p = new oi();
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw bd.a((Throwable) (Object) runtimeException, "fh.A(" + param0 + ')');
        }
    }

    final pc b(boolean param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        pc stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_34_0 = null;
        na stackIn_42_0 = null;
        na stackIn_44_0 = null;
        na stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_52_0 = null;
        pc stackIn_62_0 = null;
        RuntimeException decompiledCaughtException = null;
        pc stackOut_4_0 = null;
        Object stackOut_10_0 = null;
        na stackOut_41_0 = null;
        na stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        na stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_51_0 = null;
        Object stackOut_33_0 = null;
        pc stackOut_61_0 = null;
        Object stackOut_14_0 = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            if (((fh) this).field_s != null) {
              stackOut_4_0 = ((fh) this).field_s;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                if (null != ((fh) this).field_v) {
                  break L1;
                } else {
                  if (!((fh) this).field_i.a(3473)) {
                    ((fh) this).field_v = (ml) (Object) ((fh) this).field_i.a(255, ((fh) this).field_d, (byte) -119, (byte) 0, true);
                    break L1;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (pc) (Object) stackIn_11_0;
                  }
                }
              }
              if (!((fh) this).field_v.field_s) {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    ((fh) this).c((byte) -59);
                    break L2;
                  }
                }
                L3: {
                  var2_array = ((fh) this).field_v.d(95);
                  if (!(((fh) this).field_v instanceof sk)) {
                    try {
                      L4: {
                        if (var2_array == null) {
                          throw new RuntimeException();
                        } else {
                          ((fh) this).field_s = new pc(var2_array, ((fh) this).field_l, ((fh) this).field_x);
                          break L4;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3 = decompiledCaughtException;
                        stackOut_41_0 = ((fh) this).field_i;
                        stackIn_44_0 = stackOut_41_0;
                        stackIn_42_0 = stackOut_41_0;
                        if (param0) {
                          stackOut_44_0 = (na) (Object) stackIn_44_0;
                          stackOut_44_1 = 0;
                          stackIn_45_0 = stackOut_44_0;
                          stackIn_45_1 = stackOut_44_1;
                          break L5;
                        } else {
                          stackOut_42_0 = (na) (Object) stackIn_42_0;
                          stackOut_42_1 = 1;
                          stackIn_45_0 = stackOut_42_0;
                          stackIn_45_1 = stackOut_42_1;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          ((na) (Object) stackIn_45_0).a(stackIn_45_1 != 0);
                          ((fh) this).field_s = null;
                          if (((fh) this).field_i.a(3473)) {
                            break L7;
                          } else {
                            ((fh) this).field_v = (ml) (Object) ((fh) this).field_i.a(255, ((fh) this).field_d, (byte) -88, (byte) 0, true);
                            if (var4 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        ((fh) this).field_v = null;
                        break L6;
                      }
                      stackOut_51_0 = null;
                      stackIn_52_0 = stackOut_51_0;
                      return (pc) (Object) stackIn_52_0;
                    }
                    if (null != ((fh) this).field_m) {
                      sk discarded$1 = ((fh) this).field_q.a((byte) 0, ((fh) this).field_m, var2_array, ((fh) this).field_d);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    try {
                      L8: {
                        if (null != var2_array) {
                          ((fh) this).field_s = new pc(var2_array, ((fh) this).field_l, ((fh) this).field_x);
                          if (~((fh) this).field_k == ~((fh) this).field_s.field_f) {
                            break L8;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L9: {
                        L10: {
                          var3 = decompiledCaughtException;
                          ((fh) this).field_s = null;
                          if (((fh) this).field_i.a(3473)) {
                            break L10;
                          } else {
                            ((fh) this).field_v = (ml) (Object) ((fh) this).field_i.a(255, ((fh) this).field_d, (byte) -100, (byte) 0, true);
                            if (var4 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        ((fh) this).field_v = null;
                        break L9;
                      }
                      stackOut_33_0 = null;
                      stackIn_34_0 = stackOut_33_0;
                      return (pc) (Object) stackIn_34_0;
                    }
                    break L3;
                  }
                }
                L11: {
                  ((fh) this).field_v = null;
                  if (null != ((fh) this).field_g) {
                    ((fh) this).field_w = new byte[((fh) this).field_s.field_s];
                    break L11;
                  } else {
                    break L11;
                  }
                }
                stackOut_61_0 = ((fh) this).field_s;
                stackIn_62_0 = stackOut_61_0;
                break L0;
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (pc) (Object) stackIn_15_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "fh.H(" + param0 + ')');
        }
        return stackIn_62_0;
    }

    final int a(boolean param0, int param1) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            var3 = (ml) (Object) ((fh) this).field_n.a(1, (long)param1);
            if (null != var3) {
              stackOut_3_0 = var3.c(false);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  ((fh) this).field_d = -2;
                  break L1;
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3_ref, "fh.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    fh(int param0, sg param1, sg param2, na param3, cd param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((fh) this).field_n = new ab(16);
        ((fh) this).field_o = 0;
        ((fh) this).field_u = new oi();
        ((fh) this).field_h = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((fh) this).field_d = param0;
                ((fh) this).field_g = param1;
                if (null != ((fh) this).field_g) {
                  break L2;
                } else {
                  ((fh) this).field_r = false;
                  if (wizardrun.field_H == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((fh) this).field_r = true;
              ((fh) this).field_p = new oi();
              break L1;
            }
            L3: {
              ((fh) this).field_e = param8;
              ((fh) this).field_x = param6;
              ((fh) this).field_k = param7;
              ((fh) this).field_m = param2;
              ((fh) this).field_q = param4;
              ((fh) this).field_i = param3;
              ((fh) this).field_l = param5;
              if (null == ((fh) this).field_m) {
                break L3;
              } else {
                ((fh) this).field_v = (ml) (Object) ((fh) this).field_q.a(((fh) this).field_d, 1, ((fh) this).field_m);
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
            stackOut_9_1 = new StringBuilder().append("fh.<init>(").append(param0).append(',');
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
          throw bd.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new oi();
    }
}
