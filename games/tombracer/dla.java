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
        RuntimeException var3 = null;
        uia var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        byte[] var11_ref_byte__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_130_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        int stackIn_144_0 = 0;
        RuntimeException stackIn_170_0 = null;
        StringBuilder stackIn_170_1 = null;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        RuntimeException stackIn_173_0 = null;
        StringBuilder stackIn_173_1 = null;
        String stackIn_173_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_129_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        int stackOut_138_0 = 0;
        int stackOut_138_1 = 0;
        int stackOut_143_0 = 0;
        RuntimeException stackOut_169_0 = null;
        StringBuilder stackOut_169_1 = null;
        RuntimeException stackOut_172_0 = null;
        StringBuilder stackOut_172_1 = null;
        String stackOut_172_2 = null;
        RuntimeException stackOut_170_0 = null;
        StringBuilder stackOut_170_1 = null;
        String stackOut_170_2 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_ref = new uia(sua.a(param1, -106));
            if (param0 == -23918) {
              L1: {
                var4 = var3_ref.h(255);
                if (5 > var4) {
                  break L1;
                } else {
                  if (var4 <= 7) {
                    L2: {
                      L3: {
                        if (6 <= var4) {
                          break L3;
                        } else {
                          ((dla) this).field_a = 0;
                          if (var16 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((dla) this).field_a = var3_ref.e(param0 ^ 23871);
                      break L2;
                    }
                    L4: {
                      var5 = var3_ref.h(255);
                      if (0 == (1 & var5)) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L4;
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_19_0 = stackOut_16_0;
                        break L4;
                      }
                    }
                    L5: {
                      var6 = stackIn_19_0;
                      if (0 == (2 & var5)) {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        break L5;
                      } else {
                        stackOut_20_0 = 1;
                        stackIn_23_0 = stackOut_20_0;
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        var7 = stackIn_23_0;
                        if (var4 < 7) {
                          break L7;
                        } else {
                          ((dla) this).field_o = var3_ref.g(-48);
                          if (var16 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      ((dla) this).field_o = var3_ref.d(127);
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
                                  ((dla) this).field_k = new int[((dla) this).field_o];
                                  if (7 > var4) {
                                    break L14;
                                  } else {
                                    var10 = 0;
                                    L15: while (true) {
                                      L16: {
                                        if (((dla) this).field_o <= var10) {
                                          break L16;
                                        } else {
                                          int dupTemp$4 = var8 + var3_ref.g(-48);
                                          var8 = dupTemp$4;
                                          ((dla) this).field_k[var10] = dupTemp$4;
                                          stackOut_32_0 = var9;
                                          stackOut_32_1 = ((dla) this).field_k[var10];
                                          stackIn_58_0 = stackOut_32_0;
                                          stackIn_58_1 = stackOut_32_1;
                                          stackIn_33_0 = stackOut_32_0;
                                          stackIn_33_1 = stackOut_32_1;
                                          if (var16 != 0) {
                                            break L13;
                                          } else {
                                            L17: {
                                              if (stackIn_33_0 < stackIn_33_1) {
                                                var9 = ((dla) this).field_k[var10];
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
                                  if (~var10 <= ~((dla) this).field_o) {
                                    break L12;
                                  } else {
                                    int dupTemp$5 = var8 + var3_ref.d(125);
                                    var8 = dupTemp$5;
                                    ((dla) this).field_k[var10] = dupTemp$5;
                                    stackOut_42_0 = ~((dla) this).field_k[var10];
                                    stackOut_42_1 = ~var9;
                                    stackIn_58_0 = stackOut_42_0;
                                    stackIn_58_1 = stackOut_42_1;
                                    stackIn_43_0 = stackOut_42_0;
                                    stackIn_43_1 = stackOut_42_1;
                                    if (var16 != 0) {
                                      break L13;
                                    } else {
                                      L19: {
                                        if (stackIn_43_0 < stackIn_43_1) {
                                          var9 = ((dla) this).field_k[var10];
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
                                if (stackIn_58_0 >= stackIn_58_1) {
                                  break L10;
                                } else {
                                  ((dla) this).field_g[var10] = -1;
                                  var10++;
                                  if (var16 != 0) {
                                    break L9;
                                  } else {
                                    if (var16 == 0) {
                                      stackOut_57_0 = var10;
                                      stackOut_57_1 = ((dla) this).field_l;
                                      stackIn_58_0 = stackOut_57_0;
                                      stackIn_58_1 = stackOut_57_1;
                                      continue L20;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                            L21: {
                              ((dla) this).field_l = var9 - -1;
                              ((dla) this).field_f = new int[((dla) this).field_l];
                              if (var7 != 0) {
                                ((dla) this).field_h = new byte[((dla) this).field_l][];
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            ((dla) this).field_c = new int[((dla) this).field_l];
                            ((dla) this).field_p = new int[((dla) this).field_l];
                            ((dla) this).field_n = new int[((dla) this).field_l][];
                            ((dla) this).field_j = new int[((dla) this).field_l];
                            if (var6 != 0) {
                              ((dla) this).field_g = new int[((dla) this).field_l];
                              var10 = 0;
                              L22: while (true) {
                                stackOut_57_0 = var10;
                                stackOut_57_1 = ((dla) this).field_l;
                                stackIn_58_0 = stackOut_57_0;
                                stackIn_58_1 = stackOut_57_1;
                                if (stackIn_58_0 >= stackIn_58_1) {
                                  break L10;
                                } else {
                                  ((dla) this).field_g[var10] = -1;
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
                          if (((dla) this).field_o <= var10) {
                            break L24;
                          } else {
                            ((dla) this).field_g[((dla) this).field_k[var10]] = var3_ref.e(119);
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
                        ((dla) this).field_b = new pla(((dla) this).field_g);
                        break L8;
                      }
                    }
                    var10 = 0;
                    L25: while (true) {
                      L26: {
                        L27: {
                          L28: {
                            L29: {
                              if (((dla) this).field_o <= var10) {
                                break L29;
                              } else {
                                ((dla) this).field_j[((dla) this).field_k[var10]] = var3_ref.e(-69);
                                var10++;
                                if (var16 != 0) {
                                  break L28;
                                } else {
                                  if (var16 == 0) {
                                    continue L25;
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                            }
                            if (var7 != 0) {
                              break L28;
                            } else {
                              break L27;
                            }
                          }
                          var10 = 0;
                          L30: while (true) {
                            if (~((dla) this).field_o >= ~var10) {
                              break L27;
                            } else {
                              var11_ref_byte__ = new byte[64];
                              var3_ref.a(var11_ref_byte__, 0, -106, 64);
                              ((dla) this).field_h[((dla) this).field_k[var10]] = var11_ref_byte__;
                              var10++;
                              if (var16 != 0) {
                                break L26;
                              } else {
                                if (var16 == 0) {
                                  continue L30;
                                } else {
                                  break L27;
                                }
                              }
                            }
                          }
                        }
                        var10 = 0;
                        break L26;
                      }
                      L31: while (true) {
                        L32: {
                          L33: {
                            L34: {
                              L35: {
                                if (~((dla) this).field_o >= ~var10) {
                                  break L35;
                                } else {
                                  ((dla) this).field_f[((dla) this).field_k[var10]] = var3_ref.e(95);
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
                                      if (~((dla) this).field_o >= ~var10) {
                                        break L38;
                                      } else {
                                        ((dla) this).field_c[((dla) this).field_k[var10]] = var3_ref.d(123);
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
                                      if (~((dla) this).field_o >= ~var10) {
                                        break L40;
                                      } else {
                                        var11 = ((dla) this).field_k[var10];
                                        var12 = ((dla) this).field_c[var11];
                                        var8 = 0;
                                        var13 = -1;
                                        ((dla) this).field_n[var11] = new int[var12];
                                        stackOut_106_0 = 0;
                                        stackIn_144_0 = stackOut_106_0;
                                        stackIn_107_0 = stackOut_106_0;
                                        if (var16 != 0) {
                                          break L32;
                                        } else {
                                          var14 = stackIn_107_0;
                                          L41: while (true) {
                                            L42: {
                                              L43: {
                                                if (~var12 >= ~var14) {
                                                  break L43;
                                                } else {
                                                  int dupTemp$6 = var8 + var3_ref.d(123);
                                                  var8 = dupTemp$6;
                                                  ((dla) this).field_n[var11][var14] = dupTemp$6;
                                                  var15 = dupTemp$6;
                                                  stackOut_109_0 = var13;
                                                  stackOut_109_1 = var15;
                                                  stackIn_116_0 = stackOut_109_0;
                                                  stackIn_116_1 = stackOut_109_1;
                                                  stackIn_110_0 = stackOut_109_0;
                                                  stackIn_110_1 = stackOut_109_1;
                                                  if (var16 != 0) {
                                                    break L42;
                                                  } else {
                                                    L44: {
                                                      if (stackIn_110_0 >= stackIn_110_1) {
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
                                              ((dla) this).field_p[var11] = var13 + 1;
                                              stackOut_115_0 = ~var12;
                                              stackOut_115_1 = ~(1 + var13);
                                              stackIn_116_0 = stackOut_115_0;
                                              stackIn_116_1 = stackOut_115_1;
                                              break L42;
                                            }
                                            L45: {
                                              if (stackIn_116_0 == stackIn_116_1) {
                                                ((dla) this).field_n[var11] = null;
                                                break L45;
                                              } else {
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
                                  if (((dla) this).field_o <= var10) {
                                    break L48;
                                  } else {
                                    ((dla) this).field_c[((dla) this).field_k[var10]] = var3_ref.g(-48);
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
                                if (((dla) this).field_o <= var10) {
                                  break L33;
                                } else {
                                  var11 = ((dla) this).field_k[var10];
                                  var8 = 0;
                                  var12 = ((dla) this).field_c[var11];
                                  var13 = -1;
                                  ((dla) this).field_n[var11] = new int[var12];
                                  stackOut_129_0 = 0;
                                  stackIn_144_0 = stackOut_129_0;
                                  stackIn_130_0 = stackOut_129_0;
                                  if (var16 != 0) {
                                    break L32;
                                  } else {
                                    var14 = stackIn_130_0;
                                    L50: while (true) {
                                      L51: {
                                        L52: {
                                          if (~var14 <= ~var12) {
                                            break L52;
                                          } else {
                                            int dupTemp$7 = var8 + var3_ref.g(-48);
                                            var8 = dupTemp$7;
                                            ((dla) this).field_n[var11][var14] = dupTemp$7;
                                            var15 = dupTemp$7;
                                            stackOut_132_0 = var15;
                                            stackOut_132_1 = var13;
                                            stackIn_139_0 = stackOut_132_0;
                                            stackIn_139_1 = stackOut_132_1;
                                            stackIn_133_0 = stackOut_132_0;
                                            stackIn_133_1 = stackOut_132_1;
                                            if (var16 != 0) {
                                              break L51;
                                            } else {
                                              L53: {
                                                if (stackIn_133_0 <= stackIn_133_1) {
                                                  break L53;
                                                } else {
                                                  var13 = var15;
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
                                        ((dla) this).field_p[var11] = var13 + 1;
                                        stackOut_138_0 = 1 + var13;
                                        stackOut_138_1 = var12;
                                        stackIn_139_0 = stackOut_138_0;
                                        stackIn_139_1 = stackOut_138_1;
                                        break L51;
                                      }
                                      L54: {
                                        if (stackIn_139_0 != stackIn_139_1) {
                                          break L54;
                                        } else {
                                          ((dla) this).field_n[var11] = null;
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
                          stackOut_143_0 = var6;
                          stackIn_144_0 = stackOut_143_0;
                          break L32;
                        }
                        L55: {
                          L56: {
                            if (stackIn_144_0 != 0) {
                              ((dla) this).field_e = new pla[var9 - -1];
                              ((dla) this).field_m = new int[1 + var9][];
                              var10 = 0;
                              L57: while (true) {
                                if (var10 >= ((dla) this).field_o) {
                                  break L56;
                                } else {
                                  var11 = ((dla) this).field_k[var10];
                                  var12 = ((dla) this).field_c[var11];
                                  ((dla) this).field_m[var11] = new int[((dla) this).field_p[var11]];
                                  if (var16 != 0) {
                                    break L55;
                                  } else {
                                    var13 = 0;
                                    L58: while (true) {
                                      L59: {
                                        L60: {
                                          if (((dla) this).field_p[var11] <= var13) {
                                            break L60;
                                          } else {
                                            ((dla) this).field_m[var11][var13] = -1;
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
                                          L63: {
                                            if (var13 >= var12) {
                                              break L63;
                                            } else {
                                              if (var16 != 0) {
                                                break L62;
                                              } else {
                                                L64: {
                                                  L65: {
                                                    if (null == ((dla) this).field_n[var11]) {
                                                      break L65;
                                                    } else {
                                                      var14 = ((dla) this).field_n[var11][var13];
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
                                                ((dla) this).field_m[var11][var14] = var3_ref.e(kha.b(param0, 23927));
                                                var13++;
                                                if (var16 == 0) {
                                                  continue L61;
                                                } else {
                                                  break L63;
                                                }
                                              }
                                            }
                                          }
                                          ((dla) this).field_e[var11] = new pla(((dla) this).field_m[var11]);
                                          var10++;
                                          break L62;
                                        }
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
                            } else {
                              break L56;
                            }
                          }
                          break L55;
                        }
                        break L0;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L66: {
            var3 = decompiledCaughtException;
            stackOut_169_0 = (RuntimeException) var3;
            stackOut_169_1 = new StringBuilder().append("dla.A(").append(param0).append(',');
            stackIn_172_0 = stackOut_169_0;
            stackIn_172_1 = stackOut_169_1;
            stackIn_170_0 = stackOut_169_0;
            stackIn_170_1 = stackOut_169_1;
            if (param1 == null) {
              stackOut_172_0 = (RuntimeException) (Object) stackIn_172_0;
              stackOut_172_1 = (StringBuilder) (Object) stackIn_172_1;
              stackOut_172_2 = "null";
              stackIn_173_0 = stackOut_172_0;
              stackIn_173_1 = stackOut_172_1;
              stackIn_173_2 = stackOut_172_2;
              break L66;
            } else {
              stackOut_170_0 = (RuntimeException) (Object) stackIn_170_0;
              stackOut_170_1 = (StringBuilder) (Object) stackIn_170_1;
              stackOut_170_2 = "{...}";
              stackIn_173_0 = stackOut_170_0;
              stackIn_173_1 = stackOut_170_1;
              stackIn_173_2 = stackOut_170_2;
              break L66;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_173_0, stackIn_173_2 + ')');
        }
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
        try {
          L0: {
            if (cga.field_f < 2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (bg.field_t == 0) {
                  if (!tk.field_b.b(-100)) {
                    stackOut_41_0 = 20;
                    stackIn_42_0 = stackOut_41_0;
                    return stackIn_42_0;
                  } else {
                    if (tk.field_b.c("commonui", param0 ^ -122)) {
                      if (!hm.field_n.b(param0 + -100)) {
                        stackOut_49_0 = 50;
                        stackIn_50_0 = stackOut_49_0;
                        return stackIn_50_0;
                      } else {
                        if (hm.field_n.c("commonui", -126)) {
                          if (!vc.field_p.b(param0 ^ -123)) {
                            stackOut_57_0 = 70;
                            stackIn_58_0 = stackOut_57_0;
                            return stackIn_58_0;
                          } else {
                            if (!vc.field_p.a(0)) {
                              stackOut_62_0 = 80;
                              stackIn_63_0 = stackOut_62_0;
                              return stackIn_63_0;
                            } else {
                              break L1;
                            }
                          }
                        } else {
                          stackOut_52_0 = 60;
                          stackIn_53_0 = stackOut_52_0;
                          return stackIn_53_0;
                        }
                      }
                    } else {
                      stackOut_44_0 = 40;
                      stackIn_45_0 = stackOut_44_0;
                      return stackIn_45_0;
                    }
                  }
                } else {
                  L2: {
                    if (nja.field_J != null) {
                      if (nja.field_J.b(-37)) {
                        if (nja.field_J.a("", 127)) {
                          if (nja.field_J.c("", -127)) {
                            break L2;
                          } else {
                            stackOut_18_0 = 29;
                            stackIn_19_0 = stackOut_18_0;
                            return stackIn_19_0;
                          }
                        } else {
                          stackOut_15_0 = 29;
                          stackIn_16_0 = stackOut_15_0;
                          return stackIn_16_0;
                        }
                      } else {
                        stackOut_12_0 = 14;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  if (tk.field_b.b(param0 + -130)) {
                    if (tk.field_b.c("commonui", -128)) {
                      if (hm.field_n.b(param0 + -42)) {
                        if (hm.field_n.c("commonui", -124)) {
                          if (vc.field_p.b(-128)) {
                            if (vc.field_p.a(0)) {
                              break L1;
                            } else {
                              stackOut_36_0 = 86;
                              stackIn_37_0 = stackOut_36_0;
                              return stackIn_37_0;
                            }
                          } else {
                            stackOut_33_0 = 82;
                            stackIn_34_0 = stackOut_33_0;
                            return stackIn_34_0;
                          }
                        } else {
                          stackOut_30_0 = 80;
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0;
                        }
                      } else {
                        stackOut_27_0 = 71;
                        stackIn_28_0 = stackOut_27_0;
                        return stackIn_28_0;
                      }
                    } else {
                      stackOut_24_0 = 57;
                      stackIn_25_0 = stackOut_24_0;
                      return stackIn_25_0;
                    }
                  } else {
                    stackOut_21_0 = 43;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0;
                  }
                }
              }
              if (param0 == 7) {
                stackOut_67_0 = 100;
                stackIn_68_0 = stackOut_67_0;
                break L0;
              } else {
                stackOut_65_0 = 91;
                stackIn_66_0 = stackOut_65_0;
                return stackIn_66_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "dla.C(" + param0 + ')');
        }
        return stackIn_68_0;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (vo.field_b) {
                bea.d(bea.field_b, bea.field_h, bea.field_d + -bea.field_b, bea.field_k + -bea.field_h);
                rua.field_gb.b(36, false);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 23713) {
                break L2;
              } else {
                int discarded$2 = dla.a(120);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "dla.B(" + param0 + ')');
        }
    }

    dla(byte[] param0, int param1, byte[] param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        Object stackOut_20_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            ((dla) this).field_d = sq.a(param0.length, param0, (byte) -124);
            if (~param1 != ~((dla) this).field_d) {
              throw new RuntimeException();
            } else {
              L1: {
                L2: {
                  if (null == param2) {
                    break L2;
                  } else {
                    if (param2.length == 64) {
                      ((dla) this).field_i = fja.a(param0.length, param0, 0, 8);
                      var4_int = 0;
                      L3: while (true) {
                        if (var4_int >= 64) {
                          break L2;
                        } else {
                          stackOut_12_0 = this;
                          stackIn_21_0 = stackOut_12_0;
                          stackIn_13_0 = stackOut_12_0;
                          if (var5 != 0) {
                            break L1;
                          } else {
                            if (((dla) this).field_i[var4_int] != param2[var4_int]) {
                              throw new RuntimeException();
                            } else {
                              var4_int++;
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
                stackOut_20_0 = this;
                stackIn_21_0 = stackOut_20_0;
                break L1;
              }
              this.a(-23918, param0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) runtimeException;
            stackOut_23_1 = new StringBuilder().append("dla.<init>(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L4;
            }
          }
          L5: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
    }

    static {
    }
}
