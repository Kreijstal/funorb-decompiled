/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends hf {
    static String field_Cb;
    static int[] field_Bb;
    static int[] field_Db;

    final void b(int param0, lm param1) {
        try {
            super.b(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "jk.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void j(byte param0) {
        ai[] var5 = null;
        int var2 = 0;
        ai var3 = null;
        int var4 = DungeonAssault.field_K;
        try {
            if (param0 != 59) {
                field_Db = (int[]) null;
            }
            var5 = gm.field_d.field_L;
            ai[] var1 = var5;
            for (var2 = 0; var2 < var5.length; var2++) {
                var3 = var5[var2];
                var3.field_c = new wd(var3.field_h.field_d);
            }
            wm.field_c = null;
            im.field_e = null;
            if (!gl.field_Lb) {
                kh.e(108);
                ra.c(8);
            } else {
                li.b(-107);
                of.a(param0 ^ -98);
            }
            df.b(16);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "jk.M(" + param0 + ')');
        }
    }

    final static String a(String[] args, String param1, int param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_18_0 = 0;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
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
        var11 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var3_int = param1.length();
              if (param2 == 30496) {
                break L1;
              } else {
                jk.a(21, -86);
                break L1;
              }
            }
            var4 = var3_int;
            var5 = 0;
            L2: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if (var6_int < 0) {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L3: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  if ((var8 ^ -1) <= -1) {
                    stackIn_18_0 = var8 + 2;
                    var5 = stackIn_18_0;
                    L4: while (true) {
                      L5: {
                        if (var5 >= var3_int) {
                          break L5;
                        } else {
                          if (!qm.a(57, param1.charAt(var5))) {
                            break L5;
                          } else {
                            var5++;
                            continue L4;
                          }
                        }
                      }
                      var9 = param1.substring(var8 + 2, var5);
                      if (!sj.a((CharSequence) ((Object) var9), param2 + -30486)) {
                        continue L3;
                      } else {
                        if (var5 >= var3_int) {
                          continue L3;
                        } else {
                          if (param1.charAt(var5) != 62) {
                            continue L3;
                          } else {
                            var5++;
                            var10 = ri.a((byte) 118, (CharSequence) ((Object) var9));
                            discarded$0 = var6.append(param1.substring(var7, var8));
                            var7 = var5;
                            discarded$1 = var6.append(args[var10]);
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    discarded$2 = var6.append(param1.substring(var7));
                    stackIn_27_0 = var6.toString();
                    break L0;
                  }
                }
              } else {
                var5 = var6_int - -2;
                L6: while (true) {
                  L7: {
                    if (var3_int <= var5) {
                      break L7;
                    } else {
                      if (!qm.a(57, param1.charAt(var5))) {
                        break L7;
                      } else {
                        var5++;
                        continue L6;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(2 + var6_int, var5);
                  if (!sj.a((CharSequence) ((Object) var7_ref_String), param2 + -30486)) {
                    continue L2;
                  } else {
                    if (var3_int <= var5) {
                      continue L2;
                    } else {
                      if (param1.charAt(var5) != 62) {
                        continue L2;
                      } else {
                        var5++;
                        var8 = ri.a((byte) 113, (CharSequence) ((Object) var7_ref_String));
                        var4 = var4 + (args[var8].length() - var5 - -var6_int);
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("jk.O(");

            if (args == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param2 + ')');
        }
        return stackIn_27_0;
    }

    public static void n(int param0) {
        field_Bb = null;
        field_Cb = null;
        if (param0 != -18554) {
            return;
        }
        field_Db = null;
    }

    jk(ji param0, lm param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static String a(int param0, int param1) {
        if (param0 <= 110) {
            return (String) null;
        }
        return k.a((byte) -122, 1, 1, param1);
    }

    static {
        field_Cb = "Priest";
        field_Db = new int[128];
    }
}
