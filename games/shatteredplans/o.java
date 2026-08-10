/*
 * Decompiled by CFR-JS 0.4.0.
 */
class o implements iq, pj {
    int field_p;
    int field_j;
    int field_i;
    int field_r;
    private int field_h;
    int field_o;
    int field_b;
    int field_g;
    static String field_q;
    private boolean field_d;
    static int field_s;
    static String field_a;
    static bi field_k;
    static String field_m;
    static int field_n;
    int field_f;
    int field_e;
    nq field_c;
    int field_l;

    public final int a(byte param0, vg param1) {
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
              this.a(param1, true);
              if (param0 == -52) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = param1.field_j.c(param0 ^ 83) - (-this.field_o - this.field_g);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("o.Q(").append(param0).append(',');

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
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        pl.a(param0, (byte) -26);
        tr.a(param3, param0, param2, param1);
    }

    public final void a(int param0, int param1, int param2, int param3, vg param4) {
        qo var13 = null;
        qo var14 = null;
        int var7 = 0;
        ha var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param2 >= -54) {
            return;
        }
        try {
            if (param4.f(1)) {
                var13 = this.a(param4, true);
                var14 = var13;
                var7 = var14.a((byte) 81, param0);
                var8 = var13.field_d[var7];
                var9 = var14.a(true, param0);
                var10 = this.b((byte) -14, param4, var9, param1);
                var11 = this.a(param3, param4, 68) - -Math.max(0, var8.field_e);
                var12 = this.a(param3, param4, -122) + Math.min(this.a(param4, 0), Math.min(var8.field_c, var14.field_d.length > 1 + var7 ? var13.field_d[1 + var7].field_e : var8.field_c));
                ke.a(-6187, param4.field_x + (param1 - -param4.field_m), param4.field_n + (param4.field_q + param3), param4.field_q + param3, param1 - -param4.field_m);
                qq.field_I.a(var10, -110, var10, this.field_i, var11, var12);
                ln.f((byte) -122);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "o.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public final qo a(vg param0, boolean param1) {
        RuntimeException var3 = null;
        qo stackIn_2_0 = null;
        qo stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              L1: {
                if (param0.field_j == null) {
                  param0.field_j = (qo) ((Object) new la());
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (this.field_d) {
                  ((la) ((Object) param0.field_j)).a(this.b(true, param0), 0, this.field_r, this.field_l, this.a(124, param0), this.a(param0, 0), this.field_c, this.field_j);
                  break L2;
                } else {
                  this.b((byte) 104, param0);
                  break L2;
                }
              }
              stackIn_10_0 = param0.field_j;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (qo) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("o.KA(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_10_0;
        }
    }

    public final int a(int param0, int param1, int param2, vg param3, boolean param4, int param5) {
        RuntimeException var7 = null;
        vg var8 = null;
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
              this.a(param3, param4);
              if (param4) {
                break L1;
              } else {
                var8 = (vg) null;
                this.a(67, 67, -1, 15, (vg) null);
                break L1;
              }
            }
            stackIn_3_0 = param3.field_j.a(-this.b(0, param3, param0) + param1, 3357, param5 + -this.a(param2, param3, -78));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("o.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(byte param0, vg param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 65 % ((16 - param0) / 52);
            stackIn_1_0 = param1.field_l + this.field_b + (param1.field_q + (param3 - -param2));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("o.EA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ha var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        o var17 = null;
        qo var18 = null;
        qo var19 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == param3) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param5.f(1)) {
                  L2: {
                    var18 = this.a(param5, true);
                    var19 = var18;
                    if (param0 < param3) {
                      var8 = param0;
                      var9 = param3;
                      break L2;
                    } else {
                      var9 = param0;
                      var8 = param3;
                      break L2;
                    }
                  }
                  var10 = var19.a((byte) 120, var8);
                  var11 = var19.a((byte) 100, var9);
                  ke.a(param4 + -6187, param2 - -param5.field_m + param5.field_x, param1 + param5.field_q - -param5.field_n, param1 + param5.field_q, param2 - -param5.field_m);
                  var12 = var10;
                  L3: while (true) {
                    if (var11 < var12) {
                      ln.f((byte) -49);
                      break L1;
                    } else {
                      L4: {
                        var13 = var18.field_d[var12];
                        if (var12 != var10) {
                          stackIn_14_0 = var13.field_b[0];
                          break L4;
                        } else {
                          stackIn_14_0 = var19.a(true, var8);
                          break L4;
                        }
                      }
                      L5: {
                        var14 = stackIn_14_0;
                        if (var12 == var11) {
                          stackIn_19_0 = var19.a(true, var9);
                          break L5;
                        } else {
                          if (var13 != null) {
                            stackIn_19_0 = var13.field_b[var13.field_b.length - 1];
                            break L5;
                          } else {
                            stackIn_19_0 = 0;
                            break L5;
                          }
                        }
                      }
                      var15 = stackIn_19_0;
                      qq.field_I.a(var15 + -var14, this.field_e >>> 1588399096, this.field_e, this.b((byte) -14, param5, var14, param2), var13.field_c, param4 ^ -107, var13.field_e + (param1 - -param5.field_q) + (this.field_b - -param5.field_l));
                      var12++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
              if (param4 == 0) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var17 = (o) null;
                this.a((o) null, (byte) -38);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var7);

            stackIn_26_1 = new StringBuilder().append("o.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, vg param1, int param2, int param3) {
        try {
            this.a(param2, param3, this.field_p, 2, param1, this.field_h, 0, 0);
            int var5_int = 20 / ((param0 - 54) / 41);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "o.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final int a(int param0, vg param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = -86 % ((param2 - -15) / 62);
            stackIn_1_0 = this.a((byte) 97, param1, 0, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("o.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0) {
        if (param0 != 0) {
            o.a((byte) 47);
            qj.a((byte) -127, 17);
            return;
        }
        qj.a((byte) -127, 17);
    }

    public final int b(int param0, vg param1, int param2) {
        RuntimeException var4 = null;
        vg var5 = null;
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
              if (param0 == 0) {
                break L1;
              } else {
                var5 = (vg) null;
                this.a(123, 88, -66, 47, (vg) null);
                break L1;
              }
            }
            stackIn_3_0 = this.b((byte) -14, param1, 0, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("o.DA(").append(param0).append(',');

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
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    String b(boolean param0, vg param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              stackIn_4_0 = param1.field_s;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("o.L(").append(param0).append(',');

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
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final int a(int param0, vg param1) {
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
            if (param0 > 114) {
              stackIn_4_0 = param1.field_x - this.field_o - this.field_g;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -52;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("o.P(").append(param0).append(',');

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
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static String a(byte param0, int param1, String param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        ve var7 = null;
        ve var8 = null;
        sl var9 = null;
        CharSequence var10 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) ((Object) param2);
            if (gb.a((byte) -67, var10)) {
              if (2 == po.field_b) {
                var8 = hb.a((byte) -90, param2);
                if (var8 != null) {
                  vd.field_j.b(var8, -9189);
                  L1: while (true) {
                    var7 = (ve) ((Object) vd.field_j.a((byte) -71));
                    if (var7 == null) {
                      L2: {
                        var8.b((byte) -76);
                        var8.a(16);
                        r.field_c = r.field_c - 1;
                        var9 = js.field_f;
                        var9.h(param1, 255);
                        var9.field_j = var9.field_j + 1;
                        if (param0 <= -71) {
                          break L2;
                        } else {
                          o.a((byte) 60);
                          break L2;
                        }
                      }
                      var5 = var9.field_j;
                      var9.c(1, (byte) -91);
                      var9.a(param2, (byte) 0);
                      var9.b(var9.field_j + -var5, (byte) 122);
                      stackIn_16_0 = null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var7.field_zb = var7.field_zb - 1;
                      continue L1;
                    }
                  }
                } else {
                  stackIn_9_0 = re.a(us.field_e, 4371, new String[]{param2});
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = ka.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = tm.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("o.FA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return (String) ((Object) stackIn_16_0);
            }
          }
        }
    }

    o(nq param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final int a(boolean param0, vg param1) {
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.a(param1, param0);
            stackIn_1_0 = param1.field_j.b(438) + (this.field_b - -this.field_f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("o.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    private final void b(byte param0, vg param1) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 49) {
                break L1;
              } else {
                this.field_p = -125;
                break L1;
              }
            }
            L2: {
              if (param1.field_j == null) {
                param1.field_j = (qo) ((Object) new la());
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var3_int = this.a(120, param1);
              var4 = this.a(param1, 0);
              var6 = this.field_l;
              if (0 != var6) {
                if ((var6 ^ -1) != -3) {
                  L4: {
                    if (var6 != 3) {
                      if ((var6 ^ -1) != -2) {
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var5 = (-this.field_c.field_q + (var4 + -this.field_c.field_J) >> -1567593279) + this.field_c.field_J;
                  break L3;
                } else {
                  var5 = var4 - this.field_c.field_q;
                  break L3;
                }
              } else {
                var5 = this.field_c.field_J;
                break L3;
              }
            }
            L5: {
              L6: {
                var6 = this.field_r;
                if (-1 != (var6 ^ -1)) {
                  if (-4 != (var6 ^ -1)) {
                    if (var6 != 1) {
                      if ((var6 ^ -1) == -3) {
                        if (param1.field_j instanceof la) {
                          ((la) ((Object) param1.field_j)).a(108, var5, this.field_c, this.b(true, param1), var3_int);
                          break L5;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (!(param1.field_j instanceof la)) {
                        break L5;
                      } else {
                        ((la) ((Object) param1.field_j)).a(var5, this.b(true, param1), 0, this.field_c, var3_int >> 1538326273);
                        return;
                      }
                    }
                  } else {
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              if (!(param1.field_j instanceof la)) {
                break L5;
              } else {
                ((la) ((Object) param1.field_j)).a(this.field_c, var5, -4, this.b(true, param1), 0);
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("o.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L7;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, vg param4, int param5, int param6, int param7) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 2) {
                break L1;
              } else {
                field_s = 115;
                break L1;
              }
            }
            L2: {
              ke.a(-6187, param4.field_m + (param0 - -param4.field_x), param4.field_q + (param1 + param4.field_n), param4.field_q + param1, param0 + param4.field_m);
              var9_int = this.a(123, param4);
              var10 = this.a(param4, 0);
              if (this.field_d) {
                this.field_c.a(this.b(true, param4), this.b((byte) -14, param4, param7, param0), this.a((byte) -43, param4, param6, param1), var9_int, var10, param2, param5, this.field_r, this.field_l, this.field_j);
                break L2;
              } else {
                L3: {
                  var12 = this.field_l;
                  if (-1 != (var12 ^ -1)) {
                    if (var12 == 2) {
                      var11 = -this.field_c.field_q + var10;
                      break L3;
                    } else {
                      L4: {
                        if (-4 == (var12 ^ -1)) {
                          break L4;
                        } else {
                          if ((var12 ^ -1) != -2) {
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var11 = (-this.field_c.field_q + -this.field_c.field_J + var10 >> -324287487) + this.field_c.field_J;
                      break L3;
                    }
                  } else {
                    var11 = this.field_c.field_J;
                    break L3;
                  }
                }
                L5: {
                  var12 = this.field_r;
                  if (-1 == (var12 ^ -1)) {
                    break L5;
                  } else {
                    if ((var12 ^ -1) == -4) {
                      break L5;
                    } else {
                      if (-2 == (var12 ^ -1)) {
                        this.field_c.c(this.b(true, param4), (var9_int >> 1878908385) + this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 121, param4, param6, param1), param2, param5);
                        break L2;
                      } else {
                        if (2 != var12) {
                          break L2;
                        } else {
                          this.field_c.b(this.b(true, param4), var9_int + this.b((byte) -14, param4, param7, param0), this.a((byte) 75, param4, param6, param1) - -var11, param2, param5);
                          break L2;
                        }
                      }
                    }
                  }
                }
                this.field_c.d(this.b(true, param4), this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 100, param4, param6, param1), param2, param5);
                break L2;
              }
            }
            ln.f((byte) -104);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var9);

            stackIn_26_1 = new StringBuilder().append("o.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final int b(byte param0, vg param1, int param2, int param3) {
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
            if (param0 == -14) {
              stackIn_4_0 = param2 + (this.field_o + param1.field_m) + (param3 - -param1.field_h);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -35;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("o.R(").append(param0).append(',');

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
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final int a(boolean param0) {
        vg var3;
        if (param0) {
          var3 = (vg) null;
          this.a(6, 90, 120, (vg) null, false, -78);
          return this.field_c.field_q + this.field_c.field_J;
        } else {
          return this.field_c.field_q + this.field_c.field_J;
        }
    }

    public static void a(byte param0) {
        field_q = null;
        if (param0 >= -62) {
            return;
        }
        field_a = null;
        field_k = null;
        field_m = null;
    }

    private final int a(vg param0, int param1) {
        RuntimeException var3 = null;
        vg var4 = null;
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
                var4 = (vg) null;
                this.a(-5, (vg) null);
                break L1;
              }
            }
            stackIn_3_0 = -this.field_f + param0.field_n - this.field_b;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("o.T(");

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
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        if (null == this.field_c) {
            return;
        }
        try {
            if (param4 != 12) {
                this.field_o = 64;
            }
            this.a(102, param0, param1, param3);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "o.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(o param0, byte param1) {
        try {
            param0.field_o = this.field_o;
            param0.field_c = this.field_c;
            param0.field_e = this.field_e;
            param0.field_l = this.field_l;
            param0.field_r = this.field_r;
            param0.field_b = this.field_b;
            param0.field_f = this.field_f;
            param0.field_g = this.field_g;
            param0.field_d = this.field_d;
            param0.field_h = this.field_h;
            param0.field_j = this.field_j;
            param0.field_i = this.field_i;
            param0.field_p = this.field_p;
            if (param1 != 42) {
                vg var4 = (vg) null;
                this.a(107, -23, -128, -77, 34, (vg) null);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "o.LA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    protected o() {
    }

    o(nq param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_b = param3;
            this.field_l = param8;
            this.field_f = param4;
            this.field_o = param1;
            this.field_c = param0;
            this.field_h = param6;
            this.field_p = param5;
            this.field_d = param12 ? true : false;
            this.field_j = param9;
            this.field_e = param11;
            this.field_r = param7;
            this.field_g = param2;
            this.field_i = param10;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "o.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_m = "Accept";
        field_a = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_n = 3;
        field_q = "Inviting <%0>";
    }
}
