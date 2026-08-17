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
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var9 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_m = -58;
                break L1;
              }
            }
            L2: {
              var2_int = 16 + (this.field_k / 10 + this.field_n * 32) - li.field_c;
              var3 = 16 + (this.field_f / 10 + this.field_p * 32) - db.field_d;
              var4 = q.field_b[this.field_n][this.field_p].field_i;
              if ((var4 ^ -1) <= -2) {
                break L2;
              } else {
                var4 = 1;
                break L2;
              }
            }
            L3: {
              if (255 >= var4) {
                break L3;
              } else {
                var4 = 255;
                break L3;
              }
            }
            L4: {
              if (this.field_d < var4) {
                this.field_d = this.field_d + 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var4 < this.field_d) {
                this.field_d = this.field_d - 1;
                break L5;
              } else {
                break L5;
              }
            }
            var5 = this.field_k / 10 + (32 * this.field_n - 32 * ca.field_k) + -(sk.field_d / 10);
            var6 = -(hf.field_t * 32) - (mf.field_i / 10 - this.field_p * 32 + -(this.field_f / 10));
            var7 = (int)Math.sqrt((double)(var6 * var6 + var5 * var5)) / this.field_d;
            var2_int = (int)((double)var2_int + (double)var7 * Math.sin((double)pa.field_d * 3.14 / 16384.0) / 3.0);
            var3 = (int)((double)var3 + Math.cos((double)pa.field_d * 3.14 / 16384.0) * (double)var7 / 3.0);
            var8 = 0;
            L6: while (true) {
              if (-5 >= (var8 ^ -1)) {
                break L0;
              } else {
                eh.f(var2_int, var3, -(var8 * 8) + 64, 16777215, 16);
                var8++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "gf.H(" + param0 + ')');
        }
    }

    final void c(int param0) {
        int stackIn_18_0 = 0;
        ea stackIn_27_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        var15 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (this.field_h == 19) {
                break L1;
              } else {
                if (-10 == (this.field_h ^ -1)) {
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (!q.field_b[this.field_n][this.field_p].field_V) {
                break L2;
              } else {
                L3: {
                  if (je.field_O.f(this.field_p, 2, this.field_n)) {
                    break L3;
                  } else {
                    if (!q.field_b[this.field_n][this.field_p].field_A) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if ((this.field_d ^ -1) >= -1) {
                    break L4;
                  } else {
                    var2_int = 32 * this.field_n + (this.field_k / 10 + -(sk.field_d / 10) + -(32 * ca.field_k));
                    var3 = this.field_f / 10 + (32 * this.field_p + (-(mf.field_i / 10) + -(32 * hf.field_t)));
                    var4 = (int)Math.sqrt((double)(var2_int * var2_int - -(var3 * var3))) / this.field_d;
                    if ((var4 ^ -1) < -101) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  var2_int = -li.field_c + 32 * this.field_n - -(this.field_k / 10);
                  var3 = -db.field_d + (this.field_p * 32 - -(this.field_f / 10));
                  if (!je.c(this.field_n, this.field_p, 1, 1)) {
                    stackIn_18_0 = 0;
                    break L5;
                  } else {
                    stackIn_18_0 = 1;
                    break L5;
                  }
                }
                L6: {
                  var4 = stackIn_18_0;
                  var5 = (this.field_c & 63) / 16;
                  if (-1 == (this.field_i ^ -1)) {
                    var5 = 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (19 != this.field_h) {
                    L8: {
                      var7 = 91 + this.field_j / 10 % 5;
                      if (0 > this.field_m) {
                        var7 = 59;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (this.field_m > 0) {
                        var7 = 60;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (-11 <= (this.field_m ^ -1)) {
                        break L10;
                      } else {
                        var7 = 61;
                        break L10;
                      }
                    }
                    var6 = pk.field_h[var7];
                    break L7;
                  } else {
                    L11: {
                      if (var4 != 0) {
                        stackIn_27_0 = vc.field_o[var5 + 4];
                        break L11;
                      } else {
                        stackIn_27_0 = vc.field_o[var5 + 0];
                        break L11;
                      }
                    }
                    var16 = stackIn_27_0;
                    var6 = var16;
                    var3 = var3 + (-var16.field_A + 32);
                    break L7;
                  }
                }
                L12: {
                  if (q.field_b[this.field_n][this.field_p].field_A) {
                    L13: {
                      var3 += 8;
                      if (this.field_i < 0) {
                        var6.e().a(var2_int, 32 + var3 - var6.field_A, 9348351);
                        break L13;
                      } else {
                        var6.a(var2_int, 32 + var3 - var6.field_A, 9348351);
                        break L13;
                      }
                    }
                    var3 -= 8;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var7 = 4 * this.field_n - (-(this.field_k / 80) + 1);
                var8 = -1 + (this.field_f / 80 + this.field_p * 4);
                var11 = -68 % ((-35 - param0) / 44);
                var9 = -li.field_c + var7 * 8;
                var10 = var8 * 8 + -db.field_d;
                var12 = 0;
                L14: while (true) {
                  if (-7 > (var12 ^ -1)) {
                    eh.a();
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var10 = -db.field_d + 8 * var8;
                    var13 = var8;
                    var14 = 0;
                    L15: while (true) {
                      if (-6 > (var14 ^ -1)) {
                        var9 += 8;
                        var7++;
                        var12++;
                        continue L14;
                      } else {
                        if (je.field_O.a(var7, var13, (byte) 61)) {
                          L16: {
                            eh.a(var9, var10, var9 + 8, var10 - -8);
                            if ((this.field_i ^ -1) <= -1) {
                              var6.f(var2_int, var3);
                              break L16;
                            } else {
                              var6.h(var2_int, var3);
                              break L16;
                            }
                          }
                          var13++;
                          var10 += 8;
                          var14++;
                          continue L15;
                        } else {
                          var13++;
                          var10 += 8;
                          var14++;
                          continue L15;
                        }
                      }
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
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "gf.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void b(int param0) {
        int stackIn_51_0 = 0;
        ea stackIn_55_0 = null;
        int stackIn_81_0 = 0;
        ea stackIn_87_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ea var5_ref_ea = null;
        ea var6 = null;
        int var7 = 0;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var2_int = this.field_k / 10 + (this.field_n * 32 - li.field_c);
              var3 = -db.field_d + (32 * this.field_p + this.field_f / 10);
              if (!this.a((byte) 103)) {
                break L1;
              } else {
                mb.field_d[this.field_h].f(var2_int, var3);
                break L1;
              }
            }
            L2: {
              if (param0 == -12) {
                break L2;
              } else {
                this.b(false);
                break L2;
              }
            }
            L3: {
              if (17 == this.field_h) {
                te.field_d[0].c(-16 + var2_int, var3, 128);
                break L3;
              } else {
                if (6 != this.field_h) {
                  L4: {
                    if (this.field_h == 7) {
                      break L4;
                    } else {
                      if (this.field_h == 15) {
                        break L4;
                      } else {
                        if (-19 == (this.field_h ^ -1)) {
                          break L4;
                        } else {
                          if ((this.field_h ^ -1) != -23) {
                            L5: {
                              if (20 == this.field_h) {
                                if (this.field_g != 0) {
                                  if (5 <= this.field_g) {
                                    break L5;
                                  } else {
                                    hk.field_a[this.field_g].f(-16 + var2_int, var3);
                                    break L3;
                                  }
                                } else {
                                  if ((this.field_b ^ -1) <= -251) {
                                    g.field_j[4].f(var2_int, var3);
                                    break L3;
                                  } else {
                                    g.field_j[5 * this.field_b / 250].f(var2_int, var3);
                                    break L3;
                                  }
                                }
                              } else {
                                if (-9 == (this.field_h ^ -1)) {
                                  wj.field_k[this.field_g].f(-16 + var2_int, var3 - 48);
                                  break L3;
                                } else {
                                  if (9 != this.field_h) {
                                    if (21 != this.field_h) {
                                      if (-20 == (this.field_h ^ -1)) {
                                        L6: {
                                          if (!je.c(this.field_n, this.field_p, 1, 1)) {
                                            stackIn_81_0 = 0;
                                            break L6;
                                          } else {
                                            stackIn_81_0 = 1;
                                            break L6;
                                          }
                                        }
                                        L7: {
                                          var4 = stackIn_81_0;
                                          var5 = (this.field_c & 63) / 16;
                                          if (this.field_i != 0) {
                                            break L7;
                                          } else {
                                            var5 = 0;
                                            break L7;
                                          }
                                        }
                                        L8: {
                                          if (var4 != 0) {
                                            stackIn_87_0 = ph.field_e[var5 + 4];
                                            break L8;
                                          } else {
                                            stackIn_87_0 = ph.field_e[var5 + 0];
                                            break L8;
                                          }
                                        }
                                        var6 = stackIn_87_0;
                                        if (-1 < (this.field_i ^ -1)) {
                                          var6.h(var2_int, -var6.field_A + 32 + var3);
                                          break L3;
                                        } else {
                                          var6.f(var2_int, 32 + (var3 - var6.field_A));
                                          break L3;
                                        }
                                      } else {
                                        if (10 != this.field_h) {
                                          if (12 > this.field_h) {
                                            break L5;
                                          } else {
                                            if ((this.field_h ^ -1) <= -17) {
                                              break L5;
                                            } else {
                                              L9: {
                                                var4 = q.field_b[this.field_n][this.field_p].field_i;
                                                if (0 <= var4) {
                                                  break L9;
                                                } else {
                                                  var4 = 0;
                                                  break L9;
                                                }
                                              }
                                              L10: {
                                                if ((var4 ^ -1) < -256) {
                                                  var4 = 255;
                                                  break L10;
                                                } else {
                                                  break L10;
                                                }
                                              }
                                              a.field_a[-12 + (this.field_h - -37)].c(var2_int, var3, var4);
                                              break L3;
                                            }
                                          }
                                        } else {
                                          if (q.field_b[this.field_n][this.field_p].field_i != 0) {
                                            break L5;
                                          } else {
                                            L11: {
                                              if (this.field_g == 1) {
                                                break L11;
                                              } else {
                                                if (this.field_b / 25 % 2 != 0) {
                                                  break L5;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                            if (q.field_b[this.field_n][this.field_p].field_V) {
                                              break L5;
                                            } else {
                                              a.field_a[62].f(var2_int, var3);
                                              break L3;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L12: {
                                        if (!je.c(this.field_n, this.field_p, 1, 1)) {
                                          stackIn_51_0 = 0;
                                          break L12;
                                        } else {
                                          stackIn_51_0 = 1;
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        var4 = stackIn_51_0;
                                        if (var4 == 0) {
                                          stackIn_55_0 = fi.field_b[0];
                                          break L13;
                                        } else {
                                          stackIn_55_0 = fi.field_b[1];
                                          break L13;
                                        }
                                      }
                                      var5_ref_ea = stackIn_55_0;
                                      if (0 > this.field_i) {
                                        var5_ref_ea.h(var2_int, -var5_ref_ea.field_A + (32 + var3));
                                        break L3;
                                      } else {
                                        var5_ref_ea.f(var2_int, var3 + (32 + -var5_ref_ea.field_A));
                                        break L3;
                                      }
                                    }
                                  } else {
                                    L14: {
                                      var4 = 91 + this.field_j / 10 % 5;
                                      if (this.field_m >= 0) {
                                        break L14;
                                      } else {
                                        var4 = 59;
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      if (0 >= this.field_m) {
                                        break L15;
                                      } else {
                                        var4 = 60;
                                        break L15;
                                      }
                                    }
                                    L16: {
                                      if (this.field_m > 10) {
                                        var4 = 61;
                                        break L16;
                                      } else {
                                        break L16;
                                      }
                                    }
                                    if (0 <= this.field_i) {
                                      a.field_a[var4].f(var2_int, var3);
                                      break L3;
                                    } else {
                                      a.field_a[var4].h(var2_int, var3);
                                      break L3;
                                    }
                                  }
                                }
                              }
                            }
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if (0 != this.field_g) {
                    te.field_d[4 + this.field_g].f(-16 + var2_int, var3);
                    break L3;
                  } else {
                    if ((this.field_b ^ -1) > -251) {
                      ne.field_O[this.field_b * 5 / 250].f(var2_int, var3);
                      break L3;
                    } else {
                      ne.field_O[4].f(var2_int, var3);
                      break L3;
                    }
                  }
                } else {
                  if (-1 != (this.field_g ^ -1)) {
                    te.field_d[4 + this.field_g].f(-16 + var2_int, var3);
                    break L3;
                  } else {
                    if (!je.c(this.field_n, this.field_p, 3, 3)) {
                      if (-241 >= (this.field_b ^ -1)) {
                        te.field_d[1].f(-16 + var2_int, var3);
                        break L3;
                      } else {
                        te.field_d[0].f(-16 + var2_int, var3);
                        te.field_d[this.field_b / 10 % 3 - -2].f(-16 + var2_int + -(3 * this.field_b / 250), this.field_b * 3 / 250 + var3);
                        break L3;
                      }
                    } else {
                      te.field_d[0].c(var2_int - 16, var3, 128);
                      break L3;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "gf.F(" + param0 + ')');
        }
    }

    final boolean a(boolean param0) {
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                L2: {
                  if (-10 == (this.field_h ^ -1)) {
                    break L2;
                  } else {
                    if (19 == this.field_h) {
                      break L2;
                    } else {
                      if ((this.field_h ^ -1) != -22) {
                        stackIn_10_0 = 0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackIn_10_0 = 1;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "gf.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    private final boolean a(byte param0) {
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 92) {
                break L1;
              } else {
                this.field_f = -74;
                break L1;
              }
            }
            L2: {
              if (-7 >= (this.field_h ^ -1)) {
                stackIn_6_0 = 0;
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "gf.I(" + param0 + ')');
        }
        return stackIn_6_0 != 0;
    }

    private final void a(int param0, boolean param1) {
        int fieldTemp$0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              this.field_j = this.field_j + 1;
              if (-101 <= (this.field_j ^ -1)) {
                break L1;
              } else {
                this.field_j = this.field_j - 100;
                break L1;
              }
            }
            L2: {
              if (!je.c(this.field_n, this.field_p, 1, 1)) {
                break L2;
              } else {
                if (q.field_b[this.field_n][this.field_p + 1].g()) {
                  this.field_m = this.field_m - 40;
                  break L2;
                } else {
                  this.field_m = this.field_m - 20;
                  break L2;
                }
              }
            }
            L3: {
              if (!q.field_b[1 + this.field_n][this.field_p].field_a) {
                break L3;
              } else {
                this.field_b = this.field_b + 1;
                if (-251 <= (this.field_b ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if (100.0 * Math.random() >= 50.0) {
                      break L4;
                    } else {
                      L5: {
                        stackIn_14_0 = 1;

                        if (q.field_b[1 + this.field_n][1 + this.field_p].field_b) {
                          stackIn_15_0 = stackIn_14_0;
                          stackIn_15_1 = 0;
                          break L5;
                        } else {
                          stackIn_15_0 = stackIn_14_0;
                          stackIn_15_1 = 1;
                          break L5;
                        }
                      }
                      if (stackIn_15_0 != stackIn_15_1) {
                        break L4;
                      } else {
                        q.field_b[this.field_n - -1][1 + this.field_p].field_a = false;
                        uf.field_p[jf.b((byte) 97)] = new gf(this.field_n - -1, this.field_p - -1, 8);
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (100.0 * Math.random() >= 50.0) {
                      break L6;
                    } else {
                      if (q.field_b[1 + this.field_n][this.field_p + -1].field_b) {
                        break L6;
                      } else {
                        q.field_b[1 + this.field_n][-1 + this.field_p].field_a = false;
                        uf.field_p[jf.b((byte) 59)] = new gf(this.field_n - -1, this.field_p + -1, 8);
                        break L6;
                      }
                    }
                  }
                  if (100.0 * Math.random() < 50.0) {
                    if ((this.field_n ^ -1) > -31) {
                      L7: {
                        stackIn_29_0 = 0;

                        if (q.field_b[this.field_n - -1][this.field_p].field_b) {
                          stackIn_30_0 = stackIn_29_0;
                          stackIn_30_1 = 0;
                          break L7;
                        } else {
                          stackIn_30_0 = stackIn_29_0;
                          stackIn_30_1 = 1;
                          break L7;
                        }
                      }
                      if (stackIn_30_0 == stackIn_30_1) {
                        this.field_m = -40;
                        break L3;
                      } else {
                        q.field_b[1 + this.field_n][this.field_p].field_a = false;
                        uf.field_p[jf.b((byte) 95)] = new gf(this.field_n - -1, this.field_p, 8);
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
            }
            L8: {
              if (q.field_b[this.field_n + -1][this.field_p].field_a) {
                this.field_b = this.field_b + 1;
                if ((this.field_b ^ -1) < -251) {
                  L9: {
                    if (50.0 <= 100.0 * Math.random()) {
                      break L9;
                    } else {
                      if (!q.field_b[-1 + this.field_n][this.field_p - -1].field_b) {
                        q.field_b[this.field_n - 1][1 + this.field_p].field_a = false;
                        uf.field_p[jf.b((byte) 114)] = new gf(this.field_n + 1, this.field_p - -1, 8);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (50.0 <= Math.random() * 100.0) {
                      break L10;
                    } else {
                      if (!q.field_b[this.field_n + -1][this.field_p - 1].field_b) {
                        q.field_b[this.field_n - 1][this.field_p - 1].field_a = false;
                        uf.field_p[jf.b((byte) 76)] = new gf(1 + this.field_n, this.field_p - 1, 8);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (50.0 > 100.0 * Math.random()) {
                    if ((this.field_n ^ -1) < -2) {
                      if (q.field_b[this.field_n - 1][this.field_p].field_b) {
                        this.field_m = -40;
                        break L8;
                      } else {
                        q.field_b[-1 + this.field_n][this.field_p].field_a = false;
                        uf.field_p[jf.b((byte) 64)] = new gf(this.field_n + -1, this.field_p, 8);
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L11: {
              if ((this.field_b ^ -1) >= -251) {
                break L11;
              } else {
                L12: {
                  if (!q.field_b[this.field_n][this.field_p - -1].field_a) {
                    if ((this.field_k ^ -1) < -21) {
                      this.field_k = this.field_k - 10;
                      break L12;
                    } else {
                      if (this.field_k >= -20) {
                        break L12;
                      } else {
                        this.field_k = this.field_k + 10;
                        break L12;
                      }
                    }
                  } else {
                    break L12;
                  }
                }
                this.field_b = this.field_b - 250;
                break L11;
              }
            }
            L13: {
              fieldTemp$0 = this.field_o;
              this.field_o = this.field_o + 1;
              if (600 < fieldTemp$0) {
                if ((q.field_b[this.field_n][this.field_p].field_i ^ -1) > -121) {
                  var3_int = 0;
                  var4 = 0;
                  L14: while (true) {
                    L15: {
                      if (var4 >= uf.field_p.length) {
                        break L15;
                      } else {
                        L16: {
                          if (null == uf.field_p[var4]) {
                            break L16;
                          } else {
                            if ((uf.field_p[var4].field_h ^ -1) == -11) {
                              var5 = -this.field_n + uf.field_p[var4].field_n;
                              var6 = uf.field_p[var4].field_p + -this.field_p;
                              if (-37 < (var5 * var5 + var6 * var6 ^ -1)) {
                                uf.field_p[var4].field_n = this.field_n;
                                uf.field_p[var4].field_p = this.field_p;
                                var3_int = 1;
                                break L15;
                              } else {
                                break L16;
                              }
                            } else {
                              break L16;
                            }
                          }
                        }
                        var4++;
                        continue L14;
                      }
                    }
                    L17: {
                      if (var3_int != 0) {
                        break L17;
                      } else {
                        uf.field_p[jf.b((byte) 117)] = new gf(this.field_n, this.field_p, 10);
                        break L17;
                      }
                    }
                    this.field_o = 0;
                    break L13;
                  }
                } else {
                  break L13;
                }
              } else {
                break L13;
              }
            }
            L18: {
              if (-121 > (q.field_b[this.field_n][this.field_p].field_i ^ -1)) {
                L19: {
                  if (ca.field_k <= this.field_n) {
                    break L19;
                  } else {
                    if ((this.field_i ^ -1) <= -41) {
                      break L19;
                    } else {
                      this.field_i = this.field_i + 2;
                      break L19;
                    }
                  }
                }
                L20: {
                  if (hf.field_t >= this.field_p) {
                    break L20;
                  } else {
                    if (!param1) {
                      break L20;
                    } else {
                      this.field_m = -40;
                      break L20;
                    }
                  }
                }
                L21: {
                  if (this.field_n <= ca.field_k) {
                    break L21;
                  } else {
                    if (this.field_i > -40) {
                      this.field_i = this.field_i - 2;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                L22: {
                  if (!sc.field_b) {
                    break L22;
                  } else {
                    if (!q.field_b[this.field_n][this.field_p].field_V) {
                      break L22;
                    } else {
                      ag.a(true, 1, 32 * this.field_p, 32 * this.field_n);
                      break L22;
                    }
                  }
                }
                if (ca.field_k != this.field_n) {
                  break L18;
                } else {
                  if (this.field_p != hf.field_t) {
                    break L18;
                  } else {
                    if (il.e(param0 ^ -10296)) {
                      break L18;
                    } else {
                      rj.a((byte) -38, 7);
                      break L18;
                    }
                  }
                }
              } else {
                if (this.field_g != 0) {
                  L23: {
                    if (-10 < this.field_i) {
                      this.field_i = this.field_i - 2;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  if (q.field_b[-1 + this.field_n][this.field_p].field_a) {
                    this.field_g = 0;
                    break L18;
                  } else {
                    break L18;
                  }
                } else {
                  L24: {
                    if (10 > this.field_i) {
                      this.field_i = this.field_i + 2;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  if (q.field_b[1 + this.field_n][this.field_p].field_a) {
                    this.field_g = 1;
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
            }
            if (param0 == 21161) {
              L25: {
                L26: {
                  if (q.field_b[this.field_n][this.field_p].field_a) {
                    break L26;
                  } else {
                    if (!je.field_O.b(this.field_n, this.field_p, (byte) 50)) {
                      if (-1 <= (je.e(this.field_n, this.field_p, 1, 1) ^ -1)) {
                        break L25;
                      } else {
                        this.field_b = 0;
                        this.field_h = 8;
                        this.field_g = 0;
                        break L25;
                      }
                    } else {
                      break L26;
                    }
                  }
                }
                this.field_b = 250;
                this.field_h = 16;
                this.field_g = 0;
                break L25;
              }
              L27: {
                if (39 < (this.field_m ^ -1)) {
                  this.field_m = -40;
                  break L27;
                } else {
                  break L27;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3), "gf.G(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void c(boolean param0) {
        int fieldTemp$0 = 0;
        int stackIn_10_0 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_129_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              this.field_c = this.field_c + 1;
              if (!sc.field_b) {
                break L1;
              } else {
                if (q.field_b[this.field_n][this.field_p].field_V) {
                  ag.a(true, 32, this.field_p * 32, 32 * this.field_n);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (120 >= q.field_b[this.field_n][this.field_p].field_i) {
                stackIn_10_0 = 0;
                break L2;
              } else {
                stackIn_10_0 = 1;
                break L2;
              }
            }
            L3: {
              var2_int = stackIn_10_0;
              if (-33 <= (this.field_l ^ -1)) {
                break L3;
              } else {
                L4: {
                  L5: {
                    if (var2_int == 0) {
                      break L5;
                    } else {
                      if (!this.field_e) {
                        ne.a(44, 58);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (var2_int != 0) {
                    break L4;
                  } else {
                    if (!this.field_e) {
                      break L4;
                    } else {
                      ne.a(45, 69);
                      break L4;
                    }
                  }
                }
                this.field_l = 0;
                break L3;
              }
            }
            L6: {
              stackIn_22_0 = this;

              if (var2_int == 0) {
                stackIn_23_0 = this;
                stackIn_23_1 = 0;
                break L6;
              } else {
                stackIn_23_0 = this;
                stackIn_23_1 = 1;
                break L6;
              }
            }
            L7: {
              ((gf) (this)).field_e = stackIn_23_1 != 0;
              if (var2_int != 0) {
                if (this.field_p < hf.field_t) {
                  stackIn_29_0 = 1;
                  break L7;
                } else {
                  stackIn_29_0 = 0;
                  break L7;
                }
              } else {
                stackIn_29_0 = 0;
                break L7;
              }
            }
            L8: {
              var3 = stackIn_29_0;
              if (q.field_b[this.field_n - -1][this.field_p].field_a) {
                this.field_b = this.field_b + 1;
                if (-151 <= (this.field_b ^ -1)) {
                  break L8;
                } else {
                  if (50.0 > Math.random() * 100.0) {
                    if (-31 >= (this.field_n ^ -1)) {
                      break L8;
                    } else {
                      if (q.field_b[1 + this.field_n][this.field_p].field_b) {
                        break L8;
                      } else {
                        q.field_b[1 + this.field_n][this.field_p].field_a = false;
                        uf.field_p[jf.b((byte) 71)] = new gf(this.field_n + 1, this.field_p, 8);
                        break L8;
                      }
                    }
                  } else {
                    break L8;
                  }
                }
              } else {
                if (var3 == 0) {
                  break L8;
                } else {
                  if (q.field_b[this.field_n + 1][1 + this.field_p].field_a) {
                    this.field_b = this.field_b + 1;
                    if (150 >= this.field_b) {
                      break L8;
                    } else {
                      if (50.0 <= Math.random() * 100.0) {
                        break L8;
                      } else {
                        if (this.field_n >= 30) {
                          break L8;
                        } else {
                          L9: {
                            stackIn_40_0 = 1;

                            if (q.field_b[this.field_n + 1][1 + this.field_p].field_b) {
                              stackIn_41_0 = stackIn_40_0;
                              stackIn_41_1 = 0;
                              break L9;
                            } else {
                              stackIn_41_0 = stackIn_40_0;
                              stackIn_41_1 = 1;
                              break L9;
                            }
                          }
                          if (stackIn_41_0 != stackIn_41_1) {
                            break L8;
                          } else {
                            q.field_b[1 + this.field_n][this.field_p - -1].field_a = false;
                            uf.field_p[jf.b((byte) 95)] = new gf(this.field_n - -1, this.field_p - -1, 8);
                            break L8;
                          }
                        }
                      }
                    }
                  } else {
                    break L8;
                  }
                }
              }
            }
            L10: {
              if (q.field_b[-1 + this.field_n][this.field_p].field_a) {
                this.field_b = this.field_b + 1;
                if (this.field_b > 150) {
                  if (50.0 > Math.random() * 100.0) {
                    if ((this.field_n ^ -1) < -2) {
                      if (q.field_b[-1 + this.field_n][this.field_p].field_b) {
                        break L10;
                      } else {
                        q.field_b[-1 + this.field_n][this.field_p].field_a = false;
                        uf.field_p[jf.b((byte) 63)] = new gf(this.field_n - 1, this.field_p, 8);
                        break L10;
                      }
                    } else {
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              } else {
                if (var3 == 0) {
                  break L10;
                } else {
                  if (!q.field_b[this.field_n + -1][this.field_p + 1].field_a) {
                    break L10;
                  } else {
                    this.field_b = this.field_b + 1;
                    if (150 < this.field_b) {
                      if (50.0 <= Math.random() * 100.0) {
                        break L10;
                      } else {
                        if (this.field_n >= 30) {
                          break L10;
                        } else {
                          if (q.field_b[this.field_n + -1][1 + this.field_p].field_b) {
                            break L10;
                          } else {
                            q.field_b[this.field_n - 1][1 + this.field_p].field_a = false;
                            uf.field_p[jf.b((byte) 111)] = new gf(-1 + this.field_n, 1 + this.field_p, 8);
                            break L10;
                          }
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                }
              }
            }
            L11: {
              if ((this.field_b ^ -1) >= -151) {
                break L11;
              } else {
                L12: {
                  if (!q.field_b[this.field_n][this.field_p + 1].field_a) {
                    if ((this.field_k ^ -1) < -21) {
                      this.field_k = this.field_k - 10;
                      break L12;
                    } else {
                      if (19 < (this.field_k ^ -1)) {
                        this.field_k = this.field_k + 10;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  } else {
                    break L12;
                  }
                }
                this.field_b = this.field_b - 150;
                break L11;
              }
            }
            L13: {
              fieldTemp$0 = this.field_o;
              this.field_o = this.field_o + 1;
              if (-601 > (fieldTemp$0 ^ -1)) {
                if (q.field_b[this.field_n][this.field_p].field_i < 120) {
                  var4 = 0;
                  var5 = 0;
                  L14: while (true) {
                    L15: {
                      if (var5 >= uf.field_p.length) {
                        break L15;
                      } else {
                        L16: {
                          if (null == uf.field_p[var5]) {
                            break L16;
                          } else {
                            if (10 != uf.field_p[var5].field_h) {
                              break L16;
                            } else {
                              var6 = uf.field_p[var5].field_n - this.field_n;
                              var7 = uf.field_p[var5].field_p - this.field_p;
                              if (-37 >= (var6 * var6 - -(var7 * var7) ^ -1)) {
                                break L16;
                              } else {
                                uf.field_p[var5].field_n = this.field_n;
                                var4 = 1;
                                uf.field_p[var5].field_p = this.field_p;
                                break L15;
                              }
                            }
                          }
                        }
                        var5++;
                        continue L14;
                      }
                    }
                    L17: {
                      if (var4 == 0) {
                        uf.field_p[jf.b((byte) 93)] = new gf(this.field_n, this.field_p, 10);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    this.field_o = 0;
                    break L13;
                  }
                } else {
                  break L13;
                }
              } else {
                break L13;
              }
            }
            L18: {
              var4 = 40;
              var5 = 2;
              if (!je.c(this.field_n, this.field_p, 1, 2)) {
                stackIn_106_0 = 0;
                break L18;
              } else {
                stackIn_106_0 = 1;
                break L18;
              }
            }
            L19: {
              var6 = stackIn_106_0;
              if (var6 == 0) {
                var4 = 6;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (!je.c(this.field_n, this.field_p + -1, 1, 1)) {
                stackIn_113_0 = 0;
                break L20;
              } else {
                stackIn_113_0 = 1;
                break L20;
              }
            }
            var7 = stackIn_113_0;
            if (param0) {
              L21: {
                if (var2_int == 0) {
                  L22: {
                    if (0 == this.field_g) {
                      L23: {
                        if (-11 < (this.field_i ^ -1)) {
                          this.field_i = this.field_i + var5;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      L24: {
                        if (q.field_b[this.field_n + 1][this.field_p].field_a) {
                          break L24;
                        } else {
                          if (q.field_b[1 + this.field_n][this.field_p].field_b) {
                            break L24;
                          } else {
                            break L22;
                          }
                        }
                      }
                      this.field_g = 1;
                      break L22;
                    } else {
                      L25: {
                        if (-10 < this.field_i) {
                          this.field_i = this.field_i - var5;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      L26: {
                        if (q.field_b[-1 + this.field_n][this.field_p].field_a) {
                          break L26;
                        } else {
                          if (!q.field_b[this.field_n + -1][this.field_p].field_b) {
                            break L22;
                          } else {
                            break L26;
                          }
                        }
                      }
                      this.field_g = 0;
                      break L22;
                    }
                  }
                  if (var6 == 0) {
                    break L21;
                  } else {
                    var8 = Math.sin((double)(100 * this.field_c));
                    if (0.0 < var8) {
                      L27: {
                        if (-var4 < this.field_m) {
                          this.field_m = this.field_m - 1;
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      if (var7 == 0) {
                        this.field_m = 0;
                        break L21;
                      } else {
                        break L21;
                      }
                    } else {
                      if (var4 <= this.field_m) {
                        break L21;
                      } else {
                        this.field_m = this.field_m + 1;
                        break L21;
                      }
                    }
                  }
                } else {
                  L28: {
                    L29: {
                      if (-1 + this.field_p <= hf.field_t) {
                        break L29;
                      } else {
                        if (var6 != 0) {
                          break L29;
                        } else {
                          stackIn_121_0 = 1;
                          break L28;
                        }
                      }
                    }
                    stackIn_121_0 = 0;
                    break L28;
                  }
                  L30: {
                    var8_int = stackIn_121_0;
                    if (3 <= Math.abs(ca.field_k + -this.field_n)) {
                      stackIn_125_0 = 0;
                      break L30;
                    } else {
                      stackIn_125_0 = 1;
                      break L30;
                    }
                  }
                  L31: {
                    var9 = stackIn_125_0;
                    if (-6 < (Math.abs(ca.field_k + -this.field_n) ^ -1)) {
                      stackIn_129_0 = 0;
                      break L31;
                    } else {
                      stackIn_129_0 = 1;
                      break L31;
                    }
                  }
                  L32: {
                    var10 = stackIn_129_0;
                    if (ca.field_k <= this.field_n) {
                      break L32;
                    } else {
                      if (this.field_i >= var4) {
                        break L32;
                      } else {
                        if (var8_int == 0) {
                          this.field_i = this.field_i + var5;
                          break L32;
                        } else {
                          if (var9 != 0) {
                            this.field_i = this.field_i - var5;
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                      }
                    }
                  }
                  L33: {
                    if (this.field_n <= ca.field_k) {
                      break L33;
                    } else {
                      if (this.field_i <= -var4) {
                        break L33;
                      } else {
                        if (var8_int != 0) {
                          if (var9 != 0) {
                            this.field_i = this.field_i + var5;
                            break L33;
                          } else {
                            break L33;
                          }
                        } else {
                          this.field_i = this.field_i - var5;
                          break L33;
                        }
                      }
                    }
                  }
                  L34: {
                    if (var8_int == 0) {
                      break L34;
                    } else {
                      if (this.field_i == 0) {
                        L35: {
                          if (var10 != 0) {
                            L36: {
                              if (this.field_n <= ca.field_k) {
                                break L36;
                              } else {
                                if (-var4 >= this.field_i) {
                                  break L36;
                                } else {
                                  this.field_i = this.field_i - var5;
                                  break L36;
                                }
                              }
                            }
                            if (ca.field_k <= this.field_n) {
                              break L35;
                            } else {
                              if (this.field_i < var4) {
                                this.field_i = this.field_i + var5;
                                break L35;
                              } else {
                                break L35;
                              }
                            }
                          } else {
                            break L35;
                          }
                        }
                        if (var9 != 0) {
                          L37: {
                            if (ca.field_k >= this.field_n) {
                              break L37;
                            } else {
                              if (this.field_i >= var4) {
                                break L37;
                              } else {
                                this.field_i = this.field_i + var5;
                                break L37;
                              }
                            }
                          }
                          if (this.field_n >= ca.field_k) {
                            break L34;
                          } else {
                            if (-var4 >= this.field_i) {
                              break L34;
                            } else {
                              this.field_i = this.field_i - var5;
                              break L34;
                            }
                          }
                        } else {
                          break L34;
                        }
                      } else {
                        break L34;
                      }
                    }
                  }
                  L38: {
                    if (-var4 > this.field_i) {
                      this.field_i = -var4;
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                  L39: {
                    if (var4 >= this.field_i) {
                      break L39;
                    } else {
                      this.field_i = var4;
                      break L39;
                    }
                  }
                  L40: {
                    if (hf.field_t >= this.field_p) {
                      break L40;
                    } else {
                      if (var6 == 0) {
                        break L40;
                      } else {
                        if (this.field_m <= -var4) {
                          break L40;
                        } else {
                          this.field_m = this.field_m - 1;
                          if (var7 == 0) {
                            L41: {
                              if ((-hf.field_t + this.field_p ^ -1) < -3) {
                                break L41;
                              } else {
                                if ((Math.abs(ca.field_k - this.field_n) ^ -1) < -4) {
                                  break L41;
                                } else {
                                  this.field_m = 3 * -var4 / 2;
                                  break L40;
                                }
                              }
                            }
                            this.field_m = 0;
                            break L40;
                          } else {
                            break L40;
                          }
                        }
                      }
                    }
                  }
                  L42: {
                    if (this.field_m < -var4 * 4) {
                      this.field_m = 4 * -var4;
                      break L42;
                    } else {
                      break L42;
                    }
                  }
                  L43: {
                    if (hf.field_t <= this.field_p) {
                      break L43;
                    } else {
                      if (var6 == 0) {
                        break L43;
                      } else {
                        if (var4 > this.field_m) {
                          this.field_m = this.field_m + 1;
                          break L43;
                        } else {
                          break L43;
                        }
                      }
                    }
                  }
                  L44: {
                    if (!sc.field_b) {
                      break L44;
                    } else {
                      if (!q.field_b[this.field_n][this.field_p].field_V) {
                        break L44;
                      } else {
                        ag.a(true, 32, this.field_p * 32, 32 * this.field_n);
                        break L44;
                      }
                    }
                  }
                  if (this.field_n != ca.field_k) {
                    break L21;
                  } else {
                    if (hf.field_t != this.field_p) {
                      break L21;
                    } else {
                      if (il.e(-31391)) {
                        break L21;
                      } else {
                        rj.a((byte) -38, 10);
                        break L21;
                      }
                    }
                  }
                }
              }
              L45: {
                L46: {
                  if (q.field_b[this.field_n][this.field_p].field_a) {
                    break L46;
                  } else {
                    if (je.field_O.b(this.field_n, this.field_p, (byte) 120)) {
                      break L46;
                    } else {
                      break L45;
                    }
                  }
                }
                hn.field_c = true;
                this.field_h = 16;
                this.field_b = 250;
                this.field_g = 0;
                break L45;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "gf.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 >= -90) {
            return;
        }
        try {
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "gf.E(" + param0 + ')');
        }
    }

    final gf d(boolean param0) {
        boolean discarded$0 = false;
        gf stackIn_41_0 = null;
        gf stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_192_0 = 0;
        Object stackIn_216_0 = null;
        Object stackIn_219_0 = null;
        Object stackIn_221_0 = null;
        int stackIn_242_0 = 0;
        Object stackIn_252_0 = null;
        Object stackIn_253_0 = null;
        int stackIn_253_1 = 0;
        int stackIn_256_0 = 0;
        int stackIn_259_0 = 0;
        int stackIn_267_0 = 0;
        int stackIn_271_0 = 0;
        Object stackIn_316_0 = null;
        Object stackIn_350_0 = null;
        Object stackIn_366_0 = null;
        Object stackIn_373_0 = null;
        Object stackIn_386_0 = null;
        je stackIn_509_0 = null;
        je stackIn_510_0 = null;
        int stackIn_510_1 = 0;
        Object stackIn_612_0 = null;
        Object stackIn_642_0 = null;
        gf stackIn_667_0 = null;
        gf stackIn_668_0 = null;
        int stackIn_668_1 = 0;
        Object stackIn_855_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        var16 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (-2 >= (this.field_n ^ -1)) {
              if (31 > this.field_n) {
                if (-2 >= (this.field_p ^ -1)) {
                  if (je.field_t - 1 > this.field_p) {
                    L1: {
                      this.field_l = this.field_l + 1;
                      this.field_c = this.field_c + 1;
                      var2_int = 0;
                      if (8 != this.field_h) {
                        break L1;
                      } else {
                        this.field_b = this.field_b + 1;
                        if ((this.field_b ^ -1) >= -6) {
                          break L1;
                        } else {
                          this.field_g = this.field_g + 1;
                          this.field_b = 0;
                          if (3 >= this.field_g) {
                            break L1;
                          } else {
                            return null;
                          }
                        }
                      }
                    }
                    L2: {
                      if ((this.field_h ^ -1) != -12) {
                        break L2;
                      } else {
                        this.field_b = 0;
                        var3 = 0;
                        L3: while (true) {
                          if (var3 != 0) {
                            L4: {
                              if (0 <= this.field_g) {
                                this.field_h = 6;
                                this.field_b = 250;
                                break L4;
                              } else {
                                this.field_b = 0;
                                this.field_h = 8;
                                break L4;
                              }
                            }
                            this.field_g = 0;
                            break L2;
                          } else {
                            L5: {
                              L6: {
                                this.field_n = this.field_n + this.field_i;
                                this.field_b = this.field_b + 1;
                                if ((this.field_n ^ -1) >= -1) {
                                  break L6;
                                } else {
                                  if (-32 >= (this.field_n ^ -1)) {
                                    break L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var3 = 1;
                              break L5;
                            }
                            L7: {
                              if (!je.field_I[this.field_n][this.field_p].field_a) {
                                break L7;
                              } else {
                                var3 = 1;
                                break L7;
                              }
                            }
                            L8: {
                              if (this.field_b <= 6) {
                                break L8;
                              } else {
                                var3 = 1;
                                break L8;
                              }
                            }
                            if (0 <= this.field_g) {
                              var4 = 0;
                              L9: while (true) {
                                if ((var4 ^ -1) <= -1001) {
                                  continue L3;
                                } else {
                                  if (null != uf.field_p[var4]) {
                                    L10: {
                                      stackIn_41_0 = uf.field_p[var4];

                                      if (param0) {
                                        stackIn_42_0 = (gf) ((Object) stackIn_41_0);
                                        stackIn_42_1 = 0;
                                        break L10;
                                      } else {
                                        stackIn_42_0 = (gf) ((Object) stackIn_41_0);
                                        stackIn_42_1 = 1;
                                        break L10;
                                      }
                                    }
                                    L11: {
                                      if (((gf) (Object) stackIn_42_0).a(stackIn_42_1 != 0)) {
                                        if (uf.field_p[var4].field_n >= this.field_n + -1) {
                                          if (this.field_p - 1 <= uf.field_p[var4].field_p) {
                                            if (uf.field_p[var4].field_n <= 1 + this.field_n) {
                                              if (this.field_p - -1 >= uf.field_p[var4].field_p) {
                                                L12: {
                                                  var3 = 1;
                                                  if (-20 == (uf.field_p[var4].field_h ^ -1)) {
                                                    hn.field_c = true;
                                                    break L12;
                                                  } else {
                                                    break L12;
                                                  }
                                                }
                                                uf.field_p[var4].field_h = 6;
                                                uf.field_p[var4].field_b = 250;
                                                break L11;
                                              } else {
                                                break L11;
                                              }
                                            } else {
                                              var4++;
                                              continue L9;
                                            }
                                          } else {
                                            var4++;
                                            continue L9;
                                          }
                                        } else {
                                          var4++;
                                          continue L9;
                                        }
                                      } else {
                                        break L11;
                                      }
                                    }
                                    var4++;
                                    continue L9;
                                  } else {
                                    var4++;
                                    continue L9;
                                  }
                                }
                              }
                            } else {
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    L13: {
                      if (-1 < (this.field_f ^ -1)) {
                        break L13;
                      } else {
                        if (this.field_m >= 0) {
                          L14: {
                            if (!q.field_b[this.field_n][this.field_p + 1].g()) {
                              break L14;
                            } else {
                              var2_int = 1;
                              break L14;
                            }
                          }
                          L15: {
                            if (-80 <= this.field_k) {
                              break L15;
                            } else {
                              if (!q.field_b[-1 + this.field_n][this.field_p + 1].g()) {
                                break L15;
                              } else {
                                var2_int = 1;
                                break L15;
                              }
                            }
                          }
                          if (this.field_k <= 80) {
                            break L13;
                          } else {
                            if (q.field_b[this.field_n + 1][this.field_p + 1].g()) {
                              var2_int = 1;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    L16: {
                      L17: {
                        var3 = ne.a(false);
                        if (this.a((byte) 122)) {
                          break L17;
                        } else {
                          if (-13 < (this.field_h ^ -1)) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      if ((this.field_h ^ -1) <= -16) {
                        break L16;
                      } else {
                        L18: {
                          if (12 > this.field_h) {
                            break L18;
                          } else {
                            if (15 == this.field_h) {
                              break L18;
                            } else {
                              if (!ni.a(13, 11764)) {
                                var4 = -this.field_n + ca.field_k;
                                var5 = -this.field_p + hf.field_t;
                                if ((var4 * var4 + var5 * var5 ^ -1) > -26) {
                                  ag.a(true, 13, 32 * this.field_p, this.field_n * 32);
                                  break L18;
                                } else {
                                  break L18;
                                }
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        if (this.field_n != ca.field_k) {
                          break L16;
                        } else {
                          if (hf.field_t != this.field_p) {
                            break L16;
                          } else {
                            cl.field_I = 0;
                            if (!this.a((byte) 125)) {
                              L19: {
                                qf.field_p = qf.field_p + 1;
                                if (!ke.field_V) {
                                  break L19;
                                } else {
                                  if (qf.field_p == 5) {
                                    fn.a(9, 246, 3);
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              L20: {
                                this.field_h = 4;
                                if (-2 != (cm.field_o ^ -1)) {
                                  stackIn_192_0 = 0;
                                  break L20;
                                } else {
                                  stackIn_192_0 = 1;
                                  break L20;
                                }
                              }
                              var4 = stackIn_192_0;
                              var5 = 0;
                              L21: while (true) {
                                if ((var5 ^ -1) <= -22) {
                                  stackIn_219_0 = this;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  L22: {
                                    L23: {
                                      if (var4 != 0) {
                                        break L23;
                                      } else {
                                        if (fd.field_mb[var5]) {
                                          break L22;
                                        } else {
                                          break L23;
                                        }
                                      }
                                    }
                                    if (var5 == 10) {
                                      break L22;
                                    } else {
                                      if (12 == var5) {
                                        break L22;
                                      } else {
                                        if (var5 == 13) {
                                          break L22;
                                        } else {
                                          L24: {
                                            if (-2 != (var5 ^ -1)) {
                                              break L24;
                                            } else {
                                              if (!qe.field_b[0]) {
                                                break L22;
                                              } else {
                                                break L24;
                                              }
                                            }
                                          }
                                          L25: {
                                            if (var5 != 19) {
                                              break L25;
                                            } else {
                                              if (!qe.field_b[2]) {
                                                break L22;
                                              } else {
                                                break L25;
                                              }
                                            }
                                          }
                                          L26: {
                                            if (-1 != (var5 ^ -1)) {
                                              break L26;
                                            } else {
                                              if (!qe.field_b[1]) {
                                                break L26;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          L27: {
                                            if (-3 != (var5 ^ -1)) {
                                              break L27;
                                            } else {
                                              if (qe.field_b[19]) {
                                                break L22;
                                              } else {
                                                break L27;
                                              }
                                            }
                                          }
                                          if (qe.field_b[var5]) {
                                            break L22;
                                          } else {
                                            if (100.0 * Math.random() >= 25.0) {
                                              break L22;
                                            } else {
                                              qe.field_b[var5] = true;
                                              bf.field_d = 0;
                                              ch.field_h = -var5 * 3 + -3;
                                              pa.field_c = var5;
                                              stackIn_216_0 = null;
                                              decompiledRegionSelector0 = 0;
                                              break L0;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var5++;
                                  continue L21;
                                }
                              }
                            } else {
                              L28: {
                                if (0 < (ch.field_h ^ -1)) {
                                  break L28;
                                } else {
                                  ch.field_h = this.field_h;
                                  break L28;
                                }
                              }
                              L29: {
                                var4 = 0;
                                if (0 == this.field_h) {
                                  ne.a(12, 91);
                                  var4 = var3 * 100;
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                              L30: {
                                if ((this.field_h ^ -1) == -2) {
                                  var4 = 250 * var3;
                                  ne.a(13, -124);
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                              L31: {
                                if (2 != this.field_h) {
                                  break L31;
                                } else {
                                  var4 = 500 * var3;
                                  ne.a(14, -77);
                                  break L31;
                                }
                              }
                              L32: {
                                if (this.field_h == 3) {
                                  ne.a(15, 98);
                                  var4 = var3 * 750;
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                              L33: {
                                if (-5 == (this.field_h ^ -1)) {
                                  var4 = var3 * 2500;
                                  ne.a(16, -69);
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                              L34: {
                                if (this.field_h == 5) {
                                  ne.a(61, -69);
                                  var4 = var3 * 1000;
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                              L35: {
                                if (!ke.field_V) {
                                  break L35;
                                } else {
                                  L36: {
                                    if (tc.field_s > 0) {
                                      eb.field_b = eb.field_b + var4;
                                      if (eb.field_b <= 100000) {
                                        break L36;
                                      } else {
                                        if (-2 != (cm.field_o ^ -1)) {
                                          break L36;
                                        } else {
                                          fn.a(19, 236, 3);
                                          break L36;
                                        }
                                      }
                                    } else {
                                      break L36;
                                    }
                                  }
                                  L37: {
                                    if (!hn.field_c) {
                                      eb.field_e = eb.field_e + var4;
                                      if ((eb.field_e ^ -1) >= -100001) {
                                        break L37;
                                      } else {
                                        if (1 == cm.field_o) {
                                          fn.a(21, 234, 3);
                                          break L37;
                                        } else {
                                          break L37;
                                        }
                                      }
                                    } else {
                                      break L37;
                                    }
                                  }
                                  L38: {
                                    a.field_c = a.field_c + var4;
                                    if (6 == var3) {
                                      break L38;
                                    } else {
                                      if (3 == var3) {
                                        break L38;
                                      } else {
                                        if (-3 == (var3 ^ -1)) {
                                          break L38;
                                        } else {
                                          if (1 != var3) {
                                            break L35;
                                          } else {
                                            break L38;
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
                                      break L35;
                                    } else {
                                      var7 = var5 / 3;
                                      di.field_X = di.field_X + var7;
                                      vh.field_g = vh.field_g - (var5 - var7);
                                      break L35;
                                    }
                                  } else {
                                    di.field_X = di.field_X + var5;
                                    break L35;
                                  }
                                }
                              }
                              L39: {
                                if (this.field_h < 0) {
                                  break L39;
                                } else {
                                  if (5 < this.field_h) {
                                    break L39;
                                  } else {
                                    L40: {
                                      if (ke.field_V) {
                                        nm.field_g[this.field_h] = nm.field_g[this.field_h] + 1;
                                        break L40;
                                      } else {
                                        break L40;
                                      }
                                    }
                                    L41: {
                                      if (!je.c(this.field_n, this.field_p, 1, 1)) {
                                        break L41;
                                      } else {
                                        vi.field_q = vi.field_q + 1;
                                        if (-26 != (vi.field_q ^ -1)) {
                                          break L41;
                                        } else {
                                          if (!ke.field_V) {
                                            break L41;
                                          } else {
                                            fn.a(11, 244, 3);
                                            break L41;
                                          }
                                        }
                                      }
                                    }
                                    L42: {
                                      if (!ke.field_V) {
                                        break L42;
                                      } else {
                                        if (25 != nm.field_g[this.field_h]) {
                                          break L42;
                                        } else {
                                          if (0 != this.field_h) {
                                            break L42;
                                          } else {
                                            fn.a(4, 251, 3);
                                            break L42;
                                          }
                                        }
                                      }
                                    }
                                    L43: {
                                      if (!ke.field_V) {
                                        break L43;
                                      } else {
                                        if (-26 != (nm.field_g[this.field_h] ^ -1)) {
                                          break L43;
                                        } else {
                                          if ((this.field_h ^ -1) != -2) {
                                            break L43;
                                          } else {
                                            fn.a(5, 250, 3);
                                            break L43;
                                          }
                                        }
                                      }
                                    }
                                    L44: {
                                      if (!ke.field_V) {
                                        break L44;
                                      } else {
                                        if ((nm.field_g[this.field_h] ^ -1) != -26) {
                                          break L44;
                                        } else {
                                          if (-3 != (this.field_h ^ -1)) {
                                            break L44;
                                          } else {
                                            fn.a(6, 249, 3);
                                            break L44;
                                          }
                                        }
                                      }
                                    }
                                    L45: {
                                      if (!ke.field_V) {
                                        break L45;
                                      } else {
                                        if (nm.field_g[this.field_h] != 25) {
                                          break L45;
                                        } else {
                                          if (3 != this.field_h) {
                                            break L45;
                                          } else {
                                            fn.a(7, 248, 3);
                                            break L45;
                                          }
                                        }
                                      }
                                    }
                                    L46: {
                                      if (!ke.field_V) {
                                        break L46;
                                      } else {
                                        if (nm.field_g[this.field_h] != 25) {
                                          break L46;
                                        } else {
                                          if (-6 == (this.field_h ^ -1)) {
                                            fn.a(18, 237, 3);
                                            break L46;
                                          } else {
                                            break L46;
                                          }
                                        }
                                      }
                                    }
                                    if (!ke.field_V) {
                                      break L39;
                                    } else {
                                      if (10 != nm.field_g[this.field_h]) {
                                        break L39;
                                      } else {
                                        if ((this.field_h ^ -1) == -5) {
                                          fn.a(8, 247, 3);
                                          break L39;
                                        } else {
                                          break L39;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackIn_221_0 = null;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                    L47: {
                      if (param0) {
                        break L47;
                      } else {
                        discarded$0 = this.a((byte) -116);
                        break L47;
                      }
                    }
                    L48: {
                      if (var2_int != 0) {
                        L49: {
                          if (this.field_i > 0) {
                            this.field_i = this.field_i - 1;
                            break L49;
                          } else {
                            break L49;
                          }
                        }
                        if ((this.field_i ^ -1) <= -1) {
                          break L48;
                        } else {
                          this.field_i = this.field_i + 1;
                          break L48;
                        }
                      } else {
                        break L48;
                      }
                    }
                    L50: {
                      if (this.field_h == 9) {
                        this.a(21161, var2_int != 0);
                        break L50;
                      } else {
                        if (this.field_h == 19) {
                          this.c(true);
                          break L50;
                        } else {
                          if ((this.field_h ^ -1) != -22) {
                            break L50;
                          } else {
                            L51: {
                              var4 = (hf.field_t - this.field_p) * (hf.field_t - this.field_p) + (-this.field_n + ca.field_k) * (ca.field_k - this.field_n);
                              if (120 < q.field_b[this.field_n][this.field_p].field_i) {
                                if (25 > var4) {
                                  stackIn_242_0 = 1;
                                  break L51;
                                } else {
                                  stackIn_242_0 = 0;
                                  break L51;
                                }
                              } else {
                                stackIn_242_0 = 0;
                                break L51;
                              }
                            }
                            L52: {
                              var5 = stackIn_242_0;
                              if (this.field_l > 32) {
                                L53: {
                                  if (var5 != 0) {
                                    ne.a(ll.a((byte) -73, 4) + 37, -96);
                                    break L53;
                                  } else {
                                    break L53;
                                  }
                                }
                                this.field_l = -10;
                                break L52;
                              } else {
                                break L52;
                              }
                            }
                            L54: {
                              stackIn_252_0 = this;

                              if (var5 == 0) {
                                stackIn_253_0 = this;
                                stackIn_253_1 = 0;
                                break L54;
                              } else {
                                stackIn_253_0 = this;
                                stackIn_253_1 = 1;
                                break L54;
                              }
                            }
                            L55: {
                              ((gf) (this)).field_e = stackIn_253_1 != 0;
                              var6 = 40;
                              var7 = 4;
                              if (!je.c(this.field_n, this.field_p, 1, 2)) {
                                stackIn_256_0 = 0;
                                break L55;
                              } else {
                                stackIn_256_0 = 1;
                                break L55;
                              }
                            }
                            L56: {
                              var8 = stackIn_256_0;
                              if (!je.c(this.field_n, this.field_p + -1, 1, 1)) {
                                stackIn_259_0 = 0;
                                break L56;
                              } else {
                                stackIn_259_0 = 1;
                                break L56;
                              }
                            }
                            L57: {
                              var9 = stackIn_259_0;
                              if (var8 != 0) {
                                break L57;
                              } else {
                                var6 = 6;
                                break L57;
                              }
                            }
                            L58: {
                              if (var5 == 0) {
                                L59: {
                                  var10 = 4 * (this.field_k - -160) / 320 + (this.field_n << -1507159102);
                                  if (this.field_g != 0) {
                                    if (!je.i(var10, this.field_p << -1275278462)) {
                                      if (-10 < this.field_i) {
                                        this.field_i = this.field_i - var7;
                                        break L59;
                                      } else {
                                        break L59;
                                      }
                                    } else {
                                      this.field_g = 0;
                                      break L59;
                                    }
                                  } else {
                                    if (je.i(var10, this.field_p << -43844254)) {
                                      this.field_g = 1;
                                      break L59;
                                    } else {
                                      if (this.field_i < 10) {
                                        this.field_i = this.field_i + var7;
                                        break L59;
                                      } else {
                                        break L59;
                                      }
                                    }
                                  }
                                }
                                if (var8 != 0) {
                                  var11_double = Math.sin((double)(100 * this.field_c));
                                  if (0.0 >= var11_double) {
                                    if (this.field_m >= var6) {
                                      break L58;
                                    } else {
                                      this.field_m = this.field_m + 1;
                                      break L58;
                                    }
                                  } else {
                                    L60: {
                                      if (-var6 < this.field_m) {
                                        this.field_m = this.field_m - 1;
                                        break L60;
                                      } else {
                                        break L60;
                                      }
                                    }
                                    if (var9 != 0) {
                                      break L58;
                                    } else {
                                      this.field_m = 0;
                                      break L58;
                                    }
                                  }
                                } else {
                                  break L58;
                                }
                              } else {
                                L61: {
                                  L62: {
                                    if (-1 + this.field_p <= hf.field_t) {
                                      break L62;
                                    } else {
                                      if (var8 != 0) {
                                        break L62;
                                      } else {
                                        stackIn_267_0 = 1;
                                        break L61;
                                      }
                                    }
                                  }
                                  stackIn_267_0 = 0;
                                  break L61;
                                }
                                L63: {
                                  var10 = stackIn_267_0;
                                  if (-5 > (Math.abs(ca.field_k - this.field_n) ^ -1)) {
                                    stackIn_271_0 = 0;
                                    break L63;
                                  } else {
                                    stackIn_271_0 = 1;
                                    break L63;
                                  }
                                }
                                L64: {
                                  var11_int = stackIn_271_0;
                                  if (this.field_n >= ca.field_k) {
                                    break L64;
                                  } else {
                                    if (this.field_i < var6) {
                                      L65: {
                                        if (var10 != 0) {
                                          break L65;
                                        } else {
                                          if (var11_int != 0) {
                                            break L65;
                                          } else {
                                            break L64;
                                          }
                                        }
                                      }
                                      this.field_i = this.field_i - var7;
                                      break L64;
                                    } else {
                                      break L64;
                                    }
                                  }
                                }
                                L66: {
                                  if (ca.field_k >= this.field_n) {
                                    break L66;
                                  } else {
                                    if (-var6 >= this.field_i) {
                                      break L66;
                                    } else {
                                      L67: {
                                        if (var10 != 0) {
                                          break L67;
                                        } else {
                                          if (var11_int == 0) {
                                            break L66;
                                          } else {
                                            break L67;
                                          }
                                        }
                                      }
                                      this.field_i = this.field_i + var7;
                                      break L66;
                                    }
                                  }
                                }
                                L68: {
                                  if (this.field_i >= -var6) {
                                    break L68;
                                  } else {
                                    this.field_i = -var6;
                                    break L68;
                                  }
                                }
                                L69: {
                                  if (var6 < this.field_i) {
                                    this.field_i = var6;
                                    break L69;
                                  } else {
                                    break L69;
                                  }
                                }
                                L70: {
                                  L71: {
                                    if (this.field_p <= hf.field_t) {
                                      break L71;
                                    } else {
                                      if (var8 == 0) {
                                        break L71;
                                      } else {
                                        if (this.field_m >= var6) {
                                          break L71;
                                        } else {
                                          this.field_m = this.field_m + 1;
                                          break L70;
                                        }
                                      }
                                    }
                                  }
                                  if (this.field_p >= hf.field_t) {
                                    break L70;
                                  } else {
                                    if (var8 == 0) {
                                      break L70;
                                    } else {
                                      if (this.field_m > -var6) {
                                        this.field_m = this.field_m - 1;
                                        break L70;
                                      } else {
                                        break L70;
                                      }
                                    }
                                  }
                                }
                                L72: {
                                  if (-var6 * 4 > this.field_m) {
                                    this.field_m = 4 * -var6;
                                    break L72;
                                  } else {
                                    break L72;
                                  }
                                }
                                if (ca.field_k != this.field_n) {
                                  break L58;
                                } else {
                                  if (this.field_p != hf.field_t) {
                                    break L58;
                                  } else {
                                    L73: {
                                      fn.a(23, 232, 3);
                                      var12 = 1000 * var3;
                                      a.field_c = a.field_c + var12;
                                      var13 = var12;
                                      var14 = rg.field_sb % 3;
                                      if (0 == var14) {
                                        di.field_X = di.field_X + var13;
                                        break L73;
                                      } else {
                                        if (-2 == (var14 ^ -1)) {
                                          vh.field_g = vh.field_g - var13;
                                          break L73;
                                        } else {
                                          var15 = var13 / 3;
                                          vh.field_g = vh.field_g - (var13 + -var15);
                                          di.field_X = di.field_X + var15;
                                          break L73;
                                        }
                                      }
                                    }
                                    ne.a(ll.a((byte) -73, 4) + 37, 122);
                                    stackIn_316_0 = null;
                                    decompiledRegionSelector0 = 3;
                                    break L0;
                                  }
                                }
                              }
                            }
                            if (!q.field_b[this.field_n][this.field_p].field_a) {
                              if (!je.field_O.b(this.field_n, this.field_p, (byte) 15)) {
                                break L50;
                              } else {
                                stackIn_350_0 = null;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                    }
                    L74: {
                      if (-18 == (this.field_h ^ -1)) {
                        this.field_b = this.field_b + 1;
                        if ((this.field_b ^ -1) < -251) {
                          L75: {
                            this.field_g = 0;
                            this.field_h = 8;
                            this.field_b = 0;
                            if (sc.field_b) {
                              ag.a(true, 11, this.field_p * 32, 32 * this.field_n);
                              break L75;
                            } else {
                              break L75;
                            }
                          }
                          stackIn_366_0 = this;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          if (this.field_g < 1) {
                            break L74;
                          } else {
                            if (this.field_b > 5) {
                              this.field_g = this.field_g + 1;
                              this.field_b = 0;
                              if ((this.field_g ^ -1) >= -6) {
                                break L74;
                              } else {
                                stackIn_373_0 = null;
                                decompiledRegionSelector0 = 6;
                                break L0;
                              }
                            } else {
                              break L74;
                            }
                          }
                        }
                      } else {
                        break L74;
                      }
                    }
                    L76: {
                      L77: {
                        if (6 == this.field_h) {
                          break L77;
                        } else {
                          if (7 == this.field_h) {
                            break L77;
                          } else {
                            if (this.field_h != 16) {
                              break L76;
                            } else {
                              break L77;
                            }
                          }
                        }
                      }
                      L78: {
                        this.field_b = this.field_b + 1;
                        if (!je.c(this.field_n, this.field_p, 1, 3)) {
                          break L78;
                        } else {
                          L79: {
                            if (this.field_h == 6) {
                              break L79;
                            } else {
                              if (this.field_h != 17) {
                                break L78;
                              } else {
                                break L79;
                              }
                            }
                          }
                          if (250 < this.field_b) {
                            this.field_g = 0;
                            this.field_h = 8;
                            this.field_b = 0;
                            stackIn_386_0 = this;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            break L78;
                          }
                        }
                      }
                      L80: {
                        if (-1 != (this.field_g ^ -1)) {
                          break L80;
                        } else {
                          if (this.field_h != 6) {
                            break L80;
                          } else {
                            if (!je.c(this.field_n, this.field_p, 3, 3)) {
                              break L80;
                            } else {
                              if (-251 < (this.field_b ^ -1)) {
                                this.field_h = 17;
                                var4 = 0;
                                L81: while (true) {
                                  if (-1001 >= (var4 ^ -1)) {
                                    break L80;
                                  } else {
                                    L82: {
                                      if (null == uf.field_p[var4]) {
                                        break L82;
                                      } else {
                                        if (uf.field_p[var4] == this) {
                                          ge.a(var4, (byte) 85, true);
                                          break L80;
                                        } else {
                                          break L82;
                                        }
                                      }
                                    }
                                    var4++;
                                    continue L81;
                                  }
                                }
                              } else {
                                break L80;
                              }
                            }
                          }
                        }
                      }
                      L83: {
                        if ((this.field_b ^ -1) <= -251) {
                          break L83;
                        } else {
                          if (je.field_O.b(this.field_n, this.field_p, (byte) 80)) {
                            this.field_b = 251;
                            break L83;
                          } else {
                            break L83;
                          }
                        }
                      }
                      L84: {
                        if (0 != this.field_g) {
                          break L84;
                        } else {
                          if ((this.field_b ^ -1) < -251) {
                            L85: {
                              ne.a(8, -74);
                              oe.field_b = true;
                              if (this.field_h == 16) {
                                this.field_h = 6;
                                break L85;
                              } else {
                                break L85;
                              }
                            }
                            lj.field_r = lj.field_r + 25;
                            this.field_b = 0;
                            this.field_g = 1;
                            rg.field_sb = rg.field_sb - 40;
                            var4 = 0;
                            L86: while (true) {
                              if (-1001 >= (var4 ^ -1)) {
                                L87: {
                                  var4 = 1;
                                  if (an.field_d) {
                                    var4 = 2;
                                    break L87;
                                  } else {
                                    break L87;
                                  }
                                }
                                var5 = -var4 + this.field_n;
                                L88: while (true) {
                                  if (var5 > this.field_n + var4) {
                                    L89: {
                                      var5 = -8 + 4 * this.field_n;
                                      if ((var5 ^ -1) <= -1) {
                                        break L89;
                                      } else {
                                        var5 = 0;
                                        break L89;
                                      }
                                    }
                                    L90: {
                                      var6 = 8 + (1 + this.field_n) * 4;
                                      if (-125 <= (var6 ^ -1)) {
                                        break L90;
                                      } else {
                                        var6 = 124;
                                        break L90;
                                      }
                                    }
                                    L91: {
                                      var7 = -8 + 4 * this.field_p;
                                      var8 = 4 * this.field_p + 4 + 8;
                                      if (-1 >= (var7 ^ -1)) {
                                        break L91;
                                      } else {
                                        var7 = 0;
                                        break L91;
                                      }
                                    }
                                    L92: {
                                      if (4 * je.field_t - 4 >= var8) {
                                        break L92;
                                      } else {
                                        var8 = 4 * (je.field_t - 1);
                                        break L92;
                                      }
                                    }
                                    var9 = var5;
                                    L93: while (true) {
                                      if (var6 <= var9) {
                                        if (1 == cm.field_o) {
                                          var9 = var5;
                                          L94: while (true) {
                                            if (var6 <= var9) {
                                              break L84;
                                            } else {
                                              var10 = var7;
                                              L95: while (true) {
                                                if (var10 < var8) {
                                                  if (je.field_O.a(var9, var10, (byte) 61)) {
                                                    lj.field_r = lj.field_r + 10;
                                                    je.field_O.a(false, (byte) 63, var9 >> 843382338, var10 >> 1434647618);
                                                    var9++;
                                                    continue L94;
                                                  } else {
                                                    var10++;
                                                    continue L95;
                                                  }
                                                } else {
                                                  var9++;
                                                  continue L94;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L84;
                                        }
                                      } else {
                                        var10 = var7;
                                        L96: while (true) {
                                          if (var10 >= var8) {
                                            var9++;
                                            continue L93;
                                          } else {
                                            if (je.field_O.i(-120, var9, var10)) {
                                              if (!je.field_O.e(var9, var10, 2)) {
                                                L97: {
                                                  lj.field_r = lj.field_r + 25;
                                                  if ((3 & var9 ^ -1) != -2) {
                                                    break L97;
                                                  } else {
                                                    if (1 == (3 & var10)) {
                                                      rg.field_sb = rg.field_sb - 15;
                                                      var11_int = jf.b((byte) 114);
                                                      uf.field_p[var11_int] = new gf(var9 / 4, var10 / 4, 16);
                                                      uf.field_p[var11_int].field_g = 0;
                                                      uf.field_p[var11_int].field_b = 244;
                                                      break L97;
                                                    } else {
                                                      break L97;
                                                    }
                                                  }
                                                }
                                                je.field_O.b(117, false, var9, var10);
                                                je.field_O.a(-122, var10, 0, var9);
                                                var10++;
                                                continue L96;
                                              } else {
                                                var10++;
                                                continue L96;
                                              }
                                            } else {
                                              var10++;
                                              continue L96;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var6 = this.field_p - var4;
                                    L98: while (true) {
                                      if (var4 + this.field_p < var6) {
                                        var5++;
                                        continue L88;
                                      } else {
                                        L99: {
                                          if ((var5 ^ -1) != (ca.field_k ^ -1)) {
                                            break L99;
                                          } else {
                                            if (hf.field_t != var6) {
                                              break L99;
                                            } else {
                                              if (!il.e(-31391)) {
                                                L100: {
                                                  if (!rf.a(13)) {
                                                    break L100;
                                                  } else {
                                                    if (!ca.c(-2302)) {
                                                      break L100;
                                                    } else {
                                                      rj.a((byte) -38, 13);
                                                      break L99;
                                                    }
                                                  }
                                                }
                                                rj.a((byte) -38, 5);
                                                break L99;
                                              } else {
                                                break L99;
                                              }
                                            }
                                          }
                                        }
                                        L101: {
                                          var7 = -16 + var5;
                                          if (var7 < 0) {
                                            var7 = -var7;
                                            break L101;
                                          } else {
                                            break L101;
                                          }
                                        }
                                        L102: {
                                          if (-1 <= (var6 ^ -1)) {
                                            break L102;
                                          } else {
                                            if (0 >= var5) {
                                              break L102;
                                            } else {
                                              if ((var5 ^ -1) <= -32) {
                                                break L102;
                                              } else {
                                                if (-1 + je.field_t <= var6) {
                                                  break L102;
                                                } else {
                                                  if (var6 > var7 / 2) {
                                                    if (q.field_b[var5][var6].field_a) {
                                                      L103: {
                                                        var8 = 1;
                                                        if (!q.field_b[var5][var6].field_b) {
                                                          if (q.field_b[var5][var6].field_S) {
                                                            q.field_b[var5][var6].field_a = false;
                                                            break L103;
                                                          } else {
                                                            break L103;
                                                          }
                                                        } else {
                                                          var8 = 0;
                                                          q.field_b[var5][var6].field_b = false;
                                                          if (0 == (q.field_b[var5][var6].field_U ^ -1)) {
                                                            break L103;
                                                          } else {
                                                            jc.field_H = jc.field_H + 1;
                                                            break L103;
                                                          }
                                                        }
                                                      }
                                                      L104: {
                                                        if (q.field_b[var5][var6].field_E) {
                                                          break L104;
                                                        } else {
                                                          if (!q.field_b[var5][var6].field_v) {
                                                            L105: {
                                                              stackIn_509_0 = q.field_b[var5][var6];

                                                              if (var8 == 0) {
                                                                stackIn_510_0 = (je) ((Object) stackIn_509_0);
                                                                stackIn_510_1 = 0;
                                                                break L105;
                                                              } else {
                                                                stackIn_510_0 = (je) ((Object) stackIn_509_0);
                                                                stackIn_510_1 = 1;
                                                                break L105;
                                                              }
                                                            }
                                                            stackIn_510_0.field_S = stackIn_510_1 != 0;
                                                            q.field_b[var5][var6].field_r = 1000;
                                                            break L102;
                                                          } else {
                                                            break L104;
                                                          }
                                                        }
                                                      }
                                                      q.field_b[var5][var6].field_a = false;
                                                      q.field_b[var5][var6].field_E = false;
                                                      q.field_b[var5][var6].field_v = false;
                                                      je.field_O.h(var5, 4, var6);
                                                      if (sc.field_b) {
                                                        ag.a(param0, 25, 32 * var6, var5 * 32);
                                                        break L102;
                                                      } else {
                                                        break L102;
                                                      }
                                                    } else {
                                                      if (q.field_b[var5][var6].field_b) {
                                                        q.field_b[var5][var6].field_b = false;
                                                        if (q.field_b[var5][var6].field_U != -1) {
                                                          jc.field_H = jc.field_H + 1;
                                                          break L102;
                                                        } else {
                                                          break L102;
                                                        }
                                                      } else {
                                                        break L102;
                                                      }
                                                    }
                                                  } else {
                                                    break L102;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var6++;
                                        continue L98;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L106: {
                                  if (null != uf.field_p[var4]) {
                                    if (uf.field_p[var4].a(false)) {
                                      if (-1 + this.field_n > uf.field_p[var4].field_n) {
                                        break L106;
                                      } else {
                                        if (this.field_p + -1 > uf.field_p[var4].field_p) {
                                          break L106;
                                        } else {
                                          if (uf.field_p[var4].field_n > this.field_n + 1) {
                                            break L106;
                                          } else {
                                            if (uf.field_p[var4].field_p <= this.field_p - -1) {
                                              L107: {
                                                if (19 != uf.field_p[var4].field_h) {
                                                  break L107;
                                                } else {
                                                  hn.field_c = true;
                                                  break L107;
                                                }
                                              }
                                              uf.field_p[var4].field_h = 16;
                                              uf.field_p[var4].field_b = 250;
                                              break L106;
                                            } else {
                                              break L106;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (7 == uf.field_p[var4].field_h) {
                                        if (uf.field_p[var4].field_n < this.field_n + -1) {
                                          break L106;
                                        } else {
                                          if (uf.field_p[var4].field_p < -1 + this.field_p) {
                                            break L106;
                                          } else {
                                            if (uf.field_p[var4].field_n > this.field_n + 1) {
                                              break L106;
                                            } else {
                                              if (this.field_p + 1 >= uf.field_p[var4].field_p) {
                                                uf.field_p[var4].field_b = 250;
                                                ge.a(var4, (byte) 85, false);
                                                break L106;
                                              } else {
                                                break L106;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if ((uf.field_p[var4].field_h ^ -1) == -7) {
                                          if (uf.field_p[var4].field_n < -1 + this.field_n) {
                                            break L106;
                                          } else {
                                            if (uf.field_p[var4].field_p < this.field_p - 1) {
                                              break L106;
                                            } else {
                                              if (uf.field_p[var4].field_n > this.field_n - -1) {
                                                break L106;
                                              } else {
                                                if (uf.field_p[var4].field_p <= this.field_p + 1) {
                                                  uf.field_p[var4].field_b = 250;
                                                  ge.a(var4, (byte) 85, true);
                                                  break L106;
                                                } else {
                                                  break L106;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if (-18 == (uf.field_p[var4].field_h ^ -1)) {
                                            if (uf.field_p[var4].field_n < this.field_n + -1) {
                                              break L106;
                                            } else {
                                              if (uf.field_p[var4].field_p < this.field_p - 1) {
                                                break L106;
                                              } else {
                                                if (uf.field_p[var4].field_n > this.field_n + 1) {
                                                  break L106;
                                                } else {
                                                  if (uf.field_p[var4].field_p > 1 + this.field_p) {
                                                    break L106;
                                                  } else {
                                                    uf.field_p[var4].field_h = 6;
                                                    uf.field_p[var4].field_b = 250;
                                                    break L106;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            break L106;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L106;
                                  }
                                }
                                var4++;
                                continue L86;
                              }
                            }
                          } else {
                            break L84;
                          }
                        }
                      }
                      if ((this.field_g ^ -1) > -2) {
                        break L76;
                      } else {
                        if ((this.field_b ^ -1) >= -6) {
                          break L76;
                        } else {
                          this.field_g = this.field_g + 1;
                          this.field_b = 0;
                          if (this.field_g <= 5) {
                            break L76;
                          } else {
                            return null;
                          }
                        }
                      }
                    }
                    L108: {
                      if (-16 != (this.field_h ^ -1)) {
                        break L108;
                      } else {
                        L109: {
                          this.field_b = this.field_b + 1;
                          if (this.field_g != 0) {
                            break L109;
                          } else {
                            if (this.field_b > 250) {
                              ne.a(8, 109);
                              this.field_b = 0;
                              this.field_g = 1;
                              var4 = 2;
                              var5 = this.field_n + -var4;
                              L110: while (true) {
                                if (var5 > var4 + this.field_n) {
                                  break L109;
                                } else {
                                  var6 = this.field_p + -var4;
                                  L111: while (true) {
                                    if (var6 > this.field_p - -var4) {
                                      var5++;
                                      continue L110;
                                    } else {
                                      L112: {
                                        var7 = -16 + var5;
                                        if (var7 < 0) {
                                          var7 = -var7;
                                          break L112;
                                        } else {
                                          break L112;
                                        }
                                      }
                                      L113: {
                                        if (var6 <= 0) {
                                          break L113;
                                        } else {
                                          if (-1 <= (var5 ^ -1)) {
                                            break L113;
                                          } else {
                                            if (31 <= var5) {
                                              break L113;
                                            } else {
                                              if (var6 >= je.field_t + -1) {
                                                break L113;
                                              } else {
                                                if (var6 <= var7 / 2) {
                                                  break L113;
                                                } else {
                                                  je.field_O.h(var5, 4, var6);
                                                  break L113;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      q.field_b[var5][var6].field_b = false;
                                      q.field_b[var5][var6].field_a = false;
                                      var6++;
                                      continue L111;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L109;
                            }
                          }
                        }
                        if ((this.field_g ^ -1) > -2) {
                          break L108;
                        } else {
                          if (this.field_b <= 5) {
                            break L108;
                          } else {
                            this.field_g = this.field_g + 1;
                            this.field_b = 0;
                            if (-6 <= (this.field_g ^ -1)) {
                              break L108;
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                    }
                    L114: {
                      if (this.field_h == 18) {
                        L115: {
                          this.field_b = this.field_b + 1;
                          if (0 != this.field_g) {
                            break L115;
                          } else {
                            if (this.field_b > 250) {
                              ne.a(8, -115);
                              this.field_g = 1;
                              this.field_b = 0;
                              var4 = 2;
                              var5 = -var4 + this.field_n;
                              L116: while (true) {
                                if (var4 + this.field_n < var5) {
                                  break L115;
                                } else {
                                  var6 = -var4 + this.field_p;
                                  L117: while (true) {
                                    if (var6 > this.field_p - -var4) {
                                      var5++;
                                      continue L116;
                                    } else {
                                      L118: {
                                        var7 = var5 - 16;
                                        if ((var7 ^ -1) > -1) {
                                          var7 = -var7;
                                          break L118;
                                        } else {
                                          break L118;
                                        }
                                      }
                                      L119: {
                                        if (0 >= var6) {
                                          break L119;
                                        } else {
                                          if (var5 <= 0) {
                                            break L119;
                                          } else {
                                            if (-32 >= (var5 ^ -1)) {
                                              break L119;
                                            } else {
                                              if (var6 >= -1 + je.field_t) {
                                                break L119;
                                              } else {
                                                if (var7 / 2 < var6) {
                                                  je.field_O.c(var6, var5, (byte) -48);
                                                  break L119;
                                                } else {
                                                  break L119;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      q.field_b[var5][var6].field_b = false;
                                      q.field_b[var5][var6].field_a = false;
                                      var6++;
                                      continue L117;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L115;
                            }
                          }
                        }
                        if (-2 < (this.field_g ^ -1)) {
                          break L114;
                        } else {
                          if (5 < this.field_b) {
                            this.field_g = this.field_g + 1;
                            this.field_b = 0;
                            if ((this.field_g ^ -1) >= -6) {
                              break L114;
                            } else {
                              stackIn_612_0 = null;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          } else {
                            break L114;
                          }
                        }
                      } else {
                        break L114;
                      }
                    }
                    L120: {
                      if (-23 == (this.field_h ^ -1)) {
                        L121: {
                          this.field_b = this.field_b + 1;
                          if (this.field_g != 0) {
                            break L121;
                          } else {
                            if ((this.field_b ^ -1) < -251) {
                              ne.a(8, 120);
                              this.field_g = 1;
                              this.field_b = 0;
                              var4 = 2;
                              var5 = -var4 + this.field_n;
                              L122: while (true) {
                                if (var5 > var4 + this.field_n) {
                                  break L121;
                                } else {
                                  var6 = this.field_p - var4;
                                  L123: while (true) {
                                    if (this.field_p + var4 < var6) {
                                      var5++;
                                      continue L122;
                                    } else {
                                      L124: {
                                        var7 = var5 - 16;
                                        if ((var7 ^ -1) <= -1) {
                                          break L124;
                                        } else {
                                          var7 = -var7;
                                          break L124;
                                        }
                                      }
                                      L125: {
                                        if ((var6 ^ -1) >= -1) {
                                          break L125;
                                        } else {
                                          if (0 >= var5) {
                                            break L125;
                                          } else {
                                            if (31 <= var5) {
                                              break L125;
                                            } else {
                                              if (je.field_t - 1 <= var6) {
                                                break L125;
                                              } else {
                                                if (var7 / 2 < var6) {
                                                  je.field_O.d(var6, var5, -5);
                                                  break L125;
                                                } else {
                                                  break L125;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      q.field_b[var5][var6].field_b = false;
                                      q.field_b[var5][var6].field_a = false;
                                      var6++;
                                      continue L123;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L121;
                            }
                          }
                        }
                        if (this.field_g < 1) {
                          break L120;
                        } else {
                          if (this.field_b > 5) {
                            this.field_g = this.field_g + 1;
                            this.field_b = 0;
                            if ((this.field_g ^ -1) >= -6) {
                              break L120;
                            } else {
                              stackIn_642_0 = null;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            }
                          } else {
                            break L120;
                          }
                        }
                      } else {
                        break L120;
                      }
                    }
                    L126: {
                      if (-21 == (this.field_h ^ -1)) {
                        L127: {
                          if (!sc.field_b) {
                            break L127;
                          } else {
                            if (q.field_b[this.field_n][this.field_p].field_V) {
                              ag.a(param0, 26, 32 * this.field_p, this.field_n * 32);
                              break L127;
                            } else {
                              break L127;
                            }
                          }
                        }
                        L128: {
                          this.field_b = this.field_b + 1;
                          if (-1 != (this.field_g ^ -1)) {
                            break L128;
                          } else {
                            if (this.field_b > 250) {
                              L129: {
                                ne.a(33, -69);
                                this.field_g = 1;
                                this.field_b = 0;
                                var4 = ca.field_k - this.field_n;
                                var5 = -this.field_p + hf.field_t;
                                if (var4 * var4 > 1) {
                                  break L129;
                                } else {
                                  if (1 < var5 * var5) {
                                    break L129;
                                  } else {
                                    if (il.e(-31391)) {
                                      break L129;
                                    } else {
                                      rj.a((byte) -38, 9);
                                      q.field_b[ca.field_k][hf.field_t].field_a = true;
                                      q.field_b[ca.field_k][hf.field_t].field_E = true;
                                      q.field_b[ca.field_k][hf.field_t].field_q = -400;
                                      break L129;
                                    }
                                  }
                                }
                              }
                              var6 = 0;
                              var7 = 0;
                              L130: while (true) {
                                if (var7 >= 1000) {
                                  L131: {
                                    if (3 > var6) {
                                      break L131;
                                    } else {
                                      fn.a(20, 235, 3);
                                      break L131;
                                    }
                                  }
                                  var7 = -1 + this.field_n;
                                  L132: while (true) {
                                    if (1 + this.field_n < var7) {
                                      if (-501 >= (re.field_d ^ -1)) {
                                        fn.a(28, 227, 3);
                                        break L128;
                                      } else {
                                        break L128;
                                      }
                                    } else {
                                      var8 = this.field_p + -1;
                                      L133: while (true) {
                                        if (var8 > this.field_p - -1) {
                                          var7++;
                                          continue L132;
                                        } else {
                                          L134: {
                                            var9 = var7 + -16;
                                            if (0 <= var9) {
                                              break L134;
                                            } else {
                                              var9 = -var9;
                                              break L134;
                                            }
                                          }
                                          if (0 < var8) {
                                            if (0 < var7) {
                                              if (31 > var7) {
                                                if (var8 < je.field_t + -1) {
                                                  if (var8 > var9 / 2) {
                                                    L135: {
                                                      var10 = 0;
                                                      if (q.field_b[var7][var8].field_a) {
                                                        L136: {
                                                          if (q.field_b[var7][var8].field_E) {
                                                            break L136;
                                                          } else {
                                                            re.field_d = re.field_d + 1;
                                                            break L136;
                                                          }
                                                        }
                                                        q.field_b[var7][var8].field_E = true;
                                                        q.field_b[var7][var8].field_v = false;
                                                        q.field_b[var7][var8].field_q = -400;
                                                        break L135;
                                                      } else {
                                                        L137: {
                                                          if (!je.field_O.a(var7, (byte) -87, var8)) {
                                                            break L137;
                                                          } else {
                                                            je.field_O.b(122, var7, var8);
                                                            var10 = 1;
                                                            break L137;
                                                          }
                                                        }
                                                        if (var10 != 0) {
                                                          var11 = mh.field_e[var7][var8];
                                                          var11.field_q = -400;
                                                          re.field_d = re.field_d + 1;
                                                          var11.field_E = true;
                                                          var11.field_a = true;
                                                          break L135;
                                                        } else {
                                                          break L135;
                                                        }
                                                      }
                                                    }
                                                    var8++;
                                                    continue L133;
                                                  } else {
                                                    var8++;
                                                    continue L133;
                                                  }
                                                } else {
                                                  var8++;
                                                  continue L133;
                                                }
                                              } else {
                                                var8++;
                                                continue L133;
                                              }
                                            } else {
                                              var8++;
                                              continue L133;
                                            }
                                          } else {
                                            var8++;
                                            continue L133;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var8_ref_gf = uf.field_p[var7];
                                  if (null != var8_ref_gf) {
                                    L138: {
                                      stackIn_667_0 = (gf) (var8_ref_gf);

                                      if (param0) {
                                        stackIn_668_0 = (gf) ((Object) stackIn_667_0);
                                        stackIn_668_1 = 0;
                                        break L138;
                                      } else {
                                        stackIn_668_0 = (gf) ((Object) stackIn_667_0);
                                        stackIn_668_1 = 1;
                                        break L138;
                                      }
                                    }
                                    L139: {
                                      if (((gf) (Object) stackIn_668_0).a(stackIn_668_1 != 0)) {
                                        var4 = var8_ref_gf.field_n - this.field_n;
                                        if (-2 <= (var4 * var4 ^ -1)) {
                                          var5 = var8_ref_gf.field_p + -this.field_p;
                                          if ((var5 * var5 ^ -1) >= -2) {
                                            L140: {
                                              var9_ref_je = mh.field_e[var8_ref_gf.field_n][var8_ref_gf.field_p];
                                              if (19 != var8_ref_gf.field_h) {
                                                break L140;
                                              } else {
                                                hn.field_c = true;
                                                break L140;
                                              }
                                            }
                                            var9_ref_je.field_a = true;
                                            var9_ref_je.field_E = true;
                                            uf.field_p[var7] = null;
                                            re.field_d = re.field_d + 1;
                                            var6++;
                                            break L139;
                                          } else {
                                            var7++;
                                            continue L130;
                                          }
                                        } else {
                                          var7++;
                                          continue L130;
                                        }
                                      } else {
                                        break L139;
                                      }
                                    }
                                    var7++;
                                    continue L130;
                                  } else {
                                    var7++;
                                    continue L130;
                                  }
                                }
                              }
                            } else {
                              break L128;
                            }
                          }
                        }
                        if (1 > this.field_g) {
                          break L126;
                        } else {
                          if ((this.field_b ^ -1) >= -6) {
                            break L126;
                          } else {
                            this.field_b = 0;
                            this.field_g = this.field_g + 1;
                            if (-6 <= (this.field_g ^ -1)) {
                              break L126;
                            } else {
                              return null;
                            }
                          }
                        }
                      } else {
                        break L126;
                      }
                    }
                    L141: {
                      if (10 != this.field_h) {
                        break L141;
                      } else {
                        L142: {
                          this.field_b = this.field_b + 1;
                          if ((this.field_b ^ -1) >= -251) {
                            break L142;
                          } else {
                            this.field_b = (int)(200.0 * Math.random());
                            this.field_g = this.field_g + 1;
                            break L142;
                          }
                        }
                        L143: {
                          if (3 != this.field_g) {
                            break L143;
                          } else {
                            this.field_g = 0;
                            break L143;
                          }
                        }
                        if (!sc.field_b) {
                          break L141;
                        } else {
                          if (q.field_b[this.field_n][this.field_p].field_i == 0) {
                            var4 = ca.field_k + -this.field_n;
                            var5 = -this.field_p + hf.field_t;
                            if (64 > var4 * var4 + var5 * var5) {
                              ag.a(param0, 21, this.field_p * 32, this.field_n * 32);
                              break L141;
                            } else {
                              break L141;
                            }
                          } else {
                            break L141;
                          }
                        }
                      }
                    }
                    L144: {
                      L145: {
                        if (this.field_h == 8) {
                          break L145;
                        } else {
                          if ((this.field_h ^ -1) == -11) {
                            break L145;
                          } else {
                            if (19 == this.field_h) {
                              break L145;
                            } else {
                              if (21 != this.field_h) {
                                if (je.c(this.field_n, this.field_p, 1, 1)) {
                                  L146: {
                                    if (this.field_m >= (int)(Math.random() * 5.0 + 1.0)) {
                                      break L146;
                                    } else {
                                      this.field_m = this.field_m + 1;
                                      break L146;
                                    }
                                  }
                                  L147: {
                                    if (this.field_m <= (int)(5.0 * Math.random() + 1.0)) {
                                      break L147;
                                    } else {
                                      this.field_m = this.field_m - 1;
                                      break L147;
                                    }
                                  }
                                  L148: {
                                    if (this.field_i < (int)(-2.0 + 5.0 * Math.random())) {
                                      this.field_i = this.field_i + 1;
                                      break L148;
                                    } else {
                                      break L148;
                                    }
                                  }
                                  if (this.field_i > (int)(-2.0 + Math.random() * 5.0)) {
                                    this.field_i = this.field_i - 1;
                                    break L144;
                                  } else {
                                    break L144;
                                  }
                                } else {
                                  if (this.field_m < 40) {
                                    this.field_m = this.field_m + 1;
                                    break L144;
                                  } else {
                                    break L144;
                                  }
                                }
                              } else {
                                break L145;
                              }
                            }
                          }
                        }
                      }
                      L149: {
                        if (this.field_h == 19) {
                          break L149;
                        } else {
                          if (-22 != (this.field_h ^ -1)) {
                            break L144;
                          } else {
                            break L149;
                          }
                        }
                      }
                      if (je.c(this.field_n, this.field_p, 1, 1)) {
                        break L144;
                      } else {
                        if (this.field_m >= 40) {
                          break L144;
                        } else {
                          this.field_m = this.field_m + 1;
                          break L144;
                        }
                      }
                    }
                    L150: {
                      if (16 != this.field_h) {
                        L151: {
                          L152: {
                            this.field_k = this.field_k + this.field_i;
                            this.field_f = this.field_f + this.field_m;
                            if (this.field_p > -1 + je.field_t) {
                              break L152;
                            } else {
                              if (0 >= this.field_f) {
                                break L151;
                              } else {
                                if (!q.field_b[this.field_n][1 + this.field_p].g()) {
                                  break L151;
                                } else {
                                  break L152;
                                }
                              }
                            }
                          }
                          this.field_m = 0;
                          this.field_f = 0;
                          break L151;
                        }
                        L153: {
                          if (this.field_f >= 0) {
                            break L153;
                          } else {
                            if (this.field_m >= 0) {
                              break L153;
                            } else {
                              if (q.field_b[this.field_n][-1 + this.field_p].g()) {
                                this.field_m = 0;
                                this.field_f = 0;
                                break L153;
                              } else {
                                break L153;
                              }
                            }
                          }
                        }
                        L154: {
                          if (Math.abs(this.field_k) >= Math.abs(this.field_f)) {
                            L155: {
                              if (this.field_k <= 80) {
                                break L155;
                              } else {
                                if (-1 >= (this.field_f ^ -1)) {
                                  break L155;
                                } else {
                                  if (this.field_m > 0) {
                                    break L155;
                                  } else {
                                    if (!q.field_b[this.field_n - -1][-1 + this.field_p].g()) {
                                      break L155;
                                    } else {
                                      this.field_m = 0;
                                      this.field_f = 0;
                                      break L155;
                                    }
                                  }
                                }
                              }
                            }
                            L156: {
                              if (79 >= (this.field_k ^ -1)) {
                                break L156;
                              } else {
                                if (-1 >= (this.field_f ^ -1)) {
                                  break L156;
                                } else {
                                  if (this.field_m > 0) {
                                    break L156;
                                  } else {
                                    if (!q.field_b[-1 + this.field_n][-1 + this.field_p].g()) {
                                      break L156;
                                    } else {
                                      this.field_f = 0;
                                      this.field_m = 0;
                                      break L156;
                                    }
                                  }
                                }
                              }
                            }
                            L157: {
                              if (-81 <= (this.field_k ^ -1)) {
                                break L157;
                              } else {
                                if (this.field_f <= 0) {
                                  break L157;
                                } else {
                                  if (-1 < (this.field_m ^ -1)) {
                                    break L157;
                                  } else {
                                    if (q.field_b[this.field_n + 1][this.field_p + 1].g()) {
                                      this.field_m = 0;
                                      this.field_f = 0;
                                      break L157;
                                    } else {
                                      break L157;
                                    }
                                  }
                                }
                              }
                            }
                            if (-80 <= this.field_k) {
                              break L154;
                            } else {
                              if (0 >= this.field_f) {
                                break L154;
                              } else {
                                if (this.field_m < 0) {
                                  break L154;
                                } else {
                                  if (q.field_b[-1 + this.field_n][this.field_p + 1].g()) {
                                    this.field_f = 0;
                                    this.field_m = 0;
                                    break L154;
                                  } else {
                                    break L154;
                                  }
                                }
                              }
                            }
                          } else {
                            L158: {
                              if (80 >= this.field_k) {
                                break L158;
                              } else {
                                if ((this.field_f ^ -1) <= -1) {
                                  break L158;
                                } else {
                                  if (0 > this.field_i) {
                                    break L158;
                                  } else {
                                    if (q.field_b[1 + this.field_n][-1 + this.field_p].g()) {
                                      this.field_k = 80;
                                      this.field_i = -this.field_i;
                                      break L158;
                                    } else {
                                      break L158;
                                    }
                                  }
                                }
                              }
                            }
                            L159: {
                              if ((this.field_k ^ -1) <= 79) {
                                break L159;
                              } else {
                                if (-1 >= (this.field_f ^ -1)) {
                                  break L159;
                                } else {
                                  if ((this.field_i ^ -1) < -1) {
                                    break L159;
                                  } else {
                                    if (!q.field_b[this.field_n - 1][-1 + this.field_p].g()) {
                                      break L159;
                                    } else {
                                      this.field_i = -this.field_i;
                                      this.field_k = -80;
                                      break L159;
                                    }
                                  }
                                }
                              }
                            }
                            L160: {
                              if (80 >= this.field_k) {
                                break L160;
                              } else {
                                if (this.field_f <= 0) {
                                  break L160;
                                } else {
                                  if (this.field_i < 0) {
                                    break L160;
                                  } else {
                                    if (q.field_b[1 + this.field_n][1 + this.field_p].g()) {
                                      this.field_k = 80;
                                      this.field_i = -this.field_i;
                                      break L160;
                                    } else {
                                      break L160;
                                    }
                                  }
                                }
                              }
                            }
                            if (79 >= (this.field_k ^ -1)) {
                              break L154;
                            } else {
                              if (this.field_f <= 0) {
                                break L154;
                              } else {
                                if (-1 > (this.field_i ^ -1)) {
                                  break L154;
                                } else {
                                  if (q.field_b[this.field_n - 1][1 + this.field_p].g()) {
                                    this.field_i = -this.field_i;
                                    this.field_k = -80;
                                    break L154;
                                  } else {
                                    break L154;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L161: {
                          if (this.field_k <= 40) {
                            break L161;
                          } else {
                            if (!q.field_b[this.field_n - -1][this.field_p].g()) {
                              break L161;
                            } else {
                              this.field_k = 40;
                              break L161;
                            }
                          }
                        }
                        L162: {
                          if ((this.field_k ^ -1) <= 39) {
                            break L162;
                          } else {
                            if (!q.field_b[-1 + this.field_n][this.field_p].g()) {
                              break L162;
                            } else {
                              this.field_k = -40;
                              break L162;
                            }
                          }
                        }
                        L163: {
                          if ((this.field_k ^ -1) < -161) {
                            this.field_k = this.field_k - 320;
                            this.field_n = this.field_n + 1;
                            break L163;
                          } else {
                            break L163;
                          }
                        }
                        L164: {
                          if ((this.field_k ^ -1) > 159) {
                            this.field_n = this.field_n - 1;
                            this.field_k = this.field_k + 320;
                            break L164;
                          } else {
                            break L164;
                          }
                        }
                        L165: {
                          if ((this.field_f ^ -1) < -161) {
                            this.field_f = this.field_f - 320;
                            this.field_p = this.field_p + 1;
                            break L165;
                          } else {
                            break L165;
                          }
                        }
                        if (this.field_f < -160) {
                          this.field_f = this.field_f + 320;
                          this.field_p = this.field_p - 1;
                          break L150;
                        } else {
                          break L150;
                        }
                      } else {
                        break L150;
                      }
                    }
                    stackIn_855_0 = this;
                    decompiledRegionSelector0 = 10;
                    break L0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "gf.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gf) ((Object) stackIn_216_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (gf) (this);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (gf) ((Object) stackIn_221_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (gf) ((Object) stackIn_316_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (gf) ((Object) stackIn_350_0);
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (gf) (this);
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return (gf) ((Object) stackIn_373_0);
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return (gf) (this);
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return (gf) ((Object) stackIn_612_0);
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return (gf) ((Object) stackIn_642_0);
                          } else {
                            return (gf) (this);
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

    final static void a(long param0, int param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if ((param0 ^ -1L) >= -1L) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 % 10L == 0L) {
                  ng.a(-1L + param0, 1855635080);
                  ng.a(1L, param1 + 1855645389);
                  break L1;
                } else {
                  ng.a(param0, 1855635080);
                  break L1;
                }
              }
              L2: {
                if (param1 == -10309) {
                  break L2;
                } else {
                  field_a = (String[]) null;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3), "gf.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    gf(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_d = 0;
        try {
          L0: {
            L1: {
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
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!this.a(false)) {
                break L2;
              } else {
                this.field_i = 1;
                q.field_b[this.field_n][this.field_p].field_a = false;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var4), "gf.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = new String[11];
    }
}
