/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vm extends qr {
    private int field_xb;
    static int field_Bb;
    private int field_Eb;
    private int field_Qb;
    private vm field_Ob;
    private sg[] field_Kb;
    private int field_Mb;
    static qr field_Cb;
    static boolean field_Nb;
    static String field_Lb;
    private int field_Ib;
    private int field_Pb;
    static String field_Fb;
    private char[] field_zb;
    private int[] field_Hb;
    private int field_Db;
    private vm[] field_yb;
    private int field_Gb;
    static qr field_Ab;
    static bi field_Jb;

    final void h(int param0) {
        int var3 = 0;
        sg var4 = null;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        sg[] var6 = ((vm) this).field_Kb;
        sg[] var2 = var6;
        for (var3 = param0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_rb = 0;
            var4.field_bb = false;
        }
        if (!(null == ((vm) this).field_Ob)) {
            ((vm) this).field_Ob.h(0);
            ((vm) this).field_Ob.b((byte) -128);
        }
        ((vm) this).field_Ob = null;
        ((vm) this).field_Gb = -1;
        this.c(false, 12);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = ShatteredPlansClient.field_F ? 1 : 0;
        ((vm) this).field_Eb = ((vm) this).field_Ib + param1 * 2;
        ((vm) this).a(((vm) this).field_Eb, ((vm) this).field_xb, (byte) 77, param5 + -((vm) this).field_xb, param3);
        if (((vm) this).field_Mb != param2) {
            ((vm) this).field_Mb = param2;
            this.c(false, ((vm) this).field_Db);
        }
        for (var7 = 0; ((vm) this).field_Pb > var7; var7++) {
            ((vm) this).field_Kb[var7].a(50, ((vm) this).field_Qb, ((vm) this).field_Kb[var7].field_db, param1, param4, ((vm) this).field_Eb, 0);
        }
        if (((vm) this).field_Gb != param0) {
            if (!(((vm) this).field_yb[((vm) this).field_Gb] == null)) {
                var7 = ((vm) this).field_yb[((vm) this).field_Gb].field_Pb;
                var8 = ((vm) this).field_Qb * (var7 + ((vm) this).field_Gb) + ((vm) this).field_db;
                while (param5 < var8) {
                    var8 = var8 - ((vm) this).field_Qb;
                }
                ((vm) this).field_yb[((vm) this).field_Gb].a(-1, param1, ((vm) this).field_Kb[((vm) this).field_Gb].field_N, param3 + ((vm) this).field_Eb, param4, var8);
            }
        }
    }

    final static int a(String param0, int param1, boolean param2) {
        if (param1 != 0) {
            vm.g(-38);
        }
        if (param2) {
            return ql.field_n.c(param0);
        }
        return um.field_c.c(param0);
    }

    final int g(boolean param0) {
        if (param0) {
            this.c(true, -94);
        }
        return ((vm) this).field_Eb + (((vm) this).field_Ob != null ? ((vm) this).field_Ob.g(param0) : 0);
    }

    final void a(int param0, int param1, byte param2) {
        int var4_int = 0;
        vm var4 = null;
        sg var5 = null;
        int var6 = 0;
        vm var7 = null;
        sg stackIn_5_0 = null;
        sg stackIn_6_0 = null;
        sg stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        sg stackOut_4_0 = null;
        sg stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        sg stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var4_int = 0;
        L0: while (true) {
          if (((vm) this).field_Kb.length <= var4_int) {
            L1: {
              if (param2 <= -101) {
                break L1;
              } else {
                vm.g(96);
                break L1;
              }
            }
            L2: {
              if ((((vm) this).field_Gb ^ -1) == 0) {
                break L2;
              } else {
                var7 = ((vm) this).field_yb[((vm) this).field_Gb];
                var4 = var7;
                if (var4 != null) {
                  var7.a(param0, param1, (byte) -121);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (-1 > (((vm) this).field_Db ^ -1)) {
                this.c(false, -1 + ((vm) this).field_Db);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            var5 = ((vm) this).field_Kb[var4_int];
            if (1 == var5.field_rb) {
              L4: {
                this.a(0, param1, var4_int, param0);
                stackOut_4_0 = (sg) var5;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (((vm) this).field_Gb != var4_int) {
                  stackOut_6_0 = (sg) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L4;
                } else {
                  stackOut_5_0 = (sg) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L4;
                }
              }
              stackIn_7_0.field_bb = stackIn_7_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final static String a(long param0, int param1) {
        i.field_e.setTime(new Date(param0));
        int var3 = i.field_e.get(7);
        int var4 = i.field_e.get(5);
        int var5 = i.field_e.get(2);
        if (param1 != 10) {
            return null;
        }
        int var6 = i.field_e.get(1);
        int var7 = i.field_e.get(11);
        int var8 = i.field_e.get(12);
        int var9 = i.field_e.get(13);
        return j.field_q[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + qa.field_o[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 0) {
            field_Lb = null;
        }
        if (((vm) this).field_Gb == param2) {
            ((vm) this).h(0);
            this.c(false, 0);
        } else {
            if (null != ((vm) this).field_yb[param2]) {
                ((vm) this).h(0);
                this.c(false, 0);
                ((vm) this).field_Gb = param2;
                ((vm) this).field_Ob = ((vm) this).field_yb[((vm) this).field_Gb];
                ee.a(((vm) this).field_Ob, true);
                ((vm) this).field_Ob.c(false, 12);
            } else {
                if (0 != (((vm) this).field_Hb[param2] ^ -1)) {
                    var5 = 32768 | ((vm) this).field_Hb[param2];
                    var6 = em.field_h;
                    if (var6 == 0) {
                        if (!(null == np.field_a)) {
                            var6 = 1;
                        }
                    }
                    if (2 == id.a(-7019, var6)) {
                        gb.a((byte) 75, param1, 1, var6);
                    }
                    Object var8 = null;
                    ih.a(gi.field_a, 2, var5, em.field_h, (String) null, param3);
                    un.a(gi.field_a, (byte) 123, hd.field_k, em.field_h, var5);
                    jp.g((byte) 119);
                    dc.a(-5883);
                } else {
                    mm.d(param0 ^ -16705);
                    jp.g((byte) 119);
                }
            }
        }
    }

    private final void c(boolean param0, int param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        ((vm) this).field_Db = param1;
        if (param0) {
            field_Bb = 20;
        }
        for (var5 = 0; ((vm) this).field_Pb > var5; var5++) {
            var3 = ((vm) this).field_Qb * var5;
            var4 = ((vm) this).field_Db * ((vm) this).field_Db;
            ((vm) this).field_Kb[var5].field_db = ((-((vm) this).field_N + ((vm) this).field_Mb) * var4 + var3 * (144 - var4)) / 144;
        }
    }

    final boolean f(boolean param0) {
        int var4 = 0;
        sg var5 = null;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = param0 ? 1 : 0;
        sg[] var3 = ((vm) this).field_Kb;
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var2 = var2 | (-1 != (var5.field_rb ^ -1) ? 1 : 0);
        }
        if (var2 == 0) {
            if ((((vm) this).field_Gb ^ -1) != 0) {
                if (!(null == ((vm) this).field_yb[((vm) this).field_Gb])) {
                    var2 = ((vm) this).field_yb[((vm) this).field_Gb].f(param0) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    final boolean a(int param0, boolean param1, int param2) {
        int var6 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1) {
            Object var8 = null;
            String discarded$0 = vm.a((String) null, -29, (String) null, (String) null);
        }
        int var4 = -86 == (oq.field_j ^ -1) ? 1 : 0;
        if (((vm) this).field_Ob != null) {
            if (var4 != 0) {
                if (!((((vm) this).field_Ob.field_Gb ^ -1) != 0)) {
                    ((vm) this).h(0);
                    this.c(param1, 0);
                    return true;
                }
            }
            return ((vm) this).field_Ob.a(param0, param1, param2);
        }
        if (((vm) this).field_Ob == null) {
            if (this == (Object) (Object) mr.field_h) {
                if (!(var4 == 0)) {
                    jp.g((byte) 92);
                    return true;
                }
            }
        }
        int var5 = ho.field_h;
        if (0 >= var5) {
            return false;
        }
        if (!(hg.field_p != var5)) {
            var5 = 63;
        }
        for (var6 = 0; var6 < ((vm) this).field_zb.length; var6++) {
            if (var5 == ((vm) this).field_zb[var6]) {
                this.a(0, param0, var6, param2);
                return true;
            }
        }
        return false;
    }

    vm(long param0, qr param1, qr param2, qr param3, vm[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        bi var14 = null;
        int var15 = 0;
        nq var17 = null;
        nq var18 = null;
        ((vm) this).field_Gb = -1;
        ((vm) this).field_Hb = param5;
        ((vm) this).field_zb = param7;
        ((vm) this).field_yb = param4;
        ((vm) this).field_Pb = ((vm) this).field_Hb.length;
        var17 = param3.field_nb;
        var18 = var17;
        ((vm) this).field_Qb = var18.field_q + 2 + var18.field_J;
        ((vm) this).field_xb = ((vm) this).field_Qb * ((vm) this).field_Pb;
        ((vm) this).field_Kb = new sg[((vm) this).field_Pb];
        ((vm) this).field_Ib = 0;
        var11 = "<col=999999>";
        var12 = "</col>";
        var13 = 0;
        L0: while (true) {
          if (((vm) this).field_Pb <= var13) {
            ((vm) this).field_Ib = ((vm) this).field_Ib + (jq.field_c.field_o + 10);
            this.c(false, 12);
          } else {
            L1: {
              if (0 >= ((vm) this).field_zb[var13]) {
                break L1;
              } else {
                param6[var13] = var11 + sn.a(((vm) this).field_zb[var13], (byte) -86).toUpperCase() + ": " + var12 + param6[var13];
                break L1;
              }
            }
            L2: {
              L3: {
                var14 = null;
                if (((vm) this).field_yb[var13] != null) {
                  break L3;
                } else {
                  if (0 != (((vm) this).field_Hb[var13] ^ -1)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var14 = jq.field_c;
              break L2;
            }
            ((vm) this).field_Kb[var13] = new sg(0L, param2, (qr) null, param3, var14, param6[var13]);
            ((vm) this).a(4, (qr) (Object) ((vm) this).field_Kb[var13]);
            var15 = var17.c(param6[var13]);
            if (((vm) this).field_Ib < var15) {
              ((vm) this).field_Ib = var15;
              var13++;
              continue L0;
            } else {
              var13++;
              continue L0;
            }
          }
        }
    }

    public static void g(int param0) {
        field_Jb = null;
        field_Fb = null;
        if (param0 != -22521) {
            vm.g(-73);
        }
        field_Cb = null;
        field_Ab = null;
        field_Lb = null;
    }

    final static String a(String param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 > 38) {
          var4 = param3.length();
          var5 = var4;
          var6 = 0;
          var7 = "<%" + param2 + ">";
          L0: while (true) {
            var8_int = param3.indexOf(var7, var6);
            if (var8_int >= 0) {
              var6 = var8_int + var7.length();
              var5 = var5 + (param0.length() - var7.length());
              continue L0;
            } else {
              var6 = 0;
              var8 = new StringBuilder(var5);
              L1: while (true) {
                var9 = param3.indexOf(var7, var6);
                if (var9 < 0) {
                  StringBuilder discarded$3 = var8.append(param3.substring(var6, var4));
                  return var8.toString();
                } else {
                  StringBuilder discarded$4 = var8.append(param3.substring(var6, var9));
                  StringBuilder discarded$5 = var8.append(param0);
                  var6 = var7.length() + var9;
                  continue L1;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = "<%0> is offering an unrated rematch.";
        field_Lb = "Players";
    }
}
