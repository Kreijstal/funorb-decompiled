/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj extends gq {
    private int field_r;
    private int field_n;
    private int field_o;
    private int field_x;
    private int field_m;
    private int field_q;
    private int field_l;
    private int field_k;
    private int field_w;
    private boolean field_u;
    private int field_v;
    private int field_s;
    private int field_j;
    private int field_t;
    private int field_p;

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, uj param9) {
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
        param9.field_s = param9.field_s + param9.field_j * (param6 - param3);
        param9.field_n = param9.field_n + param9.field_q * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_l = param4 >> 2;
                param9.field_t = param2 << 8;
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

    private final void e() {
        if (this.field_x != 0) {
            if (this.field_v == -2147483648) {
                this.field_v = 0;
            }
            this.field_x = 0;
            this.i();
            return;
        }
    }

    final int c() {
        int var1 = this.field_l * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.field_p == 0) {
            var1 = var1 - var1 * this.field_t / (((jd) ((Object) this.field_i)).field_h.length << 8);
        } else {
            if (this.field_p >= 0) {
                var1 = var1 - var1 * this.field_w / ((jd) ((Object) this.field_i)).field_h.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    final int a() {
        if (this.field_v == 0) {
            if (this.field_x == 0) {
                return 0;
            }
        }
        return 1;
    }

    final gq b() {
        return null;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, uj param10, int param11, int param12) {
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
                param10.field_t = param4;
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

    final static uj a(jd param0, int param1, int param2, int param3) {
        if (param0.field_h != null) {
          if (param0.field_h.length == 0) {
            return null;
          } else {
            return new uj(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    final synchronized void f(int param0) {
        this.b(this.h(), param0 << 6);
    }

    final synchronized void h(int param0) {
        this.b(param0 << 6, this.g());
    }

    final static uj a(jd param0, int param1, int param2) {
        if (param0.field_h != null) {
          if (param0.field_h.length == 0) {
            return null;
          } else {
            return new uj(param0, (int)((long)param0.field_g * 256L * (long)param1 / (long)(100 * gp.field_p)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, uj param13, int param14, int param15) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        L0: {
          L1: {
            param13.field_l = param13.field_l - param13.field_r * param5;
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
                param13.field_l = param13.field_l + param13.field_r * param5;
                param13.field_s = param6;
                param13.field_n = param7;
                param13.field_t = param4;
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, uj param10, int param11, int param12) {
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
                param10.field_t = param4;
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

    private final static int d(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    final synchronized boolean k() {
        return this.field_t < 0 || this.field_t >= ((jd) ((Object) this.field_i)).field_h.length << 8;
    }

    private final synchronized void b(int param0, int param1) {
        this.field_v = param0;
        this.field_m = param1;
        this.field_x = 0;
        this.i();
    }

    final synchronized void a(int param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        jd var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (this.field_x <= 0) {
            break L0;
          } else {
            if (param0 < this.field_x) {
              this.field_l = this.field_l + this.field_r * param0;
              this.field_s = this.field_s + this.field_j * param0;
              this.field_n = this.field_n + this.field_q * param0;
              this.field_x = this.field_x - param0;
              break L0;
            } else {
              L1: {
                if (this.field_v != -2147483648) {
                  break L1;
                } else {
                  this.field_v = 0;
                  this.field_n = 0;
                  this.field_s = 0;
                  this.field_l = 0;
                  this.a(true);
                  param0 = this.field_x;
                  break L1;
                }
              }
              this.field_x = 0;
              this.i();
              break L0;
            }
          }
        }
        L2: {
          var2 = (jd) ((Object) this.field_i);
          var3 = this.field_w << 8;
          var4 = this.field_o << 8;
          var5 = var2.field_h.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            this.field_p = 0;
            break L2;
          }
        }
        L3: {
          if (this.field_t >= 0) {
            break L3;
          } else {
            if (this.field_k <= 0) {
              this.e();
              this.a(true);
              return;
            } else {
              this.field_t = 0;
              break L3;
            }
          }
        }
        L4: {
          if (this.field_t < var5) {
            break L4;
          } else {
            if (this.field_k >= 0) {
              this.e();
              this.a(true);
              return;
            } else {
              this.field_t = var5 - 1;
              break L4;
            }
          }
        }
        this.field_t = this.field_t + this.field_k * param0;
        if (this.field_p >= 0) {
          L5: {
            if (this.field_p <= 0) {
              break L5;
            } else {
              if (!this.field_u) {
                L6: {
                  if (this.field_k >= 0) {
                    if (this.field_t >= var4) {
                      var7 = (this.field_t - var3) / var6;
                      if (var7 < this.field_p) {
                        this.field_t = this.field_t - var6 * var7;
                        this.field_p = this.field_p - var7;
                        break L6;
                      } else {
                        this.field_t = this.field_t - var6 * this.field_p;
                        this.field_p = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (this.field_t < var3) {
                      var7 = (var4 - 1 - this.field_t) / var6;
                      if (var7 < this.field_p) {
                        this.field_t = this.field_t + var6 * var7;
                        this.field_p = this.field_p - var7;
                        break L6;
                      } else {
                        this.field_t = this.field_t + var6 * this.field_p;
                        this.field_p = 0;
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
                  if (this.field_k >= 0) {
                    break L7;
                  } else {
                    if (this.field_t < var3) {
                      this.field_t = var3 + var3 - 1 - this.field_t;
                      this.field_k = -this.field_k;
                      fieldTemp$3 = this.field_p - 1;
                      this.field_p = this.field_p - 1;
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
                  if (this.field_t >= var4) {
                    this.field_t = var4 + var4 - 1 - this.field_t;
                    this.field_k = -this.field_k;
                    fieldTemp$4 = this.field_p - 1;
                    this.field_p = this.field_p - 1;
                    if (fieldTemp$4 != 0) {
                      if (this.field_t < var3) {
                        this.field_t = var3 + var3 - 1 - this.field_t;
                        this.field_k = -this.field_k;
                        fieldTemp$5 = this.field_p - 1;
                        this.field_p = this.field_p - 1;
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
          if (this.field_k < 0) {
            if (this.field_t < 0) {
              this.field_t = -1;
              this.e();
              this.a(true);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (this.field_t < var5) {
                break L9;
              } else {
                this.field_t = var5;
                this.e();
                this.a(true);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!this.field_u) {
            if (this.field_k >= 0) {
              if (this.field_t < var4) {
                return;
              } else {
                this.field_t = var3 + (this.field_t - var3) % var6;
                return;
              }
            } else {
              if (this.field_t < var3) {
                this.field_t = var4 - 1 - (var4 - 1 - this.field_t) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (this.field_k >= 0) {
                break L10;
              } else {
                if (this.field_t < var3) {
                  this.field_t = var3 + var3 - 1 - this.field_t;
                  this.field_k = -this.field_k;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (this.field_t >= var4) {
                this.field_t = var4 + var4 - 1 - this.field_t;
                this.field_k = -this.field_k;
                if (this.field_t < var3) {
                  this.field_t = var3 + var3 - 1 - this.field_t;
                  this.field_k = -this.field_k;
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

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, uj param11, int param12, int param13) {
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
                param11.field_t = param4;
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

    final synchronized boolean j() {
        return this.field_x != 0;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, uj param11, int param12, int param13) {
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
                param11.field_t = param4;
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, uj param10) {
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
                param10.field_t = param3 << 8;
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

    final synchronized void b(int[] param0, int param1, int param2) {
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        jd var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (this.field_v != 0) {
            break L0;
          } else {
            if (this.field_x != 0) {
              break L0;
            } else {
              this.a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (jd) ((Object) this.field_i);
          var5 = this.field_w << 8;
          var6 = this.field_o << 8;
          var7 = var4.field_h.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            this.field_p = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (this.field_t >= 0) {
            break L2;
          } else {
            if (this.field_k <= 0) {
              this.e();
              this.a(true);
              return;
            } else {
              this.field_t = 0;
              break L2;
            }
          }
        }
        L3: {
          if (this.field_t < var7) {
            break L3;
          } else {
            if (this.field_k >= 0) {
              this.e();
              this.a(true);
              return;
            } else {
              this.field_t = var7 - 1;
              break L3;
            }
          }
        }
        if (this.field_p >= 0) {
          L4: {
            if (this.field_p <= 0) {
              break L4;
            } else {
              if (!this.field_u) {
                if (this.field_k >= 0) {
                  L5: while (true) {
                    var9 = this.a(param0, var9, var6, param2, (int) var4.field_h[this.field_w]);
                    if (this.field_t >= var6) {
                      var10 = (this.field_t - var5) / var8;
                      if (var10 < this.field_p) {
                        this.field_t = this.field_t - var8 * var10;
                        this.field_p = this.field_p - var10;
                        continue L5;
                      } else {
                        this.field_t = this.field_t - var8 * this.field_p;
                        this.field_p = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_h[this.field_o - 1]);
                    if (this.field_t < var5) {
                      var10 = (var6 - 1 - this.field_t) / var8;
                      if (var10 < this.field_p) {
                        this.field_t = this.field_t + var8 * var10;
                        this.field_p = this.field_p - var10;
                        continue L6;
                      } else {
                        this.field_t = this.field_t + var8 * this.field_p;
                        this.field_p = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (this.field_k >= 0) {
                    break L7;
                  } else {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_h[this.field_w]);
                    if (this.field_t < var5) {
                      this.field_t = var5 + var5 - 1 - this.field_t;
                      this.field_k = -this.field_k;
                      fieldTemp$5 = this.field_p - 1;
                      this.field_p = this.field_p - 1;
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
                  var9 = this.a(param0, var9, var6, param2, (int) var4.field_h[this.field_o - 1]);
                  if (this.field_t >= var6) {
                    this.field_t = var6 + var6 - 1 - this.field_t;
                    this.field_k = -this.field_k;
                    fieldTemp$6 = this.field_p - 1;
                    this.field_p = this.field_p - 1;
                    if (fieldTemp$6 != 0) {
                      var9 = this.b(param0, var9, var5, param2, (int) var4.field_h[this.field_w]);
                      if (this.field_t < var5) {
                        this.field_t = var5 + var5 - 1 - this.field_t;
                        this.field_k = -this.field_k;
                        fieldTemp$7 = this.field_p - 1;
                        this.field_p = this.field_p - 1;
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
          if (this.field_k < 0) {
            discarded$8 = this.b(param0, var9, 0, param2, 0);
            if (this.field_t < 0) {
              this.field_t = -1;
              this.e();
              this.a(true);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              discarded$9 = this.a(param0, var9, var7, param2, 0);
              if (this.field_t < var7) {
                break L9;
              } else {
                this.field_t = var7;
                this.e();
                this.a(true);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!this.field_u) {
            if (this.field_k >= 0) {
              L10: while (true) {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_h[this.field_w]);
                if (this.field_t >= var6) {
                  this.field_t = var5 + (this.field_t - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_h[this.field_o - 1]);
                if (this.field_t < var5) {
                  this.field_t = var6 - 1 - (var6 - 1 - this.field_t) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (this.field_k >= 0) {
                break L12;
              } else {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_h[this.field_w]);
                if (this.field_t < var5) {
                  this.field_t = var5 + var5 - 1 - this.field_t;
                  this.field_k = -this.field_k;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.a(param0, var9, var6, param2, (int) var4.field_h[this.field_o - 1]);
              if (this.field_t >= var6) {
                this.field_t = var6 + var6 - 1 - this.field_t;
                this.field_k = -this.field_k;
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_h[this.field_w]);
                if (this.field_t < var5) {
                  this.field_t = var5 + var5 - 1 - this.field_t;
                  this.field_k = -this.field_k;
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

    final synchronized int h() {
        return this.field_v == -2147483648 ? 0 : this.field_v;
    }

    final synchronized void a(int param0, int param1) {
        this.a(param0, param1, this.g());
    }

    final synchronized int g() {
        return this.field_m < 0 ? -1 : this.field_m;
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, uj param11, int param12, int param13) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        L0: {
          L1: {
            param11.field_s = param11.field_s - param11.field_j * param5;
            param11.field_n = param11.field_n - param11.field_q * param5;
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
                param11.field_s = param11.field_s + param11.field_j * param5;
                param11.field_n = param11.field_n + param11.field_q * param5;
                param11.field_l = param6;
                param11.field_t = param4;
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

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, uj param8) {
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
        param8.field_t = param2 << 8;
        return param3;
    }

    final synchronized int l() {
        return this.field_k < 0 ? -this.field_k : this.field_k;
    }

    final synchronized void d(int param0) {
        this.b(param0, this.g());
    }

    private final static int c(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final synchronized void b(boolean param0) {
        this.field_k = (this.field_k ^ this.field_k >> 31) + (this.field_k >>> 31);
        if (param0) {
          this.field_k = -this.field_k;
          return;
        } else {
          return;
        }
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, uj param9) {
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
        param9.field_s = param9.field_s + param9.field_j * (param6 - param3);
        param9.field_n = param9.field_n + param9.field_q * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_l = param4 >> 2;
                param9.field_t = param2 << 8;
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

    final synchronized void c(int param0) {
        int var2 = ((jd) ((Object) this.field_i)).field_h.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        this.field_t = param0;
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = uj.c(param1, param2);
          var5 = uj.d(param1, param2);
          if (this.field_s == var4) {
            if (this.field_n == var5) {
              this.field_x = 0;
              return;
            } else {
              L0: {
                var6 = param1 - this.field_l;
                if (this.field_l - param1 <= var6) {
                  break L0;
                } else {
                  var6 = this.field_l - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - this.field_s <= var6) {
                  break L1;
                } else {
                  var6 = var4 - this.field_s;
                  break L1;
                }
              }
              L2: {
                if (this.field_s - var4 <= var6) {
                  break L2;
                } else {
                  var6 = this.field_s - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - this.field_n <= var6) {
                  break L3;
                } else {
                  var6 = var5 - this.field_n;
                  break L3;
                }
              }
              L4: {
                if (this.field_n - var5 <= var6) {
                  break L4;
                } else {
                  var6 = this.field_n - var5;
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
              this.field_x = param0;
              this.field_v = param1;
              this.field_m = param2;
              this.field_r = (param1 - this.field_l) / param0;
              this.field_j = (var4 - this.field_s) / param0;
              this.field_q = (var5 - this.field_n) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - this.field_l;
              if (this.field_l - param1 <= var6) {
                break L6;
              } else {
                var6 = this.field_l - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - this.field_s <= var6) {
                break L7;
              } else {
                var6 = var4 - this.field_s;
                break L7;
              }
            }
            L8: {
              if (this.field_s - var4 <= var6) {
                break L8;
              } else {
                var6 = this.field_s - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - this.field_n <= var6) {
                break L9;
              } else {
                var6 = var5 - this.field_n;
                break L9;
              }
            }
            L10: {
              if (this.field_n - var5 <= var6) {
                break L10;
              } else {
                var6 = this.field_n - var5;
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
            this.field_x = param0;
            this.field_v = param1;
            this.field_m = param2;
            this.field_r = (param1 - this.field_l) / param0;
            this.field_j = (var4 - this.field_s) / param0;
            this.field_q = (var5 - this.field_n) / param0;
            return;
          }
        } else {
          this.b(param1, param2);
          return;
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, uj param13, int param14, int param15) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        L0: {
          L1: {
            param13.field_l = param13.field_l - param13.field_r * param5;
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
                param13.field_l = param13.field_l + param13.field_r * param5;
                param13.field_s = param6;
                param13.field_n = param7;
                param13.field_t = param4;
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

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (this.field_x <= 0) {
            L1: {
              if (this.field_k != -256) {
                break L1;
              } else {
                if ((this.field_t & 255) != 0) {
                  break L1;
                } else {
                  if (gp.field_j) {
                    return uj.b(0, ((jd) ((Object) this.field_i)).field_h, param0, this.field_t, param1, this.field_s, this.field_n, 0, param3, param2, (uj) (this));
                  } else {
                    return uj.b(((jd) ((Object) this.field_i)).field_h, param0, this.field_t, param1, this.field_l, 0, param3, param2, (uj) (this));
                  }
                }
              }
            }
            if (gp.field_j) {
              return uj.d(0, 0, ((jd) ((Object) this.field_i)).field_h, param0, this.field_t, param1, this.field_s, this.field_n, 0, param3, param2, (uj) (this), this.field_k, param4);
            } else {
              return uj.b(0, 0, ((jd) ((Object) this.field_i)).field_h, param0, this.field_t, param1, this.field_l, 0, param3, param2, (uj) (this), this.field_k, param4);
            }
          } else {
            L2: {
              var6 = param1 + this.field_x;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                this.field_x = this.field_x + param1;
                if (this.field_k != -256) {
                  break L4;
                } else {
                  if ((this.field_t & 255) != 0) {
                    break L4;
                  } else {
                    if (!gp.field_j) {
                      param1 = uj.a(((jd) ((Object) this.field_i)).field_h, param0, this.field_t, param1, this.field_l, this.field_r, 0, var6, param2, (uj) (this));
                      break L3;
                    } else {
                      param1 = uj.a(0, ((jd) ((Object) this.field_i)).field_h, param0, this.field_t, param1, this.field_s, this.field_n, this.field_j, this.field_q, 0, var6, param2, (uj) (this));
                      break L3;
                    }
                  }
                }
              }
              if (!gp.field_j) {
                param1 = uj.b(0, 0, ((jd) ((Object) this.field_i)).field_h, param0, this.field_t, param1, this.field_l, this.field_r, 0, var6, param2, (uj) (this), this.field_k, param4);
                break L3;
              } else {
                param1 = uj.a(0, 0, ((jd) ((Object) this.field_i)).field_h, param0, this.field_t, param1, this.field_s, this.field_n, this.field_j, this.field_q, 0, var6, param2, (uj) (this), this.field_k, param4);
                break L3;
              }
            }
            this.field_x = this.field_x - param1;
            if (this.field_x == 0) {
              if (!this.f()) {
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

    private final boolean f() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = this.field_v;
          if (var1 != -2147483648) {
            var2 = uj.c(var1, this.field_m);
            var3 = uj.d(var1, this.field_m);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (this.field_l != var1) {
            break L1;
          } else {
            if (this.field_s != var2) {
              break L1;
            } else {
              if (this.field_n == var3) {
                if (this.field_v == -2147483648) {
                  this.field_v = 0;
                  this.field_n = 0;
                  this.field_s = 0;
                  this.field_l = 0;
                  this.a(true);
                  return true;
                } else {
                  this.i();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (this.field_l >= var1) {
            if (this.field_l <= var1) {
              this.field_r = 0;
              break L2;
            } else {
              this.field_r = -1;
              this.field_x = this.field_l - var1;
              break L2;
            }
          } else {
            this.field_r = 1;
            this.field_x = var1 - this.field_l;
            break L2;
          }
        }
        L3: {
          if (this.field_s >= var2) {
            if (this.field_s <= var2) {
              this.field_j = 0;
              break L3;
            } else {
              L4: {
                this.field_j = -1;
                if (this.field_x == 0) {
                  break L4;
                } else {
                  if (this.field_x <= this.field_s - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_x = this.field_s - var2;
              break L3;
            }
          } else {
            L5: {
              this.field_j = 1;
              if (this.field_x == 0) {
                break L5;
              } else {
                if (this.field_x <= var2 - this.field_s) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            this.field_x = var2 - this.field_s;
            break L3;
          }
        }
        if (this.field_n < var3) {
          this.field_q = 1;
          if (this.field_x != 0) {
            if (this.field_x > var3 - this.field_n) {
              this.field_x = var3 - this.field_n;
              return false;
            } else {
              return false;
            }
          } else {
            this.field_x = var3 - this.field_n;
            return false;
          }
        } else {
          L6: {
            if (this.field_n <= var3) {
              this.field_q = 0;
              break L6;
            } else {
              L7: {
                this.field_q = -1;
                if (this.field_x == 0) {
                  break L7;
                } else {
                  if (this.field_x <= this.field_n - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              this.field_x = this.field_n - var3;
              break L6;
            }
          }
          return false;
        }
    }

    final gq d() {
        return null;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (this.field_x <= 0) {
            L1: {
              if (this.field_k != 256) {
                break L1;
              } else {
                if ((this.field_t & 255) != 0) {
                  break L1;
                } else {
                  if (gp.field_j) {
                    return uj.a(0, ((jd) ((Object) this.field_i)).field_h, param0, this.field_t, param1, this.field_s, this.field_n, 0, param3, param2, (uj) (this));
                  } else {
                    return uj.a(((jd) ((Object) this.field_i)).field_h, param0, this.field_t, param1, this.field_l, 0, param3, param2, (uj) (this));
                  }
                }
              }
            }
            if (gp.field_j) {
              return uj.a(0, 0, ((jd) ((Object) this.field_i)).field_h, param0, this.field_t, param1, this.field_s, this.field_n, 0, param3, param2, (uj) (this), this.field_k, param4);
            } else {
              return uj.a(0, 0, ((jd) ((Object) this.field_i)).field_h, param0, this.field_t, param1, this.field_l, 0, param3, param2, (uj) (this), this.field_k, param4);
            }
          } else {
            L2: {
              var6 = param1 + this.field_x;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                this.field_x = this.field_x + param1;
                if (this.field_k != 256) {
                  break L4;
                } else {
                  if ((this.field_t & 255) != 0) {
                    break L4;
                  } else {
                    if (!gp.field_j) {
                      param1 = uj.b(((jd) ((Object) this.field_i)).field_h, param0, this.field_t, param1, this.field_l, this.field_r, 0, var6, param2, (uj) (this));
                      break L3;
                    } else {
                      param1 = uj.b(0, ((jd) ((Object) this.field_i)).field_h, param0, this.field_t, param1, this.field_s, this.field_n, this.field_j, this.field_q, 0, var6, param2, (uj) (this));
                      break L3;
                    }
                  }
                }
              }
              if (!gp.field_j) {
                param1 = uj.c(0, 0, ((jd) ((Object) this.field_i)).field_h, param0, this.field_t, param1, this.field_l, this.field_r, 0, var6, param2, (uj) (this), this.field_k, param4);
                break L3;
              } else {
                param1 = uj.b(0, 0, ((jd) ((Object) this.field_i)).field_h, param0, this.field_t, param1, this.field_s, this.field_n, this.field_j, this.field_q, 0, var6, param2, (uj) (this), this.field_k, param4);
                break L3;
              }
            }
            this.field_x = this.field_x - param1;
            if (this.field_x == 0) {
              if (!this.f()) {
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

    private final void i() {
        this.field_l = this.field_v;
        this.field_s = uj.c(this.field_v, this.field_m);
        this.field_n = uj.d(this.field_v, this.field_m);
    }

    final synchronized void e(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (this.field_s == 0) {
            if (this.field_n == 0) {
              this.field_x = 0;
              this.field_v = 0;
              this.field_l = 0;
              this.a(true);
              return;
            } else {
              L0: {
                var2 = -this.field_l;
                if (this.field_l <= var2) {
                  break L0;
                } else {
                  var2 = this.field_l;
                  break L0;
                }
              }
              L1: {
                if (-this.field_s <= var2) {
                  break L1;
                } else {
                  var2 = -this.field_s;
                  break L1;
                }
              }
              L2: {
                if (this.field_s <= var2) {
                  break L2;
                } else {
                  var2 = this.field_s;
                  break L2;
                }
              }
              L3: {
                if (-this.field_n <= var2) {
                  break L3;
                } else {
                  var2 = -this.field_n;
                  break L3;
                }
              }
              L4: {
                if (this.field_n <= var2) {
                  break L4;
                } else {
                  var2 = this.field_n;
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
              this.field_x = param0;
              this.field_v = -2147483648;
              this.field_r = -this.field_l / param0;
              this.field_j = -this.field_s / param0;
              this.field_q = -this.field_n / param0;
              return;
            }
          } else {
            L6: {
              var2 = -this.field_l;
              if (this.field_l <= var2) {
                break L6;
              } else {
                var2 = this.field_l;
                break L6;
              }
            }
            L7: {
              if (-this.field_s <= var2) {
                break L7;
              } else {
                var2 = -this.field_s;
                break L7;
              }
            }
            L8: {
              if (this.field_s <= var2) {
                break L8;
              } else {
                var2 = this.field_s;
                break L8;
              }
            }
            L9: {
              if (-this.field_n <= var2) {
                break L9;
              } else {
                var2 = -this.field_n;
                break L9;
              }
            }
            L10: {
              if (this.field_n <= var2) {
                break L10;
              } else {
                var2 = this.field_n;
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
            this.field_x = param0;
            this.field_v = -2147483648;
            this.field_r = -this.field_l / param0;
            this.field_j = -this.field_s / param0;
            this.field_q = -this.field_n / param0;
            return;
          }
        } else {
          this.d(0);
          this.a(true);
          return;
        }
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, uj param12) {
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
        param12.field_l = param12.field_l + param12.field_r * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_s = param5 >> 2;
                param12.field_n = param6 >> 2;
                param12.field_t = param3 << 8;
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

    final synchronized void i(int param0) {
        if (this.field_k < 0) {
            this.field_k = -param0;
        } else {
            this.field_k = param0;
        }
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, uj param10) {
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
                param10.field_t = param3 << 8;
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

    final synchronized void g(int param0) {
        this.field_p = param0;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, uj param11, int param12, int param13) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        L0: {
          L1: {
            param11.field_s = param11.field_s - param11.field_j * param5;
            param11.field_n = param11.field_n - param11.field_q * param5;
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
                param11.field_s = param11.field_s + param11.field_j * param5;
                param11.field_n = param11.field_n + param11.field_q * param5;
                param11.field_l = param6;
                param11.field_t = param4;
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

    private uj(jd param0, int param1, int param2) {
        this.field_i = (lg) ((Object) param0);
        this.field_w = param0.field_j;
        this.field_o = param0.field_k;
        this.field_u = param0.field_i;
        this.field_k = param1;
        this.field_v = param2;
        this.field_m = 8192;
        this.field_t = 0;
        this.i();
    }

    private uj(jd param0, int param1, int param2, int param3) {
        this.field_i = (lg) ((Object) param0);
        this.field_w = param0.field_j;
        this.field_o = param0.field_k;
        this.field_u = param0.field_i;
        this.field_k = param1;
        this.field_v = param2;
        this.field_m = param3;
        this.field_t = 0;
        this.i();
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, uj param8) {
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
        param8.field_t = param2 << 8;
        return param3;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, uj param12) {
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
        param12.field_l = param12.field_l + param12.field_r * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_s = param5 >> 2;
                param12.field_n = param6 >> 2;
                param12.field_t = param3 << 8;
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
}
