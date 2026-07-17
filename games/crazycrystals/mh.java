/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends ik {
    static String field_m;
    static int[] field_l;
    static String field_j;
    static int field_h;
    private String field_i;
    int field_k;

    final void a(boolean param0, int param1, int param2) {
        il.a(((mh) this).field_c, param0, ((mh) this).field_d, ((mh) this).field_a, ((mh) this).field_b, false);
        int var4 = 0;
        if (!(param1 != 16777215)) {
            var4 = 1;
        }
        if (param1 == 16760896) {
            var4 = 2;
        }
        if (param2 != 1) {
            return;
        }
        gj.field_m.a(((mh) this).field_i, ((mh) this).field_k + ((mh) this).field_a, 17 + ((mh) this).field_d, var4, -1);
    }

    final static void a(byte param0, String param1, String param2) {
        try {
            if (param0 != 1) {
                mh.c(-13);
            }
            wk.a(param1, false, param2, false);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "mh.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void c(int param0) {
        if (param0 >= -53) {
            field_h = 63;
        }
        field_j = null;
        field_m = null;
        field_l = null;
    }

    final static short[] a(byte param0, md param1, int param2, short[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_18_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            var4_int = param1.d((byte) -114, param2);
            if (param0 == -2) {
              if (var4_int != 0) {
                L1: {
                  L2: {
                    if (param3 == null) {
                      break L2;
                    } else {
                      if (param3.length == var4_int) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  param3 = new short[var4_int];
                  break L1;
                }
                L3: {
                  var5 = param1.d((byte) -63, 4);
                  var6 = (short)param1.d((byte) -94, 16);
                  if (var5 <= 0) {
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param3[var7] = (short)var6;
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param3[var7] = (short)(var6 + param1.d((byte) -51, var5));
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackOut_18_0 = (short[]) param3;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (short[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("mh.C(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44).append(param2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_19_0;
    }

    mh(int param0, int param1, String param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        ((mh) this).field_k = 9;
        try {
          L0: {
            L1: {
              ((mh) this).field_i = param2;
              ((mh) this).field_a = param0 + -9;
              ((mh) this).field_d = param1 + -4;
              ((mh) this).field_b = go.field_l.a(param2) + 20;
              ((mh) this).field_c = 26;
              if (param3 != 1) {
                if (param3 != 2) {
                  break L1;
                } else {
                  ((mh) this).field_a = ((mh) this).field_a - (-10 + ((mh) this).field_b / 2);
                  break L1;
                }
              } else {
                ((mh) this).field_a = ((mh) this).field_a - (-20 + ((mh) this).field_b);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("mh.<init>(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
    }

    mh(int param0, int param1, int param2, String param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        ((mh) this).field_k = 9;
        try {
          L0: {
            L1: {
              ((mh) this).field_c = 26;
              ((mh) this).field_i = param3;
              ((mh) this).field_d = -4 + param1;
              ((mh) this).field_a = param0 - 9;
              ((mh) this).field_b = param2 - -20;
              if (param4 != 1) {
                if (param4 != 2) {
                  break L1;
                } else {
                  ((mh) this).field_k = ((mh) this).field_k + (-go.field_l.a(param3) + param2) / 2;
                  break L1;
                }
              } else {
                ((mh) this).field_k = ((mh) this).field_k + (param2 + -go.field_l.a(param3));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("mh.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != -20) {
            Object var4 = null;
            short[] discarded$0 = mh.a((byte) -79, (md) null, 13, (short[]) null);
        }
        oa.field_b = param0;
        rn.field_n = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Fullscreen mode";
        field_m = "Start Game";
    }
}
