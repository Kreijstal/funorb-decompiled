/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jm {
    static ko field_k;
    static int[] field_a;
    static boolean field_j;
    static int field_g;
    static dl field_i;
    static String[] field_e;
    static ck field_d;
    static int field_c;
    static int field_b;
    static String field_f;
    static ke field_h;

    final static jp a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        jp stackIn_3_0 = null;
        jp stackIn_7_0 = null;
        jp stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        jp stackIn_25_0 = null;
        jp stackIn_39_0 = null;
        jp stackIn_43_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_6_0 = null;
        jp stackOut_38_0 = null;
        jp stackOut_42_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        jp stackOut_24_0 = null;
        jp stackOut_10_0 = null;
        jp stackOut_2_0 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          var2_int = param0.length();
          if (var2_int != 0) {
            if (64 < var2_int) {
              stackOut_6_0 = hk.field_d;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (param0.charAt(0) != 34) {
                var3 = 0;
                var4 = 0;
                L0: while (true) {
                  if (var2_int > var4) {
                    L1: {
                      var5 = param0.charAt(var4);
                      if (var5 == 46) {
                        L2: {
                          if (var4 == 0) {
                            break L2;
                          } else {
                            if (var2_int + -1 == var4) {
                              break L2;
                            } else {
                              if (var3 != 0) {
                                break L2;
                              } else {
                                var3 = 1;
                                var4++;
                                break L1;
                              }
                            }
                          }
                        }
                        stackOut_38_0 = sl.field_m;
                        stackIn_39_0 = stackOut_38_0;
                        return stackIn_39_0;
                      } else {
                        if (fm.field_r.indexOf(var5) != -1) {
                          var3 = 0;
                          var4++;
                          break L1;
                        } else {
                          stackOut_42_0 = sl.field_m;
                          stackIn_43_0 = stackOut_42_0;
                          return stackIn_43_0;
                        }
                      }
                    }
                    var4++;
                    continue L0;
                  } else {
                    return null;
                  }
                }
              } else {
                if (param0.charAt(var2_int - 1) == 34) {
                  var3 = 0;
                  var4 = 1;
                  L3: while (true) {
                    if (var2_int + -1 > var4) {
                      L4: {
                        var5 = param0.charAt(var4);
                        if (var5 == 92) {
                          L5: {
                            if (var3 != 0) {
                              stackOut_19_0 = 0;
                              stackIn_20_0 = stackOut_19_0;
                              break L5;
                            } else {
                              stackOut_18_0 = 1;
                              stackIn_20_0 = stackOut_18_0;
                              break L5;
                            }
                          }
                          var3 = stackIn_20_0;
                          break L4;
                        } else {
                          L6: {
                            if (var5 != 34) {
                              break L6;
                            } else {
                              if (var3 == 0) {
                                stackOut_24_0 = sl.field_m;
                                stackIn_25_0 = stackOut_24_0;
                                return stackIn_25_0;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var3 = 0;
                          break L4;
                        }
                      }
                      var4++;
                      continue L3;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_10_0 = sl.field_m;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            }
          } else {
            stackOut_2_0 = ma.field_m;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var2;
            stackOut_50_1 = new StringBuilder().append("jm.E(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L7;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L7;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ',' + true + ')');
        }
    }

    public static void a() {
        field_a = null;
        field_i = null;
        field_k = null;
        field_e = null;
        field_f = null;
        field_d = null;
        field_h = null;
    }

    abstract void a(byte param0, java.awt.Component param1);

    abstract int a(boolean param0);

    abstract void a(int param0, java.awt.Component param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 48;
        field_j = true;
        field_e = new String[]{"Crystal Nabber", "Crystal Keeper", "Crystal Collector", "Crystal Connoisseur", "Crystal Monarch", "Desperate Dodger", "Crazy Dodger", "Jammy Dodger", "Humble Collector", "Dabbling Jeweller", "Accomplished Artisan", "Prince of Gems", "Spider Stomper", "Ball Blaster", "Speed Diamond", "Flawless Performer", "Creepy Crystals"};
        field_f = "Connection timed out. Please try using a different server.";
    }
}
