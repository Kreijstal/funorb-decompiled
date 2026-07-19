/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    qq field_d;
    static String field_m;
    static String field_k;
    static String field_f;
    int[][] field_i;
    int[] field_l;
    private byte[] field_g;
    int field_h;
    int[] field_s;
    int field_o;
    private int[][] field_c;
    byte[][] field_a;
    int[] field_p;
    int field_e;
    qq[] field_n;
    private int field_q;
    int[] field_b;
    private int[] field_j;
    int[] field_r;

    private final void a(int param0, byte[] param1) {
        int dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int[] array$9 = null;
        int dupTemp$10 = 0;
        int[] array$11 = null;
        int dupTemp$12 = 0;
        int[] array$13 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        k var17 = null;
        k var18 = null;
        byte[] var22 = null;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_114_0 = 0;
        int[] stackIn_118_0 = null;
        int[] stackIn_128_0 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_137_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_113_0 = 0;
        int[] stackOut_117_0 = null;
        int[] stackOut_127_0 = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        RuntimeException stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        String stackOut_136_2 = null;
        RuntimeException stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        String stackOut_135_2 = null;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new k(hb.a(param1, param0));
              var18 = var17;
              var4 = var18.g(31365);
              if (5 > var4) {
                break L1;
              } else {
                if (7 >= var4) {
                  L2: {
                    L3: {
                      if (-7 >= (var4 ^ -1)) {
                        break L3;
                      } else {
                        this.field_h = 0;
                        if (var16 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_h = var18.i(param0 ^ -1478490344);
                    break L2;
                  }
                  L4: {
                    var5 = var18.g(31365);
                    if (0 == (1 & var5)) {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      break L4;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      break L4;
                    }
                  }
                  L5: {
                    var6 = stackIn_12_0;
                    if (-1 == (var5 & 2 ^ -1)) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      break L5;
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      var7 = stackIn_15_0;
                      if (-8 < (var4 ^ -1)) {
                        break L7;
                      } else {
                        this.field_q = var18.e((byte) -49);
                        if (var16 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    this.field_q = var18.d((byte) 69);
                    break L6;
                  }
                  L8: {
                    L9: {
                      L10: {
                        L11: {
                          L12: {
                            L13: {
                              L14: {
                                var8 = 0;
                                this.field_l = new int[this.field_q];
                                var9 = -1;
                                if (var4 >= 7) {
                                  break L14;
                                } else {
                                  var10 = 0;
                                  L15: while (true) {
                                    L16: {
                                      if ((this.field_q ^ -1) >= (var10 ^ -1)) {
                                        break L16;
                                      } else {
                                        dupTemp$7 = var8 + var17.d((byte) 69);
                                        var8 = dupTemp$7;
                                        this.field_l[var10] = dupTemp$7;
                                        stackOut_22_0 = this.field_l[var10] ^ -1;
                                        stackOut_22_1 = var9 ^ -1;
                                        stackIn_39_0 = stackOut_22_0;
                                        stackIn_39_1 = stackOut_22_1;
                                        stackIn_23_0 = stackOut_22_0;
                                        stackIn_23_1 = stackOut_22_1;
                                        if (var16 != 0) {
                                          break L13;
                                        } else {
                                          L17: {
                                            if (stackIn_23_0 >= stackIn_23_1) {
                                              break L17;
                                            } else {
                                              var9 = this.field_l[var10];
                                              break L17;
                                            }
                                          }
                                          var10++;
                                          if (var16 == 0) {
                                            continue L15;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                    }
                                    if (var16 == 0) {
                                      break L12;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              var10 = 0;
                              L18: while (true) {
                                if (var10 >= this.field_q) {
                                  break L12;
                                } else {
                                  dupTemp$8 = var8 + var17.e((byte) -49);
                                  var8 = dupTemp$8;
                                  this.field_l[var10] = dupTemp$8;
                                  stackOut_29_0 = this.field_l[var10];
                                  stackOut_29_1 = var9;
                                  stackIn_39_0 = stackOut_29_0;
                                  stackIn_39_1 = stackOut_29_1;
                                  stackIn_30_0 = stackOut_29_0;
                                  stackIn_30_1 = stackOut_29_1;
                                  if (var16 != 0) {
                                    break L13;
                                  } else {
                                    L19: {
                                      if (stackIn_30_0 <= stackIn_30_1) {
                                        break L19;
                                      } else {
                                        var9 = this.field_l[var10];
                                        break L19;
                                      }
                                    }
                                    var10++;
                                    if (var16 == 0) {
                                      continue L18;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            L20: while (true) {
                              if (stackIn_39_0 >= stackIn_39_1) {
                                break L10;
                              } else {
                                this.field_j[var10] = -1;
                                var10++;
                                if (var16 != 0) {
                                  break L9;
                                } else {
                                  if (var16 == 0) {
                                    stackOut_38_0 = var10;
                                    stackOut_38_1 = this.field_e;
                                    stackIn_39_0 = stackOut_38_0;
                                    stackIn_39_1 = stackOut_38_1;
                                    continue L20;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                          }
                          L21: {
                            this.field_e = var9 - -1;
                            this.field_r = new int[this.field_e];
                            this.field_p = new int[this.field_e];
                            this.field_s = new int[this.field_e];
                            this.field_b = new int[this.field_e];
                            if (var7 == 0) {
                              break L21;
                            } else {
                              this.field_a = new byte[this.field_e][];
                              break L21;
                            }
                          }
                          this.field_i = new int[this.field_e][];
                          if (var6 != 0) {
                            this.field_j = new int[this.field_e];
                            var10 = 0;
                            L22: while (true) {
                              stackOut_38_0 = var10;
                              stackOut_38_1 = this.field_e;
                              stackIn_39_0 = stackOut_38_0;
                              stackIn_39_1 = stackOut_38_1;
                              if (stackIn_39_0 >= stackIn_39_1) {
                                break L10;
                              } else {
                                this.field_j[var10] = -1;
                                var10++;
                                if (var16 != 0) {
                                  break L9;
                                } else {
                                  if (var16 == 0) {
                                    continue L22;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                        break L10;
                      }
                      var10 = 0;
                      break L9;
                    }
                    L23: while (true) {
                      L24: {
                        if (this.field_q <= var10) {
                          break L24;
                        } else {
                          this.field_j[this.field_l[var10]] = var17.i(param0 + -1478490344);
                          var10++;
                          if (var16 != 0) {
                            break L8;
                          } else {
                            if (var16 == 0) {
                              continue L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                      this.field_d = new qq(this.field_j);
                      break L8;
                    }
                  }
                  var10 = 0;
                  L25: while (true) {
                    L26: {
                      L27: {
                        L28: {
                          L29: {
                            L30: {
                              L31: {
                                if (this.field_q <= var10) {
                                  break L31;
                                } else {
                                  this.field_r[this.field_l[var10]] = var17.i(param0 + -1478490344);
                                  var10++;
                                  if (var16 != 0) {
                                    break L30;
                                  } else {
                                    if (var16 == 0) {
                                      continue L25;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                              }
                              if (var7 != 0) {
                                break L30;
                              } else {
                                var10 = 0;
                                L32: while (true) {
                                  if (this.field_q <= var10) {
                                    break L29;
                                  } else {
                                    this.field_p[this.field_l[var10]] = var17.i(vg.a(param0, -1478490344));
                                    var10++;
                                    if (var16 != 0) {
                                      break L28;
                                    } else {
                                      if (var16 == 0) {
                                        continue L32;
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var10 = 0;
                            L33: while (true) {
                              L34: {
                                L35: {
                                  if ((this.field_q ^ -1) >= (var10 ^ -1)) {
                                    break L35;
                                  } else {
                                    var22 = new byte[64];
                                    var18.a(0, param0 + -6351, 64, var22);
                                    this.field_a[this.field_l[var10]] = var22;
                                    var10++;
                                    if (var16 != 0) {
                                      break L34;
                                    } else {
                                      if (var16 == 0) {
                                        continue L33;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                }
                                var10 = 0;
                                break L34;
                              }
                              L36: while (true) {
                                if (this.field_q <= var10) {
                                  break L29;
                                } else {
                                  this.field_p[this.field_l[var10]] = var17.i(vg.a(param0, -1478490344));
                                  var10++;
                                  if (var16 != 0) {
                                    break L28;
                                  } else {
                                    if (var16 == 0) {
                                      continue L36;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if ((var4 ^ -1) <= -8) {
                            break L28;
                          } else {
                            var10 = 0;
                            L37: while (true) {
                              L38: {
                                L39: {
                                  if ((this.field_q ^ -1) >= (var10 ^ -1)) {
                                    break L39;
                                  } else {
                                    this.field_s[this.field_l[var10]] = var17.d((byte) 69);
                                    var10++;
                                    if (var16 != 0) {
                                      break L38;
                                    } else {
                                      if (var16 == 0) {
                                        continue L37;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                }
                                var10 = 0;
                                break L38;
                              }
                              L40: while (true) {
                                L41: {
                                  if (this.field_q <= var10) {
                                    break L41;
                                  } else {
                                    var11 = this.field_l[var10];
                                    var12 = this.field_s[var11];
                                    var8 = 0;
                                    array$9 = new int[var12];
                                    this.field_i[var11] = array$9;
                                    var13 = -1;
                                    stackOut_81_0 = 0;
                                    stackIn_114_0 = stackOut_81_0;
                                    stackIn_82_0 = stackOut_81_0;
                                    if (var16 != 0) {
                                      break L26;
                                    } else {
                                      var14 = stackIn_82_0;
                                      L42: while (true) {
                                        L43: {
                                          L44: {
                                            if (var12 <= var14) {
                                              break L44;
                                            } else {
                                              dupTemp$10 = var8 + var17.d((byte) 69);
                                              var8 = dupTemp$10;
                                              this.field_i[var11][var14] = dupTemp$10;
                                              var15 = dupTemp$10;
                                              stackOut_84_0 = var15;
                                              stackOut_84_1 = var13;
                                              stackIn_90_0 = stackOut_84_0;
                                              stackIn_90_1 = stackOut_84_1;
                                              stackIn_85_0 = stackOut_84_0;
                                              stackIn_85_1 = stackOut_84_1;
                                              if (var16 != 0) {
                                                break L43;
                                              } else {
                                                L45: {
                                                  if (stackIn_85_0 > stackIn_85_1) {
                                                    var13 = var15;
                                                    break L45;
                                                  } else {
                                                    break L45;
                                                  }
                                                }
                                                var14++;
                                                if (var16 == 0) {
                                                  continue L42;
                                                } else {
                                                  break L44;
                                                }
                                              }
                                            }
                                          }
                                          this.field_b[var11] = 1 + var13;
                                          stackOut_89_0 = var13 - -1 ^ -1;
                                          stackOut_89_1 = var12 ^ -1;
                                          stackIn_90_0 = stackOut_89_0;
                                          stackIn_90_1 = stackOut_89_1;
                                          break L43;
                                        }
                                        L46: {
                                          if (stackIn_90_0 != stackIn_90_1) {
                                            break L46;
                                          } else {
                                            this.field_i[var11] = null;
                                            break L46;
                                          }
                                        }
                                        var10++;
                                        if (var16 == 0) {
                                          continue L40;
                                        } else {
                                          break L41;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var16 == 0) {
                                  break L27;
                                } else {
                                  break L28;
                                }
                              }
                            }
                          }
                        }
                        var10 = 0;
                        L47: while (true) {
                          L48: {
                            L49: {
                              if (var10 >= this.field_q) {
                                break L49;
                              } else {
                                this.field_s[this.field_l[var10]] = var17.e((byte) -49);
                                var10++;
                                if (var16 != 0) {
                                  break L48;
                                } else {
                                  if (var16 == 0) {
                                    continue L47;
                                  } else {
                                    break L49;
                                  }
                                }
                              }
                            }
                            var10 = 0;
                            break L48;
                          }
                          L50: while (true) {
                            if (this.field_q <= var10) {
                              break L27;
                            } else {
                              var11 = this.field_l[var10];
                              var12 = this.field_s[var11];
                              var8 = 0;
                              array$11 = new int[var12];
                              this.field_i[var11] = array$11;
                              var13 = -1;
                              stackOut_102_0 = 0;
                              stackIn_114_0 = stackOut_102_0;
                              stackIn_103_0 = stackOut_102_0;
                              if (var16 != 0) {
                                break L26;
                              } else {
                                var14 = stackIn_103_0;
                                L51: while (true) {
                                  L52: {
                                    L53: {
                                      if ((var12 ^ -1) >= (var14 ^ -1)) {
                                        break L53;
                                      } else {
                                        dupTemp$12 = var8 + var17.e((byte) -49);
                                        var8 = dupTemp$12;
                                        this.field_i[var11][var14] = dupTemp$12;
                                        var15 = dupTemp$12;
                                        stackOut_105_0 = var15;
                                        stackOut_105_1 = var13;
                                        stackIn_110_0 = stackOut_105_0;
                                        stackIn_110_1 = stackOut_105_1;
                                        stackIn_106_0 = stackOut_105_0;
                                        stackIn_106_1 = stackOut_105_1;
                                        if (var16 != 0) {
                                          break L52;
                                        } else {
                                          L54: {
                                            if (stackIn_106_0 <= stackIn_106_1) {
                                              break L54;
                                            } else {
                                              var13 = var15;
                                              break L54;
                                            }
                                          }
                                          var14++;
                                          if (var16 == 0) {
                                            continue L51;
                                          } else {
                                            break L53;
                                          }
                                        }
                                      }
                                    }
                                    this.field_b[var11] = 1 + var13;
                                    stackOut_109_0 = var13 - -1;
                                    stackOut_109_1 = var12;
                                    stackIn_110_0 = stackOut_109_0;
                                    stackIn_110_1 = stackOut_109_1;
                                    break L52;
                                  }
                                  L55: {
                                    if (stackIn_110_0 != stackIn_110_1) {
                                      break L55;
                                    } else {
                                      this.field_i[var11] = null;
                                      break L55;
                                    }
                                  }
                                  var10++;
                                  if (var16 == 0) {
                                    continue L50;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_113_0 = var6;
                      stackIn_114_0 = stackOut_113_0;
                      break L26;
                    }
                    L56: {
                      if (stackIn_114_0 == 0) {
                        break L56;
                      } else {
                        this.field_n = new qq[1 + var9];
                        this.field_c = new int[1 + var9][];
                        var10 = 0;
                        L57: while (true) {
                          if ((var10 ^ -1) <= (this.field_q ^ -1)) {
                            break L56;
                          } else {
                            var11 = this.field_l[var10];
                            stackOut_117_0 = this.field_s;
                            stackIn_118_0 = stackOut_117_0;
                            L58: while (true) {
                              var12 = stackIn_118_0[var11];
                              array$13 = new int[this.field_b[var11]];
                              this.field_c[var11] = array$13;
                              if (var16 != 0) {
                                decompiledRegionSelector0 = 0;
                                break L0;
                              } else {
                                var13 = 0;
                                L59: while (true) {
                                  L60: {
                                    L61: {
                                      if ((var13 ^ -1) <= (this.field_b[var11] ^ -1)) {
                                        break L61;
                                      } else {
                                        this.field_c[var11][var13] = -1;
                                        var13++;
                                        if (var16 != 0) {
                                          break L60;
                                        } else {
                                          if (var16 == 0) {
                                            continue L59;
                                          } else {
                                            break L61;
                                          }
                                        }
                                      }
                                    }
                                    var13 = 0;
                                    break L60;
                                  }
                                  L62: while (true) {
                                    L63: {
                                      if (var13 >= var12) {
                                        break L63;
                                      } else {
                                        stackOut_127_0 = this.field_i[var11];
                                        stackIn_118_0 = stackOut_127_0;
                                        stackIn_128_0 = stackOut_127_0;
                                        if (var16 != 0) {
                                          continue L58;
                                        } else {
                                          L64: {
                                            L65: {
                                              if (stackIn_128_0 == null) {
                                                break L65;
                                              } else {
                                                var14 = this.field_i[var11][var13];
                                                if (var16 == 0) {
                                                  break L64;
                                                } else {
                                                  break L65;
                                                }
                                              }
                                            }
                                            var14 = var13;
                                            break L64;
                                          }
                                          this.field_c[var11][var14] = var17.i(-1478490344);
                                          var13++;
                                          if (var16 == 0) {
                                            continue L62;
                                          } else {
                                            break L63;
                                          }
                                        }
                                      }
                                    }
                                    this.field_n[var11] = new qq(this.field_c[var11]);
                                    var10++;
                                    if (var16 == 0) {
                                      continue L57;
                                    } else {
                                      break L56;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L66: {
            var3 = decompiledCaughtException;
            stackOut_134_0 = (RuntimeException) (var3);
            stackOut_134_1 = new StringBuilder().append("be.B(").append(param0).append(',');
            stackIn_136_0 = stackOut_134_0;
            stackIn_136_1 = stackOut_134_1;
            stackIn_135_0 = stackOut_134_0;
            stackIn_135_1 = stackOut_134_1;
            if (param1 == null) {
              stackOut_136_0 = (RuntimeException) ((Object) stackIn_136_0);
              stackOut_136_1 = (StringBuilder) ((Object) stackIn_136_1);
              stackOut_136_2 = "null";
              stackIn_137_0 = stackOut_136_0;
              stackIn_137_1 = stackOut_136_1;
              stackIn_137_2 = stackOut_136_2;
              break L66;
            } else {
              stackOut_135_0 = (RuntimeException) ((Object) stackIn_135_0);
              stackOut_135_1 = (StringBuilder) ((Object) stackIn_135_1);
              stackOut_135_2 = "{...}";
              stackIn_137_0 = stackOut_135_0;
              stackIn_137_1 = stackOut_135_1;
              stackIn_137_2 = stackOut_135_2;
              break L66;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_137_0), stackIn_137_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(long param0, boolean param1) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param1) {
                    break L1;
                  } else {
                    field_f = (String) null;
                    break L1;
                  }
                }
                Thread.sleep(param0);
                break L0;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_m = null;
        if (param0 != 0) {
            field_f = (String) null;
        }
        field_k = null;
    }

    be(byte[] param0, int param1, byte[] param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_12_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            this.field_o = pb.a(param0, param0.length, (byte) -120);
            if (this.field_o == param1) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (64 == param2.length) {
                      this.field_g = ho.a(4246, 0, param0, param0.length);
                      var4_int = 0;
                      L3: while (true) {
                        if (var4_int >= 64) {
                          break L2;
                        } else {
                          stackOut_8_0 = this;
                          stackIn_13_0 = stackOut_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          if (var5 != 0) {
                            break L1;
                          } else {
                            if (((be) (this)).field_g[var4_int] == param2[var4_int]) {
                              var4_int++;
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L2;
                              }
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
                stackOut_12_0 = this;
                stackIn_13_0 = stackOut_12_0;
                break L1;
              }
              this.a(0, param0);
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("be.<init>(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_m = "Hide chat to continue";
        field_k = "Asking to join <%0>'s game...";
        field_f = "No";
    }
}
