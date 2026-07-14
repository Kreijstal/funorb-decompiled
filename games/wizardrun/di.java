/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    private gj field_b;
    private int field_f;
    private de field_d;
    static String field_a;
    private int field_c;
    static boolean[] field_g;
    static int field_e;

    final Object a(byte param0, long param1) {
        ag var6 = null;
        ig var7 = (ig) (Object) ((di) this).field_b.a(false, param1);
        if (var7 == null) {
            return null;
        }
        Object var5 = var7.e(1);
        if (param0 < 60) {
            Object discarded$0 = ((di) this).a((byte) 14, 32L);
        }
        if (!(var5 != null)) {
            var7.a(false);
            var7.b(false);
            ((di) this).field_c = ((di) this).field_c + var7.field_p;
            return null;
        }
        if (var7.d(-9861)) {
            var6 = new ag(var5, var7.field_p);
            ((di) this).field_b.a(var7.field_e, (wl) (Object) var6, (byte) -106);
            ((di) this).field_d.a((rk) (Object) var6, 10);
            ((ig) (Object) var6).field_o = 0L;
            var7.a(false);
            var7.b(false);
        } else {
            ((di) this).field_d.a((rk) (Object) var7, 10);
            var7.field_o = 0L;
        }
        return var5;
    }

    public static void b(byte param0) {
        field_a = null;
        int var1 = 4 / ((param0 - 15) / 62);
        field_g = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        Object var4 = null;
        ai.a(param1, (byte) 126, (String) null, param0);
        if (param2 <= 106) {
            String discarded$0 = di.a(-92L, -11);
        }
    }

    final void a(long param0, int param1, Object param2) {
        this.a((byte) -30, param1, param0, param2);
    }

    final static String a(String[] args, byte param1, String param2) {
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
        var11 = wizardrun.field_H;
        var3 = param2.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param2.indexOf("<%", var5);
          if (0 > var6_int) {
            var6 = new StringBuilder(var4);
            if (param1 >= 24) {
              var7 = 0;
              var5 = 0;
              L1: while (true) {
                var8 = param2.indexOf("<%", var5);
                if (0 <= var8) {
                  var5 = var8 - -2;
                  L2: while (true) {
                    L3: {
                      if (var5 >= var3) {
                        break L3;
                      } else {
                        if (!vl.a(param2.charAt(var5), -5717)) {
                          break L3;
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    }
                    var9 = param2.substring(2 + var8, var5);
                    if (af.a((CharSequence) (Object) var9, (byte) 78)) {
                      if (var5 >= var3) {
                        continue L1;
                      } else {
                        if (62 != param2.charAt(var5)) {
                          continue L1;
                        } else {
                          var5++;
                          var10 = ph.a(1124, (CharSequence) (Object) var9);
                          StringBuilder discarded$3 = var6.append(param2.substring(var7, var8));
                          var7 = var5;
                          StringBuilder discarded$4 = var6.append(args[var10]);
                          continue L1;
                        }
                      }
                    } else {
                      continue L1;
                    }
                  }
                } else {
                  StringBuilder discarded$5 = var6.append(param2.substring(var7));
                  return var6.toString();
                }
              }
            } else {
              return null;
            }
          } else {
            var5 = 2 + var6_int;
            L4: while (true) {
              L5: {
                if (var3 <= var5) {
                  break L5;
                } else {
                  if (!vl.a(param2.charAt(var5), -5717)) {
                    break L5;
                  } else {
                    var5++;
                    continue L4;
                  }
                }
              }
              var7_ref = param2.substring(var6_int - -2, var5);
              if (!af.a((CharSequence) (Object) var7_ref, (byte) 78)) {
                continue L0;
              } else {
                if (var3 <= var5) {
                  continue L0;
                } else {
                  if (param2.charAt(var5) != 62) {
                    continue L0;
                  } else {
                    var5++;
                    var8 = ph.a(1124, (CharSequence) (Object) var7_ref);
                    var4 = var4 + (args[var8].length() + -var5 + var6_int);
                    continue L0;
                  }
                }
              }
            }
          }
        }
    }

    final static String a(long param0, int param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = wizardrun.field_H;
        if ((param0 ^ -1L) >= -1L) {
            return null;
        }
        if (-6582952005840035282L >= (param0 ^ -1L)) {
            return null;
        }
        if ((param0 % 37L ^ -1L) == -1L) {
            return null;
        }
        if (param1 < 32) {
            di.a(true, false, -92);
        }
        int var3 = 0;
        long var4 = param0;
        while (var4 != 0L) {
            var3++;
            var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while ((param0 ^ -1L) != -1L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = jk.field_c[(int)(-(37L * param0) + var7)];
            if (!(var9 != 95)) {
                var10 = -1 + var6.length();
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            StringBuilder discarded$0 = var6.append(var9);
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = wizardrun.field_H;
        mg var1 = n.field_b;
        if (param0 != 8) {
            field_g = null;
        }
        while (ac.a((byte) 125)) {
            var1.c((byte) 49, 8);
            var1.field_m = var1.field_m + 1;
            var2 = var1.field_m + 1;
            kb.a(39, var1);
            n.field_b.a(-var2 + var1.field_m, -57);
        }
    }

    private final void b(long param0, int param1) {
        if (param1 <= 75) {
            this.b(26L, 18);
        }
        ig var4 = (ig) (Object) ((di) this).field_b.a(false, param0);
        this.a(var4, -111);
    }

    private final void a(ig param0, int param1) {
        if (param0 != null) {
            param0.a(false);
            param0.b(false);
            ((di) this).field_c = ((di) this).field_c + param0.field_p;
        }
        if (param1 >= -16) {
            Object var4 = null;
            String discarded$0 = di.a((String[]) null, (byte) -84, (String) null);
        }
    }

    private di() throws Throwable {
        throw new Error();
    }

    final static void a(of param0, int param1, byte param2) {
        if (param2 > -71) {
            return;
        }
        mg var3 = n.field_b;
        var3.c((byte) 124, param1);
        var3.b((byte) 11, param0.field_j);
        var3.b((byte) 11, param0.field_i);
    }

    final static void a(byte param0) {
        if (!(ki.field_E != null)) {
            return;
        }
        ka.a((java.awt.Canvas) (Object) ki.field_E, 8053);
        ki.field_E.a(ld.field_g, (byte) 19);
        ki.field_E = null;
        if (!(oa.field_c == null)) {
            oa.field_c.a(127);
        }
        wizardrun.field_G.requestFocus();
        if (param0 != 60) {
            field_g = null;
        }
    }

    private final void a(byte param0, int param1, long param2, Object param3) {
        ig var6 = null;
        int var7 = wizardrun.field_H;
        if (param0 != -30) {
            return;
        }
        if (param1 > ((di) this).field_f) {
            throw new IllegalStateException();
        }
        this.b(param2, 104);
        ((di) this).field_c = ((di) this).field_c - param1;
        while (((di) this).field_c < 0) {
            var6 = (ig) (Object) ((di) this).field_d.b((byte) -115);
            this.a(var6, -26);
        }
        ag var6_ref = new ag(param3, param1);
        ((di) this).field_b.a(param2, (wl) (Object) var6_ref, (byte) -117);
        ((di) this).field_d.a((rk) (Object) var6_ref, 10);
        ((ig) (Object) var6_ref).field_o = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please enter your age in years";
        field_e = 2;
    }
}
