/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends v implements pi {
    static String field_H;
    private String[] field_F;
    private rm[] field_I;
    private pn field_G;
    static go field_J;

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (0 != param3) {
            return;
        }
        qi var5 = hl.field_g;
        if (!(null == this.field_F)) {
            var5.a(tk.field_b, param2 + this.field_k, this.field_o + param1, this.field_x, 20, 16777215, -1, 0, 0, var5.field_G + var5.field_I);
        }
    }

    final static void a(int param0, int param1, int param2, hj[] param3, int param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param4 > 0) {
                  L2: {
                    var5_int = param3[0].field_o;
                    var6 = param3[2].field_o;
                    var7 = param3[1].field_o;
                    param3[0].a(param2, param0);
                    param3[2].a(-var6 + (param2 + param4), param0);
                    tc.b(hi.field_W);
                    tc.e(var5_int + param2, param0, -var6 + param4 + param2, param3[1].field_v + param0);
                    if (param1 == 14191) {
                      break L2;
                    } else {
                      field_J = (go) null;
                      break L2;
                    }
                  }
                  var8 = param2 + var5_int;
                  var9 = param2 - (-param4 - -var6);
                  param2 = var8;
                  L3: while (true) {
                    if (var9 <= param2) {
                      tc.a(hi.field_W);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param3[1].a(param2, param0);
                      param2 = param2 + var7;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("gi.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    gi(pn param0) {
        super(0, 0, 0, 0, (dh) null);
        try {
            this.field_G = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        vk.a(true);
        if (param0 <= 9) {
            field_J = (go) null;
        }
    }

    final static io i(int param0) {
        if (param0 >= -77) {
            gi.i(-10);
        }
        return new io(ob.d((byte) 41), tm.b(false));
    }

    final void a(String[] param0, byte param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        am var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              this.field_D.a(param1 + 28977);
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length == 0) {
                  break L1;
                } else {
                  var3_int = param0.length;
                  this.field_F = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var3_int <= var4_int) {
                      var4 = new am(hl.field_g, 0, 1);
                      this.field_I = new rm[var3_int - -1];
                      if (param1 == 43) {
                        var5 = 0;
                        L3: while (true) {
                          if (var5 >= var3_int) {
                            this.field_I[var3_int] = new rm(tg.field_f, (tb) (this));
                            this.field_I[var3_int].field_l = (dh) ((Object) var4);
                            this.field_I[var3_int].a(0, (byte) 122, 16 * (var3_int + 1) + 20, 15, 100);
                            this.a(true, this.field_I[var3_int]);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            this.field_I[var5] = new rm(this.field_F[var5], (tb) (this));
                            this.field_I[var5].field_l = (dh) ((Object) var4);
                            this.field_I[var5].field_z = bj.field_N;
                            this.field_I[var5].a(0, (byte) 122, var5 * 16 + 20, 15, 80);
                            this.a(true, this.field_I[var5]);
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      this.field_F[var4_int] = ok.a((CharSequence) ((Object) param0[var4_int]), -6126).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            this.field_F = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("gi.D(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
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

    final boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if ((param1 ^ -1) != -99) {
                if ((param1 ^ -1) == -100) {
                  stackIn_9_0 = this.b(param0, param2 + 200);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_5_0 = this.c(param0, param2 + 77);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("gi.T(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    public static void h(int param0) {
        field_J = null;
        field_H = null;
        if (param0 != -26897) {
            fi var2 = (fi) null;
            gi.a((fi) null, 23, (fi) null);
        }
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        n var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var6_int = 0;
              if (param2 == -4) {
                break L1;
              } else {
                var8 = (n) null;
                this.a((n) null, -95, (byte) -39, 'B');
                break L1;
              }
            }
            L2: while (true) {
              if (this.field_F.length <= var6_int) {
                L3: {
                  if (this.field_I[this.field_F.length] == param1) {
                    this.field_G.a((byte) 126);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (param1 == this.field_I[var6_int]) {
                    this.field_G.a(this.field_F[var6_int], 25);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("gi.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(fi param0, int param1, fi param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var3_int = -param2.field_gb + param0.field_gb;
              if (param1 == 200) {
                break L1;
              } else {
                gi.i(32);
                break L1;
              }
            }
            L2: {
              if (vl.field_g == param0.field_hb) {
                var3_int -= 200;
                break L2;
              } else {
                if (null != param0.field_hb) {
                  break L2;
                } else {
                  var3_int += 200;
                  break L2;
                }
              }
            }
            L3: {
              if (vl.field_g == param2.field_hb) {
                var3_int += 200;
                break L3;
              } else {
                if (null != param2.field_hb) {
                  break L3;
                } else {
                  var3_int -= 200;
                  break L3;
                }
              }
            }
            L4: {
              if (var3_int <= 0) {
                stackIn_14_0 = 0;
                break L4;
              } else {
                stackIn_14_0 = 1;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("gi.F(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    static {
        field_H = "Steer left";
    }
}
