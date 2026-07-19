/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm {
    static String[] field_w;
    byte[][] field_v;
    lr field_l;
    int[] field_e;
    int[] field_q;
    static je field_b;
    private int[] field_m;
    int field_s;
    private int[][] field_j;
    private byte[] field_n;
    static at field_o;
    static String field_d;
    lr[] field_f;
    static String field_u;
    private int field_r;
    int field_i;
    int[] field_p;
    int[][] field_a;
    int[] field_t;
    int field_c;
    static boolean field_g;
    static volatile int field_k;
    int[] field_h;

    private final void a(byte[] param0, boolean param1) {
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
        byte[] var17 = null;
        vh var18 = null;
        vh var19 = null;
        byte[] var23 = null;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_113_0 = 0;
        int[] stackIn_117_0 = null;
        int[] stackIn_127_0 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        String stackIn_136_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_112_0 = 0;
        int[] stackOut_116_0 = null;
        int[] stackOut_126_0 = null;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        RuntimeException stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        String stackOut_135_2 = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        String stackOut_134_2 = null;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var18 = new vh(el.a(param1, param0));
              var19 = var18;
              var4 = var19.k(0);
              if (5 > var4) {
                break L1;
              } else {
                if ((var4 ^ -1) >= -8) {
                  L2: {
                    L3: {
                      if (var4 >= 6) {
                        break L3;
                      } else {
                        this.field_c = 0;
                        if (var16 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_c = var19.i(1);
                    break L2;
                  }
                  L4: {
                    var5 = var19.k(0);
                    if ((var5 & 1) == 0) {
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
                    if ((var5 & 2 ^ -1) == -1) {
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
                      if (7 > var4) {
                        break L7;
                      } else {
                        this.field_r = var19.f((byte) 111);
                        if (var16 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    this.field_r = var19.e((byte) -104);
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
                                this.field_q = new int[this.field_r];
                                var9 = -1;
                                if (-8 < (var4 ^ -1)) {
                                  break L14;
                                } else {
                                  var10 = 0;
                                  L15: while (true) {
                                    L16: {
                                      if ((this.field_r ^ -1) >= (var10 ^ -1)) {
                                        break L16;
                                      } else {
                                        dupTemp$7 = var8 + var18.f((byte) 101);
                                        var8 = dupTemp$7;
                                        this.field_q[var10] = dupTemp$7;
                                        stackOut_22_0 = var9;
                                        stackOut_22_1 = this.field_q[var10];
                                        stackIn_55_0 = stackOut_22_0;
                                        stackIn_55_1 = stackOut_22_1;
                                        stackIn_23_0 = stackOut_22_0;
                                        stackIn_23_1 = stackOut_22_1;
                                        if (var16 != 0) {
                                          break L13;
                                        } else {
                                          L17: {
                                            if (stackIn_23_0 < stackIn_23_1) {
                                              var9 = this.field_q[var10];
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
                                if (this.field_r <= var10) {
                                  break L12;
                                } else {
                                  dupTemp$8 = var8 + var18.e((byte) -104);
                                  var8 = dupTemp$8;
                                  this.field_q[var10] = dupTemp$8;
                                  stackOut_30_0 = this.field_q[var10] ^ -1;
                                  stackOut_30_1 = var9 ^ -1;
                                  stackIn_55_0 = stackOut_30_0;
                                  stackIn_55_1 = stackOut_30_1;
                                  stackIn_31_0 = stackOut_30_0;
                                  stackIn_31_1 = stackOut_30_1;
                                  if (var16 != 0) {
                                    break L13;
                                  } else {
                                    L19: {
                                      if (stackIn_31_0 < stackIn_31_1) {
                                        var9 = this.field_q[var10];
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
                              if (stackIn_55_0 <= stackIn_55_1) {
                                break L10;
                              } else {
                                this.field_e[this.field_q[var10]] = var18.i(1);
                                var10++;
                                if (var16 != 0) {
                                  break L9;
                                } else {
                                  if (var16 == 0) {
                                    stackOut_54_0 = var10 ^ -1;
                                    stackOut_54_1 = this.field_r ^ -1;
                                    stackIn_55_0 = stackOut_54_0;
                                    stackIn_55_1 = stackOut_54_1;
                                    continue L20;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                          }
                          L21: {
                            this.field_i = var9 + 1;
                            if (!param1) {
                              break L21;
                            } else {
                              var17 = (byte[]) null;
                              this.a((byte[]) null, true);
                              break L21;
                            }
                          }
                          L22: {
                            this.field_e = new int[this.field_i];
                            this.field_h = new int[this.field_i];
                            this.field_a = new int[this.field_i][];
                            if (var7 != 0) {
                              this.field_v = new byte[this.field_i][];
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          L23: {
                            this.field_p = new int[this.field_i];
                            this.field_t = new int[this.field_i];
                            if (var6 == 0) {
                              break L23;
                            } else {
                              this.field_m = new int[this.field_i];
                              var10 = 0;
                              L24: while (true) {
                                L25: {
                                  L26: {
                                    if (var10 >= this.field_i) {
                                      break L26;
                                    } else {
                                      this.field_m[var10] = -1;
                                      var10++;
                                      if (var16 != 0) {
                                        break L25;
                                      } else {
                                        if (var16 == 0) {
                                          continue L24;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  var10 = 0;
                                  break L25;
                                }
                                L27: while (true) {
                                  L28: {
                                    if ((this.field_r ^ -1) >= (var10 ^ -1)) {
                                      break L28;
                                    } else {
                                      this.field_m[this.field_q[var10]] = var18.i(1);
                                      var10++;
                                      if (var16 != 0) {
                                        break L23;
                                      } else {
                                        if (var16 == 0) {
                                          continue L27;
                                        } else {
                                          break L28;
                                        }
                                      }
                                    }
                                  }
                                  this.field_l = new lr(this.field_m);
                                  break L23;
                                }
                              }
                            }
                          }
                          var10 = 0;
                          L29: while (true) {
                            stackOut_54_0 = var10 ^ -1;
                            stackOut_54_1 = this.field_r ^ -1;
                            stackIn_55_0 = stackOut_54_0;
                            stackIn_55_1 = stackOut_54_1;
                            if (stackIn_55_0 <= stackIn_55_1) {
                              break L10;
                            } else {
                              this.field_e[this.field_q[var10]] = var18.i(1);
                              var10++;
                              if (var16 != 0) {
                                break L9;
                              } else {
                                if (var16 == 0) {
                                  continue L29;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                        }
                        break L10;
                      }
                      if (var7 == 0) {
                        break L9;
                      } else {
                        var10 = 0;
                        L30: while (true) {
                          if (var10 >= this.field_r) {
                            break L9;
                          } else {
                            var23 = new byte[64];
                            var19.a(0, 64, 0, var23);
                            this.field_v[this.field_q[var10]] = var23;
                            var10++;
                            if (var16 != 0) {
                              break L8;
                            } else {
                              if (var16 == 0) {
                                continue L30;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                    }
                    var10 = 0;
                    break L8;
                  }
                  L31: while (true) {
                    L32: {
                      L33: {
                        L34: {
                          L35: {
                            if (var10 >= this.field_r) {
                              break L35;
                            } else {
                              this.field_t[this.field_q[var10]] = var18.i(1);
                              var10++;
                              if (var16 != 0) {
                                break L34;
                              } else {
                                if (var16 == 0) {
                                  continue L31;
                                } else {
                                  break L35;
                                }
                              }
                            }
                          }
                          if (var4 >= 7) {
                            break L34;
                          } else {
                            var10 = 0;
                            L36: while (true) {
                              L37: {
                                L38: {
                                  if ((this.field_r ^ -1) >= (var10 ^ -1)) {
                                    break L38;
                                  } else {
                                    this.field_p[this.field_q[var10]] = var18.e((byte) -104);
                                    var10++;
                                    if (var16 != 0) {
                                      break L37;
                                    } else {
                                      if (var16 == 0) {
                                        continue L36;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                }
                                var10 = 0;
                                break L37;
                              }
                              L39: while (true) {
                                L40: {
                                  if (var10 >= this.field_r) {
                                    break L40;
                                  } else {
                                    var11 = this.field_q[var10];
                                    var8 = 0;
                                    var12 = this.field_p[var11];
                                    var13 = -1;
                                    array$9 = new int[var12];
                                    this.field_a[var11] = array$9;
                                    stackOut_80_0 = 0;
                                    stackIn_113_0 = stackOut_80_0;
                                    stackIn_81_0 = stackOut_80_0;
                                    if (var16 != 0) {
                                      break L32;
                                    } else {
                                      var14 = stackIn_81_0;
                                      L41: while (true) {
                                        L42: {
                                          L43: {
                                            if ((var12 ^ -1) >= (var14 ^ -1)) {
                                              break L43;
                                            } else {
                                              dupTemp$10 = var8 + var18.e((byte) -104);
                                              var8 = dupTemp$10;
                                              this.field_a[var11][var14] = dupTemp$10;
                                              var15 = dupTemp$10;
                                              stackOut_83_0 = var15;
                                              stackOut_83_1 = var13;
                                              stackIn_88_0 = stackOut_83_0;
                                              stackIn_88_1 = stackOut_83_1;
                                              stackIn_84_0 = stackOut_83_0;
                                              stackIn_84_1 = stackOut_83_1;
                                              if (var16 != 0) {
                                                break L42;
                                              } else {
                                                L44: {
                                                  if (stackIn_84_0 <= stackIn_84_1) {
                                                    break L44;
                                                  } else {
                                                    var13 = var15;
                                                    break L44;
                                                  }
                                                }
                                                var14++;
                                                if (var16 == 0) {
                                                  continue L41;
                                                } else {
                                                  break L43;
                                                }
                                              }
                                            }
                                          }
                                          this.field_h[var11] = var13 + 1;
                                          stackOut_87_0 = var12;
                                          stackOut_87_1 = 1 + var13;
                                          stackIn_88_0 = stackOut_87_0;
                                          stackIn_88_1 = stackOut_87_1;
                                          break L42;
                                        }
                                        L45: {
                                          if (stackIn_88_0 != stackIn_88_1) {
                                            break L45;
                                          } else {
                                            this.field_a[var11] = null;
                                            break L45;
                                          }
                                        }
                                        var10++;
                                        if (var16 == 0) {
                                          continue L39;
                                        } else {
                                          break L40;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var16 == 0) {
                                  break L33;
                                } else {
                                  break L34;
                                }
                              }
                            }
                          }
                        }
                        var10 = 0;
                        L46: while (true) {
                          L47: {
                            L48: {
                              if ((this.field_r ^ -1) >= (var10 ^ -1)) {
                                break L48;
                              } else {
                                this.field_p[this.field_q[var10]] = var18.f((byte) 102);
                                var10++;
                                if (var16 != 0) {
                                  break L47;
                                } else {
                                  if (var16 == 0) {
                                    continue L46;
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                            }
                            var10 = 0;
                            break L47;
                          }
                          L49: while (true) {
                            if ((var10 ^ -1) <= (this.field_r ^ -1)) {
                              break L33;
                            } else {
                              var11 = this.field_q[var10];
                              var8 = 0;
                              var12 = this.field_p[var11];
                              array$11 = new int[var12];
                              this.field_a[var11] = array$11;
                              var13 = -1;
                              stackOut_100_0 = 0;
                              stackIn_113_0 = stackOut_100_0;
                              stackIn_101_0 = stackOut_100_0;
                              if (var16 != 0) {
                                break L32;
                              } else {
                                var14 = stackIn_101_0;
                                L50: while (true) {
                                  L51: {
                                    L52: {
                                      if (var14 >= var12) {
                                        break L52;
                                      } else {
                                        dupTemp$12 = var8 + var18.f((byte) 125);
                                        var8 = dupTemp$12;
                                        this.field_a[var11][var14] = dupTemp$12;
                                        var15 = dupTemp$12;
                                        stackOut_103_0 = var15 ^ -1;
                                        stackOut_103_1 = var13 ^ -1;
                                        stackIn_109_0 = stackOut_103_0;
                                        stackIn_109_1 = stackOut_103_1;
                                        stackIn_104_0 = stackOut_103_0;
                                        stackIn_104_1 = stackOut_103_1;
                                        if (var16 != 0) {
                                          break L51;
                                        } else {
                                          L53: {
                                            if (stackIn_104_0 < stackIn_104_1) {
                                              var13 = var15;
                                              break L53;
                                            } else {
                                              break L53;
                                            }
                                          }
                                          var14++;
                                          if (var16 == 0) {
                                            continue L50;
                                          } else {
                                            break L52;
                                          }
                                        }
                                      }
                                    }
                                    this.field_h[var11] = var13 + 1;
                                    stackOut_108_0 = var12 ^ -1;
                                    stackOut_108_1 = 1 + var13 ^ -1;
                                    stackIn_109_0 = stackOut_108_0;
                                    stackIn_109_1 = stackOut_108_1;
                                    break L51;
                                  }
                                  L54: {
                                    if (stackIn_109_0 != stackIn_109_1) {
                                      break L54;
                                    } else {
                                      this.field_a[var11] = null;
                                      break L54;
                                    }
                                  }
                                  var10++;
                                  if (var16 == 0) {
                                    continue L49;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_112_0 = var6;
                      stackIn_113_0 = stackOut_112_0;
                      break L32;
                    }
                    L55: {
                      if (stackIn_113_0 == 0) {
                        break L55;
                      } else {
                        this.field_j = new int[var9 + 1][];
                        this.field_f = new lr[1 + var9];
                        var10 = 0;
                        L56: while (true) {
                          if ((var10 ^ -1) <= (this.field_r ^ -1)) {
                            break L55;
                          } else {
                            var11 = this.field_q[var10];
                            stackOut_116_0 = this.field_p;
                            stackIn_117_0 = stackOut_116_0;
                            L57: while (true) {
                              var12 = stackIn_117_0[var11];
                              array$13 = new int[this.field_h[var11]];
                              this.field_j[var11] = array$13;
                              if (var16 != 0) {
                                decompiledRegionSelector0 = 0;
                                break L0;
                              } else {
                                var13 = 0;
                                L58: while (true) {
                                  L59: {
                                    L60: {
                                      if (this.field_h[var11] <= var13) {
                                        break L60;
                                      } else {
                                        this.field_j[var11][var13] = -1;
                                        var13++;
                                        if (var16 != 0) {
                                          break L59;
                                        } else {
                                          if (var16 == 0) {
                                            continue L58;
                                          } else {
                                            break L60;
                                          }
                                        }
                                      }
                                    }
                                    var13 = 0;
                                    break L59;
                                  }
                                  L61: while (true) {
                                    L62: {
                                      if ((var13 ^ -1) <= (var12 ^ -1)) {
                                        break L62;
                                      } else {
                                        stackOut_126_0 = this.field_a[var11];
                                        stackIn_117_0 = stackOut_126_0;
                                        stackIn_127_0 = stackOut_126_0;
                                        if (var16 != 0) {
                                          continue L57;
                                        } else {
                                          L63: {
                                            L64: {
                                              if (stackIn_127_0 == null) {
                                                break L64;
                                              } else {
                                                var14 = this.field_a[var11][var13];
                                                if (var16 == 0) {
                                                  break L63;
                                                } else {
                                                  break L64;
                                                }
                                              }
                                            }
                                            var14 = var13;
                                            break L63;
                                          }
                                          this.field_j[var11][var14] = var18.i(1);
                                          var13++;
                                          if (var16 == 0) {
                                            continue L61;
                                          } else {
                                            break L62;
                                          }
                                        }
                                      }
                                    }
                                    this.field_f[var11] = new lr(this.field_j[var11]);
                                    var10++;
                                    if (var16 == 0) {
                                      continue L56;
                                    } else {
                                      break L55;
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
          L65: {
            var3 = decompiledCaughtException;
            stackOut_133_0 = (RuntimeException) (var3);
            stackOut_133_1 = new StringBuilder().append("jm.B(");
            stackIn_135_0 = stackOut_133_0;
            stackIn_135_1 = stackOut_133_1;
            stackIn_134_0 = stackOut_133_0;
            stackIn_134_1 = stackOut_133_1;
            if (param0 == null) {
              stackOut_135_0 = (RuntimeException) ((Object) stackIn_135_0);
              stackOut_135_1 = (StringBuilder) ((Object) stackIn_135_1);
              stackOut_135_2 = "null";
              stackIn_136_0 = stackOut_135_0;
              stackIn_136_1 = stackOut_135_1;
              stackIn_136_2 = stackOut_135_2;
              break L65;
            } else {
              stackOut_134_0 = (RuntimeException) ((Object) stackIn_134_0);
              stackOut_134_1 = (StringBuilder) ((Object) stackIn_134_1);
              stackOut_134_2 = "{...}";
              stackIn_136_0 = stackOut_134_0;
              stackIn_136_1 = stackOut_134_1;
              stackIn_136_2 = stackOut_134_2;
              break L65;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_136_0), stackIn_136_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            vh.a(0, df.field_T, false, pd.field_e, kt.field_p, param0, true);
            var2_int = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if ((kt.field_p ^ -1) >= (var2_int ^ -1)) {
                    break L3;
                  } else {
                    vt.field_m[param0 + var2_int] = var2_int;
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                vh.a(param0, se.field_e, false, sq.field_k, kt.field_p + param0, param0 + param0, false);
                break L2;
              }
              L4: {
                if (param0 < kt.field_p) {
                  kt.field_p = param0;
                  break L4;
                } else {
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "jm.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(je param0, int param1) {
        RuntimeException runtimeException = null;
        int var3 = 0;
        je var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = (je) ((Object) param0.field_fb.e((byte) 121));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    var4.field_nb = 0;
                    var4.field_ob = 0;
                    var4.field_db = 0;
                    var4.field_ab = 0;
                    var4 = (je) ((Object) param0.field_fb.a((byte) 123));
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                param0.field_nb = 0;
                param0.field_ob = 0;
                param0.field_ab = 0;
                break L2;
              }
              if (param1 <= -42) {
                param0.field_db = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("jm.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_w = null;
        field_u = null;
        if (param0 > -48) {
            return;
        }
        field_o = null;
        field_d = null;
        field_b = null;
    }

    jm(byte[] param0, int param1, byte[] param2) {
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
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.field_s = pk.a(param0, param0.length, 120);
            if (this.field_s == param1) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (64 == param2.length) {
                      this.field_n = ua.a(-18423, param0.length, param0, 0);
                      var4_int = 0;
                      L3: while (true) {
                        if (64 <= var4_int) {
                          break L2;
                        } else {
                          stackOut_8_0 = this;
                          stackIn_13_0 = stackOut_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          if (var5 != 0) {
                            break L1;
                          } else {
                            if (((jm) (this)).field_n[var4_int] == param2[var4_int]) {
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
              this.a(param0, false);
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
            stackOut_15_1 = new StringBuilder().append("jm.<init>(");
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
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_w = new String[]{"Player_1", "Player_2", "Player_3", "Player_4", "Player_5", "Player_6", "Player_7", "Player_8"};
        field_u = "Remove name";
        field_d = "Accessories";
        field_g = false;
        field_o = new at();
        field_k = 0;
    }
}
