/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends ek {
    static w field_R;
    static int field_L;
    static ck[] field_O;
    private nb field_P;
    static String field_K;
    private int field_M;
    static ve field_N;
    static int field_Q;

    final void a(int param0, int param1, int param2, int param3) {
        String discarded$1 = null;
        int var5 = 0;
        int var6 = 0;
        tb var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ck var14 = null;
        ck var15 = null;
        ck var16 = null;
        ck var17 = null;
        ck var18 = null;
        ck var23 = null;
        ck var24 = null;
        ck var25 = null;
        var11 = client.field_A ? 1 : 0;
        super.a(param0, -105, param2, param3);
        if (param2 != 0) {
          return;
        } else {
          var5 = (this.field_t >> -1680970431) + (this.field_u + param0);
          var6 = param3 - (-this.field_D - (this.field_y >> 2059120769));
          if (param1 <= -103) {
            L0: {
              var8 = this.field_P.a(20350);
              if (le.field_o == var8) {
                break L0;
              } else {
                if (jb.field_j == var8) {
                  break L0;
                } else {
                  L1: {
                    if (var8 != vm.field_u) {
                      break L1;
                    } else {
                      var23 = tl.field_u[2];
                      var23.f(var5 - (var23.field_I >> -993975615), var6 + -(var23.field_H >> -1066974111), 256);
                      if (var11 != 0) {
                        break L1;
                      } else {
                        return;
                      }
                    }
                  }
                  if (var8 == dc.field_b) {
                    var24 = tl.field_u[1];
                    var24.f(-(var24.field_I >> 1795837889) + var5, var6 + -(var24.field_H >> -2125021919), 256);
                    if (var11 != 0) {
                      break L0;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            var25 = tl.field_u[0];
            var9 = var25.field_K << 431319489;
            var10 = var25.field_C << -1730393887;
            if (kl.field_v != null) {
              if (var9 <= kl.field_v.field_I) {
                if (var10 <= kl.field_v.field_H) {
                  tb.a(true, kl.field_v);
                  hk.b();
                  if (var11 != 0) {
                    kl.field_v = new ck(var9, var10);
                    tb.a(true, kl.field_v);
                    var25.a(112, 144, var25.field_K << -1519146172, var25.field_C << 2128115844, -this.field_M << 1537513130, 4096);
                    mk.a((byte) -5);
                    kl.field_v.f(var5 + -var25.field_K, -var25.field_C + var6, 256);
                    return;
                  } else {
                    var25.a(112, 144, var25.field_K << -1519146172, var25.field_C << 2128115844, -this.field_M << 1537513130, 4096);
                    mk.a((byte) -5);
                    kl.field_v.f(var5 + -var25.field_K, -var25.field_C + var6, 256);
                    return;
                  }
                } else {
                  kl.field_v = new ck(var9, var10);
                  tb.a(true, kl.field_v);
                  var25.a(112, 144, var25.field_K << -1519146172, var25.field_C << 2128115844, -this.field_M << 1537513130, 4096);
                  mk.a((byte) -5);
                  kl.field_v.f(var5 + -var25.field_K, -var25.field_C + var6, 256);
                  return;
                }
              } else {
                kl.field_v = new ck(var9, var10);
                tb.a(true, kl.field_v);
                var25.a(112, 144, var25.field_K << -1519146172, var25.field_C << 2128115844, -this.field_M << 1537513130, 4096);
                mk.a((byte) -5);
                kl.field_v.f(var5 + -var25.field_K, -var25.field_C + var6, 256);
                return;
              }
            } else {
              kl.field_v = new ck(var9, var10);
              tb.a(true, kl.field_v);
              var25.a(112, 144, var25.field_K << -1519146172, var25.field_C << 2128115844, -this.field_M << 1537513130, 4096);
              mk.a((byte) -5);
              kl.field_v.f(var5 + -var25.field_K, -var25.field_C + var6, 256);
              return;
            }
          } else {
            discarded$1 = this.c((byte) -60);
            var8 = this.field_P.a(20350);
            if (le.field_o != var8) {
              if (jb.field_j != var8) {
                L2: {
                  if (var8 != vm.field_u) {
                    break L2;
                  } else {
                    var17 = tl.field_u[2];
                    var17.f(var5 - (var17.field_I >> -993975615), var6 + -(var17.field_H >> -1066974111), 256);
                    if (var11 != 0) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
                if (var8 == dc.field_b) {
                  var18 = tl.field_u[1];
                  var18.f(-(var18.field_I >> 1795837889) + var5, var6 + -(var18.field_H >> -2125021919), 256);
                  if (var11 != 0) {
                    var14 = tl.field_u[0];
                    var9 = var14.field_K << 431319489;
                    var10 = var14.field_C << -1730393887;
                    if (kl.field_v != null) {
                      if (var9 <= kl.field_v.field_I) {
                        if (var10 <= kl.field_v.field_H) {
                          tb.a(true, kl.field_v);
                          hk.b();
                          if (var11 != 0) {
                            kl.field_v = new ck(var9, var10);
                            tb.a(true, kl.field_v);
                            var14.a(112, 144, var14.field_K << -1519146172, var14.field_C << 2128115844, -this.field_M << 1537513130, 4096);
                            mk.a((byte) -5);
                            kl.field_v.f(var5 + -var14.field_K, -var14.field_C + var6, 256);
                            return;
                          } else {
                            var14.a(112, 144, var14.field_K << -1519146172, var14.field_C << 2128115844, -this.field_M << 1537513130, 4096);
                            mk.a((byte) -5);
                            kl.field_v.f(var5 + -var14.field_K, -var14.field_C + var6, 256);
                            return;
                          }
                        } else {
                          kl.field_v = new ck(var9, var10);
                          tb.a(true, kl.field_v);
                          var14.a(112, 144, var14.field_K << -1519146172, var14.field_C << 2128115844, -this.field_M << 1537513130, 4096);
                          mk.a((byte) -5);
                          kl.field_v.f(var5 + -var14.field_K, -var14.field_C + var6, 256);
                          return;
                        }
                      } else {
                        kl.field_v = new ck(var9, var10);
                        tb.a(true, kl.field_v);
                        var14.a(112, 144, var14.field_K << -1519146172, var14.field_C << 2128115844, -this.field_M << 1537513130, 4096);
                        mk.a((byte) -5);
                        kl.field_v.f(var5 + -var14.field_K, -var14.field_C + var6, 256);
                        return;
                      }
                    } else {
                      kl.field_v = new ck(var9, var10);
                      tb.a(true, kl.field_v);
                      var14.a(112, 144, var14.field_K << -1519146172, var14.field_C << 2128115844, -this.field_M << 1537513130, 4096);
                      mk.a((byte) -5);
                      kl.field_v.f(var5 + -var14.field_K, -var14.field_C + var6, 256);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L3: {
                  L4: {
                    var16 = tl.field_u[0];
                    var14 = var16;
                    var9 = var16.field_K << 431319489;
                    var10 = var16.field_C << -1730393887;
                    if (kl.field_v == null) {
                      break L4;
                    } else {
                      if (var9 > kl.field_v.field_I) {
                        break L4;
                      } else {
                        if (var10 > kl.field_v.field_H) {
                          break L4;
                        } else {
                          tb.a(true, kl.field_v);
                          hk.b();
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  kl.field_v = new ck(var9, var10);
                  tb.a(true, kl.field_v);
                  break L3;
                }
                var16.a(112, 144, var16.field_K << -1519146172, var16.field_C << 2128115844, -this.field_M << 1537513130, 4096);
                mk.a((byte) -5);
                kl.field_v.f(var5 + -var16.field_K, -var16.field_C + var6, 256);
                return;
              }
            } else {
              L5: {
                L6: {
                  var15 = tl.field_u[0];
                  var9 = var15.field_K << 431319489;
                  var10 = var15.field_C << -1730393887;
                  if (kl.field_v == null) {
                    break L6;
                  } else {
                    if (var9 > kl.field_v.field_I) {
                      break L6;
                    } else {
                      if (var10 > kl.field_v.field_H) {
                        break L6;
                      } else {
                        tb.a(true, kl.field_v);
                        hk.b();
                        if (var11 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                kl.field_v = new ck(var9, var10);
                tb.a(true, kl.field_v);
                break L5;
              }
              var15.a(112, 144, var15.field_K << -1519146172, var15.field_C << 2128115844, -this.field_M << 1537513130, 4096);
              mk.a((byte) -5);
              kl.field_v.f(var5 + -var15.field_K, -var15.field_C + var6, 256);
              return;
            }
          }
        }
    }

    final void a(ce param0, int param1, int param2, int param3) {
        try {
            if (param1 <= 38) {
                g.a(100);
            }
            this.field_M = this.field_M + 1;
            super.a(param0, 89, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "g.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static wb a(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        wb var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_12_0 = null;
        wb stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        wb stackOut_16_0 = null;
        Object stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (null != hg.field_e) {
              L1: {
                var6 = (CharSequence) ((Object) param1);
                var2 = kf.a(var6, (byte) 2);
                if (var2 != null) {
                  break L1;
                } else {
                  var2 = param1;
                  break L1;
                }
              }
              L2: {
                if (param0 == -3805) {
                  break L2;
                } else {
                  g.a(106);
                  break L2;
                }
              }
              var3 = (wb) ((Object) hg.field_e.a(24710, (long)var2.hashCode()));
              L3: while (true) {
                if (var3 != null) {
                  L4: {
                    var7 = (CharSequence) ((Object) var3.field_Ob);
                    var4 = kf.a(var7, (byte) 2);
                    stackOut_11_0 = null;
                    stackIn_20_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (var5 != 0) {
                      break L4;
                    } else {
                      L5: {
                        if (stackIn_12_0 != var4) {
                          break L5;
                        } else {
                          var4 = var3.field_Ob;
                          break L5;
                        }
                      }
                      if (var4.equals(var2)) {
                        stackOut_16_0 = (wb) (var3);
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var3 = (wb) ((Object) hg.field_e.d(-17713));
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          stackOut_19_0 = null;
                          stackIn_20_0 = stackOut_19_0;
                          break L4;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2_ref);
            stackOut_21_1 = new StringBuilder().append("g.D(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wb) ((Object) stackIn_20_0);
        } else {
          return stackIn_17_0;
        }
    }

    final String c(byte param0) {
        if (this.field_q) {
            return this.field_P.b((byte) 69);
        }
        if (param0 == 113) {
            return null;
        }
        return (String) null;
    }

    final boolean a(boolean param0, ce param1) {
        RuntimeException var3 = null;
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
            if (!param0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_Q = -39;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("g.EC(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void a(int param0) {
        field_N = null;
        field_R = null;
        field_O = null;
        field_K = null;
        if (param0 >= -91) {
            field_K = (String) null;
        }
    }

    g(nb param0) {
        try {
            this.field_P = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "g.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_L = 2;
        field_K = "Suggested names: ";
    }
}
