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
        fb discarded$6 = null;
        fb discarded$7 = null;
        fb discarded$8 = null;
        fb discarded$9 = null;
        fb discarded$10 = null;
        fb discarded$11 = null;
        int var2_int = 0;
        fb var2 = null;
        ug var3 = null;
        int var4 = 0;
        int var5 = 0;
        ug var6 = null;
        ug var7 = null;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_42_0 = 0;
        byte stackIn_42_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_130_0 = 0;
        int stackOut_130_1 = 0;
        int stackOut_126_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_41_0 = 0;
        byte stackOut_41_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_62_0 = 0;
        L0: {
          var5 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (null != this.field_h) {
            if (null == this.a((byte) 119)) {
              return;
            } else {
              L1: {
                if (!this.field_d) {
                  break L1;
                } else {
                  var2_int = 1;
                  var3 = this.field_h.a((byte) -117);
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 == null) {
                            break L5;
                          } else {
                            var4 = (int)var3.field_a;
                            stackOut_8_0 = this.field_s[var4] ^ -1;
                            stackOut_8_1 = -1;
                            stackIn_18_0 = stackOut_8_0;
                            stackIn_18_1 = stackOut_8_1;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            if (var5 != 0) {
                              L6: while (true) {
                                if (stackIn_18_0 >= stackIn_18_1) {
                                  break L4;
                                } else {
                                  stackOut_19_0 = this.field_c.field_m[this.field_l];
                                  stackIn_32_0 = stackOut_19_0;
                                  stackIn_20_0 = stackOut_19_0;
                                  if (var5 != 0) {
                                    break L3;
                                  } else {
                                    L7: {
                                      L8: {
                                        if (stackIn_20_0 == 0) {
                                          this.field_l = this.field_l + 1;
                                          if (var5 == 0) {
                                            break L7;
                                          } else {
                                            break L8;
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                      L9: {
                                        if (250 > this.field_v.field_j) {
                                          break L9;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L4;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (0 != this.field_s[this.field_l]) {
                                          break L10;
                                        } else {
                                          discarded$6 = this.a(param0 ^ 16309, 1, this.field_l);
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (-1 == (this.field_s[this.field_l] ^ -1)) {
                                          var6 = new ug();
                                          var6.field_a = (long)this.field_l;
                                          var2_int = 0;
                                          this.field_h.a(-8212, var6);
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      this.field_l = this.field_l + 1;
                                      if (var5 == 0) {
                                        break L7;
                                      } else {
                                        break L4;
                                      }
                                    }
                                    stackOut_17_0 = this.field_c.field_m.length ^ -1;
                                    stackOut_17_1 = this.field_l ^ -1;
                                    stackIn_18_0 = stackOut_17_0;
                                    stackIn_18_1 = stackOut_17_1;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              L12: {
                                if (stackIn_9_0 != stackIn_9_1) {
                                  break L12;
                                } else {
                                  discarded$7 = this.a(2, 1, var4);
                                  break L12;
                                }
                              }
                              L13: {
                                L14: {
                                  if (this.field_s[var4] == 0) {
                                    break L14;
                                  } else {
                                    var3.c(-19822);
                                    if (var5 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L13;
                              }
                              var3 = this.field_h.d((byte) 63);
                              if (var5 == 0) {
                                continue L2;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        L15: while (true) {
                          stackOut_130_0 = this.field_c.field_m.length ^ -1;
                          stackOut_130_1 = this.field_l ^ -1;
                          stackIn_128_0 = stackOut_130_0;
                          stackIn_128_1 = stackOut_130_1;
                          if (stackIn_128_0 >= stackIn_128_1) {
                            break L4;
                          } else {
                            stackOut_126_0 = this.field_c.field_m[this.field_l];
                            stackIn_32_0 = stackOut_126_0;
                            stackIn_127_0 = stackOut_126_0;
                            if (var5 != 0) {
                              break L3;
                            } else {
                              stackOut_127_0 = stackIn_127_0;
                              stackIn_124_0 = stackOut_127_0;
                              L16: {
                                if (stackIn_124_0 == 0) {
                                  this.field_l = this.field_l + 1;
                                  if (var5 == 0) {
                                    continue L15;
                                  } else {
                                    break L16;
                                  }
                                } else {
                                  break L16;
                                }
                              }
                              L17: {
                                if (250 > this.field_v.field_j) {
                                  break L17;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L4;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              L18: {
                                if (0 != this.field_s[this.field_l]) {
                                  break L18;
                                } else {
                                  discarded$8 = this.a(param0 ^ 16309, 1, this.field_l);
                                  break L18;
                                }
                              }
                              L19: {
                                if (-1 == (this.field_s[this.field_l] ^ -1)) {
                                  var6 = new ug();
                                  var6.field_a = (long)this.field_l;
                                  var2_int = 0;
                                  this.field_h.a(-8212, var6);
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              this.field_l = this.field_l + 1;
                              if (var5 == 0) {
                                continue L15;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      stackOut_31_0 = var2_int;
                      stackIn_32_0 = stackOut_31_0;
                      break L3;
                    }
                    L20: {
                      if (stackIn_32_0 != 0) {
                        this.field_l = 0;
                        this.field_d = false;
                        break L20;
                      } else {
                        break L20;
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
              L21: {
                if (this.field_m) {
                  break L21;
                } else {
                  this.field_h = null;
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L21;
                  }
                }
              }
              var2_int = 1;
              var3 = this.field_h.a((byte) -117);
              L22: while (true) {
                L23: {
                  L24: {
                    L25: {
                      if (var3 == null) {
                        break L25;
                      } else {
                        var4 = (int)var3.field_a;
                        stackOut_41_0 = 1;
                        stackOut_41_1 = this.field_s[var4];
                        stackIn_50_0 = stackOut_41_0;
                        stackIn_50_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (var5 != 0) {
                          L26: while (true) {
                            if (stackIn_50_0 <= stackIn_50_1) {
                              break L24;
                            } else {
                              stackOut_51_0 = this.field_c.field_m[this.field_l];
                              stackIn_63_0 = stackOut_51_0;
                              stackIn_52_0 = stackOut_51_0;
                              if (var5 != 0) {
                                break L23;
                              } else {
                                L27: {
                                  L28: {
                                    if (stackIn_52_0 != 0) {
                                      break L28;
                                    } else {
                                      this.field_l = this.field_l + 1;
                                      if (var5 == 0) {
                                        break L27;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  L29: {
                                    if (!this.field_r.a(20)) {
                                      break L29;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L24;
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                  L30: {
                                    if ((this.field_s[this.field_l] ^ -1) == -2) {
                                      break L30;
                                    } else {
                                      discarded$9 = this.a(param0 + -16309, 2, this.field_l);
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    if ((this.field_s[this.field_l] ^ -1) == -2) {
                                      break L31;
                                    } else {
                                      var7 = new ug();
                                      var7.field_a = (long)this.field_l;
                                      var2_int = 0;
                                      this.field_h.a(-8212, var7);
                                      break L31;
                                    }
                                  }
                                  this.field_l = this.field_l + 1;
                                  if (var5 == 0) {
                                    break L27;
                                  } else {
                                    break L24;
                                  }
                                }
                                stackOut_49_0 = this.field_l ^ -1;
                                stackOut_49_1 = this.field_c.field_m.length ^ -1;
                                stackIn_50_0 = stackOut_49_0;
                                stackIn_50_1 = stackOut_49_1;
                                continue L26;
                              }
                            }
                          }
                        } else {
                          L32: {
                            if (stackIn_42_0 == stackIn_42_1) {
                              break L32;
                            } else {
                              discarded$10 = this.a(2, 2, var4);
                              break L32;
                            }
                          }
                          L33: {
                            L34: {
                              if (this.field_s[var4] == 1) {
                                break L34;
                              } else {
                                var2_int = 0;
                                if (var5 == 0) {
                                  break L33;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            var3.c(param0 + -36133);
                            break L33;
                          }
                          var3 = this.field_h.d((byte) 63);
                          if (var5 == 0) {
                            continue L22;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    L35: while (true) {
                      stackOut_107_0 = this.field_l ^ -1;
                      stackOut_107_1 = this.field_c.field_m.length ^ -1;
                      stackIn_105_0 = stackOut_107_0;
                      stackIn_105_1 = stackOut_107_1;
                      if (stackIn_105_0 <= stackIn_105_1) {
                        break L24;
                      } else {
                        stackOut_103_0 = this.field_c.field_m[this.field_l];
                        stackIn_63_0 = stackOut_103_0;
                        stackIn_104_0 = stackOut_103_0;
                        if (var5 != 0) {
                          break L23;
                        } else {
                          stackOut_104_0 = stackIn_104_0;
                          stackIn_101_0 = stackOut_104_0;
                          L36: {
                            if (stackIn_101_0 != 0) {
                              break L36;
                            } else {
                              this.field_l = this.field_l + 1;
                              if (var5 == 0) {
                                continue L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                          L37: {
                            if (!this.field_r.a(20)) {
                              break L37;
                            } else {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L24;
                              } else {
                                break L37;
                              }
                            }
                          }
                          L38: {
                            if ((this.field_s[this.field_l] ^ -1) == -2) {
                              break L38;
                            } else {
                              discarded$11 = this.a(param0 + -16309, 2, this.field_l);
                              break L38;
                            }
                          }
                          L39: {
                            if ((this.field_s[this.field_l] ^ -1) == -2) {
                              break L39;
                            } else {
                              var7 = new ug();
                              var7.field_a = (long)this.field_l;
                              var2_int = 0;
                              this.field_h.a(-8212, var7);
                              break L39;
                            }
                          }
                          this.field_l = this.field_l + 1;
                          if (var5 == 0) {
                            continue L35;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                  }
                  stackOut_62_0 = var2_int;
                  stackIn_63_0 = stackOut_62_0;
                  break L23;
                }
                if (stackIn_63_0 == 0) {
                  break L0;
                } else {
                  this.field_l = 0;
                  this.field_m = false;
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L40: {
          if (param0 == 16311) {
            break L40;
          } else {
            this.field_q = (cg) null;
            break L40;
          }
        }
        L41: {
          if (!this.field_k) {
            break L41;
          } else {
            if (pf.a(0) >= this.field_e) {
              var2 = (fb) ((Object) this.field_q.a(0));
              L42: while (true) {
                L43: {
                  L44: {
                    if (var2 == null) {
                      break L44;
                    } else {
                      if (var5 != 0) {
                        break L43;
                      } else {
                        L45: {
                          L46: {
                            if (!var2.field_j) {
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
                            if (!var2.field_l) {
                              break L47;
                            } else {
                              if (!var2.field_m) {
                                throw new RuntimeException();
                              } else {
                                var2.c(param0 + -36133);
                                if (var5 == 0) {
                                  break L45;
                                } else {
                                  break L47;
                                }
                              }
                            }
                          }
                          var2.field_l = true;
                          break L45;
                        }
                        var2 = (fb) ((Object) this.field_q.a((byte) -55));
                        if (var5 == 0) {
                          continue L42;
                        } else {
                          break L44;
                        }
                      }
                    }
                  }
                  this.field_e = pf.a(param0 + -16311) - -1000L;
                  break L43;
                }
                break L41;
              }
            } else {
              break L41;
            }
          }
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
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        var19 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param8 ^ -1) > -1) {
                break L1;
              } else {
                if ((param2 ^ -1) > (ig.field_a ^ -1)) {
                  L2: {
                    if (0 <= param3) {
                      break L2;
                    } else {
                      if (0 <= param1) {
                        break L2;
                      } else {
                        if ((param4 ^ -1) <= -1) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param3 < ig.field_c) {
                      break L3;
                    } else {
                      if ((ig.field_c ^ -1) < (param1 ^ -1)) {
                        break L3;
                      } else {
                        if ((param4 ^ -1) <= (ig.field_c ^ -1)) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      var14 = param8 - param2;
                      if ((param2 ^ -1) == (param5 ^ -1)) {
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
                              if (-1 >= (param2 ^ -1)) {
                                break L10;
                              } else {
                                L11: {
                                  if (-1 < (param5 ^ -1)) {
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
                              if ((param5 ^ -1) >= (param2 ^ -1)) {
                                break L9;
                              } else {
                                var17 = var9_int >> -1066765616;
                                stackOut_24_0 = ig.field_c ^ -1;
                                stackOut_24_1 = var17 ^ -1;
                                stackIn_42_0 = stackOut_24_0;
                                stackIn_42_1 = stackOut_24_1;
                                stackIn_25_0 = stackOut_24_0;
                                stackIn_25_1 = stackOut_24_1;
                                if (var19 != 0) {
                                  break L8;
                                } else {
                                  L13: {
                                    if (stackIn_25_0 >= stackIn_25_1) {
                                      break L13;
                                    } else {
                                      L14: {
                                        var18 = (var10 >> -626495920) - (var9_int >> -1089888656);
                                        if (-1 != (var18 ^ -1)) {
                                          break L14;
                                        } else {
                                          if (-1 < (var17 ^ -1)) {
                                            break L13;
                                          } else {
                                            if ((ig.field_c ^ -1) < (var17 ^ -1)) {
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
                                  if ((ig.field_a ^ -1) < (param2 ^ -1)) {
                                    var16 = var16 + ge.field_h;
                                    var9_int = var9_int + var11;
                                    var10 = var10 + var12;
                                    if (var19 == 0) {
                                      continue L12;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    decompiledRegionSelector0 = 3;
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                          var16 = -param5 + param8;
                          stackOut_41_0 = 0;
                          stackOut_41_1 = var16;
                          stackIn_42_0 = stackOut_41_0;
                          stackIn_42_1 = stackOut_41_1;
                          break L8;
                        }
                        L17: {
                          L18: {
                            if (stackIn_42_0 == stackIn_42_1) {
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
                      if ((param2 ^ -1) <= -1) {
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
                      field_n = (String) null;
                      break L26;
                    }
                  }
                  var15 = ig.field_i[param2];
                  L27: while (true) {
                    L28: {
                      if (param2 >= param8) {
                        break L28;
                      } else {
                        var16 = var9_int >> 80729840;
                        if (var19 != 0) {
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          L29: {
                            if ((ig.field_c ^ -1) < (var16 ^ -1)) {
                              L30: {
                                var17 = (var10 >> -1946454256) - (var9_int >> -1200449552);
                                if (-1 == (var17 ^ -1)) {
                                  break L30;
                                } else {
                                  L31: {
                                    if ((var16 + var17 ^ -1) <= (ig.field_c ^ -1)) {
                                      var17 = -var16 + (ig.field_c + -1);
                                      break L31;
                                    } else {
                                      break L31;
                                    }
                                  }
                                  L32: {
                                    if (0 > var16) {
                                      break L32;
                                    } else {
                                      tl.a(var17, param0, (byte) -106, var16 - -var15, param6);
                                      if (var19 == 0) {
                                        break L29;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  tl.a(var17 + var16, param0, (byte) -91, var15, param6);
                                  if (var19 == 0) {
                                    break L29;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                              if (-1 < (var16 ^ -1)) {
                                break L29;
                              } else {
                                if ((ig.field_c ^ -1) < (var16 ^ -1)) {
                                  tl.a(var17, param0, (byte) -106, var15 + var16, param6);
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                            } else {
                              break L29;
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
                              break L28;
                            }
                          } else {
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 6;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L33: {
            var9 = decompiledCaughtException;
            stackOut_84_0 = (RuntimeException) (var9);
            stackOut_84_1 = new StringBuilder().append("ca.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_86_0 = stackOut_84_0;
            stackIn_86_1 = stackOut_84_1;
            stackIn_85_0 = stackOut_84_0;
            stackIn_85_1 = stackOut_84_1;
            if (param6 == null) {
              stackOut_86_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackOut_86_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackOut_86_2 = "null";
              stackIn_87_0 = stackOut_86_0;
              stackIn_87_1 = stackOut_86_1;
              stackIn_87_2 = stackOut_86_2;
              break L33;
            } else {
              stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackOut_85_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackOut_85_2 = "{...}";
              stackIn_87_0 = stackOut_85_0;
              stackIn_87_1 = stackOut_85_1;
              stackIn_87_2 = stackOut_85_2;
              break L33;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_87_0), stackIn_87_2 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final wd a(byte param0) {
        si discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null == this.field_c) {
          L0: {
            if (param0 >= 39) {
              break L0;
            } else {
              this.field_e = -112L;
              break L0;
            }
          }
          L1: {
            if (this.field_o == null) {
              if (!this.field_r.d(20)) {
                this.field_o = (fb) ((Object) this.field_r.a(255, this.field_u, 102, true, (byte) 0));
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (!this.field_o.field_j) {
            L2: {
              L3: {
                var7 = this.field_o.e(125);
                var6 = var7;
                var5 = var6;
                var2 = var5;
                if (this.field_o instanceof si) {
                  break L3;
                } else {
                  try {
                    L4: {
                      if (var5 != null) {
                        this.field_c = new wd(var7, this.field_w, this.field_i);
                        break L4;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var3 = decompiledCaughtException;
                      this.field_r.b(20);
                      this.field_c = null;
                      if (!this.field_r.d(20)) {
                        break L5;
                      } else {
                        this.field_o = null;
                        if (var4 != 0) {
                          break L5;
                        } else {
                          return null;
                        }
                      }
                    }
                    this.field_o = (fb) ((Object) this.field_r.a(255, this.field_u, 75, true, (byte) 0));
                    return null;
                  }
                  if (null != this.field_p) {
                    discarded$1 = this.field_v.a(false, this.field_u, var7, this.field_p);
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
                L6: {
                  if (var5 != null) {
                    this.field_c = new wd(var7, this.field_w, this.field_i);
                    if ((this.field_c.field_l ^ -1) == (this.field_t ^ -1)) {
                      break L6;
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L7: {
                  var3 = decompiledCaughtException;
                  this.field_c = null;
                  if (this.field_r.d(20)) {
                    break L7;
                  } else {
                    this.field_o = (fb) ((Object) this.field_r.a(255, this.field_u, 91, true, (byte) 0));
                    if (var4 != 0) {
                      break L7;
                    } else {
                      return null;
                    }
                  }
                }
                this.field_o = null;
                return null;
              }
              break L2;
            }
            L8: {
              this.field_o = null;
              if (this.field_g != null) {
                this.field_s = new byte[this.field_c.field_e];
                break L8;
              } else {
                break L8;
              }
            }
            return this.field_c;
          } else {
            return null;
          }
        } else {
          return this.field_c;
        }
    }

    final byte[] b(int param0, int param1) {
        fb var3 = this.a(2, 0, param1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.e(-81);
        var3.c(-19822);
        if (param0 >= -110) {
            return (byte[]) null;
        }
        return var4;
    }

    private final fb a(int param0, int param1, int param2) {
        si discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        fb var11 = null;
        byte[] var12 = null;
        byte[] var17 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        byte stackIn_81_0 = 0;
        byte stackIn_81_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        Object stackIn_95_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_80_0 = 0;
        byte stackOut_80_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        Object stackOut_94_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        L0: {
          var10 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 == 2) {
            break L0;
          } else {
            this.field_w = 1;
            break L0;
          }
        }
        L1: {
          var11 = (fb) ((Object) this.field_q.a((byte) 119, (long)param2));
          var4 = var11;
          if (var11 == null) {
            break L1;
          } else {
            if (-1 != (param1 ^ -1)) {
              break L1;
            } else {
              if (var11.field_m) {
                break L1;
              } else {
                if (var11.field_j) {
                  var11.c(param0 + -19824);
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
                    if ((param1 ^ -1) == -2) {
                      break L5;
                    } else {
                      if (2 == param1) {
                        if (null == this.field_g) {
                          throw new RuntimeException();
                        } else {
                          if ((this.field_s[param2] ^ -1) != 0) {
                            throw new RuntimeException();
                          } else {
                            if (!this.field_r.a(param0 + 18)) {
                              var4 = this.field_r.a(this.field_u, param2, 82, false, (byte) 2);
                              if (var10 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            } else {
                              return null;
                            }
                          }
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  if (this.field_g != null) {
                    var4 = this.field_v.a(param2, this.field_g, (byte) -127);
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
                if (this.field_g == null) {
                  break L6;
                } else {
                  if (0 != (this.field_s[param2] ^ -1)) {
                    var4 = this.field_v.a(this.field_g, 1, param2);
                    break L3;
                  } else {
                    break L6;
                  }
                }
              }
              if (!this.field_r.d(20)) {
                var4 = this.field_r.a(this.field_u, param2, 103, true, (byte) 2);
                if (var10 == 0) {
                  break L3;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            this.field_q.a((ug) (var4), (long)param2, (byte) -36);
            break L2;
          }
        }
        if (!((fb) (var4)).field_j) {
          var17 = ((fb) (var4)).e(119);
          var12 = var17;
          var5 = var12;
          if (var4 instanceof si) {
            try {
              L7: {
                L8: {
                  if (var5 == null) {
                    break L8;
                  } else {
                    if (-3 <= (var17.length ^ -1)) {
                      break L8;
                    } else {
                      cl.field_f.reset();
                      cl.field_f.update(var5, 0, var17.length + -2);
                      var6_int = (int)cl.field_f.getValue();
                      if (var6_int != this.field_c.field_j[param2]) {
                        throw new RuntimeException();
                      } else {
                        L9: {
                          L10: {
                            if (null == this.field_c.field_n) {
                              break L10;
                            } else {
                              if (null == this.field_c.field_n[param2]) {
                                break L10;
                              } else {
                                var28 = this.field_c.field_n[param2];
                                var29 = ie.a(-68, var5, -2 + var17.length, 0);
                                var9 = 0;
                                L11: while (true) {
                                  if (var9 >= 64) {
                                    break L10;
                                  } else {
                                    stackOut_80_0 = var28[var9];
                                    stackOut_80_1 = var29[var9];
                                    stackIn_86_0 = stackOut_80_0;
                                    stackIn_86_1 = stackOut_80_1;
                                    stackIn_81_0 = stackOut_80_0;
                                    stackIn_81_1 = stackOut_80_1;
                                    if (var10 != 0) {
                                      break L9;
                                    } else {
                                      if (stackIn_81_0 != stackIn_81_1) {
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
                          stackOut_85_0 = 255 & var5[var17.length + -1];
                          stackOut_85_1 = 65280 & var5[var17.length - 2] << -966258616;
                          stackIn_86_0 = stackOut_85_0;
                          stackIn_86_1 = stackOut_85_1;
                          break L9;
                        }
                        var7 = stackIn_86_0 + stackIn_86_1;
                        if ((var7 ^ -1) == (65535 & this.field_c.field_p[param2] ^ -1)) {
                          L12: {
                            if ((this.field_s[param2] ^ -1) == -2) {
                              break L12;
                            } else {
                              L13: {
                                if (0 == this.field_s[param2]) {
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              this.field_s[param2] = (byte) 1;
                              break L12;
                            }
                          }
                          L14: {
                            if (((fb) (var4)).field_m) {
                              break L14;
                            } else {
                              ((fb) (var4)).c(-19822);
                              break L14;
                            }
                          }
                          stackOut_94_0 = var4;
                          stackIn_95_0 = stackOut_94_0;
                          break L7;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L15: {
                var6_ref = (Exception) (Object) decompiledCaughtException;
                this.field_s[param2] = (byte)-1;
                ((fb) (var4)).c(-19822);
                if (((fb) (var4)).field_m) {
                  if (!this.field_r.d(param0 + 18)) {
                    var4 = this.field_r.a(this.field_u, param2, 83, true, (byte) 2);
                    this.field_q.a((ug) (var4), (long)param2, (byte) -36);
                    break L15;
                  } else {
                    return null;
                  }
                } else {
                  break L15;
                }
              }
              return null;
            }
            return (fb) ((Object) stackIn_95_0);
          } else {
            try {
              L16: {
                L17: {
                  if (var5 == null) {
                    break L17;
                  } else {
                    if (-3 <= (var17.length ^ -1)) {
                      break L17;
                    } else {
                      cl.field_f.reset();
                      cl.field_f.update(var5, 0, -2 + var17.length);
                      var6_int = (int)cl.field_f.getValue();
                      if ((var6_int ^ -1) == (this.field_c.field_j[param2] ^ -1)) {
                        L18: {
                          L19: {
                            if (null == this.field_c.field_n) {
                              break L19;
                            } else {
                              if (this.field_c.field_n[param2] != null) {
                                var27 = this.field_c.field_n[param2];
                                var26 = ie.a(param0 + -109, var5, -2 + var17.length, 0);
                                var9 = 0;
                                L20: while (true) {
                                  if (-65 >= (var9 ^ -1)) {
                                    break L19;
                                  } else {
                                    stackOut_48_0 = var26[var9] ^ -1;
                                    stackOut_48_1 = var27[var9] ^ -1;
                                    stackIn_63_0 = stackOut_48_0;
                                    stackIn_63_1 = stackOut_48_1;
                                    stackIn_49_0 = stackOut_48_0;
                                    stackIn_49_1 = stackOut_48_1;
                                    if (var10 != 0) {
                                      decompiledRegionSelector0 = 1;
                                      break L16;
                                    } else {
                                      if (stackIn_49_0 != stackIn_49_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L20;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                this.field_r.field_b = 0;
                                this.field_r.field_a = 0;
                                break L18;
                              }
                            }
                          }
                          this.field_r.field_b = 0;
                          this.field_r.field_a = 0;
                          break L18;
                        }
                        decompiledRegionSelector0 = 0;
                        break L16;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L21: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                this.field_r.b(20);
                ((fb) (var4)).c(-19822);
                if (((fb) (var4)).field_m) {
                  if (!this.field_r.d(param0 + 18)) {
                    var4 = this.field_r.a(this.field_u, param2, param0 + 112, true, (byte) 2);
                    this.field_q.a((ug) (var4), (long)param2, (byte) -36);
                    break L21;
                  } else {
                    break L21;
                  }
                } else {
                  break L21;
                }
              }
              return null;
            }
            L22: {
              L23: {
                if (decompiledRegionSelector0 == 0) {
                  var5[var17.length + -2] = (byte)(this.field_c.field_p[param2] >>> 493083208);
                  var5[-1 + var17.length] = (byte)this.field_c.field_p[param2];
                  if (this.field_g == null) {
                    break L22;
                  } else {
                    discarded$1 = this.field_v.a(false, param2, var17, this.field_g);
                    stackOut_62_0 = this.field_s[param2] ^ -1;
                    stackOut_62_1 = -2;
                    stackIn_63_0 = stackOut_62_0;
                    stackIn_63_1 = stackOut_62_1;
                    break L23;
                  }
                } else {
                  break L23;
                }
              }
              if (stackIn_63_0 == stackIn_63_1) {
                break L22;
              } else {
                this.field_s[param2] = (byte) 1;
                break L22;
              }
            }
            L24: {
              if (!((fb) (var4)).field_m) {
                ((fb) (var4)).c(-19822);
                break L24;
              } else {
                break L24;
              }
            }
            return (fb) (var4);
          }
        } else {
          return null;
        }
    }

    final void b(int param0) {
        fb discarded$4 = null;
        fb discarded$5 = null;
        ug var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null == this.field_h) {
          return;
        } else {
          if (param0 == -1) {
            if (null == this.a((byte) 53)) {
              return;
            } else {
              var2 = this.field_j.a((byte) -117);
              L0: while (true) {
                L1: {
                  if (var2 == null) {
                    break L1;
                  } else {
                    var3 = (int)var2.field_a;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L2: {
                        L3: {
                          L4: {
                            if (-1 < (var3 ^ -1)) {
                              break L4;
                            } else {
                              if ((this.field_c.field_e ^ -1) >= (var3 ^ -1)) {
                                break L4;
                              } else {
                                if (-1 == (this.field_c.field_m[var3] ^ -1)) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          var2.c(-19822);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                        L5: {
                          if (this.field_s[var3] != 0) {
                            break L5;
                          } else {
                            discarded$4 = this.a(2, 1, var3);
                            break L5;
                          }
                        }
                        L6: {
                          if (-1 == this.field_s[var3]) {
                            discarded$5 = this.a(2, 2, var3);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (-2 == (this.field_s[var3] ^ -1)) {
                          var2.c(-19822);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var2 = this.field_j.d((byte) 63);
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
            }
          } else {
            return;
          }
        }
    }

    public static void d(int param0) {
        if (param0 != -1) {
            field_f = (le) null;
        }
        field_n = null;
        field_f = null;
    }

    final int a(int param0, int param1) {
        fb discarded$0 = null;
        fb var3 = (fb) ((Object) this.field_q.a((byte) 112, (long)param1));
        if (param0 >= -42) {
            discarded$0 = this.a(85, 123, 107);
        }
        if (var3 == null) {
            return 0;
        }
        return var3.a(true);
    }

    final void a(int param0) {
        int discarded$0 = 0;
        if (!(this.field_g != null)) {
            return;
        }
        if (param0 != -1) {
            discarded$0 = this.a(-68, -82);
        }
        this.field_m = true;
        if (null == this.field_h) {
            this.field_h = new pj();
        }
    }

    ca(int param0, gf param1, gf param2, wl param3, uj param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_q = new cg(16);
        this.field_l = 0;
        this.field_j = new pj();
        this.field_e = 0L;
        try {
          L0: {
            L1: {
              L2: {
                this.field_g = param1;
                this.field_u = param0;
                if (this.field_g == null) {
                  break L2;
                } else {
                  this.field_d = true;
                  this.field_h = new pj();
                  if (!MonkeyPuzzle2.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_d = false;
              break L1;
            }
            L3: {
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
              ((ca) (this)).field_k = stackIn_7_1 != 0;
              this.field_t = param7;
              this.field_r = param3;
              this.field_v = param4;
              this.field_w = param5;
              this.field_i = param6;
              this.field_p = param2;
              if (null == this.field_p) {
                break L4;
              } else {
                this.field_o = (fb) ((Object) this.field_v.a(this.field_p, 1, this.field_u));
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var10);
            stackOut_10_1 = new StringBuilder().append("ca.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_n = "Play the game without logging in just yet";
        field_f = new le(270, 70);
    }
}
