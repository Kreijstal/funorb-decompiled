/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static int field_g;
    ck field_e;
    static int field_d;
    static String field_b;
    static String field_f;
    static String field_h;
    static String field_a;
    private ck field_i;
    static int[] field_c;

    public static void c() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_f = null;
            field_a = null;
            field_h = null;
            field_c = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "ul.L(" + -29 + 41);
        }
    }

    final static mn d(int param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        RuntimeException var1_ref = null;
        mn var2 = null;
        mn stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        Throwable decompiledCaughtException = null;
        mn stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        try {
          var1_int = param0;
          L0: while (true) {
            var2 = cd.field_e.a((byte) -13, var1_int);
            if (var2.field_B) {
              stackOut_4_0 = (mn) var2;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var1_int++;
              continue L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1_ref, "ul.E(" + param0 + 41);
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          stackOut_7_0 = null;
          stackIn_8_0 = stackOut_7_0;
          return (mn) (Object) stackIn_8_0;
        }
    }

    final void g(int param0) {
        ck var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: while (true) {
              var2 = ((ul) this).field_e.field_k;
              if (((ul) this).field_e != var2) {
                var2.b(4);
                continue L1;
              } else {
                L2: {
                  ((ul) this).field_i = null;
                  if (param0 == 6) {
                    break L2;
                  } else {
                    field_c = null;
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2_ref, "ul.Q(" + param0 + 41);
        }
    }

    final void a(int param0, ck param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1.field_i == null) {
                break L1;
              } else {
                param1.b(4);
                break L1;
              }
            }
            param1.field_k = ((ul) this).field_e;
            if (param0 == 3) {
              param1.field_i = ((ul) this).field_e.field_i;
              param1.field_i.field_k = param1;
              param1.field_k.field_i = param1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("ul.W(").append(param0).append(44);
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final static nk a(int param0, byte param1) {
        nk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        nk stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        nk stackOut_6_0 = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var2 = (nk) (Object) ao.field_H.e(13058);
              if (param1 == 67) {
                break L1;
              } else {
                boolean discarded$2 = ul.e((byte) 116);
                break L1;
              }
            }
            L2: while (true) {
              if (var2 == null) {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (var2.field_N != param0) {
                  var2 = (nk) (Object) ao.field_H.a((byte) -87);
                  continue L2;
                } else {
                  stackOut_6_0 = (nk) var2;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2_ref, "ul.U(" + param0 + 44 + param1 + 41);
        }
        return (nk) (Object) stackIn_10_0;
    }

    final static gk d() {
        gk var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        gk stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        gk stackOut_0_0 = null;
        try {
          L0: {
            var1 = new gk(un.field_n, eb.field_n, rl.field_a[0], oa.field_M[0], le.field_L[0], ca.field_r[0], dl.field_L[0], ba.field_d);
            var2 = 0;
            int discarded$1 = 9324;
            uh.a();
            stackOut_0_0 = (gk) var1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1_ref, "ul.M(" + 51 + 41);
        }
        return stackIn_1_0;
    }

    final int b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ck var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = 0;
            if (param0 < -127) {
              var3 = ((ul) this).field_e.field_k;
              L1: while (true) {
                if (var3 == ((ul) this).field_e) {
                  stackOut_7_0 = var2_int;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  var2_int++;
                  var3 = var3.field_k;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 32;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ul.I(" + param0 + 41);
        }
        return stackIn_8_0;
    }

    final ck a(byte param0) {
        ck var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_5_0 = null;
        ck stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        ck stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (param0 < -5) {
                break L1;
              } else {
                mn discarded$2 = ul.d(-99);
                break L1;
              }
            }
            var2 = ((ul) this).field_i;
            if (var2 != ((ul) this).field_e) {
              ((ul) this).field_i = var2.field_k;
              stackOut_6_0 = (ck) var2;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              ((ul) this).field_i = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (ck) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2_ref, "ul.S(" + param0 + 41);
        }
        return stackIn_7_0;
    }

    final ck c(int param0) {
        ck var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ck stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        ck stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var2 = ((ul) this).field_e.field_i;
            if (var2 != ((ul) this).field_e) {
              if (param0 == -6533) {
                var2.b(param0 ^ -6529);
                stackOut_6_0 = (ck) var2;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (ck) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ck) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2_ref, "ul.B(" + param0 + 41);
        }
        return stackIn_7_0;
    }

    final ck e(int param0) {
        ck var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        ck stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        ck stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 13058) {
              var2 = ((ul) this).field_e.field_k;
              if (var2 == ((ul) this).field_e) {
                ((ul) this).field_i = null;
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (ck) (Object) stackIn_7_0;
              } else {
                ((ul) this).field_i = var2.field_k;
                stackOut_8_0 = (ck) var2;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ck) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2_ref, "ul.N(" + param0 + 41);
        }
        return stackIn_9_0;
    }

    private final void a(ul param0, int param1, ck param2) {
        ck var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var4 = ((ul) this).field_e.field_i;
            ((ul) this).field_e.field_i = param2.field_i;
            param2.field_i.field_k = ((ul) this).field_e;
            L1: {
              if (param2 == ((ul) this).field_e) {
                break L1;
              } else {
                param2.field_i = param0.field_e.field_i;
                param2.field_i.field_k = param2;
                var4.field_k = param0.field_e;
                param0.field_e.field_i = var4;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4_ref;
            stackOut_7_1 = new StringBuilder().append("ul.V(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(-16775).append(44);
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final ck a(boolean param0) {
        ck var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        ck stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        ck stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            var2 = ((ul) this).field_e.field_k;
            if (var2 == ((ul) this).field_e) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (ck) (Object) stackIn_4_0;
            } else {
              if (param0) {
                var2.b(4);
                stackOut_8_0 = (ck) var2;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (ck) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2_ref, "ul.P(" + param0 + 41);
        }
        return stackIn_9_0;
    }

    final void a(ck param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (null != param0.field_i) {
                param0.b(4);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param0.field_k = ((ul) this).field_e.field_k;
              param0.field_i = ((ul) this).field_e;
              if (param1 == -21459) {
                break L2;
              } else {
                boolean discarded$2 = ul.e((byte) 47);
                break L2;
              }
            }
            param0.field_i.field_k = param0;
            param0.field_k.field_i = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ul.C(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    final static boolean e(byte param0) {
        long var1_long = 0L;
        RuntimeException var1 = null;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_13_0 = 0;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            var1_long = mm.a(77);
            var3 = -sl.field_m + var1_long;
            if (var3 > 30000L) {
              sb.field_Z = 0;
              sl.field_m = var1_long;
              stackOut_16_0 = 1;
              stackIn_17_0 = stackOut_16_0;
              return stackIn_17_0 != 0;
            } else {
              L1: {
                var5 = 3000;
                if (sb.field_Z < 7) {
                  if (sb.field_Z < 5) {
                    if (sb.field_Z < 3) {
                      break L1;
                    } else {
                      var5 = 6000;
                      break L1;
                    }
                  } else {
                    var5 = 9000;
                    break L1;
                  }
                } else {
                  var5 = 12000;
                  break L1;
                }
              }
              if (~var3 >= ~(long)var5) {
                L2: {
                  if (param0 == 17) {
                    break L2;
                  } else {
                    boolean discarded$2 = ul.a(72, 96, 29, -125, false, -71, -107);
                    break L2;
                  }
                }
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                sl.field_m = var1_long;
                sb.field_Z = sb.field_Z + 1;
                stackOut_13_0 = 1;
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "ul.F(" + param0 + 41);
        }
        return stackIn_22_0 != 0;
    }

    final boolean f(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 7) {
                break L1;
              } else {
                field_d = 34;
                break L1;
              }
            }
            L2: {
              if (((ul) this).field_e.field_k != ((ul) this).field_e) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ul.T(" + param0 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final static int a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = -66 / ((param0 - 30) / 32);
            var3 = 0;
            L1: while (true) {
              if (var3 >= n.field_z.length) {
                stackOut_11_0 = -1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                if (param1 == n.field_z[var3]) {
                  stackOut_8_0 = var3;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ul.K(" + param0 + 44 + param1 + 41);
        }
        return stackIn_12_0;
    }

    final static void a(boolean param0, byte param1, boolean param2, int[] param3, pe param4, boolean param5, int[] param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int stackIn_58_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_56_0 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var31 = SteelSentinels.field_G;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param6[3] >> 2;
            var22 = param6[4] >> 2;
            var23 = param6[5] >> 2;
            var24 = param6[6] >> 2;
            var25 = param6[7] >> 2;
            var26 = param6[8] >> 2;
            var27 = param6[9] >> 2;
            var28 = param6[10] >> 2;
            var29 = param6[11] >> 2;
            var12 = var23 * param3[5] + param3[3] * var21 - -(param3[4] * var22) >> 14;
            var13 = var26 * param3[5] + var24 * param3[3] - -(var25 * param3[4]) >> 14;
            var14 = var29 * param3[5] + var27 * param3[3] + var28 * param3[4] >> 14;
            var16 = param3[8] * var26 + (var24 * param3[6] + var25 * param3[7]) >> 14;
            var17 = var29 * param3[8] + var28 * param3[7] + param3[6] * var27 >> 14;
            var18 = var21 * param3[9] + (param3[10] * var22 + var23 * param3[11]) >> 14;
            var19 = param3[10] * var25 + var24 * param3[9] + var26 * param3[11] >> 14;
            var15 = var22 * param3[7] + (param3[6] * var21 + param3[8] * var23) >> 14;
            var20 = param3[10] * var28 + param3[9] * var27 + param3[11] * var29 >> 14;
            var21 = param3[0] - param6[0];
            var22 = param3[1] - param6[1];
            var23 = -param6[2] + param3[2];
            var9 = var23 * param6[5] + param6[4] * var22 + var21 * param6[3] >> 16 + -cj.field_j;
            var11 = var21 * param6[9] - (-(param6[10] * var22) + -(param6[11] * var23)) >> 16;
            var10 = var21 * param6[6] - (-(param6[7] * var22) + -(param6[8] * var23)) >> 16 + -cj.field_j;
            var21 = lf.field_d;
            var22 = -7;
            var23 = lf.field_b;
            var24 = 0;
            L1: while (true) {
              if (var24 >= param4.field_L) {
                L2: {
                  if (param4.field_r == null) {
                    break L2;
                  } else {
                    if (param4.field_l == null) {
                      break L2;
                    } else {
                      if (null == param4.field_t) {
                        break L2;
                      } else {
                        if (null == param4.field_Z) {
                          break L2;
                        } else {
                          if (param4.field_S == null) {
                            break L2;
                          } else {
                            if (null == param4.field_Q) {
                              break L2;
                            } else {
                              if (param4.field_a == null) {
                                break L2;
                              } else {
                                if (param4.field_X == null) {
                                  break L2;
                                } else {
                                  if (param4.field_B == null) {
                                    break L2;
                                  } else {
                                    var24 = 0;
                                    L3: while (true) {
                                      if (~param4.field_w >= ~var24) {
                                        break L2;
                                      } else {
                                        var25 = param4.field_r[var24];
                                        var26 = param4.field_l[var24];
                                        var27 = param4.field_t[var24];
                                        uf.field_b[var24] = (var12 * var25 - -(var15 * var26) + var18 * var27 >> 16) + var9;
                                        rn.field_w[var24] = (var16 * var26 + (var13 * var25 + var19 * var27) >> 16) + var10;
                                        fm.field_l[var24] = var11 - -(var14 * var25 - -(var17 * var26) + var27 * var20 >> 16);
                                        var25 = param4.field_Z[var24];
                                        var26 = param4.field_S[var24];
                                        var27 = param4.field_Q[var24];
                                        re.field_bb[var24] = var9 + (var27 * var18 + (var12 * var25 + var15 * var26) >> 16);
                                        an.field_d[var24] = (var25 * var13 - (-(var26 * var16) + -(var27 * var19)) >> 16) + var10;
                                        kh.field_u[var24] = var11 + (var25 * var14 - -(var17 * var26) - -(var27 * var20) >> 16);
                                        var25 = param4.field_a[var24];
                                        var26 = param4.field_X[var24];
                                        var27 = param4.field_B[var24];
                                        rd.field_a[var24] = (var18 * var27 + var12 * var25 + var26 * var15 >> 16) + var9;
                                        ci.field_c[var24] = var10 + (var27 * var19 + (var13 * var25 - -(var16 * var26)) >> 16);
                                        fm.field_e[var24] = var11 + (var14 * var25 - (-(var26 * var17) + -(var27 * var20)) >> 16);
                                        var24++;
                                        continue L3;
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
                  }
                }
                var9 = param3[3];
                var10 = param3[4];
                var11 = param3[5];
                var12 = param3[6];
                var13 = param3[7];
                var14 = param3[8];
                var15 = param3[9];
                var16 = param3[10];
                var17 = param3[11];
                var18 = 0;
                L4: while (true) {
                  L5: {
                    if (var18 >= param4.field_u) {
                      break L5;
                    } else {
                      stackOut_56_0 = ~tc.field_A.length;
                      stackIn_58_0 = stackOut_56_0;
                      if (stackIn_58_0 >= ~var18) {
                        break L5;
                      } else {
                        var19 = param4.field_g[var18];
                        var20 = param4.field_H[var18];
                        var21 = param4.field_F[var18];
                        tc.field_A[var18] = var15 * var21 + var20 * var12 + var19 * var9 >> 16;
                        hm.field_c[var18] = var10 * var19 + var20 * var13 + var16 * var21 >> 16;
                        pi.field_e[var18] = var14 * var20 + (var19 * var11 - -(var17 * var21)) >> 16;
                        var18++;
                        continue L4;
                      }
                    }
                  }
                  int discarded$2 = 2147483647;
                  int discarded$3 = 0;
                  wi.a(var8, param4, var7_int);
                  break L0;
                }
              } else {
                L6: {
                  var25 = param4.field_z[var24];
                  var26 = param4.field_m[var24];
                  var27 = param4.field_C[var24];
                  var28 = (var18 * var27 + var26 * var15 + var25 * var12 >> -cj.field_j + 16) + var9;
                  var29 = var10 - -(var27 * var19 + var26 * var16 + var25 * var13 >> 16 + -cj.field_j);
                  var30 = (var26 * var17 + (var25 * var14 - -(var27 * var20)) >> 16) + var11;
                  if (50 > var30) {
                    km.field_h[var24] = -2147483648;
                    break L6;
                  } else {
                    L7: {
                      eh.field_d[var24] = var21 - -(var28 / var30);
                      n.field_p[var24] = var23 + var29 / var30;
                      if (~var30 > ~var7_int) {
                        var7_int = var30;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (var8 >= var30) {
                        break L8;
                      } else {
                        var8 = var30;
                        break L8;
                      }
                    }
                    km.field_h[var24] = var30;
                    break L6;
                  }
                }
                var24++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) var7;
            stackOut_64_1 = new StringBuilder().append("ul.D(").append(1).append(44).append(-128).append(44).append(0).append(44);
            stackIn_67_0 = stackOut_64_0;
            stackIn_67_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param3 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L9;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_68_0 = stackOut_65_0;
              stackIn_68_1 = stackOut_65_1;
              stackIn_68_2 = stackOut_65_2;
              break L9;
            }
          }
          L10: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(44);
            stackIn_71_0 = stackOut_68_0;
            stackIn_71_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param4 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L10;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_72_0 = stackOut_69_0;
              stackIn_72_1 = stackOut_69_1;
              stackIn_72_2 = stackOut_69_2;
              break L10;
            }
          }
          L11: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(44).append(0).append(44);
            stackIn_75_0 = stackOut_72_0;
            stackIn_75_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param6 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L11;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_76_0 = stackOut_73_0;
              stackIn_76_1 = stackOut_73_1;
              stackIn_76_2 = stackOut_73_2;
              break L11;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + 41);
        }
    }

    final static wk[] a(byte param0, int param1, int param2) {
        RuntimeException var3 = null;
        wk[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        wk[] stackOut_3_0 = null;
        try {
          L0: {
            stackOut_3_0 = bm.b(param1, -2, 1, param2);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ul.A(" + 0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    final static boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        RuntimeException var7 = null;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == 11) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            L2: {
              if (jc.a(2)) {
                L3: {
                  t.a((byte) 125, param5, param4, param6);
                  if (null == an.field_i) {
                    break L3;
                  } else {
                    if (!an.field_i.a(param4, param0 ^ 125, param3, param6, param1)) {
                      break L3;
                    } else {
                      int discarded$2 = 0;
                      rh.a();
                      param4 = false;
                      break L3;
                    }
                  }
                }
                int discarded$3 = -49;
                bh.a(param6, param4);
                cc.a(param2, (byte) 119, param4);
                param4 = false;
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_12_0 = param4;
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var7, "ul.H(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_13_0;
    }

    final ck a(byte param0, ck param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        ck stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param0 >= 124) {
              L1: {
                if (param1 == null) {
                  var3 = ((ul) this).field_e.field_k;
                  break L1;
                } else {
                  var3 = param1;
                  break L1;
                }
              }
              if (((ul) this).field_e != var3) {
                ((ul) this).field_i = var3.field_k;
                stackOut_9_0 = (ck) var3;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                ((ul) this).field_i = null;
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (ck) (Object) stackIn_8_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ck) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("ul.J(").append(param0).append(44);
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_10_0;
    }

    final void a(int param0, ul param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(param1, -16775, ((ul) this).field_e.field_k);
              if (param0 >= 8) {
                break L1;
              } else {
                field_d = 72;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ul.O(").append(param0).append(44);
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final ck b(int param0) {
        ck var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_7_0 = null;
        ck stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        ck stackOut_8_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1063677678) {
                break L1;
              } else {
                ((ul) this).field_i = null;
                break L1;
              }
            }
            var2 = ((ul) this).field_e.field_i;
            if (var2 == ((ul) this).field_e) {
              ((ul) this).field_i = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (ck) (Object) stackIn_7_0;
            } else {
              ((ul) this).field_i = var2.field_i;
              stackOut_8_0 = (ck) var2;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2_ref, "ul.R(" + param0 + 41);
        }
        return stackIn_9_0;
    }

    public ul() {
        ((ul) this).field_e = new ck();
        try {
            ((ul) this).field_e.field_i = ((ul) this).field_e;
            ((ul) this).field_e.field_k = ((ul) this).field_e;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ul.<init>()");
        }
    }

    final ck a(int param0) {
        ck var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        ck stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        ck stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == -2137) {
              var2 = ((ul) this).field_i;
              if (((ul) this).field_e == var2) {
                ((ul) this).field_i = null;
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (ck) (Object) stackIn_7_0;
              } else {
                ((ul) this).field_i = var2.field_i;
                stackOut_8_0 = (ck) var2;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ck) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2_ref, "ul.G(" + param0 + 41);
        }
        return stackIn_9_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "unlimited";
        field_f = "<%1> was destroyed by <%0>";
        field_a = "Quit";
        field_c = new int[]{2, 20, 21, 6, 37, 45, 5, 9};
        field_h = "TRAINING MISSION <%0> <%1>";
    }
}
