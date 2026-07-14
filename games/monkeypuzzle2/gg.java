/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String field_b;
    private le[] field_a;

    final static String a(String[] args, String param1, boolean param2) {
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
        Object var12 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        var3 = param1.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param1.indexOf("<%", var5);
          if ((var6_int ^ -1) > -1) {
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = 0;
            L1: while (true) {
              var8 = param1.indexOf("<%", var5);
              if (0 > var8) {
                L2: {
                  StringBuilder discarded$3 = var6.append(param1.substring(var7));
                  if (param2) {
                    break L2;
                  } else {
                    var12 = null;
                    gg.a((int[]) null, 25, (byte[]) null, 86, -42);
                    break L2;
                  }
                }
                return var6.toString();
              } else {
                var5 = 2 + var8;
                L3: while (true) {
                  L4: {
                    if (var3 <= var5) {
                      break L4;
                    } else {
                      if (!re.a(-49, param1.charAt(var5))) {
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var9 = param1.substring(var8 - -2, var5);
                  if (!ra.a((CharSequence) (Object) var9, (byte) -128)) {
                    continue L1;
                  } else {
                    if (var5 >= var3) {
                      continue L1;
                    } else {
                      if (param1.charAt(var5) != 62) {
                        continue L1;
                      } else {
                        var5++;
                        var10 = vi.a(43, (CharSequence) (Object) var9);
                        StringBuilder discarded$4 = var6.append(param1.substring(var7, var8));
                        StringBuilder discarded$5 = var6.append(args[var10]);
                        var7 = var5;
                        continue L1;
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
                if (var5 >= var3) {
                  break L6;
                } else {
                  if (!re.a(-49, param1.charAt(var5))) {
                    break L6;
                  } else {
                    var5++;
                    continue L5;
                  }
                }
              }
              var7_ref = param1.substring(var6_int - -2, var5);
              if (!ra.a((CharSequence) (Object) var7_ref, (byte) 84)) {
                continue L0;
              } else {
                if (var3 <= var5) {
                  continue L0;
                } else {
                  if (62 == param1.charAt(var5)) {
                    var5++;
                    var8 = vi.a(61, (CharSequence) (Object) var7_ref);
                    var4 = var4 + (args[var8].length() - -var6_int - var5);
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int[] param0, int param1, byte[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param4 <= 71) {
            Object var8 = null;
            String discarded$0 = gg.a((String[]) null, (String) null, false);
        }
        for (var5 = 0; var5 < hb.field_l.length; var5++) {
            param3 = hb.field_l[var5];
            var6 = var5 << 1288141156;
            while (true) {
                param3--;
                if (-1 == (param3 ^ -1)) {
                    break;
                }
                var6++;
                param1 = dj.field_c[var6];
                param0[param2[param1]] = param0[param2[param1]] + 1;
                dj.field_c[param0[param2[param1]]] = param1;
            }
        }
    }

    public static void a(int param0) {
        if (param0 < 5) {
            field_b = null;
        }
        field_b = null;
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        lb.a(param1, param0, (byte) -123, ((gg) this).field_a, param3, param4);
        if (param2) {
            ((gg) this).field_a = null;
        }
    }

    final static int c(int param0) {
        if (param0 != 0) {
            field_b = null;
        }
        return (int)(1000000000L / ed.field_d);
    }

    final static dk b(int param0) {
        if (param0 != -11451) {
            return null;
        }
        if (null == ok.field_f) {
            ok.field_f = new dk();
            ok.field_f.a(t.field_z, false);
            ok.field_f.field_m = pf.field_c;
            ok.field_f.field_p = 6;
            ok.field_f.field_f = 4;
            ok.field_f.field_b = 14;
            ok.field_f.field_r = 7697781;
            ok.field_f.field_k = 0;
            ok.field_f.field_n = 5;
            ok.field_f.field_s = 2763306;
        }
        return ok.field_f;
    }

    gg(le[] param0) {
        ((gg) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Log in / Create account";
    }
}
