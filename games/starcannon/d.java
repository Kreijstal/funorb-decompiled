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
        int var3 = this.field_d + param0 / 16;
        ki.c(var3, this.field_q, 5, 0, param1);
        ki.c(var3, this.field_q, 4, 0, 128);
        ki.c(var3, this.field_q, 3, 0, 128);
    }

    d(int param0, int param1, int param2, int param3) {
        this(param0 - 3, param1 - 3, 0, 0, 0, param3, param2, 0);
        this.field_j = 0;
    }

    final d a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        Object var8;
        Object var9;
        Object var10;
        Object var11;
        Object var12;
        Object var13;
        int var5Lifetime1;
        var7 = StarCannon.field_A;
        var2 = 61 % ((param0 - 15) / 43);
        this.field_f = sh.b(43, 14);
        var6 = this.field_h;
        if (1 != var6 &&
          var6 != 2 &&
          var6 != 3) {
          if (var6 == 0) {
            this.field_k = this.field_k + (Math.abs(this.field_j) >> 4);
            this.field_g = this.field_g + (Math.abs(this.field_e) >> 4);
            if (this.field_g > 32) {
              if (0 > this.field_e) {
                this.field_q = this.field_q - (this.field_g >> 5);
              }
              if (this.field_e > 0) {
                this.field_q = this.field_q + (this.field_g >> 5);
              }
              this.field_g = this.field_g & 31;
            }
            this.field_p = this.field_p - 4;
            if (this.field_k > 32) {
              if (this.field_j < 0) {
                this.field_d = this.field_d - (this.field_k >> 5);
              }
              if (this.field_j > 0) {
                this.field_d = this.field_d + (this.field_k >> 5);
              }
              this.field_k = this.field_k & 31;
            }
            if (this.field_p <= 0) {
              return null;
            }
            return this;
          }
          if (var6 == 4) {
            this.field_q = this.field_q + 1;
            if (this.field_q > 630) {
              return null;
            }
            return this;
          }
          if (5 != var6 &&
            6 != var6) {
            if (var6 != 7 &&
              var6 != 8 &&
              var6 != 9) {
              if (var6 == 10) {
                this.field_k = this.field_k + Math.abs(this.field_j);
                this.field_g = this.field_g + Math.abs(this.field_e);
                if (this.field_k > 32) {
                  if (0 > this.field_j) {
                    this.field_d = this.field_d - (this.field_k >> 5);
                  }
                  if (0 < this.field_j) {
                    this.field_d = this.field_d + (this.field_k >> 5);
                  }
                  this.field_k = this.field_k & 31;
                }
                if (32 < this.field_g) {
                  if (0 > this.field_e) {
                    this.field_q = this.field_q - (this.field_g >> 5);
                  }
                  if (this.field_e > 0) {
                    this.field_q = this.field_q + (this.field_g >> 5);
                  }
                  this.field_g = 31 & this.field_g;
                }
                if (this.field_d < -16) {
                  return null;
                }
                if (this.field_d > 656) {
                  return null;
                }
                if (this.field_q < -16) {
                  return null;
                }
                if (this.field_q > 496) {
                  return null;
                }
                return this;
              }
              if (var6 == 11) {
                var8 = this;
                v.a(new d((d) (var8), 13), -4001);
                var4 = -16;
                var3 = -this.field_d + this.field_a;
                var5 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4));
                if (var5 > 16) {
                  this.field_j = this.field_j + 96 * var3 / var5;
                  this.field_e = this.field_e + 32 * var4 / var5;
                }
                var5Lifetime1 = (int)Math.sqrt((double)(this.field_j * this.field_j + this.field_e * this.field_e));
                if (0 < var5Lifetime1) {
                  this.field_j = 512 * this.field_j / var5Lifetime1;
                  this.field_e = this.field_e * 512 / var5Lifetime1;
                }
                this.field_k = this.field_k + Math.abs(this.field_j);
                this.field_g = this.field_g + Math.abs(this.field_e);
                if (this.field_k > 32) {
                  if (this.field_j < 0) {
                    this.field_d = this.field_d - (this.field_k >> 5);
                  }
                  if (this.field_j > 0) {
                    this.field_d = this.field_d + (this.field_k >> 5);
                  }
                  this.field_k = this.field_k & 31;
                }
                if (this.field_g > 32) {
                  if (this.field_e < 0) {
                    this.field_q = this.field_q - (this.field_g >> 5);
                  }
                  if (0 < this.field_e) {
                    this.field_q = this.field_q + (this.field_g >> 5);
                  }
                  this.field_g = this.field_g & 31;
                }
                if (this.field_q < -16) {
                  return null;
                }
                if (this.field_q > 496) {
                  return null;
                }
                return this;
              }
              if (var6 != 12) {
                if (var6 == 14) {
                  this.field_p = this.field_p + 1;
                  this.field_d = this.field_a + tj.field_w;
                  if (this.field_p <= 3) {
                    return this;
                  }
                  return null;
                }
                if (13 != var6) {
                  return this;
                }
                this.field_p = this.field_p + 1;
                if (this.field_p <= 8) {
                  return this;
                }
                return null;
              }
              this.field_d = tj.field_w + this.field_a;
              this.field_g = this.field_g + Math.abs(this.field_e);
              while (this.field_g > 32) {
                if (0 > this.field_e) {
                  this.field_q = this.field_q - (this.field_g >> 5);
                }
                if (this.field_e > 0) {
                  this.field_q = this.field_q + (this.field_g >> 5);
                }
                this.field_g = this.field_g & 31;
              }
              if (this.field_i > 1) {
                this.field_a = this.field_a - 1;
                this.field_d = this.field_d - 1;
                if (2 < this.field_i) {
                  this.field_d = this.field_d - 1;
                  this.field_a = this.field_a - 1;
                  var9 = this;
                  v.a(new d((d) (var9), 14), -4001);
                  this.field_d = this.field_d + 1;
                  this.field_a = this.field_a + 1;
                }
                var10 = this;
                v.a(new d((d) (var10), 14), -4001);
                this.field_d = this.field_d + 1;
                this.field_a = this.field_a + 1;
              }
              var11 = this;
              v.a(new d((d) (var11), 14), -4001);
              if (this.field_i > 1) {
                this.field_a = this.field_a + 1;
                this.field_d = this.field_d + 1;
                if (this.field_i > 2) {
                  this.field_a = this.field_a + 1;
                  this.field_d = this.field_d + 1;
                  var12 = this;
                  v.a(new d((d) (var12), 14), -4001);
                  this.field_a = this.field_a - 1;
                  this.field_d = this.field_d - 1;
                }
                var13 = this;
                v.a(new d((d) (var13), 14), -4001);
                this.field_d = this.field_d - 1;
                this.field_a = this.field_a - 1;
              }
              if (this.field_d < -16) {
                return null;
              }
              if (this.field_d > 656) {
                return null;
              }
              if (-16 > this.field_q) {
                return null;
              }
              if (496 >= this.field_q) {
                return this;
              }
              return null;
            }
            if (this.field_o > 24) {
              return null;
            }
            this.field_p = this.field_p + 32;
            if (this.field_i >= this.field_p) {
              return this;
            }
            this.field_o = this.field_o + 1;
            this.field_p = this.field_p - this.field_i;
          } else {
            if (this.field_o > 14) {
              return null;
            }
            this.field_p = this.field_p + 32;
            if (this.field_i >= this.field_p) {
              return this;
            }
            this.field_o = this.field_o + 1;
            this.field_p = this.field_p - this.field_i;
          }
          return this;
        }
        this.field_k = this.field_k + Math.abs(this.field_j);
        this.field_g = this.field_g + Math.abs(this.field_e);
        if (this.field_k > 32) {
          if (0 > this.field_j) {
            this.field_d = this.field_d - (this.field_k >> 5);
          }
          if (this.field_j > 0) {
            this.field_d = this.field_d + (this.field_k >> 5);
          }
          this.field_k = this.field_k & 31;
        }
        if (this.field_g > 32) {
          if (this.field_e < 0) {
            this.field_q = this.field_q - (this.field_g >> 5);
          }
          if (0 < this.field_e) {
            this.field_q = this.field_q + (this.field_g >> 5);
          }
          this.field_g = this.field_g & 31;
        }
        if (-16 > this.field_d) {
          return null;
        }
        if (656 < this.field_d) {
          return null;
        }
        if (this.field_q < -16) {
          return null;
        }
        if (this.field_q > 496) {
          return null;
        }
        return this;
    }

    d(int param0, int param1, int param2, int param3, int param4, int param5) {
        this(param0, param1, param2, param3, param4, param5, 1, param5 == 0 ? 256 : 0);
        Object stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        int stackIn_2_3;
        int stackIn_2_4;
        int stackIn_2_5;
        int stackIn_2_6;
        int stackIn_2_7;
        int stackIn_3_8 = 0;
        stackIn_2_0 = this;
        stackIn_2_1 = param0;
        stackIn_2_2 = param1;
        stackIn_2_3 = param2;
        stackIn_2_4 = param3;
        stackIn_2_5 = param4;
        stackIn_2_6 = param5;
        stackIn_2_7 = 1;
        if (param5 != 0) {
          stackIn_3_8 = 0;
        } else {
          stackIn_3_8 = 256;
        }
    }

    d(int param0, int param1, int param2) {
        this(param0 - 3, param1 - 3, 0, 0, 0, 5, param2, 0);
    }

    final void a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        L0: {
          var7 = StarCannon.field_A;
          var3 = 32 % ((87 - param1) / 32);
          var6 = this.field_h;
          if (11 != var6) {
            if (var6 != 13) {
              if (var6 == 14) {
                if (0 == qc.field_d) {
                  return;
                }
                var4 = (param0 >> 4) + this.field_d;
                ki.d(var4, this.field_q, -(this.field_j >> 5) + var4, -(this.field_e >> 5) + this.field_q, this.field_o, (-(this.field_p * 255) + 765) / 3);
              } else {
                if (var6 == 12) {
                  var4 = this.field_d + (param0 >> 4);
                  var5 = 1;
                  var6 = this.field_i;
                  while (1 < var6) {
                    var5++;
                    var6 = var6 >> 1;
                  }
                  ki.c(var4, this.field_q, var5 + 2, this.field_o, 64);
                  ki.c(var4, this.field_q, var5 + 1, this.field_o, 64);
                  ki.a(var4, this.field_q, var4 - (this.field_j >> 5), this.field_q - (this.field_e >> 5), 16777215);
                  ki.a(var4 - 1, this.field_q, var4 - (this.field_j >> 5), -(this.field_e >> 5) + this.field_q, this.field_o);
                  ki.a(1 + var4, this.field_q, -(this.field_j >> 5) + var4, -(this.field_e >> 5) + this.field_q, this.field_o);
                  ki.e(var4, this.field_q, var5, 16777215);
                } else {
                  if (var6 != 1 &&
                    var6 != 10) {
                    switch (var6) {
                      case 2:
                        var4 = -(this.field_i - 1 << 1) + this.field_d + (param0 >> 4);
                        if (this.field_i == 1) {
                          ki.a(var4, this.field_q, -(this.field_j / 32) + var4, this.field_q - this.field_e / 32, this.field_o);
                        }
                        jg.field_C[4 + (-5 + 5 * this.field_i)].a(var4 - 3, this.field_q - 3, this.field_o);
                        break L0;
                      case 3:
                        var4 = 0;
                        if (3 == this.field_h) {
                          var4 = param0 / 20 + this.field_d;
                        }
                        jg.field_C[4].a(-3 + var4, -3 + this.field_q, this.field_o);
                        break L0;
                      case 0:
                        var4 = (param0 >> 4) + this.field_d;
                        if (this.field_p >= 16) {
                          ki.c(var4, this.field_q, this.field_p >> 2, this.field_o, 128);
                          break L0;
                        }
                        ki.c(var4, this.field_q, this.field_p >> 2, this.field_o, this.field_p << 3);
                        break L0;
                      case 4:
                        var4 = this.field_d + (param0 >> 5);
                        if (gd.field_d <= 8) {
                          ea.field_b[gd.field_d].a(this.field_q, 0, -125, var4, 128);
                        }
                        if (gd.field_d < 9) {
                          break L0;
                        }
                        kj.field_y[-9 + gd.field_d].a(this.field_q, 0, -122, var4, 128);
                        break L0;
                      case 5:
                        var4 = (param0 >> 4) + this.field_d;
                        if (14 > this.field_o) {
                          ie.field_B[this.field_o].f(var4 - 16, -16 + this.field_q, 64);
                        }
                        return;
                      case 6:
                        var4 = (param0 >> 4) + this.field_d;
                        if (this.field_o >= 14) {
                          break L0;
                        }
                        ad.field_z[this.field_o].f(var4 - 16, this.field_q - 16, 64);
                        break L0;
                      case 7:
                        var4 = (param0 >> 4) + this.field_d;
                        if (this.field_o < 24) {
                          oh.field_d[this.field_o].b(var4 - 64, this.field_q - 64, 128, 128, 255);
                        }
                        return;
                      case 8:
                        var4 = this.field_d + (param0 >> 4);
                        if (24 <= this.field_o) {
                          break L0;
                        }
                        oh.field_d[this.field_o].b(var4 - 96, -96 + this.field_q, 192, 192, 255);
                        break L0;
                      default:
                        return;
                      case 9:
                        var4 = (param0 >> 4) + this.field_d;
                        if (this.field_o < 24) {
                          oh.field_d[this.field_o].b(var4 - 128, -128 + this.field_q, 256, 256, 255);
                        }
                        return;
                    }
                  }
                  var4 = (param0 >> 4) + this.field_d;
                  var4 = var4 - (this.field_i - 1 << 1);
                  if (this.field_o != 65280) {
                    if (this.field_i > 2) {
                      if (3 == this.field_i) {
                        ie.field_B[0].f(var4 - 8, this.field_q - 8, 192);
                        ie.field_B[2].f(-8 + var4, -8 + (this.field_q + 4), 64);
                        ie.field_B[4].f(-8 + var4, 8 + (-8 + this.field_q), 64);
                        ie.field_B[6].f(var4 - 8, -8 + this.field_q + 12, 64);
                        ie.field_B[8].f(-8 + var4, 8 + this.field_q, 64);
                        ie.field_B[10].f(-8 + var4, -8 + this.field_q + 20, 64);
                        ie.field_B[12].f(var4 - 8, 24 + (-8 + this.field_q), 64);
                        ie.field_B[14].f(var4 - 8, 20 + this.field_q, 64);
                      } else {
                        if (4 != this.field_i) {
                          jg.field_C[9].a(6 + var4, this.field_q - 3, this.field_o);
                          jg.field_C[9].a(12 + var4, -3 + this.field_q, this.field_o);
                        } else {
                          jg.field_C[9].a(-2 + var4, -3 + this.field_q, this.field_o);
                          jg.field_C[9].a(4 + var4, -3 + this.field_q, this.field_o);
                        }
                      }
                    } else {
                      jg.field_C[5 * (-1 + this.field_i) + 4].a(-3 + var4, this.field_q - 3, this.field_o);
                    }
                  } else {
                    ie.field_A[this.field_f].f(var4 - 8, -8 + this.field_q, 128);
                  }
                }
              }
            } else {
              if (qc.field_d == 0) {
                return;
              }
              var4 = this.field_d + (param0 >> 4);
              ki.d(var4, this.field_q, -(this.field_j >> 5) + var4, -(this.field_e >> 5) + this.field_q, this.field_o, 128 * (8 - this.field_p) / 8);
            }
          } else {
            var4 = (param0 >> 4) + this.field_d;
            if (this.field_i == 2) {
              ki.c(var4, this.field_q, 3, this.field_o, 64);
              ki.c(var4, this.field_q, 2, this.field_o, 64);
              ki.a(var4, this.field_q, -(this.field_j >> 5) + var4, -(this.field_e >> 5) + this.field_q, 16777215);
              ki.a(var4 - 1, this.field_q, var4 - (this.field_j >> 5), this.field_q - (this.field_e >> 5), this.field_o);
              ki.a(var4 + 1, this.field_q, -(this.field_j >> 5) + var4, -(this.field_e >> 5) + this.field_q, this.field_o);
              ki.e(var4, this.field_q, 1, 16777215);
              if (0 == (16 & this.field_q)) {
                ki.a(var4, -6 + this.field_q, var4, this.field_q + 6, this.field_o);
                ki.a(var4, this.field_q - 4, var4, this.field_q + 4, 16777215);
              } else {
                ki.a(var4 + 6, this.field_q, var4 - 6, this.field_q, this.field_o);
                ki.a(var4 + 4, this.field_q, var4 - 4, this.field_q, 16777215);
              }
            } else {
              ki.c(var4, this.field_q, 4, this.field_o, 64);
              ki.c(var4, this.field_q, 3, this.field_o, 64);
              ki.a(var4, this.field_q, var4 - (this.field_j >> 5), this.field_q - (this.field_e >> 5), 16777215);
              ki.a(var4 - 1, this.field_q, var4 - (this.field_j >> 5), this.field_q - (this.field_e >> 5), this.field_o);
              ki.a(var4 + 1, this.field_q, -(this.field_j >> 5) + var4, -(this.field_e >> 5) + this.field_q, this.field_o);
              if (0 == (this.field_q & 16)) {
                ki.a(var4 - 8, -8 + this.field_q, var4 + 8, 8 + this.field_q, this.field_o);
                ki.a(var4 - 5, this.field_q - 5, 5 + var4, 5 + this.field_q, 16777215);
                ki.e(var4, this.field_q, 2, 16777215);
              } else {
                ki.a(8 + var4, this.field_q - 8, -8 + var4, 8 + this.field_q, this.field_o);
                ki.a(var4 + 5, -5 + this.field_q, -5 + var4, 5 + this.field_q, 16777215);
                ki.e(var4, this.field_q, 2, 16777215);
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            return null;
          }
          var3_int = 73 % ((58 - param1) / 44);
          if (param2.length > 136) {
            var4 = new ij();
            ((kk) ((Object) var4)).a(-5361, param2);
            stackIn_6_0 = var4;
            return stackIn_6_0;
          }
          if (param0) {
            stackIn_11_0 = rg.a((byte) 10, param2);
            return stackIn_11_0;
          }
          stackIn_9_0 = (byte[]) (param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("d.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_n = null;
        field_m = null;
        field_c = null;
        field_l = null;
        if (param0 != 32) {
          byte[] var2 = (byte[]) null;
          d.a(false, (byte) -38, (byte[]) null);
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
        this.field_q = param1 + 3;
        this.field_e = param3;
        this.field_d = 3 + param0;
        this.field_i = param6;
        this.field_p = param7;
        this.field_g = 0;
        this.field_k = 0;
        if (param5 == 11) {
          this.field_j = this.field_j + (-16 + sh.b(43, 32));
        }
    }

    static {
        field_c = "Player Name: ";
        field_m = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_n = "Paragulan homeworld destroyed<br><br>CONGRATULATIONS<br><br>Final score: ";
    }
}
