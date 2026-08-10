/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hq implements nl, rk {
    int field_g;
    int field_d;
    int field_f;
    private int field_b;
    static ja field_e;
    int field_r;
    fm field_j;
    int field_n;
    static String field_k;
    static char[] field_o;
    int field_a;
    private boolean field_l;
    int field_h;
    static String[] field_m;
    static sc field_c;
    int field_p;
    int field_q;
    int field_i;

    public final int a(cf param0, boolean param1) {
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
              if (param1) {
                break L1;
              } else {
                hq.a((byte) -88);
                break L1;
              }
            }
            stackIn_3_0 = -this.field_r + param0.field_n + -this.field_n;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hq.P(");

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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(int param0) {
        hq var3;
        if (param0 != 0) {
          var3 = (hq) null;
          this.a(91, (hq) null);
          return this.field_j.field_r + this.field_j.field_C;
        } else {
          return this.field_j.field_r + this.field_j.field_C;
        }
    }

    public final int a(byte param0, cf param1) {
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
            this.a(param1, param0 + -150);
            if (param0 == 39) {
              stackIn_4_0 = param1.field_k.a((byte) -111) - -this.field_g + this.field_p;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 59;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("hq.M(").append(param0).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void b(byte param0) {
        if (!ee.field_b) {
          if (param0 < 12) {
            field_o = (char[]) null;
            return;
          } else {
            return;
          }
        } else {
          oo.f(oo.field_f, oo.field_e, -oo.field_f + oo.field_g, oo.field_d + -oo.field_e);
          rp.field_l.c(false, -1);
          if (param0 >= 12) {
            return;
          } else {
            field_o = (char[]) null;
            return;
          }
        }
    }

    private final void c(cf param0, int param1) {
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
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0.field_k != null) {
                break L1;
              } else {
                param0.field_k = (mp) ((Object) new sp());
                break L1;
              }
            }
            L2: {
              var3_int = this.a(param0, true);
              if (param1 < -123) {
                break L2;
              } else {
                this.field_r = 84;
                break L2;
              }
            }
            L3: {
              var4 = this.a(-99, param0);
              var6 = this.field_a;
              if (0 != var6) {
                if (-3 != (var6 ^ -1)) {
                  L4: {
                    if (3 == var6) {
                      break L4;
                    } else {
                      if (1 == var6) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var5 = this.field_j.field_C - -(var4 - this.field_j.field_C + -this.field_j.field_r >> -1508687327);
                  break L3;
                } else {
                  var5 = -this.field_j.field_r + var4;
                  break L3;
                }
              } else {
                var5 = this.field_j.field_C;
                break L3;
              }
            }
            L5: {
              var6 = this.field_d;
              if (var6 == 0) {
                break L5;
              } else {
                if (3 == var6) {
                  break L5;
                } else {
                  if (1 != var6) {
                    L6: {
                      if (var6 != 2) {
                        break L6;
                      } else {
                        if (!(param0.field_k instanceof sp)) {
                          break L6;
                        } else {
                          ((sp) ((Object) param0.field_k)).a(var3_int, var5, true, this.d(param0, -9327), this.field_j);
                          return;
                        }
                      }
                    }
                    break L0;
                  } else {
                    if (param0.field_k instanceof sp) {
                      ((sp) ((Object) param0.field_k)).a(this.field_j, this.d(param0, -9327), var5, (byte) 65, var3_int >> 1962420033);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            if (param0.field_k instanceof sp) {
              ((sp) ((Object) param0.field_k)).a(0, (byte) -97, this.field_j, this.d(param0, -9327), var5);
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("hq.U(");

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
          throw fa.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, hq param1) {
        param1.field_h = this.field_h;
        param1.field_a = this.field_a;
        param1.field_r = this.field_r;
        param1.field_q = this.field_q;
        param1.field_l = this.field_l;
        param1.field_b = this.field_b;
        param1.field_g = this.field_g;
        param1.field_j = this.field_j;
        param1.field_i = this.field_i;
        if (param0 != -3) {
            return;
        }
        try {
            param1.field_f = this.field_f;
            param1.field_n = this.field_n;
            param1.field_p = this.field_p;
            param1.field_d = this.field_d;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "hq.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public void a(boolean param0, int param1, int param2, int param3, cf param4) {
        if (!(null != this.field_j)) {
            return;
        }
        try {
            if (param2 != -15112) {
                cf var7 = (cf) null;
                this.a(75, -64, -115, 32, 23, (cf) null, -79, -28);
            }
            this.a(param1, (byte) -116, param4, param3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "hq.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(cf param0, int param1, int param2) {
        RuntimeException var4 = null;
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
                this.field_q = -46;
                break L1;
              }
            }
            stackIn_3_0 = this.a(0, param2, 105, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("hq.O(");

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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(String param0, byte param1, String param2) {
        try {
            kn.a(-1431, false, param2, param0);
            if (param1 != -125) {
                field_o = (char[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "hq.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, cf param5) {
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        mp var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        td var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var7_int = 13 / ((14 - param4) / 48);
            if (param2 != param0) {
              L1: {
                if (!param5.c(125)) {
                  break L1;
                } else {
                  L2: {
                    var8 = this.a(param5, -103);
                    if (param2 <= param0) {
                      var10 = param0;
                      var9 = param2;
                      break L2;
                    } else {
                      var10 = param2;
                      var9 = param0;
                      break L2;
                    }
                  }
                  var11 = var8.a((byte) -126, var9);
                  var12 = var8.a((byte) -126, var10);
                  nm.a(param3 + param5.field_y, param1 - -param5.field_i + param5.field_w, (byte) 105, param5.field_y + (param3 - -param5.field_n), param5.field_i + param1);
                  var13 = var11;
                  L3: while (true) {
                    if (var12 < var13) {
                      ql.a(true);
                      break L1;
                    } else {
                      L4: {
                        var14 = var8.field_e[var13];
                        if (var11 != var13) {
                          stackIn_12_0 = var14.field_e[0];
                          break L4;
                        } else {
                          stackIn_12_0 = var8.a(52224, var9);
                          break L4;
                        }
                      }
                      L5: {
                        var15 = stackIn_12_0;
                        if (var13 == var12) {
                          stackIn_17_0 = var8.a(52224, var10);
                          break L5;
                        } else {
                          if (var14 != null) {
                            stackIn_17_0 = var14.field_e[-1 + var14.field_e.length];
                            break L5;
                          } else {
                            stackIn_17_0 = 0;
                            break L5;
                          }
                        }
                      }
                      var16 = stackIn_17_0;
                      ra.field_o.a(this.a(var15, param5, 15921, param3), var14.field_h, var16 - var15, (byte) -111, this.field_i, this.field_i >>> -927118120, var14.field_d + (param5.field_q + (param5.field_i + param1) + this.field_g));
                      var13++;
                      continue L3;
                    }
                  }
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
          L6: {
            var7 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var7);

            stackIn_22_1 = new StringBuilder().append("hq.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, int param1, int param2, cf param3) {
        RuntimeException var5 = null;
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
            if (param2 == 105) {
              stackIn_4_0 = param3.field_q + (this.field_g + (param3.field_i + (param1 - -param0)));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 118;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("hq.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    hq(fm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final int a(boolean param0, int param1, cf param2) {
        RuntimeException var4 = null;
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
              if (!param0) {
                break L1;
              } else {
                hq.b((byte) 54);
                break L1;
              }
            }
            stackIn_3_0 = this.a(0, param2, 15921, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("hq.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(cf param0, byte param1, int param2, int param3, int param4) {
        mp var13 = null;
        mp var14 = null;
        int var7 = 0;
        td var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
            if (param1 != 2) {
                field_o = (char[]) null;
            }
            if (param0.c(126)) {
                var13 = this.a(param0, -99);
                var14 = var13;
                var7 = var14.a((byte) -126, param3);
                var8 = var13.field_e[var7];
                var9 = var14.a(52224, param3);
                var10 = this.a(var9, param0, 15921, param2);
                var11 = this.a(param0, 0, param4) + Math.max(0, var8.field_d);
                var12 = this.a(param0, param1 + -2, param4) - -Math.min(this.a(-109, param0), Math.min(var8.field_h, var14.field_e.length > 1 + var7 ? var13.field_e[1 + var7].field_d : var8.field_h));
                nm.a(param2 + param0.field_y, param0.field_w + param4 - -param0.field_i, (byte) 105, param0.field_n + (param2 + param0.field_y), param0.field_i + param4);
                ra.field_o.a(var12, var10, var11, this.field_h, (byte) 100, var10);
                ql.a(true);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "hq.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int b(cf param0, int param1) {
        RuntimeException var3 = null;
        cf var4 = null;
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
              if (param1 < -101) {
                break L1;
              } else {
                var4 = (cf) null;
                this.a(-125, 69, 3, -5, -68, (cf) null, -88, 84);
                break L1;
              }
            }
            this.a(param0, -98);
            stackIn_3_0 = param0.field_k.b(103) + this.field_r + this.field_n;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hq.S(");

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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    String d(cf param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        cf var4 = null;
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
              if (param1 == -9327) {
                break L1;
              } else {
                var4 = (cf) null;
                discarded$1 = this.a(60, (cf) null, -20, -86);
                break L1;
              }
            }
            stackIn_3_0 = param0.field_j;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hq.BA(");

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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final int b(int param0, int param1, int param2, int param3, int param4, cf param5) {
        RuntimeException var7 = null;
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
            this.a(param5, -97);
            if (param4 == 98) {
              stackIn_4_0 = param5.field_k.a(-this.a(false, param0, param5) + param2, (byte) -25, -this.a(param5, 0, param1) + param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -117;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("hq.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        field_m = null;
        field_o = null;
        int var1 = 77 / ((param0 - 7) / 43);
        field_c = null;
        field_e = null;
        field_k = null;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, cf param5, int param6, int param7) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              nm.a(param7 + param5.field_y, param2 - -param5.field_i - -param5.field_w, (byte) 105, param5.field_n + param7 - -param5.field_y, param2 + param5.field_i);
              var9_int = this.a(param5, true);
              if (param3 == 1) {
                break L1;
              } else {
                this.field_q = -65;
                break L1;
              }
            }
            L2: {
              var10 = this.a(-95, param5);
              if (this.field_l) {
                this.field_j.a(this.d(param5, -9327), this.a(param6, param5, 15921, param7), this.a(param4, param2, 105, param5), var9_int, var10, param1, param0, this.field_d, this.field_a, this.field_f);
                break L2;
              } else {
                L3: {
                  var12 = this.field_a;
                  if (var12 != 0) {
                    if (var12 == 2) {
                      var11 = -this.field_j.field_r + var10;
                      break L3;
                    } else {
                      L4: {
                        if (var12 == 3) {
                          break L4;
                        } else {
                          if (-2 == (var12 ^ -1)) {
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var11 = this.field_j.field_C - -(-this.field_j.field_r + (-this.field_j.field_C + var10) >> 1907606305);
                      break L3;
                    }
                  } else {
                    var11 = this.field_j.field_C;
                    break L3;
                  }
                }
                L5: {
                  var12 = this.field_d;
                  if (0 != var12) {
                    if (-4 == (var12 ^ -1)) {
                      break L5;
                    } else {
                      if (1 == var12) {
                        this.field_j.b(this.d(param5, -9327), (var9_int >> -1980331135) + this.a(param6, param5, 15921, param7), this.a(param4, param2, 105, param5) + var11, param1, param0);
                        break L2;
                      } else {
                        if ((var12 ^ -1) != -3) {
                          break L2;
                        } else {
                          this.field_j.a(this.d(param5, -9327), var9_int + this.a(param6, param5, 15921, param7), this.a(param4, param2, 105, param5) - -var11, param1, param0);
                          break L2;
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                this.field_j.c(this.d(param5, -9327), this.a(param6, param5, param3 ^ 15920, param7), var11 + this.a(param4, param2, 105, param5), param1, param0);
                break L2;
              }
            }
            ql.a(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var9);

            stackIn_27_1 = new StringBuilder().append("hq.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final int a(int param0, cf param1) {
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
            if (param0 < -88) {
              stackIn_4_0 = -this.field_g + param1.field_w + -this.field_p;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -95;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("hq.GA(").append(param0).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final mp a(cf param0, int param1) {
        RuntimeException var3 = null;
        cf var4 = null;
        mp stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0.field_k == null) {
                param0.field_k = (mp) ((Object) new sp());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!this.field_l) {
                this.c(param0, -126);
                break L2;
              } else {
                ((sp) ((Object) param0.field_k)).a(this.d(param0, -9327), this.field_d, this.a(-117, param0), this.field_f, (byte) -30, this.field_a, this.a(param0, true), this.field_j);
                break L2;
              }
            }
            L3: {
              if (param1 < -94) {
                break L3;
              } else {
                var4 = (cf) null;
                this.a(124, 109, 92, 24, 51, (cf) null, 44, 95);
                break L3;
              }
            }
            stackIn_9_0 = param0.field_k;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("hq.T(");

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
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    private final int a(int param0, cf param1, int param2, int param3) {
        RuntimeException var5 = null;
        cf var6 = null;
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
              if (param2 == 15921) {
                break L1;
              } else {
                var6 = (cf) null;
                this.a((cf) null, 4);
                break L1;
              }
            }
            stackIn_3_0 = param0 + this.field_r + (param1.field_y + param3 + param1.field_z);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("hq.W(").append(param0).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    protected hq() {
    }

    private final void a(int param0, byte param1, cf param2, int param3) {
        try {
            this.a(this.field_b, this.field_q, param0, 1, 0, param2, 0, param3);
            if (param1 != -116) {
                String var6 = (String) null;
                hq.a((String) null, (byte) 93, (String) null);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "hq.V(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    hq(fm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_d = param7;
            this.field_n = param2;
            this.field_g = param3;
            this.field_h = param10;
            this.field_a = param8;
            this.field_f = param9;
            this.field_b = param6;
            this.field_j = param0;
            this.field_q = param5;
            this.field_l = param12 ? true : false;
            this.field_p = param4;
            this.field_i = param11;
            this.field_r = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "hq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_k = "";
        field_o = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
