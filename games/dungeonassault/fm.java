/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static int field_e;
    static md field_b;
    private fm field_c;
    static int[] field_h;
    static gb field_f;
    static String field_l;
    static String field_j;
    static String field_d;
    static int field_a;
    static int field_g;
    static int field_i;
    private k field_k;

    final static cn b(int param0, int param1) {
        if (param1 == 0) {
          return null;
        }
        if (param1 == 1) {
          return tn.field_I;
        }
        if (param0 != -29092) {
          return (cn) null;
        }
        if (2 == param1) {
          return qd.field_d;
        }
        if (3 == param1) {
          return hl.field_h;
        }
        if (param1 == 4) {
          return lj.field_o;
        }
        if (param1 == 5) {
          return in.field_D;
        }
        if (6 == param1) {
          return ia.field_R;
        }
        if (7 == param1) {
          return sp.field_a;
        }
        if (param1 == 8) {
          return ub.field_j;
        }
        if (9 == param1) {
          return cg.field_b;
        }
        if (10 == param1) {
          return kf.field_k;
        }
        if (11 == param1) {
          return jl.field_c;
        }
        if (param1 == 12) {
          return g.field_Ib;
        }
        if (param1 == 13) {
          return ef.field_e;
        }
        if (param1 == 14) {
          return ie.field_i;
        }
        if (param1 == 15) {
          return na.field_A;
        }
        if (param1 == 16) {
          return le.field_d;
        }
        if (17 == param1) {
          return gd.field_A;
        }
        if (param1 == 18) {
          return df.field_e;
        }
        if (param1 == 19) {
          return bj.field_F;
        }
        if (param1 == 20) {
          return m.field_c;
        }
        if (param1 == 21) {
          return up.field_b;
        }
        if (param1 == 22) {
          return ll.field_q;
        }
        if (23 == param1) {
          return jc.field_c;
        }
        if (param1 == 24) {
          return ef.field_e;
        }
        if (25 == param1) {
          return DungeonAssault.field_I;
        }
        if (param1 == 27) {
          return ld.field_d;
        }
        if (param1 == 28) {
          return fn.field_o;
        }
        if (param1 == 31) {
          return ld.field_d;
        }
        if (33 == param1) {
          return oo.field_c;
        }
        if (param1 == 34) {
          return fp.field_b;
        }
        if (21 != param1) {
          return tn.field_I;
        }
        return up.field_b;
    }

    final static void a(int[][] param0, int param1, int param2, byte param3) {
        int var19 = 0;
        qe discarded$0 = null;
        int[] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        cn var5_ref_cn = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var24 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var5Lifetime1;
        var24 = DungeonAssault.field_K;
        try {
          if (null == uc.field_E ||
            param2 * param1 != uc.field_E.field_c.length) {
            var4 = new int[64];
            for (var5 = 0; var5 < 64; var5++) {
              var4[var5] = mp.a(65793 * (var5 + 24), -2147483648);
            }
            var5_ref_cn = te.a(param1, param2, var4, 16, 8, 0.125);
            uc.field_E = new ph(var5_ref_cn, te.b(param1, param2, 0.125));
          }
          var4_int = -(param1 / 2) + 320;
          var5Lifetime1 = -(param2 / 2) + 240;
          uc.field_E.b(var4_int, var5Lifetime1);
          gf.b(var4_int, var5Lifetime1, param1, param2, 6637335);
          qe.b(var4_int, var5Lifetime1, param1, param2, 8421504, 128, 128);
          var6 = be.field_o.field_d / 2;
          var7 = bk.field_e.field_b / 2;
          un.a(var4_int, (byte) 41, param1, var5Lifetime1 - var7, true);
          un.a(var4_int, (byte) 81, param1, -var7 + var5Lifetime1 + param2, true);
          vf.a(param2, true, var4_int - var6, 118, var5Lifetime1);
          vf.a(param2, true, var4_int - (var6 - param1), 101, var5Lifetime1);
          var8 = 37;
          var9 = 20;
          var10 = -var9 + var4_int;
          var11 = -var8 + var5Lifetime1;
          var12 = -oe.field_m.field_d + (var9 + param1 + var4_int);
          oe.field_m.h(var10, var11);
          var13 = var5Lifetime1 - var8;
          if (param3 > -16) {
            return;
          }
          oe.field_m.j(var12, var13);
          jn.field_n.b(486513968);
          var14 = 14;
          var15 = 37;
          var16 = jn.field_n.field_j >> 16;
          var17 = jn.field_n.field_t >> 16;
          jn.field_n.field_v.a(var10 + var15 - var17, var14 + var11 - var16);
          var18 = var12;
          var18 = var18 + oe.field_m.field_d;
          var18 = var18 - jn.field_n.field_v.field_h;
          var18 = var18 - var15;
          var18 = var18 + var17;
          jn.field_n.field_v.b(var18, -var16 + (var14 + var13));
          if (param0 != null) {
            for (var19 = 0; param0.length > var19; var19++) {
              if (param0[var19] != null) {
                var20 = param0[var19][0];
                var21 = param0[var19][1];
                var22 = param0[var19][2];
                var22 -= 4;
                var21 += 2;
                var23 = param0[var19][3];
                var20 += 2;
                var23 -= 4;
                gf.e(var20, var21, var22 + var20, var21 + var23);
                en.a((byte) -1, var20, var22, 4 + var23, var21);
                gf.b();
                rp.a(4, var22, (byte) 108, var20, var23, kc.field_S, var21);
              }
            }
          }
          discarded$0 = bf.field_f[mn.field_b];
          qe.e();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_23_0 = var4_ref;
          stackIn_23_1 = new StringBuilder().append("fm.E(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(ec param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -55) {
            field_f = (gb) null;
          }
          var2_int = param0.c(true);
          stackIn_5_0 = (var2_int == 1) ? 1 : 0;
          var3 = stackIn_5_0;
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("fm.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 > -115) {
          field_i = 2;
        }
        stackIn_6_0 = (null != na.field_D) && (na.field_D.i(32) != null);
        return stackIn_6_0;
    }

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          var4_int = -1;
          var5 = param2;
          if (param1 < 9) {
            fm.b(-123, -68);
          }
          while (param0 > var5) {
            var4_int = var4_int >>> 8 ^ ih.field_J[255 & (var4_int ^ param3[var5])];
            var5++;
          }
          var4_int = ~var4_int;
          stackIn_6_0 = var4_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("fm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_l = null;
        field_d = null;
        field_b = null;
        field_h = null;
        if (param0) {
          return;
        }
        field_j = null;
    }

    final String a(String param0, int param1) {
        k var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          var3 = this.field_k;
          if (param1 > -45) {
            fm.b(104, -22);
          }
          while (var3 != null) {
            if (param0.equals(var3.field_g)) {
              stackIn_7_0 = var3.field_i;
              return stackIn_7_0;
            }
            var3 = var3.field_d;
          }
          if (null == this.field_c) {
            return null;
          }
          stackIn_12_0 = this.field_c.a(param0, -96);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("fm.I(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(String param0, int param1, String param2) {
        k var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var6 = DungeonAssault.field_K;
        try {
          var5 = 119 / ((param1 + 30) / 59);
          var4 = this.field_k;
          while (var4 != null) {
            if (param2.equals(var4.field_g)) {
              var4.field_i = param0;
              return;
            }
            var4 = var4.field_d;
          }
          this.field_k = new k(param2, param0, this.field_k);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("fm.J(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final String a(String param0, byte param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        int var11 = 0;
        StringBuilder var12 = null;
        var11 = DungeonAssault.field_K;
        try {
          if (param0 == null) {
            return null;
          }
          var12 = new StringBuilder(param0.length());
          if (param1 != -48) {
            fm.b(-93, -72);
          }
          var4 = "<%";
          var5 = ">";
          var6 = 0;
          var7 = param0.length();
          while (var6 < var7) {
            var8 = param0.indexOf(var4, var6);
            if (var8 < 0) {
              discarded$0 = var12.append(param0.substring(var6, var7));
            } else {
              discarded$1 = var12.append(param0.substring(var6, var8));
              var6 = var8;
              var8 = param0.indexOf(var5, var6 + 2);
              if (var8 >= 0) {
                var9 = param0.substring(2 + var6, var8);
                var10 = this.a(var9, param1 ^ 91);
                if (var10 != null) {
                  discarded$2 = var12.append(var10);
                }
                var6 = var8 + 1;
                continue;
              }
              discarded$3 = var12.append(param0.substring(var6, var7));
            }
            break;
          }
          stackIn_17_0 = var12.toString();
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("fm.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        rj var3 = (rj) null;
        ba.a((rj) null, (byte) 59, param1);
        if (param0 <= 30) {
          fm.a(true);
        }
    }

    public fm() {
    }

    fm(fm param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "fm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
        field_l = "May avoid combat.";
        field_d = "The orc warrior's weapon and armour may be battered from his years of war, he remains a competent if unspectacular fighter.";
        field_a = field_e;
        field_h = new int[8192];
        field_j = "Passwords must be between 5 and 20 characters long";
        field_i = 10080;
    }
}
