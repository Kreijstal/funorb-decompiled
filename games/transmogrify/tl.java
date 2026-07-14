/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static boolean field_a;
    static int field_c;
    private wf field_b;
    private qj field_e;
    static int field_d;

    final wf a(wf param0, boolean param1) {
        wf var3 = null;
        if (param0 == null) {
            var3 = ((tl) this).field_e.field_d.field_f;
        } else {
            var3 = param0;
        }
        if (!(((tl) this).field_e.field_d != var3)) {
            ((tl) this).field_b = null;
            return null;
        }
        ((tl) this).field_b = var3.field_f;
        if (!param1) {
            return null;
        }
        return var3;
    }

    final wf a(byte param0) {
        wf var2 = ((tl) this).field_e.field_d.field_f;
        if (!(var2 != ((tl) this).field_e.field_d)) {
            ((tl) this).field_b = null;
            return null;
        }
        ((tl) this).field_b = var2.field_f;
        if (param0 != 62) {
            field_d = 49;
        }
        return var2;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Transmogrify.field_A ? 1 : 0;
          var3 = 0;
          var4 = qa.field_u;
          if (param0 == 196077633) {
            break L0;
          } else {
            String discarded$2 = tl.a(-62, -114L);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 >= qb.field_f.length) {
            return -1;
          } else {
            var5 = ce.field_a[var3];
            if ((var5 ^ -1) > -1) {
              var4 = var4 + fi.field_x;
              var3++;
              continue L1;
            } else {
              var6 = uc.a(qb.field_f[var3], false, true);
              var7 = -(var6 >> 169624193) + wd.field_j;
              var4 = var4 + ee.field_D;
              if (!q.a(param2, (byte) 12, var4, (jl.field_o << 315628225) + hi.field_c, param1, var7 + -vh.field_m, var6 - -(vh.field_m << 196077633))) {
                var4 = var4 + (ee.field_D + ((jl.field_o << 405142401) - -hi.field_c));
                var3++;
                continue L1;
              } else {
                return var5;
              }
            }
          }
        }
    }

    final wf c(int param0) {
        wf var2 = ((tl) this).field_e.field_d.field_b;
        if (var2 == ((tl) this).field_e.field_d) {
            ((tl) this).field_b = null;
            return null;
        }
        if (param0 >= -86) {
            wf discarded$0 = ((tl) this).b(116);
        }
        ((tl) this).field_b = var2.field_b;
        return var2;
    }

    final wf a(wf param0, int param1) {
        wf var3 = null;
        if (param0 == null) {
            var3 = ((tl) this).field_e.field_d.field_b;
        } else {
            var3 = param0;
        }
        if (!(var3 != ((tl) this).field_e.field_d)) {
            ((tl) this).field_b = null;
            return null;
        }
        ((tl) this).field_b = var3.field_b;
        if (param1 != 95) {
            Object var4 = null;
            q discarded$0 = tl.a((String) null, 56);
        }
        return var3;
    }

    final static String a(int param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = Transmogrify.field_A ? 1 : 0;
        if (param1 <= 0L) {
            return null;
        }
        if (6582952005840035281L <= param1) {
            return null;
        }
        if ((param1 % 37L ^ -1L) == -1L) {
            return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (var4 != 0L) {
            var3++;
            var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (-1L != (param1 ^ -1L)) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = cc.field_g[(int)(-(param1 * 37L) + var7)];
            if (!(var9 != 95)) {
                var10 = -1 + var6.length();
                var9 = 160;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            StringBuilder discarded$0 = var6.append(var9);
        }
        StringBuilder discarded$5 = var6.reverse();
        if (param0 != 11468) {
            field_d = 39;
        }
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final static q a(String param0, int param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        q var5 = null;
        L0: {
          if (param0 == null) {
            break L0;
          } else {
            if (param0.length() != 0) {
              var2 = param0.indexOf('@');
              if ((var2 ^ -1) == 0) {
                return ai.field_a;
              } else {
                var3 = param0.substring(0, var2);
                var4 = param0.substring(var2 + 1);
                var5 = lb.a(var3, 5507);
                if (param1 == 2993) {
                  if (var5 != null) {
                    return var5;
                  } else {
                    return mh.a(var4, 46);
                  }
                } else {
                  return null;
                }
              }
            } else {
              break L0;
            }
          }
        }
        return cj.field_b;
    }

    final static am a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        am var9 = new am(param7, param6, param8, param0, param4, param5, param2);
        ec.field_b.a((wf) (Object) var9, -104);
        ei.a(true, param3, var9);
        if (param1 <= 31) {
            field_a = true;
        }
        return var9;
    }

    final wf a(int param0) {
        wf var2 = ((tl) this).field_b;
        if (((tl) this).field_e.field_d == var2) {
            ((tl) this).field_b = null;
            return null;
        }
        if (param0 != 405142401) {
            ((tl) this).field_e = null;
        }
        ((tl) this).field_b = var2.field_b;
        return var2;
    }

    final wf b(int param0) {
        if (param0 != -29339) {
            return null;
        }
        wf var2 = ((tl) this).field_b;
        if (var2 == ((tl) this).field_e.field_d) {
            ((tl) this).field_b = null;
            return null;
        }
        ((tl) this).field_b = var2.field_f;
        return var2;
    }

    tl(qj param0) {
        ((tl) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
