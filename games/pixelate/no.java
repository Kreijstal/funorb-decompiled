/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends kd {
    private int field_f;
    static String field_n;
    static tf[] field_p;
    static String field_g;
    private int field_i;
    static String field_j;
    static int field_h;
    private int field_e;
    private int field_q;
    private int field_k;
    private String field_m;
    private boolean field_o;
    private jl field_l;

    final static void a(int param0, int param1, byte param2, boolean param3, int param4, int param5, eq param6, int param7) {
        int var8_int = 0;
        lo[] var8 = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        lo var13 = null;
        int var14 = 0;
        int var15 = 0;
        lo[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int stackIn_4_0 = 0;
        int stackIn_31_0 = 0;
        lo[][] stackIn_35_0 = null;
        lo[][] stackIn_36_0 = null;
        lo[][] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_30_0 = 0;
        lo[][] stackOut_34_0 = null;
        lo[][] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        lo[][] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_77_0 = 0;
        byte stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        L0: {
          L1: {
            L2: {
              var15 = Pixelate.field_H ? 1 : 0;
              if (param0 > param7) {
                break L2;
              } else {
                var8_int = 1;
                var9 = 0;
                L3: while (true) {
                  L4: {
                    L5: {
                      if (var9 >= h.field_Z.length) {
                        break L5;
                      } else {
                        var20 = h.field_Z[var9];
                        var19 = var20;
                        var18 = var19;
                        var17 = var18;
                        var10_ref_int__ = var17;
                        var11 = 0;
                        stackOut_3_0 = 0;
                        stackIn_31_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var15 != 0) {
                          break L4;
                        } else {
                          var12 = stackIn_4_0;
                          L6: while (true) {
                            L7: {
                              L8: {
                                if (var20.length <= var12) {
                                  break L8;
                                } else {
                                  L9: {
                                    var13_int = var20[var12];
                                    var14 = var10_ref_int__[1 + var12];
                                    if (var13_int != -1) {
                                      L10: {
                                        if (param7 != var13_int) {
                                          break L10;
                                        } else {
                                          if (var14 != param5) {
                                            break L10;
                                          } else {
                                            var11 = 1;
                                            if (var15 == 0) {
                                              break L9;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                      if (var13_int >= param7) {
                                        break L7;
                                      } else {
                                        if ((kf.field_o[var13_int] & 255) != var14) {
                                          break L7;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    } else {
                                      if (var14 != ia.field_a[param4]) {
                                        break L7;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  var12 += 2;
                                  if (var15 == 0) {
                                    continue L6;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L11: {
                                if (var11 != 0) {
                                  break L11;
                                } else {
                                  if (fj.field_b == param7) {
                                    break L11;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var8_int = 0;
                              var12 = 0;
                              L12: while (true) {
                                if (var20.length <= var12) {
                                  break L7;
                                } else {
                                  L13: {
                                    L14: {
                                      var13_int = var20[var12];
                                      if (-1 != var13_int) {
                                        break L14;
                                      } else {
                                        ib.field_b = true;
                                        if (var15 == 0) {
                                          break L13;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    if (param7 > var13_int) {
                                      lc.field_t[var13_int] = true;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  var12 += 2;
                                  if (var15 == 0) {
                                    continue L12;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            var9++;
                            if (var15 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    stackOut_30_0 = var8_int;
                    stackIn_31_0 = stackOut_30_0;
                    break L4;
                  }
                  L15: {
                    if (stackIn_31_0 == 0) {
                      break L15;
                    } else {
                      pb.field_f = true;
                      break L15;
                    }
                  }
                  if (var15 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L16: {
              stackOut_34_0 = hc.field_L;
              stackIn_36_0 = stackOut_34_0;
              stackIn_35_0 = stackOut_34_0;
              if ((param7 ^ -1) != 0) {
                stackOut_36_0 = (lo[][]) (Object) stackIn_36_0;
                stackOut_36_1 = param7 + 4;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                break L16;
              } else {
                stackOut_35_0 = (lo[][]) (Object) stackIn_35_0;
                stackOut_35_1 = 1;
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                break L16;
              }
            }
            L17: {
              var16 = stackIn_37_0[stackIn_37_1];
              var8 = var16;
              var9 = 1;
              if (!param3) {
                break L17;
              } else {
                if ((param7 ^ -1) == 0) {
                  var10 = 0;
                  if (var10 >= ia.field_a.length) {
                    break L17;
                  } else {
                    stackOut_47_0 = 0;
                    stackOut_47_1 = qm.field_J[var10 / 8] & 1 << (7 & var10);
                    stackIn_105_0 = stackOut_47_0;
                    stackIn_105_1 = stackOut_47_1;
                    stackIn_48_0 = stackOut_47_0;
                    stackIn_48_1 = stackOut_47_1;
                    if (var15 != 0) {
                      break L0;
                    } else {
                      L18: {
                        if (stackIn_48_0 == stackIn_48_1) {
                          break L18;
                        } else {
                          var9 = 0;
                          if (var15 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      var10++;
                      break L17;
                    }
                  }
                } else {
                  L19: {
                    L20: {
                      var10 = 0;
                      if (var10 >= var16.length - 1) {
                        break L20;
                      } else {
                        stackOut_40_0 = k.field_k[(var10 + param1) / 8] & 1 << (7 & var10 + param1);
                        stackIn_45_0 = stackOut_40_0;
                        stackIn_41_0 = stackOut_40_0;
                        if (var15 != 0) {
                          break L19;
                        } else {
                          L21: {
                            if (stackIn_41_0 == 0) {
                              break L21;
                            } else {
                              var9 = 0;
                              if (var15 == 0) {
                                break L20;
                              } else {
                                break L21;
                              }
                            }
                          }
                          var10++;
                          break L20;
                        }
                      }
                    }
                    stackOut_44_0 = param1 + (oe.field_Rb[param7] & 255);
                    stackIn_45_0 = stackOut_44_0;
                    break L19;
                  }
                  param1 = stackIn_45_0;
                  var10 = 0;
                  if (var10 >= ia.field_a.length) {
                    break L17;
                  } else {
                    stackOut_52_0 = 0;
                    stackOut_52_1 = qm.field_J[var10 / 8] & 1 << (7 & var10);
                    stackIn_105_0 = stackOut_52_0;
                    stackIn_105_1 = stackOut_52_1;
                    stackIn_53_0 = stackOut_52_0;
                    stackIn_53_1 = stackOut_52_1;
                    if (var15 != 0) {
                      break L0;
                    } else {
                      L22: {
                        if (stackIn_53_0 == stackIn_53_1) {
                          break L22;
                        } else {
                          var9 = 0;
                          if (var15 == 0) {
                            break L17;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var10++;
                      break L17;
                    }
                  }
                }
              }
            }
            var10 = 0;
            var11 = 0;
            L23: while (true) {
              L24: {
                if (0 != (param7 ^ -1)) {
                  stackOut_59_0 = -1 + var16.length;
                  stackIn_60_0 = stackOut_59_0;
                  break L24;
                } else {
                  stackOut_58_0 = ia.field_a.length;
                  stackIn_60_0 = stackOut_58_0;
                  break L24;
                }
              }
              if (stackIn_60_0 <= var11) {
                if (var10 == 0) {
                  var11 = 0;
                  L25: while (true) {
                    if (var16.length - 1 <= var11) {
                      break L1;
                    } else {
                      L26: {
                        L27: {
                          if (0 == (param7 ^ -1)) {
                            break L27;
                          } else {
                            kf.field_o[param7] = (byte)var11;
                            if (var15 == 0) {
                              break L26;
                            } else {
                              break L27;
                            }
                          }
                        }
                        param4 = var11;
                        break L26;
                      }
                      no.a(param0, param1, (byte) 83, param3, param4, param5, param6, param7 - -1);
                      if (!pb.field_f) {
                        var11++;
                        continue L25;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              } else {
                L28: {
                  L29: {
                    if (-1 != param7) {
                      break L29;
                    } else {
                      param4 = var11;
                      if (var15 == 0) {
                        break L28;
                      } else {
                        break L29;
                      }
                    }
                  }
                  kf.field_o[param7] = (byte)var11;
                  break L28;
                }
                L30: {
                  L31: {
                    L32: {
                      if (param7 != 0) {
                        break L32;
                      } else {
                        if (-2 == ia.field_a.length) {
                          break L31;
                        } else {
                          break L32;
                        }
                      }
                    }
                    L33: {
                      L34: {
                        var13 = var16[var11 + 1];
                        if (param3) {
                          break L34;
                        } else {
                          L35: {
                            if (-1 == param7) {
                              if (ia.field_a[var11] != io.field_c.field_ec) {
                                stackOut_74_0 = 0;
                                stackIn_75_0 = stackOut_74_0;
                                break L35;
                              } else {
                                stackOut_73_0 = 1;
                                stackIn_75_0 = stackOut_73_0;
                                break L35;
                              }
                            } else {
                              if (var11 != (io.field_c.field_Eb[param7] & 255)) {
                                stackOut_71_0 = 0;
                                stackIn_75_0 = stackOut_71_0;
                                break L35;
                              } else {
                                stackOut_70_0 = 1;
                                stackIn_75_0 = stackOut_70_0;
                                break L35;
                              }
                            }
                          }
                          var12 = stackIn_75_0;
                          if (var15 == 0) {
                            break L33;
                          } else {
                            break L34;
                          }
                        }
                      }
                      L36: {
                        if (!var13.field_U) {
                          if (var9 != 0) {
                            if (var13.field_rb) {
                              stackOut_82_0 = 1;
                              stackIn_84_0 = stackOut_82_0;
                              break L36;
                            } else {
                              stackOut_81_0 = 0;
                              stackIn_84_0 = stackOut_81_0;
                              break L36;
                            }
                          } else {
                            stackOut_79_0 = 0;
                            stackIn_84_0 = stackOut_79_0;
                            break L36;
                          }
                        } else {
                          stackOut_77_0 = 1;
                          stackIn_84_0 = stackOut_77_0;
                          break L36;
                        }
                      }
                      var12 = stackIn_84_0;
                      break L33;
                    }
                    if (var15 == 0) {
                      break L30;
                    } else {
                      break L31;
                    }
                  }
                  var12 = 1;
                  break L30;
                }
                L37: {
                  if (var12 == 0) {
                    break L37;
                  } else {
                    var10 = 1;
                    no.a(param0, param1, (byte) 124, param3, param4, param5, param6, 1 + param7);
                    break L37;
                  }
                }
                if (pb.field_f) {
                  return;
                } else {
                  var11++;
                  continue L23;
                }
              }
            }
          }
          stackOut_104_0 = param2;
          stackOut_104_1 = 67;
          stackIn_105_0 = stackOut_104_0;
          stackIn_105_1 = stackOut_104_1;
          break L0;
        }
        L38: {
          if (stackIn_105_0 > stackIn_105_1) {
            break L38;
          } else {
            field_g = null;
            break L38;
          }
        }
    }

    public static void f(int param0) {
        field_g = null;
        field_n = null;
        field_j = null;
        field_p = null;
        if (param0 != 0) {
            field_n = null;
        }
    }

    final static void a(boolean param0, byte param1) {
        ui.field_i.a(param0, 0);
        if (param1 != 34) {
            field_n = null;
        }
        oj var2 = td.field_b;
        if (var2 != null) {
            var2.a(ui.field_i.field_gb, ui.field_i.field_tb, 104);
        }
    }

    final void a(int param0, int param1, String param2, jl param3, int param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        mn var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        mn stackIn_31_0 = null;
        mn stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        mn stackIn_32_0 = null;
        mn stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        mn stackIn_33_0 = null;
        mn stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        jl stackIn_36_0 = null;
        jl stackIn_37_0 = null;
        jl stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        mn stackOut_30_0 = null;
        mn stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        mn stackOut_32_0 = null;
        mn stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        mn stackOut_31_0 = null;
        mn stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        jl stackOut_35_0 = null;
        jl stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        jl stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        L0: {
          var15 = Pixelate.field_H ? 1 : 0;
          if (param1 != (param7 ^ -1)) {
            break L0;
          } else {
            param7 = param3.field_M;
            break L0;
          }
        }
        if (param2 != null) {
          L1: {
            if (param3 != ((no) this).field_l) {
              break L1;
            } else {
              if (((no) this).field_o) {
                break L1;
              } else {
                if (param5 != ((no) this).field_i) {
                  break L1;
                } else {
                  if ((param6 ^ -1) != (((no) this).field_f ^ -1)) {
                    break L1;
                  } else {
                    if (((no) this).field_e != param7) {
                      break L1;
                    } else {
                      if (((no) this).field_q != param4) {
                        break L1;
                      } else {
                        if ((((no) this).field_k ^ -1) != (param0 ^ -1)) {
                          break L1;
                        } else {
                          if (null == ((no) this).field_m) {
                            break L1;
                          } else {
                            if (((no) this).field_m.equals((Object) (Object) param2)) {
                              return;
                            } else {
                              break L1;
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
          L2: {
            ((no) this).field_q = param4;
            ((no) this).field_f = param6;
            ((no) this).field_l = param3;
            ((no) this).field_i = param5;
            ((no) this).field_e = param7;
            ((no) this).field_k = param0;
            ((no) this).field_o = false;
            ((no) this).field_m = param2;
            var16 = new String[1 + param3.b(param2, param0)];
            var17 = var16;
            var10 = Math.max(1, param3.a(param2, new int[1], var17));
            if (-4 != (((no) this).field_f ^ -1)) {
              break L2;
            } else {
              if (-2 != (var10 ^ -1)) {
                break L2;
              } else {
                ((no) this).field_f = 1;
                break L2;
              }
            }
          }
          L3: {
            L4: {
              if (-1 == (((no) this).field_f ^ -1)) {
                break L4;
              } else {
                L5: {
                  if (1 != ((no) this).field_f) {
                    break L5;
                  } else {
                    var11 = (((no) this).field_q + -(var10 * ((no) this).field_e) >> 188935169) + param3.field_w;
                    if (var15 == 0) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if ((((no) this).field_f ^ -1) == -3) {
                    break L6;
                  } else {
                    L7: {
                      var12 = (((no) this).field_q - var10 * ((no) this).field_e) / (1 + var10);
                      if (0 <= var12) {
                        break L7;
                      } else {
                        var12 = 0;
                        break L7;
                      }
                    }
                    var11 = param3.field_w + var12;
                    ((no) this).field_e = ((no) this).field_e + var12;
                    if (var15 == 0) {
                      break L3;
                    } else {
                      break L6;
                    }
                  }
                }
                var11 = -(((no) this).field_e * var10) + ((no) this).field_q - param3.field_z;
                if (var15 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            var11 = param3.field_w;
            break L3;
          }
          ((no) this).field_b = new mn[var10];
          var12 = 0;
          L8: while (true) {
            L9: {
              if (var10 <= var12) {
                break L9;
              } else {
                var13 = var16[var12];
                if (var15 != 0) {
                  break L9;
                } else {
                  L10: {
                    stackOut_30_0 = null;
                    stackOut_30_1 = null;
                    stackOut_30_2 = var11 - param3.field_w;
                    stackOut_30_3 = var11 - -param3.field_z;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_32_1 = stackOut_30_1;
                    stackIn_32_2 = stackOut_30_2;
                    stackIn_32_3 = stackOut_30_3;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    stackIn_31_2 = stackOut_30_2;
                    stackIn_31_3 = stackOut_30_3;
                    if (var13 != null) {
                      stackOut_32_0 = null;
                      stackOut_32_1 = null;
                      stackOut_32_2 = stackIn_32_2;
                      stackOut_32_3 = stackIn_32_3;
                      stackOut_32_4 = var13.length();
                      stackIn_33_0 = stackOut_32_0;
                      stackIn_33_1 = stackOut_32_1;
                      stackIn_33_2 = stackOut_32_2;
                      stackIn_33_3 = stackOut_32_3;
                      stackIn_33_4 = stackOut_32_4;
                      break L10;
                    } else {
                      stackOut_31_0 = null;
                      stackOut_31_1 = null;
                      stackOut_31_2 = stackIn_31_2;
                      stackOut_31_3 = stackIn_31_3;
                      stackOut_31_4 = 0;
                      stackIn_33_0 = stackOut_31_0;
                      stackIn_33_1 = stackOut_31_1;
                      stackIn_33_2 = stackOut_31_2;
                      stackIn_33_3 = stackOut_31_3;
                      stackIn_33_4 = stackOut_31_4;
                      break L10;
                    }
                  }
                  L11: {
                    var14 = new mn(stackIn_33_2, stackIn_33_3, stackIn_33_4);
                    var14.field_g[0] = 0;
                    if (var13 != null) {
                      L12: {
                        var14.field_g[var13.length()] = param3.c(var13);
                        stackOut_35_0 = (jl) param3;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_36_0 = stackOut_35_0;
                        if (param5 != 3) {
                          stackOut_37_0 = (jl) (Object) stackIn_37_0;
                          stackOut_37_1 = 0;
                          stackIn_38_0 = stackOut_37_0;
                          stackIn_38_1 = stackOut_37_1;
                          break L12;
                        } else {
                          stackOut_36_0 = (jl) (Object) stackIn_36_0;
                          stackOut_36_1 = ((no) this).a(var13, param0, param3.c(var13), 60);
                          stackIn_38_0 = stackOut_36_0;
                          stackIn_38_1 = stackOut_36_1;
                          break L12;
                        }
                      }
                      an.a(stackIn_38_0, stackIn_38_1, (byte) -92, var14, var13);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  var11 = var11 + param7;
                  ((no) this).field_b[var12] = var14;
                  var12++;
                  if (var15 == 0) {
                    continue L8;
                  } else {
                    break L9;
                  }
                }
              }
            }
            return;
          }
        } else {
          ((no) this).field_b = null;
          return;
        }
    }

    final void a(String param0, boolean param1, int param2, jl param3, int param4) {
        if (!(param0 != null)) {
            ((no) this).field_b = null;
            return;
        }
        if (param1) {
            field_g = null;
        }
        if (((no) this).field_l == param3) {
            if (((no) this).field_o) {
                if (1 == ((no) this).field_i) {
                    if (null != ((no) this).field_m) {
                        if (!(!((no) this).field_m.equals((Object) (Object) param0))) {
                            return;
                        }
                    }
                }
            }
        }
        ((no) this).field_i = 1;
        ((no) this).field_o = true;
        ((no) this).field_l = param3;
        mn var8 = this.a(param0, 0, param3, param2);
        int var7 = param3.c(param0);
        var8.field_g[0] = param4 - (var7 >> -409475647);
        var8.field_g[param0.length()] = param4 + (var7 >> 1100722081);
        an.a(param3, 0, (byte) -92, var8, param0);
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        ak var6 = null;
        ak var7 = null;
        ak var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int[] var13_array = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        bb var17 = null;
        Object var18 = null;
        uj var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        int[] var20 = null;
        ak var22 = null;
        int[] var23 = null;
        String var24 = null;
        int[] var26 = null;
        ak var27 = null;
        int[] var28 = null;
        String var29 = null;
        String var30 = null;
        int[] var31 = null;
        ak stackIn_16_0 = null;
        ak stackIn_17_0 = null;
        ak stackIn_18_0 = null;
        ak stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_55_0 = 0;
        boolean stackIn_98_0 = false;
        int stackIn_117_0 = 0;
        boolean stackIn_127_0 = false;
        boolean stackIn_144_0 = false;
        int stackIn_160_0 = 0;
        ak stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        ak stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        ak stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        ak stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        ak stackIn_180_0 = null;
        int stackIn_180_1 = 0;
        int stackIn_180_2 = 0;
        ak stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        ak stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        ak stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        ak stackIn_184_0 = null;
        int stackIn_184_1 = 0;
        ak stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        int stackIn_185_2 = 0;
        ak stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        ak stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        ak stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        ak stackIn_189_0 = null;
        int stackIn_189_1 = 0;
        ak stackIn_190_0 = null;
        int stackIn_190_1 = 0;
        int stackIn_190_2 = 0;
        ak stackOut_15_0 = null;
        ak stackOut_16_0 = null;
        ak stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ak stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_54_0 = 0;
        boolean stackOut_143_0 = false;
        boolean stackOut_97_0 = false;
        int stackOut_116_0 = 0;
        boolean stackOut_126_0 = false;
        int stackOut_159_0 = 0;
        ak stackOut_175_0 = null;
        int stackOut_175_1 = 0;
        ak stackOut_176_0 = null;
        int stackOut_176_1 = 0;
        ak stackOut_177_0 = null;
        int stackOut_177_1 = 0;
        ak stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        int stackOut_178_2 = 0;
        ak stackOut_179_0 = null;
        int stackOut_179_1 = 0;
        int stackOut_179_2 = 0;
        ak stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        ak stackOut_181_0 = null;
        int stackOut_181_1 = 0;
        ak stackOut_182_0 = null;
        int stackOut_182_1 = 0;
        ak stackOut_183_0 = null;
        int stackOut_183_1 = 0;
        int stackOut_183_2 = 0;
        ak stackOut_184_0 = null;
        int stackOut_184_1 = 0;
        int stackOut_184_2 = 0;
        ak stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        ak stackOut_186_0 = null;
        int stackOut_186_1 = 0;
        ak stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        ak stackOut_188_0 = null;
        int stackOut_188_1 = 0;
        int stackOut_188_2 = 0;
        ak stackOut_189_0 = null;
        int stackOut_189_1 = 0;
        int stackOut_189_2 = 0;
        var18 = null;
        var19 = Pixelate.field_H ? 1 : 0;
        cm.b(h.field_W, 4740);
        if (param1 == 1) {
          L0: {
            if (io.field_c != null) {
              L1: {
                L2: {
                  gk.field_kb.field_rb = true;
                  wm.field_d.field_nb = 0;
                  var22 = wm.field_d;
                  var27 = var22;
                  var27.field_K = 0;
                  var6 = ep.field_a;
                  ep.field_a.field_nb = 0;
                  var6.field_K = 0;
                  var7 = nk.field_e;
                  nk.field_e.field_nb = 0;
                  var7.field_K = 0;
                  if (pl.m(param1 + 98)) {
                    break L2;
                  } else {
                    var9_ref_String = io.field_c.field_pc;
                    vp.field_Qb.field_cb = sd.a(fk.field_q, param1 ^ 62, new String[1]).toUpperCase();
                    nk.field_e.a(ai.field_A.field_nb - 40, 40, 0, param1 + 255, ai.field_A.field_K);
                    nk.field_e.field_cb = sd.a(qh.field_a, param1 + 23, new String[1]);
                    var8 = nk.field_e;
                    if (var19 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  vp.field_Qb.field_cb = hk.field_g.toUpperCase();
                  var9 = (ai.field_A.field_K - -2) / 2;
                  wm.field_d.a(ai.field_A.field_nb - 40, 40, 0, 256, var9 - 2);
                  if (io.field_c.field_ec > io.field_c.field_mc) {
                    break L3;
                  } else {
                    wm.field_d.field_cb = fo.field_m.toUpperCase();
                    wm.field_d.field_rb = false;
                    break L3;
                  }
                }
                wm.field_d.field_cb = ca.field_k.toUpperCase();
                wm.field_d.field_rb = true;
                L4: {
                  wm.field_d.field_zb = bf.field_k.field_zb;
                  if ((ka.field_X ^ -1) >= -1) {
                    break L4;
                  } else {
                    L5: {
                      if (ka.field_X != 1) {
                        break L5;
                      } else {
                        var10_ref_String = sm.field_k;
                        break L5;
                      }
                    }
                    var10_ref_String = sd.a(d.field_a, 99, new String[1]);
                    wm.field_d.field_cb = wm.field_d.field_cb + "<br>" + var10_ref_String;
                    if (0 != (16 & rb.field_o)) {
                      break L4;
                    } else {
                      if (bm.field_o) {
                        break L4;
                      } else {
                        wm.field_d.field_zb = bf.field_k.field_ab;
                        break L4;
                      }
                    }
                  }
                }
                L6: {
                  L7: {
                    ep.field_a.a(-40 + ai.field_A.field_nb, 40, var9, 256, -var9 + ai.field_A.field_K);
                    ep.field_a.field_cb = kb.field_J.toUpperCase();
                    var8 = ep.field_a;
                    stackOut_15_0 = ep.field_a;
                    stackIn_18_0 = stackOut_15_0;
                    stackIn_16_0 = stackOut_15_0;
                    if (!param0) {
                      break L7;
                    } else {
                      stackOut_16_0 = (ak) (Object) stackIn_16_0;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_17_0 = stackOut_16_0;
                      if (-1L != (bo.field_e ^ -1L)) {
                        break L7;
                      } else {
                        stackOut_17_0 = (ak) (Object) stackIn_17_0;
                        stackOut_17_1 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        break L6;
                      }
                    }
                  }
                  stackOut_18_0 = (ak) (Object) stackIn_18_0;
                  stackOut_18_1 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L6;
                }
                L8: {
                  stackIn_19_0.field_rb = stackIn_19_1 != 0;
                  var10 = 2;
                  if (h.field_Z == null) {
                    break L8;
                  } else {
                    L9: {
                      if (kf.field_o != null) {
                        break L9;
                      } else {
                        kf.field_o = new byte[fj.field_b];
                        lc.field_t = new boolean[fj.field_b];
                        break L9;
                      }
                    }
                    var11_int = 0;
                    L10: while (true) {
                      L11: {
                        L12: {
                          if (fj.field_b <= var11_int) {
                            break L12;
                          } else {
                            lc.field_t[var11_int] = false;
                            var11_int++;
                            if (var19 != 0) {
                              break L11;
                            } else {
                              if (var19 == 0) {
                                continue L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var10 = 0;
                        break L11;
                      }
                      L13: {
                        L14: {
                          if ((var10 ^ -1) <= -3) {
                            break L14;
                          } else {
                            var11_int = 0;
                            stackOut_29_0 = 0;
                            stackIn_55_0 = stackOut_29_0;
                            stackIn_30_0 = stackOut_29_0;
                            if (var19 != 0) {
                              break L13;
                            } else {
                              var12 = stackIn_30_0;
                              L15: while (true) {
                                L16: {
                                  if (var12 >= h.field_Z.length) {
                                    break L16;
                                  } else {
                                    var31 = h.field_Z[var12];
                                    var28 = var31;
                                    var26 = var28;
                                    var23 = var26;
                                    var20 = var23;
                                    var13_array = var20;
                                    var14_int = 0;
                                    L17: while (true) {
                                      L18: {
                                        L19: {
                                          if (var14_int >= var31.length) {
                                            break L19;
                                          } else {
                                            L20: {
                                              var15 = var31[var14_int];
                                              var16 = var20[var14_int + 1];
                                              if ((var15 ^ -1) == 0) {
                                                L21: {
                                                  if (var10 == 0) {
                                                    stackOut_39_0 = io.field_c.field_ec;
                                                    stackIn_40_0 = stackOut_39_0;
                                                    break L21;
                                                  } else {
                                                    stackOut_38_0 = io.field_c.field_mc;
                                                    stackIn_40_0 = stackOut_38_0;
                                                    break L21;
                                                  }
                                                }
                                                var17_int = stackIn_40_0;
                                                if (var17_int != var16) {
                                                  break L18;
                                                } else {
                                                  break L20;
                                                }
                                              } else {
                                                if (var16 != (255 & io.field_c.field_Eb[var15])) {
                                                  break L18;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            var14_int += 2;
                                            if (var19 == 0) {
                                              continue L17;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                        var11_int = 1;
                                        var14_int = -1;
                                        var15 = 0;
                                        L22: while (true) {
                                          L23: {
                                            if (var31.length <= var15) {
                                              break L23;
                                            } else {
                                              L24: {
                                                var16 = var31[var15];
                                                if (var16 <= var14_int) {
                                                  break L24;
                                                } else {
                                                  var14_int = var16;
                                                  break L24;
                                                }
                                              }
                                              var15 += 2;
                                              if (var19 == 0) {
                                                continue L22;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          lc.field_t[var14_int] = true;
                                          break L18;
                                        }
                                      }
                                      var12++;
                                      if (var19 == 0) {
                                        continue L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                                L25: {
                                  if (var11_int == 0) {
                                    break L25;
                                  } else {
                                    if (var19 == 0) {
                                      break L14;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                                var10++;
                                break L14;
                              }
                            }
                          }
                        }
                        stackOut_54_0 = wo.field_h ^ -1;
                        stackIn_55_0 = stackOut_54_0;
                        break L13;
                      }
                      if (stackIn_55_0 > -3) {
                        break L8;
                      } else {
                        if (bc.field_m[12]) {
                          var10 = 2;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                L26: {
                  L27: {
                    L28: {
                      if (2 > var10) {
                        ep.field_a.field_rb = false;
                        if (!ep.field_a.field_R) {
                          break L1;
                        } else {
                          var11 = null;
                          var12 = 0;
                          var13_int = 0;
                          L29: while (true) {
                            if (var13_int >= fj.field_b) {
                              break L27;
                            } else {
                              stackOut_143_0 = lc.field_t[var13_int];
                              stackIn_160_0 = stackOut_143_0 ? 1 : 0;
                              stackIn_144_0 = stackOut_143_0;
                              if (var19 != 0) {
                                break L26;
                              } else {
                                L30: {
                                  if (stackIn_144_0) {
                                    L31: {
                                      var29 = "<col=A00000>" + jk.field_e[var13_int] + "</col>";
                                      if (var11 == null) {
                                        break L31;
                                      } else {
                                        var11 = (Object) (Object) (var11 + ", " + var29);
                                        var12 = 1;
                                        if (var19 == 0) {
                                          break L30;
                                        } else {
                                          break L31;
                                        }
                                      }
                                    }
                                    var11 = (Object) (Object) var29;
                                    break L30;
                                  } else {
                                    break L30;
                                  }
                                }
                                var13_int++;
                                if (var19 == 0) {
                                  continue L29;
                                } else {
                                  break L28;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L32: {
                          if (null != jm.field_r) {
                            break L32;
                          } else {
                            if (w.field_z != null) {
                              break L32;
                            } else {
                              if (null != pa.field_a) {
                                break L32;
                              } else {
                                if (oo.field_e != null) {
                                  break L32;
                                } else {
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                        var11_int = 0;
                        var12 = 0;
                        var13_int = 0;
                        var14_int = 0;
                        var15 = 0;
                        var16 = 0;
                        L33: while (true) {
                          L34: {
                            L35: {
                              if (var16 >= fj.field_b) {
                                break L35;
                              } else {
                                var17_int = io.field_c.field_Eb[var16] & 255;
                                if (var19 != 0) {
                                  break L34;
                                } else {
                                  L36: {
                                    if (jm.field_r == null) {
                                      break L36;
                                    } else {
                                      if (jm.field_r[var16] == null) {
                                        break L36;
                                      } else {
                                        if (!jm.field_r[var16][var17_int]) {
                                          break L36;
                                        } else {
                                          var11_int = 1;
                                          break L36;
                                        }
                                      }
                                    }
                                  }
                                  L37: {
                                    if (w.field_z == null) {
                                      break L37;
                                    } else {
                                      if (null != w.field_z[var16]) {
                                        L38: {
                                          var18_int = w.field_z[var16][var17_int];
                                          if (var18_int > var13_int) {
                                            var13_int = var18_int;
                                            break L38;
                                          } else {
                                            break L38;
                                          }
                                        }
                                        if (var18_int == 0) {
                                          break L37;
                                        } else {
                                          if (fe.field_a) {
                                            break L37;
                                          } else {
                                            var11_int = 1;
                                            break L37;
                                          }
                                        }
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                  L39: {
                                    if (null == pa.field_a) {
                                      break L39;
                                    } else {
                                      if (null != pa.field_a[var16]) {
                                        L40: {
                                          var18_int = pa.field_a[var16][var17_int];
                                          if (var14_int >= var18_int) {
                                            break L40;
                                          } else {
                                            var14_int = var18_int;
                                            break L40;
                                          }
                                        }
                                        if (-1 == (var18_int ^ -1)) {
                                          break L39;
                                        } else {
                                          if (!fe.field_a) {
                                            var11_int = 1;
                                            break L39;
                                          } else {
                                            break L39;
                                          }
                                        }
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                  L41: {
                                    if (oo.field_e == null) {
                                      break L41;
                                    } else {
                                      if (null != oo.field_e[var16]) {
                                        var15 = var15 | oo.field_e[var16][var17_int];
                                        break L41;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                  var16++;
                                  if (var19 == 0) {
                                    continue L33;
                                  } else {
                                    break L35;
                                  }
                                }
                              }
                            }
                            var16 = 0;
                            break L34;
                          }
                          L42: {
                            L43: {
                              var17 = ae.field_c.field_Fb.field_L;
                              var18_ref = (uj) (Object) var17.c(1504642273);
                              if (var18_ref == null) {
                                break L43;
                              } else {
                                stackOut_97_0 = var18_ref.b((byte) -98);
                                stackIn_117_0 = stackOut_97_0 ? 1 : 0;
                                stackIn_98_0 = stackOut_97_0;
                                if (var19 != 0) {
                                  break L42;
                                } else {
                                  L44: {
                                    if (stackIn_98_0) {
                                      break L44;
                                    } else {
                                      L45: {
                                        if (var11_int == 0) {
                                          break L45;
                                        } else {
                                          if (!var18_ref.field_Xb) {
                                            var16 = 1;
                                            if (var19 == 0) {
                                              break L43;
                                            } else {
                                              break L45;
                                            }
                                          } else {
                                            break L45;
                                          }
                                        }
                                      }
                                      L46: {
                                        if (var18_ref.field_Rb < var13_int) {
                                          var16 = 1;
                                          break L46;
                                        } else {
                                          break L46;
                                        }
                                      }
                                      L47: {
                                        if (var18_ref.field_Yb < var14_int) {
                                          var16 = 1;
                                          break L47;
                                        } else {
                                          break L47;
                                        }
                                      }
                                      L48: {
                                        if (((var18_ref.field_Ib ^ -1) & var15 ^ -1) < -1) {
                                          var16 = 1;
                                          break L48;
                                        } else {
                                          break L48;
                                        }
                                      }
                                      if (var12 != 0) {
                                        var16 = 1;
                                        break L44;
                                      } else {
                                        break L44;
                                      }
                                    }
                                  }
                                  var18_ref = (uj) (Object) var17.f(1504642273);
                                  break L43;
                                }
                              }
                            }
                            stackOut_116_0 = -3;
                            stackIn_117_0 = stackOut_116_0;
                            break L42;
                          }
                          L49: {
                            if (stackIn_117_0 < (wo.field_h ^ -1)) {
                              break L49;
                            } else {
                              if (bc.field_m[12]) {
                                var16 = 0;
                                break L49;
                              } else {
                                break L49;
                              }
                            }
                          }
                          L50: {
                            if (var16 != 0) {
                              break L50;
                            } else {
                              if (var19 == 0) {
                                break L1;
                              } else {
                                ep.field_a.field_rb = false;
                                if (!ep.field_a.field_R) {
                                  break L1;
                                } else {
                                  var11 = null;
                                  var12 = 0;
                                  var13_int = 0;
                                  L51: while (true) {
                                    if (var13_int >= fj.field_b) {
                                      break L27;
                                    } else {
                                      stackOut_126_0 = lc.field_t[var13_int];
                                      stackIn_160_0 = stackOut_126_0 ? 1 : 0;
                                      stackIn_127_0 = stackOut_126_0;
                                      if (var19 != 0) {
                                        break L26;
                                      } else {
                                        L52: {
                                          if (stackIn_127_0) {
                                            L53: {
                                              var24 = "<col=A00000>" + jk.field_e[var13_int] + "</col>";
                                              if (var11 == null) {
                                                break L53;
                                              } else {
                                                var11 = (Object) (Object) (var11 + ", " + var24);
                                                var12 = 1;
                                                if (var19 == 0) {
                                                  break L52;
                                                } else {
                                                  break L53;
                                                }
                                              }
                                            }
                                            var11 = (Object) (Object) var24;
                                            break L52;
                                          } else {
                                            break L52;
                                          }
                                        }
                                        var13_int++;
                                        if (var19 == 0) {
                                          continue L51;
                                        } else {
                                          break L50;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L54: {
                            ep.field_a.field_rb = false;
                            if (!ep.field_a.field_R) {
                              break L54;
                            } else {
                              L55: {
                                if (0 != nd.field_b.field_g.field_Jb) {
                                  break L55;
                                } else {
                                  up.field_o = pc.field_u;
                                  if (var19 == 0) {
                                    break L54;
                                  } else {
                                    break L55;
                                  }
                                }
                              }
                              up.field_o = sd.a(li.field_b, 107, new String[1]);
                              break L54;
                            }
                          }
                          if (var19 == 0) {
                            break L1;
                          } else {
                            break L28;
                          }
                        }
                      }
                    }
                    ep.field_a.field_rb = false;
                    if (!ep.field_a.field_R) {
                      break L1;
                    } else {
                      var11 = null;
                      var12 = 0;
                      var13_int = 0;
                      L56: while (true) {
                        if (var13_int >= fj.field_b) {
                          break L27;
                        } else {
                          L57: {
                            if (lc.field_t[var13_int]) {
                              L58: {
                                var30 = "<col=A00000>" + jk.field_e[var13_int] + "</col>";
                                if (var11 == null) {
                                  break L58;
                                } else {
                                  var11 = (Object) (Object) (var11 + ", " + var30);
                                  var12 = 1;
                                  if (var19 == 0) {
                                    break L57;
                                  } else {
                                    break L58;
                                  }
                                }
                              }
                              var11 = (Object) (Object) var30;
                              break L57;
                            } else {
                              break L57;
                            }
                          }
                          var13_int++;
                          if (var19 == 0) {
                            continue L56;
                          } else {
                            break L27;
                          }
                        }
                      }
                    }
                  }
                  stackOut_159_0 = 0;
                  stackIn_160_0 = stackOut_159_0;
                  break L26;
                }
                L59: {
                  if (stackIn_160_0 == var10) {
                    L60: {
                      var13 = ji.field_a;
                      if (var12 != 0) {
                        break L60;
                      } else {
                        var14 = sd.a(sm.field_n, 80, new String[1]);
                        break L60;
                      }
                    }
                    var14 = cf.field_x + var11;
                    break L59;
                  } else {
                    L61: {
                      var13 = aq.field_c;
                      if (var12 != 0) {
                        break L61;
                      } else {
                        var14 = sd.a(ff.field_b, 31, new String[1]);
                        break L61;
                      }
                    }
                    var14 = fg.field_b + var11;
                    break L59;
                  }
                }
                up.field_o = "<col=A00000>" + var13 + "<br>" + var14;
                break L1;
              }
              L62: {
                if (0L != bo.field_e) {
                  L63: {
                    var9 = (int)(-hm.a(64) + bo.field_e);
                    var9 = (var9 + 999) / 1000;
                    if ((var9 ^ -1) > -2) {
                      var9 = 1;
                      break L63;
                    } else {
                      break L63;
                    }
                  }
                  var8.field_cb = sd.a(ao.field_i, 100, new String[1]);
                  break L62;
                } else {
                  break L62;
                }
              }
              qo.field_q.field_cb = sd.a(oe.field_Gb, param1 + 68, new String[2]);
              break L0;
            } else {
              break L0;
            }
          }
          L64: {
            L65: {
              stackOut_175_0 = ff.field_h;
              stackOut_175_1 = -28476;
              stackIn_179_0 = stackOut_175_0;
              stackIn_179_1 = stackOut_175_1;
              stackIn_176_0 = stackOut_175_0;
              stackIn_176_1 = stackOut_175_1;
              if (!param4) {
                break L65;
              } else {
                stackOut_176_0 = (ak) (Object) stackIn_176_0;
                stackOut_176_1 = stackIn_176_1;
                stackIn_179_0 = stackOut_176_0;
                stackIn_179_1 = stackOut_176_1;
                stackIn_177_0 = stackOut_176_0;
                stackIn_177_1 = stackOut_176_1;
                if (param3) {
                  break L65;
                } else {
                  stackOut_177_0 = (ak) (Object) stackIn_177_0;
                  stackOut_177_1 = stackIn_177_1;
                  stackIn_179_0 = stackOut_177_0;
                  stackIn_179_1 = stackOut_177_1;
                  stackIn_178_0 = stackOut_177_0;
                  stackIn_178_1 = stackOut_177_1;
                  if (bm.field_o) {
                    break L65;
                  } else {
                    stackOut_178_0 = (ak) (Object) stackIn_178_0;
                    stackOut_178_1 = stackIn_178_1;
                    stackOut_178_2 = 1;
                    stackIn_180_0 = stackOut_178_0;
                    stackIn_180_1 = stackOut_178_1;
                    stackIn_180_2 = stackOut_178_2;
                    break L64;
                  }
                }
              }
            }
            stackOut_179_0 = (ak) (Object) stackIn_179_0;
            stackOut_179_1 = stackIn_179_1;
            stackOut_179_2 = 0;
            stackIn_180_0 = stackOut_179_0;
            stackIn_180_1 = stackOut_179_1;
            stackIn_180_2 = stackOut_179_2;
            break L64;
          }
          L66: {
            L67: {
              ((ak) (Object) stackIn_180_0).a(stackIn_180_1, stackIn_180_2 != 0);
              stackOut_180_0 = ai.field_A;
              stackOut_180_1 = -28476;
              stackIn_184_0 = stackOut_180_0;
              stackIn_184_1 = stackOut_180_1;
              stackIn_181_0 = stackOut_180_0;
              stackIn_181_1 = stackOut_180_1;
              if (!param4) {
                break L67;
              } else {
                stackOut_181_0 = (ak) (Object) stackIn_181_0;
                stackOut_181_1 = stackIn_181_1;
                stackIn_184_0 = stackOut_181_0;
                stackIn_184_1 = stackOut_181_1;
                stackIn_182_0 = stackOut_181_0;
                stackIn_182_1 = stackOut_181_1;
                if (param3) {
                  break L67;
                } else {
                  stackOut_182_0 = (ak) (Object) stackIn_182_0;
                  stackOut_182_1 = stackIn_182_1;
                  stackIn_184_0 = stackOut_182_0;
                  stackIn_184_1 = stackOut_182_1;
                  stackIn_183_0 = stackOut_182_0;
                  stackIn_183_1 = stackOut_182_1;
                  if (bm.field_o) {
                    break L67;
                  } else {
                    stackOut_183_0 = (ak) (Object) stackIn_183_0;
                    stackOut_183_1 = stackIn_183_1;
                    stackOut_183_2 = 1;
                    stackIn_185_0 = stackOut_183_0;
                    stackIn_185_1 = stackOut_183_1;
                    stackIn_185_2 = stackOut_183_2;
                    break L66;
                  }
                }
              }
            }
            stackOut_184_0 = (ak) (Object) stackIn_184_0;
            stackOut_184_1 = stackIn_184_1;
            stackOut_184_2 = 0;
            stackIn_185_0 = stackOut_184_0;
            stackIn_185_1 = stackOut_184_1;
            stackIn_185_2 = stackOut_184_2;
            break L66;
          }
          L68: {
            L69: {
              ((ak) (Object) stackIn_185_0).a(stackIn_185_1, stackIn_185_2 != 0);
              stackOut_185_0 = ra.field_e;
              stackOut_185_1 = -28476;
              stackIn_189_0 = stackOut_185_0;
              stackIn_189_1 = stackOut_185_1;
              stackIn_186_0 = stackOut_185_0;
              stackIn_186_1 = stackOut_185_1;
              if (!param4) {
                break L69;
              } else {
                stackOut_186_0 = (ak) (Object) stackIn_186_0;
                stackOut_186_1 = stackIn_186_1;
                stackIn_189_0 = stackOut_186_0;
                stackIn_189_1 = stackOut_186_1;
                stackIn_187_0 = stackOut_186_0;
                stackIn_187_1 = stackOut_186_1;
                if (param3) {
                  break L69;
                } else {
                  stackOut_187_0 = (ak) (Object) stackIn_187_0;
                  stackOut_187_1 = stackIn_187_1;
                  stackIn_189_0 = stackOut_187_0;
                  stackIn_189_1 = stackOut_187_1;
                  stackIn_188_0 = stackOut_187_0;
                  stackIn_188_1 = stackOut_187_1;
                  if (!bm.field_o) {
                    break L69;
                  } else {
                    stackOut_188_0 = (ak) (Object) stackIn_188_0;
                    stackOut_188_1 = stackIn_188_1;
                    stackOut_188_2 = 1;
                    stackIn_190_0 = stackOut_188_0;
                    stackIn_190_1 = stackOut_188_1;
                    stackIn_190_2 = stackOut_188_2;
                    break L68;
                  }
                }
              }
            }
            stackOut_189_0 = (ak) (Object) stackIn_189_0;
            stackOut_189_1 = stackIn_189_1;
            stackOut_189_2 = 0;
            stackIn_190_0 = stackOut_189_0;
            stackIn_190_1 = stackOut_189_1;
            stackIn_190_2 = stackOut_189_2;
            break L68;
          }
          L70: {
            ((ak) (Object) stackIn_190_0).a(stackIn_190_1, stackIn_190_2 != 0);
            nd.field_b.field_g.b((byte) -122);
            if (null != io.field_c) {
              L71: {
                if (0 == gk.field_kb.field_P) {
                  break L71;
                } else {
                  qg.a(io.field_c.c((byte) 8), param2, false);
                  break L71;
                }
              }
              L72: {
                if (0 == wm.field_d.field_P) {
                  break L72;
                } else {
                  bm.field_o = true;
                  break L72;
                }
              }
              L73: {
                if (ep.field_a.field_P != 0) {
                  of.field_c = true;
                  break L73;
                } else {
                  break L73;
                }
              }
              L74: {
                if (0 != hb.field_eb.field_P) {
                  bm.field_o = false;
                  break L74;
                } else {
                  break L74;
                }
              }
              be.a(false, io.field_c, param2, -1);
              break L70;
            } else {
              break L70;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void e(int param0) {
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        tf var5 = null;
        tf var6 = null;
        tf var7 = null;
        Object stackIn_21_0 = null;
        Object stackIn_31_0 = null;
        Object stackOut_20_0 = null;
        Object stackOut_30_0 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        t.a(243, 197, 369, 143, 16777215);
        t.d(244, 198, 367, 141, 0);
        if (wg.field_g != null) {
          L0: {
            if (param0 == -19308) {
              break L0;
            } else {
              field_p = null;
              break L0;
            }
          }
          L1: {
            L2: {
              var5 = wg.field_g[ae.field_b];
              if (var5 == null) {
                break L2;
              } else {
                var5.b(245, 199);
                if (var4 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (qe.field_A == null) {
              break L1;
            } else {
              int discarded$3 = qe.field_A.a(mk.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L1;
            }
          }
          L3: {
            if (ui.field_k <= jn.field_q) {
              break L3;
            } else {
              var6 = wg.field_g[jc.field_b];
              if (var6 != null) {
                L4: {
                  var2_int = jn.field_q * (var6.field_A - -60) / ui.field_k;
                  var3 = var2_int + -30;
                  if (!pm.field_e) {
                    break L4;
                  } else {
                    kj.a(var3 * -256 / 30, var6, 245, -123, 199, (var6.field_A - var3) * 256 / 30);
                    if (var4 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                kj.a(256 * (-var3 + var6.field_A) / 30, var6, 245, 89, 199, -256 * var3 / 30);
                break L3;
              } else {
                break L3;
              }
            }
          }
          L5: {
            if (null == qe.field_A) {
              break L5;
            } else {
              var2 = null;
              var3 = 0;
              L6: while (true) {
                L7: {
                  L8: {
                    if (var3 >= wg.field_g.length) {
                      break L8;
                    } else {
                      var7 = wg.field_g[var3];
                      stackOut_20_0 = null;
                      stackIn_31_0 = stackOut_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      if (var4 != 0) {
                        break L7;
                      } else {
                        L9: {
                          if (stackIn_21_0 != (Object) (Object) var7) {
                            L10: {
                              if (var7.field_A != 365) {
                                break L10;
                              } else {
                                if (-140 != (var7.field_B ^ -1)) {
                                  break L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L11: {
                              if (var2 == null) {
                                break L11;
                              } else {
                                var2 = (Object) (Object) (var2 + ", " + var3);
                                if (var4 == 0) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            var2 = (Object) (Object) Integer.toString(var3);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var3++;
                        if (var4 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_30_0 = null;
                  stackIn_31_0 = stackOut_30_0;
                  break L7;
                }
                if (stackIn_31_0 != var2) {
                  int discarded$4 = qe.field_A.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                  break L5;
                } else {
                  break L5;
                }
              }
            }
          }
          return;
        } else {
          if (null == qe.field_A) {
            return;
          } else {
            int discarded$5 = qe.field_A.a(mk.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            return;
          }
        }
    }

    final static long d(int param0) {
        if (param0 != 8) {
            field_j = null;
        }
        return -jc.field_c + hm.a(64);
    }

    final void a(jl param0, int param1, int param2, boolean param3, String param4) {
        if (!(param4 != null)) {
            ((no) this).field_b = null;
            return;
        }
        if (((no) this).field_l == param0) {
            if (((no) this).field_o) {
                if (-3 == (((no) this).field_i ^ -1)) {
                    if (((no) this).field_m != null) {
                        if (((no) this).field_m.equals((Object) (Object) param4)) {
                            return;
                        }
                    }
                }
            }
        }
        ((no) this).field_m = param4;
        ((no) this).field_i = 2;
        ((no) this).field_o = true;
        ((no) this).field_l = param0;
        if (param3) {
            return;
        }
        mn var8 = this.a(param4, 0, param0, param1);
        mn var9 = var8;
        var9.field_g[0] = -param0.c(param4) + param2;
        var9.field_g[param4.length()] = param2;
        an.a(param0, 0, (byte) -92, var9, param4);
    }

    private final mn a(String param0, int param1, jl param2, int param3) {
        mn var6 = new mn(-param2.field_w + param3, param3 - -param2.field_z, param0.length());
        mn var5 = var6;
        if (param1 != 0) {
            return null;
        }
        ((no) this).field_b = new mn[]{var6};
        return var5;
    }

    final void a(String param0, int param1, jl param2, int param3, int param4) {
        int var6 = -72 % ((param4 - -70) / 49);
        if (!(param0 != null)) {
            ((no) this).field_b = null;
            return;
        }
        if (((no) this).field_l == param2) {
            if (((no) this).field_o) {
                if (0 == ((no) this).field_i) {
                    if (((no) this).field_m != null) {
                        if (((no) this).field_m.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        ((no) this).field_o = true;
        ((no) this).field_l = param2;
        ((no) this).field_i = 0;
        ((no) this).field_m = param0;
        mn var7 = this.a(param0, 0, param2, param1);
        var7.field_g[0] = param3;
        var7.field_g[param0.length()] = param2.c(param0) + param3;
        an.a(param2, 0, (byte) -92, var7, param0);
    }

    public no() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Asking for or providing contact information";
        field_g = "Unpacking graphics";
        field_h = 0;
        field_j = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
