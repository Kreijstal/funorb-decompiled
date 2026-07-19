/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends td {
    static String field_q;
    static int field_p;

    public static void c(boolean param0) {
        if (param0) {
            return;
        }
        field_q = null;
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        ica var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wia var14 = null;
        aga var15 = null;
        iv var16 = null;
        int var17 = 0;
        aga var18 = null;
        int[][] var22 = null;
        ica stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        ica stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var17 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var18 = this.field_h.a(25, param0);
              var4 = new ica(this.field_g, new nq(var18));
              var4.field_q = this.field_n;
              var4.field_s = this.field_k;
              if (param1 == 3) {
                break L1;
              } else {
                field_p = -22;
                break L1;
              }
            }
            var22 = var4.a(param0, 0, -95, var18);
            var6 = 17;
            var7 = 17;
            var8 = var6 - 1 >> -399712671;
            var9 = -1 + var7 >> 2051560865;
            var10 = 0;
            L2: while (true) {
              if (var10 >= var6) {
                stackOut_22_0 = (ica) (var4);
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                var11 = 0;
                L3: while (true) {
                  if (var11 >= var7) {
                    var10++;
                    continue L2;
                  } else {
                    if (1 == var22[var10][var11]) {
                      var12 = var10 - (var8 - this.field_k);
                      var13 = -var9 + var11 + this.field_n;
                      if (0 <= var12) {
                        if (param0.field_z > var12) {
                          if (0 <= var13) {
                            L4: {
                              if (var13 < param0.field_B) {
                                var14 = param0.field_a[var12][var13];
                                var15 = var14.field_l;
                                if (var15 != null) {
                                  var16 = new iv(new nq(var15), false, 1, 0, 53);
                                  var4.field_o.a(var16, true);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                            var11++;
                            continue L3;
                          } else {
                            var11++;
                            continue L3;
                          }
                        } else {
                          var11++;
                          continue L3;
                        }
                      } else {
                        var11++;
                        continue L3;
                      }
                    } else {
                      var11++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("ud.A(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        return (ii) ((Object) stackIn_23_0);
    }

    ud(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            this.field_n = param3;
            this.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ud.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        wn.field_p = true;
        if (param1 < 77) {
            return;
        }
        try {
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            oc.a(param0, var2, var4, 122, var3);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ud.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_q = "Allow spectators?";
    }
}
