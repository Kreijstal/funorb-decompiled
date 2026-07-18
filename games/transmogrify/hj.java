/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends oa {
    private ug field_p;
    private int field_n;
    static String field_o;

    final static void a(java.awt.Component param0, int param1) {
        try {
            if (param1 != -2) {
                hj.m(75);
            }
            param0.setFocusTraversalKeysEnabled(false);
            param0.addKeyListener((java.awt.event.KeyListener) (Object) el.field_n);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) el.field_n);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "hj.AB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= param1) {
                L2: {
                  if (param3 == 18570) {
                    break L2;
                  } else {
                    field_o = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                int fieldTemp$2 = ((hj) this).field_h;
                ((hj) this).field_h = ((hj) this).field_h + 1;
                param0[param2 + var5_int] = (byte)(((hj) this).field_g[fieldTemp$2] + -((hj) this).field_p.a(-88));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("hj.QA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    hj(byte[] param0) {
        super(param0);
    }

    hj(int param0) {
        super(param0);
    }

    final int l(int param0) {
        if (param0 != -12135) {
            return 41;
        }
        int fieldTemp$0 = ((hj) this).field_h;
        ((hj) this).field_h = ((hj) this).field_h + 1;
        return 255 & ((hj) this).field_g[fieldTemp$0] + -((hj) this).field_p.a(-108);
    }

    final static String a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1 != null) {
            var2_int = 0;
            var3 = param1.length();
            L0: while (true) {
              L1: {
                if (var3 <= var2_int) {
                  break L1;
                } else {
                  if (!uf.a(param1.charAt(var2_int), (byte) -108)) {
                    break L1;
                  } else {
                    var2_int++;
                    continue L0;
                  }
                }
              }
              L2: while (true) {
                L3: {
                  if (var2_int >= var3) {
                    break L3;
                  } else {
                    if (!uf.a(param1.charAt(var3 - 1), (byte) -56)) {
                      break L3;
                    } else {
                      var3--;
                      continue L2;
                    }
                  }
                }
                var4 = var3 - var2_int;
                if (var4 >= 1) {
                  if (var4 <= 12) {
                    var5 = new StringBuilder(var4);
                    var6 = var2_int;
                    L4: while (true) {
                      if (var3 <= var6) {
                        L5: {
                          if (param0 <= -124) {
                            break L5;
                          } else {
                            var10 = null;
                            ii[] discarded$2 = hj.a((ci) null, (byte) 75, -121, -92);
                            break L5;
                          }
                        }
                        if (var5.length() != 0) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      } else {
                        L6: {
                          var7 = param1.charAt(var6);
                          if (ci.a((char) var7, 0)) {
                            var8 = jk.a((char) var7, false);
                            if (0 == var8) {
                              break L6;
                            } else {
                              StringBuilder discarded$3 = var5.append((char) var8);
                              break L6;
                            }
                          } else {
                            break L6;
                          }
                        }
                        var6++;
                        continue L4;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var2;
            stackOut_30_1 = new StringBuilder().append("hj.WA(").append(param0).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
    }

    final static ii[] a(ci param0, byte param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        ii[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ii[] stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -62) {
                break L1;
              } else {
                hj.m(-31);
                break L1;
              }
            }
            if (rl.a(param2, 0, param3, param0)) {
              stackOut_5_0 = pd.a((byte) 113);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (ii[]) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("hj.SA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final void a(byte param0, int[] param1) {
        try {
            int var3_int = 113 % ((-12 - param0) / 36);
            ((hj) this).field_p = new ug(param1);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "hj.TA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$0 = ((hj) this).field_h;
        ((hj) this).field_h = ((hj) this).field_h + 1;
        ((hj) this).field_g[fieldTemp$0] = (byte)(((hj) this).field_p.a(-50) + param1);
        if (param0) {
            field_o = null;
        }
    }

    final void n(int param0) {
        if (param0 != 0) {
            return;
        }
        ((hj) this).field_h = (7 + ((hj) this).field_n) / 8;
    }

    final int k(int param0, int param1) {
        int var6 = Transmogrify.field_A ? 1 : 0;
        int var3 = ((hj) this).field_n >> 3;
        int var4 = -(((hj) this).field_n & 7) + 8;
        ((hj) this).field_n = ((hj) this).field_n + param0;
        int var5 = 0;
        while (param0 > var4) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((((hj) this).field_g[incrementValue$0] & kb.field_m[var4]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 != var4) {
            var5 = var5 + (((hj) this).field_g[var3] >> -param0 + var4 & kb.field_m[param0]);
        } else {
            var5 = var5 + (kb.field_m[var4] & ((hj) this).field_g[var3]);
        }
        if (param1 != 1522829539) {
            ((hj) this).h((byte) -80);
        }
        return var5;
    }

    public static void m(int param0) {
        field_o = null;
        if (param0 != 255) {
            field_o = null;
        }
    }

    final void h(byte param0) {
        ((hj) this).field_n = 8 * ((hj) this).field_h;
        if (param0 < 53) {
            ((hj) this).field_n = 54;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
