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
        RuntimeException var4 = null;
        int var4_int = 0;
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
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_116_0 = 0;
        RuntimeException stackIn_190_0 = null;
        StringBuilder stackIn_190_1 = null;
        RuntimeException stackIn_191_0 = null;
        StringBuilder stackIn_191_1 = null;
        RuntimeException stackIn_192_0 = null;
        StringBuilder stackIn_192_1 = null;
        String stackIn_192_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_114_0 = 0;
        RuntimeException stackOut_189_0 = null;
        StringBuilder stackOut_189_1 = null;
        RuntimeException stackOut_191_0 = null;
        StringBuilder stackOut_191_1 = null;
        String stackOut_191_2 = null;
        RuntimeException stackOut_190_0 = null;
        StringBuilder stackOut_190_1 = null;
        String stackOut_190_2 = null;
        var19 = Terraphoenix.field_V;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (param2 < var4_int) {
                if (param3 == -11669) {
                  var4_int = 0;
                  L2: while (true) {
                    if (rd.field_t <= var4_int) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        var5 = 1;
                        var6 = 32;
                        var7 = 32;
                        if (p.field_a[var4_int].field_g < 0) {
                          var5 = 0;
                          var7 = 1;
                          p.field_a[var4_int].field_g = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (p.field_a[var4_int].field_g > param2) {
                          p.field_a[var4_int].field_g = param2;
                          var7 = 1;
                          var5 = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if ((p.field_a[var4_int].field_a ^ -1) > -41) {
                          var5 = 0;
                          var6 = 1;
                          p.field_a[var4_int].field_a = 40;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (param1 >= p.field_a[var4_int].field_a) {
                          break L6;
                        } else {
                          p.field_a[var4_int].field_a = param1;
                          var6 = 1;
                          var5 = 0;
                          break L6;
                        }
                      }
                      L7: {
                        if (var5 == 0) {
                          break L7;
                        } else {
                          if (pc.field_b[p.field_a[var4_int].field_g][p.field_a[var4_int].field_a]) {
                            var7 = 1;
                            var6 = 1;
                            var5 = 0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (var5 != 0) {
                          if (-1 != p.field_a[var4_int].field_f) {
                            p.field_a[var4_int].field_f = (p.field_a[var4_int].field_f - -p.field_a[var4_int].field_g) / 2;
                            p.field_a[var4_int].field_e = (p.field_a[var4_int].field_e - -p.field_a[var4_int].field_a) / 2;
                            break L8;
                          } else {
                            p.field_a[var4_int].field_f = p.field_a[var4_int].field_g;
                            p.field_a[var4_int].field_e = p.field_a[var4_int].field_a;
                            break L8;
                          }
                        } else {
                          L9: {
                            var8 = p.field_a[var4_int].field_g;
                            var9 = p.field_a[var4_int].field_a;
                            var10 = 32767;
                            var11 = p.field_a[var4_int].field_g - p.field_a[var4_int].field_i;
                            var12 = p.field_a[var4_int].field_g - -p.field_a[var4_int].field_i;
                            var13 = -p.field_a[var4_int].field_i + p.field_a[var4_int].field_a;
                            if ((var11 ^ -1) > -1) {
                              var11 = 0;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            if (param2 <= var12) {
                              var12 = param2;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          L11: {
                            var14 = p.field_a[var4_int].field_a - -p.field_a[var4_int].field_i;
                            if ((var13 ^ -1) <= -41) {
                              break L11;
                            } else {
                              var13 = 40;
                              break L11;
                            }
                          }
                          L12: {
                            if (param1 <= var14) {
                              var14 = param1;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          var15 = var11;
                          L13: while (true) {
                            if (var12 < var15) {
                              L14: {
                                if (32767 == var10) {
                                  p.field_a[var4_int].field_i = p.field_a[var4_int].field_i + 32;
                                  break L14;
                                } else {
                                  p.field_a[var4_int].field_g = var8;
                                  p.field_a[var4_int].field_a = var9;
                                  break L14;
                                }
                              }
                              L15: {
                                if (0 == (p.field_a[var4_int].field_f ^ -1)) {
                                  p.field_a[var4_int].field_f = p.field_a[var4_int].field_g;
                                  p.field_a[var4_int].field_e = p.field_a[var4_int].field_a;
                                  break L15;
                                } else {
                                  L16: {
                                    if (var10 < p.field_a[var4_int].field_i) {
                                      p.field_a[var4_int].field_i = var10;
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  }
                                  p.field_a[var4_int].field_f = (p.field_a[var4_int].field_g + p.field_a[var4_int].field_f) / 2;
                                  p.field_a[var4_int].field_e = (p.field_a[var4_int].field_a + p.field_a[var4_int].field_e) / 2;
                                  break L15;
                                }
                              }
                              L17: {
                                if (p.field_a[var4_int].field_g + -31 <= 0) {
                                  stackOut_60_0 = 0;
                                  stackIn_61_0 = stackOut_60_0;
                                  break L17;
                                } else {
                                  stackOut_59_0 = -31 + p.field_a[var4_int].field_g;
                                  stackIn_61_0 = stackOut_59_0;
                                  break L17;
                                }
                              }
                              L18: {
                                var11 = stackIn_61_0;
                                if (param1 <= 31 + p.field_a[var4_int].field_a) {
                                  stackOut_63_0 = param1;
                                  stackIn_64_0 = stackOut_63_0;
                                  break L18;
                                } else {
                                  stackOut_62_0 = p.field_a[var4_int].field_a + 31;
                                  stackIn_64_0 = stackOut_62_0;
                                  break L18;
                                }
                              }
                              L19: {
                                var14 = stackIn_64_0;
                                if (param2 > p.field_a[var4_int].field_g + 31) {
                                  stackOut_66_0 = 31 + p.field_a[var4_int].field_g;
                                  stackIn_67_0 = stackOut_66_0;
                                  break L19;
                                } else {
                                  stackOut_65_0 = param2;
                                  stackIn_67_0 = stackOut_65_0;
                                  break L19;
                                }
                              }
                              L20: {
                                var12 = stackIn_67_0;
                                if (p.field_a[var4_int].field_a + -31 <= 40) {
                                  stackOut_69_0 = 40;
                                  stackIn_70_0 = stackOut_69_0;
                                  break L20;
                                } else {
                                  stackOut_68_0 = p.field_a[var4_int].field_a - 31;
                                  stackIn_70_0 = stackOut_68_0;
                                  break L20;
                                }
                              }
                              var13 = stackIn_70_0;
                              var15 = var11;
                              L21: while (true) {
                                if (var15 > var12) {
                                  break L8;
                                } else {
                                  var16 = var13;
                                  L22: while (true) {
                                    if (var16 > var14) {
                                      var15++;
                                      continue L21;
                                    } else {
                                      pc.field_b[var15][var16] = true;
                                      var16++;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            } else {
                              var16 = var13;
                              L23: while (true) {
                                if (var14 < var16) {
                                  var15 = var15 + var6;
                                  continue L13;
                                } else {
                                  L24: {
                                    if (!pc.field_b[var15][var16]) {
                                      var17 = Math.abs(var15 + -p.field_a[var4_int].field_g) + Math.abs(var16 - p.field_a[var4_int].field_a);
                                      if (var10 > var17) {
                                        var9 = var16;
                                        var10 = var17;
                                        var8 = var15;
                                        break L24;
                                      } else {
                                        break L24;
                                      }
                                    } else {
                                      break L24;
                                    }
                                  }
                                  var16 = var16 + var7;
                                  continue L23;
                                }
                              }
                            }
                          }
                        }
                      }
                      L25: {
                        L26: {
                          var8 = 0;
                          if (-2 == (p.field_a[var4_int].field_b ^ -1)) {
                            break L26;
                          } else {
                            if ((p.field_a[var4_int].field_b ^ -1) == -3) {
                              break L26;
                            } else {
                              if ((p.field_a[var4_int].field_b ^ -1) == -6) {
                                break L26;
                              } else {
                                if (p.field_a[var4_int].field_b == 12) {
                                  break L26;
                                } else {
                                  L27: {
                                    if (p.field_a[var4_int].field_d == null) {
                                      break L27;
                                    } else {
                                      L28: {
                                        if (p.field_a[var4_int].field_d.field_E > eg.field_p) {
                                          var8 = 1;
                                          break L28;
                                        } else {
                                          break L28;
                                        }
                                      }
                                      if (p.field_a[var4_int].field_d.field_E < eg.field_p) {
                                        var8 = -1;
                                        break L27;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  L29: {
                                    var9 = p.field_a[var4_int].field_b;
                                    if (var9 == 4) {
                                      var9 = dd.field_M;
                                      break L29;
                                    } else {
                                      break L29;
                                    }
                                  }
                                  L30: {
                                    if (fd.field_o) {
                                      L31: {
                                        if (var5 == 0) {
                                          break L31;
                                        } else {
                                          L32: {
                                            if (p.field_a[var4_int].field_d != param0.field_q) {
                                              break L32;
                                            } else {
                                              if (null != param0.field_q) {
                                                break L31;
                                              } else {
                                                break L32;
                                              }
                                            }
                                          }
                                          if ((var9 ^ -1) == -5) {
                                            break L31;
                                          } else {
                                            if (7 == var9) {
                                              break L31;
                                            } else {
                                              if (-9 == (var9 ^ -1)) {
                                                break L31;
                                              } else {
                                                rh.field_b[var9].d(p.field_a[var4_int].field_f, p.field_a[var4_int].field_e, 128);
                                                break L30;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      rh.field_b[var9].b(p.field_a[var4_int].field_f, p.field_a[var4_int].field_e);
                                      break L30;
                                    } else {
                                      break L30;
                                    }
                                  }
                                  if (p.field_a[var4_int].field_d != param0.field_q) {
                                    break L25;
                                  } else {
                                    if (!fd.field_o) {
                                      break L25;
                                    } else {
                                      l.a(16 + p.field_a[var4_int].field_f, p.field_a[var4_int].field_e + 16, 16, 16777215);
                                      l.a(16 + p.field_a[var4_int].field_f, p.field_a[var4_int].field_e - -16, 17, 255);
                                      break L25;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var9 = 0;
                        L33: while (true) {
                          if (-13 >= (var9 ^ -1)) {
                            L34: {
                              if (p.field_a[var4_int].field_d == null) {
                                break L34;
                              } else {
                                L35: {
                                  if (eg.field_p >= p.field_a[var4_int].field_d.field_E) {
                                    break L35;
                                  } else {
                                    var8 = 1;
                                    break L35;
                                  }
                                }
                                if (p.field_a[var4_int].field_d.field_E >= eg.field_p) {
                                  break L34;
                                } else {
                                  var8 = -1;
                                  break L34;
                                }
                              }
                            }
                            if (!fd.field_o) {
                              break L25;
                            } else {
                              L36: {
                                if (var5 == 0) {
                                  break L36;
                                } else {
                                  L37: {
                                    if (param0.field_q == null) {
                                      break L37;
                                    } else {
                                      if (param0.field_h.a((byte) -93, param0.field_q, p.field_a[var4_int].field_d)) {
                                        break L36;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                  rh.field_b[p.field_a[var4_int].field_b].d(p.field_a[var4_int].field_f, p.field_a[var4_int].field_e, 128);
                                  break L25;
                                }
                              }
                              rh.field_b[p.field_a[var4_int].field_b].b(p.field_a[var4_int].field_f, p.field_a[var4_int].field_e);
                              if (param0.field_q == null) {
                                break L25;
                              } else {
                                if (param0.field_h.a((byte) -93, param0.field_q, p.field_a[var4_int].field_d)) {
                                  l.a(16 + p.field_a[var4_int].field_f, 16 + p.field_a[var4_int].field_e, 16, 16711680);
                                  l.a(p.field_a[var4_int].field_f - -16, 16 + p.field_a[var4_int].field_e, 17, 8388608);
                                  break L25;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          } else {
                            if (null != param0.field_C[var9]) {
                              if (param0.field_C[var9].field_Z != null) {
                                L38: {
                                  if (param0.field_C[var9].field_ob) {
                                    stackOut_115_0 = 0;
                                    stackIn_116_0 = stackOut_115_0;
                                    break L38;
                                  } else {
                                    stackOut_114_0 = 1;
                                    stackIn_116_0 = stackOut_114_0;
                                    break L38;
                                  }
                                }
                                if (stackIn_116_0 == 1) {
                                  L39: {
                                    if (param0.field_h.a((byte) -93, param0.field_C[var9], p.field_a[var4_int].field_d)) {
                                      param0.field_C[var9].field_ob = true;
                                      break L39;
                                    } else {
                                      break L39;
                                    }
                                  }
                                  var9++;
                                  continue L33;
                                } else {
                                  var9++;
                                  continue L33;
                                }
                              } else {
                                var9++;
                                continue L33;
                              }
                            } else {
                              var9++;
                              continue L33;
                            }
                          }
                        }
                      }
                      L40: {
                        if (!fd.field_o) {
                          break L40;
                        } else {
                          L41: {
                            if (var8 != 1) {
                              break L41;
                            } else {
                              rh.field_b[9].b(p.field_a[var4_int].field_f, -8 + p.field_a[var4_int].field_e);
                              break L41;
                            }
                          }
                          if ((var8 ^ -1) == 0) {
                            rh.field_b[10].b(p.field_a[var4_int].field_f, p.field_a[var4_int].field_e + 8);
                            break L40;
                          } else {
                            break L40;
                          }
                        }
                      }
                      L42: {
                        L43: {
                          if (2 >= p.field_a[var4_int].field_b) {
                            break L43;
                          } else {
                            if (p.field_a[var4_int].field_b == 5) {
                              break L43;
                            } else {
                              if (p.field_a[var4_int].field_b != 6) {
                                break L42;
                              } else {
                                break L43;
                              }
                            }
                          }
                        }
                        if (var5 != 0) {
                          if (!fd.field_o) {
                            break L42;
                          } else {
                            if (eg.field_p == p.field_a[var4_int].field_d.field_E) {
                              L44: {
                                var9 = 100;
                                var10 = 110;
                                if (9 != p.field_a[var4_int].field_d.field_t) {
                                  break L44;
                                } else {
                                  var9 = 400;
                                  break L44;
                                }
                              }
                              L45: {
                                if (null != p.field_a[var4_int].field_d.field_Z) {
                                  var10 = 200;
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                              var11 = 31 * p.field_a[var4_int].field_d.field_P / var9;
                              var12 = p.field_a[var4_int].field_d.field_u * 31 / var10;
                              var13 = (p.field_a[var4_int].field_d.field_m + p.field_a[var4_int].field_d.field_u) * 31 / var10;
                              var14 = 31 * p.field_a[var4_int].field_d.field_mb / var9;
                              var15 = (p.field_a[var4_int].field_d.field_fb - -p.field_a[var4_int].field_d.field_J) * 31 / var10;
                              var16 = 0;
                              L46: while (true) {
                                if (-32 >= (var16 ^ -1)) {
                                  break L42;
                                } else {
                                  L47: {
                                    var17 = (int)(20.0 * Math.cos((double)(-(var14 / 2) + var16) * 0.07));
                                    var18 = -(int)(20.0 * Math.sin(0.07 * (double)(-(var14 / 2) + var16)));
                                    if (var16 < var11) {
                                      l.e(16 + -var17 + p.field_a[var4_int].field_f, 16 + p.field_a[var4_int].field_e - -var18, 1, 16711680);
                                      break L47;
                                    } else {
                                      if (var14 <= var16) {
                                        break L47;
                                      } else {
                                        l.e(p.field_a[var4_int].field_f + (-var17 + 16), 16 + var18 + p.field_a[var4_int].field_e, 1, 8388608);
                                        break L47;
                                      }
                                    }
                                  }
                                  L48: {
                                    var17 = (int)(Math.cos((double)(-(var15 / 2) + var16) * 0.07) * 20.0);
                                    var18 = -(int)(Math.sin((double)(-(var15 / 2) + var16) * 0.07) * 20.0);
                                    if (var12 > var16) {
                                      l.e(var17 + (p.field_a[var4_int].field_f + 16), 16 + var18 + p.field_a[var4_int].field_e, 1, 65280);
                                      break L48;
                                    } else {
                                      if (var13 <= var16) {
                                        if (var16 >= var15) {
                                          break L48;
                                        } else {
                                          l.e(16 + var17 + p.field_a[var4_int].field_f, 16 + var18 + p.field_a[var4_int].field_e, 1, 32768);
                                          break L48;
                                        }
                                      } else {
                                        l.e(16 + (p.field_a[var4_int].field_f - -var17), var18 + p.field_a[var4_int].field_e - -16, 1, 255);
                                        break L48;
                                      }
                                    }
                                  }
                                  var16++;
                                  continue L46;
                                }
                              }
                            } else {
                              break L42;
                            }
                          }
                        } else {
                          break L42;
                        }
                      }
                      L49: {
                        if (p.field_a[var4_int].field_b != 0) {
                          break L49;
                        } else {
                          if (p.field_a[var4_int].field_d == null) {
                            break L49;
                          } else {
                            if (p.field_a[var4_int].field_d.field_Z == null) {
                              break L49;
                            } else {
                              if (ce.field_e) {
                                L50: {
                                  var9 = 16777215;
                                  if (fd.field_o) {
                                    break L50;
                                  } else {
                                    if (p.field_a[var4_int].field_d == param0.field_q) {
                                      break L50;
                                    } else {
                                      var9 = 9013641;
                                      break L50;
                                    }
                                  }
                                }
                                og.field_f.c(p.field_a[var4_int].field_d.field_Z.b(1), p.field_a[var4_int].field_f - -16, -1 + (6 + (16 + p.field_a[var4_int].field_e)), 0, -1);
                                og.field_f.c(p.field_a[var4_int].field_d.field_Z.b(param3 + 11670), 16 + p.field_a[var4_int].field_f, p.field_a[var4_int].field_e - -16 + 6 + 1, 0, -1);
                                og.field_f.c(p.field_a[var4_int].field_d.field_Z.b(1), -1 + (p.field_a[var4_int].field_f + 16), 6 + (16 + p.field_a[var4_int].field_e), 0, -1);
                                og.field_f.c(p.field_a[var4_int].field_d.field_Z.b(param3 + 11670), 16 + (p.field_a[var4_int].field_f - -1), 16 + p.field_a[var4_int].field_e + 6, 0, -1);
                                og.field_f.c(p.field_a[var4_int].field_d.field_Z.b(param3 + 11670), 16 + p.field_a[var4_int].field_f, 22 + p.field_a[var4_int].field_e, var9, -1);
                                break L49;
                              } else {
                                break L49;
                              }
                            }
                          }
                        }
                      }
                      L51: {
                        if (6 != p.field_a[var4_int].field_b) {
                          break L51;
                        } else {
                          if (p.field_a[var4_int].field_d == null) {
                            break L51;
                          } else {
                            if (ce.field_e) {
                              var9 = 255;
                              og.field_f.c(ig.field_c, 16 + p.field_a[var4_int].field_f, 16 + (p.field_a[var4_int].field_e + 6 - 1), 0, -1);
                              og.field_f.c(ig.field_c, p.field_a[var4_int].field_f + 16, 6 + p.field_a[var4_int].field_e + 17, 0, -1);
                              og.field_f.c(ig.field_c, -1 + (p.field_a[var4_int].field_f - -16), 6 + (16 + p.field_a[var4_int].field_e), 0, -1);
                              og.field_f.c(ig.field_c, 1 + (16 + p.field_a[var4_int].field_f), 22 + p.field_a[var4_int].field_e, 0, -1);
                              og.field_f.c(ig.field_c, p.field_a[var4_int].field_f - -16, 16 + (p.field_a[var4_int].field_e + 6), var9, -1);
                              break L51;
                            } else {
                              break L51;
                            }
                          }
                        }
                      }
                      L52: {
                        if (var5 != 0) {
                          p.field_a[var4_int].field_d = null;
                          break L52;
                        } else {
                          break L52;
                        }
                      }
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var5 = 0;
                L53: while (true) {
                  if (var5 > param1) {
                    var4_int++;
                    continue L1;
                  } else {
                    pc.field_b[var4_int][var5] = false;
                    var5++;
                    continue L53;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L54: {
            var4 = decompiledCaughtException;
            stackOut_189_0 = (RuntimeException) (var4);
            stackOut_189_1 = new StringBuilder().append("wc.A(");
            stackIn_191_0 = stackOut_189_0;
            stackIn_191_1 = stackOut_189_1;
            stackIn_190_0 = stackOut_189_0;
            stackIn_190_1 = stackOut_189_1;
            if (param0 == null) {
              stackOut_191_0 = (RuntimeException) ((Object) stackIn_191_0);
              stackOut_191_1 = (StringBuilder) ((Object) stackIn_191_1);
              stackOut_191_2 = "null";
              stackIn_192_0 = stackOut_191_0;
              stackIn_192_1 = stackOut_191_1;
              stackIn_192_2 = stackOut_191_2;
              break L54;
            } else {
              stackOut_190_0 = (RuntimeException) ((Object) stackIn_190_0);
              stackOut_190_1 = (StringBuilder) ((Object) stackIn_190_1);
              stackOut_190_2 = "{...}";
              stackIn_192_0 = stackOut_190_0;
              stackIn_192_1 = stackOut_190_1;
              stackIn_192_2 = stackOut_190_2;
              break L54;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_192_0), stackIn_192_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        this.field_q = param0;
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
        field_r = -1;
    }
}
