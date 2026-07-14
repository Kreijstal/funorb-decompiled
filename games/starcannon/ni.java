/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni implements de {
    static int field_k;
    private int field_n;
    private int field_c;
    private int field_l;
    private int field_i;
    private int field_d;
    private qe field_m;
    private int field_j;
    private int field_b;
    private int field_a;
    private int field_h;
    private int field_g;
    private int field_e;
    static String[] field_f;

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        gh var12 = null;
        uj stackIn_3_0 = null;
        uj stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param4 instanceof gh) {
            stackOut_2_0 = (uj) param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (uj) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (gh) (Object) stackIn_3_0;
          if (var12 == null) {
            break L1;
          } else {
            param1 = param1 & var12.field_u;
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          ki.d(param0 + param4.field_s, param3 - -param4.field_j, param4.field_i, param4.field_f, ((ni) this).field_d);
          if (!param1) {
            break L2;
          } else {
            var7 = 16777215;
            break L2;
          }
        }
        L3: {
          var10 = 97 % ((2 - param2) / 54);
          var8 = param4.field_s + (param0 - -((ni) this).field_l);
          var9 = ((ni) this).field_g + param4.field_j + param3;
          ki.b(var8, var9, ((ni) this).field_b, ((ni) this).field_c, 5592405);
          ki.d(var8, var9, ((ni) this).field_b, ((ni) this).field_c, var7);
          if (!var12.field_z) {
            break L3;
          } else {
            ki.a(var8, var9, var8 + ((ni) this).field_b, var9 + ((ni) this).field_c, 1);
            ki.a(((ni) this).field_b + var8, var9, var8, ((ni) this).field_c + var9, 1);
            break L3;
          }
        }
        L4: {
          if (((ni) this).field_m != null) {
            var11 = ((ni) this).field_b + ((ni) this).field_l - -((ni) this).field_i;
            int discarded$1 = ((ni) this).field_m.a(param4.field_k, param4.field_s + (param0 - -var11), ((ni) this).field_a + (param4.field_j + param3), param4.field_i + (-((ni) this).field_i + -var11), -(((ni) this).field_i << -1392353151) + param4.field_f, ((ni) this).field_j, ((ni) this).field_e, ((ni) this).field_n, ((ni) this).field_h, 0);
            break L4;
          } else {
            break L4;
          }
        }
    }

    public static void a(int param0) {
        if (param0 >= -3) {
            return;
        }
        field_f = null;
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (param1 != null) {
          var2 = 0;
          var3 = param1.length();
          L0: while (true) {
            L1: {
              if (var3 <= var2) {
                break L1;
              } else {
                if (!dk.a((byte) -122, param1.charAt(var2))) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var2 >= var3) {
                  break L3;
                } else {
                  if (!dk.a((byte) -126, param1.charAt(var3 - 1))) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = -var2 + var3;
              if ((var4 ^ -1) <= -2) {
                if (12 >= var4) {
                  var5 = new StringBuilder(var4);
                  if (param0 >= 106) {
                    var6 = var2;
                    L4: while (true) {
                      if (var6 >= var3) {
                        if (var5.length() != 0) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      } else {
                        var7 = param1.charAt(var6);
                        if (dk.a((char) var7, (byte) 90)) {
                          var8 = pa.a((char) var7, -80);
                          if (var8 != 0) {
                            StringBuilder discarded$1 = var5.append(var8);
                            var6++;
                            continue L4;
                          } else {
                            var6++;
                            continue L4;
                          }
                        } else {
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    return null;
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
    }

    ni(qe param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((ni) this).field_n = 1;
        ((ni) this).field_h = 1;
        ((ni) this).field_l = param5;
        ((ni) this).field_g = param6;
        ((ni) this).field_d = param9;
        ((ni) this).field_i = param1;
        ((ni) this).field_c = param7;
        ((ni) this).field_e = param4;
        ((ni) this).field_b = param8;
        ((ni) this).field_a = param2;
        ((ni) this).field_m = param0;
        ((ni) this).field_j = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0;
        field_f = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
