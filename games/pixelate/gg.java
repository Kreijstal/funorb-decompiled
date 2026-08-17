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
        gn var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = 18 / ((param1 - 33) / 43);
            var3 = this.a(param0, 0, true);
            if (var3 != null) {
              var5 = var3.h(0);
              var3.c(2779);
              stackIn_4_0 = (byte[]) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3_ref), "gg.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final void f(byte param0) {
        gn discarded$0 = null;
        gn discarded$1 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fa var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (this.field_w == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 29) {
                  break L1;
                } else {
                  field_h = (char[]) null;
                  break L1;
                }
              }
              if (null == this.a((byte) 36)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var2 = this.field_l.c(param0 + 1504642244);
                L2: while (true) {
                  if (var2 == null) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L3: {
                      var3 = (int)var2.field_e;
                      if (var3 >= 0) {
                        if (var3 < this.field_g.field_b) {
                          if (this.field_g.field_h[var3] == 0) {
                            var2.c(2779);
                            break L3;
                          } else {
                            L4: {
                              if (this.field_s[var3] == 0) {
                                discarded$0 = this.a(var3, 1, true);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            L5: {
                              if ((this.field_s[var3] ^ -1) == 0) {
                                discarded$1 = this.a(var3, 2, true);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            if (1 == this.field_s[var3]) {
                              var2.c(2779);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          var2.c(2779);
                          break L3;
                        }
                      } else {
                        var2.c(2779);
                        break L3;
                      }
                    }
                    var2 = this.field_l.f(1504642273);
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "gg.H(" + param0 + ')');
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

    private final gn a(int param0, int param1, boolean param2) {
        gn discarded$0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_68_0 = null;
        Object stackIn_78_0 = null;
        Object stackIn_110_0 = null;
        Object stackIn_118_0 = null;
        int decompiledRegionSelector0 = 0;
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
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var12 = (gn) ((Object) this.field_j.a(-25484, (long)param0));
              var4 = var12;
              if (param2) {
                break L1;
              } else {
                discarded$0 = this.a(37, -122, true);
                break L1;
              }
            }
            L2: {
              if (var12 == null) {
                break L2;
              } else {
                if (0 != param1) {
                  break L2;
                } else {
                  if (var12.field_t) {
                    break L2;
                  } else {
                    if (!var12.field_v) {
                      break L2;
                    } else {
                      var12.c(2779);
                      var4 = null;
                      break L2;
                    }
                  }
                }
              }
            }
            L3: {
              if (var4 == null) {
                L4: {
                  if (0 == param1) {
                    L5: {
                      if (this.field_y == null) {
                        break L5;
                      } else {
                        if ((this.field_s[param0] ^ -1) == 0) {
                          break L5;
                        } else {
                          var4 = this.field_r.a(param0, this.field_y, 116);
                          break L4;
                        }
                      }
                    }
                    if (!this.field_i.a(20)) {
                      var4 = this.field_i.a((byte) -31, this.field_m, true, param0, (byte) 2);
                      break L4;
                    } else {
                      return null;
                    }
                  } else {
                    if (1 == param1) {
                      if (null != this.field_y) {
                        var4 = this.field_r.a(param0, 3, this.field_y);
                        break L4;
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
                              break L4;
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
                break L3;
              } else {
                break L3;
              }
            }
            if (!((gn) (var4)).field_v) {
              var18 = ((gn) (var4)).h(0);
              var13 = var18;
              var5 = var13;
              if (var4 instanceof cg) {
                try {
                  L6: {
                    L7: {
                      if (var5 == null) {
                        break L7;
                      } else {
                        if ((var18.length ^ -1) >= -3) {
                          break L7;
                        } else {
                          ra.field_h.reset();
                          ra.field_h.update(var5, 0, -2 + var18.length);
                          var6_int = (int)ra.field_h.getValue();
                          if (var6_int != this.field_g.field_k[param0]) {
                            throw new RuntimeException();
                          } else {
                            L8: {
                              if (this.field_g.field_d == null) {
                                break L8;
                              } else {
                                if (null != this.field_g.field_d[param0]) {
                                  var30 = this.field_g.field_d[param0];
                                  var29 = db.a(var5, 0, 1761872464, -2 + var18.length);
                                  var11 = 0;
                                  var9 = var11;
                                  L9: while (true) {
                                    if (64 <= var11) {
                                      break L8;
                                    } else {
                                      if ((var29[var11] ^ -1) == (var30[var11] ^ -1)) {
                                        var11++;
                                        continue L9;
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var7 = (65280 & var5[-2 + var18.length] << -1296059800) + (255 & var5[var18.length + -1]);
                            if (var7 != (65535 & this.field_g.field_a[param0])) {
                              throw new RuntimeException();
                            } else {
                              L10: {
                                if (this.field_s[param0] != 1) {
                                  L11: {
                                    if (0 != this.field_s[param0]) {
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  this.field_s[param0] = (byte) 1;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              L12: {
                                if (((gn) (var4)).field_t) {
                                  break L12;
                                } else {
                                  ((gn) (var4)).c(2779);
                                  break L12;
                                }
                              }
                              stackIn_110_0 = var4;
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L13: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    this.field_s[param0] = (byte)-1;
                    ((gn) (var4)).c(2779);
                    if (((gn) (var4)).field_t) {
                      if (!this.field_i.a(20)) {
                        var4 = this.field_i.a((byte) -31, this.field_m, true, param0, (byte) 2);
                        this.field_j.a((long)param0, 127, (fa) (var4));
                        break L13;
                      } else {
                        return null;
                      }
                    } else {
                      break L13;
                    }
                  }
                  stackIn_118_0 = null;
                  return (gn) ((Object) stackIn_118_0);
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                try {
                  L14: {
                    L15: {
                      if (var5 == null) {
                        break L15;
                      } else {
                        if (-3 > (var18.length ^ -1)) {
                          ra.field_h.reset();
                          ra.field_h.update(var5, 0, -2 + var18.length);
                          var6_int = (int)ra.field_h.getValue();
                          if (var6_int != this.field_g.field_k[param0]) {
                            throw new RuntimeException();
                          } else {
                            L16: {
                              if (null == this.field_g.field_d) {
                                break L16;
                              } else {
                                if (null == this.field_g.field_d[param0]) {
                                  break L16;
                                } else {
                                  var28 = this.field_g.field_d[param0];
                                  var27 = db.a(var5, 0, 1761872464, -2 + var18.length);
                                  var9 = 0;
                                  L17: while (true) {
                                    if (var9 >= 64) {
                                      break L16;
                                    } else {
                                      if (var27[var9] != var28[var9]) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        continue L17;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            this.field_i.field_h = 0;
                            this.field_i.field_m = 0;
                            break L14;
                          }
                        } else {
                          break L15;
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
                      stackIn_68_0 = null;
                      return (gn) ((Object) stackIn_68_0);
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
                L18: {
                  var5[var18.length - 2] = (byte)(this.field_g.field_a[param0] >>> -1775395832);
                  var5[-1 + var18.length] = (byte)this.field_g.field_a[param0];
                  if (this.field_y != null) {
                    this.field_r.a(param0, 45, this.field_y, var18);
                    if (-2 != (this.field_s[param0] ^ -1)) {
                      this.field_s[param0] = (byte) 1;
                      break L18;
                    } else {
                      break L18;
                    }
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (((gn) (var4)).field_t) {
                    break L19;
                  } else {
                    ((gn) (var4)).c(2779);
                    break L19;
                  }
                }
                stackIn_78_0 = var4;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_40_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          throw aa.a((Throwable) (var4), "gg.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gn) ((Object) stackIn_40_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (gn) ((Object) stackIn_78_0);
          } else {
            return (gn) ((Object) stackIn_110_0);
          }
        }
    }

    final int b(int param0, int param1) {
        gn var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 8192) {
                break L1;
              } else {
                gg.d((byte) 22);
                break L1;
              }
            }
            var3 = (gn) ((Object) this.field_j.a(-25484, (long)param0));
            if (var3 == null) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = var3.g(param1 ^ -8303);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3_ref), "gg.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final void a(boolean param0) {
        if (!(null != this.field_y)) {
            return;
        }
        try {
            this.field_q = param0 ? true : false;
            if (this.field_w == null) {
                this.field_w = new bb();
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "gg.J(" + param0 + ')');
        }
    }

    final static void a(boolean param0, String[][] param1, byte[] param2, fm param3, String[] param4, byte[] param5, tf[][] param6, int param7, int param8, tf[][] param9, fm param10, int param11, String[][] param12, fm param13, int[] param14) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        try {
          L0: {
            L1: {
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
            stackIn_6_0 = (RuntimeException) (var15);

            stackIn_6_1 = new StringBuilder().append("gg.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_7_0);

            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_11_0);

            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_18_0 = (RuntimeException) ((Object) stackIn_15_0);

            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param4 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {
            stackIn_22_0 = (RuntimeException) ((Object) stackIn_19_0);

            stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param5 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {
            stackIn_26_0 = (RuntimeException) ((Object) stackIn_23_0);

            stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param6 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          L8: {
            stackIn_30_0 = (RuntimeException) ((Object) stackIn_27_0);

            stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {
            stackIn_34_0 = (RuntimeException) ((Object) stackIn_31_0);

            stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param10 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L9;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L9;
            }
          }
          L10: {
            stackIn_38_0 = (RuntimeException) ((Object) stackIn_35_0);

            stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L10;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L10;
            }
          }
          L11: {
            stackIn_42_0 = (RuntimeException) ((Object) stackIn_39_0);

            stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');

            if (param13 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L11;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L11;
            }
          }
          L12: {
            stackIn_46_0 = (RuntimeException) ((Object) stackIn_43_0);

            stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');

            if (param14 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L12;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L12;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ')');
        }
    }

    final void b(int param0) {
        gn discarded$0 = null;
        gn discarded$1 = null;
        gn discarded$2 = null;
        gn discarded$3 = null;
        gn discarded$4 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var2_int = 0;
        gn var2_ref = null;
        RuntimeException var2_ref2 = null;
        fa var3 = null;
        int var4 = 0;
        int var5 = 0;
        fa var6 = null;
        fa var7 = null;
        var2 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_w != null) {
                if (null != this.a((byte) 36)) {
                  if (!this.field_k) {
                    if (!this.field_q) {
                      this.field_w = null;
                      break L1;
                    } else {
                      var2_int = 1;
                      var3 = this.field_w.c(param0 ^ 1504642273);
                      L2: while (true) {
                        if (var3 == null) {
                          L3: while (true) {
                            L4: {
                              if (this.field_x >= this.field_g.field_h.length) {
                                break L4;
                              } else {
                                if ((this.field_g.field_h[this.field_x] ^ -1) != -1) {
                                  if (this.field_i.d((byte) 97)) {
                                    var2_int = 0;
                                    break L4;
                                  } else {
                                    L5: {
                                      if (1 != this.field_s[this.field_x]) {
                                        discarded$0 = this.a(this.field_x, 2, true);
                                        break L5;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (-2 == (this.field_s[this.field_x] ^ -1)) {
                                        break L6;
                                      } else {
                                        var7 = new fa();
                                        var7.field_e = (long)this.field_x;
                                        this.field_w.a(22125, var7);
                                        var2_int = 0;
                                        break L6;
                                      }
                                    }
                                    this.field_x = this.field_x + 1;
                                    continue L3;
                                  }
                                } else {
                                  this.field_x = this.field_x + 1;
                                  continue L3;
                                }
                              }
                            }
                            if (var2_int != 0) {
                              this.field_x = 0;
                              this.field_q = false;
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        } else {
                          L7: {
                            var4 = (int)var3.field_e;
                            if (1 == this.field_s[var4]) {
                              break L7;
                            } else {
                              discarded$1 = this.a(var4, 2, true);
                              break L7;
                            }
                          }
                          L8: {
                            if (this.field_s[var4] != 1) {
                              var2_int = 0;
                              break L8;
                            } else {
                              var3.c(param0 ^ 2779);
                              break L8;
                            }
                          }
                          var3 = this.field_w.f(1504642273);
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var2_int = 1;
                    var3 = this.field_w.c(1504642273);
                    L9: while (true) {
                      if (var3 == null) {
                        L10: while (true) {
                          L11: {
                            if (this.field_g.field_h.length <= this.field_x) {
                              break L11;
                            } else {
                              if (0 != this.field_g.field_h[this.field_x]) {
                                if (250 > this.field_r.field_c) {
                                  L12: {
                                    if (this.field_s[this.field_x] == 0) {
                                      discarded$2 = this.a(this.field_x, 1, true);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (0 == this.field_s[this.field_x]) {
                                      var6 = new fa();
                                      var6.field_e = (long)this.field_x;
                                      this.field_w.a(22125, var6);
                                      var2_int = 0;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  this.field_x = this.field_x + 1;
                                  continue L10;
                                } else {
                                  var2_int = 0;
                                  break L11;
                                }
                              } else {
                                this.field_x = this.field_x + 1;
                                continue L10;
                              }
                            }
                          }
                          if (var2_int == 0) {
                            break L1;
                          } else {
                            this.field_k = false;
                            this.field_x = 0;
                            break L1;
                          }
                        }
                      } else {
                        L14: {
                          var4 = (int)var3.field_e;
                          if (0 != this.field_s[var4]) {
                            break L14;
                          } else {
                            discarded$3 = this.a(var4, 1, true);
                            break L14;
                          }
                        }
                        L15: {
                          if (-1 != (this.field_s[var4] ^ -1)) {
                            var3.c(2779);
                            break L15;
                          } else {
                            var2_int = 0;
                            break L15;
                          }
                        }
                        var3 = this.field_w.f(1504642273);
                        continue L9;
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            L16: {
              if (param0 == 0) {
                break L16;
              } else {
                discarded$4 = this.a(112, 27, true);
                break L16;
              }
            }
            L17: {
              if (!this.field_p) {
                break L17;
              } else {
                if ((hm.a(64) ^ -1L) > (this.field_t ^ -1L)) {
                  break L17;
                } else {
                  var2_ref = (gn) ((Object) this.field_j.a((byte) -99));
                  L18: while (true) {
                    if (var2_ref == null) {
                      this.field_t = 1000L + hm.a(64);
                      break L17;
                    } else {
                      L19: {
                        if (!var2_ref.field_v) {
                          if (!var2_ref.field_x) {
                            var2_ref.field_x = true;
                            break L19;
                          } else {
                            if (!var2_ref.field_t) {
                              throw new RuntimeException();
                            } else {
                              var2_ref.c(param0 + 2779);
                              break L19;
                            }
                          }
                        } else {
                          break L19;
                        }
                      }
                      var2_ref = (gn) ((Object) this.field_j.a(-123));
                      continue L18;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref2), "gg.O(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final kj a(byte param0) {
        kj stackIn_7_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_45_0 = null;
        kj stackIn_53_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 36) {
                break L1;
              } else {
                this.b(-6, -35);
                break L1;
              }
            }
            if (this.field_g != null) {
              stackIn_7_0 = this.field_g;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (this.field_o == null) {
                  if (!this.field_i.a(20)) {
                    this.field_o = (gn) ((Object) this.field_i.a((byte) -31, 255, true, this.field_m, (byte) 0));
                    break L2;
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              if (!this.field_o.field_v) {
                L3: {
                  var7 = this.field_o.h(0);
                  var6 = var7;
                  var5 = var6;
                  var2 = var5;
                  if (!(this.field_o instanceof cg)) {
                    try {
                      L4: {
                        if (var5 == null) {
                          throw new RuntimeException();
                        } else {
                          this.field_g = new kj(var7, this.field_n, this.field_e);
                          break L4;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3 = decompiledCaughtException;
                        this.field_i.e((byte) 0);
                        this.field_g = null;
                        if (this.field_i.a(param0 ^ 48)) {
                          this.field_o = null;
                          break L5;
                        } else {
                          this.field_o = (gn) ((Object) this.field_i.a((byte) -31, 255, true, this.field_m, (byte) 0));
                          break L5;
                        }
                      }
                      stackIn_45_0 = null;
                      return (kj) ((Object) stackIn_45_0);
                    }
                    if (null == this.field_u) {
                      break L3;
                    } else {
                      this.field_r.a(this.field_m, 93, this.field_u, var7);
                      break L3;
                    }
                  } else {
                    try {
                      L6: {
                        if (var5 == null) {
                          throw new RuntimeException();
                        } else {
                          this.field_g = new kj(var7, this.field_n, this.field_e);
                          if (this.field_g.field_c == this.field_f) {
                            break L6;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L7: {
                        var3 = decompiledCaughtException;
                        this.field_g = null;
                        if (this.field_i.a(20)) {
                          this.field_o = null;
                          break L7;
                        } else {
                          this.field_o = (gn) ((Object) this.field_i.a((byte) -31, 255, true, this.field_m, (byte) 0));
                          break L7;
                        }
                      }
                      stackIn_33_0 = null;
                      return (kj) ((Object) stackIn_33_0);
                    }
                    break L3;
                  }
                }
                L8: {
                  if (this.field_y != null) {
                    this.field_s = new byte[this.field_g.field_b];
                    break L8;
                  } else {
                    break L8;
                  }
                }
                this.field_o = null;
                stackIn_53_0 = this.field_g;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_18_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "gg.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (kj) ((Object) stackIn_18_0);
          } else {
            return stackIn_53_0;
          }
        }
    }

    public static void e(byte param0) {
        try {
            field_h = null;
            if (param0 != 45) {
                gg.a(true, (String[][]) null, (byte[]) null, (fm) null, (String[]) null, (byte[]) null, (tf[][]) null, -91, 127, (tf[][]) null, (fm) null, 112, (String[][]) null, (fm) null, (int[]) null);
            }
            field_z = null;
            field_v = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "gg.N(" + param0 + ')');
        }
    }

    final static id d(byte param0) {
        id stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            if (tm.field_X == wm.field_a) {
              throw new IllegalStateException();
            } else {
              L1: {
                if (param0 == 52) {
                  break L1;
                } else {
                  gg.e((byte) -37);
                  break L1;
                }
              }
              if (tm.field_X == h.field_N) {
                tm.field_X = wm.field_a;
                stackIn_10_0 = v.field_b;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                stackIn_12_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "gg.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return (id) ((Object) stackIn_12_0);
        }
    }

    final static void c(byte param0) {
        jg.field_K = null;
        if (param0 != 24) {
            return;
        }
        try {
            a.field_L = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "gg.M(" + param0 + ')');
        }
    }

    gg(int param0, rn param1, rn param2, rf param3, gm param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
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
              if (this.field_u != null) {
                this.field_o = (gn) ((Object) this.field_r.a(this.field_m, this.field_u, 118));
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var10);

            stackIn_15_1 = new StringBuilder().append("gg.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_16_0);

            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {
            stackIn_23_0 = (RuntimeException) ((Object) stackIn_20_0);

            stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          L7: {
            stackIn_27_0 = (RuntimeException) ((Object) stackIn_24_0);

            stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param4 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          L8: {
            stackIn_31_0 = (RuntimeException) ((Object) stackIn_28_0);

            stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_v = "<%0> has entered another game.";
        field_h = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_z = new int[32];
    }
}
