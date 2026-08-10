/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends hg {
    boolean field_h;
    ed field_i;
    static String field_q;
    int field_l;
    int field_k;
    int field_j;
    private int field_s;
    private int field_m;
    boolean field_p;
    boolean field_r;
    int field_g;
    private ed field_t;
    int field_o;
    int field_n;

    private final void a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        var4 = 100;
        var5 = ma.field_a.field_cb % var4;
        if (null == this.field_i) {
          return;
        } else {
          L0: {
            var6 = this.field_i.field_A;
            var7 = this.field_i.field_z;
            var8 = var6 - -((var4 - var5) * 2 * var6 / var4);
            var9 = (-var5 + var4) * var7 * 2 / var4 + var7;
            if (!param0) {
              break L0;
            } else {
              this.a(false, -79, -121);
              break L0;
            }
          }
          L1: {
            var10 = var5 * 128 / var4;
            var11 = 16711680;
            var12 = this.field_g + (-param2 - (var9 - var7) / 2);
            var13 = var9 + var12;
            var14 = 480;
            if (-1 < (var13 ^ -1)) {
              break L1;
            } else {
              if (var12 < var14) {
                L2: {
                  L3: {
                    var15 = -param1 + this.field_k - (var8 - var6) / 2;
                    var16 = var8 + var15;
                    var17 = ma.field_a.field_n;
                    em.b(var15, var12, var8, var9, var11, var10);
                    if (-1 <= (var15 ^ -1)) {
                      break L3;
                    } else {
                      if (var17 > var16) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if (0 >= var15) {
                      var15 = var15 + var17;
                      break L4;
                    } else {
                      var15 = var15 - var17;
                      break L4;
                    }
                  }
                  em.b(var15, var12, var8, var9, var11, var10);
                  break L2;
                }
                return;
              } else {
                break L1;
              }
            }
          }
          return;
        }
    }

    final static void d(byte param0) {
        if (param0 != 27) {
            sa.d((byte) -32);
        }
        je.field_a = new cn();
    }

    private final fn b(boolean param0) {
        rk[] var4 = w.c(false);
        var4 = var4;
        if (!param0) {
            return (fn) null;
        }
        if (var4 == null) {
            return null;
        }
        return var4[this.field_n].a((byte) 120, this.field_l);
    }

    final static void a(int param0, int param1, boolean param2, ed[] param3, int param4, int param5, ed[] param6, int param7, int param8, wl param9, int param10, boolean param11) {
        try {
            di.a(param3, param8, param5, param10, param0, param5, param9, param1, param6, param11, param8, param4, param9, (byte) -41, param7);
            if (param2) {
                field_q = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "sa.K(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ',' + param11 + ')');
        }
    }

    private final ed d(int param0) {
        if (param0 != 0) {
            sa.a(22, (byte) 101);
        }
        rk[] var4 = w.c(false);
        var4 = var4;
        if (var4 == null) {
            return null;
        }
        return var4[this.field_n].a(-125, this.field_l);
    }

    sa(int param0, int param1, int param2, int param3, boolean param4, boolean param5, int param6) {
        this(param0, param1, param2, param3);
        this.field_p = param5 ? true : false;
        this.field_l = param6;
        this.field_r = param4 ? true : false;
        this.e(-7012);
    }

    final void a(boolean param0, oe param1) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            if (this.field_i != null) {
              var3_int = 0;
              var4 = 0;
              L1: while (true) {
                if (this.field_i.field_x <= var4) {
                  L2: {
                    if (param0) {
                      break L2;
                    } else {
                      this.field_j = -96;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = var4 + (this.field_g + this.field_i.field_v);
                  var6 = var5 >> -2029909435;
                  var5 = var5 & 31;
                  var7 = 0;
                  L3: while (true) {
                    if (var7 >= this.field_i.field_s) {
                      var4++;
                      continue L1;
                    } else {
                      var8 = var7 + (this.field_i.field_q + this.field_k);
                      var9 = var8 >> 1052355877;
                      var8 = var8 & 31;
                      L4: while (true) {
                        if (-1 >= (var9 ^ -1)) {
                          L5: {
                            var9 = var9 % param1.field_Mb;
                            if (this.field_i.field_B[var3_int] != 0) {
                              var10 = param1.field_V[var9 + param1.field_Mb * var6];
                              if (si.field_v != var10) {
                                L6: {
                                  if (var10 == null) {
                                    var10 = new int[32];
                                    param1.field_V[var9 + var6 * param1.field_Mb] = new int[32];
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                var10[var5] = lb.a(var10[var5], 1 << var8);
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          var3_int++;
                          var7++;
                          continue L3;
                        } else {
                          var9 = var9 + param1.field_Mb;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3);

            stackIn_25_1 = new StringBuilder().append("sa.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        var13 = EscapeVector.field_A;
        if (this.field_i == null) {
          return;
        } else {
          L0: {
            var4 = null;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            var9 = 0;
            if (!this.field_h) {
              break L0;
            } else {
              var9 = this.a((byte) 54);
              if (var9 <= 0) {
                break L0;
              } else {
                L1: {
                  var5 = this.field_s;
                  var4 = this.field_t;
                  var6 = this.field_m;
                  if ((var5 ^ -1) <= -1) {
                    break L1;
                  } else {
                    var7 = -var5;
                    break L1;
                  }
                }
                if ((var6 ^ -1) > -1) {
                  var8 = -var6;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L2: {
            var10 = this.field_g + -param0;
            if (var10 >= 480 + var8) {
              break L2;
            } else {
              if (var10 <= -this.field_i.field_z) {
                break L2;
              } else {
                var11 = -param2 + (this.field_k + ma.field_a.field_n + ma.field_a.field_n) - var7;
                var12 = this.field_i.field_A + var7 - -var7;
                var11 = var11 + var12;
                var11 = var11 % ma.field_a.field_n;
                var11 = var11 - var12;
                L3: while (true) {
                  if (var11 >= 640) {
                    L4: {
                      if (param1 > 106) {
                        break L4;
                      } else {
                        this.a(false, -48, -24);
                        break L4;
                      }
                    }
                    L5: {
                      if (!this.field_r) {
                        break L5;
                      } else {
                        this.a(false, param2, param0);
                        break L5;
                      }
                    }
                    return;
                  } else {
                    L6: {
                      if (var4 == null) {
                        this.field_i.e(var11, var10);
                        break L6;
                      } else {
                        this.field_i.e(var11 + var7, var10);
                        ((ed) (var4)).c(var5 + var11 - -var7, var10 - -var6, this.a((byte) 122));
                        break L6;
                      }
                    }
                    var11 = var11 + ma.field_a.field_n;
                    continue L3;
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final int a(byte param0) {
        double var2_double = 0.0;
        double var4 = 0.0;
        if (param0 < 36) {
            field_q = (String) null;
        }
        if ((this.field_n ^ -1) != -3) {
            var2_double = (double)(ma.field_a.field_Zb / 8);
            if (!(!kg.a((byte) -98, this.field_n))) {
                var2_double = (double)(ma.field_a.field_cb % 100) / 100.0;
            }
            var4 = Math.cos(3.141592653589793 * var2_double) + 2.0;
            return (int)(var4 * var4 * 28.0);
        }
        int var2 = -42 + this.field_o;
        if (!(var2 > 0)) {
            return 0;
        }
        return 16 * var2;
    }

    private final void e(int param0) {
        this.field_i = k.a(this.field_l, (byte) -39, this.field_n);
        this.field_t = this.d(0);
        fn var2 = this.b(true);
        if (param0 != -7012) {
            return;
        }
        if (var2 == null) {
            return;
        }
        this.field_s = var2.field_c;
        this.field_m = var2.field_b;
    }

    sa(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        this(param0, param1, param2, param3);
        this.field_r = param4 ? true : false;
        this.field_p = param5 ? true : false;
    }

    final static void a(int param0, byte param1) {
        tj var2 = null;
        String var2_ref = null;
        String var3 = null;
        ed[] var4 = null;
        String[] var5 = null;
        tj var6 = null;
        if (!(!hi.a(param0, -2))) {
            var2 = new tj(ic.field_n, ae.field_c, qh.field_j, true);
            re.a(1820, var2);
        }
        if (param1 >= -69) {
            return;
        }
        if (!(-3 != (param0 ^ -1))) {
            var2_ref = "vengeance_intro";
            var3 = "scene";
            var4 = tm.field_cb;
            var5 = me.field_o;
            var6 = new tj(var2_ref, var3, var4, var5, true);
            re.a(1820, var6);
        }
    }

    final boolean e(byte param0) {
        if (mf.a(this.field_n, -64)) {
            return false;
        }
        if (1 == this.field_n) {
            return false;
        }
        if (!(5 != this.field_n)) {
            return false;
        }
        if (!(this.field_n != 6)) {
            return false;
        }
        if (param0 != -5) {
            return false;
        }
        if (-8 != (this.field_n ^ -1)) {
            return true;
        }
        return false;
    }

    final void a(oe param0, byte param1) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        var12 = EscapeVector.field_A;
        try {
          L0: {
            if (this.field_i == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = 0;
                if (param1 >= 58) {
                  break L1;
                } else {
                  this.e(-105);
                  break L1;
                }
              }
              var4 = 0;
              L2: while (true) {
                if (this.field_i.field_x <= var4) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = var4 + this.field_i.field_v + this.field_g;
                  var6 = var5 >> -80604379;
                  var5 = var5 & 31;
                  var7 = 0;
                  L3: while (true) {
                    if (var7 >= this.field_i.field_s) {
                      var4++;
                      continue L2;
                    } else {
                      var8 = var7 + (this.field_k - -this.field_i.field_q);
                      var9 = var8 >> -1524317179;
                      var8 = var8 & 31;
                      L4: while (true) {
                        if (0 <= var9) {
                          L5: {
                            var9 = var9 % param0.field_Mb;
                            if (null != ma.field_a.field_eb) {
                              ma.field_a.field_eb.a(var9, var6, true);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            if (0 != this.field_i.field_B[var3_int]) {
                              var10 = param0.field_V[param0.field_Mb * var6 + var9];
                              if (var10 != null) {
                                if (si.field_v == var10) {
                                  var13 = new int[32];
                                  var10 = var13;
                                  param0.field_V[param0.field_Mb * var6 - -var9] = new int[32];
                                  var11 = 0;
                                  L7: while (true) {
                                    if (-33 >= (var11 ^ -1)) {
                                      var10[var5] = ae.a(var10[var5], 1 << var8 ^ -1);
                                      break L6;
                                    } else {
                                      var13[var11] = -1;
                                      var11++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var10[var5] = ae.a(var10[var5], 1 << var8 ^ -1);
                                  var3_int++;
                                  var7++;
                                  continue L3;
                                }
                              } else {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          var3_int++;
                          var7++;
                          continue L3;
                        } else {
                          var9 = var9 + param0.field_Mb;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("sa.C(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            wl var2 = (wl) null;
            sa.a(77, 13, true, (ed[]) null, -108, -59, (ed[]) null, -14, -30, (wl) null, -40, true);
        }
        field_q = null;
    }

    sa(int param0, int param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        L0: {
          L1: {
            this.field_o = 0;
            this.field_g = param3;
            this.field_k = param2;
            this.field_j = param0;
            this.field_n = param1;
            stackIn_2_0 = this;

            if ((param1 ^ -1) == -3) {
              break L1;
            } else {
              stackIn_3_0 = this;
              stackIn_2_0 = stackIn_3_0;
              if (!kg.a((byte) -125, this.field_n)) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackIn_4_0 = this;
          stackIn_4_1 = 1;
          break L0;
        }
        ((sa) (this)).field_h = stackIn_4_1 != 0;
        this.field_p = false;
        this.field_r = false;
        this.field_l = 0;
        this.e(-7012);
    }

    static {
        field_q = "Enter the cave, find the container,<br>and land next to it to attach your tether.";
    }
}
