/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends hf {
    private wb field_i;
    private int field_p;
    private byte[] field_w;
    private byte[] field_g;
    static String[] field_r;
    private int field_n;
    static double field_u;
    private e field_z;
    private int field_j;
    static dg field_q;
    private dl field_B;
    private kl field_C;
    private si field_t;
    static eg field_A;
    private dl field_f;
    private na field_k;
    static java.awt.Canvas field_y;
    private ng field_l;
    private int field_o;
    static int field_m;
    private boolean field_D;
    private boolean field_d;
    static String field_s;
    static long field_x;
    private ng field_v;
    private boolean field_e;
    private long field_h;

    final void b(int param0) {
        RuntimeException var2 = null;
        kd var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (null == ((ug) this).field_v) {
              return;
            } else {
              if (((ug) this).a(false) == null) {
                return;
              } else {
                L1: {
                  if (param0 <= -68) {
                    break L1;
                  } else {
                    e discarded$3 = ((ug) this).a(true);
                    break L1;
                  }
                }
                var2_ref = ((ug) this).field_l.a(true);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (null == var2_ref) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_d;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (var3 >= ((ug) this).field_z.field_d) {
                                    break L7;
                                  } else {
                                    if (((ug) this).field_z.field_m[var3] != 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var2_ref.b((byte) -122);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (((ug) this).field_w[var3] == 0) {
                                si discarded$4 = this.a((byte) -128, 1, var3);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              if (((ug) this).field_w[var3] != -1) {
                                break L9;
                              } else {
                                si discarded$5 = this.a((byte) -91, 2, var3);
                                break L9;
                              }
                            }
                            if (1 != ((ug) this).field_w[var3]) {
                              break L5;
                            } else {
                              var2_ref.b((byte) -118);
                              break L5;
                            }
                          }
                          var2_ref = ((ug) this).field_l.f(2);
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
          throw ld.a((Throwable) (Object) var2, "ug.F(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        si var2_ref = null;
        kd var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_91_0 = 0;
        boolean stackIn_101_0 = false;
        boolean stackIn_120_0 = false;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        int stackOut_90_0 = 0;
        boolean stackOut_100_0 = false;
        boolean stackOut_119_0 = false;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ((ug) this).field_v) {
                break L1;
              } else {
                if (null != ((ug) this).a(false)) {
                  L2: {
                    if (((ug) this).field_D) {
                      break L2;
                    } else {
                      L3: {
                        if (((ug) this).field_d) {
                          break L3;
                        } else {
                          ((ug) this).field_v = null;
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var2_int = 1;
                      var3 = ((ug) this).field_v.a(true);
                      L4: while (true) {
                        L5: {
                          L6: {
                            L7: {
                              if (null == var3) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_d;
                                stackOut_13_0 = ((ug) this).field_w[var4];
                                stackOut_13_1 = 1;
                                stackIn_25_0 = stackOut_13_0;
                                stackIn_25_1 = stackOut_13_1;
                                stackIn_14_0 = stackOut_13_0;
                                stackIn_14_1 = stackOut_13_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_25_0 <= stackIn_25_1) {
                                      break L6;
                                    } else {
                                      stackOut_26_0 = 0;
                                      stackIn_49_0 = stackOut_26_0;
                                      stackIn_27_0 = stackOut_26_0;
                                      if (var5 != 0) {
                                        break L5;
                                      } else {
                                        stackOut_27_0 = stackIn_27_0;
                                        stackIn_29_0 = stackOut_27_0;
                                        L9: {
                                          L10: {
                                            if (stackIn_29_0 != ((ug) this).field_z.field_m[((ug) this).field_o]) {
                                              break L10;
                                            } else {
                                              ((ug) this).field_o = ((ug) this).field_o + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (((ug) this).field_i.a(9172)) {
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
                                            if (((ug) this).field_w[((ug) this).field_o] != 1) {
                                              si discarded$5 = this.a((byte) -25, 2, ((ug) this).field_o);
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (((ug) this).field_w[((ug) this).field_o] == 1) {
                                              break L13;
                                            } else {
                                              var3 = new kd();
                                              var3.field_d = (long)((ug) this).field_o;
                                              ((ug) this).field_v.b(105, var3);
                                              var2_int = 0;
                                              break L13;
                                            }
                                          }
                                          ((ug) this).field_o = ((ug) this).field_o + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_24_0 = ((ug) this).field_z.field_m.length;
                                        stackOut_24_1 = ((ug) this).field_o;
                                        stackIn_25_0 = stackOut_24_0;
                                        stackIn_25_1 = stackOut_24_1;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_14_0 != stackIn_14_1) {
                                      si discarded$6 = this.a((byte) -56, 2, var4);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (((ug) this).field_w[var4] == 1) {
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
                                    var3.b((byte) -128);
                                    break L15;
                                  }
                                  var3 = ((ug) this).field_v.f(2);
                                  if (var5 == 0) {
                                    continue L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_24_0 = ((ug) this).field_z.field_m.length;
                              stackOut_24_1 = ((ug) this).field_o;
                              stackIn_25_0 = stackOut_24_0;
                              stackIn_25_1 = stackOut_24_1;
                              if (stackIn_25_0 <= stackIn_25_1) {
                                break L6;
                              } else {
                                stackOut_26_0 = 0;
                                stackIn_49_0 = stackOut_26_0;
                                stackIn_27_0 = stackOut_26_0;
                                if (var5 != 0) {
                                  break L5;
                                } else {
                                  stackOut_27_0 = stackIn_27_0;
                                  stackIn_29_0 = stackOut_27_0;
                                  L18: {
                                    if (stackIn_29_0 != ((ug) this).field_z.field_m[((ug) this).field_o]) {
                                      break L18;
                                    } else {
                                      ((ug) this).field_o = ((ug) this).field_o + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L19: {
                                    if (((ug) this).field_i.a(9172)) {
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
                                    if (((ug) this).field_w[((ug) this).field_o] != 1) {
                                      si discarded$5 = this.a((byte) -25, 2, ((ug) this).field_o);
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (((ug) this).field_w[((ug) this).field_o] == 1) {
                                      break L21;
                                    } else {
                                      var3 = new kd();
                                      var3.field_d = (long)((ug) this).field_o;
                                      ((ug) this).field_v.b(105, var3);
                                      var2_int = 0;
                                      break L21;
                                    }
                                  }
                                  ((ug) this).field_o = ((ug) this).field_o + 1;
                                  if (var5 == 0) {
                                    continue L17;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_48_0 = var2_int;
                          stackIn_49_0 = stackOut_48_0;
                          break L5;
                        }
                        L22: {
                          if (stackIn_49_0 == 0) {
                            break L22;
                          } else {
                            ((ug) this).field_o = 0;
                            ((ug) this).field_d = false;
                            break L22;
                          }
                        }
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var2_int = 1;
                  var3 = ((ug) this).field_v.a(true);
                  L23: while (true) {
                    L24: {
                      L25: {
                        L26: {
                          if (null == var3) {
                            break L26;
                          } else {
                            var4 = (int)var3.field_d;
                            stackOut_55_0 = ~((ug) this).field_w[var4];
                            stackOut_55_1 = -1;
                            stackIn_68_0 = stackOut_55_0;
                            stackIn_68_1 = stackOut_55_1;
                            stackIn_56_0 = stackOut_55_0;
                            stackIn_56_1 = stackOut_55_1;
                            if (var5 != 0) {
                              L27: while (true) {
                                if (stackIn_68_0 <= stackIn_68_1) {
                                  break L25;
                                } else {
                                  stackOut_69_0 = -1;
                                  stackIn_91_0 = stackOut_69_0;
                                  stackIn_70_0 = stackOut_69_0;
                                  if (var5 != 0) {
                                    break L24;
                                  } else {
                                    stackOut_70_0 = stackIn_70_0;
                                    stackIn_72_0 = stackOut_70_0;
                                    L28: {
                                      L29: {
                                        if (stackIn_72_0 != ~((ug) this).field_z.field_m[((ug) this).field_o]) {
                                          break L29;
                                        } else {
                                          ((ug) this).field_o = ((ug) this).field_o + 1;
                                          if (var5 == 0) {
                                            break L28;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      L30: {
                                        if (((ug) this).field_C.field_c >= 250) {
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
                                        if (((ug) this).field_w[((ug) this).field_o] != 0) {
                                          break L31;
                                        } else {
                                          si discarded$7 = this.a((byte) -88, 1, ((ug) this).field_o);
                                          break L31;
                                        }
                                      }
                                      L32: {
                                        if (((ug) this).field_w[((ug) this).field_o] != 0) {
                                          break L32;
                                        } else {
                                          var3 = new kd();
                                          var3.field_d = (long)((ug) this).field_o;
                                          var2_int = 0;
                                          ((ug) this).field_v.b(123, var3);
                                          break L32;
                                        }
                                      }
                                      ((ug) this).field_o = ((ug) this).field_o + 1;
                                      if (var5 == 0) {
                                        break L28;
                                      } else {
                                        break L25;
                                      }
                                    }
                                    stackOut_67_0 = ~((ug) this).field_o;
                                    stackOut_67_1 = ~((ug) this).field_z.field_m.length;
                                    stackIn_68_0 = stackOut_67_0;
                                    stackIn_68_1 = stackOut_67_1;
                                    continue L27;
                                  }
                                }
                              }
                            } else {
                              L33: {
                                if (stackIn_56_0 == stackIn_56_1) {
                                  si discarded$8 = this.a((byte) -93, 1, var4);
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                              L34: {
                                L35: {
                                  if (((ug) this).field_w[var4] == 0) {
                                    break L35;
                                  } else {
                                    var3.b((byte) -116);
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
                              var3 = ((ug) this).field_v.f(2);
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                        L36: while (true) {
                          stackOut_67_0 = ~((ug) this).field_o;
                          stackOut_67_1 = ~((ug) this).field_z.field_m.length;
                          stackIn_68_0 = stackOut_67_0;
                          stackIn_68_1 = stackOut_67_1;
                          if (stackIn_68_0 <= stackIn_68_1) {
                            break L25;
                          } else {
                            stackOut_69_0 = -1;
                            stackIn_91_0 = stackOut_69_0;
                            stackIn_70_0 = stackOut_69_0;
                            if (var5 != 0) {
                              break L24;
                            } else {
                              stackOut_70_0 = stackIn_70_0;
                              stackIn_72_0 = stackOut_70_0;
                              L37: {
                                if (stackIn_72_0 != ~((ug) this).field_z.field_m[((ug) this).field_o]) {
                                  break L37;
                                } else {
                                  ((ug) this).field_o = ((ug) this).field_o + 1;
                                  if (var5 == 0) {
                                    continue L36;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              L38: {
                                if (((ug) this).field_C.field_c >= 250) {
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
                                if (((ug) this).field_w[((ug) this).field_o] != 0) {
                                  break L39;
                                } else {
                                  si discarded$7 = this.a((byte) -88, 1, ((ug) this).field_o);
                                  break L39;
                                }
                              }
                              L40: {
                                if (((ug) this).field_w[((ug) this).field_o] != 0) {
                                  break L40;
                                } else {
                                  var3 = new kd();
                                  var3.field_d = (long)((ug) this).field_o;
                                  var2_int = 0;
                                  ((ug) this).field_v.b(123, var3);
                                  break L40;
                                }
                              }
                              ((ug) this).field_o = ((ug) this).field_o + 1;
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
                    if (stackIn_91_0 != 0) {
                      ((ug) this).field_o = 0;
                      ((ug) this).field_D = false;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            L41: {
              L42: {
                if (!((ug) this).field_e) {
                  break L42;
                } else {
                  if (((ug) this).field_h > rf.c(0)) {
                    break L42;
                  } else {
                    var2_ref = (si) (Object) ((ug) this).field_k.c((byte) -120);
                    L43: while (true) {
                      L44: {
                        if (var2_ref == null) {
                          break L44;
                        } else {
                          stackOut_100_0 = var2_ref.field_v;
                          stackIn_120_0 = stackOut_100_0;
                          stackIn_101_0 = stackOut_100_0;
                          if (var5 != 0) {
                            break L41;
                          } else {
                            L45: {
                              if (stackIn_101_0) {
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
                                if (!var2_ref.field_p) {
                                  throw new RuntimeException();
                                } else {
                                  var2_ref.b((byte) -122);
                                  break L45;
                                }
                              }
                            }
                            var2_ref = (si) (Object) ((ug) this).field_k.a((byte) -91);
                            if (var5 == 0) {
                              continue L43;
                            } else {
                              break L44;
                            }
                          }
                        }
                      }
                      ((ug) this).field_h = 1000L + rf.c(0);
                      break L42;
                    }
                  }
                }
              }
              stackOut_119_0 = param0;
              stackIn_120_0 = stackOut_119_0;
              break L41;
            }
            L47: {
              if (!stackIn_120_0) {
                break L47;
              } else {
                int discarded$9 = ((ug) this).a(15, 40);
                break L47;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "ug.J(" + param0 + ')');
        }
    }

    final int a(int param0, int param1) {
        si var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            var3 = (si) (Object) ((ug) this).field_k.a((long)param0, (byte) 96);
            if (null != var3) {
              stackOut_3_0 = var3.c((byte) 16);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param1 == 1215) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = -35;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var3_ref, "ug.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == ((ug) this).field_B) {
              return;
            } else {
              L1: {
                if (param0 == 11002) {
                  break L1;
                } else {
                  ((ug) this).field_v = null;
                  break L1;
                }
              }
              L2: {
                ((ug) this).field_d = true;
                if (((ug) this).field_v == null) {
                  ((ug) this).field_v = new ng();
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
          throw ld.a((Throwable) (Object) var2, "ug.K(" + param0 + ')');
        }
    }

    final e a(boolean param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        e stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_48_0 = null;
        e stackIn_56_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_14_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_47_0 = null;
        e stackOut_55_0 = null;
        e stackOut_2_0 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (((ug) this).field_z == null) {
              L1: {
                if (null != ((ug) this).field_t) {
                  break L1;
                } else {
                  if (!((ug) this).field_i.e(20)) {
                    ((ug) this).field_t = (si) (Object) ((ug) this).field_i.a(5, 255, ((ug) this).field_j, (byte) 0, true);
                    break L1;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (e) (Object) stackIn_9_0;
                  }
                }
              }
              if (((ug) this).field_t.field_v) {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (e) (Object) stackIn_15_0;
              } else {
                L2: {
                  L3: {
                    var2_array = ((ug) this).field_t.d((byte) -125);
                    if (((ug) this).field_t instanceof fj) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          if (null != var2_array) {
                            ((ug) this).field_z = new e(var2_array, ((ug) this).field_p, ((ug) this).field_g);
                            break L4;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          L6: {
                            var3 = decompiledCaughtException;
                            ((ug) this).field_i.c(-28488);
                            ((ug) this).field_z = null;
                            if (((ug) this).field_i.e(20)) {
                              break L6;
                            } else {
                              ((ug) this).field_t = (si) (Object) ((ug) this).field_i.a(5, 255, ((ug) this).field_j, (byte) 0, true);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          ((ug) this).field_t = null;
                          break L5;
                        }
                        stackOut_28_0 = null;
                        stackIn_29_0 = stackOut_28_0;
                        return (e) (Object) stackIn_29_0;
                      }
                      if (null != ((ug) this).field_f) {
                        fj discarded$1 = ((ug) this).field_C.a(var2_array, ((ug) this).field_j, 1, ((ug) this).field_f);
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  try {
                    L7: {
                      if (null != var2_array) {
                        ((ug) this).field_z = new e(var2_array, ((ug) this).field_p, ((ug) this).field_g);
                        if (((ug) this).field_z.field_s == ((ug) this).field_n) {
                          break L7;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L8: {
                      L9: {
                        var3 = decompiledCaughtException;
                        ((ug) this).field_z = null;
                        if (((ug) this).field_i.e(20)) {
                          break L9;
                        } else {
                          ((ug) this).field_t = (si) (Object) ((ug) this).field_i.a(5, 255, ((ug) this).field_j, (byte) 0, true);
                          if (var4 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      ((ug) this).field_t = null;
                      break L8;
                    }
                    stackOut_47_0 = null;
                    stackIn_48_0 = stackOut_47_0;
                    return (e) (Object) stackIn_48_0;
                  }
                  break L2;
                }
                L10: {
                  if (null == ((ug) this).field_B) {
                    break L10;
                  } else {
                    ((ug) this).field_w = new byte[((ug) this).field_z.field_d];
                    break L10;
                  }
                }
                L11: {
                  if (!param0) {
                    break L11;
                  } else {
                    field_m = 43;
                    break L11;
                  }
                }
                ((ug) this).field_t = null;
                stackOut_55_0 = ((ug) this).field_z;
                stackIn_56_0 = stackOut_55_0;
                break L0;
              }
            } else {
              stackOut_2_0 = ((ug) this).field_z;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "ug.E(" + param0 + ')');
        }
        return stackIn_56_0;
    }

    final static void a(byte param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 121) {
                break L1;
              } else {
                field_s = null;
                break L1;
              }
            }
            var1 = bd.field_l;
            var2 = 0;
            var3 = var1.length;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var2 <= ~var3) {
                    break L4;
                  } else {
                    int incrementValue$16 = var2;
                    var2++;
                    var1[incrementValue$16] = 0;
                    int incrementValue$17 = var2;
                    var2++;
                    var1[incrementValue$17] = 0;
                    int incrementValue$18 = var2;
                    var2++;
                    var1[incrementValue$18] = 0;
                    int incrementValue$19 = var2;
                    var2++;
                    var1[incrementValue$19] = 0;
                    int incrementValue$20 = var2;
                    var2++;
                    var1[incrementValue$20] = 0;
                    int incrementValue$21 = var2;
                    var2++;
                    var1[incrementValue$21] = 0;
                    int incrementValue$22 = var2;
                    var2++;
                    var1[incrementValue$22] = 0;
                    int incrementValue$23 = var2;
                    var2++;
                    var1[incrementValue$23] = 0;
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
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1_ref, "ug.L(" + param0 + ')');
        }
    }

    final static wj a(sh param0, int param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        wj stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        wj stackOut_8_0 = null;
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
            L1: {
              if (param2) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            var3 = param0.a(param1, -117);
            if (null == var3) {
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (wj) (Object) stackIn_7_0;
            } else {
              stackOut_8_0 = new wj(var3);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("ug.H(");
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
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final byte[] a(int param0, boolean param1) {
        si var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var3 = this.a((byte) -3, 0, param0);
            if (var3 != null) {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  ((ug) this).field_e = true;
                  break L1;
                }
              }
              var4 = var3.d((byte) -106);
              var3.b((byte) -116);
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
          throw ld.a((Throwable) (Object) var3_ref, "ug.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    private final si a(byte param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        byte[] var7 = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_40_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_61_0 = null;
        byte stackIn_83_0 = 0;
        byte stackIn_83_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        Object stackIn_103_0 = null;
        Object stackIn_110_0 = null;
        byte stackIn_128_0 = 0;
        byte stackIn_128_1 = 0;
        Object stackIn_144_0 = null;
        int stackIn_149_0 = 0;
        int stackIn_149_1 = 0;
        Object stackIn_157_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_51_0 = null;
        Object stackOut_39_0 = null;
        byte stackOut_127_0 = 0;
        byte stackOut_127_1 = 0;
        Object stackOut_143_0 = null;
        int stackOut_148_0 = 0;
        int stackOut_148_1 = 0;
        Object stackOut_156_0 = null;
        byte stackOut_82_0 = 0;
        byte stackOut_82_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        Object stackOut_102_0 = null;
        Object stackOut_109_0 = null;
        Object stackOut_60_0 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = (Object) (Object) (si) (Object) ((ug) this).field_k.a((long)param2, (byte) 107);
              if (var4 == null) {
                break L1;
              } else {
                if (0 != param1) {
                  break L1;
                } else {
                  if (((si) var4).field_p) {
                    break L1;
                  } else {
                    if (!((si) var4).field_v) {
                      break L1;
                    } else {
                      ((si) var4).b((byte) -116);
                      var4 = null;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (var4 != null) {
                break L2;
              } else {
                L3: {
                  if (param1 == 0) {
                    L4: {
                      L5: {
                        if (null == ((ug) this).field_B) {
                          break L5;
                        } else {
                          if (((ug) this).field_w[param2] != -1) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (!((ug) this).field_i.e(20)) {
                        var4 = (Object) (Object) ((ug) this).field_i.a(5, ((ug) this).field_j, param2, (byte) 2, true);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        stackOut_51_0 = null;
                        stackIn_52_0 = stackOut_51_0;
                        return (si) (Object) stackIn_52_0;
                      }
                    }
                    var4 = (Object) (Object) ((ug) this).field_C.a(((ug) this).field_B, (byte) -6, param2);
                    break L3;
                  } else {
                    L6: {
                      if (param1 != 1) {
                        break L6;
                      } else {
                        if (null == ((ug) this).field_B) {
                          throw new RuntimeException();
                        } else {
                          var4 = (Object) (Object) ((ug) this).field_C.a(param2, ((ug) this).field_B, 3);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      if (param1 != 2) {
                        break L7;
                      } else {
                        if (((ug) this).field_B == null) {
                          throw new RuntimeException();
                        } else {
                          if (-1 == ((ug) this).field_w[param2]) {
                            if (!((ug) this).field_i.a(9172)) {
                              var4 = (Object) (Object) ((ug) this).field_i.a(5, ((ug) this).field_j, param2, (byte) 2, false);
                              if (var10 == 0) {
                                break L3;
                              } else {
                                break L7;
                              }
                            } else {
                              stackOut_39_0 = null;
                              stackIn_40_0 = stackOut_39_0;
                              return (si) (Object) stackIn_40_0;
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                }
                ((ug) this).field_k.a((kd) var4, (byte) -114, (long)param2);
                break L2;
              }
            }
            L8: {
              if (param0 < 0) {
                break L8;
              } else {
                ug.a((byte) -68);
                break L8;
              }
            }
            if (!((si) var4).field_v) {
              var5 = ((si) var4).d((byte) 123);
              if (!(var4 instanceof fj)) {
                try {
                  L9: {
                    L10: {
                      if (null == var5) {
                        break L10;
                      } else {
                        if (var5.length <= 2) {
                          break L10;
                        } else {
                          uh.field_v.reset();
                          uh.field_v.update(var5, 0, -2 + var5.length);
                          var6_int = (int)uh.field_v.getValue();
                          if (var6_int == ((ug) this).field_z.field_r[param2]) {
                            L11: {
                              if (null == ((ug) this).field_z.field_o) {
                                break L11;
                              } else {
                                if (null == ((ug) this).field_z.field_o[param2]) {
                                  break L11;
                                } else {
                                  var7 = ((ug) this).field_z.field_o[param2];
                                  var8 = si.a(0, var5, -121, var5.length - 2);
                                  var9 = 0;
                                  L12: while (true) {
                                    if (var9 >= 64) {
                                      break L11;
                                    } else {
                                      stackOut_127_0 = var8[var9];
                                      stackOut_127_1 = var7[var9];
                                      stackIn_149_0 = stackOut_127_0;
                                      stackIn_149_1 = stackOut_127_1;
                                      stackIn_128_0 = stackOut_127_0;
                                      stackIn_128_1 = stackOut_127_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L9;
                                      } else {
                                        if (stackIn_128_0 == stackIn_128_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L12;
                                          } else {
                                            break L11;
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
                            ((ug) this).field_i.field_p = 0;
                            ((ug) this).field_i.field_j = 0;
                            decompiledRegionSelector0 = 1;
                            break L9;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L13: {
                    var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                    ((ug) this).field_i.c(-28488);
                    ((si) var4).b((byte) -121);
                    if (!((si) var4).field_p) {
                      break L13;
                    } else {
                      if (!((ug) this).field_i.e(20)) {
                        var4 = (Object) (Object) ((ug) this).field_i.a(5, ((ug) this).field_j, param2, (byte) 2, true);
                        ((ug) this).field_k.a((kd) var4, (byte) -75, (long)param2);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  stackOut_143_0 = null;
                  stackIn_144_0 = stackOut_143_0;
                  return (si) (Object) stackIn_144_0;
                }
                L14: {
                  L15: {
                    if (decompiledRegionSelector0 == 0) {
                      break L15;
                    } else {
                      var5[-2 + var5.length] = (byte)(((ug) this).field_z.field_t[param2] >>> -1305027192);
                      var5[var5.length + -1] = (byte)((ug) this).field_z.field_t[param2];
                      if (((ug) this).field_B != null) {
                        fj discarded$1 = ((ug) this).field_C.a(var5, param2, 1, ((ug) this).field_B);
                        stackOut_148_0 = ~((ug) this).field_w[param2];
                        stackOut_148_1 = -2;
                        stackIn_149_0 = stackOut_148_0;
                        stackIn_149_1 = stackOut_148_1;
                        break L15;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (stackIn_149_0 != stackIn_149_1) {
                    ((ug) this).field_w[param2] = (byte) 1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L16: {
                  if (!((si) var4).field_p) {
                    ((si) var4).b((byte) -128);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                stackOut_156_0 = var4;
                stackIn_157_0 = stackOut_156_0;
                break L0;
              } else {
                try {
                  L17: {
                    L18: {
                      if (var5 == null) {
                        break L18;
                      } else {
                        if (var5.length <= 2) {
                          break L18;
                        } else {
                          uh.field_v.reset();
                          uh.field_v.update(var5, 0, var5.length + -2);
                          var6_int = (int)uh.field_v.getValue();
                          if (~var6_int != ~((ug) this).field_z.field_r[param2]) {
                            throw new RuntimeException();
                          } else {
                            L19: {
                              L20: {
                                if (((ug) this).field_z.field_o == null) {
                                  break L20;
                                } else {
                                  if (null != ((ug) this).field_z.field_o[param2]) {
                                    var7 = ((ug) this).field_z.field_o[param2];
                                    var8 = si.a(0, var5, -99, var5.length - 2);
                                    var9 = 0;
                                    L21: while (true) {
                                      if (64 <= var9) {
                                        break L20;
                                      } else {
                                        stackOut_82_0 = var7[var9];
                                        stackOut_82_1 = var8[var9];
                                        stackIn_90_0 = stackOut_82_0;
                                        stackIn_90_1 = stackOut_82_1;
                                        stackIn_83_0 = stackOut_82_0;
                                        stackIn_83_1 = stackOut_82_1;
                                        if (var10 != 0) {
                                          break L19;
                                        } else {
                                          if (stackIn_83_0 == stackIn_83_1) {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L21;
                                            } else {
                                              break L20;
                                            }
                                          } else {
                                            throw new RuntimeException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              stackOut_89_0 = (var5[var5.length - 2] & 255) << -966605144;
                              stackOut_89_1 = 255 & var5[-1 + var5.length];
                              stackIn_90_0 = stackOut_89_0;
                              stackIn_90_1 = stackOut_89_1;
                              break L19;
                            }
                            var7_int = stackIn_90_0 + stackIn_90_1;
                            if (~var7_int != ~(((ug) this).field_z.field_t[param2] & 65535)) {
                              throw new RuntimeException();
                            } else {
                              L22: {
                                if (1 != ((ug) this).field_w[param2]) {
                                  L23: {
                                    if (((ug) this).field_w[param2] == 0) {
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  ((ug) this).field_w[param2] = (byte) 1;
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              L24: {
                                if (((si) var4).field_p) {
                                  break L24;
                                } else {
                                  ((si) var4).b((byte) -128);
                                  break L24;
                                }
                              }
                              stackOut_102_0 = var4;
                              stackIn_103_0 = stackOut_102_0;
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L25: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    ((ug) this).field_w[param2] = (byte) -1;
                    ((si) var4).b((byte) -117);
                    if (!((si) var4).field_p) {
                      break L25;
                    } else {
                      if (((ug) this).field_i.e(20)) {
                        break L25;
                      } else {
                        var4 = (Object) (Object) ((ug) this).field_i.a(5, ((ug) this).field_j, param2, (byte) 2, true);
                        ((ug) this).field_k.a((kd) var4, (byte) -92, (long)param2);
                        break L25;
                      }
                    }
                  }
                  stackOut_109_0 = null;
                  stackIn_110_0 = stackOut_109_0;
                  return (si) (Object) stackIn_110_0;
                }
                return (si) (Object) stackIn_103_0;
              }
            } else {
              stackOut_60_0 = null;
              stackIn_61_0 = stackOut_60_0;
              return (si) (Object) stackIn_61_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw ld.a((Throwable) var4, "ug.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (si) (Object) stackIn_157_0;
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_s = null;
              field_r = null;
              field_A = null;
              field_y = null;
              if (param0 == 64) {
                break L1;
              } else {
                field_y = null;
                break L1;
              }
            }
            field_q = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "ug.I(" + param0 + ')');
        }
    }

    ug(int param0, dl param1, dl param2, wb param3, kl param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((ug) this).field_k = new na(16);
        ((ug) this).field_o = 0;
        ((ug) this).field_l = new ng();
        ((ug) this).field_h = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((ug) this).field_j = param0;
                ((ug) this).field_B = param1;
                if (((ug) this).field_B == null) {
                  break L2;
                } else {
                  ((ug) this).field_D = true;
                  ((ug) this).field_v = new ng();
                  if (!Lexicominos.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ug) this).field_D = false;
              break L1;
            }
            L3: {
              ((ug) this).field_i = param3;
              ((ug) this).field_n = param7;
              ((ug) this).field_f = param2;
              ((ug) this).field_g = param6;
              ((ug) this).field_p = param5;
              ((ug) this).field_e = param8;
              ((ug) this).field_C = param4;
              if (null == ((ug) this).field_f) {
                break L3;
              } else {
                ((ug) this).field_t = (si) (Object) ((ug) this).field_C.a(((ug) this).field_f, (byte) -6, ((ug) this).field_j);
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
            stackOut_9_1 = new StringBuilder().append("ug.<init>(").append(param0).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[16];
        field_u = 0.0;
        field_q = new dg();
        field_m = 0;
        field_s = "en-gb";
    }
}
