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
            if (((gi) this).field_s == 0) {
              if (((gi) this).field_f < 4) {
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
            if (((gi) this).field_s == 4) {
              L5: {
                if (((gi) this).field_f >= 6) {
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
              if (((gi) this).field_f >= 8) {
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
            if (((gi) this).field_s != 0) {
              break L7;
            } else {
              var5 = (((gi) this).field_b + -((gi) this).field_i) * 32.0 * (double)((gi) this).field_o / 1600.0;
              var7 = (-((gi) this).field_i - ((gi) this).field_b) * 16.0 * (double)((gi) this).field_o / 1600.0;
              var9 = -((gi) this).field_k * 48.0 * (double)((gi) this).field_o / 1600.0;
              if (((gi) this).field_d >= 5) {
                var11 = 0;
                L8: while (true) {
                  if (var11 >= 10) {
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
                    L10: {
                      if (var11 < 8) {
                        te.a((byte) 99, 3, (int)((double)var2 + (double)var11 * var5 / 10.0), (int)(var7 * (double)var11 / 10.0 + (double)var3), (int)((double)var4 + (double)var11 * var9 / 10.0), 16776960, false);
                        break L10;
                      } else {
                        te.a((byte) 99, 3, (int)((double)var11 * var5 / 10.0 + (double)var2), (int)((double)var3 + var7 * (double)var11 / 10.0), (int)((double)var4 + (double)var11 * var9 / 10.0), 16744448, false);
                        break L10;
                      }
                    }
                    var11++;
                    continue L8;
                  }
                }
              } else {
                var11 = 0;
                L11: while (true) {
                  if (var11 >= 16) {
                    var11 = 0;
                    L12: while (true) {
                      if (var11 >= 12) {
                        break L7;
                      } else {
                        te.a((byte) 99, -(var11 / 2) + 6, (int)((double)var2 - var5 * (double)var11 / 10.0), var3, (int)((double)var11 * var7 / 10.0 + (double)var4 - (double)var11 * var9 / 10.0), 16777215, true);
                        var11++;
                        continue L12;
                      }
                    }
                  } else {
                    te.a((byte) 99, -(var11 / 2) + 8, (int)((double)var2 - var5 * (double)var11 / 10.0), var3, (int)((double)var4 + (double)var11 * var7 / 10.0 - var9 * (double)var11 / 10.0), 16776960, false);
                    var11++;
                    continue L11;
                  }
                }
              }
            }
          }
          L13: {
            if (1 != ((gi) this).field_s) {
              break L13;
            } else {
              var5 = (((gi) this).field_b + -((gi) this).field_i) * 32.0 / 100.0;
              var7 = (-((gi) this).field_b + -((gi) this).field_i) * 16.0 / 100.0;
              var9 = -((gi) this).field_k * 48.0 / 100.0;
              te.a((byte) 99, 6, (int)((double)var2 + var5), (int)((double)var3 + var7), (int)(var9 + (double)var4), 16777215, true);
              te.a((byte) 99, 6, (int)(var5 / 2.0 + (double)var2), (int)((double)var3 + var7 / 2.0), (int)(var9 / 2.0 + (double)var4), 16777215, true);
              te.a((byte) 99, 3, var2, var3, var4, 0, true);
              break L13;
            }
          }
          L14: {
            if (2 == ((gi) this).field_s) {
              var5 = (-((gi) this).field_i + ((gi) this).field_b) * 32.0 / 100.0;
              var7 = 16.0 * (-((gi) this).field_b + -((gi) this).field_i) / 100.0;
              var9 = 48.0 * -((gi) this).field_k / 100.0;
              if (((gi) this).field_d >= 5) {
                var11 = 0;
                L15: while (true) {
                  if (var11 >= 25) {
                    var11 = 0;
                    L16: while (true) {
                      if (var11 >= 25) {
                        var11 = 0;
                        L17: while (true) {
                          if (var11 >= 25) {
                            break L14;
                          } else {
                            te.a((byte) 99, 1, (int)((double)var2 - (double)var11 * var5 / 5.0), (int)((double)var3 - var7 * (double)var11 / 5.0), (int)((double)var4 - (double)var11 * var9 / 5.0), 16777215, true);
                            var11++;
                            continue L17;
                          }
                        }
                      } else {
                        te.a((byte) 99, 2, (int)(-(var5 * (double)var11 / 5.0) + (double)var2), (int)(-(var7 * (double)var11 / 5.0) + (double)var3), (int)(-(var9 * (double)var11 / 5.0) + (double)var4), 65280, false);
                        var11++;
                        continue L16;
                      }
                    }
                  } else {
                    te.a((byte) 99, 3, (int)(-(var5 * (double)var11 / 5.0) + (double)var2), (int)(-(var7 * (double)var11 / 5.0) + (double)var3), (int)(-((double)var11 * var9 / 5.0) + (double)var4), 255, false);
                    var11++;
                    continue L15;
                  }
                }
              } else {
                te.a((byte) 99, 10, (int)(-(var5 / 2.0) + (double)var2), var3, (int)((double)var4 + var7 / 2.0 - var9 / 2.0), 255, false);
                te.a((byte) 99, 8, (int)((double)var2 - var5 / 5.0), var3, (int)(-(var9 / 5.0) + ((double)var4 + var7 / 5.0)), 65535, false);
                te.a((byte) 99, 6, var2, var3, var4, 16777215, true);
                break L14;
              }
            } else {
              break L14;
            }
          }
          L18: {
            if (((gi) this).field_s != 3) {
              break L18;
            } else {
              var5 = (-((gi) this).field_i + ((gi) this).field_b) * 32.0 / 100.0;
              var7 = 16.0 * (-((gi) this).field_b + -((gi) this).field_i) / 100.0;
              var9 = 48.0 * -((gi) this).field_k / 100.0;
              var11 = 0;
              L19: while (true) {
                if (var11 >= 8) {
                  var11 = 0;
                  L20: while (true) {
                    if (var11 >= 6) {
                      break L18;
                    } else {
                      te.a((byte) 99, -var11 + 6, (int)((double)var11 * var5 / 10.0 + (double)var2), (int)((double)var3 + var7 * (double)var11 / 10.0), (int)((double)var11 * var9 / 10.0 + (double)var4), 65535, true);
                      var11++;
                      continue L20;
                    }
                  }
                } else {
                  te.a((byte) 99, -var11 + 8, (int)(var5 * (double)var11 / 10.0 + (double)var2), (int)((double)var3 + var7 * (double)var11 / 10.0), (int)((double)var4 + var9 * (double)var11 / 10.0), 33023, false);
                  var11++;
                  continue L19;
                }
              }
            }
          }
          L21: {
            if (4 != ((gi) this).field_s) {
              break L21;
            } else {
              var5 = (-((gi) this).field_i + ((gi) this).field_b) * 32.0 * (double)((gi) this).field_o / 5200.0;
              var7 = (-((gi) this).field_i - ((gi) this).field_b) * 16.0 * (double)((gi) this).field_o / 5200.0;
              var9 = 48.0 * -((gi) this).field_k * (double)((gi) this).field_o / 5200.0;
              if (5 <= ((gi) this).field_d) {
                var11 = 0;
                L22: while (true) {
                  if (var11 >= 10) {
                    var11 = 0;
                    L23: while (true) {
                      if (8 <= var11) {
                        break L21;
                      } else {
                        te.a((byte) 99, 3, (int)(var5 * (double)var11 / 10.0 + (double)var2), (int)((double)var3 + var7 * (double)var11 / 10.0), (int)((double)var11 * var9 / 10.0 + (double)var4), 16777215, true);
                        var11++;
                        continue L23;
                      }
                    }
                  } else {
                    L24: {
                      if (8 <= var11) {
                        te.a((byte) 99, 4, (int)((double)var11 * var5 / 10.0 + (double)var2), (int)((double)var11 * var7 / 10.0 + (double)var3), (int)((double)var4 + (double)var11 * var9 / 10.0), 16711680, false);
                        break L24;
                      } else {
                        te.a((byte) 99, 4, (int)(var5 * (double)var11 / 10.0 + (double)var2), (int)((double)var3 + var7 * (double)var11 / 10.0), (int)((double)var4 + var9 * (double)var11 / 10.0), 16744576, false);
                        break L24;
                      }
                    }
                    var11++;
                    continue L22;
                  }
                }
              } else {
                var11 = 0;
                L25: while (true) {
                  if (var11 >= 16) {
                    var11 = 0;
                    L26: while (true) {
                      if (12 <= var11) {
                        break L21;
                      } else {
                        te.a((byte) 99, 8 + -(var11 * 2 / 3), (int)(-((double)var11 * var5 / 10.0) + (double)var2), var3, (int)(-(var9 * (double)var11 / 10.0) + ((double)var11 * var7 / 10.0 + (double)var4)), 16777215, true);
                        var11++;
                        continue L26;
                      }
                    }
                  } else {
                    te.a((byte) 99, 10 - var11 * 2 / 3, (int)((double)var2 - var5 * (double)var11 / 10.0), var3, (int)((double)var4 + var7 * (double)var11 / 10.0 - var9 * (double)var11 / 10.0), 16711680, false);
                    var11++;
                    continue L25;
                  }
                }
              }
            }
          }
          L27: {
            if (((gi) this).field_s != 5) {
              break L27;
            } else {
              te.a((byte) 99, 8, var2, var3, var4, 255, false);
              te.a((byte) 99, 7, var2, var3, var4, 65535, false);
              te.a((byte) 99, 6, var2, var3, var4, 16777215, false);
              break L27;
            }
          }
          L28: {
            if (((gi) this).field_s != 6) {
              break L28;
            } else {
              var3 = (int)((double)(-lg.field_c) + (-(((double)(((gi) this).field_x * 100) + ((gi) this).field_t) / 100.0 * 48.0) + (16.0 * ((double)((gi) this).field_m + ((gi) this).field_p / 100.0) + 16.0 * ((double)((gi) this).field_c + ((gi) this).field_y / 100.0)))) + 240;
              var2 = (int)(32.0 * ((double)((gi) this).field_c + ((gi) this).field_y / 100.0) - 32.0 * ((double)((gi) this).field_m + ((gi) this).field_p / 100.0) - (double)sj.field_b) + 320;
              l.e(var2, var3, 3, 8421504);
              break L28;
            }
          }
          L29: {
            if (7 == ((gi) this).field_s) {
              var2 = (int)((double)(-sj.field_b) + (((double)((gi) this).field_c + ((gi) this).field_y / 100.0) * 32.0 - 32.0 * ((double)((gi) this).field_m + ((gi) this).field_p / 100.0))) + 320;
              var3 = 240 - -(int)(-(48.0 * (((double)(((gi) this).field_x * 100) + ((gi) this).field_t) / 100.0)) + ((((gi) this).field_y / 100.0 + (double)((gi) this).field_c) * 16.0 + (((gi) this).field_p / 100.0 + (double)((gi) this).field_m) * 16.0) - (double)lg.field_c);
              l.e(var2, var3, 3, 65535);
              break L29;
            } else {
              break L29;
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
                if (var6.field_b == -1) {
                  break L0;
                } else {
                  L3: {
                    if (var6.field_b != 5) {
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
          if (((gi) this).field_s != 0) {
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
          if (((gi) this).field_s == 1) {
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
          if (((gi) this).field_s != 5) {
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
            return;
          } else {
            var6 = -var3 + ((gi) this).field_c;
            L8: while (true) {
              if (((gi) this).field_c - -var3 < var6) {
                var5++;
                continue L7;
              } else {
                var7 = -var3 + ((gi) this).field_m;
                L9: while (true) {
                  if (var3 + ((gi) this).field_m < var7) {
                    var6++;
                    continue L8;
                  } else {
                    var8 = var6 + -((gi) this).field_c;
                    var9 = var7 - ((gi) this).field_m;
                    var10 = (int)Math.sqrt((double)(var8 * var8 + var9 * var9));
                    ((gi) this).field_o = (-var10 + var3) * var4 / var3;
                    if (((gi) this).field_o > 0) {
                      L10: {
                        if (((gi) this).field_c + -var5 == var6) {
                          break L10;
                        } else {
                          if (var6 == var5 + ((gi) this).field_c) {
                            break L10;
                          } else {
                            if (var7 == -var5 + ((gi) this).field_m) {
                              break L10;
                            } else {
                              if (var5 + ((gi) this).field_m == var7) {
                                break L10;
                              } else {
                                var7++;
                                continue L9;
                              }
                            }
                          }
                        }
                      }
                      if (((gi) this).field_u.a(((gi) this).field_x, ((gi) this).field_m, ((gi) this).field_x, var6, -17402, ((gi) this).field_c, var7)) {
                        L11: {
                          var11 = ((gi) this).field_u.a(121, var7, ((gi) this).field_x, var6);
                          if (var11 == null) {
                            break L11;
                          } else {
                            L12: {
                              stackOut_40_0 = (dl) var11;
                              stackIn_42_0 = stackOut_40_0;
                              stackIn_41_0 = stackOut_40_0;
                              if (64 < var4) {
                                stackOut_42_0 = (dl) (Object) stackIn_42_0;
                                stackOut_42_1 = -((gi) this).field_o + var4 + 64;
                                stackIn_43_0 = stackOut_42_0;
                                stackIn_43_1 = stackOut_42_1;
                                break L12;
                              } else {
                                stackOut_41_0 = (dl) (Object) stackIn_41_0;
                                stackOut_41_1 = -((gi) this).field_o + (var4 + var4);
                                stackIn_43_0 = stackOut_41_0;
                                stackIn_43_1 = stackOut_41_1;
                                break L12;
                              }
                            }
                            stackIn_43_0.field_p = stackIn_43_1;
                            break L11;
                          }
                        }
                        int discarded$8 = -29593;
                        gi discarded$9 = this.a(var11, false);
                        int discarded$10 = -29593;
                        gi discarded$11 = this.a(((gi) this).field_u.a(120, var7, ((gi) this).field_x, var6 + 1), false);
                        gi discarded$12 = this.a((byte) 94, false, ((gi) this).field_u.a(83, var7, ((gi) this).field_x, var6));
                        gi discarded$13 = this.a((byte) 94, false, ((gi) this).field_u.a(126, 1 + var7, ((gi) this).field_x, var6));
                        gi discarded$14 = this.a(var7, var6, ((gi) this).field_x, (byte) -20);
                        gi discarded$15 = this.a(var7, var6, 1 + ((gi) this).field_x, (byte) -124);
                        if (var11 != null) {
                          if (var11.field_h != null) {
                            if (0 < var11.field_h.field_P) {
                              var11.field_h.a((byte) -51, ((gi) this).field_o);
                              if (-1 <= var11.field_h.field_P) {
                                if (var11.field_h.field_Z == null) {
                                  if (-8 != var11.field_h.field_t) {
                                    if (null != ((gi) this).field_e) {
                                      L13: {
                                        if (null == ((gi) this).field_e) {
                                          break L13;
                                        } else {
                                          ((gi) this).field_e.field_e = ((gi) this).field_e.field_e + 1;
                                          break L13;
                                        }
                                      }
                                      L14: {
                                        if (null == ((gi) this).field_e) {
                                          break L14;
                                        } else {
                                          if (Math.random() * 100.0 <= (double)((gi) this).field_e.field_q) {
                                            break L14;
                                          } else {
                                            ((gi) this).field_e.field_q = ((gi) this).field_e.field_q + 1;
                                            break L14;
                                          }
                                        }
                                      }
                                      L15: {
                                        if (((gi) this).field_e.field_B >= 90) {
                                          mh.a((byte) 117, 0, 255);
                                          break L15;
                                        } else {
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        if (((gi) this).field_e.field_e >= 10) {
                                          mh.a((byte) 126, 2, 253);
                                          break L16;
                                        } else {
                                          break L16;
                                        }
                                      }
                                      if (25 <= ((gi) this).field_e.field_e) {
                                        mh.a((byte) 127, 3, 252);
                                        var7++;
                                        continue L9;
                                      } else {
                                        var7++;
                                        continue L9;
                                      }
                                    } else {
                                      var7++;
                                      continue L9;
                                    }
                                  } else {
                                    var7++;
                                    continue L9;
                                  }
                                } else {
                                  var7++;
                                  continue L9;
                                }
                              } else {
                                var7++;
                                continue L9;
                              }
                            } else {
                              var7++;
                              continue L9;
                            }
                          } else {
                            var7++;
                            continue L9;
                          }
                        } else {
                          var7++;
                          continue L9;
                        }
                      } else {
                        var7++;
                        continue L9;
                      }
                    } else {
                      var7++;
                      continue L9;
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
          if (ja.field_n <= 0) {
            L0: {
              var2 = 1;
              if (param0 == 11) {
                break L0;
              } else {
                gi discarded$5 = ((gi) this).a((byte) -35);
                break L0;
              }
            }
            L1: {
              if (((gi) this).field_s != 0) {
                break L1;
              } else {
                var2 = 2;
                break L1;
              }
            }
            L2: {
              if (((gi) this).field_s == 2) {
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
              L5: {
                if (((gi) this).field_d >= 5) {
                  break L5;
                } else {
                  L6: {
                    L7: {
                      ((gi) this).field_d = ((gi) this).field_d + 1;
                      if (0 == ((gi) this).field_s) {
                        break L7;
                      } else {
                        if (((gi) this).field_s == 2) {
                          break L7;
                        } else {
                          if (((gi) this).field_s != 4) {
                            ((gi) this).field_d = 5;
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if (((gi) this).field_d < 5) {
                      return (gi) this;
                    } else {
                      break L6;
                    }
                  }
                  if (((gi) this).field_d != 5) {
                    break L5;
                  } else {
                    L8: {
                      if (((gi) this).field_y <= 50.0) {
                        break L8;
                      } else {
                        ((gi) this).field_y = 50.0;
                        var2 += 2;
                        break L8;
                      }
                    }
                    L9: {
                      if (-50.0 <= ((gi) this).field_y) {
                        break L9;
                      } else {
                        var2 += 2;
                        ((gi) this).field_y = -50.0;
                        break L9;
                      }
                    }
                    L10: {
                      if (((gi) this).field_p <= 50.0) {
                        break L10;
                      } else {
                        ((gi) this).field_p = 50.0;
                        var2 += 2;
                        break L10;
                      }
                    }
                    if (((gi) this).field_p < -50.0) {
                      ((gi) this).field_p = -50.0;
                      var2 += 2;
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              break L4;
            }
            L11: while (true) {
              if (var2 <= 0) {
                return (gi) this;
              } else {
                L12: {
                  var2--;
                  var3 = 0;
                  if (((gi) this).field_s >= 6) {
                    ((gi) this).field_a = ((gi) this).field_a - 1;
                    ((gi) this).field_k = ((gi) this).field_k - 1.04;
                    var3 = 1;
                    var9 = ((gi) this).field_u.a(-83, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                    if (((gi) this).field_a >= 0) {
                      break L12;
                    } else {
                      if (var9 == null) {
                        break L12;
                      } else {
                        if (var9.field_v == -1) {
                          break L12;
                        } else {
                          this.a(param0 ^ -120);
                          return null;
                        }
                      }
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  L14: {
                    if (((gi) this).field_s == 1) {
                      break L14;
                    } else {
                      if (((gi) this).field_s != 5) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ((gi) this).field_k = ((gi) this).field_k - 0.17333333333333334;
                  break L13;
                }
                L15: {
                  if (((gi) this).field_s != 0) {
                    break L15;
                  } else {
                    ((gi) this).field_k = ((gi) this).field_k - 0.065;
                    break L15;
                  }
                }
                L16: {
                  if (((gi) this).field_s != 3) {
                    break L16;
                  } else {
                    ((gi) this).field_k = ((gi) this).field_k - 0.26;
                    break L16;
                  }
                }
                L17: {
                  if (((gi) this).field_s != 4) {
                    break L17;
                  } else {
                    ((gi) this).field_k = ((gi) this).field_k - 0.065;
                    break L17;
                  }
                }
                var4 = ((gi) this).field_u.a(-105, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                L18: while (true) {
                  if (var4 != null) {
                    L19: {
                      ((gi) this).field_t = ((gi) this).field_t + ((gi) this).field_k;
                      if (((gi) this).field_t < (double)(-(var4.field_r * 100) + var4.field_l)) {
                        L20: {
                          if (var4.field_v == -1) {
                            break L20;
                          } else {
                            if (var4.field_b != -1) {
                              if (var3 != 0) {
                                ((gi) this).field_k = -((gi) this).field_k / 2.0;
                                ((gi) this).field_t = (double)(-(var4.field_r * 100) + var4.field_l);
                                ((gi) this).field_i = ((gi) this).field_i * 0.9;
                                break L19;
                              } else {
                                this.a(37);
                                return this.a(((gi) this).field_m, ((gi) this).field_c, ((gi) this).field_x, (byte) -122);
                              }
                            } else {
                              break L20;
                            }
                          }
                        }
                        ((gi) this).field_t = ((gi) this).field_t + 100.0;
                        ((gi) this).field_x = ((gi) this).field_x - 1;
                        var4 = ((gi) this).field_u.a(-54, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L21: {
                      if (100.0 < ((gi) this).field_t) {
                        L22: {
                          if (null != var4.field_C) {
                            L23: {
                              if (var4.field_C.field_v == -1) {
                                break L23;
                              } else {
                                if (-1 == var4.field_C.field_b) {
                                  break L23;
                                } else {
                                  if (var3 == 0) {
                                    this.a(param0 + 9);
                                    return this.a(((gi) this).field_m, ((gi) this).field_c, ((gi) this).field_x - -1, (byte) -125);
                                  } else {
                                    ((gi) this).field_t = 100.0;
                                    ((gi) this).field_k = -((gi) this).field_k / 2.0;
                                    ((gi) this).field_i = 0.9 * ((gi) this).field_i;
                                    break L22;
                                  }
                                }
                              }
                            }
                            ((gi) this).field_x = ((gi) this).field_x + 1;
                            ((gi) this).field_t = ((gi) this).field_t - 100.0;
                            var4 = var4.field_C;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        if (1000.0 >= ((gi) this).field_t) {
                          break L21;
                        } else {
                          return null;
                        }
                      } else {
                        break L21;
                      }
                    }
                    L24: {
                      if (var4.field_v != 1) {
                        break L24;
                      } else {
                        if ((double)(var4.field_l + 50) <= ((gi) this).field_t) {
                          break L24;
                        } else {
                          var5 = this.a(((gi) this).field_m, 3394, ((gi) this).field_c, ((gi) this).field_x);
                          if (var5 != null) {
                            break L24;
                          } else {
                            return null;
                          }
                        }
                      }
                    }
                    L25: {
                      if (var4.field_v != 2) {
                        break L25;
                      } else {
                        if ((double)(var4.field_l + 50) > ((gi) this).field_t) {
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
                      if (var4.field_v != 3) {
                        break L26;
                      } else {
                        if (((gi) this).field_t <= (double)(100 - -var4.field_l)) {
                          var5 = this.a(((gi) this).field_m, 3394, ((gi) this).field_c, ((gi) this).field_x);
                          if (var5 != null) {
                            break L26;
                          } else {
                            return null;
                          }
                        } else {
                          break L26;
                        }
                      }
                    }
                    L27: {
                      ((gi) this).field_y = ((gi) this).field_y + ((gi) this).field_i;
                      if (-50.0 <= ((gi) this).field_y) {
                        break L27;
                      } else {
                        if ((1 & var4.field_e) != 1) {
                          L28: {
                            if ((16 & var4.field_e) != 16) {
                              break L28;
                            } else {
                              if (50.0 > ((gi) this).field_t) {
                                ((gi) this).field_y = -50.0;
                                int discarded$6 = -29593;
                                return this.a(var4, true);
                              } else {
                                break L28;
                              }
                            }
                          }
                          ((gi) this).field_c = ((gi) this).field_c - 1;
                          ((gi) this).field_y = ((gi) this).field_y + 100.0;
                          break L27;
                        } else {
                          ((gi) this).field_y = -50.0;
                          int discarded$7 = -29593;
                          return this.a(var4, true);
                        }
                      }
                    }
                    L29: {
                      if (50.0 >= ((gi) this).field_y) {
                        break L29;
                      } else {
                        if ((4 & var4.field_e) == 4) {
                          ((gi) this).field_y = 50.0;
                          int discarded$8 = -29593;
                          return this.a(((gi) this).field_u.a(-61, ((gi) this).field_m, ((gi) this).field_x, 1 + ((gi) this).field_c), true);
                        } else {
                          L30: {
                            if (64 != (64 & var4.field_e)) {
                              break L30;
                            } else {
                              if (50.0 <= ((gi) this).field_t) {
                                break L30;
                              } else {
                                ((gi) this).field_y = 50.0;
                                int discarded$9 = -29593;
                                return this.a(((gi) this).field_u.a(-62, ((gi) this).field_m, ((gi) this).field_x, 1 + ((gi) this).field_c), true);
                              }
                            }
                          }
                          ((gi) this).field_y = ((gi) this).field_y - 100.0;
                          ((gi) this).field_c = ((gi) this).field_c + 1;
                          break L29;
                        }
                      }
                    }
                    if (((gi) this).field_c > 0) {
                      if (~(((gi) this).field_u.field_b - 1) < ~((gi) this).field_c) {
                        var4 = ((gi) this).field_u.a(param0 ^ 126, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                        L31: while (true) {
                          if (var4 != null) {
                            L32: while (true) {
                              L33: {
                                if (null == var4.field_C) {
                                  break L33;
                                } else {
                                  if (100.0 >= ((gi) this).field_t) {
                                    break L33;
                                  } else {
                                    ((gi) this).field_x = ((gi) this).field_x + 1;
                                    ((gi) this).field_t = ((gi) this).field_t - 100.0;
                                    var4 = ((gi) this).field_u.a(108, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                                    continue L32;
                                  }
                                }
                              }
                              L34: {
                                ((gi) this).field_p = ((gi) this).field_p + ((gi) this).field_b;
                                if (((gi) this).field_p <= 50.0) {
                                  break L34;
                                } else {
                                  L35: {
                                    if (((gi) this).field_t > 100.0) {
                                      break L35;
                                    } else {
                                      if ((8 & var4.field_e) != 8) {
                                        if ((128 & var4.field_e) != 128) {
                                          break L35;
                                        } else {
                                          if (((gi) this).field_t >= 50.0) {
                                            break L35;
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
                                  break L34;
                                }
                              }
                              L36: {
                                if (-50.0 > ((gi) this).field_p) {
                                  L37: {
                                    if (100.0 >= ((gi) this).field_t) {
                                      if ((2 & var4.field_e) == 2) {
                                        ((gi) this).field_p = -50.0;
                                        return this.a((byte) 94, true, var4);
                                      } else {
                                        if (32 != (32 & var4.field_e)) {
                                          break L37;
                                        } else {
                                          if (((gi) this).field_t >= 50.0) {
                                            break L37;
                                          } else {
                                            ((gi) this).field_p = -50.0;
                                            return this.a((byte) 94, true, var4);
                                          }
                                        }
                                      }
                                    } else {
                                      break L37;
                                    }
                                  }
                                  ((gi) this).field_p = ((gi) this).field_p + 100.0;
                                  ((gi) this).field_m = ((gi) this).field_m - 1;
                                  break L36;
                                } else {
                                  break L36;
                                }
                              }
                              if (((gi) this).field_m > 0) {
                                if (-1 + ((gi) this).field_u.field_e > ((gi) this).field_m) {
                                  var4 = ((gi) this).field_u.a(param0 + -46, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                                  L38: while (true) {
                                    if (var4 != null) {
                                      L39: while (true) {
                                        L40: {
                                          if (var4.field_C == null) {
                                            break L40;
                                          } else {
                                            if (((gi) this).field_t <= 100.0) {
                                              break L40;
                                            } else {
                                              ((gi) this).field_x = ((gi) this).field_x + 1;
                                              ((gi) this).field_t = ((gi) this).field_t - 100.0;
                                              var4 = ((gi) this).field_u.a(-85, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                                              continue L39;
                                            }
                                          }
                                        }
                                        L41: {
                                          if (var4.field_h == null) {
                                            break L41;
                                          } else {
                                            if (((gi) this).field_s == 6) {
                                              break L41;
                                            } else {
                                              if (((gi) this).field_s == 7) {
                                                break L41;
                                              } else {
                                                var6 = var4.field_h.c(param0 ^ -117);
                                                var7 = var4.field_h.h(13);
                                                if ((double)var7 <= ((gi) this).field_p) {
                                                  break L41;
                                                } else {
                                                  if ((double)(-var6) >= ((gi) this).field_y) {
                                                    break L41;
                                                  } else {
                                                    if ((double)var6 <= ((gi) this).field_y) {
                                                      break L41;
                                                    } else {
                                                      if ((double)(-var6) >= ((gi) this).field_p) {
                                                        break L41;
                                                      } else {
                                                        if (((gi) this).field_p >= (double)var6) {
                                                          break L41;
                                                        } else {
                                                          if (var4.field_h.field_P > 0) {
                                                            L42: {
                                                              if (null == ((gi) this).field_e) {
                                                                break L42;
                                                              } else {
                                                                if (100.0 * Math.random() > (double)((gi) this).field_e.field_B) {
                                                                  ((gi) this).field_e.field_B = ((gi) this).field_e.field_B + 1;
                                                                  break L42;
                                                                } else {
                                                                  break L42;
                                                                }
                                                              }
                                                            }
                                                            L43: {
                                                              if (((gi) this).field_s == 1) {
                                                                break L43;
                                                              } else {
                                                                if (((gi) this).field_s == 6) {
                                                                  break L43;
                                                                } else {
                                                                  if (((gi) this).field_s == 5) {
                                                                    break L43;
                                                                  } else {
                                                                    if (((gi) this).field_s == 7) {
                                                                      break L43;
                                                                    } else {
                                                                      var4.field_h.a((byte) 114, ((gi) this).field_o, ((gi) this).field_s);
                                                                      break L43;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            L44: {
                                                              if (var4.field_h.field_P > 0) {
                                                                break L44;
                                                              } else {
                                                                if (var4.field_h.field_Z != null) {
                                                                  break L44;
                                                                } else {
                                                                  if (7 == var4.field_h.field_t) {
                                                                    break L44;
                                                                  } else {
                                                                    if (((gi) this).field_e == null) {
                                                                      break L44;
                                                                    } else {
                                                                      ((gi) this).field_e.field_e = ((gi) this).field_e.field_e + 1;
                                                                      break L44;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            L45: {
                                                              if (((gi) this).field_e == null) {
                                                                break L45;
                                                              } else {
                                                                L46: {
                                                                  if (((gi) this).field_e.field_B < 90) {
                                                                    break L46;
                                                                  } else {
                                                                    mh.a((byte) 112, 0, 255);
                                                                    break L46;
                                                                  }
                                                                }
                                                                L47: {
                                                                  if (((gi) this).field_e.field_e < 10) {
                                                                    break L47;
                                                                  } else {
                                                                    mh.a((byte) 113, 2, 253);
                                                                    break L47;
                                                                  }
                                                                }
                                                                if (((gi) this).field_e.field_e >= 25) {
                                                                  mh.a((byte) 126, 3, 252);
                                                                  break L45;
                                                                } else {
                                                                  break L45;
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
                                        continue L11;
                                      }
                                    } else {
                                      ((gi) this).field_t = ((gi) this).field_t + 100.0;
                                      ((gi) this).field_x = ((gi) this).field_x - 1;
                                      var4 = ((gi) this).field_u.a(-109, ((gi) this).field_m, ((gi) this).field_x, ((gi) this).field_c);
                                      continue L38;
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
                            continue L31;
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
                    continue L18;
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
        gd var7 = null;
        RuntimeException var7_ref = null;
        gd var8 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var7 = new gd(param6);
            var8 = new gd(param5);
            stackOut_0_0 = tb.a(param1, var8, var7, param2, param0, (byte) 96, param4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7_ref;
            stackOut_2_1 = new StringBuilder().append("gi.E(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param2).append(44).append(3).append(44).append(param4).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param6 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_1_0;
    }

    final static void a(byte param0, long param1) {
        if (!(param1 > 0L)) {
            return;
        }
        if (0L != param1 % 10L) {
            int discarded$1 = 0;
            te.a(param1);
        } else {
            int discarded$2 = 0;
            te.a(-1L + param1);
            int discarded$3 = 0;
            te.a(1L);
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
        var7 = ((gi) this).field_u.a(-36, param0, param3, param2);
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
            if (((gi) this).field_s != 6) {
              break L1;
            } else {
              this.a(-22);
              return (gi) this;
            }
          }
          if (var8.field_j != -1) {
            L3: {
              L4: {
                L5: {
                  if (((gi) this).field_s == 0) {
                    break L5;
                  } else {
                    if (((gi) this).field_s == 2) {
                      break L5;
                    } else {
                      if (((gi) this).field_s != 5) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                if (40 <= ((gi) this).field_o) {
                  break L4;
                } else {
                  if (((gi) this).field_s != 3) {
                    break L3;
                  } else {
                    if (var8.field_j >= 7) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              if (100.0 * Math.random() < (double)((gi) this).field_o) {
                var7.field_j = hb.field_h[var7.field_j];
                if (var8.field_j == -1) {
                  if (var8.field_b != -1) {
                    var8.field_v = 0;
                    break L3;
                  } else {
                    var8.field_v = -1;
                    break L3;
                  }
                } else {
                  if (var8.field_b == -1) {
                    break L3;
                  } else {
                    if (nc.field_a[var7.field_j] == 5) {
                      break L3;
                    } else {
                      var7.field_v = nc.field_a[var7.field_j];
                      break L3;
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

    public static void b() {
        field_r = null;
        field_q = null;
        field_j = null;
        field_l = null;
    }

    final static void d() {
        RuntimeException var1 = null;
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
        RuntimeException decompiledCaughtException = null;
        var27 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var28 = mk.field_j;
              var3 = 0;
              var2 = var28.a(-16384);
              if (var2 == 0) {
                var4 = var28.i(-25578);
                var5 = (nd) (Object) r.field_Q.d(9272);
                L2: while (true) {
                  L3: {
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (var5.field_s != var4) {
                        var5 = (nd) (Object) r.field_Q.e((byte) -119);
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var5 != null) {
                    L4: {
                      var6 = var28.a(-16384);
                      if (var6 == 0) {
                        break L4;
                      } else {
                        var7 = var5.field_n;
                        od.field_h[0].field_d = null;
                        var8 = var5.field_j;
                        od.field_h[0].field_f = kj.field_f;
                        od.field_h[0].field_a = false;
                        var9_int = 1;
                        L5: while (true) {
                          if (var6 <= var9_int) {
                            String[][] dupTemp$7 = new String[3][var7];
                            var5.field_p = dupTemp$7;
                            var9 = dupTemp$7;
                            var10 = new String[3][var7];
                            long[][] dupTemp$8 = new long[3][var7];
                            var5.field_l = dupTemp$8;
                            var11 = dupTemp$8;
                            int[][] dupTemp$9 = new int[3][var8 * var7];
                            var5.field_q = dupTemp$9;
                            var12 = dupTemp$9;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                            var19 = var28.a(-16384);
                            if (0 < var19) {
                              var20 = 0;
                              L6: while (true) {
                                if (var19 <= var20) {
                                  break L4;
                                } else {
                                  L7: {
                                    var21 = var28.a(-16384);
                                    var22 = od.field_h[var21].field_f;
                                    var23 = var28.h((byte) 78);
                                    var25 = var28.field_k;
                                    if (var7 <= var20) {
                                      break L7;
                                    } else {
                                      var9[0][var13] = var22;
                                      var10[0][var13] = od.field_h[var21].field_d;
                                      var11[0][var13] = var23;
                                      var13++;
                                      var26 = 0;
                                      L8: while (true) {
                                        if (var26 >= var8) {
                                          break L7;
                                        } else {
                                          int incrementValue$10 = var16;
                                          var16++;
                                          var12[0][incrementValue$10] = var28.f((byte) -107);
                                          var26++;
                                          continue L8;
                                        }
                                      }
                                    }
                                  }
                                  L9: {
                                    if (var22 == null) {
                                      break L9;
                                    } else {
                                      if (me.a(100, var22)) {
                                        var9[1][var14] = kj.field_f;
                                        var10[1][var14] = null;
                                        var11[1][var14] = var23;
                                        var28.field_k = var25;
                                        var14++;
                                        var26 = 0;
                                        L10: while (true) {
                                          if (var8 <= var26) {
                                            break L9;
                                          } else {
                                            int incrementValue$11 = var17;
                                            var17++;
                                            var12[1][incrementValue$11] = var28.f((byte) -107);
                                            var26++;
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var7 <= var15) {
                                      break L11;
                                    } else {
                                      if (!od.field_h[var21].field_a) {
                                        od.field_h[var21].field_a = true;
                                        var9[2][var15] = var22;
                                        var10[2][var15] = od.field_h[var21].field_d;
                                        var11[2][var15] = var23;
                                        var28.field_k = var25;
                                        var15++;
                                        var26 = 0;
                                        L12: while (true) {
                                          if (var8 <= var26) {
                                            break L11;
                                          } else {
                                            int incrementValue$12 = var18;
                                            var18++;
                                            var12[2][incrementValue$12] = var28.f((byte) -107);
                                            var26++;
                                            continue L12;
                                          }
                                        }
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  var20++;
                                  continue L6;
                                }
                              }
                            } else {
                              break L4;
                            }
                          } else {
                            L13: {
                              od.field_h[var9_int].field_f = var28.e(-1);
                              od.field_h[var9_int].field_a = false;
                              if (1 == var28.a(-16384)) {
                                od.field_h[var9_int].field_d = var28.e(-1);
                                break L13;
                              } else {
                                od.field_h[var9_int].field_d = null;
                                break L13;
                              }
                            }
                            var9_int++;
                            continue L5;
                          }
                        }
                      }
                    }
                    var5.field_m = true;
                    var5.b((byte) 12);
                    break L1;
                  } else {
                    gb.g(-17464);
                    return;
                  }
                }
              } else {
                if (var2 != 1) {
                  int discarded$13 = -15465;
                  bd.a((Throwable) null, "HS1: " + r.i(), -60);
                  gb.g(-17464);
                  break L1;
                } else {
                  var4 = var28.i(-25578);
                  var5_long = var28.h((byte) 78);
                  var7_ref_fb = (fb) (Object) hd.field_p.d(9272);
                  L14: while (true) {
                    L15: {
                      if (var7_ref_fb == null) {
                        break L15;
                      } else {
                        if (var7_ref_fb.field_s == var4) {
                          break L15;
                        } else {
                          var7_ref_fb = (fb) (Object) hd.field_p.e((byte) -119);
                          continue L14;
                        }
                      }
                    }
                    if (var7_ref_fb == null) {
                      gb.g(-17464);
                      return;
                    } else {
                      var7_ref_fb.field_p = var5_long;
                      var7_ref_fb.b((byte) 12);
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "gi.I(" + 127 + 41);
        }
    }

    private final gi a(dl param0, boolean param1) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        Object stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_38_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        try {
          L0: {
            ((gi) this).field_n = true;
            if (param0 == null) {
              stackOut_4_0 = this;
              stackIn_5_0 = stackOut_4_0;
              return (gi) this;
            } else {
              L1: {
                L2: {
                  L3: {
                    if (((gi) this).field_s == 0) {
                      break L3;
                    } else {
                      if (((gi) this).field_s != 2) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (40 <= ((gi) this).field_o) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
                if (Math.random() * 100.0 >= (double)((gi) this).field_o) {
                  break L1;
                } else {
                  L4: {
                    if (100.0 * Math.random() < (double)(((gi) this).field_o - 60)) {
                      break L4;
                    } else {
                      if (param0.field_g == 28) {
                        break L1;
                      } else {
                        if (param0.field_g == 32) {
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L5: {
                    if (28 != param0.field_g) {
                      break L5;
                    } else {
                      if (13 == param0.field_s.field_i.field_G.field_Bb) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (0 > param0.field_g) {
                    break L1;
                  } else {
                    L6: {
                      if (nh.field_E[param0.field_g] == 1) {
                        param0.a(1, true, 111);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (nh.field_E[param0.field_g] != 2) {
                        break L7;
                      } else {
                        param0.a(1, false, 110);
                        break L7;
                      }
                    }
                    L8: {
                      if (3 != nh.field_E[param0.field_g]) {
                        break L8;
                      } else {
                        param0.a(1, true, 96);
                        param0.field_i = 0;
                        ((gi) this).field_u.a(122, param0.field_n, param0.field_r, -1 + param0.field_A).field_i = 0;
                        break L8;
                      }
                    }
                    param0.field_g = le.field_s[param0.field_g];
                    if (param0.field_g < 0) {
                      break L1;
                    } else {
                      L9: {
                        if (1 == nh.field_E[param0.field_g]) {
                          param0.a(1, true, -82);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (2 != nh.field_E[param0.field_g]) {
                          break L10;
                        } else {
                          param0.a(1, false, 78);
                          break L10;
                        }
                      }
                      if (nh.field_E[param0.field_g] == 3) {
                        param0.a(1, true, -108);
                        param0.field_i = 1;
                        ((gi) this).field_u.a(-88, param0.field_n, param0.field_r, -1 + param0.field_A).field_i = 1;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L11: {
                if (!param1) {
                  break L11;
                } else {
                  this.a(110);
                  break L11;
                }
              }
              stackOut_38_0 = this;
              stackIn_39_0 = stackOut_38_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var4;
            stackOut_40_1 = new StringBuilder().append("gi.G(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L12;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L12;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 44 + param1 + 44 + -29593 + 41);
        }
        return (gi) this;
    }

    private final gi a(byte param0, boolean param1, dl param2) {
        RuntimeException var4 = null;
        Object stackIn_3_0 = null;
        Object stackIn_38_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_37_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        try {
          L0: {
            ((gi) this).field_n = true;
            if (param2 == null) {
              stackOut_2_0 = this;
              stackIn_3_0 = stackOut_2_0;
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
                  if (param2.field_k < 0) {
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
                      if (nh.field_E[param2.field_k] != 2) {
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
                          param2.a(2, true, 104);
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
                      if (nh.field_E[param2.field_k] != 3) {
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
              stackOut_37_0 = this;
              stackIn_38_0 = stackOut_37_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var4;
            stackOut_39_1 = new StringBuilder().append("gi.C(").append(94).append(44).append(param1).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L12;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L12;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
        }
        return (gi) this;
    }

    private final void a(int param0) {
        int var2 = -112 % ((param0 - -82) / 40);
        this.a((byte) -6, true);
    }

    final static void a(fa param0, fa param1, fa param2) {
        RuntimeException var4 = null;
        bg[] var5 = null;
        bg[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        bg[] var10 = null;
        ci var11 = null;
        int var11_int = 0;
        ci var12 = null;
        int var13 = 0;
        bg[] var14 = null;
        ci var15 = null;
        int[][] var16 = null;
        ci var17 = null;
        ci var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
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
        var13 = Terraphoenix.field_V;
        try {
          L0: {
            e.field_p = ig.a(param0, 0, "frame_top", "commonui");
            qb.field_f = ig.a(param0, 0, "frame_bottom", "commonui");
            hd.field_o = il.a("jagex_logo_grey", "commonui", param0, -1);
            i.field_c = ig.a(param0, 0, "button", "commonui");
            og.field_c = ce.a("validation", (byte) -90, "commonui", param0);
            ra.field_l = (pk) (Object) ec.a("commonui", 8192, param1, param0, "arezzo12");
            qk.field_e = (pk) (Object) ec.a("commonui", 8192, param1, param0, "arezzo14");
            be.field_x = (pk) (Object) ec.a("commonui", 8192, param1, param0, "arezzo14bold");
            var17 = new ci(param2.a("button.gif", "", -21653), (java.awt.Component) (Object) ae.field_G);
            bg discarded$2 = qb.a("dropdown", (byte) -36, "commonui", param0);
            var5 = lf.a(true, "commonui", "screen_options", param0);
            hk.field_d = new bg[4];
            ng.field_u = new bg[4];
            o.field_c = new bg[4];
            var6 = new bg[][]{o.field_c, ng.field_u, hk.field_d};
            var21 = new int[4][];
            var20 = var21;
            var19 = var20;
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_m;
            var8 = 1;
            L1: while (true) {
              if (var8 >= var21.length) {
                var8 = var5[0].field_l[0];
                var21[2][var8] = 16777215;
                var21[1][var8] = 2394342;
                var21[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (3 <= var9) {
                    var9 = var17.field_t;
                    ja.c((byte) 109);
                    var17.a();
                    l.h(0, 0, l.field_k, l.field_j);
                    var15 = new ci(var9, var9);
                    var18 = var15;
                    var18.a();
                    var17.d(0, 0);
                    var11 = new ci(var9, var9);
                    var11.a();
                    var17.d(var9 + -var17.field_r, 0);
                    var12 = new ci(-(var9 * 2) + var17.field_r, var9);
                    var12.a();
                    var17.d(-var9, 0);
                    ij.a(false);
                    i.field_c = new ci[]{var15, var12, var11};
                    break L0;
                  } else {
                    var14 = var6[var9];
                    var10 = var14;
                    var11_int = 0;
                    L3: while (true) {
                      if (var11_int >= var14.length) {
                        var9++;
                        continue L2;
                      } else {
                        int discarded$3 = 0;
                        var14[var11_int] = lf.a(var21[var11_int], var5[var9]);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var21[0].clone();
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
            stackOut_12_1 = new StringBuilder().append("gi.A(");
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
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
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
            if (param2 == null) {
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
          throw qk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + -2040 + 41);
        }
    }

    gi(e param0) {
        try {
            ((gi) this).field_g = param0;
            ((gi) this).field_n = false;
            ((gi) this).field_f = 0;
            ((gi) this).field_e = null;
            ((gi) this).field_u = ((gi) this).field_g.field_h;
            ((gi) this).field_d = 0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "gi.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
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
