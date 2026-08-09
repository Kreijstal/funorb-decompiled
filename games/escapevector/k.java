/*
 * Decompiled by CFR-JS 0.4.0.
 */
class k implements db, ao {
    int field_k;
    int field_h;
    int field_i;
    static ed field_j;
    int field_c;
    int field_g;
    int field_f;
    int field_o;
    int field_n;
    int field_m;
    wl field_l;
    int field_b;
    private int field_e;
    static String field_p;
    static cn field_d;
    private boolean field_a;

    public final int a(byte param0, hm param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -113) {
              stackIn_4_0 = this.a(0, param1, -18079, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -25;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("k.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final int a(int param0, int param1, int param2, int param3, int param4, hm param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 > 81) {
                break L1;
              } else {
                this.field_e = -116;
                break L1;
              }
            }
            this.b(param5, 90);
            stackIn_3_0 = param5.field_p.a((byte) 39, param3 - this.a((byte) -113, param5, param0), param2 - this.a(param5, param1, -16956));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("k.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(hm param0, int param1, int param2) {
        RuntimeException var4 = null;
        hm var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -16956) {
                break L1;
              } else {
                var5 = (hm) null;
                this.a(-8, (hm) null);
                break L1;
              }
            }
            stackIn_3_0 = this.b(param0, 0, 0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("k.C(");

            if (param0 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(hm param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        hm var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param1, this.field_h, this.field_e, param2, 0, 0, true, param0);
              if (param3 < -15) {
                break L1;
              } else {
                var6 = (hm) null;
                this.a((byte) 102, (hm) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("k.HA(");

            if (param0 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int b(hm param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        hm var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var6 = (hm) null;
                this.a(-51, -123, -119, 54, -115, (hm) null);
                break L1;
              }
            }
            stackIn_3_0 = param2 + (param0.field_v + this.field_f + (param3 + param0.field_j));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("k.BA(");

            if (param0 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static ed a(int param0, byte param1, int param2) {
        rk[] var5;
        var5 = w.c(false);
        var5 = var5;
        if (var5 != null) {
          if (param1 != -39) {
            k.a(true, '￾');
            return var5[param2].a(false, param0);
          } else {
            return var5[param2].a(false, param0);
          }
        } else {
          return null;
        }
    }

    public void a(int param0, int param1, int param2, hm param3, boolean param4) {
        if (null == this.field_l) {
            return;
        }
        try {
            if (param2 >= -14) {
                hm var7 = (hm) null;
                this.a((hm) null, -75, 106, 104, false);
            }
            this.a(param3, param1, param0, -100);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "k.M(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final int a(hm param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -25033) {
                break L1;
              } else {
                this.field_g = 7;
                break L1;
              }
            }
            stackIn_3_0 = -this.field_b + -this.field_n + param0.field_g;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("k.J(");

            if (param0 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, hm param2, int param3, int param4, int param5) {
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vl var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        hm var17 = null;
        pg var18 = null;
        pg var19 = null;
        var16 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param4 == -613528456) {
                break L1;
              } else {
                var17 = (hm) null;
                this.a(-128, 94, 31, -40, 4, (hm) null);
                break L1;
              }
            }
            if (param3 != param1) {
              if (param2.h(0)) {
                L2: {
                  var18 = this.b(param2, 90);
                  var19 = var18;
                  if (param1 <= param3) {
                    var8 = param1;
                    var9 = param3;
                    break L2;
                  } else {
                    var9 = param1;
                    var8 = param3;
                    break L2;
                  }
                }
                var10 = var19.a(var8, 0);
                var11 = var19.a(var9, 0);
                rd.a(param2.field_g + (param2.field_k + param0), param0 + param2.field_k, param2.field_x + (param2.field_j + param5), 19807, param5 - -param2.field_j);
                var12 = var10;
                L3: while (true) {
                  if (var11 < var12) {
                    dl.a((byte) -59);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L4: {
                      var13 = var18.field_a[var12];
                      if (var12 == var10) {
                        stackIn_15_0 = var19.a((byte) 127, var8);
                        break L4;
                      } else {
                        stackIn_15_0 = var13.field_b[0];
                        break L4;
                      }
                    }
                    L5: {
                      var14 = stackIn_15_0;
                      if (var12 == var11) {
                        stackIn_20_0 = var19.a((byte) -9, var9);
                        break L5;
                      } else {
                        if (var13 == null) {
                          stackIn_20_0 = 0;
                          break L5;
                        } else {
                          stackIn_20_0 = var13.field_b[var13.field_b.length + -1];
                          break L5;
                        }
                      }
                    }
                    var15 = stackIn_20_0;
                    mb.field_g.a(var13.field_a, 1, this.field_i >>> -613528456, var13.field_d + (param5 + param2.field_j) - (-this.field_f - param2.field_v), var15 - var14, this.field_i, this.a(var14, param2, -18079, param0));
                    var12++;
                    continue L3;
                  }
                }
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("k.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, hm param7) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              rd.a(param3 - -param7.field_k + param7.field_g, param3 + param7.field_k, param0 - (-param7.field_j + -param7.field_x), 19807, param7.field_j + param0);
              var9_int = this.a(param7, -25033);
              var10 = this.b(-14072, param7);
              if (this.field_a) {
                this.field_l.a(this.b((byte) 39, param7), this.a(param5, param7, -18079, param3), this.b(param7, 0, param4, param0), var9_int, var10, param1, param2, this.field_m, this.field_c, this.field_k);
                break L1;
              } else {
                L2: {
                  var12 = this.field_c;
                  if (var12 != 0) {
                    if ((var12 ^ -1) == -3) {
                      var11 = -this.field_l.field_x + var10;
                      break L2;
                    } else {
                      L3: {
                        if (-4 != (var12 ^ -1)) {
                          if (-2 == (var12 ^ -1)) {
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var11 = this.field_l.field_r - -(var10 + -this.field_l.field_r + -this.field_l.field_x >> -1628178975);
                      break L2;
                    }
                  } else {
                    var11 = this.field_l.field_r;
                    break L2;
                  }
                }
                L4: {
                  var12 = this.field_m;
                  if (0 == var12) {
                    break L4;
                  } else {
                    if (-4 != (var12 ^ -1)) {
                      if ((var12 ^ -1) == -2) {
                        this.field_l.c(this.b((byte) 39, param7), this.a(param5, param7, -18079, param3) - -(var9_int >> -571258943), this.b(param7, 0, param4, param0) + var11, param1, param2);
                        break L1;
                      } else {
                        if (2 == var12) {
                          this.field_l.b(this.b((byte) 39, param7), this.a(param5, param7, -18079, param3) - -var9_int, var11 + this.b(param7, 0, param4, param0), param1, param2);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                this.field_l.a(this.b((byte) 39, param7), this.a(param5, param7, -18079, param3), var11 + this.b(param7, 0, param4, param0), param1, param2);
                break L1;
              }
            }
            L5: {
              if (param6) {
                break L5;
              } else {
                k.b(85);
                break L5;
              }
            }
            dl.a((byte) 125);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var9);

            stackIn_28_1 = new StringBuilder().append("k.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    private final int a(int param0, hm param1, int param2, int param3) {
        int discarded$1 = 0;
        RuntimeException var5 = null;
        hm var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -18079) {
                break L1;
              } else {
                var6 = (hm) null;
                discarded$1 = this.a(39, (hm) null, 121, 83);
                break L1;
              }
            }
            stackIn_3_0 = param0 + (this.field_n + param1.field_k) + (param3 + param1.field_n);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("k.EA(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    private final int b(int param0, hm param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -14072) {
                break L1;
              } else {
                this.field_i = 0;
                break L1;
              }
            }
            stackIn_3_0 = -this.field_o + (param1.field_x + -this.field_f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("k.W(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(k param0, int param1) {
        try {
            param0.field_f = this.field_f;
            param0.field_g = this.field_g;
            param0.field_m = this.field_m;
            param0.field_e = this.field_e;
            param0.field_o = this.field_o;
            param0.field_b = this.field_b;
            if (param1 <= 56) {
                this.field_e = 60;
            }
            param0.field_n = this.field_n;
            param0.field_l = this.field_l;
            param0.field_k = this.field_k;
            param0.field_i = this.field_i;
            param0.field_c = this.field_c;
            param0.field_a = this.field_a;
            param0.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "k.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int a(int param0) {
        if (param0 < 96) {
          field_p = (String) null;
          return this.field_l.field_r + this.field_l.field_x;
        } else {
          return this.field_l.field_r + this.field_l.field_x;
        }
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != -24239) {
            return;
        }
        field_p = null;
        field_j = null;
    }

    final static boolean a(boolean param0, char param1) {
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        if (param0) {
          if (48 > param1) {
            if (65 > param1) {
              if (param1 >= 97) {
                if (122 < param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param1 <= 90) {
                stackIn_67_0 = 1;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (param1 < 97) {
                      break L1;
                    } else {
                      if (122 < param1) {
                        break L1;
                      } else {
                        stackIn_64_0 = 1;
                        break L0;
                      }
                    }
                  }
                  stackIn_64_0 = 0;
                  break L0;
                }
                return stackIn_64_0 != 0;
              }
            }
          } else {
            if (param1 > 57) {
              if (65 > param1) {
                if (param1 >= 97) {
                  if (122 < param1) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (param1 > 90) {
                  L2: {
                    L3: {
                      if (param1 < 97) {
                        break L3;
                      } else {
                        if (122 < param1) {
                          break L3;
                        } else {
                          stackIn_50_0 = 1;
                          break L2;
                        }
                      }
                    }
                    stackIn_50_0 = 0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackIn_45_0 = 1;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackIn_40_0 = 1;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          field_j = (ed) null;
          if (48 <= param1) {
            if (param1 > 57) {
              if (65 > param1) {
                if (param1 >= 97) {
                  if (122 >= param1) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (param1 > 90) {
                  L4: {
                    L5: {
                      if (param1 < 97) {
                        break L5;
                      } else {
                        if (122 < param1) {
                          break L5;
                        } else {
                          stackIn_28_0 = 1;
                          break L4;
                        }
                      }
                    }
                    stackIn_28_0 = 0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackIn_23_0 = 1;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              return true;
            }
          } else {
            if (65 > param1) {
              if (param1 >= 97) {
                if (122 < param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param1 > 90) {
                if (param1 >= 97) {
                  if (122 < param1) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    String b(byte param0, hm param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 39) {
                break L1;
              } else {
                field_d = (cn) null;
                break L1;
              }
            }
            stackIn_3_0 = param1.field_l;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("k.N(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(hm param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException runtimeException = null;
        int var7 = 0;
        vl var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        pg var13 = null;
        pg var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4) {
                break L1;
              } else {
                this.field_h = 30;
                break L1;
              }
            }
            L2: {
              if (!param0.h(0)) {
                break L2;
              } else {
                L3: {
                  var13 = this.b(param0, 90);
                  var14 = var13;
                  var7 = var14.a(param1, 0);
                  var8 = var13.field_a[var7];
                  var9 = var14.a((byte) 122, param1);
                  var10 = this.a(var9, param0, -18079, param2);
                  var11 = this.a(param0, param3, -16956) - -Math.max(0, var8.field_d);
                  stackIn_5_0 = this.a(param0, param3, -16956);

                  stackIn_5_1 = this.b(-14072, param0);

                  stackIn_5_2 = var8.field_a;

                  if (var7 - -1 >= var14.field_a.length) {
                    stackIn_6_0 = stackIn_5_0;
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = stackIn_5_2;
                    stackIn_6_3 = var8.field_a;
                    break L3;
                  } else {
                    stackIn_6_0 = stackIn_5_0;
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = stackIn_5_2;
                    stackIn_6_3 = var13.field_a[1 + var7].field_d;
                    break L3;
                  }
                }
                var12 = stackIn_6_0 + Math.min(stackIn_6_1, Math.min(stackIn_6_2, stackIn_6_3));
                rd.a(param0.field_g + param2 - -param0.field_k, param0.field_k + param2, param3 + (param0.field_j - -param0.field_x), 19807, param0.field_j + param3);
                mb.field_g.a(var10, var12, -29666, var10, var11, this.field_g);
                dl.a((byte) 122);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("k.H(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    k(wl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    protected k() {
    }

    public final pg b(hm param0, int param1) {
        RuntimeException var3 = null;
        hm var4 = null;
        pg stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == param0.field_p) {
                param0.field_p = (pg) ((Object) new wh());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_a) {
                ((wh) ((Object) param0.field_p)).a(this.b(param1 + -14162, param0), this.b((byte) 39, param0), this.field_l, this.a(param0, param1 + -25123), this.field_m, this.field_c, this.field_k, (byte) -13);
                break L2;
              } else {
                this.c(param0, -86);
                break L2;
              }
            }
            L3: {
              if (param1 == 90) {
                break L3;
              } else {
                var4 = (hm) null;
                this.a((byte) 117, (hm) null, -58);
                break L3;
              }
            }
            stackIn_9_0 = param0.field_p;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("k.B(");

            if (param0 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    private final void c(hm param0, int param1) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (null != param0.field_p) {
                break L1;
              } else {
                param0.field_p = (pg) ((Object) new wh());
                break L1;
              }
            }
            L2: {
              var3_int = this.a(param0, -25033);
              if (param1 < -6) {
                break L2;
              } else {
                this.field_c = 29;
                break L2;
              }
            }
            L3: {
              var4 = this.b(-14072, param0);
              var6 = this.field_c;
              if (var6 != 0) {
                if (2 != var6) {
                  L4: {
                    if (var6 != 3) {
                      if ((var6 ^ -1) == -2) {
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var5 = this.field_l.field_r + (-this.field_l.field_r + var4 - this.field_l.field_x >> -301196447);
                  break L3;
                } else {
                  var5 = var4 - this.field_l.field_x;
                  break L3;
                }
              } else {
                var5 = this.field_l.field_r;
                break L3;
              }
            }
            L5: {
              L6: {
                var6 = this.field_m;
                if (-1 != (var6 ^ -1)) {
                  if (var6 == 3) {
                    break L6;
                  } else {
                    if (1 == var6) {
                      if (!(param0.field_p instanceof wh)) {
                        break L5;
                      } else {
                        ((wh) ((Object) param0.field_p)).a(this.b((byte) 39, param0), var3_int >> 1935340193, this.field_l, var5, true);
                        return;
                      }
                    } else {
                      if (2 != var6) {
                        break L5;
                      } else {
                        if (param0.field_p instanceof wh) {
                          ((wh) ((Object) param0.field_p)).a(this.field_l, this.b((byte) 39, param0), var3_int, var5, (byte) 69);
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
              if (!(param0.field_p instanceof wh)) {
                break L5;
              } else {
                ((wh) ((Object) param0.field_p)).a(this.b((byte) 39, param0), 0, 0, var5, this.field_l);
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("k.AA(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
    }

    k(wl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_h = param5;
            this.field_k = param9;
            this.field_g = param10;
            this.field_b = param2;
            this.field_l = param0;
            this.field_c = param8;
            this.field_i = param11;
            this.field_o = param4;
            this.field_e = param6;
            this.field_f = param3;
            this.field_m = param7;
            this.field_n = param1;
            this.field_a = param12 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    public final int a(byte param0, hm param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -46) {
              this.b(param1, 90);
              stackIn_4_0 = param1.field_p.a((byte) -112) + this.field_n + this.field_b;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -89;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("k.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final int a(int param0, hm param1) {
        RuntimeException var3 = null;
        hm var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.b(param1, 90);
              if (param0 <= -95) {
                break L1;
              } else {
                var4 = (hm) null;
                this.a((hm) null, 11, -109, 0);
                break L1;
              }
            }
            stackIn_3_0 = param1.field_p.c(0) + (this.field_f + this.field_o);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("k.F(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_p = "Shield: ";
        field_d = new cn();
    }
}
