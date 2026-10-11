/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static kc field_f;
    static String field_m;
    static qb field_o;
    private int field_p;
    private String field_j;
    private int field_n;
    private qb field_k;
    static kc field_q;
    static int field_r;
    private int field_l;
    static String field_b;
    private int field_c;
    private int field_u;
    private boolean field_h;
    static kc field_t;
    private String[] field_a;
    private qb field_e;
    private int field_s;
    private qb field_g;
    private ll[] field_i;
    private so field_d;

    public static void a(boolean param0) {
        if (param0) {
          int[] var2 = (int[]) null;
          hf.a(91, (int[]) null, -18, -89, -119, 34, 118);
        }
        field_m = null;
        field_o = null;
        field_t = null;
        field_b = null;
        field_f = null;
        field_q = null;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          wl.field_L[param3] = param1;
          lm.field_e[param3] = param6;
          eo.field_b[param3] = param5;
          if (param2 != 0) {
            dj var8 = (dj) null;
            hf.a((String[]) null, (String) null, -76, (dj) null, 57);
          }
          tg.field_f[param3] = param4;
          sc.field_U[param3] = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "hf.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final int a(byte param0) {
        if (param0 >= -61) {
          this.field_i = (ll[]) null;
        }
        this.field_d.a((byte) -76);
        if (this.field_d.b(true)) {
          if (this.field_d.field_h == 0) {
            this.a(127);
            return 3;
          }
          if (this.field_d.field_h == 1) {
            return 1;
          }
        }
        if (vn.field_d == 13) {
          return 1;
        }
        return 0;
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 > 0 &&
            param0 < 128) {
            return true;
          }
          if (param0 >= 160 &&
            param0 <= 255) {
            return true;
          }
          if (param0 != 0) {
            var6 = oc.field_a;
            var2 = var6;
            var3 = 0;
            while (var3 < var6.length) {
              var4 = var6[var3];
              if (~var4 != ~param0) {
                var3++;
                continue;
              }
              return true;
            }
          }
          var2_int = -85 / ((21 - param1) / 39);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "hf.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void c(int param0) {
        wh.field_g = false;
        ld.field_p = df.field_z.e((byte) 88) == 0 ? true : false;
        if (param0 < 15) {
          hf.a(true);
        }
    }

    private final void a(int param0, int param1, int param2, dj param3, String param4, int param5, int[] param6, int param7) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          ec.a(65280);
          for (var9_int = param7; var9_int < param0; var9_int++) {
            de.h(param2, var9_int, param1, 1 + var9_int);
            var10 = var9_int * param6.length / param0;
            var11 = param6[-var10 + param6.length - 1];
            param3.a(param4, param2, param7, param1, param0, var11, -1, 1, 1, 0);
          }
          oo.c(-15405);
          if (param5 != 23146) {
            this.field_u = 61;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_9_0 = var9;
          stackIn_9_1 = new StringBuilder().append("hf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param7).append(')').toString());
        }
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        de.c(9, 9, 622, 47, 4540749, 65793);
        de.d(9, 257, 622, 33, 2585);
        de.c(9, 265, 622, 11, 2585, 1515566);
        var2 = 0;
        var3 = 14;
        while (var2 < 4) {
          de.c(var3, 331, 117, 90, 460551, 3881787);
          var2++;
          var3 += 121;
        }
        var2Lifetime1 = 0;
        var3Lifetime1 = 299;
        while (var2Lifetime1 < 2) {
          de.c(508, var3Lifetime1, 127, 42, 1130115, 3365268);
          de.d(508, 42 + var3Lifetime1, 127, 42, 12410);
          var3Lifetime1 += 91;
          var2Lifetime1++;
        }
        this.c((byte) -101);
        if (null != an.field_o &&
          an.field_o.c(-10923) &&
          an.field_o.a("members_expansion_screen", -24417) &&
          an.field_o.a("arialish12", -24417) &&
          an.field_o.a("pump32", -24417) &&
          bb.field_a != null &&
          bb.field_a.c(-10923) &&
          bb.field_a.a("arialish12", -24417) &&
          bb.field_a.a("pump32", -24417)) {
          be.field_j = af.a("frame", "members_expansion_screen", 19412, an.field_o);
          cg.field_Ib = fj.a("members_expansion_screen", -22612, an.field_o, "arrow");
          li.field_F = rc.a(bb.field_a, -24755, "arialish12", "", an.field_o);
          fd.field_b = rm.a("", bb.field_a, "pump32", -119, an.field_o);
          fd.field_f = cg.a("benefit_orbs", (byte) 113, an.field_o, "members_expansion_screen");
          qf.field_b = cg.a("button_text", (byte) 116, an.field_o, "members_expansion_screen");
          ji.field_c = nl.a((byte) 31, an.field_o, "button_highlights", "members_expansion_screen");
          an.field_o = null;
          bb.field_a = null;
        }
        this.b(16180917);
        if (null == be.field_j) {
          return;
        }
        this.field_e.c(376, 339);
        this.field_k.c(9, 9);
        be.field_j.a(0, 0);
        if (cg.field_Ib != null) {
          cg.field_Ib.c(9, 257);
          cg.field_Ib.e(558, 257);
          if (me.field_I > 257 &&
            290 > me.field_I) {
            var2Lifetime2 = 40 + (40 * hg.a(this.field_p << 4, -52) >> 16);
            if (var2Lifetime2 > 0) {
              if (an.field_g > 9 &&
                an.field_g < 82) {
                cg.field_Ib.b(8, 256, var2Lifetime2);
                cg.field_Ib.b(10, 256, var2Lifetime2);
                cg.field_Ib.b(8, 258, var2Lifetime2);
                cg.field_Ib.b(10, 258, var2Lifetime2);
              } else {
                if (an.field_g > 558 &&
                  631 > an.field_g) {
                  cg.field_Ib.d();
                  cg.field_Ib.b(557, 256, var2Lifetime2);
                  cg.field_Ib.b(559, 256, var2Lifetime2);
                  cg.field_Ib.b(557, 258, var2Lifetime2);
                  cg.field_Ib.b(559, 258, var2Lifetime2);
                  cg.field_Ib.d();
                }
              }
            }
          }
        }
        var2Lifetime3 = 89 % ((-46 - param0) / 43);
        this.field_g.c(16, 302);
        li.field_F.a(this.field_a[this.field_l], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
        fd.field_f.c(30, 330);
        li.field_F.a(nf.field_qb[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
        li.field_F.a(nf.field_qb[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
        li.field_F.a(nf.field_qb[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
        qf.field_b.c(508 + (127 - qf.field_b.field_n) / 2, 315);
        if (0 != this.field_d.field_h) {
          if (this.field_d.field_h == 1) {
            ji.field_c[1].c(508, 387);
          }
        } else {
          ji.field_c[0].c(508, 299);
        }
    }

    final static String a(String param0, String param1, int param2, int param3) {
        RuntimeException var4 = null;
        ab var5 = null;
        int var6 = 0;
        wa var7 = null;
        CharSequence var8 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = (CharSequence) ((Object) param0);
          if (!vn.a(var8, 0)) {
            stackIn_2_0 = fn.field_h;
            return stackIn_2_0;
          }
          if (jb.field_t != 2) {
            stackIn_5_0 = rk.field_L;
            return stackIn_5_0;
          }
          var7 = mf.a(-1, param1);
          if (var7 == null) {
            stackIn_9_0 = tj.a(param3 ^ 10068676, new String[]{param1}, k.field_f);
            return stackIn_9_0;
          }
          var7.a(true);
          var7.a((byte) 88);
          pc.field_b = pc.field_b - 1;
          var5 = he.field_e;
          var5.b((byte) -50, param2);
          var5.field_g = var5.field_g + 1;
          var6 = var5.field_g;
          var5.f(3, (byte) -99);
          if (param3 != 10068666) {
            field_t = (kc) null;
          }
          var5.a(param0, 23333);
          var5.b(-var6 + var5.field_g, (byte) 43);
          stackIn_13_0 = null;
          return (String) (stackIn_13_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("hf.N(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0) {
        if (param0 != 127) {
          return;
        }
        try {
          ko.a(cd.e(124), (byte) -108);
        } catch (Exception exception) {
          exception.printStackTrace();
        }
    }

    private final void a(ll[] param0, int param1, String param2, java.applet.Applet param3, boolean param4, String[] param5) {
        String var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          var7 = param3.getParameter("currency");
          if (var7 != null &&
            fi.a((CharSequence) ((Object) var7), 10)) {
            this.field_u = dc.a((CharSequence) ((Object) var7), 126);
          } else {
            this.field_u = 2;
          }
          this.field_j = param2;
          this.field_d = new so(2);
          this.field_i = param0;
          this.field_a = param5;
          if (param1 >= -99) {
            this.field_h = false;
          }
          if (null != this.field_i &&
            3 <= this.field_i.length) {
            v.field_t = param4;
            return;
          }
          throw new IllegalArgumentException("");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("hf.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int[] var15 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var9 = null;
        qb var5 = null;
        String var6 = null;
        String var7 = null;
        if (this.field_k == null) {
          if (fd.field_b == null) {
            return;
          }
          this.field_k = new qb(622, 47);
          fk.a(this.field_k, -23095);
          de.c(0, 0, 622, 47, 4540749, 65793);
          var2 = 16448250;
          var3 = 10068666;
          var15 = kb.a(var3, var2, param0 ^ 16128330);
          this.a(47, 622, 0, fd.field_b, this.field_j, 23146, var15, 0);
          oo.c(-15405);
          this.field_g = new qb(475, 24);
          this.a(this.field_g, 0.75f, 0, 127, 24, var15, -4, fd.field_b, mm.field_r, 475);
          var13 = kb.a(526344, 526344, 65535);
          var11 = var13;
          var9 = var11;
          var5 = new qb(121, 122);
          fk.a(var5, param0 ^ -16170116);
          de.c(0, 0, var5.field_q, var5.field_y / 2, param0, 16306250);
          de.c(0, var5.field_y / 2, var5.field_q, var5.field_y, 16306250, 15568919);
          var6 = vc.field_l;
          var7 = ph.field_b;
          this.a(var5, 0.5f, 0, 127, var5.field_y, var13, -16, fd.field_b, var6, var5.field_q);
          this.a(var5, 0.5f, 0, 127, var5.field_y, var13, 20, fd.field_b, var7, var5.field_q);
          this.a(var5, 0.699999988079071f, 0, 127, var5.field_y / 3, var9, 12 + (var5.field_y / 2 - fd.field_b.field_C), fd.field_b, gk.field_f[this.field_u], var5.field_q);
          oo.c(-15405);
          this.field_e = new qb(121, 122);
          fk.a(this.field_e, param0 - 16204012);
          var5.a(this.field_e.field_q / 2, this.field_e.field_y / 2, -2048, 4096);
          oo.c(param0 - 16196322);
          return;
        }
    }

    private final void a(qb param0, float param1, int param2, int param3, int param4, int[] param5, int param6, dj param7, String param8, int param9) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        qb var13 = null;
        try {
          var11_int = (int)((float)param9 / param1);
          var12 = (int)((float)param4 / param1);
          if (param3 != 127) {
            return;
          }
          var13 = new qb(var11_int, var12);
          fk.a(var13, -23095);
          param0.c((int)((float)(-param2) / param1), (int)((float)(-param6) / param1), (int)((float)param0.field_q / param1), (int)((float)param0.field_y / param1));
          this.a(var12, var11_int, 0, param7, param8, param3 ^ 23061, param5, 0);
          oo.c(param3 - 15532);
          fk.a(param0, -23095);
          var13.d(param2, param6, param9, param4);
          oo.c(param3 ^ -15444);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_6_0 = var11;
          stackIn_6_1 = new StringBuilder().append("hf.O(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param8 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param9).append(')').toString());
        }
    }

    private final void c(byte param0) {
        ll var2;
        int var3;
        int var4;
        int var5;
        ll var6;
        ll var7;
        ll var2Lifetime1;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (null == this.field_i) {
          if (li.field_F != null) {
            li.field_F.a(hn.field_l, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
          }
          return;
        }
        if (param0 != -101) {
          this.a(true, false);
        }
        var6 = this.field_i[this.field_l];
        var2 = var6;
        if (var2 != null) {
          var6.a(9, 58);
        } else {
          if (null != li.field_F) {
            li.field_F.a(hn.field_l, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
          }
        }
        if (vf.field_o > this.field_s) {
          var7 = this.field_i[this.field_n];
          var2Lifetime1 = var7;
          if (var2Lifetime1 != null) {
            var3 = (60 + var7.field_g) * this.field_s / vf.field_o;
            var4 = var3 - 30;
            if (!this.field_h) {
              td.a(-256 * var4 / 30, (byte) -115, (-var4 + var7.field_g) * 256 / 30, var7, 9, 58);
            } else {
              td.a(256 * (-var4 + var7.field_g) / 30, (byte) 70, var4 * -256 / 30, var7, 9, 58);
            }
          }
        }
        return;
    }

    final int a(boolean param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_c = this.field_c + 65536;
        if (!param1) {
          return -60;
        }
        while (65536 <= gh.a(vf.field_q, (byte) 96, this.field_c)) {
          this.field_p = this.field_p + 1;
          this.field_c = this.field_c - vf.field_q;
        }
        var3 = -1;
        if (this.field_i != null) {
          var3 = this.field_i.length;
        }
        if (-1 != var3) {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_s < vf.field_m) {
            this.field_s = this.field_s + 1;
            if (this.field_s > vf.field_o) {
              if (this.field_i != null &&
                this.field_i[this.field_l] != null) {
                if ((!(this.field_s < vf.field_m)) &&
                  ((this.field_i[(this.field_l + 1) % var3] == null))) {
                  this.field_s = this.field_s - 1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_s = this.field_s - 1;
              }
            } else {
              if (this.field_s >= vf.field_m &&
                this.field_i[(this.field_l + 1) % var3] == null) {
                this.field_s = this.field_s - 1;
              }
            }
          }
          if (vf.field_m <= this.field_s) {
            this.field_n = this.field_l;
            if (!this.field_h) {
              this.field_l = this.field_l - 1;
              if (this.field_l < 0) {
                this.field_l = this.field_l + var3;
              }
            } else {
              this.field_l = this.field_l + 1;
              if (var3 <= this.field_l) {
                this.field_l = this.field_l - var3;
              }
            }
            this.field_s = this.field_s - vf.field_m;
          }
          if (this.field_s > vf.field_o) {
            this.field_h = true;
          }
        }
        if (cg.field_Ib != null) {
          var4 = 0;
          if (re.field_r != 0 &&
            ja.field_s > 257 &&
            290 > ja.field_s) {
            if (pb.field_h > 9 &&
              82 > pb.field_h) {
              var4 = 1;
              this.field_h = false;
              this.field_s = vf.field_m;
            }
            if (558 < pb.field_h &&
              pb.field_h < 631) {
              this.field_h = true;
              this.field_s = vf.field_m;
              var4 = 1;
            }
          }
          if (var4 == 0 &&
            vf.field_o < this.field_s &&
            ja.field_s > 257 &&
            ja.field_s < 290) {
            if (an.field_g > 9 &&
              82 > an.field_g) {
              this.field_s = vf.field_o;
            }
            if (558 < an.field_g &&
              an.field_g < 631) {
              this.field_s = vf.field_o;
            }
          }
        }
        if (param0) {
          this.field_d.a(this.a(an.field_g, 112, me.field_I), this.a(pb.field_h, 76, ja.field_s), -97);
          var4Lifetime1 = 0;
          if (this.field_d.b(true)) {
            if (this.field_d.field_h == 0) {
              var4Lifetime1 = 1;
            }
            if (this.field_d.field_h == 1) {
              return 2;
            }
          }
          if (v.field_t) {
            while (ib.b(false)) {
              var5 = this.a((byte) -73);
              if (0 == var5) {
                continue;
              }
              return var5;
            }
          }
          if (var4Lifetime1 != 0) {
            this.a(127);
            return 3;
          }
        }
        return 0;
    }

    private final int a(int param0, int param1, int param2) {
        if (be.field_j == null) {
          return -1;
        }
        if (param1 <= 72) {
          this.field_j = (String) null;
        }
        if (param0 >= 508 &&
          635 > param0 &&
          param2 >= 299 &&
          386 > param2) {
          return 0;
        }
        if (param0 >= 508 &&
          param0 < 635 &&
          param2 >= 390 &&
          param2 < 475) {
          return 1;
        }
        return -1;
    }

    final static int a(String[] args, String param1, int param2, dj param3, int param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = param3.b(param1);
          if (param4 != 21230) {
            field_q = (kc) null;
          }
          if (param2 >= var5_int &&
            param1.indexOf("<br>") == -1) {
            args[0] = param1;
            stackIn_6_0 = 1;
            return stackIn_6_0;
          }
          var6 = (param2 + var5_int - 1) / param2;
          param2 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param1.length();
          for (var9 = 0; var8 > var9; var9++) {
            var10 = param1.charAt(var9);
            if (var10 == 32 ||
              var10 == 45) {
              var11 = param1.substring(var7, 1 + var9).trim();
              var12 = param3.b(var11);
              if (param2 <= var12) {
                var7 = 1 + var9;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                args[incrementValue$1] = var11;
              }
            }
            if (var10 == 62 &&
              param1.regionMatches(var9 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              args[incrementValue$2] = param1.substring(var7, var9 - 3).trim();
              var7 = var9 + 1;
            }
          }
          if (var7 < var8) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            args[incrementValue$0] = param1.substring(var7, var8).trim();
          }
          stackIn_25_0 = var6Lifetime1;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("hf.J(");
          if (args == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param4).append(')').toString());
        }
    }

    hf(java.applet.Applet param0, String param1, ll[] param2, String[] param3) {
        this.field_p = 0;
        this.field_c = 0;
        this.field_h = true;
        try {
          this.a(param2, -126, param1, param0, true, param3);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "hf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_b = "Offering rematch";
    }
}
