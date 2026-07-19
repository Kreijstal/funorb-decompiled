/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static String field_b;
    private String field_a;

    final static void a(gn param0, int param1) {
        sn var2 = null;
        el discarded$0 = null;
        try {
            sn.b(param0.a("", false, "headers.packvorbis"));
            var2 = sn.a(param0, "jagex logo2.packvorbis", "");
            if (param1 != 0) {
                field_b = (String) null;
            }
            discarded$0 = var2.c();
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "mf.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(java.applet.Applet param0, int param1) {
        if (param1 < 122) {
            return;
        }
        try {
            he.a(31536000L, param0, this.field_a, -100, "jagex-last-login-method");
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "mf.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int[] a(int param0, byte param1, int param2, int[] param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ij var16 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var15 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var4_int = param3.length;
              var5 = new int[var4_int];
              var6 = param0 >> -1924186064 & 255;
              var7 = param2 >> -1878944272 & 255;
              var8 = param0 >> 1021813384 & 255;
              var9 = (65280 & param2) >> 736974952;
              var10 = param0 & 255;
              if (param1 > 90) {
                break L1;
              } else {
                var16 = (ij) null;
                mf.a((ij) null, true);
                break L1;
              }
            }
            var11 = 255 & param2;
            var12 = 0;
            L2: while (true) {
              if (var4_int <= var12) {
                stackOut_6_0 = (int[]) (var5);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var13 = param3[var12];
                var14 = (var13 >> -614396280 & 255) * 6 + (((var13 & 16711680) >> 444045680) * 5 + 5 * (255 & var13));
                var5[var12] = kc.a((int)((float)var14 / 4096.0f * (float)(var11 - var10)) + var10, kc.a((int)((float)var14 / 4096.0f * (float)(var9 + -var8)) + var8 << 572642440, var6 + (int)((float)(var7 - var6) * ((float)var14 / 4096.0f)) << 437779696));
                var12++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("mf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(ij param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ij var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            if (param0.field_o == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  if (0 != param0.field_j) {
                    break L2;
                  } else {
                    if (param0.field_e == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (in.field_e <= var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = lj.field_a[var2_int];
                      if (2 != var3.field_h) {
                        break L4;
                      } else {
                        if (param0.field_j != var3.field_j) {
                          break L4;
                        } else {
                          if (var3.field_e != param0.field_e) {
                            break L4;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param0.field_b != null) {
                  break L5;
                } else {
                  break L5;
                }
              }
              ic.a(21325, param0);
              if (!param1) {
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                field_b = (String) null;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var2);
            stackOut_19_1 = new StringBuilder().append("mf.B(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
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

    public static void a(int param0) {
        if (param0 > -62) {
            mf.a(-12);
            field_b = null;
            return;
        }
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_29_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_53_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        if (!param1) {
          if (oh.field_s[param2] < oh.field_s[param0]) {
            return true;
          } else {
            if (oh.field_s[param0] < oh.field_s[param2]) {
              return false;
            } else {
              if (va.field_j[param2] >= va.field_j[param0]) {
                if (va.field_j[param0] >= va.field_j[param2]) {
                  var4 = da.field_u[param2] + (ua.field_c[param2] + fj.field_q[param2]);
                  var5 = ua.field_c[param0] + da.field_u[param0] - -fj.field_q[param0];
                  if (var4 < var5) {
                    return true;
                  } else {
                    if (param3 != 13234) {
                      mf.a(-89);
                      if (var5 >= var4) {
                        if (param2 >= param0) {
                          return false;
                        } else {
                          return true;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L0: {
                          if (param2 >= param0) {
                            stackOut_28_0 = 0;
                            stackIn_29_0 = stackOut_28_0;
                            break L0;
                          } else {
                            stackOut_27_0 = 1;
                            stackIn_29_0 = stackOut_27_0;
                            break L0;
                          }
                        }
                        return stackIn_29_0 != 0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          if (va.field_j[param0] > va.field_j[param2]) {
            return true;
          } else {
            if (va.field_j[param0] < va.field_j[param2]) {
              return false;
            } else {
              if (oh.field_s[param0] <= oh.field_s[param2]) {
                if (oh.field_s[param2] <= oh.field_s[param0]) {
                  var4 = da.field_u[param2] + (ua.field_c[param2] + fj.field_q[param2]);
                  var5 = ua.field_c[param0] + da.field_u[param0] - -fj.field_q[param0];
                  if (var4 < var5) {
                    return true;
                  } else {
                    if (param3 == 13234) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L1: {
                          if (param2 >= param0) {
                            stackOut_52_0 = 0;
                            stackIn_53_0 = stackOut_52_0;
                            break L1;
                          } else {
                            stackOut_51_0 = 1;
                            stackIn_53_0 = stackOut_51_0;
                            break L1;
                          }
                        }
                        return stackIn_53_0 != 0;
                      }
                    } else {
                      mf.a(-89);
                      if (var5 < var4) {
                        return false;
                      } else {
                        L2: {
                          if (param2 >= param0) {
                            stackOut_45_0 = 0;
                            stackIn_46_0 = stackOut_45_0;
                            break L2;
                          } else {
                            stackOut_44_0 = 1;
                            stackIn_46_0 = stackOut_44_0;
                            break L2;
                          }
                        }
                        return stackIn_46_0 != 0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    final boolean a(int param0, String param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 > 62) {
              stackOut_3_0 = this.field_a.equals(param1);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("mf.C(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    mf(String param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Passwords must be between 5 and 20 characters long";
    }
}
