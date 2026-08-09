/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends hi {
    private ig field_q;
    private ig field_p;
    static java.awt.Frame field_r;
    static kk field_o;
    static int[] field_t;
    static String field_u;
    static int[] field_s;

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = this.field_q.field_n.toLowerCase();
            var4 = param1.toLowerCase();
            var5 = 114 / ((-24 - param0) / 35);
            if (0 != var4.length()) {
              var6 = var4;
              if (vg.a(true, var6)) {
                stackIn_6_0 = ei.field_k;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (!nf.a(var6, -29205)) {
                  if (pb.a(17032, var6)) {
                    stackIn_13_0 = uj.field_i;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    if (!this.a(121, param1)) {
                      if (0 < var7.length()) {
                        if (kc.a(var6, true, var7)) {
                          stackIn_23_0 = jc.field_e;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          if (!vh.a(var7, 29360, var6)) {
                            if (!eg.a(false, var7, var6)) {
                              stackIn_31_0 = ei.field_k;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              stackIn_29_0 = jc.field_e;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            }
                          } else {
                            stackIn_26_0 = dc.field_c;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          }
                        }
                      } else {
                        stackIn_19_0 = l.field_b;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    } else {
                      stackIn_16_0 = hg.field_c;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } else {
                  stackIn_9_0 = g.field_R;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3);

            stackIn_34_1 = new StringBuilder().append("db.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L1;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
                      } else {
                        return stackIn_31_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static String a(byte[] param0, int param1, byte param2, int param3) {
        int incrementValue$1 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_3_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var12 = new char[param3];
            var11 = var12;
            var10 = var11;
            var4 = var10;
            var5 = 0;
            if (param2 <= -113) {
              var6 = 0;
              L1: while (true) {
                if (param3 <= var6) {
                  stackIn_16_0 = new String(var12, 0, var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var7 = 255 & param0[param1 + var6];
                    if (0 == var7) {
                      break L2;
                    } else {
                      L3: {
                        if ((var7 ^ -1) > -129) {
                          break L3;
                        } else {
                          if (var7 >= 160) {
                            break L3;
                          } else {
                            L4: {
                              var8 = kh.field_hb[-128 + var7];
                              if (var8 != 0) {
                                break L4;
                              } else {
                                var8 = 63;
                                break L4;
                              }
                            }
                            var7 = var8;
                            break L3;
                          }
                        }
                      }
                      incrementValue$1 = var5;
                      var5++;
                      var10[incrementValue$1] = (char)var7;
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4_ref);

            stackIn_19_1 = new StringBuilder().append("db.E(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_16_0;
        }
    }

    db(ig param0, ig param1, ig param2) {
        super(param0);
        try {
            this.field_q = param1;
            this.field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "db.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_t = null;
        field_r = null;
        field_u = null;
        field_s = null;
        if (param0 > -35) {
            return;
        }
        field_o = null;
    }

    private final boolean a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_p.field_n.toLowerCase();
              var4 = param1.toLowerCase();
              if ((var3.length() ^ -1) >= -1) {
                break L1;
              } else {
                if (-1 <= (var4.length() ^ -1)) {
                  break L1;
                } else {
                  var5 = var3.lastIndexOf("@");
                  if (var5 < 0) {
                    break L1;
                  } else {
                    if (var5 < var3.length() - 1) {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(1 + var5);
                      if (0 <= var4.indexOf(var6)) {
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if (var4.indexOf(var7) >= 0) {
                          stackIn_12_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            if (param0 > 104) {
              stackIn_17_0 = 0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackIn_15_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("db.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L2;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    final bm a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        bm stackIn_2_0 = null;
        bm stackIn_5_0 = null;
        bm stackIn_8_0 = null;
        bm stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_q.field_n.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() != 0) {
              if (ja.a(var4, var3, 0)) {
                var5 = -63 % ((3 - param1) / 42);
                if (!this.a(123, param0)) {
                  stackIn_10_0 = nd.field_d;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = bi.field_d;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = bi.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = bi.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("db.L(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    final static void a(boolean param0, int param1, ji param2) {
        try {
            kh.a(param2, param1, (byte) -105, param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "db.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_u = "Type your email address again to make sure it's correct";
    }
}
