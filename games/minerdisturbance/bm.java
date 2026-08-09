/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends nf {
    private int field_s;
    private we field_m;
    private int field_p;
    private int field_j;
    private String field_n;
    private boolean field_t;
    private int field_l;
    static ag field_o;
    private int field_i;
    static String field_k;
    static String field_r;
    static String field_q;

    final static java.applet.Applet c(int param0) {
        if (param0 >= -73) {
            return (java.applet.Applet) null;
        }
        if (of.field_b != null) {
            return of.field_b;
        }
        return (java.applet.Applet) ((Object) j.field_h);
    }

    final void a(int param0, int param1, we param2, String param3, int param4, byte param5, int param6, int param7) {
        mg stackIn_37_0;
        mg stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        mg stackIn_38_0 = null;
        mg stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        we stackIn_41_0 = null;
        String stackIn_41_1 = null;
        we stackIn_42_0 = null;
        String stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        mg var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param6 != 0) {
                break L1;
              } else {
                param6 = param2.field_G;
                break L1;
              }
            }
            if (param3 == null) {
              this.field_f = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param2 != this.field_m) {
                  break L2;
                } else {
                  if (this.field_t) {
                    break L2;
                  } else {
                    if (this.field_l != param7) {
                      break L2;
                    } else {
                      if (param0 != this.field_j) {
                        break L2;
                      } else {
                        if (this.field_i != param6) {
                          break L2;
                        } else {
                          if (this.field_p != param1) {
                            break L2;
                          } else {
                            if (this.field_s != param4) {
                              break L2;
                            } else {
                              if (this.field_n == null) {
                                break L2;
                              } else {
                                if (this.field_n.equals(param3)) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                this.field_l = param7;
                this.field_n = param3;
                this.field_s = param4;
                this.field_t = false;
                this.field_p = param1;
                this.field_i = param6;
                if (param5 > 61) {
                  break L3;
                } else {
                  field_r = (String) null;
                  break L3;
                }
              }
              L4: {
                this.field_j = param0;
                this.field_m = param2;
                var16 = new String[param2.a(param3, param4) + 1];
                var17 = var16;
                var10 = Math.max(1, param2.a(param3, new int[]{param4}, var17));
                if ((this.field_j ^ -1) != -4) {
                  break L4;
                } else {
                  if (-2 == (var10 ^ -1)) {
                    this.field_j = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                this.field_f = new mg[var10];
                if (this.field_j != 0) {
                  if (this.field_j == 1) {
                    var11 = param2.field_I + (this.field_p + -(this.field_i * var10) >> 1069152065);
                    break L5;
                  } else {
                    if (this.field_j == 2) {
                      var11 = this.field_p + -param2.field_E + -(this.field_i * var10);
                      break L5;
                    } else {
                      L6: {
                        var12 = (-(this.field_i * var10) + this.field_p) / (1 + var10);
                        if (-1 >= (var12 ^ -1)) {
                          break L6;
                        } else {
                          var12 = 0;
                          break L6;
                        }
                      }
                      this.field_i = this.field_i + var12;
                      var11 = var12 + param2.field_I;
                      break L5;
                    }
                  }
                } else {
                  var11 = param2.field_I;
                  break L5;
                }
              }
              var12 = 0;
              L7: while (true) {
                if (var12 >= var10) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L8: {
                    var13 = var16[var12];
                    stackIn_37_0 = null;

                    stackIn_37_1 = null;

                    stackIn_37_2 = -param2.field_I + var11;

                    stackIn_37_3 = param2.field_E + var11;

                    if (var13 == null) {
                      stackIn_38_0 = null;
                      stackIn_38_1 = null;
                      stackIn_38_2 = stackIn_37_2;
                      stackIn_38_3 = stackIn_37_3;
                      stackIn_38_4 = 0;
                      break L8;
                    } else {
                      stackIn_38_0 = null;
                      stackIn_38_1 = null;
                      stackIn_38_2 = stackIn_37_2;
                      stackIn_38_3 = stackIn_37_3;
                      stackIn_38_4 = var13.length();
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new mg(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                    var14.field_d[0] = 0;
                    if (var13 == null) {
                      break L9;
                    } else {
                      L10: {
                        var14.field_d[var13.length()] = param2.a(var13);
                        stackIn_41_0 = (we) (param2);

                        stackIn_41_1 = (String) (var13);

                        if ((param7 ^ -1) == -4) {
                          stackIn_42_0 = (we) ((Object) stackIn_41_0);
                          stackIn_42_1 = (String) ((Object) stackIn_41_1);
                          stackIn_42_2 = this.a(101, var13, param2.a(var13), param4);
                          break L10;
                        } else {
                          stackIn_42_0 = (we) ((Object) stackIn_41_0);
                          stackIn_42_1 = (String) ((Object) stackIn_41_1);
                          stackIn_42_2 = 0;
                          break L10;
                        }
                      }
                      pf.a(stackIn_42_0, stackIn_42_1, stackIn_42_2, -19453, var14);
                      break L9;
                    }
                  }
                  var11 = var11 + param6;
                  this.field_f[var12] = var14;
                  var12++;
                  continue L7;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackIn_47_0 = (RuntimeException) (var9);

            stackIn_47_1 = new StringBuilder().append("bm.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L11;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');

            if (param3 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L12;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L12;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_48_0), stackIn_51_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    private final mg a(int param0, String param1, byte param2, we param3) {
        mg var5 = null;
        RuntimeException var5_ref = null;
        mg var6 = null;
        mg stackIn_2_0 = null;
        mg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = new mg(param0 - param3.field_I, param0 + param3.field_E, param1.length());
            var5 = var6;
            this.field_f = new mg[]{var6};
            if (param2 >= 18) {
              stackIn_4_0 = (mg) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (mg) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("bm.F(").append(param0).append(',');

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, String param2, we param3, int param4) {
        mg var8 = null;
        mg var9 = null;
        if (!(param2 != null)) {
            this.field_f = null;
            return;
        }
        if (param3 == this.field_m && this.field_t && -3 == (this.field_l ^ -1) && this.field_n != null) {
            if (!(!this.field_n.equals(param2))) {
                return;
            }
        }
        try {
            this.field_l = 2;
            this.field_n = param2;
            this.field_t = true;
            this.field_m = param3;
            var8 = this.a(param4, param2, (byte) 51, param3);
            var9 = var8;
            var9.field_d[0] = param1 + -param3.a(param2);
            var9.field_d[param2.length()] = param1;
            pf.a(param3, param2, param0, -19453, var9);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "bm.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != 0) {
            field_o = (ag) null;
        }
        field_r = null;
        field_q = null;
        field_k = null;
        field_o = null;
    }

    final void a(int param0, we param1, String param2, int param3, int param4) {
        mg var7 = null;
        mg var8 = null;
        if (!(param2 != null)) {
            this.field_f = null;
            return;
        }
        if (param1 == this.field_m && this.field_t && this.field_l == 0 && this.field_n != null) {
            if (!(!this.field_n.equals(param2))) {
                return;
            }
        }
        try {
            this.field_m = param1;
            this.field_n = param2;
            this.field_l = 0;
            this.field_t = true;
            var7 = this.a(param4, param2, (byte) 19, param1);
            var8 = var7;
            if (param3 <= 62) {
                this.field_n = (String) null;
            }
            var7.field_d[0] = param0;
            var8.field_d[param2.length()] = param1.a(param2) + param0;
            pf.a(param1, param2, 0, -19453, var8);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "bm.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public bm() {
    }

    final void a(String param0, int param1, int param2, we param3, int param4) {
        mg var8 = null;
        int var7 = 0;
        if (param0 == null) {
            this.field_f = null;
            return;
        }
        if (param3 == this.field_m && this.field_t && this.field_l == 1 && null != this.field_n && this.field_n.equals(param0)) {
            return;
        }
        try {
            this.field_t = true;
            this.field_m = param3;
            this.field_l = 1;
            var8 = this.a(param2, param0, (byte) 87, param3);
            var7 = param3.a(param0);
            var8.field_d[0] = param4 + -(var7 >> -1445522975);
            if (param1 != 27994) {
                this.field_l = 113;
            }
            var8.field_d[param0.length()] = param4 - -(var7 >> -45995743);
            pf.a(param3, param0, 0, -19453, var8);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "bm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    static {
        field_o = new ag();
        field_k = "Change display name";
        field_r = "Player";
    }
}
