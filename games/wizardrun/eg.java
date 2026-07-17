/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends qh {
    int field_n;
    static long field_C;
    int field_x;
    static String field_t;
    o field_q;
    private int field_m;
    int field_o;
    int field_w;
    int field_z;
    static int field_v;
    int field_p;
    int field_A;
    static kl field_u;
    int field_r;
    int field_s;
    int field_B;
    int field_y;

    private final void a(int param0, int param1, boolean param2, String param3, int param4) {
        jj.field_b.b(param3, -1 + param1, param4, 0, -1);
        jj.field_b.b(param3, param1 + 1, param4, 0, -1);
        jj.field_b.b(param3, param1, -1 + param4, 0, -1);
        jj.field_b.b(param3, param1, 1 + param4, 0, -1);
        try {
            jj.field_b.b(param3, param1, param4, param0, -1);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "eg.CA(" + param0 + 44 + param1 + 44 + 1 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    private final void a(boolean param0, int param1, tg param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        Object stackIn_81_0 = null;
        Object stackIn_82_0 = null;
        Object stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_88_0 = 0;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_80_0 = null;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            ((eg) this).field_h = ((eg) this).field_m;
            if (param1 == 120) {
              L1: {
                ((eg) this).a(20, tl.field_a, pk.field_s, si.field_j, (byte) -15, param2);
                ((eg) this).field_o = 6;
                ((eg) this).field_w = ((eg) this).field_w + 1;
                if (param0) {
                  L2: {
                    if (((eg) this).field_n < 31) {
                      ((eg) this).field_n = 31;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (((eg) this).field_n <= 34) {
                      break L3;
                    } else {
                      ((eg) this).field_n = 31;
                      break L3;
                    }
                  }
                  ((eg) this).field_z = ((eg) this).field_z + 1;
                  if (5 < ((eg) this).field_z) {
                    ((eg) this).field_z = 0;
                    if (((eg) this).field_n >= 34) {
                      break L1;
                    } else {
                      ((eg) this).field_n = ((eg) this).field_n + 1;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  ((eg) this).field_n = 31;
                  if (0 <= ((eg) this).field_e) {
                    break L1;
                  } else {
                    ((eg) this).field_n = 32;
                    break L1;
                  }
                }
              }
              L4: {
                L5: {
                  if (((eg) this).field_i.field_a < -2) {
                    break L5;
                  } else {
                    if (0 > ((eg) this).field_i.field_b) {
                      break L5;
                    } else {
                      if (20 < ((eg) this).field_i.field_b) {
                        break L5;
                      } else {
                        if (((eg) this).field_e <= -30) {
                          break L5;
                        } else {
                          if (((eg) this).field_k != 1) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (1 == ((eg) this).field_k) {
                    ((eg) this).field_i.field_b = (int)(Math.random() * 18.0) - -1;
                    ((eg) this).field_i.field_a = 17;
                    ((eg) this).field_k = 0;
                    break L6;
                  } else {
                    if (((eg) this).field_i.field_a < -2) {
                      ((eg) this).field_i.field_a = 17;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  ((eg) this).field_o = 0;
                  if (param0) {
                    var4_int = 0;
                    L8: while (true) {
                      if (1000 <= var4_int) {
                        var4_int = 0;
                        L9: while (true) {
                          if (var4_int >= 300) {
                            L10: {
                              var4_int = 0;
                              var5 = 6;
                              if (((eg) this).field_B != 12) {
                                break L10;
                              } else {
                                var5 = 10;
                                var4_int = 1;
                                break L10;
                              }
                            }
                            L11: {
                              if (17 == ((eg) this).field_B) {
                                var5 = 10;
                                var4_int = 2;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L12: {
                              if (26 != ((eg) this).field_B) {
                                break L12;
                              } else {
                                var5 = 10;
                                var4_int = 3;
                                break L12;
                              }
                            }
                            L13: {
                              if (((eg) this).field_B != 33) {
                                break L13;
                              } else {
                                var5 = 10;
                                var4_int = 4;
                                break L13;
                              }
                            }
                            L14: {
                              if (((eg) this).field_B == 40) {
                                var4_int = 5;
                                var5 = 20;
                                if (!da.field_g) {
                                  ql.a(1, 245, 10);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              } else {
                                break L14;
                              }
                            }
                            var6 = 0;
                            L15: while (true) {
                              if (var6 >= var5) {
                                int discarded$1 = 2;
                                ra.a();
                                break L7;
                              } else {
                                L16: {
                                  var7 = this;
                                  if (var6 == 0) {
                                    break L16;
                                  } else {
                                    ii.field_e[od.field_k].a(param1 + 9027, 21, new ob(((eg) this).field_i));
                                    var7 = (Object) (Object) ii.field_e[od.field_k];
                                    od.field_k = od.field_k + 1;
                                    break L16;
                                  }
                                }
                                L17: {
                                  ((eg) var7).a(9147, 21, ((eg) this).field_i);
                                  ((eg) var7).field_f.a(param1 + -246, ((eg) this).field_f);
                                  ((eg) var7).field_f.field_b = ((eg) var7).field_f.field_b + (int)(Math.sin(6.28 * (double)var6 / (double)var5) * 64.0);
                                  ((eg) var7).field_f.field_a = ((eg) var7).field_f.field_a + (int)(64.0 * Math.cos((double)var6 * 6.28 / (double)var5));
                                  ((eg) var7).field_e = 0;
                                  ((eg) var7).field_o = var4_int;
                                  stackOut_80_0 = var7;
                                  stackIn_82_0 = stackOut_80_0;
                                  stackIn_81_0 = stackOut_80_0;
                                  if (var5 / 2 <= var6) {
                                    stackOut_82_0 = stackIn_82_0;
                                    stackOut_82_1 = 1;
                                    stackIn_83_0 = stackOut_82_0;
                                    stackIn_83_1 = stackOut_82_1;
                                    break L17;
                                  } else {
                                    stackOut_81_0 = stackIn_81_0;
                                    stackOut_81_1 = -1;
                                    stackIn_83_0 = stackOut_81_0;
                                    stackIn_83_1 = stackOut_81_1;
                                    break L17;
                                  }
                                }
                                ((eg) (Object) stackIn_83_0).field_h = stackIn_83_1;
                                var6++;
                                continue L15;
                              }
                            }
                          } else {
                            L18: {
                              if (!param2.field_d[var4_int]) {
                                break L18;
                              } else {
                                param2.field_d[var4_int] = false;
                                break L18;
                              }
                            }
                            var4_int++;
                            continue L9;
                          }
                        }
                      } else {
                        if (null != ii.field_e[var4_int]) {
                          L19: {
                            if (ii.field_e[var4_int].field_B <= 2) {
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          var4_int++;
                          continue L8;
                        } else {
                          var4_int++;
                          continue L8;
                        }
                      }
                    }
                  } else {
                    L20: {
                      if (((eg) this).field_B == 8) {
                        break L20;
                      } else {
                        if (((eg) this).field_B != 36) {
                          L21: {
                            ((eg) this).field_o = 0;
                            if (((eg) this).field_d == 32) {
                              ((eg) this).field_o = 0;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          L22: {
                            if (((eg) this).field_d != 48) {
                              break L22;
                            } else {
                              ((eg) this).field_o = 1;
                              break L22;
                            }
                          }
                          L23: {
                            if (64 != ((eg) this).field_d) {
                              break L23;
                            } else {
                              ((eg) this).field_o = 2;
                              break L23;
                            }
                          }
                          L24: {
                            if (80 != ((eg) this).field_d) {
                              break L24;
                            } else {
                              ((eg) this).field_o = 3;
                              break L24;
                            }
                          }
                          L25: {
                            if (-97 != ((eg) this).field_d) {
                              break L25;
                            } else {
                              ((eg) this).field_o = 5;
                              break L25;
                            }
                          }
                          L26: {
                            if (1 >= qh.field_l) {
                              break L26;
                            } else {
                              if (-6 <= ((eg) this).field_o) {
                                break L26;
                              } else {
                                ((eg) this).field_o = ((eg) this).field_o + 1;
                                break L26;
                              }
                            }
                          }
                          L27: {
                            ((eg) this).field_B = 21;
                            if (3 >= qh.field_l) {
                              break L27;
                            } else {
                              if (5 <= ((eg) this).field_o) {
                                break L27;
                              } else {
                                ((eg) this).field_o = ((eg) this).field_o + 1;
                                break L27;
                              }
                            }
                          }
                          ((eg) this).field_d = 32;
                          break L7;
                        } else {
                          break L20;
                        }
                      }
                    }
                    ((eg) this).field_k = 1;
                    break L7;
                  }
                }
                L28: {
                  if (pk.field_s) {
                    stackOut_87_0 = 0;
                    stackIn_88_0 = stackOut_87_0;
                    break L28;
                  } else {
                    stackOut_86_0 = 1;
                    stackIn_88_0 = stackOut_86_0;
                    break L28;
                  }
                }
                if (stackIn_88_0 != 1) {
                  tl.field_a.a(si.field_j[6], 100, 256 * ee.field_p / 100);
                  break L4;
                } else {
                  break L4;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var4 = decompiledCaughtException;
            stackOut_92_0 = (RuntimeException) var4;
            stackOut_92_1 = new StringBuilder().append("eg.J(").append(param0).append(44).append(param1).append(44);
            stackIn_94_0 = stackOut_92_0;
            stackIn_94_1 = stackOut_92_1;
            stackIn_93_0 = stackOut_92_0;
            stackIn_93_1 = stackOut_92_1;
            if (param2 == null) {
              stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
              stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
              stackOut_94_2 = "null";
              stackIn_95_0 = stackOut_94_0;
              stackIn_95_1 = stackOut_94_1;
              stackIn_95_2 = stackOut_94_2;
              break L29;
            } else {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "{...}";
              stackIn_95_0 = stackOut_93_0;
              stackIn_95_1 = stackOut_93_1;
              stackIn_95_2 = stackOut_93_2;
              break L29;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_95_0, stackIn_95_2 + 41);
        }
    }

    private final void d() {
        nj.field_r = nj.field_r - 1;
        if (!(155 < nj.field_r)) {
            ql.a(1, 244, 11);
        }
    }

    public static void a(int param0) {
        field_t = null;
        int var1 = -76 / ((param0 - 4) / 50);
        field_u = null;
    }

    private final void b() {
        ob var3 = null;
        ob var4 = null;
        ob var5 = null;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        L0: {
          var4 = new ob();
          var5 = var4;
          var3 = new ob();
          var5.field_a = ((eg) this).field_A;
          var4.field_b = ((eg) this).field_y;
          var3.field_b = ii.field_e[0].field_y;
          var3.field_a = ii.field_e[0].field_A;
          if (ii.field_e[0].field_s != 0) {
            break L0;
          } else {
            L1: {
              if (((eg) this).field_q == null) {
                break L1;
              } else {
                if (null == ii.field_e[0].field_q) {
                  break L1;
                } else {
                  if (!j.a(((eg) this).field_q, var5.field_b, var4.field_a, ii.field_e[0].field_q, var3.field_b, var3.field_a)) {
                    break L1;
                  } else {
                    if (((eg) this).field_B != 21) {
                      L2: {
                        ((eg) this).field_e = 40;
                        ((eg) this).field_r = 0;
                        ((eg) this).field_B = 21;
                        ((eg) this).field_o = 0;
                        if (((eg) this).field_d == 32) {
                          ((eg) this).field_o = 0;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        if (((eg) this).field_d != 48) {
                          break L3;
                        } else {
                          ((eg) this).field_o = 1;
                          break L3;
                        }
                      }
                      L4: {
                        if (64 != ((eg) this).field_d) {
                          break L4;
                        } else {
                          ((eg) this).field_o = 2;
                          break L4;
                        }
                      }
                      L5: {
                        if (qh.field_l <= 1) {
                          break L5;
                        } else {
                          if (((eg) this).field_o < 5) {
                            ((eg) this).field_o = ((eg) this).field_o + 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (3 >= qh.field_l) {
                          break L6;
                        } else {
                          if (((eg) this).field_o < 5) {
                            ((eg) this).field_o = ((eg) this).field_o + 1;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      ((eg) this).field_d = 32;
                      ((eg) this).field_o = ((eg) this).field_o + 1;
                      ((eg) this).field_p = 0;
                      if (!pk.field_s) {
                        break L1;
                      } else {
                        tl.field_a.a(si.field_j[6], 100, 256 * ee.field_p / 100);
                        break L0;
                      }
                    } else {
                      L7: {
                        if (((eg) this).field_o == 0) {
                          hi.field_c = hi.field_c + 640;
                          sg.field_f = sg.field_f + 10;
                          if (qh.field_l != 5) {
                            break L7;
                          } else {
                            if (!ve.a((byte) 110, 0)) {
                              break L7;
                            } else {
                              int discarded$2 = -1569;
                              this.d();
                              break L7;
                            }
                          }
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (((eg) this).field_o != 1) {
                          break L8;
                        } else {
                          sg.field_f = sg.field_f + 25;
                          wg.field_b = wg.field_b + 1600;
                          break L8;
                        }
                      }
                      L9: {
                        if (((eg) this).field_o != 2) {
                          break L9;
                        } else {
                          me.field_f = me.field_f - 3200;
                          sg.field_f = sg.field_f + 50;
                          if (5 != qh.field_l) {
                            break L9;
                          } else {
                            if (!ve.a((byte) 89, 0)) {
                              break L9;
                            } else {
                              int discarded$3 = -1569;
                              this.d();
                              break L9;
                            }
                          }
                        }
                      }
                      L10: {
                        if (((eg) this).field_o != 3) {
                          break L10;
                        } else {
                          sg.field_f = sg.field_f + 75;
                          ic.field_a = ic.field_a - 4800;
                          break L10;
                        }
                      }
                      L11: {
                        if (((eg) this).field_o == 4) {
                          sg.field_f = sg.field_f + 100;
                          hi.field_c = hi.field_c + 6400;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (((eg) this).field_o != 5) {
                          break L12;
                        } else {
                          wg.field_b = wg.field_b + 9600;
                          sg.field_f = sg.field_f + 150;
                          break L12;
                        }
                      }
                      L13: {
                        if (6 == ((eg) this).field_o) {
                          me.field_f = me.field_f - 16000;
                          sg.field_f = sg.field_f + 250;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (((eg) this).field_o == 7) {
                          ic.field_a = ic.field_a - 32000;
                          sg.field_f = sg.field_f + 500;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (pk.field_s) {
                          stackOut_31_0 = 0;
                          stackIn_32_0 = stackOut_31_0;
                          break L15;
                        } else {
                          stackOut_30_0 = 1;
                          stackIn_32_0 = stackOut_30_0;
                          break L15;
                        }
                      }
                      L16: {
                        if (stackIn_32_0 != 0) {
                          break L16;
                        } else {
                          tl.field_a.a(si.field_j[7], 100, ee.field_p * 256 / 100);
                          break L16;
                        }
                      }
                      ((eg) this).field_w = 0;
                      ((eg) this).field_B = 44;
                      break L0;
                    }
                  }
                }
              }
            }
            break L0;
          }
        }
    }

    final void d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        double var11_double = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object stackIn_85_0 = null;
        Object stackIn_86_0 = null;
        Object stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        Object stackIn_88_0 = null;
        Object stackIn_89_0 = null;
        Object stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        Object stackIn_101_0 = null;
        Object stackIn_102_0 = null;
        Object stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        Object stackIn_113_0 = null;
        Object stackIn_114_0 = null;
        Object stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        Object stackIn_123_0 = null;
        Object stackIn_124_0 = null;
        Object stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        Object stackOut_84_0 = null;
        Object stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        Object stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        Object stackOut_87_0 = null;
        Object stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        Object stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        Object stackOut_100_0 = null;
        Object stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        Object stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        Object stackOut_112_0 = null;
        Object stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        Object stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        Object stackOut_122_0 = null;
        Object stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        Object stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        L0: {
          var15 = wizardrun.field_H;
          ((eg) this).field_q = null;
          var2 = 32 * ((eg) this).field_f.field_b / 240 + 32 * ((eg) this).field_i.field_b;
          var3 = 32 * (-1 + (15 + -((eg) this).field_i.field_a)) - 32 * ((eg) this).field_f.field_a / 240;
          var3 = var3 - (((eg) this).field_d + -32);
          if (param0) {
            break L0;
          } else {
            this.a(-46, -3, (byte) 15);
            break L0;
          }
        }
        L1: {
          L2: {
            var11 = ((eg) this).field_B;
            if (var11 != 0) {
              if (var11 == 1) {
                L3: {
                  var5 = ((eg) this).field_f.field_b + (240 * ((eg) this).field_i.field_b - -((eg) this).field_w);
                  if (0 > ((eg) this).field_w) {
                    break L3;
                  } else {
                    if (((eg) this).field_w > 10) {
                      break L3;
                    } else {
                      ob.field_c.a(12 + var2, var3 + 12, -87, 128, var5);
                      break L3;
                    }
                  }
                }
                L4: {
                  if (10 >= ((eg) this).field_w) {
                    break L4;
                  } else {
                    if (((eg) this).field_w <= 15) {
                      ob.field_c.a(12 + var2, var3 - -12, -119, 112, var5);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (((eg) this).field_w <= 15) {
                    break L5;
                  } else {
                    if (20 >= ((eg) this).field_w) {
                      ob.field_c.a(var2 - -12, var3 - -12, -96, 96, var5);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (((eg) this).field_w <= 20) {
                    break L6;
                  } else {
                    if (((eg) this).field_w <= 25) {
                      ob.field_c.a(12 + var2, var3 + 12, -106, 80, var5);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (((eg) this).field_w <= 25) {
                    break L7;
                  } else {
                    if (30 < ((eg) this).field_w) {
                      break L7;
                    } else {
                      ob.field_c.a(12 + var2, 12 + var3, -121, 64, var5);
                      break L7;
                    }
                  }
                }
                ((eg) this).field_q = ob.field_c;
                ((eg) this).field_A = var3;
                ((eg) this).field_y = var2;
                break L1;
              } else {
                if (var11 == 2) {
                  var11 = 0;
                  L8: while (true) {
                    if (10 <= var11) {
                      ((eg) this).field_A = var3;
                      ((eg) this).field_y = var2;
                      ((eg) this).field_q = ec.field_b;
                      break L1;
                    } else {
                      var6 = 6.28 * (double)var11 / 10.0 + (double)((eg) this).field_w;
                      ob.field_c.d(-6 + (var2 - -(int)(32.0 * Math.cos(var6) + 32.0)), -6 + (var3 - -(int)(32.0 + 32.0 * Math.sin(var6))), 12, 12, 255 - 10 * var11);
                      var11++;
                      continue L8;
                    }
                  }
                } else {
                  if (3 != var11) {
                    if (var11 == 4) {
                      this.a(32, 1, (byte) 62);
                      break L1;
                    } else {
                      if (5 == var11) {
                        this.a(40, 2, (byte) 62);
                        break L1;
                      } else {
                        if (var11 == 6) {
                          this.a(40, 4, (byte) 62);
                          break L1;
                        } else {
                          if (var11 != 7) {
                            if (8 == var11) {
                              this.a(32, 1, (byte) 62);
                              break L1;
                            } else {
                              if (var11 == 9) {
                                this.a(32, 2, (byte) 62);
                                break L1;
                              } else {
                                if (var11 == 10) {
                                  this.a(40, 3, (byte) 62);
                                  break L1;
                                } else {
                                  if (var11 == 11) {
                                    if (((eg) this).field_h != -1) {
                                      oc.field_b[3][29].d(var2, var3);
                                      ((eg) this).field_q = oc.field_b[3][29].c();
                                      ((eg) this).field_A = var3;
                                      ((eg) this).field_y = var2;
                                      break L1;
                                    } else {
                                      oc.field_b[3][29].e(var2, var3);
                                      ((eg) this).field_y = var2;
                                      ((eg) this).field_A = var3;
                                      ((eg) this).field_q = oc.field_b[3][29];
                                      break L1;
                                    }
                                  } else {
                                    if (var11 != 12) {
                                      if (var11 == 13) {
                                        this.a(32, 0, (byte) 62);
                                        break L1;
                                      } else {
                                        if (14 != var11) {
                                          if (var11 == 15) {
                                            this.a(40, 2, (byte) 62);
                                            break L1;
                                          } else {
                                            if (var11 != 16) {
                                              if (var11 != 17) {
                                                if (18 != var11) {
                                                  if (var11 == 19) {
                                                    L9: {
                                                      if (37 <= ((eg) this).field_n) {
                                                        break L9;
                                                      } else {
                                                        ((eg) this).field_n = 37;
                                                        break L9;
                                                      }
                                                    }
                                                    if (((eg) this).field_h != 1) {
                                                      oc.field_b[3][((eg) this).field_n].d(var2, var3);
                                                      ((eg) this).field_q = oc.field_b[3][((eg) this).field_n].c();
                                                      ((eg) this).field_y = var2;
                                                      ((eg) this).field_A = var3;
                                                      break L1;
                                                    } else {
                                                      oc.field_b[3][((eg) this).field_n].e(var2, var3);
                                                      ((eg) this).field_q = oc.field_b[3][((eg) this).field_n];
                                                      ((eg) this).field_A = var3;
                                                      ((eg) this).field_y = var2;
                                                      break L1;
                                                    }
                                                  } else {
                                                    if (var11 == 25) {
                                                      L10: {
                                                        if (((eg) this).field_n >= 36) {
                                                          break L10;
                                                        } else {
                                                          ((eg) this).field_n = 36;
                                                          break L10;
                                                        }
                                                      }
                                                      if (((eg) this).field_h != -1) {
                                                        oc.field_b[4][((eg) this).field_n].d(var2, var3);
                                                        ((eg) this).field_q = oc.field_b[4][((eg) this).field_n].c();
                                                        ((eg) this).field_A = var3;
                                                        ((eg) this).field_y = var2;
                                                        break L1;
                                                      } else {
                                                        oc.field_b[4][((eg) this).field_n].e(var2, var3);
                                                        ((eg) this).field_q = oc.field_b[4][((eg) this).field_n];
                                                        ((eg) this).field_y = var2;
                                                        ((eg) this).field_A = var3;
                                                        break L1;
                                                      }
                                                    } else {
                                                      if (var11 != 20) {
                                                        if (21 == var11) {
                                                          L11: {
                                                            if (0 <= ((eg) this).field_o) {
                                                              break L11;
                                                            } else {
                                                              ((eg) this).field_o = 0;
                                                              break L11;
                                                            }
                                                          }
                                                          L12: {
                                                            if (((eg) this).field_o > 7) {
                                                              ((eg) this).field_o = 7;
                                                              break L12;
                                                            } else {
                                                              break L12;
                                                            }
                                                          }
                                                          L13: {
                                                            L14: {
                                                              L15: {
                                                                if (((eg) this).field_o == 0) {
                                                                  break L15;
                                                                } else {
                                                                  if (((eg) this).field_o != 2) {
                                                                    break L14;
                                                                  } else {
                                                                    break L15;
                                                                  }
                                                                }
                                                              }
                                                              if (qh.field_l != 5) {
                                                                break L14;
                                                              } else {
                                                                if (ve.a((byte) 123, 0)) {
                                                                  jj.field_a[8].e(var2, var3);
                                                                  break L13;
                                                                } else {
                                                                  break L14;
                                                                }
                                                              }
                                                            }
                                                            jj.field_a[((eg) this).field_o].e(var2, var3);
                                                            break L13;
                                                          }
                                                          ((eg) this).field_q = jj.field_a[((eg) this).field_o];
                                                          ((eg) this).field_y = var2;
                                                          ((eg) this).field_A = var3;
                                                          break L1;
                                                        } else {
                                                          if (22 == var11) {
                                                            this.a(40, 0, (byte) 62);
                                                            break L1;
                                                          } else {
                                                            if (23 != var11) {
                                                              if (24 != var11) {
                                                                if (var11 != 26) {
                                                                  if (var11 != 27) {
                                                                    if (var11 == 28) {
                                                                      oc.field_b[4][36].e(var2, var3);
                                                                      ((eg) this).field_y = var2;
                                                                      ((eg) this).field_q = oc.field_b[4][36];
                                                                      ((eg) this).field_A = var3;
                                                                      break L1;
                                                                    } else {
                                                                      if (var11 == 29) {
                                                                        this.a(40, 0, (byte) 62);
                                                                        break L1;
                                                                      } else {
                                                                        if (var11 == 30) {
                                                                          this.a(40, 1, (byte) 62);
                                                                          break L1;
                                                                        } else {
                                                                          if (var11 != 31) {
                                                                            if (var11 != 32) {
                                                                              if (var11 != 33) {
                                                                                if (var11 == 34) {
                                                                                  if (-1 != ((eg) this).field_h) {
                                                                                    oc.field_b[0][37].d(var2, var3);
                                                                                    ((eg) this).field_q = oc.field_b[0][37].c();
                                                                                    ((eg) this).field_y = var2;
                                                                                    ((eg) this).field_A = var3;
                                                                                    break L1;
                                                                                  } else {
                                                                                    oc.field_b[0][37].e(var2, var3);
                                                                                    ((eg) this).field_q = oc.field_b[0][37];
                                                                                    ((eg) this).field_y = var2;
                                                                                    ((eg) this).field_A = var3;
                                                                                    break L1;
                                                                                  }
                                                                                } else {
                                                                                  L16: {
                                                                                    if (35 != var11) {
                                                                                      if (var11 != 42) {
                                                                                        if (var11 == 43) {
                                                                                          L17: {
                                                                                            var9 = 37;
                                                                                            if (((eg) this).field_w <= 2) {
                                                                                              break L17;
                                                                                            } else {
                                                                                              var9 = 36;
                                                                                              break L17;
                                                                                            }
                                                                                          }
                                                                                          L18: {
                                                                                            if (20 < ((eg) this).field_w) {
                                                                                              var9 = 35;
                                                                                              break L18;
                                                                                            } else {
                                                                                              break L18;
                                                                                            }
                                                                                          }
                                                                                          if (((eg) this).field_h == 1) {
                                                                                            oc.field_b[4][var9].e(var2, var3);
                                                                                            ((eg) this).field_q = oc.field_b[4][var9];
                                                                                            ((eg) this).field_y = var2;
                                                                                            ((eg) this).field_A = var3;
                                                                                            break L1;
                                                                                          } else {
                                                                                            oc.field_b[4][var9].d(var2, var3);
                                                                                            ((eg) this).field_q = oc.field_b[4][var9].c();
                                                                                            ((eg) this).field_y = var2;
                                                                                            ((eg) this).field_A = var3;
                                                                                            break L1;
                                                                                          }
                                                                                        } else {
                                                                                          if (var11 == 36) {
                                                                                            this.a(24, 0, (byte) 62);
                                                                                            break L1;
                                                                                          } else {
                                                                                            if (37 == var11) {
                                                                                              this.a(56, 1, (byte) 62);
                                                                                              break L1;
                                                                                            } else {
                                                                                              if (var11 != 38) {
                                                                                                if (var11 != 39) {
                                                                                                  if (var11 != 40) {
                                                                                                    if (var11 != 41) {
                                                                                                      if (var11 != 44) {
                                                                                                        if (var11 != 45) {
                                                                                                          break L1;
                                                                                                        } else {
                                                                                                          this.a(40, 4, (byte) 62);
                                                                                                          break L1;
                                                                                                        }
                                                                                                      } else {
                                                                                                        L19: {
                                                                                                          var10 = 0;
                                                                                                          if (((eg) this).field_o != 0) {
                                                                                                            break L19;
                                                                                                          } else {
                                                                                                            var10 = 10;
                                                                                                            break L19;
                                                                                                          }
                                                                                                        }
                                                                                                        L20: {
                                                                                                          if (((eg) this).field_o == 1) {
                                                                                                            var10 = 25;
                                                                                                            break L20;
                                                                                                          } else {
                                                                                                            break L20;
                                                                                                          }
                                                                                                        }
                                                                                                        L21: {
                                                                                                          if (((eg) this).field_o != 2) {
                                                                                                            break L21;
                                                                                                          } else {
                                                                                                            var10 = 50;
                                                                                                            break L21;
                                                                                                          }
                                                                                                        }
                                                                                                        L22: {
                                                                                                          if (((eg) this).field_o != 3) {
                                                                                                            break L22;
                                                                                                          } else {
                                                                                                            var10 = 75;
                                                                                                            break L22;
                                                                                                          }
                                                                                                        }
                                                                                                        L23: {
                                                                                                          if (4 != ((eg) this).field_o) {
                                                                                                            break L23;
                                                                                                          } else {
                                                                                                            var10 = 100;
                                                                                                            break L23;
                                                                                                          }
                                                                                                        }
                                                                                                        L24: {
                                                                                                          if (5 == ((eg) this).field_o) {
                                                                                                            var10 = 150;
                                                                                                            break L24;
                                                                                                          } else {
                                                                                                            break L24;
                                                                                                          }
                                                                                                        }
                                                                                                        L25: {
                                                                                                          if (((eg) this).field_o != 6) {
                                                                                                            break L25;
                                                                                                          } else {
                                                                                                            var10 = 250;
                                                                                                            break L25;
                                                                                                          }
                                                                                                        }
                                                                                                        L26: {
                                                                                                          if (((eg) this).field_o == 7) {
                                                                                                            var10 = 500;
                                                                                                            break L26;
                                                                                                          } else {
                                                                                                            break L26;
                                                                                                          }
                                                                                                        }
                                                                                                        a.field_a.b(Integer.toString(var10), 16 + var2, var3 - 1, 0, -1);
                                                                                                        a.field_a.b(Integer.toString(var10), 16 + var2, var3 - -1, 0, -1);
                                                                                                        a.field_a.b(Integer.toString(var10), var2 + 15, var3, 0, -1);
                                                                                                        a.field_a.b(Integer.toString(var10), 17 + var2, var3, 0, -1);
                                                                                                        a.field_a.b(Integer.toString(var10), var2 - -16, var3, 16777215, -1);
                                                                                                        break L1;
                                                                                                      }
                                                                                                    } else {
                                                                                                      if (((eg) this).field_h == -1) {
                                                                                                        h.field_j[((eg) this).field_n].e(var2, var3);
                                                                                                        ((eg) this).field_q = h.field_j[((eg) this).field_n];
                                                                                                        ((eg) this).field_A = var3;
                                                                                                        ((eg) this).field_y = var2;
                                                                                                        break L1;
                                                                                                      } else {
                                                                                                        h.field_j[((eg) this).field_n].d(var2, var3);
                                                                                                        ((eg) this).field_q = h.field_j[((eg) this).field_n].c();
                                                                                                        ((eg) this).field_A = var3;
                                                                                                        ((eg) this).field_y = var2;
                                                                                                        break L1;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.a(40, 4, (byte) 62);
                                                                                                    break L1;
                                                                                                  }
                                                                                                } else {
                                                                                                  this.a(40, 3, (byte) 62);
                                                                                                  break L1;
                                                                                                }
                                                                                              } else {
                                                                                                this.a(40, 2, (byte) 62);
                                                                                                break L1;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        break L16;
                                                                                      }
                                                                                    } else {
                                                                                      break L16;
                                                                                    }
                                                                                  }
                                                                                  L27: {
                                                                                    var9 = 37;
                                                                                    if (((eg) this).field_w <= 2) {
                                                                                      break L27;
                                                                                    } else {
                                                                                      var9 = 36;
                                                                                      break L27;
                                                                                    }
                                                                                  }
                                                                                  L28: {
                                                                                    if (((eg) this).field_w <= 20) {
                                                                                      break L28;
                                                                                    } else {
                                                                                      var9 = 35;
                                                                                      break L28;
                                                                                    }
                                                                                  }
                                                                                  if (-1 == ((eg) this).field_h) {
                                                                                    oc.field_b[1][var9].e(var2, var3);
                                                                                    ((eg) this).field_q = oc.field_b[1][var9];
                                                                                    ((eg) this).field_A = var3;
                                                                                    ((eg) this).field_y = var2;
                                                                                    break L1;
                                                                                  } else {
                                                                                    oc.field_b[1][var9].d(var2, var3);
                                                                                    ((eg) this).field_q = oc.field_b[1][var9].c();
                                                                                    ((eg) this).field_A = var3;
                                                                                    ((eg) this).field_y = var2;
                                                                                    break L1;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                ((eg) this).field_h = -((eg) this).field_h;
                                                                                this.a(56, 4, (byte) 62);
                                                                                ((eg) this).field_h = -((eg) this).field_h;
                                                                                break L1;
                                                                              }
                                                                            } else {
                                                                              this.a(56, 3, (byte) 62);
                                                                              break L1;
                                                                            }
                                                                          } else {
                                                                            this.a(56, 2, (byte) 62);
                                                                            break L1;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    oc.field_b[4][37].e(var2, var3);
                                                                    ((eg) this).field_A = var3;
                                                                    ((eg) this).field_y = var2;
                                                                    ((eg) this).field_q = oc.field_b[4][37];
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  this.a(96, 4, (byte) 62);
                                                                  break L1;
                                                                }
                                                              } else {
                                                                this.a(40, 2, (byte) 62);
                                                                break L1;
                                                              }
                                                            } else {
                                                              this.a(80, 1, (byte) 62);
                                                              break L1;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        L29: {
                                                          ((eg) this).field_w = ((eg) this).field_w + 2;
                                                          var8 = ((eg) this).field_w;
                                                          var4 = -((eg) this).field_w + 128;
                                                          if (var4 <= 0) {
                                                            break L29;
                                                          } else {
                                                            rk.field_m.d(var2 + -var8, var3 - var8, 2 * var8, var8 * 2, var4);
                                                            break L29;
                                                          }
                                                        }
                                                        if (((eg) this).field_w <= 120) {
                                                          break L2;
                                                        } else {
                                                          ((eg) this).field_k = 1;
                                                          break L1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  L30: {
                                                    if (((eg) this).field_n < 34) {
                                                      ((eg) this).field_n = 34;
                                                      break L30;
                                                    } else {
                                                      break L30;
                                                    }
                                                  }
                                                  if (((eg) this).field_h == 1) {
                                                    oc.field_b[2][((eg) this).field_n].e(var2, var3);
                                                    ((eg) this).field_q = oc.field_b[2][((eg) this).field_n];
                                                    ((eg) this).field_y = var2;
                                                    ((eg) this).field_A = var3;
                                                    break L1;
                                                  } else {
                                                    oc.field_b[2][((eg) this).field_n].d(var2 + -24, var3);
                                                    ((eg) this).field_q = oc.field_b[2][((eg) this).field_n].c();
                                                    ((eg) this).field_y = -24 + var2;
                                                    ((eg) this).field_A = var3;
                                                    break L1;
                                                  }
                                                }
                                              } else {
                                                this.a(80, 4, (byte) 62);
                                                break L1;
                                              }
                                            } else {
                                              this.a(40, 3, (byte) 62);
                                              break L1;
                                            }
                                          }
                                        } else {
                                          ((eg) this).field_h = -((eg) this).field_h;
                                          this.a(40, 1, (byte) 62);
                                          ((eg) this).field_h = -((eg) this).field_h;
                                          break L1;
                                        }
                                      }
                                    } else {
                                      ((eg) this).field_h = -((eg) this).field_h;
                                      this.a(40, 4, (byte) 62);
                                      ((eg) this).field_h = -((eg) this).field_h;
                                      break L1;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            this.a(40, 0, (byte) 62);
                            break L1;
                          }
                        }
                      }
                    }
                  } else {
                    this.a(32, 0, (byte) 62);
                    break L1;
                  }
                }
              }
            } else {
              if (0 > qh.field_g) {
                break L2;
              } else {
                if (!pg.field_q) {
                  L31: {
                    if (((eg) this).field_h == -1) {
                      ve.field_c[((eg) this).field_n].e(var2, var3);
                      ((eg) this).field_q = ra.field_m[((eg) this).field_n];
                      ((eg) this).field_y = var2;
                      ((eg) this).field_A = var3;
                      break L31;
                    } else {
                      ve.field_c[((eg) this).field_n].d(var2, var3);
                      ((eg) this).field_q = ra.field_m[((eg) this).field_n].c();
                      ((eg) this).field_A = var3;
                      ((eg) this).field_y = var2;
                      break L31;
                    }
                  }
                  L32: {
                    if (0 > nk.field_T) {
                      break L32;
                    } else {
                      if (300 <= nk.field_T) {
                        break L32;
                      } else {
                        if (250 >= sj.field_l) {
                          break L32;
                        } else {
                          L33: {
                            if (nk.field_T < 0) {
                              break L33;
                            } else {
                              if (nk.field_T < 50) {
                                L34: {
                                  stackOut_84_0 = this;
                                  stackIn_86_0 = stackOut_84_0;
                                  stackIn_85_0 = stackOut_84_0;
                                  if (uc.field_g < 20) {
                                    stackOut_86_0 = this;
                                    stackOut_86_1 = 16711680;
                                    stackIn_87_0 = stackOut_86_0;
                                    stackIn_87_1 = stackOut_86_1;
                                    break L34;
                                  } else {
                                    stackOut_85_0 = this;
                                    stackOut_85_1 = 16776960;
                                    stackIn_87_0 = stackOut_85_0;
                                    stackIn_87_1 = stackOut_85_1;
                                    break L34;
                                  }
                                }
                                L35: {
                                  this.a(stackIn_87_1, var2, true, "(", 32 + var3);
                                  stackOut_87_0 = this;
                                  stackIn_89_0 = stackOut_87_0;
                                  stackIn_88_0 = stackOut_87_0;
                                  if (uc.field_g < 20) {
                                    stackOut_89_0 = this;
                                    stackOut_89_1 = 16711680;
                                    stackIn_90_0 = stackOut_89_0;
                                    stackIn_90_1 = stackOut_89_1;
                                    break L35;
                                  } else {
                                    stackOut_88_0 = this;
                                    stackOut_88_1 = 16776960;
                                    stackIn_90_0 = stackOut_88_0;
                                    stackIn_90_1 = stackOut_88_1;
                                    break L35;
                                  }
                                }
                                this.a(stackIn_90_1, ve.field_c[((eg) this).field_n].field_x + var2, true, ")", 32 + var3);
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                          }
                          L36: {
                            if (nk.field_T < 50) {
                              break L36;
                            } else {
                              if (nk.field_T < 100) {
                                L37: {
                                  var11 = jj.field_b.b(di.a(new String[2], (byte) 126, ka.field_g));
                                  var12 = var2 - -(ve.field_c[((eg) this).field_n].field_x / 2);
                                  if (var12 < var11 / 2) {
                                    var12 = var11 / 2;
                                    break L37;
                                  } else {
                                    break L37;
                                  }
                                }
                                L38: {
                                  if (var12 > 640 + -(var11 / 2)) {
                                    var12 = -(var11 / 2) + 640;
                                    break L38;
                                  } else {
                                    break L38;
                                  }
                                }
                                L39: {
                                  stackOut_100_0 = this;
                                  stackIn_102_0 = stackOut_100_0;
                                  stackIn_101_0 = stackOut_100_0;
                                  if (uc.field_g < 20) {
                                    stackOut_102_0 = this;
                                    stackOut_102_1 = 16711680;
                                    stackIn_103_0 = stackOut_102_0;
                                    stackIn_103_1 = stackOut_102_1;
                                    break L39;
                                  } else {
                                    stackOut_101_0 = this;
                                    stackOut_101_1 = 16776960;
                                    stackIn_103_0 = stackOut_101_0;
                                    stackIn_103_1 = stackOut_101_1;
                                    break L39;
                                  }
                                }
                                this.a(stackIn_103_1, var12, true, di.a(new String[2], (byte) 107, ka.field_g), -4 + var3);
                                break L36;
                              } else {
                                break L36;
                              }
                            }
                          }
                          L40: {
                            if (nk.field_T < 100) {
                              break L40;
                            } else {
                              if (nk.field_T < 150) {
                                L41: {
                                  var11 = jj.field_b.b(di.a(new String[2], (byte) 59, wb.field_a));
                                  var12 = var2 + ve.field_c[((eg) this).field_n].field_x / 2;
                                  if (~(var11 / 2) >= ~var12) {
                                    break L41;
                                  } else {
                                    var12 = var11 / 2;
                                    break L41;
                                  }
                                }
                                L42: {
                                  if (~var12 < ~(-(var11 / 2) + 640)) {
                                    var12 = -(var11 / 2) + 640;
                                    break L42;
                                  } else {
                                    break L42;
                                  }
                                }
                                L43: {
                                  stackOut_112_0 = this;
                                  stackIn_114_0 = stackOut_112_0;
                                  stackIn_113_0 = stackOut_112_0;
                                  if (uc.field_g >= 20) {
                                    stackOut_114_0 = this;
                                    stackOut_114_1 = 16776960;
                                    stackIn_115_0 = stackOut_114_0;
                                    stackIn_115_1 = stackOut_114_1;
                                    break L43;
                                  } else {
                                    stackOut_113_0 = this;
                                    stackOut_113_1 = 16711680;
                                    stackIn_115_0 = stackOut_113_0;
                                    stackIn_115_1 = stackOut_113_1;
                                    break L43;
                                  }
                                }
                                this.a(stackIn_115_1, var12, true, di.a(new String[2], (byte) 61, wb.field_a), var3 - 4);
                                break L40;
                              } else {
                                break L40;
                              }
                            }
                          }
                          if (nk.field_T < 150) {
                            break L32;
                          } else {
                            if (nk.field_T >= 200) {
                              break L32;
                            } else {
                              L44: {
                                var11 = jj.field_b.b(di.a(new String[2], (byte) 66, ei.field_m));
                                var12 = var2 - -(ve.field_c[((eg) this).field_n].field_x / 2);
                                if (~(var11 / 2) >= ~var12) {
                                  break L44;
                                } else {
                                  var12 = var11 / 2;
                                  break L44;
                                }
                              }
                              L45: {
                                if (~(-(var11 / 2) + 640) <= ~var12) {
                                  break L45;
                                } else {
                                  var12 = -(var11 / 2) + 640;
                                  break L45;
                                }
                              }
                              L46: {
                                stackOut_122_0 = this;
                                stackIn_124_0 = stackOut_122_0;
                                stackIn_123_0 = stackOut_122_0;
                                if (20 > uc.field_g) {
                                  stackOut_124_0 = this;
                                  stackOut_124_1 = 16711680;
                                  stackIn_125_0 = stackOut_124_0;
                                  stackIn_125_1 = stackOut_124_1;
                                  break L46;
                                } else {
                                  stackOut_123_0 = this;
                                  stackOut_123_1 = 16776960;
                                  stackIn_125_0 = stackOut_123_0;
                                  stackIn_125_1 = stackOut_123_1;
                                  break L46;
                                }
                              }
                              this.a(stackIn_125_1, var12, true, di.a(new String[2], (byte) 46, ei.field_m), -4 + var3);
                              break L32;
                            }
                          }
                        }
                      }
                    }
                  }
                  L47: {
                    if (cd.field_e <= 0) {
                      break L47;
                    } else {
                      if (7 <= cd.field_e % 10) {
                        break L47;
                      } else {
                        if (1 < cd.field_e % 10) {
                          if (((eg) this).field_h != -1) {
                            ve.field_c[((eg) this).field_n].c().b(var2, var3, 16777215);
                            break L47;
                          } else {
                            ve.field_c[((eg) this).field_n].b(var2, var3, 16777215);
                            break L47;
                          }
                        } else {
                          break L47;
                        }
                      }
                    }
                  }
                  if (120 <= fi.field_x) {
                    break L2;
                  } else {
                    var4 = 256 * fi.field_x / 120;
                    var11_double = 0.0;
                    var13 = 0;
                    L48: while (true) {
                      if (var13 >= 5) {
                        break L2;
                      } else {
                        L49: {
                          var11_double = (double)fi.field_x + 6.28 * (double)var13 / 5.0;
                          var14 = 32;
                          if (100 >= fi.field_x) {
                            break L49;
                          } else {
                            var14 = var14 + (10 - Math.abs(-110 + fi.field_x));
                            break L49;
                          }
                        }
                        ob.field_c.d(-6 + var2 + (int)(Math.cos(var11_double) * (double)var14 + 32.0), -6 + ((int)(32.0 + Math.sin(var11_double) * (double)var14) + var3), 12, 12, var4);
                        var13++;
                        continue L48;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
          }
          break L1;
        }
    }

    private final void c(int param0) {
        tl.field_a.a(si.field_j[10], 100, ee.field_p * 256 / 100);
        if (param0 != 1) {
            Object var3 = null;
            this.a(-123, (byte) -40, (tg) null, true);
        }
    }

    private final boolean a(boolean param0, tg param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_22_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        try {
          L0: {
            L1: {
              ((eg) this).field_z = ((eg) this).field_z + 1;
              ((eg) this).field_n = param2;
              if (((eg) this).field_s <= 0) {
                break L1;
              } else {
                if (!param0) {
                  L2: {
                    ((eg) this).field_s = ((eg) this).field_s - 1;
                    ((eg) this).field_p = ((eg) this).field_p - 1;
                    if (((eg) this).field_p > 0) {
                      if (!pk.field_s) {
                        break L2;
                      } else {
                        if (!param0) {
                          this.c(param2 ^ 24);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      if (!pk.field_s) {
                        break L2;
                      } else {
                        if (!param0) {
                          int discarded$1 = 0;
                          this.c();
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  if (0 < ((eg) this).field_p) {
                    break L1;
                  } else {
                    ((eg) this).field_e = 60;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            if (param0) {
              L3: {
                if (((eg) this).field_z <= 15) {
                  break L3;
                } else {
                  ((eg) this).field_n = 26;
                  break L3;
                }
              }
              L4: {
                if (((eg) this).field_z <= 30) {
                  break L4;
                } else {
                  ((eg) this).field_n = 27;
                  break L4;
                }
              }
              L5: {
                if (((eg) this).field_z <= 40) {
                  break L5;
                } else {
                  ((eg) this).field_n = 28;
                  break L5;
                }
              }
              L6: {
                if (((eg) this).field_z > 50) {
                  ((eg) this).field_z = 0;
                  ((eg) this).field_x = 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (((eg) this).field_z == 40) {
                stackOut_34_0 = 1;
                stackIn_35_0 = stackOut_34_0;
                return stackIn_35_0 != 0;
              } else {
                return false;
              }
            } else {
              L7: {
                if (((eg) this).field_z > 35) {
                  ((eg) this).field_n = 26;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (((eg) this).field_z <= 50) {
                  break L8;
                } else {
                  ((eg) this).field_x = 0;
                  ((eg) this).field_z = 0;
                  break L8;
                }
              }
              if (((eg) this).field_z != 35) {
                stackOut_36_0 = 0;
                stackIn_37_0 = stackOut_36_0;
                break L0;
              } else {
                stackOut_21_0 = 1;
                stackIn_22_0 = stackOut_21_0;
                return stackIn_22_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var4;
            stackOut_38_1 = new StringBuilder().append("eg.AA(").append(param0).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L9;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L9;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + param2 + 41);
        }
        return stackIn_37_0 != 0;
    }

    private final void a(int param0, byte param1, tg param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        ob var7 = null;
        ob var8 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (0 <= ((eg) this).field_e) {
                L2: {
                  L3: {
                    ((eg) this).field_e = ((eg) this).field_e + 3;
                    var7 = new ob(((eg) this).field_i);
                    var8 = var7;
                    var8.field_a = var8.field_a + 1;
                    if (param2.field_f[var7.a((byte) -68)] == 1) {
                      break L3;
                    } else {
                      if (var8.field_a < 14) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ((eg) this).field_e = -Math.abs(((eg) this).field_e);
                  break L2;
                }
                if (((eg) this).field_e > 20) {
                  ((eg) this).field_e = 5;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                if (((eg) this).field_e < -20) {
                  ((eg) this).field_e = -5;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L4: {
              var5_int = 64 % ((param1 - 58) / 56);
              int fieldTemp$2 = ((eg) this).field_z;
              ((eg) this).field_z = ((eg) this).field_z - 1;
              if (0 < fieldTemp$2) {
                break L4;
              } else {
                L5: {
                  ((eg) this).field_o = ((eg) this).field_o + 1;
                  ((eg) this).field_z = 5;
                  if (1 < ((eg) this).field_o) {
                    ((eg) this).field_o = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  ((eg) this).field_n = ((eg) this).field_n + 1;
                  if (param3) {
                    ((eg) this).field_z = 5;
                    if (9 < ((eg) this).field_n) {
                      ((eg) this).field_n = 2;
                      break L6;
                    } else {
                      break L6;
                    }
                  } else {
                    if (5 < ((eg) this).field_n) {
                      ((eg) this).field_n = 2;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                if (((eg) this).field_n >= 2) {
                  break L4;
                } else {
                  ((eg) this).field_n = 2;
                  break L4;
                }
              }
            }
            L7: {
              if (((eg) this).field_e == 0) {
                ((eg) this).field_e = 20;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              L9: {
                ((eg) this).a(1, si.field_j, param2, 1, param0, 1, tl.field_a, pk.field_s, (byte) 127);
                if (((eg) this).field_s <= 0) {
                  break L9;
                } else {
                  if (param3) {
                    break L9;
                  } else {
                    L10: {
                      ((eg) this).field_s = ((eg) this).field_s - 1;
                      ((eg) this).field_p = ((eg) this).field_p - 1;
                      if (0 >= ((eg) this).field_p) {
                        if (!pk.field_s) {
                          break L10;
                        } else {
                          if (!param3) {
                            int discarded$3 = 0;
                            this.c();
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      } else {
                        if (!pk.field_s) {
                          break L10;
                        } else {
                          if (param3) {
                            break L10;
                          } else {
                            this.c(1);
                            break L10;
                          }
                        }
                      }
                    }
                    if (((eg) this).field_p > 0) {
                      break L9;
                    } else {
                      ((eg) this).field_e = 60;
                      break L8;
                    }
                  }
                }
              }
              break L8;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var5;
            stackOut_41_1 = new StringBuilder().append("eg.K(").append(param0).append(44).append(param1).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L11;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L11;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + param3 + 41);
        }
    }

    private final void a(int param0, tg param1) {
        ((eg) this).field_e = ((eg) this).field_e + 1;
        ((eg) this).field_w = ((eg) this).field_w + 1;
        if (!(((eg) this).field_w <= 1000)) {
            ((eg) this).field_w = 0;
            ((eg) this).field_r = 0;
            if (!(!pk.field_s)) {
                tl.field_a.a(si.field_j[6], 100, ee.field_p * 256 / 100);
            }
        }
        ((eg) this).a(1, si.field_j, param1, 1, 5, 1, tl.field_a, pk.field_s, (byte) -57);
        if (1 == ((eg) this).b(param1, -4)) {
            if (!(((eg) this).field_f.field_a != 0)) {
                ((eg) this).field_e = 20;
                if (pk.field_s) {
                    tl.field_a.a(si.field_j[2], 100, ee.field_p * 64 / 100);
                }
            }
        }
        ((eg) this).field_n = 31;
        ((eg) this).field_o = 7;
        if (param0 <= 13) {
            return;
        }
        try {
            int discarded$0 = 5;
            this.b();
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "eg.S(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void e() {
        ob var4 = null;
        ob var2 = null;
        ob var3 = null;
        if (0 == ii.field_e[0].field_s) {
            if (((eg) this).field_q != null) {
                if (ii.field_e[0].field_q != null) {
                    var4 = new ob();
                    var2 = var4;
                    var3 = new ob();
                    var2.field_b = ((eg) this).field_y;
                    var4.field_a = ((eg) this).field_A;
                    var3.field_b = ii.field_e[0].field_y;
                    var3.field_a = ii.field_e[0].field_A;
                    if (j.a(((eg) this).field_q, var2.field_b, var4.field_a, ii.field_e[0].field_q, var3.field_b, var3.field_a)) {
                        ii.field_e[0].field_s = 1;
                    }
                }
            }
        }
    }

    private final void c() {
        Object var3 = null;
        ol.field_e = true;
        if (3 == ((eg) this).field_B) {
          tl.field_a.a(nl.field_q[3], 100, ee.field_p * 256 / 100);
          return;
        } else {
          if (((eg) this).field_B != 4) {
            if (5 == ((eg) this).field_B) {
              tl.field_a.a(nl.field_q[5], 100, ee.field_p * 256 / 100);
              return;
            } else {
              if (((eg) this).field_B == 6) {
                tl.field_a.a(nl.field_q[7], 100, ee.field_p * 256 / 100);
                return;
              } else {
                if (((eg) this).field_B != 8) {
                  if (((eg) this).field_B != 7) {
                    if (((eg) this).field_B == 9) {
                      tl.field_a.a(nl.field_q[10], 100, 256 * ee.field_p / 100);
                      return;
                    } else {
                      if (((eg) this).field_B == 10) {
                        tl.field_a.a(nl.field_q[11], 100, 256 * ee.field_p / 100);
                        return;
                      } else {
                        if (((eg) this).field_B != 12) {
                          if (-15 == ((eg) this).field_B) {
                            tl.field_a.a(nl.field_q[14], 100, ee.field_p * 256 / 100);
                            return;
                          } else {
                            if (-14 != ((eg) this).field_B) {
                              if (((eg) this).field_B != 15) {
                                if (((eg) this).field_B == 16) {
                                  tl.field_a.a(nl.field_q[19], 100, ee.field_p * 256 / 100);
                                  return;
                                } else {
                                  if (((eg) this).field_B != 17) {
                                    if (22 != ((eg) this).field_B) {
                                      if (((eg) this).field_B != 24) {
                                        if (((eg) this).field_B == 23) {
                                          tl.field_a.a(nl.field_q[24], 100, ee.field_p * 256 / 100);
                                          return;
                                        } else {
                                          if (26 == ((eg) this).field_B) {
                                            tl.field_a.a(nl.field_q[26], 100, ee.field_p * 256 / 100);
                                            return;
                                          } else {
                                            if (((eg) this).field_B != 29) {
                                              if (31 != ((eg) this).field_B) {
                                                if (30 == ((eg) this).field_B) {
                                                  tl.field_a.a(nl.field_q[29], 100, 256 * ee.field_p / 100);
                                                  return;
                                                } else {
                                                  if (((eg) this).field_B == 32) {
                                                    tl.field_a.a(nl.field_q[30], 100, 256 * ee.field_p / 100);
                                                    return;
                                                  } else {
                                                    if (((eg) this).field_B != 33) {
                                                      if (((eg) this).field_B == 36) {
                                                        tl.field_a.a(nl.field_q[32], 100, 256 * ee.field_p / 100);
                                                        return;
                                                      } else {
                                                        var3 = null;
                                                        this.a(-17, 111, false, (String) null, 55);
                                                        if (((eg) this).field_B != 38) {
                                                          if (((eg) this).field_B == 37) {
                                                            tl.field_a.a(nl.field_q[34], 100, ee.field_p * 256 / 100);
                                                            return;
                                                          } else {
                                                            if (39 == ((eg) this).field_B) {
                                                              tl.field_a.a(nl.field_q[35], 100, ee.field_p * 256 / 100);
                                                              return;
                                                            } else {
                                                              if (((eg) this).field_B == 40) {
                                                                tl.field_a.a(nl.field_q[37], 100, 256 * ee.field_p / 100);
                                                                return;
                                                              } else {
                                                                tl.field_a.a(si.field_j[9], 100, ee.field_p * 256 / 100);
                                                                return;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          tl.field_a.a(nl.field_q[33], 100, ee.field_p * 256 / 100);
                                                          return;
                                                        }
                                                      }
                                                    } else {
                                                      tl.field_a.a(nl.field_q[31], 100, 256 * ee.field_p / 100);
                                                      return;
                                                    }
                                                  }
                                                }
                                              } else {
                                                tl.field_a.a(nl.field_q[28], 100, ee.field_p * 256 / 100);
                                                return;
                                              }
                                            } else {
                                              tl.field_a.a(nl.field_q[27], 100, 256 * ee.field_p / 100);
                                              return;
                                            }
                                          }
                                        }
                                      } else {
                                        tl.field_a.a(nl.field_q[23], 100, 256 * ee.field_p / 100);
                                        return;
                                      }
                                    } else {
                                      tl.field_a.a(nl.field_q[22], 100, ee.field_p * 256 / 100);
                                      return;
                                    }
                                  } else {
                                    tl.field_a.a(nl.field_q[21], 100, 256 * ee.field_p / 100);
                                    return;
                                  }
                                }
                              } else {
                                tl.field_a.a(nl.field_q[16], 100, 256 * ee.field_p / 100);
                                return;
                              }
                            } else {
                              tl.field_a.a(nl.field_q[15], 100, 256 * ee.field_p / 100);
                              return;
                            }
                          }
                        } else {
                          tl.field_a.a(nl.field_q[13], 100, ee.field_p * 256 / 100);
                          return;
                        }
                      }
                    }
                  } else {
                    tl.field_a.a(nl.field_q[9], 100, 256 * ee.field_p / 100);
                    return;
                  }
                } else {
                  tl.field_a.a(nl.field_q[8], 100, 256 * ee.field_p / 100);
                  return;
                }
              }
            }
          } else {
            tl.field_a.a(nl.field_q[4], 100, ee.field_p * 256 / 100);
            return;
          }
        }
    }

    final void a(byte param0, tg param1) {
        int var3_int = 0;
        int var4 = 0;
        eg var4_ref_eg = null;
        int var7 = 0;
        ob var8 = null;
        ob var9 = null;
        ob var10 = null;
        ob var11 = null;
        int stackIn_81_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_182_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_231_0 = 0;
        int stackIn_232_0 = 0;
        int stackIn_232_1 = 0;
        Object stackIn_257_0 = null;
        int stackIn_257_1 = 0;
        Object stackIn_258_0 = null;
        int stackIn_258_1 = 0;
        Object stackIn_259_0 = null;
        int stackIn_259_1 = 0;
        Object stackIn_260_0 = null;
        int stackIn_260_1 = 0;
        int stackIn_260_2 = 0;
        int stackIn_378_0 = 0;
        int stackIn_415_0 = 0;
        int stackIn_431_0 = 0;
        Object stackIn_478_0 = null;
        Object stackIn_479_0 = null;
        Object stackIn_480_0 = null;
        int stackIn_480_1 = 0;
        int stackIn_506_0 = 0;
        Object stackIn_520_0 = null;
        Object stackIn_521_0 = null;
        Object stackIn_522_0 = null;
        int stackIn_522_1 = 0;
        Object stackIn_524_0 = null;
        Object stackIn_525_0 = null;
        Object stackIn_526_0 = null;
        int stackIn_526_1 = 0;
        int stackIn_545_0 = 0;
        Object stackIn_559_0 = null;
        Object stackIn_560_0 = null;
        Object stackIn_561_0 = null;
        int stackIn_561_1 = 0;
        Object stackIn_627_0 = null;
        Object stackIn_628_0 = null;
        Object stackIn_629_0 = null;
        int stackIn_629_1 = 0;
        Object stackIn_685_0 = null;
        Object stackIn_686_0 = null;
        Object stackIn_687_0 = null;
        int stackIn_687_1 = 0;
        int stackIn_743_0 = 0;
        int stackIn_744_0 = 0;
        int stackIn_745_0 = 0;
        int stackIn_745_1 = 0;
        int stackIn_755_0 = 0;
        int stackIn_779_0 = 0;
        int stackIn_788_0 = 0;
        Object stackIn_802_0 = null;
        Object stackIn_803_0 = null;
        Object stackIn_804_0 = null;
        int stackIn_804_1 = 0;
        Object stackIn_840_0 = null;
        Object stackIn_841_0 = null;
        Object stackIn_842_0 = null;
        int stackIn_842_1 = 0;
        Object stackIn_844_0 = null;
        Object stackIn_845_0 = null;
        Object stackIn_846_0 = null;
        int stackIn_846_1 = 0;
        int stackIn_866_0 = 0;
        int stackIn_867_0 = 0;
        int stackIn_868_0 = 0;
        int stackIn_868_1 = 0;
        Object stackIn_941_0 = null;
        Object stackIn_942_0 = null;
        Object stackIn_943_0 = null;
        int stackIn_943_1 = 0;
        int stackIn_970_0 = 0;
        int stackIn_971_0 = 0;
        int stackIn_972_0 = 0;
        int stackIn_972_1 = 0;
        Object stackIn_1012_0 = null;
        Object stackIn_1013_0 = null;
        Object stackIn_1014_0 = null;
        int stackIn_1014_1 = 0;
        Object stackIn_1040_0 = null;
        Object stackIn_1041_0 = null;
        Object stackIn_1042_0 = null;
        int stackIn_1042_1 = 0;
        Object stackIn_1126_0 = null;
        Object stackIn_1127_0 = null;
        Object stackIn_1128_0 = null;
        int stackIn_1128_1 = 0;
        int stackIn_1154_0 = 0;
        int stackIn_1155_0 = 0;
        int stackIn_1156_0 = 0;
        int stackIn_1156_1 = 0;
        Object stackIn_1194_0 = null;
        Object stackIn_1195_0 = null;
        Object stackIn_1196_0 = null;
        int stackIn_1196_1 = 0;
        int stackIn_1197_0 = 0;
        int stackIn_1198_0 = 0;
        int stackIn_1199_0 = 0;
        int stackIn_1199_1 = 0;
        int stackIn_1209_0 = 0;
        int stackIn_1210_0 = 0;
        int stackIn_1211_0 = 0;
        int stackIn_1211_1 = 0;
        int stackOut_181_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_193_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_231_1 = 0;
        int stackOut_230_0 = 0;
        int stackOut_230_1 = 0;
        int stackOut_430_0 = 0;
        int stackOut_429_0 = 0;
        int stackOut_505_0 = 0;
        int stackOut_504_0 = 0;
        Object stackOut_519_0 = null;
        Object stackOut_521_0 = null;
        int stackOut_521_1 = 0;
        Object stackOut_520_0 = null;
        int stackOut_520_1 = 0;
        Object stackOut_523_0 = null;
        Object stackOut_525_0 = null;
        int stackOut_525_1 = 0;
        Object stackOut_524_0 = null;
        int stackOut_524_1 = 0;
        int stackOut_544_0 = 0;
        int stackOut_543_0 = 0;
        Object stackOut_558_0 = null;
        Object stackOut_560_0 = null;
        int stackOut_560_1 = 0;
        Object stackOut_559_0 = null;
        int stackOut_559_1 = 0;
        Object stackOut_626_0 = null;
        Object stackOut_628_0 = null;
        int stackOut_628_1 = 0;
        Object stackOut_627_0 = null;
        int stackOut_627_1 = 0;
        Object stackOut_839_0 = null;
        Object stackOut_841_0 = null;
        int stackOut_841_1 = 0;
        Object stackOut_840_0 = null;
        int stackOut_840_1 = 0;
        Object stackOut_843_0 = null;
        Object stackOut_845_0 = null;
        int stackOut_845_1 = 0;
        Object stackOut_844_0 = null;
        int stackOut_844_1 = 0;
        int stackOut_865_0 = 0;
        int stackOut_867_0 = 0;
        int stackOut_867_1 = 0;
        int stackOut_866_0 = 0;
        int stackOut_866_1 = 0;
        Object stackOut_1011_0 = null;
        Object stackOut_1013_0 = null;
        int stackOut_1013_1 = 0;
        Object stackOut_1012_0 = null;
        int stackOut_1012_1 = 0;
        Object stackOut_1125_0 = null;
        Object stackOut_1127_0 = null;
        int stackOut_1127_1 = 0;
        Object stackOut_1126_0 = null;
        int stackOut_1126_1 = 0;
        int stackOut_1153_0 = 0;
        int stackOut_1155_0 = 0;
        int stackOut_1155_1 = 0;
        int stackOut_1154_0 = 0;
        int stackOut_1154_1 = 0;
        int stackOut_1208_0 = 0;
        int stackOut_1210_0 = 0;
        int stackOut_1210_1 = 0;
        int stackOut_1209_0 = 0;
        int stackOut_1209_1 = 0;
        Object stackOut_1193_0 = null;
        Object stackOut_1195_0 = null;
        int stackOut_1195_1 = 0;
        Object stackOut_1194_0 = null;
        int stackOut_1194_1 = 0;
        int stackOut_1196_0 = 0;
        int stackOut_1198_0 = 0;
        int stackOut_1198_1 = 0;
        int stackOut_1197_0 = 0;
        int stackOut_1197_1 = 0;
        Object stackOut_1039_0 = null;
        Object stackOut_1041_0 = null;
        int stackOut_1041_1 = 0;
        Object stackOut_1040_0 = null;
        int stackOut_1040_1 = 0;
        int stackOut_969_0 = 0;
        int stackOut_971_0 = 0;
        int stackOut_971_1 = 0;
        int stackOut_970_0 = 0;
        int stackOut_970_1 = 0;
        Object stackOut_940_0 = null;
        Object stackOut_942_0 = null;
        int stackOut_942_1 = 0;
        Object stackOut_941_0 = null;
        int stackOut_941_1 = 0;
        Object stackOut_801_0 = null;
        Object stackOut_803_0 = null;
        int stackOut_803_1 = 0;
        Object stackOut_802_0 = null;
        int stackOut_802_1 = 0;
        int stackOut_787_0 = 0;
        int stackOut_786_0 = 0;
        int stackOut_778_0 = 0;
        int stackOut_777_0 = 0;
        int stackOut_742_0 = 0;
        int stackOut_744_0 = 0;
        int stackOut_744_1 = 0;
        int stackOut_743_0 = 0;
        int stackOut_743_1 = 0;
        int stackOut_754_0 = 0;
        int stackOut_753_0 = 0;
        Object stackOut_684_0 = null;
        Object stackOut_686_0 = null;
        int stackOut_686_1 = 0;
        Object stackOut_685_0 = null;
        int stackOut_685_1 = 0;
        Object stackOut_477_0 = null;
        Object stackOut_479_0 = null;
        int stackOut_479_1 = 0;
        Object stackOut_478_0 = null;
        int stackOut_478_1 = 0;
        int stackOut_414_0 = 0;
        int stackOut_413_0 = 0;
        int stackOut_377_0 = 0;
        int stackOut_376_0 = 0;
        Object stackOut_256_0 = null;
        int stackOut_256_1 = 0;
        Object stackOut_257_0 = null;
        int stackOut_257_1 = 0;
        Object stackOut_258_0 = null;
        int stackOut_258_1 = 0;
        int stackOut_258_2 = 0;
        Object stackOut_259_0 = null;
        int stackOut_259_1 = 0;
        int stackOut_259_2 = 0;
        L0: {
          var7 = wizardrun.field_H;
          if (17 >= ((eg) this).field_i.field_a) {
            break L0;
          } else {
            ((eg) this).field_i.field_a = -2;
            break L0;
          }
        }
        L1: {
          if (((eg) this).field_i.field_a >= -2) {
            break L1;
          } else {
            ((eg) this).field_i.field_a = 17;
            break L1;
          }
        }
        L2: {
          var3_int = 15;
          var4 = ((eg) this).field_B;
          if (var4 == 0) {
            L3: {
              if (cd.field_e > 0) {
                cd.field_e = cd.field_e - 1;
                ((eg) this).field_s = 0;
                break L3;
              } else {
                break L3;
              }
            }
            if (0 == ((eg) this).field_s) {
              L4: {
                var3_int = 0;
                if (sc.field_m.field_b == 1) {
                  var3_int = 30;
                  ((eg) this).field_h = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (sc.field_m.field_b != -1) {
                  break L5;
                } else {
                  var3_int = 30;
                  ((eg) this).field_h = -1;
                  break L5;
                }
              }
              L6: {
                if (sc.field_m.field_f) {
                  if (0 != ((eg) this).field_f.field_a) {
                    break L6;
                  } else {
                    if (((eg) this).b(param1, param0 + 119) != 1) {
                      break L6;
                    } else {
                      ((eg) this).field_e = 70;
                      if (!pk.field_s) {
                        break L6;
                      } else {
                        tl.field_a.a(si.field_j[3], 100, ee.field_p * 256 / 100);
                        break L6;
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                ((eg) this).field_f.field_b = ((eg) this).field_f.field_b + 120;
                ((eg) this).field_d = ((eg) this).field_d / 2;
                ((eg) this).a((byte) 114);
                if (0 != var3_int) {
                  L8: {
                    ((eg) this).field_w = ((eg) this).field_w - 1;
                    int fieldTemp$87 = ((eg) this).field_z;
                    ((eg) this).field_z = ((eg) this).field_z - 1;
                    if (0 > fieldTemp$87) {
                      ((eg) this).field_z = 5;
                      ((eg) this).field_n = ((eg) this).field_n + 1;
                      if (((eg) this).field_n <= 3) {
                        break L8;
                      } else {
                        ((eg) this).field_n = 0;
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (0 > ((eg) this).field_w) {
                      ((eg) this).field_o = ((eg) this).field_o + 1;
                      ((eg) this).field_w = 10;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (((eg) this).field_o < 3) {
                      break L10;
                    } else {
                      if (((eg) this).field_o > 6) {
                        break L10;
                      } else {
                        break L7;
                      }
                    }
                  }
                  ((eg) this).field_o = 3;
                  break L7;
                } else {
                  ((eg) this).field_o = 0;
                  ((eg) this).field_z = 0;
                  ((eg) this).field_n = 1;
                  break L7;
                }
              }
              L11: {
                L12: {
                  if (0 < ((eg) this).field_f.field_a) {
                    break L12;
                  } else {
                    if (((eg) this).b(param1, param0 ^ 121) == 0) {
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                }
                L13: {
                  if (((eg) this).field_e > 0) {
                    ((eg) this).field_n = 9;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (((eg) this).field_e <= 30) {
                    break L14;
                  } else {
                    ((eg) this).field_n = 8;
                    break L14;
                  }
                }
                L15: {
                  if (((eg) this).field_e > 50) {
                    ((eg) this).field_n = 7;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                if (0 < ((eg) this).field_e) {
                  break L11;
                } else {
                  ((eg) this).field_n = 10;
                  break L11;
                }
              }
              L16: {
                if (0 < p.field_V) {
                  ((eg) this).field_n = 4;
                  p.field_V = p.field_V - 1;
                  if (p.field_V >= 15) {
                    break L16;
                  } else {
                    ((eg) this).field_n = 5;
                    break L16;
                  }
                } else {
                  break L16;
                }
              }
              L17: {
                if (sc.field_m.field_f) {
                  break L17;
                } else {
                  if (10 < ((eg) this).field_e) {
                    ((eg) this).field_e = ((eg) this).field_e - 4;
                    break L17;
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                ((eg) this).a(1, si.field_j, param1, 1, var3_int, 1, tl.field_a, pk.field_s, (byte) -104);
                if (!sc.field_m.field_d) {
                  if (p.field_V >= 10) {
                    break L18;
                  } else {
                    L19: {
                      if (fi.field_x <= 0) {
                        break L19;
                      } else {
                        if (10 <= fi.field_x) {
                          break L19;
                        } else {
                          p.field_V = 25;
                          fi.field_x = 0;
                          ii.field_e[od.field_k].a(9147, 1, ((eg) this).field_i);
                          ii.field_e[od.field_k].field_f.a(param0 ^ 42, ((eg) this).field_f);
                          ii.field_e[od.field_k].field_f.field_a = ii.field_e[od.field_k].field_f.field_a + 140;
                          ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                          ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + 40;
                          od.field_k = od.field_k + 1;
                          if (pk.field_s) {
                            tl.field_a.a(si.field_j[0], 100, ee.field_p * 256 / 100);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    L20: {
                      if (fi.field_x < 10) {
                        break L20;
                      } else {
                        if (fi.field_x < 40) {
                          L21: {
                            p.field_V = 5;
                            fi.field_x = fi.field_x - 20;
                            if (fi.field_x >= 0) {
                              break L21;
                            } else {
                              fi.field_x = 0;
                              break L21;
                            }
                          }
                          ii.field_e[od.field_k].a(9147, 1, ((eg) this).field_i);
                          ii.field_e[od.field_k].field_f.a(param0 ^ 21, ((eg) this).field_f);
                          ii.field_e[od.field_k].field_f.field_a = ii.field_e[od.field_k].field_f.field_a + 140;
                          ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                          ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + 40;
                          ii.field_e[od.field_k].field_e = -10;
                          od.field_k = od.field_k + 1;
                          ii.field_e[od.field_k].a(param0 + 9270, 1, ((eg) this).field_i);
                          ii.field_e[od.field_k].field_f.a(-112, ((eg) this).field_f);
                          ii.field_e[od.field_k].field_f.field_a = ii.field_e[od.field_k].field_f.field_a + 140;
                          ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                          ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + 40;
                          ii.field_e[od.field_k].field_e = 10;
                          od.field_k = od.field_k + 1;
                          if (pk.field_s) {
                            tl.field_a.a(si.field_j[23], 100, ee.field_p * 256 / 100);
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          break L20;
                        }
                      }
                    }
                    L22: {
                      if (fi.field_x < 40) {
                        break L22;
                      } else {
                        if (fi.field_x < 100) {
                          L23: {
                            p.field_V = 5;
                            fi.field_x = fi.field_x - 30;
                            if (fi.field_x < 0) {
                              fi.field_x = 0;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          ii.field_e[od.field_k].a(9147, 1, ((eg) this).field_i);
                          ii.field_e[od.field_k].field_f.a(-87, ((eg) this).field_f);
                          ii.field_e[od.field_k].field_f.field_a = ii.field_e[od.field_k].field_f.field_a + 140;
                          ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                          ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + 40;
                          ii.field_e[od.field_k].field_e = 30;
                          od.field_k = od.field_k + 1;
                          ii.field_e[od.field_k].a(9147, 1, ((eg) this).field_i);
                          ii.field_e[od.field_k].field_f.a(-82, ((eg) this).field_f);
                          ii.field_e[od.field_k].field_f.field_a = ii.field_e[od.field_k].field_f.field_a + 140;
                          ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                          ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + 40;
                          ii.field_e[od.field_k].field_e = 0;
                          od.field_k = od.field_k + 1;
                          ii.field_e[od.field_k].a(9147, 1, ((eg) this).field_i);
                          ii.field_e[od.field_k].field_f.a(-97, ((eg) this).field_f);
                          ii.field_e[od.field_k].field_f.field_a = ii.field_e[od.field_k].field_f.field_a + 140;
                          ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                          ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + 40;
                          ii.field_e[od.field_k].field_e = -30;
                          od.field_k = od.field_k + 1;
                          if (pk.field_s) {
                            tl.field_a.a(si.field_j[24], 100, ee.field_p * 256 / 100);
                            break L22;
                          } else {
                            break L22;
                          }
                        } else {
                          break L22;
                        }
                      }
                    }
                    if (fi.field_x >= 100) {
                      L24: {
                        fi.field_x = 0;
                        p.field_V = 25;
                        if (((eg) this).field_e < 0) {
                          break L24;
                        } else {
                          ((eg) this).field_e = ((eg) this).field_e - 10;
                          break L24;
                        }
                      }
                      L25: {
                        ii.field_e[od.field_k].a(9147, 2, ((eg) this).field_i);
                        ii.field_e[od.field_k].field_f.a(-83, ((eg) this).field_f);
                        ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                        ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + 60 * ((eg) this).field_h;
                        ii.field_e[od.field_k].field_e = 5 * (fi.field_x / 10);
                        od.field_k = od.field_k + 1;
                        if (pk.field_s) {
                          stackOut_181_0 = 0;
                          stackIn_182_0 = stackOut_181_0;
                          break L25;
                        } else {
                          stackOut_180_0 = 1;
                          stackIn_182_0 = stackOut_180_0;
                          break L25;
                        }
                      }
                      if (stackIn_182_0 != 0) {
                        break L18;
                      } else {
                        tl.field_a.a(si.field_j[2], 100, 256 * ee.field_p / 100);
                        break L18;
                      }
                    } else {
                      break L18;
                    }
                  }
                } else {
                  L26: {
                    if (fi.field_x >= 120) {
                      break L26;
                    } else {
                      fi.field_x = fi.field_x + 1;
                      break L26;
                    }
                  }
                  L27: {
                    if (120 <= fi.field_x) {
                      fi.field_x = fi.field_x - 20;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (fi.field_x % 10 != 5) {
                    break L18;
                  } else {
                    if (pk.field_s) {
                      tl.field_a.a(si.field_j[16], 100, 256 * ee.field_p / 100);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                }
              }
              ((eg) this).field_d = ((eg) this).field_d * 2;
              ((eg) this).field_f.field_b = ((eg) this).field_f.field_b - 120;
              ((eg) this).a((byte) 83);
              break L2;
            } else {
              L28: {
                ((eg) this).field_n = Math.abs(((eg) this).field_e) / 10 % 2 + 12;
                fi.field_x = 0;
                if (((eg) this).field_s == 1) {
                  L29: {
                    ((eg) this).field_e = -40;
                    ((eg) this).field_s = 2;
                    stackOut_80_0 = 0;
                    stackIn_82_0 = stackOut_80_0;
                    stackIn_81_0 = stackOut_80_0;
                    if (pk.field_s) {
                      stackOut_82_0 = stackIn_82_0;
                      stackOut_82_1 = 0;
                      stackIn_83_0 = stackOut_82_0;
                      stackIn_83_1 = stackOut_82_1;
                      break L29;
                    } else {
                      stackOut_81_0 = stackIn_81_0;
                      stackOut_81_1 = 1;
                      stackIn_83_0 = stackOut_81_0;
                      stackIn_83_1 = stackOut_81_1;
                      break L29;
                    }
                  }
                  if (stackIn_83_0 != stackIn_83_1) {
                    break L28;
                  } else {
                    tl.field_a.a(si.field_j[8], 100, ee.field_p * 256 / 100);
                    break L28;
                  }
                } else {
                  break L28;
                }
              }
              L30: {
                ((eg) this).field_e = ((eg) this).field_e + 1;
                ((eg) this).field_o = 1;
                ((eg) this).field_f.field_a = ((eg) this).field_f.field_a - ((eg) this).field_e;
                if (((eg) this).field_e > 0) {
                  ((eg) this).field_o = 2;
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                if (((eg) this).field_f.field_a >= 0) {
                  break L31;
                } else {
                  ((eg) this).field_f.field_a = ((eg) this).field_f.field_a + 240;
                  ((eg) this).field_i.field_a = ((eg) this).field_i.field_a - 1;
                  break L31;
                }
              }
              if (((eg) this).field_i.field_a >= -2) {
                break L2;
              } else {
                L32: {
                  ((eg) this).field_i.field_a = 2;
                  ((eg) this).field_i.field_b = 2;
                  if (4 != qh.field_l) {
                    break L32;
                  } else {
                    if (ql.field_c == 5) {
                      ((eg) this).field_i.field_b = ((eg) this).field_i.field_b + 1;
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                }
                gd.field_b = true;
                cd.field_e = 100;
                ((eg) this).field_f.field_a = 0;
                ((eg) this).field_s = 0;
                da.field_g = true;
                qh.field_g = qh.field_g - 1;
                hi.field_c = hi.field_c + 1;
                ((eg) this).field_h = 1;
                ((eg) this).field_e = 0;
                ((eg) this).field_f.field_b = 0;
                if (qh.field_g >= 0) {
                  break L2;
                } else {
                  bb.field_j = me.field_b;
                  hi.field_a = 580;
                  break L2;
                }
              }
            }
          } else {
            if (var4 == 1) {
              L33: {
                if (((eg) this).field_e > 0) {
                  break L33;
                } else {
                  if (1 != ((eg) this).b(param1, param0 + 119)) {
                    break L33;
                  } else {
                    if (0 == ((eg) this).field_f.field_a) {
                      ((eg) this).field_e = 30;
                      if (((eg) this).field_i.field_b < 0) {
                        break L33;
                      } else {
                        if (((eg) this).field_i.field_b >= 20) {
                          break L33;
                        } else {
                          L34: {
                            if (pk.field_s) {
                              stackOut_193_0 = 0;
                              stackIn_194_0 = stackOut_193_0;
                              break L34;
                            } else {
                              stackOut_192_0 = 1;
                              stackIn_194_0 = stackOut_192_0;
                              break L34;
                            }
                          }
                          if (stackIn_194_0 == 1) {
                            break L33;
                          } else {
                            tl.field_a.a(si.field_j[1], 100, ee.field_p * 128 / 100);
                            break L33;
                          }
                        }
                      }
                    } else {
                      break L33;
                    }
                  }
                }
              }
              L35: {
                ((eg) this).field_w = ((eg) this).field_w + 1;
                if (((eg) this).field_w > 2) {
                  break L35;
                } else {
                  ((eg) this).a(1, si.field_j, param1, 1, 60, 0, tl.field_a, pk.field_s, (byte) -73);
                  if (!pg.field_q) {
                    var4 = 0;
                    L36: while (true) {
                      if (od.field_k <= var4) {
                        break L35;
                      } else {
                        L37: {
                          if (ii.field_e[var4].field_p <= 0) {
                            break L37;
                          } else {
                            if (ii.field_e[var4].field_r != 0) {
                              break L37;
                            } else {
                              if (null == ii.field_e[var4].field_q) {
                                break L37;
                              } else {
                                if (((eg) this).field_q == null) {
                                  break L37;
                                } else {
                                  var8 = new ob();
                                  var9 = new ob();
                                  var8.field_b = ((eg) this).field_y;
                                  var8.field_a = ((eg) this).field_A;
                                  var9.field_b = ii.field_e[var4].field_y;
                                  var9.field_a = ii.field_e[var4].field_A;
                                  if (!j.a(((eg) this).field_q, var8.field_b, var8.field_a, ii.field_e[var4].field_q, var9.field_b, var9.field_a)) {
                                    break L37;
                                  } else {
                                    L38: {
                                      ii.field_e[var4].field_s = ii.field_e[var4].field_s + 1;
                                      if (!pk.field_s) {
                                        break L38;
                                      } else {
                                        tl.field_a.a(si.field_j[10], 100, 256 * ee.field_p / 100);
                                        break L38;
                                      }
                                    }
                                    ii.field_e[var4].field_m = ((eg) this).field_h;
                                    ((eg) this).field_B = 20;
                                    ((eg) this).field_w = 4;
                                    break L37;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var4++;
                        continue L36;
                      }
                    }
                  } else {
                    break L35;
                  }
                }
              }
              L39: {
                if (((eg) this).field_w == 2) {
                  ((eg) this).field_w = 0;
                  break L39;
                } else {
                  break L39;
                }
              }
              if (30 <= ((eg) this).field_w) {
                ((eg) this).field_k = 1;
                break L2;
              } else {
                break L2;
              }
            } else {
              if (var4 == 2) {
                L40: {
                  ((eg) this).field_w = ((eg) this).field_w + 1;
                  ((eg) this).field_e = 2;
                  if (((eg) this).field_w < 10) {
                    L41: {
                      ((eg) this).field_i.field_a = ((eg) this).field_i.field_a - 1;
                      if (!param1.field_d[((eg) this).field_i.a((byte) -68)]) {
                        break L41;
                      } else {
                        param1.field_d[((eg) this).field_i.a((byte) -68)] = false;
                        ii.field_e[od.field_k].a(9147, 21, new ob(((eg) this).field_i));
                        var4_ref_eg = ii.field_e[od.field_k];
                        od.field_k = od.field_k + 1;
                        var4_ref_eg.field_f.a(-117, ((eg) this).field_f);
                        var4_ref_eg.field_o = 0;
                        var4_ref_eg.field_e = 4;
                        var4_ref_eg.field_i.field_a = var4_ref_eg.field_i.field_a + 2;
                        var4_ref_eg.field_h = ((eg) this).field_h;
                        break L41;
                      }
                    }
                    ((eg) this).field_i.field_a = ((eg) this).field_i.field_a + 1;
                    ((eg) this).a(1, si.field_j, param1, 1, 30, 0, tl.field_a, pk.field_s, (byte) 29);
                    var4 = 0;
                    L42: while (true) {
                      if (var4 >= od.field_k) {
                        break L40;
                      } else {
                        L43: {
                          if (ii.field_e[var4].field_p <= 0) {
                            break L43;
                          } else {
                            if (((eg) this).field_q == null) {
                              break L43;
                            } else {
                              if (null == ii.field_e[var4].field_q) {
                                break L43;
                              } else {
                                var10 = new ob();
                                var11 = new ob();
                                var10.field_a = ((eg) this).field_A;
                                var10.field_b = ((eg) this).field_y;
                                var11.field_b = ii.field_e[var4].field_y;
                                var11.field_a = ii.field_e[var4].field_A;
                                if (j.a(((eg) this).field_q, var10.field_b, var10.field_a, ii.field_e[var4].field_q, var11.field_b, var11.field_a)) {
                                  L44: {
                                    if (ii.field_e[var4].field_d > 64) {
                                      break L44;
                                    } else {
                                      if (ii.field_e[var4].field_p > 10) {
                                        break L44;
                                      } else {
                                        L45: {
                                          ii.field_e[var4].field_m = ((eg) this).field_h;
                                          ii.field_e[var4].field_h = ((eg) this).field_h;
                                          stackOut_229_0 = 1;
                                          stackIn_231_0 = stackOut_229_0;
                                          stackIn_230_0 = stackOut_229_0;
                                          if (pk.field_s) {
                                            stackOut_231_0 = stackIn_231_0;
                                            stackOut_231_1 = 0;
                                            stackIn_232_0 = stackOut_231_0;
                                            stackIn_232_1 = stackOut_231_1;
                                            break L45;
                                          } else {
                                            stackOut_230_0 = stackIn_230_0;
                                            stackOut_230_1 = 1;
                                            stackIn_232_0 = stackOut_230_0;
                                            stackIn_232_1 = stackOut_230_1;
                                            break L45;
                                          }
                                        }
                                        L46: {
                                          if (stackIn_232_0 == stackIn_232_1) {
                                            break L46;
                                          } else {
                                            if (ii.field_e[var4].field_r > 0) {
                                              break L46;
                                            } else {
                                              tl.field_a.a(si.field_j[2], 100, 256 * ee.field_p / 100);
                                              break L46;
                                            }
                                          }
                                        }
                                        ii.field_e[var4].field_r = 1;
                                        ii.field_e[var4].field_w = 0;
                                        break L43;
                                      }
                                    }
                                  }
                                  L47: {
                                    ii.field_e[var4].field_s = ii.field_e[var4].field_s + 10;
                                    if (pk.field_s) {
                                      tl.field_a.a(si.field_j[2], 100, 256 * ee.field_p / 100);
                                      break L47;
                                    } else {
                                      break L47;
                                    }
                                  }
                                  L48: {
                                    ii.field_e[var4].field_m = ((eg) this).field_h;
                                    if (ii.field_e[var4].field_p >= 10) {
                                      break L48;
                                    } else {
                                      if (ii.field_e[var4].field_d > 64) {
                                        break L48;
                                      } else {
                                        break L43;
                                      }
                                    }
                                  }
                                  ((eg) this).field_w = 4;
                                  ((eg) this).field_B = 20;
                                  break L43;
                                } else {
                                  break L43;
                                }
                              }
                            }
                          }
                        }
                        var4++;
                        continue L42;
                      }
                    }
                  } else {
                    break L40;
                  }
                }
                L49: {
                  if (((eg) this).field_w != 3) {
                    break L49;
                  } else {
                    ((eg) this).field_w = 0;
                    break L49;
                  }
                }
                if (60 > ((eg) this).field_w) {
                  break L2;
                } else {
                  ((eg) this).field_k = 1;
                  break L2;
                }
              } else {
                if (var4 != 3) {
                  L50: {
                    if (var4 != 4) {
                      if (var4 != 9) {
                        if (var4 != 13) {
                          if (24 == var4) {
                            break L50;
                          } else {
                            if (var4 != 5) {
                              if (6 == var4) {
                                if (((eg) this).field_p > 0) {
                                  L51: {
                                    if (((eg) this).field_o == 7) {
                                      L52: {
                                        ((eg) this).field_z = ((eg) this).field_z - 1;
                                        if (((eg) this).field_z <= 0) {
                                          ((eg) this).field_z = 5;
                                          ((eg) this).field_n = ((eg) this).field_n + 1;
                                          break L52;
                                        } else {
                                          break L52;
                                        }
                                      }
                                      L53: {
                                        if (((eg) this).field_n > 1) {
                                          ((eg) this).field_n = 0;
                                          break L53;
                                        } else {
                                          break L53;
                                        }
                                      }
                                      L54: {
                                        if (((eg) this).field_n >= 0) {
                                          break L54;
                                        } else {
                                          ((eg) this).field_n = 0;
                                          break L54;
                                        }
                                      }
                                      L55: {
                                        if (((eg) this).field_s > 0) {
                                          ((eg) this).field_s = ((eg) this).field_s - 1;
                                          ((eg) this).field_o = 0;
                                          if (!pk.field_s) {
                                            break L55;
                                          } else {
                                            tl.field_a.a(si.field_j[30], 100, 256 * ee.field_p / 100);
                                            break L55;
                                          }
                                        } else {
                                          break L55;
                                        }
                                      }
                                      w.field_b = w.field_b + 1;
                                      if (250 >= w.field_b) {
                                        break L51;
                                      } else {
                                        ((eg) this).field_o = 0;
                                        break L51;
                                      }
                                    } else {
                                      L56: {
                                        if (0 != ((eg) this).field_x) {
                                          break L56;
                                        } else {
                                          L57: {
                                            ((eg) this).field_n = 19;
                                            if (((eg) this).field_w <= 25) {
                                              break L57;
                                            } else {
                                              ((eg) this).field_n = 20;
                                              break L57;
                                            }
                                          }
                                          L58: {
                                            if (((eg) this).field_w <= 40) {
                                              break L58;
                                            } else {
                                              ((eg) this).field_n = 21;
                                              break L58;
                                            }
                                          }
                                          ((eg) this).field_z = 0;
                                          int fieldTemp$88 = ((eg) this).field_w;
                                          ((eg) this).field_w = ((eg) this).field_w + 1;
                                          if (fieldTemp$88 <= 50) {
                                            break L56;
                                          } else {
                                            L59: {
                                              ((eg) this).field_w = 0;
                                              ((eg) this).field_e = 100;
                                              ((eg) this).field_x = 2;
                                              if (~ii.field_e[0].field_i.field_a != ~((eg) this).field_i.field_a) {
                                                break L59;
                                              } else {
                                                ((eg) this).field_e = 70;
                                                break L59;
                                              }
                                            }
                                            if (((eg) this).field_i.field_a > ii.field_e[0].field_i.field_a) {
                                              ((eg) this).field_e = -10;
                                              ((eg) this).field_i.field_a = ((eg) this).field_i.field_a - 1;
                                              ((eg) this).field_x = 3;
                                              ((eg) this).field_f.field_a = ((eg) this).field_f.field_a + 230;
                                              break L56;
                                            } else {
                                              break L56;
                                            }
                                          }
                                        }
                                      }
                                      L60: {
                                        if (((eg) this).field_x == 2) {
                                          this.a(true, 22, 20, param1);
                                          break L60;
                                        } else {
                                          break L60;
                                        }
                                      }
                                      L61: {
                                        if (((eg) this).field_x == 3) {
                                          this.a(20, -94, true, param1);
                                          break L61;
                                        } else {
                                          break L61;
                                        }
                                      }
                                      if (((eg) this).field_s > 0) {
                                        L62: {
                                          ((eg) this).field_p = ((eg) this).field_p - 1;
                                          ((eg) this).field_s = ((eg) this).field_s - 1;
                                          if (pk.field_s) {
                                            tl.field_a.a(si.field_j[25], 100, ee.field_p * 256 / 100);
                                            break L62;
                                          } else {
                                            break L62;
                                          }
                                        }
                                        if (((eg) this).field_p > 0) {
                                          break L51;
                                        } else {
                                          int discarded$89 = 0;
                                          this.c();
                                          ((eg) this).field_e = 80;
                                          break L51;
                                        }
                                      } else {
                                        break L51;
                                      }
                                    }
                                  }
                                  int discarded$90 = 0;
                                  this.e();
                                  break L2;
                                } else {
                                  this.a(true, param0 + 243, param1);
                                  break L2;
                                }
                              } else {
                                L63: {
                                  if (var4 != 7) {
                                    if (var4 != 8) {
                                      if (var4 != 10) {
                                        if (var4 == 11) {
                                          ((eg) this).field_e = 2;
                                          ((eg) this).a(1, si.field_j, param1, 1, 30, 0, tl.field_a, pk.field_s, (byte) 127);
                                          int discarded$91 = 0;
                                          this.e();
                                          break L2;
                                        } else {
                                          if (var4 == 12) {
                                            if (0 < ((eg) this).field_p) {
                                              L64: {
                                                if (w.field_b >= 250) {
                                                  L65: {
                                                    if (((eg) this).field_x != 0) {
                                                      break L65;
                                                    } else {
                                                      L66: {
                                                        this.a(true, 3, 30, (byte) -61, param1);
                                                        if (((eg) this).field_i.field_b <= 1) {
                                                          break L66;
                                                        } else {
                                                          if (17 <= ((eg) this).field_i.field_b) {
                                                            break L66;
                                                          } else {
                                                            if (((eg) this).field_z != 1) {
                                                              break L65;
                                                            } else {
                                                              if (((eg) this).field_n != 3) {
                                                                break L65;
                                                              } else {
                                                                tl.field_a.a(nl.field_q[12], 100, 256 * ee.field_p / 100);
                                                                break L65;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L67: {
                                                        if (((eg) this).field_i.field_b >= ii.field_e[0].field_i.field_b) {
                                                          ((eg) this).field_h = -1;
                                                          break L67;
                                                        } else {
                                                          ((eg) this).field_h = 1;
                                                          break L67;
                                                        }
                                                      }
                                                      L68: {
                                                        if (~((eg) this).field_i.field_a <= ~ii.field_e[0].field_i.field_a) {
                                                          break L68;
                                                        } else {
                                                          if (((eg) this).field_i.field_a >= 10) {
                                                            break L68;
                                                          } else {
                                                            ((eg) this).field_x = 1;
                                                            ((eg) this).field_w = 0;
                                                            break L68;
                                                          }
                                                        }
                                                      }
                                                      if (~ii.field_e[0].field_i.field_a <= ~((eg) this).field_i.field_a) {
                                                        break L65;
                                                      } else {
                                                        if (((eg) this).field_i.field_a <= 2) {
                                                          break L65;
                                                        } else {
                                                          ((eg) this).field_x = 3;
                                                          ((eg) this).field_i.field_a = ((eg) this).field_i.field_a - 1;
                                                          ((eg) this).field_e = -20;
                                                          ((eg) this).field_f.field_a = ((eg) this).field_f.field_a + 230;
                                                          break L65;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L69: {
                                                    if (((eg) this).field_x == 1) {
                                                      ((eg) this).field_n = 19;
                                                      int fieldTemp$92 = ((eg) this).field_w;
                                                      ((eg) this).field_w = ((eg) this).field_w + 1;
                                                      if (fieldTemp$92 <= 5) {
                                                        break L69;
                                                      } else {
                                                        ((eg) this).field_e = 70;
                                                        ((eg) this).field_x = 2;
                                                        ((eg) this).field_w = 0;
                                                        break L69;
                                                      }
                                                    } else {
                                                      break L69;
                                                    }
                                                  }
                                                  L70: {
                                                    if (((eg) this).field_x != 2) {
                                                      break L70;
                                                    } else {
                                                      this.a(true, 22, 0, param1);
                                                      break L70;
                                                    }
                                                  }
                                                  L71: {
                                                    if (((eg) this).field_x == 3) {
                                                      this.a(0, param0 + 31, true, param1);
                                                      break L71;
                                                    } else {
                                                      break L71;
                                                    }
                                                  }
                                                  if (0 >= ((eg) this).field_s) {
                                                    break L64;
                                                  } else {
                                                    L72: {
                                                      ((eg) this).field_p = ((eg) this).field_p - 1;
                                                      ((eg) this).field_s = ((eg) this).field_s - 1;
                                                      if (25 != ((eg) this).field_p) {
                                                        break L72;
                                                      } else {
                                                        ii.field_e[od.field_k].a(9147, 10, ((eg) this).field_i);
                                                        ii.field_e[od.field_k].field_f.a(-108, ((eg) this).field_f);
                                                        ii.field_e[od.field_k].field_i.field_b = 0;
                                                        ii.field_e[od.field_k].field_i.field_a = 16;
                                                        ii.field_e[od.field_k].field_f.field_b = 0;
                                                        ii.field_e[od.field_k].field_f.field_a = 0;
                                                        ii.field_e[od.field_k].field_h = 1;
                                                        ii.field_e[od.field_k].field_w = 10;
                                                        od.field_k = od.field_k + 1;
                                                        ii.field_e[od.field_k].a(9147, 10, ((eg) this).field_i);
                                                        ii.field_e[od.field_k].field_f.a(param0 + 19, ((eg) this).field_f);
                                                        ii.field_e[od.field_k].field_i.field_b = 19;
                                                        ii.field_e[od.field_k].field_i.field_a = 16;
                                                        ii.field_e[od.field_k].field_f.field_b = 0;
                                                        ii.field_e[od.field_k].field_f.field_a = 0;
                                                        ii.field_e[od.field_k].field_h = -1;
                                                        ii.field_e[od.field_k].field_w = 10;
                                                        od.field_k = od.field_k + 1;
                                                        break L72;
                                                      }
                                                    }
                                                    L73: {
                                                      if (pk.field_s) {
                                                        tl.field_a.a(si.field_j[25], 100, 256 * ee.field_p / 100);
                                                        break L73;
                                                      } else {
                                                        break L73;
                                                      }
                                                    }
                                                    if (((eg) this).field_p <= 0) {
                                                      int discarded$93 = 0;
                                                      this.c();
                                                      ((eg) this).field_e = 70;
                                                      break L64;
                                                    } else {
                                                      break L64;
                                                    }
                                                  }
                                                } else {
                                                  L74: {
                                                    ((eg) this).field_o = 7;
                                                    int fieldTemp$94 = ((eg) this).field_z;
                                                    ((eg) this).field_z = ((eg) this).field_z - 1;
                                                    if (fieldTemp$94 > 0) {
                                                      break L74;
                                                    } else {
                                                      ((eg) this).field_n = ((eg) this).field_n + 1;
                                                      ((eg) this).field_z = 5;
                                                      if (((eg) this).field_n > 1) {
                                                        ((eg) this).field_n = 0;
                                                        break L74;
                                                      } else {
                                                        break L74;
                                                      }
                                                    }
                                                  }
                                                  L75: {
                                                    if (((eg) this).field_s <= 0) {
                                                      break L75;
                                                    } else {
                                                      L76: {
                                                        ((eg) this).field_s = ((eg) this).field_s - 1;
                                                        w.field_b = 250;
                                                        ((eg) this).field_x = 0;
                                                        if (pk.field_s) {
                                                          stackOut_430_0 = 0;
                                                          stackIn_431_0 = stackOut_430_0;
                                                          break L76;
                                                        } else {
                                                          stackOut_429_0 = 1;
                                                          stackIn_431_0 = stackOut_429_0;
                                                          break L76;
                                                        }
                                                      }
                                                      if (stackIn_431_0 == 1) {
                                                        break L75;
                                                      } else {
                                                        tl.field_a.a(si.field_j[17], 100, 256 * ee.field_p / 100);
                                                        break L75;
                                                      }
                                                    }
                                                  }
                                                  w.field_b = w.field_b + 1;
                                                  break L64;
                                                }
                                              }
                                              int discarded$95 = 0;
                                              this.e();
                                              break L2;
                                            } else {
                                              this.a(true, 120, param1);
                                              break L2;
                                            }
                                          } else {
                                            if (14 != var4) {
                                              if (var4 == 15) {
                                                if (((eg) this).field_p <= 0) {
                                                  this.a(false, param0 + 243, param1);
                                                  break L2;
                                                } else {
                                                  if (0 == ((eg) this).field_r) {
                                                    L77: {
                                                      if (0 != ((eg) this).field_x) {
                                                        break L77;
                                                      } else {
                                                        this.a(15, (byte) -9, param1, false);
                                                        int fieldTemp$96 = ((eg) this).field_w;
                                                        ((eg) this).field_w = ((eg) this).field_w + 1;
                                                        if (fieldTemp$96 > 100) {
                                                          ((eg) this).field_x = 1;
                                                          ((eg) this).field_z = 0;
                                                          ((eg) this).field_w = 0;
                                                          break L77;
                                                        } else {
                                                          break L77;
                                                        }
                                                      }
                                                    }
                                                    L78: {
                                                      if (((eg) this).field_x == 1) {
                                                        if (!this.a(false, param1, 25)) {
                                                          break L78;
                                                        } else {
                                                          L79: {
                                                            ((eg) this).field_w = 0;
                                                            ii.field_e[od.field_k].a(9147, 18, ((eg) this).field_i);
                                                            ii.field_e[od.field_k].field_f.a(-84, ((eg) this).field_f);
                                                            ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + (((eg) this).field_h * 200 - -120);
                                                            ii.field_e[od.field_k].field_f.field_a = ii.field_e[od.field_k].field_f.field_a - 40;
                                                            ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                                                            ii.field_e[od.field_k].field_w = 0;
                                                            ii.field_e[od.field_k].field_o = 8;
                                                            od.field_k = od.field_k + 1;
                                                            if (pk.field_s) {
                                                              stackOut_505_0 = 0;
                                                              stackIn_506_0 = stackOut_505_0;
                                                              break L79;
                                                            } else {
                                                              stackOut_504_0 = 1;
                                                              stackIn_506_0 = stackOut_504_0;
                                                              break L79;
                                                            }
                                                          }
                                                          if (stackIn_506_0 == 1) {
                                                            break L78;
                                                          } else {
                                                            tl.field_a.a(nl.field_q[17], 100, ee.field_p * 256 / 100);
                                                            break L78;
                                                          }
                                                        }
                                                      } else {
                                                        break L78;
                                                      }
                                                    }
                                                    int discarded$97 = 0;
                                                    this.e();
                                                    break L2;
                                                  } else {
                                                    this.a(46, param1);
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                if (16 == var4) {
                                                  if (((eg) this).field_p <= 0) {
                                                    this.a(false, 120, param1);
                                                    break L2;
                                                  } else {
                                                    if (0 != ((eg) this).field_r) {
                                                      this.a(param0 + 163, param1);
                                                      break L2;
                                                    } else {
                                                      L80: {
                                                        if (((eg) this).field_x == 0) {
                                                          L81: {
                                                            if (ii.field_e[0].field_i.field_a > ((eg) this).field_i.field_a) {
                                                              ((eg) this).field_w = ((eg) this).field_w + 1;
                                                              break L81;
                                                            } else {
                                                              break L81;
                                                            }
                                                          }
                                                          this.a(false, 2, 10, (byte) -105, param1);
                                                          int fieldTemp$98 = ((eg) this).field_w;
                                                          ((eg) this).field_w = ((eg) this).field_w + 1;
                                                          if (fieldTemp$98 > 200) {
                                                            L82: {
                                                              ((eg) this).field_x = 1;
                                                              ((eg) this).field_w = 0;
                                                              stackOut_519_0 = this;
                                                              stackIn_521_0 = stackOut_519_0;
                                                              stackIn_520_0 = stackOut_519_0;
                                                              if (~((eg) this).field_i.field_b < ~ii.field_e[0].field_i.field_b) {
                                                                stackOut_521_0 = this;
                                                                stackOut_521_1 = 1;
                                                                stackIn_522_0 = stackOut_521_0;
                                                                stackIn_522_1 = stackOut_521_1;
                                                                break L82;
                                                              } else {
                                                                stackOut_520_0 = this;
                                                                stackOut_520_1 = -1;
                                                                stackIn_522_0 = stackOut_520_0;
                                                                stackIn_522_1 = stackOut_520_1;
                                                                break L82;
                                                              }
                                                            }
                                                            ((eg) this).field_h = stackIn_522_1;
                                                            if (50.0 <= 100.0 * Math.random()) {
                                                              break L80;
                                                            } else {
                                                              L83: {
                                                                stackOut_523_0 = this;
                                                                stackIn_525_0 = stackOut_523_0;
                                                                stackIn_524_0 = stackOut_523_0;
                                                                if (~ii.field_e[0].field_i.field_b > ~((eg) this).field_i.field_b) {
                                                                  stackOut_525_0 = this;
                                                                  stackOut_525_1 = -1;
                                                                  stackIn_526_0 = stackOut_525_0;
                                                                  stackIn_526_1 = stackOut_525_1;
                                                                  break L83;
                                                                } else {
                                                                  stackOut_524_0 = this;
                                                                  stackOut_524_1 = 1;
                                                                  stackIn_526_0 = stackOut_524_0;
                                                                  stackIn_526_1 = stackOut_524_1;
                                                                  break L83;
                                                                }
                                                              }
                                                              ((eg) this).field_h = stackIn_526_1;
                                                              ((eg) this).field_x = 4;
                                                              break L80;
                                                            }
                                                          } else {
                                                            break L80;
                                                          }
                                                        } else {
                                                          break L80;
                                                        }
                                                      }
                                                      L84: {
                                                        if (((eg) this).field_x != 1) {
                                                          break L84;
                                                        } else {
                                                          ((eg) this).field_n = 19;
                                                          int fieldTemp$99 = ((eg) this).field_w;
                                                          ((eg) this).field_w = ((eg) this).field_w + 1;
                                                          if (fieldTemp$99 > 25) {
                                                            ((eg) this).field_e = 70;
                                                            ((eg) this).field_x = 2;
                                                            ((eg) this).field_w = 0;
                                                            break L84;
                                                          } else {
                                                            break L84;
                                                          }
                                                        }
                                                      }
                                                      L85: {
                                                        if (((eg) this).field_x != 2) {
                                                          break L85;
                                                        } else {
                                                          this.a(false, 22, 15, param1);
                                                          if (((eg) this).field_x == 0) {
                                                            ((eg) this).field_w = (int)(Math.random() * 100.0);
                                                            break L85;
                                                          } else {
                                                            break L85;
                                                          }
                                                        }
                                                      }
                                                      L86: {
                                                        if (((eg) this).field_x != 3) {
                                                          break L86;
                                                        } else {
                                                          this.a(15, -102, false, param1);
                                                          if (((eg) this).field_x == 0) {
                                                            ((eg) this).field_w = (int)(100.0 * Math.random());
                                                            break L86;
                                                          } else {
                                                            break L86;
                                                          }
                                                        }
                                                      }
                                                      L87: {
                                                        if (4 == ((eg) this).field_x) {
                                                          if (!this.a(false, param1, param0 + 148)) {
                                                            break L87;
                                                          } else {
                                                            L88: {
                                                              ii.field_e[od.field_k].a(9147, 19, ((eg) this).field_i);
                                                              ii.field_e[od.field_k].field_f.a(param0 ^ 13, ((eg) this).field_f);
                                                              ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + (40 + 360 * ((eg) this).field_h);
                                                              ii.field_e[od.field_k].field_f.field_a = ii.field_e[od.field_k].field_f.field_a + 160;
                                                              ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                                                              ii.field_e[od.field_k].field_w = 0;
                                                              ii.field_e[od.field_k].field_e = 25;
                                                              ii.field_e[od.field_k].field_n = 37;
                                                              od.field_k = od.field_k + 1;
                                                              if (pk.field_s) {
                                                                stackOut_544_0 = 0;
                                                                stackIn_545_0 = stackOut_544_0;
                                                                break L88;
                                                              } else {
                                                                stackOut_543_0 = 1;
                                                                stackIn_545_0 = stackOut_543_0;
                                                                break L88;
                                                              }
                                                            }
                                                            if (stackIn_545_0 != 0) {
                                                              break L87;
                                                            } else {
                                                              tl.field_a.a(nl.field_q[18], 100, ee.field_p * 256 / 100);
                                                              break L87;
                                                            }
                                                          }
                                                        } else {
                                                          break L87;
                                                        }
                                                      }
                                                      int discarded$100 = 0;
                                                      this.e();
                                                      break L2;
                                                    }
                                                  }
                                                } else {
                                                  if (17 == var4) {
                                                    if (0 >= ((eg) this).field_p) {
                                                      this.a(true, 120, param1);
                                                      break L2;
                                                    } else {
                                                      if (w.field_b < 250) {
                                                        L89: {
                                                          ((eg) this).field_x = 0;
                                                          int fieldTemp$101 = ((eg) this).field_z;
                                                          ((eg) this).field_z = ((eg) this).field_z - 1;
                                                          if (fieldTemp$101 > 0) {
                                                            break L89;
                                                          } else {
                                                            ((eg) this).field_n = ((eg) this).field_n + 1;
                                                            ((eg) this).field_z = 5;
                                                            if (((eg) this).field_n <= 1) {
                                                              break L89;
                                                            } else {
                                                              ((eg) this).field_n = 0;
                                                              break L89;
                                                            }
                                                          }
                                                        }
                                                        L90: {
                                                          ((eg) this).field_o = 7;
                                                          if (((eg) this).field_s > 0) {
                                                            w.field_b = 250;
                                                            ((eg) this).field_s = ((eg) this).field_s - 1;
                                                            if (pk.field_s) {
                                                              tl.field_a.a(si.field_j[29], 100, ee.field_p * 256 / 100);
                                                              break L90;
                                                            } else {
                                                              break L90;
                                                            }
                                                          } else {
                                                            break L90;
                                                          }
                                                        }
                                                        w.field_b = w.field_b + 1;
                                                        break L2;
                                                      } else {
                                                        L91: {
                                                          if (((eg) this).field_x == 0) {
                                                            L92: {
                                                              if (~((eg) this).field_i.field_a > ~ii.field_e[0].field_i.field_a) {
                                                                ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                break L92;
                                                              } else {
                                                                break L92;
                                                              }
                                                            }
                                                            this.a(true, 1, 25, (byte) -94, param1);
                                                            int fieldTemp$102 = ((eg) this).field_w;
                                                            ((eg) this).field_w = ((eg) this).field_w + 1;
                                                            if (fieldTemp$102 <= 200) {
                                                              break L91;
                                                            } else {
                                                              L93: {
                                                                ((eg) this).field_w = 0;
                                                                stackOut_558_0 = this;
                                                                stackIn_560_0 = stackOut_558_0;
                                                                stackIn_559_0 = stackOut_558_0;
                                                                if (((eg) this).field_i.field_b <= ii.field_e[0].field_i.field_b) {
                                                                  stackOut_560_0 = this;
                                                                  stackOut_560_1 = 1;
                                                                  stackIn_561_0 = stackOut_560_0;
                                                                  stackIn_561_1 = stackOut_560_1;
                                                                  break L93;
                                                                } else {
                                                                  stackOut_559_0 = this;
                                                                  stackOut_559_1 = -1;
                                                                  stackIn_561_0 = stackOut_559_0;
                                                                  stackIn_561_1 = stackOut_559_1;
                                                                  break L93;
                                                                }
                                                              }
                                                              ((eg) this).field_h = stackIn_561_1;
                                                              ((eg) this).field_x = 1;
                                                              break L91;
                                                            }
                                                          } else {
                                                            break L91;
                                                          }
                                                        }
                                                        L94: {
                                                          if (((eg) this).field_x != 1) {
                                                            break L94;
                                                          } else {
                                                            ((eg) this).field_n = 19;
                                                            int fieldTemp$103 = ((eg) this).field_w;
                                                            ((eg) this).field_w = ((eg) this).field_w + 1;
                                                            if (25 < fieldTemp$103) {
                                                              ((eg) this).field_e = 70;
                                                              ((eg) this).field_x = 2;
                                                              ((eg) this).field_w = 0;
                                                              break L94;
                                                            } else {
                                                              break L94;
                                                            }
                                                          }
                                                        }
                                                        L95: {
                                                          if (((eg) this).field_x != 2) {
                                                            break L95;
                                                          } else {
                                                            this.a(true, 22, 16, param1);
                                                            if (((eg) this).field_x == 0) {
                                                              ((eg) this).field_w = (int)(Math.random() * 100.0);
                                                              break L95;
                                                            } else {
                                                              break L95;
                                                            }
                                                          }
                                                        }
                                                        L96: {
                                                          if (((eg) this).field_x != 3) {
                                                            break L96;
                                                          } else {
                                                            this.a(16, -99, true, param1);
                                                            if (0 != ((eg) this).field_x) {
                                                              break L96;
                                                            } else {
                                                              ((eg) this).field_w = (int)(100.0 * Math.random());
                                                              break L96;
                                                            }
                                                          }
                                                        }
                                                        L97: {
                                                          if (0 >= ((eg) this).field_s) {
                                                            break L97;
                                                          } else {
                                                            L98: {
                                                              ((eg) this).field_p = ((eg) this).field_p - 1;
                                                              ((eg) this).field_s = ((eg) this).field_s - 1;
                                                              if (0 != ((eg) this).field_p % 10) {
                                                                break L98;
                                                              } else {
                                                                ii.field_e[od.field_k].a(9147, 14, ((eg) this).field_i);
                                                                ii.field_e[od.field_k].field_f.a(-102, ((eg) this).field_f);
                                                                ii.field_e[od.field_k].field_h = 1;
                                                                ii.field_e[od.field_k].field_w = 10;
                                                                od.field_k = od.field_k + 1;
                                                                break L98;
                                                              }
                                                            }
                                                            L99: {
                                                              ((eg) this).field_o = 1;
                                                              if (pk.field_s) {
                                                                tl.field_a.a(si.field_j[29], 100, 256 * ee.field_p / 100);
                                                                break L99;
                                                              } else {
                                                                break L99;
                                                              }
                                                            }
                                                            if (((eg) this).field_p <= 0) {
                                                              int discarded$104 = 0;
                                                              this.c();
                                                              ((eg) this).field_e = 60;
                                                              break L97;
                                                            } else {
                                                              break L97;
                                                            }
                                                          }
                                                        }
                                                        int discarded$105 = 0;
                                                        this.e();
                                                        break L2;
                                                      }
                                                    }
                                                  } else {
                                                    if (var4 == 18) {
                                                      L100: {
                                                        L101: {
                                                          int discarded$106 = 0;
                                                          this.e();
                                                          if (((eg) this).b(param1, -4) != 1) {
                                                            break L101;
                                                          } else {
                                                            if (((eg) this).field_f.field_a == 0) {
                                                              L102: {
                                                                ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                if (35 >= ((eg) this).field_n) {
                                                                  break L102;
                                                                } else {
                                                                  ((eg) this).field_z = 0;
                                                                  break L102;
                                                                }
                                                              }
                                                              ((eg) this).field_n = 35;
                                                              int fieldTemp$107 = ((eg) this).field_z;
                                                              ((eg) this).field_z = ((eg) this).field_z + 1;
                                                              if (fieldTemp$107 <= 10) {
                                                                break L100;
                                                              } else {
                                                                ((eg) this).field_n = 34;
                                                                break L100;
                                                              }
                                                            } else {
                                                              break L101;
                                                            }
                                                          }
                                                        }
                                                        L103: {
                                                          ((eg) this).a(1, si.field_j, param1, 1, 5, 1, tl.field_a, pk.field_s, (byte) 127);
                                                          if (36 > ((eg) this).field_n) {
                                                            ((eg) this).field_n = 36;
                                                            break L103;
                                                          } else {
                                                            break L103;
                                                          }
                                                        }
                                                        L104: {
                                                          ((eg) this).field_z = ((eg) this).field_z - 1;
                                                          if (((eg) this).field_z <= 5) {
                                                            ((eg) this).field_n = 37;
                                                            break L104;
                                                          } else {
                                                            break L104;
                                                          }
                                                        }
                                                        if (((eg) this).field_z > 0) {
                                                          break L100;
                                                        } else {
                                                          ((eg) this).field_z = 10;
                                                          break L100;
                                                        }
                                                      }
                                                      L105: {
                                                        if (((eg) this).field_f.field_a < 0) {
                                                          ((eg) this).field_f.field_a = ((eg) this).field_f.field_a + 240;
                                                          ((eg) this).field_i.field_a = ((eg) this).field_i.field_a - 1;
                                                          break L105;
                                                        } else {
                                                          break L105;
                                                        }
                                                      }
                                                      L106: {
                                                        if (((eg) this).field_i.field_a < 0) {
                                                          ((eg) this).field_w = 21;
                                                          break L106;
                                                        } else {
                                                          break L106;
                                                        }
                                                      }
                                                      int discarded$108 = 0;
                                                      this.e();
                                                      if (20 < ((eg) this).field_w) {
                                                        ((eg) this).field_k = 1;
                                                        break L2;
                                                      } else {
                                                        break L2;
                                                      }
                                                    } else {
                                                      if (var4 == 19) {
                                                        ((eg) this).a(1, si.field_j, param1, 1, 25, 0, tl.field_a, pk.field_s, (byte) -120);
                                                        int discarded$109 = 0;
                                                        this.e();
                                                        ((eg) this).field_n = 37;
                                                        if (((eg) this).b(param1, -4) != 1) {
                                                          break L2;
                                                        } else {
                                                          if (((eg) this).field_f.field_a != 0) {
                                                            break L2;
                                                          } else {
                                                            ((eg) this).field_e = 20;
                                                            ((eg) this).field_n = 37;
                                                            break L2;
                                                          }
                                                        }
                                                      } else {
                                                        if (25 == var4) {
                                                          L107: {
                                                            ((eg) this).a((byte) 78);
                                                            if (((eg) this).field_f.field_a < 0) {
                                                              ((eg) this).field_f.field_a = ((eg) this).field_f.field_a + 240;
                                                              ((eg) this).field_i.field_a = ((eg) this).field_i.field_a - 1;
                                                              break L107;
                                                            } else {
                                                              break L107;
                                                            }
                                                          }
                                                          L108: {
                                                            ((eg) this).field_z = ((eg) this).field_z + 1;
                                                            if (((eg) this).field_f.field_a >= 240) {
                                                              ((eg) this).field_f.field_a = ((eg) this).field_f.field_a - 240;
                                                              ((eg) this).field_i.field_a = ((eg) this).field_i.field_a + 1;
                                                              break L108;
                                                            } else {
                                                              break L108;
                                                            }
                                                          }
                                                          L109: {
                                                            stackOut_626_0 = this;
                                                            stackIn_628_0 = stackOut_626_0;
                                                            stackIn_627_0 = stackOut_626_0;
                                                            if (((eg) this).field_z % 10 < 6) {
                                                              stackOut_628_0 = this;
                                                              stackOut_628_1 = 36;
                                                              stackIn_629_0 = stackOut_628_0;
                                                              stackIn_629_1 = stackOut_628_1;
                                                              break L109;
                                                            } else {
                                                              stackOut_627_0 = this;
                                                              stackOut_627_1 = 37;
                                                              stackIn_629_0 = stackOut_627_0;
                                                              stackIn_629_1 = stackOut_627_1;
                                                              break L109;
                                                            }
                                                          }
                                                          L110: {
                                                            ((eg) this).field_n = stackIn_629_1;
                                                            if (((eg) this).field_z < 20) {
                                                              L111: {
                                                                if (((eg) this).field_i.field_b >= ii.field_e[0].field_i.field_b) {
                                                                  break L111;
                                                                } else {
                                                                  ((eg) this).field_f.field_b = ((eg) this).field_f.field_b + 15;
                                                                  ((eg) this).field_h = 1;
                                                                  break L111;
                                                                }
                                                              }
                                                              L112: {
                                                                if (~ii.field_e[0].field_i.field_a >= ~((eg) this).field_i.field_a) {
                                                                  break L112;
                                                                } else {
                                                                  ((eg) this).field_f.field_a = ((eg) this).field_f.field_a + 15;
                                                                  break L112;
                                                                }
                                                              }
                                                              L113: {
                                                                if (ii.field_e[0].field_i.field_b >= ((eg) this).field_i.field_b) {
                                                                  break L113;
                                                                } else {
                                                                  ((eg) this).field_h = -1;
                                                                  ((eg) this).field_f.field_b = ((eg) this).field_f.field_b - 15;
                                                                  break L113;
                                                                }
                                                              }
                                                              if (((eg) this).field_i.field_a > ii.field_e[0].field_i.field_a) {
                                                                ((eg) this).field_f.field_a = ((eg) this).field_f.field_a - 15;
                                                                break L110;
                                                              } else {
                                                                break L110;
                                                              }
                                                            } else {
                                                              L114: {
                                                                ((eg) this).field_f.field_b = ((eg) this).field_f.field_b + ((eg) this).field_h * 15;
                                                                if (((eg) this).field_i.field_a >= ii.field_e[0].field_i.field_a) {
                                                                  break L114;
                                                                } else {
                                                                  ((eg) this).field_f.field_a = ((eg) this).field_f.field_a + 18;
                                                                  break L114;
                                                                }
                                                              }
                                                              if (((eg) this).field_i.field_a > ii.field_e[0].field_i.field_a) {
                                                                ((eg) this).field_f.field_a = ((eg) this).field_f.field_a - 18;
                                                                break L110;
                                                              } else {
                                                                break L110;
                                                              }
                                                            }
                                                          }
                                                          int discarded$110 = 0;
                                                          this.e();
                                                          if (((eg) this).field_z > 300) {
                                                            ((eg) this).field_k = 1;
                                                            break L2;
                                                          } else {
                                                            break L2;
                                                          }
                                                        } else {
                                                          if (var4 == 20) {
                                                            break L2;
                                                          } else {
                                                            if (var4 == 21) {
                                                              L115: {
                                                                if (((eg) this).field_i.field_b < 0) {
                                                                  ((eg) this).field_h = 1;
                                                                  ((eg) this).field_i.field_b = 0;
                                                                  ((eg) this).field_f.field_b = 0;
                                                                  break L115;
                                                                } else {
                                                                  break L115;
                                                                }
                                                              }
                                                              L116: {
                                                                if (((eg) this).field_i.field_b >= 20) {
                                                                  ((eg) this).field_i.field_b = 20;
                                                                  ((eg) this).field_h = -1;
                                                                  ((eg) this).field_f.field_b = 0;
                                                                  break L116;
                                                                } else {
                                                                  break L116;
                                                                }
                                                              }
                                                              L117: {
                                                                if (((eg) this).b(param1, -4) != 1) {
                                                                  break L117;
                                                                } else {
                                                                  if (((eg) this).field_f.field_a != 0) {
                                                                    break L117;
                                                                  } else {
                                                                    if (((eg) this).field_e <= 0) {
                                                                      int discarded$111 = 5;
                                                                      this.b();
                                                                      break L2;
                                                                    } else {
                                                                      break L117;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              ((eg) this).a(1, si.field_j, param1, 1, 30, 1, tl.field_a, pk.field_s, (byte) 126);
                                                              break L2;
                                                            } else {
                                                              if (var4 != 22) {
                                                                L118: {
                                                                  if (var4 != 23) {
                                                                    if (31 == var4) {
                                                                      break L118;
                                                                    } else {
                                                                      if (var4 != 26) {
                                                                        if (var4 != 27) {
                                                                          if (var4 != 28) {
                                                                            if (29 != var4) {
                                                                              if (var4 == 30) {
                                                                                if (((eg) this).field_p <= 0) {
                                                                                  this.a(false, 120, param1);
                                                                                  break L2;
                                                                                } else {
                                                                                  if (((eg) this).field_r != 0) {
                                                                                    this.a(100, param1);
                                                                                    break L2;
                                                                                  } else {
                                                                                    L119: {
                                                                                      if (((eg) this).field_x == 0) {
                                                                                        L120: {
                                                                                          if (((eg) this).field_i.field_a < ii.field_e[0].field_i.field_a) {
                                                                                            ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                            break L120;
                                                                                          } else {
                                                                                            break L120;
                                                                                          }
                                                                                        }
                                                                                        this.a(false, 2, 20, (byte) -78, param1);
                                                                                        int fieldTemp$112 = ((eg) this).field_w;
                                                                                        ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                        if (200 >= fieldTemp$112) {
                                                                                          break L119;
                                                                                        } else {
                                                                                          L121: {
                                                                                            ((eg) this).field_x = 1;
                                                                                            stackOut_839_0 = this;
                                                                                            stackIn_841_0 = stackOut_839_0;
                                                                                            stackIn_840_0 = stackOut_839_0;
                                                                                            if (~((eg) this).field_i.field_b >= ~ii.field_e[0].field_i.field_b) {
                                                                                              stackOut_841_0 = this;
                                                                                              stackOut_841_1 = -1;
                                                                                              stackIn_842_0 = stackOut_841_0;
                                                                                              stackIn_842_1 = stackOut_841_1;
                                                                                              break L121;
                                                                                            } else {
                                                                                              stackOut_840_0 = this;
                                                                                              stackOut_840_1 = 1;
                                                                                              stackIn_842_0 = stackOut_840_0;
                                                                                              stackIn_842_1 = stackOut_840_1;
                                                                                              break L121;
                                                                                            }
                                                                                          }
                                                                                          ((eg) this).field_h = stackIn_842_1;
                                                                                          ((eg) this).field_z = 0;
                                                                                          ((eg) this).field_w = 0;
                                                                                          if (80.0 <= 100.0 * Math.random()) {
                                                                                            break L119;
                                                                                          } else {
                                                                                            L122: {
                                                                                              ((eg) this).field_x = 4;
                                                                                              stackOut_843_0 = this;
                                                                                              stackIn_845_0 = stackOut_843_0;
                                                                                              stackIn_844_0 = stackOut_843_0;
                                                                                              if (ii.field_e[0].field_i.field_b >= ((eg) this).field_i.field_b) {
                                                                                                stackOut_845_0 = this;
                                                                                                stackOut_845_1 = 1;
                                                                                                stackIn_846_0 = stackOut_845_0;
                                                                                                stackIn_846_1 = stackOut_845_1;
                                                                                                break L122;
                                                                                              } else {
                                                                                                stackOut_844_0 = this;
                                                                                                stackOut_844_1 = -1;
                                                                                                stackIn_846_0 = stackOut_844_0;
                                                                                                stackIn_846_1 = stackOut_844_1;
                                                                                                break L122;
                                                                                              }
                                                                                            }
                                                                                            ((eg) this).field_h = stackIn_846_1;
                                                                                            break L119;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        break L119;
                                                                                      }
                                                                                    }
                                                                                    L123: {
                                                                                      if (((eg) this).field_x == 1) {
                                                                                        L124: {
                                                                                          int fieldTemp$113 = ((eg) this).field_w;
                                                                                          ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                          if (fieldTemp$113 <= 25) {
                                                                                            break L124;
                                                                                          } else {
                                                                                            ((eg) this).field_e = 70;
                                                                                            ((eg) this).field_w = 0;
                                                                                            ((eg) this).field_x = 2;
                                                                                            break L124;
                                                                                          }
                                                                                        }
                                                                                        ((eg) this).field_n = 19;
                                                                                        break L123;
                                                                                      } else {
                                                                                        break L123;
                                                                                      }
                                                                                    }
                                                                                    L125: {
                                                                                      if (2 != ((eg) this).field_x) {
                                                                                        break L125;
                                                                                      } else {
                                                                                        this.a(false, 22, 25, param1);
                                                                                        if (((eg) this).field_x == 0) {
                                                                                          ((eg) this).field_z = 0;
                                                                                          ((eg) this).field_w = (int)(100.0 * Math.random());
                                                                                          break L125;
                                                                                        } else {
                                                                                          break L125;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L126: {
                                                                                      if (((eg) this).field_x == 3) {
                                                                                        this.a(25, -128, false, param1);
                                                                                        if (((eg) this).field_x == 0) {
                                                                                          ((eg) this).field_z = 0;
                                                                                          ((eg) this).field_w = (int)(Math.random() * 100.0);
                                                                                          break L126;
                                                                                        } else {
                                                                                          break L126;
                                                                                        }
                                                                                      } else {
                                                                                        break L126;
                                                                                      }
                                                                                    }
                                                                                    L127: {
                                                                                      if (((eg) this).field_x == 4) {
                                                                                        if (this.a(false, param1, param0 ^ -100)) {
                                                                                          L128: {
                                                                                            ii.field_e[od.field_k].a(9147, 35, ((eg) this).field_i);
                                                                                            ii.field_e[od.field_k].field_f.a(-103, ((eg) this).field_f);
                                                                                            ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + (40 + 120 * ((eg) this).field_h);
                                                                                            ii.field_e[od.field_k].field_f.field_a = ii.field_e[od.field_k].field_f.field_a + 520;
                                                                                            ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                                                                                            ii.field_e[od.field_k].field_w = 0;
                                                                                            od.field_k = od.field_k + 1;
                                                                                            stackOut_865_0 = 0;
                                                                                            stackIn_867_0 = stackOut_865_0;
                                                                                            stackIn_866_0 = stackOut_865_0;
                                                                                            if (pk.field_s) {
                                                                                              stackOut_867_0 = stackIn_867_0;
                                                                                              stackOut_867_1 = 0;
                                                                                              stackIn_868_0 = stackOut_867_0;
                                                                                              stackIn_868_1 = stackOut_867_1;
                                                                                              break L128;
                                                                                            } else {
                                                                                              stackOut_866_0 = stackIn_866_0;
                                                                                              stackOut_866_1 = 1;
                                                                                              stackIn_868_0 = stackOut_866_0;
                                                                                              stackIn_868_1 = stackOut_866_1;
                                                                                              break L128;
                                                                                            }
                                                                                          }
                                                                                          if (stackIn_868_0 == stackIn_868_1) {
                                                                                            tl.field_a.a(si.field_j[13], 100, ee.field_p * 256 / 100);
                                                                                            break L127;
                                                                                          } else {
                                                                                            break L127;
                                                                                          }
                                                                                        } else {
                                                                                          break L127;
                                                                                        }
                                                                                      } else {
                                                                                        break L127;
                                                                                      }
                                                                                    }
                                                                                    int discarded$114 = 0;
                                                                                    this.e();
                                                                                    break L2;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                if (32 == var4) {
                                                                                  if (((eg) this).field_p > 0) {
                                                                                    if (((eg) this).field_r == 0) {
                                                                                      L129: {
                                                                                        if (((eg) this).field_x == 0) {
                                                                                          L130: {
                                                                                            if (ii.field_e[0].field_i.field_a > ((eg) this).field_i.field_a) {
                                                                                              ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                              break L130;
                                                                                            } else {
                                                                                              break L130;
                                                                                            }
                                                                                          }
                                                                                          this.a(false, 2, 20, (byte) -92, param1);
                                                                                          int fieldTemp$115 = ((eg) this).field_w;
                                                                                          ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                          if (200 < fieldTemp$115) {
                                                                                            ((eg) this).field_w = 0;
                                                                                            ((eg) this).field_z = 0;
                                                                                            ((eg) this).field_x = 3;
                                                                                            break L129;
                                                                                          } else {
                                                                                            break L129;
                                                                                          }
                                                                                        } else {
                                                                                          break L129;
                                                                                        }
                                                                                      }
                                                                                      L131: {
                                                                                        if (3 == ((eg) this).field_x) {
                                                                                          L132: {
                                                                                            ((eg) this).field_n = ((eg) this).field_n - 4;
                                                                                            this.a(20, (byte) 116, param1, false);
                                                                                            ((eg) this).field_n = ((eg) this).field_n + 4;
                                                                                            int fieldTemp$116 = ((eg) this).field_w;
                                                                                            ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                            if (fieldTemp$116 <= 300) {
                                                                                              break L132;
                                                                                            } else {
                                                                                              if (1 != ((eg) this).b(param1, param0 ^ 121)) {
                                                                                                break L132;
                                                                                              } else {
                                                                                                if (((eg) this).field_f.field_a == 0) {
                                                                                                  ((eg) this).field_x = 0;
                                                                                                  ((eg) this).field_w = 0;
                                                                                                  break L132;
                                                                                                } else {
                                                                                                  break L132;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          L133: {
                                                                                            if (((eg) this).field_w % 100 == 25) {
                                                                                              ii.field_e[od.field_k].a(9147, 42, ((eg) this).field_i);
                                                                                              ii.field_e[od.field_k].field_f.a(param0 ^ 26, ((eg) this).field_f);
                                                                                              ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + (((eg) this).field_h * 120 + 40);
                                                                                              ii.field_e[od.field_k].field_f.field_a = ii.field_e[od.field_k].field_f.field_a + 40;
                                                                                              ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                                                                                              ii.field_e[od.field_k].field_w = 0;
                                                                                              od.field_k = od.field_k + 1;
                                                                                              if (pk.field_s) {
                                                                                                tl.field_a.a(si.field_j[13], 100, ee.field_p * 256 / 100);
                                                                                                break L133;
                                                                                              } else {
                                                                                                break L133;
                                                                                              }
                                                                                            } else {
                                                                                              break L133;
                                                                                            }
                                                                                          }
                                                                                          L134: {
                                                                                            if (((eg) this).field_w % 100 <= 20) {
                                                                                              break L134;
                                                                                            } else {
                                                                                              if (((eg) this).field_w % 100 >= 30) {
                                                                                                break L134;
                                                                                              } else {
                                                                                                ((eg) this).field_n = 26;
                                                                                                break L131;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          if (10 < ((eg) this).field_n) {
                                                                                            ((eg) this).field_n = 6;
                                                                                            break L131;
                                                                                          } else {
                                                                                            break L131;
                                                                                          }
                                                                                        } else {
                                                                                          break L131;
                                                                                        }
                                                                                      }
                                                                                      int discarded$117 = 0;
                                                                                      this.e();
                                                                                      break L2;
                                                                                    } else {
                                                                                      this.a(param0 + 150, param1);
                                                                                      break L2;
                                                                                    }
                                                                                  } else {
                                                                                    this.a(false, param0 ^ -3, param1);
                                                                                    break L2;
                                                                                  }
                                                                                } else {
                                                                                  if (var4 != 33) {
                                                                                    if (var4 != 34) {
                                                                                      L135: {
                                                                                        if (35 != var4) {
                                                                                          if (var4 == 43) {
                                                                                            break L135;
                                                                                          } else {
                                                                                            if (var4 == 36) {
                                                                                              if (((eg) this).field_p <= 0) {
                                                                                                this.a(false, param0 ^ -3, param1);
                                                                                                break L2;
                                                                                              } else {
                                                                                                if (((eg) this).field_r == 0) {
                                                                                                  L136: {
                                                                                                    if (((eg) this).field_x != 0) {
                                                                                                      break L136;
                                                                                                    } else {
                                                                                                      if (ii.field_e[0].field_i.field_a > ((eg) this).field_i.field_a) {
                                                                                                        L137: {
                                                                                                          ((eg) this).field_w = 0;
                                                                                                          if (~ii.field_e[0].field_i.field_b >= ~(((eg) this).field_i.field_b - 5)) {
                                                                                                            ((eg) this).field_h = -1;
                                                                                                            break L137;
                                                                                                          } else {
                                                                                                            break L137;
                                                                                                          }
                                                                                                        }
                                                                                                        ((eg) this).field_e = 30;
                                                                                                        ((eg) this).field_x = 2;
                                                                                                        if (~(((eg) this).field_i.field_b - -5) < ~ii.field_e[0].field_i.field_b) {
                                                                                                          break L136;
                                                                                                        } else {
                                                                                                          ((eg) this).field_h = 1;
                                                                                                          break L136;
                                                                                                        }
                                                                                                      } else {
                                                                                                        this.a(false, 1, 15, (byte) -102, param1);
                                                                                                        break L136;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  L138: {
                                                                                                    if (2 == ((eg) this).field_x) {
                                                                                                      this.a(false, 22, 10, param1);
                                                                                                      break L138;
                                                                                                    } else {
                                                                                                      break L138;
                                                                                                    }
                                                                                                  }
                                                                                                  L139: {
                                                                                                    if (3 == ((eg) this).field_x) {
                                                                                                      this.a(10, param0 ^ 26, false, param1);
                                                                                                      break L139;
                                                                                                    } else {
                                                                                                      break L139;
                                                                                                    }
                                                                                                  }
                                                                                                  L140: {
                                                                                                    if (500 < ((eg) this).field_w) {
                                                                                                      ((eg) this).field_p = 0;
                                                                                                      break L140;
                                                                                                    } else {
                                                                                                      break L140;
                                                                                                    }
                                                                                                  }
                                                                                                  int discarded$118 = 0;
                                                                                                  this.e();
                                                                                                  break L2;
                                                                                                } else {
                                                                                                  ((eg) this).field_r = 0;
                                                                                                  ((eg) this).field_p = 0;
                                                                                                  break L2;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              if (37 == var4) {
                                                                                                if (((eg) this).field_p > 0) {
                                                                                                  if (0 == ((eg) this).field_r) {
                                                                                                    L141: {
                                                                                                      if (((eg) this).field_x != 0) {
                                                                                                        break L141;
                                                                                                      } else {
                                                                                                        L142: {
                                                                                                          this.a(false, 1, 15, (byte) -64, param1);
                                                                                                          if (ii.field_e[0].field_i.field_a <= ((eg) this).field_i.field_a) {
                                                                                                            break L142;
                                                                                                          } else {
                                                                                                            ((eg) this).field_w = ((eg) this).field_w + 5;
                                                                                                            break L142;
                                                                                                          }
                                                                                                        }
                                                                                                        int fieldTemp$119 = ((eg) this).field_w;
                                                                                                        ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                                        if (fieldTemp$119 <= 200) {
                                                                                                          break L141;
                                                                                                        } else {
                                                                                                          L143: {
                                                                                                            ((eg) this).field_w = 0;
                                                                                                            stackOut_1011_0 = this;
                                                                                                            stackIn_1013_0 = stackOut_1011_0;
                                                                                                            stackIn_1012_0 = stackOut_1011_0;
                                                                                                            if (ii.field_e[0].field_i.field_b < ((eg) this).field_i.field_b) {
                                                                                                              stackOut_1013_0 = this;
                                                                                                              stackOut_1013_1 = -1;
                                                                                                              stackIn_1014_0 = stackOut_1013_0;
                                                                                                              stackIn_1014_1 = stackOut_1013_1;
                                                                                                              break L143;
                                                                                                            } else {
                                                                                                              stackOut_1012_0 = this;
                                                                                                              stackOut_1012_1 = 1;
                                                                                                              stackIn_1014_0 = stackOut_1012_0;
                                                                                                              stackIn_1014_1 = stackOut_1012_1;
                                                                                                              break L143;
                                                                                                            }
                                                                                                          }
                                                                                                          ((eg) this).field_h = stackIn_1014_1;
                                                                                                          ((eg) this).field_x = 1;
                                                                                                          break L141;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    L144: {
                                                                                                      if (((eg) this).field_x == 1) {
                                                                                                        ((eg) this).field_n = 19;
                                                                                                        int fieldTemp$120 = ((eg) this).field_w;
                                                                                                        ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                                        if (80 < fieldTemp$120) {
                                                                                                          ((eg) this).field_e = 85;
                                                                                                          ((eg) this).field_x = 2;
                                                                                                          ((eg) this).field_w = 0;
                                                                                                          if (~((eg) this).field_i.field_a <= ~ii.field_e[0].field_i.field_a) {
                                                                                                            ((eg) this).field_e = 35;
                                                                                                            break L144;
                                                                                                          } else {
                                                                                                            break L144;
                                                                                                          }
                                                                                                        } else {
                                                                                                          break L144;
                                                                                                        }
                                                                                                      } else {
                                                                                                        break L144;
                                                                                                      }
                                                                                                    }
                                                                                                    L145: {
                                                                                                      if (((eg) this).field_x != 2) {
                                                                                                        break L145;
                                                                                                      } else {
                                                                                                        this.a(false, 22, 30, param1);
                                                                                                        if (((eg) this).field_x != 0) {
                                                                                                          break L145;
                                                                                                        } else {
                                                                                                          ((eg) this).field_w = (int)(Math.random() * 100.0);
                                                                                                          break L145;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    L146: {
                                                                                                      if (3 != ((eg) this).field_x) {
                                                                                                        break L146;
                                                                                                      } else {
                                                                                                        this.a(15, -80, false, param1);
                                                                                                        if (((eg) this).field_x == 0) {
                                                                                                          ((eg) this).field_w = (int)(Math.random() * 100.0);
                                                                                                          break L146;
                                                                                                        } else {
                                                                                                          break L146;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    int discarded$121 = 0;
                                                                                                    this.e();
                                                                                                    break L2;
                                                                                                  } else {
                                                                                                    this.a(116, param1);
                                                                                                    break L2;
                                                                                                  }
                                                                                                } else {
                                                                                                  this.a(false, 120, param1);
                                                                                                  break L2;
                                                                                                }
                                                                                              } else {
                                                                                                if (var4 != 38) {
                                                                                                  if (var4 != 39) {
                                                                                                    if (40 != var4) {
                                                                                                      if (41 != var4) {
                                                                                                        if (42 != var4) {
                                                                                                          if (var4 == 44) {
                                                                                                            L147: {
                                                                                                              ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                                              if (((eg) this).field_w > 150) {
                                                                                                                ((eg) this).field_k = 1;
                                                                                                                break L147;
                                                                                                              } else {
                                                                                                                break L147;
                                                                                                              }
                                                                                                            }
                                                                                                            ((eg) this).field_f.field_a = ((eg) this).field_f.field_a + 4;
                                                                                                            break L2;
                                                                                                          } else {
                                                                                                            if (var4 != 45) {
                                                                                                              break L2;
                                                                                                            } else {
                                                                                                              L148: {
                                                                                                                ((eg) this).field_n = 36;
                                                                                                                if (((eg) this).field_w % 10 <= 5) {
                                                                                                                  break L148;
                                                                                                                } else {
                                                                                                                  ((eg) this).field_n = 37;
                                                                                                                  break L148;
                                                                                                                }
                                                                                                              }
                                                                                                              L149: {
                                                                                                                int fieldTemp$122 = ((eg) this).field_w;
                                                                                                                ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                                                if (fieldTemp$122 <= 50) {
                                                                                                                  break L149;
                                                                                                                } else {
                                                                                                                  ((eg) this).field_k = 1;
                                                                                                                  break L149;
                                                                                                                }
                                                                                                              }
                                                                                                              int discarded$123 = 0;
                                                                                                              this.e();
                                                                                                              break L2;
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          ((eg) this).field_e = 2;
                                                                                                          ((eg) this).a(1, si.field_j, param1, 1, 50, 0, tl.field_a, pk.field_s, (byte) 126);
                                                                                                          int discarded$124 = 0;
                                                                                                          this.e();
                                                                                                          break L2;
                                                                                                        }
                                                                                                      } else {
                                                                                                        L150: {
                                                                                                          ((eg) this).field_e = 2;
                                                                                                          ((eg) this).a(1, si.field_j, param1, 1, 100, 0, tl.field_a, pk.field_s, (byte) -126);
                                                                                                          int discarded$125 = 0;
                                                                                                          this.e();
                                                                                                          ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                                          if (((eg) this).field_w % 10 >= 5) {
                                                                                                            ((eg) this).field_n = 37;
                                                                                                            break L150;
                                                                                                          } else {
                                                                                                            ((eg) this).field_n = 18;
                                                                                                            break L150;
                                                                                                          }
                                                                                                        }
                                                                                                        L151: {
                                                                                                          if (50 > ((eg) this).field_w % 100) {
                                                                                                            ((eg) this).field_f.field_a = ((eg) this).field_f.field_a + (-(((eg) this).field_w % 50) + 25) / 4;
                                                                                                            break L151;
                                                                                                          } else {
                                                                                                            ((eg) this).field_f.field_a = ((eg) this).field_f.field_a + (-25 + ((eg) this).field_w % 50) / 4;
                                                                                                            break L151;
                                                                                                          }
                                                                                                        }
                                                                                                        int discarded$126 = 0;
                                                                                                        this.e();
                                                                                                        break L2;
                                                                                                      }
                                                                                                    } else {
                                                                                                      if (((eg) this).field_p > 0) {
                                                                                                        L152: {
                                                                                                          if (ql.field_c < 5) {
                                                                                                            me.field_f = me.field_f - 5;
                                                                                                            hi.field_c = hi.field_c - ql.field_c;
                                                                                                            ql.field_c = 5;
                                                                                                            break L152;
                                                                                                          } else {
                                                                                                            break L152;
                                                                                                          }
                                                                                                        }
                                                                                                        L153: {
                                                                                                          if (((eg) this).field_s <= 0) {
                                                                                                            break L153;
                                                                                                          } else {
                                                                                                            L154: {
                                                                                                              if (ql.field_c != 6) {
                                                                                                                break L154;
                                                                                                              } else {
                                                                                                                ii.field_e[od.field_k].a(param0 ^ -9154, 36, ((eg) this).field_i);
                                                                                                                ii.field_e[od.field_k].field_f.a(-110, ((eg) this).field_f);
                                                                                                                ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + (40 + ((eg) this).field_h * 120);
                                                                                                                ii.field_e[od.field_k].field_f.field_a = ii.field_e[od.field_k].field_f.field_a + 40;
                                                                                                                ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                                                                                                                ii.field_e[od.field_k].field_w = 0;
                                                                                                                od.field_k = od.field_k + 1;
                                                                                                                break L154;
                                                                                                              }
                                                                                                            }
                                                                                                            L155: {
                                                                                                              ((eg) this).field_p = ((eg) this).field_p - 1;
                                                                                                              ((eg) this).field_s = ((eg) this).field_s - 1;
                                                                                                              if (((eg) this).field_p <= 0) {
                                                                                                                int discarded$127 = 0;
                                                                                                                this.c();
                                                                                                                break L155;
                                                                                                              } else {
                                                                                                                break L155;
                                                                                                              }
                                                                                                            }
                                                                                                            if (pk.field_s) {
                                                                                                              tl.field_a.a(si.field_j[28], 100, 256 * ee.field_p / 100);
                                                                                                              break L153;
                                                                                                            } else {
                                                                                                              break L153;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        L156: {
                                                                                                          if (5 == ql.field_c) {
                                                                                                            L157: {
                                                                                                              ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                                              ((eg) this).field_d = 80;
                                                                                                              int fieldTemp$128 = ((eg) this).field_z;
                                                                                                              ((eg) this).field_z = ((eg) this).field_z - 1;
                                                                                                              if (0 > fieldTemp$128) {
                                                                                                                ((eg) this).field_z = 10;
                                                                                                                ((eg) this).field_n = ((eg) this).field_n + 1;
                                                                                                                if (((eg) this).field_n <= 3) {
                                                                                                                  break L157;
                                                                                                                } else {
                                                                                                                  ((eg) this).field_n = 0;
                                                                                                                  break L157;
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L157;
                                                                                                              }
                                                                                                            }
                                                                                                            L158: {
                                                                                                              L159: {
                                                                                                                if (((eg) this).field_w == 500) {
                                                                                                                  break L159;
                                                                                                                } else {
                                                                                                                  if (((eg) this).field_w == 2500) {
                                                                                                                    break L159;
                                                                                                                  } else {
                                                                                                                    break L158;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                              ii.field_e[od.field_k].a(param0 + 9270, 39, ((eg) this).field_i);
                                                                                                              ii.field_e[od.field_k].field_i.field_b = 0;
                                                                                                              ii.field_e[od.field_k].field_i.field_a = 15;
                                                                                                              ii.field_e[od.field_k].field_h = 1;
                                                                                                              ii.field_e[od.field_k].field_w = 0;
                                                                                                              od.field_k = od.field_k + 1;
                                                                                                              break L158;
                                                                                                            }
                                                                                                            L160: {
                                                                                                              if (((eg) this).field_w == 1500) {
                                                                                                                ii.field_e[od.field_k].a(param0 ^ -9154, 39, ((eg) this).field_i);
                                                                                                                ii.field_e[od.field_k].field_i.field_b = 19;
                                                                                                                ii.field_e[od.field_k].field_i.field_a = 15;
                                                                                                                ii.field_e[od.field_k].field_h = 1;
                                                                                                                ii.field_e[od.field_k].field_w = 0;
                                                                                                                od.field_k = od.field_k + 1;
                                                                                                                break L160;
                                                                                                              } else {
                                                                                                                break L160;
                                                                                                              }
                                                                                                            }
                                                                                                            L161: {
                                                                                                              if (3000 < ((eg) this).field_w) {
                                                                                                                break L161;
                                                                                                              } else {
                                                                                                                if (((eg) this).field_p < 150) {
                                                                                                                  break L161;
                                                                                                                } else {
                                                                                                                  break L156;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            ((eg) this).field_d = 96;
                                                                                                            wg.field_b = wg.field_b - ql.field_c;
                                                                                                            ic.field_a = ic.field_a - 6;
                                                                                                            ((eg) this).field_n = 0;
                                                                                                            ((eg) this).field_w = 0;
                                                                                                            ((eg) this).field_f.field_b = ((eg) this).field_f.field_b - 40;
                                                                                                            ql.field_c = 6;
                                                                                                            ((eg) this).field_x = 0;
                                                                                                            if (pk.field_s) {
                                                                                                              tl.field_a.a(si.field_j[22], 100, ee.field_p * 256 / 100);
                                                                                                              break L156;
                                                                                                            } else {
                                                                                                              break L156;
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L156;
                                                                                                          }
                                                                                                        }
                                                                                                        L162: {
                                                                                                          if (ql.field_c != 6) {
                                                                                                            break L162;
                                                                                                          } else {
                                                                                                            L163: {
                                                                                                              L164: {
                                                                                                                if (0 == ((eg) this).field_x) {
                                                                                                                  break L164;
                                                                                                                } else {
                                                                                                                  if (((eg) this).field_x != 1) {
                                                                                                                    break L163;
                                                                                                                  } else {
                                                                                                                    break L164;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                              L165: {
                                                                                                                ((eg) this).field_n = 0;
                                                                                                                if (((eg) this).field_w >= 0) {
                                                                                                                  break L165;
                                                                                                                } else {
                                                                                                                  ((eg) this).field_n = 3;
                                                                                                                  break L165;
                                                                                                                }
                                                                                                              }
                                                                                                              int fieldTemp$129 = ((eg) this).field_w;
                                                                                                              ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                                              if (10 >= fieldTemp$129) {
                                                                                                                break L163;
                                                                                                              } else {
                                                                                                                L166: {
                                                                                                                  ((eg) this).field_w = 0;
                                                                                                                  ((eg) this).field_e = 100;
                                                                                                                  ((eg) this).field_x = 2;
                                                                                                                  if (ii.field_e[0].field_i.field_a > ((eg) this).field_i.field_a) {
                                                                                                                    break L166;
                                                                                                                  } else {
                                                                                                                    ((eg) this).field_e = 70;
                                                                                                                    break L166;
                                                                                                                  }
                                                                                                                }
                                                                                                                L167: {
                                                                                                                  stackOut_1125_0 = this;
                                                                                                                  stackIn_1127_0 = stackOut_1125_0;
                                                                                                                  stackIn_1126_0 = stackOut_1125_0;
                                                                                                                  if (((eg) this).field_i.field_b > ii.field_e[0].field_i.field_b) {
                                                                                                                    stackOut_1127_0 = this;
                                                                                                                    stackOut_1127_1 = -1;
                                                                                                                    stackIn_1128_0 = stackOut_1127_0;
                                                                                                                    stackIn_1128_1 = stackOut_1127_1;
                                                                                                                    break L167;
                                                                                                                  } else {
                                                                                                                    stackOut_1126_0 = this;
                                                                                                                    stackOut_1126_1 = 1;
                                                                                                                    stackIn_1128_0 = stackOut_1126_0;
                                                                                                                    stackIn_1128_1 = stackOut_1126_1;
                                                                                                                    break L167;
                                                                                                                  }
                                                                                                                }
                                                                                                                ((eg) this).field_h = stackIn_1128_1;
                                                                                                                break L163;
                                                                                                              }
                                                                                                            }
                                                                                                            L168: {
                                                                                                              if (2 != ((eg) this).field_x) {
                                                                                                                break L168;
                                                                                                              } else {
                                                                                                                this.a(true, 22, 15, param1);
                                                                                                                ((eg) this).field_n = 1;
                                                                                                                if (((eg) this).field_e >= 60) {
                                                                                                                  break L168;
                                                                                                                } else {
                                                                                                                  ((eg) this).field_n = 2;
                                                                                                                  break L168;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            L169: {
                                                                                                              if (3 == ((eg) this).field_x) {
                                                                                                                this.a(15, param0 + 7, true, param1);
                                                                                                                ((eg) this).field_n = 2;
                                                                                                                if (((eg) this).field_x == 0) {
                                                                                                                  L170: {
                                                                                                                    ((eg) this).field_w = -10;
                                                                                                                    if (~((eg) this).field_i.field_a >= ~ii.field_e[0].field_i.field_a) {
                                                                                                                      break L170;
                                                                                                                    } else {
                                                                                                                      if (((eg) this).field_i.field_a <= 2) {
                                                                                                                        break L170;
                                                                                                                      } else {
                                                                                                                        ((eg) this).field_i.field_a = ((eg) this).field_i.field_a - 1;
                                                                                                                        ((eg) this).field_f.field_a = ((eg) this).field_f.field_a + 230;
                                                                                                                        ((eg) this).field_x = 3;
                                                                                                                        break L169;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                  ((eg) this).field_n = 3;
                                                                                                                  ii.field_e[od.field_k].a(9147, 45, ((eg) this).field_i);
                                                                                                                  ii.field_e[od.field_k].field_f.a(-88, ((eg) this).field_f);
                                                                                                                  ii.field_e[od.field_k].field_w = 0;
                                                                                                                  od.field_k = od.field_k + 1;
                                                                                                                  if (!pk.field_s) {
                                                                                                                    break L169;
                                                                                                                  } else {
                                                                                                                    tl.field_a.a(si.field_j[5], 100, ee.field_p * 256 / 100);
                                                                                                                    break L169;
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  break L169;
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L169;
                                                                                                              }
                                                                                                            }
                                                                                                            L171: {
                                                                                                              if (75 <= ((eg) this).field_p) {
                                                                                                                break L171;
                                                                                                              } else {
                                                                                                                if (((eg) this).field_x != 4) {
                                                                                                                  ((eg) this).field_e = 60;
                                                                                                                  ((eg) this).field_x = 4;
                                                                                                                  break L171;
                                                                                                                } else {
                                                                                                                  break L171;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            if (((eg) this).field_x != 4) {
                                                                                                              break L162;
                                                                                                            } else {
                                                                                                              L172: {
                                                                                                                this.a(10, param0 ^ 20, true, param1);
                                                                                                                if (3 == ((eg) this).field_x) {
                                                                                                                  ((eg) this).field_x = 4;
                                                                                                                  break L172;
                                                                                                                } else {
                                                                                                                  break L172;
                                                                                                                }
                                                                                                              }
                                                                                                              ((eg) this).field_n = 31;
                                                                                                              if (((eg) this).field_x == 0) {
                                                                                                                if (2 >= ((eg) this).field_i.field_a) {
                                                                                                                  L173: {
                                                                                                                    ((eg) this).field_i.field_a = 2;
                                                                                                                    ((eg) this).field_n = 2;
                                                                                                                    ((eg) this).field_f.field_a = 0;
                                                                                                                    me.field_f = me.field_f + ql.field_c;
                                                                                                                    w.field_b = 0;
                                                                                                                    hi.field_c = hi.field_c + 7;
                                                                                                                    ((eg) this).field_x = 0;
                                                                                                                    ((eg) this).field_d = 128;
                                                                                                                    ((eg) this).field_w = 0;
                                                                                                                    ql.field_c = 7;
                                                                                                                    ((eg) this).field_f.field_b = ((eg) this).field_f.field_b - 40;
                                                                                                                    ((eg) this).field_n = 0;
                                                                                                                    stackOut_1153_0 = 0;
                                                                                                                    stackIn_1155_0 = stackOut_1153_0;
                                                                                                                    stackIn_1154_0 = stackOut_1153_0;
                                                                                                                    if (pk.field_s) {
                                                                                                                      stackOut_1155_0 = stackIn_1155_0;
                                                                                                                      stackOut_1155_1 = 0;
                                                                                                                      stackIn_1156_0 = stackOut_1155_0;
                                                                                                                      stackIn_1156_1 = stackOut_1155_1;
                                                                                                                      break L173;
                                                                                                                    } else {
                                                                                                                      stackOut_1154_0 = stackIn_1154_0;
                                                                                                                      stackOut_1154_1 = 1;
                                                                                                                      stackIn_1156_0 = stackOut_1154_0;
                                                                                                                      stackIn_1156_1 = stackOut_1154_1;
                                                                                                                      break L173;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  if (stackIn_1156_0 != stackIn_1156_1) {
                                                                                                                    break L162;
                                                                                                                  } else {
                                                                                                                    tl.field_a.a(si.field_j[5], 100, 256 * ee.field_p / 100);
                                                                                                                    break L162;
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  ((eg) this).field_i.field_a = ((eg) this).field_i.field_a - 1;
                                                                                                                  ((eg) this).field_x = 4;
                                                                                                                  ((eg) this).field_f.field_a = ((eg) this).field_f.field_a + 230;
                                                                                                                  break L162;
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L162;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        L174: {
                                                                                                          if (ql.field_c == 7) {
                                                                                                            if (w.field_b < 250) {
                                                                                                              L175: {
                                                                                                                int fieldTemp$130 = ((eg) this).field_z;
                                                                                                                ((eg) this).field_z = ((eg) this).field_z - 1;
                                                                                                                if (0 >= fieldTemp$130) {
                                                                                                                  L176: {
                                                                                                                    ((eg) this).field_n = ((eg) this).field_n + 1;
                                                                                                                    if (((eg) this).field_n <= 1) {
                                                                                                                      break L176;
                                                                                                                    } else {
                                                                                                                      ((eg) this).field_n = 0;
                                                                                                                      break L176;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  ((eg) this).field_z = 5;
                                                                                                                  break L175;
                                                                                                                } else {
                                                                                                                  break L175;
                                                                                                                }
                                                                                                              }
                                                                                                              L177: {
                                                                                                                ((eg) this).field_o = 7;
                                                                                                                ((eg) this).field_p = 75;
                                                                                                                w.field_b = w.field_b + 1;
                                                                                                                if (200 >= w.field_b) {
                                                                                                                  break L177;
                                                                                                                } else {
                                                                                                                  L178: {
                                                                                                                    ((eg) this).field_n = 23;
                                                                                                                    stackOut_1208_0 = 0;
                                                                                                                    stackIn_1210_0 = stackOut_1208_0;
                                                                                                                    stackIn_1209_0 = stackOut_1208_0;
                                                                                                                    if (pk.field_s) {
                                                                                                                      stackOut_1210_0 = stackIn_1210_0;
                                                                                                                      stackOut_1210_1 = 0;
                                                                                                                      stackIn_1211_0 = stackOut_1210_0;
                                                                                                                      stackIn_1211_1 = stackOut_1210_1;
                                                                                                                      break L178;
                                                                                                                    } else {
                                                                                                                      stackOut_1209_0 = stackIn_1209_0;
                                                                                                                      stackOut_1209_1 = 1;
                                                                                                                      stackIn_1211_0 = stackOut_1209_0;
                                                                                                                      stackIn_1211_1 = stackOut_1209_1;
                                                                                                                      break L178;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  if (stackIn_1211_0 == stackIn_1211_1) {
                                                                                                                    tl.field_a.a(si.field_j[22], 100, 256 * ee.field_p / 100);
                                                                                                                    break L177;
                                                                                                                  } else {
                                                                                                                    break L177;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                              if (250 <= w.field_b) {
                                                                                                                ((eg) this).field_z = 0;
                                                                                                                ((eg) this).field_x = 0;
                                                                                                                ((eg) this).field_w = 0;
                                                                                                                ((eg) this).field_n = 25;
                                                                                                                break L174;
                                                                                                              } else {
                                                                                                                break L174;
                                                                                                              }
                                                                                                            } else {
                                                                                                              L179: {
                                                                                                                if (((eg) this).field_x != 0) {
                                                                                                                  break L179;
                                                                                                                } else {
                                                                                                                  L180: {
                                                                                                                    ((eg) this).field_z = ((eg) this).field_z + 1;
                                                                                                                    if (10 < ((eg) this).field_z) {
                                                                                                                      L181: {
                                                                                                                        ((eg) this).field_n = ((eg) this).field_n + 1;
                                                                                                                        if (((eg) this).field_n == 27) {
                                                                                                                          ii.field_e[od.field_k].a(9147, 41, ((eg) this).field_i);
                                                                                                                          ii.field_e[od.field_k].field_f.a(-85, ((eg) this).field_f);
                                                                                                                          ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + (40 + ((eg) this).field_h * 120);
                                                                                                                          ii.field_e[od.field_k].field_f.field_a = ii.field_e[od.field_k].field_f.field_a + 40;
                                                                                                                          ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                                                                                                                          ii.field_e[od.field_k].field_w = (int)(Math.random() * 100.0);
                                                                                                                          od.field_k = od.field_k + 1;
                                                                                                                          if (pk.field_s) {
                                                                                                                            tl.field_a.a(nl.field_q[36], 100, 192 * ee.field_p / 100);
                                                                                                                            break L181;
                                                                                                                          } else {
                                                                                                                            break L181;
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          break L181;
                                                                                                                        }
                                                                                                                      }
                                                                                                                      L182: {
                                                                                                                        if (25 > ((eg) this).field_n) {
                                                                                                                          ((eg) this).field_n = 25;
                                                                                                                          break L182;
                                                                                                                        } else {
                                                                                                                          break L182;
                                                                                                                        }
                                                                                                                      }
                                                                                                                      if (((eg) this).field_n > 27) {
                                                                                                                        ((eg) this).field_n = 19;
                                                                                                                        ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                                                        break L180;
                                                                                                                      } else {
                                                                                                                        break L180;
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      break L180;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  if (((eg) this).field_w <= 8) {
                                                                                                                    break L179;
                                                                                                                  } else {
                                                                                                                    L183: {
                                                                                                                      ((eg) this).field_w = 0;
                                                                                                                      ((eg) this).field_x = 2;
                                                                                                                      ((eg) this).field_z = 0;
                                                                                                                      ((eg) this).field_e = 5;
                                                                                                                      if (ii.field_e[0].field_i.field_a <= 2 + ((eg) this).field_i.field_a) {
                                                                                                                        break L183;
                                                                                                                      } else {
                                                                                                                        ((eg) this).field_e = 80;
                                                                                                                        break L183;
                                                                                                                      }
                                                                                                                    }
                                                                                                                    if (~ii.field_e[0].field_i.field_a > ~((eg) this).field_i.field_a) {
                                                                                                                      ((eg) this).field_i.field_a = ((eg) this).field_i.field_a - 1;
                                                                                                                      ((eg) this).field_f.field_a = ((eg) this).field_f.field_a + 230;
                                                                                                                      ((eg) this).field_e = -5;
                                                                                                                      ((eg) this).field_x = 3;
                                                                                                                      break L179;
                                                                                                                    } else {
                                                                                                                      break L179;
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                              L184: {
                                                                                                                if (((eg) this).field_x != 2) {
                                                                                                                  break L184;
                                                                                                                } else {
                                                                                                                  L185: {
                                                                                                                    this.a(false, 22, 25, param1);
                                                                                                                    if (((eg) this).field_e > 0) {
                                                                                                                      break L185;
                                                                                                                    } else {
                                                                                                                      ((eg) this).field_x = 3;
                                                                                                                      break L185;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  ((eg) this).field_n = 21;
                                                                                                                  break L184;
                                                                                                                }
                                                                                                              }
                                                                                                              if (((eg) this).field_x != 3) {
                                                                                                                break L174;
                                                                                                              } else {
                                                                                                                L186: {
                                                                                                                  var4 = 40;
                                                                                                                  if (~ii.field_e[0].field_i.field_a > ~(-2 + ((eg) this).field_i.field_a)) {
                                                                                                                    var4 = 20;
                                                                                                                    break L186;
                                                                                                                  } else {
                                                                                                                    break L186;
                                                                                                                  }
                                                                                                                }
                                                                                                                L187: {
                                                                                                                  this.a(var4, (byte) -82, param1, true);
                                                                                                                  int fieldTemp$131 = ((eg) this).field_w;
                                                                                                                  ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                                                  if (fieldTemp$131 <= 25) {
                                                                                                                    break L187;
                                                                                                                  } else {
                                                                                                                    if (((eg) this).b(param1, -4) != 1) {
                                                                                                                      break L187;
                                                                                                                    } else {
                                                                                                                      if (((eg) this).field_f.field_a == 0) {
                                                                                                                        L188: {
                                                                                                                          ((eg) this).field_n = 25;
                                                                                                                          ((eg) this).field_w = 0;
                                                                                                                          ((eg) this).field_z = 0;
                                                                                                                          stackOut_1193_0 = this;
                                                                                                                          stackIn_1195_0 = stackOut_1193_0;
                                                                                                                          stackIn_1194_0 = stackOut_1193_0;
                                                                                                                          if (ii.field_e[0].field_i.field_b >= ((eg) this).field_i.field_b) {
                                                                                                                            stackOut_1195_0 = this;
                                                                                                                            stackOut_1195_1 = 1;
                                                                                                                            stackIn_1196_0 = stackOut_1195_0;
                                                                                                                            stackIn_1196_1 = stackOut_1195_1;
                                                                                                                            break L188;
                                                                                                                          } else {
                                                                                                                            stackOut_1194_0 = this;
                                                                                                                            stackOut_1194_1 = -1;
                                                                                                                            stackIn_1196_0 = stackOut_1194_0;
                                                                                                                            stackIn_1196_1 = stackOut_1194_1;
                                                                                                                            break L188;
                                                                                                                          }
                                                                                                                        }
                                                                                                                        L189: {
                                                                                                                          ((eg) this).field_h = stackIn_1196_1;
                                                                                                                          ((eg) this).field_x = 0;
                                                                                                                          stackOut_1196_0 = 0;
                                                                                                                          stackIn_1198_0 = stackOut_1196_0;
                                                                                                                          stackIn_1197_0 = stackOut_1196_0;
                                                                                                                          if (pk.field_s) {
                                                                                                                            stackOut_1198_0 = stackIn_1198_0;
                                                                                                                            stackOut_1198_1 = 0;
                                                                                                                            stackIn_1199_0 = stackOut_1198_0;
                                                                                                                            stackIn_1199_1 = stackOut_1198_1;
                                                                                                                            break L189;
                                                                                                                          } else {
                                                                                                                            stackOut_1197_0 = stackIn_1197_0;
                                                                                                                            stackOut_1197_1 = 1;
                                                                                                                            stackIn_1199_0 = stackOut_1197_0;
                                                                                                                            stackIn_1199_1 = stackOut_1197_1;
                                                                                                                            break L189;
                                                                                                                          }
                                                                                                                        }
                                                                                                                        if (stackIn_1199_0 != stackIn_1199_1) {
                                                                                                                          break L187;
                                                                                                                        } else {
                                                                                                                          tl.field_a.a(si.field_j[5], 100, 256 * ee.field_p / 100);
                                                                                                                          break L174;
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        int discarded$132 = 0;
                                                                                                                        this.e();
                                                                                                                        break L2;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                break L174;
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L174;
                                                                                                          }
                                                                                                        }
                                                                                                        int discarded$133 = 0;
                                                                                                        this.e();
                                                                                                        break L2;
                                                                                                      } else {
                                                                                                        this.a(true, 120, param1);
                                                                                                        break L2;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    if (((eg) this).field_p > 0) {
                                                                                                      if (((eg) this).field_r != 0) {
                                                                                                        this.a(35, param1);
                                                                                                        break L2;
                                                                                                      } else {
                                                                                                        L190: {
                                                                                                          if (((eg) this).field_x != 0) {
                                                                                                            break L190;
                                                                                                          } else {
                                                                                                            L191: {
                                                                                                              if (ii.field_e[0].field_i.field_a > ((eg) this).field_i.field_a) {
                                                                                                                ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                                                break L191;
                                                                                                              } else {
                                                                                                                break L191;
                                                                                                              }
                                                                                                            }
                                                                                                            this.a(false, 2, 20, (byte) -122, param1);
                                                                                                            int fieldTemp$134 = ((eg) this).field_w;
                                                                                                            ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                                            if (200 < fieldTemp$134) {
                                                                                                              ((eg) this).field_x = 3;
                                                                                                              ((eg) this).field_z = 0;
                                                                                                              ((eg) this).field_w = 0;
                                                                                                              break L190;
                                                                                                            } else {
                                                                                                              break L190;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        L192: {
                                                                                                          if (((eg) this).field_x == 3) {
                                                                                                            L193: {
                                                                                                              ((eg) this).field_n = ((eg) this).field_n - 4;
                                                                                                              this.a(10, (byte) -13, param1, false);
                                                                                                              this.a(10, (byte) 118, param1, false);
                                                                                                              ((eg) this).field_n = ((eg) this).field_n + 4;
                                                                                                              int fieldTemp$135 = ((eg) this).field_w;
                                                                                                              ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                                              if (fieldTemp$135 <= 300) {
                                                                                                                break L193;
                                                                                                              } else {
                                                                                                                if (((eg) this).b(param1, -4) != 1) {
                                                                                                                  break L193;
                                                                                                                } else {
                                                                                                                  if (((eg) this).field_f.field_a == 0) {
                                                                                                                    ((eg) this).field_w = 0;
                                                                                                                    ((eg) this).field_x = 0;
                                                                                                                    break L193;
                                                                                                                  } else {
                                                                                                                    break L193;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            if (((eg) this).field_n > 10) {
                                                                                                              ((eg) this).field_n = 6;
                                                                                                              break L192;
                                                                                                            } else {
                                                                                                              break L192;
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L192;
                                                                                                          }
                                                                                                        }
                                                                                                        int discarded$136 = 0;
                                                                                                        this.e();
                                                                                                        break L2;
                                                                                                      }
                                                                                                    } else {
                                                                                                      this.a(false, param0 ^ -3, param1);
                                                                                                      break L2;
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  if (((eg) this).field_p <= 0) {
                                                                                                    this.a(false, 120, param1);
                                                                                                    break L2;
                                                                                                  } else {
                                                                                                    if (((eg) this).field_r != 0) {
                                                                                                      this.a(60, param1);
                                                                                                      break L2;
                                                                                                    } else {
                                                                                                      L194: {
                                                                                                        if (0 == ((eg) this).field_x) {
                                                                                                          L195: {
                                                                                                            if (((eg) this).field_i.field_a < ii.field_e[0].field_i.field_a) {
                                                                                                              ((eg) this).field_w = ((eg) this).field_w + 5;
                                                                                                              break L195;
                                                                                                            } else {
                                                                                                              break L195;
                                                                                                            }
                                                                                                          }
                                                                                                          this.a(false, 1, 25, (byte) -90, param1);
                                                                                                          int fieldTemp$137 = ((eg) this).field_w;
                                                                                                          ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                                          if (200 < fieldTemp$137) {
                                                                                                            L196: {
                                                                                                              stackOut_1039_0 = this;
                                                                                                              stackIn_1041_0 = stackOut_1039_0;
                                                                                                              stackIn_1040_0 = stackOut_1039_0;
                                                                                                              if (((eg) this).field_i.field_b <= ii.field_e[0].field_i.field_b) {
                                                                                                                stackOut_1041_0 = this;
                                                                                                                stackOut_1041_1 = 1;
                                                                                                                stackIn_1042_0 = stackOut_1041_0;
                                                                                                                stackIn_1042_1 = stackOut_1041_1;
                                                                                                                break L196;
                                                                                                              } else {
                                                                                                                stackOut_1040_0 = this;
                                                                                                                stackOut_1040_1 = -1;
                                                                                                                stackIn_1042_0 = stackOut_1040_0;
                                                                                                                stackIn_1042_1 = stackOut_1040_1;
                                                                                                                break L196;
                                                                                                              }
                                                                                                            }
                                                                                                            ((eg) this).field_h = stackIn_1042_1;
                                                                                                            ((eg) this).field_x = 1;
                                                                                                            ((eg) this).field_w = 0;
                                                                                                            break L194;
                                                                                                          } else {
                                                                                                            break L194;
                                                                                                          }
                                                                                                        } else {
                                                                                                          break L194;
                                                                                                        }
                                                                                                      }
                                                                                                      L197: {
                                                                                                        if (((eg) this).field_x == 1) {
                                                                                                          ((eg) this).field_n = 19;
                                                                                                          int fieldTemp$138 = ((eg) this).field_w;
                                                                                                          ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                                          if (fieldTemp$138 > 20) {
                                                                                                            ((eg) this).field_w = 0;
                                                                                                            ((eg) this).field_e = 70;
                                                                                                            ((eg) this).field_x = 2;
                                                                                                            if (~((eg) this).field_i.field_a <= ~ii.field_e[0].field_i.field_a) {
                                                                                                              ((eg) this).field_e = 40;
                                                                                                              break L197;
                                                                                                            } else {
                                                                                                              break L197;
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L197;
                                                                                                          }
                                                                                                        } else {
                                                                                                          break L197;
                                                                                                        }
                                                                                                      }
                                                                                                      L198: {
                                                                                                        if (2 != ((eg) this).field_x) {
                                                                                                          break L198;
                                                                                                        } else {
                                                                                                          this.a(false, param0 ^ -109, 25, param1);
                                                                                                          if (0 == ((eg) this).field_x) {
                                                                                                            ((eg) this).field_w = (int)(100.0 * Math.random());
                                                                                                            break L198;
                                                                                                          } else {
                                                                                                            break L198;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      L199: {
                                                                                                        if (((eg) this).field_x == 3) {
                                                                                                          this.a(25, -81, false, param1);
                                                                                                          if (((eg) this).field_x != 0) {
                                                                                                            break L199;
                                                                                                          } else {
                                                                                                            ((eg) this).field_w = (int)(100.0 * Math.random());
                                                                                                            break L199;
                                                                                                          }
                                                                                                        } else {
                                                                                                          break L199;
                                                                                                        }
                                                                                                      }
                                                                                                      int discarded$139 = 0;
                                                                                                      this.e();
                                                                                                      break L2;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          break L135;
                                                                                        }
                                                                                      }
                                                                                      L200: {
                                                                                        if (((eg) this).field_w <= 2) {
                                                                                          ((eg) this).a(1, si.field_j, param1, 1, 40, 0, tl.field_a, pk.field_s, (byte) -123);
                                                                                          break L200;
                                                                                        } else {
                                                                                          break L200;
                                                                                        }
                                                                                      }
                                                                                      L201: {
                                                                                        int discarded$140 = 0;
                                                                                        this.e();
                                                                                        if (1 != ((eg) this).b(param1, -4)) {
                                                                                          break L201;
                                                                                        } else {
                                                                                          if (0 != ((eg) this).field_f.field_a) {
                                                                                            break L201;
                                                                                          } else {
                                                                                            if (((eg) this).field_w > 2) {
                                                                                              break L201;
                                                                                            } else {
                                                                                              L202: {
                                                                                                ((eg) this).field_e = 5;
                                                                                                stackOut_969_0 = 0;
                                                                                                stackIn_971_0 = stackOut_969_0;
                                                                                                stackIn_970_0 = stackOut_969_0;
                                                                                                if (pk.field_s) {
                                                                                                  stackOut_971_0 = stackIn_971_0;
                                                                                                  stackOut_971_1 = 0;
                                                                                                  stackIn_972_0 = stackOut_971_0;
                                                                                                  stackIn_972_1 = stackOut_971_1;
                                                                                                  break L202;
                                                                                                } else {
                                                                                                  stackOut_970_0 = stackIn_970_0;
                                                                                                  stackOut_970_1 = 1;
                                                                                                  stackIn_972_0 = stackOut_970_0;
                                                                                                  stackIn_972_1 = stackOut_970_1;
                                                                                                  break L202;
                                                                                                }
                                                                                              }
                                                                                              L203: {
                                                                                                if (stackIn_972_0 == stackIn_972_1) {
                                                                                                  tl.field_a.a(si.field_j[14], 100, ee.field_p * 256 / 100);
                                                                                                  break L203;
                                                                                                } else {
                                                                                                  break L203;
                                                                                                }
                                                                                              }
                                                                                              ii.field_e[od.field_k].a(9147, ((eg) this).field_B, ((eg) this).field_i);
                                                                                              ii.field_e[od.field_k].field_f.a(-112, ((eg) this).field_f);
                                                                                              ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                                                                                              ii.field_e[od.field_k].field_w = 11;
                                                                                              od.field_k = od.field_k + 1;
                                                                                              break L201;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      L204: {
                                                                                        ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                        if (((eg) this).field_w == 2) {
                                                                                          ((eg) this).field_w = 0;
                                                                                          break L204;
                                                                                        } else {
                                                                                          break L204;
                                                                                        }
                                                                                      }
                                                                                      if (((eg) this).field_w < 30) {
                                                                                        break L2;
                                                                                      } else {
                                                                                        ((eg) this).field_k = 1;
                                                                                        break L2;
                                                                                      }
                                                                                    } else {
                                                                                      ((eg) this).field_e = 2;
                                                                                      ((eg) this).a(1, si.field_j, param1, 1, 60, 0, tl.field_a, pk.field_s, (byte) 126);
                                                                                      int discarded$141 = 0;
                                                                                      this.e();
                                                                                      break L2;
                                                                                    }
                                                                                  } else {
                                                                                    if (250 <= w.field_b) {
                                                                                      if (((eg) this).field_p <= 0) {
                                                                                        this.a(true, 120, param1);
                                                                                        break L2;
                                                                                      } else {
                                                                                        L205: {
                                                                                          var4 = 10;
                                                                                          if (50 > ((eg) this).field_p) {
                                                                                            var4 = 15;
                                                                                            break L205;
                                                                                          } else {
                                                                                            break L205;
                                                                                          }
                                                                                        }
                                                                                        L206: {
                                                                                          if (15 <= ((eg) this).field_p) {
                                                                                            break L206;
                                                                                          } else {
                                                                                            var4 = 20;
                                                                                            break L206;
                                                                                          }
                                                                                        }
                                                                                        L207: {
                                                                                          this.a(var4, (byte) -113, param1, true);
                                                                                          ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                          if (25 != ((eg) this).field_w % 50) {
                                                                                            break L207;
                                                                                          } else {
                                                                                            if (((eg) this).field_w < 250) {
                                                                                              ii.field_e[od.field_k].a(9147, 43, ((eg) this).field_i);
                                                                                              ii.field_e[od.field_k].field_f.a(-112, ((eg) this).field_f);
                                                                                              ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + (((eg) this).field_h * 120 - -40);
                                                                                              ii.field_e[od.field_k].field_f.field_a = ii.field_e[od.field_k].field_f.field_a + 40;
                                                                                              ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                                                                                              ii.field_e[od.field_k].field_w = 0;
                                                                                              od.field_k = od.field_k + 1;
                                                                                              if (!pk.field_s) {
                                                                                                break L207;
                                                                                              } else {
                                                                                                tl.field_a.a(si.field_j[13], 100, 256 * ee.field_p / 100);
                                                                                                break L207;
                                                                                              }
                                                                                            } else {
                                                                                              break L207;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L208: {
                                                                                          if (((eg) this).field_w < 250) {
                                                                                            L209: {
                                                                                              if (((eg) this).field_w % 50 <= 5) {
                                                                                                break L209;
                                                                                              } else {
                                                                                                if (((eg) this).field_w % 50 >= 10) {
                                                                                                  break L209;
                                                                                                } else {
                                                                                                  ((eg) this).field_n = 25;
                                                                                                  break L209;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            L210: {
                                                                                              if (((eg) this).field_w % 50 <= 15) {
                                                                                                break L210;
                                                                                              } else {
                                                                                                if (((eg) this).field_w % 50 >= 20) {
                                                                                                  break L210;
                                                                                                } else {
                                                                                                  ((eg) this).field_n = 26;
                                                                                                  break L210;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            L211: {
                                                                                              if (((eg) this).field_w % 50 <= 20) {
                                                                                                break L211;
                                                                                              } else {
                                                                                                if (((eg) this).field_w % 50 < 25) {
                                                                                                  ((eg) this).field_n = 27;
                                                                                                  break L211;
                                                                                                } else {
                                                                                                  break L211;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            if (((eg) this).field_w % 50 <= 25) {
                                                                                              break L208;
                                                                                            } else {
                                                                                              if (30 <= ((eg) this).field_w % 50) {
                                                                                                break L208;
                                                                                              } else {
                                                                                                L212: {
                                                                                                  stackOut_940_0 = this;
                                                                                                  stackIn_942_0 = stackOut_940_0;
                                                                                                  stackIn_941_0 = stackOut_940_0;
                                                                                                  if (ii.field_e[0].field_i.field_b < ((eg) this).field_i.field_b) {
                                                                                                    stackOut_942_0 = this;
                                                                                                    stackOut_942_1 = -1;
                                                                                                    stackIn_943_0 = stackOut_942_0;
                                                                                                    stackIn_943_1 = stackOut_942_1;
                                                                                                    break L212;
                                                                                                  } else {
                                                                                                    stackOut_941_0 = this;
                                                                                                    stackOut_941_1 = 1;
                                                                                                    stackIn_943_0 = stackOut_941_0;
                                                                                                    stackIn_943_1 = stackOut_941_1;
                                                                                                    break L212;
                                                                                                  }
                                                                                                }
                                                                                                ((eg) this).field_h = stackIn_943_1;
                                                                                                ((eg) this).field_n = 28;
                                                                                                break L208;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            break L208;
                                                                                          }
                                                                                        }
                                                                                        L213: {
                                                                                          if (((eg) this).field_w <= 300) {
                                                                                            break L213;
                                                                                          } else {
                                                                                            if (((eg) this).field_p < 15) {
                                                                                              ((eg) this).field_w = ((eg) this).field_w - 300;
                                                                                              break L213;
                                                                                            } else {
                                                                                              break L213;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L214: {
                                                                                          if (400 >= ((eg) this).field_w) {
                                                                                            break L214;
                                                                                          } else {
                                                                                            ((eg) this).field_w = ((eg) this).field_w - 400;
                                                                                            break L214;
                                                                                          }
                                                                                        }
                                                                                        L215: {
                                                                                          int discarded$142 = 0;
                                                                                          this.e();
                                                                                          if (((eg) this).field_s <= 0) {
                                                                                            break L215;
                                                                                          } else {
                                                                                            L216: {
                                                                                              L217: {
                                                                                                ((eg) this).field_s = ((eg) this).field_s - 1;
                                                                                                ((eg) this).field_p = ((eg) this).field_p - 1;
                                                                                                if (((eg) this).field_p == 50) {
                                                                                                  break L217;
                                                                                                } else {
                                                                                                  if (((eg) this).field_p == 30) {
                                                                                                    break L217;
                                                                                                  } else {
                                                                                                    break L216;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              ii.field_e[od.field_k].a(9147, 32, ((eg) this).field_i);
                                                                                              ii.field_e[od.field_k].field_f.a(param0 ^ 2, ((eg) this).field_f);
                                                                                              ii.field_e[od.field_k].field_i.field_b = 10;
                                                                                              ii.field_e[od.field_k].field_i.field_a = 16;
                                                                                              ii.field_e[od.field_k].field_f.field_b = 0;
                                                                                              ii.field_e[od.field_k].field_f.field_a = 0;
                                                                                              ii.field_e[od.field_k].field_h = 1;
                                                                                              ii.field_e[od.field_k].field_w = 10;
                                                                                              od.field_k = od.field_k + 1;
                                                                                              break L216;
                                                                                            }
                                                                                            L218: {
                                                                                              if (pk.field_s) {
                                                                                                tl.field_a.a(si.field_j[27], 100, 256 * ee.field_p / 100);
                                                                                                break L218;
                                                                                              } else {
                                                                                                break L218;
                                                                                              }
                                                                                            }
                                                                                            if (((eg) this).field_p > 0) {
                                                                                              break L215;
                                                                                            } else {
                                                                                              int discarded$143 = 0;
                                                                                              this.c();
                                                                                              ((eg) this).field_e = 70;
                                                                                              break L2;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        break L2;
                                                                                      }
                                                                                    } else {
                                                                                      L219: {
                                                                                        ((eg) this).field_o = 7;
                                                                                        int fieldTemp$144 = ((eg) this).field_z;
                                                                                        ((eg) this).field_z = ((eg) this).field_z - 1;
                                                                                        if (fieldTemp$144 > 0) {
                                                                                          break L219;
                                                                                        } else {
                                                                                          L220: {
                                                                                            ((eg) this).field_n = ((eg) this).field_n + 1;
                                                                                            if (1 >= ((eg) this).field_n) {
                                                                                              break L220;
                                                                                            } else {
                                                                                              ((eg) this).field_n = 0;
                                                                                              break L220;
                                                                                            }
                                                                                          }
                                                                                          ((eg) this).field_z = 5;
                                                                                          break L219;
                                                                                        }
                                                                                      }
                                                                                      L221: {
                                                                                        if (((eg) this).field_s > 0) {
                                                                                          w.field_b = 250;
                                                                                          ((eg) this).field_s = ((eg) this).field_s - 1;
                                                                                          ((eg) this).field_x = 0;
                                                                                          if (!pk.field_s) {
                                                                                            break L221;
                                                                                          } else {
                                                                                            tl.field_a.a(si.field_j[27], 100, ee.field_p * 256 / 100);
                                                                                            break L221;
                                                                                          }
                                                                                        } else {
                                                                                          break L221;
                                                                                        }
                                                                                      }
                                                                                      w.field_b = w.field_b + 1;
                                                                                      break L2;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            } else {
                                                                              if (0 < ((eg) this).field_p) {
                                                                                if (((eg) this).field_r == 0) {
                                                                                  L222: {
                                                                                    if (0 == ((eg) this).field_x) {
                                                                                      L223: {
                                                                                        if (~ii.field_e[0].field_i.field_a >= ~((eg) this).field_i.field_a) {
                                                                                          break L223;
                                                                                        } else {
                                                                                          ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                          break L223;
                                                                                        }
                                                                                      }
                                                                                      this.a(false, 2, 20, (byte) -88, param1);
                                                                                      int fieldTemp$145 = ((eg) this).field_w;
                                                                                      ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                      if (fieldTemp$145 > 200) {
                                                                                        L224: {
                                                                                          stackOut_801_0 = this;
                                                                                          stackIn_803_0 = stackOut_801_0;
                                                                                          stackIn_802_0 = stackOut_801_0;
                                                                                          if (~((eg) this).field_i.field_b < ~ii.field_e[0].field_i.field_b) {
                                                                                            stackOut_803_0 = this;
                                                                                            stackOut_803_1 = -1;
                                                                                            stackIn_804_0 = stackOut_803_0;
                                                                                            stackIn_804_1 = stackOut_803_1;
                                                                                            break L224;
                                                                                          } else {
                                                                                            stackOut_802_0 = this;
                                                                                            stackOut_802_1 = 1;
                                                                                            stackIn_804_0 = stackOut_802_0;
                                                                                            stackIn_804_1 = stackOut_802_1;
                                                                                            break L224;
                                                                                          }
                                                                                        }
                                                                                        ((eg) this).field_h = stackIn_804_1;
                                                                                        ((eg) this).field_w = 0;
                                                                                        ((eg) this).field_x = 1;
                                                                                        ((eg) this).field_z = 0;
                                                                                        if (100.0 * Math.random() < 50.0) {
                                                                                          ((eg) this).field_x = 4;
                                                                                          break L222;
                                                                                        } else {
                                                                                          break L222;
                                                                                        }
                                                                                      } else {
                                                                                        break L222;
                                                                                      }
                                                                                    } else {
                                                                                      break L222;
                                                                                    }
                                                                                  }
                                                                                  L225: {
                                                                                    if (((eg) this).field_x != 1) {
                                                                                      break L225;
                                                                                    } else {
                                                                                      L226: {
                                                                                        int fieldTemp$146 = ((eg) this).field_w;
                                                                                        ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                        if (fieldTemp$146 <= 25) {
                                                                                          break L226;
                                                                                        } else {
                                                                                          ((eg) this).field_x = 2;
                                                                                          ((eg) this).field_w = 0;
                                                                                          ((eg) this).field_e = 70;
                                                                                          break L226;
                                                                                        }
                                                                                      }
                                                                                      ((eg) this).field_n = 19;
                                                                                      break L225;
                                                                                    }
                                                                                  }
                                                                                  L227: {
                                                                                    if (2 == ((eg) this).field_x) {
                                                                                      this.a(false, 22, 15, param1);
                                                                                      if (((eg) this).field_x == 0) {
                                                                                        ((eg) this).field_z = 0;
                                                                                        ((eg) this).field_w = (int)(Math.random() * 100.0);
                                                                                        break L227;
                                                                                      } else {
                                                                                        break L227;
                                                                                      }
                                                                                    } else {
                                                                                      break L227;
                                                                                    }
                                                                                  }
                                                                                  L228: {
                                                                                    if (((eg) this).field_x == 3) {
                                                                                      this.a(15, param0 + 23, false, param1);
                                                                                      if (((eg) this).field_x == 0) {
                                                                                        ((eg) this).field_z = 0;
                                                                                        ((eg) this).field_w = (int)(100.0 * Math.random());
                                                                                        break L228;
                                                                                      } else {
                                                                                        break L228;
                                                                                      }
                                                                                    } else {
                                                                                      break L228;
                                                                                    }
                                                                                  }
                                                                                  L229: {
                                                                                    if (4 != ((eg) this).field_x) {
                                                                                      break L229;
                                                                                    } else {
                                                                                      L230: {
                                                                                        if (this.a(false, param1, 25)) {
                                                                                          ii.field_e[od.field_k].a(9147, 34, ((eg) this).field_i);
                                                                                          ii.field_e[od.field_k].field_f.a(-108, ((eg) this).field_f);
                                                                                          ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + (((eg) this).field_h * 120 + 40);
                                                                                          ii.field_e[od.field_k].field_f.field_a = ii.field_e[od.field_k].field_f.field_a + 40;
                                                                                          ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                                                                                          ii.field_e[od.field_k].field_w = 10;
                                                                                          od.field_k = od.field_k + 1;
                                                                                          if (pk.field_s) {
                                                                                            tl.field_a.a(si.field_j[13], 100, 256 * ee.field_p / 100);
                                                                                            break L230;
                                                                                          } else {
                                                                                            break L230;
                                                                                          }
                                                                                        } else {
                                                                                          break L230;
                                                                                        }
                                                                                      }
                                                                                      if (((eg) this).field_x == 0) {
                                                                                        ((eg) this).field_x = 1;
                                                                                        break L229;
                                                                                      } else {
                                                                                        break L229;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  int discarded$147 = 0;
                                                                                  this.e();
                                                                                  break L2;
                                                                                } else {
                                                                                  this.a(120, param1);
                                                                                  break L2;
                                                                                }
                                                                              } else {
                                                                                this.a(false, 120, param1);
                                                                                break L2;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            ((eg) this).a(1, si.field_j, param1, 1, 20, 0, tl.field_a, pk.field_s, (byte) -50);
                                                                            int discarded$148 = 0;
                                                                            this.e();
                                                                            if (((eg) this).b(param1, -4) != 1) {
                                                                              break L2;
                                                                            } else {
                                                                              if (((eg) this).field_f.field_a == 0) {
                                                                                L231: {
                                                                                  ((eg) this).field_k = 1;
                                                                                  if (pk.field_s) {
                                                                                    stackOut_787_0 = 0;
                                                                                    stackIn_788_0 = stackOut_787_0;
                                                                                    break L231;
                                                                                  } else {
                                                                                    stackOut_786_0 = 1;
                                                                                    stackIn_788_0 = stackOut_786_0;
                                                                                    break L231;
                                                                                  }
                                                                                }
                                                                                if (stackIn_788_0 != 1) {
                                                                                  tl.field_a.a(si.field_j[5], 100, ee.field_p * 256 / 100);
                                                                                  break L2;
                                                                                } else {
                                                                                  break L2;
                                                                                }
                                                                              } else {
                                                                                break L2;
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          ((eg) this).a(1, si.field_j, param1, 1, 40, 0, tl.field_a, pk.field_s, (byte) 126);
                                                                          int discarded$149 = 0;
                                                                          this.e();
                                                                          if (((eg) this).b(param1, -4) != 1) {
                                                                            break L2;
                                                                          } else {
                                                                            if (((eg) this).field_f.field_a == 0) {
                                                                              L232: {
                                                                                ((eg) this).field_d = 24;
                                                                                ((eg) this).field_f.field_b = ((eg) this).field_f.field_b + 40;
                                                                                ((eg) this).field_e = 50;
                                                                                ((eg) this).field_B = 28;
                                                                                ((eg) this).field_f.field_a = ((eg) this).field_f.field_a + 40;
                                                                                ii.field_e[od.field_k].a(9147, 28, ((eg) this).field_i);
                                                                                ii.field_e[od.field_k].field_f.a(-116, ((eg) this).field_f);
                                                                                ii.field_e[od.field_k].field_h = -((eg) this).field_h;
                                                                                ii.field_e[od.field_k].field_w = 0;
                                                                                ii.field_e[od.field_k].field_e = 50;
                                                                                ii.field_e[od.field_k].field_o = 5;
                                                                                od.field_k = od.field_k + 1;
                                                                                if (pk.field_s) {
                                                                                  stackOut_778_0 = 0;
                                                                                  stackIn_779_0 = stackOut_778_0;
                                                                                  break L232;
                                                                                } else {
                                                                                  stackOut_777_0 = 1;
                                                                                  stackIn_779_0 = stackOut_777_0;
                                                                                  break L232;
                                                                                }
                                                                              }
                                                                              if (stackIn_779_0 != 1) {
                                                                                tl.field_a.a(si.field_j[5], 100, ee.field_p * 256 / 100);
                                                                                break L2;
                                                                              } else {
                                                                                break L2;
                                                                              }
                                                                            } else {
                                                                              break L2;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        if (0 < ((eg) this).field_p) {
                                                                          L233: {
                                                                            if (w.field_b < 250) {
                                                                              L234: {
                                                                                ((eg) this).field_o = 7;
                                                                                int fieldTemp$150 = ((eg) this).field_z;
                                                                                ((eg) this).field_z = ((eg) this).field_z - 1;
                                                                                if (fieldTemp$150 > 0) {
                                                                                  break L234;
                                                                                } else {
                                                                                  L235: {
                                                                                    ((eg) this).field_n = ((eg) this).field_n + 1;
                                                                                    if (((eg) this).field_n > 1) {
                                                                                      ((eg) this).field_n = 0;
                                                                                      break L235;
                                                                                    } else {
                                                                                      break L235;
                                                                                    }
                                                                                  }
                                                                                  ((eg) this).field_z = 5;
                                                                                  break L234;
                                                                                }
                                                                              }
                                                                              L236: {
                                                                                if (((eg) this).field_s > 0) {
                                                                                  w.field_b = 250;
                                                                                  ((eg) this).field_s = ((eg) this).field_s - 1;
                                                                                  ((eg) this).field_x = 0;
                                                                                  if (pk.field_s) {
                                                                                    tl.field_a.a(si.field_j[26], 100, 256 * ee.field_p / 100);
                                                                                    break L236;
                                                                                  } else {
                                                                                    break L236;
                                                                                  }
                                                                                } else {
                                                                                  break L236;
                                                                                }
                                                                              }
                                                                              w.field_b = w.field_b + 1;
                                                                              break L233;
                                                                            } else {
                                                                              L237: {
                                                                                w.field_b = w.field_b + 1;
                                                                                if (0 != ((eg) this).field_x) {
                                                                                  break L237;
                                                                                } else {
                                                                                  L238: {
                                                                                    L239: {
                                                                                      if (((eg) this).field_i.field_b <= 0) {
                                                                                        break L239;
                                                                                      } else {
                                                                                        if (16 > ((eg) this).field_i.field_b) {
                                                                                          break L238;
                                                                                        } else {
                                                                                          break L239;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L240: {
                                                                                      if (ii.field_e[0].field_i.field_a > ((eg) this).field_i.field_a) {
                                                                                        ((eg) this).field_x = 1;
                                                                                        ((eg) this).field_w = 0;
                                                                                        break L240;
                                                                                      } else {
                                                                                        break L240;
                                                                                      }
                                                                                    }
                                                                                    L241: {
                                                                                      if (ii.field_e[0].field_i.field_b > ((eg) this).field_i.field_b) {
                                                                                        ((eg) this).field_h = 1;
                                                                                        break L241;
                                                                                      } else {
                                                                                        ((eg) this).field_h = -1;
                                                                                        break L241;
                                                                                      }
                                                                                    }
                                                                                    if (~((eg) this).field_i.field_a >= ~ii.field_e[0].field_i.field_a) {
                                                                                      break L238;
                                                                                    } else {
                                                                                      if (((eg) this).field_i.field_a <= 2) {
                                                                                        break L238;
                                                                                      } else {
                                                                                        ((eg) this).field_i.field_a = ((eg) this).field_i.field_a - 1;
                                                                                        ((eg) this).field_x = 3;
                                                                                        ((eg) this).field_e = -20;
                                                                                        ((eg) this).field_f.field_a = ((eg) this).field_f.field_a + 230;
                                                                                        break L238;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L242: {
                                                                                    if (350 < w.field_b) {
                                                                                      w.field_b = 250;
                                                                                      ((eg) this).field_x = 4;
                                                                                      break L242;
                                                                                    } else {
                                                                                      break L242;
                                                                                    }
                                                                                  }
                                                                                  L243: {
                                                                                    if (((eg) this).field_x != 0) {
                                                                                      break L243;
                                                                                    } else {
                                                                                      this.a(true, 0, 35, (byte) -120, param1);
                                                                                      break L243;
                                                                                    }
                                                                                  }
                                                                                  if (3 == ((eg) this).field_x) {
                                                                                    ((eg) this).field_x = 5;
                                                                                    break L237;
                                                                                  } else {
                                                                                    break L237;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L244: {
                                                                                if (1 != ((eg) this).field_x) {
                                                                                  break L244;
                                                                                } else {
                                                                                  L245: {
                                                                                    int fieldTemp$151 = ((eg) this).field_w;
                                                                                    ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                                    if (fieldTemp$151 <= 5) {
                                                                                      break L245;
                                                                                    } else {
                                                                                      ((eg) this).field_e = 70;
                                                                                      ((eg) this).field_x = 2;
                                                                                      ((eg) this).field_w = 0;
                                                                                      break L245;
                                                                                    }
                                                                                  }
                                                                                  ((eg) this).field_n = 19;
                                                                                  break L244;
                                                                                }
                                                                              }
                                                                              L246: {
                                                                                if (((eg) this).field_x != 2) {
                                                                                  break L246;
                                                                                } else {
                                                                                  this.a(true, 22, 0, param1);
                                                                                  break L246;
                                                                                }
                                                                              }
                                                                              L247: {
                                                                                if (((eg) this).field_x == 3) {
                                                                                  this.a(0, -82, true, param1);
                                                                                  break L247;
                                                                                } else {
                                                                                  break L247;
                                                                                }
                                                                              }
                                                                              L248: {
                                                                                if (((eg) this).field_x != 5) {
                                                                                  break L248;
                                                                                } else {
                                                                                  this.a(25, param0 ^ 41, true, param1);
                                                                                  if (((eg) this).field_x != 3) {
                                                                                    break L248;
                                                                                  } else {
                                                                                    ((eg) this).field_x = 5;
                                                                                    break L248;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L249: {
                                                                                if (((eg) this).field_x != 4) {
                                                                                  break L249;
                                                                                } else {
                                                                                  if (this.a(true, param1, 25)) {
                                                                                    L250: {
                                                                                      ii.field_e[od.field_k].a(9147, 27, ((eg) this).field_i);
                                                                                      ii.field_e[od.field_k].field_f.a(-81, ((eg) this).field_f);
                                                                                      ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + (40 + ((eg) this).field_h * 240);
                                                                                      ii.field_e[od.field_k].field_f.field_a = ii.field_e[od.field_k].field_f.field_a + 80;
                                                                                      ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                                                                                      ii.field_e[od.field_k].field_w = 0;
                                                                                      ii.field_e[od.field_k].field_e = 40;
                                                                                      ii.field_e[od.field_k].field_o = 5;
                                                                                      od.field_k = od.field_k + 1;
                                                                                      stackOut_742_0 = 0;
                                                                                      stackIn_744_0 = stackOut_742_0;
                                                                                      stackIn_743_0 = stackOut_742_0;
                                                                                      if (pk.field_s) {
                                                                                        stackOut_744_0 = stackIn_744_0;
                                                                                        stackOut_744_1 = 0;
                                                                                        stackIn_745_0 = stackOut_744_0;
                                                                                        stackIn_745_1 = stackOut_744_1;
                                                                                        break L250;
                                                                                      } else {
                                                                                        stackOut_743_0 = stackIn_743_0;
                                                                                        stackOut_743_1 = 1;
                                                                                        stackIn_745_0 = stackOut_743_0;
                                                                                        stackIn_745_1 = stackOut_743_1;
                                                                                        break L250;
                                                                                      }
                                                                                    }
                                                                                    if (stackIn_745_0 != stackIn_745_1) {
                                                                                      break L249;
                                                                                    } else {
                                                                                      tl.field_a.a(nl.field_q[25], 100, ee.field_p * 256 / 100);
                                                                                      break L249;
                                                                                    }
                                                                                  } else {
                                                                                    break L249;
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (((eg) this).field_s <= 0) {
                                                                                break L233;
                                                                              } else {
                                                                                L251: {
                                                                                  L252: {
                                                                                    ((eg) this).field_p = ((eg) this).field_p - 1;
                                                                                    ((eg) this).field_s = ((eg) this).field_s - 1;
                                                                                    if (((eg) this).field_p == 10) {
                                                                                      break L252;
                                                                                    } else {
                                                                                      if (((eg) this).field_p == 30) {
                                                                                        break L252;
                                                                                      } else {
                                                                                        break L251;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  ii.field_e[od.field_k].a(param0 + 9270, 23, ((eg) this).field_i);
                                                                                  ii.field_e[od.field_k].field_f.a(-94, ((eg) this).field_f);
                                                                                  ii.field_e[od.field_k].field_i.field_b = 0;
                                                                                  ii.field_e[od.field_k].field_i.field_a = 16;
                                                                                  ii.field_e[od.field_k].field_f.field_b = 0;
                                                                                  ii.field_e[od.field_k].field_f.field_a = 0;
                                                                                  ii.field_e[od.field_k].field_h = 1;
                                                                                  ii.field_e[od.field_k].field_w = 10;
                                                                                  od.field_k = od.field_k + 1;
                                                                                  ii.field_e[od.field_k].a(9147, 23, ((eg) this).field_i);
                                                                                  ii.field_e[od.field_k].field_f.a(-117, ((eg) this).field_f);
                                                                                  ii.field_e[od.field_k].field_i.field_b = 19;
                                                                                  ii.field_e[od.field_k].field_i.field_a = 16;
                                                                                  ii.field_e[od.field_k].field_f.field_b = 0;
                                                                                  ii.field_e[od.field_k].field_f.field_a = 0;
                                                                                  ii.field_e[od.field_k].field_h = -1;
                                                                                  ii.field_e[od.field_k].field_w = 10;
                                                                                  od.field_k = od.field_k + 1;
                                                                                  break L251;
                                                                                }
                                                                                L253: {
                                                                                  if (pk.field_s) {
                                                                                    stackOut_754_0 = 0;
                                                                                    stackIn_755_0 = stackOut_754_0;
                                                                                    break L253;
                                                                                  } else {
                                                                                    stackOut_753_0 = 1;
                                                                                    stackIn_755_0 = stackOut_753_0;
                                                                                    break L253;
                                                                                  }
                                                                                }
                                                                                L254: {
                                                                                  if (stackIn_755_0 != 1) {
                                                                                    tl.field_a.a(si.field_j[26], 100, ee.field_p * 256 / 100);
                                                                                    break L254;
                                                                                  } else {
                                                                                    break L254;
                                                                                  }
                                                                                }
                                                                                if (((eg) this).field_p <= 0) {
                                                                                  int discarded$152 = 0;
                                                                                  this.c();
                                                                                  ((eg) this).field_e = 70;
                                                                                  break L233;
                                                                                } else {
                                                                                  break L233;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                          int discarded$153 = 0;
                                                                          this.e();
                                                                          break L2;
                                                                        } else {
                                                                          this.a(true, 120, param1);
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    break L118;
                                                                  }
                                                                }
                                                                if (((eg) this).field_p > 0) {
                                                                  if (((eg) this).field_r != 0) {
                                                                    this.a(param0 ^ -72, param1);
                                                                    break L2;
                                                                  } else {
                                                                    L255: {
                                                                      if (((eg) this).field_x == 0) {
                                                                        L256: {
                                                                          if (ii.field_e[0].field_i.field_a <= ((eg) this).field_i.field_a) {
                                                                            break L256;
                                                                          } else {
                                                                            ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                            break L256;
                                                                          }
                                                                        }
                                                                        this.a(false, 1, 20, (byte) -67, param1);
                                                                        int fieldTemp$154 = ((eg) this).field_w;
                                                                        ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                        if (200 >= fieldTemp$154) {
                                                                          break L255;
                                                                        } else {
                                                                          L257: {
                                                                            ((eg) this).field_w = 0;
                                                                            stackOut_684_0 = this;
                                                                            stackIn_686_0 = stackOut_684_0;
                                                                            stackIn_685_0 = stackOut_684_0;
                                                                            if (~ii.field_e[0].field_i.field_b > ~((eg) this).field_i.field_b) {
                                                                              stackOut_686_0 = this;
                                                                              stackOut_686_1 = -1;
                                                                              stackIn_687_0 = stackOut_686_0;
                                                                              stackIn_687_1 = stackOut_686_1;
                                                                              break L257;
                                                                            } else {
                                                                              stackOut_685_0 = this;
                                                                              stackOut_685_1 = 1;
                                                                              stackIn_687_0 = stackOut_685_0;
                                                                              stackIn_687_1 = stackOut_685_1;
                                                                              break L257;
                                                                            }
                                                                          }
                                                                          ((eg) this).field_h = stackIn_687_1;
                                                                          ((eg) this).field_x = 1;
                                                                          break L255;
                                                                        }
                                                                      } else {
                                                                        break L255;
                                                                      }
                                                                    }
                                                                    L258: {
                                                                      if (1 == ((eg) this).field_x) {
                                                                        ((eg) this).field_n = 19;
                                                                        int fieldTemp$155 = ((eg) this).field_w;
                                                                        ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                        if (fieldTemp$155 <= 40) {
                                                                          break L258;
                                                                        } else {
                                                                          ((eg) this).field_w = 0;
                                                                          ((eg) this).field_x = 2;
                                                                          ((eg) this).field_e = 80;
                                                                          if (~((eg) this).field_i.field_a <= ~ii.field_e[0].field_i.field_a) {
                                                                            ((eg) this).field_e = 40;
                                                                            break L258;
                                                                          } else {
                                                                            break L258;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        break L258;
                                                                      }
                                                                    }
                                                                    L259: {
                                                                      if (((eg) this).field_x == 2) {
                                                                        this.a(false, 22, 15, param1);
                                                                        if (((eg) this).field_x != 0) {
                                                                          break L259;
                                                                        } else {
                                                                          ((eg) this).field_w = (int)(Math.random() * 100.0);
                                                                          break L259;
                                                                        }
                                                                      } else {
                                                                        break L259;
                                                                      }
                                                                    }
                                                                    L260: {
                                                                      if (((eg) this).field_x != 3) {
                                                                        break L260;
                                                                      } else {
                                                                        this.a(15, -92, false, param1);
                                                                        if (((eg) this).field_x != 0) {
                                                                          break L260;
                                                                        } else {
                                                                          ((eg) this).field_w = (int)(Math.random() * 100.0);
                                                                          break L260;
                                                                        }
                                                                      }
                                                                    }
                                                                    int discarded$156 = 0;
                                                                    this.e();
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  this.a(false, 120, param1);
                                                                  break L2;
                                                                }
                                                              } else {
                                                                if (((eg) this).field_p <= 0) {
                                                                  this.a(false, 120, param1);
                                                                  break L2;
                                                                } else {
                                                                  if (0 != ((eg) this).field_r) {
                                                                    this.a(113, param1);
                                                                    break L2;
                                                                  } else {
                                                                    L261: {
                                                                      if (((eg) this).field_x != 0) {
                                                                        break L261;
                                                                      } else {
                                                                        L262: {
                                                                          ((eg) this).field_n = 19;
                                                                          if (15 < ((eg) this).field_w) {
                                                                            ((eg) this).field_n = 22;
                                                                            break L262;
                                                                          } else {
                                                                            break L262;
                                                                          }
                                                                        }
                                                                        int fieldTemp$157 = ((eg) this).field_w;
                                                                        ((eg) this).field_w = ((eg) this).field_w + 1;
                                                                        if (25 >= fieldTemp$157) {
                                                                          break L261;
                                                                        } else {
                                                                          ((eg) this).field_x = 2;
                                                                          ((eg) this).field_e = 70;
                                                                          ((eg) this).field_w = 0;
                                                                          if (ii.field_e[0].field_i.field_a > ((eg) this).field_i.field_a) {
                                                                            break L261;
                                                                          } else {
                                                                            ((eg) this).field_e = 50;
                                                                            break L261;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    L263: {
                                                                      if (((eg) this).field_x != 2) {
                                                                        break L263;
                                                                      } else {
                                                                        this.a(false, param0 ^ -109, 25, param1);
                                                                        break L263;
                                                                      }
                                                                    }
                                                                    L264: {
                                                                      if (((eg) this).field_x == 3) {
                                                                        this.a(25, -92, false, param1);
                                                                        break L264;
                                                                      } else {
                                                                        break L264;
                                                                      }
                                                                    }
                                                                    int discarded$158 = 0;
                                                                    this.e();
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
                                            } else {
                                              if (((eg) this).field_p > 0) {
                                                if (((eg) this).field_r == 0) {
                                                  L265: {
                                                    if (((eg) this).field_x != 0) {
                                                      break L265;
                                                    } else {
                                                      L266: {
                                                        if (~((eg) this).field_i.field_a <= ~ii.field_e[0].field_i.field_a) {
                                                          break L266;
                                                        } else {
                                                          ((eg) this).field_w = ((eg) this).field_w + 1;
                                                          break L266;
                                                        }
                                                      }
                                                      this.a(false, 1, 20, (byte) -66, param1);
                                                      int fieldTemp$159 = ((eg) this).field_w;
                                                      ((eg) this).field_w = ((eg) this).field_w + 1;
                                                      if (fieldTemp$159 > 200) {
                                                        L267: {
                                                          ((eg) this).field_w = 0;
                                                          ((eg) this).field_x = 1;
                                                          stackOut_477_0 = this;
                                                          stackIn_479_0 = stackOut_477_0;
                                                          stackIn_478_0 = stackOut_477_0;
                                                          if (ii.field_e[0].field_i.field_b >= ((eg) this).field_i.field_b) {
                                                            stackOut_479_0 = this;
                                                            stackOut_479_1 = 1;
                                                            stackIn_480_0 = stackOut_479_0;
                                                            stackIn_480_1 = stackOut_479_1;
                                                            break L267;
                                                          } else {
                                                            stackOut_478_0 = this;
                                                            stackOut_478_1 = -1;
                                                            stackIn_480_0 = stackOut_478_0;
                                                            stackIn_480_1 = stackOut_478_1;
                                                            break L267;
                                                          }
                                                        }
                                                        ((eg) this).field_h = stackIn_480_1;
                                                        break L265;
                                                      } else {
                                                        break L265;
                                                      }
                                                    }
                                                  }
                                                  L268: {
                                                    if (((eg) this).field_x != 1) {
                                                      break L268;
                                                    } else {
                                                      L269: {
                                                        int fieldTemp$160 = ((eg) this).field_w;
                                                        ((eg) this).field_w = ((eg) this).field_w + 1;
                                                        if (fieldTemp$160 <= 25) {
                                                          break L269;
                                                        } else {
                                                          ((eg) this).field_w = 0;
                                                          ((eg) this).field_e = 70;
                                                          ((eg) this).field_x = 2;
                                                          break L269;
                                                        }
                                                      }
                                                      ((eg) this).field_n = 19;
                                                      break L268;
                                                    }
                                                  }
                                                  L270: {
                                                    if (2 != ((eg) this).field_x) {
                                                      break L270;
                                                    } else {
                                                      this.a(false, 22, 16, param1);
                                                      if (((eg) this).field_x != 0) {
                                                        break L270;
                                                      } else {
                                                        ((eg) this).field_w = (int)(Math.random() * 100.0);
                                                        break L270;
                                                      }
                                                    }
                                                  }
                                                  L271: {
                                                    if (((eg) this).field_x == 3) {
                                                      this.a(16, -91, false, param1);
                                                      if (0 != ((eg) this).field_x) {
                                                        break L271;
                                                      } else {
                                                        ((eg) this).field_w = (int)(Math.random() * 100.0);
                                                        break L271;
                                                      }
                                                    } else {
                                                      break L271;
                                                    }
                                                  }
                                                  int discarded$161 = 0;
                                                  this.e();
                                                  break L2;
                                                } else {
                                                  this.a(54, param1);
                                                  break L2;
                                                }
                                              } else {
                                                this.a(false, 120, param1);
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if (((eg) this).field_p > 0) {
                                          if (((eg) this).field_r != 0) {
                                            this.a(114, param1);
                                            break L2;
                                          } else {
                                            L272: {
                                              if (0 != ((eg) this).field_x) {
                                                break L272;
                                              } else {
                                                L273: {
                                                  if (((eg) this).field_i.field_a < ii.field_e[0].field_i.field_a) {
                                                    ((eg) this).field_w = ((eg) this).field_w + 1;
                                                    break L273;
                                                  } else {
                                                    break L273;
                                                  }
                                                }
                                                this.a(false, 2, 20, (byte) -76, param1);
                                                int fieldTemp$162 = ((eg) this).field_w;
                                                ((eg) this).field_w = ((eg) this).field_w + 1;
                                                if (200 >= fieldTemp$162) {
                                                  break L272;
                                                } else {
                                                  ((eg) this).field_x = 1;
                                                  ((eg) this).field_z = 0;
                                                  ((eg) this).field_w = 0;
                                                  if (Math.random() * 100.0 >= 50.0) {
                                                    break L272;
                                                  } else {
                                                    ((eg) this).field_x = 4;
                                                    break L272;
                                                  }
                                                }
                                              }
                                            }
                                            L274: {
                                              if (((eg) this).field_x != 1) {
                                                break L274;
                                              } else {
                                                L275: {
                                                  int fieldTemp$163 = ((eg) this).field_w;
                                                  ((eg) this).field_w = ((eg) this).field_w + 1;
                                                  if (fieldTemp$163 > 25) {
                                                    ((eg) this).field_w = 0;
                                                    ((eg) this).field_e = 70;
                                                    ((eg) this).field_x = 2;
                                                    break L275;
                                                  } else {
                                                    break L275;
                                                  }
                                                }
                                                ((eg) this).field_n = 19;
                                                break L274;
                                              }
                                            }
                                            L276: {
                                              if (2 == ((eg) this).field_x) {
                                                this.a(false, 22, 15, param1);
                                                if (((eg) this).field_x == 0) {
                                                  ((eg) this).field_z = 0;
                                                  ((eg) this).field_w = (int)(100.0 * Math.random());
                                                  break L276;
                                                } else {
                                                  break L276;
                                                }
                                              } else {
                                                break L276;
                                              }
                                            }
                                            L277: {
                                              if (((eg) this).field_x == 3) {
                                                this.a(15, -117, false, param1);
                                                if (((eg) this).field_x == 0) {
                                                  ((eg) this).field_z = 0;
                                                  ((eg) this).field_w = (int)(100.0 * Math.random());
                                                  break L277;
                                                } else {
                                                  break L277;
                                                }
                                              } else {
                                                break L277;
                                              }
                                            }
                                            L278: {
                                              if (((eg) this).field_x != 4) {
                                                break L278;
                                              } else {
                                                if (!this.a(false, param1, param0 + 148)) {
                                                  break L278;
                                                } else {
                                                  L279: {
                                                    ii.field_e[od.field_k].a(param0 ^ -9154, 11, ((eg) this).field_i);
                                                    ii.field_e[od.field_k].field_f.a(-82, ((eg) this).field_f);
                                                    ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + (((eg) this).field_h * 120 - -40);
                                                    ii.field_e[od.field_k].field_f.field_a = ii.field_e[od.field_k].field_f.field_a + 40;
                                                    ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                                                    ii.field_e[od.field_k].field_w = 10;
                                                    od.field_k = od.field_k + 1;
                                                    if (pk.field_s) {
                                                      stackOut_414_0 = 0;
                                                      stackIn_415_0 = stackOut_414_0;
                                                      break L279;
                                                    } else {
                                                      stackOut_413_0 = 1;
                                                      stackIn_415_0 = stackOut_413_0;
                                                      break L279;
                                                    }
                                                  }
                                                  if (stackIn_415_0 == 1) {
                                                    break L278;
                                                  } else {
                                                    tl.field_a.a(si.field_j[13], 100, 256 * ee.field_p / 100);
                                                    break L278;
                                                  }
                                                }
                                              }
                                            }
                                            int discarded$164 = 0;
                                            this.e();
                                            break L2;
                                          }
                                        } else {
                                          this.a(false, 120, param1);
                                          break L2;
                                        }
                                      }
                                    } else {
                                      break L63;
                                    }
                                  } else {
                                    break L63;
                                  }
                                }
                                if (0 < ((eg) this).field_p) {
                                  if (0 != ((eg) this).field_r) {
                                    if (((eg) this).field_B == 8) {
                                      ((eg) this).field_p = 0;
                                      ((eg) this).field_r = 0;
                                      break L2;
                                    } else {
                                      this.a(98, param1);
                                      break L2;
                                    }
                                  } else {
                                    L280: {
                                      var4 = 15;
                                      if (((eg) this).field_B == 7) {
                                        var4 = 10;
                                        break L280;
                                      } else {
                                        break L280;
                                      }
                                    }
                                    L281: {
                                      if (((eg) this).field_x != 0) {
                                        break L281;
                                      } else {
                                        L282: {
                                          if (~((eg) this).field_i.field_a > ~ii.field_e[0].field_i.field_a) {
                                            ((eg) this).field_w = ((eg) this).field_w + 1;
                                            break L282;
                                          } else {
                                            break L282;
                                          }
                                        }
                                        this.a(false, 0, var4, (byte) -68, param1);
                                        int fieldTemp$165 = ((eg) this).field_w;
                                        ((eg) this).field_w = ((eg) this).field_w + 1;
                                        if (fieldTemp$165 <= 100) {
                                          break L281;
                                        } else {
                                          ((eg) this).field_x = 1;
                                          ((eg) this).field_w = 0;
                                          ((eg) this).field_z = 0;
                                          if (100.0 * Math.random() >= 10.0) {
                                            break L281;
                                          } else {
                                            if (7 != ((eg) this).field_B) {
                                              break L281;
                                            } else {
                                              ((eg) this).field_x = 4;
                                              break L281;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L283: {
                                      if (1 == ((eg) this).field_x) {
                                        L284: {
                                          int fieldTemp$166 = ((eg) this).field_w;
                                          ((eg) this).field_w = ((eg) this).field_w + 1;
                                          if (fieldTemp$166 <= 25) {
                                            break L284;
                                          } else {
                                            ((eg) this).field_x = 2;
                                            ((eg) this).field_w = 0;
                                            ((eg) this).field_e = 70;
                                            break L284;
                                          }
                                        }
                                        ((eg) this).field_n = 19;
                                        break L283;
                                      } else {
                                        break L283;
                                      }
                                    }
                                    L285: {
                                      if (((eg) this).field_x != 2) {
                                        break L285;
                                      } else {
                                        this.a(false, 22, var4, param1);
                                        if (((eg) this).field_x != 0) {
                                          break L285;
                                        } else {
                                          ((eg) this).field_w = (int)(Math.random() * 100.0);
                                          break L285;
                                        }
                                      }
                                    }
                                    L286: {
                                      if (((eg) this).field_x != 3) {
                                        break L286;
                                      } else {
                                        this.a(var4, -82, false, param1);
                                        if (((eg) this).field_x == 0) {
                                          ((eg) this).field_w = (int)(Math.random() * 100.0);
                                          break L286;
                                        } else {
                                          break L286;
                                        }
                                      }
                                    }
                                    L287: {
                                      if (((eg) this).field_x == 4) {
                                        if (!this.a(false, param1, 25)) {
                                          break L287;
                                        } else {
                                          if (od.field_k >= 100) {
                                            break L287;
                                          } else {
                                            L288: {
                                              if (pk.field_s) {
                                                stackOut_377_0 = 0;
                                                stackIn_378_0 = stackOut_377_0;
                                                break L288;
                                              } else {
                                                stackOut_376_0 = 1;
                                                stackIn_378_0 = stackOut_376_0;
                                                break L288;
                                              }
                                            }
                                            L289: {
                                              if (stackIn_378_0 == 1) {
                                                break L289;
                                              } else {
                                                tl.field_a.a(si.field_j[12], 100, 256 * ee.field_p / 100);
                                                break L289;
                                              }
                                            }
                                            ((eg) this).field_x = 0;
                                            ((eg) this).field_w = 0;
                                            ii.field_e[od.field_k].a(param0 ^ -9154, 8, ((eg) this).field_i);
                                            ii.field_e[od.field_k].field_f.a(-88, ((eg) this).field_f);
                                            ii.field_e[od.field_k].field_h = ((eg) this).field_h;
                                            ii.field_e[od.field_k].field_w = 10;
                                            od.field_k = od.field_k + 1;
                                            break L287;
                                          }
                                        }
                                      } else {
                                        break L287;
                                      }
                                    }
                                    int discarded$167 = 0;
                                    this.e();
                                    break L2;
                                  }
                                } else {
                                  this.a(false, 120, param1);
                                  break L2;
                                }
                              }
                            } else {
                              if (((eg) this).field_p <= 0) {
                                this.a(false, param0 + 243, param1);
                                break L2;
                              } else {
                                if (((eg) this).field_r == 0) {
                                  L290: {
                                    if (((eg) this).field_x != 0) {
                                      break L290;
                                    } else {
                                      L291: {
                                        ((eg) this).field_n = 19;
                                        if (15 < ((eg) this).field_w) {
                                          ((eg) this).field_n = 22;
                                          break L291;
                                        } else {
                                          break L291;
                                        }
                                      }
                                      int fieldTemp$168 = ((eg) this).field_w;
                                      ((eg) this).field_w = ((eg) this).field_w + 1;
                                      if (fieldTemp$168 > 25) {
                                        ((eg) this).field_x = 2;
                                        ((eg) this).field_e = 85;
                                        ((eg) this).field_w = 0;
                                        if (((eg) this).field_i.field_a >= ii.field_e[0].field_i.field_a) {
                                          ((eg) this).field_e = 60;
                                          break L290;
                                        } else {
                                          break L290;
                                        }
                                      } else {
                                        break L290;
                                      }
                                    }
                                  }
                                  L292: {
                                    if (((eg) this).field_x == 2) {
                                      this.a(false, param0 ^ -109, 25, param1);
                                      break L292;
                                    } else {
                                      break L292;
                                    }
                                  }
                                  L293: {
                                    if (((eg) this).field_x == 3) {
                                      this.a(15, -74, false, param1);
                                      break L293;
                                    } else {
                                      break L293;
                                    }
                                  }
                                  int discarded$169 = 0;
                                  this.e();
                                  break L2;
                                } else {
                                  this.a(77, param1);
                                  break L2;
                                }
                              }
                            }
                          }
                        } else {
                          break L50;
                        }
                      } else {
                        break L50;
                      }
                    } else {
                      break L50;
                    }
                  }
                  if (((eg) this).field_p > 0) {
                    if (0 == ((eg) this).field_r) {
                      this.a(15, (byte) 127, param1, false);
                      int discarded$170 = 0;
                      this.e();
                      break L2;
                    } else {
                      this.a(param0 + 238, param1);
                      break L2;
                    }
                  } else {
                    this.a(false, 120, param1);
                    break L2;
                  }
                } else {
                  if (((eg) this).field_p > 0) {
                    if (((eg) this).field_r == 0) {
                      L294: {
                        if (((eg) this).field_x == 0) {
                          L295: {
                            if (((eg) this).field_i.field_a >= ii.field_e[0].field_i.field_a) {
                              break L295;
                            } else {
                              ((eg) this).field_w = ((eg) this).field_w + 1;
                              break L295;
                            }
                          }
                          L296: {
                            L297: {
                              stackOut_256_0 = this;
                              stackOut_256_1 = 0;
                              stackIn_259_0 = stackOut_256_0;
                              stackIn_259_1 = stackOut_256_1;
                              stackIn_257_0 = stackOut_256_0;
                              stackIn_257_1 = stackOut_256_1;
                              if (pg.field_q) {
                                break L297;
                              } else {
                                stackOut_257_0 = this;
                                stackOut_257_1 = stackIn_257_1;
                                stackIn_259_0 = stackOut_257_0;
                                stackIn_259_1 = stackOut_257_1;
                                stackIn_258_0 = stackOut_257_0;
                                stackIn_258_1 = stackOut_257_1;
                                if (ql.field_c == 0) {
                                  break L297;
                                } else {
                                  stackOut_258_0 = this;
                                  stackOut_258_1 = stackIn_258_1;
                                  stackOut_258_2 = 0;
                                  stackIn_260_0 = stackOut_258_0;
                                  stackIn_260_1 = stackOut_258_1;
                                  stackIn_260_2 = stackOut_258_2;
                                  break L296;
                                }
                              }
                            }
                            stackOut_259_0 = this;
                            stackOut_259_1 = stackIn_259_1;
                            stackOut_259_2 = 2;
                            stackIn_260_0 = stackOut_259_0;
                            stackIn_260_1 = stackOut_259_1;
                            stackIn_260_2 = stackOut_259_2;
                            break L296;
                          }
                          this.a(stackIn_260_1 != 0, stackIn_260_2, 15, (byte) -63, param1);
                          if (pg.field_q) {
                            break L294;
                          } else {
                            int fieldTemp$171 = ((eg) this).field_w;
                            ((eg) this).field_w = ((eg) this).field_w + 1;
                            if (fieldTemp$171 <= 250) {
                              break L294;
                            } else {
                              if (ql.field_c != 0) {
                                ((eg) this).field_x = 1;
                                ((eg) this).field_w = 0;
                                break L294;
                              } else {
                                break L294;
                              }
                            }
                          }
                        } else {
                          break L294;
                        }
                      }
                      L298: {
                        if (((eg) this).field_x == 1) {
                          ((eg) this).field_n = 19;
                          int fieldTemp$172 = ((eg) this).field_w;
                          ((eg) this).field_w = ((eg) this).field_w + 1;
                          if (25 < fieldTemp$172) {
                            ((eg) this).field_x = 2;
                            ((eg) this).field_w = 0;
                            ((eg) this).field_e = 80;
                            break L298;
                          } else {
                            break L298;
                          }
                        } else {
                          break L298;
                        }
                      }
                      L299: {
                        if (2 == ((eg) this).field_x) {
                          this.a(false, 22, 5, param1);
                          if (((eg) this).field_x != 0) {
                            break L299;
                          } else {
                            ((eg) this).field_w = (int)(100.0 * Math.random());
                            break L299;
                          }
                        } else {
                          break L299;
                        }
                      }
                      L300: {
                        if (((eg) this).field_x != 3) {
                          break L300;
                        } else {
                          this.a(5, param0 + 16, false, param1);
                          if (((eg) this).field_x != 0) {
                            break L300;
                          } else {
                            ((eg) this).field_w = (int)(100.0 * Math.random());
                            break L300;
                          }
                        }
                      }
                      int discarded$173 = 0;
                      this.e();
                      break L2;
                    } else {
                      this.a(14, param1);
                      break L2;
                    }
                  } else {
                    this.a(false, param0 + 243, param1);
                    break L2;
                  }
                }
              }
            }
          }
        }
        L301: {
          if (param0 == -123) {
            break L301;
          } else {
            this.c(-4);
            break L301;
          }
        }
    }

    final static void a(kl param0, int param1, kl param2, kl param3) {
        RuntimeException var4 = null;
        db[] var5 = null;
        db[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        db[] var10_ref_db__ = null;
        o var11 = null;
        int var11_int = 0;
        o var12 = null;
        o var13 = null;
        int var14 = 0;
        int[][] var15 = null;
        o var16 = null;
        int[][] var17 = null;
        int[][] var18 = null;
        int[][] var19 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
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
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
        var14 = wizardrun.field_H;
        try {
          L0: {
            ok.field_a = pe.a("commonui", param3, "frame_top", 127);
            ia.field_i = pe.a("commonui", param3, "frame_bottom", 88);
            hg.field_d = vg.a(15, "jagex_logo_grey", param3, "commonui");
            vf.field_j = pe.a("commonui", param3, "button", 121);
            te.field_k = pc.a((byte) 125, "commonui", param3, "validation");
            e.field_b = (vd) (Object) oc.a(param3, "commonui", "arezzo12", 67, param0);
            gh.field_b = (vd) (Object) oc.a(param3, "commonui", "arezzo14", 93, param0);
            va.field_i = (vd) (Object) oc.a(param3, "commonui", "arezzo14bold", 118, param0);
            var16 = new o(param2.a(122, "", "button.gif"), (java.awt.Component) (Object) wizardrun.field_G);
            int discarded$5 = -108;
            db discarded$6 = mf.a("commonui", "dropdown", param3);
            int discarded$7 = 112;
            var5 = re.a(param3, "commonui", "screen_options");
            gj.field_f = new db[4];
            s.field_c = new db[4];
            nj.field_k = new db[4];
            var6 = new db[][]{gj.field_f, s.field_c, nj.field_k};
            var19 = new int[4][];
            var18 = var19;
            var17 = var18;
            var15 = var17;
            var7 = var15;
            var7[0] = var5[0].field_k;
            var8 = 1;
            L1: while (true) {
              if (var8 >= var19.length) {
                var8 = var5[0].field_l[0];
                var19[2][var8] = 16777215;
                var19[1][var8] = 2394342;
                var19[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= 3) {
                    var9 = var16.field_p;
                    int discarded$8 = -31782;
                    ph.d();
                    var10 = -88 / ((15 - param1) / 44);
                    var16.b();
                    ed.d(0, 0, ed.field_h, ed.field_d);
                    var11 = new o(var9, var9);
                    var11.b();
                    var16.c(0, 0);
                    var12 = new o(var9, var9);
                    var12.b();
                    var16.c(-var16.field_z + var9, 0);
                    var13 = new o(var16.field_z + -(var9 * 2), var9);
                    var13.b();
                    var16.c(-var9, 0);
                    int discarded$9 = 4;
                    bb.b();
                    vf.field_j = new o[]{var11, var13, var12};
                    break L0;
                  } else {
                    var10_ref_db__ = var6[var9];
                    var11_int = 0;
                    L3: while (true) {
                      if (var11_int >= var10_ref_db__.length) {
                        var9++;
                        continue L2;
                      } else {
                        var10_ref_db__[var11_int] = eb.a(var5[var9], (byte) -105, var19[var11_int]);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var19[0].clone();
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("eg.BA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        o[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        L0: {
          var12 = wizardrun.field_H;
          if (param2 == 62) {
            break L0;
          } else {
            ((eg) this).field_q = null;
            break L0;
          }
        }
        L1: {
          var4 = ((eg) this).field_f.field_b * 32 / 240 + 32 * ((eg) this).field_i.field_b;
          var5 = 32 * (15 - ((eg) this).field_i.field_a) - (32 + ((eg) this).field_f.field_a * 32 / 240);
          var5 = var5 - (((eg) this).field_d - 32);
          var6 = oc.field_b[param1];
          if (param1 != 4) {
            break L1;
          } else {
            if (ql.field_c == 6) {
              var6 = hh.field_eb;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (param1 != 4) {
            break L2;
          } else {
            if (7 != ql.field_c) {
              break L2;
            } else {
              var6 = h.field_j;
              break L2;
            }
          }
        }
        L3: {
          L4: {
            if (((eg) this).field_p <= 0) {
              var7 = 240 * ((eg) this).field_i.field_b - -((eg) this).field_f.field_b;
              var7 = 0;
              var6[((eg) this).field_n].a(var4 + ((eg) this).field_d / 2, var5 + ((eg) this).field_d / 2, -105, 128, var7);
              break L4;
            } else {
              if (((eg) this).field_r != 0) {
                var7 = ((eg) this).field_i.field_b * 240 - -((eg) this).field_f.field_b;
                var8 = ((eg) this).field_d / 2;
                var6[((eg) this).field_n].a(var8 + var4, var8 + var5, -112, 128, var7);
                ((eg) this).field_q = var6[((eg) this).field_n].c();
                ((eg) this).field_A = var5;
                ((eg) this).field_y = var4;
                var11 = 0;
                L5: while (true) {
                  if (~(-(var8 * ((eg) this).field_w / 1000) + var8) >= ~var11) {
                    break L4;
                  } else {
                    var9 = (0.5 * (double)(((eg) this).field_f.field_b + ((eg) this).field_i.field_b * 240) + 6.28 * (double)var11) / (double)var8;
                    ob.field_c.d((int)((double)var8 * Math.cos((double)((eg) this).field_h * var9) + (double)var8) + (var4 - 6), var5 + ((int)((double)var8 + Math.sin(var9 * (double)((eg) this).field_h) * (double)var8) + -6), 12, 12, 255 + -(var11 % 10 * 25));
                    ob.field_c.d(var4 + -(int)((double)var8 * Math.cos((double)((eg) this).field_h * var9) - (double)var8) - 6, -(int)((double)(-var8) + (double)var8 * Math.sin(var9 * (double)((eg) this).field_h)) + (var5 - 6), 12, 12, 255 - 25 * (var11 % 10));
                    var11 += 2;
                    continue L5;
                  }
                }
              } else {
                L6: {
                  if (-1 == ((eg) this).field_h) {
                    var6[((eg) this).field_n].e(var4, var5);
                    ((eg) this).field_q = var6[((eg) this).field_n];
                    ((eg) this).field_A = var5;
                    ((eg) this).field_y = var4;
                    break L6;
                  } else {
                    var6[((eg) this).field_n].d(var4, var5);
                    ((eg) this).field_q = var6[((eg) this).field_n].c();
                    ((eg) this).field_y = var4;
                    ((eg) this).field_A = var5;
                    break L6;
                  }
                }
                if (nk.field_T < 250) {
                  break L3;
                } else {
                  if (qh.field_l != 0) {
                    break L4;
                  } else {
                    if (ql.field_c != 0) {
                      break L4;
                    } else {
                      if (nk.field_T >= 400) {
                        break L4;
                      } else {
                        L7: {
                          stackOut_18_0 = this;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_19_0 = stackOut_18_0;
                          if (uc.field_g >= 20) {
                            stackOut_20_0 = this;
                            stackOut_20_1 = 16776960;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            break L7;
                          } else {
                            stackOut_19_0 = this;
                            stackOut_19_1 = 16711680;
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_21_1 = stackOut_19_1;
                            break L7;
                          }
                        }
                        this.a(stackIn_21_1, var6[((eg) this).field_n].field_x / 2 + var4, true, "*", -4 + var5);
                        break L3;
                      }
                    }
                  }
                }
              }
            }
          }
          break L3;
        }
    }

    private final void a(int param0, int param1, boolean param2, tg param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            ((eg) this).a(1, si.field_j, param3, 1, param0, 1, tl.field_a, pk.field_s, (byte) 126);
            if (param1 <= -73) {
              L1: {
                if (((eg) this).b(param3, -4) != 1) {
                  break L1;
                } else {
                  if (0 == ((eg) this).field_e) {
                    ((eg) this).field_z = 0;
                    ((eg) this).field_x = 0;
                    if (((eg) this).field_B == 5) {
                      break L1;
                    } else {
                      if (((eg) this).field_B == 22) {
                        break L1;
                      } else {
                        if (38 != ((eg) this).field_B) {
                          if (64 < ((eg) this).field_d) {
                            break L1;
                          } else {
                            L2: {
                              stackOut_11_0 = 0;
                              stackIn_13_0 = stackOut_11_0;
                              stackIn_12_0 = stackOut_11_0;
                              if (pk.field_s) {
                                stackOut_13_0 = stackIn_13_0;
                                stackOut_13_1 = 0;
                                stackIn_14_0 = stackOut_13_0;
                                stackIn_14_1 = stackOut_13_1;
                                break L2;
                              } else {
                                stackOut_12_0 = stackIn_12_0;
                                stackOut_12_1 = 1;
                                stackIn_14_0 = stackOut_12_0;
                                stackIn_14_1 = stackOut_12_1;
                                break L2;
                              }
                            }
                            if (stackIn_14_0 != stackIn_14_1) {
                              if (!pk.field_s) {
                                break L1;
                              } else {
                                if (6 == ((eg) this).field_B) {
                                  tl.field_a.a(nl.field_q[6], 100, 256 * ee.field_p / 100);
                                  break L1;
                                } else {
                                  tl.field_a.a(si.field_j[5], 100, ee.field_p * 256 / 100);
                                  break L1;
                                }
                              }
                            } else {
                              tl.field_a.a(si.field_j[4], 100, ee.field_p * 256 / 100);
                              break L1;
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (param2) {
                  L4: {
                    ((eg) this).field_z = ((eg) this).field_z + 1;
                    ((eg) this).field_n = 21;
                    if (25 >= ((eg) this).field_z) {
                      break L4;
                    } else {
                      ((eg) this).field_n = 22;
                      break L4;
                    }
                  }
                  if (-7 != ((eg) this).field_B) {
                    break L3;
                  } else {
                    L5: {
                      ((eg) this).field_n = 22;
                      if (-16 >= ((eg) this).field_z) {
                        break L5;
                      } else {
                        ((eg) this).field_n = 23;
                        break L5;
                      }
                    }
                    if (((eg) this).field_z > 25) {
                      ((eg) this).field_n = 24;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  ((eg) this).field_n = 21;
                  break L3;
                }
              }
              L6: {
                if (((eg) this).field_s <= 0) {
                  break L6;
                } else {
                  if (!param2) {
                    L7: {
                      ((eg) this).field_s = ((eg) this).field_s - 1;
                      ((eg) this).field_p = ((eg) this).field_p - 1;
                      if (((eg) this).field_p > 0) {
                        if (!pk.field_s) {
                          break L7;
                        } else {
                          if (param2) {
                            break L7;
                          } else {
                            this.c(1);
                            break L7;
                          }
                        }
                      } else {
                        if (!pk.field_s) {
                          break L7;
                        } else {
                          if (param2) {
                            break L7;
                          } else {
                            int discarded$1 = 0;
                            this.c();
                            break L7;
                          }
                        }
                      }
                    }
                    if (((eg) this).field_p <= 0) {
                      ((eg) this).field_e = 60;
                      break L6;
                    } else {
                      break L6;
                    }
                  } else {
                    break L6;
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
          L8: {
            var5 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var5;
            stackOut_44_1 = new StringBuilder().append("eg.P(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param3 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L8;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L8;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + 41);
        }
    }

    private final void a(boolean param0, int param1, int param2, tg param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 22) {
                break L1;
              } else {
                var6 = null;
                ((eg) this).a(81, 113, (ob) null);
                break L1;
              }
            }
            L2: {
              ((eg) this).a(1, si.field_j, param3, 1, param2, 1, tl.field_a, pk.field_s, (byte) -37);
              if (((eg) this).field_e <= 0) {
                ((eg) this).field_x = 3;
                ((eg) this).field_z = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ((eg) this).field_n = 20;
              if (6 == ((eg) this).field_B) {
                ((eg) this).field_n = 22;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((eg) this).field_s <= 0) {
                break L4;
              } else {
                if (!param0) {
                  L5: {
                    ((eg) this).field_s = ((eg) this).field_s - 1;
                    ((eg) this).field_p = ((eg) this).field_p - 1;
                    if (((eg) this).field_p > 0) {
                      if (!pk.field_s) {
                        break L5;
                      } else {
                        if (param0) {
                          break L5;
                        } else {
                          this.c(1);
                          break L5;
                        }
                      }
                    } else {
                      if (!pk.field_s) {
                        break L5;
                      } else {
                        if (param0) {
                          break L5;
                        } else {
                          int discarded$1 = 0;
                          this.c();
                          break L5;
                        }
                      }
                    }
                  }
                  if (((eg) this).field_p <= 0) {
                    ((eg) this).field_e = 60;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("eg.L(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    private final void a(boolean param0, int param1, int param2, byte param3, tg param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (((eg) this).b(param4, -4) != 0) {
                break L1;
              } else {
                if (3 != param1) {
                  ((eg) this).field_x = 3;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == 3) {
                ((eg) this).a(2, si.field_j, param4, 0, param2, 1, tl.field_a, pk.field_s, (byte) 126);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 == 0) {
                ((eg) this).a(1, si.field_j, param4, 0, param2, 1, tl.field_a, pk.field_s, (byte) 126);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1 == 2) {
                ((eg) this).a(0, si.field_j, param4, 0, param2, 1, tl.field_a, pk.field_s, (byte) -117);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param1 == 1) {
                L6: {
                  if (~((eg) this).field_i.field_a < ~ii.field_e[0].field_i.field_a) {
                    break L6;
                  } else {
                    if (((eg) this).field_e != 0) {
                      break L6;
                    } else {
                      ((eg) this).a(0, si.field_j, param4, 0, param2, 1, tl.field_a, pk.field_s, (byte) 127);
                      break L5;
                    }
                  }
                }
                ((eg) this).a(1, si.field_j, param4, 1, param2, 1, tl.field_a, pk.field_s, (byte) -65);
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              ((eg) this).field_z = ((eg) this).field_z - 1;
              if (0 < ((eg) this).field_z) {
                break L7;
              } else {
                ((eg) this).field_z = 5;
                ((eg) this).field_n = ((eg) this).field_n + 1;
                if (param0) {
                  ((eg) this).field_z = 2;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if (((eg) this).field_n >= 2) {
                break L8;
              } else {
                ((eg) this).field_n = 2;
                break L8;
              }
            }
            L9: {
              if (!param0) {
                if (5 < ((eg) this).field_n) {
                  ((eg) this).field_n = 2;
                  break L9;
                } else {
                  break L9;
                }
              } else {
                if (((eg) this).field_n > 9) {
                  ((eg) this).field_n = 2;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (param3 < -58) {
                break L10;
              } else {
                this.a(-80, -12, (byte) -64);
                break L10;
              }
            }
            L11: {
              L12: {
                if (((eg) this).field_s <= 0) {
                  break L12;
                } else {
                  if (!param0) {
                    L13: {
                      ((eg) this).field_s = ((eg) this).field_s - 1;
                      ((eg) this).field_p = ((eg) this).field_p - 1;
                      if (((eg) this).field_p > 0) {
                        if (!pk.field_s) {
                          break L13;
                        } else {
                          if (!param0) {
                            this.c(1);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      } else {
                        if (!pk.field_s) {
                          break L13;
                        } else {
                          if (param0) {
                            break L13;
                          } else {
                            int discarded$2 = 0;
                            this.c();
                            break L13;
                          }
                        }
                      }
                    }
                    if (((eg) this).field_p <= 0) {
                      L14: {
                        if (((eg) this).field_p <= 0) {
                          if (!pk.field_s) {
                            break L14;
                          } else {
                            if (param0) {
                              break L14;
                            } else {
                              int discarded$3 = 0;
                              this.c();
                              break L14;
                            }
                          }
                        } else {
                          if (!pk.field_s) {
                            break L14;
                          } else {
                            if (param0) {
                              break L14;
                            } else {
                              this.c(1);
                              break L14;
                            }
                          }
                        }
                      }
                      ((eg) this).field_e = 60;
                      break L12;
                    } else {
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
              }
              break L11;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var6;
            stackOut_57_1 = new StringBuilder().append("eg.M(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param4 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L15;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L15;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + 41);
        }
    }

    final void a(int param0, int param1, ob param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        try {
          L0: {
            L1: {
              ((eg) this).field_n = 0;
              ((eg) this).field_w = 0;
              ((eg) this).field_q = null;
              ((eg) this).field_z = 0;
              ((eg) this).field_B = param1;
              ((eg) this).field_x = 0;
              ((eg) this).field_i.a(-109, param2);
              ((eg) this).field_f.b(17939);
              ((eg) this).field_m = 0;
              ((eg) this).field_e = 0;
              ((eg) this).field_z = 0;
              ((eg) this).field_r = 0;
              ((eg) this).field_o = 0;
              ((eg) this).field_d = 32;
              ((eg) this).field_h = 1;
              ((eg) this).field_p = 0;
              ((eg) this).field_k = 0;
              ((eg) this).field_s = 0;
              if (param1 == 0) {
                ((eg) this).field_d = 64;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (21 != param1) {
                break L2;
              } else {
                ((eg) this).field_d = 32;
                break L2;
              }
            }
            L3: {
              if (param1 == 1) {
                ((eg) this).field_d = 24;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1 == 2) {
                ((eg) this).field_d = 64;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (3 != param1) {
                break L5;
              } else {
                ((eg) this).field_p = 1;
                ((eg) this).field_d = 32;
                break L5;
              }
            }
            L6: {
              if (4 != param1) {
                break L6;
              } else {
                ((eg) this).field_p = 4;
                ((eg) this).field_d = 48;
                break L6;
              }
            }
            L7: {
              if (param1 == 5) {
                ((eg) this).field_p = 1;
                ((eg) this).field_d = 32;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (param1 == 6) {
                ((eg) this).field_d = 65;
                ((eg) this).field_f.field_b = ((eg) this).field_f.field_b - 80;
                ((eg) this).field_p = 50;
                ((eg) this).field_o = 7;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param1 != 7) {
                break L9;
              } else {
                ((eg) this).field_p = 5;
                ((eg) this).field_d = 48;
                break L9;
              }
            }
            L10: {
              if (param1 == 8) {
                ((eg) this).field_d = 32;
                ((eg) this).field_p = 1;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (9 == param1) {
                ((eg) this).field_d = 48;
                ((eg) this).field_p = 4;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (param1 != 10) {
                break L12;
              } else {
                ((eg) this).field_p = 8;
                ((eg) this).field_d = 64;
                break L12;
              }
            }
            L13: {
              if (param1 != 11) {
                break L13;
              } else {
                ((eg) this).field_d = 64;
                break L13;
              }
            }
            L14: {
              if (param1 == 12) {
                ((eg) this).field_d = 65;
                ((eg) this).field_p = 50;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (13 == param1) {
                ((eg) this).field_d = 48;
                ((eg) this).field_p = 3;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (param1 != 14) {
                break L16;
              } else {
                ((eg) this).field_p = 5;
                ((eg) this).field_d = 48;
                break L16;
              }
            }
            L17: {
              if (15 != param1) {
                break L17;
              } else {
                ((eg) this).field_d = 48;
                ((eg) this).field_p = 6;
                break L17;
              }
            }
            L18: {
              if (param1 == 16) {
                ((eg) this).field_d = 64;
                ((eg) this).field_p = 10;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (17 == param1) {
                ((eg) this).field_d = 80;
                ((eg) this).field_p = 75;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (18 == param1) {
                ((eg) this).field_d = 24;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (19 != param1) {
                break L21;
              } else {
                ((eg) this).field_d = 20;
                break L21;
              }
            }
            L22: {
              if (param1 != 25) {
                break L22;
              } else {
                ((eg) this).field_d = 80;
                break L22;
              }
            }
            L23: {
              if (param1 != 22) {
                break L23;
              } else {
                ((eg) this).field_p = 3;
                ((eg) this).field_d = 32;
                break L23;
              }
            }
            L24: {
              if (param1 == 23) {
                ((eg) this).field_p = 12;
                ((eg) this).field_d = 80;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (param1 == 24) {
                ((eg) this).field_p = 6;
                ((eg) this).field_d = 48;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (26 == param1) {
                ((eg) this).field_d = 96;
                ((eg) this).field_p = 75;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (param1 != 27) {
                break L27;
              } else {
                ((eg) this).field_d = 40;
                break L27;
              }
            }
            L28: {
              if (param1 != 28) {
                break L28;
              } else {
                ((eg) this).field_d = 24;
                break L28;
              }
            }
            L29: {
              if (param1 == 29) {
                ((eg) this).field_d = 64;
                ((eg) this).field_p = 6;
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (param1 == 30) {
                ((eg) this).field_d = 64;
                ((eg) this).field_p = 4;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (param1 == 31) {
                ((eg) this).field_d = 64;
                ((eg) this).field_p = 15;
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              if (param1 == 32) {
                ((eg) this).field_d = 80;
                ((eg) this).field_p = 12;
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if (33 != param1) {
                break L33;
              } else {
                ((eg) this).field_p = 75;
                ((eg) this).field_d = 96;
                break L33;
              }
            }
            L34: {
              if (param1 != 34) {
                break L34;
              } else {
                ((eg) this).field_d = 64;
                break L34;
              }
            }
            L35: {
              if (param1 == 35) {
                ((eg) this).field_d = 64;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if (42 == param1) {
                ((eg) this).field_d = 64;
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              if (43 == param1) {
                ((eg) this).field_d = 96;
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              if (36 == param1) {
                ((eg) this).field_p = 1;
                ((eg) this).field_d = 32;
                break L38;
              } else {
                break L38;
              }
            }
            L39: {
              if (37 == param1) {
                ((eg) this).field_d = 80;
                ((eg) this).field_p = 20;
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              if (param1 != 38) {
                break L40;
              } else {
                ((eg) this).field_d = 48;
                ((eg) this).field_p = 6;
                break L40;
              }
            }
            L41: {
              if (39 != param1) {
                break L41;
              } else {
                ((eg) this).field_d = 64;
                ((eg) this).field_p = 10;
                break L41;
              }
            }
            L42: {
              if (40 == param1) {
                ((eg) this).field_d = 80;
                ((eg) this).field_p = 200;
                break L42;
              } else {
                break L42;
              }
            }
            if (param0 == 9147) {
              L43: {
                if (param1 != 41) {
                  break L43;
                } else {
                  ((eg) this).field_d = 128;
                  break L43;
                }
              }
              L44: {
                if (param1 == 45) {
                  ((eg) this).field_d = 96;
                  break L44;
                } else {
                  break L44;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L45: {
            var4 = decompiledCaughtException;
            stackOut_117_0 = (RuntimeException) var4;
            stackOut_117_1 = new StringBuilder().append("eg.N(").append(param0).append(44).append(param1).append(44);
            stackIn_119_0 = stackOut_117_0;
            stackIn_119_1 = stackOut_117_1;
            stackIn_118_0 = stackOut_117_0;
            stackIn_118_1 = stackOut_117_1;
            if (param2 == null) {
              stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
              stackOut_119_1 = (StringBuilder) (Object) stackIn_119_1;
              stackOut_119_2 = "null";
              stackIn_120_0 = stackOut_119_0;
              stackIn_120_1 = stackOut_119_1;
              stackIn_120_2 = stackOut_119_2;
              break L45;
            } else {
              stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
              stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
              stackOut_118_2 = "{...}";
              stackIn_120_0 = stackOut_118_0;
              stackIn_120_1 = stackOut_118_1;
              stackIn_120_2 = stackOut_118_2;
              break L45;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_120_0, stackIn_120_2 + 41);
        }
    }

    eg() {
        ((eg) this).field_k = 0;
        ((eg) this).field_w = 0;
        ((eg) this).field_x = 0;
        ((eg) this).field_B = 0;
        ((eg) this).field_i.b(17939);
        ((eg) this).field_f.b(17939);
        ((eg) this).field_m = 0;
        ((eg) this).field_p = 0;
        ((eg) this).field_r = 0;
        ((eg) this).field_e = 0;
        ((eg) this).field_h = 1;
        ((eg) this).field_o = 0;
        ((eg) this).field_q = null;
        ((eg) this).field_d = 32;
        ((eg) this).field_s = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "More suggestions";
    }
}
