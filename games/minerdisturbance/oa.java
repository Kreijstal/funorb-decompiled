/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    final static eg a(int param0) {
        if (null == kj.field_c) {
            kj.field_c = new eg(sl.field_q, 20, 0, 0, 0, 11579568, -1, 0, 0, sl.field_q.field_I, -1, 2147483647, true);
        }
        if (param0 != 0) {
            return (eg) null;
        }
        return kj.field_c;
    }

    final static String a(byte param0, String param1, String[] param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_15_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = MinerDisturbance.field_ab;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if (0 > var6_int) {
                if (param0 < -70) {
                  var6 = new StringBuilder(var4);
                  var7 = 0;
                  var5 = 0;
                  L2: while (true) {
                    var8 = param1.indexOf("<%", var5);
                    if (-1 < (var8 ^ -1)) {
                      discarded$0 = var6.append(param1.substring(var7));
                      stackIn_28_0 = var6.toString();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var5 = var8 + 2;
                      L3: while (true) {
                        L4: {
                          if (var5 >= var3_int) {
                            break L4;
                          } else {
                            if (!g.a(param1.charAt(var5), (byte) -68)) {
                              break L4;
                            } else {
                              var5++;
                              continue L3;
                            }
                          }
                        }
                        var9 = param1.substring(var8 + 2, var5);
                        if (!oi.a(-19804, (CharSequence) ((Object) var9))) {
                          continue L2;
                        } else {
                          if (var5 >= var3_int) {
                            continue L2;
                          } else {
                            if (param1.charAt(var5) == 62) {
                              var5++;
                              var10 = md.a((CharSequence) ((Object) var9), true);
                              discarded$1 = var6.append(param1.substring(var7, var8));
                              var7 = var5;
                              discarded$2 = var6.append(param2[var10]);
                              continue L2;
                            } else {
                              continue L2;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  stackIn_15_0 = (String) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var5 = var6_int + 2;
                L5: while (true) {
                  L6: {
                    if (var3_int <= var5) {
                      break L6;
                    } else {
                      if (!g.a(param1.charAt(var5), (byte) -68)) {
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(var6_int + 2, var5);
                  if (oi.a(-19804, (CharSequence) ((Object) var7_ref_String))) {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (param1.charAt(var5) == 62) {
                        var5++;
                        var8 = md.a((CharSequence) ((Object) var7_ref_String), true);
                        var4 = var4 + (param2[var8].length() + -var5 + var6_int);
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("oa.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L7;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L8;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0;
        } else {
          return stackIn_28_0;
        }
    }

    static {
    }
}
