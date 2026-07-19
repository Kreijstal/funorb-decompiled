/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends bh {
    int field_v;
    int[] field_t;
    static String field_q;
    int field_p;
    static boolean field_n;
    static ck field_r;
    int field_u;
    int field_s;
    int field_o;
    int field_w;

    final void a(byte param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7) {
        String discarded$0 = null;
        try {
            this.field_s = param1;
            if (param0 != 37) {
                CharSequence var10 = (CharSequence) null;
                discarded$0 = wc.a(false, (CharSequence) null, -40);
            }
            this.field_p = param5;
            this.field_t = param2;
            this.field_u = param7;
            this.field_w = param3;
            this.field_v = param6;
            this.field_o = param4;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "wc.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 != 2) {
            wc.a(64, -36, -122);
            field_r = null;
            return;
        }
        field_r = null;
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_10_0 = null;
        Object stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3 = rb.a(param0, (byte) 19, param1);
            if (var3 != null) {
              stackOut_3_0 = (String) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = param2;
              L1: while (true) {
                if (param1.length() > var4) {
                  if (!ci.a(param1.charAt(var4), (byte) 90)) {
                    stackOut_10_0 = jk.field_g;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      stackOut_13_0 = null;
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("wc.A(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return (String) ((Object) stackIn_14_0);
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 > param1 - -5) {
              var3_int = param1;
              var4 = gn.field_e[var3_int];
              var5 = gn.field_e[var3_int + 1];
              var6 = gn.field_e[2 + var3_int];
              var7 = gn.field_e[var3_int - -3];
              var8 = gn.field_e[4 + var3_int];
              var9 = param1 + 5;
              L1: while (true) {
                L2: {
                  if (var9 >= param0) {
                    gn.field_e[var3_int] = var4;
                    gn.field_e[var3_int - -1] = var5;
                    gn.field_e[var3_int + 2] = var6;
                    gn.field_e[var3_int - -3] = var7;
                    gn.field_e[4 + var3_int] = var8;
                    wc.a(var3_int, param1, param2);
                    stackOut_10_0 = param0;
                    stackOut_10_1 = 5 + var3_int;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    break L2;
                  } else {
                    var10 = gn.field_e[3 + var9];
                    stackOut_5_0 = var7;
                    stackOut_5_1 = var10;
                    stackIn_11_0 = stackOut_5_0;
                    stackIn_11_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (var11 != 0) {
                      break L2;
                    } else {
                      L3: {
                        if (stackIn_6_0 < stackIn_6_1) {
                          gn.field_e[var3_int] = gn.field_e[var9];
                          gn.field_e[var3_int - -1] = gn.field_e[var9 + 1];
                          gn.field_e[2 + var3_int] = gn.field_e[2 + var9];
                          gn.field_e[3 + var3_int] = var10;
                          gn.field_e[4 + var3_int] = gn.field_e[var9 - -4];
                          var3_int += 5;
                          gn.field_e[var9] = gn.field_e[var3_int];
                          gn.field_e[1 + var9] = gn.field_e[var3_int + 1];
                          gn.field_e[var9 + 2] = gn.field_e[var3_int + 2];
                          gn.field_e[var9 - -3] = gn.field_e[3 + var3_int];
                          gn.field_e[4 + var9] = gn.field_e[4 + var3_int];
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var9 += 5;
                      continue L1;
                    }
                  }
                }
                wc.a(stackIn_11_0, stackIn_11_1, param2 + 0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "wc.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    wc() {
    }

    static {
        field_n = true;
        field_q = "<%0> is not on your friend list.";
    }
}
