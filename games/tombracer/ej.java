/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static jta field_a;
    static fp field_c;
    static String field_b;
    static uca[] field_d;

    public static void a(int param0) {
        if (param0 != -1) {
          boolean discarded$2 = ej.a(false, false, (CharSequence) null);
          field_d = null;
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    final static boolean a(boolean param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        if (param2 == null) {
          return false;
        } else {
          var3 = param2.length();
          if (-2 >= (var3 ^ -1)) {
            if (var3 <= 12) {
              if (!param0) {
                var10 = jd.a(1, param2);
                if (var10 == null) {
                  return false;
                } else {
                  if ((var10.length() ^ -1) <= -2) {
                    L0: {
                      if (hf.a(-62, var10.charAt(0))) {
                        break L0;
                      } else {
                        if (hf.a(114, var10.charAt(-1 + var10.length()))) {
                          break L0;
                        } else {
                          var5 = 0;
                          var6 = 0;
                          L1: while (true) {
                            if (param2.length() <= var6) {
                              if (-1 >= var5) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L2: {
                                var7 = param2.charAt(var6);
                                if (!hf.a(-73, (char) var7)) {
                                  var5 = 0;
                                  break L2;
                                } else {
                                  var5++;
                                  break L2;
                                }
                              }
                              if (var5 > -3) {
                                var6++;
                                var6++;
                                continue L1;
                              } else {
                                if (!param1) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return false;
                  } else {
                    return false;
                  }
                }
              } else {
                ej.a(-107);
                var9 = jd.a(1, param2);
                if (var9 == null) {
                  return false;
                } else {
                  if ((var9.length() ^ -1) <= -2) {
                    L3: {
                      if (hf.a(-62, var9.charAt(0))) {
                        break L3;
                      } else {
                        if (hf.a(114, var9.charAt(-1 + var9.length()))) {
                          break L3;
                        } else {
                          var5 = 0;
                          var6 = 0;
                          L4: while (true) {
                            if (param2.length() <= var6) {
                              if (-1 >= var5) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L5: {
                                var7 = param2.charAt(var6);
                                if (!hf.a(-73, (char) var7)) {
                                  var5 = 0;
                                  break L5;
                                } else {
                                  var5++;
                                  break L5;
                                }
                              }
                              if (var5 > -3) {
                                var6++;
                                var6++;
                                continue L4;
                              } else {
                                if (!param1) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return false;
                  } else {
                    return false;
                  }
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Close";
        field_c = new fp();
    }
}
