/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    static int field_k;
    private te[] field_b;
    private int field_o;
    private wc field_a;
    private int field_j;
    private int field_l;
    private boolean field_n;
    private int field_e;
    private ed field_g;
    private String field_f;
    private ed field_h;
    private ed field_c;
    private String[] field_d;
    private int field_m;
    private int field_i;

    final void c(int param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        var4 = EscapeVector.field_A;
        em.c(9, 9, 622, 47, 4540749, 65793);
        em.a(9, 257, 622, 33, 2585);
        em.c(9, 265, 622, 11, 2585, 1515566);
        var2 = 0;
        var3 = 14;
        while (var2 < 4) {
          em.c(var3, 331, 117, 90, 460551, 3881787);
          var3 += 121;
          var2++;
        }
        var2Lifetime1 = 0;
        var3Lifetime1 = 299;
        if (param0 > -28) {
          this.field_b = (te[]) null;
        }
        while (var2Lifetime1 < 2) {
          em.c(508, var3Lifetime1, 127, 42, 1130115, 3365268);
          em.a(508, var3Lifetime1 + 42, 127, 42, 12410);
          var2Lifetime1++;
          var3Lifetime1 += 91;
        }
        this.b(-122);
        if (null != ck.field_x &&
          ck.field_x.b(0) &&
          ck.field_x.a(0, "members_expansion_screen") &&
          ck.field_x.a(0, "arialish12") &&
          ck.field_x.a(0, "pump32") &&
          pc.field_e != null &&
          pc.field_e.b(0) &&
          pc.field_e.a(0, "arialish12") &&
          pc.field_e.a(0, "pump32")) {
          ia.field_z = bf.a(ck.field_x, 54, "frame", "members_expansion_screen");
          ml.field_c = fe.a("members_expansion_screen", ck.field_x, "arrow", true);
          ac.field_c = oi.a(4, pc.field_e, "arialish12", "", ck.field_x);
          mn.field_h = ac.a("", -73, ck.field_x, "pump32", pc.field_e);
          wf.field_e = p.a((byte) 8, "benefit_orbs", ck.field_x, "members_expansion_screen");
          ee.field_c = p.a((byte) 8, "button_text", ck.field_x, "members_expansion_screen");
          om.field_a = ui.a("button_highlights", ck.field_x, "members_expansion_screen", (byte) 71);
          ck.field_x = null;
          pc.field_e = null;
        }
        this.b((byte) 87);
        if (null == ia.field_z) {
          return;
        }
        this.field_h.e(376, 339);
        this.field_g.e(9, 9);
        ia.field_z.a(0, 0);
        if (null != ml.field_c) {
          ml.field_c.e(9, 257);
          ml.field_c.c(558, 257);
          if (bj.field_y > 257 &&
            bj.field_y < 290) {
            var2Lifetime2 = 40 + (40 * vl.a(this.field_m << 4, -124) >> 16);
            if (var2Lifetime2 > 0) {
              if (dh.field_d > 9 &&
                dh.field_d < 82) {
                ml.field_c.c(8, 256, var2Lifetime2);
                ml.field_c.c(10, 256, var2Lifetime2);
                ml.field_c.c(8, 258, var2Lifetime2);
                ml.field_c.c(10, 258, var2Lifetime2);
              } else {
                if (dh.field_d > 558 &&
                  dh.field_d < 631) {
                  ml.field_c.e();
                  ml.field_c.c(557, 256, var2Lifetime2);
                  ml.field_c.c(559, 256, var2Lifetime2);
                  ml.field_c.c(557, 258, var2Lifetime2);
                  ml.field_c.c(559, 258, var2Lifetime2);
                  ml.field_c.e();
                }
              }
            }
          }
        }
        this.field_c.e(16, 302);
        ac.field_c.a(this.field_d[this.field_i], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
        wf.field_e.e(30, 330);
        ac.field_c.a(lb.field_n[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
        ac.field_c.a(lb.field_n[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
        ac.field_c.a(lb.field_n[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
        ee.field_c.e(508 + (127 - ee.field_c.field_A) / 2, 315);
        if (this.field_a.field_h == 0) {
          om.field_a[0].e(508, 299);
        } else {
          if (this.field_a.field_h == 1) {
            om.field_a[1].e(508, 387);
          }
        }
    }

    final int a(byte param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        var6 = EscapeVector.field_A;
        this.field_e = this.field_e + 65536;
        while (fg.a(false, this.field_e, jn.field_a) >= 65536) {
          this.field_m = this.field_m + 1;
          this.field_e = this.field_e - jn.field_a;
        }
        var3 = -1;
        if (param0 != 23) {
          return 103;
        }
        if (this.field_b != null) {
          var3 = this.field_b.length;
        }
        if (var3 != -1) {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_l < jn.field_e) {
            this.field_l = this.field_l + 1;
            if (this.field_l > jn.field_c && (this.field_b == null ||
              null == this.field_b[this.field_i])) {
              this.field_l = this.field_l - 1;
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_l >= jn.field_e &&
                null == this.field_b[(1 + this.field_i) % var3]) {
                this.field_l = this.field_l - 1;
              }
            }
          }
          if (this.field_l >= jn.field_e) {
            this.field_j = this.field_i;
            this.field_l = this.field_l - jn.field_e;
            if (this.field_n) {
              this.field_i = this.field_i + 1;
              if (var3 <= this.field_i) {
                this.field_i = this.field_i - var3;
              }
            } else {
              this.field_i = this.field_i - 1;
              if (0 > this.field_i) {
                this.field_i = this.field_i + var3;
              }
            }
          }
          if (jn.field_c < this.field_l) {
            this.field_n = true;
          }
        }
        if (null != ml.field_c) {
          var4 = 0;
          if (qi.field_N != 0 &&
            ng.field_ob > 257 &&
            ng.field_ob < 290) {
            if (sf.field_c > 9 &&
              82 > sf.field_c) {
              var4 = 1;
              this.field_l = jn.field_e;
              this.field_n = false;
            }
            if (sf.field_c > 558 &&
              sf.field_c < 631) {
              this.field_n = true;
              var4 = 1;
              this.field_l = jn.field_e;
            }
          }
          if (var4 == 0 &&
            this.field_l > jn.field_c &&
            ng.field_ob > 257 &&
            290 > ng.field_ob) {
            if (dh.field_d > 9 &&
              dh.field_d < 82) {
              this.field_l = jn.field_c;
            }
            if (558 < dh.field_d &&
              dh.field_d < 631) {
              this.field_l = jn.field_c;
            }
          }
        }
        if (!param1) {
          return 0;
        }
        this.field_a.a(this.a(sf.field_c, ng.field_ob, -16311), (byte) 122, this.a(dh.field_d, bj.field_y, -16311));
        var4Lifetime1 = 0;
        if (this.field_a.b((byte) -18)) {
          if (this.field_a.field_h == 0) {
            var4Lifetime1 = 1;
          }
          if (1 == this.field_a.field_h) {
            return 2;
          }
        }
        if (rf.field_b) {
          while (pn.p(-71)) {
            var5 = this.a(false);
            if (var5 == 0) {
              continue;
            }
            return var5;
          }
        }
        if (var4Lifetime1 == 0) {
          return 0;
        }
        this.b(true);
        return 3;
    }

    private final int a(boolean param0) {
        this.field_a.c((byte) 6);
        if (param0) {
          int[] var3 = (int[]) null;
          this.a((wl) null, 9, 97, -25, 47, 28, (String) null, (int[]) null);
        }
        if (this.field_a.b((byte) -18)) {
          if (this.field_a.field_h == 0) {
            this.b(true);
            return 3;
          }
          if (this.field_a.field_h == 1) {
            return 1;
          }
        }
        if (nk.field_n == 13) {
          return 1;
        }
        return 0;
    }

    final static ed a(String param0, mf param1, String param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ed stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.b(-1, param0);
          var5 = param1.a(var4_int, param2, param3);
          stackIn_1_0 = ul.a(var4_int, var5, param1, (byte) 9);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("fe.F(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 != -83) {
          field_k = 94;
        }
        ol.field_E = new bf();
        rd.field_c.a(ol.field_E, 30);
    }

    private final void b(int param0) {
        te var2;
        int var3;
        int var4;
        int var5;
        te var6;
        te var7;
        te var2Lifetime1;
        var5 = EscapeVector.field_A;
        if (this.field_b == null) {
          if (ac.field_c == null) {
            return;
          }
          ac.field_c.a(um.field_a, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
          return;
        }
        var6 = this.field_b[this.field_i];
        var2 = var6;
        if (var2 != null) {
          var6.a(9, 58);
        } else {
          if (null != ac.field_c) {
            ac.field_c.a(um.field_a, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
          }
        }
        if (param0 > -109) {
          return;
        }
        if (jn.field_c > this.field_l) {
          var7 = this.field_b[this.field_j];
          var2Lifetime1 = var7;
          if (var2Lifetime1 != null) {
            var3 = this.field_l * (var7.field_a + 60) / jn.field_c;
            var4 = -30 + var3;
            if (this.field_n) {
              bb.a(9, (-var4 + var7.field_a) * 256 / 30, 4163, var7, 58, -256 * var4 / 30);
            } else {
              bb.a(9, -256 * var4 / 30, 4163, var2Lifetime1, 58, 256 * (var7.field_a - var4) / 30);
            }
          }
        }
        return;
    }

    final void a(boolean param0, byte param1) {
        this.field_l = jn.field_c;
        if (param1 != 47) {
          this.field_g = (ed) null;
        }
        this.field_m = 0;
        this.field_i = 0;
        this.field_e = 0;
        this.field_a.a(105, param0, this.a(dh.field_d, bj.field_y, -16311), -1);
    }

    private final void a(boolean param0, String[] param1, te[] param2, java.applet.Applet param3, String param4, int param5) {
        RuntimeException runtimeException = null;
        String var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = param3.getParameter("currency");
          if (param5 != 13439) {
            this.field_m = -71;
          }
          if (var7 != null &&
            fk.a(false, (CharSequence) ((Object) var7))) {
            this.field_o = gn.a(16777215, (CharSequence) ((Object) var7));
          } else {
            this.field_o = 2;
          }
          this.field_f = param4;
          this.field_a = new wc(2);
          this.field_d = param1;
          this.field_b = param2;
          if (this.field_b != null &&
            3 <= this.field_b.length) {
            rf.field_b = param0;
            return;
          }
          throw new IllegalArgumentException("");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("fe.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int[] var17 = null;
        int[] var18 = null;
        ed var5 = null;
        String var6 = null;
        String var7 = null;
        if (null == this.field_g) {
          if (mn.field_h == null) {
            return;
          }
          this.field_g = new ed(622, 47);
          eo.a(this.field_g, (byte) -90);
          em.c(0, 0, 622, 47, 4540749, 65793);
          var2 = 16448250;
          var3 = 10068666;
          var17 = ug.a(1746055568, var3, var2);
          this.a(mn.field_h, 0, 0, 47, 622, 0, this.field_f, var17);
          dl.a((byte) 107);
          this.field_c = new ed(475, 24);
          this.a(0, mn.field_h, fd.field_d, 24, 0, this.field_c, -4, 0.75f, var17, 475);
          var18 = ug.a(1746055568, 526344, 526344);
          var5 = new ed(121, 122);
          eo.a(var5, (byte) -40);
          em.c(0, 0, var5.field_s, var5.field_x / 2, 16180917, 16306250);
          if (param0 <= 63) {
            String var8 = (String) null;
            this.a(false, (String[]) null, (te[]) null, (java.applet.Applet) null, (String) null, 46);
          }
          em.c(0, var5.field_x / 2, var5.field_s, var5.field_x, 16306250, 15568919);
          var6 = hm.field_r;
          var7 = mh.field_b;
          this.a(0, mn.field_h, var6, var5.field_x, 0, var5, -16, 0.5f, var18, var5.field_s);
          this.a(0, mn.field_h, var7, var5.field_x, 0, var5, 20, 0.5f, var18, var5.field_s);
          this.a(0, mn.field_h, p.field_f[this.field_o], var5.field_x / 3, 0, var5, -mn.field_h.field_r + (var5.field_x / 2 + 12), 0.699999988079071f, var18, var5.field_s);
          dl.a((byte) -54);
          this.field_h = new ed(121, 122);
          eo.a(this.field_h, (byte) -104);
          var5.c(this.field_h.field_s / 2, this.field_h.field_x / 2, -2048, 4096);
          dl.a((byte) -12);
          return;
        }
    }

    private final void a(wl param0, int param1, int param2, int param3, int param4, int param5, String param6, int[] param7) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = EscapeVector.field_A;
        try {
          hf.a(param2 ^ 26);
          for (var9_int = param1; var9_int < param3; var9_int++) {
            em.f(param5, var9_int, param4, 1 + var9_int);
            var10 = var9_int * param7.length / param3;
            var11 = param7[param7.length + (-var10 - 1)];
            param0.a(param6, param5, param1, param4, param3, var11, -1, 1, 1, 0);
          }
          if (param2 != 0) {
            this.field_d = (String[]) null;
          }
          dl.a((byte) -95);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "fe.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(boolean param0) {
        try {
          ge.a((byte) 53, oc.d((byte) -90));
        } catch (Exception exception) {
          exception.printStackTrace();
        }
        if (!param0) {
          this.b(98);
        }
    }

    final static void a(int param0) {
        fc.a(3161);
        int var1 = -82 % ((param0 + 5) / 57);
        ni.field_F = true;
        eb.field_H = true;
        bo.field_F.l(17415);
        uf.a((byte) 119, fl.field_h, false);
    }

    private final int a(int param0, int param1, int param2) {
        if (ia.field_z == null) {
          return -1;
        }
        if (508 <= param0 && param0 < 635 && param1 >= 299 &&
          386 > param1) {
          return 0;
        }
        if (param0 >= 508 && 635 > param0 && param1 >= 390 &&
          param1 < 475) {
          return 1;
        }
        if (param2 != -16311) {
          fe.a(-110);
        }
        return -1;
    }

    fe(java.applet.Applet param0, String param1, te[] param2, String[] param3) {
        this.field_n = true;
        this.field_e = 0;
        this.field_m = 0;
        try {
          this.a(true, param3, param2, param0, param1, 13439);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "fe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, wl param1, String param2, int param3, int param4, ed param5, int param6, float param7, int[] param8, int param9) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        ed var13 = null;
        try {
          var11_int = (int)((float)param9 / param7);
          var12 = (int)((float)param3 / param7);
          var13 = new ed(var11_int, var12);
          eo.a(var13, (byte) -125);
          param5.b((int)((float)(-param4) / param7), (int)((float)(-param6) / param7), (int)((float)param5.field_s / param7), (int)((float)param5.field_x / param7));
          this.a(param1, param0, 0, var12, var11_int, 0, param2, param8);
          dl.a((byte) -81);
          eo.a(param5, (byte) -105);
          var13.a(param4, param6, param9, param3);
          dl.a((byte) 123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_4_0 = var11;
          stackIn_4_1 = new StringBuilder().append("fe.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param9).append(')').toString());
        }
    }

    static {
    }
}
