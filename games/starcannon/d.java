/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    int field_a;
    int field_q;
    static String field_c;
    private int field_k;
    private int field_e;
    private int field_g;
    static String field_m;
    int field_i;
    private int field_f;
    int field_o;
    static hd field_l;
    private int field_j;
    int field_p;
    int field_h;
    static ia field_b;
    static String field_n;
    int field_d;

    final void b(int param0, int param1) {
        int var3 = this.field_d - -(param0 / 16);
        ki.c(var3, this.field_q, 5, 0, param1);
        ki.c(var3, this.field_q, 4, 0, 128);
        ki.c(var3, this.field_q, 3, 0, 128);
    }

    d(int param0, int param1, int param2, int param3) {
        this(param0 + -3, param1 - 3, 0, 0, 0, param3, param2, 0);
        this.field_j = 0;
    }

    final d a(byte param0) {
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        boolean discarded$10 = false;
        boolean discarded$11 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        Object var9 = null;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        Object var13 = null;
        L0: {
          var7 = StarCannon.field_A;
          var2 = 61 % ((param0 - 15) / 43);
          this.field_f = sh.b(43, 14);
          var6 = this.field_h;
          if (1 == var6) {
            break L0;
          } else {
            if ((var6 ^ -1) != -3) {
              if (var6 == 3) {
                break L0;
              } else {
                if (-1 == (var6 ^ -1)) {
                  L1: {
                    this.field_k = this.field_k + (Math.abs(this.field_j) >> 579500132);
                    this.field_g = this.field_g + (Math.abs(this.field_e) >> -1666066268);
                    if ((this.field_g ^ -1) >= -33) {
                      break L1;
                    } else {
                      L2: {
                        if (0 > this.field_e) {
                          this.field_q = this.field_q - (this.field_g >> -159360155);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        if (-1 <= (this.field_e ^ -1)) {
                          break L3;
                        } else {
                          this.field_q = this.field_q + (this.field_g >> -1988893755);
                          break L3;
                        }
                      }
                      this.field_g = this.field_g & 31;
                      break L1;
                    }
                  }
                  L4: {
                    this.field_p = this.field_p - 4;
                    if (this.field_k <= 32) {
                      break L4;
                    } else {
                      L5: {
                        if (-1 >= (this.field_j ^ -1)) {
                          break L5;
                        } else {
                          this.field_d = this.field_d - (this.field_k >> 196822597);
                          break L5;
                        }
                      }
                      L6: {
                        if (this.field_j <= 0) {
                          break L6;
                        } else {
                          this.field_d = this.field_d + (this.field_k >> 158820453);
                          break L6;
                        }
                      }
                      this.field_k = this.field_k & 31;
                      break L4;
                    }
                  }
                  if (this.field_p <= 0) {
                    return null;
                  } else {
                    return (d) (this);
                  }
                } else {
                  if (var6 == 4) {
                    this.field_q = this.field_q + 1;
                    if ((this.field_q ^ -1) < -631) {
                      return null;
                    } else {
                      return (d) (this);
                    }
                  } else {
                    L7: {
                      L8: {
                        if (5 == var6) {
                          break L8;
                        } else {
                          if (6 == var6) {
                            break L8;
                          } else {
                            L9: {
                              if ((var6 ^ -1) != -8) {
                                if ((var6 ^ -1) == -9) {
                                  break L9;
                                } else {
                                  if (-10 == (var6 ^ -1)) {
                                    break L9;
                                  } else {
                                    if (var6 != 10) {
                                      if (-12 != (var6 ^ -1)) {
                                        if (var6 != 12) {
                                          if (var6 == 14) {
                                            this.field_p = this.field_p + 1;
                                            this.field_d = this.field_a + tj.field_w;
                                            if ((this.field_p ^ -1) >= -4) {
                                              return (d) (this);
                                            } else {
                                              return null;
                                            }
                                          } else {
                                            if (13 == var6) {
                                              this.field_p = this.field_p + 1;
                                              if (this.field_p <= 8) {
                                                return (d) (this);
                                              } else {
                                                return null;
                                              }
                                            } else {
                                              return (d) (this);
                                            }
                                          }
                                        } else {
                                          this.field_d = tj.field_w + this.field_a;
                                          this.field_g = this.field_g + Math.abs(this.field_e);
                                          L10: while (true) {
                                            if ((this.field_g ^ -1) >= -33) {
                                              L11: {
                                                if ((this.field_i ^ -1) >= -2) {
                                                  break L11;
                                                } else {
                                                  L12: {
                                                    this.field_a = this.field_a - 1;
                                                    this.field_d = this.field_d - 1;
                                                    if (2 < this.field_i) {
                                                      this.field_d = this.field_d - 1;
                                                      this.field_a = this.field_a - 1;
                                                      var9 = this;
                                                      discarded$6 = v.a(new d((d) (var9), 14), -4001);
                                                      this.field_d = this.field_d + 1;
                                                      this.field_a = this.field_a + 1;
                                                      break L12;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                  var10 = this;
                                                  discarded$7 = v.a(new d((d) (var10), 14), -4001);
                                                  this.field_d = this.field_d + 1;
                                                  this.field_a = this.field_a + 1;
                                                  break L11;
                                                }
                                              }
                                              L13: {
                                                var11 = this;
                                                discarded$8 = v.a(new d((d) (var11), 14), -4001);
                                                if ((this.field_i ^ -1) < -2) {
                                                  L14: {
                                                    this.field_a = this.field_a + 1;
                                                    this.field_d = this.field_d + 1;
                                                    if (-3 <= (this.field_i ^ -1)) {
                                                      break L14;
                                                    } else {
                                                      this.field_a = this.field_a + 1;
                                                      this.field_d = this.field_d + 1;
                                                      var12 = this;
                                                      discarded$9 = v.a(new d((d) (var12), 14), -4001);
                                                      this.field_a = this.field_a - 1;
                                                      this.field_d = this.field_d - 1;
                                                      break L14;
                                                    }
                                                  }
                                                  var13 = this;
                                                  discarded$10 = v.a(new d((d) (var13), 14), -4001);
                                                  this.field_d = this.field_d - 1;
                                                  this.field_a = this.field_a - 1;
                                                  break L13;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                              if ((this.field_d ^ -1) <= 15) {
                                                if ((this.field_d ^ -1) >= -657) {
                                                  if (-16 <= this.field_q) {
                                                    if (496 >= this.field_q) {
                                                      return (d) (this);
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
                                            } else {
                                              L15: {
                                                if (0 > this.field_e) {
                                                  this.field_q = this.field_q - (this.field_g >> 793449733);
                                                  break L15;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                              L16: {
                                                if ((this.field_e ^ -1) >= -1) {
                                                  break L16;
                                                } else {
                                                  this.field_q = this.field_q + (this.field_g >> -751467419);
                                                  break L16;
                                                }
                                              }
                                              this.field_g = this.field_g & 31;
                                              continue L10;
                                            }
                                          }
                                        }
                                      } else {
                                        L17: {
                                          var8 = this;
                                          discarded$11 = v.a(new d((d) (var8), 13), -4001);
                                          var4 = -16;
                                          var3 = -this.field_d + this.field_a;
                                          var5 = (int)Math.sqrt((double)(var3 * var3 - -(var4 * var4)));
                                          if (var5 <= 16) {
                                            break L17;
                                          } else {
                                            this.field_j = this.field_j + 96 * var3 / var5;
                                            this.field_e = this.field_e + 32 * var4 / var5;
                                            break L17;
                                          }
                                        }
                                        L18: {
                                          var5 = (int)Math.sqrt((double)(this.field_j * this.field_j + this.field_e * this.field_e));
                                          if (0 < var5) {
                                            this.field_j = 512 * this.field_j / var5;
                                            this.field_e = this.field_e * 512 / var5;
                                            break L18;
                                          } else {
                                            break L18;
                                          }
                                        }
                                        L19: {
                                          this.field_k = this.field_k + Math.abs(this.field_j);
                                          this.field_g = this.field_g + Math.abs(this.field_e);
                                          if (-33 <= (this.field_k ^ -1)) {
                                            break L19;
                                          } else {
                                            L20: {
                                              if (-1 < (this.field_j ^ -1)) {
                                                this.field_d = this.field_d - (this.field_k >> 1425992005);
                                                break L20;
                                              } else {
                                                break L20;
                                              }
                                            }
                                            L21: {
                                              if (this.field_j > 0) {
                                                this.field_d = this.field_d + (this.field_k >> 826710693);
                                                break L21;
                                              } else {
                                                break L21;
                                              }
                                            }
                                            this.field_k = this.field_k & 31;
                                            break L19;
                                          }
                                        }
                                        L22: {
                                          if ((this.field_g ^ -1) >= -33) {
                                            break L22;
                                          } else {
                                            L23: {
                                              if (this.field_e < 0) {
                                                this.field_q = this.field_q - (this.field_g >> 937059813);
                                                break L23;
                                              } else {
                                                break L23;
                                              }
                                            }
                                            L24: {
                                              if (0 < this.field_e) {
                                                this.field_q = this.field_q + (this.field_g >> -1293129371);
                                                break L24;
                                              } else {
                                                break L24;
                                              }
                                            }
                                            this.field_g = this.field_g & 31;
                                            break L22;
                                          }
                                        }
                                        if (this.field_q >= -16) {
                                          if ((this.field_q ^ -1) < -497) {
                                            return null;
                                          } else {
                                            return (d) (this);
                                          }
                                        } else {
                                          return null;
                                        }
                                      }
                                    } else {
                                      L25: {
                                        this.field_k = this.field_k + Math.abs(this.field_j);
                                        this.field_g = this.field_g + Math.abs(this.field_e);
                                        if ((this.field_k ^ -1) < -33) {
                                          L26: {
                                            if (0 <= this.field_j) {
                                              break L26;
                                            } else {
                                              this.field_d = this.field_d - (this.field_k >> 1027729125);
                                              break L26;
                                            }
                                          }
                                          L27: {
                                            if (0 < this.field_j) {
                                              this.field_d = this.field_d + (this.field_k >> 921063205);
                                              break L27;
                                            } else {
                                              break L27;
                                            }
                                          }
                                          this.field_k = this.field_k & 31;
                                          break L25;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      L28: {
                                        if (32 < this.field_g) {
                                          L29: {
                                            if (0 > this.field_e) {
                                              this.field_q = this.field_q - (this.field_g >> 1433191429);
                                              break L29;
                                            } else {
                                              break L29;
                                            }
                                          }
                                          L30: {
                                            if ((this.field_e ^ -1) >= -1) {
                                              break L30;
                                            } else {
                                              this.field_q = this.field_q + (this.field_g >> -1547283579);
                                              break L30;
                                            }
                                          }
                                          this.field_g = 31 & this.field_g;
                                          break L28;
                                        } else {
                                          break L28;
                                        }
                                      }
                                      if (this.field_d >= -16) {
                                        if ((this.field_d ^ -1) >= -657) {
                                          if ((this.field_q ^ -1) <= 15) {
                                            if (this.field_q > 496) {
                                              return null;
                                            } else {
                                              return (d) (this);
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
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                            if (-25 <= (this.field_o ^ -1)) {
                              this.field_p = this.field_p + 32;
                              if (this.field_i < this.field_p) {
                                this.field_o = this.field_o + 1;
                                this.field_p = this.field_p - this.field_i;
                                break L7;
                              } else {
                                return (d) (this);
                              }
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                      if ((this.field_o ^ -1) >= -15) {
                        this.field_p = this.field_p + 32;
                        if (this.field_i < this.field_p) {
                          this.field_o = this.field_o + 1;
                          this.field_p = this.field_p - this.field_i;
                          break L7;
                        } else {
                          return (d) (this);
                        }
                      } else {
                        return null;
                      }
                    }
                    return (d) (this);
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        L31: {
          this.field_k = this.field_k + Math.abs(this.field_j);
          this.field_g = this.field_g + Math.abs(this.field_e);
          if (-33 <= (this.field_k ^ -1)) {
            break L31;
          } else {
            L32: {
              if (0 > this.field_j) {
                this.field_d = this.field_d - (this.field_k >> 1623037093);
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if ((this.field_j ^ -1) >= -1) {
                break L33;
              } else {
                this.field_d = this.field_d + (this.field_k >> -1415621915);
                break L33;
              }
            }
            this.field_k = this.field_k & 31;
            break L31;
          }
        }
        L34: {
          if (-33 <= (this.field_g ^ -1)) {
            break L34;
          } else {
            L35: {
              if (-1 >= (this.field_e ^ -1)) {
                break L35;
              } else {
                this.field_q = this.field_q - (this.field_g >> 1265379269);
                break L35;
              }
            }
            L36: {
              if (0 < this.field_e) {
                this.field_q = this.field_q + (this.field_g >> 988392357);
                break L36;
              } else {
                break L36;
              }
            }
            this.field_g = this.field_g & 31;
            break L34;
          }
        }
        if (-16 <= this.field_d) {
          if (656 >= this.field_d) {
            if ((this.field_q ^ -1) <= 15) {
              if ((this.field_q ^ -1) < -497) {
                return null;
              } else {
                return (d) (this);
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

    d(int param0, int param1, int param2, int param3, int param4, int param5) {
        this(param0, param1, param2, param3, param4, param5, 1, -1 == (param5 ^ -1) ? 256 : 0);
        Object stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        int stackIn_1_4 = 0;
        int stackIn_1_5 = 0;
        int stackIn_1_6 = 0;
        int stackIn_1_7 = 0;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        int stackIn_2_4 = 0;
        int stackIn_2_5 = 0;
        int stackIn_2_6 = 0;
        int stackIn_2_7 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        int stackIn_3_5 = 0;
        int stackIn_3_6 = 0;
        int stackIn_3_7 = 0;
        int stackIn_3_8 = 0;
        Object stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        int stackOut_0_4 = 0;
        int stackOut_0_5 = 0;
        int stackOut_0_6 = 0;
        int stackOut_0_7 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        int stackOut_2_5 = 0;
        int stackOut_2_6 = 0;
        int stackOut_2_7 = 0;
        int stackOut_2_8 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        int stackOut_1_5 = 0;
        int stackOut_1_6 = 0;
        int stackOut_1_7 = 0;
        int stackOut_1_8 = 0;
        L0: {
          stackOut_0_0 = this;
          stackOut_0_1 = param0;
          stackOut_0_2 = param1;
          stackOut_0_3 = param2;
          stackOut_0_4 = param3;
          stackOut_0_5 = param4;
          stackOut_0_6 = param5;
          stackOut_0_7 = 1;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_2_4 = stackOut_0_4;
          stackIn_2_5 = stackOut_0_5;
          stackIn_2_6 = stackOut_0_6;
          stackIn_2_7 = stackOut_0_7;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          stackIn_1_4 = stackOut_0_4;
          stackIn_1_5 = stackOut_0_5;
          stackIn_1_6 = stackOut_0_6;
          stackIn_1_7 = stackOut_0_7;
          if (-1 != (param5 ^ -1)) {
            stackOut_2_0 = this;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = stackIn_2_4;
            stackOut_2_5 = stackIn_2_5;
            stackOut_2_6 = stackIn_2_6;
            stackOut_2_7 = stackIn_2_7;
            stackOut_2_8 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            stackIn_3_5 = stackOut_2_5;
            stackIn_3_6 = stackOut_2_6;
            stackIn_3_7 = stackOut_2_7;
            stackIn_3_8 = stackOut_2_8;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = stackIn_1_4;
            stackOut_1_5 = stackIn_1_5;
            stackOut_1_6 = stackIn_1_6;
            stackOut_1_7 = stackIn_1_7;
            stackOut_1_8 = 256;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            stackIn_3_5 = stackOut_1_5;
            stackIn_3_6 = stackOut_1_6;
            stackIn_3_7 = stackOut_1_7;
            stackIn_3_8 = stackOut_1_8;
            break L0;
          }
        }
    }

    d(int param0, int param1, int param2) {
        this(param0 + -3, param1 + -3, 0, 0, 0, 5, param2, 0);
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = StarCannon.field_A;
          var3 = 32 % ((87 - param1) / 32);
          var6 = this.field_h;
          if (11 != var6) {
            if ((var6 ^ -1) != -14) {
              if ((var6 ^ -1) == -15) {
                if (0 != qc.field_d) {
                  var4 = (param0 >> 985756260) + this.field_d;
                  ki.d(var4, this.field_q, -(this.field_j >> -282568507) + var4, -(this.field_e >> 1031497893) + this.field_q, this.field_o, (-(this.field_p * 255) + 765) / 3);
                  break L0;
                } else {
                  return;
                }
              } else {
                if (-13 != (var6 ^ -1)) {
                  L1: {
                    if (-2 != (var6 ^ -1)) {
                      if (-11 != (var6 ^ -1)) {
                        if ((var6 ^ -1) == -3) {
                          L2: {
                            var4 = -(this.field_i + -1 << 1311900897) + this.field_d - -(param0 >> -1050055228);
                            if (this.field_i != 1) {
                              break L2;
                            } else {
                              ki.a(var4, this.field_q, -(this.field_j / 32) + var4, this.field_q - this.field_e / 32, this.field_o);
                              break L2;
                            }
                          }
                          jg.field_C[4 + (-5 + 5 * this.field_i)].a(var4 - 3, this.field_q - 3, this.field_o);
                          break L0;
                        } else {
                          if (var6 != 3) {
                            if (var6 != 0) {
                              if (var6 != 4) {
                                if (-6 != (var6 ^ -1)) {
                                  if (-7 != (var6 ^ -1)) {
                                    if (var6 != 7) {
                                      if (var6 != 8) {
                                        if (9 == var6) {
                                          L3: {
                                            var4 = (param0 >> 1735302084) + this.field_d;
                                            if (-25 < (this.field_o ^ -1)) {
                                              oh.field_d[this.field_o].b(var4 + -128, -128 + this.field_q, 256, 256, 255);
                                              break L3;
                                            } else {
                                              break L3;
                                            }
                                          }
                                          return;
                                        } else {
                                          return;
                                        }
                                      } else {
                                        var4 = this.field_d - -(param0 >> -1907352828);
                                        if (24 > this.field_o) {
                                          oh.field_d[this.field_o].b(var4 + -96, -96 + this.field_q, 192, 192, 255);
                                          break L0;
                                        } else {
                                          break L0;
                                        }
                                      }
                                    } else {
                                      L4: {
                                        var4 = (param0 >> -1183211644) + this.field_d;
                                        if (-25 >= (this.field_o ^ -1)) {
                                          break L4;
                                        } else {
                                          oh.field_d[this.field_o].b(var4 + -64, this.field_q + -64, 128, 128, 255);
                                          break L4;
                                        }
                                      }
                                      return;
                                    }
                                  } else {
                                    var4 = (param0 >> -1536169468) + this.field_d;
                                    if ((this.field_o ^ -1) <= -15) {
                                      break L0;
                                    } else {
                                      ad.field_z[this.field_o].f(var4 - 16, this.field_q - 16, 64);
                                      break L0;
                                    }
                                  }
                                } else {
                                  L5: {
                                    var4 = (param0 >> -2088686876) + this.field_d;
                                    if (14 <= this.field_o) {
                                      break L5;
                                    } else {
                                      ie.field_B[this.field_o].f(var4 - 16, -16 + this.field_q, 64);
                                      break L5;
                                    }
                                  }
                                  return;
                                }
                              } else {
                                L6: {
                                  var4 = this.field_d - -(param0 >> -83809243);
                                  if ((gd.field_d ^ -1) >= -9) {
                                    ea.field_b[gd.field_d].a(this.field_q, 0, -125, var4, 128);
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                if (-10 >= (gd.field_d ^ -1)) {
                                  kj.field_y[-9 + gd.field_d].a(this.field_q, 0, -122, var4, 128);
                                  break L0;
                                } else {
                                  break L0;
                                }
                              }
                            } else {
                              var4 = (param0 >> 1690208836) + this.field_d;
                              if (-17 >= (this.field_p ^ -1)) {
                                ki.c(var4, this.field_q, this.field_p >> 1610436386, this.field_o, 128);
                                break L0;
                              } else {
                                ki.c(var4, this.field_q, this.field_p >> -1501186910, this.field_o, this.field_p << -566569661);
                                break L0;
                              }
                            }
                          } else {
                            L7: {
                              var4 = 0;
                              if (3 != this.field_h) {
                                break L7;
                              } else {
                                var4 = param0 / 20 + this.field_d;
                                break L7;
                              }
                            }
                            jg.field_C[4].a(-3 + var4, -3 + this.field_q, this.field_o);
                            break L0;
                          }
                        }
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                  var4 = (param0 >> -619968316) + this.field_d;
                  var4 = var4 - (this.field_i - 1 << 1779450753);
                  if (this.field_o != 65280) {
                    if (this.field_i > 2) {
                      if (3 == this.field_i) {
                        ie.field_B[0].f(var4 + -8, this.field_q - 8, 192);
                        ie.field_B[2].f(-8 + var4, -8 + (this.field_q + 4), 64);
                        ie.field_B[4].f(-8 + var4, 8 + (-8 + this.field_q), 64);
                        ie.field_B[6].f(var4 + -8, -8 + this.field_q - -12, 64);
                        ie.field_B[8].f(-8 + var4, 8 + this.field_q, 64);
                        ie.field_B[10].f(-8 + var4, -8 + this.field_q - -20, 64);
                        ie.field_B[12].f(var4 + -8, 24 + (-8 + this.field_q), 64);
                        ie.field_B[14].f(var4 + -8, 20 + this.field_q, 64);
                        break L0;
                      } else {
                        if (4 != this.field_i) {
                          jg.field_C[9].a(6 + var4, this.field_q - 3, this.field_o);
                          jg.field_C[9].a(12 + var4, -3 + this.field_q, this.field_o);
                          break L0;
                        } else {
                          jg.field_C[9].a(-2 + var4, -3 + this.field_q, this.field_o);
                          jg.field_C[9].a(4 + var4, -3 + this.field_q, this.field_o);
                          break L0;
                        }
                      }
                    } else {
                      jg.field_C[5 * (-1 + this.field_i) + 4].a(-3 + var4, this.field_q + -3, this.field_o);
                      break L0;
                    }
                  } else {
                    ie.field_A[this.field_f].f(var4 + -8, -8 + this.field_q, 128);
                    break L0;
                  }
                } else {
                  var4 = this.field_d - -(param0 >> -1501641628);
                  var5 = 1;
                  var6 = this.field_i;
                  L8: while (true) {
                    if (1 >= var6) {
                      ki.c(var4, this.field_q, var5 + 2, this.field_o, 64);
                      ki.c(var4, this.field_q, var5 - -1, this.field_o, 64);
                      ki.a(var4, this.field_q, var4 + -(this.field_j >> -1885282715), this.field_q - (this.field_e >> -2135846907), 16777215);
                      ki.a(var4 + -1, this.field_q, var4 - (this.field_j >> -1849311131), -(this.field_e >> 253073669) + this.field_q, this.field_o);
                      ki.a(1 + var4, this.field_q, -(this.field_j >> -1889288475) + var4, -(this.field_e >> -497804763) + this.field_q, this.field_o);
                      ki.e(var4, this.field_q, var5, 16777215);
                      break L0;
                    } else {
                      var5++;
                      var6 = var6 >> 1;
                      continue L8;
                    }
                  }
                }
              }
            } else {
              if (qc.field_d != 0) {
                var4 = this.field_d - -(param0 >> 1209857764);
                ki.d(var4, this.field_q, -(this.field_j >> -503785947) + var4, -(this.field_e >> -221030651) + this.field_q, this.field_o, 128 * (8 - this.field_p) / 8);
                break L0;
              } else {
                return;
              }
            }
          } else {
            var4 = (param0 >> 1814014052) + this.field_d;
            if ((this.field_i ^ -1) == -3) {
              ki.c(var4, this.field_q, 3, this.field_o, 64);
              ki.c(var4, this.field_q, 2, this.field_o, 64);
              ki.a(var4, this.field_q, -(this.field_j >> 1624137989) + var4, -(this.field_e >> 931742661) + this.field_q, 16777215);
              ki.a(var4 + -1, this.field_q, var4 + -(this.field_j >> 573770053), this.field_q + -(this.field_e >> 32478469), this.field_o);
              ki.a(var4 + 1, this.field_q, -(this.field_j >> 197315333) + var4, -(this.field_e >> 804373989) + this.field_q, this.field_o);
              ki.e(var4, this.field_q, 1, 16777215);
              if (0 == (16 & this.field_q)) {
                ki.a(var4, -6 + this.field_q, var4, this.field_q - -6, this.field_o);
                ki.a(var4, this.field_q + -4, var4, this.field_q - -4, 16777215);
                break L0;
              } else {
                ki.a(var4 + 6, this.field_q, var4 + -6, this.field_q, this.field_o);
                ki.a(var4 - -4, this.field_q, var4 - 4, this.field_q, 16777215);
                break L0;
              }
            } else {
              ki.c(var4, this.field_q, 4, this.field_o, 64);
              ki.c(var4, this.field_q, 3, this.field_o, 64);
              ki.a(var4, this.field_q, var4 + -(this.field_j >> 1011202757), this.field_q - (this.field_e >> 2027028581), 16777215);
              ki.a(var4 - 1, this.field_q, var4 - (this.field_j >> -631908827), this.field_q + -(this.field_e >> 1351688901), this.field_o);
              ki.a(var4 - -1, this.field_q, -(this.field_j >> 654229573) + var4, -(this.field_e >> -1412499675) + this.field_q, this.field_o);
              if (0 == (this.field_q & 16)) {
                ki.a(var4 + -8, -8 + this.field_q, var4 - -8, 8 + this.field_q, this.field_o);
                ki.a(var4 - 5, this.field_q - 5, 5 + var4, 5 + this.field_q, 16777215);
                ki.e(var4, this.field_q, 2, 16777215);
                break L0;
              } else {
                ki.a(8 + var4, this.field_q + -8, -8 + var4, 8 + this.field_q, this.field_o);
                ki.a(var4 - -5, -5 + this.field_q, -5 + var4, 5 + this.field_q, 16777215);
                ki.e(var4, this.field_q, 2, 16777215);
                break L0;
              }
            }
          }
        }
    }

    final static Object a(boolean param0, byte param1, byte[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ij var4 = null;
        ij stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ij stackOut_5_0 = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param2 != null) {
              var3_int = 73 % ((58 - param1) / 44);
              if (-137 > (param2.length ^ -1)) {
                var4 = new ij();
                ((kk) ((Object) var4)).a(-5361, param2);
                stackOut_5_0 = (ij) (var4);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (param0) {
                  stackOut_10_0 = rg.a((byte) 10, param2);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_8_0 = (byte[]) (param2);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("d.A(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public static void a(int param0) {
        Object discarded$0 = null;
        field_b = null;
        field_n = null;
        field_m = null;
        field_c = null;
        field_l = null;
        if (param0 != 32) {
            byte[] var2 = (byte[]) null;
            discarded$0 = d.a(false, (byte) -38, (byte[]) null);
        }
    }

    private d(d param0, int param1) {
        try {
            this.field_i = param0.field_i;
            this.field_a = param0.field_a;
            this.field_p = 0;
            this.field_g = param0.field_g;
            this.field_d = param0.field_d;
            this.field_k = param0.field_k;
            this.field_e = param0.field_e;
            this.field_o = param0.field_o;
            this.field_h = param1;
            this.field_q = param0.field_q;
            this.field_j = param0.field_j;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "d.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    d(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_o = param4;
        this.field_j = param2;
        this.field_h = param5;
        this.field_q = param1 - -3;
        this.field_e = param3;
        this.field_d = 3 + param0;
        this.field_i = param6;
        this.field_p = param7;
        this.field_g = 0;
        this.field_k = 0;
        if ((param5 ^ -1) == -12) {
            this.field_j = this.field_j + (-16 + sh.b(43, 32));
        }
    }

    static {
        field_c = "Player Name: ";
        field_m = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_n = "Paragulan homeworld destroyed<br><br>CONGRATULATIONS<br><br>Final score: ";
    }
}
