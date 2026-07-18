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
        ck var20 = null;
        ck var21 = null;
        ck var22 = null;
        ck var23 = null;
        var11 = client.field_A ? 1 : 0;
        super.a(param0, -105, param2, param3);
        if (param2 != 0) {
          return;
        } else {
          var5 = (((g) this).field_t >> 1) + (((g) this).field_u + param0);
          var6 = param3 - (-((g) this).field_D - (((g) this).field_y >> 1));
          if (param1 <= -103) {
            var8 = ((g) this).field_P.a(20350);
            if (le.field_o != var8) {
              if (jb.field_j != var8) {
                if (var8 != vm.field_u) {
                  if (var8 != dc.field_b) {
                    return;
                  } else {
                    var22 = tl.field_u[1];
                    var22.f(-(var22.field_I >> 1) + var5, var6 + -(var22.field_H >> 1), 256);
                    return;
                  }
                } else {
                  var21 = tl.field_u[2];
                  var21.f(var5 - (var21.field_I >> 1), var6 + -(var21.field_H >> 1), 256);
                  return;
                }
              } else {
                var23 = tl.field_u[0];
                var9 = var23.field_K << 1;
                var10 = var23.field_C << 1;
                if (kl.field_v != null) {
                  if (var9 <= kl.field_v.field_I) {
                    if (var10 <= kl.field_v.field_H) {
                      tb.a(true, kl.field_v);
                      hk.b();
                      var23.a(112, 144, var23.field_K << 4, var23.field_C << 4, -((g) this).field_M << 10, 4096);
                      mk.a((byte) -5);
                      kl.field_v.f(var5 + -var23.field_K, -var23.field_C + var6, 256);
                      return;
                    } else {
                      kl.field_v = new ck(var9, var10);
                      tb.a(true, kl.field_v);
                      var23.a(112, 144, var23.field_K << 4, var23.field_C << 4, -((g) this).field_M << 10, 4096);
                      mk.a((byte) -5);
                      kl.field_v.f(var5 + -var23.field_K, -var23.field_C + var6, 256);
                      return;
                    }
                  } else {
                    kl.field_v = new ck(var9, var10);
                    tb.a(true, kl.field_v);
                    var23.a(112, 144, var23.field_K << 4, var23.field_C << 4, -((g) this).field_M << 10, 4096);
                    mk.a((byte) -5);
                    kl.field_v.f(var5 + -var23.field_K, -var23.field_C + var6, 256);
                    return;
                  }
                } else {
                  kl.field_v = new ck(var9, var10);
                  tb.a(true, kl.field_v);
                  var23.a(112, 144, var23.field_K << 4, var23.field_C << 4, -((g) this).field_M << 10, 4096);
                  mk.a((byte) -5);
                  kl.field_v.f(var5 + -var23.field_K, -var23.field_C + var6, 256);
                  return;
                }
              }
            } else {
              var23 = tl.field_u[0];
              var9 = var23.field_K << 1;
              var10 = var23.field_C << 1;
              if (kl.field_v != null) {
                if (var9 <= kl.field_v.field_I) {
                  if (var10 <= kl.field_v.field_H) {
                    tb.a(true, kl.field_v);
                    hk.b();
                    var23.a(112, 144, var23.field_K << 4, var23.field_C << 4, -((g) this).field_M << 10, 4096);
                    mk.a((byte) -5);
                    kl.field_v.f(var5 + -var23.field_K, -var23.field_C + var6, 256);
                    return;
                  } else {
                    kl.field_v = new ck(var9, var10);
                    tb.a(true, kl.field_v);
                    var23.a(112, 144, var23.field_K << 4, var23.field_C << 4, -((g) this).field_M << 10, 4096);
                    mk.a((byte) -5);
                    kl.field_v.f(var5 + -var23.field_K, -var23.field_C + var6, 256);
                    return;
                  }
                } else {
                  kl.field_v = new ck(var9, var10);
                  tb.a(true, kl.field_v);
                  var23.a(112, 144, var23.field_K << 4, var23.field_C << 4, -((g) this).field_M << 10, 4096);
                  mk.a((byte) -5);
                  kl.field_v.f(var5 + -var23.field_K, -var23.field_C + var6, 256);
                  return;
                }
              } else {
                kl.field_v = new ck(var9, var10);
                tb.a(true, kl.field_v);
                var23.a(112, 144, var23.field_K << 4, var23.field_C << 4, -((g) this).field_M << 10, 4096);
                mk.a((byte) -5);
                kl.field_v.f(var5 + -var23.field_K, -var23.field_C + var6, 256);
                return;
              }
            }
          } else {
            String discarded$1 = ((g) this).c((byte) -60);
            var8 = ((g) this).field_P.a(20350);
            if (le.field_o != var8) {
              if (jb.field_j != var8) {
                if (var8 != vm.field_u) {
                  if (var8 != dc.field_b) {
                    return;
                  } else {
                    var20 = tl.field_u[1];
                    var20.f(-(var20.field_I >> 1) + var5, var6 + -(var20.field_H >> 1), 256);
                    return;
                  }
                } else {
                  var17 = tl.field_u[2];
                  var17.f(var5 - (var17.field_I >> 1), var6 + -(var17.field_H >> 1), 256);
                  return;
                }
              } else {
                var16 = tl.field_u[0];
                var14 = var16;
                var9 = var16.field_K << 1;
                var10 = var16.field_C << 1;
                if (kl.field_v != null) {
                  if (var9 <= kl.field_v.field_I) {
                    if (var10 <= kl.field_v.field_H) {
                      tb.a(true, kl.field_v);
                      hk.b();
                      var16.a(112, 144, var16.field_K << 4, var16.field_C << 4, -((g) this).field_M << 10, 4096);
                      mk.a((byte) -5);
                      kl.field_v.f(var5 + -var16.field_K, -var16.field_C + var6, 256);
                      return;
                    } else {
                      kl.field_v = new ck(var9, var10);
                      tb.a(true, kl.field_v);
                      var16.a(112, 144, var16.field_K << 4, var16.field_C << 4, -((g) this).field_M << 10, 4096);
                      mk.a((byte) -5);
                      kl.field_v.f(var5 + -var16.field_K, -var16.field_C + var6, 256);
                      return;
                    }
                  } else {
                    kl.field_v = new ck(var9, var10);
                    tb.a(true, kl.field_v);
                    var16.a(112, 144, var16.field_K << 4, var16.field_C << 4, -((g) this).field_M << 10, 4096);
                    mk.a((byte) -5);
                    kl.field_v.f(var5 + -var16.field_K, -var16.field_C + var6, 256);
                    return;
                  }
                } else {
                  kl.field_v = new ck(var9, var10);
                  tb.a(true, kl.field_v);
                  var16.a(112, 144, var16.field_K << 4, var16.field_C << 4, -((g) this).field_M << 10, 4096);
                  mk.a((byte) -5);
                  kl.field_v.f(var5 + -var16.field_K, -var16.field_C + var6, 256);
                  return;
                }
              }
            } else {
              L0: {
                L1: {
                  var15 = tl.field_u[0];
                  var9 = var15.field_K << 1;
                  var10 = var15.field_C << 1;
                  if (kl.field_v == null) {
                    break L1;
                  } else {
                    if (var9 > kl.field_v.field_I) {
                      break L1;
                    } else {
                      if (var10 > kl.field_v.field_H) {
                        break L1;
                      } else {
                        tb.a(true, kl.field_v);
                        hk.b();
                        break L0;
                      }
                    }
                  }
                }
                kl.field_v = new ck(var9, var10);
                tb.a(true, kl.field_v);
                break L0;
              }
              var15.a(112, 144, var15.field_K << 4, var15.field_C << 4, -((g) this).field_M << 10, 4096);
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
            ((g) this).field_M = ((g) this).field_M + 1;
            super.a(param0, 89, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "g.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        wb stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        wb stackOut_13_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          if (null != hg.field_e) {
            L0: {
              var6 = (CharSequence) (Object) param1;
              var2 = kf.a(var6, (byte) 2);
              if (var2 != null) {
                break L0;
              } else {
                var2 = param1;
                break L0;
              }
            }
            var3 = (wb) (Object) hg.field_e.a(24710, (long)var2.hashCode());
            L1: while (true) {
              if (var3 != null) {
                L2: {
                  var7 = (CharSequence) (Object) var3.field_Ob;
                  var4 = kf.a(var7, (byte) 2);
                  if (var4 != null) {
                    break L2;
                  } else {
                    var4 = var3.field_Ob;
                    break L2;
                  }
                }
                if (var4.equals(var2)) {
                  stackOut_13_0 = (wb) var3;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                } else {
                  var3 = (wb) (Object) hg.field_e.d(-17713);
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2_ref;
            stackOut_17_1 = new StringBuilder().append("g.D(").append(-3805).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    final String c(byte param0) {
        if (((g) this).field_q) {
            return ((g) this).field_P.b((byte) 69);
        }
        if (param0 == 113) {
            return null;
        }
        return null;
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
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("g.EC(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void a(int param0) {
        field_N = null;
        field_R = null;
        field_O = null;
        field_K = null;
        if (param0 >= -91) {
            field_K = null;
        }
    }

    g(nb param0) {
        try {
            ((g) this).field_P = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "g.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_L = 2;
        field_K = "Suggested names: ";
    }
}
