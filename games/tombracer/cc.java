/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends vg {
    int field_i;
    int field_g;
    static String field_l;
    private int field_f;
    private int field_h;
    int field_k;
    int field_j;

    final void a(int param0, int param1, int param2) {
        int discarded$0 = 0;
        if (!(this.a())) {
            return;
        }
        int var4 = param1 - -(((cc) this).b(true) ? ((cc) this).field_j : jw.field_z[((cc) this).field_g]);
        int var5 = (!((cc) this).b(true) ? hq.field_b[((cc) this).field_g] : ((cc) this).field_k) + param2;
        int discarded$1 = 35;
        this.a(((cc) this).field_h, param2 + hq.field_b[((cc) this).field_i], var4, var5, jw.field_z[((cc) this).field_i] + param1);
        if (param0 != 99) {
            field_l = null;
        }
        if (!(!((cc) this).b(true))) {
            int discarded$2 = 35;
            this.a(((cc) this).field_f, var5, param1 - -jw.field_z[((cc) this).field_g], hq.field_b[((cc) this).field_g] + param2, var4);
            uda.field_r.a(((cc) this).field_j + param1 + uda.field_r.a(), param2 + (((cc) this).field_k + uda.field_r.c()));
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          L1: {
            var13 = TombRacer.field_G ? 1 : 0;
            var7 = param2 + -param4 << 16;
            var8 = -param1 + param3 << 16;
            var9 = var7 / (param0 + 1);
            var10 = var8 / (1 + param0);
            var11 = 1;
            if (!bma.d(107, ((cc) this).field_i)) {
              break L1;
            } else {
              if (bma.d(-121, ((cc) this).field_g)) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var11 = 0;
          break L0;
        }
        var12 = 0;
        L2: while (true) {
          if (var12 >= param0) {
            return;
          } else {
            uda.field_r.a((var9 * (1 + var12) >> 16) + (param4 - -uda.field_r.a()), param1 + (var10 * (var12 - -1) >> 16) + uda.field_r.c(), var11, -1695485712, 1);
            var12++;
            continue L2;
          }
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
            return false;
        }
        return -1 != ((cc) this).field_j ? true : false;
    }

    final boolean a(pfa param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_10_0 = null;
        int[] stackIn_11_0 = null;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_13_0 = null;
        int[] stackIn_14_0 = null;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int[] stackOut_9_0 = null;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int[] stackOut_12_0 = null;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        try {
          L0: {
            if (!this.a((byte) -95, param0)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                var4_int = param0.field_j >> 16;
                var5 = param0.field_e >> 16;
                if (((cc) this).b(true)) {
                  var7 = ((cc) this).field_k;
                  var6 = ((cc) this).field_j;
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (~var4_int != ~jw.field_z[((cc) this).field_i]) {
                        break L3;
                      } else {
                        if (~hq.field_b[((cc) this).field_i] != ~var5) {
                          break L3;
                        } else {
                          stackOut_7_0 = 1;
                          stackIn_9_0 = stackOut_7_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L2;
                  }
                  L4: {
                    var8 = stackIn_9_0;
                    stackOut_9_0 = jw.field_z;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var8 == 0) {
                      stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                      stackOut_11_1 = ((cc) this).field_i;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L4;
                    } else {
                      stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                      stackOut_10_1 = ((cc) this).field_g;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L4;
                    }
                  }
                  L5: {
                    var6 = stackIn_12_0[stackIn_12_1];
                    stackOut_12_0 = hq.field_b;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (var8 != 0) {
                      stackOut_14_0 = (int[]) (Object) stackIn_14_0;
                      stackOut_14_1 = ((cc) this).field_g;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L5;
                    } else {
                      stackOut_13_0 = (int[]) (Object) stackIn_13_0;
                      stackOut_13_1 = ((cc) this).field_i;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L5;
                    }
                  }
                  var7 = stackIn_15_0[stackIn_15_1];
                  break L1;
                }
              }
              var8 = var6 + -var4_int;
              var9 = -var5 + var7;
              if (param2 == 116) {
                if (~(var8 * var8) < ~(var9 * var9)) {
                  L6: {
                    L7: {
                      L8: {
                        L9: {
                          if (kda.field_hd == param1) {
                            break L9;
                          } else {
                            if (param1 != 96) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (var8 < 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                      L10: {
                        if (~param1 == ~mf.field_a) {
                          break L10;
                        } else {
                          if (param1 != 97) {
                            stackOut_45_0 = 0;
                            stackIn_46_0 = stackOut_45_0;
                            return stackIn_46_0 != 0;
                          } else {
                            break L10;
                          }
                        }
                      }
                      if (var8 > 0) {
                        break L7;
                      } else {
                        stackOut_42_0 = 0;
                        stackIn_44_0 = stackOut_42_0;
                        break L6;
                      }
                    }
                    stackOut_43_0 = 1;
                    stackIn_44_0 = stackOut_43_0;
                    break L6;
                  }
                  return stackIn_44_0 != 0;
                } else {
                  L11: {
                    L12: {
                      L13: {
                        if (mi.field_k == param1) {
                          break L13;
                        } else {
                          if (param1 != 98) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      if (0 > var9) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                    L14: {
                      if (~fp.field_a == ~param1) {
                        break L14;
                      } else {
                        if (99 != param1) {
                          stackOut_47_0 = 0;
                          stackIn_48_0 = stackOut_47_0;
                          break L0;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (var9 > 0) {
                      break L11;
                    } else {
                      return false;
                    }
                  }
                  stackOut_31_0 = 1;
                  stackIn_32_0 = stackOut_31_0;
                  return stackIn_32_0 != 0;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var4;
            stackOut_49_1 = new StringBuilder().append("cc.C(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L15;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L15;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_48_0 != 0;
    }

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            try {
                aia.field_j = param2;
                try {
                    var3 = param1.getParameter("cookieprefix");
                    if (param0 <= 1) {
                        Object var6 = null;
                        cc.a(-59, (java.applet.Applet) null, (String) null);
                    }
                    var4 = param1.getParameter("cookiehost");
                    var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                    if (!(0 != param2.length())) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    lb.a(param1, 19467, "document.cookie=\"" + var5 + "\"");
                } catch (Throwable throwable) {
                }
                v.a((byte) 64, param1);
            } catch (RuntimeException runtimeException) {
                throw tba.a((Throwable) (Object) runtimeException, "cc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            cc.a(62);
        }
        field_l = null;
    }

    private final boolean a(byte param0, pfa param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var3_int = param1.field_j >> 16;
                  var4 = param1.field_e >> 16;
                  if (var3_int != jw.field_z[((cc) this).field_i]) {
                    break L3;
                  } else {
                    if (hq.field_b[((cc) this).field_i] == var4) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (jw.field_z[((cc) this).field_g] != var3_int) {
                    break L4;
                  } else {
                    if (var4 != hq.field_b[((cc) this).field_g]) {
                      break L4;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("cc.G(").append(-95).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final boolean a() {
        return mca.a((byte) 6, ((cc) this).field_i) && mca.a((byte) 6, ((cc) this).field_g);
    }

    cc(int param0, int param1, int param2) {
        this(param0, param1, -1, -1, param2, 0);
    }

    final static nl a(byte param0, java.applet.Applet param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        nl[] var4 = null;
        int var5 = 0;
        nl var6 = null;
        int var7 = 0;
        nl stackIn_4_0 = null;
        nl stackIn_9_0 = null;
        nl stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        nl stackOut_3_0 = null;
        nl stackOut_11_0 = null;
        nl stackOut_8_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = -61;
            int discarded$2 = 86;
            var3 = og.a(param1, "jagex-last-login-method");
            if (var3 == null) {
              stackOut_3_0 = npa.field_f;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var4 = aga.a(-1025);
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4.length) {
                  stackOut_11_0 = npa.field_f;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  var6 = var4[var5];
                  if (!var6.a(var3, 5)) {
                    var5++;
                    continue L1;
                  } else {
                    stackOut_8_0 = (nl) var6;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("cc.F(").append(122).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    cc(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((cc) this).field_i = param0;
        ((cc) this).field_j = param2;
        ((cc) this).field_f = param5;
        ((cc) this).field_h = param4;
        ((cc) this).field_g = param1;
        ((cc) this).field_k = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Finish Time:";
    }
}
