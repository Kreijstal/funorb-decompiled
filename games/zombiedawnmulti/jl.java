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
        int var4_int = 0;
        RuntimeException var4 = null;
        mk var5 = null;
        mk var6 = null;
        int var7 = 0;
        Object var8 = null;
        mk stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        mk stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        mk stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        mk stackIn_9_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        mk stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        mk stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        mk stackOut_8_2 = null;
        mk stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        mk stackOut_7_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(-3, (hq) (Object) param0);
              if (!param1) {
                d.a((Object[]) (Object) ((jl) this).field_s, 0, (Object[]) (Object) param0.field_s, 0, 6);
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (6 <= var4_int) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((jl) this).field_s[var4_int];
                      var6 = var5;
                      var6 = var5;
                      if (var5 != null) {
                        L4: {
                          var6 = param0.field_s[var4_int];
                          stackOut_6_0 = (mk) var5;
                          stackOut_6_1 = 100;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (var6 != null) {
                            stackOut_8_0 = (mk) (Object) stackIn_8_0;
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = (mk) var6;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            break L4;
                          } else {
                            mk dupTemp$25 = new mk();
                            param0.field_s[var4_int] = dupTemp$25;
                            stackOut_7_0 = (mk) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = (mk) dupTemp$25;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            break L4;
                          }
                        }
                        ((mk) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2);
                        var4_int++;
                        break L3;
                      } else {
                        param0.field_s[var4_int] = null;
                        var4_int++;
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
              var8 = null;
              ((jl) this).a((ja) null, (byte) -75);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("jl.H(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, fm param6, pd param7, pd param8, int param9, int param10, int param11, int param12, int param13, int param14, fm param15, int param16, int param17, pd param18, int param19) {
        RuntimeException var21 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            int discarded$1 = 61;
            lj.a(param6, 480, param15);
            ek.a(param16, param0, 1829947600, param9, param10);
            uo.a(param13, param1, 1633);
            vl.a(param18, param8, 127, param2, param12, param11);
            qb.a(param17, (byte) -115, param7, param14);
            nn.a((byte) 55, param3, param19, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var21;
            stackOut_2_1 = new StringBuilder().append("jl.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(480).append(',').append(param5).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param6 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param7 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param8 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param15 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param16).append(',').append(param17).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param18 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param19 + ',' + true + ')');
        }
    }

    final mk a(int param0, byte param1) {
        Object var4 = null;
        if (param1 != -36) {
          var4 = null;
          this.a((jl) null, false, (byte) -31);
          mk dupTemp$4 = new mk();
          ((jl) this).field_s[param0] = dupTemp$4;
          return dupTemp$4;
        } else {
          mk dupTemp$5 = new mk();
          ((jl) this).field_s[param0] = dupTemp$5;
          return dupTemp$5;
        }
    }

    final void a(ja[] param0, int param1, boolean param2) {
        int var4_int = 0;
        if (param2) {
            return;
        }
        try {
            var4_int = param1;
            if (null == ((jl) this).field_s[var4_int]) {
                ((jl) this).field_s[var4_int] = new mk();
            }
            ((jl) this).field_s[param1].field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "jl.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    jl(jl param0, boolean param1) {
        this();
        try {
            param0.a((jl) this, param1, (byte) -122);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "jl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static java.applet.Applet b(int param0) {
        if (null != fd.field_L) {
            return fd.field_L;
        }
        if (param0 != 0) {
            field_v = null;
            return (java.applet.Applet) (Object) tg.field_i;
        }
        return (java.applet.Applet) (Object) tg.field_i;
    }

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        RuntimeException var6 = null;
        mk var7 = null;
        mk var9 = null;
        Object var10 = null;
        gn var11 = null;
        mk var12 = null;
        mk var13 = null;
        mk var14 = null;
        mk var15 = null;
        cf stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        cf stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              if (param4 instanceof gn) {
                stackOut_2_0 = (cf) param4;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (cf) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (gn) (Object) stackIn_3_0;
              nm.a(param3 - -param4.field_y, param4.field_w + (param4.field_i + param1), (byte) 105, param3 - -param4.field_y - -param4.field_n, param1 - -param4.field_i);
              if (var11 == null) {
                break L2;
              } else {
                param0 = param0 & var11.field_F;
                break L2;
              }
            }
            L3: {
              var7 = ((jl) this).field_s[0];
              ((jl) this).field_w.a((byte) 11);
              var7.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
              if (var11 != null) {
                L4: {
                  if (var11.field_G) {
                    var12 = ((jl) this).field_s[1];
                    if (var12 != null) {
                      var12.a(param2 + 4004, param3, param1, (jl) this, param4, ((jl) this).field_w);
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
                    var13 = ((jl) this).field_s[3];
                    if (var11.field_u == 0) {
                      break L5;
                    } else {
                      if (var13 != null) {
                        var13.a(param2 ^ 4196, param3, param1, (jl) this, param4, ((jl) this).field_w);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var9 = ((jl) this).field_s[2];
                  if (var9 == null) {
                    break L3;
                  } else {
                    var9.a(param2 + 4004, param3, param1, (jl) this, param4, ((jl) this).field_w);
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
                var14 = ((jl) this).field_s[5];
                if (var14 == null) {
                  break L6;
                } else {
                  var14.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (!param0) {
                var15 = ((jl) this).field_s[4];
                if (var15 == null) {
                  break L7;
                } else {
                  var15.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
            int discarded$1 = 1;
            ql.a();
            if (param2 == -15112) {
              break L0;
            } else {
              var10 = null;
              this.a((jl) null, false, (byte) -63);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var6;
            stackOut_31_1 = new StringBuilder().append("jl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param4 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L8;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    final void a(ja param0, byte param1) {
        mk[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        mk var5_ref_mk = null;
        int var5 = 0;
        int var6 = 0;
        mk[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var7 = ((jl) this).field_s;
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
                    var4++;
                    break L2;
                  } else {
                    var4++;
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
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("jl.G(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, boolean param3, int param4, int param5, int param6) {
        String var7 = null;
        if (va.field_a != 2) {
            var7 = pi.field_e;
        } else {
            var7 = nc.field_c;
        }
        gf.a(127, param2, 180, 320, var7, param6, param0, param3);
    }

    final void a(ja[] param0, boolean param1) {
        mk[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        mk var5 = null;
        int var6 = 0;
        mk[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var7 = ((jl) this).field_s;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var7.length <= var4) {
                if (!param1) {
                  break L0;
                } else {
                  ((jl) this).field_w = null;
                  return;
                }
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_e = param0;
                    var4++;
                    break L2;
                  } else {
                    var4++;
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
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("jl.J(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
    }

    public jl() {
        ((jl) this).field_s = new mk[6];
        ((jl) this).field_w = new mk();
        mk dupTemp$0 = new mk();
        ((jl) this).field_s[0] = dupTemp$0;
        mk var1 = dupTemp$0;
        var1.a((byte) 11);
    }

    public static void a() {
        field_t = null;
        field_v = null;
        field_u = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Average rating";
        field_v = "Logging in...";
    }
}
