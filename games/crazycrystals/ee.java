/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends lk {
    static long field_e;
    private int field_u;
    static String field_q;
    private ni field_v;
    private wl field_k;
    private int field_r;
    private qg field_p;
    private sp field_l;
    private sp field_i;
    private byte[] field_x;
    private ob field_w;
    static dl field_m;
    private int field_s;
    private byte[] field_h;
    private fc field_g;
    private wb field_j;
    private wb field_n;
    private int field_o;
    private boolean field_d;
    private boolean field_f;
    private boolean field_t;
    private long field_c;

    final void e(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        wl var2_ref = null;
        jb var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_12_0 = 0;
        byte stackIn_12_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_56_0 = 0;
        byte stackIn_56_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        boolean stackIn_104_0 = false;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_124_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        byte stackOut_11_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_55_0 = 0;
        byte stackOut_55_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        boolean stackOut_103_0 = false;
        int stackOut_122_0 = 0;
        int stackOut_122_1 = 0;
        int stackOut_123_0 = 0;
        var5 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (((ee) this).field_j == null) {
                    break L3;
                  } else {
                    if (((ee) this).a(630779105) == null) {
                      return;
                    } else {
                      L4: {
                        if (!((ee) this).field_d) {
                          break L4;
                        } else {
                          var2_int = 1;
                          var3 = ((ee) this).field_j.g(32073);
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (null == var3) {
                                  break L7;
                                } else {
                                  var4 = (int)var3.field_e;
                                  stackOut_11_0 = 0;
                                  stackOut_11_1 = ((ee) this).field_h[var4];
                                  stackIn_24_0 = stackOut_11_0;
                                  stackIn_24_1 = stackOut_11_1;
                                  stackIn_12_0 = stackOut_11_0;
                                  stackIn_12_1 = stackOut_11_1;
                                  if (var5 != 0) {
                                    L8: while (true) {
                                      if (stackIn_24_0 >= stackIn_24_1) {
                                        break L6;
                                      } else {
                                        stackOut_25_0 = -1;
                                        stackOut_25_1 = ~((ee) this).field_p.field_f[((ee) this).field_o];
                                        stackIn_123_0 = stackOut_25_0;
                                        stackIn_123_1 = stackOut_25_1;
                                        stackIn_26_0 = stackOut_25_0;
                                        stackIn_26_1 = stackOut_25_1;
                                        if (var5 != 0) {
                                          break L2;
                                        } else {
                                          stackOut_26_0 = stackIn_26_0;
                                          stackOut_26_1 = stackIn_26_1;
                                          stackIn_28_0 = stackOut_26_0;
                                          stackIn_28_1 = stackOut_26_1;
                                          L9: {
                                            L10: {
                                              if (stackIn_28_0 == stackIn_28_1) {
                                                ((ee) this).field_o = ((ee) this).field_o + 1;
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
                                              if (((ee) this).field_v.field_c < 250) {
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
                                              if (((ee) this).field_h[((ee) this).field_o] == 0) {
                                                wl discarded$4 = this.a(true, 1, ((ee) this).field_o);
                                                break L12;
                                              } else {
                                                break L12;
                                              }
                                            }
                                            L13: {
                                              if (((ee) this).field_h[((ee) this).field_o] == 0) {
                                                var3 = new jb();
                                                var3.field_e = (long)((ee) this).field_o;
                                                var2_int = 0;
                                                ((ee) this).field_j.b(0, var3);
                                                break L13;
                                              } else {
                                                break L13;
                                              }
                                            }
                                            ((ee) this).field_o = ((ee) this).field_o + 1;
                                            if (var5 == 0) {
                                              break L9;
                                            } else {
                                              break L6;
                                            }
                                          }
                                          stackOut_23_0 = ((ee) this).field_o;
                                          stackOut_23_1 = ((ee) this).field_p.field_f.length;
                                          stackIn_24_0 = stackOut_23_0;
                                          stackIn_24_1 = stackOut_23_1;
                                          continue L8;
                                        }
                                      }
                                    }
                                  } else {
                                    L14: {
                                      if (stackIn_12_0 != stackIn_12_1) {
                                        break L14;
                                      } else {
                                        wl discarded$5 = this.a(true, 1, var4);
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      L16: {
                                        if (0 == ((ee) this).field_h[var4]) {
                                          break L16;
                                        } else {
                                          var3.a(false);
                                          if (var5 == 0) {
                                            break L15;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      var2_int = 0;
                                      break L15;
                                    }
                                    var3 = ((ee) this).field_j.a(false);
                                    if (var5 == 0) {
                                      continue L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              L17: while (true) {
                                stackOut_23_0 = ((ee) this).field_o;
                                stackOut_23_1 = ((ee) this).field_p.field_f.length;
                                stackIn_24_0 = stackOut_23_0;
                                stackIn_24_1 = stackOut_23_1;
                                if (stackIn_24_0 >= stackIn_24_1) {
                                  break L6;
                                } else {
                                  stackOut_25_0 = -1;
                                  stackOut_25_1 = ~((ee) this).field_p.field_f[((ee) this).field_o];
                                  stackIn_123_0 = stackOut_25_0;
                                  stackIn_123_1 = stackOut_25_1;
                                  stackIn_26_0 = stackOut_25_0;
                                  stackIn_26_1 = stackOut_25_1;
                                  if (var5 != 0) {
                                    break L2;
                                  } else {
                                    stackOut_26_0 = stackIn_26_0;
                                    stackOut_26_1 = stackIn_26_1;
                                    stackIn_28_0 = stackOut_26_0;
                                    stackIn_28_1 = stackOut_26_1;
                                    L18: {
                                      if (stackIn_28_0 == stackIn_28_1) {
                                        ((ee) this).field_o = ((ee) this).field_o + 1;
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
                                      if (((ee) this).field_v.field_c < 250) {
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
                                      if (((ee) this).field_h[((ee) this).field_o] == 0) {
                                        wl discarded$4 = this.a(true, 1, ((ee) this).field_o);
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (((ee) this).field_h[((ee) this).field_o] == 0) {
                                        var3 = new jb();
                                        var3.field_e = (long)((ee) this).field_o;
                                        var2_int = 0;
                                        ((ee) this).field_j.b(0, var3);
                                        break L21;
                                      } else {
                                        break L21;
                                      }
                                    }
                                    ((ee) this).field_o = ((ee) this).field_o + 1;
                                    if (var5 == 0) {
                                      continue L17;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            L22: {
                              if (var2_int == 0) {
                                break L22;
                              } else {
                                ((ee) this).field_o = 0;
                                ((ee) this).field_d = false;
                                break L22;
                              }
                            }
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      L23: {
                        if (!((ee) this).field_f) {
                          break L23;
                        } else {
                          var2_int = 1;
                          var3 = ((ee) this).field_j.g(32073);
                          L24: while (true) {
                            L25: {
                              L26: {
                                if (var3 == null) {
                                  break L26;
                                } else {
                                  var4 = (int)var3.field_e;
                                  stackOut_55_0 = 1;
                                  stackOut_55_1 = ((ee) this).field_h[var4];
                                  stackIn_67_0 = stackOut_55_0;
                                  stackIn_67_1 = stackOut_55_1;
                                  stackIn_56_0 = stackOut_55_0;
                                  stackIn_56_1 = stackOut_55_1;
                                  if (var5 != 0) {
                                    L27: while (true) {
                                      if (stackIn_67_0 >= stackIn_67_1) {
                                        break L25;
                                      } else {
                                        stackOut_68_0 = 0;
                                        stackOut_68_1 = ((ee) this).field_p.field_f[((ee) this).field_o];
                                        stackIn_123_0 = stackOut_68_0;
                                        stackIn_123_1 = stackOut_68_1;
                                        stackIn_69_0 = stackOut_68_0;
                                        stackIn_69_1 = stackOut_68_1;
                                        if (var5 != 0) {
                                          break L2;
                                        } else {
                                          stackOut_69_0 = stackIn_69_0;
                                          stackOut_69_1 = stackIn_69_1;
                                          stackIn_71_0 = stackOut_69_0;
                                          stackIn_71_1 = stackOut_69_1;
                                          L28: {
                                            L29: {
                                              if (stackIn_71_0 == stackIn_71_1) {
                                                ((ee) this).field_o = ((ee) this).field_o + 1;
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
                                              if (((ee) this).field_w.c(-21)) {
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
                                              if (((ee) this).field_h[((ee) this).field_o] != 1) {
                                                wl discarded$6 = this.a(true, 2, ((ee) this).field_o);
                                                break L31;
                                              } else {
                                                break L31;
                                              }
                                            }
                                            L32: {
                                              if (((ee) this).field_h[((ee) this).field_o] != 1) {
                                                var3 = new jb();
                                                var3.field_e = (long)((ee) this).field_o;
                                                var2_int = 0;
                                                ((ee) this).field_j.b(0, var3);
                                                break L32;
                                              } else {
                                                break L32;
                                              }
                                            }
                                            ((ee) this).field_o = ((ee) this).field_o + 1;
                                            if (var5 == 0) {
                                              break L28;
                                            } else {
                                              break L25;
                                            }
                                          }
                                          stackOut_66_0 = ((ee) this).field_o;
                                          stackOut_66_1 = ((ee) this).field_p.field_f.length;
                                          stackIn_67_0 = stackOut_66_0;
                                          stackIn_67_1 = stackOut_66_1;
                                          continue L27;
                                        }
                                      }
                                    }
                                  } else {
                                    L33: {
                                      if (stackIn_56_0 != stackIn_56_1) {
                                        wl discarded$7 = this.a(true, 2, var4);
                                        break L33;
                                      } else {
                                        break L33;
                                      }
                                    }
                                    L34: {
                                      L35: {
                                        if (((ee) this).field_h[var4] == 1) {
                                          break L35;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L34;
                                          } else {
                                            break L35;
                                          }
                                        }
                                      }
                                      var3.a(false);
                                      break L34;
                                    }
                                    var3 = ((ee) this).field_j.a(false);
                                    if (var5 == 0) {
                                      continue L24;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                              }
                              L36: while (true) {
                                stackOut_66_0 = ((ee) this).field_o;
                                stackOut_66_1 = ((ee) this).field_p.field_f.length;
                                stackIn_67_0 = stackOut_66_0;
                                stackIn_67_1 = stackOut_66_1;
                                if (stackIn_67_0 >= stackIn_67_1) {
                                  break L25;
                                } else {
                                  stackOut_68_0 = 0;
                                  stackOut_68_1 = ((ee) this).field_p.field_f[((ee) this).field_o];
                                  stackIn_123_0 = stackOut_68_0;
                                  stackIn_123_1 = stackOut_68_1;
                                  stackIn_69_0 = stackOut_68_0;
                                  stackIn_69_1 = stackOut_68_1;
                                  if (var5 != 0) {
                                    break L2;
                                  } else {
                                    stackOut_69_0 = stackIn_69_0;
                                    stackOut_69_1 = stackIn_69_1;
                                    stackIn_71_0 = stackOut_69_0;
                                    stackIn_71_1 = stackOut_69_1;
                                    L37: {
                                      if (stackIn_71_0 == stackIn_71_1) {
                                        ((ee) this).field_o = ((ee) this).field_o + 1;
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
                                      if (((ee) this).field_w.c(-21)) {
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
                                      if (((ee) this).field_h[((ee) this).field_o] != 1) {
                                        wl discarded$6 = this.a(true, 2, ((ee) this).field_o);
                                        break L39;
                                      } else {
                                        break L39;
                                      }
                                    }
                                    L40: {
                                      if (((ee) this).field_h[((ee) this).field_o] != 1) {
                                        var3 = new jb();
                                        var3.field_e = (long)((ee) this).field_o;
                                        var2_int = 0;
                                        ((ee) this).field_j.b(0, var3);
                                        break L40;
                                      } else {
                                        break L40;
                                      }
                                    }
                                    ((ee) this).field_o = ((ee) this).field_o + 1;
                                    if (var5 == 0) {
                                      continue L36;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                            }
                            L41: {
                              if (var2_int == 0) {
                                break L41;
                              } else {
                                ((ee) this).field_f = false;
                                ((ee) this).field_o = 0;
                                break L41;
                              }
                            }
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                      ((ee) this).field_j = null;
                      break L3;
                    }
                  }
                }
                L42: {
                  if (!((ee) this).field_t) {
                    break L42;
                  } else {
                    if (((ee) this).field_c > lo.a((byte) 110)) {
                      break L42;
                    } else {
                      var2_ref = (wl) (Object) ((ee) this).field_g.a((byte) -92);
                      L43: while (true) {
                        L44: {
                          if (null == var2_ref) {
                            break L44;
                          } else {
                            stackOut_103_0 = var2_ref.field_n;
                            stackIn_124_0 = stackOut_103_0 ? 1 : 0;
                            stackIn_104_0 = stackOut_103_0;
                            if (var5 != 0) {
                              break L1;
                            } else {
                              L45: {
                                if (stackIn_104_0) {
                                  break L45;
                                } else {
                                  L46: {
                                    if (var2_ref.field_l) {
                                      break L46;
                                    } else {
                                      var2_ref.field_l = true;
                                      if (var5 == 0) {
                                        break L45;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                  if (!var2_ref.field_q) {
                                    throw new RuntimeException();
                                  } else {
                                    var2_ref.a(false);
                                    break L45;
                                  }
                                }
                              }
                              var2_ref = (wl) (Object) ((ee) this).field_g.a(105);
                              if (var5 == 0) {
                                continue L43;
                              } else {
                                break L44;
                              }
                            }
                          }
                        }
                        ((ee) this).field_c = 1000L + lo.a((byte) -30);
                        break L42;
                      }
                    }
                  }
                }
                stackOut_122_0 = -100;
                stackOut_122_1 = (param0 - -13) / 37;
                stackIn_123_0 = stackOut_122_0;
                stackIn_123_1 = stackOut_122_1;
                break L2;
              }
              stackOut_123_0 = stackIn_123_0 / stackIn_123_1;
              stackIn_124_0 = stackOut_123_0;
              break L1;
            }
            var2_int = stackIn_124_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "ee.I(" + param0 + ')');
        }
    }

    final static wj a(db param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wj stackIn_4_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        wj stackOut_3_0 = null;
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
        try {
          L0: {
            L1: {
              var4_int = param0.a(param1, -1);
              var5 = param0.a(-2862, param3, var4_int);
              if (param2 < -14) {
                break L1;
              } else {
                field_m = null;
                break L1;
              }
            }
            stackOut_3_0 = v.a(28297, var4_int, var5, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ee.K(");
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
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');
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
          throw dn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    final int a(int param0, int param1) {
        wl var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              var3 = (wl) (Object) ((ee) this).field_g.a((long)param0, 0);
              if (param1 == 486289953) {
                break L1;
              } else {
                ((ee) this).e(-120);
                break L1;
              }
            }
            if (var3 != null) {
              stackOut_6_0 = var3.b((byte) 95);
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
          throw dn.a((Throwable) (Object) var3_ref, "ee.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final byte[] a(int param0, boolean param1) {
        wl var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        byte[] stackOut_8_0 = null;
        try {
          L0: {
            L1: {
              var3 = this.a(true, 0, param0);
              if (!param1) {
                break L1;
              } else {
                ((ee) this).field_c = -78L;
                break L1;
              }
            }
            if (null == var3) {
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (byte[]) (Object) stackIn_7_0;
            } else {
              var4 = var3.e(-27);
              var3.a(param1);
              stackOut_8_0 = (byte[]) var4;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var3_ref, "ee.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    public static void d(int param0) {
        try {
            field_q = null;
            field_m = null;
            if (param0 != 0) {
                ee.d(-92);
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ee.H(" + param0 + ')');
        }
    }

    private final wl a(boolean param0, int param1, int param2) {
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
        Object stackIn_44_0 = null;
        Object stackIn_55_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        Object stackIn_100_0 = null;
        Object stackIn_102_0 = null;
        Object stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        Object stackIn_105_0 = null;
        Object stackIn_114_0 = null;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        Object stackIn_141_0 = null;
        Object stackIn_143_0 = null;
        Object stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        Object stackIn_150_0 = null;
        int stackIn_154_0 = 0;
        int stackIn_154_1 = 0;
        Object stackIn_161_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_54_0 = null;
        Object stackOut_43_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        Object stackOut_140_0 = null;
        Object stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        Object stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        Object stackOut_149_0 = null;
        int stackOut_152_0 = 0;
        byte stackOut_152_1 = 0;
        Object stackOut_160_0 = null;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        Object stackOut_99_0 = null;
        Object stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        Object stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        Object stackOut_104_0 = null;
        Object stackOut_113_0 = null;
        var10 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var4 = (Object) (Object) (wl) (Object) ((ee) this).field_g.a((long)param2, 0);
              if (var4 == null) {
                break L1;
              } else {
                if (param1 != 0) {
                  break L1;
                } else {
                  if (((wl) var4).field_q) {
                    break L1;
                  } else {
                    if (((wl) var4).field_n) {
                      ((wl) var4).a(false);
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
              if (param0) {
                break L2;
              } else {
                qg discarded$2 = ((ee) this).a(-107);
                break L2;
              }
            }
            L3: {
              if (var4 != null) {
                break L3;
              } else {
                L4: {
                  if (0 == param1) {
                    L5: {
                      if (((ee) this).field_l == null) {
                        break L5;
                      } else {
                        if (((ee) this).field_h[param2] == -1) {
                          break L5;
                        } else {
                          var4 = (Object) (Object) ((ee) this).field_v.a(param0, param2, ((ee) this).field_l);
                          if (var10 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (((ee) this).field_w.c((byte) -123)) {
                        break L6;
                      } else {
                        var4 = (Object) (Object) ((ee) this).field_w.a(true, 18303, param2, ((ee) this).field_r, (byte) 2);
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackOut_54_0 = null;
                    stackIn_55_0 = stackOut_54_0;
                    return (wl) (Object) stackIn_55_0;
                  } else {
                    L7: {
                      if (1 != param1) {
                        break L7;
                      } else {
                        if (null != ((ee) this).field_l) {
                          var4 = (Object) (Object) ((ee) this).field_v.a(-4, param2, ((ee) this).field_l);
                          if (var10 == 0) {
                            break L4;
                          } else {
                            break L7;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                    if (param1 == 2) {
                      if (((ee) this).field_l != null) {
                        if (((ee) this).field_h[param2] == -1) {
                          L8: {
                            if (((ee) this).field_w.c(-21)) {
                              break L8;
                            } else {
                              var4 = (Object) (Object) ((ee) this).field_w.a(false, 18303, param2, ((ee) this).field_r, (byte) 2);
                              if (var10 == 0) {
                                break L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                          stackOut_43_0 = null;
                          stackIn_44_0 = stackOut_43_0;
                          return (wl) (Object) stackIn_44_0;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
                ((ee) this).field_g.a(-22072, (long)param2, (jb) var4);
                break L3;
              }
            }
            if (((wl) var4).field_n) {
              stackOut_60_0 = null;
              stackIn_61_0 = stackOut_60_0;
              return (wl) (Object) stackIn_61_0;
            } else {
              var5 = ((wl) var4).e(-5);
              if (!(var4 instanceof mf)) {
                try {
                  L9: {
                    L10: {
                      if (null == var5) {
                        break L10;
                      } else {
                        if (var5.length <= 2) {
                          break L10;
                        } else {
                          sj.field_b.reset();
                          sj.field_b.update(var5, 0, -2 + var5.length);
                          var6_int = (int)sj.field_b.getValue();
                          if (~var6_int == ~((ee) this).field_p.field_n[param2]) {
                            L11: {
                              if (((ee) this).field_p.field_m == null) {
                                break L11;
                              } else {
                                if (((ee) this).field_p.field_m[param2] == null) {
                                  break L11;
                                } else {
                                  var7 = ((ee) this).field_p.field_m[param2];
                                  var8 = ac.a(var5, 0, -2 + var5.length, (byte) -127);
                                  var9 = 0;
                                  L12: while (true) {
                                    if (var9 >= 64) {
                                      break L11;
                                    } else {
                                      stackOut_131_0 = ~var7[var9];
                                      stackOut_131_1 = ~var8[var9];
                                      stackIn_154_0 = stackOut_131_0;
                                      stackIn_154_1 = stackOut_131_1;
                                      stackIn_132_0 = stackOut_131_0;
                                      stackIn_132_1 = stackOut_131_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L9;
                                      } else {
                                        if (stackIn_132_0 == stackIn_132_1) {
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
                            ((ee) this).field_w.field_j = 0;
                            ((ee) this).field_w.field_p = 0;
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
                    ((ee) this).field_w.e(20406);
                    stackOut_140_0 = var4;
                    stackIn_143_0 = stackOut_140_0;
                    stackIn_141_0 = stackOut_140_0;
                    if (param0) {
                      stackOut_143_0 = stackIn_143_0;
                      stackOut_143_1 = 0;
                      stackIn_144_0 = stackOut_143_0;
                      stackIn_144_1 = stackOut_143_1;
                      break L13;
                    } else {
                      stackOut_141_0 = stackIn_141_0;
                      stackOut_141_1 = 1;
                      stackIn_144_0 = stackOut_141_0;
                      stackIn_144_1 = stackOut_141_1;
                      break L13;
                    }
                  }
                  L14: {
                    ((wl) (Object) stackIn_144_0).a(stackIn_144_1 != 0);
                    if (((wl) var4).field_q) {
                      if (((ee) this).field_w.c((byte) -73)) {
                        break L14;
                      } else {
                        var4 = (Object) (Object) ((ee) this).field_w.a(true, 18303, param2, ((ee) this).field_r, (byte) 2);
                        ((ee) this).field_g.a(-22072, (long)param2, (jb) var4);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  stackOut_149_0 = null;
                  stackIn_150_0 = stackOut_149_0;
                  return (wl) (Object) stackIn_150_0;
                }
                L15: {
                  L16: {
                    if (decompiledRegionSelector0 == 0) {
                      break L16;
                    } else {
                      var5[var5.length - 2] = (byte)(((ee) this).field_p.field_g[param2] >>> -924599608);
                      var5[var5.length + -1] = (byte)((ee) this).field_p.field_g[param2];
                      if (null == ((ee) this).field_l) {
                        break L15;
                      } else {
                        mf discarded$3 = ((ee) this).field_v.a(param2, ((ee) this).field_l, var5, (byte) 116);
                        stackOut_152_0 = 1;
                        stackOut_152_1 = ((ee) this).field_h[param2];
                        stackIn_154_0 = stackOut_152_0;
                        stackIn_154_1 = stackOut_152_1;
                        break L16;
                      }
                    }
                  }
                  if (stackIn_154_0 == stackIn_154_1) {
                    break L15;
                  } else {
                    ((ee) this).field_h[param2] = (byte) 1;
                    break L15;
                  }
                }
                L17: {
                  if (((wl) var4).field_q) {
                    break L17;
                  } else {
                    ((wl) var4).a(false);
                    break L17;
                  }
                }
                stackOut_160_0 = var4;
                stackIn_161_0 = stackOut_160_0;
                break L0;
              } else {
                try {
                  L18: {
                    L19: {
                      if (var5 == null) {
                        break L19;
                      } else {
                        if (2 >= var5.length) {
                          break L19;
                        } else {
                          sj.field_b.reset();
                          sj.field_b.update(var5, 0, -2 + var5.length);
                          var6_int = (int)sj.field_b.getValue();
                          if (((ee) this).field_p.field_n[param2] == var6_int) {
                            L20: {
                              L21: {
                                if (null == ((ee) this).field_p.field_m) {
                                  break L21;
                                } else {
                                  if (null == ((ee) this).field_p.field_m[param2]) {
                                    break L21;
                                  } else {
                                    var7 = ((ee) this).field_p.field_m[param2];
                                    var8 = ac.a(var5, 0, -2 + var5.length, (byte) -127);
                                    var9 = 0;
                                    L22: while (true) {
                                      if (64 <= var9) {
                                        break L21;
                                      } else {
                                        stackOut_79_0 = ~var7[var9];
                                        stackOut_79_1 = ~var8[var9];
                                        stackIn_87_0 = stackOut_79_0;
                                        stackIn_87_1 = stackOut_79_1;
                                        stackIn_80_0 = stackOut_79_0;
                                        stackIn_80_1 = stackOut_79_1;
                                        if (var10 != 0) {
                                          break L20;
                                        } else {
                                          if (stackIn_80_0 != stackIn_80_1) {
                                            throw new RuntimeException();
                                          } else {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L22;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_86_0 = 65280 & var5[var5.length - 2] << 1096407912;
                              stackOut_86_1 = -(var5[var5.length - 1] & 255);
                              stackIn_87_0 = stackOut_86_0;
                              stackIn_87_1 = stackOut_86_1;
                              break L20;
                            }
                            var7_int = stackIn_87_0 - stackIn_87_1;
                            if (var7_int != (((ee) this).field_p.field_g[param2] & 65535)) {
                              throw new RuntimeException();
                            } else {
                              L23: {
                                if (((ee) this).field_h[param2] != 1) {
                                  L24: {
                                    if (((ee) this).field_h[param2] == 0) {
                                      break L24;
                                    } else {
                                      break L24;
                                    }
                                  }
                                  ((ee) this).field_h[param2] = (byte) 1;
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              L25: {
                                if (!((wl) var4).field_q) {
                                  L26: {
                                    stackOut_99_0 = var4;
                                    stackIn_102_0 = stackOut_99_0;
                                    stackIn_100_0 = stackOut_99_0;
                                    if (param0) {
                                      stackOut_102_0 = stackIn_102_0;
                                      stackOut_102_1 = 0;
                                      stackIn_103_0 = stackOut_102_0;
                                      stackIn_103_1 = stackOut_102_1;
                                      break L26;
                                    } else {
                                      stackOut_100_0 = stackIn_100_0;
                                      stackOut_100_1 = 1;
                                      stackIn_103_0 = stackOut_100_0;
                                      stackIn_103_1 = stackOut_100_1;
                                      break L26;
                                    }
                                  }
                                  ((wl) (Object) stackIn_103_0).a(stackIn_103_1 != 0);
                                  break L25;
                                } else {
                                  break L25;
                                }
                              }
                              stackOut_104_0 = var4;
                              stackIn_105_0 = stackOut_104_0;
                              break L18;
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
                  L27: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    ((ee) this).field_h[param2] = (byte) -1;
                    ((wl) var4).a(false);
                    if (((wl) var4).field_q) {
                      if (!((ee) this).field_w.c((byte) -72)) {
                        var4 = (Object) (Object) ((ee) this).field_w.a(true, 18303, param2, ((ee) this).field_r, (byte) 2);
                        ((ee) this).field_g.a(-22072, (long)param2, (jb) var4);
                        break L27;
                      } else {
                        break L27;
                      }
                    } else {
                      break L27;
                    }
                  }
                  stackOut_113_0 = null;
                  stackIn_114_0 = stackOut_113_0;
                  return (wl) (Object) stackIn_114_0;
                }
                return (wl) (Object) stackIn_105_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw dn.a((Throwable) var4, "ee.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (wl) (Object) stackIn_161_0;
    }

    final qg a(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        qg stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_55_0 = null;
        qg stackIn_60_0 = null;
        RuntimeException decompiledCaughtException = null;
        qg stackOut_4_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_54_0 = null;
        qg stackOut_59_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_7_0 = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            if (null != ((ee) this).field_p) {
              stackOut_4_0 = ((ee) this).field_p;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (param0 == 630779105) {
                L1: {
                  if (((ee) this).field_k != null) {
                    break L1;
                  } else {
                    if (((ee) this).field_w.c((byte) -54)) {
                      stackOut_15_0 = null;
                      stackIn_16_0 = stackOut_15_0;
                      return (qg) (Object) stackIn_16_0;
                    } else {
                      ((ee) this).field_k = (wl) (Object) ((ee) this).field_w.a(true, 18303, ((ee) this).field_r, 255, (byte) 0);
                      break L1;
                    }
                  }
                }
                if (!((ee) this).field_k.field_n) {
                  L2: {
                    L3: {
                      var2_array = ((ee) this).field_k.e(115);
                      if (((ee) this).field_k instanceof mf) {
                        break L3;
                      } else {
                        try {
                          L4: {
                            if (null == var2_array) {
                              throw new RuntimeException();
                            } else {
                              ((ee) this).field_p = new qg(var2_array, ((ee) this).field_u, ((ee) this).field_x);
                              break L4;
                            }
                          }
                        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L5: {
                            L6: {
                              var3 = decompiledCaughtException;
                              ((ee) this).field_w.e(20406);
                              ((ee) this).field_p = null;
                              if (!((ee) this).field_w.c((byte) -82)) {
                                break L6;
                              } else {
                                ((ee) this).field_k = null;
                                if (var4 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            ((ee) this).field_k = (wl) (Object) ((ee) this).field_w.a(true, 18303, ((ee) this).field_r, 255, (byte) 0);
                            break L5;
                          }
                          stackOut_34_0 = null;
                          stackIn_35_0 = stackOut_34_0;
                          return (qg) (Object) stackIn_35_0;
                        }
                        if (null == ((ee) this).field_i) {
                          break L2;
                        } else {
                          mf discarded$1 = ((ee) this).field_v.a(((ee) this).field_r, ((ee) this).field_i, var2_array, (byte) 116);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    try {
                      L7: {
                        if (var2_array != null) {
                          ((ee) this).field_p = new qg(var2_array, ((ee) this).field_u, ((ee) this).field_x);
                          if (~((ee) this).field_s != ~((ee) this).field_p.field_r) {
                            throw new RuntimeException();
                          } else {
                            break L7;
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
                          ((ee) this).field_p = null;
                          if (((ee) this).field_w.c((byte) -90)) {
                            break L9;
                          } else {
                            ((ee) this).field_k = (wl) (Object) ((ee) this).field_w.a(true, 18303, ((ee) this).field_r, 255, (byte) 0);
                            if (var4 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ((ee) this).field_k = null;
                        break L8;
                      }
                      stackOut_54_0 = null;
                      stackIn_55_0 = stackOut_54_0;
                      return (qg) (Object) stackIn_55_0;
                    }
                    break L2;
                  }
                  L10: {
                    if (null == ((ee) this).field_l) {
                      break L10;
                    } else {
                      ((ee) this).field_h = new byte[((ee) this).field_p.field_a];
                      break L10;
                    }
                  }
                  ((ee) this).field_k = null;
                  stackOut_59_0 = ((ee) this).field_p;
                  stackIn_60_0 = stackOut_59_0;
                  break L0;
                } else {
                  stackOut_19_0 = null;
                  stackIn_20_0 = stackOut_19_0;
                  return (qg) (Object) stackIn_20_0;
                }
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (qg) (Object) stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "ee.C(" + param0 + ')');
        }
        return stackIn_60_0;
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        jb var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            if (null == ((ee) this).field_j) {
              return;
            } else {
              L1: {
                if (param0 >= 112) {
                  break L1;
                } else {
                  ((ee) this).field_h = null;
                  break L1;
                }
              }
              if (((ee) this).a(630779105) != null) {
                var2_ref = ((ee) this).field_n.g(32073);
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
                                  if (((ee) this).field_p.field_a <= var3) {
                                    break L7;
                                  } else {
                                    if (((ee) this).field_p.field_f[var3] == 0) {
                                      break L7;
                                    } else {
                                      break L6;
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
                              if (0 == ((ee) this).field_h[var3]) {
                                wl discarded$2 = this.a(true, 1, var3);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              if (((ee) this).field_h[var3] == -1) {
                                wl discarded$3 = this.a(true, 2, var3);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            if (((ee) this).field_h[var3] == 1) {
                              var2_ref.a(false);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var2_ref = ((ee) this).field_n.a(false);
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
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "ee.M(" + param0 + ')');
        }
    }

    final static boolean a(int[] param0, int param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        mo var4_ref_mo = null;
        int var4 = 0;
        int var5_int = 0;
        mo var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            if (ek.field_h != gj.field_k) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (param1 == 64) {
                L1: {
                  var2_long = lo.a((byte) -98);
                  if (0 == wb.field_d) {
                    break L1;
                  } else {
                    if (sm.field_i < 0) {
                      var4_ref_mo = (mo) (Object) bn.field_i.g(32073);
                      if (null == var4_ref_mo) {
                        break L1;
                      } else {
                        if (~var4_ref_mo.field_k <= ~var2_long) {
                          break L1;
                        } else {
                          var4_ref_mo.a(false);
                          rk.field_b = var4_ref_mo.field_g.length;
                          kd.field_n.field_f = 0;
                          var5_int = 0;
                          L2: while (true) {
                            L3: {
                              L4: {
                                if (rk.field_b <= var5_int) {
                                  break L4;
                                } else {
                                  kd.field_n.field_h[var5_int] = var4_ref_mo.field_g[var5_int];
                                  var5_int++;
                                  if (var7 != 0) {
                                    break L3;
                                  } else {
                                    if (var7 == 0) {
                                      continue L2;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                              fl.field_m = ea.field_n;
                              ea.field_n = qn.field_u;
                              qn.field_u = bf.field_b;
                              bf.field_b = var4_ref_mo.field_j;
                              break L3;
                            }
                            stackOut_26_0 = 1;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0 != 0;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                L5: while (true) {
                  L6: {
                    if (sm.field_i < 0) {
                      kd.field_n.field_f = 0;
                      if (!fq.a(1, (byte) 104)) {
                        stackOut_33_0 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        return stackIn_34_0 != 0;
                      } else {
                        sm.field_i = kd.field_n.e(true);
                        kd.field_n.field_f = 0;
                        rk.field_b = param0[sm.field_i];
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  if (ol.f((byte) 60)) {
                    L7: {
                      if (wb.field_d == 0) {
                        break L7;
                      } else {
                        L8: {
                          var4 = wb.field_d;
                          if (0.0 == kk.field_b) {
                            break L8;
                          } else {
                            var4 = (int)((double)var4 + og.field_w.nextGaussian() * kk.field_b);
                            if (var4 >= 0) {
                              break L8;
                            } else {
                              var4 = 0;
                              break L8;
                            }
                          }
                        }
                        var5 = new mo((long)var4 + var2_long, sm.field_i, new byte[rk.field_b]);
                        var6 = 0;
                        L9: while (true) {
                          L10: {
                            L11: {
                              if (var6 >= rk.field_b) {
                                break L11;
                              } else {
                                var5.field_g[var6] = kd.field_n.field_h[var6];
                                var6++;
                                if (var7 != 0) {
                                  break L10;
                                } else {
                                  if (var7 == 0) {
                                    continue L9;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            bn.field_i.b(param1 ^ 64, (jb) (Object) var5);
                            sm.field_i = -1;
                            break L10;
                          }
                          if (var7 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    fl.field_m = ea.field_n;
                    ea.field_n = qn.field_u;
                    qn.field_u = bf.field_b;
                    bf.field_b = sm.field_i;
                    sm.field_i = -1;
                    stackOut_51_0 = 1;
                    stackIn_52_0 = stackOut_51_0;
                    break L0;
                  } else {
                    stackOut_37_0 = 0;
                    stackIn_38_0 = stackOut_37_0;
                    return stackIn_38_0 != 0;
                  }
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var2;
            stackOut_53_1 = new StringBuilder().append("ee.G(");
            stackIn_56_0 = stackOut_53_0;
            stackIn_56_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param0 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L12;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_57_0 = stackOut_54_0;
              stackIn_57_1 = stackOut_54_1;
              stackIn_57_2 = stackOut_54_2;
              break L12;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + ',' + param1 + ')');
        }
        return stackIn_52_0 != 0;
    }

    final void b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((ee) this).field_l != null) {
              L1: {
                ((ee) this).field_f = true;
                if (((ee) this).field_j == null) {
                  ((ee) this).field_j = new wb();
                  break L1;
                } else {
                  break L1;
                }
              }
              var2_int = 42 % ((param0 - 7) / 45);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "ee.J(" + param0 + ')');
        }
    }

    ee(int param0, sp param1, sp param2, ob param3, ni param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((ee) this).field_g = new fc(16);
        ((ee) this).field_o = 0;
        ((ee) this).field_n = new wb();
        ((ee) this).field_c = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((ee) this).field_l = param1;
                ((ee) this).field_r = param0;
                if (null == ((ee) this).field_l) {
                  break L2;
                } else {
                  ((ee) this).field_d = true;
                  ((ee) this).field_j = new wb();
                  if (CrazyCrystals.field_B == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ee) this).field_d = false;
              break L1;
            }
            L3: {
              ((ee) this).field_s = param7;
              ((ee) this).field_i = param2;
              ((ee) this).field_w = param3;
              ((ee) this).field_t = param8;
              ((ee) this).field_u = param5;
              ((ee) this).field_v = param4;
              ((ee) this).field_x = param6;
              if (null == ((ee) this).field_i) {
                break L3;
              } else {
                ((ee) this).field_k = (wl) (Object) ((ee) this).field_v.a(true, ((ee) this).field_r, ((ee) this).field_i);
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
            stackOut_9_1 = new StringBuilder().append("ee.<init>(").append(param0).append(',');
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
          throw dn.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Login: ";
    }
}
