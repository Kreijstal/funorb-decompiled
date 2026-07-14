/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static int field_g;
    static int[] field_a;
    boolean field_d;
    boolean field_i;
    String field_h;
    int field_b;
    static int[] field_e;
    String[] field_c;
    static int[] field_f;

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        field_e = null;
        if (param0 < 102) {
            Object var2 = null;
            boolean discarded$0 = wd.a((byte) 89, (CharSequence) null, false);
        }
    }

    final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        var8 = wizardrun.field_H;
        if (param1 == null) {
          return false;
        } else {
          var3 = param1.length();
          if (var3 < 1) {
            return false;
          } else {
            if (-13 <= (var3 ^ -1)) {
              L0: {
                var4 = ta.a(-77, param1);
                if (var4 == null) {
                  break L0;
                } else {
                  if (1 <= var4.length()) {
                    L1: {
                      if (d.a(true, var4.charAt(0))) {
                        break L1;
                      } else {
                        if (!d.a(true, var4.charAt(var4.length() - 1))) {
                          L2: {
                            var5 = 0;
                            if (param0 == 43) {
                              break L2;
                            } else {
                              var9 = null;
                              boolean discarded$2 = wd.a((byte) 21, (CharSequence) null, true);
                              break L2;
                            }
                          }
                          var6 = 0;
                          L3: while (true) {
                            if (param1.length() <= var6) {
                              L4: {
                                if (-1 < var5) {
                                  stackOut_30_0 = 0;
                                  stackIn_31_0 = stackOut_30_0;
                                  break L4;
                                } else {
                                  stackOut_29_0 = 1;
                                  stackIn_31_0 = stackOut_29_0;
                                  break L4;
                                }
                              }
                              return stackIn_31_0 != 0;
                            } else {
                              L5: {
                                var7 = param1.charAt(var6);
                                if (d.a(true, (char) var7)) {
                                  var5++;
                                  break L5;
                                } else {
                                  var5 = 0;
                                  break L5;
                                }
                              }
                              if (var5 <= -3) {
                                if (!param2) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L3;
                                }
                              } else {
                                var6++;
                                continue L3;
                              }
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                    return false;
                  } else {
                    break L0;
                  }
                }
              }
              return false;
            } else {
              return false;
            }
          }
        }
    }

    wd(boolean param0) {
        ((wd) this).field_i = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_g = 100;
        field_a = new int[128];
        field_e = new int[8192];
        field_f = new int[256];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                field_f[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (1 != (var0 & 1)) {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = -306674912 ^ var0 >>> 371290497;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
