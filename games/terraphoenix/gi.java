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
        if (this.field_n) {
          L0: {
            var3 = 240 + (int)(((double)this.field_c + this.field_y / 100.0) * 16.0 + 16.0 * (this.field_p / 100.0 + (double)this.field_m) - (double)lg.field_c + (double)(96 * this.field_x));
            var4 = (int)(48.0 * (((double)(300 * this.field_x) + this.field_t) / 100.0));
            var2 = (int)((double)(-sj.field_b) + ((this.field_y / 100.0 + (double)this.field_c) * 32.0 - ((double)this.field_m + this.field_p / 100.0) * 32.0)) + 320;
            if (this.field_s == 0) {
              if (-5 < (this.field_f ^ -1)) {
                te.a((byte) 99, 12 - this.field_f * 3, var2, var3, var4, 16777215, false);
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          L1: {
            if (2 != this.field_s) {
              break L1;
            } else {
              if (this.field_f >= 16) {
                break L1;
              } else {
                te.a((byte) 99, 8 + -(this.field_f / 2), var2, var3, var4, 16777215, false);
                break L1;
              }
            }
          }
          L2: {
            if (this.field_s != 3) {
              break L2;
            } else {
              L3: {
                if (this.field_f < 6) {
                  te.a((byte) 99, 4 * this.field_f, var2, var3, var4, 65535, false);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (32 <= this.field_f) {
                break L2;
              } else {
                te.a((byte) 99, 8 - this.field_f / 4, var2, var3, var4, 65535, false);
                break L2;
              }
            }
          }
          L4: {
            if (-5 == (this.field_s ^ -1)) {
              L5: {
                if (-7 >= (this.field_f ^ -1)) {
                  break L5;
                } else {
                  te.a((byte) 99, this.field_f * 4, var2, var3, var4, 16711680, false);
                  break L5;
                }
              }
              L6: {
                if (this.field_f < 32) {
                  te.a((byte) 99, 16 - this.field_f / 2, var2, var3, var4, 16711680, false);
                  break L6;
                } else {
                  break L6;
                }
              }
              if ((this.field_f ^ -1) <= -9) {
                return;
              } else {
                te.a((byte) 99, 16 + -(this.field_f * 2), var2, var3, var4, 16777215, false);
                break L4;
              }
            } else {
              break L4;
            }
          }
          return;
        } else {
          L7: {
            var3 = 240 - -(int)((double)(this.field_x * 96) + (((double)this.field_m + this.field_p / 100.0) * 16.0 + ((double)this.field_c + this.field_y / 100.0) * (double)param0 - (double)lg.field_c));
            var2 = (int)((this.field_y / 100.0 + (double)this.field_c) * 32.0 - (this.field_p / 100.0 + (double)this.field_m) * 32.0 - (double)sj.field_b) + 320;
            var4 = (int)(((double)(this.field_x * 300) + this.field_t) / 100.0 * 48.0);
            if (-1 != (this.field_s ^ -1)) {
              break L7;
            } else {
              var5 = (this.field_b + -this.field_i) * 32.0 * (double)this.field_o / 1600.0;
              var7 = (-this.field_i - this.field_b) * 16.0 * (double)this.field_o / 1600.0;
              var9 = -this.field_k * 48.0 * (double)this.field_o / 1600.0;
              if ((this.field_d ^ -1) <= -6) {
                var11 = 0;
                L8: while (true) {
                  if (-11 >= (var11 ^ -1)) {
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
                    if (-9 < (var11 ^ -1)) {
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
            if (1 != this.field_s) {
              break L12;
            } else {
              var5 = (this.field_b + -this.field_i) * 32.0 / 100.0;
              var7 = (-this.field_b + -this.field_i) * 16.0 / 100.0;
              var9 = -this.field_k * 48.0 / 100.0;
              te.a((byte) 99, 6, (int)((double)var2 + var5), (int)((double)var3 + var7), (int)(var9 + (double)var4), 16777215, true);
              te.a((byte) 99, 6, (int)(var5 / 2.0 + (double)var2), (int)((double)var3 + var7 / 2.0), (int)(var9 / 2.0 + (double)var4), 16777215, true);
              te.a((byte) 99, 3, var2, var3, var4, 0, true);
              break L12;
            }
          }
          L13: {
            if (2 == this.field_s) {
              var5 = (-this.field_i + this.field_b) * 32.0 / 100.0;
              var7 = 16.0 * (-this.field_b + -this.field_i) / 100.0;
              var9 = 48.0 * -this.field_k / 100.0;
              if (-6 >= (this.field_d ^ -1)) {
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
            if (-4 != (this.field_s ^ -1)) {
              break L17;
            } else {
              var5 = (-this.field_i + this.field_b) * 32.0 / 100.0;
              var7 = 16.0 * (-this.field_b + -this.field_i) / 100.0;
              var9 = 48.0 * -this.field_k / 100.0;
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
            if (4 != this.field_s) {
              break L20;
            } else {
              var5 = (-this.field_i + this.field_b) * 32.0 * (double)this.field_o / 5200.0;
              var7 = (-this.field_i - this.field_b) * 16.0 * (double)this.field_o / 5200.0;
              var9 = 48.0 * -this.field_k * (double)this.field_o / 5200.0;
              if (5 <= this.field_d) {
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
            if ((this.field_s ^ -1) != -6) {
              break L25;
            } else {
              te.a((byte) 99, 8, var2, var3, var4, 255, false);
              te.a((byte) 99, 7, var2, var3, var4, 65535, false);
              te.a((byte) 99, 6, var2, var3, var4, 16777215, false);
              break L25;
            }
          }
          L26: {
            if (-7 != (this.field_s ^ -1)) {
              break L26;
            } else {
              var3 = (int)((double)(-lg.field_c) + (-(((double)(this.field_x * 100) + this.field_t) / 100.0 * 48.0) + (16.0 * ((double)this.field_m + this.field_p / 100.0) + 16.0 * ((double)this.field_c + this.field_y / 100.0)))) + 240;
              var2 = (int)(32.0 * ((double)this.field_c + this.field_y / 100.0) - 32.0 * ((double)this.field_m + this.field_p / 100.0) - (double)sj.field_b) + 320;
              l.e(var2, var3, 3, 8421504);
              break L26;
            }
          }
          L27: {
            if (7 == this.field_s) {
              var2 = (int)((double)(-sj.field_b) + (((double)this.field_c + this.field_y / 100.0) * 32.0 - 32.0 * ((double)this.field_m + this.field_p / 100.0))) + 320;
              var3 = 240 - -(int)(-(48.0 * (((double)(this.field_x * 100) + this.field_t) / 100.0)) + ((this.field_y / 100.0 + (double)this.field_c) * 16.0 + (this.field_p / 100.0 + (double)this.field_m) * 16.0) - (double)lg.field_c);
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
              this.field_n = true;
              var5 = 54 % ((-72 - param3) / 40);
              if (this.field_s == 0) {
                break L2;
              } else {
                if (2 == this.field_s) {
                  break L2;
                } else {
                  if (this.field_s != 5) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (this.field_o < 40) {
              break L0;
            } else {
              break L1;
            }
          }
          if (Math.random() * 100.0 < (double)this.field_o) {
            var6 = this.field_u.a(104, param0, param2, param1);
            if (var6 == null) {
              return (gi) (this);
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
                  if ((var6.field_b ^ -1) == 0) {
                    break L0;
                  } else {
                    if (-6 != (nc.field_a[var6.field_j] ^ -1)) {
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
                      if (100.0 * Math.random() < (double)(this.field_o - 60)) {
                        break L3;
                      } else {
                        break L0;
                      }
                    }
                  }
                  var6.field_b = ck.field_f[var6.field_b];
                  if (0 == (var6.field_b ^ -1)) {
                    var6.field_v = -1;
                    if (-1 > (var6.field_r ^ -1)) {
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
        return (gi) (this);
    }

    private final void a(byte param0, boolean param1) {
        gi discarded$7 = null;
        gi discarded$8 = null;
        gi discarded$9 = null;
        gi discarded$10 = null;
        gi discarded$11 = null;
        gi discarded$12 = null;
        gi discarded$13 = null;
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
        dl var13 = null;
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
          this.field_n = true;
          var4 = this.field_o;
          if (-1 != (this.field_s ^ -1)) {
            break L0;
          } else {
            if (param1) {
              if (30.0 * Math.random() >= (double)(-15 + this.field_o)) {
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
          if (3 != this.field_s) {
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
          if ((this.field_s ^ -1) == -2) {
            var3 = 4;
            qd.a((byte) 86, 81);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (6 == this.field_s) {
            var3 = 4;
            qd.a((byte) 56, 78);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (-6 != (this.field_s ^ -1)) {
            break L4;
          } else {
            var3 = 10;
            qd.a((byte) 91, 49);
            break L4;
          }
        }
        L5: {
          if (this.field_s == 7) {
            var3 = 6;
            qd.a((byte) 58, 65);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (var3 > 0) {
            var5 = 32 * this.field_c + -(this.field_m * 32);
            sj.field_b = var5;
            eg.field_p = this.field_x;
            var6 = -(this.field_x * 48) + (16 * this.field_c - -(16 * this.field_m));
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
                var13 = (dl) null;
                discarded$7 = this.a((dl) null, false, 122);
                break L8;
              }
            }
            return;
          } else {
            var6 = -var3 + this.field_c;
            L9: while (true) {
              if (this.field_c - -var3 < var6) {
                var5++;
                continue L7;
              } else {
                var7 = -var3 + this.field_m;
                L10: while (true) {
                  if (var3 + this.field_m < var7) {
                    var6++;
                    continue L9;
                  } else {
                    var8 = var6 + -this.field_c;
                    var9 = var7 - this.field_m;
                    var10 = (int)Math.sqrt((double)(var8 * var8 + var9 * var9));
                    this.field_o = (-var10 + var3) * var4 / var3;
                    if (-1 > (this.field_o ^ -1)) {
                      L11: {
                        if (this.field_c + -var5 == var6) {
                          break L11;
                        } else {
                          if (var6 == var5 + this.field_c) {
                            break L11;
                          } else {
                            if (var7 == -var5 + this.field_m) {
                              break L11;
                            } else {
                              if (var5 + this.field_m == var7) {
                                break L11;
                              } else {
                                var7++;
                                continue L10;
                              }
                            }
                          }
                        }
                      }
                      if (this.field_u.a(this.field_x, this.field_m, this.field_x, var6, -17402, this.field_c, var7)) {
                        L12: {
                          var11 = this.field_u.a(121, var7, this.field_x, var6);
                          if (var11 == null) {
                            break L12;
                          } else {
                            L13: {
                              stackOut_40_0 = (dl) (var11);
                              stackIn_42_0 = stackOut_40_0;
                              stackIn_41_0 = stackOut_40_0;
                              if (64 < var4) {
                                stackOut_42_0 = (dl) ((Object) stackIn_42_0);
                                stackOut_42_1 = -this.field_o + var4 + 64;
                                stackIn_43_0 = stackOut_42_0;
                                stackIn_43_1 = stackOut_42_1;
                                break L13;
                              } else {
                                stackOut_41_0 = (dl) ((Object) stackIn_41_0);
                                stackOut_41_1 = -this.field_o + (var4 + var4);
                                stackIn_43_0 = stackOut_41_0;
                                stackIn_43_1 = stackOut_41_1;
                                break L13;
                              }
                            }
                            stackIn_43_0.field_p = stackIn_43_1;
                            break L12;
                          }
                        }
                        discarded$8 = this.a(var11, false, -29593);
                        discarded$9 = this.a(this.field_u.a(param0 + 126, var7, this.field_x, var6 + 1), false, -29593);
                        discarded$10 = this.a((byte) 94, false, this.field_u.a(param0 + 89, var7, this.field_x, var6));
                        discarded$11 = this.a((byte) 94, false, this.field_u.a(126, 1 + var7, this.field_x, var6));
                        discarded$12 = this.a(var7, var6, this.field_x, (byte) -20);
                        discarded$13 = this.a(var7, var6, 1 + this.field_x, (byte) -124);
                        if (var11 != null) {
                          if (var11.field_h != null) {
                            if (0 < var11.field_h.field_P) {
                              var11.field_h.a((byte) -51, this.field_o);
                              if (-1 <= (var11.field_h.field_P ^ -1)) {
                                if (var11.field_h.field_Z == null) {
                                  if (-8 != (var11.field_h.field_t ^ -1)) {
                                    if (null != this.field_e) {
                                      L14: {
                                        if (null == this.field_e) {
                                          break L14;
                                        } else {
                                          this.field_e.field_e = this.field_e.field_e + 1;
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        if (null == this.field_e) {
                                          break L15;
                                        } else {
                                          if (Math.random() * 100.0 <= (double)this.field_e.field_q) {
                                            break L15;
                                          } else {
                                            this.field_e.field_q = this.field_e.field_q + 1;
                                            break L15;
                                          }
                                        }
                                      }
                                      L16: {
                                        if (this.field_e.field_B >= 90) {
                                          mh.a((byte) 117, 0, 255);
                                          break L16;
                                        } else {
                                          break L16;
                                        }
                                      }
                                      L17: {
                                        if ((this.field_e.field_e ^ -1) <= -11) {
                                          mh.a((byte) 126, 2, 253);
                                          break L17;
                                        } else {
                                          break L17;
                                        }
                                      }
                                      if (25 <= this.field_e.field_e) {
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
        gi discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        dl var4 = null;
        gi var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        dl var9 = null;
        var8 = Terraphoenix.field_V;
        if (this.field_n) {
          this.field_f = this.field_f + 1;
          if (this.field_f <= 25) {
            return (gi) (this);
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
                discarded$1 = this.a((byte) -35);
                break L0;
              }
            }
            L1: {
              if (this.field_s != 0) {
                break L1;
              } else {
                var2 = 2;
                break L1;
              }
            }
            L2: {
              if (-3 == (this.field_s ^ -1)) {
                var2 = 5;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (4 == this.field_s) {
                var2 = 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (this.field_d >= 5) {
                break L4;
              } else {
                L5: {
                  L6: {
                    this.field_d = this.field_d + 1;
                    if (0 == this.field_s) {
                      break L6;
                    } else {
                      if (this.field_s == 2) {
                        break L6;
                      } else {
                        if ((this.field_s ^ -1) != -5) {
                          this.field_d = 5;
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if ((this.field_d ^ -1) > -6) {
                    return (gi) (this);
                  } else {
                    break L5;
                  }
                }
                if (this.field_d != 5) {
                  break L4;
                } else {
                  L7: {
                    if (this.field_y <= 50.0) {
                      break L7;
                    } else {
                      this.field_y = 50.0;
                      var2 += 2;
                      break L7;
                    }
                  }
                  L8: {
                    if (-50.0 <= this.field_y) {
                      break L8;
                    } else {
                      var2 += 2;
                      this.field_y = -50.0;
                      break L8;
                    }
                  }
                  L9: {
                    if (this.field_p <= 50.0) {
                      break L9;
                    } else {
                      this.field_p = 50.0;
                      var2 += 2;
                      break L9;
                    }
                  }
                  if (this.field_p < -50.0) {
                    this.field_p = -50.0;
                    var2 += 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L10: while (true) {
              if ((var2 ^ -1) >= -1) {
                return (gi) (this);
              } else {
                L11: {
                  var2--;
                  var3 = 0;
                  if (-7 >= (this.field_s ^ -1)) {
                    this.field_a = this.field_a - 1;
                    this.field_k = this.field_k - 1.04;
                    var3 = 1;
                    var9 = this.field_u.a(-83, this.field_m, this.field_x, this.field_c);
                    if (this.field_a >= 0) {
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
                    if (this.field_s == 1) {
                      break L13;
                    } else {
                      if ((this.field_s ^ -1) != -6) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  this.field_k = this.field_k - 0.17333333333333334;
                  break L12;
                }
                L14: {
                  if (this.field_s != 0) {
                    break L14;
                  } else {
                    this.field_k = this.field_k - 0.065;
                    break L14;
                  }
                }
                L15: {
                  if (this.field_s != 3) {
                    break L15;
                  } else {
                    this.field_k = this.field_k - 0.26;
                    break L15;
                  }
                }
                L16: {
                  if (-5 != (this.field_s ^ -1)) {
                    break L16;
                  } else {
                    this.field_k = this.field_k - 0.065;
                    break L16;
                  }
                }
                var4 = this.field_u.a(-105, this.field_m, this.field_x, this.field_c);
                L17: while (true) {
                  if (var4 != null) {
                    L18: {
                      this.field_t = this.field_t + this.field_k;
                      if (this.field_t < (double)(-(var4.field_r * 100) + var4.field_l)) {
                        L19: {
                          if ((var4.field_v ^ -1) == 0) {
                            break L19;
                          } else {
                            if (var4.field_b != -1) {
                              if (var3 != 0) {
                                this.field_k = -this.field_k / 2.0;
                                this.field_t = (double)(-(var4.field_r * 100) + var4.field_l);
                                this.field_i = this.field_i * 0.9;
                                break L18;
                              } else {
                                this.a(37);
                                return this.a(this.field_m, this.field_c, this.field_x, (byte) -122);
                              }
                            } else {
                              break L19;
                            }
                          }
                        }
                        this.field_t = this.field_t + 100.0;
                        this.field_x = this.field_x - 1;
                        var4 = this.field_u.a(-54, this.field_m, this.field_x, this.field_c);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L20: {
                      if (100.0 < this.field_t) {
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
                                    return this.a(this.field_m, this.field_c, this.field_x - -1, (byte) -125);
                                  } else {
                                    this.field_t = 100.0;
                                    this.field_k = -this.field_k / 2.0;
                                    this.field_i = 0.9 * this.field_i;
                                    break L21;
                                  }
                                }
                              }
                            }
                            this.field_x = this.field_x + 1;
                            this.field_t = this.field_t - 100.0;
                            var4 = var4.field_C;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        if (1000.0 >= this.field_t) {
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
                        if ((double)(var4.field_l + 50) <= this.field_t) {
                          break L23;
                        } else {
                          var5 = this.a(this.field_m, 3394, this.field_c, this.field_x);
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
                        if ((double)(var4.field_l + 50) > this.field_t) {
                          var5 = this.a(this.field_m, 3394, this.field_c, this.field_x);
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
                        if (this.field_t <= (double)(100 - -var4.field_l)) {
                          var5 = this.a(this.field_m, 3394, this.field_c, this.field_x);
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
                      this.field_y = this.field_y + this.field_i;
                      if (-50.0 <= this.field_y) {
                        break L26;
                      } else {
                        if ((1 & var4.field_e) != 1) {
                          L27: {
                            if ((16 & var4.field_e) != 16) {
                              break L27;
                            } else {
                              if (50.0 > this.field_t) {
                                this.field_y = -50.0;
                                return this.a(var4, true, -29593);
                              } else {
                                break L27;
                              }
                            }
                          }
                          this.field_c = this.field_c - 1;
                          this.field_y = this.field_y + 100.0;
                          break L26;
                        } else {
                          this.field_y = -50.0;
                          return this.a(var4, true, -29593);
                        }
                      }
                    }
                    L28: {
                      if (50.0 >= this.field_y) {
                        break L28;
                      } else {
                        if ((4 & var4.field_e) == 4) {
                          this.field_y = 50.0;
                          return this.a(this.field_u.a(-61, this.field_m, this.field_x, 1 + this.field_c), true, -29593);
                        } else {
                          L29: {
                            if (64 != (64 & var4.field_e)) {
                              break L29;
                            } else {
                              if (50.0 <= this.field_t) {
                                break L29;
                              } else {
                                this.field_y = 50.0;
                                return this.a(this.field_u.a(-62, this.field_m, this.field_x, 1 + this.field_c), true, -29593);
                              }
                            }
                          }
                          this.field_y = this.field_y - 100.0;
                          this.field_c = this.field_c + 1;
                          break L28;
                        }
                      }
                    }
                    if ((this.field_c ^ -1) < -1) {
                      if (this.field_u.field_b - 1 > this.field_c) {
                        var4 = this.field_u.a(param0 ^ 126, this.field_m, this.field_x, this.field_c);
                        L30: while (true) {
                          if (var4 != null) {
                            L31: while (true) {
                              L32: {
                                if (null == var4.field_C) {
                                  break L32;
                                } else {
                                  if (100.0 >= this.field_t) {
                                    break L32;
                                  } else {
                                    this.field_x = this.field_x + 1;
                                    this.field_t = this.field_t - 100.0;
                                    var4 = this.field_u.a(108, this.field_m, this.field_x, this.field_c);
                                    continue L31;
                                  }
                                }
                              }
                              L33: {
                                this.field_p = this.field_p + this.field_b;
                                if (this.field_p <= 50.0) {
                                  break L33;
                                } else {
                                  L34: {
                                    if (this.field_t > 100.0) {
                                      break L34;
                                    } else {
                                      if ((8 & var4.field_e ^ -1) != -9) {
                                        if (-129 != (128 & var4.field_e ^ -1)) {
                                          break L34;
                                        } else {
                                          if (this.field_t >= 50.0) {
                                            break L34;
                                          } else {
                                            this.field_p = 50.0;
                                            return this.a((byte) 94, true, this.field_u.a(-26, this.field_m - -1, this.field_x, this.field_c));
                                          }
                                        }
                                      } else {
                                        this.field_p = 50.0;
                                        return this.a((byte) 94, true, this.field_u.a(param0 ^ -70, 1 + this.field_m, this.field_x, this.field_c));
                                      }
                                    }
                                  }
                                  this.field_m = this.field_m + 1;
                                  this.field_p = this.field_p - 100.0;
                                  break L33;
                                }
                              }
                              L35: {
                                if (-50.0 > this.field_p) {
                                  L36: {
                                    if (100.0 >= this.field_t) {
                                      if ((2 & var4.field_e) == 2) {
                                        this.field_p = -50.0;
                                        return this.a((byte) 94, true, var4);
                                      } else {
                                        if (32 != (32 & var4.field_e)) {
                                          break L36;
                                        } else {
                                          if (this.field_t >= 50.0) {
                                            break L36;
                                          } else {
                                            this.field_p = -50.0;
                                            return this.a((byte) 94, true, var4);
                                          }
                                        }
                                      }
                                    } else {
                                      break L36;
                                    }
                                  }
                                  this.field_p = this.field_p + 100.0;
                                  this.field_m = this.field_m - 1;
                                  break L35;
                                } else {
                                  break L35;
                                }
                              }
                              if (-1 > (this.field_m ^ -1)) {
                                if (-1 + this.field_u.field_e > this.field_m) {
                                  var4 = this.field_u.a(param0 + -46, this.field_m, this.field_x, this.field_c);
                                  L37: while (true) {
                                    if (var4 != null) {
                                      L38: while (true) {
                                        L39: {
                                          if (var4.field_C == null) {
                                            break L39;
                                          } else {
                                            if (this.field_t <= 100.0) {
                                              break L39;
                                            } else {
                                              this.field_x = this.field_x + 1;
                                              this.field_t = this.field_t - 100.0;
                                              var4 = this.field_u.a(-85, this.field_m, this.field_x, this.field_c);
                                              continue L38;
                                            }
                                          }
                                        }
                                        if (var4.field_h == null) {
                                          continue L10;
                                        } else {
                                          if ((this.field_s ^ -1) == -7) {
                                            continue L10;
                                          } else {
                                            if (this.field_s == 7) {
                                              continue L10;
                                            } else {
                                              var6 = var4.field_h.c(param0 ^ -117);
                                              var7 = var4.field_h.h(13);
                                              if ((double)var7 <= this.field_p) {
                                                continue L10;
                                              } else {
                                                if ((double)(-var6) >= this.field_y) {
                                                  continue L10;
                                                } else {
                                                  if ((double)var6 <= this.field_y) {
                                                    continue L10;
                                                  } else {
                                                    if ((double)(-var6) >= this.field_p) {
                                                      continue L10;
                                                    } else {
                                                      if (this.field_p >= (double)var6) {
                                                        continue L10;
                                                      } else {
                                                        if ((var4.field_h.field_P ^ -1) < -1) {
                                                          L40: {
                                                            if (null == this.field_e) {
                                                              if ((this.field_s ^ -1) == -2) {
                                                                break L40;
                                                              } else {
                                                                if (-7 == (this.field_s ^ -1)) {
                                                                  break L40;
                                                                } else {
                                                                  if (this.field_s == 5) {
                                                                    break L40;
                                                                  } else {
                                                                    if ((this.field_s ^ -1) == -8) {
                                                                      break L40;
                                                                    } else {
                                                                      var4.field_h.a((byte) 114, this.field_o, this.field_s);
                                                                      break L40;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              if ((this.field_s ^ -1) == -2) {
                                                                break L40;
                                                              } else {
                                                                if (-7 == (this.field_s ^ -1)) {
                                                                  break L40;
                                                                } else {
                                                                  if (this.field_s == 5) {
                                                                    break L40;
                                                                  } else {
                                                                    if ((this.field_s ^ -1) == -8) {
                                                                      break L40;
                                                                    } else {
                                                                      var4.field_h.a((byte) 114, this.field_o, this.field_s);
                                                                      break L40;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L41: {
                                                            if (-1 > (var4.field_h.field_P ^ -1)) {
                                                              break L41;
                                                            } else {
                                                              if (var4.field_h.field_Z != null) {
                                                                break L41;
                                                              } else {
                                                                if (7 == var4.field_h.field_t) {
                                                                  break L41;
                                                                } else {
                                                                  if (this.field_e == null) {
                                                                    break L41;
                                                                  } else {
                                                                    this.field_e.field_e = this.field_e.field_e + 1;
                                                                    break L41;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L42: {
                                                            if (this.field_e == null) {
                                                              break L42;
                                                            } else {
                                                              L43: {
                                                                if (-91 < (this.field_e.field_B ^ -1)) {
                                                                  break L43;
                                                                } else {
                                                                  mh.a((byte) 112, 0, 255);
                                                                  break L43;
                                                                }
                                                              }
                                                              L44: {
                                                                if (-11 < (this.field_e.field_e ^ -1)) {
                                                                  break L44;
                                                                } else {
                                                                  mh.a((byte) 113, 2, 253);
                                                                  break L44;
                                                                }
                                                              }
                                                              if ((this.field_e.field_e ^ -1) <= -26) {
                                                                mh.a((byte) 126, 3, 252);
                                                                break L42;
                                                              } else {
                                                                break L42;
                                                              }
                                                            }
                                                          }
                                                          this.a((byte) -6, false);
                                                          return (gi) (this);
                                                        } else {
                                                          this.a((byte) -6, false);
                                                          return (gi) (this);
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
                                      this.field_t = this.field_t + 100.0;
                                      this.field_x = this.field_x - 1;
                                      var4 = this.field_u.a(-109, this.field_m, this.field_x, this.field_c);
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
                            this.field_t = this.field_t + 100.0;
                            this.field_x = this.field_x - 1;
                            var4 = this.field_u.a(-111, this.field_m, this.field_x, this.field_c);
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
                    this.field_t = this.field_t + 100.0;
                    this.field_x = this.field_x - 1;
                    var4 = this.field_u.a(116, this.field_m, this.field_x, this.field_c);
                    continue L17;
                  }
                }
              }
            }
          } else {
            return (gi) (this);
          }
        }
    }

    final static int a(int param0, String param1, boolean param2, int param3, int param4, String param5, String param6) {
        gd var7 = null;
        RuntimeException var7_ref = null;
        gd var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var7 = new gd(param6);
              var8 = new gd(param5);
              if (param3 == 3) {
                break L1;
              } else {
                field_h = 67;
                break L1;
              }
            }
            stackOut_2_0 = tb.a(param1, var8, var7, param2, param0, (byte) 96, param4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7_ref);
            stackOut_4_1 = new StringBuilder().append("gi.E(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param6 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
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
            field_r = (qf) null;
        }
    }

    private final gi a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        dl var7 = null;
        dl var8 = null;
        var6 = Terraphoenix.field_V;
        this.field_n = true;
        var7 = this.field_u.a(param1 ^ -3426, param0, param3, param2);
        var8 = var7;
        if (var8 != null) {
          L0: {
            if (this.field_s != 0) {
              break L0;
            } else {
              if (var8.field_j > 3) {
                break L0;
              } else {
                return (gi) (this);
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
            if ((this.field_s ^ -1) != -7) {
              break L1;
            } else {
              this.a(param1 ^ -3416);
              return (gi) (this);
            }
          }
          if ((var8.field_j ^ -1) != 0) {
            L3: {
              if (param1 == 3394) {
                break L3;
              } else {
                this.field_d = 24;
                break L3;
              }
            }
            L4: {
              L5: {
                L6: {
                  if (this.field_s == 0) {
                    break L6;
                  } else {
                    if (-3 == (this.field_s ^ -1)) {
                      break L6;
                    } else {
                      if ((this.field_s ^ -1) != -6) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                if (40 <= this.field_o) {
                  break L5;
                } else {
                  if (-4 != (this.field_s ^ -1)) {
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
              if (100.0 * Math.random() < (double)this.field_o) {
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
                return (gi) (this);
              }
            }
            this.a(-127);
            return (gi) (this);
          } else {
            return (gi) (this);
          }
        } else {
          return (gi) (this);
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
        String[][] dupTemp$6 = null;
        long[][] dupTemp$7 = null;
        int[][] dupTemp$8 = null;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var27 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var28 = mk.field_j;
              var3 = 83 % ((56 - param0) / 50);
              var2 = var28.a(-16384);
              if (var2 == 0) {
                var4 = var28.i(-25578);
                var5 = (nd) ((Object) r.field_Q.d(9272));
                L2: while (true) {
                  L3: {
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (var5.field_s != var4) {
                        var5 = (nd) ((Object) r.field_Q.e((byte) -119));
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
                            dupTemp$6 = new String[3][var7];
                            var5.field_p = dupTemp$6;
                            var9 = dupTemp$6;
                            var10 = new String[3][var7];
                            dupTemp$7 = new long[3][var7];
                            var5.field_l = dupTemp$7;
                            var11 = dupTemp$7;
                            dupTemp$8 = new int[3][var8 * var7];
                            var5.field_q = dupTemp$8;
                            var12 = dupTemp$8;
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
                                          incrementValue$9 = var16;
                                          var16++;
                                          var12[0][incrementValue$9] = var28.f((byte) -107);
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
                                            incrementValue$10 = var17;
                                            var17++;
                                            var12[1][incrementValue$10] = var28.f((byte) -107);
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
                                            incrementValue$11 = var18;
                                            var18++;
                                            var12[2][incrementValue$11] = var28.f((byte) -107);
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
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                if ((var2 ^ -1) != -2) {
                  bd.a((Throwable) null, "HS1: " + r.i(-15465), -60);
                  gb.g(-17464);
                  break L1;
                } else {
                  var4 = var28.i(-25578);
                  var5_long = var28.h((byte) 78);
                  var7_ref_fb = (fb) ((Object) hd.field_p.d(9272));
                  L14: while (true) {
                    L15: {
                      if (var7_ref_fb == null) {
                        break L15;
                      } else {
                        if (var7_ref_fb.field_s == var4) {
                          break L15;
                        } else {
                          var7_ref_fb = (fb) ((Object) hd.field_p.e((byte) -119));
                          continue L14;
                        }
                      }
                    }
                    if (var7_ref_fb == null) {
                      gb.g(-17464);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var7_ref_fb.field_p = var5_long;
                      var7_ref_fb.b((byte) 12);
                      break L1;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "gi.I(" + param0 + ')');
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

    private final gi a(dl param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        gi stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_39_0 = null;
        gi stackOut_1_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        try {
          L0: {
            this.field_n = true;
            if (param2 == -29593) {
              if (param0 == null) {
                stackOut_5_0 = this;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  L2: {
                    L3: {
                      if (this.field_s == 0) {
                        break L3;
                      } else {
                        if ((this.field_s ^ -1) != -3) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (40 <= this.field_o) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                  if (Math.random() * 100.0 >= (double)this.field_o) {
                    break L1;
                  } else {
                    L4: {
                      if (100.0 * Math.random() < (double)(this.field_o - 60)) {
                        break L4;
                      } else {
                        if ((param0.field_g ^ -1) == -29) {
                          break L1;
                        } else {
                          if (-33 == (param0.field_g ^ -1)) {
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
                        if ((nh.field_E[param0.field_g] ^ -1) == -2) {
                          param0.a(1, true, 111);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (-3 != (nh.field_E[param0.field_g] ^ -1)) {
                          break L7;
                        } else {
                          param0.a(1, false, param2 ^ -29687);
                          break L7;
                        }
                      }
                      L8: {
                        if (3 != nh.field_E[param0.field_g]) {
                          break L8;
                        } else {
                          param0.a(1, true, 96);
                          param0.field_i = 0;
                          this.field_u.a(122, param0.field_n, param0.field_r, -1 + param0.field_A).field_i = 0;
                          break L8;
                        }
                      }
                      param0.field_g = le.field_s[param0.field_g];
                      if ((param0.field_g ^ -1) > -1) {
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
                            param0.a(1, false, param2 + 29671);
                            break L10;
                          }
                        }
                        if ((nh.field_E[param0.field_g] ^ -1) == -4) {
                          param0.a(1, true, param2 + 29485);
                          param0.field_i = 1;
                          this.field_u.a(-88, param0.field_n, param0.field_r, -1 + param0.field_A).field_i = 1;
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
                stackOut_39_0 = this;
                stackIn_40_0 = stackOut_39_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_1_0 = (gi) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var4);
            stackOut_41_1 = new StringBuilder().append("gi.G(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L12;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L12;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (gi) (this);
          } else {
            return (gi) (this);
          }
        }
    }

    private final gi a(byte param0, boolean param1, dl param2) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        Object stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_39_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 94) {
                break L1;
              } else {
                this.field_d = -74;
                break L1;
              }
            }
            this.field_n = true;
            if (param2 == null) {
              stackOut_4_0 = this;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                L3: {
                  L4: {
                    if (-1 == (this.field_s ^ -1)) {
                      break L4;
                    } else {
                      if (this.field_s != 2) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (-41 < (this.field_o ^ -1)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                if (100.0 * Math.random() >= (double)this.field_o) {
                  break L2;
                } else {
                  L5: {
                    if (Math.random() * 100.0 < (double)(this.field_o - 60)) {
                      break L5;
                    } else {
                      if (param2.field_k == 28) {
                        break L2;
                      } else {
                        if (32 == param2.field_k) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L6: {
                    if (28 != param2.field_k) {
                      break L6;
                    } else {
                      if (param2.field_s.field_i.field_G.field_Bb == 13) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (-1 < (param2.field_k ^ -1)) {
                    break L2;
                  } else {
                    L7: {
                      if (1 == nh.field_E[param2.field_k]) {
                        param2.a(2, true, -95);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if ((nh.field_E[param2.field_k] ^ -1) != -3) {
                        break L8;
                      } else {
                        param2.a(2, false, 87);
                        break L8;
                      }
                    }
                    L9: {
                      if (3 != nh.field_E[param2.field_k]) {
                        break L9;
                      } else {
                        param2.a(2, true, -75);
                        param2.field_i = 0;
                        this.field_u.a(82, -1 + param2.field_n, param2.field_r, param2.field_A).field_i = 0;
                        break L9;
                      }
                    }
                    param2.field_k = le.field_s[param2.field_k];
                    if (param2.field_k >= 0) {
                      L10: {
                        if (1 != nh.field_E[param2.field_k]) {
                          break L10;
                        } else {
                          param2.a(2, true, param0 ^ 54);
                          break L10;
                        }
                      }
                      L11: {
                        if (2 == nh.field_E[param2.field_k]) {
                          param2.a(2, false, 93);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      if ((nh.field_E[param2.field_k] ^ -1) != -4) {
                        break L2;
                      } else {
                        param2.a(2, true, -108);
                        param2.field_i = 1;
                        this.field_u.a(-91, param2.field_n + -1, param2.field_r, param2.field_A).field_i = 1;
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L12: {
                if (param1) {
                  this.a(-122);
                  break L12;
                } else {
                  break L12;
                }
              }
              stackOut_39_0 = this;
              stackIn_40_0 = stackOut_39_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var4);
            stackOut_41_1 = new StringBuilder().append("gi.C(").append(param0).append(',').append(param1).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L13;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L13;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gi) (this);
        } else {
          return (gi) (this);
        }
    }

    private final void a(int param0) {
        int var2 = -112 % ((param0 - -82) / 40);
        this.a((byte) -6, true);
    }

    final static void a(fa param0, fa param1, fa param2, int param3) {
        bg discarded$2 = null;
        int discarded$3 = 0;
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
        String var14 = null;
        bg[] var15 = null;
        ci var16 = null;
        int[][] var17 = null;
        ci var18 = null;
        ci var19 = null;
        int[][] var20 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var13 = Terraphoenix.field_V;
        try {
          L0: {
            e.field_p = ig.a(param0, 0, "frame_top", "commonui");
            qb.field_f = ig.a(param0, 0, "frame_bottom", "commonui");
            hd.field_o = il.a("jagex_logo_grey", "commonui", param0, param3 + 2039);
            i.field_c = ig.a(param0, 0, "button", "commonui");
            og.field_c = ce.a("validation", (byte) -90, "commonui", param0);
            ra.field_l = (pk) ((Object) ec.a("commonui", 8192, param1, param0, "arezzo12"));
            qk.field_e = (pk) ((Object) ec.a("commonui", 8192, param1, param0, "arezzo14"));
            be.field_x = (pk) ((Object) ec.a("commonui", param3 + 10232, param1, param0, "arezzo14bold"));
            var18 = new ci(param2.a("button.gif", "", -21653), (java.awt.Component) ((Object) ae.field_G));
            discarded$2 = qb.a("dropdown", (byte) -36, "commonui", param0);
            var5 = lf.a(true, "commonui", "screen_options", param0);
            hk.field_d = new bg[4];
            ng.field_u = new bg[4];
            o.field_c = new bg[4];
            var6 = new bg[][]{o.field_c, ng.field_u, hk.field_d};
            var20 = new int[4][];
            var17 = var20;
            var7 = var17;
            var7[0] = var5[0].field_m;
            var8 = 1;
            L1: while (true) {
              if (var8 >= var20.length) {
                L2: {
                  var8 = var5[0].field_l[0];
                  var20[2][var8] = 16777215;
                  var20[1][var8] = 2394342;
                  if (param3 == -2040) {
                    break L2;
                  } else {
                    var14 = (String) null;
                    discarded$3 = gi.a(-71, (String) null, false, 84, -18, (String) null, (String) null);
                    break L2;
                  }
                }
                var20[3][var8] = 4767999;
                var9 = 0;
                L3: while (true) {
                  if (3 <= var9) {
                    var9 = var18.field_t;
                    ja.c((byte) 109);
                    var18.a();
                    l.h(0, 0, l.field_k, l.field_j);
                    var16 = new ci(var9, var9);
                    var19 = var16;
                    var19.a();
                    var18.d(0, 0);
                    var11 = new ci(var9, var9);
                    var11.a();
                    var18.d(var9 + -var18.field_r, 0);
                    var12 = new ci(-(var9 * 2) + var18.field_r, var9);
                    var12.a();
                    var18.d(-var9, 0);
                    ij.a(false);
                    i.field_c = new ci[]{var16, var12, var11};
                    break L0;
                  } else {
                    var15 = var6[var9];
                    var10 = var15;
                    var11_int = 0;
                    L4: while (true) {
                      if (var11_int >= var15.length) {
                        var9++;
                        continue L3;
                      } else {
                        var15[var11_int] = lf.a(var20[var11_int], var5[var9], param3 + 2040);
                        var11_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) ((Object) var20[0].clone());
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("gi.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
    }

    gi(e param0) {
        try {
            this.field_g = param0;
            this.field_n = false;
            this.field_f = 0;
            this.field_e = null;
            this.field_u = this.field_g.field_h;
            this.field_d = 0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = new qf();
        field_q = "Remove ";
        field_h = 0;
    }
}
