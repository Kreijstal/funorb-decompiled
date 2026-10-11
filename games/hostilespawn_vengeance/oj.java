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
        if (param1) {
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
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != -28) {
          this.field_x = -15;
        }
        var2 = this.field_i;
        if (1 == var2) {
          return wc.field_f[this.field_w][this.field_z % wc.field_f[this.field_w].length];
        }
        if (var2 == 18) {
          return kl.field_b[this.field_w][this.field_z % kl.field_b[this.field_w].length];
        }
        if (19 == var2) {
          return lb.field_a[this.field_w][this.field_z % lb.field_a[this.field_w].length];
        }
        if (var2 == 3) {
          return bf.field_f[this.field_w][this.field_z % bf.field_f[this.field_w].length];
        }
        if (4 == var2) {
          return ia.field_l[10];
        }
        if (var2 == 8) {
          return re.field_D[this.field_w][this.field_z % re.field_D[this.field_w].length];
        }
        if (26 == var2) {
          return jh.field_eb[this.field_w][this.field_z % jh.field_eb[this.field_w].length];
        }
        if (23 == var2) {
          return ck.field_y[this.field_w][this.field_z % ck.field_y[this.field_w].length];
        }
        if (var2 == 25) {
          return vd.field_y[this.field_w][this.field_z % vd.field_y[this.field_w].length];
        }
        if (var2 == 27) {
          return pa.field_i[this.field_w][this.field_z % pa.field_i[this.field_w].length];
        }
        if (var2 == 28) {
          return of.field_c[this.field_w][this.field_z % of.field_c[this.field_w].length];
        }
        if (var2 == 24) {
          return wc.field_f[this.field_w][this.field_z % wc.field_f[this.field_w].length];
        }
        return null;
    }

    final int f(int param0) {
        int var2 = 84 % ((67 - param0) / 51);
        return (int)(((double)this.field_j.field_g + this.field_l.field_a) * 24.0 - (double)uj.field_p.field_g);
    }

    final boolean d(byte param0) {
        boolean stackIn_13_0 = false;
        if (param0 < 66) {
          this.field_A = 32;
        }
        stackIn_13_0 = (this.field_i == 0) || (this.field_i == 1) || (this.field_i == 18) || (this.field_i == 24) || (this.field_i == 19) || (this.field_i == 28) || (this.field_i == 23) || (this.field_i == 27);
        return stackIn_13_0;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, oc param5) {
        bd[] stackIn_106_0 = null;
        RuntimeException stackIn_531_0 = null;
        StringBuilder stackIn_531_1 = null;
        String stackIn_532_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        bd[] var10 = null;
        bd[] var11 = null;
        int var7_intLifetime1;
        int var8Lifetime1;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
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
          } else {
            if (var7_int == 23) {
              this.field_M = 50;
            } else {
              if (var7_int == 24) {
                this.field_M = 50;
              } else {
                if (var7_int != 25) {
                  if (var7_int == 26) {
                    this.field_M = 50;
                  } else {
                    if (var7_int == 18) {
                      this.field_M = 50;
                    } else {
                      if (var7_int != 19) {
                        if (var7_int != 28) {
                          if (var7_int != 225) {
                            if (var7_int != 27) {
                              if (3 == var7_int) {
                                this.field_M = 25;
                              } else {
                                if (var7_int != 5) {
                                  if (var7_int == 22) {
                                    this.field_M = 0;
                                  } else {
                                    if (var7_int == 125) {
                                      this.field_M = 0;
                                    } else {
                                      this.field_M = 0;
                                    }
                                  }
                                } else {
                                  this.field_M = 0;
                                }
                              }
                            } else {
                              this.field_M = 100;
                            }
                          } else {
                            this.field_M = 50;
                          }
                        } else {
                          this.field_M = 100;
                        }
                      } else {
                        this.field_M = 100;
                      }
                    }
                  }
                } else {
                  this.field_M = 50;
                }
              }
            }
          }
          this.field_z = 0;
          this.field_n = false;
          this.field_q = 0;
          this.field_p = 0;
          this.field_c = (double)param1;
          this.field_I = 10;
          if (!((1 != param3) &&
            (param3 != 23) &&
            (param3 != 24) &&
            (param3 != 25) &&
            (26 != param3))) {
            var7_intLifetime1 = param4;
            if (var7_intLifetime1 == 0) {
              this.field_I = 5;
            } else {
              if (var7_intLifetime1 == 1) {
                this.field_I = 7;
              } else {
                if (2 == var7_intLifetime1) {
                  this.field_I = 8;
                } else {
                  if (var7_intLifetime1 == 7) {
                    this.field_I = 12;
                  } else {
                    if (var7_intLifetime1 == 8) {
                      this.field_I = 15;
                    } else {
                      if (var7_intLifetime1 == 9) {
                        this.field_I = 20;
                      } else {
                        this.field_I = 10;
                      }
                    }
                  }
                }
              }
            }
          }
          if (param3 == 18) {
            if (param4 > 6) {
              if (7 == param4) {
                this.field_I = 8;
              } else {
                if (param4 == 8) {
                  this.field_I = 12;
                } else {
                  if (9 == param4) {
                    this.field_I = 14;
                  }
                }
              }
            } else {
              this.field_I = 6;
            }
          }
          if (!((param3 != 19) &&
            (param3 != 28))) {
            if (7 == param4) {
              this.field_I = 15;
            } else {
              if (8 == param4) {
                this.field_I = 20;
              } else {
                if (param4 == 9) {
                  this.field_I = 25;
                }
              }
            }
          }
          if (param3 == 225) {
            this.field_I = 20;
          }
          if (param3 == 27) {
            this.field_I = 200;
            this.field_x = 200;
          }
          this.field_F = 0;
          if (2 == param3) {
            this.field_I = 0;
          }
          if (3 == param3) {
            this.field_I = 6;
          }
          if (param3 == 5) {
            this.field_I = 20;
          }
          if (param3 == 22) {
            this.field_I = 20;
          }
          if (param3 == 10) {
            this.field_I = 100;
          }
          if (param2 != 21963) {
            return;
          }
          if (param3 == 11) {
            this.field_I = 100;
          }
          if (20 == param3) {
            this.field_I = 400;
          }
          if (this.a((byte) 54)) {
            this.field_I = 50;
          }
          if (param3 == 125) {
            this.field_I = 10;
          }
          if (!param0) {
            stackIn_106_0 = ia.field_l;
          } else {
            stackIn_106_0 = dc.field_a;
          }
          var10 = stackIn_106_0;
          var11 = var10;
          if (this.field_i == 29) {
            this.field_u = var11[32];
          } else {
            if (this.field_i == 31) {
              this.field_u = var11[34];
            } else {
              if (this.field_i == 32) {
                this.field_u = var11[35];
              } else {
                if (this.field_i == 33) {
                  this.field_u = var11[36];
                } else {
                  if (this.field_i == 34) {
                    this.field_u = var11[37];
                  } else {
                    if (this.field_i != 35) {
                      if (this.field_i == 36) {
                        this.field_u = var11[39];
                      } else {
                        if (this.field_i != 37) {
                          if (this.field_i == 38) {
                            this.field_u = var11[41];
                          } else {
                            if (this.field_i != 39) {
                              if (this.field_i != 40) {
                                if (41 != this.field_i) {
                                  if (this.field_i != 42) {
                                    if (this.field_i != 43) {
                                      if (this.field_i == 44) {
                                        this.field_u = var11[47];
                                      } else {
                                        if (45 == this.field_i) {
                                          this.field_u = var11[48];
                                        } else {
                                          if (this.field_i != 46) {
                                            if (this.field_i == 47) {
                                              this.field_u = var11[50];
                                            } else {
                                              if (this.field_i != 48) {
                                                if (49 != this.field_i) {
                                                  if (this.field_i == 50) {
                                                    this.field_u = var11[53];
                                                  } else {
                                                    if (this.field_i != 51) {
                                                      if (this.field_i != 52) {
                                                        if (this.field_i != 53) {
                                                          if (this.field_i == 54) {
                                                            this.field_u = var11[57];
                                                          } else {
                                                            if (this.field_i != 55) {
                                                              if (this.field_i != 56) {
                                                                if (this.field_i != 57) {
                                                                  if (this.field_i == 58) {
                                                                    this.field_u = var11[61];
                                                                  } else {
                                                                    if (this.field_i == 59) {
                                                                      this.field_u = var11[62];
                                                                    } else {
                                                                      if (60 == this.field_i) {
                                                                        this.field_u = var11[63];
                                                                      } else {
                                                                        if (this.field_i != 61) {
                                                                          if (this.field_i == 62) {
                                                                            this.field_u = var11[65];
                                                                          } else {
                                                                            if (this.field_i == 63) {
                                                                              this.field_u = var11[66];
                                                                            } else {
                                                                              if (64 == this.field_i) {
                                                                                this.field_u = var11[67];
                                                                              } else {
                                                                                if (this.field_i != 65) {
                                                                                  if (66 != this.field_i) {
                                                                                    if (this.field_i == 67) {
                                                                                      this.field_u = var11[70];
                                                                                    } else {
                                                                                      if (this.field_i != 68) {
                                                                                        if (this.field_i == 69) {
                                                                                          this.field_u = var11[72];
                                                                                        } else {
                                                                                          if (this.field_i == 70) {
                                                                                            this.field_u = var11[73];
                                                                                          } else {
                                                                                            if (this.field_i == 71) {
                                                                                              this.field_u = var11[74];
                                                                                            } else {
                                                                                              if (this.field_i != 72) {
                                                                                                if (this.field_i == 73) {
                                                                                                  this.field_u = var11[76];
                                                                                                } else {
                                                                                                  if (this.field_i == 74) {
                                                                                                    this.field_u = var11[77];
                                                                                                  } else {
                                                                                                    if (this.field_i == 75) {
                                                                                                      this.field_u = var11[78];
                                                                                                    } else {
                                                                                                      if (this.field_i == 76) {
                                                                                                        this.field_u = var11[79];
                                                                                                      } else {
                                                                                                        if (this.field_i != 77) {
                                                                                                          if (this.field_i == 78) {
                                                                                                            this.field_u = var11[81];
                                                                                                          } else {
                                                                                                            if (this.field_i != 79) {
                                                                                                              if (this.field_i != 80) {
                                                                                                                if (this.field_i != 81) {
                                                                                                                  if (this.field_i != 82) {
                                                                                                                    if (this.field_i != 83) {
                                                                                                                      if (this.field_i == 84) {
                                                                                                                        this.field_u = var11[87];
                                                                                                                      } else {
                                                                                                                        if (this.field_i == 85) {
                                                                                                                          this.field_u = var11[88];
                                                                                                                        } else {
                                                                                                                          if (86 == this.field_i) {
                                                                                                                            this.field_u = var11[89];
                                                                                                                          } else {
                                                                                                                            if (this.field_i != 87) {
                                                                                                                              if (this.field_i != 88) {
                                                                                                                                if (this.field_i != 89) {
                                                                                                                                  if (this.field_i != 90) {
                                                                                                                                    if (this.field_i == 91) {
                                                                                                                                      this.field_u = var11[94];
                                                                                                                                    } else {
                                                                                                                                      if (this.field_i == 92) {
                                                                                                                                        this.field_u = var11[95];
                                                                                                                                      } else {
                                                                                                                                        if (93 != this.field_i) {
                                                                                                                                          if (94 != this.field_i) {
                                                                                                                                            if (this.field_i != 95) {
                                                                                                                                              if (this.field_i != 96) {
                                                                                                                                                if (this.field_i == 97) {
                                                                                                                                                  this.field_u = var11[100];
                                                                                                                                                } else {
                                                                                                                                                  if (this.field_i == 98) {
                                                                                                                                                    this.field_u = var11[101];
                                                                                                                                                  } else {
                                                                                                                                                    if (99 == this.field_i) {
                                                                                                                                                      this.field_u = var11[102];
                                                                                                                                                    } else {
                                                                                                                                                      if (this.field_i != 100) {
                                                                                                                                                        if (this.field_i == 101) {
                                                                                                                                                          this.field_u = var11[104];
                                                                                                                                                        } else {
                                                                                                                                                          if (this.field_i != 102) {
                                                                                                                                                            if (this.field_i != 103) {
                                                                                                                                                              if (this.field_i != 104) {
                                                                                                                                                                if (this.field_i != 105) {
                                                                                                                                                                  if (106 != this.field_i) {
                                                                                                                                                                    if (107 != this.field_i) {
                                                                                                                                                                      if (this.field_i != 108) {
                                                                                                                                                                        if (this.field_i == 109) {
                                                                                                                                                                          this.field_u = var11[112];
                                                                                                                                                                        } else {
                                                                                                                                                                          if (this.field_i == 110) {
                                                                                                                                                                            this.field_u = var11[113];
                                                                                                                                                                          } else {
                                                                                                                                                                            if (this.field_i != 111) {
                                                                                                                                                                              if (112 == this.field_i) {
                                                                                                                                                                                this.field_u = var11[115];
                                                                                                                                                                              } else {
                                                                                                                                                                                if (this.field_i != 113) {
                                                                                                                                                                                  if (this.field_i == 114) {
                                                                                                                                                                                    this.field_u = var11[117];
                                                                                                                                                                                  } else {
                                                                                                                                                                                    if (this.field_i == 115) {
                                                                                                                                                                                      this.field_u = var11[118];
                                                                                                                                                                                    } else {
                                                                                                                                                                                      if (116 == this.field_i) {
                                                                                                                                                                                        this.field_u = var11[119];
                                                                                                                                                                                      } else {
                                                                                                                                                                                        if (this.field_i != 117) {
                                                                                                                                                                                          if (this.field_i != 118) {
                                                                                                                                                                                            if (this.field_i == 119) {
                                                                                                                                                                                              this.field_u = var11[122];
                                                                                                                                                                                            } else {
                                                                                                                                                                                              if (this.field_i != 120) {
                                                                                                                                                                                                if (this.field_i != 121) {
                                                                                                                                                                                                  if (this.field_i != 122) {
                                                                                                                                                                                                    if (this.field_i == 123) {
                                                                                                                                                                                                      this.field_u = var11[126];
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                      if (124 != this.field_i) {
                                                                                                                                                                                                        if (this.field_i != 125) {
                                                                                                                                                                                                          if (this.field_i == 126) {
                                                                                                                                                                                                            this.field_u = var11[129];
                                                                                                                                                                                                          } else {
                                                                                                                                                                                                            if (this.field_i == 127) {
                                                                                                                                                                                                              this.field_u = var11[130];
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                              if (this.field_i == 134) {
                                                                                                                                                                                                                this.field_u = var11[131];
                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                if (135 == this.field_i) {
                                                                                                                                                                                                                  this.field_u = var11[132];
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                  if (136 == this.field_i) {
                                                                                                                                                                                                                    this.field_u = var11[133];
                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                    if (137 != this.field_i) {
                                                                                                                                                                                                                      if (this.field_i != 138) {
                                                                                                                                                                                                                        if (this.field_i == 139) {
                                                                                                                                                                                                                          this.field_u = var11[136];
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                          if (this.field_i == 140) {
                                                                                                                                                                                                                            this.field_u = var11[137];
                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                            if (141 != this.field_i) {
                                                                                                                                                                                                                              if (142 != this.field_i) {
                                                                                                                                                                                                                                if (this.field_i == 143) {
                                                                                                                                                                                                                                  this.field_u = var11[140];
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                  if (this.field_i != 144) {
                                                                                                                                                                                                                                    if (this.field_i == 145) {
                                                                                                                                                                                                                                      this.field_u = var11[142];
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                      if (this.field_i == 146) {
                                                                                                                                                                                                                                        this.field_u = var11[143];
                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                        if (147 == this.field_i) {
                                                                                                                                                                                                                                          this.field_u = var11[144];
                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                          if (this.field_i == 148) {
                                                                                                                                                                                                                                            this.field_u = var11[145];
                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                            if (this.field_i != 149) {
                                                                                                                                                                                                                                              if (150 != this.field_i) {
                                                                                                                                                                                                                                                if (151 == this.field_i) {
                                                                                                                                                                                                                                                  this.field_u = var11[148];
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                  if (this.field_i == 152) {
                                                                                                                                                                                                                                                    this.field_u = var11[149];
                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                    if (this.field_i == 153) {
                                                                                                                                                                                                                                                      this.field_u = var11[150];
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                      if (this.field_i != 154) {
                                                                                                                                                                                                                                                        if (this.field_i == 155) {
                                                                                                                                                                                                                                                          this.field_u = var11[152];
                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                          if (this.field_i == 156) {
                                                                                                                                                                                                                                                            this.field_u = var11[153];
                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                            if (this.field_i == 157) {
                                                                                                                                                                                                                                                              this.field_u = var11[154];
                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                              if (this.field_i != 158) {
                                                                                                                                                                                                                                                                if (this.field_i != 159) {
                                                                                                                                                                                                                                                                  if (this.field_i == 160) {
                                                                                                                                                                                                                                                                    this.field_u = var11[157];
                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                    if (161 != this.field_i) {
                                                                                                                                                                                                                                                                      if (162 != this.field_i) {
                                                                                                                                                                                                                                                                        if (this.field_i == 163) {
                                                                                                                                                                                                                                                                          this.field_u = var11[160];
                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                          if (164 != this.field_i) {
                                                                                                                                                                                                                                                                            if (this.field_i != 165) {
                                                                                                                                                                                                                                                                              if (this.field_i == 166) {
                                                                                                                                                                                                                                                                                this.field_u = var11[163];
                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                if (167 == this.field_i) {
                                                                                                                                                                                                                                                                                  this.field_u = var11[164];
                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                  if (this.field_i == 168) {
                                                                                                                                                                                                                                                                                    this.field_u = var11[165];
                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                    if (this.field_i == 169) {
                                                                                                                                                                                                                                                                                      this.field_u = var11[166];
                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                      if (this.field_i != 170) {
                                                                                                                                                                                                                                                                                        if (171 == this.field_i) {
                                                                                                                                                                                                                                                                                          this.field_u = var11[168];
                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                          if (this.field_i != 172) {
                                                                                                                                                                                                                                                                                            if (this.field_i != 173) {
                                                                                                                                                                                                                                                                                              if (this.field_i != 174) {
                                                                                                                                                                                                                                                                                                if (175 == this.field_i) {
                                                                                                                                                                                                                                                                                                  this.field_u = var11[172];
                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                  if (this.field_i == 176) {
                                                                                                                                                                                                                                                                                                    this.field_u = var11[173];
                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                    if (this.field_i == 177) {
                                                                                                                                                                                                                                                                                                      this.field_u = var11[174];
                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                      if (this.field_i == 178) {
                                                                                                                                                                                                                                                                                                        this.field_u = var11[175];
                                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                                        if (this.field_i == 179) {
                                                                                                                                                                                                                                                                                                          this.field_u = var11[176];
                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                          if (this.field_i != 180) {
                                                                                                                                                                                                                                                                                                            if (181 == this.field_i) {
                                                                                                                                                                                                                                                                                                              this.field_u = var11[178];
                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                              if (182 != this.field_i) {
                                                                                                                                                                                                                                                                                                                if (this.field_i != 183) {
                                                                                                                                                                                                                                                                                                                  if (184 == this.field_i) {
                                                                                                                                                                                                                                                                                                                    this.field_u = var11[181];
                                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                                    if (this.field_i == 185) {
                                                                                                                                                                                                                                                                                                                      this.field_u = var11[182];
                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                      if (this.field_i != 186) {
                                                                                                                                                                                                                                                                                                                        if (this.field_i != 187) {
                                                                                                                                                                                                                                                                                                                          if (188 == this.field_i) {
                                                                                                                                                                                                                                                                                                                            this.field_u = var11[185];
                                                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                                                            if (this.field_i != 189) {
                                                                                                                                                                                                                                                                                                                              if (190 == this.field_i) {
                                                                                                                                                                                                                                                                                                                                this.field_u = var11[187];
                                                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                                                if (this.field_i == 191) {
                                                                                                                                                                                                                                                                                                                                  this.field_u = var11[188];
                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                  if (this.field_i == 192) {
                                                                                                                                                                                                                                                                                                                                    this.field_u = var11[189];
                                                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                                                    if (this.field_i != 193) {
                                                                                                                                                                                                                                                                                                                                      if (this.field_i == 194) {
                                                                                                                                                                                                                                                                                                                                        this.field_u = var11[191];
                                                                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                                                                        if (195 != this.field_i) {
                                                                                                                                                                                                                                                                                                                                          if (196 != this.field_i) {
                                                                                                                                                                                                                                                                                                                                            if (197 != this.field_i) {
                                                                                                                                                                                                                                                                                                                                              if (198 != this.field_i) {
                                                                                                                                                                                                                                                                                                                                                if (this.field_i == 199) {
                                                                                                                                                                                                                                                                                                                                                  this.field_u = var11[196];
                                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                                  if (this.field_i == 200) {
                                                                                                                                                                                                                                                                                                                                                    this.field_u = var11[197];
                                                                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                                                                    if (this.field_i != 201) {
                                                                                                                                                                                                                                                                                                                                                      if (this.field_i == 202) {
                                                                                                                                                                                                                                                                                                                                                        this.field_u = var11[199];
                                                                                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                                                                                        if (this.field_i == 203) {
                                                                                                                                                                                                                                                                                                                                                          this.field_u = var11[200];
                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                          if (204 == this.field_i) {
                                                                                                                                                                                                                                                                                                                                                            this.field_u = var11[201];
                                                                                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                                                                                            if (205 != this.field_i) {
                                                                                                                                                                                                                                                                                                                                                              if (this.field_i == 206) {
                                                                                                                                                                                                                                                                                                                                                                this.field_u = var11[203];
                                                                                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                                                                                if (207 == this.field_i) {
                                                                                                                                                                                                                                                                                                                                                                  this.field_u = var11[204];
                                                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                                                  if (this.field_i == 208) {
                                                                                                                                                                                                                                                                                                                                                                    this.field_u = var11[205];
                                                                                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                                                                                    if (this.field_i == 209) {
                                                                                                                                                                                                                                                                                                                                                                      this.field_u = var11[206];
                                                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                                                      if (210 != this.field_i) {
                                                                                                                                                                                                                                                                                                                                                                        if (this.field_i == 211) {
                                                                                                                                                                                                                                                                                                                                                                          this.field_u = var11[208];
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                          if (this.field_i == 212) {
                                                                                                                                                                                                                                                                                                                                                                            this.field_u = var11[209];
                                                                                                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                                                                                                            if (this.field_i == 213) {
                                                                                                                                                                                                                                                                                                                                                                              this.field_u = var11[210];
                                                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                                                              if (this.field_i == 214) {
                                                                                                                                                                                                                                                                                                                                                                                this.field_u = var11[211];
                                                                                                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                                                                                                if (this.field_i != 215) {
                                                                                                                                                                                                                                                                                                                                                                                  if (216 == this.field_i) {
                                                                                                                                                                                                                                                                                                                                                                                    this.field_u = var11[213];
                                                                                                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                                                                                                    if (this.field_i == 217) {
                                                                                                                                                                                                                                                                                                                                                                                      this.field_u = var11[214];
                                                                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                                                                      if (this.field_i == 218) {
                                                                                                                                                                                                                                                                                                                                                                                        this.field_u = var11[215];
                                                                                                                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                                                                                                                        if (this.field_i != 219) {
                                                                                                                                                                                                                                                                                                                                                                                          if (this.field_i != 220) {
                                                                                                                                                                                                                                                                                                                                                                                            if (221 == this.field_i) {
                                                                                                                                                                                                                                                                                                                                                                                              this.field_u = var11[218];
                                                                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                                                                              if (this.field_i != 222) {
                                                                                                                                                                                                                                                                                                                                                                                                if (223 != this.field_i) {
                                                                                                                                                                                                                                                                                                                                                                                                  if (this.field_i == 224) {
                                                                                                                                                                                                                                                                                                                                                                                                    this.field_u = var11[221];
                                                                                                                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                                                                                  this.field_u = var11[220];
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                                                                                                                this.field_u = var11[219];
                                                                                                                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                                                                                                                            this.field_u = var11[217];
                                                                                                                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                                          this.field_u = var11[216];
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                                                                  this.field_u = var11[212];
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                                                                                                        this.field_u = var11[207];
                                                                                                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                                              this.field_u = var11[202];
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                                      this.field_u = var11[198];
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                                                                this.field_u = var11[195];
                                                                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                              this.field_u = var11[194];
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                                                                            this.field_u = var11[193];
                                                                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                          this.field_u = var11[192];
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                      this.field_u = var11[190];
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                              this.field_u = var11[186];
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                          this.field_u = var11[184];
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                                                        this.field_u = var11[183];
                                                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                  this.field_u = var11[180];
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                                this.field_u = var11[179];
                                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                                            this.field_u = var11[177];
                                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                this.field_u = var11[171];
                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                              this.field_u = var11[170];
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                            this.field_u = var11[169];
                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                        this.field_u = var11[167];
                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                              this.field_u = var11[162];
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                            this.field_u = var11[161];
                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                        this.field_u = var11[159];
                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                      this.field_u = var11[158];
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                  this.field_u = var11[156];
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                this.field_u = var11[155];
                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                        this.field_u = var11[151];
                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                this.field_u = var11[147];
                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                              this.field_u = var11[146];
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                    this.field_u = var11[141];
                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                this.field_u = var11[139];
                                                                                                                                                                                                                              }
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                              this.field_u = var11[138];
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                          }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                        this.field_u = var11[135];
                                                                                                                                                                                                                      }
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                      this.field_u = var11[134];
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                  }
                                                                                                                                                                                                                }
                                                                                                                                                                                                              }
                                                                                                                                                                                                            }
                                                                                                                                                                                                          }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                          this.field_u = var11[128];
                                                                                                                                                                                                        }
                                                                                                                                                                                                      } else {
                                                                                                                                                                                                        this.field_u = var11[127];
                                                                                                                                                                                                      }
                                                                                                                                                                                                    }
                                                                                                                                                                                                  } else {
                                                                                                                                                                                                    this.field_u = var11[125];
                                                                                                                                                                                                  }
                                                                                                                                                                                                } else {
                                                                                                                                                                                                  this.field_u = var11[124];
                                                                                                                                                                                                }
                                                                                                                                                                                              } else {
                                                                                                                                                                                                this.field_u = var11[123];
                                                                                                                                                                                              }
                                                                                                                                                                                            }
                                                                                                                                                                                          } else {
                                                                                                                                                                                            this.field_u = var11[121];
                                                                                                                                                                                          }
                                                                                                                                                                                        } else {
                                                                                                                                                                                          this.field_u = var11[120];
                                                                                                                                                                                        }
                                                                                                                                                                                      }
                                                                                                                                                                                    }
                                                                                                                                                                                  }
                                                                                                                                                                                } else {
                                                                                                                                                                                  this.field_u = var11[116];
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            } else {
                                                                                                                                                                              this.field_u = var11[114];
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                      } else {
                                                                                                                                                                        this.field_u = var11[111];
                                                                                                                                                                      }
                                                                                                                                                                    } else {
                                                                                                                                                                      this.field_u = var11[110];
                                                                                                                                                                    }
                                                                                                                                                                  } else {
                                                                                                                                                                    this.field_u = var11[109];
                                                                                                                                                                  }
                                                                                                                                                                } else {
                                                                                                                                                                  this.field_u = var11[108];
                                                                                                                                                                }
                                                                                                                                                              } else {
                                                                                                                                                                this.field_u = var11[107];
                                                                                                                                                              }
                                                                                                                                                            } else {
                                                                                                                                                              this.field_u = var11[106];
                                                                                                                                                            }
                                                                                                                                                          } else {
                                                                                                                                                            this.field_u = var11[105];
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                      } else {
                                                                                                                                                        this.field_u = var11[103];
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              } else {
                                                                                                                                                this.field_u = var11[99];
                                                                                                                                              }
                                                                                                                                            } else {
                                                                                                                                              this.field_u = var11[98];
                                                                                                                                            }
                                                                                                                                          } else {
                                                                                                                                            this.field_u = var11[97];
                                                                                                                                          }
                                                                                                                                        } else {
                                                                                                                                          this.field_u = var11[96];
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    this.field_u = var11[93];
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  this.field_u = var11[92];
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                this.field_u = var11[91];
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              this.field_u = var11[90];
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      this.field_u = var11[86];
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    this.field_u = var11[85];
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  this.field_u = var11[84];
                                                                                                                }
                                                                                                              } else {
                                                                                                                this.field_u = var11[83];
                                                                                                              }
                                                                                                            } else {
                                                                                                              this.field_u = var11[82];
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          this.field_u = var11[80];
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                this.field_u = var11[75];
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        this.field_u = var11[71];
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    this.field_u = var11[69];
                                                                                  }
                                                                                } else {
                                                                                  this.field_u = var11[68];
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          this.field_u = var11[64];
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  this.field_u = var11[60];
                                                                }
                                                              } else {
                                                                this.field_u = var11[59];
                                                              }
                                                            } else {
                                                              this.field_u = var11[58];
                                                            }
                                                          }
                                                        } else {
                                                          this.field_u = var11[56];
                                                        }
                                                      } else {
                                                        this.field_u = var11[55];
                                                      }
                                                    } else {
                                                      this.field_u = var11[54];
                                                    }
                                                  }
                                                } else {
                                                  this.field_u = var11[52];
                                                }
                                              } else {
                                                this.field_u = var11[51];
                                              }
                                            }
                                          } else {
                                            this.field_u = var11[49];
                                          }
                                        }
                                      }
                                    } else {
                                      this.field_u = var11[46];
                                    }
                                  } else {
                                    this.field_u = var11[45];
                                  }
                                } else {
                                  this.field_u = var11[44];
                                }
                              } else {
                                this.field_u = var11[43];
                              }
                            } else {
                              this.field_u = var11[42];
                            }
                          }
                        } else {
                          this.field_u = var11[40];
                        }
                      }
                    } else {
                      this.field_u = var10[38];
                    }
                  }
                }
              }
            }
          }
          if (this.field_i == 128) {
            this.field_H = im.field_a;
            this.field_u = ak.field_a;
          } else {
            if (129 == this.field_i) {
              this.field_H = im.field_a;
              this.field_u = an.field_d;
            } else {
              if (this.field_i == 130) {
                this.field_u = ce.field_a;
                this.field_H = jd.field_o;
              } else {
                if (this.field_i == 131) {
                  this.field_H = jd.field_o;
                  this.field_u = r.field_c;
                } else {
                  if (this.field_i == 132) {
                    this.field_u = qa.field_c;
                    this.field_H = th.field_Hb;
                  } else {
                    if (133 != this.field_i) {
                      if (this.field_i != 30) {
                        if ((this.field_i >= 233) &&
                          (this.field_i < 339)) {
                          if (param0) {
                            this.field_u = vb.field_Kb[-233 + this.field_i];
                          } else {
                            this.field_u = qg.field_g[-233 + this.field_i];
                          }
                        }
                      } else {
                        this.field_H = c.field_f;
                      }
                    } else {
                      this.field_H = th.field_Hb;
                      this.field_u = gi.field_d;
                    }
                  }
                }
              }
            }
          }
          this.field_x = this.field_I;
          this.field_b = ni.a(this.field_i, (byte) -64);
          if (this.field_i != 19) {
            if (this.field_i == 28) {
              this.field_E = 240;
              this.field_r = 216;
            }
          } else {
            this.field_E = (int)(4.0 * (Math.random() * 24.0)) + 168;
            if (om.field_b) {
              this.field_E = this.field_E + 48;
            }
          }
          this.field_o = 2;
          this.field_A = 1;
          var8 = this.field_i;
          if (var8 == 18) {
            this.field_A = this.field_A * 2;
            this.field_o = this.field_o * 3;
          } else {
            if (var8 == 24) {
              this.field_o = this.field_o * 2;
              this.field_A = this.field_A * 2;
            } else {
              if (27 == var8) {
                this.field_A = 2;
                this.field_o = 2;
              }
            }
          }
          if (om.field_b) {
            var8Lifetime1 = this.field_i;
            if (var8Lifetime1 != 19) {
              if (!((var8Lifetime1 != 225) &&
                (var8Lifetime1 != 1) &&
                (var8Lifetime1 != 18))) {
                this.field_o = this.field_o * 2;
              }
            } else {
              this.field_E = this.field_E + 48;
            }
            this.field_M = this.field_M * 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_531_0 = var7;
          stackIn_531_1 = new StringBuilder().append("oj.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_532_2 = "null";
          } else {
            stackIn_532_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_531_0), ((StringBuilder) (Object) stackIn_531_1).append(stackIn_532_2).append(')').toString());
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
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -27757) {
            this.g(-55);
          }
          if (this.field_b) {
            var4 = this.field_l.a(this.field_j, this.field_c, 1, param1, param2);
          } else {
            var4 = this.field_l.a(param1, this.field_c, this.field_j, false, param2);
          }
          this.b((byte) 117);
          stackIn_6_0 = var4;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("oj.W(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void c(byte param0) {
        int var2 = vd.a(18475, this.field_i);
        if (var2 >= 0) {
          this.field_e = 250;
          this.field_b = false;
          this.field_i = var2;
          if (var2 == 17) {
            this.field_c = this.field_c + 128.0;
            if (this.field_c >= 256.0) {
              this.field_c = this.field_c - 256.0;
            }
          }
          this.field_w = 0;
          int var3 = -101 % ((-26 - param0) / 52);
          return;
        }
        throw new RuntimeException("Cannot splat unit type " + this.field_i);
    }

    final int f(byte param0) {
        if (param0 <= 106) {
          this.field_s = false;
        }
        return (int)(24.0 * ((double)this.field_j.field_e + this.field_l.field_f) - (double)(uj.field_p.field_e + 24));
    }

    final boolean[] a(id param0, int param1, int param2) {
        double var4_double = 0.0;
        RuntimeException var4 = null;
        boolean[] var6 = null;
        boolean[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_double = this.field_c;
          if (param1 != 128) {
            oj.g((byte) -21);
          }
          if (this.field_J) {
            if (var4_double >= 128.0) {
              var4_double = var4_double - 128.0;
            } else {
              var4_double = var4_double + 128.0;
            }
          }
          var6 = this.field_l.a(this.field_j, var4_double, 1, param2, param0);
          this.b((byte) 117);
          stackIn_8_0 = var6;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("oj.S(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1) {
        boolean stackIn_9_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_23_0 = false;
        boolean stackIn_37_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_74_0 = false;
        if (this.field_N &&
          1 == bm.field_c &&
          rl.field_c == 1) {
          stackIn_9_0 = (param0 == 31) || (35 == param0);
          return stackIn_9_0;
        }
        if (this.field_i == 231) {
          stackIn_16_0 = (!q.field_g.a((byte) 119)) && (vi.field_p != null) && (this == vi.field_p[pc.field_c]);
          return stackIn_16_0;
        }
        if (this.field_i == 8 &&
          vi.field_p != null) {
          stackIn_23_0 = (!q.field_g.a((byte) -117)) && (0 >= pc.field_c);
          return stackIn_23_0;
        }
        if (this.field_i >= 128 &&
          this.field_i <= 133) {
          stackIn_37_0 = (param0 != 18) && (param0 != 0) && (param0 != 32) && (param0 != 4) && (param0 != 20) && (param0 != 13) && (param0 != 14) && (15 != param0);
          return stackIn_37_0;
        }
        if (this.field_i == 125) {
          stackIn_50_0 = (param0 != 18) && (param0 != 0) && (32 != param0) && (param0 != 4) && (20 != param0) && (param0 != 13) && (14 != param0) && (param0 != 15);
          return stackIn_50_0;
        }
        if (param1 >= -92) {
          oj.a((oj) null, (oc) null, -63, -0.6163141320328959, 93, -0.6993828263849149, false);
        }
        boolean decompiledFrameRemainder0 = true;
        if (13 != this.field_i &&
          14 != this.field_i && ((!(this.field_i >= 29) ||
          !(this.field_i <= 56)) &&
          (!(this.field_i >= 65) ||
          !(72 >= this.field_i)) &&
          (!(this.field_i >= 77) ||
          !(this.field_i <= 89)) &&
          (!(95 <= this.field_i) ||
          !(this.field_i <= 105)) &&
          (!(this.field_i >= 109) ||
          !(this.field_i <= 124))) && (this.field_i != 126 &&
          127 != this.field_i)) {
          stackIn_74_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_74_0 = false;
        }
        return stackIn_74_0;
    }

    final bd[][] e(int param0) {
        int var2;
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (param0 < 124) {
          this.c((byte) 93);
        }
        var2 = this.field_i;
        if (var2 == 1) {
          return wc.field_f;
        }
        if (var2 == 18) {
          return kl.field_b;
        }
        if (var2 == 19) {
          return lb.field_a;
        }
        if (var2 == 3) {
          return bf.field_f;
        }
        if (var2 == 8) {
          return re.field_D;
        }
        if (var2 == 26) {
          return jh.field_eb;
        }
        if (var2 == 23) {
          return ck.field_y;
        }
        if (var2 == 25) {
          return vd.field_y;
        }
        if (var2 == 27) {
          return pa.field_i;
        }
        if (var2 == 28) {
          return of.field_c;
        }
        if (var2 != 24) {
          return (bd[][]) null;
        }
        return wc.field_f;
    }

    final void e(byte param0) {
        if (nl.field_d < 100 && (this.field_i == 24 ||
          this.field_i == 4 ||
          this.field_i == 25)) {
          wk.field_h = true;
          nl.field_d = 100;
        }
        if (param0 != -49) {
          this.a(-93, -36);
        }
        if (this.field_i == 27) {
          ti.a(1337, (byte) -120, 32);
        }
    }

    final static void a(oj param0, oc param1, int param2, double param3, int param4, double param5, boolean param6) {
        int var9_int = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          param0.field_G = 1;
          if (!param6) {
            oj.g((byte) 82);
          }
          if (param0.field_F == 0) {
            param0.field_G = 0;
          }
          if (param0.field_I <= 0) {
            param0.e((byte) -49);
            param0.c((byte) -94);
            if (160 > al.field_Q) {
              al.field_Q = al.field_Q + 50;
              jh.a(uh.field_i * 3 / 2, (byte) 61, 47, jc.field_c, 3);
            }
            for (var9_int = 0; 3 > var9_int; var9_int++) {
              mm.field_m[el.field_j] = new oj(param1, 3, rl.field_c);
              mm.field_m[el.field_j].field_l.a(0.9, 0.9, 1);
              el.field_j = el.field_j + 1;
            }
            ue.a(25, false);
            if (ha.field_t != 2) {
              return;
            }
            ha.field_t = -1;
            kd.a(2, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_19_0 = var9;
          stackIn_19_1 = new StringBuilder().append("oj.R(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
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
