/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class le {
    static tc field_e;
    static String field_a;
    static String field_c;
    static int field_b;
    static bi field_d;

    abstract void a(byte[] param0, byte param1);

    final static boolean a(int param0, int param1, boolean param2) {
        StringBuilder discarded$0 = null;
        int var3;
        String var4_ref_String;
        int var4;
        int var5;
        String var7;
        String var8;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var20;
        String var47;
        String var48;
        String var49;
        String var50;
        String var51;
        String var52;
        String var53;
        String var54;
        String var55;
        String var56;
        String var57;
        String var58;
        String var59;
        Object var60;
        CharSequence var61;
        int var5Lifetime1;
        String var59Lifetime1;
        var60 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = 1;
        if (!ShatteredPlansClient.field_K &&
          fa.field_X == null) {
          var3 = 0;
        }
        if (em.field_h == 0 &&
          he.field_p != null) {
          var3 = 0;
        }
        if (2 == em.field_h &&
          !lh.e((byte) 53)) {
          var3 = 0;
        }
        if (oq.field_j == 84) {
          if (var3 == 0) {
            if (em.field_h == 0) {
              return true;
            }
            qq.c(false);
            return true;
          }
          if (cg.field_E.length() <= 0) {
            qq.c(param2);
          } else {
            var4_ref_String = cg.field_E.toString();
            if (af.a(var4_ref_String, 0)) {
              var13 = (String) null;
              var12 = (String) null;
              md.a(2, pr.field_e, 0, (String) null, (String) null, -16169);
              var15 = (String) null;
              var14 = (String) null;
              md.a(2, go.field_K, 0, (String) null, (String) null, -16169);
              qq.c(param2);
              return true;
            }
            var5 = em.field_h;
            if (var5 == 0 &&
              null != np.field_a) {
              var5 = 1;
            }
            if (id.a(-7019, var5) == 2) {
              gb.a((byte) 91, param0, 1, var5);
              ih.a(gi.field_a, 2, -1, em.field_h, var4_ref_String, param1);
              qq.c(param2);
              return true;
            }
            ih.a(gi.field_a, 2, -1, em.field_h, var4_ref_String, param1);
            qq.c(param2);
          }
          return true;
        }
        if (oq.field_j == 85) {
          if (var3 == 0) {
            return true;
          }
          if (cg.field_E.length() <= 0) {
            return true;
          }
          aj.a(cg.field_E, cg.field_E.length() - 1, 83, ' ');
          return true;
        }
        var4 = ho.field_h;
        if (!nb.a((char) var4, 99)) {
          if (!param2) {
            return false;
          }
          le.a(36);
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (cg.field_E.length() >= 80) {
          return true;
        }
        discarded$0 = cg.field_E.append((char) var4);
        var5Lifetime1 = 485;
        var17 = ln.field_o;
        var16 = v.a(var17, (byte) 17);
        var18 = var16;
        if (em.field_h == 2) {
          var61 = (CharSequence) ((Object) gi.field_a);
          var20 = re.a(fj.field_q, 4371, new String[]{ih.a(var61, -117)});
          var8 = re.a(cf.field_M, 4371, new String[]{var16});
          var9 = ho.field_f.c(var20);
          var10 = ho.field_f.c(var8);
          if (var9 <= var10) {
            var5Lifetime1 = var5Lifetime1 - var10;
            if (var5Lifetime1 < ho.field_f.c(cg.field_E.toString())) {
              aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
            }
            return true;
          }
          var5Lifetime1 = var5Lifetime1 - var9;
        } else {
          var7 = "";
          if (0 != em.field_h) {
            var59 = var7 + var18 + ": ";
            var5Lifetime1 = var5Lifetime1 - ho.field_f.c(var59);
            if (var5Lifetime1 < ho.field_f.c(cg.field_E.toString())) {
              aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
            }
            return true;
          }
          if (null == np.field_a) {
            if (!je.field_e) {
              if (null == np.field_a) {
                var47 = var7 + var18 + ": ";
                var5Lifetime1 = var5Lifetime1 - ho.field_f.c(var47);
                if (var5Lifetime1 >= ho.field_f.c(cg.field_E.toString())) {
                  return true;
                }
                aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
                return true;
              }
              if (!i.field_c) {
                var50 = "[" + re.a(he.field_q, 4371, new String[]{np.field_a.field_Xb}) + "] ";
                var51 = var50 + var18 + ": ";
                var5Lifetime1 = var5Lifetime1 - ho.field_f.c(var51);
                if (var5Lifetime1 < ho.field_f.c(cg.field_E.toString())) {
                  aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
                }
                return true;
              }
              if (wf.field_m == null) {
                var48 = "[" + re.a(he.field_q, 4371, new String[]{np.field_a.field_Xb}) + "] ";
                var49 = var48 + var18 + ": ";
                var5Lifetime1 = var5Lifetime1 - ho.field_f.c(var49);
                if (var5Lifetime1 < ho.field_f.c(cg.field_E.toString())) {
                  aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
                }
                return true;
              }
              var52 = "[" + wf.field_m + "] ";
              var53 = var52 + var18 + ": ";
              var5Lifetime1 = var5Lifetime1 - ho.field_f.c(var53);
              if (var5Lifetime1 < ho.field_f.c(cg.field_E.toString())) {
                aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
              }
              return true;
            }
            var7 = "[" + ds.field_a + "] ";
          }
          if (null != np.field_a) {
            if (!i.field_c) {
              var57 = "[" + re.a(he.field_q, 4371, new String[]{np.field_a.field_Xb}) + "] ";
              var58 = var57 + var18 + ": ";
              var5Lifetime1 = var5Lifetime1 - ho.field_f.c(var58);
              if (var5Lifetime1 < ho.field_f.c(cg.field_E.toString())) {
                aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
              }
              return true;
            }
            if (wf.field_m == null) {
              var55 = "[" + re.a(he.field_q, 4371, new String[]{np.field_a.field_Xb}) + "] ";
              var56 = var55 + var18 + ": ";
              var5Lifetime1 = var5Lifetime1 - ho.field_f.c(var56);
              if (var5Lifetime1 < ho.field_f.c(cg.field_E.toString())) {
                aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
              }
              return true;
            }
            var7 = "[" + wf.field_m + "] ";
            var59Lifetime1 = var7 + var18 + ": ";
            var5Lifetime1 = var5Lifetime1 - ho.field_f.c(var59Lifetime1);
            if (var5Lifetime1 < ho.field_f.c(cg.field_E.toString())) {
              aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
            }
            return true;
          }
          var54 = var7 + var18 + ": ";
          var5Lifetime1 = var5Lifetime1 - ho.field_f.c(var54);
        }
        if (var5Lifetime1 >= ho.field_f.c(cg.field_E.toString())) {
          return true;
        }
        aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
        return true;
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        if (param0 < 119) {
          field_b = -98;
          field_a = null;
          return;
        }
        field_a = null;
    }

    abstract byte[] a(boolean param0);

    static {
        field_a = "Waiting for music";
        field_c = "Rated game";
    }
}
