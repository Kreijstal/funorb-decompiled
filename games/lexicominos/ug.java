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
        kd var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (null == ((ug) this).field_v) {
          return;
        } else {
          if (((ug) this).a(false) == null) {
            return;
          } else {
            L0: {
              if (param0 <= -68) {
                break L0;
              } else {
                e discarded$6 = ((ug) this).a(true);
                break L0;
              }
            }
            var2 = ((ug) this).field_l.a(true);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  var3 = (int)var2.field_d;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 < 0) {
                            break L5;
                          } else {
                            if (var3 >= ((ug) this).field_z.field_d) {
                              break L5;
                            } else {
                              if (((ug) this).field_z.field_m[var3] != 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var2.b((byte) -122);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (((ug) this).field_w[var3] == 0) {
                          si discarded$7 = this.a((byte) -128, 1, var3);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (((ug) this).field_w[var3] != -1) {
                          break L7;
                        } else {
                          si discarded$8 = this.a((byte) -91, 2, var3);
                          break L7;
                        }
                      }
                      if (1 != ((ug) this).field_w[var3]) {
                        break L3;
                      } else {
                        var2.b((byte) -118);
                        break L3;
                      }
                    }
                    var2 = ((ug) this).field_l.f(2);
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final void b(boolean param0) {
        si var2 = null;
        int var2_int = 0;
        kd var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_64_0 = 0;
        boolean stackIn_72_0 = false;
        boolean stackIn_83_0 = false;
        int stackIn_102_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        byte stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        int stackOut_128_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_63_0 = 0;
        boolean stackOut_71_0 = false;
        boolean stackOut_82_0 = false;
        L0: {
          var5 = Lexicominos.field_L ? 1 : 0;
          if (null == ((ug) this).field_v) {
            break L0;
          } else {
            if (null != ((ug) this).a(false)) {
              L1: {
                if (((ug) this).field_D) {
                  break L1;
                } else {
                  L2: {
                    if (((ug) this).field_d) {
                      break L2;
                    } else {
                      ((ug) this).field_v = null;
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int = 1;
                  var3 = ((ug) this).field_v.a(true);
                  L3: while (true) {
                    L4: {
                      L5: {
                        L6: {
                          if (var3 == null) {
                            break L6;
                          } else {
                            var4 = (int)var3.field_d;
                            stackOut_9_0 = ((ug) this).field_w[var4];
                            stackOut_9_1 = 1;
                            stackIn_19_0 = stackOut_9_0;
                            stackIn_19_1 = stackOut_9_1;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            if (var5 != 0) {
                              L7: while (true) {
                                if (stackIn_19_0 <= stackIn_19_1) {
                                  break L5;
                                } else {
                                  stackOut_20_0 = 0;
                                  stackIn_34_0 = stackOut_20_0;
                                  stackIn_21_0 = stackOut_20_0;
                                  if (var5 != 0) {
                                    break L4;
                                  } else {
                                    L8: {
                                      L9: {
                                        if (stackIn_21_0 != ((ug) this).field_z.field_m[((ug) this).field_o]) {
                                          break L9;
                                        } else {
                                          ((ug) this).field_o = ((ug) this).field_o + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (((ug) this).field_i.a(9172)) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L5;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (((ug) this).field_w[((ug) this).field_o] != 1) {
                                          si discarded$7 = this.a((byte) -25, 2, ((ug) this).field_o);
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (((ug) this).field_w[((ug) this).field_o] == 1) {
                                          break L12;
                                        } else {
                                          var3 = new kd();
                                          var3.field_d = (long)((ug) this).field_o;
                                          ((ug) this).field_v.b(105, var3);
                                          var2_int = 0;
                                          break L12;
                                        }
                                      }
                                      ((ug) this).field_o = ((ug) this).field_o + 1;
                                      if (var5 == 0) {
                                        break L8;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    stackOut_18_0 = ((ug) this).field_z.field_m.length;
                                    stackOut_18_1 = ((ug) this).field_o;
                                    stackIn_19_0 = stackOut_18_0;
                                    stackIn_19_1 = stackOut_18_1;
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              L13: {
                                if (stackIn_10_0 != stackIn_10_1) {
                                  si discarded$8 = this.a((byte) -56, 2, var4);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              L14: {
                                L15: {
                                  if (((ug) this).field_w[var4] == 1) {
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
                                var3.b((byte) -128);
                                break L14;
                              }
                              var3 = ((ug) this).field_v.f(2);
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L16: while (true) {
                          stackOut_132_0 = ((ug) this).field_z.field_m.length;
                          stackOut_132_1 = ((ug) this).field_o;
                          stackIn_130_0 = stackOut_132_0;
                          stackIn_130_1 = stackOut_132_1;
                          if (stackIn_130_0 <= stackIn_130_1) {
                            break L5;
                          } else {
                            stackOut_128_0 = 0;
                            stackIn_34_0 = stackOut_128_0;
                            stackIn_129_0 = stackOut_128_0;
                            if (var5 != 0) {
                              break L4;
                            } else {
                              stackOut_129_0 = stackIn_129_0;
                              stackIn_126_0 = stackOut_129_0;
                              L17: {
                                if (stackIn_126_0 != ((ug) this).field_z.field_m[((ug) this).field_o]) {
                                  break L17;
                                } else {
                                  ((ug) this).field_o = ((ug) this).field_o + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              L18: {
                                if (((ug) this).field_i.a(9172)) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                if (((ug) this).field_w[((ug) this).field_o] != 1) {
                                  si discarded$9 = this.a((byte) -25, 2, ((ug) this).field_o);
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              L20: {
                                if (((ug) this).field_w[((ug) this).field_o] == 1) {
                                  break L20;
                                } else {
                                  var3 = new kd();
                                  var3.field_d = (long)((ug) this).field_o;
                                  ((ug) this).field_v.b(105, var3);
                                  var2_int = 0;
                                  break L20;
                                }
                              }
                              ((ug) this).field_o = ((ug) this).field_o + 1;
                              if (var5 == 0) {
                                continue L16;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      stackOut_33_0 = var2_int;
                      stackIn_34_0 = stackOut_33_0;
                      break L4;
                    }
                    L21: {
                      if (stackIn_34_0 == 0) {
                        break L21;
                      } else {
                        ((ug) this).field_o = 0;
                        ((ug) this).field_d = false;
                        break L21;
                      }
                    }
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var2_int = 1;
              var3 = ((ug) this).field_v.a(true);
              L22: while (true) {
                L23: {
                  L24: {
                    L25: {
                      if (var3 == null) {
                        break L25;
                      } else {
                        var4 = (int)var3.field_d;
                        stackOut_39_0 = ~((ug) this).field_w[var4];
                        stackOut_39_1 = -1;
                        stackIn_50_0 = stackOut_39_0;
                        stackIn_50_1 = stackOut_39_1;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        if (var5 != 0) {
                          L26: while (true) {
                            if (stackIn_50_0 <= stackIn_50_1) {
                              break L24;
                            } else {
                              stackOut_51_0 = -1;
                              stackIn_64_0 = stackOut_51_0;
                              stackIn_52_0 = stackOut_51_0;
                              if (var5 != 0) {
                                break L23;
                              } else {
                                L27: {
                                  L28: {
                                    if (stackIn_52_0 != ~((ug) this).field_z.field_m[((ug) this).field_o]) {
                                      break L28;
                                    } else {
                                      ((ug) this).field_o = ((ug) this).field_o + 1;
                                      if (var5 == 0) {
                                        break L27;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  L29: {
                                    if (((ug) this).field_C.field_c >= 250) {
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
                                    if (((ug) this).field_w[((ug) this).field_o] != 0) {
                                      break L30;
                                    } else {
                                      si discarded$10 = this.a((byte) -88, 1, ((ug) this).field_o);
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    if (((ug) this).field_w[((ug) this).field_o] != 0) {
                                      break L31;
                                    } else {
                                      var3 = new kd();
                                      var3.field_d = (long)((ug) this).field_o;
                                      var2_int = 0;
                                      ((ug) this).field_v.b(123, var3);
                                      break L31;
                                    }
                                  }
                                  ((ug) this).field_o = ((ug) this).field_o + 1;
                                  if (var5 == 0) {
                                    break L27;
                                  } else {
                                    break L24;
                                  }
                                }
                                stackOut_49_0 = ~((ug) this).field_o;
                                stackOut_49_1 = ~((ug) this).field_z.field_m.length;
                                stackIn_50_0 = stackOut_49_0;
                                stackIn_50_1 = stackOut_49_1;
                                continue L26;
                              }
                            }
                          }
                        } else {
                          L32: {
                            if (stackIn_40_0 == stackIn_40_1) {
                              si discarded$11 = this.a((byte) -93, 1, var4);
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                          L33: {
                            L34: {
                              if (((ug) this).field_w[var4] == 0) {
                                break L34;
                              } else {
                                var3.b((byte) -116);
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
                          var3 = ((ug) this).field_v.f(2);
                          if (var5 == 0) {
                            continue L22;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    L35: while (true) {
                      stackOut_108_0 = ~((ug) this).field_o;
                      stackOut_108_1 = ~((ug) this).field_z.field_m.length;
                      stackIn_106_0 = stackOut_108_0;
                      stackIn_106_1 = stackOut_108_1;
                      if (stackIn_106_0 <= stackIn_106_1) {
                        break L24;
                      } else {
                        stackOut_104_0 = -1;
                        stackIn_64_0 = stackOut_104_0;
                        stackIn_105_0 = stackOut_104_0;
                        if (var5 != 0) {
                          break L23;
                        } else {
                          stackOut_105_0 = stackIn_105_0;
                          stackIn_102_0 = stackOut_105_0;
                          L36: {
                            if (stackIn_102_0 != ~((ug) this).field_z.field_m[((ug) this).field_o]) {
                              break L36;
                            } else {
                              ((ug) this).field_o = ((ug) this).field_o + 1;
                              if (var5 == 0) {
                                continue L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                          L37: {
                            if (((ug) this).field_C.field_c >= 250) {
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
                            if (((ug) this).field_w[((ug) this).field_o] != 0) {
                              break L38;
                            } else {
                              si discarded$12 = this.a((byte) -88, 1, ((ug) this).field_o);
                              break L38;
                            }
                          }
                          L39: {
                            if (((ug) this).field_w[((ug) this).field_o] != 0) {
                              break L39;
                            } else {
                              var3 = new kd();
                              var3.field_d = (long)((ug) this).field_o;
                              var2_int = 0;
                              ((ug) this).field_v.b(123, var3);
                              break L39;
                            }
                          }
                          ((ug) this).field_o = ((ug) this).field_o + 1;
                          if (var5 == 0) {
                            continue L35;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                  }
                  stackOut_63_0 = var2_int;
                  stackIn_64_0 = stackOut_63_0;
                  break L23;
                }
                if (stackIn_64_0 != 0) {
                  ((ug) this).field_o = 0;
                  ((ug) this).field_D = false;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        }
        L40: {
          L41: {
            if (!((ug) this).field_e) {
              break L41;
            } else {
              if (((ug) this).field_h > rf.c(0)) {
                break L41;
              } else {
                var2 = (si) (Object) ((ug) this).field_k.c((byte) -120);
                L42: while (true) {
                  L43: {
                    if (var2 == null) {
                      break L43;
                    } else {
                      stackOut_71_0 = var2.field_v;
                      stackIn_83_0 = stackOut_71_0;
                      stackIn_72_0 = stackOut_71_0;
                      if (var5 != 0) {
                        break L40;
                      } else {
                        L44: {
                          if (stackIn_72_0) {
                            break L44;
                          } else {
                            L45: {
                              if (var2.field_r) {
                                break L45;
                              } else {
                                var2.field_r = true;
                                if (var5 == 0) {
                                  break L44;
                                } else {
                                  break L45;
                                }
                              }
                            }
                            if (!var2.field_p) {
                              throw new RuntimeException();
                            } else {
                              var2.b((byte) -122);
                              break L44;
                            }
                          }
                        }
                        var2 = (si) (Object) ((ug) this).field_k.a((byte) -91);
                        if (var5 == 0) {
                          continue L42;
                        } else {
                          break L43;
                        }
                      }
                    }
                  }
                  ((ug) this).field_h = 1000L + rf.c(0);
                  break L41;
                }
              }
            }
          }
          stackOut_82_0 = param0;
          stackIn_83_0 = stackOut_82_0;
          break L40;
        }
        L46: {
          if (!stackIn_83_0) {
            break L46;
          } else {
            int discarded$13 = ((ug) this).a(15, 40);
            break L46;
          }
        }
    }

    final int a(int param0, int param1) {
        si var3 = (si) (Object) ((ug) this).field_k.a((long)param0, (byte) 96);
        if (!(var3 == null)) {
            return var3.c((byte) 16);
        }
        if (param1 != 1215) {
            return -35;
        }
        return 0;
    }

    final void c(int param0) {
        if (!(null != ((ug) this).field_B)) {
            return;
        }
        if (param0 != 11002) {
            ((ug) this).field_v = null;
        }
        ((ug) this).field_d = true;
        if (!(((ug) this).field_v != null)) {
            ((ug) this).field_v = new ng();
        }
    }

    final e a(boolean param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (((ug) this).field_z == null) {
          L0: {
            if (null != ((ug) this).field_t) {
              break L0;
            } else {
              if (!((ug) this).field_i.e(20)) {
                ((ug) this).field_t = (si) (Object) ((ug) this).field_i.a(5, 255, ((ug) this).field_j, (byte) 0, true);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((ug) this).field_t.field_v) {
            L1: {
              L2: {
                var5 = ((ug) this).field_t.d((byte) -125);
                var2 = var5;
                if (((ug) this).field_t instanceof fj) {
                  break L2;
                } else {
                  try {
                    L3: {
                      if (var5 != null) {
                        ((ug) this).field_z = new e(var5, ((ug) this).field_p, ((ug) this).field_g);
                        break L3;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var3 = decompiledCaughtException;
                      ((ug) this).field_i.c(-28488);
                      ((ug) this).field_z = null;
                      if (((ug) this).field_i.e(20)) {
                        break L4;
                      } else {
                        ((ug) this).field_t = (si) (Object) ((ug) this).field_i.a(5, 255, ((ug) this).field_j, (byte) 0, true);
                        if (var4 != 0) {
                          break L4;
                        } else {
                          return null;
                        }
                      }
                    }
                    ((ug) this).field_t = null;
                    return null;
                  }
                  if (null != ((ug) this).field_f) {
                    fj discarded$1 = ((ug) this).field_C.a(var5, ((ug) this).field_j, 1, ((ug) this).field_f);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              try {
                L5: {
                  if (var5 != null) {
                    ((ug) this).field_z = new e(var5, ((ug) this).field_p, ((ug) this).field_g);
                    if (((ug) this).field_z.field_s == ((ug) this).field_n) {
                      break L5;
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L6: {
                  var3 = decompiledCaughtException;
                  ((ug) this).field_z = null;
                  if (((ug) this).field_i.e(20)) {
                    break L6;
                  } else {
                    ((ug) this).field_t = (si) (Object) ((ug) this).field_i.a(5, 255, ((ug) this).field_j, (byte) 0, true);
                    if (var4 != 0) {
                      break L6;
                    } else {
                      return null;
                    }
                  }
                }
                ((ug) this).field_t = null;
                return null;
              }
              break L1;
            }
            L7: {
              if (null == ((ug) this).field_B) {
                break L7;
              } else {
                ((ug) this).field_w = new byte[((ug) this).field_z.field_d];
                break L7;
              }
            }
            L8: {
              if (!param0) {
                break L8;
              } else {
                field_m = 43;
                break L8;
              }
            }
            ((ug) this).field_t = null;
            return ((ug) this).field_z;
          } else {
            return null;
          }
        } else {
          return ((ug) this).field_z;
        }
    }

    final static void a(byte param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            field_s = null;
            var5 = bd.field_l;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              L2: {
                if (~var2 <= ~var3) {
                  break L2;
                } else {
                  int incrementValue$16 = var2;
                  var2++;
                  var5[incrementValue$16] = 0;
                  int incrementValue$17 = var2;
                  var2++;
                  var5[incrementValue$17] = 0;
                  int incrementValue$18 = var2;
                  var2++;
                  var5[incrementValue$18] = 0;
                  int incrementValue$19 = var2;
                  var2++;
                  var5[incrementValue$19] = 0;
                  int incrementValue$20 = var2;
                  var2++;
                  var5[incrementValue$20] = 0;
                  int incrementValue$21 = var2;
                  var2++;
                  var5[incrementValue$21] = 0;
                  int incrementValue$22 = var2;
                  var2++;
                  var5[incrementValue$22] = 0;
                  int incrementValue$23 = var2;
                  var2++;
                  var5[incrementValue$23] = 0;
                  if (var4 != 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (var4 == 0) {
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
          var1_ref = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1_ref, "ug.L(" + -68 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static wj a(sh param0, int param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        wj stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        wj stackOut_5_0 = null;
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
              if (param2) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            var4 = param0.a(param1, -117);
            var3 = var4;
            if (var4 != null) {
              stackOut_5_0 = new wj(var4);
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
            stackOut_7_1 = new StringBuilder().append("ug.H(");
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
          throw ld.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_6_0;
    }

    final byte[] a(int param0, boolean param1) {
        si var3 = this.a((byte) -3, 0, param0);
        if (var3 == null) {
            return null;
        }
        if (!param1) {
            ((ug) this).field_e = true;
        }
        byte[] var4 = var3.d((byte) -106);
        var3.b((byte) -116);
        return var4;
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
        byte stackIn_48_0 = 0;
        byte stackIn_48_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        Object stackIn_62_0 = null;
        byte stackIn_79_0 = 0;
        byte stackIn_79_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_78_0 = 0;
        byte stackOut_78_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        byte stackOut_47_0 = 0;
        byte stackOut_47_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        Object stackOut_61_0 = null;
        L0: {
          var10 = Lexicominos.field_L ? 1 : 0;
          var4 = (Object) (Object) (si) (Object) ((ug) this).field_k.a((long)param2, (byte) 107);
          if (var4 == null) {
            break L0;
          } else {
            if (0 != param1) {
              break L0;
            } else {
              if (((si) var4).field_p) {
                break L0;
              } else {
                if (!((si) var4).field_v) {
                  break L0;
                } else {
                  ((si) var4).b((byte) -116);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 != null) {
            break L1;
          } else {
            L2: {
              if (param1 == 0) {
                L3: {
                  L4: {
                    if (null == ((ug) this).field_B) {
                      break L4;
                    } else {
                      if (((ug) this).field_w[param2] != -1) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!((ug) this).field_i.e(20)) {
                    var4 = (Object) (Object) ((ug) this).field_i.a(5, ((ug) this).field_j, param2, (byte) 2, true);
                    if (var10 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    return null;
                  }
                }
                var4 = (Object) (Object) ((ug) this).field_C.a(((ug) this).field_B, (byte) -6, param2);
                break L2;
              } else {
                L5: {
                  if (param1 != 1) {
                    break L5;
                  } else {
                    if (null == ((ug) this).field_B) {
                      throw new RuntimeException();
                    } else {
                      var4 = (Object) (Object) ((ug) this).field_C.a(param2, ((ug) this).field_B, 3);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  if (param1 != 2) {
                    break L6;
                  } else {
                    if (((ug) this).field_B == null) {
                      throw new RuntimeException();
                    } else {
                      if (-1 == ((ug) this).field_w[param2]) {
                        if (!((ug) this).field_i.a(9172)) {
                          var4 = (Object) (Object) ((ug) this).field_i.a(5, ((ug) this).field_j, param2, (byte) 2, false);
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L6;
                          }
                        } else {
                          return null;
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
            break L1;
          }
        }
        L7: {
          if (param0 < 0) {
            break L7;
          } else {
            ug.a((byte) -68);
            break L7;
          }
        }
        if (!((si) var4).field_v) {
          var5 = ((si) var4).d((byte) 123);
          if (!(var4 instanceof fj)) {
            try {
              L8: {
                L9: {
                  if (var5 == null) {
                    break L9;
                  } else {
                    if (var5.length <= 2) {
                      break L9;
                    } else {
                      uh.field_v.reset();
                      uh.field_v.update(var5, 0, -2 + var5.length);
                      var6_int = (int)uh.field_v.getValue();
                      if (var6_int == ((ug) this).field_z.field_r[param2]) {
                        L10: {
                          if (null == ((ug) this).field_z.field_o) {
                            break L10;
                          } else {
                            if (null == ((ug) this).field_z.field_o[param2]) {
                              break L10;
                            } else {
                              var7 = ((ug) this).field_z.field_o[param2];
                              var8 = si.a(0, var5, -121, var5.length - 2);
                              var9 = 0;
                              L11: while (true) {
                                if (var9 >= 64) {
                                  break L10;
                                } else {
                                  stackOut_78_0 = var8[var9];
                                  stackOut_78_1 = var7[var9];
                                  stackIn_93_0 = stackOut_78_0;
                                  stackIn_93_1 = stackOut_78_1;
                                  stackIn_79_0 = stackOut_78_0;
                                  stackIn_79_1 = stackOut_78_1;
                                  if (var10 != 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L8;
                                  } else {
                                    if (stackIn_79_0 == stackIn_79_1) {
                                      var9++;
                                      if (var10 == 0) {
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
                            }
                          }
                        }
                        ((ug) this).field_i.field_p = 0;
                        ((ug) this).field_i.field_j = 0;
                        decompiledRegionSelector0 = 1;
                        break L8;
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
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              ((ug) this).field_i.c(-28488);
              ((si) var4).b((byte) -121);
              if (((si) var4).field_p) {
                L12: {
                  if (!((ug) this).field_i.e(20)) {
                    var4 = (Object) (Object) ((ug) this).field_i.a(5, ((ug) this).field_j, param2, (byte) 2, true);
                    ((ug) this).field_k.a((kd) var4, (byte) -75, (long)param2);
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
                  break L14;
                } else {
                  var5[-2 + var5.length] = (byte)(((ug) this).field_z.field_t[param2] >>> 8);
                  var5[var5.length + -1] = (byte)((ug) this).field_z.field_t[param2];
                  if (((ug) this).field_B != null) {
                    fj discarded$1 = ((ug) this).field_C.a(var5, param2, 1, ((ug) this).field_B);
                    stackOut_92_0 = ~((ug) this).field_w[param2];
                    stackOut_92_1 = -2;
                    stackIn_93_0 = stackOut_92_0;
                    stackIn_93_1 = stackOut_92_1;
                    break L14;
                  } else {
                    break L13;
                  }
                }
              }
              if (stackIn_93_0 != stackIn_93_1) {
                ((ug) this).field_w[param2] = (byte) 1;
                break L13;
              } else {
                break L13;
              }
            }
            L15: {
              if (!((si) var4).field_p) {
                ((si) var4).b((byte) -128);
                break L15;
              } else {
                break L15;
              }
            }
            return (si) var4;
          } else {
            try {
              L16: {
                L17: {
                  if (var5 == null) {
                    break L17;
                  } else {
                    if (var5.length <= 2) {
                      break L17;
                    } else {
                      uh.field_v.reset();
                      uh.field_v.update(var5, 0, var5.length + -2);
                      var6_int = (int)uh.field_v.getValue();
                      if (~var6_int != ~((ug) this).field_z.field_r[param2]) {
                        throw new RuntimeException();
                      } else {
                        L18: {
                          L19: {
                            if (((ug) this).field_z.field_o == null) {
                              break L19;
                            } else {
                              if (null != ((ug) this).field_z.field_o[param2]) {
                                var7 = ((ug) this).field_z.field_o[param2];
                                var8 = si.a(0, var5, -99, var5.length - 2);
                                var9 = 0;
                                L20: while (true) {
                                  if (64 <= var9) {
                                    break L19;
                                  } else {
                                    stackOut_47_0 = var7[var9];
                                    stackOut_47_1 = var8[var9];
                                    stackIn_52_0 = stackOut_47_0;
                                    stackIn_52_1 = stackOut_47_1;
                                    stackIn_48_0 = stackOut_47_0;
                                    stackIn_48_1 = stackOut_47_1;
                                    if (var10 != 0) {
                                      break L18;
                                    } else {
                                      if (stackIn_48_0 == stackIn_48_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L20;
                                        } else {
                                          break L19;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L19;
                              }
                            }
                          }
                          stackOut_51_0 = (var5[var5.length - 2] & 255) << 8;
                          stackOut_51_1 = 255 & var5[-1 + var5.length];
                          stackIn_52_0 = stackOut_51_0;
                          stackIn_52_1 = stackOut_51_1;
                          break L18;
                        }
                        var7_int = stackIn_52_0 + stackIn_52_1;
                        if (~var7_int != ~(((ug) this).field_z.field_t[param2] & 65535)) {
                          throw new RuntimeException();
                        } else {
                          L21: {
                            if (1 != ((ug) this).field_w[param2]) {
                              L22: {
                                if (((ug) this).field_w[param2] == 0) {
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              ((ug) this).field_w[param2] = (byte) 1;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          L23: {
                            if (((si) var4).field_p) {
                              break L23;
                            } else {
                              ((si) var4).b((byte) -128);
                              break L23;
                            }
                          }
                          stackOut_61_0 = var4;
                          stackIn_62_0 = stackOut_61_0;
                          break L16;
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (Exception) (Object) decompiledCaughtException;
              ((ug) this).field_w[param2] = (byte) -1;
              ((si) var4).b((byte) -117);
              if (((si) var4).field_p) {
                if (!((ug) this).field_i.e(20)) {
                  var4 = (Object) (Object) ((ug) this).field_i.a(5, ((ug) this).field_j, param2, (byte) 2, true);
                  ((ug) this).field_k.a((kd) var4, (byte) -92, (long)param2);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            return (si) (Object) stackIn_62_0;
          }
        } else {
          return null;
        }
    }

    public static void d(int param0) {
        field_s = null;
        field_r = null;
        field_A = null;
        field_y = null;
        if (param0 != 64) {
            field_y = null;
        }
        field_q = null;
    }

    ug(int param0, dl param1, dl param2, wb param3, kl param4, int param5, byte[] param6, int param7, boolean param8) {
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
              ((ug) this).field_e = stackIn_7_1 != 0;
              ((ug) this).field_C = param4;
              if (null == ((ug) this).field_f) {
                break L4;
              } else {
                ((ug) this).field_t = (si) (Object) ((ug) this).field_C.a(((ug) this).field_f, (byte) -6, ((ug) this).field_j);
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
            stackOut_10_1 = new StringBuilder().append("ug.<init>(").append(param0).append(44);
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
          throw ld.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
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
