/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    private int field_d;
    private int field_k;
    static String[] field_a;
    private int field_o;
    private int field_j;
    int field_i;
    private int field_m;
    private int field_f;
    int field_g;
    private int field_c;
    int field_p;
    int field_h;
    int field_b;
    private boolean field_e;
    private int field_l;
    int field_n;

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = MinerDisturbance.field_ab;
          if (!param0) {
            break L0;
          } else {
            this.field_m = -58;
            break L0;
          }
        }
        L1: {
          var2 = 16 + (this.field_k / 10 + this.field_n * 32) - li.field_c;
          var3 = 16 + (this.field_f / 10 + this.field_p * 32) - db.field_d;
          var4 = q.field_b[this.field_n][this.field_p].field_i;
          if ((var4 ^ -1) <= -2) {
            break L1;
          } else {
            var4 = 1;
            break L1;
          }
        }
        L2: {
          if (255 >= var4) {
            break L2;
          } else {
            var4 = 255;
            break L2;
          }
        }
        L3: {
          if (this.field_d < var4) {
            this.field_d = this.field_d + 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (var4 < this.field_d) {
            this.field_d = this.field_d - 1;
            break L4;
          } else {
            break L4;
          }
        }
        var5 = this.field_k / 10 + (32 * this.field_n - 32 * ca.field_k) + -(sk.field_d / 10);
        var6 = -(hf.field_t * 32) - (mf.field_i / 10 - this.field_p * 32 + -(this.field_f / 10));
        var7 = (int)Math.sqrt((double)(var6 * var6 + var5 * var5)) / this.field_d;
        var2 = (int)((double)var2 + (double)var7 * Math.sin((double)pa.field_d * 3.14 / 16384.0) / 3.0);
        var3 = (int)((double)var3 + Math.cos((double)pa.field_d * 3.14 / 16384.0) * (double)var7 / 3.0);
        var8 = 0;
        L5: while (true) {
          if (-5 >= (var8 ^ -1)) {
            return;
          } else {
            eh.f(var2, var3, -(var8 * 8) + 64, 16777215, 16);
            var8++;
            continue L5;
          }
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ea var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ea var16 = null;
        int stackIn_15_0 = 0;
        ea stackIn_22_0 = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        ea stackOut_21_0 = null;
        ea stackOut_20_0 = null;
        L0: {
          var15 = MinerDisturbance.field_ab;
          if (this.field_h == 19) {
            break L0;
          } else {
            if (-10 == (this.field_h ^ -1)) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          if (!q.field_b[this.field_n][this.field_p].field_V) {
            break L1;
          } else {
            L2: {
              if (je.field_O.f(this.field_p, 2, this.field_n)) {
                break L2;
              } else {
                if (!q.field_b[this.field_n][this.field_p].field_A) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if ((this.field_d ^ -1) >= -1) {
                break L3;
              } else {
                var2 = 32 * this.field_n + (this.field_k / 10 + -(sk.field_d / 10) + -(32 * ca.field_k));
                var3 = this.field_f / 10 + (32 * this.field_p + (-(mf.field_i / 10) + -(32 * hf.field_t)));
                var4 = (int)Math.sqrt((double)(var2 * var2 - -(var3 * var3))) / this.field_d;
                if ((var4 ^ -1) < -101) {
                  return;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              var2 = -li.field_c + 32 * this.field_n - -(this.field_k / 10);
              var3 = -db.field_d + (this.field_p * 32 - -(this.field_f / 10));
              if (!je.c(this.field_n, this.field_p, 1, 1)) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L4;
              }
            }
            L5: {
              var4 = stackIn_15_0;
              var5 = (this.field_c & 63) / 16;
              if (-1 == (this.field_i ^ -1)) {
                var5 = 0;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (19 != this.field_h) {
                L7: {
                  var7 = 91 + this.field_j / 10 % 5;
                  if (0 > this.field_m) {
                    var7 = 59;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (this.field_m > 0) {
                    var7 = 60;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (-11 <= (this.field_m ^ -1)) {
                    break L9;
                  } else {
                    var7 = 61;
                    break L9;
                  }
                }
                var6 = pk.field_h[var7];
                break L6;
              } else {
                L10: {
                  if (var4 != 0) {
                    stackOut_21_0 = vc.field_o[var5 + 4];
                    stackIn_22_0 = stackOut_21_0;
                    break L10;
                  } else {
                    stackOut_20_0 = vc.field_o[var5 + 0];
                    stackIn_22_0 = stackOut_20_0;
                    break L10;
                  }
                }
                var16 = stackIn_22_0;
                var6 = var16;
                var3 = var3 + (-var16.field_A + 32);
                break L6;
              }
            }
            L11: {
              if (q.field_b[this.field_n][this.field_p].field_A) {
                L12: {
                  var3 += 8;
                  if (this.field_i < 0) {
                    var6.e().a(var2, 32 + var3 - var6.field_A, 9348351);
                    break L12;
                  } else {
                    var6.a(var2, 32 + var3 - var6.field_A, 9348351);
                    break L12;
                  }
                }
                var3 -= 8;
                break L11;
              } else {
                break L11;
              }
            }
            var7 = 4 * this.field_n - (-(this.field_k / 80) + 1);
            var8 = -1 + (this.field_f / 80 + this.field_p * 4);
            var11 = -68 % ((-35 - param0) / 44);
            var9 = -li.field_c + var7 * 8;
            var10 = var8 * 8 + -db.field_d;
            var12 = 0;
            L13: while (true) {
              if (-7 > (var12 ^ -1)) {
                eh.a();
                return;
              } else {
                var10 = -db.field_d + 8 * var8;
                var13 = var8;
                var14 = 0;
                L14: while (true) {
                  if (-6 > (var14 ^ -1)) {
                    var9 += 8;
                    var7++;
                    var12++;
                    continue L13;
                  } else {
                    if (je.field_O.a(var7, var13, (byte) 61)) {
                      eh.a(var9, var10, var9 + 8, var10 - -8);
                      if ((this.field_i ^ -1) > -1) {
                        var6.h(var2, var3);
                        var13++;
                        var10 += 8;
                        var14++;
                        continue L14;
                      } else {
                        var6.f(var2, var3);
                        var13++;
                        var10 += 8;
                        var14++;
                        continue L14;
                      }
                    } else {
                      var13++;
                      var10 += 8;
                      var14++;
                      continue L14;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ea var5_ref_ea = null;
        int var5 = 0;
        ea var6 = null;
        int var7 = 0;
        ea stackIn_40_0 = null;
        int stackIn_62_0 = 0;
        ea stackIn_67_0 = null;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        ea stackOut_66_0 = null;
        ea stackOut_65_0 = null;
        ea stackOut_39_0 = null;
        ea stackOut_38_0 = null;
        L0: {
          var7 = MinerDisturbance.field_ab;
          var2 = this.field_k / 10 + (this.field_n * 32 - li.field_c);
          var3 = -db.field_d + (32 * this.field_p + this.field_f / 10);
          if (!this.a((byte) 103)) {
            break L0;
          } else {
            mb.field_d[this.field_h].f(var2, var3);
            break L0;
          }
        }
        L1: {
          if (param0 == -12) {
            break L1;
          } else {
            this.b(false);
            break L1;
          }
        }
        L2: {
          if (17 == this.field_h) {
            te.field_d[0].c(-16 + var2, var3, 128);
            break L2;
          } else {
            if (6 != this.field_h) {
              L3: {
                if (this.field_h == 7) {
                  break L3;
                } else {
                  if (this.field_h == 15) {
                    break L3;
                  } else {
                    if (-19 == (this.field_h ^ -1)) {
                      break L3;
                    } else {
                      if ((this.field_h ^ -1) != -23) {
                        if (20 == this.field_h) {
                          if (this.field_g != 0) {
                            if (5 <= this.field_g) {
                              break L2;
                            } else {
                              hk.field_a[this.field_g].f(-16 + var2, var3);
                              break L2;
                            }
                          } else {
                            if ((this.field_b ^ -1) <= -251) {
                              g.field_j[4].f(var2, var3);
                              break L2;
                            } else {
                              g.field_j[5 * this.field_b / 250].f(var2, var3);
                              break L2;
                            }
                          }
                        } else {
                          if (-9 == (this.field_h ^ -1)) {
                            wj.field_k[this.field_g].f(-16 + var2, var3 - 48);
                            break L2;
                          } else {
                            if (9 != this.field_h) {
                              if (21 != this.field_h) {
                                if (-20 == (this.field_h ^ -1)) {
                                  L4: {
                                    if (!je.c(this.field_n, this.field_p, 1, 1)) {
                                      stackOut_61_0 = 0;
                                      stackIn_62_0 = stackOut_61_0;
                                      break L4;
                                    } else {
                                      stackOut_60_0 = 1;
                                      stackIn_62_0 = stackOut_60_0;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    var4 = stackIn_62_0;
                                    var5 = (this.field_c & 63) / 16;
                                    if (this.field_i != 0) {
                                      break L5;
                                    } else {
                                      var5 = 0;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (var4 != 0) {
                                      stackOut_66_0 = ph.field_e[var5 + 4];
                                      stackIn_67_0 = stackOut_66_0;
                                      break L6;
                                    } else {
                                      stackOut_65_0 = ph.field_e[var5 + 0];
                                      stackIn_67_0 = stackOut_65_0;
                                      break L6;
                                    }
                                  }
                                  var6 = stackIn_67_0;
                                  if (-1 < (this.field_i ^ -1)) {
                                    var6.h(var2, -var6.field_A + 32 + var3);
                                    break L2;
                                  } else {
                                    var6.f(var2, 32 + (var3 - var6.field_A));
                                    break L2;
                                  }
                                } else {
                                  if (10 != this.field_h) {
                                    if (12 > this.field_h) {
                                      break L2;
                                    } else {
                                      if ((this.field_h ^ -1) <= -17) {
                                        break L2;
                                      } else {
                                        L7: {
                                          var4 = q.field_b[this.field_n][this.field_p].field_i;
                                          if (0 <= var4) {
                                            break L7;
                                          } else {
                                            var4 = 0;
                                            break L7;
                                          }
                                        }
                                        L8: {
                                          if ((var4 ^ -1) < -256) {
                                            var4 = 255;
                                            break L8;
                                          } else {
                                            break L8;
                                          }
                                        }
                                        a.field_a[-12 + (this.field_h - -37)].c(var2, var3, var4);
                                        break L2;
                                      }
                                    }
                                  } else {
                                    if (q.field_b[this.field_n][this.field_p].field_i != 0) {
                                      break L2;
                                    } else {
                                      L9: {
                                        if (this.field_g == 1) {
                                          break L9;
                                        } else {
                                          if (this.field_b / 25 % 2 != 0) {
                                            break L2;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      if (q.field_b[this.field_n][this.field_p].field_V) {
                                        break L2;
                                      } else {
                                        a.field_a[62].f(var2, var3);
                                        break L2;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L10: {
                                  if (!je.c(this.field_n, this.field_p, 1, 1)) {
                                    stackOut_39_0 = fi.field_b[0];
                                    stackIn_40_0 = stackOut_39_0;
                                    break L10;
                                  } else {
                                    stackOut_38_0 = fi.field_b[1];
                                    stackIn_40_0 = stackOut_38_0;
                                    break L10;
                                  }
                                }
                                var5_ref_ea = stackIn_40_0;
                                if (0 > this.field_i) {
                                  var5_ref_ea.h(var2, -var5_ref_ea.field_A + (32 + var3));
                                  break L2;
                                } else {
                                  var5_ref_ea.f(var2, var3 + (32 + -var5_ref_ea.field_A));
                                  break L2;
                                }
                              }
                            } else {
                              L11: {
                                var4 = 91 + this.field_j / 10 % 5;
                                if (this.field_m >= 0) {
                                  break L11;
                                } else {
                                  var4 = 59;
                                  break L11;
                                }
                              }
                              L12: {
                                if (0 >= this.field_m) {
                                  break L12;
                                } else {
                                  var4 = 60;
                                  break L12;
                                }
                              }
                              L13: {
                                if (this.field_m > 10) {
                                  var4 = 61;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              if (0 <= this.field_i) {
                                a.field_a[var4].f(var2, var3);
                                break L2;
                              } else {
                                a.field_a[var4].h(var2, var3);
                                break L2;
                              }
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              if (0 != this.field_g) {
                te.field_d[4 + this.field_g].f(-16 + var2, var3);
                break L2;
              } else {
                if ((this.field_b ^ -1) > -251) {
                  ne.field_O[this.field_b * 5 / 250].f(var2, var3);
                  break L2;
                } else {
                  ne.field_O[4].f(var2, var3);
                  break L2;
                }
              }
            } else {
              if (-1 != (this.field_g ^ -1)) {
                te.field_d[4 + this.field_g].f(-16 + var2, var3);
                break L2;
              } else {
                if (!je.c(this.field_n, this.field_p, 3, 3)) {
                  if (-241 >= (this.field_b ^ -1)) {
                    te.field_d[1].f(-16 + var2, var3);
                    break L2;
                  } else {
                    te.field_d[0].f(-16 + var2, var3);
                    te.field_d[this.field_b / 10 % 3 - -2].f(-16 + var2 + -(3 * this.field_b / 250), this.field_b * 3 / 250 + var3);
                    break L2;
                  }
                } else {
                  te.field_d[0].c(var2 - 16, var3, 128);
                  break L2;
                }
              }
            }
          }
        }
    }

    final boolean a(boolean param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (!param0) {
          L0: {
            L1: {
              if (-10 == (this.field_h ^ -1)) {
                break L1;
              } else {
                if (19 == this.field_h) {
                  break L1;
                } else {
                  if ((this.field_h ^ -1) != -22) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    private final boolean a(byte param0) {
        if (param0 < 92) {
            this.field_f = -74;
        }
        return -7 < (this.field_h ^ -1) ? true : false;
    }

    private final void a(int param0, boolean param1) {
        int fieldTemp$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        L0: {
          var7 = MinerDisturbance.field_ab;
          this.field_j = this.field_j + 1;
          if (-101 <= (this.field_j ^ -1)) {
            break L0;
          } else {
            this.field_j = this.field_j - 100;
            break L0;
          }
        }
        L1: {
          if (!je.c(this.field_n, this.field_p, 1, 1)) {
            break L1;
          } else {
            if (q.field_b[this.field_n][this.field_p + 1].g()) {
              this.field_m = this.field_m - 40;
              break L1;
            } else {
              this.field_m = this.field_m - 20;
              break L1;
            }
          }
        }
        L2: {
          if (!q.field_b[1 + this.field_n][this.field_p].field_a) {
            break L2;
          } else {
            this.field_b = this.field_b + 1;
            if (-251 <= (this.field_b ^ -1)) {
              break L2;
            } else {
              L3: {
                if (100.0 * Math.random() >= 50.0) {
                  break L3;
                } else {
                  L4: {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (q.field_b[1 + this.field_n][1 + this.field_p].field_b) {
                      stackOut_11_0 = stackIn_11_0;
                      stackOut_11_1 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L4;
                    } else {
                      stackOut_10_0 = stackIn_10_0;
                      stackOut_10_1 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L4;
                    }
                  }
                  if (stackIn_12_0 != stackIn_12_1) {
                    break L3;
                  } else {
                    q.field_b[this.field_n - -1][1 + this.field_p].field_a = false;
                    uf.field_p[jf.b((byte) 97)] = new gf(this.field_n - -1, this.field_p - -1, 8);
                    break L3;
                  }
                }
              }
              L5: {
                if (100.0 * Math.random() >= 50.0) {
                  break L5;
                } else {
                  if (q.field_b[1 + this.field_n][this.field_p + -1].field_b) {
                    break L5;
                  } else {
                    q.field_b[1 + this.field_n][-1 + this.field_p].field_a = false;
                    uf.field_p[jf.b((byte) 59)] = new gf(this.field_n - -1, this.field_p + -1, 8);
                    break L5;
                  }
                }
              }
              if (100.0 * Math.random() < 50.0) {
                if ((this.field_n ^ -1) > -31) {
                  L6: {
                    stackOut_21_0 = 0;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (q.field_b[this.field_n - -1][this.field_p].field_b) {
                      stackOut_23_0 = stackIn_23_0;
                      stackOut_23_1 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      break L6;
                    } else {
                      stackOut_22_0 = stackIn_22_0;
                      stackOut_22_1 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      break L6;
                    }
                  }
                  if (stackIn_24_0 == stackIn_24_1) {
                    this.field_m = -40;
                    break L2;
                  } else {
                    q.field_b[1 + this.field_n][this.field_p].field_a = false;
                    uf.field_p[jf.b((byte) 95)] = new gf(this.field_n - -1, this.field_p, 8);
                    break L2;
                  }
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
          }
        }
        L7: {
          if (q.field_b[this.field_n + -1][this.field_p].field_a) {
            this.field_b = this.field_b + 1;
            if ((this.field_b ^ -1) < -251) {
              L8: {
                if (50.0 <= 100.0 * Math.random()) {
                  break L8;
                } else {
                  if (!q.field_b[-1 + this.field_n][this.field_p - -1].field_b) {
                    q.field_b[this.field_n - 1][1 + this.field_p].field_a = false;
                    uf.field_p[jf.b((byte) 114)] = new gf(this.field_n + 1, this.field_p - -1, 8);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (50.0 <= Math.random() * 100.0) {
                  break L9;
                } else {
                  if (!q.field_b[this.field_n + -1][this.field_p - 1].field_b) {
                    q.field_b[this.field_n - 1][this.field_p - 1].field_a = false;
                    uf.field_p[jf.b((byte) 76)] = new gf(1 + this.field_n, this.field_p - 1, 8);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              if (50.0 > 100.0 * Math.random()) {
                if ((this.field_n ^ -1) < -2) {
                  if (q.field_b[this.field_n - 1][this.field_p].field_b) {
                    this.field_m = -40;
                    break L7;
                  } else {
                    q.field_b[-1 + this.field_n][this.field_p].field_a = false;
                    uf.field_p[jf.b((byte) 64)] = new gf(this.field_n + -1, this.field_p, 8);
                    break L7;
                  }
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            } else {
              break L7;
            }
          } else {
            break L7;
          }
        }
        L10: {
          if ((this.field_b ^ -1) >= -251) {
            break L10;
          } else {
            L11: {
              if (!q.field_b[this.field_n][this.field_p - -1].field_a) {
                if ((this.field_k ^ -1) < -21) {
                  this.field_k = this.field_k - 10;
                  break L11;
                } else {
                  if (this.field_k >= -20) {
                    break L11;
                  } else {
                    this.field_k = this.field_k + 10;
                    break L11;
                  }
                }
              } else {
                break L11;
              }
            }
            this.field_b = this.field_b - 250;
            break L10;
          }
        }
        L12: {
          fieldTemp$1 = this.field_o;
          this.field_o = this.field_o + 1;
          if (600 < fieldTemp$1) {
            if ((q.field_b[this.field_n][this.field_p].field_i ^ -1) > -121) {
              var3 = 0;
              var4 = 0;
              L13: while (true) {
                L14: {
                  if (var4 >= uf.field_p.length) {
                    break L14;
                  } else {
                    if (null != uf.field_p[var4]) {
                      if ((uf.field_p[var4].field_h ^ -1) == -11) {
                        var5 = -this.field_n + uf.field_p[var4].field_n;
                        var6 = uf.field_p[var4].field_p + -this.field_p;
                        if (-37 < (var5 * var5 + var6 * var6 ^ -1)) {
                          uf.field_p[var4].field_n = this.field_n;
                          uf.field_p[var4].field_p = this.field_p;
                          var3 = 1;
                          break L14;
                        } else {
                          var4++;
                          continue L13;
                        }
                      } else {
                        var4++;
                        continue L13;
                      }
                    } else {
                      var4++;
                      continue L13;
                    }
                  }
                }
                L15: {
                  if (var3 != 0) {
                    break L15;
                  } else {
                    uf.field_p[jf.b((byte) 117)] = new gf(this.field_n, this.field_p, 10);
                    break L15;
                  }
                }
                this.field_o = 0;
                break L12;
              }
            } else {
              break L12;
            }
          } else {
            break L12;
          }
        }
        L16: {
          if (-121 > (q.field_b[this.field_n][this.field_p].field_i ^ -1)) {
            L17: {
              if (ca.field_k > this.field_n) {
                if ((this.field_i ^ -1) > -41) {
                  this.field_i = this.field_i + 2;
                  if (hf.field_t >= this.field_p) {
                    break L17;
                  } else {
                    if (!param1) {
                      break L17;
                    } else {
                      this.field_m = -40;
                      break L17;
                    }
                  }
                } else {
                  if (hf.field_t >= this.field_p) {
                    break L17;
                  } else {
                    if (!param1) {
                      break L17;
                    } else {
                      this.field_m = -40;
                      break L17;
                    }
                  }
                }
              } else {
                if (hf.field_t >= this.field_p) {
                  break L17;
                } else {
                  if (!param1) {
                    break L17;
                  } else {
                    this.field_m = -40;
                    break L17;
                  }
                }
              }
            }
            L18: {
              if (this.field_n <= ca.field_k) {
                if (!sc.field_b) {
                  break L18;
                } else {
                  if (!q.field_b[this.field_n][this.field_p].field_V) {
                    break L18;
                  } else {
                    ag.a(true, 1, 32 * this.field_p, 32 * this.field_n);
                    break L18;
                  }
                }
              } else {
                if (!sc.field_b) {
                  break L18;
                } else {
                  if (!q.field_b[this.field_n][this.field_p].field_V) {
                    break L18;
                  } else {
                    ag.a(true, 1, 32 * this.field_p, 32 * this.field_n);
                    break L18;
                  }
                }
              }
            }
            if (ca.field_k != this.field_n) {
              break L16;
            } else {
              if (this.field_p != hf.field_t) {
                break L16;
              } else {
                if (il.e(param0 ^ -10296)) {
                  break L16;
                } else {
                  rj.a((byte) -38, 7);
                  break L16;
                }
              }
            }
          } else {
            if (this.field_g != 0) {
              L19: {
                if (-10 < this.field_i) {
                  this.field_i = this.field_i - 2;
                  break L19;
                } else {
                  break L19;
                }
              }
              if (q.field_b[-1 + this.field_n][this.field_p].field_a) {
                this.field_g = 0;
                break L16;
              } else {
                break L16;
              }
            } else {
              L20: {
                if (10 > this.field_i) {
                  this.field_i = this.field_i + 2;
                  break L20;
                } else {
                  break L20;
                }
              }
              if (q.field_b[1 + this.field_n][this.field_p].field_a) {
                this.field_g = 1;
                break L16;
              } else {
                break L16;
              }
            }
          }
        }
        if (param0 == 21161) {
          L21: {
            L22: {
              if (q.field_b[this.field_n][this.field_p].field_a) {
                break L22;
              } else {
                if (!je.field_O.b(this.field_n, this.field_p, (byte) 50)) {
                  if (-1 <= (je.e(this.field_n, this.field_p, 1, 1) ^ -1)) {
                    break L21;
                  } else {
                    this.field_b = 0;
                    this.field_h = 8;
                    this.field_g = 0;
                    break L21;
                  }
                } else {
                  break L22;
                }
              }
            }
            this.field_b = 250;
            this.field_h = 16;
            this.field_g = 0;
            break L21;
          }
          L23: {
            if (39 < (this.field_m ^ -1)) {
              this.field_m = -40;
              break L23;
            } else {
              break L23;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void c(boolean param0) {
        int fieldTemp$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        double var8 = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_7_0 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_111_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_109_0 = 0;
        L0: {
          var11 = MinerDisturbance.field_ab;
          this.field_c = this.field_c + 1;
          if (!sc.field_b) {
            break L0;
          } else {
            if (q.field_b[this.field_n][this.field_p].field_V) {
              ag.a(true, 32, this.field_p * 32, 32 * this.field_n);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (120 >= q.field_b[this.field_n][this.field_p].field_i) {
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          } else {
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L1;
          }
        }
        L2: {
          var2 = stackIn_7_0;
          if (-33 <= (this.field_l ^ -1)) {
            break L2;
          } else {
            L3: {
              L4: {
                if (var2 == 0) {
                  break L4;
                } else {
                  if (!this.field_e) {
                    ne.a(44, 58);
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (var2 != 0) {
                break L3;
              } else {
                if (!this.field_e) {
                  break L3;
                } else {
                  ne.a(45, 69);
                  break L3;
                }
              }
            }
            this.field_l = 0;
            break L2;
          }
        }
        L5: {
          stackOut_16_0 = this;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if (var2 == 0) {
            stackOut_18_0 = this;
            stackOut_18_1 = 0;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L5;
          } else {
            stackOut_17_0 = this;
            stackOut_17_1 = 1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L5;
          }
        }
        L6: {
          ((gf) (this)).field_e = stackIn_19_1 != 0;
          if (var2 != 0) {
            if (this.field_p < hf.field_t) {
              stackOut_23_0 = 1;
              stackIn_25_0 = stackOut_23_0;
              break L6;
            } else {
              stackOut_22_0 = 0;
              stackIn_25_0 = stackOut_22_0;
              break L6;
            }
          } else {
            stackOut_20_0 = 0;
            stackIn_25_0 = stackOut_20_0;
            break L6;
          }
        }
        L7: {
          var3 = stackIn_25_0;
          if (q.field_b[this.field_n - -1][this.field_p].field_a) {
            this.field_b = this.field_b + 1;
            if (-151 <= (this.field_b ^ -1)) {
              break L7;
            } else {
              if (50.0 > Math.random() * 100.0) {
                if (-31 >= (this.field_n ^ -1)) {
                  break L7;
                } else {
                  if (q.field_b[1 + this.field_n][this.field_p].field_b) {
                    break L7;
                  } else {
                    q.field_b[1 + this.field_n][this.field_p].field_a = false;
                    uf.field_p[jf.b((byte) 71)] = new gf(this.field_n + 1, this.field_p, 8);
                    break L7;
                  }
                }
              } else {
                break L7;
              }
            }
          } else {
            if (var3 == 0) {
              break L7;
            } else {
              if (q.field_b[this.field_n + 1][1 + this.field_p].field_a) {
                this.field_b = this.field_b + 1;
                if (150 >= this.field_b) {
                  break L7;
                } else {
                  if (50.0 <= Math.random() * 100.0) {
                    break L7;
                  } else {
                    if (this.field_n >= 30) {
                      break L7;
                    } else {
                      L8: {
                        stackOut_32_0 = 1;
                        stackIn_34_0 = stackOut_32_0;
                        stackIn_33_0 = stackOut_32_0;
                        if (q.field_b[this.field_n + 1][1 + this.field_p].field_b) {
                          stackOut_34_0 = stackIn_34_0;
                          stackOut_34_1 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          stackIn_35_1 = stackOut_34_1;
                          break L8;
                        } else {
                          stackOut_33_0 = stackIn_33_0;
                          stackOut_33_1 = 1;
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_35_1 = stackOut_33_1;
                          break L8;
                        }
                      }
                      if (stackIn_35_0 != stackIn_35_1) {
                        break L7;
                      } else {
                        q.field_b[1 + this.field_n][this.field_p - -1].field_a = false;
                        uf.field_p[jf.b((byte) 95)] = new gf(this.field_n - -1, this.field_p - -1, 8);
                        break L7;
                      }
                    }
                  }
                }
              } else {
                break L7;
              }
            }
          }
        }
        L9: {
          if (q.field_b[-1 + this.field_n][this.field_p].field_a) {
            this.field_b = this.field_b + 1;
            if (this.field_b > 150) {
              if (50.0 > Math.random() * 100.0) {
                if ((this.field_n ^ -1) < -2) {
                  if (q.field_b[-1 + this.field_n][this.field_p].field_b) {
                    break L9;
                  } else {
                    q.field_b[-1 + this.field_n][this.field_p].field_a = false;
                    uf.field_p[jf.b((byte) 63)] = new gf(this.field_n - 1, this.field_p, 8);
                    break L9;
                  }
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            } else {
              break L9;
            }
          } else {
            if (var3 == 0) {
              break L9;
            } else {
              if (!q.field_b[this.field_n + -1][this.field_p + 1].field_a) {
                break L9;
              } else {
                this.field_b = this.field_b + 1;
                if (150 < this.field_b) {
                  if (50.0 <= Math.random() * 100.0) {
                    break L9;
                  } else {
                    if (this.field_n >= 30) {
                      break L9;
                    } else {
                      if (q.field_b[this.field_n + -1][1 + this.field_p].field_b) {
                        break L9;
                      } else {
                        q.field_b[this.field_n - 1][1 + this.field_p].field_a = false;
                        uf.field_p[jf.b((byte) 111)] = new gf(-1 + this.field_n, 1 + this.field_p, 8);
                        break L9;
                      }
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
          }
        }
        L10: {
          if ((this.field_b ^ -1) >= -151) {
            break L10;
          } else {
            L11: {
              if (!q.field_b[this.field_n][this.field_p + 1].field_a) {
                if ((this.field_k ^ -1) < -21) {
                  this.field_k = this.field_k - 10;
                  break L11;
                } else {
                  if (19 < (this.field_k ^ -1)) {
                    this.field_k = this.field_k + 10;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              } else {
                break L11;
              }
            }
            this.field_b = this.field_b - 150;
            break L10;
          }
        }
        L12: {
          fieldTemp$1 = this.field_o;
          this.field_o = this.field_o + 1;
          if (-601 > (fieldTemp$1 ^ -1)) {
            if (q.field_b[this.field_n][this.field_p].field_i < 120) {
              var4 = 0;
              var5 = 0;
              L13: while (true) {
                L14: {
                  if (var5 >= uf.field_p.length) {
                    break L14;
                  } else {
                    if (null != uf.field_p[var5]) {
                      if (10 == uf.field_p[var5].field_h) {
                        var6 = uf.field_p[var5].field_n - this.field_n;
                        var7 = uf.field_p[var5].field_p - this.field_p;
                        if (-37 < (var6 * var6 - -(var7 * var7) ^ -1)) {
                          uf.field_p[var5].field_n = this.field_n;
                          var4 = 1;
                          uf.field_p[var5].field_p = this.field_p;
                          break L14;
                        } else {
                          var5++;
                          continue L13;
                        }
                      } else {
                        var5++;
                        continue L13;
                      }
                    } else {
                      var5++;
                      continue L13;
                    }
                  }
                }
                L15: {
                  if (var4 == 0) {
                    uf.field_p[jf.b((byte) 93)] = new gf(this.field_n, this.field_p, 10);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                this.field_o = 0;
                break L12;
              }
            } else {
              break L12;
            }
          } else {
            break L12;
          }
        }
        L16: {
          var4 = 40;
          var5 = 2;
          if (!je.c(this.field_n, this.field_p, 1, 2)) {
            stackOut_89_0 = 0;
            stackIn_90_0 = stackOut_89_0;
            break L16;
          } else {
            stackOut_88_0 = 1;
            stackIn_90_0 = stackOut_88_0;
            break L16;
          }
        }
        L17: {
          var6 = stackIn_90_0;
          if (var6 == 0) {
            var4 = 6;
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          if (!je.c(this.field_n, this.field_p + -1, 1, 1)) {
            stackOut_95_0 = 0;
            stackIn_96_0 = stackOut_95_0;
            break L18;
          } else {
            stackOut_94_0 = 1;
            stackIn_96_0 = stackOut_94_0;
            break L18;
          }
        }
        var7 = stackIn_96_0;
        if (param0) {
          L19: {
            if (var2 == 0) {
              L20: {
                if (0 == this.field_g) {
                  L21: {
                    if (-11 < (this.field_i ^ -1)) {
                      this.field_i = this.field_i + var5;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (q.field_b[this.field_n + 1][this.field_p].field_a) {
                      break L22;
                    } else {
                      if (q.field_b[1 + this.field_n][this.field_p].field_b) {
                        break L22;
                      } else {
                        break L20;
                      }
                    }
                  }
                  this.field_g = 1;
                  break L20;
                } else {
                  L23: {
                    if (-10 < this.field_i) {
                      this.field_i = this.field_i - var5;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (q.field_b[-1 + this.field_n][this.field_p].field_a) {
                      break L24;
                    } else {
                      if (!q.field_b[this.field_n + -1][this.field_p].field_b) {
                        break L20;
                      } else {
                        break L24;
                      }
                    }
                  }
                  this.field_g = 0;
                  break L20;
                }
              }
              if (var6 == 0) {
                break L19;
              } else {
                var8 = Math.sin((double)(100 * this.field_c));
                if (0.0 < var8) {
                  L25: {
                    if (-var4 < this.field_m) {
                      this.field_m = this.field_m - 1;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  if (var7 == 0) {
                    this.field_m = 0;
                    break L19;
                  } else {
                    break L19;
                  }
                } else {
                  if (var4 <= this.field_m) {
                    break L19;
                  } else {
                    this.field_m = this.field_m + 1;
                    break L19;
                  }
                }
              }
            } else {
              L26: {
                if (-1 + this.field_p > hf.field_t) {
                  if (var6 == 0) {
                    stackOut_103_0 = 1;
                    stackIn_105_0 = stackOut_103_0;
                    break L26;
                  } else {
                    stackOut_102_0 = 0;
                    stackIn_105_0 = stackOut_102_0;
                    break L26;
                  }
                } else {
                  stackOut_100_0 = 0;
                  stackIn_105_0 = stackOut_100_0;
                  break L26;
                }
              }
              L27: {
                var8_int = stackIn_105_0;
                if (3 <= Math.abs(ca.field_k + -this.field_n)) {
                  stackOut_107_0 = 0;
                  stackIn_108_0 = stackOut_107_0;
                  break L27;
                } else {
                  stackOut_106_0 = 1;
                  stackIn_108_0 = stackOut_106_0;
                  break L27;
                }
              }
              L28: {
                var9 = stackIn_108_0;
                if (-6 < (Math.abs(ca.field_k + -this.field_n) ^ -1)) {
                  stackOut_110_0 = 0;
                  stackIn_111_0 = stackOut_110_0;
                  break L28;
                } else {
                  stackOut_109_0 = 1;
                  stackIn_111_0 = stackOut_109_0;
                  break L28;
                }
              }
              L29: {
                var10 = stackIn_111_0;
                if (ca.field_k <= this.field_n) {
                  break L29;
                } else {
                  if (this.field_i >= var4) {
                    break L29;
                  } else {
                    if (var8_int == 0) {
                      this.field_i = this.field_i + var5;
                      break L29;
                    } else {
                      if (var9 != 0) {
                        this.field_i = this.field_i - var5;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                  }
                }
              }
              L30: {
                if (this.field_n <= ca.field_k) {
                  break L30;
                } else {
                  if (this.field_i <= -var4) {
                    break L30;
                  } else {
                    if (var8_int != 0) {
                      if (var9 != 0) {
                        this.field_i = this.field_i + var5;
                        break L30;
                      } else {
                        break L30;
                      }
                    } else {
                      this.field_i = this.field_i - var5;
                      break L30;
                    }
                  }
                }
              }
              L31: {
                if (var8_int == 0) {
                  break L31;
                } else {
                  if (this.field_i == 0) {
                    L32: {
                      if (var10 != 0) {
                        L33: {
                          if (this.field_n <= ca.field_k) {
                            break L33;
                          } else {
                            if (-var4 >= this.field_i) {
                              break L33;
                            } else {
                              this.field_i = this.field_i - var5;
                              break L33;
                            }
                          }
                        }
                        if (ca.field_k <= this.field_n) {
                          break L32;
                        } else {
                          if (this.field_i < var4) {
                            this.field_i = this.field_i + var5;
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                      } else {
                        break L32;
                      }
                    }
                    if (var9 != 0) {
                      if (ca.field_k < this.field_n) {
                        if (this.field_i < var4) {
                          this.field_i = this.field_i + var5;
                          if (this.field_n >= ca.field_k) {
                            break L31;
                          } else {
                            if (-var4 >= this.field_i) {
                              break L31;
                            } else {
                              this.field_i = this.field_i - var5;
                              break L31;
                            }
                          }
                        } else {
                          if (this.field_n >= ca.field_k) {
                            break L31;
                          } else {
                            if (-var4 >= this.field_i) {
                              break L31;
                            } else {
                              this.field_i = this.field_i - var5;
                              break L31;
                            }
                          }
                        }
                      } else {
                        if (this.field_n >= ca.field_k) {
                          break L31;
                        } else {
                          if (-var4 >= this.field_i) {
                            break L31;
                          } else {
                            this.field_i = this.field_i - var5;
                            break L31;
                          }
                        }
                      }
                    } else {
                      break L31;
                    }
                  } else {
                    break L31;
                  }
                }
              }
              L34: {
                if (-var4 > this.field_i) {
                  this.field_i = -var4;
                  break L34;
                } else {
                  break L34;
                }
              }
              L35: {
                if (var4 >= this.field_i) {
                  break L35;
                } else {
                  this.field_i = var4;
                  break L35;
                }
              }
              L36: {
                if (hf.field_t >= this.field_p) {
                  break L36;
                } else {
                  if (var6 == 0) {
                    break L36;
                  } else {
                    if (this.field_m <= -var4) {
                      break L36;
                    } else {
                      this.field_m = this.field_m - 1;
                      if (var7 == 0) {
                        L37: {
                          if ((-hf.field_t + this.field_p ^ -1) < -3) {
                            break L37;
                          } else {
                            if ((Math.abs(ca.field_k - this.field_n) ^ -1) < -4) {
                              break L37;
                            } else {
                              this.field_m = 3 * -var4 / 2;
                              break L36;
                            }
                          }
                        }
                        this.field_m = 0;
                        break L36;
                      } else {
                        break L36;
                      }
                    }
                  }
                }
              }
              L38: {
                if (this.field_m < -var4 * 4) {
                  this.field_m = 4 * -var4;
                  break L38;
                } else {
                  break L38;
                }
              }
              L39: {
                if (hf.field_t <= this.field_p) {
                  if (sc.field_b) {
                    if (!q.field_b[this.field_n][this.field_p].field_V) {
                      break L39;
                    } else {
                      ag.a(true, 32, this.field_p * 32, 32 * this.field_n);
                      break L39;
                    }
                  } else {
                    if (!sc.field_b) {
                      break L39;
                    } else {
                      if (!q.field_b[this.field_n][this.field_p].field_V) {
                        break L39;
                      } else {
                        ag.a(true, 32, this.field_p * 32, 32 * this.field_n);
                        break L39;
                      }
                    }
                  }
                } else {
                  if (!sc.field_b) {
                    break L39;
                  } else {
                    if (!q.field_b[this.field_n][this.field_p].field_V) {
                      break L39;
                    } else {
                      ag.a(true, 32, this.field_p * 32, 32 * this.field_n);
                      break L39;
                    }
                  }
                }
              }
              if (this.field_n != ca.field_k) {
                break L19;
              } else {
                if (hf.field_t != this.field_p) {
                  break L19;
                } else {
                  if (il.e(-31391)) {
                    break L19;
                  } else {
                    rj.a((byte) -38, 10);
                    break L19;
                  }
                }
              }
            }
          }
          L40: {
            L41: {
              if (q.field_b[this.field_n][this.field_p].field_a) {
                break L41;
              } else {
                if (je.field_O.b(this.field_n, this.field_p, (byte) 120)) {
                  break L41;
                } else {
                  break L40;
                }
              }
            }
            hn.field_c = true;
            this.field_h = 16;
            this.field_b = 250;
            this.field_g = 0;
            break L40;
          }
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 >= -90) {
            return;
        }
        field_a = null;
    }

    final gf d(boolean param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gf var8_ref_gf = null;
        int var9 = 0;
        je var9_ref_je = null;
        int var10 = 0;
        double var11_double = 0.0;
        int var11_int = 0;
        je var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        gf stackIn_30_0 = null;
        gf stackIn_31_0 = null;
        gf stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_183_0 = 0;
        int stackIn_236_0 = 0;
        Object stackIn_243_0 = null;
        Object stackIn_244_0 = null;
        Object stackIn_245_0 = null;
        int stackIn_245_1 = 0;
        int stackIn_248_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_260_0 = 0;
        int stackIn_263_0 = 0;
        je stackIn_458_0 = null;
        je stackIn_459_0 = null;
        je stackIn_460_0 = null;
        int stackIn_460_1 = 0;
        gf stackIn_593_0 = null;
        gf stackIn_594_0 = null;
        gf stackIn_595_0 = null;
        int stackIn_595_1 = 0;
        gf stackOut_29_0 = null;
        gf stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        gf stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_182_0 = 0;
        int stackOut_181_0 = 0;
        int stackOut_234_0 = 0;
        int stackOut_233_0 = 0;
        int stackOut_231_0 = 0;
        Object stackOut_242_0 = null;
        Object stackOut_244_0 = null;
        int stackOut_244_1 = 0;
        Object stackOut_243_0 = null;
        int stackOut_243_1 = 0;
        int stackOut_247_0 = 0;
        int stackOut_246_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_249_0 = 0;
        int stackOut_258_0 = 0;
        int stackOut_257_0 = 0;
        int stackOut_255_0 = 0;
        int stackOut_262_0 = 0;
        int stackOut_261_0 = 0;
        je stackOut_457_0 = null;
        je stackOut_459_0 = null;
        int stackOut_459_1 = 0;
        je stackOut_458_0 = null;
        int stackOut_458_1 = 0;
        gf stackOut_592_0 = null;
        gf stackOut_594_0 = null;
        int stackOut_594_1 = 0;
        gf stackOut_593_0 = null;
        int stackOut_593_1 = 0;
        var16 = MinerDisturbance.field_ab;
        if (-2 >= (this.field_n ^ -1)) {
          if (31 > this.field_n) {
            if (-2 >= (this.field_p ^ -1)) {
              if (je.field_t - 1 > this.field_p) {
                L0: {
                  this.field_l = this.field_l + 1;
                  this.field_c = this.field_c + 1;
                  var2 = 0;
                  if (8 != this.field_h) {
                    break L0;
                  } else {
                    this.field_b = this.field_b + 1;
                    if ((this.field_b ^ -1) >= -6) {
                      break L0;
                    } else {
                      this.field_g = this.field_g + 1;
                      this.field_b = 0;
                      if (3 >= this.field_g) {
                        break L0;
                      } else {
                        return null;
                      }
                    }
                  }
                }
                L1: {
                  if ((this.field_h ^ -1) != -12) {
                    break L1;
                  } else {
                    this.field_b = 0;
                    var3 = 0;
                    L2: while (true) {
                      if (var3 != 0) {
                        L3: {
                          if (0 <= this.field_g) {
                            this.field_h = 6;
                            this.field_b = 250;
                            break L3;
                          } else {
                            this.field_b = 0;
                            this.field_h = 8;
                            break L3;
                          }
                        }
                        this.field_g = 0;
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            this.field_n = this.field_n + this.field_i;
                            this.field_b = this.field_b + 1;
                            if ((this.field_n ^ -1) >= -1) {
                              break L5;
                            } else {
                              if (-32 >= (this.field_n ^ -1)) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var3 = 1;
                          break L4;
                        }
                        L6: {
                          if (!je.field_I[this.field_n][this.field_p].field_a) {
                            break L6;
                          } else {
                            var3 = 1;
                            break L6;
                          }
                        }
                        L7: {
                          if (this.field_b <= 6) {
                            break L7;
                          } else {
                            var3 = 1;
                            break L7;
                          }
                        }
                        if (0 <= this.field_g) {
                          var4 = 0;
                          L8: while (true) {
                            if ((var4 ^ -1) <= -1001) {
                              continue L2;
                            } else {
                              if (null != uf.field_p[var4]) {
                                L9: {
                                  stackOut_29_0 = uf.field_p[var4];
                                  stackIn_31_0 = stackOut_29_0;
                                  stackIn_30_0 = stackOut_29_0;
                                  if (param0) {
                                    stackOut_31_0 = (gf) ((Object) stackIn_31_0);
                                    stackOut_31_1 = 0;
                                    stackIn_32_0 = stackOut_31_0;
                                    stackIn_32_1 = stackOut_31_1;
                                    break L9;
                                  } else {
                                    stackOut_30_0 = (gf) ((Object) stackIn_30_0);
                                    stackOut_30_1 = 1;
                                    stackIn_32_0 = stackOut_30_0;
                                    stackIn_32_1 = stackOut_30_1;
                                    break L9;
                                  }
                                }
                                if (((gf) (Object) stackIn_32_0).a(stackIn_32_1 != 0)) {
                                  if (uf.field_p[var4].field_n >= this.field_n + -1) {
                                    if (this.field_p - 1 <= uf.field_p[var4].field_p) {
                                      if (uf.field_p[var4].field_n <= 1 + this.field_n) {
                                        if (this.field_p - -1 >= uf.field_p[var4].field_p) {
                                          L10: {
                                            var3 = 1;
                                            if (-20 == (uf.field_p[var4].field_h ^ -1)) {
                                              hn.field_c = true;
                                              break L10;
                                            } else {
                                              break L10;
                                            }
                                          }
                                          uf.field_p[var4].field_h = 6;
                                          uf.field_p[var4].field_b = 250;
                                          var4++;
                                          continue L8;
                                        } else {
                                          var4++;
                                          continue L8;
                                        }
                                      } else {
                                        var4++;
                                        continue L8;
                                      }
                                    } else {
                                      var4++;
                                      continue L8;
                                    }
                                  } else {
                                    var4++;
                                    continue L8;
                                  }
                                } else {
                                  var4++;
                                  continue L8;
                                }
                              } else {
                                var4++;
                                continue L8;
                              }
                            }
                          }
                        } else {
                          continue L2;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (-1 < (this.field_f ^ -1)) {
                    break L11;
                  } else {
                    if (this.field_m >= 0) {
                      L12: {
                        if (!q.field_b[this.field_n][this.field_p + 1].g()) {
                          break L12;
                        } else {
                          var2 = 1;
                          break L12;
                        }
                      }
                      L13: {
                        if (-80 <= this.field_k) {
                          break L13;
                        } else {
                          if (!q.field_b[-1 + this.field_n][this.field_p + 1].g()) {
                            break L13;
                          } else {
                            var2 = 1;
                            break L13;
                          }
                        }
                      }
                      if (this.field_k <= 80) {
                        break L11;
                      } else {
                        if (q.field_b[this.field_n + 1][this.field_p + 1].g()) {
                          var2 = 1;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                L14: {
                  L15: {
                    var3 = ne.a(false);
                    if (this.a((byte) 122)) {
                      break L15;
                    } else {
                      if (-13 < (this.field_h ^ -1)) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  if ((this.field_h ^ -1) <= -16) {
                    break L14;
                  } else {
                    L16: {
                      if (12 > this.field_h) {
                        break L16;
                      } else {
                        if (15 == this.field_h) {
                          break L16;
                        } else {
                          if (!ni.a(13, 11764)) {
                            var4 = -this.field_n + ca.field_k;
                            var5 = -this.field_p + hf.field_t;
                            if ((var4 * var4 + var5 * var5 ^ -1) > -26) {
                              ag.a(true, 13, 32 * this.field_p, this.field_n * 32);
                              break L16;
                            } else {
                              break L16;
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    if (this.field_n != ca.field_k) {
                      break L14;
                    } else {
                      if (hf.field_t != this.field_p) {
                        break L14;
                      } else {
                        cl.field_I = 0;
                        if (!this.a((byte) 125)) {
                          L17: {
                            qf.field_p = qf.field_p + 1;
                            if (!ke.field_V) {
                              break L17;
                            } else {
                              if (qf.field_p == 5) {
                                fn.a(9, 246, 3);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L18: {
                            this.field_h = 4;
                            if (-2 != (cm.field_o ^ -1)) {
                              stackOut_182_0 = 0;
                              stackIn_183_0 = stackOut_182_0;
                              break L18;
                            } else {
                              stackOut_181_0 = 1;
                              stackIn_183_0 = stackOut_181_0;
                              break L18;
                            }
                          }
                          var4 = stackIn_183_0;
                          var5 = 0;
                          L19: while (true) {
                            if ((var5 ^ -1) <= -22) {
                              return (gf) (this);
                            } else {
                              L20: {
                                if (var4 != 0) {
                                  break L20;
                                } else {
                                  if (!fd.field_mb[var5]) {
                                    break L20;
                                  } else {
                                    var5++;
                                    continue L19;
                                  }
                                }
                              }
                              if (var5 != 10) {
                                if (12 != var5) {
                                  if (var5 != 13) {
                                    L21: {
                                      if (-2 != (var5 ^ -1)) {
                                        break L21;
                                      } else {
                                        if (qe.field_b[0]) {
                                          break L21;
                                        } else {
                                          var5++;
                                          continue L19;
                                        }
                                      }
                                    }
                                    L22: {
                                      if (var5 != 19) {
                                        break L22;
                                      } else {
                                        if (qe.field_b[2]) {
                                          break L22;
                                        } else {
                                          var5++;
                                          continue L19;
                                        }
                                      }
                                    }
                                    L23: {
                                      if (-1 != (var5 ^ -1)) {
                                        break L23;
                                      } else {
                                        if (!qe.field_b[1]) {
                                          break L23;
                                        } else {
                                          var5++;
                                          continue L19;
                                        }
                                      }
                                    }
                                    L24: {
                                      if (-3 != (var5 ^ -1)) {
                                        break L24;
                                      } else {
                                        if (!qe.field_b[19]) {
                                          break L24;
                                        } else {
                                          var5++;
                                          continue L19;
                                        }
                                      }
                                    }
                                    if (!qe.field_b[var5]) {
                                      if (100.0 * Math.random() < 25.0) {
                                        qe.field_b[var5] = true;
                                        bf.field_d = 0;
                                        ch.field_h = -var5 * 3 + -3;
                                        pa.field_c = var5;
                                        return null;
                                      } else {
                                        var5++;
                                        continue L19;
                                      }
                                    } else {
                                      var5++;
                                      continue L19;
                                    }
                                  } else {
                                    var5++;
                                    continue L19;
                                  }
                                } else {
                                  var5++;
                                  continue L19;
                                }
                              } else {
                                var5++;
                                continue L19;
                              }
                            }
                          }
                        } else {
                          L25: {
                            if (0 < (ch.field_h ^ -1)) {
                              break L25;
                            } else {
                              ch.field_h = this.field_h;
                              break L25;
                            }
                          }
                          L26: {
                            var4 = 0;
                            if (0 == this.field_h) {
                              ne.a(12, 91);
                              var4 = var3 * 100;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          L27: {
                            if ((this.field_h ^ -1) == -2) {
                              var4 = 250 * var3;
                              ne.a(13, -124);
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          L28: {
                            if (2 != this.field_h) {
                              break L28;
                            } else {
                              var4 = 500 * var3;
                              ne.a(14, -77);
                              break L28;
                            }
                          }
                          L29: {
                            if (this.field_h == 3) {
                              ne.a(15, 98);
                              var4 = var3 * 750;
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                          L30: {
                            if (-5 == (this.field_h ^ -1)) {
                              var4 = var3 * 2500;
                              ne.a(16, -69);
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          L31: {
                            if (this.field_h == 5) {
                              ne.a(61, -69);
                              var4 = var3 * 1000;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          L32: {
                            if (!ke.field_V) {
                              break L32;
                            } else {
                              L33: {
                                if (tc.field_s > 0) {
                                  eb.field_b = eb.field_b + var4;
                                  if (eb.field_b <= 100000) {
                                    break L33;
                                  } else {
                                    if (-2 != (cm.field_o ^ -1)) {
                                      break L33;
                                    } else {
                                      fn.a(19, 236, 3);
                                      break L33;
                                    }
                                  }
                                } else {
                                  break L33;
                                }
                              }
                              L34: {
                                if (!hn.field_c) {
                                  eb.field_e = eb.field_e + var4;
                                  if ((eb.field_e ^ -1) >= -100001) {
                                    break L34;
                                  } else {
                                    if (1 == cm.field_o) {
                                      fn.a(21, 234, 3);
                                      break L34;
                                    } else {
                                      break L34;
                                    }
                                  }
                                } else {
                                  break L34;
                                }
                              }
                              L35: {
                                a.field_c = a.field_c + var4;
                                if (6 == var3) {
                                  break L35;
                                } else {
                                  if (3 == var3) {
                                    break L35;
                                  } else {
                                    if (-3 == (var3 ^ -1)) {
                                      break L35;
                                    } else {
                                      if (1 != var3) {
                                        break L32;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                }
                              }
                              var5 = var4;
                              var6 = rg.field_sb % 3;
                              if (var6 != 0) {
                                if (1 == var6) {
                                  vh.field_g = vh.field_g - var5;
                                  break L32;
                                } else {
                                  var7 = var5 / 3;
                                  di.field_X = di.field_X + var7;
                                  vh.field_g = vh.field_g - (var5 - var7);
                                  break L32;
                                }
                              } else {
                                di.field_X = di.field_X + var5;
                                break L32;
                              }
                            }
                          }
                          L36: {
                            if (this.field_h < 0) {
                              break L36;
                            } else {
                              if (5 < this.field_h) {
                                break L36;
                              } else {
                                L37: {
                                  if (ke.field_V) {
                                    nm.field_g[this.field_h] = nm.field_g[this.field_h] + 1;
                                    break L37;
                                  } else {
                                    break L37;
                                  }
                                }
                                L38: {
                                  if (je.c(this.field_n, this.field_p, 1, 1)) {
                                    vi.field_q = vi.field_q + 1;
                                    if (-26 == (vi.field_q ^ -1)) {
                                      if (ke.field_V) {
                                        fn.a(11, 244, 3);
                                        if (!ke.field_V) {
                                          break L38;
                                        } else {
                                          if (25 != nm.field_g[this.field_h]) {
                                            break L38;
                                          } else {
                                            if (0 != this.field_h) {
                                              break L38;
                                            } else {
                                              fn.a(4, 251, 3);
                                              break L38;
                                            }
                                          }
                                        }
                                      } else {
                                        if (!ke.field_V) {
                                          break L38;
                                        } else {
                                          if (25 != nm.field_g[this.field_h]) {
                                            break L38;
                                          } else {
                                            if (0 != this.field_h) {
                                              break L38;
                                            } else {
                                              fn.a(4, 251, 3);
                                              break L38;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (!ke.field_V) {
                                        break L38;
                                      } else {
                                        if (25 != nm.field_g[this.field_h]) {
                                          break L38;
                                        } else {
                                          if (0 != this.field_h) {
                                            break L38;
                                          } else {
                                            fn.a(4, 251, 3);
                                            break L38;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (!ke.field_V) {
                                      break L38;
                                    } else {
                                      if (25 != nm.field_g[this.field_h]) {
                                        break L38;
                                      } else {
                                        if (0 != this.field_h) {
                                          break L38;
                                        } else {
                                          fn.a(4, 251, 3);
                                          break L38;
                                        }
                                      }
                                    }
                                  }
                                }
                                L39: {
                                  if (ke.field_V) {
                                    if (-26 == (nm.field_g[this.field_h] ^ -1)) {
                                      if ((this.field_h ^ -1) == -2) {
                                        fn.a(5, 250, 3);
                                        if (!ke.field_V) {
                                          break L39;
                                        } else {
                                          if ((nm.field_g[this.field_h] ^ -1) != -26) {
                                            break L39;
                                          } else {
                                            if (-3 != (this.field_h ^ -1)) {
                                              break L39;
                                            } else {
                                              fn.a(6, 249, 3);
                                              break L39;
                                            }
                                          }
                                        }
                                      } else {
                                        if (!ke.field_V) {
                                          break L39;
                                        } else {
                                          if ((nm.field_g[this.field_h] ^ -1) != -26) {
                                            break L39;
                                          } else {
                                            if (-3 != (this.field_h ^ -1)) {
                                              break L39;
                                            } else {
                                              fn.a(6, 249, 3);
                                              break L39;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (!ke.field_V) {
                                        break L39;
                                      } else {
                                        if ((nm.field_g[this.field_h] ^ -1) != -26) {
                                          break L39;
                                        } else {
                                          if (-3 != (this.field_h ^ -1)) {
                                            break L39;
                                          } else {
                                            fn.a(6, 249, 3);
                                            break L39;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (!ke.field_V) {
                                      break L39;
                                    } else {
                                      if ((nm.field_g[this.field_h] ^ -1) != -26) {
                                        break L39;
                                      } else {
                                        if (-3 != (this.field_h ^ -1)) {
                                          break L39;
                                        } else {
                                          fn.a(6, 249, 3);
                                          break L39;
                                        }
                                      }
                                    }
                                  }
                                }
                                L40: {
                                  if (!ke.field_V) {
                                    break L40;
                                  } else {
                                    if (nm.field_g[this.field_h] != 25) {
                                      break L40;
                                    } else {
                                      if (3 != this.field_h) {
                                        break L40;
                                      } else {
                                        fn.a(7, 248, 3);
                                        break L40;
                                      }
                                    }
                                  }
                                }
                                L41: {
                                  if (!ke.field_V) {
                                    break L41;
                                  } else {
                                    if (nm.field_g[this.field_h] != 25) {
                                      break L41;
                                    } else {
                                      if (-6 == (this.field_h ^ -1)) {
                                        fn.a(18, 237, 3);
                                        break L41;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                }
                                if (!ke.field_V) {
                                  break L36;
                                } else {
                                  if (10 != nm.field_g[this.field_h]) {
                                    break L36;
                                  } else {
                                    if ((this.field_h ^ -1) == -5) {
                                      fn.a(8, 247, 3);
                                      break L36;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          return null;
                        }
                      }
                    }
                  }
                }
                L42: {
                  if (param0) {
                    break L42;
                  } else {
                    discarded$1 = this.a((byte) -116);
                    break L42;
                  }
                }
                L43: {
                  if (var2 != 0) {
                    L44: {
                      if (this.field_i > 0) {
                        this.field_i = this.field_i - 1;
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                    if ((this.field_i ^ -1) <= -1) {
                      break L43;
                    } else {
                      this.field_i = this.field_i + 1;
                      break L43;
                    }
                  } else {
                    break L43;
                  }
                }
                L45: {
                  if (this.field_h == 9) {
                    this.a(21161, var2 != 0);
                    break L45;
                  } else {
                    if (this.field_h == 19) {
                      this.c(true);
                      break L45;
                    } else {
                      if ((this.field_h ^ -1) != -22) {
                        break L45;
                      } else {
                        L46: {
                          var4 = (hf.field_t - this.field_p) * (hf.field_t - this.field_p) + (-this.field_n + ca.field_k) * (ca.field_k - this.field_n);
                          if (120 < q.field_b[this.field_n][this.field_p].field_i) {
                            if (25 > var4) {
                              stackOut_234_0 = 1;
                              stackIn_236_0 = stackOut_234_0;
                              break L46;
                            } else {
                              stackOut_233_0 = 0;
                              stackIn_236_0 = stackOut_233_0;
                              break L46;
                            }
                          } else {
                            stackOut_231_0 = 0;
                            stackIn_236_0 = stackOut_231_0;
                            break L46;
                          }
                        }
                        L47: {
                          var5 = stackIn_236_0;
                          if (this.field_l > 32) {
                            L48: {
                              if (var5 != 0) {
                                ne.a(ll.a((byte) -73, 4) + 37, -96);
                                break L48;
                              } else {
                                break L48;
                              }
                            }
                            this.field_l = -10;
                            break L47;
                          } else {
                            break L47;
                          }
                        }
                        L49: {
                          stackOut_242_0 = this;
                          stackIn_244_0 = stackOut_242_0;
                          stackIn_243_0 = stackOut_242_0;
                          if (var5 == 0) {
                            stackOut_244_0 = this;
                            stackOut_244_1 = 0;
                            stackIn_245_0 = stackOut_244_0;
                            stackIn_245_1 = stackOut_244_1;
                            break L49;
                          } else {
                            stackOut_243_0 = this;
                            stackOut_243_1 = 1;
                            stackIn_245_0 = stackOut_243_0;
                            stackIn_245_1 = stackOut_243_1;
                            break L49;
                          }
                        }
                        L50: {
                          ((gf) (this)).field_e = stackIn_245_1 != 0;
                          var6 = 40;
                          var7 = 4;
                          if (!je.c(this.field_n, this.field_p, 1, 2)) {
                            stackOut_247_0 = 0;
                            stackIn_248_0 = stackOut_247_0;
                            break L50;
                          } else {
                            stackOut_246_0 = 1;
                            stackIn_248_0 = stackOut_246_0;
                            break L50;
                          }
                        }
                        L51: {
                          var8 = stackIn_248_0;
                          if (!je.c(this.field_n, this.field_p + -1, 1, 1)) {
                            stackOut_250_0 = 0;
                            stackIn_251_0 = stackOut_250_0;
                            break L51;
                          } else {
                            stackOut_249_0 = 1;
                            stackIn_251_0 = stackOut_249_0;
                            break L51;
                          }
                        }
                        L52: {
                          var9 = stackIn_251_0;
                          if (var8 != 0) {
                            break L52;
                          } else {
                            var6 = 6;
                            break L52;
                          }
                        }
                        L53: {
                          if (var5 == 0) {
                            L54: {
                              var10 = 4 * (this.field_k - -160) / 320 + (this.field_n << -1507159102);
                              if (this.field_g != 0) {
                                if (!je.i(var10, this.field_p << -1275278462)) {
                                  if (-10 < this.field_i) {
                                    this.field_i = this.field_i - var7;
                                    break L54;
                                  } else {
                                    break L54;
                                  }
                                } else {
                                  this.field_g = 0;
                                  break L54;
                                }
                              } else {
                                if (je.i(var10, this.field_p << -43844254)) {
                                  this.field_g = 1;
                                  break L54;
                                } else {
                                  if (this.field_i < 10) {
                                    this.field_i = this.field_i + var7;
                                    break L54;
                                  } else {
                                    break L54;
                                  }
                                }
                              }
                            }
                            if (var8 != 0) {
                              var11_double = Math.sin((double)(100 * this.field_c));
                              if (0.0 >= var11_double) {
                                if (this.field_m >= var6) {
                                  break L53;
                                } else {
                                  this.field_m = this.field_m + 1;
                                  break L53;
                                }
                              } else {
                                L55: {
                                  if (-var6 < this.field_m) {
                                    this.field_m = this.field_m - 1;
                                    break L55;
                                  } else {
                                    break L55;
                                  }
                                }
                                if (var9 != 0) {
                                  break L53;
                                } else {
                                  this.field_m = 0;
                                  break L53;
                                }
                              }
                            } else {
                              break L53;
                            }
                          } else {
                            L56: {
                              if (-1 + this.field_p > hf.field_t) {
                                if (var8 == 0) {
                                  stackOut_258_0 = 1;
                                  stackIn_260_0 = stackOut_258_0;
                                  break L56;
                                } else {
                                  stackOut_257_0 = 0;
                                  stackIn_260_0 = stackOut_257_0;
                                  break L56;
                                }
                              } else {
                                stackOut_255_0 = 0;
                                stackIn_260_0 = stackOut_255_0;
                                break L56;
                              }
                            }
                            L57: {
                              var10 = stackIn_260_0;
                              if (-5 > (Math.abs(ca.field_k - this.field_n) ^ -1)) {
                                stackOut_262_0 = 0;
                                stackIn_263_0 = stackOut_262_0;
                                break L57;
                              } else {
                                stackOut_261_0 = 1;
                                stackIn_263_0 = stackOut_261_0;
                                break L57;
                              }
                            }
                            L58: {
                              var11_int = stackIn_263_0;
                              if (this.field_n >= ca.field_k) {
                                break L58;
                              } else {
                                if (this.field_i < var6) {
                                  L59: {
                                    if (var10 != 0) {
                                      break L59;
                                    } else {
                                      if (var11_int != 0) {
                                        break L59;
                                      } else {
                                        break L58;
                                      }
                                    }
                                  }
                                  this.field_i = this.field_i - var7;
                                  break L58;
                                } else {
                                  break L58;
                                }
                              }
                            }
                            L60: {
                              if (ca.field_k >= this.field_n) {
                                break L60;
                              } else {
                                if (-var6 >= this.field_i) {
                                  break L60;
                                } else {
                                  L61: {
                                    if (var10 != 0) {
                                      break L61;
                                    } else {
                                      if (var11_int == 0) {
                                        break L60;
                                      } else {
                                        break L61;
                                      }
                                    }
                                  }
                                  this.field_i = this.field_i + var7;
                                  break L60;
                                }
                              }
                            }
                            L62: {
                              if (this.field_i >= -var6) {
                                break L62;
                              } else {
                                this.field_i = -var6;
                                break L62;
                              }
                            }
                            L63: {
                              if (var6 < this.field_i) {
                                this.field_i = var6;
                                break L63;
                              } else {
                                break L63;
                              }
                            }
                            L64: {
                              L65: {
                                if (this.field_p <= hf.field_t) {
                                  break L65;
                                } else {
                                  if (var8 == 0) {
                                    break L65;
                                  } else {
                                    if (this.field_m >= var6) {
                                      break L65;
                                    } else {
                                      this.field_m = this.field_m + 1;
                                      break L64;
                                    }
                                  }
                                }
                              }
                              if (this.field_p >= hf.field_t) {
                                break L64;
                              } else {
                                if (var8 == 0) {
                                  break L64;
                                } else {
                                  if (this.field_m > -var6) {
                                    this.field_m = this.field_m - 1;
                                    break L64;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                            }
                            L66: {
                              if (-var6 * 4 > this.field_m) {
                                this.field_m = 4 * -var6;
                                break L66;
                              } else {
                                break L66;
                              }
                            }
                            if (ca.field_k != this.field_n) {
                              break L53;
                            } else {
                              if (this.field_p != hf.field_t) {
                                break L53;
                              } else {
                                L67: {
                                  fn.a(23, 232, 3);
                                  var12 = 1000 * var3;
                                  a.field_c = a.field_c + var12;
                                  var13 = var12;
                                  var14 = rg.field_sb % 3;
                                  if (0 == var14) {
                                    di.field_X = di.field_X + var13;
                                    break L67;
                                  } else {
                                    if (-2 == (var14 ^ -1)) {
                                      vh.field_g = vh.field_g - var13;
                                      break L67;
                                    } else {
                                      var15 = var13 / 3;
                                      vh.field_g = vh.field_g - (var13 + -var15);
                                      di.field_X = di.field_X + var15;
                                      break L67;
                                    }
                                  }
                                }
                                ne.a(ll.a((byte) -73, 4) + 37, 122);
                                return null;
                              }
                            }
                          }
                        }
                        if (!q.field_b[this.field_n][this.field_p].field_a) {
                          if (!je.field_O.b(this.field_n, this.field_p, (byte) 15)) {
                            break L45;
                          } else {
                            return null;
                          }
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                }
                L68: {
                  if (-18 == (this.field_h ^ -1)) {
                    this.field_b = this.field_b + 1;
                    if ((this.field_b ^ -1) < -251) {
                      L69: {
                        this.field_g = 0;
                        this.field_h = 8;
                        this.field_b = 0;
                        if (sc.field_b) {
                          ag.a(true, 11, this.field_p * 32, 32 * this.field_n);
                          break L69;
                        } else {
                          break L69;
                        }
                      }
                      return (gf) (this);
                    } else {
                      if (this.field_g < 1) {
                        break L68;
                      } else {
                        if (this.field_b > 5) {
                          this.field_g = this.field_g + 1;
                          this.field_b = 0;
                          if ((this.field_g ^ -1) >= -6) {
                            break L68;
                          } else {
                            return null;
                          }
                        } else {
                          break L68;
                        }
                      }
                    }
                  } else {
                    break L68;
                  }
                }
                L70: {
                  L71: {
                    if (6 == this.field_h) {
                      break L71;
                    } else {
                      if (7 == this.field_h) {
                        break L71;
                      } else {
                        if (this.field_h != 16) {
                          break L70;
                        } else {
                          break L71;
                        }
                      }
                    }
                  }
                  L72: {
                    this.field_b = this.field_b + 1;
                    if (!je.c(this.field_n, this.field_p, 1, 3)) {
                      break L72;
                    } else {
                      L73: {
                        if (this.field_h == 6) {
                          break L73;
                        } else {
                          if (this.field_h != 17) {
                            break L72;
                          } else {
                            break L73;
                          }
                        }
                      }
                      if (250 < this.field_b) {
                        this.field_g = 0;
                        this.field_h = 8;
                        this.field_b = 0;
                        return (gf) (this);
                      } else {
                        break L72;
                      }
                    }
                  }
                  L74: {
                    if (-1 != (this.field_g ^ -1)) {
                      break L74;
                    } else {
                      if (this.field_h != 6) {
                        break L74;
                      } else {
                        if (!je.c(this.field_n, this.field_p, 3, 3)) {
                          break L74;
                        } else {
                          if (-251 < (this.field_b ^ -1)) {
                            this.field_h = 17;
                            var4 = 0;
                            L75: while (true) {
                              if (-1001 >= (var4 ^ -1)) {
                                break L74;
                              } else {
                                if (null != uf.field_p[var4]) {
                                  if (uf.field_p[var4] == this) {
                                    ge.a(var4, (byte) 85, true);
                                    break L74;
                                  } else {
                                    var4++;
                                    continue L75;
                                  }
                                } else {
                                  var4++;
                                  continue L75;
                                }
                              }
                            }
                          } else {
                            break L74;
                          }
                        }
                      }
                    }
                  }
                  L76: {
                    if ((this.field_b ^ -1) <= -251) {
                      break L76;
                    } else {
                      if (je.field_O.b(this.field_n, this.field_p, (byte) 80)) {
                        this.field_b = 251;
                        break L76;
                      } else {
                        break L76;
                      }
                    }
                  }
                  L77: {
                    if (0 != this.field_g) {
                      break L77;
                    } else {
                      if ((this.field_b ^ -1) < -251) {
                        L78: {
                          ne.a(8, -74);
                          oe.field_b = true;
                          if (this.field_h == 16) {
                            this.field_h = 6;
                            break L78;
                          } else {
                            break L78;
                          }
                        }
                        lj.field_r = lj.field_r + 25;
                        this.field_b = 0;
                        this.field_g = 1;
                        rg.field_sb = rg.field_sb - 40;
                        var4 = 0;
                        L79: while (true) {
                          if (-1001 >= (var4 ^ -1)) {
                            L80: {
                              var4 = 1;
                              if (an.field_d) {
                                var4 = 2;
                                break L80;
                              } else {
                                break L80;
                              }
                            }
                            var5 = -var4 + this.field_n;
                            L81: while (true) {
                              if (var5 > this.field_n + var4) {
                                L82: {
                                  var5 = -8 + 4 * this.field_n;
                                  if ((var5 ^ -1) <= -1) {
                                    break L82;
                                  } else {
                                    var5 = 0;
                                    break L82;
                                  }
                                }
                                L83: {
                                  var6 = 8 + (1 + this.field_n) * 4;
                                  if (-125 <= (var6 ^ -1)) {
                                    break L83;
                                  } else {
                                    var6 = 124;
                                    break L83;
                                  }
                                }
                                L84: {
                                  var7 = -8 + 4 * this.field_p;
                                  var8 = 4 * this.field_p + 4 + 8;
                                  if (-1 >= (var7 ^ -1)) {
                                    break L84;
                                  } else {
                                    var7 = 0;
                                    break L84;
                                  }
                                }
                                L85: {
                                  if (4 * je.field_t - 4 >= var8) {
                                    break L85;
                                  } else {
                                    var8 = 4 * (je.field_t - 1);
                                    break L85;
                                  }
                                }
                                var9 = var5;
                                L86: while (true) {
                                  if (var6 <= var9) {
                                    if (1 == cm.field_o) {
                                      var9 = var5;
                                      L87: while (true) {
                                        if (var6 <= var9) {
                                          break L77;
                                        } else {
                                          var10 = var7;
                                          L88: while (true) {
                                            if (var10 < var8) {
                                              if (je.field_O.a(var9, var10, (byte) 61)) {
                                                lj.field_r = lj.field_r + 10;
                                                je.field_O.a(false, (byte) 63, var9 >> 843382338, var10 >> 1434647618);
                                                var9++;
                                                continue L87;
                                              } else {
                                                var10++;
                                                continue L88;
                                              }
                                            } else {
                                              var9++;
                                              continue L87;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L77;
                                    }
                                  } else {
                                    var10 = var7;
                                    L89: while (true) {
                                      if (var10 >= var8) {
                                        var9++;
                                        continue L86;
                                      } else {
                                        if (je.field_O.i(-120, var9, var10)) {
                                          if (!je.field_O.e(var9, var10, 2)) {
                                            L90: {
                                              lj.field_r = lj.field_r + 25;
                                              if ((3 & var9 ^ -1) != -2) {
                                                break L90;
                                              } else {
                                                if (1 == (3 & var10)) {
                                                  rg.field_sb = rg.field_sb - 15;
                                                  var11_int = jf.b((byte) 114);
                                                  uf.field_p[var11_int] = new gf(var9 / 4, var10 / 4, 16);
                                                  uf.field_p[var11_int].field_g = 0;
                                                  uf.field_p[var11_int].field_b = 244;
                                                  break L90;
                                                } else {
                                                  break L90;
                                                }
                                              }
                                            }
                                            je.field_O.b(117, false, var9, var10);
                                            je.field_O.a(-122, var10, 0, var9);
                                            var10++;
                                            continue L89;
                                          } else {
                                            var10++;
                                            continue L89;
                                          }
                                        } else {
                                          var10++;
                                          continue L89;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var6 = this.field_p - var4;
                                L91: while (true) {
                                  if (var4 + this.field_p < var6) {
                                    var5++;
                                    continue L81;
                                  } else {
                                    L92: {
                                      if (var5 != ca.field_k) {
                                        break L92;
                                      } else {
                                        if (hf.field_t != var6) {
                                          break L92;
                                        } else {
                                          if (!il.e(-31391)) {
                                            L93: {
                                              if (!rf.a(13)) {
                                                break L93;
                                              } else {
                                                if (!ca.c(-2302)) {
                                                  break L93;
                                                } else {
                                                  rj.a((byte) -38, 13);
                                                  break L92;
                                                }
                                              }
                                            }
                                            rj.a((byte) -38, 5);
                                            break L92;
                                          } else {
                                            break L92;
                                          }
                                        }
                                      }
                                    }
                                    L94: {
                                      var7 = -16 + var5;
                                      if (var7 < 0) {
                                        var7 = -var7;
                                        break L94;
                                      } else {
                                        break L94;
                                      }
                                    }
                                    if (-1 > (var6 ^ -1)) {
                                      if (0 < var5) {
                                        if ((var5 ^ -1) > -32) {
                                          if (-1 + je.field_t > var6) {
                                            if (var6 > var7 / 2) {
                                              if (q.field_b[var5][var6].field_a) {
                                                L95: {
                                                  var8 = 1;
                                                  if (!q.field_b[var5][var6].field_b) {
                                                    if (q.field_b[var5][var6].field_S) {
                                                      q.field_b[var5][var6].field_a = false;
                                                      break L95;
                                                    } else {
                                                      break L95;
                                                    }
                                                  } else {
                                                    var8 = 0;
                                                    q.field_b[var5][var6].field_b = false;
                                                    if (0 == (q.field_b[var5][var6].field_U ^ -1)) {
                                                      break L95;
                                                    } else {
                                                      jc.field_H = jc.field_H + 1;
                                                      break L95;
                                                    }
                                                  }
                                                }
                                                L96: {
                                                  if (q.field_b[var5][var6].field_E) {
                                                    break L96;
                                                  } else {
                                                    if (!q.field_b[var5][var6].field_v) {
                                                      L97: {
                                                        stackOut_457_0 = q.field_b[var5][var6];
                                                        stackIn_459_0 = stackOut_457_0;
                                                        stackIn_458_0 = stackOut_457_0;
                                                        if (var8 == 0) {
                                                          stackOut_459_0 = (je) ((Object) stackIn_459_0);
                                                          stackOut_459_1 = 0;
                                                          stackIn_460_0 = stackOut_459_0;
                                                          stackIn_460_1 = stackOut_459_1;
                                                          break L97;
                                                        } else {
                                                          stackOut_458_0 = (je) ((Object) stackIn_458_0);
                                                          stackOut_458_1 = 1;
                                                          stackIn_460_0 = stackOut_458_0;
                                                          stackIn_460_1 = stackOut_458_1;
                                                          break L97;
                                                        }
                                                      }
                                                      stackIn_460_0.field_S = stackIn_460_1 != 0;
                                                      q.field_b[var5][var6].field_r = 1000;
                                                      var6++;
                                                      continue L91;
                                                    } else {
                                                      break L96;
                                                    }
                                                  }
                                                }
                                                q.field_b[var5][var6].field_a = false;
                                                q.field_b[var5][var6].field_E = false;
                                                q.field_b[var5][var6].field_v = false;
                                                je.field_O.h(var5, 4, var6);
                                                if (sc.field_b) {
                                                  ag.a(param0, 25, 32 * var6, var5 * 32);
                                                  var6++;
                                                  continue L91;
                                                } else {
                                                  var6++;
                                                  continue L91;
                                                }
                                              } else {
                                                if (q.field_b[var5][var6].field_b) {
                                                  q.field_b[var5][var6].field_b = false;
                                                  if (q.field_b[var5][var6].field_U != -1) {
                                                    jc.field_H = jc.field_H + 1;
                                                    var6++;
                                                    continue L91;
                                                  } else {
                                                    var6++;
                                                    continue L91;
                                                  }
                                                } else {
                                                  var6++;
                                                  continue L91;
                                                }
                                              }
                                            } else {
                                              var6++;
                                              continue L91;
                                            }
                                          } else {
                                            var6++;
                                            continue L91;
                                          }
                                        } else {
                                          var6++;
                                          continue L91;
                                        }
                                      } else {
                                        var6++;
                                        continue L91;
                                      }
                                    } else {
                                      var6++;
                                      continue L91;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            L98: {
                              if (null != uf.field_p[var4]) {
                                if (uf.field_p[var4].a(false)) {
                                  if (-1 + this.field_n > uf.field_p[var4].field_n) {
                                    break L98;
                                  } else {
                                    if (this.field_p + -1 > uf.field_p[var4].field_p) {
                                      break L98;
                                    } else {
                                      if (uf.field_p[var4].field_n > this.field_n + 1) {
                                        break L98;
                                      } else {
                                        if (uf.field_p[var4].field_p <= this.field_p - -1) {
                                          L99: {
                                            if (19 != uf.field_p[var4].field_h) {
                                              break L99;
                                            } else {
                                              hn.field_c = true;
                                              break L99;
                                            }
                                          }
                                          uf.field_p[var4].field_h = 16;
                                          uf.field_p[var4].field_b = 250;
                                          break L98;
                                        } else {
                                          break L98;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (7 == uf.field_p[var4].field_h) {
                                    if (uf.field_p[var4].field_n < this.field_n + -1) {
                                      break L98;
                                    } else {
                                      if (uf.field_p[var4].field_p < -1 + this.field_p) {
                                        break L98;
                                      } else {
                                        if (uf.field_p[var4].field_n > this.field_n + 1) {
                                          break L98;
                                        } else {
                                          if (this.field_p + 1 >= uf.field_p[var4].field_p) {
                                            uf.field_p[var4].field_b = 250;
                                            ge.a(var4, (byte) 85, false);
                                            break L98;
                                          } else {
                                            break L98;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if ((uf.field_p[var4].field_h ^ -1) == -7) {
                                      if (uf.field_p[var4].field_n < -1 + this.field_n) {
                                        break L98;
                                      } else {
                                        if (uf.field_p[var4].field_p < this.field_p - 1) {
                                          break L98;
                                        } else {
                                          if (uf.field_p[var4].field_n > this.field_n - -1) {
                                            break L98;
                                          } else {
                                            if (uf.field_p[var4].field_p <= this.field_p + 1) {
                                              uf.field_p[var4].field_b = 250;
                                              ge.a(var4, (byte) 85, true);
                                              break L98;
                                            } else {
                                              break L98;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (-18 == (uf.field_p[var4].field_h ^ -1)) {
                                        if (uf.field_p[var4].field_n < this.field_n + -1) {
                                          break L98;
                                        } else {
                                          if (uf.field_p[var4].field_p < this.field_p - 1) {
                                            break L98;
                                          } else {
                                            if (uf.field_p[var4].field_n > this.field_n + 1) {
                                              break L98;
                                            } else {
                                              if (uf.field_p[var4].field_p > 1 + this.field_p) {
                                                break L98;
                                              } else {
                                                uf.field_p[var4].field_h = 6;
                                                uf.field_p[var4].field_b = 250;
                                                break L98;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L98;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L98;
                              }
                            }
                            var4++;
                            continue L79;
                          }
                        }
                      } else {
                        break L77;
                      }
                    }
                  }
                  if ((this.field_g ^ -1) > -2) {
                    break L70;
                  } else {
                    if ((this.field_b ^ -1) >= -6) {
                      break L70;
                    } else {
                      this.field_g = this.field_g + 1;
                      this.field_b = 0;
                      if (this.field_g <= 5) {
                        break L70;
                      } else {
                        return null;
                      }
                    }
                  }
                }
                L100: {
                  if (-16 != (this.field_h ^ -1)) {
                    break L100;
                  } else {
                    L101: {
                      this.field_b = this.field_b + 1;
                      if (this.field_g != 0) {
                        break L101;
                      } else {
                        if (this.field_b > 250) {
                          ne.a(8, 109);
                          this.field_b = 0;
                          this.field_g = 1;
                          var4 = 2;
                          var5 = this.field_n + -var4;
                          L102: while (true) {
                            if (var5 > var4 + this.field_n) {
                              break L101;
                            } else {
                              var6 = this.field_p + -var4;
                              L103: while (true) {
                                if (var6 > this.field_p - -var4) {
                                  var5++;
                                  continue L102;
                                } else {
                                  L104: {
                                    var7 = -16 + var5;
                                    if (var7 < 0) {
                                      var7 = -var7;
                                      break L104;
                                    } else {
                                      break L104;
                                    }
                                  }
                                  L105: {
                                    if (var6 <= 0) {
                                      break L105;
                                    } else {
                                      if (-1 <= (var5 ^ -1)) {
                                        break L105;
                                      } else {
                                        if (31 <= var5) {
                                          break L105;
                                        } else {
                                          if (var6 >= je.field_t + -1) {
                                            break L105;
                                          } else {
                                            if (var6 <= var7 / 2) {
                                              break L105;
                                            } else {
                                              je.field_O.h(var5, 4, var6);
                                              break L105;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  q.field_b[var5][var6].field_b = false;
                                  q.field_b[var5][var6].field_a = false;
                                  var6++;
                                  continue L103;
                                }
                              }
                            }
                          }
                        } else {
                          break L101;
                        }
                      }
                    }
                    if ((this.field_g ^ -1) > -2) {
                      break L100;
                    } else {
                      if (this.field_b <= 5) {
                        break L100;
                      } else {
                        this.field_g = this.field_g + 1;
                        this.field_b = 0;
                        if (-6 <= (this.field_g ^ -1)) {
                          break L100;
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                }
                L106: {
                  if (this.field_h == 18) {
                    L107: {
                      this.field_b = this.field_b + 1;
                      if (0 != this.field_g) {
                        break L107;
                      } else {
                        if (this.field_b > 250) {
                          ne.a(8, -115);
                          this.field_g = 1;
                          this.field_b = 0;
                          var4 = 2;
                          var5 = -var4 + this.field_n;
                          L108: while (true) {
                            if (var4 + this.field_n < var5) {
                              break L107;
                            } else {
                              var6 = -var4 + this.field_p;
                              L109: while (true) {
                                if (var6 > this.field_p - -var4) {
                                  var5++;
                                  continue L108;
                                } else {
                                  L110: {
                                    var7 = var5 - 16;
                                    if ((var7 ^ -1) > -1) {
                                      var7 = -var7;
                                      break L110;
                                    } else {
                                      break L110;
                                    }
                                  }
                                  L111: {
                                    if (0 >= var6) {
                                      break L111;
                                    } else {
                                      if (var5 <= 0) {
                                        break L111;
                                      } else {
                                        if (-32 >= (var5 ^ -1)) {
                                          break L111;
                                        } else {
                                          if (var6 >= -1 + je.field_t) {
                                            break L111;
                                          } else {
                                            if (var7 / 2 < var6) {
                                              je.field_O.c(var6, var5, (byte) -48);
                                              break L111;
                                            } else {
                                              break L111;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  q.field_b[var5][var6].field_b = false;
                                  q.field_b[var5][var6].field_a = false;
                                  var6++;
                                  continue L109;
                                }
                              }
                            }
                          }
                        } else {
                          break L107;
                        }
                      }
                    }
                    if (-2 < (this.field_g ^ -1)) {
                      break L106;
                    } else {
                      if (5 < this.field_b) {
                        this.field_g = this.field_g + 1;
                        this.field_b = 0;
                        if ((this.field_g ^ -1) >= -6) {
                          break L106;
                        } else {
                          return null;
                        }
                      } else {
                        break L106;
                      }
                    }
                  } else {
                    break L106;
                  }
                }
                L112: {
                  if (-23 == (this.field_h ^ -1)) {
                    L113: {
                      this.field_b = this.field_b + 1;
                      if (this.field_g != 0) {
                        break L113;
                      } else {
                        if ((this.field_b ^ -1) < -251) {
                          ne.a(8, 120);
                          this.field_g = 1;
                          this.field_b = 0;
                          var4 = 2;
                          var5 = -var4 + this.field_n;
                          L114: while (true) {
                            if (var5 > var4 + this.field_n) {
                              break L113;
                            } else {
                              var6 = this.field_p - var4;
                              L115: while (true) {
                                if (this.field_p + var4 < var6) {
                                  var5++;
                                  continue L114;
                                } else {
                                  L116: {
                                    var7 = var5 - 16;
                                    if ((var7 ^ -1) <= -1) {
                                      break L116;
                                    } else {
                                      var7 = -var7;
                                      break L116;
                                    }
                                  }
                                  L117: {
                                    if ((var6 ^ -1) >= -1) {
                                      break L117;
                                    } else {
                                      if (0 >= var5) {
                                        break L117;
                                      } else {
                                        if (31 <= var5) {
                                          break L117;
                                        } else {
                                          if (je.field_t - 1 <= var6) {
                                            break L117;
                                          } else {
                                            if (var7 / 2 < var6) {
                                              je.field_O.d(var6, var5, -5);
                                              break L117;
                                            } else {
                                              break L117;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  q.field_b[var5][var6].field_b = false;
                                  q.field_b[var5][var6].field_a = false;
                                  var6++;
                                  continue L115;
                                }
                              }
                            }
                          }
                        } else {
                          break L113;
                        }
                      }
                    }
                    if (this.field_g < 1) {
                      break L112;
                    } else {
                      if (this.field_b > 5) {
                        this.field_g = this.field_g + 1;
                        this.field_b = 0;
                        if ((this.field_g ^ -1) >= -6) {
                          break L112;
                        } else {
                          return null;
                        }
                      } else {
                        break L112;
                      }
                    }
                  } else {
                    break L112;
                  }
                }
                L118: {
                  if (-21 == (this.field_h ^ -1)) {
                    L119: {
                      if (!sc.field_b) {
                        break L119;
                      } else {
                        if (q.field_b[this.field_n][this.field_p].field_V) {
                          ag.a(param0, 26, 32 * this.field_p, this.field_n * 32);
                          break L119;
                        } else {
                          break L119;
                        }
                      }
                    }
                    L120: {
                      this.field_b = this.field_b + 1;
                      if (-1 != (this.field_g ^ -1)) {
                        break L120;
                      } else {
                        if (this.field_b > 250) {
                          L121: {
                            ne.a(33, -69);
                            this.field_g = 1;
                            this.field_b = 0;
                            var4 = ca.field_k - this.field_n;
                            var5 = -this.field_p + hf.field_t;
                            if (var4 * var4 > 1) {
                              break L121;
                            } else {
                              if (1 < var5 * var5) {
                                break L121;
                              } else {
                                if (il.e(-31391)) {
                                  break L121;
                                } else {
                                  rj.a((byte) -38, 9);
                                  q.field_b[ca.field_k][hf.field_t].field_a = true;
                                  q.field_b[ca.field_k][hf.field_t].field_E = true;
                                  q.field_b[ca.field_k][hf.field_t].field_q = -400;
                                  break L121;
                                }
                              }
                            }
                          }
                          var6 = 0;
                          var7 = 0;
                          L122: while (true) {
                            if (var7 >= 1000) {
                              L123: {
                                if (3 > var6) {
                                  break L123;
                                } else {
                                  fn.a(20, 235, 3);
                                  break L123;
                                }
                              }
                              var7 = -1 + this.field_n;
                              L124: while (true) {
                                if (1 + this.field_n < var7) {
                                  if (-501 >= (re.field_d ^ -1)) {
                                    fn.a(28, 227, 3);
                                    break L120;
                                  } else {
                                    break L120;
                                  }
                                } else {
                                  var8 = this.field_p + -1;
                                  L125: while (true) {
                                    if (var8 > this.field_p - -1) {
                                      var7++;
                                      continue L124;
                                    } else {
                                      L126: {
                                        var9 = var7 + -16;
                                        if (0 <= var9) {
                                          break L126;
                                        } else {
                                          var9 = -var9;
                                          break L126;
                                        }
                                      }
                                      if (0 < var8) {
                                        if (0 < var7) {
                                          if (31 > var7) {
                                            if (var8 < je.field_t + -1) {
                                              if (var8 > var9 / 2) {
                                                var10 = 0;
                                                if (q.field_b[var7][var8].field_a) {
                                                  L127: {
                                                    if (q.field_b[var7][var8].field_E) {
                                                      break L127;
                                                    } else {
                                                      re.field_d = re.field_d + 1;
                                                      break L127;
                                                    }
                                                  }
                                                  q.field_b[var7][var8].field_E = true;
                                                  q.field_b[var7][var8].field_v = false;
                                                  q.field_b[var7][var8].field_q = -400;
                                                  var8++;
                                                  continue L125;
                                                } else {
                                                  L128: {
                                                    if (!je.field_O.a(var7, (byte) -87, var8)) {
                                                      break L128;
                                                    } else {
                                                      je.field_O.b(122, var7, var8);
                                                      var10 = 1;
                                                      break L128;
                                                    }
                                                  }
                                                  if (var10 != 0) {
                                                    var11 = mh.field_e[var7][var8];
                                                    var11.field_q = -400;
                                                    re.field_d = re.field_d + 1;
                                                    var11.field_E = true;
                                                    var11.field_a = true;
                                                    var8++;
                                                    continue L125;
                                                  } else {
                                                    var8++;
                                                    continue L125;
                                                  }
                                                }
                                              } else {
                                                var8++;
                                                continue L125;
                                              }
                                            } else {
                                              var8++;
                                              continue L125;
                                            }
                                          } else {
                                            var8++;
                                            continue L125;
                                          }
                                        } else {
                                          var8++;
                                          continue L125;
                                        }
                                      } else {
                                        var8++;
                                        continue L125;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var8_ref_gf = uf.field_p[var7];
                              if (var8_ref_gf != null) {
                                L129: {
                                  stackOut_592_0 = (gf) (var8_ref_gf);
                                  stackIn_594_0 = stackOut_592_0;
                                  stackIn_593_0 = stackOut_592_0;
                                  if (param0) {
                                    stackOut_594_0 = (gf) ((Object) stackIn_594_0);
                                    stackOut_594_1 = 0;
                                    stackIn_595_0 = stackOut_594_0;
                                    stackIn_595_1 = stackOut_594_1;
                                    break L129;
                                  } else {
                                    stackOut_593_0 = (gf) ((Object) stackIn_593_0);
                                    stackOut_593_1 = 1;
                                    stackIn_595_0 = stackOut_593_0;
                                    stackIn_595_1 = stackOut_593_1;
                                    break L129;
                                  }
                                }
                                if (((gf) (Object) stackIn_595_0).a(stackIn_595_1 != 0)) {
                                  var4 = var8_ref_gf.field_n - this.field_n;
                                  if (-2 <= (var4 * var4 ^ -1)) {
                                    var5 = var8_ref_gf.field_p + -this.field_p;
                                    if ((var5 * var5 ^ -1) >= -2) {
                                      L130: {
                                        var9_ref_je = mh.field_e[var8_ref_gf.field_n][var8_ref_gf.field_p];
                                        if (19 != var8_ref_gf.field_h) {
                                          break L130;
                                        } else {
                                          hn.field_c = true;
                                          break L130;
                                        }
                                      }
                                      var9_ref_je.field_a = true;
                                      var9_ref_je.field_E = true;
                                      uf.field_p[var7] = null;
                                      re.field_d = re.field_d + 1;
                                      var6++;
                                      var7++;
                                      continue L122;
                                    } else {
                                      var7++;
                                      continue L122;
                                    }
                                  } else {
                                    var7++;
                                    continue L122;
                                  }
                                } else {
                                  var7++;
                                  continue L122;
                                }
                              } else {
                                var7++;
                                continue L122;
                              }
                            }
                          }
                        } else {
                          break L120;
                        }
                      }
                    }
                    if (1 > this.field_g) {
                      break L118;
                    } else {
                      if ((this.field_b ^ -1) >= -6) {
                        break L118;
                      } else {
                        this.field_b = 0;
                        this.field_g = this.field_g + 1;
                        if (-6 <= (this.field_g ^ -1)) {
                          break L118;
                        } else {
                          return null;
                        }
                      }
                    }
                  } else {
                    break L118;
                  }
                }
                L131: {
                  if (10 != this.field_h) {
                    break L131;
                  } else {
                    L132: {
                      this.field_b = this.field_b + 1;
                      if ((this.field_b ^ -1) >= -251) {
                        break L132;
                      } else {
                        this.field_b = (int)(200.0 * Math.random());
                        this.field_g = this.field_g + 1;
                        break L132;
                      }
                    }
                    L133: {
                      if (3 != this.field_g) {
                        break L133;
                      } else {
                        this.field_g = 0;
                        break L133;
                      }
                    }
                    if (!sc.field_b) {
                      break L131;
                    } else {
                      if (q.field_b[this.field_n][this.field_p].field_i == 0) {
                        var4 = ca.field_k + -this.field_n;
                        var5 = -this.field_p + hf.field_t;
                        if (64 > var4 * var4 + var5 * var5) {
                          ag.a(param0, 21, this.field_p * 32, this.field_n * 32);
                          break L131;
                        } else {
                          break L131;
                        }
                      } else {
                        break L131;
                      }
                    }
                  }
                }
                L134: {
                  L135: {
                    if (this.field_h == 8) {
                      break L135;
                    } else {
                      if ((this.field_h ^ -1) == -11) {
                        break L135;
                      } else {
                        if (19 == this.field_h) {
                          break L135;
                        } else {
                          if (21 != this.field_h) {
                            if (je.c(this.field_n, this.field_p, 1, 1)) {
                              L136: {
                                if (this.field_m >= (int)(Math.random() * 5.0 + 1.0)) {
                                  break L136;
                                } else {
                                  this.field_m = this.field_m + 1;
                                  break L136;
                                }
                              }
                              L137: {
                                if (this.field_m <= (int)(5.0 * Math.random() + 1.0)) {
                                  break L137;
                                } else {
                                  this.field_m = this.field_m - 1;
                                  break L137;
                                }
                              }
                              L138: {
                                if (this.field_i < (int)(-2.0 + 5.0 * Math.random())) {
                                  this.field_i = this.field_i + 1;
                                  break L138;
                                } else {
                                  break L138;
                                }
                              }
                              if (this.field_i > (int)(-2.0 + Math.random() * 5.0)) {
                                this.field_i = this.field_i - 1;
                                break L134;
                              } else {
                                break L134;
                              }
                            } else {
                              if (this.field_m < 40) {
                                this.field_m = this.field_m + 1;
                                break L134;
                              } else {
                                break L134;
                              }
                            }
                          } else {
                            break L135;
                          }
                        }
                      }
                    }
                  }
                  L139: {
                    if (this.field_h == 19) {
                      break L139;
                    } else {
                      if (-22 != (this.field_h ^ -1)) {
                        break L134;
                      } else {
                        break L139;
                      }
                    }
                  }
                  if (je.c(this.field_n, this.field_p, 1, 1)) {
                    break L134;
                  } else {
                    if (this.field_m >= 40) {
                      break L134;
                    } else {
                      this.field_m = this.field_m + 1;
                      break L134;
                    }
                  }
                }
                L140: {
                  if (16 != this.field_h) {
                    L141: {
                      L142: {
                        this.field_k = this.field_k + this.field_i;
                        this.field_f = this.field_f + this.field_m;
                        if (this.field_p > -1 + je.field_t) {
                          break L142;
                        } else {
                          if (0 >= this.field_f) {
                            break L141;
                          } else {
                            if (!q.field_b[this.field_n][1 + this.field_p].g()) {
                              break L141;
                            } else {
                              break L142;
                            }
                          }
                        }
                      }
                      this.field_m = 0;
                      this.field_f = 0;
                      break L141;
                    }
                    L143: {
                      if (this.field_f >= 0) {
                        break L143;
                      } else {
                        if (this.field_m >= 0) {
                          break L143;
                        } else {
                          if (q.field_b[this.field_n][-1 + this.field_p].g()) {
                            this.field_m = 0;
                            this.field_f = 0;
                            break L143;
                          } else {
                            break L143;
                          }
                        }
                      }
                    }
                    L144: {
                      L145: {
                        if (Math.abs(this.field_k) >= Math.abs(this.field_f)) {
                          L146: {
                            if (this.field_k <= 80) {
                              break L146;
                            } else {
                              if (-1 >= (this.field_f ^ -1)) {
                                break L146;
                              } else {
                                if (this.field_m > 0) {
                                  break L146;
                                } else {
                                  if (!q.field_b[this.field_n - -1][-1 + this.field_p].g()) {
                                    if (this.field_k <= 40) {
                                      break L145;
                                    } else {
                                      if (!q.field_b[this.field_n - -1][this.field_p].g()) {
                                        break L145;
                                      } else {
                                        this.field_k = 40;
                                        break L145;
                                      }
                                    }
                                  } else {
                                    if (this.field_k <= 40) {
                                      break L145;
                                    } else {
                                      if (!q.field_b[this.field_n - -1][this.field_p].g()) {
                                        break L145;
                                      } else {
                                        this.field_k = 40;
                                        break L145;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (79 < (this.field_k ^ -1)) {
                            L147: {
                              if (-1 >= (this.field_f ^ -1)) {
                                break L147;
                              } else {
                                if (this.field_m > 0) {
                                  break L147;
                                } else {
                                  if (!q.field_b[-1 + this.field_n][-1 + this.field_p].g()) {
                                    break L147;
                                  } else {
                                    this.field_f = 0;
                                    this.field_m = 0;
                                    break L147;
                                  }
                                }
                              }
                            }
                            L148: {
                              if (-81 <= (this.field_k ^ -1)) {
                                break L148;
                              } else {
                                if (this.field_f > 0) {
                                  if (-1 < (this.field_m ^ -1)) {
                                    break L148;
                                  } else {
                                    if (q.field_b[this.field_n + 1][this.field_p + 1].g()) {
                                      this.field_m = 0;
                                      this.field_f = 0;
                                      break L148;
                                    } else {
                                      break L148;
                                    }
                                  }
                                } else {
                                  if (this.field_k <= 40) {
                                    break L145;
                                  } else {
                                    if (!q.field_b[this.field_n - -1][this.field_p].g()) {
                                      break L145;
                                    } else {
                                      this.field_k = 40;
                                      break L145;
                                    }
                                  }
                                }
                              }
                            }
                            if (-80 > this.field_k) {
                              if (0 < this.field_f) {
                                if (this.field_m >= 0) {
                                  L149: {
                                    if (q.field_b[-1 + this.field_n][this.field_p + 1].g()) {
                                      this.field_f = 0;
                                      this.field_m = 0;
                                      break L149;
                                    } else {
                                      break L149;
                                    }
                                  }
                                  if (this.field_k <= 40) {
                                    break L145;
                                  } else {
                                    if (!q.field_b[this.field_n - -1][this.field_p].g()) {
                                      break L145;
                                    } else {
                                      this.field_k = 40;
                                      break L145;
                                    }
                                  }
                                } else {
                                  if (this.field_k <= 40) {
                                    break L145;
                                  } else {
                                    if (!q.field_b[this.field_n - -1][this.field_p].g()) {
                                      break L145;
                                    } else {
                                      this.field_k = 40;
                                      break L145;
                                    }
                                  }
                                }
                              } else {
                                if (this.field_k <= 40) {
                                  break L145;
                                } else {
                                  if (!q.field_b[this.field_n - -1][this.field_p].g()) {
                                    break L145;
                                  } else {
                                    this.field_k = 40;
                                    break L145;
                                  }
                                }
                              }
                            } else {
                              if (this.field_k <= 40) {
                                break L145;
                              } else {
                                if (!q.field_b[this.field_n - -1][this.field_p].g()) {
                                  break L145;
                                } else {
                                  this.field_k = 40;
                                  break L145;
                                }
                              }
                            }
                          } else {
                            if (this.field_k <= 40) {
                              break L145;
                            } else {
                              if (!q.field_b[this.field_n - -1][this.field_p].g()) {
                                break L145;
                              } else {
                                this.field_k = 40;
                                break L145;
                              }
                            }
                          }
                        } else {
                          L150: {
                            if (80 >= this.field_k) {
                              break L150;
                            } else {
                              if ((this.field_f ^ -1) <= -1) {
                                break L150;
                              } else {
                                if (0 > this.field_i) {
                                  break L150;
                                } else {
                                  if (!q.field_b[1 + this.field_n][-1 + this.field_p].g()) {
                                    break L150;
                                  } else {
                                    if ((this.field_k ^ -1) <= 39) {
                                      break L144;
                                    } else {
                                      if (!q.field_b[-1 + this.field_n][this.field_p].g()) {
                                        break L144;
                                      } else {
                                        this.field_k = -40;
                                        break L144;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if ((this.field_k ^ -1) > 79) {
                            L151: {
                              if (-1 >= (this.field_f ^ -1)) {
                                break L151;
                              } else {
                                if ((this.field_i ^ -1) < -1) {
                                  break L151;
                                } else {
                                  if (!q.field_b[this.field_n - 1][-1 + this.field_p].g()) {
                                    break L151;
                                  } else {
                                    this.field_i = -this.field_i;
                                    this.field_k = -80;
                                    break L151;
                                  }
                                }
                              }
                            }
                            if (80 < this.field_k) {
                              if (this.field_f <= 0) {
                                if (79 >= (this.field_k ^ -1)) {
                                  if (this.field_k > 40) {
                                    if (!q.field_b[this.field_n - -1][this.field_p].g()) {
                                      break L145;
                                    } else {
                                      this.field_k = 40;
                                      break L145;
                                    }
                                  } else {
                                    if (this.field_k <= 40) {
                                      break L145;
                                    } else {
                                      if (!q.field_b[this.field_n - -1][this.field_p].g()) {
                                        break L145;
                                      } else {
                                        this.field_k = 40;
                                        break L145;
                                      }
                                    }
                                  }
                                } else {
                                  if (this.field_k <= 40) {
                                    break L145;
                                  } else {
                                    if (!q.field_b[this.field_n - -1][this.field_p].g()) {
                                      break L145;
                                    } else {
                                      this.field_k = 40;
                                      break L145;
                                    }
                                  }
                                }
                              } else {
                                if (this.field_i >= 0) {
                                  if (this.field_k <= 40) {
                                    break L145;
                                  } else {
                                    if (!q.field_b[this.field_n - -1][this.field_p].g()) {
                                      break L145;
                                    } else {
                                      this.field_k = 40;
                                      break L145;
                                    }
                                  }
                                } else {
                                  if (this.field_k <= 40) {
                                    break L145;
                                  } else {
                                    if (!q.field_b[this.field_n - -1][this.field_p].g()) {
                                      break L145;
                                    } else {
                                      this.field_k = 40;
                                      break L145;
                                    }
                                  }
                                }
                              }
                            } else {
                              if ((this.field_k ^ -1) <= 39) {
                                break L144;
                              } else {
                                if (!q.field_b[-1 + this.field_n][this.field_p].g()) {
                                  break L144;
                                } else {
                                  this.field_k = -40;
                                  break L144;
                                }
                              }
                            }
                          } else {
                            if ((this.field_k ^ -1) <= 39) {
                              break L144;
                            } else {
                              if (!q.field_b[-1 + this.field_n][this.field_p].g()) {
                                break L144;
                              } else {
                                this.field_k = -40;
                                break L144;
                              }
                            }
                          }
                        }
                      }
                      if ((this.field_k ^ -1) <= 39) {
                        break L144;
                      } else {
                        if (!q.field_b[-1 + this.field_n][this.field_p].g()) {
                          break L144;
                        } else {
                          this.field_k = -40;
                          break L144;
                        }
                      }
                    }
                    L152: {
                      if ((this.field_k ^ -1) < -161) {
                        this.field_k = this.field_k - 320;
                        this.field_n = this.field_n + 1;
                        break L152;
                      } else {
                        break L152;
                      }
                    }
                    L153: {
                      if ((this.field_k ^ -1) > 159) {
                        this.field_n = this.field_n - 1;
                        this.field_k = this.field_k + 320;
                        break L153;
                      } else {
                        break L153;
                      }
                    }
                    L154: {
                      if ((this.field_f ^ -1) < -161) {
                        this.field_f = this.field_f - 320;
                        this.field_p = this.field_p + 1;
                        break L154;
                      } else {
                        break L154;
                      }
                    }
                    if (this.field_f < -160) {
                      this.field_f = this.field_f + 320;
                      this.field_p = this.field_p - 1;
                      break L140;
                    } else {
                      break L140;
                    }
                  } else {
                    break L140;
                  }
                }
                return (gf) (this);
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(long param0, int param1) {
        if (!((param0 ^ -1L) < -1L)) {
            return;
        }
        if (param0 % 10L != 0L) {
            ng.a(param0, 1855635080);
        } else {
            ng.a(-1L + param0, 1855635080);
            ng.a(1L, param1 + 1855645389);
        }
        if (param1 != -10309) {
            field_a = (String[]) null;
        }
    }

    gf(int param0, int param1, int param2) {
        this.field_d = 0;
        this.field_i = 0;
        this.field_m = 0;
        this.field_k = 0;
        this.field_h = param2;
        this.field_n = param0;
        this.field_f = 0;
        this.field_b = 0;
        this.field_p = param1;
        this.field_o = 0;
        this.field_g = 0;
        if ((param2 ^ -1) > -6) {
            this.field_i = (int)(Math.random() * 40.0 - 20.0);
            this.field_m = (int)(-25.0 + 20.0 * -Math.random());
        }
        if (this.a(false)) {
            this.field_i = 1;
            q.field_b[this.field_n][this.field_p].field_a = false;
        }
    }

    static {
        field_a = new String[11];
    }
}
