/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j implements Runnable {
    volatile fj[] field_g;
    vf field_c;
    static m field_h;
    static long field_f;
    static String field_e;
    volatile boolean field_b;
    static String field_a;
    static ma field_d;
    volatile boolean field_i;

    final static int a(int param0, int param1, boolean param2, int param3, pf param4, String param5, pf param6) {
        int var12 = 0;
        int stackIn_6_0 = 0;
        sb stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String stackIn_13_2 = null;
        sb stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_16_2 = null;
        int stackIn_35_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = MinerDisturbance.field_ab;
        try {
          var14 = param6.a((byte) 69);
          if (param1 > -34) {
            field_e = (String) null;
          }
          var8 = param4.a((byte) 80);
          if (null == ci.field_i &&
            !ed.a(false, (byte) 38)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (qd.field_Q == cm.field_p) {
            mf.field_a = null;
            sn.field_c.field_o = 0;
            if (param5 != null) {
              var9 = 0;
              rf.field_c.field_o = 0;
              if (param2) {
                var9 = var9 | 1;
              }
              rf.field_c.a((byte) 106, dk.field_a.nextInt());
              rf.field_c.a((byte) 96, dk.field_a.nextInt());
              rf.field_c.a(8, var14);
              rf.field_c.a(8, var8);
              var15 = (CharSequence) ((Object) param5);
              rf.field_c.a(8, tk.a(732, var15));
              rf.field_c.b((byte) 123, param3);
              rf.field_c.c(param0, 25564);
              rf.field_c.c(var9, 25564);
              sn.field_c.c(18, 25564);
              sn.field_c.field_o = sn.field_c.field_o + 2;
              var10 = sn.field_c.field_o;
              var11_ref_String = ag.a(bm.c(-104), true);
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              sn.field_c.b(23446, var11_ref_String);
              jg.a(kc.field_b, -121, rf.field_c, ph.field_g, sn.field_c);
              sn.field_c.b(-var10 + sn.field_c.field_o, -506270856);
            } else {
              rf.field_c.field_o = 0;
              rf.field_c.a((byte) 124, dk.field_a.nextInt());
              rf.field_c.a((byte) 127, dk.field_a.nextInt());
              stackIn_12_0 = rf.field_c;
              stackIn_12_1 = 8;
              if (!param6.b((byte) 112)) {
                stackIn_13_2 = "";
              } else {
                stackIn_13_2 = var14;
              }
              ((sb) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_13_2);
              stackIn_15_0 = rf.field_c;
              stackIn_15_1 = 8;
              if (param4.b((byte) 88)) {
                stackIn_16_2 = var8;
              } else {
                stackIn_16_2 = "";
              }
              ((sb) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_16_2);
              sn.field_c.c(16, 25564);
              sn.field_c.field_o = sn.field_c.field_o + 1;
              var9 = sn.field_c.field_o;
              jg.a(kc.field_b, -127, rf.field_c, ph.field_g, sn.field_c);
              sn.field_c.g(-1, sn.field_c.field_o - var9);
            }
            bk.a((byte) -114, -1);
            qd.field_Q = jn.field_r;
          }
          if (qd.field_Q == jn.field_r &&
            ta.a(0, 1)) {
            var9Lifetime1 = kj.field_a.d((byte) -54);
            kj.field_a.field_o = 0;
            if (var9Lifetime1 >= 100 &&
              105 >= var9Lifetime1) {
              qd.field_Q = lm.field_M;
              vh.field_i = new String[var9Lifetime1 - 100];
            } else {
              if (248 == var9Lifetime1) {
                ri.a((byte) -125, bm.c(-99));
                nf.field_g = d.field_a;
                si.a(-98);
                ek.field_c = false;
                stackIn_35_0 = var9Lifetime1;
                return stackIn_35_0;
              }
              if (var9Lifetime1 != 99) {
                rj.field_d = -1;
                oj.field_K = var9Lifetime1;
                qd.field_Q = aa.field_l;
              } else {
                ta.a(0, hl.a(-92));
                mf.field_a = new Boolean(bh.a(kj.field_a, -29320));
                kj.field_a.field_o = 0;
              }
            }
          }
          if (lm.field_M == qd.field_Q) {
            var9Lifetime2 = 2;
            if (ta.a(0, var9Lifetime2)) {
              var10Lifetime1 = kj.field_a.e(-25);
              kj.field_a.field_o = 0;
              if (ta.a(0, var10Lifetime1)) {
                var11 = vh.field_i.length;
                for (var12 = 0; var12 < var11; var12++) {
                  vh.field_i[var12] = kj.field_a.g(-1);
                }
                si.a(-34);
                ek.field_c = false;
                stackIn_44_0 = var11 + 100;
                return stackIn_44_0;
              }
            }
          }
          if (qd.field_Q == aa.field_l &&
            kj.b(-9319)) {
            if (oj.field_K != 255) {
              nf.field_g = kj.field_a.a(false);
            } else {
              var9_ref_String = kj.field_a.j(81);
              if (var9_ref_String != null) {
                nc.a(bm.c(-76), var9_ref_String, (byte) 115);
              }
            }
            si.a(-82);
            ek.field_c = false;
            stackIn_53_0 = oj.field_K;
            return stackIn_53_0;
          }
          if (ci.field_i == null) {
            if (ek.field_c) {
              if (qa.a(-112) > 30000L) {
                nf.field_g = oi.field_K;
              } else {
                nf.field_g = l.field_a;
              }
              ek.field_c = false;
              stackIn_61_0 = 249;
              return stackIn_61_0;
            }
            var9Lifetime3 = jc.field_E;
            jc.field_E = ic.field_h;
            ek.field_c = true;
            ic.field_h = var9Lifetime3;
          }
          stackIn_64_0 = -1;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("j.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param5 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param6 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_d = null;
        if (param0 < 55) {
          field_e = (String) null;
        }
    }

    public final void run() {
        int var1_int = 0;
        fj var2 = null;
        int var4 = MinerDisturbance.field_ab;
        this.field_i = true;
        try {
          while (!this.field_b) {
            for (var1_int = 0; var1_int < 2; var1_int++) {
              var2 = this.field_g[var1_int];
              if (var2 != null) {
                var2.e();
              }
            }
            gf.a(10L, -10309);
            Object var5 = (Object) null;
            jk.a(-23765, this.field_c, (Object) null);
          }
        } catch (Exception exception) {
          String var6 = (String) null;
          di.a((Throwable) ((Object) exception), 1, (String) null);
        } finally {
          this.field_i = false;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = -13 % ((param1 - 7) / 38);
        param0 = param0 & 8191;
        if (param0 < 4096) {
          return 2048 > param0 ? ta.field_g[2048 - param0] : -ta.field_g[-2048 + param0];
        }
        return param0 >= 6144 ? ta.field_g[param0 - 6144] : -ta.field_g[6144 - param0];
    }

    final static boolean a(byte param0) {
        if (param0 != -110) {
          field_a = (String) null;
        }
        return ci.field_e == bd.field_h ? true : false;
    }

    j() {
        this.field_g = new fj[2];
        this.field_b = false;
        this.field_i = false;
    }

    static {
        field_h = null;
        field_e = "Mining map: Displays the map of the volcano.";
        field_a = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
