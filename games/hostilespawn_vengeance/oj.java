/*
 * Decompiled by CFR-JS 0.4.0.
 */
class oj extends p {
    int field_t;
    boolean field_J;
    int field_I;
    boolean field_s;
    bd field_u;
    int field_x;
    boolean field_N;
    bd[] field_H;
    int field_w;
    int field_o;
    int field_v;
    int field_M;
    int field_F;
    int field_E;
    private int field_A;
    static int[] field_y;
    int field_q;
    int field_L;
    int field_G;
    int field_C;
    int field_z;
    int field_D;
    int field_B;
    int field_r;
    double field_K;
    int field_p;

    public static void g(byte param0) {
        int var1 = -76 % ((param0 - 22) / 58);
        field_y = null;
    }

    final int a(int param0, boolean param1) {
        if (!(!param1)) {
            return this.field_o;
        }
        if (param0 != 3) {
            this.field_v = -79;
        }
        return this.field_A;
    }

    final bd g(int param0) {
        int var2;
        int var3;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if (param0 == -28) {
            break L0;
          } else {
            this.field_x = -15;
            break L0;
          }
        }
        var2 = this.field_i;
        if (1 != var2) {
          if (var2 != 18) {
            if (19 != var2) {
              if (-4 != (var2 ^ -1)) {
                if (4 != var2) {
                  if (-9 != (var2 ^ -1)) {
                    if (26 != var2) {
                      if (23 != var2) {
                        if (var2 != 25) {
                          if (-28 != (var2 ^ -1)) {
                            if ((var2 ^ -1) != -29) {
                              if (-25 == (var2 ^ -1)) {
                                return wc.field_f[this.field_w][this.field_z % wc.field_f[this.field_w].length];
                              } else {
                                return null;
                              }
                            } else {
                              return of.field_c[this.field_w][this.field_z % of.field_c[this.field_w].length];
                            }
                          } else {
                            return pa.field_i[this.field_w][this.field_z % pa.field_i[this.field_w].length];
                          }
                        } else {
                          return vd.field_y[this.field_w][this.field_z % vd.field_y[this.field_w].length];
                        }
                      } else {
                        return ck.field_y[this.field_w][this.field_z % ck.field_y[this.field_w].length];
                      }
                    } else {
                      return jh.field_eb[this.field_w][this.field_z % jh.field_eb[this.field_w].length];
                    }
                  } else {
                    return re.field_D[this.field_w][this.field_z % re.field_D[this.field_w].length];
                  }
                } else {
                  return ia.field_l[10];
                }
              } else {
                return bf.field_f[this.field_w][this.field_z % bf.field_f[this.field_w].length];
              }
            } else {
              return lb.field_a[this.field_w][this.field_z % lb.field_a[this.field_w].length];
            }
          } else {
            return kl.field_b[this.field_w][this.field_z % kl.field_b[this.field_w].length];
          }
        } else {
          return wc.field_f[this.field_w][this.field_z % wc.field_f[this.field_w].length];
        }
    }

    final int f(int param0) {
        int var2 = 84 % ((67 - param0) / 51);
        return (int)(((double)this.field_j.field_g + this.field_l.field_a) * 24.0 - (double)uj.field_p.field_g);
    }

    final boolean d(byte param0) {
        int stackIn_13_0 = 0;
        L0: {
          if (param0 >= 66) {
            break L0;
          } else {
            this.field_A = 32;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-1 == (this.field_i ^ -1)) {
              break L2;
            } else {
              if (-2 == (this.field_i ^ -1)) {
                break L2;
              } else {
                if ((this.field_i ^ -1) == -19) {
                  break L2;
                } else {
                  if (-25 == (this.field_i ^ -1)) {
                    break L2;
                  } else {
                    if ((this.field_i ^ -1) == -20) {
                      break L2;
                    } else {
                      if (-29 == (this.field_i ^ -1)) {
                        break L2;
                      } else {
                        if ((this.field_i ^ -1) == -24) {
                          break L2;
                        } else {
                          if (this.field_i != 27) {
                            stackIn_13_0 = 0;
                            break L1;
                          } else {
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
          stackIn_13_0 = 1;
          break L1;
        }
        return stackIn_13_0 != 0;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, oc param5) {
        bd[] stackIn_106_0 = null;
        RuntimeException stackIn_531_0 = null;
        StringBuilder stackIn_531_1 = null;
        RuntimeException stackIn_532_0 = null;
        StringBuilder stackIn_532_1 = null;
        String stackIn_532_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        bd[] var10 = null;
        bd[] var11 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_i = param3;
              this.field_C = l.a(-28, this.field_i);
              this.field_j.a((byte) 46, param5);
              this.field_l.a(0.0, 0.0, 1);
              this.field_G = 0;
              this.field_e = 0;
              this.field_h = 0;
              var7_int = param3;
              if (1 == var7_int) {
                this.field_M = 50;
                break L1;
              } else {
                if (-24 == (var7_int ^ -1)) {
                  this.field_M = 50;
                  break L1;
                } else {
                  if (var7_int == 24) {
                    this.field_M = 50;
                    break L1;
                  } else {
                    if (var7_int != 25) {
                      if ((var7_int ^ -1) == -27) {
                        this.field_M = 50;
                        break L1;
                      } else {
                        if (var7_int == 18) {
                          this.field_M = 50;
                          break L1;
                        } else {
                          if (-20 != (var7_int ^ -1)) {
                            if (var7_int != 28) {
                              if (var7_int != 225) {
                                if (var7_int != 27) {
                                  if (3 == var7_int) {
                                    this.field_M = 25;
                                    break L1;
                                  } else {
                                    if (-6 != (var7_int ^ -1)) {
                                      if (-23 == (var7_int ^ -1)) {
                                        this.field_M = 0;
                                        break L1;
                                      } else {
                                        if ((var7_int ^ -1) == -126) {
                                          this.field_M = 0;
                                          break L1;
                                        } else {
                                          this.field_M = 0;
                                          break L1;
                                        }
                                      }
                                    } else {
                                      this.field_M = 0;
                                      break L1;
                                    }
                                  }
                                } else {
                                  this.field_M = 100;
                                  break L1;
                                }
                              } else {
                                this.field_M = 50;
                                break L1;
                              }
                            } else {
                              this.field_M = 100;
                              break L1;
                            }
                          } else {
                            this.field_M = 100;
                            break L1;
                          }
                        }
                      }
                    } else {
                      this.field_M = 50;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              L3: {
                this.field_z = 0;
                this.field_n = false;
                this.field_q = 0;
                this.field_p = 0;
                this.field_c = (double)param1;
                this.field_I = 10;
                if (1 == param3) {
                  break L3;
                } else {
                  if (param3 == 23) {
                    break L3;
                  } else {
                    if (-25 == (param3 ^ -1)) {
                      break L3;
                    } else {
                      if (param3 == 25) {
                        break L3;
                      } else {
                        if (26 != param3) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              var7_int = param4;
              if (var7_int == 0) {
                this.field_I = 5;
                break L2;
              } else {
                if (var7_int == 1) {
                  this.field_I = 7;
                  break L2;
                } else {
                  if (2 == var7_int) {
                    this.field_I = 8;
                    break L2;
                  } else {
                    if (-8 == (var7_int ^ -1)) {
                      this.field_I = 12;
                      break L2;
                    } else {
                      if (-9 == (var7_int ^ -1)) {
                        this.field_I = 15;
                        break L2;
                      } else {
                        if (var7_int == 9) {
                          this.field_I = 20;
                          break L2;
                        } else {
                          this.field_I = 10;
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            L4: {
              if (-19 != (param3 ^ -1)) {
                break L4;
              } else {
                if (param4 > 6) {
                  if (7 == param4) {
                    this.field_I = 8;
                    break L4;
                  } else {
                    if (param4 == 8) {
                      this.field_I = 12;
                      break L4;
                    } else {
                      if (9 == param4) {
                        this.field_I = 14;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                } else {
                  this.field_I = 6;
                  break L4;
                }
              }
            }
            L5: {
              L6: {
                if (param3 == 19) {
                  break L6;
                } else {
                  if ((param3 ^ -1) == -29) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              if (7 == param4) {
                this.field_I = 15;
                break L5;
              } else {
                if (8 == param4) {
                  this.field_I = 20;
                  break L5;
                } else {
                  if (-10 != (param4 ^ -1)) {
                    break L5;
                  } else {
                    this.field_I = 25;
                    break L5;
                  }
                }
              }
            }
            L7: {
              if (-226 == (param3 ^ -1)) {
                this.field_I = 20;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (-28 != (param3 ^ -1)) {
                break L8;
              } else {
                this.field_I = 200;
                this.field_x = 200;
                break L8;
              }
            }
            L9: {
              this.field_F = 0;
              if (2 != param3) {
                break L9;
              } else {
                this.field_I = 0;
                break L9;
              }
            }
            L10: {
              if (3 != param3) {
                break L10;
              } else {
                this.field_I = 6;
                break L10;
              }
            }
            L11: {
              if (-6 != (param3 ^ -1)) {
                break L11;
              } else {
                this.field_I = 20;
                break L11;
              }
            }
            L12: {
              if ((param3 ^ -1) == -23) {
                this.field_I = 20;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (-11 != (param3 ^ -1)) {
                break L13;
              } else {
                this.field_I = 100;
                break L13;
              }
            }
            if (param2 == 21963) {
              L14: {
                if ((param3 ^ -1) != -12) {
                  break L14;
                } else {
                  this.field_I = 100;
                  break L14;
                }
              }
              L15: {
                if (20 != param3) {
                  break L15;
                } else {
                  this.field_I = 400;
                  break L15;
                }
              }
              L16: {
                if (!this.a((byte) 54)) {
                  break L16;
                } else {
                  this.field_I = 50;
                  break L16;
                }
              }
              L17: {
                if (param3 == 125) {
                  this.field_I = 10;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (!param0) {
                  stackIn_106_0 = ia.field_l;
                  break L18;
                } else {
                  stackIn_106_0 = dc.field_a;
                  break L18;
                }
              }
              L19: {
                var10 = stackIn_106_0;
                var11 = var10;
                if (-30 == (this.field_i ^ -1)) {
                  this.field_u = var11[32];
                  break L19;
                } else {
                  if (-32 == (this.field_i ^ -1)) {
                    this.field_u = var11[34];
                    break L19;
                  } else {
                    if ((this.field_i ^ -1) == -33) {
                      this.field_u = var11[35];
                      break L19;
                    } else {
                      if (this.field_i == 33) {
                        this.field_u = var11[36];
                        break L19;
                      } else {
                        if (-35 == (this.field_i ^ -1)) {
                          this.field_u = var11[37];
                          break L19;
                        } else {
                          if (-36 != (this.field_i ^ -1)) {
                            if ((this.field_i ^ -1) == -37) {
                              this.field_u = var11[39];
                              break L19;
                            } else {
                              if (-38 != (this.field_i ^ -1)) {
                                if (this.field_i == 38) {
                                  this.field_u = var11[41];
                                  break L19;
                                } else {
                                  if (-40 != (this.field_i ^ -1)) {
                                    if (this.field_i != 40) {
                                      if (41 != this.field_i) {
                                        if (-43 != (this.field_i ^ -1)) {
                                          if ((this.field_i ^ -1) != -44) {
                                            if (-45 == (this.field_i ^ -1)) {
                                              this.field_u = var11[47];
                                              break L19;
                                            } else {
                                              if (45 == this.field_i) {
                                                this.field_u = var11[48];
                                                break L19;
                                              } else {
                                                if (-47 != (this.field_i ^ -1)) {
                                                  if (-48 == (this.field_i ^ -1)) {
                                                    this.field_u = var11[50];
                                                    break L19;
                                                  } else {
                                                    if ((this.field_i ^ -1) != -49) {
                                                      if (49 != this.field_i) {
                                                        if ((this.field_i ^ -1) == -51) {
                                                          this.field_u = var11[53];
                                                          break L19;
                                                        } else {
                                                          if (this.field_i != 51) {
                                                            if (this.field_i != 52) {
                                                              if (-54 != (this.field_i ^ -1)) {
                                                                if (this.field_i == 54) {
                                                                  this.field_u = var11[57];
                                                                  break L19;
                                                                } else {
                                                                  if (-56 != (this.field_i ^ -1)) {
                                                                    if (this.field_i != 56) {
                                                                      if (-58 != (this.field_i ^ -1)) {
                                                                        if ((this.field_i ^ -1) == -59) {
                                                                          this.field_u = var11[61];
                                                                          break L19;
                                                                        } else {
                                                                          if (-60 == (this.field_i ^ -1)) {
                                                                            this.field_u = var11[62];
                                                                            break L19;
                                                                          } else {
                                                                            if (60 == this.field_i) {
                                                                              this.field_u = var11[63];
                                                                              break L19;
                                                                            } else {
                                                                              if ((this.field_i ^ -1) != -62) {
                                                                                if (this.field_i == 62) {
                                                                                  this.field_u = var11[65];
                                                                                  break L19;
                                                                                } else {
                                                                                  if (-64 == (this.field_i ^ -1)) {
                                                                                    this.field_u = var11[66];
                                                                                    break L19;
                                                                                  } else {
                                                                                    if (64 == this.field_i) {
                                                                                      this.field_u = var11[67];
                                                                                      break L19;
                                                                                    } else {
                                                                                      if (-66 != (this.field_i ^ -1)) {
                                                                                        if (66 != this.field_i) {
                                                                                          if (-68 == (this.field_i ^ -1)) {
                                                                                            this.field_u = var11[70];
                                                                                            break L19;
                                                                                          } else {
                                                                                            if ((this.field_i ^ -1) != -69) {
                                                                                              if (-70 == (this.field_i ^ -1)) {
                                                                                                this.field_u = var11[72];
                                                                                                break L19;
                                                                                              } else {
                                                                                                if (this.field_i == 70) {
                                                                                                  this.field_u = var11[73];
                                                                                                  break L19;
                                                                                                } else {
                                                                                                  if (-72 == (this.field_i ^ -1)) {
                                                                                                    this.field_u = var11[74];
                                                                                                    break L19;
                                                                                                  } else {
                                                                                                    if (this.field_i != 72) {
                                                                                                      if (-74 == (this.field_i ^ -1)) {
                                                                                                        this.field_u = var11[76];
                                                                                                        break L19;
                                                                                                      } else {
                                                                                                        if (-75 == (this.field_i ^ -1)) {
                                                                                                          this.field_u = var11[77];
                                                                                                          break L19;
                                                                                                        } else {
                                                                                                          if (this.field_i == 75) {
                                                                                                            this.field_u = var11[78];
                                                                                                            break L19;
                                                                                                          } else {
                                                                                                            if ((this.field_i ^ -1) == -77) {
                                                                                                              this.field_u = var11[79];
                                                                                                              break L19;
                                                                                                            } else {
                                                                                                              if ((this.field_i ^ -1) != -78) {
                                                                                                                if (this.field_i == 78) {
                                                                                                                  this.field_u = var11[81];
                                                                                                                  break L19;
                                                                                                                } else {
                                                                                                                  if ((this.field_i ^ -1) != -80) {
                                                                                                                    if ((this.field_i ^ -1) != -81) {
                                                                                                                      if (-82 != (this.field_i ^ -1)) {
                                                                                                                        if (-83 != (this.field_i ^ -1)) {
                                                                                                                          if (this.field_i != 83) {
                                                                                                                            if (-85 == (this.field_i ^ -1)) {
                                                                                                                              this.field_u = var11[87];
                                                                                                                              break L19;
                                                                                                                            } else {
                                                                                                                              if (-86 == (this.field_i ^ -1)) {
                                                                                                                                this.field_u = var11[88];
                                                                                                                                break L19;
                                                                                                                              } else {
                                                                                                                                if (86 == this.field_i) {
                                                                                                                                  this.field_u = var11[89];
                                                                                                                                  break L19;
                                                                                                                                } else {
                                                                                                                                  if (-88 != (this.field_i ^ -1)) {
                                                                                                                                    if (this.field_i != 88) {
                                                                                                                                      if (-90 != (this.field_i ^ -1)) {
                                                                                                                                        if (-91 != (this.field_i ^ -1)) {
                                                                                                                                          if (this.field_i == 91) {
                                                                                                                                            this.field_u = var11[94];
                                                                                                                                            break L19;
                                                                                                                                          } else {
                                                                                                                                            if (this.field_i == 92) {
                                                                                                                                              this.field_u = var11[95];
                                                                                                                                              break L19;
                                                                                                                                            } else {
                                                                                                                                              if (93 != this.field_i) {
                                                                                                                                                if (94 != this.field_i) {
                                                                                                                                                  if (-96 != (this.field_i ^ -1)) {
                                                                                                                                                    if ((this.field_i ^ -1) != -97) {
                                                                                                                                                      if (-98 == (this.field_i ^ -1)) {
                                                                                                                                                        this.field_u = var11[100];
                                                                                                                                                        break L19;
                                                                                                                                                      } else {
                                                                                                                                                        if ((this.field_i ^ -1) == -99) {
                                                                                                                                                          this.field_u = var11[101];
                                                                                                                                                          break L19;
                                                                                                                                                        } else {
                                                                                                                                                          if (99 == this.field_i) {
                                                                                                                                                            this.field_u = var11[102];
                                                                                                                                                            break L19;
                                                                                                                                                          } else {
                                                                                                                                                            if ((this.field_i ^ -1) != -101) {
                                                                                                                                                              if ((this.field_i ^ -1) == -102) {
                                                                                                                                                                this.field_u = var11[104];
                                                                                                                                                                break L19;
                                                                                                                                                              } else {
                                                                                                                                                                if (-103 != (this.field_i ^ -1)) {
                                                                                                                                                                  if (-104 != (this.field_i ^ -1)) {
                                                                                                                                                                    if ((this.field_i ^ -1) != -105) {
                                                                                                                                                                      if ((this.field_i ^ -1) != -106) {
                                                                                                                                                                        if (106 != this.field_i) {
                                                                                                                                                                          if (107 != this.field_i) {
                                                                                                                                                                            if (-109 != (this.field_i ^ -1)) {
                                                                                                                                                                              if (this.field_i == 109) {
                                                                                                                                                                                this.field_u = var11[112];
                                                                                                                                                                                break L19;
                                                                                                                                                                              } else {
                                                                                                                                                                                if ((this.field_i ^ -1) == -111) {
                                                                                                                                                                                  this.field_u = var11[113];
                                                                                                                                                                                  break L19;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (this.field_i != 111) {
                                                                                                                                                                                    if (112 == this.field_i) {
                                                                                                                                                                                      this.field_u = var11[115];
                                                                                                                                                                                      break L19;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      if (this.field_i != 113) {
                                                                                                                                                                                        if ((this.field_i ^ -1) == -115) {
                                                                                                                                                                                          this.field_u = var11[117];
                                                                                                                                                                                          break L19;
                                                                                                                                                                                        } else {
                                                                                                                                                                                          if (-116 == (this.field_i ^ -1)) {
                                                                                                                                                                                            this.field_u = var11[118];
                                                                                                                                                                                            break L19;
                                                                                                                                                                                          } else {
                                                                                                                                                                                            if (116 == this.field_i) {
                                                                                                                                                                                              this.field_u = var11[119];
                                                                                                                                                                                              break L19;
                                                                                                                                                                                            } else {
                                                                                                                                                                                              if (this.field_i != 117) {
                                                                                                                                                                                                if (-119 != (this.field_i ^ -1)) {
                                                                                                                                                                                                  if (-120 == (this.field_i ^ -1)) {
                                                                                                                                                                                                    this.field_u = var11[122];
                                                                                                                                                                                                    break L19;
                                                                                                                                                                                                  } else {
                                                                                                                                                                                                    if (-121 != (this.field_i ^ -1)) {
                                                                                                                                                                                                      if (this.field_i != 121) {
                                                                                                                                                                                                        if ((this.field_i ^ -1) != -123) {
                                                                                                                                                                                                          if (-124 == (this.field_i ^ -1)) {
                                                                                                                                                                                                            this.field_u = var11[126];
                                                                                                                                                                                                            break L19;
                                                                                                                                                                                                          } else {
                                                                                                                                                                                                            if (124 != this.field_i) {
                                                                                                                                                                                                              if ((this.field_i ^ -1) != -126) {
                                                                                                                                                                                                                if (this.field_i == 126) {
                                                                                                                                                                                                                  this.field_u = var11[129];
                                                                                                                                                                                                                  break L19;
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                  if ((this.field_i ^ -1) == -128) {
                                                                                                                                                                                                                    this.field_u = var11[130];
                                                                                                                                                                                                                    break L19;
                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                    if (this.field_i == 134) {
                                                                                                                                                                                                                      this.field_u = var11[131];
                                                                                                                                                                                                                      break L19;
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                      if (135 == this.field_i) {
                                                                                                                                                                                                                        this.field_u = var11[132];
                                                                                                                                                                                                                        break L19;
                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                        if (136 == this.field_i) {
                                                                                                                                                                                                                          this.field_u = var11[133];
                                                                                                                                                                                                                          break L19;
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                          if (137 != this.field_i) {
                                                                                                                                                                                                                            if ((this.field_i ^ -1) != -139) {
                                                                                                                                                                                                                              if (-140 == (this.field_i ^ -1)) {
                                                                                                                                                                                                                                this.field_u = var11[136];
                                                                                                                                                                                                                                break L19;
                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                if (-141 == (this.field_i ^ -1)) {
                                                                                                                                                                                                                                  this.field_u = var11[137];
                                                                                                                                                                                                                                  break L19;
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                  if (141 != this.field_i) {
                                                                                                                                                                                                                                    if (142 != this.field_i) {
                                                                                                                                                                                                                                      if (-144 == (this.field_i ^ -1)) {
                                                                                                                                                                                                                                        this.field_u = var11[140];
                                                                                                                                                                                                                                        break L19;
                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                        if (this.field_i != 144) {
                                                                                                                                                                                                                                          if ((this.field_i ^ -1) == -146) {
                                                                                                                                                                                                                                            this.field_u = var11[142];
                                                                                                                                                                                                                                            break L19;
                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                            if (this.field_i == 146) {
                                                                                                                                                                                                                                              this.field_u = var11[143];
                                                                                                                                                                                                                                              break L19;
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                              if (147 == this.field_i) {
                                                                                                                                                                                                                                                this.field_u = var11[144];
                                                                                                                                                                                                                                                break L19;
                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                if ((this.field_i ^ -1) == -149) {
                                                                                                                                                                                                                                                  this.field_u = var11[145];
                                                                                                                                                                                                                                                  break L19;
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                  if ((this.field_i ^ -1) != -150) {
                                                                                                                                                                                                                                                    if (150 != this.field_i) {
                                                                                                                                                                                                                                                      if (151 == this.field_i) {
                                                                                                                                                                                                                                                        this.field_u = var11[148];
                                                                                                                                                                                                                                                        break L19;
                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                        if (this.field_i == 152) {
                                                                                                                                                                                                                                                          this.field_u = var11[149];
                                                                                                                                                                                                                                                          break L19;
                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                          if (this.field_i == 153) {
                                                                                                                                                                                                                                                            this.field_u = var11[150];
                                                                                                                                                                                                                                                            break L19;
                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                            if (-155 != (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                              if (this.field_i == 155) {
                                                                                                                                                                                                                                                                this.field_u = var11[152];
                                                                                                                                                                                                                                                                break L19;
                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                if (-157 == (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                                  this.field_u = var11[153];
                                                                                                                                                                                                                                                                  break L19;
                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                  if (-158 == (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                                    this.field_u = var11[154];
                                                                                                                                                                                                                                                                    break L19;
                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                    if (-159 != (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                                      if (this.field_i != 159) {
                                                                                                                                                                                                                                                                        if (-161 == (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                                          this.field_u = var11[157];
                                                                                                                                                                                                                                                                          break L19;
                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                          if (161 != this.field_i) {
                                                                                                                                                                                                                                                                            if (162 != this.field_i) {
                                                                                                                                                                                                                                                                              if (this.field_i == 163) {
                                                                                                                                                                                                                                                                                this.field_u = var11[160];
                                                                                                                                                                                                                                                                                break L19;
                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                if (164 != this.field_i) {
                                                                                                                                                                                                                                                                                  if (this.field_i != 165) {
                                                                                                                                                                                                                                                                                    if (this.field_i == 166) {
                                                                                                                                                                                                                                                                                      this.field_u = var11[163];
                                                                                                                                                                                                                                                                                      break L19;
                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                      if (167 == this.field_i) {
                                                                                                                                                                                                                                                                                        this.field_u = var11[164];
                                                                                                                                                                                                                                                                                        break L19;
                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                        if (-169 == (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                                                          this.field_u = var11[165];
                                                                                                                                                                                                                                                                                          break L19;
                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                          if ((this.field_i ^ -1) == -170) {
                                                                                                                                                                                                                                                                                            this.field_u = var11[166];
                                                                                                                                                                                                                                                                                            break L19;
                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                            if (-171 != (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                                                              if (171 == this.field_i) {
                                                                                                                                                                                                                                                                                                this.field_u = var11[168];
                                                                                                                                                                                                                                                                                                break L19;
                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                if ((this.field_i ^ -1) != -173) {
                                                                                                                                                                                                                                                                                                  if ((this.field_i ^ -1) != -174) {
                                                                                                                                                                                                                                                                                                    if (this.field_i != 174) {
                                                                                                                                                                                                                                                                                                      if (175 == this.field_i) {
                                                                                                                                                                                                                                                                                                        this.field_u = var11[172];
                                                                                                                                                                                                                                                                                                        break L19;
                                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                                        if ((this.field_i ^ -1) == -177) {
                                                                                                                                                                                                                                                                                                          this.field_u = var11[173];
                                                                                                                                                                                                                                                                                                          break L19;
                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                          if (-178 == (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                                                                            this.field_u = var11[174];
                                                                                                                                                                                                                                                                                                            break L19;
                                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                                            if (-179 == (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                                                                              this.field_u = var11[175];
                                                                                                                                                                                                                                                                                                              break L19;
                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                              if (this.field_i == 179) {
                                                                                                                                                                                                                                                                                                                this.field_u = var11[176];
                                                                                                                                                                                                                                                                                                                break L19;
                                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                                if ((this.field_i ^ -1) != -181) {
                                                                                                                                                                                                                                                                                                                  if (181 == this.field_i) {
                                                                                                                                                                                                                                                                                                                    this.field_u = var11[178];
                                                                                                                                                                                                                                                                                                                    break L19;
                                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                                    if (182 != this.field_i) {
                                                                                                                                                                                                                                                                                                                      if ((this.field_i ^ -1) != -184) {
                                                                                                                                                                                                                                                                                                                        if (184 == this.field_i) {
                                                                                                                                                                                                                                                                                                                          this.field_u = var11[181];
                                                                                                                                                                                                                                                                                                                          break L19;
                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                          if (-186 == (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                                                                                            this.field_u = var11[182];
                                                                                                                                                                                                                                                                                                                            break L19;
                                                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                                                            if (-187 != (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                                                                                              if (this.field_i != 187) {
                                                                                                                                                                                                                                                                                                                                if (188 == this.field_i) {
                                                                                                                                                                                                                                                                                                                                  this.field_u = var11[185];
                                                                                                                                                                                                                                                                                                                                  break L19;
                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                  if (this.field_i != 189) {
                                                                                                                                                                                                                                                                                                                                    if (190 == this.field_i) {
                                                                                                                                                                                                                                                                                                                                      this.field_u = var11[187];
                                                                                                                                                                                                                                                                                                                                      break L19;
                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                      if (-192 == (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                                                                                                        this.field_u = var11[188];
                                                                                                                                                                                                                                                                                                                                        break L19;
                                                                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                                                                        if (this.field_i == 192) {
                                                                                                                                                                                                                                                                                                                                          this.field_u = var11[189];
                                                                                                                                                                                                                                                                                                                                          break L19;
                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                          if (this.field_i != 193) {
                                                                                                                                                                                                                                                                                                                                            if (this.field_i == 194) {
                                                                                                                                                                                                                                                                                                                                              this.field_u = var11[191];
                                                                                                                                                                                                                                                                                                                                              break L19;
                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                              if (195 != this.field_i) {
                                                                                                                                                                                                                                                                                                                                                if (196 != this.field_i) {
                                                                                                                                                                                                                                                                                                                                                  if (197 != this.field_i) {
                                                                                                                                                                                                                                                                                                                                                    if (198 != this.field_i) {
                                                                                                                                                                                                                                                                                                                                                      if (this.field_i == 199) {
                                                                                                                                                                                                                                                                                                                                                        this.field_u = var11[196];
                                                                                                                                                                                                                                                                                                                                                        break L19;
                                                                                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                                                                                        if ((this.field_i ^ -1) == -201) {
                                                                                                                                                                                                                                                                                                                                                          this.field_u = var11[197];
                                                                                                                                                                                                                                                                                                                                                          break L19;
                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                          if ((this.field_i ^ -1) != -202) {
                                                                                                                                                                                                                                                                                                                                                            if ((this.field_i ^ -1) == -203) {
                                                                                                                                                                                                                                                                                                                                                              this.field_u = var11[199];
                                                                                                                                                                                                                                                                                                                                                              break L19;
                                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                                              if (-204 == (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                                                                                                                                this.field_u = var11[200];
                                                                                                                                                                                                                                                                                                                                                                break L19;
                                                                                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                                                                                if (204 == this.field_i) {
                                                                                                                                                                                                                                                                                                                                                                  this.field_u = var11[201];
                                                                                                                                                                                                                                                                                                                                                                  break L19;
                                                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                                                  if (205 != this.field_i) {
                                                                                                                                                                                                                                                                                                                                                                    if (-207 == (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                                                                                                                                      this.field_u = var11[203];
                                                                                                                                                                                                                                                                                                                                                                      break L19;
                                                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                                                      if (207 == this.field_i) {
                                                                                                                                                                                                                                                                                                                                                                        this.field_u = var11[204];
                                                                                                                                                                                                                                                                                                                                                                        break L19;
                                                                                                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                                                                                                        if (this.field_i == 208) {
                                                                                                                                                                                                                                                                                                                                                                          this.field_u = var11[205];
                                                                                                                                                                                                                                                                                                                                                                          break L19;
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                          if ((this.field_i ^ -1) == -210) {
                                                                                                                                                                                                                                                                                                                                                                            this.field_u = var11[206];
                                                                                                                                                                                                                                                                                                                                                                            break L19;
                                                                                                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                                                                                                            if (210 != this.field_i) {
                                                                                                                                                                                                                                                                                                                                                                              if ((this.field_i ^ -1) == -212) {
                                                                                                                                                                                                                                                                                                                                                                                this.field_u = var11[208];
                                                                                                                                                                                                                                                                                                                                                                                break L19;
                                                                                                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                                                                                                if (-213 == (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                                                                                                                                                  this.field_u = var11[209];
                                                                                                                                                                                                                                                                                                                                                                                  break L19;
                                                                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                                                                  if (-214 == (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                                                                                                                                                    this.field_u = var11[210];
                                                                                                                                                                                                                                                                                                                                                                                    break L19;
                                                                                                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                                                                                                    if ((this.field_i ^ -1) == -215) {
                                                                                                                                                                                                                                                                                                                                                                                      this.field_u = var11[211];
                                                                                                                                                                                                                                                                                                                                                                                      break L19;
                                                                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                                                                      if ((this.field_i ^ -1) != -216) {
                                                                                                                                                                                                                                                                                                                                                                                        if (216 == this.field_i) {
                                                                                                                                                                                                                                                                                                                                                                                          this.field_u = var11[213];
                                                                                                                                                                                                                                                                                                                                                                                          break L19;
                                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                                          if (this.field_i == 217) {
                                                                                                                                                                                                                                                                                                                                                                                            this.field_u = var11[214];
                                                                                                                                                                                                                                                                                                                                                                                            break L19;
                                                                                                                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                                                                                                                            if ((this.field_i ^ -1) == -219) {
                                                                                                                                                                                                                                                                                                                                                                                              this.field_u = var11[215];
                                                                                                                                                                                                                                                                                                                                                                                              break L19;
                                                                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                                                                              if (-220 != (this.field_i ^ -1)) {
                                                                                                                                                                                                                                                                                                                                                                                                if (this.field_i != 220) {
                                                                                                                                                                                                                                                                                                                                                                                                  if (221 == this.field_i) {
                                                                                                                                                                                                                                                                                                                                                                                                    this.field_u = var11[218];
                                                                                                                                                                                                                                                                                                                                                                                                    break L19;
                                                                                                                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                                                                                                                    if ((this.field_i ^ -1) != -223) {
                                                                                                                                                                                                                                                                                                                                                                                                      if (223 != this.field_i) {
                                                                                                                                                                                                                                                                                                                                                                                                        if ((this.field_i ^ -1) == -225) {
                                                                                                                                                                                                                                                                                                                                                                                                          this.field_u = var11[221];
                                                                                                                                                                                                                                                                                                                                                                                                          break L19;
                                                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                                                          break L19;
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                                                                                                                                        this.field_u = var11[220];
                                                                                                                                                                                                                                                                                                                                                                                                        break L19;
                                                                                                                                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                                                                                      this.field_u = var11[219];
                                                                                                                                                                                                                                                                                                                                                                                                      break L19;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                                                                                  this.field_u = var11[217];
                                                                                                                                                                                                                                                                                                                                                                                                  break L19;
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                                                                                                                this.field_u = var11[216];
                                                                                                                                                                                                                                                                                                                                                                                                break L19;
                                                                                                                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                                                                                                                        this.field_u = var11[212];
                                                                                                                                                                                                                                                                                                                                                                                        break L19;
                                                                                                                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                                                              this.field_u = var11[207];
                                                                                                                                                                                                                                                                                                                                                                              break L19;
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                                                                                    this.field_u = var11[202];
                                                                                                                                                                                                                                                                                                                                                                    break L19;
                                                                                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                                                                                            this.field_u = var11[198];
                                                                                                                                                                                                                                                                                                                                                            break L19;
                                                                                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                                      this.field_u = var11[195];
                                                                                                                                                                                                                                                                                                                                                      break L19;
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                                                                    this.field_u = var11[194];
                                                                                                                                                                                                                                                                                                                                                    break L19;
                                                                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                                  this.field_u = var11[193];
                                                                                                                                                                                                                                                                                                                                                  break L19;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                                                                this.field_u = var11[192];
                                                                                                                                                                                                                                                                                                                                                break L19;
                                                                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                                                                            this.field_u = var11[190];
                                                                                                                                                                                                                                                                                                                                            break L19;
                                                                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                                                    this.field_u = var11[186];
                                                                                                                                                                                                                                                                                                                                    break L19;
                                                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                                                this.field_u = var11[184];
                                                                                                                                                                                                                                                                                                                                break L19;
                                                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                              this.field_u = var11[183];
                                                                                                                                                                                                                                                                                                                              break L19;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                                                        this.field_u = var11[180];
                                                                                                                                                                                                                                                                                                                        break L19;
                                                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                      this.field_u = var11[179];
                                                                                                                                                                                                                                                                                                                      break L19;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                  this.field_u = var11[177];
                                                                                                                                                                                                                                                                                                                  break L19;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                      this.field_u = var11[171];
                                                                                                                                                                                                                                                                                                      break L19;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                    this.field_u = var11[170];
                                                                                                                                                                                                                                                                                                    break L19;
                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                  this.field_u = var11[169];
                                                                                                                                                                                                                                                                                                  break L19;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                              this.field_u = var11[167];
                                                                                                                                                                                                                                                                                              break L19;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                    this.field_u = var11[162];
                                                                                                                                                                                                                                                                                    break L19;
                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                  this.field_u = var11[161];
                                                                                                                                                                                                                                                                                  break L19;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                              this.field_u = var11[159];
                                                                                                                                                                                                                                                                              break L19;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                            this.field_u = var11[158];
                                                                                                                                                                                                                                                                            break L19;
                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                        this.field_u = var11[156];
                                                                                                                                                                                                                                                                        break L19;
                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                      this.field_u = var11[155];
                                                                                                                                                                                                                                                                      break L19;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                              this.field_u = var11[151];
                                                                                                                                                                                                                                                              break L19;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                      this.field_u = var11[147];
                                                                                                                                                                                                                                                      break L19;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                    this.field_u = var11[146];
                                                                                                                                                                                                                                                    break L19;
                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                          this.field_u = var11[141];
                                                                                                                                                                                                                                          break L19;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                      this.field_u = var11[139];
                                                                                                                                                                                                                                      break L19;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                    this.field_u = var11[138];
                                                                                                                                                                                                                                    break L19;
                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                              }
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                              this.field_u = var11[135];
                                                                                                                                                                                                                              break L19;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                            this.field_u = var11[134];
                                                                                                                                                                                                                            break L19;
                                                                                                                                                                                                                          }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                      }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                  }
                                                                                                                                                                                                                }
                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                this.field_u = var11[128];
                                                                                                                                                                                                                break L19;
                                                                                                                                                                                                              }
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                              this.field_u = var11[127];
                                                                                                                                                                                                              break L19;
                                                                                                                                                                                                            }
                                                                                                                                                                                                          }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                          this.field_u = var11[125];
                                                                                                                                                                                                          break L19;
                                                                                                                                                                                                        }
                                                                                                                                                                                                      } else {
                                                                                                                                                                                                        this.field_u = var11[124];
                                                                                                                                                                                                        break L19;
                                                                                                                                                                                                      }
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                      this.field_u = var11[123];
                                                                                                                                                                                                      break L19;
                                                                                                                                                                                                    }
                                                                                                                                                                                                  }
                                                                                                                                                                                                } else {
                                                                                                                                                                                                  this.field_u = var11[121];
                                                                                                                                                                                                  break L19;
                                                                                                                                                                                                }
                                                                                                                                                                                              } else {
                                                                                                                                                                                                this.field_u = var11[120];
                                                                                                                                                                                                break L19;
                                                                                                                                                                                              }
                                                                                                                                                                                            }
                                                                                                                                                                                          }
                                                                                                                                                                                        }
                                                                                                                                                                                      } else {
                                                                                                                                                                                        this.field_u = var11[116];
                                                                                                                                                                                        break L19;
                                                                                                                                                                                      }
                                                                                                                                                                                    }
                                                                                                                                                                                  } else {
                                                                                                                                                                                    this.field_u = var11[114];
                                                                                                                                                                                    break L19;
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            } else {
                                                                                                                                                                              this.field_u = var11[111];
                                                                                                                                                                              break L19;
                                                                                                                                                                            }
                                                                                                                                                                          } else {
                                                                                                                                                                            this.field_u = var11[110];
                                                                                                                                                                            break L19;
                                                                                                                                                                          }
                                                                                                                                                                        } else {
                                                                                                                                                                          this.field_u = var11[109];
                                                                                                                                                                          break L19;
                                                                                                                                                                        }
                                                                                                                                                                      } else {
                                                                                                                                                                        this.field_u = var11[108];
                                                                                                                                                                        break L19;
                                                                                                                                                                      }
                                                                                                                                                                    } else {
                                                                                                                                                                      this.field_u = var11[107];
                                                                                                                                                                      break L19;
                                                                                                                                                                    }
                                                                                                                                                                  } else {
                                                                                                                                                                    this.field_u = var11[106];
                                                                                                                                                                    break L19;
                                                                                                                                                                  }
                                                                                                                                                                } else {
                                                                                                                                                                  this.field_u = var11[105];
                                                                                                                                                                  break L19;
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            } else {
                                                                                                                                                              this.field_u = var11[103];
                                                                                                                                                              break L19;
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                    } else {
                                                                                                                                                      this.field_u = var11[99];
                                                                                                                                                      break L19;
                                                                                                                                                    }
                                                                                                                                                  } else {
                                                                                                                                                    this.field_u = var11[98];
                                                                                                                                                    break L19;
                                                                                                                                                  }
                                                                                                                                                } else {
                                                                                                                                                  this.field_u = var11[97];
                                                                                                                                                  break L19;
                                                                                                                                                }
                                                                                                                                              } else {
                                                                                                                                                this.field_u = var11[96];
                                                                                                                                                break L19;
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        } else {
                                                                                                                                          this.field_u = var11[93];
                                                                                                                                          break L19;
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        this.field_u = var11[92];
                                                                                                                                        break L19;
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      this.field_u = var11[91];
                                                                                                                                      break L19;
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    this.field_u = var11[90];
                                                                                                                                    break L19;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            this.field_u = var11[86];
                                                                                                                            break L19;
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          this.field_u = var11[85];
                                                                                                                          break L19;
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        this.field_u = var11[84];
                                                                                                                        break L19;
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      this.field_u = var11[83];
                                                                                                                      break L19;
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    this.field_u = var11[82];
                                                                                                                    break L19;
                                                                                                                  }
                                                                                                                }
                                                                                                              } else {
                                                                                                                this.field_u = var11[80];
                                                                                                                break L19;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      this.field_u = var11[75];
                                                                                                      break L19;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              this.field_u = var11[71];
                                                                                              break L19;
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          this.field_u = var11[69];
                                                                                          break L19;
                                                                                        }
                                                                                      } else {
                                                                                        this.field_u = var11[68];
                                                                                        break L19;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                this.field_u = var11[64];
                                                                                break L19;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        this.field_u = var11[60];
                                                                        break L19;
                                                                      }
                                                                    } else {
                                                                      this.field_u = var11[59];
                                                                      break L19;
                                                                    }
                                                                  } else {
                                                                    this.field_u = var11[58];
                                                                    break L19;
                                                                  }
                                                                }
                                                              } else {
                                                                this.field_u = var11[56];
                                                                break L19;
                                                              }
                                                            } else {
                                                              this.field_u = var11[55];
                                                              break L19;
                                                            }
                                                          } else {
                                                            this.field_u = var11[54];
                                                            break L19;
                                                          }
                                                        }
                                                      } else {
                                                        this.field_u = var11[52];
                                                        break L19;
                                                      }
                                                    } else {
                                                      this.field_u = var11[51];
                                                      break L19;
                                                    }
                                                  }
                                                } else {
                                                  this.field_u = var11[49];
                                                  break L19;
                                                }
                                              }
                                            }
                                          } else {
                                            this.field_u = var11[46];
                                            break L19;
                                          }
                                        } else {
                                          this.field_u = var11[45];
                                          break L19;
                                        }
                                      } else {
                                        this.field_u = var11[44];
                                        break L19;
                                      }
                                    } else {
                                      this.field_u = var11[43];
                                      break L19;
                                    }
                                  } else {
                                    this.field_u = var11[42];
                                    break L19;
                                  }
                                }
                              } else {
                                this.field_u = var11[40];
                                break L19;
                              }
                            }
                          } else {
                            this.field_u = var10[38];
                            break L19;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L20: {
                if (this.field_i == 128) {
                  this.field_H = im.field_a;
                  this.field_u = ak.field_a;
                  break L20;
                } else {
                  if (129 == this.field_i) {
                    this.field_H = im.field_a;
                    this.field_u = an.field_d;
                    break L20;
                  } else {
                    if ((this.field_i ^ -1) == -131) {
                      this.field_u = ce.field_a;
                      this.field_H = jd.field_o;
                      break L20;
                    } else {
                      if (this.field_i == 131) {
                        this.field_H = jd.field_o;
                        this.field_u = r.field_c;
                        break L20;
                      } else {
                        if (this.field_i == 132) {
                          this.field_u = qa.field_c;
                          this.field_H = th.field_Hb;
                          break L20;
                        } else {
                          if (133 != this.field_i) {
                            if (-31 != (this.field_i ^ -1)) {
                              if (this.field_i < 233) {
                                break L20;
                              } else {
                                if (-340 < (this.field_i ^ -1)) {
                                  if (param0) {
                                    this.field_u = vb.field_Kb[-233 + this.field_i];
                                    break L20;
                                  } else {
                                    this.field_u = qg.field_g[-233 + this.field_i];
                                    break L20;
                                  }
                                } else {
                                  break L20;
                                }
                              }
                            } else {
                              this.field_H = c.field_f;
                              break L20;
                            }
                          } else {
                            this.field_H = th.field_Hb;
                            this.field_u = gi.field_d;
                            break L20;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L21: {
                this.field_x = this.field_I;
                this.field_b = ni.a(this.field_i, (byte) -64);
                if (this.field_i != 19) {
                  if ((this.field_i ^ -1) != -29) {
                    break L21;
                  } else {
                    this.field_E = 240;
                    this.field_r = 216;
                    break L21;
                  }
                } else {
                  this.field_E = (int)(4.0 * (Math.random() * 24.0)) + 168;
                  if (!om.field_b) {
                    break L21;
                  } else {
                    this.field_E = this.field_E + 48;
                    break L21;
                  }
                }
              }
              L22: {
                this.field_o = 2;
                this.field_A = 1;
                var8 = this.field_i;
                if ((var8 ^ -1) == -19) {
                  this.field_A = this.field_A * 2;
                  this.field_o = this.field_o * 3;
                  break L22;
                } else {
                  if (-25 == (var8 ^ -1)) {
                    this.field_o = this.field_o * 2;
                    this.field_A = this.field_A * 2;
                    break L22;
                  } else {
                    if (27 != var8) {
                      break L22;
                    } else {
                      this.field_A = 2;
                      this.field_o = 2;
                      break L22;
                    }
                  }
                }
              }
              L23: {
                if (om.field_b) {
                  L24: {
                    var8 = this.field_i;
                    if (var8 != 19) {
                      L25: {
                        if ((var8 ^ -1) == -226) {
                          break L25;
                        } else {
                          if ((var8 ^ -1) == -2) {
                            break L25;
                          } else {
                            if (var8 != 18) {
                              break L24;
                            } else {
                              break L25;
                            }
                          }
                        }
                      }
                      this.field_o = this.field_o * 2;
                      break L24;
                    } else {
                      this.field_E = this.field_E + 48;
                      break L24;
                    }
                  }
                  this.field_M = this.field_M * 2;
                  break L23;
                } else {
                  break L23;
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
          L26: {
            var7 = decompiledCaughtException;
            stackIn_531_0 = (RuntimeException) (var7);

            stackIn_531_1 = new StringBuilder().append("oj.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_532_0 = (RuntimeException) ((Object) stackIn_531_0);
              stackIn_532_1 = (StringBuilder) ((Object) stackIn_531_1);
              stackIn_532_2 = "null";
              break L26;
            } else {
              stackIn_532_0 = (RuntimeException) ((Object) stackIn_531_0);
              stackIn_532_1 = (StringBuilder) ((Object) stackIn_531_1);
              stackIn_532_2 = "{...}";
              break L26;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_532_0), stackIn_532_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, double param1, int param2) {
        super.a(param0 + 0, param1, param2);
        if (param0 != 225) {
            this.g(-95);
        }
    }

    final boolean[] b(int param0, int param1, id param2) {
        boolean[] var4 = null;
        RuntimeException var4_ref = null;
        boolean[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -27757) {
                break L1;
              } else {
                this.g(-55);
                break L1;
              }
            }
            L2: {
              if (this.field_b) {
                var4 = this.field_l.a(this.field_j, this.field_c, 1, param1, param2);
                break L2;
              } else {
                var4 = this.field_l.a(param1, this.field_c, this.field_j, false, param2);
                break L2;
              }
            }
            this.b((byte) 117);
            stackIn_6_0 = (boolean[]) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4_ref);

            stackIn_9_1 = new StringBuilder().append("oj.W(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final void c(byte param0) {
        int var2;
        int var3;
        var2 = vd.a(18475, this.field_i);
        if (var2 < 0) {
          throw new RuntimeException("Cannot splat unit type " + this.field_i);
        } else {
          L0: {
            this.field_e = 250;
            this.field_b = false;
            this.field_i = var2;
            if (-18 != (var2 ^ -1)) {
              break L0;
            } else {
              this.field_c = this.field_c + 128.0;
              if (this.field_c >= 256.0) {
                this.field_c = this.field_c - 256.0;
                break L0;
              } else {
                break L0;
              }
            }
          }
          this.field_w = 0;
          var3 = -101 % ((-26 - param0) / 52);
          return;
        }
    }

    final int f(byte param0) {
        if (param0 <= 106) {
            this.field_s = false;
        }
        return (int)(24.0 * ((double)this.field_j.field_e + this.field_l.field_f) - (double)(uj.field_p.field_e - -24));
    }

    final boolean[] a(id param0, int param1, int param2) {
        double var4_double = 0.0;
        RuntimeException var4 = null;
        boolean[] var6 = null;
        boolean[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_double = this.field_c;
              if (param1 == 128) {
                break L1;
              } else {
                oj.g((byte) -21);
                break L1;
              }
            }
            L2: {
              if (this.field_J) {
                if (var4_double >= 128.0) {
                  var4_double = var4_double - 128.0;
                  break L2;
                } else {
                  var4_double = var4_double + 128.0;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            var6 = this.field_l.a(this.field_j, var4_double, 1, param2, param0);
            this.b((byte) 117);
            stackIn_8_0 = (boolean[]) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("oj.S(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    final boolean a(int param0, int param1) {
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_74_0 = 0;
        L0: {
          if (!this.field_N) {
            break L0;
          } else {
            if (1 != bm.field_c) {
              break L0;
            } else {
              if (rl.field_c == 1) {
                L1: {
                  L2: {
                    if (-32 == (param0 ^ -1)) {
                      break L2;
                    } else {
                      if (35 != param0) {
                        stackIn_9_0 = 0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackIn_9_0 = 1;
                  break L1;
                }
                return stackIn_9_0 != 0;
              } else {
                break L0;
              }
            }
          }
        }
        if (this.field_i != 231) {
          L3: {
            if (-9 != (this.field_i ^ -1)) {
              break L3;
            } else {
              if (vi.field_p == null) {
                break L3;
              } else {
                L4: {
                  L5: {
                    if (q.field_g.a((byte) -117)) {
                      break L5;
                    } else {
                      if (0 < pc.field_c) {
                        break L5;
                      } else {
                        stackIn_23_0 = 1;
                        break L4;
                      }
                    }
                  }
                  stackIn_23_0 = 0;
                  break L4;
                }
                return stackIn_23_0 != 0;
              }
            }
          }
          L6: {
            if (-129 < (this.field_i ^ -1)) {
              break L6;
            } else {
              if ((this.field_i ^ -1) >= -134) {
                L7: {
                  L8: {
                    if (param0 == 18) {
                      break L8;
                    } else {
                      if (param0 == 0) {
                        break L8;
                      } else {
                        if (param0 == 32) {
                          break L8;
                        } else {
                          if ((param0 ^ -1) == -5) {
                            break L8;
                          } else {
                            if ((param0 ^ -1) == -21) {
                              break L8;
                            } else {
                              if ((param0 ^ -1) == -14) {
                                break L8;
                              } else {
                                if (param0 == 14) {
                                  break L8;
                                } else {
                                  if (15 == param0) {
                                    break L8;
                                  } else {
                                    stackIn_37_0 = 1;
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackIn_37_0 = 0;
                  break L7;
                }
                return stackIn_37_0 != 0;
              } else {
                break L6;
              }
            }
          }
          if ((this.field_i ^ -1) == -126) {
            L9: {
              L10: {
                if (param0 == 18) {
                  break L10;
                } else {
                  if (-1 == (param0 ^ -1)) {
                    break L10;
                  } else {
                    if (32 == param0) {
                      break L10;
                    } else {
                      if ((param0 ^ -1) == -5) {
                        break L10;
                      } else {
                        if (20 == param0) {
                          break L10;
                        } else {
                          if ((param0 ^ -1) == -14) {
                            break L10;
                          } else {
                            if (14 == param0) {
                              break L10;
                            } else {
                              if ((param0 ^ -1) == -16) {
                                break L10;
                              } else {
                                stackIn_50_0 = 1;
                                break L9;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackIn_50_0 = 0;
              break L9;
            }
            return stackIn_50_0 != 0;
          } else {
            L11: {
              if (param1 < -92) {
                break L11;
              } else {
                oj.a((oj) null, (oc) null, -63, -0.6163141320328959, 93, -0.6993828263849149, false);
                break L11;
              }
            }
            L12: {
              L13: {
                if (13 == this.field_i) {
                  break L13;
                } else {
                  if (14 == this.field_i) {
                    break L13;
                  } else {
                    L14: {
                      if ((this.field_i ^ -1) > -30) {
                        break L14;
                      } else {
                        if (-57 <= (this.field_i ^ -1)) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (this.field_i < 65) {
                        break L15;
                      } else {
                        if (72 >= this.field_i) {
                          break L13;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L16: {
                      if ((this.field_i ^ -1) > -78) {
                        break L16;
                      } else {
                        if (-90 <= (this.field_i ^ -1)) {
                          break L13;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L17: {
                      if (95 > this.field_i) {
                        break L17;
                      } else {
                        if (this.field_i <= 105) {
                          break L13;
                        } else {
                          break L17;
                        }
                      }
                    }
                    L18: {
                      if (this.field_i < 109) {
                        break L18;
                      } else {
                        if (-125 <= (this.field_i ^ -1)) {
                          break L13;
                        } else {
                          break L18;
                        }
                      }
                    }
                    if (-127 == (this.field_i ^ -1)) {
                      break L13;
                    } else {
                      if (127 == this.field_i) {
                        break L13;
                      } else {
                        stackIn_74_0 = 1;
                        break L12;
                      }
                    }
                  }
                }
              }
              stackIn_74_0 = 0;
              break L12;
            }
            return stackIn_74_0 != 0;
          }
        } else {
          L19: {
            L20: {
              if (q.field_g.a((byte) 119)) {
                break L20;
              } else {
                if (vi.field_p == null) {
                  break L20;
                } else {
                  if (this != vi.field_p[pc.field_c]) {
                    break L20;
                  } else {
                    stackIn_16_0 = 1;
                    break L19;
                  }
                }
              }
            }
            stackIn_16_0 = 0;
            break L19;
          }
          return stackIn_16_0 != 0;
        }
    }

    final bd[][] e(int param0) {
        int var2;
        int var3;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if (param0 >= 124) {
            break L0;
          } else {
            this.c((byte) 93);
            break L0;
          }
        }
        var2 = this.field_i;
        if (-2 != (var2 ^ -1)) {
          if ((var2 ^ -1) != -19) {
            if ((var2 ^ -1) != -20) {
              if ((var2 ^ -1) != -4) {
                if (var2 != 8) {
                  if (var2 != 26) {
                    if (var2 != 23) {
                      if ((var2 ^ -1) != -26) {
                        if (var2 != 27) {
                          if (var2 != 28) {
                            if (var2 != 24) {
                              return (bd[][]) null;
                            } else {
                              return wc.field_f;
                            }
                          } else {
                            return of.field_c;
                          }
                        } else {
                          return pa.field_i;
                        }
                      } else {
                        return vd.field_y;
                      }
                    } else {
                      return ck.field_y;
                    }
                  } else {
                    return jh.field_eb;
                  }
                } else {
                  return re.field_D;
                }
              } else {
                return bf.field_f;
              }
            } else {
              return lb.field_a;
            }
          } else {
            return kl.field_b;
          }
        } else {
          return wc.field_f;
        }
    }

    final void e(byte param0) {
        L0: {
          if ((nl.field_d ^ -1) <= -101) {
            break L0;
          } else {
            L1: {
              if (this.field_i == 24) {
                break L1;
              } else {
                if (this.field_i == 4) {
                  break L1;
                } else {
                  if ((this.field_i ^ -1) == -26) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
            }
            wk.field_h = true;
            nl.field_d = 100;
            break L0;
          }
        }
        L2: {
          if (param0 == -49) {
            break L2;
          } else {
            this.a(-93, -36);
            break L2;
          }
        }
        L3: {
          if ((this.field_i ^ -1) == -28) {
            ti.a(1337, (byte) -120, 32);
            break L3;
          } else {
            break L3;
          }
        }
    }

    final static void a(oj param0, oc param1, int param2, double param3, int param4, double param5, boolean param6) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.field_G = 1;
              if (param6) {
                break L1;
              } else {
                oj.g((byte) 82);
                break L1;
              }
            }
            L2: {
              if (param0.field_F == 0) {
                param0.field_G = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                if ((param0.field_I ^ -1) < -1) {
                  break L4;
                } else {
                  L5: {
                    param0.e((byte) -49);
                    param0.c((byte) -94);
                    if (160 > al.field_Q) {
                      al.field_Q = al.field_Q + 50;
                      jh.a(uh.field_i * 3 / 2, (byte) 61, 47, jc.field_c, 3);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var9_int = 0;
                  L6: while (true) {
                    if (3 <= var9_int) {
                      ue.a(25, false);
                      if (-3 == (ha.field_t ^ -1)) {
                        ha.field_t = -1;
                        kd.a(2, 1);
                        break L4;
                      } else {
                        break L3;
                      }
                    } else {
                      mm.field_m[el.field_j] = new oj(param1, 3, rl.field_c);
                      mm.field_m[el.field_j].field_l.a(0.9, 0.9, 1);
                      el.field_j = el.field_j + 1;
                      var9_int++;
                      continue L6;
                    }
                  }
                }
              }
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var9 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var9);

            stackIn_19_1 = new StringBuilder().append("oj.R(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    oj() {
        this.field_I = 10;
        this.field_s = false;
        this.field_x = 50;
        this.field_J = false;
        this.field_L = 0;
        this.field_q = 0;
        this.field_G = 0;
        this.field_v = 50;
        this.field_r = 24;
        this.field_z = 0;
        this.field_E = 48;
        this.field_F = 0;
        this.field_N = false;
        this.field_p = 0;
    }

    oj(oc param0, int param1, int param2) {
        this.field_I = 10;
        this.field_s = false;
        this.field_x = 50;
        this.field_J = false;
        this.field_L = 0;
        this.field_q = 0;
        this.field_G = 0;
        this.field_v = 50;
        this.field_r = 24;
        this.field_z = 0;
        this.field_E = 48;
        this.field_F = 0;
        this.field_N = false;
        this.field_p = 0;
        try {
            this.a(false, 0, 21963, param1, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "oj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_y = new int[]{5, 8, 9, 10, 28};
    }
}
