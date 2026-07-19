/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends sj {
    private int field_y;
    private int field_r;
    private int field_p;
    private int field_t;
    private int field_o;
    private boolean field_z;
    private int field_v;
    private int field_C;
    private int field_s;
    private int field_q;
    private int field_w;
    private int field_B;
    private int field_x;
    private int field_u;
    private int field_A;

    final int a() {
        if (this.field_x == 0) {
            if (this.field_A == 0) {
                return 0;
            }
        }
        return 1;
    }

    final synchronized int i() {
        return this.field_B < 0 ? -this.field_B : this.field_B;
    }

    private final static int a(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final synchronized boolean h() {
        return this.field_p < 0 || this.field_p >= ((sp) ((Object) this.field_k)).field_n.length << 8;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, pp param9) {
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        L0: {
          param2 = param2 >> 8;
          param8 = param8 >> 8;
          param4 = param4 << 2;
          param5 = param5 << 2;
          param6 = param3 + param8 - param2;
          if (param3 + param8 - param2 <= param7) {
            break L0;
          } else {
            param6 = param7;
            break L0;
          }
        }
        param9.field_y = param9.field_y + param9.field_v * (param6 - param3);
        param9.field_u = param9.field_u + param9.field_C * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_o = param4 >> 2;
                param9.field_p = param2 << 8;
                return param3;
              } else {
                incrementValue$10 = param3;
                param3++;
                incrementValue$11 = param2;
                param2++;
                param1[incrementValue$10] = param1[incrementValue$10] + param0[incrementValue$11] * param4;
                param4 = param4 + param5;
                continue L2;
              }
            }
          } else {
            incrementValue$12 = param3;
            param3++;
            incrementValue$13 = param2;
            param2++;
            param1[incrementValue$12] = param1[incrementValue$12] + param0[incrementValue$13] * param4;
            param4 = param4 + param5;
            incrementValue$14 = param3;
            param3++;
            incrementValue$15 = param2;
            param2++;
            param1[incrementValue$14] = param1[incrementValue$14] + param0[incrementValue$15] * param4;
            param4 = param4 + param5;
            incrementValue$16 = param3;
            param3++;
            incrementValue$17 = param2;
            param2++;
            param1[incrementValue$16] = param1[incrementValue$16] + param0[incrementValue$17] * param4;
            param4 = param4 + param5;
            incrementValue$18 = param3;
            param3++;
            incrementValue$19 = param2;
            param2++;
            param1[incrementValue$18] = param1[incrementValue$18] + param0[incrementValue$19] * param4;
            param4 = param4 + param5;
            continue L1;
          }
        }
    }

    final static pp a(sp param0, int param1, int param2, int param3) {
        if (param0.field_n != null) {
          if (param0.field_n.length == 0) {
            return null;
          } else {
            return new pp(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (this.field_A <= 0) {
            L1: {
              if (this.field_B != -256) {
                break L1;
              } else {
                if ((this.field_p & 255) != 0) {
                  break L1;
                } else {
                  if (mm.field_o) {
                    return pp.a(0, ((sp) ((Object) this.field_k)).field_n, param0, this.field_p, param1, this.field_y, this.field_u, 0, param3, param2, (pp) (this));
                  } else {
                    return pp.b(((sp) ((Object) this.field_k)).field_n, param0, this.field_p, param1, this.field_o, 0, param3, param2, (pp) (this));
                  }
                }
              }
            }
            if (mm.field_o) {
              return pp.b(0, 0, ((sp) ((Object) this.field_k)).field_n, param0, this.field_p, param1, this.field_y, this.field_u, 0, param3, param2, (pp) (this), this.field_B, param4);
            } else {
              return pp.a(0, 0, ((sp) ((Object) this.field_k)).field_n, param0, this.field_p, param1, this.field_o, 0, param3, param2, (pp) (this), this.field_B, param4);
            }
          } else {
            L2: {
              var6 = param1 + this.field_A;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                this.field_A = this.field_A + param1;
                if (this.field_B != -256) {
                  break L4;
                } else {
                  if ((this.field_p & 255) != 0) {
                    break L4;
                  } else {
                    if (!mm.field_o) {
                      param1 = pp.a(((sp) ((Object) this.field_k)).field_n, param0, this.field_p, param1, this.field_o, this.field_q, 0, var6, param2, (pp) (this));
                      break L3;
                    } else {
                      param1 = pp.a(0, ((sp) ((Object) this.field_k)).field_n, param0, this.field_p, param1, this.field_y, this.field_u, this.field_v, this.field_C, 0, var6, param2, (pp) (this));
                      break L3;
                    }
                  }
                }
              }
              if (!mm.field_o) {
                param1 = pp.c(0, 0, ((sp) ((Object) this.field_k)).field_n, param0, this.field_p, param1, this.field_o, this.field_q, 0, var6, param2, (pp) (this), this.field_B, param4);
                break L3;
              } else {
                param1 = pp.a(0, 0, ((sp) ((Object) this.field_k)).field_n, param0, this.field_p, param1, this.field_y, this.field_u, this.field_v, this.field_C, 0, var6, param2, (pp) (this), this.field_B, param4);
                break L3;
              }
            }
            this.field_A = this.field_A - param1;
            if (this.field_A == 0) {
              if (!this.g()) {
                continue L0;
              } else {
                return param3;
              }
            } else {
              return param1;
            }
          }
        }
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, pp param11, int param12, int param13) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        L0: {
          L1: {
            param11.field_y = param11.field_y - param11.field_v * param5;
            param11.field_u = param11.field_u - param11.field_C * param5;
            if (param12 == 0) {
              break L1;
            } else {
              param8 = param5 + (param10 - param4 + param12 - 257) / param12;
              if (param5 + (param10 - param4 + param12 - 257) / param12 <= param9) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param8 = param9;
          break L0;
        }
        L2: while (true) {
          if (param5 >= param8) {
            L3: {
              L4: {
                if (param12 == 0) {
                  break L4;
                } else {
                  param8 = param5 + (param10 - param4 + param12 - 1) / param12;
                  if (param5 + (param10 - param4 + param12 - 1) / param12 <= param9) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param8 = param9;
              break L3;
            }
            param1 = param13;
            L5: while (true) {
              if (param5 >= param8) {
                param11.field_y = param11.field_y + param11.field_v * param5;
                param11.field_u = param11.field_u + param11.field_C * param5;
                param11.field_o = param6;
                param11.field_p = param4;
                return param5;
              } else {
                param0 = param2[param4 >> 8];
                incrementValue$2 = param5;
                param5++;
                param3[incrementValue$2] = param3[incrementValue$2] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
                param6 = param6 + param7;
                param4 = param4 + param12;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            incrementValue$3 = param5;
            param5++;
            param3[incrementValue$3] = param3[incrementValue$3] + (((param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255)) * param6 >> 6);
            param6 = param6 + param7;
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, pp param11, int param12, int param13) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        L0: {
          L1: {
            param11.field_y = param11.field_y - param11.field_v * param5;
            param11.field_u = param11.field_u - param11.field_C * param5;
            if (param12 == 0) {
              break L1;
            } else {
              param8 = param5 + (param10 + 256 - param4 + param12) / param12;
              if (param5 + (param10 + 256 - param4 + param12) / param12 <= param9) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param8 = param9;
          break L0;
        }
        L2: while (true) {
          if (param5 >= param8) {
            L3: {
              L4: {
                if (param12 == 0) {
                  break L4;
                } else {
                  param8 = param5 + (param10 - param4 + param12) / param12;
                  if (param5 + (param10 - param4 + param12) / param12 <= param9) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param8 = param9;
              break L3;
            }
            param0 = param13;
            param1 = param12;
            L5: while (true) {
              if (param5 >= param8) {
                param11.field_y = param11.field_y + param11.field_v * param5;
                param11.field_u = param11.field_u + param11.field_C * param5;
                param11.field_o = param6;
                param11.field_p = param4;
                return param5;
              } else {
                incrementValue$2 = param5;
                param5++;
                param3[incrementValue$2] = param3[incrementValue$2] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
                param6 = param6 + param7;
                param4 = param4 + param1;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            incrementValue$3 = param5;
            param5++;
            param3[incrementValue$3] = param3[incrementValue$3] + (((param0 << 8) + (param2[param1] - param0) * (param4 & 255)) * param6 >> 6);
            param6 = param6 + param7;
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, pp param11, int param12, int param13) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        L0: {
          L1: {
            if (param12 == 0) {
              break L1;
            } else {
              param8 = param5 + (param10 - param4 + param12 - 257) / param12;
              if (param5 + (param10 - param4 + param12 - 257) / param12 <= param9) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param8 = param9;
          break L0;
        }
        param5 = param5 << 1;
        param8 = param8 << 1;
        L2: while (true) {
          if (param5 >= param8) {
            L3: {
              L4: {
                if (param12 == 0) {
                  break L4;
                } else {
                  param8 = (param5 >> 1) + (param10 - param4 + param12 - 1) / param12;
                  if ((param5 >> 1) + (param10 - param4 + param12 - 1) / param12 <= param9) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param8 = param9;
              break L3;
            }
            param8 = param8 << 1;
            param1 = param13;
            L5: while (true) {
              if (param5 >= param8) {
                param11.field_p = param4;
                return param5 >> 1;
              } else {
                param0 = param2[param4 >> 8];
                param0 = (param0 << 8) + (param1 - param0) * (param4 & 255);
                incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
                incrementValue$5 = param5;
                param5++;
                param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
                param4 = param4 + param12;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            param0 = (param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255);
            incrementValue$6 = param5;
            param5++;
            param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
            incrementValue$7 = param5;
            param5++;
            param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    private final synchronized void c(int param0, int param1) {
        this.field_x = param0;
        this.field_w = param1;
        this.field_A = 0;
        this.j();
    }

    final synchronized void b(int param0, int param1) {
        this.a(param0, param1, this.f());
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, pp param12) {
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        L0: {
          param3 = param3 >> 8;
          param11 = param11 >> 8;
          param5 = param5 << 2;
          param6 = param6 << 2;
          param7 = param7 << 2;
          param8 = param8 << 2;
          param9 = param4 + param3 - (param11 - 1);
          if (param4 + param3 - (param11 - 1) <= param10) {
            break L0;
          } else {
            param9 = param10;
            break L0;
          }
        }
        param12.field_o = param12.field_o + param12.field_q * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_y = param5 >> 2;
                param12.field_u = param6 >> 2;
                param12.field_p = param3 << 8;
                return param4 >> 1;
              } else {
                incrementValue$15 = param3;
                param3--;
                param0 = param1[incrementValue$15];
                incrementValue$16 = param4;
                param4++;
                param2[incrementValue$16] = param2[incrementValue$16] + param0 * param5;
                param5 = param5 + param7;
                incrementValue$17 = param4;
                param4++;
                param2[incrementValue$17] = param2[incrementValue$17] + param0 * param6;
                param6 = param6 + param8;
                continue L2;
              }
            }
          } else {
            incrementValue$18 = param3;
            param3--;
            param0 = param1[incrementValue$18];
            incrementValue$19 = param4;
            param4++;
            param2[incrementValue$19] = param2[incrementValue$19] + param0 * param5;
            param5 = param5 + param7;
            incrementValue$20 = param4;
            param4++;
            param2[incrementValue$20] = param2[incrementValue$20] + param0 * param6;
            param6 = param6 + param8;
            incrementValue$21 = param3;
            param3--;
            param0 = param1[incrementValue$21];
            incrementValue$22 = param4;
            param4++;
            param2[incrementValue$22] = param2[incrementValue$22] + param0 * param5;
            param5 = param5 + param7;
            incrementValue$23 = param4;
            param4++;
            param2[incrementValue$23] = param2[incrementValue$23] + param0 * param6;
            param6 = param6 + param8;
            incrementValue$24 = param3;
            param3--;
            param0 = param1[incrementValue$24];
            incrementValue$25 = param4;
            param4++;
            param2[incrementValue$25] = param2[incrementValue$25] + param0 * param5;
            param5 = param5 + param7;
            incrementValue$26 = param4;
            param4++;
            param2[incrementValue$26] = param2[incrementValue$26] + param0 * param6;
            param6 = param6 + param8;
            incrementValue$27 = param3;
            param3--;
            param0 = param1[incrementValue$27];
            incrementValue$28 = param4;
            param4++;
            param2[incrementValue$28] = param2[incrementValue$28] + param0 * param5;
            param5 = param5 + param7;
            incrementValue$29 = param4;
            param4++;
            param2[incrementValue$29] = param2[incrementValue$29] + param0 * param6;
            param6 = param6 + param8;
            continue L1;
          }
        }
    }

    final synchronized void g(int param0) {
        this.field_s = param0;
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (this.field_A <= 0) {
            L1: {
              if (this.field_B != 256) {
                break L1;
              } else {
                if ((this.field_p & 255) != 0) {
                  break L1;
                } else {
                  if (mm.field_o) {
                    return pp.b(0, ((sp) ((Object) this.field_k)).field_n, param0, this.field_p, param1, this.field_y, this.field_u, 0, param3, param2, (pp) (this));
                  } else {
                    return pp.a(((sp) ((Object) this.field_k)).field_n, param0, this.field_p, param1, this.field_o, 0, param3, param2, (pp) (this));
                  }
                }
              }
            }
            if (mm.field_o) {
              return pp.a(0, 0, ((sp) ((Object) this.field_k)).field_n, param0, this.field_p, param1, this.field_y, this.field_u, 0, param3, param2, (pp) (this), this.field_B, param4);
            } else {
              return pp.b(0, 0, ((sp) ((Object) this.field_k)).field_n, param0, this.field_p, param1, this.field_o, 0, param3, param2, (pp) (this), this.field_B, param4);
            }
          } else {
            L2: {
              var6 = param1 + this.field_A;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                this.field_A = this.field_A + param1;
                if (this.field_B != 256) {
                  break L4;
                } else {
                  if ((this.field_p & 255) != 0) {
                    break L4;
                  } else {
                    if (!mm.field_o) {
                      param1 = pp.b(((sp) ((Object) this.field_k)).field_n, param0, this.field_p, param1, this.field_o, this.field_q, 0, var6, param2, (pp) (this));
                      break L3;
                    } else {
                      param1 = pp.b(0, ((sp) ((Object) this.field_k)).field_n, param0, this.field_p, param1, this.field_y, this.field_u, this.field_v, this.field_C, 0, var6, param2, (pp) (this));
                      break L3;
                    }
                  }
                }
              }
              if (!mm.field_o) {
                param1 = pp.d(0, 0, ((sp) ((Object) this.field_k)).field_n, param0, this.field_p, param1, this.field_o, this.field_q, 0, var6, param2, (pp) (this), this.field_B, param4);
                break L3;
              } else {
                param1 = pp.b(0, 0, ((sp) ((Object) this.field_k)).field_n, param0, this.field_p, param1, this.field_y, this.field_u, this.field_v, this.field_C, 0, var6, param2, (pp) (this), this.field_B, param4);
                break L3;
              }
            }
            this.field_A = this.field_A - param1;
            if (this.field_A == 0) {
              if (!this.g()) {
                continue L0;
              } else {
                return param3;
              }
            } else {
              return param1;
            }
          }
        }
    }

    private final void l() {
        if (this.field_A != 0) {
            if (this.field_x == -2147483648) {
                this.field_x = 0;
            }
            this.field_A = 0;
            this.j();
            return;
        }
    }

    final synchronized int e() {
        return this.field_x == -2147483648 ? 0 : this.field_x;
    }

    final synchronized void a(int param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        sp var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (this.field_A <= 0) {
            break L0;
          } else {
            if (param0 < this.field_A) {
              this.field_o = this.field_o + this.field_q * param0;
              this.field_y = this.field_y + this.field_v * param0;
              this.field_u = this.field_u + this.field_C * param0;
              this.field_A = this.field_A - param0;
              break L0;
            } else {
              L1: {
                if (this.field_x != -2147483648) {
                  break L1;
                } else {
                  this.field_x = 0;
                  this.field_u = 0;
                  this.field_y = 0;
                  this.field_o = 0;
                  this.c(2779);
                  param0 = this.field_A;
                  break L1;
                }
              }
              this.field_A = 0;
              this.j();
              break L0;
            }
          }
        }
        L2: {
          var2 = (sp) ((Object) this.field_k);
          var3 = this.field_r << 8;
          var4 = this.field_t << 8;
          var5 = var2.field_n.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            this.field_s = 0;
            break L2;
          }
        }
        L3: {
          if (this.field_p >= 0) {
            break L3;
          } else {
            if (this.field_B <= 0) {
              this.l();
              this.c(2779);
              return;
            } else {
              this.field_p = 0;
              break L3;
            }
          }
        }
        L4: {
          if (this.field_p < var5) {
            break L4;
          } else {
            if (this.field_B >= 0) {
              this.l();
              this.c(2779);
              return;
            } else {
              this.field_p = var5 - 1;
              break L4;
            }
          }
        }
        this.field_p = this.field_p + this.field_B * param0;
        if (this.field_s >= 0) {
          L5: {
            if (this.field_s <= 0) {
              break L5;
            } else {
              if (!this.field_z) {
                L6: {
                  if (this.field_B >= 0) {
                    if (this.field_p >= var4) {
                      var7 = (this.field_p - var3) / var6;
                      if (var7 < this.field_s) {
                        this.field_p = this.field_p - var6 * var7;
                        this.field_s = this.field_s - var7;
                        break L6;
                      } else {
                        this.field_p = this.field_p - var6 * this.field_s;
                        this.field_s = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (this.field_p < var3) {
                      var7 = (var4 - 1 - this.field_p) / var6;
                      if (var7 < this.field_s) {
                        this.field_p = this.field_p + var6 * var7;
                        this.field_s = this.field_s - var7;
                        break L6;
                      } else {
                        this.field_p = this.field_p + var6 * this.field_s;
                        this.field_s = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                L7: {
                  if (this.field_B >= 0) {
                    break L7;
                  } else {
                    if (this.field_p < var3) {
                      this.field_p = var3 + var3 - 1 - this.field_p;
                      this.field_B = -this.field_B;
                      fieldTemp$3 = this.field_s - 1;
                      this.field_s = this.field_s - 1;
                      if (fieldTemp$3 != 0) {
                        break L7;
                      } else {
                        break L5;
                      }
                    } else {
                      return;
                    }
                  }
                }
                L8: while (true) {
                  if (this.field_p >= var4) {
                    this.field_p = var4 + var4 - 1 - this.field_p;
                    this.field_B = -this.field_B;
                    fieldTemp$4 = this.field_s - 1;
                    this.field_s = this.field_s - 1;
                    if (fieldTemp$4 != 0) {
                      if (this.field_p < var3) {
                        this.field_p = var3 + var3 - 1 - this.field_p;
                        this.field_B = -this.field_B;
                        fieldTemp$5 = this.field_s - 1;
                        this.field_s = this.field_s - 1;
                        if (fieldTemp$5 != 0) {
                          continue L8;
                        } else {
                          break L5;
                        }
                      } else {
                        return;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          if (this.field_B < 0) {
            if (this.field_p < 0) {
              this.field_p = -1;
              this.l();
              this.c(2779);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (this.field_p < var5) {
                break L9;
              } else {
                this.field_p = var5;
                this.l();
                this.c(2779);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!this.field_z) {
            if (this.field_B >= 0) {
              if (this.field_p < var4) {
                return;
              } else {
                this.field_p = var3 + (this.field_p - var3) % var6;
                return;
              }
            } else {
              if (this.field_p < var3) {
                this.field_p = var4 - 1 - (var4 - 1 - this.field_p) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (this.field_B >= 0) {
                break L10;
              } else {
                if (this.field_p < var3) {
                  this.field_p = var3 + var3 - 1 - this.field_p;
                  this.field_B = -this.field_B;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (this.field_p >= var4) {
                this.field_p = var4 + var4 - 1 - this.field_p;
                this.field_B = -this.field_B;
                if (this.field_p < var3) {
                  this.field_p = var3 + var3 - 1 - this.field_p;
                  this.field_B = -this.field_B;
                  continue L11;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final static pp a(sp param0, int param1, int param2) {
        if (param0.field_n != null) {
          if (param0.field_n.length == 0) {
            return null;
          } else {
            return new pp(param0, (int)((long)param0.field_o * 256L * (long)param1 / (long)(100 * mm.field_h)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    final synchronized void f(int param0) {
        int var2 = ((sp) ((Object) this.field_k)).field_n.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        this.field_p = param0;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, pp param8) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param7 - param2;
        if (param3 + param7 - param2 > param6) {
            param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
            incrementValue$0 = param3;
            param3++;
            incrementValue$1 = param2;
            param2++;
            param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
            incrementValue$2 = param3;
            param3++;
            incrementValue$3 = param2;
            param2++;
            param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
            incrementValue$4 = param3;
            param3++;
            incrementValue$5 = param2;
            param2++;
            param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
            incrementValue$6 = param3;
            param3++;
            incrementValue$7 = param2;
            param2++;
            param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
            incrementValue$8 = param3;
            param3++;
            incrementValue$9 = param2;
            param2++;
            param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
        }
        param8.field_p = param2 << 8;
        return param3;
    }

    final synchronized void h(int param0) {
        this.c(param0, this.f());
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, pp param11, int param12, int param13) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        L0: {
          L1: {
            if (param12 == 0) {
              break L1;
            } else {
              param8 = param5 + (param10 + 256 - param4 + param12) / param12;
              if (param5 + (param10 + 256 - param4 + param12) / param12 <= param9) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param8 = param9;
          break L0;
        }
        param5 = param5 << 1;
        param8 = param8 << 1;
        L2: while (true) {
          if (param5 >= param8) {
            L3: {
              L4: {
                if (param12 == 0) {
                  break L4;
                } else {
                  param8 = (param5 >> 1) + (param10 - param4 + param12) / param12;
                  if ((param5 >> 1) + (param10 - param4 + param12) / param12 <= param9) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param8 = param9;
              break L3;
            }
            param8 = param8 << 1;
            param1 = param13;
            L5: while (true) {
              if (param5 >= param8) {
                param11.field_p = param4;
                return param5 >> 1;
              } else {
                param0 = (param1 << 8) + (param2[param4 >> 8] - param1) * (param4 & 255);
                incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
                incrementValue$5 = param5;
                param5++;
                param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
                param4 = param4 + param12;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            param0 = (param0 << 8) + (param2[param1] - param0) * (param4 & 255);
            incrementValue$6 = param5;
            param5++;
            param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
            incrementValue$7 = param5;
            param5++;
            param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    final synchronized boolean k() {
        return this.field_A != 0;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, pp param10) {
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        L0: {
          param3 = param3 >> 8;
          param9 = param9 >> 8;
          param5 = param5 << 2;
          param6 = param6 << 2;
          param7 = param4 + param3 - (param9 - 1);
          if (param4 + param3 - (param9 - 1) <= param8) {
            break L0;
          } else {
            param7 = param8;
            break L0;
          }
        }
        param4 = param4 << 1;
        param7 = param7 << 1;
        param7 -= 6;
        L1: while (true) {
          if (param4 >= param7) {
            param7 += 6;
            L2: while (true) {
              if (param4 >= param7) {
                param10.field_p = param3 << 8;
                return param4 >> 1;
              } else {
                incrementValue$15 = param3;
                param3--;
                param0 = param1[incrementValue$15];
                incrementValue$16 = param4;
                param4++;
                param2[incrementValue$16] = param2[incrementValue$16] + param0 * param5;
                incrementValue$17 = param4;
                param4++;
                param2[incrementValue$17] = param2[incrementValue$17] + param0 * param6;
                continue L2;
              }
            }
          } else {
            incrementValue$18 = param3;
            param3--;
            param0 = param1[incrementValue$18];
            incrementValue$19 = param4;
            param4++;
            param2[incrementValue$19] = param2[incrementValue$19] + param0 * param5;
            incrementValue$20 = param4;
            param4++;
            param2[incrementValue$20] = param2[incrementValue$20] + param0 * param6;
            incrementValue$21 = param3;
            param3--;
            param0 = param1[incrementValue$21];
            incrementValue$22 = param4;
            param4++;
            param2[incrementValue$22] = param2[incrementValue$22] + param0 * param5;
            incrementValue$23 = param4;
            param4++;
            param2[incrementValue$23] = param2[incrementValue$23] + param0 * param6;
            incrementValue$24 = param3;
            param3--;
            param0 = param1[incrementValue$24];
            incrementValue$25 = param4;
            param4++;
            param2[incrementValue$25] = param2[incrementValue$25] + param0 * param5;
            incrementValue$26 = param4;
            param4++;
            param2[incrementValue$26] = param2[incrementValue$26] + param0 * param6;
            incrementValue$27 = param3;
            param3--;
            param0 = param1[incrementValue$27];
            incrementValue$28 = param4;
            param4++;
            param2[incrementValue$28] = param2[incrementValue$28] + param0 * param5;
            incrementValue$29 = param4;
            param4++;
            param2[incrementValue$29] = param2[incrementValue$29] + param0 * param6;
            continue L1;
          }
        }
    }

    final int c() {
        int var1 = this.field_o * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.field_s == 0) {
            var1 = var1 - var1 * this.field_p / (((sp) ((Object) this.field_k)).field_n.length << 8);
        } else {
            if (this.field_s >= 0) {
                var1 = var1 - var1 * this.field_r / ((sp) ((Object) this.field_k)).field_n.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, pp param10) {
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        L0: {
          param3 = param3 >> 8;
          param9 = param9 >> 8;
          param5 = param5 << 2;
          param6 = param6 << 2;
          param7 = param4 + param9 - param3;
          if (param4 + param9 - param3 <= param8) {
            break L0;
          } else {
            param7 = param8;
            break L0;
          }
        }
        param4 = param4 << 1;
        param7 = param7 << 1;
        param7 -= 6;
        L1: while (true) {
          if (param4 >= param7) {
            param7 += 6;
            L2: while (true) {
              if (param4 >= param7) {
                param10.field_p = param3 << 8;
                return param4 >> 1;
              } else {
                incrementValue$15 = param3;
                param3++;
                param0 = param1[incrementValue$15];
                incrementValue$16 = param4;
                param4++;
                param2[incrementValue$16] = param2[incrementValue$16] + param0 * param5;
                incrementValue$17 = param4;
                param4++;
                param2[incrementValue$17] = param2[incrementValue$17] + param0 * param6;
                continue L2;
              }
            }
          } else {
            incrementValue$18 = param3;
            param3++;
            param0 = param1[incrementValue$18];
            incrementValue$19 = param4;
            param4++;
            param2[incrementValue$19] = param2[incrementValue$19] + param0 * param5;
            incrementValue$20 = param4;
            param4++;
            param2[incrementValue$20] = param2[incrementValue$20] + param0 * param6;
            incrementValue$21 = param3;
            param3++;
            param0 = param1[incrementValue$21];
            incrementValue$22 = param4;
            param4++;
            param2[incrementValue$22] = param2[incrementValue$22] + param0 * param5;
            incrementValue$23 = param4;
            param4++;
            param2[incrementValue$23] = param2[incrementValue$23] + param0 * param6;
            incrementValue$24 = param3;
            param3++;
            param0 = param1[incrementValue$24];
            incrementValue$25 = param4;
            param4++;
            param2[incrementValue$25] = param2[incrementValue$25] + param0 * param5;
            incrementValue$26 = param4;
            param4++;
            param2[incrementValue$26] = param2[incrementValue$26] + param0 * param6;
            incrementValue$27 = param3;
            param3++;
            param0 = param1[incrementValue$27];
            incrementValue$28 = param4;
            param4++;
            param2[incrementValue$28] = param2[incrementValue$28] + param0 * param5;
            incrementValue$29 = param4;
            param4++;
            param2[incrementValue$29] = param2[incrementValue$29] + param0 * param6;
            continue L1;
          }
        }
    }

    final synchronized void i(int param0) {
        if (this.field_B < 0) {
            this.field_B = -param0;
        } else {
            this.field_B = param0;
        }
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, pp param13, int param14, int param15) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        L0: {
          L1: {
            param13.field_o = param13.field_o - param13.field_q * param5;
            if (param14 == 0) {
              break L1;
            } else {
              param10 = param5 + (param12 - param4 + param14 - 257) / param14;
              if (param5 + (param12 - param4 + param14 - 257) / param14 <= param11) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param10 = param11;
          break L0;
        }
        param5 = param5 << 1;
        param10 = param10 << 1;
        L2: while (true) {
          if (param5 >= param10) {
            L3: {
              L4: {
                if (param14 == 0) {
                  break L4;
                } else {
                  param10 = (param5 >> 1) + (param12 - param4 + param14 - 1) / param14;
                  if ((param5 >> 1) + (param12 - param4 + param14 - 1) / param14 <= param11) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param10 = param11;
              break L3;
            }
            param10 = param10 << 1;
            param1 = param15;
            L5: while (true) {
              if (param5 >= param10) {
                param5 = param5 >> 1;
                param13.field_o = param13.field_o + param13.field_q * param5;
                param13.field_y = param6;
                param13.field_u = param7;
                param13.field_p = param4;
                return param5;
              } else {
                param0 = param2[param4 >> 8];
                param0 = (param0 << 8) + (param1 - param0) * (param4 & 255);
                incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
                param6 = param6 + param8;
                incrementValue$5 = param5;
                param5++;
                param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
                param7 = param7 + param9;
                param4 = param4 + param14;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            param0 = (param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255);
            incrementValue$6 = param5;
            param5++;
            param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
            param6 = param6 + param8;
            incrementValue$7 = param5;
            param5++;
            param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
            param7 = param7 + param9;
            param4 = param4 + param14;
            continue L2;
          }
        }
    }

    private final boolean g() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = this.field_x;
          if (var1 != -2147483648) {
            var2 = pp.a(var1, this.field_w);
            var3 = pp.d(var1, this.field_w);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (this.field_o != var1) {
            break L1;
          } else {
            if (this.field_y != var2) {
              break L1;
            } else {
              if (this.field_u == var3) {
                if (this.field_x == -2147483648) {
                  this.field_x = 0;
                  this.field_u = 0;
                  this.field_y = 0;
                  this.field_o = 0;
                  this.c(2779);
                  return true;
                } else {
                  this.j();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (this.field_o >= var1) {
            if (this.field_o <= var1) {
              this.field_q = 0;
              break L2;
            } else {
              this.field_q = -1;
              this.field_A = this.field_o - var1;
              break L2;
            }
          } else {
            this.field_q = 1;
            this.field_A = var1 - this.field_o;
            break L2;
          }
        }
        L3: {
          if (this.field_y >= var2) {
            if (this.field_y <= var2) {
              this.field_v = 0;
              break L3;
            } else {
              L4: {
                this.field_v = -1;
                if (this.field_A == 0) {
                  break L4;
                } else {
                  if (this.field_A <= this.field_y - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_A = this.field_y - var2;
              break L3;
            }
          } else {
            L5: {
              this.field_v = 1;
              if (this.field_A == 0) {
                break L5;
              } else {
                if (this.field_A <= var2 - this.field_y) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            this.field_A = var2 - this.field_y;
            break L3;
          }
        }
        if (this.field_u < var3) {
          this.field_C = 1;
          if (this.field_A != 0) {
            if (this.field_A > var3 - this.field_u) {
              this.field_A = var3 - this.field_u;
              return false;
            } else {
              return false;
            }
          } else {
            this.field_A = var3 - this.field_u;
            return false;
          }
        } else {
          L6: {
            if (this.field_u <= var3) {
              this.field_C = 0;
              break L6;
            } else {
              L7: {
                this.field_C = -1;
                if (this.field_A == 0) {
                  break L7;
                } else {
                  if (this.field_A <= this.field_u - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              this.field_A = this.field_u - var3;
              break L6;
            }
          }
          return false;
        }
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = pp.a(param1, param2);
          var5 = pp.d(param1, param2);
          if (this.field_y == var4) {
            if (this.field_u == var5) {
              this.field_A = 0;
              return;
            } else {
              L0: {
                var6 = param1 - this.field_o;
                if (this.field_o - param1 <= var6) {
                  break L0;
                } else {
                  var6 = this.field_o - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - this.field_y <= var6) {
                  break L1;
                } else {
                  var6 = var4 - this.field_y;
                  break L1;
                }
              }
              L2: {
                if (this.field_y - var4 <= var6) {
                  break L2;
                } else {
                  var6 = this.field_y - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - this.field_u <= var6) {
                  break L3;
                } else {
                  var6 = var5 - this.field_u;
                  break L3;
                }
              }
              L4: {
                if (this.field_u - var5 <= var6) {
                  break L4;
                } else {
                  var6 = this.field_u - var5;
                  break L4;
                }
              }
              L5: {
                if (param0 <= var6) {
                  break L5;
                } else {
                  param0 = var6;
                  break L5;
                }
              }
              this.field_A = param0;
              this.field_x = param1;
              this.field_w = param2;
              this.field_q = (param1 - this.field_o) / param0;
              this.field_v = (var4 - this.field_y) / param0;
              this.field_C = (var5 - this.field_u) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - this.field_o;
              if (this.field_o - param1 <= var6) {
                break L6;
              } else {
                var6 = this.field_o - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - this.field_y <= var6) {
                break L7;
              } else {
                var6 = var4 - this.field_y;
                break L7;
              }
            }
            L8: {
              if (this.field_y - var4 <= var6) {
                break L8;
              } else {
                var6 = this.field_y - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - this.field_u <= var6) {
                break L9;
              } else {
                var6 = var5 - this.field_u;
                break L9;
              }
            }
            L10: {
              if (this.field_u - var5 <= var6) {
                break L10;
              } else {
                var6 = this.field_u - var5;
                break L10;
              }
            }
            L11: {
              if (param0 <= var6) {
                break L11;
              } else {
                param0 = var6;
                break L11;
              }
            }
            this.field_A = param0;
            this.field_x = param1;
            this.field_w = param2;
            this.field_q = (param1 - this.field_o) / param0;
            this.field_v = (var4 - this.field_y) / param0;
            this.field_C = (var5 - this.field_u) / param0;
            return;
          }
        } else {
          this.c(param1, param2);
          return;
        }
    }

    final synchronized void e(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (this.field_y == 0) {
            if (this.field_u == 0) {
              this.field_A = 0;
              this.field_x = 0;
              this.field_o = 0;
              this.c(2779);
              return;
            } else {
              L0: {
                var2 = -this.field_o;
                if (this.field_o <= var2) {
                  break L0;
                } else {
                  var2 = this.field_o;
                  break L0;
                }
              }
              L1: {
                if (-this.field_y <= var2) {
                  break L1;
                } else {
                  var2 = -this.field_y;
                  break L1;
                }
              }
              L2: {
                if (this.field_y <= var2) {
                  break L2;
                } else {
                  var2 = this.field_y;
                  break L2;
                }
              }
              L3: {
                if (-this.field_u <= var2) {
                  break L3;
                } else {
                  var2 = -this.field_u;
                  break L3;
                }
              }
              L4: {
                if (this.field_u <= var2) {
                  break L4;
                } else {
                  var2 = this.field_u;
                  break L4;
                }
              }
              L5: {
                if (param0 <= var2) {
                  break L5;
                } else {
                  param0 = var2;
                  break L5;
                }
              }
              this.field_A = param0;
              this.field_x = -2147483648;
              this.field_q = -this.field_o / param0;
              this.field_v = -this.field_y / param0;
              this.field_C = -this.field_u / param0;
              return;
            }
          } else {
            L6: {
              var2 = -this.field_o;
              if (this.field_o <= var2) {
                break L6;
              } else {
                var2 = this.field_o;
                break L6;
              }
            }
            L7: {
              if (-this.field_y <= var2) {
                break L7;
              } else {
                var2 = -this.field_y;
                break L7;
              }
            }
            L8: {
              if (this.field_y <= var2) {
                break L8;
              } else {
                var2 = this.field_y;
                break L8;
              }
            }
            L9: {
              if (-this.field_u <= var2) {
                break L9;
              } else {
                var2 = -this.field_u;
                break L9;
              }
            }
            L10: {
              if (this.field_u <= var2) {
                break L10;
              } else {
                var2 = this.field_u;
                break L10;
              }
            }
            L11: {
              if (param0 <= var2) {
                break L11;
              } else {
                param0 = var2;
                break L11;
              }
            }
            this.field_A = param0;
            this.field_x = -2147483648;
            this.field_q = -this.field_o / param0;
            this.field_v = -this.field_y / param0;
            this.field_C = -this.field_u / param0;
            return;
          }
        } else {
          this.h(0);
          this.c(2779);
          return;
        }
    }

    private final void j() {
        this.field_o = this.field_x;
        this.field_y = pp.a(this.field_x, this.field_w);
        this.field_u = pp.d(this.field_x, this.field_w);
    }

    final synchronized int f() {
        return this.field_w < 0 ? -1 : this.field_w;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, pp param10, int param11, int param12) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        L0: {
          L1: {
            if (param11 == 0) {
              break L1;
            } else {
              param7 = param5 + (param9 - param4 + param11 - 257) / param11;
              if (param5 + (param9 - param4 + param11 - 257) / param11 <= param8) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param7 = param8;
          break L0;
        }
        L2: while (true) {
          if (param5 >= param7) {
            L3: {
              L4: {
                if (param11 == 0) {
                  break L4;
                } else {
                  param7 = param5 + (param9 - param4 + param11 - 1) / param11;
                  if (param5 + (param9 - param4 + param11 - 1) / param11 <= param8) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param7 = param8;
              break L3;
            }
            param1 = param12;
            L5: while (true) {
              if (param5 >= param7) {
                param10.field_p = param4;
                return param5;
              } else {
                param0 = param2[param4 >> 8];
                incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
                param4 = param4 + param11;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            incrementValue$5 = param5;
            param5++;
            param3[incrementValue$5] = param3[incrementValue$5] + (((param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255)) * param6 >> 6);
            param4 = param4 + param11;
            continue L2;
          }
        }
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, pp param12) {
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        L0: {
          param3 = param3 >> 8;
          param11 = param11 >> 8;
          param5 = param5 << 2;
          param6 = param6 << 2;
          param7 = param7 << 2;
          param8 = param8 << 2;
          param9 = param4 + param11 - param3;
          if (param4 + param11 - param3 <= param10) {
            break L0;
          } else {
            param9 = param10;
            break L0;
          }
        }
        param12.field_o = param12.field_o + param12.field_q * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_y = param5 >> 2;
                param12.field_u = param6 >> 2;
                param12.field_p = param3 << 8;
                return param4 >> 1;
              } else {
                incrementValue$15 = param3;
                param3++;
                param0 = param1[incrementValue$15];
                incrementValue$16 = param4;
                param4++;
                param2[incrementValue$16] = param2[incrementValue$16] + param0 * param5;
                param5 = param5 + param7;
                incrementValue$17 = param4;
                param4++;
                param2[incrementValue$17] = param2[incrementValue$17] + param0 * param6;
                param6 = param6 + param8;
                continue L2;
              }
            }
          } else {
            incrementValue$18 = param3;
            param3++;
            param0 = param1[incrementValue$18];
            incrementValue$19 = param4;
            param4++;
            param2[incrementValue$19] = param2[incrementValue$19] + param0 * param5;
            param5 = param5 + param7;
            incrementValue$20 = param4;
            param4++;
            param2[incrementValue$20] = param2[incrementValue$20] + param0 * param6;
            param6 = param6 + param8;
            incrementValue$21 = param3;
            param3++;
            param0 = param1[incrementValue$21];
            incrementValue$22 = param4;
            param4++;
            param2[incrementValue$22] = param2[incrementValue$22] + param0 * param5;
            param5 = param5 + param7;
            incrementValue$23 = param4;
            param4++;
            param2[incrementValue$23] = param2[incrementValue$23] + param0 * param6;
            param6 = param6 + param8;
            incrementValue$24 = param3;
            param3++;
            param0 = param1[incrementValue$24];
            incrementValue$25 = param4;
            param4++;
            param2[incrementValue$25] = param2[incrementValue$25] + param0 * param5;
            param5 = param5 + param7;
            incrementValue$26 = param4;
            param4++;
            param2[incrementValue$26] = param2[incrementValue$26] + param0 * param6;
            param6 = param6 + param8;
            incrementValue$27 = param3;
            param3++;
            param0 = param1[incrementValue$27];
            incrementValue$28 = param4;
            param4++;
            param2[incrementValue$28] = param2[incrementValue$28] + param0 * param5;
            param5 = param5 + param7;
            incrementValue$29 = param4;
            param4++;
            param2[incrementValue$29] = param2[incrementValue$29] + param0 * param6;
            param6 = param6 + param8;
            continue L1;
          }
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, pp param10, int param11, int param12) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        L0: {
          L1: {
            if (param11 == 0) {
              break L1;
            } else {
              param7 = param5 + (param9 + 256 - param4 + param11) / param11;
              if (param5 + (param9 + 256 - param4 + param11) / param11 <= param8) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param7 = param8;
          break L0;
        }
        L2: while (true) {
          if (param5 >= param7) {
            L3: {
              L4: {
                if (param11 == 0) {
                  break L4;
                } else {
                  param7 = param5 + (param9 - param4 + param11) / param11;
                  if (param5 + (param9 - param4 + param11) / param11 <= param8) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param7 = param8;
              break L3;
            }
            param0 = param12;
            param1 = param11;
            L5: while (true) {
              if (param5 >= param7) {
                param10.field_p = param4;
                return param5;
              } else {
                incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
                param4 = param4 + param1;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            incrementValue$5 = param5;
            param5++;
            param3[incrementValue$5] = param3[incrementValue$5] + (((param0 << 8) + (param2[param1] - param0) * (param4 & 255)) * param6 >> 6);
            param4 = param4 + param11;
            continue L2;
          }
        }
    }

    private final static int d(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, pp param13, int param14, int param15) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        L0: {
          L1: {
            param13.field_o = param13.field_o - param13.field_q * param5;
            if (param14 == 0) {
              break L1;
            } else {
              param10 = param5 + (param12 + 256 - param4 + param14) / param14;
              if (param5 + (param12 + 256 - param4 + param14) / param14 <= param11) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param10 = param11;
          break L0;
        }
        param5 = param5 << 1;
        param10 = param10 << 1;
        L2: while (true) {
          if (param5 >= param10) {
            L3: {
              L4: {
                if (param14 == 0) {
                  break L4;
                } else {
                  param10 = (param5 >> 1) + (param12 - param4 + param14) / param14;
                  if ((param5 >> 1) + (param12 - param4 + param14) / param14 <= param11) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param10 = param11;
              break L3;
            }
            param10 = param10 << 1;
            param1 = param15;
            L5: while (true) {
              if (param5 >= param10) {
                param5 = param5 >> 1;
                param13.field_o = param13.field_o + param13.field_q * param5;
                param13.field_y = param6;
                param13.field_u = param7;
                param13.field_p = param4;
                return param5;
              } else {
                param0 = (param1 << 8) + (param2[param4 >> 8] - param1) * (param4 & 255);
                incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
                param6 = param6 + param8;
                incrementValue$5 = param5;
                param5++;
                param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
                param7 = param7 + param9;
                param4 = param4 + param14;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            param0 = (param0 << 8) + (param2[param1] - param0) * (param4 & 255);
            incrementValue$6 = param5;
            param5++;
            param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
            param6 = param6 + param8;
            incrementValue$7 = param5;
            param5++;
            param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
            param7 = param7 + param9;
            param4 = param4 + param14;
            continue L2;
          }
        }
    }

    final sj b() {
        return null;
    }

    final synchronized void a(boolean param0) {
        this.field_B = (this.field_B ^ this.field_B >> 31) + (this.field_B >>> 31);
        if (param0) {
          this.field_B = -this.field_B;
          return;
        } else {
          return;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        sp var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (this.field_x != 0) {
            break L0;
          } else {
            if (this.field_A != 0) {
              break L0;
            } else {
              this.a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (sp) ((Object) this.field_k);
          var5 = this.field_r << 8;
          var6 = this.field_t << 8;
          var7 = var4.field_n.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            this.field_s = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (this.field_p >= 0) {
            break L2;
          } else {
            if (this.field_B <= 0) {
              this.l();
              this.c(2779);
              return;
            } else {
              this.field_p = 0;
              break L2;
            }
          }
        }
        L3: {
          if (this.field_p < var7) {
            break L3;
          } else {
            if (this.field_B >= 0) {
              this.l();
              this.c(2779);
              return;
            } else {
              this.field_p = var7 - 1;
              break L3;
            }
          }
        }
        if (this.field_s >= 0) {
          L4: {
            if (this.field_s <= 0) {
              break L4;
            } else {
              if (!this.field_z) {
                if (this.field_B >= 0) {
                  L5: while (true) {
                    var9 = this.b(param0, var9, var6, param2, (int) var4.field_n[this.field_r]);
                    if (this.field_p >= var6) {
                      var10 = (this.field_p - var5) / var8;
                      if (var10 < this.field_s) {
                        this.field_p = this.field_p - var8 * var10;
                        this.field_s = this.field_s - var10;
                        continue L5;
                      } else {
                        this.field_p = this.field_p - var8 * this.field_s;
                        this.field_s = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[this.field_t - 1]);
                    if (this.field_p < var5) {
                      var10 = (var6 - 1 - this.field_p) / var8;
                      if (var10 < this.field_s) {
                        this.field_p = this.field_p + var8 * var10;
                        this.field_s = this.field_s - var10;
                        continue L6;
                      } else {
                        this.field_p = this.field_p + var8 * this.field_s;
                        this.field_s = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (this.field_B >= 0) {
                    break L7;
                  } else {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[this.field_r]);
                    if (this.field_p < var5) {
                      this.field_p = var5 + var5 - 1 - this.field_p;
                      this.field_B = -this.field_B;
                      fieldTemp$5 = this.field_s - 1;
                      this.field_s = this.field_s - 1;
                      if (fieldTemp$5 != 0) {
                        break L7;
                      } else {
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
                L8: while (true) {
                  var9 = this.b(param0, var9, var6, param2, (int) var4.field_n[this.field_t - 1]);
                  if (this.field_p >= var6) {
                    this.field_p = var6 + var6 - 1 - this.field_p;
                    this.field_B = -this.field_B;
                    fieldTemp$6 = this.field_s - 1;
                    this.field_s = this.field_s - 1;
                    if (fieldTemp$6 != 0) {
                      var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[this.field_r]);
                      if (this.field_p < var5) {
                        this.field_p = var5 + var5 - 1 - this.field_p;
                        this.field_B = -this.field_B;
                        fieldTemp$7 = this.field_s - 1;
                        this.field_s = this.field_s - 1;
                        if (fieldTemp$7 != 0) {
                          continue L8;
                        } else {
                          break L4;
                        }
                      } else {
                        return;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          if (this.field_B < 0) {
            discarded$8 = this.a(param0, var9, 0, param2, 0);
            if (this.field_p < 0) {
              this.field_p = -1;
              this.l();
              this.c(2779);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              discarded$9 = this.b(param0, var9, var7, param2, 0);
              if (this.field_p < var7) {
                break L9;
              } else {
                this.field_p = var7;
                this.l();
                this.c(2779);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!this.field_z) {
            if (this.field_B >= 0) {
              L10: while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_n[this.field_r]);
                if (this.field_p >= var6) {
                  this.field_p = var5 + (this.field_p - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[this.field_t - 1]);
                if (this.field_p < var5) {
                  this.field_p = var6 - 1 - (var6 - 1 - this.field_p) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (this.field_B >= 0) {
                break L12;
              } else {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[this.field_r]);
                if (this.field_p < var5) {
                  this.field_p = var5 + var5 - 1 - this.field_p;
                  this.field_B = -this.field_B;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.b(param0, var9, var6, param2, (int) var4.field_n[this.field_t - 1]);
              if (this.field_p >= var6) {
                this.field_p = var6 + var6 - 1 - this.field_p;
                this.field_B = -this.field_B;
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[this.field_r]);
                if (this.field_p < var5) {
                  this.field_p = var5 + var5 - 1 - this.field_p;
                  this.field_B = -this.field_B;
                  continue L13;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, pp param8) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param2 - (param7 - 1);
        if (param3 + param2 - (param7 - 1) > param6) {
            param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
            incrementValue$0 = param3;
            param3++;
            incrementValue$1 = param2;
            param2--;
            param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
            incrementValue$2 = param3;
            param3++;
            incrementValue$3 = param2;
            param2--;
            param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
            incrementValue$4 = param3;
            param3++;
            incrementValue$5 = param2;
            param2--;
            param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
            incrementValue$6 = param3;
            param3++;
            incrementValue$7 = param2;
            param2--;
            param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
            incrementValue$8 = param3;
            param3++;
            incrementValue$9 = param2;
            param2--;
            param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
        }
        param8.field_p = param2 << 8;
        return param3;
    }

    final sj d() {
        return null;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, pp param9) {
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        L0: {
          param2 = param2 >> 8;
          param8 = param8 >> 8;
          param4 = param4 << 2;
          param5 = param5 << 2;
          param6 = param3 + param2 - (param8 - 1);
          if (param3 + param2 - (param8 - 1) <= param7) {
            break L0;
          } else {
            param6 = param7;
            break L0;
          }
        }
        param9.field_y = param9.field_y + param9.field_v * (param6 - param3);
        param9.field_u = param9.field_u + param9.field_C * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_o = param4 >> 2;
                param9.field_p = param2 << 8;
                return param3;
              } else {
                incrementValue$10 = param3;
                param3++;
                incrementValue$11 = param2;
                param2--;
                param1[incrementValue$10] = param1[incrementValue$10] + param0[incrementValue$11] * param4;
                param4 = param4 + param5;
                continue L2;
              }
            }
          } else {
            incrementValue$12 = param3;
            param3++;
            incrementValue$13 = param2;
            param2--;
            param1[incrementValue$12] = param1[incrementValue$12] + param0[incrementValue$13] * param4;
            param4 = param4 + param5;
            incrementValue$14 = param3;
            param3++;
            incrementValue$15 = param2;
            param2--;
            param1[incrementValue$14] = param1[incrementValue$14] + param0[incrementValue$15] * param4;
            param4 = param4 + param5;
            incrementValue$16 = param3;
            param3++;
            incrementValue$17 = param2;
            param2--;
            param1[incrementValue$16] = param1[incrementValue$16] + param0[incrementValue$17] * param4;
            param4 = param4 + param5;
            incrementValue$18 = param3;
            param3++;
            incrementValue$19 = param2;
            param2--;
            param1[incrementValue$18] = param1[incrementValue$18] + param0[incrementValue$19] * param4;
            param4 = param4 + param5;
            continue L1;
          }
        }
    }

    private pp(sp param0, int param1, int param2) {
        this.field_k = (tb) ((Object) param0);
        this.field_r = param0.field_l;
        this.field_t = param0.field_p;
        this.field_z = param0.field_m;
        this.field_B = param1;
        this.field_x = param2;
        this.field_w = 8192;
        this.field_p = 0;
        this.j();
    }

    private pp(sp param0, int param1, int param2, int param3) {
        this.field_k = (tb) ((Object) param0);
        this.field_r = param0.field_l;
        this.field_t = param0.field_p;
        this.field_z = param0.field_m;
        this.field_B = param1;
        this.field_x = param2;
        this.field_w = param3;
        this.field_p = 0;
        this.j();
    }
}
