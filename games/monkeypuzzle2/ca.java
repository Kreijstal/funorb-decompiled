/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends rf {
    private byte[] field_i;
    private int field_w;
    private int field_u;
    private gf field_g;
    private wd field_c;
    static le field_f;
    private gf field_p;
    private cg field_q;
    private int field_t;
    private wl field_r;
    private fb field_o;
    private uj field_v;
    static String field_n;
    private byte[] field_s;
    private pj field_j;
    private pj field_h;
    private boolean field_m;
    private boolean field_d;
    private int field_l;
    private boolean field_k;
    private long field_e;

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        fb var2_ref = null;
        ug var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_59_0 = 0;
        byte stackIn_59_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_91_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_58_0 = 0;
        byte stackOut_58_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_90_0 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != ((ca) this).field_h) {
                if (null == ((ca) this).a((byte) 119)) {
                  return;
                } else {
                  L2: {
                    if (!((ca) this).field_d) {
                      break L2;
                    } else {
                      var2_int = 1;
                      var3 = ((ca) this).field_h.a((byte) -117);
                      L3: while (true) {
                        L4: {
                          L5: {
                            L6: {
                              if (null == var3) {
                                break L6;
                              } else {
                                var4 = (int)var3.field_a;
                                stackOut_11_0 = ~((ca) this).field_s[var4];
                                stackOut_11_1 = -1;
                                stackIn_24_0 = stackOut_11_0;
                                stackIn_24_1 = stackOut_11_1;
                                stackIn_12_0 = stackOut_11_0;
                                stackIn_12_1 = stackOut_11_1;
                                if (var5 != 0) {
                                  L7: while (true) {
                                    if (stackIn_24_0 >= stackIn_24_1) {
                                      break L5;
                                    } else {
                                      stackOut_25_0 = ((ca) this).field_c.field_m[((ca) this).field_l];
                                      stackIn_46_0 = stackOut_25_0;
                                      stackIn_26_0 = stackOut_25_0;
                                      if (var5 != 0) {
                                        break L4;
                                      } else {
                                        stackOut_26_0 = stackIn_26_0;
                                        stackIn_28_0 = stackOut_26_0;
                                        L8: {
                                          L9: {
                                            if (stackIn_28_0 == 0) {
                                              ((ca) this).field_l = ((ca) this).field_l + 1;
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
                                            if (250 > ((ca) this).field_v.field_j) {
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
                                            if (0 != ((ca) this).field_s[((ca) this).field_l]) {
                                              break L11;
                                            } else {
                                              fb discarded$4 = this.a(param0 ^ 16309, 1, ((ca) this).field_l);
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (((ca) this).field_s[((ca) this).field_l] == 0) {
                                              var3 = new ug();
                                              var3.field_a = (long)((ca) this).field_l;
                                              var2_int = 0;
                                              ((ca) this).field_h.a(-8212, var3);
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                          ((ca) this).field_l = ((ca) this).field_l + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L5;
                                          }
                                        }
                                        stackOut_23_0 = ~((ca) this).field_c.field_m.length;
                                        stackOut_23_1 = ~((ca) this).field_l;
                                        stackIn_24_0 = stackOut_23_0;
                                        stackIn_24_1 = stackOut_23_1;
                                        continue L7;
                                      }
                                    }
                                  }
                                } else {
                                  L13: {
                                    if (stackIn_12_0 != stackIn_12_1) {
                                      break L13;
                                    } else {
                                      fb discarded$5 = this.a(2, 1, var4);
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    L15: {
                                      if (((ca) this).field_s[var4] == 0) {
                                        break L15;
                                      } else {
                                        var3.c(-19822);
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
                                  var3 = ((ca) this).field_h.d((byte) 63);
                                  if (var5 == 0) {
                                    continue L3;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L16: while (true) {
                              stackOut_23_0 = ~((ca) this).field_c.field_m.length;
                              stackOut_23_1 = ~((ca) this).field_l;
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              if (stackIn_24_0 >= stackIn_24_1) {
                                break L5;
                              } else {
                                stackOut_25_0 = ((ca) this).field_c.field_m[((ca) this).field_l];
                                stackIn_46_0 = stackOut_25_0;
                                stackIn_26_0 = stackOut_25_0;
                                if (var5 != 0) {
                                  break L4;
                                } else {
                                  stackOut_26_0 = stackIn_26_0;
                                  stackIn_28_0 = stackOut_26_0;
                                  L17: {
                                    if (stackIn_28_0 == 0) {
                                      ((ca) this).field_l = ((ca) this).field_l + 1;
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
                                    if (250 > ((ca) this).field_v.field_j) {
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
                                    if (0 != ((ca) this).field_s[((ca) this).field_l]) {
                                      break L19;
                                    } else {
                                      fb discarded$4 = this.a(param0 ^ 16309, 1, ((ca) this).field_l);
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (((ca) this).field_s[((ca) this).field_l] == 0) {
                                      var3 = new ug();
                                      var3.field_a = (long)((ca) this).field_l;
                                      var2_int = 0;
                                      ((ca) this).field_h.a(-8212, var3);
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  ((ca) this).field_l = ((ca) this).field_l + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_45_0 = var2_int;
                          stackIn_46_0 = stackOut_45_0;
                          break L4;
                        }
                        L21: {
                          if (stackIn_46_0 != 0) {
                            ((ca) this).field_l = 0;
                            ((ca) this).field_d = false;
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
                    if (((ca) this).field_m) {
                      break L22;
                    } else {
                      ((ca) this).field_h = null;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L22;
                      }
                    }
                  }
                  var2_int = 1;
                  var3 = ((ca) this).field_h.a((byte) -117);
                  L23: while (true) {
                    L24: {
                      L25: {
                        L26: {
                          if (null == var3) {
                            break L26;
                          } else {
                            var4 = (int)var3.field_a;
                            stackOut_58_0 = 1;
                            stackOut_58_1 = ((ca) this).field_s[var4];
                            stackIn_70_0 = stackOut_58_0;
                            stackIn_70_1 = stackOut_58_1;
                            stackIn_59_0 = stackOut_58_0;
                            stackIn_59_1 = stackOut_58_1;
                            if (var5 != 0) {
                              L27: while (true) {
                                if (stackIn_70_0 <= stackIn_70_1) {
                                  break L25;
                                } else {
                                  stackOut_71_0 = ((ca) this).field_c.field_m[((ca) this).field_l];
                                  stackIn_91_0 = stackOut_71_0;
                                  stackIn_72_0 = stackOut_71_0;
                                  if (var5 != 0) {
                                    break L24;
                                  } else {
                                    stackOut_72_0 = stackIn_72_0;
                                    stackIn_74_0 = stackOut_72_0;
                                    L28: {
                                      L29: {
                                        if (stackIn_74_0 != 0) {
                                          break L29;
                                        } else {
                                          ((ca) this).field_l = ((ca) this).field_l + 1;
                                          if (var5 == 0) {
                                            break L28;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      L30: {
                                        if (!((ca) this).field_r.a(20)) {
                                          break L30;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L25;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                      L31: {
                                        if (((ca) this).field_s[((ca) this).field_l] == 1) {
                                          break L31;
                                        } else {
                                          fb discarded$6 = this.a(param0 + -16309, 2, ((ca) this).field_l);
                                          break L31;
                                        }
                                      }
                                      L32: {
                                        if (((ca) this).field_s[((ca) this).field_l] == 1) {
                                          break L32;
                                        } else {
                                          var3 = new ug();
                                          var3.field_a = (long)((ca) this).field_l;
                                          var2_int = 0;
                                          ((ca) this).field_h.a(-8212, var3);
                                          break L32;
                                        }
                                      }
                                      ((ca) this).field_l = ((ca) this).field_l + 1;
                                      if (var5 == 0) {
                                        break L28;
                                      } else {
                                        break L25;
                                      }
                                    }
                                    stackOut_69_0 = ~((ca) this).field_l;
                                    stackOut_69_1 = ~((ca) this).field_c.field_m.length;
                                    stackIn_70_0 = stackOut_69_0;
                                    stackIn_70_1 = stackOut_69_1;
                                    continue L27;
                                  }
                                }
                              }
                            } else {
                              L33: {
                                if (stackIn_59_0 == stackIn_59_1) {
                                  break L33;
                                } else {
                                  fb discarded$7 = this.a(2, 2, var4);
                                  break L33;
                                }
                              }
                              L34: {
                                L35: {
                                  if (((ca) this).field_s[var4] == 1) {
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
                                var3.c(param0 + -36133);
                                break L34;
                              }
                              var3 = ((ca) this).field_h.d((byte) 63);
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                        L36: while (true) {
                          stackOut_69_0 = ~((ca) this).field_l;
                          stackOut_69_1 = ~((ca) this).field_c.field_m.length;
                          stackIn_70_0 = stackOut_69_0;
                          stackIn_70_1 = stackOut_69_1;
                          if (stackIn_70_0 <= stackIn_70_1) {
                            break L25;
                          } else {
                            stackOut_71_0 = ((ca) this).field_c.field_m[((ca) this).field_l];
                            stackIn_91_0 = stackOut_71_0;
                            stackIn_72_0 = stackOut_71_0;
                            if (var5 != 0) {
                              break L24;
                            } else {
                              stackOut_72_0 = stackIn_72_0;
                              stackIn_74_0 = stackOut_72_0;
                              L37: {
                                if (stackIn_74_0 != 0) {
                                  break L37;
                                } else {
                                  ((ca) this).field_l = ((ca) this).field_l + 1;
                                  if (var5 == 0) {
                                    continue L36;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              L38: {
                                if (!((ca) this).field_r.a(20)) {
                                  break L38;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L25;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              L39: {
                                if (((ca) this).field_s[((ca) this).field_l] == 1) {
                                  break L39;
                                } else {
                                  fb discarded$6 = this.a(param0 + -16309, 2, ((ca) this).field_l);
                                  break L39;
                                }
                              }
                              L40: {
                                if (((ca) this).field_s[((ca) this).field_l] == 1) {
                                  break L40;
                                } else {
                                  var3 = new ug();
                                  var3.field_a = (long)((ca) this).field_l;
                                  var2_int = 0;
                                  ((ca) this).field_h.a(-8212, var3);
                                  break L40;
                                }
                              }
                              ((ca) this).field_l = ((ca) this).field_l + 1;
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
                      ((ca) this).field_l = 0;
                      ((ca) this).field_m = false;
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L41: {
              if (param0 == 16311) {
                break L41;
              } else {
                ((ca) this).field_q = null;
                break L41;
              }
            }
            L42: {
              if (!((ca) this).field_k) {
                break L42;
              } else {
                if (pf.a(0) >= ((ca) this).field_e) {
                  var2_ref = (fb) (Object) ((ca) this).field_q.a(0);
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
                              if (!var2_ref.field_j) {
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
                              if (!var2_ref.field_l) {
                                break L47;
                              } else {
                                if (!var2_ref.field_m) {
                                  throw new RuntimeException();
                                } else {
                                  var2_ref.c(param0 + -36133);
                                  if (var5 == 0) {
                                    break L45;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                            }
                            var2_ref.field_l = true;
                            break L45;
                          }
                          var2_ref = (fb) (Object) ((ca) this).field_q.a((byte) -55);
                          if (var5 == 0) {
                            continue L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    ((ca) this).field_e = pf.a(param0 + -16311) - -1000L;
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
          throw la.a((Throwable) (Object) var2, "ca.D(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_127_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        String stackOut_124_2 = null;
        var19 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param8 < 0) {
                break L1;
              } else {
                if (~param2 > ~ig.field_a) {
                  L2: {
                    if (0 <= param3) {
                      break L2;
                    } else {
                      if (0 <= param1) {
                        break L2;
                      } else {
                        if (param4 >= 0) {
                          break L2;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param3 < ig.field_c) {
                      break L3;
                    } else {
                      if (~ig.field_c < ~param1) {
                        break L3;
                      } else {
                        if (~param4 <= ~ig.field_c) {
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      var14 = param8 - param2;
                      if (~param2 == ~param5) {
                        break L5;
                      } else {
                        L6: {
                          L7: {
                            var10 = param3 << 902842864;
                            var9_int = param3 << 902842864;
                            var15 = -param2 + param5;
                            var11 = (param1 + -param3 << 990415344) / var15;
                            var12 = (-param3 + param4 << 446997328) / var14;
                            if (var11 >= var12) {
                              break L7;
                            } else {
                              var13 = 0;
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L6;
                        }
                        L8: {
                          L9: {
                            L10: {
                              if (param2 >= 0) {
                                break L10;
                              } else {
                                L11: {
                                  if (param5 < 0) {
                                    break L11;
                                  } else {
                                    param2 = -param2;
                                    var9_int = var9_int + var11 * param2;
                                    var10 = var10 + param2 * var12;
                                    param2 = 0;
                                    if (var19 == 0) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                param2 = param5 + -param2;
                                var9_int = var9_int + var11 * param2;
                                var10 = var10 + param2 * var12;
                                param2 = param5;
                                if (var19 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            var16 = ig.field_i[param2];
                            L12: while (true) {
                              if (~param5 >= ~param2) {
                                break L9;
                              } else {
                                var17 = var9_int >> -1066765616;
                                stackOut_34_0 = ~ig.field_c;
                                stackOut_34_1 = ~var17;
                                stackIn_64_0 = stackOut_34_0;
                                stackIn_64_1 = stackOut_34_1;
                                stackIn_35_0 = stackOut_34_0;
                                stackIn_35_1 = stackOut_34_1;
                                if (var19 != 0) {
                                  break L8;
                                } else {
                                  L13: {
                                    if (stackIn_35_0 >= stackIn_35_1) {
                                      break L13;
                                    } else {
                                      L14: {
                                        var18 = (var10 >> -626495920) - (var9_int >> -1089888656);
                                        if (var18 != 0) {
                                          break L14;
                                        } else {
                                          if (var17 < 0) {
                                            break L13;
                                          } else {
                                            if (~ig.field_c < ~var17) {
                                              tl.a(var18, param0, (byte) -97, var17 - -var16, param6);
                                              if (var19 == 0) {
                                                break L13;
                                              } else {
                                                break L14;
                                              }
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                      }
                                      L15: {
                                        if (var18 + var17 >= ig.field_c) {
                                          var18 = ig.field_c + (-var17 - 1);
                                          break L15;
                                        } else {
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        if (var17 >= 0) {
                                          break L16;
                                        } else {
                                          tl.a(var17 + var18, param0, (byte) -115, var16, param6);
                                          if (var19 == 0) {
                                            break L13;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      tl.a(var18, param0, (byte) -76, var16 + var17, param6);
                                      break L13;
                                    }
                                  }
                                  param2++;
                                  if (~ig.field_a < ~param2) {
                                    var16 = var16 + ge.field_h;
                                    var9_int = var9_int + var11;
                                    var10 = var10 + var12;
                                    if (var19 == 0) {
                                      continue L12;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    return;
                                  }
                                }
                              }
                            }
                          }
                          var16 = -param5 + param8;
                          stackOut_63_0 = 0;
                          stackOut_63_1 = var16;
                          stackIn_64_0 = stackOut_63_0;
                          stackIn_64_1 = stackOut_63_1;
                          break L8;
                        }
                        L17: {
                          L18: {
                            if (stackIn_64_0 == stackIn_64_1) {
                              break L18;
                            } else {
                              L19: {
                                L20: {
                                  var17 = param4 << -1883128432;
                                  if (var13 != 0) {
                                    break L20;
                                  } else {
                                    var9_int = param1 << -24185264;
                                    if (var19 == 0) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                var10 = param1 << -828187472;
                                break L19;
                              }
                              var12 = (var17 - var10) / var16;
                              var11 = (var17 - var9_int) / var16;
                              if (var19 == 0) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          var12 = 0;
                          var11 = 0;
                          break L17;
                        }
                        if (var19 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L21: {
                      L22: {
                        if (param2 != param8) {
                          break L22;
                        } else {
                          var11 = 0;
                          var12 = 0;
                          var10 = param1 << -1036959120;
                          var9_int = param3 << 518856656;
                          if (var19 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      L23: {
                        var15 = -param5 + param8;
                        if (param3 < param1) {
                          break L23;
                        } else {
                          var11 = (param4 - param1 << -2104365488) / var15;
                          var12 = (-param3 + param4 << 1775351792) / var14;
                          var10 = param3 << -2018670416;
                          var9_int = param1 << -673218416;
                          if (var19 == 0) {
                            break L21;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var9_int = param3 << -1255229904;
                      var11 = (param4 + -param3 << -1920850064) / var14;
                      var10 = param1 << 153523568;
                      var12 = (-param1 + param4 << -770577040) / var15;
                      break L21;
                    }
                    L24: {
                      if (param2 >= 0) {
                        break L24;
                      } else {
                        param2 = Math.min(-param2, param5 - param2);
                        var10 = var10 + var12 * param2;
                        var9_int = var9_int + param2 * var11;
                        param2 = 0;
                        break L24;
                      }
                    }
                    var13 = 0;
                    break L4;
                  }
                  L25: {
                    if (0 > param2) {
                      param2 = -param2;
                      var9_int = var9_int + var11 * param2;
                      var10 = var10 + param2 * var12;
                      param2 = 0;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (param7 == -18427) {
                      break L26;
                    } else {
                      field_n = null;
                      break L26;
                    }
                  }
                  var15 = ig.field_i[param2];
                  L27: while (true) {
                    L28: {
                      L29: {
                        if (param2 >= param8) {
                          break L29;
                        } else {
                          var16 = var9_int >> 80729840;
                          if (var19 != 0) {
                            break L28;
                          } else {
                            L30: {
                              if (~ig.field_c < ~var16) {
                                L31: {
                                  var17 = (var10 >> -1946454256) - (var9_int >> -1200449552);
                                  if (var17 == 0) {
                                    break L31;
                                  } else {
                                    L32: {
                                      if (~(var16 + var17) <= ~ig.field_c) {
                                        var17 = -var16 + (ig.field_c + -1);
                                        break L32;
                                      } else {
                                        break L32;
                                      }
                                    }
                                    L33: {
                                      if (0 > var16) {
                                        break L33;
                                      } else {
                                        tl.a(var17, param0, (byte) -106, var16 - -var15, param6);
                                        if (var19 == 0) {
                                          break L30;
                                        } else {
                                          break L33;
                                        }
                                      }
                                    }
                                    tl.a(var17 + var16, param0, (byte) -91, var15, param6);
                                    if (var19 == 0) {
                                      break L30;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                                if (var16 < 0) {
                                  break L30;
                                } else {
                                  if (~ig.field_c < ~var16) {
                                    tl.a(var17, param0, (byte) -106, var15 + var16, param6);
                                    break L30;
                                  } else {
                                    break L30;
                                  }
                                }
                              } else {
                                break L30;
                              }
                            }
                            param2++;
                            if (ig.field_a > param2) {
                              var10 = var10 + var12;
                              var9_int = var9_int + var11;
                              var15 = var15 + ge.field_h;
                              if (var19 == 0) {
                                continue L27;
                              } else {
                                break L29;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      break L28;
                    }
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var9 = decompiledCaughtException;
            stackOut_123_0 = (RuntimeException) var9;
            stackOut_123_1 = new StringBuilder().append("ca.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_126_0 = stackOut_123_0;
            stackIn_126_1 = stackOut_123_1;
            stackIn_124_0 = stackOut_123_0;
            stackIn_124_1 = stackOut_123_1;
            if (param6 == null) {
              stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
              stackOut_126_1 = (StringBuilder) (Object) stackIn_126_1;
              stackOut_126_2 = "null";
              stackIn_127_0 = stackOut_126_0;
              stackIn_127_1 = stackOut_126_1;
              stackIn_127_2 = stackOut_126_2;
              break L34;
            } else {
              stackOut_124_0 = (RuntimeException) (Object) stackIn_124_0;
              stackOut_124_1 = (StringBuilder) (Object) stackIn_124_1;
              stackOut_124_2 = "{...}";
              stackIn_127_0 = stackOut_124_0;
              stackIn_127_1 = stackOut_124_1;
              stackIn_127_2 = stackOut_124_2;
              break L34;
            }
          }
          throw la.a((Throwable) (Object) stackIn_127_0, stackIn_127_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final wd a(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        wd stackIn_3_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_53_0 = null;
        wd stackIn_59_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_33_0 = null;
        Object stackOut_52_0 = null;
        wd stackOut_58_0 = null;
        wd stackOut_2_0 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (null == ((ca) this).field_c) {
              L1: {
                if (param0 >= 39) {
                  break L1;
                } else {
                  ((ca) this).field_e = -112L;
                  break L1;
                }
              }
              L2: {
                if (((ca) this).field_o == null) {
                  if (((ca) this).field_r.d(20)) {
                    stackOut_13_0 = null;
                    stackIn_14_0 = stackOut_13_0;
                    return (wd) (Object) stackIn_14_0;
                  } else {
                    ((ca) this).field_o = (fb) (Object) ((ca) this).field_r.a(255, ((ca) this).field_u, 102, true, (byte) 0);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              if (((ca) this).field_o.field_j) {
                stackOut_19_0 = null;
                stackIn_20_0 = stackOut_19_0;
                return (wd) (Object) stackIn_20_0;
              } else {
                L3: {
                  L4: {
                    var2_array = ((ca) this).field_o.e(125);
                    if (((ca) this).field_o instanceof si) {
                      break L4;
                    } else {
                      try {
                        L5: {
                          if (var2_array != null) {
                            ((ca) this).field_c = new wd(var2_array, ((ca) this).field_w, ((ca) this).field_i);
                            break L5;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          L7: {
                            var3 = decompiledCaughtException;
                            ((ca) this).field_r.b(20);
                            ((ca) this).field_c = null;
                            if (!((ca) this).field_r.d(20)) {
                              break L7;
                            } else {
                              ((ca) this).field_o = null;
                              if (var4 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ((ca) this).field_o = (fb) (Object) ((ca) this).field_r.a(255, ((ca) this).field_u, 75, true, (byte) 0);
                          break L6;
                        }
                        stackOut_33_0 = null;
                        stackIn_34_0 = stackOut_33_0;
                        return (wd) (Object) stackIn_34_0;
                      }
                      if (null != ((ca) this).field_p) {
                        si discarded$1 = ((ca) this).field_v.a(false, ((ca) this).field_u, var2_array, ((ca) this).field_p);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  try {
                    L8: {
                      if (var2_array != null) {
                        ((ca) this).field_c = new wd(var2_array, ((ca) this).field_w, ((ca) this).field_i);
                        if (~((ca) this).field_c.field_l == ~((ca) this).field_t) {
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
                        ((ca) this).field_c = null;
                        if (((ca) this).field_r.d(20)) {
                          break L10;
                        } else {
                          ((ca) this).field_o = (fb) (Object) ((ca) this).field_r.a(255, ((ca) this).field_u, 91, true, (byte) 0);
                          if (var4 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ((ca) this).field_o = null;
                      break L9;
                    }
                    stackOut_52_0 = null;
                    stackIn_53_0 = stackOut_52_0;
                    return (wd) (Object) stackIn_53_0;
                  }
                  break L3;
                }
                L11: {
                  ((ca) this).field_o = null;
                  if (((ca) this).field_g != null) {
                    ((ca) this).field_s = new byte[((ca) this).field_c.field_e];
                    break L11;
                  } else {
                    break L11;
                  }
                }
                stackOut_58_0 = ((ca) this).field_c;
                stackIn_59_0 = stackOut_58_0;
                break L0;
              }
            } else {
              stackOut_2_0 = ((ca) this).field_c;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "ca.F(" + param0 + ')');
        }
        return stackIn_59_0;
    }

    final byte[] b(int param0, int param1) {
        fb var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            var3 = this.a(2, 0, param1);
            if (null == var3) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              var4 = var3.e(-81);
              var3.c(-19822);
              if (param0 < -110) {
                stackOut_8_0 = (byte[]) var4;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw la.a((Throwable) (Object) var3_ref, "ca.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    private final fb a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        byte[] var7_ref_byte__ = null;
        int var7 = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_39_0 = null;
        Object stackIn_58_0 = null;
        Object stackIn_65_0 = null;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        Object stackIn_102_0 = null;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        Object stackIn_114_0 = null;
        byte stackIn_133_0 = 0;
        byte stackIn_133_1 = 0;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        Object stackIn_152_0 = null;
        Object stackIn_159_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_38_0 = null;
        Object stackOut_57_0 = null;
        Object stackOut_64_0 = null;
        byte stackOut_132_0 = 0;
        byte stackOut_132_1 = 0;
        int stackOut_139_0 = 0;
        int stackOut_139_1 = 0;
        Object stackOut_151_0 = null;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        Object stackOut_101_0 = null;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        Object stackOut_113_0 = null;
        Object stackOut_158_0 = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          try {
            L0: {
              if (param0 == 2) {
                break L0;
              } else {
                ((ca) this).field_w = 1;
                break L0;
              }
            }
            L1: {
              var4 = (Object) (Object) (fb) (Object) ((ca) this).field_q.a((byte) 119, (long)param2);
              if (var4 == null) {
                break L1;
              } else {
                if (param1 != 0) {
                  break L1;
                } else {
                  if (((fb) var4).field_m) {
                    break L1;
                  } else {
                    if (((fb) var4).field_j) {
                      ((fb) var4).c(param0 + -19824);
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
                  L4: {
                    if (0 == param1) {
                      break L4;
                    } else {
                      L5: {
                        if (param1 == 1) {
                          break L5;
                        } else {
                          if (2 == param1) {
                            if (null == ((ca) this).field_g) {
                              throw new RuntimeException();
                            } else {
                              if (((ca) this).field_s[param2] != -1) {
                                throw new RuntimeException();
                              } else {
                                if (!((ca) this).field_r.a(param0 + 18)) {
                                  var4 = (Object) (Object) ((ca) this).field_r.a(((ca) this).field_u, param2, 82, false, (byte) 2);
                                  if (var10 == 0) {
                                    break L3;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  stackOut_38_0 = null;
                                  stackIn_39_0 = stackOut_38_0;
                                  return (fb) (Object) stackIn_39_0;
                                }
                              }
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                      if (((ca) this).field_g != null) {
                        var4 = (Object) (Object) ((ca) this).field_v.a(param2, ((ca) this).field_g, (byte) -127);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  L6: {
                    if (((ca) this).field_g == null) {
                      break L6;
                    } else {
                      if (((ca) this).field_s[param2] != -1) {
                        var4 = (Object) (Object) ((ca) this).field_v.a(((ca) this).field_g, 1, param2);
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (((ca) this).field_r.d(20)) {
                      break L7;
                    } else {
                      var4 = (Object) (Object) ((ca) this).field_r.a(((ca) this).field_u, param2, 103, true, (byte) 2);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L7;
                      }
                    }
                  }
                  stackOut_57_0 = null;
                  stackIn_58_0 = stackOut_57_0;
                  return (fb) (Object) stackIn_58_0;
                }
                ((ca) this).field_q.a((ug) var4, (long)param2, (byte) -36);
                break L2;
              }
            }
            if (((fb) var4).field_j) {
              stackOut_64_0 = null;
              stackIn_65_0 = stackOut_64_0;
              return (fb) (Object) stackIn_65_0;
            } else {
              var5 = ((fb) var4).e(119);
              if (var4 instanceof si) {
                L8: {
                  if (null == var5) {
                    break L8;
                  } else {
                    if (var5.length <= 2) {
                      break L8;
                    } else {
                      cl.field_f.reset();
                      cl.field_f.update(var5, 0, var5.length + -2);
                      var6_int = (int)cl.field_f.getValue();
                      if (var6_int != ((ca) this).field_c.field_j[param2]) {
                        throw new RuntimeException();
                      } else {
                        L9: {
                          L10: {
                            if (null == ((ca) this).field_c.field_n) {
                              break L10;
                            } else {
                              if (null == ((ca) this).field_c.field_n[param2]) {
                                break L10;
                              } else {
                                var7_ref_byte__ = ((ca) this).field_c.field_n[param2];
                                var8 = ie.a(-68, var5, -2 + var5.length, 0);
                                var9 = 0;
                                L11: while (true) {
                                  if (var9 >= 64) {
                                    break L10;
                                  } else {
                                    stackOut_132_0 = var7_ref_byte__[var9];
                                    stackOut_132_1 = var8[var9];
                                    stackIn_140_0 = stackOut_132_0;
                                    stackIn_140_1 = stackOut_132_1;
                                    stackIn_133_0 = stackOut_132_0;
                                    stackIn_133_1 = stackOut_132_1;
                                    if (var10 != 0) {
                                      break L9;
                                    } else {
                                      if (stackIn_133_0 != stackIn_133_1) {
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
                          stackOut_139_0 = 255 & var5[var5.length + -1];
                          stackOut_139_1 = 65280 & var5[var5.length - 2] << -966258616;
                          stackIn_140_0 = stackOut_139_0;
                          stackIn_140_1 = stackOut_139_1;
                          break L9;
                        }
                        var7 = stackIn_140_0 + stackIn_140_1;
                        if (~var7 == ~(65535 & ((ca) this).field_c.field_p[param2])) {
                          L12: {
                            if (((ca) this).field_s[param2] == 1) {
                              break L12;
                            } else {
                              L13: {
                                if (0 == ((ca) this).field_s[param2]) {
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              ((ca) this).field_s[param2] = (byte) 1;
                              break L12;
                            }
                          }
                          L14: {
                            if (((fb) var4).field_m) {
                              break L14;
                            } else {
                              ((fb) var4).c(-19822);
                              break L14;
                            }
                          }
                          stackOut_151_0 = var4;
                          stackIn_152_0 = stackOut_151_0;
                          return (fb) (Object) stackIn_152_0;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              } else {
                try {
                  L15: {
                    L16: {
                      if (null == var5) {
                        break L16;
                      } else {
                        if (var5.length <= 2) {
                          break L16;
                        } else {
                          cl.field_f.reset();
                          cl.field_f.update(var5, 0, -2 + var5.length);
                          var6_int = (int)cl.field_f.getValue();
                          if (~var6_int == ~((ca) this).field_c.field_j[param2]) {
                            L17: {
                              if (null == ((ca) this).field_c.field_n) {
                                break L17;
                              } else {
                                if (((ca) this).field_c.field_n[param2] != null) {
                                  var7_ref_byte__ = ((ca) this).field_c.field_n[param2];
                                  var8 = ie.a(param0 + -109, var5, -2 + var5.length, 0);
                                  var9 = 0;
                                  L18: while (true) {
                                    if (var9 >= 64) {
                                      break L17;
                                    } else {
                                      stackOut_85_0 = ~var8[var9];
                                      stackOut_85_1 = ~var7_ref_byte__[var9];
                                      stackIn_106_0 = stackOut_85_0;
                                      stackIn_106_1 = stackOut_85_1;
                                      stackIn_86_0 = stackOut_85_0;
                                      stackIn_86_1 = stackOut_85_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L15;
                                      } else {
                                        if (stackIn_86_0 != stackIn_86_1) {
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
                                } else {
                                  break L17;
                                }
                              }
                            }
                            ((ca) this).field_r.field_b = 0;
                            ((ca) this).field_r.field_a = 0;
                            decompiledRegionSelector0 = 1;
                            break L15;
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
                  L19: {
                    var6 = (RuntimeException) (Object) decompiledCaughtException;
                    ((ca) this).field_r.b(20);
                    ((fb) var4).c(-19822);
                    if (((fb) var4).field_m) {
                      if (!((ca) this).field_r.d(param0 + 18)) {
                        var4 = (Object) (Object) ((ca) this).field_r.a(((ca) this).field_u, param2, param0 + 112, true, (byte) 2);
                        ((ca) this).field_q.a((ug) var4, (long)param2, (byte) -36);
                        break L19;
                      } else {
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                  stackOut_101_0 = null;
                  stackIn_102_0 = stackOut_101_0;
                  return (fb) (Object) stackIn_102_0;
                }
                L20: {
                  L21: {
                    if (decompiledRegionSelector0 == 0) {
                      break L21;
                    } else {
                      var5[var5.length + -2] = (byte)(((ca) this).field_c.field_p[param2] >>> 493083208);
                      var5[-1 + var5.length] = (byte)((ca) this).field_c.field_p[param2];
                      if (((ca) this).field_g == null) {
                        break L20;
                      } else {
                        si discarded$1 = ((ca) this).field_v.a(false, param2, var5, ((ca) this).field_g);
                        stackOut_104_0 = ~((ca) this).field_s[param2];
                        stackOut_104_1 = -2;
                        stackIn_106_0 = stackOut_104_0;
                        stackIn_106_1 = stackOut_104_1;
                        break L21;
                      }
                    }
                  }
                  if (stackIn_106_0 == stackIn_106_1) {
                    break L20;
                  } else {
                    ((ca) this).field_s[param2] = (byte) 1;
                    break L20;
                  }
                }
                L22: {
                  if (!((fb) var4).field_m) {
                    ((fb) var4).c(-19822);
                    break L22;
                  } else {
                    break L22;
                  }
                }
                stackOut_113_0 = var4;
                stackIn_114_0 = stackOut_113_0;
                return (fb) (Object) stackIn_114_0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L23: {
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((ca) this).field_s[param2] = (byte) -1;
              ((fb) var4).c(-19822);
              if (((fb) var4).field_m) {
                if (((ca) this).field_r.d(param0 + 18)) {
                  break L23;
                } else {
                  var4 = (Object) (Object) ((ca) this).field_r.a(((ca) this).field_u, param2, 83, true, (byte) 2);
                  ((ca) this).field_q.a((ug) var4, (long)param2, (byte) -36);
                  break L23;
                }
              } else {
                break L23;
              }
            }
            stackOut_158_0 = null;
            stackIn_159_0 = stackOut_158_0;
            return (fb) (Object) stackIn_159_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw la.a((Throwable) var4, "ca.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        ug var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (null == ((ca) this).field_h) {
              return;
            } else {
              if (param0 == -1) {
                if (null == ((ca) this).a((byte) 53)) {
                  return;
                } else {
                  var2_ref = ((ca) this).field_j.a((byte) -117);
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (null == var2_ref) {
                          break L3;
                        } else {
                          var3 = (int)var2_ref.field_a;
                          if (var4 != 0) {
                            break L2;
                          } else {
                            L4: {
                              L5: {
                                L6: {
                                  if (var3 < 0) {
                                    break L6;
                                  } else {
                                    if (~((ca) this).field_c.field_e >= ~var3) {
                                      break L6;
                                    } else {
                                      if (((ca) this).field_c.field_m[var3] == 0) {
                                        break L6;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                                var2_ref.c(-19822);
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                              L7: {
                                if (((ca) this).field_s[var3] != 0) {
                                  break L7;
                                } else {
                                  fb discarded$2 = this.a(2, 1, var3);
                                  break L7;
                                }
                              }
                              L8: {
                                if (-1 == ((ca) this).field_s[var3]) {
                                  fb discarded$3 = this.a(2, 2, var3);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              if (((ca) this).field_s[var3] == 1) {
                                var2_ref.c(-19822);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var2_ref = ((ca) this).field_j.d((byte) 63);
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
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "ca.B(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            field_n = null;
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "ca.A(" + param0 + ')');
        }
    }

    final int a(int param0, int param1) {
        fb var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              var3 = (fb) (Object) ((ca) this).field_q.a((byte) 112, (long)param1);
              if (param0 < -42) {
                break L1;
              } else {
                fb discarded$2 = this.a(85, 123, 107);
                break L1;
              }
            }
            if (null != var3) {
              stackOut_6_0 = var3.a(true);
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
          throw la.a((Throwable) (Object) var3_ref, "ca.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((ca) this).field_g == null) {
              return;
            } else {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  int discarded$2 = ((ca) this).a(-68, -82);
                  break L1;
                }
              }
              L2: {
                ((ca) this).field_m = true;
                if (null != ((ca) this).field_h) {
                  break L2;
                } else {
                  ((ca) this).field_h = new pj();
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "ca.E(" + param0 + ')');
        }
    }

    ca(int param0, gf param1, gf param2, wl param3, uj param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((ca) this).field_q = new cg(16);
        ((ca) this).field_l = 0;
        ((ca) this).field_j = new pj();
        ((ca) this).field_e = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((ca) this).field_g = param1;
                ((ca) this).field_u = param0;
                if (((ca) this).field_g == null) {
                  break L2;
                } else {
                  ((ca) this).field_d = true;
                  ((ca) this).field_h = new pj();
                  if (!MonkeyPuzzle2.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ca) this).field_d = false;
              break L1;
            }
            L3: {
              ((ca) this).field_k = param8;
              ((ca) this).field_t = param7;
              ((ca) this).field_r = param3;
              ((ca) this).field_v = param4;
              ((ca) this).field_w = param5;
              ((ca) this).field_i = param6;
              ((ca) this).field_p = param2;
              if (null != ((ca) this).field_p) {
                ((ca) this).field_o = (fb) (Object) ((ca) this).field_v.a(((ca) this).field_p, 1, ((ca) this).field_u);
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
            stackOut_10_1 = new StringBuilder().append("ca.<init>(").append(param0).append(',');
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
          throw la.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Play the game without logging in just yet";
        field_f = new le(270, 70);
    }
}
