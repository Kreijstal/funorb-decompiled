/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends lj {
    private wa field_A;
    static String field_D;
    static boolean[] field_B;
    private int field_C;

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.charAt(0);
            var3 = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param1.length() <= var3) {
                    break L3;
                  } else {
                    stackOut_3_0 = var2_int;
                    stackIn_10_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 != param1.charAt(var3)) {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var3++;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("ve.D(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final String f(int param0) {
        boolean discarded$5 = false;
        qg var3 = null;
        if (param0 == 4) {
          if (!this.field_g) {
            return null;
          } else {
            return this.field_A.c(param0 + 30519);
          }
        } else {
          var3 = (qg) null;
          discarded$5 = this.a((qg) null, 58);
          if (!this.field_g) {
            return null;
          } else {
            return this.field_A.c(param0 + 30519);
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        rc var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ti var13 = null;
        ti var14 = null;
        ti var15 = null;
        ti var16 = null;
        ti var17 = null;
        ti var18 = null;
        var12 = Transmogrify.field_A ? 1 : 0;
        super.a(param0, param1, param2, (byte) 111);
        if (param2 != 0) {
          return;
        } else {
          var5 = this.field_p + (param0 - -(this.field_l >> 223267105));
          var6 = param1 - (-this.field_n - (this.field_h >> 1057192001));
          var9 = -100 % ((param3 - 77) / 34);
          var8 = this.field_A.a(27835);
          if (var8 != ek.field_a) {
            if (var8 != fi.field_u) {
              if (var8 != ec.field_d) {
                if (hi.field_b == var8) {
                  var13 = ai.field_b[1];
                  var13.c(var5 - (var13.field_n >> -2070636575), var6 + -(var13.field_m >> 1702224449), 256);
                  if (var12 != 0) {
                    var14 = ai.field_b[2];
                    var14.c(var5 + -(var14.field_n >> 785295009), var6 + -(var14.field_m >> -374736543), 256);
                    if (var12 != 0) {
                      var18 = ai.field_b[0];
                      var10 = var18.field_r << 1165049825;
                      var11 = var18.field_s << -381623679;
                      if (null != vh.field_l) {
                        if (var10 <= vh.field_l.field_n) {
                          if (vh.field_l.field_m >= var11) {
                            oj.a(vh.field_l, 256);
                            sb.c();
                            if (var12 == 0) {
                              var18.a(112, 144, var18.field_r << 1650091844, var18.field_s << 598458308, -this.field_C << -2055185238, 4096);
                              fi.c(true);
                              vh.field_l.c(-var18.field_r + var5, var6 - var18.field_s, 256);
                              return;
                            } else {
                              vh.field_l = new ti(var10, var11);
                              oj.a(vh.field_l, 256);
                              var18.a(112, 144, var18.field_r << 1650091844, var18.field_s << 598458308, -this.field_C << -2055185238, 4096);
                              fi.c(true);
                              vh.field_l.c(-var18.field_r + var5, var6 - var18.field_s, 256);
                              return;
                            }
                          } else {
                            vh.field_l = new ti(var10, var11);
                            oj.a(vh.field_l, 256);
                            var18.a(112, 144, var18.field_r << 1650091844, var18.field_s << 598458308, -this.field_C << -2055185238, 4096);
                            fi.c(true);
                            vh.field_l.c(-var18.field_r + var5, var6 - var18.field_s, 256);
                            return;
                          }
                        } else {
                          vh.field_l = new ti(var10, var11);
                          oj.a(vh.field_l, 256);
                          var18.a(112, 144, var18.field_r << 1650091844, var18.field_s << 598458308, -this.field_C << -2055185238, 4096);
                          fi.c(true);
                          vh.field_l.c(-var18.field_r + var5, var6 - var18.field_s, 256);
                          return;
                        }
                      } else {
                        vh.field_l = new ti(var10, var11);
                        oj.a(vh.field_l, 256);
                        var18.a(112, 144, var18.field_r << 1650091844, var18.field_s << 598458308, -this.field_C << -2055185238, 4096);
                        fi.c(true);
                        vh.field_l.c(-var18.field_r + var5, var6 - var18.field_s, 256);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                var14 = ai.field_b[2];
                var14.c(var5 + -(var14.field_n >> 785295009), var6 + -(var14.field_m >> -374736543), 256);
                if (var12 != 0) {
                  var18 = ai.field_b[0];
                  var10 = var18.field_r << 1165049825;
                  var11 = var18.field_s << -381623679;
                  if (null != vh.field_l) {
                    if (var10 <= vh.field_l.field_n) {
                      if (vh.field_l.field_m >= var11) {
                        oj.a(vh.field_l, 256);
                        sb.c();
                        if (var12 != 0) {
                          vh.field_l = new ti(var10, var11);
                          oj.a(vh.field_l, 256);
                          var18.a(112, 144, var18.field_r << 1650091844, var18.field_s << 598458308, -this.field_C << -2055185238, 4096);
                          fi.c(true);
                          vh.field_l.c(-var18.field_r + var5, var6 - var18.field_s, 256);
                          return;
                        } else {
                          var18.a(112, 144, var18.field_r << 1650091844, var18.field_s << 598458308, -this.field_C << -2055185238, 4096);
                          fi.c(true);
                          vh.field_l.c(-var18.field_r + var5, var6 - var18.field_s, 256);
                          return;
                        }
                      } else {
                        vh.field_l = new ti(var10, var11);
                        oj.a(vh.field_l, 256);
                        var18.a(112, 144, var18.field_r << 1650091844, var18.field_s << 598458308, -this.field_C << -2055185238, 4096);
                        fi.c(true);
                        vh.field_l.c(-var18.field_r + var5, var6 - var18.field_s, 256);
                        return;
                      }
                    } else {
                      vh.field_l = new ti(var10, var11);
                      oj.a(vh.field_l, 256);
                      var18.a(112, 144, var18.field_r << 1650091844, var18.field_s << 598458308, -this.field_C << -2055185238, 4096);
                      fi.c(true);
                      vh.field_l.c(-var18.field_r + var5, var6 - var18.field_s, 256);
                      return;
                    }
                  } else {
                    vh.field_l = new ti(var10, var11);
                    oj.a(vh.field_l, 256);
                    var18.a(112, 144, var18.field_r << 1650091844, var18.field_s << 598458308, -this.field_C << -2055185238, 4096);
                    fi.c(true);
                    vh.field_l.c(-var18.field_r + var5, var6 - var18.field_s, 256);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              var17 = ai.field_b[0];
              var15 = var17;
              var10 = var17.field_r << 1165049825;
              var11 = var17.field_s << -381623679;
              if (null != vh.field_l) {
                if (var10 <= vh.field_l.field_n) {
                  if (vh.field_l.field_m >= var11) {
                    oj.a(vh.field_l, 256);
                    sb.c();
                    if (var12 != 0) {
                      vh.field_l = new ti(var10, var11);
                      oj.a(vh.field_l, 256);
                      var17.a(112, 144, var17.field_r << 1650091844, var17.field_s << 598458308, -this.field_C << -2055185238, 4096);
                      fi.c(true);
                      vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
                      return;
                    } else {
                      var17.a(112, 144, var17.field_r << 1650091844, var17.field_s << 598458308, -this.field_C << -2055185238, 4096);
                      fi.c(true);
                      vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
                      return;
                    }
                  } else {
                    vh.field_l = new ti(var10, var11);
                    oj.a(vh.field_l, 256);
                    var17.a(112, 144, var17.field_r << 1650091844, var17.field_s << 598458308, -this.field_C << -2055185238, 4096);
                    fi.c(true);
                    vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
                    return;
                  }
                } else {
                  vh.field_l = new ti(var10, var11);
                  oj.a(vh.field_l, 256);
                  var17.a(112, 144, var17.field_r << 1650091844, var17.field_s << 598458308, -this.field_C << -2055185238, 4096);
                  fi.c(true);
                  vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
                  return;
                }
              } else {
                vh.field_l = new ti(var10, var11);
                oj.a(vh.field_l, 256);
                var17.a(112, 144, var17.field_r << 1650091844, var17.field_s << 598458308, -this.field_C << -2055185238, 4096);
                fi.c(true);
                vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
                return;
              }
            }
          } else {
            var16 = ai.field_b[0];
            var15 = var16;
            var10 = var16.field_r << 1165049825;
            var11 = var16.field_s << -381623679;
            if (null != vh.field_l) {
              if (var10 <= vh.field_l.field_n) {
                if (vh.field_l.field_m >= var11) {
                  oj.a(vh.field_l, 256);
                  sb.c();
                  if (var12 != 0) {
                    vh.field_l = new ti(var10, var11);
                    oj.a(vh.field_l, 256);
                    var16.a(112, 144, var16.field_r << 1650091844, var16.field_s << 598458308, -this.field_C << -2055185238, 4096);
                    fi.c(true);
                    vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
                    return;
                  } else {
                    var16.a(112, 144, var16.field_r << 1650091844, var16.field_s << 598458308, -this.field_C << -2055185238, 4096);
                    fi.c(true);
                    vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
                    return;
                  }
                } else {
                  vh.field_l = new ti(var10, var11);
                  oj.a(vh.field_l, 256);
                  var16.a(112, 144, var16.field_r << 1650091844, var16.field_s << 598458308, -this.field_C << -2055185238, 4096);
                  fi.c(true);
                  vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
                  return;
                }
              } else {
                vh.field_l = new ti(var10, var11);
                oj.a(vh.field_l, 256);
                var16.a(112, 144, var16.field_r << 1650091844, var16.field_s << 598458308, -this.field_C << -2055185238, 4096);
                fi.c(true);
                vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
                return;
              }
            } else {
              vh.field_l = new ti(var10, var11);
              oj.a(vh.field_l, 256);
              var16.a(112, 144, var16.field_r << 1650091844, var16.field_s << 598458308, -this.field_C << -2055185238, 4096);
              fi.c(true);
              vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_B = null;
        field_D = null;
        if (param0 > -58) {
            ve.a((byte) 42);
        }
    }

    final static uj a(String[] args, byte param1) {
        uj var2 = null;
        RuntimeException var2_ref = null;
        uj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        uj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -98) {
                break L1;
              } else {
                field_D = (String) null;
                break L1;
              }
            }
            var2 = new uj(false);
            var2.field_j = args;
            stackOut_2_0 = (uj) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("ve.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (args == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(qg param0, int param1) {
        uj discarded$2 = null;
        RuntimeException var3 = null;
        String[] var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 < -11) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              var4 = (String[]) null;
              discarded$2 = ve.a((String[]) null, (byte) -44);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ve.M(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    ve(wa param0) {
        try {
            this.field_A = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ve.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, qg param2, int param3) {
        try {
            this.field_C = this.field_C + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ve.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_B = new boolean[112];
        field_D = "Total";
    }
}
