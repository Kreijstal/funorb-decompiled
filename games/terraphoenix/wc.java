/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class wc extends vh {
    static int field_r;
    int field_q;
    static int field_s;
    static int field_p;

    abstract boolean d(int param0);

    final static void a(e param0, int param1, int param2, int param3) {
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_115_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_113_0 = 0;
        var19 = Terraphoenix.field_V;
        var4 = 0;
        L0: while (true) {
          if (param2 < var4) {
            if (param3 == -11669) {
              var4 = 0;
              L1: while (true) {
                if (rd.field_t <= var4) {
                  return;
                } else {
                  L2: {
                    var5 = 1;
                    var6 = 32;
                    var7 = 32;
                    if (p.field_a[var4].field_g < 0) {
                      var5 = 0;
                      var7 = 1;
                      p.field_a[var4].field_g = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (p.field_a[var4].field_g > param2) {
                      p.field_a[var4].field_g = param2;
                      var7 = 1;
                      var5 = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if ((p.field_a[var4].field_a ^ -1) > -41) {
                      var5 = 0;
                      var6 = 1;
                      p.field_a[var4].field_a = 40;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (param1 >= p.field_a[var4].field_a) {
                      break L5;
                    } else {
                      p.field_a[var4].field_a = param1;
                      var6 = 1;
                      var5 = 0;
                      break L5;
                    }
                  }
                  L6: {
                    if (var5 == 0) {
                      break L6;
                    } else {
                      if (pc.field_b[p.field_a[var4].field_g][p.field_a[var4].field_a]) {
                        var7 = 1;
                        var6 = 1;
                        var5 = 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (var5 != 0) {
                      if (-1 != p.field_a[var4].field_f) {
                        p.field_a[var4].field_f = (p.field_a[var4].field_f - -p.field_a[var4].field_g) / 2;
                        p.field_a[var4].field_e = (p.field_a[var4].field_e - -p.field_a[var4].field_a) / 2;
                        break L7;
                      } else {
                        p.field_a[var4].field_f = p.field_a[var4].field_g;
                        p.field_a[var4].field_e = p.field_a[var4].field_a;
                        break L7;
                      }
                    } else {
                      L8: {
                        var8 = p.field_a[var4].field_g;
                        var9 = p.field_a[var4].field_a;
                        var10 = 32767;
                        var11 = p.field_a[var4].field_g - p.field_a[var4].field_i;
                        var12 = p.field_a[var4].field_g - -p.field_a[var4].field_i;
                        var13 = -p.field_a[var4].field_i + p.field_a[var4].field_a;
                        if ((var11 ^ -1) > -1) {
                          var11 = 0;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (param2 <= var12) {
                          var12 = param2;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        var14 = p.field_a[var4].field_a - -p.field_a[var4].field_i;
                        if ((var13 ^ -1) <= -41) {
                          break L10;
                        } else {
                          var13 = 40;
                          break L10;
                        }
                      }
                      L11: {
                        if (param1 <= var14) {
                          var14 = param1;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      var15 = var11;
                      L12: while (true) {
                        if (var12 < var15) {
                          L13: {
                            if (32767 == var10) {
                              p.field_a[var4].field_i = p.field_a[var4].field_i + 32;
                              break L13;
                            } else {
                              p.field_a[var4].field_g = var8;
                              p.field_a[var4].field_a = var9;
                              break L13;
                            }
                          }
                          L14: {
                            if (0 == (p.field_a[var4].field_f ^ -1)) {
                              p.field_a[var4].field_f = p.field_a[var4].field_g;
                              p.field_a[var4].field_e = p.field_a[var4].field_a;
                              break L14;
                            } else {
                              L15: {
                                if (var10 < p.field_a[var4].field_i) {
                                  p.field_a[var4].field_i = var10;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              p.field_a[var4].field_f = (p.field_a[var4].field_g + p.field_a[var4].field_f) / 2;
                              p.field_a[var4].field_e = (p.field_a[var4].field_a + p.field_a[var4].field_e) / 2;
                              break L14;
                            }
                          }
                          L16: {
                            if (p.field_a[var4].field_g + -31 <= 0) {
                              stackOut_59_0 = 0;
                              stackIn_60_0 = stackOut_59_0;
                              break L16;
                            } else {
                              stackOut_58_0 = -31 + p.field_a[var4].field_g;
                              stackIn_60_0 = stackOut_58_0;
                              break L16;
                            }
                          }
                          L17: {
                            var11 = stackIn_60_0;
                            if (param1 <= 31 + p.field_a[var4].field_a) {
                              stackOut_62_0 = param1;
                              stackIn_63_0 = stackOut_62_0;
                              break L17;
                            } else {
                              stackOut_61_0 = p.field_a[var4].field_a + 31;
                              stackIn_63_0 = stackOut_61_0;
                              break L17;
                            }
                          }
                          L18: {
                            var14 = stackIn_63_0;
                            if (param2 > p.field_a[var4].field_g + 31) {
                              stackOut_65_0 = 31 + p.field_a[var4].field_g;
                              stackIn_66_0 = stackOut_65_0;
                              break L18;
                            } else {
                              stackOut_64_0 = param2;
                              stackIn_66_0 = stackOut_64_0;
                              break L18;
                            }
                          }
                          L19: {
                            var12 = stackIn_66_0;
                            if (p.field_a[var4].field_a + -31 <= 40) {
                              stackOut_68_0 = 40;
                              stackIn_69_0 = stackOut_68_0;
                              break L19;
                            } else {
                              stackOut_67_0 = p.field_a[var4].field_a - 31;
                              stackIn_69_0 = stackOut_67_0;
                              break L19;
                            }
                          }
                          var13 = stackIn_69_0;
                          var15 = var11;
                          L20: while (true) {
                            if (var15 > var12) {
                              break L7;
                            } else {
                              var16 = var13;
                              L21: while (true) {
                                if (var16 > var14) {
                                  var15++;
                                  continue L20;
                                } else {
                                  pc.field_b[var15][var16] = true;
                                  var16++;
                                  continue L21;
                                }
                              }
                            }
                          }
                        } else {
                          var16 = var13;
                          L22: while (true) {
                            if (var14 < var16) {
                              var15 = var15 + var6;
                              continue L12;
                            } else {
                              if (!pc.field_b[var15][var16]) {
                                L23: {
                                  var17 = Math.abs(var15 + -p.field_a[var4].field_g) + Math.abs(var16 - p.field_a[var4].field_a);
                                  if (var10 > var17) {
                                    var9 = var16;
                                    var10 = var17;
                                    var8 = var15;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                var16 = var16 + var7;
                                continue L22;
                              } else {
                                var16 = var16 + var7;
                                continue L22;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L24: {
                    L25: {
                      var8 = 0;
                      if (-2 == (p.field_a[var4].field_b ^ -1)) {
                        break L25;
                      } else {
                        if ((p.field_a[var4].field_b ^ -1) == -3) {
                          break L25;
                        } else {
                          if ((p.field_a[var4].field_b ^ -1) == -6) {
                            break L25;
                          } else {
                            if (p.field_a[var4].field_b == 12) {
                              break L25;
                            } else {
                              L26: {
                                if (p.field_a[var4].field_d == null) {
                                  break L26;
                                } else {
                                  L27: {
                                    if (p.field_a[var4].field_d.field_E > eg.field_p) {
                                      var8 = 1;
                                      break L27;
                                    } else {
                                      break L27;
                                    }
                                  }
                                  if (p.field_a[var4].field_d.field_E < eg.field_p) {
                                    var8 = -1;
                                    break L26;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                              L28: {
                                var9 = p.field_a[var4].field_b;
                                if (var9 == 4) {
                                  var9 = dd.field_M;
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                              L29: {
                                if (fd.field_o) {
                                  L30: {
                                    if (var5 == 0) {
                                      break L30;
                                    } else {
                                      L31: {
                                        if (p.field_a[var4].field_d != param0.field_q) {
                                          break L31;
                                        } else {
                                          if (null != param0.field_q) {
                                            break L30;
                                          } else {
                                            break L31;
                                          }
                                        }
                                      }
                                      if (var9 == -5) {
                                        break L30;
                                      } else {
                                        if (7 == var9) {
                                          break L30;
                                        } else {
                                          if (-9 == var9) {
                                            break L30;
                                          } else {
                                            rh.field_b[var9].d(p.field_a[var4].field_f, p.field_a[var4].field_e, 128);
                                            break L29;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  rh.field_b[var9].b(p.field_a[var4].field_f, p.field_a[var4].field_e);
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                              if (p.field_a[var4].field_d != param0.field_q) {
                                break L24;
                              } else {
                                if (!fd.field_o) {
                                  break L24;
                                } else {
                                  l.a(16 + p.field_a[var4].field_f, p.field_a[var4].field_e + 16, 16, 16777215);
                                  l.a(16 + p.field_a[var4].field_f, p.field_a[var4].field_e - -16, 17, 255);
                                  break L24;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var9 = 0;
                    L32: while (true) {
                      if (-13 >= (var9 ^ -1)) {
                        L33: {
                          if (p.field_a[var4].field_d == null) {
                            break L33;
                          } else {
                            L34: {
                              if (eg.field_p >= p.field_a[var4].field_d.field_E) {
                                break L34;
                              } else {
                                var8 = 1;
                                break L34;
                              }
                            }
                            if (p.field_a[var4].field_d.field_E >= eg.field_p) {
                              break L33;
                            } else {
                              var8 = -1;
                              break L33;
                            }
                          }
                        }
                        if (!fd.field_o) {
                          break L24;
                        } else {
                          L35: {
                            if (var5 == 0) {
                              break L35;
                            } else {
                              L36: {
                                if (param0.field_q == null) {
                                  break L36;
                                } else {
                                  if (param0.field_h.a((byte) -93, param0.field_q, p.field_a[var4].field_d)) {
                                    break L35;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              rh.field_b[p.field_a[var4].field_b].d(p.field_a[var4].field_f, p.field_a[var4].field_e, 128);
                              break L24;
                            }
                          }
                          rh.field_b[p.field_a[var4].field_b].b(p.field_a[var4].field_f, p.field_a[var4].field_e);
                          if (param0.field_q == null) {
                            break L24;
                          } else {
                            if (param0.field_h.a((byte) -93, param0.field_q, p.field_a[var4].field_d)) {
                              l.a(16 + p.field_a[var4].field_f, 16 + p.field_a[var4].field_e, 16, 16711680);
                              l.a(p.field_a[var4].field_f - -16, 16 + p.field_a[var4].field_e, 17, 8388608);
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                        }
                      } else {
                        if (null != param0.field_C[var9]) {
                          if (param0.field_C[var9].field_Z != null) {
                            L37: {
                              if (param0.field_C[var9].field_ob) {
                                stackOut_114_0 = 0;
                                stackIn_115_0 = stackOut_114_0;
                                break L37;
                              } else {
                                stackOut_113_0 = 1;
                                stackIn_115_0 = stackOut_113_0;
                                break L37;
                              }
                            }
                            if (stackIn_115_0 == 1) {
                              if (param0.field_h.a((byte) -93, param0.field_C[var9], p.field_a[var4].field_d)) {
                                param0.field_C[var9].field_ob = true;
                                var9++;
                                continue L32;
                              } else {
                                var9++;
                                continue L32;
                              }
                            } else {
                              var9++;
                              continue L32;
                            }
                          } else {
                            var9++;
                            continue L32;
                          }
                        } else {
                          var9++;
                          continue L32;
                        }
                      }
                    }
                  }
                  L38: {
                    if (!fd.field_o) {
                      break L38;
                    } else {
                      L39: {
                        if (var8 != 1) {
                          break L39;
                        } else {
                          rh.field_b[9].b(p.field_a[var4].field_f, -8 + p.field_a[var4].field_e);
                          break L39;
                        }
                      }
                      if ((var8 ^ -1) == 0) {
                        rh.field_b[10].b(p.field_a[var4].field_f, p.field_a[var4].field_e + 8);
                        break L38;
                      } else {
                        break L38;
                      }
                    }
                  }
                  L40: {
                    L41: {
                      if (2 >= p.field_a[var4].field_b) {
                        break L41;
                      } else {
                        if (p.field_a[var4].field_b == 5) {
                          break L41;
                        } else {
                          if (p.field_a[var4].field_b != 6) {
                            break L40;
                          } else {
                            break L41;
                          }
                        }
                      }
                    }
                    if (var5 != 0) {
                      if (!fd.field_o) {
                        break L40;
                      } else {
                        if (eg.field_p == p.field_a[var4].field_d.field_E) {
                          L42: {
                            var9 = 100;
                            var10 = 110;
                            if (9 != p.field_a[var4].field_d.field_t) {
                              break L42;
                            } else {
                              var9 = 400;
                              break L42;
                            }
                          }
                          L43: {
                            if (null != p.field_a[var4].field_d.field_Z) {
                              var10 = 200;
                              break L43;
                            } else {
                              break L43;
                            }
                          }
                          var11 = 31 * p.field_a[var4].field_d.field_P / var9;
                          var12 = p.field_a[var4].field_d.field_u * 31 / var10;
                          var13 = (p.field_a[var4].field_d.field_m + p.field_a[var4].field_d.field_u) * 31 / var10;
                          var14 = 31 * p.field_a[var4].field_d.field_mb / var9;
                          var15 = (p.field_a[var4].field_d.field_fb - -p.field_a[var4].field_d.field_J) * 31 / var10;
                          var16 = 0;
                          L44: while (true) {
                            if (-32 >= (var16 ^ -1)) {
                              break L40;
                            } else {
                              L45: {
                                var17 = (int)(20.0 * Math.cos((double)(-(var14 / 2) + var16) * 0.07));
                                var18 = -(int)(20.0 * Math.sin(0.07 * (double)(-(var14 / 2) + var16)));
                                if (var16 < var11) {
                                  l.e(16 + -var17 + p.field_a[var4].field_f, 16 + p.field_a[var4].field_e - -var18, 1, 16711680);
                                  break L45;
                                } else {
                                  if (var14 <= var16) {
                                    break L45;
                                  } else {
                                    l.e(p.field_a[var4].field_f + (-var17 + 16), 16 + var18 + p.field_a[var4].field_e, 1, 8388608);
                                    break L45;
                                  }
                                }
                              }
                              var17 = (int)(Math.cos((double)(-(var15 / 2) + var16) * 0.07) * 20.0);
                              var18 = -(int)(Math.sin((double)(-(var15 / 2) + var16) * 0.07) * 20.0);
                              if (var12 > var16) {
                                l.e(var17 + (p.field_a[var4].field_f + 16), 16 + var18 + p.field_a[var4].field_e, 1, 65280);
                                var16++;
                                continue L44;
                              } else {
                                if (var13 <= var16) {
                                  if (var16 < var15) {
                                    l.e(16 + var17 + p.field_a[var4].field_f, 16 + var18 + p.field_a[var4].field_e, 1, 32768);
                                    var16++;
                                    continue L44;
                                  } else {
                                    var16++;
                                    continue L44;
                                  }
                                } else {
                                  l.e(16 + (p.field_a[var4].field_f - -var17), var18 + p.field_a[var4].field_e - -16, 1, 255);
                                  var16++;
                                  continue L44;
                                }
                              }
                            }
                          }
                        } else {
                          break L40;
                        }
                      }
                    } else {
                      break L40;
                    }
                  }
                  L46: {
                    if (p.field_a[var4].field_b != 0) {
                      break L46;
                    } else {
                      if (p.field_a[var4].field_d == null) {
                        break L46;
                      } else {
                        if (p.field_a[var4].field_d.field_Z == null) {
                          break L46;
                        } else {
                          if (ce.field_e) {
                            L47: {
                              var9 = 16777215;
                              if (fd.field_o) {
                                break L47;
                              } else {
                                if (p.field_a[var4].field_d == param0.field_q) {
                                  break L47;
                                } else {
                                  var9 = 9013641;
                                  break L47;
                                }
                              }
                            }
                            og.field_f.c(p.field_a[var4].field_d.field_Z.b(1), p.field_a[var4].field_f - -16, -1 + (6 + (16 + p.field_a[var4].field_e)), 0, -1);
                            og.field_f.c(p.field_a[var4].field_d.field_Z.b(param3 + 11670), 16 + p.field_a[var4].field_f, p.field_a[var4].field_e - -16 + 6 + 1, 0, -1);
                            og.field_f.c(p.field_a[var4].field_d.field_Z.b(1), -1 + (p.field_a[var4].field_f + 16), 6 + (16 + p.field_a[var4].field_e), 0, -1);
                            og.field_f.c(p.field_a[var4].field_d.field_Z.b(param3 + 11670), 16 + (p.field_a[var4].field_f - -1), 16 + p.field_a[var4].field_e + 6, 0, -1);
                            og.field_f.c(p.field_a[var4].field_d.field_Z.b(param3 + 11670), 16 + p.field_a[var4].field_f, 22 + p.field_a[var4].field_e, var9, -1);
                            break L46;
                          } else {
                            break L46;
                          }
                        }
                      }
                    }
                  }
                  L48: {
                    if (6 != p.field_a[var4].field_b) {
                      break L48;
                    } else {
                      if (p.field_a[var4].field_d == null) {
                        break L48;
                      } else {
                        if (ce.field_e) {
                          var9 = 255;
                          og.field_f.c(ig.field_c, 16 + p.field_a[var4].field_f, 16 + (p.field_a[var4].field_e + 6 - 1), 0, -1);
                          og.field_f.c(ig.field_c, p.field_a[var4].field_f + 16, 6 + p.field_a[var4].field_e + 17, 0, -1);
                          og.field_f.c(ig.field_c, -1 + (p.field_a[var4].field_f - -16), 6 + (16 + p.field_a[var4].field_e), 0, -1);
                          og.field_f.c(ig.field_c, 1 + (16 + p.field_a[var4].field_f), 22 + p.field_a[var4].field_e, 0, -1);
                          og.field_f.c(ig.field_c, p.field_a[var4].field_f - -16, 16 + (p.field_a[var4].field_e + 6), var9, -1);
                          break L48;
                        } else {
                          break L48;
                        }
                      }
                    }
                  }
                  if (var5 != 0) {
                    p.field_a[var4].field_d = null;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            var5 = 0;
            L49: while (true) {
              if (var5 > param1) {
                var4++;
                continue L0;
              } else {
                pc.field_b[var4][var5] = false;
                var5++;
                continue L49;
              }
            }
          }
        }
    }

    final static String a(long param0, int param1) {
        ab.field_l.setTime(new Date(param0));
        int var3 = ab.field_l.get(7);
        int var4 = ab.field_l.get(5);
        int var5 = ab.field_l.get(2);
        int var6 = ab.field_l.get(1);
        int var7 = ab.field_l.get(11);
        int var8 = ab.field_l.get(12);
        int var9 = ab.field_l.get(13);
        if (param1 != -1) {
            field_p = -67;
        }
        return vj.field_O[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + uk.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    wc(int param0) {
        ((wc) this).field_q = param0;
    }

    final static int c(int param0) {
        i.field_a.a(param0);
        if (!jg.field_kb.c(true)) {
            return ga.a(param0 ^ -108);
        }
        return 0;
    }

    abstract Object d(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = -1;
    }
}
