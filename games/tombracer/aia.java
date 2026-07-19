/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aia extends vg {
    private int field_i;
    private int field_w;
    private int field_g;
    private int field_u;
    private int field_m;
    static String field_j;
    static String field_v;
    private boolean field_l;
    static int[] field_t;
    private int field_r;
    private int field_s;
    private int field_n;
    private int field_f;
    private int field_h;
    private int field_p;
    private int field_q;
    private int field_k;
    private int field_o;

    final void a(int param0, int param1, int param2, byte param3) {
        this.field_i = 0;
        int var5 = -52 % ((param3 - 44) / 36);
        this.field_k = 0;
    }

    final int f(int param0) {
        if (param0 != 0) {
            this.field_l = true;
        }
        return this.field_r;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, fsa param5, la param6) {
        int discarded$1 = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        qea var17 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_k > 0) {
              this.field_k = this.field_k - 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var17 = param6.q(57);
                if (param6.a(-1553494544).f(8, 10915)) {
                  this.field_o = 100 - -var17.a(50, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var9 = this.a(0) ? 1 : 0;
                var10 = this.h(21302) ? 1 : 0;
                if (param4 <= -55) {
                  break L2;
                } else {
                  discarded$1 = this.g(-9);
                  break L2;
                }
              }
              L3: {
                var11 = 0;
                if (var9 != 0) {
                  break L3;
                } else {
                  if (var10 == 0) {
                    if (var17.a(500, 0) == 0) {
                      var11 = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (this.field_h <= 0) {
                  break L4;
                } else {
                  this.field_h = this.field_h - 1;
                  if (this.field_h == 0) {
                    var11 = 1;
                    if (0 >= this.field_i) {
                      break L4;
                    } else {
                      this.field_o = this.field_i;
                      this.field_i = 0;
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (var11 == 0) {
                  break L5;
                } else {
                  if (this.field_l) {
                    break L5;
                  } else {
                    L6: {
                      this.field_p = 0;
                      this.field_s = 0;
                      if (var10 != 0) {
                        break L6;
                      } else {
                        if (var9 == 0) {
                          this.a(param6, -92);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L7: {
                if (this.field_l) {
                  var12 = 65536;
                  this.field_s = var12 * ne.field_f[this.field_f][0];
                  this.field_p = var12 * ne.field_f[this.field_f][1];
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (0 != this.field_s) {
                  break L8;
                } else {
                  if (0 == this.field_p) {
                    L9: {
                      L10: {
                        if (var9 == 0) {
                          break L10;
                        } else {
                          var12 = 196608;
                          var13 = var17.a(8, 0);
                          if (var16 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      var13 = var17.a(8, 0);
                      var12 = var17.a(32768, 0) + 32768;
                      break L9;
                    }
                    L11: {
                      this.field_f = var13;
                      this.field_s = var12 * ne.field_f[this.field_f][0];
                      this.field_p = ne.field_f[this.field_f][1] * var12;
                      if (0 < this.field_i) {
                        L12: {
                          if (-1 == (this.field_s ^ -1)) {
                            break L12;
                          } else {
                            if (lw.a(this.field_s, (byte) -87) == lw.a(-this.field_n + this.field_u, (byte) -87)) {
                              this.field_s = -this.field_s;
                              this.field_f = sw.a(this.field_f, 6);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                        }
                        if (this.field_p == 0) {
                          break L11;
                        } else {
                          if (lw.a(this.field_p, (byte) -95) == lw.a(this.field_m + -this.field_r, (byte) -93)) {
                            this.field_p = -this.field_p;
                            this.field_f = ona.b(0, this.field_f);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                    L13: {
                      if (0 == this.field_s) {
                        break L13;
                      } else {
                        if (-1 != (this.field_p ^ -1)) {
                          this.field_s = 180 * (this.field_s >> 1518139144);
                          this.field_p = 180 * (this.field_p >> -943094264);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                    this.field_h = var17.a(75, 0) + 25;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L14: {
                if (0 < this.field_i) {
                  this.field_i = this.field_i - 1;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                var12 = this.field_n;
                this.field_n = this.field_n + this.field_s;
                var13 = this.field_r;
                this.field_r = this.field_r + this.field_p;
                var14 = (-this.field_q + param1) / 2;
                if (-var14 > this.field_n) {
                  this.field_n = -var14;
                  this.field_h = 1;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                var15 = (-this.field_q + param2) / 2;
                if (var14 >= this.field_n) {
                  break L16;
                } else {
                  this.field_h = 1;
                  this.field_n = var14;
                  break L16;
                }
              }
              L17: {
                if (-var15 > this.field_r) {
                  this.field_r = -var15;
                  this.field_h = 1;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (this.field_r > var15) {
                  this.field_h = 1;
                  this.field_r = var15;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                L20: {
                  if (var12 != this.field_n) {
                    break L20;
                  } else {
                    if (this.field_r != var13) {
                      break L20;
                    } else {
                      break L19;
                    }
                  }
                }
                L21: {
                  if (param6.a((ffa) null, this.field_q, 2, 1, param3 - -this.field_r, param0 + this.field_n, false, param5, this.field_q)) {
                    break L21;
                  } else {
                    if (-1 > (this.field_o ^ -1)) {
                      this.field_o = this.field_o - 1;
                      if (var16 == 0) {
                        break L19;
                      } else {
                        break L21;
                      }
                    } else {
                      break L19;
                    }
                  }
                }
                L22: {
                  this.field_o = this.field_o + 2;
                  this.field_o = et.b(75, this.field_o, 125);
                  if (this.h(21302)) {
                    break L22;
                  } else {
                    this.field_p = 0;
                    this.field_n = var12;
                    this.field_r = var13;
                    this.field_s = 0;
                    if (var16 == 0) {
                      break L19;
                    } else {
                      break L22;
                    }
                  }
                }
                this.field_n = (this.field_n - var12) / 4 + var12;
                this.field_r = var13 + (-var13 + this.field_r) / 4;
                break L19;
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var8 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) (var8);
            stackOut_78_1 = new StringBuilder().append("aia.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param5 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L23;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L23;
            }
          }
          L24: {
            stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
            stackOut_81_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(',');
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param6 == null) {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L24;
            } else {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L24;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_84_0), stackIn_84_2 + ')');
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

    final int g(int param0) {
        if (param0 != 0) {
            return -7;
        }
        return this.field_q;
    }

    final void c(int param0) {
        int var2 = -1 / ((param0 - 75) / 51);
        this.field_s = -this.field_s;
        this.field_n = -this.field_n;
        this.field_u = -this.field_u;
        this.field_f = sw.a(this.field_f, 6);
    }

    final void a(int param0, boolean param1, int param2, int param3, hca param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            if (!param4.q(122)) {
              L1: {
                L2: {
                  if (param4.k((byte) -127) <= 0) {
                    break L2;
                  } else {
                    this.field_w = 0;
                    this.field_g = this.field_g + 1;
                    if (!TombRacer.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_w = this.field_w + 1;
                if (-21 <= (this.field_w ^ -1)) {
                  break L1;
                } else {
                  this.field_g = 0;
                  break L1;
                }
              }
              L3: {
                if ((param4.g(false) ^ -1) > -196609) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L3;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L3;
                }
              }
              L4: {
                var6_int = stackIn_10_0;
                if (!param1) {
                  break L4;
                } else {
                  L5: {
                    if (15 > this.field_g) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      break L5;
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_14_0 = stackOut_12_0;
                      break L5;
                    }
                  }
                  var7 = stackIn_14_0;
                  if (!this.a(-196609, param4, param2, param3)) {
                    break L4;
                  } else {
                    if (var6_int == 0) {
                      break L4;
                    } else {
                      if (var7 != 0) {
                        param4.a(2, (byte) 97, 7);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L6: {
                this.field_l = false;
                if (this.a(0)) {
                  break L6;
                } else {
                  if (this.h(21302)) {
                    break L6;
                  } else {
                    if (var6_int == 0) {
                      break L6;
                    } else {
                      if (!param1) {
                        break L6;
                      } else {
                        if (0 >= this.field_g) {
                          break L6;
                        } else {
                          var7 = param3 - -this.field_n;
                          var8 = this.field_r + param2;
                          var9 = -var7 + param4.d(3);
                          var10 = -var8 + param4.e(9648);
                          this.field_f = uqa.a(var9, var10, -111);
                          this.field_l = true;
                          break L6;
                        }
                      }
                    }
                  }
                }
              }
              L7: {
                if (param0 > 98) {
                  break L7;
                } else {
                  discarded$1 = this.d(5);
                  break L7;
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
          L8: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var6);
            stackOut_28_1 = new StringBuilder().append("aia.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int e(int param0) {
        int discarded$2 = 0;
        byte[] var2 = null;
        if (null != baa.field_d.field_i) {
          if (kra.field_a == baa.field_d.field_i.field_b) {
            return 0;
          } else {
            if (nj.field_t != baa.field_d.field_i.field_b) {
              if (baa.field_d.field_i.field_b != paa.field_z) {
                if (baa.field_d.field_i.field_b == vea.field_c) {
                  return 3;
                } else {
                  if (baa.field_d.field_i.field_b != laa.field_x) {
                    L0: {
                      if (param0 == 5) {
                        break L0;
                      } else {
                        var2 = (byte[]) null;
                        discarded$2 = aia.a((byte[]) null, 116, 108, 51);
                        break L0;
                      }
                    }
                    if (daa.field_d == baa.field_d.field_i.field_b) {
                      return 5;
                    } else {
                      return -1;
                    }
                  } else {
                    return 4;
                  }
                }
              } else {
                return 1;
              }
            } else {
              return 2;
            }
          }
        } else {
          kh.a(true, ska.field_r, kva.field_s);
          return 4;
        }
    }

    final int a(byte param0) {
        if (param0 < 32) {
            this.field_q = 85;
        }
        return this.field_n;
    }

    private final boolean h(int param0) {
        if (param0 != 21302) {
            this.field_m = 121;
        }
        return 20 < this.field_o ? true : false;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        if (!param3) {
            la var6 = (la) null;
            this.a(-51, -111, -16, -86, (byte) -10, (fsa) null, (la) null);
        }
        this.field_p = 0;
        if (0 == this.field_i) {
            this.field_s = 0;
        }
        this.field_i = 200;
        this.field_k = 0;
        this.field_u = param0;
        this.field_m = param2;
    }

    public static void i(int param0) {
        field_v = null;
        field_t = null;
        int var1 = 12 % ((-7 - param0) / 47);
        field_j = null;
    }

    final int d(int param0) {
        if (param0 != 2) {
            this.field_u = 118;
        }
        return this.field_f;
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param3;
            L1: while (true) {
              L2: {
                if (param1 <= var5) {
                  var5 = -75 % ((param2 - -33) / 55);
                  var4_int = var4_int ^ -1;
                  break L2;
                } else {
                  var4_int = coa.field_q[(var4_int ^ param0[var5]) & 255] ^ var4_int >>> 158638696;
                  var5++;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              stackOut_7_0 = var4_int;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("aia.N(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    private final boolean a(int param0, hca param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -196609) {
                break L1;
              } else {
                this.field_r = 31;
                break L1;
              }
            }
            stackOut_2_0 = io.a(param1.c(-28) / 2, this.field_r + param2, (byte) -63, param1.a((byte) 55) / 2, this.field_n + param3, param1.e(9648), this.field_q / 2, this.field_q / 2, param1.d(3));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("aia.Q(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(la param0, int param1) {
        int discarded$0 = 0;
        try {
            if (param1 > -72) {
                discarded$0 = this.g(-8);
            }
            this.field_k = 50 - -param0.q(-120).a(50, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "aia.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0) {
        int discarded$0 = 0;
        if (param0 != 0) {
            discarded$0 = this.g(-80);
        }
        return 0 < this.field_i ? true : false;
    }

    final boolean b(int param0) {
        if (param0 != 180) {
            hca var3 = (hca) null;
            this.a(79, false, 55, 0, (hca) null);
        }
        return 0 < this.field_k ? true : false;
    }

    aia(int param0, int param1, int param2) {
        this.field_n = param0;
        this.field_q = param2;
        this.field_r = param1;
    }

    static {
        field_t = new int[16384];
        field_v = "You are not currently logged in to the<nbsp>game.";
    }
}
