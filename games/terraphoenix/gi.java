/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    private dk field_u;
    static bg[] field_j;
    int field_o;
    double field_t;
    static qf field_r;
    double field_b;
    e field_g;
    int field_m;
    double field_k;
    double field_p;
    double field_i;
    int field_c;
    ga field_e;
    static int field_v;
    private int field_f;
    int field_x;
    double field_y;
    int field_a;
    int field_s;
    int field_d;
    static String field_q;
    static tf field_l;
    static boolean field_w;
    static int field_h;
    private boolean field_n;

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        var12 = Terraphoenix.field_V;
        if (((gi) this).field_n) {
          L0: {
            var3 = 240 + (int)(((double)((gi) this).field_c + ((gi) this).field_y / 100.0) * 16.0 + 16.0 * (((gi) this).field_p / 100.0 + (double)((gi) this).field_m) - (double)lg.field_c + (double)(96 * ((gi) this).field_x));
            var4 = (int)(48.0 * (((double)(300 * ((gi) this).field_x) + ((gi) this).field_t) / 100.0));
            var2 = (int)((double)(-sj.field_b) + ((((gi) this).field_y / 100.0 + (double)((gi) this).field_c) * 32.0 - ((double)((gi) this).field_m + ((gi) this).field_p / 100.0) * 32.0)) + 320;
            if (((gi) this).field_s == -1) {
              if (-5 > ((gi) this).field_f) {
                te.a((byte) 99, 12 - ((gi) this).field_f * 3, var2, var3, var4, 16777215, false);
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          L1: {
            if (2 != ((gi) this).field_s) {
              break L1;
            } else {
              if (((gi) this).field_f >= 16) {
                break L1;
              } else {
                te.a((byte) 99, 8 + -(((gi) this).field_f / 2), var2, var3, var4, 16777215, false);
                break L1;
              }
            }
          }
          L2: {
            if (((gi) this).field_s != 3) {
              break L2;
            } else {
              L3: {
                if (((gi) this).field_f < 6) {
                  te.a((byte) 99, 4 * ((gi) this).field_f, var2, var3, var4, 65535, false);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (32 <= ((gi) this).field_f) {
                break L2;
              } else {
                te.a((byte) 99, 8 - ((gi) this).field_f / 4, var2, var3, var4, 65535, false);
                break L2;
              }
            }
          }
          L4: {
            if (-5 == ((gi) this).field_s) {
              L5: {
                if (-7 <= ((gi) this).field_f) {
                  break L5;
                } else {
                  te.a((byte) 99, ((gi) this).field_f * 4, var2, var3, var4, 16711680, false);
                  break L5;
                }
              }
              L6: {
                if (((gi) this).field_f < 32) {
                  te.a((byte) 99, 16 - ((gi) this).field_f / 2, var2, var3, var4, 16711680, false);
                  break L6;
                } else {
                  break L6;
                }
              }
              if ((((gi) this).field_f ^ -1) <= -9) {
                return;
              } else {
                te.a((byte) 99, 16 + -(((gi) this).field_f * 2), var2, var3, var4, 16777215, false);
                break L4;
              }
            } else {
              break L4;
            }
          }
          return;
        } else {
          L7: {
            var3 = 240 - -(int)((double)(((gi) this).field_x * 96) + (((double)((gi) this).field_m + ((gi) this).field_p / 100.0) * 16.0 + ((double)((gi) this).field_c + ((gi) this).field_y / 100.0) * (double)param0 - (double)lg.field_c));
            var2 = (int)((((gi) this).field_y / 100.0 + (double)((gi) this).field_c) * 32.0 - (((gi) this).field_p / 100.0 + (double)((gi) this).field_m) * 32.0 - (double)sj.field_b) + 320;
            var4 = (int)(((double)(((gi) this).field_x * 300) + ((gi) this).field_t) / 100.0 * 48.0);
            if (-1 != (((gi) this).field_s ^ -1)) {
              break L7;
            } else {
              var5 = (((gi) this).field_b + -((gi) this).field_i) * 32.0 * (double)((gi) this).field_o / 1600.0;
              var7 = (-((gi) this).field_i - ((gi) this).field_b) * 16.0 * (double)((gi) this).field_o / 1600.0;
              var9 = -((gi) this).field_k * 48.0 * (double)((gi) this).field_o / 1600.0;
              if ((((gi) this).field_d ^ -1) <= -6) {
                var11 = 0;
                L8: while (true) {
                  if (-11 >= var11) {
                    var11 = 0;
                    L9: while (true) {
                      if (8 <= var11) {
                        break L7;
                      } else {
                        te.a((byte) 99, 2, (int)((double)var2 + var5 * (double)var11 / 10.0), (int)((double)var3 + var7 * (double)var11 / 10.0), (int)((double)var4 + var9 * (double)var11 / 10.0), 16777215, true);
                        var11++;
                        continue L9;
                      }
                    }
                  } else {
                    if (-9 > var11) {
                      te.a((byte) 99, 3, (int)((double)var2 + (double)var11 * var5 / 10.0), (int)(var7 * (double)var11 / 10.0 + (double)var3), (int)((double)var4 + (double)var11 * var9 / 10.0), 16776960, false);
                      var11++;
                      continue L8;
                    } else {
                      te.a((byte) 99, 3, (int)((double)var11 * var5 / 10.0 + (double)var2), (int)((double)var3 + var7 * (double)var11 / 10.0), (int)((double)var4 + (double)var11 * var9 / 10.0), 16744448, false);
                      var11++;
                      continue L8;
                    }
                  }
                }
              } else {
                var11 = 0;
                L10: while (true) {
                  if (var11 >= 16) {
                    var11 = 0;
                    L11: while (true) {
                      if ((var11 ^ -1) <= -13) {
                        break L7;
                      } else {
                        te.a((byte) 99, -(var11 / 2) + 6, (int)((double)var2 - var5 * (double)var11 / 10.0), var3, (int)((double)var11 * var7 / 10.0 + (double)var4 - (double)var11 * var9 / 10.0), 16777215, true);
                        var11++;
                        continue L11;
                      }
                    }
                  } else {
                    te.a((byte) 99, -(var11 / 2) + 8, (int)((double)var2 - var5 * (double)var11 / 10.0), var3, (int)((double)var4 + (double)var11 * var7 / 10.0 - var9 * (double)var11 / 10.0), 16776960, false);
                    var11++;
                    continue L10;
                  }
                }
              }
            }
          }
          L12: {
            if (1 != ((gi) this).field_s) {
              break L12;
            } else {
              var5 = (((gi) this).field_b + -((gi) this).field_i) * 32.0 / 100.0;
              var7 = (-((gi) this).field_b + -((gi) this).field_i) * 16.0 / 100.0;
              var9 = -((gi) this).field_k * 48.0 / 100.0;
              te.a((byte) 99, 6, (int)((double)var2 + var5), (int)((double)var3 + var7), (int)(var9 + (double)var4), 16777215, true);
              te.a((byte) 99, 6, (int)(var5 / 2.0 + (double)var2), (int)((double)var3 + var7 / 2.0), (int)(var9 / 2.0 + (double)var4), 16777215, true);
              te.a((byte) 99, 3, var2, var3, var4, 0, true);
              break L12;
            }
          }
          L13: {
            if (2 == ((gi) this).field_s) {
              var5 = (-((gi) this).field_i + ((gi) this).field_b) * 32.0 / 100.0;
              var7 = 16.0 * (-((gi) this).field_b + -((gi) this).field_i) / 100.0;
              var9 = 48.0 * -((gi) this).field_k / 100.0;
              if (-6 >= (((gi) this).field_d ^ -1)) {
                var11 = 0;
                L14: while (true) {
                  if (-26 >= (var11 ^ -1)) {
                    var11 = 0;
                    L15: while (true) {
                      if (-26 >= (var11 ^ -1)) {
                        var11 = 0;
                        L16: while (true) {
                          if (-26 >= (var11 ^ -1)) {
                            break L13;
                          } else {
                            te.a((byte) 99, 1, (int)((double)var2 - (double)var11 * var5 / 5.0), (int)((double)var3 - var7 * (double)var11 / 5.0), (int)((double)var4 - (double)var11 * var9 / 5.0), 16777215, true);
                            var11++;
                            continue L16;
                          }
                        }
                      } else {
                        te.a((byte) 99, 2, (int)(-(var5 * (double)var11 / 5.0) + (double)var2), (int)(-(var7 * (double)var11 / 5.0) + (double)var3), (int)(-(var9 * (double)var11 / 5.0) + (double)var4), 65280, false);
                        var11++;
                        continue L15;
                      }
                    }
                  } else {
                    te.a((byte) 99, 3, (int)(-(var5 * (double)var11 / 5.0) + (double)var2), (int)(-(var7 * (double)var11 / 5.0) + (double)var3), (int)(-((double)var11 * var9 / 5.0) + (double)var4), 255, false);
                    var11++;
                    continue L14;
                  }
                }
              } else {
                te.a((byte) 99, 10, (int)(-(var5 / 2.0) + (double)var2), var3, (int)((double)var4 + var7 / 2.0 - var9 / 2.0), 255, false);
                te.a((byte) 99, 8, (int)((double)var2 - var5 / 5.0), var3, (int)(-(var9 / 5.0) + ((double)var4 + var7 / 5.0)), 65535, false);
                te.a((byte) 99, 6, var2, var3, var4, 16777215, true);
                break L13;
              }
            } else {
              break L13;
            }
          }
          L17: {
            if (-4 != (((gi) this).field_s ^ -1)) {
              break L17;
            } else {
              var5 = (-((gi) this).field_i + ((gi) this).field_b) * 32.0 / 100.0;
              var7 = 16.0 * (-((gi) this).field_b + -((gi) this).field_i) / 100.0;
              var9 = 48.0 * -((gi) this).field_k / 100.0;
              var11 = 0;
              L18: while (true) {
                if ((var11 ^ -1) <= -9) {
                  var11 = 0;
                  L19: while (true) {
                    if ((var11 ^ -1) <= -7) {
                      break L17;
                    } else {
                      te.a((byte) 99, -var11 + 6, (int)((double)var11 * var5 / 10.0 + (double)var2), (int)((double)var3 + var7 * (double)var11 / 10.0), (int)((double)var11 * var9 / 10.0 + (double)var4), 65535, true);
                      var11++;
                      continue L19;
                    }
                  }
                } else {
                  te.a((byte) 99, -var11 + 8, (int)(var5 * (double)var11 / 10.0 + (double)var2), (int)((double)var3 + var7 * (double)var11 / 10.0), (int)((double)var4 + var9 * (double)var11 / 10.0), 33023, false);
                  var11++;
                  continue L18;
                }
              }
            }
          }
          L20: {
            if (4 != ((gi) this).field_s) {
              break L20;
            } else {
              var5 = (-((gi) this).field_i + ((gi) this).field_b) * 32.0 * (double)((gi) this).field_o / 5200.0;
              var7 = (-((gi) this).field_i - ((gi) this).field_b) * 16.0 * (double)((gi) this).field_o / 5200.0;
              var9 = 48.0 * -((gi) this).field_k * (double)((gi) this).field_o / 5200.0;
              if (5 <= ((gi) this).field_d) {
                var11 = 0;
                L21: while (true) {
                  if (var11 >= 10) {
                    var11 = 0;
                    L22: while (true) {
                      if (8 <= var11) {
                        break L20;
                      } else {
                        te.a((byte) 99, 3, (int)(var5 * (double)var11 / 10.0 + (double)var2), (int)((double)var3 + var7 * (double)var11 / 10.0), (int)((double)var11 * var9 / 10.0 + (double)var4), 16777215, true);
                        var11++;
                        continue L22;
                      }
                    }
                  } else {
                    if (8 <= var11) {
                      te.a((byte) 99, 4, (int)((double)var11 * var5 / 10.0 + (double)var2), (int)((double)var11 * var7 / 10.0 + (double)var3), (int)((double)var4 + (double)var11 * var9 / 10.0), 16711680, false);
                      var11++;
                      continue L21;
                    } else {
                      te.a((byte) 99, 4, (int)(var5 * (double)var11 / 10.0 + (double)var2), (int)((double)var3 + var7 * (double)var11 / 10.0), (int)((double)var4 + var9 * (double)var11 / 10.0), 16744576, false);
                      var11++;
                      continue L21;
                    }
                  }
                }
              } else {
                var11 = 0;
                L23: while (true) {
                  if ((var11 ^ -1) <= -17) {
                    var11 = 0;
                    L24: while (true) {
                      if (12 <= var11) {
                        break L20;
                      } else {
                        te.a((byte) 99, 8 + -(var11 * 2 / 3), (int)(-((double)var11 * var5 / 10.0) + (double)var2), var3, (int)(-(var9 * (double)var11 / 10.0) + ((double)var11 * var7 / 10.0 + (double)var4)), 16777215, true);
                        var11++;
                        continue L24;
                      }
                    }
                  } else {
                    te.a((byte) 99, 10 - var11 * 2 / 3, (int)((double)var2 - var5 * (double)var11 / 10.0), var3, (int)((double)var4 + var7 * (double)var11 / 10.0 - var9 * (double)var11 / 10.0), 16711680, false);
                    var11++;
                    continue L23;
                  }
                }
              }
            }
          }
          L25: {
            if ((((gi) this).field_s ^ -1) != -6) {
              break L25;
            } else {
              te.a((byte) 99, 8, var2, var3, var4, 255, false);
              te.a((byte) 99, 7, var2, var3, var4, 65535, false);
              te.a((byte) 99, 6, var2, var3, var4, 16777215, false);
              break L25;
            }
          }
          L26: {
            if (-7 != (((gi) this).field_s ^ -1)) {
              break L26;
            } else {
              var3 = (int)((double)(-lg.field_c) + (-(((double)(((gi) this).field_x * 100) + ((gi) this).field_t) / 100.0 * 48.0) + (16.0 * ((double)((gi) this).field_m + ((gi) this).field_p / 100.0) + 16.0 * ((double)((gi) this).field_c + ((gi) this).field_y / 100.0)))) + 240;
              var2 = (int)(32.0 * ((double)((gi) this).field_c + ((gi) this).field_y / 100.0) - 32.0 * ((double)((gi) this).field_m + ((gi) this).field_p / 100.0) - (double)sj.field_b) + 320;
              l.e(var2, var3, 3, 8421504);
              break L26;
            }
          }
          L27: {
            if (7 == ((gi) this).field_s) {
              var2 = (int)((double)(-sj.field_b) + (((double)((gi) this).field_c + ((gi) this).field_y / 100.0) * 32.0 - 32.0 * ((double)((gi) this).field_m + ((gi) this).field_p / 100.0))) + 320;
              var3 = 240 - -(int)(-(48.0 * (((double)(((gi) this).field_x * 100) + ((gi) this).field_t) / 100.0)) + ((((gi) this).field_y / 100.0 + (double)((gi) this).field_c) * 16.0 + (((gi) this).field_p / 100.0 + (double)((gi) this).field_m) * 16.0) - (double)lg.field_c);
              l.e(var2, var3, 3, 65535);
              break L27;
            } else {
              break L27;
            }
          }
          return;
        }
    }

    private final gi a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        dl var6 = null;
        int var7 = 0;
        L0: {
          L1: {
            L2: {
              var7 = Terraphoenix.field_V;
              ((gi) this).field_n = true;
              var5 = 54 % ((-72 - param3) / 40);
              if (((gi) this).field_s == 0) {
                break L2;
              } else {
                if (2 == ((gi) this).field_s) {
                  break L2;
                } else {
                  if (((gi) this).field_s != 5) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (((gi) this).field_o < 40) {
              break L0;
            } else {
              break L1;
            }
          }
          if (Math.random() * 100.0 < (double)((gi) this).field_o) {
            var6 = ((gi) this).field_u.a(104, param0, param2, param1);
            if (var6 == null) {
              return (gi) this;
            } else {
              if (-1 != var6.field_j) {
                var6.field_j = hb.field_h[var6.field_j];
                if (var6.field_j == -1) {
                  if (var6.field_b == -1) {
                    var6.field_v = -1;
                    break L0;
                  } else {
                    var6.field_v = 0;
                    break L0;
                  }
                } else {
                  if (var6.field_b == 0) {
                    break L0;
                  } else {
                    if (-6 != nc.field_a[var6.field_j]) {
                      var6.field_v = nc.field_a[var6.field_j];
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
              } else {
                if ((var6.field_b ^ -1) == 0) {
                  break L0;
                } else {
                  L3: {
                    if ((var6.field_b ^ -1) != -6) {
                      break L3;
                    } else {
                      if (100.0 * Math.random() < (double)(((gi) this).field_o - 60)) {
                        break L3;
                      } else {
                        break L0;
                      }
                    }
                  }
                  var6.field_b = ck.field_f[var6.field_b];
                  if (0 == var6.field_b) {
                    var6.field_v = -1;
                    if (-1 < var6.field_r) {
                      if (var6.field_h == null) {
                        break L0;
                      } else {
                        var6.field_h.field_E = var6.field_h.field_E - 1;
                        var6.field_h.field_P = 0;
                        var6.field_h.field_c = var6.field_c;
                        if (null == var6.field_c.field_h) {
                          var6.field_c.field_h = var6.field_h;
                          var6.field_h = null;
                          if (-1 == var6.field_c.field_v) {
                            if (null != var6.field_c.field_c.field_h) {
                              break L0;
                            } else {
                              var6.field_c.field_c.field_h = var6.field_c.field_h;
                              var6.field_c.field_h = null;
                              var6.field_c.field_c.field_h.field_A = 0;
                              var6.field_c.field_c.field_h.field_d = 5;
                              var6.field_c.field_c.field_h.field_S = true;
                              var6.field_c.field_c.field_h.field_P = 0;
                              var6.field_c.field_c.field_h.field_c = var6.field_c.field_c;
                              break L0;
                            }
                          } else {
                            break L0;
                          }
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      var6.field_v = 0;
                      var6.field_b = 3;
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        return (gi) this;
    }

    private final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        dl var11 = null;
        int var12 = 0;
        Object var13 = null;
        dl stackIn_41_0 = null;
        dl stackIn_42_0 = null;
        dl stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        dl stackOut_40_0 = null;
        dl stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        dl stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        L0: {
          var12 = Terraphoenix.field_V;
          var3 = 0;
          ((gi) this).field_n = true;
          var4 = ((gi) this).field_o;
          if (-1 != (((gi) this).field_s ^ -1)) {
            break L0;
          } else {
            if (param1) {
              if (30.0 * Math.random() >= (double)(-15 + ((gi) this).field_o)) {
                qd.a((byte) 81, 40);
                break L0;
              } else {
                qd.a((byte) 116, (int)(Math.random() * 2.0) + 41);
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (3 != ((gi) this).field_s) {
            break L1;
          } else {
            if (param1) {
              qd.a((byte) 98, 91);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if ((((gi) this).field_s ^ -1) == -2) {
            var3 = 4;
            qd.a((byte) 86, 81);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (6 == ((gi) this).field_s) {
            var3 = 4;
            qd.a((byte) 56, 78);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (-6 != (((gi) this).field_s ^ -1)) {
            break L4;
          } else {
            var3 = 10;
            qd.a((byte) 91, 49);
            break L4;
          }
        }
        L5: {
          if (((gi) this).field_s == 7) {
            var3 = 6;
            qd.a((byte) 58, 65);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (var3 > 0) {
            var5 = 32 * ((gi) this).field_c + -(((gi) this).field_m * 32);
            sj.field_b = var5;
            eg.field_p = ((gi) this).field_x;
            var6 = -(((gi) this).field_x * 48) + (16 * ((gi) this).field_c - -(16 * ((gi) this).field_m));
            lg.field_c = var6;
            break L6;
          } else {
            break L6;
          }
        }
        var5 = 0;
        L7: while (true) {
          if (var5 >= var3) {
            L8: {
              if (param0 == -6) {
                break L8;
              } else {
                var13 = null;
                gi discarded$7 = this.a((dl) null, false, 122);
                break L8;
              }
            }
            return;
          } else {
            var6 = -var3 + ((gi) this).field_c;
            L9: while (true) {
              if (((gi) this).field_c - -var3 < var6) {
                var5++;
                continue L7;
              } else {
                var7 = -var3 + ((gi) this).field_m;
                L10: while (true) {
                  if (var3 + ((gi) this).field_m < var7) {
                    var6++;
                    continue L9;
                  } else {
                    var8 = var6 + -((gi) this).field_c;
                    var9 = var7 - ((gi) this).field_m;
                    var10 = (int)Math.sqrt((double)(var8 * var8 + var9 * var9));
                    ((gi) this).field_o = (-var10 + var3) * var4 / var3;
                    if (-1 > (((gi) this).field_o ^ -1)) {
                      L11: {
                        if (((gi) this).field_c + -var5 == var6) {
                          break L11;
                        } else {
                          if (var6 == var5 + ((gi) this).field_c) {
                            break L11;
                          } else {
                            if (var7 == -var5 + ((gi) this).field_m) {
                              break L11;
                            } else {
                              if (var5 + ((gi) this).field_m == var7) {
                                break L11;
                              } else {
                                var7++;
                                continue L10;
                              }
                            }
                          }
                        }
                      }
                      if (((gi) this).field_u.a(((gi) this).field_x, ((gi) this).field_m, ((gi) this).field_x, var6, -17402, ((gi) this).field_c, var7)) {
                        L12: {
                          var11 = ((gi) this).field_u.a(121, var7, ((gi) this).field_x, var6);
                          if (var11 == null) {
                            break L12;
                          } else {
                            L13: {
                              stackOut_40_0 = (dl) var11;
                              stackIn_42_0 = stackOut_40_0;
                              stackIn_41_0 = stackOut_40_0;
                              if (64 < var4) {
                                stackOut_42_0 = (dl) (Object) stackIn_42_0;
                                stackOut_42_1 = -((gi) this).field_o + var4 + 64;
                                stackIn_43_0 = stackOut_42_0;
                                stackIn_43_1 = stackOut_42_1;
                                break L13;
                              } else {
                                stackOut_41_0 = (dl) (Object) stackIn_41_0;
                                stackOut_41_1 = -((gi) this).field_o + (var4 + var4);
                                stackIn_43_0 = stackOut_41_0;
                                stackIn_43_1 = stackOut_41_1;
                                break L13;
                              }
                            }
                            stackIn_43_0.field_p = stackIn_43_1;
                            break L12;
                          }
                        }
                        gi discarded$8 = this.a(var11, false, -29593);
                        gi discarded$9 = this.a(((gi) this).field_u.a(param0 + 126, var7, ((gi) this).field_x, var6 + 1), false, -29593);
                        gi discarded$10 = this.a((byte) 94, false, ((gi) this).field_u.a(param0 + 89, var7, ((gi) this).field_x, var6));
                        gi discarded$11 = this.a((byte) 94, false, ((gi) this).field_u.a(126, 1 + var7, ((gi) this).field_x, var6));
                        gi discarded$12 = this.a(var7, var6, ((gi) this).field_x, (byte) -20);
                        gi discarded$13 = this.a(var7, var6, 1 + ((gi) this).field_x, (byte) -124);
                        if (var11 != null) {
                          if (var11.field_h != null) {
                            if (0 < var11.field_h.field_P) {
                              var11.field_h.a((byte) -51, ((gi) this).field_o);
                              if (-1 <= var11.field_h.field_P) {
                                if (var11.field_h.field_Z == null) {
                                  if (-8 != var11.field_h.field_t) {
                                    if (null != ((gi) this).field_e) {
                                      L14: {
                                        if (null == ((gi) this).field_e) {
                                          break L14;
                                        } else {
                                          ((gi) this).field_e.field_e = ((gi) this).field_e.field_e + 1;
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        if (null == ((gi) this).field_e) {
                                          break L15;
                                        } else {
                                          if (Math.random() * 100.0 <= (double)((gi) this).field_e.field_q) {
                                            break L15;
                                          } else {
                                            ((gi) this).field_e.field_q = ((gi) this).field_e.field_q + 1;
                                            break L15;
                                          }
                                        }
                                      }
                                      L16: {
                                        if (((gi) this).field_e.field_B >= 90) {
                                          mh.a((byte) 117, 0, 255);
                                          break L16;
                                        } else {
                                          break L16;
                                        }
                                      }
                                      L17: {
                                        if ((((gi) this).field_e.field_e ^ -1) <= -11) {
                                          mh.a((byte) 126, 2, 253);
                                          break L17;
                                        } else {
                                          break L17;
                                        }
                                      }
                                      if (25 <= ((gi) this).field_e.field_e) {
                                        mh.a((byte) 127, 3, 252);
                                        var7++;
                                        continue L10;
                                      } else {
                                        var7++;
                                        continue L10;
                                      }
                                    } else {
                                      var7++;
                                      continue L10;
                                    }
                                  } else {
                                    var7++;
                                    continue L10;
                                  }
                                } else {
                                  var7++;
                                  continue L10;
                                }
                              } else {
                                var7++;
                                continue L10;
                              }
                            } else {
                              var7++;
                              continue L10;
                            }
                          } else {
                            var7++;
                            continue L10;
                          }
                        } else {
                          var7++;
                          continue L10;
                        }
                      } else {
                        var7++;
                        continue L10;
                      }
                    } else {
                      var7++;
                      continue L10;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final gi a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        dl var4 = null;
        gi var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        dl var9 = null;
        var8 = Terraphoenix.field_V;
        if (((gi) this).field_n) {
          ((gi) this).field_f = ((gi) this).field_f + 1;
          if (((gi) this).field_f <= 25) {
            return (gi) this;
          } else {
            return null;
          }
        } else {
          if (-1 <= (ja.field_n ^ -1)) {
            L0: {
              var2 = 1;
              if (param0 == 11) {
                break L0;
              } else {
                gi discarded$1 = ((gi) this).a((byte) -35);
                break L0;
              }
            }
            L1: {
              if (((gi) this).field_s != -1) {
                break L1;
              } else {
                var2 = 2;
                break L1;
              }
            }
            L2: {
              if (-3 == ((gi) this).field_s) {
                var2 = 5;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (4 == ((gi) this).field_s) {
                var2 = 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((gi) this).field_d >= 5) {
                break L4;
              } else {
                L5: {
                  L6: {
                    ((gi) this).field_d = ((gi) this).field_d + 1;
                    if (0 == ((gi) this).field_s) {
                      break L6;
                    } else {
                      if (((gi) this).field_s == 2) {
                        break L6;
                      } else {
                        if ((((gi) this).field_s ^ -1) != -5) {
                          ((gi) this).field_d = 5;
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if ((((gi) this).field_d ^ -1) > -6) {
                    return (gi) this;
                  } else {
                    break L5;
                  }
                }
                if (((gi) this).field_d != 5) {
                  break L4;
                } else {
                  L7: {
                    if (((gi) this).field_y <= 50.0) {
                      break L7;
                    } else {
                      ((gi) this).field_y = 50.0;
                      var2 += 2;
                      break L7;
                    }
                  }
                  L8: {
                    if (-50.0 <= ((gi) this).field_y) {
                      break L8;
                    } else {
                      var2 += 2;
                      ((gi) this).field_y = -50.0;
                      break L8;
                    }
                  }
                  L9: {
                    if (((gi) this).field_p <= 50.0) {
                      break L9;
                    } else {
                      ((gi) this).field_p = 50.0;
                      var2 += 2;
                      break L9;
                    }
                  }
                  if (((gi) this).field_p < -50.0) {
                    ((gi) this).field_p = -50.0;
                    var2 += 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L10: while (true) {
              if (var2 >= -1) {
                return (gi) this;
              } else {
                L11: {
                  var2--;
                  var3 = 0;
                  if (-7 <= ((gi) this).field_s) {
                    ((gi) this).field_a = ((gi) this).field_a - 1;
                    ((gi) this).field_k = ((gi) this).field_k - 1.04;
                    var3 = 1;
                    var9 = ((gi) this).field_u.a(-83, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                    if (((gi) this).field_a >= 0) {
                      break L11;
                    } else {
                      if (var9 == null) {
                        break L11;
                      } else {
                        if (var9.field_v == -1) {
                          break L11;
                        } else {
                          this.a(param0 ^ -120);
                          return null;
                        }
                      }
                    }
                  } else {
                    break L11;
                  }
                }
                L12: {
                  L13: {
                    if (((gi) this).field_s == 1) {
                      break L13;
                    } else {
                      if ((((gi) this).field_s ^ -1) != -6) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  ((gi) this).field_k = ((gi) this).field_k - 0.17333333333333334;
                  break L12;
                }
                L14: {
                  if (((gi) this).field_s != 0) {
                    break L14;
                  } else {
                    ((gi) this).field_k = ((gi) this).field_k - 0.065;
                    break L14;
                  }
                }
                L15: {
                  if (((gi) this).field_s != 3) {
                    break L15;
                  } else {
                    ((gi) this).field_k = ((gi) this).field_k - 0.26;
                    break L15;
                  }
                }
                L16: {
                  if (-5 != (((gi) this).field_s ^ -1)) {
                    break L16;
                  } else {
                    ((gi) this).field_k = ((gi) this).field_k - 0.065;
                    break L16;
                  }
                }
                var4 = ((gi) this).field_u.a(-105, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                L17: while (true) {
                  if (var4 != null) {
                    L18: {
                      ((gi) this).field_t = ((gi) this).field_t + ((gi) this).field_k;
                      if (((gi) this).field_t < (double)(-(var4.field_r * 100) + var4.field_l)) {
                        L19: {
                          if ((var4.field_v ^ -1) == 0) {
                            break L19;
                          } else {
                            if (var4.field_b != -1) {
                              if (var3 != 0) {
                                ((gi) this).field_k = -((gi) this).field_k / 2.0;
                                ((gi) this).field_t = (double)(-(var4.field_r * 100) + var4.field_l);
                                ((gi) this).field_i = ((gi) this).field_i * 0.9;
                                break L18;
                              } else {
                                this.a(37);
                                return this.a(((gi) this).field_m, ((gi) this).field_c, ((gi) this).field_x, (byte) -122);
                              }
                            } else {
                              break L19;
                            }
                          }
                        }
                        ((gi) this).field_t = ((gi) this).field_t + 100.0;
                        ((gi) this).field_x = ((gi) this).field_x - 1;
                        var4 = ((gi) this).field_u.a(-54, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L20: {
                      if (100.0 < ((gi) this).field_t) {
                        L21: {
                          if (null != var4.field_C) {
                            L22: {
                              if ((var4.field_C.field_v ^ -1) == 0) {
                                break L22;
                              } else {
                                if (-1 == var4.field_C.field_b) {
                                  break L22;
                                } else {
                                  if (var3 == 0) {
                                    this.a(param0 + 9);
                                    return this.a(((gi) this).field_m, ((gi) this).field_c, ((gi) this).field_x - -1, (byte) -125);
                                  } else {
                                    ((gi) this).field_t = 100.0;
                                    ((gi) this).field_k = -((gi) this).field_k / 2.0;
                                    ((gi) this).field_i = 0.9 * ((gi) this).field_i;
                                    break L21;
                                  }
                                }
                              }
                            }
                            ((gi) this).field_x = ((gi) this).field_x + 1;
                            ((gi) this).field_t = ((gi) this).field_t - 100.0;
                            var4 = var4.field_C;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        if (1000.0 >= ((gi) this).field_t) {
                          break L20;
                        } else {
                          return null;
                        }
                      } else {
                        break L20;
                      }
                    }
                    L23: {
                      if (-2 != (var4.field_v ^ -1)) {
                        break L23;
                      } else {
                        if ((double)(var4.field_l + 50) <= ((gi) this).field_t) {
                          break L23;
                        } else {
                          var5 = this.a(((gi) this).field_m, 3394, ((gi) this).field_c, ((gi) this).field_x);
                          if (var5 != null) {
                            break L23;
                          } else {
                            return null;
                          }
                        }
                      }
                    }
                    L24: {
                      if ((var4.field_v ^ -1) != -3) {
                        break L24;
                      } else {
                        if ((double)(var4.field_l + 50) > ((gi) this).field_t) {
                          var5 = this.a(((gi) this).field_m, 3394, ((gi) this).field_c, ((gi) this).field_x);
                          if (var5 != null) {
                            break L24;
                          } else {
                            return null;
                          }
                        } else {
                          break L24;
                        }
                      }
                    }
                    L25: {
                      if ((var4.field_v ^ -1) != -4) {
                        break L25;
                      } else {
                        if (((gi) this).field_t <= (double)(100 - -var4.field_l)) {
                          var5 = this.a(((gi) this).field_m, 3394, ((gi) this).field_c, ((gi) this).field_x);
                          if (var5 != null) {
                            break L25;
                          } else {
                            return null;
                          }
                        } else {
                          break L25;
                        }
                      }
                    }
                    L26: {
                      ((gi) this).field_y = ((gi) this).field_y + ((gi) this).field_i;
                      if (-50.0 <= ((gi) this).field_y) {
                        break L26;
                      } else {
                        if ((1 & var4.field_e) != 1) {
                          L27: {
                            if ((16 & var4.field_e) != 16) {
                              break L27;
                            } else {
                              if (50.0 > ((gi) this).field_t) {
                                ((gi) this).field_y = -50.0;
                                return this.a(var4, true, -29593);
                              } else {
                                break L27;
                              }
                            }
                          }
                          ((gi) this).field_c = ((gi) this).field_c - 1;
                          ((gi) this).field_y = ((gi) this).field_y + 100.0;
                          break L26;
                        } else {
                          ((gi) this).field_y = -50.0;
                          return this.a(var4, true, -29593);
                        }
                      }
                    }
                    L28: {
                      if (50.0 >= ((gi) this).field_y) {
                        break L28;
                      } else {
                        if ((4 & var4.field_e) == 4) {
                          ((gi) this).field_y = 50.0;
                          return this.a(((gi) this).field_u.a(-61, ((gi) this).field_m, ((gi) this).field_x, 1 + ((gi) this).field_c), true, -29593);
                        } else {
                          L29: {
                            if (64 != (64 & var4.field_e)) {
                              break L29;
                            } else {
                              if (50.0 <= ((gi) this).field_t) {
                                break L29;
                              } else {
                                ((gi) this).field_y = 50.0;
                                return this.a(((gi) this).field_u.a(-62, ((gi) this).field_m, ((gi) this).field_x, 1 + ((gi) this).field_c), true, -29593);
                              }
                            }
                          }
                          ((gi) this).field_y = ((gi) this).field_y - 100.0;
                          ((gi) this).field_c = ((gi) this).field_c + 1;
                          break L28;
                        }
                      }
                    }
                    if ((((gi) this).field_c ^ -1) < -1) {
                      if (((gi) this).field_u.field_b - 1 > ((gi) this).field_c) {
                        var4 = ((gi) this).field_u.a(param0 ^ 126, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                        L30: while (true) {
                          if (var4 != null) {
                            L31: while (true) {
                              L32: {
                                if (null == var4.field_C) {
                                  break L32;
                                } else {
                                  if (100.0 >= ((gi) this).field_t) {
                                    break L32;
                                  } else {
                                    ((gi) this).field_x = ((gi) this).field_x + 1;
                                    ((gi) this).field_t = ((gi) this).field_t - 100.0;
                                    var4 = ((gi) this).field_u.a(108, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                                    continue L31;
                                  }
                                }
                              }
                              L33: {
                                ((gi) this).field_p = ((gi) this).field_p + ((gi) this).field_b;
                                if (((gi) this).field_p <= 50.0) {
                                  break L33;
                                } else {
                                  L34: {
                                    if (((gi) this).field_t > 100.0) {
                                      break L34;
                                    } else {
                                      if ((8 & var4.field_e ^ -1) != -9) {
                                        if (-129 != (128 & var4.field_e ^ -1)) {
                                          break L34;
                                        } else {
                                          if (((gi) this).field_t >= 50.0) {
                                            break L34;
                                          } else {
                                            ((gi) this).field_p = 50.0;
                                            return this.a((byte) 94, true, ((gi) this).field_u.a(-26, ((gi) this).field_m - -1, ((gi) this).field_x, ((gi) this).field_c));
                                          }
                                        }
                                      } else {
                                        ((gi) this).field_p = 50.0;
                                        return this.a((byte) 94, true, ((gi) this).field_u.a(param0 ^ -70, 1 + ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c));
                                      }
                                    }
                                  }
                                  ((gi) this).field_m = ((gi) this).field_m + 1;
                                  ((gi) this).field_p = ((gi) this).field_p - 100.0;
                                  break L33;
                                }
                              }
                              L35: {
                                if (-50.0 > ((gi) this).field_p) {
                                  L36: {
                                    if (100.0 >= ((gi) this).field_t) {
                                      if ((2 & var4.field_e) == 2) {
                                        ((gi) this).field_p = -50.0;
                                        return this.a((byte) 94, true, var4);
                                      } else {
                                        if (32 != (32 & var4.field_e)) {
                                          break L36;
                                        } else {
                                          if (((gi) this).field_t >= 50.0) {
                                            break L36;
                                          } else {
                                            ((gi) this).field_p = -50.0;
                                            return this.a((byte) 94, true, var4);
                                          }
                                        }
                                      }
                                    } else {
                                      break L36;
                                    }
                                  }
                                  ((gi) this).field_p = ((gi) this).field_p + 100.0;
                                  ((gi) this).field_m = ((gi) this).field_m - 1;
                                  break L35;
                                } else {
                                  break L35;
                                }
                              }
                              if (-1 > (((gi) this).field_m ^ -1)) {
                                if (-1 + ((gi) this).field_u.field_e > ((gi) this).field_m) {
                                  var4 = ((gi) this).field_u.a(param0 + -46, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                                  L37: while (true) {
                                    if (var4 != null) {
                                      L38: while (true) {
                                        L39: {
                                          if (var4.field_C == null) {
                                            break L39;
                                          } else {
                                            if (((gi) this).field_t <= 100.0) {
                                              break L39;
                                            } else {
                                              ((gi) this).field_x = ((gi) this).field_x + 1;
                                              ((gi) this).field_t = ((gi) this).field_t - 100.0;
                                              var4 = ((gi) this).field_u.a(-85, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                                              continue L38;
                                            }
                                          }
                                        }
                                        if (var4.field_h == null) {
                                          continue L10;
                                        } else {
                                          if ((((gi) this).field_s ^ -1) == -7) {
                                            continue L10;
                                          } else {
                                            if (((gi) this).field_s == 7) {
                                              continue L10;
                                            } else {
                                              var6 = var4.field_h.c(param0 ^ -117);
                                              var7 = var4.field_h.h(13);
                                              if ((double)var7 <= ((gi) this).field_p) {
                                                continue L10;
                                              } else {
                                                if ((double)(-var6) >= ((gi) this).field_y) {
                                                  continue L10;
                                                } else {
                                                  if ((double)var6 <= ((gi) this).field_y) {
                                                    continue L10;
                                                  } else {
                                                    if ((double)(-var6) >= ((gi) this).field_p) {
                                                      continue L10;
                                                    } else {
                                                      if (((gi) this).field_p >= (double)var6) {
                                                        continue L10;
                                                      } else {
                                                        if ((var4.field_h.field_P ^ -1) < -1) {
                                                          L40: {
                                                            if (null == ((gi) this).field_e) {
                                                              if (((gi) this).field_s == -2) {
                                                                break L40;
                                                              } else {
                                                                if (-7 == ((gi) this).field_s) {
                                                                  break L40;
                                                                } else {
                                                                  if (((gi) this).field_s == 5) {
                                                                    break L40;
                                                                  } else {
                                                                    if ((((gi) this).field_s ^ -1) == -8) {
                                                                      break L40;
                                                                    } else {
                                                                      var4.field_h.a((byte) 114, ((gi) this).field_o, ((gi) this).field_s);
                                                                      break L40;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              if (((gi) this).field_s == -2) {
                                                                break L40;
                                                              } else {
                                                                if (-7 == ((gi) this).field_s) {
                                                                  break L40;
                                                                } else {
                                                                  if (((gi) this).field_s == 5) {
                                                                    break L40;
                                                                  } else {
                                                                    if ((((gi) this).field_s ^ -1) == -8) {
                                                                      break L40;
                                                                    } else {
                                                                      var4.field_h.a((byte) 114, ((gi) this).field_o, ((gi) this).field_s);
                                                                      break L40;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L41: {
                                                            if (-1 < var4.field_h.field_P) {
                                                              break L41;
                                                            } else {
                                                              if (var4.field_h.field_Z != null) {
                                                                break L41;
                                                              } else {
                                                                if (7 == var4.field_h.field_t) {
                                                                  break L41;
                                                                } else {
                                                                  if (((gi) this).field_e == null) {
                                                                    break L41;
                                                                  } else {
                                                                    ((gi) this).field_e.field_e = ((gi) this).field_e.field_e + 1;
                                                                    break L41;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L42: {
                                                            if (((gi) this).field_e == null) {
                                                              break L42;
                                                            } else {
                                                              L43: {
                                                                if (-91 < ((gi) this).field_e.field_B) {
                                                                  break L43;
                                                                } else {
                                                                  mh.a((byte) 112, 0, 255);
                                                                  break L43;
                                                                }
                                                              }
                                                              L44: {
                                                                if (-11 > ((gi) this).field_e.field_e) {
                                                                  break L44;
                                                                } else {
                                                                  mh.a((byte) 113, 2, 253);
                                                                  break L44;
                                                                }
                                                              }
                                                              if ((((gi) this).field_e.field_e ^ -1) <= -26) {
                                                                mh.a((byte) 126, 3, 252);
                                                                break L42;
                                                              } else {
                                                                break L42;
                                                              }
                                                            }
                                                          }
                                                          this.a((byte) -6, false);
                                                          return (gi) this;
                                                        } else {
                                                          this.a((byte) -6, false);
                                                          return (gi) this;
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
                                      ((gi) this).field_t = ((gi) this).field_t + 100.0;
                                      ((gi) this).field_x = ((gi) this).field_x - 1;
                                      var4 = ((gi) this).field_u.a(-109, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                                      continue L37;
                                    }
                                  }
                                } else {
                                  return null;
                                }
                              } else {
                                return null;
                              }
                            }
                          } else {
                            ((gi) this).field_t = ((gi) this).field_t + 100.0;
                            ((gi) this).field_x = ((gi) this).field_x - 1;
                            var4 = ((gi) this).field_u.a(-111, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                            continue L30;
                          }
                        }
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    ((gi) this).field_t = ((gi) this).field_t + 100.0;
                    ((gi) this).field_x = ((gi) this).field_x - 1;
                    var4 = ((gi) this).field_u.a(116, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                    continue L17;
                  }
                }
              }
            }
          } else {
            return (gi) this;
          }
        }
    }

    final static int a(int param0, String param1, boolean param2, int param3, int param4, String param5, String param6) {
        gd var7 = new gd(param6);
        gd var8 = new gd(param5);
        if (param3 != 3) {
            field_h = 67;
        }
        return tb.a(param1, var8, var7, param2, param0, (byte) 96, param4);
    }

    final static void a(byte param0, long param1) {
        if (!(param1 > 0L)) {
            return;
        }
        if (0L != param1 % 10L) {
            te.a(param1, 0);
        } else {
            te.a(-1L + param1, 0);
            te.a(1L, 0);
        }
        if (param0 >= -25) {
            field_r = null;
        }
    }

    private final gi a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        dl var7 = null;
        dl var8 = null;
        var6 = Terraphoenix.field_V;
        ((gi) this).field_n = true;
        var7 = ((gi) this).field_u.a(param1 ^ -3426, param0, param3, param2);
        var8 = var7;
        if (var8 != null) {
          L0: {
            if (((gi) this).field_s != 0) {
              break L0;
            } else {
              if (var8.field_j > 3) {
                break L0;
              } else {
                return (gi) this;
              }
            }
          }
          L1: {
            L2: {
              if (3 != var8.field_v) {
                break L2;
              } else {
                if (var8.field_j != 1) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if ((((gi) this).field_s ^ -1) != -7) {
              break L1;
            } else {
              this.a(param1 ^ -3416);
              return (gi) this;
            }
          }
          if ((var8.field_j ^ -1) != 0) {
            L3: {
              if (param1 == 3394) {
                break L3;
              } else {
                ((gi) this).field_d = 24;
                break L3;
              }
            }
            L4: {
              L5: {
                L6: {
                  if (((gi) this).field_s == -1) {
                    break L6;
                  } else {
                    if (-3 == ((gi) this).field_s) {
                      break L6;
                    } else {
                      if (((gi) this).field_s != -6) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                if (40 <= ((gi) this).field_o) {
                  break L5;
                } else {
                  if (-4 != ((gi) this).field_s) {
                    break L4;
                  } else {
                    if ((var8.field_j ^ -1) <= -8) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              if (100.0 * Math.random() < (double)((gi) this).field_o) {
                var7.field_j = hb.field_h[var7.field_j];
                if ((var8.field_j ^ -1) == 0) {
                  if ((var8.field_b ^ -1) != 0) {
                    var8.field_v = 0;
                    break L4;
                  } else {
                    var8.field_v = -1;
                    break L4;
                  }
                } else {
                  if (var8.field_b == -1) {
                    break L4;
                  } else {
                    if ((nc.field_a[var7.field_j] ^ -1) == -6) {
                      break L4;
                    } else {
                      var7.field_v = nc.field_a[var7.field_j];
                      break L4;
                    }
                  }
                }
              } else {
                this.a(-127);
                return (gi) this;
              }
            }
            this.a(-127);
            return (gi) this;
          } else {
            return (gi) this;
          }
        } else {
          return (gi) this;
        }
    }

    public static void b(int param0) {
        field_r = null;
        field_q = null;
        field_j = null;
        if (param0 != -50) {
            return;
        }
        field_l = null;
    }

    final static void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        nd var5 = null;
        long var5_long = 0L;
        int var6 = 0;
        fb var7_ref_fb = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String[][] var9 = null;
        String[][] var10 = null;
        long[][] var11 = null;
        int[][] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        String var22 = null;
        long var23 = 0L;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        uc var28 = null;
        L0: {
          var27 = Terraphoenix.field_V;
          var28 = mk.field_j;
          var3 = 83 % ((56 - param0) / 50);
          var2 = var28.a(-16384);
          if (var2 == 0) {
            var4 = var28.i(-25578);
            var5 = (nd) (Object) r.field_Q.d(9272);
            L1: while (true) {
              L2: {
                if (var5 == null) {
                  break L2;
                } else {
                  if (var5.field_s != var4) {
                    var5 = (nd) (Object) r.field_Q.e((byte) -119);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var5 != null) {
                L3: {
                  var6 = var28.a(-16384);
                  if (var6 == 0) {
                    break L3;
                  } else {
                    var7 = var5.field_n;
                    od.field_h[0].field_d = null;
                    var8 = var5.field_j;
                    od.field_h[0].field_f = kj.field_f;
                    od.field_h[0].field_a = false;
                    var9_int = 1;
                    L4: while (true) {
                      if (var6 <= var9_int) {
                        var5.field_p = new String[3][var7];
                        var9 = new String[3][var7];
                        var10 = new String[3][var7];
                        var5.field_l = new long[3][var7];
                        var11 = new long[3][var7];
                        var5.field_q = new int[3][var8 * var7];
                        var12 = new int[3][var8 * var7];
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = 0;
                        var19 = var28.a(-16384);
                        if (0 < var19) {
                          var20 = 0;
                          L5: while (true) {
                            if (var19 <= var20) {
                              break L3;
                            } else {
                              L6: {
                                var21 = var28.a(-16384);
                                var22 = od.field_h[var21].field_f;
                                var23 = var28.h((byte) 78);
                                var25 = var28.field_k;
                                if (var7 <= var20) {
                                  break L6;
                                } else {
                                  var9[0][var13] = var22;
                                  var10[0][var13] = od.field_h[var21].field_d;
                                  var11[0][var13] = var23;
                                  var13++;
                                  var26 = 0;
                                  L7: while (true) {
                                    if (var26 >= var8) {
                                      break L6;
                                    } else {
                                      var16++;
                                      var12[0][var16] = var28.f((byte) -107);
                                      var26++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                              L8: {
                                if (var22 == null) {
                                  break L8;
                                } else {
                                  if (me.a(100, var22)) {
                                    var9[1][var14] = kj.field_f;
                                    var10[1][var14] = null;
                                    var11[1][var14] = var23;
                                    var28.field_k = var25;
                                    var14++;
                                    var26 = 0;
                                    L9: while (true) {
                                      if (var8 <= var26) {
                                        break L8;
                                      } else {
                                        var17++;
                                        var12[1][var17] = var28.f((byte) -107);
                                        var26++;
                                        continue L9;
                                      }
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              if (var7 > var15) {
                                if (!od.field_h[var21].field_a) {
                                  od.field_h[var21].field_a = true;
                                  var9[2][var15] = var22;
                                  var10[2][var15] = od.field_h[var21].field_d;
                                  var11[2][var15] = var23;
                                  var28.field_k = var25;
                                  var15++;
                                  var26 = 0;
                                  L10: while (true) {
                                    if (var8 > var26) {
                                      var18++;
                                      var12[2][var18] = var28.f((byte) -107);
                                      var26++;
                                      continue L10;
                                    } else {
                                      var20++;
                                      continue L5;
                                    }
                                  }
                                } else {
                                  var20++;
                                  continue L5;
                                }
                              } else {
                                var20++;
                                continue L5;
                              }
                            }
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        od.field_h[var9_int].field_f = var28.e(-1);
                        od.field_h[var9_int].field_a = false;
                        if (1 == var28.a(-16384)) {
                          od.field_h[var9_int].field_d = var28.e(-1);
                          var9_int++;
                          continue L4;
                        } else {
                          od.field_h[var9_int].field_d = null;
                          var9_int++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                var5.field_m = true;
                var5.b((byte) 12);
                break L0;
              } else {
                gb.g(-17464);
                return;
              }
            }
          } else {
            if ((var2 ^ -1) != -2) {
              bd.a((Throwable) null, "HS1: " + r.i(-15465), -60);
              gb.g(-17464);
              break L0;
            } else {
              var4 = var28.i(-25578);
              var5_long = var28.h((byte) 78);
              var7_ref_fb = (fb) (Object) hd.field_p.d(9272);
              L11: while (true) {
                L12: {
                  if (var7_ref_fb == null) {
                    break L12;
                  } else {
                    if (var7_ref_fb.field_s == var4) {
                      break L12;
                    } else {
                      var7_ref_fb = (fb) (Object) hd.field_p.e((byte) -119);
                      continue L11;
                    }
                  }
                }
                if (var7_ref_fb == null) {
                  gb.g(-17464);
                  return;
                } else {
                  var7_ref_fb.field_p = var5_long;
                  var7_ref_fb.b((byte) 12);
                  break L0;
                }
              }
            }
          }
        }
    }

    private final gi a(dl param0, boolean param1, int param2) {
        ((gi) this).field_n = true;
        if (param2 == -29593) {
          if (param0 == null) {
            return (gi) this;
          } else {
            L0: {
              L1: {
                L2: {
                  if (((gi) this).field_s == 0) {
                    break L2;
                  } else {
                    if ((((gi) this).field_s ^ -1) != -3) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (40 <= ((gi) this).field_o) {
                  break L1;
                } else {
                  break L0;
                }
              }
              if (Math.random() * 100.0 >= (double)((gi) this).field_o) {
                break L0;
              } else {
                L3: {
                  if (100.0 * Math.random() < (double)(((gi) this).field_o - 60)) {
                    break L3;
                  } else {
                    if (param0.field_g == -29) {
                      break L0;
                    } else {
                      if (-33 == param0.field_g) {
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (28 != param0.field_g) {
                    break L4;
                  } else {
                    if (13 == param0.field_s.field_i.field_G.field_Bb) {
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                if (0 > param0.field_g) {
                  break L0;
                } else {
                  L5: {
                    if (nh.field_E[param0.field_g] == -2) {
                      param0.a(1, true, 111);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (-3 != nh.field_E[param0.field_g]) {
                      break L6;
                    } else {
                      param0.a(1, false, param2 ^ -29687);
                      break L6;
                    }
                  }
                  L7: {
                    if (3 != nh.field_E[param0.field_g]) {
                      break L7;
                    } else {
                      param0.a(1, true, 96);
                      param0.field_i = 0;
                      ((gi) this).field_u.a(122, param0.field_n, param0.field_r, -1 + param0.field_A).field_i = 0;
                      break L7;
                    }
                  }
                  param0.field_g = le.field_s[param0.field_g];
                  if ((param0.field_g ^ -1) > -1) {
                    break L0;
                  } else {
                    L8: {
                      if (1 == nh.field_E[param0.field_g]) {
                        param0.a(1, true, -82);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (2 != nh.field_E[param0.field_g]) {
                        break L9;
                      } else {
                        param0.a(1, false, param2 + 29671);
                        break L9;
                      }
                    }
                    if ((nh.field_E[param0.field_g] ^ -1) == -4) {
                      param0.a(1, true, param2 + 29485);
                      param0.field_i = 1;
                      ((gi) this).field_u.a(-88, param0.field_n, param0.field_r, -1 + param0.field_A).field_i = 1;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            L10: {
              if (!param1) {
                break L10;
              } else {
                this.a(110);
                break L10;
              }
            }
            return (gi) this;
          }
        } else {
          return null;
        }
    }

    private final gi a(byte param0, boolean param1, dl param2) {
        L0: {
          if (param0 == 94) {
            break L0;
          } else {
            ((gi) this).field_d = -74;
            break L0;
          }
        }
        ((gi) this).field_n = true;
        if (param2 == null) {
          return (gi) this;
        } else {
          L1: {
            L2: {
              L3: {
                if (-1 == ((gi) this).field_s) {
                  break L3;
                } else {
                  if (((gi) this).field_s != 2) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (-41 > ((gi) this).field_o) {
                break L1;
              } else {
                break L2;
              }
            }
            if (100.0 * Math.random() >= (double)((gi) this).field_o) {
              break L1;
            } else {
              L4: {
                if (Math.random() * 100.0 < (double)(((gi) this).field_o - 60)) {
                  break L4;
                } else {
                  if (param2.field_k == 28) {
                    break L1;
                  } else {
                    if (32 == param2.field_k) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L5: {
                if (28 != param2.field_k) {
                  break L5;
                } else {
                  if (param2.field_s.field_i.field_G.field_Bb == 13) {
                    break L1;
                  } else {
                    break L5;
                  }
                }
              }
              if (-1 < (param2.field_k ^ -1)) {
                break L1;
              } else {
                L6: {
                  if (1 == nh.field_E[param2.field_k]) {
                    param2.a(2, true, -95);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if ((nh.field_E[param2.field_k] ^ -1) != -3) {
                    break L7;
                  } else {
                    param2.a(2, false, 87);
                    break L7;
                  }
                }
                L8: {
                  if (3 != nh.field_E[param2.field_k]) {
                    break L8;
                  } else {
                    param2.a(2, true, -75);
                    param2.field_i = 0;
                    ((gi) this).field_u.a(82, -1 + param2.field_n, param2.field_r, param2.field_A).field_i = 0;
                    break L8;
                  }
                }
                param2.field_k = le.field_s[param2.field_k];
                if (param2.field_k >= 0) {
                  L9: {
                    if (1 != nh.field_E[param2.field_k]) {
                      break L9;
                    } else {
                      param2.a(2, true, param0 ^ 54);
                      break L9;
                    }
                  }
                  L10: {
                    if (2 == nh.field_E[param2.field_k]) {
                      param2.a(2, false, 93);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if ((nh.field_E[param2.field_k] ^ -1) != -4) {
                    break L1;
                  } else {
                    param2.a(2, true, -108);
                    param2.field_i = 1;
                    ((gi) this).field_u.a(-91, param2.field_n + -1, param2.field_r, param2.field_A).field_i = 1;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
          }
          L11: {
            if (param1) {
              this.a(-122);
              break L11;
            } else {
              break L11;
            }
          }
          return (gi) this;
        }
    }

    private final void a(int param0) {
        int var2 = -112 % ((param0 - -82) / 40);
        this.a((byte) -6, true);
    }

    final static void a(fa param0, fa param1, fa param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        bg[] var15 = null;
        int var11_int = 0;
        int var13 = Terraphoenix.field_V;
        e.field_p = ig.a(param0, 0, "frame_top", "commonui");
        qb.field_f = ig.a(param0, 0, "frame_bottom", "commonui");
        hd.field_o = il.a("jagex_logo_grey", "commonui", param0, param3 + 2039);
        i.field_c = ig.a(param0, 0, "button", "commonui");
        og.field_c = ce.a("validation", (byte) -90, "commonui", param0);
        ra.field_l = (pk) (Object) ec.a("commonui", 8192, param1, param0, "arezzo12");
        qk.field_e = (pk) (Object) ec.a("commonui", 8192, param1, param0, "arezzo14");
        be.field_x = (pk) (Object) ec.a("commonui", param3 + 10232, param1, param0, "arezzo14bold");
        ci var18 = new ci(param2.a("button.gif", "", -21653), (java.awt.Component) (Object) ae.field_G);
        bg discarded$0 = qb.a("dropdown", (byte) -36, "commonui", param0);
        bg[] var5 = lf.a(true, "commonui", "screen_options", param0);
        hk.field_d = new bg[4];
        ng.field_u = new bg[4];
        o.field_c = new bg[4];
        bg[][] var6 = new bg[][]{o.field_c, ng.field_u, hk.field_d};
        int[][] var22 = new int[4][];
        int[][] var21 = var22;
        int[][] var20 = var21;
        int[][] var17 = var20;
        int[][] var7 = var17;
        var7[0] = var5[0].field_m;
        for (var8 = 1; var8 < var22.length; var8++) {
            var7[var8] = (int[]) var22[0].clone();
        }
        var8 = var5[0].field_l[0];
        var22[2][var8] = 16777215;
        var22[1][var8] = 2394342;
        if (param3 != -2040) {
            Object var14 = null;
            int discarded$1 = gi.a(-71, (String) null, false, 84, -18, (String) null, (String) null);
        }
        var22[3][var8] = 4767999;
        for (var9 = 0; 3 > var9; var9++) {
            var15 = var6[var9];
            bg[] var10 = var15;
            for (var11_int = 0; var11_int < var15.length; var11_int++) {
                var15[var11_int] = lf.a(var22[var11_int], var5[var9], param3 + 2040);
            }
        }
        var9 = var18.field_t;
        ja.c((byte) 109);
        var18.a();
        l.h(0, 0, l.field_k, l.field_j);
        ci var16 = new ci(var9, var9);
        ci var19 = var16;
        var19.a();
        var18.d(0, 0);
        ci var11 = new ci(var9, var9);
        var11.a();
        var18.d(var9 + -var18.field_r, 0);
        ci var12 = new ci(-(var9 * 2) + var18.field_r, var9);
        var12.a();
        var18.d(-var9, 0);
        ij.a(false);
        i.field_c = new ci[]{var16, var12, var11};
    }

    gi(e param0) {
        ((gi) this).field_g = param0;
        ((gi) this).field_n = false;
        ((gi) this).field_f = 0;
        ((gi) this).field_e = null;
        ((gi) this).field_u = ((gi) this).field_g.field_h;
        ((gi) this).field_d = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new qf();
        field_q = "Remove ";
        field_h = 0;
    }
}
