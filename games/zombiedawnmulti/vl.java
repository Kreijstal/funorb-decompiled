/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends br {
    int field_g;
    static ja field_k;
    int field_i;
    static String[] field_j;
    static int field_h;
    static ri field_f;

    final static String a(String param0, String[] param1, int param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_16_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
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
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if (var6_int >= 0) {
                var5 = var6_int + 2;
                L2: while (true) {
                  L3: {
                    if (var5 >= var3_int) {
                      break L3;
                    } else {
                      if (!vh.a(param0.charAt(var5), (byte) 85)) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(2 + var6_int, var5);
                  if (ti.a((byte) 87, (CharSequence) ((Object) var7_ref_String))) {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (param0.charAt(var5) == 62) {
                        var5++;
                        var8 = md.a((CharSequence) ((Object) var7_ref_String), -9159);
                        var4 = var4 + (var6_int - (var5 - param1[var8].length()));
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              } else {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                if (param2 == 2) {
                  L4: while (true) {
                    var8 = param0.indexOf("<%", var5);
                    if (var8 < 0) {
                      discarded$0 = var6.append(param0.substring(var7));
                      stackIn_27_0 = var6.toString();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var5 = var8 + 2;
                      L5: while (true) {
                        L6: {
                          if (var3_int <= var5) {
                            break L6;
                          } else {
                            if (!vh.a(param0.charAt(var5), (byte) 85)) {
                              break L6;
                            } else {
                              var5++;
                              continue L5;
                            }
                          }
                        }
                        var9 = param0.substring(var8 + 2, var5);
                        if (!ti.a((byte) 74, (CharSequence) ((Object) var9))) {
                          continue L4;
                        } else {
                          if (var5 >= var3_int) {
                            continue L4;
                          } else {
                            if (param0.charAt(var5) != 62) {
                              continue L4;
                            } else {
                              var5++;
                              var10 = md.a((CharSequence) ((Object) var9), param2 ^ -9157);
                              discarded$1 = var6.append(param0.substring(var7, var8));
                              var7 = var5;
                              discarded$2 = var6.append(param1[var10]);
                              continue L4;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  stackIn_16_0 = (String) null;
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
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("vl.B(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          return stackIn_27_0;
        }
    }

    final static void a(pd param0, pd param1, int param2, int param3, int param4, int param5) {
        try {
            wk.field_G = param4;
            no.field_Gb = param3;
            al.field_bb = param5;
            mc.field_a = param0;
            en.field_d = param1;
            if (param2 <= 43) {
                pd var7 = (pd) null;
                vl.a((pd) null, (pd) null, -67, -110, -57, -56);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "vl.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_f = (ri) null;
        }
        field_j = null;
        field_k = null;
        field_f = null;
    }

    final static int a(int param0, byte param1) {
        if (param1 != -103) {
            field_h = -19;
        }
        int var2 = param0 >>> 821628865;
        var2 = var2 | var2 >>> 1488112865;
        var2 = var2 | var2 >>> -631341566;
        var2 = var2 | var2 >>> 1232304548;
        var2 = var2 | var2 >>> -1195661720;
        var2 = var2 | var2 >>> 2078424912;
        return param0 & (var2 ^ -1);
    }

    private vl() throws Throwable {
        throw new Error();
    }

    static {
        field_j = new String[]{"By rating", "By win percentage"};
    }
}
