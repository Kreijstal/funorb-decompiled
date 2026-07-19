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
        gn discarded$2 = null;
        gn discarded$3 = null;
        fa var2 = null;
        int var3 = 0;
        int var4 = 0;
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
                            discarded$2 = this.a(var3, 1, true);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if ((this.field_s[var3] ^ -1) == 0) {
                            discarded$3 = this.a(var3, 2, true);
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
        gn discarded$2 = null;
        cg discarded$3 = null;
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
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
        Object stackIn_88_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_87_0 = null;
        L0: {
          var10 = Pixelate.field_H ? 1 : 0;
          var12 = (gn) ((Object) this.field_j.a(-25484, (long)param0));
          var4 = var12;
          if (param2) {
            break L0;
          } else {
            discarded$2 = this.a(37, -122, true);
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
                                  if (var29[var11] == var30[var11]) {
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
                          stackOut_87_0 = var4;
                          stackIn_88_0 = stackOut_87_0;
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
                var6_ref = (Exception) (Object) decompiledCaughtException;
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
              var6 = (RuntimeException) (Object) decompiledCaughtException;
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
                discarded$3 = this.field_r.a(param0, 45, this.field_y, var18);
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
        id discarded$0 = null;
        if (param1 != 8192) {
            discarded$0 = gg.d((byte) 22);
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
        id discarded$1 = null;
        RuntimeException var15 = null;
        int[] var16 = null;
        hh[] var17 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
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
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            L1: {
              var17 = (hh[]) null;
              var16 = (int[]) null;
              ro.a(param0, param6, param8, -15690, param10, param4, param14, param1, (hh[]) null, param7, (int[]) null, param2, param12, param3, param9, param5, param13);
              if (param11 > 6) {
                break L1;
              } else {
                discarded$1 = gg.d((byte) 43);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var15 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var15);
            stackOut_3_1 = new StringBuilder().append("gg.I(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param5 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param6 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param9 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param10 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param11).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param12 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          L11: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param13 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          L12: {
            stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param14 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L12;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L12;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
    }

    final void b(int param0) {
        gn discarded$6 = null;
        gn discarded$7 = null;
        gn discarded$8 = null;
        gn discarded$9 = null;
        gn discarded$10 = null;
        gn discarded$11 = null;
        int var2_int = 0;
        gn var2 = null;
        fa var3 = null;
        int var4 = 0;
        int var5 = 0;
        fa var6 = null;
        fa var7 = null;
        L0: {
          L1: {
            L2: {
              var5 = Pixelate.field_H ? 1 : 0;
              if (this.field_w != null) {
                if (null != this.a((byte) 36)) {
                  if (!this.field_k) {
                    if (!this.field_q) {
                      this.field_w = null;
                      break L2;
                    } else {
                      var2_int = 1;
                      var3 = this.field_w.c(param0 ^ 1504642273);
                      L3: while (true) {
                        if (var3 == null) {
                          L4: while (true) {
                            L5: {
                              if (this.field_x >= this.field_g.field_h.length) {
                                break L5;
                              } else {
                                if (this.field_g.field_h[this.field_x] != 0) {
                                  if (this.field_i.d((byte) 97)) {
                                    var2_int = 0;
                                    break L5;
                                  } else {
                                    L6: {
                                      if (1 != this.field_s[this.field_x]) {
                                        discarded$6 = this.a(this.field_x, 2, true);
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (-2 == (this.field_s[this.field_x] ^ -1)) {
                                        break L7;
                                      } else {
                                        var7 = new fa();
                                        var7.field_e = (long)this.field_x;
                                        this.field_w.a(22125, var7);
                                        var2_int = 0;
                                        break L7;
                                      }
                                    }
                                    this.field_x = this.field_x + 1;
                                    continue L4;
                                  }
                                } else {
                                  this.field_x = this.field_x + 1;
                                  continue L4;
                                }
                              }
                            }
                            if (var2_int != 0) {
                              this.field_x = 0;
                              this.field_q = false;
                              break L2;
                            } else {
                              L8: {
                                if (param0 == 0) {
                                  break L8;
                                } else {
                                  discarded$7 = this.a(112, 27, true);
                                  break L8;
                                }
                              }
                              if (!this.field_p) {
                                break L0;
                              } else {
                                if ((hm.a(64) ^ -1L) > (this.field_t ^ -1L)) {
                                  break L0;
                                } else {
                                  var2 = (gn) ((Object) this.field_j.a((byte) -99));
                                  L9: while (true) {
                                    if (var2 == null) {
                                      break L1;
                                    } else {
                                      L10: {
                                        if (!var2.field_v) {
                                          if (!var2.field_x) {
                                            var2.field_x = true;
                                            break L10;
                                          } else {
                                            if (!var2.field_t) {
                                              throw new RuntimeException();
                                            } else {
                                              var2.c(param0 + 2779);
                                              break L10;
                                            }
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                      var2 = (gn) ((Object) this.field_j.a(-123));
                                      continue L9;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          L11: {
                            var4 = (int)var3.field_e;
                            if (1 == this.field_s[var4]) {
                              break L11;
                            } else {
                              discarded$8 = this.a(var4, 2, true);
                              break L11;
                            }
                          }
                          L12: {
                            if (this.field_s[var4] != 1) {
                              var2_int = 0;
                              break L12;
                            } else {
                              var3.c(param0 ^ 2779);
                              break L12;
                            }
                          }
                          var3 = this.field_w.f(1504642273);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2_int = 1;
                    var3 = this.field_w.c(1504642273);
                    L13: while (true) {
                      if (var3 == null) {
                        L14: while (true) {
                          L15: {
                            if (this.field_g.field_h.length <= this.field_x) {
                              break L15;
                            } else {
                              if (0 != this.field_g.field_h[this.field_x]) {
                                if (250 > this.field_r.field_c) {
                                  L16: {
                                    if (this.field_s[this.field_x] == 0) {
                                      discarded$9 = this.a(this.field_x, 1, true);
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  }
                                  L17: {
                                    if (0 == this.field_s[this.field_x]) {
                                      var6 = new fa();
                                      var6.field_e = (long)this.field_x;
                                      this.field_w.a(22125, var6);
                                      var2_int = 0;
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                  this.field_x = this.field_x + 1;
                                  continue L14;
                                } else {
                                  var2_int = 0;
                                  break L15;
                                }
                              } else {
                                this.field_x = this.field_x + 1;
                                continue L14;
                              }
                            }
                          }
                          if (var2_int == 0) {
                            break L2;
                          } else {
                            this.field_k = false;
                            this.field_x = 0;
                            break L2;
                          }
                        }
                      } else {
                        L18: {
                          var4 = (int)var3.field_e;
                          if (0 != this.field_s[var4]) {
                            break L18;
                          } else {
                            discarded$10 = this.a(var4, 1, true);
                            break L18;
                          }
                        }
                        L19: {
                          if (-1 != (this.field_s[var4] ^ -1)) {
                            var3.c(2779);
                            break L19;
                          } else {
                            var2_int = 0;
                            break L19;
                          }
                        }
                        var3 = this.field_w.f(1504642273);
                        continue L13;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                break L2;
              }
            }
            L20: {
              if (param0 == 0) {
                break L20;
              } else {
                discarded$11 = this.a(112, 27, true);
                break L20;
              }
            }
            if (!this.field_p) {
              break L0;
            } else {
              if ((hm.a(64) ^ -1L) > (this.field_t ^ -1L)) {
                break L0;
              } else {
                var2 = (gn) ((Object) this.field_j.a((byte) -99));
                L21: while (true) {
                  if (var2 == null) {
                    break L1;
                  } else {
                    L22: {
                      if (!var2.field_v) {
                        if (!var2.field_x) {
                          var2.field_x = true;
                          break L22;
                        } else {
                          if (!var2.field_t) {
                            throw new RuntimeException();
                          } else {
                            var2.c(param0 + 2779);
                            break L22;
                          }
                        }
                      } else {
                        break L22;
                      }
                    }
                    var2 = (gn) ((Object) this.field_j.a(-123));
                    continue L21;
                  }
                }
              }
            }
          }
          this.field_t = 1000L + hm.a(64);
          break L0;
        }
    }

    final kj a(byte param0) {
        int discarded$2 = 0;
        cg discarded$3 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          if (param0 == 36) {
            break L0;
          } else {
            discarded$2 = this.b(-6, -35);
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
                  discarded$3 = this.field_r.a(this.field_m, 93, this.field_u, var7);
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
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
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
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
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
            stackOut_10_0 = (RuntimeException) (var10);
            stackOut_10_1 = new StringBuilder().append("gg.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_v = "<%0> has entered another game.";
        field_h = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_z = new int[32];
    }
}
