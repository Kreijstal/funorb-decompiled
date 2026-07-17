/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends qc {
    private int field_j;
    private int field_k;

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        aj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        aj stackOut_2_0 = null;
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
              ((gd) this).field_k = ((gd) this).field_k + param3;
              if (!param0) {
                break L1;
              } else {
                ((gd) this).field_k = -18;
                break L1;
              }
            }
            ((gd) this).field_j = ((gd) this).field_j + 1;
            ph.a(1, (byte) 107, param1, param4);
            stackOut_2_0 = new aj(bm.field_g);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("gd.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return (f) (Object) stackIn_3_0;
    }

    final int a(byte param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -53) {
          L0: {
            ((gd) this).field_k = -26;
            if (param1) {
              stackOut_7_0 = 24;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = super.a((byte) -105, param1);
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param1) {
              stackOut_3_0 = 24;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = super.a((byte) -105, param1);
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        pd.field_g[param1] = pd.field_g[param1] + param2;
        if (!param0) {
            Object var6 = null;
            f discarded$0 = ((gd) this).a(false, -91, -128, -80, (ta) null);
        }
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
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
              if (param0 == 127) {
                break L1;
              } else {
                var3 = null;
                String discarded$2 = gd.a((byte) 51, (CharSequence) null);
                break L1;
              }
            }
            L2: {
              var2 = ni.a(37, ck.a((byte) 95, param1));
              if (var2 == null) {
                var2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_5_0 = (String) var2;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("gd.E(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final static String a(byte param0, byte[] param1, int param2, int param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        Object stackIn_3_0 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_19_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            var13 = new char[param3];
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var4 = var10;
            var5 = 0;
            if (param0 >= 3) {
              var6 = 0;
              L1: while (true) {
                if (param3 <= var6) {
                  stackOut_19_0 = new String(var13, 0, var5);
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  L2: {
                    var7 = 255 & param1[param2 + var6];
                    if (var7 != 0) {
                      L3: {
                        if (128 > var7) {
                          break L3;
                        } else {
                          if (var7 >= 160) {
                            break L3;
                          } else {
                            L4: {
                              var8 = tg.field_d[var7 - 128];
                              if (0 == var8) {
                                var8 = 63;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var7 = var8;
                            break L3;
                          }
                        }
                      }
                      int incrementValue$21 = var5;
                      var5++;
                      var4[incrementValue$21] = (char)var7;
                      var6++;
                      break L2;
                    } else {
                      var6++;
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4_ref;
            stackOut_21_1 = new StringBuilder().append("gd.D(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_20_0;
    }

    final void a(byte param0) {
        tb.field_d.a(jm.field_k, (int)(Math.random() * 11.0) + 95, 12 * (gi.field_m * ((gd) this).field_j), ((gd) this).field_k / ((gd) this).field_j);
        int var2 = 14 / ((param0 - 29) / 42);
        ((gd) this).field_j = 0;
        ((gd) this).field_k = 0;
    }

    final static java.awt.Canvas c(int param0) {
        return ph.field_E == null ? jd.field_D : (java.awt.Canvas) (Object) ph.field_E;
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
            return null;
        }
        return (pb) (Object) new uk();
    }

    gd() {
        ((gd) this).field_k = 0;
        ((gd) this).field_j = 0;
    }

    static {
    }
}
