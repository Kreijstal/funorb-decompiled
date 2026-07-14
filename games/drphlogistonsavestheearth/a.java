/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    private String field_d;
    static jb field_g;
    static java.math.BigInteger field_b;
    static String field_c;
    static byte[][] field_e;
    static String[] field_a;
    private boolean field_h;
    static String field_f;
    static int field_i;

    final static he a(he param0, int[] param1, byte param2) {
        he var3 = new he(0, 0, 0);
        var3.field_m = param0.field_m;
        var3.field_c = param0.field_c;
        var3.field_f = param0.field_f;
        var3.field_d = param0.field_d;
        if (param2 != -122) {
            Object var4 = null;
            String discarded$0 = a.a(-35, (String) null, (String[]) null);
        }
        var3.field_l = param1;
        var3.field_a = param0.field_a;
        var3.field_k = param0.field_k;
        var3.field_h = param0.field_h;
        return var3;
    }

    final String c(int param0) {
        int var2 = 73 % ((29 - param0) / 37);
        return ((a) this).field_d;
    }

    final boolean a(byte param0) {
        if (param0 > -107) {
            return false;
        }
        return ((a) this).field_h;
    }

    final static void a(int param0, int param1, byte param2) {
        ji.field_f = param1;
        sa.field_f = param0;
        int var3 = -90 % ((param2 - 7) / 57);
    }

    public static void b(int param0) {
        if (param0 != 2) {
            return;
        }
        field_g = null;
        field_b = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_e = null;
    }

    a(String param0) {
        this(param0, false);
    }

    final static String a(int param0, String param1, String[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var3 = param1.length();
          var4 = var3;
          if (param0 == 5044) {
            break L0;
          } else {
            a.a((byte) -22, false);
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          var6_int = param1.indexOf("<%", var5);
          if (0 > var6_int) {
            var6 = new StringBuilder(var4);
            var5 = 0;
            var7 = 0;
            L2: while (true) {
              var8 = param1.indexOf("<%", var5);
              if (-1 < (var8 ^ -1)) {
                StringBuilder discarded$3 = var6.append(param1.substring(var7));
                return var6.toString();
              } else {
                var5 = 2 + var8;
                L3: while (true) {
                  L4: {
                    if (var5 >= var3) {
                      break L4;
                    } else {
                      if (!lb.a(param1.charAt(var5), true)) {
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var9 = param1.substring(2 + var8, var5);
                  if (!jf.a((CharSequence) (Object) var9, 7552)) {
                    continue L2;
                  } else {
                    if (var3 <= var5) {
                      continue L2;
                    } else {
                      if (62 != param1.charAt(var5)) {
                        continue L2;
                      } else {
                        var5++;
                        var10 = hh.a(param0 + -5034, (CharSequence) (Object) var9);
                        StringBuilder discarded$4 = var6.append(param1.substring(var7, var8));
                        StringBuilder discarded$5 = var6.append(param2[var10]);
                        var7 = var5;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          } else {
            var5 = 2 + var6_int;
            L5: while (true) {
              L6: {
                if (var3 <= var5) {
                  break L6;
                } else {
                  if (!lb.a(param1.charAt(var5), true)) {
                    break L6;
                  } else {
                    var5++;
                    continue L5;
                  }
                }
              }
              var7_ref = param1.substring(var6_int + 2, var5);
              if (jf.a((CharSequence) (Object) var7_ref, 7552)) {
                if (var5 >= var3) {
                  continue L1;
                } else {
                  if (62 == param1.charAt(var5)) {
                    var5++;
                    var8 = hh.a(10, (CharSequence) (Object) var7_ref);
                    var4 = var4 + (param2[var8].length() + (var6_int + -var5));
                    continue L1;
                  } else {
                    continue L1;
                  }
                }
              } else {
                continue L1;
              }
            }
          }
        }
    }

    final static boolean a(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == -27365) {
            break L0;
          } else {
            field_f = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (!aj.field_e) {
                break L3;
              } else {
                if (vi.field_c == null) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (!oh.a(param0 + 27365)) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              break L2;
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = -114 / ((37 - param0) / 59);
        ng.field_c.a(0, 0, 0);
    }

    a(String param0, boolean param1) {
        ((a) this).field_d = param0;
        ((a) this).field_h = param1 ? true : false;
        if (((a) this).field_d == null) {
            ((a) this).field_d = "";
        }
        if (0 == ((a) this).field_d.length()) {
            ((a) this).field_h = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_b = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_f = "Get ready!";
    }
}
