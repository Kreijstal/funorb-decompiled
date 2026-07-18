/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends ew {
    private int field_r;
    private int field_j;
    static String field_z;
    static int field_p;
    private bc field_w;
    private bg field_t;
    private int field_B;
    private byte[] field_C;
    static rg field_D;
    private bp field_x;
    static String field_k;
    static int field_h;
    static int[][] field_y;
    private bc field_f;
    private byte[] field_g;
    private jm field_q;
    private ks field_n;
    private vo field_A;
    private int field_s;
    private at field_i;
    private boolean field_o;
    private boolean field_u;
    private at field_m;
    private boolean field_l;
    private long field_v;

    final void b(int param0) {
        RuntimeException var2 = null;
        ks var2_ref = null;
        int var2_int = 0;
        tc var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        byte stackIn_10_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_61_0 = 0;
        byte stackIn_61_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_98_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        byte stackOut_9_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_60_0 = 0;
        byte stackOut_60_1 = 0;
        int stackOut_74_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_97_0 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 == -26132) {
              L1: {
                if (((bm) this).field_i == null) {
                  break L1;
                } else {
                  if (null != ((bm) this).a(param0 ^ -10433)) {
                    L2: {
                      if (!((bm) this).field_o) {
                        break L2;
                      } else {
                        var2_int = 1;
                        var3 = ((bm) this).field_i.e((byte) 101);
                        L3: while (true) {
                          L4: {
                            L5: {
                              L6: {
                                if (null == var3) {
                                  break L6;
                                } else {
                                  var4 = (int)var3.field_i;
                                  stackOut_9_0 = 0;
                                  stackOut_9_1 = ((bm) this).field_C[var4];
                                  stackIn_22_0 = stackOut_9_0;
                                  stackIn_22_1 = stackOut_9_1;
                                  stackIn_10_0 = stackOut_9_0;
                                  stackIn_10_1 = stackOut_9_1;
                                  if (var5 != 0) {
                                    L7: while (true) {
                                      if (stackIn_22_0 <= stackIn_22_1) {
                                        break L5;
                                      } else {
                                        stackOut_23_0 = ~((bm) this).field_q.field_p[((bm) this).field_s];
                                        stackIn_48_0 = stackOut_23_0;
                                        stackIn_24_0 = stackOut_23_0;
                                        if (var5 != 0) {
                                          break L4;
                                        } else {
                                          stackOut_24_0 = stackIn_24_0;
                                          stackIn_26_0 = stackOut_24_0;
                                          L8: {
                                            L9: {
                                              if (stackIn_26_0 != -1) {
                                                break L9;
                                              } else {
                                                ((bm) this).field_s = ((bm) this).field_s + 1;
                                                if (var5 == 0) {
                                                  break L8;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                            L10: {
                                              if (250 <= ((bm) this).field_A.field_b) {
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
                                              if (((bm) this).field_C[((bm) this).field_s] == 0) {
                                                ks discarded$4 = this.a(1, ((bm) this).field_s, 1);
                                                break L11;
                                              } else {
                                                break L11;
                                              }
                                            }
                                            L12: {
                                              if (((bm) this).field_C[((bm) this).field_s] == 0) {
                                                var3 = new tc();
                                                var3.field_i = (long)((bm) this).field_s;
                                                var2_int = 0;
                                                ((bm) this).field_i.a((byte) -119, var3);
                                                break L12;
                                              } else {
                                                break L12;
                                              }
                                            }
                                            ((bm) this).field_s = ((bm) this).field_s + 1;
                                            if (var5 == 0) {
                                              break L8;
                                            } else {
                                              break L5;
                                            }
                                          }
                                          stackOut_21_0 = ~((bm) this).field_s;
                                          stackOut_21_1 = ~((bm) this).field_q.field_p.length;
                                          stackIn_22_0 = stackOut_21_0;
                                          stackIn_22_1 = stackOut_21_1;
                                          continue L7;
                                        }
                                      }
                                    }
                                  } else {
                                    L13: {
                                      if (stackIn_10_0 != stackIn_10_1) {
                                        break L13;
                                      } else {
                                        ks discarded$5 = this.a(1, var4, 1);
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      L15: {
                                        if (((bm) this).field_C[var4] == 0) {
                                          break L15;
                                        } else {
                                          var3.d(-115);
                                          if (var5 == 0) {
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      var2_int = 0;
                                      break L14;
                                    }
                                    var3 = ((bm) this).field_i.a((byte) 123);
                                    if (var5 == 0) {
                                      continue L3;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              L16: while (true) {
                                stackOut_21_0 = ~((bm) this).field_s;
                                stackOut_21_1 = ~((bm) this).field_q.field_p.length;
                                stackIn_22_0 = stackOut_21_0;
                                stackIn_22_1 = stackOut_21_1;
                                if (stackIn_22_0 <= stackIn_22_1) {
                                  break L5;
                                } else {
                                  stackOut_23_0 = ~((bm) this).field_q.field_p[((bm) this).field_s];
                                  stackIn_48_0 = stackOut_23_0;
                                  stackIn_24_0 = stackOut_23_0;
                                  if (var5 != 0) {
                                    break L4;
                                  } else {
                                    stackOut_24_0 = stackIn_24_0;
                                    stackIn_26_0 = stackOut_24_0;
                                    L17: {
                                      if (stackIn_26_0 != -1) {
                                        break L17;
                                      } else {
                                        ((bm) this).field_s = ((bm) this).field_s + 1;
                                        if (var5 == 0) {
                                          continue L16;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    L18: {
                                      if (250 <= ((bm) this).field_A.field_b) {
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
                                      if (((bm) this).field_C[((bm) this).field_s] == 0) {
                                        ks discarded$4 = this.a(1, ((bm) this).field_s, 1);
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (((bm) this).field_C[((bm) this).field_s] == 0) {
                                        var3 = new tc();
                                        var3.field_i = (long)((bm) this).field_s;
                                        var2_int = 0;
                                        ((bm) this).field_i.a((byte) -119, var3);
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                    ((bm) this).field_s = ((bm) this).field_s + 1;
                                    if (var5 == 0) {
                                      continue L16;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_47_0 = var2_int;
                            stackIn_48_0 = stackOut_47_0;
                            break L4;
                          }
                          L21: {
                            if (stackIn_48_0 != 0) {
                              ((bm) this).field_s = 0;
                              ((bm) this).field_o = false;
                              break L21;
                            } else {
                              break L21;
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
                    L22: {
                      if (((bm) this).field_u) {
                        break L22;
                      } else {
                        ((bm) this).field_i = null;
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L22;
                        }
                      }
                    }
                    var2_int = 1;
                    var3 = ((bm) this).field_i.e((byte) 92);
                    L23: while (true) {
                      L24: {
                        L25: {
                          L26: {
                            if (null == var3) {
                              break L26;
                            } else {
                              var4 = (int)var3.field_i;
                              stackOut_60_0 = 1;
                              stackOut_60_1 = ((bm) this).field_C[var4];
                              stackIn_73_0 = stackOut_60_0;
                              stackIn_73_1 = stackOut_60_1;
                              stackIn_61_0 = stackOut_60_0;
                              stackIn_61_1 = stackOut_60_1;
                              if (var5 != 0) {
                                L27: while (true) {
                                  if (stackIn_73_0 >= stackIn_73_1) {
                                    break L25;
                                  } else {
                                    stackOut_74_0 = 0;
                                    stackIn_98_0 = stackOut_74_0;
                                    stackIn_75_0 = stackOut_74_0;
                                    if (var5 != 0) {
                                      break L24;
                                    } else {
                                      stackOut_75_0 = stackIn_75_0;
                                      stackIn_77_0 = stackOut_75_0;
                                      L28: {
                                        L29: {
                                          if (stackIn_77_0 == ((bm) this).field_q.field_p[((bm) this).field_s]) {
                                            ((bm) this).field_s = ((bm) this).field_s + 1;
                                            if (var5 == 0) {
                                              break L28;
                                            } else {
                                              break L29;
                                            }
                                          } else {
                                            break L29;
                                          }
                                        }
                                        L30: {
                                          if (((bm) this).field_x.a((byte) 51)) {
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
                                          if (((bm) this).field_C[((bm) this).field_s] == 1) {
                                            break L31;
                                          } else {
                                            ks discarded$6 = this.a(1, ((bm) this).field_s, 2);
                                            break L31;
                                          }
                                        }
                                        L32: {
                                          if (((bm) this).field_C[((bm) this).field_s] != 1) {
                                            var3 = new tc();
                                            var3.field_i = (long)((bm) this).field_s;
                                            ((bm) this).field_i.a((byte) -119, var3);
                                            var2_int = 0;
                                            break L32;
                                          } else {
                                            break L32;
                                          }
                                        }
                                        ((bm) this).field_s = ((bm) this).field_s + 1;
                                        if (var5 == 0) {
                                          break L28;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      stackOut_72_0 = ~((bm) this).field_q.field_p.length;
                                      stackOut_72_1 = ~((bm) this).field_s;
                                      stackIn_73_0 = stackOut_72_0;
                                      stackIn_73_1 = stackOut_72_1;
                                      continue L27;
                                    }
                                  }
                                }
                              } else {
                                L33: {
                                  if (stackIn_61_0 == stackIn_61_1) {
                                    break L33;
                                  } else {
                                    ks discarded$7 = this.a(1, var4, 2);
                                    break L33;
                                  }
                                }
                                L34: {
                                  L35: {
                                    if (((bm) this).field_C[var4] != 1) {
                                      break L35;
                                    } else {
                                      var3.d(param0 ^ 26237);
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
                                var3 = ((bm) this).field_i.a((byte) 123);
                                if (var5 == 0) {
                                  continue L23;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          L36: while (true) {
                            stackOut_72_0 = ~((bm) this).field_q.field_p.length;
                            stackOut_72_1 = ~((bm) this).field_s;
                            stackIn_73_0 = stackOut_72_0;
                            stackIn_73_1 = stackOut_72_1;
                            if (stackIn_73_0 >= stackIn_73_1) {
                              break L25;
                            } else {
                              stackOut_74_0 = 0;
                              stackIn_98_0 = stackOut_74_0;
                              stackIn_75_0 = stackOut_74_0;
                              if (var5 != 0) {
                                break L24;
                              } else {
                                stackOut_75_0 = stackIn_75_0;
                                stackIn_77_0 = stackOut_75_0;
                                L37: {
                                  if (stackIn_77_0 == ((bm) this).field_q.field_p[((bm) this).field_s]) {
                                    ((bm) this).field_s = ((bm) this).field_s + 1;
                                    if (var5 == 0) {
                                      continue L36;
                                    } else {
                                      break L37;
                                    }
                                  } else {
                                    break L37;
                                  }
                                }
                                L38: {
                                  if (((bm) this).field_x.a((byte) 51)) {
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
                                  if (((bm) this).field_C[((bm) this).field_s] == 1) {
                                    break L39;
                                  } else {
                                    ks discarded$6 = this.a(1, ((bm) this).field_s, 2);
                                    break L39;
                                  }
                                }
                                L40: {
                                  if (((bm) this).field_C[((bm) this).field_s] != 1) {
                                    var3 = new tc();
                                    var3.field_i = (long)((bm) this).field_s;
                                    ((bm) this).field_i.a((byte) -119, var3);
                                    var2_int = 0;
                                    break L40;
                                  } else {
                                    break L40;
                                  }
                                }
                                ((bm) this).field_s = ((bm) this).field_s + 1;
                                if (var5 == 0) {
                                  continue L36;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                        }
                        stackOut_97_0 = var2_int;
                        stackIn_98_0 = stackOut_97_0;
                        break L24;
                      }
                      if (stackIn_98_0 == 0) {
                        break L1;
                      } else {
                        ((bm) this).field_u = false;
                        ((bm) this).field_s = 0;
                        break L1;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              L41: {
                if (!((bm) this).field_l) {
                  break L41;
                } else {
                  if (~((bm) this).field_v >= ~vi.b(param0 + 26060)) {
                    var2_ref = (ks) (Object) ((bm) this).field_t.b(1);
                    L42: while (true) {
                      L43: {
                        if (null == var2_ref) {
                          break L43;
                        } else {
                          if (var5 != 0) {
                            break L41;
                          } else {
                            L44: {
                              if (var2_ref.field_x) {
                                break L44;
                              } else {
                                L45: {
                                  if (var2_ref.field_w) {
                                    break L45;
                                  } else {
                                    var2_ref.field_w = true;
                                    if (var5 == 0) {
                                      break L44;
                                    } else {
                                      break L45;
                                    }
                                  }
                                }
                                if (!var2_ref.field_z) {
                                  throw new RuntimeException();
                                } else {
                                  var2_ref.d(-128);
                                  break L44;
                                }
                              }
                            }
                            var2_ref = (ks) (Object) ((bm) this).field_t.b((byte) 127);
                            if (var5 == 0) {
                              continue L42;
                            } else {
                              break L43;
                            }
                          }
                        }
                      }
                      ((bm) this).field_v = 1000L + vi.b(65);
                      break L41;
                    }
                  } else {
                    break L41;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "bm.K(" + param0 + ')');
        }
    }

    final jm a(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        jm stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_46_0 = null;
        jm stackIn_59_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_14_0 = null;
        Object stackOut_45_0 = null;
        Object stackOut_31_0 = null;
        jm stackOut_58_0 = null;
        jm stackOut_2_0 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (((bm) this).field_q == null) {
              L1: {
                if (null == ((bm) this).field_n) {
                  if (!((bm) this).field_x.d(101)) {
                    ((bm) this).field_n = (ks) (Object) ((bm) this).field_x.a(((bm) this).field_r, false, 255, (byte) 0, true);
                    break L1;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (jm) (Object) stackIn_9_0;
                  }
                } else {
                  break L1;
                }
              }
              if (((bm) this).field_n.field_x) {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (jm) (Object) stackIn_15_0;
              } else {
                L2: {
                  var2_array = ((bm) this).field_n.d((byte) -119);
                  if (!(((bm) this).field_n instanceof nh)) {
                    try {
                      L3: {
                        if (var2_array == null) {
                          throw new RuntimeException();
                        } else {
                          ((bm) this).field_q = new jm(var2_array, ((bm) this).field_B, ((bm) this).field_g);
                          break L3;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        L5: {
                          var3 = decompiledCaughtException;
                          ((bm) this).field_x.b((byte) 4);
                          ((bm) this).field_q = null;
                          if (((bm) this).field_x.d(param0 + -20152)) {
                            break L5;
                          } else {
                            ((bm) this).field_n = (ks) (Object) ((bm) this).field_x.a(((bm) this).field_r, false, 255, (byte) 0, true);
                            if (var4 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        ((bm) this).field_n = null;
                        break L4;
                      }
                      stackOut_45_0 = null;
                      stackIn_46_0 = stackOut_45_0;
                      return (jm) (Object) stackIn_46_0;
                    }
                    if (null != ((bm) this).field_f) {
                      nh discarded$1 = ((bm) this).field_A.a(((bm) this).field_r, ((bm) this).field_f, false, var2_array);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    try {
                      L6: {
                        if (var2_array != null) {
                          ((bm) this).field_q = new jm(var2_array, ((bm) this).field_B, ((bm) this).field_g);
                          if (~((bm) this).field_j != ~((bm) this).field_q.field_c) {
                            throw new RuntimeException();
                          } else {
                            break L6;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L7: {
                        L8: {
                          var3 = decompiledCaughtException;
                          ((bm) this).field_q = null;
                          if (!((bm) this).field_x.d(92)) {
                            break L8;
                          } else {
                            ((bm) this).field_n = null;
                            if (var4 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        ((bm) this).field_n = (ks) (Object) ((bm) this).field_x.a(((bm) this).field_r, false, 255, (byte) 0, true);
                        break L7;
                      }
                      stackOut_31_0 = null;
                      stackIn_32_0 = stackOut_31_0;
                      return (jm) (Object) stackIn_32_0;
                    }
                    break L2;
                  }
                }
                L9: {
                  ((bm) this).field_n = null;
                  if (null != ((bm) this).field_w) {
                    ((bm) this).field_C = new byte[((bm) this).field_q.field_i];
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param0 == 20179) {
                    break L10;
                  } else {
                    field_k = null;
                    break L10;
                  }
                }
                stackOut_58_0 = ((bm) this).field_q;
                stackIn_59_0 = stackOut_58_0;
                break L0;
              }
            } else {
              stackOut_2_0 = ((bm) this).field_q;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "bm.B(" + param0 + ')');
        }
        return stackIn_59_0;
    }

    private final ks a(int param0, int param1, int param2) {
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
        Object stackIn_3_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_62_0 = null;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        Object stackIn_104_0 = null;
        Object stackIn_111_0 = null;
        byte stackIn_128_0 = 0;
        byte stackIn_128_1 = 0;
        Object stackIn_144_0 = null;
        byte stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        Object stackIn_155_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_55_0 = null;
        Object stackOut_43_0 = null;
        Object stackOut_61_0 = null;
        byte stackOut_127_0 = 0;
        byte stackOut_127_1 = 0;
        Object stackOut_143_0 = null;
        byte stackOut_146_0 = 0;
        int stackOut_146_1 = 0;
        Object stackOut_154_0 = null;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        Object stackOut_103_0 = null;
        Object stackOut_110_0 = null;
        Object stackOut_2_0 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 == 1) {
              L1: {
                var4 = (Object) (Object) (ks) (Object) ((bm) this).field_t.a(-67, (long)param1);
                if (null == var4) {
                  break L1;
                } else {
                  if (0 != param2) {
                    break L1;
                  } else {
                    if (((ks) var4).field_z) {
                      break L1;
                    } else {
                      if (((ks) var4).field_x) {
                        ((ks) var4).d(35);
                        var4 = null;
                        break L1;
                      } else {
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
                    if (param2 == 0) {
                      L4: {
                        if (null == ((bm) this).field_w) {
                          break L4;
                        } else {
                          if (((bm) this).field_C[param1] == -1) {
                            break L4;
                          } else {
                            var4 = (Object) (Object) ((bm) this).field_A.a(param1, ((bm) this).field_w, 86);
                            if (var10 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      L5: {
                        if (((bm) this).field_x.d(64)) {
                          break L5;
                        } else {
                          var4 = (Object) (Object) ((bm) this).field_x.a(param1, false, ((bm) this).field_r, (byte) 2, true);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      stackOut_55_0 = null;
                      stackIn_56_0 = stackOut_55_0;
                      return (ks) (Object) stackIn_56_0;
                    } else {
                      L6: {
                        if (1 != param2) {
                          break L6;
                        } else {
                          if (((bm) this).field_w != null) {
                            var4 = (Object) (Object) ((bm) this).field_A.a((byte) 56, param1, ((bm) this).field_w);
                            if (var10 == 0) {
                              break L3;
                            } else {
                              break L6;
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                      if (param2 != 2) {
                        throw new RuntimeException();
                      } else {
                        if (((bm) this).field_w != null) {
                          if (((bm) this).field_C[param1] == -1) {
                            L7: {
                              if (((bm) this).field_x.a((byte) 51)) {
                                break L7;
                              } else {
                                var4 = (Object) (Object) ((bm) this).field_x.a(param1, false, ((bm) this).field_r, (byte) 2, false);
                                if (var10 == 0) {
                                  break L3;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            stackOut_43_0 = null;
                            stackIn_44_0 = stackOut_43_0;
                            return (ks) (Object) stackIn_44_0;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                  ((bm) this).field_t.a((tc) var4, (long)param1, 108);
                  break L2;
                }
              }
              if (((ks) var4).field_x) {
                stackOut_61_0 = null;
                stackIn_62_0 = stackOut_61_0;
                return (ks) (Object) stackIn_62_0;
              } else {
                var5 = ((ks) var4).d((byte) -86);
                if (!(var4 instanceof nh)) {
                  try {
                    L8: {
                      L9: {
                        if (null == var5) {
                          break L9;
                        } else {
                          if (var5.length > 2) {
                            ab.field_b.reset();
                            ab.field_b.update(var5, 0, var5.length + -2);
                            var6_int = (int)ab.field_b.getValue();
                            if (var6_int == ((bm) this).field_q.field_e[param1]) {
                              L10: {
                                if (null == ((bm) this).field_q.field_v) {
                                  break L10;
                                } else {
                                  if (((bm) this).field_q.field_v[param1] == null) {
                                    break L10;
                                  } else {
                                    var7 = ((bm) this).field_q.field_v[param1];
                                    var8 = ua.a(-18423, -2 + var5.length, var5, 0);
                                    var9 = 0;
                                    L11: while (true) {
                                      if (var9 >= 64) {
                                        break L10;
                                      } else {
                                        stackOut_127_0 = var7[var9];
                                        stackOut_127_1 = var8[var9];
                                        stackIn_148_0 = stackOut_127_0;
                                        stackIn_148_1 = stackOut_127_1;
                                        stackIn_128_0 = stackOut_127_0;
                                        stackIn_128_1 = stackOut_127_1;
                                        if (var10 != 0) {
                                          decompiledRegionSelector0 = 0;
                                          break L8;
                                        } else {
                                          if (stackIn_128_0 != stackIn_128_1) {
                                            throw new RuntimeException();
                                          } else {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L11;
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
                              ((bm) this).field_x.field_q = 0;
                              ((bm) this).field_x.field_p = 0;
                              decompiledRegionSelector0 = 1;
                              break L8;
                            } else {
                              throw new RuntimeException();
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
                      var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                      ((bm) this).field_x.b((byte) 4);
                      ((ks) var4).d(-109);
                      if (((ks) var4).field_z) {
                        if (!((bm) this).field_x.d(59)) {
                          var4 = (Object) (Object) ((bm) this).field_x.a(param1, false, ((bm) this).field_r, (byte) 2, true);
                          ((bm) this).field_t.a((tc) var4, (long)param1, 120);
                          break L12;
                        } else {
                          break L12;
                        }
                      } else {
                        break L12;
                      }
                    }
                    stackOut_143_0 = null;
                    stackIn_144_0 = stackOut_143_0;
                    return (ks) (Object) stackIn_144_0;
                  }
                  L13: {
                    L14: {
                      if (decompiledRegionSelector0 == 0) {
                        break L14;
                      } else {
                        var5[-2 + var5.length] = (byte)(((bm) this).field_q.field_t[param1] >>> -1066328536);
                        var5[-1 + var5.length] = (byte)((bm) this).field_q.field_t[param1];
                        if (null == ((bm) this).field_w) {
                          break L13;
                        } else {
                          nh discarded$1 = ((bm) this).field_A.a(param1, ((bm) this).field_w, false, var5);
                          stackOut_146_0 = ((bm) this).field_C[param1];
                          stackOut_146_1 = 1;
                          stackIn_148_0 = stackOut_146_0;
                          stackIn_148_1 = stackOut_146_1;
                          break L14;
                        }
                      }
                    }
                    if (stackIn_148_0 != stackIn_148_1) {
                      ((bm) this).field_C[param1] = (byte) 1;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L15: {
                    if (((ks) var4).field_z) {
                      break L15;
                    } else {
                      ((ks) var4).d(105);
                      break L15;
                    }
                  }
                  stackOut_154_0 = var4;
                  stackIn_155_0 = stackOut_154_0;
                  break L0;
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
                            ab.field_b.reset();
                            ab.field_b.update(var5, 0, -2 + var5.length);
                            var6_int = (int)ab.field_b.getValue();
                            if (var6_int != ((bm) this).field_q.field_e[param1]) {
                              throw new RuntimeException();
                            } else {
                              L18: {
                                L19: {
                                  if (((bm) this).field_q.field_v == null) {
                                    break L19;
                                  } else {
                                    if (null != ((bm) this).field_q.field_v[param1]) {
                                      var7 = ((bm) this).field_q.field_v[param1];
                                      var8 = ua.a(param0 ^ -18424, -2 + var5.length, var5, 0);
                                      var9 = 0;
                                      L20: while (true) {
                                        if (var9 >= 64) {
                                          break L19;
                                        } else {
                                          stackOut_83_0 = ~var7[var9];
                                          stackOut_83_1 = ~var8[var9];
                                          stackIn_91_0 = stackOut_83_0;
                                          stackIn_91_1 = stackOut_83_1;
                                          stackIn_84_0 = stackOut_83_0;
                                          stackIn_84_1 = stackOut_83_1;
                                          if (var10 != 0) {
                                            break L18;
                                          } else {
                                            if (stackIn_84_0 == stackIn_84_1) {
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
                                stackOut_90_0 = 255 & var5[var5.length + -1];
                                stackOut_90_1 = 65280 & var5[-2 + var5.length] << -2019534360;
                                stackIn_91_0 = stackOut_90_0;
                                stackIn_91_1 = stackOut_90_1;
                                break L18;
                              }
                              var7_int = stackIn_91_0 + stackIn_91_1;
                              if (~(65535 & ((bm) this).field_q.field_t[param1]) == ~var7_int) {
                                L21: {
                                  if (((bm) this).field_C[param1] != 1) {
                                    L22: {
                                      if (((bm) this).field_C[param1] == 0) {
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                    ((bm) this).field_C[param1] = (byte) 1;
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                L23: {
                                  if (!((ks) var4).field_z) {
                                    ((ks) var4).d(param0 ^ -99);
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                stackOut_103_0 = var4;
                                stackIn_104_0 = stackOut_103_0;
                                break L16;
                              } else {
                                throw new RuntimeException();
                              }
                            }
                          }
                        }
                      }
                      throw new RuntimeException();
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L24: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      ((bm) this).field_C[param1] = (byte) -1;
                      ((ks) var4).d(116);
                      if (((ks) var4).field_z) {
                        if (((bm) this).field_x.d(18)) {
                          break L24;
                        } else {
                          var4 = (Object) (Object) ((bm) this).field_x.a(param1, false, ((bm) this).field_r, (byte) 2, true);
                          ((bm) this).field_t.a((tc) var4, (long)param1, 98);
                          break L24;
                        }
                      } else {
                        break L24;
                      }
                    }
                    stackOut_110_0 = null;
                    stackIn_111_0 = stackOut_110_0;
                    return (ks) (Object) stackIn_111_0;
                  }
                  return (ks) (Object) stackIn_104_0;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ks) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw ig.a((Throwable) var4, "bm.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (ks) (Object) stackIn_155_0;
    }

    final static void a(byte param0, int param1) {
        try {
            if (param0 > -43) {
                bm.e(41);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "bm.J(" + param0 + ',' + param1 + ')');
        }
    }

    final byte[] a(int param0, int param1) {
        ks var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var3 = this.a(1, param0, 0);
            if (var3 != null) {
              L1: {
                if (param1 == 4) {
                  break L1;
                } else {
                  ((bm) this).b(-9);
                  break L1;
                }
              }
              var4 = var3.d((byte) -113);
              var3.d(121);
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
          throw ig.a((Throwable) (Object) var3_ref, "bm.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final int b(int param0, int param1) {
        ks var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3 = (ks) (Object) ((bm) this).field_t.a(param0 + -5958, (long)param1);
            if (var3 == null) {
              if (param0 == 5926) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 68;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = var3.g(0);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3_ref, "bm.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    public static void e(int param0) {
        field_k = null;
        field_D = null;
        if (param0 > -33) {
            return;
        }
        try {
            field_z = null;
            field_y = null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "bm.H(" + param0 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((bm) this).field_w == null) {
              return;
            } else {
              L1: {
                ((bm) this).field_u = true;
                if (param0 == 31637) {
                  break L1;
                } else {
                  jm discarded$2 = ((bm) this).a(-26);
                  break L1;
                }
              }
              L2: {
                if (null == ((bm) this).field_i) {
                  ((bm) this).field_i = new at();
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
          throw ig.a((Throwable) (Object) var2, "bm.G(" + param0 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        tc var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (((bm) this).field_i != null) {
              if (null == ((bm) this).a(20179)) {
                return;
              } else {
                var3 = 1 % ((72 - param0) / 39);
                var2_ref = ((bm) this).field_m.e((byte) 120);
                L1: while (true) {
                  L2: {
                    L3: {
                      if (null == var2_ref) {
                        break L3;
                      } else {
                        var4 = (int)var2_ref.field_i;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          L4: {
                            L5: {
                              L6: {
                                if (var4 < 0) {
                                  break L6;
                                } else {
                                  if (~var4 <= ~((bm) this).field_q.field_i) {
                                    break L6;
                                  } else {
                                    if (((bm) this).field_q.field_p[var4] != 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var2_ref.d(-111);
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                            L7: {
                              if (0 != ((bm) this).field_C[var4]) {
                                break L7;
                              } else {
                                ks discarded$2 = this.a(1, var4, 1);
                                break L7;
                              }
                            }
                            L8: {
                              if (((bm) this).field_C[var4] != -1) {
                                break L8;
                              } else {
                                ks discarded$3 = this.a(1, var4, 2);
                                break L8;
                              }
                            }
                            if (1 != ((bm) this).field_C[var4]) {
                              break L4;
                            } else {
                              var2_ref.d(-121);
                              break L4;
                            }
                          }
                          var2_ref = ((bm) this).field_m.a((byte) 123);
                          if (var5 == 0) {
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
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "bm.L(" + param0 + ')');
        }
    }

    bm(int param0, bc param1, bc param2, bp param3, vo param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((bm) this).field_t = new bg(16);
        ((bm) this).field_s = 0;
        ((bm) this).field_m = new at();
        ((bm) this).field_v = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((bm) this).field_r = param0;
                ((bm) this).field_w = param1;
                if (((bm) this).field_w != null) {
                  break L2;
                } else {
                  ((bm) this).field_o = false;
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((bm) this).field_o = true;
              ((bm) this).field_i = new at();
              break L1;
            }
            L3: {
              ((bm) this).field_B = param5;
              ((bm) this).field_j = param7;
              ((bm) this).field_g = param6;
              ((bm) this).field_l = param8;
              ((bm) this).field_f = param2;
              ((bm) this).field_x = param3;
              ((bm) this).field_A = param4;
              if (null != ((bm) this).field_f) {
                ((bm) this).field_n = (ks) (Object) ((bm) this).field_A.a(((bm) this).field_r, ((bm) this).field_f, 114);
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
            stackOut_10_1 = new StringBuilder().append("bm.<init>(").append(param0).append(',');
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
          throw ig.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new int[][]{new int[2], new int[2], new int[2], new int[2]};
        field_z = "Connection lost - attempting to reconnect";
        field_k = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
