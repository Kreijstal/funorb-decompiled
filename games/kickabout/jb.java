/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jb extends gn {
    private int field_k;
    static String field_h;
    private int field_p;
    static String field_f;
    private ko field_j;
    private int field_q;
    private int field_r;
    private int field_e;
    hd[] field_i;
    private ut field_l;
    int field_n;
    static java.security.SecureRandom field_g;
    private String[] field_o;
    private int field_m;

    abstract void a(byte param0, int param1, int param2);

    final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_16_0 = 0;
        hd stackIn_17_0 = null;
        hd stackIn_18_0 = null;
        hd stackIn_19_0 = null;
        hd stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_40_0 = 0;
        hd stackIn_41_0 = null;
        hd stackIn_42_0 = null;
        hd stackIn_43_0 = null;
        hd stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_70_0 = 0;
        hd stackIn_71_0 = null;
        hd stackIn_72_0 = null;
        hd stackIn_73_0 = null;
        hd stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_98_0 = 0;
        hd stackIn_99_0 = null;
        hd stackIn_100_0 = null;
        hd stackIn_101_0 = null;
        hd stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_125_0 = 0;
        hd stackIn_126_0 = null;
        hd stackIn_127_0 = null;
        hd stackIn_128_0 = null;
        hd stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        int stackIn_148_0 = 0;
        hd stackIn_149_0 = null;
        hd stackIn_150_0 = null;
        hd stackIn_151_0 = null;
        hd stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        int stackOut_147_0 = 0;
        int stackOut_146_0 = 0;
        hd stackOut_148_0 = null;
        hd stackOut_149_0 = null;
        hd stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        hd stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        int stackOut_124_0 = 0;
        int stackOut_123_0 = 0;
        hd stackOut_125_0 = null;
        hd stackOut_126_0 = null;
        hd stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        hd stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_96_0 = 0;
        hd stackOut_98_0 = null;
        hd stackOut_99_0 = null;
        hd stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        hd stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        hd stackOut_70_0 = null;
        hd stackOut_71_0 = null;
        hd stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        hd stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        hd stackOut_40_0 = null;
        hd stackOut_41_0 = null;
        hd stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        hd stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        hd stackOut_16_0 = null;
        hd stackOut_17_0 = null;
        hd stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        hd stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        var5 = Kickabout.field_G;
        if (param0 == -16536) {
          ((jb) this).a(3, param1);
          ((jb) this).field_j.a(param0 ^ 4642, this.a(true, us.field_j, wt.field_x), this.a(true, kf.field_Eb, dn.field_yb));
          if (((jb) this).field_n == 0) {
            if (0 == ((jb) this).field_m) {
              L0: {
                wh discarded$14 = sp.c(((jb) this).a(false), -104);
                if (((jb) this).field_n != 0) {
                  break L0;
                } else {
                  L1: {
                    int fieldTemp$15 = ((jb) this).field_m + 1;
                    ((jb) this).field_m = ((jb) this).field_m + 1;
                    if (fieldTemp$15 >= kh.field_q.length + -1) {
                      ((jb) this).field_n = 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  ((jb) this).field_q = kh.field_q[((jb) this).field_m];
                  if (var5 != 0) {
                    break L0;
                  } else {
                    return;
                  }
                }
              }
              if (((jb) this).field_n != 1) {
                if (2 != ((jb) this).field_n) {
                  return;
                } else {
                  L2: {
                    ((jb) this).field_j.field_e = -1;
                    if (((jb) this).field_m > 0) {
                      ((jb) this).field_m = ((jb) this).field_m - 2;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((jb) this).field_q = (((jb) this).field_m << 1827437548) / kh.field_q.length;
                  var3 = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (((jb) this).field_i.length <= var3) {
                          break L5;
                        } else {
                          if (var5 != 0) {
                            break L4;
                          } else {
                            L6: {
                              if (var3 != ((jb) this).field_j.field_e) {
                                stackOut_147_0 = 0;
                                stackIn_148_0 = stackOut_147_0;
                                break L6;
                              } else {
                                stackOut_146_0 = 1;
                                stackIn_148_0 = stackOut_146_0;
                                break L6;
                              }
                            }
                            L7: {
                              L8: {
                                var4 = stackIn_148_0;
                                ((jb) this).field_i[var3].b(0, param1);
                                stackOut_148_0 = ((jb) this).field_i[var3];
                                stackIn_151_0 = stackOut_148_0;
                                stackIn_149_0 = stackOut_148_0;
                                if (!((jb) this).field_i[var3].field_lb) {
                                  break L8;
                                } else {
                                  stackOut_149_0 = (hd) (Object) stackIn_149_0;
                                  stackIn_151_0 = stackOut_149_0;
                                  stackIn_150_0 = stackOut_149_0;
                                  if (var4 == 0) {
                                    break L8;
                                  } else {
                                    stackOut_150_0 = (hd) (Object) stackIn_150_0;
                                    stackOut_150_1 = 1;
                                    stackIn_152_0 = stackOut_150_0;
                                    stackIn_152_1 = stackOut_150_1;
                                    break L7;
                                  }
                                }
                              }
                              stackOut_151_0 = (hd) (Object) stackIn_151_0;
                              stackOut_151_1 = 0;
                              stackIn_152_0 = stackOut_151_0;
                              stackIn_152_1 = stackOut_151_1;
                              break L7;
                            }
                            L9: {
                              stackIn_152_0.field_gb = stackIn_152_1 != 0;
                              if (1 != ((jb) this).field_i[var3].field_sb) {
                                break L9;
                              } else {
                                ((jb) this).a(118, var3);
                                ((jb) this).e(param0 ^ -3410);
                                break L9;
                              }
                            }
                            L10: {
                              if (null == ((jb) this).field_o) {
                                break L10;
                              } else {
                                if (null == ((jb) this).field_o[var3]) {
                                  break L10;
                                } else {
                                  if (!((jb) this).field_i[var3].field_gb) {
                                    break L10;
                                  } else {
                                    qd.a((byte) -67, ((jb) this).field_o[var3]);
                                    break L10;
                                  }
                                }
                              }
                            }
                            var3++;
                            if (var5 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      ((jb) this).field_q = 4096;
                      break L4;
                    }
                    return;
                  }
                }
              } else {
                var3 = 0;
                L11: while (true) {
                  L12: {
                    L13: {
                      if (((jb) this).field_i.length <= var3) {
                        break L13;
                      } else {
                        if (var5 != 0) {
                          break L12;
                        } else {
                          L14: {
                            if (var3 != ((jb) this).field_j.field_e) {
                              stackOut_124_0 = 0;
                              stackIn_125_0 = stackOut_124_0;
                              break L14;
                            } else {
                              stackOut_123_0 = 1;
                              stackIn_125_0 = stackOut_123_0;
                              break L14;
                            }
                          }
                          L15: {
                            L16: {
                              var4 = stackIn_125_0;
                              ((jb) this).field_i[var3].b(0, param1);
                              stackOut_125_0 = ((jb) this).field_i[var3];
                              stackIn_128_0 = stackOut_125_0;
                              stackIn_126_0 = stackOut_125_0;
                              if (!((jb) this).field_i[var3].field_lb) {
                                break L16;
                              } else {
                                stackOut_126_0 = (hd) (Object) stackIn_126_0;
                                stackIn_128_0 = stackOut_126_0;
                                stackIn_127_0 = stackOut_126_0;
                                if (var4 == 0) {
                                  break L16;
                                } else {
                                  stackOut_127_0 = (hd) (Object) stackIn_127_0;
                                  stackOut_127_1 = 1;
                                  stackIn_129_0 = stackOut_127_0;
                                  stackIn_129_1 = stackOut_127_1;
                                  break L15;
                                }
                              }
                            }
                            stackOut_128_0 = (hd) (Object) stackIn_128_0;
                            stackOut_128_1 = 0;
                            stackIn_129_0 = stackOut_128_0;
                            stackIn_129_1 = stackOut_128_1;
                            break L15;
                          }
                          L17: {
                            stackIn_129_0.field_gb = stackIn_129_1 != 0;
                            if (1 != ((jb) this).field_i[var3].field_sb) {
                              break L17;
                            } else {
                              ((jb) this).a(118, var3);
                              ((jb) this).e(param0 ^ -3410);
                              break L17;
                            }
                          }
                          L18: {
                            if (null == ((jb) this).field_o) {
                              break L18;
                            } else {
                              if (null == ((jb) this).field_o[var3]) {
                                break L18;
                              } else {
                                if (!((jb) this).field_i[var3].field_gb) {
                                  break L18;
                                } else {
                                  qd.a((byte) -67, ((jb) this).field_o[var3]);
                                  break L18;
                                }
                              }
                            }
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    ((jb) this).field_q = 4096;
                    break L12;
                  }
                  return;
                }
              }
            } else {
              L19: {
                if (((jb) this).field_n != 0) {
                  break L19;
                } else {
                  L20: {
                    int fieldTemp$16 = ((jb) this).field_m + 1;
                    ((jb) this).field_m = ((jb) this).field_m + 1;
                    if (fieldTemp$16 >= kh.field_q.length + -1) {
                      ((jb) this).field_n = 1;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  ((jb) this).field_q = kh.field_q[((jb) this).field_m];
                  if (var5 != 0) {
                    break L19;
                  } else {
                    return;
                  }
                }
              }
              if (((jb) this).field_n != 1) {
                if (2 == ((jb) this).field_n) {
                  L21: {
                    ((jb) this).field_j.field_e = -1;
                    if (((jb) this).field_m > 0) {
                      ((jb) this).field_m = ((jb) this).field_m - 2;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  ((jb) this).field_q = (((jb) this).field_m << 1827437548) / kh.field_q.length;
                  if (var5 != 0) {
                    var3 = 0;
                    L22: while (true) {
                      L23: {
                        L24: {
                          if (((jb) this).field_i.length <= var3) {
                            break L24;
                          } else {
                            if (var5 != 0) {
                              break L23;
                            } else {
                              L25: {
                                if (var3 != ((jb) this).field_j.field_e) {
                                  stackOut_97_0 = 0;
                                  stackIn_98_0 = stackOut_97_0;
                                  break L25;
                                } else {
                                  stackOut_96_0 = 1;
                                  stackIn_98_0 = stackOut_96_0;
                                  break L25;
                                }
                              }
                              L26: {
                                L27: {
                                  var4 = stackIn_98_0;
                                  ((jb) this).field_i[var3].b(0, param1);
                                  stackOut_98_0 = ((jb) this).field_i[var3];
                                  stackIn_101_0 = stackOut_98_0;
                                  stackIn_99_0 = stackOut_98_0;
                                  if (!((jb) this).field_i[var3].field_lb) {
                                    break L27;
                                  } else {
                                    stackOut_99_0 = (hd) (Object) stackIn_99_0;
                                    stackIn_101_0 = stackOut_99_0;
                                    stackIn_100_0 = stackOut_99_0;
                                    if (var4 == 0) {
                                      break L27;
                                    } else {
                                      stackOut_100_0 = (hd) (Object) stackIn_100_0;
                                      stackOut_100_1 = 1;
                                      stackIn_102_0 = stackOut_100_0;
                                      stackIn_102_1 = stackOut_100_1;
                                      break L26;
                                    }
                                  }
                                }
                                stackOut_101_0 = (hd) (Object) stackIn_101_0;
                                stackOut_101_1 = 0;
                                stackIn_102_0 = stackOut_101_0;
                                stackIn_102_1 = stackOut_101_1;
                                break L26;
                              }
                              L28: {
                                stackIn_102_0.field_gb = stackIn_102_1 != 0;
                                if (1 != ((jb) this).field_i[var3].field_sb) {
                                  break L28;
                                } else {
                                  ((jb) this).a(118, var3);
                                  ((jb) this).e(param0 ^ -3410);
                                  break L28;
                                }
                              }
                              L29: {
                                if (null == ((jb) this).field_o) {
                                  break L29;
                                } else {
                                  if (null == ((jb) this).field_o[var3]) {
                                    break L29;
                                  } else {
                                    if (!((jb) this).field_i[var3].field_gb) {
                                      break L29;
                                    } else {
                                      qd.a((byte) -67, ((jb) this).field_o[var3]);
                                      break L29;
                                    }
                                  }
                                }
                              }
                              var3++;
                              if (var5 == 0) {
                                continue L22;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                        ((jb) this).field_q = 4096;
                        break L23;
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                var3 = 0;
                L30: while (true) {
                  L31: {
                    L32: {
                      if (((jb) this).field_i.length <= var3) {
                        break L32;
                      } else {
                        if (var5 != 0) {
                          break L31;
                        } else {
                          L33: {
                            if (var3 != ((jb) this).field_j.field_e) {
                              stackOut_69_0 = 0;
                              stackIn_70_0 = stackOut_69_0;
                              break L33;
                            } else {
                              stackOut_68_0 = 1;
                              stackIn_70_0 = stackOut_68_0;
                              break L33;
                            }
                          }
                          L34: {
                            L35: {
                              var4 = stackIn_70_0;
                              ((jb) this).field_i[var3].b(0, param1);
                              stackOut_70_0 = ((jb) this).field_i[var3];
                              stackIn_73_0 = stackOut_70_0;
                              stackIn_71_0 = stackOut_70_0;
                              if (!((jb) this).field_i[var3].field_lb) {
                                break L35;
                              } else {
                                stackOut_71_0 = (hd) (Object) stackIn_71_0;
                                stackIn_73_0 = stackOut_71_0;
                                stackIn_72_0 = stackOut_71_0;
                                if (var4 == 0) {
                                  break L35;
                                } else {
                                  stackOut_72_0 = (hd) (Object) stackIn_72_0;
                                  stackOut_72_1 = 1;
                                  stackIn_74_0 = stackOut_72_0;
                                  stackIn_74_1 = stackOut_72_1;
                                  break L34;
                                }
                              }
                            }
                            stackOut_73_0 = (hd) (Object) stackIn_73_0;
                            stackOut_73_1 = 0;
                            stackIn_74_0 = stackOut_73_0;
                            stackIn_74_1 = stackOut_73_1;
                            break L34;
                          }
                          L36: {
                            stackIn_74_0.field_gb = stackIn_74_1 != 0;
                            if (1 != ((jb) this).field_i[var3].field_sb) {
                              break L36;
                            } else {
                              ((jb) this).a(118, var3);
                              ((jb) this).e(param0 ^ -3410);
                              break L36;
                            }
                          }
                          L37: {
                            if (null == ((jb) this).field_o) {
                              break L37;
                            } else {
                              if (null == ((jb) this).field_o[var3]) {
                                break L37;
                              } else {
                                if (!((jb) this).field_i[var3].field_gb) {
                                  break L37;
                                } else {
                                  qd.a((byte) -67, ((jb) this).field_o[var3]);
                                  break L37;
                                }
                              }
                            }
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L30;
                          } else {
                            break L32;
                          }
                        }
                      }
                    }
                    ((jb) this).field_q = 4096;
                    break L31;
                  }
                  return;
                }
              }
            }
          } else {
            L38: {
              if (((jb) this).field_n != 0) {
                break L38;
              } else {
                L39: {
                  int fieldTemp$17 = ((jb) this).field_m + 1;
                  ((jb) this).field_m = ((jb) this).field_m + 1;
                  if (fieldTemp$17 >= kh.field_q.length + -1) {
                    ((jb) this).field_n = 1;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                ((jb) this).field_q = kh.field_q[((jb) this).field_m];
                if (var5 != 0) {
                  break L38;
                } else {
                  return;
                }
              }
            }
            if (((jb) this).field_n != 1) {
              if (2 != ((jb) this).field_n) {
                return;
              } else {
                L40: {
                  ((jb) this).field_j.field_e = -1;
                  if (((jb) this).field_m > 0) {
                    ((jb) this).field_m = ((jb) this).field_m - 2;
                    break L40;
                  } else {
                    break L40;
                  }
                }
                L41: {
                  ((jb) this).field_q = (((jb) this).field_m << 1827437548) / kh.field_q.length;
                  if (var5 == 0) {
                    break L41;
                  } else {
                    var3 = 0;
                    L42: while (true) {
                      L43: {
                        if (((jb) this).field_i.length <= var3) {
                          break L43;
                        } else {
                          if (var5 != 0) {
                            break L41;
                          } else {
                            L44: {
                              if (var3 != ((jb) this).field_j.field_e) {
                                stackOut_39_0 = 0;
                                stackIn_40_0 = stackOut_39_0;
                                break L44;
                              } else {
                                stackOut_38_0 = 1;
                                stackIn_40_0 = stackOut_38_0;
                                break L44;
                              }
                            }
                            L45: {
                              L46: {
                                var4 = stackIn_40_0;
                                ((jb) this).field_i[var3].b(0, param1);
                                stackOut_40_0 = ((jb) this).field_i[var3];
                                stackIn_43_0 = stackOut_40_0;
                                stackIn_41_0 = stackOut_40_0;
                                if (!((jb) this).field_i[var3].field_lb) {
                                  break L46;
                                } else {
                                  stackOut_41_0 = (hd) (Object) stackIn_41_0;
                                  stackIn_43_0 = stackOut_41_0;
                                  stackIn_42_0 = stackOut_41_0;
                                  if (var4 == 0) {
                                    break L46;
                                  } else {
                                    stackOut_42_0 = (hd) (Object) stackIn_42_0;
                                    stackOut_42_1 = 1;
                                    stackIn_44_0 = stackOut_42_0;
                                    stackIn_44_1 = stackOut_42_1;
                                    break L45;
                                  }
                                }
                              }
                              stackOut_43_0 = (hd) (Object) stackIn_43_0;
                              stackOut_43_1 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              stackIn_44_1 = stackOut_43_1;
                              break L45;
                            }
                            L47: {
                              stackIn_44_0.field_gb = stackIn_44_1 != 0;
                              if (1 != ((jb) this).field_i[var3].field_sb) {
                                break L47;
                              } else {
                                ((jb) this).a(118, var3);
                                ((jb) this).e(param0 ^ -3410);
                                break L47;
                              }
                            }
                            L48: {
                              if (null == ((jb) this).field_o) {
                                break L48;
                              } else {
                                if (null == ((jb) this).field_o[var3]) {
                                  break L48;
                                } else {
                                  if (!((jb) this).field_i[var3].field_gb) {
                                    break L48;
                                  } else {
                                    qd.a((byte) -67, ((jb) this).field_o[var3]);
                                    break L48;
                                  }
                                }
                              }
                            }
                            var3++;
                            if (var5 == 0) {
                              continue L42;
                            } else {
                              break L43;
                            }
                          }
                        }
                      }
                      ((jb) this).field_q = 4096;
                      break L41;
                    }
                  }
                }
                return;
              }
            } else {
              var3 = 0;
              L49: while (true) {
                L50: {
                  L51: {
                    if (((jb) this).field_i.length <= var3) {
                      break L51;
                    } else {
                      if (var5 != 0) {
                        break L50;
                      } else {
                        L52: {
                          if (var3 != ((jb) this).field_j.field_e) {
                            stackOut_15_0 = 0;
                            stackIn_16_0 = stackOut_15_0;
                            break L52;
                          } else {
                            stackOut_14_0 = 1;
                            stackIn_16_0 = stackOut_14_0;
                            break L52;
                          }
                        }
                        L53: {
                          L54: {
                            var4 = stackIn_16_0;
                            ((jb) this).field_i[var3].b(0, param1);
                            stackOut_16_0 = ((jb) this).field_i[var3];
                            stackIn_19_0 = stackOut_16_0;
                            stackIn_17_0 = stackOut_16_0;
                            if (!((jb) this).field_i[var3].field_lb) {
                              break L54;
                            } else {
                              stackOut_17_0 = (hd) (Object) stackIn_17_0;
                              stackIn_19_0 = stackOut_17_0;
                              stackIn_18_0 = stackOut_17_0;
                              if (var4 == 0) {
                                break L54;
                              } else {
                                stackOut_18_0 = (hd) (Object) stackIn_18_0;
                                stackOut_18_1 = 1;
                                stackIn_20_0 = stackOut_18_0;
                                stackIn_20_1 = stackOut_18_1;
                                break L53;
                              }
                            }
                          }
                          stackOut_19_0 = (hd) (Object) stackIn_19_0;
                          stackOut_19_1 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          break L53;
                        }
                        L55: {
                          stackIn_20_0.field_gb = stackIn_20_1 != 0;
                          if (1 != ((jb) this).field_i[var3].field_sb) {
                            break L55;
                          } else {
                            ((jb) this).a(118, var3);
                            ((jb) this).e(param0 ^ -3410);
                            break L55;
                          }
                        }
                        L56: {
                          if (null == ((jb) this).field_o) {
                            break L56;
                          } else {
                            if (null == ((jb) this).field_o[var3]) {
                              break L56;
                            } else {
                              if (!((jb) this).field_i[var3].field_gb) {
                                break L56;
                              } else {
                                qd.a((byte) -67, ((jb) this).field_o[var3]);
                                break L56;
                              }
                            }
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L49;
                        } else {
                          break L51;
                        }
                      }
                    }
                  }
                  ((jb) this).field_q = 4096;
                  break L50;
                }
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    abstract void a(int param0, int param1);

    public static void c(boolean param0) {
        if (param0) {
          field_g = null;
          field_f = null;
          field_h = null;
          field_g = null;
          return;
        } else {
          field_f = null;
          field_h = null;
          field_g = null;
          return;
        }
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hd var12 = null;
        hd var13 = null;
        hd var16 = null;
        hd var17 = null;
        hd var18 = null;
        hd var19 = null;
        hd var22 = null;
        hd var23 = null;
        hd var24 = null;
        hd var27 = null;
        hd var28 = null;
        hd var29 = null;
        hd var32 = null;
        hd var33 = null;
        hd var49 = null;
        hd var50 = null;
        hd var51 = null;
        hd var52 = null;
        hd var53 = null;
        hd var54 = null;
        hd var55 = null;
        hd var56 = null;
        hd var57 = null;
        L0: {
          var11 = Kickabout.field_G;
          var2 = ((jb) this).field_m << -1379118556;
          if (-101 > (var2 ^ -1)) {
            var2 = 100;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          on.a(0, 0, 640, 480, 0, var2);
          if (((jb) this).field_q == 4096) {
            this.a(32, ((jb) this).field_p, ((jb) this).field_k);
            var3 = 0;
            L1: while (true) {
              if (((jb) this).field_i.length <= var3) {
                return;
              } else {
                var55 = ((jb) this).field_i[var3];
                var56 = var55;
                var57 = var56;
                var56 = var55;
                var55.a(100, false);
                var3++;
                if (var11 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          } else {
            var3 = ((jb) this).field_e * ((jb) this).field_q >> -495378324;
            var4 = ((jb) this).field_r * ((jb) this).field_q >> 1054928844;
            var5 = -var3 + 640 >> 263412481;
            iw.a(73, ((jb) this).field_l);
            var6 = -var4 + 480 >> -102734239;
            this.a(32, 0, 0);
            var7 = 0;
            L2: while (true) {
              if (var7 >= ((jb) this).field_i.length) {
                L3: {
                  ta.e(119);
                  var7 = (((jb) this).field_m << 1665782282) / kh.field_q.length;
                  if (var7 > 256) {
                    var7 = 256;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((jb) this).field_l.d(var5, var6, var3, var4, var7);
                return;
              } else {
                var33 = ((jb) this).field_i[var7];
                var55 = var33;
                var56 = var55;
                var57 = var56;
                var55 = var33;
                var9 = var33.field_s;
                var33.field_s = var33.field_s - ((jb) this).field_p;
                var10 = var33.field_J;
                var33.field_J = var33.field_J - ((jb) this).field_k;
                var33.b(0, false);
                var33.a(74, false);
                var33.field_J = var10;
                var33.field_s = var9;
                var7++;
                if (var11 != 0) {
                  L4: {
                    if (var7 > 256) {
                      var7 = 256;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((jb) this).field_l.d(var5, var6, var3, var4, var7);
                  if (var11 != 0) {
                    this.a(32, ((jb) this).field_p, ((jb) this).field_k);
                    var3 = 0;
                    L5: while (true) {
                      if (((jb) this).field_i.length <= var3) {
                        return;
                      } else {
                        var56 = ((jb) this).field_i[var3];
                        var57 = var56;
                        var57 = var56;
                        var56.a(100, false);
                        var3++;
                        if (var11 == 0) {
                          continue L5;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  if (var11 == 0) {
                    continue L2;
                  } else {
                    L6: {
                      ta.e(119);
                      var7 = (((jb) this).field_m << 1665782282) / kh.field_q.length;
                      if (var7 > 256) {
                        var7 = 256;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((jb) this).field_l.d(var5, var6, var3, var4, var7);
                    if (var11 != 0) {
                      this.a(32, ((jb) this).field_p, ((jb) this).field_k);
                      var3 = 0;
                      L7: while (true) {
                        if (((jb) this).field_i.length <= var3) {
                          return;
                        } else {
                          var49 = ((jb) this).field_i[var3];
                          var50 = var49;
                          var51 = var50;
                          var52 = var51;
                          var53 = var52;
                          var54 = var53;
                          var55 = var54;
                          var50 = var49;
                          var49.a(100, false);
                          var3++;
                          if (var11 == 0) {
                            continue L7;
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } else {
          ((jb) this).field_r = 11;
          on.a(0, 0, 640, 480, 0, var2);
          if (((jb) this).field_q != 4096) {
            var3 = ((jb) this).field_e * ((jb) this).field_q >> -495378324;
            var4 = ((jb) this).field_r * ((jb) this).field_q >> 1054928844;
            var5 = -var3 + 640 >> 263412481;
            iw.a(73, ((jb) this).field_l);
            var6 = -var4 + 480 >> -102734239;
            this.a(32, 0, 0);
            var7 = 0;
            L8: while (true) {
              if (var7 >= ((jb) this).field_i.length) {
                ta.e(119);
                var7 = (((jb) this).field_m << 1665782282) / kh.field_q.length;
                L9: {
                  if (var7 > 256) {
                    var7 = 256;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                ((jb) this).field_l.d(var5, var6, var3, var4, var7);
                if (var11 != 0) {
                  this.a(32, ((jb) this).field_p, ((jb) this).field_k);
                  var3 = 0;
                  L10: while (true) {
                    if (((jb) this).field_i.length > var3) {
                      var28 = ((jb) this).field_i[var3];
                      var29 = var28;
                      var32 = var29;
                      var29 = var28;
                      var28.a(100, false);
                      var3++;
                      if (var11 == 0) {
                        continue L10;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                var17 = ((jb) this).field_i[var7];
                var23 = var17;
                var24 = var23;
                var27 = var24;
                var23 = var17;
                var9 = var17.field_s;
                var17.field_s = var17.field_s - ((jb) this).field_p;
                var10 = var17.field_J;
                var17.field_J = var17.field_J - ((jb) this).field_k;
                var17.b(0, false);
                var17.a(74, false);
                var17.field_J = var10;
                var17.field_s = var9;
                var7++;
                if (var11 == 0) {
                  continue L8;
                } else {
                  L11: {
                    if (var7 > 256) {
                      var7 = 256;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  ((jb) this).field_l.d(var5, var6, var3, var4, var7);
                  if (var11 != 0) {
                    this.a(32, ((jb) this).field_p, ((jb) this).field_k);
                    var3 = 0;
                    if (((jb) this).field_i.length > var3) {
                      var18 = ((jb) this).field_i[var3];
                      var19 = var18;
                      var22 = var19;
                      var19 = var18;
                      var18.a(100, false);
                      var3++;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            this.a(32, ((jb) this).field_p, ((jb) this).field_k);
            var3 = 0;
            L12: while (true) {
              if (((jb) this).field_i.length > var3) {
                var12 = ((jb) this).field_i[var3];
                var13 = var12;
                var16 = var13;
                var13 = var12;
                var12.a(100, false);
                var3++;
                if (var11 == 0) {
                  continue L12;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    abstract void a(int param0, boolean param1);

    abstract int a(byte param0);

    final void a(String[] param0, byte param1) {
        ((jb) this).field_o = param0;
        if (param1 == 90) {
            return;
        }
        ((jb) this).field_p = -12;
    }

    boolean a(int param0, byte param1, char param2) {
        int var5 = 0;
        var5 = Kickabout.field_G;
        if (1 == ((jb) this).field_n) {
          if (-14 == (param0 ^ -1)) {
            ((jb) this).e(19910);
            if (param1 == -21) {
              return true;
            } else {
              ((jb) this).b(45, true);
              return true;
            }
          } else {
            ((jb) this).field_j.a(0, true);
            if ((((jb) this).field_j.field_e ^ -1) == 0) {
              if (((jb) this).field_j.field_e >= 0) {
                L0: {
                  if (((jb) this).field_j.c(-1)) {
                    ((jb) this).a(114, ((jb) this).field_j.field_e);
                    ((jb) this).e(19910);
                    if (var5 == 0) {
                      break L0;
                    } else {
                      ((jb) this).e(19910);
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
                if (param1 == -21) {
                  return true;
                } else {
                  ((jb) this).b(45, true);
                  return true;
                }
              } else {
                L1: {
                  if (param1 == -21) {
                    break L1;
                  } else {
                    ((jb) this).b(45, true);
                    break L1;
                  }
                }
                return true;
              }
            } else {
              L2: while (true) {
                L3: {
                  if (((jb) this).field_i[((jb) this).field_j.field_e].field_lb) {
                    if (((jb) this).field_j.field_e < 0) {
                      break L3;
                    } else {
                      if (((jb) this).field_j.c(-1)) {
                        ((jb) this).a(114, ((jb) this).field_j.field_e);
                        ((jb) this).e(19910);
                        if (var5 == 0) {
                          break L3;
                        } else {
                          L4: {
                            ((jb) this).e(19910);
                            if (param1 == -21) {
                              break L4;
                            } else {
                              ((jb) this).b(45, true);
                              break L4;
                            }
                          }
                          return true;
                        }
                      } else {
                        L5: {
                          if (param1 == -21) {
                            break L5;
                          } else {
                            ((jb) this).b(45, true);
                            break L5;
                          }
                        }
                        return true;
                      }
                    }
                  } else {
                    ((jb) this).field_j.field_e = (((jb) this).field_j.field_e + 1) % ((jb) this).field_j.field_a;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        L6: {
                          if (((jb) this).field_j.field_e < 0) {
                            break L6;
                          } else {
                            if (((jb) this).field_j.c(-1)) {
                              ((jb) this).a(114, ((jb) this).field_j.field_e);
                              ((jb) this).e(19910);
                              if (var5 == 0) {
                                break L6;
                              } else {
                                ((jb) this).e(19910);
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (param1 == -21) {
                            break L7;
                          } else {
                            ((jb) this).b(45, true);
                            break L7;
                          }
                        }
                        return true;
                      }
                    }
                  }
                }
                if (param1 != -21) {
                  ((jb) this).b(45, true);
                  return true;
                } else {
                  return true;
                }
              }
            }
          }
        } else {
          return true;
        }
    }

    abstract int a(boolean param0);

    private final int a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        var9 = Kickabout.field_G;
        var4 = 0;
        if (param0) {
          L0: while (true) {
            if (((jb) this).field_i.length > var4) {
              var5 = ((jb) this).field_i[var4].field_q;
              var6 = ((jb) this).field_i[var4].field_mb;
              var7 = ((jb) this).field_i[var4].field_F;
              var8 = ((jb) this).field_i[var4].field_T;
              stackOut_4_0 = param2;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var9 == 0) {
                L1: {
                  if (stackIn_6_0 < var7) {
                    break L1;
                  } else {
                    if (var7 - -var5 <= param2) {
                      break L1;
                    } else {
                      if (param1 < var8) {
                        break L1;
                      } else {
                        if (param1 < var8 + var6) {
                          return var4;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                var4++;
                continue L0;
              } else {
                return stackIn_5_0;
              }
            } else {
              return -1;
            }
          }
        } else {
          return -67;
        }
    }

    abstract int b(int param0);

    final boolean a(int param0) {
        if (param0 == -31268) {
          if (((jb) this).field_n == 2) {
            if (((jb) this).field_m > 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((jb) this).field_q = 38;
          if (((jb) this).field_n == 2) {
            if (((jb) this).field_m > 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void e(int param0) {
        ((jb) this).field_n = 2;
        if (param0 == 19910) {
            return;
        }
        ((jb) this).field_m = 118;
    }

    final void a(int param0, String[] param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Kickabout.field_G;
          ((jb) this).field_n = 0;
          if (param2 == 1054928844) {
            break L0;
          } else {
            ((jb) this).a(46, true);
            break L0;
          }
        }
        ((jb) this).field_q = 0;
        ((jb) this).field_e = ((jb) this).b(-1379118556);
        ((jb) this).field_r = ((jb) this).a((byte) 115);
        ((jb) this).field_k = 480 + -((jb) this).field_r >> 1655863937;
        ((jb) this).field_p = -((jb) this).field_e + 640 >> 5157505;
        ((jb) this).field_l = new ut(((jb) this).field_e, ((jb) this).field_r);
        ((jb) this).field_i = new hd[param1.length];
        var4 = ((jb) this).field_i.length;
        var5 = -(95 * var4) - 5 * (var4 + -1) + 640 >> -926467135;
        var6 = 0;
        L1: while (true) {
          if (((jb) this).field_i.length > var6) {
            param1[var6] = param1[var6].toLowerCase();
            ((jb) this).field_i[var6] = eo.a(param1[var6], 7126504, (hu) (Object) un.field_d, 90, false);
            var7 = ((jb) this).field_k + ((jb) this).field_r + (-((jb) this).field_i[var6].field_mb + -10);
            ((jb) this).field_i[var6].field_s = 100 * var6 + var5;
            ((jb) this).field_i[var6].field_J = var7;
            var6++;
            if (var8 == 0) {
              continue L1;
            } else {
              return;
            }
          } else {
            ((jb) this).field_j = new ko(((jb) this).field_i.length);
            ((jb) this).field_j.field_e = param0;
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        pt.a(param1 + ((jb) this).field_e, param0 + -22946, param1, param2 + ((jb) this).field_r, param2);
        var4 = 0;
        L0: while (true) {
          if (((jb) this).field_e > var4) {
            mk.field_a.d(var4 + param1, param2 - -((jb) this).field_r - 480);
            var4++;
            if (var5 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            cq.field_j.e(param1 - 10, 15 + param2, cq.field_j.field_o * 2 / 3, 2 * cq.field_j.field_v / 3, param0);
            ((jb) this).a((byte) -29, param1, param2);
            on.c(param1, param2, ((jb) this).field_e, ((jb) this).field_r, 2, 65793);
            ta.e(124);
            return;
          }
        }
    }

    jb() {
        ((jb) this).field_q = 0;
        ((jb) this).field_m = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "(<%0> players want to join)";
        field_h = "Kickabout is also availible as an application on <col=ffff00>Facebook</col>.";
    }
}
