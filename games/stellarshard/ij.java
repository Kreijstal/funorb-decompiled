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
                L2: {
                  var2_int = 0;
                  var3 = ((ij) this).field_j + -1;
                  if (!s.field_i) {
                    break L2;
                  } else {
                    var3 -= 3;
                    if (mk.field_k <= 0) {
                      var3--;
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                if (of.field_A <= 1) {
                  var2_int = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L3: {
                if (tl.field_c == 4) {
                  var2_int = 8;
                  var3 = 9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (tl.field_c != 1) {
                  break L4;
                } else {
                  var3 = 10;
                  var2_int = 9;
                  break L4;
                }
              }
              L5: {
                if (tl.field_c != 2) {
                  break L5;
                } else {
                  var2_int = 8;
                  var3 = 10;
                  break L5;
                }
              }
              L6: {
                if (tl.field_c == 3) {
                  var2_int = 8;
                  var3 = 10;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                L8: {
                  if (param0 != tl.field_c) {
                    break L8;
                  } else {
                    if (gi.field_f != 96) {
                      break L8;
                    } else {
                      ((ij) this).field_l = 1;
                      if (var4 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                if (tl.field_c != 8) {
                  break L7;
                } else {
                  if (gi.field_f == 97) {
                    ((ij) this).field_l = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                L10: {
                  if (gi.field_f != 98) {
                    break L10;
                  } else {
                    L11: {
                      if (tl.field_c == 0) {
                        break L11;
                      } else {
                        if (tl.field_c == 4) {
                          break L11;
                        } else {
                          if (tl.field_c == 1) {
                            break L11;
                          } else {
                            if (tl.field_c == 2) {
                              break L11;
                            } else {
                              if (3 == tl.field_c) {
                                break L11;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                    }
                    L12: {
                      ((ij) this).field_l = ((ij) this).field_l - 1;
                      if (((ij) this).field_l != 0) {
                        break L12;
                      } else {
                        if (s.field_i) {
                          ((ij) this).field_l = -1 + var3;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (1 != ((ij) this).field_l) {
                        break L13;
                      } else {
                        if (s.field_i) {
                          ((ij) this).field_l = ((ij) this).field_l - 1;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (~var2_int >= ~((ij) this).field_l) {
                        break L14;
                      } else {
                        if (s.field_i) {
                          ((ij) this).field_l = 1;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (var2_int > ((ij) this).field_l) {
                      ((ij) this).field_l = var3 + -1;
                      if (var4 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                L15: {
                  if (gi.field_f != 99) {
                    break L15;
                  } else {
                    L16: {
                      if (tl.field_c == 0) {
                        break L16;
                      } else {
                        if (tl.field_c == 4) {
                          break L16;
                        } else {
                          if (tl.field_c == 1) {
                            break L16;
                          } else {
                            if (2 == tl.field_c) {
                              break L16;
                            } else {
                              if (tl.field_c != 3) {
                                break L9;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                    }
                    L17: {
                      ((ij) this).field_l = ((ij) this).field_l + 1;
                      if (((ij) this).field_l != 2) {
                        break L17;
                      } else {
                        if (!s.field_i) {
                          break L17;
                        } else {
                          ((ij) this).field_l = var2_int;
                          break L17;
                        }
                      }
                    }
                    L18: {
                      if (((ij) this).field_l != 1) {
                        break L18;
                      } else {
                        if (s.field_i) {
                          ((ij) this).field_l = ((ij) this).field_l + 1;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                    }
                    L19: {
                      if (~((ij) this).field_l > ~var3) {
                        break L19;
                      } else {
                        if (s.field_i) {
                          ((ij) this).field_l = 1;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                    }
                    L20: {
                      if (((ij) this).field_l < var2_int) {
                        ((ij) this).field_l = var2_int;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    if (~var3 >= ~((ij) this).field_l) {
                      ((ij) this).field_l = var2_int;
                      if (var4 == 0) {
                        break L9;
                      } else {
                        break L15;
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                this.c(((ij) this).field_l, -3);
                break L9;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "ij.I(" + param0 + ')');
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
          throw ma.a((Throwable) (Object) var4, "ij.J(" + param0 + ',' + param1 + ',' + param2 + ')');
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
        Object stackOut_32_0 = null;
        Object stackOut_33_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
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
        Object stackOut_125_0 = null;
        Object stackOut_126_0 = null;
        Object stackOut_128_0 = null;
        Object stackOut_129_0 = null;
        Object stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        Object stackOut_133_0 = null;
        int stackOut_133_1 = 0;
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
                L4: {
                  if (tl.field_c != 2) {
                    break L4;
                  } else {
                    if (param3 != 8) {
                      break L4;
                    } else {
                      if (!ah.a(-1)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (0 != tl.field_c) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        if (1 != param3) {
                          break L7;
                        } else {
                          if (s.field_i) {
                            break L7;
                          } else {
                            if (of.field_A > 1) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      L8: {
                        if (param3 == 3) {
                          break L8;
                        } else {
                          L9: {
                            if (4 == param3) {
                              break L9;
                            } else {
                              super.a(param0, param1, (byte) 8, param3, param4, param5);
                              if (var8 == 0) {
                                break L2;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            L11: {
                              stackOut_32_0 = this;
                              stackIn_40_0 = stackOut_32_0;
                              stackIn_33_0 = stackOut_32_0;
                              if (320 > param1) {
                                break L11;
                              } else {
                                stackOut_33_0 = this;
                                stackIn_35_0 = stackOut_33_0;
                                stackOut_35_0 = this;
                                stackIn_40_0 = stackOut_35_0;
                                stackIn_36_0 = stackOut_35_0;
                                if (param1 >= 420) {
                                  break L11;
                                } else {
                                  stackOut_36_0 = this;
                                  stackIn_38_0 = stackOut_36_0;
                                  stackOut_38_0 = this;
                                  stackOut_38_1 = 1;
                                  stackIn_41_0 = stackOut_38_0;
                                  stackIn_41_1 = stackOut_38_1;
                                  break L10;
                                }
                              }
                            }
                            stackOut_40_0 = this;
                            stackOut_40_1 = 0;
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            break L10;
                          }
                          L12: {
                            ((ij) this).field_o = stackIn_41_1 != 0;
                            if (param5) {
                              ((ij) this).field_o = true;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L13: {
                            L14: {
                              if (!((ij) this).field_o) {
                                break L14;
                              } else {
                                L15: {
                                  ai.field_c = param1 + -320;
                                  if (ai.field_c < 0) {
                                    ai.field_c = 0;
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                L16: {
                                  if (ai.field_c <= 100) {
                                    break L16;
                                  } else {
                                    ai.field_c = 100;
                                    break L16;
                                  }
                                }
                                if (vf.field_L == null) {
                                  vf.field_L = fe.field_c;
                                  nj.field_o.a((p) (Object) vf.field_L);
                                  if (var8 == 0) {
                                    break L13;
                                  } else {
                                    break L14;
                                  }
                                } else {
                                  break L13;
                                }
                              }
                            }
                            if (~(320 + -l.field_f.b(of.field_D)) < ~param1) {
                              break L13;
                            } else {
                              if (param1 < 320) {
                                if (!param5) {
                                  L17: {
                                    if (null == vf.field_L) {
                                      break L17;
                                    } else {
                                      nj.field_o.b((p) (Object) vf.field_L);
                                      vf.field_L.c();
                                      vf.field_L = null;
                                      if (var8 == 0) {
                                        break L13;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  vf.field_L = fe.field_c;
                                  nj.field_o.a((p) (Object) vf.field_L);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (vf.field_L != null) {
                            vf.field_L.d(ai.field_c / 2);
                            if (var8 == 0) {
                              break L2;
                            } else {
                              break L8;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      L18: {
                        L19: {
                          stackOut_80_0 = this;
                          stackIn_88_0 = stackOut_80_0;
                          stackIn_81_0 = stackOut_80_0;
                          if (param1 < 320) {
                            break L19;
                          } else {
                            stackOut_81_0 = this;
                            stackIn_83_0 = stackOut_81_0;
                            stackOut_83_0 = this;
                            stackIn_88_0 = stackOut_83_0;
                            stackIn_84_0 = stackOut_83_0;
                            if (param1 >= 420) {
                              break L19;
                            } else {
                              stackOut_84_0 = this;
                              stackIn_86_0 = stackOut_84_0;
                              stackOut_86_0 = this;
                              stackOut_86_1 = 1;
                              stackIn_89_0 = stackOut_86_0;
                              stackIn_89_1 = stackOut_86_1;
                              break L18;
                            }
                          }
                        }
                        stackOut_88_0 = this;
                        stackOut_88_1 = 0;
                        stackIn_89_0 = stackOut_88_0;
                        stackIn_89_1 = stackOut_88_1;
                        break L18;
                      }
                      L20: {
                        ((ij) this).field_o = stackIn_89_1 != 0;
                        if (!param5) {
                          break L20;
                        } else {
                          ((ij) this).field_o = true;
                          break L20;
                        }
                      }
                      L21: {
                        L22: {
                          if (((ij) this).field_o) {
                            break L22;
                          } else {
                            if (~param1 > ~(320 - l.field_f.b(vl.field_h))) {
                              break L21;
                            } else {
                              if (param1 < 320) {
                                if (param5) {
                                  break L21;
                                } else {
                                  L23: {
                                    if (fe.field_e) {
                                      stackOut_107_0 = 0;
                                      stackIn_108_0 = stackOut_107_0;
                                      break L23;
                                    } else {
                                      stackOut_105_0 = 1;
                                      stackIn_108_0 = stackOut_105_0;
                                      break L23;
                                    }
                                  }
                                  fe.field_e = stackIn_108_0 != 0;
                                  if (var8 == 0) {
                                    break L21;
                                  } else {
                                    break L22;
                                  }
                                }
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        L24: {
                          pk.field_h = param1 - 320;
                          fe.field_e = true;
                          if (pk.field_h >= 0) {
                            break L24;
                          } else {
                            pk.field_h = 0;
                            break L24;
                          }
                        }
                        if (pk.field_h > 100) {
                          pk.field_h = 100;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      if (!fe.field_e) {
                        break L2;
                      } else {
                        if (param5) {
                          break L2;
                        } else {
                          ll.field_c.a(sb.field_e[0], 50, pk.field_h * 2);
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L25: {
                      L26: {
                        stackOut_125_0 = this;
                        stackIn_133_0 = stackOut_125_0;
                        stackIn_126_0 = stackOut_125_0;
                        if (param1 < 320) {
                          break L26;
                        } else {
                          stackOut_126_0 = this;
                          stackIn_128_0 = stackOut_126_0;
                          stackOut_128_0 = this;
                          stackIn_133_0 = stackOut_128_0;
                          stackIn_129_0 = stackOut_128_0;
                          if (param1 >= 420) {
                            break L26;
                          } else {
                            stackOut_129_0 = this;
                            stackIn_131_0 = stackOut_129_0;
                            stackOut_131_0 = this;
                            stackOut_131_1 = 1;
                            stackIn_134_0 = stackOut_131_0;
                            stackIn_134_1 = stackOut_131_1;
                            break L25;
                          }
                        }
                      }
                      stackOut_133_0 = this;
                      stackOut_133_1 = 0;
                      stackIn_134_0 = stackOut_133_0;
                      stackIn_134_1 = stackOut_133_1;
                      break L25;
                    }
                    L27: {
                      ((ij) this).field_o = stackIn_134_1 != 0;
                      if (!param5) {
                        break L27;
                      } else {
                        ((ij) this).field_o = true;
                        break L27;
                      }
                    }
                    if (!((ij) this).field_o) {
                      break L2;
                    } else {
                      L28: {
                        var7_int = -320 + param1;
                        if (0 > var7_int) {
                          var7_int = 0;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      L29: {
                        if (100 >= var7_int) {
                          break L29;
                        } else {
                          var7_int = 100;
                          break L29;
                        }
                      }
                      qi.field_a = 1 + (-2 + of.field_A * var7_int) / 100;
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                super.a(param0, param1, (byte) 8, param3, param4, param5);
                if (var8 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              L30: {
                if (ni.field_e >= 224) {
                  break L30;
                } else {
                  si.field_X = 0;
                  if (var8 == 0) {
                    break L2;
                  } else {
                    break L30;
                  }
                }
              }
              L31: {
                if (416 < ni.field_e) {
                  break L31;
                } else {
                  si.field_X = 1;
                  if (var8 == 0) {
                    break L2;
                  } else {
                    break L31;
                  }
                }
              }
              si.field_X = 2;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var7, "ij.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
                          if (var4 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                if (param0 != 3) {
                  break L3;
                } else {
                  pk.field_h = pk.field_h - 12;
                  if (pk.field_h >= 10) {
                    break L1;
                  } else {
                    pk.field_h = 10;
                    fe.field_e = false;
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              if (4 == param0) {
                L4: {
                  ai.field_c = ai.field_c - 12;
                  if (ai.field_c >= 10) {
                    break L4;
                  } else {
                    ai.field_c = 10;
                    if (vf.field_L == null) {
                      break L4;
                    } else {
                      nj.field_o.b((p) (Object) vf.field_L);
                      vf.field_L.c();
                      vf.field_L = null;
                      break L4;
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
            }
            L5: {
              if (param1 == -1) {
                break L5;
              } else {
                ((ij) this).field_s = -58;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "ij.B(" + param0 + ',' + param1 + ')');
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
        int stackOut_149_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_219_0 = 0;
        int stackOut_217_0 = 0;
        Object stackOut_339_0 = null;
        Object stackOut_340_0 = null;
        Object stackOut_342_0 = null;
        Object stackOut_343_0 = null;
        Object stackOut_345_0 = null;
        int stackOut_345_1 = 0;
        Object stackOut_347_0 = null;
        int stackOut_347_1 = 0;
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
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      L8: {
                        if (param1 != 8) {
                          break L8;
                        } else {
                          if (oc.field_d) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (param1 == 9) {
                        L9: {
                          L10: {
                            n.field_L = 255;
                            if (!v.field_e) {
                              break L10;
                            } else {
                              ((ij) this).field_l = -1;
                              if (var4 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          ((ij) this).field_l = 7;
                          break L9;
                        }
                        tl.field_c = 0;
                        if (!oa.field_D) {
                          tl.field_c = 8;
                          oa.field_D = true;
                          ta.a(v.field_e, 713);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L7;
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    L11: {
                      tl.field_c = 2;
                      oc.field_d = false;
                      n.field_L = 255;
                      if (v.field_e) {
                        break L11;
                      } else {
                        ((ij) this).field_l = 9;
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L11;
                        }
                      }
                    }
                    ((ij) this).field_l = -1;
                    if (var4 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L12: {
                  if (2 != tl.field_c) {
                    break L12;
                  } else {
                    L13: {
                      if (param1 != 8) {
                        break L13;
                      } else {
                        if (!ah.a(-1)) {
                          break L13;
                        } else {
                          am.a(2, 2, param0 + -544);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    L14: {
                      if (param1 == 8) {
                        break L14;
                      } else {
                        if (param1 == 9) {
                          L15: {
                            L16: {
                              n.field_L = 255;
                              if (v.field_e) {
                                break L16;
                              } else {
                                ((ij) this).field_l = 6;
                                if (var4 == 0) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            ((ij) this).field_l = -1;
                            break L15;
                          }
                          tl.field_c = 0;
                          if (!oa.field_D) {
                            oa.field_D = true;
                            tl.field_c = 8;
                            ta.a(v.field_e, 713);
                            if (var4 == 0) {
                              break L3;
                            } else {
                              break L14;
                            }
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    si.field_X = si.field_X + 1;
                    if (3 > si.field_X) {
                      break L3;
                    } else {
                      si.field_X = si.field_X - 3;
                      if (var4 == 0) {
                        break L3;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                L17: {
                  if (tl.field_c == 1) {
                    break L17;
                  } else {
                    L18: {
                      if (4 != tl.field_c) {
                        break L18;
                      } else {
                        if (param1 == 8) {
                          L19: {
                            L20: {
                              if (v.field_e) {
                                break L20;
                              } else {
                                ((ij) this).field_l = 9;
                                if (var4 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            ((ij) this).field_l = -1;
                            break L19;
                          }
                          L21: {
                            tl.field_c = 0;
                            n.field_L = 255;
                            gh.field_d = null;
                            if (ah.a(-1)) {
                              break L21;
                            } else {
                              L22: {
                                if (0 < ue.field_a) {
                                  tl.field_c = 2;
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              L23: {
                                if (!oc.field_d) {
                                  break L23;
                                } else {
                                  tl.field_c = 3;
                                  break L23;
                                }
                              }
                              if (tl.field_c != 0) {
                                L24: {
                                  if (mk.field_k <= 0) {
                                    stackOut_149_0 = 0;
                                    stackIn_150_0 = stackOut_149_0;
                                    break L24;
                                  } else {
                                    stackOut_147_0 = 1;
                                    stackIn_150_0 = stackOut_147_0;
                                    break L24;
                                  }
                                }
                                oa.field_D = stackIn_150_0 != 0;
                                if (var4 == 0) {
                                  break L3;
                                } else {
                                  break L21;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          oc.field_d = false;
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L18;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (tl.field_c == 0) {
                      L25: {
                        var3_int = ((ij) this).field_j;
                        if (s.field_i) {
                          var3_int -= 3;
                          if (mk.field_k <= 0) {
                            var3_int--;
                            break L25;
                          } else {
                            break L25;
                          }
                        } else {
                          break L25;
                        }
                      }
                      if (var3_int > param1) {
                        L26: {
                          L27: {
                            L28: {
                              if (param1 != 8) {
                                break L28;
                              } else {
                                if (fb.field_n == 0) {
                                  break L27;
                                } else {
                                  if (gh.field_c == 1) {
                                    break L27;
                                  } else {
                                    break L28;
                                  }
                                }
                              }
                            }
                            L29: {
                              if (param1 != 0) {
                                break L29;
                              } else {
                                if (a.field_h[0] == null) {
                                  break L29;
                                } else {
                                  if (a.field_h[0].field_m != -1) {
                                    break L29;
                                  } else {
                                    na.field_j = null;
                                    if (var4 == 0) {
                                      break L26;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                              }
                            }
                            L30: {
                              if (param1 != 0) {
                                break L30;
                              } else {
                                L31: {
                                  if (null == a.field_h[0]) {
                                    break L31;
                                  } else {
                                    if (a.field_h[0].field_m == -1) {
                                      break L30;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                                if (of.field_A <= 1) {
                                  break L26;
                                } else {
                                  L32: {
                                    ea.e((byte) 97);
                                    vc.field_h.m((byte) 127);
                                    na.field_j = null;
                                    stellarshard.field_K = false;
                                    bi.field_u = null;
                                    if (qi.field_a <= 0) {
                                      break L32;
                                    } else {
                                      qi.field_a = qi.field_a - 1;
                                      break L32;
                                    }
                                  }
                                  nf.field_r = false;
                                  s.field_i = true;
                                  tl.field_a = 0;
                                  if (qi.field_a != 0) {
                                    break L26;
                                  } else {
                                    nf.field_r = true;
                                    stellarshard.field_K = true;
                                    e.field_c = false;
                                    if (var4 == 0) {
                                      break L26;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                              }
                            }
                            L33: {
                              if (1 == param1) {
                                break L33;
                              } else {
                                L34: {
                                  if (param1 != 3) {
                                    break L34;
                                  } else {
                                    L35: {
                                      if (fe.field_e) {
                                        stackOut_219_0 = 0;
                                        stackIn_220_0 = stackOut_219_0;
                                        break L35;
                                      } else {
                                        stackOut_217_0 = 1;
                                        stackIn_220_0 = stackOut_217_0;
                                        break L35;
                                      }
                                    }
                                    fe.field_e = stackIn_220_0 != 0;
                                    if (var4 == 0) {
                                      break L26;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                L36: {
                                  if (4 != param1) {
                                    break L36;
                                  } else {
                                    L37: {
                                      if (null != vf.field_L) {
                                        break L37;
                                      } else {
                                        vf.field_L = fe.field_c;
                                        nj.field_o.a((p) (Object) vf.field_L);
                                        if (var4 == 0) {
                                          break L26;
                                        } else {
                                          break L37;
                                        }
                                      }
                                    }
                                    nj.field_o.b((p) (Object) vf.field_L);
                                    vf.field_L.c();
                                    vf.field_L = null;
                                    if (var4 == 0) {
                                      break L26;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                                L38: {
                                  if (param1 != 2) {
                                    break L38;
                                  } else {
                                    L39: {
                                      if (1 != tl.field_c) {
                                        n.field_L = 255;
                                        break L39;
                                      } else {
                                        break L39;
                                      }
                                    }
                                    L40: {
                                      tl.field_c = 1;
                                      if (v.field_e) {
                                        break L40;
                                      } else {
                                        ((ij) this).field_l = 9;
                                        if (var4 == 0) {
                                          break L26;
                                        } else {
                                          break L40;
                                        }
                                      }
                                    }
                                    ((ij) this).field_l = -1;
                                    if (var4 == 0) {
                                      break L26;
                                    } else {
                                      break L38;
                                    }
                                  }
                                }
                                L41: {
                                  if (param1 != 7) {
                                    break L41;
                                  } else {
                                    L42: {
                                      if (s.field_i) {
                                        break L42;
                                      } else {
                                        L43: {
                                          if (tl.field_c != 3) {
                                            n.field_L = 255;
                                            break L43;
                                          } else {
                                            break L43;
                                          }
                                        }
                                        L44: {
                                          L45: {
                                            if (!v.field_e) {
                                              break L45;
                                            } else {
                                              ((ij) this).field_l = -1;
                                              if (var4 == 0) {
                                                break L44;
                                              } else {
                                                break L45;
                                              }
                                            }
                                          }
                                          ((ij) this).field_l = 9;
                                          break L44;
                                        }
                                        tl.field_c = 3;
                                        break L42;
                                      }
                                    }
                                    oc.field_d = false;
                                    if (var4 == 0) {
                                      break L26;
                                    } else {
                                      break L41;
                                    }
                                  }
                                }
                                L46: {
                                  if (param1 == 6) {
                                    break L46;
                                  } else {
                                    if (param1 != 5) {
                                      break L26;
                                    } else {
                                      L47: {
                                        if (null != s.field_e) {
                                          break L47;
                                        } else {
                                          vc.field_h.l((byte) -119);
                                          if (var4 == 0) {
                                            break L26;
                                          } else {
                                            break L47;
                                          }
                                        }
                                      }
                                      nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
                                      s.field_e.a(ic.field_d, -105);
                                      s.field_e = null;
                                      qd.field_j.requestFocus();
                                      if (var4 == 0) {
                                        break L26;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                }
                                if (!s.field_i) {
                                  L48: {
                                    if (ah.a(-1)) {
                                      break L48;
                                    } else {
                                      gh.field_d = bk.a(3, 10, 1, param0 ^ 441, 5);
                                      break L48;
                                    }
                                  }
                                  L49: {
                                    if (2 != tl.field_c) {
                                      n.field_L = 255;
                                      break L49;
                                    } else {
                                      break L49;
                                    }
                                  }
                                  L50: {
                                    tl.field_c = 2;
                                    if (!v.field_e) {
                                      break L50;
                                    } else {
                                      ((ij) this).field_l = -1;
                                      if (var4 == 0) {
                                        break L26;
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                  ((ij) this).field_l = 9;
                                  if (var4 == 0) {
                                    break L26;
                                  } else {
                                    break L33;
                                  }
                                } else {
                                  break L26;
                                }
                              }
                            }
                            L51: {
                              L52: {
                                if (a.field_h[0] == null) {
                                  break L52;
                                } else {
                                  if (a.field_h[0].field_m == -1) {
                                    break L51;
                                  } else {
                                    break L52;
                                  }
                                }
                              }
                              if (of.field_A > 1) {
                                break L26;
                              } else {
                                L53: {
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
                                    break L53;
                                  } else {
                                    break L53;
                                  }
                                }
                                na.field_j = null;
                                na.field_j = null;
                                if (var4 == 0) {
                                  break L26;
                                } else {
                                  break L51;
                                }
                              }
                            }
                            nc.field_H = 0;
                            a.field_h[0].field_g = -150;
                            na.field_j = null;
                            if (var4 == 0) {
                              break L26;
                            } else {
                              break L27;
                            }
                          }
                          L54: {
                            if (s.field_e != null) {
                              nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
                              s.field_e.a(ic.field_d, -104);
                              s.field_e = null;
                              qd.field_j.requestFocus();
                              break L54;
                            } else {
                              break L54;
                            }
                          }
                          df.a(false, hf.a((byte) -93));
                          break L26;
                        }
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L17;
                        }
                      } else {
                        return;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                if (param1 != 9) {
                  break L3;
                } else {
                  L55: {
                    n.field_L = 255;
                    tl.field_c = 0;
                    if (!v.field_e) {
                      break L55;
                    } else {
                      ((ij) this).field_l = -1;
                      if (var4 == 0) {
                        break L3;
                      } else {
                        break L55;
                      }
                    }
                  }
                  L56: {
                    L57: {
                      stackOut_339_0 = this;
                      stackIn_347_0 = stackOut_339_0;
                      stackIn_340_0 = stackOut_339_0;
                      if (1 < of.field_A) {
                        break L57;
                      } else {
                        stackOut_340_0 = this;
                        stackIn_342_0 = stackOut_340_0;
                        stackOut_342_0 = this;
                        stackIn_347_0 = stackOut_342_0;
                        stackIn_343_0 = stackOut_342_0;
                        if (s.field_i) {
                          break L57;
                        } else {
                          stackOut_343_0 = this;
                          stackIn_345_0 = stackOut_343_0;
                          stackOut_345_0 = this;
                          stackOut_345_1 = 3;
                          stackIn_348_0 = stackOut_345_0;
                          stackIn_348_1 = stackOut_345_1;
                          break L56;
                        }
                      }
                    }
                    stackOut_347_0 = this;
                    stackOut_347_1 = 2;
                    stackIn_348_0 = stackOut_347_0;
                    stackIn_348_1 = stackOut_347_1;
                    break L56;
                  }
                  ((ij) this).field_l = stackIn_348_1;
                  break L3;
                }
              } else {
                L58: {
                  if (param1 != 0) {
                    break L58;
                  } else {
                    L59: {
                      L60: {
                        if (!v.field_e) {
                          break L60;
                        } else {
                          ((ij) this).field_l = -1;
                          if (var4 == 0) {
                            break L59;
                          } else {
                            break L60;
                          }
                        }
                      }
                      L61: {
                        stackOut_21_0 = this;
                        stackIn_26_0 = stackOut_21_0;
                        stackIn_22_0 = stackOut_21_0;
                        if (of.field_A <= 1) {
                          stackOut_26_0 = this;
                          stackOut_26_1 = 1;
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          break L61;
                        } else {
                          stackOut_22_0 = this;
                          stackIn_24_0 = stackOut_22_0;
                          stackOut_24_0 = this;
                          stackOut_24_1 = 0;
                          stackIn_27_0 = stackOut_24_0;
                          stackIn_27_1 = stackOut_24_1;
                          break L61;
                        }
                      }
                      ((ij) this).field_l = stackIn_27_1;
                      break L59;
                    }
                    n.field_L = 255;
                    tl.field_c = 0;
                    if (var4 == 0) {
                      break L3;
                    } else {
                      break L58;
                    }
                  }
                }
                if (param1 == 1) {
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "ij.F(" + param0 + ',' + param1 + ')');
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
          throw ma.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
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
                    L2: {
                      if (param2 == 1) {
                        break L2;
                      } else {
                        param3 = param3 - ((ij) this).field_a;
                        if (var6 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    param3 = param3 + ((ij) this).field_a * 3;
                    if (0 >= mk.field_k) {
                      break L1;
                    } else {
                      param3 = param3 + ((ij) this).field_a;
                      break L1;
                    }
                  }
                }
              }
              L3: {
                if (tl.field_c != 0) {
                  break L3;
                } else {
                  L4: {
                    var5_int = 5883647;
                    if (param2 != 0) {
                      break L4;
                    } else {
                      L5: {
                        if (a.field_h[0] == null) {
                          break L5;
                        } else {
                          if (a.field_h[0].field_m != -1) {
                            break L5;
                          } else {
                            ic.a(dj.field_c, param2, -1, false, 320, var5_int, param3);
                            if (var6 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (1 < of.field_A) {
                        ic.a(kf.field_c + qi.field_a, param2, -1, false, 320, var5_int, param3);
                        if (var6 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  L6: {
                    if (1 != param2) {
                      break L6;
                    } else {
                      L7: {
                        if (null == a.field_h[0]) {
                          break L7;
                        } else {
                          if (-1 != a.field_h[0].field_m) {
                            break L7;
                          } else {
                            ic.a(kk.field_n, param2, -1, false, 320, var5_int, param3);
                            if (var6 == 0) {
                              break L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      L8: {
                        if (of.field_A <= 1) {
                          break L8;
                        } else {
                          ic.a(qf.field_f, param2, -1, false, 320, var5_int, param3);
                          fh.field_k[0].e(316, param3 - -3);
                          fh.field_k[2].e(418, 3 + param3);
                          fh.field_k[1].e(-3 + ((100 * qi.field_a - 100) / (-1 + of.field_A) + 320), 3 + param3);
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      ic.a(rk.field_b, param2, -1, false, 320, var5_int, param3);
                      if (var6 == 0) {
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L9: {
                    if (3 != param2) {
                      break L9;
                    } else {
                      L10: {
                        if (fe.field_e) {
                          break L10;
                        } else {
                          ic.a(ch.field_d, param2, -1, false, 320, var5_int, param3);
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ic.a(eh.field_b, param2, -1, false, 320, var5_int, param3);
                      fh.field_k[0].e(316, 2 + param3);
                      fh.field_k[2].e(418, 2 + param3);
                      fh.field_k[1].e(320 - -pk.field_h + -3, 2 + param3);
                      if (var6 == 0) {
                        break L3;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    if (param2 == 4) {
                      break L11;
                    } else {
                      L12: {
                        if (param2 == 5) {
                          break L12;
                        } else {
                          L13: {
                            if (param2 != 2) {
                              break L13;
                            } else {
                              ic.a(ig.field_C, param2, -1, false, 320, var5_int, param3);
                              if (var6 == 0) {
                                break L3;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            if (param2 == 6) {
                              break L14;
                            } else {
                              L15: {
                                if (param2 == 7) {
                                  break L15;
                                } else {
                                  if (param2 == 8) {
                                    if (s.field_i) {
                                      break L3;
                                    } else {
                                      ic.a(il.field_x, param2, -1, false, 320, var5_int, param3);
                                      if (var6 == 0) {
                                        break L3;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              if (!s.field_i) {
                                ic.a(nl.field_b, param2, -1, false, 320, var5_int, param3);
                                if (var6 == 0) {
                                  break L3;
                                } else {
                                  break L14;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          if (s.field_i) {
                            break L3;
                          } else {
                            ic.a(ta.field_r, param2, -1, false, 320, var5_int, param3);
                            if (var6 == 0) {
                              break L3;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      L16: {
                        if (!s.field_i) {
                          break L16;
                        } else {
                          if (mk.field_k > 0) {
                            break L16;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L17: {
                        if (s.field_e != null) {
                          break L17;
                        } else {
                          L18: {
                            if (!lh.a(ic.field_d, (byte) -119)) {
                              L19: {
                                if (param0) {
                                  stackOut_119_0 = 16777215;
                                  stackIn_120_0 = stackOut_119_0;
                                  break L19;
                                } else {
                                  stackOut_117_0 = 8421504;
                                  stackIn_120_0 = stackOut_117_0;
                                  break L19;
                                }
                              }
                              var5_int = stackIn_120_0;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          ic.a(ch.field_a, param2, -1, false, 320, var5_int, param3);
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L17;
                          }
                        }
                      }
                      ic.a(ch.field_a, param2, -1, false, 320, var5_int, param3);
                      if (var6 == 0) {
                        break L3;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L20: {
                    if (vf.field_L == null) {
                      break L20;
                    } else {
                      ic.a(fe.field_f, param2, -1, false, 320, var5_int, param3);
                      fh.field_k[0].e(316, 2 + param3);
                      fh.field_k[2].e(418, param3 + 2);
                      fh.field_k[1].e(ai.field_c + 317, 2 + param3);
                      if (var6 == 0) {
                        break L3;
                      } else {
                        break L20;
                      }
                    }
                  }
                  ic.a(rc.field_f, param2, -1, false, 320, var5_int, param3);
                  break L3;
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
          throw ma.a((Throwable) (Object) var5, "ij.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
              if (param0) {
                break L1;
              } else {
                ((ij) this).field_p = -111;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 != 1) {
                  break L3;
                } else {
                  if (s.field_i) {
                    break L3;
                  } else {
                    if (of.field_A <= 1) {
                      break L3;
                    } else {
                      if (tl.field_c != 0) {
                        break L3;
                      } else {
                        qi.field_a = qi.field_a + 1;
                        if (qi.field_a > of.field_A) {
                          qi.field_a = of.field_A;
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
                  }
                }
              }
              L4: {
                if (param1 == 3) {
                  break L4;
                } else {
                  if (param1 != 4) {
                    break L2;
                  } else {
                    L5: {
                      ai.field_c = ai.field_c + 12;
                      if (ai.field_c > 100) {
                        ai.field_c = 100;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (null != vf.field_L) {
                        break L6;
                      } else {
                        vf.field_L = fe.field_c;
                        nj.field_o.a((p) (Object) vf.field_L);
                        break L6;
                      }
                    }
                    if (vf.field_L != null) {
                      vf.field_L.d(ai.field_c / 2);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              }
              pk.field_h = pk.field_h + 12;
              fe.field_e = true;
              if (pk.field_h <= 100) {
                break L2;
              } else {
                pk.field_h = 100;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "ij.A(" + param0 + ',' + param1 + ')');
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
                L4: {
                  if (gi.field_f != 96) {
                    break L4;
                  } else {
                    if (param0 == 8) {
                      break L3;
                    } else {
                      if (tl.field_c != 2) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (97 != gi.field_f) {
                    break L5;
                  } else {
                    L6: {
                      if (param0 == 8) {
                        break L6;
                      } else {
                        if (tl.field_c == 2) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      si.field_X = si.field_X + 1;
                      if (si.field_X >= 3) {
                        si.field_X = si.field_X - 3;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    this.a(true, param0);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                L8: {
                  if (gi.field_f == 84) {
                    break L8;
                  } else {
                    if (83 == gi.field_f) {
                      break L8;
                    } else {
                      break L2;
                    }
                  }
                }
                ((ij) this).a(param1 ^ -427, param0);
                if (var4 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              L9: {
                si.field_X = si.field_X - 1;
                if (si.field_X >= 0) {
                  break L9;
                } else {
                  si.field_X = si.field_X + 3;
                  break L9;
                }
              }
              ((ij) this).b(param0, -1);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "ij.D(" + param0 + ',' + param1 + ')');
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
                        L2: {
                          if (param6 == 5883647) {
                            break L2;
                          } else {
                            param6 = 16748431;
                            if (stellarshard.field_B == 0) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                        param6 = 16777215;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L3: {
              if (!param2) {
                break L3;
              } else {
                param6 = 16777215;
                break L3;
              }
            }
            L4: {
              l.field_f.b(param5, param0 + -2, param1 + param3, param6, -1);
              if (param6 != 16777215) {
                break L4;
              } else {
                if (0 == fb.field_n) {
                  break L4;
                } else {
                  if (param4) {
                    stackOut_29_0 = 1;
                    stackIn_30_0 = stackOut_29_0;
                    return stackIn_30_0 != 0;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L5: {
              if (param6 != 16777215) {
                break L5;
              } else {
                if (!si.field_jb[84]) {
                  break L5;
                } else {
                  if (!param2) {
                    break L5;
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
          L6: {
            var8 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var8;
            stackOut_42_1 = new StringBuilder().append("ij.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
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
              break L6;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param6 + ')');
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
            stackOut_5_1 = new StringBuilder().append("ij.H(").append(param0).append(',');
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
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
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
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
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        ub stackIn_72_0 = null;
        ub stackIn_73_0 = null;
        ub stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        ub stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        ub stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        ub stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        ub stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        ub stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        ub stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        int stackIn_80_3 = 0;
        Object stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        Object stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        Object stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        int stackIn_83_3 = 0;
        ub stackIn_88_0 = null;
        ub stackIn_89_0 = null;
        ub stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        ub stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        ub stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        ub stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        ub stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        ub stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        ub stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        int stackIn_96_3 = 0;
        int stackIn_96_4 = 0;
        Object stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        Object stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        Object stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        ub stackIn_102_0 = null;
        ub stackIn_103_0 = null;
        ub stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        ub stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        ub stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        ub stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_107_2 = 0;
        ub stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        int stackIn_108_2 = 0;
        int stackIn_108_3 = 0;
        ub stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        int stackIn_109_2 = 0;
        int stackIn_109_3 = 0;
        ub stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        int stackIn_110_2 = 0;
        int stackIn_110_3 = 0;
        int stackIn_110_4 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_137_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_142_0 = 0;
        ub stackIn_182_0 = null;
        String stackIn_182_1 = null;
        int stackIn_182_2 = 0;
        int stackIn_182_3 = 0;
        ub stackIn_183_0 = null;
        String stackIn_183_1 = null;
        int stackIn_183_2 = 0;
        int stackIn_183_3 = 0;
        ub stackIn_184_0 = null;
        String stackIn_184_1 = null;
        int stackIn_184_2 = 0;
        int stackIn_184_3 = 0;
        ub stackIn_185_0 = null;
        String stackIn_185_1 = null;
        int stackIn_185_2 = 0;
        int stackIn_185_3 = 0;
        int stackIn_185_4 = 0;
        int stackIn_209_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_212_1 = 0;
        int stackIn_292_0 = 0;
        int stackIn_292_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        ub stackOut_71_0 = null;
        ub stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        ub stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        ub stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        ub stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        ub stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        ub stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        ub stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
        int stackOut_79_3 = 0;
        ub stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        int stackOut_78_3 = 0;
        Object stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        int stackOut_82_3 = 0;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        int stackOut_81_3 = 0;
        ub stackOut_87_0 = null;
        ub stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        ub stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        ub stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        ub stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        ub stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        ub stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        ub stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        int stackOut_95_3 = 0;
        int stackOut_95_4 = 0;
        ub stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        int stackOut_94_3 = 0;
        int stackOut_94_4 = 0;
        Object stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        Object stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        int stackOut_98_3 = 0;
        Object stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        int stackOut_97_3 = 0;
        ub stackOut_101_0 = null;
        ub stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        ub stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        ub stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        ub stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        int stackOut_106_2 = 0;
        ub stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        int stackOut_105_2 = 0;
        ub stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        int stackOut_107_2 = 0;
        int stackOut_107_3 = 0;
        ub stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        int stackOut_109_3 = 0;
        int stackOut_109_4 = 0;
        ub stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        int stackOut_108_2 = 0;
        int stackOut_108_3 = 0;
        int stackOut_108_4 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_136_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_141_0 = 0;
        ub stackOut_181_0 = null;
        String stackOut_181_1 = null;
        int stackOut_181_2 = 0;
        int stackOut_181_3 = 0;
        ub stackOut_184_0 = null;
        String stackOut_184_1 = null;
        int stackOut_184_2 = 0;
        int stackOut_184_3 = 0;
        int stackOut_184_4 = 0;
        ub stackOut_182_0 = null;
        String stackOut_182_1 = null;
        int stackOut_182_2 = 0;
        int stackOut_182_3 = 0;
        ub stackOut_183_0 = null;
        String stackOut_183_1 = null;
        int stackOut_183_2 = 0;
        int stackOut_183_3 = 0;
        int stackOut_183_4 = 0;
        int stackOut_208_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_211_1 = 0;
        int stackOut_291_0 = 0;
        int stackOut_291_1 = 0;
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
          L2: {
            if (tl.field_c != 6) {
              break L2;
            } else {
              rj.c((byte) -94);
              tl.field_c = 7;
              if (var14 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (tl.field_c != 7) {
            break L1;
          } else {
            L3: {
              if (!ah.a(-1)) {
                break L3;
              } else {
                n.field_L = 255;
                tl.field_c = fg.field_O;
                if (var14 == 0) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            be.field_g = ab.a(-5094, 4);
            tl.field_c = ea.field_p;
            if (tl.field_c != 4) {
              break L1;
            } else {
              L4: {
                qf.a((byte) -125);
                wh.a(-94);
                vc.field_h.c(param0 + 42, te.field_c);
                oc.field_d = false;
                if (tl.field_a <= 0) {
                  break L4;
                } else {
                  oc.field_d = true;
                  break L4;
                }
              }
              cl.field_a = cl.field_a + te.field_c;
              te.field_c = 0;
              break L1;
            }
          }
        }
        L5: {
          L6: {
            L7: {
              if (tl.field_c == 5) {
                break L7;
              } else {
                if (tl.field_c == 4) {
                  if (((ij) this).field_t >= 0) {
                    var8 = ((ij) this).field_t;
                    var9 = 0;
                    L8: while (true) {
                      L9: {
                        if (var9 > 50) {
                          break L9;
                        } else {
                          var2_double = 3.141592653589793 * (double)var9 / 25.0;
                          stackOut_26_0 = -26;
                          stackOut_26_1 = ~var9;
                          stackIn_112_0 = stackOut_26_0;
                          stackIn_112_1 = stackOut_26_1;
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          if (var14 != 0) {
                            break L5;
                          } else {
                            L10: {
                              if (stackIn_27_0 != stackIn_27_1) {
                                break L10;
                              } else {
                                L11: {
                                  var10_ref_pa = new pa(rh.field_b, false, false, false, false);
                                  ((ij) this).field_q = ((ij) this).field_q + 1;
                                  if (((ij) this).field_q > 256) {
                                    ((ij) this).field_q = ((ij) this).field_q - 256;
                                    break L11;
                                  } else {
                                    break L11;
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
                                break L10;
                              }
                            }
                            L12: {
                              var4_double = (double)(var9 + 1) * 3.141592653589793 / 25.0;
                              var6 = (int)(128.0 * Math.cos(var2_double));
                              var7 = (int)(Math.sin(var2_double) * -64.0);
                              if (var8 > 0) {
                                L13: {
                                  L14: {
                                    if (var8 <= var9) {
                                      break L14;
                                    } else {
                                      if (mg.field_t > var9) {
                                        break L14;
                                      } else {
                                        ti.a(var6 + 320 << 4, 240 + var7 << 4, 256, 255 * var9 / var8, ei.field_I);
                                        if (var14 == 0) {
                                          break L13;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                  L15: {
                                    if (var8 != var9) {
                                      break L15;
                                    } else {
                                      ti.a(320 + var6 << 4, 240 + var7 << 4, 256, var9 * 255 / var8, ei.field_B);
                                      if (var14 == 0) {
                                        break L13;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  ti.a(var6 + 320 << 4, var7 + 240 << 4, 128, 64, ei.field_I);
                                  break L13;
                                }
                                L16: {
                                  var6 = var6 * 9 / 10;
                                  var7 = 9 * var7 / 10;
                                  if (var8 <= var9) {
                                    break L16;
                                  } else {
                                    if (mg.field_t > var9) {
                                      break L16;
                                    } else {
                                      ti.a(var6 - -320 << 4, 240 + var7 << 4, 192, var9 * 255 / var8, ei.field_I);
                                      break L16;
                                    }
                                  }
                                }
                                L17: {
                                  if (var9 == var8) {
                                    ti.a(320 + var6 << 4, var7 + 240 << 4, 192, 255 * var9 / var8, ei.field_B);
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                L18: {
                                  var7 = 9 * var7 / 10;
                                  var6 = 9 * var6 / 10;
                                  if (var8 <= var9) {
                                    break L18;
                                  } else {
                                    if (~var9 > ~mg.field_t) {
                                      break L18;
                                    } else {
                                      ti.a(320 + var6 << 4, 240 + var7 << 4, 128, var9 * 255 / var8, ei.field_I);
                                      break L18;
                                    }
                                  }
                                }
                                L19: {
                                  if (~var9 != ~var8) {
                                    break L19;
                                  } else {
                                    ti.a(320 + var6 << 4, var7 + 240 << 4, 128, 255 * var9 / var8, ei.field_B);
                                    break L19;
                                  }
                                }
                                L20: {
                                  var6 = 9 * var6 / 10;
                                  var7 = 9 * var7 / 10;
                                  if (var8 <= var9) {
                                    break L20;
                                  } else {
                                    if (~mg.field_t < ~var9) {
                                      break L20;
                                    } else {
                                      ti.a(var6 - -320 << 4, 240 + var7 << 4, 64, var9 * 255 / var8, ei.field_I);
                                      break L20;
                                    }
                                  }
                                }
                                if (~var8 == ~var9) {
                                  ti.a(var6 + 320 << 4, 240 + var7 << 4, 64, 255 * var9 / var8, ei.field_B);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              } else {
                                break L12;
                              }
                            }
                            var9++;
                            if (var14 == 0) {
                              continue L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      L21: {
                        L22: {
                          var2_int = 5883647;
                          if (0 < tl.field_a) {
                            break L22;
                          } else {
                            ic.a(dj.field_c, 8, -1, false, 320, var2_int, 415);
                            if (var14 == 0) {
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        ic.a(dj.field_c, 8, -1, false, 320, var2_int, 415);
                        break L21;
                      }
                      var3_ref_String = sg.field_d + qi.field_a + wc.field_l + ue.field_a;
                      int discarded$9 = l.field_f.a(var3_ref_String, -1, 260, 640, 180, 0, -1, 1, 1, l.field_f.field_N);
                      int discarded$10 = l.field_f.a(var3_ref_String, 1, 260, 640, 180, 0, -1, 1, 1, l.field_f.field_N);
                      int discarded$11 = l.field_f.a(var3_ref_String, 0, 259, 640, 180, 0, -1, 1, 1, l.field_f.field_N);
                      int discarded$12 = l.field_f.a(var3_ref_String, 0, 261, 640, 180, 0, -1, 1, 1, l.field_f.field_N);
                      int discarded$13 = l.field_f.a(var3_ref_String, 0, 260, 640, 180, 10742263, -1, 1, 1, l.field_f.field_N);
                      if (var14 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  break L6;
                }
              }
            }
            L23: {
              var2 = qj.field_a;
              var3 = var2.field_N + 200;
              var4 = 4 + (var2.field_x + var2.field_r);
              ti.b(112, 190, 416, 20 + 5 * var4 - -60, 0, 192);
              ed.a(-6313, 103, 183, fg.field_P, 434, 80 + var4 * 5 + 14);
              var2.c(qj.field_b, 320, var3, 10742263, -1);
              stackOut_71_0 = (ub) var2;
              stackIn_73_0 = stackOut_71_0;
              stackIn_72_0 = stackOut_71_0;
              if (tf.field_a.a(0)) {
                stackOut_73_0 = (ub) (Object) stackIn_73_0;
                stackOut_73_1 = 0;
                stackIn_74_0 = stackOut_73_0;
                stackIn_74_1 = stackOut_73_1;
                break L23;
              } else {
                stackOut_72_0 = (ub) (Object) stackIn_72_0;
                stackOut_72_1 = 1;
                stackIn_74_0 = stackOut_72_0;
                stackIn_74_1 = stackOut_72_1;
                break L23;
              }
            }
            L24: {
              stackOut_74_0 = (ub) (Object) stackIn_74_0;
              stackOut_74_1 = stackIn_74_1;
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              if (tl.field_a == 0) {
                stackOut_76_0 = (ub) (Object) stackIn_76_0;
                stackOut_76_1 = stackIn_76_1;
                stackOut_76_2 = 0;
                stackIn_77_0 = stackOut_76_0;
                stackIn_77_1 = stackOut_76_1;
                stackIn_77_2 = stackOut_76_2;
                break L24;
              } else {
                stackOut_75_0 = (ub) (Object) stackIn_75_0;
                stackOut_75_1 = stackIn_75_1;
                stackOut_75_2 = 1;
                stackIn_77_0 = stackOut_75_0;
                stackIn_77_1 = stackOut_75_1;
                stackIn_77_2 = stackOut_75_2;
                break L24;
              }
            }
            L25: {
              stackOut_77_0 = (ub) (Object) stackIn_77_0;
              stackOut_77_1 = stackIn_77_1;
              stackOut_77_2 = stackIn_77_2;
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              if (0 == te.field_c) {
                stackOut_79_0 = (ub) (Object) stackIn_79_0;
                stackOut_79_1 = stackIn_79_1;
                stackOut_79_2 = stackIn_79_2;
                stackOut_79_3 = 0;
                stackIn_80_0 = stackOut_79_0;
                stackIn_80_1 = stackOut_79_1;
                stackIn_80_2 = stackOut_79_2;
                stackIn_80_3 = stackOut_79_3;
                break L25;
              } else {
                stackOut_78_0 = (ub) (Object) stackIn_78_0;
                stackOut_78_1 = stackIn_78_1;
                stackOut_78_2 = stackIn_78_2;
                stackOut_78_3 = 1;
                stackIn_80_0 = stackOut_78_0;
                stackIn_80_1 = stackOut_78_1;
                stackIn_80_2 = stackOut_78_2;
                stackIn_80_3 = stackOut_78_3;
                break L25;
              }
            }
            L26: {
              ((ub) (Object) stackIn_80_0).c(ch.a(stackIn_80_1 != 0, stackIn_80_2 != 0, stackIn_80_3 != 0, 0), 320, var4 + var3, 10742263, -1);
              stackOut_80_0 = this;
              stackOut_80_1 = 320;
              stackOut_80_2 = -4;
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              if (ld.field_F != 0) {
                stackOut_82_0 = this;
                stackOut_82_1 = stackIn_82_1;
                stackOut_82_2 = stackIn_82_2;
                stackOut_82_3 = 0;
                stackIn_83_0 = stackOut_82_0;
                stackIn_83_1 = stackOut_82_1;
                stackIn_83_2 = stackOut_82_2;
                stackIn_83_3 = stackOut_82_3;
                break L26;
              } else {
                stackOut_81_0 = this;
                stackOut_81_1 = stackIn_81_1;
                stackOut_81_2 = stackIn_81_2;
                stackOut_81_3 = 1;
                stackIn_83_0 = stackOut_81_0;
                stackIn_83_1 = stackOut_81_1;
                stackIn_83_2 = stackOut_81_2;
                stackIn_83_3 = stackOut_81_3;
                break L26;
              }
            }
            L27: {
              if (this.a(stackIn_83_1, stackIn_83_2, stackIn_83_3 == 0, var4 * 3 + var3, v.field_e, wl.field_T, 5883647)) {
                break L27;
              } else {
                if (n.field_L > 0) {
                  break L27;
                } else {
                  am.a(5, 4, -122);
                  break L27;
                }
              }
            }
            L28: {
              stackOut_87_0 = (ub) var2;
              stackIn_89_0 = stackOut_87_0;
              stackIn_88_0 = stackOut_87_0;
              if (te.field_c == 0) {
                stackOut_89_0 = (ub) (Object) stackIn_89_0;
                stackOut_89_1 = 0;
                stackIn_90_0 = stackOut_89_0;
                stackIn_90_1 = stackOut_89_1;
                break L28;
              } else {
                stackOut_88_0 = (ub) (Object) stackIn_88_0;
                stackOut_88_1 = 1;
                stackIn_90_0 = stackOut_88_0;
                stackIn_90_1 = stackOut_88_1;
                break L28;
              }
            }
            L29: {
              stackOut_90_0 = (ub) (Object) stackIn_90_0;
              stackOut_90_1 = stackIn_90_1;
              stackIn_92_0 = stackOut_90_0;
              stackIn_92_1 = stackOut_90_1;
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              if (tf.field_a.a(0)) {
                stackOut_92_0 = (ub) (Object) stackIn_92_0;
                stackOut_92_1 = stackIn_92_1;
                stackOut_92_2 = 0;
                stackIn_93_0 = stackOut_92_0;
                stackIn_93_1 = stackOut_92_1;
                stackIn_93_2 = stackOut_92_2;
                break L29;
              } else {
                stackOut_91_0 = (ub) (Object) stackIn_91_0;
                stackOut_91_1 = stackIn_91_1;
                stackOut_91_2 = 1;
                stackIn_93_0 = stackOut_91_0;
                stackIn_93_1 = stackOut_91_1;
                stackIn_93_2 = stackOut_91_2;
                break L29;
              }
            }
            L30: {
              stackOut_93_0 = (ub) (Object) stackIn_93_0;
              stackOut_93_1 = stackIn_93_1;
              stackOut_93_2 = stackIn_93_2;
              stackOut_93_3 = -72;
              stackIn_95_0 = stackOut_93_0;
              stackIn_95_1 = stackOut_93_1;
              stackIn_95_2 = stackOut_93_2;
              stackIn_95_3 = stackOut_93_3;
              stackIn_94_0 = stackOut_93_0;
              stackIn_94_1 = stackOut_93_1;
              stackIn_94_2 = stackOut_93_2;
              stackIn_94_3 = stackOut_93_3;
              if (tl.field_a == 0) {
                stackOut_95_0 = (ub) (Object) stackIn_95_0;
                stackOut_95_1 = stackIn_95_1;
                stackOut_95_2 = stackIn_95_2;
                stackOut_95_3 = stackIn_95_3;
                stackOut_95_4 = 0;
                stackIn_96_0 = stackOut_95_0;
                stackIn_96_1 = stackOut_95_1;
                stackIn_96_2 = stackOut_95_2;
                stackIn_96_3 = stackOut_95_3;
                stackIn_96_4 = stackOut_95_4;
                break L30;
              } else {
                stackOut_94_0 = (ub) (Object) stackIn_94_0;
                stackOut_94_1 = stackIn_94_1;
                stackOut_94_2 = stackIn_94_2;
                stackOut_94_3 = stackIn_94_3;
                stackOut_94_4 = 1;
                stackIn_96_0 = stackOut_94_0;
                stackIn_96_1 = stackOut_94_1;
                stackIn_96_2 = stackOut_94_2;
                stackIn_96_3 = stackOut_94_3;
                stackIn_96_4 = stackOut_94_4;
                break L30;
              }
            }
            L31: {
              ((ub) (Object) stackIn_96_0).c(pe.a(stackIn_96_1 != 0, stackIn_96_2 != 0, (byte) stackIn_96_3, stackIn_96_4 != 0), 320, 30 + (3 * var4 + var3), 10742263, -1);
              stackOut_96_0 = this;
              stackOut_96_1 = 320;
              stackOut_96_2 = param0 ^ -87;
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              if (ld.field_F != 1) {
                stackOut_98_0 = this;
                stackOut_98_1 = stackIn_98_1;
                stackOut_98_2 = stackIn_98_2;
                stackOut_98_3 = 0;
                stackIn_99_0 = stackOut_98_0;
                stackIn_99_1 = stackOut_98_1;
                stackIn_99_2 = stackOut_98_2;
                stackIn_99_3 = stackOut_98_3;
                break L31;
              } else {
                stackOut_97_0 = this;
                stackOut_97_1 = stackIn_97_1;
                stackOut_97_2 = stackIn_97_2;
                stackOut_97_3 = 1;
                stackIn_99_0 = stackOut_97_0;
                stackIn_99_1 = stackOut_97_1;
                stackIn_99_2 = stackOut_97_2;
                stackIn_99_3 = stackOut_97_3;
                break L31;
              }
            }
            L32: {
              if (this.a(stackIn_99_1, stackIn_99_2, stackIn_99_3 == 0, 30 + var4 / 2 + (var3 + 4 * var4), v.field_e, sg.field_b, 5883647)) {
                break L32;
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
                break L32;
              }
            }
            L33: {
              stackOut_101_0 = (ub) var2;
              stackIn_103_0 = stackOut_101_0;
              stackIn_102_0 = stackOut_101_0;
              if (0 == te.field_c) {
                stackOut_103_0 = (ub) (Object) stackIn_103_0;
                stackOut_103_1 = 0;
                stackIn_104_0 = stackOut_103_0;
                stackIn_104_1 = stackOut_103_1;
                break L33;
              } else {
                stackOut_102_0 = (ub) (Object) stackIn_102_0;
                stackOut_102_1 = 1;
                stackIn_104_0 = stackOut_102_0;
                stackIn_104_1 = stackOut_102_1;
                break L33;
              }
            }
            L34: {
              stackOut_104_0 = (ub) (Object) stackIn_104_0;
              stackOut_104_1 = stackIn_104_1;
              stackIn_106_0 = stackOut_104_0;
              stackIn_106_1 = stackOut_104_1;
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              if (tl.field_a == 0) {
                stackOut_106_0 = (ub) (Object) stackIn_106_0;
                stackOut_106_1 = stackIn_106_1;
                stackOut_106_2 = 0;
                stackIn_107_0 = stackOut_106_0;
                stackIn_107_1 = stackOut_106_1;
                stackIn_107_2 = stackOut_106_2;
                break L34;
              } else {
                stackOut_105_0 = (ub) (Object) stackIn_105_0;
                stackOut_105_1 = stackIn_105_1;
                stackOut_105_2 = 1;
                stackIn_107_0 = stackOut_105_0;
                stackIn_107_1 = stackOut_105_1;
                stackIn_107_2 = stackOut_105_2;
                break L34;
              }
            }
            L35: {
              stackOut_107_0 = (ub) (Object) stackIn_107_0;
              stackOut_107_1 = stackIn_107_1;
              stackOut_107_2 = stackIn_107_2;
              stackOut_107_3 = 6;
              stackIn_109_0 = stackOut_107_0;
              stackIn_109_1 = stackOut_107_1;
              stackIn_109_2 = stackOut_107_2;
              stackIn_109_3 = stackOut_107_3;
              stackIn_108_0 = stackOut_107_0;
              stackIn_108_1 = stackOut_107_1;
              stackIn_108_2 = stackOut_107_2;
              stackIn_108_3 = stackOut_107_3;
              if (tf.field_a.a(param0 + -85)) {
                stackOut_109_0 = (ub) (Object) stackIn_109_0;
                stackOut_109_1 = stackIn_109_1;
                stackOut_109_2 = stackIn_109_2;
                stackOut_109_3 = stackIn_109_3;
                stackOut_109_4 = 0;
                stackIn_110_0 = stackOut_109_0;
                stackIn_110_1 = stackOut_109_1;
                stackIn_110_2 = stackOut_109_2;
                stackIn_110_3 = stackOut_109_3;
                stackIn_110_4 = stackOut_109_4;
                break L35;
              } else {
                stackOut_108_0 = (ub) (Object) stackIn_108_0;
                stackOut_108_1 = stackIn_108_1;
                stackOut_108_2 = stackIn_108_2;
                stackOut_108_3 = stackIn_108_3;
                stackOut_108_4 = 1;
                stackIn_110_0 = stackOut_108_0;
                stackIn_110_1 = stackOut_108_1;
                stackIn_110_2 = stackOut_108_2;
                stackIn_110_3 = stackOut_108_3;
                stackIn_110_4 = stackOut_108_4;
                break L35;
              }
            }
            ((ub) (Object) stackIn_110_0).c(stellarshard.a(stackIn_110_1 != 0, stackIn_110_2 != 0, stackIn_110_3, stackIn_110_4 != 0), 320, 4 * var4 + var3 + 60, 10742263, -1);
            ti.b(112, 190, 416, 80 + var4 * 5, 16777215, n.field_L);
            break L6;
          }
          stackOut_111_0 = ~tl.field_c;
          stackOut_111_1 = -1;
          stackIn_112_0 = stackOut_111_0;
          stackIn_112_1 = stackOut_111_1;
          break L5;
        }
        L36: {
          if (stackIn_112_0 != stackIn_112_1) {
            break L36;
          } else {
            ((ij) this).field_u = -1;
            if (!s.field_i) {
              break L36;
            } else {
              break L36;
            }
          }
        }
        L37: {
          if (tl.field_c != 1) {
            break L37;
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
            break L37;
          }
        }
        L38: {
          if (tl.field_c != 2) {
            break L38;
          } else {
            L39: {
              L40: {
                hk.field_l[0].e(0, 0);
                ti.b(128, 105, 384, 295, 0, 192);
                ed.a(-6313, 119, 98, fg.field_P, 402, 302);
                ic.a(li.field_b, 9, -1, false, 320, 5883647, 439);
                if (!ah.a(-1)) {
                  break L40;
                } else {
                  L41: {
                    qj.field_a.c(pd.field_p, 320, 159, 0, -1);
                    qj.field_a.c(pd.field_p, 320, 161, 0, -1);
                    qj.field_a.c(pd.field_p, 319, 160, 0, -1);
                    qj.field_a.c(pd.field_p, 321, 160, 0, -1);
                    qj.field_a.c(pd.field_p, 320, 160, 16777215, -1);
                    if (!ah.a(param0 ^ -86)) {
                      break L41;
                    } else {
                      int discarded$15 = qj.field_a.a(hj.field_e, 220, 192, 200, 200, 16777215, 0, 1, 0, qj.field_a.field_N);
                      break L41;
                    }
                  }
                  ic.a(wl.field_T, 8, -1, false, 320, 5883647, 411);
                  if (var14 == 0) {
                    break L39;
                  } else {
                    break L40;
                  }
                }
              }
              L42: {
                if (gh.field_d != null) {
                  break L42;
                } else {
                  gh.field_d = bk.a(3, 10, 1, 17, 5);
                  break L42;
                }
              }
              L43: {
                L44: {
                  if (gh.field_d.field_s) {
                    break L44;
                  } else {
                    qj.field_a.c(wk.field_g, 320, 159, 0, -1);
                    qj.field_a.c(wk.field_g, 320, 161, 0, -1);
                    qj.field_a.c(wk.field_g, 319, 160, 0, -1);
                    qj.field_a.c(wk.field_g, 321, 160, 0, -1);
                    qj.field_a.c(wk.field_g, 320, 160, 16777215, -1);
                    if (var14 == 0) {
                      break L43;
                    } else {
                      break L44;
                    }
                  }
                }
                L45: {
                  if (gh.field_d.field_u != null) {
                    break L45;
                  } else {
                    qj.field_a.c(ib.field_d, 320, 159, 0, -1);
                    qj.field_a.c(ib.field_d, 320, 161, 0, -1);
                    qj.field_a.c(ib.field_d, 319, 160, 0, -1);
                    qj.field_a.c(ib.field_d, 321, 160, 0, -1);
                    qj.field_a.c(ib.field_d, 320, 160, 16777215, -1);
                    if (var14 == 0) {
                      break L43;
                    } else {
                      break L45;
                    }
                  }
                }
                var3_ref_String__ = gh.field_d.field_u[si.field_X];
                var4_ref_long__ = gh.field_d.field_w[si.field_X];
                var5_ref_int__ = gh.field_d.field_o[si.field_X];
                var6 = 0;
                var7 = 0;
                var8_ref_nf = bi.field_u;
                var9 = 123;
                var10 = 0;
                L46: while (true) {
                  L47: {
                    L48: {
                      L49: {
                        if (var6 != 0) {
                          break L49;
                        } else {
                          stackOut_136_0 = ue.field_a;
                          stackIn_142_0 = stackOut_136_0;
                          stackIn_137_0 = stackOut_136_0;
                          if (var14 != 0) {
                            break L47;
                          } else {
                            if (stackIn_137_0 <= 0) {
                              break L49;
                            } else {
                              stackOut_139_0 = 11;
                              stackIn_141_0 = stackOut_139_0;
                              break L48;
                            }
                          }
                        }
                      }
                      stackOut_140_0 = 10;
                      stackIn_141_0 = stackOut_140_0;
                      break L48;
                    }
                    stackOut_141_0 = ~stackIn_141_0;
                    stackIn_142_0 = stackOut_141_0;
                    break L47;
                  }
                  L50: {
                    if (stackIn_142_0 >= ~var10) {
                      break L50;
                    } else {
                      L51: {
                        var2_int = 10742263;
                        if (10 <= var10) {
                          break L51;
                        } else {
                          if (var6 != 0) {
                            break L51;
                          } else {
                            if (var8_ref_nf == null) {
                              break L51;
                            } else {
                              if (!hk.a(89, var3_ref_String__[var10])) {
                                break L51;
                              } else {
                                if (var4_ref_long__[var10] != var8_ref_nf.field_k) {
                                  break L51;
                                } else {
                                  if (~var5_ref_int__[var10] == ~ue.field_a) {
                                    var6 = 1;
                                    var2_int = 16777215;
                                    break L51;
                                  } else {
                                    break L51;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L52: {
                        L53: {
                          if (var10 == 10) {
                            break L53;
                          } else {
                            if (var3_ref_String__[var10] != null) {
                              break L53;
                            } else {
                              break L52;
                            }
                          }
                        }
                        L54: {
                          var7 = 1;
                          var11 = 0;
                          if (var10 < 10) {
                            var11 = var5_ref_int__[var10];
                            break L54;
                          } else {
                            break L54;
                          }
                        }
                        L55: {
                          var12 = null;
                          if (10 > var10) {
                            var12 = (Object) (Object) var3_ref_String__[var10];
                            break L55;
                          } else {
                            break L55;
                          }
                        }
                        L56: {
                          var12 = (Object) (Object) (var10 - -1 + "." + (String) var12);
                          if (var6 != 0) {
                            break L56;
                          } else {
                            if (var10 != 10) {
                              break L56;
                            } else {
                              if (0 < ue.field_a) {
                                var11 = ue.field_a;
                                var12 = (Object) (Object) wf.field_b;
                                var2_int = 16777215;
                                var12 = (Object) (Object) (vg.field_s + (String) var12);
                                break L56;
                              } else {
                                break L56;
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
                        break L52;
                      }
                      var9 += 20;
                      var10++;
                      if (var14 == 0) {
                        continue L46;
                      } else {
                        break L50;
                      }
                    }
                  }
                  L57: {
                    if (var7 != 0) {
                      break L57;
                    } else {
                      qj.field_a.c(pd.field_p, 320, 159, 0, -1);
                      qj.field_a.c(pd.field_p, 320, 161, 0, -1);
                      qj.field_a.c(pd.field_p, 319, 160, 0, -1);
                      qj.field_a.c(pd.field_p, 321, 160, 0, -1);
                      qj.field_a.c(pd.field_p, 320, 160, 16777215, -1);
                      break L57;
                    }
                  }
                  ti.d(129, 0, 511, 479);
                  qj.field_a.c(sj.field_C, 320 + -bf.field_c, 366, 0, -1);
                  qj.field_a.c(sj.field_C, -bf.field_c + 320, 368, 0, -1);
                  qj.field_a.c(sj.field_C, 319 + -bf.field_c, 367, 0, -1);
                  qj.field_a.c(sj.field_C, -bf.field_c + 321, 367, 0, -1);
                  qj.field_a.c(sj.field_C, 320 - bf.field_c, 367, 16777215, -1);
                  ti.b();
                  break L43;
                }
              }
              ic.a("                                                ", 8, -1, false, 320, 5883647, 411);
              var3 = -1;
              L58: while (true) {
                if (var3 > 1) {
                  break L39;
                } else {
                  l.field_f.c(od.field_w[1 + var3], 192 * var3 + 319, 435, 0, 0);
                  l.field_f.c(od.field_w[1 + var3], 320 + 192 * var3, 434, 0, 0);
                  if (var14 != 0) {
                    break L38;
                  } else {
                    L59: {
                      stackOut_181_0 = l.field_f;
                      stackOut_181_1 = od.field_w[var3 + 1];
                      stackOut_181_2 = 192 * var3 + 320;
                      stackOut_181_3 = 435;
                      stackIn_184_0 = stackOut_181_0;
                      stackIn_184_1 = stackOut_181_1;
                      stackIn_184_2 = stackOut_181_2;
                      stackIn_184_3 = stackOut_181_3;
                      stackIn_182_0 = stackOut_181_0;
                      stackIn_182_1 = stackOut_181_1;
                      stackIn_182_2 = stackOut_181_2;
                      stackIn_182_3 = stackOut_181_3;
                      if (~var3 == ~(si.field_X - 1)) {
                        stackOut_184_0 = (ub) (Object) stackIn_184_0;
                        stackOut_184_1 = (String) (Object) stackIn_184_1;
                        stackOut_184_2 = stackIn_184_2;
                        stackOut_184_3 = stackIn_184_3;
                        stackOut_184_4 = 16777215;
                        stackIn_185_0 = stackOut_184_0;
                        stackIn_185_1 = stackOut_184_1;
                        stackIn_185_2 = stackOut_184_2;
                        stackIn_185_3 = stackOut_184_3;
                        stackIn_185_4 = stackOut_184_4;
                        break L59;
                      } else {
                        stackOut_182_0 = (ub) (Object) stackIn_182_0;
                        stackOut_182_1 = (String) (Object) stackIn_182_1;
                        stackOut_182_2 = stackIn_182_2;
                        stackOut_182_3 = stackIn_182_3;
                        stackIn_183_0 = stackOut_182_0;
                        stackIn_183_1 = stackOut_182_1;
                        stackIn_183_2 = stackOut_182_2;
                        stackIn_183_3 = stackOut_182_3;
                        stackOut_183_0 = (ub) (Object) stackIn_183_0;
                        stackOut_183_1 = (String) (Object) stackIn_183_1;
                        stackOut_183_2 = stackIn_183_2;
                        stackOut_183_3 = stackIn_183_3;
                        stackOut_183_4 = 5883647;
                        stackIn_185_0 = stackOut_183_0;
                        stackIn_185_1 = stackOut_183_1;
                        stackIn_185_2 = stackOut_183_2;
                        stackIn_185_3 = stackOut_183_3;
                        stackIn_185_4 = stackOut_183_4;
                        break L59;
                      }
                    }
                    ((ub) (Object) stackIn_185_0).c(stackIn_185_1, stackIn_185_2, stackIn_185_3, stackIn_185_4, -1);
                    var3++;
                    if (var14 == 0) {
                      continue L58;
                    } else {
                      break L39;
                    }
                  }
                }
              }
            }
            ti.b(128, 105, 384, 295, 16777215, n.field_L);
            break L38;
          }
        }
        L60: {
          if (tl.field_c != 3) {
            break L60;
          } else {
            L61: {
              L62: {
                ((ij) this).field_r = -1;
                ti.b(108, 112, 424, 296, 0, 192);
                ed.a(-6313, 99, 105, fg.field_P, 442, 303);
                ti.e(175, 129, 282, 82, 4, 2387345);
                if (3 == bb.field_d) {
                  break L62;
                } else {
                  ti.e(130, -96 + (qj.field_a.field_N * 5 / 2 + 321), 380, 132, 4, 2387345);
                  if (var14 == 0) {
                    break L61;
                  } else {
                    break L62;
                  }
                }
              }
              ti.e(126, -98 + (330 + 5 * qj.field_a.field_N / 2) - 7, 388, 132, 4, 2387345);
              break L61;
            }
            L63: {
              L64: {
                if (!oc.field_d) {
                  break L64;
                } else {
                  hk.field_l[3].e(0, 0);
                  if (var14 == 0) {
                    break L63;
                  } else {
                    break L64;
                  }
                }
              }
              hk.field_l[2].e(0, 0);
              break L63;
            }
            L65: {
              ic.a(li.field_b, 9, -1, false, 320, 5883647, 439);
              if (oc.field_d) {
                ic.a(ta.field_r, 8, -1, false, 320, 5883647, 411);
                break L65;
              } else {
                break L65;
              }
            }
            L66: {
              if (ah.a(param0 + -86)) {
                ic.a(wl.field_T, 8, -1, false, 320, 5883647, 411);
                break L66;
              } else {
                break L66;
              }
            }
            L67: {
              var2_int = 180;
              var3 = 134;
              if (oc.field_d) {
                stackOut_208_0 = tl.field_a;
                stackIn_209_0 = stackOut_208_0;
                break L67;
              } else {
                if (!ah.a(-1)) {
                  stackOut_207_0 = sd.field_d;
                  stackIn_209_0 = stackOut_207_0;
                  break L67;
                } else {
                  stackOut_206_0 = 0;
                  stackIn_209_0 = stackOut_206_0;
                  break L67;
                }
              }
            }
            var4 = stackIn_209_0;
            var5 = 0;
            var6 = 1;
            var7 = 0;
            L68: while (true) {
              L69: {
                L70: {
                  if (rc.field_e.length <= var7) {
                    break L70;
                  } else {
                    stackOut_211_0 = var7;
                    stackOut_211_1 = 13;
                    stackIn_292_0 = stackOut_211_0;
                    stackIn_292_1 = stackOut_211_1;
                    stackIn_212_0 = stackOut_211_0;
                    stackIn_212_1 = stackOut_211_1;
                    if (var14 != 0) {
                      break L69;
                    } else {
                      L71: {
                        L72: {
                          if (stackIn_212_0 != stackIn_212_1) {
                            break L72;
                          } else {
                            if (pk.a(-12663, 0)) {
                              break L72;
                            } else {
                              if ((var4 & 1 << var7) == 0) {
                                var5++;
                                if (var14 == 0) {
                                  break L71;
                                } else {
                                  break L72;
                                }
                              } else {
                                break L72;
                              }
                            }
                          }
                        }
                        L73: {
                          var8 = 0;
                          if (~var2_int < ~ni.field_e) {
                            break L73;
                          } else {
                            if (~ni.field_e < ~(32 + var2_int)) {
                              break L73;
                            } else {
                              if (~eb.field_a > ~var3) {
                                break L73;
                              } else {
                                if (var3 - -32 >= eb.field_a) {
                                  ((ij) this).field_r = var7;
                                  var8 = 2;
                                  if (((ij) this).field_u != -1) {
                                    ti.e(var2_int - 2, -2 + var3, 36, 36, 4, 1193544);
                                    break L73;
                                  } else {
                                    break L73;
                                  }
                                } else {
                                  break L73;
                                }
                              }
                            }
                          }
                        }
                        L74: {
                          if (~var7 == ~((ij) this).field_u) {
                            var8 = 2;
                            ti.e(-3 + var2_int, var3 - 3, 38, 38, 4, 2387345);
                            break L74;
                          } else {
                            break L74;
                          }
                        }
                        L75: {
                          L76: {
                            if (0 != (1 << var7 & var4)) {
                              break L76;
                            } else {
                              if (oc.field_d) {
                                break L71;
                              } else {
                                L77: {
                                  L78: {
                                    if (6 == var7) {
                                      break L78;
                                    } else {
                                      if (var7 == 8) {
                                        break L78;
                                      } else {
                                        if (mk.field_k <= 0) {
                                          break L77;
                                        } else {
                                          break L78;
                                        }
                                      }
                                    }
                                  }
                                  uf.field_g.a(-var8 + var2_int, -var8 + var3, 2 * var8 + 32, 32 + var8 * 2);
                                  if (var14 == 0) {
                                    break L75;
                                  } else {
                                    break L77;
                                  }
                                }
                                ce.field_a.a(var2_int + -var8, -var8 + var3, 32 + var8 * 2, 32 - -(2 * var8));
                                if (var14 == 0) {
                                  break L75;
                                } else {
                                  break L76;
                                }
                              }
                            }
                          }
                          wh.field_e[var7].a(var2_int - var8, -var8 + var3, var8 * 2 + 32, 2 * var8 + 32);
                          break L75;
                        }
                        L79: {
                          L80: {
                            L81: {
                              if (~var7 == ~((ij) this).field_u) {
                                break L81;
                              } else {
                                if (((ij) this).field_u != -1) {
                                  break L80;
                                } else {
                                  if (~var2_int < ~ni.field_e) {
                                    break L80;
                                  } else {
                                    if (~(32 + var2_int) > ~ni.field_e) {
                                      break L80;
                                    } else {
                                      if (~var3 < ~eb.field_a) {
                                        break L80;
                                      } else {
                                        if (eb.field_a <= var3 + 32) {
                                          break L81;
                                        } else {
                                          break L80;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L82: {
                              L83: {
                                qj.field_a.c(rc.field_e[var7], 320, 230, 16777215, -1);
                                var6 = 0;
                                if ((1 << var7 & var4) == 0) {
                                  break L83;
                                } else {
                                  qj.field_a.c(jg.field_ob, 320, qj.field_a.field_N + 234, 16777215, -1);
                                  if (var14 == 0) {
                                    break L82;
                                  } else {
                                    break L83;
                                  }
                                }
                              }
                              qj.field_a.c(tf.field_c, 320, 234 + qj.field_a.field_N, 16711680, -1);
                              break L82;
                            }
                            L84: {
                              L85: {
                                var9 = qj.field_a.field_N * 5 / 2 + 227;
                                if ((1 << var7 & var4) == 0) {
                                  break L85;
                                } else {
                                  wh.field_e[var7].e(132, var9);
                                  if (var14 == 0) {
                                    break L84;
                                  } else {
                                    break L85;
                                  }
                                }
                              }
                              L86: {
                                if (var7 == 6) {
                                  break L86;
                                } else {
                                  if (8 == var7) {
                                    break L86;
                                  } else {
                                    if (mk.field_k > 0) {
                                      break L86;
                                    } else {
                                      ce.field_a.e(132, var9);
                                      if (var14 == 0) {
                                        break L84;
                                      } else {
                                        break L86;
                                      }
                                    }
                                  }
                                }
                              }
                              uf.field_g.e(132, var9);
                              break L84;
                            }
                            var9 = var9 + qj.field_a.field_N;
                            int discarded$16 = qj.field_a.a(hc.field_t[var7] + "<br><br>" + bb.field_h + wf.field_d[var7] + "<br><br>" + dd.field_b + am.field_d[var7], 280, -qj.field_a.field_N + var9, 228, 92, 10742263, -1, 1, 1, 2 + qj.field_a.field_N);
                            var10 = am.field_d[var7];
                            var11 = 0;
                            L87: while (true) {
                              if (~var10 >= ~var11) {
                                break L80;
                              } else {
                                af.field_n.a(-16 + -(4 * (var10 + -1)) + 8 * var11 + 394, 126 + var9 - (qj.field_a.field_N - -32));
                                var11++;
                                if (var14 != 0) {
                                  break L79;
                                } else {
                                  if (var14 == 0) {
                                    continue L87;
                                  } else {
                                    break L80;
                                  }
                                }
                              }
                            }
                          }
                          L88: {
                            int incrementValue$17 = var5;
                            var5++;
                            if (6 == incrementValue$17) {
                              break L88;
                            } else {
                              var2_int += 40;
                              if (var14 == 0) {
                                break L71;
                              } else {
                                break L88;
                              }
                            }
                          }
                          var3 += 40;
                          break L79;
                        }
                        var2_int = 180;
                        break L71;
                      }
                      var7++;
                      if (var14 == 0) {
                        continue L68;
                      } else {
                        break L70;
                      }
                    }
                  }
                }
                L89: {
                  if (var6 == 0) {
                    break L89;
                  } else {
                    var7 = 330 - (-(qj.field_a.field_N * 5 / 2) + 96);
                    var7 = var7 + qj.field_a.field_N;
                    qj.field_a.c(id.field_l, 320, var7, 10742263, -1);
                    if (ah.a(-1)) {
                      qj.field_a.c(hj.field_e, 320, var7 + 100, 10742263, -1);
                      break L89;
                    } else {
                      break L89;
                    }
                  }
                }
                stackOut_291_0 = 108;
                stackOut_291_1 = 80;
                stackIn_292_0 = stackOut_291_0;
                stackIn_292_1 = stackOut_291_1;
                break L69;
              }
              ti.b(stackIn_292_0, stackIn_292_1, 424, 328, 16777215, n.field_L);
              break L60;
            }
          }
        }
        super.a(param0);
    }

    static {
    }
}
