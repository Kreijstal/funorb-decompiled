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

    final static jp a(String param0, boolean param1) {
        jp stackIn_3_0 = null;
        jp stackIn_7_0 = null;
        jp stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        jp stackIn_25_0 = null;
        jp stackIn_41_0 = null;
        jp stackIn_45_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if (64 < var2_int) {
                stackIn_7_0 = hk.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(0) != 34) {
                  L1: {
                    var3 = 0;
                    if (param1) {
                      break L1;
                    } else {
                      field_j = true;
                      break L1;
                    }
                  }
                  var4 = 0;
                  L2: while (true) {
                    if (var2_int > var4) {
                      L3: {
                        var5 = param0.charAt(var4);
                        if (var5 == 46) {
                          L4: {
                            if (-1 == (var4 ^ -1)) {
                              break L4;
                            } else {
                              if (var2_int + -1 == var4) {
                                break L4;
                              } else {
                                if (var3 != 0) {
                                  break L4;
                                } else {
                                  var3 = 1;
                                  break L3;
                                }
                              }
                            }
                          }
                          stackIn_41_0 = sl.field_m;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (0 != (fm.field_r.indexOf(var5) ^ -1)) {
                            var3 = 0;
                            break L3;
                          } else {
                            stackIn_45_0 = sl.field_m;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                      var4++;
                      continue L2;
                    } else {
                      return null;
                    }
                  }
                } else {
                  if (param0.charAt(var2_int - 1) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L5: while (true) {
                      if (var2_int + -1 > var4) {
                        L6: {
                          var5 = param0.charAt(var4);
                          if (var5 == 92) {
                            L7: {
                              if (var3 != 0) {
                                stackIn_20_0 = 0;
                                break L7;
                              } else {
                                stackIn_20_0 = 1;
                                break L7;
                              }
                            }
                            var3 = stackIn_20_0;
                            break L6;
                          } else {
                            L8: {
                              if (var5 != 34) {
                                break L8;
                              } else {
                                if (var3 == 0) {
                                  stackIn_25_0 = sl.field_m;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var3 = 0;
                            break L6;
                          }
                        }
                        var4++;
                        continue L5;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_11_0 = sl.field_m;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = ma.field_m;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var2);

            stackIn_52_1 = new StringBuilder().append("jm.E(");

            if (param0 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L9;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L9;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_41_0;
                } else {
                  return stackIn_45_0;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        if (param0 >= -120) {
          field_i = (dl) null;
          field_k = null;
          field_e = null;
          field_f = null;
          field_d = null;
          field_h = null;
          return;
        } else {
          field_k = null;
          field_e = null;
          field_f = null;
          field_d = null;
          field_h = null;
          return;
        }
    }

    abstract void a(byte param0, java.awt.Component param1);

    abstract int a(boolean param0);

    abstract void a(int param0, java.awt.Component param1);

    static {
        field_g = 48;
        field_j = true;
        field_e = new String[]{"Crystal Nabber", "Crystal Keeper", "Crystal Collector", "Crystal Connoisseur", "Crystal Monarch", "Desperate Dodger", "Crazy Dodger", "Jammy Dodger", "Humble Collector", "Dabbling Jeweller", "Accomplished Artisan", "Prince of Gems", "Spider Stomper", "Ball Blaster", "Speed Diamond", "Flawless Performer", "Creepy Crystals"};
        field_f = "Connection timed out. Please try using a different server.";
    }
}
