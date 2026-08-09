/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ff {
    static int field_b;
    static long field_a;

    abstract void a(int param0, pb param1);

    abstract fe a(byte param0);

    final static qa[] a(int param0) {
        if (param0 != -21739) {
            field_a = 28L;
        }
        return new qa[]{ke.field_c, oj.field_e, bf.field_c};
    }

    final static void b(int param0) {
        if (param0 > -76) {
            field_b = -43;
        }
        String var2 = (String) null;
        uk.a(lh.field_c, -23804, (String) null);
    }

    final static String a(byte param0, CharSequence param1) {
        StringBuilder discarded$0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Main.field_T;
        try {
          if (param1 != null) {
            var2_int = 0;
            var3 = param1.length();
            L0: while (true) {
              L1: {
                if (var2_int >= var3) {
                  break L1;
                } else {
                  if (!tg.a((byte) -63, param1.charAt(var2_int))) {
                    break L1;
                  } else {
                    var2_int++;
                    continue L0;
                  }
                }
              }
              L2: while (true) {
                L3: {
                  if (var3 <= var2_int) {
                    break L3;
                  } else {
                    if (!tg.a((byte) -63, param1.charAt(var3 - 1))) {
                      break L3;
                    } else {
                      var3--;
                      continue L2;
                    }
                  }
                }
                L4: {
                  if (param0 == 116) {
                    break L4;
                  } else {
                    ff.b(-19);
                    break L4;
                  }
                }
                var4 = -var2_int + var3;
                if (var4 >= 1) {
                  if (12 >= var4) {
                    var5 = new StringBuilder(var4);
                    var6 = var2_int;
                    L5: while (true) {
                      if (var6 >= var3) {
                        if (var5.length() != 0) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      } else {
                        L6: {
                          var7 = param1.charAt(var6);
                          if (!rf.a((char) var7, 0)) {
                            break L6;
                          } else {
                            var8 = r.a(-219, (char) var7);
                            if (var8 != 0) {
                              discarded$0 = var5.append((char) var8);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var6++;
                        continue L5;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var2);

            stackIn_32_1 = new StringBuilder().append("ff.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
    }

    static {
    }
}
