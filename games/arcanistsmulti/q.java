/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends wn {
    static java.math.BigInteger field_K;
    static String field_J;
    static String field_F;
    static int[] field_E;
    static String field_H;
    static String field_O;
    static String field_I;
    static aj field_G;
    static int field_P;
    static String field_M;
    static int field_N;
    static int field_L;

    public static void f(int param0) {
        field_I = null;
        field_E = null;
        field_F = null;
        field_O = null;
        field_H = null;
        field_J = null;
        field_M = null;
        if (param0 != -1764031359) {
          field_L = 98;
          field_K = null;
          field_G = null;
          return;
        } else {
          field_K = null;
          field_G = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, qm param5) {
        se var8 = null;
        try {
            super.a(param0, param1 ^ 0, param2, param3, param4, param5);
            if (param1 != -20592) {
                field_J = (String) null;
            }
            var8 = so.field_i;
            if (var8 != null && this.a((byte) -47, param3, param0, param4, param2)) {
                if (this.field_o instanceof em) {
                    ((em) ((Object) this.field_o)).a(var8, (byte) 125, (q) (this));
                    so.field_i = null;
                    return;
                }
                if (!(var8.field_o instanceof em)) {
                    return;
                }
                ((em) ((Object) var8.field_o)).a(var8, (byte) 75, (q) (this));
                so.field_i = null;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "q.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static qb[] a(int param0, int param1) {
        qb[] var2;
        kc var3;
        if (param1 != 0) {
          var3 = (kc) null;
          q.a((kc) null, false, (kc) null, (kc) null, (kc) null);
          var2 = new qb[9];
          var2[4] = ce.b(64, param0, hh.a(param1, 21385));
          return var2;
        } else {
          var2 = new qb[9];
          var2[4] = ce.b(64, param0, hh.a(param1, 21385));
          return var2;
        }
    }

    final static void a(kc param0, boolean param1, kc param2, kc param3, kc param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (wd.field_a != null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                ef.field_r = param1;
                if (!wh.field_g) {
                  if (ld.field_p) {
                    var5 = ra.field_l;
                    break L1;
                  } else {
                    var5 = aj.field_i;
                    break L1;
                  }
                } else {
                  var5 = rk.field_N;
                  break L1;
                }
              }
              var7 = (String) null;
              rb.a(jk.field_u, var5, 0, (String) null, 97);
              lo.field_y = sa.field_Cb;
              wd.field_a = wn.field_D;
              wn.field_D.field_J = jk.field_u + (-(8355711 & jk.field_u >> -175415455) + ((16711422 & nf.field_A.field_J) >> -1764031359));
              wn.field_D.field_eb = -((16711423 & jk.field_u) >> 571712289) + jk.field_u - -(8355711 & nf.field_A.field_eb >> -537908735);
              wn.field_D.field_zb = ((nf.field_A.field_zb & 16711422) >> 725118721) + (-(8355711 & jk.field_u >> -664702975) + jk.field_u);
              tm.field_d = new kc(0L, param3);
              bi.field_U = new kc(0L, param2);
              in.field_Jb = new kc(0L, (kc) null);
              ck.field_d = new kc(0L, param4);
              wn.field_D = new kc(0L, param0);
              wn.field_D.field_Z = oo.field_x;
              ck.field_d.a(wn.field_D, 41);
              sa.field_Cb = new kc(0L, lo.field_y);
              ck.field_d.a(sa.field_Cb, 97);
              hf.field_f = new kc(0L, nf.field_A, fe.field_k);
              ih.field_d = new kc(0L, nf.field_A);
              tm.field_d.a(bi.field_U, 65);
              tm.field_d.a(in.field_Jb, 126);
              in.field_Jb.a(ck.field_d, 115);
              in.field_Jb.a(hf.field_f, 81);
              in.field_Jb.a(ih.field_d, 69);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5_ref);

            stackIn_13_1 = new StringBuilder().append("q.F(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private q(int param0, int param1, int param2, int param3, pf param4, wc param5, qm param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_B = param6;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "q.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = new java.math.BigInteger("65537");
        field_J = "MOST WET - ";
        field_E = new int[8192];
        field_F = "Hmm...you got hurt. Try not to hurt yourself in future.";
        field_I = "Options Menu";
        field_O = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_H = "This is the Book of Seas. Sea spells focus on diverse attacks from above and below. You require 5 wands to purchase this spellbook; you currently have ";
        field_G = new aj(13, 0, 1, 0);
        field_M = "<%0> has left the lobby.";
    }
}
