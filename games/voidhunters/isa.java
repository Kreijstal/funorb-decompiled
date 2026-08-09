/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class isa extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              jj.field_p = param0[0].d(0);
              if (param1 <= -119) {
                break L1;
              } else {
                var4 = (nc[]) null;
                this.a((nc[]) null, -2);
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("isa.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(String param0, String[] param1, int param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_6_0 = 0;
        String stackIn_17_0 = null;
        int stackIn_23_0 = 0;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if (0 <= var6_int) {
                stackIn_6_0 = var6_int + 2;
                var5 = stackIn_6_0;
                L2: while (true) {
                  L3: {
                    if (var3_int <= var5) {
                      break L3;
                    } else {
                      if (!haa.a(param0.charAt(var5), true)) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(2 + var6_int, var5);
                  if (!hwa.a((CharSequence) ((Object) var7_ref_String), 10)) {
                    continue L1;
                  } else {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (param0.charAt(var5) == 62) {
                        var5++;
                        var8 = lob.a(24, (CharSequence) ((Object) var7_ref_String));
                        var4 = var4 + (param1[var8].length() + -var5 - -var6_int);
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                if (param2 > 71) {
                  var6 = new StringBuilder(var4);
                  var7 = 0;
                  var5 = 0;
                  L4: while (true) {
                    var8 = param0.indexOf("<%", var5);
                    if (var8 >= 0) {
                      stackIn_23_0 = var8 + 2;
                      var5 = stackIn_23_0;
                      L5: while (true) {
                        L6: {
                          if (var3_int <= var5) {
                            break L6;
                          } else {
                            if (!haa.a(param0.charAt(var5), true)) {
                              break L6;
                            } else {
                              var5++;
                              continue L5;
                            }
                          }
                        }
                        var9 = param0.substring(var8 - -2, var5);
                        if (!hwa.a((CharSequence) ((Object) var9), 10)) {
                          continue L4;
                        } else {
                          if ((var3_int ^ -1) >= (var5 ^ -1)) {
                            continue L4;
                          } else {
                            if (62 == param0.charAt(var5)) {
                              var5++;
                              var10 = lob.a(-88, (CharSequence) ((Object) var9));
                              discarded$0 = var6.append(param0.substring(var7, var8));
                              var7 = var5;
                              discarded$1 = var6.append(param1[var10]);
                              continue L4;
                            } else {
                              continue L4;
                            }
                          }
                        }
                      }
                    } else {
                      discarded$2 = var6.append(param0.substring(var7));
                      stackIn_33_0 = var6.toString();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  stackIn_17_0 = (String) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var3);

            stackIn_36_1 = new StringBuilder().append("isa.B(");

            if (param0 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L7;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');

            if (param1 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L8;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_37_0), stackIn_40_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0;
        } else {
          return stackIn_33_0;
        }
    }

    isa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
