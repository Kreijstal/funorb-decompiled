/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends lh {
    int[] field_m;
    boolean field_p;
    static String field_k;
    static sf field_n;
    int field_i;
    static int field_j;
    static String field_l;
    static String[] field_o;

    final static String a(CharSequence param0, boolean param1, byte param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        if (param0 != null) {
          var3 = param0.length();
          if ((var3 ^ -1) <= -2) {
            if ((var3 ^ -1) >= -13) {
              L0: {
                var4 = uk.a(53, param0);
                if (var4 == null) {
                  break L0;
                } else {
                  if ((var4.length() ^ -1) > -2) {
                    break L0;
                  } else {
                    if (r.a(var4.charAt(0), param2 + -4)) {
                      return ha.field_m;
                    } else {
                      if (!r.a(var4.charAt(-1 + var4.length()), -43)) {
                        if (param2 == 124) {
                          var5 = 0;
                          var6 = 0;
                          L1: while (true) {
                            if (param0.length() <= var6) {
                              if (0 < var5) {
                                return ha.field_m;
                              } else {
                                return null;
                              }
                            } else {
                              L2: {
                                var7 = param0.charAt(var6);
                                if (!r.a((char) var7, -122)) {
                                  var5 = 0;
                                  break L2;
                                } else {
                                  var5++;
                                  break L2;
                                }
                              }
                              if (2 > var5) {
                                var6++;
                                var6++;
                                continue L1;
                              } else {
                                if (!param1) {
                                  return wf.field_e;
                                } else {
                                  var6++;
                                  continue L1;
                                }
                              }
                            }
                          }
                        } else {
                          return null;
                        }
                      } else {
                        return ha.field_m;
                      }
                    }
                  }
                }
              }
              return hi.field_k;
            } else {
              return hi.field_k;
            }
          } else {
            return hi.field_k;
          }
        } else {
          return hi.field_k;
        }
    }

    final static n a(rh param0, rh param1, String param2, String param3, byte param4) {
        int var5 = param0.a(param2, (byte) -100);
        if (param4 != 82) {
            Object var7 = null;
            n discarded$0 = fi.a((rh) null, (rh) null, (String) null, (String) null, (byte) 26);
        }
        int var6 = param0.a(param3, (byte) -15, var5);
        return dl.a(var6, 2, var5, param1, param0);
    }

    public static void a(int param0) {
        field_n = null;
        field_o = null;
        field_k = null;
        field_l = null;
        if (param0 != -2) {
            fi.a(38);
        }
    }

    fi() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "<%0>Green Switches:<%1> Causes all the recessed walls to slide out, and become normal wall blocks. Warning! Fleas standing in the way are crushed and die!";
        field_l = "Level complete!";
        field_o = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
