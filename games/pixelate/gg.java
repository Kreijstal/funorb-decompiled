/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends jp {
    private kj field_g;
    static String field_v;
    private rn field_y;
    private rf field_i;
    private int field_n;
    private int field_m;
    private int field_f;
    static char[] field_h;
    private byte[] field_e;
    static int[] field_z;
    private nl field_j;
    private gm field_r;
    private gn field_o;
    private byte[] field_s;
    private rn field_u;
    private bb field_w;
    private boolean field_q;
    private boolean field_k;
    private bb field_l;
    private int field_x;
    private long field_t;
    private boolean field_p;

    final byte[] a(int param0, int param1) {
        int var4 = 18 / ((param1 - 33) / 43);
        gn var3 = this.a(param0, 0, true);
        if (var3 == null) {
            return null;
        }
        byte[] var5 = var3.h(0);
        var3.c(2779);
        return var5;
    }

    final void f(byte param0) {
        gn discarded$0 = null;
        gn discarded$1 = null;
        fa var2;
        int var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (this.field_w == null) {
          return;
        } else {
          L0: {
            if (param0 == 29) {
              break L0;
            } else {
              field_h = (char[]) null;
              break L0;
            }
          }
          if (null == this.a((byte) 36)) {
            return;
          } else {
            var2 = this.field_l.c(param0 + 1504642244);
            L1: while (true) {
              if (var2 == null) {
                return;
              } else {
                L2: {
                  var3 = (int)var2.field_e;
                  if (var3 >= 0) {
                    if (var3 < this.field_g.field_b) {
                      if (this.field_g.field_h[var3] == 0) {
                        var2.c(2779);
                        break L2;
                      } else {
                        L3: {
                          if (this.field_s[var3] == 0) {
                            discarded$0 = this.a(var3, 1, true);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if ((this.field_s[var3] ^ -1) == 0) {
                            discarded$1 = this.a(var3, 2, true);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        if (1 == this.field_s[var3]) {
                          var2.c(2779);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      var2.c(2779);
                      break L2;
                    }
                  } else {
                    var2.c(2779);
                    break L2;
                  }
                }
                var2 = this.field_l.f(1504642273);
                continue L1;
              }
            }
          }
        }
    }

    private final gn a(int param0, int param1, boolean param2) {
        gn discarded$0 = null;
        Object stackIn_88_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        gn var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        L0: {
          var10 = Pixelate.field_H ? 1 : 0;
          var12 = (gn) ((Object) this.field_j.a(-25484, (long)param0));
          var4 = var12;
          if (param2) {
            break L0;
          } else {
            discarded$0 = this.a(37, -122, true);
            break L0;
          }
        }
        L1: {
          if (var12 == null) {
            break L1;
          } else {
            if (0 != param1) {
              break L1;
            } else {
              if (var12.field_t) {
                break L1;
              } else {
                if (!var12.field_v) {
                  break L1;
                } else {
                  var12.c(2779);
                  var4 = null;
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          if (var4 == null) {
            L3: {
              if (0 == param1) {
                L4: {
                  if (this.field_y == null) {
                    break L4;
                  } else {
                    if ((this.field_s[param0] ^ -1) == 0) {
                      break L4;
                    } else {
                      var4 = this.field_r.a(param0, this.field_y, 116);
                      break L3;
                    }
                  }
                }
                if (!this.field_i.a(20)) {
                  var4 = this.field_i.a((byte) -31, this.field_m, true, param0, (byte) 2);
                  break L3;
                } else {
                  return null;
                }
              } else {
                if (1 == param1) {
                  if (null != this.field_y) {
                    var4 = this.field_r.a(param0, 3, this.field_y);
                    break L3;
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (2 != param1) {
                    throw new RuntimeException();
                  } else {
                    if (this.field_y != null) {
                      if ((this.field_s[param0] ^ -1) == 0) {
                        if (!this.field_i.d((byte) 86)) {
                          var4 = this.field_i.a((byte) -31, this.field_m, false, param0, (byte) 2);
                          break L3;
                        } else {
                          return null;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              }
            }
            this.field_j.a((long)param0, 127, (fa) (var4));
            break L2;
          } else {
            break L2;
          }
        }
        if (!((gn) (var4)).field_v) {
          var18 = ((gn) (var4)).h(0);
          var13 = var18;
          var5 = var13;
          if (var4 instanceof cg) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if ((var18.length ^ -1) >= -3) {
                      break L6;
                    } else {
                      ra.field_h.reset();
                      ra.field_h.update(var5, 0, -2 + var18.length);
                      var6_int = (int)ra.field_h.getValue();
                      if (var6_int != this.field_g.field_k[param0]) {
                        throw new RuntimeException();
                      } else {
                        L7: {
                          if (this.field_g.field_d == null) {
                            break L7;
                          } else {
                            if (null != this.field_g.field_d[param0]) {
                              var30 = this.field_g.field_d[param0];
                              var29 = db.a(var5, 0, 1761872464, -2 + var18.length);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if (64 <= var11) {
                                  break L7;
                                } else {
                                  if ((var29[var11] ^ -1) == (var30[var11] ^ -1)) {
                                    var11++;
                                    continue L8;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                        var7 = (65280 & var5[-2 + var18.length] << -1296059800) + (255 & var5[var18.length + -1]);
                        if (var7 != (65535 & this.field_g.field_a[param0])) {
                          throw new RuntimeException();
                        } else {
                          L9: {
                            if (this.field_s[param0] != 1) {
                              L10: {
                                if (0 != this.field_s[param0]) {
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              this.field_s[param0] = (byte) 1;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L11: {
                            if (((gn) (var4)).field_t) {
                              break L11;
                            } else {
                              ((gn) (var4)).c(2779);
                              break L11;
                            }
                          }
                          stackIn_88_0 = var4;
                          break L5;
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L12: {
                var6 = (Exception) (Object) decompiledCaughtException;
                this.field_s[param0] = (byte)-1;
                ((gn) (var4)).c(2779);
                if (((gn) (var4)).field_t) {
                  if (!this.field_i.a(20)) {
                    var4 = this.field_i.a((byte) -31, this.field_m, true, param0, (byte) 2);
                    this.field_j.a((long)param0, 127, (fa) (var4));
                    break L12;
                  } else {
                    return null;
                  }
                } else {
                  break L12;
                }
              }
              return null;
            }
            return (gn) ((Object) stackIn_88_0);
          } else {
            try {
              L13: {
                L14: {
                  if (var5 == null) {
                    break L14;
                  } else {
                    if (-3 > (var18.length ^ -1)) {
                      ra.field_h.reset();
                      ra.field_h.update(var5, 0, -2 + var18.length);
                      var6_int = (int)ra.field_h.getValue();
                      if (var6_int != this.field_g.field_k[param0]) {
                        throw new RuntimeException();
                      } else {
                        L15: {
                          if (null == this.field_g.field_d) {
                            break L15;
                          } else {
                            if (null == this.field_g.field_d[param0]) {
                              break L15;
                            } else {
                              var28 = this.field_g.field_d[param0];
                              var27 = db.a(var5, 0, 1761872464, -2 + var18.length);
                              var9 = 0;
                              L16: while (true) {
                                if (var9 >= 64) {
                                  break L15;
                                } else {
                                  if (var27[var9] != var28[var9]) {
                                    throw new RuntimeException();
                                  } else {
                                    var9++;
                                    continue L16;
                                  }
                                }
                              }
                            }
                          }
                        }
                        this.field_i.field_h = 0;
                        this.field_i.field_m = 0;
                        break L13;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              this.field_i.e((byte) 0);
              ((gn) (var4)).c(2779);
              if (((gn) (var4)).field_t) {
                if (!this.field_i.a(20)) {
                  var4 = this.field_i.a((byte) -31, this.field_m, true, param0, (byte) 2);
                  this.field_j.a((long)param0, 127, (fa) (var4));
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            L17: {
              var5[var18.length - 2] = (byte)(this.field_g.field_a[param0] >>> -1775395832);
              var5[-1 + var18.length] = (byte)this.field_g.field_a[param0];
              if (this.field_y != null) {
                this.field_r.a(param0, 45, this.field_y, var18);
                if (-2 != (this.field_s[param0] ^ -1)) {
                  this.field_s[param0] = (byte) 1;
                  break L17;
                } else {
                  break L17;
                }
              } else {
                break L17;
              }
            }
            L18: {
              if (((gn) (var4)).field_t) {
                break L18;
              } else {
                ((gn) (var4)).c(2779);
                break L18;
              }
            }
            return (gn) (var4);
          }
        } else {
          return null;
        }
    }

    final int b(int param0, int param1) {
        if (param1 != 8192) {
            gg.d((byte) 22);
        }
        gn var3 = (gn) ((Object) this.field_j.a(-25484, (long)param0));
        if (var3 != null) {
            return var3.g(param1 ^ -8303);
        }
        return 0;
    }

    final void a(boolean param0) {
        if (!(null != this.field_y)) {
            return;
        }
        this.field_q = param0 ? true : false;
        if (this.field_w == null) {
            this.field_w = new bb();
        }
    }

    final static void a(boolean param0, String[][] param1, byte[] param2, fm param3, String[] param4, byte[] param5, tf[][] param6, int param7, int param8, tf[][] param9, fm param10, int param11, String[][] param12, fm param13, int[] param14) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        int[] var16 = null;
        hh[] var17 = null;
        try {
          L0: {
            L1: {
              var17 = (hh[]) null;
              var16 = (int[]) null;
              ro.a(param0, param6, param8, -15690, param10, param4, param14, param1, (hh[]) null, param7, (int[]) null, param2, param12, param3, param9, param5, param13);
              if (param11 > 6) {
                break L1;
              } else {
                gg.d((byte) 43);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var15 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var15);

            stackIn_5_1 = new StringBuilder().append("gg.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param6 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param10 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param13 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param14 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_36_2 + ')');
        }
    }

    final void b(int param0) {
        gn discarded$0 = null;
        gn discarded$1 = null;
        gn discarded$2 = null;
        gn discarded$3 = null;
        gn discarded$4 = null;
        gn discarded$5 = null;
        int var2_int;
        gn var2;
        fa var3;
        int var4;
        int var5;
        fa var6;
        fa var7;
        L0: {
          L1: {
            L2: {
              L3: {
                var5 = Pixelate.field_H ? 1 : 0;
                if (this.field_w != null) {
                  if (null != this.a((byte) 36)) {
                    if (!this.field_k) {
                      if (!this.field_q) {
                        this.field_w = null;
                        break L3;
                      } else {
                        var2_int = 1;
                        var3 = this.field_w.c(param0 ^ 1504642273);
                        L4: while (true) {
                          if (var3 == null) {
                            L5: while (true) {
                              L6: {
                                if (this.field_x >= this.field_g.field_h.length) {
                                  break L6;
                                } else {
                                  if (this.field_g.field_h[this.field_x] != 0) {
                                    if (this.field_i.d((byte) 97)) {
                                      var2_int = 0;
                                      break L6;
                                    } else {
                                      L7: {
                                        if (1 != this.field_s[this.field_x]) {
                                          discarded$0 = this.a(this.field_x, 2, true);
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      }
                                      L8: {
                                        if (-2 == (this.field_s[this.field_x] ^ -1)) {
                                          break L8;
                                        } else {
                                          var7 = new fa();
                                          var7.field_e = (long)this.field_x;
                                          this.field_w.a(22125, var7);
                                          var2_int = 0;
                                          break L8;
                                        }
                                      }
                                      this.field_x = this.field_x + 1;
                                      continue L5;
                                    }
                                  } else {
                                    this.field_x = this.field_x + 1;
                                    continue L5;
                                  }
                                }
                              }
                              if (var2_int != 0) {
                                this.field_x = 0;
                                this.field_q = false;
                                break L3;
                              } else {
                                L9: {
                                  if (param0 == 0) {
                                    break L9;
                                  } else {
                                    discarded$1 = this.a(112, 27, true);
                                    break L9;
                                  }
                                }
                                if (!this.field_p) {
                                  break L0;
                                } else {
                                  if ((hm.a(64) ^ -1L) > (this.field_t ^ -1L)) {
                                    break L1;
                                  } else {
                                    var2 = (gn) ((Object) this.field_j.a((byte) -99));
                                    L10: while (true) {
                                      if (var2 == null) {
                                        break L2;
                                      } else {
                                        L11: {
                                          if (!var2.field_v) {
                                            if (!var2.field_x) {
                                              var2.field_x = true;
                                              break L11;
                                            } else {
                                              if (!var2.field_t) {
                                                throw new RuntimeException();
                                              } else {
                                                var2.c(param0 + 2779);
                                                break L11;
                                              }
                                            }
                                          } else {
                                            break L11;
                                          }
                                        }
                                        var2 = (gn) ((Object) this.field_j.a(-123));
                                        continue L10;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            L12: {
                              var4 = (int)var3.field_e;
                              if (1 == this.field_s[var4]) {
                                break L12;
                              } else {
                                discarded$2 = this.a(var4, 2, true);
                                break L12;
                              }
                            }
                            L13: {
                              if (this.field_s[var4] != 1) {
                                var2_int = 0;
                                break L13;
                              } else {
                                var3.c(param0 ^ 2779);
                                break L13;
                              }
                            }
                            var3 = this.field_w.f(1504642273);
                            continue L4;
                          }
                        }
                      }
                    } else {
                      var2_int = 1;
                      var3 = this.field_w.c(1504642273);
                      L14: while (true) {
                        if (var3 == null) {
                          L15: while (true) {
                            L16: {
                              if (this.field_g.field_h.length <= this.field_x) {
                                break L16;
                              } else {
                                if (0 != this.field_g.field_h[this.field_x]) {
                                  if (250 > this.field_r.field_c) {
                                    L17: {
                                      if (this.field_s[this.field_x] == 0) {
                                        discarded$3 = this.a(this.field_x, 1, true);
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                    L18: {
                                      if (0 == this.field_s[this.field_x]) {
                                        var6 = new fa();
                                        var6.field_e = (long)this.field_x;
                                        this.field_w.a(22125, var6);
                                        var2_int = 0;
                                        break L18;
                                      } else {
                                        break L18;
                                      }
                                    }
                                    this.field_x = this.field_x + 1;
                                    continue L15;
                                  } else {
                                    var2_int = 0;
                                    break L16;
                                  }
                                } else {
                                  this.field_x = this.field_x + 1;
                                  continue L15;
                                }
                              }
                            }
                            if (var2_int == 0) {
                              break L3;
                            } else {
                              this.field_k = false;
                              this.field_x = 0;
                              break L3;
                            }
                          }
                        } else {
                          L19: {
                            var4 = (int)var3.field_e;
                            if (0 != this.field_s[var4]) {
                              break L19;
                            } else {
                              discarded$4 = this.a(var4, 1, true);
                              break L19;
                            }
                          }
                          L20: {
                            if (-1 != (this.field_s[var4] ^ -1)) {
                              var3.c(2779);
                              break L20;
                            } else {
                              var2_int = 0;
                              break L20;
                            }
                          }
                          var3 = this.field_w.f(1504642273);
                          continue L14;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  break L3;
                }
              }
              L21: {
                if (param0 == 0) {
                  break L21;
                } else {
                  discarded$5 = this.a(112, 27, true);
                  break L21;
                }
              }
              if (!this.field_p) {
                break L0;
              } else {
                if ((hm.a(64) ^ -1L) > (this.field_t ^ -1L)) {
                  break L1;
                } else {
                  var2 = (gn) ((Object) this.field_j.a((byte) -99));
                  L22: while (true) {
                    if (var2 == null) {
                      break L2;
                    } else {
                      L23: {
                        if (!var2.field_v) {
                          if (!var2.field_x) {
                            var2.field_x = true;
                            break L23;
                          } else {
                            if (!var2.field_t) {
                              throw new RuntimeException();
                            } else {
                              var2.c(param0 + 2779);
                              break L23;
                            }
                          }
                        } else {
                          break L23;
                        }
                      }
                      var2 = (gn) ((Object) this.field_j.a(-123));
                      continue L22;
                    }
                  }
                }
              }
            }
            this.field_t = 1000L + hm.a(64);
            break L1;
          }
          break L0;
        }
    }

    final kj a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          if (param0 == 36) {
            break L0;
          } else {
            this.b(-6, -35);
            break L0;
          }
        }
        if (this.field_g != null) {
          return this.field_g;
        } else {
          L1: {
            if (this.field_o == null) {
              if (!this.field_i.a(20)) {
                this.field_o = (gn) ((Object) this.field_i.a((byte) -31, 255, true, this.field_m, (byte) 0));
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (!this.field_o.field_v) {
            L2: {
              var7 = this.field_o.h(0);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (!(this.field_o instanceof cg)) {
                try {
                  L3: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_g = new kj(var7, this.field_n, this.field_e);
                      break L3;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    this.field_i.e((byte) 0);
                    this.field_g = null;
                    if (this.field_i.a(param0 ^ 48)) {
                      this.field_o = null;
                      break L4;
                    } else {
                      this.field_o = (gn) ((Object) this.field_i.a((byte) -31, 255, true, this.field_m, (byte) 0));
                      break L4;
                    }
                  }
                  return null;
                }
                if (null == this.field_u) {
                  break L2;
                } else {
                  this.field_r.a(this.field_m, 93, this.field_u, var7);
                  break L2;
                }
              } else {
                try {
                  L5: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_g = new kj(var7, this.field_n, this.field_e);
                      if (this.field_g.field_c == this.field_f) {
                        break L5;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    this.field_g = null;
                    if (this.field_i.a(20)) {
                      this.field_o = null;
                      break L6;
                    } else {
                      this.field_o = (gn) ((Object) this.field_i.a((byte) -31, 255, true, this.field_m, (byte) 0));
                      break L6;
                    }
                  }
                  return null;
                }
                break L2;
              }
            }
            L7: {
              if (this.field_y != null) {
                this.field_s = new byte[this.field_g.field_b];
                break L7;
              } else {
                break L7;
              }
            }
            this.field_o = null;
            return this.field_g;
          } else {
            return null;
          }
        }
    }

    public static void e(byte param0) {
        field_h = null;
        if (param0 != 45) {
            int[] var2 = (int[]) null;
            gg.a(true, (String[][]) null, (byte[]) null, (fm) null, (String[]) null, (byte[]) null, (tf[][]) null, -91, 127, (tf[][]) null, (fm) null, 112, (String[][]) null, (fm) null, (int[]) null);
        }
        field_z = null;
        field_v = null;
    }

    final static id d(byte param0) {
        if (!(tm.field_X != wm.field_a)) {
            throw new IllegalStateException();
        }
        if (param0 != 52) {
            gg.e((byte) -37);
        }
        if (!(tm.field_X != h.field_N)) {
            tm.field_X = wm.field_a;
            return v.field_b;
        }
        return null;
    }

    final static void c(byte param0) {
        jg.field_K = null;
        if (param0 != 24) {
            return;
        }
        a.field_L = null;
    }

    gg(int param0, rn param1, rn param2, rf param3, gm param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_j = new nl(16);
        this.field_x = 0;
        this.field_l = new bb();
        this.field_t = 0L;
        try {
          L0: {
            L1: {
              this.field_y = param1;
              this.field_m = param0;
              if (this.field_y == null) {
                this.field_k = false;
                break L1;
              } else {
                this.field_k = true;
                this.field_w = new bb();
                break L1;
              }
            }
            L2: {
              this.field_u = param2;
              this.field_i = param3;
              this.field_n = param5;
              this.field_e = param6;
              stackIn_6_0 = this;

              if (!param8) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              ((gg) (this)).field_p = stackIn_7_1 != 0;
              this.field_r = param4;
              this.field_f = param7;
              if (this.field_u == null) {
                break L3;
              } else {
                this.field_o = (gn) ((Object) this.field_r.a(this.field_m, this.field_u, 118));
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var10);

            stackIn_12_1 = new StringBuilder().append("gg.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_v = "<%0> has entered another game.";
        field_h = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_z = new int[32];
    }
}
