/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bv extends jea {
    static long[] field_xb;
    private jea field_tb;
    private jea[] field_vb;
    private jea[] field_ub;
    int field_wb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_t = param5;
        if (param4 != -25436) {
          bv.d((byte) 19);
          this.field_T = param3;
          this.field_G = param2;
          this.field_qb = param6;
          this.b(param1, 32, param0);
          return;
        } else {
          this.field_T = param3;
          this.field_G = param2;
          this.field_qb = param6;
          this.b(param1, 32, param0);
          return;
        }
    }

    final static void d(byte param0) {
        tra.g((byte) -113);
        int var1 = -34 % ((10 - param0) / 47);
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        if (param0 >= -97) {
          this.field_wb = -14;
          L0: while (true) {
            if (var2 < this.field_ub.length) {
              if (var3 == 0) {
                L1: {
                  if (var2 == this.field_wb) {
                    break L1;
                  } else {
                    if (this.field_ub[var2].field_y == 0) {
                      break L1;
                    } else {
                      this.field_ub[this.field_wb].field_cb = false;
                      this.field_vb[this.field_wb].field_qb = this.field_vb[this.field_wb].field_qb + 10000;
                      this.field_wb = var2;
                      this.field_ub[var2].field_cb = true;
                      this.field_vb[var2].field_qb = this.field_vb[var2].field_qb - 10000;
                      break L1;
                    }
                  }
                }
                var2++;
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L2: while (true) {
            if (var2 < this.field_ub.length) {
              if (var3 == 0) {
                L3: {
                  if (var2 == this.field_wb) {
                    break L3;
                  } else {
                    if (this.field_ub[var2].field_y == 0) {
                      break L3;
                    } else {
                      this.field_ub[this.field_wb].field_cb = false;
                      this.field_vb[this.field_wb].field_qb = this.field_vb[this.field_wb].field_qb + 10000;
                      this.field_wb = var2;
                      this.field_ub[var2].field_cb = true;
                      this.field_vb[var2].field_qb = this.field_vb[var2].field_qb - 10000;
                      break L3;
                    }
                  }
                }
                var2++;
                continue L2;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param1 == 32) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_ub.length) {
              this.field_tb.a(this.field_G, this.field_t - param2, -23776, param2, 0);
              var8 = 0;
              var4 = var8;
              L1: while (true) {
                if (var8 < this.field_vb.length) {
                  this.field_vb[var8].a(this.field_tb.field_G + -(param0 * 2), -(param0 * 2) + this.field_tb.field_t, -23776, param0, param0);
                  if (var7 == 0) {
                    L2: {
                      if (this.field_wb == var8) {
                        break L2;
                      } else {
                        this.field_vb[var8].field_qb = this.field_vb[var8].field_qb + 10000;
                        break L2;
                      }
                    }
                    var8++;
                    continue L1;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              var5 = var4 * this.field_G / this.field_ub.length;
              var6 = (var4 - -1) * this.field_G / this.field_ub.length;
              this.field_ub[var4].field_qb = var5;
              this.field_ub[var4].field_T = 0;
              this.field_ub[var4].field_G = -var5 + var6;
              this.field_ub[var4].field_t = param2;
              var4++;
              if (var7 != 0) {
                var8 = 0;
                var4 = var8;
                L3: while (true) {
                  if (var8 < this.field_vb.length) {
                    this.field_vb[var8].a(this.field_tb.field_G + -(param0 * 2), -(param0 * 2) + this.field_tb.field_t, -23776, param0, param0);
                    if (var7 == 0) {
                      L4: {
                        if (this.field_wb == var8) {
                          break L4;
                        } else {
                          this.field_vb[var8].field_qb = this.field_vb[var8].field_qb + 10000;
                          break L4;
                        }
                      }
                      var8++;
                      continue L3;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                continue L0;
              }
            }
          }
        } else {
          field_xb = (long[]) null;
          var4 = 0;
          L5: while (true) {
            if (var4 >= this.field_ub.length) {
              this.field_tb.a(this.field_G, this.field_t - param2, -23776, param2, 0);
              var8 = 0;
              var4 = var8;
              L6: while (true) {
                if (var8 < this.field_vb.length) {
                  this.field_vb[var8].a(this.field_tb.field_G + -(param0 * 2), -(param0 * 2) + this.field_tb.field_t, -23776, param0, param0);
                  if (var7 == 0) {
                    L7: {
                      if (this.field_wb == var8) {
                        break L7;
                      } else {
                        this.field_vb[var8].field_qb = this.field_vb[var8].field_qb + 10000;
                        break L7;
                      }
                    }
                    var8++;
                    continue L6;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              var5 = var4 * this.field_G / this.field_ub.length;
              var6 = (var4 - -1) * this.field_G / this.field_ub.length;
              this.field_ub[var4].field_qb = var5;
              this.field_ub[var4].field_T = 0;
              this.field_ub[var4].field_G = -var5 + var6;
              this.field_ub[var4].field_t = param2;
              var4++;
              if (var7 == 0) {
                continue L5;
              } else {
                var8 = 0;
                var4 = var8;
                L8: while (true) {
                  if (var8 < this.field_vb.length) {
                    this.field_vb[var8].a(this.field_tb.field_G + -(param0 * 2), -(param0 * 2) + this.field_tb.field_t, -23776, param0, param0);
                    if (var7 == 0) {
                      L9: {
                        if (this.field_wb == var8) {
                          break L9;
                        } else {
                          this.field_vb[var8].field_qb = this.field_vb[var8].field_qb + 10000;
                          break L9;
                        }
                      }
                      var8++;
                      continue L8;
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
        }
    }

    public static void f(int param0) {
        field_xb = null;
        if (param0 == 0) {
            return;
        }
        bv.f(30);
    }

    bv(long param0, jea param1, String[] param2, jea param3, jea[] param4, int param5) {
        super(param0, (jea) null);
        RuntimeException var8 = null;
        int var8_int = 0;
        jea var9 = null;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.field_ub = new jea[param2.length];
            this.field_tb = new jea(0L, param3);
            this.field_vb = param4;
            var8_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var8_int >= param2.length) {
                    break L3;
                  } else {
                    var9 = new jea(0L, param1);
                    var9.field_r = param2[var8_int];
                    this.field_ub[var8_int] = var9;
                    this.b(-124, var9);
                    var8_int++;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.b(-128, this.field_tb);
                break L2;
              }
              var8_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (param4.length <= var8_int) {
                      break L6;
                    } else {
                      this.field_tb.b(-122, param4[var8_int]);
                      var8_int++;
                      if (var10 != 0) {
                        break L5;
                      } else {
                        if (var10 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  this.field_wb = param5;
                  this.field_ub[param5].field_cb = true;
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var8);
            stackOut_12_1 = new StringBuilder().append("bv.<init>(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L7;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L7;
            }
          }
          L8: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L8;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L8;
            }
          }
          L9: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L9;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L9;
            }
          }
          L10: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param5 + ')');
        }
    }

    static {
        field_xb = new long[32];
    }
}
