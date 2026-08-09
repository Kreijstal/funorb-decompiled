/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends in {
    static nd field_e;
    static int[] field_g;
    private long field_i;
    private long field_j;
    private int field_o;
    static bd field_k;
    private int field_p;
    private long[] field_r;
    private long field_q;
    static int field_m;
    static int field_f;
    static String field_h;
    static String[] field_n;
    static String field_l;

    final long a(byte param0) {
        this.field_j = this.field_j + this.b(1);
        if (!(this.field_j >= this.field_q)) {
            return (this.field_q - this.field_j) / 1000000L;
        }
        if (param0 > -21) {
            field_m = -113;
        }
        return 0L;
    }

    final static void c(boolean param0) {
        ig.field_N.field_k = 0;
        ig.field_N.field_e = 0;
        if (!param0) {
            lg.c(true);
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        bd stackIn_17_0 = null;
        bd stackIn_26_0 = null;
        bd stackIn_95_0 = null;
        bd stackIn_104_0 = null;
        Throwable decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var8_double = 0.0;
        Exception var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        qm var13 = null;
        oj var14 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4_int = param1;
            L1: while (true) {
              if (var4_int >= dk.field_o) {
                L2: {
                  if (param2 == 1) {
                    var12 = 0;
                    var4_int = var12;
                    L3: while (true) {
                      if (rc.field_e <= var12) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            var14 = re.field_n[var12];
                            if ((var14.field_i ^ -1) == -23) {
                              var5 = -param3 + (int)(24.0 * (var14.field_l.field_f + (-0.5 + (double)var14.field_j.field_e)));
                              var6 = -param0 + (int)(24.0 * (var14.field_l.field_a + ((double)var14.field_j.field_g + 0.5)));
                              if (-96 > var5) {
                                break L4;
                              } else {
                                if (var6 < -96) {
                                  break L4;
                                } else {
                                  if (736 < var5) {
                                    break L4;
                                  } else {
                                    if (-577 <= (var6 ^ -1)) {
                                      L6: {
                                        if (var14.field_I <= 0) {
                                          stackIn_104_0 = v.field_j;
                                          break L6;
                                        } else {
                                          stackIn_104_0 = ci.field_b;
                                          break L6;
                                        }
                                      }
                                      ((bd) (Object) stackIn_104_0).a(true, 128, (int)var14.field_c, -8 + var5, -8 + var6);
                                      break L5;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            } else {
                              if ((var14.field_i ^ -1) == -6) {
                                var6 = -param0 + (int)(24.0 * (0.5 + (double)var14.field_j.field_g + var14.field_l.field_a));
                                var5 = -param3 + (int)((var14.field_l.field_f + (-0.5 + (double)var14.field_j.field_e)) * 24.0);
                                if (-96 > var5) {
                                  break L4;
                                } else {
                                  if (95 < (var6 ^ -1)) {
                                    break L4;
                                  } else {
                                    if (-737 > (var5 ^ -1)) {
                                      break L4;
                                    } else {
                                      if (576 < var6) {
                                        break L4;
                                      } else {
                                        L7: {
                                          if (0 < var14.field_I) {
                                            stackIn_95_0 = ia.field_l[12];
                                            break L7;
                                          } else {
                                            stackIn_95_0 = rl.field_d;
                                            break L7;
                                          }
                                        }
                                        ((bd) (Object) stackIn_95_0).a(true, 128, (int)var14.field_c, -8 + var5, -8 + var6);
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L8: {
                                  if ((var14.field_i ^ -1) == -25) {
                                    break L8;
                                  } else {
                                    if ((var14.field_i ^ -1) == -5) {
                                      break L8;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                var6 = (int)(24.0 * (var14.field_l.field_a + (0.5 + (double)var14.field_j.field_g))) + -param0;
                                var5 = (int)(((double)var14.field_j.field_e + -0.5 + var14.field_l.field_f) * 24.0) + -param3;
                                if (-96 > var5) {
                                  break L4;
                                } else {
                                  if (var6 < -96) {
                                    break L4;
                                  } else {
                                    if (var5 > 736) {
                                      break L4;
                                    } else {
                                      if ((var6 ^ -1) >= -577) {
                                        ia.field_l[10].a(true, 128, (int)var14.field_c, var5, var6);
                                        break L5;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (0 == ue.field_d) {
                            if (-7 == (var14.field_i ^ -1)) {
                              var6 = -param0 + (int)((var14.field_l.field_a + (0.5 + (double)var14.field_j.field_g)) * 24.0);
                              var5 = (int)(24.0 * (var14.field_l.field_f + ((double)var14.field_j.field_e + -0.5))) - param3;
                              if (var5 < -96) {
                                break L4;
                              } else {
                                if (-96 > var6) {
                                  break L4;
                                } else {
                                  if (-737 > (var5 ^ -1)) {
                                    break L4;
                                  } else {
                                    if (var6 <= 576) {
                                      ia.field_l[13].a(true, 128, 0, var5, var6);
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (var14.field_u == null) {
                                break L4;
                              } else {
                                if (128 == var14.field_i) {
                                  break L4;
                                } else {
                                  if ((var14.field_i ^ -1) == -130) {
                                    break L4;
                                  } else {
                                    if (130 == var14.field_i) {
                                      break L4;
                                    } else {
                                      if ((var14.field_i ^ -1) == -132) {
                                        break L4;
                                      } else {
                                        if ((var14.field_i ^ -1) == -133) {
                                          break L4;
                                        } else {
                                          if (133 != var14.field_i) {
                                            var5 = (int)(((double)var14.field_j.field_e + -0.5 + var14.field_l.field_f) * 24.0) - param3;
                                            var6 = (int)(((double)var14.field_j.field_g + 0.5 + var14.field_l.field_a) * 24.0) + -param0;
                                            if ((var5 ^ -1) > 95) {
                                              break L4;
                                            } else {
                                              if (95 < (var6 ^ -1)) {
                                                break L4;
                                              } else {
                                                if ((var5 ^ -1) < -737) {
                                                  break L4;
                                                } else {
                                                  if ((var6 ^ -1) >= -577) {
                                                    var14.field_u.a((double)var6, (double)var5, false, var14.field_c, 128);
                                                    break L4;
                                                  } else {
                                                    break L4;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            break L4;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        var12++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                L9: {
                  var13 = vj.field_w[var4_int];
                  if (var13 == null) {
                    break L9;
                  } else {
                    if (var13.c(0) == param2) {
                      try {
                        L10: {
                          L11: {
                            var6 = (int)(((double)var13.field_j.field_g + 0.5 + var13.field_l.field_a) * 24.0) + -param0;
                            var5 = (int)(24.0 * (-0.5 + (double)var13.field_j.field_e + var13.field_l.field_f)) + -param3;
                            if ((var5 ^ -1) > 95) {
                              break L11;
                            } else {
                              if (var6 < -96) {
                                break L11;
                              } else {
                                if (-737 > (var5 ^ -1)) {
                                  break L11;
                                } else {
                                  if (576 < var6) {
                                    break L11;
                                  } else {
                                    L12: {
                                      if (9 == var13.field_i) {
                                        break L12;
                                      } else {
                                        if (22 != var13.field_i) {
                                          if (-6 == (var13.field_i ^ -1)) {
                                            L13: {
                                              if (-1 <= (var13.field_I ^ -1)) {
                                                stackIn_26_0 = rl.field_d;
                                                break L13;
                                              } else {
                                                stackIn_26_0 = ia.field_l[12];
                                                break L13;
                                              }
                                            }
                                            ((bd) (Object) stackIn_26_0).a(true, 128, (int)var13.field_c, var5 + -8, -8 + var6);
                                            break L12;
                                          } else {
                                            if (-31 != (var13.field_i ^ -1)) {
                                              if (var13.field_i != 230) {
                                                break L12;
                                              } else {
                                                qm.field_P.a(true, 128, (int)var13.field_c, -8 + var5, -8 + var6);
                                                break L12;
                                              }
                                            } else {
                                              c.field_f[em.field_c / 2 % c.field_f.length].a(true, 128, (int)var13.field_c, var5, var6);
                                              break L12;
                                            }
                                          }
                                        } else {
                                          L14: {
                                            if ((var13.field_I ^ -1) >= -1) {
                                              stackIn_17_0 = v.field_j;
                                              break L14;
                                            } else {
                                              stackIn_17_0 = ci.field_b;
                                              break L14;
                                            }
                                          }
                                          ((bd) (Object) stackIn_17_0).a(true, 128, (int)var13.field_c, var5 - 8, var6 - 8);
                                          break L12;
                                        }
                                      }
                                    }
                                    L15: {
                                      if (-1 == (ue.field_d ^ -1)) {
                                        if (6 != var13.field_i) {
                                          if (var13.field_u == null) {
                                            break L15;
                                          } else {
                                            if (var13.field_i == 128) {
                                              break L15;
                                            } else {
                                              if ((var13.field_i ^ -1) == -130) {
                                                break L15;
                                              } else {
                                                if (-131 == (var13.field_i ^ -1)) {
                                                  break L15;
                                                } else {
                                                  if ((var13.field_i ^ -1) == -132) {
                                                    break L15;
                                                  } else {
                                                    if (-133 == (var13.field_i ^ -1)) {
                                                      break L15;
                                                    } else {
                                                      if (133 != var13.field_i) {
                                                        var13.field_u.a(true, 128, (int)var13.field_c, var5, var6);
                                                        break L15;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          ia.field_l[13].a((double)var6, (double)var5, false, var13.field_c, 128);
                                          break L15;
                                        }
                                      } else {
                                        break L15;
                                      }
                                    }
                                    if (246 == var13.field_i) {
                                      L16: {
                                        var8_double = var13.field_c % 256.0;
                                        if (var13.field_u != vb.field_Kb[13]) {
                                          break L16;
                                        } else {
                                          L17: {
                                            if (64.0 == var8_double) {
                                              break L17;
                                            } else {
                                              if (192.0 != var8_double) {
                                                if (var8_double == 0.0) {
                                                  var5 -= 2;
                                                  break L16;
                                                } else {
                                                  if (var8_double == 128.0) {
                                                    var5 += 2;
                                                    break L16;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          var8_double = 256.0 - var8_double;
                                          break L16;
                                        }
                                      }
                                      if (0.0 != var8_double) {
                                        if (64.0 == var8_double) {
                                          L18: {
                                            var10 = ng.field_u / 2 % 3;
                                            ie.field_b[var10].c(var5 - 16, -56 + var6);
                                            var10++;
                                            if (var10 < ie.field_b.length) {
                                              break L18;
                                            } else {
                                              var10 = 0;
                                              break L18;
                                            }
                                          }
                                          ie.field_b[var10].c(var5 - 16, 23 + var6);
                                          break L11;
                                        } else {
                                          if (128.0 == var8_double) {
                                            L19: {
                                              var10 = ng.field_u / 2 % 3;
                                              ie.field_b[var10].c(-56 + var5, -16 + var6);
                                              var10++;
                                              if (ie.field_b.length > var10) {
                                                break L19;
                                              } else {
                                                var10 = 0;
                                                break L19;
                                              }
                                            }
                                            ie.field_b[var10].c(23 + var5, -16 + var6);
                                            break L11;
                                          } else {
                                            if (192.0 != var8_double) {
                                              break L11;
                                            } else {
                                              L20: {
                                                var10 = ng.field_u / 2 % 3;
                                                ie.field_b[var10].c(var5 + -16, -55 + var6);
                                                var10++;
                                                if (var10 >= ie.field_b.length) {
                                                  var10 = 0;
                                                  break L20;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                              ie.field_b[var10].c(-16 + var5, 24 + var6);
                                              break L11;
                                            }
                                          }
                                        }
                                      } else {
                                        L21: {
                                          var10 = ng.field_u / 2 % 3;
                                          ie.field_b[var10].c(-54 + var5, var6 + -16);
                                          var10++;
                                          if (var10 >= ie.field_b.length) {
                                            var10 = 0;
                                            break L21;
                                          } else {
                                            break L21;
                                          }
                                        }
                                        ie.field_b[var10].c(25 + var5, var6 + -16);
                                        break L11;
                                      }
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          break L10;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L22: {
                          var8 = (Exception) (Object) decompiledCaughtException;
                          break L22;
                        }
                      }
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var4), "lg.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int a(byte param0, long param1) {
        int var4;
        int var5;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          if (param0 <= -122) {
            break L0;
          } else {
            lg.a(-6, 9, -15, -117);
            break L0;
          }
        }
        if ((this.field_q ^ -1L) < (this.field_j ^ -1L)) {
          this.field_i = this.field_i + (-this.field_j + this.field_q);
          this.field_j = this.field_j + (-this.field_j + this.field_q);
          this.field_q = this.field_q + param1;
          return 1;
        } else {
          var4 = 0;
          L1: while (true) {
            L2: {
              this.field_q = this.field_q + param1;
              var4++;
              if ((var4 ^ -1) <= -11) {
                break L2;
              } else {
                if ((this.field_q ^ -1L) > (this.field_j ^ -1L)) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if ((this.field_j ^ -1L) >= (this.field_q ^ -1L)) {
                break L3;
              } else {
                this.field_q = this.field_j;
                break L3;
              }
            }
            return var4;
          }
        }
    }

    final void b(boolean param0) {
        if (param0) {
            lg.a(-37, 17, 11, -80);
        }
        this.field_i = 0L;
        if (this.field_j < this.field_q) {
            this.field_j = this.field_j + (this.field_q + -this.field_j);
        }
    }

    private final long b(int param0) {
        int var8 = 0;
        int var9 = HostileSpawn.field_I ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 - this.field_i;
        this.field_i = var2;
        if ((var4 ^ -1L) < 4999999999L) {
            if (!(-5000000001L >= (var4 ^ -1L))) {
                this.field_r[this.field_o] = var4;
                if (1 > this.field_p) {
                    this.field_p = this.field_p + 1;
                }
                this.field_o = (this.field_o + 1) % 10;
            }
        }
        long var6 = 0L;
        if (param0 != 1) {
            return -82L;
        }
        for (var8 = 1; this.field_p >= var8; var8++) {
            var6 = var6 + this.field_r[(10 + -var8 + this.field_o) % 10];
        }
        return var6 / (long)this.field_p;
    }

    public static void b(byte param0) {
        field_g = null;
        field_e = null;
        if (param0 >= -111) {
            field_f = -60;
        }
        field_l = null;
        field_h = null;
        field_n = null;
        field_k = null;
    }

    lg() {
        this.field_i = 0L;
        this.field_j = 0L;
        this.field_r = new long[10];
        this.field_p = 1;
        this.field_q = 0L;
        this.field_o = 0;
        this.field_j = System.nanoTime();
        this.field_q = System.nanoTime();
    }

    static {
        field_f = 0;
        field_e = new nd(10, 2, 2, 0);
        field_h = "Highscores";
        field_n = new String[]{"Ammo", "Fuel", "Cells", "Rockets"};
        field_l = "Start Game";
    }
}
