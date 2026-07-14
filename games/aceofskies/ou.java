/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ou extends wt {
    static char[] field_n;

    ou() {
    }

    final static boolean a(int param0, CharSequence param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        if (param1 == null) {
          return false;
        } else {
          var3 = ((CharSequence) param1).length();
          if (-2 < (var3 ^ -1)) {
            return false;
          } else {
            if ((var3 ^ -1) >= -13) {
              L0: {
                var4 = vu.a(127, param1);
                if (var4 == null) {
                  break L0;
                } else {
                  if (1 > var4.length()) {
                    break L0;
                  } else {
                    L1: {
                      if (za.a((byte) 117, var4.charAt(0))) {
                        break L1;
                      } else {
                        if (za.a((byte) 117, var4.charAt(-1 + var4.length()))) {
                          break L1;
                        } else {
                          if (param0 == 19069) {
                            var5 = 0;
                            var6 = 0;
                            L2: while (true) {
                              if (var6 >= ((CharSequence) param1).length()) {
                                L3: {
                                  if (0 < var5) {
                                    stackOut_30_0 = 0;
                                    stackIn_31_0 = stackOut_30_0;
                                    break L3;
                                  } else {
                                    stackOut_29_0 = 1;
                                    stackIn_31_0 = stackOut_29_0;
                                    break L3;
                                  }
                                }
                                return stackIn_31_0 != 0;
                              } else {
                                L4: {
                                  var7 = ((CharSequence) param1).charAt(var6);
                                  if (za.a((byte) 117, (char) var7)) {
                                    var5++;
                                    break L4;
                                  } else {
                                    var5 = 0;
                                    break L4;
                                  }
                                }
                                if (-3 >= (var5 ^ -1)) {
                                  if (!param2) {
                                    return false;
                                  } else {
                                    var6++;
                                    continue L2;
                                  }
                                } else {
                                  var6++;
                                  continue L2;
                                }
                              }
                            }
                          } else {
                            return true;
                          }
                        }
                      }
                    }
                    return false;
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

    public static void e(int param0) {
        field_n = null;
        if (param0 != 108) {
            field_n = (char[]) null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
