/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends ib {
    int field_u;
    int field_t;
    int field_s;
    int field_r;
    private boolean field_o;
    int field_p;
    private int field_q;

    final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            if (fb.field_n > 0) {
              return;
            } else {
              L1: {
                var2_int = 0;
                var3 = ((ij) this).field_j + -1;
                if (!s.field_i) {
                  if (of.field_A <= 1) {
                    var2_int = 1;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var3 -= 3;
                  if (mk.field_k <= 0) {
                    var3--;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (tl.field_c == 4) {
                  var2_int = 8;
                  var3 = 9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (tl.field_c != 1) {
                  break L3;
                } else {
                  var3 = 10;
                  var2_int = 9;
                  break L3;
                }
              }
              L4: {
                if (tl.field_c != 2) {
                  break L4;
                } else {
                  var2_int = 8;
                  var3 = 10;
                  break L4;
                }
              }
              L5: {
                if (tl.field_c == 3) {
                  var2_int = 8;
                  var3 = 10;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                L7: {
                  if (param0 != tl.field_c) {
                    break L7;
                  } else {
                    if (gi.field_f != 96) {
                      break L7;
                    } else {
                      ((ij) this).field_l = 1;
                      break L6;
                    }
                  }
                }
                if (tl.field_c != 8) {
                  break L6;
                } else {
                  if (gi.field_f == 97) {
                    ((ij) this).field_l = 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L8: {
                if (gi.field_f != 98) {
                  if (gi.field_f != 99) {
                    this.c(((ij) this).field_l, -3);
                    break L8;
                  } else {
                    L9: {
                      if (tl.field_c == 0) {
                        break L9;
                      } else {
                        if (tl.field_c == 4) {
                          break L9;
                        } else {
                          if (tl.field_c == 1) {
                            break L9;
                          } else {
                            if (2 == tl.field_c) {
                              break L9;
                            } else {
                              if (tl.field_c != 3) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                    }
                    L10: {
                      ((ij) this).field_l = ((ij) this).field_l + 1;
                      if (((ij) this).field_l != 2) {
                        break L10;
                      } else {
                        if (!s.field_i) {
                          break L10;
                        } else {
                          ((ij) this).field_l = var2_int;
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (((ij) this).field_l != 1) {
                        break L11;
                      } else {
                        if (s.field_i) {
                          ((ij) this).field_l = ((ij) this).field_l + 1;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (~((ij) this).field_l > ~var3) {
                        break L12;
                      } else {
                        if (s.field_i) {
                          ((ij) this).field_l = 1;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (((ij) this).field_l < var2_int) {
                        ((ij) this).field_l = var2_int;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    if (~var3 >= ~((ij) this).field_l) {
                      ((ij) this).field_l = var2_int;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                } else {
                  L14: {
                    if (tl.field_c == 0) {
                      break L14;
                    } else {
                      if (tl.field_c == 4) {
                        break L14;
                      } else {
                        if (tl.field_c == 1) {
                          break L14;
                        } else {
                          if (tl.field_c == 2) {
                            break L14;
                          } else {
                            if (3 == tl.field_c) {
                              break L14;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  L15: {
                    ((ij) this).field_l = ((ij) this).field_l - 1;
                    if (((ij) this).field_l != 0) {
                      break L15;
                    } else {
                      if (s.field_i) {
                        ((ij) this).field_l = -1 + var3;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (1 != ((ij) this).field_l) {
                      break L16;
                    } else {
                      if (s.field_i) {
                        ((ij) this).field_l = ((ij) this).field_l - 1;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                  }
                  L17: {
                    if (~var2_int >= ~((ij) this).field_l) {
                      break L17;
                    } else {
                      if (s.field_i) {
                        ((ij) this).field_l = 1;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                  if (var2_int > ((ij) this).field_l) {
                    ((ij) this).field_l = var3 + -1;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "ij.I(" + param0 + 41);
        }
    }

    final int a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_36_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (param2 < ((ij) this).field_e) {
                break L1;
              } else {
                if (~param2 <= ~((ij) this).field_i) {
                  break L1;
                } else {
                  if (~((ij) this).field_b >= ~param1) {
                    L2: {
                      if (param0 == 59) {
                        break L2;
                      } else {
                        boolean discarded$2 = this.a(-41, -5, true, 42, true, (String) null, -77);
                        break L2;
                      }
                    }
                    var4_int = (param1 - ((ij) this).field_b) / ((ij) this).field_a;
                    if (((ij) this).field_j > var4_int) {
                      L3: {
                        if (!s.field_i) {
                          break L3;
                        } else {
                          if (tl.field_c == 0) {
                            L4: {
                              if (var4_int < 1) {
                                break L4;
                              } else {
                                var4_int++;
                                break L4;
                              }
                            }
                            L5: {
                              if (var4_int <= 4) {
                                break L5;
                              } else {
                                if (mk.field_k <= 0) {
                                  var4_int = 1;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if (5 >= var4_int) {
                              break L3;
                            } else {
                              if (mk.field_k <= 0) {
                                break L3;
                              } else {
                                var4_int = 1;
                                break L3;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      stackOut_36_0 = var4_int;
                      stackIn_37_0 = stackOut_36_0;
                      break L0;
                    } else {
                      stackOut_13_0 = -1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_7_0 = -1;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var4, "ij.J(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_37_0;
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_81_0 = null;
        Object stackIn_83_0 = null;
        Object stackIn_84_0 = null;
        Object stackIn_86_0 = null;
        Object stackIn_88_0 = null;
        Object stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_108_0 = 0;
        Object stackIn_126_0 = null;
        Object stackIn_128_0 = null;
        Object stackIn_129_0 = null;
        Object stackIn_131_0 = null;
        Object stackIn_133_0 = null;
        Object stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_125_0 = null;
        Object stackOut_126_0 = null;
        Object stackOut_128_0 = null;
        Object stackOut_129_0 = null;
        Object stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        Object stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        Object stackOut_80_0 = null;
        Object stackOut_81_0 = null;
        Object stackOut_83_0 = null;
        Object stackOut_84_0 = null;
        Object stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        Object stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_105_0 = 0;
        Object stackOut_32_0 = null;
        Object stackOut_33_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        var8 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param2 == 8) {
                break L1;
              } else {
                ((ij) this).field_o = true;
                break L1;
              }
            }
            L2: {
              L3: {
                if (tl.field_c != 2) {
                  break L3;
                } else {
                  if (param3 != 8) {
                    break L3;
                  } else {
                    if (!ah.a(-1)) {
                      if (ni.field_e >= 224) {
                        if (416 < ni.field_e) {
                          si.field_X = 2;
                          break L2;
                        } else {
                          si.field_X = 1;
                          break L2;
                        }
                      } else {
                        si.field_X = 0;
                        break L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              }
              if (0 != tl.field_c) {
                super.a(param0, param1, (byte) 8, param3, param4, param5);
                break L2;
              } else {
                L4: {
                  if (1 != param3) {
                    break L4;
                  } else {
                    if (s.field_i) {
                      break L4;
                    } else {
                      if (of.field_A > 1) {
                        L5: {
                          L6: {
                            stackOut_125_0 = this;
                            stackIn_133_0 = stackOut_125_0;
                            stackIn_126_0 = stackOut_125_0;
                            if (param1 < 320) {
                              break L6;
                            } else {
                              stackOut_126_0 = this;
                              stackIn_128_0 = stackOut_126_0;
                              stackOut_128_0 = this;
                              stackIn_133_0 = stackOut_128_0;
                              stackIn_129_0 = stackOut_128_0;
                              if (param1 >= 420) {
                                break L6;
                              } else {
                                stackOut_129_0 = this;
                                stackIn_131_0 = stackOut_129_0;
                                stackOut_131_0 = this;
                                stackOut_131_1 = 1;
                                stackIn_134_0 = stackOut_131_0;
                                stackIn_134_1 = stackOut_131_1;
                                break L5;
                              }
                            }
                          }
                          stackOut_133_0 = this;
                          stackOut_133_1 = 0;
                          stackIn_134_0 = stackOut_133_0;
                          stackIn_134_1 = stackOut_133_1;
                          break L5;
                        }
                        L7: {
                          ((ij) this).field_o = stackIn_134_1 != 0;
                          if (!param5) {
                            break L7;
                          } else {
                            ((ij) this).field_o = true;
                            break L7;
                          }
                        }
                        if (!((ij) this).field_o) {
                          break L2;
                        } else {
                          L8: {
                            var7_int = -320 + param1;
                            if (0 > var7_int) {
                              var7_int = 0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            if (100 >= var7_int) {
                              break L9;
                            } else {
                              var7_int = 100;
                              break L9;
                            }
                          }
                          qi.field_a = 1 + (-2 + of.field_A * var7_int) / 100;
                          break L2;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (param3 == 3) {
                  L10: {
                    L11: {
                      stackOut_80_0 = this;
                      stackIn_88_0 = stackOut_80_0;
                      stackIn_81_0 = stackOut_80_0;
                      if (param1 < 320) {
                        break L11;
                      } else {
                        stackOut_81_0 = this;
                        stackIn_83_0 = stackOut_81_0;
                        stackOut_83_0 = this;
                        stackIn_88_0 = stackOut_83_0;
                        stackIn_84_0 = stackOut_83_0;
                        if (param1 >= 420) {
                          break L11;
                        } else {
                          stackOut_84_0 = this;
                          stackIn_86_0 = stackOut_84_0;
                          stackOut_86_0 = this;
                          stackOut_86_1 = 1;
                          stackIn_89_0 = stackOut_86_0;
                          stackIn_89_1 = stackOut_86_1;
                          break L10;
                        }
                      }
                    }
                    stackOut_88_0 = this;
                    stackOut_88_1 = 0;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    break L10;
                  }
                  L12: {
                    ((ij) this).field_o = stackIn_89_1 != 0;
                    if (!param5) {
                      break L12;
                    } else {
                      ((ij) this).field_o = true;
                      break L12;
                    }
                  }
                  L13: {
                    if (((ij) this).field_o) {
                      L14: {
                        pk.field_h = param1 - 320;
                        fe.field_e = true;
                        if (pk.field_h >= 0) {
                          break L14;
                        } else {
                          pk.field_h = 0;
                          break L14;
                        }
                      }
                      if (pk.field_h > 100) {
                        pk.field_h = 100;
                        break L13;
                      } else {
                        break L13;
                      }
                    } else {
                      if (~param1 > ~(320 - l.field_f.b(vl.field_h))) {
                        break L13;
                      } else {
                        if (param1 < 320) {
                          if (param5) {
                            break L13;
                          } else {
                            L15: {
                              if (fe.field_e) {
                                stackOut_107_0 = 0;
                                stackIn_108_0 = stackOut_107_0;
                                break L15;
                              } else {
                                stackOut_105_0 = 1;
                                stackIn_108_0 = stackOut_105_0;
                                break L15;
                              }
                            }
                            fe.field_e = stackIn_108_0 != 0;
                            break L13;
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  if (!fe.field_e) {
                    break L2;
                  } else {
                    if (param5) {
                      break L2;
                    } else {
                      ll.field_c.a(sb.field_e[0], 50, pk.field_h * 2);
                      break L2;
                    }
                  }
                } else {
                  if (4 == param3) {
                    L16: {
                      L17: {
                        stackOut_32_0 = this;
                        stackIn_40_0 = stackOut_32_0;
                        stackIn_33_0 = stackOut_32_0;
                        if (320 > param1) {
                          break L17;
                        } else {
                          stackOut_33_0 = this;
                          stackIn_35_0 = stackOut_33_0;
                          stackOut_35_0 = this;
                          stackIn_40_0 = stackOut_35_0;
                          stackIn_36_0 = stackOut_35_0;
                          if (param1 >= 420) {
                            break L17;
                          } else {
                            stackOut_36_0 = this;
                            stackIn_38_0 = stackOut_36_0;
                            stackOut_38_0 = this;
                            stackOut_38_1 = 1;
                            stackIn_41_0 = stackOut_38_0;
                            stackIn_41_1 = stackOut_38_1;
                            break L16;
                          }
                        }
                      }
                      stackOut_40_0 = this;
                      stackOut_40_1 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      stackIn_41_1 = stackOut_40_1;
                      break L16;
                    }
                    L18: {
                      ((ij) this).field_o = stackIn_41_1 != 0;
                      if (param5) {
                        ((ij) this).field_o = true;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if (!((ij) this).field_o) {
                        if (~(320 + -l.field_f.b(of.field_D)) < ~param1) {
                          break L19;
                        } else {
                          if (param1 < 320) {
                            if (!param5) {
                              if (null == vf.field_L) {
                                vf.field_L = fe.field_c;
                                nj.field_o.a((p) (Object) vf.field_L);
                                break L19;
                              } else {
                                nj.field_o.b((p) (Object) vf.field_L);
                                vf.field_L.c();
                                vf.field_L = null;
                                break L19;
                              }
                            } else {
                              break L19;
                            }
                          } else {
                            break L19;
                          }
                        }
                      } else {
                        L20: {
                          ai.field_c = param1 + -320;
                          if (ai.field_c < 0) {
                            ai.field_c = 0;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          if (ai.field_c <= 100) {
                            break L21;
                          } else {
                            ai.field_c = 100;
                            break L21;
                          }
                        }
                        if (vf.field_L == null) {
                          vf.field_L = fe.field_c;
                          nj.field_o.a((p) (Object) vf.field_L);
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                    }
                    if (vf.field_L != null) {
                      vf.field_L.d(ai.field_c / 2);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    super.a(param0, param1, (byte) 8, param3, param4, param5);
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var7, "ij.K(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void b(int param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              L2: {
                if (1 != param0) {
                  break L2;
                } else {
                  if (s.field_i) {
                    break L2;
                  } else {
                    if (of.field_A <= 1) {
                      break L2;
                    } else {
                      if (tl.field_c != 0) {
                        break L2;
                      } else {
                        qi.field_a = qi.field_a - 1;
                        if (1 > qi.field_a) {
                          qi.field_a = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              if (param0 != 3) {
                if (4 == param0) {
                  L3: {
                    ai.field_c = ai.field_c - 12;
                    if (ai.field_c >= 10) {
                      break L3;
                    } else {
                      ai.field_c = 10;
                      if (vf.field_L == null) {
                        break L3;
                      } else {
                        nj.field_o.b((p) (Object) vf.field_L);
                        vf.field_L.c();
                        vf.field_L = null;
                        break L3;
                      }
                    }
                  }
                  if (null != vf.field_L) {
                    vf.field_L.d(ai.field_c / 2);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              } else {
                pk.field_h = pk.field_h - 12;
                if (pk.field_h >= 10) {
                  break L1;
                } else {
                  pk.field_h = 10;
                  fe.field_e = false;
                  break L1;
                }
              }
            }
            L4: {
              if (param1 == -1) {
                break L4;
              } else {
                ((ij) this).field_s = -58;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "ij.B(" + param0 + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_150_0 = 0;
        int stackIn_220_0 = 0;
        Object stackIn_340_0 = null;
        Object stackIn_342_0 = null;
        Object stackIn_343_0 = null;
        Object stackIn_345_0 = null;
        Object stackIn_347_0 = null;
        Object stackIn_348_0 = null;
        int stackIn_348_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_339_0 = null;
        Object stackOut_340_0 = null;
        Object stackOut_342_0 = null;
        Object stackOut_343_0 = null;
        Object stackOut_345_0 = null;
        int stackOut_345_1 = 0;
        Object stackOut_347_0 = null;
        int stackOut_347_1 = 0;
        int stackOut_219_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_147_0 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        var4 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (!pk.a(-12663, 0)) {
                break L1;
              } else {
                if (fe.field_e) {
                  ll.field_c.a(sb.field_e[51 + (int)(Math.random() * 10.0)], (int)(Math.random() * 100.0) + 50, pk.field_h * 2);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 424) {
                break L2;
              } else {
                this.a(true, 82);
                break L2;
              }
            }
            L3: {
              if (tl.field_c != 8) {
                L4: {
                  if (tl.field_c != 3) {
                    break L4;
                  } else {
                    L5: {
                      if (fb.field_n == 0) {
                        break L5;
                      } else {
                        if (1 != gh.field_c) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (param1 != 8) {
                        break L6;
                      } else {
                        if (!ah.a(param0 ^ -425)) {
                          break L6;
                        } else {
                          am.a(3, 3, param0 ^ 466);
                          break L3;
                        }
                      }
                    }
                    L7: {
                      if (param1 != 8) {
                        break L7;
                      } else {
                        if (oc.field_d) {
                          tl.field_c = 2;
                          oc.field_d = false;
                          n.field_L = 255;
                          if (v.field_e) {
                            ((ij) this).field_l = -1;
                            break L3;
                          } else {
                            ((ij) this).field_l = 9;
                            break L3;
                          }
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (param1 == 9) {
                      L8: {
                        n.field_L = 255;
                        if (!v.field_e) {
                          ((ij) this).field_l = 7;
                          break L8;
                        } else {
                          ((ij) this).field_l = -1;
                          break L8;
                        }
                      }
                      tl.field_c = 0;
                      if (!oa.field_D) {
                        tl.field_c = 8;
                        oa.field_D = true;
                        ta.a(v.field_e, 713);
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                if (2 != tl.field_c) {
                  if (tl.field_c == 1) {
                    if (param1 != 9) {
                      break L3;
                    } else {
                      n.field_L = 255;
                      tl.field_c = 0;
                      if (!v.field_e) {
                        L9: {
                          L10: {
                            stackOut_339_0 = this;
                            stackIn_347_0 = stackOut_339_0;
                            stackIn_340_0 = stackOut_339_0;
                            if (1 < of.field_A) {
                              break L10;
                            } else {
                              stackOut_340_0 = this;
                              stackIn_342_0 = stackOut_340_0;
                              stackOut_342_0 = this;
                              stackIn_347_0 = stackOut_342_0;
                              stackIn_343_0 = stackOut_342_0;
                              if (s.field_i) {
                                break L10;
                              } else {
                                stackOut_343_0 = this;
                                stackIn_345_0 = stackOut_343_0;
                                stackOut_345_0 = this;
                                stackOut_345_1 = 3;
                                stackIn_348_0 = stackOut_345_0;
                                stackIn_348_1 = stackOut_345_1;
                                break L9;
                              }
                            }
                          }
                          stackOut_347_0 = this;
                          stackOut_347_1 = 2;
                          stackIn_348_0 = stackOut_347_0;
                          stackIn_348_1 = stackOut_347_1;
                          break L9;
                        }
                        ((ij) this).field_l = stackIn_348_1;
                        break L3;
                      } else {
                        ((ij) this).field_l = -1;
                        break L3;
                      }
                    }
                  } else {
                    if (4 != tl.field_c) {
                      if (tl.field_c == 0) {
                        L11: {
                          var3_int = ((ij) this).field_j;
                          if (s.field_i) {
                            var3_int -= 3;
                            if (mk.field_k <= 0) {
                              var3_int--;
                              break L11;
                            } else {
                              break L11;
                            }
                          } else {
                            break L11;
                          }
                        }
                        if (var3_int > param1) {
                          L12: {
                            L13: {
                              if (param1 != 8) {
                                break L13;
                              } else {
                                L14: {
                                  if (fb.field_n == 0) {
                                    break L14;
                                  } else {
                                    if (gh.field_c == 1) {
                                      break L14;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                L15: {
                                  if (s.field_e != null) {
                                    nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
                                    s.field_e.a(ic.field_d, -104);
                                    s.field_e = null;
                                    qd.field_j.requestFocus();
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                df.a(false, hf.a((byte) -93));
                                break L12;
                              }
                            }
                            L16: {
                              if (param1 != 0) {
                                break L16;
                              } else {
                                if (a.field_h[0] == null) {
                                  break L16;
                                } else {
                                  if (a.field_h[0].field_m != -1) {
                                    break L16;
                                  } else {
                                    na.field_j = null;
                                    break L12;
                                  }
                                }
                              }
                            }
                            L17: {
                              if (param1 != 0) {
                                break L17;
                              } else {
                                L18: {
                                  if (null == a.field_h[0]) {
                                    break L18;
                                  } else {
                                    if (a.field_h[0].field_m == -1) {
                                      break L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                if (of.field_A <= 1) {
                                  break L12;
                                } else {
                                  L19: {
                                    ea.e((byte) 97);
                                    vc.field_h.m((byte) 127);
                                    na.field_j = null;
                                    stellarshard.field_K = false;
                                    bi.field_u = null;
                                    if (qi.field_a <= 0) {
                                      break L19;
                                    } else {
                                      qi.field_a = qi.field_a - 1;
                                      break L19;
                                    }
                                  }
                                  nf.field_r = false;
                                  s.field_i = true;
                                  tl.field_a = 0;
                                  if (qi.field_a != 0) {
                                    break L12;
                                  } else {
                                    nf.field_r = true;
                                    stellarshard.field_K = true;
                                    e.field_c = false;
                                    break L12;
                                  }
                                }
                              }
                            }
                            if (1 == param1) {
                              L20: {
                                if (a.field_h[0] == null) {
                                  break L20;
                                } else {
                                  if (a.field_h[0].field_m == -1) {
                                    nc.field_H = 0;
                                    a.field_h[0].field_g = -150;
                                    na.field_j = null;
                                    break L12;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              if (of.field_A > 1) {
                                break L12;
                              } else {
                                L21: {
                                  ea.e((byte) 93);
                                  vc.field_h.m((byte) 127);
                                  s.field_i = true;
                                  qe.field_e = 0;
                                  nf.field_r = true;
                                  stellarshard.field_K = true;
                                  tl.field_a = 0;
                                  bi.field_u = null;
                                  if (qi.field_a > 0) {
                                    qi.field_a = qi.field_a - 1;
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                na.field_j = null;
                                na.field_j = null;
                                break L12;
                              }
                            } else {
                              if (param1 != 3) {
                                if (4 != param1) {
                                  if (param1 != 2) {
                                    if (param1 != 7) {
                                      if (param1 == 6) {
                                        if (!s.field_i) {
                                          L22: {
                                            if (ah.a(-1)) {
                                              break L22;
                                            } else {
                                              gh.field_d = bk.a(3, 10, 1, param0 ^ 441, 5);
                                              break L22;
                                            }
                                          }
                                          L23: {
                                            if (2 != tl.field_c) {
                                              n.field_L = 255;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          tl.field_c = 2;
                                          if (!v.field_e) {
                                            ((ij) this).field_l = 9;
                                            break L12;
                                          } else {
                                            ((ij) this).field_l = -1;
                                            break L12;
                                          }
                                        } else {
                                          break L12;
                                        }
                                      } else {
                                        if (param1 != 5) {
                                          break L12;
                                        } else {
                                          if (null != s.field_e) {
                                            nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
                                            s.field_e.a(ic.field_d, -105);
                                            s.field_e = null;
                                            qd.field_j.requestFocus();
                                            break L12;
                                          } else {
                                            vc.field_h.l((byte) -119);
                                            break L12;
                                          }
                                        }
                                      }
                                    } else {
                                      L24: {
                                        if (s.field_i) {
                                          break L24;
                                        } else {
                                          L25: {
                                            if (tl.field_c != 3) {
                                              n.field_L = 255;
                                              break L25;
                                            } else {
                                              break L25;
                                            }
                                          }
                                          L26: {
                                            if (!v.field_e) {
                                              ((ij) this).field_l = 9;
                                              break L26;
                                            } else {
                                              ((ij) this).field_l = -1;
                                              break L26;
                                            }
                                          }
                                          tl.field_c = 3;
                                          break L24;
                                        }
                                      }
                                      oc.field_d = false;
                                      break L12;
                                    }
                                  } else {
                                    L27: {
                                      if (1 != tl.field_c) {
                                        n.field_L = 255;
                                        break L27;
                                      } else {
                                        break L27;
                                      }
                                    }
                                    tl.field_c = 1;
                                    if (v.field_e) {
                                      ((ij) this).field_l = -1;
                                      break L12;
                                    } else {
                                      ((ij) this).field_l = 9;
                                      break L12;
                                    }
                                  }
                                } else {
                                  if (null != vf.field_L) {
                                    nj.field_o.b((p) (Object) vf.field_L);
                                    vf.field_L.c();
                                    vf.field_L = null;
                                    break L12;
                                  } else {
                                    vf.field_L = fe.field_c;
                                    nj.field_o.a((p) (Object) vf.field_L);
                                    break L12;
                                  }
                                }
                              } else {
                                L28: {
                                  if (fe.field_e) {
                                    stackOut_219_0 = 0;
                                    stackIn_220_0 = stackOut_219_0;
                                    break L28;
                                  } else {
                                    stackOut_217_0 = 1;
                                    stackIn_220_0 = stackOut_217_0;
                                    break L28;
                                  }
                                }
                                fe.field_e = stackIn_220_0 != 0;
                                break L12;
                              }
                            }
                          }
                          break L3;
                        } else {
                          return;
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      if (param1 == 8) {
                        L29: {
                          if (v.field_e) {
                            ((ij) this).field_l = -1;
                            break L29;
                          } else {
                            ((ij) this).field_l = 9;
                            break L29;
                          }
                        }
                        tl.field_c = 0;
                        n.field_L = 255;
                        gh.field_d = null;
                        if (ah.a(-1)) {
                          oc.field_d = false;
                          break L3;
                        } else {
                          L30: {
                            if (0 < ue.field_a) {
                              tl.field_c = 2;
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          L31: {
                            if (!oc.field_d) {
                              break L31;
                            } else {
                              tl.field_c = 3;
                              break L31;
                            }
                          }
                          if (tl.field_c != 0) {
                            L32: {
                              if (mk.field_k <= 0) {
                                stackOut_149_0 = 0;
                                stackIn_150_0 = stackOut_149_0;
                                break L32;
                              } else {
                                stackOut_147_0 = 1;
                                stackIn_150_0 = stackOut_147_0;
                                break L32;
                              }
                            }
                            oa.field_D = stackIn_150_0 != 0;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                } else {
                  L33: {
                    if (param1 != 8) {
                      break L33;
                    } else {
                      if (!ah.a(-1)) {
                        break L33;
                      } else {
                        am.a(2, 2, param0 + -544);
                        break L3;
                      }
                    }
                  }
                  if (param1 == 8) {
                    si.field_X = si.field_X + 1;
                    if (3 > si.field_X) {
                      break L3;
                    } else {
                      si.field_X = si.field_X - 3;
                      break L3;
                    }
                  } else {
                    if (param1 == 9) {
                      L34: {
                        n.field_L = 255;
                        if (v.field_e) {
                          ((ij) this).field_l = -1;
                          break L34;
                        } else {
                          ((ij) this).field_l = 6;
                          break L34;
                        }
                      }
                      tl.field_c = 0;
                      if (!oa.field_D) {
                        oa.field_D = true;
                        tl.field_c = 8;
                        ta.a(v.field_e, 713);
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              } else {
                if (param1 != 0) {
                  if (param1 == 1) {
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  L35: {
                    if (!v.field_e) {
                      L36: {
                        stackOut_21_0 = this;
                        stackIn_26_0 = stackOut_21_0;
                        stackIn_22_0 = stackOut_21_0;
                        if (of.field_A <= 1) {
                          stackOut_26_0 = this;
                          stackOut_26_1 = 1;
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          break L36;
                        } else {
                          stackOut_22_0 = this;
                          stackIn_24_0 = stackOut_22_0;
                          stackOut_24_0 = this;
                          stackOut_24_1 = 0;
                          stackIn_27_0 = stackOut_24_0;
                          stackIn_27_1 = stackOut_24_1;
                          break L36;
                        }
                      }
                      ((ij) this).field_l = stackIn_27_1;
                      break L35;
                    } else {
                      ((ij) this).field_l = -1;
                      break L35;
                    }
                  }
                  n.field_L = 255;
                  tl.field_c = 0;
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "ij.F(" + param0 + 44 + param1 + 41);
        }
    }

    ij(stellarshard param0) {
        super(10, 64, 576, 196, 28);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        ((ij) this).field_u = -1;
        ((ij) this).field_t = -5;
        ((ij) this).field_s = 30;
        ((ij) this).field_r = -1;
        ((ij) this).field_p = 0;
        try {
          L0: {
            L1: {
              nj.field_f = new int[10];
              n.field_L = 255;
              tl.field_c = 0;
              ((ij) this).field_l = 0;
              if (s.field_i) {
                break L1;
              } else {
                if (of.field_A <= 1) {
                  ((ij) this).field_l = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              vc.field_h = param0;
              if (!oc.field_d) {
                break L2;
              } else {
                ((ij) this).field_l = 9;
                tl.field_c = 3;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("ij.<init>(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int stackIn_120_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_119_0 = 0;
        int stackOut_117_0 = 0;
        var6 = stellarshard.field_B;
        try {
          L0: {
            if (param1 == -9) {
              L1: {
                if (!s.field_i) {
                  break L1;
                } else {
                  if (0 >= param2) {
                    break L1;
                  } else {
                    if (param2 == 1) {
                      param3 = param3 + ((ij) this).field_a * 3;
                      if (0 >= mk.field_k) {
                        break L1;
                      } else {
                        param3 = param3 + ((ij) this).field_a;
                        break L1;
                      }
                    } else {
                      param3 = param3 - ((ij) this).field_a;
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (tl.field_c != 0) {
                  break L2;
                } else {
                  var5_int = 5883647;
                  if (param2 != 0) {
                    if (1 != param2) {
                      if (3 != param2) {
                        if (param2 == 4) {
                          if (vf.field_L == null) {
                            ic.a(rc.field_f, param2, -1, false, 320, var5_int, param3);
                            break L2;
                          } else {
                            ic.a(fe.field_f, param2, -1, false, 320, var5_int, param3);
                            fh.field_k[0].e(316, 2 + param3);
                            fh.field_k[2].e(418, param3 + 2);
                            fh.field_k[1].e(ai.field_c + 317, 2 + param3);
                            break L2;
                          }
                        } else {
                          if (param2 == 5) {
                            L3: {
                              if (!s.field_i) {
                                break L3;
                              } else {
                                if (mk.field_k > 0) {
                                  break L3;
                                } else {
                                  break L2;
                                }
                              }
                            }
                            if (s.field_e != null) {
                              ic.a(ch.field_a, param2, -1, false, 320, var5_int, param3);
                              break L2;
                            } else {
                              L4: {
                                if (!lh.a(ic.field_d, (byte) -119)) {
                                  L5: {
                                    if (param0) {
                                      stackOut_119_0 = 16777215;
                                      stackIn_120_0 = stackOut_119_0;
                                      break L5;
                                    } else {
                                      stackOut_117_0 = 8421504;
                                      stackIn_120_0 = stackOut_117_0;
                                      break L5;
                                    }
                                  }
                                  var5_int = stackIn_120_0;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                              ic.a(ch.field_a, param2, -1, false, 320, var5_int, param3);
                              break L2;
                            }
                          } else {
                            if (param2 != 2) {
                              if (param2 == 6) {
                                if (s.field_i) {
                                  break L2;
                                } else {
                                  ic.a(ta.field_r, param2, -1, false, 320, var5_int, param3);
                                  break L2;
                                }
                              } else {
                                if (param2 == 7) {
                                  if (!s.field_i) {
                                    ic.a(nl.field_b, param2, -1, false, 320, var5_int, param3);
                                    break L2;
                                  } else {
                                    break L2;
                                  }
                                } else {
                                  if (param2 == 8) {
                                    if (s.field_i) {
                                      break L2;
                                    } else {
                                      ic.a(il.field_x, param2, -1, false, 320, var5_int, param3);
                                      break L2;
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              ic.a(ig.field_C, param2, -1, false, 320, var5_int, param3);
                              break L2;
                            }
                          }
                        }
                      } else {
                        if (fe.field_e) {
                          ic.a(eh.field_b, param2, -1, false, 320, var5_int, param3);
                          fh.field_k[0].e(316, 2 + param3);
                          fh.field_k[2].e(418, 2 + param3);
                          fh.field_k[1].e(320 - -pk.field_h + -3, 2 + param3);
                          break L2;
                        } else {
                          ic.a(ch.field_d, param2, -1, false, 320, var5_int, param3);
                          break L2;
                        }
                      }
                    } else {
                      L6: {
                        if (null == a.field_h[0]) {
                          break L6;
                        } else {
                          if (-1 != a.field_h[0].field_m) {
                            break L6;
                          } else {
                            ic.a(kk.field_n, param2, -1, false, 320, var5_int, param3);
                            break L2;
                          }
                        }
                      }
                      if (of.field_A <= 1) {
                        ic.a(rk.field_b, param2, -1, false, 320, var5_int, param3);
                        break L2;
                      } else {
                        ic.a(qf.field_f, param2, -1, false, 320, var5_int, param3);
                        fh.field_k[0].e(316, param3 - -3);
                        fh.field_k[2].e(418, 3 + param3);
                        fh.field_k[1].e(-3 + ((100 * qi.field_a - 100) / (-1 + of.field_A) + 320), 3 + param3);
                        break L2;
                      }
                    }
                  } else {
                    L7: {
                      if (a.field_h[0] == null) {
                        break L7;
                      } else {
                        if (a.field_h[0].field_m != -1) {
                          break L7;
                        } else {
                          ic.a(dj.field_c, param2, -1, false, 320, var5_int, param3);
                          break L2;
                        }
                      }
                    }
                    if (1 < of.field_A) {
                      ic.a(kf.field_c + qi.field_a, param2, -1, false, 320, var5_int, param3);
                      break L2;
                    } else {
                      break L2;
                    }
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
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var5, "ij.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 != 1) {
                  break L2;
                } else {
                  if (s.field_i) {
                    break L2;
                  } else {
                    if (of.field_A <= 1) {
                      break L2;
                    } else {
                      if (tl.field_c != 0) {
                        break L2;
                      } else {
                        qi.field_a = qi.field_a + 1;
                        if (qi.field_a > of.field_A) {
                          qi.field_a = of.field_A;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              if (param1 == 3) {
                pk.field_h = pk.field_h + 12;
                fe.field_e = true;
                if (pk.field_h <= 100) {
                  break L1;
                } else {
                  pk.field_h = 100;
                  break L1;
                }
              } else {
                if (param1 != 4) {
                  break L1;
                } else {
                  L3: {
                    ai.field_c = ai.field_c + 12;
                    if (ai.field_c > 100) {
                      ai.field_c = 100;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (null != vf.field_L) {
                      break L4;
                    } else {
                      vf.field_L = fe.field_c;
                      nj.field_o.a((p) (Object) vf.field_L);
                      break L4;
                    }
                  }
                  if (vf.field_L != null) {
                    vf.field_L.d(ai.field_c / 2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "ij.A(" + 1 + 44 + param1 + 41);
        }
    }

    private final void c(int param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param1 == -3) {
                break L1;
              } else {
                this.c(-34, 99);
                break L1;
              }
            }
            L2: {
              L3: {
                if (gi.field_f != 96) {
                  break L3;
                } else {
                  L4: {
                    if (param0 == 8) {
                      break L4;
                    } else {
                      if (tl.field_c != 2) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    si.field_X = si.field_X - 1;
                    if (si.field_X >= 0) {
                      break L5;
                    } else {
                      si.field_X = si.field_X + 3;
                      break L5;
                    }
                  }
                  ((ij) this).b(param0, -1);
                  break L2;
                }
              }
              L6: {
                if (97 != gi.field_f) {
                  break L6;
                } else {
                  L7: {
                    if (param0 == 8) {
                      break L7;
                    } else {
                      if (tl.field_c == 2) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    si.field_X = si.field_X + 1;
                    if (si.field_X >= 3) {
                      si.field_X = si.field_X - 3;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  this.a(true, param0);
                  break L2;
                }
              }
              L9: {
                if (gi.field_f == 84) {
                  break L9;
                } else {
                  if (83 == gi.field_f) {
                    break L9;
                  } else {
                    break L2;
                  }
                }
              }
              ((ij) this).a(param1 ^ -427, param0);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "ij.D(" + param0 + 44 + param1 + 41);
        }
    }

    private final boolean a(int param0, int param1, boolean param2, int param3, boolean param4, String param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_30_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        try {
          L0: {
            L1: {
              var8_int = l.field_f.b(param5);
              param3 += 4;
              param0 = param0 + var8_int / 2;
              if (~ni.field_e >= ~(-4 + -var8_int + param0)) {
                break L1;
              } else {
                if (~param0 > ~ni.field_e) {
                  break L1;
                } else {
                  if (param3 + -l.field_f.field_N >= eb.field_a) {
                    break L1;
                  } else {
                    if (~eb.field_a < ~param3) {
                      break L1;
                    } else {
                      if (param4) {
                        if (param6 == 5883647) {
                          param6 = 16777215;
                          break L1;
                        } else {
                          param6 = 16748431;
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L2: {
              if (!param2) {
                break L2;
              } else {
                param6 = 16777215;
                break L2;
              }
            }
            L3: {
              l.field_f.b(param5, param0 + -2, param1 + param3, param6, -1);
              if (param6 != 16777215) {
                break L3;
              } else {
                if (0 == fb.field_n) {
                  break L3;
                } else {
                  if (param4) {
                    stackOut_29_0 = 1;
                    stackIn_30_0 = stackOut_29_0;
                    return stackIn_30_0 != 0;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L4: {
              if (param6 != 16777215) {
                break L4;
              } else {
                if (!si.field_jb[84]) {
                  break L4;
                } else {
                  if (!param2) {
                    break L4;
                  } else {
                    stackOut_38_0 = 1;
                    stackIn_39_0 = stackOut_38_0;
                    return stackIn_39_0 != 0;
                  }
                }
              }
            }
            stackOut_40_0 = 0;
            stackIn_41_0 = stackOut_40_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var8;
            stackOut_42_1 = new StringBuilder().append("ij.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param5 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L5;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + param6 + 41);
        }
        return stackIn_41_0 != 0;
    }

    final static jj a(int param0, gk param1, String param2, pf param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        jj stackIn_4_0 = null;
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
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        jj stackOut_3_0 = null;
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
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var5_int = param3.b(param4, (byte) -118);
              if (param0 == 576) {
                break L1;
              } else {
                jj discarded$2 = ij.a(-91, (gk) null, (String) null, (pf) null, (String) null);
                break L1;
              }
            }
            var6 = param3.a(var5_int, param2, (byte) -11);
            stackOut_3_0 = ca.a(var5_int, 24325, var6, param3, param1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("ij.H(").append(param0).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
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
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_4_0;
    }

    final void a(byte param0) {
        ub var2 = null;
        int var2_int = 0;
        double var2_double = 0.0;
        int var3 = 0;
        String var3_ref_String = null;
        String[] var3_ref_String__ = null;
        int var4 = 0;
        double var4_double = 0.0;
        long[] var4_ref_long__ = null;
        String var5_ref_String = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nf var8_ref_nf = null;
        int var9 = 0;
        pa var10_ref_pa = null;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        Object var12 = null;
        bj var13_ref_bj = null;
        int var13 = 0;
        int var14 = 0;
        ub stackIn_66_0 = null;
        ub stackIn_67_0 = null;
        ub stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        ub stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        ub stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        ub stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        ub stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        ub stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        ub stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        Object stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        Object stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        int stackIn_77_3 = 0;
        ub stackIn_82_0 = null;
        ub stackIn_83_0 = null;
        ub stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        ub stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        ub stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        ub stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        ub stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_88_3 = 0;
        ub stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_89_2 = 0;
        int stackIn_89_3 = 0;
        ub stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_90_3 = 0;
        int stackIn_90_4 = 0;
        Object stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        Object stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        ub stackIn_96_0 = null;
        ub stackIn_97_0 = null;
        ub stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        ub stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        ub stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        ub stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        int stackIn_101_2 = 0;
        ub stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        int stackIn_102_3 = 0;
        ub stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        int stackIn_103_3 = 0;
        ub stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        int stackIn_104_3 = 0;
        int stackIn_104_4 = 0;
        int stackIn_131_0 = 0;
        ub stackIn_170_0 = null;
        String stackIn_170_1 = null;
        int stackIn_170_2 = 0;
        int stackIn_170_3 = 0;
        ub stackIn_171_0 = null;
        String stackIn_171_1 = null;
        int stackIn_171_2 = 0;
        int stackIn_171_3 = 0;
        ub stackIn_172_0 = null;
        String stackIn_172_1 = null;
        int stackIn_172_2 = 0;
        int stackIn_172_3 = 0;
        ub stackIn_173_0 = null;
        String stackIn_173_1 = null;
        int stackIn_173_2 = 0;
        int stackIn_173_3 = 0;
        int stackIn_173_4 = 0;
        int stackIn_195_0 = 0;
        ub stackOut_65_0 = null;
        ub stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        ub stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        ub stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        ub stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        ub stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        ub stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        ub stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        int stackOut_73_3 = 0;
        ub stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        int stackOut_76_3 = 0;
        Object stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        int stackOut_75_3 = 0;
        ub stackOut_81_0 = null;
        ub stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        ub stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        ub stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        ub stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        ub stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        ub stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        int stackOut_87_3 = 0;
        ub stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        int stackOut_89_3 = 0;
        int stackOut_89_4 = 0;
        ub stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        int stackOut_88_3 = 0;
        int stackOut_88_4 = 0;
        Object stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        int stackOut_90_2 = 0;
        Object stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        Object stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        int stackOut_91_3 = 0;
        ub stackOut_95_0 = null;
        ub stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        ub stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        ub stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        ub stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        int stackOut_100_2 = 0;
        ub stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        int stackOut_99_2 = 0;
        ub stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        int stackOut_101_3 = 0;
        ub stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        int stackOut_103_4 = 0;
        ub stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        int stackOut_102_3 = 0;
        int stackOut_102_4 = 0;
        int stackOut_129_0 = 0;
        int stackOut_130_0 = 0;
        ub stackOut_169_0 = null;
        String stackOut_169_1 = null;
        int stackOut_169_2 = 0;
        int stackOut_169_3 = 0;
        ub stackOut_172_0 = null;
        String stackOut_172_1 = null;
        int stackOut_172_2 = 0;
        int stackOut_172_3 = 0;
        int stackOut_172_4 = 0;
        ub stackOut_170_0 = null;
        String stackOut_170_1 = null;
        int stackOut_170_2 = 0;
        int stackOut_170_3 = 0;
        ub stackOut_171_0 = null;
        String stackOut_171_1 = null;
        int stackOut_171_2 = 0;
        int stackOut_171_3 = 0;
        int stackOut_171_4 = 0;
        int stackOut_194_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_192_0 = 0;
        L0: {
          var14 = stellarshard.field_B;
          if (tl.field_c == 8) {
            wj.c((byte) 57);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (tl.field_c != 6) {
            if (tl.field_c != 7) {
              break L1;
            } else {
              if (!ah.a(-1)) {
                be.field_g = ab.a(-5094, 4);
                tl.field_c = ea.field_p;
                if (tl.field_c != 4) {
                  break L1;
                } else {
                  L2: {
                    qf.a((byte) -125);
                    wh.a(-94);
                    vc.field_h.c(param0 + 42, te.field_c);
                    oc.field_d = false;
                    if (tl.field_a <= 0) {
                      break L2;
                    } else {
                      oc.field_d = true;
                      break L2;
                    }
                  }
                  cl.field_a = cl.field_a + te.field_c;
                  te.field_c = 0;
                  break L1;
                }
              } else {
                n.field_L = 255;
                tl.field_c = fg.field_O;
                break L1;
              }
            }
          } else {
            rj.c((byte) -94);
            tl.field_c = 7;
            break L1;
          }
        }
        L3: {
          if (tl.field_c == 5) {
            L4: {
              var2 = qj.field_a;
              var3 = var2.field_N + 200;
              var4 = 4 + (var2.field_x + var2.field_r);
              ti.b(112, 190, 416, 20 + 5 * var4 - -60, 0, 192);
              ed.a(-6313, 103, 183, fg.field_P, 434, 80 + var4 * 5 + 14);
              var2.c(qj.field_b, 320, var3, 10742263, -1);
              stackOut_65_0 = (ub) var2;
              stackIn_67_0 = stackOut_65_0;
              stackIn_66_0 = stackOut_65_0;
              if (tf.field_a.a(0)) {
                stackOut_67_0 = (ub) (Object) stackIn_67_0;
                stackOut_67_1 = 0;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                break L4;
              } else {
                stackOut_66_0 = (ub) (Object) stackIn_66_0;
                stackOut_66_1 = 1;
                stackIn_68_0 = stackOut_66_0;
                stackIn_68_1 = stackOut_66_1;
                break L4;
              }
            }
            L5: {
              stackOut_68_0 = (ub) (Object) stackIn_68_0;
              stackOut_68_1 = stackIn_68_1;
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              if (tl.field_a == 0) {
                stackOut_70_0 = (ub) (Object) stackIn_70_0;
                stackOut_70_1 = stackIn_70_1;
                stackOut_70_2 = 0;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                stackIn_71_2 = stackOut_70_2;
                break L5;
              } else {
                stackOut_69_0 = (ub) (Object) stackIn_69_0;
                stackOut_69_1 = stackIn_69_1;
                stackOut_69_2 = 1;
                stackIn_71_0 = stackOut_69_0;
                stackIn_71_1 = stackOut_69_1;
                stackIn_71_2 = stackOut_69_2;
                break L5;
              }
            }
            L6: {
              stackOut_71_0 = (ub) (Object) stackIn_71_0;
              stackOut_71_1 = stackIn_71_1;
              stackOut_71_2 = stackIn_71_2;
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              if (0 == te.field_c) {
                stackOut_73_0 = (ub) (Object) stackIn_73_0;
                stackOut_73_1 = stackIn_73_1;
                stackOut_73_2 = stackIn_73_2;
                stackOut_73_3 = 0;
                stackIn_74_0 = stackOut_73_0;
                stackIn_74_1 = stackOut_73_1;
                stackIn_74_2 = stackOut_73_2;
                stackIn_74_3 = stackOut_73_3;
                break L6;
              } else {
                stackOut_72_0 = (ub) (Object) stackIn_72_0;
                stackOut_72_1 = stackIn_72_1;
                stackOut_72_2 = stackIn_72_2;
                stackOut_72_3 = 1;
                stackIn_74_0 = stackOut_72_0;
                stackIn_74_1 = stackOut_72_1;
                stackIn_74_2 = stackOut_72_2;
                stackIn_74_3 = stackOut_72_3;
                break L6;
              }
            }
            L7: {
              ((ub) (Object) stackIn_74_0).c(ch.a(stackIn_74_1 != 0, stackIn_74_2 != 0, stackIn_74_3 != 0, 0), 320, var4 + var3, 10742263, -1);
              stackOut_74_0 = this;
              stackOut_74_1 = 320;
              stackOut_74_2 = -4;
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              if (ld.field_F != 0) {
                stackOut_76_0 = this;
                stackOut_76_1 = stackIn_76_1;
                stackOut_76_2 = stackIn_76_2;
                stackOut_76_3 = 0;
                stackIn_77_0 = stackOut_76_0;
                stackIn_77_1 = stackOut_76_1;
                stackIn_77_2 = stackOut_76_2;
                stackIn_77_3 = stackOut_76_3;
                break L7;
              } else {
                stackOut_75_0 = this;
                stackOut_75_1 = stackIn_75_1;
                stackOut_75_2 = stackIn_75_2;
                stackOut_75_3 = 1;
                stackIn_77_0 = stackOut_75_0;
                stackIn_77_1 = stackOut_75_1;
                stackIn_77_2 = stackOut_75_2;
                stackIn_77_3 = stackOut_75_3;
                break L7;
              }
            }
            L8: {
              if (this.a(stackIn_77_1, stackIn_77_2, stackIn_77_3 == 0, var4 * 3 + var3, v.field_e, wl.field_T, 5883647)) {
                break L8;
              } else {
                if (n.field_L > 0) {
                  break L8;
                } else {
                  am.a(5, 4, -122);
                  break L8;
                }
              }
            }
            L9: {
              stackOut_81_0 = (ub) var2;
              stackIn_83_0 = stackOut_81_0;
              stackIn_82_0 = stackOut_81_0;
              if (te.field_c == 0) {
                stackOut_83_0 = (ub) (Object) stackIn_83_0;
                stackOut_83_1 = 0;
                stackIn_84_0 = stackOut_83_0;
                stackIn_84_1 = stackOut_83_1;
                break L9;
              } else {
                stackOut_82_0 = (ub) (Object) stackIn_82_0;
                stackOut_82_1 = 1;
                stackIn_84_0 = stackOut_82_0;
                stackIn_84_1 = stackOut_82_1;
                break L9;
              }
            }
            L10: {
              stackOut_84_0 = (ub) (Object) stackIn_84_0;
              stackOut_84_1 = stackIn_84_1;
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              if (tf.field_a.a(0)) {
                stackOut_86_0 = (ub) (Object) stackIn_86_0;
                stackOut_86_1 = stackIn_86_1;
                stackOut_86_2 = 0;
                stackIn_87_0 = stackOut_86_0;
                stackIn_87_1 = stackOut_86_1;
                stackIn_87_2 = stackOut_86_2;
                break L10;
              } else {
                stackOut_85_0 = (ub) (Object) stackIn_85_0;
                stackOut_85_1 = stackIn_85_1;
                stackOut_85_2 = 1;
                stackIn_87_0 = stackOut_85_0;
                stackIn_87_1 = stackOut_85_1;
                stackIn_87_2 = stackOut_85_2;
                break L10;
              }
            }
            L11: {
              stackOut_87_0 = (ub) (Object) stackIn_87_0;
              stackOut_87_1 = stackIn_87_1;
              stackOut_87_2 = stackIn_87_2;
              stackOut_87_3 = -72;
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_89_2 = stackOut_87_2;
              stackIn_89_3 = stackOut_87_3;
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              stackIn_88_3 = stackOut_87_3;
              if (tl.field_a == 0) {
                stackOut_89_0 = (ub) (Object) stackIn_89_0;
                stackOut_89_1 = stackIn_89_1;
                stackOut_89_2 = stackIn_89_2;
                stackOut_89_3 = stackIn_89_3;
                stackOut_89_4 = 0;
                stackIn_90_0 = stackOut_89_0;
                stackIn_90_1 = stackOut_89_1;
                stackIn_90_2 = stackOut_89_2;
                stackIn_90_3 = stackOut_89_3;
                stackIn_90_4 = stackOut_89_4;
                break L11;
              } else {
                stackOut_88_0 = (ub) (Object) stackIn_88_0;
                stackOut_88_1 = stackIn_88_1;
                stackOut_88_2 = stackIn_88_2;
                stackOut_88_3 = stackIn_88_3;
                stackOut_88_4 = 1;
                stackIn_90_0 = stackOut_88_0;
                stackIn_90_1 = stackOut_88_1;
                stackIn_90_2 = stackOut_88_2;
                stackIn_90_3 = stackOut_88_3;
                stackIn_90_4 = stackOut_88_4;
                break L11;
              }
            }
            L12: {
              ((ub) (Object) stackIn_90_0).c(pe.a(stackIn_90_1 != 0, stackIn_90_2 != 0, (byte) stackIn_90_3, stackIn_90_4 != 0), 320, 30 + (3 * var4 + var3), 10742263, -1);
              stackOut_90_0 = this;
              stackOut_90_1 = 320;
              stackOut_90_2 = param0 ^ -87;
              stackIn_92_0 = stackOut_90_0;
              stackIn_92_1 = stackOut_90_1;
              stackIn_92_2 = stackOut_90_2;
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              if (ld.field_F != 1) {
                stackOut_92_0 = this;
                stackOut_92_1 = stackIn_92_1;
                stackOut_92_2 = stackIn_92_2;
                stackOut_92_3 = 0;
                stackIn_93_0 = stackOut_92_0;
                stackIn_93_1 = stackOut_92_1;
                stackIn_93_2 = stackOut_92_2;
                stackIn_93_3 = stackOut_92_3;
                break L12;
              } else {
                stackOut_91_0 = this;
                stackOut_91_1 = stackIn_91_1;
                stackOut_91_2 = stackIn_91_2;
                stackOut_91_3 = 1;
                stackIn_93_0 = stackOut_91_0;
                stackIn_93_1 = stackOut_91_1;
                stackIn_93_2 = stackOut_91_2;
                stackIn_93_3 = stackOut_91_3;
                break L12;
              }
            }
            L13: {
              if (this.a(stackIn_93_1, stackIn_93_2, stackIn_93_3 == 0, 30 + var4 / 2 + (var3 + 4 * var4), v.field_e, sg.field_b, 5883647)) {
                break L13;
              } else {
                oc.field_d = false;
                tl.field_a = 0;
                ue.field_a = 0;
                ta.a(true, 713);
                ue.field_c.a((byte) -8);
                tf.field_a.a((byte) -8);
                qi.field_a = 0;
                n.field_L = 255;
                tl.field_c = 8;
                break L13;
              }
            }
            L14: {
              stackOut_95_0 = (ub) var2;
              stackIn_97_0 = stackOut_95_0;
              stackIn_96_0 = stackOut_95_0;
              if (0 == te.field_c) {
                stackOut_97_0 = (ub) (Object) stackIn_97_0;
                stackOut_97_1 = 0;
                stackIn_98_0 = stackOut_97_0;
                stackIn_98_1 = stackOut_97_1;
                break L14;
              } else {
                stackOut_96_0 = (ub) (Object) stackIn_96_0;
                stackOut_96_1 = 1;
                stackIn_98_0 = stackOut_96_0;
                stackIn_98_1 = stackOut_96_1;
                break L14;
              }
            }
            L15: {
              stackOut_98_0 = (ub) (Object) stackIn_98_0;
              stackOut_98_1 = stackIn_98_1;
              stackIn_100_0 = stackOut_98_0;
              stackIn_100_1 = stackOut_98_1;
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              if (tl.field_a == 0) {
                stackOut_100_0 = (ub) (Object) stackIn_100_0;
                stackOut_100_1 = stackIn_100_1;
                stackOut_100_2 = 0;
                stackIn_101_0 = stackOut_100_0;
                stackIn_101_1 = stackOut_100_1;
                stackIn_101_2 = stackOut_100_2;
                break L15;
              } else {
                stackOut_99_0 = (ub) (Object) stackIn_99_0;
                stackOut_99_1 = stackIn_99_1;
                stackOut_99_2 = 1;
                stackIn_101_0 = stackOut_99_0;
                stackIn_101_1 = stackOut_99_1;
                stackIn_101_2 = stackOut_99_2;
                break L15;
              }
            }
            L16: {
              stackOut_101_0 = (ub) (Object) stackIn_101_0;
              stackOut_101_1 = stackIn_101_1;
              stackOut_101_2 = stackIn_101_2;
              stackOut_101_3 = 6;
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              stackIn_103_3 = stackOut_101_3;
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              stackIn_102_3 = stackOut_101_3;
              if (tf.field_a.a(param0 + -85)) {
                stackOut_103_0 = (ub) (Object) stackIn_103_0;
                stackOut_103_1 = stackIn_103_1;
                stackOut_103_2 = stackIn_103_2;
                stackOut_103_3 = stackIn_103_3;
                stackOut_103_4 = 0;
                stackIn_104_0 = stackOut_103_0;
                stackIn_104_1 = stackOut_103_1;
                stackIn_104_2 = stackOut_103_2;
                stackIn_104_3 = stackOut_103_3;
                stackIn_104_4 = stackOut_103_4;
                break L16;
              } else {
                stackOut_102_0 = (ub) (Object) stackIn_102_0;
                stackOut_102_1 = stackIn_102_1;
                stackOut_102_2 = stackIn_102_2;
                stackOut_102_3 = stackIn_102_3;
                stackOut_102_4 = 1;
                stackIn_104_0 = stackOut_102_0;
                stackIn_104_1 = stackOut_102_1;
                stackIn_104_2 = stackOut_102_2;
                stackIn_104_3 = stackOut_102_3;
                stackIn_104_4 = stackOut_102_4;
                break L16;
              }
            }
            ((ub) (Object) stackIn_104_0).c(stellarshard.a(stackIn_104_1 != 0, stackIn_104_2 != 0, stackIn_104_3, stackIn_104_4 != 0), 320, 4 * var4 + var3 + 60, 10742263, -1);
            ti.b(112, 190, 416, 80 + var4 * 5, 16777215, n.field_L);
            break L3;
          } else {
            if (tl.field_c == 4) {
              if (((ij) this).field_t >= 0) {
                var8 = ((ij) this).field_t;
                var9 = 0;
                L17: while (true) {
                  if (var9 > 50) {
                    L18: {
                      var2_int = 5883647;
                      if (0 < tl.field_a) {
                        ic.a(dj.field_c, 8, -1, false, 320, var2_int, 415);
                        break L18;
                      } else {
                        ic.a(dj.field_c, 8, -1, false, 320, var2_int, 415);
                        break L18;
                      }
                    }
                    var3_ref_String = sg.field_d + qi.field_a + wc.field_l + ue.field_a;
                    int discarded$9 = l.field_f.a(var3_ref_String, -1, 260, 640, 180, 0, -1, 1, 1, l.field_f.field_N);
                    int discarded$10 = l.field_f.a(var3_ref_String, 1, 260, 640, 180, 0, -1, 1, 1, l.field_f.field_N);
                    int discarded$11 = l.field_f.a(var3_ref_String, 0, 259, 640, 180, 0, -1, 1, 1, l.field_f.field_N);
                    int discarded$12 = l.field_f.a(var3_ref_String, 0, 261, 640, 180, 0, -1, 1, 1, l.field_f.field_N);
                    int discarded$13 = l.field_f.a(var3_ref_String, 0, 260, 640, 180, 10742263, -1, 1, 1, l.field_f.field_N);
                    break L3;
                  } else {
                    L19: {
                      var2_double = 3.141592653589793 * (double)var9 / 25.0;
                      if (var9 != 25) {
                        break L19;
                      } else {
                        L20: {
                          var10_ref_pa = new pa(rh.field_b, false, false, false, false);
                          ((ij) this).field_q = ((ij) this).field_q + 1;
                          if (((ij) this).field_q > 256) {
                            ((ij) this).field_q = ((ij) this).field_q - 256;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        var11 = (int)(Math.cos((double)((ij) this).field_q * 3.141592653589793 / 128.0) * 65536.0);
                        var12_int = (int)(65536.0 * Math.sin(3.141592653589793 * (double)((ij) this).field_q / 128.0));
                        var10_ref_pa.a(new int[12]);
                        var10_ref_pa.a(new int[12]);
                        var10_ref_pa.a(new int[12]);
                        var10_ref_pa.a(new int[12]);
                        var10_ref_pa.a(new int[12]);
                        var13_ref_bj = var10_ref_pa.a(32, 346, 50, 50, -50);
                        var13_ref_bj.a(0, 0, 0, 0, 0, 0, 1000, -1L);
                        pd.field_h.a((byte) -107);
                        break L19;
                      }
                    }
                    L21: {
                      var4_double = (double)(var9 + 1) * 3.141592653589793 / 25.0;
                      var6 = (int)(128.0 * Math.cos(var2_double));
                      var7 = (int)(Math.sin(var2_double) * -64.0);
                      if (var8 > 0) {
                        L22: {
                          L23: {
                            if (var8 <= var9) {
                              break L23;
                            } else {
                              if (mg.field_t > var9) {
                                break L23;
                              } else {
                                ti.a(var6 + 320 << 4, 240 + var7 << 4, 256, 255 * var9 / var8, ei.field_I);
                                break L22;
                              }
                            }
                          }
                          if (var8 != var9) {
                            ti.a(var6 + 320 << 4, var7 + 240 << 4, 128, 64, ei.field_I);
                            break L22;
                          } else {
                            ti.a(320 + var6 << 4, 240 + var7 << 4, 256, var9 * 255 / var8, ei.field_B);
                            break L22;
                          }
                        }
                        L24: {
                          var6 = var6 * 9 / 10;
                          var7 = 9 * var7 / 10;
                          if (var8 <= var9) {
                            break L24;
                          } else {
                            if (mg.field_t > var9) {
                              break L24;
                            } else {
                              ti.a(var6 - -320 << 4, 240 + var7 << 4, 192, var9 * 255 / var8, ei.field_I);
                              break L24;
                            }
                          }
                        }
                        L25: {
                          if (var9 == var8) {
                            ti.a(320 + var6 << 4, var7 + 240 << 4, 192, 255 * var9 / var8, ei.field_B);
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          var7 = 9 * var7 / 10;
                          var6 = 9 * var6 / 10;
                          if (var8 <= var9) {
                            break L26;
                          } else {
                            if (~var9 > ~mg.field_t) {
                              break L26;
                            } else {
                              ti.a(320 + var6 << 4, 240 + var7 << 4, 128, var9 * 255 / var8, ei.field_I);
                              break L26;
                            }
                          }
                        }
                        L27: {
                          if (~var9 != ~var8) {
                            break L27;
                          } else {
                            ti.a(320 + var6 << 4, var7 + 240 << 4, 128, 255 * var9 / var8, ei.field_B);
                            break L27;
                          }
                        }
                        L28: {
                          var6 = 9 * var6 / 10;
                          var7 = 9 * var7 / 10;
                          if (var8 <= var9) {
                            break L28;
                          } else {
                            if (~mg.field_t < ~var9) {
                              break L28;
                            } else {
                              ti.a(var6 - -320 << 4, 240 + var7 << 4, 64, var9 * 255 / var8, ei.field_I);
                              break L28;
                            }
                          }
                        }
                        if (~var8 == ~var9) {
                          ti.a(var6 + 320 << 4, 240 + var7 << 4, 64, 255 * var9 / var8, ei.field_B);
                          break L21;
                        } else {
                          break L21;
                        }
                      } else {
                        break L21;
                      }
                    }
                    var9++;
                    continue L17;
                  }
                }
              } else {
                return;
              }
            } else {
              break L3;
            }
          }
        }
        L29: {
          if (tl.field_c != 0) {
            break L29;
          } else {
            ((ij) this).field_u = -1;
            if (!s.field_i) {
              break L29;
            } else {
              break L29;
            }
          }
        }
        L30: {
          if (tl.field_c != 1) {
            break L30;
          } else {
            hk.field_l[1].e(0, 0);
            ti.b(12, 96, 616, 336, 0, 192);
            ed.a(-6313, 3, 89, fg.field_P, 634, 343);
            ic.a(li.field_b, 9, -1, false, 320, 5883647, 439);
            var2_int = 84;
            var3 = 104;
            qj.field_a.c(be.field_a, 320, var3 - -12, 10742263, -1);
            var3 += 14;
            qj.field_a.c(hj.field_c, 320, var3 - -12, 10742263, -1);
            var3 += 22;
            int discarded$14 = qj.field_a.a(pl.field_V, 160, var3 + -6, 416, 32, 10742263, -1, 0, 0, 13);
            e.field_g[8].e(var2_int, -36 + (var3 - -4));
            var3 += 12;
            var2_int -= 64;
            var4 = var3;
            e.field_g[0].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(ei.field_A, var2_int - -68, 12 + var3, 16777215, -1);
            e.field_g[1].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(gf.field_a, var2_int + 68, 12 + var3, 16777215, -1);
            e.field_g[2].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(ka.field_l, var2_int - -68, var3 + 12, 16777215, -1);
            e.field_g[3].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(he.field_l, 68 + var2_int, 12 + var3, 16777215, -1);
            e.field_g[4].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(td.field_e, var2_int - -68, var3 + 12, 16777215, -1);
            var2_int += 192;
            var3 = var4;
            e.field_g[5].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(nl.field_f, 68 + var2_int, var3 + 12, 16777215, -1);
            e.field_g[6].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(qh.field_h, 68 + var2_int, 12 + var3, 16777215, -1);
            e.field_g[7].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(we.field_e, var2_int + 68, 12 + var3, 16777215, -1);
            e.field_g[9].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(te.field_b, 68 + var2_int, var3 - -12, 16777215, -1);
            e.field_g[10].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(ha.field_x, var2_int - -68, 12 + var3, 16777215, -1);
            var2_int += 192;
            var3 = var4;
            e.field_g[11].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(fc.field_c, var2_int + 68, 12 + var3, 16777215, -1);
            e.field_g[12].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(wg.field_e, var2_int - -68, var3 - -12, 16777215, -1);
            e.field_g[13].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(nb.field_O, 68 + var2_int, var3 - -12, 16777215, -1);
            e.field_g[14].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(ja.field_k, var2_int - -68, var3 + 12, 16777215, -1);
            e.field_g[15].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(rd.field_b, 68 + var2_int, 12 + var3, 16777215, -1);
            var2_int += 144;
            var3 = var4;
            var3 = 400;
            var2_int = 320;
            var5_ref_String = nb.field_N;
            qj.field_a.c(var5_ref_String, 1 + var2_int, var3, 0, -1);
            qj.field_a.c(var5_ref_String, var2_int - 1, var3, 0, -1);
            qj.field_a.c(var5_ref_String, var2_int, var3 - -1, 0, -1);
            qj.field_a.c(var5_ref_String, var2_int, var3 + -1, 0, -1);
            qj.field_a.c(var5_ref_String, var2_int, var3, 16777215, -1);
            var5_ref_String = cm.field_e;
            var3 += 16;
            qj.field_a.c(var5_ref_String, 1 + var2_int, var3, 0, -1);
            qj.field_a.c(var5_ref_String, var2_int - 1, var3, 0, -1);
            qj.field_a.c(var5_ref_String, var2_int, 1 + var3, 0, -1);
            qj.field_a.c(var5_ref_String, var2_int, var3 + -1, 0, -1);
            qj.field_a.c(var5_ref_String, var2_int, var3, 16777215, -1);
            ti.b(12, 96, 616, 336, 16777215, n.field_L);
            break L30;
          }
        }
        L31: {
          if (tl.field_c != 2) {
            break L31;
          } else {
            L32: {
              hk.field_l[0].e(0, 0);
              ti.b(128, 105, 384, 295, 0, 192);
              ed.a(-6313, 119, 98, fg.field_P, 402, 302);
              ic.a(li.field_b, 9, -1, false, 320, 5883647, 439);
              if (!ah.a(-1)) {
                L33: {
                  if (gh.field_d != null) {
                    break L33;
                  } else {
                    gh.field_d = bk.a(3, 10, 1, 17, 5);
                    break L33;
                  }
                }
                L34: {
                  if (gh.field_d.field_s) {
                    if (gh.field_d.field_u != null) {
                      var3_ref_String__ = gh.field_d.field_u[si.field_X];
                      var4_ref_long__ = gh.field_d.field_w[si.field_X];
                      var5_ref_int__ = gh.field_d.field_o[si.field_X];
                      var6 = 0;
                      var7 = 0;
                      var8_ref_nf = bi.field_u;
                      var9 = 123;
                      var10 = 0;
                      L35: while (true) {
                        L36: {
                          L37: {
                            if (var6 != 0) {
                              break L37;
                            } else {
                              if (ue.field_a <= 0) {
                                break L37;
                              } else {
                                stackOut_129_0 = 11;
                                stackIn_131_0 = stackOut_129_0;
                                break L36;
                              }
                            }
                          }
                          stackOut_130_0 = 10;
                          stackIn_131_0 = stackOut_130_0;
                          break L36;
                        }
                        if (~stackIn_131_0 >= ~var10) {
                          L38: {
                            if (var7 != 0) {
                              break L38;
                            } else {
                              qj.field_a.c(pd.field_p, 320, 159, 0, -1);
                              qj.field_a.c(pd.field_p, 320, 161, 0, -1);
                              qj.field_a.c(pd.field_p, 319, 160, 0, -1);
                              qj.field_a.c(pd.field_p, 321, 160, 0, -1);
                              qj.field_a.c(pd.field_p, 320, 160, 16777215, -1);
                              break L38;
                            }
                          }
                          ti.d(129, 0, 511, 479);
                          qj.field_a.c(sj.field_C, 320 + -bf.field_c, 366, 0, -1);
                          qj.field_a.c(sj.field_C, -bf.field_c + 320, 368, 0, -1);
                          qj.field_a.c(sj.field_C, 319 + -bf.field_c, 367, 0, -1);
                          qj.field_a.c(sj.field_C, -bf.field_c + 321, 367, 0, -1);
                          qj.field_a.c(sj.field_C, 320 - bf.field_c, 367, 16777215, -1);
                          ti.b();
                          break L34;
                        } else {
                          L39: {
                            var2_int = 10742263;
                            if (10 <= var10) {
                              break L39;
                            } else {
                              if (var6 != 0) {
                                break L39;
                              } else {
                                if (var8_ref_nf == null) {
                                  break L39;
                                } else {
                                  if (!hk.a(89, var3_ref_String__[var10])) {
                                    break L39;
                                  } else {
                                    if (var4_ref_long__[var10] != var8_ref_nf.field_k) {
                                      break L39;
                                    } else {
                                      if (~var5_ref_int__[var10] == ~ue.field_a) {
                                        var6 = 1;
                                        var2_int = 16777215;
                                        break L39;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L40: {
                            L41: {
                              if (var10 == 10) {
                                break L41;
                              } else {
                                if (var3_ref_String__[var10] != null) {
                                  break L41;
                                } else {
                                  break L40;
                                }
                              }
                            }
                            L42: {
                              var7 = 1;
                              var11 = 0;
                              if (var10 < 10) {
                                var11 = var5_ref_int__[var10];
                                break L42;
                              } else {
                                break L42;
                              }
                            }
                            L43: {
                              var12 = null;
                              if (10 > var10) {
                                var12 = (Object) (Object) var3_ref_String__[var10];
                                break L43;
                              } else {
                                break L43;
                              }
                            }
                            L44: {
                              var12 = (Object) (Object) (var10 - -1 + "." + var12);
                              if (var6 != 0) {
                                break L44;
                              } else {
                                if (var10 != 10) {
                                  break L44;
                                } else {
                                  if (0 < ue.field_a) {
                                    var11 = ue.field_a;
                                    var12 = (Object) (Object) wf.field_b;
                                    var2_int = 16777215;
                                    var12 = (Object) (Object) (vg.field_s + var12);
                                    break L44;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                            }
                            var13 = 162;
                            qj.field_a.a((String) var12, var13 - -1, var9 + 16, 0, -1);
                            qj.field_a.a((String) var12, -1 + var13, var9 - -16, 0, -1);
                            qj.field_a.a((String) var12, var13, 1 + var9 - -16, 0, -1);
                            qj.field_a.a((String) var12, var13, -1 + var9 + 16, 0, -1);
                            qj.field_a.a((String) var12, var13, 16 + var9, var2_int, -1);
                            qj.field_a.b("" + var11, 477, var9 + 16, 0, -1);
                            qj.field_a.b("" + var11, 479, 16 + var9, 0, -1);
                            qj.field_a.b("" + var11, 478, var9 + 15, 0, -1);
                            qj.field_a.b("" + var11, 478, var9 + 17, 0, -1);
                            qj.field_a.b("" + var11, 478, var9 - -16, var2_int, -1);
                            break L40;
                          }
                          var9 += 20;
                          var10++;
                          continue L35;
                        }
                      }
                    } else {
                      qj.field_a.c(ib.field_d, 320, 159, 0, -1);
                      qj.field_a.c(ib.field_d, 320, 161, 0, -1);
                      qj.field_a.c(ib.field_d, 319, 160, 0, -1);
                      qj.field_a.c(ib.field_d, 321, 160, 0, -1);
                      qj.field_a.c(ib.field_d, 320, 160, 16777215, -1);
                      break L34;
                    }
                  } else {
                    qj.field_a.c(wk.field_g, 320, 159, 0, -1);
                    qj.field_a.c(wk.field_g, 320, 161, 0, -1);
                    qj.field_a.c(wk.field_g, 319, 160, 0, -1);
                    qj.field_a.c(wk.field_g, 321, 160, 0, -1);
                    qj.field_a.c(wk.field_g, 320, 160, 16777215, -1);
                    break L34;
                  }
                }
                ic.a("                                                ", 8, -1, false, 320, 5883647, 411);
                var3 = -1;
                L45: while (true) {
                  if (var3 > 1) {
                    break L32;
                  } else {
                    L46: {
                      l.field_f.c(od.field_w[1 + var3], 192 * var3 + 319, 435, 0, 0);
                      l.field_f.c(od.field_w[1 + var3], 320 + 192 * var3, 434, 0, 0);
                      stackOut_169_0 = l.field_f;
                      stackOut_169_1 = od.field_w[var3 + 1];
                      stackOut_169_2 = 192 * var3 + 320;
                      stackOut_169_3 = 435;
                      stackIn_172_0 = stackOut_169_0;
                      stackIn_172_1 = stackOut_169_1;
                      stackIn_172_2 = stackOut_169_2;
                      stackIn_172_3 = stackOut_169_3;
                      stackIn_170_0 = stackOut_169_0;
                      stackIn_170_1 = stackOut_169_1;
                      stackIn_170_2 = stackOut_169_2;
                      stackIn_170_3 = stackOut_169_3;
                      if (~var3 == ~(si.field_X - 1)) {
                        stackOut_172_0 = (ub) (Object) stackIn_172_0;
                        stackOut_172_1 = (String) (Object) stackIn_172_1;
                        stackOut_172_2 = stackIn_172_2;
                        stackOut_172_3 = stackIn_172_3;
                        stackOut_172_4 = 16777215;
                        stackIn_173_0 = stackOut_172_0;
                        stackIn_173_1 = stackOut_172_1;
                        stackIn_173_2 = stackOut_172_2;
                        stackIn_173_3 = stackOut_172_3;
                        stackIn_173_4 = stackOut_172_4;
                        break L46;
                      } else {
                        stackOut_170_0 = (ub) (Object) stackIn_170_0;
                        stackOut_170_1 = (String) (Object) stackIn_170_1;
                        stackOut_170_2 = stackIn_170_2;
                        stackOut_170_3 = stackIn_170_3;
                        stackIn_171_0 = stackOut_170_0;
                        stackIn_171_1 = stackOut_170_1;
                        stackIn_171_2 = stackOut_170_2;
                        stackIn_171_3 = stackOut_170_3;
                        stackOut_171_0 = (ub) (Object) stackIn_171_0;
                        stackOut_171_1 = (String) (Object) stackIn_171_1;
                        stackOut_171_2 = stackIn_171_2;
                        stackOut_171_3 = stackIn_171_3;
                        stackOut_171_4 = 5883647;
                        stackIn_173_0 = stackOut_171_0;
                        stackIn_173_1 = stackOut_171_1;
                        stackIn_173_2 = stackOut_171_2;
                        stackIn_173_3 = stackOut_171_3;
                        stackIn_173_4 = stackOut_171_4;
                        break L46;
                      }
                    }
                    ((ub) (Object) stackIn_173_0).c(stackIn_173_1, stackIn_173_2, stackIn_173_3, stackIn_173_4, -1);
                    var3++;
                    continue L45;
                  }
                }
              } else {
                L47: {
                  qj.field_a.c(pd.field_p, 320, 159, 0, -1);
                  qj.field_a.c(pd.field_p, 320, 161, 0, -1);
                  qj.field_a.c(pd.field_p, 319, 160, 0, -1);
                  qj.field_a.c(pd.field_p, 321, 160, 0, -1);
                  qj.field_a.c(pd.field_p, 320, 160, 16777215, -1);
                  if (!ah.a(param0 ^ -86)) {
                    break L47;
                  } else {
                    int discarded$15 = qj.field_a.a(hj.field_e, 220, 192, 200, 200, 16777215, 0, 1, 0, qj.field_a.field_N);
                    break L47;
                  }
                }
                ic.a(wl.field_T, 8, -1, false, 320, 5883647, 411);
                break L32;
              }
            }
            ti.b(128, 105, 384, 295, 16777215, n.field_L);
            break L31;
          }
        }
        L48: {
          if (tl.field_c != 3) {
            break L48;
          } else {
            L49: {
              ((ij) this).field_r = -1;
              ti.b(108, 112, 424, 296, 0, 192);
              ed.a(-6313, 99, 105, fg.field_P, 442, 303);
              ti.e(175, 129, 282, 82, 4, 2387345);
              if (3 == bb.field_d) {
                ti.e(126, -98 + (330 + 5 * qj.field_a.field_N / 2) - 7, 388, 132, 4, 2387345);
                break L49;
              } else {
                ti.e(130, -96 + (qj.field_a.field_N * 5 / 2 + 321), 380, 132, 4, 2387345);
                break L49;
              }
            }
            L50: {
              if (!oc.field_d) {
                hk.field_l[2].e(0, 0);
                break L50;
              } else {
                hk.field_l[3].e(0, 0);
                break L50;
              }
            }
            L51: {
              ic.a(li.field_b, 9, -1, false, 320, 5883647, 439);
              if (oc.field_d) {
                ic.a(ta.field_r, 8, -1, false, 320, 5883647, 411);
                break L51;
              } else {
                break L51;
              }
            }
            L52: {
              if (ah.a(param0 + -86)) {
                ic.a(wl.field_T, 8, -1, false, 320, 5883647, 411);
                break L52;
              } else {
                break L52;
              }
            }
            L53: {
              var2_int = 180;
              var3 = 134;
              if (oc.field_d) {
                stackOut_194_0 = tl.field_a;
                stackIn_195_0 = stackOut_194_0;
                break L53;
              } else {
                if (!ah.a(-1)) {
                  stackOut_193_0 = sd.field_d;
                  stackIn_195_0 = stackOut_193_0;
                  break L53;
                } else {
                  stackOut_192_0 = 0;
                  stackIn_195_0 = stackOut_192_0;
                  break L53;
                }
              }
            }
            var4 = stackIn_195_0;
            var5 = 0;
            var6 = 1;
            var7 = 0;
            L54: while (true) {
              if (rc.field_e.length <= var7) {
                L55: {
                  if (var6 == 0) {
                    break L55;
                  } else {
                    var7 = 330 - (-(qj.field_a.field_N * 5 / 2) + 96);
                    var7 = var7 + qj.field_a.field_N;
                    qj.field_a.c(id.field_l, 320, var7, 10742263, -1);
                    if (ah.a(-1)) {
                      qj.field_a.c(hj.field_e, 320, var7 + 100, 10742263, -1);
                      break L55;
                    } else {
                      break L55;
                    }
                  }
                }
                ti.b(108, 80, 424, 328, 16777215, n.field_L);
                break L48;
              } else {
                L56: {
                  L57: {
                    if (var7 != 13) {
                      break L57;
                    } else {
                      if (pk.a(-12663, 0)) {
                        break L57;
                      } else {
                        if ((var4 & 1 << var7) == 0) {
                          var5++;
                          break L56;
                        } else {
                          break L57;
                        }
                      }
                    }
                  }
                  L58: {
                    var8 = 0;
                    if (~var2_int < ~ni.field_e) {
                      break L58;
                    } else {
                      if (~ni.field_e < ~(32 + var2_int)) {
                        break L58;
                      } else {
                        if (~eb.field_a > ~var3) {
                          break L58;
                        } else {
                          if (var3 - -32 >= eb.field_a) {
                            ((ij) this).field_r = var7;
                            var8 = 2;
                            if (((ij) this).field_u != -1) {
                              ti.e(var2_int - 2, -2 + var3, 36, 36, 4, 1193544);
                              break L58;
                            } else {
                              break L58;
                            }
                          } else {
                            break L58;
                          }
                        }
                      }
                    }
                  }
                  L59: {
                    if (~var7 == ~((ij) this).field_u) {
                      var8 = 2;
                      ti.e(-3 + var2_int, var3 - 3, 38, 38, 4, 2387345);
                      break L59;
                    } else {
                      break L59;
                    }
                  }
                  L60: {
                    if (0 != (1 << var7 & var4)) {
                      wh.field_e[var7].a(var2_int - var8, -var8 + var3, var8 * 2 + 32, 2 * var8 + 32);
                      break L60;
                    } else {
                      if (oc.field_d) {
                        break L56;
                      } else {
                        L61: {
                          if (6 == var7) {
                            break L61;
                          } else {
                            if (var7 == 8) {
                              break L61;
                            } else {
                              if (mk.field_k <= 0) {
                                ce.field_a.a(var2_int + -var8, -var8 + var3, 32 + var8 * 2, 32 - -(2 * var8));
                                break L60;
                              } else {
                                break L61;
                              }
                            }
                          }
                        }
                        uf.field_g.a(-var8 + var2_int, -var8 + var3, 2 * var8 + 32, 32 + var8 * 2);
                        break L60;
                      }
                    }
                  }
                  L62: {
                    L63: {
                      if (~var7 == ~((ij) this).field_u) {
                        break L63;
                      } else {
                        if (((ij) this).field_u != -1) {
                          break L62;
                        } else {
                          if (~var2_int < ~ni.field_e) {
                            break L62;
                          } else {
                            if (~(32 + var2_int) > ~ni.field_e) {
                              break L62;
                            } else {
                              if (~var3 < ~eb.field_a) {
                                break L62;
                              } else {
                                if (eb.field_a <= var3 + 32) {
                                  break L63;
                                } else {
                                  break L62;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L64: {
                      qj.field_a.c(rc.field_e[var7], 320, 230, 16777215, -1);
                      var6 = 0;
                      if ((1 << var7 & var4) == 0) {
                        qj.field_a.c(tf.field_c, 320, 234 + qj.field_a.field_N, 16711680, -1);
                        break L64;
                      } else {
                        qj.field_a.c(jg.field_ob, 320, qj.field_a.field_N + 234, 16777215, -1);
                        break L64;
                      }
                    }
                    L65: {
                      var9 = qj.field_a.field_N * 5 / 2 + 227;
                      if ((1 << var7 & var4) == 0) {
                        L66: {
                          if (var7 == 6) {
                            break L66;
                          } else {
                            if (8 == var7) {
                              break L66;
                            } else {
                              if (mk.field_k > 0) {
                                break L66;
                              } else {
                                ce.field_a.e(132, var9);
                                break L65;
                              }
                            }
                          }
                        }
                        uf.field_g.e(132, var9);
                        break L65;
                      } else {
                        wh.field_e[var7].e(132, var9);
                        break L65;
                      }
                    }
                    var9 = var9 + qj.field_a.field_N;
                    int discarded$16 = qj.field_a.a(hc.field_t[var7] + "<br><br>" + bb.field_h + wf.field_d[var7] + "<br><br>" + dd.field_b + am.field_d[var7], 280, -qj.field_a.field_N + var9, 228, 92, 10742263, -1, 1, 1, 2 + qj.field_a.field_N);
                    var10 = am.field_d[var7];
                    var11 = 0;
                    L67: while (true) {
                      if (~var10 >= ~var11) {
                        break L62;
                      } else {
                        af.field_n.a(-16 + -(4 * (var10 + -1)) + 8 * var11 + 394, 126 + var9 - (qj.field_a.field_N - -32));
                        var11++;
                        continue L67;
                      }
                    }
                  }
                  int incrementValue$17 = var5;
                  var5++;
                  if (6 == incrementValue$17) {
                    var3 += 40;
                    var2_int = 180;
                    break L56;
                  } else {
                    var2_int += 40;
                    break L56;
                  }
                }
                var7++;
                continue L54;
              }
            }
          }
        }
        super.a(param0);
    }

    static {
    }
}
