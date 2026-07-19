/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dla {
    int field_d;
    int field_l;
    int[] field_f;
    private int[][] field_m;
    int[] field_k;
    pla[] field_e;
    pla field_b;
    int[][] field_n;
    private int field_o;
    int[] field_p;
    int[] field_c;
    int[] field_j;
    private byte[] field_i;
    private int[] field_g;
    int field_a;
    byte[][] field_h;

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
        uia var17 = null;
        uia var18 = null;
        byte[] var22 = null;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_119_0 = 0;
        RuntimeException stackIn_141_0 = null;
        StringBuilder stackIn_141_1 = null;
        RuntimeException stackIn_142_0 = null;
        StringBuilder stackIn_142_1 = null;
        RuntimeException stackIn_143_0 = null;
        StringBuilder stackIn_143_1 = null;
        String stackIn_143_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_118_0 = 0;
        RuntimeException stackOut_140_0 = null;
        StringBuilder stackOut_140_1 = null;
        RuntimeException stackOut_142_0 = null;
        StringBuilder stackOut_142_1 = null;
        String stackOut_142_2 = null;
        RuntimeException stackOut_141_0 = null;
        StringBuilder stackOut_141_1 = null;
        String stackOut_141_2 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var17 = new uia(sua.a(param1, -106));
            var18 = var17;
            if (param0 == -23918) {
              L1: {
                var4 = var18.h(255);
                if (5 > var4) {
                  break L1;
                } else {
                  if (var4 <= 7) {
                    L2: {
                      L3: {
                        if (6 <= var4) {
                          break L3;
                        } else {
                          this.field_a = 0;
                          if (var16 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_a = var18.e(param0 ^ 23871);
                      break L2;
                    }
                    L4: {
                      var5 = var18.h(255);
                      if (0 == (1 & var5)) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L4;
                      } else {
                        stackOut_12_0 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        break L4;
                      }
                    }
                    L5: {
                      var6 = stackIn_14_0;
                      if (0 == (2 & var5)) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        break L5;
                      } else {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        var7 = stackIn_17_0;
                        if (-8 < (var4 ^ -1)) {
                          break L7;
                        } else {
                          this.field_o = var18.g(-48);
                          if (var16 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      this.field_o = var18.d(127);
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
                                  var9 = -1;
                                  this.field_k = new int[this.field_o];
                                  if (7 > var4) {
                                    break L14;
                                  } else {
                                    var10 = 0;
                                    L15: while (true) {
                                      L16: {
                                        if (this.field_o <= var10) {
                                          break L16;
                                        } else {
                                          dupTemp$7 = var8 + var17.g(-48);
                                          var8 = dupTemp$7;
                                          this.field_k[var10] = dupTemp$7;
                                          stackOut_24_0 = var9;
                                          stackOut_24_1 = this.field_k[var10];
                                          stackIn_44_0 = stackOut_24_0;
                                          stackIn_44_1 = stackOut_24_1;
                                          stackIn_25_0 = stackOut_24_0;
                                          stackIn_25_1 = stackOut_24_1;
                                          if (var16 != 0) {
                                            break L13;
                                          } else {
                                            L17: {
                                              if (stackIn_25_0 < stackIn_25_1) {
                                                var9 = this.field_k[var10];
                                                break L17;
                                              } else {
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
                                  if ((var10 ^ -1) <= (this.field_o ^ -1)) {
                                    break L12;
                                  } else {
                                    dupTemp$8 = var8 + var17.d(125);
                                    var8 = dupTemp$8;
                                    this.field_k[var10] = dupTemp$8;
                                    stackOut_32_0 = this.field_k[var10] ^ -1;
                                    stackOut_32_1 = var9 ^ -1;
                                    stackIn_44_0 = stackOut_32_0;
                                    stackIn_44_1 = stackOut_32_1;
                                    stackIn_33_0 = stackOut_32_0;
                                    stackIn_33_1 = stackOut_32_1;
                                    if (var16 != 0) {
                                      break L13;
                                    } else {
                                      L19: {
                                        if (stackIn_33_0 < stackIn_33_1) {
                                          var9 = this.field_k[var10];
                                          break L19;
                                        } else {
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
                                if (stackIn_44_0 >= stackIn_44_1) {
                                  break L10;
                                } else {
                                  this.field_g[var10] = -1;
                                  var10++;
                                  if (var16 != 0) {
                                    break L9;
                                  } else {
                                    if (var16 == 0) {
                                      stackOut_43_0 = var10;
                                      stackOut_43_1 = this.field_l;
                                      stackIn_44_0 = stackOut_43_0;
                                      stackIn_44_1 = stackOut_43_1;
                                      continue L20;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                            L21: {
                              this.field_l = var9 - -1;
                              this.field_f = new int[this.field_l];
                              if (var7 != 0) {
                                this.field_h = new byte[this.field_l][];
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            this.field_c = new int[this.field_l];
                            this.field_p = new int[this.field_l];
                            this.field_n = new int[this.field_l][];
                            this.field_j = new int[this.field_l];
                            if (var6 != 0) {
                              this.field_g = new int[this.field_l];
                              var10 = 0;
                              L22: while (true) {
                                stackOut_43_0 = var10;
                                stackOut_43_1 = this.field_l;
                                stackIn_44_0 = stackOut_43_0;
                                stackIn_44_1 = stackOut_43_1;
                                if (stackIn_44_0 >= stackIn_44_1) {
                                  break L10;
                                } else {
                                  this.field_g[var10] = -1;
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
                          if (this.field_o <= var10) {
                            break L24;
                          } else {
                            this.field_g[this.field_k[var10]] = var17.e(119);
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
                        this.field_b = new pla(this.field_g);
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
                                  if (this.field_o <= var10) {
                                    break L31;
                                  } else {
                                    this.field_j[this.field_k[var10]] = var17.e(-69);
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
                                    if ((this.field_o ^ -1) >= (var10 ^ -1)) {
                                      break L29;
                                    } else {
                                      this.field_f[this.field_k[var10]] = var17.e(95);
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
                                    if ((this.field_o ^ -1) >= (var10 ^ -1)) {
                                      break L35;
                                    } else {
                                      var22 = new byte[64];
                                      var18.a(var22, 0, -106, 64);
                                      this.field_h[this.field_k[var10]] = var22;
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
                                  if ((this.field_o ^ -1) >= (var10 ^ -1)) {
                                    break L29;
                                  } else {
                                    this.field_f[this.field_k[var10]] = var17.e(95);
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
                                    if ((this.field_o ^ -1) >= (var10 ^ -1)) {
                                      break L39;
                                    } else {
                                      this.field_c[this.field_k[var10]] = var17.d(123);
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
                                    if ((this.field_o ^ -1) >= (var10 ^ -1)) {
                                      break L41;
                                    } else {
                                      var11 = this.field_k[var10];
                                      var12 = this.field_c[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      array$9 = new int[var12];
                                      this.field_n[var11] = array$9;
                                      stackOut_86_0 = 0;
                                      stackIn_119_0 = stackOut_86_0;
                                      stackIn_87_0 = stackOut_86_0;
                                      if (var16 != 0) {
                                        break L26;
                                      } else {
                                        var14 = stackIn_87_0;
                                        L42: while (true) {
                                          L43: {
                                            L44: {
                                              if ((var12 ^ -1) >= (var14 ^ -1)) {
                                                break L44;
                                              } else {
                                                dupTemp$10 = var8 + var17.d(123);
                                                var8 = dupTemp$10;
                                                this.field_n[var11][var14] = dupTemp$10;
                                                var15 = dupTemp$10;
                                                stackOut_89_0 = var13;
                                                stackOut_89_1 = var15;
                                                stackIn_94_0 = stackOut_89_0;
                                                stackIn_94_1 = stackOut_89_1;
                                                stackIn_90_0 = stackOut_89_0;
                                                stackIn_90_1 = stackOut_89_1;
                                                if (var16 != 0) {
                                                  break L43;
                                                } else {
                                                  L45: {
                                                    if (stackIn_90_0 >= stackIn_90_1) {
                                                      break L45;
                                                    } else {
                                                      var13 = var15;
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
                                            this.field_p[var11] = var13 + 1;
                                            stackOut_93_0 = var12 ^ -1;
                                            stackOut_93_1 = 1 + var13 ^ -1;
                                            stackIn_94_0 = stackOut_93_0;
                                            stackIn_94_1 = stackOut_93_1;
                                            break L43;
                                          }
                                          L46: {
                                            if (stackIn_94_0 == stackIn_94_1) {
                                              this.field_n[var11] = null;
                                              break L46;
                                            } else {
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
                                if (this.field_o <= var10) {
                                  break L49;
                                } else {
                                  this.field_c[this.field_k[var10]] = var17.g(-48);
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
                              if (this.field_o <= var10) {
                                break L27;
                              } else {
                                var11 = this.field_k[var10];
                                var8 = 0;
                                var12 = this.field_c[var11];
                                var13 = -1;
                                array$11 = new int[var12];
                                this.field_n[var11] = array$11;
                                stackOut_107_0 = 0;
                                stackIn_119_0 = stackOut_107_0;
                                stackIn_108_0 = stackOut_107_0;
                                if (var16 != 0) {
                                  break L26;
                                } else {
                                  var14 = stackIn_108_0;
                                  L51: while (true) {
                                    L52: {
                                      L53: {
                                        if ((var14 ^ -1) <= (var12 ^ -1)) {
                                          break L53;
                                        } else {
                                          dupTemp$12 = var8 + var17.g(-48);
                                          var8 = dupTemp$12;
                                          this.field_n[var11][var14] = dupTemp$12;
                                          var15 = dupTemp$12;
                                          stackOut_110_0 = var15;
                                          stackOut_110_1 = var13;
                                          stackIn_115_0 = stackOut_110_0;
                                          stackIn_115_1 = stackOut_110_1;
                                          stackIn_111_0 = stackOut_110_0;
                                          stackIn_111_1 = stackOut_110_1;
                                          if (var16 != 0) {
                                            break L52;
                                          } else {
                                            L54: {
                                              if (stackIn_111_0 <= stackIn_111_1) {
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
                                      this.field_p[var11] = var13 + 1;
                                      stackOut_114_0 = 1 + var13;
                                      stackOut_114_1 = var12;
                                      stackIn_115_0 = stackOut_114_0;
                                      stackIn_115_1 = stackOut_114_1;
                                      break L52;
                                    }
                                    L55: {
                                      if (stackIn_115_0 != stackIn_115_1) {
                                        break L55;
                                      } else {
                                        this.field_n[var11] = null;
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
                        stackOut_118_0 = var6;
                        stackIn_119_0 = stackOut_118_0;
                        break L26;
                      }
                      L56: {
                        if (stackIn_119_0 != 0) {
                          this.field_e = new pla[var9 - -1];
                          this.field_m = new int[1 + var9][];
                          var10 = 0;
                          L57: while (true) {
                            L58: {
                              if (var10 >= this.field_o) {
                                break L58;
                              } else {
                                var11 = this.field_k[var10];
                                var12 = this.field_c[var11];
                                array$13 = new int[this.field_p[var11]];
                                this.field_m[var11] = array$13;
                                if (var16 != 0) {
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                } else {
                                  var13 = 0;
                                  L59: while (true) {
                                    L60: {
                                      L61: {
                                        if (this.field_p[var11] <= var13) {
                                          break L61;
                                        } else {
                                          this.field_m[var11][var13] = -1;
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
                                        L64: {
                                          if (var13 >= var12) {
                                            break L64;
                                          } else {
                                            if (var16 != 0) {
                                              break L63;
                                            } else {
                                              L65: {
                                                L66: {
                                                  if (null == this.field_n[var11]) {
                                                    break L66;
                                                  } else {
                                                    var14 = this.field_n[var11][var13];
                                                    if (var16 == 0) {
                                                      break L65;
                                                    } else {
                                                      break L66;
                                                    }
                                                  }
                                                }
                                                var14 = var13;
                                                break L65;
                                              }
                                              this.field_m[var11][var14] = var17.e(kha.b(param0, 23927));
                                              var13++;
                                              if (var16 == 0) {
                                                continue L62;
                                              } else {
                                                break L64;
                                              }
                                            }
                                          }
                                        }
                                        this.field_e[var11] = new pla(this.field_m[var11]);
                                        var10++;
                                        break L63;
                                      }
                                      if (var16 == 0) {
                                        continue L57;
                                      } else {
                                        break L58;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            break L56;
                          }
                        } else {
                          break L56;
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
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L67: {
            var3 = decompiledCaughtException;
            stackOut_140_0 = (RuntimeException) (var3);
            stackOut_140_1 = new StringBuilder().append("dla.A(").append(param0).append(',');
            stackIn_142_0 = stackOut_140_0;
            stackIn_142_1 = stackOut_140_1;
            stackIn_141_0 = stackOut_140_0;
            stackIn_141_1 = stackOut_140_1;
            if (param1 == null) {
              stackOut_142_0 = (RuntimeException) ((Object) stackIn_142_0);
              stackOut_142_1 = (StringBuilder) ((Object) stackIn_142_1);
              stackOut_142_2 = "null";
              stackIn_143_0 = stackOut_142_0;
              stackIn_143_1 = stackOut_142_1;
              stackIn_143_2 = stackOut_142_2;
              break L67;
            } else {
              stackOut_141_0 = (RuntimeException) ((Object) stackIn_141_0);
              stackOut_141_1 = (StringBuilder) ((Object) stackIn_141_1);
              stackOut_141_2 = "{...}";
              stackIn_143_0 = stackOut_141_0;
              stackIn_143_1 = stackOut_141_1;
              stackIn_143_2 = stackOut_141_2;
              break L67;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_143_0), stackIn_143_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static int a(int param0) {
        if (cga.field_f < 2) {
          return 0;
        } else {
          L0: {
            if (bg.field_t == 0) {
              if (!tk.field_b.b(-100)) {
                return 20;
              } else {
                if (tk.field_b.c("commonui", param0 ^ -122)) {
                  if (!hm.field_n.b(param0 + -100)) {
                    return 50;
                  } else {
                    if (hm.field_n.c("commonui", -126)) {
                      if (!vc.field_p.b(param0 ^ -123)) {
                        return 70;
                      } else {
                        if (!vc.field_p.a(0)) {
                          return 80;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      return 60;
                    }
                  }
                } else {
                  return 40;
                }
              }
            } else {
              L1: {
                if (nja.field_J != null) {
                  if (nja.field_J.b(-37)) {
                    if (nja.field_J.a("", 127)) {
                      if (nja.field_J.c("", -127)) {
                        break L1;
                      } else {
                        return 29;
                      }
                    } else {
                      return 29;
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L1;
                }
              }
              if (tk.field_b.b(param0 + -130)) {
                if (tk.field_b.c("commonui", -128)) {
                  if (hm.field_n.b(param0 + -42)) {
                    if (hm.field_n.c("commonui", -124)) {
                      if (vc.field_p.b(-128)) {
                        if (vc.field_p.a(0)) {
                          break L0;
                        } else {
                          return 86;
                        }
                      } else {
                        return 82;
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                } else {
                  return 57;
                }
              } else {
                return 43;
              }
            }
          }
          if (param0 == 7) {
            return 100;
          } else {
            return 91;
          }
        }
    }

    final static void b(int param0) {
        int discarded$0 = 0;
        if (!(!vo.field_b)) {
            bea.d(bea.field_b, bea.field_h, bea.field_d + -bea.field_b, bea.field_k + -bea.field_h);
            rua.field_gb.b(36, false);
        }
        if (param0 != 23713) {
            discarded$0 = dla.a(120);
        }
    }

    dla(byte[] param0, int param1, byte[] param2) {
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
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.field_d = sq.a(param0.length, param0, (byte) -124);
            if ((param1 ^ -1) == (this.field_d ^ -1)) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if ((param2.length ^ -1) == -65) {
                      this.field_i = fja.a(param0.length, param0, 0, 8);
                      var4_int = 0;
                      L3: while (true) {
                        if (-65 >= (var4_int ^ -1)) {
                          break L2;
                        } else {
                          stackOut_8_0 = this;
                          stackIn_13_0 = stackOut_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          if (var5 != 0) {
                            break L1;
                          } else {
                            if (((dla) (this)).field_i[var4_int] == param2[var4_int]) {
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
              this.a(-23918, param0);
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
            stackOut_15_1 = new StringBuilder().append("dla.<init>(");
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
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    static {
    }
}
