/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    static String field_a;
    private ma field_f;
    static String field_i;
    static String field_d;
    private ma[] field_g;
    static String field_l;
    static di field_k;
    private ma field_j;
    static int field_h;
    private int field_m;
    static vh field_e;
    private int field_b;
    static int[] field_c;

    final void a(byte param0, ma param1, long param2) {
        ma var5 = null;
        try {
            if (!(param1.field_k == null)) {
                param1.a((byte) -117);
            }
            if (param0 >= -112) {
            }
            var5 = this.field_g[(int)(param2 & (long)(this.field_b - 1))];
            param1.field_d = var5;
            param1.field_k = var5.field_k;
            param1.field_k.field_d = param1;
            param1.field_d.field_k = param1;
            param1.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "bm.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 30) {
            field_h = 17;
        }
        field_d = null;
        field_c = null;
        field_i = null;
        field_l = null;
        field_k = null;
        field_e = null;
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 524288) {
                break L1;
              } else {
                field_c = (int[]) null;
                break L1;
              }
            }
            L2: {
              var2_int = nj.b(hq.field_i, ta.field_f, -21223);
              if (1 == var2_int) {
                param1 = "<img=0>" + param1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-3 != (var2_int ^ -1)) {
                break L3;
              } else {
                param1 = "<img=1>" + param1;
                break L3;
              }
            }
            stackOut_7_0 = (String) (param1);
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("bm.D(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    final static void a(boolean param0) {
        int var2 = 0;
        var2 = Pool.field_O;
        if (!param0) {
          L0: {
            if (-1 != (1 << ba.field_ub.field_db & ba.field_ub.field_I.field_x ^ -1)) {
              nk.field_f[10] = dj.field_h;
              break L0;
            } else {
              if (ba.field_ub.field_I.field_x == 0) {
                nk.field_f[10] = eq.field_O;
                break L0;
              } else {
                nk.field_f[10] = ff.field_g;
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final ma a(boolean param0, long param1) {
        ma var5 = null;
        int var6 = Pool.field_O;
        ma var4 = this.field_g[(int)(param1 & (long)(this.field_b + -1))];
        if (param0) {
            return (ma) null;
        }
        this.field_j = var4.field_d;
        while (this.field_j != var4) {
            if (!(this.field_j.field_c != param1)) {
                var5 = this.field_j;
                this.field_j = this.field_j.field_d;
                return var5;
            }
            this.field_j = this.field_j.field_d;
        }
        this.field_j = null;
        return null;
    }

    final ma a(int param0) {
        this.field_m = param0;
        return this.b(-1);
    }

    final ma b(int param0) {
        int fieldTemp$2 = 0;
        ma var2 = null;
        int var3 = 0;
        L0: {
          var3 = Pool.field_O;
          if (0 >= this.field_m) {
            break L0;
          } else {
            if (this.field_g[this.field_m - 1] != this.field_f) {
              var2 = this.field_f;
              this.field_f = var2.field_d;
              return var2;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (this.field_b <= this.field_m) {
            if (param0 != -1) {
              return (ma) null;
            } else {
              return null;
            }
          } else {
            fieldTemp$2 = this.field_m;
            this.field_m = this.field_m + 1;
            var2 = this.field_g[fieldTemp$2].field_d;
            if (this.field_g[-1 + this.field_m] == var2) {
              continue L1;
            } else {
              this.field_f = var2.field_d;
              return var2;
            }
          }
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              var2_int = param0.charAt(0);
              var3 = 1;
              if (param1 <= -103) {
                break L1;
              } else {
                field_i = (String) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var3 >= param0.length()) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var2_int == param0.charAt(var3)) {
                  var3++;
                  continue L2;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("bm.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final static long a(int param0, long param1) {
        String discarded$1 = null;
        int var3 = 0;
        String var4 = null;
        if (0L != param1) {
          L0: {
            if (param0 <= -94) {
              break L0;
            } else {
              var4 = (String) null;
              discarded$1 = bm.a(47, (String) null);
              break L0;
            }
          }
          if (0L > param1) {
            throw new IllegalArgumentException("");
          } else {
            if (param1 < 32768L) {
              L1: {
                if (128L > param1) {
                  if ((param1 ^ -1L) <= -9L) {
                    if (-33L < (param1 ^ -1L)) {
                      var3 = 6;
                      break L1;
                    } else {
                      var3 = 5;
                      break L1;
                    }
                  } else {
                    if ((param1 ^ -1L) <= -3L) {
                      var3 = 7;
                      break L1;
                    } else {
                      return 256L;
                    }
                  }
                } else {
                  if (param1 < 2048L) {
                    if (512L <= param1) {
                      var3 = 3;
                      break L1;
                    } else {
                      var3 = 4;
                      break L1;
                    }
                  } else {
                    if (-8193L >= (param1 ^ -1L)) {
                      var3 = 1;
                      break L1;
                    } else {
                      var3 = 2;
                      break L1;
                    }
                  }
                }
              }
              param1 = param1 << (var3 << -1947851807);
              return (long)(ac.field_o[(int)(param1 + -32768L)] >> var3);
            } else {
              if (131072L > param1) {
                return (long)ac.field_o[(int)(-32768L + param1)];
              } else {
                L2: {
                  if (-549755813889L < (param1 ^ -1L)) {
                    if (-134217729L < (param1 ^ -1L)) {
                      if ((param1 ^ -1L) <= -2097153L) {
                        if ((param1 ^ -1L) <= -33554433L) {
                          var3 = 5;
                          break L2;
                        } else {
                          if (param1 < 8388608L) {
                            var3 = 3;
                            break L2;
                          } else {
                            var3 = 4;
                            break L2;
                          }
                        }
                      } else {
                        if (param1 < 524288L) {
                          var3 = 1;
                          break L2;
                        } else {
                          var3 = 2;
                          break L2;
                        }
                      }
                    } else {
                      if (8589934592L > param1) {
                        if ((param1 ^ -1L) > -2147483649L) {
                          if (-536870913L < (param1 ^ -1L)) {
                            var3 = 6;
                            break L2;
                          } else {
                            var3 = 7;
                            break L2;
                          }
                        } else {
                          var3 = 8;
                          break L2;
                        }
                      } else {
                        if ((param1 ^ -1L) > -137438953473L) {
                          if (-34359738369L >= (param1 ^ -1L)) {
                            var3 = 10;
                            break L2;
                          } else {
                            var3 = 9;
                            break L2;
                          }
                        } else {
                          var3 = 11;
                          break L2;
                        }
                      }
                    }
                  } else {
                    if (param1 < 2251799813685248L) {
                      if (param1 < 35184372088832L) {
                        if ((param1 ^ -1L) > -8796093022209L) {
                          if (-2199023255553L >= (param1 ^ -1L)) {
                            var3 = 13;
                            break L2;
                          } else {
                            var3 = 12;
                            break L2;
                          }
                        } else {
                          var3 = 14;
                          break L2;
                        }
                      } else {
                        if (-562949953421313L < (param1 ^ -1L)) {
                          if (param1 < 140737488355328L) {
                            var3 = 15;
                            break L2;
                          } else {
                            var3 = 16;
                            break L2;
                          }
                        } else {
                          var3 = 17;
                          break L2;
                        }
                      }
                    } else {
                      if (-144115188075855873L >= (param1 ^ -1L)) {
                        if (-2305843009213693953L < (param1 ^ -1L)) {
                          if (param1 < 576460752303423488L) {
                            var3 = 21;
                            break L2;
                          } else {
                            var3 = 22;
                            break L2;
                          }
                        } else {
                          var3 = 23;
                          break L2;
                        }
                      } else {
                        if (-36028797018963969L >= (param1 ^ -1L)) {
                          var3 = 20;
                          break L2;
                        } else {
                          if (9007199254740992L <= param1) {
                            var3 = 19;
                            break L2;
                          } else {
                            var3 = 18;
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                param1 = param1 >> (var3 << -1534906879);
                return (long)ac.field_o[(int)(-32768L + param1)] << var3;
              }
            }
          }
        } else {
          return 0L;
        }
    }

    bm(int param0) {
        int var2 = 0;
        ma dupTemp$0 = null;
        ma var3 = null;
        this.field_m = 0;
        this.field_b = param0;
        this.field_g = new ma[param0];
        for (var2 = 0; param0 > var2; var2++) {
            dupTemp$0 = new ma();
            var3 = dupTemp$0;
            this.field_g[var2] = dupTemp$0;
            var3.field_k = var3;
            var3.field_d = var3;
        }
    }

    static {
        field_a = "Passwords can only contain letters and numbers";
        field_i = "End Game";
        field_d = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_l = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
