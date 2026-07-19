/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static int field_a;
    private int field_k;
    static int field_i;
    private rm field_g;
    private int field_h;
    static int[] field_d;
    static String field_l;
    static String[] field_b;
    static String[] field_f;
    static int field_e;
    private int field_c;
    static volatile int field_j;

    private final void e(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -108) {
                break L1;
              } else {
                field_d = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (this.e(0, param0 + 128)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_8_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var2_int = stackIn_8_0;
              if (this.e(2, 20)) {
                stackOut_11_0 = 2;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_9_0 = 1;
                stackIn_12_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              var3 = stackIn_12_0;
              if (this.field_g.a(0)) {
                break L4;
              } else {
                L5: {
                  if (ei.field_q != 96) {
                    break L5;
                  } else {
                    L6: {
                      if ((this.field_g.field_e ^ -1) >= (var2_int ^ -1)) {
                        break L6;
                      } else {
                        this.field_g.a(0, this.field_g.field_e - 1);
                        if (var5 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    this.field_g.a(0, var3);
                    break L5;
                  }
                }
                if (97 != ei.field_q) {
                  break L4;
                } else {
                  L7: {
                    L8: {
                      if (-1 < (this.field_g.field_e ^ -1)) {
                        break L8;
                      } else {
                        if ((var3 ^ -1) < (this.field_g.field_e ^ -1)) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    this.field_g.a(0, var2_int);
                    if (var5 == 0) {
                      break L4;
                    } else {
                      break L7;
                    }
                  }
                  this.field_g.a(0, this.field_g.field_e + 1);
                  break L4;
                }
              }
            }
            L9: {
              if (nf.field_a == null) {
                break L9;
              } else {
                if (null != nf.field_a.field_Ub) {
                  L10: {
                    L11: {
                      var4 = ei.field_q;
                      if (var4 != 105) {
                        break L11;
                      } else {
                        if (var5 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (104 != var4) {
                        break L12;
                      } else {
                        if (var5 == 0) {
                          break L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (-99 == (var4 ^ -1)) {
                      break L10;
                    } else {
                      if (var4 != 99) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  ef.field_c = ei.field_q;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            this.field_g.e((byte) 22);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.V(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_c == 14) {
                  break L2;
                } else {
                  if (13 == this.field_c) {
                    break L2;
                  } else {
                    if ((this.field_c ^ -1) == -8) {
                      break L2;
                    } else {
                      if ((this.field_c ^ -1) == -18) {
                        break L2;
                      } else {
                        if ((this.field_c ^ -1) == -7) {
                          break L2;
                        } else {
                          if (-6 == (this.field_c ^ -1)) {
                            break L2;
                          } else {
                            if ((this.field_c ^ -1) == -9) {
                              break L2;
                            } else {
                              if (19 == this.field_c) {
                                break L2;
                              } else {
                                if (20 != this.field_c) {
                                  break L1;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              if ((-4 + uc.field_e[this.field_c].length ^ -1) >= (param1 ^ -1)) {
                stackOut_30_0 = param1 - uc.field_e[this.field_c].length + 4;
                stackIn_31_0 = stackOut_30_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 < -59) {
                break L3;
              } else {
                this.i(-28);
                break L3;
              }
            }
            stackOut_35_0 = -1;
            stackIn_36_0 = stackOut_35_0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.DB(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_31_0;
        } else {
          return stackIn_36_0;
        }
    }

    private final void i(int param0) {
        if (!(va.field_c != null)) {
            return;
        }
        try {
            va.field_c.a(60);
            if (param0 != 21003) {
                this.a((byte) -45, -31, true);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.RA(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        Object var2 = null;
        int var2_int = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_32_0 = 0;
        int stackIn_201_0 = 0;
        int stackIn_201_1 = 0;
        int stackIn_219_0 = 0;
        int stackIn_219_1 = 0;
        int stackIn_248_0 = 0;
        int stackIn_290_0 = 0;
        int stackIn_290_1 = 0;
        int stackIn_387_0 = 0;
        int stackIn_387_1 = 0;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_200_1 = 0;
        int stackOut_218_0 = 0;
        int stackOut_218_1 = 0;
        int stackOut_247_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_289_0 = 0;
        int stackOut_289_1 = 0;
        int stackOut_386_0 = 0;
        int stackOut_386_1 = 0;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if ((nk.field_J ^ -1) < -1) {
                nk.field_J = nk.field_J - 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!gh.field_J) {
                break L2;
              } else {
                if (ni.b(11)) {
                  break L2;
                } else {
                  gh.field_J = false;
                  km.field_a = null;
                  break L2;
                }
              }
            }
            L3: {
              if ((this.field_c ^ -1) != -22) {
                break L3;
              } else {
                L4: {
                  L5: {
                    var2 = eh.field_c;
                    stackOut_12_0 = var2;
                    stackOut_12_1 = 4540749;
                    stackIn_18_0 = stackOut_12_0;
                    stackIn_18_1 = stackOut_12_1;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    if (mm.a(false)) {
                      break L5;
                    } else {
                      stackOut_13_0 = stackIn_13_0;
                      stackOut_13_1 = stackIn_13_1;
                      stackIn_18_0 = stackOut_13_0;
                      stackIn_18_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if ((this.field_c ^ -1) != (vb.field_g ^ -1)) {
                        break L5;
                      } else {
                        stackOut_14_0 = stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackOut_16_0 = stackIn_16_0;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = 1;
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_19_2 = stackOut_16_2;
                        break L4;
                      }
                    }
                  }
                  stackOut_18_0 = stackIn_18_0;
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L4;
                }
                var3_int = ((ng) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_19_2 != 0);
                if ((var3_int ^ -1) == -4) {
                  break L3;
                } else {
                  L6: {
                    if (var3_int == 1) {
                      break L6;
                    } else {
                      if (2 != var3_int) {
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if ((var3_int ^ -1) != -3) {
                      stackOut_31_0 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      break L7;
                    } else {
                      stackOut_29_0 = 1;
                      stackIn_32_0 = stackOut_29_0;
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      var4 = stackIn_32_0;
                      var5 = vb.field_g;
                      if ((var5 ^ -1) == -6) {
                        break L9;
                      } else {
                        if (6 == var5) {
                          break L9;
                        } else {
                          if ((var5 ^ -1) == -9) {
                            break L9;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    var5 = gh.field_Jb;
                    break L8;
                  }
                  q.a(0, var4 != 0, -1, var5);
                  break L3;
                }
              }
            }
            L10: {
              if (this.a(-2)) {
                break L10;
              } else {
                L11: {
                  if ((sn.field_q ^ -1) == 0) {
                    break L11;
                  } else {
                    if (lb.field_gc == 1) {
                      L12: {
                        if (-1 != (jl.field_p ^ -1)) {
                          break L12;
                        } else {
                          if (ni.b(47)) {
                            break L12;
                          } else {
                            L13: {
                              if (128 <= sn.field_q) {
                                break L13;
                              } else {
                                mm.field_g.a(66, (byte) -117);
                                mm.field_g.a((byte) 111, 1);
                                mm.field_g.a((byte) 124, sn.field_q);
                                var2_int = 0;
                                L14: while (true) {
                                  L15: {
                                    L16: {
                                      if (var2_int >= va.field_k.length) {
                                        break L16;
                                      } else {
                                        va.field_k[var2_int] = 0;
                                        var2_int++;
                                        if (var6 != 0) {
                                          break L15;
                                        } else {
                                          if (var6 == 0) {
                                            continue L14;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                    }
                                    vn.d(-65);
                                    break L15;
                                  }
                                  if (var6 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            mm.field_g.a(66, (byte) -117);
                            mm.field_g.a((byte) 108, 0);
                            mm.field_g.a((byte) 119, sn.field_q - 128);
                            var2_int = 0;
                            L17: while (true) {
                              L18: {
                                if ((va.field_k.length ^ -1) >= (var2_int ^ -1)) {
                                  break L18;
                                } else {
                                  va.field_k[var2_int] = 0;
                                  var2_int++;
                                  if (var6 != 0) {
                                    break L12;
                                  } else {
                                    if (var6 == 0) {
                                      continue L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                              vn.d(-78);
                              break L12;
                            }
                          }
                        }
                      }
                      if (jl.field_p >= 0) {
                        ee.c(-2483, 95);
                        lg.field_l = true;
                        kf.field_s = true;
                        sn.field_q = -1;
                        lb.field_gc = 0;
                        jl.field_p = -1;
                        ln.field_c = null;
                        km.field_a = null;
                        break L11;
                      } else {
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                L19: {
                  if (!gh.field_J) {
                    break L19;
                  } else {
                    if ((lb.field_gc ^ -1) == -2) {
                      L20: {
                        L21: {
                          L22: {
                            L23: {
                              var2_int = ln.field_g;
                              if (0 != var2_int) {
                                break L23;
                              } else {
                                if (var6 == 0) {
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            L24: {
                              if (-2 != (var2_int ^ -1)) {
                                break L24;
                              } else {
                                if (var6 == 0) {
                                  break L21;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            if ((var2_int ^ -1) != -3) {
                              break L19;
                            } else {
                              if (var6 == 0) {
                                break L20;
                              } else {
                                break L22;
                              }
                            }
                          }
                          L25: {
                            L26: {
                              ee.c(-2483, 95);
                              var2_int = vb.field_g;
                              if (-6 == (var2_int ^ -1)) {
                                break L26;
                              } else {
                                if (var2_int == 6) {
                                  break L26;
                                } else {
                                  if (-9 == (var2_int ^ -1)) {
                                    break L26;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            var2_int = gh.field_Jb;
                            break L25;
                          }
                          q.a(0, true, -1, var2_int);
                          km.field_a = null;
                          gh.field_J = false;
                          lg.field_l = true;
                          kf.field_s = true;
                          var2_int = 0;
                          L27: while (true) {
                            L28: {
                              L29: {
                                if (3 <= var2_int) {
                                  break L29;
                                } else {
                                  fm.field_f[var2_int] = 0;
                                  var2_int++;
                                  if (var6 != 0) {
                                    break L28;
                                  } else {
                                    if (var6 == 0) {
                                      continue L27;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                              }
                              jc.field_f = 0;
                              jb.field_P = 0;
                              break L28;
                            }
                            var2_int = 0;
                            L30: while (true) {
                              L31: {
                                L32: {
                                  if ((var2_int ^ -1) <= (rn.field_D.length ^ -1)) {
                                    break L32;
                                  } else {
                                    rn.field_D[var2_int] = 0;
                                    var2_int++;
                                    if (var6 != 0) {
                                      break L31;
                                    } else {
                                      if (var6 == 0) {
                                        continue L30;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L31;
                              }
                              L33: while (true) {
                                L34: {
                                  if ((fe.field_D.length ^ -1) >= (var2_int ^ -1)) {
                                    break L34;
                                  } else {
                                    fe.field_D[var2_int] = 0;
                                    var2_int++;
                                    if (var6 != 0) {
                                      break L19;
                                    } else {
                                      if (var6 == 0) {
                                        continue L33;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                                if (var6 == 0) {
                                  break L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                        ee.c(-2483, 95);
                        v.a(20, (String) null, 10);
                        if (var6 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                      ee.c(-2483, 95);
                      gh.field_J = false;
                      kf.field_s = true;
                      km.field_a = null;
                      lg.field_l = true;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                }
                L35: {
                  if (!gd.field_ub) {
                    break L35;
                  } else {
                    if (null == km.field_a) {
                      gd.field_ub = false;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                }
                L36: {
                  if (!gd.field_ub) {
                    break L36;
                  } else {
                    if (lb.field_gc == 1) {
                      lb.field_gc = 0;
                      km.field_a = null;
                      kf.field_s = true;
                      ln.field_c = null;
                      lg.field_l = true;
                      gd.field_ub = false;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                }
                L37: {
                  L38: {
                    if (km.field_a == td.field_ac) {
                      break L38;
                    } else {
                      if (km.field_a != ra.field_b) {
                        break L37;
                      } else {
                        break L38;
                      }
                    }
                  }
                  if (!ni.b(11)) {
                    km.field_a = null;
                    lg.field_l = true;
                    kf.field_s = true;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L39: {
                  L40: {
                    if (km.field_a == td.field_ac) {
                      break L40;
                    } else {
                      if (ra.field_b != km.field_a) {
                        break L39;
                      } else {
                        break L40;
                      }
                    }
                  }
                  if ((lb.field_gc ^ -1) != -2) {
                    break L39;
                  } else {
                    if ((ln.field_g ^ -1) == -1) {
                      ee.c(-2483, 95);
                      v.a(20, (String) null, 10);
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                }
                if (null == km.field_a) {
                  break L10;
                } else {
                  L41: while (true) {
                    L42: {
                      if (!dl.f(22759)) {
                        break L42;
                      } else {
                        L43: {
                          if (-14 == (ei.field_q ^ -1)) {
                            break L43;
                          } else {
                            if (ei.field_q == 84) {
                              break L43;
                            } else {
                              if (ei.field_q != 83) {
                                continue L41;
                              } else {
                                break L43;
                              }
                            }
                          }
                        }
                        km.field_a = null;
                        lg.field_l = true;
                        ln.field_c = null;
                        kf.field_s = true;
                        if (var6 != 0) {
                          break L10;
                        } else {
                          break L42;
                        }
                      }
                    }
                    if (null == km.field_a) {
                      break L10;
                    } else {
                      decompiledRegionSelector1 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
            L44: {
              var2 = null;
              if (-1 < (dc.field_g ^ -1)) {
                break L44;
              } else {
                var2 = pa.field_d[dc.field_g];
                break L44;
              }
            }
            L45: {
              if (null != var2) {
                L46: while (true) {
                  L47: {
                    L48: {
                      if (!dl.f(22759)) {
                        break L48;
                      } else {
                        L49: {
                          if (13 == ei.field_q) {
                            break L49;
                          } else {
                            if (ei.field_q != 84) {
                              continue L46;
                            } else {
                              stackOut_200_0 = 7;
                              stackOut_200_1 = this.field_g.field_e;
                              stackIn_219_0 = stackOut_200_0;
                              stackIn_219_1 = stackOut_200_1;
                              stackIn_201_0 = stackOut_200_0;
                              stackIn_201_1 = stackOut_200_1;
                              if (var6 != 0) {
                                break L47;
                              } else {
                                if (stackIn_201_0 == stackIn_201_1) {
                                  break L49;
                                } else {
                                  if (8 == this.field_g.field_e) {
                                    break L49;
                                  } else {
                                    continue L46;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L50: {
                          L51: {
                            dc.field_g = -1;
                            ((sf) (var2)).a((byte) 92);
                            var3_int = vb.field_g;
                            if ((var3_int ^ -1) == -6) {
                              break L51;
                            } else {
                              if (var3_int == 6) {
                                break L51;
                              } else {
                                if (8 != var3_int) {
                                  break L50;
                                } else {
                                  break L51;
                                }
                              }
                            }
                          }
                          var3_int = gh.field_Jb;
                          break L50;
                        }
                        q.a(0, false, -1, var3_int);
                        break L48;
                      }
                    }
                    stackOut_218_0 = lb.field_gc ^ -1;
                    stackOut_218_1 = -3;
                    stackIn_219_0 = stackOut_218_0;
                    stackIn_219_1 = stackOut_218_1;
                    break L47;
                  }
                  L52: {
                    if (stackIn_219_0 != stackIn_219_1) {
                      break L52;
                    } else {
                      if (!((sf) (var2)).c(21)) {
                        lb.field_gc = 0;
                        break L52;
                      } else {
                        break L52;
                      }
                    }
                  }
                  if (lb.field_gc != 1) {
                    break L45;
                  } else {
                    if (((sf) (var2)).a(this.field_g, 23123)) {
                      break L45;
                    } else {
                      lb.field_gc = 0;
                      break L45;
                    }
                  }
                }
              } else {
                break L45;
              }
            }
            L53: {
              L54: {
                if (wb.field_c == null) {
                  break L54;
                } else {
                  wb.field_c.setCursor((java.awt.Cursor) null);
                  if (var6 == 0) {
                    break L53;
                  } else {
                    break L54;
                  }
                }
              }
              sl.field_n.setCursor((java.awt.Cursor) null);
              break L53;
            }
            L55: {
              if (param0) {
                break L55;
              } else {
                field_a = -33;
                break L55;
              }
            }
            if (12 == this.field_c) {
              L56: {
                if (mm.a(false)) {
                  stackOut_247_0 = 0;
                  stackIn_248_0 = stackOut_247_0;
                  break L56;
                } else {
                  stackOut_245_0 = 1;
                  stackIn_248_0 = stackOut_245_0;
                  break L56;
                }
              }
              L57: {
                var3_int = c.a(stackIn_248_0 != 0, 269);
                if ((var3_int ^ -1) == -4) {
                  L58: {
                    if (null == wb.field_c) {
                      break L58;
                    } else {
                      ub.c(0);
                      break L58;
                    }
                  }
                  re.a(wl.d((byte) -21), 9268);
                  break L57;
                } else {
                  break L57;
                }
              }
              L59: {
                if ((var3_int ^ -1) != -2) {
                  break L59;
                } else {
                  L60: {
                    L61: {
                      var4 = vb.field_g;
                      if (5 == var4) {
                        break L61;
                      } else {
                        if ((var4 ^ -1) == -7) {
                          break L61;
                        } else {
                          if ((var4 ^ -1) == -9) {
                            break L61;
                          } else {
                            break L60;
                          }
                        }
                      }
                    }
                    var4 = gh.field_Jb;
                    break L60;
                  }
                  q.a(0, false, -1, var4);
                  break L59;
                }
              }
              L62: {
                if (var3_int == 2) {
                  L63: {
                    L64: {
                      var4 = vb.field_g;
                      if (5 == var4) {
                        break L64;
                      } else {
                        if (-7 == (var4 ^ -1)) {
                          break L64;
                        } else {
                          if (8 == var4) {
                            break L64;
                          } else {
                            break L63;
                          }
                        }
                      }
                    }
                    var4 = gh.field_Jb;
                    break L63;
                  }
                  q.a(0, true, -1, var4);
                  break L62;
                } else {
                  break L62;
                }
              }
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              L65: {
                if (rc.field_n) {
                  break L65;
                } else {
                  if (!da.field_d) {
                    L66: while (true) {
                      L67: {
                        L68: {
                          if (!dl.f(22759)) {
                            break L68;
                          } else {
                            stackOut_289_0 = 13;
                            stackOut_289_1 = ei.field_q;
                            stackIn_387_0 = stackOut_289_0;
                            stackIn_387_1 = stackOut_289_1;
                            stackIn_290_0 = stackOut_289_0;
                            stackIn_290_1 = stackOut_289_1;
                            if (var6 != 0) {
                              break L67;
                            } else {
                              L69: {
                                if (stackIn_290_0 == stackIn_290_1) {
                                  break L69;
                                } else {
                                  this.a((byte) -120);
                                  if (0 != (this.field_g.field_e ^ -1)) {
                                    this.a((byte) -32, this.field_g.field_e, false);
                                    if (var6 == 0) {
                                      continue L66;
                                    } else {
                                      break L69;
                                    }
                                  } else {
                                    continue L66;
                                  }
                                }
                              }
                              L70: {
                                if ((this.field_c ^ -1) != -8) {
                                  break L70;
                                } else {
                                  if ((gh.field_Jb ^ -1) != -1) {
                                    ea.field_k = true;
                                    break L70;
                                  } else {
                                    break L70;
                                  }
                                }
                              }
                              L71: {
                                L72: {
                                  if (-21 != (this.field_c ^ -1)) {
                                    break L72;
                                  } else {
                                    if (-1 <= (fm.field_f[0] ^ -1)) {
                                      break L72;
                                    } else {
                                      if (ni.b(49)) {
                                        break L71;
                                      } else {
                                        break L72;
                                      }
                                    }
                                  }
                                }
                                L73: {
                                  if ((this.field_c ^ -1) == -19) {
                                    break L73;
                                  } else {
                                    L74: {
                                      if (-2 == (this.field_c ^ -1)) {
                                        break L74;
                                      } else {
                                        if (-3 == (this.field_c ^ -1)) {
                                          break L74;
                                        } else {
                                          if (-4 == (this.field_c ^ -1)) {
                                            break L74;
                                          } else {
                                            if ((this.field_c ^ -1) == -5) {
                                              break L74;
                                            } else {
                                              if ((pm.field_T ^ -1) == -11) {
                                                continue L66;
                                              } else {
                                                if (pm.field_T == 0) {
                                                  continue L66;
                                                } else {
                                                  L75: {
                                                    L76: {
                                                      if (-15 != (pm.field_T ^ -1)) {
                                                        break L76;
                                                      } else {
                                                        gh.field_Jb = 0;
                                                        if (var6 == 0) {
                                                          break L75;
                                                        } else {
                                                          break L76;
                                                        }
                                                      }
                                                    }
                                                    L77: {
                                                      if (pm.field_T == 20) {
                                                        break L77;
                                                      } else {
                                                        if ((gh.field_Jb ^ -1) != (this.field_c ^ -1)) {
                                                          break L75;
                                                        } else {
                                                          L78: {
                                                            if (-15 == (this.field_c ^ -1)) {
                                                              break L78;
                                                            } else {
                                                              if (13 != this.field_c) {
                                                                break L75;
                                                              } else {
                                                                break L78;
                                                              }
                                                            }
                                                          }
                                                          gh.field_Jb = 0;
                                                          if (var6 == 0) {
                                                            break L75;
                                                          } else {
                                                            break L77;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L79: {
                                                      L80: {
                                                        if (10 > fm.field_f[0]) {
                                                          break L80;
                                                        } else {
                                                          if (!ni.b(36)) {
                                                            break L79;
                                                          } else {
                                                            break L80;
                                                          }
                                                        }
                                                      }
                                                      gh.field_Jb = 0;
                                                      if (var6 == 0) {
                                                        break L75;
                                                      } else {
                                                        break L79;
                                                      }
                                                    }
                                                    gh.field_Jb = 19;
                                                    break L75;
                                                  }
                                                  L81: {
                                                    if ((pm.field_T ^ -1) != -20) {
                                                      break L81;
                                                    } else {
                                                      gh.field_Jb = 0;
                                                      break L81;
                                                    }
                                                  }
                                                  q.a(gh.field_Jb, false, -1, gh.field_Jb);
                                                  if (var6 == 0) {
                                                    continue L66;
                                                  } else {
                                                    break L74;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    ee.c(-2483, 85);
                                    q.a(-1, false, -1, 0);
                                    if (var6 == 0) {
                                      continue L66;
                                    } else {
                                      break L73;
                                    }
                                  }
                                }
                                var3_int = 0;
                                L82: while (true) {
                                  L83: {
                                    L84: {
                                      if (var3_int >= va.field_k.length) {
                                        break L84;
                                      } else {
                                        va.field_k[var3_int] = 0;
                                        var3_int++;
                                        if (var6 != 0) {
                                          break L83;
                                        } else {
                                          if (var6 == 0) {
                                            continue L82;
                                          } else {
                                            break L84;
                                          }
                                        }
                                      }
                                    }
                                    vn.d(-66);
                                    var3_int = vb.field_g;
                                    break L83;
                                  }
                                  L85: {
                                    L86: {
                                      if (-6 == (var3_int ^ -1)) {
                                        break L86;
                                      } else {
                                        if (var3_int == 6) {
                                          break L86;
                                        } else {
                                          if (var3_int == 8) {
                                            break L86;
                                          } else {
                                            break L85;
                                          }
                                        }
                                      }
                                    }
                                    var3_int = gh.field_Jb;
                                    break L85;
                                  }
                                  q.a(0, false, -1, var3_int);
                                  if (var6 == 0) {
                                    continue L66;
                                  } else {
                                    break L71;
                                  }
                                }
                              }
                              gh.field_J = true;
                              ln.field_g = -1;
                              if (var6 == 0) {
                                continue L66;
                              } else {
                                break L68;
                              }
                            }
                          }
                        }
                        this.field_g.a(124, this.a(oh.field_f, pi.field_c, 70), this.a(oa.field_S, rj.field_j, 125));
                        stackOut_386_0 = this.field_g.field_e;
                        stackOut_386_1 = -1;
                        stackIn_387_0 = stackOut_386_0;
                        stackIn_387_1 = stackOut_386_1;
                        break L67;
                      }
                      if ((stackIn_387_0 ^ stackIn_387_1) == 0) {
                        break L65;
                      } else {
                        this.a((byte) -110, this.field_g.field_e, true);
                        break L65;
                      }
                    }
                  } else {
                    break L65;
                  }
                }
              }
              L87: {
                L88: {
                  if (0 != this.field_c) {
                    break L88;
                  } else {
                    if (!hg.field_h) {
                      break L88;
                    } else {
                      if (-2 != (lb.field_gc ^ -1)) {
                        break L88;
                      } else {
                        L89: {
                          L90: {
                            ee.c(-2483, 95);
                            var3_int = vb.field_g;
                            if ((var3_int ^ -1) == -6) {
                              break L90;
                            } else {
                              if (var3_int == 6) {
                                break L90;
                              } else {
                                if ((var3_int ^ -1) != -9) {
                                  break L89;
                                } else {
                                  break L90;
                                }
                              }
                            }
                          }
                          var3_int = gh.field_Jb;
                          break L89;
                        }
                        q.a(18, true, -1, var3_int);
                        if (var6 == 0) {
                          break L87;
                        } else {
                          break L88;
                        }
                      }
                    }
                  }
                }
                L91: {
                  if ((this.field_c ^ -1) == -19) {
                    break L91;
                  } else {
                    L92: {
                      if (this.field_c != 8) {
                        break L92;
                      } else {
                        this.a(true, false);
                        if (var6 == 0) {
                          break L87;
                        } else {
                          break L92;
                        }
                      }
                    }
                    L93: {
                      L94: {
                        if (9 == this.field_c) {
                          break L94;
                        } else {
                          if (-11 != (pm.field_T ^ -1)) {
                            break L93;
                          } else {
                            break L94;
                          }
                        }
                      }
                      this.a(true, true);
                      if (var6 == 0) {
                        break L87;
                      } else {
                        break L93;
                      }
                    }
                    L95: {
                      if ((this.field_c ^ -1) != -15) {
                        break L95;
                      } else {
                        try {
                          L96: {
                            rj.d(6993661);
                            decompiledRegionSelector0 = 0;
                            break L96;
                          }
                        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L97: {
                            var3 = decompiledCaughtException;
                            System.err.println("Update constr: " + var3);
                            var3.printStackTrace();
                            vn.d(-58);
                            var4 = 0;
                            L98: while (true) {
                              L99: {
                                L100: {
                                  if (va.field_k.length <= var4) {
                                    break L100;
                                  } else {
                                    va.field_k[var4] = 0;
                                    var4++;
                                    if (var6 != 0) {
                                      break L99;
                                    } else {
                                      if (var6 == 0) {
                                        continue L98;
                                      } else {
                                        break L100;
                                      }
                                    }
                                  }
                                }
                                hl.field_v = ji.a(ua.field_x, (byte) 108, di.field_c);
                                uc.field_b = cj.a(-94, di.field_c, hl.field_v);
                                break L99;
                              }
                              if (var6 == 0) {
                                decompiledRegionSelector0 = 0;
                                break L97;
                              } else {
                                decompiledRegionSelector0 = 1;
                                break L97;
                              }
                            }
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L87;
                        } else {
                          break L95;
                        }
                      }
                    }
                    if (this.field_c == 13) {
                      break L87;
                    } else {
                      L101: {
                        if (this.field_c != 7) {
                          break L101;
                        } else {
                          this.g((byte) -40);
                          if (var6 == 0) {
                            break L87;
                          } else {
                            break L101;
                          }
                        }
                      }
                      if (-17 != (this.field_c ^ -1)) {
                        break L87;
                      } else {
                        this.i(21003);
                        if (var6 == 0) {
                          break L87;
                        } else {
                          break L91;
                        }
                      }
                    }
                  }
                }
                this.o(-29628);
                break L87;
              }
              decompiledRegionSelector1 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (var2), "ji.IB(" + param0 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final int g(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_130_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        try {
          L0: {
            var3_int = this.b(-106, param1);
            if (-1 >= (var3_int ^ -1)) {
              stackOut_3_0 = 159 * var3_int + 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_c != 5) {
                  break L1;
                } else {
                  if (!ni.b(52)) {
                    L2: {
                      if ((param1 ^ -1) <= -4) {
                        stackOut_14_0 = 260;
                        stackIn_15_0 = stackOut_14_0;
                        break L2;
                      } else {
                        stackOut_12_0 = 100 - -(param1 * 150);
                        stackIn_15_0 = stackOut_12_0;
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (-18 != (this.field_c ^ -1)) {
                if (!this.a(-2)) {
                  L3: {
                    if (-7 != (this.field_c ^ -1)) {
                      break L3;
                    } else {
                      if (!ni.b(54)) {
                        L4: {
                          if (2 <= param1) {
                            stackOut_31_0 = 260;
                            stackIn_32_0 = stackOut_31_0;
                            break L4;
                          } else {
                            stackOut_29_0 = 170 * param1 + 155;
                            stackIn_32_0 = stackOut_29_0;
                            break L4;
                          }
                        }
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (-8 == (this.field_c ^ -1)) {
                    stackOut_36_0 = uc.field_k[this.field_c] + 180 * param1;
                    stackIn_37_0 = stackOut_36_0;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  } else {
                    if (this.field_c != 13) {
                      if (this.field_c == 14) {
                        if (ni.b(114)) {
                          stackOut_52_0 = 240 + (-1200 + 800 * param1) / 5;
                          stackIn_53_0 = stackOut_52_0;
                          decompiledRegionSelector0 = 9;
                          break L0;
                        } else {
                          stackOut_50_0 = (param1 * 800 + -800) / 5 - -240;
                          stackIn_51_0 = stackOut_50_0;
                          decompiledRegionSelector0 = 8;
                          break L0;
                        }
                      } else {
                        if (-1 == (this.field_c ^ -1)) {
                          var4 = uc.field_e[this.field_c][param1];
                          if (-35 == (var4 ^ -1)) {
                            stackOut_60_0 = 19;
                            stackIn_61_0 = stackOut_60_0;
                            decompiledRegionSelector0 = 10;
                            break L0;
                          } else {
                            stackOut_62_0 = 190;
                            stackIn_63_0 = stackOut_62_0;
                            decompiledRegionSelector0 = 11;
                            break L0;
                          }
                        } else {
                          if (this.field_c != 15) {
                            if (param0 > 123) {
                              L5: {
                                if ((this.field_c ^ -1) != -20) {
                                  break L5;
                                } else {
                                  if (fa.field_c == uc.field_e[this.field_c]) {
                                    L6: {
                                      if ((param1 ^ -1) > -1) {
                                        break L6;
                                      } else {
                                        if (-11 < (param1 ^ -1)) {
                                          stackOut_94_0 = 30;
                                          stackIn_95_0 = stackOut_94_0;
                                          decompiledRegionSelector0 = 16;
                                          break L0;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    L7: {
                                      if (10 > param1) {
                                        break L7;
                                      } else {
                                        if ((param1 ^ -1) > -21) {
                                          stackOut_102_0 = 230;
                                          stackIn_103_0 = stackOut_102_0;
                                          decompiledRegionSelector0 = 17;
                                          break L0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    if (-21 < (param1 ^ -1)) {
                                      break L5;
                                    } else {
                                      if ((param1 ^ -1) > -31) {
                                        stackOut_110_0 = 430;
                                        stackIn_111_0 = stackOut_110_0;
                                        decompiledRegionSelector0 = 18;
                                        break L0;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  } else {
                                    L8: {
                                      if (-1 < (param1 ^ -1)) {
                                        break L8;
                                      } else {
                                        if (param1 >= 10) {
                                          break L8;
                                        } else {
                                          stackOut_80_0 = 50;
                                          stackIn_81_0 = stackOut_80_0;
                                          decompiledRegionSelector0 = 14;
                                          break L0;
                                        }
                                      }
                                    }
                                    if ((param1 ^ -1) > -11) {
                                      break L5;
                                    } else {
                                      if (param1 >= 20) {
                                        break L5;
                                      } else {
                                        stackOut_86_0 = 330;
                                        stackIn_87_0 = stackOut_86_0;
                                        decompiledRegionSelector0 = 15;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              }
                              L9: {
                                if (20 != this.field_c) {
                                  break L9;
                                } else {
                                  L10: {
                                    var4 = uc.field_e[this.field_c][param1];
                                    if (25 == var4) {
                                      break L10;
                                    } else {
                                      if (26 == var4) {
                                        stackOut_125_0 = 540;
                                        stackIn_126_0 = stackOut_125_0;
                                        decompiledRegionSelector0 = 20;
                                        break L0;
                                      } else {
                                        if ((var4 ^ -1) != -40) {
                                          break L9;
                                        } else {
                                          if (SteelSentinels.field_G == 0) {
                                            stackOut_127_0 = 196;
                                            stackIn_128_0 = stackOut_127_0;
                                            decompiledRegionSelector0 = 21;
                                            break L0;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_123_0 = 40;
                                  stackIn_124_0 = stackOut_123_0;
                                  decompiledRegionSelector0 = 19;
                                  break L0;
                                }
                              }
                              stackOut_129_0 = uc.field_k[this.field_c];
                              stackIn_130_0 = stackOut_129_0;
                              decompiledRegionSelector0 = 22;
                              break L0;
                            } else {
                              stackOut_68_0 = -50;
                              stackIn_69_0 = stackOut_68_0;
                              decompiledRegionSelector0 = 13;
                              break L0;
                            }
                          } else {
                            stackOut_65_0 = 350;
                            stackIn_66_0 = stackOut_65_0;
                            decompiledRegionSelector0 = 12;
                            break L0;
                          }
                        }
                      }
                    } else {
                      if (ni.b(82)) {
                        stackOut_44_0 = 320 + (800 * param1 + -1200) / 5;
                        stackIn_45_0 = stackOut_44_0;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        stackOut_42_0 = (-800 + 800 * param1) / 5 + 320;
                        stackIn_43_0 = stackOut_42_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackOut_20_0 = 195;
                  stackIn_21_0 = stackOut_20_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackOut_17_0 = 195;
                stackIn_18_0 = stackOut_17_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.JB(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_32_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_37_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_43_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_45_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_51_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_53_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_61_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_63_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_66_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_69_0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_81_0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_87_0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_95_0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_103_0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_111_0;
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return stackIn_124_0;
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return stackIn_126_0;
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return stackIn_128_0;
                                                  } else {
                                                    return stackIn_130_0;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final int c(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_67_0 = 0;
        try {
          L0: {
            L1: {
              if (-18 != (this.field_c ^ -1)) {
                break L1;
              } else {
                if ((param1 ^ -1) > (uc.field_e[this.field_c].length + -4 ^ -1)) {
                  stackOut_6_0 = 25;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (this.a(-2)) {
              stackOut_11_0 = 25;
              stackIn_12_0 = stackOut_11_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if (this.field_c != 0) {
                  break L2;
                } else {
                  if ((uc.field_e[this.field_c][param1] ^ -1) != -35) {
                    break L2;
                  } else {
                    stackOut_17_0 = 65;
                    stackIn_18_0 = stackOut_17_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              L3: {
                if (param0 == 25) {
                  break L3;
                } else {
                  ji.h((byte) -119);
                  break L3;
                }
              }
              L4: {
                if (this.field_c != 19) {
                  break L4;
                } else {
                  if ((uc.field_e[this.field_c][param1] ^ -1) != -39) {
                    break L4;
                  } else {
                    stackOut_26_0 = 24;
                    stackIn_27_0 = stackOut_26_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
              L5: {
                if (this.field_c != 20) {
                  break L5;
                } else {
                  L6: {
                    var3_int = uc.field_e[this.field_c][param1];
                    if (25 == var3_int) {
                      break L6;
                    } else {
                      L7: {
                        if (var3_int != 26) {
                          break L7;
                        } else {
                          if (SteelSentinels.field_G == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (var3_int == 39) {
                        stackOut_43_0 = 26;
                        stackIn_44_0 = stackOut_43_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        break L5;
                      }
                    }
                  }
                  stackOut_41_0 = 24;
                  stackIn_42_0 = stackOut_41_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
              L8: {
                if (this.field_c != 5) {
                  break L8;
                } else {
                  if (ni.b(87)) {
                    break L8;
                  } else {
                    if ((param1 ^ -1) > -4) {
                      stackOut_54_0 = 25;
                      stackIn_55_0 = stackOut_54_0;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              L9: {
                if (this.field_c != 6) {
                  break L9;
                } else {
                  if (ni.b(param0 ^ 127)) {
                    break L9;
                  } else {
                    if (param1 < 2) {
                      stackOut_65_0 = 25;
                      stackIn_66_0 = stackOut_65_0;
                      decompiledRegionSelector0 = 7;
                      break L0;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              stackOut_67_0 = 30;
              stackIn_68_0 = stackOut_67_0;
              decompiledRegionSelector0 = 8;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_42_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_44_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_55_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_66_0;
                      } else {
                        return stackIn_68_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static nk a(int[] param0, byte param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        nk stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        nk stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var3_int = 54 % ((49 - param1) / 47);
            stackOut_0_0 = hj.a(-24809, true, param2, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("ji.WA(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_1_0;
    }

    private final void a(int param0, boolean param1) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[][] var11_ref_int____ = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var12_ref_int____ = null;
        int[] var13 = null;
        int var13_int = 0;
        wk var13_ref = null;
        int var14_int = 0;
        int[] var14 = null;
        wk var14_ref = null;
        int[] var15_ref_int__ = null;
        int var15 = 0;
        int var16 = 0;
        int[] var16_ref_int__ = null;
        String var16_ref_String = null;
        int var17 = 0;
        int[] var17_ref_int__ = null;
        int var18 = 0;
        int var19_int = 0;
        String var19 = null;
        wk var20_ref_wk = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_53_0 = 0;
        boolean stackIn_56_0 = false;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        boolean stackIn_75_0 = false;
        int stackIn_82_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        int stackIn_138_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_226_0 = 0;
        String stackIn_233_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_49_0 = null;
        int[] stackOut_47_0 = null;
        int stackOut_52_0 = 0;
        boolean stackOut_55_0 = false;
        int stackOut_63_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_71_0 = 0;
        boolean stackOut_74_0 = false;
        int stackOut_81_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_134_0 = 0;
        int stackOut_134_1 = 0;
        int stackOut_137_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_225_0 = 0;
        String stackOut_232_0 = null;
        String stackOut_230_0 = null;
        var24 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              pb.h(30, 70, 580, 350, 5789784);
              pb.h(34, 74, 60, 342, 930889);
              pb.h(546, 74, 60, 342, 930889);
              pb.h(98, 74, 61, 23, 930889);
              pb.h(481, 74, 61, 23, 930889);
              var3_int = 930889;
              var4 = q.field_i;
              q.field_i = 0;
              if (hd.field_i > 0) {
                L2: {
                  if (oh.field_f < 98) {
                    break L2;
                  } else {
                    if ((oh.field_f ^ -1) <= -160) {
                      break L2;
                    } else {
                      if (74 > pi.field_c) {
                        break L2;
                      } else {
                        if ((pi.field_c ^ -1) <= -98) {
                          break L2;
                        } else {
                          var3_int = 0;
                          jm.a(73, 24, wc.field_d, 1, 98, 61);
                          q.field_i = -1;
                          if (var24 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                var3_int = 1146810;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              var5 = 930889;
              if (hd.field_i >= -1 + dh.field_C.length) {
                break L3;
              } else {
                L4: {
                  if (oh.field_f < 481) {
                    break L4;
                  } else {
                    if (542 <= oh.field_f) {
                      break L4;
                    } else {
                      if (74 > pi.field_c) {
                        break L4;
                      } else {
                        if (97 <= pi.field_c) {
                          break L4;
                        } else {
                          var5 = 0;
                          jm.a(73, 24, wc.field_d, param0 + -47, 481, 61);
                          q.field_i = 1;
                          if (var24 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                var5 = 1146810;
                break L3;
              }
            }
            L5: {
              if (var4 == q.field_i) {
                break L5;
              } else {
                if ((q.field_i ^ -1) == -1) {
                  break L5;
                } else {
                  ee.c(-2483, 97);
                  break L5;
                }
              }
            }
            el.field_Ub.c((61 - el.field_Ub.field_A) / 2 + 98, 74 - -((-el.field_Ub.field_F + 23) / 2), var3_int);
            gm.field_b.c(481 + (-gm.field_b.field_A + 61) / 2, 74 + (-gm.field_b.field_F + 23) / 2, var5);
            if (param0 == 48) {
              pb.h(163, 74, 314, 23, 930889);
              pl.field_U.a(db.a(am.field_e, -63, new String[]{Integer.toString(1 + hd.field_i), Integer.toString(dh.field_C.length)}), 320, 74 - -((pl.field_U.field_U + 23) / 2), 1021128, -1);
              pb.h(98, 101, 444, 154, 5789784);
              pb.d(262, 259, 157, 930889);
              pb.h(98, 259, 444, 157, 1130327);
              pb.h(266, 263, 272, 23, 1130327);
              pb.h(266, 290, 272, 122, 2697513);
              var6 = 78;
              var7 = 0;
              L6: while (true) {
                L7: {
                  L8: {
                    if (-17 >= (var7 ^ -1)) {
                      break L8;
                    } else {
                      pb.h(37, var6, 54, 18, 2697513);
                      pb.h(549, var6, 54, 18, 2697513);
                      var6 += 21;
                      var7++;
                      if (var24 != 0) {
                        break L7;
                      } else {
                        if (var24 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  var7 = 120;
                  break L7;
                }
                L9: {
                  var8 = 106;
                  ao.field_C = -1;
                  if (param1) {
                    stackOut_49_0 = ce.field_t;
                    stackIn_50_0 = stackOut_49_0;
                    break L9;
                  } else {
                    stackOut_47_0 = ge.field_m;
                    stackIn_50_0 = stackOut_47_0;
                    break L9;
                  }
                }
                var9 = stackIn_50_0;
                var10 = 0;
                var11_ref_int____ = dh.field_C[hd.field_i];
                var12 = 0;
                L10: while (true) {
                  L11: {
                    L12: {
                      if (var11_ref_int____.length <= var12) {
                        break L12;
                      } else {
                        var13 = var11_ref_int____[var12];
                        var14_int = 0;
                        var15_ref_int__ = var13;
                        stackOut_52_0 = 0;
                        stackIn_69_0 = stackOut_52_0;
                        stackIn_53_0 = stackOut_52_0;
                        if (var24 != 0) {
                          break L11;
                        } else {
                          var16 = stackIn_53_0;
                          L13: while (true) {
                            L14: {
                              L15: {
                                if ((var15_ref_int__.length ^ -1) >= (var16 ^ -1)) {
                                  break L15;
                                } else {
                                  var17 = var15_ref_int__[var16];
                                  stackOut_55_0 = this.f(var17, 111);
                                  stackIn_64_0 = stackOut_55_0 ? 1 : 0;
                                  stackIn_56_0 = stackOut_55_0;
                                  if (var24 != 0) {
                                    break L14;
                                  } else {
                                    L16: {
                                      if (!stackIn_56_0) {
                                        break L16;
                                      } else {
                                        var14_int = 1;
                                        if (var24 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    var16++;
                                    if (var24 == 0) {
                                      continue L13;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                              stackOut_63_0 = var14_int;
                              stackIn_64_0 = stackOut_63_0;
                              break L14;
                            }
                            L17: {
                              if (stackIn_64_0 != 0) {
                                var10++;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            var12++;
                            if (var24 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                    }
                    stackOut_68_0 = (-(var10 * 30) + 154) / (1 + var10) - -30;
                    stackIn_69_0 = stackOut_68_0;
                    break L11;
                  }
                  var11 = stackIn_69_0;
                  var8 = var11 + 101 - 30;
                  var12_ref_int____ = dh.field_C[hd.field_i];
                  var13_int = 0;
                  L18: while (true) {
                    L19: {
                      L20: {
                        if (var13_int >= var12_ref_int____.length) {
                          break L20;
                        } else {
                          var14 = var12_ref_int____[var13_int];
                          var15 = 0;
                          var16_ref_int__ = var14;
                          stackOut_71_0 = 0;
                          stackIn_138_0 = stackOut_71_0;
                          stackIn_72_0 = stackOut_71_0;
                          if (var24 != 0) {
                            break L19;
                          } else {
                            var17 = stackIn_72_0;
                            L21: while (true) {
                              L22: {
                                L23: {
                                  if ((var16_ref_int__.length ^ -1) >= (var17 ^ -1)) {
                                    break L23;
                                  } else {
                                    var18 = var16_ref_int__[var17];
                                    stackOut_74_0 = this.f(var18, 111);
                                    stackIn_82_0 = stackOut_74_0 ? 1 : 0;
                                    stackIn_75_0 = stackOut_74_0;
                                    if (var24 != 0) {
                                      break L22;
                                    } else {
                                      L24: {
                                        if (stackIn_75_0) {
                                          var15++;
                                          break L24;
                                        } else {
                                          break L24;
                                        }
                                      }
                                      var17++;
                                      if (var24 == 0) {
                                        continue L21;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                }
                                stackOut_81_0 = 0;
                                stackIn_82_0 = stackOut_81_0;
                                break L22;
                              }
                              L25: {
                                if (stackIn_82_0 == var15) {
                                  break L25;
                                } else {
                                  var16 = (-(var15 * 30) + 444) / (var15 + 1) - -30;
                                  var7 = var16 + 98 + -30;
                                  var17_ref_int__ = var14;
                                  var18 = 0;
                                  L26: while (true) {
                                    L27: {
                                      L28: {
                                        if (var17_ref_int__.length <= var18) {
                                          break L28;
                                        } else {
                                          var19_int = var17_ref_int__[var18];
                                          stackOut_85_0 = oh.field_f ^ -1;
                                          stackOut_85_1 = var7 ^ -1;
                                          stackIn_135_0 = stackOut_85_0;
                                          stackIn_135_1 = stackOut_85_1;
                                          stackIn_86_0 = stackOut_85_0;
                                          stackIn_86_1 = stackOut_85_1;
                                          if (var24 != 0) {
                                            break L27;
                                          } else {
                                            L29: {
                                              if (stackIn_86_0 > stackIn_86_1) {
                                                break L29;
                                              } else {
                                                if ((30 + var7 ^ -1) >= (oh.field_f ^ -1)) {
                                                  break L29;
                                                } else {
                                                  if ((pi.field_c ^ -1) > (var8 ^ -1)) {
                                                    break L29;
                                                  } else {
                                                    if ((pi.field_c ^ -1) > (30 + var8 ^ -1)) {
                                                      ao.field_C = var19_int;
                                                      break L29;
                                                    } else {
                                                      break L29;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            L30: {
                                              L31: {
                                                var20_ref_wk = ff.field_tb;
                                                if (!ve.a(var9, 1, var19_int)) {
                                                  break L31;
                                                } else {
                                                  var20_ref_wk = od.field_c[var19_int];
                                                  if (var24 == 0) {
                                                    break L30;
                                                  } else {
                                                    break L31;
                                                  }
                                                }
                                              }
                                              if (ve.a(ao.field_A, 1, var19_int)) {
                                                var20_ref_wk = null;
                                                break L30;
                                              } else {
                                                if (!ve.a(ao.field_E, param0 ^ 49, var19_int)) {
                                                  break L30;
                                                } else {
                                                  L32: {
                                                    if (ni.b(72)) {
                                                      break L32;
                                                    } else {
                                                      if (rd.field_b > 0) {
                                                        break L30;
                                                      } else {
                                                        break L32;
                                                      }
                                                    }
                                                  }
                                                  var20_ref_wk = null;
                                                  break L30;
                                                }
                                              }
                                            }
                                            L33: {
                                              L34: {
                                                if (var20_ref_wk != null) {
                                                  break L34;
                                                } else {
                                                  if ((ao.field_C ^ -1) == (var19_int ^ -1)) {
                                                    ao.field_C = -1;
                                                    if (var24 == 0) {
                                                      break L33;
                                                    } else {
                                                      break L34;
                                                    }
                                                  } else {
                                                    break L33;
                                                  }
                                                }
                                              }
                                              L35: {
                                                L36: {
                                                  var21 = 0;
                                                  if (in.field_k == var19_int) {
                                                    break L36;
                                                  } else {
                                                    if ((var19_int ^ -1) == (ao.field_C ^ -1)) {
                                                      var21 = 2;
                                                      if (var24 == 0) {
                                                        break L35;
                                                      } else {
                                                        break L36;
                                                      }
                                                    } else {
                                                      break L35;
                                                    }
                                                  }
                                                }
                                                var21 = 4;
                                                break L35;
                                              }
                                              var20_ref_wk.d(var7 - -var21, var8 - var21);
                                              var7 = var7 + var16;
                                              break L33;
                                            }
                                            var18++;
                                            if (var24 == 0) {
                                              continue L26;
                                            } else {
                                              break L28;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_134_0 = var8;
                                      stackOut_134_1 = var11;
                                      stackIn_135_0 = stackOut_134_0;
                                      stackIn_135_1 = stackOut_134_1;
                                      break L27;
                                    }
                                    var8 = stackIn_135_0 + stackIn_135_1;
                                    break L25;
                                  }
                                }
                              }
                              var13_int++;
                              if (var24 == 0) {
                                continue L18;
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                      }
                      stackOut_137_0 = in.field_k;
                      stackIn_138_0 = stackOut_137_0;
                      break L19;
                    }
                    L37: {
                      if (stackIn_138_0 != -1) {
                        stackOut_141_0 = in.field_k;
                        stackIn_142_0 = stackOut_141_0;
                        break L37;
                      } else {
                        stackOut_139_0 = ao.field_C;
                        stackIn_142_0 = stackOut_139_0;
                        break L37;
                      }
                    }
                    L38: {
                      L39: {
                        var12 = stackIn_142_0;
                        if ((var12 ^ -1) == 0) {
                          break L39;
                        } else {
                          L40: {
                            L41: {
                              var13_int = 402;
                              var14_int = (23 - -ui.field_U.field_U) / 2 + 263;
                              ui.field_U.a(ke.a(42, jg.field_t[var12]), var13_int, var14_int, 1021128, -1);
                              var14_int = 306;
                              var15 = ve.a(var9, param0 + -47, var12) ? 1 : 0;
                              if (var15 != 0) {
                                break L41;
                              } else {
                                pl.field_U.a(ol.field_Zb, var13_int, var14_int, 8421504, -1);
                                if (var24 == 0) {
                                  break L40;
                                } else {
                                  break L41;
                                }
                              }
                            }
                            pl.field_U.a(sf.field_p, var13_int, var14_int, 16777215, -1);
                            break L40;
                          }
                          L42: {
                            L43: {
                              if (var15 == 0) {
                                break L43;
                              } else {
                                od.field_c[var12].a(120, 277);
                                if (var24 == 0) {
                                  break L42;
                                } else {
                                  break L43;
                                }
                              }
                            }
                            ff.field_tb.a(120, 277);
                            break L42;
                          }
                          L44: {
                            L45: {
                              L46: {
                                if (var15 != 0) {
                                  break L46;
                                } else {
                                  if (ve.a(ao.field_B, param0 + -47, var12)) {
                                    break L45;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              L47: {
                                L48: {
                                  var16_ref_String = oe.field_a[var12].toUpperCase();
                                  var17 = 330;
                                  var18 = var17 + fk.field_d.a(var16_ref_String, 252, 0);
                                  if ((var18 ^ -1) < -383) {
                                    break L48;
                                  } else {
                                    if (362 >= var18) {
                                      break L47;
                                    } else {
                                      var17 -= 8;
                                      if (var24 == 0) {
                                        break L47;
                                      } else {
                                        break L48;
                                      }
                                    }
                                  }
                                }
                                var17 -= 18;
                                break L47;
                              }
                              L49: {
                                var13_int = 276;
                                var14_int = 392;
                                discarded$3 = fk.field_d.a(var16_ref_String, 276, var17, 252, 122, 1021128, -1, 1, 0, 0);
                                if (-383 > (var18 ^ -1)) {
                                  var14_int += 10;
                                  break L49;
                                } else {
                                  break L49;
                                }
                              }
                              L50: {
                                L51: {
                                  L52: {
                                    fk.field_d.b(ke.a(param0 + -6, sh.field_c + "<col=ffffff>" + 100 * wb.field_h[var12] + "</col>"), 276, var14_int, 1021128, -1);
                                    var13_int += 130;
                                    var19_int = 528 - bc.field_sb.field_A;
                                    var20 = -bc.field_sb.field_F + 10 + var14_int;
                                    if (-11 != (wb.field_h[var12] ^ -1)) {
                                      break L52;
                                    } else {
                                      var20 -= 10;
                                      var21 = 0;
                                      L53: while (true) {
                                        L54: {
                                          if (5 <= var21) {
                                            break L54;
                                          } else {
                                            bc.field_sb.a(var19_int, var20);
                                            bc.field_sb.a(var19_int, var20 - -20);
                                            var19_int = var19_int - bc.field_sb.field_A / 3;
                                            var21++;
                                            if (var24 != 0) {
                                              break L50;
                                            } else {
                                              if (var24 == 0) {
                                                continue L53;
                                              } else {
                                                break L54;
                                              }
                                            }
                                          }
                                        }
                                        if (var24 == 0) {
                                          break L51;
                                        } else {
                                          break L52;
                                        }
                                      }
                                    }
                                  }
                                  var21 = 0;
                                  L55: while (true) {
                                    if ((var21 ^ -1) <= (wb.field_h[var12] ^ -1)) {
                                      break L51;
                                    } else {
                                      bc.field_sb.a(var19_int, var20);
                                      var19_int = var19_int - bc.field_sb.field_A / 3;
                                      var21++;
                                      if (var24 != 0) {
                                        break L50;
                                      } else {
                                        if (var24 == 0) {
                                          continue L55;
                                        } else {
                                          break L51;
                                        }
                                      }
                                    }
                                  }
                                }
                                fk.field_d.c(ke.a(42, v.field_d), bc.field_sb.field_A / 3 + var19_int, var14_int, 1021128, -1);
                                break L50;
                              }
                              if (var24 == 0) {
                                break L44;
                              } else {
                                break L45;
                              }
                            }
                            discarded$4 = pl.field_U.a(gj.field_c, 276, 345, 252, 122, 1021128, -1, 1, 0, 0);
                            break L44;
                          }
                          if (var24 == 0) {
                            break L38;
                          } else {
                            break L39;
                          }
                        }
                      }
                      discarded$5 = pl.field_U.a(na.field_q, 276, 300, 252, 102, 1021128, -1, 1, 1, 0);
                      break L38;
                    }
                    L56: {
                      L57: {
                        if (ee.field_S != null) {
                          var13_ref = uh.field_k;
                          var14_ref = var13_ref.a();
                          var15 = 38;
                          var6 = 79;
                          var16 = 0;
                          L58: while (true) {
                            if (32 <= var16) {
                              break L57;
                            } else {
                              if (var24 != 0) {
                                break L56;
                              } else {
                                L59: {
                                  if ((var16 ^ -1) <= (ee.field_S.length ^ -1)) {
                                    break L59;
                                  } else {
                                    if (-1 > (ee.field_S[var16] ^ -1)) {
                                      L60: {
                                        L61: {
                                          if (-321 >= (var15 ^ -1)) {
                                            break L61;
                                          } else {
                                            var14_ref.a(-1 + var15, -1 + var6);
                                            if (var24 == 0) {
                                              break L60;
                                            } else {
                                              break L61;
                                            }
                                          }
                                        }
                                        var13_ref.a(var15, var6 - 1);
                                        break L60;
                                      }
                                      L62: {
                                        L63: {
                                          pd.field_Z[var16].a(var15, var6 - 1);
                                          if ((var15 ^ -1) < (oh.field_f ^ -1)) {
                                            break L63;
                                          } else {
                                            if ((28 + var15 ^ -1) >= (oh.field_f ^ -1)) {
                                              break L63;
                                            } else {
                                              if ((pi.field_c ^ -1) > (var6 ^ -1)) {
                                                break L63;
                                              } else {
                                                if (18 + var6 <= pi.field_c) {
                                                  break L63;
                                                } else {
                                                  stackOut_223_0 = 1;
                                                  stackIn_226_0 = stackOut_223_0;
                                                  break L62;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackOut_225_0 = 0;
                                        stackIn_226_0 = stackOut_225_0;
                                        break L62;
                                      }
                                      L64: {
                                        var17 = stackIn_226_0;
                                        var18 = ee.field_S[var16];
                                        if (-1 <= (var18 ^ -1)) {
                                          break L64;
                                        } else {
                                          L65: {
                                            if (var18 < 250) {
                                              stackOut_232_0 = Integer.toString(var18);
                                              stackIn_233_0 = stackOut_232_0;
                                              break L65;
                                            } else {
                                              stackOut_230_0 = ll.field_m;
                                              stackIn_233_0 = stackOut_230_0;
                                              break L65;
                                            }
                                          }
                                          L66: {
                                            var19 = stackIn_233_0;
                                            var20 = 24736 + Math.min(var18, 255) / 6 * 262657;
                                            if ((var18 ^ -1) > -251) {
                                              break L66;
                                            } else {
                                              var20 = 16777215;
                                              break L66;
                                            }
                                          }
                                          L67: {
                                            if (var15 >= 320) {
                                              break L67;
                                            } else {
                                              fk.field_d.c(var19, 88, var6 - -12, var20, -1);
                                              if (var24 == 0) {
                                                break L64;
                                              } else {
                                                break L67;
                                              }
                                            }
                                          }
                                          fk.field_d.b(var19, 553, 12 + var6, var20, -1);
                                          break L64;
                                        }
                                      }
                                      L68: {
                                        if (var17 == 0) {
                                          break L68;
                                        } else {
                                          L69: {
                                            L70: {
                                              var19 = bj.field_l[var16 * 2];
                                              var20 = 8 + fk.field_d.c(var19);
                                              var21 = -(var20 / 2) + var15 + 8;
                                              if ((var15 ^ -1) > -321) {
                                                break L70;
                                              } else {
                                                var21 = Math.min(var21, -var20 + 630);
                                                if (var24 == 0) {
                                                  break L69;
                                                } else {
                                                  break L70;
                                                }
                                              }
                                            }
                                            var21 = Math.max(var21, 10);
                                            break L69;
                                          }
                                          var22 = 15;
                                          var23 = var6 + -var22;
                                          pb.h(var21, var23, var20, var22, 16777215, 192);
                                          pb.c(var21, var23, var20, var22, 0, 192);
                                          fk.field_d.b(var19, 4 + var21, 11 + var23, 16777215, -1);
                                          break L68;
                                        }
                                      }
                                      L71: {
                                        if (-321 >= (var15 ^ -1)) {
                                          break L71;
                                        } else {
                                          var15 = 575;
                                          if (var24 == 0) {
                                            break L59;
                                          } else {
                                            break L71;
                                          }
                                        }
                                      }
                                      var6 += 21;
                                      var15 = 38;
                                      break L59;
                                    } else {
                                      break L59;
                                    }
                                  }
                                }
                                var16++;
                                if (var24 == 0) {
                                  continue L58;
                                } else {
                                  break L57;
                                }
                              }
                            }
                          }
                        } else {
                          break L57;
                        }
                      }
                      break L56;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.L(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((uc.field_e[this.field_c].length ^ -1) >= (var4_int ^ -1)) {
                    break L3;
                  } else {
                    var5 = this.b(var4_int, (byte) -106);
                    stackOut_3_0 = this.e(var4_int, 20);
                    stackIn_23_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (!stackIn_4_0) {
                          break L4;
                        } else {
                          if ((param0 ^ -1) > (this.g(126, var4_int) ^ -1)) {
                            break L4;
                          } else {
                            if ((param0 ^ -1) <= (this.a(var4_int, (byte) 121) ^ -1)) {
                              break L4;
                            } else {
                              if ((var5 ^ -1) < (param1 ^ -1)) {
                                break L4;
                              } else {
                                if (param1 >= this.c(25, var4_int) + var5) {
                                  break L4;
                                } else {
                                  stackOut_19_0 = var4_int;
                                  stackIn_20_0 = stackOut_19_0;
                                  decompiledRegionSelector0 = 0;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      }
                      var4_int++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_22_0 = param2;
                stackIn_23_0 = stackOut_22_0;
                break L2;
              }
              L5: {
                if (stackIn_23_0 > 68) {
                  break L5;
                } else {
                  ji.a((String) null, -71);
                  break L5;
                }
              }
              stackOut_26_0 = -1;
              stackIn_27_0 = stackOut_26_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.DA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0;
        } else {
          return stackIn_27_0;
        }
    }

    private final int g(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_123_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_2_0 = 0;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            if (7 != this.field_c) {
              L1: {
                var3 = 76 % ((80 - param0) / 42);
                var2_int = this.field_g.field_e;
                var4 = this.b(-78, var2_int);
                if ((var2_int ^ -1) > -1) {
                  break L1;
                } else {
                  if (uc.field_e[this.field_c].length <= var2_int) {
                    break L1;
                  } else {
                    if (0 != (uc.field_e[this.field_c][var2_int] ^ -1)) {
                      L2: {
                        if (this.field_c == 20) {
                          L3: {
                            if (0 > var2_int) {
                              break L3;
                            } else {
                              if (2 <= var2_int) {
                                break L3;
                              } else {
                                stackOut_33_0 = 2;
                                stackIn_34_0 = stackOut_33_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                          if (-1 < (var4 ^ -1)) {
                            break L2;
                          } else {
                            if (!this.a(117, 0)) {
                              stackOut_41_0 = 1;
                              stackIn_42_0 = stackOut_41_0;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              stackOut_39_0 = 0;
                              stackIn_40_0 = stackOut_39_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        } else {
                          break L2;
                        }
                      }
                      if (this.field_c == 0) {
                        if ((uc.field_e[this.field_c][var2_int] ^ -1) == -35) {
                          stackOut_49_0 = var2_int;
                          stackIn_50_0 = stackOut_49_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          L4: {
                            if (uc.field_e[this.field_c][var2_int] == 19) {
                              break L4;
                            } else {
                              if ((var2_int - -1 ^ -1) <= (uc.field_e[this.field_c].length ^ -1)) {
                                break L4;
                              } else {
                                stackOut_59_0 = 1 + var2_int;
                                stackIn_60_0 = stackOut_59_0;
                                decompiledRegionSelector0 = 8;
                                break L0;
                              }
                            }
                          }
                          stackOut_57_0 = 0;
                          stackIn_58_0 = stackOut_57_0;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        }
                      } else {
                        if (-18 == (this.field_c ^ -1)) {
                          if (var2_int != -5 + uc.field_e[this.field_c].length) {
                            if (-5 + uc.field_e[this.field_c].length > var2_int) {
                              stackOut_70_0 = 1 + var2_int;
                              stackIn_71_0 = stackOut_70_0;
                              decompiledRegionSelector0 = 10;
                              break L0;
                            } else {
                              stackOut_72_0 = 0;
                              stackIn_73_0 = stackOut_72_0;
                              decompiledRegionSelector0 = 11;
                              break L0;
                            }
                          } else {
                            stackOut_65_0 = -1 + uc.field_e[this.field_c].length;
                            stackIn_66_0 = stackOut_65_0;
                            decompiledRegionSelector0 = 9;
                            break L0;
                          }
                        } else {
                          L5: {
                            if (this.field_c != 5) {
                              break L5;
                            } else {
                              if (0 != (var4 ^ -1)) {
                                break L5;
                              } else {
                                if (0 == var2_int) {
                                  stackOut_83_0 = 3;
                                  stackIn_84_0 = stackOut_83_0;
                                  decompiledRegionSelector0 = 12;
                                  break L0;
                                } else {
                                  if ((var2_int ^ -1) != -2) {
                                    if ((var2_int ^ -1) == -3) {
                                      stackOut_91_0 = 6;
                                      stackIn_92_0 = stackOut_91_0;
                                      decompiledRegionSelector0 = 14;
                                      break L0;
                                    } else {
                                      break L5;
                                    }
                                  } else {
                                    stackOut_86_0 = 4;
                                    stackIn_87_0 = stackOut_86_0;
                                    decompiledRegionSelector0 = 13;
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                          L6: {
                            if ((this.field_c ^ -1) != -7) {
                              break L6;
                            } else {
                              if (0 != (var4 ^ -1)) {
                                break L6;
                              } else {
                                if (-1 == (var2_int ^ -1)) {
                                  stackOut_102_0 = 2;
                                  stackIn_103_0 = stackOut_102_0;
                                  decompiledRegionSelector0 = 15;
                                  break L0;
                                } else {
                                  if (-2 != (var2_int ^ -1)) {
                                    break L6;
                                  } else {
                                    stackOut_105_0 = 5;
                                    stackIn_106_0 = stackOut_105_0;
                                    decompiledRegionSelector0 = 16;
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                          L7: {
                            if (19 == this.field_c) {
                              if ((var4 ^ -1) > -1) {
                                L8: {
                                  if (fa.field_c != uc.field_e[this.field_c]) {
                                    stackOut_116_0 = 20;
                                    stackIn_117_0 = stackOut_116_0;
                                    break L8;
                                  } else {
                                    stackOut_114_0 = 30;
                                    stackIn_117_0 = stackOut_114_0;
                                    break L8;
                                  }
                                }
                                var5 = stackIn_117_0;
                                if ((var2_int ^ -1) == (var5 + -1 ^ -1)) {
                                  stackOut_120_0 = -1 + uc.field_e[this.field_c].length;
                                  stackIn_121_0 = stackOut_120_0;
                                  decompiledRegionSelector0 = 18;
                                  break L0;
                                } else {
                                  break L7;
                                }
                              } else {
                                stackOut_111_0 = 0;
                                stackIn_112_0 = stackOut_111_0;
                                decompiledRegionSelector0 = 17;
                                break L0;
                              }
                            } else {
                              break L7;
                            }
                          }
                          stackOut_122_0 = -1;
                          stackIn_123_0 = stackOut_122_0;
                          decompiledRegionSelector0 = 19;
                          break L0;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var2_int = 0;
              L9: while (true) {
                L10: {
                  L11: {
                    if (var2_int >= uc.field_e[this.field_c].length) {
                      break L11;
                    } else {
                      stackOut_13_0 = 0;
                      stackOut_13_1 = uc.field_e[this.field_c][var2_int] ^ -1;
                      stackIn_21_0 = stackOut_13_0;
                      stackIn_21_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (var6 != 0) {
                        break L10;
                      } else {
                        if (stackIn_14_0 != stackIn_14_1) {
                          break L11;
                        } else {
                          var2_int++;
                          if (var6 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  stackOut_20_0 = uc.field_e[this.field_c].length;
                  stackOut_20_1 = var2_int;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L10;
                }
                if (stackIn_21_0 != stackIn_21_1) {
                  stackOut_24_0 = var2_int;
                  stackIn_25_0 = stackOut_24_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_22_0 = -1;
                  stackIn_23_0 = stackOut_22_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.EA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_34_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_40_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_42_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_50_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_58_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_60_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_66_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_71_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_73_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_84_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_87_0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_92_0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_103_0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_106_0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_112_0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_121_0;
                                            } else {
                                              return stackIn_123_0;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void m(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        fh var7 = null;
        String var8 = null;
        int var9_int = 0;
        String var9 = null;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_12_0 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_32_0 = 0;
        boolean stackIn_46_0 = false;
        int stackIn_53_0 = 0;
        String stackIn_106_0 = null;
        String stackIn_110_0 = null;
        boolean stackIn_117_0 = false;
        boolean stackIn_124_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_25_0 = false;
        int stackOut_31_0 = 0;
        boolean stackOut_45_0 = false;
        int stackOut_52_0 = 0;
        String stackOut_105_0 = null;
        String stackOut_103_0 = null;
        String stackOut_109_0 = null;
        String stackOut_107_0 = null;
        boolean stackOut_116_0 = false;
        boolean stackOut_123_0 = false;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = va.field_d;
            va.field_d = -1;
            pb.a(0, 50, 640, 430, 0);
            if (param0 > 112) {
              var3 = 100;
              var4 = 55;
              var5 = 200;
              var6 = 30;
              var7 = ff.field_lb;
              var8 = "";
              var9_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var9_int ^ -1) <= -4) {
                      break L3;
                    } else {
                      stackOut_5_0 = t.a(rn.field_D, n.field_z[var9_int], -20370);
                      stackIn_12_0 = stackOut_5_0 ? 1 : 0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var12 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (!stackIn_6_0) {
                            break L4;
                          } else {
                            var8 = var8 + ", " + cd.field_c[var9_int];
                            break L4;
                          }
                        }
                        var9_int++;
                        if (var12 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_11_0 = var8.length();
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                }
                L5: {
                  L6: {
                    if (stackIn_12_0 != 0) {
                      break L6;
                    } else {
                      var8 = "none";
                      if (var12 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var8 = var8.substring(2);
                  break L5;
                }
                L7: {
                  var4 = var4 + ((mi) ((Object) var7)).field_G;
                  var8 = "Currently unlocked: " + var8;
                  ((mi) ((Object) var7)).a(var8, 320, var4, 16777215, -1);
                  var4 += 5;
                  if (nm.a(var4, var3, 126, "Lock mechs 1,2,3", var6, var5)) {
                    va.field_d = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var3 = var3 + (var5 - -20);
                  if (nm.a(var4, var3, 124, "Unlock mechs 1,2,3", var6, var5)) {
                    va.field_d = 1;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var3 = var3 - (20 + var5);
                var8 = "";
                var4 = var4 + (var6 - -5);
                var9_int = 3;
                L9: while (true) {
                  L10: {
                    L11: {
                      if (var9_int >= 6) {
                        break L11;
                      } else {
                        stackOut_25_0 = t.a(rn.field_D, n.field_z[var9_int], -20370);
                        stackIn_32_0 = stackOut_25_0 ? 1 : 0;
                        stackIn_26_0 = stackOut_25_0;
                        if (var12 != 0) {
                          break L10;
                        } else {
                          L12: {
                            if (!stackIn_26_0) {
                              break L12;
                            } else {
                              var8 = var8 + ", " + cd.field_c[var9_int];
                              break L12;
                            }
                          }
                          var9_int++;
                          if (var12 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    stackOut_31_0 = -1;
                    stackIn_32_0 = stackOut_31_0;
                    break L10;
                  }
                  L13: {
                    L14: {
                      if (stackIn_32_0 != (var8.length() ^ -1)) {
                        break L14;
                      } else {
                        var8 = "none";
                        if (var12 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var8 = var8.substring(2);
                    break L13;
                  }
                  L15: {
                    var8 = "Currently unlocked: " + var8;
                    var4 = var4 + ((mi) ((Object) var7)).field_G;
                    ((mi) ((Object) var7)).a(var8, 320, var4, 16777215, -1);
                    var4 += 5;
                    if (nm.a(var4, var3, 116, "Lock mechs 4,5,6", var6, var5)) {
                      va.field_d = 2;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    var3 = var3 + (var5 - -20);
                    if (nm.a(var4, var3, 118, "Unlock mechs 4,5,6", var6, var5)) {
                      va.field_d = 3;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  var4 = var4 + (5 + var6);
                  var8 = "";
                  var3 = var3 - (20 + var5);
                  var9_int = 6;
                  L17: while (true) {
                    L18: {
                      L19: {
                        if (-13 >= (var9_int ^ -1)) {
                          break L19;
                        } else {
                          stackOut_45_0 = t.a(rn.field_D, n.field_z[var9_int], -20370);
                          stackIn_53_0 = stackOut_45_0 ? 1 : 0;
                          stackIn_46_0 = stackOut_45_0;
                          if (var12 != 0) {
                            break L18;
                          } else {
                            L20: {
                              if (stackIn_46_0) {
                                var8 = var8 + ", " + cd.field_c[var9_int];
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            var9_int++;
                            if (var12 == 0) {
                              continue L17;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                      stackOut_52_0 = 0;
                      stackIn_53_0 = stackOut_52_0;
                      break L18;
                    }
                    L21: {
                      L22: {
                        if (stackIn_53_0 == var8.length()) {
                          break L22;
                        } else {
                          var8 = var8.substring(2);
                          if (var12 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var8 = "none";
                      break L21;
                    }
                    L23: {
                      var4 = var4 + ((mi) ((Object) var7)).field_G;
                      var8 = "Currently unlocked: " + var8;
                      ((mi) ((Object) var7)).a(var8, 320, var4, 16777215, -1);
                      var4 += 5;
                      if (!nm.a(var4, var3, 116, "Lock mechs 7-12", var6, var5)) {
                        break L23;
                      } else {
                        va.field_d = 4;
                        break L23;
                      }
                    }
                    L24: {
                      var3 = var3 + (20 + var5);
                      if (!nm.a(var4, var3, 123, "Unlock mechs 7-12", var6, var5)) {
                        break L24;
                      } else {
                        va.field_d = 5;
                        break L24;
                      }
                    }
                    L25: {
                      var4 = var4 + (var6 + 5);
                      var3 = var3 - (20 + var5);
                      var4 = var4 + ((mi) ((Object) var7)).field_G;
                      ((mi) ((Object) var7)).a("Solarite: " + li.field_v, 320, var4, 16777215, -1);
                      var4 += 5;
                      if (nm.a(var4, var3, 127, "Revoke 100 Solarite", var6, var5)) {
                        va.field_d = 6;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      var3 = var3 + (var5 - -20);
                      if (!nm.a(var4, var3, 119, "Get 100 Solarite", var6, var5)) {
                        break L26;
                      } else {
                        va.field_d = 7;
                        break L26;
                      }
                    }
                    L27: {
                      var4 = var4 + (10 + var6);
                      var3 = var3 - (var5 - -20);
                      var4 = var4 + ((mi) ((Object) var7)).field_G;
                      ((mi) ((Object) var7)).a("Total items engineered: " + pc.e(126), 320, var4, 16777215, -1);
                      var4 += 5;
                      if (nm.a(var4, var3, 127, "Unengineer all", var6, var5)) {
                        va.field_d = 8;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L28: {
                      var3 = var3 + (20 + var5);
                      if (nm.a(var4, var3, 127, "Engineer all", var6, var5)) {
                        va.field_d = 9;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      var4 = var4 + (10 + var6);
                      var3 = 200;
                      var4 += 10;
                      var5 = 80;
                      var6 = 30;
                      ((mi) ((Object) var7)).b("COMPLETE CAMPAIGN:", 50, 20 + var4, 1021128, -1);
                      if (!nm.a(var4, var3, 124, "Training", var6, var5)) {
                        break L29;
                      } else {
                        va.field_d = 24;
                        break L29;
                      }
                    }
                    L30: {
                      ((mi) ((Object) var7)).a(Integer.toString(fm.field_f[0]), var5 / 2 + var3, var4 + -2, 16777215, -1);
                      var3 = var3 + (10 + var5);
                      if (!nm.a(var4, var3, 124, "Free", var6, var5)) {
                        break L30;
                      } else {
                        va.field_d = 25;
                        break L30;
                      }
                    }
                    L31: {
                      ((mi) ((Object) var7)).a(Integer.toString(fm.field_f[1]), var5 / 2 + var3, var4 - 2, 16777215, -1);
                      var3 = var3 + (10 + var5);
                      if (!nm.a(var4, var3, 117, "Member", var6, var5)) {
                        break L31;
                      } else {
                        va.field_d = 26;
                        break L31;
                      }
                    }
                    L32: {
                      ((mi) ((Object) var7)).a(Integer.toString(fm.field_f[2]), var5 / 2 + var3, -2 + var4, 16777215, -1);
                      var3 = 170;
                      var6 = 30;
                      var4 += 34;
                      var3 = 30;
                      var4 = var4 + (((mi) ((Object) var7)).field_G + 5);
                      ((mi) ((Object) var7)).b("SET STATE:", var3, 20 + var4, 1021128, -1);
                      var5 = 60;
                      var3 += 70;
                      if (nm.a(var4, var3, 120, "Noob", var6, var5)) {
                        va.field_d = 10;
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    L33: {
                      var3 = var3 + (10 + var5);
                      if (nm.a(var4, var3, 124, "Basic", var6, var5)) {
                        va.field_d = 11;
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    L34: {
                      var3 = var3 + (var5 - -10);
                      var5 = 90;
                      if (nm.a(var4, var3, 118, "Advanced", var6, var5)) {
                        va.field_d = 12;
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    L35: {
                      var3 = var3 + (var5 + 10);
                      var5 = 90;
                      if (nm.a(var4, var3, 122, "Mighty God", var6, var5)) {
                        va.field_d = 13;
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                    L36: {
                      var3 = var3 + (40 + var5);
                      var5 = 100;
                      if ((8 & dm.field_a) == 0) {
                        stackOut_105_0 = "Config tutorial <col=00ff00>pending</col>";
                        stackIn_106_0 = stackOut_105_0;
                        break L36;
                      } else {
                        stackOut_103_0 = "Config tutorial viewed";
                        stackIn_106_0 = stackOut_103_0;
                        break L36;
                      }
                    }
                    L37: {
                      var9 = stackIn_106_0;
                      ((mi) ((Object) var7)).b(var9, -10 + var3, -3 + var4, 16777215, -1);
                      if ((dm.field_a & 8 ^ -1) == -1) {
                        stackOut_109_0 = "Skip";
                        stackIn_110_0 = stackOut_109_0;
                        break L37;
                      } else {
                        stackOut_107_0 = "Reset";
                        stackIn_110_0 = stackOut_107_0;
                        break L37;
                      }
                    }
                    L38: {
                      var10 = stackIn_110_0;
                      if (nm.a(var4, var3, 125, var10, var6, var5)) {
                        va.field_d = 16;
                        break L38;
                      } else {
                        break L38;
                      }
                    }
                    var4 += 46;
                    ((mi) ((Object) var7)).a("MUSIC", 122, -3 + var4, 1021128, -1);
                    var3 = 20;
                    var5 = 30;
                    var11 = 0;
                    L39: while (true) {
                      L40: {
                        L41: {
                          if (-6 > (var11 ^ -1)) {
                            break L41;
                          } else {
                            stackOut_116_0 = nm.a(var4, var3, 127, "" + var11, var6, var5);
                            stackIn_124_0 = stackOut_116_0;
                            stackIn_117_0 = stackOut_116_0;
                            if (var12 != 0) {
                              break L40;
                            } else {
                              L42: {
                                if (stackIn_117_0) {
                                  va.field_d = var11 + 17;
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                              var3 = var3 + (5 + var5);
                              var11++;
                              if (var12 == 0) {
                                continue L39;
                              } else {
                                break L41;
                              }
                            }
                          }
                        }
                        var6 = 30;
                        var5 = 100;
                        var3 = (-var5 + 640) / 2;
                        stackOut_123_0 = nm.a(var4, var3, 118, "MAIN MENU", var6, var5);
                        stackIn_124_0 = stackOut_123_0;
                        break L40;
                      }
                      L43: {
                        if (!stackIn_124_0) {
                          break L43;
                        } else {
                          va.field_d = 14;
                          break L43;
                        }
                      }
                      L44: {
                        L45: {
                          var3 = var3 + (var5 + 40);
                          var5 = 140;
                          if (!nm.a(var4, var3, 116, "Update server", var6, var5)) {
                            break L45;
                          } else {
                            va.field_d = 15;
                            if (var12 == 0) {
                              break L44;
                            } else {
                              break L45;
                            }
                          }
                        }
                        if (!jg.field_j) {
                          break L44;
                        } else {
                          if (0 != (a.field_c & 16)) {
                            break L44;
                          } else {
                            pb.h(var3, var4, var5, var6, 32896);
                            break L44;
                          }
                        }
                      }
                      L46: {
                        if (va.field_d == -1) {
                          break L46;
                        } else {
                          if ((var2_int ^ -1) == (va.field_d ^ -1)) {
                            break L46;
                          } else {
                            ee.c(-2483, 97);
                            break L46;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.FA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean b(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_d = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (-1 < (param2 ^ -1)) {
                break L2;
              } else {
                if (param2 < 10) {
                  L3: {
                    if (0 > param1) {
                      break L3;
                    } else {
                      if (param1 < 3) {
                        L4: {
                          if (-3 != (param1 ^ -1)) {
                            break L4;
                          } else {
                            if (-1 <= (rd.field_b ^ -1)) {
                              stackOut_21_0 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if ((param1 ^ -1) >= -1) {
                            break L5;
                          } else {
                            if (3 > fm.field_f[0]) {
                              stackOut_29_0 = 0;
                              stackIn_30_0 = stackOut_29_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if ((fm.field_f[param1] ^ -1) <= (param2 ^ -1)) {
                          stackOut_34_0 = 1;
                          stackIn_35_0 = stackOut_34_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackOut_32_0 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.SA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_30_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_33_0 != 0;
                } else {
                  return stackIn_35_0 != 0;
                }
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        boolean discarded$1 = false;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_243_0 = 0;
        String[] stackIn_244_0 = null;
        int stackIn_244_1 = 0;
        String[] stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        String[] stackIn_247_0 = null;
        int stackIn_247_1 = 0;
        String stackIn_247_2 = null;
        int stackIn_737_0 = 0;
        int stackIn_856_0 = 0;
        String[] stackIn_857_0 = null;
        int stackIn_857_1 = 0;
        String[] stackIn_859_0 = null;
        int stackIn_859_1 = 0;
        String[] stackIn_860_0 = null;
        int stackIn_860_1 = 0;
        String stackIn_860_2 = null;
        int stackIn_876_0 = 0;
        String[] stackIn_877_0 = null;
        int stackIn_877_1 = 0;
        String[] stackIn_879_0 = null;
        int stackIn_879_1 = 0;
        String[] stackIn_880_0 = null;
        int stackIn_880_1 = 0;
        String stackIn_880_2 = null;
        int stackIn_897_0 = 0;
        String[] stackIn_898_0 = null;
        int stackIn_898_1 = 0;
        String[] stackIn_900_0 = null;
        int stackIn_900_1 = 0;
        String[] stackIn_901_0 = null;
        int stackIn_901_1 = 0;
        String stackIn_901_2 = null;
        int stackIn_919_0 = 0;
        String[] stackIn_920_0 = null;
        int stackIn_920_1 = 0;
        String[] stackIn_922_0 = null;
        int stackIn_922_1 = 0;
        String[] stackIn_923_0 = null;
        int stackIn_923_1 = 0;
        String stackIn_923_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_242_0 = 0;
        int stackOut_240_0 = 0;
        String[] stackOut_243_0 = null;
        int stackOut_243_1 = 0;
        String[] stackOut_246_0 = null;
        int stackOut_246_1 = 0;
        String stackOut_246_2 = null;
        String[] stackOut_244_0 = null;
        int stackOut_244_1 = 0;
        String stackOut_244_2 = null;
        int stackOut_736_0 = 0;
        int stackOut_734_0 = 0;
        int stackOut_855_0 = 0;
        int stackOut_853_0 = 0;
        String[] stackOut_856_0 = null;
        int stackOut_856_1 = 0;
        String[] stackOut_859_0 = null;
        int stackOut_859_1 = 0;
        String stackOut_859_2 = null;
        String[] stackOut_857_0 = null;
        int stackOut_857_1 = 0;
        String stackOut_857_2 = null;
        int stackOut_875_0 = 0;
        int stackOut_873_0 = 0;
        String[] stackOut_876_0 = null;
        int stackOut_876_1 = 0;
        String[] stackOut_879_0 = null;
        int stackOut_879_1 = 0;
        String stackOut_879_2 = null;
        String[] stackOut_877_0 = null;
        int stackOut_877_1 = 0;
        String stackOut_877_2 = null;
        int stackOut_896_0 = 0;
        int stackOut_894_0 = 0;
        String[] stackOut_897_0 = null;
        int stackOut_897_1 = 0;
        String[] stackOut_900_0 = null;
        int stackOut_900_1 = 0;
        String stackOut_900_2 = null;
        String[] stackOut_898_0 = null;
        int stackOut_898_1 = 0;
        String stackOut_898_2 = null;
        int stackOut_918_0 = 0;
        int stackOut_916_0 = 0;
        String[] stackOut_919_0 = null;
        int stackOut_919_1 = 0;
        String[] stackOut_922_0 = null;
        int stackOut_922_1 = 0;
        String stackOut_922_2 = null;
        String[] stackOut_920_0 = null;
        int stackOut_920_1 = 0;
        String stackOut_920_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            if (this.field_c == 18) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = this.field_g.c(0) ? 1 : 0;
              var5 = uc.field_e[this.field_c][param1];
              if (param0 < -1) {
                L1: {
                  if ((var5 ^ -1) == 0) {
                    break L1;
                  } else {
                    if (!this.field_g.field_c) {
                      break L1;
                    } else {
                      if (this.a(121, param1)) {
                        ee.c(-2483, 97);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          L7: {
                            L8: {
                              L9: {
                                L10: {
                                  L11: {
                                    L12: {
                                      L13: {
                                        L14: {
                                          L15: {
                                            L16: {
                                              L17: {
                                                L18: {
                                                  L19: {
                                                    L20: {
                                                      L21: {
                                                        L22: {
                                                          L23: {
                                                            L24: {
                                                              L25: {
                                                                L26: {
                                                                  L27: {
                                                                    L28: {
                                                                      L29: {
                                                                        L30: {
                                                                          L31: {
                                                                            L32: {
                                                                              L33: {
                                                                                L34: {
                                                                                  L35: {
                                                                                    L36: {
                                                                                      L37: {
                                                                                        L38: {
                                                                                          L39: {
                                                                                            L40: {
                                                                                              L41: {
                                                                                                L42: {
                                                                                                  L43: {
                                                                                                    L44: {
                                                                                                      L45: {
                                                                                                        L46: {
                                                                                                          var6 = var5;
                                                                                                          if (-1 != var6) {
                                                                                                            break L46;
                                                                                                          } else {
                                                                                                            if (var10 == 0) {
                                                                                                              var4_int = 0;
                                                                                                              if (var10 == 0) {
                                                                                                                break L2;
                                                                                                              } else {
                                                                                                                break L45;
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L46;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        if (var6 == 38) {
                                                                                                          break L45;
                                                                                                        } else {
                                                                                                          if (-40 == (var6 ^ -1)) {
                                                                                                            break L44;
                                                                                                          } else {
                                                                                                            L47: {
                                                                                                              if ((var6 ^ -1) != -38) {
                                                                                                                break L47;
                                                                                                              } else {
                                                                                                                if (var10 == 0) {
                                                                                                                  break L43;
                                                                                                                } else {
                                                                                                                  break L47;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            if (-42 == (var6 ^ -1)) {
                                                                                                              break L42;
                                                                                                            } else {
                                                                                                              if (0 == var6) {
                                                                                                                break L41;
                                                                                                              } else {
                                                                                                                L48: {
                                                                                                                  if (var6 != 46) {
                                                                                                                    break L48;
                                                                                                                  } else {
                                                                                                                    if (var10 == 0) {
                                                                                                                      break L40;
                                                                                                                    } else {
                                                                                                                      break L48;
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                if (-34 == (var6 ^ -1)) {
                                                                                                                  break L39;
                                                                                                                } else {
                                                                                                                  if ((var6 ^ -1) == -2) {
                                                                                                                    break L38;
                                                                                                                  } else {
                                                                                                                    L49: {
                                                                                                                      if (var6 != 2) {
                                                                                                                        break L49;
                                                                                                                      } else {
                                                                                                                        if (var10 == 0) {
                                                                                                                          break L37;
                                                                                                                        } else {
                                                                                                                          break L49;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                    L50: {
                                                                                                                      if ((var6 ^ -1) != -8) {
                                                                                                                        break L50;
                                                                                                                      } else {
                                                                                                                        if (var10 == 0) {
                                                                                                                          break L36;
                                                                                                                        } else {
                                                                                                                          break L50;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                    L51: {
                                                                                                                      if (var6 != 24) {
                                                                                                                        break L51;
                                                                                                                      } else {
                                                                                                                        if (var10 == 0) {
                                                                                                                          break L35;
                                                                                                                        } else {
                                                                                                                          break L51;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                    L52: {
                                                                                                                      if (22 != var6) {
                                                                                                                        break L52;
                                                                                                                      } else {
                                                                                                                        if (var10 == 0) {
                                                                                                                          break L34;
                                                                                                                        } else {
                                                                                                                          break L52;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                    if ((var6 ^ -1) == -28) {
                                                                                                                      break L33;
                                                                                                                    } else {
                                                                                                                      L53: {
                                                                                                                        if (28 != var6) {
                                                                                                                          break L53;
                                                                                                                        } else {
                                                                                                                          if (var10 == 0) {
                                                                                                                            break L32;
                                                                                                                          } else {
                                                                                                                            break L53;
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                      if (-6 == (var6 ^ -1)) {
                                                                                                                        break L31;
                                                                                                                      } else {
                                                                                                                        if (8 == var6) {
                                                                                                                          break L30;
                                                                                                                        } else {
                                                                                                                          if (var6 == 4) {
                                                                                                                            break L29;
                                                                                                                          } else {
                                                                                                                            L54: {
                                                                                                                              if (var6 != 3) {
                                                                                                                                break L54;
                                                                                                                              } else {
                                                                                                                                if (var10 == 0) {
                                                                                                                                  break L28;
                                                                                                                                } else {
                                                                                                                                  break L54;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                            L55: {
                                                                                                                              if ((var6 ^ -1) != -21) {
                                                                                                                                break L55;
                                                                                                                              } else {
                                                                                                                                if (var10 == 0) {
                                                                                                                                  break L27;
                                                                                                                                } else {
                                                                                                                                  break L55;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                            L56: {
                                                                                                                              if (-22 != (var6 ^ -1)) {
                                                                                                                                break L56;
                                                                                                                              } else {
                                                                                                                                if (var10 == 0) {
                                                                                                                                  break L26;
                                                                                                                                } else {
                                                                                                                                  break L56;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                            if (6 == var6) {
                                                                                                                              break L25;
                                                                                                                            } else {
                                                                                                                              L57: {
                                                                                                                                if (-10 != (var6 ^ -1)) {
                                                                                                                                  break L57;
                                                                                                                                } else {
                                                                                                                                  if (var10 == 0) {
                                                                                                                                    break L24;
                                                                                                                                  } else {
                                                                                                                                    break L57;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              L58: {
                                                                                                                                if (10 != var6) {
                                                                                                                                  break L58;
                                                                                                                                } else {
                                                                                                                                  if (var10 == 0) {
                                                                                                                                    break L23;
                                                                                                                                  } else {
                                                                                                                                    break L58;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              if (-12 == (var6 ^ -1)) {
                                                                                                                                break L22;
                                                                                                                              } else {
                                                                                                                                L59: {
                                                                                                                                  if ((var6 ^ -1) != -13) {
                                                                                                                                    break L59;
                                                                                                                                  } else {
                                                                                                                                    if (var10 == 0) {
                                                                                                                                      break L21;
                                                                                                                                    } else {
                                                                                                                                      break L59;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                L60: {
                                                                                                                                  if (-14 != (var6 ^ -1)) {
                                                                                                                                    break L60;
                                                                                                                                  } else {
                                                                                                                                    if (var10 == 0) {
                                                                                                                                      break L20;
                                                                                                                                    } else {
                                                                                                                                      break L60;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                L61: {
                                                                                                                                  if (14 != var6) {
                                                                                                                                    break L61;
                                                                                                                                  } else {
                                                                                                                                    if (var10 == 0) {
                                                                                                                                      break L19;
                                                                                                                                    } else {
                                                                                                                                      break L61;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                L62: {
                                                                                                                                  if ((var6 ^ -1) != -16) {
                                                                                                                                    break L62;
                                                                                                                                  } else {
                                                                                                                                    if (var10 == 0) {
                                                                                                                                      break L18;
                                                                                                                                    } else {
                                                                                                                                      break L62;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                L63: {
                                                                                                                                  if (16 != var6) {
                                                                                                                                    break L63;
                                                                                                                                  } else {
                                                                                                                                    if (var10 == 0) {
                                                                                                                                      break L17;
                                                                                                                                    } else {
                                                                                                                                      break L63;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                L64: {
                                                                                                                                  if (17 != var6) {
                                                                                                                                    break L64;
                                                                                                                                  } else {
                                                                                                                                    if (var10 == 0) {
                                                                                                                                      break L16;
                                                                                                                                    } else {
                                                                                                                                      break L64;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                if (-19 == (var6 ^ -1)) {
                                                                                                                                  break L15;
                                                                                                                                } else {
                                                                                                                                  L65: {
                                                                                                                                    if (23 != var6) {
                                                                                                                                      break L65;
                                                                                                                                    } else {
                                                                                                                                      if (var10 == 0) {
                                                                                                                                        break L14;
                                                                                                                                      } else {
                                                                                                                                        break L65;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  if ((var6 ^ -1) == -26) {
                                                                                                                                    break L13;
                                                                                                                                  } else {
                                                                                                                                    L66: {
                                                                                                                                      if ((var6 ^ -1) != -27) {
                                                                                                                                        break L66;
                                                                                                                                      } else {
                                                                                                                                        if (var10 == 0) {
                                                                                                                                          break L12;
                                                                                                                                        } else {
                                                                                                                                          break L66;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    L67: {
                                                                                                                                      if (var6 != 19) {
                                                                                                                                        break L67;
                                                                                                                                      } else {
                                                                                                                                        if (var10 == 0) {
                                                                                                                                          break L11;
                                                                                                                                        } else {
                                                                                                                                          break L67;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    L68: {
                                                                                                                                      if (-35 != (var6 ^ -1)) {
                                                                                                                                        break L68;
                                                                                                                                      } else {
                                                                                                                                        if (var10 == 0) {
                                                                                                                                          break L10;
                                                                                                                                        } else {
                                                                                                                                          break L68;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    if (-41 == (var6 ^ -1)) {
                                                                                                                                      break L9;
                                                                                                                                    } else {
                                                                                                                                      if (var6 == 35) {
                                                                                                                                        break L8;
                                                                                                                                      } else {
                                                                                                                                        if ((var6 ^ -1) == -46) {
                                                                                                                                          break L7;
                                                                                                                                        } else {
                                                                                                                                          if (var6 == 42) {
                                                                                                                                            break L6;
                                                                                                                                          } else {
                                                                                                                                            if (43 == var6) {
                                                                                                                                              break L5;
                                                                                                                                            } else {
                                                                                                                                              L69: {
                                                                                                                                                if (44 != var6) {
                                                                                                                                                  break L69;
                                                                                                                                                } else {
                                                                                                                                                  if (var10 == 0) {
                                                                                                                                                    break L4;
                                                                                                                                                  } else {
                                                                                                                                                    break L69;
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                              if (-48 == (var6 ^ -1)) {
                                                                                                                                                break L3;
                                                                                                                                              } else {
                                                                                                                                                break L2;
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      if (this.field_g.c(0)) {
                                                                                                        L70: {
                                                                                                          if (this.field_c != 19) {
                                                                                                            break L70;
                                                                                                          } else {
                                                                                                            ge.field_j = param1 / 10;
                                                                                                            break L70;
                                                                                                          }
                                                                                                        }
                                                                                                        if (!this.b(false, ge.field_j, param1 % 10)) {
                                                                                                          break L2;
                                                                                                        } else {
                                                                                                          nk.field_J = 500;
                                                                                                          ol.field_Ub = param1 % 10;
                                                                                                          var6 = param2 ? 1 : 0;
                                                                                                          q.a(20, var6 != 0, -1, 0);
                                                                                                          if (var10 == 0) {
                                                                                                            break L2;
                                                                                                          } else {
                                                                                                            break L44;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        break L2;
                                                                                                      }
                                                                                                    }
                                                                                                    sh.a(-23, param2, this.field_g.c(0));
                                                                                                    if (var10 == 0) {
                                                                                                      break L2;
                                                                                                    } else {
                                                                                                      break L43;
                                                                                                    }
                                                                                                  }
                                                                                                  if (!this.field_g.c(0)) {
                                                                                                    break L2;
                                                                                                  } else {
                                                                                                    L71: {
                                                                                                      if (ka.field_V) {
                                                                                                        stackOut_242_0 = 0;
                                                                                                        stackIn_243_0 = stackOut_242_0;
                                                                                                        break L71;
                                                                                                      } else {
                                                                                                        stackOut_240_0 = 1;
                                                                                                        stackIn_243_0 = stackOut_240_0;
                                                                                                        break L71;
                                                                                                      }
                                                                                                    }
                                                                                                    L72: {
                                                                                                      ka.field_V = stackIn_243_0 != 0;
                                                                                                      stackOut_243_0 = ti.field_A;
                                                                                                      stackOut_243_1 = 37;
                                                                                                      stackIn_246_0 = stackOut_243_0;
                                                                                                      stackIn_246_1 = stackOut_243_1;
                                                                                                      stackIn_244_0 = stackOut_243_0;
                                                                                                      stackIn_244_1 = stackOut_243_1;
                                                                                                      if (!ka.field_V) {
                                                                                                        stackOut_246_0 = (String[]) ((Object) stackIn_246_0);
                                                                                                        stackOut_246_1 = stackIn_246_1;
                                                                                                        stackOut_246_2 = fg.field_Vb;
                                                                                                        stackIn_247_0 = stackOut_246_0;
                                                                                                        stackIn_247_1 = stackOut_246_1;
                                                                                                        stackIn_247_2 = stackOut_246_2;
                                                                                                        break L72;
                                                                                                      } else {
                                                                                                        stackOut_244_0 = (String[]) ((Object) stackIn_244_0);
                                                                                                        stackOut_244_1 = stackIn_244_1;
                                                                                                        stackOut_244_2 = ge.field_i;
                                                                                                        stackIn_247_0 = stackOut_244_0;
                                                                                                        stackIn_247_1 = stackOut_244_1;
                                                                                                        stackIn_247_2 = stackOut_244_2;
                                                                                                        break L72;
                                                                                                      }
                                                                                                    }
                                                                                                    stackIn_247_0[stackIn_247_1] = stackIn_247_2;
                                                                                                    if (!ni.b(22)) {
                                                                                                      um.f((byte) 3);
                                                                                                      if (var10 == 0) {
                                                                                                        break L2;
                                                                                                      } else {
                                                                                                        break L42;
                                                                                                      }
                                                                                                    } else {
                                                                                                      break L2;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                if (!this.field_g.c(0)) {
                                                                                                  break L2;
                                                                                                } else {
                                                                                                  bg.c((byte) 120);
                                                                                                  if (!ni.b(51)) {
                                                                                                    um.f((byte) 3);
                                                                                                    if (var10 == 0) {
                                                                                                      break L2;
                                                                                                    } else {
                                                                                                      break L41;
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L2;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              L73: {
                                                                                                if (!this.a(124, param1)) {
                                                                                                  break L73;
                                                                                                } else {
                                                                                                  if (!this.field_g.c(0)) {
                                                                                                    break L2;
                                                                                                  } else {
                                                                                                    L74: {
                                                                                                      L75: {
                                                                                                        if (this.b(false, 1, 0)) {
                                                                                                          break L75;
                                                                                                        } else {
                                                                                                          if (-21 != (this.field_c ^ -1)) {
                                                                                                            break L74;
                                                                                                          } else {
                                                                                                            break L75;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      var6 = param2 ? 1 : 0;
                                                                                                      q.a(19, var6 != 0, -1, 0);
                                                                                                      if (var10 == 0) {
                                                                                                        break L2;
                                                                                                      } else {
                                                                                                        break L74;
                                                                                                      }
                                                                                                    }
                                                                                                    L76: {
                                                                                                      L77: {
                                                                                                        ol.field_Ub = fm.field_f[0];
                                                                                                        ge.field_j = 0;
                                                                                                        var6 = param2 ? 1 : 0;
                                                                                                        var7 = vb.field_g;
                                                                                                        if (5 == var7) {
                                                                                                          break L77;
                                                                                                        } else {
                                                                                                          if (var7 == 6) {
                                                                                                            break L77;
                                                                                                          } else {
                                                                                                            if (var7 == 8) {
                                                                                                              break L77;
                                                                                                            } else {
                                                                                                              break L76;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      var7 = gh.field_Jb;
                                                                                                      break L76;
                                                                                                    }
                                                                                                    q.a(20, var6 != 0, -1, var7);
                                                                                                    if (var10 == 0) {
                                                                                                      break L2;
                                                                                                    } else {
                                                                                                      break L73;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              var4_int = 0;
                                                                                              if (var10 == 0) {
                                                                                                break L2;
                                                                                              } else {
                                                                                                break L40;
                                                                                              }
                                                                                            }
                                                                                            L78: {
                                                                                              if (this.a(118, param1)) {
                                                                                                break L78;
                                                                                              } else {
                                                                                                var4_int = 0;
                                                                                                if (var10 == 0) {
                                                                                                  break L2;
                                                                                                } else {
                                                                                                  break L78;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            if (!this.field_g.c(0)) {
                                                                                              break L2;
                                                                                            } else {
                                                                                              discarded$1 = nl.g(127);
                                                                                              if (var10 == 0) {
                                                                                                break L2;
                                                                                              } else {
                                                                                                break L39;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          if (this.field_g.c(0)) {
                                                                                            L79: {
                                                                                              dc.field_g = -1;
                                                                                              if (ib.a(-99)) {
                                                                                                break L79;
                                                                                              } else {
                                                                                                km.field_a = dg.field_e;
                                                                                                if (var10 == 0) {
                                                                                                  break L2;
                                                                                                } else {
                                                                                                  break L79;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            L80: {
                                                                                              qh.field_Yb = 0;
                                                                                              di.field_g = 4;
                                                                                              if (-15 == (this.field_c ^ -1)) {
                                                                                                uc.field_b = cj.a(-107, di.field_c, hl.field_v);
                                                                                                hl.field_v = ji.a(uc.field_b, (byte) -25, di.field_c);
                                                                                                break L80;
                                                                                              } else {
                                                                                                break L80;
                                                                                              }
                                                                                            }
                                                                                            var6 = param2 ? 1 : 0;
                                                                                            q.a(-3, var6 != 0, -1, 0);
                                                                                            if (var10 == 0) {
                                                                                              break L2;
                                                                                            } else {
                                                                                              break L38;
                                                                                            }
                                                                                          } else {
                                                                                            break L2;
                                                                                          }
                                                                                        }
                                                                                        if (!this.field_g.c(0)) {
                                                                                          break L2;
                                                                                        } else {
                                                                                          L81: {
                                                                                            if (!ni.b(111)) {
                                                                                              break L81;
                                                                                            } else {
                                                                                              si.field_y = false;
                                                                                              var6 = 0;
                                                                                              oc.a(99, var6, ql.field_dc, param2, true);
                                                                                              if (var10 == 0) {
                                                                                                break L2;
                                                                                              } else {
                                                                                                break L81;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          L82: {
                                                                                            if (!this.a(127, param1)) {
                                                                                              break L82;
                                                                                            } else {
                                                                                              L83: {
                                                                                                if (!ib.a(-47)) {
                                                                                                  break L83;
                                                                                                } else {
                                                                                                  L84: {
                                                                                                    L85: {
                                                                                                      var6 = param2 ? 1 : 0;
                                                                                                      var7 = vb.field_g;
                                                                                                      if (-6 == (var7 ^ -1)) {
                                                                                                        break L85;
                                                                                                      } else {
                                                                                                        if (-7 == (var7 ^ -1)) {
                                                                                                          break L85;
                                                                                                        } else {
                                                                                                          if ((var7 ^ -1) != -9) {
                                                                                                            break L84;
                                                                                                          } else {
                                                                                                            break L85;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    var7 = gh.field_Jb;
                                                                                                    break L84;
                                                                                                  }
                                                                                                  q.a(-4, var6 != 0, -1, var7);
                                                                                                  if (var10 == 0) {
                                                                                                    break L2;
                                                                                                  } else {
                                                                                                    break L83;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              km.field_a = dg.field_e;
                                                                                              if (var10 == 0) {
                                                                                                break L2;
                                                                                              } else {
                                                                                                break L82;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          var4_int = 0;
                                                                                          km.field_a = b.field_l;
                                                                                          if (var10 == 0) {
                                                                                            break L2;
                                                                                          } else {
                                                                                            break L37;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      if (this.field_g.c(0)) {
                                                                                        var6 = param2 ? 1 : 0;
                                                                                        q.a(-1, var6 != 0, -1, 0);
                                                                                        if (var10 == 0) {
                                                                                          break L2;
                                                                                        } else {
                                                                                          break L36;
                                                                                        }
                                                                                      } else {
                                                                                        break L2;
                                                                                      }
                                                                                    }
                                                                                    ub.a(false, -1);
                                                                                    if (this.field_g.c(0)) {
                                                                                      L86: {
                                                                                        if (14 != pm.field_T) {
                                                                                          break L86;
                                                                                        } else {
                                                                                          uc.field_b = cj.a(-109, di.field_c, hl.field_v);
                                                                                          break L86;
                                                                                        }
                                                                                      }
                                                                                      L87: {
                                                                                        if ((pm.field_T ^ -1) != -21) {
                                                                                          break L87;
                                                                                        } else {
                                                                                          if (!ni.b(28)) {
                                                                                            break L87;
                                                                                          } else {
                                                                                            if (0 >= fm.field_f[0]) {
                                                                                              break L87;
                                                                                            } else {
                                                                                              ln.field_g = -1;
                                                                                              gh.field_J = true;
                                                                                              if (var10 == 0) {
                                                                                                break L2;
                                                                                              } else {
                                                                                                break L87;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      L88: {
                                                                                        L89: {
                                                                                          var6 = param2 ? 1 : 0;
                                                                                          var7 = vb.field_g;
                                                                                          if (-6 == (var7 ^ -1)) {
                                                                                            break L89;
                                                                                          } else {
                                                                                            if (var7 == 6) {
                                                                                              break L89;
                                                                                            } else {
                                                                                              if (8 == var7) {
                                                                                                break L89;
                                                                                              } else {
                                                                                                break L88;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var7 = gh.field_Jb;
                                                                                        break L88;
                                                                                      }
                                                                                      q.a(0, var6 != 0, -1, var7);
                                                                                      if (var10 == 0) {
                                                                                        break L2;
                                                                                      } else {
                                                                                        break L35;
                                                                                      }
                                                                                    } else {
                                                                                      break L2;
                                                                                    }
                                                                                  }
                                                                                  if (!this.field_g.c(0)) {
                                                                                    break L2;
                                                                                  } else {
                                                                                    L90: {
                                                                                      L91: {
                                                                                        var6 = param2 ? 1 : 0;
                                                                                        var7 = vb.field_g;
                                                                                        if (5 == var7) {
                                                                                          break L91;
                                                                                        } else {
                                                                                          if (6 == var7) {
                                                                                            break L91;
                                                                                          } else {
                                                                                            if (8 != var7) {
                                                                                              break L90;
                                                                                            } else {
                                                                                              break L91;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      var7 = gh.field_Jb;
                                                                                      break L90;
                                                                                    }
                                                                                    q.a(12, var6 != 0, -1, var7);
                                                                                    td.field_Sb = true;
                                                                                    if (var10 == 0) {
                                                                                      break L2;
                                                                                    } else {
                                                                                      break L34;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (this.field_g.c(0)) {
                                                                                  L92: {
                                                                                    L93: {
                                                                                      var6 = param2 ? 1 : 0;
                                                                                      var7 = vb.field_g;
                                                                                      if ((var7 ^ -1) == -6) {
                                                                                        break L93;
                                                                                      } else {
                                                                                        if (6 == var7) {
                                                                                          break L93;
                                                                                        } else {
                                                                                          if ((var7 ^ -1) != -9) {
                                                                                            break L92;
                                                                                          } else {
                                                                                            break L93;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var7 = gh.field_Jb;
                                                                                    break L92;
                                                                                  }
                                                                                  q.a(8, var6 != 0, -1, var7);
                                                                                  if (var10 == 0) {
                                                                                    break L2;
                                                                                  } else {
                                                                                    break L33;
                                                                                  }
                                                                                } else {
                                                                                  break L2;
                                                                                }
                                                                              }
                                                                              if (!this.field_g.c(0)) {
                                                                                break L2;
                                                                              } else {
                                                                                L94: {
                                                                                  L95: {
                                                                                    var6 = param2 ? 1 : 0;
                                                                                    var7 = vb.field_g;
                                                                                    if (-6 == (var7 ^ -1)) {
                                                                                      break L95;
                                                                                    } else {
                                                                                      if (var7 == 6) {
                                                                                        break L95;
                                                                                      } else {
                                                                                        if (8 != var7) {
                                                                                          break L94;
                                                                                        } else {
                                                                                          break L95;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  var7 = gh.field_Jb;
                                                                                  break L94;
                                                                                }
                                                                                q.a(13, var6 != 0, -1, var7);
                                                                                if (pm.field_T != 14) {
                                                                                  break L2;
                                                                                } else {
                                                                                  uc.field_b = cj.a(-100, di.field_c, hl.field_v);
                                                                                  if (var10 == 0) {
                                                                                    break L2;
                                                                                  } else {
                                                                                    break L32;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (this.field_g.c(0)) {
                                                                              L96: {
                                                                                if (this.a(124, param1)) {
                                                                                  break L96;
                                                                                } else {
                                                                                  var4_int = 0;
                                                                                  km.field_a = sj.field_C + "<br>" + b.field_l;
                                                                                  if (var10 == 0) {
                                                                                    break L2;
                                                                                  } else {
                                                                                    break L96;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L97: {
                                                                                if (!gi.h((byte) -79)) {
                                                                                  break L97;
                                                                                } else {
                                                                                  ij.field_Y = -1;
                                                                                  fg.field_Ob = 1;
                                                                                  f.field_A = null;
                                                                                  ti.field_B = null;
                                                                                  vn.d(-52);
                                                                                  var6 = 0;
                                                                                  L98: while (true) {
                                                                                    L99: {
                                                                                      L100: {
                                                                                        if ((var6 ^ -1) <= (va.field_k.length ^ -1)) {
                                                                                          break L100;
                                                                                        } else {
                                                                                          va.field_k[var6] = 0;
                                                                                          var6++;
                                                                                          if (var10 != 0) {
                                                                                            break L99;
                                                                                          } else {
                                                                                            if (var10 == 0) {
                                                                                              continue L98;
                                                                                            } else {
                                                                                              break L100;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      param2 = true;
                                                                                      break L99;
                                                                                    }
                                                                                    dc.field_g = 0;
                                                                                    break L97;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L101: {
                                                                                L102: {
                                                                                  re.field_eb = -1;
                                                                                  var6 = param2 ? 1 : 0;
                                                                                  var7 = vb.field_g;
                                                                                  if (5 == var7) {
                                                                                    break L102;
                                                                                  } else {
                                                                                    if (var7 == 6) {
                                                                                      break L102;
                                                                                    } else {
                                                                                      if (-9 == (var7 ^ -1)) {
                                                                                        break L102;
                                                                                      } else {
                                                                                        break L101;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var7 = gh.field_Jb;
                                                                                break L101;
                                                                              }
                                                                              q.a(14, var6 != 0, -1, var7);
                                                                              hl.field_v = ji.a(uc.field_b, (byte) -67, di.field_c);
                                                                              hl.field_v.b(6993661, -110);
                                                                              if (var10 == 0) {
                                                                                break L2;
                                                                              } else {
                                                                                break L31;
                                                                              }
                                                                            } else {
                                                                              break L2;
                                                                            }
                                                                          }
                                                                          if (!this.field_g.c(0)) {
                                                                            break L2;
                                                                          } else {
                                                                            L103: {
                                                                              L104: {
                                                                                ea.field_k = false;
                                                                                var6 = param2 ? 1 : 0;
                                                                                var7 = vb.field_g;
                                                                                if (var7 == 5) {
                                                                                  break L104;
                                                                                } else {
                                                                                  if ((var7 ^ -1) == -7) {
                                                                                    break L104;
                                                                                  } else {
                                                                                    if ((var7 ^ -1) != -9) {
                                                                                      break L103;
                                                                                    } else {
                                                                                      break L104;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                              var7 = gh.field_Jb;
                                                                              break L103;
                                                                            }
                                                                            q.a(7, var6 != 0, -1, var7);
                                                                            if (var10 == 0) {
                                                                              break L2;
                                                                            } else {
                                                                              break L30;
                                                                            }
                                                                          }
                                                                        }
                                                                        L105: {
                                                                          if (this.field_c != 19) {
                                                                            break L105;
                                                                          } else {
                                                                            gh.field_Jb = 0;
                                                                            break L105;
                                                                          }
                                                                        }
                                                                        if (this.field_g.c(0)) {
                                                                          L106: {
                                                                            if (-8 != (this.field_c ^ -1)) {
                                                                              break L106;
                                                                            } else {
                                                                              if ((gh.field_Jb ^ -1) != -1) {
                                                                                ea.field_k = true;
                                                                                break L106;
                                                                              } else {
                                                                                break L106;
                                                                              }
                                                                            }
                                                                          }
                                                                          L107: {
                                                                            L108: {
                                                                              var6 = gh.field_Jb;
                                                                              var7 = param2 ? 1 : 0;
                                                                              var8 = vb.field_g;
                                                                              if (var8 == 5) {
                                                                                break L108;
                                                                              } else {
                                                                                if (-7 == (var8 ^ -1)) {
                                                                                  break L108;
                                                                                } else {
                                                                                  if (var8 != 8) {
                                                                                    break L107;
                                                                                  } else {
                                                                                    break L108;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var8 = gh.field_Jb;
                                                                            break L107;
                                                                          }
                                                                          q.a(var6, var7 != 0, -1, var8);
                                                                          if (var10 == 0) {
                                                                            break L2;
                                                                          } else {
                                                                            break L29;
                                                                          }
                                                                        } else {
                                                                          break L2;
                                                                        }
                                                                      }
                                                                      if (!this.field_g.c(0)) {
                                                                        break L2;
                                                                      } else {
                                                                        L109: {
                                                                          L110: {
                                                                            var6 = param2 ? 1 : 0;
                                                                            var7 = vb.field_g;
                                                                            if ((var7 ^ -1) == -6) {
                                                                              break L110;
                                                                            } else {
                                                                              if (-7 == (var7 ^ -1)) {
                                                                                break L110;
                                                                              } else {
                                                                                if ((var7 ^ -1) == -9) {
                                                                                  break L110;
                                                                                } else {
                                                                                  break L109;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                          var7 = gh.field_Jb;
                                                                          break L109;
                                                                        }
                                                                        q.a(6, var6 != 0, -1, var7);
                                                                        if (var10 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L28;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (!this.field_g.c(0)) {
                                                                      break L2;
                                                                    } else {
                                                                      L111: {
                                                                        if (-10 != (this.field_c ^ -1)) {
                                                                          break L111;
                                                                        } else {
                                                                          var6 = param2 ? 1 : 0;
                                                                          q.a(5, var6 != 0, -1, 0);
                                                                          if (var10 == 0) {
                                                                            break L2;
                                                                          } else {
                                                                            break L111;
                                                                          }
                                                                        }
                                                                      }
                                                                      L112: {
                                                                        L113: {
                                                                          var6 = param2 ? 1 : 0;
                                                                          var7 = vb.field_g;
                                                                          if (-6 == (var7 ^ -1)) {
                                                                            break L113;
                                                                          } else {
                                                                            if (6 == var7) {
                                                                              break L113;
                                                                            } else {
                                                                              if (8 != var7) {
                                                                                break L112;
                                                                              } else {
                                                                                break L113;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        var7 = gh.field_Jb;
                                                                        break L112;
                                                                      }
                                                                      q.a(5, var6 != 0, -1, var7);
                                                                      if (var10 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L27;
                                                                      }
                                                                    }
                                                                  }
                                                                  L114: {
                                                                    var4_int = 0;
                                                                    var6 = 0;
                                                                    if (!this.field_g.b(117)) {
                                                                      break L114;
                                                                    } else {
                                                                      if ((lb.field_ac ^ -1) < -1) {
                                                                        bb.a(0, (byte) 64);
                                                                        var6 = 1;
                                                                        break L114;
                                                                      } else {
                                                                        break L114;
                                                                      }
                                                                    }
                                                                  }
                                                                  L115: {
                                                                    if (!this.field_g.a((byte) 105)) {
                                                                      break L115;
                                                                    } else {
                                                                      if ((lb.field_ac ^ -1) > -257) {
                                                                        var6 = 1;
                                                                        bb.a(256, (byte) 64);
                                                                        break L115;
                                                                      } else {
                                                                        break L115;
                                                                      }
                                                                    }
                                                                  }
                                                                  L116: {
                                                                    if (this.field_g.a(0)) {
                                                                      L117: {
                                                                        L118: {
                                                                          var7 = this.g(125, param1) - -this.a(param1, (byte) 118) + le.field_K - 170 >> -1107747103;
                                                                          var8 = oh.field_f - var7 - -2;
                                                                          var9 = 256 * var8 / 170;
                                                                          if (0 < var9) {
                                                                            break L118;
                                                                          } else {
                                                                            bb.a(0, (byte) 64);
                                                                            if (var10 == 0) {
                                                                              break L117;
                                                                            } else {
                                                                              break L118;
                                                                            }
                                                                          }
                                                                        }
                                                                        L119: {
                                                                          if ((var9 ^ -1) <= -257) {
                                                                            break L119;
                                                                          } else {
                                                                            bb.a(var9, (byte) 64);
                                                                            if (var10 == 0) {
                                                                              break L117;
                                                                            } else {
                                                                              break L119;
                                                                            }
                                                                          }
                                                                        }
                                                                        bb.a(256, (byte) 64);
                                                                        break L117;
                                                                      }
                                                                      var6 = 1;
                                                                      break L116;
                                                                    } else {
                                                                      break L116;
                                                                    }
                                                                  }
                                                                  L120: {
                                                                    if (!this.field_g.d(-97)) {
                                                                      break L120;
                                                                    } else {
                                                                      if (lb.field_ac <= 0) {
                                                                        break L120;
                                                                      } else {
                                                                        var6 = 1;
                                                                        ij.k(-44);
                                                                        break L120;
                                                                      }
                                                                    }
                                                                  }
                                                                  L121: {
                                                                    if (!this.field_g.c((byte) 51)) {
                                                                      break L121;
                                                                    } else {
                                                                      if ((lb.field_ac ^ -1) > -257) {
                                                                        r.b((byte) 46);
                                                                        var6 = 1;
                                                                        break L121;
                                                                      } else {
                                                                        break L121;
                                                                      }
                                                                    }
                                                                  }
                                                                  L122: {
                                                                    if (var6 == 0) {
                                                                      break L122;
                                                                    } else {
                                                                      L123: {
                                                                        if (!this.field_g.a(0)) {
                                                                          break L123;
                                                                        } else {
                                                                          if ((a.field_c ^ -1) >= (gb.field_a ^ -1)) {
                                                                            break L122;
                                                                          } else {
                                                                            break L123;
                                                                          }
                                                                        }
                                                                      }
                                                                      ee.c(-2483, 0);
                                                                      gb.field_a = a.field_c + 20;
                                                                      break L122;
                                                                    }
                                                                  }
                                                                  if (var10 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L26;
                                                                  }
                                                                }
                                                                L124: {
                                                                  if (!this.field_g.b(126)) {
                                                                    break L124;
                                                                  } else {
                                                                    ef.a(1, 0);
                                                                    break L124;
                                                                  }
                                                                }
                                                                L125: {
                                                                  var4_int = 0;
                                                                  if (!this.field_g.a((byte) -120)) {
                                                                    break L125;
                                                                  } else {
                                                                    ef.a(1, 256);
                                                                    break L125;
                                                                  }
                                                                }
                                                                L126: {
                                                                  if (this.field_g.a(0)) {
                                                                    L127: {
                                                                      var6 = -170 + (this.g(125, param1) + this.a(param1, (byte) 110)) - -le.field_K >> 423421089;
                                                                      var7 = -var6 + oh.field_f - -2;
                                                                      var8 = var7 * 256 / 170;
                                                                      if (-1 > (var8 ^ -1)) {
                                                                        break L127;
                                                                      } else {
                                                                        ef.a(1, 0);
                                                                        if (var10 == 0) {
                                                                          break L126;
                                                                        } else {
                                                                          break L127;
                                                                        }
                                                                      }
                                                                    }
                                                                    L128: {
                                                                      if ((var8 ^ -1) <= -257) {
                                                                        break L128;
                                                                      } else {
                                                                        ef.a(1, var8);
                                                                        if (var10 == 0) {
                                                                          break L126;
                                                                        } else {
                                                                          break L128;
                                                                        }
                                                                      }
                                                                    }
                                                                    ef.a(1, 256);
                                                                    break L126;
                                                                  } else {
                                                                    break L126;
                                                                  }
                                                                }
                                                                L129: {
                                                                  if (this.field_g.d(-97)) {
                                                                    s.b(125);
                                                                    break L129;
                                                                  } else {
                                                                    break L129;
                                                                  }
                                                                }
                                                                if (!this.field_g.c((byte) 51)) {
                                                                  break L2;
                                                                } else {
                                                                  un.a((byte) 125);
                                                                  if (var10 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L25;
                                                                  }
                                                                }
                                                              }
                                                              if (!this.field_g.c(0)) {
                                                                break L2;
                                                              } else {
                                                                L130: {
                                                                  if (wb.field_c == null) {
                                                                    break L130;
                                                                  } else {
                                                                    ub.c(0);
                                                                    if (var10 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L130;
                                                                    }
                                                                  }
                                                                }
                                                                var6 = param2 ? 1 : 0;
                                                                si.field_y = false;
                                                                ag.a(-4, var6 != 0);
                                                                if (var10 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L24;
                                                                }
                                                              }
                                                            }
                                                            if (this.field_g.c(0)) {
                                                              L131: {
                                                                L132: {
                                                                  var6 = 0;
                                                                  var7 = di.field_g;
                                                                  if (0 == var7) {
                                                                    break L132;
                                                                  } else {
                                                                    L133: {
                                                                      if (var7 != 1) {
                                                                        break L133;
                                                                      } else {
                                                                        if (var10 == 0) {
                                                                          break L132;
                                                                        } else {
                                                                          break L133;
                                                                        }
                                                                      }
                                                                    }
                                                                    L134: {
                                                                      if (7 != var7) {
                                                                        break L134;
                                                                      } else {
                                                                        if (var10 == 0) {
                                                                          break L132;
                                                                        } else {
                                                                          break L134;
                                                                        }
                                                                      }
                                                                    }
                                                                    L135: {
                                                                      if ((var7 ^ -1) != -4) {
                                                                        break L135;
                                                                      } else {
                                                                        if (var10 == 0) {
                                                                          break L132;
                                                                        } else {
                                                                          break L135;
                                                                        }
                                                                      }
                                                                    }
                                                                    if ((var7 ^ -1) == -6) {
                                                                      break L132;
                                                                    } else {
                                                                      L136: {
                                                                        if (9 != var7) {
                                                                          break L136;
                                                                        } else {
                                                                          if (var10 == 0) {
                                                                            break L132;
                                                                          } else {
                                                                            break L136;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (-11 != (var7 ^ -1)) {
                                                                        break L131;
                                                                      } else {
                                                                        break L132;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                var6 = 1;
                                                                break L131;
                                                              }
                                                              L137: {
                                                                L138: {
                                                                  if (var6 == 0) {
                                                                    break L138;
                                                                  } else {
                                                                    fk.field_i.i(77);
                                                                    if (var10 == 0) {
                                                                      break L137;
                                                                    } else {
                                                                      break L138;
                                                                    }
                                                                  }
                                                                }
                                                                L139: {
                                                                  if (di.field_g != 4) {
                                                                    break L139;
                                                                  } else {
                                                                    L140: {
                                                                      L141: {
                                                                        hl.field_v = ji.a(uc.field_b, (byte) 109, di.field_c);
                                                                        lc.field_e = true;
                                                                        ea.field_k = false;
                                                                        var7 = vb.field_g;
                                                                        if ((var7 ^ -1) == -6) {
                                                                          break L141;
                                                                        } else {
                                                                          if (-7 == (var7 ^ -1)) {
                                                                            break L141;
                                                                          } else {
                                                                            if (-9 == (var7 ^ -1)) {
                                                                              break L141;
                                                                            } else {
                                                                              break L140;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      var7 = gh.field_Jb;
                                                                      break L140;
                                                                    }
                                                                    q.a(14, false, -1, var7);
                                                                    if (var10 == 0) {
                                                                      break L137;
                                                                    } else {
                                                                      break L139;
                                                                    }
                                                                  }
                                                                }
                                                                fk.field_i.a((byte) 30, param2);
                                                                ea.field_k = false;
                                                                lc.field_e = true;
                                                                break L137;
                                                              }
                                                              if (var10 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L23;
                                                              }
                                                            } else {
                                                              break L2;
                                                            }
                                                          }
                                                          if (!this.field_g.c(0)) {
                                                            break L2;
                                                          } else {
                                                            fk.field_i.m(1125);
                                                            var6 = param2 ? 1 : 0;
                                                            q.a(-1, var6 != 0, -1, 0);
                                                            if (var10 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L22;
                                                            }
                                                          }
                                                        }
                                                        if (!this.field_g.c(0)) {
                                                          break L2;
                                                        } else {
                                                          fk.field_i.c(126);
                                                          var6 = param2 ? 1 : 0;
                                                          q.a(-1, var6 != 0, -1, 0);
                                                          if (var10 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L21;
                                                          }
                                                        }
                                                      }
                                                      if (!this.field_g.c(0)) {
                                                        break L2;
                                                      } else {
                                                        fk.field_i.a(false);
                                                        var6 = param2 ? 1 : 0;
                                                        q.a(-1, var6 != 0, -1, 0);
                                                        if (var10 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L20;
                                                        }
                                                      }
                                                    }
                                                    if (this.field_g.c(0)) {
                                                      L142: {
                                                        if (!ob.field_y) {
                                                          break L142;
                                                        } else {
                                                          L143: {
                                                            L144: {
                                                              var6 = param2 ? 1 : 0;
                                                              var7 = vb.field_g;
                                                              if ((var7 ^ -1) == -6) {
                                                                break L144;
                                                              } else {
                                                                if (6 == var7) {
                                                                  break L144;
                                                                } else {
                                                                  if ((var7 ^ -1) != -9) {
                                                                    break L143;
                                                                  } else {
                                                                    break L144;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var7 = gh.field_Jb;
                                                            break L143;
                                                          }
                                                          q.a(-5, var6 != 0, -1, var7);
                                                          break L142;
                                                        }
                                                      }
                                                      if (!ee.field_G) {
                                                        break L2;
                                                      } else {
                                                        ei.a(0, (byte) -23, 11);
                                                        if (var10 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L19;
                                                        }
                                                      }
                                                    } else {
                                                      break L2;
                                                    }
                                                  }
                                                  if (!this.field_g.c(0)) {
                                                    break L2;
                                                  } else {
                                                    d.field_R = 0;
                                                    if (var10 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                }
                                                if (this.field_g.c(0)) {
                                                  d.field_R = 1;
                                                  if (var10 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L17;
                                                  }
                                                } else {
                                                  break L2;
                                                }
                                              }
                                              if (this.field_g.c(0)) {
                                                d.field_R = 2;
                                                if (var10 == 0) {
                                                  break L2;
                                                } else {
                                                  break L16;
                                                }
                                              } else {
                                                break L2;
                                              }
                                            }
                                            if (!this.field_g.c(0)) {
                                              break L2;
                                            } else {
                                              on.field_j = 0;
                                              if (var10 == 0) {
                                                break L2;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          if (this.field_g.c(0)) {
                                            on.field_j = 1;
                                            if (var10 == 0) {
                                              break L2;
                                            } else {
                                              break L14;
                                            }
                                          } else {
                                            break L2;
                                          }
                                        }
                                        if (!this.field_g.c(0)) {
                                          break L2;
                                        } else {
                                          L145: {
                                            L146: {
                                              si.field_y = false;
                                              if (20 == this.field_c) {
                                                break L146;
                                              } else {
                                                if (-20 != (this.field_c ^ -1)) {
                                                  break L145;
                                                } else {
                                                  break L146;
                                                }
                                              }
                                            }
                                            L147: {
                                              if (-4 < (fm.field_f[0] ^ -1)) {
                                                stackOut_736_0 = 20;
                                                stackIn_737_0 = stackOut_736_0;
                                                break L147;
                                              } else {
                                                stackOut_734_0 = 19;
                                                stackIn_737_0 = stackOut_734_0;
                                                break L147;
                                              }
                                            }
                                            v.a(stackIn_737_0, (String) null, 10);
                                            if (var10 == 0) {
                                              break L2;
                                            } else {
                                              break L145;
                                            }
                                          }
                                          L148: {
                                            if (this.field_c != 10) {
                                              break L148;
                                            } else {
                                              v.a(9, (String) null, 10);
                                              if (var10 == 0) {
                                                break L2;
                                              } else {
                                                break L148;
                                              }
                                            }
                                          }
                                          L149: {
                                            if (8 == this.field_c) {
                                              break L149;
                                            } else {
                                              if (5 == pm.field_T) {
                                                break L149;
                                              } else {
                                                if (pm.field_T == 6) {
                                                  break L149;
                                                } else {
                                                  if (14 != pm.field_T) {
                                                    break L2;
                                                  } else {
                                                    break L149;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          v.a(this.field_c, pl.field_Q, 10);
                                          if (var10 == 0) {
                                            break L2;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      L150: {
                                        if (!this.field_g.c(0)) {
                                          break L150;
                                        } else {
                                          if (!this.a(121, param1)) {
                                            break L150;
                                          } else {
                                            nk.field_J = 500;
                                            ol.field_Ub = ol.field_Ub - 1;
                                            if (var10 == 0) {
                                              break L2;
                                            } else {
                                              break L150;
                                            }
                                          }
                                        }
                                      }
                                      var4_int = 0;
                                      if (var10 == 0) {
                                        break L2;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    L151: {
                                      if (!this.field_g.c(0)) {
                                        break L151;
                                      } else {
                                        if (!this.a(126, param1)) {
                                          break L151;
                                        } else {
                                          ol.field_Ub = ol.field_Ub + 1;
                                          nk.field_J = 500;
                                          if (var10 == 0) {
                                            break L2;
                                          } else {
                                            break L151;
                                          }
                                        }
                                      }
                                    }
                                    var4_int = 0;
                                    if (var10 == 0) {
                                      break L2;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  if (this.field_g.c(0)) {
                                    t.a(true, wl.d((byte) -21));
                                    if (var10 == 0) {
                                      break L2;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                                if (!this.field_g.c(0)) {
                                  break L2;
                                } else {
                                  if (!nk.f((byte) -28)) {
                                    L152: {
                                      L153: {
                                        var6 = param2 ? 1 : 0;
                                        var7 = vb.field_g;
                                        if (-6 == (var7 ^ -1)) {
                                          break L153;
                                        } else {
                                          if (6 == var7) {
                                            break L153;
                                          } else {
                                            if (8 == var7) {
                                              break L153;
                                            } else {
                                              break L152;
                                            }
                                          }
                                        }
                                      }
                                      var7 = gh.field_Jb;
                                      break L152;
                                    }
                                    q.a(21, var6 != 0, -1, var7);
                                    if (var10 == 0) {
                                      break L2;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                              if (!this.field_g.c(0)) {
                                break L2;
                              } else {
                                ve.a((byte) 122);
                                ij.field_Y = -1;
                                f.field_A = null;
                                ti.field_B = null;
                                fg.field_Ob = 1;
                                vn.d(-68);
                                var6 = 0;
                                L154: while (true) {
                                  L155: {
                                    L156: {
                                      if (var6 >= va.field_k.length) {
                                        break L156;
                                      } else {
                                        va.field_k[var6] = 0;
                                        var6++;
                                        if (var10 != 0) {
                                          break L155;
                                        } else {
                                          if (var10 == 0) {
                                            continue L154;
                                          } else {
                                            break L156;
                                          }
                                        }
                                      }
                                    }
                                    dc.field_g = 0;
                                    break L155;
                                  }
                                  if (var10 == 0) {
                                    break L2;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            if (this.field_g.c(0)) {
                              L157: {
                                L158: {
                                  var6 = param2 ? 1 : 0;
                                  var7 = vb.field_g;
                                  if (5 == var7) {
                                    break L158;
                                  } else {
                                    if ((var7 ^ -1) == -7) {
                                      break L158;
                                    } else {
                                      if (8 == var7) {
                                        break L158;
                                      } else {
                                        break L157;
                                      }
                                    }
                                  }
                                }
                                var7 = gh.field_Jb;
                                break L157;
                              }
                              q.a(17, var6 != 0, -1, var7);
                              if (var10 == 0) {
                                break L2;
                              } else {
                                break L7;
                              }
                            } else {
                              break L2;
                            }
                          }
                          if (this.field_g.c(0)) {
                            L159: {
                              L160: {
                                var6 = param2 ? 1 : 0;
                                var7 = vb.field_g;
                                if ((var7 ^ -1) == -6) {
                                  break L160;
                                } else {
                                  if (var7 == 6) {
                                    break L160;
                                  } else {
                                    if ((var7 ^ -1) == -9) {
                                      break L160;
                                    } else {
                                      break L159;
                                    }
                                  }
                                }
                              }
                              var7 = gh.field_Jb;
                              break L159;
                            }
                            q.a(22, var6 != 0, -1, var7);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L6;
                            }
                          } else {
                            break L2;
                          }
                        }
                        if (this.field_g.c(0)) {
                          L161: {
                            if (dm.field_c) {
                              stackOut_855_0 = 0;
                              stackIn_856_0 = stackOut_855_0;
                              break L161;
                            } else {
                              stackOut_853_0 = 1;
                              stackIn_856_0 = stackOut_853_0;
                              break L161;
                            }
                          }
                          L162: {
                            dm.field_c = stackIn_856_0 != 0;
                            gd.field_sb = null;
                            stackOut_856_0 = ti.field_A;
                            stackOut_856_1 = 42;
                            stackIn_859_0 = stackOut_856_0;
                            stackIn_859_1 = stackOut_856_1;
                            stackIn_857_0 = stackOut_856_0;
                            stackIn_857_1 = stackOut_856_1;
                            if (!dm.field_c) {
                              stackOut_859_0 = (String[]) ((Object) stackIn_859_0);
                              stackOut_859_1 = stackIn_859_1;
                              stackOut_859_2 = od.field_j;
                              stackIn_860_0 = stackOut_859_0;
                              stackIn_860_1 = stackOut_859_1;
                              stackIn_860_2 = stackOut_859_2;
                              break L162;
                            } else {
                              stackOut_857_0 = (String[]) ((Object) stackIn_857_0);
                              stackOut_857_1 = stackIn_857_1;
                              stackOut_857_2 = qm.field_c;
                              stackIn_860_0 = stackOut_857_0;
                              stackIn_860_1 = stackOut_857_1;
                              stackIn_860_2 = stackOut_857_2;
                              break L162;
                            }
                          }
                          stackIn_860_0[stackIn_860_1] = stackIn_860_2;
                          if (ni.b(81)) {
                            break L2;
                          } else {
                            um.f((byte) 3);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L5;
                            }
                          }
                        } else {
                          break L2;
                        }
                      }
                      L163: {
                        if (!this.a(125, param1)) {
                          break L163;
                        } else {
                          if (!this.field_g.c(0)) {
                            break L163;
                          } else {
                            L164: {
                              if (ui.field_G) {
                                stackOut_875_0 = 0;
                                stackIn_876_0 = stackOut_875_0;
                                break L164;
                              } else {
                                stackOut_873_0 = 1;
                                stackIn_876_0 = stackOut_873_0;
                                break L164;
                              }
                            }
                            L165: {
                              ui.field_G = stackIn_876_0 != 0;
                              stackOut_876_0 = ti.field_A;
                              stackOut_876_1 = 43;
                              stackIn_879_0 = stackOut_876_0;
                              stackIn_879_1 = stackOut_876_1;
                              stackIn_877_0 = stackOut_876_0;
                              stackIn_877_1 = stackOut_876_1;
                              if (!ui.field_G) {
                                stackOut_879_0 = (String[]) ((Object) stackIn_879_0);
                                stackOut_879_1 = stackIn_879_1;
                                stackOut_879_2 = fj.field_i;
                                stackIn_880_0 = stackOut_879_0;
                                stackIn_880_1 = stackOut_879_1;
                                stackIn_880_2 = stackOut_879_2;
                                break L165;
                              } else {
                                stackOut_877_0 = (String[]) ((Object) stackIn_877_0);
                                stackOut_877_1 = stackIn_877_1;
                                stackOut_877_2 = tm.field_f;
                                stackIn_880_0 = stackOut_877_0;
                                stackIn_880_1 = stackOut_877_1;
                                stackIn_880_2 = stackOut_877_2;
                                break L165;
                              }
                            }
                            stackIn_880_0[stackIn_880_1] = stackIn_880_2;
                            if (ni.b(45)) {
                              break L2;
                            } else {
                              um.f((byte) 3);
                              if (var10 == 0) {
                                break L2;
                              } else {
                                break L163;
                              }
                            }
                          }
                        }
                      }
                      var4_int = 0;
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                    L166: {
                      if (!this.a(125, param1)) {
                        break L166;
                      } else {
                        if (!this.field_g.c(0)) {
                          break L166;
                        } else {
                          L167: {
                            if (ik.field_h) {
                              stackOut_896_0 = 0;
                              stackIn_897_0 = stackOut_896_0;
                              break L167;
                            } else {
                              stackOut_894_0 = 1;
                              stackIn_897_0 = stackOut_894_0;
                              break L167;
                            }
                          }
                          L168: {
                            ik.field_h = stackIn_897_0 != 0;
                            stackOut_897_0 = ti.field_A;
                            stackOut_897_1 = 44;
                            stackIn_900_0 = stackOut_897_0;
                            stackIn_900_1 = stackOut_897_1;
                            stackIn_898_0 = stackOut_897_0;
                            stackIn_898_1 = stackOut_897_1;
                            if (!ik.field_h) {
                              stackOut_900_0 = (String[]) ((Object) stackIn_900_0);
                              stackOut_900_1 = stackIn_900_1;
                              stackOut_900_2 = sa.field_b;
                              stackIn_901_0 = stackOut_900_0;
                              stackIn_901_1 = stackOut_900_1;
                              stackIn_901_2 = stackOut_900_2;
                              break L168;
                            } else {
                              stackOut_898_0 = (String[]) ((Object) stackIn_898_0);
                              stackOut_898_1 = stackIn_898_1;
                              stackOut_898_2 = o.field_a;
                              stackIn_901_0 = stackOut_898_0;
                              stackIn_901_1 = stackOut_898_1;
                              stackIn_901_2 = stackOut_898_2;
                              break L168;
                            }
                          }
                          stackIn_901_0[stackIn_901_1] = stackIn_901_2;
                          if (ni.b(12)) {
                            break L2;
                          } else {
                            um.f((byte) 3);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L166;
                            }
                          }
                        }
                      }
                    }
                    var4_int = 0;
                    if (var10 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  L169: {
                    L170: {
                      if (!this.a(127, param1)) {
                        break L170;
                      } else {
                        if (this.field_g.c(0)) {
                          break L169;
                        } else {
                          break L170;
                        }
                      }
                    }
                    var4_int = 0;
                    if (var10 == 0) {
                      break L2;
                    } else {
                      break L169;
                    }
                  }
                  L171: {
                    gd.field_sb = null;
                    if (tj.field_a) {
                      stackOut_918_0 = 0;
                      stackIn_919_0 = stackOut_918_0;
                      break L171;
                    } else {
                      stackOut_916_0 = 1;
                      stackIn_919_0 = stackOut_916_0;
                      break L171;
                    }
                  }
                  L172: {
                    tj.field_a = stackIn_919_0 != 0;
                    stackOut_919_0 = ti.field_A;
                    stackOut_919_1 = 47;
                    stackIn_922_0 = stackOut_919_0;
                    stackIn_922_1 = stackOut_919_1;
                    stackIn_920_0 = stackOut_919_0;
                    stackIn_920_1 = stackOut_919_1;
                    if (!tj.field_a) {
                      stackOut_922_0 = (String[]) ((Object) stackIn_922_0);
                      stackOut_922_1 = stackIn_922_1;
                      stackOut_922_2 = he.field_d;
                      stackIn_923_0 = stackOut_922_0;
                      stackIn_923_1 = stackOut_922_1;
                      stackIn_923_2 = stackOut_922_2;
                      break L172;
                    } else {
                      stackOut_920_0 = (String[]) ((Object) stackIn_920_0);
                      stackOut_920_1 = stackIn_920_1;
                      stackOut_920_2 = qj.field_u;
                      stackIn_923_0 = stackOut_920_0;
                      stackIn_923_1 = stackOut_920_1;
                      stackIn_923_2 = stackOut_920_2;
                      break L172;
                    }
                  }
                  stackIn_923_0[stackIn_923_1] = stackIn_923_2;
                  if (ni.b(75)) {
                    break L2;
                  } else {
                    um.f((byte) 3);
                    break L2;
                  }
                }
                L173: {
                  if (var4_int == 0) {
                    break L173;
                  } else {
                    ee.c(-2483, 95);
                    break L173;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.J(" + param0 + ',' + param1 + ',' + param2 + ')');
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

    private final void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var2_int = -1;
              if (param0 == -120) {
                break L1;
              } else {
                this.b(false);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      var3 = ei.field_q;
                      if (96 != var3) {
                        break L6;
                      } else {
                        if (var4 == 0) {
                          var2_int = this.b((byte) -20);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (-98 != (var3 ^ -1)) {
                        break L7;
                      } else {
                        if (var4 == 0) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if ((var3 ^ -1) != -100) {
                        break L8;
                      } else {
                        if (var4 == 0) {
                          break L4;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (-99 == (var3 ^ -1)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                  var2_int = this.f((byte) 32);
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
                var2_int = this.g(param0 + 83);
                if (var4 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              var2_int = this.d(-119);
              break L2;
            }
            if ((var2_int ^ -1) != 0) {
              this.field_g.a(param0 ^ -120, var2_int);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L9: {
                L10: {
                  if (7 == pm.field_T) {
                    break L10;
                  } else {
                    L11: {
                      if (5 != pm.field_T) {
                        break L11;
                      } else {
                        if (ni.b(param0 ^ -100)) {
                          break L11;
                        } else {
                          this.l(-1);
                          if (var4 == 0) {
                            break L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    L12: {
                      if (6 != pm.field_T) {
                        break L12;
                      } else {
                        if (ni.b(86)) {
                          break L12;
                        } else {
                          this.c((byte) 116);
                          if (var4 == 0) {
                            break L9;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    L13: {
                      if ((pm.field_T ^ -1) == -15) {
                        break L13;
                      } else {
                        L14: {
                          if (pm.field_T == 13) {
                            break L14;
                          } else {
                            L15: {
                              if (16 == pm.field_T) {
                                break L15;
                              } else {
                                L16: {
                                  if (0 != pm.field_T) {
                                    break L16;
                                  } else {
                                    L17: {
                                      if (-1 < (this.field_g.field_e ^ -1)) {
                                        break L17;
                                      } else {
                                        if (uc.field_e[pm.field_T].length <= this.field_g.field_e) {
                                          break L17;
                                        } else {
                                          if (uc.field_e[pm.field_T][this.field_g.field_e] == 34) {
                                            break L17;
                                          } else {
                                            dh.field_F = this.field_g.field_e;
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                    L18: {
                                      L19: {
                                        if (ei.field_q != 96) {
                                          break L19;
                                        } else {
                                          if (0 < rd.field_b) {
                                            break L19;
                                          } else {
                                            var3 = 0;
                                            L20: while (true) {
                                              if (uc.field_e[pm.field_T].length <= var3) {
                                                break L19;
                                              } else {
                                                stackOut_82_0 = -35;
                                                stackOut_82_1 = uc.field_e[pm.field_T][var3] ^ -1;
                                                stackIn_90_0 = stackOut_82_0;
                                                stackIn_90_1 = stackOut_82_1;
                                                stackIn_83_0 = stackOut_82_0;
                                                stackIn_83_1 = stackOut_82_1;
                                                if (var4 != 0) {
                                                  break L18;
                                                } else {
                                                  if (stackIn_83_0 != stackIn_83_1) {
                                                    var3++;
                                                    if (var4 == 0) {
                                                      continue L20;
                                                    } else {
                                                      break L19;
                                                    }
                                                  } else {
                                                    dh.field_F = this.field_g.field_e;
                                                    this.field_g.field_e = var3;
                                                    decompiledRegionSelector0 = 1;
                                                    break L0;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_89_0 = ei.field_q;
                                      stackOut_89_1 = 97;
                                      stackIn_90_0 = stackOut_89_0;
                                      stackIn_90_1 = stackOut_89_1;
                                      break L18;
                                    }
                                    L21: {
                                      if (stackIn_90_0 != stackIn_90_1) {
                                        break L21;
                                      } else {
                                        var3 = this.field_g.field_e;
                                        if ((var3 ^ -1) > -1) {
                                          break L21;
                                        } else {
                                          if (var3 >= uc.field_e[pm.field_T].length) {
                                            break L21;
                                          } else {
                                            if (34 == uc.field_e[pm.field_T][var3]) {
                                              this.field_g.field_e = dh.field_F;
                                              decompiledRegionSelector0 = 2;
                                              break L0;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    this.field_g.a(true);
                                    if (var4 == 0) {
                                      break L9;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                this.field_g.a(true);
                                if (var4 == 0) {
                                  break L9;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            this.q(param0 + -30628);
                            if (var4 == 0) {
                              break L9;
                            } else {
                              break L14;
                            }
                          }
                        }
                        this.k(-112);
                        if (var4 == 0) {
                          break L9;
                        } else {
                          break L13;
                        }
                      }
                    }
                    this.b(16383);
                    if (var4 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                this.e((byte) -108);
                break L9;
              }
              decompiledRegionSelector0 = 3;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.I(" + param0 + ')');
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
              return;
            }
          }
        }
    }

    final static void a(String param0, int param1) {
        try {
            System.out.println("Error: " + ee.a("%0a", param0, "\n", param1 ^ -29743));
            if (param1 != -29771) {
                field_e = -33;
            }
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    private final boolean a(int param0) {
        RuntimeException var2 = null;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -2) {
                break L1;
              } else {
                this.a((byte) -79);
                break L1;
              }
            }
            L2: {
              L3: {
                if (-2 == (this.field_c ^ -1)) {
                  break L3;
                } else {
                  if (2 == this.field_c) {
                    break L3;
                  } else {
                    if ((this.field_c ^ -1) == -4) {
                      break L3;
                    } else {
                      if (-5 == (this.field_c ^ -1)) {
                        break L3;
                      } else {
                        if ((this.field_c ^ -1) != -23) {
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_16_0 = 1;
              stackIn_19_0 = stackOut_16_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.E(" + param0 + ')');
        }
        return stackIn_19_0 != 0;
    }

    private final void j(int param0) {
        u var3 = null;
        String var4 = null;
        try {
            int var2_int = 73 % ((param0 - -34) / 34);
            var3 = pl.field_U;
            var4 = lb.field_hc;
            ((mi) ((Object) var3)).a(var4, 320, 240, 1021128, -1);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.OA(" + param0 + ')');
        }
    }

    private final void h(int param0) {
        if (!(null != va.field_c)) {
            return;
        }
        try {
            va.field_c.d(-1);
            if (param0 != 7165) {
                this.h(-118);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.B(" + param0 + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException var2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -55) {
              L1: {
                L2: {
                  pb.h(40, 80, 560, 330, 3487029);
                  pb.h(41, 81, 558, 328, 3487029);
                  if (!ni.b(25)) {
                    break L2;
                  } else {
                    this.j(60);
                    if (SteelSentinels.field_G == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.j((byte) 127);
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.HA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void i(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (gd.field_sb != null) {
                L2: {
                  L3: {
                    if (!dm.field_c) {
                      break L3;
                    } else {
                      ff.field_lb.a(lc.field_a, pg.field_w);
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ff.field_lb.a(ub.field_a, pg.field_w);
                  break L2;
                }
                L4: {
                  if (od.field_e) {
                    break L4;
                  } else {
                    if ((pm.field_U ^ -1) != -1) {
                      break L4;
                    } else {
                      pb.a(jj.field_a.field_Rb, jj.field_a.field_cb, jj.field_a.field_zb, jj.field_a.field_Lb, 0);
                      jj.field_a.a(true, (byte) 127);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                gd.field_sb.a(true, (byte) 126);
                ff.field_lb.a(jc.field_c, bb.field_X);
                break L1;
              } else {
                break L1;
              }
            }
            var2_int = -33 % ((-71 - param0) / 55);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.BB(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int[] stackIn_30_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_29_0 = null;
        int[] stackOut_27_0 = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (-2 != (lb.field_gc ^ -1)) {
                  break L2;
                } else {
                  if (-1 <= (q.field_i ^ -1)) {
                    break L2;
                  } else {
                    if ((hd.field_i ^ -1) <= (dh.field_C.length - 1 ^ -1)) {
                      break L2;
                    } else {
                      ee.c(-2483, 95);
                      hd.field_i = hd.field_i + 1;
                      in.field_k = -1;
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              if (lb.field_gc != 1) {
                break L1;
              } else {
                if (-1 >= (q.field_i ^ -1)) {
                  break L1;
                } else {
                  if (0 < hd.field_i) {
                    ee.c(-2483, 95);
                    in.field_k = -1;
                    hd.field_i = hd.field_i - 1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (param0) {
                break L3;
              } else {
                this.field_g = (rm) null;
                break L3;
              }
            }
            L4: {
              vn.field_o = 4;
              if (param1) {
                stackOut_29_0 = ce.field_t;
                stackIn_30_0 = stackOut_29_0;
                break L4;
              } else {
                stackOut_27_0 = ge.field_m;
                stackIn_30_0 = stackOut_27_0;
                break L4;
              }
            }
            L5: {
              var3_array = stackIn_30_0;
              if (0 > ao.field_C) {
                break L5;
              } else {
                if (!ol.a(var3_array, ao.field_C, 31)) {
                  break L5;
                } else {
                  if (!ve.a(ao.field_A, 1, ao.field_C)) {
                    break L5;
                  } else {
                    ao.field_C = -1;
                    break L5;
                  }
                }
              }
            }
            L6: {
              L7: {
                if (-2 == (lb.field_gc ^ -1)) {
                  break L7;
                } else {
                  if (ao.field_C < 0) {
                    break L6;
                  } else {
                    if ((ao.field_C ^ -1) == (un.field_i ^ -1)) {
                      break L6;
                    } else {
                      if (ao.field_C != in.field_k) {
                        ee.c(-2483, 97);
                        if (var4 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              }
              L8: {
                if (0 == (ao.field_C ^ -1)) {
                  break L8;
                } else {
                  ee.c(-2483, 0);
                  break L8;
                }
              }
              L9: {
                if ((ao.field_C ^ -1) != (in.field_k ^ -1)) {
                  break L9;
                } else {
                  in.field_k = -1;
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L9;
                  }
                }
              }
              if (-1 != ao.field_C) {
                in.field_k = ao.field_C;
                break L6;
              } else {
                break L6;
              }
            }
            un.field_i = ao.field_C;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.T(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        u var10 = null;
        int var11 = 0;
        Object var12_ref = null;
        int var12 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        String var14_ref_String = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        wk[] var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int stackIn_14_0 = 0;
        String stackIn_40_0 = null;
        u stackIn_179_0 = null;
        int stackIn_233_0 = 0;
        wk[] stackIn_275_0 = null;
        int stackIn_279_0 = 0;
        wk stackIn_347_0 = null;
        int stackIn_347_1 = 0;
        int stackIn_347_2 = 0;
        wk stackIn_349_0 = null;
        int stackIn_349_1 = 0;
        int stackIn_349_2 = 0;
        wk stackIn_351_0 = null;
        int stackIn_351_1 = 0;
        int stackIn_351_2 = 0;
        wk stackIn_352_0 = null;
        int stackIn_352_1 = 0;
        int stackIn_352_2 = 0;
        int stackIn_352_3 = 0;
        wk stackIn_353_0 = null;
        int stackIn_353_1 = 0;
        int stackIn_353_2 = 0;
        wk stackIn_355_0 = null;
        int stackIn_355_1 = 0;
        int stackIn_355_2 = 0;
        wk stackIn_356_0 = null;
        int stackIn_356_1 = 0;
        int stackIn_356_2 = 0;
        int stackIn_356_3 = 0;
        int stackIn_367_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        Object stackOut_39_0 = null;
        String stackOut_37_0 = null;
        u stackOut_178_0 = null;
        u stackOut_176_0 = null;
        int stackOut_232_0 = 0;
        int stackOut_230_0 = 0;
        wk[] stackOut_274_0 = null;
        wk[] stackOut_272_0 = null;
        int stackOut_278_0 = 0;
        int stackOut_276_0 = 0;
        wk stackOut_346_0 = null;
        int stackOut_346_1 = 0;
        int stackOut_346_2 = 0;
        wk stackOut_351_0 = null;
        int stackOut_351_1 = 0;
        int stackOut_351_2 = 0;
        int stackOut_351_3 = 0;
        wk stackOut_347_0 = null;
        int stackOut_347_1 = 0;
        int stackOut_347_2 = 0;
        wk stackOut_349_0 = null;
        int stackOut_349_1 = 0;
        int stackOut_349_2 = 0;
        int stackOut_349_3 = 0;
        wk stackOut_352_0 = null;
        int stackOut_352_1 = 0;
        int stackOut_352_2 = 0;
        wk stackOut_355_0 = null;
        int stackOut_355_1 = 0;
        int stackOut_355_2 = 0;
        int stackOut_355_3 = 0;
        wk stackOut_353_0 = null;
        int stackOut_353_1 = 0;
        int stackOut_353_2 = 0;
        int stackOut_353_3 = 0;
        int stackOut_366_0 = 0;
        int stackOut_364_0 = 0;
        var24 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = uc.field_e[this.field_c][param0];
                var5 = 0;
                var6 = 0;
                if (1 == var4_int) {
                  break L2;
                } else {
                  if (-34 == (var4_int ^ -1)) {
                    break L2;
                  } else {
                    if (39 != var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (ib.a(param2 ^ -30230)) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_14_0 = stackOut_11_0;
                  break L3;
                }
              }
              var6 = stackIn_14_0;
              break L1;
            }
            L4: {
              if (var4_int != 28) {
                break L4;
              } else {
                if (!gi.h((byte) -72)) {
                  break L4;
                } else {
                  if (0 == (32 & a.field_c)) {
                    break L4;
                  } else {
                    var5 = 13548069;
                    break L4;
                  }
                }
              }
            }
            L5: {
              if (var6 != 0) {
                break L5;
              } else {
                if (var4_int != 0) {
                  break L5;
                } else {
                  if (!vb.b(106)) {
                    if (-1 == (a.field_c & 32 ^ -1)) {
                      var5 = 13696896;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (-1 < (var4_int ^ -1)) {
                stackOut_39_0 = null;
                stackIn_40_0 = (String) ((Object) stackOut_39_0);
                break L6;
              } else {
                stackOut_37_0 = ti.field_A[var4_int];
                stackIn_40_0 = stackOut_37_0;
                break L6;
              }
            }
            var7 = stackIn_40_0;
            var8 = 0;
            if (param2 == 30241) {
              L7: {
                L8: {
                  var9 = di.field_g;
                  if ((var9 ^ -1) == -1) {
                    break L8;
                  } else {
                    if ((var9 ^ -1) == -2) {
                      break L8;
                    } else {
                      if (var9 == 7) {
                        break L8;
                      } else {
                        L9: {
                          if (-4 != (var9 ^ -1)) {
                            break L9;
                          } else {
                            if (var24 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (5 != var9) {
                            break L10;
                          } else {
                            if (var24 == 0) {
                              break L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (var9 != 9) {
                            break L11;
                          } else {
                            if (var24 == 0) {
                              break L8;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (-11 != (var9 ^ -1)) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                var8 = 1;
                break L7;
              }
              L12: {
                L13: {
                  if ((var4_int ^ -1) != -10) {
                    break L13;
                  } else {
                    if (var8 == 0) {
                      break L13;
                    } else {
                      var7 = ec.field_f;
                      if (var24 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                if (-10 != (var4_int ^ -1)) {
                  break L12;
                } else {
                  if ((di.field_g ^ -1) == -5) {
                    var7 = lb.field_fc;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              L14: {
                if (var6 == 0) {
                  break L14;
                } else {
                  var7 = var7 + " " + (33 * al.field_g / ua.field_r - -(33 * cb.field_l)) + "%";
                  break L14;
                }
              }
              L15: {
                if (var4_int != 8) {
                  break L15;
                } else {
                  L16: {
                    if (gh.field_Jb == 0) {
                      break L16;
                    } else {
                      if (vb.field_g == 0) {
                        break L16;
                      } else {
                        if (gh.field_Jb == 12) {
                          break L16;
                        } else {
                          if (-13 == (vb.field_g ^ -1)) {
                            break L16;
                          } else {
                            L17: {
                              L18: {
                                if (-2 == (gh.field_Jb ^ -1)) {
                                  break L18;
                                } else {
                                  if (vb.field_g != 1) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              var7 = un.field_d;
                              if (var24 == 0) {
                                break L15;
                              } else {
                                break L17;
                              }
                            }
                            L19: {
                              if (gh.field_Jb == 2) {
                                break L19;
                              } else {
                                if (2 == vb.field_g) {
                                  break L19;
                                } else {
                                  if (3 == gh.field_Jb) {
                                    break L19;
                                  } else {
                                    if (vb.field_g == 3) {
                                      break L19;
                                    } else {
                                      if (4 == gh.field_Jb) {
                                        break L19;
                                      } else {
                                        if (4 != vb.field_g) {
                                          break L15;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var7 = fb.field_k;
                            if (var24 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                  }
                  var7 = ti.field_A[7];
                  break L15;
                }
              }
              L20: {
                var9 = -1;
                if (-39 == (var4_int ^ -1)) {
                  L21: {
                    var7 = oe.field_j;
                    var10_int = param0 / 10;
                    var11 = param0 % 10;
                    var12_ref = null;
                    var13_ref_String = "0f94c8";
                    var14_ref_String = var13_ref_String;
                    var15 = 0;
                    var16 = -1;
                    var5 = 0;
                    if (var11 < fm.field_f[var10_int]) {
                      L22: {
                        L23: {
                          var17 = var10_int;
                          if ((var17 ^ -1) != -1) {
                            break L23;
                          } else {
                            if (var24 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        if (1 == var17) {
                          var12_ref = qa.a(-1, jh.field_a[var11]);
                          var16 = ed.field_c[1][var11];
                          var15 = jh.field_a[var11];
                          break L21;
                        } else {
                          if ((var17 ^ -1) != -3) {
                            break L21;
                          } else {
                            if (var24 == 0) {
                              var12_ref = qa.a(param2 ^ -30242, jh.field_a[10 + var11]);
                              var15 = jh.field_a[var11 - -10];
                              var16 = ed.field_c[2][var11];
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      var12_ref = gh.field_jb[5];
                      break L21;
                    } else {
                      if (this.b(false, var10_int, var11)) {
                        var14_ref_String = "8fdfff";
                        var12_ref = gh.field_jb[6];
                        break L21;
                      } else {
                        var14_ref_String = "194761";
                        var12_ref = gh.field_jb[4];
                        break L21;
                      }
                    }
                  }
                  L24: {
                    if (!param1) {
                      break L24;
                    } else {
                      var13_ref_String = "000000";
                      var14_ref_String = var13_ref_String;
                      break L24;
                    }
                  }
                  L25: {
                    var7 = db.a(var7, -27, new String[]{Integer.toString(var11 + 1), (String) (var12_ref), var13_ref_String, var14_ref_String});
                    if (-1 != var16) {
                      L26: {
                        if (var15 > var16) {
                          break L26;
                        } else {
                          var9 = 8;
                          if (var24 == 0) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      if ((3 * var16 / 2 ^ -1) > (var15 ^ -1)) {
                        break L25;
                      } else {
                        var9 = 25;
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  if (!param1) {
                    break L20;
                  } else {
                    if (var11 > fm.field_f[var10_int]) {
                      break L20;
                    } else {
                      var9 = -1;
                      var7 = um.field_cb[var11 + var10_int * 10];
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
              L27: {
                var7 = ke.a(42, var7);
                var10 = pl.field_U;
                var11 = 0;
                if (-1 != (this.field_c ^ -1)) {
                  break L27;
                } else {
                  var10 = ui.field_U;
                  break L27;
                }
              }
              L28: {
                if (-40 == (var4_int ^ -1)) {
                  L29: {
                    var11 = 1;
                    if (var6 == 0) {
                      stackOut_178_0 = ui.field_U;
                      stackIn_179_0 = stackOut_178_0;
                      break L29;
                    } else {
                      stackOut_176_0 = pl.field_U;
                      stackIn_179_0 = stackOut_176_0;
                      break L29;
                    }
                  }
                  var10 = stackIn_179_0;
                  break L28;
                } else {
                  break L28;
                }
              }
              L30: {
                L31: {
                  var12 = ((mi) ((Object) var10)).c(var7);
                  var13 = this.g(127, param0);
                  var14 = this.a(param0, (byte) 109);
                  var15 = this.b(param0, (byte) 27);
                  if (-21 == (var4_int ^ -1)) {
                    break L31;
                  } else {
                    if (var4_int == 21) {
                      break L31;
                    } else {
                      break L30;
                    }
                  }
                }
                var12 = 170 + le.field_K;
                break L30;
              }
              L32: {
                var16 = var14 - (-var13 - -var12) >> 1590460993;
                var17 = this.c(25, param0);
                var18 = var14 - var13;
                var19 = this.c(25, param0);
                var20 = ag.field_o;
                if (!param1) {
                  break L32;
                } else {
                  var20 = vk.field_l;
                  break L32;
                }
              }
              L33: {
                L34: {
                  L35: {
                    if (-15 != (var4_int ^ -1)) {
                      break L35;
                    } else {
                      if (-1 == (d.field_R ^ -1)) {
                        break L34;
                      } else {
                        break L35;
                      }
                    }
                  }
                  L36: {
                    if (-16 != (var4_int ^ -1)) {
                      break L36;
                    } else {
                      if (1 == d.field_R) {
                        break L34;
                      } else {
                        break L36;
                      }
                    }
                  }
                  L37: {
                    if (var4_int != 16) {
                      break L37;
                    } else {
                      if (-1 == (d.field_R ^ -1)) {
                        break L34;
                      } else {
                        break L37;
                      }
                    }
                  }
                  L38: {
                    if (var4_int != 17) {
                      break L38;
                    } else {
                      if (on.field_j == 0) {
                        break L34;
                      } else {
                        break L38;
                      }
                    }
                  }
                  if (-19 != (var4_int ^ -1)) {
                    break L33;
                  } else {
                    if (on.field_j != 1) {
                      break L33;
                    } else {
                      break L34;
                    }
                  }
                }
                var20 = ja.field_e;
                break L33;
              }
              L39: {
                L40: {
                  var20 = pl.field_T;
                  if (-39 == (var4_int ^ -1)) {
                    break L40;
                  } else {
                    if ((var4_int ^ -1) == -26) {
                      break L40;
                    } else {
                      if (var4_int == 26) {
                        break L40;
                      } else {
                        if (var4_int != 39) {
                          break L39;
                        } else {
                          break L40;
                        }
                      }
                    }
                  }
                }
                var20 = sa.field_e;
                break L39;
              }
              L41: {
                if (param1) {
                  stackOut_232_0 = 1044724;
                  stackIn_233_0 = stackOut_232_0;
                  break L41;
                } else {
                  stackOut_230_0 = 1021128;
                  stackIn_233_0 = stackOut_230_0;
                  break L41;
                }
              }
              L42: {
                L43: {
                  var21 = stackIn_233_0;
                  if (-39 == (var4_int ^ -1)) {
                    break L43;
                  } else {
                    if (25 == var4_int) {
                      break L43;
                    } else {
                      if ((var4_int ^ -1) != -27) {
                        break L42;
                      } else {
                        break L43;
                      }
                    }
                  }
                }
                if (!this.a(param2 + -30122, param0)) {
                  break L42;
                } else {
                  if (!param1) {
                    break L42;
                  } else {
                    var20 = wc.field_d;
                    var21 = 0;
                    break L42;
                  }
                }
              }
              L44: {
                L45: {
                  if (this.a(-2)) {
                    break L45;
                  } else {
                    L46: {
                      if ((this.field_c ^ -1) != -18) {
                        break L46;
                      } else {
                        if (0 > this.b(-125, param0)) {
                          break L45;
                        } else {
                          break L46;
                        }
                      }
                    }
                    if ((var4_int ^ -1) == -40) {
                      break L45;
                    } else {
                      L47: {
                        if (-6 != (this.field_c ^ -1)) {
                          break L47;
                        } else {
                          if ((this.b(-73, param0) ^ -1) > -1) {
                            break L45;
                          } else {
                            break L47;
                          }
                        }
                      }
                      if ((this.field_c ^ -1) != -7) {
                        break L44;
                      } else {
                        if (-1 >= (this.b(-81, param0) ^ -1)) {
                          break L44;
                        } else {
                          break L45;
                        }
                      }
                    }
                  }
                }
                L48: {
                  if (param1) {
                    stackOut_274_0 = wc.field_d;
                    stackIn_275_0 = stackOut_274_0;
                    break L48;
                  } else {
                    stackOut_272_0 = hk.field_Tb;
                    stackIn_275_0 = stackOut_272_0;
                    break L48;
                  }
                }
                L49: {
                  var20 = stackIn_275_0;
                  if (param1) {
                    stackOut_278_0 = 0;
                    stackIn_279_0 = stackOut_278_0;
                    break L49;
                  } else {
                    stackOut_276_0 = 1146810;
                    stackIn_279_0 = stackOut_276_0;
                    break L49;
                  }
                }
                var21 = stackIn_279_0;
                break L44;
              }
              L50: {
                if (var5 == 0) {
                  break L50;
                } else {
                  var21 = var5;
                  if (!param1) {
                    break L50;
                  } else {
                    var21 = var21 | 8978312;
                    break L50;
                  }
                }
              }
              L51: {
                L52: {
                  L53: {
                    if (var4_int == 20) {
                      break L53;
                    } else {
                      if ((var4_int ^ -1) != -22) {
                        break L52;
                      } else {
                        break L53;
                      }
                    }
                  }
                  jm.a(var15, var19, var20, 1, -3 + le.field_K + var13, 176);
                  if (var24 == 0) {
                    break L51;
                  } else {
                    break L52;
                  }
                }
                jm.a(var15, var19, var20, 1, var13, var18);
                break L51;
              }
              L54: {
                if (this.a(param2 ^ 30292, param0)) {
                  break L54;
                } else {
                  var21 = 7829367;
                  if (!param1) {
                    break L54;
                  } else {
                    if (25 == var4_int) {
                      break L54;
                    } else {
                      if ((var4_int ^ -1) == -27) {
                        break L54;
                      } else {
                        var21 = 11184895;
                        break L54;
                      }
                    }
                  }
                }
              }
              L55: {
                L56: {
                  if (25 != var4_int) {
                    break L56;
                  } else {
                    L57: {
                      var22 = var13 + (-el.field_Ub.field_A + (var14 + -var13)) / 2;
                      var23 = var15 + (-el.field_Ub.field_F + var19) / 2;
                      var7 = "";
                      if (var21 != 1021128) {
                        break L57;
                      } else {
                        var21 = 2061990;
                        break L57;
                      }
                    }
                    L58: {
                      if ((var21 ^ -1) == -7829368) {
                        var21 = 930889;
                        break L58;
                      } else {
                        break L58;
                      }
                    }
                    el.field_Ub.c(var22, var23, var21);
                    if (var24 == 0) {
                      break L55;
                    } else {
                      break L56;
                    }
                  }
                }
                L59: {
                  if ((var4_int ^ -1) != -27) {
                    break L59;
                  } else {
                    L60: {
                      var22 = (var14 + -var13 + -gm.field_b.field_A) / 2 + var13;
                      if (1021128 != var21) {
                        break L60;
                      } else {
                        var21 = 2061990;
                        break L60;
                      }
                    }
                    L61: {
                      var23 = var15 - -((var19 - gm.field_b.field_F) / 2);
                      var7 = "";
                      if (-7829368 != (var21 ^ -1)) {
                        break L61;
                      } else {
                        var21 = 930889;
                        break L61;
                      }
                    }
                    gm.field_b.c(var22, var23, var21);
                    if (var24 == 0) {
                      break L55;
                    } else {
                      break L59;
                    }
                  }
                }
                L62: {
                  L63: {
                    if (-21 == (var4_int ^ -1)) {
                      break L63;
                    } else {
                      if (21 != var4_int) {
                        break L62;
                      } else {
                        break L63;
                      }
                    }
                  }
                  ((mi) ((Object) var10)).b(var7, 14 + var13, var17 / 5 + var15 + ((mi) ((Object) var10)).field_G, 1146810, -1);
                  if (var24 == 0) {
                    break L55;
                  } else {
                    break L62;
                  }
                }
                L64: {
                  L65: {
                    if ((var12 ^ -1) < (-var13 + var14 ^ -1)) {
                      break L65;
                    } else {
                      if (var11 == 0) {
                        break L64;
                      } else {
                        break L65;
                      }
                    }
                  }
                  L66: {
                    if (var6 != 0) {
                      var21 = 11417637;
                      break L66;
                    } else {
                      break L66;
                    }
                  }
                  discarded$1 = ((mi) ((Object) var10)).a(var7, var13, var15, var18, var17, var21, -1, 1, 1, 0);
                  if (var24 == 0) {
                    break L55;
                  } else {
                    break L64;
                  }
                }
                L67: {
                  if (var6 != 0) {
                    var21 = 11417637;
                    break L67;
                  } else {
                    break L67;
                  }
                }
                ((mi) ((Object) var10)).b(var7, var16, ((mi) ((Object) var10)).field_G + (var15 + var17 / 5), var21, -1);
                if (var9 == -1) {
                  break L55;
                } else {
                  L68: {
                    pb.a(var13 + 2, 0, var14 + -2, 480);
                    stackOut_346_0 = pd.field_Z[var9];
                    stackOut_346_1 = var16 - -var12;
                    stackOut_346_2 = var15 - -2;
                    stackIn_351_0 = stackOut_346_0;
                    stackIn_351_1 = stackOut_346_1;
                    stackIn_351_2 = stackOut_346_2;
                    stackIn_347_0 = stackOut_346_0;
                    stackIn_347_1 = stackOut_346_1;
                    stackIn_347_2 = stackOut_346_2;
                    if (-9 != (var9 ^ -1)) {
                      stackOut_351_0 = (wk) ((Object) stackIn_351_0);
                      stackOut_351_1 = stackIn_351_1;
                      stackOut_351_2 = stackIn_351_2;
                      stackOut_351_3 = 150;
                      stackIn_352_0 = stackOut_351_0;
                      stackIn_352_1 = stackOut_351_1;
                      stackIn_352_2 = stackOut_351_2;
                      stackIn_352_3 = stackOut_351_3;
                      break L68;
                    } else {
                      stackOut_347_0 = (wk) ((Object) stackIn_347_0);
                      stackOut_347_1 = stackIn_347_1;
                      stackOut_347_2 = stackIn_347_2;
                      stackIn_349_0 = stackOut_347_0;
                      stackIn_349_1 = stackOut_347_1;
                      stackIn_349_2 = stackOut_347_2;
                      stackOut_349_0 = (wk) ((Object) stackIn_349_0);
                      stackOut_349_1 = stackIn_349_1;
                      stackOut_349_2 = stackIn_349_2;
                      stackOut_349_3 = 192;
                      stackIn_352_0 = stackOut_349_0;
                      stackIn_352_1 = stackOut_349_1;
                      stackIn_352_2 = stackOut_349_2;
                      stackIn_352_3 = stackOut_349_3;
                      break L68;
                    }
                  }
                  L69: {
                    ((wk) (Object) stackIn_352_0).a(stackIn_352_1, stackIn_352_2, stackIn_352_3);
                    stackOut_352_0 = pd.field_Z[var9];
                    stackOut_352_1 = -28 + var16;
                    stackOut_352_2 = var15 - -2;
                    stackIn_355_0 = stackOut_352_0;
                    stackIn_355_1 = stackOut_352_1;
                    stackIn_355_2 = stackOut_352_2;
                    stackIn_353_0 = stackOut_352_0;
                    stackIn_353_1 = stackOut_352_1;
                    stackIn_353_2 = stackOut_352_2;
                    if (8 == var9) {
                      stackOut_355_0 = (wk) ((Object) stackIn_355_0);
                      stackOut_355_1 = stackIn_355_1;
                      stackOut_355_2 = stackIn_355_2;
                      stackOut_355_3 = 192;
                      stackIn_356_0 = stackOut_355_0;
                      stackIn_356_1 = stackOut_355_1;
                      stackIn_356_2 = stackOut_355_2;
                      stackIn_356_3 = stackOut_355_3;
                      break L69;
                    } else {
                      stackOut_353_0 = (wk) ((Object) stackIn_353_0);
                      stackOut_353_1 = stackIn_353_1;
                      stackOut_353_2 = stackIn_353_2;
                      stackOut_353_3 = 150;
                      stackIn_356_0 = stackOut_353_0;
                      stackIn_356_1 = stackOut_353_1;
                      stackIn_356_2 = stackOut_353_2;
                      stackIn_356_3 = stackOut_353_3;
                      break L69;
                    }
                  }
                  ((wk) (Object) stackIn_356_0).a(stackIn_356_1, stackIn_356_2, stackIn_356_3);
                  pb.c();
                  break L55;
                }
              }
              L70: {
                L71: {
                  if (-21 == (var4_int ^ -1)) {
                    break L71;
                  } else {
                    if (-22 == (var4_int ^ -1)) {
                      break L71;
                    } else {
                      break L70;
                    }
                  }
                }
                L72: {
                  var16 = var16 + le.field_K;
                  if (-21 != (var4_int ^ -1)) {
                    stackOut_366_0 = 170 * ll.field_q / 256;
                    stackIn_367_0 = stackOut_366_0;
                    break L72;
                  } else {
                    stackOut_364_0 = lb.field_ac * 170 / 256;
                    stackIn_367_0 = stackOut_364_0;
                    break L72;
                  }
                }
                var22 = stackIn_367_0;
                pb.a(-1 + (var22 + var16), 3 + var15, 170 + (-var22 - -1), -6 + var17, 0);
                break L70;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void q(int param0) {
        if (va.field_c == null) {
            return;
        }
        if (param0 != -30748) {
            return;
        }
        try {
            va.field_c.b(-12986);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.FB(" + param0 + ')');
        }
    }

    private final void a(String param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var10 = null;
        u var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var18 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var10_ref = pl.field_U;
              var11 = 1021128;
              var12 = param7 + (param4 + param6);
              if (-1 == (var12 ^ -1)) {
                break L1;
              } else {
                param6 = (var12 + param6 * 200) / (var12 * 2);
                param4 = (200 * param4 + var12) / (var12 * 2);
                param7 = (200 * param7 + var12) / (var12 * 2);
                break L1;
              }
            }
            L2: {
              if (!param3) {
                break L2;
              } else {
                var13_int = -11 + param2;
                var14 = 13;
                var15 = 0;
                L3: while (true) {
                  if (var15 >= oe.field_h.length + -1) {
                    break L2;
                  } else {
                    var16 = oe.field_h[var15];
                    var17 = oe.field_h[var15 + 1];
                    pb.a(var16 + 3, var13_int, var17 - (var16 + 5), var14, 12105);
                    var15++;
                    if (var18 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              var13 = param0;
              ((mi) ((Object) var10_ref)).b(var13, 5 + oe.field_h[0], param2, var11, -1);
              var13 = Integer.toString(param5);
              ((mi) ((Object) var10_ref)).c(var13, -1 + oe.field_h[2] - 5, param2, var11, -1);
              var13 = Integer.toString(var12);
              ((mi) ((Object) var10_ref)).c(var13, oe.field_h[3] + -5 - 1, param2, var11, -1);
              var13 = param7 + "%";
              ((mi) ((Object) var10_ref)).c(var13, -6 + oe.field_h[4], param2, var11, -1);
              var13 = param6 + "%";
              if (param8 <= -125) {
                break L4;
              } else {
                this.a(-34, false, -5);
                break L4;
              }
            }
            ((mi) ((Object) var10_ref)).c(var13, -6 + oe.field_h[5], param2, var11, -1);
            var13 = param4 + "%";
            ((mi) ((Object) var10_ref)).c(var13, oe.field_h[6] + -5 + -1, param2, var11, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var10);
            stackOut_12_1 = new StringBuilder().append("ji.CB(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void f(int param0) {
        int discarded$2 = 0;
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        String var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = ql.a(ce.field_t, 18286) ? 1 : 0;
              if (param0 > 63) {
                break L1;
              } else {
                this.field_k = -30;
                break L1;
              }
            }
            L2: {
              if (lc.field_c == null) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            var3 = stackIn_7_0;
            var4 = na.field_v;
            var4 = var4 + " " + hk.a('#', "<br><br>", true, db.a(ag.a(var2_int != 0, true, var3 != 0, false), -48, new String[]{sn.field_h}));
            discarded$2 = va.field_j.a(var4, 10, 70, 620, 180, 1021128, -1, 1, 0, 18);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "ji.IA(" + param0 + ')');
        }
    }

    private final void j(byte param0) {
        RuntimeException var2 = null;
        u var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        int[] var10 = null;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        String var12_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        Object stackOut_44_0 = null;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        var16 = SteelSentinels.field_G;
        try {
          L0: {
            if (param0 >= 49) {
              L1: {
                L2: {
                  var2_ref = pl.field_U;
                  var3 = 1;
                  if (qi.field_d == null) {
                    break L2;
                  } else {
                    if ((qi.field_d.field_C ^ -1) != (var3 ^ -1)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                qi.field_d = bf.a((byte) 122, 1, var3, 3, 10);
                break L1;
              }
              L3: {
                var4 = d.field_R;
                var5 = ib.a(lc.field_c, 7047, var4, qi.field_d);
                if (null == lc.field_c) {
                  break L3;
                } else {
                  if ((lc.field_c.field_y ^ -1) == (var3 ^ -1)) {
                    break L3;
                  } else {
                    var5 = 100;
                    break L3;
                  }
                }
              }
              L4: {
                if (lc.field_c == null) {
                  break L4;
                } else {
                  if (0 <= var5) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                L6: {
                  if (qi.field_d.field_q) {
                    break L6;
                  } else {
                    var6 = lg.field_a;
                    if (var16 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (null == qi.field_d.field_x) {
                    break L7;
                  } else {
                    if (null == qi.field_d.field_z) {
                      break L7;
                    } else {
                      var8 = 1021128;
                      var9 = qi.field_d.field_x[var4];
                      var10 = qi.field_d.field_z[var4];
                      pb.h(48, 88, 544, 286, 1130327);
                      var11_int = 1;
                      L8: while (true) {
                        L9: {
                          L10: {
                            if ((var11_int ^ -1) <= (nm.field_v.length ^ -1)) {
                              break L10;
                            } else {
                              stackOut_29_0 = nm.field_v[var11_int];
                              stackOut_29_1 = 88;
                              stackIn_34_0 = stackOut_29_0;
                              stackIn_34_1 = stackOut_29_1;
                              stackIn_30_0 = stackOut_29_0;
                              stackIn_30_1 = stackOut_29_1;
                              if (var16 != 0) {
                                break L9;
                              } else {
                                pb.d(stackIn_30_0, stackIn_30_1, 265, 1130327);
                                var11_int++;
                                if (var16 == 0) {
                                  continue L8;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          stackOut_33_0 = (21 + ((mi) ((Object) var2_ref)).field_G) / 2;
                          stackOut_33_1 = 88;
                          stackIn_34_0 = stackOut_33_0;
                          stackIn_34_1 = stackOut_33_1;
                          break L9;
                        }
                        var7 = stackIn_34_0 + stackIn_34_1;
                        ((mi) ((Object) var2_ref)).b(k.field_Ib[0], nm.field_v[0] - -5, var7, var8, -1);
                        ((mi) ((Object) var2_ref)).b(k.field_Ib[1], 5 + nm.field_v[1], var7, var8, -1);
                        ((mi) ((Object) var2_ref)).c(k.field_Ib[2], -1 + nm.field_v[3] - 5, var7, var8, -1);
                        ((mi) ((Object) var2_ref)).c(k.field_Ib[3], -5 + nm.field_v[4] + -1, var7, var8, -1);
                        pb.g(48, 109, 544, 1130327);
                        pb.g(48, 353, 544, 1130327);
                        var7 = 126;
                        var6 = im.field_d;
                        var11_int = 0;
                        L11: while (true) {
                          L12: {
                            L13: {
                              if ((var11_int ^ -1) <= -11) {
                                break L13;
                              } else {
                                if (var16 != 0) {
                                  break L12;
                                } else {
                                  L14: {
                                    if (null == var9[var11_int]) {
                                      break L14;
                                    } else {
                                      L15: {
                                        var12_ref_String = var9[var11_int];
                                        var8 = 1021128;
                                        if (var5 == var11_int) {
                                          var8 = 1044724;
                                          break L15;
                                        } else {
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        var13 = uh.a(false, var10[var11_int], 12);
                                        var14 = uh.a(false, ad.a(119, var10[var11_int], 12), 43);
                                        var15 = ad.a(122, var10[var11_int], 516);
                                        stackOut_44_0 = this;
                                        stackIn_47_0 = stackOut_44_0;
                                        stackIn_45_0 = stackOut_44_0;
                                        if ((var5 ^ -1) != (var11_int ^ -1)) {
                                          stackOut_47_0 = this;
                                          stackOut_47_1 = 0;
                                          stackIn_48_0 = stackOut_47_0;
                                          stackIn_48_1 = stackOut_47_1;
                                          break L16;
                                        } else {
                                          stackOut_45_0 = this;
                                          stackOut_45_1 = 1;
                                          stackIn_48_0 = stackOut_45_0;
                                          stackIn_48_1 = stackOut_45_1;
                                          break L16;
                                        }
                                      }
                                      this.a(stackIn_48_1 != 0, false, var7, var14, var12_ref_String, var13, var15, 1 + var11_int);
                                      var6 = k.field_Fb;
                                      break L14;
                                    }
                                  }
                                  var7 += 17;
                                  var11_int++;
                                  if (var16 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            if (lc.field_c == null) {
                              break L12;
                            } else {
                              if (-1 >= (var5 ^ -1)) {
                                break L12;
                              } else {
                                var7 = 345;
                                var10 = lc.field_c.field_q;
                                var11 = g.field_l;
                                var12 = 0;
                                var13 = uh.a(false, var10[var12], 12);
                                var14 = uh.a(false, ad.a(126, var10[var12], 12), 43);
                                var15 = ad.a(113, var10[var12], 516);
                                this.a(true, false, var7, var14, var11, var13, var15, 0);
                                break L12;
                              }
                            }
                          }
                          if (var16 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                }
                var6 = dj.field_h;
                break L5;
              }
              var7 = 368;
              pl.field_U.b(var6, 5 + nm.field_v[0], var7, 1130327, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.MA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        wk[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_18_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_93_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_90_0 = 0;
        var15 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var4_int = uc.field_e[this.field_c][param1];
              if (-1 == var4_int) {
                param2 = false;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var5 = 0;
                if ((var4_int ^ -1) == -2) {
                  break L3;
                } else {
                  if (var4_int == 33) {
                    break L3;
                  } else {
                    if ((var4_int ^ -1) == -40) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L4: {
                if (ib.a(-107)) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L4;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_18_0 = stackOut_15_0;
                  break L4;
                }
              }
              var5 = stackIn_18_0;
              break L2;
            }
            L5: {
              L6: {
                var6 = -107 % ((-50 - param0) / 53);
                var7 = pl.field_T;
                var8 = this.g(127, param1);
                var9 = this.b(param1, (byte) 95);
                var10 = this.a(param1, (byte) 108) + -var8;
                var11 = this.c(25, param1);
                jm.a(var9, var11, var7, 1, var8, var10);
                if ((var4_int ^ -1) <= -1) {
                  break L6;
                } else {
                  ac.field_bb.a(3 + var8, 2 + var9);
                  if (var15 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                var12 = ti.field_A[var4_int];
                if (8 == var4_int) {
                  L8: {
                    L9: {
                      if ((gh.field_Jb ^ -1) == -1) {
                        break L9;
                      } else {
                        if (-1 == (vb.field_g ^ -1)) {
                          break L9;
                        } else {
                          if (-13 == (gh.field_Jb ^ -1)) {
                            break L9;
                          } else {
                            if (12 != vb.field_g) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                    var12 = ti.field_A[7];
                    if (var15 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                  L10: {
                    L11: {
                      if (gh.field_Jb == 1) {
                        break L11;
                      } else {
                        if (-2 != (vb.field_g ^ -1)) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var12 = un.field_d;
                    if (var15 == 0) {
                      break L7;
                    } else {
                      break L10;
                    }
                  }
                  L12: {
                    if (gh.field_Jb == 2) {
                      break L12;
                    } else {
                      if (-3 == (vb.field_g ^ -1)) {
                        break L12;
                      } else {
                        if (-4 == (gh.field_Jb ^ -1)) {
                          break L12;
                        } else {
                          if (vb.field_g == 3) {
                            break L12;
                          } else {
                            if (4 == gh.field_Jb) {
                              break L12;
                            } else {
                              if ((vb.field_g ^ -1) == -5) {
                                break L12;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var12 = fb.field_k;
                  break L7;
                } else {
                  break L7;
                }
              }
              L13: {
                if (var4_int != 0) {
                  break L13;
                } else {
                  if (-21 == (this.field_c ^ -1)) {
                    var12 = fk.field_f;
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                var12 = ke.a(42, var12);
                if (var5 != 0) {
                  var12 = var12 + " " + (al.field_g * 33 / ua.field_r + cb.field_l * 33) + "%";
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (param2) {
                  stackOut_79_0 = 1044724;
                  stackIn_80_0 = stackOut_79_0;
                  break L15;
                } else {
                  stackOut_77_0 = 1021128;
                  stackIn_80_0 = stackOut_77_0;
                  break L15;
                }
              }
              L16: {
                var13 = stackIn_80_0;
                if (!this.a(119, param1)) {
                  L17: {
                    L18: {
                      if (!param2) {
                        break L18;
                      } else {
                        if ((var4_int ^ -1) == -27) {
                          break L18;
                        } else {
                          if (var4_int != 25) {
                            stackOut_92_0 = 11184895;
                            stackIn_93_0 = stackOut_92_0;
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    stackOut_90_0 = 7829367;
                    stackIn_93_0 = stackOut_90_0;
                    break L17;
                  }
                  var13 = stackIn_93_0;
                  break L16;
                } else {
                  break L16;
                }
              }
              L19: {
                var14 = pl.field_U.c(var12);
                if (var5 == 0) {
                  break L19;
                } else {
                  var13 = 11417637;
                  break L19;
                }
              }
              L20: {
                if (var7[0] != null) {
                  var8 = var8 + var7[0].field_z;
                  var10 = var10 - 2 * var7[0].field_z;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                L22: {
                  if (var4_int == 33) {
                    break L22;
                  } else {
                    if (-41 != (var4_int ^ -1)) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
                if (dc.field_g != 16) {
                  break L21;
                } else {
                  if (param2) {
                    break L21;
                  } else {
                    if (0 != (32 & a.field_c)) {
                      break L21;
                    } else {
                      var13 = 13696896;
                      break L21;
                    }
                  }
                }
              }
              L23: {
                if (var14 > var10) {
                  break L23;
                } else {
                  pl.field_U.a(var12, var8 - -(var10 / 2), var9 - -(var11 / 2) + 4, var13, -1);
                  if (var15 == 0) {
                    break L5;
                  } else {
                    break L23;
                  }
                }
              }
              discarded$1 = pl.field_U.a(var12, var8, -pl.field_U.field_G + var11 / 2 + var9, var10, var11, var13, -1, 1, 0, 10);
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void n(int param0) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12_int = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        wk var17_ref_wk = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        String var24_ref_String = null;
        int var25_int = 0;
        wk[] var25 = null;
        int var26 = 0;
        int var27 = 0;
        wk var28 = null;
        int var29 = 0;
        String stackIn_24_0 = null;
        wk[] stackIn_32_0 = null;
        wk[] stackIn_34_0 = null;
        wk[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        String stackIn_70_0 = null;
        int stackIn_75_0 = 0;
        fh stackIn_76_0 = null;
        String stackIn_76_1 = null;
        int stackIn_76_2 = 0;
        int stackIn_76_3 = 0;
        int stackIn_76_4 = 0;
        int stackIn_76_5 = 0;
        int stackIn_76_6 = 0;
        int stackIn_76_7 = 0;
        int stackIn_76_8 = 0;
        int stackIn_76_9 = 0;
        fh stackIn_78_0 = null;
        String stackIn_78_1 = null;
        int stackIn_78_2 = 0;
        int stackIn_78_3 = 0;
        int stackIn_78_4 = 0;
        int stackIn_78_5 = 0;
        int stackIn_78_6 = 0;
        int stackIn_78_7 = 0;
        int stackIn_78_8 = 0;
        int stackIn_78_9 = 0;
        fh stackIn_79_0 = null;
        String stackIn_79_1 = null;
        int stackIn_79_2 = 0;
        int stackIn_79_3 = 0;
        int stackIn_79_4 = 0;
        int stackIn_79_5 = 0;
        int stackIn_79_6 = 0;
        int stackIn_79_7 = 0;
        int stackIn_79_8 = 0;
        int stackIn_79_9 = 0;
        int stackIn_79_10 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_23_0 = null;
        String stackOut_21_0 = null;
        wk[] stackOut_31_0 = null;
        wk[] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        wk[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        String stackOut_69_0 = null;
        String stackOut_67_0 = null;
        int stackOut_74_0 = 0;
        int stackOut_72_0 = 0;
        fh stackOut_75_0 = null;
        String stackOut_75_1 = null;
        int stackOut_75_2 = 0;
        int stackOut_75_3 = 0;
        int stackOut_75_4 = 0;
        int stackOut_75_5 = 0;
        int stackOut_75_6 = 0;
        int stackOut_75_7 = 0;
        int stackOut_75_8 = 0;
        int stackOut_75_9 = 0;
        fh stackOut_78_0 = null;
        String stackOut_78_1 = null;
        int stackOut_78_2 = 0;
        int stackOut_78_3 = 0;
        int stackOut_78_4 = 0;
        int stackOut_78_5 = 0;
        int stackOut_78_6 = 0;
        int stackOut_78_7 = 0;
        int stackOut_78_8 = 0;
        int stackOut_78_9 = 0;
        int stackOut_78_10 = 0;
        fh stackOut_76_0 = null;
        String stackOut_76_1 = null;
        int stackOut_76_2 = 0;
        int stackOut_76_3 = 0;
        int stackOut_76_4 = 0;
        int stackOut_76_5 = 0;
        int stackOut_76_6 = 0;
        int stackOut_76_7 = 0;
        int stackOut_76_8 = 0;
        int stackOut_76_9 = 0;
        int stackOut_76_10 = 0;
        var29 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = this.b(0, (byte) 29);
                var3 = this.g(126, 0);
                var4 = this.a(1, (byte) 114);
                var5 = this.b(2, (byte) -103) - -this.c(25, 2);
                var2_int -= 8;
                var3 -= 8;
                var4 += 8;
                var5 += 8;
                pb.h(var3, var2_int, -var3 + var4, -var2_int + var5, 6316128);
                var6 = this.a(0, (byte) 108) - -4;
                var7 = -var6 + (-4 + this.g(127, 1));
                var8 = this.b(0, (byte) -125);
                var9 = this.c(25, 0);
                var10 = 1064792;
                var11 = gh.field_jb[0];
                if (ol.field_Ub < fm.field_f[ge.field_j]) {
                  break L2;
                } else {
                  if (this.b(false, ge.field_j, ol.field_Ub)) {
                    var11 = gh.field_jb[3];
                    if (var29 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                L4: {
                  var12_int = ge.field_j;
                  if (0 == var12_int) {
                    var11 = gh.field_jb[1];
                    if (var29 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  } else {
                    if ((var12_int ^ -1) == -2) {
                      break L4;
                    } else {
                      if ((var12_int ^ -1) == -3) {
                        break L3;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                var11 = db.a(gh.field_jb[2], -45, new String[]{qa.a(param0 ^ -21346, jh.field_a[ol.field_Ub])});
                if (var29 == 0) {
                  break L1;
                } else {
                  break L3;
                }
              }
              var11 = db.a(gh.field_jb[2], -84, new String[]{qa.a(param0 ^ -21346, jh.field_a[10 + ol.field_Ub])});
              break L1;
            }
            L5: {
              if ((ge.field_j ^ -1) != -1) {
                stackOut_23_0 = v.field_f;
                stackIn_24_0 = stackOut_23_0;
                break L5;
              } else {
                stackOut_21_0 = ul.field_h;
                stackIn_24_0 = stackOut_21_0;
                break L5;
              }
            }
            L6: {
              var12 = db.a(stackIn_24_0, -88, new String[]{Integer.toString(ol.field_Ub + 1), var11});
              pl.field_U.a(var12, var7 / 2 + var6, var8 - -16, 1021128, -1);
              if (0 >= ge.field_j) {
                break L6;
              } else {
                if ((ol.field_Ub ^ -1) > (fm.field_f[ge.field_j] ^ -1)) {
                  var13 = ed.field_c[ge.field_j][ol.field_Ub];
                  var14 = 3 * var13 / 2;
                  var15 = jh.field_a[(-1 + ge.field_j) * 10 - -ol.field_Ub];
                  if ((var14 ^ -1) > (var15 ^ -1)) {
                    break L6;
                  } else {
                    L7: {
                      var16 = 20 + pl.field_U.c(var12) / 2;
                      stackOut_31_0 = pd.field_Z;
                      stackIn_34_0 = stackOut_31_0;
                      stackIn_32_0 = stackOut_31_0;
                      if (var13 >= var15) {
                        stackOut_34_0 = (wk[]) ((Object) stackIn_34_0);
                        stackOut_34_1 = 8;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        break L7;
                      } else {
                        stackOut_32_0 = (wk[]) ((Object) stackIn_32_0);
                        stackOut_32_1 = 25;
                        stackIn_35_0 = stackOut_32_0;
                        stackIn_35_1 = stackOut_32_1;
                        break L7;
                      }
                    }
                    L8: {
                      var17_ref_wk = stackIn_35_0[stackIn_35_1];
                      if (var15 > var13) {
                        stackOut_38_0 = 150;
                        stackIn_39_0 = stackOut_38_0;
                        break L8;
                      } else {
                        stackOut_36_0 = 192;
                        stackIn_39_0 = stackOut_36_0;
                        break L8;
                      }
                    }
                    var18 = stackIn_39_0;
                    var19 = var7 / 2 + var6;
                    var20 = var8 + 2;
                    var17_ref_wk.a(var19 - -var16, var20, var18);
                    var17_ref_wk.a(-var16 + (var19 - var17_ref_wk.field_z), var20, var18);
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
            }
            var3 += 8;
            var2_int = 6 + (var8 - -var9);
            var4 -= 8;
            pb.h(var6, var8, var7, var9, var10);
            var5 = -8 + this.b(2, (byte) -109);
            pb.h(var3, var2_int, var4 + -var3, -var2_int + var5, 2061990);
            var13 = 100;
            var14 = 110;
            var15 = var2_int + 20;
            var16 = 10 + var3;
            pb.h(var16, var15, var13, var14, var10);
            var17 = var13 + var16 + 10;
            if (param0 == 21345) {
              var18 = var15 - 10;
              var19 = var4 - 10 - var17;
              var20 = -var18 + var5;
              var21 = 0;
              var22 = n.field_z;
              var23 = 0;
              L9: while (true) {
                L10: {
                  L11: {
                    if (var22.length <= var23) {
                      break L11;
                    } else {
                      var24 = var22[var23];
                      var25_int = nl.a(var24, param0 ^ 21371);
                      stackOut_44_0 = 0;
                      stackOut_44_1 = var25_int;
                      stackIn_55_0 = stackOut_44_0;
                      stackIn_55_1 = stackOut_44_1;
                      stackIn_45_0 = stackOut_44_0;
                      stackIn_45_1 = stackOut_44_1;
                      if (var29 != 0) {
                        break L10;
                      } else {
                        L12: {
                          if (stackIn_45_0 > stackIn_45_1) {
                            break L12;
                          } else {
                            if ((fm.field_f[var25_int / 10] ^ -1) >= (var25_int % 10 ^ -1)) {
                              break L12;
                            } else {
                              var21++;
                              break L12;
                            }
                          }
                        }
                        var23++;
                        if (var29 == 0) {
                          continue L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  stackOut_54_0 = fm.field_f[2];
                  stackOut_54_1 = 10;
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  break L10;
                }
                L13: {
                  if (stackIn_55_0 != stackIn_55_1) {
                    break L13;
                  } else {
                    var21++;
                    break L13;
                  }
                }
                L14: {
                  if (!ba.a((byte) -57)) {
                    break L14;
                  } else {
                    var21++;
                    break L14;
                  }
                }
                L15: {
                  var22_ref = db.a(c.field_s[10 * ge.field_j - -ol.field_Ub], param0 ^ -21265, new String[]{qf.field_a[var21], id.a(qf.field_a[var21], 0)});
                  var23 = this.a((byte) -128, ol.field_Ub, ge.field_j);
                  if ((15 & fm.field_f[0]) >= var23) {
                    break L15;
                  } else {
                    if ((fm.field_f[ge.field_j] ^ -1) >= (ol.field_Ub ^ -1)) {
                      L16: {
                        if (var23 == 10) {
                          stackOut_69_0 = uj.field_l;
                          stackIn_70_0 = stackOut_69_0;
                          break L16;
                        } else {
                          stackOut_67_0 = db.a(lg.field_b, -26, new String[]{Integer.toString(var23), um.field_cb[var23 - 1]});
                          stackIn_70_0 = stackOut_67_0;
                          break L16;
                        }
                      }
                      var24_ref_String = stackIn_70_0;
                      var22_ref = var22_ref + "<br><br><col=ff0000>" + var24_ref_String + "</col>";
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                }
                L17: {
                  if ((30 + var18 + ff.field_lb.a(var22_ref, var19, 16) ^ -1) > (var5 ^ -1)) {
                    stackOut_74_0 = 0;
                    stackIn_75_0 = stackOut_74_0;
                    break L17;
                  } else {
                    stackOut_72_0 = 1;
                    stackIn_75_0 = stackOut_72_0;
                    break L17;
                  }
                }
                L18: {
                  var24 = stackIn_75_0;
                  pl.field_U.b(um.field_cb[ol.field_Ub + ge.field_j * 10].toUpperCase(), var17, var18 + 20, 16777215, -1);
                  stackOut_75_0 = ff.field_lb;
                  stackOut_75_1 = (String) (var22_ref);
                  stackOut_75_2 = var17;
                  stackOut_75_3 = 30 + var18;
                  stackOut_75_4 = var19;
                  stackOut_75_5 = var20;
                  stackOut_75_6 = 1021128;
                  stackOut_75_7 = -1;
                  stackOut_75_8 = 0;
                  stackOut_75_9 = 0;
                  stackIn_78_0 = stackOut_75_0;
                  stackIn_78_1 = stackOut_75_1;
                  stackIn_78_2 = stackOut_75_2;
                  stackIn_78_3 = stackOut_75_3;
                  stackIn_78_4 = stackOut_75_4;
                  stackIn_78_5 = stackOut_75_5;
                  stackIn_78_6 = stackOut_75_6;
                  stackIn_78_7 = stackOut_75_7;
                  stackIn_78_8 = stackOut_75_8;
                  stackIn_78_9 = stackOut_75_9;
                  stackIn_76_0 = stackOut_75_0;
                  stackIn_76_1 = stackOut_75_1;
                  stackIn_76_2 = stackOut_75_2;
                  stackIn_76_3 = stackOut_75_3;
                  stackIn_76_4 = stackOut_75_4;
                  stackIn_76_5 = stackOut_75_5;
                  stackIn_76_6 = stackOut_75_6;
                  stackIn_76_7 = stackOut_75_7;
                  stackIn_76_8 = stackOut_75_8;
                  stackIn_76_9 = stackOut_75_9;
                  if (var24 != 0) {
                    stackOut_78_0 = (fh) ((Object) stackIn_78_0);
                    stackOut_78_1 = (String) ((Object) stackIn_78_1);
                    stackOut_78_2 = stackIn_78_2;
                    stackOut_78_3 = stackIn_78_3;
                    stackOut_78_4 = stackIn_78_4;
                    stackOut_78_5 = stackIn_78_5;
                    stackOut_78_6 = stackIn_78_6;
                    stackOut_78_7 = stackIn_78_7;
                    stackOut_78_8 = stackIn_78_8;
                    stackOut_78_9 = stackIn_78_9;
                    stackOut_78_10 = 15;
                    stackIn_79_0 = stackOut_78_0;
                    stackIn_79_1 = stackOut_78_1;
                    stackIn_79_2 = stackOut_78_2;
                    stackIn_79_3 = stackOut_78_3;
                    stackIn_79_4 = stackOut_78_4;
                    stackIn_79_5 = stackOut_78_5;
                    stackIn_79_6 = stackOut_78_6;
                    stackIn_79_7 = stackOut_78_7;
                    stackIn_79_8 = stackOut_78_8;
                    stackIn_79_9 = stackOut_78_9;
                    stackIn_79_10 = stackOut_78_10;
                    break L18;
                  } else {
                    stackOut_76_0 = (fh) ((Object) stackIn_76_0);
                    stackOut_76_1 = (String) ((Object) stackIn_76_1);
                    stackOut_76_2 = stackIn_76_2;
                    stackOut_76_3 = stackIn_76_3;
                    stackOut_76_4 = stackIn_76_4;
                    stackOut_76_5 = stackIn_76_5;
                    stackOut_76_6 = stackIn_76_6;
                    stackOut_76_7 = stackIn_76_7;
                    stackOut_76_8 = stackIn_76_8;
                    stackOut_76_9 = stackIn_76_9;
                    stackOut_76_10 = 16;
                    stackIn_79_0 = stackOut_76_0;
                    stackIn_79_1 = stackOut_76_1;
                    stackIn_79_2 = stackOut_76_2;
                    stackIn_79_3 = stackOut_76_3;
                    stackIn_79_4 = stackOut_76_4;
                    stackIn_79_5 = stackOut_76_5;
                    stackIn_79_6 = stackOut_76_6;
                    stackIn_79_7 = stackOut_76_7;
                    stackIn_79_8 = stackOut_76_8;
                    stackIn_79_9 = stackOut_76_9;
                    stackIn_79_10 = stackOut_76_10;
                    break L18;
                  }
                }
                L19: {
                  discarded$1 = ((fh) (Object) stackIn_79_0).a(stackIn_79_1, stackIn_79_2, stackIn_79_3, stackIn_79_4, stackIn_79_5, stackIn_79_6, stackIn_79_7, stackIn_79_8, stackIn_79_9, stackIn_79_10);
                  var25 = bg.field_C;
                  if (0 == nk.field_J) {
                    var25 = pd.field_Q;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                var26 = 8;
                var27 = a.field_c * var26 / 50 % var25.length;
                var28 = var25[var27];
                var15 = var15 + (-2 + (var14 - var28.field_B));
                var25[var27].f(var16 + 2, var15);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.GB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int b(int param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_104_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_91_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_2_0 = 0;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = this.b(-117, param0);
            if (0 > var3_int) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          L7: {
                            var3_int = 0;
                            var5 = this.field_c;
                            if (var5 == 5) {
                              break L7;
                            } else {
                              L8: {
                                if (var5 != 6) {
                                  break L8;
                                } else {
                                  if (var6 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              if ((var5 ^ -1) == -9) {
                                break L6;
                              } else {
                                if (7 == var5) {
                                  break L5;
                                } else {
                                  L9: {
                                    if (14 != var5) {
                                      break L9;
                                    } else {
                                      if (var6 == 0) {
                                        break L5;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  if (var5 == 13) {
                                    break L5;
                                  } else {
                                    if (var5 == 0) {
                                      break L4;
                                    } else {
                                      if (var5 == 17) {
                                        break L3;
                                      } else {
                                        L10: {
                                          if (19 != var5) {
                                            break L10;
                                          } else {
                                            if (var6 == 0) {
                                              break L2;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        L11: {
                                          if ((var5 ^ -1) == -21) {
                                            L12: {
                                              L13: {
                                                L14: {
                                                  var5 = uc.field_e[this.field_c][param0];
                                                  if ((var5 ^ -1) != -26) {
                                                    break L14;
                                                  } else {
                                                    if (var6 == 0) {
                                                      break L13;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                                L15: {
                                                  if (-27 != (var5 ^ -1)) {
                                                    break L15;
                                                  } else {
                                                    if (var6 == 0) {
                                                      break L13;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                                if ((var5 ^ -1) != -40) {
                                                  break L1;
                                                } else {
                                                  if (var6 == 0) {
                                                    break L12;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                              var3_int = 95;
                                              if (var6 == 0) {
                                                break L1;
                                              } else {
                                                break L12;
                                              }
                                            }
                                            var3_int = 376;
                                            if (var6 == 0) {
                                              break L1;
                                            } else {
                                              break L11;
                                            }
                                          } else {
                                            if (var5 != 22) {
                                              break L1;
                                            } else {
                                              if (var6 == 0) {
                                                break L11;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                        }
                                        stackOut_91_0 = param0 * 30 + 150;
                                        stackIn_92_0 = stackOut_91_0;
                                        decompiledRegionSelector0 = 2;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (ni.b(99)) {
                            break L1;
                          } else {
                            var3_int = 379;
                            if (var6 == 0) {
                              break L1;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (ni.b(92)) {
                          break L1;
                        } else {
                          var3_int = 448;
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3_int = 448;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                    L16: {
                      var3_int = uc.field_f[this.field_c] * param0 + 175;
                      if (!nk.f((byte) -15)) {
                        var3_int = var3_int + 4 * param0;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    var4 = uc.field_e[this.field_c][param0];
                    if (34 == var4) {
                      var3_int = 350;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L1;
                    }
                  }
                  var3_int = 130;
                  if (-1 <= (param0 ^ -1)) {
                    break L1;
                  } else {
                    if (param0 < uc.field_e[this.field_c].length - 4) {
                      var3_int = var3_int + 30 * param0;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_71_0 = 29 * (param0 % 10) + 111;
                stackIn_72_0 = stackOut_71_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
              if (this.a(-2)) {
                if (uc.field_e[this.field_c].length < 8) {
                  stackOut_99_0 = 120 + param0 * 30;
                  stackIn_100_0 = stackOut_99_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  stackOut_97_0 = 30 * param0 + 90;
                  stackIn_98_0 = stackOut_97_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                L17: {
                  if (var3_int != 0) {
                    break L17;
                  } else {
                    var3_int = param0 * uc.field_f[this.field_c] + uc.field_c[this.field_c];
                    break L17;
                  }
                }
                var4 = 23 / ((-41 - param1) / 62);
                stackOut_103_0 = this.field_k + var3_int;
                stackIn_104_0 = stackOut_103_0;
                decompiledRegionSelector0 = 5;
                break L0;
              }
            } else {
              stackOut_2_0 = 448;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_72_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_92_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_98_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_100_0;
                } else {
                  return stackIn_104_0;
                }
              }
            }
          }
        }
    }

    private final int f(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_106_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_62_0 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            if (this.field_c == 16) {
              stackOut_4_0 = -1;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == 32) {
                L1: {
                  var2_int = this.field_g.field_e;
                  var3 = this.b(-107, var2_int);
                  if (0 > var2_int) {
                    break L1;
                  } else {
                    if ((var2_int ^ -1) <= (uc.field_e[this.field_c].length ^ -1)) {
                      break L1;
                    } else {
                      if (uc.field_e[this.field_c][var2_int] != -1) {
                        L2: {
                          if (this.field_c != 20) {
                            break L2;
                          } else {
                            if ((var2_int ^ -1) > -1) {
                              break L2;
                            } else {
                              if ((var2_int ^ -1) <= -4) {
                                break L2;
                              } else {
                                stackOut_38_0 = 1;
                                stackIn_39_0 = stackOut_38_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                        if (this.field_c != 0) {
                          if ((var3 ^ -1) > -1) {
                            L3: {
                              if (-6 != (this.field_c ^ -1)) {
                                break L3;
                              } else {
                                if (-4 >= (var2_int ^ -1)) {
                                  break L3;
                                } else {
                                  L4: {
                                    var2_int++;
                                    if (3 <= var2_int) {
                                      var2_int -= 3;
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                  stackOut_76_0 = var2_int;
                                  stackIn_77_0 = stackOut_76_0;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                }
                              }
                            }
                            L5: {
                              if (6 != this.field_c) {
                                break L5;
                              } else {
                                if (var2_int >= 2) {
                                  break L5;
                                } else {
                                  L6: {
                                    var2_int++;
                                    if (2 > var2_int) {
                                      break L6;
                                    } else {
                                      var2_int -= 2;
                                      break L6;
                                    }
                                  }
                                  stackOut_87_0 = var2_int;
                                  stackIn_88_0 = stackOut_87_0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                }
                              }
                            }
                            L7: {
                              if (-20 == (this.field_c ^ -1)) {
                                if (19 != this.field_c) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (uc.field_e[this.field_c] != fa.field_c) {
                                      stackOut_98_0 = 20;
                                      stackIn_99_0 = stackOut_98_0;
                                      break L8;
                                    } else {
                                      stackOut_96_0 = 30;
                                      stackIn_99_0 = stackOut_96_0;
                                      break L8;
                                    }
                                  }
                                  var4 = stackIn_99_0;
                                  if (-1 < (var2_int ^ -1)) {
                                    break L7;
                                  } else {
                                    if (var2_int >= -10 + var4) {
                                      break L7;
                                    } else {
                                      stackOut_103_0 = 10 + var2_int;
                                      stackIn_104_0 = stackOut_103_0;
                                      decompiledRegionSelector0 = 11;
                                      break L0;
                                    }
                                  }
                                }
                              } else {
                                break L7;
                              }
                            }
                            stackOut_105_0 = -1;
                            stackIn_106_0 = stackOut_105_0;
                            decompiledRegionSelector0 = 12;
                            break L0;
                          } else {
                            L9: {
                              var3++;
                              var2_int++;
                              if (4 == var3) {
                                var2_int -= 4;
                                var3 = 0;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            L10: while (true) {
                              if (0 != (uc.field_e[this.field_c][var2_int] ^ -1)) {
                                stackOut_64_0 = var2_int;
                                stackIn_65_0 = stackOut_64_0;
                                decompiledRegionSelector0 = 8;
                                break L0;
                              } else {
                                L11: {
                                  var3++;
                                  var2_int++;
                                  if (-5 != (var3 ^ -1)) {
                                    break L11;
                                  } else {
                                    var2_int -= 4;
                                    var3 = 0;
                                    break L11;
                                  }
                                }
                                if ((this.field_g.field_e ^ -1) != (var2_int ^ -1)) {
                                  continue L10;
                                } else {
                                  stackOut_61_0 = var2_int;
                                  stackIn_62_0 = stackOut_61_0;
                                  decompiledRegionSelector0 = 7;
                                  break L0;
                                }
                              }
                            }
                          }
                        } else {
                          if (34 == uc.field_e[this.field_c][var2_int]) {
                            stackOut_46_0 = dh.field_F;
                            stackIn_47_0 = stackOut_46_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            stackOut_48_0 = var2_int;
                            stackIn_49_0 = stackOut_48_0;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                var2_int = 0;
                L12: while (true) {
                  L13: {
                    L14: {
                      if ((uc.field_e[this.field_c].length ^ -1) >= (var2_int ^ -1)) {
                        break L14;
                      } else {
                        stackOut_18_0 = -1;
                        stackOut_18_1 = uc.field_e[this.field_c][var2_int];
                        stackIn_26_0 = stackOut_18_0;
                        stackIn_26_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (var5 != 0) {
                          break L13;
                        } else {
                          if (stackIn_19_0 != stackIn_19_1) {
                            break L14;
                          } else {
                            var2_int++;
                            if (var5 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    stackOut_25_0 = uc.field_e[this.field_c].length;
                    stackOut_25_1 = var2_int;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    break L13;
                  }
                  if (stackIn_26_0 != stackIn_26_1) {
                    stackOut_29_0 = var2_int;
                    stackIn_30_0 = stackOut_29_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    stackOut_27_0 = -1;
                    stackIn_28_0 = stackOut_27_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackOut_7_0 = 18;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.R(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_28_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_30_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_39_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_47_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_49_0;
                    } else {
                      L15: {
                        if (decompiledRegionSelector0 == 7) {
                          stackOut_62_0 = stackIn_62_0;
                          stackIn_65_0 = stackOut_62_0;
                          stackIn_63_0 = stackOut_62_0;
                          if (var5 != 0) {
                            break L15;
                          } else {
                            return stackIn_63_0;
                          }
                        } else {
                          if (decompiledRegionSelector0 == 8) {
                            break L15;
                          } else {
                            if (decompiledRegionSelector0 == 9) {
                              return stackIn_77_0;
                            } else {
                              if (decompiledRegionSelector0 == 10) {
                                return stackIn_88_0;
                              } else {
                                if (decompiledRegionSelector0 == 11) {
                                  return stackIn_104_0;
                                } else {
                                  return stackIn_106_0;
                                }
                              }
                            }
                          }
                        }
                      }
                      return stackIn_65_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final int d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 114) {
              if (-1 != (this.field_c ^ -1)) {
                stackOut_6_0 = 37;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = ob.field_z.field_B;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = -69;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.TA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    private final int d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_130_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_2_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            if (7 != this.field_c) {
              L1: {
                var2_int = this.field_g.field_e;
                if (param0 < -41) {
                  break L1;
                } else {
                  this.a(true);
                  break L1;
                }
              }
              L2: {
                var3 = this.b(-102, var2_int);
                if ((var2_int ^ -1) > -1) {
                  break L2;
                } else {
                  if ((var2_int ^ -1) <= (uc.field_e[this.field_c].length ^ -1)) {
                    break L2;
                  } else {
                    if (uc.field_e[this.field_c][var2_int] == -1) {
                      break L2;
                    } else {
                      L3: {
                        if ((this.field_c ^ -1) == -20) {
                          if (0 <= var3) {
                            L4: {
                              if (uc.field_e[this.field_c] != fa.field_c) {
                                stackOut_44_0 = 19;
                                stackIn_45_0 = stackOut_44_0;
                                break L4;
                              } else {
                                stackOut_42_0 = 29;
                                stackIn_45_0 = stackOut_42_0;
                                break L4;
                              }
                            }
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L5: {
                        if ((this.field_c ^ -1) == -21) {
                          if ((var3 ^ -1) > -1) {
                            if (-2 != (var2_int ^ -1)) {
                              break L5;
                            } else {
                              if (!this.a(117, 0)) {
                                stackOut_58_0 = -1 + uc.field_e[this.field_c].length;
                                stackIn_59_0 = stackOut_58_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              } else {
                                break L5;
                              }
                            }
                          } else {
                            stackOut_50_0 = 2;
                            stackIn_51_0 = stackOut_50_0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (this.field_c != 5) {
                          break L6;
                        } else {
                          if (var2_int > var3) {
                            if (0 == var3) {
                              stackOut_69_0 = 0;
                              stackIn_70_0 = stackOut_69_0;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              L7: {
                                if (-2 == (var3 ^ -1)) {
                                  break L7;
                                } else {
                                  if (2 != var3) {
                                    if (-4 == (var3 ^ -1)) {
                                      stackOut_80_0 = 2;
                                      stackIn_81_0 = stackOut_80_0;
                                      decompiledRegionSelector0 = 7;
                                      break L0;
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              stackOut_75_0 = 1;
                              stackIn_76_0 = stackOut_75_0;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      L8: {
                        if ((this.field_c ^ -1) != -7) {
                          break L8;
                        } else {
                          if ((var2_int ^ -1) >= (var3 ^ -1)) {
                            break L8;
                          } else {
                            L9: {
                              if ((var3 ^ -1) == -1) {
                                break L9;
                              } else {
                                if (var3 == 1) {
                                  break L9;
                                } else {
                                  L10: {
                                    if (2 == var3) {
                                      break L10;
                                    } else {
                                      if ((var3 ^ -1) != -4) {
                                        break L8;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  stackOut_100_0 = 1;
                                  stackIn_101_0 = stackOut_100_0;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                }
                              }
                            }
                            stackOut_94_0 = 0;
                            stackIn_95_0 = stackOut_94_0;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          }
                        }
                      }
                      if (-1 != (this.field_c ^ -1)) {
                        if ((this.field_c ^ -1) == -18) {
                          if (-1 != (var2_int ^ -1)) {
                            if ((var2_int ^ -1) > (uc.field_e[this.field_c].length - 4 ^ -1)) {
                              stackOut_125_0 = var2_int - 1;
                              stackIn_126_0 = stackOut_125_0;
                              decompiledRegionSelector0 = 13;
                              break L0;
                            } else {
                              stackOut_127_0 = uc.field_e[this.field_c].length + -5;
                              stackIn_128_0 = stackOut_127_0;
                              decompiledRegionSelector0 = 14;
                              break L0;
                            }
                          } else {
                            stackOut_120_0 = uc.field_e[this.field_c].length - 1;
                            stackIn_121_0 = stackOut_120_0;
                            decompiledRegionSelector0 = 12;
                            break L0;
                          }
                        } else {
                          stackOut_129_0 = -1;
                          stackIn_130_0 = stackOut_129_0;
                          decompiledRegionSelector0 = 15;
                          break L0;
                        }
                      } else {
                        L11: {
                          if (uc.field_e[this.field_c][var2_int] != 34) {
                            var2_int--;
                            if (-1 < (var2_int ^ -1)) {
                              var2_int = var2_int + uc.field_e[this.field_c].length;
                              if (34 != uc.field_e[this.field_c][var2_int]) {
                                break L11;
                              } else {
                                var2_int--;
                                break L11;
                              }
                            } else {
                              stackOut_109_0 = var2_int;
                              stackIn_110_0 = stackOut_109_0;
                              decompiledRegionSelector0 = 10;
                              break L0;
                            }
                          } else {
                            break L11;
                          }
                        }
                        stackOut_114_0 = var2_int;
                        stackIn_115_0 = stackOut_114_0;
                        decompiledRegionSelector0 = 11;
                        break L0;
                      }
                    }
                  }
                }
              }
              var2_int = uc.field_e[this.field_c].length + -1;
              L12: while (true) {
                L13: {
                  L14: {
                    if (-1 < (var2_int ^ -1)) {
                      break L14;
                    } else {
                      stackOut_18_0 = 0;
                      stackOut_18_1 = uc.field_e[this.field_c][var2_int] ^ -1;
                      stackIn_26_0 = stackOut_18_0;
                      stackIn_26_1 = stackOut_18_1;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      if (var4 != 0) {
                        break L13;
                      } else {
                        if (stackIn_19_0 != stackIn_19_1) {
                          break L14;
                        } else {
                          var2_int--;
                          if (var4 == 0) {
                            continue L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                  }
                  stackOut_25_0 = 0;
                  stackOut_25_1 = var2_int;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  break L13;
                }
                L15: {
                  if (stackIn_26_0 > stackIn_26_1) {
                    break L15;
                  } else {
                    if ((uc.field_e[this.field_c][var2_int] ^ -1) == -35) {
                      var2_int--;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                }
                stackOut_33_0 = var2_int;
                stackIn_34_0 = stackOut_33_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.AB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_34_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_45_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_51_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_59_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_70_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_76_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_81_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_95_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_101_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_110_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_115_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_121_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_126_0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_128_0;
                                    } else {
                                      return stackIn_130_0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void p(int param0) {
        RuntimeException var2 = null;
        u var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6_int = 0;
        String[] var6 = null;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            var2_ref = pl.field_U;
            pb.h(40, 80, 560, 330, 3487029);
            pb.h(41, 81, 558, 328, 3487029);
            if (ni.b(25)) {
              this.e(1021128);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (qi.field_j != null) {
                  break L1;
                } else {
                  qi.field_j = ol.a(7, true, 0, 10);
                  break L1;
                }
              }
              if (param0 <= -87) {
                L2: {
                  L3: {
                    var3 = 1021128;
                    if (-1 == (oe.field_h[5] ^ -1)) {
                      var5_int = ((mi) ((Object) var2_ref)).c("10000%");
                      var6_int = 5;
                      L4: while (true) {
                        if ((var6_int ^ -1) >= -1) {
                          break L3;
                        } else {
                          var7_int = ((mi) ((Object) var2_ref)).c(pe.field_h[var6_int]) - -8;
                          stackOut_16_0 = Math.max(var7_int, var5_int);
                          stackIn_19_0 = stackOut_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          if (var12 != 0) {
                            break L2;
                          } else {
                            var7_int = stackIn_17_0;
                            oe.field_h[var6_int] = -var7_int + oe.field_h[var6_int - -1];
                            var6_int--;
                            if (var12 == 0) {
                              continue L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  stackOut_18_0 = 105;
                  stackIn_19_0 = stackOut_18_0;
                  break L2;
                }
                L5: {
                  L6: {
                    var4 = stackIn_19_0;
                    if (!qi.field_j.field_r) {
                      break L6;
                    } else {
                      L7: {
                        if (null != qi.field_j.field_z) {
                          break L7;
                        } else {
                          var5 = dj.field_h;
                          if (var12 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var5 = wb.field_d;
                      var6 = qi.field_j.field_z[on.field_j];
                      var7 = qi.field_j.field_x[on.field_j];
                      pb.h(48, 88, 544, 286, 1130327);
                      pb.g(48, 109, 544, 1130327);
                      var8 = 1;
                      L8: while (true) {
                        L9: {
                          L10: {
                            if (oe.field_h.length - 1 <= var8) {
                              break L10;
                            } else {
                              pb.d(oe.field_h[var8], 88, 286, 1130327);
                              var8++;
                              if (var12 != 0) {
                                break L9;
                              } else {
                                if (var12 == 0) {
                                  continue L8;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          ((mi) ((Object) var2_ref)).b(pe.field_h[0], 2 + oe.field_h[0], var4, var3, -1);
                          ((mi) ((Object) var2_ref)).c(pe.field_h[1], -2 + (oe.field_h[2] + -1), var4, var3, -1);
                          ((mi) ((Object) var2_ref)).c(pe.field_h[2], -1 + oe.field_h[3] - 2, var4, var3, -1);
                          ((mi) ((Object) var2_ref)).c(pe.field_h[3], -1 + (-2 + oe.field_h[4]), var4, var3, -1);
                          ((mi) ((Object) var2_ref)).c(pe.field_h[4], -2 + (oe.field_h[5] - 1), var4, var3, -1);
                          ((mi) ((Object) var2_ref)).c(pe.field_h[5], -1 + (-2 + oe.field_h[6]), var4, var3, -1);
                          var4 = 126;
                          var8 = 0;
                          break L9;
                        }
                        var9 = 0;
                        L11: while (true) {
                          L12: {
                            L13: {
                              L14: {
                                if (10 <= var9) {
                                  break L14;
                                } else {
                                  if (var12 != 0) {
                                    break L13;
                                  } else {
                                    L15: {
                                      if (var6[var9] != null) {
                                        var3 = 1021128;
                                        var10 = var6[var9];
                                        var11 = wl.a(50, var10) ? 1 : 0;
                                        var5 = "";
                                        this.a(var10, var9, var4, var11 != 0, var7[3 + var9 * 4], var7[var9 * 4], var7[4 * var9 + 2], var7[4 * var9 - -1], -128);
                                        if (var11 != 0) {
                                          var3 = 1044724;
                                          var8 = 1;
                                          break L15;
                                        } else {
                                          break L15;
                                        }
                                      } else {
                                        break L15;
                                      }
                                    }
                                    var4 += 17;
                                    var9++;
                                    if (var12 == 0) {
                                      continue L11;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              if (var8 == 0) {
                                var4 = 369;
                                var3 = 1021128;
                                break L13;
                              } else {
                                break L12;
                              }
                            }
                            this.a(g.field_l, -1, var4, true, qi.field_j.field_B, qi.field_j.field_p, qi.field_j.field_o, qi.field_j.field_s, -126);
                            break L12;
                          }
                          if (var12 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  var5 = lg.field_a;
                  break L5;
                }
                var4 = 231;
                ((mi) ((Object) var2_ref)).a(var5, 320, var4, 1021128, -1);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.QA(" + param0 + ')');
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

    private final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_91_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_2_0 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = this.b(-72, param0);
            if (0 > var3_int) {
              L1: {
                if ((this.field_c ^ -1) != -6) {
                  break L1;
                } else {
                  if (!ni.b(79)) {
                    L2: {
                      if (3 > param0) {
                        stackOut_13_0 = this.g(126, param0) - -144;
                        stackIn_14_0 = stackOut_13_0;
                        break L2;
                      } else {
                        stackOut_11_0 = 380;
                        stackIn_14_0 = stackOut_11_0;
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (param1 > 107) {
                L3: {
                  if (-7 != (this.field_c ^ -1)) {
                    break L3;
                  } else {
                    if (!ni.b(30)) {
                      L4: {
                        if (-3 < (param0 ^ -1)) {
                          stackOut_27_0 = this.g(127, param0) + 160;
                          stackIn_28_0 = stackOut_27_0;
                          break L4;
                        } else {
                          stackOut_25_0 = 380;
                          stackIn_28_0 = stackOut_25_0;
                          break L4;
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-8 == (this.field_c ^ -1)) {
                  stackOut_32_0 = 140 + this.g(125, param0);
                  stackIn_33_0 = stackOut_32_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  L5: {
                    if (-15 == (this.field_c ^ -1)) {
                      break L5;
                    } else {
                      if (this.field_c != 13) {
                        if (0 == this.field_c) {
                          var4 = uc.field_e[this.field_c][param0];
                          if (34 != var4) {
                            stackOut_46_0 = 450;
                            stackIn_47_0 = stackOut_46_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            stackOut_44_0 = 150;
                            stackIn_45_0 = stackOut_44_0;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          }
                        } else {
                          if (-18 == (this.field_c ^ -1)) {
                            stackOut_51_0 = -this.g(127, param0) + 640;
                            stackIn_52_0 = stackOut_51_0;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            if (!this.a(-2)) {
                              if (15 == this.field_c) {
                                stackOut_59_0 = 600;
                                stackIn_60_0 = stackOut_59_0;
                                decompiledRegionSelector0 = 10;
                                break L0;
                              } else {
                                if (this.field_c != 19) {
                                  L6: {
                                    if (-21 == (this.field_c ^ -1)) {
                                      L7: {
                                        L8: {
                                          var4 = uc.field_e[this.field_c][param0];
                                          if (25 != var4) {
                                            break L8;
                                          } else {
                                            if (var5 == 0) {
                                              break L7;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        if ((var4 ^ -1) == -27) {
                                          break L7;
                                        } else {
                                          if (39 != var4) {
                                            break L6;
                                          } else {
                                            if (var5 == 0) {
                                              stackOut_88_0 = -this.g(125, param0) + 640;
                                              stackIn_89_0 = stackOut_88_0;
                                              decompiledRegionSelector0 = 13;
                                              break L0;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_86_0 = 60 + this.g(127, param0);
                                      stackIn_87_0 = stackOut_86_0;
                                      decompiledRegionSelector0 = 12;
                                      break L0;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  stackOut_90_0 = uc.field_d[this.field_c];
                                  stackIn_91_0 = stackOut_90_0;
                                  decompiledRegionSelector0 = 14;
                                  break L0;
                                } else {
                                  L9: {
                                    stackOut_62_0 = this.g(126, param0);
                                    stackIn_67_0 = stackOut_62_0;
                                    stackIn_63_0 = stackOut_62_0;
                                    if (uc.field_e[this.field_c] != fa.field_c) {
                                      stackOut_67_0 = stackIn_67_0;
                                      stackOut_67_1 = 260;
                                      stackIn_68_0 = stackOut_67_0;
                                      stackIn_68_1 = stackOut_67_1;
                                      break L9;
                                    } else {
                                      stackOut_63_0 = stackIn_63_0;
                                      stackIn_65_0 = stackOut_63_0;
                                      stackOut_65_0 = stackIn_65_0;
                                      stackOut_65_1 = 180;
                                      stackIn_68_0 = stackOut_65_0;
                                      stackIn_68_1 = stackOut_65_1;
                                      break L9;
                                    }
                                  }
                                  stackOut_68_0 = stackIn_68_0 - -stackIn_68_1;
                                  stackIn_69_0 = stackOut_68_0;
                                  decompiledRegionSelector0 = 11;
                                  break L0;
                                }
                              }
                            } else {
                              stackOut_54_0 = 640 + -this.g(126, param0);
                              stackIn_55_0 = stackOut_54_0;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            }
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  stackOut_38_0 = 160 + this.g(125, param0);
                  stackIn_39_0 = stackOut_38_0;
                  decompiledRegionSelector0 = 5;
                  break L0;
                }
              } else {
                stackOut_16_0 = 79;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_2_0 = var3_int * 159 - -159;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.KA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_28_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_33_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_39_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_45_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_47_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_52_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_55_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_60_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_69_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_87_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_89_0;
                                  } else {
                                    return stackIn_91_0;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 50) {
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_3_0 = sj.field_y.a(param1, -742, "");
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("ji.VA(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    private final boolean f(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 111) {
                break L1;
              } else {
                this.a(18, false);
                break L1;
              }
            }
            if (ve.a(ge.field_m, 1, param0)) {
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!ve.a(ao.field_A, param1 + -110, param0)) {
                L2: {
                  if (!ve.a(ao.field_E, 1, param0)) {
                    break L2;
                  } else {
                    L3: {
                      if (ni.b(param1 ^ 54)) {
                        break L3;
                      } else {
                        if (0 >= rd.field_b) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
                stackOut_22_0 = 1;
                stackIn_23_0 = stackOut_22_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.W(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              return stackIn_23_0 != 0;
            }
          }
        }
    }

    private final void e(int param0) {
        u var2 = null;
        String var3 = null;
        try {
            var2 = pl.field_U;
            var3 = lb.field_hc;
            ((mi) ((Object) var2)).a(var3, 320, 240, param0, -1);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.CA(" + param0 + ')');
        }
    }

    private final void o(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int[] var7 = null;
        int[] var8 = null;
        int var8_int = 0;
        int var9_int = 0;
        int[] var9 = null;
        int var10 = 0;
        nk var11_ref_nk = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_123_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_135_0 = 0;
        int stackIn_236_0 = 0;
        int stackIn_385_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_120_0 = 0;
        int stackOut_120_1 = 0;
        int stackOut_122_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        int stackOut_134_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_384_0 = 0;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -29628) {
                break L1;
              } else {
                field_f = (String[]) null;
                break L1;
              }
            }
            L2: {
              if (lb.field_gc != 1) {
                break L2;
              } else {
                L3: {
                  L4: {
                    var2_int = -17 + va.field_d;
                    if (-1 < (var2_int ^ -1)) {
                      break L4;
                    } else {
                      if (5 < var2_int) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    var2_int = va.field_d - 24;
                    if ((var2_int ^ -1) > -1) {
                      break L5;
                    } else {
                      if (var2_int >= 3) {
                        break L5;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = 0;
                  break L3;
                }
                L6: {
                  L7: {
                    L8: {
                      L9: {
                        L10: {
                          L11: {
                            L12: {
                              L13: {
                                L14: {
                                  var3 = 0;
                                  var4 = 0;
                                  var5 = va.field_d;
                                  if (0 != var5) {
                                    break L14;
                                  } else {
                                    if (var12 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                L15: {
                                  if (2 != var5) {
                                    break L15;
                                  } else {
                                    if (var12 == 0) {
                                      break L12;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                L16: {
                                  if (4 != var5) {
                                    break L16;
                                  } else {
                                    if (var12 == 0) {
                                      break L11;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                if (1 == var5) {
                                  break L10;
                                } else {
                                  if (-4 == (var5 ^ -1)) {
                                    break L9;
                                  } else {
                                    if (5 == var5) {
                                      break L8;
                                    } else {
                                      if (9 == var5) {
                                        break L7;
                                      } else {
                                        if ((var5 ^ -1) != -14) {
                                          break L6;
                                        } else {
                                          if (var12 == 0) {
                                            break L7;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var2_int = 0;
                              var3 = 0;
                              var4 = 3;
                              if (var12 == 0) {
                                break L6;
                              } else {
                                break L12;
                              }
                            }
                            var4 = 6;
                            var2_int = 2;
                            var3 = 3;
                            if (var12 == 0) {
                              break L6;
                            } else {
                              break L11;
                            }
                          }
                          var3 = 6;
                          var4 = 12;
                          var2_int = 4;
                          if (var12 == 0) {
                            break L6;
                          } else {
                            break L10;
                          }
                        }
                        var4 = 3;
                        var3 = 0;
                        var2_int = 0;
                        if (var12 == 0) {
                          break L6;
                        } else {
                          break L9;
                        }
                      }
                      var4 = 6;
                      var3 = 3;
                      var2_int = 2;
                      if (var12 == 0) {
                        break L6;
                      } else {
                        break L8;
                      }
                    }
                    var3 = 6;
                    var2_int = 4;
                    var4 = 12;
                    if (var12 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                  var4 = 12;
                  var2_int = -1 + va.field_d;
                  fe.field_D[0] = vn.a(fe.field_D[0], 67108864);
                  var3 = 0;
                  fe.field_D[1] = vn.a(fe.field_D[1], 1);
                  fe.field_D[0] = vn.a(fe.field_D[0], 1073741824);
                  rn.field_D[1] = vn.a(rn.field_D[1], 131072);
                  fe.field_D[0] = vn.a(fe.field_D[0], 16777216);
                  break L6;
                }
                L17: {
                  if (va.field_d != 13) {
                    break L17;
                  } else {
                    jc.field_f = 2;
                    li.field_v = 1000;
                    fm.field_f[0] = 10;
                    dm.field_a = 8;
                    h.field_G = 1000;
                    fm.field_f[1] = 10;
                    fm.field_f[2] = 10;
                    break L17;
                  }
                }
                L18: {
                  L19: {
                    L20: {
                      L21: {
                        L22: {
                          L23: {
                            L24: {
                              L25: {
                                L26: {
                                  L27: {
                                    L28: {
                                      L29: {
                                        L30: {
                                          L31: {
                                            var5 = va.field_d - var2_int;
                                            if (var5 != 0) {
                                              break L31;
                                            } else {
                                              if (var12 == 0) {
                                                jg.field_j = true;
                                                var5 = var3;
                                                L32: while (true) {
                                                  stackOut_120_0 = var4 ^ -1;
                                                  stackOut_120_1 = var5 ^ -1;
                                                  stackIn_121_0 = stackOut_120_0;
                                                  stackIn_121_1 = stackOut_120_1;
                                                  L33: while (true) {
                                                    L34: {
                                                      if (stackIn_121_0 >= stackIn_121_1) {
                                                        break L34;
                                                      } else {
                                                        var6 = n.field_z[var5];
                                                        rn.field_D[var6 >> -1478273563] = ec.a(rn.field_D[var6 >> -1478273563], 1 << ec.a(var6, 31) ^ -1);
                                                        var7 = ne.a(var6, (byte) 28);
                                                        var8 = var7;
                                                        stackOut_122_0 = 0;
                                                        stackIn_385_0 = stackOut_122_0;
                                                        stackIn_123_0 = stackOut_122_0;
                                                        if (var12 != 0) {
                                                          break L18;
                                                        } else {
                                                          var9_int = stackIn_123_0;
                                                          L35: while (true) {
                                                            L36: {
                                                              if (var8.length <= var9_int) {
                                                                break L36;
                                                              } else {
                                                                var10 = var8[var9_int];
                                                                var11_ref_nk = ul.a(var10, (byte) 67);
                                                                stackOut_125_0 = -1;
                                                                stackOut_125_1 = var11_ref_nk.field_Q & 2055 ^ -1;
                                                                stackIn_121_0 = stackOut_125_0;
                                                                stackIn_121_1 = stackOut_125_1;
                                                                stackIn_126_0 = stackOut_125_0;
                                                                stackIn_126_1 = stackOut_125_1;
                                                                if (var12 != 0) {
                                                                  continue L33;
                                                                } else {
                                                                  L37: {
                                                                    if (stackIn_126_0 != stackIn_126_1) {
                                                                      rn.field_D[var10 >> 962260645] = ec.a(rn.field_D[var10 >> 962260645], 1 << ec.a(var10, 31) ^ -1);
                                                                      break L37;
                                                                    } else {
                                                                      break L37;
                                                                    }
                                                                  }
                                                                  var9_int++;
                                                                  if (var12 == 0) {
                                                                    continue L35;
                                                                  } else {
                                                                    break L36;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var5++;
                                                            if (var12 == 0) {
                                                              continue L32;
                                                            } else {
                                                              break L34;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (var12 == 0) {
                                                      break L19;
                                                    } else {
                                                      break L30;
                                                    }
                                                  }
                                                }
                                              } else {
                                                break L31;
                                              }
                                            }
                                          }
                                          if (1 == var5) {
                                            break L30;
                                          } else {
                                            if (var5 == 8) {
                                              break L29;
                                            } else {
                                              L38: {
                                                if (-8 != (var5 ^ -1)) {
                                                  break L38;
                                                } else {
                                                  if (var12 == 0) {
                                                    break L28;
                                                  } else {
                                                    break L38;
                                                  }
                                                }
                                              }
                                              L39: {
                                                if (6 != var5) {
                                                  break L39;
                                                } else {
                                                  if (var12 == 0) {
                                                    break L27;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                              }
                                              L40: {
                                                if (10 != var5) {
                                                  break L40;
                                                } else {
                                                  if (var12 == 0) {
                                                    break L26;
                                                  } else {
                                                    break L40;
                                                  }
                                                }
                                              }
                                              L41: {
                                                if (11 != var5) {
                                                  break L41;
                                                } else {
                                                  if (var12 == 0) {
                                                    break L25;
                                                  } else {
                                                    break L41;
                                                  }
                                                }
                                              }
                                              if ((var5 ^ -1) == -13) {
                                                break L24;
                                              } else {
                                                if (var5 == 16) {
                                                  break L23;
                                                } else {
                                                  L42: {
                                                    if (-16 != (var5 ^ -1)) {
                                                      break L42;
                                                    } else {
                                                      if (var12 == 0) {
                                                        break L22;
                                                      } else {
                                                        break L42;
                                                      }
                                                    }
                                                  }
                                                  if (14 == var5) {
                                                    break L21;
                                                  } else {
                                                    if (var5 == 17) {
                                                      break L20;
                                                    } else {
                                                      L43: {
                                                        if (var5 == 24) {
                                                          L44: {
                                                            jg.field_j = true;
                                                            if ((fm.field_f[var2_int] ^ -1) == -11) {
                                                              break L44;
                                                            } else {
                                                              fm.field_f[var2_int] = 10;
                                                              if ((var2_int ^ -1) != -1) {
                                                                break L19;
                                                              } else {
                                                                if (jc.field_f == 0) {
                                                                  jc.field_f = 1;
                                                                  if (var12 == 0) {
                                                                    break L19;
                                                                  } else {
                                                                    break L44;
                                                                  }
                                                                } else {
                                                                  break L19;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          fm.field_f[var2_int] = 0;
                                                          if (0 != var2_int) {
                                                            break L19;
                                                          } else {
                                                            if (jc.field_f <= 0) {
                                                              break L19;
                                                            } else {
                                                              jc.field_f = 0;
                                                              if (var12 == 0) {
                                                                break L19;
                                                              } else {
                                                                break L43;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          break L43;
                                                        }
                                                      }
                                                      decompiledRegionSelector0 = 0;
                                                      break L0;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        jg.field_j = true;
                                        var5 = var3;
                                        L45: while (true) {
                                          L46: {
                                            if ((var5 ^ -1) <= (var4 ^ -1)) {
                                              break L46;
                                            } else {
                                              var6 = n.field_z[var5];
                                              rn.field_D[var6 >> 1567333829] = vn.a(rn.field_D[var6 >> 1567333829], 1 << ec.a(var6, 31));
                                              var7 = ne.a(var6, (byte) 28);
                                              var8 = var7;
                                              stackOut_134_0 = 0;
                                              stackIn_385_0 = stackOut_134_0;
                                              stackIn_135_0 = stackOut_134_0;
                                              if (var12 != 0) {
                                                break L18;
                                              } else {
                                                var9_int = stackIn_135_0;
                                                L47: while (true) {
                                                  L48: {
                                                    L49: {
                                                      if ((var9_int ^ -1) <= (var8.length ^ -1)) {
                                                        break L49;
                                                      } else {
                                                        var10 = var8[var9_int];
                                                        rn.field_D[var10 >> -996687099] = vn.a(rn.field_D[var10 >> -996687099], 1 << ec.a(31, var10));
                                                        var9_int++;
                                                        if (var12 != 0) {
                                                          break L48;
                                                        } else {
                                                          if (var12 == 0) {
                                                            continue L47;
                                                          } else {
                                                            break L49;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var8 = ki.b(var6, (byte) -110);
                                                    break L48;
                                                  }
                                                  var9 = var8;
                                                  var10 = 0;
                                                  L50: while (true) {
                                                    L51: {
                                                      L52: {
                                                        if (var9.length <= var10) {
                                                          break L52;
                                                        } else {
                                                          var11 = var9[var10];
                                                          fe.field_D[var11 >> -1104142747] = vn.a(fe.field_D[var11 >> -1104142747], 1 << ec.a(var11, 31));
                                                          var10++;
                                                          if (var12 != 0) {
                                                            break L51;
                                                          } else {
                                                            if (var12 == 0) {
                                                              continue L50;
                                                            } else {
                                                              break L52;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var5++;
                                                      break L51;
                                                    }
                                                    if (var12 == 0) {
                                                      continue L45;
                                                    } else {
                                                      break L46;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var12 == 0) {
                                            break L19;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      jg.field_j = true;
                                      var5 = 0;
                                      L53: while (true) {
                                        L54: {
                                          L55: {
                                            if ((var5 ^ -1) <= (rn.field_D.length ^ -1)) {
                                              break L55;
                                            } else {
                                              rn.field_D[var5] = 0;
                                              var5++;
                                              if (var12 != 0) {
                                                break L54;
                                              } else {
                                                if (var12 == 0) {
                                                  continue L53;
                                                } else {
                                                  break L55;
                                                }
                                              }
                                            }
                                          }
                                          var5 = 0;
                                          break L54;
                                        }
                                        L56: while (true) {
                                          L57: {
                                            if ((fe.field_D.length ^ -1) >= (var5 ^ -1)) {
                                              break L57;
                                            } else {
                                              fe.field_D[var5] = 0;
                                              var5++;
                                              if (var12 != 0) {
                                                break L19;
                                              } else {
                                                if (var12 == 0) {
                                                  continue L56;
                                                } else {
                                                  break L57;
                                                }
                                              }
                                            }
                                          }
                                          if (var12 == 0) {
                                            break L19;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                    }
                                    jg.field_j = true;
                                    li.field_v = Math.min(100 + li.field_v, 1000);
                                    h.field_G = h.field_G + 100;
                                    if (var12 == 0) {
                                      break L19;
                                    } else {
                                      break L27;
                                    }
                                  }
                                  jg.field_j = true;
                                  li.field_v = Math.max(li.field_v - 100, 0);
                                  h.field_G = Math.max(h.field_G - 100, 0);
                                  if (var12 == 0) {
                                    break L19;
                                  } else {
                                    break L26;
                                  }
                                }
                                jg.field_j = true;
                                jc.field_f = 0;
                                var5 = 0;
                                L58: while (true) {
                                  L59: {
                                    L60: {
                                      if (rn.field_D.length <= var5) {
                                        break L60;
                                      } else {
                                        rn.field_D[var5] = 0;
                                        var5++;
                                        if (var12 != 0) {
                                          break L59;
                                        } else {
                                          if (var12 == 0) {
                                            continue L58;
                                          } else {
                                            break L60;
                                          }
                                        }
                                      }
                                    }
                                    var5 = 0;
                                    break L59;
                                  }
                                  L61: while (true) {
                                    L62: {
                                      L63: {
                                        if ((var5 ^ -1) <= (fe.field_D.length ^ -1)) {
                                          break L63;
                                        } else {
                                          fe.field_D[var5] = 0;
                                          var5++;
                                          if (var12 != 0) {
                                            break L62;
                                          } else {
                                            if (var12 == 0) {
                                              continue L61;
                                            } else {
                                              break L63;
                                            }
                                          }
                                        }
                                      }
                                      dm.field_a = 0;
                                      fm.field_f[0] = 0;
                                      li.field_v = 0;
                                      h.field_G = 0;
                                      fm.field_f[1] = 0;
                                      fm.field_f[2] = 0;
                                      break L62;
                                    }
                                    if (var12 == 0) {
                                      break L19;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                              dm.field_a = 0;
                              jg.field_j = true;
                              jc.field_f = 1;
                              var5 = 0;
                              L64: while (true) {
                                L65: {
                                  L66: {
                                    if ((rn.field_D.length ^ -1) >= (var5 ^ -1)) {
                                      break L66;
                                    } else {
                                      rn.field_D[var5] = 0;
                                      var5++;
                                      if (var12 != 0) {
                                        break L65;
                                      } else {
                                        if (var12 == 0) {
                                          continue L64;
                                        } else {
                                          break L66;
                                        }
                                      }
                                    }
                                  }
                                  var5 = 0;
                                  break L65;
                                }
                                L67: while (true) {
                                  L68: {
                                    L69: {
                                      if (var5 >= fe.field_D.length) {
                                        break L69;
                                      } else {
                                        fe.field_D[var5] = 0;
                                        var5++;
                                        if (var12 != 0) {
                                          break L68;
                                        } else {
                                          if (var12 == 0) {
                                            continue L67;
                                          } else {
                                            break L69;
                                          }
                                        }
                                      }
                                    }
                                    h.field_G = 0;
                                    li.field_v = 0;
                                    var5 = 55;
                                    rn.field_D[var5 >> -1389619515] = vn.a(rn.field_D[var5 >> -1389619515], 1 << ec.a(var5, 31));
                                    break L68;
                                  }
                                  var6_ref_int__ = ne.a(var5, (byte) 28);
                                  var7 = var6_ref_int__;
                                  var8_int = 0;
                                  L70: while (true) {
                                    L71: {
                                      L72: {
                                        if (var8_int >= var7.length) {
                                          break L72;
                                        } else {
                                          var9_int = var7[var8_int];
                                          rn.field_D[var9_int >> 1384330725] = vn.a(rn.field_D[var9_int >> 1384330725], 1 << ec.a(31, var9_int));
                                          h.field_G = h.field_G + sj.field_v[var9_int];
                                          var8_int++;
                                          if (var12 != 0) {
                                            break L71;
                                          } else {
                                            if (var12 == 0) {
                                              continue L70;
                                            } else {
                                              break L72;
                                            }
                                          }
                                        }
                                      }
                                      var7 = ki.b(var5, (byte) -103);
                                      break L71;
                                    }
                                    var8 = var7;
                                    var9_int = 0;
                                    L73: while (true) {
                                      L74: {
                                        L75: {
                                          if ((var9_int ^ -1) <= (var8.length ^ -1)) {
                                            break L75;
                                          } else {
                                            var10 = var8[var9_int];
                                            fe.field_D[var10 >> -1446709019] = vn.a(fe.field_D[var10 >> -1446709019], 1 << ec.a(31, var10));
                                            h.field_G = h.field_G + qf.field_h[var10];
                                            var9_int++;
                                            if (var12 != 0) {
                                              break L74;
                                            } else {
                                              if (var12 == 0) {
                                                continue L73;
                                              } else {
                                                break L75;
                                              }
                                            }
                                          }
                                        }
                                        fm.field_f[0] = 3;
                                        fm.field_f[1] = 0;
                                        fm.field_f[2] = 0;
                                        break L74;
                                      }
                                      if (var12 == 0) {
                                        break L19;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            jc.field_f = 2;
                            dm.field_a = 8;
                            jg.field_j = true;
                            var5 = 0;
                            L76: while (true) {
                              L77: {
                                L78: {
                                  if ((rn.field_D.length ^ -1) >= (var5 ^ -1)) {
                                    break L78;
                                  } else {
                                    rn.field_D[var5] = 0;
                                    var5++;
                                    if (var12 != 0) {
                                      break L77;
                                    } else {
                                      if (var12 == 0) {
                                        continue L76;
                                      } else {
                                        break L78;
                                      }
                                    }
                                  }
                                }
                                var5 = 0;
                                break L77;
                              }
                              L79: while (true) {
                                L80: {
                                  L81: {
                                    if (var5 >= fe.field_D.length) {
                                      break L81;
                                    } else {
                                      fe.field_D[var5] = 0;
                                      var5++;
                                      if (var12 != 0) {
                                        break L80;
                                      } else {
                                        if (var12 == 0) {
                                          continue L79;
                                        } else {
                                          break L81;
                                        }
                                      }
                                    }
                                  }
                                  h.field_G = 0;
                                  li.field_v = 0;
                                  break L80;
                                }
                                var5 = 0;
                                L82: while (true) {
                                  L83: {
                                    if ((var5 ^ -1) <= -4) {
                                      break L83;
                                    } else {
                                      var6 = n.field_z[var5];
                                      rn.field_D[var6 >> 1948565669] = vn.a(rn.field_D[var6 >> 1948565669], 1 << ec.a(31, var6));
                                      var7 = ne.a(var6, (byte) 28);
                                      var8 = var7;
                                      stackOut_235_0 = 0;
                                      stackIn_385_0 = stackOut_235_0;
                                      stackIn_236_0 = stackOut_235_0;
                                      if (var12 != 0) {
                                        break L18;
                                      } else {
                                        var9_int = stackIn_236_0;
                                        L84: while (true) {
                                          L85: {
                                            L86: {
                                              if ((var9_int ^ -1) <= (var8.length ^ -1)) {
                                                break L86;
                                              } else {
                                                var10 = var8[var9_int];
                                                rn.field_D[var10 >> 993871525] = vn.a(rn.field_D[var10 >> 993871525], 1 << ec.a(31, var10));
                                                h.field_G = h.field_G + sj.field_v[var10];
                                                var9_int++;
                                                if (var12 != 0) {
                                                  break L85;
                                                } else {
                                                  if (var12 == 0) {
                                                    continue L84;
                                                  } else {
                                                    break L86;
                                                  }
                                                }
                                              }
                                            }
                                            var8 = ki.b(var6, (byte) -93);
                                            break L85;
                                          }
                                          var9 = var8;
                                          var10 = 0;
                                          L87: while (true) {
                                            L88: {
                                              L89: {
                                                if ((var9.length ^ -1) >= (var10 ^ -1)) {
                                                  break L89;
                                                } else {
                                                  var11 = var9[var10];
                                                  fe.field_D[var11 >> 274612869] = vn.a(fe.field_D[var11 >> 274612869], 1 << ec.a(31, var11));
                                                  h.field_G = h.field_G + qf.field_h[var11];
                                                  var10++;
                                                  if (var12 != 0) {
                                                    break L88;
                                                  } else {
                                                    if (var12 == 0) {
                                                      continue L87;
                                                    } else {
                                                      break L89;
                                                    }
                                                  }
                                                }
                                              }
                                              var5++;
                                              break L88;
                                            }
                                            if (var12 == 0) {
                                              continue L82;
                                            } else {
                                              break L83;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  fm.field_f[2] = 0;
                                  fm.field_f[0] = 10;
                                  fm.field_f[1] = 0;
                                  if (var12 == 0) {
                                    break L19;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                          }
                          L90: {
                            if ((8 & dm.field_a ^ -1) == -1) {
                              break L90;
                            } else {
                              dm.field_a = dm.field_a & -9;
                              if (var12 == 0) {
                                break L19;
                              } else {
                                break L90;
                              }
                            }
                          }
                          dm.field_a = dm.field_a | 8;
                          if (var12 == 0) {
                            break L19;
                          } else {
                            break L22;
                          }
                        }
                        L91: {
                          if (!ni.b(46)) {
                            break L91;
                          } else {
                            km.field_a = "Not logged in.";
                            if (var12 == 0) {
                              break L19;
                            } else {
                              break L91;
                            }
                          }
                        }
                        jg.field_j = false;
                        mm.field_g.a(69, (byte) -117);
                        mm.field_g.b(true, li.field_v);
                        mm.field_g.b(true, h.field_G);
                        var5 = 0;
                        L92: while (true) {
                          L93: {
                            L94: {
                              if (-5 >= (var5 ^ -1)) {
                                break L94;
                              } else {
                                mm.field_g.b(true, rn.field_D[var5]);
                                var5++;
                                if (var12 != 0) {
                                  break L93;
                                } else {
                                  if (var12 == 0) {
                                    continue L92;
                                  } else {
                                    break L94;
                                  }
                                }
                              }
                            }
                            var5 = 0;
                            break L93;
                          }
                          L95: while (true) {
                            L96: {
                              L97: {
                                if ((var5 ^ -1) <= -3) {
                                  break L97;
                                } else {
                                  mm.field_g.b(true, fe.field_D[var5]);
                                  var5++;
                                  if (var12 != 0) {
                                    break L96;
                                  } else {
                                    if (var12 == 0) {
                                      continue L95;
                                    } else {
                                      break L97;
                                    }
                                  }
                                }
                              }
                              var5 = 0;
                              break L96;
                            }
                            L98: while (true) {
                              L99: {
                                L100: {
                                  if (var5 >= 3) {
                                    break L100;
                                  } else {
                                    mm.field_g.a((byte) 115, fm.field_f[var5]);
                                    var5++;
                                    if (var12 != 0) {
                                      break L99;
                                    } else {
                                      if (var12 == 0) {
                                        continue L98;
                                      } else {
                                        break L100;
                                      }
                                    }
                                  }
                                }
                                mm.field_g.a((byte) 126, jc.field_f);
                                km.field_a = "Data sent.";
                                break L99;
                              }
                              if (ul.field_d < 2) {
                                km.field_a = km.field_a + " (Expect it to be ignored.)";
                                if (var12 == 0) {
                                  break L19;
                                } else {
                                  break L21;
                                }
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                      }
                      vn.d(-57);
                      var5 = 0;
                      L101: while (true) {
                        L102: {
                          L103: {
                            if (va.field_k.length <= var5) {
                              break L103;
                            } else {
                              va.field_k[var5] = 0;
                              var5++;
                              if (var12 != 0) {
                                break L102;
                              } else {
                                if (var12 == 0) {
                                  continue L101;
                                } else {
                                  break L103;
                                }
                              }
                            }
                          }
                          var5 = vb.field_g;
                          break L102;
                        }
                        L104: {
                          L105: {
                            if ((var5 ^ -1) == -6) {
                              break L105;
                            } else {
                              if (-7 == (var5 ^ -1)) {
                                break L105;
                              } else {
                                if (-9 == (var5 ^ -1)) {
                                  break L105;
                                } else {
                                  break L104;
                                }
                              }
                            }
                          }
                          var5 = gh.field_Jb;
                          break L104;
                        }
                        q.a(0, true, param0 + 29627, var5);
                        if (var12 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L106: {
                      L107: {
                        L108: {
                          L109: {
                            L110: {
                              L111: {
                                L112: {
                                  L113: {
                                    var5 = var2_int;
                                    if (var5 != 0) {
                                      break L113;
                                    } else {
                                      if (var12 == 0) {
                                        break L112;
                                      } else {
                                        break L113;
                                      }
                                    }
                                  }
                                  L114: {
                                    if (var5 != 1) {
                                      break L114;
                                    } else {
                                      if (var12 == 0) {
                                        break L111;
                                      } else {
                                        break L114;
                                      }
                                    }
                                  }
                                  L115: {
                                    if (-3 != (var5 ^ -1)) {
                                      break L115;
                                    } else {
                                      if (var12 == 0) {
                                        break L110;
                                      } else {
                                        break L115;
                                      }
                                    }
                                  }
                                  L116: {
                                    if (-4 != (var5 ^ -1)) {
                                      break L116;
                                    } else {
                                      if (var12 == 0) {
                                        break L109;
                                      } else {
                                        break L116;
                                      }
                                    }
                                  }
                                  L117: {
                                    if (var5 != 4) {
                                      break L117;
                                    } else {
                                      if (var12 == 0) {
                                        break L108;
                                      } else {
                                        break L117;
                                      }
                                    }
                                  }
                                  if (var5 != 5) {
                                    break L106;
                                  } else {
                                    if (var12 == 0) {
                                      break L107;
                                    } else {
                                      break L112;
                                    }
                                  }
                                }
                                jn.a(true, (byte) 114, 200, me.field_f);
                                if (var12 == 0) {
                                  break L106;
                                } else {
                                  break L111;
                                }
                              }
                              jn.a(true, (byte) 108, 200, l.field_i);
                              if (var12 == 0) {
                                break L106;
                              } else {
                                break L110;
                              }
                            }
                            jn.a(true, (byte) 77, 200, gb.field_e);
                            if (var12 == 0) {
                              break L106;
                            } else {
                              break L109;
                            }
                          }
                          jn.a(true, (byte) 91, 200, kj.field_z);
                          if (var12 == 0) {
                            break L106;
                          } else {
                            break L108;
                          }
                        }
                        jn.a(true, (byte) 96, 200, ue.field_e);
                        if (var12 == 0) {
                          break L106;
                        } else {
                          break L107;
                        }
                      }
                      jn.a(true, (byte) 122, 200, db.field_a);
                      break L106;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                  stackOut_384_0 = param0 ^ 31241;
                  stackIn_385_0 = stackOut_384_0;
                  break L18;
                }
                ee.c(stackIn_385_0, 95);
                break L2;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.BA(" + param0 + ')');
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

    private final void l(int param0) {
        byte[] discarded$1 = null;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if ((ei.field_q ^ -1) != -97) {
                break L1;
              } else {
                L2: {
                  if (-1 <= (this.field_g.field_e ^ -1)) {
                    break L2;
                  } else {
                    if (-4 == (this.field_g.field_e ^ -1)) {
                      break L1;
                    } else {
                      this.field_g.a(0, -1 + this.field_g.field_e);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                this.field_g.a(0, 2);
                break L1;
              }
            }
            L3: {
              if (97 == ei.field_q) {
                L4: {
                  if (2 > this.field_g.field_e) {
                    break L4;
                  } else {
                    if (2 != this.field_g.field_e) {
                      break L3;
                    } else {
                      this.field_g.a(0, 0);
                      if (var3 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.field_g.a(0, 1 + this.field_g.field_e);
                break L3;
              } else {
                break L3;
              }
            }
            L5: {
              if (99 != ei.field_q) {
                break L5;
              } else {
                L6: {
                  L7: {
                    if ((this.field_g.field_e ^ -1) > -1) {
                      break L7;
                    } else {
                      if (-3 <= (this.field_g.field_e ^ -1)) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  this.field_g.a(0, d.field_R);
                  if (var3 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
                this.field_g.a(param0 + 1, 3);
                break L5;
              }
            }
            L8: {
              if (98 != ei.field_q) {
                break L8;
              } else {
                L9: {
                  if (this.field_g.field_e == 3) {
                    break L9;
                  } else {
                    this.field_g.a(0, 3);
                    if (var3 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                this.field_g.a(0, d.field_R);
                break L8;
              }
            }
            L10: {
              if (param0 == -1) {
                break L10;
              } else {
                discarded$1 = ji.a(12, (String) null);
                break L10;
              }
            }
            this.field_g.e((byte) 22);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.P(" + param0 + ')');
        }
    }

    final void r(int param0) {
        boolean discarded$3 = false;
        int discarded$4 = 0;
        int discarded$5 = 0;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException var5 = null;
        String var5_ref = null;
        int var5_int = 0;
        fh var5_ref2 = null;
        int[] var5_array = null;
        fh var6 = null;
        int var6_int = 0;
        gh var6_ref = null;
        int var7 = 0;
        fh var7_ref_fh = null;
        gh var7_ref_gh = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        String[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_93_0 = 0;
        boolean stackIn_275_0 = false;
        Object stackIn_281_0 = null;
        int stackIn_281_1 = 0;
        int stackIn_281_2 = 0;
        Object stackIn_283_0 = null;
        int stackIn_283_1 = 0;
        int stackIn_283_2 = 0;
        Object stackIn_285_0 = null;
        int stackIn_285_1 = 0;
        int stackIn_285_2 = 0;
        Object stackIn_286_0 = null;
        int stackIn_286_1 = 0;
        int stackIn_286_2 = 0;
        int stackIn_286_3 = 0;
        Object stackIn_288_0 = null;
        int stackIn_288_1 = 0;
        Object stackIn_290_0 = null;
        int stackIn_290_1 = 0;
        Object stackIn_292_0 = null;
        int stackIn_292_1 = 0;
        Object stackIn_293_0 = null;
        int stackIn_293_1 = 0;
        int stackIn_293_2 = 0;
        int stackIn_296_0 = 0;
        int stackIn_406_0 = 0;
        int stackIn_406_1 = 0;
        int stackIn_408_0 = 0;
        int stackIn_408_1 = 0;
        int stackIn_417_0 = 0;
        int stackIn_419_0 = 0;
        int stackIn_419_1 = 0;
        int stackIn_426_0 = 0;
        int stackIn_440_0 = 0;
        int stackIn_451_0 = 0;
        int stackIn_451_1 = 0;
        int stackIn_460_0 = 0;
        int stackIn_465_0 = 0;
        int stackIn_465_1 = 0;
        int stackIn_469_0 = 0;
        int stackIn_551_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_56_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_92_0 = 0;
        boolean stackOut_274_0 = false;
        Object stackOut_280_0 = null;
        int stackOut_280_1 = 0;
        int stackOut_280_2 = 0;
        Object stackOut_285_0 = null;
        int stackOut_285_1 = 0;
        int stackOut_285_2 = 0;
        int stackOut_285_3 = 0;
        Object stackOut_281_0 = null;
        int stackOut_281_1 = 0;
        int stackOut_281_2 = 0;
        Object stackOut_283_0 = null;
        int stackOut_283_1 = 0;
        int stackOut_283_2 = 0;
        int stackOut_283_3 = 0;
        Object stackOut_287_0 = null;
        int stackOut_287_1 = 0;
        Object stackOut_292_0 = null;
        int stackOut_292_1 = 0;
        int stackOut_292_2 = 0;
        Object stackOut_288_0 = null;
        int stackOut_288_1 = 0;
        Object stackOut_290_0 = null;
        int stackOut_290_1 = 0;
        int stackOut_290_2 = 0;
        int stackOut_295_0 = 0;
        int stackOut_450_0 = 0;
        int stackOut_450_1 = 0;
        int stackOut_459_0 = 0;
        int stackOut_457_0 = 0;
        int stackOut_464_0 = 0;
        int stackOut_464_1 = 0;
        int stackOut_468_0 = 0;
        int stackOut_466_0 = 0;
        int stackOut_405_0 = 0;
        int stackOut_405_1 = 0;
        int stackOut_406_0 = 0;
        int stackOut_406_1 = 0;
        int stackOut_416_0 = 0;
        int stackOut_414_0 = 0;
        int stackOut_418_0 = 0;
        int stackOut_418_1 = 0;
        int stackOut_425_0 = 0;
        int stackOut_423_0 = 0;
        int stackOut_439_0 = 0;
        int stackOut_437_0 = 0;
        int stackOut_550_0 = 0;
        int stackOut_548_0 = 0;
        var19 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (-4 >= (fm.field_f[0] ^ -1)) {
                  break L2;
                } else {
                  ti.field_A[0] = qg.field_p;
                  if (var19 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ti.field_A[0] = fk.field_f;
              break L1;
            }
            this.a(false);
            if (12 != this.field_c) {
              if ((this.field_c ^ -1) != -22) {
                L3: {
                  if (this.field_c == param0) {
                    L4: {
                      ma.field_eb.a(0, -this.field_h + 0);
                      ob.field_z.a(0, 60 + this.field_k);
                      var2_int = 0;
                      var2_int = var2_int + pc.e(param0 + 127);
                      var2_int = var2_int + 10 * (fm.field_f[2] + fm.field_f[0] + fm.field_f[1]);
                      var2_int = var2_int + uf.a(param0 ^ 118, ge.field_m) * 10;
                      stackOut_56_0 = var2_int;
                      stackIn_59_0 = stackOut_56_0;
                      stackIn_57_0 = stackOut_56_0;
                      if (ve.a(ge.field_m, param0 + 1, 25)) {
                        stackOut_59_0 = stackIn_59_0;
                        stackOut_59_1 = 10;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        break L4;
                      } else {
                        stackOut_57_0 = stackIn_57_0;
                        stackOut_57_1 = 0;
                        stackIn_60_0 = stackOut_57_0;
                        stackIn_60_1 = stackOut_57_1;
                        break L4;
                      }
                    }
                    L5: {
                      var2_int = stackIn_60_0 + stackIn_60_1;
                      var3 = 811;
                      var4 = -1 + 10 * var2_int / var3;
                      if (var4 > 9) {
                        var4 = 9;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      var5_int = 2 + (var3 + -var2_int) * 30 / var3;
                      if (var2_int != var3) {
                        stackOut_67_0 = 0;
                        stackIn_68_0 = stackOut_67_0;
                        break L6;
                      } else {
                        stackOut_65_0 = 1;
                        stackIn_68_0 = stackOut_65_0;
                        break L6;
                      }
                    }
                    L7: {
                      var6_int = stackIn_68_0;
                      var2_int = var2_int * 279 / var3;
                      if (var6_int == 0) {
                        break L7;
                      } else {
                        var5_int = 0;
                        break L7;
                      }
                    }
                    L8: {
                      var7 = 14419;
                      var8 = -var2_int + (450 - -this.field_k);
                      pb.a(550, this.field_k + 171, 560, 450 + this.field_k);
                      ta.a(10, var7, 0, 0, var7, 192, 550, var8, var5_int);
                      if (var8 - -var5_int < 450 + this.field_k) {
                        pb.c(550, var8 - -var5_int, 10, this.field_k + 450 - (var8 - -var5_int), var7, 192);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    pb.c();
                    fa.field_b.a((-fa.field_b.field_z + 640) / 2, -this.field_h + 15);
                    if (ni.b(param0 + 98)) {
                      break L3;
                    } else {
                      if ((ul.field_d ^ -1) <= -3) {
                        L9: {
                          L10: {
                            var9 = 520;
                            var10 = this.field_k + 100;
                            var11_int = 100;
                            var12 = 34;
                            if (var9 > oh.field_f) {
                              break L10;
                            } else {
                              if ((oh.field_f ^ -1) <= (var9 + var11_int ^ -1)) {
                                break L10;
                              } else {
                                if (var10 > pi.field_c) {
                                  break L10;
                                } else {
                                  if (var12 + var10 <= pi.field_c) {
                                    break L10;
                                  } else {
                                    stackOut_90_0 = 1;
                                    stackIn_93_0 = stackOut_90_0;
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_92_0 = 0;
                          stackIn_93_0 = stackOut_92_0;
                          break L9;
                        }
                        L11: {
                          var13 = stackIn_93_0;
                          discarded$3 = fb.a(var12, var10, "TESTING", var11_int, var9, param0 + 12490);
                          if (var13 == 0) {
                            break L11;
                          } else {
                            if (!hg.field_h) {
                              ee.c(-2483, 97);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        }
                        hg.field_h = var13 != 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L12: {
                  var2 = null;
                  var3 = 0;
                  var4 = 0;
                  var5_int = this.field_c;
                  if (-1 == (var5_int ^ -1)) {
                    break L12;
                  } else {
                    L13: {
                      if ((var5_int ^ -1) == -15) {
                        break L13;
                      } else {
                        if (var5_int == 13) {
                          var2 = ti.field_A[27];
                          break L12;
                        } else {
                          L14: {
                            if (-8 != (var5_int ^ -1)) {
                              break L14;
                            } else {
                              if (var19 == 0) {
                                var2 = ti.field_A[5];
                                break L12;
                              } else {
                                break L14;
                              }
                            }
                          }
                          L15: {
                            if (6 != var5_int) {
                              break L15;
                            } else {
                              if (var19 == 0) {
                                var2 = ti.field_A[4];
                                break L12;
                              } else {
                                break L15;
                              }
                            }
                          }
                          L16: {
                            if (-6 != (var5_int ^ -1)) {
                              break L16;
                            } else {
                              if (var19 == 0) {
                                var2 = pa.field_j;
                                break L12;
                              } else {
                                break L16;
                              }
                            }
                          }
                          L17: {
                            if (var5_int != 8) {
                              break L17;
                            } else {
                              if (var19 == 0) {
                                var2 = ti.field_A[22];
                                break L12;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L18: {
                            if ((var5_int ^ -1) != -20) {
                              break L18;
                            } else {
                              if (var19 == 0) {
                                var2 = ti.field_A[0];
                                break L12;
                              } else {
                                break L18;
                              }
                            }
                          }
                          if (20 == var5_int) {
                            var2 = cc.field_ic[ge.field_j];
                            break L12;
                          } else {
                            L19: {
                              if ((var5_int ^ -1) == -2) {
                                break L19;
                              } else {
                                L20: {
                                  if (var5_int != 2) {
                                    break L20;
                                  } else {
                                    if (var19 == 0) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                L21: {
                                  if (-4 != (var5_int ^ -1)) {
                                    break L21;
                                  } else {
                                    if (var19 == 0) {
                                      break L19;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                L22: {
                                  if (4 != var5_int) {
                                    break L22;
                                  } else {
                                    if (var19 == 0) {
                                      break L19;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                                L23: {
                                  if ((var5_int ^ -1) != -23) {
                                    break L23;
                                  } else {
                                    if (var19 == 0) {
                                      var4 = 1;
                                      var2 = un.field_e;
                                      var3 = 1;
                                      break L12;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                if ((var5_int ^ -1) == -18) {
                                  var2 = jd.field_pb;
                                  break L12;
                                } else {
                                  if (-19 != (var5_int ^ -1)) {
                                    break L12;
                                  } else {
                                    if (var19 == 0) {
                                      var2 = "TESTING ONLY";
                                      break L12;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                            }
                            var4 = 1;
                            var2 = un.field_d;
                            var3 = 1;
                            break L12;
                          }
                        }
                      }
                    }
                    var2 = ti.field_A[28];
                    break L12;
                  }
                }
                L24: {
                  if (var4 == 0) {
                    break L24;
                  } else {
                    var5_int = 60;
                    var5_int = var5_int + 30 * uc.field_e[this.field_c].length;
                    var6_int = -30 + this.b(0, (byte) 126);
                    var7 = -25 + this.g(param0 + 125, 0);
                    var8 = 640 - var7 * 2;
                    jm.a(var6_int, var5_int, eb.field_p, 1, var7, var8);
                    break L24;
                  }
                }
                L25: {
                  if (-1 != (this.field_c ^ -1)) {
                    L26: {
                      L27: {
                        L28: {
                          var5_int = this.d((byte) 114);
                          fi.field_j.a(0, -5, 80, 7);
                          fi.field_j.a(0, 474 - var5_int, 80, 2 + var5_int / 8);
                          si.c(103);
                          if (var3 != 0) {
                            break L28;
                          } else {
                            L29: {
                              if (this.field_c != 7) {
                                break L29;
                              } else {
                                if (od.field_e) {
                                  break L29;
                                } else {
                                  if (pm.field_U == 0) {
                                    break L28;
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                            }
                            if (-15 != (this.field_c ^ -1)) {
                              break L27;
                            } else {
                              if (0 != pm.field_U) {
                                break L27;
                              } else {
                                if (!kf.field_s) {
                                  break L28;
                                } else {
                                  if (lg.field_l) {
                                    break L27;
                                  } else {
                                    break L28;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (14 == this.field_c) {
                          L30: {
                            var6_ref = bl.field_c;
                            var7_ref_gh = kk.field_a;
                            if (-2 == (fg.field_Ob ^ -1)) {
                              var7_ref_gh = null;
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          L31: {
                            if (null == var6_ref) {
                              break L31;
                            } else {
                              L32: {
                                pb.a(0, 50, var6_ref.field_Rb, -var5_int + 430, 0);
                                if (var6_ref.field_cb <= 50) {
                                  break L32;
                                } else {
                                  pb.a(var6_ref.field_Rb, 50, var6_ref.field_zb, var6_ref.field_cb + -50, 0);
                                  break L32;
                                }
                              }
                              L33: {
                                if ((var6_ref.field_Lb + var6_ref.field_cb ^ -1) > (430 + -var5_int ^ -1)) {
                                  pb.a(var6_ref.field_Rb, var6_ref.field_cb + var6_ref.field_Lb, var6_ref.field_zb, 430 + (-var5_int - var6_ref.field_cb) + -var6_ref.field_Lb, 0);
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                              L34: {
                                if (null != var7_ref_gh) {
                                  break L34;
                                } else {
                                  pb.a(var6_ref.field_zb + var6_ref.field_Rb, 50, -var6_ref.field_zb + -var6_ref.field_Rb + 640, -var5_int + 430, 0);
                                  if (var19 == 0) {
                                    break L31;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                              pb.a(var6_ref.field_zb + var6_ref.field_Rb, 50, -var6_ref.field_Rb + (var7_ref_gh.field_Rb - var6_ref.field_zb), 430 - var5_int, 0);
                              break L31;
                            }
                          }
                          L35: {
                            if (null != var7_ref_gh) {
                              L36: {
                                if (null == var6_ref) {
                                  pb.a(0, 50, var7_ref_gh.field_Rb, 430 + -var5_int, 0);
                                  break L36;
                                } else {
                                  break L36;
                                }
                              }
                              L37: {
                                if (var7_ref_gh.field_cb <= 50) {
                                  break L37;
                                } else {
                                  pb.a(var7_ref_gh.field_Rb, 0, var7_ref_gh.field_zb, var7_ref_gh.field_cb, 0);
                                  break L37;
                                }
                              }
                              L38: {
                                if (var7_ref_gh.field_Lb + var7_ref_gh.field_cb < -var5_int + 430) {
                                  pb.a(var7_ref_gh.field_Rb, var7_ref_gh.field_Lb + var7_ref_gh.field_cb, var7_ref_gh.field_zb, -var7_ref_gh.field_cb + 480 + -var7_ref_gh.field_Lb, 0);
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                              pb.a(var7_ref_gh.field_zb + var7_ref_gh.field_Rb, 50, 640 + -var7_ref_gh.field_Rb + -var7_ref_gh.field_zb, -var5_int + 430, 0);
                              break L35;
                            } else {
                              break L35;
                            }
                          }
                          L39: {
                            if (var6_ref != null) {
                              break L39;
                            } else {
                              if (null != var7_ref_gh) {
                                break L39;
                              } else {
                                pb.a(0, 50, 640, 630 + -var5_int, 0);
                                break L39;
                              }
                            }
                          }
                          if (var19 == 0) {
                            break L26;
                          } else {
                            break L27;
                          }
                        } else {
                          break L26;
                        }
                      }
                      pb.a(0, 50, 640, -var5_int + 430, 0);
                      break L26;
                    }
                    hb.a((byte) -95, oa.field_U, 640, 49, 0, 431 + -var5_int);
                    var6_int = 50 + -ic.field_db.field_B;
                    ic.field_db.a(0, var6_int + -this.field_h);
                    pb.c(0, -this.field_h + 49, 640, 0, 128);
                    sh.a(-16088, 640, var5_int, 480 + -var5_int + this.field_k, 0);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L40: {
                  if (this.field_c != 17) {
                    break L40;
                  } else {
                    var5_int = this.b(0, (byte) 87) + -30;
                    var6_int = 30 + this.b(uc.field_e[this.field_c].length + -5, (byte) -113) - -this.c(25, -5 + uc.field_e[this.field_c].length);
                    jm.a(var5_int, var6_int + -var5_int, eb.field_p, 1, 170, 300);
                    break L40;
                  }
                }
                L41: {
                  if (null != var2) {
                    ql.field_Tb.a(ke.a(42, (String) (var2)), 320, 18 + (ql.field_Tb.field_G / 2 + -this.field_h), 0, -1);
                    break L41;
                  } else {
                    break L41;
                  }
                }
                var5_int = 0;
                L42: while (true) {
                  L43: {
                    L44: {
                      if ((var5_int ^ -1) <= (this.field_g.field_m ^ -1)) {
                        break L44;
                      } else {
                        stackOut_274_0 = this.e(var5_int, param0 + 20);
                        stackIn_296_0 = stackOut_274_0 ? 1 : 0;
                        stackIn_275_0 = stackOut_274_0;
                        if (var19 != 0) {
                          break L43;
                        } else {
                          L45: {
                            if (stackIn_275_0) {
                              L46: {
                                if ((this.b(param0 + -103, var5_int) ^ -1) > -1) {
                                  break L46;
                                } else {
                                  L47: {
                                    stackOut_280_0 = this;
                                    stackOut_280_1 = -124;
                                    stackOut_280_2 = var5_int;
                                    stackIn_285_0 = stackOut_280_0;
                                    stackIn_285_1 = stackOut_280_1;
                                    stackIn_285_2 = stackOut_280_2;
                                    stackIn_281_0 = stackOut_280_0;
                                    stackIn_281_1 = stackOut_280_1;
                                    stackIn_281_2 = stackOut_280_2;
                                    if ((var5_int ^ -1) != (this.field_g.field_e ^ -1)) {
                                      stackOut_285_0 = this;
                                      stackOut_285_1 = stackIn_285_1;
                                      stackOut_285_2 = stackIn_285_2;
                                      stackOut_285_3 = 0;
                                      stackIn_286_0 = stackOut_285_0;
                                      stackIn_286_1 = stackOut_285_1;
                                      stackIn_286_2 = stackOut_285_2;
                                      stackIn_286_3 = stackOut_285_3;
                                      break L47;
                                    } else {
                                      stackOut_281_0 = this;
                                      stackOut_281_1 = stackIn_281_1;
                                      stackOut_281_2 = stackIn_281_2;
                                      stackIn_283_0 = stackOut_281_0;
                                      stackIn_283_1 = stackOut_281_1;
                                      stackIn_283_2 = stackOut_281_2;
                                      stackOut_283_0 = this;
                                      stackOut_283_1 = stackIn_283_1;
                                      stackOut_283_2 = stackIn_283_2;
                                      stackOut_283_3 = 1;
                                      stackIn_286_0 = stackOut_283_0;
                                      stackIn_286_1 = stackOut_283_1;
                                      stackIn_286_2 = stackOut_283_2;
                                      stackIn_286_3 = stackOut_283_3;
                                      break L47;
                                    }
                                  }
                                  this.a(stackIn_286_1, stackIn_286_2, stackIn_286_3 != 0);
                                  if (var19 == 0) {
                                    break L45;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              L48: {
                                stackOut_287_0 = this;
                                stackOut_287_1 = var5_int;
                                stackIn_292_0 = stackOut_287_0;
                                stackIn_292_1 = stackOut_287_1;
                                stackIn_288_0 = stackOut_287_0;
                                stackIn_288_1 = stackOut_287_1;
                                if (this.field_g.field_e != var5_int) {
                                  stackOut_292_0 = this;
                                  stackOut_292_1 = stackIn_292_1;
                                  stackOut_292_2 = 0;
                                  stackIn_293_0 = stackOut_292_0;
                                  stackIn_293_1 = stackOut_292_1;
                                  stackIn_293_2 = stackOut_292_2;
                                  break L48;
                                } else {
                                  stackOut_288_0 = this;
                                  stackOut_288_1 = stackIn_288_1;
                                  stackIn_290_0 = stackOut_288_0;
                                  stackIn_290_1 = stackOut_288_1;
                                  stackOut_290_0 = this;
                                  stackOut_290_1 = stackIn_290_1;
                                  stackOut_290_2 = 1;
                                  stackIn_293_0 = stackOut_290_0;
                                  stackIn_293_1 = stackOut_290_1;
                                  stackIn_293_2 = stackOut_290_2;
                                  break L48;
                                }
                              }
                              this.a(stackIn_293_1, stackIn_293_2 != 0, 30241);
                              break L45;
                            } else {
                              break L45;
                            }
                          }
                          var5_int++;
                          if (var19 == 0) {
                            continue L42;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    var5_int = this.field_c;
                    stackOut_295_0 = var5_int;
                    stackIn_296_0 = stackOut_295_0;
                    break L43;
                  }
                  L49: {
                    L50: {
                      L51: {
                        L52: {
                          L53: {
                            L54: {
                              L55: {
                                L56: {
                                  if (stackIn_296_0 != 5) {
                                    break L56;
                                  } else {
                                    if (var19 == 0) {
                                      this.c(-87);
                                      if (var19 == 0) {
                                        break L49;
                                      } else {
                                        break L55;
                                      }
                                    } else {
                                      break L56;
                                    }
                                  }
                                }
                                L57: {
                                  if (-7 != (var5_int ^ -1)) {
                                    break L57;
                                  } else {
                                    if (var19 == 0) {
                                      break L55;
                                    } else {
                                      break L57;
                                    }
                                  }
                                }
                                if (7 == var5_int) {
                                  break L54;
                                } else {
                                  L58: {
                                    if ((var5_int ^ -1) != -9) {
                                      break L58;
                                    } else {
                                      if (var19 == 0) {
                                        break L53;
                                      } else {
                                        break L58;
                                      }
                                    }
                                  }
                                  L59: {
                                    if ((var5_int ^ -1) != -10) {
                                      break L59;
                                    } else {
                                      if (var19 == 0) {
                                        break L52;
                                      } else {
                                        break L59;
                                      }
                                    }
                                  }
                                  if (10 == var5_int) {
                                    break L51;
                                  } else {
                                    L60: {
                                      if (var5_int != 13) {
                                        break L60;
                                      } else {
                                        if (var19 == 0) {
                                          break L49;
                                        } else {
                                          break L60;
                                        }
                                      }
                                    }
                                    L61: {
                                      if ((var5_int ^ -1) != -15) {
                                        break L61;
                                      } else {
                                        if (var19 == 0) {
                                          break L50;
                                        } else {
                                          break L61;
                                        }
                                      }
                                    }
                                    L62: {
                                      L63: {
                                        L64: {
                                          L65: {
                                            L66: {
                                              if (11 != var5_int) {
                                                break L66;
                                              } else {
                                                if (var19 == 0) {
                                                  discarded$4 = va.field_j.a(ll.field_s, 40, 150, 600, 1000, 1021128, -1, 0, 0, 0);
                                                  if (var19 == 0) {
                                                    break L49;
                                                  } else {
                                                    break L65;
                                                  }
                                                } else {
                                                  break L66;
                                                }
                                              }
                                            }
                                            L67: {
                                              if (var5_int != 16) {
                                                break L67;
                                              } else {
                                                if (var19 == 0) {
                                                  break L65;
                                                } else {
                                                  break L67;
                                                }
                                              }
                                            }
                                            L68: {
                                              if (-18 != (var5_int ^ -1)) {
                                                break L68;
                                              } else {
                                                if (var19 == 0) {
                                                  break L49;
                                                } else {
                                                  break L68;
                                                }
                                              }
                                            }
                                            L69: {
                                              if (18 != var5_int) {
                                                break L69;
                                              } else {
                                                if (var19 == 0) {
                                                  break L64;
                                                } else {
                                                  break L69;
                                                }
                                              }
                                            }
                                            if (19 == var5_int) {
                                              break L63;
                                            } else {
                                              if (20 == var5_int) {
                                                break L62;
                                              } else {
                                                break L49;
                                              }
                                            }
                                          }
                                          this.h(7165);
                                          if (var19 == 0) {
                                            break L49;
                                          } else {
                                            break L64;
                                          }
                                        }
                                        this.m(param0 + 126);
                                        if (var19 == 0) {
                                          break L49;
                                        } else {
                                          break L63;
                                        }
                                      }
                                      if (uc.field_e[this.field_c] != fa.field_c) {
                                        ui.field_U.a(ke.a(42, cc.field_ic[0]), 180, 98, 1021128, -1);
                                        ui.field_U.a(ke.a(42, cc.field_ic[1]), 460, 98, 1021128, -1);
                                        var5_int = 0;
                                        L70: while (true) {
                                          L71: {
                                            L72: {
                                              if (var5_int >= 20) {
                                                break L72;
                                              } else {
                                                stackOut_450_0 = var5_int;
                                                stackOut_450_1 = 10;
                                                stackIn_465_0 = stackOut_450_0;
                                                stackIn_465_1 = stackOut_450_1;
                                                stackIn_451_0 = stackOut_450_0;
                                                stackIn_451_1 = stackOut_450_1;
                                                if (var19 != 0) {
                                                  break L71;
                                                } else {
                                                  L73: {
                                                    L74: {
                                                      if (stackIn_451_0 < stackIn_451_1) {
                                                        break L74;
                                                      } else {
                                                        if (-1 > (fm.field_f[var5_int / 10] ^ -1)) {
                                                          stackOut_459_0 = 21;
                                                          stackIn_460_0 = stackOut_459_0;
                                                          break L73;
                                                        } else {
                                                          break L74;
                                                        }
                                                      }
                                                    }
                                                    stackOut_457_0 = 0;
                                                    stackIn_460_0 = stackOut_457_0;
                                                    break L73;
                                                  }
                                                  var6_int = stackIn_460_0;
                                                  var7 = 74;
                                                  pb.h(-4 + this.g(127, var5_int + 0), var7, this.a(var5_int - 0, (byte) 115) - (this.g(126, 0 + var5_int) - 8), -var7 + (4 + this.b(9 + var5_int, (byte) -103)) + (this.c(25, var5_int - -9) - -var6_int), 3158064);
                                                  var5_int += 10;
                                                  if (var19 == 0) {
                                                    continue L70;
                                                  } else {
                                                    break L72;
                                                  }
                                                }
                                              }
                                            }
                                            if (fm.field_f[1] > 0) {
                                              stackOut_464_0 = fm.field_f[1] ^ -1;
                                              stackOut_464_1 = -11;
                                              stackIn_465_0 = stackOut_464_0;
                                              stackIn_465_1 = stackOut_464_1;
                                              break L71;
                                            } else {
                                              break L49;
                                            }
                                          }
                                          L75: {
                                            if (stackIn_465_0 != stackIn_465_1) {
                                              stackOut_468_0 = 1656673;
                                              stackIn_469_0 = stackOut_468_0;
                                              break L75;
                                            } else {
                                              stackOut_466_0 = 1021128;
                                              stackIn_469_0 = stackOut_466_0;
                                              break L75;
                                            }
                                          }
                                          var5_int = stackIn_469_0;
                                          var6_int = 0;
                                          var7 = 0;
                                          L76: while (true) {
                                            L77: {
                                              L78: {
                                                if ((fm.field_f[1] ^ -1) >= (var7 ^ -1)) {
                                                  break L78;
                                                } else {
                                                  var6_int = var6_int + jh.field_a[var7];
                                                  var7++;
                                                  if (var19 != 0) {
                                                    break L77;
                                                  } else {
                                                    if (var19 == 0) {
                                                      continue L76;
                                                    } else {
                                                      break L78;
                                                    }
                                                  }
                                                }
                                              }
                                              pl.field_U.a(ic.field_E + qa.a(param0 + -1, var6_int), (this.g(127, 19) - -this.a(19, (byte) 120)) / 2, this.b(19, (byte) 76) - (-this.c(25, 19) - 17), var5_int, -1);
                                              break L77;
                                            }
                                            if (var19 == 0) {
                                              break L49;
                                            } else {
                                              break L62;
                                            }
                                          }
                                        }
                                      } else {
                                        var5_array = new int[3];
                                        var6_int = 0;
                                        L79: while (true) {
                                          L80: {
                                            L81: {
                                              if ((var6_int ^ -1) <= -4) {
                                                break L81;
                                              } else {
                                                var5_array[var6_int] = (this.g(127, var6_int * 10) + this.a(10 * var6_int, (byte) 110)) / 2;
                                                ui.field_U.a(ke.a(42, cc.field_ic[var6_int]), var5_array[var6_int], 98, 1021128, -1);
                                                var6_int++;
                                                if (var19 != 0) {
                                                  break L80;
                                                } else {
                                                  if (var19 == 0) {
                                                    continue L79;
                                                  } else {
                                                    break L81;
                                                  }
                                                }
                                              }
                                            }
                                            var6_int = 0;
                                            break L80;
                                          }
                                          L82: while (true) {
                                            L83: {
                                              L84: {
                                                if (30 <= var6_int) {
                                                  break L84;
                                                } else {
                                                  stackOut_405_0 = var6_int ^ -1;
                                                  stackOut_405_1 = -11;
                                                  stackIn_419_0 = stackOut_405_0;
                                                  stackIn_419_1 = stackOut_405_1;
                                                  stackIn_406_0 = stackOut_405_0;
                                                  stackIn_406_1 = stackOut_405_1;
                                                  if (var19 != 0) {
                                                    break L83;
                                                  } else {
                                                    stackOut_406_0 = stackIn_406_0;
                                                    stackOut_406_1 = stackIn_406_1;
                                                    stackIn_408_0 = stackOut_406_0;
                                                    stackIn_408_1 = stackOut_406_1;
                                                    L85: {
                                                      L86: {
                                                        if (stackIn_408_0 > stackIn_408_1) {
                                                          break L86;
                                                        } else {
                                                          if (0 < fm.field_f[var6_int / 10]) {
                                                            stackOut_416_0 = 21;
                                                            stackIn_417_0 = stackOut_416_0;
                                                            break L85;
                                                          } else {
                                                            break L86;
                                                          }
                                                        }
                                                      }
                                                      stackOut_414_0 = 0;
                                                      stackIn_417_0 = stackOut_414_0;
                                                      break L85;
                                                    }
                                                    var7 = stackIn_417_0;
                                                    var8 = 74;
                                                    pb.h(this.g(126, var6_int + 0) - 4, var8, this.a(0 + var6_int, (byte) 112) - (this.g(126, 0 + var6_int) - 8), this.b(9 + var6_int, (byte) 32) - (-this.c(25, 9 + var6_int) - 4) + (-var8 + var7), 3158064);
                                                    var6_int += 10;
                                                    if (var19 == 0) {
                                                      continue L82;
                                                    } else {
                                                      break L84;
                                                    }
                                                  }
                                                }
                                              }
                                              stackOut_418_0 = 0;
                                              stackOut_418_1 = fm.field_f[1];
                                              stackIn_419_0 = stackOut_418_0;
                                              stackIn_419_1 = stackOut_418_1;
                                              break L83;
                                            }
                                            L87: {
                                              if (stackIn_419_0 >= stackIn_419_1) {
                                                break L87;
                                              } else {
                                                L88: {
                                                  if (-11 == (fm.field_f[1] ^ -1)) {
                                                    stackOut_425_0 = 1021128;
                                                    stackIn_426_0 = stackOut_425_0;
                                                    break L88;
                                                  } else {
                                                    stackOut_423_0 = 1656673;
                                                    stackIn_426_0 = stackOut_423_0;
                                                    break L88;
                                                  }
                                                }
                                                var6_int = stackIn_426_0;
                                                var7 = 0;
                                                var8 = 0;
                                                L89: while (true) {
                                                  L90: {
                                                    if ((var8 ^ -1) <= (fm.field_f[1] ^ -1)) {
                                                      break L90;
                                                    } else {
                                                      var7 = var7 + jh.field_a[var8];
                                                      var8++;
                                                      if (var19 != 0) {
                                                        break L87;
                                                      } else {
                                                        if (var19 == 0) {
                                                          continue L89;
                                                        } else {
                                                          break L90;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  pl.field_U.a(ic.field_E + qa.a(-1, var7), var5_array[1], this.b(19, (byte) -125) + (this.c(param0 + 25, 19) - -17), var6_int, -1);
                                                  break L87;
                                                }
                                              }
                                            }
                                            L91: {
                                              if (0 < fm.field_f[2]) {
                                                L92: {
                                                  if (fm.field_f[2] == 10) {
                                                    stackOut_439_0 = 1021128;
                                                    stackIn_440_0 = stackOut_439_0;
                                                    break L92;
                                                  } else {
                                                    stackOut_437_0 = 1656673;
                                                    stackIn_440_0 = stackOut_437_0;
                                                    break L92;
                                                  }
                                                }
                                                var6_int = stackIn_440_0;
                                                var7 = 0;
                                                var8 = 0;
                                                L93: while (true) {
                                                  L94: {
                                                    if ((var8 ^ -1) <= (fm.field_f[2] ^ -1)) {
                                                      break L94;
                                                    } else {
                                                      var7 = var7 + jh.field_a[var8 + 10];
                                                      var8++;
                                                      if (var19 != 0) {
                                                        break L91;
                                                      } else {
                                                        if (var19 == 0) {
                                                          continue L93;
                                                        } else {
                                                          break L94;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  pl.field_U.a(ic.field_E + qa.a(param0 ^ -1, var7), var5_array[2], 17 + (this.b(29, (byte) 108) - -this.c(25, 29)), var6_int, -1);
                                                  break L91;
                                                }
                                              } else {
                                                break L91;
                                              }
                                            }
                                            break L49;
                                          }
                                        }
                                      }
                                    }
                                    this.n(21345);
                                    break L49;
                                  }
                                }
                              }
                              this.p(-119);
                              if (var19 == 0) {
                                break L49;
                              } else {
                                break L54;
                              }
                            }
                            this.i((byte) -127);
                            if (var19 == 0) {
                              break L49;
                            } else {
                              break L53;
                            }
                          }
                          this.a(48, false);
                          if (var19 == 0) {
                            break L49;
                          } else {
                            break L52;
                          }
                        }
                        this.a(48, true);
                        if (var19 == 0) {
                          break L49;
                        } else {
                          break L51;
                        }
                      }
                      this.f(param0 ^ 126);
                      if (var19 == 0) {
                        break L49;
                      } else {
                        break L50;
                      }
                    }
                    try {
                      L95: {
                        ff.g((byte) 35);
                        break L95;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L96: {
                        var5 = decompiledCaughtException;
                        hl.field_v = ji.a(ua.field_x, (byte) 118, di.field_c);
                        uc.field_b = cj.a(param0 ^ 95, di.field_c, hl.field_v);
                        vn.d(param0 + -119);
                        System.err.println("Draw config: " + var5);
                        var5.printStackTrace();
                        break L96;
                      }
                    }
                    break L49;
                  }
                  L97: {
                    if (14 != this.field_c) {
                      sn.field_q = -1;
                      break L97;
                    } else {
                      break L97;
                    }
                  }
                  L98: {
                    L99: {
                      L100: {
                        if (-1 < (sn.field_q ^ -1)) {
                          break L100;
                        } else {
                          if (var4 == 0) {
                            break L99;
                          } else {
                            break L100;
                          }
                        }
                      }
                      L101: {
                        if (!gh.field_J) {
                          break L101;
                        } else {
                          if (var4 != 0) {
                            break L101;
                          } else {
                            L102: {
                              km.field_a = ee.field_I;
                              pb.c(0, 0, 640, 480, 0, 128);
                              var5_ref2 = ff.field_lb;
                              var6_int = ((mi) ((Object) var5_ref2)).a(ee.field_I, 424, 0);
                              var6_int += 54;
                              var7 = (480 - var6_int) / 2;
                              discarded$5 = ak.a((wk) null, var7, km.field_a, 440, 100, -2, var6_int, 1071146, (String[]) null, true);
                              var8 = 30;
                              var9 = 100;
                              var10 = 110;
                              var11_int = -var8 + -8 + (var7 + var6_int);
                              var12 = ln.field_g;
                              ln.field_g = -1;
                              if (nm.a(var11_int, var10, 123, sn.field_h, var8, var9)) {
                                ln.field_g = 0;
                                break L102;
                              } else {
                                break L102;
                              }
                            }
                            L103: {
                              var10 = var10 + (var9 - -10);
                              var9 = 200;
                              if (!nm.a(var11_int, var10, 126, cf.field_v, var8, var9)) {
                                break L103;
                              } else {
                                ln.field_g = 1;
                                break L103;
                              }
                            }
                            L104: {
                              var10 = var10 + (var9 - -10);
                              var9 = 100;
                              if (nm.a(var11_int, var10, 116, tj.field_b, var8, var9)) {
                                ln.field_g = 2;
                                break L104;
                              } else {
                                break L104;
                              }
                            }
                            L105: {
                              if (ln.field_g == var12) {
                                break L105;
                              } else {
                                if ((ln.field_g ^ -1) != 0) {
                                  ee.c(-2483, 97);
                                  break L105;
                                } else {
                                  break L105;
                                }
                              }
                            }
                            if (var19 == 0) {
                              break L98;
                            } else {
                              break L101;
                            }
                          }
                        }
                      }
                      if (null == km.field_a) {
                        break L98;
                      } else {
                        if (var4 != 0) {
                          break L98;
                        } else {
                          L106: {
                            L107: {
                              var5_int = 300;
                              if (km.field_a == td.field_ac) {
                                break L107;
                              } else {
                                if (ra.field_b == km.field_a) {
                                  break L107;
                                } else {
                                  break L106;
                                }
                              }
                            }
                            var5_int = 330;
                            break L106;
                          }
                          L108: {
                            var6_int = (-var5_int + 640) / 2;
                            pb.c(0, 0, 640, 480, 0, 128);
                            var7_ref_fh = ff.field_lb;
                            var8 = ((mi) ((Object) var7_ref_fh)).a(km.field_a, var5_int + -16, 0);
                            var9 = 0;
                            if (null == ln.field_c) {
                              break L108;
                            } else {
                              var9 = ln.field_c.field_F - -4;
                              break L108;
                            }
                          }
                          L109: {
                            L110: {
                              var8 = var8 + (var9 + 52);
                              var10 = (-var8 + 480) / 2;
                              var11 = al.field_f;
                              if (td.field_ac == km.field_a) {
                                break L110;
                              } else {
                                if (km.field_a == ra.field_b) {
                                  break L110;
                                } else {
                                  break L109;
                                }
                              }
                            }
                            var11 = null;
                            break L109;
                          }
                          L111: {
                            L112: {
                              var12 = ak.a(ln.field_c, var10, km.field_a, var5_int, var6_int, param0 + -2, var8, 1071146, var11, true);
                              var13 = 30;
                              var14 = 100;
                              var15 = (-var14 + 640) / 2;
                              var16 = -8 + (var8 + var10) - var13;
                              if (td.field_ac == km.field_a) {
                                break L112;
                              } else {
                                if (ra.field_b == km.field_a) {
                                  break L112;
                                } else {
                                  L113: {
                                    if ((var12 ^ -1) > -1) {
                                      break L113;
                                    } else {
                                      if (!gd.field_ub) {
                                        ee.c(-2483, 97);
                                        break L113;
                                      } else {
                                        break L113;
                                      }
                                    }
                                  }
                                  L114: {
                                    if (var12 < 0) {
                                      stackOut_550_0 = 0;
                                      stackIn_551_0 = stackOut_550_0;
                                      break L114;
                                    } else {
                                      stackOut_548_0 = 1;
                                      stackIn_551_0 = stackOut_548_0;
                                      break L114;
                                    }
                                  }
                                  gd.field_ub = stackIn_551_0 != 0;
                                  if (var19 == 0) {
                                    break L111;
                                  } else {
                                    break L112;
                                  }
                                }
                              }
                            }
                            L115: {
                              var17 = ln.field_g;
                              var14 = 100;
                              ln.field_g = -1;
                              var15 = 165;
                              var18 = nm.a(var16, var15, 124, ma.field_Z, var13, var14) ? 1 : 0;
                              if (var18 == 0) {
                                break L115;
                              } else {
                                if (gd.field_ub) {
                                  break L115;
                                } else {
                                  ee.c(-2483, 97);
                                  break L115;
                                }
                              }
                            }
                            var15 = var15 + (10 + var14);
                            gd.field_ub = var18 != 0;
                            var14 = 200;
                            var18 = nm.a(var16, var15, 121, cf.field_v, var13, var14) ? 1 : 0;
                            if (var18 == 0) {
                              break L111;
                            } else {
                              ln.field_g = 0;
                              if ((var17 ^ -1) == -1) {
                                break L111;
                              } else {
                                ee.c(param0 + -2483, 97);
                                break L111;
                              }
                            }
                          }
                          if (var19 == 0) {
                            break L98;
                          } else {
                            break L99;
                          }
                        }
                      }
                    }
                    L116: {
                      ln.field_c = b.field_q[1];
                      km.field_a = pg.field_y;
                      var5_array = null;
                      if ((sn.field_q & 128) != 0) {
                        var5_ref = t.field_e[-128 + sn.field_q];
                        break L116;
                      } else {
                        L117: {
                          if (sn.field_q == 34) {
                            var5_ref = "GODULE";
                            break L117;
                          } else {
                            break L117;
                          }
                        }
                        var5_ref = rj.field_m[sn.field_q];
                        break L116;
                      }
                    }
                    L118: {
                      km.field_a = db.a(km.field_a, -22, new String[]{var5_ref, Integer.toString(f.field_v), Integer.toString(li.field_v)});
                      pb.c(0, 0, 640, 480, 0, 128);
                      var6 = ff.field_lb;
                      var7 = ln.field_c.field_F;
                      var8 = ((mi) ((Object) var6)).a(km.field_a, 284, 16);
                      var8 = var8 + (50 + var7);
                      var9 = (-var8 + 480) / 2;
                      var10 = ak.a(ln.field_c, var9, km.field_a, 300, 170, -2, var8, 1071146, el.field_Vb, true);
                      if (0 > var10) {
                        break L118;
                      } else {
                        if (jl.field_p == var10) {
                          break L118;
                        } else {
                          ee.c(-2483, 97);
                          break L118;
                        }
                      }
                    }
                    jl.field_p = var10;
                    break L98;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                L119: {
                  if (tm.field_h) {
                    break L119;
                  } else {
                    if (tm.field_d == null) {
                      break L119;
                    } else {
                      if (!tm.field_d.a(true)) {
                        break L119;
                      } else {
                        if (!tm.field_d.a("members_expansion_screen", (byte) 90)) {
                          break L119;
                        } else {
                          if (!tm.field_d.a("arialish12", (byte) 90)) {
                            break L119;
                          } else {
                            if (!tm.field_d.a("pump32", (byte) 90)) {
                              break L119;
                            } else {
                              if (ej.field_t == null) {
                                break L119;
                              } else {
                                if (!ej.field_t.a(true)) {
                                  break L119;
                                } else {
                                  if (!ej.field_t.a("arialish12", (byte) 90)) {
                                    break L119;
                                  } else {
                                    if (!ej.field_t.a("pump32", (byte) 90)) {
                                      break L119;
                                    } else {
                                      tm.field_h = true;
                                      break L119;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L120: {
                  if (tm.field_h) {
                    eh.field_c.a(true);
                    break L120;
                  } else {
                    break L120;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L121: {
                if (ej.f(-127)) {
                  la.a(35);
                  break L121;
                } else {
                  break L121;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (var2), "ji.A(" + param0 + ')');
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

    final void a(boolean param0, int param1, int param2) {
        if (-1 != this.field_g.field_e) {
            param1 = this.field_g.field_e;
        }
        this.field_g.a(param0, param1, 0, this.a(oh.field_f, pi.field_c, 77));
        gb.field_a = a.field_c;
        if (param2 >= -56) {
            return;
        }
        try {
            in.field_k = -1;
            ao.field_C = -1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.NA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_149_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_125_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_5_0 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if ((param2 ^ -1) > -2) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    if (1 == param2) {
                      L3: {
                        var4_int = param1;
                        if (-1 != (var4_int ^ -1)) {
                          break L3;
                        } else {
                          if (var5 == 0) {
                            stackOut_125_0 = 3;
                            stackIn_126_0 = stackOut_125_0;
                            decompiledRegionSelector0 = 11;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (-2 == (var4_int ^ -1)) {
                        stackOut_127_0 = 6;
                        stackIn_128_0 = stackOut_127_0;
                        decompiledRegionSelector0 = 12;
                        break L0;
                      } else {
                        L4: {
                          if ((var4_int ^ -1) != -3) {
                            break L4;
                          } else {
                            if (var5 == 0) {
                              stackOut_129_0 = 9;
                              stackIn_130_0 = stackOut_129_0;
                              decompiledRegionSelector0 = 13;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if ((var4_int ^ -1) != -4) {
                            break L5;
                          } else {
                            if (var5 == 0) {
                              stackOut_131_0 = 9;
                              stackIn_132_0 = stackOut_131_0;
                              decompiledRegionSelector0 = 14;
                              break L0;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (-5 != (var4_int ^ -1)) {
                            break L6;
                          } else {
                            if (var5 == 0) {
                              stackOut_133_0 = 3;
                              stackIn_134_0 = stackOut_133_0;
                              decompiledRegionSelector0 = 15;
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if ((var4_int ^ -1) == -6) {
                          stackOut_135_0 = 5;
                          stackIn_136_0 = stackOut_135_0;
                          decompiledRegionSelector0 = 16;
                          break L0;
                        } else {
                          if (-7 == (var4_int ^ -1)) {
                            stackOut_137_0 = 5;
                            stackIn_138_0 = stackOut_137_0;
                            decompiledRegionSelector0 = 17;
                            break L0;
                          } else {
                            L7: {
                              if (var4_int != 7) {
                                break L7;
                              } else {
                                if (var5 == 0) {
                                  stackOut_139_0 = 9;
                                  stackIn_140_0 = stackOut_139_0;
                                  decompiledRegionSelector0 = 18;
                                  break L0;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if (var4_int != 8) {
                                break L8;
                              } else {
                                if (var5 == 0) {
                                  stackOut_141_0 = 5;
                                  stackIn_142_0 = stackOut_141_0;
                                  decompiledRegionSelector0 = 19;
                                  break L0;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            if (9 == var4_int) {
                              stackOut_143_0 = 7;
                              stackIn_144_0 = stackOut_143_0;
                              decompiledRegionSelector0 = 20;
                              break L0;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    } else {
                      L9: {
                        L10: {
                          var4_int = param1;
                          if ((var4_int ^ -1) != -1) {
                            break L10;
                          } else {
                            if (var5 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (var4_int != 1) {
                            break L11;
                          } else {
                            if (var5 == 0) {
                              stackOut_59_0 = 7;
                              stackIn_60_0 = stackOut_59_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (2 != var4_int) {
                            break L12;
                          } else {
                            if (var5 == 0) {
                              stackOut_61_0 = 7;
                              stackIn_62_0 = stackOut_61_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              break L12;
                            }
                          }
                        }
                        if (3 == var4_int) {
                          stackOut_63_0 = 7;
                          stackIn_64_0 = stackOut_63_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          L13: {
                            if (var4_int != 4) {
                              break L13;
                            } else {
                              if (var5 == 0) {
                                stackOut_65_0 = 7;
                                stackIn_66_0 = stackOut_65_0;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (var4_int == 5) {
                            stackOut_67_0 = 7;
                            stackIn_68_0 = stackOut_67_0;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            if (var4_int == 6) {
                              stackOut_69_0 = 10;
                              stackIn_70_0 = stackOut_69_0;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            } else {
                              L14: {
                                if (7 != var4_int) {
                                  break L14;
                                } else {
                                  if (var5 == 0) {
                                    stackOut_71_0 = 7;
                                    stackIn_72_0 = stackOut_71_0;
                                    decompiledRegionSelector0 = 8;
                                    break L0;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              L15: {
                                if ((var4_int ^ -1) != -9) {
                                  break L15;
                                } else {
                                  if (var5 == 0) {
                                    stackOut_73_0 = 10;
                                    stackIn_74_0 = stackOut_73_0;
                                    decompiledRegionSelector0 = 9;
                                    break L0;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              if ((var4_int ^ -1) != -10) {
                                break L2;
                              } else {
                                if (var5 == 0) {
                                  stackOut_75_0 = 7;
                                  stackIn_76_0 = stackOut_75_0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_57_0 = 5;
                      stackIn_58_0 = stackOut_57_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  if (param0 < -66) {
                    stackOut_148_0 = 0;
                    stackIn_149_0 = stackOut_148_0;
                    decompiledRegionSelector0 = 22;
                    break L0;
                  } else {
                    stackOut_146_0 = -100;
                    stackIn_147_0 = stackOut_146_0;
                    decompiledRegionSelector0 = 21;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = -1;
            stackIn_6_0 = stackOut_5_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.UA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_58_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_60_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_62_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_64_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_66_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_68_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_70_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_72_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_74_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_76_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_126_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_128_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_130_0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_132_0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_134_0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_136_0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_138_0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_140_0;
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return stackIn_142_0;
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return stackIn_144_0;
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return stackIn_147_0;
                                                  } else {
                                                    return stackIn_149_0;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void b(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 16383) {
                break L1;
              } else {
                this.a(53, false);
                break L1;
              }
            }
            this.field_g.e((byte) 22);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.Q(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        kg var3 = null;
        gh var3_ref = null;
        int var4_int = 0;
        gh var4 = null;
        int var5_int = 0;
        gh var5 = null;
        gh var6 = null;
        int var6_int = 0;
        Object var7 = null;
        int var7_int = 0;
        gh var8 = null;
        int var8_int = 0;
        gh var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        gh var13 = null;
        String[] var14 = null;
        gh var14_ref = null;
        int var15_int = 0;
        gh var15 = null;
        int var16_int = 0;
        gh var16 = null;
        lb var17 = null;
        int var17_int = 0;
        kg var18 = null;
        gh[] var18_array = null;
        gh var19 = null;
        int var19_int = 0;
        int var20 = 0;
        int var21 = 0;
        gh var22 = null;
        int var22_int = 0;
        int var23 = 0;
        int var24 = 0;
        String var25_ref_String = null;
        int var25 = 0;
        int var26 = 0;
        gh var26_ref_gh = null;
        int var27_int = 0;
        gh var27 = null;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        boolean stackIn_113_0 = false;
        boolean stackIn_135_0 = false;
        int stackIn_241_0 = 0;
        gh stackIn_252_0 = null;
        gh stackIn_304_0 = null;
        int stackIn_305_0 = 0;
        gh stackIn_308_0 = null;
        int stackIn_312_0 = 0;
        gh stackIn_314_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_112_0 = false;
        boolean stackOut_134_0 = false;
        int stackOut_240_0 = 0;
        gh stackOut_251_0 = null;
        gh stackOut_303_0 = null;
        int stackOut_304_0 = 0;
        gh stackOut_307_0 = null;
        int stackOut_311_0 = 0;
        int stackOut_309_0 = 0;
        gh stackOut_313_0 = null;
        var31 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 <= -28) {
                break L1;
              } else {
                this.q(-72);
                break L1;
              }
            }
            L2: {
              var2_int = ha.field_V;
              ha.field_V = -1;
              od.field_e = false;
              if (0 == pm.field_U) {
                break L2;
              } else {
                od.field_e = true;
                break L2;
              }
            }
            L3: {
              if (null != gd.field_sb) {
                L4: {
                  L5: {
                    L6: {
                      var3 = nf.field_a;
                      var4_int = var3.field_Ub.field_eb;
                      var5_int = ef.field_c;
                      if ((var5_int ^ -1) != -105) {
                        break L6;
                      } else {
                        if (var31 == 0) {
                          var3.field_Ub.field_gb = var3.field_Ub.field_gb + Math.min(-20 + var3.field_Lb, -var3.field_Ub.field_eb);
                          if (var31 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                    if ((var5_int ^ -1) == -106) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                  var3.field_Ub.field_gb = var3.field_Ub.field_gb - Math.min(var3.field_Lb - 20, var3.field_Ub.field_Lb + -var3.field_Lb + var3.field_Ub.field_eb);
                  break L4;
                }
                L7: {
                  gd.field_sb.a((byte) -44, true);
                  var5_int = -1;
                  if (null == var3) {
                    break L7;
                  } else {
                    var3.a((byte) 96, jj.field_d * 32, 128, false, 32);
                    var6_int = var3.field_Ub.field_eb;
                    var7 = null;
                    var8_int = 0;
                    L8: while (true) {
                      L9: {
                        if (var8_int >= 32) {
                          break L9;
                        } else {
                          if (null == ck.field_f[var8_int]) {
                            break L9;
                          } else {
                            L10: {
                              L11: {
                                var9_int = hc.field_R[var8_int] + (10 - -(ff.field_lb.field_W / 2));
                                if ((var9_int ^ -1) <= (-var6_int ^ -1)) {
                                  break L11;
                                } else {
                                  L12: {
                                    var7 = ck.field_f[var8_int];
                                    if (98 != ef.field_c) {
                                      break L12;
                                    } else {
                                      var5_int = var8_int;
                                      break L12;
                                    }
                                  }
                                  ck.field_f[var8_int].field_nb = 2061990;
                                  if (ck.field_f[var8_int].field_kb) {
                                    ck.field_f[var8_int].field_nb = 0;
                                    if (var31 == 0) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L13: {
                                if (-var6_int + var3.field_Tb.field_Lb > var9_int) {
                                  break L13;
                                } else {
                                  ck.field_f[var8_int].field_nb = 2061990;
                                  if (!ck.field_f[var8_int].field_kb) {
                                    break L10;
                                  } else {
                                    ck.field_f[var8_int].field_nb = 0;
                                    if (var31 == 0) {
                                      break L10;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                              var7 = null;
                              ck.field_f[var8_int].field_nb = 10526880;
                              break L10;
                            }
                            L14: {
                              if ((ef.field_c ^ -1) != -100) {
                                break L14;
                              } else {
                                if ((var5_int ^ -1) <= -1) {
                                  break L14;
                                } else {
                                  if (var9_int > -var6_int + 20) {
                                    var5_int = var8_int;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                            var8_int++;
                            if (var31 == 0) {
                              continue L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      if (var7 != null) {
                        ((gh) (var7)).field_nb = 10526880;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                L15: {
                  ef.field_c = 0;
                  if (0 > var5_int) {
                    break L15;
                  } else {
                    L16: {
                      var3.field_Ub.field_gb = -4 + (-var3.field_Ub.field_eb + -hc.field_R[var5_int]);
                      if (-var3.field_Ub.field_eb >= var3.field_Ub.field_gb) {
                        break L16;
                      } else {
                        var3.field_Ub.field_gb = -var3.field_Ub.field_eb;
                        break L16;
                      }
                    }
                    if (-var3.field_Ub.field_Lb - (var3.field_Ub.field_lb + (-var3.field_Tb.field_Lb + var3.field_Ub.field_eb)) > var3.field_Ub.field_gb) {
                      var3.field_Ub.field_gb = -var3.field_Ub.field_eb + (-var3.field_Ub.field_lb + -var3.field_Ub.field_Lb - -var3.field_Tb.field_Lb);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                }
                L17: {
                  var6 = gd.field_sb.a("HeadingsPane", false);
                  if (null == var6) {
                    break L17;
                  } else {
                    if (null == var3) {
                      break L17;
                    } else {
                      if (var6.field_kb) {
                        var7_int = 0;
                        L18: while (true) {
                          if (var7_int >= 32) {
                            break L17;
                          } else {
                            if (null == ck.field_f[var7_int]) {
                              break L17;
                            } else {
                              L19: {
                                if (ck.field_f[var7_int].field_kb) {
                                  L20: {
                                    ha.field_V = var7_int;
                                    if (-2 == (lb.field_gc ^ -1)) {
                                      break L20;
                                    } else {
                                      if (var2_int != var7_int) {
                                        var2_int = var7_int;
                                        ee.c(-2483, 97);
                                        if (var31 == 0) {
                                          break L19;
                                        } else {
                                          break L20;
                                        }
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  L21: {
                                    ee.c(-2483, 95);
                                    var3.field_Ub.field_gb = -hc.field_R[var7_int] - var3.field_Ub.field_eb + -4;
                                    if (var3.field_Ub.field_gb <= -var3.field_Ub.field_eb) {
                                      break L21;
                                    } else {
                                      var3.field_Ub.field_gb = -var3.field_Ub.field_eb;
                                      break L21;
                                    }
                                  }
                                  if (-var3.field_Ub.field_eb + (-var3.field_Ub.field_lb + -var3.field_Ub.field_Lb + var3.field_Tb.field_Lb) > var3.field_Ub.field_gb) {
                                    var3.field_Ub.field_gb = -var3.field_Ub.field_eb + (-var3.field_Ub.field_lb + (-var3.field_Ub.field_Lb - -var3.field_Tb.field_Lb));
                                    if (var31 == 0) {
                                      break L17;
                                    } else {
                                      break L19;
                                    }
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L19;
                                }
                              }
                              var7_int++;
                              if (var31 == 0) {
                                continue L18;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      } else {
                        break L17;
                      }
                    }
                  }
                }
                if (var3.field_Ub.field_eb != var4_int) {
                  od.field_e = true;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            if (gd.field_sb == null) {
              od.field_e = true;
              gd.field_sb = new gh();
              gd.field_sb.a(0, 0, 480, 0, 640);
              var3_ref = new gh("DataView", (gh) null);
              pf.field_n = 4;
              bg.field_y = 4;
              bi.field_d = 15;
              var4 = new gh();
              var4.field_nb = 10526880;
              var4.field_L = (mi) ((Object) ff.field_lb);
              var5 = new gh(-1L, var4);
              var5.field_I = gf.field_c;
              var5.field_nb = 0;
              var6 = new gh();
              var6.field_Kb = 1;
              var6.field_Fb = 1;
              var6.field_I = pd.field_T;
              var7 = new gh(-1L, var5);
              ((gh) (var7)).field_ub = 3;
              ((gh) (var7)).field_Ib = 10;
              ((gh) (var7)).field_I = sa.field_e;
              ((gh) (var7)).field_nb = 2061990;
              ((gh) (var7)).field_Ab = wc.field_d;
              ((gh) (var7)).field_Kb = 1;
              ((gh) (var7)).field_L = (mi) ((Object) fk.field_d);
              ((gh) (var7)).field_sb = 0;
              var5.field_Kb = 1;
              var5.field_L = (mi) ((Object) pl.field_U);
              var8 = new gh();
              var8.field_I = tk.field_t;
              var4.field_Fb = 1;
              var9 = new gh("HeadingsPane", (gh) null);
              jj.field_a = var9;
              var9.a(0, 60, 370, 16, 106);
              var10 = 4;
              var11 = 0;
              var12 = -5;
              var13_int = 0;
              L22: while (true) {
                L23: {
                  L24: {
                    L25: {
                      if ((var13_int ^ -1) <= (wc.field_g.length ^ -1)) {
                        break L25;
                      } else {
                        var14 = wc.field_g[var13_int];
                        var15_int = 0;
                        stackOut_112_0 = nk.f((byte) -96);
                        stackIn_305_0 = stackOut_112_0 ? 1 : 0;
                        stackIn_113_0 = stackOut_112_0;
                        if (var31 != 0) {
                          break L23;
                        } else {
                          L26: {
                            L27: {
                              L28: {
                                if (stackIn_113_0) {
                                  break L28;
                                } else {
                                  L29: {
                                    if (var13_int < 62) {
                                      break L29;
                                    } else {
                                      if (63 >= var13_int) {
                                        break L27;
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                  if (65 > var13_int) {
                                    break L28;
                                  } else {
                                    if (var13_int <= 67) {
                                      break L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                              }
                              var16_int = 0;
                              if (var14 == null) {
                                break L27;
                              } else {
                                if (0 == var14.length) {
                                  break L27;
                                } else {
                                  var17_int = 0;
                                  var18_array = new gh[var14.length];
                                  var19_int = 0;
                                  var20 = 0;
                                  var21 = 0;
                                  var22_int = 0;
                                  var23 = 0;
                                  L30: while (true) {
                                    L31: {
                                      L32: {
                                        if (var23 >= var14.length) {
                                          break L32;
                                        } else {
                                          var24 = -1;
                                          var25_ref_String = var14[var23];
                                          var26 = 0;
                                          stackOut_134_0 = var25_ref_String.startsWith("<lock>");
                                          stackIn_241_0 = stackOut_134_0 ? 1 : 0;
                                          stackIn_135_0 = stackOut_134_0;
                                          if (var31 != 0) {
                                            break L31;
                                          } else {
                                            L33: {
                                              if (stackIn_135_0) {
                                                var25_ref_String = var25_ref_String.substring(6);
                                                if (nk.f((byte) -20)) {
                                                  break L33;
                                                } else {
                                                  var26 = 1;
                                                  break L33;
                                                }
                                              } else {
                                                break L33;
                                              }
                                            }
                                            L34: {
                                              L35: {
                                                if (var25_ref_String.startsWith("<top>")) {
                                                  break L35;
                                                } else {
                                                  L36: {
                                                    if (!var25_ref_String.startsWith("<centre>")) {
                                                      break L36;
                                                    } else {
                                                      var25_ref_String = var25_ref_String.substring(8);
                                                      var24 = 1;
                                                      if (var31 == 0) {
                                                        break L34;
                                                      } else {
                                                        break L36;
                                                      }
                                                    }
                                                  }
                                                  if (!var25_ref_String.startsWith("<bottom>")) {
                                                    break L34;
                                                  } else {
                                                    var25_ref_String = var25_ref_String.substring(8);
                                                    var24 = 2;
                                                    if (var31 == 0) {
                                                      break L34;
                                                    } else {
                                                      break L35;
                                                    }
                                                  }
                                                }
                                              }
                                              var24 = 0;
                                              var25_ref_String = var25_ref_String.substring(5);
                                              break L34;
                                            }
                                            L37: {
                                              L38: {
                                                if (var25_ref_String.equals("<lockpic>")) {
                                                  break L38;
                                                } else {
                                                  L39: {
                                                    L40: {
                                                      if (!var25_ref_String.startsWith("<pic")) {
                                                        break L40;
                                                      } else {
                                                        if (var14[var23].endsWith(">")) {
                                                          break L39;
                                                        } else {
                                                          break L40;
                                                        }
                                                      }
                                                    }
                                                    L41: {
                                                      if (!var25_ref_String.startsWith("<h>")) {
                                                        break L41;
                                                      } else {
                                                        L42: {
                                                          var18_array[var23] = new gh((long)var11, var5);
                                                          if (var16_int == 0) {
                                                            var16_int = 1;
                                                            var12 += 10;
                                                            break L42;
                                                          } else {
                                                            break L42;
                                                          }
                                                        }
                                                        var18_array[var23].field_S = var25_ref_String.substring(3);
                                                        var27 = new gh((long)var11, (gh) (var7));
                                                        var27.field_S = ke.a(42, var18_array[var23].field_S);
                                                        var28 = var27.field_L.a(var27.field_S, -(var27.field_ub * 2) + 106, var27.field_Ib) + 3;
                                                        var27.a(0, var10, var28, 0, 106);
                                                        var10 = var10 + (var28 - -4);
                                                        var9.a(var27, 125);
                                                        ck.field_f[var11] = var27;
                                                        hc.field_R[var11] = -10 + var12;
                                                        var11++;
                                                        var21++;
                                                        if (var31 == 0) {
                                                          break L37;
                                                        } else {
                                                          break L41;
                                                        }
                                                      }
                                                    }
                                                    L43: {
                                                      if (dm.field_c) {
                                                        var25_ref_String = ln.a(" <img=13> <img=14> <img=15>", (byte) 11, "", var25_ref_String);
                                                        break L43;
                                                      } else {
                                                        break L43;
                                                      }
                                                    }
                                                    L44: {
                                                      L45: {
                                                        if (!tj.field_a) {
                                                          break L45;
                                                        } else {
                                                          var25_ref_String = ln.a("<rmbcancelonoff>", (byte) 11, bc.field_yb, var25_ref_String);
                                                          if (var31 == 0) {
                                                            break L44;
                                                          } else {
                                                            break L45;
                                                          }
                                                        }
                                                      }
                                                      var25_ref_String = ln.a("<rmbcancelonoff>", (byte) 11, i.field_a, var25_ref_String);
                                                      break L44;
                                                    }
                                                    L46: {
                                                      var18_array[var23] = new gh(-1L, var4);
                                                      var18_array[var23].field_S = var25_ref_String;
                                                      if (var19_int != 0) {
                                                        var18_array[var23].field_Ib = 19;
                                                        break L46;
                                                      } else {
                                                        break L46;
                                                      }
                                                    }
                                                    L47: {
                                                      if (var15_int != 0) {
                                                        var18_array[var23].field_I = pd.field_T;
                                                        var18_array[var23].field_ub = 8;
                                                        var18_array[var23].field_sb = 6;
                                                        break L47;
                                                      } else {
                                                        break L47;
                                                      }
                                                    }
                                                    var21++;
                                                    if (var26 != 0) {
                                                      var18_array[var23].field_Pb = sj.field_F;
                                                      if (var31 == 0) {
                                                        break L37;
                                                      } else {
                                                        break L39;
                                                      }
                                                    } else {
                                                      break L37;
                                                    }
                                                  }
                                                  L48: {
                                                    var18_array[var23] = new gh(-1L, var6);
                                                    var27_int = Integer.parseInt(var25_ref_String.substring(4, var25_ref_String.length() + -1));
                                                    var18_array[var23].field_Pb = ja.b(var27_int, true);
                                                    var28 = 0;
                                                    if (-101 < (var27_int ^ -1)) {
                                                      break L48;
                                                    } else {
                                                      if (-201 >= (var27_int ^ -1)) {
                                                        break L48;
                                                      } else {
                                                        var18_array[var23].field_I = null;
                                                        break L48;
                                                      }
                                                    }
                                                  }
                                                  L49: {
                                                    L50: {
                                                      var29 = 4;
                                                      if (200 <= var27_int) {
                                                        break L50;
                                                      } else {
                                                        if (5 == var27_int) {
                                                          break L50;
                                                        } else {
                                                          if (7 == var27_int) {
                                                            break L50;
                                                          } else {
                                                            L51: {
                                                              if (9 > var27_int) {
                                                                break L51;
                                                              } else {
                                                                if (12 >= var27_int) {
                                                                  break L50;
                                                                } else {
                                                                  break L51;
                                                                }
                                                              }
                                                            }
                                                            if (var27_int != 22) {
                                                              break L49;
                                                            } else {
                                                              break L50;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var29 = 12;
                                                    var20 = var20 | 1 << var23;
                                                    var28 = 48;
                                                    break L49;
                                                  }
                                                  L52: {
                                                    if (3 == var27_int) {
                                                      var19_int = 1;
                                                      break L52;
                                                    } else {
                                                      break L52;
                                                    }
                                                  }
                                                  L53: {
                                                    if (var18_array[var23].field_Pb == null) {
                                                      var18_array[var23].field_Pb = g.field_d;
                                                      break L53;
                                                    } else {
                                                      break L53;
                                                    }
                                                  }
                                                  L54: {
                                                    if (var26 != 0) {
                                                      var18_array[var23].field_Pb = ug.field_P;
                                                      break L54;
                                                    } else {
                                                      break L54;
                                                    }
                                                  }
                                                  L55: {
                                                    if (var28 != 0) {
                                                      break L55;
                                                    } else {
                                                      var28 = var29 + var18_array[var23].field_Pb.field_A;
                                                      break L55;
                                                    }
                                                  }
                                                  var22_int = var22_int + var28;
                                                  if (var31 == 0) {
                                                    break L37;
                                                  } else {
                                                    break L38;
                                                  }
                                                }
                                              }
                                              L56: {
                                                if (nk.f((byte) -87)) {
                                                  break L56;
                                                } else {
                                                  var18_array[var23] = new gh(-1L, var6);
                                                  var18_array[var23].field_Pb = sj.field_F;
                                                  var22_int = var22_int + (var18_array[var23].field_Pb.field_A + 4);
                                                  if (var31 == 0) {
                                                    break L37;
                                                  } else {
                                                    break L56;
                                                  }
                                                }
                                              }
                                              var17_int++;
                                              break L37;
                                            }
                                            L57: {
                                              if (-1 == var24) {
                                                break L57;
                                              } else {
                                                if (var18_array[var23] == null) {
                                                  break L57;
                                                } else {
                                                  var18_array[var23].field_Fb = var24;
                                                  break L57;
                                                }
                                              }
                                            }
                                            var23++;
                                            if (var31 == 0) {
                                              continue L30;
                                            } else {
                                              break L32;
                                            }
                                          }
                                        }
                                      }
                                      var22_int = var22_int + (var14.length + (1 + -var17_int)) * 8;
                                      var23 = 0;
                                      stackOut_240_0 = -1;
                                      stackIn_241_0 = stackOut_240_0;
                                      break L31;
                                    }
                                    L58: {
                                      if (stackIn_241_0 > (var21 ^ -1)) {
                                        var23 = (470 + -var22_int) / var21;
                                        break L58;
                                      } else {
                                        break L58;
                                      }
                                    }
                                    L59: {
                                      if (var16_int != 0) {
                                        var23 = 464;
                                        break L59;
                                      } else {
                                        break L59;
                                      }
                                    }
                                    var24 = 0;
                                    var25 = 0;
                                    L60: while (true) {
                                      L61: {
                                        if (var25 >= var18_array.length) {
                                          break L61;
                                        } else {
                                          var26_ref_gh = var18_array[var25];
                                          stackOut_251_0 = (gh) (var26_ref_gh);
                                          stackIn_304_0 = stackOut_251_0;
                                          stackIn_252_0 = stackOut_251_0;
                                          if (var31 != 0) {
                                            break L24;
                                          } else {
                                            L62: {
                                              if (stackIn_252_0 == null) {
                                                break L62;
                                              } else {
                                                L63: {
                                                  L64: {
                                                    var27_int = 0;
                                                    if (var26_ref_gh.field_Pb != null) {
                                                      break L64;
                                                    } else {
                                                      L65: {
                                                        var28 = var23;
                                                        if (var15_int != 0) {
                                                          var28 -= 16;
                                                          break L65;
                                                        } else {
                                                          break L65;
                                                        }
                                                      }
                                                      L66: {
                                                        var27_int = var26_ref_gh.field_L.a(var26_ref_gh.field_S, var28, var26_ref_gh.field_Ib);
                                                        if (var15_int != 0) {
                                                          var27_int += 16;
                                                          break L66;
                                                        } else {
                                                          break L66;
                                                        }
                                                      }
                                                      if (var31 == 0) {
                                                        break L63;
                                                      } else {
                                                        break L64;
                                                      }
                                                    }
                                                  }
                                                  L67: {
                                                    if (-1 != (1 << var25 & var20 ^ -1)) {
                                                      break L67;
                                                    } else {
                                                      var27_int = var26_ref_gh.field_Pb.field_F + 4;
                                                      if (var31 == 0) {
                                                        break L63;
                                                      } else {
                                                        break L67;
                                                      }
                                                    }
                                                  }
                                                  var27_int = 12 + var26_ref_gh.field_Pb.field_F;
                                                  break L63;
                                                }
                                                if (var27_int <= var24) {
                                                  break L62;
                                                } else {
                                                  var24 = var27_int;
                                                  break L62;
                                                }
                                              }
                                            }
                                            var25++;
                                            if (var31 == 0) {
                                              continue L60;
                                            } else {
                                              break L61;
                                            }
                                          }
                                        }
                                      }
                                      L68: {
                                        var25 = 8;
                                        if (var16_int == 0) {
                                          var25 += 4;
                                          break L68;
                                        } else {
                                          break L68;
                                        }
                                      }
                                      L69: {
                                        if (var18_array.length != 1) {
                                          break L69;
                                        } else {
                                          if (var18_array[0] == null) {
                                            break L69;
                                          } else {
                                            if (var18_array[0].field_Pb == null) {
                                              break L69;
                                            } else {
                                              var25 = (-var18_array[0].field_Pb.field_A + 480) / 2;
                                              break L69;
                                            }
                                          }
                                        }
                                      }
                                      var26 = 0;
                                      L70: while (true) {
                                        L71: {
                                          if ((var26 ^ -1) <= (var18_array.length ^ -1)) {
                                            break L71;
                                          } else {
                                            var27 = var18_array[var26];
                                            if (var31 != 0) {
                                              break L26;
                                            } else {
                                              L72: {
                                                if (null != var27) {
                                                  L73: {
                                                    var28 = var23;
                                                    var29 = var24;
                                                    if (var27.field_Pb == null) {
                                                      break L73;
                                                    } else {
                                                      var30 = 4;
                                                      var29 = var30 + var27.field_Pb.field_F;
                                                      var28 = var27.field_Pb.field_A + var30;
                                                      if (0 != (1 << var26 & var20)) {
                                                        var28 = 48;
                                                        var29 = 48;
                                                        break L73;
                                                      } else {
                                                        break L73;
                                                      }
                                                    }
                                                  }
                                                  var27.a(0, (-var29 + var24) / 2 + var12, var29, var25, var28);
                                                  var3_ref.a(var27, 124);
                                                  var25 = var25 + (8 + var28);
                                                  break L72;
                                                } else {
                                                  break L72;
                                                }
                                              }
                                              var26++;
                                              if (var31 == 0) {
                                                continue L70;
                                              } else {
                                                break L71;
                                              }
                                            }
                                          }
                                        }
                                        var12 = var12 + (4 + var24);
                                        break L27;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var13_int++;
                            break L26;
                          }
                          if (var31 == 0) {
                            continue L22;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    stackOut_303_0 = (gh) (var3_ref);
                    stackIn_304_0 = stackOut_303_0;
                    break L24;
                  }
                  ((gh) (Object) stackIn_304_0).a(0, 0, var12, 0, 480);
                  stackOut_304_0 = 0;
                  stackIn_305_0 = stackOut_304_0;
                  break L23;
                }
                var13_int = stackIn_305_0;
                L74: while (true) {
                  L75: {
                    L76: {
                      if (var11 <= var13_int) {
                        break L76;
                      } else {
                        stackOut_307_0 = new gh(-1L, var8);
                        stackIn_314_0 = stackOut_307_0;
                        stackIn_308_0 = stackOut_307_0;
                        if (var31 != 0) {
                          break L75;
                        } else {
                          L77: {
                            var14_ref = stackIn_308_0;
                            var15_int = -10 + (5 + (hc.field_R[var13_int] - -10));
                            if ((var11 ^ -1) >= (1 + var13_int ^ -1)) {
                              stackOut_311_0 = var12;
                              stackIn_312_0 = stackOut_311_0;
                              break L77;
                            } else {
                              stackOut_309_0 = hc.field_R[1 + var13_int];
                              stackIn_312_0 = stackOut_309_0;
                              break L77;
                            }
                          }
                          var16_int = stackIn_312_0;
                          var14_ref.a(0, var15_int, -var15_int + var16_int, 4, 472);
                          var3_ref.a(var14_ref, 121);
                          var13_int++;
                          if (var31 == 0) {
                            continue L74;
                          } else {
                            break L76;
                          }
                        }
                      }
                    }
                    stackOut_313_0 = new gh();
                    stackIn_314_0 = stackOut_313_0;
                    break L75;
                  }
                  L78: {
                    L79: {
                      var13 = stackIn_314_0;
                      var13.field_db = sj.field_x[1];
                      var13.field_Pb = sj.field_x[0];
                      var14_ref = new gh();
                      var14_ref.field_Pb = ah.field_Zb[0];
                      var14_ref.field_db = ah.field_Zb[1];
                      var15 = new gh();
                      var15.field_I = qi.field_a;
                      var16 = new gh();
                      var16.field_I = jn.field_f;
                      var17 = new lb("", var13, var14_ref, var15, var16);
                      var18 = new kg("Scrollingview", var3_ref, (gh) null, var17);
                      nf.field_a = var18;
                      var18.a(bi.field_d + 480, -2048, bi.field_d, 358, bg.field_y, 0, 4);
                      var18.field_I = null;
                      var19 = new gh(-1L, (gh) null);
                      var19.field_I = pd.field_T;
                      var19.a(var18, 119);
                      var19.a(0, 64, 366, 126, 4 + bi.field_d + 480);
                      gd.field_sb.a(var19, 125);
                      gd.field_sb.a(var9, 119);
                      var20 = -2 + var11 + (var9.field_Lb - var10);
                      if (var11 > 1) {
                        var20 = var20 / (-1 + var11);
                        var21 = 0;
                        var22 = (gh) ((Object) var9.field_M.e(13058));
                        L80: while (true) {
                          if (null == var22) {
                            break L79;
                          } else {
                            var22.a(0, var21 + var22.field_eb, var22.field_Lb, var22.field_Y, var22.field_zb);
                            var21 = var21 + var20;
                            var22 = (gh) ((Object) var9.field_M.a((byte) -55));
                            if (var31 != 0) {
                              break L78;
                            } else {
                              if (var31 == 0) {
                                continue L80;
                              } else {
                                break L79;
                              }
                            }
                          }
                        }
                      } else {
                        break L79;
                      }
                    }
                    break L78;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (0 != pm.field_U) {
                break L1;
              } else {
                if (this.field_c != pm.field_T) {
                  break L1;
                } else {
                  this.field_h = 0;
                  this.field_k = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (this.field_c == 0) {
                break L2;
              } else {
                L3: {
                  if (0 == pm.field_T) {
                    break L3;
                  } else {
                    if ((vb.field_g ^ -1) != -1) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.field_h = 0;
                this.field_k = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
            L4: {
              L5: {
                this.field_k = 480;
                this.field_h = 480;
                var2_int = 0;
                if ((2 * pm.field_U ^ -1) <= -21) {
                  break L5;
                } else {
                  L6: {
                    if ((this.field_c ^ -1) == -1) {
                      break L6;
                    } else {
                      if (this.field_c != pm.field_T) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var2_int = pm.field_U;
                  if (var5 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if ((this.field_c ^ -1) == -1) {
                  break L7;
                } else {
                  if ((this.field_c ^ -1) == (vb.field_g ^ -1)) {
                    break L7;
                  } else {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
              var2_int = -pm.field_U + 20;
              break L4;
            }
            L8: {
              L9: {
                L10: {
                  var3 = 0;
                  if ((this.field_c ^ -1) == -2) {
                    break L10;
                  } else {
                    if ((this.field_c ^ -1) == -3) {
                      break L10;
                    } else {
                      if (this.field_c == 3) {
                        break L10;
                      } else {
                        if (-5 != (this.field_c ^ -1)) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
                var3 = 200;
                if (var5 == 0) {
                  break L8;
                } else {
                  break L9;
                }
              }
              var3 = this.d((byte) 114);
              break L8;
            }
            L11: {
              var4 = 50;
              if (this.field_c == 0) {
                var4 = ma.field_eb.field_B;
                break L11;
              } else {
                break L11;
              }
            }
            if (!param0) {
              this.field_h = var4 * var2_int / 10;
              if (this.field_c != 0) {
                L12: {
                  L13: {
                    if (-1 != (this.field_c ^ -1)) {
                      break L13;
                    } else {
                      L14: {
                        L15: {
                          if (2 * pm.field_U < 20) {
                            break L15;
                          } else {
                            if ((vb.field_g ^ -1) == (this.field_c ^ -1)) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L16: {
                          if (-10 >= (var2_int ^ -1)) {
                            break L16;
                          } else {
                            this.field_k = var2_int * (var3 + -60) / 9;
                            if (var5 == 0) {
                              break L12;
                            } else {
                              break L16;
                            }
                          }
                        }
                        this.field_k = (var2_int * 37 + -333) / 1 + var3 + -60;
                        if (var5 == 0) {
                          break L12;
                        } else {
                          break L14;
                        }
                      }
                      L17: {
                        if (var2_int >= 1) {
                          break L17;
                        } else {
                          this.field_k = var2_int * 60 / 1;
                          if (var5 == 0) {
                            break L12;
                          } else {
                            break L17;
                          }
                        }
                      }
                      this.field_k = 60 - -((9 + (var2_int - 10)) * (var3 + -60) / 9);
                      if (var5 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  this.field_k = 0;
                  break L12;
                }
                decompiledRegionSelector0 = 6;
                break L0;
              } else {
                L18: {
                  L19: {
                    if ((pm.field_U ^ -1) <= -11) {
                      break L19;
                    } else {
                      this.field_k = pm.field_U * (-50 + var3) / 10;
                      if (var5 == 0) {
                        break L18;
                      } else {
                        break L19;
                      }
                    }
                  }
                  this.field_k = -50 + (var3 + (pm.field_U * 50 + -500) / 10);
                  break L18;
                }
                L20: {
                  this.field_h = pm.field_U * var4 / 20;
                  if (this.field_c == pm.field_T) {
                    break L20;
                  } else {
                    this.field_k = var3 + -this.field_k;
                    this.field_h = -this.field_h + var4;
                    break L20;
                  }
                }
                decompiledRegionSelector0 = 5;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 4;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.U(" + param0 + ')');
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

    final void s(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (-7 != (this.field_c ^ -1)) {
                break L1;
              } else {
                qi.field_j = null;
                break L1;
              }
            }
            L2: {
              if ((this.field_c ^ -1) == -6) {
                qi.field_d = null;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 > 125) {
                break L3;
              } else {
                this.a(false);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.LA(" + param0 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 44) {
                break L1;
              } else {
                ji.d(-110, -20);
                break L1;
              }
            }
            da.a(param0, 25104);
            r.a(false, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.EB(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean e(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 20) {
                break L1;
              } else {
                field_d = (int[]) null;
                break L1;
              }
            }
            stackOut_3_0 = 1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.PA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    ji(int param0) {
        this.field_k = 0;
        this.field_h = 0;
        try {
            this.field_c = param0;
            this.field_g = new rm(uc.field_e[this.field_c].length);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.<init>(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1, int param2, int param3, String param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        u var10 = null;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_23_0 = null;
        String stackOut_21_0 = null;
        String stackOut_18_0 = null;
        String stackOut_15_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var16 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_a = -81;
                break L1;
              }
            }
            L2: {
              L3: {
                var9_int = 1021128;
                var10 = pl.field_U;
                if (param0) {
                  var11_int = -11 + param2;
                  var12 = 13;
                  var13 = 0;
                  L4: while (true) {
                    if (var13 >= 4) {
                      break L3;
                    } else {
                      var14 = nm.field_v[var13];
                      var15 = nm.field_v[1 + var13];
                      pb.a(var14 + 3, var11_int, -var14 + var15 + -5, var12, 12105);
                      var13++;
                      if (var16 != 0) {
                        break L2;
                      } else {
                        if (var16 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              ((mi) ((Object) var10)).b(param4, nm.field_v[0] + 5, param2, var9_int, -1);
              param3++;
              ((mi) ((Object) var10)).b(cd.field_c[param5], 5 + nm.field_v[1], param2, var9_int, -1);
              break L2;
            }
            L5: {
              if (-44 != (param3 ^ -1)) {
                if (param3 != 42) {
                  if (param3 != 41) {
                    stackOut_23_0 = Integer.toString(param3);
                    stackIn_24_0 = stackOut_23_0;
                    break L5;
                  } else {
                    stackOut_21_0 = "40+";
                    stackIn_24_0 = stackOut_21_0;
                    break L5;
                  }
                } else {
                  stackOut_18_0 = ob.field_x;
                  stackIn_24_0 = stackOut_18_0;
                  break L5;
                }
              } else {
                stackOut_15_0 = of.field_a;
                stackIn_24_0 = stackOut_15_0;
                break L5;
              }
            }
            var11 = stackIn_24_0;
            ((mi) ((Object) var10)).c(var11, -1 + nm.field_v[3] - 5, param2, var9_int, -1);
            ((mi) ((Object) var10)).c(Integer.toString(param6), nm.field_v[4] + -6, param2, var9_int, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var9);
            stackOut_26_1 = new StringBuilder().append("ji.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L6;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void h(byte param0) {
        try {
            field_d = null;
            field_l = null;
            field_f = null;
            field_b = null;
            if (param0 != -104) {
                field_f = (String[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.S(" + param0 + ')');
        }
    }

    final static void d(int param0, int param1) {
        try {
            nb.b(param1, false);
            if (param0 != 0) {
                ji.a(true, (byte) 17);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.O(" + param0 + ',' + param1 + ')');
        }
    }

    private final int b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_115_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_28_0 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            if (-17 == (this.field_c ^ -1)) {
              stackOut_4_0 = -1;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2_int = this.field_g.field_e;
                if (var2_int < 0) {
                  break L1;
                } else {
                  if ((var2_int ^ -1) <= (uc.field_e[this.field_c].length ^ -1)) {
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                var3 = this.b(param0 ^ 105, var2_int);
                if (-1 < (var2_int ^ -1)) {
                  break L2;
                } else {
                  if (uc.field_e[this.field_c].length <= var2_int) {
                    break L2;
                  } else {
                    if ((uc.field_e[this.field_c][var2_int] ^ -1) == 0) {
                      break L2;
                    } else {
                      if (0 == this.field_c) {
                        L3: {
                          if (uc.field_e[this.field_c][var2_int] == 34) {
                            break L3;
                          } else {
                            if (uc.field_e[this.field_c][-1 + uc.field_e[this.field_c].length] != 34) {
                              break L3;
                            } else {
                              dh.field_F = var2_int;
                              stackOut_37_0 = -1 + uc.field_e[this.field_c].length;
                              stackIn_38_0 = stackOut_37_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                        stackOut_39_0 = var2_int;
                        stackIn_40_0 = stackOut_39_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L4: {
                          if (this.field_c != 20) {
                            break L4;
                          } else {
                            if (var2_int < 0) {
                              break L4;
                            } else {
                              if (3 <= var2_int) {
                                break L4;
                              } else {
                                stackOut_48_0 = 0;
                                stackIn_49_0 = stackOut_48_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                        if (var3 < 0) {
                          L5: {
                            if (5 != this.field_c) {
                              break L5;
                            } else {
                              if (var2_int < 3) {
                                L6: {
                                  var2_int--;
                                  if (0 <= var2_int) {
                                    break L6;
                                  } else {
                                    var2_int += 3;
                                    break L6;
                                  }
                                }
                                stackOut_82_0 = var2_int;
                                stackIn_83_0 = stackOut_82_0;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (-7 != (this.field_c ^ -1)) {
                              break L7;
                            } else {
                              if (2 > var2_int) {
                                L8: {
                                  var2_int--;
                                  if (0 > var2_int) {
                                    var2_int += 2;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                stackOut_94_0 = var2_int;
                                stackIn_95_0 = stackOut_94_0;
                                decompiledRegionSelector0 = 8;
                                break L0;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L9: {
                            if ((this.field_c ^ -1) == -20) {
                              L10: {
                                if (uc.field_e[this.field_c] == fa.field_c) {
                                  stackOut_102_0 = 30;
                                  stackIn_103_0 = stackOut_102_0;
                                  break L10;
                                } else {
                                  stackOut_100_0 = 20;
                                  stackIn_103_0 = stackOut_100_0;
                                  break L10;
                                }
                              }
                              var4 = stackIn_103_0;
                              if ((var2_int ^ -1) > -11) {
                                break L9;
                              } else {
                                if (var2_int < var4) {
                                  stackOut_109_0 = var2_int - 10;
                                  stackIn_110_0 = stackOut_109_0;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                } else {
                                  break L9;
                                }
                              }
                            } else {
                              break L9;
                            }
                          }
                          L11: {
                            if (param0 == -20) {
                              break L11;
                            } else {
                              this.r(1);
                              break L11;
                            }
                          }
                          stackOut_114_0 = -1;
                          stackIn_115_0 = stackOut_114_0;
                          decompiledRegionSelector0 = 10;
                          break L0;
                        } else {
                          L12: {
                            var3--;
                            var2_int--;
                            if (0 > var3) {
                              var3 += 4;
                              var2_int += 4;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L13: while (true) {
                            L14: {
                              if (-1 != uc.field_e[this.field_c][var2_int]) {
                                stackOut_71_0 = var2_int;
                                stackIn_72_0 = stackOut_71_0;
                                break L14;
                              } else {
                                var2_int--;
                                var3--;
                                stackOut_58_0 = var3;
                                stackIn_72_0 = stackOut_58_0;
                                stackIn_59_0 = stackOut_58_0;
                                if (var5 != 0) {
                                  break L14;
                                } else {
                                  stackOut_59_0 = stackIn_59_0;
                                  stackIn_61_0 = stackOut_59_0;
                                  L15: {
                                    if (stackIn_61_0 < 0) {
                                      var2_int += 4;
                                      var3 += 4;
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  if ((var2_int ^ -1) == (this.field_g.field_e ^ -1)) {
                                    stackOut_69_0 = var2_int;
                                    stackIn_70_0 = stackOut_69_0;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    continue L13;
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
              }
              var2_int = uc.field_e[this.field_c].length - 1;
              L16: while (true) {
                L17: {
                  L18: {
                    if (var2_int < 0) {
                      break L18;
                    } else {
                      stackOut_21_0 = -1;
                      stackIn_29_0 = stackOut_21_0;
                      stackIn_22_0 = stackOut_21_0;
                      if (var5 != 0) {
                        break L17;
                      } else {
                        if (stackIn_22_0 != uc.field_e[this.field_c][var2_int]) {
                          break L18;
                        } else {
                          var2_int--;
                          if (var5 == 0) {
                            continue L16;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                  }
                  stackOut_28_0 = var2_int;
                  stackIn_29_0 = stackOut_28_0;
                  break L17;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.GA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_29_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_38_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_40_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_49_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_72_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_70_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_83_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_95_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_110_0;
                          } else {
                            return stackIn_115_0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static long a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        long stackIn_35_0 = 0L;
        long stackIn_40_0 = 0L;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        long stackOut_34_0 = 0L;
        long stackOut_39_0 = 0L;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            var2_long = 0L;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var5 ^ -1) <= (var4 ^ -1)) {
                    break L3;
                  } else {
                    var2_long = var2_long * 37L;
                    var6 = param1.charAt(var5);
                    stackOut_3_0 = var6;
                    stackOut_3_1 = 65;
                    stackIn_30_0 = stackOut_3_0;
                    stackIn_30_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 < stackIn_4_1) {
                            break L5;
                          } else {
                            if (90 < var6) {
                              break L5;
                            } else {
                              var2_long = var2_long + (long)(var6 + 1 - 65);
                              if (var7 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        L6: {
                          if (-98 < (var6 ^ -1)) {
                            break L6;
                          } else {
                            if ((var6 ^ -1) < -123) {
                              break L6;
                            } else {
                              var2_long = var2_long + (long)(-97 + var6 + 1);
                              if (var7 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        if (var6 < 48) {
                          break L4;
                        } else {
                          if (57 < var6) {
                            break L4;
                          } else {
                            var2_long = var2_long + (long)(-48 + var6 + 27);
                            break L4;
                          }
                        }
                      }
                      if (-177917621779460414L >= (var2_long ^ -1L)) {
                        break L3;
                      } else {
                        var5++;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_29_0 = param0;
                stackOut_29_1 = -53;
                stackIn_30_0 = stackOut_29_0;
                stackIn_30_1 = stackOut_29_1;
                break L2;
              }
              L7: {
                if (stackIn_30_0 < stackIn_30_1) {
                  break L7;
                } else {
                  ji.h((byte) -101);
                  break L7;
                }
              }
              L8: while (true) {
                L9: {
                  L10: {
                    if (-1L != (var2_long % 37L ^ -1L)) {
                      break L10;
                    } else {
                      stackOut_34_0 = var2_long;
                      stackIn_40_0 = stackOut_34_0;
                      stackIn_35_0 = stackOut_34_0;
                      if (var7 != 0) {
                        break L9;
                      } else {
                        if (stackIn_35_0 == 0L) {
                          break L10;
                        } else {
                          var2_long = var2_long / 37L;
                          if (var7 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                  stackOut_39_0 = var2_long;
                  stackIn_40_0 = stackOut_39_0;
                  break L9;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var2);
            stackOut_41_1 = new StringBuilder().append("ji.N(").append(param0).append(',');
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L11;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L11;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ')');
        }
        return stackIn_40_0;
    }

    private final boolean a(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_21_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 116) {
                break L1;
              } else {
                this.p(-101);
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = uc.field_e[this.field_c][param1];
                if (43 == var3_int) {
                  break L3;
                } else {
                  if (-45 != (var3_int ^ -1)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (dm.field_c) {
                break L2;
              } else {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              if (-41 != (var3_int ^ -1)) {
                break L4;
              } else {
                if (-1 >= (dc.field_g ^ -1)) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L4;
                }
              }
            }
            if (-1 != var3_int) {
              L5: {
                if (28 != var3_int) {
                  break L5;
                } else {
                  if (vb.b(116)) {
                    break L5;
                  } else {
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
              L6: {
                if (-2 != (var3_int ^ -1)) {
                  break L6;
                } else {
                  if (!vb.b(122)) {
                    stackOut_35_0 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if ((var3_int ^ -1) != -26) {
                  break L7;
                } else {
                  if (20 == this.field_c) {
                    L8: {
                      if (-1 <= (ol.field_Ub ^ -1)) {
                        stackOut_46_0 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        break L8;
                      } else {
                        stackOut_44_0 = 1;
                        stackIn_47_0 = stackOut_44_0;
                        break L8;
                      }
                    }
                    decompiledRegionSelector0 = 5;
                    break L0;
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                if (-27 != (var3_int ^ -1)) {
                  break L9;
                } else {
                  if ((this.field_c ^ -1) == -21) {
                    L10: {
                      L11: {
                        if ((ol.field_Ub ^ -1) <= -10) {
                          break L11;
                        } else {
                          if (ol.field_Ub >= fm.field_f[ge.field_j]) {
                            break L11;
                          } else {
                            stackOut_58_0 = 1;
                            stackIn_61_0 = stackOut_58_0;
                            break L10;
                          }
                        }
                      }
                      stackOut_60_0 = 0;
                      stackIn_61_0 = stackOut_60_0;
                      break L10;
                    }
                    decompiledRegionSelector0 = 6;
                    break L0;
                  } else {
                    break L9;
                  }
                }
              }
              L12: {
                if (-1 != (var3_int ^ -1)) {
                  break L12;
                } else {
                  if (-21 != (this.field_c ^ -1)) {
                    break L12;
                  } else {
                    L13: {
                      L14: {
                        if (!vb.b(114)) {
                          break L14;
                        } else {
                          if (ni.b(111)) {
                            break L14;
                          } else {
                            stackOut_72_0 = 1;
                            stackIn_75_0 = stackOut_72_0;
                            break L13;
                          }
                        }
                      }
                      stackOut_74_0 = 0;
                      stackIn_75_0 = stackOut_74_0;
                      break L13;
                    }
                    decompiledRegionSelector0 = 7;
                    break L0;
                  }
                }
              }
              L15: {
                if (14 != this.field_c) {
                  break L15;
                } else {
                  if (var3_int != 46) {
                    break L15;
                  } else {
                    if (0 > dc.field_g) {
                      break L15;
                    } else {
                      stackOut_83_0 = 0;
                      stackIn_84_0 = stackOut_83_0;
                      decompiledRegionSelector0 = 8;
                      break L0;
                    }
                  }
                }
              }
              stackOut_85_0 = 1;
              stackIn_86_0 = stackOut_85_0;
              decompiledRegionSelector0 = 9;
              break L0;
            } else {
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.HB(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_28_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_36_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_47_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_61_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_75_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_84_0 != 0;
                        } else {
                          return stackIn_86_0 != 0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void k(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -90) {
                break L1;
              } else {
                this.a((String) null, -9, 98, true, 4, -58, 114, -36, 75);
                break L1;
              }
            }
            this.field_g.e((byte) 22);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.G(" + param0 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (96 != ei.field_q) {
                break L1;
              } else {
                L2: {
                  if (0 >= this.field_g.field_e) {
                    break L2;
                  } else {
                    if (2 == this.field_g.field_e) {
                      break L1;
                    } else {
                      this.field_g.a(0, 0);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                this.field_g.a(0, 1);
                break L1;
              }
            }
            L3: {
              if (ei.field_q == 97) {
                L4: {
                  if (-2 != (this.field_g.field_e ^ -1)) {
                    break L4;
                  } else {
                    this.field_g.a(0, 0);
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (-3 != (this.field_g.field_e ^ -1)) {
                  this.field_g.a(0, 1);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L5: {
              if (-100 == (ei.field_q ^ -1)) {
                L6: {
                  L7: {
                    if (this.field_g.field_e < 0) {
                      break L7;
                    } else {
                      if ((this.field_g.field_e ^ -1) >= -2) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  this.field_g.a(0, on.field_j);
                  if (var3 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
                this.field_g.a(0, 2);
                break L5;
              } else {
                break L5;
              }
            }
            L8: {
              if (-99 != (ei.field_q ^ -1)) {
                break L8;
              } else {
                L9: {
                  if (-3 == (this.field_g.field_e ^ -1)) {
                    break L9;
                  } else {
                    this.field_g.a(0, 2);
                    if (var3 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                this.field_g.a(0, on.field_j);
                break L8;
              }
            }
            var2_int = -16 / ((44 - param0) / 62);
            this.field_g.e((byte) 22);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.H(" + param0 + ')');
        }
    }

    static {
        field_a = 0;
        field_f = new String[]{"More sentinels and weapons", "More battlefields", "More missions"};
        field_b = new String[]{"<col=ff0000>This sentinel has no weapons.</col>", "Having multiple <%0> modules is redundant.", "The energised armour only works in combination with energy shields.", "The gravity pods are of no use on a sentinel that cannot jump.", "The air stabilisers are of no use on a sentinel that cannot thrust.", "This sentinel has no weapons compatible with AMARDS.", "This sentinel has no weapons compatible with its targeting system.", "The speed-loader only works with rockets or missiles.", "The coolant array only works with plasma weapons.", "The high-energy amplifier only works with laser weapons.", "The emergency displacement deployment requires 5<nbsp>TJ of energy capacity.", "The fusion blade close-combat attack requires 10<nbsp>TJ of energy capacity."};
        field_l = "Username: ";
        field_j = -1;
        field_d = new int[]{3, 4, -1, 8};
    }
}
