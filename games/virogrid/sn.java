/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends qe {
    static String field_n;
    static String field_p;
    private wa field_o;
    private wa field_q;

    final static int h(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 3938) {
                break L1;
              } else {
                field_n = (String) null;
                break L1;
              }
            }
            tm.field_l.a(dc.field_O, co.field_i, (byte) -127, true);
            tm.field_l.i(-89);
            L2: while (true) {
              if (!nd.b((byte) -123)) {
                if ((el.field_r ^ -1) == 0) {
                  if (!fe.field_Fb) {
                    if (ao.field_Kb != cb.field_c) {
                      if (w.field_I.b(-97)) {
                        if (ao.field_Kb != pa.field_l) {
                          stackIn_22_0 = -1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackIn_20_0 = 2;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        stackIn_17_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackIn_14_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_11_0 = 3;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  var1_int = el.field_r;
                  kf.a(-1, -1);
                  stackIn_8_0 = var1_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                tm.field_l.a(um.field_Gb, nm.field_d, -98);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "sn.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  return stackIn_22_0;
                }
              }
            }
          }
        }
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -22274) {
                break L1;
              } else {
                field_n = (String) null;
                break L1;
              }
            }
            L2: {
              var3 = this.field_o.field_n.toLowerCase();
              var4 = param1.toLowerCase();
              if ((var3.length() ^ -1) >= -1) {
                break L2;
              } else {
                if (0 < var4.length()) {
                  var5 = var3.lastIndexOf("@");
                  if (0 > var5) {
                    break L2;
                  } else {
                    if (var5 < var3.length() + -1) {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(1 + var5);
                      if ((var4.indexOf(var6) ^ -1) <= -1) {
                        stackIn_11_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if (-1 < (var4.indexOf(var7) ^ -1)) {
                          break L2;
                        } else {
                          stackIn_14_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackIn_16_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("sn.Q(").append(param0).append(',');

            if (param1 == null) {
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
          throw kg.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    final static mg a(eh param0, String param1, String param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        mg stackIn_3_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                sn.c((byte) -70);
                break L1;
              }
            }
            var4_int = param0.a(-1, param2);
            var5 = param0.a(-125, var4_int, param1);
            stackIn_3_0 = w.a(param0, -80, var5, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("sn.F(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    sn(wa param0, wa param1, wa param2) {
        super(param0);
        try {
            this.field_o = param2;
            this.field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "sn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = this.field_q.field_n.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              if (!we.a((byte) 80, var5)) {
                if (jd.a(-685, var5)) {
                  stackIn_9_0 = ve.field_z;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (!al.a(var5, param0 + 26484)) {
                    if (this.b(-22274, param1)) {
                      stackIn_16_0 = ib.field_a;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L1: {
                        if (param0 == -26358) {
                          break L1;
                        } else {
                          var6 = (String) null;
                          sn.a((eh) null, (String) null, (String) null, false);
                          break L1;
                        }
                      }
                      if (-1 > (var7.length() ^ -1)) {
                        if (mj.a(var5, var7, (byte) 126)) {
                          stackIn_25_0 = ec.field_A;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          if (!me.a(var5, var7, true)) {
                            if (!w.a(var5, var7, false)) {
                              stackIn_33_0 = nh.field_l;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              stackIn_31_0 = ec.field_A;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            }
                          } else {
                            stackIn_28_0 = kn.field_G;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          }
                        }
                      } else {
                        stackIn_21_0 = ne.field_f;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_12_0 = vd.field_V;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackIn_5_0 = nh.field_l;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var3);

            stackIn_36_1 = new StringBuilder().append("sn.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L2;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_25_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_28_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_31_0;
                      } else {
                        return stackIn_33_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int[] param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = Virogrid.field_F ? 1 : 0;
        try {
            while (true) {
                param3--;
                if (-1 < (param3 ^ -1)) {
                    break;
                }
                var17 = param7;
                var10 = var17;
                var11 = param6;
                var12 = param9;
                var13 = param4;
                var14 = param1;
                var15 = (16711422 & var17[var11]) >> 1397994625;
                var10[var11] = var15 - -(rb.a(33455969, var14) >> 1332884177) - (-rb.a(16711680, var12 >> 1506145089) + -(rb.a(33423751, var13) >> -98375127));
                param4 = param4 + param0;
                param9 = param9 + param8;
                param1 = param1 + param2;
                param6++;
            }
            int var10_int = -53 % ((param5 - -14) / 62);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "sn.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ')');
        }
    }

    public static void c(byte param0) {
        int var1 = -63 / ((-50 - param0) / 36);
        field_p = null;
        field_n = null;
    }

    final wl a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        wl stackIn_2_0 = null;
        wl stackIn_5_0 = null;
        wl stackIn_9_0 = null;
        wl stackIn_12_0 = null;
        wl stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_q.field_n.toLowerCase();
            var4 = param0.toLowerCase();
            if (0 != var4.length()) {
              if (param1) {
                if (!ql.a(-95, var3, var4)) {
                  stackIn_9_0 = ee.field_c;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!this.b(-22274, param0)) {
                    stackIn_14_0 = bm.field_i;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_12_0 = ee.field_c;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_5_0 = (wl) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = ee.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("sn.E(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                return stackIn_14_0;
              }
            }
          }
        }
    }

    static {
        field_n = "The account name you use to access RuneScape and other Jagex.com games";
        field_p = "Pause Menu";
    }
}
