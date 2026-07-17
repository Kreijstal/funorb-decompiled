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
        wl var2_ref_wl = null;
        int var2 = 0;
        jb var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        byte stackIn_8_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_38_0 = 0;
        byte stackIn_38_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        boolean stackIn_71_0 = false;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_83_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        int stackOut_7_0 = 0;
        byte stackOut_7_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        int stackOut_37_0 = 0;
        byte stackOut_37_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        boolean stackOut_70_0 = false;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_82_0 = 0;
        L0: {
          L1: {
            L2: {
              var5 = CrazyCrystals.field_B;
              if (((ee) this).field_j == null) {
                break L2;
              } else {
                if (((ee) this).a(630779105) == null) {
                  return;
                } else {
                  L3: {
                    if (!((ee) this).field_d) {
                      break L3;
                    } else {
                      var2 = 1;
                      var3 = ((ee) this).field_j.g(32073);
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var3 == null) {
                              break L6;
                            } else {
                              var4 = (int)var3.field_e;
                              stackOut_7_0 = 0;
                              stackOut_7_1 = ((ee) this).field_h[var4];
                              stackIn_17_0 = stackOut_7_0;
                              stackIn_17_1 = stackOut_7_1;
                              stackIn_8_0 = stackOut_7_0;
                              stackIn_8_1 = stackOut_7_1;
                              if (var5 != 0) {
                                L7: while (true) {
                                  if (stackIn_17_0 >= stackIn_17_1) {
                                    break L5;
                                  } else {
                                    stackOut_18_0 = -1;
                                    stackOut_18_1 = ~((ee) this).field_p.field_f[((ee) this).field_o];
                                    stackIn_82_0 = stackOut_18_0;
                                    stackIn_82_1 = stackOut_18_1;
                                    stackIn_19_0 = stackOut_18_0;
                                    stackIn_19_1 = stackOut_18_1;
                                    if (var5 != 0) {
                                      break L1;
                                    } else {
                                      L8: {
                                        L9: {
                                          if (stackIn_19_0 == stackIn_19_1) {
                                            ((ee) this).field_o = ((ee) this).field_o + 1;
                                            if (var5 == 0) {
                                              break L8;
                                            } else {
                                              break L9;
                                            }
                                          } else {
                                            break L9;
                                          }
                                        }
                                        L10: {
                                          if (((ee) this).field_v.field_c < 250) {
                                            break L10;
                                          } else {
                                            var2 = 0;
                                            if (var5 == 0) {
                                              break L5;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        L11: {
                                          if (((ee) this).field_h[((ee) this).field_o] == 0) {
                                            wl discarded$6 = this.a(true, 1, ((ee) this).field_o);
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          if (((ee) this).field_h[((ee) this).field_o] == 0) {
                                            var3 = new jb();
                                            var3.field_e = (long)((ee) this).field_o;
                                            var2 = 0;
                                            ((ee) this).field_j.b(0, var3);
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        ((ee) this).field_o = ((ee) this).field_o + 1;
                                        if (var5 == 0) {
                                          break L8;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      stackOut_16_0 = ((ee) this).field_o;
                                      stackOut_16_1 = ((ee) this).field_p.field_f.length;
                                      stackIn_17_0 = stackOut_16_0;
                                      stackIn_17_1 = stackOut_16_1;
                                      continue L7;
                                    }
                                  }
                                }
                              } else {
                                L13: {
                                  if (stackIn_8_0 != stackIn_8_1) {
                                    break L13;
                                  } else {
                                    wl discarded$7 = this.a(true, 1, var4);
                                    break L13;
                                  }
                                }
                                L14: {
                                  L15: {
                                    if (0 == ((ee) this).field_h[var4]) {
                                      break L15;
                                    } else {
                                      var3.a(false);
                                      if (var5 == 0) {
                                        break L14;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  var2 = 0;
                                  break L14;
                                }
                                var3 = ((ee) this).field_j.a(false);
                                if (var5 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L16: while (true) {
                            stackOut_132_0 = ((ee) this).field_o;
                            stackOut_132_1 = ((ee) this).field_p.field_f.length;
                            stackIn_130_0 = stackOut_132_0;
                            stackIn_130_1 = stackOut_132_1;
                            if (stackIn_130_0 >= stackIn_130_1) {
                              break L5;
                            } else {
                              stackOut_128_0 = -1;
                              stackOut_128_1 = ~((ee) this).field_p.field_f[((ee) this).field_o];
                              stackIn_82_0 = stackOut_128_0;
                              stackIn_82_1 = stackOut_128_1;
                              stackIn_129_0 = stackOut_128_0;
                              stackIn_129_1 = stackOut_128_1;
                              if (var5 != 0) {
                                break L1;
                              } else {
                                stackOut_129_0 = stackIn_129_0;
                                stackOut_129_1 = stackIn_129_1;
                                stackIn_126_0 = stackOut_129_0;
                                stackIn_126_1 = stackOut_129_1;
                                L17: {
                                  if (stackIn_126_0 == stackIn_126_1) {
                                    ((ee) this).field_o = ((ee) this).field_o + 1;
                                    if (var5 == 0) {
                                      continue L16;
                                    } else {
                                      break L17;
                                    }
                                  } else {
                                    break L17;
                                  }
                                }
                                L18: {
                                  if (((ee) this).field_v.field_c < 250) {
                                    break L18;
                                  } else {
                                    var2 = 0;
                                    if (var5 == 0) {
                                      break L5;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                L19: {
                                  if (((ee) this).field_h[((ee) this).field_o] == 0) {
                                    wl discarded$8 = this.a(true, 1, ((ee) this).field_o);
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                L20: {
                                  if (((ee) this).field_h[((ee) this).field_o] == 0) {
                                    var3 = new jb();
                                    var3.field_e = (long)((ee) this).field_o;
                                    var2 = 0;
                                    ((ee) this).field_j.b(0, var3);
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                ((ee) this).field_o = ((ee) this).field_o + 1;
                                if (var5 == 0) {
                                  continue L16;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        L21: {
                          if (var2 == 0) {
                            break L21;
                          } else {
                            ((ee) this).field_o = 0;
                            ((ee) this).field_d = false;
                            break L21;
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
                  L22: {
                    if (!((ee) this).field_f) {
                      break L22;
                    } else {
                      var2 = 1;
                      var3 = ((ee) this).field_j.g(32073);
                      L23: while (true) {
                        L24: {
                          L25: {
                            if (var3 == null) {
                              break L25;
                            } else {
                              var4 = (int)var3.field_e;
                              stackOut_37_0 = 1;
                              stackOut_37_1 = ((ee) this).field_h[var4];
                              stackIn_47_0 = stackOut_37_0;
                              stackIn_47_1 = stackOut_37_1;
                              stackIn_38_0 = stackOut_37_0;
                              stackIn_38_1 = stackOut_37_1;
                              if (var5 != 0) {
                                L26: while (true) {
                                  if (stackIn_47_0 >= stackIn_47_1) {
                                    break L24;
                                  } else {
                                    stackOut_48_0 = 0;
                                    stackOut_48_1 = ((ee) this).field_p.field_f[((ee) this).field_o];
                                    stackIn_82_0 = stackOut_48_0;
                                    stackIn_82_1 = stackOut_48_1;
                                    stackIn_49_0 = stackOut_48_0;
                                    stackIn_49_1 = stackOut_48_1;
                                    if (var5 != 0) {
                                      break L1;
                                    } else {
                                      L27: {
                                        L28: {
                                          if (stackIn_49_0 == stackIn_49_1) {
                                            ((ee) this).field_o = ((ee) this).field_o + 1;
                                            if (var5 == 0) {
                                              break L27;
                                            } else {
                                              break L28;
                                            }
                                          } else {
                                            break L28;
                                          }
                                        }
                                        L29: {
                                          if (((ee) this).field_w.c(-21)) {
                                            var2 = 0;
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
                                          if (((ee) this).field_h[((ee) this).field_o] != 1) {
                                            wl discarded$9 = this.a(true, 2, ((ee) this).field_o);
                                            break L30;
                                          } else {
                                            break L30;
                                          }
                                        }
                                        L31: {
                                          if (((ee) this).field_h[((ee) this).field_o] != 1) {
                                            var3 = new jb();
                                            var3.field_e = (long)((ee) this).field_o;
                                            var2 = 0;
                                            ((ee) this).field_j.b(0, var3);
                                            break L31;
                                          } else {
                                            break L31;
                                          }
                                        }
                                        ((ee) this).field_o = ((ee) this).field_o + 1;
                                        if (var5 == 0) {
                                          break L27;
                                        } else {
                                          break L24;
                                        }
                                      }
                                      stackOut_46_0 = ((ee) this).field_o;
                                      stackOut_46_1 = ((ee) this).field_p.field_f.length;
                                      stackIn_47_0 = stackOut_46_0;
                                      stackIn_47_1 = stackOut_46_1;
                                      continue L26;
                                    }
                                  }
                                }
                              } else {
                                L32: {
                                  if (stackIn_38_0 != stackIn_38_1) {
                                    wl discarded$10 = this.a(true, 2, var4);
                                    break L32;
                                  } else {
                                    break L32;
                                  }
                                }
                                L33: {
                                  L34: {
                                    if (((ee) this).field_h[var4] == 1) {
                                      break L34;
                                    } else {
                                      var2 = 0;
                                      if (var5 == 0) {
                                        break L33;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                  var3.a(false);
                                  break L33;
                                }
                                var3 = ((ee) this).field_j.a(false);
                                if (var5 == 0) {
                                  continue L23;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          L35: while (true) {
                            stackOut_108_0 = ((ee) this).field_o;
                            stackOut_108_1 = ((ee) this).field_p.field_f.length;
                            stackIn_106_0 = stackOut_108_0;
                            stackIn_106_1 = stackOut_108_1;
                            if (stackIn_106_0 >= stackIn_106_1) {
                              break L24;
                            } else {
                              stackOut_104_0 = 0;
                              stackOut_104_1 = ((ee) this).field_p.field_f[((ee) this).field_o];
                              stackIn_82_0 = stackOut_104_0;
                              stackIn_82_1 = stackOut_104_1;
                              stackIn_105_0 = stackOut_104_0;
                              stackIn_105_1 = stackOut_104_1;
                              if (var5 != 0) {
                                break L1;
                              } else {
                                stackOut_105_0 = stackIn_105_0;
                                stackOut_105_1 = stackIn_105_1;
                                stackIn_102_0 = stackOut_105_0;
                                stackIn_102_1 = stackOut_105_1;
                                L36: {
                                  if (stackIn_102_0 == stackIn_102_1) {
                                    ((ee) this).field_o = ((ee) this).field_o + 1;
                                    if (var5 == 0) {
                                      continue L35;
                                    } else {
                                      break L36;
                                    }
                                  } else {
                                    break L36;
                                  }
                                }
                                L37: {
                                  if (((ee) this).field_w.c(-21)) {
                                    var2 = 0;
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
                                  if (((ee) this).field_h[((ee) this).field_o] != 1) {
                                    wl discarded$11 = this.a(true, 2, ((ee) this).field_o);
                                    break L38;
                                  } else {
                                    break L38;
                                  }
                                }
                                L39: {
                                  if (((ee) this).field_h[((ee) this).field_o] != 1) {
                                    var3 = new jb();
                                    var3.field_e = (long)((ee) this).field_o;
                                    var2 = 0;
                                    ((ee) this).field_j.b(0, var3);
                                    break L39;
                                  } else {
                                    break L39;
                                  }
                                }
                                ((ee) this).field_o = ((ee) this).field_o + 1;
                                if (var5 == 0) {
                                  continue L35;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
                        }
                        L40: {
                          if (var2 == 0) {
                            break L40;
                          } else {
                            ((ee) this).field_f = false;
                            ((ee) this).field_o = 0;
                            break L40;
                          }
                        }
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                  ((ee) this).field_j = null;
                  break L2;
                }
              }
            }
            L41: {
              if (!((ee) this).field_t) {
                break L41;
              } else {
                if (((ee) this).field_c > lo.a((byte) 110)) {
                  break L41;
                } else {
                  var2_ref_wl = (wl) (Object) ((ee) this).field_g.a((byte) -92);
                  L42: while (true) {
                    L43: {
                      if (var2_ref_wl == null) {
                        break L43;
                      } else {
                        stackOut_70_0 = var2_ref_wl.field_n;
                        stackIn_83_0 = stackOut_70_0 ? 1 : 0;
                        stackIn_71_0 = stackOut_70_0;
                        if (var5 != 0) {
                          break L0;
                        } else {
                          L44: {
                            if (stackIn_71_0) {
                              break L44;
                            } else {
                              L45: {
                                if (var2_ref_wl.field_l) {
                                  break L45;
                                } else {
                                  var2_ref_wl.field_l = true;
                                  if (var5 == 0) {
                                    break L44;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                              if (!var2_ref_wl.field_q) {
                                throw new RuntimeException();
                              } else {
                                var2_ref_wl.a(false);
                                break L44;
                              }
                            }
                          }
                          var2_ref_wl = (wl) (Object) ((ee) this).field_g.a(105);
                          if (var5 == 0) {
                            continue L42;
                          } else {
                            break L43;
                          }
                        }
                      }
                    }
                    ((ee) this).field_c = 1000L + lo.a((byte) -30);
                    break L41;
                  }
                }
              }
            }
            stackOut_81_0 = -100;
            stackOut_81_1 = (param0 - -13) / 37;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            break L1;
          }
          stackOut_82_0 = stackIn_82_0 / stackIn_82_1;
          stackIn_83_0 = stackOut_82_0;
          break L0;
        }
        var2 = stackIn_83_0;
    }

    final static wj a(db param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        wj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
            stackOut_2_0 = v.a(28297, var4_int, var5, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ee.K(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    final int a(int param0, int param1) {
        wl var3 = null;
        L0: {
          var3 = (wl) (Object) ((ee) this).field_g.a((long)param0, 0);
          if (param1 == 486289953) {
            break L0;
          } else {
            ((ee) this).e(-120);
            break L0;
          }
        }
        if (var3 == null) {
          return 0;
        } else {
          return var3.b((byte) 95);
        }
    }

    final byte[] a(int param0, boolean param1) {
        wl var3 = null;
        byte[] var4 = null;
        L0: {
          var3 = this.a(true, 0, param0);
          if (!param1) {
            break L0;
          } else {
            ((ee) this).field_c = -78L;
            break L0;
          }
        }
        if (var3 == null) {
          return null;
        } else {
          var4 = var3.e(-27);
          var3.a(param1);
          return var4;
        }
    }

    public static void d(int param0) {
        field_q = null;
        field_m = null;
        ee.d(-92);
    }

    private final wl a(boolean param0, int param1, int param2) {
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
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        Object stackIn_65_0 = null;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        Object stackIn_89_0 = null;
        Object stackIn_90_0 = null;
        Object stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        Object stackOut_88_0 = null;
        Object stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        Object stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_99_0 = 0;
        byte stackOut_99_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        Object stackOut_60_0 = null;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        Object stackOut_64_0 = null;
        L0: {
          var10 = CrazyCrystals.field_B;
          var4 = (Object) (Object) (wl) (Object) ((ee) this).field_g.a((long)param2, 0);
          if (var4 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              if (((wl) var4).field_q) {
                break L0;
              } else {
                if (((wl) var4).field_n) {
                  ((wl) var4).a(false);
                  var4 = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (param0) {
            break L1;
          } else {
            qg discarded$2 = ((ee) this).a(-107);
            break L1;
          }
        }
        L2: {
          if (var4 != null) {
            break L2;
          } else {
            L3: {
              if (0 == param1) {
                L4: {
                  if (((ee) this).field_l == null) {
                    break L4;
                  } else {
                    if (((ee) this).field_h[param2] == -1) {
                      break L4;
                    } else {
                      var4 = (Object) (Object) ((ee) this).field_v.a(param0, param2, ((ee) this).field_l);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (!((ee) this).field_w.c((byte) -123)) {
                  var4 = (Object) (Object) ((ee) this).field_w.a(true, 18303, param2, ((ee) this).field_r, (byte) 2);
                  if (var10 == 0) {
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                L5: {
                  if (1 != param1) {
                    break L5;
                  } else {
                    if (null != ((ee) this).field_l) {
                      var4 = (Object) (Object) ((ee) this).field_v.a(-4, param2, ((ee) this).field_l);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
                if (param1 == 2) {
                  if (((ee) this).field_l != null) {
                    if (((ee) this).field_h[param2] == -1) {
                      if (!((ee) this).field_w.c(-21)) {
                        var4 = (Object) (Object) ((ee) this).field_w.a(false, 18303, param2, ((ee) this).field_r, (byte) 2);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          return null;
                        }
                      } else {
                        return null;
                      }
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
            break L2;
          }
        }
        if (!((wl) var4).field_n) {
          var5 = ((wl) var4).e(-5);
          if (!(var4 instanceof mf)) {
            try {
              L6: {
                L7: {
                  if (var5 == null) {
                    break L7;
                  } else {
                    if (var5.length <= 2) {
                      break L7;
                    } else {
                      sj.field_b.reset();
                      sj.field_b.update(var5, 0, -2 + var5.length);
                      var6_int = (int)sj.field_b.getValue();
                      if (var6_int == ((ee) this).field_p.field_n[param2]) {
                        L8: {
                          if (((ee) this).field_p.field_m == null) {
                            break L8;
                          } else {
                            if (((ee) this).field_p.field_m[param2] == null) {
                              break L8;
                            } else {
                              var7 = ((ee) this).field_p.field_m[param2];
                              var8 = ac.a(var5, 0, -2 + var5.length, (byte) -127);
                              var9 = 0;
                              L9: while (true) {
                                if (var9 >= 64) {
                                  break L8;
                                } else {
                                  stackOut_82_0 = ~var7[var9];
                                  stackOut_82_1 = ~var8[var9];
                                  stackIn_100_0 = stackOut_82_0;
                                  stackIn_100_1 = stackOut_82_1;
                                  stackIn_83_0 = stackOut_82_0;
                                  stackIn_83_1 = stackOut_82_1;
                                  if (var10 != 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L6;
                                  } else {
                                    if (stackIn_83_0 == stackIn_83_1) {
                                      var9++;
                                      continue L9;
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
                        break L6;
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
              L10: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                ((ee) this).field_w.e(20406);
                stackOut_88_0 = var4;
                stackIn_90_0 = stackOut_88_0;
                stackIn_89_0 = stackOut_88_0;
                if (param0) {
                  stackOut_90_0 = stackIn_90_0;
                  stackOut_90_1 = 0;
                  stackIn_91_0 = stackOut_90_0;
                  stackIn_91_1 = stackOut_90_1;
                  break L10;
                } else {
                  stackOut_89_0 = stackIn_89_0;
                  stackOut_89_1 = 1;
                  stackIn_91_0 = stackOut_89_0;
                  stackIn_91_1 = stackOut_89_1;
                  break L10;
                }
              }
              ((wl) (Object) stackIn_91_0).a(stackIn_91_1 != 0);
              if (((wl) var4).field_q) {
                if (((ee) this).field_w.c((byte) -73)) {
                  return null;
                } else {
                  var4 = (Object) (Object) ((ee) this).field_w.a(true, 18303, param2, ((ee) this).field_r, (byte) 2);
                  ((ee) this).field_g.a(-22072, (long)param2, (jb) var4);
                  return null;
                }
              } else {
                return null;
              }
            }
            L11: {
              L12: {
                if (decompiledRegionSelector0 == 0) {
                  break L12;
                } else {
                  var5[var5.length - 2] = (byte)(((ee) this).field_p.field_g[param2] >>> 8);
                  var5[var5.length + -1] = (byte)((ee) this).field_p.field_g[param2];
                  if (null == ((ee) this).field_l) {
                    break L11;
                  } else {
                    mf discarded$3 = ((ee) this).field_v.a(param2, ((ee) this).field_l, var5, (byte) 116);
                    stackOut_99_0 = 1;
                    stackOut_99_1 = ((ee) this).field_h[param2];
                    stackIn_100_0 = stackOut_99_0;
                    stackIn_100_1 = stackOut_99_1;
                    break L12;
                  }
                }
              }
              if (stackIn_100_0 == stackIn_100_1) {
                break L11;
              } else {
                ((ee) this).field_h[param2] = (byte) 1;
                break L11;
              }
            }
            L13: {
              if (((wl) var4).field_q) {
                break L13;
              } else {
                ((wl) var4).a(false);
                break L13;
              }
            }
            return (wl) var4;
          } else {
            try {
              L14: {
                L15: {
                  if (var5 == null) {
                    break L15;
                  } else {
                    if (2 >= var5.length) {
                      break L15;
                    } else {
                      sj.field_b.reset();
                      sj.field_b.update(var5, 0, -2 + var5.length);
                      var6_int = (int)sj.field_b.getValue();
                      if (((ee) this).field_p.field_n[param2] == var6_int) {
                        L16: {
                          L17: {
                            if (null == ((ee) this).field_p.field_m) {
                              break L17;
                            } else {
                              if (null == ((ee) this).field_p.field_m[param2]) {
                                break L17;
                              } else {
                                var7 = ((ee) this).field_p.field_m[param2];
                                var8 = ac.a(var5, 0, -2 + var5.length, (byte) -127);
                                var9 = 0;
                                L18: while (true) {
                                  if (64 <= var9) {
                                    break L17;
                                  } else {
                                    stackOut_45_0 = ~var7[var9];
                                    stackOut_45_1 = ~var8[var9];
                                    stackIn_51_0 = stackOut_45_0;
                                    stackIn_51_1 = stackOut_45_1;
                                    stackIn_46_0 = stackOut_45_0;
                                    stackIn_46_1 = stackOut_45_1;
                                    if (var10 != 0) {
                                      break L16;
                                    } else {
                                      if (stackIn_46_0 != stackIn_46_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L18;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_50_0 = 65280 & var5[var5.length - 2] << 8;
                          stackOut_50_1 = -(var5[var5.length - 1] & 255);
                          stackIn_51_0 = stackOut_50_0;
                          stackIn_51_1 = stackOut_50_1;
                          break L16;
                        }
                        var7_int = stackIn_51_0 - stackIn_51_1;
                        if (var7_int != (((ee) this).field_p.field_g[param2] & 65535)) {
                          throw new RuntimeException();
                        } else {
                          L19: {
                            if (((ee) this).field_h[param2] != 1) {
                              L20: {
                                if (((ee) this).field_h[param2] == 0) {
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              ((ee) this).field_h[param2] = (byte) 1;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          L21: {
                            if (!((wl) var4).field_q) {
                              L22: {
                                stackOut_60_0 = var4;
                                stackIn_62_0 = stackOut_60_0;
                                stackIn_61_0 = stackOut_60_0;
                                if (param0) {
                                  stackOut_62_0 = stackIn_62_0;
                                  stackOut_62_1 = 0;
                                  stackIn_63_0 = stackOut_62_0;
                                  stackIn_63_1 = stackOut_62_1;
                                  break L22;
                                } else {
                                  stackOut_61_0 = stackIn_61_0;
                                  stackOut_61_1 = 1;
                                  stackIn_63_0 = stackOut_61_0;
                                  stackIn_63_1 = stackOut_61_1;
                                  break L22;
                                }
                              }
                              ((wl) (Object) stackIn_63_0).a(stackIn_63_1 != 0);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          stackOut_64_0 = var4;
                          stackIn_65_0 = stackOut_64_0;
                          break L14;
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
              L23: {
                var6 = (Exception) (Object) decompiledCaughtException;
                ((ee) this).field_h[param2] = (byte) -1;
                ((wl) var4).a(false);
                if (((wl) var4).field_q) {
                  if (!((ee) this).field_w.c((byte) -72)) {
                    var4 = (Object) (Object) ((ee) this).field_w.a(true, 18303, param2, ((ee) this).field_r, (byte) 2);
                    ((ee) this).field_g.a(-22072, (long)param2, (jb) var4);
                    break L23;
                  } else {
                    break L23;
                  }
                } else {
                  break L23;
                }
              }
              return null;
            }
            return (wl) (Object) stackIn_65_0;
          }
        } else {
          return null;
        }
    }

    final qg a(int param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        if (null != ((ee) this).field_p) {
          return ((ee) this).field_p;
        } else {
          if (param0 == 630779105) {
            L0: {
              if (((ee) this).field_k != null) {
                break L0;
              } else {
                if (!((ee) this).field_w.c((byte) -54)) {
                  ((ee) this).field_k = (wl) (Object) ((ee) this).field_w.a(true, 18303, ((ee) this).field_r, 255, (byte) 0);
                  break L0;
                } else {
                  return null;
                }
              }
            }
            if (!((ee) this).field_k.field_n) {
              L1: {
                L2: {
                  var5 = ((ee) this).field_k.e(115);
                  var2 = var5;
                  if (((ee) this).field_k instanceof mf) {
                    break L2;
                  } else {
                    try {
                      L3: {
                        if (var5 == null) {
                          throw new RuntimeException();
                        } else {
                          ((ee) this).field_p = new qg(var5, ((ee) this).field_u, ((ee) this).field_x);
                          break L3;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var3 = decompiledCaughtException;
                      ((ee) this).field_w.e(20406);
                      ((ee) this).field_p = null;
                      if (((ee) this).field_w.c((byte) -82)) {
                        ((ee) this).field_k = null;
                        if (var4 == 0) {
                          return null;
                        } else {
                          ((ee) this).field_k = (wl) (Object) ((ee) this).field_w.a(true, 18303, ((ee) this).field_r, 255, (byte) 0);
                          return null;
                        }
                      } else {
                        ((ee) this).field_k = (wl) (Object) ((ee) this).field_w.a(true, 18303, ((ee) this).field_r, 255, (byte) 0);
                        return null;
                      }
                    }
                    if (null == ((ee) this).field_i) {
                      break L1;
                    } else {
                      mf discarded$1 = ((ee) this).field_v.a(((ee) this).field_r, ((ee) this).field_i, var5, (byte) 116);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                try {
                  L4: {
                    if (var5 != null) {
                      ((ee) this).field_p = new qg(var5, ((ee) this).field_u, ((ee) this).field_x);
                      if (((ee) this).field_s != ((ee) this).field_p.field_r) {
                        throw new RuntimeException();
                      } else {
                        break L4;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var3 = decompiledCaughtException;
                  ((ee) this).field_p = null;
                  if (!((ee) this).field_w.c((byte) -90)) {
                    ((ee) this).field_k = (wl) (Object) ((ee) this).field_w.a(true, 18303, ((ee) this).field_r, 255, (byte) 0);
                    if (var4 == 0) {
                      return null;
                    } else {
                      ((ee) this).field_k = null;
                      return null;
                    }
                  } else {
                    ((ee) this).field_k = null;
                    return null;
                  }
                }
                break L1;
              }
              L5: {
                if (null == ((ee) this).field_l) {
                  break L5;
                } else {
                  ((ee) this).field_h = new byte[((ee) this).field_p.field_a];
                  break L5;
                }
              }
              ((ee) this).field_k = null;
              return ((ee) this).field_p;
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final void c(int param0) {
        jb var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        if (null == ((ee) this).field_j) {
          return;
        } else {
          L0: {
            if (param0 >= 112) {
              break L0;
            } else {
              ((ee) this).field_h = null;
              break L0;
            }
          }
          if (((ee) this).a(630779105) == null) {
            return;
          } else {
            var2 = ((ee) this).field_n.g(32073);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  var3 = (int)var2.field_e;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 < 0) {
                            break L5;
                          } else {
                            if (((ee) this).field_p.field_a <= var3) {
                              break L5;
                            } else {
                              if (((ee) this).field_p.field_f[var3] == 0) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var2.a(false);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (0 == ((ee) this).field_h[var3]) {
                          wl discarded$2 = this.a(true, 1, var3);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (((ee) this).field_h[var3] == -1) {
                          wl discarded$3 = this.a(true, 2, var3);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (((ee) this).field_h[var3] == 1) {
                        var2.a(false);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var2 = ((ee) this).field_n.a(false);
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

    final static boolean a(int[] param0, int param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        mo var4_ref_mo = null;
        int var4 = 0;
        int var5_int = 0;
        mo var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            if (ek.field_h != gj.field_k) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param1 == 64) {
                L1: {
                  L2: {
                    var2_long = lo.a((byte) -98);
                    if (0 == wb.field_d) {
                      break L2;
                    } else {
                      if (sm.field_i < 0) {
                        L3: {
                          var4_ref_mo = (mo) (Object) bn.field_i.g(32073);
                          if (var4_ref_mo == null) {
                            break L3;
                          } else {
                            if (~var4_ref_mo.field_k <= ~var2_long) {
                              break L3;
                            } else {
                              var4_ref_mo.a(false);
                              rk.field_b = var4_ref_mo.field_g.length;
                              kd.field_n.field_f = 0;
                              var5_int = 0;
                              L4: while (true) {
                                L5: {
                                  L6: {
                                    if (rk.field_b <= var5_int) {
                                      break L6;
                                    } else {
                                      kd.field_n.field_h[var5_int] = var4_ref_mo.field_g[var5_int];
                                      var5_int++;
                                      if (var7 != 0) {
                                        break L5;
                                      } else {
                                        if (var7 == 0) {
                                          continue L4;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                  fl.field_m = ea.field_n;
                                  ea.field_n = qn.field_u;
                                  qn.field_u = bf.field_b;
                                  bf.field_b = var4_ref_mo.field_j;
                                  break L5;
                                }
                                stackOut_19_0 = 1;
                                stackIn_20_0 = stackOut_19_0;
                                return stackIn_20_0 != 0;
                              }
                            }
                          }
                        }
                        stackOut_22_0 = sm.field_i;
                        stackIn_24_0 = stackOut_22_0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_21_0 = sm.field_i;
                  stackIn_24_0 = stackOut_21_0;
                  break L1;
                }
                L7: while (true) {
                  L8: {
                    if (stackIn_24_0 < 0) {
                      kd.field_n.field_f = 0;
                      if (!fq.a(1, (byte) 104)) {
                        stackOut_28_0 = 0;
                        stackIn_29_0 = stackOut_28_0;
                        return stackIn_29_0 != 0;
                      } else {
                        sm.field_i = kd.field_n.e(true);
                        kd.field_n.field_f = 0;
                        rk.field_b = param0[sm.field_i];
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  if (ol.f((byte) 60)) {
                    L9: {
                      if (wb.field_d == 0) {
                        break L9;
                      } else {
                        L10: {
                          var4 = wb.field_d;
                          if (0.0 == kk.field_b) {
                            break L10;
                          } else {
                            var4 = (int)((double)var4 + og.field_w.nextGaussian() * kk.field_b);
                            if (var4 >= 0) {
                              break L10;
                            } else {
                              var4 = 0;
                              break L10;
                            }
                          }
                        }
                        var5 = new mo((long)var4 + var2_long, sm.field_i, new byte[rk.field_b]);
                        var6 = 0;
                        L11: while (true) {
                          L12: {
                            L13: {
                              if (var6 >= rk.field_b) {
                                break L13;
                              } else {
                                var5.field_g[var6] = kd.field_n.field_h[var6];
                                var6++;
                                if (var7 != 0) {
                                  break L12;
                                } else {
                                  if (var7 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            bn.field_i.b(param1 ^ 64, (jb) (Object) var5);
                            sm.field_i = -1;
                            break L12;
                          }
                          if (var7 == 0) {
                            stackOut_23_0 = sm.field_i;
                            stackIn_24_0 = stackOut_23_0;
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    fl.field_m = ea.field_n;
                    ea.field_n = qn.field_u;
                    qn.field_u = bf.field_b;
                    bf.field_b = sm.field_i;
                    sm.field_i = -1;
                    stackOut_45_0 = 1;
                    stackIn_46_0 = stackOut_45_0;
                    break L0;
                  } else {
                    stackOut_32_0 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0 != 0;
                  }
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var2 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var2;
            stackOut_47_1 = new StringBuilder().append("ee.G(");
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L14;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L14;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + 44 + param1 + 41);
        }
        return stackIn_46_0 != 0;
    }

    final void b(byte param0) {
        int var2 = 0;
        if (((ee) this).field_l == null) {
          return;
        } else {
          L0: {
            ((ee) this).field_f = true;
            if (((ee) this).field_j == null) {
              ((ee) this).field_j = new wb();
              break L0;
            } else {
              break L0;
            }
          }
          var2 = 42 % ((param0 - 7) / 45);
          return;
        }
    }

    ee(int param0, sp param1, sp param2, ob param3, ni param4, int param5, byte[] param6, int param7, boolean param8) {
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
              ((ee) this).field_t = stackIn_7_1 != 0;
              ((ee) this).field_u = param5;
              ((ee) this).field_v = param4;
              ((ee) this).field_x = param6;
              if (null == ((ee) this).field_i) {
                break L4;
              } else {
                ((ee) this).field_k = (wl) (Object) ((ee) this).field_v.a(true, ((ee) this).field_r, ((ee) this).field_i);
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
            stackOut_10_1 = new StringBuilder().append("ee.<init>(").append(param0).append(44);
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
          throw dn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Login: ";
    }
}
