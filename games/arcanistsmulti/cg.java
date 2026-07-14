/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends kc {
    kc field_Cb;
    kc field_Gb;
    int field_Vb;
    int field_Eb;
    kc field_Fb;
    static eh field_Wb;
    kc field_Ub;
    int field_Bb;
    int field_Mb;
    boolean field_Kb;
    kc field_Hb;
    long field_Nb;
    static int field_Lb;
    long field_Ob;
    boolean field_Jb;
    String field_Tb;
    static String field_Rb;
    int field_Sb;
    static qb field_Ib;
    int field_Pb;
    boolean field_Db;
    String field_Qb;

    final void a(String param0, String param1, int param2) {
        int var4 = 41 / ((param2 - -52) / 53);
        ((cg) this).field_Qb = param1;
        ((cg) this).field_Tb = param0;
        CharSequence var5 = (CharSequence) (Object) ((cg) this).field_Tb;
        String discarded$0 = gk.a(var5, -13);
    }

    final static boolean a(byte param0, uj param1, uj param2) {
        if (param2.field_g < param1.field_g) {
            return true;
        }
        if (param0 != -111) {
            cg.f(-126);
        }
        if (param1.field_g == param2.field_g) {
            if (param1.field_e <= param2.field_e) {
                return false;
            }
            return true;
        }
        return false;
    }

    final static void f(int param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        vg var4_ref_vg = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        vg var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        an.field_e = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = oo.field_u.length;
        var23 = new int[var1];
        var22 = var23;
        var21 = var22;
        var20 = var21;
        var2 = var20;
        var3 = 0;
        L0: while (true) {
          if (var1 <= var3) {
            L1: {
              var3 = an.field_e[9] >> 351390088;
              var4 = an.field_e[10] >> 1217747432;
              var5 = an.field_e[11] >> 605730280;
              var6 = gi.field_a << 2144533828;
              var7 = 0;
              var8 = of.a(param0 + -252566934, var6) >> 1983485064;
              var9 = j.a(var6, -108) >> -381690808;
              if (an.field_g == -1) {
                break L1;
              } else {
                if (0 == (me.field_I ^ -1)) {
                  break L1;
                } else {
                  var7 = -320 + an.field_g;
                  var9 = -128;
                  var8 = 240 + -me.field_I;
                  break L1;
                }
              }
            }
            L2: {
              var10 = 256.0 / Math.sqrt((double)(var8 * var8 + (var7 * var7 + var9 * var9)));
              var9 = (int)((double)var9 * var10);
              var8 = (int)((double)var8 * var10);
              var7 = (int)((double)var7 * var10);
              var12 = -var3 + var7;
              var13 = -var4 + var8;
              var14 = -var5 + var9;
              if (param0 == 252566882) {
                break L2;
              } else {
                cg.e(false);
                break L2;
              }
            }
            var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var12 * var12 - -(var13 * var13)));
            var13 = (int)((double)var13 * var10);
            var14 = (int)((double)var14 * var10);
            var12 = (int)((double)var12 * var10);
            var15 = 0;
            L3: while (true) {
              if (oo.field_u.length <= var15) {
                return;
              } else {
                var16 = 0;
                var17_int = 1;
                L4: while (true) {
                  if (oo.field_u.length <= var17_int) {
                    var23[var16] = -2147483648;
                    var17 = oo.field_u[var16];
                    sc.b(var16, param0 ^ 252570192);
                    var18 = 0;
                    L5: while (true) {
                      if ((var18 ^ -1) <= -4) {
                        to.a((byte) -61, an.field_e, tn.field_Gb, true, var17, false, false);
                        cj.a(var8, var13, var12, 20133, var17, var9, var7, var14);
                        var15++;
                        continue L3;
                      } else {
                        tn.field_Gb[var18] = tn.field_Gb[var18] + gn.field_g[var15][var18];
                        var18++;
                        continue L5;
                      }
                    }
                  } else {
                    if (var23[var17_int] > var23[var16]) {
                      var16 = var17_int;
                      var17_int++;
                      continue L4;
                    } else {
                      var17_int++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            var4_ref_vg = oo.field_u[var3];
            var4_ref_vg.b((byte) 62);
            sc.b(var3, 14130);
            var5 = var4_ref_vg.field_k + var4_ref_vg.field_i >> 183874081;
            var6 = var4_ref_vg.field_v + var4_ref_vg.field_R >> -609165919;
            var7 = var4_ref_vg.field_N + var4_ref_vg.field_P >> 1067775105;
            var8 = an.field_e[9] >> -921206142;
            var9 = an.field_e[10] >> 95407906;
            var10_int = an.field_e[11] >> 252566882;
            var11 = var9 * tn.field_Gb[4] + (var8 * tn.field_Gb[3] + tn.field_Gb[5] * var10_int) >> -1159767634;
            var12 = var10_int * tn.field_Gb[8] + tn.field_Gb[6] * var8 - -(tn.field_Gb[7] * var9) >> -1623403634;
            var13 = var10_int * tn.field_Gb[11] + var8 * tn.field_Gb[9] + tn.field_Gb[10] * var9 >> -1892105426;
            var2[var3] = var13 * var7 + (var6 * var12 + var11 * var5) >> 1435692816;
            var3++;
            continue L0;
          }
        }
    }

    public static void e(boolean param0) {
        field_Rb = null;
        if (!param0) {
            return;
        }
        field_Wb = null;
        field_Ib = null;
    }

    cg(String param0, String param1, long param2) {
        super(0L, (kc) null);
        ((cg) this).field_Nb = param2;
        ((cg) this).field_Qb = param1;
        ((cg) this).field_Tb = param0;
        CharSequence var6 = (CharSequence) (Object) ((cg) this).field_Tb;
        String discarded$0 = gk.a(var6, -13);
    }

    final boolean a(byte param0, cg param1) {
        if ((!param1.field_Kb ? 1 : 0) == (((cg) this).field_Kb ? 1 : 0)) {
            return ((cg) this).field_Kb;
        }
        if (param0 != 121) {
            ((cg) this).field_Sb = 21;
        }
        if ((!((cg) this).field_Db ? 1 : 0) != (!param1.field_Db ? 1 : 0)) {
            return ((cg) this).field_Db;
        }
        return (((cg) this).field_Ob ^ -1L) > (param1.field_Ob ^ -1L) ? true : false;
    }

    final static qb a(String param0, byte param1, eg param2, String param3) {
        if (param1 < 102) {
            field_Lb = 88;
        }
        int var4 = param2.c(param3, -79);
        int var5 = param2.a(param0, (byte) 54, var4);
        return hj.a(var4, param2, var5, (byte) -10);
    }

    final boolean e(int param0) {
        if (param0 != 183874081) {
            Object var3 = null;
            ((cg) this).a((String) null, (String) null, 2);
        }
        return !((cg) this).d((byte) -17) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Rb = "You have not yet unlocked this option for use.";
        field_Wb = new eh();
    }
}
