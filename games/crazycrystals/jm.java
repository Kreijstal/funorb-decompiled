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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var6 = CrazyCrystals.field_B;
        var2 = param0.length();
        if (var2 != 0) {
          if (64 < var2) {
            return hk.field_d;
          } else {
            if (param0.charAt(0) != 34) {
              var3 = 0;
              if (!param1) {
                field_j = true;
                var4 = 0;
                L0: while (true) {
                  if (var2 > var4) {
                    L1: {
                      L2: {
                        var5 = param0.charAt(var4);
                        if (var5 == 46) {
                          L3: {
                            if (-1 == (var4 ^ -1)) {
                              break L3;
                            } else {
                              if (var2 + -1 == var4) {
                                break L3;
                              } else {
                                if (var3 != 0) {
                                  break L3;
                                } else {
                                  var3 = 1;
                                  if (var6 == 0) {
                                    break L1;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                          return sl.field_m;
                        } else {
                          break L2;
                        }
                      }
                      if (0 != (fm.field_r.indexOf(var5) ^ -1)) {
                        var3 = 0;
                        break L1;
                      } else {
                        return sl.field_m;
                      }
                    }
                    var4++;
                    continue L0;
                  } else {
                    return null;
                  }
                }
              } else {
                var4 = 0;
                L4: while (true) {
                  if (var2 > var4) {
                    L5: {
                      L6: {
                        var5 = param0.charAt(var4);
                        if (var5 == 46) {
                          L7: {
                            if (-1 == (var4 ^ -1)) {
                              break L7;
                            } else {
                              if (var2 + -1 == var4) {
                                break L7;
                              } else {
                                if (var3 != 0) {
                                  break L7;
                                } else {
                                  var3 = 1;
                                  if (var6 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          return sl.field_m;
                        } else {
                          break L6;
                        }
                      }
                      if (0 != (fm.field_r.indexOf(var5) ^ -1)) {
                        var3 = 0;
                        break L5;
                      } else {
                        return sl.field_m;
                      }
                    }
                    var4++;
                    continue L4;
                  } else {
                    return null;
                  }
                }
              }
            } else {
              if (param0.charAt(var2 - 1) == 34) {
                var3 = 0;
                var4 = 1;
                L8: while (true) {
                  if (var2 + -1 > var4) {
                    L9: {
                      L10: {
                        var5 = param0.charAt(var4);
                        if (var5 == 92) {
                          L11: {
                            if (var3 != 0) {
                              stackOut_15_0 = 0;
                              stackIn_16_0 = stackOut_15_0;
                              break L11;
                            } else {
                              stackOut_14_0 = 1;
                              stackIn_16_0 = stackOut_14_0;
                              break L11;
                            }
                          }
                          var3 = stackIn_16_0;
                          if (var6 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      }
                      if (var5 != 34) {
                        var3 = 0;
                        break L9;
                      } else {
                        if (var3 != 0) {
                          var3 = 0;
                          var4++;
                          return null;
                        } else {
                          return sl.field_m;
                        }
                      }
                    }
                    var4++;
                    if (var6 == 0) {
                      continue L8;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return sl.field_m;
              }
            }
          }
        } else {
          return ma.field_m;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        if (param0 >= -120) {
          field_i = null;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 48;
        field_j = true;
        field_e = new String[]{"Crystal Nabber", "Crystal Keeper", "Crystal Collector", "Crystal Connoisseur", "Crystal Monarch", "Desperate Dodger", "Crazy Dodger", "Jammy Dodger", "Humble Collector", "Dabbling Jeweller", "Accomplished Artisan", "Prince of Gems", "Spider Stomper", "Ball Blaster", "Speed Diamond", "Flawless Performer", "Creepy Crystals"};
        field_f = "Connection timed out. Please try using a different server.";
    }
}
