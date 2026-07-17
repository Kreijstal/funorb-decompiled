/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends wd {
    static String field_z;
    private lb field_y;
    private kh field_g;
    private byte[] field_x;
    private int field_i;
    private tg field_v;
    static il field_q;
    private byte[] field_m;
    private n field_s;
    private ik field_j;
    private ik field_u;
    private int field_t;
    private int field_l;
    private gb field_k;
    private boolean field_h;
    private int field_w;
    private vd field_n;
    private boolean field_p;
    private vd field_A;
    private long field_o;
    private boolean field_r;

    final void f(int param0) {
        if (param0 <= 49) {
            ((de) this).field_n = null;
        }
        if (((de) this).field_j == null) {
            return;
        }
        ((de) this).field_h = true;
        if (((de) this).field_A == null) {
            ((de) this).field_A = new vd();
        }
    }

    final void a(boolean param0) {
        gi var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            int discarded$6 = ((de) this).a(-70, 35);
            break L0;
          }
        }
        if (((de) this).field_A != null) {
          if (((de) this).a((byte) -101) == null) {
            return;
          } else {
            var2 = ((de) this).field_n.h(-11151);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  var3 = (int)var2.field_g;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 < 0) {
                            break L5;
                          } else {
                            if (var3 >= ((de) this).field_g.field_m) {
                              break L5;
                            } else {
                              if (0 == ((de) this).field_g.field_k[var3]) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var2.a(-16175);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (((de) this).field_m[var3] == 0) {
                          lb discarded$7 = this.a(65, var3, 1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (((de) this).field_m[var3] == -1) {
                          lb discarded$8 = this.a(65, var3, 2);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (((de) this).field_m[var3] == 1) {
                        var2.a(-16175);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var2 = ((de) this).field_n.e(0);
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
        } else {
          return;
        }
    }

    public static void d(int param0) {
        if (param0 < 114) {
            field_z = null;
        }
        field_z = null;
        field_q = null;
    }

    final int a(int param0, int param1) {
        lb var3 = (lb) (Object) ((de) this).field_v.a(true, (long)param0);
        if (param1 != -1) {
            return 94;
        }
        if (var3 == null) {
            return 0;
        }
        return var3.g(-58);
    }

    final static boolean a(char param0, int param1) {
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (param1 == -17321) {
          L0: {
            L1: {
              L2: {
                if (param0 < 48) {
                  break L2;
                } else {
                  if (param0 <= 57) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (65 > param0) {
                  break L3;
                } else {
                  if (param0 <= 90) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (97 > param0) {
                  break L4;
                } else {
                  if (param0 > 122) {
                    break L4;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L0;
          }
          return stackIn_13_0 != 0;
        } else {
          return true;
        }
    }

    final byte[] b(int param0, int param1) {
        if (param1 != 60) {
            return null;
        }
        lb var3 = this.a(65, param0, 0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.i(13095);
        var3.a(-16175);
        return var4;
    }

    final void c(int param0) {
        int var2_int = 0;
        lb var2 = null;
        gi var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_129_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_133_0 = 0;
        byte stackOut_6_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        L0: {
          L1: {
            var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            if (null == ((de) this).field_A) {
              break L1;
            } else {
              if (((de) this).a((byte) -57) != null) {
                L2: {
                  if (!((de) this).field_p) {
                    break L2;
                  } else {
                    var2_int = 1;
                    var3 = ((de) this).field_A.h(param0 ^ -11248);
                    L3: while (true) {
                      L4: {
                        L5: {
                          L6: {
                            if (var3 == null) {
                              break L6;
                            } else {
                              var4 = (int)var3.field_g;
                              stackOut_6_0 = ((de) this).field_m[var4];
                              stackIn_16_0 = stackOut_6_0;
                              stackIn_7_0 = stackOut_6_0;
                              if (var5 != 0) {
                                L7: while (true) {
                                  if (stackIn_16_0 <= ~((de) this).field_g.field_k.length) {
                                    break L5;
                                  } else {
                                    stackOut_17_0 = ((de) this).field_g.field_k[((de) this).field_w];
                                    stackIn_32_0 = stackOut_17_0;
                                    stackIn_18_0 = stackOut_17_0;
                                    if (var5 != 0) {
                                      break L4;
                                    } else {
                                      L8: {
                                        L9: {
                                          if (stackIn_18_0 == 0) {
                                            ((de) this).field_w = ((de) this).field_w + 1;
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
                                          if (((de) this).field_s.field_e >= 250) {
                                            var2_int = 0;
                                            if (var5 == 0) {
                                              break L5;
                                            } else {
                                              break L10;
                                            }
                                          } else {
                                            break L10;
                                          }
                                        }
                                        L11: {
                                          if (((de) this).field_m[((de) this).field_w] == 0) {
                                            lb discarded$6 = this.a(65, ((de) this).field_w, 1);
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          if (((de) this).field_m[((de) this).field_w] == 0) {
                                            var3 = new gi();
                                            var3.field_g = (long)((de) this).field_w;
                                            var2_int = 0;
                                            ((de) this).field_A.a(var3, 255);
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        ((de) this).field_w = ((de) this).field_w + 1;
                                        if (var5 == 0) {
                                          break L8;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      stackOut_15_0 = ~((de) this).field_w;
                                      stackIn_16_0 = stackOut_15_0;
                                      continue L7;
                                    }
                                  }
                                }
                              } else {
                                L13: {
                                  if (stackIn_7_0 != 0) {
                                    break L13;
                                  } else {
                                    lb discarded$7 = this.a(65, var4, 1);
                                    break L13;
                                  }
                                }
                                L14: {
                                  L15: {
                                    if (((de) this).field_m[var4] == 0) {
                                      break L15;
                                    } else {
                                      var3.a(-16175);
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
                                var3 = ((de) this).field_A.e(param0 + -97);
                                if (var5 == 0) {
                                  continue L3;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L16: while (true) {
                            stackOut_135_0 = ~((de) this).field_w;
                            stackIn_133_0 = stackOut_135_0;
                            if (stackIn_133_0 <= ~((de) this).field_g.field_k.length) {
                              break L5;
                            } else {
                              stackOut_131_0 = ((de) this).field_g.field_k[((de) this).field_w];
                              stackIn_32_0 = stackOut_131_0;
                              stackIn_132_0 = stackOut_131_0;
                              if (var5 != 0) {
                                break L4;
                              } else {
                                stackOut_132_0 = stackIn_132_0;
                                stackIn_129_0 = stackOut_132_0;
                                L17: {
                                  if (stackIn_129_0 == 0) {
                                    ((de) this).field_w = ((de) this).field_w + 1;
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
                                  if (((de) this).field_s.field_e >= 250) {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L5;
                                    } else {
                                      break L18;
                                    }
                                  } else {
                                    break L18;
                                  }
                                }
                                L19: {
                                  if (((de) this).field_m[((de) this).field_w] == 0) {
                                    lb discarded$8 = this.a(65, ((de) this).field_w, 1);
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                L20: {
                                  if (((de) this).field_m[((de) this).field_w] == 0) {
                                    var3 = new gi();
                                    var3.field_g = (long)((de) this).field_w;
                                    var2_int = 0;
                                    ((de) this).field_A.a(var3, 255);
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                ((de) this).field_w = ((de) this).field_w + 1;
                                if (var5 == 0) {
                                  continue L16;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        stackOut_31_0 = var2_int;
                        stackIn_32_0 = stackOut_31_0;
                        break L4;
                      }
                      L21: {
                        if (stackIn_32_0 != 0) {
                          ((de) this).field_p = false;
                          ((de) this).field_w = 0;
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
                  if (((de) this).field_h) {
                    break L22;
                  } else {
                    ((de) this).field_A = null;
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L22;
                    }
                  }
                }
                var2_int = 1;
                var3 = ((de) this).field_A.h(-11151);
                L23: while (true) {
                  L24: {
                    L25: {
                      if (var3 == null) {
                        break L25;
                      } else {
                        var4 = (int)var3.field_g;
                        stackOut_41_0 = -2;
                        stackOut_41_1 = ~((de) this).field_m[var4];
                        stackIn_50_0 = stackOut_41_0;
                        stackIn_50_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (var5 != 0) {
                          L26: while (true) {
                            if (stackIn_50_0 <= stackIn_50_1) {
                              break L24;
                            } else {
                              stackOut_51_0 = -1;
                              stackOut_51_1 = ~((de) this).field_g.field_k[((de) this).field_w];
                              stackIn_68_0 = stackOut_51_0;
                              stackIn_68_1 = stackOut_51_1;
                              stackIn_52_0 = stackOut_51_0;
                              stackIn_52_1 = stackOut_51_1;
                              if (var5 != 0) {
                                break L0;
                              } else {
                                L27: {
                                  L28: {
                                    if (stackIn_52_0 == stackIn_52_1) {
                                      ((de) this).field_w = ((de) this).field_w + 1;
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
                                    if (!((de) this).field_k.c(20)) {
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
                                    if (((de) this).field_m[((de) this).field_w] != 1) {
                                      lb discarded$9 = this.a(65, ((de) this).field_w, 2);
                                      break L30;
                                    } else {
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    if (1 != ((de) this).field_m[((de) this).field_w]) {
                                      var3 = new gi();
                                      var3.field_g = (long)((de) this).field_w;
                                      var2_int = 0;
                                      ((de) this).field_A.a(var3, 255);
                                      break L31;
                                    } else {
                                      break L31;
                                    }
                                  }
                                  ((de) this).field_w = ((de) this).field_w + 1;
                                  if (var5 == 0) {
                                    break L27;
                                  } else {
                                    break L24;
                                  }
                                }
                                stackOut_49_0 = ((de) this).field_g.field_k.length;
                                stackOut_49_1 = ((de) this).field_w;
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
                              lb discarded$10 = this.a(65, var4, 2);
                              break L32;
                            }
                          }
                          L33: {
                            L34: {
                              if (((de) this).field_m[var4] == 1) {
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
                            var3.a(-16175);
                            break L33;
                          }
                          var3 = ((de) this).field_A.e(0);
                          if (var5 == 0) {
                            continue L23;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    L35: while (true) {
                      stackOut_110_0 = ((de) this).field_g.field_k.length;
                      stackOut_110_1 = ((de) this).field_w;
                      stackIn_108_0 = stackOut_110_0;
                      stackIn_108_1 = stackOut_110_1;
                      if (stackIn_108_0 <= stackIn_108_1) {
                        break L24;
                      } else {
                        stackOut_106_0 = -1;
                        stackOut_106_1 = ~((de) this).field_g.field_k[((de) this).field_w];
                        stackIn_68_0 = stackOut_106_0;
                        stackIn_68_1 = stackOut_106_1;
                        stackIn_107_0 = stackOut_106_0;
                        stackIn_107_1 = stackOut_106_1;
                        if (var5 != 0) {
                          break L0;
                        } else {
                          stackOut_107_0 = stackIn_107_0;
                          stackOut_107_1 = stackIn_107_1;
                          stackIn_104_0 = stackOut_107_0;
                          stackIn_104_1 = stackOut_107_1;
                          L36: {
                            if (stackIn_104_0 == stackIn_104_1) {
                              ((de) this).field_w = ((de) this).field_w + 1;
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
                            if (!((de) this).field_k.c(20)) {
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
                            if (((de) this).field_m[((de) this).field_w] != 1) {
                              lb discarded$11 = this.a(65, ((de) this).field_w, 2);
                              break L38;
                            } else {
                              break L38;
                            }
                          }
                          L39: {
                            if (1 != ((de) this).field_m[((de) this).field_w]) {
                              var3 = new gi();
                              var3.field_g = (long)((de) this).field_w;
                              var2_int = 0;
                              ((de) this).field_A.a(var3, 255);
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                          ((de) this).field_w = ((de) this).field_w + 1;
                          if (var5 == 0) {
                            continue L35;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                  }
                  if (var2_int != 0) {
                    ((de) this).field_w = 0;
                    ((de) this).field_h = false;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                return;
              }
            }
          }
          stackOut_67_0 = param0;
          stackOut_67_1 = 97;
          stackIn_68_0 = stackOut_67_0;
          stackIn_68_1 = stackOut_67_1;
          break L0;
        }
        if (stackIn_68_0 == stackIn_68_1) {
          L40: {
            if (!((de) this).field_r) {
              break L40;
            } else {
              if (((de) this).field_o <= la.a(false)) {
                var2 = (lb) (Object) ((de) this).field_v.b(-1);
                L41: while (true) {
                  L42: {
                    L43: {
                      if (var2 == null) {
                        break L43;
                      } else {
                        if (var5 != 0) {
                          break L42;
                        } else {
                          L44: {
                            if (var2.field_u) {
                              break L44;
                            } else {
                              L45: {
                                if (var2.field_E) {
                                  break L45;
                                } else {
                                  var2.field_E = true;
                                  if (var5 == 0) {
                                    break L44;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                              if (var2.field_y) {
                                var2.a(-16175);
                                break L44;
                              } else {
                                throw new RuntimeException();
                              }
                            }
                          }
                          var2 = (lb) (Object) ((de) this).field_v.a((byte) -114);
                          if (var5 == 0) {
                            continue L41;
                          } else {
                            break L43;
                          }
                        }
                      }
                    }
                    ((de) this).field_o = la.a(false) + 1000L;
                    break L42;
                  }
                  break L40;
                }
              } else {
                break L40;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final lb a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte stackIn_47_0 = 0;
        byte stackIn_47_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        byte stackIn_79_0 = 0;
        byte stackIn_79_1 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        Object stackIn_93_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_78_0 = 0;
        byte stackOut_78_1 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        Object stackOut_92_0 = null;
        byte stackOut_46_0 = 0;
        byte stackOut_46_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        L0: {
          var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var4 = (Object) (Object) (lb) (Object) ((de) this).field_v.a(true, (long)param1);
          if (var4 == null) {
            break L0;
          } else {
            if (param2 != 0) {
              break L0;
            } else {
              if (((lb) var4).field_y) {
                break L0;
              } else {
                if (!((lb) var4).field_u) {
                  break L0;
                } else {
                  ((lb) var4).a(-16175);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 == null) {
            L2: {
              L3: {
                if (param2 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (param2 != 1) {
                      break L4;
                    } else {
                      if (null != ((de) this).field_j) {
                        var4 = (Object) (Object) ((de) this).field_s.a(((de) this).field_j, param1, 7);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  if (param2 == 2) {
                    if (null != ((de) this).field_j) {
                      if (((de) this).field_m[param1] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!((de) this).field_k.c(20)) {
                          var4 = (Object) (Object) ((de) this).field_k.a(((de) this).field_i, 11259, (byte) 2, param1, false);
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          return null;
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
              L5: {
                if (null == ((de) this).field_j) {
                  break L5;
                } else {
                  if (((de) this).field_m[param1] == -1) {
                    break L5;
                  } else {
                    var4 = (Object) (Object) ((de) this).field_s.a(6, param1, ((de) this).field_j);
                    if (var10 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              if (!((de) this).field_k.a(true)) {
                var4 = (Object) (Object) ((de) this).field_k.a(((de) this).field_i, 11259, (byte) 2, param1, true);
                break L2;
              } else {
                return null;
              }
            }
            ((de) this).field_v.a((gi) var4, (long)param1, -1);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((lb) var4).field_u) {
          L6: {
            if (param0 == 65) {
              break L6;
            } else {
              ((de) this).field_j = null;
              break L6;
            }
          }
          var5 = ((lb) var4).i(13095);
          if (var4 instanceof bi) {
            try {
              L7: {
                L8: {
                  if (var5 == null) {
                    break L8;
                  } else {
                    if (var5.length > 2) {
                      ta.field_b.reset();
                      ta.field_b.update(var5, 0, -2 + var5.length);
                      var6_int = (int)ta.field_b.getValue();
                      if (~var6_int != ~((de) this).field_g.field_j[param1]) {
                        throw new RuntimeException();
                      } else {
                        L9: {
                          L10: {
                            if (((de) this).field_g.field_q == null) {
                              break L10;
                            } else {
                              if (null != ((de) this).field_g.field_q[param1]) {
                                var7_ref_byte__ = ((de) this).field_g.field_q[param1];
                                var8 = b.a(0, 90, var5, -2 + var5.length);
                                var9 = 0;
                                L11: while (true) {
                                  if (var9 >= 64) {
                                    break L10;
                                  } else {
                                    stackOut_78_0 = var7_ref_byte__[var9];
                                    stackOut_78_1 = var8[var9];
                                    stackIn_83_0 = stackOut_78_0;
                                    stackIn_83_1 = stackOut_78_1;
                                    stackIn_79_0 = stackOut_78_0;
                                    stackIn_79_1 = stackOut_78_1;
                                    if (var10 != 0) {
                                      break L9;
                                    } else {
                                      if (stackIn_79_0 == stackIn_79_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L11;
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L10;
                              }
                            }
                          }
                          stackOut_82_0 = var5[var5.length - 1] & 255;
                          stackOut_82_1 = (var5[var5.length + -2] & 255) << 8;
                          stackIn_83_0 = stackOut_82_0;
                          stackIn_83_1 = stackOut_82_1;
                          break L9;
                        }
                        var7 = stackIn_83_0 + stackIn_83_1;
                        if (var7 == (((de) this).field_g.field_l[param1] & 65535)) {
                          L12: {
                            if (((de) this).field_m[param1] != 1) {
                              L13: {
                                if (((de) this).field_m[param1] == 0) {
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              ((de) this).field_m[param1] = (byte) 1;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L14: {
                            if (!((lb) var4).field_y) {
                              ((lb) var4).a(-16175);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          stackOut_92_0 = var4;
                          stackIn_93_0 = stackOut_92_0;
                          break L7;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L15: {
                var6_ref = (Exception) (Object) decompiledCaughtException;
                ((de) this).field_m[param1] = (byte) -1;
                ((lb) var4).a(-16175);
                if (((lb) var4).field_y) {
                  if (!((de) this).field_k.a(true)) {
                    var4 = (Object) (Object) ((de) this).field_k.a(((de) this).field_i, param0 + 11194, (byte) 2, param1, true);
                    ((de) this).field_v.a((gi) var4, (long)param1, -1);
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
            return (lb) (Object) stackIn_93_0;
          } else {
            try {
              L16: {
                L17: {
                  if (var5 == null) {
                    break L17;
                  } else {
                    if (2 < var5.length) {
                      ta.field_b.reset();
                      ta.field_b.update(var5, 0, -2 + var5.length);
                      var6_int = (int)ta.field_b.getValue();
                      if (~((de) this).field_g.field_j[param1] != ~var6_int) {
                        throw new RuntimeException();
                      } else {
                        L18: {
                          L19: {
                            if (null == ((de) this).field_g.field_q) {
                              break L19;
                            } else {
                              if (((de) this).field_g.field_q[param1] != null) {
                                var7_ref_byte__ = ((de) this).field_g.field_q[param1];
                                var8 = b.a(0, param0 + -9, var5, var5.length - 2);
                                var9 = 0;
                                L20: while (true) {
                                  if (64 <= var9) {
                                    break L19;
                                  } else {
                                    stackOut_46_0 = var7_ref_byte__[var9];
                                    stackOut_46_1 = var8[var9];
                                    stackIn_61_0 = stackOut_46_0;
                                    stackIn_61_1 = stackOut_46_1;
                                    stackIn_47_0 = stackOut_46_0;
                                    stackIn_47_1 = stackOut_46_1;
                                    if (var10 != 0) {
                                      decompiledRegionSelector0 = 1;
                                      break L16;
                                    } else {
                                      if (stackIn_47_0 == stackIn_47_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L20;
                                        } else {
                                          break L19;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                ((de) this).field_k.field_c = 0;
                                ((de) this).field_k.field_h = 0;
                                break L18;
                              }
                            }
                          }
                          ((de) this).field_k.field_c = 0;
                          ((de) this).field_k.field_h = 0;
                          break L18;
                        }
                        decompiledRegionSelector0 = 0;
                        break L16;
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L21: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                ((de) this).field_k.b((byte) 122);
                ((lb) var4).a(param0 + -16240);
                if (((lb) var4).field_y) {
                  if (!((de) this).field_k.a(true)) {
                    var4 = (Object) (Object) ((de) this).field_k.a(((de) this).field_i, 11259, (byte) 2, param1, true);
                    ((de) this).field_v.a((gi) var4, (long)param1, -1);
                    break L21;
                  } else {
                    return null;
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
                  var5[var5.length + -2] = (byte)(((de) this).field_g.field_l[param1] >>> 8);
                  var5[var5.length - 1] = (byte)((de) this).field_g.field_l[param1];
                  if (((de) this).field_j != null) {
                    bi discarded$1 = ((de) this).field_s.a(param1, ((de) this).field_j, var5, -127);
                    stackOut_60_0 = ~((de) this).field_m[param1];
                    stackOut_60_1 = -2;
                    stackIn_61_0 = stackOut_60_0;
                    stackIn_61_1 = stackOut_60_1;
                    break L23;
                  } else {
                    break L22;
                  }
                } else {
                  break L23;
                }
              }
              if (stackIn_61_0 == stackIn_61_1) {
                break L22;
              } else {
                ((de) this).field_m[param1] = (byte) 1;
                break L22;
              }
            }
            L24: {
              if (((lb) var4).field_y) {
                break L24;
              } else {
                ((lb) var4).a(param0 + -16240);
                break L24;
              }
            }
            return (lb) var4;
          }
        } else {
          return null;
        }
    }

    final kh a(byte param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 <= -36) {
            break L0;
          } else {
            kh discarded$2 = ((de) this).a((byte) 56);
            break L0;
          }
        }
        if (null != ((de) this).field_g) {
          return ((de) this).field_g;
        } else {
          L1: {
            if (null == ((de) this).field_y) {
              if (!((de) this).field_k.a(true)) {
                ((de) this).field_y = (lb) (Object) ((de) this).field_k.a(255, 11259, (byte) 0, ((de) this).field_i, true);
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (!((de) this).field_y.field_u) {
            L2: {
              L3: {
                var5 = ((de) this).field_y.i(13095);
                var2 = var5;
                if (((de) this).field_y instanceof bi) {
                  break L3;
                } else {
                  try {
                    L4: {
                      if (var5 != null) {
                        ((de) this).field_g = new kh(var5, ((de) this).field_l, ((de) this).field_x);
                        break L4;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var3 = decompiledCaughtException;
                      ((de) this).field_k.b((byte) 122);
                      ((de) this).field_g = null;
                      if (!((de) this).field_k.a(true)) {
                        break L5;
                      } else {
                        ((de) this).field_y = null;
                        if (var4 != 0) {
                          break L5;
                        } else {
                          return null;
                        }
                      }
                    }
                    ((de) this).field_y = (lb) (Object) ((de) this).field_k.a(255, 11259, (byte) 0, ((de) this).field_i, true);
                    return null;
                  }
                  if (((de) this).field_u != null) {
                    bi discarded$3 = ((de) this).field_s.a(((de) this).field_i, ((de) this).field_u, var5, 49);
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
                  if (var5 == null) {
                    throw new RuntimeException();
                  } else {
                    ((de) this).field_g = new kh(var5, ((de) this).field_l, ((de) this).field_x);
                    if (~((de) this).field_t != ~((de) this).field_g.field_t) {
                      throw new RuntimeException();
                    } else {
                      break L6;
                    }
                  }
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L7: {
                  var3 = decompiledCaughtException;
                  ((de) this).field_g = null;
                  if (!((de) this).field_k.a(true)) {
                    break L7;
                  } else {
                    ((de) this).field_y = null;
                    if (var4 != 0) {
                      break L7;
                    } else {
                      return null;
                    }
                  }
                }
                ((de) this).field_y = (lb) (Object) ((de) this).field_k.a(255, 11259, (byte) 0, ((de) this).field_i, true);
                return null;
              }
              break L2;
            }
            L8: {
              if (null != ((de) this).field_j) {
                ((de) this).field_m = new byte[((de) this).field_g.field_m];
                break L8;
              } else {
                break L8;
              }
            }
            ((de) this).field_y = null;
            return ((de) this).field_g;
          } else {
            return null;
          }
        }
    }

    final static void e(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (pj.field_G != null) {
            var1 = (Object) (Object) pj.field_G;
            synchronized (var1) {
              L1: {
                pj.field_G = null;
                break L1;
              }
            }
            break L0;
          } else {
            break L0;
          }
        }
        de.e(56);
    }

    de(int param0, ik param1, ik param2, gb param3, n param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((de) this).field_v = new tg(16);
        ((de) this).field_w = 0;
        ((de) this).field_n = new vd();
        ((de) this).field_o = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((de) this).field_j = param1;
                ((de) this).field_i = param0;
                if (null == ((de) this).field_j) {
                  break L2;
                } else {
                  ((de) this).field_p = true;
                  ((de) this).field_A = new vd();
                  if (!DrPhlogistonSavesTheEarth.field_D) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((de) this).field_p = false;
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
              ((de) this).field_r = stackIn_7_1 != 0;
              ((de) this).field_t = param7;
              ((de) this).field_k = param3;
              ((de) this).field_x = param6;
              ((de) this).field_s = param4;
              ((de) this).field_l = param5;
              ((de) this).field_u = param2;
              if (null == ((de) this).field_u) {
                break L4;
              } else {
                ((de) this).field_y = (lb) (Object) ((de) this).field_s.a(6, ((de) this).field_i, ((de) this).field_u);
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
            stackOut_10_1 = new StringBuilder().append("de.<init>(").append(param0).append(44);
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
          throw ie.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
