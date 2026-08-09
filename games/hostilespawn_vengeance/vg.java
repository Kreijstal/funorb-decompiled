/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static bd field_d;
    static String field_f;
    static String field_g;
    static ji field_h;
    static pg field_c;
    static int[] field_a;
    static String field_b;
    static v[] field_e;

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() < eb.field_a) {
                  break L1;
                } else {
                  if (param1.length() <= vd.field_D) {
                    if (param0) {
                      stackIn_10_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      stackIn_8_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return true;
                  }
                }
              }
            }
            stackIn_5_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("vg.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        if (param0 != 2) {
            String var2 = (String) null;
            vg.a((String[]) null, 105, (String) null);
        }
        field_b = null;
        field_g = null;
        field_e = null;
        field_a = null;
        field_h = null;
        field_d = null;
    }

    final static String a(String[] args, int param1, String param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_8_0 = 0;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
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
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param2.length();
              if (param1 > 12) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            var4 = var3_int;
            var5 = 0;
            L2: while (true) {
              var6_int = param2.indexOf("<%", var5);
              if (0 <= var6_int) {
                stackIn_8_0 = var6_int + 2;
                var5 = stackIn_8_0;
                L3: while (true) {
                  L4: {
                    if (var5 >= var3_int) {
                      break L4;
                    } else {
                      if (!qh.a(param2.charAt(var5), -49)) {
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var7_ref_String = param2.substring(2 + var6_int, var5);
                  if (!sf.a((byte) 95, (CharSequence) ((Object) var7_ref_String))) {
                    continue L2;
                  } else {
                    if ((var3_int ^ -1) >= (var5 ^ -1)) {
                      continue L2;
                    } else {
                      if (62 != param2.charAt(var5)) {
                        continue L2;
                      } else {
                        var5++;
                        var8 = hi.a(-110, (CharSequence) ((Object) var7_ref_String));
                        var4 = var4 + (var6_int + -var5 + args[var8].length());
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L5: while (true) {
                  var8 = param2.indexOf("<%", var5);
                  if (var8 >= 0) {
                    var5 = var8 + 2;
                    L6: while (true) {
                      L7: {
                        if (var5 >= var3_int) {
                          break L7;
                        } else {
                          if (!qh.a(param2.charAt(var5), -49)) {
                            break L7;
                          } else {
                            var5++;
                            continue L6;
                          }
                        }
                      }
                      var9 = param2.substring(var8 + 2, var5);
                      if (sf.a((byte) 80, (CharSequence) ((Object) var9))) {
                        if (var3_int <= var5) {
                          continue L5;
                        } else {
                          if (62 != param2.charAt(var5)) {
                            continue L5;
                          } else {
                            var5++;
                            var10 = hi.a(-29, (CharSequence) ((Object) var9));
                            discarded$0 = var6.append(param2.substring(var7, var8));
                            var7 = var5;
                            discarded$1 = var6.append(args[var10]);
                            continue L5;
                          }
                        }
                      } else {
                        continue L5;
                      }
                    }
                  } else {
                    discarded$2 = var6.append(param2.substring(var7));
                    stackIn_29_0 = var6.toString();
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("vg.C(");

            if (args == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L9;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L9;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ')');
        }
        return stackIn_29_0;
    }

    static {
        field_g = "Player";
        field_b = "Head to the bridge to download the mission data disc.";
        field_f = "Player names can be up to 12 letters, numbers and underscores";
    }
}
