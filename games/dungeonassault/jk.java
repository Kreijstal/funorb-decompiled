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
            throw vk.a((Throwable) (Object) runtimeException, "jk.L(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void j() {
        ai[] var5 = null;
        int var2 = 0;
        ai var3 = null;
        int var4 = DungeonAssault.field_K;
        try {
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
                int discarded$0 = 8;
                ra.c();
            } else {
                int discarded$1 = -107;
                li.b();
                of.a(-91);
            }
            int discarded$2 = 16;
            df.b();
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "jk.M(" + 59 + 41);
        }
    }

    final static String a(String[] args, String param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        String stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var11 = DungeonAssault.field_K;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if (var6_int < 0) {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L2: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  if (var8 >= 0) {
                    var5 = var8 + 2;
                    L3: while (true) {
                      L4: {
                        if (var5 >= var3_int) {
                          break L4;
                        } else {
                          if (!qm.a(57, param1.charAt(var5))) {
                            break L4;
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                      var9 = param1.substring(var8 + 2, var5);
                      int discarded$5 = 10;
                      if (!sj.a((CharSequence) (Object) var9)) {
                        continue L2;
                      } else {
                        if (var5 >= var3_int) {
                          continue L2;
                        } else {
                          if (param1.charAt(var5) != 62) {
                            continue L2;
                          } else {
                            var5++;
                            var10 = ri.a((byte) 118, (CharSequence) (Object) var9);
                            StringBuilder discarded$6 = var6.append(param1.substring(var7, var8));
                            var7 = var5;
                            StringBuilder discarded$7 = var6.append(args[var10]);
                            continue L2;
                          }
                        }
                      }
                    }
                  } else {
                    StringBuilder discarded$8 = var6.append(param1.substring(var7));
                    stackOut_22_0 = var6.toString();
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  }
                }
              } else {
                var5 = var6_int - -2;
                L5: while (true) {
                  L6: {
                    if (var3_int <= var5) {
                      break L6;
                    } else {
                      if (!qm.a(57, param1.charAt(var5))) {
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(2 + var6_int, var5);
                  int discarded$9 = 10;
                  if (!sj.a((CharSequence) (Object) var7_ref_String)) {
                    continue L1;
                  } else {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (param1.charAt(var5) != 62) {
                        continue L1;
                      } else {
                        var5++;
                        var8 = ri.a((byte) 113, (CharSequence) (Object) var7_ref_String);
                        var4 = var4 + (args[var8].length() - var5 - -var6_int);
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("jk.O(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (args == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + 30496 + 41);
        }
        return stackIn_23_0;
    }

    public static void n() {
        field_Bb = null;
        field_Cb = null;
        field_Db = null;
    }

    jk(ji param0, lm param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static String a(int param0, int param1) {
        if (param0 <= 110) {
            return null;
        }
        return k.a((byte) -122, 1, 1, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Cb = "Priest";
        field_Db = new int[128];
    }
}
