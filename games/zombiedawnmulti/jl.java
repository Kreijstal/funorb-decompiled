/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends hq {
    static ri field_u;
    private mk field_w;
    private mk[] field_s;
    static String field_v;
    static String field_t;

    private final void a(jl param0, boolean param1, byte param2) {
        mk dupTemp$2 = null;
        int var4_int = 0;
        mk var5 = null;
        mk var6 = null;
        int var7 = 0;
        mk stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        mk stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        mk stackIn_9_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ja var8 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(-3, param0);
              if (!param1) {
                d.a(this.field_s, 0, param0.field_s, 0, 6);
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (6 <= var4_int) {
                    break L1;
                  } else {
                    L3: {
                      var5 = this.field_s[var4_int];
                      var6 = var5;
                      var6 = var5;
                      if (var5 != null) {
                        L4: {
                          var6 = param0.field_s[var4_int];
                          stackIn_8_0 = (mk) (var5);

                          stackIn_8_1 = 100;

                          if (var6 != null) {
                            stackIn_9_0 = (mk) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (mk) (var6);
                            break L4;
                          } else {
                            dupTemp$2 = new mk();
                            param0.field_s[var4_int] = dupTemp$2;
                            stackIn_9_0 = (mk) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (mk) (dupTemp$2);
                            break L4;
                          }
                        }
                        ((mk) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2);
                        break L3;
                      } else {
                        param0.field_s[var4_int] = null;
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              }
            }
            if (param2 < -107) {
              break L0;
            } else {
              var8 = (ja) null;
              this.a((ja) null, (byte) -75);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("jl.H(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, fm param6, pd param7, pd param8, int param9, int param10, int param11, int param12, int param13, int param14, fm param15, int param16, int param17, pd param18, int param19, boolean param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          L0: {
            L1: {
              lj.a(param6, param4, param15, 61);
              ek.a(param16, param0, 1829947600, param9, param10);
              uo.a(param13, param1, 1633);
              if (param20) {
                break L1;
              } else {
                field_t = (String) null;
                break L1;
              }
            }
            vl.a(param18, param8, 127, param2, param12, param11);
            qb.a(param17, (byte) -115, param7, param14);
            nn.a((byte) 55, param3, param19, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var21);

            stackIn_6_1 = new StringBuilder().append("jl.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param7 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param8 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');

            if (param15 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param16).append(',').append(param17).append(',');

            if (param18 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param19 + ',' + param20 + ')');
        }
    }

    final mk a(int param0, byte param1) {
        mk dupTemp$2 = null;
        mk dupTemp$3 = null;
        jl var4;
        if (param1 != -36) {
          var4 = (jl) null;
          this.a((jl) null, false, (byte) -31);
          dupTemp$2 = new mk();
          this.field_s[param0] = dupTemp$2;
          return dupTemp$2;
        } else {
          dupTemp$3 = new mk();
          this.field_s[param0] = dupTemp$3;
          return dupTemp$3;
        }
    }

    final void a(ja[] param0, int param1, boolean param2) {
        int var4_int = 0;
        if (param2) {
            return;
        }
        try {
            var4_int = param1;
            if (null == this.field_s[var4_int]) {
                this.field_s[var4_int] = new mk();
            }
            this.field_s[param1].field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "jl.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    jl(jl param0, boolean param1) {
        this();
        try {
            param0.a((jl) (this), param1, (byte) -122);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "jl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static java.applet.Applet b(int param0) {
        if (null != fd.field_L) {
            return fd.field_L;
        }
        if (param0 != 0) {
            field_v = (String) null;
            return (java.applet.Applet) ((Object) tg.field_i);
        }
        return (java.applet.Applet) ((Object) tg.field_i);
    }

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        cf stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        mk var7 = null;
        mk var9 = null;
        jl var10 = null;
        gn var11 = null;
        mk var12 = null;
        mk var13 = null;
        mk var14 = null;
        mk var15 = null;
        try {
          L0: {
            L1: {
              if (param4 instanceof gn) {
                stackIn_3_0 = (cf) (param4);
                break L1;
              } else {
                stackIn_3_0 = null;
                break L1;
              }
            }
            L2: {
              var11 = (gn) ((Object) stackIn_3_0);
              nm.a(param3 - -param4.field_y, param4.field_w + (param4.field_i + param1), (byte) 105, param3 - -param4.field_y - -param4.field_n, param1 - -param4.field_i);
              if (var11 == null) {
                break L2;
              } else {
                param0 = param0 & var11.field_F;
                break L2;
              }
            }
            L3: {
              var7 = this.field_s[0];
              this.field_w.a((byte) 11);
              var7.a(-11108, param3, param1, (jl) (this), param4, this.field_w);
              if (var11 != null) {
                L4: {
                  if (var11.field_G) {
                    var12 = this.field_s[1];
                    if (var12 != null) {
                      var12.a(param2 + 4004, param3, param1, (jl) (this), param4, this.field_w);
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                if (var11.field_l) {
                  L5: {
                    var13 = this.field_s[3];
                    if (var11.field_u == 0) {
                      break L5;
                    } else {
                      if (var13 != null) {
                        var13.a(param2 ^ 4196, param3, param1, (jl) (this), param4, this.field_w);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var9 = this.field_s[2];
                  if (var9 == null) {
                    break L3;
                  } else {
                    var9.a(param2 + 4004, param3, param1, (jl) (this), param4, this.field_w);
                    break L3;
                  }
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L6: {
              if (param4.c(126)) {
                var14 = this.field_s[5];
                if (var14 == null) {
                  break L6;
                } else {
                  var14.a(-11108, param3, param1, (jl) (this), param4, this.field_w);
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (!param0) {
                var15 = this.field_s[4];
                if (var15 == null) {
                  break L7;
                } else {
                  var15.a(-11108, param3, param1, (jl) (this), param4, this.field_w);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            this.field_w.a(param3, false, (jl) (this), param4, param1);
            ql.a(true);
            if (param2 == -15112) {
              break L0;
            } else {
              var10 = (jl) null;
              this.a((jl) null, false, (byte) -63);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var6);

            stackIn_33_1 = new StringBuilder().append("jl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
    }

    final void a(ja param0, byte param1) {
        mk[] var3 = null;
        int var4 = 0;
        mk var5_ref_mk = null;
        int var6 = 0;
        mk[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var7 = this.field_s;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var7.length <= var4) {
                var5 = 3 % ((22 - param1) / 49);
                break L0;
              } else {
                L2: {
                  var5_ref_mk = var7[var4];
                  if (var5_ref_mk != null) {
                    var5_ref_mk.field_k = param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("jl.G(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, boolean param3, int param4, int param5, int param6) {
        String var7;
        pd var8;
        L0: {
          if ((va.field_a ^ -1) == -3) {
            var7 = nc.field_c;
            break L0;
          } else {
            var7 = pi.field_e;
            break L0;
          }
        }
        gf.a(127, param2, param4, param5, var7, param6, param0, param3);
        if (param1 != -97) {
          var8 = (pd) null;
          jl.a(-33, 72, 86, 111, -101, -58, (fm) null, (pd) null, (pd) null, -42, -100, -45, 56, 89, -124, (fm) null, -98, -113, (pd) null, -13, true);
          return;
        } else {
          return;
        }
    }

    final void a(ja[] param0, boolean param1) {
        mk[] var3 = null;
        int var4 = 0;
        mk var5 = null;
        int var6 = 0;
        mk[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var7 = this.field_s;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var7.length <= var4) {
                if (!param1) {
                  break L0;
                } else {
                  this.field_w = (mk) null;
                  return;
                }
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_e = param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("jl.J(");

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
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public jl() {
        this.field_s = new mk[6];
        this.field_w = new mk();
        mk dupTemp$0 = new mk();
        this.field_s[0] = dupTemp$0;
        mk var1 = dupTemp$0;
        var1.a((byte) 11);
    }

    public static void a(boolean param0) {
        field_t = null;
        field_v = null;
        field_u = null;
        if (param0) {
            field_t = (String) null;
        }
    }

    static {
        field_t = "Average rating";
        field_v = "Logging in...";
    }
}
